package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import android.os.Bundle;
import android.telephony.TelephonyManager;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105703u;
import com.tencent.p014mm.plugin.multitalk.ilinkservice.C105724z;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import dd0.C75346e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p182kk.C61104a;
import te3.C51176rz;
import te3.et4;
import te3.rs4;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.d0 */
public class C105612d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C51176rz f314085d;

    /* renamed from: e */
    public final /* synthetic */ C105629g0 f314086e;

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.d0$a */
    public class C105613a implements C105703u.C105704a<String, String> {
        public C105613a() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
            return "";
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            String str = (String) obj;
            C105612d0.this.f314086e.f314109a.mo150614x(new C105605c0(this));
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.d0$b */
    public class C105614b implements C105703u.C105704a<String, String> {
        public C105614b() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
            return "";
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            String str = (String) obj;
            C105612d0.this.f314086e.f314109a.mo150614x(new C105620e0(this));
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.d0$c */
    public class C105615c implements C105703u.C105704a<String, String> {
        public C105615c() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo150478a(byte[] bArr) {
            return "";
        }

        /* renamed from: b */
        public byte[] mo150479b(Object obj) {
            String str = (String) obj;
            return new byte[0];
        }

        /* renamed from: c */
        public Object mo150480c(int i, Object obj) {
            String str = (String) obj;
            C105612d0.this.f314086e.f314109a.mo150614x(new C105625f0(this));
            return "";
        }

        /* renamed from: d */
        public boolean mo150481d() {
            return false;
        }
    }

    public C105612d0(C105629g0 g0Var, C51176rz rzVar) {
        this.f314086e = g0Var;
        this.f314085d = rzVar;
    }

    public void run() {
        rs4 rs4 = (rs4) ((ConcurrentHashMap) this.f314086e.f314109a.f314427y1).get(Long.valueOf(this.f314085d.f141220d));
        if (rs4 == null) {
            Map<Long, rs4> map = this.f314086e.f314109a.f314427y1;
            if (map != null && ((ConcurrentHashMap) map).size() > 0) {
                ((ConcurrentHashMap) this.f314086e.f314109a.f314427y1).clear();
                Log.m105918d("MicroMsg.Multitalk.ILinkService", "clearmap recvInviteInfoMap success");
                return;
            }
            return;
        }
        this.f314086e.f314109a.mo150585A();
        C105724z zVar = this.f314086e.f314109a;
        zVar.f314366S0 = rs4.f141116d;
        zVar.f314368T0 = rs4.f141118f;
        zVar.f314378Y0 = rs4.f141122j;
        C51176rz rzVar = this.f314085d;
        C105724z zVar2 = this.f314086e.f314109a;
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "recv invite, roomid:%d callerid:%s, roomtype:%d, groupip:%s, sdkgroupid:%s", Long.valueOf(this.f314085d.f141220d), rzVar.f141223g, Integer.valueOf(rzVar.f141221e), zVar2.f314366S0, zVar2.f314368T0);
        Map<Long, rs4> map2 = this.f314086e.f314109a.f314427y1;
        if (map2 != null && ((ConcurrentHashMap) map2).size() > 0) {
            ((ConcurrentHashMap) this.f314086e.f314109a.f314427y1).clear();
            Log.m105918d("MicroMsg.Multitalk.ILinkService", "clearmap recvInviteInfoMap success");
        }
        this.f314086e.f314109a.getClass();
        TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
        Bundle bundle = (Bundle) C80907o.m98783f("com.tencent.mm", null, C105724z.C85293v.class);
        boolean z = bundle != null ? bundle.getBoolean("is_in_voip") : false;
        boolean z2 = z || C75346e.m90355a() || (C61104a.m71662r() && telephonyManager.getCallState() != 0);
        Log.m105925i("MicroMsg.Multitalk.ILinkService", "steve: isOnOtherCalling:%b,%b,%b,%b,%d", Boolean.valueOf(z2), Boolean.valueOf(z), Boolean.valueOf(C75346e.m90355a()), Boolean.valueOf(C61104a.m71662r()), Integer.valueOf(telephonyManager.getCallState()));
        if (z2) {
            Log.m105924i("MicroMsg.Multitalk.ILinkService", "other call is on, hangup!!!");
            C105724z zVar3 = this.f314086e.f314109a;
            zVar3.getClass();
            zVar3.mo150614x(new C105660m0(zVar3, 3));
            return;
        }
        C105851w0.zx0().mo150639P(this.f314086e.f314109a.f314366S0, 2);
        this.f314086e.f314109a.f314388f.mo150552d();
        C105724z zVar4 = this.f314086e.f314109a;
        C105689s sVar = zVar4.f314388f;
        sVar.f314254b = this.f314085d.f141220d;
        sVar.f314260h = zVar4.f314368T0;
        sVar.f314256d = zVar4.f314366S0;
        C105613a aVar = new C105613a();
        zVar4.f314359N = aVar;
        zVar4.f314360P = new C105614b();
        zVar4.f314369U = new C105615c();
        zVar4.f314386e.mo150567b(12, aVar);
        C105724z zVar5 = this.f314086e.f314109a;
        zVar5.f314386e.mo150567b(13, zVar5.f314360P);
        C105724z zVar6 = this.f314086e.f314109a;
        zVar6.f314386e.mo150567b(17, zVar6.f314369U);
        ArrayList<C105683r> arrayList = new ArrayList<>();
        C105683r rVar = new C105683r();
        Iterator<et4> it = this.f314086e.f314109a.f314378Y0.iterator();
        while (it.hasNext()) {
            et4 next = it.next();
            C105683r rVar2 = new C105683r();
            String str = next.f133117e;
            rVar2.f314238b = str;
            String str2 = next.f133116d;
            rVar2.f314239c = str2;
            Log.m105925i("MicroMsg.Multitalk.ILinkService", "a member: %s, sdkusername:%s", str2, str);
            if (this.f314085d.f141223g.equals(next.f133117e)) {
                rVar2.f314241e = 1;
                C105724z zVar7 = this.f314086e.f314109a;
                String str3 = next.f133116d;
                zVar7.f314376X0 = str3;
                zVar7.f314388f.f314258f = str3;
            } else {
                rVar2.f314241e = 2;
            }
            C105724z zVar8 = this.f314086e.f314109a;
            rVar2.f314240d = zVar8.f314376X0;
            if (next.f133116d.equals(zVar8.f314362Q0)) {
                rVar = rVar2;
            }
            arrayList.add(rVar2);
        }
        C105724z zVar9 = this.f314086e.f314109a;
        String str4 = zVar9.f314376X0;
        if (str4 != null) {
            rVar.f314240d = str4;
        }
        zVar9.f314388f.f314257e = arrayList;
        C105714w.f314302c.Ack();
    }
}
