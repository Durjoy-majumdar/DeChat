package pc0;

import com.tencent.p014mm.autogen.events.SendMsgFailEvent;
import com.tencent.p014mm.modelsimple.C1307j0;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.wcdb.database.SQLiteException;
import di3.C86312j;
import eb0.C75569c4;
import eb0.C75570d3;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C7628p0;
import f40.C86709a0;
import f62.C75698i0;
import f62.C75700k0;
import f62.C75705n0;
import f62.C75707s0;
import f62.C75710x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;
import kj2.C117407d;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import ob0.y$$d;
import sf0.C90188n0;
import te3.C48936c04;
import te3.C51163rv3;
import te3.C64249b04;
import te3.C78020yw2;

/* renamed from: pc0.r */
public class C77065r extends C117747y implements C1311n {

    /* renamed from: q */
    public static final List<C75570d3> f225106q = new ArrayList();

    /* renamed from: d */
    public C11385n f225107d;

    /* renamed from: e */
    public C47350c f225108e;

    /* renamed from: f */
    public long f225109f;

    /* renamed from: g */
    public int f225110g;

    /* renamed from: h */
    public final List<C72963f4> f225111h;

    /* renamed from: i */
    public int f225112i;

    /* renamed from: j */
    public boolean f225113j;

    /* renamed from: n */
    public final List<C72963f4> f225114n;

    /* renamed from: o */
    public C72963f4 f225115o;

    /* renamed from: p */
    public C75705n0 f225116p;

    /* renamed from: pc0.r$a */
    public class C77066a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f225117d;

        /* renamed from: pc0.r$a$a */
        public class C77067a implements C11385n {
            public C77067a() {
            }

            public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
                yVar.setHasCallbackToQueue(true);
                Log.m105925i("MicroMsg.NetSceneSendMsg", "summerdktext verifypsw onSceneEnd[%d, %d] needVerifyPswList size[%d] errMsg[%s] verifyingPsw[%b], retryVerifyCount[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(C77065r.this.f225114n.size()), str, Boolean.valueOf(C77065r.this.f225113j), Integer.valueOf(C77065r.this.f225112i));
                if (i == 0 && i2 == 0) {
                    C77065r.this.f225114n.clear();
                    C77065r.this.mo107373j1(str);
                } else {
                    C77065r rVar = C77065r.this;
                    List<C72963f4> list = rVar.f225114n;
                    rVar.getClass();
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        rVar.mo107375l1(list.get(i3));
                    }
                    C77066a aVar = C77066a.this;
                    C77065r rVar2 = C77065r.this;
                    rVar2.f225107d.onSceneEnd(4, -49, aVar.f225117d, rVar2);
                    C77065r rVar3 = C77065r.this;
                    List<C72963f4> list2 = rVar3.f225114n;
                    rVar3.getClass();
                    for (int i4 = 0; i4 < list2.size(); i4++) {
                        rVar3.mo107377n1(list2.get(i4));
                    }
                    C77065r.this.f225114n.clear();
                }
                C77065r.this.f225113j = false;
                C90188n0.f258917K = false;
            }
        }

        public C77066a(String str) {
            this.f225117d = str;
        }

        public void run() {
            new C1307j0(5, "", "", "", "", false, 1, false).doScene(C77065r.this.dispatcher(), new C77067a());
        }
    }

    public C77065r(String str, String str2, int i, int i2, Object obj) {
        boolean z;
        String str3 = str;
        Object obj2 = obj;
        Class cls = C75698i0.class;
        Class cls2 = C75700k0.class;
        this.f225110g = 15;
        this.f225111h = new LinkedList();
        this.f225112i = 3;
        this.f225113j = false;
        this.f225114n = new ArrayList();
        this.f225115o = null;
        this.f225116p = null;
        if (Log.getLogLevel() <= 1) {
            Log.m105919d("MicroMsg.NetSceneSendMsg", "dktext :%s", Util.getStack());
        }
        if (!Util.isNullOrNil(str)) {
            C72963f4 f4Var = new C72963f4();
            f4Var.mo100991d(1);
            f4Var.mo108749c3(str3);
            f4Var.mo108733M2(C75604z3.m90843o(str));
            f4Var.mo108740T2(1);
            f4Var.mo108732L2(str2);
            f4Var.setType(i);
            String B00 = ((C75710x0) C86312j.m106911c(C75710x0.class)).B00(f4Var);
            Object[] objArr = new Object[3];
            objArr[0] = B00;
            objArr[1] = Boolean.valueOf(obj2 == null);
            objArr[2] = Integer.valueOf(i2);
            Log.m105925i("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] rawSource:%s args is null:%s flag:%s", objArr);
            if (!Util.isNullOrNil(B00) && !B00.startsWith("<msgsource>")) {
                Log.m105929w("MicroMsg.NetSceneSendMsg", "[mergeMsgSource] WTF the msgsource is right? %s", B00);
            } else if ((i2 & 1) != 0 && (obj2 instanceof HashMap)) {
                StringBuffer stringBuffer = new StringBuffer();
                if (Util.isNullOrNil(B00)) {
                    stringBuffer.append("<msgsource>");
                }
                for (Map.Entry entry : ((HashMap) obj2).entrySet()) {
                    String str4 = (String) entry.getValue();
                    String str5 = (String) entry.getKey();
                    if (Util.isNullOrNil(str4) || Util.isNullOrNil(str5)) {
                        Log.m105929w("MicroMsg.NetSceneSendMsg", "%s %s", str5, str4);
                    } else if (!"similar_paste_seq".equalsIgnoreCase(str5)) {
                        stringBuffer.append("<");
                        stringBuffer.append(str5);
                        stringBuffer.append(">");
                        stringBuffer.append(str4);
                        stringBuffer.append("</");
                        stringBuffer.append(str5);
                        stringBuffer.append(">");
                    }
                }
                if (Util.isNullOrNil(B00)) {
                    stringBuffer.append("</msgsource>");
                    B00 = stringBuffer.toString();
                } else {
                    B00 = B00.replace("<msgsource>", "<msgsource>" + stringBuffer.toString());
                }
            }
            if (!Util.isNullOrNil(B00)) {
                f4Var.mo101012p4(B00);
                Log.m105925i("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", f4Var.mo108773x2());
            }
            int i3 = i2 & 4;
            if (i3 == 0 && (i2 & 8) == 0) {
                int i4 = i2 & 16;
                if (!(i4 == 0 && (i2 & 32) == 0)) {
                    int i5 = i4 != 0 ? 4 : 5;
                    Log.m105925i("MicroMsg.NetSceneSendMsg", "has paste similar change flag, %d", Integer.valueOf(i5));
                    HashMap hashMap = new HashMap();
                    hashMap.put(".msgsource.alnode.cf", String.valueOf(i5));
                    if (obj2 instanceof HashMap) {
                        hashMap.put(".msgsource.alnode.inlenlist", (String) ((HashMap) obj2).get("similar_paste_seq"));
                    }
                    C75569c4.m90664J(f4Var, C75569c4.m90656B(hashMap), false);
                }
            } else {
                int i6 = i3 != 0 ? 2 : 3;
                Log.m105925i("MicroMsg.NetSceneSendMsg", "has paste fully flag, %d", Integer.valueOf(i6));
                HashMap hashMap2 = new HashMap();
                hashMap2.put(".msgsource.alnode.cf", String.valueOf(i6));
                if (obj2 instanceof HashMap) {
                    hashMap2.put(".msgsource.alnode.inlenlist", (String) ((HashMap) obj2).get("similar_paste_seq"));
                }
                C75569c4.m90664J(f4Var, C75569c4.m90656B(hashMap2), false);
            }
            try {
                this.f225109f = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).ny0(f4Var, true);
                z = false;
            } catch (SQLiteException e) {
                z = false;
                C117407d.INSTANCE.idkeyStat(111, 255, 1, false);
                if (e.toString().contains("UNIQUE constraint failed")) {
                    Log.m105920e("MicroMsg.NetSceneSendMsg", "fallback to insert");
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).zy0();
                    this.f225109f = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).ny0(f4Var, true);
                } else {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                z = false;
                Log.printErrStackTrace("MicroMsg.NetSceneSendMsg", e2, "", new Object[0]);
            }
            if (this.f225109f == -1) {
                C117407d.INSTANCE.idkeyStat(111, 255, 1, false);
            } else if (((C75698i0) C86312j.m106911c(cls)).bc0(str3)) {
                ((C75698i0) C86312j.m106911c(cls)).mo106021Qq(str, C75592q0.m90789s(), str2, this.f225109f);
            }
            Assert.assertTrue(this.f225109f != -1 ? true : z);
            Log.m105924i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.f225109f);
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        List<C72963f4> list;
        Class cls = C75700k0.class;
        this.f225107d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64249b04();
        bVar.f127067b = new C48936c04();
        bVar.f127068c = "/cgi-bin/micromsg-bin/newsendmsg";
        bVar.f127069d = 522;
        bVar.f127070e = 237;
        bVar.f127071f = 1000000237;
        C47350c a = bVar.mo72403a();
        this.f225108e = a;
        C64249b04 b042 = (C64249b04) a.f127055a.f127080a;
        C72963f4 f4Var = this.f225115o;
        if (f4Var == null) {
            list = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).Ox0(this.f225110g);
        } else {
            if (f4Var.getStatus() != 5) {
                Log.m105929w("MicroMsg.NetSceneSendMsg", "msg:%d status:%d should not be resend !", Long.valueOf(this.f225115o.getMsgId()), Integer.valueOf(this.f225115o.getStatus()));
            }
            this.f225115o.mo100991d(1);
            ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f225109f, this.f225115o);
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f225115o);
            this.f225115o = null;
            list = arrayList;
        }
        if (list.size() == 0) {
            Log.m105928w("MicroMsg.NetSceneSendMsg", "no sending message");
            return -2;
        }
        ((LinkedList) this.f225111h).clear();
        for (int i = 0; i < list.size(); i++) {
            C72963f4 f4Var2 = (C72963f4) list.get(i);
            if (f4Var2.mo108769t2() == 1) {
                C78020yw2 yw22 = new C78020yw2();
                C51163rv3 rv32 = new C51163rv3();
                rv32.f141175d = f4Var2.mo108768t();
                rv32.f141176e = true;
                yw22.f228642d = rv32;
                yw22.f228645g = (int) (f4Var2.getCreateTime() / 1000);
                yw22.f228644f = f4Var2.getType();
                yw22.f228643e = f4Var2.getContent();
                yw22.f228646h = C7628p0.m7761a(C75592q0.m90789s(), f4Var2.getCreateTime()).hashCode();
                if (((C75707s0) C86312j.m106911c(C75707s0.class)).mo96078pq(f4Var2.mo108768t())) {
                    yw22.f228648j = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69662L3(f4Var2.mo108768t());
                }
                if (this.f225116p == null) {
                    this.f225116p = ((C75710x0) C86312j.m106911c(C75710x0.class)).Sr0();
                }
                Log.m105925i("MicroMsg.NetSceneSendMsg", "using message source assembler %s", this.f225116p);
                this.f225116p.mo106024h(yw22, f4Var2);
                Log.m105925i("MicroMsg.NetSceneSendMsg", "reqCmd.MsgSource:%s", yw22.f228647i);
                b042.f182206e.add(yw22);
                b042.f182205d = b042.f182206e.size();
                ((LinkedList) this.f225111h).add(f4Var2);
                Log.m105919d("MicroMsg.NetSceneSendMsg", "Req MsgSource %s", yw22.f228647i);
            }
        }
        int dispatch = dispatch(gVar, this.f225108e, this);
        if (dispatch < 0) {
            Log.m105925i("MicroMsg.NetSceneSendMsg", "mark all failed. do scene %d", Integer.valueOf(dispatch));
            for (int i2 = 0; i2 < ((LinkedList) this.f225111h).size(); i2++) {
                mo107374k1(i2);
            }
        }
        return dispatch;
    }

    public int getType() {
        return 522;
    }

    /* renamed from: j1 */
    public final void mo107373j1(String str) {
        Log.m105918d("MicroMsg.NetSceneSendMsg", "continue send msg in list");
        int doScene = doScene(dispatcher(), this.f225107d);
        if (doScene == -2) {
            this.f225107d.onSceneEnd(0, 0, str, this);
        } else if (doScene < 0) {
            this.f225107d.onSceneEnd(3, -1, str, this);
        }
    }

    /* renamed from: k1 */
    public final void mo107374k1(int i) {
        C72963f4 f4Var = this.f225111h.get(i);
        Log.m105929w("MicroMsg.NetSceneSendMsg", "markMsgFailed for id:%d", Long.valueOf(f4Var.getMsgId()));
        mo107375l1(f4Var);
    }

    /* renamed from: l1 */
    public final void mo107375l1(C72963f4 f4Var) {
        f4Var.mo100991d(5);
        C117407d.INSTANCE.idkeyStat(111, 30, 1, true);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).xy0(f4Var.getMsgId(), f4Var);
        Iterator it = ((ArrayList) f225106q).iterator();
        while (it.hasNext()) {
            ((C75570d3) it.next()).mo102659f3(f4Var.mo108768t(), f4Var.getContent());
        }
    }

    /* renamed from: m1 */
    public final void mo107376m1(int i) {
        List<C72963f4> list = this.f225111h;
        if (list == null) {
            Log.m105920e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, sendingList is null");
        } else if (i >= list.size() || i < 0) {
            Log.m105921e("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent, index:%d, sendingList.size:%d", Integer.valueOf(i), Integer.valueOf(this.f225111h.size()));
        } else {
            mo107377n1(this.f225111h.get(i));
        }
    }

    /* renamed from: n1 */
    public final void mo107377n1(C72963f4 f4Var) {
        SendMsgFailEvent sendMsgFailEvent = new SendMsgFailEvent();
        sendMsgFailEvent.f193928d.f193929a = f4Var;
        sendMsgFailEvent.publish();
        Log.m105919d("MicroMsg.NetSceneSendMsg", "publishMsgSendFailEvent for msgId:%d", Long.valueOf(f4Var.getMsgId()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r34, int r35, int r36, java.lang.String r37, com.tencent.p014mm.network.C114799u r38, byte[] r39) {
        /*
            r33 = this;
            r0 = r33
            r1 = r36
            r2 = r37
            java.lang.Class<f62.k0> r3 = f62.C75700k0.class
            bp3.p r4 = bp3.C79758p.f233760a
            xf3.c r5 = new xf3.c
            r5.<init>()
            java.lang.Object r4 = r4.mo109880c(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r6 = 1
            if (r4 != r6) goto L_0x001e
            r4 = 1
            goto L_0x001f
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 == 0) goto L_0x0023
            r4 = 4
            goto L_0x0025
        L_0x0023:
            r4 = r35
        L_0x0025:
            java.lang.String r8 = "MicroMsg.NetSceneSendMsg"
            if (r4 != 0) goto L_0x030b
            if (r1 == 0) goto L_0x002d
            goto L_0x030b
        L_0x002d:
            ob0.c r11 = r0.f225108e
            ob0.c$d r11 = r11.f127056b
            pe3.a r11 = r11.f127083a
            te3.c04 r11 = (te3.C48936c04) r11
            java.util.LinkedList<te3.zw2> r12 = r11.f131433e
            java.lang.Class<f62.s0> r13 = f62.C75707s0.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            f62.s0 r13 = (f62.C75707s0) r13
            int r11 = r11.f131434f
            r13.mo96077Vq(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List<com.tencent.mm.storage.f4> r13 = r0.f225111h
            java.util.LinkedList r13 = (java.util.LinkedList) r13
            int r13 = r13.size()
            int r14 = r12.size()
            if (r13 != r14) goto L_0x02e7
            r13 = 0
        L_0x0058:
            int r14 = r12.size()
            if (r13 >= r14) goto L_0x02bc
            java.lang.Object r14 = r12.get(r13)
            te3.zw2 r14 = (te3.C52318zw2) r14
            int r15 = r14.f146252d
            if (r15 != 0) goto L_0x01ef
            boolean r15 = sf0.C90188n0.f258917K
            if (r15 == 0) goto L_0x006e
            goto L_0x01ef
        L_0x006e:
            java.util.List<com.tencent.mm.storage.f4> r15 = r0.f225111h
            java.util.LinkedList r15 = (java.util.LinkedList) r15
            java.lang.Object r15 = r15.get(r13)
            com.tencent.mm.storage.f4 r15 = (com.tencent.p014mm.storage.C72963f4) r15
            long r6 = r15.getMsgId()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r9 = "msg local id = "
            r15.append(r9)
            r15.append(r6)
            java.lang.String r9 = ", SvrId = "
            r15.append(r9)
            r9 = r11
            long r10 = r14.f146259n
            r15.append(r10)
            java.lang.String r10 = " sent successfully!"
            r15.append(r10)
            java.lang.String r10 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r10)
            k40.a r10 = f40.C86709a0.m107533q(r3)
            f62.k0 r10 = (f62.C75700k0) r10
            g62.l r10 = r10.mo96095LE()
            com.tencent.mm.storage.g4 r10 = (com.tencent.p014mm.storage.C72972g4) r10
            com.tencent.mm.storage.f4 r10 = r10.b00(r6)
            r15 = r6
            long r5 = r14.f146259n
            r10.mo108745Y2(r5)
            java.lang.String r5 = r14.f146260o
            r6 = 0
            eb0.C75569c4.m90666L(r10, r5, r6)
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]
            r5 = r12
            long r11 = r14.f146259n
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r7[r6] = r11
            int r6 = sf0.C90188n0.f258951s
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r12 = 1
            r7[r12] = r6
            java.lang.String r6 = "dkmsgid  set svrmsgid %d -> %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r6, r7)
            int r6 = sf0.C90188n0.f258950r
            r7 = 10007(0x2717, float:1.4023E-41)
            if (r7 != r6) goto L_0x00e7
            int r6 = sf0.C90188n0.f258951s
            if (r6 == 0) goto L_0x00e7
            long r6 = (long) r6
            r10.mo108745Y2(r6)
            r6 = 0
            sf0.C90188n0.f258951s = r6
        L_0x00e7:
            int r6 = r10.f230723F
            r6 = r6 & 512(0x200, float:7.175E-43)
            if (r6 <= 0) goto L_0x00ef
            r6 = 1
            goto L_0x00f0
        L_0x00ef:
            r6 = 0
        L_0x00f0:
            if (r6 == 0) goto L_0x0108
            int r6 = r10.getType()
            r7 = 42
            if (r6 != r7) goto L_0x0108
            java.lang.Class<g62.r> r6 = g62.C45887r.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            g62.r r6 = (g62.C45887r) r6
            r7 = 21
            r12 = 1
            r6.mo71222up(r10, r7, r12)
        L_0x0108:
            r6 = 2
            r10.mo100991d(r6)
            k40.a r6 = f40.C86709a0.m107533q(r3)
            f62.k0 r6 = (f62.C75700k0) r6
            g62.l r6 = r6.mo96095LE()
            com.tencent.mm.storage.g4 r6 = (com.tencent.p014mm.storage.C72972g4) r6
            r11 = r15
            r6.xy0(r11, r10)
            java.util.List<com.tencent.mm.storage.f4> r6 = r0.f225111h
            if (r6 != 0) goto L_0x0126
            java.lang.String r6 = "publishMsgSendSuccessEvent, sendingList is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r6)
            goto L_0x016b
        L_0x0126:
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            int r6 = r6.size()
            if (r13 >= r6) goto L_0x016d
            if (r13 >= 0) goto L_0x0131
            goto L_0x016d
        L_0x0131:
            java.util.List<com.tencent.mm.storage.f4> r6 = r0.f225111h
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            java.lang.Object r6 = r6.get(r13)
            com.tencent.mm.storage.f4 r6 = (com.tencent.p014mm.storage.C72963f4) r6
            long r10 = r6.getMsgId()
            r6 = 1
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            r7 = 0
            r12[r7] = r6
            r6 = r10
            java.lang.String r10 = "publishMsgSendSuccessEvent for msgId:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r8, r10, r12)
            k40.a r10 = f40.C86709a0.m107533q(r3)
            f62.k0 r10 = (f62.C75700k0) r10
            g62.l r10 = r10.mo96095LE()
            com.tencent.mm.storage.g4 r10 = (com.tencent.p014mm.storage.C72972g4) r10
            com.tencent.mm.storage.f4 r6 = r10.b00(r6)
            com.tencent.mm.autogen.events.SendMsgSuccessEvent r7 = new com.tencent.mm.autogen.events.SendMsgSuccessEvent
            r7.<init>()
            com.tencent.mm.autogen.events.SendMsgSuccessEvent$a r10 = r7.f193930d
            r10.f193931a = r6
            r7.publish()
        L_0x016b:
            r10 = 1
            goto L_0x018b
        L_0x016d:
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r10 = 0
            r7[r10] = r6
            java.util.List<com.tencent.mm.storage.f4> r6 = r0.f225111h
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            int r6 = r6.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r10 = 1
            r7[r10] = r6
            java.lang.String r6 = "publishMsgSendSuccessEvent, index:%d, sendingList.size:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r6, r7)
        L_0x018b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r13)
            r7 = r9
            r7.add(r6)
            int r6 = r14.f146258j
            if (r10 != r6) goto L_0x01e9
            kj2.d r6 = kj2.C117407d.INSTANCE
            java.lang.Object[] r12 = new java.lang.Object[r10]
            long r9 = r14.f146259n
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r10 = 0
            r12[r10] = r9
            r9 = 11942(0x2ea6, float:1.6734E-41)
            r11 = 1
            r6.mo160140o(r9, r11, r10, r12)
            r9 = 11945(0x2ea9, float:1.6739E-41)
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r23 = r3
            r24 = r4
            long r3 = r14.f146259n
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12[r10] = r3
            r6.mo160140o(r9, r10, r11, r12)
            r3 = 11946(0x2eaa, float:1.674E-41)
            java.lang.Object[] r4 = new java.lang.Object[r11]
            long r11 = r14.f146259n
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r4[r10] = r9
            r6.mo160140o(r3, r10, r10, r4)
            r3 = 90
            r18 = 0
            r9 = 1
            r22 = 0
            r16 = 90
            r20 = 1
            r15 = r6
            r15.idkeyStat(r16, r18, r20, r22)
            r18 = 1
            r22 = 1
            r16 = r3
            r20 = r9
            r15.idkeyStat(r16, r18, r20, r22)
            goto L_0x0277
        L_0x01e9:
            r23 = r3
            r24 = r4
            goto L_0x0277
        L_0x01ef:
            r23 = r3
            r24 = r4
            r7 = r11
            r5 = r12
            kj2.d r25 = kj2.C117407d.INSTANCE
            r26 = 111(0x6f, double:5.5E-322)
            r28 = 252(0xfc, double:1.245E-321)
            r30 = 1
            r32 = 0
            r25.idkeyStat(r26, r28, r30, r32)
            int r3 = r14.f146252d
            r4 = -49
            if (r3 == r4) goto L_0x0239
            boolean r4 = sf0.C90188n0.f258917K
            if (r4 == 0) goto L_0x020d
            goto L_0x0239
        L_0x020d:
            r4 = 3
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            int r3 = r14.f146254f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = r14.f146260o
            r4 = 2
            r1[r4] = r3
            java.lang.String r3 = "send msg fail ret = %s MsgId=%s MsgSource=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r1)
            r0.mo107374k1(r13)
            ob0.n r1 = r0.f225107d
            int r3 = r14.f146252d
            r4 = 4
            r1.onSceneEnd(r4, r3, r2, r0)
            r0.mo107376m1(r13)
            return
        L_0x0239:
            r4 = 4
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r6[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r4 = 1
            r6[r4] = r3
            boolean r3 = sf0.C90188n0.f258917K
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4 = 2
            r6[r4] = r3
            int r3 = r0.f225112i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 3
            r6[r4] = r3
            java.lang.String r3 = "summerdktext send msg failed: item ret code[%d], index[%d], testVerifyPsw[%b], retryVerifyCount[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r6)
            boolean r3 = r0.f225113j
            if (r3 == 0) goto L_0x0279
            java.util.List<com.tencent.mm.storage.f4> r3 = r0.f225111h
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            java.lang.Object r3 = r3.get(r13)
            com.tencent.mm.storage.f4 r3 = (com.tencent.p014mm.storage.C72963f4) r3
            java.util.List<com.tencent.mm.storage.f4> r4 = r0.f225114n
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.add(r3)
        L_0x0277:
            r4 = 4
            goto L_0x02b1
        L_0x0279:
            int r3 = r0.f225112i
            if (r3 >= 0) goto L_0x028c
            r0.mo107374k1(r13)
            ob0.n r1 = r0.f225107d
            int r3 = r14.f146252d
            r4 = 4
            r1.onSceneEnd(r4, r3, r2, r0)
            r0.mo107376m1(r13)
            return
        L_0x028c:
            r4 = 4
            r6 = 1
            r0.f225113j = r6
            int r3 = r3 + -1
            r0.f225112i = r3
            java.util.List<com.tencent.mm.storage.f4> r3 = r0.f225111h
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            java.lang.Object r3 = r3.get(r13)
            com.tencent.mm.storage.f4 r3 = (com.tencent.p014mm.storage.C72963f4) r3
            java.util.List<com.tencent.mm.storage.f4> r6 = r0.f225114n
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r3)
            com.tencent.mm.sdk.platformtools.MMHandlerThread r3 = f40.C86709a0.m107525e()
            pc0.r$a r6 = new pc0.r$a
            r6.<init>(r2)
            r3.postToWorker(r6)
        L_0x02b1:
            int r13 = r13 + 1
            r12 = r5
            r11 = r7
            r3 = r23
            r4 = r24
            r6 = 1
            goto L_0x0058
        L_0x02bc:
            r24 = r4
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.util.List<com.tencent.mm.storage.f4> r4 = r0.f225114n
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            int r13 = r13 - r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r5 = 0
            r3[r5] = r4
            java.util.List<com.tencent.mm.storage.f4> r4 = r0.f225114n
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            r3[r5] = r4
            java.lang.String r4 = "summerdktext total  [%d]msgs sent successfully, [%d]msgs need verifypsw"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r3)
            goto L_0x02ea
        L_0x02e7:
            r24 = r4
            r5 = 1
        L_0x02ea:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            boolean r4 = r0.f225113j
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = "summerdktext send finish, continue send SENDING msg verifyingPsw[%b]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r4, r3)
            boolean r3 = r0.f225113j
            if (r3 == 0) goto L_0x0307
            ob0.n r3 = r0.f225107d
            r7 = r24
            r3.onSceneEnd(r7, r1, r2, r0)
            goto L_0x030a
        L_0x0307:
            r0.mo107373j1(r2)
        L_0x030a:
            return
        L_0x030b:
            r7 = r4
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r5 = 0
            r4[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r36)
            r5 = 1
            r4[r5] = r3
            java.lang.String r3 = "mark all failed. onGYNetEnd. errType:%d errCode:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r3, r4)
            kj2.d r3 = kj2.C117407d.INSTANCE
            r4 = 111(0x6f, double:5.5E-322)
            int r6 = r7 + 40
            long r9 = (long) r6
            r20 = 1
            r19 = 1
            r13 = 111(0x6f, double:5.5E-322)
            r17 = 1
            r12 = r3
            r15 = r9
            r12.idkeyStat(r13, r15, r17, r19)
            r15 = 253(0xfd, double:1.25E-321)
            r19 = 0
            r13 = r4
            r17 = r20
            r12.idkeyStat(r13, r15, r17, r19)
            r3 = 413(0x19d, float:5.79E-43)
            if (r1 != r3) goto L_0x03ab
            ob0.c r3 = r0.f225108e
            ob0.c$c r3 = r3.f127055a
            pe3.a r3 = r3.f127080a
            int r3 = r3.computeSize()
            int r4 = r0.f225110g
            r5 = 2
            int r4 = r4 / r5
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9 = 0
            r6[r9] = r3
            int r3 = r0.f225110g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10 = 1
            r6[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r6[r5] = r3
            java.lang.String r3 = "send msgs req exceed max limit, size %s, sendMsgMaxNum %s, newSendMsgMaxNum %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r8, r3, r6)
            int r3 = r0.f225110g
            if (r3 != r10) goto L_0x03a0
            java.lang.String r3 = "one msg exceed?????"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r3)
            r6 = 0
        L_0x037a:
            java.util.List<com.tencent.mm.storage.f4> r3 = r0.f225111h
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            int r3 = r3.size()
            if (r6 >= r3) goto L_0x038a
            r0.mo107374k1(r6)
            int r6 = r6 + 1
            goto L_0x037a
        L_0x038a:
            ob0.n r3 = r0.f225107d
            r3.onSceneEnd(r7, r1, r2, r0)
            r5 = 0
        L_0x0390:
            java.util.List<com.tencent.mm.storage.f4> r1 = r0.f225111h
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            int r1 = r1.size()
            if (r5 >= r1) goto L_0x03aa
            r0.mo107376m1(r5)
            int r5 = r5 + 1
            goto L_0x0390
        L_0x03a0:
            r0.f225110g = r4
            r0.mo107373j1(r2)
            java.lang.String r1 = "resend SENDING msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r8, r1)
        L_0x03aa:
            return
        L_0x03ab:
            r3 = 3
            r9 = 0
            if (r7 == r3) goto L_0x03ee
            r3 = 9
            if (r7 == r3) goto L_0x03ee
            r3 = 7
            if (r7 == r3) goto L_0x03ee
            r3 = 8
            if (r7 == r3) goto L_0x03ee
            r3 = 1
            if (r7 != r3) goto L_0x03be
            goto L_0x03ee
        L_0x03be:
            r6 = 0
        L_0x03bf:
            java.util.List<com.tencent.mm.storage.f4> r3 = r0.f225111h
            java.util.LinkedList r3 = (java.util.LinkedList) r3
            int r3 = r3.size()
            if (r6 >= r3) goto L_0x03cf
            r0.mo107374k1(r6)
            int r6 = r6 + 1
            goto L_0x03bf
        L_0x03cf:
            ob0.n r3 = r0.f225107d
            r3.onSceneEnd(r7, r1, r2, r0)
            r5 = 0
        L_0x03d5:
            java.util.List<com.tencent.mm.storage.f4> r1 = r0.f225111h
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            int r1 = r1.size()
            if (r5 >= r1) goto L_0x03e5
            r0.mo107376m1(r5)
            int r5 = r5 + 1
            goto L_0x03d5
        L_0x03e5:
            java.lang.String r1 = "send fail, continue send SENDING msg"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            r0.mo107373j1(r2)
            return
        L_0x03ee:
            ob0.n r3 = r0.f225107d
            r3.onSceneEnd(r7, r1, r2, r0)
            java.lang.String r1 = "Message delivery failed due to network reasons."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r8, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pc0.C77065r.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 10;
    }

    public boolean securityLimitCountReach() {
        boolean securityLimitCountReach = super.securityLimitCountReach();
        if (securityLimitCountReach) {
            C117407d.INSTANCE.idkeyStat(111, 254, 1, false);
        }
        return securityLimitCountReach;
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return this.f225111h.size() > 0 ? y$$d.EOk : y$$d.EFailed;
    }

    public boolean uniqueInNetsceneQueue() {
        return true;
    }

    public C77065r(String str, String str2, int i, int i2, long j) {
        String str3 = str;
        int i3 = i;
        Class cls = C75698i0.class;
        Class cls2 = C75700k0.class;
        this.f225110g = 15;
        this.f225111h = new LinkedList();
        this.f225112i = 3;
        boolean z = false;
        this.f225113j = false;
        this.f225114n = new ArrayList();
        this.f225115o = null;
        this.f225116p = null;
        if (Log.getLogLevel() <= 1) {
            Log.m105919d("MicroMsg.NetSceneSendMsg", "dktext :%s", Util.getStack());
        }
        if (!Util.isNullOrNil(str)) {
            C72963f4 f4Var = new C72963f4();
            f4Var.mo100991d(1);
            f4Var.mo108749c3(str3);
            f4Var.mo108733M2(C75604z3.m90843o(str));
            f4Var.mo108740T2(1);
            f4Var.mo108732L2(str2);
            f4Var.setType(i3);
            if (i2 == 1 && i3 == 42) {
                f4Var.mo101009o4();
            }
            String B00 = ((C75710x0) C86312j.m106911c(C75710x0.class)).B00(f4Var);
            if (!Util.isNullOrNil(B00)) {
                f4Var.mo101012p4(B00);
                Log.m105925i("MicroMsg.NetSceneSendMsg", "NetSceneSendMsg:MsgSource:%s", f4Var.mo108773x2());
            }
            try {
                this.f225109f = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).ny0(f4Var, true);
            } catch (SQLiteException e) {
                C117407d.INSTANCE.idkeyStat(111, 255, 1, false);
                if (e.toString().contains("UNIQUE constraint failed")) {
                    Log.m105920e("MicroMsg.NetSceneSendMsg", "fallback to insert");
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).zy0();
                    this.f225109f = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls2)).mo96095LE()).ny0(f4Var, true);
                } else {
                    throw e;
                }
            } catch (IllegalStateException e2) {
                Log.printErrStackTrace("MicroMsg.NetSceneSendMsg", e2, "", new Object[0]);
            }
            if (this.f225109f != -1 && ((C75698i0) C86312j.m106911c(cls)).bc0(str3)) {
                ((C75698i0) C86312j.m106911c(cls)).mo106021Qq(str, C75592q0.m90789s(), str2, this.f225109f);
            }
            Assert.assertTrue(this.f225109f != -1 ? true : z);
            Log.m105924i("MicroMsg.NetSceneSendMsg", "new msg inserted to db , local id = " + this.f225109f);
        }
    }

    public C77065r(long j, int i) {
        this.f225110g = 15;
        this.f225111h = new LinkedList();
        this.f225112i = 3;
        this.f225113j = false;
        this.f225114n = new ArrayList();
        this.f225115o = null;
        this.f225116p = null;
        Log.m105924i("MicroMsg.NetSceneSendMsg", "resend msg , local id = " + j);
        this.f225109f = j;
        this.f225115o = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
    }

    public C77065r() {
        this.f225110g = 15;
        this.f225111h = new LinkedList();
        this.f225112i = 3;
        this.f225113j = false;
        this.f225114n = new ArrayList();
        this.f225115o = null;
        this.f225116p = null;
        Log.m105919d("MicroMsg.NetSceneSendMsg", "dktext :%s", Util.getStack());
        Log.m105924i("MicroMsg.NetSceneSendMsg", "empty msg sender created");
    }
}
