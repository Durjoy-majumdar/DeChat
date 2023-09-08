package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.IPkgInfo */
public interface IPkgInfo extends Parcelable {
    String checksumMd5();

    long lastModified();

    String pkgPath();

    int pkgVersion();
}
