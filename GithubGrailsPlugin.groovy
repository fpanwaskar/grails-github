class GithubGrailsPlugin {
    // the plugin version
    def version = "0.1"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.3.7 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
	def pluginExcludes = [
		'grails-app/domain/**',
	    'grails-app/views/error.gsp',
		'docs/**'
	]

    def author = "Feroz Panwaskar"
    def authorEmail = "feroz.panwaskar@gmail.com"
    def title = "Github support for grails"
    def description = '''\\
Plugin to wrap any github support required for grails apps/plugins.
'''
    def documentation = "http://grails.org/plugin/github"
}
