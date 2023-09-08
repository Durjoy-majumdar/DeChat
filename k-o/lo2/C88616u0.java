package lo2;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.ADXml;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import jq2.C99001u;
import kg3.C76577a;
import ps2.C100891r;
import sk2.C101643c;

/* renamed from: lo2.u0 */
public final class C88616u0 {
    /* renamed from: a */
    public static void m110482a(Context context, ADXml.C85461b bVar, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("jumpScanUI", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
        if (bVar == null) {
            Log.m105920e("ScanJumpHelper", "jumpScanUI, jumpInfo==null");
            SnsMethodCalculate.markEndTimeMs("jumpScanUI", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
            return;
        }
        Log.m105924i("ScanJumpHelper", "jumpScanUI, desc=" + bVar.f249072b + ", gestureId=" + bVar.f249075e + ", uxinfo=" + str);
        C99001u.m128923i(bVar, "");
        ScanGoodsRequest scanGoodsRequest = new ScanGoodsRequest();
        scanGoodsRequest.f248902j = 5;
        scanGoodsRequest.f248903n = 1;
        scanGoodsRequest.f248896d = true;
        scanGoodsRequest.f248897e = true;
        scanGoodsRequest.f248898f = true;
        scanGoodsRequest.f248899g = true;
        scanGoodsRequest.f248900h = true;
        scanGoodsRequest.f248910u = false;
        scanGoodsRequest.f248911v = true;
        scanGoodsRequest.f248909t = C76577a.m92151b(MMApplicationContext.getContext(), 514);
        scanGoodsRequest.f248908s = bVar.f249072b;
        scanGoodsRequest.f248905p = C100891r.m132216k(bVar.f249071a);
        scanGoodsRequest.f248907r = C100891r.m132216k(bVar.f249073c);
        scanGoodsRequest.f248906q = C100891r.m132216k(bVar.f249074d);
        if (scanGoodsRequest.f248901i == null) {
            scanGoodsRequest.f248901i = new Bundle();
        }
        scanGoodsRequest.f248901i.putString("key_sns_ad_ux_info", str);
        String valueOf = String.valueOf(bVar.f249075e);
        if (scanGoodsRequest.f248901i == null) {
            scanGoodsRequest.f248901i = new Bundle();
        }
        scanGoodsRequest.f248901i.putString("key_gesture_id", valueOf);
        ((C101643c) C86312j.m106911c(C101643c.class)).f60(context, scanGoodsRequest, i);
        if (i == 7) {
            C115669n.INSTANCE.mo175911u(1898, 8);
        } else {
            C115669n.INSTANCE.mo175911u(1898, 9);
        }
        SnsMethodCalculate.markEndTimeMs("jumpScanUI", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
    }
}
