package ru0;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import ei3.C86522b;
import gp3.C87315b;
import nr3.C89055a;
import p261wl.C38166b;
import qe3.C118191s;
import qe3.C118193t;
import qe3.C118195u0;
import su0.C118308d;
import su0.C118309f;
import su0.C36833e;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ru0.b */
public class C118231b extends C86301e implements C36833e {

    /* renamed from: e */
    public static int f353395e = -1;

    /* renamed from: d */
    public final C118233b f353396d = new C118233b((C118232a) null);

    /* renamed from: ru0.b$b */
    public static final class C118233b extends C89055a<C118308d> implements C118308d {
        public C118233b(C118232a aVar) {
        }

        public void onAuthResponse(C118191s sVar, C118193t tVar, boolean z) {
            mo123416n(new b$b$$c(this, sVar, tVar, z));
            C38166b.m41755b(C118309f.class, new b$b$$a(sVar, tVar, z));
        }

        public void onRegResponse(C118195u0 u0Var, String str, int i, String str2, String str3, int i2) {
            C118195u0 u0Var2 = u0Var;
            String str4 = str;
            int i3 = i;
            String str5 = str2;
            String str6 = str3;
            int i4 = i2;
            mo123416n(new b$b$$d(this, u0Var2, str4, i3, str5, str6, i4));
            C38166b.m41755b(C118309f.class, new b$b$$b(u0Var2, str4, i3, str5, str6, i4));
        }
    }

    /* renamed from: CI */
    public C87315b mo60841CI(C118308d dVar) {
        return this.f353396d.add(dVar);
    }
}
