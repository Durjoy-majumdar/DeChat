package com.tencent.p014mm.plugin.wepkg.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.wepkg.event.C44478c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify */
public class ForceUpdateNotify implements Parcelable {

    /* renamed from: e */
    public static Set<String> f120603e = new HashSet();

    /* renamed from: d */
    public String[] f120604d;

    /* renamed from: com.tencent.mm.plugin.wepkg.event.ForceUpdateNotify$a */
    public class C44475a implements C44478c.C44480b {
    }

    public ForceUpdateNotify(String[] strArr) {
        this.f120604d = strArr;
    }

    /* renamed from: a */
    public static void m48830a() {
        if (((HashSet) f120603e).size() != 0) {
            Set<String> set = f120603e;
            C44478c.m48834a(new ForceUpdateNotify((String[]) set.toArray(new String[((HashSet) set).size()])), new C44475a());
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.f120604d);
    }
}
