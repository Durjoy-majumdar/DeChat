package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.p014mm.p136ui.tools.C45059m0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;

/* renamed from: com.tencent.mm.plugin.sns.ui.g5 */
public class C95793g5 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f279544d;

    /* renamed from: com.tencent.mm.plugin.sns.ui.g5$a */
    public class C95794a implements C45059m0.C45068i {
        public C95794a() {
        }

        public void onAnimationEnd() {
            SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$14$1");
            if (!SnsOnlineVideoActivity.m122197L7(C95793g5.this.f279544d).f277182Y0) {
                OnlineVideoView L7 = SnsOnlineVideoActivity.m122197L7(C95793g5.this.f279544d);
                L7.getClass();
                SnsMethodCalculate.markStartTimeMs("hideFrameViewOnceRendered", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                C96875r0 r0Var = L7.f277145A;
                if (r0Var instanceof ThumbPlayerVideoView) {
                    ThumbPlayerVideoView thumbPlayerVideoView = (ThumbPlayerVideoView) r0Var;
                    OnlineVideoView$$b onlineVideoView$$b = new OnlineVideoView$$b(L7);
                    thumbPlayerVideoView.getClass();
                    thumbPlayerVideoView.f54450q.f54462c = onlineVideoView$$b;
                } else {
                    L7.postDelayed(new OnlineVideoView$$c(L7), 50);
                }
                SnsMethodCalculate.markEndTimeMs("hideFrameViewOnceRendered", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
            }
            if (SnsOnlineVideoActivity.m122197L7(C95793g5.this.f279544d) != null) {
                SnsOnlineVideoActivity snsOnlineVideoActivity = C95793g5.this.f279544d;
                SnsMethodCalculate.markStartTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                boolean z = snsOnlineVideoActivity.f278379I;
                SnsMethodCalculate.markEndTimeMs("access$2900", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                if (z) {
                    SnsOnlineVideoActivity.m122197L7(C95793g5.this.f279544d).mo130404K();
                } else {
                    SnsOnlineVideoActivity.m122197L7(C95793g5.this.f279544d).mo130403E();
                }
            }
            SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$14$1");
        }

        public void onAnimationStart() {
            SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$14$1");
            SnsOnlineVideoActivity.m122197L7(C95793g5.this.f279544d).f277153E.setVisibility(0);
            SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$14$1");
        }
    }

    public C95793g5(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f279544d = snsOnlineVideoActivity;
    }

    public boolean onPreDraw() {
        SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$14");
        SnsOnlineVideoActivity.m122199N7(this.f279544d).getViewTreeObserver().removeOnPreDrawListener(this);
        SnsOnlineVideoActivity snsOnlineVideoActivity = this.f279544d;
        SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        C45059m0 m0Var = snsOnlineVideoActivity.f278414x;
        SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        if (m0Var != null) {
            SnsOnlineVideoActivity.m122197L7(this.f279544d).setThumbViewScaleType(ImageView.ScaleType.FIT_CENTER);
            SnsOnlineVideoActivity snsOnlineVideoActivity2 = this.f279544d;
            SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            C45059m0 m0Var2 = snsOnlineVideoActivity2.f278414x;
            SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            FrameLayout N7 = SnsOnlineVideoActivity.m122199N7(this.f279544d);
            SnsOnlineVideoActivity snsOnlineVideoActivity3 = this.f279544d;
            SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            ImageView imageView = snsOnlineVideoActivity3.f278407q;
            SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            m0Var2.mo70408c(N7, imageView, new C95794a());
        }
        SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$14");
        return true;
    }
}
