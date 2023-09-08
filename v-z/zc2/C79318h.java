package zc2;

import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75568c3;
import f62.C75699i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import te3.C77949j3;

/* renamed from: zc2.h */
public class C79318h implements C75699i1 {

    /* renamed from: d */
    public static List<C75568c3> f232860d = new ArrayList();

    /* renamed from: a */
    public boolean f232861a = false;

    /* renamed from: b */
    public boolean f232862b = false;

    /* renamed from: c */
    public List<C72963f4> f232863c = new LinkedList();

    /* renamed from: zc2.h$a */
    public class C79319a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C75568c3 f232864d;

        /* renamed from: e */
        public final /* synthetic */ List f232865e;

        public C79319a(C79318h hVar, C75568c3 c3Var, List list) {
            this.f232864d = c3Var;
            this.f232865e = list;
        }

        public void run() {
            this.f232864d.mo93206c(this.f232865e);
        }
    }

    /* renamed from: zc2.h$b */
    public class C79320b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C77949j3 f232866d;

        /* renamed from: e */
        public final /* synthetic */ C75568c3 f232867e;

        /* renamed from: f */
        public final /* synthetic */ C72963f4 f232868f;

        public C79320b(C77949j3 j3Var, C75568c3 c3Var, C72963f4 f4Var) {
            this.f232866d = j3Var;
            this.f232867e = c3Var;
            this.f232868f = f4Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0098  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                te3.j3 r0 = r9.f232866d
                int r1 = r0.f227630g
                r2 = 49
                if (r1 != r2) goto L_0x00a0
                zc2.h r1 = zc2.C79318h.this
                r1.getClass()
                te3.rv3 r1 = r0.f227628e
                java.lang.String r1 = sf0.C48374j0.m53718g(r1)
                te3.rv3 r2 = r0.f227629f
                java.lang.String r2 = sf0.C48374j0.m53718g(r2)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                r4 = 0
                if (r3 != 0) goto L_0x0061
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
                if (r2 == 0) goto L_0x0027
                goto L_0x0061
            L_0x0027:
                te3.rv3 r0 = r0.f227631h
                java.lang.String r0 = sf0.C48374j0.m53718g(r0)
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r2 == 0) goto L_0x0034
                goto L_0x0068
            L_0x0034:
                boolean r1 = com.tencent.p014mm.storage.C72996z1.m85820U5(r1)
                if (r1 == 0) goto L_0x005c
                int r1 = eb0.C75604z3.m90848t(r0)
                r2 = -1
                if (r1 == r2) goto L_0x005c
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r0)
                java.lang.String r0 = " "
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                int r1 = r1 + 2
                java.lang.String r0 = r0.substring(r1)
                java.lang.String r0 = r0.trim()
            L_0x005c:
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r0)
                goto L_0x0069
            L_0x0061:
                java.lang.String r0 = "MicroMsg.SyncMessageNotifier"
                java.lang.String r1 = "empty fromuser or touser"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            L_0x0068:
                r0 = r4
            L_0x0069:
                com.tencent.mm.message.l$b r0 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r0, r4)
                int r1 = r0.f195560c1
                r2 = 1
                if (r1 != r2) goto L_0x0098
                java.lang.String r1 = r0.f195564d1
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x0098
                java.lang.String r1 = r0.f195568e1
                boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                if (r1 != 0) goto L_0x0098
                java.lang.String r1 = "showNotifyWeb"
                p285zh.C119114c.m167921f(r1)
                eb0.c3 r2 = r9.f232867e
                r3 = 39
                java.lang.String r4 = r0.f195568e1
                java.lang.String r6 = r0.f195564d1
                r7 = 0
                r8 = 0
                java.lang.String r5 = ""
                r2.mo93205b(r3, r4, r5, r6, r7, r8)
                goto L_0x00a7
            L_0x0098:
                eb0.c3 r0 = r9.f232867e
                com.tencent.mm.storage.f4 r1 = r9.f232868f
                r0.mo93204a(r1)
                goto L_0x00a7
            L_0x00a0:
                eb0.c3 r0 = r9.f232867e
                com.tencent.mm.storage.f4 r1 = r9.f232868f
                r0.mo93204a(r1)
            L_0x00a7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zc2.C79318h.C79320b.run():void");
        }
    }

    public C79318h(boolean z) {
        this.f232861a = z;
        this.f232862b = false;
        this.f232863c = new LinkedList();
    }

    /* renamed from: a */
    public void mo58465a() {
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.f232863c);
        ((LinkedList) this.f232863c).clear();
        if (linkedList.size() != 0) {
            ArrayList arrayList = new ArrayList();
            synchronized (f232860d) {
                Iterator it = ((ArrayList) f232860d).iterator();
                while (it.hasNext()) {
                    arrayList.add((C75568c3) it.next());
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C75568c3 c3Var = (C75568c3) it4.next();
                new MMHandler(c3Var.getLooper()).post(new C79319a(this, c3Var, linkedList));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r5.mo108769t2() != 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (r5.getStatus() != 4) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        r0 = sf0.C48374j0.m53718g(r6.f227628e);
        r1 = ((f62.C75700k0) f40.C86709a0.m107533q(f62.C75700k0.class)).V50();
        r2 = r0.indexOf("@");
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        if (r2 < 0) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r0.substring(0, r2);
        r0 = r0.substring(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006c, code lost:
        if (r0 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        r0 = ((com.tencent.p014mm.storage.C44667s4) r1).mo69821jo(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r0 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        if ((r0.f121097d & 2) == 0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        if (r3 != false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105918d("MicroMsg.SyncMessageNotifier", "account no notification");
        p285zh.C119114c.m167922g("roleMute");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0092, code lost:
        if (r4.f232862b != false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        r4.f232862b = true;
        r0 = new java.util.ArrayList();
        r1 = f232860d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009d, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2 = ((java.util.ArrayList) f232860d).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        if (r2.hasNext() == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ac, code lost:
        r0.add((eb0.C75568c3) r2.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b6, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b7, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bf, code lost:
        if (r0.hasNext() == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c1, code lost:
        r1 = (eb0.C75568c3) r0.next();
        new com.tencent.p014mm.sdk.platformtools.MMHandler(r1.getLooper()).post(new zc2.C79318h.C79320b(r4, r6, r1, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dc, code lost:
        ((java.util.LinkedList) r4.f232863c).add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e4, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.SyncMessageNotifier", "not new msg, ignore");
        p285zh.C119114c.m167922g("notNewMsg");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo58466b(com.tencent.p014mm.storage.C72963f4 r5, te3.C77949j3 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "newMsgSync"
            p285zh.C119114c.m167921f(r0)
            boolean r0 = r4.f232861a
            if (r0 == 0) goto L_0x0018
            java.lang.String r5 = "MicroMsg.SyncMessageNotifier"
            java.lang.String r6 = "mDummy is true, do nothing and return."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.lang.String r5 = "dummy"
            p285zh.C119114c.m167922g(r5)
            return
        L_0x0018:
            java.util.List<eb0.c3> r0 = f232860d
            monitor-enter(r0)
            java.util.List<eb0.c3> r1 = f232860d     // Catch:{ all -> 0x00f3 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x00f3 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00f3 }
            if (r1 == 0) goto L_0x0035
            java.lang.String r5 = "MicroMsg.SyncMessageNotifier"
            java.lang.String r6 = "no notifiers, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)     // Catch:{ all -> 0x00f3 }
            java.lang.String r5 = "noNotifier"
            p285zh.C119114c.m167922g(r5)     // Catch:{ all -> 0x00f3 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            return
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            int r0 = r5.mo108769t2()
            if (r0 != 0) goto L_0x00e4
            int r0 = r5.getStatus()
            r1 = 4
            if (r0 != r1) goto L_0x0045
            goto L_0x00e4
        L_0x0045:
            te3.rv3 r0 = r6.f227628e
            java.lang.String r0 = sf0.C48374j0.m53718g(r0)
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            g62.p r1 = r1.V50()
            java.lang.String r2 = "@"
            int r2 = r0.indexOf(r2)
            r3 = 0
            if (r2 < 0) goto L_0x0068
            r0.substring(r3, r2)
            java.lang.String r0 = r0.substring(r2)
            goto L_0x006a
        L_0x0068:
            java.lang.String r0 = ""
        L_0x006a:
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r0 = r2
        L_0x0070:
            com.tencent.mm.storage.s4 r1 = (com.tencent.p014mm.storage.C44667s4) r1
            com.tencent.mm.storage.r4 r0 = r1.mo69821jo(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0090
            int r0 = r0.f121097d
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0080
            r3 = 1
        L_0x0080:
            if (r3 != 0) goto L_0x0090
            java.lang.String r5 = "MicroMsg.SyncMessageNotifier"
            java.lang.String r6 = "account no notification"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r6)
            java.lang.String r5 = "roleMute"
            p285zh.C119114c.m167922g(r5)
            return
        L_0x0090:
            boolean r0 = r4.f232862b
            if (r0 != 0) goto L_0x00dc
            r4.f232862b = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<eb0.c3> r1 = f232860d
            monitor-enter(r1)
            java.util.List<eb0.c3> r2 = f232860d     // Catch:{ all -> 0x00d9 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x00d9 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00d9 }
        L_0x00a6:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00d9 }
            if (r3 == 0) goto L_0x00b6
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00d9 }
            eb0.c3 r3 = (eb0.C75568c3) r3     // Catch:{ all -> 0x00d9 }
            r0.add(r3)     // Catch:{ all -> 0x00d9 }
            goto L_0x00a6
        L_0x00b6:
            monitor-exit(r1)     // Catch:{ all -> 0x00d9 }
            java.util.Iterator r0 = r0.iterator()
        L_0x00bb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00e3
            java.lang.Object r1 = r0.next()
            eb0.c3 r1 = (eb0.C75568c3) r1
            com.tencent.mm.sdk.platformtools.MMHandler r2 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r3 = r1.getLooper()
            r2.<init>((android.os.Looper) r3)
            zc2.h$b r3 = new zc2.h$b
            r3.<init>(r6, r1, r5)
            r2.post(r3)
            goto L_0x00bb
        L_0x00d9:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d9 }
            throw r5
        L_0x00dc:
            java.util.List<com.tencent.mm.storage.f4> r6 = r4.f232863c
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            r6.add(r5)
        L_0x00e3:
            return
        L_0x00e4:
            java.lang.String r5 = "MicroMsg.SyncMessageNotifier"
            java.lang.String r6 = "not new msg, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r6)
            java.lang.String r5 = "notNewMsg"
            p285zh.C119114c.m167922g(r5)
            return
        L_0x00f3:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f3 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zc2.C79318h.mo58466b(com.tencent.mm.storage.f4, te3.j3):void");
    }
}
