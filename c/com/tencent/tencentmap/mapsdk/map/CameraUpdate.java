package com.tencent.tencentmap.mapsdk.map;

public class CameraUpdate {
    private final CameraParameter camerPara;

    public CameraUpdate(CameraParameter cameraParameter) {
        this.camerPara = cameraParameter;
    }

    public CameraParameter getParams() {
        return this.camerPara;
    }
}
