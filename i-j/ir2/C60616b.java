package ir2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import org.json.JSONObject;
import os2.C62175s0;
import ps2.C100880k;
import ps2.C100891r;
import vr2.C102260r;

/* renamed from: ir2.b */
public class C60616b {

    /* renamed from: ir2.b$a */
    public class C60617a implements C100880k.C100881a {

        /* renamed from: a */
        public final /* synthetic */ ImageView f172713a;

        /* renamed from: b */
        public final /* synthetic */ int f172714b;

        /* renamed from: c */
        public final /* synthetic */ String f172715c;

        public C60617a(ImageView imageView, int i, String str) {
            this.f172713a = imageView;
            this.f172714b = i;
            this.f172715c = str;
        }

        /* renamed from: a */
        public void mo76113a() {
            SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
            this.f172713a.setTag(this.f172714b, "");
            Log.m105920e("HalfScreenSubscribeUtils", "onDownloadError, hash=" + this.f172713a.hashCode() + ", url=" + this.f172715c);
            SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
        }

        /* renamed from: b */
        public void mo76114b() {
            SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
            SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
        }

        /* renamed from: c */
        public void mo76115c(String str) {
            SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
            try {
                if (!Util.isNullOrNil(str)) {
                    Bitmap decodeFile = BitmapUtil.decodeFile(str, (BitmapFactory.Options) null);
                    if (decodeFile != null) {
                        this.f172713a.setImageBitmap(decodeFile);
                        this.f172713a.setTag(this.f172714b, this.f172715c);
                        Log.m105918d("HalfScreenSubscribeUtils", "onDownloaded succ, hash=" + this.f172713a.hashCode());
                    } else {
                        Log.m105920e("HalfScreenSubscribeUtils", "onDownloaded, bitmap==null");
                    }
                } else {
                    Log.m105918d("HalfScreenSubscribeUtils", "onDownloaded, url changed");
                }
            } catch (Throwable th) {
                Log.m105920e("HalfScreenSubscribeUtils", "onDownloaded, exp=" + th.toString());
            }
            SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils$1");
        }
    }

    /* renamed from: a */
    public static void m70876a(int i, String str, ImageView imageView) {
        SnsMethodCalculate.markStartTimeMs("loadImage", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
        if (TextUtils.isEmpty(str) || imageView == null) {
            SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
            return;
        }
        Log.m105918d("HalfScreenSubscribeUtils", "loadImage, hash=" + imageView.hashCode() + ", url=" + str);
        C100891r.m132206a(str, false, 41, 0, new C60617a(imageView, i, str));
        SnsMethodCalculate.markEndTimeMs("loadImage", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
    }

    /* renamed from: b */
    public static void m70877b(SnsInfo snsInfo, int i, C62175s0 s0Var) {
        SnsMethodCalculate.markStartTimeMs("subscribeReport", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
        if (snsInfo == null || s0Var == null) {
            Log.m105920e("HalfScreenSubscribeUtils", "reportSubscribe snsInfo==null or reportInfo==null, scene = " + i);
            SnsMethodCalculate.markEndTimeMs("subscribeReport", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            SnsMethodCalculate.markStartTimeMs("getTempId", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            String str = s0Var.f176774a;
            SnsMethodCalculate.markEndTimeMs("getTempId", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("tempId", str);
            SnsMethodCalculate.markStartTimeMs("getWeausername", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            String str2 = s0Var.f176775b;
            SnsMethodCalculate.markEndTimeMs("getWeausername", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("weausername", str2);
            SnsMethodCalculate.markStartTimeMs("getClickSubmitBtn", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            int i2 = s0Var.f176776c;
            SnsMethodCalculate.markEndTimeMs("getClickSubmitBtn", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("clickSubmitBtn", i2);
            SnsMethodCalculate.markStartTimeMs("getSubscribeResult", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            int i3 = s0Var.f176777d;
            SnsMethodCalculate.markEndTimeMs("getSubscribeResult", "com.tencent.mm.plugin.sns.storage.SubscribeReportInfo");
            jSONObject2.put("subscribeResult", i3);
            int i4 = i == 0 ? 1 : 2;
            String nullAsNil = Util.nullAsNil(snsInfo.getUxinfo());
            jSONObject.put("extInfo", jSONObject2);
            jSONObject.put("uxinfo", nullAsNil);
            jSONObject.put("snsid", snsInfo.field_snsId);
            jSONObject.put(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i4);
            String jSONObject3 = jSONObject.toString();
            C102260r.m134858a("timeline_subscription_message", jSONObject3);
            Log.m105924i("HalfScreenSubscribeUtils", "reportSubscribe timeline_subscription_message, content=" + jSONObject3);
        } catch (Exception e) {
            Log.m105920e("HalfScreenSubscribeUtils", "reportSubscribe exp:" + e.toString());
        }
        SnsMethodCalculate.markEndTimeMs("subscribeReport", "com.tencent.mm.plugin.sns.adutils.HalfScreenSubscribeUtils");
    }
}
