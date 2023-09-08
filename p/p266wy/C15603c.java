package p266wy;

import android.content.res.Resources;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.AgreeAuthorizationChangeEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C31924c1;
import f62.C75700k0;
import java.util.Map;
import ky2.C10432i;
import ky2.C10437m;
import my2.C11098e;
import ob0.C35136m;
import p1081gi.C98121d;
import zt3.C119157j;

/* renamed from: wy.c */
public class C15603c implements C31924c1 {

    /* renamed from: wy.c$a */
    public class C15604a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f42226d;

        /* renamed from: e */
        public final /* synthetic */ String f42227e;

        /* renamed from: f */
        public final /* synthetic */ int f42228f;

        /* renamed from: g */
        public final /* synthetic */ long f42229g;

        public C15604a(C15603c cVar, String str, String str2, int i, long j) {
            this.f42226d = str;
            this.f42227e = str2;
            this.f42228f = i;
            this.f42229g = j;
        }

        public void run() {
            C72963f4 f4Var;
            C68070l.C68072b u;
            Class cls = C75700k0.class;
            Class cls2 = C10432i.class;
            ((C10432i) C86312j.m106911c(cls2)).I40();
            if (C75592q0.m90789s().equalsIgnoreCase(this.f42226d)) {
                C72963f4 f4Var2 = new C72963f4();
                f4Var2.mo108740T2(0);
                f4Var2.mo100991d(3);
                f4Var2.mo108749c3(this.f42227e);
                f4Var2.mo108733M2(C75604z3.m90841m(this.f42227e, C31543z5.m39451a() / 1000));
                C72996z1 k = C45628s0.m50782k(this.f42227e);
                Resources resources = MMApplicationContext.getResources();
                Object[] objArr = new Object[4];
                objArr[0] = k != null ? k.mo62898f() : "";
                objArr[1] = ((C10432i) C86312j.m106911c(cls2)).mo10753jE(this.f42228f).mo10175d(MMApplicationContext.getContext());
                objArr[2] = "<_wc_custom_link_ href='weixin://teenagerModeAgreenAuthorization/" + this.f42229g + "'>";
                objArr[3] = "</_wc_custom_link_>";
                f4Var2.mo108732L2(resources.getString(C0966R.string.jvr, objArr));
                f4Var2.setType(10000);
                f4Var2.mo108735O2(f4Var2.mo108762o2() | 8);
                C75604z3.m90852x(f4Var2);
                f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(this.f42227e, this.f42229g);
            } else {
                f4Var = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(this.f42226d, this.f42229g);
            }
            if (!Util.isNullOrNil(f4Var.getContent()) && (u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null)) != null) {
                u.f195570f = MMApplicationContext.getString(C0966R.string.jvk) + u.f195570f;
                f4Var.mo108732L2(C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
                C75604z3.m90828C(f4Var);
            }
        }
    }

    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        String str2 = map.get(".sysmsg.teenagermodeagreenauthorization.guardianusername");
        String str3 = map.get(".sysmsg.teenagermodeagreenauthorization.wardusername");
        String str4 = map.get(".sysmsg.teenagermodeagreenauthorization.businesskey");
        int i = Util.getInt(map.get(".sysmsg.teenagermodeagreenauthorization.businesstype"), 0);
        long j = Util.getLong(map.get(".sysmsg.teenagermodeagreenauthorization.agreenauthorizationtime"), (long) C31543z5.m39455e());
        long j2 = Util.getLong(map.get(".sysmsg.teenagermodeagreenauthorization.requestauthorizationmsgid"), 0);
        C10437m mVar = new C10437m();
        mVar.field_businessKey = str4;
        mVar.field_businessType = i;
        mVar.field_guardianUserName = str2;
        mVar.field_wardUserName = str3;
        mVar.field_time = j * 1000;
        mVar.field_msgSvrId = j2;
        C11098e.f32878a.mo11232a().replace(mVar);
        AgreeAuthorizationChangeEvent agreeAuthorizationChangeEvent = new AgreeAuthorizationChangeEvent();
        AgreeAuthorizationChangeEvent.C0995a aVar2 = agreeAuthorizationChangeEvent.f9031d;
        aVar2.f9033b = str4;
        aVar2.f9032a = i;
        agreeAuthorizationChangeEvent.publish();
        ((C119157j) C119157j.f356862d).mo183875f(new C15604a(this, str3, str2, i, j2));
    }
}
