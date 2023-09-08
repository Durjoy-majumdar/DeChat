package yb0;

import a70.C112760b;
import android.net.Uri;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.WCWebUpdater;
import com.tencent.xweb.file.XVFSFile;
import eb0.C31543z5;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import oa1.C117731d;
import org.xwalk.core.XWalkEnvironment;

/* renamed from: yb0.c */
public class C118952c implements Runnable {

    /* renamed from: p */
    public static long f356285p;

    /* renamed from: d */
    public int f356286d = 0;

    /* renamed from: e */
    public C118956d f356287e = null;

    /* renamed from: f */
    public C118953a f356288f = new C118953a();

    /* renamed from: g */
    public long f356289g = 0;

    /* renamed from: h */
    public long f356290h = 0;

    /* renamed from: i */
    public long f356291i = 0;

    /* renamed from: j */
    public String f356292j = null;

    /* renamed from: n */
    public String f356293n = null;

    /* renamed from: o */
    public boolean f356294o = false;

    /* renamed from: yb0.c$a */
    public static class C118953a implements Serializable {

        /* renamed from: A */
        public final List<C118954b> f356295A = new CopyOnWriteArrayList();

        /* renamed from: B */
        public final List<C118954b> f356296B = new CopyOnWriteArrayList();

        /* renamed from: C */
        public final List<C118954b> f356297C = new CopyOnWriteArrayList();

        /* renamed from: d */
        public final List<C118956d> f356298d = new CopyOnWriteArrayList();

        /* renamed from: e */
        public final List<C118955c> f356299e = new CopyOnWriteArrayList();

        /* renamed from: f */
        public final List<C118955c> f356300f = new CopyOnWriteArrayList();

        /* renamed from: g */
        public final List<C118954b> f356301g = new CopyOnWriteArrayList();

        /* renamed from: h */
        public final List<C118954b> f356302h = new CopyOnWriteArrayList();

        /* renamed from: i */
        public final List<C118954b> f356303i = new CopyOnWriteArrayList();

        /* renamed from: j */
        public final List<C118954b> f356304j = new CopyOnWriteArrayList();

        /* renamed from: n */
        public final List<C118954b> f356305n = new CopyOnWriteArrayList();

        /* renamed from: o */
        public final List<C118954b> f356306o = new CopyOnWriteArrayList();

        /* renamed from: p */
        public final List<C118954b> f356307p = new CopyOnWriteArrayList();

        /* renamed from: q */
        public final List<C118954b> f356308q = new CopyOnWriteArrayList();

        /* renamed from: r */
        public final List<C118954b> f356309r = new CopyOnWriteArrayList();

        /* renamed from: s */
        public final List<C118954b> f356310s = new CopyOnWriteArrayList();

        /* renamed from: t */
        public final List<C118954b> f356311t = new CopyOnWriteArrayList();

        /* renamed from: u */
        public final List<C118954b> f356312u = new CopyOnWriteArrayList();

        /* renamed from: v */
        public final List<C118954b> f356313v = new CopyOnWriteArrayList();

        /* renamed from: w */
        public final List<C118954b> f356314w = new CopyOnWriteArrayList();

        /* renamed from: x */
        public final List<C118954b> f356315x = new CopyOnWriteArrayList();

        /* renamed from: y */
        public final List<C118954b> f356316y = new CopyOnWriteArrayList();

        /* renamed from: z */
        public final List<C118954b> f356317z = new CopyOnWriteArrayList();

        /* renamed from: a */
        public void mo183629a(List<C118954b> list, List<C118954b> list2) {
            if (list.size() > 10000) {
                int i = 0;
                while (i < list2.size() + 100) {
                    try {
                        list.remove(0);
                        i++;
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.ActiveDetector.ProcessDetector", "addDelayedMsgList %s", e.getMessage());
                    }
                }
            }
            list.addAll(list2);
        }

        /* renamed from: b */
        public void mo183630b(C118956d dVar) {
            if (((CopyOnWriteArrayList) this.f356298d).size() > 30000) {
                int i = 0;
                while (i < 100) {
                    try {
                        ((CopyOnWriteArrayList) this.f356298d).remove(0);
                        i++;
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.ActiveDetector.ProcessDetector", "addProcessStatusList %s", e.getMessage());
                    }
                }
            }
            ((CopyOnWriteArrayList) this.f356298d).add(dVar);
        }

        /* renamed from: c */
        public void mo183631c(List<C118955c> list) {
            if (((CopyOnWriteArrayList) this.f356300f).size() > 30000) {
                int i = 0;
                while (i < list.size() + 100) {
                    try {
                        ((CopyOnWriteArrayList) this.f356300f).remove(0);
                        i++;
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.ActiveDetector.ProcessDetector", "addReceiveInterProcessList %s", e.getMessage());
                    }
                }
            }
            ((CopyOnWriteArrayList) this.f356300f).addAll(list);
        }

        /* renamed from: d */
        public void mo183632d(List<C118955c> list) {
            if (((CopyOnWriteArrayList) this.f356299e).size() > 30000) {
                int i = 0;
                while (i < list.size() + 100) {
                    try {
                        ((CopyOnWriteArrayList) this.f356299e).remove(0);
                        i++;
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.ActiveDetector.ProcessDetector", "addSendInterProcessList %s", e.getMessage());
                    }
                }
            }
            ((CopyOnWriteArrayList) this.f356299e).addAll(list);
        }
    }

    /* renamed from: yb0.c$b */
    public static class C118954b implements Serializable {
        public String toString() {
            return String.format("pid:%s, server time:%s, client time:%s, msg server time:%s, intervalTime:%s, msg server id:%s username:%s, msgType:%s", new Object[]{0, C118950a.m167705b(0), C118950a.m167705b(0), C118950a.m167705b(0), 0L, 0L, null, 0});
        }
    }

    /* renamed from: yb0.c$c */
    public static class C118955c implements Serializable {

        /* renamed from: d */
        public long f356318d;

        /* renamed from: e */
        public long f356319e;

        /* renamed from: f */
        public int f356320f;

        /* renamed from: g */
        public long f356321g;

        public C118955c(long j, long j2, int i, long j3) {
            this.f356318d = j;
            this.f356319e = j2;
            this.f356320f = i;
            this.f356321g = j3;
        }

        public String toString() {
            return String.format("serverTime:%s,time:%s,type:%s,recvTime:%s", new Object[]{C118950a.m167705b(this.f356318d), C118950a.m167705b(this.f356319e), Integer.valueOf(this.f356320f), Long.valueOf(this.f356321g)});
        }
    }

    /* renamed from: yb0.c$d */
    public static class C118956d implements Serializable {

        /* renamed from: d */
        public int f356322d = 0;

        /* renamed from: e */
        public long f356323e = 0;

        /* renamed from: f */
        public long f356324f = 0;

        /* renamed from: g */
        public long f356325g = 0;

        /* renamed from: h */
        public int f356326h = 0;

        /* renamed from: i */
        public boolean f356327i = true;

        /* renamed from: j */
        public boolean f356328j = false;

        /* renamed from: a */
        public C118956d mo183635a(int i, long j, long j2, int i2) {
            long j3 = j2 - j;
            if (this.f356326h != i2 || j3 > C118952c.m167709b() + 20000) {
                C118956d dVar = new C118956d();
                dVar.f356322d = i;
                dVar.f356324f = j;
                dVar.f356325g = j2;
                dVar.f356326h = i2;
                if (this.f356326h != i2) {
                    dVar.f356328j = true;
                }
                if (j3 > C118952c.m167709b() + 20000) {
                    dVar.f356327i = false;
                }
                return dVar;
            }
            this.f356322d = i;
            if (this.f356324f <= 0) {
                this.f356324f = j;
                this.f356323e = C31543z5.m39451a();
            }
            this.f356325g = j2;
            this.f356326h = i2;
            return null;
        }

        public String toString() {
            return String.format("pid:%s,startServerTime:%s,startTime:%s,endTime:%s,normalExecute:%s,changedNetworkStatus:%s,networkStatus:%s", new Object[]{Integer.valueOf(this.f356322d), C118950a.m167705b(this.f356323e), C118950a.m167705b(this.f356324f), C118950a.m167705b(this.f356325g), Boolean.valueOf(this.f356327i), Boolean.valueOf(this.f356328j), Integer.valueOf(this.f356326h)});
        }
    }

    public C118952c() {
        boolean z = false;
        String str = C112760b.m154225d() + "ProcessDetector";
        this.f356292j = str;
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(l.mo177810a() ? l.f348991a.mo119948x(l.f348992b) : z)) {
            C116281f0.C116288h l2 = C116281f0.C116289i.f348994a.mo177799l(n, l);
            if (l2.mo177810a()) {
                l2.f348991a.mo119937g(l2.f348992b);
            }
        }
        if (MMApplicationContext.isMMProcess()) {
            this.f356293n = this.f356292j + "/" + XWalkEnvironment.MODULE_MM;
        } else if (MMApplicationContext.isPushProcess()) {
            this.f356293n = this.f356292j + "/" + "push";
        }
    }

    /* renamed from: b */
    public static long m167709b() {
        if (f356285p == 0) {
            f356285p = Util.getLong(C117731d.m166007c().mo182444f("clicfg_android_process_detect_time", WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, false, true), 5) * 60 * 1000;
        }
        return f356285p;
    }

    /* renamed from: a */
    public final void mo183624a(long j, List<C118954b> list) {
        for (C118954b next : list) {
            if (next == null) {
                list.remove(next);
            } else if (j - 0 >= 259200000) {
                list.remove(next);
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo183625c(StringBuilder sb, List<C118954b> list, String str) {
        int i = 0;
        if (list.size() <= 0) {
            return false;
        }
        sb.append(str);
        sb.append("[");
        sb.append(list.size());
        sb.append("]");
        sb.append(XVFSFile.PATH_SEPARATOR);
        sb.append("\n");
        for (C118954b append : list) {
            sb.append("\t");
            sb.append(append);
            sb.append("\n");
            i++;
            if (i > 1000) {
                break;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final void mo183626d(C118953a aVar, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ProcessInfo <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        sb.append("\n");
        int i = 0;
        if (((CopyOnWriteArrayList) aVar.f356298d).size() > 0) {
            sb.append("processStatusList:");
            sb.append("\n");
            Iterator it = ((CopyOnWriteArrayList) aVar.f356298d).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                sb.append("\t");
                sb.append((C118956d) it.next());
                sb.append("\n");
                i2++;
                if (i2 > 1000) {
                    break;
                }
            }
        }
        if (((CopyOnWriteArrayList) aVar.f356299e).size() > 0) {
            sb.append("sendInterProcessList:");
            sb.append("\n");
            Iterator it4 = ((CopyOnWriteArrayList) aVar.f356299e).iterator();
            int i3 = 0;
            while (it4.hasNext()) {
                sb.append("\t");
                sb.append((C118955c) it4.next());
                sb.append("\n");
                i3++;
                if (i3 > 1000) {
                    break;
                }
            }
        }
        if (((CopyOnWriteArrayList) aVar.f356300f).size() > 0) {
            sb.append("receiveInterProcessList:");
            sb.append("\n");
            Iterator it5 = ((CopyOnWriteArrayList) aVar.f356300f).iterator();
            while (it5.hasNext()) {
                sb.append("\t");
                sb.append((C118955c) it5.next());
                sb.append("\n");
                i++;
                if (i > 1000) {
                    break;
                }
            }
        }
        sb.append(">>>>>>>>>>>>>>>>>>>>> foreground <<<<<<<<<<<<<<<<<<<<<");
        sb.append("\n");
        mo183625c(sb, aVar.f356301g, "foregroundDelayed2sMsgList");
        mo183625c(sb, aVar.f356302h, "foregroundDelayed5sMsgList");
        mo183625c(sb, aVar.f356303i, "foregroundDelayed10sMsgList");
        mo183625c(sb, aVar.f356304j, "foregroundDelayed30sMsgList");
        mo183625c(sb, aVar.f356305n, "foregroundDelayed1minMsgList");
        mo183625c(sb, aVar.f356306o, "foregroundDelayed3minMsgList");
        mo183625c(sb, aVar.f356307p, "foregroundDelayed5minMsgList");
        mo183625c(sb, aVar.f356308q, "foregroundDelayed10minMsgList");
        mo183625c(sb, aVar.f356309r, "foregroundDelayed30minMsgList");
        mo183625c(sb, aVar.f356310s, "foregroundDelayed1hMsgList");
        sb.append(">>>>>>>>>>>>>>>>>>>>> background <<<<<<<<<<<<<<<<<<<<<");
        sb.append("\n");
        mo183625c(sb, aVar.f356311t, "backgroundDelayed2sMsgList");
        mo183625c(sb, aVar.f356312u, "backgroundDelayed5sMsgList");
        mo183625c(sb, aVar.f356313v, "backgroundDelayed10sMsgList");
        mo183625c(sb, aVar.f356314w, "backgroundDelayed30sMsgList");
        mo183625c(sb, aVar.f356315x, "backgroundDelayed1minMsgList");
        mo183625c(sb, aVar.f356316y, "backgroundDelayed3minMsgList");
        mo183625c(sb, aVar.f356317z, "backgroundDelayed5minMsgList");
        mo183625c(sb, aVar.f356295A, "backgroundDelayed10minMsgList");
        mo183625c(sb, aVar.f356296B, "backgroundDelayed30minMsgList");
        mo183625c(sb, aVar.f356297C, "backgroundDelayed1hMsgList");
        sb.append(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> END <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        Log.m105924i("MicroMsg.ActiveDetector.ProcessDetector", "printProcessInfoAndReport()\n" + sb);
    }

    /* renamed from: e */
    public void mo183627e() {
        List<C118956d> list;
        C118953a aVar = this.f356288f;
        if (aVar != null && (list = aVar.f356298d) != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Log.m105919d("MicroMsg.ActiveDetector.ProcessDetector", "save data to %s", this.f356293n);
            try {
                C91391b.m114667b(this.f356288f, C86013q1.m106429K(this.f356293n, false));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ActiveDetector.ProcessDetector", "%s,write exception:" + e.getMessage(), this.f356293n);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0411, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x041e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0432, code lost:
        r7 = 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0411 A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:87:0x03a7] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x041e A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:63:0x0349] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r1 = r17
            long r2 = android.os.SystemClock.currentThreadTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "#run, startMs = "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.ActiveDetector.ProcessDetector"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            long r5 = java.lang.System.currentTimeMillis()
            r1.f356290h = r5
            r1.f356291i = r5
            yb0.c$d r0 = new yb0.c$d
            r0.<init>()
            r1.f356287e = r0
            int r5 = android.os.Process.myPid()
            long r6 = r1.f356290h
            long r8 = r1.f356291i
            int r10 = r1.f356286d
            r0.f356322d = r5
            long r11 = r0.f356324f
            r13 = 0
            int r5 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x0047
            r0.f356324f = r6
            long r5 = eb0.C31543z5.m39451a()
            r0.f356323e = r5
        L_0x0047:
            r0.f356325g = r8
            r0.f356326h = r10
            yb0.c$a r0 = r1.f356288f
            java.util.List<yb0.c$d> r0 = r0.f356298d
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            boolean r0 = r0.isEmpty()
            r5 = 3
            r6 = 0
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L_0x019b
            java.lang.String r0 = r1.f356293n     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            long r9 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r11 = 10485760(0xa00000, double:5.180654E-317)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x0086
            java.lang.String r0 = "%s size:%s exceed max(%s)"
            java.lang.Object[] r15 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.lang.String r13 = r1.f356293n     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r15[r6] = r13     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r15[r8] = r9     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.lang.Long r9 = java.lang.Long.valueOf(r11)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r15[r7] = r9     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r15)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.lang.String r0 = r1.f356293n     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            goto L_0x019b
        L_0x0086:
            java.lang.String r0 = r1.f356293n     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.io.InputStream r0 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.lang.Object r0 = yb0.C91391b.m114666a(r0)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r0 = (yb0.C118952c.C118953a) r0     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            if (r0 == 0) goto L_0x019b
            yb0.c$a r9 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$c> r9 = r9.f356299e     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183632d(r9)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r9 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$c> r9 = r9.f356300f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183631c(r9)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356301g     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356301g     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356302h     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356302h     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356303i     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356303i     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356304j     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356304j     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356305n     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356305n     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356306o     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356306o     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356307p     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356307p     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356308q     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356308q     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356309r     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356309r     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356310s     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356310s     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356311t     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356311t     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356312u     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356312u     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356313v     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356313v     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356314w     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356314w     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356315x     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356315x     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356316y     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356316y     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356317z     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356317z     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356295A     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356295A     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356296B     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356296B     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r9 = r0.f356297C     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            yb0.c$a r10 = r1.f356288f     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            java.util.List<yb0.c$b> r10 = r10.f356297C     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r0.mo183629a(r9, r10)     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            r1.f356288f = r0     // Catch:{ Exception -> 0x0177, Error -> 0x0159 }
            goto L_0x019b
        L_0x0159:
            r0 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r10 = r0.getMessage()
            r9[r6] = r10
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r9[r8] = r0
            java.lang.String r0 = "error: %s, errorType:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r9)
            java.lang.String r0 = r1.f356293n
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
            goto L_0x019b
        L_0x0177:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "%s,read exception:"
            r9.append(r10)
            java.lang.String r0 = r0.getMessage()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[r8]
            java.lang.String r10 = r1.f356293n
            r9[r6] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r9)
            java.lang.String r0 = r1.f356293n
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)
        L_0x019b:
            yb0.c$a r0 = r1.f356288f
            if (r0 != 0) goto L_0x01a1
            goto L_0x02a4
        L_0x01a1:
            long r9 = java.lang.System.currentTimeMillis()
            java.util.List<yb0.c$d> r11 = r0.f356298d     // Catch:{ Exception -> 0x029c }
            java.util.concurrent.CopyOnWriteArrayList r11 = (java.util.concurrent.CopyOnWriteArrayList) r11     // Catch:{ Exception -> 0x029c }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x029c }
        L_0x01ad:
            boolean r12 = r11.hasNext()     // Catch:{ Exception -> 0x029c }
            r13 = 259200000(0xf731400, double:1.280618154E-315)
            if (r12 == 0) goto L_0x01d9
            java.lang.Object r12 = r11.next()     // Catch:{ Exception -> 0x029c }
            yb0.c$d r12 = (yb0.C118952c.C118956d) r12     // Catch:{ Exception -> 0x029c }
            if (r12 != 0) goto L_0x01c6
            java.util.List<yb0.c$d> r13 = r0.f356298d     // Catch:{ Exception -> 0x029c }
            java.util.concurrent.CopyOnWriteArrayList r13 = (java.util.concurrent.CopyOnWriteArrayList) r13     // Catch:{ Exception -> 0x029c }
            r13.remove(r12)     // Catch:{ Exception -> 0x029c }
            goto L_0x01ad
        L_0x01c6:
            long r7 = r12.f356325g     // Catch:{ Exception -> 0x029c }
            long r7 = r9 - r7
            int r16 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x01cf
            goto L_0x01d9
        L_0x01cf:
            java.util.List<yb0.c$d> r7 = r0.f356298d     // Catch:{ Exception -> 0x029c }
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7     // Catch:{ Exception -> 0x029c }
            r7.remove(r12)     // Catch:{ Exception -> 0x029c }
            r7 = 2
            r8 = 1
            goto L_0x01ad
        L_0x01d9:
            java.util.List<yb0.c$c> r7 = r0.f356299e     // Catch:{ Exception -> 0x029c }
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7     // Catch:{ Exception -> 0x029c }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x029c }
        L_0x01e1:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x029c }
            if (r8 == 0) goto L_0x0208
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x029c }
            yb0.c$c r8 = (yb0.C118952c.C118955c) r8     // Catch:{ Exception -> 0x029c }
            if (r8 != 0) goto L_0x01f7
            java.util.List<yb0.c$c> r11 = r0.f356299e     // Catch:{ Exception -> 0x029c }
            java.util.concurrent.CopyOnWriteArrayList r11 = (java.util.concurrent.CopyOnWriteArrayList) r11     // Catch:{ Exception -> 0x029c }
            r11.remove(r8)     // Catch:{ Exception -> 0x029c }
            goto L_0x01e1
        L_0x01f7:
            long r11 = r8.f356319e     // Catch:{ Exception -> 0x029c }
            long r11 = r9 - r11
            int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x0200
            goto L_0x0208
        L_0x0200:
            java.util.List<yb0.c$c> r11 = r0.f356299e     // Catch:{ Exception -> 0x029c }
            java.util.concurrent.CopyOnWriteArrayList r11 = (java.util.concurrent.CopyOnWriteArrayList) r11     // Catch:{ Exception -> 0x029c }
            r11.remove(r8)     // Catch:{ Exception -> 0x029c }
            goto L_0x01e1
        L_0x0208:
            java.util.List<yb0.c$c> r7 = r0.f356300f     // Catch:{ Exception -> 0x029c }
            java.util.concurrent.CopyOnWriteArrayList r7 = (java.util.concurrent.CopyOnWriteArrayList) r7     // Catch:{ Exception -> 0x029c }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Exception -> 0x029c }
        L_0x0210:
            boolean r8 = r7.hasNext()     // Catch:{ Exception -> 0x029c }
            if (r8 == 0) goto L_0x0237
            java.lang.Object r8 = r7.next()     // Catch:{ Exception -> 0x029c }
            yb0.c$c r8 = (yb0.C118952c.C118955c) r8     // Catch:{ Exception -> 0x029c }
            if (r8 != 0) goto L_0x0226
            java.util.List<yb0.c$c> r11 = r0.f356300f     // Catch:{ Exception -> 0x029c }
            java.util.concurrent.CopyOnWriteArrayList r11 = (java.util.concurrent.CopyOnWriteArrayList) r11     // Catch:{ Exception -> 0x029c }
            r11.remove(r8)     // Catch:{ Exception -> 0x029c }
            goto L_0x0210
        L_0x0226:
            long r11 = r8.f356319e     // Catch:{ Exception -> 0x029c }
            long r11 = r9 - r11
            int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r16 >= 0) goto L_0x022f
            goto L_0x0237
        L_0x022f:
            java.util.List<yb0.c$c> r11 = r0.f356300f     // Catch:{ Exception -> 0x029c }
            java.util.concurrent.CopyOnWriteArrayList r11 = (java.util.concurrent.CopyOnWriteArrayList) r11     // Catch:{ Exception -> 0x029c }
            r11.remove(r8)     // Catch:{ Exception -> 0x029c }
            goto L_0x0210
        L_0x0237:
            java.util.List<yb0.c$b> r7 = r0.f356301g     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356302h     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356303i     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356304j     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356305n     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356306o     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356307p     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356308q     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356309r     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356310s     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356311t     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356312u     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356313v     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356314w     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356315x     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356316y     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356317z     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356295A     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r7 = r0.f356296B     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r7)     // Catch:{ Exception -> 0x029c }
            java.util.List<yb0.c$b> r0 = r0.f356297C     // Catch:{ Exception -> 0x029c }
            r1.mo183624a(r9, r0)     // Catch:{ Exception -> 0x029c }
            goto L_0x02a4
        L_0x029c:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = "check data exception."
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r0, r8, r7)
        L_0x02a4:
            yb0.c$a r0 = r1.f356288f
            yb0.c$d r7 = r1.f356287e
            r0.mo183630b(r7)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            yb0.c$a r5 = r1.f356288f
            java.util.List<yb0.c$d> r5 = r5.f356298d
            java.util.concurrent.CopyOnWriteArrayList r5 = (java.util.concurrent.CopyOnWriteArrayList) r5
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r6] = r5
            yb0.c$a r5 = r1.f356288f
            java.util.List<yb0.c$c> r5 = r5.f356299e
            java.util.concurrent.CopyOnWriteArrayList r5 = (java.util.concurrent.CopyOnWriteArrayList) r5
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r7 = 1
            r0[r7] = r5
            yb0.c$a r5 = r1.f356288f
            java.util.List<yb0.c$c> r5 = r5.f356300f
            java.util.concurrent.CopyOnWriteArrayList r5 = (java.util.concurrent.CopyOnWriteArrayList) r5
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8 = 2
            r0[r8] = r5
            java.lang.String r5 = "exist process status data size:%s,send broadcast size:%s, receive broadcast size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r0)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            boolean r5 = r1.f356294o
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0[r6] = r5
            java.lang.String r5 = "start: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r0)
            long r7 = eb0.C31543z5.m39451a()
            java.lang.String r0 = "msg_about"
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            java.lang.String r9 = "last_print_process_info_time"
            r10 = 0
            long r12 = r5.getLong(r9, r10)
            long r10 = r7 - r12
            r12 = 86400000(0x5265c00, double:4.2687272E-316)
            int r5 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r5 < 0) goto L_0x0323
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r9, r7)
            r0.commit()
            yb0.c$a r0 = r1.f356288f
            r1.mo183626d(r0, r7)
        L_0x0323:
            oa1.d r0 = oa1.C117731d.m166007c()
            java.lang.String r5 = "1"
            java.lang.String r7 = "clicfg_android_process_detect_sw"
            r8 = 1
            java.lang.String r0 = r0.mo182444f(r7, r5, r6, r8)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r0, (java.lang.String) r5)
            if (r0 == 0) goto L_0x0452
            boolean r0 = r1.f356294o
            if (r0 == 0) goto L_0x0452
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = r0.isInterrupted()
            if (r0 != 0) goto L_0x0452
            java.lang.String r0 = "run() while:"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            int r8 = android.os.Process.myPid()     // Catch:{ InterruptedException -> 0x0432, Exception -> 0x041e }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            yb0.c$d r7 = r1.f356287e     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            long r9 = r1.f356291i     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            int r0 = r1.f356286d     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            r11 = r13
            r14 = r13
            r13 = r0
            yb0.c$d r0 = r7.mo183635a(r8, r9, r11, r13)     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            if (r0 == 0) goto L_0x0372
            java.lang.String r7 = "create process status:%s"
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ InterruptedException -> 0x0432, Exception -> 0x041e }
            r9[r6] = r0     // Catch:{ InterruptedException -> 0x0432, Exception -> 0x041e }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r7, r9)     // Catch:{ InterruptedException -> 0x0432, Exception -> 0x041e }
            r1.f356287e = r0     // Catch:{ InterruptedException -> 0x0432, Exception -> 0x041e }
            yb0.c$a r7 = r1.f356288f     // Catch:{ InterruptedException -> 0x0432, Exception -> 0x041e }
            r7.mo183630b(r0)     // Catch:{ InterruptedException -> 0x0432, Exception -> 0x041e }
            goto L_0x037e
        L_0x0372:
            java.lang.String r0 = "current process status:%s"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ InterruptedException -> 0x0418, Exception -> 0x041e }
            yb0.c$d r7 = r1.f356287e     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            r8[r6] = r7     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r8)     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
        L_0x037e:
            java.lang.String r0 = "send broadcast:%s,receive broadcast:%s"
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ InterruptedException -> 0x041b, Exception -> 0x0416 }
            yb0.c$a r8 = r1.f356288f     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            java.util.List<yb0.c$c> r9 = r8.f356299e     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            r7[r6] = r9     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            java.util.List<yb0.c$c> r8 = r8.f356300f     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            r9 = 1
            r7[r9] = r8     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r4, r0, r7)     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            r1.f356291i = r14     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            long r7 = r1.f356289g     // Catch:{ InterruptedException -> 0x041a, Exception -> 0x041e }
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x03a7
            long r7 = r14 - r7
            r11 = 1200000(0x124f80, double:5.92879E-318)
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x03a5
            goto L_0x03a7
        L_0x03a5:
            r5 = 2
            goto L_0x03e1
        L_0x03a7:
            r1.f356289g = r14     // Catch:{ InterruptedException -> 0x0414, Exception -> 0x0411 }
            r17.mo183627e()     // Catch:{ InterruptedException -> 0x0414, Exception -> 0x0411 }
            java.lang.String r0 = "one 3*minute per log, current process status:%s"
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ InterruptedException -> 0x040f, Exception -> 0x0411 }
            yb0.c$d r7 = r1.f356287e     // Catch:{ InterruptedException -> 0x0414, Exception -> 0x0411 }
            r8[r6] = r7     // Catch:{ InterruptedException -> 0x0414, Exception -> 0x0411 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r8)     // Catch:{ InterruptedException -> 0x0414, Exception -> 0x0411 }
            java.lang.String r0 = "one 3*minute per log, send broadcast size:%s,receive broadcast size:%s"
            r5 = 2
            java.lang.Object[] r7 = new java.lang.Object[r5]     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            yb0.c$a r8 = r1.f356288f     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            java.util.List<yb0.c$c> r8 = r8.f356299e     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            java.util.concurrent.CopyOnWriteArrayList r8 = (java.util.concurrent.CopyOnWriteArrayList) r8     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            int r8 = r8.size()     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            r7[r6] = r8     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            yb0.c$a r8 = r1.f356288f     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            java.util.List<yb0.c$c> r8 = r8.f356300f     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            java.util.concurrent.CopyOnWriteArrayList r8 = (java.util.concurrent.CopyOnWriteArrayList) r8     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            int r8 = r8.size()     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            r11 = 1
            r7[r11] = r8     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r0, r7)     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
        L_0x03e1:
            long r7 = m167709b()     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            r0.<init>()     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            java.lang.String r11 = "#run sleep, sleepMs = "
            r0.append(r11)     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            r0.append(r7)     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            java.lang.String r11 = ", costMs = "
            r0.append(r11)     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            long r11 = android.os.SystemClock.currentThreadTimeMillis()     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            long r11 = r11 - r2
            r0.append(r11)     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            java.lang.String r0 = r0.toString()     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            java.lang.Thread.sleep(r7)     // Catch:{ InterruptedException -> 0x040d, Exception -> 0x040b }
            goto L_0x0323
        L_0x040b:
            r0 = move-exception
            goto L_0x0422
        L_0x040d:
            r7 = 1
            goto L_0x0436
        L_0x040f:
            r5 = 2
            goto L_0x0436
        L_0x0411:
            r0 = move-exception
            r5 = 2
            goto L_0x0422
        L_0x0414:
            r5 = 2
            goto L_0x040d
        L_0x0416:
            r0 = move-exception
            goto L_0x0420
        L_0x0418:
            r5 = 2
            goto L_0x0434
        L_0x041a:
            r5 = 2
        L_0x041b:
            r9 = 0
            goto L_0x040d
        L_0x041e:
            r0 = move-exception
            r5 = 2
        L_0x0420:
            r9 = 0
        L_0x0422:
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.String r0 = r0.getMessage()
            r8[r6] = r0
            java.lang.String r0 = "exception,%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r4, r0, r8)
            goto L_0x0323
        L_0x0432:
            r5 = 2
            r7 = 1
        L_0x0434:
            r9 = 0
        L_0x0436:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            int r8 = android.os.Process.myTid()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0[r6] = r8
            java.lang.String r8 = "process detector thread interrupt.thread id:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r8, r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            r1.f356294o = r6
            goto L_0x0323
        L_0x0452:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "#run end, costMs = "
            r0.append(r5)
            long r5 = android.os.SystemClock.currentThreadTimeMillis()
            long r5 = r5 - r2
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yb0.C118952c.run():void");
    }
}
