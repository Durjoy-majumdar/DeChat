package com.tencent.p014mm.plugin.appbrand.jsapi.websocket;

import android.util.Pair;
import com.tencent.mars.cdn.CronetMultiNetLinkWaysUtil;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import hr0.C87583a;
import hr0.C87584b;
import java.util.ArrayList;
import java.util.HashMap;
import p206nj.C88957l;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.WcWss */
public class WcWss {

    /* renamed from: a */
    public static HashMap<Pair<String, Integer>, C83093a> f242875a = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.WcWss$BindAndDnsReturn */
    public static class BindAndDnsReturn {
        public String hostIpStr;
        public int resultCode;
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.websocket.WcWss$a */
    public interface C83093a {
        /* renamed from: a */
        void mo115334a(String str, int i, boolean z, String[] strArr, String[] strArr2, int i2, String str2, String[] strArr3, String[] strArr4);

        /* renamed from: b */
        void mo115335b(String str, int i, int i2, String str2);

        /* renamed from: c */
        void mo115336c(String str, int i, byte[] bArr, boolean z);

        /* renamed from: d */
        void mo115337d(String str, int i, String[] strArr, String[] strArr2);

        /* renamed from: e */
        int mo115338e(String str, byte[][] bArr);
    }

    static {
        C88957l.m111079o("wcwss", WcWss.class.getClassLoader());
    }

    /* renamed from: a */
    public static int m101898a(C83093a aVar, String str, String str2, Object[] objArr, Object[] objArr2, Object[] objArr3, Object obj, Object[] objArr4) {
        int connectSocket = connectSocket(str, str2, objArr, objArr2, objArr3, obj, objArr4);
        if (connectSocket > 0) {
            Log.m105925i("MicroMsg.WcWss", "connect wss pair(%s, %d)", str, Integer.valueOf(connectSocket));
            Pair pair = new Pair(str, Integer.valueOf(connectSocket));
            if (f242875a.containsKey(pair)) {
                Log.m105921e("MicroMsg.WcWss", "already exists pair(%s, %d)", str, Integer.valueOf(connectSocket));
                return -1;
            }
            f242875a.put(pair, aVar);
        }
        return connectSocket;
    }

    public static BindAndDnsReturn bindSocketToCellularAndDnsByCellular(int i, String str) {
        CronetMultiNetLinkWaysUtil.BindAndDnsReturnKt bindSocketToCellularAndDnsByCellular = CronetMultiNetLinkWaysUtil.Companion.instance().bindSocketToCellularAndDnsByCellular(i, str, MMApplicationContext.getContext());
        BindAndDnsReturn bindAndDnsReturn = new BindAndDnsReturn();
        bindAndDnsReturn.hostIpStr = bindSocketToCellularAndDnsByCellular.getHostIpStr();
        bindAndDnsReturn.resultCode = bindSocketToCellularAndDnsByCellular.getResultCode();
        return bindAndDnsReturn;
    }

    public static native void closeSocket(String str, int i, int i2, String str2);

    private static native int connectSocket(String str, String str2, Object[] objArr, Object[] objArr2, Object[] objArr3, Object obj, Object[] objArr4);

    public static int doCertificateVerify(String str, int i, String str2, byte[][] bArr) {
        Log.m105925i("MicroMsg.WcWss", "doCertificateVerify group:%s,wssId:%s,hostname:%s", str, Integer.valueOf(i), str2);
        Pair pair = new Pair(str, Integer.valueOf(i));
        if (f242875a.containsKey(pair)) {
            return f242875a.get(pair).mo115338e(str2, bArr);
        }
        Log.m105920e("MicroMsg.WcWss", "onMessage callback is null");
        return -1;
    }

    public static int getNetworkType() {
        try {
            int netType = NetStatusUtil.getNetType(MMApplicationContext.getContext());
            if (netType == -1) {
                return -1;
            }
            if (NetStatusUtil.is2G(MMApplicationContext.getContext())) {
                return 3;
            }
            if (NetStatusUtil.is3G(MMApplicationContext.getContext())) {
                return 4;
            }
            if (NetStatusUtil.is4G(MMApplicationContext.getContext())) {
                return 5;
            }
            if (NetStatusUtil.isWifi(netType)) {
                return 1;
            }
            return NetStatusUtil.isWap(netType) ? 2 : 6;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WcWss", e, "getStatisticsNetType_", new Object[0]);
            return -1;
        }
    }

    public static native void init();

    public static void onClose(String str, int i, int i2, String str2) {
        Log.m105925i("MicroMsg.WcWss", "onClose group:%s,id:%s, reason:%s, code:%s", str, Integer.valueOf(i), str2, Integer.valueOf(i2));
        Pair pair = new Pair(str, Integer.valueOf(i));
        if (f242875a.containsKey(pair)) {
            f242875a.get(pair).mo115335b(str, i, i2, str2);
            f242875a.remove(pair);
            return;
        }
        Log.m105920e("MicroMsg.WcWss", "onClose callback is null");
    }

    public static void onHandShake(String str, int i, String[] strArr, String[] strArr2) {
        Log.m105925i("MicroMsg.WcWss", "onHandShake group:%s, wssId:%s", str, Integer.valueOf(i));
        Pair pair = new Pair(str, Integer.valueOf(i));
        if (f242875a.containsKey(pair)) {
            f242875a.get(pair).mo115337d(str, i, strArr, strArr2);
        } else {
            Log.m105920e("MicroMsg.WcWss", "onHandShake callback is null");
        }
    }

    public static void onIdKeyStat(int[] iArr, int[] iArr2, int[] iArr3) {
        Log.m105926v("MicroMsg.WcWss", "onIdKeyStat");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < iArr.length; i++) {
            arrayList.add(new IDKey(iArr[i], iArr2[i], iArr3[i]));
        }
        ((C87583a) C89909e.m112439d(C87583a.class, true)).mo121687a(arrayList, false);
    }

    public static void onKvStat(int i, String str) {
        Log.m105925i("MicroMsg.WcWss", "onKvStat logId:%s", Integer.valueOf(i));
        ((C87584b) C89909e.m112439d(C87584b.class, true)).kvStat(i, str);
    }

    public static void onMessage(String str, int i, byte[] bArr, boolean z) {
        Log.m105919d("MicroMsg.WcWss", "onMessage group:%s,wssId:%s,isText:%s", str, Integer.valueOf(i), Boolean.valueOf(z));
        Pair pair = new Pair(str, Integer.valueOf(i));
        if (f242875a.containsKey(pair)) {
            f242875a.get(pair).mo115336c(str, i, bArr, z);
        } else {
            Log.m105920e("MicroMsg.WcWss", "onMessage callback is null");
        }
    }

    public static void onOpen(String str, int i, boolean z, String[] strArr, String[] strArr2, int i2, String str2, String[] strArr3, String[] strArr4) {
        Log.m105925i("MicroMsg.WcWss", "onOpen group:%s,isSuc:%s, msg:%s, code:%s, wssId:%s", str, Boolean.valueOf(z), str2, Integer.valueOf(i2), Integer.valueOf(i));
        Pair pair = new Pair(str, Integer.valueOf(i));
        if (f242875a.containsKey(pair)) {
            f242875a.get(pair).mo115334a(str, i, z, strArr, strArr2, i2, str2, strArr3, strArr4);
            if (!z) {
                f242875a.remove(pair);
                return;
            }
            return;
        }
        Log.m105920e("MicroMsg.WcWss", "onOpen callback is null");
    }

    public static native int sendBuffer(String str, int i, byte[] bArr, boolean z);

    public static native void setDebugIp(String str, int i);
}
