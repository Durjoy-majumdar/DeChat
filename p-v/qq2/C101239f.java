package qq2;

import android.text.TextUtils;
import android.util.ArrayMap;
import bv2.C92318f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.video.SnsTimelineVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: qq2.f */
public class C101239f {

    /* renamed from: a */
    public final Map<String, OnlineVideoView> f296443a = new ArrayMap();

    /* renamed from: b */
    public String f296444b;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0037 A[Catch:{ all -> 0x0059 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView mo140704a(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "getVideoViewWithMediaId"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.util.Map<java.lang.String, com.tencent.mm.plugin.sns.ui.OnlineVideoView> r2 = r7.f296443a
            r3 = 0
            java.lang.String r4 = "VideoViewManager"
            if (r2 != 0) goto L_0x0017
            java.lang.String r8 = "are you sure? the map is null? I don't think the statement can reach!!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x0017:
            android.util.ArrayMap r2 = (android.util.ArrayMap) r2     // Catch:{ all -> 0x0059 }
            java.lang.Object r9 = r2.get(r9)     // Catch:{ all -> 0x0059 }
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r9 = (com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView) r9     // Catch:{ all -> 0x0059 }
            java.lang.String r2 = "shouldUseNewVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)     // Catch:{ all -> 0x0059 }
            r5 = 1
            if (r9 == 0) goto L_0x0031
            boolean r6 = r7.mo140705b(r9)     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r6 = 0
            goto L_0x0032
        L_0x0031:
            r6 = 1
        L_0x0032:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch:{ all -> 0x0059 }
            if (r6 == 0) goto L_0x0055
            java.lang.String r9 = "to new one video view!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r9)     // Catch:{ all -> 0x0059 }
            java.lang.String r9 = "onNewVideoView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r1)     // Catch:{ all -> 0x0059 }
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView r2 = new com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView     // Catch:{ all -> 0x0059 }
            r2.<init>((android.content.Context) r8, (boolean) r5)     // Catch:{ all -> 0x0059 }
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x0059 }
            r5 = -1
            r8.<init>(r5, r5)     // Catch:{ all -> 0x0059 }
            r2.setLayoutParams(r8)     // Catch:{ all -> 0x0059 }
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)     // Catch:{ all -> 0x0059 }
            r9 = r2
        L_0x0055:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        L_0x0059:
            java.lang.String r8 = "getVideoViewWithMediaId has something wrong!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: qq2.C101239f.mo140704a(android.content.Context, java.lang.String):com.tencent.mm.plugin.sns.ui.OnlineVideoView");
    }

    /* renamed from: b */
    public boolean mo140705b(OnlineVideoView onlineVideoView) {
        SnsMethodCalculate.markStartTimeMs("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        if (onlineVideoView instanceof SnsTimelineVideoView) {
            SnsTimelineVideoView snsTimelineVideoView = (SnsTimelineVideoView) onlineVideoView;
            if (snsTimelineVideoView.f281256P1 || snsTimelineVideoView.f281254N1 || snsTimelineVideoView.f277196h1) {
                Log.m105924i("VideoViewManager", "the video view is destroyed");
                SnsMethodCalculate.markEndTimeMs("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                return true;
            }
            SnsMethodCalculate.markEndTimeMs("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return false;
        }
        Log.m105928w("VideoViewManager", "the video view is not SnsTimelineVideoView");
        SnsMethodCalculate.markEndTimeMs("isVideoViewDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        return true;
    }

    /* renamed from: c */
    public void mo140706c(OnlineVideoView onlineVideoView) {
        OnlineVideoView onlineVideoView2;
        SnsMethodCalculate.markStartTimeMs("pauseOthers", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        Map<String, OnlineVideoView> map = this.f296443a;
        if (map == null) {
            SnsMethodCalculate.markEndTimeMs("pauseOthers", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return;
        }
        for (Map.Entry entry : ((ArrayMap) map).entrySet()) {
            if (!(entry == null || entry.getValue() == null || (onlineVideoView2 = (OnlineVideoView) entry.getValue()) == onlineVideoView)) {
                onlineVideoView2.mo132317G();
            }
        }
        SnsMethodCalculate.markEndTimeMs("pauseOthers", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    /* renamed from: d */
    public void mo140707d() {
        OnlineVideoView onlineVideoView;
        SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        Map<String, OnlineVideoView> map = this.f296443a;
        String str = this.f296444b;
        try {
            if (!(TextUtils.isEmpty(str) || map == null || (onlineVideoView = (OnlineVideoView) ((ArrayMap) map).get(str)) == null)) {
                onlineVideoView.mo132317G();
            }
        } catch (Throwable unused) {
            Log.m105920e("VideoViewManager", "pausePlay has something wrong!");
        }
        SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    /* renamed from: e */
    public void mo140708e() {
        SnsMethodCalculate.markStartTimeMs("removeDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        Map<String, OnlineVideoView> map = this.f296443a;
        if (map == null) {
            SnsMethodCalculate.markEndTimeMs("removeDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return;
        }
        Iterator it = ((ArrayMap) map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            boolean z = false;
            if (entry != null && mo140705b((OnlineVideoView) entry.getValue())) {
                z = true;
            }
            if (z) {
                it.remove();
            }
        }
        SnsMethodCalculate.markEndTimeMs("removeDestroyed", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    /* renamed from: f */
    public void mo140709f(OnlineVideoView onlineVideoView, String str) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        if (!(onlineVideoView == null || str == null)) {
            try {
                if (str.equals(this.f296444b)) {
                    SnsMethodCalculate.markStartTimeMs("isVideoViewPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                    if (onlineVideoView instanceof SnsTimelineVideoView) {
                        z = ((SnsTimelineVideoView) onlineVideoView).mo133919h0();
                        SnsMethodCalculate.markEndTimeMs("isVideoViewPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                    } else {
                        SnsMethodCalculate.markEndTimeMs("isVideoViewPause", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                        z = false;
                    }
                    if (z) {
                        if (onlineVideoView.getDuration() - onlineVideoView.getCurrentPosition() < 500) {
                            Log.m105924i("VideoViewManager", "the current position is too near to end of the video!!");
                            onlineVideoView.mo132322N(0, true);
                        } else {
                            onlineVideoView.mo130404K();
                        }
                    }
                    SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                }
            } catch (Throwable unused) {
                Log.m105920e("VideoViewManager", "resumePlay has something wrong!");
            }
        }
        Log.m105924i("VideoViewManager", "the media is is not same as the current one!!!");
        SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    /* renamed from: g */
    public void mo140710g(OnlineVideoView onlineVideoView, String str) {
        SnsMethodCalculate.markStartTimeMs("seekPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        try {
            Map<String, OnlineVideoView> map = this.f296443a;
            if (map == null || str == null || ((OnlineVideoView) ((ArrayMap) map).get(str)) != onlineVideoView || onlineVideoView == null || mo140705b(onlineVideoView)) {
                onlineVideoView = null;
            }
            if (onlineVideoView != null) {
                onlineVideoView.mo132322N(0, true);
                onlineVideoView.setTag(C0966R.C0970id.jpc, 1);
            } else {
                Log.m105924i("VideoViewManager", "the media is is not same as the current one, or the view is destroyed!!!");
            }
        } catch (Throwable unused) {
            Log.m105928w("VideoViewManager", "seekPlay has something wrong!");
        }
        SnsMethodCalculate.markEndTimeMs("seekPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    /* renamed from: h */
    public void mo140711h(OnlineVideoView onlineVideoView, C92318f fVar, String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        if (onlineVideoView == null || fVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
            return;
        }
        try {
            onlineVideoView.setVisibility(0);
            mo140706c(onlineVideoView);
            mo140708e();
            onlineVideoView.mo132324P(fVar.f264168a, fVar.f264169b, fVar.f264170c);
            onlineVideoView.mo132372y(false);
            onlineVideoView.setMute(true);
            onlineVideoView.mo130403E();
            Map<String, OnlineVideoView> map = this.f296443a;
            if (map != null) {
                ((ArrayMap) map).put(str2, onlineVideoView);
            }
            Log.m105918d("VideoViewManager", "the view map size is " + ((ArrayMap) map).size());
            this.f296444b = str2;
        } catch (Throwable unused) {
            Log.m105920e("VideoViewManager", "startPlay has something wrong!");
        }
        SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
    }

    /* renamed from: i */
    public void mo140712i() {
        SnsMethodCalculate.markStartTimeMs("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        try {
            Map<String, OnlineVideoView> map = this.f296443a;
            if (map == null) {
                SnsMethodCalculate.markEndTimeMs("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
                return;
            }
            for (Map.Entry entry : ((ArrayMap) map).entrySet()) {
                if (!(entry == null || entry.getValue() == null)) {
                    OnlineVideoView onlineVideoView = (OnlineVideoView) entry.getValue();
                    if (onlineVideoView instanceof SnsTimelineVideoView) {
                        ((SnsTimelineVideoView) onlineVideoView).mo133920i0();
                    }
                }
            }
            SnsMethodCalculate.markEndTimeMs("stopAll", "com.tencent.mm.plugin.sns.ad.timeline.video.online.VideoViewManager");
        } catch (Throwable unused) {
            Log.m105920e("VideoViewManager", "stopAll has something wrong!");
        }
    }
}
