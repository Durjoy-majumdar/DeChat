package zt2;

import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import vr2.C102236a0;

/* renamed from: zt2.a */
public final class C103075a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f304131d;

    public C103075a(ViewGroup viewGroup) {
        this.f304131d = viewGroup;
    }

    public final void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$1");
        ViewGroup viewGroup = this.f304131d;
        C102236a0.m134775v0(viewGroup, Float.valueOf(((float) viewGroup.getMeasuredHeight()) / ((float) 2)));
        this.f304131d.invalidate();
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView$showUnreadTierView$1");
    }
}
