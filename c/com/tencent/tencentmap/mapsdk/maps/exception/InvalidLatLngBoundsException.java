package com.tencent.tencentmap.mapsdk.maps.exception;

public class InvalidLatLngBoundsException extends RuntimeException {
    public InvalidLatLngBoundsException(int i) {
        super("Cannot create a LatLngBounds from " + i + " items");
    }
}
