package com.tencent.p014mm.p136ui.base.sortview;

import android.database.DataSetObserver;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.sortview.BaseSortView;
import com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView;
import java.util.ArrayList;
import java.util.List;
import qj3.C47864f;

/* renamed from: com.tencent.mm.ui.base.sortview.a */
public class C44720a extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ BaseSortView f121309a;

    public C44720a(BaseSortView baseSortView) {
        this.f121309a = baseSortView;
    }

    public void onChanged() {
        BaseSortView baseSortView = this.f121309a;
        BaseSortView.C44719a aVar = baseSortView.f121308r;
        if (aVar != null) {
            List<C47864f> list = baseSortView.f121300g.f121310d;
            BrandServiceSortView brandServiceSortView = (BrandServiceSortView) aVar;
            TextView textView = brandServiceSortView.f109207G;
            if (textView != null && list != null) {
                textView.setText(brandServiceSortView.getContext().getString(C0966R.string.ate, new Object[]{Integer.valueOf(((ArrayList) list).size())}));
            }
        }
    }
}
