angular.module('MyApp', [])
.controller('MyCtrl', ['$http', function($http) {
    var self = this;

    self.messages = [ ]

    /* Populate messages array from Server */
    $http.get('http://localhost:8080/api/message/all').then(
        function(response) {
                self.messages = response.data;
        },
        function(errResponse) {
            console.error('Error fetching messages :\'(')
            self.messages = [
                {from: 'Sean', message: 'Failed to get messages'}
            ]
        }
    );


    /* Add or Remove lines in the form. */
    self.addOrRemoveMessage = function(item) {
        if (self.messages.indexOf(item) == (self.messages.length-1)) {
            self.messages.push({from: '', message: ''});
        }
        else {
            self.messages.splice(self.messages.indexOf(item), 1);
        }
    }


    self.submit = function() {
        $http.post('http://localhost:8080/api/message/add', 
                   self.messages
        )
        .then(
            // Do something... confirm success ?
        );
    }
}]);