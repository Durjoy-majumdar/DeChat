package com.tencent.p014mm.plugin.finder.live.view;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import cj1.C54795n5;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import eb0.C31543z5;
import er1.C58739j4;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kotlin.ResultKt;
import nj3.C76912y0;
import o40.C61926c;
import pe3.C89349b;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49797i41;
import te3.C50401mh0;
import te3.C50493n41;
import te3.C50634o41;
import te3.C64370fp1;
import te3.C64399gj1;
import te3.C64857yh3;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import y50.C15936n0;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103B#\b\u0016\u0012\u0006\u0010/\u001a\u00020.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\b2\u00106R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR0\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR#\u0010\"\u001a\n \u001f*\u0004\u0018\u00010\u00020\u00028BX\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R#\u0010'\u001a\n \u001f*\u0004\u0018\u00010#0#8BX\u0002¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b%\u0010&R#\u0010*\u001a\n \u001f*\u0004\u0018\u00010#0#8BX\u0002¢\u0006\f\n\u0004\b(\u0010\u0004\u001a\u0004\b)\u0010&R#\u0010-\u001a\n \u001f*\u0004\u0018\u00010#0#8BX\u0002¢\u0006\f\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010&¨\u00067"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewGroup;", "e", "Lrx3/g;", "getRoot", "()Landroid/view/ViewGroup;", "root", "", "g", "getDURATION_MAX", "()J", "DURATION_MAX", "Lkotlin/Function1;", "Lte3/fp1;", "Lrx3/b0;", "i", "Lfy3/l;", "getNotifyRecordBtnCallBack", "()Lfy3/l;", "setNotifyRecordBtnCallBack", "(Lfy3/l;)V", "notifyRecordBtnCallBack", "La14/z1;", "j", "La14/z1;", "getCountdownJob", "()La14/z1;", "setCountdownJob", "(La14/z1;)V", "countdownJob", "kotlin.jvm.PlatformType", "n", "getRecordLaunchView", "recordLaunchView", "Landroid/view/View;", "o", "getRecordingView", "()Landroid/view/View;", "recordingView", "p", "getRecordFinishView", "recordFinishView", "q", "getRecordGeneratingView", "recordGeneratingView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView */
public final class FinderLiveProductRecordView extends FrameLayout {

    /* renamed from: r */
    public static final /* synthetic */ int f159795r = 0;

    /* renamed from: d */
    public final String f159796d = "FinderLiveProductRecordView";

    /* renamed from: e */
    public final C13601g f159797e = C36568h.m40985a(new C56031a2(this));

    /* renamed from: f */
    public Context f159798f;

    /* renamed from: g */
    public final C13601g f159799g = C36568h.m40985a(C3226p1.f15346d);

    /* renamed from: h */
    public C64370fp1 f159800h;

    /* renamed from: i */
    public C32226l<? super C64370fp1, C13598b0> f159801i;

    /* renamed from: j */
    public C53973z1 f159802j;

    /* renamed from: n */
    public final C13601g f159803n = C36568h.m40985a(new C56111x1(this));

    /* renamed from: o */
    public final C13601g f159804o = C36568h.m40985a(new C56115z1(this));

    /* renamed from: p */
    public final C13601g f159805p = C36568h.m40985a(new C56101t1(this));

    /* renamed from: q */
    public final C13601g f159806q = C36568h.m40985a(new C56103u1(this));

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView$updateStatus$1$1", mo125469f = "FinderLiveProductRecordView.kt", mo125470l = {289}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView$a */
    public static final class C56023a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f159807d;

        /* renamed from: e */
        public int f159808e;

        /* renamed from: f */
        public final /* synthetic */ C64857yh3 f159809f;

        /* renamed from: g */
        public final /* synthetic */ FinderLiveProductRecordView f159810g;

        /* renamed from: h */
        public final /* synthetic */ TextView f159811h;

        /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView$a$a */
        public static final class C56024a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ TextView f159812d;

            /* renamed from: e */
            public final /* synthetic */ C8478d0 f159813e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56024a(TextView textView, C8478d0 d0Var) {
                super(0);
                this.f159812d = textView;
                this.f159813e = d0Var;
            }

            public Object invoke() {
                this.f159812d.setText(C15936n0.C15937a.m14866a(C15936n0.f42815a, this.f159813e.f27483d, XVFSFile.PATH_SEPARATOR, false, false, false, 24, (Object) null));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56023a(C64857yh3 yh32, FinderLiveProductRecordView finderLiveProductRecordView, TextView textView, C15601d<? super C56023a> dVar) {
            super(2, dVar);
            this.f159809f = yh32;
            this.f159810g = finderLiveProductRecordView;
            this.f159811h = textView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C56023a(this.f159809f, this.f159810g, this.f159811h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C56023a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C8478d0 d0Var;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f159808e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C8478d0 d0Var2 = new C8478d0();
                d0Var2.f27483d = C31543z5.m39455e() - this.f159809f.f186534f;
                d0Var = d0Var2;
            } else if (i == 1) {
                d0Var = (C8478d0) this.f159807d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            while (((long) d0Var.f27483d) < this.f159810g.getDURATION_MAX()) {
                d0Var.f27483d = C31543z5.m39455e() - this.f159809f.f186534f;
                C61926c.m72668M(new C56024a(this.f159811h, d0Var));
                this.f159807d = d0Var;
                this.f159808e = 1;
                if (C53965x0.m60607b(1000, this) == aVar) {
                    return aVar;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveProductRecordView$b */
    public static final class C56025b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveProductRecordView f159814d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56025b(FinderLiveProductRecordView finderLiveProductRecordView) {
            super(0);
            this.f159814d = finderLiveProductRecordView;
        }

        public Object invoke() {
            FinderLiveProductRecordView.m64007e(this.f159814d, C0966R.string.lo6);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveProductRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f159798f = context;
    }

    /* renamed from: c */
    public static final void m64005c(FinderLiveProductRecordView finderLiveProductRecordView, int i, long j, C32227p pVar) {
        C89349b bVar;
        String str;
        FinderLiveProductRecordView finderLiveProductRecordView2 = finderLiveProductRecordView;
        int i2 = i;
        long j2 = j;
        Log.m105924i(finderLiveProductRecordView2.f159796d, "[modRecordCgi], cmdid:" + i2 + ", productId:" + j2);
        C8479f0 f0Var = new C8479f0();
        C50401mh0 mh02 = new C50401mh0();
        switch (i2) {
            case 105:
                C58739j4 j4Var = C58739j4.f168176a;
                C50493n41 n412 = new C50493n41();
                n412.f138404d = j2;
                C13598b0 b0Var = C13598b0.f38549a;
                bVar = j4Var.mo83710g0(n412);
                break;
            case 106:
                C58739j4 j4Var2 = C58739j4.f168176a;
                C50634o41 o412 = new C50634o41();
                o412.f138954d = j2;
                C13598b0 b0Var2 = C13598b0.f38549a;
                bVar = j4Var2.mo83710g0(o412);
                break;
            case 107:
                C58739j4 j4Var3 = C58739j4.f168176a;
                C49797i41 i412 = new C49797i41();
                i412.f135101d = j2;
                C13598b0 b0Var3 = C13598b0.f38549a;
                bVar = j4Var3.mo83710g0(i412);
                break;
            default:
                bVar = null;
                break;
        }
        mh02.f138029e = bVar;
        mh02.f138028d = i2;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C55001u uVar = (C55001u) finderLiveService.mo77630e(C55001u.class);
        if (uVar != null) {
            C0001s1 s1Var = C0001s1.f0d;
            C53896h0 h0Var = C53872d1.f151117a;
            C53973z1 d = C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C3230r1(f0Var, finderLiveProductRecordView2, (C15601d<? super C3230r1>) null), 2, (Object) null);
            C54795n5 n5Var = FinderLiveService.f159396y;
            if (n5Var != null) {
                Context context = finderLiveProductRecordView.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                MMActivity mMActivity = (MMActivity) context;
                long j3 = uVar.f154420q.f182392d;
                long j4 = uVar.f154416j;
                C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
                if (oVar == null || (str = oVar.f154345o) == null) {
                    str = "";
                }
                n5Var.mo75737h(mMActivity, j3, j4, str, mh02, new C3228q1(d, f0Var, pVar, j, finderLiveProductRecordView, i));
            }
        }
    }

    /* renamed from: d */
    public static final void m64006d(FinderLiveProductRecordView finderLiveProductRecordView, C64370fp1 fp12, int i) {
        String str = finderLiveProductRecordView.f159796d;
        Log.m105924i(str, "[notifyRecordChange] id: " + fp12.f183176d + ", status:" + i);
        C64857yh3 yh32 = fp12.f183160E;
        if (yh32 != null) {
            yh32.f186537i = i;
        }
        C32226l<? super C64370fp1, C13598b0> lVar = finderLiveProductRecordView.f159801i;
        if (lVar != null) {
            lVar.invoke(fp12);
        }
    }

    /* renamed from: e */
    public static final void m64007e(FinderLiveProductRecordView finderLiveProductRecordView, int i) {
        Toast makeText = C76912y0.makeText(finderLiveProductRecordView.getContext(), (CharSequence) finderLiveProductRecordView.getContext().getString(i), 0);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* access modifiers changed from: private */
    public final long getDURATION_MAX() {
        return ((Number) this.f159799g.getValue()).longValue();
    }

    private final View getRecordFinishView() {
        return (View) this.f159805p.getValue();
    }

    private final View getRecordGeneratingView() {
        return (View) this.f159806q.getValue();
    }

    private final ViewGroup getRecordLaunchView() {
        return (ViewGroup) this.f159803n.getValue();
    }

    private final View getRecordingView() {
        return (View) this.f159804o.getValue();
    }

    /* access modifiers changed from: private */
    public final ViewGroup getRoot() {
        Object value = this.f159797e.getValue();
        C87412m.m108593f(value, "<get-root>(...)");
        return (ViewGroup) value;
    }

    /* renamed from: f */
    public final void mo77967f() {
        Boolean bool;
        C64399gj1 gj12;
        C54979h1 h1Var = (C54979h1) FinderLiveService.f159376d.mo77630e(C54979h1.class);
        int i = 0;
        if (h1Var == null || (gj12 = h1Var.f154113E) == null) {
            bool = null;
        } else {
            boolean z = true;
            if (!(gj12.f183344e == 1 && gj12.f183343d == 1)) {
                z = false;
            }
            bool = Boolean.valueOf(z);
        }
        ViewGroup recordLaunchView = getRecordLaunchView();
        if (!C87412m.m108589b(bool, Boolean.TRUE)) {
            i = 8;
        }
        recordLaunchView.setVisibility(i);
    }

    /* renamed from: g */
    public final void mo77968g(C64370fp1 fp12) {
        C64399gj1 gj12;
        C64370fp1 fp13 = fp12;
        C87412m.m108594g(fp13, "productInfo");
        String str = this.f159796d;
        StringBuilder sb = new StringBuilder();
        sb.append("[updateStatus] productId:");
        sb.append(fp13.f183176d);
        sb.append(", replayStatus:");
        C64857yh3 yh32 = fp13.f183160E;
        sb.append(yh32 != null ? Integer.valueOf(yh32.f186537i) : "null");
        Log.m105924i(str, sb.toString());
        int childCount = getRoot().getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getRoot().getChildAt(i);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView", "updateStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(childAt, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView", "updateStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C53973z1 z1Var = this.f159802j;
        C13598b0 b0Var = null;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f159800h = fp13;
        C64857yh3 yh33 = fp13.f183160E;
        if (yh33 != null) {
            int i2 = yh33.f186537i;
            if (!(i2 == 0 || i2 == 1)) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            mo77967f();
                        } else if (i2 != 100) {
                            if (i2 != 101) {
                                if (i2 == 1000) {
                                    View recordingView = getRecordingView();
                                    C9556a aVar2 = new C9556a();
                                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                    aVar2.mo10233c(0);
                                    View view = recordingView;
                                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView", "updateStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    recordingView.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView", "updateStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    TextView textView = (TextView) getRecordingView().findViewById(C0966R.C0970id.dwt);
                                    C54979h1 h1Var = (C54979h1) FinderLiveService.f159376d.mo77630e(C54979h1.class);
                                    if (!(h1Var == null || (gj12 = h1Var.f154113E) == null || gj12.f183344e != 0)) {
                                        z = true;
                                    }
                                    if (z) {
                                        textView.setText(getContext().getString(C0966R.string.e3g));
                                        getRecordingView().setBackgroundDrawable((Drawable) null);
                                    } else {
                                        getRecordingView().setBackgroundDrawable(getContext().getDrawable(C0966R.C0969drawable.a1d));
                                        this.f159802j = C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C56023a(yh33, this, textView, (C15601d<? super C56023a>) null), 3, (Object) null);
                                    }
                                }
                            }
                        }
                    }
                    C61926c.m72668M(new C56025b(this));
                    mo77967f();
                } else {
                    View recordFinishView = getRecordFinishView();
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    C117292a.m165358d(recordFinishView, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView", "updateStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    recordFinishView.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(recordFinishView, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView", "updateStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((TextView) getRecordFinishView().findViewById(C0966R.C0970id.dwq)).setText(C15936n0.C15937a.m14866a(C15936n0.f42815a, yh33.f186538j, XVFSFile.PATH_SEPARATOR, false, false, false, 24, (Object) null));
                }
                b0Var = C13598b0.f38549a;
            }
            View recordGeneratingView = getRecordGeneratingView();
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
            aVar4.mo10233c(0);
            C117292a.m165358d(recordGeneratingView, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView", "updateStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            recordGeneratingView.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(recordGeneratingView, "com/tencent/mm/plugin/finder/live/view/FinderLiveProductRecordView", "updateStatus", "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            mo77967f();
        }
    }

    public final C53973z1 getCountdownJob() {
        return this.f159802j;
    }

    public final C32226l<C64370fp1, C13598b0> getNotifyRecordBtnCallBack() {
        return this.f159801i;
    }

    public final void setCountdownJob(C53973z1 z1Var) {
        this.f159802j = z1Var;
    }

    public final void setNotifyRecordBtnCallBack(C32226l<? super C64370fp1, C13598b0> lVar) {
        this.f159801i = lVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveProductRecordView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f159798f = context;
    }
}
