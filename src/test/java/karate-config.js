function fn() {

    var port = karate.properties['local.server.port'];
    var config = {
        baseUrl : 'http://localhost:' + port
    };

    if(!port) {
        karate.log(' ------- Local port not found -------');

    } else {
        karate.log('------- base url is : ' + config.baseUrl + '--------');
    }
    return config;
}