package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.p014mm.p136ui.base.MMPullDownView;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.e0 */
public class C41326e0 implements MMPullDownView.C73178e {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceProfileUI f111301d;

    public C41326e0(ExdeviceProfileUI exdeviceProfileUI) {
        this.f111301d = exdeviceProfileUI;
    }

    /* renamed from: b0 */
    public boolean mo64386b0() {
        if (this.f111301d.f111182p.getFirstVisiblePosition() != 0) {
            return false;
        }
        ListView listView = this.f111301d.f111182p;
        View childAt = listView.getChildAt(listView.getFirstVisiblePosition());
        return childAt != null && childAt.getTop() >= 0;
    }
}
