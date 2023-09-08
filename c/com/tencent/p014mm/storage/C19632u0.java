package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import hp3.C87581a;
import java.util.List;
import te3.me4;
import te3.qe4;
import te3.re4;

/* renamed from: com.tencent.mm.storage.u0 */
public class C19632u0 implements C87581a<Void, Void> {

    /* renamed from: a */
    public final /* synthetic */ List f55617a;

    /* renamed from: b */
    public final /* synthetic */ List f55618b;

    /* renamed from: c */
    public final /* synthetic */ C19625p0 f55619c;

    public C19632u0(C19625p0 p0Var, List list, List list2) {
        this.f55619c = p0Var;
        this.f55617a = list;
        this.f55618b = list2;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        for (me4 me4 : this.f55617a) {
            if (me4 != null) {
                C19623o0 kD = this.f55619c.mo25806kD(me4.f64244i);
                if (kD == null) {
                    Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "batUpdateRecCardInfo info is null ClientId=%d", Long.valueOf(me4.f64244i));
                } else {
                    re4 x2 = kD.mo25774x2();
                    if (x2 == null) {
                        Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "batUpdateRecCardInfo wrapper is null ClientId=%d", Long.valueOf(me4.f64244i));
                    } else {
                        me4 me42 = x2.f64515d;
                        if (!Util.isEqual(me42.f64243h, me4.f64243h)) {
                            x2.f64515d = me4;
                            qe4 qe4 = me42.f64245j;
                            if (!(qe4 == null || qe4.f185009e == null)) {
                                Log.m105925i("MicroMsg.BizTimeLineInfoStorage", "[TRACE_BIZRECCARD] batUpdateRecCardInfo recCard.VersionInfo diff, localRecCard.ver = %s, origin.ver = %s", me42.f64243h, me4.f64243h);
                                x2.f64515d.f64245j = me42.f64245j;
                            }
                        }
                        qe4 qe42 = me42.f64245j;
                        if (qe42 == null) {
                            x2.f64515d.f64245j = me4.f64245j;
                        } else {
                            qe4 qe43 = me4.f64245j;
                            if (qe43 == null) {
                                x2.f64515d.f64245j = qe42;
                            } else if (!Util.isEqual(qe43.f185008d, qe42.f185008d)) {
                                x2.f64515d.f64245j = me4.f64245j;
                            }
                        }
                        x2.f64516e = System.currentTimeMillis();
                        kD.mo25762J2(x2);
                        this.f55619c.updateNotify(kD, false, "msgId");
                        this.f55618b.add(kD);
                    }
                }
            }
        }
        return null;
    }
}
