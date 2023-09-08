package com.tencent.p014mm.plugin.appbrand.widget.input;

import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import rt0.C110653f;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.v0 */
public abstract class C104929v0 extends C104873k {
    /* renamed from: C */
    public boolean mo148831C(C104930w0 w0Var, C110653f fVar) {
        C83780d1 d1Var;
        if (w0Var == null) {
            Log.m105928w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition failed, EditText is null");
            return false;
        }
        int inputId = w0Var.getInputId();
        WeakReference<C83780d1> weakReference = this.f311428o;
        if (weakReference == null || (d1Var = weakReference.get()) == null) {
            Log.m105929w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) failed, pageView is null", Integer.valueOf(inputId));
            return false;
        }
        C83873p2 p2Var = d1Var.f244556H;
        if (p2Var == null) {
            Log.m105929w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) failed, CustomViewContainer is null", Integer.valueOf(inputId));
            return false;
        }
        Boolean bool = fVar.f331049t;
        int i = (bool == null || !bool.booleanValue()) ? 0 : 4;
        boolean x = p2Var.mo116446x(inputId, new float[]{(float) fVar.f331034e.intValue(), (float) fVar.f331033d.intValue(), (float) fVar.f331031b.intValue(), (float) fVar.f331032c.intValue(), (float) 0}, i, fVar.f331053x, Boolean.FALSE);
        Log.m105925i("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) success = %s", Integer.valueOf(inputId), Boolean.valueOf(x));
        return x;
    }

    /* renamed from: j */
    public boolean mo148832j(C104930w0 w0Var, C110653f fVar) {
        C83780d1 d1Var;
        if (w0Var == null) {
            Log.m105928w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl failed, EditText is null");
            return false;
        }
        int i = fVar.f331017Q;
        WeakReference<C83780d1> weakReference = this.f311428o;
        if (weakReference == null || (d1Var = weakReference.get()) == null) {
            Log.m105929w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) failed, pageView is null", Integer.valueOf(i));
            return false;
        }
        C83873p2 p2Var = d1Var.f244556H;
        if (p2Var == null) {
            Log.m105929w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) failed, CustomViewContainer is null", Integer.valueOf(i));
            return false;
        }
        Boolean bool = fVar.f331049t;
        int i2 = (bool == null || !bool.booleanValue()) ? 0 : 4;
        int i3 = fVar.f331016P;
        float[] fArr = {(float) fVar.f331034e.intValue(), (float) fVar.f331033d.intValue(), (float) fVar.f331031b.intValue(), (float) fVar.f331032c.intValue(), (float) 0};
        Boolean bool2 = fVar.f331053x;
        boolean e = p2Var.mo116410e(w0Var, i, i3, fArr, i2, bool2 != null && bool2.booleanValue());
        Log.m105925i("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) success = %s, ", Integer.valueOf(i), Boolean.valueOf(e));
        return e;
    }

    /* renamed from: n */
    public synchronized C68717h1 mo148836n() {
        return null;
    }

    /* renamed from: z */
    public void mo148848z(C104930w0 w0Var) {
        if (w0Var == null) {
            Log.m105928w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl failed, EditText is null");
            return;
        }
        int inputId = w0Var.getInputId();
        w0Var.mo148799c(this.f311423g);
        WeakReference<C83780d1> weakReference = this.f311428o;
        C83780d1 d1Var = weakReference == null ? null : weakReference.get();
        if (d1Var == null) {
            Log.m105929w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) failed, pageView is null", Integer.valueOf(inputId));
            return;
        }
        C83873p2 p2Var = d1Var.f244556H;
        if (p2Var == null) {
            Log.m105929w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) failed, CustomViewContainer is null", Integer.valueOf(inputId));
        } else {
            Log.m105925i("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) success = %s", Integer.valueOf(inputId), Boolean.valueOf(p2Var.mo116441s(inputId)));
        }
    }
}
