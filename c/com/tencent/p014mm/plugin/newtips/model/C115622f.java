package com.tencent.p014mm.plugin.newtips.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.plugin.newtips.model.f */
public class C115622f {

    /* renamed from: a */
    public static Map<Integer, C115625j> f346845a;

    /* renamed from: b */
    public static Map<Integer, C115630m> f346846b;

    /* renamed from: c */
    public static C115622f f346847c;

    public C115622f() {
        f346845a = new HashMap();
        f346846b = new HashMap();
    }

    /* renamed from: a */
    public static C115625j m162564a(int i) {
        if (f346847c == null) {
            f346847c = new C115622f();
        }
        f346847c.getClass();
        C115625j jVar = (C115625j) ((HashMap) f346845a).get(Integer.valueOf(i));
        if (jVar != null) {
            return jVar;
        }
        Log.m105925i("MicroMsg.NewTips.NewTipsFilterPool", "Invalid tipsId:%s", Integer.valueOf(i));
        return null;
    }
}
