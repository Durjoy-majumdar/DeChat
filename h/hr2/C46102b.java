package hr2;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.OutputStream;
import ps2.C100891r;

/* renamed from: hr2.b */
public class C46102b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f124272d;

    /* renamed from: e */
    public final /* synthetic */ String f124273e;

    public C46102b(Bitmap bitmap, String str) {
        this.f124272d = bitmap;
        this.f124273e = str;
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [java.io.OutputStream, com.tencent.mm.vfs.f0$h] */
    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$2");
        Log.m105924i("CardImgCacheUtil", "doSaveShadowFile");
        Bitmap bitmap = this.f124272d;
        String str = this.f124273e;
        SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
        SnsMethodCalculate.markStartTimeMs("doSaveShadowFile", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
        if (TextUtils.isEmpty(str)) {
            Log.m105920e("CardImgCacheUtil", "doSaveShadowFile, imageUrl is empty");
            SnsMethodCalculate.markEndTimeMs("doSaveShadowFile", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
        } else if (bitmap == null || bitmap.isRecycled() || bitmap.getHeight() <= 0 || bitmap.getWidth() <= 0) {
            Log.m105920e("CardImgCacheUtil", "doSaveShadowFile, bitmap==null or size<=0");
            SnsMethodCalculate.markEndTimeMs("doSaveShadowFile", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
        } else {
            ? r102 = 0;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                SnsMethodCalculate.markStartTimeMs("getShadowCachePath", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
                String l = C100891r.m132217l("twist_card_shadow", str);
                SnsMethodCalculate.markEndTimeMs("getShadowCachePath", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
                Uri n = C116299g2.m163858n(l);
                String path = n.getPath();
                if (path != null) {
                    String k = C116299g2.m163855k(path, false, false);
                    if (!n.getPath().equals(k)) {
                        n = n.buildUpon().path(k).build();
                    }
                }
                OutputStream G = C86013q1.m106425G(n, C116281f0.C116289i.f348994a.mo177799l(n, r102), false);
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, G);
                G.flush();
                long currentTimeMillis2 = System.currentTimeMillis();
                Log.m105924i("CardImgCacheUtil", "doSaveShadowFile, timeCost=" + (currentTimeMillis2 - currentTimeMillis) + ", bmp.w=" + bitmap.getWidth() + ", h=" + bitmap.getHeight() + ", path=" + l);
                try {
                    G.close();
                } catch (Throwable th) {
                    Throwable th4 = th;
                    Log.m105920e("CardImgCacheUtil", "doSaveShadowFile, fout.close exp:" + th4.toString());
                }
                SnsMethodCalculate.markEndTimeMs("doSaveShadowFile", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
            } catch (Throwable th5) {
                Throwable th6 = th5;
                Log.m105920e("CardImgCacheUtil", "doSaveShadowFile, fout.close exp:" + th6.toString());
            }
        }
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$2");
        SnsMethodCalculate.markEndTimeMs("doSaveShadowFile", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
        SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.CardImgCacheUtil$2");
    }
}
