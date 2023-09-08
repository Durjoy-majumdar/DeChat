package ob0;

import android.os.RemoteException;
import com.tencent.p014mm.network.C26879f;
import com.tencent.p014mm.network.C81039e;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: ob0.f0 */
public class C27639f0 implements C81039e {

    /* renamed from: d */
    public final C26879f f76556d;

    public C27639f0(C26879f fVar) {
        this.f76556d = fVar;
    }

    /* renamed from: A4 */
    public int mo55412A4(byte[] bArr) {
        try {
            return this.f76556d.mo54103A4(bArr);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "AccInfoCacheInWorker parseBuf exception:%s", Util.stackTraceToString(e));
            return -6;
        }
    }

    /* renamed from: B */
    public String mo55413B() {
        try {
            return this.f76556d.mo54104B();
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: C2 */
    public int mo55414C2(String str) {
        try {
            return this.f76556d.mo54105C2(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return 0;
        }
    }

    /* renamed from: D */
    public byte[] mo55415D() {
        try {
            return this.f76556d.mo54106D();
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: E0 */
    public void mo55416E0(int i, byte[] bArr) {
        try {
            this.f76556d.mo54107E0(i, bArr);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: G3 */
    public boolean mo55417G3() {
        try {
            return this.f76556d.mo54108G3();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return false;
        }
    }

    /* renamed from: J2 */
    public byte[] mo55418J2(String str) {
        try {
            return this.f76556d.mo54109J2(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: N0 */
    public int mo55419N0(String str) {
        try {
            return this.f76556d.mo54110N0(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return 0;
        }
    }

    /* renamed from: P2 */
    public void mo55420P2() {
        try {
            this.f76556d.mo54111P2();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: S */
    public byte[] mo55421S(int i) {
        try {
            return this.f76556d.mo54112S(i);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: X0 */
    public void mo55422X0(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        try {
            this.f76556d.mo54113X0(bArr, bArr2, bArr3, i);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: X2 */
    public void mo55423X2(String str, byte[] bArr) {
        try {
            this.f76556d.mo54114X2(str, bArr);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: Y4 */
    public void mo55424Y4(boolean z) {
        try {
            this.f76556d.mo54115Y4(z);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: b */
    public void mo55425b(int i) {
        try {
            this.f76556d.mo54116b(i);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: f2 */
    public byte[] mo55426f2(String str) {
        try {
            return this.f76556d.mo54117f2(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: g3 */
    public void mo55427g3(String str, int i) {
        try {
            this.f76556d.mo54118g3(str, i);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    public byte[] getCookie() {
        try {
            return this.f76556d.getCookie();
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    public int getUin() {
        try {
            return this.f76556d.getUin();
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return 0;
        }
    }

    public String getUsername() {
        try {
            return this.f76556d.getUsername();
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    public boolean isForeground() {
        try {
            return this.f76556d.isForeground();
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return true;
        }
    }

    /* renamed from: j1 */
    public void mo55432j1() {
        try {
            this.f76556d.mo54123j1();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: l4 */
    public byte[] mo55433l4() {
        try {
            return this.f76556d.mo54124l4();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "AccInfoCacheInWorker getCacheBuffer exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: m3 */
    public byte[] mo55434m3(String str) {
        try {
            return this.f76556d.mo54125m3(str);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: n0 */
    public void mo55435n0(int i, byte[] bArr, byte[] bArr2) {
        try {
            this.f76556d.mo54126n0(i, bArr, bArr2);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: q3 */
    public boolean mo55436q3(String str) {
        try {
            return this.f76556d.mo54127q3(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return false;
        }
    }

    /* renamed from: q4 */
    public byte[] mo55437q4(String str) {
        try {
            return this.f76556d.mo54128q4(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: r1 */
    public int mo55438r1(byte[] bArr) {
        try {
            return this.f76556d.mo54129r1(bArr);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
            return -1;
        }
    }

    public void reset() {
        try {
            this.f76556d.reset();
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    public void setUsername(String str) {
        try {
            this.f76556d.setUsername(str);
        } catch (RemoteException e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }

    public String toString() {
        return (((((("RAccInfo:\n" + "|-uin     =" + getUin() + "\n") + "|-user    =" + getUsername() + "\n") + "|-singlesession =" + Util.dumpHex(mo55421S(1)) + "\n") + "|-clientsession =" + Util.dumpHex(mo55421S(2)) + "\n") + "|-serversession =" + Util.dumpHex(mo55421S(3)) + "\n") + "|-ecdhkey =" + Util.dumpHex(mo55415D()) + "\n") + "`-cookie  =" + Util.dumpHex(getCookie());
    }

    /* renamed from: x4 */
    public void mo55442x4() {
        try {
            this.f76556d.mo54132x4();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RAccInfo", "exception:%s", Util.stackTraceToString(e));
        }
    }
}
