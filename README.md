# fivechess_event

修改 build.gradle

allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
增加依赖

dependencies {
       implementation 'com.github.hellojinjie:fivechess_event:1.0'
}
