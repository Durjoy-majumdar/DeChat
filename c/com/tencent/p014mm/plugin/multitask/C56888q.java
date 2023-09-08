package com.tencent.p014mm.plugin.multitask;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import gy3.C87412m;
import hc0.C20937c;

/* renamed from: com.tencent.mm.plugin.multitask.q */
public final class C56888q {

    /* renamed from: a */
    public static final C56888q f162957a = new C56888q();

    /* renamed from: b */
    public static final C20937c f162958b;

    static {
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59345a = true;
        bVar.f59353i = 1;
        bVar.f59356l = Bitmap.Config.RGB_565;
        f162958b = bVar.mo32666a();
    }

    /* renamed from: a */
    public final String mo80310a(MultiTaskInfo multiTaskInfo) {
        String str = multiTaskInfo != null ? multiTaskInfo.field_id : null;
        if (str == null) {
            str = "";
        }
        return mo80311b(str);
    }

    /* renamed from: b */
    public final String mo80311b(String str) {
        C87412m.m108594g(str, "id");
        StringBuilder sb = new StringBuilder();
        String str2 = C4897r.f20014a;
        sb.append(C4897r.f20014a);
        sb.append(str);
        return sb.toString();
    }
}
