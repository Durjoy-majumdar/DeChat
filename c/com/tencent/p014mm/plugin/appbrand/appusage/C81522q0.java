package com.tencent.p014mm.plugin.appbrand.appusage;

import android.os.Bundle;
import com.tencent.p014mm.plugin.appbrand.p026ui.recents.C84637i0;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.q0 */
public final class C81522q0 extends C84637i0<LocalUsageInfo> {
    public C81522q0(List<LocalUsageInfo> list, List<LocalUsageInfo> list2) {
        super(m100012f(list), m100012f(list2));
    }

    /* renamed from: f */
    public static <T> ArrayList<T> m100012f(List<T> list) {
        if (list instanceof ArrayList) {
            return (ArrayList) list;
        }
        if (Util.isNullOrNil((List) list)) {
            return new ArrayList<>(0);
        }
        ArrayList<T> arrayList = new ArrayList<>(list.size());
        arrayList.addAll(list);
        return arrayList;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        return Util.nullAsNil(((LocalUsageInfo) this.f246940a.get(i)).f239046j).equals(((LocalUsageInfo) this.f246941b.get(i2)).f239046j);
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        LocalUsageInfo localUsageInfo = (LocalUsageInfo) this.f246940a.get(i);
        LocalUsageInfo localUsageInfo2 = (LocalUsageInfo) this.f246941b.get(i2);
        return Util.nullAsNil(localUsageInfo.f239040d).equals(localUsageInfo2.f239040d) && localUsageInfo.f239042f == localUsageInfo2.f239042f;
    }

    /* renamed from: c */
    public Object mo11467c(int i, int i2) {
        if (i >= this.f246940a.size()) {
            return null;
        }
        Bundle bundle = new Bundle();
        try {
            LocalUsageInfo localUsageInfo = (LocalUsageInfo) this.f246940a.get(i);
            LocalUsageInfo localUsageInfo2 = (LocalUsageInfo) this.f246941b.get(i2);
            if (!Util.nullAsNil(localUsageInfo.f239046j).equals(localUsageInfo2.f239046j)) {
                bundle.putString("icon", localUsageInfo2.f239046j);
            }
            if (!Util.nullAsNil(localUsageInfo.f239044h).equals(localUsageInfo2.f239044h)) {
                bundle.putString("nick_name", localUsageInfo2.f239044h);
            }
        } catch (Exception unused) {
            bundle.clear();
        }
        if (bundle.size() <= 0) {
            return null;
        }
        return bundle;
    }
}
