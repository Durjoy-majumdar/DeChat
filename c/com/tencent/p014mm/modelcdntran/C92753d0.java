package com.tencent.p014mm.modelcdntran;

import android.net.Uri;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import sf0.C90188n0;
import te3.C101788im;
import te3.C101795jm;
import te3.C101830pw1;
import te3.C50743ow1;
import te3.C51018qv3;

/* renamed from: com.tencent.mm.modelcdntran.d0 */
public class C92753d0 extends C117747y implements C1311n {

    /* renamed from: i */
    public static long f266966i;

    /* renamed from: j */
    public static Map<String, C92754a> f266967j = new HashMap();

    /* renamed from: d */
    public final C47350c f266968d;

    /* renamed from: e */
    public C11385n f266969e;

    /* renamed from: f */
    public long f266970f = 0;

    /* renamed from: g */
    public int f266971g = 0;

    /* renamed from: h */
    public String f266972h = "";

    /* renamed from: com.tencent.mm.modelcdntran.d0$a */
    public static class C92754a {

        /* renamed from: a */
        public long f266973a = 0;

        /* renamed from: b */
        public long f266974b = 0;

        /* renamed from: c */
        public long f266975c = 0;

        public String toString() {
            return String.format("LastGetResult(%x){isTimeOut=%b, lastGetCDNDns_TenSecond=%d, lastTime_Hour=%d, lastCount_Hour=%d}", new Object[]{Integer.valueOf(hashCode()), Boolean.FALSE, Long.valueOf(this.f266973a), Long.valueOf(this.f266974b), Long.valueOf(this.f266975c)});
        }
    }

    public C92753d0(int i) {
        Log.m105925i("MicroMsg.NetSceneGetCDNDns", "summersafecdn init Scene:%d  [%s]", Integer.valueOf(i), Util.getStack());
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50743ow1();
        bVar.f127067b = new C101830pw1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getcdndns";
        bVar.f127069d = 379;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f266968d = a;
        this.f266971g = i;
        C50743ow1 ow12 = (C50743ow1) a.f127055a.f127080a;
        ow12.f139402d = "";
        ow12.f139403e = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f266969e = nVar;
        int g = C86709a0.m107523b().mo121110g();
        if (g == 0) {
            Log.m105920e("MicroMsg.NetSceneGetCDNDns", "has not set uin.");
            return -1;
        }
        long j = (long) g;
        if (f266966i != j) {
            f266966i = j;
            ((HashMap) f266967j).clear();
        }
        long nowSecond = Util.nowSecond();
        if (this.f266971g == 0) {
            String nullAs = Util.nullAs(mo126979k1(), "");
            this.f266972h = nullAs;
            C92754a aVar = (C92754a) ((HashMap) f266967j).get(nullAs);
            if (aVar == null) {
                aVar = new C92754a();
                ((HashMap) f266967j).put(this.f266972h, aVar);
                Log.m105925i("MicroMsg.NetSceneGetCDNDns", "summersafecdn doScene NEW lastGetResult[%s] path[%s]", aVar, this.f266972h);
            }
            Log.m105919d("MicroMsg.NetSceneGetCDNDns", "cdntra doscene Sec:%d Hour[%d,%d]", Long.valueOf(nowSecond - aVar.f266973a), Long.valueOf(nowSecond - aVar.f266974b), Long.valueOf(aVar.f266975c));
            long j2 = aVar.f266973a;
            if (nowSecond <= j2 || nowSecond - j2 >= 10) {
                long j3 = aVar.f266974b;
                if (nowSecond <= j3 || nowSecond - j3 >= 3600 || aVar.f266975c < 90) {
                    aVar.f266973a = nowSecond;
                    if (nowSecond >= j3) {
                        long j4 = aVar.f266975c;
                        if (nowSecond - j4 <= 3600) {
                            aVar.f266975c = j4 + 1;
                        }
                    }
                    aVar.f266974b = nowSecond;
                    aVar.f266975c = 0;
                } else {
                    Log.m105929w("MicroMsg.NetSceneGetCDNDns", "in 1 hour , get dns more than 90  (%d). ignore!, lastGetResult[%s]", Long.valueOf(nowSecond - j3), aVar);
                    return -1;
                }
            } else {
                Log.m105929w("MicroMsg.NetSceneGetCDNDns", "Last get dns at %d ago . ignore!, lastGetResult[%s]", Long.valueOf(nowSecond - j2), aVar);
                return -1;
            }
        } else {
            this.f266972h = "";
            Iterator it = ((HashMap) f266967j).values().iterator();
            if (it != null) {
                while (it.hasNext()) {
                    C92754a aVar2 = (C92754a) it.next();
                    if (aVar2 != null) {
                        aVar2.f266973a = nowSecond;
                        if (nowSecond >= aVar2.f266974b) {
                            long j5 = aVar2.f266975c;
                            if (nowSecond - j5 <= 3600) {
                                aVar2.f266975c = j5 + 1;
                            }
                        }
                        aVar2.f266974b = nowSecond;
                        aVar2.f266975c = 0;
                    }
                }
            }
        }
        this.f266970f = nowSecond;
        C117407d.INSTANCE.idkeyStat(546, this.f266971g == 0 ? 0 : 1, 1, true);
        return dispatch(gVar, this.f266968d, this);
    }

    public int getType() {
        return 379;
    }

    /* renamed from: j1 */
    public CdnLogic.CdnInfoParams mo126978j1(C101788im imVar) {
        CdnLogic.CdnInfoParams cdnInfoParams = new CdnLogic.CdnInfoParams();
        cdnInfoParams.c2CretryIntervalMs = imVar.f298410f;
        cdnInfoParams.c2CrwtimeoutMs = imVar.f298412h;
        cdnInfoParams.c2CshowErrorDelayMs = imVar.f298408d;
        cdnInfoParams.snsretryIntervalMs = imVar.f298411g;
        cdnInfoParams.snsrwtimeoutMs = imVar.f298413i;
        cdnInfoParams.snsshowErrorDelayMs = imVar.f298409e;
        return cdnInfoParams;
    }

    /* renamed from: k1 */
    public final String mo126979k1() {
        String str;
        if (!NetStatusUtil.isConnected(MMApplicationContext.getContext())) {
            return null;
        }
        if (!NetStatusUtil.isWifi(MMApplicationContext.getContext())) {
            str = "mobile_" + NetStatusUtil.getNetTypeString(MMApplicationContext.getContext()) + "_" + NetStatusUtil.getISPCode(MMApplicationContext.getContext());
        } else if (AppForegroundDelegate.INSTANCE.f343454n) {
            str = "wifi_" + ConnectivityCompat.Companion.getFormattedWiFiSsid();
        } else {
            str = "wifi_" + ConnectivityCompat.Companion.getFormattedWiFiSsidFromCache();
        }
        boolean z = false;
        Log.m105919d("MicroMsg.NetSceneGetCDNDns", "cdntra getCurCacheFullPath file:%s", str);
        if (str == null || str.length() < 2) {
            return null;
        }
        String format = String.format("%x", new Object[]{Integer.valueOf(str.hashCode())});
        StringBuilder sb = new StringBuilder();
        C92779i0 Cx0 = C92779i0.Cx0();
        Cx0.getClass();
        C86709a0.m107523b().mo121108c();
        String str2 = C86709a0.m107535s().f251807e + "cdndnsinfo/";
        if (!Cx0.f267051o) {
            Uri n = C116299g2.m163858n(str2);
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
            if (l.mo177810a()) {
                z = l.f348991a.mo119948x(l.f348992b);
            }
            if (!z) {
                C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            Cx0.f267051o = true;
        }
        sb.append(str2);
        sb.append(format);
        return sb.toString();
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        int i5;
        byte[] bArr2;
        int i6;
        int i7;
        String str2 = str;
        boolean z = true;
        if (C90188n0.f258910D) {
            i5 = 4;
            i4 = -1;
            Log.m105921e("MicroMsg.NetSceneGetCDNDns", "cdndebug force fail [%d,%d]", 4, -1);
        } else {
            i5 = i2;
            i4 = i3;
        }
        Log.m105918d("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd errtype:" + i5 + " errcode:" + i4);
        C101830pw1 pw12 = (C101830pw1) ((C47350c) uVar).f127056b.f127083a;
        if (i5 == 0 && i4 == 0 && pw12.f299184d != null) {
            String k1 = mo126979k1();
            if (!Util.isNullOrNil(k1) && !Util.isNullOrNil(this.f266972h) && !k1.equals(this.f266972h)) {
                Log.m105925i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd revised cacheFullPath[%s] to [%s]", k1, this.f266972h);
                C117407d.INSTANCE.idkeyStat(546, 6, 1, true);
            }
            ((HashMap) f266967j).clear();
            C51018qv3 qv32 = pw12.f299187g;
            byte[] bArr3 = null;
            if (qv32 == null || (i7 = qv32.f140572d) <= 0) {
                bArr2 = null;
            } else {
                Log.m105925i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd cdnrule:%d", Integer.valueOf(i7));
                bArr2 = C48374j0.m53715d(pw12.f299187g);
            }
            C51018qv3 qv33 = pw12.f299188h;
            if (qv33 != null && (i6 = qv33.f140572d) > 0) {
                Log.m105925i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd safecdnrule:%d", Integer.valueOf(i6));
                bArr3 = C48374j0.m53715d(pw12.f299188h);
            }
            byte[] bArr4 = bArr3;
            Log.m105925i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo:%s", pw12.f299189i);
            C101795jm jmVar = pw12.f299189i;
            if (jmVar != null) {
                Log.m105925i("MicroMsg.NetSceneGetCDNDns", "summersafecdn onGYNetEnd FakeDnsInfo FakeUin:%d NewAuthKey:%s", Integer.valueOf(jmVar.f298538e), pw12.f299189i.f298544n);
            }
            if (!C92779i0.Dx0().mo127022f(pw12.f299184d, pw12.f299185e, pw12.f299186f, bArr2, bArr4, pw12.f299189i)) {
                Log.m105920e("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd setCDNDnsInfo failed ");
                this.f266969e.onSceneEnd(i5, i4, str2, this);
                return;
            }
            Log.m105925i("MicroMsg.NetSceneGetCDNDns", "getcdndns defaultcfg %s, disastercfg %s, getcdninterval %d", pw12.f299191n, pw12.f299192o, Integer.valueOf(pw12.f299190j));
            C101788im imVar = pw12.f299191n;
            if (!(imVar == null || pw12.f299192o == null)) {
                CdnLogic.setCdnInfoParams(mo126978j1(imVar), mo126978j1(pw12.f299192o), pw12.f299190j);
            }
            Log.m105925i("MicroMsg.NetSceneGetCDNDns", "getcdndns ipv6 %d, codec1limit %d", Integer.valueOf(pw12.f299193p), Integer.valueOf(pw12.f299196s));
            if (pw12.f299193p != 1) {
                z = false;
            }
            CdnLogic.setUseIPv6Cdn(z);
            if (pw12.f299196s == 0) {
                C117407d.INSTANCE.mo182089r(546, 20, 1);
            } else {
                C117407d.INSTANCE.mo182089r(546, 21, 1);
            }
            C92796u Dx0 = C92779i0.Dx0();
            int i8 = pw12.f299196s;
            synchronized (Dx0.f267122o) {
                Dx0.f267123p = i8;
            }
            this.f266969e.onSceneEnd(i5, i4, str2, this);
            return;
        }
        C117407d.INSTANCE.mo160131h(10769, -10004, 0, Long.valueOf(this.f266970f));
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i5);
        objArr[1] = Integer.valueOf(i4);
        if (pw12.f299184d != null) {
            z = false;
        }
        objArr[2] = Boolean.valueOf(z);
        Log.m105929w("MicroMsg.NetSceneGetCDNDns", "onGYNetEnd: [%d ,%d]  info is null :%b", objArr);
        this.f266969e.onSceneEnd(i5, i4, str2, this);
    }
}
