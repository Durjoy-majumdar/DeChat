package com.tencent.p014mm.plugin.appbrand.appcache;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81412d0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.InputStream;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.AssetReader */
public final class AssetReader extends AbsReader {
    public static final Parcelable.Creator<AssetReader> CREATOR = new C81209a();

    /* renamed from: j */
    public static final AssetReader f238551j = new AssetReader();

    /* renamed from: i */
    public final WxaPkgWrappingInfo[] f238552i;

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.AssetReader$a */
    public class C81209a implements Parcelable.Creator<AssetReader> {
        public Object createFromParcel(Parcel parcel) {
            return new AssetReader(parcel, (C81209a) null);
        }

        public Object[] newArray(int i) {
            return new AssetReader[i];
        }
    }

    public /* synthetic */ AssetReader(Parcel parcel, C81209a aVar) {
        this(parcel);
    }

    /* renamed from: c */
    public IPkgInfo mo113379c() {
        WxaPkgWrappingInfo[] wxaPkgWrappingInfoArr = this.f238552i;
        WxaPkgWrappingInfo wxaPkgWrappingInfo = wxaPkgWrappingInfoArr[0];
        if (wxaPkgWrappingInfo == null) {
            synchronized (wxaPkgWrappingInfoArr) {
                WxaPkgWrappingInfo[] wxaPkgWrappingInfoArr2 = this.f238552i;
                WxaPkgWrappingInfo wxaPkgWrappingInfo2 = new WxaPkgWrappingInfo();
                wxaPkgWrappingInfo2.f238587f = true;
                wxaPkgWrappingInfo2.f238585d = 0;
                wxaPkgWrappingInfo2.pkgVersion = C81352s2.f238828a;
                wxaPkgWrappingInfo2.md5 = "";
                wxaPkgWrappingInfoArr2[0] = wxaPkgWrappingInfo2;
                wxaPkgWrappingInfo = this.f238552i[0];
            }
        }
        return wxaPkgWrappingInfo;
    }

    public void close() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: g */
    public AssetFileDescriptor mo113382g(String str) {
        int i = C81352s2.f238828a;
        String b = C81412d0.m99868b(str, true);
        if (b.endsWith(".js")) {
            b = b + ".nocompress";
        }
        AssetManager assets = MMApplicationContext.getContext().getAssets();
        try {
            if (C81352s2.f238830c.ordinal() != 0) {
                return assets.openFd("wxa_library" + b);
            }
            return assets.openFd("wxa_library/develop" + b);
        } catch (Exception unused) {
            return null;
        }
    }

    public InputStream openRead(String str) {
        int i = C81352s2.f238828a;
        String b = C81412d0.m99868b(str, true);
        if (C81352s2.f238830c.ordinal() != 0) {
            return C81352s2.m99774c("wxa_library" + b);
        }
        return C81352s2.m99774c("wxa_library/develop" + b);
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "AssetReader[%d][%s]", new Object[]{Integer.valueOf(mo113371a()), mo113377i()});
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public AssetReader() {
        this.f238552i = new WxaPkgWrappingInfo[]{null};
    }

    private AssetReader(Parcel parcel) {
        this();
    }
}
