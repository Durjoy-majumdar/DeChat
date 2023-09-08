package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72989o2;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.tmassistantsdk.downloadservice.ApkDownloadManager;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C75604z3;
import eb0.C97625j3;
import f40.C86709a0;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import jd3.C76403a;
import ld3.C46850c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89144l0;
import p1081gi.C98121d;
import p206nj.C76861g;

/* renamed from: com.tencent.mm.pluginsdk.model.app.x1 */
public class C72704x1 implements C11385n {

    /* renamed from: s */
    public static int f211549s;

    /* renamed from: d */
    public HashMap<Long, String> f211550d = new HashMap<>();

    /* renamed from: e */
    public Map<Integer, Object> f211551e = new ConcurrentHashMap();

    /* renamed from: f */
    public Queue<Long> f211552f = new LinkedList();

    /* renamed from: g */
    public Queue<Long> f211553g = new LinkedList();

    /* renamed from: h */
    public Map<Long, C76861g.C47263a> f211554h = new HashMap();

    /* renamed from: i */
    public boolean f211555i = false;

    /* renamed from: j */
    public boolean f211556j = false;

    /* renamed from: n */
    public boolean f211557n = false;

    /* renamed from: o */
    public int f211558o = 0;

    /* renamed from: p */
    public long f211559p = 0;

    /* renamed from: q */
    public C76861g.C47263a f211560q = new C76861g.C47263a();

    /* renamed from: r */
    public MTimerHandler f211561r = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C72708d(), false);

    /* renamed from: com.tencent.mm.pluginsdk.model.app.x1$a */
    public class C72705a implements C46850c.C46851a {

        /* renamed from: a */
        public final /* synthetic */ C72963f4 f211562a;

        /* renamed from: b */
        public final /* synthetic */ C72683d f211563b;

        /* renamed from: c */
        public final /* synthetic */ long f211564c;

        /* renamed from: d */
        public final /* synthetic */ String f211565d;

        public C72705a(C72963f4 f4Var, C72683d dVar, long j, String str) {
            this.f211562a = f4Var;
            this.f211563b = dVar;
            this.f211564c = j;
            this.f211565d = str;
        }

        /* renamed from: a */
        public void mo72061a(String str, String str2, String str3, String str4, String str5, String str6, long j) {
            int t;
            if (Util.isNullOrNil(str4)) {
                this.f211562a.mo100991d(5);
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(this.f211562a.getMsgId(), this.f211562a);
                C72963f4 f4Var = new C72963f4();
                f4Var.mo108733M2(C75604z3.m90843o(this.f211562a.mo108768t()));
                f4Var.mo108749c3(this.f211562a.mo108768t());
                f4Var.mo108732L2(str);
                f4Var.setType(10000);
                f4Var.mo100991d(6);
                f4Var.mo108740T2(0);
                ((C72972g4) C97625j3.m125812b().mo105911z()).my0(f4Var);
                C72704x1.this.f211557n = false;
                return;
            }
            C72683d dVar = this.f211563b;
            dVar.field_signature = str4;
            dVar.field_fakeAeskey = str5;
            dVar.field_fakeSignature = str6;
            dVar.field_lastModifyTime = Util.nowMilliSecond();
            String content = this.f211562a.getContent();
            if (C72996z1.m85820U5(this.f211562a.mo108768t()) && (t = C75604z3.m90848t(this.f211562a.getContent())) != -1) {
                content = (this.f211562a.getContent() + " ").substring(t + 2).trim();
            }
            C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(content), (String) null);
            if (u != null) {
                u.f195622s = str2;
                u.f195524R = str3;
                u.f195594l = (int) j;
                C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f211563b.field_msgInfoId);
                b002.mo108732L2(C68070l.C68072b.m80420s(u, (String) null, (C98121d) null));
                ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
            }
            C72709y1.vx0().update(this.f211563b, new String[0]);
            C97625j3.m125815e().mo123460f(new NetSceneUploadAppAttach(this.f211564c, (String) null, this.f211565d));
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.x1$b */
    public class C72706b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f211567d;

        /* renamed from: e */
        public final /* synthetic */ int f211568e;

        /* renamed from: f */
        public final /* synthetic */ int f211569f;

        public C72706b(C117747y yVar, int i, int i2) {
            this.f211567d = yVar;
            this.f211568e = i;
            this.f211569f = i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0152  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x01a6  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x01aa  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r16 = this;
                r0 = r16
                int r1 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.f211549s
                r2 = 1
                int r1 = r1 + r2
                com.tencent.p014mm.pluginsdk.model.app.C72704x1.f211549s = r1
                ob0.y r1 = r0.f211567d
                int r1 = r1.getType()
                r5 = 222(0xde, float:3.11E-43)
                java.lang.String r6 = " errCode:"
                r7 = -1
                r9 = 0
                java.lang.String r10 = "MicroMsg.SceneAppMsg"
                if (r1 != r5) goto L_0x003a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onSceneEnd  SendAppMsg errtype:"
                r1.append(r2)
                int r2 = r0.f211568e
                r1.append(r2)
                r1.append(r6)
                int r2 = r0.f211569f
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r1)
                r11 = r7
                goto L_0x00d2
            L_0x003a:
                ob0.y r1 = r0.f211567d
                int r1 = r1.getType()
                r5 = 221(0xdd, float:3.1E-43)
                if (r1 != r5) goto L_0x0052
                com.tencent.mm.pluginsdk.model.app.x1 r1 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                r1.f211555i = r9
                ob0.y r1 = r0.f211567d
                qg2.p r1 = (qg2.C77335p) r1
                long r11 = r1.f225467h
                int r9 = r1.f225475s
                goto L_0x00d2
            L_0x0052:
                ob0.y r1 = r0.f211567d
                int r1 = r1.getType()
                r5 = 220(0xdc, float:3.08E-43)
                if (r1 != r5) goto L_0x01bc
                com.tencent.mm.pluginsdk.model.app.x1 r1 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                r1.f211556j = r9
                ob0.y r5 = r0.f211567d
                com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach r5 = (com.tencent.p014mm.pluginsdk.model.app.NetSceneUploadAppAttach) r5
                long r11 = r5.f283444i
                int r9 = r5.f283449q
                com.tencent.mm.pluginsdk.model.app.d r5 = r5.f283441f
                r13 = 0
                if (r5 != 0) goto L_0x006f
                r14 = r13
                goto L_0x0071
            L_0x006f:
                java.lang.String r14 = r5.field_mediaSvrId
            L_0x0071:
                if (r5 != 0) goto L_0x0076
                r3 = 0
                goto L_0x0078
            L_0x0076:
                long r3 = r5.field_msgInfoId
            L_0x0078:
                java.util.HashMap<java.lang.Long, java.lang.String> r1 = r1.f211550d
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                java.lang.Object r1 = r1.remove(r3)
                java.lang.String r1 = (java.lang.String) r1
                ob0.y r3 = r0.f211567d
                com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach r3 = (com.tencent.p014mm.pluginsdk.model.app.NetSceneUploadAppAttach) r3
                java.lang.String r3 = r3.f283451s
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                r3 = r3 ^ r2
                if (r3 != 0) goto L_0x00d2
                ob0.y r3 = r0.f211567d
                com.tencent.mm.pluginsdk.model.app.NetSceneUploadAppAttach r3 = (com.tencent.p014mm.pluginsdk.model.app.NetSceneUploadAppAttach) r3
                boolean r4 = r3.f283452t
                if (r4 != 0) goto L_0x00d2
                boolean r3 = r3.f283453u
                if (r3 != 0) goto L_0x00d2
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
                if (r3 != 0) goto L_0x00d2
                com.tencent.mm.pluginsdk.model.app.d r3 = new com.tencent.mm.pluginsdk.model.app.d
                r3.<init>()
                com.tencent.mm.pluginsdk.model.app.e r4 = com.tencent.p014mm.pluginsdk.model.app.C72709y1.vx0()
                r4.get((long) r11, r3)
                long r4 = r3.systemRowid
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 != 0) goto L_0x00d2
                long r4 = r3.field_msgInfoId
                com.tencent.p014mm.pluginsdk.model.app.C72695v.m85080v(r4, r14, r13, r2)
                java.lang.String r2 = "onSceneEnd, finish update app attach, start send app msg"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r2)
                com.tencent.mm.pluginsdk.model.app.x1 r2 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                long r3 = r3.field_msgInfoId
                r2.getClass()
                com.tencent.mm.pluginsdk.model.app.j1 r2 = new com.tencent.mm.pluginsdk.model.app.j1
                r2.<init>(r3, r1, r13)
                ob0.b0 r1 = eb0.C97625j3.m125815e()
                r1.mo123460f(r2)
            L_0x00d2:
                int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r1 == 0) goto L_0x0108
                com.tencent.mm.pluginsdk.model.app.x1 r1 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                java.util.Map<java.lang.Long, nj.g$a> r1 = r1.f211554h
                java.lang.Long r2 = java.lang.Long.valueOf(r11)
                java.util.HashMap r1 = (java.util.HashMap) r1
                java.lang.Object r1 = r1.get(r2)
                if (r1 == 0) goto L_0x0108
                com.tencent.mm.pluginsdk.model.app.x1 r1 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                java.util.Map<java.lang.Long, nj.g$a> r1 = r1.f211554h
                java.lang.Long r2 = java.lang.Long.valueOf(r11)
                java.util.HashMap r1 = (java.util.HashMap) r1
                java.lang.Object r1 = r1.get(r2)
                nj.g$a r1 = (p206nj.C76861g.C47263a) r1
                long r3 = r1.mo72288a()
                com.tencent.mm.pluginsdk.model.app.x1 r1 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                java.util.Map<java.lang.Long, nj.g$a> r1 = r1.f211554h
                java.lang.Long r2 = java.lang.Long.valueOf(r11)
                java.util.HashMap r1 = (java.util.HashMap) r1
                r1.remove(r2)
                goto L_0x010a
            L_0x0108:
                r3 = 0
            L_0x010a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onSceneEnd SceneType:"
                r1.append(r2)
                ob0.y r2 = r0.f211567d
                int r2 = r2.getType()
                r1.append(r2)
                java.lang.String r2 = " errtype:"
                r1.append(r2)
                int r2 = r0.f211568e
                r1.append(r2)
                r1.append(r6)
                int r2 = r0.f211569f
                r1.append(r2)
                java.lang.String r2 = " retCode:"
                r1.append(r2)
                r1.append(r9)
                java.lang.String r2 = " rowid:"
                r1.append(r2)
                r1.append(r11)
                java.lang.String r2 = " time:"
                r1.append(r2)
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r1)
                int r1 = r0.f211568e
                if (r1 == 0) goto L_0x015a
                com.tencent.mm.pluginsdk.model.app.x1 r1 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                int r2 = r1.f211558o
                int r2 = r2 + -1
                r1.f211558o = r2
            L_0x015a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onSceneEnd  inCnt:"
                r1.append(r2)
                int r2 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.f211549s
                r1.append(r2)
                java.lang.String r2 = " stop:"
                r1.append(r2)
                com.tencent.mm.pluginsdk.model.app.x1 r2 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                int r2 = r2.f211558o
                r1.append(r2)
                java.lang.String r2 = " running:"
                r1.append(r2)
                com.tencent.mm.pluginsdk.model.app.x1 r2 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                boolean r2 = r2.f211557n
                r1.append(r2)
                java.lang.String r2 = " recving:"
                r1.append(r2)
                com.tencent.mm.pluginsdk.model.app.x1 r2 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                boolean r2 = r2.f211555i
                r1.append(r2)
                java.lang.String r2 = " sending:"
                r1.append(r2)
                com.tencent.mm.pluginsdk.model.app.x1 r2 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                boolean r2 = r2.f211556j
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r1)
                com.tencent.mm.pluginsdk.model.app.x1 r1 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.this
                int r2 = r1.f211558o
                if (r2 <= 0) goto L_0x01aa
                com.tencent.p014mm.pluginsdk.model.app.C72704x1.m85092a(r1)
                goto L_0x01b5
            L_0x01aa:
                boolean r2 = r1.f211556j
                if (r2 != 0) goto L_0x01b5
                boolean r2 = r1.f211555i
                if (r2 != 0) goto L_0x01b5
                r1.mo100170c()
            L_0x01b5:
                int r1 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.f211549s
                int r1 = r1 + -1
                com.tencent.p014mm.pluginsdk.model.app.C72704x1.f211549s = r1
                return
            L_0x01bc:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "onSceneEnd Error SceneType:"
                r1.append(r2)
                ob0.y r2 = r0.f211567d
                int r2 = r2.getType()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r1)
                int r1 = com.tencent.p014mm.pluginsdk.model.app.C72704x1.f211549s
                int r1 = r1 + -1
                com.tencent.p014mm.pluginsdk.model.app.C72704x1.f211549s = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.app.C72704x1.C72706b.run():void");
        }

        public String toString() {
            return super.toString() + "|onSceneEnd";
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.x1$c */
    public class C72707c implements Runnable {
        public C72707c() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis() - C72704x1.this.f211559p;
            Log.m105918d("MicroMsg.SceneAppMsg", "summerbig Try Run service runningFlag:" + C72704x1.this.f211557n + " timeWait:" + currentTimeMillis + " sending:" + C72704x1.this.f211556j + " recving:" + C72704x1.this.f211555i);
            if (C72704x1.this.f211557n) {
                if (currentTimeMillis >= ApkDownloadManager.INTERVAL) {
                    Log.m105920e("MicroMsg.SceneAppMsg", "summerbig ERR: Try Run service runningFlag:" + C72704x1.this.f211557n + " timeWait:" + currentTimeMillis + ">=MAX_TIME_WAIT sending:" + C72704x1.this.f211556j + " recving:" + C72704x1.this.f211555i);
                } else {
                    return;
                }
            }
            C72704x1 x1Var = C72704x1.this;
            x1Var.f211557n = true;
            x1Var.f211556j = false;
            x1Var.f211558o = 4;
            x1Var.f211555i = false;
            x1Var.f211560q.mo72289b();
            C72704x1.this.f211561r.startTimer(10);
        }

        public String toString() {
            return super.toString() + "|run";
        }
    }

    /* renamed from: com.tencent.mm.pluginsdk.model.app.x1$d */
    public class C72708d implements MTimerHandler.CallBack {
        public C72708d() {
        }

        public boolean onTimerExpired() {
            C72704x1.m85092a(C72704x1.this);
            return false;
        }

        public String toString() {
            return super.toString() + "|scenePusher";
        }
    }

    public C72704x1() {
        C97625j3.m125815e().mo123455a(220, this);
        C97625j3.m125815e().mo123455a(221, this);
        C97625j3.m125815e().mo123455a(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, this);
    }

    /* renamed from: a */
    public static void m85092a(C72704x1 x1Var) {
        List<C72683d> list;
        String str;
        C72704x1 x1Var2 = x1Var;
        Log.m105919d("MicroMsg.SceneAppMsg", "summerbig tryStartNetscene recving[%b][%d], sending[%b][%d]", Boolean.valueOf(x1Var2.f211555i), Integer.valueOf(((LinkedList) x1Var2.f211553g).size()), Boolean.valueOf(x1Var2.f211556j), Integer.valueOf(((LinkedList) x1Var2.f211552f).size()));
        x1Var2.f211559p = System.currentTimeMillis();
        String str2 = null;
        if ((!x1Var2.f211555i && ((LinkedList) x1Var2.f211553g).size() == 0) || (!x1Var2.f211556j && ((LinkedList) x1Var2.f211552f).size() == 0)) {
            try {
                list = C72709y1.vx0().mo100148Ow();
            } catch (IllegalStateException e) {
                Log.printErrStackTrace("MicroMsg.SceneAppMsg", e, "", new Object[0]);
                C72684e vx02 = C72709y1.vx0();
                vx02.getClass();
                vx02.f211495d.execSQL("appattach", " update appattach set status = 198 , lastModifyTime = " + Util.nowSecond() + " where status = " + 101);
                vx02.doNotify();
                list = null;
            }
            if (!(list == null || list.size() == 0)) {
                long j = 1000;
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                String formatUnixTime = Util.formatUnixTime(currentTimeMillis);
                for (C72683d next : list) {
                    if (((HashMap) x1Var2.f211554h).containsKey(Long.valueOf(next.systemRowid))) {
                        Log.m105918d("MicroMsg.SceneAppMsg", "summerbig File is Already running:" + next.systemRowid);
                    } else {
                        Log.m105918d("MicroMsg.SceneAppMsg", "summerbig Get file:" + next.field_fileFullPath + " status:" + next.field_status + " create:(" + Util.formatUnixTime(next.field_createTime) + "," + Util.formatUnixTime(next.field_createTime / j) + ", last:" + Util.formatUnixTime(next.field_lastModifyTime) + " now:" + Util.formatUnixTime(currentTimeMillis) + " " + (currentTimeMillis - next.field_lastModifyTime));
                        if (next.field_isUpload) {
                            if (currentTimeMillis - next.field_lastModifyTime <= 600 || next.field_status != 101) {
                                str = formatUnixTime;
                                ((LinkedList) x1Var2.f211552f).offer(Long.valueOf(next.systemRowid));
                                ((HashMap) x1Var2.f211554h).put(Long.valueOf(next.systemRowid), (Object) null);
                                formatUnixTime = str;
                                j = 1000;
                            } else {
                                Log.m105920e("MicroMsg.SceneAppMsg", "summerbig time out file: " + next.field_fileFullPath + " last:" + Util.formatUnixTime(next.field_lastModifyTime) + " now:" + formatUnixTime);
                                C72695v.m85055H(next.systemRowid);
                            }
                        }
                        str = formatUnixTime;
                        formatUnixTime = str;
                        j = 1000;
                    }
                }
                Log.m105918d("MicroMsg.SceneAppMsg", "summerbig GetNeedRun procing:" + ((HashMap) x1Var2.f211554h).size() + " [recv:" + ((LinkedList) x1Var2.f211553g).size() + ",send:" + ((LinkedList) x1Var2.f211552f).size() + "]");
                ((LinkedList) x1Var2.f211553g).size();
                ((LinkedList) x1Var2.f211552f).size();
            }
        }
        if (!x1Var2.f211555i && ((LinkedList) x1Var2.f211553g).size() == 0 && !x1Var2.f211556j && ((LinkedList) x1Var2.f211552f).size() == 0) {
            x1Var.mo100170c();
            Log.m105918d("MicroMsg.SceneAppMsg", "summerbig No Data Any More , Stop Service");
        } else if (!x1Var2.f211556j && ((LinkedList) x1Var2.f211552f).size() > 0) {
            long nullAs = Util.nullAs((Long) ((LinkedList) x1Var2.f211552f).poll(), -1);
            Log.m105924i("MicroMsg.SceneAppMsg", "summerbig Start Send :" + nullAs);
            if (nullAs != -1) {
                ((HashMap) x1Var2.f211554h).put(Long.valueOf(nullAs), new C76861g.C47263a());
                x1Var2.f211556j = true;
                C72683d dVar = new C72683d();
                if (!C72709y1.vx0().get(nullAs, dVar)) {
                    Log.m105920e("MicroMsg.SceneAppMsg", "summerbig tryStartNetscene fail, getAttachInfo fail, infoId = " + nullAs);
                    C72963f4 b002 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(dVar.field_msgInfoId);
                    b002.mo100991d(5);
                    ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b002.getMsgId(), b002);
                    x1Var2.f211556j = false;
                    return;
                }
                if (dVar.field_type == 8) {
                    C72963f4 b003 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(dVar.field_msgInfoId);
                    if (b003.getMsgId() == 0) {
                        Log.m105920e("MicroMsg.SceneAppMsg", "getEmoticonMd5 fail, msg is null :" + dVar.field_msgInfoId);
                    } else {
                        C68070l.C68072b u = C68070l.C68072b.m80422u(b003.getContent(), (String) null);
                        str2 = u != null ? u.f195610p : new C72989o2(b003.getContent()).f212821d;
                    }
                    if (str2 == null) {
                        Log.m105920e("MicroMsg.SceneAppMsg", "summerbig tryStartNetscene fail, send emoji, emoticonMd5 can not be null");
                        C72963f4 b004 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(dVar.field_msgInfoId);
                        b004.mo100991d(5);
                        ((C72972g4) C97625j3.m125812b().mo105911z()).xy0(b004.getMsgId(), b004);
                        x1Var2.f211556j = false;
                        return;
                    }
                }
                String str3 = str2;
                Log.m105925i("MicroMsg.SceneAppMsg", "tryStartNetscene rowid:%s msgId:%s", Long.valueOf(nullAs), Long.valueOf(dVar.field_msgInfoId));
                String str4 = x1Var2.f211550d.get(Long.valueOf(dVar.field_msgInfoId));
                C72963f4 b005 = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(dVar.field_msgInfoId);
                if (b005.getType() != 1090519089) {
                    x1Var.mo100172e(dVar, b005, nullAs, str4, str3);
                } else if (b005.getStatus() == 2) {
                    x1Var.mo100172e(dVar, b005, nullAs, str4, str3);
                } else {
                    new C76403a(dVar).mo9225i();
                    C89144l0.m111429e(new C76403a(dVar).f256789f, new C72703w1(x1Var, dVar, nullAs, str4, str3), false);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo100169b(long j) {
        C97625j3.m125815e().mo123460f(new C96763j1(j, (String) null, (String) null));
    }

    /* renamed from: c */
    public final void mo100170c() {
        ((HashMap) this.f211554h).clear();
        ((LinkedList) this.f211552f).clear();
        ((LinkedList) this.f211553g).clear();
        this.f211556j = false;
        this.f211555i = false;
        this.f211557n = false;
        Log.m105918d("MicroMsg.SceneAppMsg", "Finish service use time(ms):" + this.f211560q.mo72288a());
    }

    /* renamed from: d */
    public void mo100171d() {
        C86709a0.m107525e().postToWorker(new C72707c());
    }

    /* renamed from: e */
    public final void mo100172e(C72683d dVar, C72963f4 f4Var, long j, String str, String str2) {
        C72683d dVar2 = dVar;
        if (dVar2.field_totalLen > 26214400) {
            C97625j3.m125815e().mo123460f(new C46850c(C68070l.C68072b.m80422u(Util.processXml(f4Var.getContent()), (String) null), dVar2.field_fileFullPath, f4Var.mo108768t(), new C72705a(f4Var, dVar, j, str)));
            return;
        }
        C97625j3.m125815e().mo123460f(new NetSceneUploadAppAttach(j, str2, str));
    }

    public void finalize() {
        C97625j3.m125815e().mo123470p(220, this);
        C97625j3.m125815e().mo123470p(221, this);
        C97625j3.m125815e().mo123470p(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, this);
        this.f211550d.clear();
        super.finalize();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 222) {
            if (!((ConcurrentHashMap) this.f211551e).containsKey(Integer.valueOf(yVar.hashCode()))) {
                Log.m105925i("MicroMsg.SceneAppMsg", "onSceneEnd skip %s", Integer.valueOf(yVar.hashCode()));
                return;
            }
        }
        Log.m105919d("MicroMsg.SceneAppMsg", "summersafecdn onSceneEnd type:%d errType:%d errCode:%d", Integer.valueOf(yVar.getType()), Integer.valueOf(i), Integer.valueOf(i2));
        C86709a0.m107525e().postToWorker(new C72706b(yVar, i, i2));
    }
}
