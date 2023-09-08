package com.tencent.p014mm.plugin.base.stub;

import android.database.MatrixCursor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import lp3.C88631d;
import yo0.C91535b;

/* renamed from: com.tencent.mm.plugin.base.stub.k */
public class C85090k implements C88631d.C88632b<List<C91535b.C91536a>> {

    /* renamed from: a */
    public final /* synthetic */ MatrixCursor f247942a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f247943b;

    public C85090k(MatrixCursor matrixCursor, CountDownLatch countDownLatch) {
        this.f247942a = matrixCursor;
        this.f247943b = countDownLatch;
    }

    /* renamed from: a */
    public void mo1772a(Object obj) {
        List<C91535b.C91536a> list = (List) obj;
        if (list == null || list.isEmpty()) {
            Log.m105920e("MicroMsg.WXBizLogic", "prefetchPkgDownloadInfos is null ");
        } else {
            for (C91535b.C91536a aVar : list) {
                Log.m105925i("MicroMsg.WXBizLogic", "fetchPkgInfo addRow %s", aVar);
                try {
                    String encodeHexString = Util.encodeHexString(aVar.mo125441d());
                    this.f247942a.addRow(new Object[]{aVar.f262359i, aVar.f262358h, Long.valueOf(aVar.f262360j), encodeHexString});
                } catch (IOException e) {
                    Log.m105921e("MicroMsg.WXBizLogic", "fetchPkgInfo metaToByteArray e=%s", e);
                }
            }
        }
        this.f247943b.countDown();
    }
}
