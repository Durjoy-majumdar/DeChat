package com.tencent.p014mm.vfs;

import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Parcel;
import com.tencent.p014mm.vfs.SchemeResolver;
import java.util.Map;

/* renamed from: com.tencent.mm.vfs.SingletonSchemeResolver */
public abstract class SingletonSchemeResolver implements SchemeResolver, SchemeResolver.C116250a {
    /* renamed from: a */
    public void mo177749a(CancellationSignal cancellationSignal) {
    }

    /* renamed from: c */
    public Uri mo177659c(C116328u0 u0Var, Uri uri) {
        if (mo177604b(u0Var, uri) == null) {
            return null;
        }
        return uri;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    /* renamed from: v */
    public Object mo177578v(Map map) {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
