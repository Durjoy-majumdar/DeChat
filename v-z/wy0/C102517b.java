package wy0;

import com.tencent.p014mm.modelimage.C92837k0;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.support.CancellationSignal;
import f40.C86709a0;
import gy3.C87412m;

/* renamed from: wy0.b */
public final class C102517b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f301865d;

    public C102517b(CancellationSignal cancellationSignal) {
        this.f301865d = cancellationSignal;
    }

    public final void run() {
        String str;
        boolean z;
        String str2;
        Cursor cursor;
        Cursor cursor2;
        String str3 = "MicroMsg.CalcWxNewService";
        try {
            Cursor rawQuery = C86709a0.m107535s().f251811i.mo125615f().rawQuery("SELECT bigImgPath,thumbImgPath,compressType FROM ImgInfo2 WHERE reserved1 IS NULL", (Object[]) null);
            C92839m Bx0 = C92837k0.Bx0();
            long j = 0;
            long j2 = 0;
            long j3 = 0;
            long j4 = 0;
            while (true) {
                z = true;
                if (!rawQuery.moveToNext()) {
                    str2 = str3;
                    cursor = rawQuery;
                    z = false;
                    break;
                }
                CancellationSignal cancellationSignal = this.f301865d;
                if (cancellationSignal != null && cancellationSignal.isCanceled()) {
                    str2 = str3;
                    cursor = rawQuery;
                    break;
                }
                String string = rawQuery.getString(0);
                String string2 = rawQuery.getString(1);
                int i = rawQuery.getInt(2);
                String TY = Bx0.mo127174TY(string, "", "", false);
                if (C86013q1.m106450k(TY)) {
                    C86001b0 n = C86013q1.m106453n(TY);
                    C87412m.m108591d(n);
                    str = str3;
                    cursor2 = rawQuery;
                    try {
                        long j5 = n.f250474d;
                        if (i == 0) {
                            j += j5;
                        } else {
                            j4 += j5;
                        }
                    } catch (Throwable th) {
                        th = th;
                        Log.m105920e(str, "compressC2C error t = " + th.getMessage());
                    }
                } else {
                    str = str3;
                    cursor2 = rawQuery;
                }
                String TY2 = Bx0.mo127174TY(string2, "", "", false);
                if (C86013q1.m106450k(TY2)) {
                    C86001b0 n2 = C86013q1.m106453n(TY2);
                    C87412m.m108591d(n2);
                    j2 += n2.f250474d;
                }
                String str4 = TY2 + "hd";
                if (C86013q1.m106450k(str4)) {
                    C86001b0 n3 = C86013q1.m106453n(str4);
                    C87412m.m108591d(n3);
                    j3 += n3.f250474d;
                }
                str3 = str;
                rawQuery = cursor2;
            }
            cursor.close();
            Log.m105924i(str2, "bigImgTotalSize = " + j + ", thumbTotalSize = " + j2 + ", hdThumbTotalSize = " + j3 + ", canceled = " + z);
            if (!z) {
                MultiProcessMMKV.getDefault().encode("image_report_bigImgTotalSize", j);
                MultiProcessMMKV.getDefault().encode("image_report_bigImgYuantuTotalSize", j4);
                MultiProcessMMKV.getDefault().encode("image_report_hdThumbTotalSize", j3);
                MultiProcessMMKV.getDefault().encode("image_report_thumbTotalSize", j2);
                long j6 = MultiProcessMMKV.getDefault().getLong("extreme_storage_wechat_total", -1);
                if (j6 > 0) {
                    float f = (float) j6;
                    float f2 = (float) 100;
                    MultiProcessMMKV.getDefault().encode("image_daily_bigImgTotalSizeRatio", (int) ((((float) j) / f) * f2));
                    MultiProcessMMKV.getDefault().encode("image_daily_bigImgYuantuTotalSizeRatio", (int) ((((float) j4) / f) * f2));
                    MultiProcessMMKV.getDefault().encode("image_daily_hdThumbTotalSizeRatio", (int) ((((float) j3) / f) * f2));
                    MultiProcessMMKV.getDefault().encode("image_daily_thumbTotalSizeRatio", (int) ((((float) j2) / f) * f2));
                }
                MultiProcessMMKV.getDefault().encode("LastCompressC2CImageTime", System.currentTimeMillis());
            }
        } catch (Throwable th4) {
            th = th4;
            str = str3;
            Log.m105920e(str, "compressC2C error t = " + th.getMessage());
        }
    }
}
