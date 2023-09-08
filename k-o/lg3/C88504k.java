package lg3;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.VersionUtilities;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import lg3.C88498g;
import lg3.C88502j;

/* renamed from: lg3.k */
public class C88504k {

    /* renamed from: a */
    public static final List<String> f255643a = Arrays.asList(new String[]{"zh_CN", "en"});

    /* renamed from: b */
    public static C88504k f255644b;

    /* renamed from: c */
    public static C88505l f255645c;

    /* renamed from: d */
    public static C88498g f255646d;

    /* renamed from: e */
    public static C88502j f255647e;

    /* renamed from: f */
    public static String f255648f = "";

    /* renamed from: g */
    public static boolean f255649g = false;

    /* renamed from: h */
    public static boolean f255650h = true;

    public C88504k(AssetManager assetManager) {
    }

    /* renamed from: a */
    public static void m110375a() {
        C88505l lVar = f255645c;
        if (lVar != null) {
            SparseIntArray sparseIntArray = lVar.f255651a;
            if (sparseIntArray != null) {
                sparseIntArray.clear();
            }
            if (lVar.f255652b != null) {
                lVar.f255652b = null;
            }
        }
        C88498g gVar = f255646d;
        if (gVar != null) {
            SparseArray<C88498g.C88499a> sparseArray = gVar.f255634a;
            if (sparseArray != null) {
                sparseArray.clear();
            }
            if (gVar.f255635b != null) {
                gVar.f255635b = null;
            }
        }
        C88502j jVar = f255647e;
        if (jVar != null) {
            SparseArray<C88502j.C88503a> sparseArray2 = jVar.f255640a;
            if (sparseArray2 != null) {
                sparseArray2.clear();
            }
            if (jVar.f255641b != null) {
                jVar.f255641b = null;
            }
        }
    }

    /* renamed from: b */
    public static String m110376b(Context context) {
        return BuildInfo.IS_FLAVOR_BLUE ? context.getString(C0966R.string.f7668n_) : VersionUtilities.checkAlphaVersion(BuildInfo.CLIENT_VERSION_INT) ? context.getString(C0966R.string.f7558jl) : "";
    }

    /* renamed from: c */
    public static C88504k m110377c(AssetManager assetManager) {
        C88504k kVar;
        synchronized (C88504k.class) {
            if (f255644b == null) {
                f255644b = new C88504k(assetManager);
            }
            kVar = f255644b;
        }
        return kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x025e A[SYNTHETIC, Splitter:B:103:0x025e] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011b A[Catch:{ IOException -> 0x01e4, all -> 0x01e1 }, LOOP:0: B:40:0x0119->B:41:0x011b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0147 A[Catch:{ IOException -> 0x01e4, all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0181 A[Catch:{ IOException -> 0x01e4, all -> 0x01e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01bb A[SYNTHETIC, Splitter:B:58:0x01bb] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0201 A[SYNTHETIC, Splitter:B:83:0x0201] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0215 A[SYNTHETIC, Splitter:B:88:0x0215] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x024a A[SYNTHETIC, Splitter:B:98:0x024a] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static lg3.C88504k m110378f(android.content.Context r18, java.lang.String r19) {
        /*
            android.content.res.Resources r0 = r18.getResources()
            java.lang.String r1 = "MicroMsg.language.StringResouces"
            r2 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "the resource is null! why?"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            return r2
        L_0x0010:
            nj.i$b r0 = p206nj.C76862i.f224685a
            android.content.res.AssetManager r3 = r0.getAssets()
            if (r3 == 0) goto L_0x001f
            lg3.k r0 = m110377c(r3)
            r0.getClass()
        L_0x001f:
            if (r3 == 0) goto L_0x0276
            lg3.k r0 = m110377c(r3)
            r0.getClass()
            boolean r0 = f255650h
            if (r0 != 0) goto L_0x002e
            goto L_0x0276
        L_0x002e:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "language_default"
            r4 = r19
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            java.util.Locale r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.transLanguageToLocale(r19)
            goto L_0x004d
        L_0x0044:
            java.util.Locale r0 = java.util.Locale.getDefault()
            r4 = r18
            com.tencent.p014mm.sdk.platformtools.LocaleUtil.updateApplicationResourceLocale(r4, r0)
        L_0x004d:
            java.lang.String r0 = r0.toString()
            lg3.k r4 = m110377c(r3)
            r4.getClass()
            java.util.List<java.lang.String> r4 = f255643a
            boolean r4 = r4.contains(r0)
            r5 = 1
            r4 = r4 ^ r5
            f255649g = r4
            if (r4 == 0) goto L_0x0271
            lg3.k r4 = m110377c(r3)
            r4.getClass()
            java.lang.String r6 = "exception:%s"
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r7 == 0) goto L_0x007a
            java.lang.String r0 = "local is null."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            goto L_0x0240
        L_0x007a:
            java.lang.String r7 = f255648f
            boolean r7 = r0.equals(r7)
            r8 = 0
            if (r7 == 0) goto L_0x008e
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r8] = r0
            java.lang.String r0 = "local no change. local is :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r2)
            goto L_0x0240
        L_0x008e:
            java.lang.String r7 = "strings"
            boolean r7 = p206nj.C76862i.m92661a(r7)
            if (r7 != 0) goto L_0x009e
            java.lang.String r0 = "expansions is not yet installed, skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r0)
            goto L_0x0240
        L_0x009e:
            java.lang.String r7 = "_"
            int r7 = r0.indexOf(r7)
            if (r7 <= 0) goto L_0x00c0
            java.lang.String r7 = r0.substring(r8, r7)
            java.lang.String r9 = "zh"
            boolean r9 = r7.equalsIgnoreCase(r9)
            if (r9 != 0) goto L_0x00c0
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r8] = r0
            r9[r5] = r7
            java.lang.String r0 = "local is :%s temp local is :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r0, r9)
            goto L_0x00c1
        L_0x00c0:
            r7 = r0
        L_0x00c1:
            m110375a()
            f255648f = r7
            java.lang.String r0 = "[cpan] start to init string resource"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01f3, all -> 0x01ee }
            r0.<init>()     // Catch:{ IOException -> 0x01f3, all -> 0x01ee }
            java.lang.String r11 = "strings/"
            r0.append(r11)     // Catch:{ IOException -> 0x01f3, all -> 0x01ee }
            r0.append(r7)     // Catch:{ IOException -> 0x01f3, all -> 0x01ee }
            java.lang.String r11 = ".mmstr"
            r0.append(r11)     // Catch:{ IOException -> 0x01f3, all -> 0x01ee }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x01f3, all -> 0x01ee }
            java.io.InputStream r11 = r3.open(r0)     // Catch:{ IOException -> 0x01f3, all -> 0x01ee }
            java.io.DataInputStream r12 = new java.io.DataInputStream     // Catch:{ IOException -> 0x01ea, all -> 0x01e7 }
            r12.<init>(r11)     // Catch:{ IOException -> 0x01ea, all -> 0x01e7 }
            r12.readInt()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r12.readInt()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r0 = r12.readInt()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r2.<init>()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            java.lang.String r13 = "string count"
            r2.append(r13)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r2.append(r0)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            android.util.SparseIntArray r2 = new android.util.SparseIntArray     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r13 = r12.readInt()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r14 = 0
            r15 = 0
        L_0x0119:
            if (r14 >= r0) goto L_0x012d
            short r16 = r12.readShort()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r13 = r13 + r16
            r2.append(r13, r15)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            short r16 = r12.readShort()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r15 = r15 + r16
            int r14 = r14 + 1
            goto L_0x0119
        L_0x012d:
            lg3.l r0 = lg3.C88505l.m110382a(r2, r12, r15)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            f255645c = r0     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r0 = r12.readInt()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            java.lang.String r2 = "plurals string count:%d"
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r13[r8] = r14     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r2, r13)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            if (r0 <= 0) goto L_0x0169
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r13 = r12.readInt()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r14 = 0
            r15 = 0
        L_0x0152:
            if (r14 >= r0) goto L_0x0163
            int r16 = r12.readInt()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r13 = r13 + r16
            int r16 = r4.mo122970d(r12, r2, r13, r15)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r15 = r15 + r16
            int r14 = r14 + 1
            goto L_0x0152
        L_0x0163:
            lg3.g r0 = lg3.C88498g.m110371b(r2, r12, r15)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            f255646d = r0     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
        L_0x0169:
            int r0 = r12.readInt()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r2 = r12.readInt()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            java.lang.String r4 = "string array count：%d"
            java.lang.Object[] r13 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r13[r8] = r14     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r13)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            if (r0 <= 0) goto L_0x01b9
            android.util.SparseArray r4 = new android.util.SparseArray     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r13 = 0
            r14 = 0
        L_0x0188:
            if (r13 >= r0) goto L_0x01b3
            int r15 = r12.readInt()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r2 = r2 + r15
            int r15 = r12.readInt()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int[] r8 = new int[r15]     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r16 = r14
            r14 = 0
        L_0x0198:
            if (r14 >= r15) goto L_0x01a5
            r8[r14] = r16     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            short r17 = r12.readShort()     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r16 = r16 + r17
            int r14 = r14 + 1
            goto L_0x0198
        L_0x01a5:
            lg3.j$a r14 = new lg3.j$a     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r14.<init>(r2, r8)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            r4.append(r2, r14)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            int r13 = r13 + 1
            r14 = r16
            r8 = 0
            goto L_0x0188
        L_0x01b3:
            lg3.j r0 = lg3.C88502j.m110374a(r4, r12, r14)     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
            f255647e = r0     // Catch:{ IOException -> 0x01e4, all -> 0x01e1 }
        L_0x01b9:
            if (r11 == 0) goto L_0x01cd
            r11.close()     // Catch:{ IOException -> 0x01bf }
            goto L_0x01cd
        L_0x01bf:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)
            r4 = 0
            r0[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r0)
        L_0x01cd:
            r12.close()     // Catch:{ IOException -> 0x01d2 }
            goto L_0x0227
        L_0x01d2:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)
            r4 = 0
            r0[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r0)
            goto L_0x0227
        L_0x01e1:
            r0 = move-exception
            r2 = r12
            goto L_0x01e8
        L_0x01e4:
            r0 = move-exception
            r2 = r12
            goto L_0x01eb
        L_0x01e7:
            r0 = move-exception
        L_0x01e8:
            r4 = r2
            goto L_0x01f1
        L_0x01ea:
            r0 = move-exception
        L_0x01eb:
            r4 = r2
            r2 = r11
            goto L_0x01f5
        L_0x01ee:
            r0 = move-exception
            r4 = r2
            r11 = r4
        L_0x01f1:
            r2 = r0
            goto L_0x0248
        L_0x01f3:
            r0 = move-exception
            r4 = r2
        L_0x01f5:
            java.lang.String r8 = "[cpan] local :%s file can not be find. use default."
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0245 }
            r12 = 0
            r11[r12] = r7     // Catch:{ all -> 0x0245 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r8, r11)     // Catch:{ all -> 0x0245 }
            if (r2 == 0) goto L_0x0213
            r2.close()     // Catch:{ IOException -> 0x0205 }
            goto L_0x0213
        L_0x0205:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)
            r7 = 0
            r0[r7] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r0)
        L_0x0213:
            if (r4 == 0) goto L_0x0227
            r4.close()     // Catch:{ IOException -> 0x0219 }
            goto L_0x0227
        L_0x0219:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r2)
            r4 = 0
            r0[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r0)
        L_0x0227:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[cpan] finish init string resource user time:"
            r0.append(r2)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r9
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x0240:
            lg3.k r0 = m110377c(r3)
            return r0
        L_0x0245:
            r0 = move-exception
            r11 = r2
            goto L_0x01f1
        L_0x0248:
            if (r11 == 0) goto L_0x025c
            r11.close()     // Catch:{ IOException -> 0x024e }
            goto L_0x025c
        L_0x024e:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r3)
            r7 = 0
            r0[r7] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r0)
        L_0x025c:
            if (r4 == 0) goto L_0x0270
            r4.close()     // Catch:{ IOException -> 0x0262 }
            goto L_0x0270
        L_0x0262:
            r0 = move-exception
            r3 = r0
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r3)
            r4 = 0
            r0[r4] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r0)
        L_0x0270:
            throw r2
        L_0x0271:
            m110375a()
            f255648f = r0
        L_0x0276:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: lg3.C88504k.m110378f(android.content.Context, java.lang.String):lg3.k");
    }

    /* renamed from: d */
    public final int mo122970d(DataInputStream dataInputStream, SparseArray<C88498g.C88499a> sparseArray, int i, int i2) {
        try {
            int readByte = dataInputStream.readByte();
            if (readByte < 0) {
                return 0;
            }
            int[] iArr = new int[readByte];
            int[] iArr2 = new int[readByte];
            int i3 = 0;
            for (int i4 = 0; i4 < readByte; i4++) {
                iArr[i4] = dataInputStream.readByte();
                iArr2[i4] = i2;
                short readShort = dataInputStream.readShort();
                i3 += readShort;
                i2 += readShort;
            }
            sparseArray.append(i, new C88498g.C88499a(i, iArr, iArr2));
            return i3;
        } catch (IOException e) {
            Log.m105921e("MicroMsg.language.StringResouces", "exception:%s", Util.stackTraceToString(e));
            return 0;
        }
    }

    /* renamed from: e */
    public String mo122971e(int i) {
        C88505l lVar = f255645c;
        if (lVar == null) {
            return null;
        }
        lVar.getClass();
        try {
            int indexOfKey = lVar.f255651a.indexOfKey(i);
            if (indexOfKey < 0) {
                return null;
            }
            int valueAt = lVar.f255651a.valueAt(indexOfKey);
            return new String(lVar.f255652b, valueAt, (indexOfKey < lVar.f255651a.size() - 1 ? lVar.f255651a.valueAt(indexOfKey + 1) : lVar.f255652b.length) - valueAt, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.m105921e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", Util.stackTraceToString(e));
            return null;
        } catch (Exception e2) {
            Log.m105921e("MicroMsg.language.StringsCollection", "[cpan] getString failed. %s", Util.stackTraceToString(e2));
            return null;
        }
    }

    /* renamed from: g */
    public boolean mo122972g() {
        return f255650h && f255649g;
    }
}
