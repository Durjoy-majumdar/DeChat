package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import p749xh.C78815k6;
import te3.C64718sz;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.e2 */
public class C105622e2 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C64718sz f314098d;

    /* renamed from: e */
    public final /* synthetic */ C105627f2 f314099e;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.e2$a */
    public class C105623a implements C105598b<ArrayList<C105683r>> {
        public C105623a() {
        }

        /* renamed from: a */
        public void mo150477a(int i, int i2, String str, Object obj) {
            ArrayList arrayList = (ArrayList) obj;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: join success! tryTriggerJoinSucc %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C105724z zVar = C105622e2.this.f314099e.f314107c;
                zVar.f314406p0.mo150489b(zVar.f314388f);
                return;
            }
            Log.m105921e("MicroMsg.Multitalk.ILinkService", "steve: join failed errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public C105622e2(C105627f2 f2Var, C64718sz szVar) {
        this.f314099e = f2Var;
        this.f314098d = szVar;
    }

    public void run() {
        String str;
        C105627f2 f2Var = this.f314099e;
        C105608d dVar = f2Var.f314107c.f314406p0;
        String str2 = f2Var.f314105a;
        dVar.getClass();
        C78815k6 W30 = C105851w0.Bx0().W30(str2);
        if (W30 != null) {
            Log.m105924i("MicroMsg.Multitalk.ILink2MtCallBack", "getMultiTalkBannerCreator, roomid:" + W30.field_roomId + " wxgroupid:" + str2 + ", creatorName:" + W30.field_inviteUserName);
            str = W30.field_inviteUserName;
        } else {
            str = null;
        }
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "join success, imroomid:%d, roomid:%d, selfmemberid:%d, createName:%s", Long.valueOf(this.f314098d.f185455d), Long.valueOf(this.f314098d.f185456e), Integer.valueOf(this.f314098d.f185458g), str);
        C105627f2 f2Var2 = this.f314099e;
        C105724z zVar = f2Var2.f314107c;
        zVar.f314401n = 1;
        C105689s sVar = zVar.f314388f;
        C64718sz szVar = this.f314098d;
        sVar.f314255c = szVar.f185455d;
        sVar.f314254b = szVar.f185456e;
        sVar.f314258f = str;
        sVar.f314260h = f2Var2.f314106b;
        sVar.f314256d = f2Var2.f314105a;
        sVar.getClass();
        C105724z zVar2 = this.f314099e.f314107c;
        zVar2.f314344A1 = true;
        if (zVar2.f314429z1) {
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "steve: join success! launch activity first!!!");
            C105724z zVar3 = this.f314099e.f314107c;
            zVar3.f314406p0.mo150489b(zVar3.f314388f);
        }
        this.f314099e.f314107c.mo150592H(new C105623a());
    }
}
