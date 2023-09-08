package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import android.content.Intent;
import com.tencent.p014mm.vfs.C86013q1;
import p225rc.g$$f;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.u1 */
public class C82769u1 implements g$$f {

    /* renamed from: a */
    public final /* synthetic */ String[] f242106a;

    /* renamed from: b */
    public final /* synthetic */ C82772v1 f242107b;

    public C82769u1(C82772v1 v1Var, String[] strArr) {
        this.f242107b = v1Var;
        this.f242106a = strArr;
    }

    /* renamed from: b */
    public boolean mo1596b(int i, int i2, Intent intent) {
        if (this.f242107b.f242115g != i) {
            return false;
        }
        String[] strArr = this.f242106a;
        for (int i3 = 0; i3 < strArr.length; i3++) {
            try {
                C86013q1.m106447h(strArr[i3]);
            } catch (Exception unused) {
            }
        }
        return true;
    }
}
