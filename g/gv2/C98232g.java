package gv2;

import android.view.View;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.SnsAdBreakFrameVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d14.C58085t0;
import d14.C58100z0;
import gy3.C87412m;
import vr2.C37817q;
import wq2.C111834f;

/* renamed from: gv2.g */
public final class C98232g implements C111834f {

    /* renamed from: a */
    public final /* synthetic */ SnsAdBreakFrameVideoView f288013a;

    public C98232g(SnsAdBreakFrameVideoView snsAdBreakFrameVideoView) {
        this.f288013a = snsAdBreakFrameVideoView;
    }

    /* renamed from: a */
    public void mo137529a(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onPlayerStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
        SnsMethodCalculate.markEndTimeMs("onPlayerStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
    }

    /* renamed from: b */
    public void mo137530b(View view, String str) {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
        C87412m.m108594g(view, "playerView");
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_REASON);
        Log.m105918d("SnsAdCoverVideoView", "onError() called with: playerView = " + view + ", reason = " + str);
        C115669n.INSTANCE.mo175911u(1913, 1);
        C37817q.m41546b("break_video_error_info", "0", 0, 0, str);
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
    }

    /* renamed from: c */
    public void mo137531c(int i) {
        SnsMethodCalculate.markStartTimeMs("onStatusChanged", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
        Log.m105918d("SnsAdCoverVideoView", "onStatusChanged " + i);
        if (i == 5) {
            SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = this.f288013a;
            int i2 = SnsAdBreakFrameVideoView.f281420p;
            SnsMethodCalculate.markStartTimeMs("access$get_completionFlow$p", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            C58085t0<Boolean> t0Var = snsAdBreakFrameVideoView.f281429o;
            SnsMethodCalculate.markEndTimeMs("access$get_completionFlow$p", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            ((C58100z0) t0Var).mo82832d(Boolean.TRUE);
        }
        SnsMethodCalculate.markEndTimeMs("onStatusChanged", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
    }

    /* renamed from: d */
    public void mo137532d(View view) {
        SnsMethodCalculate.markStartTimeMs("onRelease", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
        C87412m.m108594g(view, "playerView");
        Log.m105918d("SnsAdCoverVideoView", "onRelease() called with: playerView = " + view);
        SnsMethodCalculate.markEndTimeMs("onRelease", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
    }

    /* renamed from: e */
    public void mo137533e() {
        SnsMethodCalculate.markStartTimeMs("onOpenGLInit", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
        SnsMethodCalculate.markEndTimeMs("onOpenGLInit", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$1");
    }
}
