package com.tencent.p014mm.plugin.finder.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import l60.C99344b;
import p151er.C107289t;
import p151er.C20609s;
import wq3.C111847h;
import x60.C15627c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB#\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010 J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\"\u0010\u0014\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00048\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\t\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\u0013¨\u0006!"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderRedDotTextView;", "Landroid/widget/FrameLayout;", "", "Ler/s;", "", "getHighLightHeight", "Landroid/view/View;", "getView", "d", "I", "getDROP_TITLE", "()I", "DROP_TITLE", "e", "getDROP_ALL", "DROP_ALL", "t", "getDropStat", "setDropStat", "(I)V", "dropStat", "u", "getRowCount", "setRowCount", "rowCount", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "finder-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderRedDotTextView */
public final class FinderRedDotTextView extends FrameLayout implements C111847h, C20609s {

    /* renamed from: w */
    public static final /* synthetic */ int f312895w = 0;

    /* renamed from: d */
    public final int f312896d;

    /* renamed from: e */
    public final int f312897e;

    /* renamed from: f */
    public int f312898f;

    /* renamed from: g */
    public boolean f312899g = true;

    /* renamed from: h */
    public TextView f312900h;

    /* renamed from: i */
    public View f312901i;

    /* renamed from: j */
    public WeImageView f312902j;

    /* renamed from: n */
    public TextView f312903n;

    /* renamed from: o */
    public boolean f312904o;

    /* renamed from: p */
    public int f312905p;

    /* renamed from: q */
    public int f312906q;

    /* renamed from: r */
    public float f312907r;

    /* renamed from: s */
    public String f312908s = "";

    /* renamed from: t */
    public int f312909t;

    /* renamed from: u */
    public int f312910u;

    /* renamed from: v */
    public final String f312911v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRedDotTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Class cls = C107289t.class;
        C87412m.m108594g(context, "context");
        this.f312896d = ((C107289t) C86312j.m106911c(cls)).T00();
        this.f312897e = ((C107289t) C86312j.m106911c(cls)).mo85573nG();
        String string = getResources().getString(C0966R.string.efu);
        C87412m.m108593f(string, "resources.getString(R.string.finder_onlive_status)");
        this.f312911v = string;
        mo149773i(context, attributeSet);
    }

    /* renamed from: d */
    public static void m141409d(FinderRedDotTextView finderRedDotTextView, int i, TextView textView, int i2, Object obj) {
        if ((i2 & 2) == 0 || (textView = finderRedDotTextView.f312900h) != null) {
            finderRedDotTextView.getClass();
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i;
            textView.setLayoutParams(layoutParams);
            return;
        }
        C87412m.m108603p("titleTextView");
        throw null;
    }

    private final int getHighLightHeight() {
        int dimension = (int) getResources().getDimension(C0966R.dimen.f3736cp);
        TextView textView = this.f312903n;
        if (textView != null) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i = fontMetricsInt.descent - fontMetricsInt.ascent;
            return (!this.f312904o || dimension <= i) ? i : dimension;
        }
        C87412m.m108603p("highLightTextView");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a5 A[Catch:{ Exception -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0110 A[Catch:{ Exception -> 0x0114 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32263a(int r17, java.lang.String r18, java.lang.String r19, int r20, int r21, int r22, java.lang.String r23, boolean r24) {
        /*
            r16 = this;
            r7 = r16
            r0 = r17
            r1 = r18
            r8 = r19
            java.lang.String r2 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            java.lang.String r9 = "Finder.RedDotTextView"
            java.lang.String r10 = "titleTextView"
            java.lang.String r11 = ""
            r12 = 8
            r13 = 0
            r14 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0114 }
            r3.<init>()     // Catch:{ Exception -> 0x0114 }
            java.lang.String r4 = "maxWidth:"
            r3.append(r4)     // Catch:{ Exception -> 0x0114 }
            r3.append(r0)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r4 = "  title:"
            r3.append(r4)     // Catch:{ Exception -> 0x0114 }
            r3.append(r1)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r4 = " highlightTitle:"
            r3.append(r4)     // Catch:{ Exception -> 0x0114 }
            r3.append(r8)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r4 = " highLightColor:"
            r3.append(r4)     // Catch:{ Exception -> 0x0114 }
            r4 = r21
            r3.append(r4)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r5 = " iconUrl:"
            r3.append(r5)     // Catch:{ Exception -> 0x0114 }
            r5 = r23
            r3.append(r5)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r6 = " end:"
            r3.append(r6)     // Catch:{ Exception -> 0x0114 }
            android.view.ViewGroup$LayoutParams r6 = r16.getLayoutParams()     // Catch:{ Exception -> 0x0114 }
            gy3.C87412m.m108592e(r6, r2)     // Catch:{ Exception -> 0x0114 }
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6     // Catch:{ Exception -> 0x0114 }
            int r6 = r6.getMarginEnd()     // Catch:{ Exception -> 0x0114 }
            r3.append(r6)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r6 = " width:"
            r3.append(r6)     // Catch:{ Exception -> 0x0114 }
            int r6 = r16.getWidth()     // Catch:{ Exception -> 0x0114 }
            r3.append(r6)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0114 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r3)     // Catch:{ Exception -> 0x0114 }
            if (r0 >= 0) goto L_0x0070
            return
        L_0x0070:
            android.view.ViewGroup$LayoutParams r3 = r16.getLayoutParams()     // Catch:{ Exception -> 0x0114 }
            gy3.C87412m.m108592e(r3, r2)     // Catch:{ Exception -> 0x0114 }
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3     // Catch:{ Exception -> 0x0114 }
            int r2 = r3.getMarginEnd()     // Catch:{ Exception -> 0x0114 }
            if (r2 != 0) goto L_0x0091
            android.content.res.Resources r2 = r16.getResources()     // Catch:{ Exception -> 0x0114 }
            r6 = 2131165371(0x7f0700bb, float:1.7944957E38)
            float r2 = r2.getDimension(r6)     // Catch:{ Exception -> 0x0114 }
            int r2 = (int) r2     // Catch:{ Exception -> 0x0114 }
            r3.setMarginEnd(r2)     // Catch:{ Exception -> 0x0114 }
            r7.setLayoutParams(r3)     // Catch:{ Exception -> 0x0114 }
        L_0x0091:
            if (r1 == 0) goto L_0x00a0
            java.lang.CharSequence r1 = z04.C112550d0.m153799i0(r18)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0114 }
            if (r1 != 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            r15 = r1
            goto L_0x00a1
        L_0x00a0:
            r15 = r11
        L_0x00a1:
            android.widget.TextView r1 = r7.f312900h     // Catch:{ Exception -> 0x0114 }
            if (r1 == 0) goto L_0x0110
            r1.setText(r15)     // Catch:{ Exception -> 0x0114 }
            r1 = r24
            r7.f312899g = r1     // Catch:{ Exception -> 0x0114 }
            boolean r1 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x0114 }
            if (r1 != 0) goto L_0x00be
            android.widget.TextView r1 = r7.f312900h     // Catch:{ Exception -> 0x0114 }
            if (r1 == 0) goto L_0x00ba
            r1.setVisibility(r13)     // Catch:{ Exception -> 0x0114 }
            goto L_0x00c5
        L_0x00ba:
            gy3.C87412m.m108603p(r10)     // Catch:{ Exception -> 0x0114 }
            throw r14     // Catch:{ Exception -> 0x0114 }
        L_0x00be:
            android.widget.TextView r1 = r7.f312900h     // Catch:{ Exception -> 0x0114 }
            if (r1 == 0) goto L_0x010c
            r1.setVisibility(r12)     // Catch:{ Exception -> 0x0114 }
        L_0x00c5:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r23)     // Catch:{ Exception -> 0x0114 }
            if (r1 != 0) goto L_0x00cd
            r1 = 1
            goto L_0x00ce
        L_0x00cd:
            r1 = 0
        L_0x00ce:
            r7.f312904o = r1     // Catch:{ Exception -> 0x0114 }
            r16.mo149777m(r17)     // Catch:{ Exception -> 0x0114 }
            r1 = r16
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r22
            r1.mo149776l(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0114 }
            if (r8 != 0) goto L_0x00e6
            r1 = r11
            goto L_0x00e7
        L_0x00e6:
            r1 = r8
        L_0x00e7:
            boolean r1 = r7.mo149772h(r0, r15, r1)     // Catch:{ Exception -> 0x0114 }
            if (r1 == 0) goto L_0x0102
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0114 }
            r1.<init>()     // Catch:{ Exception -> 0x0114 }
            java.lang.String r2 = "handleHighLight return maxWidth:"
            r1.append(r2)     // Catch:{ Exception -> 0x0114 }
            r1.append(r0)     // Catch:{ Exception -> 0x0114 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0114 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)     // Catch:{ Exception -> 0x0114 }
            return
        L_0x0102:
            if (r8 != 0) goto L_0x0105
            r8 = r11
        L_0x0105:
            boolean r1 = r7.f312904o     // Catch:{ Exception -> 0x0114 }
            r7.mo149766c(r0, r15, r8, r1)     // Catch:{ Exception -> 0x0114 }
            goto L_0x0180
        L_0x010c:
            gy3.C87412m.m108603p(r10)     // Catch:{ Exception -> 0x0114 }
            throw r14     // Catch:{ Exception -> 0x0114 }
        L_0x0110:
            gy3.C87412m.m108603p(r10)     // Catch:{ Exception -> 0x0114 }
            throw r14     // Catch:{ Exception -> 0x0114 }
        L_0x0114:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r2 = "setRedDotText"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r2, r1)
            android.widget.TextView r0 = r7.f312900h
            if (r0 == 0) goto L_0x0187
            r0.setText(r11)
            android.view.View r0 = r7.f312901i
            if (r0 == 0) goto L_0x0181
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r1.mo10233c(r2)
            java.lang.Object[] r2 = r1.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/view/FinderRedDotTextView"
            java.lang.String r4 = "setRedDotText"
            java.lang.String r5 = "(ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Z)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r17 = r0
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r22 = r6
            r23 = r8
            r24 = r9
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r1 = r1.mo10231a(r13)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/view/FinderRedDotTextView"
            java.lang.String r2 = "setRedDotText"
            java.lang.String r3 = "(ILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Z)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r18 = r1
            r19 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
        L_0x0180:
            return
        L_0x0181:
            java.lang.String r0 = "highLightContainer"
            gy3.C87412m.m108603p(r0)
            throw r14
        L_0x0187:
            gy3.C87412m.m108603p(r10)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.FinderRedDotTextView.mo32263a(int, java.lang.String, java.lang.String, int, int, int, java.lang.String, boolean):void");
    }

    /* renamed from: b */
    public final void mo149765b() {
        View view = this.f312901i;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            TextView textView = this.f312900h;
            if (textView != null) {
                Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
                marginLayoutParams.bottomMargin = ((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - (getHighLightHeight() / 2);
                View view2 = this.f312901i;
                if (view2 != null) {
                    view2.setLayoutParams(marginLayoutParams);
                } else {
                    C87412m.m108603p("highLightContainer");
                    throw null;
                }
            } else {
                C87412m.m108603p("titleTextView");
                throw null;
            }
        } else {
            C87412m.m108603p("highLightContainer");
            throw null;
        }
    }

    /* renamed from: c */
    public final void mo149766c(int i, String str, String str2, boolean z) {
        int i2;
        int i3 = i;
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        TextView textView = this.f312903n;
        if (textView != null) {
            float measureText = textView.getPaint().measureText(str4);
            int g = mo149769g(z2);
            float f = (float) i3;
            float f2 = (float) g;
            int i4 = (int) (((f - measureText) - f2) - ((float) this.f312898f));
            int i5 = i4 < 0 ? 0 : i4;
            int length = str.length();
            TextView textView2 = this.f312900h;
            if (textView2 != null) {
                StaticLayout staticLayout = r1;
                float f3 = f2;
                float f4 = f;
                int i6 = g;
                StaticLayout staticLayout2 = new StaticLayout(str, 0, length, textView2.getPaint(), i5, Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
                this.f312905p = staticLayout.getLineEnd(0);
                TextView textView3 = this.f312903n;
                if (textView3 != null) {
                    this.f312907r = textView3.getPaint().measureText(str4) + ((float) mo149769g(z2)) + ((float) this.f312898f);
                    TextView textView4 = this.f312900h;
                    if (textView4 != null) {
                        this.f312906q = (int) (this.f312907r / textView4.getPaint().measureText("我"));
                        Log.m105924i("Finder.RedDotTextView", "adjustLayout lineWithIconMaxWordCount:" + this.f312905p + " subTitleWidthWordCount:" + this.f312906q + " endGapWidth:" + this.f312898f);
                        TextView textView5 = this.f312903n;
                        if (textView5 != null) {
                            int i7 = textView5.getVisibility() == 0 ? (int) (measureText + f3 + ((float) this.f312898f)) : i6;
                            if (staticLayout.getLineCount() == 1) {
                                setRowCount(1);
                                Log.m105924i("Finder.RedDotTextView", "adjustSingleLineTitle:" + str3);
                                TextView textView6 = this.f312900h;
                                if (textView6 != null) {
                                    textView6.setText(str3);
                                    TextView textView7 = this.f312900h;
                                    if (textView7 != null) {
                                        ViewGroup.LayoutParams layoutParams = textView7.getLayoutParams();
                                        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                        marginLayoutParams.setMarginEnd(i7);
                                        textView7.setLayoutParams(marginLayoutParams);
                                        mo149765b();
                                        return;
                                    }
                                    C87412m.m108603p("titleTextView");
                                    throw null;
                                }
                                C87412m.m108603p("titleTextView");
                                throw null;
                            }
                            Log.m105924i("Finder.RedDotTextView", "onMultiLineAverageWordLine:" + str3);
                            int length2 = str.length();
                            TextView textView8 = this.f312900h;
                            if (textView8 != null) {
                                StaticLayout staticLayout3 = r1;
                                int i8 = i7;
                                StaticLayout staticLayout4 = new StaticLayout(str, 0, length2, textView8.getPaint(), i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
                                int lineEnd = staticLayout3.getLineEnd(0);
                                int length3 = str.length();
                                Log.m105924i("Finder.RedDotTextView", "titleWordCount :" + length3 + " fullLineMaxWordCount:" + lineEnd + " lineWithIconMaxWordCount:" + this.f312905p);
                                int i9 = lineEnd + this.f312905p;
                                if (length3 > i9 || (length3 == i9 && !TextUtils.isEmpty(str2))) {
                                    int i15 = i;
                                    mo149768f(i, str, str2);
                                } else if (staticLayout3.getLineCount() == 1) {
                                    Log.m105924i("Finder.RedDotTextView", "onMultiLineAverageWordLine direct padding new line");
                                    mo149767e(str3, i, str4);
                                } else {
                                    int i16 = i;
                                    int i17 = ((this.f312906q + length3) + 1) / 2;
                                    if (i17 > length3) {
                                        i17 = length3;
                                    }
                                    TextView textView9 = this.f312900h;
                                    if (textView9 != null) {
                                        float measureText2 = textView9.getPaint().measureText(str3.subSequence(0, i17).toString());
                                        TextView textView10 = this.f312900h;
                                        if (textView10 != null) {
                                            float measureText3 = textView10.getPaint().measureText(str3.subSequence(i17, length3).toString()) + this.f312907r;
                                            int i18 = (measureText2 > measureText3 ? 1 : (measureText2 == measureText3 ? 0 : -1));
                                            if (f4 < (i18 < 0 ? measureText3 : measureText2)) {
                                                Log.m105920e("Finder.RedDotTextView", "drop for content too long!");
                                            }
                                            float f5 = i18 < 0 ? measureText3 : measureText2;
                                            int i19 = i8;
                                            float f6 = (float) i19;
                                            if (f5 < f6) {
                                                f5 = f6;
                                            }
                                            if (f5 > f4) {
                                                f5 = f4;
                                            }
                                            int i25 = (int) f5;
                                            Log.m105924i("Finder.RedDotTextView", "averageCount:" + i17 + " firstLineWidth:" + measureText2 + " lastLineWidth:" + measureText3 + " viewWidth:" + i25 + " maxWidth:" + i16);
                                            m141409d(this, i25, (TextView) null, 2, (Object) null);
                                            if (i25 < i19 && !TextUtils.isEmpty(str)) {
                                                Log.m105924i("Finder.RedDotTextView", "adjustTextViewWidth: calcSubTitleMaxWidth");
                                                int g2 = (i25 - (length3 > i17 ? this.f312898f : 0)) - mo149769g(this.f312904o);
                                                TextView textView11 = this.f312903n;
                                                if (textView11 != null) {
                                                    ViewGroup.LayoutParams layoutParams2 = textView11.getLayoutParams();
                                                    layoutParams2.width = g2;
                                                    textView11.setLayoutParams(layoutParams2);
                                                } else {
                                                    C87412m.m108603p("highLightTextView");
                                                    throw null;
                                                }
                                            }
                                            Log.m105924i("Finder.RedDotTextView", "onMultiLineTitle:" + str3);
                                            int length4 = str.length();
                                            TextView textView12 = this.f312900h;
                                            if (textView12 != null) {
                                                StaticLayout staticLayout5 = r1;
                                                int i26 = i25;
                                                float f7 = f6;
                                                int i27 = i19;
                                                StaticLayout staticLayout6 = new StaticLayout(str, 0, length4, textView12.getPaint(), i25, Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true);
                                                TextView textView13 = this.f312900h;
                                                if (textView13 != null) {
                                                    int maxLines = textView13.getMaxLines();
                                                    if (staticLayout5.getLineCount() >= maxLines) {
                                                        int lineEnd2 = staticLayout5.getLineEnd(maxLines - 2);
                                                        String obj = str3.subSequence(lineEnd2, str.length()).toString();
                                                        int i28 = i27;
                                                        int i29 = i26 - i28;
                                                        if (i29 <= 0) {
                                                            i29 = 0;
                                                        }
                                                        Log.m105924i("Finder.RedDotTextView", "preLastLineText:" + obj + "  preLastLineWidth:" + i29);
                                                        int length5 = obj.length();
                                                        TextView textView14 = this.f312900h;
                                                        if (textView14 != null) {
                                                            boolean z3 = new StaticLayout(obj, 0, length5, textView14.getPaint(), i29, Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true).getLineCount() > 1;
                                                            Log.m105924i("Finder.RedDotTextView", "onMultiLineTitle isNeedEllipse:" + z3);
                                                            if (z3) {
                                                                mo149768f(i26, str3, str4);
                                                                return;
                                                            }
                                                            if (this.f312899g) {
                                                                StringBuilder sb = new StringBuilder();
                                                                int i35 = lineEnd2 - 1;
                                                                int i36 = i35;
                                                                while (str3.charAt(i36) == ' ') {
                                                                    i36--;
                                                                }
                                                                if (i36 >= 0 && i36 != i35) {
                                                                    int i37 = i36 + 1;
                                                                    sb.append(str3.subSequence(i37, lineEnd2));
                                                                    sb.append(str3.subSequence(0, i37));
                                                                } else if (i36 == 0) {
                                                                    Log.m105920e("Finder.RedDotTextView", "filterLineChars index == 0");
                                                                } else {
                                                                    sb.append(str3.subSequence(0, lineEnd2));
                                                                }
                                                                Log.m105924i("Finder.RedDotTextView", "filterLineChars newTitleBuilder 1:" + sb);
                                                                char charAt = str3.charAt(lineEnd2);
                                                                if (charAt == 12290 || charAt == '?' || charAt == '!' || charAt == 65292 || charAt == 12289 || charAt == 65307 || charAt == ':' || charAt == '\'') {
                                                                    lineEnd2++;
                                                                }
                                                                if (lineEnd2 < str.length()) {
                                                                    sb.append(str3.subSequence(lineEnd2, str.length()));
                                                                }
                                                                Log.m105924i("Finder.RedDotTextView", "filterLineChars newTitleBuilder 2:" + sb);
                                                                String sb4 = sb.toString();
                                                                C87412m.m108593f(sb4, "newTitleBuilder.toString()");
                                                                str3 = sb4;
                                                            }
                                                            Log.m105924i("Finder.RedDotTextView", "adjustMultiLineTitle:" + str3);
                                                            TextView textView15 = this.f312900h;
                                                            if (textView15 != null) {
                                                                int length6 = str3.length();
                                                                if (length6 > str3.length() || i28 == 0) {
                                                                    Log.m105920e("Finder.RedDotTextView", "addPadding paddingIndex out of limit! needPaddingWidth:" + i28 + " paddingIndex:" + length6);
                                                                } else {
                                                                    TextView textView16 = this.f312900h;
                                                                    if (textView16 != null) {
                                                                        float measureText4 = textView16.getPaint().measureText(" ");
                                                                        float f8 = f7 / measureText4;
                                                                        float f9 = ((float) this.f312898f) / measureText4;
                                                                        Log.m105924i("Finder.RedDotTextView", "getPaddingWordCount :ret " + f8 + " ratio:" + f9);
                                                                        if (Float.isInfinite(f8) || Float.isNaN(f8)) {
                                                                            i2 = 0;
                                                                        } else {
                                                                            float f15 = (float) 10;
                                                                            i2 = (((double) ((f8 * f15) % f15)) >= 4.0d || ((double) f9) <= 2.0d) ? ((int) f8) + 1 : (int) f8;
                                                                        }
                                                                        StringBuilder sb5 = new StringBuilder(str3);
                                                                        while (i2 > 0) {
                                                                            sb5.append(" ");
                                                                            i2--;
                                                                        }
                                                                        Log.m105924i("Finder.RedDotTextView", "addPadding :" + sb5);
                                                                        str3 = sb5.toString();
                                                                        C87412m.m108593f(str3, "paddedTitleBuilder.toString()");
                                                                    } else {
                                                                        C87412m.m108603p("titleTextView");
                                                                        throw null;
                                                                    }
                                                                }
                                                                textView15.setText(str3);
                                                                setRowCount(2);
                                                                mo149765b();
                                                                m141409d(this, i26, (TextView) null, 2, (Object) null);
                                                                return;
                                                            }
                                                            C87412m.m108603p("titleTextView");
                                                            throw null;
                                                        }
                                                        C87412m.m108603p("titleTextView");
                                                        throw null;
                                                    }
                                                    mo149767e(str3, i26, str4);
                                                    return;
                                                }
                                                C87412m.m108603p("titleTextView");
                                                throw null;
                                            }
                                            C87412m.m108603p("titleTextView");
                                            throw null;
                                        }
                                        C87412m.m108603p("titleTextView");
                                        throw null;
                                    }
                                    C87412m.m108603p("titleTextView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("titleTextView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("highLightTextView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("titleTextView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("highLightTextView");
                    throw null;
                }
            } else {
                C87412m.m108603p("titleTextView");
                throw null;
            }
        } else {
            C87412m.m108603p("highLightTextView");
            throw null;
        }
    }

    /* renamed from: e */
    public final void mo149767e(String str, int i, String str2) {
        Log.m105924i("Finder.RedDotTextView", "adjustTitleByNewLine direct padding new line");
        TextView textView = this.f312900h;
        if (textView != null) {
            textView.setText(str + 10);
            setRowCount(2);
            mo149765b();
            TextView textView2 = this.f312900h;
            if (textView2 != null) {
                int measureText = (int) textView2.getPaint().measureText(str);
                if (measureText > i) {
                    measureText = i;
                }
                m141409d(this, measureText, (TextView) null, 2, (Object) null);
                if (!mo149774j(i, str2)) {
                    setDropStat(this.f312896d);
                    View view = this.f312901i;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "adjustTitleByNewLine", "(Ljava/lang/String;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "adjustTitleByNewLine", "(Ljava/lang/String;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        C87412m.m108603p("highLightContainer");
                        throw null;
                    }
                }
                TextView textView3 = this.f312903n;
                if (textView3 != null) {
                    textView3.setMaxWidth((i - 0) - mo149769g(this.f312904o));
                } else {
                    C87412m.m108603p("highLightTextView");
                    throw null;
                }
            } else {
                C87412m.m108603p("titleTextView");
                throw null;
            }
        } else {
            C87412m.m108603p("titleTextView");
            throw null;
        }
    }

    /* renamed from: f */
    public final void mo149768f(int i, String str, String str2) {
        Log.m105924i("Finder.RedDotTextView", "dropSubTitle highlightTitle:" + str2);
        if (!(!TextUtils.isEmpty(str2) || this.f312904o)) {
            View view = this.f312901i;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "dropSubTitle", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "dropSubTitle", "(ILjava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m141409d(this, i, (TextView) null, 2, (Object) null);
                TextView textView = this.f312900h;
                if (textView != null) {
                    textView.setText("");
                    setRowCount(2);
                    setDropStat(C87412m.m108589b(str, this.f312911v) ? ((C107289t) C86312j.m106911c(C107289t.class)).mo85564JI() : this.f312897e);
                    return;
                }
                C87412m.m108603p("titleTextView");
                throw null;
            }
            C87412m.m108603p("highLightContainer");
            throw null;
        }
        setDropStat(this.f312896d);
    }

    /* renamed from: g */
    public final int mo149769g(boolean z) {
        if (z) {
            return (int) getResources().getDimension(C0966R.dimen.f3736cp);
        }
        return 0;
    }

    public final int getDROP_ALL() {
        return this.f312897e;
    }

    public final int getDROP_TITLE() {
        return this.f312896d;
    }

    public int getDropStat() {
        return this.f312909t;
    }

    public int getRowCount() {
        return this.f312910u;
    }

    public View getView() {
        return this;
    }

    /* renamed from: h */
    public final boolean mo149772h(int i, String str, String str2) {
        if (!Util.isNullOrNil(str)) {
            return false;
        }
        if (mo149774j(i, str2)) {
            return true;
        }
        setDropStat(this.f312897e);
        View view = this.f312901i;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "handleHighLight", "(ILjava/lang/String;Ljava/lang/String;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "handleHighLight", "(ILjava/lang/String;Ljava/lang/String;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        C87412m.m108603p("highLightContainer");
        throw null;
    }

    /* renamed from: i */
    public final void mo149773i(Context context, AttributeSet attributeSet) {
        this.f312898f = ((C107289t) C86312j.m106911c(C107289t.class)).mo85568Q8(context, attributeSet);
        Log.m105924i("Finder.RedDotTextView", "init : endGapWidth:" + this.f312898f);
    }

    /* renamed from: j */
    public final boolean mo149774j(int i, String str) {
        TextView textView = this.f312903n;
        if (textView != null) {
            return ((float) i) >= ((float) mo149769g(this.f312904o)) + textView.getPaint().measureText(str);
        }
        C87412m.m108603p("highLightTextView");
        throw null;
    }

    /* renamed from: k */
    public final boolean mo149775k(String str) {
        if (!Util.isNullOrNil(this.f312908s) && C87412m.m108589b(this.f312908s, str)) {
            WeImageView weImageView = this.f312902j;
            if (weImageView == null) {
                C87412m.m108603p("highLightIcon");
                throw null;
            } else if (weImageView.getDrawable() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final void mo149776l(String str, int i, int i2, String str2, int i3) {
        String str3 = str2;
        int i4 = i3;
        if (!TextUtils.isEmpty(str) || this.f312904o) {
            View view = this.f312901i;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "preHandleHighLight", "(Ljava/lang/String;IILjava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "preHandleHighLight", "(Ljava/lang/String;IILjava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = this.f312903n;
                if (textView != null) {
                    textView.setTextSize(0, getResources().getDimension(i));
                    TextView textView2 = this.f312903n;
                    if (textView2 != null) {
                        textView2.setTextColor(i2);
                        TextView textView3 = this.f312903n;
                        if (textView3 != null) {
                            textView3.setText(str);
                            if (!TextUtils.isEmpty(str)) {
                                TextView textView4 = this.f312903n;
                                if (textView4 != null) {
                                    textView4.setVisibility(0);
                                } else {
                                    C87412m.m108603p("highLightTextView");
                                    throw null;
                                }
                            } else {
                                TextView textView5 = this.f312903n;
                                if (textView5 != null) {
                                    textView5.setVisibility(8);
                                } else {
                                    C87412m.m108603p("highLightTextView");
                                    throw null;
                                }
                            }
                            if (this.f312904o) {
                                if (mo149775k(str3 == null ? "" : str3)) {
                                    WeImageView weImageView = this.f312902j;
                                    if (weImageView != null) {
                                        weImageView.setIconColor(i4);
                                    } else {
                                        C87412m.m108603p("highLightIcon");
                                        throw null;
                                    }
                                } else {
                                    WeImageView weImageView2 = this.f312902j;
                                    if (weImageView2 != null) {
                                        weImageView2.setVisibility(0);
                                        Log.m105924i("Finder.RedDotTextView", "loadHighLightIcon: iconUrl" + str3 + " highLightColor:" + i4);
                                        C99344b<? extends C15627c, Bitmap> lo02 = ((C107289t) C86312j.m106911c(C107289t.class)).lo0(str3);
                                        C87412m.m108592e(lo02, "null cannot be cast to non-null type com.tencent.mm.loader.builder.RequestBuilder<com.tencent.mm.loader.model.data.ILoaderData, android.graphics.Bitmap>");
                                        lo02.f291320d = new C105330u4(this, str3, i4);
                                        lo02.f291324h = new C105331v4(str3, this, i4);
                                        lo02.f291323g = new C105333w4(this);
                                        lo02.mo85951a();
                                        WeImageView weImageView3 = this.f312902j;
                                        if (weImageView3 != null) {
                                            weImageView3.setIconColor(i4);
                                        } else {
                                            C87412m.m108603p("highLightIcon");
                                            throw null;
                                        }
                                    } else {
                                        C87412m.m108603p("highLightIcon");
                                        throw null;
                                    }
                                }
                            } else {
                                WeImageView weImageView4 = this.f312902j;
                                if (weImageView4 != null) {
                                    weImageView4.setVisibility(8);
                                } else {
                                    C87412m.m108603p("highLightIcon");
                                    throw null;
                                }
                            }
                        } else {
                            C87412m.m108603p("highLightTextView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("highLightTextView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("highLightTextView");
                    throw null;
                }
            } else {
                C87412m.m108603p("highLightContainer");
                throw null;
            }
        } else {
            View view3 = this.f312901i;
            if (view3 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "preHandleHighLight", "(Ljava/lang/String;IILjava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/view/FinderRedDotTextView", "preHandleHighLight", "(Ljava/lang/String;IILjava/lang/String;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f312898f = 0;
                return;
            }
            C87412m.m108603p("highLightContainer");
            throw null;
        }
    }

    /* renamed from: m */
    public final void mo149777m(int i) {
        this.f312905p = 0;
        this.f312906q = 0;
        this.f312907r = 0.0f;
        setDropStat(0);
        setRowCount(1);
        if (this.f312898f == 0) {
            this.f312898f = (int) getResources().getDimension(C0966R.dimen.f3766df);
        }
        TextView textView = this.f312900h;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(0);
            textView.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            C87412m.m108592e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMarginEnd((int) getResources().getDimension(C0966R.dimen.f3766df));
            setLayoutParams(marginLayoutParams2);
            m141409d(this, -2, (TextView) null, 2, (Object) null);
            TextView textView2 = this.f312903n;
            if (textView2 != null) {
                ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                layoutParams3.width = -2;
                textView2.setLayoutParams(layoutParams3);
                TextView textView3 = this.f312903n;
                if (textView3 != null) {
                    textView3.setMaxWidth(i);
                } else {
                    C87412m.m108603p("highLightTextView");
                    throw null;
                }
            } else {
                C87412m.m108603p("highLightTextView");
                throw null;
            }
        } else {
            C87412m.m108603p("titleTextView");
            throw null;
        }
    }

    public void onFinishInflate() {
        Class cls = C107289t.class;
        super.onFinishInflate();
        Context context = getContext();
        C87412m.m108593f(context, "context");
        ((C107289t) C86312j.m106911c(cls)).mo85571lK(context, this);
        this.f312900h = ((C107289t) C86312j.m106911c(cls)).fj0(this);
        this.f312901i = ((C107289t) C86312j.m106911c(cls)).Pk0(this);
        this.f312903n = ((C107289t) C86312j.m106911c(cls)).mo85566Oo(this);
        this.f312902j = ((C107289t) C86312j.m106911c(cls)).mo85565KX(this);
        TextView textView = this.f312903n;
        if (textView != null) {
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
        } else {
            C87412m.m108603p("highLightTextView");
            throw null;
        }
    }

    public void setDropStat(int i) {
        this.f312909t = i;
    }

    public void setRowCount(int i) {
        this.f312910u = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderRedDotTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Class cls = C107289t.class;
        C87412m.m108594g(context, "context");
        this.f312896d = ((C107289t) C86312j.m106911c(cls)).T00();
        this.f312897e = ((C107289t) C86312j.m106911c(cls)).mo85573nG();
        String string = getResources().getString(C0966R.string.efu);
        C87412m.m108593f(string, "resources.getString(R.string.finder_onlive_status)");
        this.f312911v = string;
        mo149773i(context, attributeSet);
    }
}
