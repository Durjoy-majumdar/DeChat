package com.tencent.p014mm.plugin.sns.cover.preview;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsCoverActionStruct;
import com.tencent.p014mm.p136ui.C74783i3;
import com.tencent.p014mm.plugin.sns.cover.api.AbsSnsBackPreview;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import ct2.C97367b;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import kotlin.ResultKt;
import os2.C100422y;
import os2.C100423z;
import pr2.C100846e;
import pr2.C100847f;
import pr2.C100848g;
import qr2.C36069a;
import rx3.C13598b0;
import tr2.C101917a;
import tr2.C52362b;
import ur2.C102074a;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001b\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.¢\u0006\u0004\b0\u00101J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bR*\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R6\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u00062"}, mo182094d2 = {"Lcom/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout;", "Landroid/widget/FrameLayout;", "Lpr2/g;", "Landroidx/lifecycle/a0;", "Los2/y;", "", "getPreviewType", "Lpr2/f;", "getStatus", "Lpr2/e;", "getSnsCoverReporter", "", "isPreview", "Lrx3/b0;", "setPreview", "Lkotlin/Function0;", "q", "Lfy3/a;", "getCoverClickListener", "()Lfy3/a;", "setCoverClickListener", "(Lfy3/a;)V", "coverClickListener", "Lkotlin/Function2;", "r", "Lfy3/p;", "getOnViewSizeChanged", "()Lfy3/p;", "setOnViewSizeChanged", "(Lfy3/p;)V", "onViewSizeChanged", "t", "I", "getExternalMargin", "()I", "setExternalMargin", "(I)V", "externalMargin", "Lur2/a;", "u", "Lur2/a;", "getCoverReporter", "()Lur2/a;", "coverReporter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout */
public final class SnsCoverContainerLayout extends FrameLayout implements C100848g, C0120a0<C100422y> {

    /* renamed from: d */
    public ViewGroup f274635d;

    /* renamed from: e */
    public AbsSnsBackPreview f274636e;

    /* renamed from: f */
    public final View f274637f;

    /* renamed from: g */
    public final View f274638g;

    /* renamed from: h */
    public C100847f f274639h = new C100847f(true, false);

    /* renamed from: i */
    public float f274640i;

    /* renamed from: j */
    public float f274641j;

    /* renamed from: n */
    public int f274642n;

    /* renamed from: o */
    public int f274643o;

    /* renamed from: p */
    public int f274644p;

    /* renamed from: q */
    public C32224a<C13598b0> f274645q;

    /* renamed from: r */
    public C32227p<? super Integer, ? super Integer, C13598b0> f274646r;

    /* renamed from: s */
    public C100422y f274647s;

    /* renamed from: t */
    public int f274648t;

    /* renamed from: u */
    public final C102074a f274649u;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1", mo125469f = "SnsCoverContainerLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$a */
    public static final class C94803a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ AbsSnsBackPreview f274650d;

        /* renamed from: e */
        public final /* synthetic */ C100422y f274651e;

        /* renamed from: f */
        public final /* synthetic */ SnsCoverContainerLayout f274652f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94803a(AbsSnsBackPreview absSnsBackPreview, C100422y yVar, SnsCoverContainerLayout snsCoverContainerLayout, C15601d<? super C94803a> dVar) {
            super(2, dVar);
            this.f274650d = absSnsBackPreview;
            this.f274651e = yVar;
            this.f274652f = snsCoverContainerLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
            C94803a aVar = new C94803a(this.f274650d, this.f274651e, this.f274652f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
            Object invokeSuspend = ((C94803a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
            ResultKt.throwOnFailure(obj);
            AbsSnsBackPreview absSnsBackPreview = this.f274650d;
            if (absSnsBackPreview != null) {
                absSnsBackPreview.loadCover(this.f274651e);
            }
            C100422y yVar = this.f274651e;
            if (yVar != null) {
                SnsCoverContainerLayout snsCoverContainerLayout = this.f274652f;
                C102074a coverReporter = snsCoverContainerLayout.getCoverReporter();
                SnsMethodCalculate.markStartTimeMs("access$getSnsCoverStatus$p", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
                C100847f fVar = snsCoverContainerLayout.f274639h;
                SnsMethodCalculate.markEndTimeMs("access$getSnsCoverStatus$p", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
                coverReporter.mo141570j(yVar, !fVar.f295361b);
                C102074a coverReporter2 = snsCoverContainerLayout.getCoverReporter();
                String yVar2 = yVar.toString();
                C87412m.m108593f(yVar2, "it.toString()");
                coverReporter2.mo141567g(yVar2);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout$updateBackView$1");
            return b0Var;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnsCoverContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        SnsMethodCalculate.markStartTimeMs("getBackWidthAndHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        int i = C74783i3.m89537a(context).f24704a;
        int[] iArr = {i, 0};
        iArr[1] = (int) (((float) i) * 1.7777778f);
        SnsMethodCalculate.markEndTimeMs("getBackWidthAndHeight", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        int i2 = iArr[1];
        this.f274642n = i2;
        this.f274643o = i2;
        this.f274649u = new C102074a();
        View view = new View(context);
        this.f274638g = view;
        View view2 = new View(context);
        this.f274637f = view2;
        view.setBackgroundResource(C0966R.color.BW_20);
        view2.setBackgroundResource(C0966R.color.acx);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f274643o);
        addView(view2, layoutParams);
        addView(view, layoutParams);
        C100423z Ux0 = C94866e1.Ux0();
        Ux0.getClass();
        SnsMethodCalculate.markStartTimeMs("getViewModel", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        C97367b bVar = Ux0.f294200f;
        SnsMethodCalculate.markEndTimeMs("getViewModel", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
        bVar.getClass();
        SnsMethodCalculate.markStartTimeMs("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        C54219z<C100422y> zVar = bVar.f285849e;
        SnsMethodCalculate.markEndTimeMs("getUserCover", "com.tencent.mm.plugin.sns.storage.cover.SnsCoverViewModel");
        zVar.observeForever(this);
    }

    /* renamed from: a */
    public final void mo130663a() {
        SnsMethodCalculate.markStartTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        Log.m105924i("MicroMsg.SnsCoverContainerLayout", '[' + hashCode() + "] onPostClose");
        View view = this.f274638g;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout", "onPostClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/sns/cover/preview/SnsCoverContainerLayout", "onPostClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f274639h.f295360a = true;
        AbsSnsBackPreview absSnsBackPreview = this.f274636e;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onPostClose();
        }
        SnsMethodCalculate.markEndTimeMs("onPostClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    /* renamed from: b */
    public final void mo130664b() {
        SnsMethodCalculate.markStartTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        Log.m105924i("MicroMsg.SnsCoverContainerLayout", '[' + hashCode() + "] onPreClose");
        AbsSnsBackPreview absSnsBackPreview = this.f274636e;
        if (absSnsBackPreview != null) {
            absSnsBackPreview.onPreClose();
        }
        SnsMethodCalculate.markEndTimeMs("onPreClose", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    /* renamed from: c */
    public final void mo130665c(boolean z, String str) {
        SnsMethodCalculate.markStartTimeMs("setCoverReportData", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        C87412m.m108594g(str, "userName");
        SnsReportHelper snsReportHelper = SnsReportHelper.f275506m0;
        boolean z2 = !this.f274639h.f295361b;
        snsReportHelper.getClass();
        SnsMethodCalculate.markStartTimeMs("setSnsCoverActionData", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (z2) {
            snsReportHelper.f275532Z.f265978d = 1;
        } else if (z) {
            snsReportHelper.f275532Z.f265978d = 2;
        } else {
            snsReportHelper.f275532Z.f265978d = 3;
        }
        SnsCoverActionStruct snsCoverActionStruct = snsReportHelper.f275532Z;
        snsCoverActionStruct.f265980f = snsCoverActionStruct.mo86045b("OwnerUsername", str, true);
        SnsMethodCalculate.markEndTimeMs("setSnsCoverActionData", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        SnsMethodCalculate.markEndTimeMs("setCoverReportData", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    /* renamed from: d */
    public final void mo130666d(C100422y yVar) {
        AbsSnsBackPreview absSnsBackPreview;
        C100422y yVar2 = yVar;
        SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        Log.m105924i("MicroMsg.SnsCoverContainerLayout", "updateBackView info:" + yVar2 + "  useNewVersion:" + C36069a.f96150a.mo60517b());
        SnsMethodCalculate.markStartTimeMs("replaceBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.f274647s = yVar2;
        int type = yVar2 != null ? yVar.getType() : 0;
        View childAt = getChildAt(0);
        boolean z = childAt instanceof AbsSnsBackPreview;
        if (z) {
            absSnsBackPreview = (AbsSnsBackPreview) childAt;
            if (absSnsBackPreview.getType() == type) {
                SnsMethodCalculate.markEndTimeMs("replaceBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
                C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151117a, (C53934p0) null, new C94803a(absSnsBackPreview, yVar2, this, (C15601d<? super C94803a>) null), 2, (Object) null);
                SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            }
        }
        if (z) {
            AbsSnsBackPreview absSnsBackPreview2 = (AbsSnsBackPreview) childAt;
            absSnsBackPreview2.onPause();
            absSnsBackPreview2.onDestroy();
            removeViewAt(0);
        }
        AbsSnsBackPreview absSnsBackPreview3 = this.f274636e;
        float translationY = absSnsBackPreview3 != null ? absSnsBackPreview3.getTranslationY() : 0.0f;
        C101917a aVar = C101917a.f300080a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        AbsSnsBackPreview a = aVar.mo141418a(context, type);
        this.f274636e = a;
        if (a != null) {
            a.setCoverFoldStatusProvider(this);
        }
        SnsReportHelper.f275506m0.mo131342C().f265979e = type;
        SnsReportHelper.f275506m0.mo131376i(1);
        AbsSnsBackPreview absSnsBackPreview4 = this.f274636e;
        if (absSnsBackPreview4 != null) {
            absSnsBackPreview4.setTranslationY(translationY);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, this.f274642n);
        AbsSnsBackPreview absSnsBackPreview5 = this.f274636e;
        if (absSnsBackPreview5 != null) {
            absSnsBackPreview5.setOnClickListener(new C52362b(this));
        }
        addView(this.f274636e, 0, layoutParams);
        AbsSnsBackPreview absSnsBackPreview6 = this.f274636e;
        View findViewById = absSnsBackPreview6 != null ? absSnsBackPreview6.findViewById(C0966R.C0970id.jsq) : null;
        if (findViewById != null) {
            findViewById.setBackgroundResource(C0966R.C0969drawable.atd);
        }
        AbsSnsBackPreview absSnsBackPreview7 = this.f274636e;
        View findViewById2 = absSnsBackPreview7 != null ? absSnsBackPreview7.findViewById(C0966R.C0970id.jsp) : null;
        if (findViewById2 != null) {
            findViewById2.setBackgroundResource(C0966R.C0969drawable.atb);
        }
        absSnsBackPreview = this.f274636e;
        SnsMethodCalculate.markEndTimeMs("replaceBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151117a, (C53934p0) null, new C94803a(absSnsBackPreview, yVar2, this, (C15601d<? super C94803a>) null), 2, (Object) null);
        SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final C32224a<C13598b0> getCoverClickListener() {
        SnsMethodCalculate.markStartTimeMs("getCoverClickListener", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        C32224a<C13598b0> aVar = this.f274645q;
        SnsMethodCalculate.markEndTimeMs("getCoverClickListener", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return aVar;
    }

    public final C102074a getCoverReporter() {
        SnsMethodCalculate.markStartTimeMs("getCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        C102074a aVar = this.f274649u;
        SnsMethodCalculate.markEndTimeMs("getCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return aVar;
    }

    public final int getExternalMargin() {
        SnsMethodCalculate.markStartTimeMs("getExternalMargin", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        int i = this.f274648t;
        SnsMethodCalculate.markEndTimeMs("getExternalMargin", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return i;
    }

    public final C32227p<Integer, Integer, C13598b0> getOnViewSizeChanged() {
        SnsMethodCalculate.markStartTimeMs("getOnViewSizeChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f274646r;
        SnsMethodCalculate.markEndTimeMs("getOnViewSizeChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return pVar;
    }

    public final int getPreviewType() {
        SnsMethodCalculate.markStartTimeMs("getPreviewType", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        AbsSnsBackPreview absSnsBackPreview = this.f274636e;
        int type = absSnsBackPreview != null ? absSnsBackPreview.getType() : 0;
        SnsMethodCalculate.markEndTimeMs("getPreviewType", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return type;
    }

    public C100846e getSnsCoverReporter() {
        SnsMethodCalculate.markStartTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        C102074a aVar = this.f274649u;
        SnsMethodCalculate.markEndTimeMs("getSnsCoverReporter", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return aVar;
    }

    public C100847f getStatus() {
        SnsMethodCalculate.markStartTimeMs("getStatus", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        C100847f fVar = this.f274639h;
        SnsMethodCalculate.markEndTimeMs("getStatus", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r6 = this;
            java.lang.String r0 = "onAttachedToWindow"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            super.onAttachedToWindow()
            r2 = r6
        L_0x000c:
            r3 = 0
            r2.setClipChildren(r3)
            r2.setClipToPadding(r3)
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            r4 = 0
            if (r3 == 0) goto L_0x001f
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x0020
        L_0x001f:
            r2 = r4
        L_0x0020:
            if (r2 == 0) goto L_0x0026
            boolean r3 = r2 instanceof com.tencent.p014mm.p136ui.base.MMOverScrollView
            if (r3 == 0) goto L_0x000c
        L_0x0026:
            if (r2 == 0) goto L_0x0041
            r6.f274635d = r2
            int r3 = r2.getId()
            r5 = 16908290(0x1020002, float:2.3877235E-38)
            if (r3 != r5) goto L_0x0034
            goto L_0x0041
        L_0x0034:
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x003f
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x0026
        L_0x003f:
            r2 = r4
            goto L_0x0026
        L_0x0041:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.cover.preview.SnsCoverContainerLayout.onAttachedToWindow():void");
    }

    public void onChanged(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        C100422y yVar = (C100422y) obj;
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        Log.m105924i("MicroMsg.SnsCoverContainerLayout", "onChanged current:" + this.f274647s + " update:" + yVar);
        C100422y yVar2 = this.f274647s;
        String str = null;
        String str2 = yVar2 != null ? yVar2.field_userName : null;
        if (yVar != null) {
            str = yVar.field_userName;
        }
        if (C87412m.m108589b(str2, str) && yVar != null) {
            this.f274647s = yVar;
            mo130666d(yVar);
        }
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        super.onDetachedFromWindow();
        this.f274635d = null;
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        super.onLayout(z, i, i2, i3, i4);
        Log.m105924i("MicroMsg.SnsCoverContainerLayout", "onLayout: " + z + ", " + i2 + ", " + i4);
        SnsMethodCalculate.markStartTimeMs("updateViewSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        if (!z) {
            SnsMethodCalculate.markEndTimeMs("updateViewSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        } else {
            getLocationInWindow(new int[2]);
            this.f274637f.setTranslationY((float) getHeight());
            this.f274638g.setTranslationY(-((float) this.f274643o));
            this.f274642n = (int) (((float) getWidth()) * 1.7777778f);
            int height = getHeight();
            ViewGroup viewGroup = this.f274635d;
            if (viewGroup != null) {
                height = viewGroup.getHeight() - getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3761db);
            }
            if (this.f274642n > height) {
                this.f274642n = height;
            }
            if (this.f274642n < getHeight()) {
                this.f274642n = getHeight();
            }
            this.f274640i = (float) (getHeight() - this.f274642n);
            int height2 = getHeight();
            int i6 = this.f274642n;
            this.f274641j = ((float) (height2 - i6)) / ((float) 2);
            this.f274644p = (i6 - getHeight()) - this.f274648t;
            Log.m105924i("MicroMsg.SnsCoverContainerLayout", "updateViewSize: " + this.f274642n + ", " + this.f274644p);
            AbsSnsBackPreview absSnsBackPreview = this.f274636e;
            Float f = null;
            ViewGroup.LayoutParams layoutParams = absSnsBackPreview != null ? absSnsBackPreview.getLayoutParams() : null;
            if (!(layoutParams == null || layoutParams.height == (i5 = this.f274642n))) {
                layoutParams.height = i5;
                AbsSnsBackPreview absSnsBackPreview2 = this.f274636e;
                if (absSnsBackPreview2 != null) {
                    absSnsBackPreview2.setLayoutParams(layoutParams);
                }
            }
            C32227p<? super Integer, ? super Integer, C13598b0> pVar = this.f274646r;
            if (pVar != null) {
                pVar.invoke(Integer.valueOf(this.f274642n), Integer.valueOf(this.f274644p));
            }
            AbsSnsBackPreview absSnsBackPreview3 = this.f274636e;
            if (absSnsBackPreview3 != null) {
                f = Float.valueOf(absSnsBackPreview3.getTranslationY());
            }
            if (C87412m.m108588a(f, 0.0f)) {
                SnsMethodCalculate.markStartTimeMs("opening", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
                AbsSnsBackPreview absSnsBackPreview4 = this.f274636e;
                if (absSnsBackPreview4 != null) {
                    float f2 = this.f274640i;
                    float f3 = this.f274641j;
                    absSnsBackPreview4.setTranslationY(((f2 - f3) * 0.0f) + f3);
                }
                SnsMethodCalculate.markEndTimeMs("opening", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            }
            SnsMethodCalculate.markEndTimeMs("updateViewSize", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void setCoverClickListener(C32224a<C13598b0> aVar) {
        SnsMethodCalculate.markStartTimeMs("setCoverClickListener", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.f274645q = aVar;
        SnsMethodCalculate.markEndTimeMs("setCoverClickListener", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void setExternalMargin(int i) {
        SnsMethodCalculate.markStartTimeMs("setExternalMargin", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.f274648t = i;
        SnsMethodCalculate.markEndTimeMs("setExternalMargin", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void setOnViewSizeChanged(C32227p<? super Integer, ? super Integer, C13598b0> pVar) {
        SnsMethodCalculate.markStartTimeMs("setOnViewSizeChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.f274646r = pVar;
        SnsMethodCalculate.markEndTimeMs("setOnViewSizeChanged", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }

    public final void setPreview(boolean z) {
        SnsMethodCalculate.markStartTimeMs("setPreview", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        this.f274639h.f295361b = z;
        SnsMethodCalculate.markEndTimeMs("setPreview", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
    }
}
