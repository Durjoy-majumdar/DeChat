package p195li;

import a11.C39479c;
import android.os.Message;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenImMigrateStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import f40.C86709a0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Future;
import zt3.C119157j;

/* renamed from: li.d */
public class C46860d {

    /* renamed from: a */
    public Future f126042a = null;

    /* renamed from: b */
    public ConcurrentLinkedDeque<String> f126043b = new ConcurrentLinkedDeque<>();

    /* renamed from: c */
    public ConcurrentHashMap<String, String> f126044c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public String f126045d = "";

    /* renamed from: e */
    public MMHandler f126046e = new C46861a("OpenImMigrateService");

    /* renamed from: f */
    public Runnable f126047f = new C46862b();

    /* renamed from: li.d$a */
    public class C46861a extends MMHandler {
        public C46861a(String str) {
            super(str);
        }

        public void handleMessage(Message message) {
            Log.m105925i("MicroMsg.openIm.OpenImMigrateService", "handleMessage running, %s", Integer.valueOf(C46860d.this.f126043b.size()));
            if (!C46860d.this.f126043b.isEmpty()) {
                C46860d dVar = C46860d.this;
                dVar.f126042a = ((C119157j) C119157j.f356862d).mo183876g(dVar.f126047f, "migrate_tag");
            }
        }
    }

    /* renamed from: li.d$b */
    public class C46862b implements Runnable {
        public C46862b() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.String} */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x029e, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x02a3, code lost:
            r0 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x029e A[ExcHandler: Exception (e java.lang.Exception), PHI: r18 r22 r23 
          PHI: (r18v14 int) = (r18v7 int), (r18v7 int), (r18v7 int), (r18v7 int), (r18v7 int), (r18v6 int), (r18v6 int), (r18v6 int) binds: [B:70:0x01b3, B:91:0x0220, B:92:?, B:87:0x0215, B:73:0x01bb, B:40:0x00cc, B:43:0x00dd, B:46:0x00fa] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r22v5 java.lang.String) = (r22v1 java.lang.String), (r22v1 java.lang.String), (r22v1 java.lang.String), (r22v1 java.lang.String), (r22v1 java.lang.String), (r22v6 java.lang.String), (r22v6 java.lang.String), (r22v6 java.lang.String) binds: [B:70:0x01b3, B:91:0x0220, B:92:?, B:87:0x0215, B:73:0x01bb, B:40:0x00cc, B:43:0x00dd, B:46:0x00fa] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r23v15 long) = (r23v11 long), (r23v11 long), (r23v11 long), (r23v11 long), (r23v11 long), (r23v22 long), (r23v22 long), (r23v22 long) binds: [B:70:0x01b3, B:91:0x0220, B:92:?, B:87:0x0215, B:73:0x01bb, B:40:0x00cc, B:43:0x00dd, B:46:0x00fa] A[DONT_GENERATE, DONT_INLINE], Splitter:B:46:0x00fa] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r27 = this;
                r1 = r27
                java.lang.String r0 = "migrate length:%s"
                com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_OPEN_IM_MIGRATE_TO_CHAT_ROOM_STRING_SYNC
                com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_OPEN_IM_MIGRATING_CHAT_ROOM_STRING_SYNC
                java.lang.String r4 = "migrate %s to %s, msgNum %s, time %s, finish %s"
                java.lang.Class<f62.k0> r5 = f62.C75700k0.class
                java.lang.String r6 = "MicroMsg.openIm.OpenImMigrateService"
                java.lang.String r7 = ""
                long r8 = java.lang.System.currentTimeMillis()
                r14 = 1
                r15 = 0
                f40.o r16 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0325, all -> 0x031b }
                com.tencent.mm.storage.v1 r10 = r16.mo121142i()     // Catch:{ Exception -> 0x0325, all -> 0x031b }
                java.lang.Object r10 = r10.mo119685f(r2, r7)     // Catch:{ Exception -> 0x0325, all -> 0x031b }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0325, all -> 0x031b }
                boolean r16 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x0325, all -> 0x031b }
                if (r16 == 0) goto L_0x006d
                li.d r10 = p195li.C46860d.this     // Catch:{ Exception -> 0x0065, all -> 0x005d }
                java.util.concurrent.ConcurrentLinkedDeque<java.lang.String> r10 = r10.f126043b     // Catch:{ Exception -> 0x0065, all -> 0x005d }
                java.lang.Object r10 = r10.removeFirst()     // Catch:{ Exception -> 0x0065, all -> 0x005d }
                java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x0065, all -> 0x005d }
                li.d r12 = p195li.C46860d.this     // Catch:{ Exception -> 0x0059, all -> 0x0055 }
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r12 = r12.f126044c     // Catch:{ Exception -> 0x0059, all -> 0x0055 }
                java.lang.Object r12 = r12.remove(r10)     // Catch:{ Exception -> 0x0059, all -> 0x0055 }
                java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0059, all -> 0x0055 }
                f40.o r17 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                com.tencent.mm.storage.v1 r11 = r17.mo121142i()     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                r11.mo119677K(r2, r10)     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                f40.o r11 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                com.tencent.mm.storage.v1 r11 = r11.mo121142i()     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                r11.mo119677K(r3, r12)     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                goto L_0x007c
            L_0x0055:
                r0 = move-exception
                r2 = r4
                r12 = r7
                goto L_0x0061
            L_0x0059:
                r0 = move-exception
                r2 = r4
                r12 = r7
                goto L_0x0069
            L_0x005d:
                r0 = move-exception
                r2 = r4
                r10 = r7
                r12 = r10
            L_0x0061:
                r23 = r8
                goto L_0x0321
            L_0x0065:
                r0 = move-exception
                r2 = r4
                r10 = r7
                r12 = r10
            L_0x0069:
                r23 = r8
                goto L_0x032b
            L_0x006d:
                f40.o r11 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x0315, all -> 0x030f }
                com.tencent.mm.storage.v1 r11 = r11.mo121142i()     // Catch:{ Exception -> 0x0315, all -> 0x030f }
                java.lang.Object r11 = r11.mo119685f(r3, r7)     // Catch:{ Exception -> 0x0315, all -> 0x030f }
                r12 = r11
                java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0315, all -> 0x030f }
            L_0x007c:
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                if (r11 != 0) goto L_0x02be
                boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                if (r11 == 0) goto L_0x008a
                goto L_0x02be
            L_0x008a:
                k40.a r11 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                f62.k0 r11 = (f62.C75700k0) r11     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                com.tencent.mm.storage.v3 r11 = r11.mo96094Ku()     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                com.tencent.mm.storage.i2 r11 = (com.tencent.p014mm.storage.C44660i2) r11     // Catch:{ Exception -> 0x02ba, all -> 0x02b6 }
                r11.mo69763f(r12)     // Catch:{ Exception -> 0x02ba, all -> 0x02b6 }
                k40.a r11 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                f62.k0 r11 = (f62.C75700k0) r11     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                g62.l r11 = r11.mo96095LE()     // Catch:{ Exception -> 0x030b, all -> 0x0307 }
                com.tencent.mm.storage.g4 r11 = (com.tencent.p014mm.storage.C72972g4) r11     // Catch:{ Exception -> 0x02ba, all -> 0x02b6 }
                r13 = 50
                java.util.List r11 = r11.Gx0(r12, r13)     // Catch:{ Exception -> 0x02ba, all -> 0x02b6 }
                java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ Exception -> 0x02ba, all -> 0x02b6 }
                int r18 = r11.size()     // Catch:{ Exception -> 0x02ba, all -> 0x02b6 }
                int r18 = r18 + 0
                java.lang.Object[] r13 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x02b0, all -> 0x02aa }
                int r20 = r11.size()     // Catch:{ Exception -> 0x02b0, all -> 0x02aa }
                java.lang.Integer r20 = java.lang.Integer.valueOf(r20)     // Catch:{ Exception -> 0x02b0, all -> 0x02aa }
                r13[r15] = r20     // Catch:{ Exception -> 0x02b0, all -> 0x02aa }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r0, r13)     // Catch:{ Exception -> 0x02b0, all -> 0x02aa }
                java.util.Iterator r13 = r11.iterator()     // Catch:{ Exception -> 0x02b0, all -> 0x02aa }
            L_0x00c6:
                boolean r20 = r13.hasNext()     // Catch:{ Exception -> 0x02b0, all -> 0x02aa }
                if (r20 == 0) goto L_0x0121
                java.lang.Object r20 = r13.next()     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
                r15 = r20
                com.tencent.mm.storage.f4 r15 = (com.tencent.p014mm.storage.C72963f4) r15     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
                r15.mo108749c3(r10)     // Catch:{ Exception -> 0x011b, all -> 0x0115 }
                r20 = r13
                java.lang.String r13 = "migrate1 id:%s"
                r22 = r4
                java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                long r23 = r15.getMsgId()     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                java.lang.Long r23 = java.lang.Long.valueOf(r23)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                r21 = 0
                r4[r21] = r23     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r13, r4)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                k40.a r4 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                f62.k0 r4 = (f62.C75700k0) r4     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                g62.l r4 = r4.mo96095LE()     // Catch:{ Exception -> 0x0110, all -> 0x010b }
                r23 = r8
                long r8 = r15.getMsgId()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r4.xy0(r8, r15)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r13 = r20
                r4 = r22
                r8 = r23
                r15 = 0
                goto L_0x00c6
            L_0x010b:
                r0 = move-exception
                r23 = r8
                goto L_0x02a6
            L_0x0110:
                r0 = move-exception
                r23 = r8
                goto L_0x029f
            L_0x0115:
                r0 = move-exception
                r23 = r8
                r2 = r4
                goto L_0x0374
            L_0x011b:
                r0 = move-exception
                r23 = r8
                r2 = r4
                goto L_0x032d
            L_0x0121:
                r22 = r4
                r23 = r8
                int r4 = r11.size()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r8 = 50
                if (r4 != r8) goto L_0x01a9
                r4 = 0
            L_0x012e:
                if (r4 != 0) goto L_0x01a9
                k40.a r8 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                f62.k0 r8 = (f62.C75700k0) r8     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                g62.l r8 = r8.mo96095LE()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r9 = 500(0x1f4, float:7.0E-43)
                com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                java.util.List r8 = r8.Gx0(r12, r9)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                int r9 = r8.size()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                if (r9 != 0) goto L_0x014e
                r19 = r0
                r4 = 1
                goto L_0x01a5
            L_0x014e:
                java.lang.Object[] r9 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                int r13 = r11.size()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r15 = 0
                r9[r15] = r13     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r0, r9)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                java.util.Iterator r9 = r8.iterator()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
            L_0x0162:
                boolean r13 = r9.hasNext()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                if (r13 == 0) goto L_0x019d
                java.lang.Object r13 = r9.next()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.f4 r13 = (com.tencent.p014mm.storage.C72963f4) r13     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r13.mo108749c3(r10)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                java.lang.String r15 = "migrate2 id:%s"
                r19 = r0
                java.lang.Object[] r0 = new java.lang.Object[r14]     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                long r25 = r13.getMsgId()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                java.lang.Long r20 = java.lang.Long.valueOf(r25)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r21 = 0
                r0[r21] = r20     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r6, r15, r0)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                k40.a r0 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                g62.l r0 = r0.mo96095LE()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                long r14 = r13.getMsgId()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r0.xy0(r14, r13)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r0 = r19
                r14 = 1
                goto L_0x0162
            L_0x019d:
                r19 = r0
                int r0 = r8.size()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                int r18 = r18 + r0
            L_0x01a5:
                r0 = r19
                r14 = 1
                goto L_0x012e
            L_0x01a9:
                k40.a r0 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                f62.k0 r0 = (f62.C75700k0) r0     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0     // Catch:{ Exception -> 0x029e, all -> 0x02a3 }
                com.tencent.mm.storage.h2 r0 = r0.mo69771j(r10)     // Catch:{ Exception -> 0x029e, all -> 0x02a3 }
                if (r0 != 0) goto L_0x01ec
                com.tencent.mm.storage.h2 r0 = new com.tencent.mm.storage.h2     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r0.<init>(r10)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                k40.a r4 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                f62.k0 r4 = (f62.C75700k0) r4     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.u3 r4 = r4.mo96097Ni()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.z1 r4 = r4.get(r10)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                if (r4 == 0) goto L_0x01ea
                java.lang.String r8 = r4.getUsername()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                if (r8 != 0) goto L_0x01ea
                boolean r4 = r4.mo62940x3()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                if (r4 == 0) goto L_0x01ea
                r8 = 0
                r4 = 2
                long r8 = g62.C45881a.m51165b(r0, r4, r8)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r0.mo101161T2(r8)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
            L_0x01ea:
                r4 = 1
                goto L_0x01ed
            L_0x01ec:
                r4 = 0
            L_0x01ed:
                java.lang.String r8 = r0.getUsername()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                int r8 = eb0.C75604z3.m90850v(r8)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r0.mo108805a3(r8)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                if (r4 == 0) goto L_0x020b
                k40.a r5 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                f62.k0 r5 = (f62.C75700k0) r5     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.v3 r5 = r5.mo96094Ku()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.i2 r5 = (com.tencent.p014mm.storage.C44660i2) r5     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                long r8 = r5.mo69751W(r0)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                goto L_0x021d
            L_0x020b:
                k40.a r5 = f40.C86709a0.m107533q(r5)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                f62.k0 r5 = (f62.C75700k0) r5     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.v3 r5 = r5.mo96094Ku()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.i2 r5 = (com.tencent.p014mm.storage.C44660i2) r5     // Catch:{ Exception -> 0x029e, all -> 0x02a3 }
                r8 = 1
                int r5 = r5.mo69775m0(r0, r10, r8, r8)     // Catch:{ Exception -> 0x029e, all -> 0x02a3 }
                long r8 = (long) r5
            L_0x021d:
                java.lang.String r5 = "migrateTask conversationStg chatName：%s newConv:%s ret:%s msgCount:%s"
                r11 = 4
                java.lang.Object[] r13 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r11 = 0
                r13[r11] = r10     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r11 = 1
                r13[r11] = r4     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                java.lang.Long r4 = java.lang.Long.valueOf(r8)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r8 = 2
                r13[r8] = r4     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                int r0 = r0.mo108780A2()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r4 = 3
                r13[r4] = r0     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r13)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                li.d r0 = p195li.C46860d.this     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                p195li.C46860d.m52179a(r0, r10)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                li.d r0 = p195li.C46860d.this     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                p195li.C46860d.m52179a(r0, r12)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r4 = 1
                p195li.C46860d.m52180d(r10, r12, r4)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r0.mo119677K(r2, r7)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r0.mo119677K(r3, r7)     // Catch:{ Exception -> 0x029e, all -> 0x02a5 }
                r2 = 5
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r7)
                r3 = 0
                r0[r3] = r2
                java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r7)
                r3 = 1
                r0[r3] = r2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
                r3 = 2
                r0[r3] = r2
                long r2 = java.lang.System.currentTimeMillis()
                long r2 = r2 - r23
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r3 = 3
                r0[r3] = r2
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r3 = 4
                r0[r3] = r2
                r2 = r22
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
                li.d r0 = p195li.C46860d.this
                com.tencent.mm.sdk.platformtools.MMHandler r0 = r0.f126046e
                r2 = 0
                r0.sendEmptyMessage(r2)
                goto L_0x0372
            L_0x029e:
                r0 = move-exception
            L_0x029f:
                r2 = r22
                goto L_0x032d
            L_0x02a3:
                r0 = move-exception
                goto L_0x02a6
            L_0x02a5:
                r0 = move-exception
            L_0x02a6:
                r2 = r22
                goto L_0x0374
            L_0x02aa:
                r0 = move-exception
                r2 = r4
                r23 = r8
                goto L_0x0374
            L_0x02b0:
                r0 = move-exception
                r2 = r4
                r23 = r8
                goto L_0x032d
            L_0x02b6:
                r0 = move-exception
                r2 = r4
                goto L_0x0061
            L_0x02ba:
                r0 = move-exception
                r2 = r4
                goto L_0x0069
            L_0x02be:
                r2 = r4
                r23 = r8
                java.lang.String r0 = "chatName:% migrateRoomName:%s"
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0305, all -> 0x0303 }
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r7)     // Catch:{ Exception -> 0x0305, all -> 0x0303 }
                r5 = 0
                r4[r5] = r3     // Catch:{ Exception -> 0x0305, all -> 0x0303 }
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r7)     // Catch:{ Exception -> 0x0305, all -> 0x0303 }
                r8 = 1
                r4[r8] = r3     // Catch:{ Exception -> 0x0305, all -> 0x0303 }
                com.tencent.p014mm.sdk.platformtools.Log.m105929w(r6, r0, r4)     // Catch:{ Exception -> 0x0305, all -> 0x0303 }
                r3 = 5
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r7)
                r0[r5] = r3
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r7)
                r0[r8] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r4 = 2
                r0[r4] = r3
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r23
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r4 = 3
                r0[r4] = r3
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                r4 = 4
                r0[r4] = r3
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
                return
            L_0x0303:
                r0 = move-exception
                goto L_0x0321
            L_0x0305:
                r0 = move-exception
                goto L_0x032b
            L_0x0307:
                r0 = move-exception
                r2 = r4
                goto L_0x0061
            L_0x030b:
                r0 = move-exception
                r2 = r4
                goto L_0x0069
            L_0x030f:
                r0 = move-exception
                r2 = r4
                r23 = r8
                r12 = r7
                goto L_0x0321
            L_0x0315:
                r0 = move-exception
                r2 = r4
                r23 = r8
                r12 = r7
                goto L_0x032b
            L_0x031b:
                r0 = move-exception
                r2 = r4
                r23 = r8
                r10 = r7
                r12 = r10
            L_0x0321:
                r3 = 5
                r18 = 0
                goto L_0x0375
            L_0x0325:
                r0 = move-exception
                r2 = r4
                r23 = r8
                r10 = r7
                r12 = r10
            L_0x032b:
                r18 = 0
            L_0x032d:
                java.lang.String r3 = "migrateTask Exception: %s %s"
                r4 = 2
                java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x0373 }
                java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x0373 }
                java.lang.String r4 = r4.getSimpleName()     // Catch:{ all -> 0x0373 }
                r8 = 0
                r5[r8] = r4     // Catch:{ all -> 0x0373 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0373 }
                r4 = 1
                r5[r4] = r0     // Catch:{ all -> 0x0373 }
                com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r3, r5)     // Catch:{ all -> 0x0373 }
                r3 = 5
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r7)
                r0[r8] = r3
                java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r7)
                r0[r4] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r18)
                r4 = 2
                r0[r4] = r3
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r23
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r4 = 3
                r0[r4] = r3
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                r4 = 4
                r0[r4] = r3
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r0)
            L_0x0372:
                return
            L_0x0373:
                r0 = move-exception
            L_0x0374:
                r3 = 5
            L_0x0375:
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r12, (java.lang.String) r7)
                r5 = 0
                r3[r5] = r4
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r10, (java.lang.String) r7)
                r5 = 1
                r3[r5] = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r18)
                r5 = 2
                r3[r5] = r4
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r23
                java.lang.Long r4 = java.lang.Long.valueOf(r4)
                r5 = 3
                r3[r5] = r4
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                r5 = 4
                r3[r5] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r2, r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p195li.C46860d.C46862b.run():void");
        }
    }

    /* renamed from: a */
    public static void m52179a(C46860d dVar, String str) {
        dVar.getClass();
        Class cls = C39479c.class;
        C44661m1 Lo = ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).mo69799Lo(str);
        if (Lo != null) {
            Lo.field_openIMRoomMigrateStatus = 3;
            ((C44662n1) ((C39479c) C86709a0.m107533q(cls)).mo62084mr()).replace(Lo);
        }
    }

    /* renamed from: d */
    public static void m52180d(String str, String str2, int i) {
        OpenImMigrateStruct openImMigrateStruct = new OpenImMigrateStruct();
        openImMigrateStruct.f108000d = openImMigrateStruct.mo86045b("roomID", str, true);
        openImMigrateStruct.f108001e = openImMigrateStruct.mo86045b("oldRoomID", str2, true);
        openImMigrateStruct.f108002f = (long) i;
        openImMigrateStruct.mo86054n();
    }

    /* renamed from: b */
    public void mo72067b(String str, String str2) {
        Log.m105925i("MicroMsg.openIm.OpenImMigrateService", "addFirstMigrateTask %s %s", Util.nullAs(str, ""), Util.nullAs(str2, ""));
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            if (Util.isEqual(str2, this.f126045d)) {
                Log.m105928w("MicroMsg.openIm.OpenImMigrateService", "addFirstMigrateTask in curChatName");
                return;
            }
            if (this.f126043b.contains(str)) {
                Log.m105925i("MicroMsg.openIm.OpenImMigrateService", "addFirstMigrateTask %s exist", Util.nullAs(str, ""));
                this.f126043b.remove(str);
            } else {
                this.f126044c.put(str, str2);
            }
            this.f126043b.addFirst(str);
            mo72069e();
        }
    }

    /* renamed from: c */
    public void mo72068c(String str, String str2) {
        Log.m105925i("MicroMsg.openIm.OpenImMigrateService", "addMigrateTask %s %s", Util.nullAs(str, ""), Util.nullAs(str2, ""));
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2)) {
            if (Util.isEqual(str2, this.f126045d)) {
                Log.m105928w("MicroMsg.openIm.OpenImMigrateService", "addMigrateTask in curChatName");
            } else if (this.f126043b.contains(str)) {
                Log.m105925i("MicroMsg.openIm.OpenImMigrateService", "addMigrateTask %s exist", Util.nullAs(str, ""));
            } else {
                this.f126044c.put(str, str2);
                this.f126043b.add(str);
                mo72069e();
            }
        }
    }

    /* renamed from: e */
    public final void mo72069e() {
        Future future = this.f126042a;
        if (future == null || future.isDone()) {
            this.f126042a = ((C119157j) C119157j.f356862d).mo183876g(this.f126047f, "migrate_tag");
            Log.m105929w("MicroMsg.openIm.OpenImMigrateService", "run stack:%s", Util.getStack());
            return;
        }
        Log.m105929w("MicroMsg.openIm.OpenImMigrateService", "running stack:%s", Util.getStack());
    }
}
