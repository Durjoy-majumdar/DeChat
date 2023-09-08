package bp1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.proxy.ITPPreloadProxy;

/* renamed from: bp1.g */
public final class C79747g implements ITPPreloadProxy.IPreloadListener {

    /* renamed from: a */
    public final /* synthetic */ C54524f f233724a;

    /* renamed from: b */
    public final /* synthetic */ String f233725b;

    public C79747g(C54524f fVar, String str) {
        this.f233724a = fVar;
        this.f233725b = str;
    }

    public void onPrepareDownloadProgressUpdate(int i, int i2, long j, long j2) {
        Log.m105924i("LiveReplayTransitionPreloadSlice", "preloadTTPlayer  onPrepareDownloadProgressUpdate   fileId(replayTransitionId):" + this.f233725b + "   playableDurationMS:" + i + "  currentDownloadSizeByte：" + j + "   totalFileSizeByte:" + j2);
    }

    public void onPrepareError() {
        this.f233724a.f152875e = 0;
        Log.m105920e("LiveReplayTransitionPreloadSlice", "preloadTTPlayer  onPrepareError  fileId(replayTransitionId):" + this.f233725b);
    }

    public void onPrepareSuccess() {
        this.f233724a.f152875e = 0;
        Log.m105924i("LiveReplayTransitionPreloadSlice", "preloadTTPlayer  onPrepareSuccess  fileId(replayTransitionId):" + this.f233725b);
    }
}
