package com.tencent.p014mm.pluginsdk.model.app;

import a70.C112760b;
import android.util.Pair;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelsimple.C40359h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import gy3.C87412m;
import jd3.C76404b;
import ob0.C47355o;
import p763ym.C53543s;
import qg2.C77335p;

/* renamed from: com.tencent.mm.pluginsdk.model.app.q$$e */
public class q$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C72963f4 f211510d;

    public q$$e(C72963f4 f4Var) {
        this.f211510d = f4Var;
    }

    public void run() {
        Log.m105925i("MicroMsg.AppMessageExtension", "autoDownloadFile2 %s %s", Long.valueOf(this.f211510d.mo108774y2()), Long.valueOf(this.f211510d.getMsgId()));
        C68070l.C68072b u = C68070l.C68072b.m80422u(this.f211510d.getContent(), (String) null);
        if (u != null) {
            String str = C72695v.m85063e(C112760b.m154247s(), u.f195570f, u.f195602n) + "_lan_tmp";
            if (Util.isNullOrNil(str) || !C86013q1.m106450k(str)) {
                Log.m105921e("MicroMsg.AppMessageExtension", "startToDownloadFile tmpFile:%s, %s", Util.nullAs(str, ""), Boolean.valueOf(C86013q1.m106450k(str)));
            } else {
                C72683d Yt = ((C72684e) ((C53543s) C86312j.m106911c(C53543s.class)).mo74024KZ()).mo100150Yt(this.f211510d.getMsgId());
                if (Yt == null) {
                    Log.m105920e("MicroMsg.AppMessageExtension", "startToDownloadFile info is null");
                } else if (C86013q1.m106451l(str) == Yt.field_totalLen) {
                    boolean l1 = C77335p.m93215l1(this.f211510d, str);
                    Log.m105925i("MicroMsg.AppMessageExtension", "startToDownloadFile use lan, status:%s", Long.valueOf(Yt.field_status));
                    if (l1) {
                        return;
                    }
                } else {
                    Log.m105921e("MicroMsg.AppMessageExtension", "startToDownloadFile tmpFile:%s, length:%s", Util.nullAs(str, ""), Long.valueOf(C86013q1.m106451l(str)));
                }
            }
        } else {
            Log.m105920e("MicroMsg.AppMessageExtension", "startToDownloadFile content is null");
        }
        Pair<Boolean, String> f0 = C72689q.m85028f0(this.f211510d, false);
        Log.m105925i("MicroMsg.AppMessageExtension", "autoDownloadFile3 %s %s, tryInitAttach:%s meidaId:%s", Long.valueOf(this.f211510d.mo108774y2()), Long.valueOf(this.f211510d.getMsgId()), f0.first, f0.second);
        if (((Boolean) f0.first).booleanValue()) {
            Log.m105924i("MicroMsg.AppMessageExtension", "startToDownloadFile");
            C97625j3.m125815e().mo123460f(new C77335p(this.f211510d.getMsgId(), (String) f0.second, (C47355o) null));
            C40359h0.m43533o1(this.f211510d);
        }
        C76404b bVar = C76404b.f223715a;
        C72963f4 f4Var = this.f211510d;
        C87412m.m108594g(f4Var, "msgInfo");
        bVar.mo106629c(f4Var, C68070l.C68072b.m80422u(f4Var.getContent(), (String) null));
    }
}
