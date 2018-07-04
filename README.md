# RESTful MBTA Web Service
Simple Rest Service using SpringBoot that aggregates MBTA RESTful API

## MABTA Rest points that is being used
- https://api-v3.mbta.com/stops?filter[latitude]={latitude}&filter[longitude]={longitude}&filter[radius]=0.002
- https://api-v3.mbta.com/schedules?filter[stop]={stop}&filter[min_time]={min}&filter[max_time]={max}
- https://api-v3.mbta.com/routes/{route_id}
- https://api-v3.mbta.com/trips/{trip_id}

## Main API
After starting the SpringBoot application
 /mbta-lookup/lat/{latitude}/long/{longitude}

example : http://localhost:8080/mbta-lookup/lat/42.349/long/-71.082

The application goes and finds all MBTA stops within a .02 mile radius of the given coordinates.
Then it finds all MBTA schedules within next 20 minutes that passes through those stops.
Then it finds Route and Trip details of the Schedule.
Application outputs a data collected in above four calls as a single response.

## Design
Standard MVC pattern (Controller-Service-Modal) classes in appropriate packages.
The class that does logic of REST client to MBTA api is com.harish.mbta.restclient.MbtaV3ApiProxy
It uses Springs RestTemplate class for communication with MBTA server.  A useful website (http://www.jsonschema2pojo.org/)
was used to generate POJO classes for Json objects. Once we get the POJO objects the service class MbtaService
remaps the response from MBTA API objects into a consolidated MbtaInfo class.

## TO DO
- Junits - more Junits needs to be written.
- Better design would be to cache some of the Routes and stops data from MBTA and thus avoid multiple calls.
- Instead of using POJO and Un-marshaling , one could get result as string and use JSonPath library 
- Have used Spring Clouds Feign Client for microservices talking Rest to each other but had some issue with MBTA Api.






