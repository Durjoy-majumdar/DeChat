package hg0;

import com.tencent.p014mm.autogen.events.UpdateLocalVerifySwitchEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72985m3;
import com.tencent.p014mm.storage.C72987n3;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75593t5;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import mg0.C76754b;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C77928fd;
import te3.C77934gd;

/* renamed from: hg0.j0 */
public class C76170j0 extends C117747y implements C1311n {

    /* renamed from: i */
    public static int f223160i;

    /* renamed from: d */
    public final C47350c f223161d;

    /* renamed from: e */
    public C11385n f223162e;

    /* renamed from: f */
    public int f223163f;

    /* renamed from: g */
    public String f223164g;

    /* renamed from: h */
    public String f223165h;

    public C76170j0(String str, int i, String str2, int i2, String str3, String str4, String str5) {
        this(str, i, str2, i2, str3);
        this.f223164g = str4;
        this.f223165h = str5;
        C77928fd fdVar = (C77928fd) this.f223161d.f127055a.f127080a;
        fdVar.f227369o = str4;
        fdVar.f227370p = str5;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        String str;
        this.f223162e = nVar;
        C77928fd fdVar = (C77928fd) this.f223161d.f127055a.f127080a;
        String str2 = fdVar.f227362e;
        if (str2 == null || str2.length() <= 0) {
            Log.m105920e("MicroMsg.NetSceneBindOpMobile", "doScene getMobile Error: " + fdVar.f227362e);
            return -1;
        }
        int i = fdVar.f227363f;
        if ((i != 2 && i != 19) || ((str = fdVar.f227364g) != null && str.length() > 0)) {
            return dispatch(gVar, this.f223161d, this);
        }
        Log.m105920e("MicroMsg.NetSceneBindOpMobile", "doScene getVerifyCode Error: " + fdVar.f227362e);
        return -1;
    }

    /* renamed from: f */
    public int mo106407f() {
        return ((C77928fd) this.f223161d.f127055a.f127080a).f227363f;
    }

    public int getType() {
        return 132;
    }

    /* renamed from: j1 */
    public String mo106408j1() {
        return ((C77934gd) this.f223161d.f127056b.f127083a).f227441d;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        C47350c cVar = this.f223161d;
        C77928fd fdVar = (C77928fd) cVar.f127055a.f127080a;
        C77934gd gdVar = (C77934gd) cVar.f127056b.f127083a;
        if (gdVar != null) {
            int i6 = gdVar.f227457w;
            Log.m105925i("MicroMsg.NetSceneBindOpMobile", "summerauth mmtls bindop:%s", Integer.valueOf(i6));
            C86709a0.m107528h();
            C86709a0.m107535s().f251803a.mo119664f(47, Integer.valueOf(i6));
            C114770g gVar = C86709a0.m107529k().f251779b.f256809d;
            if (gVar != null) {
                gVar.mo55468b3((i6 & 1) == 0);
            }
            Log.m105925i("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd response JSON %s", gdVar.toJSON());
        } else {
            Log.m105925i("MicroMsg.NetSceneBindOpMobile", "summerauth mmtls bindop not set as ret:%s", gdVar);
        }
        if (i4 == 0 && i5 == 0) {
            int i7 = fdVar.f227363f;
            if (i7 == 2 || i7 == 4 || i7 == 25 || i7 == 11 || i7 == 19) {
                C86709a0.m107535s().mo121142i().mo119676J(4097, "");
                String str3 = (String) C86709a0.m107535s().mo121142i().mo119684e(6, "");
                C86709a0.m107535s().mo121142i().mo119676J(6, fdVar.f227362e);
                if (!Util.isNullOrNil(str3)) {
                    C85801v1 i8 = C86709a0.m107535s().mo121142i();
                    C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LAST_LOGIN_USERNAME_STRING;
                    if (i8.mo119685f(aVar, "").equals(str3)) {
                        C86709a0.m107535s().mo121142i().mo119677K(aVar, C75592q0.m90789s());
                    }
                    Iterator it = ((HashSet) C75593t5.f222075c.mo105942e()).iterator();
                    while (it.hasNext()) {
                        String str4 = (String) it.next();
                        if (str3.equals(C75593t5.f222075c.mo105941d(str4, "login_user_name"))) {
                            C75593t5.f222075c.mo105946i(str4, "login_user_name", str4);
                        }
                    }
                }
                if (Util.isNullOrNil(this.f223164g) || Util.isNullOrNil(this.f223165h)) {
                    C76186t.m91542j(true);
                }
                if (fdVar.f227363f == 19) {
                    C86709a0.m107535s().mo121142i().mo119676J(12322, (Object) null);
                }
                C5139t.m5183e(4, 3);
                Log.m105918d("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  mobile binded");
            } else if (i7 == 3) {
                C86709a0.m107535s().mo121142i().mo119676J(4097, "");
                C86709a0.m107535s().mo121142i().mo119676J(6, "");
                C86709a0.m107535s().mo121142i().mo119676J(12322, (Object) null);
                C86709a0.m107535s().mo121142i().mo119676J(64, Integer.valueOf(gdVar.f227450p));
                UpdateLocalVerifySwitchEvent updateLocalVerifySwitchEvent = new UpdateLocalVerifySwitchEvent();
                UpdateLocalVerifySwitchEvent.C67808a aVar2 = updateLocalVerifySwitchEvent.f193987d;
                aVar2.f193988a = false;
                aVar2.f193989b = true;
                updateLocalVerifySwitchEvent.publish();
                C76168b bVar = (C76168b) ((C76754b) C86312j.m106911c(C76754b.class)).R50();
                int delete = bVar.f223157c.delete("addr_upload2", (String) null, (String[]) null);
                Log.m105918d("MicroMsg.AddrUploadStorage", "delete addr_upload2");
                if (delete > 0) {
                    bVar.doNotify(5, bVar, (Object) null);
                }
                Class cls = C75700k0.class;
                HashSet hashSet = new HashSet();
                Iterator it4 = ((ArrayList) ((C72987n3) ((C75700k0) C86709a0.m107533q(cls)).mo96104vj()).mo101186Lo(0)).iterator();
                while (it4.hasNext()) {
                    C72985m3 m3Var = (C72985m3) it4.next();
                    int i9 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Rv0(m3Var.field_msgContent).f212681g;
                    if (i9 == 10 || i9 == 11) {
                        hashSet.add(m3Var.field_talker);
                    }
                }
                Log.m105918d("MicroMsg.FriendLogic", "deleteMobileFMessage, delete fmsg and fconv, talker size = " + hashSet.size());
                Iterator it5 = hashSet.iterator();
                while (it5.hasNext()) {
                    C76186t.m91535c(0, (String) it5.next());
                }
                Log.m105918d("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  mobile unbinded");
            }
            this.f223162e.onSceneEnd(i4, i5, str2, this);
            return;
        }
        Log.m105920e("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  errType:" + i4 + " errCode:" + i5);
        if (i4 == 4 && i5 == -240) {
            Log.m105925i("MicroMsg.NetSceneBindOpMobile", "summerauth bindop MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", Integer.valueOf(this.f223163f));
            int i15 = this.f223163f - 1;
            this.f223163f = i15;
            if (i15 <= 0) {
                this.f223162e.onSceneEnd(3, -1, "", this);
            } else {
                doScene(dispatcher(), this.f223162e);
            }
        } else {
            this.f223162e.onSceneEnd(i4, i5, str2, this);
        }
    }

    public C76170j0(String str, int i, String str2, int i2, String str3, String str4) {
        this(str, i, str2, i2, str3);
        ((C77928fd) this.f223161d.f127055a.f127080a).f227367j = str4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bf, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r7) == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r7) == false) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C76170j0(java.lang.String r6, int r7, java.lang.String r8, int r9, java.lang.String r10) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.f223162e = r0
            r1 = 2
            r5.f223163f = r1
            r5.f223164g = r0
            r5.f223165h = r0
            ob0.c$b r2 = new ob0.c$b
            r2.<init>()
            te3.fd r3 = new te3.fd
            r3.<init>()
            r2.f127066a = r3
            te3.gd r3 = new te3.gd
            r3.<init>()
            r2.f127067b = r3
            java.lang.String r3 = "/cgi-bin/micromsg-bin/bindopmobile"
            r2.f127068c = r3
            r3 = 132(0x84, float:1.85E-43)
            r2.f127069d = r3
            r3 = 45
            r2.f127070e = r3
            r3 = 1000000045(0x3b9aca2d, float:0.0047238083)
            r2.f127071f = r3
            ob0.c r2 = r2.mo72403a()
            r5.f223161d = r2
            ob0.c$c r2 = r2.f127055a
            pe3.a r2 = r2.f127080a
            te3.fd r2 = (te3.C77928fd) r2
            r2.f227363f = r7
            r2.f227365h = r9
            r2.f227366i = r10
            java.lang.String r9 = r5.f223164g
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0070
            java.lang.String r9 = r5.f223165h
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 == 0) goto L_0x0070
            boolean r9 = com.tencent.p014mm.sdk.platformtools.ChannelUtil.isNokiaAol
            if (r9 == 0) goto L_0x005f
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r10 = 2131835111(0x7f1138e7, float:1.9303351E38)
            goto L_0x0066
        L_0x005f:
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r10 = 2131835110(0x7f1138e6, float:1.930335E38)
        L_0x0066:
            java.lang.String r9 = r9.getString(r10)
            r2.f227369o = r9
            java.lang.String r9 = qe3.C89625d.f257838d
            r2.f227370p = r9
        L_0x0070:
            java.lang.String r9 = "MicroMsg.NetSceneBindOpMobile"
            r10 = 1
            r3 = 4097(0x1001, float:5.741E-42)
            if (r6 == 0) goto L_0x009e
            int r4 = r6.length()
            if (r4 <= 0) goto L_0x009e
            if (r7 == r10) goto L_0x0086
            r4 = 4
            if (r7 == r4) goto L_0x0086
            r4 = 18
            if (r7 != r4) goto L_0x009e
        L_0x0086:
            boolean r7 = f40.C86709a0.m107522a()
            if (r7 == 0) goto L_0x0098
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            r7.mo119676J(r3, r6)
            goto L_0x00d8
        L_0x0098:
            java.lang.String r7 = "acc not ready"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r7)
            goto L_0x00d8
        L_0x009e:
            if (r7 == r1) goto L_0x00c3
            r1 = 25
            if (r7 == r1) goto L_0x00c3
            r1 = 19
            if (r7 != r1) goto L_0x00a9
            goto L_0x00c3
        L_0x00a9:
            r1 = 3
            if (r7 != r1) goto L_0x00d8
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            r1 = 6
            java.lang.Object r7 = r7.mo119684e(r1, r0)
            java.lang.String r7 = (java.lang.String) r7
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r0 != 0) goto L_0x00d8
        L_0x00c1:
            r6 = r7
            goto L_0x00d8
        L_0x00c3:
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            java.lang.Object r7 = r7.mo119684e(r3, r0)
            java.lang.String r7 = (java.lang.String) r7
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r0 != 0) goto L_0x00d8
            goto L_0x00c1
        L_0x00d8:
            r2.f227362e = r6
            r2.f227364g = r8
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r2.f227372r = r6
            int r6 = f223160i
            r2.f227360F = r6
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r7 = 0
            org.json.JSONObject r8 = r2.toJSON()
            r6[r7] = r8
            java.lang.String r7 = "req JSON=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hg0.C76170j0.<init>(java.lang.String, int, java.lang.String, int, java.lang.String):void");
    }
}
