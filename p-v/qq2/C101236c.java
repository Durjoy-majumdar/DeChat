package qq2;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import rq2.C101432s;

/* renamed from: qq2.c */
public class C101236c {

    /* renamed from: a */
    public String f296427a;

    /* renamed from: b */
    public ViewGroup f296428b;

    /* renamed from: c */
    public TimeLineObject f296429c;

    /* renamed from: d */
    public boolean f296430d;

    public C101236c(String str) {
        this.f296427a = TextUtils.isEmpty(str) ? "OnlineVideoChecker" : str;
    }

    /* renamed from: a */
    public void mo140697a() {
        SnsMethodCalculate.markStartTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        ViewGroup viewGroup = this.f296428b;
        if (viewGroup == null) {
            Log.m105920e(this.f296427a, "OnlineVideoChecker: the container is null");
            SnsMethodCalculate.markEndTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
            return;
        }
        TimeLineObject timeLineObject = this.f296429c;
        if (timeLineObject == null) {
            Log.m105920e(this.f296427a, "OnlineVideoChecker: the timeline object is null");
            SnsMethodCalculate.markEndTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
            return;
        }
        try {
            mo140698b(viewGroup, timeLineObject, this.f296430d);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
    }

    /* renamed from: b */
    public final void mo140698b(ViewGroup viewGroup, TimeLineObject timeLineObject, boolean z) {
        SnsMethodCalculate.markStartTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        if (!C101432s.m133123e(viewGroup)) {
            Log.m105924i(this.f296427a, "OnlineVideoChecker: there is no child video view in container!!");
        } else if (z) {
            View childAt = viewGroup.getChildAt(0);
            if ((childAt instanceof SnsTimelineVideoView) && !Util.isEqual(((SnsTimelineVideoView) childAt).f281251K1, timeLineObject.f283893Id)) {
                Log.m105924i(this.f296427a, "OnlineVideoChecker: the online video container has child, but the time line id is different!!");
                C101432s.m133121c(viewGroup);
            }
        } else {
            Log.m105924i(this.f296427a, "OnlineVideoChecker: it doesn't use online video container!!");
            C101432s.m133121c(viewGroup);
        }
        SnsMethodCalculate.markEndTimeMs("checkAndRemoveOnlineViewIfNeeded", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
    }

    /* renamed from: c */
    public C101236c mo140699c(ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        this.f296428b = viewGroup;
        SnsMethodCalculate.markEndTimeMs("container", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        return this;
    }

    /* renamed from: d */
    public C101236c mo140700d(TimeLineObject timeLineObject) {
        SnsMethodCalculate.markStartTimeMs("timeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        this.f296429c = timeLineObject;
        SnsMethodCalculate.markEndTimeMs("timeLineObject", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        return this;
    }

    /* renamed from: e */
    public C101236c mo140701e(boolean z) {
        SnsMethodCalculate.markStartTimeMs("useOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        this.f296430d = z;
        SnsMethodCalculate.markEndTimeMs("useOnlineVideo", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoChecker");
        return this;
    }
}
