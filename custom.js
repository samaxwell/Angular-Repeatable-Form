angular.module('MyApp', [])
.controller('MyCtrl', [function() {
    var self = this;

    self.message = "Howdy!"

    self.messages = [
        {from: 'Sean' , message: 'Whats up'},
        {from: 'Katie' , message: 'Hello again'},
        {from: 'Mom' , message: 'Hi from mom'}
    ]


    self.addMessage = function() {
        self.messages.push({from: '', message: ''});
    }

    /* */
    self.getDetails = function(item) {
        if (self.messages.indexOf(item) == (self.messages.length-1)) {
            self.messages.push({from: '', message: ''});
        }
        else {
            self.messages.splice(self.messages.indexOf(item), 1);
        }
    }
}]);