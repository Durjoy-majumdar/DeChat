package com.tencent.p014mm.plugin.sns.p106ui;

import android.widget.ListView;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.sns.model.C5431p1;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vending.base.Vending;
import ft2.C97979c;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$u */
public class SnsTimeLineUI$$u implements Vending.C97302l {

    /* renamed from: a */
    public final /* synthetic */ SnsTimeLineUI f278784a;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$$u$a */
    public class C95657a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f278785d;

        public C95657a(int i) {
            this.f278785d = i;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$4$1");
            SnsTimeLineUI.m122302d8(SnsTimeLineUI$$u.this.f278784a).getSnsListView().setSelectionFromTop(SnsTimeLineUI.m122302d8(SnsTimeLineUI$$u.this.f278784a).getSnsListView().getHeaderViewsCount(), this.f278785d + C74942w4.m89784a(SnsTimeLineUI$$u.this.f278784a.getContext(), 44));
            C94866e1.fy0().f275364s = false;
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$4$1");
        }
    }

    public SnsTimeLineUI$$u(SnsTimeLineUI snsTimeLineUI) {
        this.f278784a = snsTimeLineUI;
    }

    /* renamed from: a */
    public void mo133003a() {
        SnsMethodCalculate.markStartTimeMs("onVendingDataChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$4");
        if (SnsTimeLineUI.m122282J7(this.f278784a) != null) {
            C97979c J7 = SnsTimeLineUI.m122282J7(this.f278784a);
            J7.getClass();
            SnsMethodCalculate.markStartTimeMs("getPlayAnimation", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            boolean z = J7.f287351g;
            SnsMethodCalculate.markEndTimeMs("getPlayAnimation", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            if (!z) {
                SnsTimeLineUI.m122282J7(this.f278784a).notifyDataSetChanged();
                if (SnsTimeLineUI.m122302d8(this.f278784a).getSnsListView() != null) {
                    int a = C75044y4.m89989a(this.f278784a.getContext());
                    int f = C75044y4.m89994f(this.f278784a.getContext());
                    int i = 0;
                    Log.m105919d("MicroMsg.SnsTimeLineUI", "topOffset:%s curFetchMode:%s, mUIAction.header.getLoadingGroupHeight():%s, actionBar:%s, statusBar:%s", Integer.valueOf(-(((SnsTimeLineUI.m122302d8(this.f278784a).f278860p.getLoadingGroupHeight() - C74942w4.m89784a(this.f278784a.getContext(), 44)) - a) - f)), Integer.valueOf(C94866e1.fy0().f275362q), Integer.valueOf(SnsTimeLineUI.m122302d8(this.f278784a).f278860p.getLoadingGroupHeight()), Integer.valueOf(a), Integer.valueOf(f));
                    if (C94866e1.fy0().f275362q == 0) {
                        Log.m105924i("MicroMsg.SnsTimeLineUI", "curFetchMode == FETCH_MODE_SPECIFIC");
                        long i2 = SnsTimeLineUI.m122282J7(this.f278784a).mo137294i();
                        C94866e1.dy0().mo6421r(i2, -1);
                        SnsTimeLineUI.m122282J7(this.f278784a).mo137295j().mo137878r(C102236a0.m134763p0(i2));
                        SnsTimeLineUI snsTimeLineUI = this.f278784a;
                        long h = SnsTimeLineUI.m122282J7(snsTimeLineUI).mo137293h(true);
                        SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                        snsTimeLineUI.f278700y0 = h;
                        SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                        SnsTimeLineUI.m122302d8(this.f278784a).mo133028D(true);
                        C94866e1.Fx0().mo131118g0();
                        SnsTimeLineUI.m122302d8(this.f278784a).getSnsListView().post(new C95657a(a));
                    } else if (C94866e1.fy0().f275362q == 1) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= SnsTimeLineUI.m122282J7(this.f278784a).getCount()) {
                                i3 = 0;
                                break;
                            }
                            long j = SnsTimeLineUI.m122282J7(this.f278784a).getItem(i3).field_snsId;
                            SnsTimeLineUI snsTimeLineUI2 = this.f278784a;
                            SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                            long j2 = snsTimeLineUI2.f278700y0;
                            SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                            if (j == j2) {
                                break;
                            }
                            i3++;
                        }
                        SnsTimeLineUI snsTimeLineUI3 = this.f278784a;
                        SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                        long j3 = snsTimeLineUI3.f278700y0;
                        SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI");
                        Log.m105925i("MicroMsg.SnsTimeLineUI", "curFetchMode == FETCH_MODE_UP upFetchRightId:%s, rightIndex:%s", Long.valueOf(j3), Integer.valueOf(i3));
                        ListView snsListView = SnsTimeLineUI.m122302d8(this.f278784a).getSnsListView();
                        int headerViewsCount = i3 + SnsTimeLineUI.m122302d8(this.f278784a).getSnsListView().getHeaderViewsCount();
                        SnsUIAction d8 = SnsTimeLineUI.m122302d8(this.f278784a);
                        d8.getClass();
                        SnsMethodCalculate.markStartTimeMs("getHeaderHeight", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                        SnsHeader snsHeader = d8.f278860p;
                        if (snsHeader != null) {
                            i = snsHeader.getMeasuredHeight();
                            SnsMethodCalculate.markEndTimeMs("getHeaderHeight", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                        } else {
                            SnsMethodCalculate.markEndTimeMs("getHeaderHeight", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
                        }
                        snsListView.setSelectionFromTop(headerViewsCount, i);
                    } else if (C94866e1.fy0().f275362q == 2) {
                        C5431p1.C5432a dy02 = C94866e1.dy0();
                        dy02.getClass();
                        SnsMethodCalculate.markStartTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        long j4 = dy02.f21141i;
                        SnsMethodCalculate.markEndTimeMs("getTimeLastId", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
                        if (j4 == 0) {
                            C94866e1.dy0().mo6421r(SnsTimeLineUI.m122282J7(this.f278784a).mo137294i(), -1);
                        }
                    }
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("onVendingDataChanged", "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI$4");
    }
}
