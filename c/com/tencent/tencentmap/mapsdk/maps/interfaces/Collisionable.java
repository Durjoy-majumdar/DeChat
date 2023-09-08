package com.tencent.tencentmap.mapsdk.maps.interfaces;

public interface Collisionable {
    boolean isCollisionBy(Collision collision);

    void setCollisions(Collision... collisionArr);
}
