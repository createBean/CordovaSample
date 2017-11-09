cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
  {
    "id": "toast-plugin.MyToast",
    "file": "plugins/toast-plugin/www/toast-plugin.js",
    "pluginId": "toast-plugin",
    "clobbers": [
      "MyToast"
    ]
  },
  {
    "id": "phonegap-plugin-barcodescanner.BarcodeScanner",
    "file": "plugins/phonegap-plugin-barcodescanner/www/barcodescanner.js",
    "pluginId": "phonegap-plugin-barcodescanner",
    "clobbers": [
      "cordova.plugins.barcodeScanner"
    ]
  }
];
module.exports.metadata = 
// TOP OF METADATA
{
  "cordova-plugin-whitelist": "1.3.2",
  "toast-plugin": "1.0.0",
  "phonegap-plugin-barcodescanner": "4.0.1"
};
// BOTTOM OF METADATA
});