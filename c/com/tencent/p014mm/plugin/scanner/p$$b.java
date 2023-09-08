package com.tencent.p014mm.plugin.scanner;

import android.graphics.Bitmap;
import com.tencent.p014mm.autogen.events.ScanTranslationResultEvent;
import com.tencent.p014mm.plugin.scanner.model.C115671l1;
import com.tencent.p014mm.plugin.scanner.model.C30383k1;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import java.io.IOException;
import vl2.C118684u;

/* renamed from: com.tencent.mm.plugin.scanner.p$$b */
public class p$$b implements C118684u.C118686b {

    /* renamed from: d */
    public final /* synthetic */ C115674p f347041d;

    public p$$b(C115674p pVar) {
        this.f347041d = pVar;
    }

    /* renamed from: W6 */
    public void mo175938W6(int i, Bitmap bitmap) {
        Class cls = C115674p.class;
        Log.m105924i("MicroMsg.PluginScanTranslation", "drawTranslationResult() called with: sessionId = [" + i + "], newBitmap = [" + bitmap + "]");
        if (bitmap != null && this.f347041d.f347031n.containsKey(Integer.valueOf(i))) {
            if (this.f347041d.f347032o.containsKey(Integer.valueOf(i)) && this.f347041d.f347033p.containsKey(Integer.valueOf(i))) {
                this.f347041d.f347032o.get(Integer.valueOf(i)).f343793i = System.currentTimeMillis() - this.f347041d.f347033p.get(Integer.valueOf(i)).longValue();
                this.f347041d.f347032o.get(Integer.valueOf(i)).mo86054n();
                this.f347041d.f347032o.remove(Integer.valueOf(i));
                this.f347041d.f347033p.remove(Integer.valueOf(i));
                Log.m105925i("MicroMsg.PluginScanTranslation", "translationReports size %d, translationUpload size %d", Integer.valueOf(this.f347041d.f347032o.size()), Integer.valueOf(this.f347041d.f347033p.size()));
            }
            if (C86709a0.m107522a()) {
                String Ax0 = ((C115674p) C86312j.m106911c(cls)).Ax0("jpg");
                try {
                    BitmapUtil.saveBitmapToImage(bitmap, 80, Bitmap.CompressFormat.JPEG, Ax0, false);
                    C30383k1 k1Var = new C30383k1();
                    C115671l1 l1Var = this.f347041d.f347031n.get(Integer.valueOf(i));
                    k1Var.field_originMD5 = MD5Util.getMD5String(l1Var.f347007a + C86013q1.m106452m(l1Var.f347007a));
                    k1Var.field_resultFile = Ax0;
                    k1Var.field_fromLang = l1Var.f347009c;
                    k1Var.field_toLang = l1Var.f347010d;
                    k1Var.field_brand = l1Var.f347011e;
                    Log.m105925i("MicroMsg.PluginScanTranslation", "translate %d success, insert translate result %s", Integer.valueOf(i), Ax0);
                    ((C115674p) C86312j.m106911c(cls)).Cx0().mo60805Lo(k1Var);
                    ScanTranslationResultEvent scanTranslationResultEvent = new ScanTranslationResultEvent();
                    ScanTranslationResultEvent.C92560a aVar = scanTranslationResultEvent.f265089d;
                    aVar.f265090a = i;
                    aVar.f265092c = true;
                    aVar.f265093d = Ax0;
                    aVar.f265094e = l1Var.f347009c;
                    aVar.f265095f = l1Var.f347010d;
                    if (this.f347041d.f347032o.containsKey(Integer.valueOf(i))) {
                        scanTranslationResultEvent.f265089d.f265091b = (int) this.f347041d.f347032o.get(Integer.valueOf(i)).f343788d;
                    }
                    scanTranslationResultEvent.publish();
                    this.f347041d.f347031n.remove(Integer.valueOf(i));
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.PluginScanTranslation", e, "save translate result file error", new Object[0]);
                    this.f347041d.Dx0(i);
                }
            }
        }
    }
}
