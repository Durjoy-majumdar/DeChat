package com.tencent.p014mm.app;

import android.app.Activity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SendMsgEvent;
import com.tencent.p014mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import nj3.C76879j;
import wd3.C65953v0;

/* renamed from: com.tencent.mm.app.q1 */
public class C0990q1 implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ WXMediaMessage f9016a;

    /* renamed from: b */
    public final /* synthetic */ String f9017b;

    /* renamed from: c */
    public final /* synthetic */ String f9018c;

    /* renamed from: d */
    public final /* synthetic */ String f9019d;

    /* renamed from: e */
    public final /* synthetic */ Activity f9020e;

    public C0990q1(C67654r1 r1Var, WXMediaMessage wXMediaMessage, String str, String str2, String str3, Activity activity) {
        this.f9016a = wXMediaMessage;
        this.f9017b = str;
        this.f9018c = str2;
        this.f9019d = str3;
        this.f9020e = activity;
    }

    /* renamed from: a */
    public void mo23a(boolean z, String str, int i) {
        if (z) {
            C72695v.m85049B(this.f9016a, this.f9017b, this.f9018c, this.f9019d, 3, (String) null);
            if (!Util.isNullOrNil(str)) {
                SendMsgEvent sendMsgEvent = new SendMsgEvent();
                SendMsgEvent.C1132a aVar = sendMsgEvent.f9496d;
                String str2 = this.f9019d;
                aVar.f9497a = str2;
                aVar.f9498b = str;
                aVar.f9499c = C45628s0.m50810y(str2);
                sendMsgEvent.f9496d.f9500d = 0;
                sendMsgEvent.publish();
            }
            Activity activity = this.f9020e;
            C76879j.m92726T(activity, activity.getResources().getString(C0966R.string.f360099a34));
            C115669n.INSTANCE.kvStat(10910, "2");
        }
    }
}
