package io.github.mohamedisoliman.nytopstories.data.local

import io.github.mohamedisoliman.nytopstories.data.model.Story


class LocalNyTimes(private val database: TopStoriesDatabase) : LocalNyTimesContract {

    override suspend fun retrieveBookmarks(): List<Story> {
        return database.topStoriesDao().bookmarks()
    }

    override suspend fun bookmark(story: Story): Int? =
        database.topStoriesDao().addStory(story).toInt()


    override suspend fun retrieveBookmark(title: String): Story? =
        database.topStoriesDao().retrieveStory(title)

    override suspend fun deleteBookmark(title: String) =
        database.topStoriesDao().deleteStory(title)


}