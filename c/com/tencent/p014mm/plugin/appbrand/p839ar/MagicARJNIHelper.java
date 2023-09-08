package com.tencent.p014mm.plugin.appbrand.p839ar;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import h81.C32735h;
import p447aw.C103918d;
import q00.C62571i;

/* renamed from: com.tencent.mm.plugin.appbrand.ar.MagicARJNIHelper */
public class MagicARJNIHelper {
    public static final String TAG = "MagicARJNIHelper";

    public static int getARImplType() {
        return ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_wa_ar_impl_type_android, 0);
    }

    public static String getBodyConfig_pbinPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_BODY_POSE");
    }

    public static String getBodyConfig_pose3dPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_BODY_POSE3D");
    }

    public static String getFaceConfig_alignModelBinPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_FACE_ALIGNMENT");
    }

    public static String getFaceConfig_detModelBinPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_FACE_DETECT");
    }

    public static String getFaceConfig_tdmmBinPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_FACE3D_XBIN");
    }

    public static String getFaceConfig_tdmmParamPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_FACE3D_PARAMS");
    }

    public static String getHandConfig_modelPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_HAND");
    }

    public static String getHandConfig_pose3dPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_HAND_POSE3D");
    }

    public static String getOCRConfig_detModelPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_OCR_DET");
    }

    public static String getOCRConfig_labelPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_OCR_REC_MAP");
    }

    public static String getOCRConfig_recModelPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_OCR_REC_MODEL");
    }

    public static String getOSDConfig_modelBackBonePath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_OSD_BACKBONE");
    }

    public static String getOSDConfig_modelHeadPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_OSD_HEAD");
    }

    public static String getOSDConfig_modelPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_OSD");
    }

    public static String getVIOConfigPath() {
        return ((C62571i) C86312j.m106911c(C62571i.class)).mo87567IR().mo11889a("MODEL_VIO_CONFIG");
    }

    public static boolean hasCameraPermission() {
        return ((C103918d) C86312j.m106911c(C103918d.class)).Gd0(MMApplicationContext.getContext(), "android.permission.CAMERA");
    }

    public static void reportIDKey(int i, int i2, int i3, boolean z) {
        C115669n.INSTANCE.idkeyStat((long) i, (long) i2, (long) i3, z);
    }

    public static void reportKV(int i, String str) {
        C115669n.INSTANCE.kvStat(i, str);
    }
}
