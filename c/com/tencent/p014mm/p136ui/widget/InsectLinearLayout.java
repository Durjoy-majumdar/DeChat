package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u001aR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/InsectLinearLayout;", "Landroid/widget/LinearLayout;", "", "g", "Z", "getDiscardKeyboard", "()Z", "setDiscardKeyboard", "(Z)V", "discardKeyboard", "Lkotlin/Function1;", "", "h", "Lfy3/l;", "getInsectCallback", "()Lfy3/l;", "setInsectCallback", "(Lfy3/l;)V", "insectCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.InsectLinearLayout */
public class InsectLinearLayout extends LinearLayout {

    /* renamed from: d */
    public final String f122338d;

    /* renamed from: e */
    public Rect f122339e;

    /* renamed from: f */
    public int[] f122340f;

    /* renamed from: g */
    public boolean f122341g;

    /* renamed from: h */
    public C32226l<? super Integer, Boolean> f122342h;

    /* renamed from: com.tencent.mm.ui.widget.InsectLinearLayout$a */
    public static final class C45100a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ InsectLinearLayout f122343d;

        /* renamed from: e */
        public final /* synthetic */ int f122344e;

        public C45100a(InsectLinearLayout insectLinearLayout, int i) {
            this.f122343d = insectLinearLayout;
            this.f122344e = i;
        }

        public final void run() {
            InsectLinearLayout insectLinearLayout = this.f122343d;
            insectLinearLayout.setPadding(insectLinearLayout.getPaddingLeft(), this.f122343d.getPaddingTop(), this.f122343d.getPaddingRight(), this.f122344e);
            this.f122343d.requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsectLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f122338d = "MicroMsg.InsectLayout";
        this.f122339e = new Rect();
        this.f122340f = new int[2];
    }

    public final boolean getDiscardKeyboard() {
        return this.f122341g;
    }

    public final C32226l<Integer, Boolean> getInsectCallback() {
        return this.f122342h;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        Log.m105924i(this.f122338d, "InsectRelativeLayout onLayout");
        getWindowVisibleDisplayFrame(this.f122339e);
        getLocationOnScreen(this.f122340f);
        boolean z3 = true;
        int i5 = ((i4 - i2) + this.f122340f[1]) - this.f122339e.bottom;
        C32226l<? super Integer, Boolean> lVar = this.f122342h;
        if (lVar != null) {
            C87412m.m108591d(lVar);
            z2 = lVar.invoke(Integer.valueOf(i5)).booleanValue();
        } else {
            z2 = false;
        }
        boolean z4 = i5 > C75044y4.m89991c(getContext()) * 3;
        if (!z2 && (!z4 || !this.f122341g)) {
            z3 = false;
        }
        if (!z3 && getPaddingBottom() != i5) {
            post(new C45100a(this, i5));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void setDiscardKeyboard(boolean z) {
        this.f122341g = z;
    }

    public final void setInsectCallback(C32226l<? super Integer, Boolean> lVar) {
        this.f122342h = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InsectLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
