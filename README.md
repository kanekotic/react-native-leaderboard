# ![logomakr_3saloo](https://user-images.githubusercontent.com/3071208/44545145-8eb1c680-a714-11e8-9bb1-71a0e2b54f2d.png)


## Getting started

`npm install react-native-leaderboard --save` or `yarn add react-native-leaderboard`

### Mostly automatic installation

`$ react-native link react-native-leaderboard`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.kanekotic.reactnativeleaderboard.LeaderboardPackage;` to the imports at the top of the file
  - Add `new LeaderboardPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-leaderboard'
  	project(':react-native-leaderboard').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-leaderboard/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-leaderboard')
  	```


## Usage
```javascript
import Leaderboard from 'react-native-leaderboard';

// TODO: What to do with the module?
Leaderboard;
```
##### Check out the new logo that I created on <a href="http://logomakr.com" title="Logo Makr">LogoMakr.com</a> https://logomakr.com/3JN8ql