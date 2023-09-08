package wy0;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wcdb.Cursor;
import com.tencent.wcdb.support.CancellationSignal;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import hd0.C98410o0;
import java.util.ArrayList;
import p682rz.C101488s;
import p682rz.C101489t;
import z04.C112551y;

/* renamed from: wy0.c */
public final class C102518c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CancellationSignal f301866d;

    public C102518c(CancellationSignal cancellationSignal) {
        this.f301866d = cancellationSignal;
    }

    public final void run() {
        boolean z;
        CancellationSignal cancellationSignal;
        String str;
        String str2;
        long j;
        String str3 = FirebaseAnalytics.C113379b.ORIGIN;
        try {
            Cursor rawQuery = C86709a0.m107535s().f251811i.mo125615f().rawQuery("SELECT filename FROM videoinfo2", (Object[]) null);
            ArrayList<String> arrayList = new ArrayList<>();
            boolean z2 = false;
            while (rawQuery.moveToNext()) {
                CancellationSignal cancellationSignal2 = this.f301866d;
                if (cancellationSignal2 != null && cancellationSignal2.isCanceled()) {
                    z2 = true;
                }
                arrayList.add(rawQuery.getString(0));
            }
            rawQuery.close();
            if (!z2) {
                C101489t Kj0 = ((C101488s) C86312j.m106911c(C101488s.class)).Kj0();
                CancellationSignal cancellationSignal3 = this.f301866d;
                long j2 = 0;
                long j3 = 0;
                long j4 = 0;
                long j5 = 0;
                for (String str4 : arrayList) {
                    if (cancellationSignal3 != null && cancellationSignal3.isCanceled()) {
                        z2 = true;
                    }
                    C98410o0 o0Var = (C98410o0) Kj0;
                    String q = o0Var.mo137728q(str4);
                    String r = o0Var.mo137729r(str4);
                    if (C86013q1.m106450k(r)) {
                        C86001b0 n = C86013q1.m106453n(r);
                        C87412m.m108591d(n);
                        j3 += n.f250474d;
                    }
                    if (!C112551y.m153808h(str4, str3, false, 2, (Object) null)) {
                        z = z2;
                        if (!arrayList.contains(str4 + str3)) {
                            str2 = str3;
                            j = j4;
                            if (C86013q1.m106450k(q)) {
                                C86001b0 n2 = C86013q1.m106453n(q);
                                C87412m.m108591d(n2);
                                cancellationSignal = cancellationSignal3;
                                str = str2;
                                j5 += n2.f250474d;
                                j4 = j;
                                str3 = str;
                                cancellationSignal3 = cancellationSignal;
                                z2 = z;
                            }
                        } else if (C86013q1.m106450k(q)) {
                            C86001b0 n3 = C86013q1.m106453n(q);
                            C87412m.m108591d(n3);
                            String str5 = str3;
                            j4 += n3.f250474d;
                            cancellationSignal = cancellationSignal3;
                            str = str5;
                            str3 = str;
                            cancellationSignal3 = cancellationSignal;
                            z2 = z;
                        } else {
                            str2 = str3;
                            j = j4;
                        }
                        cancellationSignal = cancellationSignal3;
                        str = str2;
                    } else if (C86013q1.m106450k(q)) {
                        C86001b0 n4 = C86013q1.m106453n(q);
                        C87412m.m108591d(n4);
                        z = z2;
                        j2 += n4.f250474d;
                        str = str3;
                        cancellationSignal = cancellationSignal3;
                        str3 = str;
                        cancellationSignal3 = cancellationSignal;
                        z2 = z;
                    } else {
                        z = z2;
                        str = str3;
                        cancellationSignal = cancellationSignal3;
                        j = j4;
                    }
                    j4 = j;
                    j5 = j5;
                    str3 = str;
                    cancellationSignal3 = cancellationSignal;
                    z2 = z;
                }
                long j6 = j4;
                long j7 = j5;
                arrayList.clear();
                Log.m105924i("MicroMsg.CalcWxNewService", "imageSize = " + j3 + ", yuantuVideoSize = " + j2 + ", yuantuCompressVideoSize = " + j6 + ", compressVideoSize = " + j7 + ", cancled = " + z2);
                if (!z2) {
                    MultiProcessMMKV.getDefault().encode("video_report_imageSize", j3);
                    MultiProcessMMKV.getDefault().encode("video_report_yuantuVideoSize", j2);
                    MultiProcessMMKV.getDefault().encode("video_report_yuantuCompressVideoSize", j6);
                    MultiProcessMMKV.getDefault().encode("video_report_compressVideoSize", j7);
                    long j8 = MultiProcessMMKV.getDefault().getLong("extreme_storage_wechat_total", -1);
                    if (j8 > 0) {
                        float f = (float) j8;
                        float f2 = (float) 100;
                        MultiProcessMMKV.getDefault().encode("video_report_imageSizeRatio", (int) ((((float) j3) / f) * f2));
                        MultiProcessMMKV.getDefault().encode("video_report_yuantuVideoSizeRatio", (int) ((((float) j2) / f) * f2));
                        MultiProcessMMKV.getDefault().encode("video_report_yuantuCompressVideoSizeRatio", (int) ((((float) j6) / f) * f2));
                        MultiProcessMMKV.getDefault().encode("video_report_compressVideoSizeRatio", (int) ((((float) j7) / f) * f2));
                    }
                    MultiProcessMMKV.getDefault().encode("LastCompressC2CVideoTime", System.currentTimeMillis());
                }
            }
        } catch (Throwable th) {
            Log.m105920e("MicroMsg.CalcWxNewService", "compressC2C error t = " + th.getMessage());
        }
    }
}
