package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0013R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/ui/widget/InsectFrameLayout;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "", "", "g", "Lfy3/l;", "getInsectCallback", "()Lfy3/l;", "setInsectCallback", "(Lfy3/l;)V", "insectCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.widget.InsectFrameLayout */
public class InsectFrameLayout extends FrameLayout {

    /* renamed from: d */
    public final String f122332d;

    /* renamed from: e */
    public Rect f122333e;

    /* renamed from: f */
    public int[] f122334f;

    /* renamed from: g */
    public C32226l<? super Integer, Boolean> f122335g;

    /* renamed from: com.tencent.mm.ui.widget.InsectFrameLayout$a */
    public static final class C45099a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ InsectFrameLayout f122336d;

        /* renamed from: e */
        public final /* synthetic */ int f122337e;

        public C45099a(InsectFrameLayout insectFrameLayout, int i) {
            this.f122336d = insectFrameLayout;
            this.f122337e = i;
        }

        public final void run() {
            String str = this.f122336d.f122332d;
            Log.m105924i(str, "InsectFrameLayout onLayout. bottomInsect=" + this.f122337e);
            InsectFrameLayout insectFrameLayout = this.f122336d;
            insectFrameLayout.setPadding(insectFrameLayout.getPaddingLeft(), this.f122336d.getPaddingTop(), this.f122336d.getPaddingRight(), this.f122337e);
            this.f122336d.requestLayout();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsectFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f122332d = "MicroMsg.InsectLayout";
        this.f122333e = new Rect();
        this.f122334f = new int[2];
    }

    /* renamed from: a */
    public boolean mo70447a(int i) {
        return false;
    }

    public final C32226l<Integer, Boolean> getInsectCallback() {
        return this.f122335g;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C32226l<? super Integer, Boolean> lVar;
        getWindowVisibleDisplayFrame(this.f122333e);
        getLocationOnScreen(this.f122334f);
        int i5 = ((i4 - i2) + this.f122334f[1]) - this.f122333e.bottom;
        boolean a = mo70447a(i5);
        if (!a && (lVar = this.f122335g) != null) {
            C87412m.m108591d(lVar);
            a = lVar.invoke(Integer.valueOf(i5)).booleanValue();
        }
        String str = this.f122332d;
        Log.m105918d(str, "InsectFrameLayout onLayout. handled=" + a + " bottom=" + i4);
        if (!a && getPaddingBottom() != i5) {
            post(new C45099a(this, i5));
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    public final void setInsectCallback(C32226l<? super Integer, Boolean> lVar) {
        this.f122335g = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InsectFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }
}
