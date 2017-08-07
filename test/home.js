var app = angular.module('BotaApp', []);
app.controller('homeCtrl', [function () {
    var self = this;

    self.datacenter = "";
    self.datacenters = ['datacenter 1', 'datacenter 2'];
    self.selectedDatacenter = function (item) {
        self.datacenter = item;
        // alert(self.item);
    }

    self.folder = "";
    self.folders = ['folder 1', 'folder 2'];
    self.selectedFolder = function (item) {
        self.folder = item;
    }

}]);