package p206nj;

import android.content.Context;
import android.net.LocalServerSocket;
import android.os.Build;
import android.os.Process;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.io.Closeable;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: nj.l */
public final class C88957l {

    /* renamed from: a */
    public static final Set<String> f256532a = new TreeSet();

    /* renamed from: b */
    public static final List<C88959b> f256533b = new ArrayList();

    /* renamed from: c */
    public static final Map<String, boolean[]> f256534c = new HashMap(64);

    /* renamed from: d */
    public static final C88958a f256535d = new C88958a("load-lib-spin");

    /* renamed from: e */
    public static final Pattern f256536e = Pattern.compile("lib([^\\s/]+?)\\.so");

    /* renamed from: f */
    public static final Method[] f256537f = {null};

    /* renamed from: g */
    public static final Boolean[] f256538g = {null};

    /* renamed from: h */
    public static final String[] f256539h = {null};

    /* renamed from: i */
    public static final ThreadLocal<Boolean> f256540i = new ThreadLocal<>();

    /* renamed from: j */
    public static final ThreadLocal<Boolean> f256541j = new ThreadLocal<>();

    /* renamed from: nj.l$a */
    public static final class C88958a {

        /* renamed from: a */
        public final String f256542a;

        /* renamed from: b */
        public volatile int f256543b = 0;

        /* renamed from: c */
        public LocalServerSocket f256544c = null;

        public C88958a(String str) {
            this.f256542a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0035 */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo123341a() {
            /*
                r3 = this;
                monitor-enter(r3)
                android.net.LocalServerSocket r0 = r3.f256544c     // Catch:{ all -> 0x003b }
                if (r0 == 0) goto L_0x000d
                int r0 = r3.f256543b     // Catch:{ all -> 0x003b }
                int r0 = r0 + 1
                r3.f256543b = r0     // Catch:{ all -> 0x003b }
                monitor-exit(r3)
                return
            L_0x000d:
                android.net.LocalServerSocket r0 = new android.net.LocalServerSocket     // Catch:{ all -> 0x0030 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
                r1.<init>()     // Catch:{ all -> 0x0030 }
                java.lang.String r2 = r3.f256542a     // Catch:{ all -> 0x0030 }
                r1.append(r2)     // Catch:{ all -> 0x0030 }
                int r2 = android.os.Process.myUid()     // Catch:{ all -> 0x0030 }
                r1.append(r2)     // Catch:{ all -> 0x0030 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0030 }
                r0.<init>(r1)     // Catch:{ all -> 0x0030 }
                r3.f256544c = r0     // Catch:{ all -> 0x0030 }
                int r0 = r3.f256543b     // Catch:{ all -> 0x0030 }
                int r0 = r0 + 1
                r3.f256543b = r0     // Catch:{ all -> 0x0030 }
                goto L_0x0039
            L_0x0030:
                r0 = 1
                java.lang.Thread.sleep(r0)     // Catch:{ all -> 0x0035 }
            L_0x0035:
                android.net.LocalServerSocket r0 = r3.f256544c     // Catch:{ all -> 0x003b }
                if (r0 != 0) goto L_0x000d
            L_0x0039:
                monitor-exit(r3)
                return
            L_0x003b:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p206nj.C88957l.C88958a.mo123341a():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
            return;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo123342b() {
            /*
                r1 = this;
                monitor-enter(r1)
                int r0 = r1.f256543b     // Catch:{ all -> 0x001d }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r1)
                return
            L_0x0007:
                int r0 = r1.f256543b     // Catch:{ all -> 0x001d }
                int r0 = r0 + -1
                r1.f256543b = r0     // Catch:{ all -> 0x001d }
                int r0 = r1.f256543b     // Catch:{ all -> 0x001d }
                if (r0 != 0) goto L_0x001b
                android.net.LocalServerSocket r0 = r1.f256544c     // Catch:{ all -> 0x001d }
                if (r0 == 0) goto L_0x001b
                p206nj.C88957l.m111069e(r0)     // Catch:{ all -> 0x001d }
                r0 = 0
                r1.f256544c = r0     // Catch:{ all -> 0x001d }
            L_0x001b:
                monitor-exit(r1)
                return
            L_0x001d:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p206nj.C88957l.C88958a.mo123342b():void");
        }

        public synchronized void finalize() {
            LocalServerSocket localServerSocket = this.f256544c;
            if (localServerSocket != null) {
                C88957l.m111069e(localServerSocket);
                this.f256544c = null;
            }
            super.finalize();
        }
    }

    /* renamed from: nj.l$b */
    public interface C88959b {
        /* renamed from: a */
        boolean mo123344a(String str, UnsatisfiedLinkError unsatisfiedLinkError);

        /* renamed from: b */
        void mo123345b(String str, String str2, ClassLoader classLoader);
    }

    public C88957l() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public static void m111065a(String str, UnsatisfiedLinkError unsatisfiedLinkError) {
        List<C88959b> list = f256533b;
        synchronized (list) {
            boolean z = false;
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                if (((C88959b) it.next()).mo123344a(str, unsatisfiedLinkError) && !z) {
                    z = true;
                }
            }
            if (!z) {
                throw unsatisfiedLinkError;
            }
        }
    }

    /* renamed from: b */
    public static void m111066b(String str, String str2, ClassLoader classLoader) {
        List<C88959b> list = f256533b;
        synchronized (list) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((C88959b) it.next()).mo123345b(str, str2, classLoader);
            }
        }
    }

    /* renamed from: c */
    public static void m111067c(String str) {
        Set<String> set = f256532a;
        synchronized (set) {
            ((TreeSet) set).add(str);
            m111082r(2, "MicroMsg.LoadLibrary", "[+] Prior library search path '%s' added.", str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: boolean[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m111068d(java.lang.String r3) {
        /*
            java.util.Map<java.lang.String, boolean[]> r0 = f256534c
            r1 = r0
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r3)
            boolean[] r1 = (boolean[]) r1
            r2 = 0
            if (r1 != 0) goto L_0x0023
            monitor-enter(r0)
            r1 = r0
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0021 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0021 }
            r1 = r3
            boolean[] r1 = (boolean[]) r1     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            return r2
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            goto L_0x0023
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0021 }
            throw r3
        L_0x0021:
            r3 = move-exception
            goto L_0x001f
        L_0x0023:
            monitor-enter(r1)
            boolean r3 = r1[r2]     // Catch:{ all -> 0x0028 }
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            return r3
        L_0x0028:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p206nj.C88957l.m111068d(java.lang.String):boolean");
    }

    /* renamed from: e */
    public static void m111069e(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof AutoCloseable) {
                    ((AutoCloseable) obj).close();
                } else if (obj instanceof ZipFile) {
                    ((ZipFile) obj).close();
                } else if (obj instanceof LocalServerSocket) {
                    ((LocalServerSocket) obj).close();
                } else {
                    throw new IllegalStateException(obj.getClass().getName() + " is not closeable.");
                }
            } catch (IllegalStateException e) {
                throw e;
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.io.OutputStream, java.lang.Object, java.io.BufferedOutputStream] */
    /* JADX WARNING: type inference failed for: r14v0, types: [java.io.BufferedInputStream, java.lang.Object, java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m111070f(android.content.Context r17, java.lang.String r18, java.io.File r19) {
        /*
            r0 = r18
            r1 = 0
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile     // Catch:{ all -> 0x0125 }
            android.content.pm.ApplicationInfo r3 = r17.getApplicationInfo()     // Catch:{ all -> 0x0125 }
            java.lang.String r3 = r3.sourceDir     // Catch:{ all -> 0x0125 }
            r2.<init>(r3)     // Catch:{ all -> 0x0125 }
            java.lang.String r3 = m111075k(r17, r18)     // Catch:{ all -> 0x0122 }
            if (r3 == 0) goto L_0x0106
            java.util.zip.ZipEntry r3 = r2.getEntry(r3)     // Catch:{ all -> 0x0122 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0122 }
            r5 = r19
            r4.<init>(r5, r0)     // Catch:{ all -> 0x0122 }
            boolean r5 = r4.isDirectory()     // Catch:{ all -> 0x0122 }
            r6 = 4096(0x1000, float:5.74E-42)
            r7 = 1
            java.lang.String r8 = "MicroMsg.LoadLibrary"
            r9 = 3
            r10 = 0
            if (r5 == 0) goto L_0x003d
            java.lang.String r0 = "[!] Path %s is a directory, remove it first."
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ all -> 0x0122 }
            java.lang.String r7 = r4.getAbsolutePath()     // Catch:{ all -> 0x0122 }
            r5[r10] = r7     // Catch:{ all -> 0x0122 }
            m111082r(r9, r8, r0, r5)     // Catch:{ all -> 0x0122 }
            r4.delete()     // Catch:{ all -> 0x0122 }
            goto L_0x0082
        L_0x003d:
            boolean r5 = r4.canRead()     // Catch:{ all -> 0x0122 }
            if (r5 == 0) goto L_0x0082
            long r11 = r3.getCrc()     // Catch:{ all -> 0x0122 }
            java.util.zip.CRC32 r5 = new java.util.zip.CRC32     // Catch:{ all -> 0x0122 }
            r5.<init>()     // Catch:{ all -> 0x0122 }
            byte[] r13 = new byte[r6]     // Catch:{ all -> 0x0122 }
            java.io.BufferedInputStream r14 = new java.io.BufferedInputStream     // Catch:{ all -> 0x007d }
            java.io.FileInputStream r15 = new java.io.FileInputStream     // Catch:{ all -> 0x007d }
            r15.<init>(r4)     // Catch:{ all -> 0x007d }
            r14.<init>(r15)     // Catch:{ all -> 0x007d }
        L_0x0058:
            int r15 = r14.read(r13)     // Catch:{ all -> 0x007a }
            if (r15 <= 0) goto L_0x0062
            r5.update(r13, r10, r15)     // Catch:{ all -> 0x007a }
            goto L_0x0058
        L_0x0062:
            long r15 = r5.getValue()     // Catch:{ all -> 0x007a }
            m111069e(r14)     // Catch:{ all -> 0x0122 }
            int r5 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0082
            java.lang.String r1 = "[!] CRC check of [%s] in recovery dir was passed, skip extracting."
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0122 }
            r3[r10] = r0     // Catch:{ all -> 0x0122 }
            m111082r(r9, r8, r1, r3)     // Catch:{ all -> 0x0122 }
            m111069e(r2)
            return
        L_0x007a:
            r0 = move-exception
            r1 = r14
            goto L_0x007e
        L_0x007d:
            r0 = move-exception
        L_0x007e:
            m111069e(r1)     // Catch:{ all -> 0x0122 }
            throw r0     // Catch:{ all -> 0x0122 }
        L_0x0082:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r0.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r7 = r4.getAbsolutePath()     // Catch:{ all -> 0x0122 }
            r0.append(r7)     // Catch:{ all -> 0x0122 }
            java.lang.String r7 = ".tmp"
            r0.append(r7)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0122 }
            r5.<init>(r0)     // Catch:{ all -> 0x0122 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x00f8 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x00f8 }
            r0.<init>(r5)     // Catch:{ all -> 0x00f8 }
            r7.<init>(r0)     // Catch:{ all -> 0x00f8 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00f4 }
            java.io.InputStream r0 = r2.getInputStream(r3)     // Catch:{ all -> 0x00f4 }
            r8.<init>(r0)     // Catch:{ all -> 0x00f4 }
            byte[] r0 = new byte[r6]     // Catch:{ all -> 0x00f2 }
        L_0x00b1:
            int r1 = r8.read(r0)     // Catch:{ all -> 0x00f2 }
            if (r1 <= 0) goto L_0x00bb
            r7.write(r0, r10, r1)     // Catch:{ all -> 0x00f2 }
            goto L_0x00b1
        L_0x00bb:
            m111069e(r7)     // Catch:{ all -> 0x0122 }
            m111069e(r8)     // Catch:{ all -> 0x0122 }
            boolean r0 = r5.renameTo(r4)     // Catch:{ all -> 0x0122 }
            if (r0 == 0) goto L_0x00cb
            m111069e(r2)
            return
        L_0x00cb:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = "Cannot rename "
            r1.append(r3)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r5.getAbsolutePath()     // Catch:{ all -> 0x0122 }
            r1.append(r3)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = " to "
            r1.append(r3)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r4.getAbsolutePath()     // Catch:{ all -> 0x0122 }
            r1.append(r3)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0122 }
            r0.<init>(r1)     // Catch:{ all -> 0x0122 }
            throw r0     // Catch:{ all -> 0x0122 }
        L_0x00f2:
            r0 = move-exception
            goto L_0x00f6
        L_0x00f4:
            r0 = move-exception
            r8 = r1
        L_0x00f6:
            r1 = r7
            goto L_0x00fa
        L_0x00f8:
            r0 = move-exception
            r8 = r1
        L_0x00fa:
            r5.delete()     // Catch:{ all -> 0x00fe }
            throw r0     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r0 = move-exception
            m111069e(r1)     // Catch:{ all -> 0x0122 }
            m111069e(r8)     // Catch:{ all -> 0x0122 }
            throw r0     // Catch:{ all -> 0x0122 }
        L_0x0106:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r4 = "Cannot find "
            r3.append(r4)     // Catch:{ all -> 0x0122 }
            r3.append(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = " in apk with best ABI."
            r3.append(r0)     // Catch:{ all -> 0x0122 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0122 }
            r1.<init>(r0)     // Catch:{ all -> 0x0122 }
            throw r1     // Catch:{ all -> 0x0122 }
        L_0x0122:
            r0 = move-exception
            r1 = r2
            goto L_0x0126
        L_0x0125:
            r0 = move-exception
        L_0x0126:
            m111069e(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p206nj.C88957l.m111070f(android.content.Context, java.lang.String, java.io.File):void");
    }

    /* renamed from: g */
    public static String m111071g(String str) {
        String i = m111073i(str);
        if (i != null) {
            m111082r(2, "MicroMsg.LoadLibrary", "[+] Found library [%s] at %s.", str, i);
            return i;
        }
        String h = m111072h(str, C88957l.class.getClassLoader());
        if (h != null) {
            m111082r(2, "MicroMsg.LoadLibrary", "[+] Found library [%s] at %s.", str, h);
            return h;
        }
        String j = m111074j(MMApplicationContext.getContext(), str);
        if (j != null) {
            m111082r(2, "MicroMsg.LoadLibrary", "[+] Found library [%s] at %s.", str, j);
        } else {
            m111082r(4, "MicroMsg.LoadLibrary", "[-] Fail to find library [%s].", j);
        }
        return j;
    }

    /* renamed from: h */
    public static String m111072h(String str, ClassLoader classLoader) {
        Method[] methodArr = f256537f;
        Method method = methodArr[0];
        if (method == null) {
            synchronized (methodArr) {
                method = methodArr[0];
                if (method == null) {
                    try {
                        method = ClassLoader.class.getDeclaredMethod("findLibrary", new Class[]{String.class});
                        method.setAccessible(true);
                        methodArr[0] = method;
                    } catch (Throwable th) {
                        m111083s("MicroMsg.LoadLibrary", th, "[-] Fail to reflect findLibrary method: " + classLoader, new Object[0]);
                        return null;
                    }
                }
            }
        }
        try {
            return (String) method.invoke(classLoader, new Object[]{str});
        } catch (Throwable th4) {
            m111083s("MicroMsg.LoadLibrary", th4, "[-] Fail to find library in classloader: " + classLoader, new Object[0]);
            return null;
        }
    }

    /* renamed from: i */
    public static String m111073i(String str) {
        ArrayList arrayList;
        String l = m111076l(str);
        Set<String> set = f256532a;
        synchronized (set) {
            arrayList = new ArrayList(set);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next(), l);
            if (!file.isDirectory() && file.canRead()) {
                return file.getAbsolutePath();
            }
        }
        return null;
    }

    /* renamed from: j */
    public static String m111074j(Context context, String str) {
        C88958a aVar = f256535d;
        synchronized (aVar) {
            try {
                aVar.mo123341a();
                File file = new File(context.getDir("recovery_lib", 0), m111076l(str));
                if (file.isDirectory() || !file.canRead()) {
                    aVar.mo123342b();
                    return null;
                }
                String absolutePath = file.getAbsolutePath();
                aVar.mo123342b();
                return absolutePath;
            } catch (Throwable th) {
                f256535d.mo123342b();
                throw th;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.zip.ZipFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x0071=Splitter:B:34:0x0071, B:23:0x005a=Splitter:B:23:0x005a} */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m111075k(android.content.Context r10, java.lang.String r11) {
        /*
            java.lang.String[] r0 = f256539h
            monitor-enter(r0)
            r1 = 0
            r2 = r0[r1]     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x0075
            boolean r3 = m111077m()     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x0011
            java.lang.String[] r3 = android.os.Build.SUPPORTED_64_BIT_ABIS     // Catch:{ all -> 0x0090 }
            goto L_0x0013
        L_0x0011:
            java.lang.String[] r3 = android.os.Build.SUPPORTED_32_BIT_ABIS     // Catch:{ all -> 0x0090 }
        L_0x0013:
            r4 = 0
            java.util.zip.ZipFile r5 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x006a }
            android.content.pm.ApplicationInfo r10 = r10.getApplicationInfo()     // Catch:{ IOException -> 0x006a }
            java.lang.String r10 = r10.sourceDir     // Catch:{ IOException -> 0x006a }
            r5.<init>(r10)     // Catch:{ IOException -> 0x006a }
            int r10 = r3.length     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            r7 = r4
            r6 = 0
        L_0x0022:
            if (r6 >= r10) goto L_0x004c
            r7 = r3[r6]     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            r8.<init>()     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.lang.String r9 = "lib/"
            r8.append(r9)     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            r8.append(r7)     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.lang.String r9 = "/"
            r8.append(r9)     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            r8.append(r11)     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            java.util.zip.ZipEntry r9 = r5.getEntry(r8)     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            if (r9 == 0) goto L_0x0048
            r2 = r7
            r7 = r8
            goto L_0x004c
        L_0x0048:
            int r6 = r6 + 1
            r7 = r8
            goto L_0x0022
        L_0x004c:
            if (r2 != 0) goto L_0x0059
            r10 = 4
            java.lang.String r11 = "MicroMsg.LoadLibrary"
            java.lang.String r3 = "[-] "
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            m111082r(r10, r11, r3, r6)     // Catch:{ IOException -> 0x0065, all -> 0x0062 }
            goto L_0x005a
        L_0x0059:
            r4 = r7
        L_0x005a:
            m111069e(r5)     // Catch:{ all -> 0x0090 }
            java.lang.String[] r10 = f256539h     // Catch:{ all -> 0x0090 }
            r10[r1] = r2     // Catch:{ all -> 0x0090 }
            goto L_0x008e
        L_0x0062:
            r10 = move-exception
            r4 = r5
            goto L_0x0071
        L_0x0065:
            r10 = move-exception
            r4 = r5
            goto L_0x006b
        L_0x0068:
            r10 = move-exception
            goto L_0x0071
        L_0x006a:
            r10 = move-exception
        L_0x006b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0068 }
            r11.<init>(r10)     // Catch:{ all -> 0x0068 }
            throw r11     // Catch:{ all -> 0x0068 }
        L_0x0071:
            m111069e(r4)     // Catch:{ all -> 0x0090 }
            throw r10     // Catch:{ all -> 0x0090 }
        L_0x0075:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0090 }
            r10.<init>()     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "lib/"
            r10.append(r1)     // Catch:{ all -> 0x0090 }
            r10.append(r2)     // Catch:{ all -> 0x0090 }
            java.lang.String r1 = "/"
            r10.append(r1)     // Catch:{ all -> 0x0090 }
            r10.append(r11)     // Catch:{ all -> 0x0090 }
            java.lang.String r4 = r10.toString()     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            return r4
        L_0x0090:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p206nj.C88957l.m111075k(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: l */
    public static String m111076l(String str) {
        return "lib" + str + ".so";
    }

    /* renamed from: m */
    public static boolean m111077m() {
        boolean booleanValue;
        Boolean[] boolArr = f256538g;
        synchronized (boolArr) {
            Boolean bool = boolArr[0];
            if (bool == null) {
                bool = Build.VERSION.SDK_INT >= 23 ? Boolean.valueOf(Process.is64Bit()) : Boolean.valueOf(Build.CPU_ABI.contains("64"));
                boolArr[0] = bool;
            }
            booleanValue = bool.booleanValue();
        }
        return booleanValue;
    }

    /* renamed from: n */
    public static void m111078n(String str) {
        m111079o(str, C88957l.class.getClassLoader());
    }

    /* renamed from: o */
    public static void m111079o(String str, ClassLoader classLoader) {
        ClassLoader classLoader2 = C88957l.class.getClassLoader();
        Map<String, boolean[]> map = f256534c;
        boolean[] zArr = (boolean[]) ((HashMap) map).get(str);
        if (zArr == null) {
            synchronized (map) {
                zArr = (boolean[]) ((HashMap) map).get(str);
                if (zArr == null) {
                    zArr = new boolean[]{false};
                    ((HashMap) map).put(str, zArr);
                }
            }
        }
        synchronized (zArr) {
            if (!zArr[0]) {
                m111081q(str, classLoader2);
                zArr[0] = true;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        java.lang.Thread.sleep(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        java.lang.Runtime.getRuntime().load(r1);
        m111082r(2, "MicroMsg.LoadLibrary", "[+] [RE] Library [%s] was loaded, path: %s", r9, r1);
        m111066b(r9, r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ca, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1 = new java.lang.UnsatisfiedLinkError("original crash: " + r10.getClass().getName() + com.tencent.xweb.file.XVFSFile.PATH_SEPARATOR + r10.getMessage());
        r1.setStackTrace(r10.getStackTrace());
        m111065a(r9, r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ca A[ExcHandler: all (r10v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:2:0x0003] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m111080p(java.lang.String r9, java.lang.ClassLoader r10) {
        /*
            nj.l$a r0 = f256535d
            monitor-enter(r0)
            r0.mo123341a()     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            java.lang.String r2 = m111076l(r9)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            java.lang.String r3 = "recovery_lib"
            r4 = 0
            java.io.File r3 = r1.getDir(r3, r4)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            m111070f(r1, r2, r3)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            java.lang.String r1 = m111074j(r1, r9)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            if (r1 == 0) goto L_0x00ae
            r2 = 1
            r3 = 2
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch:{ UnsatisfiedLinkError -> 0x003e, all -> 0x00ca }
            r5.load(r1)     // Catch:{ UnsatisfiedLinkError -> 0x003e, all -> 0x00ca }
            java.lang.String r5 = "MicroMsg.LoadLibrary"
            java.lang.String r6 = "[+] Library [%s] was loaded, path: %s"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ UnsatisfiedLinkError -> 0x003e, all -> 0x00ca }
            r7[r4] = r9     // Catch:{ UnsatisfiedLinkError -> 0x003e, all -> 0x00ca }
            r7[r2] = r1     // Catch:{ UnsatisfiedLinkError -> 0x003e, all -> 0x00ca }
            m111082r(r3, r5, r6, r7)     // Catch:{ UnsatisfiedLinkError -> 0x003e, all -> 0x00ca }
            m111066b(r9, r1, r10)     // Catch:{ UnsatisfiedLinkError -> 0x003e, all -> 0x00ca }
            goto L_0x0107
        L_0x003e:
            r5 = 5
            java.lang.Thread.sleep(r5)     // Catch:{ all -> 0x0043 }
        L_0x0043:
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch:{ UnsatisfiedLinkError -> 0x005c, all -> 0x00ca }
            r5.load(r1)     // Catch:{ UnsatisfiedLinkError -> 0x005c, all -> 0x00ca }
            java.lang.String r5 = "MicroMsg.LoadLibrary"
            java.lang.String r6 = "[+] [RE] Library [%s] was loaded, path: %s"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ UnsatisfiedLinkError -> 0x005c, all -> 0x00ca }
            r7[r4] = r9     // Catch:{ UnsatisfiedLinkError -> 0x005c, all -> 0x00ca }
            r7[r2] = r1     // Catch:{ UnsatisfiedLinkError -> 0x005c, all -> 0x00ca }
            m111082r(r3, r5, r6, r7)     // Catch:{ UnsatisfiedLinkError -> 0x005c, all -> 0x00ca }
            m111066b(r9, r1, r10)     // Catch:{ UnsatisfiedLinkError -> 0x005c, all -> 0x00ca }
            goto L_0x0107
        L_0x005c:
            r5 = move-exception
            java.lang.String r6 = "MicroMsg.LoadLibrary"
            java.lang.String r7 = "[-] [RE] Failure, try to recovery depend lib recursively."
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            m111083s(r6, r5, r7, r8)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            java.lang.String r6 = r5.getMessage()     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            r8 = 0
            if (r7 == 0) goto L_0x0072
            goto L_0x008a
        L_0x0072:
            java.util.regex.Pattern r7 = f256536e     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            java.util.regex.Matcher r6 = r7.matcher(r6)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            boolean r7 = r6.find()     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            if (r7 == 0) goto L_0x008a
            java.lang.String r6 = r6.group(r2)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            if (r7 == 0) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r8 = r6
        L_0x008a:
            if (r8 == 0) goto L_0x00ad
            boolean r6 = r8.equals(r9)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            if (r6 != 0) goto L_0x00ad
            m111080p(r8, r10)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            r5.load(r1)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            java.lang.String r5 = "MicroMsg.LoadLibrary"
            java.lang.String r6 = "[+] [RE] Library [%s] was loaded, path: %s"
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            r7[r4] = r9     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            r7[r2] = r1     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            m111082r(r3, r5, r6, r7)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            m111066b(r9, r1, r10)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            goto L_0x0107
        L_0x00ad:
            throw r5     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
        L_0x00ae:
            java.lang.UnsatisfiedLinkError r10 = new java.lang.UnsatisfiedLinkError     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            r1.<init>()     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            java.lang.String r2 = "Cannot find ["
            r1.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            r1.append(r9)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            java.lang.String r2 = "] in recovery dir."
            r1.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            java.lang.String r1 = r1.toString()     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            r10.<init>(r1)     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
            throw r10     // Catch:{ UnsatisfiedLinkError -> 0x00cc, all -> 0x00ca }
        L_0x00ca:
            r10 = move-exception
            goto L_0x00ce
        L_0x00cc:
            r10 = move-exception
            goto L_0x0104
        L_0x00ce:
            java.lang.UnsatisfiedLinkError r1 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r2.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = "original crash: "
            r2.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.Class r3 = r10.getClass()     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x0110 }
            r2.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = ":"
            r2.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r10.getMessage()     // Catch:{ all -> 0x0110 }
            r2.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0110 }
            r1.<init>(r2)     // Catch:{ all -> 0x0110 }
            java.lang.StackTraceElement[] r10 = r10.getStackTrace()     // Catch:{ all -> 0x0110 }
            r1.setStackTrace(r10)     // Catch:{ all -> 0x0110 }
            m111065a(r9, r1)     // Catch:{ all -> 0x0110 }
            goto L_0x0107
        L_0x0104:
            m111065a(r9, r10)     // Catch:{ all -> 0x0110 }
        L_0x0107:
            nj.l$a r9 = f256535d     // Catch:{ all -> 0x010e }
            r9.mo123342b()     // Catch:{ all -> 0x010e }
            monitor-exit(r0)     // Catch:{ all -> 0x010e }
            return
        L_0x010e:
            r9 = move-exception
            goto L_0x0117
        L_0x0110:
            r9 = move-exception
            nj.l$a r10 = f256535d     // Catch:{ all -> 0x010e }
            r10.mo123342b()     // Catch:{ all -> 0x010e }
            throw r9     // Catch:{ all -> 0x010e }
        L_0x0117:
            monitor-exit(r0)     // Catch:{ all -> 0x010e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p206nj.C88957l.m111080p(java.lang.String, java.lang.ClassLoader):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006a */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m111081q(java.lang.String r17, java.lang.ClassLoader r18) {
        /*
            r1 = r17
            r2 = r18
            java.lang.String r0 = m111073i(r17)
            java.lang.String r3 = "[+] Library [%s] was loaded, path: %s"
            java.lang.String r4 = "[+] [RE] Library [%s] was loaded, path: %s"
            r5 = 1
            java.lang.String r6 = "MicroMsg.LoadLibrary"
            r7 = 0
            r8 = 2
            if (r0 == 0) goto L_0x0040
            java.lang.Runtime r9 = java.lang.Runtime.getRuntime()     // Catch:{ UnsatisfiedLinkError -> 0x0027 }
            r9.load(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0027 }
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ UnsatisfiedLinkError -> 0x0027 }
            r9[r7] = r1     // Catch:{ UnsatisfiedLinkError -> 0x0027 }
            r9[r5] = r0     // Catch:{ UnsatisfiedLinkError -> 0x0027 }
            m111082r(r8, r6, r3, r9)     // Catch:{ UnsatisfiedLinkError -> 0x0027 }
            m111066b(r1, r0, r2)     // Catch:{ UnsatisfiedLinkError -> 0x0027 }
            return
        L_0x0027:
            r9 = 50
            java.lang.Thread.sleep(r9)     // Catch:{ all -> 0x002c }
        L_0x002c:
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()
            r3.load(r0)
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r1
            r3[r5] = r0
            m111082r(r8, r6, r4, r3)
            m111066b(r1, r0, r2)
            return
        L_0x0040:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r7] = r1
            r0[r5] = r2
            java.lang.String r9 = "[+] Try to load library [%s] with cl: %s"
            m111082r(r8, r6, r9, r0)
            java.lang.String r0 = m111072h(r17, r18)
            if (r0 == 0) goto L_0x007e
            java.lang.Runtime r9 = java.lang.Runtime.getRuntime()     // Catch:{ UnsatisfiedLinkError -> 0x0065 }
            r9.load(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0065 }
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ UnsatisfiedLinkError -> 0x0065 }
            r9[r7] = r1     // Catch:{ UnsatisfiedLinkError -> 0x0065 }
            r9[r5] = r0     // Catch:{ UnsatisfiedLinkError -> 0x0065 }
            m111082r(r8, r6, r3, r9)     // Catch:{ UnsatisfiedLinkError -> 0x0065 }
            m111066b(r1, r0, r2)     // Catch:{ UnsatisfiedLinkError -> 0x0065 }
            return
        L_0x0065:
            r9 = 5
            java.lang.Thread.sleep(r9)     // Catch:{ all -> 0x006a }
        L_0x006a:
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ UnsatisfiedLinkError -> 0x0086 }
            r3.load(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0086 }
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ UnsatisfiedLinkError -> 0x0086 }
            r3[r7] = r1     // Catch:{ UnsatisfiedLinkError -> 0x0086 }
            r3[r5] = r0     // Catch:{ UnsatisfiedLinkError -> 0x0086 }
            m111082r(r8, r6, r4, r3)     // Catch:{ UnsatisfiedLinkError -> 0x0086 }
            m111066b(r1, r0, r2)     // Catch:{ UnsatisfiedLinkError -> 0x0086 }
            return
        L_0x007e:
            r0 = 4
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r4 = "[-] Fail to find library path"
            m111082r(r0, r6, r4, r3)
        L_0x0086:
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r3 = "[=] Try to load library with other ways"
            m111082r(r8, r6, r3, r0)
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r3 = "[+] Try to load with usual System API"
            m111082r(r8, r6, r3, r0)
            k20.a r0 = new k20.a     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            r0.mo10233c(r1)     // Catch:{ all -> 0x00cf }
            java.lang.Object r3 = new java.lang.Object     // Catch:{ all -> 0x00cf }
            r3.<init>()     // Catch:{ all -> 0x00cf }
            java.lang.Object[] r10 = r0.mo10232b()     // Catch:{ all -> 0x00cf }
            java.lang.String r11 = "com/tencent/mm/compatible/util/LoadLibrary"
            java.lang.String r12 = "loadImpl"
            java.lang.String r13 = "(Ljava/lang/String;Ljava/lang/ClassLoader;)V"
            java.lang.String r14 = "java/lang/System_EXEC_"
            java.lang.String r15 = "loadLibrary"
            java.lang.String r16 = "(Ljava/lang/String;)V"
            r9 = r3
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = r0.mo10231a(r7)     // Catch:{ all -> 0x00cf }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00cf }
            java.lang.System.loadLibrary(r0)     // Catch:{ all -> 0x00cf }
            java.lang.String r10 = "com/tencent/mm/compatible/util/LoadLibrary"
            java.lang.String r11 = "loadImpl"
            java.lang.String r12 = "(Ljava/lang/String;Ljava/lang/ClassLoader;)V"
            java.lang.String r13 = "java/lang/System_EXEC_"
            java.lang.String r14 = "loadLibrary"
            java.lang.String r15 = "(Ljava/lang/String;)V"
            r9 = r3
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00cf }
            return
        L_0x00cf:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r4 = "[-] Fail to load with usual System API"
            m111083s(r6, r0, r4, r3)
            nj.i$b r0 = p206nj.C76862i.f224685a
            boolean r0 = r0.mo107119b()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.String r3 = "[+] Try to load library with expansions"
            m111082r(r8, r6, r3, r0)
            nj.i$b r0 = p206nj.C76862i.f224685a     // Catch:{ all -> 0x00ef }
            boolean r0 = r0.mo107117R0(r1)     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00f7
            return
        L_0x00ef:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r7]
            java.lang.String r4 = "[-] Fail to load library with expansions"
            m111083s(r6, r0, r4, r3)
        L_0x00f7:
            m111080p(r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p206nj.C88957l.m111081q(java.lang.String, java.lang.ClassLoader):void");
    }

    /* renamed from: r */
    public static void m111082r(int i, String str, String str2, Object... objArr) {
        ThreadLocal<Boolean> threadLocal = f256540i;
        Boolean bool = threadLocal.get();
        if (bool == null || !bool.booleanValue()) {
            threadLocal.set(Boolean.TRUE);
            if (i == 0) {
                Log.m105927v(str, str2, objArr);
            } else if (i == 1) {
                Log.m105919d(str, str2, objArr);
            } else if (i == 2) {
                Log.m105925i(str, str2, objArr);
            } else if (i == 3) {
                Log.m105929w(str, str2, objArr);
            } else if (i == 4) {
                Log.m105921e(str, str2, objArr);
            }
            threadLocal.set(Boolean.FALSE);
        } else if (objArr == null || objArr.length == 0) {
            android.util.Log.println(i, str, str2);
        } else {
            android.util.Log.println(i, str, String.format(str2, objArr));
        }
    }

    /* renamed from: s */
    public static void m111083s(String str, Throwable th, String str2, Object... objArr) {
        ThreadLocal<Boolean> threadLocal = f256541j;
        Boolean bool = threadLocal.get();
        if (bool == null || !bool.booleanValue()) {
            threadLocal.set(Boolean.TRUE);
            Log.printErrStackTrace(str, th, str2, objArr);
            threadLocal.set(Boolean.FALSE);
        } else if (objArr != null && objArr.length != 0) {
            String.format(str2, objArr);
        }
    }
}
