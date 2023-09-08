package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.p014mm.p136ui.base.MMPullDownView;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.d0 */
public class C41324d0 implements MMPullDownView.C73177d {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111299d;

    public C41324d0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111299d = exdeviceProfileUI;
    }

    /* renamed from: q0 */
    public boolean mo64384q0() {
        ListView listView = this.f111299d.f111182p;
        View childAt = listView.getChildAt(listView.getChildCount() - 1);
        int count = this.f111299d.f111182p.getAdapter().getCount();
        return count > 0 && childAt != null && childAt.getBottom() <= this.f111299d.f111182p.getHeight() && this.f111299d.f111182p.getLastVisiblePosition() >= count - 1;
    }
}
