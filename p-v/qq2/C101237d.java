package qq2;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.C96254a;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import rq2.C101432s;
import te3.C101804kv2;

/* renamed from: qq2.d */
public class C101237d {

    /* renamed from: a */
    public final String f296431a;

    /* renamed from: b */
    public ViewGroup f296432b;

    /* renamed from: c */
    public TimeLineObject f296433c;

    /* renamed from: d */
    public C101804kv2 f296434d;

    /* renamed from: e */
    public String f296435e;

    public C101237d(String str) {
        this.f296431a = TextUtils.isEmpty(str) ? "OnlineVideoLayoutBuilder" : str;
    }

    /* renamed from: a */
    public final void mo140702a() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
        if (this.f296434d == null) {
            Log.m105920e(this.f296431a, "OnlineVideoLayoutBuilder: the media object is null");
            z = false;
        } else {
            z = true;
        }
        if (this.f296433c == null) {
            Log.m105920e(this.f296431a, "OnlineVideoLayoutBuilder: the time line object is null");
            z = false;
        }
        if (this.f296432b == null) {
            Log.m105920e(this.f296431a, "OnlineVideoLayoutBuilder: the video container is null");
            z = false;
        }
        if (TextUtils.isEmpty(this.f296435e)) {
            Log.m105920e(this.f296431a, "OnlineVideoLayoutBuilder: the sns local id is empty");
            z = false;
        }
        if (z) {
            C101804kv2 kv22 = this.f296434d;
            TimeLineObject timeLineObject = this.f296433c;
            ViewGroup viewGroup = this.f296432b;
            String str = this.f296435e;
            SnsMethodCalculate.markStartTimeMs("layout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
            String str2 = timeLineObject.f283893Id;
            boolean f = C96254a.m123394d().mo133933f(str2);
            SnsTimelineVideoView b = C96254a.m123394d().mo133930b(str2);
            if (C101432s.m133123e(viewGroup)) {
                View childAt = viewGroup.getChildAt(0);
                if ((childAt instanceof SnsTimelineVideoView) && !Util.isEqual(str2, ((SnsTimelineVideoView) childAt).f281251K1)) {
                    Log.m105928w(this.f296431a, "the obj id is not equal, remove child!!!!");
                    C101432s.m133121c(viewGroup);
                }
            }
            if (b == null) {
                Log.m105928w(this.f296431a, "the item is  null!!!!");
            } else {
                b.mo132324P(kv22, str, timeLineObject.CreateTime);
            }
            if (b != null && !C101432s.m133123e(viewGroup)) {
                Log.m105928w(this.f296431a, "the videoView is not null, the container is empty");
                C101432s.m133126h(b);
                C101432s.m133131m(b, -1, -1);
                C101432s.m133132n(b, true);
                b.setVideoScaleType(C96814a.C96817e.COVER);
                C101432s.m133120b(viewGroup, b, 0);
            } else if (f && C101432s.m133123e(viewGroup) && !C96254a.m123394d().mo133932e(str2)) {
                Log.m105928w(this.f296431a, "the container is not empty, the state is invalid");
                C101432s.m133121c(viewGroup);
            }
            SnsMethodCalculate.markEndTimeMs("layout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
        }
        SnsMethodCalculate.markEndTimeMs("doLayout", "com.tencent.mm.plugin.sns.ad.timeline.video.online.OnlineVideoLayoutBuilder");
    }
}
