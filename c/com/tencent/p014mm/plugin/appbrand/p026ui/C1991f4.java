package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import in3.C87763b;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p849e3.C107168a0;
import p849e3.C107207u;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/f4;", "Lin3/b;", "Lcom/tencent/mm/plugin/appbrand/ui/k4;", "Landroid/view/View;", "getView", "", "w", "Lrx3/g;", "get_instanceDescription", "()Ljava/lang/String;", "_instanceDescription", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "luggage-wxa-app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.f4 */
public abstract class C1991f4 extends C87763b implements C84560k4 {

    /* renamed from: w */
    public final C13601g f11915w = C36568h.m40986b(C13602i.NONE, new C1992a(this));

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.f4$a */
    public static final class C1992a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C1991f4 f11916d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1992a(C1991f4 f4Var) {
            super(0);
            this.f11916d = f4Var;
        }

        public Object invoke() {
            return this.f11916d.mo1898S();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1991f4(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        mo122166H(true);
    }

    private final String get_instanceDescription() {
        return (String) this.f11915w.getValue();
    }

    /* renamed from: S */
    public abstract String mo1898S();

    /* renamed from: T */
    public final void mo1899T(String str) {
        Log.m105924i("Luggage.Wxa.BaseFrameLayoutLoadingSplashImpl", str + " [with instance:" + get_instanceDescription() + ']');
    }

    public View getView() {
        return this;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo1899T("onAttachedToWindow");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo1899T("onDetachedFromWindow");
    }

    public boolean post(Runnable runnable) {
        if (runnable == null) {
            return false;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(this)) {
            return super.post(runnable);
        }
        MMHandlerThread.postToMainThread(runnable);
        return true;
    }

    public boolean postDelayed(Runnable runnable, long j) {
        if (runnable == null) {
            return false;
        }
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        if (C107207u.C107211e.m145207b(this)) {
            return super.postDelayed(runnable, j);
        }
        MMHandlerThread.postToMainThreadDelayed(runnable, j);
        return true;
    }

    public void postOnAnimation(Runnable runnable) {
        if (runnable != null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(this)) {
                super.postOnAnimation(runnable);
            } else {
                MMHandlerThread.postToMainThread(runnable);
            }
        }
    }

    public void postOnAnimationDelayed(Runnable runnable, long j) {
        if (runnable != null) {
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (C107207u.C107211e.m145207b(this)) {
                super.postOnAnimationDelayed(runnable, j);
            } else {
                MMHandlerThread.postToMainThreadDelayed(runnable, j);
            }
        }
    }

    public abstract /* synthetic */ void setProgress(int i);
}
