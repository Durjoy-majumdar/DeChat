package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import ex0.C45700h;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.z0 */
public final class C6587z0 extends C87413o implements C32226l<Object, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C45700h.C45702b f23829d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6587z0(C45700h.C45702b bVar) {
        super(1);
        this.f23829d = bVar;
    }

    public Object invoke(Object obj) {
        if (obj instanceof String) {
            if (((CharSequence) obj).length() > 0) {
                this.f23829d.f123514k.add(obj);
            }
        }
        return C13598b0.f38549a;
    }
}
