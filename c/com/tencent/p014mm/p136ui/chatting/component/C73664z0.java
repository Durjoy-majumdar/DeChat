package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.p136ui.chatting.C74339x2;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import zj3.C79368l;
import zj3.C79384u0;

/* renamed from: com.tencent.mm.ui.chatting.component.z0 */
public class C73664z0 implements C106742j1.C106756o {

    /* renamed from: d */
    public String f216293d = null;

    /* renamed from: e */
    public final /* synthetic */ C73655y0 f216294e;

    public C73664z0(C73655y0 y0Var) {
        this.f216294e = y0Var;
    }

    /* renamed from: H5 */
    public void mo1321H5() {
        Log.m105926v("MicroMsg.ChattingMoreBtnBarHelper", "onQuitSearch");
        C79368l lVar = (C79368l) this.f216294e.f215752d.f193278b.mo102812a(C79368l.class);
        if (lVar.mo108213v1()) {
            ((C79384u0) this.f216294e.f215752d.f193278b.mo102812a(C79384u0.class)).mo102503H2();
            this.f216294e.f216260e.setVisibility(0);
            this.f216294e.f216260e.mo102072c(lVar.mo108181M5());
        }
        this.f216294e.f215752d.mo91564e().mo177047G0();
    }

    /* renamed from: S6 */
    public boolean mo1322S6(String str) {
        return false;
    }

    /* renamed from: i7 */
    public void mo1323i7() {
        Log.m105926v("MicroMsg.ChattingMoreBtnBarHelper", "onEnterSearch");
        C115669n.INSTANCE.idkeyStat(219, 21, 1, true);
        if (((C79368l) this.f216294e.f215752d.f193278b.mo102812a(C79368l.class)).mo108213v1()) {
            ((C79384u0) this.f216294e.f215752d.f193278b.mo102812a(C79384u0.class)).mo102512r2();
            this.f216294e.f216260e.setVisibility(8);
        }
    }

    /* renamed from: l3 */
    public void mo1324l3(String str) {
        Log.m105926v("MicroMsg.ChattingMoreBtnBarHelper", "on edit change");
        C79384u0 u0Var = (C79384u0) this.f216294e.f215752d.f193278b.mo102812a(C79384u0.class);
        if (!Util.isNullOrNil(str)) {
            Log.m105926v("MicroMsg.ChattingMoreBtnBarHelper", "enter search mode");
            this.f216294e.f216260e.setVisibility(8);
            u0Var.mo102512r2();
            if (u0Var.mo102508W3() != null) {
                C74339x2 W3 = u0Var.mo102508W3();
                W3.f218368q = str;
                if (!Util.isNullOrNil(str)) {
                    W3.mo5580b();
                    W3.mo1333o();
                }
            }
        } else if (u0Var.mo102502H1()) {
            if (u0Var.mo102508W3() != null) {
                C74339x2 W32 = u0Var.mo102508W3();
                W32.f218368q = "";
                if (!Util.isNullOrNil("")) {
                    W32.mo5580b();
                    W32.mo1333o();
                }
            }
            u0Var.mo102506R(-1);
        } else if (!this.f216294e.f216262g) {
            u0Var.mo102503H2();
            this.f216294e.f216260e.setVisibility(8);
        } else if (this.f216293d != null) {
            u0Var.mo102503H2();
            this.f216294e.f216260e.setVisibility(0);
            this.f216294e.f216260e.mo102072c(((C79368l) this.f216294e.f215752d.f193278b.mo102812a(C79368l.class)).mo108181M5());
        }
        this.f216293d = str;
    }

    /* renamed from: l5 */
    public void mo1325l5() {
    }

    /* renamed from: y4 */
    public void mo1326y4() {
    }
}
