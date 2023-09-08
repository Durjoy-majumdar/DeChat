package ww0;

import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.autogen.mmdata.rpt.WordDictBuildReportStruct;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.wxmm.v2encoder;
import eb0.C31543z5;
import java.io.InputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import te3.C50706on3;
import te3.w35;
import te3.x35;
import u73.C22613h1;

/* renamed from: ww0.g */
public class C53204g {

    /* renamed from: a */
    public static AtomicBoolean f148408a = new AtomicBoolean(false);

    /* renamed from: b */
    public static AtomicBoolean f148409b = new AtomicBoolean(false);

    /* renamed from: c */
    public static short[][] f148410c;

    /* renamed from: d */
    public static int[][] f148411d;

    /* renamed from: e */
    public static int[][] f148412e;

    /* renamed from: f */
    public static final HashMap<Integer, LinkedList<Integer>> f148413f = new HashMap<>();

    /* renamed from: g */
    public static int f148414g = 0;

    /* renamed from: h */
    public static int f148415h = 2;

    /* renamed from: i */
    public static int f148416i = 400;

    /* renamed from: j */
    public static int f148417j = 0;

    /* renamed from: k */
    public static HashSet<String> f148418k = new HashSet<>();

    /* renamed from: l */
    public static HashSet<w35> f148419l = new HashSet<>();

    /* renamed from: m */
    public static final Runnable f148420m = new C38310a();

    /* renamed from: n */
    public static int f148421n = 1;

    /* renamed from: o */
    public static int f148422o = 0;

    /* renamed from: ww0.g$a */
    public class C38310a implements Runnable {
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0031 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0037 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = "MicroMsg.HotWordSearchUtil"
                r1 = 0
                java.lang.String r2 = ww0.C53204g.m59617e(r1)     // Catch:{ Exception -> 0x003a }
                r3 = 0
            L_0x0008:
                r4 = 3
                if (r3 >= r4) goto L_0x0042
                int r4 = ww0.C53204g.m59619g(r2)     // Catch:{ Exception -> 0x003a }
                if (r4 != 0) goto L_0x0012
                return
            L_0x0012:
                r5 = -4
                if (r4 == r5) goto L_0x001c
                r5 = -3
                if (r4 == r5) goto L_0x0021
                r5 = -2
                if (r4 == r5) goto L_0x0029
                goto L_0x0037
            L_0x001c:
                java.lang.String r4 = "[loadTask] wordBank file empty"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)     // Catch:{ Exception -> 0x003a }
            L_0x0021:
                com.tencent.p014mm.vfs.C86013q1.m106447h(r2)     // Catch:{ Exception -> 0x003a }
                java.lang.String r4 = "[loadTask] wordBank file broken, reCreate Model"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r4)     // Catch:{ Exception -> 0x003a }
            L_0x0029:
                r4 = -1
                r5 = 1
                int r5 = ww0.C53204g.m59614b(r5)     // Catch:{ Exception -> 0x003a }
                if (r4 != r5) goto L_0x0037
                java.lang.String r2 = "[loadTask] wordBank file broken, and raw file not exist"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)     // Catch:{ Exception -> 0x003a }
                return
            L_0x0037:
                int r3 = r3 + 1
                goto L_0x0008
            L_0x003a:
                r2 = move-exception
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r3 = "[loadTask]"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r3, r1)
            L_0x0042:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ww0.C53204g.C38310a.run():void");
        }
    }

    /* renamed from: ww0.g$b */
    public class C53205b implements Comparator<C53206c> {
        public int compare(Object obj, Object obj2) {
            C53206c cVar = (C53206c) obj;
            C53206c cVar2 = (C53206c) obj2;
            short s = cVar.f148423a;
            short s2 = cVar2.f148423a;
            if (s < s2) {
                return -1;
            }
            if (s > s2) {
                return 1;
            }
            return cVar.f148424b - cVar2.f148424b;
        }
    }

    /* renamed from: ww0.g$c */
    public static class C53206c {

        /* renamed from: a */
        public short f148423a;

        /* renamed from: b */
        public int f148424b;

        /* renamed from: c */
        public int f148425c;

        public C53206c(short s, int i, int i2) {
            this.f148423a = s;
            this.f148424b = i;
            this.f148425c = i2;
        }
    }

    /* renamed from: a */
    public static int m59613a(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            i = (i * 131) + ((short) str.charAt(i2));
        }
        return Integer.MAX_VALUE & i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013e, code lost:
        if (r10 == null) goto L_0x0141;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:17:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0222 A[SYNTHETIC, Splitter:B:95:0x0222] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m59614b(boolean r16) {
        /*
            r1 = 1
            java.lang.String r0 = m59617e(r1)
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            r3 = 0
            r4 = -1
            java.lang.String r5 = "MicroMsg.HotWordSearchUtil"
            if (r2 != 0) goto L_0x0019
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r0
            java.lang.String r0 = "[createModelFromRawFileAndSave] rawFile NOT exists, path = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r0, r1)
            return r4
        L_0x0019:
            if (r16 == 0) goto L_0x0045
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.String r6 = m59616d()
            r2.<init>((java.lang.String) r6)
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            java.lang.String r7 = "blackWhite"
            r6.<init>((com.tencent.p014mm.vfs.C86009m1) r2, (java.lang.String) r7)
            java.lang.String r2 = r6.mo119971i()
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r2)
            if (r6 == 0) goto L_0x0045
            byte[] r2 = com.tencent.p014mm.vfs.C86013q1.m106433O(r2, r3, r4)
            int r4 = r2.length
            if (r4 <= 0) goto L_0x0040
            m59621i(r2)
            goto L_0x0045
        L_0x0040:
            java.lang.String r2 = "[resolveRealTimeWordBank] Length of real time word bank file = 0"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r2)
        L_0x0045:
            long r6 = eb0.C31543z5.m39453c()
            r2 = 20003(0x4e23, float:2.803E-41)
            java.util.LinkedList[] r4 = new java.util.LinkedList[r2]
            r8 = 0
        L_0x004e:
            if (r8 >= r2) goto L_0x005a
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            r4[r8] = r9
            int r8 = r8 + 1
            goto L_0x004e
        L_0x005a:
            r8 = 2
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0134, all -> 0x0130 }
            com.tencent.mm.vfs.t1 r11 = new com.tencent.mm.vfs.t1     // Catch:{ Exception -> 0x0134, all -> 0x0130 }
            r11.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0134, all -> 0x0130 }
            r10.<init>(r11)     // Catch:{ Exception -> 0x0134, all -> 0x0130 }
            java.lang.String r0 = r10.readLine()     // Catch:{ Exception -> 0x012e, all -> 0x012b }
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)     // Catch:{ Exception -> 0x012e, all -> 0x012b }
            r11 = 0
        L_0x006e:
            java.lang.String r12 = r10.readLine()     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            java.lang.String r13 = ","
            if (r12 != 0) goto L_0x00ca
            java.util.HashSet<te3.w35> r0 = f148419l     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0129, all -> 0x012b }
        L_0x007c:
            boolean r12 = r0.hasNext()     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            if (r12 == 0) goto L_0x00c2
            java.lang.Object r12 = r0.next()     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            te3.w35 r12 = (te3.w35) r12     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            java.lang.String r14 = r12.f143845d     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r14 = r14.length()     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            if (r14 < r8) goto L_0x00bf
            java.lang.String r14 = r12.f143845d     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            boolean r14 = r14.contains(r13)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            if (r14 == 0) goto L_0x0099
            goto L_0x00bf
        L_0x0099:
            java.lang.String r14 = r12.f143845d     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            java.lang.String r14 = r14.substring(r3, r8)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r14 = r14.hashCode()     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            java.lang.String r15 = r12.f143845d     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r15 = m59613a(r15)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            java.lang.String r9 = r12.f143845d     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            short r9 = (short) r9     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r14 = r14 % r2
            r14 = r4[r14]     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            ww0.g$c r2 = new ww0.g$c     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r12 = r12.f143846e     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            r2.<init>(r9, r15, r12)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            r14.add(r2)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r11 = r11 + 1
        L_0x00bf:
            r2 = 20003(0x4e23, float:2.803E-41)
            goto L_0x007c
        L_0x00c2:
            r10.close()     // Catch:{ Exception -> 0x00c7 }
            goto L_0x0141
        L_0x00c7:
            goto L_0x0141
        L_0x00ca:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            if (r2 != 0) goto L_0x0125
            r2 = 200000(0x30d40, float:2.8026E-40)
            if (r0 < r2) goto L_0x00e9
            java.lang.String r2 = " "
            java.lang.String[] r2 = r12.split(r2)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r9 = r2.length     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            if (r9 <= r1) goto L_0x00e7
            r9 = r2[r3]     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            r2 = r2[r1]     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r2 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r2, (int) r3)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            goto L_0x00eb
        L_0x00e7:
            r12 = r2[r3]     // Catch:{ Exception -> 0x0129, all -> 0x012b }
        L_0x00e9:
            r9 = r12
            r2 = 0
        L_0x00eb:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            if (r12 != 0) goto L_0x0125
            java.util.HashSet<java.lang.String> r12 = f148418k     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            boolean r12 = r12.contains(r9)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            if (r12 != 0) goto L_0x0125
            int r12 = r9.length()     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            if (r12 < r8) goto L_0x0125
            boolean r12 = r9.contains(r13)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            if (r12 != 0) goto L_0x0125
            int r11 = r11 + 1
            java.lang.String r12 = r9.substring(r3, r8)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r12 = r12.hashCode()     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r13 = m59613a(r9)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            short r9 = (short) r9     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            r14 = 20003(0x4e23, float:2.803E-41)
            int r12 = r12 % r14
            r12 = r4[r12]     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            ww0.g$c r14 = new ww0.g$c     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            r14.<init>(r9, r13, r2)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
            r12.add(r14)     // Catch:{ Exception -> 0x0129, all -> 0x012b }
        L_0x0125:
            r2 = 20003(0x4e23, float:2.803E-41)
            goto L_0x006e
        L_0x0129:
            r0 = move-exception
            goto L_0x0137
        L_0x012b:
            r0 = move-exception
            goto L_0x0220
        L_0x012e:
            r0 = move-exception
            goto L_0x0136
        L_0x0130:
            r0 = move-exception
            r9 = 0
            goto L_0x021f
        L_0x0134:
            r0 = move-exception
            r10 = 0
        L_0x0136:
            r11 = 0
        L_0x0137:
            java.lang.String r2 = "[createModelFromRawFileAndSave]"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x021d }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r2, r9)     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x0141
            goto L_0x00c2
        L_0x0141:
            r0 = 0
        L_0x0142:
            r2 = 20003(0x4e23, float:2.803E-41)
            if (r0 >= r2) goto L_0x0153
            r2 = r4[r0]
            ww0.g$b r9 = new ww0.g$b
            r9.<init>()
            java.util.Collections.sort(r2, r9)
            int r0 = r0 + 1
            goto L_0x0142
        L_0x0153:
            long r9 = eb0.C31543z5.m39453c()
            long r9 = r9 - r6
            long r6 = (long) r11
            r12 = 1
            com.tencent.mm.autogen.mmdata.rpt.WordDictBuildReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WordDictBuildReportStruct
            r0.<init>()
            r0.f108031d = r6
            r0.f108032e = r9
            r0.f108033f = r12
            r0.mo86054n()
            u73.C22613h1.m26490p(r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r0[r3] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r0[r1] = r2
            java.lang.String r2 = "[createModelFromRawFileAndSave] Create model use %s ms, word cnt: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r2, r0)
            long r6 = eb0.C31543z5.m39453c()
            java.lang.String r0 = m59617e(r3)     // Catch:{ Exception -> 0x0202 }
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)     // Catch:{ Exception -> 0x0202 }
            if (r2 == 0) goto L_0x0190
            com.tencent.p014mm.vfs.C86013q1.m106447h(r0)     // Catch:{ Exception -> 0x0202 }
        L_0x0190:
            com.tencent.p014mm.vfs.C86013q1.m106444e(r0)     // Catch:{ Exception -> 0x0202 }
            r2 = 80012(0x1388c, float:1.1212E-40)
            int r11 = r11 * 7
            int r11 = r11 + r2
            int r11 = r11 + 50
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r11)     // Catch:{ Exception -> 0x0202 }
            java.nio.ByteOrder r8 = java.nio.ByteOrder.BIG_ENDIAN     // Catch:{ Exception -> 0x0202 }
            r2.order(r8)     // Catch:{ Exception -> 0x0202 }
            r2.clear()     // Catch:{ Exception -> 0x0202 }
            int r8 = f148414g     // Catch:{ Exception -> 0x0202 }
            r2.putInt(r8)     // Catch:{ Exception -> 0x0202 }
            int r8 = f148415h     // Catch:{ Exception -> 0x0202 }
            r2.putInt(r8)     // Catch:{ Exception -> 0x0202 }
            int r8 = f148416i     // Catch:{ Exception -> 0x0202 }
            r2.putInt(r8)     // Catch:{ Exception -> 0x0202 }
            int r8 = f148417j     // Catch:{ Exception -> 0x0202 }
            r2.putInt(r8)     // Catch:{ Exception -> 0x0202 }
            r8 = 20003(0x4e23, float:2.803E-41)
            r2.putInt(r8)     // Catch:{ Exception -> 0x0202 }
            r9 = 0
        L_0x01c1:
            if (r9 >= r8) goto L_0x01ef
            r10 = r4[r9]     // Catch:{ Exception -> 0x0202 }
            int r10 = r10.size()     // Catch:{ Exception -> 0x0202 }
            r2.putInt(r10)     // Catch:{ Exception -> 0x0202 }
            r11 = 0
        L_0x01cd:
            if (r11 >= r10) goto L_0x01ec
            r12 = r4[r9]     // Catch:{ Exception -> 0x0202 }
            java.lang.Object r12 = r12.get(r11)     // Catch:{ Exception -> 0x0202 }
            ww0.g$c r12 = (ww0.C53204g.C53206c) r12     // Catch:{ Exception -> 0x0202 }
            short r13 = r12.f148423a     // Catch:{ Exception -> 0x0202 }
            r2.putShort(r13)     // Catch:{ Exception -> 0x0202 }
            int r13 = r12.f148424b     // Catch:{ Exception -> 0x0202 }
            r2.putInt(r13)     // Catch:{ Exception -> 0x0202 }
            int r12 = r12.f148425c     // Catch:{ Exception -> 0x0202 }
            r12 = r12 & 255(0xff, float:3.57E-43)
            byte r12 = (byte) r12     // Catch:{ Exception -> 0x0202 }
            r2.put(r12)     // Catch:{ Exception -> 0x0202 }
            int r11 = r11 + 1
            goto L_0x01cd
        L_0x01ec:
            int r9 = r9 + 1
            goto L_0x01c1
        L_0x01ef:
            r2.flip()     // Catch:{ Exception -> 0x0202 }
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)     // Catch:{ Exception -> 0x0202 }
            r4 = 0
            java.nio.channels.WritableByteChannel r0 = com.tencent.p014mm.vfs.C86013q1.m106430L(r0, r4, r3)     // Catch:{ Exception -> 0x0202 }
            r0.write(r2)     // Catch:{ Exception -> 0x0202 }
            r0.close()     // Catch:{ Exception -> 0x0202 }
            goto L_0x020a
        L_0x0202:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = "[createModelFromTXTFileAndSave save]"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r4, r2)
        L_0x020a:
            long r8 = eb0.C31543z5.m39453c()
            long r8 = r8 - r6
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r0[r3] = r1
            java.lang.String r1 = "[createModelFromTXTFileAndSave] Write model to disk use %s ms"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r1, r0)
            return r3
        L_0x021d:
            r0 = move-exception
            r9 = r10
        L_0x021f:
            r10 = r9
        L_0x0220:
            if (r10 == 0) goto L_0x0225
            r10.close()     // Catch:{ Exception -> 0x0225 }
        L_0x0225:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ww0.C53204g.m59614b(boolean):int");
    }

    /* renamed from: c */
    public static int m59615c() {
        Uri.Builder builder;
        String d = m59616d();
        if (!C86013q1.m106450k(d + "/config.conf")) {
            Log.m105925i("MicroMsg.HotWordSearchUtil", "[getCurrentWordBankVersion] config.conf NOT exist, path: %s", d + "/config.conf");
            return 1;
        }
        InputStream inputStream = null;
        Uri n = d == null ? null : C116299g2.m163858n(d);
        if (n == null) {
            builder = new Uri.Builder().path("config.conf");
        } else {
            builder = n.buildUpon();
            builder.appendPath("config.conf");
        }
        Uri build = builder.build();
        String path = build.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!build.getPath().equals(k)) {
                build = builder.path(k).build();
            }
        }
        Properties properties = new Properties();
        try {
            inputStream = C86013q1.m106421C(build, C116281f0.C116289i.f348994a.mo177799l(build, (C116281f0.C116288h) null));
            properties.load(inputStream);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.HotWordSearchUtil", e, "[getCurrentWordBankVersion]", new Object[0]);
        } catch (Throwable th) {
            C116299g2.m163847c(inputStream);
            throw th;
        }
        C116299g2.m163847c(inputStream);
        return Integer.parseInt(properties.getProperty(ProviderConstants.API_COLNAME_FEATURE_VERSION, String.valueOf(1)).trim());
    }

    /* renamed from: d */
    public static String m59616d() {
        return C43471q.m46983g(2).mo71077o() + "/wordBankDir";
    }

    /* renamed from: e */
    public static String m59617e(boolean z) {
        return new C86009m1(new C86009m1(m59616d()), z ? "fs_kw_main.txt" : "wordBank_Weight_1").mo119971i();
    }

    /* renamed from: f */
    public static LinkedList<w35> m59618f(String str) {
        String str2 = str;
        LinkedList<w35> linkedList = new LinkedList<>();
        if (f148409b.get()) {
            Log.m105924i("MicroMsg.HotWordSearchUtil", "[hashSearchFullStr] wordBank is loading, Give UP searching");
            return linkedList;
        } else if (!f148408a.get() || f148410c == null || f148411d == null) {
            Log.m105928w("MicroMsg.HotWordSearchUtil", "[hashSearchFullStr] wordBank has NOT init");
            return linkedList;
        } else {
            if (str.length() < f148415h || str.length() > f148416i) {
                Log.m105925i("MicroMsg.HotWordSearchUtil", "[hashSearchFullStr] text.length(%s) is NOT in range [%s, %s]", Integer.valueOf(str.length()), Integer.valueOf(f148415h), Integer.valueOf(f148416i));
                return linkedList;
            }
            int length = str.length();
            int i = 0;
            for (int i2 = 1; i < str.length() - i2; i2 = 1) {
                int hashCode = str2.substring(i, i + 2).hashCode();
                short[][] sArr = f148410c;
                int length2 = hashCode % sArr.length;
                short[] sArr2 = sArr[length2];
                int[] iArr = f148411d[length2];
                int[] iArr2 = f148412e[length2];
                int length3 = sArr2.length;
                if (length3 > 200) {
                    LinkedList linkedList2 = f148413f.get(Integer.valueOf(length2));
                    if (linkedList2 == null) {
                        Object[] objArr = new Object[i2];
                        objArr[0] = Integer.valueOf(length2);
                        Log.m105921e("MicroMsg.HotWordSearchUtil", "[hashSearchFullStr] hashConflictHandler.get(%d) == null", objArr);
                        return null;
                    }
                    Iterator it = linkedList2.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        short s = sArr2[i3];
                        if (i + s > length) {
                            break;
                        }
                        String substring = str2.substring(i, s + i);
                        int a = m59613a(substring);
                        int i4 = intValue + i3;
                        int i5 = i4 - 1;
                        while (true) {
                            if (i3 > i5) {
                                break;
                            }
                            int i6 = (i3 + i5) / 2;
                            int i7 = iArr[i6];
                            if (a == i7) {
                                w35 w35 = new w35();
                                w35.f143845d = substring;
                                w35.f143846e = iArr2[i6];
                                linkedList.add(w35);
                                break;
                            } else if (a < i7) {
                                i5 = i6 - 1;
                            } else {
                                i3 = i6 + 1;
                            }
                        }
                        i3 = i4;
                    }
                } else {
                    for (int i8 = 0; i8 < length3; i8++) {
                        short s2 = sArr2[i8];
                        if (i + s2 > length) {
                            break;
                        }
                        String substring2 = str2.substring(i, s2 + i);
                        if (m59613a(substring2) == iArr[i8]) {
                            w35 w352 = new w35();
                            w352.f143845d = substring2;
                            w352.f143846e = iArr2[i8];
                            linkedList.add(w352);
                        }
                    }
                }
                i++;
            }
            return linkedList;
        }
    }

    /* renamed from: g */
    public static int m59619g(String str) {
        String str2 = str;
        if (!C86013q1.m106450k(str)) {
            Log.m105921e("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] wordBank file do NOT exist, path: %s", str2);
            return -2;
        }
        int i = 2;
        Log.m105925i("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] wordBank file %s %s", str2, Long.valueOf(C86013q1.m106451l(str)));
        f148409b.set(true);
        f148408a.set(false);
        long c = C31543z5.m39453c();
        byte[] O = C86013q1.m106433O(str2, 0, -1);
        int i2 = -3;
        if (O == null || O.length < 24) {
            Log.m105921e("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] bytes.length(%s) < 24", Integer.valueOf(O.length));
            return O.length == 0 ? -4 : -3;
        }
        f148422o = 0;
        f148414g = m59620h(O);
        f148415h = m59620h(O);
        f148416i = m59620h(O);
        f148417j = m59620h(O);
        int h = m59620h(O);
        if (h != 20003) {
            Log.m105921e("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] wordBank file broken, wordGroupC: %s, reCreate model", Integer.valueOf(h));
            return -3;
        }
        int length = ((O.length - 20) - (h * 4)) / 7;
        Log.m105925i("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] wordCntAvailable = %s", Integer.valueOf(length));
        f148410c = new short[h][];
        f148411d = new int[h][];
        f148412e = new int[h][];
        int i3 = 0;
        int i4 = 0;
        while (i3 < h) {
            int h2 = m59620h(O);
            i4 += h2;
            if (i4 > length) {
                Object[] objArr = new Object[i];
                objArr[0] = Integer.valueOf(i4);
                objArr[1] = Integer.valueOf(length);
                Log.m105921e("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] currCnt(%s) > wordCntAvailable(%s)", objArr);
                return i2;
            }
            f148410c[i3] = new short[h2];
            f148411d[i3] = new int[h2];
            f148412e[i3] = new int[h2];
            for (int i5 = 0; i5 < h2; i5++) {
                short[] sArr = f148410c[i3];
                int i6 = f148422o;
                int i7 = i6 + 1;
                byte b = (O[i6] << 8) & ExifInterface.MARKER;
                f148422o = i7 + 1;
                sArr[i5] = (short) (b + (O[i7] & ExifInterface.MARKER));
                f148411d[i3][i5] = m59620h(O);
                int[] iArr = f148412e[i3];
                int i8 = f148422o;
                f148422o = i8 + 1;
                iArr[i5] = O[i8] & ExifInterface.MARKER;
            }
            if (h2 > 200) {
                LinkedList linkedList = new LinkedList();
                short s = f148410c[i3][0];
                int i9 = 1;
                for (int i15 = 1; i15 < h2; i15++) {
                    if (f148410c[i3][i15] != s) {
                        linkedList.addLast(Integer.valueOf(i9));
                        s = f148410c[i3][i15];
                        i9 = 1;
                    } else {
                        i9++;
                    }
                }
                linkedList.addLast(Integer.valueOf(i9));
                f148413f.put(Integer.valueOf(i3), linkedList);
            }
            i3++;
            i = 2;
            i2 = -3;
        }
        f148408a.set(true);
        f148409b.set(false);
        long ceil = (long) Math.ceil((double) (C31543z5.m39453c() - c));
        WordDictBuildReportStruct wordDictBuildReportStruct = new WordDictBuildReportStruct();
        wordDictBuildReportStruct.f108031d = (long) i4;
        wordDictBuildReportStruct.f108032e = ceil;
        wordDictBuildReportStruct.f108033f = 2;
        wordDictBuildReportStruct.mo86054n();
        C22613h1.m26490p(wordDictBuildReportStruct);
        Log.m105925i("MicroMsg.HotWordSearchUtil", "[loadFromCustomProtocolFile] load model from disk use %s ms, total cnt = %s", Long.valueOf(ceil), Integer.valueOf(i4));
        return 0;
    }

    /* renamed from: h */
    public static int m59620h(byte[] bArr) {
        int i = f148422o;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & ExifInterface.MARKER) << 24) + ((bArr[i2] & ExifInterface.MARKER) << v2encoder.enumCODEC_vcodec2);
        int i5 = i3 + 1;
        int i6 = i4 + ((bArr[i3] & ExifInterface.MARKER) << 8);
        f148422o = i5 + 1;
        return i6 + (bArr[i5] & ExifInterface.MARKER);
    }

    /* renamed from: i */
    public static void m59621i(byte[] bArr) {
        try {
            C50706on3 on32 = (C50706on3) new C50706on3().parseFrom(bArr);
            f148414g = on32.f139269d;
            x35 x35 = on32.f139272g;
            int i = x35.f144434d;
            f148418k.clear();
            f148418k.addAll(x35.f144435e);
            x35 x352 = on32.f139271f;
            int i2 = x352.f144434d;
            f148419l.clear();
            if (x352.f144436f.size() > 0) {
                f148419l.addAll(x352.f144436f);
            } else {
                Iterator<String> it = x352.f144435e.iterator();
                while (it.hasNext()) {
                    w35 w35 = new w35();
                    w35.f143845d = it.next();
                    w35.f143846e = 255;
                    f148419l.add(w35);
                }
            }
            Iterator<w35> it4 = f148419l.iterator();
            while (it4.hasNext()) {
                w35 next = it4.next();
                Log.m105925i("MicroMsg.HotWordSearchUtil", "[white word]: %s %s", next.f143845d, Integer.valueOf(next.f143846e));
            }
            Iterator<String> it5 = f148418k.iterator();
            while (it5.hasNext()) {
                Log.m105925i("MicroMsg.HotWordSearchUtil", "[black word]: %s", it5.next());
            }
            Log.m105925i("MicroMsg.HotWordSearchUtil", "realTimeWordsVersion: %s, blackVer: %s whiteVer: %s minMatchLen: %s, maxMatchLen: %s, disable: %s, blackList.size: %s, whiteList.size: %s", Integer.valueOf(f148414g), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(f148415h), Integer.valueOf(f148416i), Integer.valueOf(f148417j), Integer.valueOf(f148418k.size()), Integer.valueOf(f148419l.size()));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.HotWordSearchUtil", e, "[resolveRealTimeWordBankFile]", new Object[0]);
        }
    }

    /* renamed from: j */
    public static int m59622j(String str) {
        String d = m59616d();
        if (C86013q1.m106450k(d)) {
            C86013q1.m106445f(d);
        }
        C86013q1.m106461v(d);
        int R = C86013q1.m106436R(str, d);
        if (R < 0) {
            Log.m105920e("MicroMsg.HotWordSearchUtil", "[updateWordBank] unzip fail, ret = " + R + ", zipFilePath = " + str + ", unzipPath = " + d);
            return -1;
        }
        Log.m105925i("MicroMsg.HotWordSearchUtil", "[updateWordBank] unzip success, path: %s", d);
        return 0;
    }
}
