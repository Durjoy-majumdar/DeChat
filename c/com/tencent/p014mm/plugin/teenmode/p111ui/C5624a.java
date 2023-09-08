package com.tencent.p014mm.plugin.teenmode.p111ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.TeenModeBindStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import d62.C7250m;
import d62.C97425j;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C75592q0;
import fy3.C32224a;
import gy3.C87413o;
import ky2.C10432i;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import t90.C13867d;
import te3.C51513u92;
import wd3.C65953v0;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.teenmode.ui.a */
public final class C5624a implements C65953v0 {

    /* renamed from: a */
    public final /* synthetic */ BindGuardianUI f21564a;

    /* renamed from: b */
    public final /* synthetic */ String f21565b;

    /* renamed from: c */
    public final /* synthetic */ C89132b.C89134c<C51513u92> f21566c;

    /* renamed from: com.tencent.mm.plugin.teenmode.ui.a$a */
    public static final class C5625a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ BindGuardianUI f21567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5625a(BindGuardianUI bindGuardianUI) {
            super(0);
            this.f21567d = bindGuardianUI;
        }

        public Object invoke() {
            this.f21567d.finish();
            return C13598b0.f38549a;
        }
    }

    public C5624a(BindGuardianUI bindGuardianUI, String str, C89132b.C89134c<C51513u92> cVar) {
        this.f21564a = bindGuardianUI;
        this.f21565b = str;
        this.f21566c = cVar;
    }

    /* renamed from: a */
    public final void mo23a(boolean z, String str, int i) {
        if (z) {
            C68070l.C68072b bVar = new C68070l.C68072b();
            bVar.f195570f = this.f21564a.getString(C0966R.string.jwc);
            bVar.f195574g = this.f21564a.getString(C0966R.string.jw8);
            bVar.f195591k0 = this.f21565b;
            bVar.f195582i = 83;
            bVar.f195586j = "https://support.weixin.qq.com/update/";
            bVar.f195646y = "http://wxapp.tc.qq.com/251/20304/stodownload?m=adb36df21d075a4c2148a2c0fc361304&filekey=30450201010420301e020200fb0402535a0410adb36df21d075a4c2148a2c0fc3613040202188a041e000000046274667300000001310000000861707073746f72650000000131&hy=SZ&storeid=32303231303932383030353631353030303362636238303062633631346565633763333930613030303030306662&dotrans=0&sourceflag=1&bizid=1023&adaptivelytrans=0";
            C13867d dVar = new C13867d();
            dVar.f39030b = ((C51513u92) this.f21566c.f256796d).f142687d;
            bVar.mo93545f(dVar);
            C80996q.C1279a.m1369a().mo112827qE(bVar, "", "", this.f21565b, "", (byte[]) null);
            ((C10432i) C86312j.m106911c(C10432i.class)).dt0(this.f21564a.getContext(), this.f21565b, C75592q0.m90789s(), ((C51513u92) this.f21566c.f256796d).f142687d, C31543z5.m39451a());
            if (!(str == null || C112551y.m153811k(str))) {
                C97425j a = C7250m.m7431a();
                String str2 = this.f21565b;
                a.mo136257Tm(str2, str, C45628s0.m50810y(str2), 0);
            }
            TeenModeBindStruct teenModeBindStruct = new TeenModeBindStruct();
            teenModeBindStruct.f10067d = 1;
            teenModeBindStruct.f10068e = 1;
            teenModeBindStruct.f10069f = 1;
            teenModeBindStruct.f10070g = teenModeBindStruct.mo86045b("targetUsername", this.f21565b, true);
            teenModeBindStruct.mo86054n();
            C61926c.m72666K(200, new C5625a(this.f21564a));
        }
    }
}
