package na0;

import bp3.C104160f;
import com.tencent.maas.instamovie.MJExportSettings;
import com.tencent.maas.instamovie.mediafoundation.AudioCodecId;
import com.tencent.maas.instamovie.mediafoundation.DimensionLevel;
import com.tencent.maas.instamovie.mediafoundation.FrameRate;
import com.tencent.maas.instamovie.mediafoundation.MediaContainerType;
import com.tencent.maas.instamovie.mediafoundation.VideoCodecId;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.api.TPOptionalID;
import di3.C86312j;
import h81.C32735h;
import kj2.C117407d;
import la0.C61242a;
import p663qo.C101211h;
import xb0.C102609h;
import xb0.C102610j;

/* renamed from: na0.b */
public final class C100107b implements C61242a.C61244a {

    /* renamed from: a */
    public static final C100107b f293258a = new C100107b();

    /* renamed from: a */
    public MJExportSettings mo86233a() {
        VideoTransPara videoTransPara;
        String str;
        String str2;
        boolean z;
        Class cls = C32735h.class;
        boolean z2 = ((C32735h) C86312j.m106911c(cls)).dl0(C32735h.C32737c.clicfg_sns_maas_export_h265, C104160f.RepairerConfig_Maas_SnsH265Export_Int, -1) == 1 && ((C101211h) C86312j.m106911c(C101211h.class)).mo140276It();
        int dl02 = ((C32735h) C86312j.m106911c(cls)).dl0(C32735h.C32737c.clicfg_sns_maas_export_codec_type, C104160f.RepairerConfig_Maas_SnsH265ExportCodecType_Int, 3);
        if (z2) {
            C102609h Fx0 = C102609h.Fx0();
            Fx0.getClass();
            Log.m105924i("MicroMsg.SubCoreVideoControl", "getSnsTemplateH265VideoPara");
            boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_sns_video_control_immediate_effect, true);
            long currentTicks = Util.currentTicks();
            if (Fx0.f302147j == null || wf) {
                Fx0.f302147j = Fx0.Jx0("SnsVideoTemplateVideoH265Config");
            }
            videoTransPara = null;
            if (Fx0.f302147j != null) {
                int i = 0;
                while (true) {
                    C102610j[] jVarArr = Fx0.f302147j;
                    if (i >= jVarArr.length) {
                        break;
                    }
                    C102610j jVar = jVarArr[i];
                    if (jVar != null && jVar.mo142245c()) {
                        Log.m105924i("MicroMsg.SubCoreVideoControl", "it busy time, try to get sns Record config.");
                        videoTransPara = jVar.mo142244b(0);
                        z = jVar.f302162f;
                        break;
                    }
                    i++;
                }
            }
            z = true;
            if (videoTransPara == null) {
                videoTransPara = Fx0.Cx0();
            }
            videoTransPara.f267174o = 44100;
            videoTransPara.f267172j = 10;
            videoTransPara.f267179t = 200;
            videoTransPara.f267170h = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_maas_export_max_duration, 60);
            Fx0.Dx0(videoTransPara, 2);
            if (!z) {
                C115669n.INSTANCE.idkeyStat(422, 31, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(422, 32, 1, false);
            }
            int nullAsNil = Util.nullAsNil((Integer) C117407d.m165559s(videoTransPara.f267169g / 1000, new int[]{TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE, 544, 800, 1200, 1600}, 33, 38));
            C115669n.INSTANCE.idkeyStat(422, (long) nullAsNil, 1, false);
            Log.m105925i("MicroMsg.SubCoreVideoControl", "get sns template para cost %d. %s rpt %d", Long.valueOf(Util.ticksToNow(currentTicks)), videoTransPara, Integer.valueOf(nullAsNil));
        } else {
            videoTransPara = C102609h.Fx0().Hx0();
        }
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_maas_export_video_fps, 30);
        int dl03 = ((C32735h) C86312j.m106911c(cls)).dl0(C32735h.C32737c.clicfg_sns_maas_export_video_bitrate, C104160f.RepairerConfig_Maas_SnsExportVideoBitrate_Int, 0);
        int i2 = (dl03 == 0 ? videoTransPara.f267169g : dl03) / Qe;
        int dl04 = ((C32735h) C86312j.m106911c(cls)).dl0(C32735h.C32737c.clicfg_sns_maas_export_dimension_level, C104160f.RepairerConfig_Maas_SnsExportVideoDimension_Int, 0);
        if (dl04 == 0) {
            dl04 = videoTransPara.f267166d;
        }
        DimensionLevel dimensionLevel = dl04 > 1080 ? DimensionLevel.DIMENSION_LEVEL_1440 : dl04 > 720 ? DimensionLevel.DIMENSION_LEVEL_1080 : dl04 > 540 ? DimensionLevel.DIMENSION_LEVEL_720 : DimensionLevel.DIMENSION_LEVEL_540;
        Log.m105924i("MicroMsg.SnsTemplate.SnsMaasMovieSessionConfigProviderImpl", "provideExportSettings: h265: " + z2 + " h265CodecType: " + dl02 + " fps: " + Qe + ", iframeInterval: " + (videoTransPara.f267172j * Qe) + ", videoBitrate: " + i2 + ", xVideoBitrate:" + dl03 + ", configBitrate:" + videoTransPara.f267169g + ", audioBitrate: " + videoTransPara.f267173n + ", dimension: " + dl04);
        FrameRate frameRate = Qe == 60 ? FrameRate.FrameRate60 : FrameRate.FrameRate30;
        int i3 = videoTransPara.f267173n;
        VideoCodecId videoCodecId = z2 ? VideoCodecId.HEVC : VideoCodecId.H264;
        AudioCodecId audioCodecId = AudioCodecId.MPEG4AAC;
        MediaContainerType mediaContainerType = MediaContainerType.MP4;
        int i4 = videoTransPara.f267172j * Qe;
        if (z2) {
            if (dl02 == 2) {
                str2 = MJExportSettings.VIDEO_ENCODER_AMC_HARDWARE;
            } else if (dl02 == 3) {
                str2 = MJExportSettings.VIDEO_ENCODER_VCODEC;
            }
            str = str2;
            return new MJExportSettings(frameRate, i2, i3, videoCodecId, audioCodecId, mediaContainerType, dimensionLevel, i4, str, "wxmmcabr00dr0010");
        }
        str = "";
        return new MJExportSettings(frameRate, i2, i3, videoCodecId, audioCodecId, mediaContainerType, dimensionLevel, i4, str, "wxmmcabr00dr0010");
    }
}
