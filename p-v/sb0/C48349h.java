package sb0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import f40.C86709a0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import p823sg.C101611g;
import p823sg.C101614i;
import rb0.C47964c0;
import rb0.C48009v0;
import te3.C49275ef;
import te3.C49429fj;
import te3.C51725vq1;
import te3.C51960xe;
import te3.C52103ye;
import zt3.C119157j;

/* renamed from: sb0.h */
public class C48349h implements C11385n {

    /* renamed from: d */
    public HashSet<C48351b> f129441d = new HashSet<>();

    /* renamed from: e */
    public HashSet<C48351b> f129442e = new HashSet<>();

    /* renamed from: f */
    public final Object f129443f = new Object();

    /* renamed from: g */
    public C101611g<String, Long> f129444g = new C101614i(64);

    /* renamed from: h */
    public HashSet<C48351b> f129445h = new HashSet<>();

    /* renamed from: i */
    public HashSet<C48351b> f129446i = new HashSet<>();

    /* renamed from: j */
    public final Object f129447j = new Object();

    /* renamed from: n */
    public C101611g<String, Long> f129448n = new C101614i(64);

    /* renamed from: sb0.h$a */
    public class C48350a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C51725vq1 f129449d;

        /* renamed from: e */
        public final /* synthetic */ String f129450e;

        /* renamed from: f */
        public final /* synthetic */ boolean f129451f;

        public C48350a(C51725vq1 vq12, String str, boolean z) {
            this.f129449d = vq12;
            this.f129450e = str;
            this.f129451f = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:56:0x01b3  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0179 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r13 = this;
                sb0.h r0 = sb0.C48349h.this
                te3.vq1 r1 = r13.f129449d
                java.lang.String r2 = r13.f129450e
                boolean r3 = r13.f129451f
                r0.getClass()
                java.lang.String r0 = "MicroMsg.BizChatNetworkMgr"
                java.lang.String r4 = "handleGetBizChatInfoSceneEnd"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r4)
                if (r1 == 0) goto L_0x0249
                te3.xe r4 = r1.f143623d
                if (r4 == 0) goto L_0x0249
                boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r4 == 0) goto L_0x0020
                goto L_0x0249
            L_0x0020:
                sb0.d r4 = rb0.C48009v0.Ax0()
                te3.xe r5 = r1.f143623d
                java.lang.String r5 = r5.f144611d
                sb0.c r4 = r4.mo73039Lo(r5)
                r5 = 0
                r6 = 1
                if (r4 != 0) goto L_0x0045
                java.lang.String r3 = "bizChatInfo == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r3)
                sb0.c r4 = new sb0.c
                r4.<init>()
                te3.xe r3 = r1.f143623d
                java.lang.String r3 = r3.f144611d
                r4.field_bizChatServId = r3
                r4.field_brandUserName = r2
                r3 = 1
                r7 = 1
                goto L_0x0046
            L_0x0045:
                r7 = 0
            L_0x0046:
                java.util.LinkedList<te3.ze> r8 = r1.f143624e
                if (r8 != 0) goto L_0x0051
                java.lang.String r1 = "members==null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
                goto L_0x024e
            L_0x0051:
                boolean r0 = r4.mo73038q2()
                if (r0 != 0) goto L_0x005f
                te3.xe r0 = r1.f143623d
                int r0 = r0.f144615h
                int r8 = r4.field_chatVersion
                if (r0 <= r8) goto L_0x00bf
            L_0x005f:
                te3.xe r0 = r1.f143623d
                int r8 = r0.f144612e
                r4.field_chatType = r8
                java.lang.String r8 = r0.f144613f
                r4.field_headImageUrl = r8
                java.lang.String r8 = r0.f144614g
                r4.field_chatName = r8
                int r8 = r0.f144615h
                r4.field_chatVersion = r8
                r4.field_needToUpdate = r5
                int r8 = r0.f144616i
                r4.field_bitFlag = r8
                int r8 = r0.f144617j
                r4.field_maxMemberCnt = r8
                java.lang.String r8 = r0.f144618n
                r4.field_ownerUserId = r8
                java.lang.String r8 = r0.f144619o
                r4.field_addMemberUrl = r8
                r4.field_brandUserName = r2
                int r0 = r0.f144620p
                r4.field_roomflag = r0
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                java.util.LinkedList<te3.ze> r2 = r1.f143624e
                java.util.Iterator r2 = r2.iterator()
            L_0x0094:
                boolean r8 = r2.hasNext()
                if (r8 == 0) goto L_0x00a6
                java.lang.Object r8 = r2.next()
                te3.ze r8 = (te3.C52251ze) r8
                java.lang.String r8 = r8.f145847d
                r0.add(r8)
                goto L_0x0094
            L_0x00a6:
                java.lang.String r2 = ";"
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.listToString(r0, r2)
                r4.field_userList = r0
                if (r7 == 0) goto L_0x00b8
                sb0.d r0 = rb0.C48009v0.Ax0()
                r0.mo73044qq(r4)
                goto L_0x00bf
            L_0x00b8:
                sb0.d r0 = rb0.C48009v0.Ax0()
                r0.mo73040Ow(r4)
            L_0x00bf:
                java.lang.String r0 = sb0.C48340e.f129426a
                java.lang.Class<f62.k0> r0 = f62.C75700k0.class
                k40.a r2 = f40.C86709a0.m107533q(r0)
                f62.k0 r2 = (f62.C75700k0) r2
                com.tencent.mm.storage.v3 r2 = r2.mo96094Ku()
                java.lang.String r7 = r4.field_brandUserName
                com.tencent.mm.storage.i2 r2 = (com.tencent.p014mm.storage.C44660i2) r2
                com.tencent.mm.storage.h2 r2 = r2.mo69771j(r7)
                r7 = -1
                if (r2 != 0) goto L_0x00e2
                java.lang.String r0 = "MicroMsg.BizChatInfoStorageLogic"
                java.lang.String r2 = "updateBrandUserConvName cvs is null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
                goto L_0x0163
            L_0x00e2:
                k40.a r8 = f40.C86709a0.m107533q(r0)
                f62.k0 r8 = (f62.C75700k0) r8
                g62.l r8 = r8.mo96095LE()
                java.lang.String r9 = r4.field_brandUserName
                com.tencent.mm.storage.g4 r8 = (com.tencent.p014mm.storage.C72972g4) r8
                com.tencent.mm.storage.f4 r8 = r8.Ex0(r9)
                java.lang.Class<rb0.e0> r9 = rb0.C47966e0.class
                di3.d r9 = di3.C86312j.m106911c(r9)
                rb0.e0 r9 = (rb0.C47966e0) r9
                com.tencent.mm.storage.a0 r9 = r9.mo72739Mm()
                java.lang.String r10 = r4.field_brandUserName
                long r11 = r4.field_bizChatLocalId
                com.tencent.mm.storage.f4 r9 = r9.mo100930n(r10, r11)
                if (r8 == 0) goto L_0x0163
                if (r9 == 0) goto L_0x0163
                long r10 = r8.getMsgId()
                long r8 = r9.getMsgId()
                int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r12 != 0) goto L_0x0163
                java.lang.String r8 = r2.mo108822p2()
                if (r8 == 0) goto L_0x0163
                java.lang.String r9 = ":"
                int r10 = r8.indexOf(r9)
                if (r10 == r7) goto L_0x0163
                java.lang.String r5 = r8.substring(r5, r10)
                int r10 = r10 + r6
                java.lang.String r8 = r8.substring(r10)
                if (r5 == 0) goto L_0x0163
                java.lang.String r10 = r4.field_chatName
                boolean r5 = r5.equals(r10)
                if (r5 != 0) goto L_0x0163
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r10 = r4.field_chatName
                r5.append(r10)
                r5.append(r9)
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                r2.mo108794O2(r5)
                k40.a r0 = f40.C86709a0.m107533q(r0)
                f62.k0 r0 = (f62.C75700k0) r0
                com.tencent.mm.storage.v3 r0 = r0.mo96094Ku()
                java.lang.String r5 = r2.getUsername()
                com.tencent.mm.storage.i2 r0 = (com.tencent.p014mm.storage.C44660i2) r0
                r0.mo69773k0(r2, r5)
            L_0x0163:
                if (r3 == 0) goto L_0x01da
                te3.fj r0 = new te3.fj
                r0.<init>()
                java.lang.String r2 = r4.field_brandUserName
                r0.f133528d = r2
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                java.util.LinkedList<te3.ze> r1 = r1.f143624e
                java.util.Iterator r1 = r1.iterator()
            L_0x0179:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x01b9
                java.lang.Object r3 = r1.next()
                te3.ze r3 = (te3.C52251ze) r3
                sb0.k r4 = rb0.C48009v0.Bx0()
                java.lang.String r5 = r3.f145847d
                r4.getClass()
                boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
                java.lang.String r8 = "MicroMsg.BizChatUserInfoStorage"
                if (r6 == 0) goto L_0x019c
                java.lang.String r4 = "getBizChatVersion wrong argument"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r4)
                goto L_0x01aa
            L_0x019c:
                sb0.j r4 = r4.get(r5)
                if (r4 == 0) goto L_0x01a5
                int r4 = r4.field_UserVersion
                goto L_0x01ab
            L_0x01a5:
                java.lang.String r4 = "getBizChatVersion item == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r4)
            L_0x01aa:
                r4 = -1
            L_0x01ab:
                long r4 = (long) r4
                int r6 = r3.f145849f
                long r8 = (long) r6
                int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0179
                java.lang.String r3 = r3.f145847d
                r2.add(r3)
                goto L_0x0179
            L_0x01b9:
                int r1 = r2.size()
                if (r1 <= 0) goto L_0x024e
                r0.f133529e = r2
                java.util.LinkedList r1 = new java.util.LinkedList
                r1.<init>()
                r1.add(r0)
                sb0.r r0 = new sb0.r
                r2 = 0
                r0.<init>(r1, r2)
                f40.g r1 = f40.C86709a0.m107529k()
                ob0.b0 r1 = r1.f251779b
                r1.mo123460f(r0)
                goto L_0x024e
            L_0x01da:
                sb0.k r0 = rb0.C48009v0.Bx0()
                com.tencent.mm.sdk.storage.ISQLiteDatabase r0 = r0.f129458e
                r2 = 0
                boolean r5 = r0 instanceof zh3.C91753f
                if (r5 == 0) goto L_0x01f4
                zh3.f r0 = (zh3.C91753f) r0
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                long r2 = r2.getId()
                long r2 = r0.beginTransaction(r2)
            L_0x01f4:
                java.util.LinkedList<te3.ze> r0 = r1.f143624e
                java.util.Iterator r0 = r0.iterator()
            L_0x01fa:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x023d
                java.lang.Object r1 = r0.next()
                te3.ze r1 = (te3.C52251ze) r1
                sb0.k r7 = rb0.C48009v0.Bx0()
                java.lang.String r8 = r1.f145847d
                sb0.j r7 = r7.get(r8)
                if (r7 != 0) goto L_0x022d
                sb0.j r7 = new sb0.j
                r7.<init>()
                java.lang.String r8 = r1.f145847d
                r7.field_userId = r8
                java.lang.String r1 = r1.f145848e
                r7.field_userName = r1
                java.lang.String r1 = r4.field_brandUserName
                r7.field_brandUserName = r1
                r7.field_needToUpdate = r6
                sb0.k r1 = rb0.C48009v0.Bx0()
                r1.insert(r7)
                goto L_0x01fa
            L_0x022d:
                int r1 = r1.f145849f
                int r8 = r7.field_UserVersion
                if (r1 <= r8) goto L_0x01fa
                r7.field_needToUpdate = r6
                sb0.k r1 = rb0.C48009v0.Bx0()
                r1.mo73075Lo(r7)
                goto L_0x01fa
            L_0x023d:
                if (r5 == 0) goto L_0x024e
                f40.o r0 = f40.C86709a0.m107535s()
                zh3.f r0 = r0.f251811i
                r0.endTransaction(r2)
                goto L_0x024e
            L_0x0249:
                java.lang.String r1 = "fullBizChat or fullBizChat.chat or brandUserName == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            L_0x024e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sb0.C48349h.C48350a.run():void");
        }
    }

    /* renamed from: sb0.h$b */
    public static class C48351b {

        /* renamed from: a */
        public String f129453a;

        /* renamed from: b */
        public String f129454b;

        public C48351b(String str, String str2) {
            this.f129453a = str;
            this.f129454b = str2;
        }

        public boolean equals(Object obj) {
            if (obj.getClass() != C48351b.class) {
                return false;
            }
            C48351b bVar = (C48351b) obj;
            String str = this.f129453a;
            if ((str != null || bVar.f129453a != null) && (str == null || !str.equals(bVar.f129453a))) {
                return false;
            }
            String str2 = this.f129454b;
            return (str2 == null && bVar.f129454b == null) || (str2 != null && str2.equals(bVar.f129454b));
        }

        public int hashCode() {
            return this.f129453a.hashCode() + this.f129454b.hashCode();
        }
    }

    public C48349h() {
        C86709a0.m107529k().f251779b.mo123455a(1352, this);
        C86709a0.m107529k().f251779b.mo123455a(1365, this);
        C86709a0.m107529k().f251779b.mo123455a(1353, this);
        C86709a0.m107529k().f251779b.mo123455a(1354, this);
        C86709a0.m107529k().f251779b.mo123455a(1357, this);
        C86709a0.m107529k().f251779b.mo123455a(1356, this);
        C86709a0.m107529k().f251779b.mo123455a(1355, this);
        C86709a0.m107529k().f251779b.mo123455a(1358, this);
        C86709a0.m107529k().f251779b.mo123455a(WXWebReporter.ID1367KeyDef.f57028ID, this);
        C86709a0.m107529k().f251779b.mo123455a(1361, this);
        C86709a0.m107529k().f251779b.mo123455a(1389, this);
        C86709a0.m107529k().f251779b.mo123455a(1315, this);
    }

    /* renamed from: a */
    public void mo73054a(LinkedList<String> linkedList, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f129443f) {
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C48351b bVar = new C48351b(str, next);
                if (!this.f129442e.contains(bVar)) {
                    this.f129441d.add(bVar);
                    this.f129444g.put(next, new Long(currentTimeMillis));
                }
            }
            mo73056c();
        }
    }

    /* renamed from: b */
    public void mo73055b(LinkedList<String> linkedList, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f129447j) {
            Iterator<String> it = linkedList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C48351b bVar = new C48351b(str, next);
                if (!this.f129446i.contains(bVar)) {
                    this.f129445h.add(bVar);
                    this.f129448n.put(next, new Long(currentTimeMillis));
                } else {
                    return;
                }
            }
            mo73057d();
        }
    }

    /* renamed from: c */
    public final void mo73056c() {
        LinkedList linkedList = new LinkedList();
        synchronized (this.f129443f) {
            if (this.f129442e.isEmpty()) {
                if (!this.f129441d.isEmpty()) {
                    Iterator<C48351b> it = this.f129441d.iterator();
                    while (it.hasNext()) {
                        C48351b next = it.next();
                        C52103ye yeVar = new C52103ye();
                        yeVar.f145241d = next.f129453a;
                        yeVar.f145242e = next.f129454b;
                        linkedList.add(yeVar);
                    }
                    if (!linkedList.isEmpty()) {
                        this.f129442e.addAll(this.f129441d);
                        this.f129441d.clear();
                        C86709a0.m107529k().f251779b.mo123460f(new C48361p(linkedList));
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo73057d() {
        LinkedList linkedList = new LinkedList();
        synchronized (this.f129447j) {
            if (this.f129446i.isEmpty()) {
                if (!this.f129445h.isEmpty()) {
                    HashMap hashMap = new HashMap();
                    Iterator<C48351b> it = this.f129445h.iterator();
                    while (it.hasNext()) {
                        C48351b next = it.next();
                        LinkedList linkedList2 = (LinkedList) hashMap.get(next.f129453a);
                        if (linkedList2 == null) {
                            linkedList2 = new LinkedList();
                            hashMap.put(next.f129453a, linkedList2);
                        }
                        linkedList2.add(next.f129454b);
                    }
                    for (String str : hashMap.keySet()) {
                        LinkedList<String> linkedList3 = (LinkedList) hashMap.get(str);
                        if (linkedList3 != null) {
                            if (!linkedList3.isEmpty()) {
                                C49429fj fjVar = new C49429fj();
                                fjVar.f133528d = str;
                                fjVar.f133529e = linkedList3;
                                linkedList.add(fjVar);
                            }
                        }
                    }
                    this.f129446i.addAll(this.f129445h);
                    this.f129445h.clear();
                    C86709a0.m107529k().f251779b.mo123460f(new C48363r(linkedList, (Object) null));
                }
            }
        }
    }

    /* renamed from: e */
    public C48359n mo73058e(String str, C51725vq1 vq12, C47964c0 c0Var) {
        C48359n nVar = new C48359n(str, vq12, c0Var);
        C86709a0.m107529k().f251779b.mo123460f(nVar);
        return nVar;
    }

    /* renamed from: f */
    public void mo73059f(String str, String str2, int i) {
        Long l = (Long) ((C101614i) this.f129444g).get(str);
        if (l == null || l.longValue() + ((long) i) < System.currentTimeMillis()) {
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this.f129443f) {
                C48351b bVar = new C48351b(str2, str);
                if (!this.f129442e.contains(bVar)) {
                    this.f129441d.add(bVar);
                    this.f129444g.put(str, new Long(currentTimeMillis));
                    mo73056c();
                }
            }
        }
    }

    public void finalize() {
        C86709a0.m107529k().f251779b.mo123470p(1352, this);
        C86709a0.m107529k().f251779b.mo123470p(1365, this);
        C86709a0.m107529k().f251779b.mo123470p(1353, this);
        C86709a0.m107529k().f251779b.mo123470p(1354, this);
        C86709a0.m107529k().f251779b.mo123470p(1357, this);
        C86709a0.m107529k().f251779b.mo123470p(1356, this);
        C86709a0.m107529k().f251779b.mo123470p(1355, this);
        C86709a0.m107529k().f251779b.mo123470p(1358, this);
        C86709a0.m107529k().f251779b.mo123470p(WXWebReporter.ID1367KeyDef.f57028ID, this);
        C86709a0.m107529k().f251779b.mo123470p(1361, this);
        C86709a0.m107529k().f251779b.mo123470p(1389, this);
        C86709a0.m107529k().f251779b.mo123470p(1315, this);
        super.finalize();
    }

    /* renamed from: g */
    public void mo73061g(String str, String str2, int i) {
        Long l = (Long) ((C101614i) this.f129448n).get(str);
        if (l == null || l.longValue() + ((long) i) < System.currentTimeMillis()) {
            mo73064j(str, str2);
        }
    }

    /* renamed from: h */
    public void mo73062h(String str, C47964c0 c0Var) {
        C86709a0.m107529k().f251779b.mo123460f(new C48362q(str, c0Var));
    }

    /* renamed from: i */
    public void mo73063i(String str, String str2, C47964c0 c0Var) {
        if (c0Var != null) {
            C48353j e = C48340e.m53664e(str2);
            if (e == null || e.field_userId.equals(str)) {
                mo73062h(str2, c0Var);
                return;
            }
            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.add(str);
            C49429fj fjVar = new C49429fj();
            fjVar.f133528d = str2;
            fjVar.f133529e = linkedList;
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(fjVar);
            C86709a0.m107529k().f251779b.mo123460f(new C48363r(linkedList2, c0Var));
        }
    }

    /* renamed from: j */
    public void mo73064j(String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f129447j) {
            C48351b bVar = new C48351b(str2, str);
            if (!this.f129446i.contains(bVar)) {
                this.f129445h.add(bVar);
                this.f129448n.put(str, new Long(currentTimeMillis));
                mo73057d();
            }
        }
    }

    /* renamed from: k */
    public boolean mo73065k(C51725vq1 vq12, String str, boolean z) {
        Log.m105918d("MicroMsg.BizChatNetworkMgr", "handleGetBizChatInfoSceneEnd");
        if (vq12 == null || vq12.f143623d == null || Util.isNullOrNil(str)) {
            Log.m105928w("MicroMsg.BizChatNetworkMgr", "fullBizChat or fullBizChat.chat or brandUserName == null");
            return false;
        } else if (vq12.f143624e == null) {
            Log.m105928w("MicroMsg.BizChatNetworkMgr", "members==null");
            return false;
        } else {
            ((C119157j) C119157j.f356862d).mo183876g(new C48350a(vq12, str, z), "Thread-internalHandleFullBizChatInfo");
            return true;
        }
    }

    /* renamed from: l */
    public boolean mo73066l(C49275ef efVar, String str) {
        if (Util.isNullOrNil(str) || Util.isNullOrNil(efVar.f132889d)) {
            return false;
        }
        C48353j jVar = new C48353j();
        jVar.field_userId = efVar.f132889d;
        jVar.field_userName = efVar.f132890e;
        jVar.field_brandUserName = str;
        jVar.field_headImageUrl = efVar.f132892g;
        jVar.field_profileUrl = efVar.f132893h;
        jVar.field_UserVersion = efVar.f132891f;
        jVar.field_addMemberUrl = efVar.f132895j;
        if (!C48009v0.Bx0().mo73075Lo(jVar)) {
            C48009v0.Bx0().insert(jVar);
        }
        C48334c cVar = new C48334c();
        cVar.field_bizChatServId = jVar.field_userId;
        cVar.field_brandUserName = jVar.field_brandUserName;
        cVar.field_chatName = jVar.field_userName;
        cVar.field_chatType = 1;
        return C48340e.m53673n(cVar) != null;
    }

    /* renamed from: m */
    public C48367w mo73067m(String str, C51960xe xeVar, C47964c0 c0Var) {
        C48367w wVar = new C48367w(str, xeVar, c0Var);
        C86709a0.m107529k().f251779b.mo123460f(wVar);
        return wVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: te3.m00} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: te3.p02} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: te3.fi2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: te3.yv1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: te3.aw1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: te3.w00} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: te3.hl4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: te3.fl4} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v30 */
    /* JADX WARNING: type inference failed for: r2v31 */
    /* JADX WARNING: type inference failed for: r2v32 */
    /* JADX WARNING: type inference failed for: r2v33 */
    /* JADX WARNING: type inference failed for: r2v34 */
    /* JADX WARNING: type inference failed for: r2v35 */
    /* JADX WARNING: type inference failed for: r2v36 */
    /* JADX WARNING: type inference failed for: r2v37 */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x043f, code lost:
        r13 = r12.f127056b.f127083a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0501, code lost:
        if (r12 == false) goto L_0x0505;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0756, code lost:
        if (r12 == false) goto L_0x075a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:453:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0166  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSceneEnd(int r12, int r13, java.lang.String r14, ob0.C117747y r15) {
        /*
            r11 = this;
            r14 = 1365(0x555, float:1.913E-42)
            if (r12 != 0) goto L_0x0006
            if (r13 == 0) goto L_0x001d
        L_0x0006:
            java.lang.String r0 = "MicroMsg.BizChatNetworkMgr"
            java.lang.String r1 = "willen onSceneEnd err:Network not ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r1)
            int r0 = r15.getType()
            if (r0 == r14) goto L_0x001d
            int r0 = r15.getType()
            r1 = 1353(0x549, float:1.896E-42)
            if (r0 == r1) goto L_0x001d
            return
        L_0x001d:
            int r0 = r15.getType()
            r1 = 1315(0x523, float:1.843E-42)
            r2 = 0
            r3 = 1
            r4 = -1
            r5 = 0
            if (r0 == r1) goto L_0x06e1
            if (r0 == r14) goto L_0x0650
            r14 = 1367(0x557, float:1.916E-42)
            if (r0 == r14) goto L_0x0510
            r14 = 1389(0x56d, float:1.946E-42)
            if (r0 == r14) goto L_0x048c
            r14 = 2
            switch(r0) {
                case 1352: goto L_0x0439;
                case 1353: goto L_0x02b5;
                case 1354: goto L_0x01c4;
                case 1355: goto L_0x016b;
                case 1356: goto L_0x009c;
                case 1357: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x0763
        L_0x0039:
            java.lang.String r12 = "MicroMsg.BizChatNetworkMgr"
            java.lang.String r13 = "handleUpdateBizChatMemberListSceneEnd"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r12, r13)
            sb0.x r15 = (sb0.C48368x) r15
            ob0.c r13 = r15.f129489e
            if (r13 == 0) goto L_0x004f
            ob0.c$d r14 = r13.f127056b
            pe3.a r14 = r14.f127083a
            if (r14 == 0) goto L_0x004f
            te3.gl4 r14 = (te3.gl4) r14
            goto L_0x0050
        L_0x004f:
            r14 = r2
        L_0x0050:
            if (r13 == 0) goto L_0x005b
            ob0.c$c r13 = r13.f127055a
            pe3.a r13 = r13.f127080a
            if (r13 == 0) goto L_0x005b
            r2 = r13
            te3.fl4 r2 = (te3.fl4) r2
        L_0x005b:
            if (r14 == 0) goto L_0x007c
            te3.am3 r13 = r14.f134121d
            if (r13 == 0) goto L_0x007c
            int r13 = r13.f130638d
            if (r13 == 0) goto L_0x0066
            goto L_0x007c
        L_0x0066:
            te3.vq1 r12 = r14.f134122e
            java.lang.String r13 = r2.f133581d
            boolean r12 = r11.mo73065k(r12, r13, r5)
            if (r12 == 0) goto L_0x0071
            r4 = 0
        L_0x0071:
            java.lang.Object r12 = r15.f129490f
            rb0.c0 r12 = (rb0.C47964c0) r12
            if (r12 == 0) goto L_0x0763
            r12.mo7311c7(r4, r15)
            goto L_0x0763
        L_0x007c:
            if (r14 == 0) goto L_0x0094
            te3.am3 r13 = r14.f134121d
            if (r13 == 0) goto L_0x0094
            java.lang.Object[] r14 = new java.lang.Object[r3]
            int r13 = r13.f130638d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r5] = r13
            java.lang.String r13 = "willen onSceneEnd err:code:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r13, r14)
            goto L_0x0763
        L_0x0094:
            java.lang.String r13 = "willen onSceneEnd err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r13)
            goto L_0x0763
        L_0x009c:
            sb0.w r15 = (sb0.C48367w) r15
            ob0.c r12 = r15.f129486e
            if (r12 == 0) goto L_0x00ab
            ob0.c$d r13 = r12.f127056b
            pe3.a r13 = r13.f127083a
            if (r13 == 0) goto L_0x00ab
            te3.il4 r13 = (te3.il4) r13
            goto L_0x00ac
        L_0x00ab:
            r13 = r2
        L_0x00ac:
            if (r12 == 0) goto L_0x00b7
            ob0.c$c r12 = r12.f127055a
            pe3.a r12 = r12.f127080a
            if (r12 == 0) goto L_0x00b7
            r2 = r12
            te3.hl4 r2 = (te3.hl4) r2
        L_0x00b7:
            java.lang.String r12 = "MicroMsg.BizChatNetworkMgr"
            if (r13 == 0) goto L_0x00ca
            te3.am3 r0 = r13.f135472d
            if (r0 == 0) goto L_0x00ca
            int r0 = r0.f130638d
            if (r0 != 0) goto L_0x00ca
            te3.xe r0 = r13.f135473e
            if (r0 != 0) goto L_0x00c8
            goto L_0x00ca
        L_0x00c8:
            r0 = 0
            goto L_0x00e8
        L_0x00ca:
            if (r13 == 0) goto L_0x00e1
            te3.am3 r0 = r13.f135472d
            if (r0 == 0) goto L_0x00e1
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r0 = r0.f130638d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r5] = r0
            java.lang.String r0 = "willen onSceneEnd err:code:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r0, r1)
            goto L_0x00e7
        L_0x00e1:
            java.lang.String r0 = "willen onSceneEnd err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
        L_0x00e7:
            r0 = -1
        L_0x00e8:
            if (r0 < 0) goto L_0x015f
            sb0.d r1 = rb0.C48009v0.Ax0()
            te3.xe r6 = r13.f135473e
            java.lang.String r6 = r6.f144611d
            sb0.c r1 = r1.mo73039Lo(r6)
            if (r1 != 0) goto L_0x0118
            java.lang.Object[] r14 = new java.lang.Object[r14]
            if (r1 != 0) goto L_0x00fe
            r0 = 1
            goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r14[r5] = r0
            te3.xe r0 = r13.f135473e
            if (r0 != 0) goto L_0x010b
            r0 = 1
            goto L_0x010c
        L_0x010b:
            r0 = 0
        L_0x010c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r14[r3] = r0
            java.lang.String r0 = "bizChatInfo == null:%s, resp.chat == null:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r0, r14)
            r0 = -1
        L_0x0118:
            if (r0 < 0) goto L_0x0160
            int r12 = r1.field_bitFlag
            te3.xe r14 = r13.f135473e
            int r14 = r14.f144616i
            if (r12 == r14) goto L_0x0128
            boolean r12 = r1.mo73038q2()
            if (r12 != 0) goto L_0x0130
        L_0x0128:
            te3.xe r12 = r13.f135473e
            int r12 = r12.f144615h
            int r14 = r1.field_chatVersion
            if (r12 <= r14) goto L_0x0160
        L_0x0130:
            te3.xe r12 = r13.f135473e
            int r13 = r12.f144612e
            r1.field_chatType = r13
            java.lang.String r13 = r12.f144613f
            r1.field_headImageUrl = r13
            java.lang.String r13 = r12.f144614g
            r1.field_chatName = r13
            int r13 = r12.f144615h
            r1.field_chatVersion = r13
            r1.field_needToUpdate = r5
            int r13 = r12.f144616i
            r1.field_bitFlag = r13
            int r13 = r12.f144617j
            r1.field_maxMemberCnt = r13
            java.lang.String r13 = r12.f144618n
            r1.field_ownerUserId = r13
            java.lang.String r12 = r12.f144619o
            r1.field_addMemberUrl = r12
            java.lang.String r12 = r2.f134719d
            r1.field_brandUserName = r12
            sb0.d r12 = rb0.C48009v0.Ax0()
            r12.mo73040Ow(r1)
        L_0x015f:
            r4 = r0
        L_0x0160:
            java.lang.Object r12 = r15.f129487f
            rb0.c0 r12 = (rb0.C47964c0) r12
            if (r12 == 0) goto L_0x0763
            r12.mo7311c7(r4, r15)
            goto L_0x0763
        L_0x016b:
            sb0.n r15 = (sb0.C48359n) r15
            te3.x00 r12 = r15.mo73080j1()
            ob0.c r13 = r15.f129464e
            if (r13 == 0) goto L_0x017e
            ob0.c$c r13 = r13.f127055a
            pe3.a r13 = r13.f127080a
            if (r13 == 0) goto L_0x017e
            r2 = r13
            te3.w00 r2 = (te3.C51762w00) r2
        L_0x017e:
            if (r12 == 0) goto L_0x018b
            te3.am3 r13 = r12.f144377d
            if (r13 == 0) goto L_0x018b
            int r13 = r13.f130638d
            if (r13 == 0) goto L_0x0189
            goto L_0x018b
        L_0x0189:
            r13 = 0
            goto L_0x01ab
        L_0x018b:
            java.lang.String r13 = "MicroMsg.BizChatNetworkMgr"
            if (r12 == 0) goto L_0x01a4
            te3.am3 r14 = r12.f144377d
            if (r14 == 0) goto L_0x01a4
            java.lang.Object[] r0 = new java.lang.Object[r3]
            int r14 = r14.f130638d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0[r5] = r14
            java.lang.String r14 = "willen onSceneEnd err:code:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r14, r0)
            goto L_0x01aa
        L_0x01a4:
            java.lang.String r14 = "willen onSceneEnd err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r14)
        L_0x01aa:
            r13 = -1
        L_0x01ab:
            if (r13 < 0) goto L_0x01b9
            te3.vq1 r12 = r12.f144378e
            java.lang.String r13 = r2.f143792d
            boolean r12 = r11.mo73065k(r12, r13, r3)
            if (r12 == 0) goto L_0x01b8
            r4 = 0
        L_0x01b8:
            r13 = r4
        L_0x01b9:
            java.lang.Object r12 = r15.f129465f
            rb0.c0 r12 = (rb0.C47964c0) r12
            if (r12 == 0) goto L_0x0763
            r12.mo7311c7(r13, r15)
            goto L_0x0763
        L_0x01c4:
            sb0.q r15 = (sb0.C48362q) r15
            ob0.c r12 = r15.f129473e
            if (r12 == 0) goto L_0x01d3
            ob0.c$d r13 = r12.f127056b
            pe3.a r13 = r13.f127083a
            if (r13 == 0) goto L_0x01d3
            te3.bw1 r13 = (te3.C48916bw1) r13
            goto L_0x01d4
        L_0x01d3:
            r13 = r2
        L_0x01d4:
            if (r12 != 0) goto L_0x01d7
            goto L_0x01de
        L_0x01d7:
            ob0.c$c r12 = r12.f127055a
            pe3.a r12 = r12.f127080a
            r2 = r12
            te3.aw1 r2 = (te3.C48771aw1) r2
        L_0x01de:
            if (r13 == 0) goto L_0x01eb
            te3.am3 r12 = r13.f131342d
            if (r12 == 0) goto L_0x01eb
            int r12 = r12.f130638d
            if (r12 == 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            r4 = 0
            goto L_0x020a
        L_0x01eb:
            java.lang.String r12 = "MicroMsg.BizChatNetworkMgr"
            if (r13 == 0) goto L_0x0204
            te3.am3 r0 = r13.f131342d
            if (r0 == 0) goto L_0x0204
            java.lang.Object[] r1 = new java.lang.Object[r3]
            int r0 = r0.f130638d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r5] = r0
            java.lang.String r0 = "willen onSceneEnd err:code:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r0, r1)
            goto L_0x020a
        L_0x0204:
            java.lang.String r0 = "willen onSceneEnd err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r0)
        L_0x020a:
            if (r4 < 0) goto L_0x02aa
            sb0.k r12 = rb0.C48009v0.Bx0()
            java.lang.String r0 = r2.f130795d
            te3.ef r13 = r13.f131343e
            r12.getClass()
            java.lang.String r1 = "MicroMsg.BizChatUserInfoStorage"
            if (r13 == 0) goto L_0x02a4
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r2 == 0) goto L_0x0223
            goto L_0x02a4
        L_0x0223:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r0
            java.lang.String r6 = r13.f132889d
            r2[r3] = r6
            java.lang.String r3 = r13.f132895j
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2[r14] = r3
            java.lang.String r14 = "setMyUserId:%s,%s,%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r14, r2)
            sb0.g r14 = rb0.C48009v0.xx0()
            sb0.f r14 = r14.mo73049Lo(r0)
            if (r14 != 0) goto L_0x025b
            sb0.f r14 = new sb0.f
            r14.<init>()
            r14.field_brandUserName = r0
            java.lang.String r1 = r13.f132889d
            r14.field_userId = r1
            sb0.g r1 = rb0.C48009v0.xx0()
            r1.mo73052qq(r14)
            goto L_0x026c
        L_0x025b:
            java.lang.String r2 = r13.f132889d
            r14.field_userId = r2
            sb0.g r2 = rb0.C48009v0.xx0()
            r2.mo73050Yt(r14)
            java.lang.String r14 = "setMyUserId: MyUserId seted"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r14)
        L_0x026c:
            sb0.j r14 = new sb0.j
            r14.<init>()
            java.lang.String r1 = r13.f132889d
            r14.field_userId = r1
            java.lang.String r1 = r13.f132890e
            r14.field_userName = r1
            r14.field_brandUserName = r0
            int r1 = r13.f132891f
            r14.field_UserVersion = r1
            java.lang.String r1 = r13.f132892g
            r14.field_headImageUrl = r1
            java.lang.String r1 = r13.f132893h
            r14.field_profileUrl = r1
            int r1 = r13.f132894i
            r14.field_bitFlag = r1
            r14.field_needToUpdate = r5
            java.lang.String r13 = r13.f132895j
            r14.field_addMemberUrl = r13
            boolean r13 = r12.mo73075Lo(r14)
            if (r13 != 0) goto L_0x029a
            r12.insert(r14)
        L_0x029a:
            java.util.Map<java.lang.String, java.lang.String> r12 = r12.f129457d
            java.lang.String r13 = r14.field_userId
            java.util.HashMap r12 = (java.util.HashMap) r12
            r12.put(r0, r13)
            goto L_0x02aa
        L_0x02a4:
            java.lang.String r12 = "setMyUserId: wrong argument"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r12)
        L_0x02aa:
            java.lang.Object r12 = r15.f129474f
            rb0.c0 r12 = (rb0.C47964c0) r12
            if (r12 == 0) goto L_0x0763
            r12.mo7311c7(r4, r15)
            goto L_0x0763
        L_0x02b5:
            sb0.r r15 = (sb0.C48363r) r15
            java.lang.Object r14 = r15.f129478g
            rb0.c0 r14 = (rb0.C47964c0) r14
            if (r14 != 0) goto L_0x02cd
            java.lang.Object r0 = r11.f129447j
            monitor-enter(r0)
            java.util.HashSet<sb0.h$b> r1 = r11.f129446i     // Catch:{ all -> 0x02ca }
            r1.clear()     // Catch:{ all -> 0x02ca }
            monitor-exit(r0)     // Catch:{ all -> 0x02ca }
            r11.mo73057d()
            goto L_0x02cd
        L_0x02ca:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x02ca }
            throw r12
        L_0x02cd:
            if (r12 != 0) goto L_0x0763
            if (r13 == 0) goto L_0x02d3
            goto L_0x0763
        L_0x02d3:
            ob0.c r12 = r15.f129476e
            if (r12 == 0) goto L_0x02e0
            ob0.c$d r12 = r12.f127056b
            pe3.a r12 = r12.f127083a
            if (r12 == 0) goto L_0x02e0
            te3.dw1 r12 = (te3.C49196dw1) r12
            goto L_0x02e1
        L_0x02e0:
            r12 = r2
        L_0x02e1:
            if (r12 == 0) goto L_0x02ee
            te3.am3 r13 = r12.f132549d
            if (r13 == 0) goto L_0x02ee
            int r13 = r13.f130638d
            if (r13 == 0) goto L_0x02ec
            goto L_0x02ee
        L_0x02ec:
            r13 = 0
            goto L_0x0310
        L_0x02ee:
            if (r12 == 0) goto L_0x0307
            te3.am3 r13 = r12.f132549d
            if (r13 == 0) goto L_0x0307
            java.lang.String r0 = "MicroMsg.BizChatNetworkMgr"
            java.lang.String r1 = "willen onSceneEnd err:code:%s"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            int r13 = r13.f130638d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r6[r5] = r13
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r1, r6)
            goto L_0x030f
        L_0x0307:
            java.lang.String r13 = "MicroMsg.BizChatNetworkMgr"
            java.lang.String r0 = "willen onSceneEnd err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
        L_0x030f:
            r13 = -1
        L_0x0310:
            if (r13 < 0) goto L_0x031e
            java.util.LinkedList<te3.ef> r0 = r12.f132550e
            if (r0 != 0) goto L_0x031e
            java.lang.String r13 = "MicroMsg.BizChatNetworkMgr"
            java.lang.String r0 = "resp.user==null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r13, r0)
            goto L_0x031f
        L_0x031e:
            r4 = r13
        L_0x031f:
            if (r4 < 0) goto L_0x0432
            sb0.k r13 = rb0.C48009v0.Bx0()
            com.tencent.mm.sdk.storage.ISQLiteDatabase r13 = r13.f129458e
            r0 = 0
            boolean r6 = r13 instanceof zh3.C91753f
            if (r6 == 0) goto L_0x033b
            zh3.f r13 = (zh3.C91753f) r13
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            long r0 = r13.beginTransaction(r0)
        L_0x033b:
            r13 = 0
        L_0x033c:
            java.util.LinkedList<te3.ef> r7 = r12.f132550e
            int r7 = r7.size()
            if (r13 >= r7) goto L_0x0427
            java.lang.String r7 = "MicroMsg.BizChatNetworkMgr"
            java.lang.String r8 = "GetBizChatUserInfoList %s"
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.util.LinkedList<te3.ef> r10 = r12.f132550e
            java.lang.Object r10 = r10.get(r13)
            te3.ef r10 = (te3.C49275ef) r10
            java.lang.String r10 = r10.f132890e
            r9[r5] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r8, r9)
            sb0.j r7 = new sb0.j
            r7.<init>()
            java.util.LinkedList<te3.ef> r8 = r12.f132550e
            java.lang.Object r8 = r8.get(r13)
            te3.ef r8 = (te3.C49275ef) r8
            java.lang.String r8 = r8.f132889d
            r7.field_userId = r8
            java.util.LinkedList<te3.ef> r8 = r12.f132550e
            java.lang.Object r8 = r8.get(r13)
            te3.ef r8 = (te3.C49275ef) r8
            java.lang.String r8 = r8.f132890e
            r7.field_userName = r8
            java.lang.String r8 = r7.field_userId
            if (r8 == 0) goto L_0x0388
            java.util.Map<java.lang.String, java.lang.String> r9 = r15.f129477f
            if (r9 != 0) goto L_0x037f
            goto L_0x0388
        L_0x037f:
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r8 = r9.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x0389
        L_0x0388:
            r8 = r2
        L_0x0389:
            r7.field_brandUserName = r8
            java.util.LinkedList<te3.ef> r8 = r12.f132550e
            java.lang.Object r8 = r8.get(r13)
            te3.ef r8 = (te3.C49275ef) r8
            int r8 = r8.f132891f
            r7.field_UserVersion = r8
            java.util.LinkedList<te3.ef> r8 = r12.f132550e
            java.lang.Object r8 = r8.get(r13)
            te3.ef r8 = (te3.C49275ef) r8
            java.lang.String r8 = r8.f132892g
            r7.field_headImageUrl = r8
            java.util.LinkedList<te3.ef> r8 = r12.f132550e
            java.lang.Object r8 = r8.get(r13)
            te3.ef r8 = (te3.C49275ef) r8
            java.lang.String r8 = r8.f132893h
            r7.field_profileUrl = r8
            java.util.LinkedList<te3.ef> r8 = r12.f132550e
            java.lang.Object r8 = r8.get(r13)
            te3.ef r8 = (te3.C49275ef) r8
            int r8 = r8.f132894i
            r7.field_bitFlag = r8
            java.util.LinkedList<te3.ef> r8 = r12.f132550e
            java.lang.Object r8 = r8.get(r13)
            te3.ef r8 = (te3.C49275ef) r8
            java.lang.String r8 = r8.f132895j
            r7.field_addMemberUrl = r8
            r7.field_needToUpdate = r5
            sb0.k r8 = rb0.C48009v0.Bx0()
            java.util.LinkedList<te3.ef> r9 = r12.f132550e
            java.lang.Object r9 = r9.get(r13)
            te3.ef r9 = (te3.C49275ef) r9
            java.lang.String r9 = r9.f132889d
            sb0.j r8 = r8.get(r9)
            r9 = 16
            if (r8 != 0) goto L_0x03e1
            r10 = 0
            goto L_0x03e5
        L_0x03e1:
            boolean r10 = r8.mo73073l2(r9)
        L_0x03e5:
            boolean r9 = r7.mo73073l2(r9)
            if (r8 != 0) goto L_0x03f3
            sb0.k r8 = rb0.C48009v0.Bx0()
            r8.insert(r7)
            goto L_0x03fa
        L_0x03f3:
            sb0.k r8 = rb0.C48009v0.Bx0()
            r8.mo73075Lo(r7)
        L_0x03fa:
            if (r10 == r9) goto L_0x0423
            sb0.d r8 = rb0.C48009v0.Ax0()
            java.lang.String r7 = r7.field_userId
            sb0.c r7 = r8.mo73039Lo(r7)
            if (r7 == 0) goto L_0x0423
            if (r10 == 0) goto L_0x0416
            if (r9 != 0) goto L_0x0416
            sb0.b r8 = rb0.C48009v0.Dx0()
            long r9 = r7.field_bizChatLocalId
            r8.mo73030mL(r9)
            goto L_0x0423
        L_0x0416:
            if (r10 != 0) goto L_0x0423
            if (r9 == 0) goto L_0x0423
            sb0.b r8 = rb0.C48009v0.Dx0()
            long r9 = r7.field_bizChatLocalId
            r8.mo73029mI(r9)
        L_0x0423:
            int r13 = r13 + 1
            goto L_0x033c
        L_0x0427:
            if (r6 == 0) goto L_0x0432
            f40.o r12 = f40.C86709a0.m107535s()
            zh3.f r12 = r12.f251811i
            r12.endTransaction(r0)
        L_0x0432:
            if (r14 == 0) goto L_0x0763
            r14.mo7311c7(r4, r15)
            goto L_0x0763
        L_0x0439:
            sb0.o r15 = (sb0.C48360o) r15
            ob0.c r12 = r15.f129467e
            if (r12 == 0) goto L_0x0448
            ob0.c$d r13 = r12.f127056b
            pe3.a r13 = r13.f127083a
            if (r13 == 0) goto L_0x0448
            te3.zv1 r13 = (te3.C52313zv1) r13
            goto L_0x0449
        L_0x0448:
            r13 = r2
        L_0x0449:
            if (r12 == 0) goto L_0x0454
            ob0.c$c r12 = r12.f127055a
            pe3.a r12 = r12.f127080a
            if (r12 == 0) goto L_0x0454
            r2 = r12
            te3.yv1 r2 = (te3.C52174yv1) r2
        L_0x0454:
            boolean r12 = r15.f129468f
            if (r13 == 0) goto L_0x046a
            te3.am3 r14 = r13.f146241d
            if (r14 == 0) goto L_0x046a
            int r14 = r14.f130638d
            if (r14 == 0) goto L_0x0461
            goto L_0x046a
        L_0x0461:
            te3.vq1 r13 = r13.f146242e
            java.lang.String r14 = r2.f145534d
            r11.mo73065k(r13, r14, r12)
            goto L_0x0763
        L_0x046a:
            java.lang.String r12 = "MicroMsg.BizChatNetworkMgr"
            if (r13 == 0) goto L_0x0484
            te3.am3 r13 = r13.f146241d
            if (r13 == 0) goto L_0x0484
            java.lang.Object[] r14 = new java.lang.Object[r3]
            int r13 = r13.f130638d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r5] = r13
            java.lang.String r13 = "willen onSceneEnd err:code:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r13, r14)
            goto L_0x0763
        L_0x0484:
            java.lang.String r13 = "willen onSceneEnd err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r13)
            goto L_0x0763
        L_0x048c:
            sb0.t r15 = (sb0.C13633t) r15
            ob0.c r12 = r15.f38630e
            if (r12 == 0) goto L_0x049b
            ob0.c$d r13 = r12.f127056b
            pe3.a r13 = r13.f127083a
            if (r13 == 0) goto L_0x049b
            r2 = r13
            te3.fi2 r2 = (te3.C49427fi2) r2
        L_0x049b:
            if (r12 == 0) goto L_0x04a5
            ob0.c$c r12 = r12.f127055a
            pe3.a r12 = r12.f127080a
            if (r12 == 0) goto L_0x04a5
            te3.ei2 r12 = (te3.C49289ei2) r12
        L_0x04a5:
            if (r2 == 0) goto L_0x04af
            te3.am3 r12 = r2.f133516d
            if (r12 == 0) goto L_0x04af
            int r12 = r12.f130638d
            if (r12 == 0) goto L_0x04cf
        L_0x04af:
            java.lang.String r12 = "MicroMsg.BizChatNetworkMgr"
            if (r2 == 0) goto L_0x04c8
            te3.am3 r13 = r2.f133516d
            if (r13 == 0) goto L_0x04c8
            java.lang.Object[] r14 = new java.lang.Object[r3]
            int r13 = r13.f130638d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r5] = r13
            java.lang.String r13 = "willen onSceneEnd err:code:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r13, r14)
            goto L_0x04ce
        L_0x04c8:
            java.lang.String r13 = "willen onSceneEnd err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r13)
        L_0x04ce:
            r5 = -1
        L_0x04cf:
            if (r5 < 0) goto L_0x04da
            te3.ef r12 = r2.f133520h
            if (r12 != 0) goto L_0x04da
            te3.vq1 r12 = r2.f133519g
            if (r12 != 0) goto L_0x04da
            r5 = -1
        L_0x04da:
            if (r5 < 0) goto L_0x0504
            te3.ef r12 = r2.f133520h
            if (r12 == 0) goto L_0x04ef
            java.lang.String r13 = r2.f133517e
            boolean r12 = r11.mo73066l(r12, r13)
            if (r12 == 0) goto L_0x0501
            te3.ef r13 = r2.f133520h
            java.lang.String r13 = r13.f132889d
            r15.f38631f = r13
            goto L_0x0501
        L_0x04ef:
            te3.vq1 r12 = r2.f133519g
            java.lang.String r13 = r2.f133517e
            boolean r12 = r11.mo73065k(r12, r13, r3)
            if (r12 == 0) goto L_0x0501
            te3.vq1 r13 = r2.f133519g
            te3.xe r13 = r13.f143623d
            java.lang.String r13 = r13.f144611d
            r15.f38631f = r13
        L_0x0501:
            if (r12 != 0) goto L_0x0504
            goto L_0x0505
        L_0x0504:
            r4 = r5
        L_0x0505:
            java.lang.Object r12 = r15.f38632g
            rb0.c0 r12 = (rb0.C47964c0) r12
            if (r12 == 0) goto L_0x0763
            r12.mo7311c7(r4, r15)
            goto L_0x0763
        L_0x0510:
            sb0.s r15 = (sb0.C48364s) r15
            ob0.c r12 = r15.f129480e
            if (r12 == 0) goto L_0x051f
            ob0.c$d r13 = r12.f127056b
            pe3.a r13 = r13.f127083a
            if (r13 == 0) goto L_0x051f
            te3.q02 r13 = (te3.C50896q02) r13
            goto L_0x0520
        L_0x051f:
            r13 = r2
        L_0x0520:
            if (r12 == 0) goto L_0x052b
            ob0.c$c r12 = r12.f127055a
            pe3.a r12 = r12.f127080a
            if (r12 == 0) goto L_0x052b
            r2 = r12
            te3.p02 r2 = (te3.C50763p02) r2
        L_0x052b:
            if (r13 == 0) goto L_0x062e
            te3.am3 r12 = r13.f140074d
            if (r12 == 0) goto L_0x062e
            int r12 = r12.f130638d
            if (r12 == 0) goto L_0x0537
            goto L_0x062e
        L_0x0537:
            java.util.LinkedList<java.lang.String> r12 = r13.f140075e
            sb0.d r14 = rb0.C48009v0.Ax0()
            java.lang.String r15 = r2.f139482d
            r14.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "select "
            r1.append(r3)
            java.lang.String r3 = "bizChatServId"
            r1.append(r3)
            java.lang.String r3 = " from "
            r1.append(r3)
            java.lang.String r3 = "BizChatInfo"
            r1.append(r3)
            java.lang.String r3 = " where "
            r1.append(r3)
            java.lang.String r3 = "brandUserName"
            r1.append(r3)
            java.lang.String r3 = " = '"
            r1.append(r3)
            r1.append(r15)
            java.lang.String r15 = "'"
            r1.append(r15)
            java.lang.String r15 = " and ("
            r1.append(r15)
            java.lang.String r15 = "bitFlag"
            r1.append(r15)
            java.lang.String r15 = " & "
            r1.append(r15)
            r15 = 8
            r1.append(r15)
            java.lang.String r3 = ") != 0 "
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r3 = new java.lang.String[r5]
            android.database.Cursor r14 = r14.rawQuery(r1, r3)
            if (r14 == 0) goto L_0x05b2
            boolean r1 = r14.moveToFirst()
            if (r1 == 0) goto L_0x05af
        L_0x05a2:
            java.lang.String r1 = r14.getString(r5)
            r0.add(r1)
            boolean r1 = r14.moveToNext()
            if (r1 != 0) goto L_0x05a2
        L_0x05af:
            r14.close()
        L_0x05b2:
            java.util.Iterator r14 = r0.iterator()
        L_0x05b6:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x05e0
            java.lang.Object r1 = r14.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = r12.contains(r1)
            if (r3 != 0) goto L_0x05b6
            sb0.d r3 = rb0.C48009v0.Ax0()
            sb0.c r1 = r3.mo73039Lo(r1)
            if (r1 == 0) goto L_0x05b6
            int r3 = r1.field_bitFlag
            r3 = r3 & -9
            r1.field_bitFlag = r3
            sb0.d r3 = rb0.C48009v0.Ax0()
            r3.mo73040Ow(r1)
            goto L_0x05b6
        L_0x05e0:
            java.util.Iterator r12 = r12.iterator()
        L_0x05e4:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0625
            java.lang.Object r14 = r12.next()
            java.lang.String r14 = (java.lang.String) r14
            boolean r1 = r0.contains(r14)
            if (r1 != 0) goto L_0x05e4
            sb0.d r1 = rb0.C48009v0.Ax0()
            sb0.c r1 = r1.mo73039Lo(r14)
            if (r1 != 0) goto L_0x0618
            sb0.c r1 = new sb0.c
            r1.<init>()
            r1.field_bizChatServId = r14
            java.lang.String r14 = r2.f139482d
            r1.field_brandUserName = r14
            int r14 = r1.field_bitFlag
            r14 = r14 | r15
            r1.field_bitFlag = r14
            sb0.d r14 = rb0.C48009v0.Ax0()
            r14.mo73044qq(r1)
            goto L_0x05e4
        L_0x0618:
            int r14 = r1.field_bitFlag
            r14 = r14 | r15
            r1.field_bitFlag = r14
            sb0.d r14 = rb0.C48009v0.Ax0()
            r14.mo73040Ow(r1)
            goto L_0x05e4
        L_0x0625:
            java.util.LinkedList<java.lang.String> r12 = r13.f140075e
            java.lang.String r13 = r2.f139482d
            r11.mo73054a(r12, r13)
            goto L_0x0763
        L_0x062e:
            java.lang.String r12 = "MicroMsg.BizChatNetworkMgr"
            if (r13 == 0) goto L_0x0648
            te3.am3 r13 = r13.f140074d
            if (r13 == 0) goto L_0x0648
            java.lang.Object[] r14 = new java.lang.Object[r3]
            int r13 = r13.f130638d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r5] = r13
            java.lang.String r13 = "willen onSceneEnd err:code:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r13, r14)
            goto L_0x0763
        L_0x0648:
            java.lang.String r13 = "willen onSceneEnd err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r13)
            goto L_0x0763
        L_0x0650:
            java.lang.Object r14 = r11.f129443f
            monitor-enter(r14)
            java.util.HashSet<sb0.h$b> r0 = r11.f129442e     // Catch:{ all -> 0x06de }
            r0.clear()     // Catch:{ all -> 0x06de }
            monitor-exit(r14)     // Catch:{ all -> 0x06de }
            r11.mo73056c()
            if (r12 != 0) goto L_0x0763
            if (r13 == 0) goto L_0x0662
            goto L_0x0763
        L_0x0662:
            sb0.p r15 = (sb0.C48361p) r15
            ob0.c r12 = r15.f129470e
            if (r12 == 0) goto L_0x0671
            ob0.c$d r12 = r12.f127056b
            pe3.a r12 = r12.f127083a
            if (r12 == 0) goto L_0x0671
            te3.xv1 r12 = (te3.C52027xv1) r12
            goto L_0x0672
        L_0x0671:
            r12 = r2
        L_0x0672:
            if (r12 == 0) goto L_0x06ba
            te3.am3 r13 = r12.f144991d
            if (r13 == 0) goto L_0x06ba
            int r13 = r13.f130638d
            if (r13 == 0) goto L_0x067d
            goto L_0x06ba
        L_0x067d:
            java.util.LinkedList<te3.vq1> r12 = r12.f144992e
            if (r12 == 0) goto L_0x06b1
            int r13 = r12.size()
            if (r13 != 0) goto L_0x0688
            goto L_0x06b1
        L_0x0688:
            java.util.Iterator r12 = r12.iterator()
        L_0x068c:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0763
            java.lang.Object r13 = r12.next()
            te3.vq1 r13 = (te3.C51725vq1) r13
            te3.xe r14 = r13.f143623d
            java.lang.String r14 = r14.f144611d
            if (r14 == 0) goto L_0x06ac
            java.util.Map<java.lang.String, java.lang.String> r0 = r15.f129471f
            if (r0 != 0) goto L_0x06a3
            goto L_0x06ac
        L_0x06a3:
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r14 = r0.get(r14)
            java.lang.String r14 = (java.lang.String) r14
            goto L_0x06ad
        L_0x06ac:
            r14 = r2
        L_0x06ad:
            r11.mo73065k(r13, r14, r5)
            goto L_0x068c
        L_0x06b1:
            java.lang.String r12 = "MicroMsg.BizChatNetworkMgr"
            java.lang.String r13 = "fullBizChats is empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r13)
            goto L_0x0763
        L_0x06ba:
            if (r12 == 0) goto L_0x06d4
            te3.am3 r12 = r12.f144991d
            if (r12 == 0) goto L_0x06d4
            java.lang.String r13 = "MicroMsg.BizChatNetworkMgr"
            java.lang.String r14 = "willen onSceneEnd err:code:%s"
            java.lang.Object[] r15 = new java.lang.Object[r3]
            int r12 = r12.f130638d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r15[r5] = r12
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r13, r14, r15)
            goto L_0x0763
        L_0x06d4:
            java.lang.String r12 = "MicroMsg.BizChatNetworkMgr"
            java.lang.String r13 = "willen onSceneEnd err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r13)
            goto L_0x0763
        L_0x06de:
            r12 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x06de }
            throw r12
        L_0x06e1:
            sb0.m r15 = (sb0.C13632m) r15
            ob0.c r12 = r15.f38626e
            if (r12 == 0) goto L_0x06f0
            ob0.c$d r13 = r12.f127056b
            pe3.a r13 = r13.f127083a
            if (r13 == 0) goto L_0x06f0
            r2 = r13
            te3.m00 r2 = (te3.C50333m00) r2
        L_0x06f0:
            if (r12 == 0) goto L_0x06fa
            ob0.c$c r12 = r12.f127055a
            pe3.a r12 = r12.f127080a
            if (r12 == 0) goto L_0x06fa
            te3.l00 r12 = (te3.C50198l00) r12
        L_0x06fa:
            if (r2 == 0) goto L_0x0704
            te3.am3 r12 = r2.f137734d
            if (r12 == 0) goto L_0x0704
            int r12 = r12.f130638d
            if (r12 == 0) goto L_0x0724
        L_0x0704:
            java.lang.String r12 = "MicroMsg.BizChatNetworkMgr"
            if (r2 == 0) goto L_0x071d
            te3.am3 r13 = r2.f137734d
            if (r13 == 0) goto L_0x071d
            java.lang.Object[] r14 = new java.lang.Object[r3]
            int r13 = r13.f130638d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r14[r5] = r13
            java.lang.String r13 = "willen onSceneEnd err:code:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r13, r14)
            goto L_0x0723
        L_0x071d:
            java.lang.String r13 = "willen onSceneEnd err:resp == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r13)
        L_0x0723:
            r5 = -1
        L_0x0724:
            if (r5 < 0) goto L_0x072f
            te3.ef r12 = r2.f137738h
            if (r12 != 0) goto L_0x072f
            te3.vq1 r12 = r2.f137737g
            if (r12 != 0) goto L_0x072f
            r5 = -1
        L_0x072f:
            if (r5 < 0) goto L_0x0759
            te3.ef r12 = r2.f137738h
            if (r12 == 0) goto L_0x0744
            java.lang.String r13 = r2.f137735e
            boolean r12 = r11.mo73066l(r12, r13)
            if (r12 == 0) goto L_0x0756
            te3.ef r13 = r2.f137738h
            java.lang.String r13 = r13.f132889d
            r15.f38627f = r13
            goto L_0x0756
        L_0x0744:
            te3.vq1 r12 = r2.f137737g
            java.lang.String r13 = r2.f137735e
            boolean r12 = r11.mo73065k(r12, r13, r3)
            if (r12 == 0) goto L_0x0756
            te3.vq1 r13 = r2.f137737g
            te3.xe r13 = r13.f143623d
            java.lang.String r13 = r13.f144611d
            r15.f38627f = r13
        L_0x0756:
            if (r12 != 0) goto L_0x0759
            goto L_0x075a
        L_0x0759:
            r4 = r5
        L_0x075a:
            java.lang.Object r12 = r15.f38628g
            rb0.c0 r12 = (rb0.C47964c0) r12
            if (r12 == 0) goto L_0x0763
            r12.mo7311c7(r4, r15)
        L_0x0763:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb0.C48349h.onSceneEnd(int, int, java.lang.String, ob0.y):void");
    }
}
