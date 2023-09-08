package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelvideo.MMVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pluginsdk.p133ui.tools.VideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import xn2.C102693c;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView */
public class SnsAdStreamVideoView extends MMVideoView {

    /* renamed from: h1 */
    public static final /* synthetic */ int f281510h1 = 0;

    /* renamed from: g1 */
    public MTimerHandler f281511g1 = new MTimerHandler(new C96294b(), false);

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$a */
    public class C96293a implements C102693c {
        public C96293a() {
        }

        /* renamed from: a */
        public void mo4335a(int i) {
            SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
            SnsAdStreamVideoView snsAdStreamVideoView = SnsAdStreamVideoView.this;
            int i2 = SnsAdStreamVideoView.f281510h1;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
            boolean i0 = snsAdStreamVideoView.mo79629i0(i, true);
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
            if (i0) {
                SnsAdStreamVideoView snsAdStreamVideoView2 = SnsAdStreamVideoView.this;
                SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
                snsAdStreamVideoView2.mo127230T(false);
                SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
            }
            SnsAdStreamVideoView snsAdStreamVideoView3 = SnsAdStreamVideoView.this;
            SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
            VideoPlayerSeekBar videoPlayerSeekBar = snsAdStreamVideoView3.f283593o;
            SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
            videoPlayerSeekBar.setIsPlay(true);
            SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
        }

        /* renamed from: c */
        public void mo4336c(int i) {
            SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
            SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
        }

        public void onSeekPre() {
            SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
            SnsAdStreamVideoView snsAdStreamVideoView = SnsAdStreamVideoView.this;
            int i = SnsAdStreamVideoView.f281510h1;
            SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
            MTimerHandler mTimerHandler = snsAdStreamVideoView.f281511g1;
            SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
            mTimerHandler.stopTimer();
            SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$1");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$b */
    public class C96294b implements MTimerHandler.CallBack {
        public C96294b() {
        }

        public boolean onTimerExpired() {
            SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$2");
            SnsAdStreamVideoView.this.setIsShowBasicControls(false);
            SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView$2");
            return true;
        }
    }

    public SnsAdStreamVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: D */
    public C102693c mo134040D() {
        SnsMethodCalculate.markStartTimeMs("createSeekCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        C96293a aVar = new C96293a();
        SnsMethodCalculate.markEndTimeMs("createSeekCallback", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        return aVar;
    }

    /* renamed from: J */
    public int mo79393J() {
        SnsMethodCalculate.markStartTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        SnsMethodCalculate.markEndTimeMs("layoutId", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        return C0966R.C0971layout.c1x;
    }

    /* renamed from: j0 */
    public void mo134041j0() {
        SnsMethodCalculate.markStartTimeMs("startHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        this.f281511g1.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, 0);
        SnsMethodCalculate.markEndTimeMs("startHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
    }

    public SnsAdStreamVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
