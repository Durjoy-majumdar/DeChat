package com.tencent.p014mm.plugin.finder.live.view;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import de3.C75375u;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveFoldTextView;", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "", "V", "Z", "isFolding", "()Z", "setFolding", "(Z)V", "Lkotlin/Function0;", "Lrx3/b0;", "W", "Lfy3/a;", "getUnFoldListener", "()Lfy3/a;", "setUnFoldListener", "(Lfy3/a;)V", "unFoldListener", "p0", "getFoldListener", "setFoldListener", "foldListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView */
public final class FinderLiveFoldTextView extends MMNeat7extView {
    @Deprecated

    /* renamed from: R0 */
    public static final String f15233R0 = (' ' + MMApplicationContext.getContext().getResources().getString(C0966R.string.e9l));
    @Deprecated

    /* renamed from: S0 */
    public static final String f15234S0 = (' ' + MMApplicationContext.getContext().getResources().getString(C0966R.string.dms));

    /* renamed from: Q0 */
    public int f15235Q0 = 5;

    /* renamed from: V */
    public boolean f15236V = true;

    /* renamed from: W */
    public C32224a<C13598b0> f15237W;

    /* renamed from: p0 */
    public C32224a<C13598b0> f15238p0;

    /* renamed from: x0 */
    public C75375u f15239x0 = new C75375u();

    /* renamed from: y0 */
    public C75375u f15240y0 = new C75375u();

    /* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView$a */
    public static final class C3193a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveFoldTextView f15241d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<CharSequence, C75375u> f15242e;

        /* renamed from: f */
        public final /* synthetic */ CharSequence f15243f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3193a(FinderLiveFoldTextView finderLiveFoldTextView, C32226l<? super CharSequence, ? extends C75375u> lVar, CharSequence charSequence) {
            super(0);
            this.f15241d = finderLiveFoldTextView;
            this.f15242e = lVar;
            this.f15243f = charSequence;
        }

        public Object invoke() {
            CharSequence charSequence;
            FinderLiveFoldTextView finderLiveFoldTextView = this.f15241d;
            C32226l<CharSequence, C75375u> lVar = this.f15242e;
            if (lVar == null || (charSequence = lVar.invoke(this.f15243f)) == null) {
                charSequence = this.f15243f;
            }
            finderLiveFoldTextView.mo104279b(charSequence);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderLiveFoldTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    public final C32224a<C13598b0> getFoldListener() {
        return this.f15238p0;
    }

    public final C32224a<C13598b0> getUnFoldListener() {
        return this.f15237W;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0105, code lost:
        if (r12 == null) goto L_0x0107;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3269o(java.lang.CharSequence r11, int r12, int r13, boolean r14, fy3.C32226l<? super java.lang.CharSequence, ? extends de3.C75375u> r15) {
        /*
            r10 = this;
            java.lang.String r0 = "originalText"
            gy3.C87412m.m108594g(r11, r0)
            com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView$a r0 = new com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView$a
            r0.<init>(r10, r15, r11)
            int r1 = r10.f15235Q0
            if (r1 > 0) goto L_0x0012
            r0.invoke()
            return
        L_0x0012:
            int r1 = r10.getPaddingLeft()
            int r13 = r13 - r1
            int r1 = r10.getPaddingRight()
            int r13 = r13 - r1
            r10.setMaxWidth(r13)
            r10.f15235Q0 = r12
            com.tencent.mm.ui.widget.MMNeat7extView r12 = new com.tencent.mm.ui.widget.MMNeat7extView
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r12.<init>(r1)
            r12.mo104279b(r11)
            r1 = 2147483647(0x7fffffff, float:NaN)
            yr3.a r2 = r12.mo154990i(r13, r1)
            r3 = r2
            com.tencent.neattextview.textview.layout.NeatLayout r3 = (com.tencent.neattextview.textview.layout.NeatLayout) r3
            int r4 = r3.f319992L
            int r5 = r10.f15235Q0
            r6 = 1
            r7 = 0
            if (r4 <= r5) goto L_0x0041
            r4 = 1
            goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "layout.lineCount: "
            r5.append(r8)
            int r3 = r3.f319992L
            r5.append(r3)
            java.lang.String r3 = " contentWidth:"
            r5.append(r3)
            r5.append(r13)
            java.lang.String r3 = " foldingMaxLines:"
            r5.append(r3)
            int r3 = r10.f15235Q0
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "Finder.FinderLiveFoldTextView"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r5, r3)
            if (r4 != 0) goto L_0x0072
            r0.invoke()
            return
        L_0x0072:
            int r3 = r10.f15235Q0
            int r3 = r3 - r6
            r4 = 1203982336(0x47c35000, float:100000.0)
            yr3.c r2 = (yr3.C112481c) r2
            int r2 = r2.mo109131o0(r3, r4)
            java.lang.CharSequence r2 = r11.subSequence(r7, r2)
            r3 = 0
        L_0x0083:
            int r4 = r2.length()
            if (r4 <= r3) goto L_0x017c
            int r4 = r2.length()
            int r4 = r4 - r3
            java.lang.CharSequence r4 = r2.subSequence(r7, r4)
            java.lang.String r4 = r4.toString()
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r4)
            java.lang.String r4 = f15233R0
            r5.append(r4)
            r12.mo104279b(r5)
            yr3.a r8 = r12.mo154990i(r13, r1)
            com.tencent.neattextview.textview.layout.NeatLayout r8 = (com.tencent.neattextview.textview.layout.NeatLayout) r8
            int r8 = r8.f319992L
            int r9 = r10.f15235Q0
            if (r8 > r9) goto L_0x0178
            r10.setNeatEnable(r7)
            if (r15 == 0) goto L_0x00bc
            java.lang.Object r12 = r15.invoke(r5)
            de3.u r12 = (de3.C75375u) r12
            if (r12 != 0) goto L_0x00c1
        L_0x00bc:
            de3.u r12 = new de3.u
            r12.<init>((android.text.Spannable) r5)
        L_0x00c1:
            r10.f15239x0 = r12
            int r12 = r12.length()
            int r13 = r4.length()
            int r12 = r12 - r13
            r13 = 17
            if (r12 >= 0) goto L_0x00d1
            goto L_0x00ec
        L_0x00d1:
            de3.u r12 = r10.f15239x0
            com.tencent.mm.plugin.finder.live.view.m0 r1 = new com.tencent.mm.plugin.finder.live.view.m0
            r1.<init>(r10)
            de3.u r5 = r10.f15239x0
            int r5 = r5.length()
            int r4 = r4.length()
            int r5 = r5 - r4
            de3.u r4 = r10.f15239x0
            int r4 = r4.length()
            r12.mo105705b(r1, r5, r4, r13)
        L_0x00ec:
            if (r15 == 0) goto L_0x0107
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r1 = f15234S0
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            java.lang.Object r12 = r15.invoke(r12)
            de3.u r12 = (de3.C75375u) r12
            if (r12 != 0) goto L_0x011d
        L_0x0107:
            de3.u r12 = new de3.u
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r11)
            java.lang.String r11 = f15234S0
            r15.append(r11)
            java.lang.String r11 = r15.toString()
            r12.<init>((java.lang.String) r11)
        L_0x011d:
            r10.f15240y0 = r12
            int r11 = r12.length()
            java.lang.String r12 = f15234S0
            int r15 = r12.length()
            int r11 = r11 - r15
            if (r11 >= 0) goto L_0x012d
            goto L_0x0148
        L_0x012d:
            de3.u r11 = r10.f15240y0
            com.tencent.mm.plugin.finder.live.view.l0 r15 = new com.tencent.mm.plugin.finder.live.view.l0
            r15.<init>(r10)
            de3.u r1 = r10.f15240y0
            int r1 = r1.length()
            int r12 = r12.length()
            int r1 = r1 - r12
            de3.u r12 = r10.f15240y0
            int r12 = r12.length()
            r11.mo105705b(r15, r1, r12, r13)
        L_0x0148:
            de3.o r11 = new de3.o
            de3.a0 r12 = new de3.a0
            android.content.Context r13 = r10.getContext()
            r12.<init>(r13)
            r11.<init>(r10, r12)
            r10.setOnTouchListener(r11)
            if (r14 == 0) goto L_0x016b
            int r11 = r10.f15235Q0
            r10.setMaxLines(r11)
            de3.u r11 = r10.f15239x0
            r10.mo104279b(r11)
            r10.f15236V = r6
            r10.setScrollY(r7)
            goto L_0x017c
        L_0x016b:
            r11 = 88
            r10.setMaxLines(r11)
            de3.u r11 = r10.f15240y0
            r10.mo104279b(r11)
            r10.f15236V = r7
            goto L_0x017c
        L_0x0178:
            int r3 = r3 + 1
            goto L_0x0083
        L_0x017c:
            int r11 = r2.length()
            if (r11 != r3) goto L_0x0185
            r0.invoke()
        L_0x0185:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.FinderLiveFoldTextView.mo3269o(java.lang.CharSequence, int, int, boolean, fy3.l):void");
    }

    public final void setFoldListener(C32224a<C13598b0> aVar) {
        this.f15238p0 = aVar;
    }

    public final void setFolding(boolean z) {
        this.f15236V = z;
    }

    public final void setUnFoldListener(C32224a<C13598b0> aVar) {
        this.f15237W = aVar;
    }
}
