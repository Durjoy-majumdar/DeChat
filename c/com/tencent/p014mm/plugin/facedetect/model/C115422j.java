package com.tencent.p014mm.plugin.facedetect.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.facedetect.FaceProNative;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.facedetect.model.j */
public class C115422j {

    /* renamed from: a */
    public FaceProNative f345972a = null;

    /* renamed from: a */
    public int mo175307a() {
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.f345972a == null);
        Log.m105927v("MicroMsg.FaceDetectNativeManager", "alvinluo cutDown sFaceProNative == null: %b", objArr);
        FaceProNative faceProNative = this.f345972a;
        if (faceProNative == null) {
            Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: reelase not init");
            return -101;
        }
        int engineRelease = faceProNative.engineRelease();
        Log.m105925i("MicroMsg.FaceDetectNativeManager", "hy: cut down result: %d", Integer.valueOf(engineRelease));
        this.f345972a = null;
        return engineRelease;
    }

    /* renamed from: b */
    public FaceCharacteristicsResult mo175308b(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = i4;
        Log.m105927v("MicroMsg.FaceDetectNativeManager", "alvinluo process parameter: width: %d, height: %d, depth: %d, imageType: %d, rotateAngle: %d, imgData length: %d", Integer.valueOf(i), Integer.valueOf(i2), 3, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(bArr.length));
        FaceCharacteristicsResult faceCharacteristicsResult = new FaceCharacteristicsResult();
        if (this.f345972a == null) {
            Log.m105920e("MicroMsg.FaceDetectNativeManager", "hy: process not init");
            String string = MMApplicationContext.getContext().getString(C0966R.string.jl6);
            faceCharacteristicsResult.f345935e = 4;
            faceCharacteristicsResult.f345936f = string;
        } else {
            if (i6 == 0) {
                i5 = 0;
            } else if (i6 == 90) {
                i5 = 4;
            } else if (i6 != 270) {
                Log.m105928w("MicroMsg.FaceDetectNativeManager", "hy: rotate type not support!");
                String string2 = MMApplicationContext.getContext().getString(C0966R.string.f361402jl3);
                faceCharacteristicsResult.f345935e = 1;
                faceCharacteristicsResult.f345936f = string2;
            } else {
                i5 = 5;
            }
            long currentTicks = Util.currentTicks();
            String str = "MicroMsg.FaceDetectNativeManager";
            FaceProNative.FaceStatus engineFaceProcess = this.f345972a.engineFaceProcess(bArr, i, i2, 3, i3, i5);
            long ticksToNow = Util.ticksToNow(currentTicks);
            if (engineFaceProcess != null) {
                FaceDetectReporter a = FaceDetectReporter.m162242a();
                int i7 = engineFaceProcess.result;
                FaceDetectReportInfo faceDetectReportInfo = a.f345962f;
                if (faceDetectReportInfo != null) {
                    faceDetectReportInfo.f345955w++;
                    faceDetectReportInfo.f345957y = (int) (((long) faceDetectReportInfo.f345957y) + ticksToNow);
                    if (i7 > 0) {
                        if (i7 == 1) {
                            faceDetectReportInfo.f345941f++;
                        } else if (i7 == 2) {
                            faceDetectReportInfo.f345942g++;
                        } else {
                            faceDetectReportInfo.f345941f++;
                        }
                    } else if (i7 == 0) {
                        faceDetectReportInfo.f345943h++;
                    } else if (i7 == -11) {
                        faceDetectReportInfo.f345945j++;
                    } else if (i7 == -12) {
                        faceDetectReportInfo.f345946n++;
                    } else if (i7 == -13) {
                        faceDetectReportInfo.f345947o++;
                    } else if (i7 == -101) {
                        faceDetectReportInfo.f345951s++;
                    } else if (i7 == -102) {
                        faceDetectReportInfo.f345948p++;
                    } else if (i7 == -103) {
                        faceDetectReportInfo.f345949q++;
                    } else if (i7 == -105) {
                        faceDetectReportInfo.f345950r++;
                    } else if (i7 == -106) {
                        faceDetectReportInfo.f345944i++;
                    } else if (i7 == -107) {
                        faceDetectReportInfo.f345952t++;
                    } else if (i7 == -108) {
                        faceDetectReportInfo.f345953u++;
                    } else if (i7 == -109) {
                        faceDetectReportInfo.f345954v++;
                    } else {
                        faceDetectReportInfo.f345940e++;
                    }
                }
            }
            Log.m105919d(str, "hy: process using: %d ms. result: %d", Long.valueOf(ticksToNow), Integer.valueOf(engineFaceProcess.result));
            faceCharacteristicsResult.f345934d = engineFaceProcess;
            int i8 = engineFaceProcess.result;
            if (i8 > 0) {
                if (i8 == 1) {
                    String string3 = MMApplicationContext.getContext().getString(C0966R.string.jl4);
                    faceCharacteristicsResult.f345935e = 0;
                    faceCharacteristicsResult.f345936f = string3;
                } else if (i8 == 2) {
                    String string4 = MMApplicationContext.getContext().getString(C0966R.string.jl4);
                    faceCharacteristicsResult.f345935e = -1;
                    faceCharacteristicsResult.f345936f = string4;
                } else {
                    Log.m105920e("MicroMsg.FaceCharacteristicsResult", "hy: unknown face num. regard as ok");
                    String string5 = MMApplicationContext.getContext().getString(C0966R.string.jl4);
                    faceCharacteristicsResult.f345935e = 0;
                    faceCharacteristicsResult.f345936f = string5;
                }
            } else if (i8 == 0) {
                String string6 = MMApplicationContext.getContext().getString(C0966R.string.jky);
                faceCharacteristicsResult.f345935e = 10;
                faceCharacteristicsResult.f345936f = string6;
            } else if (i8 == -1 || i8 == -2) {
                String string7 = MMApplicationContext.getContext().getString(C0966R.string.jl6);
                faceCharacteristicsResult.f345935e = 1;
                faceCharacteristicsResult.f345936f = string7;
            } else if (i8 == -11) {
                String string8 = MMApplicationContext.getContext().getString(C0966R.string.jl7);
                faceCharacteristicsResult.f345935e = 13;
                faceCharacteristicsResult.f345936f = string8;
            } else if (i8 == -12) {
                String string9 = MMApplicationContext.getContext().getString(C0966R.string.jl8);
                faceCharacteristicsResult.f345935e = 15;
                faceCharacteristicsResult.f345936f = string9;
            } else if (i8 == -13) {
                String string10 = MMApplicationContext.getContext().getString(C0966R.string.jkv);
                faceCharacteristicsResult.f345935e = 14;
                faceCharacteristicsResult.f345936f = string10;
            } else if (i8 == -101) {
                String string11 = MMApplicationContext.getContext().getString(C0966R.string.jkw);
                faceCharacteristicsResult.f345935e = 102;
                faceCharacteristicsResult.f345936f = string11;
            } else if (i8 == -102) {
                String string12 = MMApplicationContext.getContext().getString(C0966R.string.jkx);
                faceCharacteristicsResult.f345935e = 16;
                faceCharacteristicsResult.f345936f = string12;
            } else if (i8 == -103) {
                String string13 = MMApplicationContext.getContext().getString(C0966R.string.f361400jl0);
                faceCharacteristicsResult.f345935e = 17;
                faceCharacteristicsResult.f345936f = string13;
            } else if (i8 == -105) {
                String string14 = MMApplicationContext.getContext().getString(C0966R.string.jkz);
                faceCharacteristicsResult.f345935e = 18;
                faceCharacteristicsResult.f345936f = string14;
            } else if (i8 == -106) {
                String string15 = MMApplicationContext.getContext().getString(C0966R.string.f361401jl1);
                faceCharacteristicsResult.f345935e = 11;
                faceCharacteristicsResult.f345936f = string15;
            } else if (i8 == -107) {
                String string16 = MMApplicationContext.getContext().getString(C0966R.string.jl5);
                faceCharacteristicsResult.f345935e = 3;
                faceCharacteristicsResult.f345936f = string16;
            } else if (i8 == -108) {
                String string17 = MMApplicationContext.getContext().getString(C0966R.string.jkz);
                faceCharacteristicsResult.f345935e = 6;
                faceCharacteristicsResult.f345936f = string17;
            } else if (i8 == -109) {
                String string18 = MMApplicationContext.getContext().getString(C0966R.string.jkz);
                faceCharacteristicsResult.f345935e = 5;
                faceCharacteristicsResult.f345936f = string18;
            } else {
                Log.m105921e("MicroMsg.FaceCharacteristicsResult", "hy: not defined system error! %d", Integer.valueOf(i8));
                String string19 = MMApplicationContext.getContext().getString(C0966R.string.jl6);
                faceCharacteristicsResult.f345935e = 1;
                faceCharacteristicsResult.f345936f = string19;
            }
            Log.m105919d(str, "hy: detect result is: %s", faceCharacteristicsResult.toString());
        }
        return faceCharacteristicsResult;
    }
}
