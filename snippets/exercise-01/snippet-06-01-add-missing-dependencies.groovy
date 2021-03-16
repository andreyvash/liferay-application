dependencies {
	compileOnly group: "com.liferay", name: "com.liferay.petra.lang"
	compileOnly group: "com.liferay", name: "com.liferay.petra.string"
	compileOnly group: "com.liferay", name: "com.liferay.portal.aop.api"
	compileOnly group: "com.liferay.portal", name: "com.liferay.portal.kernel"
	compileOnly group: "org.osgi", name: "org.osgi.annotation.versioning"
	compileOnly group: "org.osgi", name: "org.osgi.core"
	compileOnly group: "org.osgi", name: "org.osgi.service.component.annotations"
	compileOnly project(":modules:gradebook:gradebook-api")
}

buildService {
	apiDir = "../gradebook-api/src/main/java"
}

group = "com.liferay.training.gradebook"