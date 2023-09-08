package com.tencent.p014mm.plugin.fav.p047ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.MMLoadScrollView;
import com.tencent.p014mm.plugin.fav.p047ui.detail.BaseFavDetailReportUI;

/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavDetailScrollView */
public class FavDetailScrollView extends MMLoadScrollView {

    /* renamed from: e */
    public C93715a f270517e;

    /* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavDetailScrollView$a */
    public interface C93715a {
    }

    public FavDetailScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        C93715a aVar;
        super.onScrollChanged(i, i2, i3, i4);
        if (getScrollY() != 0 || (aVar = this.f270517e) == null) {
            C93715a aVar2 = this.f270517e;
            if (aVar2 != null) {
                BaseFavDetailReportUI.this.showActionbarLine();
                return;
            }
            return;
        }
        BaseFavDetailReportUI.this.hideActionbarLine();
    }

    public void setOnScrollChangeListener(C93715a aVar) {
        this.f270517e = aVar;
    }

    public FavDetailScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
