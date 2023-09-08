package com.tencent.p014mm.plugin.sns.statistics;

import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.List;
import p156gj.C87203t;
import v70.C111386a;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.sns.statistics.b */
public final class C30420b {

    /* renamed from: a */
    public static final C30420b f82051a = new C30420b();

    /* renamed from: a */
    public final boolean mo57377a() {
        SnsMethodCalculate.markStartTimeMs("getSnsAlbumVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean z = false;
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Media_SnsAlbumUseVideoComposition_Int, 0);
        Log.m105924i("MicroMsg.EditorVideoCompositionConfig", "getSnsAlbumVideoCompositionSwitch: " + true + ", repairConfig: " + e);
        if (e != 0) {
            if (e == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("getSnsAlbumVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsAlbumVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return true;
    }

    /* renamed from: b */
    public final boolean mo57378b() {
        SnsMethodCalculate.markStartTimeMs("getSnsRecordVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean z = false;
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Media_SnsRecordUseVideoComposition_Int, 0);
        Log.m105924i("MicroMsg.EditorVideoCompositionConfig", "SnsRecordVideoCompositionSwitch: " + true + ", repairConfig: " + e);
        if (e != 0) {
            if (e == 1) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return true;
    }

    /* renamed from: c */
    public final int mo57379c() {
        SnsMethodCalculate.markStartTimeMs("improveUseCameraKitInstance", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Camera_CameraKitImproveInstance_Int, 0);
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) a).intValue();
        if (intValue == 0) {
            intValue = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_camera_improve_camera_instance, 3);
        }
        SnsMethodCalculate.markEndTimeMs("improveUseCameraKitInstance", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return intValue;
    }

    /* renamed from: d */
    public final boolean mo57380d() {
        SnsMethodCalculate.markStartTimeMs("isSnsAlbumBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean a = mo57377a();
        Log.m105924i("MicroMsg.EditorVideoCompositionConfig", "isSnsAlbumBackgroundRemux >> videoCompositionSwitch " + a);
        boolean z = false;
        if (a) {
            SnsMethodCalculate.markStartTimeMs("getSnsAlbumVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_album_video_remux_background, false);
            int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Media_SnsAlbumBackgroundRemux_Int, 0);
            Log.m105924i("MicroMsg.EditorVideoCompositionConfig", "getSnsAlbumVideoRemuxBackgroundSwitch: " + wf + ", repairConfig: " + e);
            if (e != 0) {
                if (e == 1) {
                    z = true;
                }
                SnsMethodCalculate.markEndTimeMs("getSnsAlbumVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
                wf = z;
            } else {
                SnsMethodCalculate.markEndTimeMs("getSnsAlbumVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            }
            Log.m105924i("MicroMsg.EditorVideoCompositionConfig", "isSnsAlbumBackgroundRemux >> backGroundSwitch " + wf);
            SnsMethodCalculate.markEndTimeMs("isSnsAlbumBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return wf;
        }
        SnsMethodCalculate.markEndTimeMs("isSnsAlbumBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return false;
    }

    /* renamed from: e */
    public final boolean mo57381e() {
        SnsMethodCalculate.markStartTimeMs("isSnsRecordBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean b = mo57378b();
        Log.m105924i("MicroMsg.EditorVideoCompositionConfig", "isSnsRecordBackgroundRemux >> videoCompositionSwitch " + b);
        boolean z = false;
        if (b) {
            SnsMethodCalculate.markStartTimeMs("getSnsRecordVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_sns_record_video_remux_background, false);
            int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Media_SnsRecordBackgroundRemux_Int, 0);
            Log.m105924i("MicroMsg.EditorVideoCompositionConfig", "getSnsAlbumVideoRemuxBackgroundSwitch: " + wf + ", repairConfig: " + e);
            if (e != 0) {
                if (e == 1) {
                    z = true;
                }
                SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
                wf = z;
            } else {
                SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            }
            Log.m105924i("MicroMsg.EditorVideoCompositionConfig", "isSnsRecordBackgroundRemux >> backGroundSwitch " + wf);
            SnsMethodCalculate.markEndTimeMs("isSnsRecordBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return wf;
        }
        SnsMethodCalculate.markEndTimeMs("isSnsRecordBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return false;
    }

    /* renamed from: f */
    public final int mo57382f() {
        Class cls = C32735h.class;
        SnsMethodCalculate.markStartTimeMs("useCameraKitImproveRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean z = false;
        if (C85875k4.m106157N() || C85875k4.m106210y()) {
            SnsMethodCalculate.markEndTimeMs("useCameraKitImproveRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return 0;
        }
        Object a = C79758p.f233760a.mo109878a(C104160f.RepairerConfig_Camera_CameraKitIsUseImproveILayout_Int, 0);
        C87412m.m108592e(a, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) a).intValue();
        boolean z2 = true;
        if (intValue == 0) {
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_camera_improve_entrance_11p, 0);
            if (Qe != 1 || C111386a.f333469a.mo163052a()) {
                if (Qe == 1) {
                    SnsMethodCalculate.markStartTimeMs("checkDeviceModelIsSupport", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
                    long currentTimeMillis = System.currentTimeMillis();
                    boolean z3 = C30422e.f82056b;
                    if (z3 && currentTimeMillis - C30422e.f82055a < 600000) {
                        Log.m105924i("MicroMsg.ImproveCameraDeviceUtil", "checkDeviceModelIsSupport >> use last support " + C30422e.f82056b);
                        z = C30422e.f82056b;
                        SnsMethodCalculate.markEndTimeMs("checkDeviceModelIsSupport", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
                    } else if (z3 || currentTimeMillis - C30422e.f82055a >= 86400000) {
                        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_camera_improve_shield_device, "");
                        if (!(Y60 == null || Y60.length() == 0)) {
                            z2 = false;
                        }
                        if (z2) {
                            SnsMethodCalculate.markEndTimeMs("checkDeviceModelIsSupport", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
                        } else {
                            C30422e.f82055a = currentTimeMillis;
                            C87412m.m108593f(Y60, TPReportKeys.Common.COMMON_DEVICE_NAME);
                            List U = C112550d0.m153785U(Y60, new String[]{";"}, false, 0, 6, (Object) null);
                            String k = C87203t.m108275k();
                            boolean contains = U.contains(k);
                            boolean z4 = !contains;
                            C30422e.f82056b = z4;
                            Log.m105924i("MicroMsg.ImproveCameraDeviceUtil", "checkDeviceModelIsSupport >> model: >> " + k + ", " + contains);
                            SnsMethodCalculate.markEndTimeMs("checkDeviceModelIsSupport", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
                            z = z4;
                        }
                    } else {
                        Log.m105924i("MicroMsg.ImproveCameraDeviceUtil", "checkDeviceModelIsSupport >> use last no support " + C30422e.f82056b);
                        z = C30422e.f82056b;
                        SnsMethodCalculate.markEndTimeMs("checkDeviceModelIsSupport", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
                    }
                    if (!z) {
                        SnsMethodCalculate.markEndTimeMs("useCameraKitImproveRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
                        return 2;
                    }
                }
                SnsMethodCalculate.markEndTimeMs("useCameraKitImproveRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
                return Qe;
            }
            SnsMethodCalculate.markEndTimeMs("useCameraKitImproveRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return 2;
        } else if (intValue == 1 || intValue == 2) {
            SnsMethodCalculate.markEndTimeMs("useCameraKitImproveRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return intValue;
        } else {
            SnsMethodCalculate.markEndTimeMs("useCameraKitImproveRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return 0;
        }
    }
}
