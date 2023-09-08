package wq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wq2.h */
public class C111836h {
    /* renamed from: a */
    public static void m152494a(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("d", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
        Log.m105918d("AlphaPlayer_" + str, String.valueOf(str2));
        SnsMethodCalculate.markEndTimeMs("d", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
    }

    /* renamed from: b */
    public static void m152495b(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
        Log.m105920e("AlphaPlayer_" + str, String.valueOf(str2));
        SnsMethodCalculate.markEndTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
    }

    /* renamed from: c */
    public static void m152496c(String str, String str2, Throwable th) {
        SnsMethodCalculate.markStartTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
        Log.m105921e("AlphaPlayer_" + str, String.valueOf(str2), th);
        SnsMethodCalculate.markEndTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
    }

    /* renamed from: d */
    public static void m152497d(String str, Throwable th) {
        SnsMethodCalculate.markStartTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
        Log.m105921e("AlphaPlayer_", String.valueOf(str), th);
        SnsMethodCalculate.markEndTimeMs("e", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
    }

    /* renamed from: e */
    public static void m152498e(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("i", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
        Log.m105924i("AlphaPlayer_" + str, String.valueOf(str2));
        SnsMethodCalculate.markEndTimeMs("i", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.MtLog");
    }
}
