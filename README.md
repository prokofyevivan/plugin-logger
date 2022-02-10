# Pluto Logger Plugin

**Pluto Logger** is a [**Pluto**](https://github.com/plutolib/pluto) plugin to manage and share your Debug logs. It also comes with [Timber](https://github.com/JakeWharton/timber) support.

## 🖇 Integrate plugin in your application

### Add Gradle Dependencies
Pluto logger is distributed through [***mavenCentral***](https://search.maven.org/artifact/com.plutolib.plugins/logger). To use it, you need to add the following Gradle dependency to your build.gradle file of you android app module.

```groovy
dependencies {
  debugImplementation 'com.plutolib.plugins:logger:1.0.0'
}
```

### Install plugin to Pluto

Now to start using Pluto Logger, install the plugin to Pluto
```kotlin
Pluto.Installer(this)
  .addPlugin(PlutoLoggerPlugin("logger"))
  .install()
```

###  Add Pluto Logs

Pluto allows you to log and persist the user journey through the app, and help debug them without any need to connect to Logcat.

- **with PlutoLog**
```kotlin
PlutoLog.event("analytics", eventName, HashMap(attributes))
PlutoLog.d("debug_log", "button clicked")
PlutoLog.e("error_log", "api call falied with http_status 400")
PlutoLog.w("warning_log", "warning log")
PlutoLog.i("info_log", "api call completed")
```

- **with Timber**
```kotlin
Timber.tag("analytics").event(eventName, HashMap(attributes))
Timber.tag("debug_log").d("button clicked")
Timber.tag("error_log").e(NullPointerException("demo"), "api call falied with http_status 400")
Timber.tag("warning_log").w(NullPointerException("demo"), "warning log")
Timber.i("api call completed")
```

But if you are connected to Logcat, PlutoLogs behave similar to Log class, with an improvement to tag the method and file name also. In Logcat, PlutoLogs will look like the following.
```
D/onClick(MainActivity.kt:40) | debug_log: button clicked
E/onFailure(NetworkManager.kt:17) | error_log: api call falied with http_status 400
```

🎉 You are all done!

Now re-build and run your app and open Pluto, you will see the Pluto Logger plugin installed.





## 📝 Contribution

**We're looking for contributors to help us improve Pluto.** 😁

Please refer to your [`Contribution guidelines`](/CONTRIBUTING.md) to get started.





## 📃 License

```
Copyright 2021 Plutolib.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
