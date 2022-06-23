package id.ac.polbeng.nursafika.githubprofile.models

import com.google.gson.annotations.SerializedName

data class GithubUser(

	@field:SerializedName("followers")
	val followers: Int,

	@field:SerializedName("avatar_url")
	val avatarUrl: String,

	@field:SerializedName("html_url")
	val htmlUrl: String,

	@field:SerializedName("following")
	val following: Int,

	@field:SerializedName("name")
	val name: Any,

	@field:SerializedName("bio")
	val bio: Any,

	@field:SerializedName("created_at")
	val createdAt: String,

	@field:SerializedName("company")
	val company: Any,

	@field:SerializedName("location")
	val location: Any,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("public_repos")
	val publicRepos: Int,

	@field:SerializedName("email")
	val email: String
)
