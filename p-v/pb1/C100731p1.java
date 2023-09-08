package pb1;

import android.os.Message;
import com.tencent.p014mm.autogen.mmdata.rpt.FavSyncQualityStruct;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import di3.C86312j;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import p749xh.C66261f3;
import pe3.C89349b;
import qe3.C101126c1;
import sf0.C48374j0;
import te3.C101768d3;
import te3.C50886px;
import te3.C51226sd0;
import te3.C51379td0;
import wb1.C102421x;
import xb1.C102614d;
import xb1.C38479b;

/* renamed from: pb1.p1 */
public class C100731p1 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f295114d;

    /* renamed from: e */
    public C11385n f295115e = null;

    /* renamed from: f */
    public int f295116f = 1;

    /* renamed from: g */
    public C100732a f295117g = new C100732a();

    /* renamed from: h */
    public long f295118h = -1;

    /* renamed from: i */
    public boolean f295119i = false;

    /* renamed from: j */
    public final int f295120j;

    /* renamed from: n */
    public long f295121n;

    /* renamed from: pb1.p1$a */
    public class C100732a {

        /* renamed from: a */
        public LinkedList<C50886px> f295122a;

        /* renamed from: b */
        public MMHandler f295123b = new C100733a("MicroMsg.Fav.NetSceneFavSync");

        /* renamed from: pb1.p1$a$a */
        public class C100733a extends MMHandler {
            public C100733a(String str) {
                super(str);
            }

            public void handleMessage(Message message) {
                Class cls = C100718j1.class;
                LinkedList<C50886px> linkedList = C100732a.this.f295122a;
                boolean z = true;
                if (linkedList == null || linkedList.isEmpty()) {
                    C100731p1 p1Var = C100731p1.this;
                    C47350c cVar = p1Var.f295114d;
                    C51226sd0 sd02 = (C51226sd0) cVar.f127055a.f127080a;
                    C51379td0 td02 = (C51379td0) cVar.f127056b.f127083a;
                    byte[] c = C101126c1.m132546c(sd02.f141444e.f140574f.mo123703f(), td02.f142130f.f140574f.mo123703f());
                    if (c != null && c.length > 0) {
                        ((C38479b) ((C100718j1) C86312j.m106911c(cls)).W80()).mo61695qq(c);
                    }
                    sd02.f141444e = C48374j0.m53712a(c);
                    int i = td02.f142131g;
                    if ((sd02.f141443d & i) == 0) {
                        Log.m105925i("MicroMsg.Fav.NetSceneFavSync", "processEnd, minUpdateTime:%d", Long.valueOf(p1Var.f295118h));
                        C86709a0.m107535s().mo121142i().mo119676J(8217, 1);
                        if (p1Var.f295118h > 0) {
                            LinkedList<Integer> Lo = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142262Lo(p1Var.f295118h, -1);
                            if (Lo.size() > 0) {
                                p1Var.f295119i = true;
                                Log.m105925i("MicroMsg.Fav.NetSceneFavSync", "processEnd, start batch get list size:%d", Integer.valueOf(Lo.size()));
                                HashMap<Long, ArrayList<String>> hashMap = C100734q.f295126a;
                                if (C100725n1.f295091o.get() > 0) {
                                    Log.m105925i("MicroMsg.Fav.NetSceneFavSync", "now %d batch-get scene is doing", Integer.valueOf(C100725n1.f295091o.get()));
                                    C86709a0.m107529k().f251779b.mo123457c(402);
                                }
                                if (!C86709a0.m107524d().mo123461g(new C100725n1(Lo), 0)) {
                                    Log.m105928w("MicroMsg.Fav.NetSceneFavSync", "do scene BatchGetFav fail");
                                    C100725n1.m131805j1();
                                }
                            }
                        }
                        p1Var.f295115e.onSceneEnd(0, 0, "", p1Var);
                        return;
                    }
                    Log.m105925i("MicroMsg.Fav.NetSceneFavSync", "continue flag:%d", Integer.valueOf(i));
                    p1Var.doScene(p1Var.dispatcher(), p1Var.f295115e);
                    return;
                }
                C50886px first = C100732a.this.f295122a.getFirst();
                Log.m105918d("MicroMsg.Fav.NetSceneFavSync", "cmdId = " + first.f140037d);
                C100732a.this.f295122a.removeFirst();
                if (first.f140037d == 200) {
                    byte[] d = C48374j0.m53715d(first.f140038e);
                    if (d == null) {
                        Log.m105920e("MicroMsg.Fav.NetSceneFavSync", "docmd: no protobuf found.");
                        sendEmptyMessage(0);
                        return;
                    }
                    C100731p1 p1Var2 = C100731p1.this;
                    p1Var2.getClass();
                    try {
                        Log.m105925i("MicroMsg.Fav.NetSceneFavSync", "processAddItem bufSize=%d", Integer.valueOf(d.length));
                        C101768d3 d3Var = (C101768d3) new C101768d3().parseFrom(d);
                        if (d3Var == null) {
                            Log.m105920e("MicroMsg.Fav.NetSceneFavSync", "klem processAddItem favitem null");
                        } else {
                            Log.m105925i("MicroMsg.Fav.NetSceneFavSync", "klem processAddItem id:%d, flag:%d, updateSeq:%d, updateTime:%d", Integer.valueOf(d3Var.f298079d), Integer.valueOf(d3Var.f298081f), Integer.valueOf(d3Var.f298083h), Integer.valueOf(d3Var.f298082g));
                            if ((d3Var.f298081f & 1) != 0) {
                                C100734q.m131860m(((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142273qq((long) d3Var.f298079d), false, (Runnable) null, 2);
                            } else {
                                long j = p1Var2.f295118h;
                                if (j < 0 || ((long) d3Var.f298082g) < j) {
                                    p1Var2.f295118h = (long) d3Var.f298082g;
                                }
                                C100755z qq = ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).mo142273qq((long) d3Var.f298079d);
                                if (qq == null) {
                                    qq = new C100755z();
                                    qq.field_updateTime = ((long) d3Var.f298082g) * 1000;
                                } else {
                                    z = false;
                                }
                                qq.field_id = d3Var.f298079d;
                                int i2 = d3Var.f298083h;
                                qq.field_updateSeq = i2;
                                if (qq.field_localSeq == i2) {
                                    qq.field_updateTime = ((long) d3Var.f298082g) * 1000;
                                }
                                qq.field_flag = d3Var.f298081f;
                                qq.field_type = d3Var.f298080e;
                                if (z) {
                                    qq.field_localId = System.currentTimeMillis();
                                    ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).insert(qq);
                                } else {
                                    ((C102614d) ((C100718j1) C86312j.m106911c(cls)).mo128199Jq()).update(qq, C66261f3.COL_LOCALID);
                                }
                            }
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.Fav.NetSceneFavSync", e, "", new Object[0]);
                    }
                    sendEmptyMessage(0);
                }
            }
        }

        public C100732a() {
        }
    }

    public C100731p1(int i) {
        Log.m105924i("MicroMsg.Fav.NetSceneFavSync", "NetSceneFavSync");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51226sd0();
        bVar.f127067b = new C51379td0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/favsync";
        bVar.f127069d = 400;
        bVar.f127070e = 195;
        bVar.f127071f = 1000000195;
        bVar.f127072g = false;
        this.f295114d = bVar.mo72403a();
        this.f295120j = i;
        mo140163j1();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f295115e = nVar;
        C51226sd0 sd02 = (C51226sd0) this.f295114d.f127055a.f127080a;
        sd02.f141443d = this.f295116f;
        byte[] Lo = ((C38479b) ((C100718j1) C86312j.m106911c(C100718j1.class)).W80()).mo61693Lo();
        if (this.f295116f == 2) {
            Lo = new byte[0];
        }
        sd02.f141444e = C48374j0.m53712a(Lo);
        return dispatch(gVar, this.f295114d, this);
    }

    public int getType() {
        return 400;
    }

    /* renamed from: j1 */
    public final void mo140163j1() {
        int i = this.f295120j;
        HashSet<String> hashSet = C100745t.f295154a;
        C100698b0 b0Var = C100698b0.f295038a;
        long currentTimeMillis = System.currentTimeMillis();
        Log.m105924i("MircoMsg.FavReport", "[createReportSession] create report session = " + currentTimeMillis);
        b0Var.mo140130f(2, currentTimeMillis);
        b0Var.mo140129e().f265540d = i;
        Log.m105924i("MicroMsg.FavApiUtil", "[startSyncReportEnv] scene = " + i + ", session = " + currentTimeMillis);
        this.f295121n = System.currentTimeMillis();
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Class cls = C100718j1.class;
        Log.m105924i("MicroMsg.Fav.NetSceneFavSync", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        if (((C102421x) ((C100718j1) C86312j.m106911c(cls)).th0()).f301670g) {
            Log.m105928w("MicroMsg.Fav.NetSceneFavSync", "sending item, skip sync onGYNetEnd");
            this.f295115e.onSceneEnd(i2, i3, str, this);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f295121n;
        boolean z = i2 == 0 && i3 == 0;
        String str2 = new String(((C38479b) ((C100718j1) C86312j.m106911c(cls)).W80()).mo61693Lo());
        HashSet<String> hashSet = C100745t.f295154a;
        Log.m105924i("MicroMsg.FavApiUtil", "[reportFavSyncQualityStepFirst] syncKey = " + str2 + ", errorType = " + i2 + ", errorCode = " + i3 + ", cost = " + currentTimeMillis + ", success = " + z);
        FavSyncQualityStruct e = C100698b0.f295038a.mo140129e();
        if (z) {
            e.f265542f = 0;
        } else {
            e.f265542f = -1;
            e.f265543g = i2;
            e.f265544h = i3;
        }
        e.f265546j = currentTimeMillis;
        if (currentTimeMillis >= ((long) 30000)) {
            e.f265545i = -1;
        } else {
            e.f265545i = 0;
        }
        if (i2 == 0 && i3 == 0) {
            C47350c cVar = (C47350c) uVar;
            C51379td0 td02 = (C51379td0) cVar.f127056b.f127083a;
            LinkedList<C50886px> linkedList = td02.f142129e.f140594e;
            if (linkedList == null || linkedList.size() <= 0) {
                C89349b bVar = td02.f142130f.f140574f;
                if (bVar != null) {
                    byte[] c = C101126c1.m132546c(((C51226sd0) cVar.f127055a.f127080a).f141444e.f140574f.mo123703f(), bVar.mo123703f());
                    if (c != null && c.length > 0) {
                        ((C38479b) ((C100718j1) C86312j.m106911c(cls)).W80()).mo61695qq(c);
                    }
                } else {
                    Log.m105920e("MicroMsg.Fav.NetSceneFavSync", "merge key should not be null");
                }
                C86709a0.m107535s().mo121142i().mo119676J(8217, 1);
                this.f295115e.onSceneEnd(i2, i3, str, this);
                return;
            }
            Log.m105924i("MicroMsg.Fav.NetSceneFavSync", "cmdList size:" + linkedList.size());
            if (this.f295116f != 2) {
                C100732a aVar = this.f295117g;
                aVar.f295122a = linkedList;
                if (linkedList.size() > 0) {
                    C100731p1.this.getClass();
                    C86709a0.m107524d().mo123460f(new C47452q1());
                }
                aVar.f295123b.sendEmptyMessage(0);
                return;
            }
            this.f295115e.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f295115e.onSceneEnd(i2, i3, str, this);
    }

    public int securityLimitCount() {
        return 50;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }

    public boolean uniqueInNetsceneQueue() {
        return true;
    }

    public C100731p1(int i, int i2) {
        Log.m105925i("MicroMsg.Fav.NetSceneFavSync", "NetSceneFavSync %d", Integer.valueOf(i));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51226sd0();
        bVar.f127067b = new C51379td0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/favsync";
        bVar.f127069d = 400;
        bVar.f127070e = 195;
        bVar.f127071f = 1000000195;
        bVar.f127072g = false;
        this.f295114d = bVar.mo72403a();
        this.f295116f = i;
        this.f295120j = i2;
        mo140163j1();
    }
}
