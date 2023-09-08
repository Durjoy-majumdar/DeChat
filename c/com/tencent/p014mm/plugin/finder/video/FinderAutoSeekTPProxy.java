package com.tencent.p014mm.plugin.finder.video;

import android.content.Context;
import android.util.AttributeSet;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import com.tencent.p014mm.sdk.platformtools.Log;
import gr1.C59673q2;
import gy3.C87412m;
import kotlin.Metadata;
import o40.C61926c;
import os1.C62168u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderAutoSeekTPProxy;", "Lcom/tencent/mm/plugin/finder/video/FinderThumbPlayerProxy;", "", "getStartPlayMs", "g1", "J", "getContinuePlayTimeLimitMs", "()J", "setContinuePlayTimeLimitMs", "(J)V", "continuePlayTimeLimitMs", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy */
public final class FinderAutoSeekTPProxy extends FinderThumbPlayerProxy {

    /* renamed from: f1 */
    public final C62168u f161652f1;

    /* renamed from: g1 */
    public long f161653g1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAutoSeekTPProxy(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…StateCacheVM::class.java)");
        this.f161652f1 = (C62168u) a;
    }

    /* renamed from: f0 */
    public final void mo79388f0(String str) {
        FeedData feedData;
        C59673q2 videoMediaInfo = getVideoMediaInfo();
        if (videoMediaInfo != null && (feedData = videoMediaInfo.f170496f) != null) {
            long feedId = feedData.getFeedId();
            long currentPlayMs = getCurrentPlayMs();
            long videoDurationMs = getVideoDurationMs();
            int i = (int) ((((float) currentPlayMs) / ((float) videoDurationMs)) * ((float) 500));
            Log.m105924i("FinderAutoSeekTPProxy", "storeVideoProgress: source=" + str + ", progress=" + i + ", currentPlayMs=" + currentPlayMs + ", videoDurationMs=" + videoDurationMs);
            if (currentPlayMs >= 0 && videoDurationMs > 0) {
                this.f161652f1.mo87225j3(feedId, 0, i, currentPlayMs, 1.0f);
            }
        }
    }

    public final long getContinuePlayTimeLimitMs() {
        return this.f161653g1;
    }

    public long getStartPlayMs() {
        FeedData feedData;
        C59673q2 videoMediaInfo = getVideoMediaInfo();
        if (!(videoMediaInfo == null || (feedData = videoMediaInfo.f170496f) == null)) {
            long feedId = feedData.getFeedId();
            boolean z = false;
            C62168u.C62169a f3 = this.f161652f1.mo87222f3(feedId, false);
            if (f3 != null) {
                if (this.f161653g1 <= 0 || System.currentTimeMillis() - f3.f176755f < this.f161653g1) {
                    z = true;
                }
                Log.m105924i("FinderAutoSeekTPProxy", "getStartPlayMs: enableContinuePlay=" + z + ", playTimeMs=" + f3.f176753d + ", feedId=" + C61926c.m72691p(feedId) + ", continuePlayTimeLimitMs=" + this.f161653g1);
                if (z) {
                    return f3.f176753d;
                }
            }
        }
        return 0;
    }

    public boolean pause() {
        boolean pause = super.pause();
        if (pause) {
            mo79388f0("pause");
        }
        return pause;
    }

    public final void setContinuePlayTimeLimitMs(long j) {
        this.f161653g1 = j;
    }

    public void stop() {
        if (mo79443L()) {
            mo79388f0("stop");
        }
        super.stop();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAutoSeekTPProxy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…StateCacheVM::class.java)");
        this.f161652f1 = (C62168u) a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderAutoSeekTPProxy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62168u.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…StateCacheVM::class.java)");
        this.f161652f1 = (C62168u) a;
    }
}
