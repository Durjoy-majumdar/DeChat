package bp1;

import bl3.C0325u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.api.proxy.ITPPreloadProxy;
import com.tencent.thumbplayer.api.proxy.TPDownloadParamData;
import com.tencent.thumbplayer.api.proxy.TPP2PProxyFactory;
import er1.C58741j5;
import gy3.C87412m;
import ht1.C60200t1;
import lu3.C34379c;
import te3.C64639pw0;
import te3.C64733to;
import zt3.C119157j;

/* renamed from: bp1.f */
public final class C54524f extends C0325u<C60200t1> {

    /* renamed from: d */
    public String f152874d = "";

    /* renamed from: e */
    public int f152875e;

    /* renamed from: f */
    public C34379c<?> f152876f;

    /* renamed from: g */
    public long f152877g;

    /* renamed from: bp1.f$a */
    public static final class C54525a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C54524f f152878d;

        /* renamed from: e */
        public final /* synthetic */ String f152879e;

        /* renamed from: f */
        public final /* synthetic */ String f152880f;

        /* renamed from: g */
        public final /* synthetic */ C64639pw0 f152881g;

        public C54525a(C54524f fVar, String str, String str2, C64639pw0 pw02) {
            this.f152878d = fVar;
            this.f152879e = str;
            this.f152880f = str2;
            this.f152881g = pw02;
        }

        public final void run() {
            C54524f fVar = this.f152878d;
            String str = this.f152879e;
            String str2 = this.f152880f;
            C87412m.m108593f(str2, "preloadUrl");
            long j = (long) this.f152881g.f184904f;
            fVar.getClass();
            ITPPreloadProxy createPreloadManager = TPP2PProxyFactory.createPreloadManager(MMApplicationContext.getContext(), 100);
            TPDownloadParamData tPDownloadParamData = new TPDownloadParamData(0);
            tPDownloadParamData.url = str2;
            tPDownloadParamData.setDownloadFileID(str);
            tPDownloadParamData.setPreloadSize(j);
            C58741j5 j5Var = C58741j5.f168184a;
            C87412m.m108594g(str, "id");
            tPDownloadParamData.setSavePath(C58741j5.f168187d + str);
            C86013q1.m106444e(tPDownloadParamData.getSavePath());
            createPreloadManager.setPreloadListener(new C79747g(fVar, str));
            fVar.f152875e = createPreloadManager.startPreload(str, tPDownloadParamData);
            Log.m105924i("LiveReplayTransitionPreloadSlice", "preloadTTPlayer:" + str2 + "  fileId(replayTransitionId):" + str + "  preloadSize bytes:" + j + " savePath:" + tPDownloadParamData.getSavePath() + " videoType:" + -1 + ",preloadId:" + fVar.f152875e);
        }
    }

    /* renamed from: c3 */
    public final void mo75385c3(int i) {
        Log.m105924i("LiveReplayTransitionPreloadSlice", "cancelPreloadTask source:" + i + ",preloadId:" + this.f152875e + '!');
        C34379c<?> cVar = this.f152876f;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f152875e = 0;
        this.f152876f = null;
    }

    /* renamed from: d3 */
    public final void mo75386d3(String str, C64733to toVar, C64639pw0 pw02) {
        String str2 = toVar.f185622e;
        long j = pw02.f184909n;
        this.f152877g = j;
        long currentTimeMillis = (j * ((long) 1000)) - System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        this.f152874d = str;
        this.f152876f = ((C119157j) C119157j.f356862d).mo183878i(new C54525a(this, str, str2, pw02), currentTimeMillis);
        Log.m105924i("LiveReplayTransitionPreloadSlice", "execPreloadTask taskId(replayTransitionId):" + this.f152874d + ", preloadUrl:" + str2 + " ,lastWorkExcuteTime:" + this.f152877g + ",delayTime:" + currentTimeMillis + '!');
    }

    /* renamed from: e3 */
    public final String mo75387e3() {
        return "taskId:" + this.f152874d + ",preloadId:" + this.f152875e + ",preloadWork is null:" + true;
    }

    public void onCleared() {
        Log.m105924i("LiveReplayTransitionPreloadSlice", "onCleared " + mo75387e3());
        mo75385c3(5);
        super.onCleared();
    }
}
