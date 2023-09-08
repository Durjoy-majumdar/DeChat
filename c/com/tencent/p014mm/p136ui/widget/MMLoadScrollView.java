package com.tencent.p014mm.p136ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.tencent.p014mm.plugin.fav.p047ui.detail.BaseFavDetailReportUI;

/* renamed from: com.tencent.mm.ui.widget.MMLoadScrollView */
public class MMLoadScrollView extends ScrollView {

    /* renamed from: d */
    public C97273a f285485d;

    /* renamed from: com.tencent.mm.ui.widget.MMLoadScrollView$a */
    public interface C97273a {
    }

    public MMLoadScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        C97273a aVar;
        if (z2 && i2 > 0 && (aVar = this.f285485d) != null) {
            BaseFavDetailReportUI.this.f270015g.f295032q = true;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    public void setOnTopOrBottomListerner(C97273a aVar) {
        this.f285485d = aVar;
    }

    public MMLoadScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
