package com.tencent.p014mm.plugin.sns.statistics;

import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.record.SnsFixedResolutionCameraKitPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C7335d;
import di3.C86312j;
import gs2.C98192a;
import gs2.C98198g;
import gy3.C87412m;
import nr2.C35014a;
import p599lr.C61381b;
import v70.C111386a;
import y70.C38971a;

/* renamed from: com.tencent.mm.plugin.sns.statistics.f */
public final class C94992f {

    /* renamed from: a */
    public static final C94992f f275600a = new C94992f();

    /* renamed from: a */
    public final RecordConfigProvider mo131399a(String str, String str2, VideoTransPara videoTransPara, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("getSnsRecordVideoConfigProvider", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        C87412m.m108594g(str, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
        C87412m.m108594g(str2, "thumbPath");
        C87412m.m108594g(videoTransPara, "videoParams");
        RecordConfigProvider f = RecordConfigProvider.m119436f(str, str2, videoTransPara, i, 2);
        f.f272905F = 2;
        C30420b bVar = C30420b.f82051a;
        f.f272933u = Boolean.valueOf(!bVar.mo57381e());
        f.f272912M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", i2);
        C7335d c = C86312j.m106911c(C61381b.class);
        C87412m.m108593f(c, "getService(com.tencent.m…atureService::class.java)");
        if (((C61381b) c).mo78537Cb(false)) {
            f.f272912M.putBoolean("key_save_composition_info", true);
        }
        f.f272912M.putBoolean("key_edit_enable_emoji_search", true);
        SnsMethodCalculate.markStartTimeMs("getSnsRecordVideoCompositionProvider", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        int f2 = bVar.mo57382f();
        Log.m105924i("MicroMsg.EditorVideoCompositionConfig", "getSnsRecordVideoCompositionProvider >> " + f2);
        if (f2 > 0) {
            if (f2 == 1) {
                f.mo129804a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout");
            } else if (f2 == 2) {
                f.mo129804a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveShieldCameraKitPluginLayout");
            }
            int c2 = bVar.mo57379c();
            Log.m105924i("MicroMsg.Camera.CameraKitConfig", "setCameraInstance >> " + c2);
            if (!C111386a.f333469a.mo163052a() && c2 != -1) {
                Log.m105924i("MicroMsg.Camera.CameraKitConfig", "setCameraInstance value:CAMERA_INSTANCE_1");
                C38971a.f104995c = 1;
            }
            C38971a.f104995c = c2;
            f.f272912M.putBoolean("key_record_keep_ratio", true);
            f.mo129804a(2, "com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout");
            f.mo129804a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveEditPhotoPluginLayout");
        } else {
            if (C35014a.f93965a.mo59824a()) {
                f.mo129804a(0, SnsFixedResolutionCameraKitPluginLayout.class.getName());
                C98198g gVar = C98198g.f287917a;
                SnsMethodCalculate.markStartTimeMs("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                SnsMethodCalculate.markStartTimeMs("calculateResolutionRadioConfig$default", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                C98192a a = gVar.mo137499a(-1);
                SnsMethodCalculate.markEndTimeMs("calculateResolutionRadioConfig$default", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                SnsMethodCalculate.markStartTimeMs("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                C98198g.f287918b = a;
                SnsMethodCalculate.markEndTimeMs("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                SnsMethodCalculate.markEndTimeMs("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            }
            if (bVar.mo57378b()) {
                f.mo129804a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
            }
        }
        SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoCompositionProvider", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoConfigProvider", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        return f;
    }
}
