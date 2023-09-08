package fe0;

import com.tencent.mars.comm.PlatformComm;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p156gj.C87200o;
import pe3.C89349b;
import qe3.C89625d;
import te3.ha4;
import te3.ka4;
import te3.la4;
import tl0.C90509a;
import zn0.C91803c;

/* renamed from: fe0.a */
public class C116866a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f350273d = null;

    /* renamed from: e */
    public C89349b f350274e;

    /* renamed from: f */
    public int f350275f;

    /* renamed from: g */
    public int f350276g;

    /* renamed from: h */
    public int f350277h;

    /* renamed from: i */
    public int f350278i;

    /* renamed from: j */
    public ha4 f350279j;

    /* renamed from: n */
    public ha4 f350280n;

    /* renamed from: o */
    public C11385n f350281o;

    /* renamed from: p */
    public String f350282p;

    public C116866a(C89349b bVar, int i, int i2, int i3, int i4, ha4 ha4, ha4 ha42, String str) {
        this.f350274e = bVar;
        this.f350275f = i;
        this.f350276g = i2;
        this.f350277h = i3;
        this.f350278i = i4;
        this.f350279j = ha4;
        this.f350280n = ha42;
        this.f350282p = str;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new ka4();
        bVar2.f127067b = new la4();
        bVar2.f127069d = C90509a.C90511b.CTRL_INDEX;
        bVar2.f127068c = "/cgi-bin/micromsg-bin/speedtestreport";
        bVar2.f127070e = 996;
        bVar2.f127071f = 1000000996;
        bVar2.f127077l = 0;
        bVar2.f127079n = null;
        this.f350273d = bVar2.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f350281o = nVar;
        ka4 ka4 = (ka4) this.f350273d.f127055a.f127080a;
        ka4.f354069d = this.f350274e;
        ka4.f354073h = this.f350275f;
        ka4.f354074i = this.f350276g;
        ka4.f354075j = this.f350277h;
        ka4.f354076n = this.f350278i;
        ka4.f354078p = this.f350279j;
        ka4.f354077o = this.f350280n;
        if ("dual".equals(this.f350282p)) {
            String str = ka4.f354077o.f134533d;
            if (str != null && str.length() > 0 && !str.contains(".")) {
                ha4 ha4 = ka4.f354078p;
                String str2 = "";
                try {
                    Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                    while (networkInterfaces.hasMoreElements()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                        while (true) {
                            if (!inetAddresses.hasMoreElements()) {
                                break;
                            }
                            InetAddress nextElement = inetAddresses.nextElement();
                            if (nextElement instanceof Inet6Address) {
                                str2 = nextElement.getHostAddress().toString();
                                break;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                ha4.f134533d = str2;
                Log.m105918d("MicroMsg.MMNewSpeedTest", "local stack is dual ip is " + ka4.f354078p.f134533d);
            }
        }
        int netInfo = PlatformComm.C2Java.getNetInfo();
        if (netInfo == -1) {
            ka4.f354070e = "NONET";
        } else if (netInfo == 1) {
            ka4.f354070e = "WIFI";
            ka4.f354071f = ConnectivityCompat.Companion.getFormattedWiFiSsid();
        } else if (netInfo != 2) {
            ka4.f354070e = "NONET";
        } else {
            int statisticsNetType = PlatformComm.C2Java.getStatisticsNetType();
            if (statisticsNetType == 2) {
                ka4.f354070e = "EDGE";
            } else if (statisticsNetType == 3) {
                ka4.f354070e = "2G";
            } else if (statisticsNetType == 4) {
                ka4.f354070e = "3G";
            } else if (statisticsNetType != 5) {
                ka4.f354070e = "EDGE";
            } else {
                ka4.f354070e = "4G";
            }
            PlatformComm.SIMInfo curSIMInfo = PlatformComm.C2Java.getCurSIMInfo();
            if (curSIMInfo != null) {
                ka4.f354071f = curSIMInfo.ispCode;
            } else {
                ka4.f354071f = "unknown_netinfo";
            }
        }
        ka4.f354072g = "device info:" + C89625d.f257836b + " " + C89625d.f257837c + " " + C89625d.f257839e + " " + C87200o.f252873f;
        Log.m105918d("MicroMsg.MMNewSpeedTest", "speed test " + ka4.f354072g + ",networktype: " + ka4.f354070e + ",network_info: " + ka4.f354071f + ",conn_time: " + ka4.f354073h + ",conn_retcode: " + ka4.f354074i + ",trans_time: " + ka4.f354075j + ",trans_time: " + ka4.f354076n + ",cookie: " + ka4.f354069d.toString() + ",cookie size: " + ka4.f354069d.f257327a.length + ",size: " + ka4.computeSize() + ",client ip: " + ka4.f354078p.f134533d + ",client port: " + ka4.f354078p.f134534e + ",server ip: " + ka4.f354077o.f134533d + ",server port: " + ka4.f354077o.f134534e);
        return dispatch(gVar, this.f350273d, this);
    }

    public int getType() {
        return C90509a.C90511b.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.MMNewSpeedTest", "ErrType:" + i2 + "   errCode:" + i3);
        if (i3 == 0 && i2 == 0) {
            C115669n.INSTANCE.mo175911u(C91803c.CTRL_INDEX, 26);
        } else {
            C115669n.INSTANCE.mo175911u(C91803c.CTRL_INDEX, 27);
        }
        this.f350281o.onSceneEnd(i2, i3, str, this);
    }
}
