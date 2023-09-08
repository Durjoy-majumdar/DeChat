package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import bt0.C79811f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.appbrand.AppBrandFileCleaner;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.app.C1510o;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import p385u2.C111105a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/h4;", "Lcom/tencent/mm/plugin/appbrand/ui/j2;", "com/tencent/mm/plugin/appbrand/ui/j4", "B", "Lrx3/g;", "getKeyEventInterceptor", "()Lcom/tencent/mm/plugin/appbrand/ui/j4;", "keyEventInterceptor", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "value", "C", "Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "getRuntime", "()Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;", "setRuntime", "(Lcom/tencent/mm/plugin/appbrand/AppBrandRuntimeWC;)V", "runtime", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap;", "snapshot", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap;)V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.h4 */
public final class C84537h4 extends C1998j2 {

    /* renamed from: B */
    public final C13601g f246695B = C36568h.m40985a(new C84540b(this));

    /* renamed from: C */
    public AppBrandRuntimeWC f246696C;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.h4$a */
    public static final class C84538a implements View.OnAttachStateChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C84682u4 f246697d;

        /* renamed from: e */
        public final /* synthetic */ Context f246698e;

        /* renamed from: f */
        public final /* synthetic */ C79811f f246699f;

        /* renamed from: g */
        public final /* synthetic */ C84537h4 f246700g;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.h4$a$a */
        public static final class C84539a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C84537h4 f246701d;

            public C84539a(C84537h4 h4Var) {
                this.f246701d = h4Var;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/appbrand/ui/FakeNativeSnapshotDisplayLoadingSplash$1$onViewAttachedToWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                AppBrandRuntimeWC runtime = this.f246701d.getRuntime();
                if (runtime != null) {
                    runtime.mo113006E();
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/ui/FakeNativeSnapshotDisplayLoadingSplash$1$onViewAttachedToWindow$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C84538a(C84682u4 u4Var, Context context, C79811f fVar, C84537h4 h4Var) {
            this.f246697d = u4Var;
            this.f246698e = context;
            this.f246699f = fVar;
            this.f246700g = h4Var;
        }

        public void onViewAttachedToWindow(View view) {
            this.f246697d.setCloseButtonClickListener(new C84539a(this.f246700g));
            this.f246697d.setMainTitle(this.f246698e.getString(C0966R.string.f7810s8));
            this.f246697d.setForegroundStyle(C85875k4.m106211z() ? "white" : "black");
            this.f246697d.setBackgroundColor(C111105a.m151500b(this.f246698e, C0966R.color.a7_));
            this.f246697d.setLoadingIconVisibility(true);
            this.f246699f.mo109971P(this.f246697d.getBackgroundColor(), true ^ C85875k4.m106211z());
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.h4$b */
    public static final class C84540b extends C87413o implements C32224a<C84549j4> {

        /* renamed from: d */
        public final /* synthetic */ C84537h4 f246702d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C84540b(C84537h4 h4Var) {
            super(0);
            this.f246702d = h4Var;
        }

        public Object invoke() {
            return new C84549j4(this.f246702d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84537h4(Context context, Bitmap bitmap) {
        super(context, bitmap);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bitmap, AppBrandFileCleaner.f238098c);
        setPromptVisible(false);
        C84682u4 u4Var = new C84682u4(context);
        C79811f fVar = new C79811f(context);
        fVar.addView(u4Var);
        addView(fVar, new FrameLayout.LayoutParams(-1, -2));
        fVar.addOnAttachStateChangeListener(new C84538a(u4Var, context, fVar, this));
    }

    private final C84549j4 getKeyEventInterceptor() {
        return (C84549j4) ((C36570n) this.f246695B).getValue();
    }

    public static final void setCanShowAlphaCover(boolean z) {
        MultiProcessMMKV a = C1510o.f10864a.mo1516a();
        if (a != null) {
            a.putBoolean("FakeNativeSnapshotDisplayLoadingSplash_SHOW_ALPHA_COVER", z);
        }
    }

    /* renamed from: D */
    public void mo1911D(C32224a<C13598b0> aVar) {
        C84701w0.m104351b(this);
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: S */
    public String mo1898S() {
        StringBuilder sb = new StringBuilder();
        sb.append("FakeNativeSnapshotDisplayLoadingSplash:");
        AppBrandRuntimeWC appBrandRuntimeWC = this.f246696C;
        String str = appBrandRuntimeWC != null ? appBrandRuntimeWC.f238147j : null;
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        return sb.toString();
    }

    public final AppBrandRuntimeWC getRuntime() {
        return this.f246696C;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBrandRuntimeWC appBrandRuntimeWC = this.f246696C;
        if (appBrandRuntimeWC != null) {
            appBrandRuntimeWC.mo113016K0(getKeyEventInterceptor());
        }
    }

    public final void setRuntime(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f246696C = appBrandRuntimeWC;
        if (appBrandRuntimeWC != null) {
            appBrandRuntimeWC.mo113057h(4, 1, getKeyEventInterceptor());
        }
    }
}
