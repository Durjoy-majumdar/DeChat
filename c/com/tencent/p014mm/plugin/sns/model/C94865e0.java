package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.OutputStream;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import os2.C100406i0;
import os2.C100408j0;
import te3.C101804kv2;
import te3.C51018qv3;
import te3.a74;
import te3.b74;
import vr2.C102236a0;

/* renamed from: com.tencent.mm.plugin.sns.model.e0 */
public class C94865e0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f274855d;

    /* renamed from: e */
    public String f274856e = "";

    /* renamed from: f */
    public OutputStream f274857f = null;

    /* renamed from: g */
    public String f274858g;

    /* renamed from: h */
    public String f274859h;

    /* renamed from: i */
    public int f274860i = -1;

    /* renamed from: j */
    public int f274861j = -1;

    /* renamed from: n */
    public boolean f274862n = true;

    /* renamed from: o */
    public String f274863o = null;

    /* renamed from: p */
    public C11385n f274864p;

    /* renamed from: q */
    public C101804kv2 f274865q;

    public C94865e0(C101804kv2 kv22, String str, String str2, int i, boolean z, int i2, String str3) {
        SnsMethodCalculate.markStartTimeMs("setMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        this.f274856e = str;
        SnsMethodCalculate.markEndTimeMs("setMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        this.f274865q = kv22;
        this.f274862n = z;
        this.f274860i = i;
        this.f274861j = i2;
        this.f274863o = str3;
        this.f274858g = C94938q1.m120518e(C94866e1.m120262YO(), str);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new a74();
        bVar.f127067b = new b74();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnsdownload";
        bVar.f127069d = 208;
        bVar.f127070e = 96;
        bVar.f127071f = 1000000096;
        C47350c a = bVar.mo72403a();
        this.f274855d = a;
        a74 a74 = (a74) a.f127055a.f127080a;
        C100406i0 DN = C94866e1.ay0().mo139866DN(str);
        DN = DN == null ? new C100406i0() : DN;
        DN.mo139856j(str);
        DN.mo139855i(0);
        C94866e1.ay0().v10(str, DN);
        if (z) {
            this.f274859h = C102236a0.m134739d0(kv22);
        } else {
            this.f274859h = C102236a0.m134731Z(kv22);
        }
        C86013q1.m106461v(this.f274858g);
        C86013q1.m106447h(C94938q1.m120518e(C94866e1.m120262YO(), str) + this.f274859h);
        a74.f130363f = str2;
        a74.f130365h = 0;
        a74.f130361d = 0;
        a74.f130362e = 0;
        SnsMethodCalculate.markStartTimeMs("getDownType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        int i3 = this.f274860i;
        SnsMethodCalculate.markEndTimeMs("getDownType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        a74.f130364g = i3;
        Log.m105918d("MicroMsg.NetSceneSnsDownload", "requestKey " + str3);
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        this.f274864p = nVar;
        int dispatch = dispatch(gVar, this.f274855d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return 208;
    }

    /* renamed from: j1 */
    public String mo131015j1() {
        SnsMethodCalculate.markStartTimeMs("getMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        String str = this.f274856e;
        SnsMethodCalculate.markEndTimeMs("getMediaId", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return str;
    }

    /* renamed from: k1 */
    public int mo131016k1() {
        SnsMethodCalculate.markStartTimeMs("getRequestDownloadType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        int i = this.f274861j;
        SnsMethodCalculate.markEndTimeMs("getRequestDownloadType", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return i;
    }

    /* renamed from: l1 */
    public final void mo131017l1() {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        C94866e1.Vx0().mo130975B(this.f274863o);
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
    }

    /* renamed from: m1 */
    public final void mo131018m1() {
        SnsMethodCalculate.markStartTimeMs("releaseFileHandle", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        try {
            OutputStream outputStream = this.f274857f;
            if (outputStream != null) {
                outputStream.flush();
                this.f274857f.close();
                this.f274857f = null;
            }
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.NetSceneSnsDownload", e, "", new Object[0]);
        }
        SnsMethodCalculate.markEndTimeMs("releaseFileHandle", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        Log.m105918d("MicroMsg.NetSceneSnsDownload", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        b74 b74 = (b74) ((C47350c) uVar).f127056b.f127083a;
        if (((C47350c.C47354d) uVar.getRespObj()).getRetCode() != 0) {
            this.f274864p.onSceneEnd(i2, i3, str, this);
            C94866e1.Vx0().mo130975B(this.f274863o);
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        C100406i0 DN = C94866e1.ay0().mo139866DN(mo131015j1());
        int i5 = b74.f130998e;
        if (i5 <= 0) {
            Log.m105920e("MicroMsg.NetSceneSnsDownload", "error 1");
            mo131017l1();
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        C51018qv3 qv32 = b74.f130999f;
        if (qv32 == null) {
            Log.m105920e("MicroMsg.NetSceneSnsDownload", "error 2");
            mo131017l1();
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            return;
        }
        int i6 = b74.f130997d;
        if (i6 < 0 || qv32.f140574f.f257327a.length + i6 > i5) {
            Log.m105920e("MicroMsg.NetSceneSnsDownload", "error 3");
            mo131017l1();
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        } else if (i6 != DN.mo139850d()) {
            Log.m105920e("MicroMsg.NetSceneSnsDownload", "error 4");
            mo131017l1();
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        } else {
            byte[] f = b74.f130999f.f140574f.mo123703f();
            SnsMethodCalculate.markStartTimeMs("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
            boolean z = false;
            if (!C102236a0.m134751j0(C94866e1.xx0())) {
                SnsMethodCalculate.markEndTimeMs("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                i4 = 0;
            } else {
                try {
                    if (this.f274857f == null) {
                        C86013q1.m106461v(this.f274858g);
                        this.f274857f = C86013q1.m106429K(this.f274858g + this.f274859h, false);
                    }
                    Log.m105918d("MicroMsg.NetSceneSnsDownload", "appendBuf " + f.length);
                    this.f274857f.write(f);
                    mo131018m1();
                    i4 = f.length;
                    SnsMethodCalculate.markEndTimeMs("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.NetSceneSnsDownload", e, "appendBuf failed: " + this.f274859h, new Object[0]);
                    i4 = -1;
                    mo131018m1();
                    SnsMethodCalculate.markEndTimeMs("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                } catch (Throwable th) {
                    mo131018m1();
                    SnsMethodCalculate.markEndTimeMs("appendBuf", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                    throw th;
                }
            }
            if (i4 < 0) {
                Log.m105920e("MicroMsg.NetSceneSnsDownload", "error 5");
                mo131017l1();
                SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                return;
            }
            DN.mo139855i(DN.mo139850d() + i4);
            int i7 = b74.f130998e;
            SnsMethodCalculate.markStartTimeMs("setTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
            DN.f294127g = i7;
            SnsMethodCalculate.markEndTimeMs("setTotallen", "com.tencent.mm.plugin.sns.storage.SnsMedia");
            Log.m105918d("MicroMsg.NetSceneSnsDownload", "byteLen " + i4 + "  totalLen " + b74.f130998e);
            C94866e1.ay0().v10(mo131015j1(), DN);
            SnsMethodCalculate.markStartTimeMs("isGetCompleted", "com.tencent.mm.plugin.sns.storage.SnsMedia");
            if (DN.mo139850d() == DN.mo139852f() && DN.mo139852f() != 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isGetCompleted", "com.tencent.mm.plugin.sns.storage.SnsMedia");
            if (z) {
                SnsMethodCalculate.markStartTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                Log.m105918d("MicroMsg.NetSceneSnsDownload", "downLoad ok");
                String X = this.f274861j == 1 ? C102236a0.m134729X(this.f274865q) : C102236a0.m134717L(this.f274865q);
                String e2 = C94938q1.m120518e(C94866e1.m120262YO(), mo131015j1());
                C86013q1.m106447h(e2 + X);
                C86013q1.m106435Q(e2, this.f274859h, X);
                if (this.f274862n) {
                    C100408j0.m131393mI(e2, X, C102236a0.m134745g0(this.f274865q), (float) C94866e1.Hx0());
                } else {
                    String X2 = C102236a0.m134729X(this.f274865q);
                    if (!C86013q1.m106450k(e2 + X2)) {
                        C100408j0.m131392kD(e2, X, X2, (float) C94866e1.Ox0());
                    }
                    String g0 = C102236a0.m134745g0(this.f274865q);
                    if (!C86013q1.m106450k(e2 + g0)) {
                        C100408j0.m131393mI(e2, X, g0, (float) C94866e1.Hx0());
                    }
                }
                C94866e1.Vx0().mo130975B(this.f274863o);
                SnsMethodCalculate.markEndTimeMs("onPostScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
                this.f274864p.onSceneEnd(i2, i3, str, this);
            } else {
                doScene(dispatcher(), this.f274864p);
            }
            SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        }
    }

    public int securityLimitCount() {
        SnsMethodCalculate.markStartTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        SnsMethodCalculate.markEndTimeMs("securityLimitCount", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return 100;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        SnsMethodCalculate.markStartTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        y$$d y__d = y$$d.EOk;
        SnsMethodCalculate.markEndTimeMs("securityVerificationChecked", "com.tencent.mm.plugin.sns.model.NetSceneSnsDownload");
        return y__d;
    }
}
