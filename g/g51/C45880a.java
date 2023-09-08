package g51;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;

/* renamed from: g51.a */
public class C45880a {
    /* renamed from: a */
    public static int m51162a(int i) {
        if (i == 2) {
            return 1002;
        }
        if (i != 4) {
            return i != 6 ? 0 : 1004;
        }
        return 1003;
    }

    /* renamed from: b */
    public static void m51163b(int i, int i2, int i3, int i4, String str, String str2, String str3) {
        Log.m105919d("MicroMsg.DownloadReporter", "kv16099, sceneId = %d, areaId = %d, positionId = %d, actionId = %d, appId = %s,noticeId = %s, extInfo = %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str, str2, str3);
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[8];
        objArr[0] = Integer.valueOf(NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? 0 : NetStatusUtil.is4G(MMApplicationContext.getContext()) ? 4 : NetStatusUtil.is3G(MMApplicationContext.getContext()) ? 3 : NetStatusUtil.is2G(MMApplicationContext.getContext()) ? 2 : 1);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = Integer.valueOf(i3);
        objArr[4] = Integer.valueOf(i4);
        objArr[5] = str;
        objArr[6] = str2;
        objArr[7] = str3;
        nVar.mo160131h(16099, objArr);
    }
}
