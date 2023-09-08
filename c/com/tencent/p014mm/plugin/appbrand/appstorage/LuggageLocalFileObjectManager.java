package com.tencent.p014mm.plugin.appbrand.appstorage;

import android.net.Uri;
import android.system.ErrnoException;
import com.tencent.p014mm.plugin.appbrand.utils.C84744h2;
import com.tencent.p014mm.sdk.platformtools.FilePathGenerator;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.system.MimeTypeUtil;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86001b0;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import op3.C117882j;
import s24.C90124b;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager */
public final class LuggageLocalFileObjectManager {

    /* renamed from: e */
    public static final C86011o1 f238919e = new C81404a();

    /* renamed from: f */
    public static final C81433r0 f238920f = new C81406c();

    /* renamed from: a */
    public final String f238921a;

    /* renamed from: b */
    public final String f238922b;

    /* renamed from: c */
    public final String f238923c;

    /* renamed from: d */
    public final Collection<C81407d> f238924d;

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$a */
    public class C81404a implements C86011o1 {
        public boolean accept(C86009m1 m1Var) {
            return LuggageLocalFileObjectManager.m99850g(m1Var, "store_", true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$b */
    public class C81405b implements C86011o1 {
        public C81405b() {
        }

        public boolean accept(C86009m1 m1Var) {
            return LuggageLocalFileObjectManager.this.mo113721h(m1Var, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$c */
    public class C81406c extends C81433r0 {
        public String toString() {
            return "AppBrandLocalMediaObject::Nil";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$d */
    public interface C81407d {
        /* renamed from: a */
        C117882j mo113725a(String str, String str2);

        /* renamed from: b */
        C81433r0 mo113726b(String str);

        /* renamed from: c */
        C81433r0 mo113727c(C81433r0 r0Var);

        /* renamed from: d */
        C81433r0 mo113728d(String str);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$e */
    public final class C81408e implements C81407d {
        public C81408e(C81404a aVar) {
        }

        /* renamed from: a */
        public C117882j mo113725a(String str, String str2) {
            String str3;
            String str4;
            if (Util.isNullOrNil(str2)) {
                LuggageLocalFileObjectManager luggageLocalFileObjectManager = LuggageLocalFileObjectManager.this;
                C86011o1 o1Var = LuggageLocalFileObjectManager.f238919e;
                luggageLocalFileObjectManager.getClass();
                str2 = "unknown";
            }
            try {
                String format = String.format(Locale.US, "%d|%s", new Object[]{Long.valueOf(LuggageLocalFileObjectManager.m99849b(LuggageLocalFileObjectManager.this, str)), str2});
                try {
                    Log.m105919d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "hy: attach media obj: %s", format);
                    LuggageLocalFileObjectManager luggageLocalFileObjectManager2 = LuggageLocalFileObjectManager.this;
                    String str5 = luggageLocalFileObjectManager2.f238922b;
                    luggageLocalFileObjectManager2.getClass();
                    str3 = Util.encodeHexString(new C84744h2().mo117466d(format.getBytes(), str5.getBytes()));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e, "attachMediaObject, enc exp = ", new Object[0]);
                    str3 = null;
                }
                if (Util.isNullOrNil(str3)) {
                    return null;
                }
                String str6 = "tmp_" + str3;
                String str7 = LuggageLocalFileObjectManager.this.mo113719f() + str6;
                StringBuilder sb = new StringBuilder();
                sb.append(LuggageLocalFileObjectManager.this.f238923c);
                sb.append(str6);
                if (Util.isNullOrNil(str2)) {
                    str4 = "";
                } else {
                    str4 = '.' + str2;
                }
                sb.append(str4);
                String sb4 = sb.toString();
                Log.m105919d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, return localId = %s, filePath = %s", sb4, str7);
                return C117882j.m166285d(sb4, str7, str2);
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "attachMediaObject, get crc exp = %s", Util.stackTraceToString(e2));
                return null;
            }
        }

        /* renamed from: b */
        public C81433r0 mo113726b(String str) {
            String str2;
            String[] split;
            String str3 = "";
            String replaceFirst = str.replaceFirst("store_", str3).replaceFirst("tmp_", str3);
            try {
                LuggageLocalFileObjectManager luggageLocalFileObjectManager = LuggageLocalFileObjectManager.this;
                str2 = LuggageLocalFileObjectManager.m99848a(luggageLocalFileObjectManager, replaceFirst, luggageLocalFileObjectManager.f238922b);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e, "retrieveMediaObjectByRealFileName, dec exp = ", new Object[0]);
                str2 = null;
            }
            if (Util.isNullOrNil(str2) || (split = str2.split("\\|")) == null || split.length != 2) {
                return null;
            }
            String str4 = split[1];
            StringBuilder sb = new StringBuilder();
            sb.append(LuggageLocalFileObjectManager.this.f238923c);
            sb.append(str);
            if (!Util.isNullOrNil(str4)) {
                str3 = "." + str4;
            }
            sb.append(str3);
            String sb4 = sb.toString();
            C81433r0 r0Var = new C81433r0();
            r0Var.f238977d = sb4;
            r0Var.f238978e = LuggageLocalFileObjectManager.this.mo113719f() + str;
            r0Var.f238979f = str.startsWith("store_");
            C86009m1 m1Var = new C86009m1(r0Var.f238978e);
            r0Var.f238981h = m1Var.mo119979q();
            r0Var.f238980g = m1Var.mo119980r();
            return r0Var;
        }

        /* renamed from: c */
        public C81433r0 mo113727c(C81433r0 r0Var) {
            if (r0Var == null) {
                return null;
            }
            String replaceFirst = r0Var.f238978e.replaceFirst("tmp_", "store_");
            try {
                if (C81409a0.m99866a(r0Var.f238978e, replaceFirst)) {
                    C81433r0 r0Var2 = new C81433r0();
                    r0Var2.f238978e = replaceFirst;
                    r0Var2.f238977d = r0Var.f238977d.replaceFirst("tmp_", "store_");
                    r0Var2.f238980g = r0Var.f238980g;
                    Uri n = C116299g2.m163858n(r0Var2.f238978e);
                    String path = n.getPath();
                    if (path != null) {
                        String k = C116299g2.m163855k(path, false, false);
                        if (!n.getPath().equals(k)) {
                            n = n.buildUpon().path(k).build();
                        }
                    }
                    C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(n, (C116281f0.C116288h) null);
                    long j = 0;
                    if (l.mo177810a()) {
                        C86001b0 q = l.f348991a.mo119945q(l.f348992b);
                        if (q != null) {
                            j = q.f250475e;
                        }
                    }
                    r0Var2.f238981h = j;
                    r0Var2.f238979f = true;
                    return r0Var2;
                }
            } catch (ErrnoException e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e, "FileMove error", new Object[0]);
            }
            return null;
        }

        /* renamed from: d */
        public C81433r0 mo113728d(String str) {
            String str2 = null;
            String str3 = "tmp_";
            if (!str.startsWith("store_") && !str.startsWith(str3)) {
                return null;
            }
            String c = C90124b.m112768c(str);
            String replaceFirst = str.replaceFirst("store_", "").replaceFirst(str3, "");
            if (!Util.isNullOrNil(c)) {
                replaceFirst = replaceFirst.replaceFirst("\\." + c, "");
            }
            if (Util.isNullOrNil(replaceFirst)) {
                return LuggageLocalFileObjectManager.f238920f;
            }
            try {
                LuggageLocalFileObjectManager luggageLocalFileObjectManager = LuggageLocalFileObjectManager.this;
                str2 = LuggageLocalFileObjectManager.m99848a(luggageLocalFileObjectManager, replaceFirst, luggageLocalFileObjectManager.f238922b);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", e, "retrieveMediaObject, decrypt exp ", new Object[0]);
            }
            if (Util.isNullOrNil(str2)) {
                Log.m105918d("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, get empty decrypted string");
                return LuggageLocalFileObjectManager.f238920f;
            }
            String[] split = str2.split("\\|");
            if (split == null || split.length != 2) {
                return LuggageLocalFileObjectManager.f238920f;
            }
            if (str.startsWith("store_")) {
                str3 = "store_";
            }
            StringBuilder sb = new StringBuilder();
            LuggageLocalFileObjectManager luggageLocalFileObjectManager2 = LuggageLocalFileObjectManager.this;
            C86011o1 o1Var = LuggageLocalFileObjectManager.f238919e;
            sb.append(luggageLocalFileObjectManager2.mo113719f());
            sb.append(str3);
            sb.append(replaceFirst);
            String sb4 = sb.toString();
            long j = Util.getLong(split[0], 0);
            String str4 = split[1];
            if (!str4.equalsIgnoreCase(c)) {
                return LuggageLocalFileObjectManager.f238920f;
            }
            try {
                long b = LuggageLocalFileObjectManager.m99849b(LuggageLocalFileObjectManager.this, sb4);
                if (j != b) {
                    Log.m105921e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, exactCRC32(%d) != fileCRC32(%d), localId(%s)", Long.valueOf(b), Long.valueOf(j), str);
                    return LuggageLocalFileObjectManager.f238920f;
                }
                C81433r0 r0Var = new C81433r0();
                r0Var.f238977d = LuggageLocalFileObjectManager.this.f238923c + str;
                r0Var.f238978e = sb4;
                MimeTypeUtil.getMimeTypeByFileExt(str4);
                r0Var.f238979f = str3.equalsIgnoreCase("store_");
                C86009m1 m1Var = new C86009m1(r0Var.f238978e);
                r0Var.f238981h = m1Var.mo119979q();
                r0Var.f238980g = m1Var.mo119980r();
                return r0Var;
            } catch (IOException e2) {
                Log.m105921e("MicroMsg.AppBrand.LocalMediaObjectManager.V2Handler", "retrieveMediaObject, getCRC exp = %s", Util.stackTraceToString(e2));
                return LuggageLocalFileObjectManager.f238920f;
            }
        }

        public String toString() {
            return "V2MediaObjectInfoHandler";
        }
    }

    public LuggageLocalFileObjectManager(String str, String str2, String str3) {
        this.f238921a = new C86009m1(str).mo119971i() + "/";
        this.f238922b = str2;
        this.f238923c = str3;
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C81408e((C81404a) null));
        this.f238924d = Collections.unmodifiableCollection(linkedList);
    }

    /* renamed from: a */
    public static String m99848a(LuggageLocalFileObjectManager luggageLocalFileObjectManager, String str, String str2) {
        luggageLocalFileObjectManager.getClass();
        byte[] b = new C84744h2().mo117464b(Util.decodeHexString(str), str2.getBytes());
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return new String(b);
    }

    /* renamed from: b */
    public static long m99849b(LuggageLocalFileObjectManager luggageLocalFileObjectManager, String str) {
        luggageLocalFileObjectManager.getClass();
        InputStream E = C86013q1.m106423E(str);
        CheckedInputStream checkedInputStream = new CheckedInputStream(E, new Adler32());
        do {
        } while (checkedInputStream.read(new byte[2048]) >= 0);
        long value = checkedInputStream.getChecksum().getValue();
        Util.qualityClose(checkedInputStream);
        Util.qualityClose(E);
        return value;
    }

    /* renamed from: g */
    public static boolean m99850g(C86009m1 m1Var, String str, boolean z) {
        return (!z || m1Var.mo119967g()) && !m1Var.mo119977o() && !Util.isNullOrNil(m1Var.getName()) && m1Var.getName().startsWith(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        if (com.tencent.p014mm.plugin.appbrand.appstorage.C81409a0.m99866a(r10, r11) != false) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0020 A[LOOP:0: B:6:0x0020->B:9:0x0030, LOOP_START, PHI: r4 
      PHI: (r4v2 op3.j) = (r4v1 op3.j), (r4v10 op3.j) binds: [B:5:0x0019, B:9:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.appstorage.C81433r0 mo113716c(java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            r9 = this;
            java.lang.Class<com.tencent.mm.plugin.appbrand.appstorage.r0> r0 = com.tencent.p014mm.plugin.appbrand.appstorage.C81433r0.class
            java.lang.String r1 = ""
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r10)
            r3 = 0
            if (r2 != 0) goto L_0x000d
            goto L_0x00c7
        L_0x000d:
            java.lang.String r2 = s24.C90124b.m112768c(r10)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r4 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r11 = r2
        L_0x0019:
            java.util.Collection<com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$d> r2 = r9.f238924d
            java.util.Iterator r2 = r2.iterator()
            r4 = r3
        L_0x0020:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0032
            java.lang.Object r4 = r2.next()
            com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$d r4 = (com.tencent.p014mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.C81407d) r4
            op3.j r4 = r4.mo113725a(r10, r11)
            if (r4 == 0) goto L_0x0020
        L_0x0032:
            r2 = 1
            java.lang.String r5 = "MicroMsg.AppBrand.LuggageLocalFileObjectManager"
            r6 = 0
            if (r4 == 0) goto L_0x00b2
            int r7 = r4.mo182597g()
            r8 = 2
            if (r7 >= r8) goto L_0x0041
            goto L_0x00b2
        L_0x0041:
            java.lang.Object r0 = r0.newInstance()     // Catch:{ Exception -> 0x00ab }
            com.tencent.mm.plugin.appbrand.appstorage.r0 r0 = (com.tencent.p014mm.plugin.appbrand.appstorage.C81433r0) r0     // Catch:{ Exception -> 0x00ab }
            java.lang.Object r7 = r4.mo182596a(r6)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00ab }
            r0.f238977d = r7     // Catch:{ Exception -> 0x00ab }
            com.tencent.p014mm.sdk.system.MimeTypeUtil.getMimeTypeByFileExt(r11)     // Catch:{ Exception -> 0x00ab }
            java.lang.Object r7 = r4.mo182596a(r2)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00ab }
            r0.f238978e = r7     // Catch:{ Exception -> 0x00ab }
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ Exception -> 0x00ab }
            if (r7 == 0) goto L_0x0066
            java.lang.String r10 = "attachCast appId %s, Null Or Nil fileFullPath"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r10)     // Catch:{ Exception -> 0x00ab }
            goto L_0x00c7
        L_0x0066:
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ Exception -> 0x00ab }
            if (r7 == 0) goto L_0x006f
            java.lang.String r11 = "unknown"
        L_0x006f:
            r7 = 3
            java.lang.Object r4 = r4.mo182596a(r7)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00ab }
            com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r11)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r11 = r0.f238978e     // Catch:{ Exception -> 0x00ab }
            if (r12 == 0) goto L_0x008a
            boolean r4 = com.tencent.p014mm.plugin.appbrand.appstorage.C81409a0.m99866a(r10, r11)     // Catch:{ ErrnoException -> 0x0084 }
            if (r4 == 0) goto L_0x008a
            goto L_0x0094
        L_0x0084:
            r4 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00ab }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r4, r1, r7)     // Catch:{ Exception -> 0x00ab }
        L_0x008a:
            if (r12 != 0) goto L_0x0093
            boolean r10 = com.tencent.p014mm.sdk.platformtools.FilesCopy.copyFile(r10, r11)     // Catch:{ Exception -> 0x00ab }
            if (r10 == 0) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            if (r2 == 0) goto L_0x00c7
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00ab }
            java.lang.String r11 = r0.f238978e     // Catch:{ Exception -> 0x00ab }
            r10.<init>((java.lang.String) r11)     // Catch:{ Exception -> 0x00ab }
            long r11 = r10.mo119980r()     // Catch:{ Exception -> 0x00ab }
            r0.f238980g = r11     // Catch:{ Exception -> 0x00ab }
            long r10 = r10.mo119979q()     // Catch:{ Exception -> 0x00ab }
            r0.f238981h = r10     // Catch:{ Exception -> 0x00ab }
            r3 = r0
            goto L_0x00c7
        L_0x00ab:
            r10 = move-exception
            java.lang.Object[] r11 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r10, r1, r11)
            goto L_0x00c7
        L_0x00b2:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            if (r4 != 0) goto L_0x00b8
            r11 = -1
            goto L_0x00bc
        L_0x00b8:
            int r11 = r4.mo182597g()
        L_0x00bc:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r6] = r11
            java.lang.String r11 = "attachCast, no handler return correct info, attach.size = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r5, r11, r10)
        L_0x00c7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.mo113716c(java.lang.String, java.lang.String, boolean):com.tencent.mm.plugin.appbrand.appstorage.r0");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x000e A[LOOP:0: B:4:0x000e->B:7:0x001e, LOOP_START, PHI: r1 
      PHI: (r1v1 com.tencent.mm.plugin.appbrand.appstorage.r0) = (r1v0 com.tencent.mm.plugin.appbrand.appstorage.r0), (r1v5 com.tencent.mm.plugin.appbrand.appstorage.r0) binds: [B:3:0x0008, B:7:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.tencent.p014mm.plugin.appbrand.appstorage.C81433r0 mo113717d(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.Collection<com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$d> r0 = r3.f238924d
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0020
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager$d r1 = (com.tencent.p014mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.C81407d) r1
            com.tencent.mm.plugin.appbrand.appstorage.r0 r1 = r1.mo113726b(r4)
            if (r1 == 0) goto L_0x000e
        L_0x0020:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.appstorage.LuggageLocalFileObjectManager.mo113717d(java.lang.String):com.tencent.mm.plugin.appbrand.appstorage.r0");
    }

    /* renamed from: e */
    public C81433r0 mo113718e(String str) {
        if (Util.isNullOrNil(str) || !str.startsWith(this.f238923c)) {
            Log.m105921e("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "getItemByLocalId, invalid args, localId(%s)", str);
            return null;
        }
        String substring = str.substring(this.f238923c.length());
        Iterator<C81407d> it = this.f238924d.iterator();
        C81433r0 r0Var = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C81407d next = it.next();
            C81433r0 d = next.mo113728d(substring);
            if (d != null) {
                Log.m105925i("MicroMsg.AppBrand.LuggageLocalFileObjectManager", "getItemByLocalId, handled by %s, result = %s", next.toString(), d);
                r0Var = d;
                break;
            }
            r0Var = d;
        }
        if (f238920f == r0Var) {
            return null;
        }
        return r0Var;
    }

    /* renamed from: f */
    public final String mo113719f() {
        FilePathGenerator.checkMkdir(this.f238921a);
        try {
            new C86009m1(this.f238921a, FilePathGenerator.NO_MEDIA_FILENAME).mo119964e();
        } catch (Exception unused) {
        }
        return this.f238921a;
    }

    public String genMediaFilePath(String str) {
        if (Util.isNullOrNil(str)) {
            return null;
        }
        return mo113719f() + str;
    }

    /* renamed from: h */
    public boolean mo113721h(C86009m1 m1Var, boolean z) {
        Uri n = C116299g2.m163858n(mo113719f());
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        return n.equals(new C86009m1(m1Var.mo119973k()).f250486d) && m99850g(m1Var, "store_", z);
    }

    /* renamed from: i */
    public List<C81433r0> mo113722i() {
        C86009m1[] j = mo113723j();
        if (j == null || j.length <= 0) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        for (C86009m1 name : j) {
            C81433r0 d = mo113717d(name.getName());
            if (d != null) {
                linkedList.add(d);
            }
        }
        return linkedList;
    }

    /* renamed from: j */
    public C86009m1[] mo113723j() {
        C86009m1 m1Var = new C86009m1(mo113719f());
        if (!m1Var.mo119967g() || !m1Var.mo119977o()) {
            return null;
        }
        return m1Var.mo119985v(new C81405b());
    }
}
