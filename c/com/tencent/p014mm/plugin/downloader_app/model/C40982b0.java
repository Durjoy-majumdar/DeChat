package com.tencent.p014mm.plugin.downloader_app.model;

import com.tencent.p014mm.plugin.ball.service.C105052s;
import com.tencent.p014mm.plugin.downloader_app.model.C41009x;
import e51.C45548j;
import java.util.LinkedList;
import uv0.C111237j;

/* renamed from: com.tencent.mm.plugin.downloader_app.model.b0 */
public class C40982b0 extends C105052s {
    public C40982b0(C111237j jVar) {
        super(jVar);
    }

    /* renamed from: A */
    public void mo35648A(int i, String str) {
        super.mo35648A(i, str);
        getReportInfo().f311717f = 11;
    }

    /* renamed from: C */
    public void mo64001C() {
        super.mo64001C();
        LinkedList<C45548j> linkedList = C41009x.f110384t;
        C41009x xVar = C41009x.C41012c.f110393a;
        xVar.f110389r = false;
        xVar.mo90537e(false);
    }

    /* renamed from: f0 */
    public boolean mo35651f0() {
        return false;
    }

    /* renamed from: k0 */
    public void mo64002k0() {
        this.f311808n.mo23513d(false);
    }

    /* renamed from: o */
    public void mo64003o() {
        super.mo64003o();
        LinkedList<C45548j> linkedList = C41009x.f110384t;
        C41009x.C41012c.f110393a.f110389r = true;
    }

    /* renamed from: y0 */
    public boolean mo64004y0(int i) {
        LinkedList<C45548j> linkedList = C41009x.f110384t;
        this.f311726d = C41009x.C41012c.f110393a.f311726d;
        return super.mo64004y0(i);
    }
}
