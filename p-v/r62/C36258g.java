package r62;

import android.content.Context;
import android.os.Build;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import eb0.C31458e4;
import ei3.C86522b;
import f40.C86709a0;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import lc3.C10485b;
import p156gj.C87203t;
import q62.C101048b;

@C86522b(onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND})
/* renamed from: r62.g */
public class C36258g extends C86301e implements C101048b {

    /* renamed from: o */
    public static MTimerHandler f96554o = null;

    /* renamed from: p */
    public static String f96555p = "";

    /* renamed from: q */
    public static String f96556q = "";

    /* renamed from: d */
    public boolean f96557d = false;

    /* renamed from: e */
    public int f96558e = 0;

    /* renamed from: f */
    public int f96559f = 0;

    /* renamed from: g */
    public int f96560g = 0;

    /* renamed from: h */
    public long f96561h = 0;

    /* renamed from: i */
    public long f96562i = 60;

    /* renamed from: j */
    public boolean f96563j = false;

    /* renamed from: n */
    public final Map<Integer, Set<C101048b.C35768a>> f96564n = new HashMap();

    public C36258g() {
        boolean z = false;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 || (i >= 28 && Build.VERSION.PREVIEW_SDK_INT != 0)) {
            z = true;
        }
        this.f96563j = z;
    }

    /* renamed from: AS */
    public void mo60589AS(int i, C101048b.C35768a aVar) {
        if (aVar != null) {
            if (((HashMap) this.f96564n).containsKey(Integer.valueOf(i))) {
                ((Set) ((HashMap) this.f96564n).get(Integer.valueOf(i))).remove(aVar);
            }
        }
    }

    /* renamed from: Os */
    public int mo60590Os(int i) {
        if (!Uo0()) {
            return (NetStatusUtil.isMobile(MMApplicationContext.getContext()) || !this.f96557d || (i & this.f96558e) == 0) ? 2 : 3;
        }
        vx0(1);
        if (2 != this.f96560g && this.f96557d) {
            return (i & this.f96558e) == 0 ? 2 : 1;
        }
        return 0;
    }

    /* renamed from: Pe */
    public int mo60591Pe() {
        if (!Uo0()) {
            return 0;
        }
        return this.f96559f;
    }

    public boolean Uo0() {
        if (!NetStatusUtil.isMobile(MMApplicationContext.getContext())) {
            return false;
        }
        int iSPCode = NetStatusUtil.getISPCode(MMApplicationContext.getContext());
        Log.m105925i("MicroMsg.SimcardService", "isUnicomNetwork ispcode[%d]", Integer.valueOf(iSPCode));
        return iSPCode == 46001 || iSPCode == 46006 || iSPCode == 46009;
    }

    public void onAccountInitialized(Context context) {
        if (f96554o == null) {
            MTimerHandler mTimerHandler = new MTimerHandler(new C36257f(this), true);
            f96554o = mTimerHandler;
            mTimerHandler.startTimer(30000);
        }
    }

    public void onAccountReleased(Context context) {
    }

    /* renamed from: th */
    public void mo60593th(int i, C101048b.C35768a aVar) {
        if (aVar != null) {
            if (!((HashMap) this.f96564n).containsKey(Integer.valueOf(i))) {
                ((HashMap) this.f96564n).put(Integer.valueOf(i), new HashSet());
            }
            ((Set) ((HashMap) this.f96564n).get(Integer.valueOf(i))).add(aVar);
        }
    }

    public void vx0(int i) {
        C31458e4 e4Var;
        if (Uo0()) {
            if (this.f96561h != 0) {
                long nowSecond = Util.nowSecond();
                Log.m105925i("MicroMsg.SimcardService", "CheckMobileSIMType scene[%d] cacheExpiredTime[%d] lastCheckMobileSIMTypeTime[%d] now[%d]", Integer.valueOf(i), Long.valueOf(this.f96562i), Long.valueOf(this.f96561h), Long.valueOf(nowSecond));
                if (i != 2) {
                    long b = (long) ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("NetInfoCheckMobileSimTypeCacheTime", 28800);
                    long j = this.f96562i;
                    if (b > j) {
                        b = j;
                    }
                    if (nowSecond - this.f96561h < b) {
                        return;
                    }
                } else if (nowSecond - this.f96561h < 60) {
                    return;
                }
            }
            this.f96561h = Util.nowSecond();
            f96556q = xx0();
            Log.m105924i("MicroMsg.SimcardService", "CheckMobileSIMType start");
            if (!this.f96563j) {
                f96555p = C87203t.m108271g();
                e4Var = new C31458e4(i, f96556q, C87203t.m108270f(true), f96555p, (String) null, (String) null);
            } else {
                String l = C87203t.m108276l();
                String str = f96556q;
                String n = C87203t.m108278n();
                if (l == "") {
                    l = null;
                }
                e4Var = new C31458e4(i, str, (String) null, (String) null, n, l);
            }
            C86709a0.m107524d().mo123460f(e4Var);
        }
    }

    public final void wx0(int i, int i2) {
        Log.m105925i("MicroMsg.SimcardService", "NotifySimTypeChange flag[%d]", Integer.valueOf(i));
        Map<Integer, Set<C101048b.C35768a>> map = this.f96564n;
        if (map != null) {
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                int i3 = (((Integer) entry.getKey()).intValue() & i) == 0 ? 2 : 1;
                for (C101048b.C35768a a : (Set) entry.getValue()) {
                    a.mo60388a(i3, i2);
                }
            }
        }
    }

    public final String xx0() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement != null) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (nextElement2 != null) {
                            if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address)) {
                                return Util.isNullOrNil(nextElement2.getHostAddress()) ? "127.0.0.1" : nextElement2.getHostAddress();
                            }
                        }
                    }
                    continue;
                }
            }
            return "127.0.0.1";
        } catch (Exception unused) {
            return "127.0.0.1";
        }
    }
}
