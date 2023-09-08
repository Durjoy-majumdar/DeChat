package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C44366w0;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87413o;
import p629ny.C76979h;
import te3.C49983jf;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.a1 */
public final class C44235a1 extends C87413o implements C32226l<Integer, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C44366w0.C44375i.C44376a f119883d;

    /* renamed from: e */
    public final /* synthetic */ C44366w0.C44375i f119884e;

    /* renamed from: f */
    public final /* synthetic */ C49983jf f119885f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C44235a1(C44366w0.C44375i.C44376a aVar, C44366w0.C44375i iVar, C49983jf jfVar) {
        super(1);
        this.f119883d = aVar;
        this.f119884e = iVar;
        this.f119885f = jfVar;
    }

    public Object invoke(Object obj) {
        if (((Number) obj).intValue() != 0) {
            this.f119883d.f120281c.setVisibility(8);
            this.f119883d.f120282d.setVisibility(8);
            this.f119883d.f120283e.setVisibility(8);
            this.f119883d.f120280b.setVisibility(8);
            this.f119883d.f120279a.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f119884e.f120275d, this.f119885f.f136076g, this.f119883d.f120279a.getTextSize()));
            this.f119883d.f120285g.setVisibility(0);
            this.f119883d.f120286h.setVisibility(8);
            this.f119883d.f120284f.setVisibility(8);
            return Boolean.TRUE;
        }
        this.f119883d.f120281c.setVisibility(0);
        this.f119883d.f120285g.setVisibility(8);
        return Boolean.FALSE;
    }
}
