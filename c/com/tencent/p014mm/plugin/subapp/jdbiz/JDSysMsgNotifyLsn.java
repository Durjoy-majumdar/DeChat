package com.tencent.p014mm.plugin.subapp.jdbiz;

import android.os.Looper;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NotifyStartWebViewParamsEvent;
import com.tencent.p014mm.opensdk.constants.ConstantsAPI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C86497v5;
import eb0.C97625j3;
import java.util.HashMap;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: com.tencent.mm.plugin.subapp.jdbiz.JDSysMsgNotifyLsn */
public class JDSysMsgNotifyLsn implements C86497v5.C31521b {

    /* renamed from: d */
    public IListener f282208d = new IListener<NotifyStartWebViewParamsEvent>(C40008f.f107254d) {
        {
            this.__eventId = -382749404;
        }

        public boolean callback(IEvent iEvent) {
            String str;
            String str2;
            NotifyStartWebViewParamsEvent notifyStartWebViewParamsEvent = (NotifyStartWebViewParamsEvent) iEvent;
            if (notifyStartWebViewParamsEvent instanceof NotifyStartWebViewParamsEvent) {
                NotifyStartWebViewParamsEvent.C67743a aVar = notifyStartWebViewParamsEvent.f193770d;
                if (!(aVar.f193772b == null || (str = aVar.f193771a) == null || !"bizjd".equals(str))) {
                    String nullAs = Util.nullAs(notifyStartWebViewParamsEvent.f193770d.f193772b.getString(ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID), "");
                    String nullAs2 = Util.nullAs(notifyStartWebViewParamsEvent.f193770d.f193772b.getString("jump_url"), "");
                    C115669n.INSTANCE.mo160131h(11179, nullAs2, C96463h.yx0().Dx0().f282216b, 4);
                    C96461f Dx0 = C96463h.yx0().Dx0();
                    if (!(Dx0 == null || (str2 = Dx0.f282216b) == null || !str2.equals(nullAs))) {
                        C96463h.yx0().vx0();
                        C96463h.yx0().wx0();
                    }
                    JDSysMsgNotifyLsn.this.f282208d.dead();
                }
            }
            return false;
        }
    };

    /* renamed from: C1 */
    public void mo9065C1(C35136m.C35138c cVar) {
    }

    /* renamed from: Y */
    public void mo9066Y(C35136m.C35137a aVar) {
        Log.m105924i("MicroMsg.JDSysMsgNotifyLsn", "receivemsg jd");
        C77949j3 j3Var = aVar.f94242a;
        if (j3Var == null) {
            Log.m105920e("MicroMsg.JDSysMsgNotifyLsn", "onPreAddMessage cmdAM is null");
            return;
        }
        C96461f fVar = new C96461f();
        fVar.mo134434b(C48374j0.m53718g(j3Var.f227631h));
        Log.m105924i("MicroMsg.JDSysMsgNotifyLsn", "bizType " + Util.nullAs(fVar.f282215a, ""));
        if (Util.isNullOrNil(fVar.f282215a)) {
            Log.m105920e("MicroMsg.JDSysMsgNotifyLsn", "bizTye is null or nil");
        } else if (Util.isNullOrNil(fVar.f282216b)) {
            Log.m105920e("MicroMsg.JDSysMsgNotifyLsn", "activity id is null");
        } else if (!fVar.mo134435c(C96463h.yx0().Dx0())) {
            Log.m105924i("MicroMsg.JDSysMsgNotifyLsn", "fo zu baoyou! the activityid is same");
        } else if (!C96463h.yx0().mo134444UX()) {
            Log.m105920e("MicroMsg.JDSysMsgNotifyLsn", "no config entrance, ignore msg");
        } else {
            boolean z = false;
            if (fVar.f282215a.equals("3")) {
                j3Var.f227637q = null;
                if (Util.isNullOrNil(fVar.f282226l) || Util.isNullOrNil(fVar.f282229o) || Util.isNullOrNil(fVar.f282227m) || Util.isNullOrNil(fVar.f282228n) || Util.isNullOrNil(fVar.f282225k)) {
                    Log.m105920e("MicroMsg.JDSysMsgNotifyLsn", "invalid params");
                } else if (fVar.mo134436d()) {
                    Log.m105924i("MicroMsg.JDSysMsgNotifyLsn", "ingore msg due to msg is expired");
                } else {
                    C96463h yx02 = C96463h.yx0();
                    String str = fVar.f282216b;
                    yx02.getClass();
                    if (!Util.isNullOrNil(str)) {
                        z = ((HashMap) yx02.f282235e).containsKey(str);
                    }
                    if (z) {
                        Log.m105924i("MicroMsg.JDSysMsgNotifyLsn", "activity id already show, " + fVar.f282216b);
                    } else if (!fVar.mo134435c(C96463h.yx0().Dx0())) {
                        Log.m105924i("MicroMsg.JDSysMsgNotifyLsn", "the remind activitid is same");
                    } else {
                        C96463h yx03 = C96463h.yx0();
                        String str2 = fVar.f282216b;
                        yx03.getClass();
                        if (!Util.isNullOrNil(str2)) {
                            ((HashMap) yx03.f282235e).put(str2, 1);
                        }
                        Log.m105924i("MicroMsg.JDSysMsgNotifyLsn", "add activity id" + fVar.f282216b);
                        new MMHandler(Looper.getMainLooper()).post(new C96459c(this, fVar));
                    }
                }
                C96463h.Fx0(fVar);
            } else if (fVar.f282215a.equals("1")) {
                C96463h.Fx0(fVar);
            } else if (fVar.f282215a.equals("2")) {
                C96463h.Fx0(fVar);
                String str3 = C96463h.yx0().Cx0().f282212a;
                if (Util.isNullOrNil(str3)) {
                    str3 = C96463h.yx0().Bx0();
                }
                C115669n.INSTANCE.mo160131h(11178, str3, fVar.f282216b, 3, 1);
            }
        }
        C97625j3.m125812b().mo105906u().mo119681a(true);
    }
}
