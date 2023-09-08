package cq0;

import android.webkit.ValueCallback;
import bq0.C79768h;
import c30.C104289g;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import cq0.C86089b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p225rc.C48016e;

/* renamed from: cq0.c */
public final class C86091c {

    /* renamed from: a */
    public final C86089b.C86090a f250574a;

    /* renamed from: b */
    public final C81925i2 f250575b;

    /* renamed from: c */
    public final int f250576c;

    public C86091c(C81925i2 i2Var) {
        this.f250575b = i2Var;
        this.f250576c = -1;
        this.f250574a = null;
    }

    /* renamed from: a */
    public final String mo120514a(String str) {
        C86089b.C86090a aVar = this.f250574a;
        if (aVar == null) {
            return str;
        }
        int i = this.f250576c;
        C79768h hVar = (C79768h) aVar;
        hVar.getClass();
        if (i > 0) {
            hVar.f233771b.evaluateJavascript(String.format(Locale.ENGLISH, "typeof gNodeController != 'undefined' && gNodeController.javaResp(%d, %s);", new Object[]{Integer.valueOf(i), str}), (ValueCallback<String>) null);
        }
        return null;
    }

    /* renamed from: b */
    public String mo120515b(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("ret", Integer.valueOf(i));
        C48016e.m53378d(hashMap);
        return mo120514a(new C104289g((Map) hashMap).toString());
    }

    /* renamed from: c */
    public String mo120516c(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("ret", 0);
        C48016e.m53378d(map);
        return mo120514a(new C104289g((Map) map).toString());
    }

    public C86091c(C81925i2 i2Var, int i, C86089b.C86090a aVar) {
        this.f250574a = aVar;
        this.f250575b = i2Var;
        this.f250576c = i;
    }
}
