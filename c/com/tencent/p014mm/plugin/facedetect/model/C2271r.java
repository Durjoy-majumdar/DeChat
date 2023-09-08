package com.tencent.p014mm.plugin.facedetect.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.internal.ConstValue;

/* renamed from: com.tencent.mm.plugin.facedetect.model.r */
public class C2271r {
    /* renamed from: a */
    public static int m2060a(int i) {
        if (i < 90000 && i != 0) {
            Log.m105924i("MicroMsg.FaceJSAPITranslateCenter", "hy: server error. not translate");
            return i;
        } else if (i > 90099) {
            Log.m105924i("MicroMsg.FaceJSAPITranslateCenter", "hy: already translated");
            return i;
        } else if (i == 0) {
            return 0;
        } else {
            if (i == 90013) {
                return 90102;
            }
            switch (i) {
                case 90001:
                    return 90109;
                case ConstValue.APP_SET_LOCAL_STG_SUFFIX /*90002*/:
                case 90003:
                case 90004:
                case 90005:
                case 90006:
                    return 90100;
                default:
                    switch (i) {
                        case 90008:
                        case 90009:
                        case 90010:
                            return 90101;
                        case 90011:
                            return 90102;
                        default:
                            switch (i) {
                                case 90015:
                                    return 90104;
                                case 90016:
                                    return 90106;
                                case 90017:
                                    return 90107;
                                default:
                                    switch (i) {
                                        case 90019:
                                        case 90020:
                                        case 90021:
                                            return 90103;
                                        case 90022:
                                            return 90105;
                                        case 90023:
                                            return 90108;
                                        case 90024:
                                        case 90025:
                                            return 90100;
                                        default:
                                            return 90199;
                                    }
                            }
                    }
            }
        }
    }
}
