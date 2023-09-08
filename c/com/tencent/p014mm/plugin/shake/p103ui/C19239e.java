package com.tencent.p014mm.plugin.shake.p103ui;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import gc0.C20828a;
import hc0.C20937c;
import java.util.ArrayList;
import java.util.Iterator;
import nn2.C34935h;
import nn2.C34936i;
import nn2.C76942m;
import p823sg.C90193h;

/* renamed from: com.tencent.mm.plugin.shake.ui.e */
public class C19239e {
    /* renamed from: a */
    public static String m20383a() {
        C34936i Ax0 = C76942m.Ax0();
        Ax0.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = Ax0.f93791d.rawQuery("SELECT * FROM " + Ax0.getTableName() + " where status != " + 1, (String[]) null, 2);
        if (rawQuery != null) {
            while (rawQuery.moveToNext()) {
                C34935h hVar = new C34935h();
                hVar.convertFrom(rawQuery);
                arrayList.add(hVar);
            }
            rawQuery.close();
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((C34935h) it.next()).field_reserved1);
            sb.append("|");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static void m20384b(ImageView imageView, String str, int i, boolean z) {
        String str2;
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) null);
            if (!Util.isNullOrNil(str)) {
                C20937c.C20939b bVar = new C20937c.C20939b();
                if (C97625j3.m125811a()) {
                    str2 = String.format("%s/Sk_%s", new Object[]{C97625j3.m125812b().mo105893h(), C90193h.m112878f(str.getBytes())});
                } else {
                    str2 = "";
                }
                bVar.f59350f = str2;
                bVar.f59346b = true;
                bVar.f59363s = true;
                bVar.f59364t = z;
                if (i != 0) {
                    bVar.f59361q = i;
                }
                C20828a.m22825b().mo32519h(str, imageView, bVar.mo32666a());
            }
        }
    }
}
