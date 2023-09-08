package qg2;

import android.net.Uri;
import android.util.Base64;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.ForwardUpdateMsgIdEvent;
import com.tencent.p014mm.autogen.events.RecordMsgNetSceneEvent;
import com.tencent.p014mm.autogen.events.UpdateFailedMsgIdEvent;
import com.tencent.p014mm.autogen.events.WxFileIndexDirtyEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.modelcdntran.C55385t;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.plugin.fav.p047ui.C93594f1;
import com.tencent.p014mm.pluginsdk.model.app.C96776s;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.xweb.file.XVFSFile;
import d62.C7250m;
import di3.C86312j;
import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C75569c4;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import hc3.C27313m;
import hc3.C98337a;
import hc3.C98340b0;
import hc3.C98342c1;
import hc3.C98345e0;
import hc3.C98348g;
import hc3.C98351h0;
import hc3.C98355i1;
import hc3.C98356j;
import hc3.C98359k0;
import hc3.C98361l1;
import hc3.C98363n0;
import hc3.C98365o1;
import hc3.C98366p;
import hc3.C98369r1;
import hc3.C98370s;
import hc3.C98373u1;
import hc3.C98374v;
import hc3.C98377x1;
import hc3.C98378y;
import hc3.C98381z0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import m02.C46940b;
import o90.C100308d;
import oa1.C117731d;
import ob0.C117747y;
import og2.C100336e;
import og2.C100344n;
import og2.C100346q;
import og2.C77006j;
import p158gt.C98201k;
import p196ln.C76706g;
import p206nj.C76861g;
import p215oo.C77032h;
import p227rn.C101397o;
import p478cp.C45137b;
import p478cp.C45138c;
import p654pw.C100971c;
import p663qo.C63287k;
import p740wo.C53193b;
import p749xh.C66261f3;
import p763ym.C53543s;
import p823sg.C101611g;
import p823sg.C90193h;
import pe3.C89349b;
import rx3.C13598b0;
import se3.C77685c;
import sx3.C64197v;
import te3.C101755ad0;
import te3.C101756ae0;
import te3.C101793jd0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101841sc0;
import te3.C101846tc0;
import te3.C101850ud0;
import te3.C101871zc0;
import te3.C64581nk1;
import te3.C64623p81;
import te3.C64628pk1;
import te3.C64659qk1;
import te3.C64682rk1;
import te3.C64719t23;
import te3.C64730tk1;
import te3.C64831xk1;
import te3.C77911cd0;
import te3.C77915dp3;
import te3.C90431pc0;
import tf3.C37075s;
import tf3.C37077u;
import z04.C112551y;
import z04.C119027c;

/* renamed from: qg2.j0 */
public class C101147j0 {

    /* renamed from: a */
    public static final C101611g<Integer, C77915dp3> f296056a = new C100308d(32);

    /* renamed from: qg2.j0$a */
    public class C101148a implements C45138c.C45139a {

        /* renamed from: a */
        public final /* synthetic */ long f296057a;

        /* renamed from: b */
        public final /* synthetic */ C72963f4 f296058b;

        /* renamed from: c */
        public final /* synthetic */ String f296059c;

        /* renamed from: d */
        public final /* synthetic */ C68070l.C68072b f296060d;

        /* renamed from: e */
        public final /* synthetic */ C77915dp3 f296061e;

        /* renamed from: f */
        public final /* synthetic */ C101801kd0 f296062f;

        /* renamed from: g */
        public final /* synthetic */ boolean f296063g;

        /* renamed from: h */
        public final /* synthetic */ C72963f4 f296064h;

        public C101148a(long j, C72963f4 f4Var, String str, C68070l.C68072b bVar, C77915dp3 dp32, C101801kd0 kd02, boolean z, C72963f4 f4Var2) {
            this.f296057a = j;
            this.f296058b = f4Var;
            this.f296059c = str;
            this.f296060d = bVar;
            this.f296061e = dp32;
            this.f296062f = kd02;
            this.f296063g = z;
            this.f296064h = f4Var2;
        }

        /* renamed from: a */
        public void mo70647a(int i, String str, List<C45138c.C45141c> list) {
            C101801kd0 kd02;
            String str2;
            String str3;
            int i2 = i;
            String str4 = str;
            if (i2 == 0) {
                C101147j0.m132624e(this.f296057a, this.f296058b.getMsgId(), this.f296059c, this.f296060d, this.f296061e, this.f296062f, this.f296063g);
            } else if (-3200 == i2) {
                Log.m105929w("MicroMsg.RecordMsgLogic", "errcode equals %s, errMsg:%s, msgId:%s, toUser:%s", Integer.valueOf(i), str4, Long.valueOf(this.f296057a), this.f296059c);
                C101147j0.m132620a(this.f296057a, this.f296064h);
                long j = this.f296057a;
                long msgId = this.f296058b.getMsgId();
                C72963f4 f4Var = this.f296064h;
                String str5 = this.f296059c;
                boolean z = this.f296063g;
                Class cls = C100336e.class;
                C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
                C101144i u2 = C101147j0.m132640u(u);
                if (u2 != null) {
                    str2 = u2.f296047a;
                    str3 = u2.f296048b;
                    kd02 = u2.f296049c;
                } else {
                    str3 = "";
                    str2 = str3;
                    kd02 = null;
                }
                C100346q qVar = new C100346q();
                qVar.field_msgId = j;
                qVar.field_oriMsgId = msgId;
                qVar.field_toUser = str5;
                qVar.field_title = u.f195570f;
                qVar.field_desc = str2;
                qVar.field_dataProto = kd02;
                qVar.field_type = 0;
                qVar.field_favFrom = str3;
                qVar.field_localId = new Random().nextInt(2147483645) + 1;
                Log.m105925i("MicroMsg.RecordMsgLogic", "summerrecord Normal RecordMsgStorage insert ret:%b, id:%d, oriMsgId:%d localid:%d", Boolean.valueOf(((C101143h0) ((C100336e) C86312j.m106911c(cls)).k10()).insert(qVar)), Long.valueOf(j), Long.valueOf(msgId), Integer.valueOf(qVar.field_localId));
                ((C101153n0) ((C100336e) C86312j.m106911c(cls)).mo139409NS()).mo140599f(qVar, z);
                ((C100971c) C86312j.m106911c(C100971c.class)).rm0(this.f296057a, this.f296059c);
            } else {
                this.f296064h.mo100991d(5);
                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(this.f296057a, this.f296064h);
                C101147j0.m132621b(this.f296059c, str4);
            }
        }
    }

    /* renamed from: A */
    public static String m132608A(long j) {
        return "sub" + (j / 50000);
    }

    /* renamed from: B */
    public static void m132609B(C77685c cVar, C101834rc0 rc02, int i) {
        String str = rc02.f299286W;
        if (C86013q1.m106450k(str)) {
            cVar.f226462f = str;
        } else {
            cVar.f226463g = i;
        }
    }

    /* renamed from: C */
    public static String m132610C(String str) {
        return str + "_t";
    }

    /* renamed from: D */
    public static String m132611D(C101834rc0 rc02, long j, int i) {
        if (rc02 == null || Util.isNullOrNil(rc02.f299280T)) {
            return "";
        }
        String i2 = new C86009m1(m132634o(j, true), m132639t(m132610C(rc02.f299280T), i)).mo119971i();
        VFSStrategy.m163779g(i2, -1, 3, false);
        return i2;
    }

    /* renamed from: E */
    public static boolean m132612E(String str, long j, boolean z, String str2) {
        if (!C45628s0.m50745J(str)) {
            return false;
        }
        RecordMsgNetSceneEvent recordMsgNetSceneEvent = new RecordMsgNetSceneEvent();
        RecordMsgNetSceneEvent.C67771a aVar = recordMsgNetSceneEvent.f193874d;
        aVar.f193875a = j;
        aVar.f193876b = z;
        aVar.f193877c = Util.nullAs(str2, "");
        recordMsgNetSceneEvent.publish();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        r0 = m132613F(r1.f227155f, r5);
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m132613F(java.util.List<te3.C101834rc0> r4, boolean r5) {
        /*
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L_0x0005:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x004d
            java.lang.Object r1 = r4.next()
            te3.rc0 r1 = (te3.C101834rc0) r1
            int r2 = r1.f299258I
            if (r5 == 0) goto L_0x002b
            r3 = 17
            if (r2 != r3) goto L_0x002b
            java.lang.String r1 = r1.f299326s1
            te3.dp3 r1 = m132643x(r1)
            if (r1 != 0) goto L_0x0022
            goto L_0x0005
        L_0x0022:
            java.util.LinkedList<te3.rc0> r0 = r1.f227155f
            boolean r0 = m132613F(r0, r5)
            if (r0 == 0) goto L_0x0005
            goto L_0x004d
        L_0x002b:
            java.lang.String r2 = r1.f299325s
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x004c
            java.lang.String r2 = r1.f299305h
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x004c
            java.lang.String r2 = r1.f299342z1
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x004c
            java.lang.String r1 = r1.f299334w1
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x004c
            goto L_0x0005
        L_0x004c:
            r0 = 1
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101147j0.m132613F(java.util.List, boolean):boolean");
    }

    /* renamed from: G */
    public static boolean m132614G(C101834rc0 rc02, long j) {
        Uri n = C116299g2.m163858n(m132636q(rc02, j, 1));
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!l.mo177810a()) {
            return false;
        }
        return l.f348991a.mo119948x(l.f348992b);
    }

    /* renamed from: H */
    public static List<C45138c.C45140b> m132615H(long j, String str, C101801kd0 kd02) {
        List<C45138c.C45140b> synchronizedList = Collections.synchronizedList(new ArrayList());
        if (kd02 != null) {
            Iterator<C101834rc0> it = kd02.f298618f.iterator();
            while (it.hasNext()) {
                C101834rc0 next = it.next();
                if (next.f299276R > 26214400) {
                    C45138c.C45140b bVar = new C45138c.C45140b();
                    String str2 = next.f299284V;
                    String q = C86013q1.m106456q(str2);
                    bVar.f122415f = str2;
                    bVar.f122416g = str;
                    bVar.f122414e = next.f299276R;
                    bVar.f122413d = next.f299262K;
                    if (!Util.isNullOrNil(next.f299266M)) {
                        q = next.f299266M;
                    }
                    bVar.f122410a = q;
                    bVar.f122411b = next.f299329u;
                    bVar.f122412c = next.f299297d;
                    synchronizedList.add(bVar);
                }
            }
        }
        return synchronizedList;
    }

    /* JADX WARNING: type inference failed for: r14v0 */
    /* JADX WARNING: type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r14v2 */
    /* renamed from: I */
    public static int m132616I(String str, String str2, C72963f4 f4Var, boolean z) {
        Iterator<String> it;
        String str3;
        Class cls;
        int i;
        C72963f4 f4Var2 = f4Var;
        Class cls2 = C98201k.class;
        int i2 = -1;
        if (Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.RecordMsgLogic", "send record msg error, touser is null");
            return -1;
        } else if (f4Var2 == null || Util.isNullOrNil(f4Var.getContent())) {
            Log.m105928w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo error");
            return -1;
        } else {
            ? r142 = 1;
            if (1 == f4Var.getStatus()) {
                Log.m105928w("MicroMsg.RecordMsgLogic", "send record msg error, msginfo is sending");
                return -1;
            }
            Iterator<String> it4 = Util.stringsToList(str.split(",")).iterator();
            while (it4.hasNext()) {
                String next = it4.next();
                Object[] objArr = new Object[3];
                objArr[0] = next;
                objArr[r142] = Long.valueOf(f4Var.getMsgId());
                objArr[2] = Integer.valueOf(f4Var.getStatus());
                Log.m105925i("MicroMsg.RecordMsgLogic", "send recordMsg, toUser[%s] msgId[%d], msgType[%d]", objArr);
                String d = C101164q0.m132678d(3, next, r142, C75604z3.m90849u(f4Var.getContent()));
                C68070l.C68072b u = C68070l.C68072b.m80422u(d, (String) null);
                if (u == null) {
                    Log.m105928w("MicroMsg.RecordMsgLogic", "send record msg error, parse appmsg error");
                    return i2;
                }
                C77915dp3 x = m132643x(u.f195571f0);
                if (x == null) {
                    Log.m105928w("MicroMsg.RecordMsgLogic", "send record msg error, parse record data error");
                    return i2;
                }
                C72963f4 f4Var3 = new C72963f4();
                if (!Util.isNullOrNil(f4Var.mo108765s2())) {
                    String bD = ((C92839m) ((C98201k) C86312j.m106911c(cls2)).mo137277xi()).mo127179bD(Util.readFromFile(((C92839m) ((C98201k) C86312j.m106911c(cls2)).mo137277xi()).v10(f4Var.mo108765s2(), r142)));
                    Log.m105918d("MicroMsg.RecordMsgLogic", C76861g.m92660c() + " thumbData from msg MsgInfo path:" + bD);
                    if (!Util.isNullOrNil(bD)) {
                        f4Var3.mo108739S2(bD);
                    }
                }
                f4Var3.mo108732L2(d);
                f4Var3.mo101012p4(C75569c4.m90680m(C75569c4.m90685r(f4Var2.f230724G)));
                f4Var3.mo100991d(r142);
                f4Var3.mo108749c3(next);
                f4Var3.mo108733M2(C75604z3.m90843o(next));
                f4Var3.mo108740T2(r142);
                f4Var3.setType(49);
                ((C77032h) C86312j.m106911c(C77032h.class)).mo107359RF(f4Var3, f4Var.getMsgId());
                long my02 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var3);
                Log.m105918d("MicroMsg.RecordMsgLogic", C76861g.m92660c() + " msginfo insert id: " + my02);
                if (my02 < 0) {
                    Log.m105920e("MicroMsg.RecordMsgLogic", C76861g.m92660c() + "insert msg failed :" + my02);
                    return 0 - C76861g.m92658a();
                }
                Log.m105924i("MicroMsg.RecordMsgLogic", C76861g.m92658a() + " new msg inserted to db , local id = " + my02);
                f4Var3.setMsgId(my02);
                m132632m(Long.valueOf(f4Var.getMsgId()), Long.valueOf(my02), next);
                UpdateFailedMsgIdEvent updateFailedMsgIdEvent = new UpdateFailedMsgIdEvent();
                updateFailedMsgIdEvent.f193982d.f193983a = f4Var.getMsgId();
                updateFailedMsgIdEvent.f193982d.f193984b = my02;
                updateFailedMsgIdEvent.publish();
                C68070l lVar = new C68070l();
                lVar.field_xml = f4Var3.getContent();
                lVar.field_title = u.f195570f;
                lVar.field_type = u.f195582i;
                lVar.field_description = u.f195574g;
                lVar.field_msgId = my02;
                lVar.field_appId = u.f195562d;
                ((C96776s) ((C53543s) C86312j.m106911c(C53543s.class)).mo74023HM()).mo135039jo(lVar);
                if (m132613F(x.f227155f, z)) {
                    C101801kd0 kd02 = new C101801kd0();
                    kd02.f298618f.addAll(x.f227155f);
                    List<C45138c.C45140b> H = m132615H(my02, next, kd02);
                    if (H.size() > 0) {
                        cls = cls2;
                        C72963f4 f4Var4 = f4Var3;
                        C101801kd0 kd03 = kd02;
                        str3 = next;
                        it = it4;
                        i = 0;
                        C86709a0.m107524d().mo123460f((C117747y) ((C45137b) C86312j.m106911c(C45137b.class)).mo62458tK(H, new C101148a(my02, f4Var, next, u, x, kd03, z, f4Var4)));
                    } else {
                        str3 = next;
                        cls = cls2;
                        it = it4;
                        i = 0;
                        m132624e(my02, f4Var.getMsgId(), str3, u, x, kd02, z);
                    }
                } else {
                    str3 = next;
                    cls = cls2;
                    it = it4;
                    i = 0;
                    Log.m105918d("MicroMsg.RecordMsgLogic", "do not check upload, directly send msg");
                    ((C77006j) C86312j.m106911c(C77006j.class)).mo107330Uc(my02);
                }
                if (!Util.isNullOrNil(str2)) {
                    String str4 = str3;
                    C7250m.m7431a().mo136257Tm(str4, str2, C45628s0.m50810y(str3), i);
                } else {
                    String str5 = str2;
                }
                it4 = it;
                f4Var2 = f4Var;
                cls2 = cls;
                i2 = -1;
                r142 = 1;
            }
            return 0;
        }
    }

    /* renamed from: J */
    public static String m132617J(String str, String str2, String str3, C101801kd0 kd02, List<C101834rc0> list) {
        C64719t23 r;
        C90431pc0 b;
        C101850ud0 t;
        C101793jd0 s;
        C101755ad0 q;
        C64581nk1 j;
        C64659qk1 m;
        C64730tk1 o;
        C64730tk1 f;
        C64831xk1 n;
        C64623p81 l;
        C64682rk1 k;
        C101756ae0 ae02;
        C101755ad0 p;
        C101871zc0 zc02;
        C101846tc0 tc02;
        String str4;
        C68097n Lo;
        C101801kd0 kd03 = kd02;
        C98381z0 z0Var = new C98381z0();
        z0Var.mo54577L(Util.nullAs(str, ""));
        z0Var.mo54574I(Util.nullAs(str2, ""));
        z0Var.mo54710X(String.valueOf(System.currentTimeMillis()));
        for (C101834rc0 next : list) {
            List<C27313m> list2 = z0Var.f288420m;
            Class cls = C46940b.class;
            C87412m.m108594g(next, "<this>");
            C27313m mVar = new C27313m();
            mVar.f75223h = next.f299258I;
            mVar.f75818s = next.f299291Y0;
            String str5 = next.f299280T;
            if (str5 == null) {
                str5 = "";
            }
            mVar.f75224i = str5;
            String str6 = next.f299308i1;
            if (str6 == null) {
                str6 = "";
            }
            mVar.f75820t = str6;
            mVar.f75821u = next.f299322q1;
            String str7 = next.f299274Q0;
            if (str7 == null) {
                str7 = "";
            }
            mVar.f75822v = str7;
            String str8 = next.f299262K;
            if (str8 == null) {
                str8 = "";
            }
            mVar.f75823w = str8;
            String str9 = next.f299297d;
            if (str9 == null) {
                str9 = "";
            }
            mVar.f75221f = str9;
            String str10 = next.f299301f;
            if (str10 == null) {
                str10 = "";
            }
            mVar.f75222g = str10;
            String str11 = next.f299305h;
            if (str11 == null) {
                str11 = "";
            }
            mVar.f75225j = str11;
            mVar.f75824x = next.f299316o;
            mVar.f75825y = next.f299321q;
            String str12 = next.f299325s;
            if (str12 == null) {
                str12 = "";
            }
            mVar.f75229n = str12;
            String str13 = next.f299309j;
            if (str13 == null) {
                str13 = "";
            }
            mVar.f75226k = str13;
            String str14 = next.f299329u;
            if (str14 == null) {
                str14 = "";
            }
            mVar.f75230o = str14;
            mVar.f75826z = next.f299333w;
            mVar.f75774A = next.f299338y;
            String str15 = next.f299242A;
            if (str15 == null) {
                str15 = "";
            }
            mVar.f75775B = str15;
            String str16 = next.f299246C;
            if (str16 == null) {
                str16 = "";
            }
            mVar.f75776C = str16;
            String str17 = next.f299250E;
            if (str17 == null) {
                str17 = "";
            }
            mVar.f75777D = str17;
            String str18 = next.f299254G;
            if (str18 == null) {
                str18 = "";
            }
            mVar.f75233r = str18;
            String str19 = next.f299266M;
            if (str19 == null) {
                str19 = "";
            }
            mVar.f75231p = str19;
            String str20 = next.f299271P;
            if (str20 == null) {
                str20 = "";
            }
            mVar.f75778E = str20;
            mVar.f75232q = next.f299276R;
            String str21 = next.f299288X;
            if (str21 == null) {
                str21 = "";
            }
            mVar.f75227l = str21;
            String str22 = next.f299292Z;
            if (str22 == null) {
                str22 = "";
            }
            mVar.f75779F = str22;
            mVar.f75228m = next.f299336x0;
            String str23 = next.f299340y1;
            if (str23 == null) {
                str23 = "";
            }
            mVar.f75796W = str23;
            String str24 = next.f299337x1;
            if (str24 == null) {
                str24 = "";
            }
            mVar.f75797X = str24;
            String str25 = next.f299342z1;
            if (str25 == null) {
                str25 = "";
            }
            mVar.f75798Y = str25;
            String str26 = next.f299243A1;
            if (str26 == null) {
                str26 = "";
            }
            mVar.f75800a0 = str26;
            String str27 = next.f299334w1;
            if (str27 == null) {
                str27 = "";
            }
            mVar.f75799Z = str27;
            String str28 = next.f299279S0;
            if (str28 == null) {
                str28 = "";
            }
            mVar.f75780G = str28;
            String str29 = next.f299294a1;
            if (str29 == null) {
                str29 = "";
            }
            mVar.f75781H = str29;
            String str30 = next.f299298d1;
            if (str30 == null) {
                str30 = "";
            }
            mVar.f75782I = str30;
            String str31 = next.f299245B1;
            if (str31 == null) {
                str31 = "";
            }
            mVar.f75783J = str31;
            String str32 = next.f299247C1;
            if (str32 == null) {
                str32 = "";
            }
            mVar.f75784K = str32;
            String str33 = next.f299302f1;
            if (str33 == null) {
                str33 = "";
            }
            mVar.f75785L = str33;
            mVar.f75786M = C101151l0.m132648a(next);
            String str34 = next.f299311k1;
            if (str34 == null) {
                str34 = "";
            }
            mVar.f75787N = str34;
            String str35 = next.f299251E1;
            if (str35 == null) {
                str35 = "";
            }
            mVar.f75788O = str35;
            String str36 = next.f299255G1;
            if (str36 == null) {
                str36 = "";
            }
            mVar.f75789P = str36;
            String str37 = next.f299326s1;
            if (str37 != null) {
                if (!(str37.length() > 0)) {
                    str37 = null;
                }
                if (str37 != null) {
                    C98381z0 z0Var2 = new C98381z0();
                    z0Var2.mo141099d(str37);
                    C98377x1 x1Var = new C98377x1();
                    x1Var.mo137668B(z0Var2);
                    mVar.mo54918D1(x1Var);
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            String str38 = next.f299259I1;
            if (str38 == null) {
                str38 = "";
            }
            mVar.f75791R = str38;
            mVar.f75792S = next.f299263K1;
            C101841sc0 sc02 = next.f299296c1;
            if (!(sc02 == null || (tc02 = sc02.f299405d) == null)) {
                String str39 = tc02.f299533w;
                if (str39 == null) {
                    str39 = "";
                }
                mVar.f75793T = str39;
                String str40 = tc02.f299535y;
                if (str40 == null) {
                    str40 = "";
                }
                mVar.mo55013x1(str40);
                String b2 = tc02.mo141301b();
                if (b2 == null) {
                    b2 = "";
                }
                mVar.mo54972d1(b2);
                if (C117731d.m166007c().mo182440a(new C37077u()) == 1) {
                    C98366p pVar = new C98366p();
                    boolean z = tc02.f299520g;
                    if (z && tc02.f299526p) {
                        if (C87412m.m108589b(tc02.mo141302d(), tc02.mo141304k())) {
                            str4 = tc02.mo141302d();
                            C87412m.m108593f(str4, "{\n                    it…romUser\n                }");
                        } else {
                            str4 = tc02.mo141304k();
                            C87412m.m108593f(str4, "{\n                    it…hatName\n                }");
                        }
                        String cE = ((C46940b) C86312j.m106911c(cls)).mo72126cE(str4, 3);
                        if (cE == null) {
                            cE = "";
                        }
                        pVar.mo55079F(cE);
                    } else if (z) {
                        str4 = tc02.mo141302d();
                        C87412m.m108593f(str4, "item.fromUser");
                        String cE2 = ((C46940b) C86312j.m106911c(cls)).mo72126cE(str4, 3);
                        if (cE2 == null) {
                            cE2 = "";
                        }
                        pVar.mo55079F(cE2);
                    } else if (tc02.f299526p) {
                        str4 = tc02.mo141304k();
                        C87412m.m108593f(str4, "item.realChatName");
                        String cE3 = ((C46940b) C86312j.m106911c(cls)).mo72126cE(str4, 3);
                        if (cE3 == null) {
                            cE3 = "";
                        }
                        pVar.mo55079F(cE3);
                    } else if (tc02.f299516E) {
                        String jk = ((C46940b) C86312j.m106911c(cls)).mo72127jk(tc02.mo141303f(), 3);
                        if (jk == null) {
                            jk = "";
                        }
                        String f2 = tc02.mo141303f();
                        if (f2 == null) {
                            f2 = "";
                        }
                        pVar.mo55079F(f2);
                        str4 = jk;
                    } else {
                        str4 = "";
                    }
                    if (!next.f299249D1 && (!C112551y.m153811k(str4)) && (Lo = ((C68098o) ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()).mo93607Lo(str4)) != null) {
                        String f3 = Lo.mo93597f();
                        if (f3 == null) {
                            f3 = "";
                        }
                        mVar.mo54926H1(f3);
                        C13598b0 b0Var2 = C13598b0.f38549a;
                    }
                    mVar.mo54982i1(pVar);
                } else {
                    C98366p pVar2 = new C98366p();
                    boolean z2 = tc02.f299520g;
                    if (!z2 || !tc02.f299526p) {
                        if (z2) {
                            String d = tc02.mo141302d();
                            if (d == null) {
                                d = "";
                            }
                            pVar2.mo55078E(d);
                        } else if (tc02.f299526p) {
                            String k2 = tc02.mo141304k();
                            if (k2 == null) {
                                k2 = "";
                            }
                            pVar2.mo55080G(k2);
                        } else if (tc02.f299516E) {
                            String f4 = tc02.mo141303f();
                            if (f4 == null) {
                                f4 = "";
                            }
                            pVar2.mo55079F(f4);
                        }
                    } else if (C87412m.m108589b(tc02.mo141302d(), tc02.mo141304k())) {
                        String d2 = tc02.mo141302d();
                        if (d2 == null) {
                            d2 = "";
                        }
                        pVar2.mo55078E(d2);
                    } else if (C72996z1.m85820U5(tc02.mo141302d()) || ((C101397o) C86312j.m106911c(C101397o.class)).mo72605ip(tc02.mo141304k())) {
                        String k3 = tc02.mo141304k();
                        if (k3 == null) {
                            k3 = "";
                        }
                        pVar2.mo55080G(k3);
                    }
                    mVar.mo54982i1(pVar2);
                }
                C13598b0 b0Var3 = C13598b0.f38549a;
            }
            C101841sc0 sc03 = next.f299296c1;
            if (!(sc03 == null || (zc02 = sc03.f299406e) == null)) {
                C98342c1 c1Var = new C98342c1();
                String str41 = zc02.f299956j;
                if (str41 == null) {
                    str41 = "";
                }
                c1Var.mo54758Q(str41);
                c1Var.mo54759R(zc02.mo141327j());
                c1Var.mo54760S(zc02.mo141328k());
                c1Var.mo54767Z(zc02.mo141335r());
                String q2 = zc02.mo141334q();
                if (q2 == null) {
                    q2 = "";
                }
                c1Var.mo54763V(q2);
                String p2 = zc02.mo141333p();
                if (p2 == null) {
                    p2 = "";
                }
                c1Var.mo54766Y(p2);
                String m2 = zc02.mo141330m();
                if (m2 == null) {
                    m2 = "";
                }
                c1Var.mo54762U(m2);
                String l2 = zc02.mo141329l();
                if (l2 == null) {
                    l2 = "";
                }
                c1Var.mo54761T(l2);
                String n2 = zc02.mo141331n();
                if (n2 == null) {
                    n2 = "";
                }
                c1Var.mo54764W(n2);
                c1Var.mo54765X(zc02.mo141332o());
                c1Var.mo54757P(zc02.mo141326f());
                String b3 = zc02.mo141324b();
                if (b3 == null) {
                    b3 = "";
                }
                c1Var.mo54755N(b3);
                String d3 = zc02.mo141325d();
                if (d3 == null) {
                    d3 = "";
                }
                c1Var.mo54756O(d3);
                C13598b0 b0Var4 = C13598b0.f38549a;
                mVar.mo55015y1(c1Var);
            }
            C101841sc0 sc04 = next.f299296c1;
            if (!(sc04 == null || (ae02 = sc04.f299407f) == null)) {
                C98373u1 u1Var = new C98373u1();
                String b4 = ae02.mo141187b();
                if (b4 == null) {
                    b4 = "";
                }
                u1Var.mo55136L(b4);
                String f5 = ae02.mo141189f();
                if (f5 == null) {
                    f5 = "";
                }
                u1Var.mo55134J(f5);
                String l3 = ae02.mo141192l();
                if (l3 == null) {
                    l3 = "";
                }
                u1Var.mo55139O(l3);
                String m3 = ae02.mo141193m();
                if (m3 == null) {
                    m3 = "";
                }
                u1Var.mo55140P(m3);
                u1Var.mo55137M(ae02.mo141191k());
                u1Var.mo55133I(ae02.mo141188d());
                u1Var.mo55135K(ae02.mo141190j());
                C101841sc0 b5 = next.mo141251b();
                if (!(b5 == null || (p = b5.mo141290p()) == null)) {
                    C98348g gVar = new C98348g();
                    String str42 = p.f297854j;
                    if (str42 == null) {
                        str42 = "";
                    }
                    gVar.mo54856V(str42);
                    String str43 = p.f297855n;
                    if (str43 == null) {
                        str43 = "";
                    }
                    gVar.mo54855U(str43);
                    String str44 = p.f297856o;
                    if (str44 == null) {
                        str44 = "";
                    }
                    gVar.mo54854T(str44);
                    String str45 = p.f297859r;
                    if (str45 == null) {
                        str45 = "";
                    }
                    gVar.mo54847M(str45);
                    gVar.mo54850P(p.f297848d);
                    gVar.mo54852R(p.f297862u);
                    gVar.mo54851Q(p.f297849e);
                    gVar.mo54858X(p.f297850f);
                    gVar.mo54857W(p.f297851g);
                    gVar.mo54853S(p.f297852h);
                    gVar.mo54848N(p.f297853i);
                    gVar.mo54849O(p.f297857p);
                    C13598b0 b0Var5 = C13598b0.f38549a;
                    u1Var.mo55138N(gVar);
                }
                C13598b0 b0Var6 = C13598b0.f38549a;
                mVar.mo54968b2(u1Var);
            }
            C101841sc0 sc05 = next.f299296c1;
            if (!(sc05 == null || (k = sc05.mo141285k()) == null)) {
                C98374v vVar = new C98374v();
                String str46 = k.f185183d;
                if (str46 == null) {
                    str46 = "";
                }
                vVar.mo55185r0(str46);
                String str47 = k.f185191o;
                if (str47 == null) {
                    str47 = "";
                }
                vVar.mo55186s0(str47);
                vVar.mo55178k0(k.f185188i);
                String str48 = k.f185185f;
                if (str48 == null) {
                    str48 = "";
                }
                vVar.mo55184q0(str48);
                String str49 = k.f185184e;
                if (str49 == null) {
                    str49 = "";
                }
                vVar.mo55187t0(str49);
                String str50 = k.f185186g;
                if (str50 == null) {
                    str50 = "";
                }
                vVar.mo55167Z(str50);
                String str51 = k.f185187h;
                if (str51 == null) {
                    str51 = "";
                }
                vVar.mo55177j0(str51);
                vVar.mo55181n0(k.f185189j);
                vVar.mo55180m0(k.f185192p);
                vVar.mo55165X(k.f185196t);
                String str52 = k.f185197u;
                if (str52 == null) {
                    str52 = "";
                }
                vVar.mo55166Y(str52);
                LinkedList<C64628pk1> linkedList = k.f185190n;
                C87412m.m108593f(linkedList, "shareItem.mediaList");
                for (C64628pk1 pk12 : linkedList) {
                    List<C98378y> R = vVar.mo55159R();
                    C98378y yVar = new C98378y();
                    yVar.mo54694L(pk12.f184826d);
                    String str53 = pk12.f184827e;
                    if (str53 == null) {
                        str53 = "";
                    }
                    yVar.mo54696N(str53);
                    String str54 = pk12.f184828f;
                    if (str54 == null) {
                        str54 = "";
                    }
                    yVar.mo54695M(str54);
                    String str55 = pk12.f184832j;
                    if (str55 == null) {
                        str55 = "";
                    }
                    yVar.mo54692J(str55);
                    String str56 = pk12.f184833n;
                    if (str56 == null) {
                        str56 = "";
                    }
                    yVar.mo54691I(str56);
                    yVar.mo54698P(pk12.f184829g);
                    yVar.mo54693K(pk12.f184830h);
                    yVar.mo54697O(pk12.f184831i);
                    C13598b0 b0Var7 = C13598b0.f38549a;
                    R.add(yVar);
                }
                C98340b0 b0Var8 = new C98340b0();
                String str57 = k.f185193q;
                if (str57 == null) {
                    str57 = "";
                }
                b0Var8.mo54740C(str57);
                String str58 = k.f185194r;
                if (str58 == null) {
                    str58 = "";
                }
                b0Var8.mo54741D(str58);
                C13598b0 b0Var9 = C13598b0.f38549a;
                vVar.mo55183p0(b0Var8);
                String str59 = k.f185195s;
                if (str59 == null) {
                    str59 = "";
                }
                vVar.mo55172e0(str59);
                String str60 = k.f185198v;
                if (str60 == null) {
                    str60 = "";
                }
                vVar.mo55171d0(str60);
                String str61 = k.f185199w;
                if (str61 == null) {
                    str61 = "";
                }
                vVar.mo55170c0(str61);
                String str62 = k.f185200x;
                if (str62 == null) {
                    str62 = "";
                }
                vVar.mo55173f0(str62);
                vVar.mo55168a0(k.f185201y);
                String str63 = k.f185202z;
                if (str63 == null) {
                    str63 = "";
                }
                vVar.mo55169b0(str63);
                vVar.mo55176i0(k.f185178A);
                String str64 = k.f185179B;
                if (str64 == null) {
                    str64 = "";
                }
                vVar.mo55175h0(str64);
                String str65 = k.f185180C;
                if (str65 == null) {
                    str65 = "";
                }
                vVar.mo55179l0(str65);
                String str66 = k.f185181D;
                if (str66 == null) {
                    str66 = "";
                }
                vVar.mo55174g0(str66);
                mVar.mo54997p1(vVar);
            }
            C101841sc0 sc06 = next.f299296c1;
            if (!(sc06 == null || (l = sc06.mo141286l()) == null)) {
                C98345e0 e0Var = new C98345e0();
                String str67 = l.f184778d;
                if (str67 == null) {
                    str67 = "";
                }
                e0Var.mo54831w0(str67);
                String str68 = l.f184779e;
                if (str68 == null) {
                    str68 = "";
                }
                e0Var.mo54834z0(str68);
                String str69 = l.f184780f;
                if (str69 == null) {
                    str69 = "";
                }
                e0Var.mo54833y0(str69);
                String str70 = l.f184781g;
                if (str70 == null) {
                    str70 = "";
                }
                e0Var.mo54783G0(str70);
                String str71 = l.f184782h;
                if (str71 == null) {
                    str71 = "";
                }
                e0Var.mo54824p0(str71);
                String str72 = l.f184790s;
                if (str72 == null) {
                    str72 = "";
                }
                e0Var.mo54832x0(str72);
                String str73 = l.f184789r;
                if (str73 == null) {
                    str73 = "";
                }
                e0Var.mo54771A0(str73);
                e0Var.mo54830v0(l.f184792u);
                C98351h0 h0Var = new C98351h0();
                String str74 = l.f184783i;
                if (str74 == null) {
                    str74 = "";
                }
                h0Var.mo54862D(str74);
                h0Var.mo54863E(l.f184785n);
                h0Var.mo54864F(l.f184784j);
                C13598b0 b0Var10 = C13598b0.f38549a;
                e0Var.mo54781F0(h0Var);
                e0Var.mo54777D0(l.f184791t);
                e0Var.mo54791K0(l.f184793v);
                e0Var.mo54775C0(l.f184793v);
                String str75 = l.f184794w;
                if (str75 == null) {
                    str75 = "";
                }
                e0Var.mo54825q0(str75);
                e0Var.mo54815g0(l.f184796y);
                String str76 = l.f184795x;
                if (str76 == null) {
                    str76 = "";
                }
                e0Var.mo54816h0(str76);
                e0Var.mo54817i0(l.f184797z);
                String str77 = l.f184757A;
                if (str77 == null) {
                    str77 = "";
                }
                e0Var.mo54819k0(str77);
                String str78 = l.f184758B;
                if (str78 == null) {
                    str78 = "";
                }
                e0Var.mo54818j0(str78);
                e0Var.mo54821m0(l.f184759C);
                String str79 = l.f184762F;
                if (str79 == null) {
                    str79 = "";
                }
                e0Var.mo54773B0(str79);
                String str80 = l.f184763G;
                if (str80 == null) {
                    str80 = "";
                }
                e0Var.mo54779E0(str80);
                String str81 = l.f184764H;
                if (str81 == null) {
                    str81 = "";
                }
                e0Var.mo54820l0(str81);
                String str82 = l.f184765I;
                if (str82 == null) {
                    str82 = "";
                }
                e0Var.mo54787I0(str82);
                String str83 = l.f184766J;
                if (str83 == null) {
                    str83 = "";
                }
                e0Var.mo54828t0(str83);
                String str84 = l.f184767K;
                if (str84 == null) {
                    str84 = "";
                }
                e0Var.mo54826r0(str84);
                String str85 = l.f184768L;
                if (str85 == null) {
                    str85 = "";
                }
                e0Var.mo54827s0(str85);
                String str86 = l.f184769M;
                if (str86 == null) {
                    str86 = "";
                }
                e0Var.mo54785H0(str86);
                String str87 = l.f184770N;
                if (str87 == null) {
                    str87 = "";
                }
                e0Var.mo54829u0(str87);
                String str88 = l.f184771P;
                if (str88 == null) {
                    str88 = "";
                }
                e0Var.mo54793L0(str88);
                e0Var.mo54823o0(l.f184772Q);
                String str89 = l.f184773R;
                if (str89 == null) {
                    str89 = "";
                }
                e0Var.mo54822n0(str89);
                e0Var.mo54789J0(l.f184776U);
                mVar.mo54999q1(e0Var);
            }
            C101841sc0 b6 = next.mo141251b();
            if (!(b6 == null || (n = b6.mo141288n()) == null)) {
                C98363n0 n0Var = new C98363n0();
                String str90 = n.f186327e;
                if (str90 == null) {
                    str90 = "";
                }
                n0Var.mo55046N(str90);
                String str91 = n.f186328f;
                if (str91 == null) {
                    str91 = "";
                }
                n0Var.mo55052T(str91);
                String str92 = n.f186329g;
                if (str92 == null) {
                    str92 = "";
                }
                n0Var.mo55047O(str92);
                String str93 = n.f186330h;
                if (str93 == null) {
                    str93 = "";
                }
                n0Var.mo55044L(str93);
                String str94 = n.f186331i;
                if (str94 == null) {
                    str94 = "";
                }
                n0Var.mo55053U(str94);
                String str95 = n.f186332j;
                if (str95 == null) {
                    str95 = "";
                }
                n0Var.mo55045M(str95);
                String str96 = n.f186333n;
                if (str96 == null) {
                    str96 = "";
                }
                n0Var.mo55054V(str96);
                String str97 = n.f186334o;
                if (str97 == null) {
                    str97 = "";
                }
                n0Var.mo55049Q(str97);
                String str98 = n.f186335p;
                if (str98 == null) {
                    str98 = "";
                }
                n0Var.mo55050R(str98);
                String str99 = n.f186336q;
                if (str99 == null) {
                    str99 = "";
                }
                n0Var.mo55051S(str99);
                C13598b0 b0Var11 = C13598b0.f38549a;
                mVar.mo55003s1(n0Var);
            }
            C101841sc0 b7 = next.mo141251b();
            if (!(b7 == null || (f = b7.mo141283f()) == null)) {
                mVar.mo54993n1(C101164q0.m132676b(f));
                C13598b0 b0Var12 = C13598b0.f38549a;
            }
            C101841sc0 b8 = next.mo141251b();
            if (!(b8 == null || (o = b8.mo141289o()) == null)) {
                mVar.mo55005t1(C101164q0.m132676b(o));
                C13598b0 b0Var13 = C13598b0.f38549a;
            }
            C101841sc0 b9 = next.mo141251b();
            if (!(b9 == null || (m = b9.mo141287m()) == null)) {
                C98359k0 k0Var = new C98359k0();
                String str100 = m.f185045d;
                if (str100 == null) {
                    str100 = "";
                }
                k0Var.mo55027J(str100);
                String str101 = m.f185046e;
                if (str101 == null) {
                    str101 = "";
                }
                k0Var.mo55026I(str101);
                String str102 = m.f185047f;
                if (str102 == null) {
                    str102 = "";
                }
                k0Var.mo55025H(str102);
                String str103 = m.f185048g;
                if (str103 == null) {
                    str103 = "";
                }
                k0Var.mo55024G(str103);
                k0Var.mo55023F(m.f185049h);
                C13598b0 b0Var14 = C13598b0.f38549a;
                mVar.mo55001r1(k0Var);
            }
            C101841sc0 b15 = next.mo141251b();
            if (!(b15 == null || (j = b15.mo141284j()) == null)) {
                C98370s sVar = new C98370s();
                String str104 = j.f184475d;
                if (str104 == null) {
                    str104 = "";
                }
                sVar.mo55103I(str104);
                String str105 = j.f184476e;
                if (str105 == null) {
                    str105 = "";
                }
                sVar.mo55110P(str105);
                String str106 = j.f184477f;
                if (str106 == null) {
                    str106 = "";
                }
                sVar.mo55109O(str106);
                LinkedList<String> linkedList2 = j.f184478g;
                C87412m.m108593f(linkedList2, "item.thumbUrls");
                int i = 0;
                for (T next2 : linkedList2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        String str107 = (String) next2;
                        if (i == 0) {
                            if (str107 == null) {
                                str107 = "";
                            }
                            sVar.mo55105K(str107);
                        } else if (i == 1) {
                            if (str107 == null) {
                                str107 = "";
                            }
                            sVar.mo55106L(str107);
                        } else if (i == 2) {
                            if (str107 == null) {
                                str107 = "";
                            }
                            sVar.mo55107M(str107);
                        } else if (i == 3) {
                            if (str107 == null) {
                                str107 = "";
                            }
                            sVar.mo55108N(str107);
                        }
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                C89349b bVar = j.f184480i;
                if (bVar != null) {
                    byte[] encode = Base64.encode(bVar.mo123703f(), 0);
                    C87412m.m108593f(encode, "encode(cardBuffer.toByteArray(), Base64.DEFAULT)");
                    sVar.mo55104J(new String(encode, C119027c.f356488a));
                    C13598b0 b0Var15 = C13598b0.f38549a;
                }
                C13598b0 b0Var16 = C13598b0.f38549a;
                mVar.mo54995o1(sVar);
            }
            C101841sc0 b16 = next.mo141251b();
            if (!(b16 == null || (q = b16.mo141291q()) == null)) {
                C98356j jVar = new C98356j();
                String str108 = q.f297854j;
                if (str108 == null) {
                    str108 = "";
                }
                jVar.mo54909Q(str108);
                String str109 = q.f297861t;
                if (str109 == null) {
                    str109 = "";
                }
                jVar.mo54910R(str109);
                String str110 = q.f297860s;
                if (str110 == null) {
                    str110 = "";
                }
                jVar.mo54905M(str110);
                String str111 = q.f297855n;
                if (str111 == null) {
                    str111 = "";
                }
                jVar.mo54903K(str111);
                String str112 = q.f297856o;
                if (str112 == null) {
                    str112 = "";
                }
                jVar.mo54902J(str112);
                String str113 = q.f297859r;
                if (str113 == null) {
                    str113 = "";
                }
                jVar.mo54907O(str113);
                jVar.mo54908P(q.f297850f);
                jVar.mo54906N(q.f297851g);
                jVar.mo54904L(q.f297853i);
                C13598b0 b0Var17 = C13598b0.f38549a;
                mVar.mo54974e1(jVar);
            }
            C101841sc0 b17 = next.mo141251b();
            if (!(b17 == null || (s = b17.mo141293s()) == null)) {
                C98365o1 o1Var = new C98365o1();
                o1Var.mo55074J(s.mo141203k());
                String j2 = s.mo141202j();
                if (j2 == null) {
                    j2 = "";
                }
                o1Var.mo55073I(j2);
                String b18 = s.mo141199b();
                if (b18 == null) {
                    b18 = "";
                }
                o1Var.mo55070F(b18);
                String f6 = s.mo141201f();
                if (f6 == null) {
                    f6 = "";
                }
                o1Var.mo55072H(f6);
                String d4 = s.mo141200d();
                if (d4 == null) {
                    d4 = "";
                }
                o1Var.mo55071G(d4);
                C13598b0 b0Var18 = C13598b0.f38549a;
                mVar.mo54916C1(o1Var);
            }
            C101841sc0 b19 = next.mo141251b();
            if (!(b19 == null || (t = b19.mo141294t()) == null)) {
                C98369r1 r1Var = new C98369r1();
                String j3 = t.mo141314j();
                if (j3 == null) {
                    j3 = "";
                }
                r1Var.mo55093G(j3);
                String b25 = t.mo141311b();
                if (b25 == null) {
                    b25 = "";
                }
                r1Var.mo55091E(b25);
                String f7 = t.mo141313f();
                if (f7 == null) {
                    f7 = "";
                }
                r1Var.mo55092F(f7);
                String d5 = t.mo141312d();
                if (d5 == null) {
                    d5 = "";
                }
                r1Var.mo55094H(d5);
                C13598b0 b0Var19 = C13598b0.f38549a;
                mVar.mo54965a2(r1Var);
            }
            C101841sc0 b26 = next.mo141251b();
            if (!(b26 == null || (b = b26.mo141281b()) == null)) {
                C98337a aVar = new C98337a();
                String str114 = b.f259741d;
                if (str114 == null) {
                    str114 = "";
                }
                aVar.mo54736W(str114);
                String str115 = b.f259742e;
                if (str115 == null) {
                    str115 = "";
                }
                aVar.mo54726M(str115);
                aVar.mo54731R(b.f259743f);
                String str116 = b.f259744g;
                if (str116 == null) {
                    str116 = "";
                }
                aVar.mo54728O(str116);
                aVar.mo54735V(b.f259745h);
                String str117 = b.f259746i;
                if (str117 == null) {
                    str117 = "";
                }
                aVar.mo54730Q(str117);
                String str118 = b.f259747j;
                if (str118 == null) {
                    str118 = "";
                }
                aVar.mo54733T(str118);
                aVar.mo54737X(b.f259748n);
                aVar.mo54727N(b.f259749o);
                aVar.mo54732S(b.f259753s);
                String str119 = b.f259751q;
                if (str119 == null) {
                    str119 = "";
                }
                aVar.mo54729P(str119);
                aVar.mo54734U(b.f259752r);
                C13598b0 b0Var20 = C13598b0.f38549a;
                mVar.mo54967b1(aVar);
            }
            C101841sc0 b27 = next.mo141251b();
            if (!(b27 == null || (r = b27.mo141292r()) == null)) {
                C98355i1 i1Var = new C98355i1();
                String str120 = r.f185459d;
                if (str120 == null) {
                    str120 = "";
                }
                i1Var.mo54890Z(str120);
                String str121 = r.f185460e;
                if (str121 == null) {
                    str121 = "";
                }
                i1Var.mo54889Y(str121);
                String str122 = r.f185461f;
                if (str122 == null) {
                    str122 = "";
                }
                i1Var.mo54883S(str122);
                String str123 = r.f185462g;
                if (str123 == null) {
                    str123 = "";
                }
                i1Var.mo54887W(str123);
                String str124 = r.f185463h;
                if (str124 == null) {
                    str124 = "";
                }
                i1Var.mo54892b0(str124);
                String str125 = r.f185464i;
                if (str125 == null) {
                    str125 = "";
                }
                i1Var.mo54882R(str125);
                String str126 = r.f185466n;
                if (str126 == null) {
                    str126 = "";
                }
                i1Var.mo54888X(str126);
                i1Var.mo54886V(r.f185467o);
                String str127 = r.f185468p;
                if (str127 == null) {
                    str127 = "";
                }
                i1Var.mo54885U(str127);
                i1Var.mo54881Q(r.f185469q);
                String str128 = r.f185465j;
                if (str128 == null) {
                    str128 = "";
                }
                i1Var.mo54884T(str128);
                String str129 = r.f185471s;
                if (str129 == null) {
                    str129 = "";
                }
                i1Var.mo54891a0(str129);
                String str130 = r.f185470r;
                if (str130 == null) {
                    str130 = "";
                }
                i1Var.mo54880P(str130);
                String str131 = r.f185476x;
                if (str131 == null) {
                    str131 = "";
                }
                i1Var.mo54879O(str131);
                C13598b0 b0Var21 = C13598b0.f38549a;
                mVar.mo54914B1(i1Var);
            }
            list2.add(mVar);
        }
        C77911cd0 cd02 = kd03.f298608G;
        if (cd02 != null) {
            z0Var.f288423p = kd03.f298602A;
            z0Var.mo54709W(Util.nullAs(cd02.f227116e, ""));
            C98361l1 l1Var = new C98361l1();
            l1Var.mo55030C(Util.nullAs(kd03.f298608G.f227115d, ""));
            l1Var.mo55031D(Util.nullAs(kd03.f298608G.f227116e, ""));
            z0Var.f288419l = l1Var;
        }
        return z0Var.mo141118z();
    }

    /* renamed from: K */
    public static boolean m132618K(C101834rc0 rc02, long j, boolean z) {
        Class cls = C100336e.class;
        if (rc02 == null) {
            Log.m105928w("MicroMsg.RecordMsgLogic", "try download data fail, dataitem is null");
            return false;
        }
        String v = m132641v(rc02.f299280T, j, true);
        if (C117731d.m166007c().mo182440a(new C37075s()) == 1) {
            C55385t tVar = new C55385t();
            tVar.f157719a = rc02.f299329u;
            tVar.f157720b = rc02.f299325s;
            tVar.f157721c = rc02.f299280T;
            tVar.f157722d = v;
            tVar.f157724f = rc02.f299276R;
            tVar.f157725g = new Random().nextInt(2147483645) + 1;
            tVar.f157726h = m132636q(rc02, j, 1);
            tVar.f157727i = m132635p(rc02.f299258I, (int) rc02.f299276R);
            tVar.f157728j = false;
            tVar.f157729k = rc02.f299337x1;
            tVar.f157730l = rc02.f299340y1;
            tVar.f157731m = rc02.f299342z1;
            tVar.f157732n = rc02.f299266M;
            tVar.f157733o = j;
            ((C63287k) C86312j.m106911c(C63287k.class)).mo88184wS(tVar);
        } else {
            C100344n qq = ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140585qq(v);
            if (qq == null) {
                qq = new C100344n();
                qq.field_cdnKey = rc02.f299329u;
                qq.field_cdnUrl = rc02.f299325s;
                qq.field_dataId = rc02.f299280T;
                qq.field_mediaId = v;
                qq.field_totalLen = (int) rc02.f299276R;
                qq.field_localId = new Random().nextInt(2147483645) + 1;
                qq.field_path = m132636q(rc02, j, 1);
                qq.field_type = 1;
                qq.field_fileType = m132635p(rc02.f299258I, (int) rc02.f299276R);
                qq.field_isThumb = false;
                qq.field_tpaeskey = rc02.f299337x1;
                qq.field_tpauthkey = rc02.f299340y1;
                qq.field_tpdataurl = rc02.f299342z1;
                Log.m105919d("MicroMsg.RecordMsgLogic", "insert localId[%d] result[%B]", Integer.valueOf(qq.field_localId), Boolean.valueOf(((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).insert(qq)));
                if (!Util.isNullOrNil(rc02.f299308i1) && rc02.f299308i1.equals("WeNoteHtmlFile")) {
                    ((C100336e) C86312j.m106911c(cls)).kl0().mo139221b(qq);
                }
            }
            Log.m105919d("MicroMsg.RecordMsgLogic", "try download data, dump record cdninfo: %s", qq);
            int i = qq.field_status;
            if (4 == i) {
                Log.m105929w("MicroMsg.RecordMsgLogic", "try download, but cdn info out of date, code[%d]", Integer.valueOf(qq.field_errCode));
                return false;
            }
            if (3 == i) {
                Log.m105925i("MicroMsg.RecordMsgLogic", "try download, but cdn info error, code[%d], can retry[%B]", Integer.valueOf(qq.field_errCode), Boolean.valueOf(z));
                if (!z) {
                    return false;
                }
                qq.field_status = 1;
                ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).update(qq, C66261f3.COL_LOCALID);
            }
            ((C101176x) ((C100336e) C86312j.m106911c(cls)).kl0()).mo140623f();
        }
        WxFileIndexDirtyEvent wxFileIndexDirtyEvent = new WxFileIndexDirtyEvent();
        wxFileIndexDirtyEvent.f79070d.f79071a = j;
        wxFileIndexDirtyEvent.publish();
        return true;
    }

    /* renamed from: L */
    public static boolean m132619L(C101834rc0 rc02, long j, boolean z) {
        Class cls = C100336e.class;
        if (rc02 == null) {
            Log.m105928w("MicroMsg.RecordMsgLogic", "try download thumb error, dataitem is null");
            return false;
        }
        String C = m132610C(rc02.f299280T);
        String v = m132641v(C, j, true);
        if (C117731d.m166007c().mo182440a(new C37075s()) == 1) {
            C55385t tVar = new C55385t();
            tVar.f157721c = C;
            tVar.f157722d = v;
            tVar.f157719a = rc02.f299309j;
            tVar.f157720b = rc02.f299305h;
            tVar.f157724f = rc02.f299336x0;
            tVar.f157732n = rc02.f299288X;
            tVar.f157725g = new Random().nextInt(2147483645) + 1;
            tVar.f157726h = m132611D(rc02, j, 1);
            tVar.f157727i = 1;
            tVar.f157728j = true;
            tVar.f157729k = rc02.f299337x1;
            tVar.f157730l = rc02.f299340y1;
            tVar.f157731m = rc02.f299342z1;
            tVar.f157733o = j;
            ((C63287k) C86312j.m106911c(C63287k.class)).mo88184wS(tVar);
        } else {
            C100344n qq = ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140585qq(v);
            if (qq == null) {
                qq = new C100344n();
                qq.field_cdnKey = rc02.f299309j;
                qq.field_cdnUrl = rc02.f299305h;
                qq.field_dataId = C;
                qq.field_mediaId = v;
                qq.field_totalLen = (int) rc02.f299336x0;
                qq.field_localId = new Random().nextInt(2147483645) + 1;
                qq.field_path = m132611D(rc02, j, 1);
                qq.field_type = 1;
                qq.field_fileType = 1;
                qq.field_isThumb = true;
                qq.field_tpdataurl = rc02.f299334w1;
                qq.field_tpauthkey = rc02.f299340y1;
                qq.field_tpaeskey = rc02.f299243A1;
                Log.m105919d("MicroMsg.RecordMsgLogic", "insert localId[%d] result[%B]", Integer.valueOf(qq.field_localId), Boolean.valueOf(((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).insert(qq)));
            }
            Log.m105927v("MicroMsg.RecordMsgLogic", "try download thumb, dump record cdninfo: %s", qq);
            int i = qq.field_status;
            if (4 == i) {
                Log.m105929w("MicroMsg.RecordMsgLogic", "try download thumb, but cdn info out of date, code[%d]", Integer.valueOf(qq.field_errCode));
                return false;
            }
            if (3 == i) {
                Log.m105925i("MicroMsg.RecordMsgLogic", "try download thumb, but cdn info error, code[%d], can retry[%B]", Integer.valueOf(qq.field_errCode), Boolean.valueOf(z));
                if (!z) {
                    return false;
                }
                qq.field_status = 1;
                ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).update(qq, C66261f3.COL_LOCALID);
            }
            ((C101176x) ((C100336e) C86312j.m106911c(cls)).kl0()).mo140623f();
        }
        WxFileIndexDirtyEvent wxFileIndexDirtyEvent = new WxFileIndexDirtyEvent();
        wxFileIndexDirtyEvent.f79070d.f79071a = j;
        wxFileIndexDirtyEvent.publish();
        return true;
    }

    /* renamed from: a */
    public static void m132620a(long j, C72963f4 f4Var) {
        C101801kd0 kd02;
        String str;
        Class cls = C75700k0.class;
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
        C101144i u2 = m132640u(u);
        if (u2 != null) {
            str = u2.f296047a;
            kd02 = u2.f296049c;
        } else {
            kd02 = null;
            str = "";
        }
        if (kd02 == null) {
            f4Var.mo100991d(5);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(j, f4Var);
            return;
        }
        f4Var.mo108732L2(m132626g(u.f195570f, str, kd02, "", 0));
        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(j, f4Var);
    }

    /* renamed from: b */
    public static void m132621b(String str, String str2) {
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108733M2(C75604z3.m90843o(str));
        f4Var.mo108749c3(str);
        f4Var.mo108732L2(str2);
        f4Var.setType(10000);
        f4Var.mo100991d(6);
        f4Var.mo108740T2(0);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
    }

    /* renamed from: c */
    public static void m132622c(long j, String str, String str2, String str3, C101801kd0 kd02) {
        Class cls = C100336e.class;
        C100346q qVar = new C100346q();
        qVar.field_msgId = j;
        qVar.field_title = str;
        qVar.field_desc = str2;
        qVar.field_toUser = str3;
        qVar.field_dataProto = kd02;
        qVar.field_type = 3;
        qVar.field_localId = new Random().nextInt(2147483645) + 1;
        Log.m105925i("MicroMsg.RecordMsgLogic", "summerrecord Download RecordMsgStorage insert ret:%b, id:%d, localid:%d", Boolean.valueOf(((C101143h0) ((C100336e) C86312j.m106911c(cls)).k10()).insert(qVar)), Long.valueOf(j), Integer.valueOf(qVar.field_localId));
        ((C101153n0) ((C100336e) C86312j.m106911c(cls)).mo139409NS()).mo140599f(qVar, false);
    }

    /* renamed from: d */
    public static void m132623d(long j, String str, String str2, String str3, C101801kd0 kd02) {
        Class cls = C100336e.class;
        C100346q qVar = new C100346q();
        qVar.field_msgId = j;
        qVar.field_title = str;
        qVar.field_desc = str2;
        qVar.field_toUser = str3;
        qVar.field_dataProto = kd02;
        qVar.field_type = 1;
        qVar.field_localId = new Random().nextInt(2147483645) + 1;
        Log.m105925i("MicroMsg.RecordMsgLogic", "summerrecord Fav RecordMsgStorage insert ret:%b, id:%d, localid:%d", Boolean.valueOf(((C101143h0) ((C100336e) C86312j.m106911c(cls)).k10()).insert(qVar)), Long.valueOf(j), Integer.valueOf(qVar.field_localId));
        ((C101153n0) ((C100336e) C86312j.m106911c(cls)).mo139409NS()).mo140599f(qVar, false);
    }

    /* renamed from: e */
    public static void m132624e(long j, long j2, String str, C68070l.C68072b bVar, C77915dp3 dp32, C101801kd0 kd02, boolean z) {
        Class cls = C100336e.class;
        C100346q qVar = new C100346q();
        qVar.field_msgId = j;
        qVar.field_oriMsgId = j2;
        qVar.field_toUser = str;
        qVar.field_title = bVar.f195570f;
        qVar.field_desc = Util.nullAs(dp32.f227154e, bVar.f195574g);
        qVar.field_dataProto = kd02;
        qVar.field_type = 0;
        qVar.field_favFrom = dp32.f227156g;
        qVar.field_localId = new Random().nextInt(2147483645) + 1;
        Log.m105925i("MicroMsg.RecordMsgLogic", "summerrecord Normal RecordMsgStorage insert ret:%b, id:%d, oriMsgId:%d localid:%d", Boolean.valueOf(((C101143h0) ((C100336e) C86312j.m106911c(cls)).k10()).insert(qVar)), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(qVar.field_localId));
        ((C101153n0) ((C100336e) C86312j.m106911c(cls)).mo139409NS()).mo140599f(qVar, z);
    }

    /* renamed from: f */
    public static C68070l.C68072b m132625f(String str, String str2, C101801kd0 kd02) {
        LinkedList<C101834rc0> linkedList = kd02.f298618f;
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195570f = str;
        if (str2 != null && str2.length() > 200) {
            str2 = str2.substring(0, 200);
        }
        bVar.f195574g = str2;
        if (Util.isNullOrNil((List) linkedList) || !C93594f1.m118177e(linkedList.get(0))) {
            bVar.f195582i = 19;
            bVar.f195586j = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0";
        } else {
            bVar.f195582i = 24;
            bVar.f195586j = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008";
        }
        bVar.f195578h = "view";
        bVar.f195571f0 = m132617J(str, str2, C75592q0.m90789s(), kd02, linkedList);
        return bVar;
    }

    /* renamed from: g */
    public static String m132626g(String str, String str2, C101801kd0 kd02, String str3, long j) {
        LinkedList<C101834rc0> linkedList;
        if (kd02 == null || (linkedList = kd02.f298618f) == null) {
            Log.m105920e("MicroMsg.RecordMsgLogic", "buildRecordAppMsgXML error: protoItem or datalist is null");
            return "";
        }
        C68070l.C68072b bVar = new C68070l.C68072b();
        bVar.f195570f = str;
        if (str2 != null && str2.length() > 200) {
            str2 = str2.substring(0, 200);
        }
        bVar.f195574g = str2;
        if (linkedList.size() <= 0 || !C93594f1.m118177e(linkedList.get(0))) {
            bVar.f195582i = 19;
            bVar.f195586j = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/favorite_record__w_unsupport&from=singlemessage&isappinstalled=0";
        } else {
            bVar.f195582i = 24;
            bVar.f195586j = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmi) + "/cgi-bin/mmsupport-bin/readtemplate?t=page/common_page__upgrade&btn_text=btn_text_0&text=text008";
        }
        bVar.f195578h = "view";
        bVar.f195571f0 = m132617J(str, str2, str3, kd02, linkedList);
        C68070l a0 = ((C96776s) ((C53543s) C86312j.m106911c(C53543s.class)).mo74023HM()).mo135038a0(j);
        if (a0 != null) {
            bVar.f195562d = a0.field_appId;
        }
        return C101164q0.m132677c(bVar).mo141118z();
    }

    /* renamed from: h */
    public static String m132627h(C77915dp3 dp32, String str) {
        if (dp32 == null || dp32.f227155f == null) {
            Log.m105920e("MicroMsg.RecordMsgLogic", "buildRecordInfoXML error: msgData or msgData.items is null");
            return Util.nullAs(str, "");
        }
        C101801kd0 kd02 = new C101801kd0();
        kd02.mo141217o(dp32.f227157h);
        kd02.mo141213k(dp32.f227158i);
        return m132617J(dp32.f227153d, dp32.f227154e, dp32.f227156g, kd02, dp32.f227155f);
    }

    /* renamed from: i */
    public static boolean m132628i(C101834rc0 rc02, long j) {
        if (rc02 == null) {
            Log.m105928w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate fail, dataitem is null");
            return true;
        }
        C100344n qq = ((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).mo140585qq(m132641v(rc02.f299280T, j, true));
        if (qq == null) {
            Log.m105918d("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, not find cdn info");
            return false;
        }
        int i = qq.field_status;
        if (4 == i) {
            Log.m105929w("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, status err, code %d", Integer.valueOf(qq.field_errCode));
            return true;
        }
        Log.m105919d("MicroMsg.RecordMsgLogic", "checkDataOutOfDate ok, find cdn info, status %d", Integer.valueOf(i));
        return false;
    }

    /* renamed from: j */
    public static void m132629j(long j) {
        C86009m1 o = m132634o(j, false);
        boolean g = o.mo119967g();
        Log.m105925i("MicroMsg.RecordMsgLogic", "do clear resource new, path %s, result %B, exists:%B", o.mo119971i(), Boolean.valueOf(g && C86013q1.m106446g(o.mo119976n(), true)), Boolean.valueOf(g));
    }

    /* renamed from: k */
    public static C101834rc0 m132630k(String str, String str2) {
        C101834rc0 k;
        C77915dp3 x = m132643x(str);
        if (x == null) {
            Log.m105928w("MicroMsg.RecordMsgLogic", "get record msg data error, empty");
            return null;
        }
        Iterator<C101834rc0> it = x.f227155f.iterator();
        while (it.hasNext()) {
            C101834rc0 next = it.next();
            if (next.f299280T.equals(str2)) {
                return next;
            }
            if (next.f299258I == 17 && (k = m132630k(next.f299326s1, str2)) != null) {
                return k;
            }
        }
        return null;
    }

    /* renamed from: l */
    public static C77915dp3 m132631l(String str, String str2) {
        C77915dp3 l;
        C77915dp3 x = m132643x(str);
        if (x == null) {
            Log.m105928w("MicroMsg.RecordMsgLogic", "get record msg data error, empty");
            return null;
        }
        Iterator<C101834rc0> it = x.f227155f.iterator();
        while (it.hasNext()) {
            C101834rc0 next = it.next();
            if (next.f299280T.equals(str2)) {
                return x;
            }
            if (next.f299258I == 17 && (l = m132631l(next.f299326s1, str2)) != null) {
                return l;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static void m132632m(Long l, Long l2, String str) {
        ForwardUpdateMsgIdEvent forwardUpdateMsgIdEvent = new ForwardUpdateMsgIdEvent();
        forwardUpdateMsgIdEvent.f264876d.f264877a = l.longValue();
        forwardUpdateMsgIdEvent.f264876d.f264878b = l2.longValue();
        forwardUpdateMsgIdEvent.f264876d.f264879c = str;
        forwardUpdateMsgIdEvent.publish();
    }

    /* renamed from: n */
    public static String m132633n(String str, int i) {
        return C90193h.m112878f((str + i + System.currentTimeMillis()).getBytes());
    }

    /* renamed from: o */
    public static C86009m1 m132634o(long j, boolean z) {
        C86009m1 m1Var = new C86009m1(String.format("%s/%d/", new Object[]{m132645z(j), Long.valueOf(j)}));
        if (!z) {
            return m1Var;
        }
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            m1Var.mo119987x();
        }
        return m1Var;
    }

    /* renamed from: p */
    public static int m132635p(int i, int i2) {
        if (2 == i) {
            return 1;
        }
        if (4 == i) {
            return 4;
        }
        return i2 > 26214400 ? 7 : 5;
    }

    /* renamed from: q */
    public static String m132636q(C101834rc0 rc02, long j, int i) {
        if (rc02 == null) {
            return "";
        }
        String t = m132639t(rc02.f299280T, i);
        if (Util.isNullOrNil(t) || !MMApplicationContext.isMMProcess() || !C86709a0.m107522a()) {
            return "";
        }
        boolean z = true;
        C86009m1 o = m132634o(j, true);
        if (rc02.f299258I != 8 || Util.isNullOrNil(rc02.f299297d)) {
            z = false;
        } else {
            t = rc02.f299297d;
            C86009m1 m1Var = new C86009m1(String.format("%s/%d/%d/", new Object[]{m132645z(j), Long.valueOf(j), Integer.valueOf(rc02.f299280T.hashCode() & 255)}));
            if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
                m1Var.mo119987x();
            }
            o = m1Var;
        }
        String str = rc02.f299262K;
        if (str != null && str.trim().length() > 0 && !z) {
            t = t + "." + rc02.f299262K;
        }
        String i2 = new C86009m1(o, t).mo119971i();
        VFSStrategy.m163779g(i2, -1, 3, false);
        return i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x03f5, code lost:
        r3 = true;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static se3.C77685c m132637r(android.content.Context r13, com.tencent.p014mm.autogen.events.DoFavoriteEvent r14, java.lang.String r15) {
        /*
            se3.c r0 = new se3.c
            r0.<init>()
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            r1.<init>()
            java.lang.Class<rn.v> r2 = p227rn.C48053v.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            rn.v r2 = (p227rn.C48053v) r2
            boolean r2 = r2.mo72614OE(r15)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0023
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r15 = r14.f264674d
            te3.kd0 r15 = r15.f264676a
            java.lang.String r15 = r15.f298626q
            r0.f226460d = r15
            goto L_0x0067
        L_0x0023:
            boolean r2 = com.tencent.p014mm.storage.C72996z1.m85820U5(r15)
            if (r2 == 0) goto L_0x0033
            r15 = 2131834443(0x7f11364b, float:1.9301996E38)
            java.lang.String r15 = r13.getString(r15)
            r0.f226460d = r15
            goto L_0x0067
        L_0x0033:
            java.lang.String r2 = eb0.C75592q0.m90783m()
            java.lang.Class<d62.i> r5 = d62.C75339i.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            d62.i r5 = (d62.C75339i) r5
            java.lang.String r15 = r5.mo62514P1(r15)
            boolean r5 = r2.equals(r15)
            if (r5 == 0) goto L_0x0057
            r15 = 2131825738(0x7f11144a, float:1.928434E38)
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r2
            java.lang.String r15 = r13.getString(r15, r5)
            r0.f226460d = r15
            goto L_0x0067
        L_0x0057:
            r5 = 2131825737(0x7f111449, float:1.9284339E38)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r3] = r2
            r6[r4] = r15
            java.lang.String r15 = r13.getString(r5, r6)
            r0.f226460d = r15
        L_0x0067:
            java.lang.Object[] r15 = new java.lang.Object[r4]
            java.lang.String r2 = r0.f226460d
            r15[r3] = r2
            java.lang.String r2 = "MicroMsg.RecordMsgLogic"
            java.lang.String r5 = "msgInfo title %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r5, r15)
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>()
            com.tencent.mm.autogen.events.DoFavoriteEvent$a r14 = r14.f264674d
            te3.kd0 r14 = r14.f264676a
            if (r14 == 0) goto L_0x0083
            java.util.LinkedList<te3.rc0> r14 = r14.f298618f
            goto L_0x0088
        L_0x0083:
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
        L_0x0088:
            java.util.Iterator r14 = r14.iterator()
        L_0x008c:
            boolean r2 = r14.hasNext()
            r5 = 5
            if (r2 == 0) goto L_0x041c
            java.lang.Object r2 = r14.next()
            te3.rc0 r2 = (te3.C101834rc0) r2
            int r6 = r2.f299258I
            int r6 = r1.get(r6)
            int r7 = r2.f299258I
            int r6 = r6 + r4
            r1.put(r7, r6)
            int r6 = r2.f299258I
            r7 = 2131755116(0x7f10006c, float:1.9141102E38)
            r8 = 2131821721(0x7f110499, float:1.9276193E38)
            r9 = 2131821728(0x7f1104a0, float:1.9276207E38)
            r10 = 2131755112(0x7f100068, float:1.9141094E38)
            java.lang.String r11 = "\n"
            java.lang.String r12 = ":"
            switch(r6) {
                case 1: goto L_0x03f8;
                case 2: goto L_0x03c6;
                case 3: goto L_0x039d;
                case 4: goto L_0x0373;
                case 5: goto L_0x0340;
                case 6: goto L_0x02ef;
                case 7: goto L_0x02b9;
                case 8: goto L_0x0286;
                case 9: goto L_0x00ba;
                case 10: goto L_0x024f;
                case 11: goto L_0x024f;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00ba;
                case 14: goto L_0x0221;
                case 15: goto L_0x01f6;
                case 16: goto L_0x01b3;
                case 17: goto L_0x018a;
                case 18: goto L_0x00ba;
                case 19: goto L_0x015c;
                case 20: goto L_0x00ba;
                case 21: goto L_0x00ba;
                case 22: goto L_0x0131;
                case 23: goto L_0x0131;
                case 24: goto L_0x00ba;
                case 25: goto L_0x00ba;
                case 26: goto L_0x0131;
                case 27: goto L_0x0131;
                case 28: goto L_0x0131;
                case 29: goto L_0x02b9;
                case 30: goto L_0x0131;
                case 31: goto L_0x0108;
                case 32: goto L_0x00ba;
                case 33: goto L_0x00ba;
                case 34: goto L_0x00de;
                case 35: goto L_0x00bb;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            goto L_0x008c
        L_0x00bb:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            java.lang.String r2 = r2.f299301f
            r5.append(r2)
            r5.append(r11)
            java.lang.String r2 = r5.toString()
            r15.add(r2)
            goto L_0x008c
        L_0x00de:
            boolean r6 = pb1.C100734q.m131837a0()
            if (r6 == 0) goto L_0x00e5
            goto L_0x008c
        L_0x00e5:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            java.lang.String r2 = r2.f299297d
            r5.append(r2)
            r5.append(r11)
            java.lang.String r2 = r5.toString()
            r15.add(r2)
            goto L_0x008c
        L_0x0108:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = r2.f299298d1
            r5.append(r2)
            r5.append(r12)
            r2 = 2131821546(0x7f1103ea, float:1.9275838E38)
            java.lang.String r2 = r13.getString(r2)
            r5.append(r2)
            r5.append(r11)
            java.lang.String r2 = r5.toString()
            r15.add(r2)
            goto L_0x008c
        L_0x0131:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            java.lang.String r6 = r13.getString(r8)
            r5.append(r6)
            java.lang.String r2 = r2.f299297d
            r5.append(r2)
            r5.append(r11)
            java.lang.String r2 = r5.toString()
            r15.add(r2)
            goto L_0x008c
        L_0x015c:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            r6 = 2131820946(0x7f110192, float:1.9274621E38)
            java.lang.String r6 = r13.getString(r6)
            r5.append(r6)
            java.lang.String r2 = r2.f299297d
            r5.append(r2)
            r5.append(r11)
            java.lang.String r2 = r5.toString()
            r15.add(r2)
            goto L_0x008c
        L_0x018a:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = r2.f299298d1
            r5.append(r2)
            r5.append(r12)
            r2 = 2131821659(0x7f11045b, float:1.9276067E38)
            java.lang.String r2 = r13.getString(r2)
            r5.append(r2)
            r5.append(r11)
            java.lang.String r2 = r5.toString()
            r15.add(r2)
            goto L_0x008c
        L_0x01b3:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x01da
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            r6 = 2131821544(0x7f1103e8, float:1.9275834E38)
            java.lang.String r6 = r13.getString(r6)
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r15.add(r5)
        L_0x01da:
            if (r3 != 0) goto L_0x008c
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            k40.a r3 = f40.C86709a0.m107533q(r3)
            f62.k0 r3 = (f62.C75700k0) r3
            g62.l r3 = r3.mo96095LE()
            java.lang.String r2 = r2.f299301f
            com.tencent.mm.storage.g4 r3 = (com.tencent.p014mm.storage.C72972g4) r3
            com.tencent.mm.storage.f4$b r2 = r3.Rv0(r2)
            java.lang.String r2 = r2.f212675a
            r0.f226464h = r2
            goto L_0x03f5
        L_0x01f6:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x021a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            java.lang.String r6 = r13.getString(r9)
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r15.add(r5)
        L_0x021a:
            if (r3 != 0) goto L_0x008c
            m132609B(r0, r2, r7)
            goto L_0x03f5
        L_0x0221:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x0248
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            r6 = 2131820945(0x7f110191, float:1.927462E38)
            java.lang.String r6 = r13.getString(r6)
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r15.add(r5)
        L_0x0248:
            if (r3 != 0) goto L_0x008c
            m132609B(r0, r2, r10)
            goto L_0x03f5
        L_0x024f:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x027f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            r6 = 2131821644(0x7f11044c, float:1.9276037E38)
            java.lang.String r6 = r13.getString(r6)
            r5.append(r6)
            te3.sc0 r6 = r2.f299296c1
            te3.jd0 r6 = r6.f299408g
            java.lang.String r6 = r6.f298511d
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r15.add(r5)
        L_0x027f:
            if (r3 != 0) goto L_0x008c
            m132609B(r0, r2, r10)
            goto L_0x03f5
        L_0x0286:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x02b2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            r6 = 2131821530(0x7f1103da, float:1.9275806E38)
            java.lang.String r6 = r13.getString(r6)
            r5.append(r6)
            java.lang.String r6 = r2.f299297d
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r15.add(r5)
        L_0x02b2:
            if (r3 != 0) goto L_0x008c
            m132609B(r0, r2, r10)
            goto L_0x03f5
        L_0x02b9:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x02e5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            r6 = 2131821602(0x7f110422, float:1.9275952E38)
            java.lang.String r6 = r13.getString(r6)
            r5.append(r6)
            java.lang.String r6 = r2.f299297d
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r15.add(r5)
        L_0x02e5:
            if (r3 != 0) goto L_0x008c
            r3 = 2131755090(0x7f100052, float:1.914105E38)
            m132609B(r0, r2, r3)
            goto L_0x03f5
        L_0x02ef:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x0337
            te3.sc0 r5 = r2.f299296c1
            te3.zc0 r5 = r5.f299406e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = r2.f299298d1
            r6.append(r2)
            r6.append(r12)
            r2 = 2131821573(0x7f110405, float:1.9275893E38)
            java.lang.String r7 = r13.getString(r2)
            r6.append(r7)
            java.lang.String r7 = r5.f299958o
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x0328
            java.lang.String r7 = r5.f299958o
            java.lang.String r2 = r13.getString(r2)
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0325
            goto L_0x0328
        L_0x0325:
            java.lang.String r2 = r5.f299958o
            goto L_0x032a
        L_0x0328:
            java.lang.String r2 = r5.f299956j
        L_0x032a:
            r6.append(r2)
            r6.append(r11)
            java.lang.String r2 = r6.toString()
            r15.add(r2)
        L_0x0337:
            if (r3 != 0) goto L_0x008c
            r2 = 2131755088(0x7f100050, float:1.9141045E38)
            r0.f226463g = r2
            goto L_0x03f5
        L_0x0340:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x0369
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            java.lang.String r6 = r13.getString(r8)
            r5.append(r6)
            java.lang.String r6 = r2.f299297d
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r15.add(r5)
        L_0x0369:
            if (r3 != 0) goto L_0x008c
            r3 = 2131755119(0x7f10006f, float:1.9141108E38)
            m132609B(r0, r2, r3)
            goto L_0x03f5
        L_0x0373:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x0397
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            java.lang.String r6 = r13.getString(r9)
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r15.add(r5)
        L_0x0397:
            if (r3 != 0) goto L_0x008c
            m132609B(r0, r2, r7)
            goto L_0x03f5
        L_0x039d:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r2 = r2.f299298d1
            r5.append(r2)
            r5.append(r12)
            r2 = 2131821732(0x7f1104a4, float:1.9276215E38)
            java.lang.String r2 = r13.getString(r2)
            r5.append(r2)
            r5.append(r11)
            java.lang.String r2 = r5.toString()
            r15.add(r2)
            goto L_0x008c
        L_0x03c6:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x03ed
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            r6 = 2131821636(0x7f110444, float:1.927602E38)
            java.lang.String r6 = r13.getString(r6)
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r15.add(r5)
        L_0x03ed:
            if (r3 != 0) goto L_0x008c
            r3 = 2131230947(0x7f0800e3, float:1.8077961E38)
            m132609B(r0, r2, r3)
        L_0x03f5:
            r3 = 1
            goto L_0x008c
        L_0x03f8:
            int r6 = r15.size()
            if (r6 >= r5) goto L_0x008c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r2.f299298d1
            r5.append(r6)
            r5.append(r12)
            java.lang.String r2 = r2.f299301f
            r5.append(r2)
            r5.append(r11)
            java.lang.String r2 = r5.toString()
            r15.add(r2)
            goto L_0x008c
        L_0x041c:
            java.lang.String r13 = ""
            r0.f226461e = r13
            java.util.Iterator r14 = r15.iterator()
        L_0x0424:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0440
            java.lang.Object r1 = r14.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r13)
            r2.append(r1)
            java.lang.String r13 = r2.toString()
            goto L_0x0424
        L_0x0440:
            java.lang.String r13 = r13.trim()
            int r14 = r15.size()
            if (r14 < r5) goto L_0x045b
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            java.lang.String r13 = "..."
            r14.append(r13)
            java.lang.String r13 = r14.toString()
        L_0x045b:
            r0.f226461e = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101147j0.m132637r(android.content.Context, com.tencent.mm.autogen.events.DoFavoriteEvent, java.lang.String):se3.c");
    }

    /* renamed from: s */
    public static String m132638s(String str) {
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
        if (z1Var == null) {
            Log.m105929w("MicroMsg.RecordMsgLogic", "wtf get contact null, username %s", str);
            return "";
        }
        String f = z1Var.mo62898f();
        if (!C72996z1.m85820U5(f)) {
            return f;
        }
        List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(str);
        String s = C75592q0.m90789s();
        if (k5 == null || k5.isEmpty()) {
            Log.m105928w("MicroMsg.RecordMsgLogic", "get members from username error, content empty");
            return f;
        }
        k5.remove(s);
        k5.add(0, s);
        return C45612m0.m50692i(k5, 3, f);
    }

    /* renamed from: t */
    public static String m132639t(String str, int i) {
        if (Util.isEqual(i, 1)) {
            return str;
        }
        return i + "_" + str;
    }

    /* renamed from: u */
    public static final C101144i m132640u(C68070l.C68072b bVar) {
        if (bVar == null) {
            Log.m105928w("MicroMsg.RecordMsgLogic", "fixMsgContent error, parse appmsg error");
            return null;
        }
        C77915dp3 x = m132643x(bVar.f195571f0);
        if (x == null) {
            Log.m105928w("MicroMsg.RecordMsgLogic", "fixMsgContent error, parse record data error");
            return null;
        }
        C101801kd0 kd02 = new C101801kd0();
        kd02.f298618f = new LinkedList<>();
        kd02.mo141217o(x.f227157h);
        kd02.mo141213k(x.f227158i);
        kd02.mo141220r(x.f227153d);
        String string = MMApplicationContext.getContext().getString(C0966R.string.f7575k4);
        String string2 = MMApplicationContext.getContext().getString(C0966R.string.f8007z3);
        ArrayList arrayList = new ArrayList();
        Iterator<C101834rc0> it = x.f227155f.iterator();
        while (it.hasNext()) {
            C101834rc0 next = it.next();
            if (next.f299258I == 8 && next.f299276R > 26214400) {
                next.mo141260p(1);
                next.mo141265u(string);
                arrayList.add(string2 + next.f299297d);
                next.mo141246U((String) null);
                next.mo141261q((String) null);
                next.mo141253f((String) null);
                next.mo141254j((String) null);
                next.f299333w = 0;
                next.f299335x = true;
                next.mo141269y((long) string.length());
            }
            kd02.f298618f.add(next);
        }
        String[] split = x.f227154e.split("\n");
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : split) {
            String[] split2 = str.split(XVFSFile.PATH_SEPARATOR);
            if (split2.length != 2) {
                Log.m105921e("MicroMsg.RecordMsgLogic", "parse str(%s) of desc(%s) fail", str, x.f227154e);
            } else {
                if (arrayList.contains(split2[1])) {
                    stringBuffer.append(split2[0] + XVFSFile.PATH_SEPARATOR + string);
                } else {
                    stringBuffer.append(str);
                }
                stringBuffer.append(10);
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        String substring = stringBuffer2.substring(0, stringBuffer2.length() - 1);
        kd02.mo141212j(substring);
        return new C101144i(substring, x.f227156g, kd02);
    }

    /* renamed from: v */
    public static String m132641v(String str, long j, boolean z) {
        if (z) {
            return str + "@record_download@" + j;
        }
        return str + "@record_upload@" + j;
    }

    /* renamed from: w */
    public static C100344n m132642w(C55385t tVar) {
        C100344n nVar = new C100344n();
        nVar.field_mediaId = tVar.f157722d;
        nVar.field_localId = tVar.f157725g;
        nVar.field_cdnKey = tVar.f157719a;
        nVar.field_cdnUrl = tVar.f157720b;
        nVar.field_dataId = tVar.f157721c;
        nVar.field_totalLen = (int) tVar.f157724f;
        nVar.field_offset = (int) tVar.f157723e;
        nVar.field_path = tVar.f157726h;
        nVar.field_type = 1;
        nVar.field_fileType = tVar.f157727i;
        nVar.field_isThumb = tVar.f157728j;
        nVar.field_tpaeskey = tVar.f157729k;
        nVar.field_tpauthkey = tVar.f157730l;
        nVar.field_tpdataurl = tVar.f157731m;
        return nVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x015d A[Catch:{ Exception -> 0x019d }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0164  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static te3.C77915dp3 m132643x(java.lang.String r15) {
        /*
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            java.lang.String r1 = "MicroMsg.RecordMsgLogic"
            r2 = 0
            if (r0 == 0) goto L_0x0010
            java.lang.String r15 = "xml is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r15)
            return r2
        L_0x0010:
            int r0 = r15.hashCode()
            sg.g<java.lang.Integer, te3.dp3> r3 = f296056a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            q90.d r3 = (q90.C101062d) r3
            java.lang.Object r3 = r3.get(r4)
            te3.dp3 r3 = (te3.C77915dp3) r3
            if (r3 == 0) goto L_0x002a
            java.lang.String r15 = "get record msg data from cache"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r15)
            return r3
        L_0x002a:
            java.lang.String r3 = r15.trim()
            java.lang.String r4 = "<recordinfo>"
            boolean r3 = r3.contains(r4)
            java.lang.String r5 = "recordinfo"
            if (r3 == 0) goto L_0x003e
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r15, r5, r2)
            goto L_0x0056
        L_0x003e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = "</recordinfo>"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r3, r5, r2)
        L_0x0056:
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0065
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r15
            java.lang.String r15 = "values is null: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r15, r0)
            return r2
        L_0x0065:
            te3.dp3 r6 = new te3.dp3
            r6.<init>()
            java.lang.String r7 = ".recordinfo.title"
            java.lang.Object r7 = r3.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r6.f227153d = r7
            java.lang.String r7 = ".recordinfo.desc"
            java.lang.Object r7 = r3.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r6.f227154e = r7
            java.lang.String r7 = ".recordinfo.favusername"
            java.lang.Object r7 = r3.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            r6.f227156g = r7
            java.lang.String r7 = ".recordinfo.noteinfo"
            java.lang.Object r7 = r3.get(r7)
            if (r7 == 0) goto L_0x00bb
            te3.cd0 r7 = new te3.cd0
            r7.<init>()
            java.lang.String r8 = ".recordinfo.noteinfo.noteeditor"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r7.f227116e = r8
            java.lang.String r8 = ".recordinfo.noteinfo.noteauthor"
            java.lang.Object r8 = r3.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r7.f227115d = r8
            r6.f227157h = r7
            java.lang.String r7 = ".recordinfo.edittime"
            java.lang.Object r3 = r3.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            r7 = 0
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.getLong(r3, r7)
            r6.f227158i = r7
        L_0x00bb:
            java.lang.String r3 = ""
            java.util.LinkedList<te3.rc0> r7 = r6.f227155f
            r7.clear()
            javax.xml.parsers.DocumentBuilderFactory r7 = javax.xml.parsers.DocumentBuilderFactory.newInstance()
            javax.xml.parsers.DocumentBuilder r7 = r7.newDocumentBuilder()     // Catch:{ Exception -> 0x019d }
            org.xml.sax.InputSource r8 = new org.xml.sax.InputSource     // Catch:{ Exception -> 0x019d }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x019d }
            byte[] r15 = r15.getBytes()     // Catch:{ Exception -> 0x019d }
            r9.<init>(r15)     // Catch:{ Exception -> 0x019d }
            r8.<init>(r9)     // Catch:{ Exception -> 0x019d }
            org.w3c.dom.Document r15 = r7.parse(r8)     // Catch:{ Exception -> 0x019d }
            r15.normalize()     // Catch:{ Exception -> 0x019d }
            org.w3c.dom.Element r15 = r15.getDocumentElement()     // Catch:{ Exception -> 0x019d }
            java.lang.String r7 = "datalist"
            org.w3c.dom.NodeList r15 = r15.getElementsByTagName(r7)     // Catch:{ Exception -> 0x019d }
            if (r15 == 0) goto L_0x01ab
            org.w3c.dom.Node r15 = r15.item(r4)     // Catch:{ Exception -> 0x019d }
            org.w3c.dom.NodeList r15 = r15.getChildNodes()     // Catch:{ Exception -> 0x019d }
            if (r15 == 0) goto L_0x01ab
            int r7 = r15.getLength()     // Catch:{ Exception -> 0x019d }
            if (r7 <= 0) goto L_0x01ab
            int r7 = r15.getLength()     // Catch:{ Exception -> 0x019d }
            r8 = 0
        L_0x0100:
            if (r8 >= r7) goto L_0x01ab
            org.w3c.dom.Node r9 = r15.item(r8)     // Catch:{ Exception -> 0x019d }
            java.lang.String r10 = com.tencent.p014mm.sdk.platformtools.XmlParser.nodeToString(r9)     // Catch:{ Exception -> 0x019d }
            boolean r11 = r9 instanceof org.w3c.dom.Element     // Catch:{ Exception -> 0x019d }
            if (r11 == 0) goto L_0x0199
            org.w3c.dom.Element r9 = (org.w3c.dom.Element) r9     // Catch:{ Exception -> 0x019d }
            java.lang.String r11 = "recordxml"
            org.w3c.dom.NodeList r9 = r9.getElementsByTagName(r11)     // Catch:{ Exception -> 0x019d }
            if (r9 == 0) goto L_0x0150
            int r11 = r9.getLength()     // Catch:{ Exception -> 0x019d }
            if (r11 <= 0) goto L_0x0150
            org.w3c.dom.Node r9 = r9.item(r4)     // Catch:{ Exception -> 0x019d }
            org.w3c.dom.NodeList r9 = r9.getChildNodes()     // Catch:{ Exception -> 0x019d }
            if (r9 == 0) goto L_0x0150
            int r11 = r9.getLength()     // Catch:{ Exception -> 0x019d }
            if (r11 <= 0) goto L_0x0150
            int r11 = r9.getLength()     // Catch:{ Exception -> 0x019d }
            r12 = 0
        L_0x0134:
            if (r12 >= r11) goto L_0x0150
            org.w3c.dom.Node r13 = r9.item(r12)     // Catch:{ Exception -> 0x019d }
            boolean r14 = r13 instanceof org.w3c.dom.Element     // Catch:{ Exception -> 0x019d }
            if (r14 == 0) goto L_0x014d
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.XmlParser.nodeToString(r13)     // Catch:{ Exception -> 0x019d }
            java.lang.String r11 = "recordXml: %s"
            java.lang.Object[] r12 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x019d }
            r12[r4] = r9     // Catch:{ Exception -> 0x019d }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r11, r12)     // Catch:{ Exception -> 0x019d }
            goto L_0x0151
        L_0x014d:
            int r12 = r12 + 1
            goto L_0x0134
        L_0x0150:
            r9 = r2
        L_0x0151:
            java.lang.String r11 = r10.trim()     // Catch:{ Exception -> 0x019d }
            java.lang.String r12 = "<dataitem"
            boolean r11 = r11.startsWith(r12)     // Catch:{ Exception -> 0x019d }
            if (r11 == 0) goto L_0x0164
            java.lang.String r11 = "dataitem"
            java.util.Map r10 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r10, r11, r2)     // Catch:{ Exception -> 0x019d }
            goto L_0x0165
        L_0x0164:
            r10 = r2
        L_0x0165:
            te3.rc0 r9 = qg2.C101151l0.m132649b(r10, r9, r8)     // Catch:{ Exception -> 0x0181 }
            int r10 = r9.f299258I     // Catch:{ Exception -> 0x0181 }
            if (r10 != r5) goto L_0x017b
            java.lang.String r10 = r9.f299301f     // Catch:{ Exception -> 0x0181 }
            if (r10 == 0) goto L_0x017b
            java.lang.String r11 = "‮"
            java.lang.String r10 = r10.replaceAll(r11, r3)     // Catch:{ Exception -> 0x0181 }
            r9.mo141265u(r10)     // Catch:{ Exception -> 0x0181 }
        L_0x017b:
            java.util.LinkedList<te3.rc0> r10 = r6.f227155f     // Catch:{ Exception -> 0x0181 }
            r10.add(r9)     // Catch:{ Exception -> 0x0181 }
            goto L_0x0199
        L_0x0181:
            r9 = move-exception
            java.lang.String r10 = "get record msg data from xml error: %s"
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x019d }
            java.lang.String r12 = r9.getMessage()     // Catch:{ Exception -> 0x019d }
            r11[r4] = r12     // Catch:{ Exception -> 0x019d }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r10, r11)     // Catch:{ Exception -> 0x019d }
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x019d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r9, r3, r10)     // Catch:{ Exception -> 0x019d }
            java.util.LinkedList<te3.rc0> r9 = r6.f227155f     // Catch:{ Exception -> 0x019d }
            r9.clear()     // Catch:{ Exception -> 0x019d }
        L_0x0199:
            int r8 = r8 + 1
            goto L_0x0100
        L_0x019d:
            r15 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r15 = r15.toString()
            r2[r4] = r15
            java.lang.String r15 = "[parser] parseXML exception:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r15, r2)
        L_0x01ab:
            sg.g<java.lang.Integer, te3.dp3> r15 = f296056a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            q90.d r15 = (q90.C101062d) r15
            r15.put(r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qg2.C101147j0.m132643x(java.lang.String):te3.dp3");
    }

    /* renamed from: y */
    public static String m132644y() {
        return VFSStrategy.m163776d("record") + "/";
    }

    /* renamed from: z */
    public static String m132645z(long j) {
        String y = m132644y();
        String A = m132608A(j);
        StringBuilder sb = new StringBuilder();
        sb.append(m132644y() + "record2/");
        sb.append(A);
        String sb4 = sb.toString();
        boolean z = false;
        Uri n = C116299g2.m163858n(String.format("%s/%d/", new Object[]{sb4, Long.valueOf(j)}));
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b)) {
            return sb4;
        }
        Uri n2 = C116299g2.m163858n(String.format("%s/%d/", new Object[]{y, Long.valueOf(j)}));
        String path2 = n2.getPath();
        if (path2 != null) {
            String k2 = C116299g2.m163855k(path2, false, false);
            if (!n2.getPath().equals(k2)) {
                n2 = n2.buildUpon().path(k2).build();
            }
        }
        C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n2, (C116281f0.C116288h) null);
        if (l2.mo177810a()) {
            z = l2.f348991a.mo119948x(l2.f348992b);
        }
        return z ? y : sb4;
    }
}
