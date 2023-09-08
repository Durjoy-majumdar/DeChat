package ha0;

import com.tencent.maas.instamovie.MJAsyncTaskInfo;
import com.tencent.maas.instamovie.MJExportSettings;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.maas.model.time.MJTimeRange;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ja0.C60784e;
import y90.C38981g;

/* renamed from: ha0.f0 */
public final class C108200f0 extends C87413o implements C32227p<MJMovieSession.OnTaskProgress, MJMovieSession.OnComplete, MJAsyncTaskInfo> {

    /* renamed from: d */
    public final /* synthetic */ String f323991d;

    /* renamed from: e */
    public final /* synthetic */ String f323992e;

    /* renamed from: f */
    public final /* synthetic */ MJExportSettings f323993f;

    /* renamed from: g */
    public final /* synthetic */ C108183c0 f323994g;

    /* renamed from: h */
    public final /* synthetic */ long f323995h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108200f0(String str, String str2, MJExportSettings mJExportSettings, C108183c0 c0Var, long j) {
        super(2);
        this.f323991d = str;
        this.f323992e = str2;
        this.f323993f = mJExportSettings;
        this.f323994g = c0Var;
        this.f323995h = j;
    }

    public Object invoke(Object obj, Object obj2) {
        MJMovieSession.OnTaskProgress onTaskProgress = (MJMovieSession.OnTaskProgress) obj;
        MJMovieSession.OnComplete onComplete = (MJMovieSession.OnComplete) obj2;
        C87412m.m108594g(onTaskProgress, "onProgress");
        C87412m.m108594g(onComplete, "onComplete");
        Log.m105924i("MicroMsg.MaasMovieSessionManager", "export to " + this.f323991d + ", realPath: " + this.f323992e + ", dimen:" + this.f323993f.getVideoDimensionLevel());
        MJExportSettings mJExportSettings = this.f323993f;
        MJAsyncTaskInfo startExporting = this.f323994g.f323934a.startExporting(this.f323992e, MJTimeRange.PositiveInfiniteTimeRange, mJExportSettings, onTaskProgress, new C108198e0(mJExportSettings, this.f323991d, this.f323995h, onComplete));
        if ((startExporting != null ? startExporting.error : null) != null) {
            C60784e eVar = C60784e.f173126a;
            MJError mJError = startExporting.error;
            C87412m.m108593f(mJError, "ret.error");
            eVar.mo85716a(mJError);
            C38981g gVar = C38981g.f105024a;
            DimensionLevel valueOf = DimensionLevel.valueOf(this.f323993f.getVideoDimensionLevel());
            C87412m.m108593f(valueOf, "valueOf(exportSettings.videoDimensionLevel)");
            gVar.mo61862b(valueOf);
        }
        C87412m.m108593f(startExporting, "ret");
        return startExporting;
    }
}
