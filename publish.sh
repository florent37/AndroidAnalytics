./gradlew clean
./gradlew :androidanalytics:assembleDebug
./gradlew :androidanalytics:install :androidanalytics:bintrayUpload
./gradlew :androidanalytics-google:assembleDebug
./gradlew :androidanalytics-google:install :androidanalytics-google:bintrayUpload
