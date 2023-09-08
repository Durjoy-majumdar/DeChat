package com.tencent.p014mm.plugin.sns.p106ui;

import android.widget.AbsListView;
import android.widget.ListView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import ft2.C97983h;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.sns.ui.g8 */
public class C95796g8 implements AbsListView.OnScrollListener {

    /* renamed from: d */
    public final /* synthetic */ SnsWsFoldDetailUI f279547d;

    public C95796g8(SnsWsFoldDetailUI snsWsFoldDetailUI) {
        this.f279547d = snsWsFoldDetailUI;
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        arrayList.add(Integer.valueOf(i3));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$3");
        SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$3");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$3", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(absListView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$3");
        if (i == 0) {
            SnsWsFoldDetailUI snsWsFoldDetailUI = this.f279547d;
            int i2 = SnsWsFoldDetailUI.f279030C;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            C97983h hVar = snsWsFoldDetailUI.f279035f;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            if (hVar != null) {
                SnsWsFoldDetailUI snsWsFoldDetailUI2 = this.f279547d;
                SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                C95761d8 d8Var = snsWsFoldDetailUI2.f279032B;
                SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                SnsWsFoldDetailUI snsWsFoldDetailUI3 = this.f279547d;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                ListView listView = snsWsFoldDetailUI3.f279033d;
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
                d8Var.mo133218a(listView);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$3");
        C117292a.m165361g(this, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$3", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
