**We're looking for contributors, help us improve Pluto.** 😁 

Hers's how you can help
  - Look for issues marked as [`help wanted`](https://github.com/plutolib/plugin-logger/labels/help%20wanted)
  - While submitting a new PR, make sure tests are all successful. If you think we need any new test, feel free to add new tests.

### Prerequisite

In order to start working on Pluto, you need to fork the project and open it in Android Studio/IntelliJ IDEA.

Before committing we suggest you install the pre-commit hooks with the following command:
```
./gradlew installGitHook
```

This will make sure your code is validated against `ktLint` and `detekt` before every commit.
The command will run automatically before the `clean` task, so you should have the pre-commit hook installed by then.

Before submitting a PR please run:
```
./gradlew build
```
This will build the library and make sure your CI checks will pass.
