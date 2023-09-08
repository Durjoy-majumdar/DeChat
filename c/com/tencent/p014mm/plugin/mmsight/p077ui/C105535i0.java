package com.tencent.p014mm.plugin.mmsight.p077ui;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wxmm.v2helper;
import f72.C97842b;
import i72.C108389l;
import j72.C98921l;
import java.io.ByteArrayOutputStream;
import lu3.C88656g;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.i0 */
public class C105535i0 {

    /* renamed from: a */
    public final /* synthetic */ int f313943a;

    /* renamed from: b */
    public final /* synthetic */ SightCaptureUI f313944b;

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.i0$a */
    public class C105536a implements C88656g {
        public C105536a() {
        }

        public String getKey() {
            return "SightCaptureUI_saveCaptureBitmap";
        }

        public void run() {
            Bitmap bitmap;
            SightCaptureUI sightCaptureUI = C105535i0.this.f313944b;
            if (Util.isNullOrNil(sightCaptureUI.f313835N) || sightCaptureUI.f313837Q <= 0 || sightCaptureUI.f313836P <= 0) {
                Log.m105920e("MicroMsg.SightCaptureUI", "saveCaptureYuvDataToBitmap error");
            } else {
                try {
                    YuvImage yuvImage = new YuvImage(sightCaptureUI.f313835N, 17, sightCaptureUI.f313836P, sightCaptureUI.f313837Q, (int[]) null);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    yuvImage.compressToJpeg(new Rect(0, 0, sightCaptureUI.f313836P, sightCaptureUI.f313837Q), 100, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    Bitmap a = MMBitmapFactory.m98732a(byteArray, 0, byteArray.length);
                    if (sightCaptureUI.f313875p0) {
                        int i = sightCaptureUI.f313841S;
                        if (i != 180) {
                            if (Math.abs(sightCaptureUI.f313839R - i) == 0) {
                                bitmap = BitmapUtil.rotate(a, 180.0f);
                                a.recycle();
                                a = bitmap;
                            }
                            String u = sightCaptureUI.f313871j.mo159627u();
                            BitmapUtil.saveBitmapToImage(a, 90, Bitmap.CompressFormat.JPEG, u, false);
                            Log.m105925i("MicroMsg.SightCaptureUI", "bitmap filelen %s", Long.valueOf(C86013q1.m106451l(u)));
                            C98921l.f289964d.mo138260o(sightCaptureUI.f313835N);
                            sightCaptureUI.f313837Q = 0;
                            sightCaptureUI.f313836P = 0;
                            sightCaptureUI.f313841S = 0;
                            sightCaptureUI.f313839R = 0;
                            sightCaptureUI.f313835N = null;
                        }
                    }
                    int i2 = sightCaptureUI.f313839R;
                    if (sightCaptureUI.f313841S == 180 && (i2 = i2 + 180) > 360) {
                        i2 -= 360;
                    }
                    bitmap = BitmapUtil.rotate(a, (float) i2);
                    a.recycle();
                    a = bitmap;
                    try {
                        String u2 = sightCaptureUI.f313871j.mo159627u();
                        BitmapUtil.saveBitmapToImage(a, 90, Bitmap.CompressFormat.JPEG, u2, false);
                        Log.m105925i("MicroMsg.SightCaptureUI", "bitmap filelen %s", Long.valueOf(C86013q1.m106451l(u2)));
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.SightCaptureUI", "error for saveBitmapToImage %s", e.getMessage());
                    }
                    C98921l.f289964d.mo138260o(sightCaptureUI.f313835N);
                    sightCaptureUI.f313837Q = 0;
                    sightCaptureUI.f313836P = 0;
                    sightCaptureUI.f313841S = 0;
                    sightCaptureUI.f313839R = 0;
                    sightCaptureUI.f313835N = null;
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.SightCaptureUI", e2, "saveCaptureYuvDataToBitmap error: %s", e2.getMessage());
                }
            }
            sightCaptureUI.f313838Q0 = false;
            SightCaptureUI sightCaptureUI2 = C105535i0.this.f313944b;
            sightCaptureUI2.getClass();
            ((C119157j) C119157j.f356862d).mo183895z(new C69850j0(sightCaptureUI2));
        }
    }

    /* renamed from: com.tencent.mm.plugin.mmsight.ui.i0$b */
    public class C105537b implements Runnable {
        public C105537b() {
        }

        public void run() {
            SightCaptureUI.m141709J7(C105535i0.this.f313944b);
        }
    }

    public C105535i0(SightCaptureUI sightCaptureUI, int i) {
        this.f313944b = sightCaptureUI;
        this.f313943a = i;
    }

    /* renamed from: a */
    public void mo150382a(byte[] bArr, int i, int i2, int i3, int i4) {
        byte[] bArr2 = bArr;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (bArr2 == null || i5 < 0 || i6 < 0 || i7 < 0) {
            Log.m105921e("MicroMsg.SightCaptureUI", "onPictureYuvTaken, data is null!! current state: %d", Integer.valueOf(this.f313944b.f313866g));
            SightCaptureUI sightCaptureUI = this.f313944b;
            sightCaptureUI.f313838Q0 = false;
            if (sightCaptureUI.f313866g == 7) {
                sightCaptureUI.mo150354W7(this.f313943a);
                return;
            }
            return;
        }
        Log.m105925i("MicroMsg.SightCaptureUI", "data frameWidth %s frameHeight %s rotate %s deviceDegree %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        SightCaptureUI.m141708I7(this.f313944b);
        this.f313944b.mo150345N7();
        SightCaptureUI sightCaptureUI2 = this.f313944b;
        sightCaptureUI2.f313836P = i5;
        sightCaptureUI2.f313837Q = i6;
        sightCaptureUI2.f313839R = i7;
        sightCaptureUI2.f313841S = i8;
        byte[] bArr3 = sightCaptureUI2.f313835N;
        if (bArr3 != null) {
            C98921l.f289964d.mo138260o(bArr3);
            this.f313944b.f313835N = null;
        }
        this.f313944b.f313835N = C98921l.f289964d.mo126905m(Integer.valueOf(bArr2.length));
        System.arraycopy(bArr2, 0, this.f313944b.f313835N, 0, bArr2.length);
        SightCaptureUI sightCaptureUI3 = this.f313944b;
        C119179t tVar = C119157j.f356862d;
        C105536a aVar = new C105536a();
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        sightCaptureUI3.f313842S0 = jVar.mo183878i(aVar, 0);
        C108389l.m146841b(true, C97842b.m126298o("TIME_RECODER_2_PLAY"));
        SightCaptureUI sightCaptureUI4 = this.f313944b;
        int i9 = 180;
        if (sightCaptureUI4.f313875p0) {
            if (Math.abs(i7 - i8) != 0) {
                i9 = 0;
            }
            bArr2 = C97842b.m126307x(bArr2, i5, i6, i9 % v2helper.VOIP_ENC_HEIGHT_LV1);
            this.f313944b.f313825D.mo160753a(bArr2, true, 0);
        } else {
            int i15 = i8 == 180 ? i7 + i8 : i7;
            if (i15 > 360) {
                i15 -= 360;
            }
            i9 = i15;
            sightCaptureUI4.f313825D.mo160753a(bArr2, false, i9);
        }
        SightCaptureUI sightCaptureUI5 = this.f313944b;
        sightCaptureUI5.f313843T = bArr2;
        sightCaptureUI5.f313845U = i9;
        sightCaptureUI5.mo150354W7(3);
        this.f313944b.f313874p.post(new C105537b());
        int i16 = this.f313944b.f313847V.f248458o;
        if (i16 == 1 || i16 == 2 || i16 == 7) {
            C115669n.INSTANCE.mo160131h(13819, 1, Integer.valueOf(this.f313944b.f313847V.f248458o), this.f313944b.f313847V.f248460q, Long.valueOf(Util.nowSecond()));
        }
    }
}
