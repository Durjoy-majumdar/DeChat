package p228rp;

import com.tencent.p014mm.plugin.downloader.model.C29853f;
import com.tencent.p014mm.plugin.downloader.model.C40916e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import ei3.C86522b;
import java.util.HashMap;
import p237sp.C36772r;
import zt3.C119157j;

@C86522b
/* renamed from: rp.g */
public class C36408g extends C86301e implements C36772r {
    public boolean ux0(long j) {
        HashMap<Long, Integer> hashMap = C29853f.f80895a;
        int nullAs = Util.nullAs(hashMap.get(Long.valueOf(j)), 0);
        Log.m105925i("MicroMsg.DownloadRetry", "gamelog.download, checkRetryFailTask ,retry downloadId =  %d, retryCount = %d", Long.valueOf(j), Integer.valueOf(nullAs));
        if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            return false;
        }
        if (!(System.currentTimeMillis() - j <= 259200000)) {
            return false;
        }
        if (!(!hashMap.containsKey(Long.valueOf(j)) || hashMap.get(Long.valueOf(j)).intValue() < 2)) {
            return false;
        }
        ((C119157j) C119157j.f356862d).mo183878i(new C40916e(j, nullAs), ((long) nullAs) * 60000);
        return true;
    }
}
