package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import pe3.C47465a;
import te3.C64407gz;
import te3.C64643pz;
import te3.C64670qz;
import te3.et4;
import te3.ps4;
import te3.qs4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.h1 */
public class C105634h1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C64670qz f314119d;

    /* renamed from: e */
    public final /* synthetic */ C105724z.C105725b f314120e;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.h1$a */
    public class C105635a implements C40324j.C40326a {

        /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.h1$a$a */
        public class C105636a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f314122d;

            /* renamed from: e */
            public final /* synthetic */ int f314123e;

            /* renamed from: f */
            public final /* synthetic */ C47350c f314124f;

            /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.h1$a$a$a */
            public class C105637a implements C105598b<String> {
                public C105637a() {
                }

                /* renamed from: a */
                public void mo150477a(int i, int i2, String str, Object obj) {
                    String str2 = (String) obj;
                    Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: updateMembers done! %d, %d, %s, videoMidLst:%s", Integer.valueOf(i), Integer.valueOf(i2), str, C105724z.this.f314399l1);
                    if (i != 0 || i2 != 0) {
                        Log.m105921e("MicroMsg.Multitalk.ILinkService", "steve: updateMembers fail errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
                    }
                }
            }

            public C105636a(int i, int i2, C47350c cVar) {
                this.f314122d = i;
                this.f314123e = i2;
                this.f314124f = cVar;
            }

            public void run() {
                C47465a aVar;
                if (this.f314122d == 0 && this.f314123e == 0 && (aVar = this.f314124f.f127056b.f127083a) != null) {
                    LinkedList<et4> linkedList = ((qs4) aVar).f140532d;
                    C105634h1 h1Var = C105634h1.this;
                    C105724z zVar = C105724z.this;
                    zVar.f314388f.mo150553e(h1Var.f314119d, linkedList, zVar.f314362Q0, zVar.f314376X0, new C105637a());
                    C105634h1 h1Var2 = C105634h1.this;
                    C105724z zVar2 = C105724z.this;
                    C105689s sVar = zVar2.f314388f;
                    sVar.f314259g = (long) h1Var2.f314119d.f185100g;
                    LinkedList<C64407gz> linkedList2 = zVar2.f314399l1;
                    if (linkedList2 != null) {
                        sVar.getClass();
                        if (linkedList2 != null && linkedList2.size() > 0) {
                            Log.m105924i("MicroMsg.Multitalk.ILinkMemberMgr", "yuemwang videoIdList: " + linkedList2);
                            Iterator<C64407gz> it = linkedList2.iterator();
                            while (it.hasNext()) {
                                C64407gz next = it.next();
                                int i = next.f183379e;
                                sVar.mo150554f(next.f183378d, (i & 4) != 0 ? 101 : (i & 8) != 0 ? 102 : 104);
                            }
                        }
                    }
                    Iterator<C64643pz> it4 = C105634h1.this.f314119d.f185099f.iterator();
                    int i2 = 0;
                    int i3 = 0;
                    while (it4.hasNext()) {
                        C64643pz next2 = it4.next();
                        String str = next2.f184927e;
                        if (str != null) {
                            Log.m105925i("MicroMsg.Multitalk.ILinkService", "member %s status %d", str, Integer.valueOf(next2.f184929g));
                            int i4 = next2.f184929g;
                            if (i4 == 1) {
                                i2++;
                            }
                            if (i4 == 2 || i4 == 3) {
                                i3++;
                            }
                        }
                    }
                    if (i2 == 0) {
                        C105689s sVar2 = C105724z.this.f314388f;
                        C105683r b = sVar2.mo150550b(sVar2.f314258f);
                        if (b != null && b.f314241e == 5) {
                            C105724z zVar3 = C105724z.this;
                            C105608d dVar = zVar3.f314406p0;
                            C105689s sVar3 = zVar3.f314388f;
                            dVar.getClass();
                            Log.m105924i("MicroMsg.Multitalk.ILink2MtCallBack", "onCancelCreateMultiTalk");
                            MMHandlerThread.postToMainThread(new C105628g(dVar));
                            C105724z.this.mo150604n();
                            C105724z.this.mo150607q(2000);
                        }
                        Log.m105925i("MicroMsg.Multitalk.ILinkService", "joinedMemberCnt %d joiningMemberCnt %d remove the banner", Integer.valueOf(i2), Integer.valueOf(i3));
                        C105724z.m141931f(C105724z.this, 0);
                    } else {
                        C105634h1 h1Var3 = C105634h1.this;
                        int i5 = h1Var3.f314119d.f185101h;
                        if (i5 == 1 || i5 == 2) {
                            C105724z zVar4 = C105724z.this;
                            if (zVar4.f314362Q0.equals(zVar4.f314388f.f314258f)) {
                                C105634h1 h1Var4 = C105634h1.this;
                                if (h1Var4.f314119d.f185101h == 1) {
                                    C105724z.m141931f(C105724z.this, 1);
                                }
                            }
                            C105724z.m141931f(C105724z.this, 2);
                        }
                    }
                    C105634h1 h1Var5 = C105634h1.this;
                    int i6 = h1Var5.f314119d.f185101h;
                    if (i6 == 2) {
                        C105724z.this.mo150604n();
                        return;
                    }
                    if (i6 == 3) {
                        C105724z.m141931f(C105724z.this, 2);
                    }
                    C105724z zVar5 = C105724z.this;
                    C105608d dVar2 = zVar5.f314406p0;
                    C105689s sVar4 = zVar5.f314388f;
                    dVar2.getClass();
                    MMHandlerThread.postToMainThread(new C105624f(dVar2, sVar4));
                    C105724z zVar6 = C105724z.this;
                    zVar6.f314402n1 = false;
                    LinkedList<C64407gz> linkedList3 = zVar6.f314399l1;
                    if (linkedList3 != null) {
                        zVar6.f314406p0.mo150492e(zVar6.f314388f, linkedList3);
                    }
                    C105724z zVar7 = C105724z.this;
                    if (zVar7.f314401n != 1) {
                        Log.m105924i("MicroMsg.Multitalk.ILinkService", "hy: not in room. do not notify");
                    } else if (!zVar7.f314372V0 && i2 > 1) {
                        zVar7.f314372V0 = true;
                        zVar7.getClass();
                        Log.m105924i("MicroMsg.Multitalk.ILinkService", "steve:readyToTalk");
                        if (zVar7.f314380Z0 == C105724z.C105743t.ILinkMemberRoleCreate && zVar7.f314362Q0.equals(zVar7.f314388f.f314258f)) {
                            zVar7.mo150591G(new C105621e1(zVar7));
                        }
                        zVar7.mo150614x(new C105626f1(zVar7));
                    }
                } else {
                    C105724z.this.f314402n1 = false;
                    Log.m105920e("MicroMsg.Multitalk.ILinkService", "hy: cgiGetSDKUserInfo fail, errType:" + this.f314122d + ",errCode:" + this.f314123e);
                }
            }
        }

        public C105635a() {
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "on invite result: %d, %d, %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            C105724z.this.mo150614x(new C105636a(i, i2, cVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.h1$b */
    public class C105638b implements C105598b<String> {
        public C105638b() {
        }

        /* renamed from: a */
        public void mo150477a(int i, int i2, String str, Object obj) {
            String str2 = (String) obj;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: updateMembers done! %d, %d, %s, videoMidLst:%s", Integer.valueOf(i), Integer.valueOf(i2), str, C105724z.this.f314399l1);
            if (i != 0 || i2 != 0) {
                Log.m105921e("MicroMsg.Multitalk.ILinkService", "steve: updateMembers fail errtype %d errcode %d", Integer.valueOf(i), Integer.valueOf(i2));
            }
        }
    }

    public C105634h1(C105724z.C105725b bVar, C64670qz qzVar) {
        this.f314120e = bVar;
        this.f314119d = qzVar;
    }

    public void run() {
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "update members, imroomid:%d roomid:%d memberNum:%d seq:%d status:%d", Long.valueOf(this.f314119d.f185097d), Long.valueOf(this.f314119d.f185098e), Integer.valueOf(this.f314119d.f185099f.size()), Integer.valueOf(this.f314119d.f185100g), Integer.valueOf(this.f314119d.f185101h));
        LinkedList<String> linkedList = new LinkedList<>();
        Iterator<C64643pz> it = this.f314119d.f185099f.iterator();
        while (it.hasNext()) {
            C64643pz next = it.next();
            String str = next.f184927e;
            if (str != null) {
                Log.m105925i("MicroMsg.Multitalk.ILinkService", "member %s status %d", str, Integer.valueOf(next.f184929g));
                linkedList.add(str);
            }
        }
        if (linkedList.size() > 0) {
            C105724z.this.f314402n1 = true;
            C105724z zVar = C105724z.this;
            C42574q qVar = zVar.f314394i;
            long j = zVar.f314364R0;
            String str2 = zVar.f314366S0;
            qVar.getClass();
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new ps4();
            bVar.f127067b = new qs4();
            bVar.f127069d = 3602;
            bVar.f127068c = "/cgi-bin/micromsg-bin/voipmtgetsdkuserinfo";
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            ps4 ps4 = (ps4) a.f127055a.f127080a;
            ps4.f139941d = linkedList;
            ps4.f139942e = str2;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C105635a());
            return;
        }
        Log.m105924i("MicroMsg.Multitalk.ILinkService", "no member in room. remove the banner");
        C105724z zVar2 = C105724z.this;
        zVar2.f314388f.mo150553e(this.f314119d, (LinkedList<et4>) null, zVar2.f314362Q0, zVar2.f314376X0, new C105638b());
        C105724z zVar3 = C105724z.this;
        zVar3.f314388f.f314259g = (long) this.f314119d.f185100g;
        C105724z.m141931f(zVar3, 0);
    }
}
