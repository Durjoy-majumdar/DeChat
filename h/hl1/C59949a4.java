package hl1;

import am3.C54139a;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: hl1.a4 */
public final class C59949a4 implements C54139a.C54142c {

    /* renamed from: a */
    public final /* synthetic */ C59988k f171073a;

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f171074b;

    /* renamed from: c */
    public final /* synthetic */ Activity f171075c;

    /* renamed from: hl1.a4$a */
    public static final class C59950a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59988k f171076d;

        /* renamed from: e */
        public final /* synthetic */ Activity f171077e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59950a(C59988k kVar, Activity activity) {
            super(0);
            this.f171076d = kVar;
            this.f171077e = activity;
        }

        public Object invoke() {
            C59955b4.m69853b(this.f171076d, this.f171077e);
            return C13598b0.f38549a;
        }
    }

    public C59949a4(C59988k kVar, FrameLayout frameLayout, Activity activity) {
        this.f171073a = kVar;
        this.f171074b = frameLayout;
        this.f171075c = activity;
    }

    /* renamed from: a */
    public void mo74963a(View view, int i, ViewGroup viewGroup) {
        C13598b0 b0Var = null;
        ViewGroup viewGroup2 = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup2 != null) {
            C59988k kVar = this.f171073a;
            FrameLayout frameLayout = this.f171074b;
            C87412m.m108593f(frameLayout, "root");
            C59955b4.m69852a(kVar, "asyncInflateShoppingPlugin-" + Thread.currentThread().getName(), frameLayout, viewGroup2);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            C59988k kVar2 = this.f171073a;
            Activity activity = this.f171075c;
            Log.m105920e(kVar2.f171222i, "asyncInflateShoppingPlugin fail,view:" + view + '!');
            C61926c.m72668M(new C59950a(kVar2, activity));
        }
    }
}
