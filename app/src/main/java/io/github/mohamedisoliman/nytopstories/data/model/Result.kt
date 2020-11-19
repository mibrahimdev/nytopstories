package io.github.mohamedisoliman.nytopstories.data.model

data class Result(
    val `abstract`: String? = "",
    val byline: String? = "",
    val created_date: String? = "",
    val des_facet: List<String>? = listOf(),
    val geo_facet: List<String>? = listOf(),
    val item_type: String? = "",
    val kicker: String? = "",
    val material_type_facet: String? = "",
    val multimedia: List<Multimedia>? = listOf(),
    val org_facet: List<String>? = listOf(),
    val per_facet: List<String>? = listOf(),
    val published_date: String? = "",
    val section: String? = "",
    val short_url: String? = "",
    val subsection: String? = "",
    val title: String? = "",
    val updated_date: String? = "",
    val uri: String? = "",
    val url: String? = ""
)