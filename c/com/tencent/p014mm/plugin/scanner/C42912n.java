package com.tencent.p014mm.plugin.scanner;

import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C87412m;
import java.util.ArrayList;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.scanner.n */
public final class C42912n {

    /* renamed from: a */
    public static final C42912n f116194a = new C42912n();

    /* renamed from: a */
    public final void mo67103a(long j, int i, ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean, long j2, int i2, int i3) {
        String str;
        String str2;
        ImageQBarDataBean imageQBarDataBean2 = imageQBarDataBean;
        C87412m.m108594g(arrayList, "dataList");
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[15];
        int i4 = 0;
        objArr[0] = Long.valueOf(j);
        boolean z = true;
        objArr[1] = Integer.valueOf(arrayList.size());
        String str3 = "";
        if (arrayList.isEmpty()) {
            str = str3;
        } else {
            StringBuilder sb = new StringBuilder();
            int i5 = 0;
            for (T next : arrayList) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    ImageQBarDataBean imageQBarDataBean3 = (ImageQBarDataBean) next;
                    if (i5 != 0) {
                        sb.append("#");
                    }
                    sb.append(imageQBarDataBean3.f273113d);
                    i5 = i6;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            str = sb.toString();
            C87412m.m108593f(str, "sb.toString()");
        }
        objArr[2] = str;
        if (arrayList.isEmpty()) {
            str2 = str3;
        } else {
            StringBuilder sb4 = new StringBuilder();
            int i7 = 0;
            for (T next2 : arrayList) {
                int i8 = i7 + 1;
                if (i7 >= 0) {
                    ImageQBarDataBean imageQBarDataBean4 = (ImageQBarDataBean) next2;
                    if (i7 != 0) {
                        sb4.append("#");
                    }
                    sb4.append(imageQBarDataBean4.f273122p);
                    i7 = i8;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            str2 = sb4.toString();
            C87412m.m108593f(str2, "sb.toString()");
        }
        objArr[3] = str2;
        objArr[4] = Integer.valueOf(i);
        String str4 = imageQBarDataBean2 != null ? imageQBarDataBean2.f273113d : null;
        if (str4 == null) {
            str4 = str3;
        }
        objArr[5] = str4;
        objArr[6] = Integer.valueOf(imageQBarDataBean2 != null ? imageQBarDataBean2.f273122p : 0);
        objArr[7] = Long.valueOf(j2);
        objArr[8] = str3;
        if (!arrayList.isEmpty()) {
            z = false;
        }
        if (!z) {
            StringBuilder sb5 = new StringBuilder();
            for (T next3 : arrayList) {
                int i9 = i4 + 1;
                if (i4 >= 0) {
                    ImageQBarDataBean imageQBarDataBean5 = (ImageQBarDataBean) next3;
                    if (i4 != 0) {
                        sb5.append("#");
                    }
                    sb5.append(imageQBarDataBean5.f273116g);
                    i4 = i9;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            str3 = sb5.toString();
            C87412m.m108593f(str3, "sb.toString()");
        }
        objArr[9] = str3;
        objArr[10] = Long.valueOf(System.currentTimeMillis());
        objArr[11] = Integer.valueOf(i2);
        objArr[12] = 0;
        objArr[13] = 0;
        objArr[14] = Integer.valueOf(i3);
        nVar.mo160131h(19332, objArr);
    }

    /* renamed from: b */
    public final void mo67104b(long j, int i, ArrayList<ImageQBarDataBean> arrayList, ImageQBarDataBean imageQBarDataBean, long j2, boolean z, int i2) {
        ArrayList<ImageQBarDataBean> arrayList2 = arrayList;
        C87412m.m108594g(arrayList, "dataList");
        mo67103a(j, i, arrayList, imageQBarDataBean, j2, z ? 2 : 1, i2);
    }

    /* renamed from: c */
    public final void mo67105c(long j, int i, int i2, int i3, String str) {
        C87412m.m108594g(str, "url");
        C115669n.INSTANCE.mo160131h(23040, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
    }
}
