package pc0;

import a70.C112760b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.C67844j;
import com.tencent.p014mm.booter.notification.C67845k;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114781l0;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import fw0.C87105o;
import java.util.Map;
import jc3.C87946d;
import jc3.C87948i;
import ob0.C11385n;
import ob0.C117747y;
import ob0.y$$d;
import org.xwalk.core.XWalkEnvironment;
import p156gj.C87200o;
import p156gj.C87203t;
import p206nj.C76861g;
import p645pj.C77091b;
import p823sg.C90193h;
import qe3.C101130q0;
import qe3.C62605p0;
import qe3.C89625d;
import qe3.C89631w;
import sf0.C48374j0;
import te3.C51024qx;
import te3.C64794w33;

/* renamed from: pc0.k */
public class C118012k extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f352754d;

    /* renamed from: e */
    public String f352755e = "";

    /* renamed from: f */
    public MTimerHandler f352756f;

    /* renamed from: g */
    public C76861g.C47263a f352757g;

    /* renamed from: h */
    public StringBuilder f352758h = new StringBuilder();

    /* renamed from: i */
    public boolean f352759i = false;

    /* renamed from: pc0.k$a */
    public static class C118013a implements C114799u {

        /* renamed from: a */
        public final C62605p0 f352760a = new C62605p0();

        /* renamed from: b */
        public final C101130q0 f352761b = new C101130q0();

        /* renamed from: c */
        public int f352762c;

        public C118013a(boolean z) {
        }

        public int getEncryptAlgo() {
            return 0;
        }

        public boolean getIsLongPolling() {
            return false;
        }

        public boolean getIsUserCmd() {
            return false;
        }

        public int getLongPollingTimeout() {
            return 0;
        }

        public int getNewExtFlags() {
            return 0;
        }

        public int getOptions() {
            return 0;
        }

        public String getReqHost() {
            return "";
        }

        public C89631w.C89634d getReqObj() {
            this.f352760a.setDeviceID(C87203t.m108273i());
            C62605p0 p0Var = this.f352760a;
            int i = C89625d.f257835a;
            p0Var.setDeviceType(C87200o.f252868a);
            this.f352760a.setClientVersion(C89625d.f257841g);
            this.f352760a.setUin(this.f352762c);
            return this.f352760a;
        }

        public C89631w.C89636e getRespObj() {
            return this.f352761b;
        }

        public int getTimeOut() {
            return 0;
        }

        public byte[] getTransHeader() {
            return null;
        }

        public int getType() {
            return 138;
        }

        public String getUri() {
            return "/cgi-bin/micromsg-bin/newsync";
        }

        public boolean isSingleSession() {
            return true;
        }

        public boolean keepAlive() {
            return false;
        }

        public void setConnectionInfo(String str) {
        }

        public void setEncryptAlgo(int i) {
        }

        public void setReqHost(String str) {
        }

        public void setSingleSession(boolean z) {
        }
    }

    public C118012k() {
        Log.m105919d("MicroMsg.NetPushSync", "dksord NetSceneSync hash:%d stack:%s", Integer.valueOf(hashCode()), Util.getStack());
        this.f352757g = new C76861g.C47263a();
        StringBuilder sb = this.f352758h;
        sb.append("stack:" + Util.getStack() + " time:" + Util.nowSecond());
    }

    public void cancel() {
        super.cancel();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f352754d = nVar;
        StringBuilder sb = this.f352758h;
        sb.append(" lastd:" + this.lastdispatch + " dotime:" + Util.nowSecond() + " net:" + NetStatusUtil.getNetType(MMApplicationContext.getContext()));
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(hashCode());
        objArr[1] = 7;
        objArr[2] = Boolean.valueOf(this.f352756f != null);
        Log.m105925i("MicroMsg.NetPushSync", "doScene[%d] selector:%d pusher:%b ", objArr);
        if (this.f352756f != null) {
            prepareDispatcher(gVar);
            this.f352756f.startTimer(0);
            this.f352756f = null;
            return -1;
        }
        C118013a aVar = new C118013a(false);
        aVar.f352762c = C114781l0.m161554a().f344208n.f344122j;
        C64794w33 w332 = ((C62605p0) aVar.getReqObj()).f177798a;
        w332.f186053e = 7;
        w332.f186054f = C48374j0.m53712a(C118000d0.f352701a.mo182756a());
        w332.f186055g = 1;
        w332.f186052d = new C51024qx();
        w332.f186056h = C87200o.f252868a;
        return dispatch(gVar, aVar, this);
    }

    public String getInfo() {
        return this.f352758h.toString();
    }

    public int getType() {
        return 138;
    }

    /* renamed from: j1 */
    public final boolean mo182787j1(int i, String str, String str2) {
        if (i == 50) {
            Log.m105924i("MicroMsg.NetPushSync", "hit voip");
            return true;
        } else if (Util.isNullOrNil(str2) || Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.NetPushSync", "check should launch to mm ,content or from username is null.");
            return false;
        } else if (i == 9998 && str.equalsIgnoreCase("weixin")) {
            Log.m105924i("MicroMsg.NetPushSync", "hit ipxx");
            return true;
        } else if (i != 10002 || !str2.contains("revokemsg")) {
            return false;
        } else {
            Log.m105924i("MicroMsg.NetPushSync", "hit MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE");
            return true;
        }
    }

    /* renamed from: k1 */
    public final void mo182788k1(long j, String str, String str2, int i) {
        if (Util.isNullOrNil(str2)) {
            Log.m105924i("MicroMsg.NetPushSync", "showNotifyCation pushContent is null, skip");
            return;
        }
        PString pString = new PString();
        PString pString2 = new PString();
        String processXml = Util.processXml(str2);
        int indexOf = processXml.indexOf("<pushcontent");
        if (indexOf > 0) {
            processXml = processXml.substring(indexOf);
        }
        Map<String, String> parseXml = XmlParser.parseXml(processXml, "pushcontent", (String) null);
        if (parseXml == null) {
            Log.m105920e("MicroMsg.NetPushSync", "inval xml");
        } else {
            pString.value = parseXml.get(".pushcontent.$content");
            pString2.value = parseXml.get(".pushcontent.$nickname");
        }
        C87948i iVar = (C87948i) C86312j.m106911c(C87948i.class);
        if (iVar.mo119068rS() != null) {
            C87946d rS = iVar.mo119068rS();
            String str3 = pString2.value;
            String str4 = pString.value;
            String str5 = (C112760b.m154216X() + C90193h.m112878f((XWalkEnvironment.MODULE_MM + C114781l0.m161554a().f344208n.f344122j).getBytes())) + "/avatar/";
            ((C87105o) rS).getClass();
            if (Util.isNullOrNil(str3)) {
                str3 = MMApplicationContext.getContext().getString(C72996z1.m85820U5(str) ? C0966R.string.bba : C0966R.string.frh);
            }
            String str6 = str3;
            C67844j jVar = C67845k.C67847b.f194757a.f194756a;
            jVar.getClass();
            if (!C77091b.m93019a()) {
                jVar.mo93232b();
            }
            try {
                jVar.f194754a.mo93229g(j, str, str6, str4, str5, false, i);
            } catch (Exception e) {
                Log.m105920e("MicroMsg.Notification.Handle", "push:notify, error");
                Log.printErrStackTrace("MicroMsg.Notification.Handle", e, "", new Object[0]);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x029b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r18, int r19, int r20, java.lang.String r21, com.tencent.p014mm.network.C114799u r22, byte[] r23) {
        /*
            r17 = this;
            r1 = r17
            r0 = r21
            r2 = 1
            java.lang.String r3 = "MicroMsg.NetPushSync"
            r4 = 0
            if (r22 == 0) goto L_0x02a5
            int r5 = r22.getType()
            r6 = 138(0x8a, float:1.93E-43)
            if (r5 == r6) goto L_0x0014
            goto L_0x02a5
        L_0x0014:
            java.lang.StringBuilder r5 = r1.f352758h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = " endtime:"
            r6.append(r7)
            long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            r5 = 7
            java.lang.Object[] r6 = new java.lang.Object[r5]
            int r7 = r17.hashCode()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r4] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r19)
            r6[r2] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            r8 = 2
            r6[r8] = r7
            r7 = 3
            r6[r7] = r0
            boolean r9 = r1.f352759i
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10 = 4
            r6[r10] = r9
            nj.g$a r9 = r1.f352757g
            long r11 = r9.mo72288a()
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r11 = 5
            r6[r11] = r9
            r9 = 6
            java.lang.StringBuilder r12 = r1.f352758h
            r6[r9] = r12
            java.lang.String r9 = "onGYNetEnd: %d [%d,%d,%s] hash isnotifydata:%b time:%d [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r9, r6)
            r6 = r19
            if (r6 != r10) goto L_0x0079
            r9 = -2006(0xfffffffffffff82a, float:NaN)
            r12 = r20
            if (r12 != r9) goto L_0x007b
            r6 = 0
            r9 = 1
            r12 = 0
            goto L_0x007c
        L_0x0079:
            r12 = r20
        L_0x007b:
            r9 = 0
        L_0x007c:
            if (r6 != 0) goto L_0x029f
            if (r12 == 0) goto L_0x0082
            goto L_0x029f
        L_0x0082:
            qe3.w$e r0 = r22.getRespObj()
            r6 = r0
            qe3.q0 r6 = (qe3.C101130q0) r6
            if (r9 != 0) goto L_0x0132
            qe3.w$d r0 = r22.getReqObj()
            qe3.p0 r0 = (qe3.C62605p0) r0
            te3.w33 r0 = r0.f177798a
            te3.qv3 r0 = r0.f186054f
            byte[] r0 = sf0.C48374j0.m53715d(r0)
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r12 = -1
            if (r0 != 0) goto L_0x00a0
            r13 = -1
            goto L_0x00a1
        L_0x00a0:
            int r13 = r0.length
        L_0x00a1:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r4] = r13
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.dumpHex(r0)
            r9[r2] = r13
            java.lang.String r13 = "dkpush req Key : %d[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r13, r9)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((byte[]) r0)
            if (r9 == 0) goto L_0x00d6
            pc0.d0$a r0 = pc0.C118000d0.f352701a
            byte[] r0 = r0.mo182756a()
            java.lang.Object[] r9 = new java.lang.Object[r8]
            if (r0 != 0) goto L_0x00c4
            r13 = -1
            goto L_0x00c5
        L_0x00c4:
            int r13 = r0.length
        L_0x00c5:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r4] = r13
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.dumpHex(r0)
            r9[r2] = r13
            java.lang.String r13 = "dkpush userinfo key : %d[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r13, r9)
        L_0x00d6:
            te3.x33 r9 = r6.f296025a
            te3.qv3 r9 = r9.f299848g
            byte[] r9 = sf0.C48374j0.m53715d(r9)
            byte[] r0 = qe3.C101126c1.m132546c(r0, r9)
            if (r0 == 0) goto L_0x00ea
            int r13 = r0.length
            if (r13 > 0) goto L_0x00e8
            goto L_0x00ea
        L_0x00e8:
            r9 = r0
            goto L_0x00ef
        L_0x00ea:
            java.lang.String r0 = "merge key failed, use server side instead"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
        L_0x00ef:
            te3.x33 r0 = r6.f296025a
            te3.qv3 r13 = sf0.C48374j0.m53712a(r9)
            r0.f299848g = r13
            te3.x33 r0 = r6.f296025a
            te3.qx r0 = r0.f299846e
            if (r0 == 0) goto L_0x0107
            java.util.LinkedList<te3.px> r0 = r0.f140594e
            if (r0 != 0) goto L_0x0102
            goto L_0x0107
        L_0x0102:
            int r0 = r0.size()
            goto L_0x0108
        L_0x0107:
            r0 = 0
        L_0x0108:
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            r13[r4] = r14
            java.lang.String r14 = "newMsgSize:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r14, r13)
            java.lang.Object[] r13 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r13[r4] = r0
            if (r9 != 0) goto L_0x0120
            goto L_0x0121
        L_0x0120:
            int r12 = r9.length
        L_0x0121:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r13[r2] = r0
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.dumpHex(r9)
            r13[r8] = r0
            java.lang.String r0 = "newMsgSize:%d, mergeKey: %d[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r0, r13)
        L_0x0132:
            te3.x33 r0 = r6.f296025a
            te3.qx r0 = r0.f299846e
            java.util.LinkedList<te3.px> r0 = r0.f140594e
            java.util.Iterator r9 = r0.iterator()
            r12 = 0
        L_0x013d:
            boolean r0 = r9.hasNext()
            java.lang.String r13 = ""
            if (r0 == 0) goto L_0x0202
            java.lang.Object r0 = r9.next()
            te3.px r0 = (te3.C50886px) r0
            int r14 = r0.f140037d
            if (r14 != r11) goto L_0x01f9
            te3.qv3 r14 = r0.f140038e
            byte[] r14 = sf0.C48374j0.m53715d(r14)
            te3.j3 r15 = new te3.j3     // Catch:{ IOException -> 0x01f1 }
            r15.<init>()     // Catch:{ IOException -> 0x01f1 }
            r15.parseFrom(r14)     // Catch:{ IOException -> 0x01f1 }
            java.lang.String r14 = "oreh msgType:%d, talker:%s, newmsgID:%d, pushContent.len:%d, content.len:%d"
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x01f1 }
            int r11 = r15.f227630g     // Catch:{ IOException -> 0x01f1 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x01f1 }
            r5[r4] = r11     // Catch:{ IOException -> 0x01f1 }
            te3.rv3 r11 = r15.f227628e     // Catch:{ IOException -> 0x01f1 }
            java.lang.String r11 = r11.f141175d     // Catch:{ IOException -> 0x01f1 }
            r5[r2] = r11     // Catch:{ IOException -> 0x01f1 }
            r16 = r3
            long r2 = r15.f227638r     // Catch:{ IOException -> 0x01ed }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ IOException -> 0x01ed }
            r5[r8] = r2     // Catch:{ IOException -> 0x01ed }
            java.lang.String r2 = r15.f227637q     // Catch:{ IOException -> 0x01ed }
            if (r2 != 0) goto L_0x017f
            r2 = 0
            goto L_0x0183
        L_0x017f:
            int r2 = r2.length()     // Catch:{ IOException -> 0x01ed }
        L_0x0183:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x01ed }
            r5[r7] = r2     // Catch:{ IOException -> 0x01ed }
            te3.rv3 r2 = r15.f227631h     // Catch:{ IOException -> 0x01ed }
            java.lang.String r2 = r2.f141175d     // Catch:{ IOException -> 0x01ed }
            if (r2 != 0) goto L_0x0191
            r2 = 0
            goto L_0x0195
        L_0x0191:
            int r2 = r2.length()     // Catch:{ IOException -> 0x01ed }
        L_0x0195:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x01ed }
            r5[r10] = r2     // Catch:{ IOException -> 0x01ed }
            r2 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r14, r5)     // Catch:{ IOException -> 0x01eb }
            int r3 = r15.f227630g     // Catch:{ IOException -> 0x01eb }
            te3.rv3 r5 = r15.f227628e     // Catch:{ IOException -> 0x01eb }
            java.lang.String r5 = r5.f141175d     // Catch:{ IOException -> 0x01eb }
            te3.rv3 r14 = r15.f227631h     // Catch:{ IOException -> 0x01eb }
            java.lang.String r14 = r14.f141175d     // Catch:{ IOException -> 0x01eb }
            boolean r3 = r1.mo182787j1(r3, r5, r14)     // Catch:{ IOException -> 0x01eb }
            if (r3 == 0) goto L_0x01b6
            r3 = r2
            r2 = 1
            r5 = 7
            r11 = 5
            r12 = 1
            goto L_0x013d
        L_0x01b6:
            long r7 = r15.f227638r     // Catch:{ IOException -> 0x01eb }
            te3.rv3 r14 = r15.f227628e     // Catch:{ IOException -> 0x01eb }
            java.lang.String r14 = r14.f141175d     // Catch:{ IOException -> 0x01eb }
            java.lang.String r3 = r15.f227637q     // Catch:{ IOException -> 0x01eb }
            int r5 = r15.f227630g     // Catch:{ IOException -> 0x01eb }
            r18 = r17
            r19 = r7
            r21 = r14
            r22 = r3
            r23 = r5
            r18.mo182788k1(r19, r21, r22, r23)     // Catch:{ IOException -> 0x01eb }
            int r3 = r15.f227630g     // Catch:{ IOException -> 0x01eb }
            r5 = 10002(0x2712, float:1.4016E-41)
            if (r3 != r5) goto L_0x01d5
            r3 = 1
            goto L_0x01d6
        L_0x01d5:
            r3 = 0
        L_0x01d6:
            if (r3 == 0) goto L_0x01fa
            java.lang.String r3 = "need remove pushContent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ IOException -> 0x01eb }
            r3 = 0
            r15.f227637q = r3     // Catch:{ IOException -> 0x01eb }
            byte[] r3 = r15.toByteArray()     // Catch:{ IOException -> 0x01eb }
            te3.qv3 r3 = sf0.C48374j0.m53712a(r3)     // Catch:{ IOException -> 0x01eb }
            r0.f140038e = r3     // Catch:{ IOException -> 0x01eb }
            goto L_0x01fa
        L_0x01eb:
            r0 = move-exception
            goto L_0x01f3
        L_0x01ed:
            r0 = move-exception
            r2 = r16
            goto L_0x01f3
        L_0x01f1:
            r0 = move-exception
            r2 = r3
        L_0x01f3:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r13, r3)
            goto L_0x01fa
        L_0x01f9:
            r2 = r3
        L_0x01fa:
            r3 = r2
            r2 = 1
            r5 = 7
            r7 = 3
            r8 = 2
            r11 = 5
            goto L_0x013d
        L_0x0202:
            r2 = r3
            te3.x33 r0 = r6.f296025a     // Catch:{ IOException -> 0x0215 }
            byte[] r0 = r0.toByteArray()     // Catch:{ IOException -> 0x0215 }
            com.tencent.mm.network.y r3 = com.tencent.p014mm.network.C114781l0.m161554a()     // Catch:{ IOException -> 0x0215 }
            com.tencent.mm.network.a r3 = r3.f344208n     // Catch:{ IOException -> 0x0215 }
            int r3 = r3.f344122j     // Catch:{ IOException -> 0x0215 }
            com.tencent.p014mm.booter.C114716m.m161366g(r0, r3)     // Catch:{ IOException -> 0x0215 }
            goto L_0x0226
        L_0x0215:
            r0 = move-exception
            r3 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r0
            java.lang.String r3 = "write syncResp buf err:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r5)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r13, r3)
        L_0x0226:
            java.lang.String r0 = "onRespHandled sync"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            pc0.d0$a r0 = pc0.C118000d0.f352701a
            te3.x33 r3 = r6.f296025a
            te3.qv3 r3 = r3.f299848g
            byte[] r3 = sf0.C48374j0.m53715d(r3)
            r0.mo182758c(r3, r4)
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0[r4] = r3
            java.lang.String r3 = "dkpush pushSyncFlag:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r0)
            if (r12 != 0) goto L_0x0292
            te3.x33 r0 = r6.f296025a
            int r0 = r0.f299847f
            r3 = 7
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0258
            boolean r0 = super.securityLimitCountReach()
            if (r0 != 0) goto L_0x0258
            r11 = 1
            goto L_0x0259
        L_0x0258:
            r11 = 0
        L_0x0259:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "continue flag="
            r0.append(r3)
            te3.x33 r3 = r6.f296025a
            int r3 = r3.f299847f
            r0.append(r3)
            java.lang.String r3 = ", selector="
            r0.append(r3)
            r3 = 7
            r0.append(r3)
            java.lang.String r3 = ", limit reach="
            r0.append(r3)
            boolean r3 = super.securityLimitCountReach()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            if (r11 == 0) goto L_0x0292
            com.tencent.mm.network.g r0 = r17.dispatcher()
            ob0.n r2 = r1.f352754d
            r1.doScene(r0, r2)
            goto L_0x0299
        L_0x0292:
            ob0.n r0 = r1.f352754d
            java.lang.String r2 = r1.f352755e
            r0.onSceneEnd(r4, r4, r2, r1)
        L_0x0299:
            if (r12 == 0) goto L_0x029e
            com.tencent.p014mm.booter.CoreService.m161342e()
        L_0x029e:
            return
        L_0x029f:
            ob0.n r2 = r1.f352754d
            r2.onSceneEnd(r6, r12, r0, r1)
            return
        L_0x02a5:
            r2 = r3
            r3 = 1
            java.lang.Object[] r0 = new java.lang.Object[r3]
            if (r22 != 0) goto L_0x02ad
            r3 = -2
            goto L_0x02b1
        L_0x02ad:
            int r3 = r22.getType()
        L_0x02b1:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r4] = r3
            java.lang.String r3 = "onGYNetEnd error type:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pc0.C118012k.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }

    public int securityLimitCount() {
        return 500;
    }

    public boolean securityLimitCountReach() {
        return super.securityLimitCountReach();
    }

    public y$$d securityVerificationChecked(C114799u uVar) {
        return y$$d.EOk;
    }
}
