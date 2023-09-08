package uf0;

import android.net.Uri;
import android.util.Pair;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kj2.C117407d;

/* renamed from: uf0.i */
public class C102020i implements C65339f {

    /* renamed from: a */
    public String f300408a;

    /* renamed from: b */
    public long f300409b;

    /* renamed from: c */
    public long f300410c;

    /* renamed from: d */
    public int f300411d;

    /* renamed from: e */
    public List<long[]> f300412e = new ArrayList();

    /* renamed from: f */
    public long[] f300413f;

    /* renamed from: g */
    public List<C102024m> f300414g;

    /* renamed from: h */
    public List<Pair> f300415h;

    /* renamed from: i */
    public Pair[] f300416i;

    /* renamed from: j */
    public C102025n f300417j = null;

    /* renamed from: k */
    public RandomAccessFile f300418k;

    /* renamed from: l */
    public boolean f300419l = false;

    /* renamed from: m */
    public int f300420m = 0;

    /* renamed from: n */
    public ArrayList<Pair<Integer, Integer>> f300421n = new ArrayList<>();

    /* renamed from: o */
    public Comparator<Pair<Integer, Integer>> f300422o = new C102021a(this);

    /* renamed from: p */
    public int f300423p = 0;

    /* renamed from: uf0.i$a */
    public class C102021a implements Comparator<Pair<Integer, Integer>> {
        public C102021a(C102020i iVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((Integer) ((Pair) obj).first).compareTo((Integer) ((Pair) obj2).first);
        }
    }

    /* renamed from: a */
    public boolean mo89446a(String str, long j) {
        mo141520m();
        this.f300408a = str;
        Uri n = C116299g2.m163858n(str);
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
        if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
            return false;
        }
        try {
            RandomAccessFile B = C86013q1.m106420B(this.f300408a, false);
            this.f300418k = B;
            return mo141519l(B, j);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public int mo89447b() {
        return this.f300411d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        r8 = r12;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo89448c(int r18, int r19) {
        /*
            r17 = this;
            r1 = r17
            long[] r0 = r1.f300413f
            r2 = 0
            if (r0 != 0) goto L_0x0008
            return r2
        L_0x0008:
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            int r0 = r18 + r19
            long r5 = (long) r0
            long[] r0 = r1.f300413f
            int r7 = r0.length
            boolean r8 = r1.f300419l
            java.lang.String r9 = ""
            r10 = 1
            java.lang.String r11 = "MicroMsg.Mp4Parser2"
            if (r8 == 0) goto L_0x003b
            int r7 = r1.f300420m
            int r8 = r0.length
            if (r7 >= r8) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            int r0 = r0.length
            r7 = r0
        L_0x0023:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r0[r2] = r8
            java.lang.String r8 = "filePosToVideoTime lazy parse try search from time table, count:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r8, r0)
            r1.mo141514g(r7)     // Catch:{ Exception -> 0x0034 }
            goto L_0x003b
        L_0x0034:
            r0 = move-exception
            r8 = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r8, r9, r0)
        L_0x003b:
            r8 = 0
            r12 = 0
        L_0x003d:
            if (r8 >= r7) goto L_0x006f
            boolean r0 = r1.f300419l
            if (r0 == 0) goto L_0x0058
            long[] r0 = r1.f300413f
            r13 = r0[r8]
            r15 = 0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            r1.mo141514g(r8)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0058
        L_0x0051:
            r0 = move-exception
            r13 = r0
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r13, r9, r0)
        L_0x0058:
            long[] r0 = r1.f300413f
            r13 = r0[r8]
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0061
            goto L_0x0070
        L_0x0061:
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0067
            r12 = r8
            goto L_0x006c
        L_0x0067:
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            int r8 = r8 + 1
            goto L_0x003d
        L_0x006f:
            r8 = r12
        L_0x0070:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            r0[r2] = r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r19)
            r0[r10] = r2
            r2 = 2
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0[r2] = r5
            r2 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r0[r2] = r5
            r2 = 4
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "filePosToVideoTime, offset:%s, length:%s, filePos:%s, playtime:%s, cost:%sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r2, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: uf0.C102020i.mo89448c(int, int):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0032: MOVE  (r11v2 int) = (r21v0 int)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* renamed from: d */
    public boolean mo89449d(int r20, int r21, com.tencent.p014mm.pointers.PInt r22, com.tencent.p014mm.pointers.PInt r23) {
        /*
            r19 = this;
            r1 = r19
            r2 = r22
            r3 = r23
            r4 = 2
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)
            r6 = 0
            r0[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            r7 = 1
            r0[r7] = r5
            java.lang.String r5 = "MicroMsg.Mp4Parser2"
            java.lang.String r8 = "[before] curPlaySecond %d, cacheSecond %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r0)
            long[] r0 = r1.f300413f
            if (r0 != 0) goto L_0x0023
            return r6
        L_0x0023:
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            if (r20 >= 0) goto L_0x002b
            r0 = 0
            goto L_0x002d
        L_0x002b:
            r0 = r20
        L_0x002d:
            long[] r10 = r1.f300413f
            int r10 = r10.length
            if (r0 >= r10) goto L_0x0036
            r11 = r21
            if (r11 < r10) goto L_0x003a
        L_0x0036:
            int r0 = r10 + -2
            int r10 = r10 - r7
            r11 = r10
        L_0x003a:
            r10 = r0
            boolean r0 = r1.f300419l
            if (r0 == 0) goto L_0x0050
            int r0 = java.lang.Math.max(r10, r11)     // Catch:{ Exception -> 0x0047 }
            r1.mo141514g(r0)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0050
        L_0x0047:
            r0 = move-exception
            java.lang.Object[] r12 = new java.lang.Object[r6]
            java.lang.String r13 = "videoTimeToFilePos, checkUpdateLazyParseTimeTable error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r13, r12)
        L_0x0050:
            long[] r0 = r1.f300413f
            r12 = r0[r10]
            r14 = r0[r11]
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Long r16 = java.lang.Long.valueOf(r12)
            r0[r6] = r16
            java.lang.Long r16 = java.lang.Long.valueOf(r14)
            r0[r7] = r16
            java.lang.String r4 = "curPos %d, cachePos %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r4, r0)
            r17 = 0
            int r0 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x0073
            int r0 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x0079
        L_0x0073:
            java.lang.String r0 = "videoTimeToFilePos error, not parse this entry now"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r0)
        L_0x0079:
            if (r10 != 0) goto L_0x0081
            r2.value = r6
            int r0 = (int) r14
            r3.value = r0
            goto L_0x0088
        L_0x0081:
            int r0 = (int) r12
            r2.value = r0
            int r4 = (int) r14
            int r4 = r4 - r0
            r3.value = r4
        L_0x0088:
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r0[r6] = r4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r0[r7] = r4
            int r2 = r2.value
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 2
            r0[r4] = r2
            r2 = 3
            int r3 = r3.value
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r2] = r3
            r2 = 4
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r8)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0[r2] = r3
            java.lang.String r2 = "[after] curPlaySecond %d, cacheSecond %d, offset.value %d, length.value %d, cost %sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uf0.C102020i.mo89449d(int, int, com.tencent.mm.pointers.PInt, com.tencent.mm.pointers.PInt):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x013b  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo89450e(int r18, com.tencent.p014mm.pointers.PInt r19, com.tencent.p014mm.pointers.PInt r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            java.lang.String r5 = "MicroMsg.Mp4Parser2"
            r6 = 0
            r7 = 1
            boolean r0 = r1.f300419l     // Catch:{ Exception -> 0x00f6 }
            r8 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L_0x008b
            java.util.List<android.util.Pair> r0 = r1.f300415h     // Catch:{ Exception -> 0x00f6 }
            if (r0 == 0) goto L_0x008a
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x00f6 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x00f6 }
            if (r0 <= 0) goto L_0x008a
            java.util.List<android.util.Pair> r0 = r1.f300415h     // Catch:{ Exception -> 0x00f6 }
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ Exception -> 0x00f6 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x00f6 }
            long r10 = (long) r2     // Catch:{ Exception -> 0x00f6 }
            long r10 = r10 * r8
            long r10 = r10 * r8
            r4.value = r6     // Catch:{ Exception -> 0x00f6 }
            r3.value = r6     // Catch:{ Exception -> 0x00f6 }
            r12 = 0
        L_0x0030:
            if (r12 >= r0) goto L_0x0067
            java.util.List<android.util.Pair> r13 = r1.f300415h     // Catch:{ Exception -> 0x00f6 }
            java.util.ArrayList r13 = (java.util.ArrayList) r13     // Catch:{ Exception -> 0x00f6 }
            java.lang.Object r13 = r13.get(r12)     // Catch:{ Exception -> 0x00f6 }
            android.util.Pair r13 = (android.util.Pair) r13     // Catch:{ Exception -> 0x00f6 }
            java.lang.Object r14 = r13.second     // Catch:{ Exception -> 0x00f6 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ Exception -> 0x00f6 }
            long r14 = r14.longValue()     // Catch:{ Exception -> 0x00f6 }
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 <= 0) goto L_0x0057
            java.lang.Object r10 = r13.second     // Catch:{ Exception -> 0x00f6 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Exception -> 0x00f6 }
            long r10 = r10.longValue()     // Catch:{ Exception -> 0x00f6 }
            long r10 = r10 / r8
            long r10 = r10 / r8
            int r11 = (int) r10     // Catch:{ Exception -> 0x00f6 }
            r4.value = r11     // Catch:{ Exception -> 0x00f6 }
            r10 = 1
            goto L_0x0068
        L_0x0057:
            java.lang.Object r13 = r13.second     // Catch:{ Exception -> 0x00f6 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ Exception -> 0x00f6 }
            long r13 = r13.longValue()     // Catch:{ Exception -> 0x00f6 }
            long r13 = r13 / r8
            long r13 = r13 / r8
            int r14 = (int) r13     // Catch:{ Exception -> 0x00f6 }
            r3.value = r14     // Catch:{ Exception -> 0x00f6 }
            int r12 = r12 + 1
            goto L_0x0030
        L_0x0067:
            r10 = 0
        L_0x0068:
            if (r10 != 0) goto L_0x0106
            java.util.List<android.util.Pair> r11 = r1.f300415h     // Catch:{ Exception -> 0x0088 }
            int r0 = r0 - r7
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r0 = r11.get(r0)     // Catch:{ Exception -> 0x0088 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ Exception -> 0x0088 }
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x0088 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0088 }
            long r11 = r0.longValue()     // Catch:{ Exception -> 0x0088 }
            long r11 = r11 / r8
            long r11 = r11 / r8
            int r0 = (int) r11     // Catch:{ Exception -> 0x0088 }
            r3.value = r0     // Catch:{ Exception -> 0x0088 }
            r4.value = r2     // Catch:{ Exception -> 0x0088 }
        L_0x0084:
            r0 = 1
            r10 = 1
            goto L_0x0107
        L_0x0088:
            r0 = move-exception
            goto L_0x00f8
        L_0x008a:
            return r6
        L_0x008b:
            android.util.Pair[] r0 = r1.f300416i     // Catch:{ Exception -> 0x00f6 }
            if (r0 == 0) goto L_0x00f5
            int r0 = r0.length     // Catch:{ Exception -> 0x00f6 }
            if (r0 <= 0) goto L_0x00f5
            r17.mo141514g(r18)     // Catch:{ Exception -> 0x00f6 }
            long[] r0 = r1.f300413f     // Catch:{ Exception -> 0x00f6 }
            int r0 = r0.length     // Catch:{ Exception -> 0x00f6 }
            r1.mo141514g(r0)     // Catch:{ Exception -> 0x00f6 }
            android.util.Pair[] r0 = r1.f300416i     // Catch:{ Exception -> 0x00f6 }
            int r0 = r0.length     // Catch:{ Exception -> 0x00f6 }
            long r10 = (long) r2     // Catch:{ Exception -> 0x00f6 }
            long r10 = r10 * r8
            long r10 = r10 * r8
            r4.value = r6     // Catch:{ Exception -> 0x00f6 }
            r3.value = r6     // Catch:{ Exception -> 0x00f6 }
            r12 = 0
        L_0x00a8:
            if (r12 >= r0) goto L_0x00db
            android.util.Pair[] r13 = r1.f300416i     // Catch:{ Exception -> 0x00f6 }
            r13 = r13[r12]     // Catch:{ Exception -> 0x00f6 }
            if (r13 == 0) goto L_0x00d8
            java.lang.Object r14 = r13.second     // Catch:{ Exception -> 0x00f6 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ Exception -> 0x00f6 }
            long r14 = r14.longValue()     // Catch:{ Exception -> 0x00f6 }
            int r16 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r16 <= 0) goto L_0x00cb
            java.lang.Object r10 = r13.second     // Catch:{ Exception -> 0x00f6 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ Exception -> 0x00f6 }
            long r10 = r10.longValue()     // Catch:{ Exception -> 0x00f6 }
            long r10 = r10 / r8
            long r10 = r10 / r8
            int r11 = (int) r10     // Catch:{ Exception -> 0x00f6 }
            r4.value = r11     // Catch:{ Exception -> 0x00f6 }
            r10 = 1
            goto L_0x00dc
        L_0x00cb:
            java.lang.Object r13 = r13.second     // Catch:{ Exception -> 0x00f6 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ Exception -> 0x00f6 }
            long r13 = r13.longValue()     // Catch:{ Exception -> 0x00f6 }
            long r13 = r13 / r8
            long r13 = r13 / r8
            int r14 = (int) r13     // Catch:{ Exception -> 0x00f6 }
            r3.value = r14     // Catch:{ Exception -> 0x00f6 }
        L_0x00d8:
            int r12 = r12 + 1
            goto L_0x00a8
        L_0x00db:
            r10 = 0
        L_0x00dc:
            if (r10 != 0) goto L_0x0106
            android.util.Pair[] r11 = r1.f300416i     // Catch:{ Exception -> 0x0088 }
            int r0 = r0 - r7
            r0 = r11[r0]     // Catch:{ Exception -> 0x0088 }
            if (r0 == 0) goto L_0x0106
            java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x0088 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0088 }
            long r11 = r0.longValue()     // Catch:{ Exception -> 0x0088 }
            long r11 = r11 / r8
            long r11 = r11 / r8
            int r0 = (int) r11     // Catch:{ Exception -> 0x0088 }
            r3.value = r0     // Catch:{ Exception -> 0x0088 }
            r4.value = r2     // Catch:{ Exception -> 0x0088 }
            goto L_0x0084
        L_0x00f5:
            return r6
        L_0x00f6:
            r0 = move-exception
            r10 = 0
        L_0x00f8:
            java.lang.Object[] r8 = new java.lang.Object[r7]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r18)
            r8[r6] = r9
            java.lang.String r9 = "seekVFrame seekTime[%d]"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r9, r8)
        L_0x0106:
            r0 = 0
        L_0x0107:
            boolean r8 = r1.f300419l
            r9 = 4
            r11 = 3
            r12 = 2
            if (r8 != 0) goto L_0x013b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r0[r6] = r2
            int r2 = r3.value
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r7] = r2
            int r2 = r4.value
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r12] = r2
            java.util.List<android.util.Pair> r2 = r1.f300415h
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r11] = r2
            java.lang.String r2 = "seek key Frame seekTime[%d] pre[%d] next[%d], stssList.size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            goto L_0x017f
        L_0x013b:
            r8 = 7
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r18)
            r8[r6] = r2
            int r2 = r3.value
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8[r7] = r2
            int r2 = r4.value
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8[r12] = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r10)
            r8[r11] = r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8[r9] = r0
            r0 = 5
            java.util.List<android.util.Pair> r2 = r1.f300415h
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8[r0] = r2
            r0 = 6
            android.util.Pair[] r2 = r1.f300416i
            int r2 = r2.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8[r0] = r2
            java.lang.String r0 = "lazy parse seek key Frame seekTime[%d] pre[%d] next[%d], find:%s, fromLastFrame:%s, stssList.size:%s, stssArray.length:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r8)
        L_0x017f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: uf0.C102020i.mo89450e(int, com.tencent.mm.pointers.PInt, com.tencent.mm.pointers.PInt):boolean");
    }

    /* renamed from: f */
    public int mo89451f() {
        try {
            if (!this.f300419l) {
                List<Pair> list = this.f300415h;
                if (list == null) {
                    return 0;
                }
                if (this.f300423p == 0) {
                    this.f300423p = (int) ((((Long) ((Pair) ((ArrayList) list).get(((ArrayList) list).size() - 1)).second).longValue() / 1000) / 1000);
                }
                return this.f300423p;
            }
            Pair[] pairArr = this.f300416i;
            if (pairArr == null || pairArr.length <= 0) {
                return 0;
            }
            if (pairArr[pairArr.length - 1] == null) {
                mo141514g(this.f300413f.length - 1);
            }
            Pair[] pairArr2 = this.f300416i;
            Pair pair = pairArr2[pairArr2.length - 1];
            if (pair != null && this.f300423p == 0) {
                this.f300423p = (int) ((((Long) pair.second).longValue() / 1000) / 1000);
            }
            return this.f300423p;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Mp4Parser2", e, "get last key frame error.", new Object[0]);
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0178, code lost:
        if (((java.lang.Integer) r4.first).intValue() > ((java.lang.Integer) r4.second).intValue()) goto L_0x017a;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo141514g(int r21) {
        /*
            r20 = this;
            r0 = r20
            uf0.n r1 = r0.f300417j
            if (r1 == 0) goto L_0x0259
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r5 = r0.f300420m
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 0
            r4[r6] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r21)
            r7 = 1
            r4[r7] = r5
            java.lang.String r5 = "MicroMsg.Mp4Parser2"
            java.lang.String r8 = "checkUpdateLazyParseTimeTable currentLazyParseSeconds:%s, second:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r8, r4)
            java.util.ArrayList<android.util.Pair<java.lang.Integer, java.lang.Integer>> r4 = r0.f300421n
            int r4 = r4.size()
            r8 = 5
            if (r4 <= 0) goto L_0x017c
            android.util.Pair r4 = new android.util.Pair
            int r9 = r21 + -1
            int r9 = java.lang.Math.max(r9, r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r10 = r21 + 5
            long[] r11 = r0.f300413f
            int r11 = r11.length
            int r11 = r11 - r7
            int r10 = java.lang.Math.min(r10, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r4.<init>(r9, r10)
            java.util.ArrayList<android.util.Pair<java.lang.Integer, java.lang.Integer>> r9 = r0.f300421n
            java.util.Iterator r9 = r9.iterator()
        L_0x0050:
            boolean r10 = r9.hasNext()
            r11 = 0
            if (r10 == 0) goto L_0x0168
            java.lang.Object r10 = r9.next()
            android.util.Pair r10 = (android.util.Pair) r10
            java.lang.Object r12 = r10.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r13 = r4.first
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0077
            java.lang.Object r12 = r10.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            java.lang.Object r13 = r4.second
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L_0x0077
            goto L_0x017a
        L_0x0077:
            java.lang.Object r11 = r10.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r4.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 <= r12) goto L_0x009b
            java.lang.Object r11 = r10.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r4.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 < r12) goto L_0x0050
        L_0x009b:
            java.lang.Object r11 = r10.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r4.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 >= r12) goto L_0x00c0
            java.lang.Object r11 = r10.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r4.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 <= r12) goto L_0x00c0
            goto L_0x0050
        L_0x00c0:
            java.lang.Object r11 = r10.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r4.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 > r12) goto L_0x0117
            java.lang.Object r11 = r4.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r10.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 > r12) goto L_0x0117
            java.lang.Object r11 = r10.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r4.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 > r12) goto L_0x0117
            android.util.Pair r11 = new android.util.Pair
            java.lang.Object r10 = r10.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            int r10 = r10 + r7
            long[] r12 = r0.f300413f
            int r12 = r12.length
            int r12 = r12 - r7
            int r10 = java.lang.Math.min(r10, r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            r11.<init>(r10, r4)
        L_0x0114:
            r4 = r11
            goto L_0x0050
        L_0x0117:
            java.lang.Object r11 = r10.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r4.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 < r12) goto L_0x0050
            java.lang.Object r11 = r4.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r10.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 < r12) goto L_0x0050
            java.lang.Object r11 = r10.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r4.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r11 < r12) goto L_0x0050
            android.util.Pair r11 = new android.util.Pair
            java.lang.Object r4 = r4.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r10 = r10.first
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            int r10 = r10 - r7
            int r10 = java.lang.Math.max(r10, r7)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.<init>(r4, r10)
            goto L_0x0114
        L_0x0168:
            java.lang.Object r9 = r4.first
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Object r10 = r4.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            if (r9 <= r10) goto L_0x0189
        L_0x017a:
            r4 = r11
            goto L_0x0189
        L_0x017c:
            android.util.Pair r4 = new android.util.Pair
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r21)
            r4.<init>(r9, r10)
        L_0x0189:
            java.lang.Object[] r9 = new java.lang.Object[r7]
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r9[r6] = r10
            java.lang.String r10 = "calcLazyParseRange cost:%sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r9)
            if (r4 == 0) goto L_0x0259
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Object r10 = r4.first
            r9[r6] = r10
            java.lang.Object r10 = r4.second
            r9[r7] = r10
            java.lang.String r10 = "checkUpdateLazyParseTimeTable, newParseRange:[%s, %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r10, r9)
            uf0.n r9 = r0.f300417j
            java.io.RandomAccessFile r10 = r0.f300418k
            java.lang.Object r11 = r4.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            java.lang.Object r12 = r4.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            boolean r9 = r9.mo141536l(r10, r11, r12)
            uf0.n r10 = r0.f300417j
            long[] r11 = r10.f300442D
            r0.f300413f = r11
            java.util.List<uf0.m> r11 = r10.f300439A
            r0.f300414g = r11
            java.util.List<android.util.Pair> r11 = r10.f300440B
            r0.f300415h = r11
            android.util.Pair<java.lang.Integer, java.lang.Long>[] r10 = r10.f300441C
            r0.f300416i = r10
            java.util.ArrayList<android.util.Pair<java.lang.Integer, java.lang.Integer>> r10 = r0.f300421n
            r10.add(r4)
            long r10 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.util.ArrayList<android.util.Pair<java.lang.Integer, java.lang.Integer>> r12 = r0.f300421n
            java.util.Comparator<android.util.Pair<java.lang.Integer, java.lang.Integer>> r13 = r0.f300422o
            java.util.Collections.sort(r12, r13)
            java.util.ArrayList<android.util.Pair<java.lang.Integer, java.lang.Integer>> r12 = r0.f300421n
            int r13 = r12.size()
            int r13 = r13 - r7
            java.lang.Object r12 = r12.get(r13)
            android.util.Pair r12 = (android.util.Pair) r12
            java.lang.Object r12 = r12.second
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r0.f300420m = r12
            long r1 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r1)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            r8[r6] = r9
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            r8[r7] = r6
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r10)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r8[r3] = r6
            r3 = 3
            java.lang.Object r6 = r4.first
            r8[r3] = r6
            r3 = 4
            java.lang.Object r4 = r4.second
            r8[r3] = r4
            java.lang.String r3 = "checkUpdateLazyParseTimeTable incrementCreateTimeTable finish, ret:%s, cost:%sms, sort cost:%s, range:[%s, %s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r3, r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "markIncrementParseCost:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "MicroMsg.Mp4ParserStat"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0259
            kj2.d r6 = kj2.C117407d.INSTANCE
            r7 = 1290(0x50a, double:6.373E-321)
            r16 = 72
            r14 = 1290(0x50a, double:6.373E-321)
            r13 = r6
            r18 = r1
            r13.mo182089r(r14, r16, r18)
            r9 = 73
            r11 = 1
            r6.mo182089r(r7, r9, r11)
        L_0x0259:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uf0.C102020i.mo141514g(int):void");
    }

    /* renamed from: h */
    public final long[] mo141515h(RandomAccessFile randomAccessFile, long j, byte[] bArr, boolean z) {
        long currentTicks = Util.currentTicks();
        Log.m105925i("MicroMsg.Mp4Parser2", "createTimeTable, minfFilePos:%s, isVideo:%s", Long.valueOf(j), Boolean.valueOf(z));
        randomAccessFile.seek(j);
        C102025n nVar = (C102025n) C102016c.m134340b(randomAccessFile, bArr, C102014a.f300381k);
        Log.m105925i("MicroMsg.Mp4Parser2", "createTimeTable, stblAtom:%s, duration:%s, timeScale:%s", nVar, Long.valueOf(this.f300410c), Long.valueOf(this.f300409b));
        if (nVar == null) {
            return new long[0];
        }
        nVar.f300458x = this.f300410c;
        nVar.f300457w = this.f300409b;
        nVar.mo141538n(randomAccessFile);
        long[] jArr = nVar.f300442D;
        if (z) {
            this.f300414g = nVar.f300439A;
            this.f300415h = nVar.f300440B;
        }
        List<C102024m> list = this.f300414g;
        if (!(list == null || this.f300415h == null)) {
            Log.m105919d("MicroMsg.Mp4Parser2", "parser stbl atom finish, sampleList:%s, stssList:%s", Integer.valueOf(list.size()), Integer.valueOf(this.f300415h.size()));
        }
        if (jArr != null) {
            Log.m105925i("MicroMsg.Mp4Parser2", "createTimeTable cost:%s, length:%s", Long.valueOf(Util.ticksToNow(currentTicks)), Integer.valueOf(jArr.length));
        }
        return jArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0176 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long[] mo141516i(java.io.RandomAccessFile r34, uf0.C102025n r35, boolean r36) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r2
            long r8 = r0.f300410c
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r9 = 1
            r6[r9] = r8
            long r10 = r0.f300409b
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r10 = 2
            r6[r10] = r8
            java.lang.String r8 = "MicroMsg.Mp4Parser2"
            java.lang.String r11 = "createTimeTable, stblAtom:%s, duration:%s, timeScale:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r11, r6)
            if (r2 == 0) goto L_0x0373
            long r11 = r0.f300410c
            r2.f300458x = r11
            long r11 = r0.f300409b
            r2.f300457w = r11
            long r11 = r35.mo141508a()
            r13 = 8
            long r11 = r11 - r13
            r13 = 8
            byte[] r14 = new byte[r13]
            long r15 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
        L_0x004c:
            r22 = 0
            java.lang.String r6 = "MicroMsg.StblAtom"
            r5 = 4
            int r24 = (r11 > r22 ? 1 : (r11 == r22 ? 0 : -1))
            if (r24 <= 0) goto L_0x017f
            int r13 = r1.read(r14)
            int r9 = uf0.C102016c.m134343e(r14, r7)
            int r7 = uf0.C102016c.m134343e(r14, r5)
            java.lang.Object[] r5 = new java.lang.Object[r10]
            java.lang.Integer r26 = java.lang.Integer.valueOf(r7)
            r25 = 0
            r5[r25] = r26
            java.lang.Integer r26 = java.lang.Integer.valueOf(r9)
            r10 = 1
            r5[r10] = r26
            java.lang.String r10 = "readAtom, type:%s, size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r5)
            long r27 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            int r5 = uf0.C102014a.f300386p
            if (r7 != r5) goto L_0x00a3
            r34.getFilePointer()
            long r29 = r2.mo141535k(r1, r9)
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            long r27 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r27)
            java.lang.Long r10 = java.lang.Long.valueOf(r27)
            r25 = 0
            r7[r25] = r10
            java.lang.String r10 = "handleSttsAtom cost:%sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r7)
            r31 = r29
            r17 = 1
        L_0x009f:
            r29 = r3
            goto L_0x014d
        L_0x00a3:
            r5 = 1
            r25 = 0
            int r10 = uf0.C102014a.f300388r
            if (r7 != r10) goto L_0x00c7
            r34.getFilePointer()
            long r29 = r2.mo141533i(r1, r9)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            long r27 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r27)
            java.lang.Long r10 = java.lang.Long.valueOf(r27)
            r7[r25] = r10
            java.lang.String r10 = "handleStscAtom cost:%sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r7)
            r31 = r29
            r19 = 1
            goto L_0x009f
        L_0x00c7:
            int r10 = uf0.C102014a.f300390t
            if (r7 != r10) goto L_0x00e4
            r34.getFilePointer()
            long r29 = r2.mo141532h(r1, r9)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            long r27 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r27)
            java.lang.Long r10 = java.lang.Long.valueOf(r27)
            r7[r25] = r10
            java.lang.String r10 = "handleStcoAtom cost:%sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r7)
            goto L_0x0100
        L_0x00e4:
            int r10 = uf0.C102014a.f300391u
            if (r7 != r10) goto L_0x0105
            r34.getFilePointer()
            long r29 = r2.mo141531g(r1, r9)
            java.lang.Object[] r7 = new java.lang.Object[r5]
            long r27 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r27)
            java.lang.Long r5 = java.lang.Long.valueOf(r27)
            r7[r25] = r5
            java.lang.String r5 = "handleCo64Atom cost:%sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r7)
        L_0x0100:
            r31 = r29
            r18 = 1
            goto L_0x009f
        L_0x0105:
            int r5 = uf0.C102014a.f300389s
            if (r7 != r5) goto L_0x0128
            r29 = r3
            long r3 = r34.getFilePointer()
            r2.f300459y = r3
            r2.f300460z = r9
            r5 = 1
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r7[r4] = r3
            java.lang.String r3 = "stsz atom pos:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r7)
            r31 = r22
            r20 = 1
            goto L_0x014d
        L_0x0128:
            r29 = r3
            r4 = 0
            r5 = 1
            int r3 = uf0.C102014a.f300387q
            if (r7 != r3) goto L_0x014b
            r34.getFilePointer()
            long r31 = r2.mo141534j(r1, r9)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            long r27 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r27)
            java.lang.Long r5 = java.lang.Long.valueOf(r27)
            r3[r4] = r5
            java.lang.String r4 = "handleStssAtom cost:%sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r3)
            r21 = 1
            goto L_0x014d
        L_0x014b:
            r31 = r22
        L_0x014d:
            long r3 = (long) r9
            long r9 = r3 - r31
            r5 = r14
            long r13 = (long) r13
            long r9 = r9 - r13
            boolean r7 = uf0.C102016c.m134346h(r1, r9)
            if (r7 == 0) goto L_0x0176
            if (r17 == 0) goto L_0x016a
            if (r18 == 0) goto L_0x016a
            if (r19 == 0) goto L_0x016a
            if (r20 == 0) goto L_0x016a
            if (r21 == 0) goto L_0x016a
            java.lang.String r3 = "read stbl atom finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            goto L_0x0181
        L_0x016a:
            long r11 = r11 - r3
            r14 = r5
            r3 = r29
            r5 = 3
            r7 = 0
            r9 = 1
            r10 = 2
            r13 = 8
            goto L_0x004c
        L_0x0176:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "skip file error."
            r1.<init>(r2)
            throw r1
        L_0x017f:
            r29 = r3
        L_0x0181:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r15)
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r7 = 0
            r4[r7] = r5
            java.lang.String r5 = "parse all atoms cost %sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r4)
            r2.f300451M = r3
            long r3 = r2.f300459y
            int r5 = (r3 > r22 ? 1 : (r3 == r22 ? 0 : -1))
            if (r5 <= 0) goto L_0x031e
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            long r9 = r2.f300459y
            r1.seek(r9)
            int r5 = r2.f300460z
            r7 = 4
            long r9 = (long) r7
            boolean r9 = uf0.C102016c.m134346h(r1, r9)
            if (r9 != 0) goto L_0x01b3
        L_0x01b0:
            r10 = r8
            goto L_0x026b
        L_0x01b3:
            byte[] r9 = new byte[r7]
            r10 = 0
            int r11 = r1.read(r9, r10, r7)
            if (r11 >= r7) goto L_0x01c3
            java.lang.String r5 = "stsz read sample size error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r5)
            goto L_0x01b0
        L_0x01c3:
            int r7 = uf0.C102016c.m134343e(r9, r10)
            if (r7 <= 0) goto L_0x01ea
            r11 = 1
            int[] r5 = new int[r11]
            r2.f300444F = r5
            r5[r10] = r7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "all sample size is the same. size : "
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r5 = 8
            long r11 = (long) r5
            r10 = r8
            goto L_0x026d
        L_0x01ea:
            r7 = 4
            int r11 = r1.read(r9, r10, r7)
            if (r11 >= r7) goto L_0x01f8
            java.lang.String r5 = "stsz read entry count error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r5)
            goto L_0x01b0
        L_0x01f8:
            int r11 = uf0.C102016c.m134343e(r9, r10)
            long r12 = (long) r11
            r17 = 4
            long r12 = r12 * r17
            int r10 = (r12 > r22 ? 1 : (r12 == r22 ? 0 : -1))
            if (r10 <= 0) goto L_0x0255
            int r5 = r5 + -20
            r10 = r8
            long r7 = (long) r5
            int r5 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x020e
            goto L_0x0256
        L_0x020e:
            r2.f300450L = r12
            r5 = 1
            int r11 = r11 + r5
            int[] r5 = new int[r11]
            r2.f300444F = r5
            r5 = 4
            int r11 = r11 * 4
            byte[] r5 = new byte[r11]
            r2.f300454P = r5
            long r7 = r34.getFilePointer()
            r2.f300449K = r7
            byte[] r5 = r2.f300454P
            int r5 = r1.read(r5)
            long r7 = (long) r5
            r5 = 3
            java.lang.Object[] r11 = new java.lang.Object[r5]
            long r12 = r2.f300449K
            java.lang.Long r5 = java.lang.Long.valueOf(r12)
            r12 = 0
            r11[r12] = r5
            java.lang.Long r5 = java.lang.Long.valueOf(r7)
            r13 = 1
            r11[r13] = r5
            byte[] r5 = r2.f300454P
            int r5 = r5.length
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r13 = 2
            r11[r13] = r5
            java.lang.String r5 = "handleStszAtomLazy start parse stsz filePos:%s, sampleSizeReaded:%s, sampleSizeTableData.length:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r5, r11)
            r5 = 5
            r2.mo141537m(r1, r9, r12, r5)
            r5 = 12
            long r11 = (long) r5
            long r11 = r11 + r7
            goto L_0x026d
        L_0x0255:
            r10 = r8
        L_0x0256:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "stco error entryCount : "
            r5.append(r7)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r5)
        L_0x026b:
            r11 = -1
        L_0x026d:
            r5 = 3
            java.lang.Object[] r7 = new java.lang.Object[r5]
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r7[r4] = r3
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r4 = 1
            r7[r4] = r3
            int[] r3 = r2.f300444F
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            r7[r4] = r3
            java.lang.String r3 = "handleStszAtom cost:%sms, ret:%s, sampleSizeTable.length:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r7)
            int[] r3 = r2.f300445G
            if (r3 != 0) goto L_0x02a2
            java.util.List<uf0.m> r3 = r2.f300439A
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            android.util.Pair[] r3 = new android.util.Pair[r3]
            r2.f300441C = r3
            goto L_0x02a7
        L_0x02a2:
            int r3 = r3.length
            android.util.Pair[] r3 = new android.util.Pair[r3]
            r2.f300441C = r3
        L_0x02a7:
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            android.util.Pair<java.lang.Integer, java.lang.Long>[] r3 = r2.f300441C
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r4[r5] = r3
            java.lang.String r3 = "parse lazy, stssArray.size:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r4)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            r7 = 5
            r2.mo141536l(r1, r5, r7)
            long r8 = (long) r7
            r2.f300448J = r8
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1[r5] = r3
            long[] r3 = r2.f300442D
            int r3 = r3.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r1[r4] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r4 = 2
            r1[r4] = r3
            java.lang.String r3 = "createTimeTable cost:%sms, size:%s, lazyDurationSecond:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r1)
            long[] r1 = r2.f300442D
            int r1 = r1.length
            if (r7 < r1) goto L_0x0309
            r1 = 0
            r2.f300451M = r1
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            long[] r1 = r2.f300442D
            int r1 = r1.length
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 1
            r3[r4] = r1
            java.lang.String r1 = "lazyDurationSecond:%s, timeTable.length:%s, not need lazy"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r3)
            goto L_0x030a
        L_0x0309:
            r4 = 1
        L_0x030a:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r15)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = "lazy parse finish cost:%sms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r1)
            goto L_0x031f
        L_0x031e:
            r10 = r8
        L_0x031f:
            long[] r1 = r2.f300442D
            if (r36 == 0) goto L_0x032f
            java.util.List<uf0.m> r3 = r2.f300439A
            r0.f300414g = r3
            java.util.List<android.util.Pair> r3 = r2.f300440B
            r0.f300415h = r3
            android.util.Pair<java.lang.Integer, java.lang.Long>[] r2 = r2.f300441C
            r0.f300416i = r2
        L_0x032f:
            java.util.List<uf0.m> r2 = r0.f300414g
            if (r2 == 0) goto L_0x0355
            android.util.Pair[] r3 = r0.f300416i
            if (r3 == 0) goto L_0x0355
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r4[r3] = r2
            android.util.Pair[] r2 = r0.f300416i
            int r2 = r2.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r4[r3] = r2
            java.lang.String r2 = "parser stbl atom lazy finish, sampleList.size:%s, stssArray.length:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r10, r2, r4)
        L_0x0355:
            if (r1 == 0) goto L_0x0372
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r29)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            int r3 = r1.length
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "createTimeTableLazy cost:%s, length:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r3, r2)
        L_0x0372:
            return r1
        L_0x0373:
            r4 = 0
            long[] r1 = new long[r4]
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uf0.C102020i.mo141516i(java.io.RandomAccessFile, uf0.n, boolean):long[]");
    }

    /* renamed from: j */
    public final C102025n mo141517j(RandomAccessFile randomAccessFile, long j, byte[] bArr) {
        long currentTicks = Util.currentTicks();
        Log.m105925i("MicroMsg.Mp4Parser2", "findStblAtomInfo, minfFilePos:%s", Long.valueOf(j));
        randomAccessFile.seek(j);
        C102025n nVar = (C102025n) C102016c.m134340b(randomAccessFile, bArr, C102014a.f300381k);
        Log.m105925i("MicroMsg.Mp4Parser2", "findStblAtomInfo, stblAtom:%s, duration:%s, timeScale:%s, cost:%s", nVar, Long.valueOf(this.f300410c), Long.valueOf(this.f300409b), Long.valueOf(Util.ticksToNow(currentTicks)));
        return nVar;
    }

    /* renamed from: k */
    public final void mo141518k() {
        Log.m105925i("MicroMsg.Mp4Parser2", "timeTableLength, length:%s", Integer.valueOf(this.f300411d));
        this.f300413f = new long[(this.f300411d + 2)];
        Iterator it = ((ArrayList) this.f300412e).iterator();
        while (it.hasNext()) {
            long[] jArr = (long[]) it.next();
            for (int i = 0; i < jArr.length; i++) {
                long[] jArr2 = this.f300413f;
                jArr2[i] = Math.max(jArr2[i], jArr[i]);
            }
        }
    }

    /* renamed from: l */
    public boolean mo141519l(RandomAccessFile randomAccessFile, long j) {
        long j2;
        long j3;
        char c;
        int i;
        byte[] bArr;
        int i2;
        int i3;
        int i4;
        RandomAccessFile randomAccessFile2 = randomAccessFile;
        mo141520m();
        boolean z = this.f300419l;
        Log.m105924i("MicroMsg.Mp4ParserStat", "markParse, useLazy:" + z);
        if (z) {
            C117407d.INSTANCE.mo182089r(1290, 0, 1);
        } else {
            C117407d.INSTANCE.mo182089r(1290, 1, 1);
        }
        int i5 = 0;
        try {
            byte[] bArr2 = new byte[8];
            Log.m105924i("MicroMsg.Mp4Parser2", "parserExtractor");
            long currentTicks = Util.currentTicks();
            C102014a b = C102016c.m134340b(randomAccessFile2, bArr2, C102014a.f300376f);
            char c2 = 1;
            int i6 = 2;
            Log.m105919d("MicroMsg.Mp4Parser2", "find moov atom finish, cost:%s, beginPos:%s, size:%s", Long.valueOf(Util.ticksToNow(currentTicks)), Long.valueOf(b.f300396d), Long.valueOf(b.mo141508a()));
            long a = b.mo141508a() - 8;
            long j4 = b.f300396d + 8;
            boolean z2 = false;
            while (true) {
                if (a <= 0) {
                    break;
                }
                randomAccessFile2.seek(j4);
                randomAccessFile2.read(bArr2);
                int e = C102016c.m134343e(bArr2, i5);
                int e2 = C102016c.m134343e(bArr2, 4);
                Object[] objArr = new Object[i6];
                objArr[i5] = Integer.valueOf(e);
                objArr[c2] = Integer.valueOf(e2);
                Log.m105925i("MicroMsg.Mp4Parser2", "read atomSize:%s, atomType:%s", objArr);
                if (e2 == C102014a.f300378h) {
                    C102018g gVar = (C102018g) C102016c.m134340b(randomAccessFile2, bArr2, C102014a.f300379i);
                    Object[] objArr2 = new Object[i6];
                    objArr2[i5] = gVar;
                    objArr2[1] = (C102026o) C102019h.m134349a(e, e2, j4, 0);
                    Log.m105925i("MicroMsg.Mp4Parser2", "found track atom, mdiaAtom:%s, trakAtom:%s", objArr2);
                    if (gVar != null && gVar.mo141513b(randomAccessFile2, bArr2)) {
                        byte[] bArr3 = bArr2;
                        long j5 = gVar.f300406y;
                        j3 = j4;
                        if (j5 != ((long) C102018g.f300402A)) {
                            String str = "createTimeTable finish";
                            i = e2;
                            int i7 = e;
                            bArr = bArr3;
                            c = 4;
                            if (j5 == ((long) C102018g.f300403B)) {
                                if (this.f300419l && z2) {
                                    Log.m105924i("MicroMsg.Mp4Parser2", "lazy parse, ignore sound trak atom");
                                    break;
                                }
                                int i8 = this.f300411d;
                                if (i8 > 30) {
                                    Log.m105925i("MicroMsg.Mp4Parser2", "current timeTableLength is:%s too long, ignore parse sound track", Integer.valueOf(i8));
                                    break;
                                }
                                this.f300409b = gVar.f300404w;
                                this.f300410c = gVar.f300405x;
                                Log.m105924i("MicroMsg.Mp4Parser2", "this trak atom is sound trak. timeScale: " + this.f300409b + " duration: " + this.f300410c);
                                long j6 = gVar.f300407z;
                                i2 = i7;
                                long[] h = mo141515h(randomAccessFile, j6, bArr, false);
                                Log.m105924i("MicroMsg.Mp4Parser2", str);
                                ((ArrayList) this.f300412e).add(h);
                                this.f300411d = Math.max(this.f300411d, h.length - 2);
                                long j7 = (long) i2;
                                a -= j7;
                                j4 = j3 + j7;
                                Object[] objArr3 = new Object[5];
                                objArr3[0] = Integer.valueOf(i2);
                                objArr3[1] = Integer.valueOf(i);
                                objArr3[2] = Long.valueOf(a);
                                objArr3[3] = Long.valueOf(j4);
                                objArr3[c] = Integer.valueOf(this.f300411d);
                                Log.m105919d("MicroMsg.Mp4Parser2", "atomSize:%s, atomType:%s, remains:%s, beginPos:%s, timeTableLength:%s", objArr3);
                                bArr2 = bArr;
                                i5 = 0;
                                c2 = 1;
                                i6 = 2;
                            } else {
                                Log.m105924i("MicroMsg.Mp4Parser2", "unknown mdiaAtom");
                                break;
                            }
                        } else {
                            this.f300409b = gVar.f300404w;
                            this.f300410c = gVar.f300405x;
                            Log.m105924i("MicroMsg.Mp4Parser2", "this trak atom is video trak. timeScale: " + this.f300409b + " duration: " + this.f300410c);
                            long j8 = gVar.f300407z;
                            if (this.f300419l) {
                                bArr = bArr3;
                                C102025n j9 = mo141517j(randomAccessFile2, j8, bArr);
                                this.f300417j = j9;
                                this.f300413f = mo141516i(randomAccessFile2, j9, true);
                                this.f300419l = this.f300417j.f300451M;
                                this.f300421n.add(new Pair(0, 5));
                                ArrayList<Pair<Integer, Integer>> arrayList = this.f300421n;
                                this.f300420m = ((Integer) arrayList.get(arrayList.size() - 1).second).intValue();
                                this.f300411d = this.f300413f.length - 2;
                                Log.m105925i("MicroMsg.Mp4Parser2", "lazy parse finish, isLazyParse:%s", Boolean.valueOf(this.f300419l));
                                i = e2;
                                i4 = e;
                                i3 = 30;
                                c = 4;
                            } else {
                                bArr = bArr3;
                                i = e2;
                                i4 = e;
                                c = 4;
                                i3 = 30;
                                long[] h2 = mo141515h(randomAccessFile, j8, bArr, true);
                                Log.m105924i("MicroMsg.Mp4Parser2", "createTimeTable finish");
                                ((ArrayList) this.f300412e).add(h2);
                                this.f300411d = Math.max(this.f300411d, h2.length - 2);
                            }
                            int i9 = this.f300411d;
                            if (i9 > i3) {
                                Log.m105925i("MicroMsg.Mp4Parser2", "current timeTableLength is:%s too long, ignore parse other track", Integer.valueOf(i9));
                                break;
                            } else if (this.f300419l) {
                                Log.m105924i("MicroMsg.Mp4Parser2", "lazy parse, ignore other trak atom");
                                break;
                            } else {
                                i2 = i4;
                                z2 = true;
                                long j74 = (long) i2;
                                a -= j74;
                                j4 = j3 + j74;
                                Object[] objArr32 = new Object[5];
                                objArr32[0] = Integer.valueOf(i2);
                                objArr32[1] = Integer.valueOf(i);
                                objArr32[2] = Long.valueOf(a);
                                objArr32[3] = Long.valueOf(j4);
                                objArr32[c] = Integer.valueOf(this.f300411d);
                                Log.m105919d("MicroMsg.Mp4Parser2", "atomSize:%s, atomType:%s, remains:%s, beginPos:%s, timeTableLength:%s", objArr32);
                                bArr2 = bArr;
                                i5 = 0;
                                c2 = 1;
                                i6 = 2;
                            }
                        }
                    }
                }
                i = e2;
                i2 = e;
                j3 = j4;
                bArr = bArr2;
                c = 4;
                long j742 = (long) i2;
                a -= j742;
                j4 = j3 + j742;
                Object[] objArr322 = new Object[5];
                objArr322[0] = Integer.valueOf(i2);
                objArr322[1] = Integer.valueOf(i);
                objArr322[2] = Long.valueOf(a);
                objArr322[3] = Long.valueOf(j4);
                objArr322[c] = Integer.valueOf(this.f300411d);
                Log.m105919d("MicroMsg.Mp4Parser2", "atomSize:%s, atomType:%s, remains:%s, beginPos:%s, timeTableLength:%s", objArr322);
                bArr2 = bArr;
                i5 = 0;
                c2 = 1;
                i6 = 2;
            }
            if (!this.f300419l) {
                Log.m105925i("MicroMsg.Mp4Parser2", "parse finish, start merge time table, cost:%s", Long.valueOf(Util.ticksToNow(currentTicks)));
                mo141518k();
                j2 = Util.ticksToNow(currentTicks);
            } else {
                j2 = Util.ticksToNow(currentTicks);
                Log.m105925i("MicroMsg.Mp4Parser2", "lazy parse finish, cost:%s, timeTableLength:%s", Long.valueOf(j2), Integer.valueOf(this.f300411d));
            }
            Log.m105925i("MicroMsg.Mp4Parser2", "parseExtractor finish, totalCost:%sms, isLazyParse:%s", Long.valueOf(j2), Boolean.valueOf(this.f300419l));
            C14182k.f39627a.mo13569a(this.f300419l, j2, this.f300411d);
            return true;
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.Mp4Parser2", e3, "parser mp4 error", new Object[0]);
            return false;
        }
    }

    /* renamed from: m */
    public void mo141520m() {
        this.f300408a = null;
        this.f300413f = null;
        ((ArrayList) this.f300412e).clear();
        this.f300411d = 0;
        long j = (long) 0;
        this.f300410c = j;
        this.f300409b = j;
        List<C102024m> list = this.f300414g;
        if (list != null) {
            list.clear();
        }
        List<Pair> list2 = this.f300415h;
        if (list2 != null) {
            list2.clear();
        }
        ArrayList<Pair<Integer, Integer>> arrayList = this.f300421n;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f300416i = null;
        this.f300423p = 0;
    }

    public synchronized void release() {
        if (this.f300418k != null) {
            try {
                Log.printInfoStack("MicroMsg.Mp4Parser2", "release close file", new Object[0]);
                this.f300418k.close();
                this.f300418k = null;
                this.f300420m = 0;
                this.f300421n.clear();
                this.f300417j = null;
            } catch (IOException e) {
                try {
                    Log.printErrStackTrace("MicroMsg.Mp4Parser2", e, "", new Object[0]);
                } catch (Throwable th) {
                    this.f300418k = null;
                    throw th;
                }
            }
            this.f300418k = null;
        }
    }
}
