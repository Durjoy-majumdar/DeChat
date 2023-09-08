package com.tencent.p014mm.plugin.messenger.foundation;

import com.tencent.p014mm.autogen.mmdata.rpt.AndroidMsgDelayMonitorStruct;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C45629t0;
import eb0.C75592q0;
import gy3.C87412m;
import iy3.C60641c;
import j62.C21195a;
import pc0.C118011j;
import sf0.C48374j0;
import te3.C77949j3;
import ug3.C27677c;
import ug3.C37470b;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.messenger.foundation.o$$a */
public final /* synthetic */ class o$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Object f53147d;

    /* renamed from: e */
    public final /* synthetic */ int f53148e;

    /* renamed from: f */
    public final /* synthetic */ C77949j3 f53149f;

    public /* synthetic */ o$$a(Object obj, int i, C77949j3 j3Var) {
        this.f53147d = obj;
        this.f53148e = i;
        this.f53149f = j3Var;
    }

    public final void run() {
        Object obj = this.f53147d;
        int i = this.f53148e;
        C77949j3 j3Var = this.f53149f;
        String g = C48374j0.m53718g(j3Var.f227628e);
        long j = j3Var.f227638r;
        long j2 = (long) j3Var.f227635o;
        int i2 = j3Var.f227630g;
        C87412m.m108594g(g, "username");
        C27677c Jn0 = ((C37470b) C86312j.m106911c(C37470b.class)).Jn0();
        if (C31543z5.m39453c() - C21195a.f59965a >= 600000 && (obj instanceof C118011j) && !C87412m.m108589b(g, C75592q0.m90789s()) && !C45628s0.m50738C(g) && !C87412m.m108589b(g, "weixin") && !C45629t0.m50821h(g) && i2 <= 100) {
            C118011j jVar = (C118011j) obj;
            String str = jVar.f352753d.f354051j;
            char c = 0;
            if (!(str == null || C112551y.m153811k(str)) && !C87412m.m108589b(C21195a.f59966b, jVar.f352753d.f354051j)) {
                String str2 = jVar.f352753d.f354051j;
                if (str2 == null) {
                    str2 = "";
                }
                C21195a.f59966b = str2;
                long e = ((long) C31543z5.m39455e()) - j2;
                if (e > 1800) {
                    c = 1;
                } else if (e > 900) {
                    c = 2;
                } else if (e > 300) {
                    c = 3;
                }
                if (c != 0) {
                    AndroidMsgDelayMonitorStruct androidMsgDelayMonitorStruct = new AndroidMsgDelayMonitorStruct();
                    androidMsgDelayMonitorStruct.f48148d = (long) i2;
                    androidMsgDelayMonitorStruct.f48162r = androidMsgDelayMonitorStruct.mo86045b("MsgSvrId", String.valueOf(j), true);
                    androidMsgDelayMonitorStruct.f48150f = androidMsgDelayMonitorStruct.mo86045b("MsgTalker", g, true);
                    androidMsgDelayMonitorStruct.f48149e = e;
                    androidMsgDelayMonitorStruct.f48152h = Jn0.mo55526M();
                    androidMsgDelayMonitorStruct.f48153i = Jn0.mo55514A();
                    androidMsgDelayMonitorStruct.f48154j = Jn0.mo55518E();
                    androidMsgDelayMonitorStruct.f48156l = Jn0.mo55516C();
                    androidMsgDelayMonitorStruct.f48157m = Jn0.mo55519F();
                    androidMsgDelayMonitorStruct.f48155k = Jn0.mo55515B();
                    androidMsgDelayMonitorStruct.f48158n = Jn0.mo55517D();
                    androidMsgDelayMonitorStruct.f48159o = Jn0.mo55520G();
                    float f = (float) 100;
                    androidMsgDelayMonitorStruct.f48161q = C60641c.m70921b(Jn0.mo55524K() * f);
                    androidMsgDelayMonitorStruct.f48160p = C60641c.m70921b(Jn0.mo55528O() * f);
                    androidMsgDelayMonitorStruct.f48151g = 3;
                    androidMsgDelayMonitorStruct.f48163s = androidMsgDelayMonitorStruct.mo86045b("ExtInfo", C21195a.f59966b + ';' + i + ';' + j2, true);
                    androidMsgDelayMonitorStruct.mo86054n();
                    androidMsgDelayMonitorStruct.mo86056r();
                    C21195a.f59965a = C31543z5.m39453c();
                }
            }
        }
    }
}
