package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.tencent.mapsdk.internal.rt */
public final class C114183rt {

    /* renamed from: a */
    public final int f341850a;

    /* renamed from: b */
    public final int f341851b;

    /* renamed from: c */
    private final String f341852c = "_night";

    /* renamed from: d */
    private final List<C114194rz> f341853d;

    public C114183rt(int i, int i2, List<C114194rz> list) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f341853d = copyOnWriteArrayList;
        this.f341850a = i;
        this.f341851b = i2;
        copyOnWriteArrayList.addAll(list);
        Collections.sort(list, new Comparator<C114194rz>() {
            /* renamed from: a */
            private static int m159524a(C114194rz rzVar, C114194rz rzVar2) {
                return rzVar2.mo172842a() - rzVar.mo172842a();
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((C114194rz) obj2).mo172842a() - ((C114194rz) obj).mo172842a();
            }
        });
    }

    /* renamed from: b */
    private int m159522b() {
        return this.f341851b;
    }

    /* renamed from: a */
    public final Object[] mo172825a(C113740fv fvVar, boolean z) {
        String str;
        for (C114194rz next : this.f341853d) {
            if (next.mo172844a(fvVar)) {
                Bitmap a = next.mo172843a(z);
                StringBuilder sb = new StringBuilder();
                sb.append(next.f341898c);
                sb.append(z ? "_night" : "");
                String sb4 = sb.toString();
                if (!z || (str = next.f341900e) == null || str.length() <= 0) {
                    return new Object[]{sb4, next.f341899d, a};
                }
                return new Object[]{sb4, next.f341900e, a};
            }
        }
        return null;
    }

    /* renamed from: a */
    private int m159521a() {
        return this.f341850a;
    }
}
