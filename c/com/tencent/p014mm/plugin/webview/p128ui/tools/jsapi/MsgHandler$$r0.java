package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6216c0;
import com.tencent.p014mm.pluginsdk.model.app.C44580q1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$r0 */
public class MsgHandler$$r0 implements C44580q1 {

    /* renamed from: a */
    public volatile boolean f22851a;

    /* renamed from: b */
    public volatile boolean f22852b;

    /* renamed from: c */
    public volatile boolean f22853c;

    /* renamed from: d */
    public volatile boolean f22854d;

    /* renamed from: e */
    public volatile boolean f22855e;

    /* renamed from: f */
    public C6193a f22856f;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.MsgHandler$$r0$a */
    public interface C6193a {
    }

    public MsgHandler$$r0(C6193a aVar) {
        this.f22856f = aVar;
    }

    /* renamed from: a */
    public void mo1579a(boolean z, boolean z2) {
        C6193a aVar;
        this.f22854d = true;
        this.f22852b = z;
        this.f22853c = z2;
        if (this.f22855e && (aVar = this.f22856f) != null) {
            ((C6216c0.C6217a.C6218a) aVar).mo7284a(this.f22851a, z, z2);
        }
    }

    /* renamed from: b */
    public void mo7259b(boolean z) {
        C6193a aVar;
        this.f22851a = z;
        this.f22855e = true;
        if (this.f22854d && (aVar = this.f22856f) != null) {
            ((C6216c0.C6217a.C6218a) aVar).mo7284a(z, this.f22852b, this.f22853c);
        }
    }
}
