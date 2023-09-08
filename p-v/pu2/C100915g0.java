package pu2;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.sns.p106ui.SnsTimeLineBaseAdapter;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import gy3.C87412m;
import nj3.C11184p0;

/* renamed from: pu2.g0 */
public final class C100915g0 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ C100954s f295524d;

    /* renamed from: e */
    public final /* synthetic */ SnsTimeLineBaseAdapter f295525e;

    public C100915g0(C100954s sVar, SnsTimeLineBaseAdapter snsTimeLineBaseAdapter) {
        this.f295524d = sVar;
        this.f295525e = snsTimeLineBaseAdapter;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$8");
        C87412m.m108594g(menuItem, "menuItem");
        if (menuItem.getItemId() == 14 || menuItem.getItemId() == 16) {
            C100954s sVar = this.f295524d;
            sVar.getClass();
            SnsMethodCalculate.markStartTimeMs("markDirty", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemNotify");
            sVar.f295627R0 = 16 | sVar.f295627R0;
            SnsMethodCalculate.markEndTimeMs("markDirty", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemNotify");
        }
        this.f295525e.f278572f.f280381k.onMMMenuItemSelected(menuItem, i);
        SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineItemClick$updateClickListener$8");
    }
}
