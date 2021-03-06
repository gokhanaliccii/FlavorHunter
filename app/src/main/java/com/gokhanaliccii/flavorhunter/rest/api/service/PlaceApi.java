package com.gokhanaliccii.flavorhunter.rest.api.service;

import com.gokhanaliccii.flavorhunter.rest.api.response.base.FoursquareResponse;
import com.gokhanaliccii.flavorhunter.rest.api.response.venue.VenueDetailResponse;
import com.gokhanaliccii.flavorhunter.rest.api.response.venuelist.VenueListResponse;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by gokhan on 28/12/17.
 */

public interface PlaceApi {

    @GET("search")
    Observable<FoursquareResponse<VenueListResponse>> getVenuesByNearby(@Query("near") String near, @Query("query") String placeType);

    @GET("search")
    Observable<FoursquareResponse<VenueListResponse>> getVenuesByLocation(@Query("ll") String latLng, @Query("query") String placeType);

    @GET("{venue_id}")
    Observable<FoursquareResponse<VenueDetailResponse>> getVenueDetail(@Path("venue_id") String venueId);


}
