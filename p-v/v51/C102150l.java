package v51;

import android.graphics.BitmapFactory;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.plugin.gif.MMWXGFJNI;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ImgUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import h81.C32735h;
import lc3.C10485b;
import p663qo.C101211h;
import z51.C102975i;

@C86522b
/* renamed from: v51.l */
public class C102150l extends C86301e implements C102975i {
    /* renamed from: GF */
    public int mo141694GF(String str, String str2) {
        long currentTicks = Util.currentTicks();
        int errorCode = MMWXGFJNI.getErrorCode();
        String str3 = str;
        if (errorCode == 0) {
            errorCode = MMWXGFJNI.wxam2Pic(C86013q1.m106448i(str3, false), C86013q1.m106448i(str2, true));
            if (C86013q1.m106451l(str2) <= 0) {
                errorCode = -10;
            }
            if (errorCode != 0) {
                C115669n.INSTANCE.mo175911u(944, 1);
            } else {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(944, 5);
                nVar.mo175913w(944, 6, Util.ticksToNow(currentTicks));
            }
        } else {
            String str4 = str2;
        }
        Log.m105925i("MicroMsg.HevcHelperService", "wxam2pic %d, %d, %d, %d", Integer.valueOf(errorCode), Long.valueOf(C86013q1.m106451l(str)), Long.valueOf(C86013q1.m106451l(str2)), Long.valueOf(Util.ticksToNow(currentTicks)));
        return errorCode;
    }

    /* renamed from: Gj */
    public byte[] mo141695Gj(byte[] bArr) {
        byte[] bArr2;
        long currentTicks = Util.currentTicks();
        int errorCode = MMWXGFJNI.getErrorCode();
        if (errorCode == 0) {
            bArr2 = MMWXGFJNI.nativeWxam2PicBuf(bArr);
            if (bArr2 == null) {
                C115669n.INSTANCE.mo175911u(944, 1);
            } else {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(944, 5);
                nVar.mo175913w(944, 6, Util.ticksToNow(currentTicks));
            }
        } else {
            bArr2 = null;
        }
        Object[] objArr = new Object[4];
        int i = 0;
        objArr[0] = Integer.valueOf(errorCode);
        objArr[1] = Integer.valueOf(bArr.length);
        if (bArr2 != null) {
            i = bArr2.length;
        }
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Long.valueOf(Util.ticksToNow(currentTicks));
        Log.m105925i("MicroMsg.HevcHelperService", "wxam2pic %d, %d, %d, %d", objArr);
        return bArr2;
    }

    public int Gq0(String str, String str2, int i, int i2) {
        int i3;
        int i4;
        long currentTicks = Util.currentTicks();
        String identifyImgType = ImgUtil.identifyImgType(str);
        int i5 = ".png".equals(identifyImgType) ? 1 : ".gif".equals(identifyImgType) ? 3 : 0;
        int errorCode = MMWXGFJNI.getErrorCode();
        String str3 = str;
        if (errorCode == 0) {
            String i6 = C86013q1.m106448i(str3, false);
            String i7 = C86013q1.m106448i(str2, true);
            if (i6 != null) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                MMBitmapFactory.m98735d(i6, options);
                int i8 = options.outWidth;
                long j = ((long) i8) * ((long) options.outHeight) * 4;
                if (j < 0 || j > DownloadHelper.SAVE_LENGTH) {
                    Log.m105921e("MicroMsg.HevcHelperService", "pic2wxam image is too large that may cause crash. w: %s, h: %s", Integer.valueOf(i8), Integer.valueOf(options.outHeight));
                    i4 = -11;
                } else {
                    i4 = MMWXGFJNI.pic2Wxam(i6, i7, i5, vx0(), i, i2);
                    if (C86013q1.m106451l(str2) <= 0) {
                        i4 = -10;
                    }
                }
                i3 = i4;
            } else {
                Log.m105920e("MicroMsg.HevcHelperService", "pic2wxam image src path is null.");
                i3 = -1;
            }
            if (i3 != 0) {
                C115669n.INSTANCE.mo175911u(944, 0);
            } else {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(944, 2);
                nVar.mo175913w(944, 3, Util.ticksToNow(currentTicks));
            }
            errorCode = i3;
        }
        Log.m105925i("MicroMsg.HevcHelperService", "pic2wxam %d, %d, %d, %d, %d", Integer.valueOf(errorCode), Integer.valueOf(i5), Long.valueOf(C86013q1.m106451l(str)), Long.valueOf(C86013q1.m106451l(str2)), Long.valueOf(Util.ticksToNow(currentTicks)));
        return errorCode;
    }

    /* renamed from: he */
    public boolean mo141697he() {
        int errorCode = MMWXGFJNI.getErrorCode();
        Log.m105925i("MicroMsg.HevcHelperService", "checkHevcReady: %s", Integer.valueOf(errorCode));
        return errorCode == 0;
    }

    public boolean hq0() {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.mmc2c_image_upload_hevc_and, false);
        boolean It = ((C101211h) C86312j.m106911c(C101211h.class)).mo140276It();
        Log.m105925i("MicroMsg.HevcHelperService", "hevc upload %s, support %s", Boolean.valueOf(wf), Boolean.valueOf(It));
        return mo141697he() && wf && It;
    }

    /* renamed from: lT */
    public int mo141699lT(String str, String str2) {
        return Gq0(str, str2, 0, 0);
    }

    public boolean ln0() {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.mmc2c_image_download_hevc_and, true);
        boolean It = ((C101211h) C86312j.m106911c(C101211h.class)).mo140276It();
        Log.m105925i("MicroMsg.HevcHelperService", "hevc download %s, support %s", Boolean.valueOf(wf), Boolean.valueOf(It));
        return mo141697he() && wf && It;
    }

    public final int vx0() {
        Class cls = C10485b.class;
        int i = 60;
        try {
            i = NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("CompressPicLevelForWifi"), 60) : NetStatusUtil.is2G(MMApplicationContext.getContext()) ? Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("CompressPicLevelFor2G"), 40) : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("CompressPicLevelFor3G"), 40) : Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("CompressPicLevelFor4G"), 60);
        } catch (Exception unused) {
        }
        return Math.round(39.0f - (((float) i) / 5.0f));
    }

    /* renamed from: wt */
    public String mo141702wt(String str) {
        if (Util.isNullOrNil(str)) {
            return str;
        }
        return str + "_hevc";
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3 */
    public int wx0(byte[] bArr, String str, String str2, int i, int i2, int i3, int i4, int i5) {
        ? r4;
        int i6;
        String str3 = str2;
        long currentTicks = Util.currentTicks();
        int i7 = ".gif".equals(ImgUtil.identifyImgType(str)) ? 3 : 7;
        int errorCode = MMWXGFJNI.getErrorCode();
        if (errorCode == 0) {
            String i8 = C86013q1.m106448i(str3, true);
            int length = bArr.length;
            if (i5 == 0) {
                i6 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_sns_wxam_params, 25);
                if (i6 < 0) {
                    i6 = vx0();
                }
            } else {
                i6 = vx0();
            }
            r4 = 1;
            errorCode = MMWXGFJNI.pic2WxamWithWH(i8, bArr, length, i7, i6, i, i2, i3, i4);
            if (C86013q1.m106451l(str2) <= 0) {
                errorCode = -10;
            }
            if (errorCode != 0) {
                C115669n.INSTANCE.mo175911u(944, 0);
            } else {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo175911u(944, 2);
                nVar.mo175913w(944, 3, Util.ticksToNow(currentTicks));
            }
        } else {
            r4 = 1;
        }
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(errorCode);
        objArr[r4] = Integer.valueOf(i7);
        objArr[2] = Long.valueOf(C86013q1.m106451l(str2));
        objArr[3] = Long.valueOf(Util.ticksToNow(currentTicks));
        objArr[4] = C86013q1.m106448i(str3, r4);
        Log.m105925i("MicroMsg.HevcHelperService", "pic2wxam %d, %d, %d, %d，%s", objArr);
        return errorCode;
    }
}
