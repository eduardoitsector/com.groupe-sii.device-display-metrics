# Cordova Plugin Device Display Metrics

Simple plugin that returns the device display metrics: dpi, etc.

## Using
Create a new Cordova Project

    $ cordova create hello com.example.helloapp Hello

Install the plugin

    $ cd hello
    $ cordova plugin add com.groupe-sii.device-display-metrics

Call the APIs in your project

```js
var success = function(metrics) {
    console.log(metrics);
}

var failure = function() {
    alert('Error calling DeviceDisplayMetrics Plugin');
}

document.addEventListener('deviceready', onDeviceReady);

function onDeviceReady() {
    deviceMetrics.getDpi('', success, failure);
}    
```

Install __iOS__ and/or __Android__ platform

    cordova platform add ios
    cordova platform add android

Run the code

    cordova run

## More Info

For more information on setting up Cordova see [the documentation](http://cordova.apache.org/docs/en/4.0.0/guide_cli_index.md.html#The%20Command-Line%20Interface)

For more info on plugins see the [Plugin Development Guide](http://cordova.apache.org/docs/en/4.0.0/guide_hybrid_plugins_index.md.html#Plugin%20Development%20Guide)
