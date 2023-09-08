package com.tencent.kinda.gen;

public final class LocationInfoStruct {
    public String mCity;
    public String mDistrict;
    public String mProvince;

    public LocationInfoStruct() {
    }

    public LocationInfoStruct(String str, String str2, String str3) {
        this.mProvince = str;
        this.mCity = str2;
        this.mDistrict = str3;
    }

    public String getCity() {
        return this.mCity;
    }

    public String getDistrict() {
        return this.mDistrict;
    }

    public String getProvince() {
        return this.mProvince;
    }

    public String toString() {
        return "LocationInfoStruct{mProvince=" + this.mProvince + ",mCity=" + this.mCity + ",mDistrict=" + this.mDistrict + "}";
    }
}
