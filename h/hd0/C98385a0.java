package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.xweb.util.WXWebReporter;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p206nj.C76861g;

/* renamed from: hd0.a0 */
public class C98385a0 {

    /* renamed from: k */
    public static int f288432k;

    /* renamed from: a */
    public LinkedList<Long> f288433a = new LinkedList<>();

    /* renamed from: b */
    public Map<Long, C76861g.C47263a> f288434b = new HashMap();

    /* renamed from: c */
    public Map<Long, String> f288435c = new HashMap();

    /* renamed from: d */
    public Object f288436d = new Object();

    /* renamed from: e */
    public boolean f288437e = false;

    /* renamed from: f */
    public boolean f288438f = false;

    /* renamed from: g */
    public int f288439g = 0;

    /* renamed from: h */
    public String f288440h;

    /* renamed from: i */
    public C76861g.C47263a f288441i = new C76861g.C47263a();

    /* renamed from: j */
    public MTimerHandler f288442j = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C98387b(), false);

    /* renamed from: hd0.a0$a */
    public class C98386a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ long f288443d;

        /* renamed from: e */
        public final /* synthetic */ int f288444e;

        /* renamed from: f */
        public final /* synthetic */ int f288445f;

        public C98386a(long j, int i, int i2) {
            this.f288443d = j;
            this.f288444e = i;
            this.f288445f = i2;
        }

        public void run() {
            C98385a0.f288432k++;
            C98385a0 a0Var = C98385a0.this;
            a0Var.f288437e = false;
            a0Var.f288440h = "";
            long j = this.f288443d;
            long j2 = 0;
            if (j > 0) {
                if (((HashMap) a0Var.f288434b).get(Long.valueOf(j)) != null) {
                    j2 = ((C76861g.C47263a) ((HashMap) C98385a0.this.f288434b).get(Long.valueOf(this.f288443d))).mo72288a();
                }
            }
            Log.m105925i("MicroMsg.SightMassSendService", "on ERROR massSendId: %d time: %d errType %d errCode %d", Long.valueOf(this.f288443d), Long.valueOf(j2), Integer.valueOf(this.f288444e), Integer.valueOf(this.f288445f));
            if (!(this.f288444e == 0 && this.f288445f == 0)) {
                C98385a0 a0Var2 = C98385a0.this;
                a0Var2.f288439g--;
            }
            Log.m105925i("MicroMsg.SightMassSendService", "onSceneEnd  inCnt: %d stop: %d running: %B sending: %B", Integer.valueOf(C98385a0.f288432k), Integer.valueOf(C98385a0.this.f288439g), Boolean.valueOf(C98385a0.this.f288438f), Boolean.valueOf(C98385a0.this.f288437e));
            C98385a0 a0Var3 = C98385a0.this;
            if (a0Var3.f288439g > 0) {
                C98385a0.m127690a(a0Var3);
            } else if (!a0Var3.f288437e) {
                Log.m105928w("MicroMsg.SightMassSendService", "StopFlag ERROR force do stop, fail all job");
                C98410o0 Bx0 = C98398h0.Bx0();
                LinkedList<Long> linkedList = C98385a0.this.f288433a;
                Bx0.getClass();
                if (linkedList != null && !linkedList.isEmpty()) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    StringBuilder sb = new StringBuilder();
                    sb.append('(');
                    for (int i = 0; i < linkedList.size() - 1; i++) {
                        sb.append(linkedList.get(i));
                        sb.append(',');
                    }
                    Long l = linkedList.get(linkedList.size() - 1);
                    if (l != null) {
                        sb.append(l);
                    }
                    sb.append(')');
                    String str = "UPDATE videoinfo2 SET status=198, lastmodifytime=" + currentTimeMillis + " WHERE " + "masssendid" + " IN " + sb.toString();
                    Log.m105925i("MicroMsg.VideoInfoStorage", "fail all massSendInfos, sql %s", str);
                    Bx0.f288587a.execSQL("videoinfo2", str);
                }
                C98385a0.this.mo137671b();
            }
            C98385a0.f288432k--;
        }

        public String toString() {
            return super.toString() + "|onSceneEnd";
        }
    }

    /* renamed from: hd0.a0$b */
    public class C98387b implements MTimerHandler.CallBack {
        public C98387b() {
        }

        public boolean onTimerExpired() {
            C98385a0.m127690a(C98385a0.this);
            return false;
        }

        public String toString() {
            return super.toString() + "|scenePusher";
        }
    }

    /* renamed from: hd0.a0$c */
    public final class C98388c implements C98124g.C98125a, C11385n {

        /* renamed from: d */
        public String f288448d;

        /* renamed from: e */
        public long f288449e;

        /* renamed from: f */
        public List<C98408n0> f288450f;

        /* renamed from: g */
        public C98408n0 f288451g;

        public C98388c(C98446z zVar) {
        }

        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            int i2 = i;
            C98120c cVar2 = cVar;
            C98121d dVar2 = dVar;
            Log.m105919d("MicroMsg.SightMassSendService", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", this.f288448d, Integer.valueOf(i), cVar2, dVar2);
            if (i2 == -21005) {
                Log.m105919d("MicroMsg.SightMassSendService", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", this.f288448d);
                return 0;
            } else if (i2 != 0) {
                C98385a0.m127691d(this.f288450f);
                Log.m105921e("MicroMsg.SightMassSendService", "upload to CDN error, massSendId %d, errCode %d", Long.valueOf(this.f288449e), Integer.valueOf(i));
                C98385a0.this.mo137672c(this.f288449e, 3, i2);
                return 0;
            } else if (cVar2 != null) {
                Log.m105927v("MicroMsg.SightMassSendService", "progress length %d", Long.valueOf(cVar2.field_finishedLength));
                for (C98408n0 next : this.f288450f) {
                    next.f288564k = Util.nowSecond();
                    next.f288557d = (int) cVar2.field_finishedLength;
                    next.f288548P = 1032;
                    C98429r0.m127808N(next);
                }
                return 0;
            } else {
                if (dVar2 != null) {
                    int i3 = dVar2.field_retCode;
                    if (i3 != 0) {
                        Log.m105921e("MicroMsg.SightMassSendService", "cdntra sceneResult.retCode :%d arg[%s] info[%s], massSendId[%d]", Integer.valueOf(i3), dVar2.field_arg, dVar2.field_transInfo, Long.valueOf(this.f288449e));
                        C98385a0.m127691d(this.f288450f);
                        C98385a0.this.mo137672c(this.f288449e, 3, dVar2.field_retCode);
                    } else {
                        Log.m105925i("MicroMsg.SightMassSendService", "uploadvideo by cdn, isHitCacheUpload[%d] massSendId[%d]", Integer.valueOf(dVar2.field_UploadHitCacheType), Long.valueOf(this.f288449e));
                        String str2 = ((("<msg><videomsg aeskey=\"" + dVar2.field_aesKey + "\" cdnthumbaeskey=\"" + dVar2.field_aesKey + "\" cdnvideourl=\"" + dVar2.field_fileId + "\" ") + "cdnthumburl=\"" + dVar2.field_fileId + "\" ") + "length=\"" + dVar2.field_fileLength + "\" ") + "cdnthumblength=\"" + dVar2.field_thumbimgLength + "\"/></msg>";
                        Log.m105925i("MicroMsg.SightMassSendService", "cdn callback new build cdnInfo:%s", str2);
                        for (C98408n0 next2 : this.f288450f) {
                            if (Util.isNullOrNil(next2.mo137705i())) {
                                next2.f288575v = str2;
                                next2.f288548P = 2097152;
                                Log.m105925i("MicroMsg.SightMassSendService", "massSendId[%d] info %s, update recv xml ret %B", Long.valueOf(this.f288449e), next2.mo137700d(), Boolean.valueOf(C98429r0.m127808N(next2)));
                            }
                        }
                        synchronized (C98385a0.this.f288436d) {
                            String str3 = (String) ((HashMap) C98385a0.this.f288435c).get(Long.valueOf(this.f288449e));
                            if (Util.isNullOrNil(str3)) {
                                Log.m105925i("MicroMsg.SightMassSendService", "check cdn client id FAIL do NOTHING, massSendId %d, oldClientId %s, selfClientId %s", Long.valueOf(this.f288449e), str3, this.f288448d);
                            } else {
                                Log.m105925i("MicroMsg.SightMassSendService", "check cdn client id ok do MASS SEND, massSendId %d, oldClientId %s, selfClientId %s", Long.valueOf(this.f288449e), str3, this.f288448d);
                                ((HashMap) C98385a0.this.f288435c).put(Long.valueOf(this.f288449e), "done_upload_cdn_client_id");
                                C86709a0.m107524d().mo123455a(WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES, this);
                                if (!C86709a0.m107524d().mo123461g(new C98409o(this.f288449e, this.f288451g, dVar, this.f288448d), 0)) {
                                    Log.m105920e("MicroMsg.SightMassSendService", "try to do NetSceneMassUploadSight fail");
                                    C86709a0.m107524d().mo123470p(WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES, this);
                                    C98385a0.this.mo137672c(this.f288449e, 3, 0);
                                }
                            }
                        }
                    }
                }
                return 0;
            }
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            return null;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107524d().mo123470p(WXWebReporter.KEY_FREQ_NEW_FAILED_15_TIMES, this);
            if (i == 4 && i2 == -22) {
                Log.m105920e("MicroMsg.SightMassSendService", "ERR: onGYNetEnd BLACK  errtype:" + i + " errCode:" + i2 + " massSendId:" + this.f288449e);
                List<C98408n0> list = this.f288450f;
                if (list != null && !list.isEmpty()) {
                    for (C98408n0 d : list) {
                        C98429r0.m127798D(d.mo137700d());
                    }
                }
                C98385a0.this.mo137672c(this.f288449e, i, i2);
            } else if (i == 4 && i2 != 0) {
                Log.m105920e("MicroMsg.SightMassSendService", "ERR: onGYNetEnd SERVER FAILED errtype:" + i + " errCode:" + i2 + "  massSendId:" + this.f288449e);
                C98385a0.m127691d(this.f288450f);
                C98385a0.this.mo137672c(this.f288449e, i, i2);
            } else if (i == 0 && i2 == 0) {
                for (C98408n0 next : this.f288450f) {
                    next.f288564k = Util.nowSecond();
                    next.f288562i = WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE;
                    next.f288548P = 1280;
                    if (C98429r0.m127808N(next)) {
                        Class cls = C75700k0.class;
                        if (next.f288567n > 0) {
                            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(next.f288567n);
                            int type = b002.getType();
                            Log.m105925i("MicroMsg.VideoLogic", "ashutest::updateWriteFinMassMsgInfo, msg type %d", Integer.valueOf(type));
                            if (43 == type || 62 == type) {
                                b002.mo108740T2(1);
                                b002.mo108749c3(next.mo137707k());
                                b002.mo108745Y2(next.f288556c);
                                b002.mo100991d(2);
                                b002.mo108732L2(C32829l0.m39827b(next.mo137701e(), (long) next.f288566m, false));
                                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(next.f288567n, b002);
                                Log.m105919d("MicroMsg.VideoLogic", "updateWriteFinMassMsgInfo msgId:%d", Long.valueOf(b002.getMsgId()));
                            }
                        } else {
                            C72963f4 f4Var = new C72963f4();
                            f4Var.mo108749c3(next.mo137707k());
                            f4Var.setType(62);
                            f4Var.mo108740T2(1);
                            f4Var.mo108739S2(next.mo137700d());
                            f4Var.mo100991d(2);
                            f4Var.mo108733M2(C75604z3.m90843o(next.mo137707k()));
                            next.f288567n = (long) ((int) C75604z3.m90852x(f4Var));
                            next.f288548P = 8192;
                            C98429r0.m127808N(next);
                            Log.m105919d("MicroMsg.VideoLogic", "updateWriteFinMassMsgInfo insert msgId:%d", Long.valueOf(f4Var.getMsgId()));
                        }
                    }
                    Log.m105927v("MicroMsg.SightMassSendService", "massSendId %d, file %s, set status %d", Long.valueOf(this.f288449e), next.mo137700d(), Integer.valueOf(WXWebReporter.WXWEB_IDKEY_SWITCH_WEBCORE_BY_USERTYPE));
                }
                C98385a0 a0Var = C98385a0.this;
                long j = this.f288449e;
                a0Var.getClass();
                C86709a0.m107525e().postToWorker(new C98446z(a0Var, j));
            } else {
                Log.m105920e("MicroMsg.SightMassSendService", "ERR: onGYNetEnd FAILED (WILL RETRY) errtype:" + i + " errCode:" + i2 + "  massSendId:" + this.f288449e);
                C98385a0.m127691d(this.f288450f);
                C98385a0.this.mo137672c(this.f288449e, i, i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0290  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m127690a(hd0.C98385a0 r17) {
        /*
            r0 = r17
            boolean r1 = r0.f288437e
            java.lang.String r2 = "MicroMsg.SightMassSendService"
            r3 = 0
            r4 = 1
            r5 = 2
            r6 = 0
            if (r1 != 0) goto L_0x013f
            java.util.LinkedList<java.lang.Long> r1 = r0.f288433a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x013f
            hd0.o0 r1 = hd0.C98398h0.Bx0()
            java.util.List r1 = r1.mo137725n()
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto L_0x002c
            java.lang.String r1 = "unfinish massinfo count 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            goto L_0x013f
        L_0x002c:
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            java.util.Iterator r1 = r1.iterator()
        L_0x0037:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto L_0x010b
            java.lang.Object r9 = r1.next()
            hd0.n0 r9 = (hd0.C98408n0) r9
            java.util.Map<java.lang.Long, nj.g$a> r10 = r0.f288434b
            long r11 = r9.f288577x
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            java.util.HashMap r10 = (java.util.HashMap) r10
            boolean r10 = r10.containsKey(r11)
            if (r10 == 0) goto L_0x0069
            java.lang.Object[] r10 = new java.lang.Object[r5]
            java.lang.String r11 = r9.mo137700d()
            r10[r3] = r11
            long r11 = r9.f288577x
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            r10[r4] = r9
            java.lang.String r9 = "Mass Send File is Already running %s, massSendId %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r9, r10)
            goto L_0x0037
        L_0x0069:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Get file:"
            r10.append(r11)
            java.lang.String r11 = r9.mo137700d()
            r10.append(r11)
            java.lang.String r11 = " status:"
            r10.append(r11)
            int r11 = r9.f288562i
            r10.append(r11)
            java.lang.String r11 = " user"
            r10.append(r11)
            java.lang.String r11 = r9.mo137707k()
            r10.append(r11)
            java.lang.String r11 = " human:"
            r10.append(r11)
            java.lang.String r11 = r9.mo137701e()
            r10.append(r11)
            java.lang.String r11 = " massSendId:"
            r10.append(r11)
            long r11 = r9.f288577x
            r10.append(r11)
            java.lang.String r11 = " massSendList:"
            r10.append(r11)
            java.lang.String r11 = r9.f288578y
            r10.append(r11)
            java.lang.String r11 = " create:"
            r10.append(r11)
            long r11 = r9.f288563j
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r11)
            r10.append(r11)
            java.lang.String r11 = " last:"
            r10.append(r11)
            long r11 = r9.f288564k
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r11)
            r10.append(r11)
            java.lang.String r11 = " now:"
            r10.append(r11)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.formatUnixTime(r7)
            r10.append(r11)
            java.lang.String r11 = " "
            r10.append(r11)
            long r11 = r9.f288564k
            long r11 = r7 - r11
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r10)
            int r10 = r9.f288562i
            r11 = 200(0xc8, float:2.8E-43)
            if (r10 != r11) goto L_0x0037
            java.util.LinkedList<java.lang.Long> r10 = r0.f288433a
            long r11 = r9.f288577x
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r10.offer(r11)
            java.util.Map<java.lang.Long, nj.g$a> r10 = r0.f288434b
            long r11 = r9.f288577x
            java.lang.Long r9 = java.lang.Long.valueOf(r11)
            java.util.HashMap r10 = (java.util.HashMap) r10
            r10.put(r9, r6)
            goto L_0x0037
        L_0x010b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "GetNeedRun procing:"
            r1.append(r7)
            java.util.Map<java.lang.Long, nj.g$a> r7 = r0.f288434b
            java.util.HashMap r7 = (java.util.HashMap) r7
            int r7 = r7.size()
            r1.append(r7)
            java.lang.String r7 = " [send:"
            r1.append(r7)
            java.util.LinkedList<java.lang.Long> r7 = r0.f288433a
            int r7 = r7.size()
            r1.append(r7)
            java.lang.String r7 = "]"
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            java.util.LinkedList<java.lang.Long> r1 = r0.f288433a
            r1.size()
        L_0x013f:
            boolean r1 = r0.f288437e
            if (r1 != 0) goto L_0x0155
            java.util.LinkedList<java.lang.Long> r1 = r0.f288433a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0155
            r17.mo137671b()
            java.lang.String r0 = "No Data Any More , Stop Service"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r0)
            goto L_0x038e
        L_0x0155:
            boolean r1 = r0.f288437e
            if (r1 != 0) goto L_0x038e
            java.util.LinkedList<java.lang.Long> r1 = r0.f288433a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x038e
            java.util.LinkedList<java.lang.Long> r1 = r0.f288433a
            java.lang.Object r1 = r1.poll()
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r3] = r1
            java.lang.String r8 = "Start Mass Send, ID: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r8, r7)
            if (r1 == 0) goto L_0x038e
            java.util.Map<java.lang.Long, nj.g$a> r7 = r0.f288434b
            nj.g$a r8 = new nj.g$a
            r8.<init>()
            java.util.HashMap r7 = (java.util.HashMap) r7
            r7.put(r1, r8)
            r0.f288437e = r4
            long r7 = r1.longValue()
            java.lang.Class<qo.l> r9 = p663qo.C101213l.class
            hd0.o0 r10 = hd0.C98398h0.Bx0()
            java.util.List r10 = r10.mo137722h(r7)
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x019f
            java.lang.String r4 = "check use cdn fail: mass send video list empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
            goto L_0x0379
        L_0x019f:
            java.util.Iterator r11 = r10.iterator()
        L_0x01a3:
            boolean r12 = r11.hasNext()
            r13 = 3
            r14 = 4
            if (r12 == 0) goto L_0x020f
            java.lang.Object r12 = r11.next()
            hd0.n0 r12 = (hd0.C98408n0) r12
            java.lang.String r15 = r12.mo137707k()
            boolean r15 = eb0.C45628s0.m50751P(r15)
            if (r15 == 0) goto L_0x01d4
            java.lang.Object[] r9 = new java.lang.Object[r13]
            java.lang.String r10 = r12.mo137707k()
            r9[r3] = r10
            java.lang.String r10 = r12.f288578y
            r9[r4] = r10
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r9[r5] = r4
            java.lang.String r4 = "cdntra not use cdn user:%s, list %s, massSendId %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r9)
            goto L_0x0379
        L_0x01d4:
            di3.d r15 = di3.C86312j.m106911c(r9)
            qo.l r15 = (p663qo.C101213l) r15
            boolean r15 = r15.dm0(r5)
            if (r15 != 0) goto L_0x01a3
            int r15 = r12.f288573t
            if (r15 == r4) goto L_0x01a3
            java.lang.Object[] r10 = new java.lang.Object[r14]
            di3.d r9 = di3.C86312j.m106911c(r9)
            qo.l r9 = (p663qo.C101213l) r9
            boolean r9 = r9.dm0(r5)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r10[r3] = r9
            int r9 = r12.f288573t
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10[r4] = r9
            java.lang.String r4 = r12.f288578y
            r10[r5] = r4
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            r10[r13] = r4
            java.lang.String r4 = "cdntra not use cdn flag:%b getCdnInfo:%d, list %s, massSendId %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r10)
            goto L_0x0379
        L_0x020f:
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L_0x0216
            goto L_0x0287
        L_0x0216:
            r11 = 0
        L_0x0217:
            int r12 = r10.size()
            if (r11 >= r12) goto L_0x0287
            java.lang.Object r12 = r10.get(r11)
            hd0.n0 r12 = (hd0.C98408n0) r12
            java.lang.String r15 = r12.mo137700d()
            hd0.n0 r15 = hd0.C98429r0.m127818i(r15)
            r6 = 5
            if (r15 == 0) goto L_0x025c
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r16 = r12.mo137700d()
            r6[r3] = r16
            java.lang.Integer r16 = java.lang.Integer.valueOf(r11)
            r6[r4] = r16
            int r16 = r10.size()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r6[r5] = r16
            java.lang.Long r16 = java.lang.Long.valueOf(r7)
            r6[r13] = r16
            java.lang.String r12 = r12.f288578y
            r6[r14] = r12
            java.lang.String r12 = "check %s ok, index %d, size %d, massSendId %d, massSendList %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r12, r6)
            r10.remove(r11)
            r10.add(r11, r15)
            goto L_0x0288
        L_0x025c:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r15 = r12.mo137700d()
            r6[r3] = r15
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            r6[r4] = r15
            int r15 = r10.size()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            r6[r5] = r15
            java.lang.Long r15 = java.lang.Long.valueOf(r7)
            r6[r13] = r15
            java.lang.String r12 = r12.f288578y
            r6[r14] = r12
            java.lang.String r12 = "check %s fail, index %d, size %d, massSendId %d, massSendList %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r12, r6)
            int r11 = r11 + 1
            r6 = 0
            goto L_0x0217
        L_0x0287:
            r15 = 0
        L_0x0288:
            if (r15 != 0) goto L_0x0290
            java.lang.String r4 = "check use cdn fail: no valid info"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r4)
            goto L_0x02bf
        L_0x0290:
            long r11 = r15.f288563j
            java.lang.String r6 = r15.f288578y
            java.lang.String r14 = r15.mo137700d()
            java.lang.String r5 = "upvideo"
            java.lang.String r5 = com.tencent.p014mm.modelcdntran.C1297x.m1387b(r5, r11, r6, r14)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r6 == 0) goto L_0x02c2
            java.lang.Object[] r5 = new java.lang.Object[r13]
            java.lang.String r6 = r15.mo137700d()
            r5[r3] = r6
            long r6 = r15.f288577x
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5[r4] = r6
            java.lang.String r4 = r15.f288578y
            r6 = 2
            r5[r6] = r4
            java.lang.String r4 = "cdntra genClientId failed not use cdn file:%s, massSendId %d, massSendList %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r2, r4, r5)
        L_0x02bf:
            r6 = 0
            goto L_0x0379
        L_0x02c2:
            java.lang.String r6 = r15.mo137700d()
            hd0.o0 r11 = hd0.C98398h0.Bx0()
            java.lang.String r11 = r11.mo137729r(r6)
            hd0.o0 r12 = hd0.C98398h0.Bx0()
            java.lang.String r6 = r12.mo137728q(r6)
            hd0.a0$c r12 = new hd0.a0$c
            r13 = 0
            r12.<init>(r13)
            r12.f288450f = r10
            r12.f288449e = r7
            r12.f288448d = r5
            com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r12.f288451g = r15
            gi.g r7 = new gi.g
            r7.<init>()
            java.lang.String r8 = "task_NetSceneUploadVideo_2"
            r7.f287660d = r8
            r7.f287662f = r12
            r7.field_mediaId = r5
            r7.field_fullpath = r6
            r7.field_thumbpath = r11
            r6 = 4
            r7.field_fileType = r6
            r7.field_smallVideoFlag = r4
            java.lang.String r6 = r15.f288578y
            r7.field_talker = r6
            r6 = 2
            r7.field_priority = r6
            r7.field_needStorage = r3
            r7.field_isStreamMedia = r3
            java.lang.String r6 = r15.mo137705i()
            java.lang.String r8 = "msg"
            r11 = 0
            java.util.Map r6 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r6, r8, r11)
            if (r6 == 0) goto L_0x032c
            java.lang.String r8 = ".msg.videomsg.$cdnvideourl"
            java.lang.Object r8 = r6.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r7.field_fileId = r8
            java.lang.String r8 = ".msg.videomsg.$aeskey"
            java.lang.Object r6 = r6.get(r8)
            java.lang.String r6 = (java.lang.String) r6
            r7.field_aesKey = r6
            goto L_0x0331
        L_0x032c:
            java.lang.String r6 = "cdntra parse video recv xml failed"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r6)
        L_0x0331:
            di3.d r6 = di3.C86312j.m106911c(r9)
            qo.l r6 = (p663qo.C101213l) r6
            boolean r6 = r6.if0(r7)
            if (r6 != 0) goto L_0x0344
            java.lang.String r4 = "cdntra addSendTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
            r6 = r11
            goto L_0x0379
        L_0x0344:
            java.util.Iterator r6 = r10.iterator()
        L_0x0348:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0378
            java.lang.Object r7 = r6.next()
            hd0.n0 r7 = (hd0.C98408n0) r7
            int r8 = r7.f288573t
            if (r8 == r4) goto L_0x0348
            r7.f288573t = r4
            r8 = 524288(0x80000, float:7.34684E-40)
            r7.f288548P = r8
            boolean r8 = hd0.C98429r0.m127808N(r7)
            r9 = 2
            java.lang.Object[] r10 = new java.lang.Object[r9]
            java.lang.String r7 = r7.mo137700d()
            r10[r3] = r7
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r8)
            r10[r4] = r7
            java.lang.String r7 = "update %s useCDN, result %B"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r7, r10)
            goto L_0x0348
        L_0x0378:
            r6 = r5
        L_0x0379:
            r0.f288440h = r6
            if (r6 != 0) goto L_0x0387
            r0.f288437e = r3
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r0.f288442j
            r1 = 10
            r0.startTimer(r1)
            goto L_0x038e
        L_0x0387:
            java.util.Map<java.lang.Long, java.lang.String> r0 = r0.f288435c
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r1, r6)
        L_0x038e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hd0.C98385a0.m127690a(hd0.a0):void");
    }

    /* renamed from: d */
    public static void m127691d(List<C98408n0> list) {
        if (list != null && !list.isEmpty()) {
            for (C98408n0 d : list) {
                C98429r0.m127799E(d.mo137700d());
            }
        }
    }

    /* renamed from: b */
    public final void mo137671b() {
        ((HashMap) this.f288435c).clear();
        ((HashMap) this.f288434b).clear();
        this.f288433a.clear();
        this.f288437e = false;
        this.f288438f = false;
        Log.m105918d("MicroMsg.SightMassSendService", "Finish service use time(ms):" + this.f288441i.mo72288a());
    }

    /* renamed from: c */
    public void mo137672c(long j, int i, int i2) {
        C86709a0.m107525e().postToWorker(new C98386a(j, i, i2));
    }
}
