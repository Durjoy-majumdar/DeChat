package y90;

import com.tencent.maas.instamovie.MJExportSettings;
import com.tencent.maas.instamovie.mediafoundation.AudioCodecId;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.maas.instamovie.mediafoundation.FrameRate;
import com.tencent.maas.instamovie.mediafoundation.MediaContainerType;
import com.tencent.maas.instamovie.mediafoundation.VideoCodecId;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import h81.C32735h;
import la0.C61242a;
import xb0.C102609h;

/* renamed from: y90.a */
public final class C102826a implements C61242a.C61244a {

    /* renamed from: a */
    public static final C102826a f303554a = new C102826a();

    /* renamed from: a */
    public MJExportSettings mo86233a() {
        Class cls = C32735h.class;
        VideoTransPara c6 = C102609h.Fx0().mo142238c6();
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_maas_export_video_fps, 30);
        int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_maas_export_video_bitrate, 0);
        int i = (Qe2 == 0 ? c6.f267169g : Qe2) / Qe;
        int Qe3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_maas_export_dimension_level, 0);
        if (Qe3 == 0) {
            Qe3 = c6.f267166d;
        }
        DimensionLevel dimensionLevel = Qe3 > 1080 ? DimensionLevel.DIMENSION_LEVEL_1440 : Qe3 > 720 ? DimensionLevel.DIMENSION_LEVEL_1080 : Qe3 > 540 ? DimensionLevel.DIMENSION_LEVEL_720 : DimensionLevel.DIMENSION_LEVEL_540;
        Log.m105924i("FinderMaasMovieSessionConfigProviderImpl", "provideExportSettings: fps: " + Qe + ", iframeInterval: " + (c6.f267172j * Qe) + ", videoBitrate: " + i + ", xVideoBitrate:" + Qe2 + ", configBitrate:" + c6.f267169g + ", audioBitrate: " + c6.f267173n + ", dimension: " + Qe3);
        return new MJExportSettings(Qe == 60 ? FrameRate.FrameRate60 : FrameRate.FrameRate30, i, c6.f267173n, VideoCodecId.H264, AudioCodecId.MPEG4AAC, MediaContainerType.MP4, dimensionLevel, c6.f267172j * Qe);
    }
}
