# LogCat_Debug
A Logcat Dependancy for android

build.gradle in app module
dependencies {
	        implementation 'com.github.Yashsopariya1308:LogCat_Debug:0.1.1'
	}
  
  build.gradle in project module
  repositories {
			...
			maven { url 'https://jitpack.io' }
		}
