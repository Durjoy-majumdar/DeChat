package ha0;

import a14.C53895h;
import a14.C53934p0;
import com.tencent.maas.instamovie.MJExportSettings;
import com.tencent.maas.instamovie.MJMovieSession;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ja0.C60782c;
import ja0.C60784e;
import wx3.C15601d;
import wx3.C66212f;
import y90.C38981g;

/* renamed from: ha0.e0 */
public final class C108198e0 implements MJMovieSession.OnComplete {

    /* renamed from: a */
    public final /* synthetic */ MJExportSettings f323984a;

    /* renamed from: b */
    public final /* synthetic */ String f323985b;

    /* renamed from: c */
    public final /* synthetic */ long f323986c;

    /* renamed from: d */
    public final /* synthetic */ MJMovieSession.OnComplete f323987d;

    public C108198e0(MJExportSettings mJExportSettings, String str, long j, MJMovieSession.OnComplete onComplete) {
        this.f323984a = mJExportSettings;
        this.f323985b = str;
        this.f323986c = j;
        this.f323987d = onComplete;
    }

    public final void onComplete(MJError mJError) {
        if (mJError != null) {
            C60784e.f173126a.mo85716a(mJError);
            if (mJError.f154609ec == MJError.MaasEC.VideoEncodeFailed) {
                Log.m105920e("MicroMsg.MaasMovieSessionManager", "export encode error, mark");
                C38981g gVar = C38981g.f105024a;
                DimensionLevel valueOf = DimensionLevel.valueOf(this.f323984a.getVideoDimensionLevel());
                C87412m.m108593f(valueOf, "valueOf(exportSettings.videoDimensionLevel)");
                gVar.mo61862b(valueOf);
            }
        } else {
            C60784e eVar = C60784e.f173126a;
            String str = this.f323985b;
            C87412m.m108594g(str, "videoPath");
            C60784e.f173129d = C53895h.m60466d(C60784e.f173127b, (C66212f) null, (C53934p0) null, new C60782c(C60784e.f173129d, str, (C15601d<? super C60782c>) null), 3, (Object) null);
        }
        C60784e.f173128c.f156491r = System.currentTimeMillis() - this.f323986c;
        this.f323987d.onComplete(mJError);
    }
}
