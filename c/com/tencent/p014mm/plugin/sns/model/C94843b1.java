package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.pointers.PLong;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C75592q0;
import f40.C86709a0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import ms2.C47095d;
import ms2.C47096f;
import ms2.C99964c;
import ms2.C99965e;
import te3.m64;
import te3.n64;
import te3.w64;

/* renamed from: com.tencent.mm.plugin.sns.model.b1 */
public class C94843b1 {

    /* renamed from: a */
    public C99964c f274774a;

    /* renamed from: b */
    public String f274775b;

    /* renamed from: c */
    public String f274776c = "";

    /* renamed from: d */
    public List<Integer> f274777d = new Vector();

    /* renamed from: e */
    public Map<String, Integer> f274778e = new HashMap();

    /* renamed from: f */
    public List<Integer> f274779f = new Vector();

    /* renamed from: g */
    public Map<Integer, Integer> f274780g = new HashMap();

    /* renamed from: h */
    public C94844a f274781h;

    /* renamed from: com.tencent.mm.plugin.sns.model.b1$a */
    public interface C94844a {
        /* renamed from: k */
        void mo130966k();
    }

    public C94843b1(String str) {
        boolean z;
        this.f274775b = str;
        synchronized (this) {
            SnsMethodCalculate.markStartTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            z = false;
            byte[] O = C86013q1.m106433O(this.f274775b, 0, -1);
            if (O == null) {
                SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            } else {
                try {
                    this.f274774a = (C99964c) new C99964c().parseFrom(O);
                    z = true;
                    SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.SnsAsyncQueueMgr", e, "", new Object[0]);
                    C86013q1.m106447h(this.f274775b);
                    SnsMethodCalculate.markEndTimeMs("fileToList", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                }
            }
        }
        if (!z) {
            this.f274774a = new C99964c();
        }
        this.f274777d.clear();
        this.f274778e.clear();
    }

    /* renamed from: g */
    public static void m120186g(long j, LinkedList<C47095d> linkedList, String str) {
        SnsMethodCalculate.markStartTimeMs("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        m120187h(j, linkedList, str, false);
        SnsMethodCalculate.markEndTimeMs("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    /* renamed from: h */
    public static boolean m120187h(long j, LinkedList<C47095d> linkedList, String str, boolean z) {
        C47095d dVar;
        SnsMethodCalculate.markStartTimeMs("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        Iterator<C47095d> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                dVar = null;
                break;
            }
            dVar = it.next();
            if (dVar.f126558e.f298897d == j && (z || dVar.f126557d.equals(str))) {
                break;
            }
        }
        if (dVar != null) {
            linkedList.remove(dVar);
            SnsMethodCalculate.markEndTimeMs("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("delCommentFromToSend", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return false;
    }

    /* renamed from: i */
    public static w64 m120188i(n64 n64) {
        SnsMethodCalculate.markStartTimeMs("fromAcitonToCommentInfo", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        m64 m64 = n64.f298899f;
        m64 m642 = n64.f298900g;
        w64 w64 = new w64();
        w64.f299707h = m64.f298780n;
        w64.f299708i = m64.f298779j;
        w64.f299704e = m64.f298775f;
        w64.f299705f = m64.f298778i;
        w64.f299706g = m64.f298777h;
        w64.f299703d = m64.f298773d;
        w64.f299709j = m64.f298782p;
        w64.f299714r = m64.f298785s;
        w64.f299716t = m64.f298787u;
        w64.f299711o = m642.f298773d;
        w64.f299713q = m642.f298784r;
        w64.f299710n = m642.f298781o;
        w64.f299717u = m64.f298789w;
        w64.f299718v = m64.f298790x;
        SnsMethodCalculate.markEndTimeMs("fromAcitonToCommentInfo", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return w64;
    }

    /* renamed from: l */
    public static boolean m120189l(String str) {
        SnsMethodCalculate.markStartTimeMs("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        } else if (str.startsWith("_AD_TAG_")) {
            SnsMethodCalculate.markEndTimeMs("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return true;
        } else {
            SnsMethodCalculate.markEndTimeMs("isAdCmd", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo130946a(java.lang.String r4, te3.n64 r5, java.lang.String r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "addComment"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch:{ all -> 0x0088 }
            ms2.d r0 = new ms2.d     // Catch:{ all -> 0x0088 }
            r0.<init>()     // Catch:{ all -> 0x0088 }
            r0.f126557d = r4     // Catch:{ all -> 0x0088 }
            r0.f126558e = r5     // Catch:{ all -> 0x0088 }
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ all -> 0x0088 }
            int r4 = (int) r1     // Catch:{ all -> 0x0088 }
            r0.f126559f = r4     // Catch:{ all -> 0x0088 }
            r0.f126560g = r6     // Catch:{ all -> 0x0088 }
            te3.m64 r4 = r5.f298899f     // Catch:{ all -> 0x0088 }
            int r4 = r4.f298777h     // Catch:{ all -> 0x0088 }
            r6 = 1
            if (r4 == r6) goto L_0x0064
            r1 = 2
            if (r4 == r1) goto L_0x005c
            r1 = 3
            if (r4 == r1) goto L_0x0054
            r1 = 5
            if (r4 == r1) goto L_0x004c
            r1 = 16
            if (r4 == r1) goto L_0x0044
            r1 = 7
            if (r4 == r1) goto L_0x0036
            r5 = 8
            if (r4 == r5) goto L_0x0044
            goto L_0x0072
        L_0x0036:
            ms2.c r4 = r3.f274774a     // Catch:{ all -> 0x0088 }
            java.util.LinkedList<ms2.d> r4 = r4.f292899d     // Catch:{ all -> 0x0088 }
            r4.add(r0)     // Catch:{ all -> 0x0088 }
            long r4 = r5.f298897d     // Catch:{ all -> 0x0088 }
            boolean r4 = r3.mo130963v(r4)     // Catch:{ all -> 0x0088 }
            goto L_0x0071
        L_0x0044:
            ms2.c r4 = r3.f274774a     // Catch:{ all -> 0x0088 }
            java.util.LinkedList<ms2.d> r4 = r4.f292900e     // Catch:{ all -> 0x0088 }
            r4.add(r0)     // Catch:{ all -> 0x0088 }
            goto L_0x0072
        L_0x004c:
            ms2.c r4 = r3.f274774a     // Catch:{ all -> 0x0088 }
            java.util.LinkedList<ms2.d> r4 = r4.f292902g     // Catch:{ all -> 0x0088 }
            r4.add(r0)     // Catch:{ all -> 0x0088 }
            goto L_0x0072
        L_0x0054:
            ms2.c r4 = r3.f274774a     // Catch:{ all -> 0x0088 }
            java.util.LinkedList<ms2.d> r4 = r4.f292901f     // Catch:{ all -> 0x0088 }
            r4.add(r0)     // Catch:{ all -> 0x0088 }
            goto L_0x0072
        L_0x005c:
            ms2.c r4 = r3.f274774a     // Catch:{ all -> 0x0088 }
            java.util.LinkedList<ms2.d> r4 = r4.f292900e     // Catch:{ all -> 0x0088 }
            r4.add(r0)     // Catch:{ all -> 0x0088 }
            goto L_0x0072
        L_0x0064:
            ms2.c r4 = r3.f274774a     // Catch:{ all -> 0x0088 }
            java.util.LinkedList<ms2.d> r4 = r4.f292899d     // Catch:{ all -> 0x0088 }
            r4.add(r0)     // Catch:{ all -> 0x0088 }
            long r4 = r5.f298897d     // Catch:{ all -> 0x0088 }
            boolean r4 = r3.mo130963v(r4)     // Catch:{ all -> 0x0088 }
        L_0x0071:
            r6 = r6 ^ r4
        L_0x0072:
            boolean r4 = r3.mo130956o()     // Catch:{ all -> 0x0088 }
            if (r4 != 0) goto L_0x007f
            java.lang.String r4 = "MicroMsg.SnsAsyncQueueMgr"
            java.lang.String r5 = "error listToFile"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r5)     // Catch:{ all -> 0x0088 }
        L_0x007f:
            java.lang.String r4 = "addComment"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)     // Catch:{ all -> 0x0088 }
            monitor-exit(r3)
            return r6
        L_0x0088:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94843b1.mo130946a(java.lang.String, te3.n64, java.lang.String):boolean");
    }

    /* renamed from: b */
    public synchronized void mo130947b(long j) {
        SnsMethodCalculate.markStartTimeMs("addDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        C47096f fVar = new C47096f();
        fVar.f126561d = j;
        fVar.f126562e = (int) Util.nowSecond();
        this.f274774a.f292903h.add(fVar);
        mo130956o();
        SnsMethodCalculate.markEndTimeMs("addDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    /* renamed from: c */
    public synchronized boolean mo130948c(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("addDownLoadingId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (((HashMap) this.f274778e).containsKey(str)) {
            SnsMethodCalculate.markEndTimeMs("addDownLoadingId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        ((HashMap) this.f274778e).put(str, Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("addDownLoadingId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    /* renamed from: d */
    public synchronized boolean mo130949d(int i) {
        SnsMethodCalculate.markStartTimeMs("addUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (((Vector) this.f274779f).contains(Integer.valueOf(i))) {
            SnsMethodCalculate.markEndTimeMs("addUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        ((Vector) this.f274779f).add(Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("addUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ad, code lost:
        if (r6.f274774a.f292904i.isEmpty() != false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00af, code lost:
        r0 = r6.f274774a.f292904i.getFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c2, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.secondsToNow((long) r0.f126562e) <= 21600) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        r6.f274774a.f292904i.removeFirst();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        r0 = r0.f126561d;
        f40.C86709a0.m107528h();
        f40.C86709a0.m107529k().f251779b.mo123460f(new com.tencent.p014mm.plugin.sns.model.C94877g0(r0, 5));
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("checkQueueImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo130950e() {
        /*
            r6 = this;
            java.lang.String r0 = "checkQueue"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            monitor-enter(r6)
            java.lang.String r0 = "checkQueueImp"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch:{ all -> 0x00f9 }
            ms2.c r0 = r6.f274774a     // Catch:{ all -> 0x00f9 }
            java.util.LinkedList<ms2.d> r0 = r0.f292899d     // Catch:{ all -> 0x00f9 }
            boolean r0 = r6.mo130951f(r0)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "checkQueueImp"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r6)
            goto L_0x00f1
        L_0x0023:
            ms2.c r0 = r6.f274774a     // Catch:{ all -> 0x00f9 }
            java.util.LinkedList<ms2.d> r0 = r0.f292900e     // Catch:{ all -> 0x00f9 }
            boolean r0 = r6.mo130951f(r0)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "checkQueueImp"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r6)
            goto L_0x00f1
        L_0x0037:
            ms2.c r0 = r6.f274774a     // Catch:{ all -> 0x00f9 }
            java.util.LinkedList<ms2.d> r0 = r0.f292901f     // Catch:{ all -> 0x00f9 }
            boolean r0 = r6.mo130951f(r0)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "checkQueueImp"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r6)
            goto L_0x00f1
        L_0x004b:
            ms2.c r0 = r6.f274774a     // Catch:{ all -> 0x00f9 }
            java.util.LinkedList<ms2.d> r0 = r0.f292902g     // Catch:{ all -> 0x00f9 }
            boolean r0 = r6.mo130951f(r0)     // Catch:{ all -> 0x00f9 }
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "checkQueueImp"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r6)
            goto L_0x00f1
        L_0x005f:
            ms2.c r0 = r6.f274774a     // Catch:{ all -> 0x00f9 }
            java.util.LinkedList<ms2.f> r0 = r0.f292903h     // Catch:{ all -> 0x00f9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00f9 }
            r1 = 21600(0x5460, double:1.0672E-319)
            if (r0 != 0) goto L_0x00a5
            ms2.c r0 = r6.f274774a     // Catch:{ all -> 0x00f9 }
            java.util.LinkedList<ms2.f> r0 = r0.f292903h     // Catch:{ all -> 0x00f9 }
            java.lang.Object r0 = r0.getFirst()     // Catch:{ all -> 0x00f9 }
            ms2.f r0 = (ms2.C47096f) r0     // Catch:{ all -> 0x00f9 }
            int r3 = r0.f126562e     // Catch:{ all -> 0x00f9 }
            long r3 = (long) r3     // Catch:{ all -> 0x00f9 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r3)     // Catch:{ all -> 0x00f9 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x0088
            ms2.c r0 = r6.f274774a     // Catch:{ all -> 0x00f9 }
            java.util.LinkedList<ms2.f> r0 = r0.f292903h     // Catch:{ all -> 0x00f9 }
            r0.removeFirst()     // Catch:{ all -> 0x00f9 }
            goto L_0x005f
        L_0x0088:
            long r0 = r0.f126561d     // Catch:{ all -> 0x00f9 }
            f40.C86709a0.m107528h()     // Catch:{ all -> 0x00f9 }
            f40.g r2 = f40.C86709a0.m107529k()     // Catch:{ all -> 0x00f9 }
            ob0.b0 r2 = r2.f251779b     // Catch:{ all -> 0x00f9 }
            com.tencent.mm.plugin.sns.model.g0 r3 = new com.tencent.mm.plugin.sns.model.g0     // Catch:{ all -> 0x00f9 }
            r4 = 1
            r3.<init>((long) r0, (int) r4)     // Catch:{ all -> 0x00f9 }
            r2.mo123460f(r3)     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "checkQueueImp"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r6)
            goto L_0x00f1
        L_0x00a5:
            ms2.c r0 = r6.f274774a     // Catch:{ all -> 0x00f9 }
            java.util.LinkedList<ms2.f> r0 = r0.f292904i     // Catch:{ all -> 0x00f9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00f9 }
            if (r0 != 0) goto L_0x00e9
            ms2.c r0 = r6.f274774a     // Catch:{ all -> 0x00f9 }
            java.util.LinkedList<ms2.f> r0 = r0.f292904i     // Catch:{ all -> 0x00f9 }
            java.lang.Object r0 = r0.getFirst()     // Catch:{ all -> 0x00f9 }
            ms2.f r0 = (ms2.C47096f) r0     // Catch:{ all -> 0x00f9 }
            int r3 = r0.f126562e     // Catch:{ all -> 0x00f9 }
            long r3 = (long) r3     // Catch:{ all -> 0x00f9 }
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r3)     // Catch:{ all -> 0x00f9 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 <= 0) goto L_0x00cc
            ms2.c r0 = r6.f274774a     // Catch:{ all -> 0x00f9 }
            java.util.LinkedList<ms2.f> r0 = r0.f292904i     // Catch:{ all -> 0x00f9 }
            r0.removeFirst()     // Catch:{ all -> 0x00f9 }
            goto L_0x00a5
        L_0x00cc:
            long r0 = r0.f126561d     // Catch:{ all -> 0x00f9 }
            f40.C86709a0.m107528h()     // Catch:{ all -> 0x00f9 }
            f40.g r2 = f40.C86709a0.m107529k()     // Catch:{ all -> 0x00f9 }
            ob0.b0 r2 = r2.f251779b     // Catch:{ all -> 0x00f9 }
            com.tencent.mm.plugin.sns.model.g0 r3 = new com.tencent.mm.plugin.sns.model.g0     // Catch:{ all -> 0x00f9 }
            r4 = 5
            r3.<init>((long) r0, (int) r4)     // Catch:{ all -> 0x00f9 }
            r2.mo123460f(r3)     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "checkQueueImp"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r6)
            goto L_0x00f1
        L_0x00e9:
            java.lang.String r0 = "checkQueueImp"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r6)
        L_0x00f1:
            java.lang.String r0 = "checkQueue"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x00f9:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.model.C94843b1.mo130950e():void");
    }

    /* renamed from: f */
    public final boolean mo130951f(LinkedList<C47095d> linkedList) {
        SnsMethodCalculate.markStartTimeMs("checkSendComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        while (!linkedList.isEmpty()) {
            C47095d first = linkedList.getFirst();
            if (Util.secondsToNow((long) first.f126559f) > 21600) {
                linkedList.removeFirst();
            } else {
                if (m120189l(first.f126557d)) {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C94970y(first.f126558e, first.f126557d, first.f126560g, 0));
                } else {
                    C86709a0.m107528h();
                    C86709a0.m107529k().f251779b.mo123460f(new C94850d0(first.f126558e, first.f126557d, 0));
                }
                SnsMethodCalculate.markEndTimeMs("checkSendComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("checkSendComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return false;
    }

    /* renamed from: j */
    public boolean mo130952j(int i, PLong pLong) {
        SnsMethodCalculate.markStartTimeMs("getByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        Iterator<C99965e> it = this.f274774a.f292905j.iterator();
        while (it.hasNext()) {
            C99965e next = it.next();
            if (i == next.f292907e) {
                pLong.value = next.f292906d;
                Log.m105925i("MicroMsg.SnsAsyncQueueMgr", "getByOpTime find %s", Integer.valueOf(i));
                SnsMethodCalculate.markEndTimeMs("getByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("getByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return false;
    }

    /* renamed from: k */
    public synchronized int mo130953k() {
        int size;
        SnsMethodCalculate.markStartTimeMs("getDownLoadingSize", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        size = ((HashMap) this.f274778e).size();
        SnsMethodCalculate.markEndTimeMs("getDownLoadingSize", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return size;
    }

    /* renamed from: m */
    public final boolean mo130954m(LinkedList<w64> linkedList, String str, int i) {
        SnsMethodCalculate.markStartTimeMs("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (Util.isNullOrNil(str)) {
            SnsMethodCalculate.markEndTimeMs("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return true;
        }
        Iterator<w64> it = linkedList.iterator();
        while (it.hasNext()) {
            w64 next = it.next();
            if (str.equals(next.f299707h) && i == next.f299708i) {
                SnsMethodCalculate.markEndTimeMs("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                return true;
            }
        }
        SnsMethodCalculate.markEndTimeMs("isInSnsObj", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return false;
    }

    /* renamed from: n */
    public synchronized boolean mo130955n(int i) {
        boolean contains;
        SnsMethodCalculate.markStartTimeMs("isPosting", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        contains = ((Vector) this.f274777d).contains(Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("isPosting", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return contains;
    }

    /* renamed from: o */
    public final synchronized boolean mo130956o() {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("listToFile", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        z = false;
        try {
            byte[] byteArray = this.f274774a.toByteArray();
            if (C86013q1.m106438T(this.f274775b, byteArray, 0, byteArray.length) == 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("listToFile", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.SnsAsyncQueueMgr", e, "listToFile failed: " + this.f274775b, new Object[0]);
            C86013q1.m106447h(this.f274775b);
            SnsMethodCalculate.markEndTimeMs("listToFile", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return false;
        }
        return z;
    }

    /* renamed from: p */
    public synchronized SnsObject mo130957p(SnsObject snsObject) {
        SnsMethodCalculate.markStartTimeMs("merge", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        if (Util.isNullOrNil(this.f274776c)) {
            this.f274776c = C75592q0.m90789s();
        }
        if (this.f274774a.f292899d.size() == 0 && this.f274774a.f292900e.size() == 0) {
            SnsMethodCalculate.markEndTimeMs("merge", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            return snsObject;
        }
        long j = snsObject.f283891Id;
        Iterator<C47095d> it = this.f274774a.f292899d.iterator();
        while (it.hasNext()) {
            C47095d next = it.next();
            w64 i = m120188i(next.f126558e);
            if (next.f126558e.f298897d == j && !mo130954m(snsObject.LikeUserList, i.f299707h, i.f299708i)) {
                snsObject.LikeUserList.add(i);
                snsObject.LikeCount++;
            }
        }
        Iterator<w64> it4 = snsObject.LikeUserList.iterator();
        while (it4.hasNext()) {
            w64 next2 = it4.next();
            if (next2.f299703d.equals(this.f274776c)) {
                boolean z = false;
                Iterator<C47096f> it5 = this.f274774a.f292904i.iterator();
                while (it5.hasNext()) {
                    if (it5.next().f126561d == j) {
                        snsObject.LikeUserList.remove(next2);
                        snsObject.LikeCount--;
                        z = true;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        Iterator<C47095d> it6 = this.f274774a.f292900e.iterator();
        while (it6.hasNext()) {
            n64 n64 = it6.next().f126558e;
            if (n64.f298897d == j) {
                w64 i2 = m120188i(n64);
                if (!mo130954m(snsObject.CommentUserList, i2.f299707h, i2.f299708i)) {
                    snsObject.CommentUserList.add(i2);
                    snsObject.CommentCount++;
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("merge", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return snsObject;
    }

    /* renamed from: q */
    public synchronized boolean mo130958q(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("releationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        ((HashMap) this.f274780g).put(Integer.valueOf(i), Integer.valueOf(i2));
        SnsMethodCalculate.markEndTimeMs("releationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    /* renamed from: r */
    public void mo130959r() {
        SnsMethodCalculate.markStartTimeMs("removeAllErrorComments", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        Log.m105924i("MicroMsg.SnsAsyncQueueMgr", "removeAllErrorComments");
        this.f274774a.f292905j.clear();
        if (!mo130956o()) {
            Log.m105920e("MicroMsg.SnsAsyncQueueMgr", "removeAllErrorComments error listToFile");
        }
        SnsMethodCalculate.markEndTimeMs("removeAllErrorComments", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    /* renamed from: s */
    public C99965e mo130960s(int i) {
        C99965e eVar;
        String str;
        SnsMethodCalculate.markStartTimeMs("removeByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        Iterator<C99965e> it = this.f274774a.f292905j.iterator();
        while (true) {
            if (!it.hasNext()) {
                eVar = null;
                break;
            }
            eVar = it.next();
            if (i == eVar.f292907e) {
                break;
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        if (eVar == null) {
            str = "null";
        } else {
            str = "snsID:" + eVar.f292906d + ", opTime:" + eVar.f292907e + ", type:" + eVar.f292908f;
        }
        objArr[1] = str;
        Log.m105925i("MicroMsg.SnsAsyncQueueMgr", "removeByOpTime failOpTime:%s, toDel:%s", objArr);
        if (eVar != null) {
            this.f274774a.f292905j.remove(eVar);
            if (!mo130956o()) {
                Log.m105920e("MicroMsg.SnsAsyncQueueMgr", "removeByOpTime error listToFile");
            }
        }
        SnsMethodCalculate.markEndTimeMs("removeByOpTime", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return eVar;
    }

    /* renamed from: t */
    public void mo130961t(long j, int i, String str) {
        SnsMethodCalculate.markStartTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        int i2 = C94897n1.f274990d;
        SnsMethodCalculate.markStartTimeMs("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        Map<String, SnsObject> map = C94897n1.f274992f;
        if (map != null) {
            ((ConcurrentHashMap) map).clear();
        }
        SnsMethodCalculate.markEndTimeMs("cleanCacheObj", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        synchronized (this) {
            SnsMethodCalculate.markStartTimeMs("removeCommentImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            if (i == 1) {
                m120186g(j, this.f274774a.f292899d, str);
            } else if (i == 2) {
                m120186g(j, this.f274774a.f292900e, str);
            } else if (i == 3) {
                m120186g(j, this.f274774a.f292901f, str);
            } else if (i != 5) {
                if (i != 16) {
                    if (i == 7) {
                        m120186g(j, this.f274774a.f292899d, str);
                    } else if (i != 8) {
                    }
                }
                m120186g(j, this.f274774a.f292900e, str);
            } else {
                m120186g(j, this.f274774a.f292902g, str);
            }
            mo130956o();
            SnsMethodCalculate.markEndTimeMs("removeCommentImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        }
        SnsMethodCalculate.markEndTimeMs("removeComment", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    /* renamed from: u */
    public void mo130962u(long j) {
        SnsMethodCalculate.markStartTimeMs("removeDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        synchronized (this) {
            SnsMethodCalculate.markStartTimeMs("removeDelItemImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
            C47096f fVar = null;
            Iterator<C47096f> it = this.f274774a.f292903h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C47096f next = it.next();
                if (next.f126561d == j) {
                    fVar = next;
                    break;
                }
            }
            if (fVar != null) {
                this.f274774a.f292903h.remove(fVar);
            }
            mo130956o();
            SnsMethodCalculate.markEndTimeMs("removeDelItemImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        }
        SnsMethodCalculate.markEndTimeMs("removeDelItem", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
    }

    /* renamed from: v */
    public final synchronized boolean mo130963v(long j) {
        boolean z;
        SnsMethodCalculate.markStartTimeMs("removeLikedCancelImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        z = false;
        C47096f fVar = null;
        Iterator<C47096f> it = this.f274774a.f292904i.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C47096f next = it.next();
            if (next.f126561d == j) {
                fVar = next;
                break;
            }
        }
        if (fVar != null) {
            this.f274774a.f292904i.remove(fVar);
            z = true;
        }
        mo130956o();
        SnsMethodCalculate.markEndTimeMs("removeLikedCancelImp", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return z;
    }

    /* renamed from: w */
    public synchronized boolean mo130964w(int i) {
        SnsMethodCalculate.markStartTimeMs("removePostId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        ((Vector) this.f274777d).remove(Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("removePostId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }

    /* renamed from: x */
    public synchronized boolean mo130965x(int i) {
        SnsMethodCalculate.markStartTimeMs("removeUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        ((Vector) this.f274779f).remove(Integer.valueOf(i));
        ((HashMap) this.f274780g).remove(Integer.valueOf(i));
        SnsMethodCalculate.markEndTimeMs("removeUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
        return true;
    }
}
