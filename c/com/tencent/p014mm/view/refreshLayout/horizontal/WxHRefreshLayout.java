package com.tencent.p014mm.view.refreshLayout.horizontal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import gy3.C87412m;
import kotlin.Metadata;
import nq3.C109756a;
import nq3.C109757b;
import oq3.C21803b;
import oq3.C21805g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, mo182094d2 = {"Lcom/tencent/mm/view/refreshLayout/horizontal/WxHRefreshLayout;", "Lcom/tencent/mm/view/refreshLayout/WxRefreshLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.view.refreshLayout.horizontal.WxHRefreshLayout */
public final class WxHRefreshLayout extends WxRefreshLayout {

    /* renamed from: H */
    public boolean f319970H;

    public WxHRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getCommonConfig().f126543e = false;
        C109756a aVar = new C109756a();
        this.f56675s = aVar;
        C21803b bVar = this.f56663d;
        if (bVar != null) {
            bVar.mo34215c(aVar);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21803b contentPlugin = getContentPlugin();
        if (contentPlugin != null && !(contentPlugin instanceof C109757b)) {
            C109757b bVar = new C109757b(contentPlugin.getView());
            bVar.f332551e.f331531b = getScrollBoundaryDecider();
            bVar.f332551e.f331532c = getCommonConfig().f126547i;
            bVar.mo34218g(this);
            setContentPlugin(bVar);
        }
        setRotation(-90.0f);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C21805g gVar;
        C21805g gVar2;
        int i5;
        int i6;
        int i7 = i3 - i;
        int i8 = i4 - i2;
        int i9 = (i8 - i7) / 2;
        int i15 = 0;
        if (this.f319970H) {
            C21805g headerPlugin = getHeaderPlugin();
            C21805g footerPlugin = getFooterPlugin();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int childCount = getChildCount();
            while (i15 < childCount) {
                View childAt = getChildAt(i15);
                C87412m.m108593f(childAt, "getChildAt(i)");
                if ((headerPlugin == null || !C87412m.m108589b(childAt, headerPlugin.getView())) && ((footerPlugin == null || !C87412m.m108589b(childAt, footerPlugin.getView())) && childAt.getVisibility() != 8)) {
                    int i16 = i7 - (paddingTop + paddingBottom);
                    int i17 = i8 - (paddingLeft + paddingRight);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int i18 = marginLayoutParams.topMargin;
                        gVar2 = headerPlugin;
                        int i19 = marginLayoutParams.bottomMargin;
                        i16 -= i18 + i19;
                        int i25 = marginLayoutParams.leftMargin;
                        i17 -= marginLayoutParams.rightMargin + i25;
                        i6 = i19 + paddingBottom;
                        i5 = i25 + paddingLeft;
                    } else {
                        gVar2 = headerPlugin;
                        i5 = paddingLeft;
                        i6 = paddingBottom;
                    }
                    int i26 = (i16 - i17) / 2;
                    int i27 = i6 + i26;
                    int i28 = i5 - i26;
                    childAt.setRotation(90.0f);
                    gVar = footerPlugin;
                    childAt.setTag(C0966R.C0970id.lu8, "GONE");
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17, 1073741824), View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                    childAt.layout(i27, i28, i17 + i27, i16 + i28);
                } else {
                    gVar2 = headerPlugin;
                    gVar = footerPlugin;
                }
                i15++;
                headerPlugin = gVar2;
                footerPlugin = gVar;
            }
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int i29 = i2 - i9;
        int i35 = i + i9;
        this.f319970H = true;
        layout(i35, i29, i7 + i35, i8 + i29);
        this.f319970H = false;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WxHRefreshLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(attributeSet, "attrs");
        getCommonConfig().f126543e = false;
        C109756a aVar = new C109756a();
        this.f56675s = aVar;
        C21803b bVar = this.f56663d;
        if (bVar != null) {
            bVar.mo34215c(aVar);
        }
    }
}
