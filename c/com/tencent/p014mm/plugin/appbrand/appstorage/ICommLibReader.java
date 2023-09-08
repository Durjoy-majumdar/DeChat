package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.appcache.C81281k0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.Closeable;
import p224ra.C12964b;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader */
public interface ICommLibReader extends C81281k0, C12964b, Comparable<ICommLibReader>, Parcelable, Closeable {

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader$b */
    public static class C29316b {
        /* renamed from: a */
        public static ICommLibReader m38623a(Parcel parcel) {
            String readString = parcel.readString();
            if (TextUtils.isEmpty(readString)) {
                return null;
            }
            try {
                return (ICommLibReader) parcel.readParcelable(Class.forName(readString).getClassLoader());
            } catch (Exception e) {
                Log.m105921e("Luggage.WXA.ICommLibReader.ParcelHelper", "readFromParcel e=%s", e);
                return null;
            }
        }

        /* renamed from: b */
        public static void m38624b(ICommLibReader iCommLibReader, Parcel parcel, int i) {
            if (iCommLibReader == null) {
                parcel.writeString((String) null);
                return;
            }
            parcel.writeString(iCommLibReader.getClass().getName());
            parcel.writeParcelable(iCommLibReader, i);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader$a */
    public static class C81403a extends RuntimeException {
    }

    String Yk0(String str);

    /* renamed from: ld */
    String mo113378ld();
}
