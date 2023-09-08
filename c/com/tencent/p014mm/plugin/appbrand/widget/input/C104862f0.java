package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.f0 */
public abstract class C104862f0 extends C104930w0 {
    public C104862f0(Context context) {
        super(context);
        super.setHorizontallyScrolling(true);
    }

    /* renamed from: a */
    public boolean mo148793a() {
        return false;
    }

    public boolean canScrollVertically(int i) {
        return false;
    }

    public final boolean isLaidOut() {
        boolean isLaidOut = super.isLaidOut();
        if (isLaidOut && isFocusable()) {
            if (!(getBottom() > getTop() && getRight() > getLeft())) {
                try {
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    if (stackTrace == null || stackTrace.length < 3 || !stackTrace[2].getMethodName().equals("canTakeFocus")) {
                        return isLaidOut;
                    }
                    return false;
                } catch (Throwable unused) {
                }
            }
        }
        return isLaidOut;
    }

    /* renamed from: o */
    public final boolean mo148774o() {
        return false;
    }

    public void setGravity(int i) {
        super.setGravity((i & -81 & -49) | 16);
    }

    public final void setInputType(int i) {
        super.setInputType(i & -131073);
    }

    public final void setSingleLine(boolean z) {
    }
}
