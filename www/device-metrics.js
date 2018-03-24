/*global cordova, module*/

module.exports = {
    getDpi: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "DeviceDisplayMetrics", "getDpi", []);
    }
};
