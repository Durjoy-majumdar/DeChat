package zp0;

import android.os.SystemClock;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityCGISpeedStruct;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.appbrand.report.C84116i0;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84191e;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import f40.C86709a0;
import gy3.C87412m;
import junit.framework.AssertionFailedError;
import lu3.C109426i;
import nr3.C89059e;
import ob0.C117747y;
import ob0.C89132b;
import ob0.C89137b0;
import ob0.C89147n0;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import te3.C52246zc2;
import te3.C90404cb;
import te3.C90420iq;
import te3.C90422jy;
import te3.C90444vm2;
import te3.h65;
import te3.m55;

/* renamed from: zp0.b */
public class C91823b<T extends C49335eu3> extends C89132b<T> {

    /* renamed from: i */
    public final String f262924i;

    /* renamed from: j */
    public final String f262925j;

    /* renamed from: n */
    public long f262926n;

    /* renamed from: o */
    public long f262927o;

    /* renamed from: zp0.b$a */
    public static final class C91824a implements C109426i {

        /* renamed from: d */
        public final /* synthetic */ C91823b<T> f262928d;

        /* renamed from: e */
        public final /* synthetic */ T f262929e;

        /* renamed from: f */
        public final /* synthetic */ int f262930f;

        /* renamed from: g */
        public final /* synthetic */ C117747y f262931g;

        /* renamed from: h */
        public final /* synthetic */ C90420iq f262932h;

        public C91824a(C91823b<T> bVar, T t, int i, C117747y yVar, C90420iq iqVar) {
            this.f262928d = bVar;
            this.f262929e = t;
            this.f262930f = i;
            this.f262931g = yVar;
            this.f262932h = iqVar;
        }

        public String getKey() {
            return "";
        }

        public boolean isLogging() {
            return false;
        }

        public void run() {
            String str;
            C49966ja jaVar;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f262928d.f262927o;
            WeAppQualityCGISpeedStruct weAppQualityCGISpeedStruct = new WeAppQualityCGISpeedStruct();
            C91823b<T> bVar = this.f262928d;
            T t = this.f262929e;
            int i = this.f262930f;
            C117747y yVar = this.f262931g;
            C90420iq iqVar = this.f262932h;
            weAppQualityCGISpeedStruct.f236764g = bVar.f262926n;
            weAppQualityCGISpeedStruct.f236765h = currentTimeMillis;
            weAppQualityCGISpeedStruct.f236766i = elapsedRealtime;
            weAppQualityCGISpeedStruct.f236767j = weAppQualityCGISpeedStruct.mo86045b("networkType", C84116i0.m103659b(MMApplicationContext.getContext()), true);
            weAppQualityCGISpeedStruct.f236768k = t != null ? (long) t.computeSize() : -1;
            weAppQualityCGISpeedStruct.f236769l = i;
            weAppQualityCGISpeedStruct.f236770m = (t == null || (jaVar = t.BaseResponse) == null) ? Integer.MIN_VALUE : jaVar.f135955d;
            weAppQualityCGISpeedStruct.f236771n = yVar.getType();
            MMApplicationContext.isMainProcess();
            weAppQualityCGISpeedStruct.f236772o = (long) C84116i0.m103658a(C91828f.m115345a());
            weAppQualityCGISpeedStruct.f236773p = iqVar != null ? iqVar.f259610q : 0;
            C84191e eVar = C84185b.f245912a;
            C91823b<T> bVar2 = this.f262928d;
            String str2 = bVar2.f262924i;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            String str4 = bVar2.f262925j;
            if (str4 == null) {
                str4 = str3;
            }
            try {
                QualitySessionRuntime c = C84185b.m103770c(str2, true);
                str = c != null ? c.f245832d : null;
            } catch (IllegalStateException unused) {
                str = str3;
            }
            weAppQualityCGISpeedStruct.f236762e = weAppQualityCGISpeedStruct.mo86045b("appid", str2, true);
            if (str != null) {
                str3 = str;
            }
            weAppQualityCGISpeedStruct.f236761d = weAppQualityCGISpeedStruct.mo86045b("instanceId", str3, true);
            weAppQualityCGISpeedStruct.f236763f = weAppQualityCGISpeedStruct.mo86045b("username", str4, true);
            weAppQualityCGISpeedStruct.mo86054n();
        }
    }

    public C91823b() {
        this((String) null, (String) null);
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [com.tencent.mm.network.u] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r11 = (r11 = r13.getReqResp()).getRespObj();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10094h(int r9, int r10, java.lang.String r11, T r12, ob0.C117747y r13) {
        /*
            r8 = this;
            r9 = 0
            if (r13 == 0) goto L_0x0014
            com.tencent.mm.network.u r11 = r13.getReqResp()
            if (r11 == 0) goto L_0x0014
            qe3.w$e r11 = r11.getRespObj()
            if (r11 == 0) goto L_0x0014
            te3.iq r11 = r11.getProfile()
            goto L_0x0015
        L_0x0014:
            r11 = r9
        L_0x0015:
            if (r13 == 0) goto L_0x0029
            zt3.t r6 = zt3.C119157j.f356862d
            zp0.b$a r7 = new zp0.b$a
            r0 = r7
            r1 = r8
            r2 = r12
            r3 = r10
            r4 = r13
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            zt3.j r6 = (zt3.C119157j) r6
            r6.mo183875f(r7)
        L_0x0029:
            if (r11 == 0) goto L_0x011c
            com.tencent.mm.network.u r10 = r13.getReqResp()
            boolean r12 = r10 instanceof ob0.C47350c
            if (r12 == 0) goto L_0x0036
            r9 = r10
            ob0.c r9 = (ob0.C47350c) r9
        L_0x0036:
            if (r9 == 0) goto L_0x003d
            int r9 = r9.getType()
            goto L_0x0049
        L_0x003d:
            com.tencent.mm.network.u r9 = r13.getReqResp()
            qe3.w$d r9 = r9.getReqObj()
            int r9 = r9.getCmdId()
        L_0x0049:
            long r0 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r8.mo125660l(r11)     // Catch:{ AssertionFailedError -> 0x011c }
            long r2 = r11.f259609p
            r4 = 2
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x005e
            long r2 = r11.f259606j
            long r4 = r11.f259600d
        L_0x005c:
            long r2 = r2 - r4
            goto L_0x006b
        L_0x005e:
            r4 = 1
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x0069
            long r2 = r11.f259606j
            long r4 = r11.f259607n
            goto L_0x005c
        L_0x0069:
            r2 = 0
        L_0x006b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "report profile, url:"
            r10.append(r12)
            com.tencent.mm.network.u r12 = r13.getReqResp()
            java.lang.String r12 = r12.getUri()
            r10.append(r12)
            java.lang.String r12 = ", cmdid:"
            r10.append(r12)
            r10.append(r9)
            java.lang.String r9 = ", businessCgiSendTime:"
            r10.append(r9)
            long r12 = r8.f262926n
            r10.append(r12)
            java.lang.String r9 = ", businessCgiFinishTime:"
            r10.append(r9)
            r10.append(r0)
            java.lang.String r9 = ", businessCgiCostTime:"
            r10.append(r9)
            long r12 = r8.f262926n
            long r0 = r0 - r12
            r10.append(r0)
            java.lang.String r9 = ", profile: profileCostTime:"
            r10.append(r9)
            r10.append(r2)
            java.lang.String r9 = ", startConnectTime:"
            r10.append(r9)
            long r12 = r11.f259600d
            r10.append(r12)
            java.lang.String r9 = ", connectSuccessfulTime:"
            r10.append(r9)
            long r12 = r11.f259601e
            r10.append(r12)
            java.lang.String r9 = ", startHandshakeTime:"
            r10.append(r9)
            long r12 = r11.f259602f
            r10.append(r12)
            java.lang.String r9 = ", handshakeSuccessfulTime:"
            r10.append(r9)
            long r12 = r11.f259603g
            r10.append(r12)
            java.lang.String r9 = ", startSendPacketTime:"
            r10.append(r9)
            long r12 = r11.f259604h
            r10.append(r12)
            java.lang.String r9 = ", startReadPacketTime:"
            r10.append(r9)
            long r12 = r11.f259605i
            r10.append(r12)
            java.lang.String r9 = ", readPacketFinishedTime:"
            r10.append(r9)
            long r12 = r11.f259606j
            r10.append(r12)
            java.lang.String r9 = ", taskStartTime:"
            r10.append(r9)
            long r12 = r11.f259607n
            r10.append(r12)
            java.lang.String r9 = ", rtt:"
            r10.append(r9)
            long r12 = r11.f259608o
            r10.append(r12)
            java.lang.String r9 = ", channelType:"
            r10.append(r9)
            long r11 = r11.f259609p
            r10.append(r11)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "MicroMsg.AppBrandCgiWithSpeedReport"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r9)
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zp0.C91823b.mo10094h(int, int, java.lang.String, te3.eu3, ob0.y):void");
    }

    /* renamed from: i */
    public C89059e<C89132b.C89134c<T>> mo9225i() {
        Log.m105924i("MicroMsg.AppBrandCgiWithSpeedReport", "run() url:" + this.f256789f.f127057c + ", cmdid:" + this.f256789f.f127058d);
        this.f262926n = Util.nowMilliSecond();
        this.f262927o = Util.currentTicks();
        C89059e<C89132b.C89134c<T>> q = mo109760q();
        if (q != null) {
            return q;
        }
        C89059e<C89132b.C89134c<T>> i = super.mo9225i();
        C87412m.m108593f(i, "super.run()");
        return i;
    }

    /* renamed from: k */
    public final void mo125659k(C90422jy jyVar) {
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger()) {
            C87412m.m108591d(jyVar);
        }
    }

    /* renamed from: l */
    public final void mo125660l(C90420iq iqVar) {
        C89137b0 b = C86709a0.m107529k().mo121127b();
        C114770g j = b != null ? b.mo123464j() : null;
        if (j != null) {
            long nowMilliSecond = Util.nowMilliSecond() - j.mo55448H0();
            iqVar.f259600d += nowMilliSecond;
            iqVar.f259601e += nowMilliSecond;
            iqVar.f259602f += nowMilliSecond;
            iqVar.f259603g += nowMilliSecond;
            iqVar.f259604h += nowMilliSecond;
            iqVar.f259605i += nowMilliSecond;
            iqVar.f259606j += nowMilliSecond;
            iqVar.f259607n += nowMilliSecond;
            return;
        }
        throw new AssertionFailedError("dispatch is null");
    }

    /* renamed from: n */
    public C89132b.C89134c<T> mo115600n() {
        this.f262926n = Util.nowMilliSecond();
        this.f262927o = Util.currentTicks();
        return C89147n0.m111434a(this);
    }

    /* renamed from: q */
    public C89059e<C89132b.C89134c<T>> mo109760q() {
        C47465a aVar = this.f256789f.f127055a.f127080a;
        if (aVar instanceof m55) {
            mo125659k(((m55) aVar).f137857i);
            return null;
        } else if (aVar instanceof C90444vm2) {
            mo125659k(((C90444vm2) aVar).f259896w);
            return null;
        } else if (aVar instanceof h65) {
            mo125659k(((h65) aVar).f134470e);
            return null;
        } else if (aVar instanceof C52246zc2) {
            mo125659k(((C52246zc2) aVar).f145822x);
            return null;
        } else if (!(aVar instanceof C90404cb)) {
            return null;
        } else {
            mo125659k(((C90404cb) aVar).f259443f);
            return null;
        }
    }

    public C91823b(String str, String str2) {
        this.f262924i = str;
        this.f262925j = str2;
    }
}
