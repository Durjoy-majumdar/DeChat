package eg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44665r4;
import com.tencent.p014mm.storage.C44667s4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75593t5;
import f40.C86709a0;
import f62.C75700k0;
import g62.C8235p;
import java.util.HashSet;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p196ln.C76708i;
import p823sg.C77710q;
import sf0.C48374j0;
import te3.C49829id;
import te3.C51018qv3;
import te3.C51163rv3;
import te3.C77939hd;

/* renamed from: eg0.b */
public class C75611b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f222117d;

    /* renamed from: e */
    public final C47350c f222118e;

    /* renamed from: f */
    public long f222119f;

    public C75611b(long j, String str, String str2, String str3, String str4, int i, boolean z) {
        byte[] bArr;
        this.f222119f = 0;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77939hd();
        bVar.f127067b = new C49829id();
        bVar.f127068c = "/cgi-bin/micromsg-bin/bindqq";
        bVar.f127069d = 144;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f222118e = a;
        this.f222119f = j;
        C77939hd hdVar = (C77939hd) a.f127055a.f127080a;
        hdVar.f227548d = new C77710q(j).f226490d;
        hdVar.f227549e = "";
        hdVar.f227550f = "";
        hdVar.f227551g = "";
        hdVar.f227552h = "";
        C51163rv3 rv32 = new C51163rv3();
        rv32.f141175d = "";
        rv32.f141176e = true;
        hdVar.f227554j = rv32;
        hdVar.f227553i = 1;
        if (z) {
            bArr = C86709a0.m107523b().mo121113k().mo182473c(j, str3);
        } else {
            bArr = C86709a0.m107523b().mo121113k().mo182474d(j, Util.getFullPasswordMD5(str), true);
        }
        C51018qv3 qv32 = new C51018qv3();
        qv32.mo73350k(bArr);
        hdVar.f227559r = qv32;
        String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(47, (Object) null));
        C51018qv3 qv33 = new C51018qv3();
        qv33.mo73350k(Util.decodeHexString(nullAsNil));
        hdVar.f227555n = qv33;
        Log.m105925i("MicroMsg.NetSceneBindQQ", "init opcode:%d qq:%d  wtbuf:%d img[%s,%s,%s] ksid:%s", Integer.valueOf(i), Long.valueOf(j), Integer.valueOf(Util.getLength(bArr)), str3, str2, str4, nullAsNil);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f222117d = nVar;
        return dispatch(gVar, this.f222118e, this);
    }

    public int getType() {
        return 144;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4;
        int i5 = i2;
        int i6 = i3;
        Class cls = C75700k0.class;
        C47350c cVar = this.f222118e;
        C77939hd hdVar = (C77939hd) cVar.f127055a.f127080a;
        C49829id idVar = (C49829id) cVar.f127056b.f127083a;
        byte[] d = C48374j0.m53715d(idVar.f135238s);
        boolean f = !Util.isNullOrNil(d) ? C86709a0.m107523b().mo121113k().mo182476f(new C77710q(hdVar.f227548d).longValue(), d) : false;
        if (f && C86709a0.m107522a()) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC, Boolean.TRUE);
        }
        Log.m105925i("MicroMsg.NetSceneBindQQ", "onGYNetEnd[%d,%d] wtret:%b wtRespBuf:%d imgsid:%s", Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(f), Integer.valueOf(Util.getLength(d)), idVar.f135226d);
        if (i5 == 0 && i6 == 0) {
            int i7 = C86709a0.m107535s().mo121142i().mo119688i(9, 0);
            C86709a0.m107535s().mo121142i().mo119676J(9, Integer.valueOf(hdVar.f227548d));
            if (i7 != 0) {
                C85801v1 i8 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_LAST_LOGIN_USERNAME_STRING;
                if (i8.mo119685f(aVar, "").equals(String.valueOf(i7))) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, C75592q0.m90789s());
                }
                Iterator it = ((HashSet) C75593t5.f222075c.mo105942e()).iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (String.valueOf(i7).equals(C75593t5.f222075c.mo105941d(str2, "login_user_name"))) {
                        C75593t5.f222075c.mo105946i(str2, "login_user_name", str2);
                    }
                }
            }
            if (hdVar.f227553i == 1) {
                C86709a0.m107535s().mo121142i().mo119676J(17, Integer.valueOf(idVar.f135228f));
            }
            C8235p V50 = ((C75700k0) C86709a0.m107533q(cls)).V50();
            String str3 = idVar.f135230h;
            boolean z = idVar.f135229g == 1;
            C44667s4 s4Var = (C44667s4) V50;
            s4Var.getClass();
            if (Util.isNullOrNil(str3)) {
                Log.m105920e("MicroMsg.RoleStorage", "insert role info failed: empty user");
            } else {
                C44665r4 Lo = s4Var.mo69816Lo(str3);
                if (Lo == null) {
                    s4Var.mo69818Yt(new C44665r4(str3, z, true, 2));
                    Log.m105918d("MicroMsg.RoleStorage", "insert new role, user=" + str3);
                } else {
                    Lo.mo69815d(z);
                    Lo.f121094a = 4;
                    s4Var.mo69819bD(Lo);
                }
            }
            int i9 = hdVar.f227548d;
            if (i9 != 0) {
                C8235p V502 = ((C75700k0) C86709a0.m107533q(cls)).V50();
                i4 = 3;
                ((C44667s4) V502).mo69817Ow("" + new C77710q(i9) + "@qqim", 3);
            } else {
                i4 = 3;
            }
            ((C76708i) C86312j.m106911c(C76708i.class)).mo106828Ux((long) i9, i4);
            C86709a0.m107535s().mo121142i().mo119676J(32, hdVar.f227549e);
            C86709a0.m107535s().mo121142i().mo119676J(33, hdVar.f227550f);
            String encodeHexString = Util.encodeHexString(C86709a0.m107523b().mo121113k().mo182472b(new C77710q(hdVar.f227548d).longValue()));
            Log.m105925i("MicroMsg.NetSceneBindQQ", "onGYNetEnd wtret:%b newa2key:%s ", Boolean.valueOf(f), Util.secPrint(encodeHexString));
            C86709a0.m107535s().mo121142i().mo119676J(72, encodeHexString);
            C86709a0.m107535s().mo121142i().mo119676J(46, Util.encodeHexString(C48374j0.m53715d(idVar.f135234o)));
            String encodeHexString2 = Util.encodeHexString(C48374j0.m53715d(hdVar.f227555n));
            C86709a0.m107535s().mo121142i().mo119676J(47, encodeHexString2);
            C86709a0.m107535s().f251803a.mo119664f(18, encodeHexString2);
            C86709a0.m107535s().mo121142i().mo119676J(-1535680990, idVar.f135232j);
        } else if (i5 == 4) {
            C86709a0.m107535s().mo121142i().mo119676J(32, "");
            C86709a0.m107535s().mo121142i().mo119676J(33, "");
        }
        if (hdVar.f227553i == 3 && i6 == -3) {
            i6 = 10000;
            Log.m105918d("MicroMsg.NetSceneBindQQ", "onGYNetEnd : retCode = 10000");
        }
        this.f222117d.onSceneEnd(i5, i6, str, this);
    }

    public C75611b(long j, String str, String str2, String str3, String str4, int i, String str5, String str6, boolean z) {
        this(j, str, str2, str3, str4, i, z);
        C77939hd hdVar = (C77939hd) this.f222118e.f127055a.f127080a;
        hdVar.f227557p = str5;
        hdVar.f227558q = str6;
    }
}
