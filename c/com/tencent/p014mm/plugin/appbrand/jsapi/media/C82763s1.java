package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Intent;
import com.tencent.p014mm.vfs.C86013q1;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.s1 */
public class C82763s1 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ String[] f242093a;

    /* renamed from: b */
    public final /* synthetic */ C82766t1 f242094b;

    public C82763s1(C82766t1 t1Var, String[] strArr) {
        this.f242094b = t1Var;
        this.f242093a = strArr;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        if (this.f242094b.f242098g != i) {
            return false;
        }
        String[] strArr = this.f242093a;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            try {
                C86013q1.m106447h(strArr[i3]);
            } catch (Exception unused) {
            }
        }
        return true;
    }
}
