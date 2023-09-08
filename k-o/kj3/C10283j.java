package kj3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.Iterator;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C49504g22;

/* renamed from: kj3.j */
public class C10283j implements l0$$e {
    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        Log.m105925i("MicroMsg.AppBrandServiceHelper", "callback, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        C49504g22 g222 = (C49504g22) cVar.f127056b.f127083a;
        if (i == 0 && i2 == 0 && g222 != null && g222.f133806d != null) {
            StringBuilder sb = new StringBuilder();
            Iterator<String> it = g222.f133806d.iterator();
            while (it.hasNext()) {
                sb.append(it.next() + "|");
            }
            Log.m105919d("MicroMsg.AppBrandServiceHelper", "block_qr_prefix:%s, size:%d", sb.toString(), Integer.valueOf(g222.f133806d.size()));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.APPBRAND_BLOCK_QRCODE_PREFIX_STRING_SYNC, sb.toString());
        }
        return 0;
    }
}
