package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;
import com.tencent.neattextview.textview.layout.NeatLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32224a;
import go3.C76005h;
import go3.C76006i;
import go3.C76007j;
import go3.C76008k;
import go3.C76009l;
import go3.C76010m;
import go3.C76011n;
import go3.C76012o;
import go3.C76013p;
import go3.C76014q;
import go3.C76015r;
import go3.C76016s;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import t40.C77853a;
import yr3.C112481c;
import yr3.C79150a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010d\u001a\u00020c\u0012\b\u0010f\u001a\u0004\u0018\u00010e¢\u0006\u0004\bg\u0010hB#\b\u0016\u0012\u0006\u0010d\u001a\u00020c\u0012\b\u0010f\u001a\u0004\u0018\u00010e\u0012\u0006\u0010i\u001a\u00020\u0002¢\u0006\u0004\bg\u0010jJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002J\u0010\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000eR#\u0010\u0016\u001a\n \u0011*\u0004\u0018\u00010\u00100\u00108BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR#\u0010!\u001a\n \u0011*\u0004\u0018\u00010\u001d0\u001d8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010 R#\u0010&\u001a\n \u0011*\u0004\u0018\u00010\"0\"8BX\u0002¢\u0006\f\n\u0004\b#\u0010\u0013\u001a\u0004\b$\u0010%R#\u0010)\u001a\n \u0011*\u0004\u0018\u00010\"0\"8BX\u0002¢\u0006\f\n\u0004\b'\u0010\u0013\u001a\u0004\b(\u0010%R#\u0010.\u001a\n \u0011*\u0004\u0018\u00010*0*8BX\u0002¢\u0006\f\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010-R#\u00103\u001a\n \u0011*\u0004\u0018\u00010/0/8BX\u0002¢\u0006\f\n\u0004\b0\u0010\u0013\u001a\u0004\b1\u00102R#\u00106\u001a\n \u0011*\u0004\u0018\u00010/0/8BX\u0002¢\u0006\f\n\u0004\b4\u0010\u0013\u001a\u0004\b5\u00102R#\u00109\u001a\n \u0011*\u0004\u0018\u00010/0/8BX\u0002¢\u0006\f\n\u0004\b7\u0010\u0013\u001a\u0004\b8\u00102R#\u0010<\u001a\n \u0011*\u0004\u0018\u00010/0/8BX\u0002¢\u0006\f\n\u0004\b:\u0010\u0013\u001a\u0004\b;\u00102R#\u0010?\u001a\n \u0011*\u0004\u0018\u00010/0/8BX\u0002¢\u0006\f\n\u0004\b=\u0010\u0013\u001a\u0004\b>\u00102R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0018\u001a\u0004\bA\u0010\u001a\"\u0004\bB\u0010\u001cR*\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010C8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010C8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\"\u0010T\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bO\u0010+\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010X\u001a\n \u0011*\u0004\u0018\u00010U0U8BX\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8BX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b]\u0010QR\u0011\u0010`\u001a\u00020Y8F¢\u0006\u0006\u001a\u0004\b_\u0010[R\u0011\u0010b\u001a\u00020U8F¢\u0006\u0006\u001a\u0004\ba\u0010W¨\u0006k"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/MMCollapsibleTextView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "maxLines", "Lrx3/b0;", "setMaxLines", "", "collapsed", "setCollapseStatus", "text", "setCollapseButtonText", "Landroid/view/View$OnTouchListener;", "l", "setOnTextTouchListener", "", "setText", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "v", "Lrx3/g;", "getResource", "()Landroid/content/res/Resources;", "resource", "D", "Z", "isSpecialText", "()Z", "setSpecialText", "(Z)V", "Lcom/tencent/mm/ui/widget/MMNeat7extView;", "F", "get_contentText", "()Lcom/tencent/mm/ui/widget/MMNeat7extView;", "_contentText", "Landroid/widget/TextView;", "G", "get_contentBackupText", "()Landroid/widget/TextView;", "_contentBackupText", "H", "get_collapseButton", "_collapseButton", "Landroid/widget/ImageView;", "I", "get_collapseImage", "()Landroid/widget/ImageView;", "_collapseImage", "Landroidx/constraintlayout/widget/Placeholder;", "J", "getFullContentPlaceHolder", "()Landroidx/constraintlayout/widget/Placeholder;", "fullContentPlaceHolder", "K", "getCenterContentPlaceHolder", "centerContentPlaceHolder", "L", "getLeftBottomCollapsePlaceHolder", "leftBottomCollapsePlaceHolder", "M", "getRightBottomCollapsePlaceHolder", "rightBottomCollapsePlaceHolder", "N", "getRightCollapsePlaceHolder", "rightCollapsePlaceHolder", "P", "getCollapsed", "setCollapsed", "Lkotlin/Function0;", "Q", "Lfy3/a;", "getOnCollapse", "()Lfy3/a;", "setOnCollapse", "(Lfy3/a;)V", "onCollapse", "R", "getOnExpand", "setOnExpand", "onExpand", "W", "getCollapseButtonExpendText", "()I", "setCollapseButtonExpendText", "(I)V", "collapseButtonExpendText", "Landroid/view/View;", "getCollapseButton", "()Landroid/view/View;", "collapseButton", "", "getLastLineRight", "()F", "lastLineRight", "getLastLineHeight", "lastLineHeight", "getTextSize", "textSize", "getContentText", "contentText", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.MMCollapsibleTextView */
public final class MMCollapsibleTextView extends ConstraintLayout {

    /* renamed from: A */
    public boolean f220351A;

    /* renamed from: B */
    public int f220352B = Integer.MAX_VALUE;

    /* renamed from: C */
    public final int f220353C = C0966R.C0971layout.bcb;

    /* renamed from: D */
    public boolean f220354D;

    /* renamed from: E */
    public CharSequence f220355E = "";

    /* renamed from: F */
    public final C13601g f220356F = C36568h.m40985a(new C76008k(this));

    /* renamed from: G */
    public final C13601g f220357G = C36568h.m40985a(new C76007j(this));

    /* renamed from: H */
    public final C13601g f220358H = C36568h.m40985a(new C76005h(this));

    /* renamed from: I */
    public final C13601g f220359I = C36568h.m40985a(new C76006i(this));

    /* renamed from: J */
    public final C13601g f220360J = C36568h.m40985a(new C76010m(this));

    /* renamed from: K */
    public final C13601g f220361K = C36568h.m40985a(new C76009l(this));

    /* renamed from: L */
    public final C13601g f220362L = C36568h.m40985a(new C76011n(this));

    /* renamed from: M */
    public final C13601g f220363M = C36568h.m40985a(new C76014q(this));

    /* renamed from: N */
    public final C13601g f220364N = C36568h.m40985a(new C76015r(this));

    /* renamed from: P */
    public boolean f220365P = true;

    /* renamed from: Q */
    public C32224a<C13598b0> f220366Q;

    /* renamed from: R */
    public C32224a<C13598b0> f220367R;

    /* renamed from: S */
    public boolean f220368S;

    /* renamed from: T */
    public int f220369T = -1;

    /* renamed from: U */
    public float f220370U = -1.0f;

    /* renamed from: V */
    public float f220371V = -1.0f;

    /* renamed from: W */
    public int f220372W = C0966R.string.cgj;

    /* renamed from: v */
    public final C13601g f220373v = C36568h.m40985a(new C76013p(this));

    /* renamed from: w */
    public Context f220374w;

    /* renamed from: x */
    public boolean f220375x;

    /* renamed from: y */
    public boolean f220376y;

    /* renamed from: z */
    public boolean f220377z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMCollapsibleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f220374w = context;
        mo104236t(attributeSet, 0);
    }

    private final Placeholder getCenterContentPlaceHolder() {
        return (Placeholder) this.f220361K.getValue();
    }

    private final View getCollapseButton() {
        return this.f220351A ? get_collapseImage() : get_collapseButton();
    }

    private final Placeholder getFullContentPlaceHolder() {
        return (Placeholder) this.f220360J.getValue();
    }

    private final int getLastLineHeight() {
        return this.f220354D ? get_contentBackupText().getLineHeight() : get_contentText().getLineHeight();
    }

    private final float getLastLineRight() {
        return this.f220365P ? this.f220370U : this.f220371V;
    }

    private final Placeholder getLeftBottomCollapsePlaceHolder() {
        return (Placeholder) this.f220362L.getValue();
    }

    private final Resources getResource() {
        return (Resources) this.f220373v.getValue();
    }

    private final Placeholder getRightBottomCollapsePlaceHolder() {
        return (Placeholder) this.f220363M.getValue();
    }

    private final Placeholder getRightCollapsePlaceHolder() {
        return (Placeholder) this.f220364N.getValue();
    }

    private final TextView get_collapseButton() {
        return (TextView) this.f220358H.getValue();
    }

    /* access modifiers changed from: private */
    public final ImageView get_collapseImage() {
        return (ImageView) this.f220359I.getValue();
    }

    private final TextView get_contentBackupText() {
        return (TextView) this.f220357G.getValue();
    }

    private final MMNeat7extView get_contentText() {
        return (MMNeat7extView) this.f220356F.getValue();
    }

    /* renamed from: s */
    public static final void m89798s(MMCollapsibleTextView mMCollapsibleTextView) {
        C32224a<C13598b0> aVar;
        boolean z = !mMCollapsibleTextView.f220365P;
        mMCollapsibleTextView.f220365P = z;
        if (!z ? (aVar = mMCollapsibleTextView.f220367R) != null : (aVar = mMCollapsibleTextView.f220366Q) != null) {
            aVar.invoke();
        }
        mMCollapsibleTextView.setCollapseStatus(mMCollapsibleTextView.f220365P);
        if (mMCollapsibleTextView.f220368S && mMCollapsibleTextView.f220377z) {
            mMCollapsibleTextView.mo104238x();
        }
    }

    private final void setCollapseStatus(boolean z) {
        if (this.f220351A) {
            get_collapseImage().setImageResource(z ? C0966R.raw.expend : C0966R.raw.collapse);
        } else {
            get_collapseButton().setText(z ? this.f220372W : C0966R.string.bfo);
        }
        setMaxLines(z ? this.f220352B : Integer.MAX_VALUE);
    }

    private final void setMaxLines(int i) {
        if (this.f220354D) {
            get_contentBackupText().setMaxLines(i);
        } else {
            get_contentText().setMaxLines(i);
        }
    }

    public final int getCollapseButtonExpendText() {
        return this.f220372W;
    }

    public final boolean getCollapsed() {
        return this.f220365P;
    }

    public final View getContentText() {
        String str;
        View view;
        if (this.f220354D) {
            view = get_contentBackupText();
            str = "_contentBackupText";
        } else {
            view = get_contentText();
            str = "_contentText";
        }
        C87412m.m108593f(view, str);
        return view;
    }

    public final C32224a<C13598b0> getOnCollapse() {
        return this.f220366Q;
    }

    public final C32224a<C13598b0> getOnExpand() {
        return this.f220367R;
    }

    public final float getTextSize() {
        return get_contentText().getTextSize();
    }

    public void onMeasure(int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        if (this.f220375x || size != this.f220369T) {
            this.f220370U = -1.0f;
            this.f220371V = -1.0f;
            this.f220375x = false;
            this.f220369T = size;
            get_contentText().setMaxLines(Integer.MAX_VALUE);
            get_contentText().mo104279b(this.f220355E);
            this.f220354D = get_contentText().f320006e;
            C79150a i3 = get_contentText().mo154990i(size, Integer.MAX_VALUE);
            boolean z = (i3 != null ? ((NeatLayout) i3).f319992L : 0) > this.f220352B;
            this.f220368S = z;
            if (!this.f220376y || z) {
                getFullContentPlaceHolder().setContentId(getContentText().getId());
            } else {
                getCenterContentPlaceHolder().setContentId(getContentText().getId());
            }
            if (this.f220368S) {
                getCollapseButton().setOnClickListener(new C76016s(this));
                View collapseButton = getCollapseButton();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = collapseButton;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/MMCollapsibleTextView", "setupCollapseButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                collapseButton.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/ui/widget/MMCollapsibleTextView", "setupCollapseButton", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (!this.f220377z) {
                    getLeftBottomCollapsePlaceHolder().setContentId(getCollapseButton().getId());
                }
                setCollapseStatus(this.f220365P);
                if (this.f220377z) {
                    if (this.f220351A) {
                        int lastLineHeight = (int) (((float) getLastLineHeight()) * 0.8f);
                        ViewGroup.LayoutParams layoutParams = get_collapseImage().getLayoutParams();
                        layoutParams.height = lastLineHeight;
                        get_collapseImage().setLayoutParams(layoutParams);
                        get_collapseImage().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(lastLineHeight, 1073741824));
                        ViewParent parent = get_collapseImage().getParent();
                        View view2 = parent instanceof View ? (View) parent : null;
                        if (view2 != null) {
                            view2.post(new C76012o(lastLineHeight, this, view2));
                        }
                    } else {
                        get_collapseButton().measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    }
                    get_contentText().mo154992j(TextUtils.TruncateAt.END, (getResource().getDisplayMetrics().density * 1.0f) + 0.5f + ((float) getCollapseButton().getMeasuredWidth()));
                    if (i3 != null) {
                        int i4 = this.f220352B - 1;
                        int l0 = ((NeatLayout) i3).mo109128l0() - 1;
                        this.f220370U = this.f220354D ? ((C112481c) i3).mo109125e(i4) : 0.0f;
                        this.f220371V = ((C112481c) i3).mo109125e(l0);
                    }
                    mo104238x();
                }
            }
            CharSequence charSequence = this.f220355E;
            if (this.f220354D) {
                get_contentBackupText().setVisibility(0);
                get_contentText().setVisibility(8);
                get_contentBackupText().setText(charSequence);
            } else {
                get_contentText().setVisibility(0);
                get_contentBackupText().setVisibility(8);
                get_contentText().mo104279b(charSequence);
            }
        }
        super.onMeasure(i, i2);
        if (!this.f220368S && getCollapseButton().getVisibility() != 8) {
            View collapseButton2 = getCollapseButton();
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = collapseButton2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/widget/MMCollapsibleTextView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            collapseButton2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/ui/widget/MMCollapsibleTextView", "onMeasure", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void setCollapseButtonExpendText(int i) {
        this.f220372W = i;
    }

    public final void setCollapseButtonText(int i) {
        this.f220372W = i;
    }

    public final void setCollapsed(boolean z) {
        this.f220365P = z;
    }

    public final void setOnCollapse(C32224a<C13598b0> aVar) {
        this.f220366Q = aVar;
    }

    public final void setOnExpand(C32224a<C13598b0> aVar) {
        this.f220367R = aVar;
    }

    public final void setOnTextTouchListener(View.OnTouchListener onTouchListener) {
        get_contentBackupText().setOnTouchListener(onTouchListener);
        get_contentText().setOnTouchListener(onTouchListener);
    }

    public final void setSpecialText(boolean z) {
        this.f220354D = z;
    }

    public final void setText(CharSequence charSequence) {
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        this.f220355E = charSequence;
        this.f220375x = true;
    }

    /* renamed from: t */
    public final void mo104236t(AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = this.f220374w.obtainStyledAttributes(attributeSet, C77853a.f226865k, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            i5 = -1;
            i4 = -1;
            i3 = -1;
            i2 = -1;
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 4) {
                    this.f220352B = obtainStyledAttributes.getInt(index, Integer.MAX_VALUE);
                } else if (index == 0) {
                    i3 = obtainStyledAttributes.getDimensionPixelSize(index, i3);
                } else {
                    boolean z = true;
                    if (index == 1) {
                        i5 = obtainStyledAttributes.getColor(index, i5);
                    } else if (index == 2) {
                        i4 = obtainStyledAttributes.getColor(index, i4);
                    } else if (index == 5) {
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i2);
                    } else if (index == 6) {
                        if (obtainStyledAttributes.getInt(index, 0) == 0) {
                            z = false;
                        }
                        this.f220377z = z;
                    } else if (index == 8) {
                        this.f220376y = obtainStyledAttributes.getBoolean(index, this.f220376y);
                    } else if (index == 7) {
                        if (obtainStyledAttributes.getInt(index, 0) == 0) {
                            z = false;
                        }
                        this.f220351A = z;
                    }
                }
            }
        } else {
            i5 = -1;
            i4 = -1;
            i3 = -1;
            i2 = -1;
        }
        C85868k2.m106137b(this.f220374w).inflate(this.f220353C, this);
        if (i4 != -1) {
            get_collapseButton().setTextColor(i4);
        }
        if (i5 != -1) {
            get_contentText().setTextColor(i5);
            get_contentBackupText().setTextColor(i5);
        }
        if (i3 != -1) {
            float f = (float) i3;
            get_collapseButton().setTextSize(0, f);
            get_contentText().mo154994l(0, f);
            get_contentBackupText().setTextSize(0, f);
        }
        if (i2 != -1) {
            get_contentText().setSpacingAdd(i2);
            get_contentBackupText().setLineSpacing((float) i2, 1.0f);
        }
        getFullContentPlaceHolder().setEmptyVisibility(8);
        getCenterContentPlaceHolder().setEmptyVisibility(8);
        getLeftBottomCollapsePlaceHolder().setEmptyVisibility(8);
        getRightBottomCollapsePlaceHolder().setEmptyVisibility(8);
        getRightCollapsePlaceHolder().setEmptyVisibility(8);
    }

    /* renamed from: w */
    public final void mo104237w(int i, float f) {
        get_collapseButton().setTextSize(i, f);
        get_contentText().mo154994l(i, f);
        get_contentBackupText().setTextSize(i, f);
    }

    /* renamed from: x */
    public final void mo104238x() {
        if (getLastLineRight() < (this.f220354D ? (((float) this.f220369T) * 3.0f) / 4.0f : (float) (this.f220369T - getCollapseButton().getMeasuredWidth()))) {
            ViewGroup.LayoutParams layoutParams = getRightCollapsePlaceHolder().getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = (Math.max(0, getLastLineHeight() - getCollapseButton().getMeasuredHeight()) / 2) + 1;
            getRightCollapsePlaceHolder().setLayoutParams(marginLayoutParams);
            getRightBottomCollapsePlaceHolder().setContentId(-1);
            getRightCollapsePlaceHolder().setContentId(getCollapseButton().getId());
            getRightCollapsePlaceHolder().mo91158b(this);
            return;
        }
        getRightCollapsePlaceHolder().setContentId(-1);
        getRightBottomCollapsePlaceHolder().setContentId(getCollapseButton().getId());
        getRightBottomCollapsePlaceHolder().mo91158b(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MMCollapsibleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f220374w = context;
        mo104236t(attributeSet, i);
    }
}
