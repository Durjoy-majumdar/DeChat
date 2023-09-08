package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import com.tencent.p014mm.p136ui.base.C19706a;
import com.tencent.p014mm.p136ui.base.MMPageControlView;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsBrowseUI$$c */
public class SnsBrowseUI$$c implements C45059m0.C45068i {

    /* renamed from: a */
    public final /* synthetic */ SnsBrowseUI f277818a;

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsBrowseUI$$c$a */
    public class C95479a implements Runnable {
        public C95479a() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$1");
            SnsInfoFlip snsInfoFlip = SnsBrowseUI$$c.this.f277818a.f277761o;
            snsInfoFlip.getClass();
            SnsMethodCalculate.markStartTimeMs("adaptImgViewSize", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            MMViewPager mMViewPager = snsInfoFlip.f278147U;
            if (mMViewPager != null) {
                View selectedView = mMViewPager.getSelectedView();
                if (selectedView instanceof C19706a) {
                    ((C19706a) selectedView).mo26059d();
                }
            }
            SnsMethodCalculate.markEndTimeMs("adaptImgViewSize", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.SnsBrowseUI$$c$b */
    public class C95480b implements Runnable {
        public C95480b() {
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$2");
            SnsBrowseUI$$c.this.f277818a.finish();
            SnsBrowseUI$$c.this.f277818a.overridePendingTransition(0, 0);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4$2");
        }
    }

    public SnsBrowseUI$$c(SnsBrowseUI snsBrowseUI) {
        this.f277818a = snsBrowseUI;
    }

    public void onAnimationEnd() {
        SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4");
        SnsBrowseUI snsBrowseUI = this.f277818a;
        int i = SnsBrowseUI.f277783g1;
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        MMHandler mMHandler = snsBrowseUI.f277792T0;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        mMHandler.post(new C95480b());
        SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4");
    }

    public void onAnimationStart() {
        SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4");
        SnsInfoFlip snsInfoFlip = this.f277818a.f277761o;
        snsInfoFlip.getClass();
        SnsMethodCalculate.markStartTimeMs("setPageControlGone", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        MMPageControlView mMPageControlView = snsInfoFlip.f278156a1;
        if (mMPageControlView != null) {
            mMPageControlView.setVisibility(8);
        }
        SnsMethodCalculate.markEndTimeMs("setPageControlGone", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        SnsBrowseUI snsBrowseUI = this.f277818a;
        int i = SnsBrowseUI.f277783g1;
        SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        MMHandler mMHandler = snsBrowseUI.f277792T0;
        SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI");
        mMHandler.postDelayed(new C95479a(), 20);
        SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsBrowseUI$4");
    }
}
