package com.tencent.p014mm.plugin.webview.p128ui.tools.widget;

import com.tencent.xweb.JsResult;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.i0 */
public class C44281i0 extends JsResult {

    /* renamed from: a */
    public boolean f119979a = false;

    /* renamed from: b */
    public final /* synthetic */ JsResult f119980b;

    /* renamed from: c */
    public final /* synthetic */ C44262h0 f119981c;

    public C44281i0(C44262h0 h0Var, JsResult jsResult) {
        this.f119981c = h0Var;
        this.f119980b = jsResult;
        h0Var.f119947d.add(this);
    }

    public void cancel() {
        if (!this.f119979a) {
            this.f119980b.cancel();
            this.f119979a = true;
        }
        this.f119981c.f119947d.remove(this);
    }

    public void confirm() {
        if (!this.f119979a) {
            this.f119980b.confirm();
            this.f119979a = true;
        }
        this.f119981c.f119947d.remove(this);
    }
}
