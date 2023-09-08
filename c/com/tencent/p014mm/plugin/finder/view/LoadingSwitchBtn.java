package com.tencent.p014mm.plugin.finder.view;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import it1.C9247b;
import kotlin.Metadata;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B!\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/LoadingSwitchBtn;", "Lcom/tencent/mm/ui/widget/MMSwitchBtn;", "Lit1/b;", "loadingComponent", "Lrx3/b0;", "setDelayLoading", "L", "Lit1/b;", "getLoadingComponent", "()Lit1/b;", "setLoadingComponent", "(Lit1/b;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.LoadingSwitchBtn */
public final class LoadingSwitchBtn extends MMSwitchBtn {

    /* renamed from: K */
    public final String f18031K = "Finder.LoadingSwitchBtn";

    /* renamed from: L */
    public C9247b f18032L;

    /* renamed from: com.tencent.mm.plugin.finder.view.LoadingSwitchBtn$a */
    public static final class C4001a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C32226l f18033d;

        public C4001a(C32226l lVar) {
            this.f18033d = lVar;
        }

        public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
            this.f18033d.invoke(dialogInterface);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.view.LoadingSwitchBtn$b */
    public static final class C4002b implements MMSwitchBtn.C7041b {

        /* renamed from: a */
        public final /* synthetic */ C32224a<Boolean> f18034a;

        /* renamed from: b */
        public final /* synthetic */ LoadingSwitchBtn f18035b;

        /* renamed from: c */
        public final /* synthetic */ C0000n0 f18036c;

        /* renamed from: d */
        public final /* synthetic */ C32227p<Boolean, C15601d<? super Boolean>, Object> f18037d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.view.LoadingSwitchBtn$setSwitchChangedListener$1$1", mo125469f = "LoadingSwitchBtn.kt", mo125470l = {62}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.view.LoadingSwitchBtn$b$a */
        public static final class C4003a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f18038d;

            /* renamed from: e */
            public final /* synthetic */ LoadingSwitchBtn f18039e;

            /* renamed from: f */
            public final /* synthetic */ C32227p<Boolean, C15601d<? super Boolean>, Object> f18040f;

            /* renamed from: g */
            public final /* synthetic */ boolean f18041g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4003a(LoadingSwitchBtn loadingSwitchBtn, C32227p<? super Boolean, ? super C15601d<? super Boolean>, ? extends Object> pVar, boolean z, C15601d<? super C4003a> dVar) {
                super(2, dVar);
                this.f18039e = loadingSwitchBtn;
                this.f18040f = pVar;
                this.f18041g = z;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C4003a(this.f18039e, this.f18040f, this.f18041g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C4003a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f18038d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Log.m105924i(this.f18039e.f18031K, "startLoading");
                    C9247b loadingComponent = this.f18039e.getLoadingComponent();
                    if (loadingComponent != null) {
                        loadingComponent.begin();
                    }
                    C32227p<Boolean, C15601d<? super Boolean>, Object> pVar = this.f18040f;
                    Boolean valueOf = Boolean.valueOf(this.f18041g);
                    this.f18038d = 1;
                    obj = pVar.invoke(valueOf, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C9247b loadingComponent2 = this.f18039e.getLoadingComponent();
                if (loadingComponent2 != null) {
                    loadingComponent2.mo8913b();
                }
                Log.m105924i(this.f18039e.f18031K, "endLoading");
                this.f18039e.setEnabled(true);
                if (!booleanValue) {
                    Log.m105924i(this.f18039e.f18031K, "reset state");
                    this.f18039e.setCheck(!this.f18041g);
                }
                return C13598b0.f38549a;
            }
        }

        public C4002b(C32224a<Boolean> aVar, LoadingSwitchBtn loadingSwitchBtn, C0000n0 n0Var, C32227p<? super Boolean, ? super C15601d<? super Boolean>, ? extends Object> pVar) {
            this.f18034a = aVar;
            this.f18035b = loadingSwitchBtn;
            this.f18036c = n0Var;
            this.f18037d = pVar;
        }

        public final void onStatusChange(boolean z) {
            if (z == this.f18034a.invoke().booleanValue()) {
                String str = this.f18035b.f18031K;
                Log.m105924i(str, "setSwitchListener isCheck:" + z + " equals currentState, skip");
            } else if (!C53930o0.m60560g(this.f18036c)) {
                String str2 = this.f18035b.f18031K;
                Log.m105924i(str2, "setSwitchListener isCheck:" + z + " but !scope.isActive");
            } else {
                String str3 = this.f18035b.f18031K;
                Log.m105924i(str3, "click:" + z);
                this.f18035b.setEnabled(false);
                C0000n0 n0Var = this.f18036c;
                C53896h0 h0Var = C53872d1.f151117a;
                C53895h.m60466d(n0Var, C58901s.f168555a, (C53934p0) null, new C4003a(this.f18035b, this.f18037d, z, (C15601d<? super C4003a>) null), 2, (Object) null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingSwitchBtn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    /* renamed from: f */
    public final void mo4816f(C0000n0 n0Var, C32224a<Boolean> aVar, C32227p<? super Boolean, ? super C15601d<? super Boolean>, ? extends Object> pVar) {
        C87412m.m108594g(n0Var, "scope");
        C87412m.m108594g(aVar, "currentState");
        C87412m.m108594g(pVar, "onChanged");
        setEnabled(true);
        setSwitchListener(new C4002b(aVar, this, n0Var, pVar));
    }

    public final C9247b getLoadingComponent() {
        return this.f18032L;
    }

    public final void setDelayLoading(C9247b bVar) {
        this.f18032L = bVar;
    }

    public final void setLoadingComponent(C9247b bVar) {
        this.f18032L = bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadingSwitchBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}
