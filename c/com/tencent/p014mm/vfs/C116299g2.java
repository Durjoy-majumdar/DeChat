package com.tencent.p014mm.vfs;

import android.net.Uri;
import android.os.Parcel;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.FileSystem;
import com.tencent.stubs.logger.Log;
import com.tencent.xweb.file.XVFSFile;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import qp3.C118196a;
import qp3.C118201e;

/* renamed from: com.tencent.mm.vfs.g2 */
public final class C116299g2 {

    /* renamed from: a */
    public static final Pattern f349012a = Pattern.compile("([0-9.]+)\\s*([A-Za-z]*)");

    /* renamed from: b */
    public static final Pattern f349013b = Pattern.compile("\\s*,\\s*");

    /* renamed from: com.tencent.mm.vfs.g2$d */
    public static class C57869d extends RuntimeException {
        public C57869d(Class<?> cls, int i, int i2) {
            super("Version mismatch when unmarhelling " + cls.getName() + " (" + i2 + " expected, " + i + " got");
        }
    }

    /* renamed from: com.tencent.mm.vfs.g2$a */
    public class C86005a implements C118196a.C89789a<FileSystem.C85995c, FileSystem.C85995c> {

        /* renamed from: a */
        public final /* synthetic */ C86006b f250479a;

        public C86005a(C86006b bVar) {
            this.f250479a = bVar;
        }

        /* renamed from: a */
        public Iterable mo119949a(Object obj) {
            FileSystem.C85995c cVar = (FileSystem.C85995c) obj;
            Set singleton = Collections.singleton(cVar);
            if (!(cVar instanceof FileSystem.C85994b)) {
                return singleton;
            }
            C86006b bVar = this.f250479a;
            if (bVar != null && !bVar.accept(cVar)) {
                return singleton;
            }
            return new C118201e(singleton, new C118196a(((FileSystem.C85994b) cVar).mo119931j(), this));
        }
    }

    /* renamed from: com.tencent.mm.vfs.g2$b */
    public interface C86006b<T> {
        boolean accept(T t);
    }

    /* renamed from: com.tencent.mm.vfs.g2$c */
    public static final class C86007c implements C118196a.C89789a<C86001b0, C86001b0> {

        /* renamed from: a */
        public final FileSystem.C85995c f250480a;

        /* renamed from: b */
        public final boolean f250481b;

        /* renamed from: c */
        public final C86006b<C86001b0> f250482c;

        /* renamed from: d */
        public final C86001b0[] f250483d;

        /* renamed from: e */
        public final List<C86001b0> f250484e;

        public C86007c(FileSystem.C85995c cVar, boolean z, C86006b<C86001b0> bVar) {
            this.f250480a = cVar;
            this.f250481b = z;
            this.f250482c = bVar;
            C86001b0[] b0VarArr = new C86001b0[1];
            this.f250483d = b0VarArr;
            this.f250484e = Arrays.asList(b0VarArr);
        }

        /* renamed from: a */
        public Iterable mo119949a(Object obj) {
            C86001b0 b0Var = (C86001b0) obj;
            this.f250483d[0] = b0Var;
            if (!b0Var.f250476f) {
                return this.f250484e;
            }
            C86006b<C86001b0> bVar = this.f250482c;
            if (!(bVar == null || bVar.accept(b0Var))) {
                return this.f250484e;
            }
            Iterable<C86001b0> list = this.f250480a.list(b0Var.f250471a);
            if (list == null) {
                return this.f250484e;
            }
            C118196a aVar = new C118196a(list, this);
            Set singleton = Collections.singleton(b0Var);
            return this.f250481b ? new C118201e(aVar, singleton) : new C118201e(singleton, aVar);
        }
    }

    static {
        Pattern.compile("\\$\\{([A-Za-z0-9_]+)\\}");
    }

    /* renamed from: a */
    public static void m163845a(Parcel parcel, Class<? extends FileSystem> cls, int i) {
        int hashCode = i ^ cls.getName().hashCode();
        int readInt = parcel.readInt();
        if (readInt != hashCode) {
            throw new C57869d(cls, readInt, hashCode);
        }
    }

    /* renamed from: b */
    public static Iterable<FileSystem.C85995c> m163846b(FileSystem.C85995c cVar, C86006b<FileSystem.C85995c> bVar) {
        return !(cVar instanceof FileSystem.C85994b) ? Collections.emptyList() : new C118196a(((FileSystem.C85994b) cVar).mo119931j(), new C86005a(bVar));
    }

    /* renamed from: c */
    public static void m163847c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.m106513w("VFS.Utils", "Failed to close object: " + e.toString());
            }
        }
    }

    /* renamed from: d */
    public static String m163848d(Map<String, Object> map, String str) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof String[]) {
            return ((String[]) obj)[0];
        }
        return null;
    }

    /* renamed from: e */
    public static boolean m163849e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static String m163850f(long j) {
        if (j >= 1073741824) {
            return String.format("%.1f GB", new Object[]{Double.valueOf((((double) j) * 1.0d) / 1.073741824E9d)});
        } else if (j >= 1048576) {
            return String.format("%.1f MB", new Object[]{Double.valueOf((((double) j) * 1.0d) / 1048576.0d)});
        } else if (j >= 1024) {
            return String.format("%.0f KB", new Object[]{Double.valueOf((((double) j) * 1.0d) / 1024.0d)});
        } else {
            return String.format("%d Bytes", new Object[]{Long.valueOf(j)});
        }
    }

    /* renamed from: g */
    public static String m163851g(long j) {
        if (j >= 86400000) {
            return String.format("%.1f days", new Object[]{Double.valueOf((((double) j) * 1.0d) / 8.64E7d)});
        } else if (j >= 3600000) {
            return String.format("%.1f hr", new Object[]{Double.valueOf((((double) j) * 1.0d) / 3600000.0d)});
        } else if (j >= 60000) {
            return String.format("%.1f min", new Object[]{Double.valueOf((((double) j) * 1.0d) / 60000.0d)});
        } else if (j >= 1000) {
            return String.format("%.1f s", new Object[]{Double.valueOf((((double) j) * 1.0d) / 1000.0d)});
        } else {
            return String.format("%d ms", new Object[]{Long.valueOf(j)});
        }
    }

    /* renamed from: h */
    public static String m163852h(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf <= 0) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: i */
    public static long m163853i(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        File file = C116281f0.C116289i.f348994a.f348970q;
        return new File(file, str + ".timestamp").lastModified();
    }

    /* renamed from: j */
    public static <T> List<T> m163854j(Iterable<? extends T> iterable) {
        if (iterable == null) {
            return null;
        }
        if (iterable instanceof List) {
            return (List) iterable;
        }
        ArrayList arrayList = new ArrayList();
        for (Object add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: k */
    public static String m163855k(String str, boolean z, boolean z2) {
        if (str.isEmpty()) {
            return str;
        }
        int startsWith = str.startsWith("/");
        if (str.endsWith("/") && str.length() > 1) {
            str = str.substring(0, str.length() - 1);
        }
        ArrayList arrayList = new ArrayList();
        int i = startsWith;
        boolean z3 = true;
        while (true) {
            int indexOf = str.indexOf(47, i);
            if (indexOf < 0) {
                break;
            }
            String substring = str.substring(i, indexOf);
            if (!z || !"..".equals(substring)) {
                if ((!z || !".".equals(substring)) && !substring.isEmpty()) {
                    arrayList.add(substring);
                    i = indexOf + 1;
                }
            } else if (!arrayList.isEmpty()) {
                arrayList.remove(arrayList.size() - 1);
            }
            z3 = false;
            i = indexOf + 1;
        }
        if (z3) {
            return z2 ? str.substring(startsWith) : str;
        }
        if (i < str.length()) {
            arrayList.add(str.substring(i));
        }
        StringBuilder sb = new StringBuilder();
        if (!z2 && startsWith > 0) {
            sb.append(XVFSFile.SEPARATOR_CHAR);
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            sb.append(it.next());
            while (it.hasNext()) {
                sb.append(XVFSFile.SEPARATOR_CHAR);
                sb.append(it.next());
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0099 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a5  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m163856l(java.lang.String r7, long r8) {
        /*
            if (r7 != 0) goto L_0x0003
            return r8
        L_0x0003:
            java.util.regex.Pattern r0 = f349012a
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.find()
            if (r0 != 0) goto L_0x0010
            return r8
        L_0x0010:
            r0 = 1
            java.lang.String r1 = r7.group(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            r3 = 2
            java.lang.String r7 = r7.group(r3)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            r4 = -1
            int r5 = r7.hashCode()     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            if (r5 == 0) goto L_0x008b
            r6 = 98
            if (r5 == r6) goto L_0x0082
            r0 = 103(0x67, float:1.44E-43)
            if (r5 == r0) goto L_0x0078
            r0 = 107(0x6b, float:1.5E-43)
            if (r5 == r0) goto L_0x006e
            r0 = 109(0x6d, float:1.53E-43)
            if (r5 == r0) goto L_0x0064
            r0 = 3291(0xcdb, float:4.612E-42)
            if (r5 == r0) goto L_0x005a
            r0 = 3415(0xd57, float:4.785E-42)
            if (r5 == r0) goto L_0x0050
            r0 = 3477(0xd95, float:4.872E-42)
            if (r5 == r0) goto L_0x0046
            goto L_0x0095
        L_0x0046:
            java.lang.String r0 = "mb"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            if (r7 == 0) goto L_0x0095
            r0 = 5
            goto L_0x0096
        L_0x0050:
            java.lang.String r0 = "kb"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            if (r7 == 0) goto L_0x0095
            r0 = 3
            goto L_0x0096
        L_0x005a:
            java.lang.String r0 = "gb"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            if (r7 == 0) goto L_0x0095
            r0 = 7
            goto L_0x0096
        L_0x0064:
            java.lang.String r0 = "m"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            if (r7 == 0) goto L_0x0095
            r0 = 4
            goto L_0x0096
        L_0x006e:
            java.lang.String r0 = "k"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            if (r7 == 0) goto L_0x0095
            r0 = 2
            goto L_0x0096
        L_0x0078:
            java.lang.String r0 = "g"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            if (r7 == 0) goto L_0x0095
            r0 = 6
            goto L_0x0096
        L_0x0082:
            java.lang.String r3 = "b"
            boolean r7 = r7.equals(r3)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            if (r7 == 0) goto L_0x0095
            goto L_0x0096
        L_0x008b:
            java.lang.String r0 = ""
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00ac }
            if (r7 == 0) goto L_0x0095
            r0 = 0
            goto L_0x0096
        L_0x0095:
            r0 = -1
        L_0x0096:
            switch(r0) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x00a5;
                case 2: goto L_0x00a2;
                case 3: goto L_0x00a2;
                case 4: goto L_0x009e;
                case 5: goto L_0x009e;
                case 6: goto L_0x009a;
                case 7: goto L_0x009a;
                default: goto L_0x0099;
            }
        L_0x0099:
            return r8
        L_0x009a:
            r7 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x00a7
        L_0x009e:
            r7 = 1048576(0x100000, double:5.180654E-318)
            goto L_0x00a7
        L_0x00a2:
            r7 = 1024(0x400, double:5.06E-321)
            goto L_0x00a7
        L_0x00a5:
            r7 = 1
        L_0x00a7:
            double r7 = (double) r7
            double r1 = r1 * r7
            long r7 = (long) r1
            return r7
        L_0x00ac:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C116299g2.m163856l(java.lang.String, long):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cb  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m163857m(java.lang.String r7, long r8) {
        /*
            if (r7 != 0) goto L_0x0003
            return r8
        L_0x0003:
            java.util.regex.Pattern r0 = f349012a
            java.util.regex.Matcher r7 = r0.matcher(r7)
            boolean r0 = r7.find()
            if (r0 != 0) goto L_0x0010
            return r8
        L_0x0010:
            r0 = 1
            java.lang.String r1 = r7.group(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            r3 = 2
            java.lang.String r7 = r7.group(r3)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            java.lang.String r7 = r7.toLowerCase()     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            r4 = -1
            int r5 = r7.hashCode()     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            if (r5 == 0) goto L_0x00ad
            r6 = 100
            if (r5 == r6) goto L_0x00a2
            r6 = 104(0x68, float:1.46E-43)
            if (r5 == r6) goto L_0x0098
            r6 = 109(0x6d, float:1.53E-43)
            if (r5 == r6) goto L_0x008e
            r6 = 115(0x73, float:1.61E-43)
            if (r5 == r6) goto L_0x0084
            r3 = 3338(0xd0a, float:4.678E-42)
            if (r5 == r3) goto L_0x007a
            r3 = 3494(0xda6, float:4.896E-42)
            if (r5 == r3) goto L_0x0071
            r0 = 99228(0x1839c, float:1.39048E-40)
            if (r5 == r0) goto L_0x0066
            r0 = 108114(0x1a652, float:1.515E-40)
            if (r5 == r0) goto L_0x005c
            r0 = 113745(0x1bc51, float:1.5939E-40)
            if (r5 == r0) goto L_0x0052
            goto L_0x00b7
        L_0x0052:
            java.lang.String r0 = "sec"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            if (r7 == 0) goto L_0x00b7
            r0 = 3
            goto L_0x00b8
        L_0x005c:
            java.lang.String r0 = "min"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            if (r7 == 0) goto L_0x00b7
            r0 = 5
            goto L_0x00b8
        L_0x0066:
            java.lang.String r0 = "day"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            if (r7 == 0) goto L_0x00b7
            r0 = 9
            goto L_0x00b8
        L_0x0071:
            java.lang.String r3 = "ms"
            boolean r7 = r7.equals(r3)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            if (r7 == 0) goto L_0x00b7
            goto L_0x00b8
        L_0x007a:
            java.lang.String r0 = "hr"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            if (r7 == 0) goto L_0x00b7
            r0 = 7
            goto L_0x00b8
        L_0x0084:
            java.lang.String r0 = "s"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            if (r7 == 0) goto L_0x00b7
            r0 = 2
            goto L_0x00b8
        L_0x008e:
            java.lang.String r0 = "m"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            if (r7 == 0) goto L_0x00b7
            r0 = 4
            goto L_0x00b8
        L_0x0098:
            java.lang.String r0 = "h"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            if (r7 == 0) goto L_0x00b7
            r0 = 6
            goto L_0x00b8
        L_0x00a2:
            java.lang.String r0 = "d"
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            if (r7 == 0) goto L_0x00b7
            r0 = 8
            goto L_0x00b8
        L_0x00ad:
            java.lang.String r0 = ""
            boolean r7 = r7.equals(r0)     // Catch:{ NullPointerException | NumberFormatException -> 0x00d2 }
            if (r7 == 0) goto L_0x00b7
            r0 = 0
            goto L_0x00b8
        L_0x00b7:
            r0 = -1
        L_0x00b8:
            switch(r0) {
                case 0: goto L_0x00cb;
                case 1: goto L_0x00cb;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00c8;
                case 4: goto L_0x00c4;
                case 5: goto L_0x00c4;
                case 6: goto L_0x00c0;
                case 7: goto L_0x00c0;
                case 8: goto L_0x00bc;
                case 9: goto L_0x00bc;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            return r8
        L_0x00bc:
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L_0x00cd
        L_0x00c0:
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L_0x00cd
        L_0x00c4:
            r7 = 60000(0xea60, double:2.9644E-319)
            goto L_0x00cd
        L_0x00c8:
            r7 = 1000(0x3e8, double:4.94E-321)
            goto L_0x00cd
        L_0x00cb:
            r7 = 1
        L_0x00cd:
            double r7 = (double) r7
            double r1 = r1 * r7
            long r7 = (long) r1
            return r7
        L_0x00d2:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.vfs.C116299g2.m163857m(java.lang.String, long):long");
    }

    /* renamed from: n */
    public static Uri m163858n(String str) {
        Uri.Builder builder = new Uri.Builder();
        if (str.isEmpty() || str.charAt(0) == '/') {
            return builder.path(str).build();
        }
        int indexOf = str.indexOf(58);
        if (indexOf < 0) {
            builder.path(str);
        } else {
            builder.scheme(str.substring(0, indexOf));
            int length = str.length();
            int i = indexOf + 2;
            if (length > i && str.charAt(indexOf + 1) == '/' && str.charAt(i) == '/') {
                int i2 = indexOf + 3;
                int i3 = i2;
                while (i3 < length) {
                    char charAt = str.charAt(i3);
                    if (charAt == '#' || charAt == '/' || charAt == '?') {
                        break;
                    }
                    i3++;
                }
                builder.authority(str.substring(i2, i3));
                if (i3 < length) {
                    builder.path(str.substring(i3 + 1));
                }
            } else {
                builder.path(str.substring(indexOf + 1));
            }
        }
        return builder.build();
    }

    /* renamed from: o */
    public static Iterable<C86001b0> m163859o(FileSystem.C85995c cVar, String str) {
        return m163860p(cVar, str, false, (C86006b<C86001b0>) null);
    }

    /* renamed from: p */
    public static Iterable<C86001b0> m163860p(FileSystem.C85995c cVar, String str, boolean z, C86006b<C86001b0> bVar) {
        Iterable<C86001b0> list = cVar.list(str);
        if (list == null) {
            return null;
        }
        return new C118196a(list, new C86007c(cVar, z, bVar));
    }

    /* renamed from: q */
    public static FileSystem.C85995c m163861q(FileSystem.C85995c cVar, String str, int i) {
        while (cVar instanceof C116309m) {
            cVar = ((C116309m) cVar).mo119927H(str, i);
        }
        return cVar;
    }

    /* renamed from: r */
    public static String m163862r(Uri uri, boolean z) {
        C116281f0.C116288h l = C116281f0.C116289i.f348994a.mo177799l(uri, (C116281f0.C116288h) null);
        if (l.mo177810a() && (l.f348991a.mo119936f() & 2) != 0) {
            return l.f348991a.mo119947w(l.f348992b, z);
        }
        return null;
    }

    /* renamed from: s */
    public static long m163863s(String str) {
        return System.currentTimeMillis() - m163853i(str);
    }

    /* renamed from: t */
    public static void m163864t(String str) {
        if (str != null && !str.isEmpty()) {
            File file = C116281f0.C116289i.f348994a.f348970q;
            File file2 = new File(file, str + ".timestamp");
            try {
                file2.createNewFile();
                file2.setLastModified(System.currentTimeMillis());
            } catch (IOException e) {
                Log.m106515w("VFS.Utils", (Throwable) e, "Unable to update timestamp: " + str);
            }
        }
    }

    /* renamed from: u */
    public static String m163865u(Uri uri) {
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null && !scheme.isEmpty()) {
            sb.append(scheme);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
        }
        String authority = uri.getAuthority();
        if (authority != null && !authority.isEmpty()) {
            sb.append("//");
            sb.append(authority);
        }
        String path = uri.getPath();
        if (path != null) {
            sb.append(path);
        }
        return sb.toString();
    }

    /* renamed from: v */
    public static void m163866v(Parcel parcel, Class<? extends FileSystem> cls, int i) {
        parcel.writeInt(cls.getName().hashCode() ^ i);
    }
}
