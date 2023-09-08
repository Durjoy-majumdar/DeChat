package com.tencent.p014mm.p136ui.chatting.component;

import com.tencent.p014mm.p136ui.chatting.C74339x2;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.ui.chatting.component.s4 */
public class C73596s4 implements C106742j1.C106756o {

    /* renamed from: d */
    public int f216110d = 0;

    /* renamed from: e */
    public final /* synthetic */ C73534m4 f216111e;

    /* renamed from: com.tencent.mm.ui.chatting.component.s4$a */
    public class C73597a implements Runnable {
        public C73597a() {
        }

        public void run() {
            C73596s4.this.f216111e.f215752d.mo91563d();
        }
    }

    public C73596s4(C73534m4 m4Var) {
        this.f216111e = m4Var;
    }

    /* renamed from: H5 */
    public void mo1321H5() {
        new MMHandler().post(new C73597a());
    }

    /* renamed from: S6 */
    public boolean mo1322S6(String str) {
        return false;
    }

    /* renamed from: i7 */
    public void mo1323i7() {
    }

    /* renamed from: l3 */
    public void mo1324l3(String str) {
        if (Util.isNullOrNil(str)) {
            this.f216110d = 0;
            this.f216111e.mo102506R(-1);
            return;
        }
        if (str.length() > this.f216110d) {
            C115669n.INSTANCE.mo160131h(10451, 1);
        }
        this.f216110d = str.length();
        C115669n.INSTANCE.mo160131h(10456, 1);
        C74339x2 x2Var = this.f216111e.f216002u;
        x2Var.f218368q = str;
        if (!Util.isNullOrNil(str)) {
            x2Var.mo5580b();
            x2Var.mo1333o();
        }
    }

    /* renamed from: l5 */
    public void mo1325l5() {
    }

    /* renamed from: y4 */
    public void mo1326y4() {
    }
}
