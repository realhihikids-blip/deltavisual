# DELTA VISUALS — Stage 1

Foundation for a client-side Fabric mod targeting Minecraft Java Edition 1.21.11.

## Requirements
- JDK 21
- IntelliJ IDEA (Community Edition is sufficient)
- Internet access for Gradle to download Minecraft/Fabric dependencies

## Open in IntelliJ IDEA
1. Extract the ZIP.
2. Open the `DELTA-VISUALS` directory (the directory containing `settings.gradle`).
3. Allow IntelliJ to import the Gradle project.
4. Set Gradle JVM to JDK 21 in Settings → Build Tools → Gradle.
5. Wait for dependency resolution.

## Build
If you have Gradle installed:
- Windows: `gradle build`
- macOS/Linux: `gradle build`

The output JAR will be in `build/libs/`.

A Gradle Wrapper is not bundled in this starter archive. After importing, you can generate it with an installed Gradle using `gradle wrapper --gradle-version 8.14.3`, then use `gradlew.bat build` on Windows or `./gradlew build` on macOS/Linux.

## Run a development client
Once the project syncs successfully, use IntelliJ's Gradle task panel and run `runClient` under Tasks → fabric.

This is only the project foundation. The ClickGUI, modules, configuration system, HUD and markers are intentionally scheduled for later stages.
