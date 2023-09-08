package e24;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import com.tencent.xweb.file.XVFSFile;
import d24.C106984u;
import d24.C20396c0;
import d24.C20399d0;
import d24.C20419r;
import d24.C20421s;
import d24.C20425v;
import j24.C21157c;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o24.C21760d0;
import o24.C21766h;
import o24.C21769k;
import z04.C119027c;

/* renamed from: e24.c */
public final class C20509c {

    /* renamed from: a */
    public static final byte[] f57729a;

    /* renamed from: b */
    public static final String[] f57730b = new String[0];

    /* renamed from: c */
    public static final C20399d0 f57731c;

    /* renamed from: d */
    public static final Charset f57732d = Charset.forName("UTF-8");

    /* renamed from: e */
    public static final TimeZone f57733e = TimeZone.getTimeZone("GMT");

    /* renamed from: f */
    public static final Comparator<String> f57734f = new C20510a();

    /* renamed from: g */
    public static final Method f57735g;

    /* renamed from: h */
    public static final Pattern f57736h = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: e24.c$a */
    public class C20510a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            return ((String) obj).compareTo((String) obj2);
        }
    }

    static {
        byte[] bArr = new byte[0];
        f57729a = bArr;
        C21766h hVar = new C21766h();
        hVar.mo34145n(bArr, 0, 0);
        long j = (long) 0;
        Method method = null;
        f57731c = new C20396c0((C106984u) null, j, hVar);
        if ((j | j) < 0 || j > j || j - j < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        C21769k.m24901c("efbbbf");
        C21769k.m24901c("feff");
        C21769k.m24901c("fffe");
        C21769k.m24901c("0000ffff");
        C21769k.m24901c("ffff0000");
        Charset.forName(KindaConfigCacheStg.SAVE_CHARSET);
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f57735g = method;
    }

    /* renamed from: a */
    public static AssertionError m22195a(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* renamed from: b */
    public static String m22196b(String str) {
        boolean z = true;
        int i = 0;
        int i2 = -1;
        if (str.contains(XVFSFile.PATH_SEPARATOR)) {
            InetAddress f = (!str.startsWith("[") || !str.endsWith("]")) ? m22200f(str, 0, str.length()) : m22200f(str, 1, str.length() - 1);
            if (f == null) {
                return null;
            }
            byte[] address = f.getAddress();
            if (address.length == 16) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < address.length) {
                    int i5 = i3;
                    while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                        i5 += 2;
                    }
                    int i6 = i5 - i3;
                    if (i6 > i4 && i6 >= 4) {
                        i2 = i3;
                        i4 = i6;
                    }
                    i3 = i5 + 2;
                }
                C21766h hVar = new C21766h();
                while (i < address.length) {
                    if (i == i2) {
                        hVar.mo34148q(58);
                        i += i4;
                        if (i == 16) {
                            hVar.mo34148q(58);
                        }
                    } else {
                        if (i > 0) {
                            hVar.mo34148q(58);
                        }
                        hVar.mo34115A0((long) (((address[i] & ExifInterface.MARKER) << 8) | (address[i + 1] & ExifInterface.MARKER)));
                        i += 2;
                    }
                }
                return hVar.mo34141j(hVar.f61695e, C119027c.f356488a);
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + "'");
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= lowerCase.length()) {
                    z = false;
                    break;
                }
                char charAt = lowerCase.charAt(i7);
                if (charAt <= 31) {
                    break;
                } else if (charAt >= 127) {
                    break;
                } else if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                    break;
                } else {
                    i7++;
                }
            }
            if (z) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m22197c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m22198d(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m22209o(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (!"bio == null".equals(e2.getMessage())) {
                    throw e2;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    public static int m22199e(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d7, code lost:
        if (r7 == 16) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00da, code lost:
        if (r8 != -1) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00dd, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ef, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f5, code lost:
        throw new java.lang.AssertionError();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.net.InetAddress m22200f(java.lang.String r16, int r17, int r18) {
        /*
            r0 = r16
            r1 = r18
            r2 = 16
            byte[] r3 = new byte[r2]
            r4 = -1
            r5 = 0
            r6 = r17
            r7 = 0
            r8 = -1
            r9 = -1
        L_0x000f:
            r10 = 0
            if (r6 >= r1) goto L_0x00d5
            if (r7 != r2) goto L_0x0015
            return r10
        L_0x0015:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            r13 = 4
            if (r11 > r1) goto L_0x0032
            java.lang.String r14 = "::"
            r15 = 2
            boolean r14 = r0.regionMatches(r6, r14, r5, r15)
            if (r14 == 0) goto L_0x0032
            if (r8 == r4) goto L_0x0028
            return r10
        L_0x0028:
            int r7 = r7 + 2
            r8 = r7
            if (r11 != r1) goto L_0x002f
            goto L_0x00d5
        L_0x002f:
            r9 = r11
            goto L_0x00a2
        L_0x0032:
            if (r7 == 0) goto L_0x00a1
            java.lang.String r11 = ":"
            r14 = 1
            boolean r11 = r0.regionMatches(r6, r11, r5, r14)
            if (r11 == 0) goto L_0x0041
            int r6 = r6 + 1
            goto L_0x00a1
        L_0x0041:
            java.lang.String r11 = "."
            boolean r6 = r0.regionMatches(r6, r11, r5, r14)
            if (r6 == 0) goto L_0x00a0
            int r6 = r7 + -2
            r11 = r6
        L_0x004c:
            if (r9 >= r1) goto L_0x0094
            if (r11 != r2) goto L_0x0051
            goto L_0x0097
        L_0x0051:
            if (r11 == r6) goto L_0x005e
            char r15 = r0.charAt(r9)
            r14 = 46
            if (r15 == r14) goto L_0x005c
            goto L_0x0097
        L_0x005c:
            int r9 = r9 + 1
        L_0x005e:
            r14 = r9
            r15 = 0
        L_0x0060:
            if (r14 >= r1) goto L_0x0082
            char r5 = r0.charAt(r14)
            r2 = 48
            if (r5 < r2) goto L_0x0082
            r4 = 57
            if (r5 <= r4) goto L_0x006f
            goto L_0x0082
        L_0x006f:
            if (r15 != 0) goto L_0x0074
            if (r9 == r14) goto L_0x0074
            goto L_0x0097
        L_0x0074:
            int r15 = r15 * 10
            int r15 = r15 + r5
            int r15 = r15 - r2
            if (r15 <= r12) goto L_0x007b
            goto L_0x0097
        L_0x007b:
            int r14 = r14 + 1
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x0060
        L_0x0082:
            int r2 = r14 - r9
            if (r2 != 0) goto L_0x0087
            goto L_0x0097
        L_0x0087:
            int r2 = r11 + 1
            byte r4 = (byte) r15
            r3[r11] = r4
            r11 = r2
            r9 = r14
            r2 = 16
            r4 = -1
            r5 = 0
            r14 = 1
            goto L_0x004c
        L_0x0094:
            int r6 = r6 + r13
            if (r11 == r6) goto L_0x0099
        L_0x0097:
            r14 = 0
            goto L_0x009a
        L_0x0099:
            r14 = 1
        L_0x009a:
            if (r14 != 0) goto L_0x009d
            return r10
        L_0x009d:
            int r7 = r7 + 2
            goto L_0x00d5
        L_0x00a0:
            return r10
        L_0x00a1:
            r9 = r6
        L_0x00a2:
            r6 = r9
            r2 = 0
        L_0x00a4:
            if (r6 >= r1) goto L_0x00b8
            char r4 = r0.charAt(r6)
            int r4 = m22199e(r4)
            r5 = -1
            if (r4 != r5) goto L_0x00b2
            goto L_0x00b8
        L_0x00b2:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00b8:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d4
            if (r4 <= r13) goto L_0x00bf
            goto L_0x00d4
        L_0x00bf:
            int r4 = r7 + 1
            int r5 = r2 >>> 8
            r5 = r5 & r12
            byte r5 = (byte) r5
            r3[r7] = r5
            int r7 = r4 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            r4 = -1
            r5 = 0
            goto L_0x000f
        L_0x00d4:
            return r10
        L_0x00d5:
            r0 = 16
            if (r7 == r0) goto L_0x00eb
            r1 = -1
            if (r8 != r1) goto L_0x00dd
            return r10
        L_0x00dd:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00eb:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)     // Catch:{ UnknownHostException -> 0x00f0 }
            return r0
        L_0x00f0:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e24.C20509c.m22200f(java.lang.String, int, int):java.net.InetAddress");
    }

    /* renamed from: g */
    public static int m22201g(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: h */
    public static int m22202h(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: i */
    public static boolean m22203i(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: j */
    public static String m22204j(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: k */
    public static String m22205k(C20421s sVar, boolean z) {
        String str;
        if (sVar.f57268d.contains(XVFSFile.PATH_SEPARATOR)) {
            str = "[" + sVar.f57268d + "]";
        } else {
            str = sVar.f57268d;
        }
        if (!z && sVar.f57269e == C20421s.m21985c(sVar.f57265a)) {
            return str;
        }
        return str + XVFSFile.PATH_SEPARATOR + sVar.f57269e;
    }

    /* renamed from: l */
    public static <T> List<T> m22206l(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: m */
    public static <T> List<T> m22207m(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: n */
    public static String[] m22208n(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: o */
    public static boolean m22209o(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: p */
    public static boolean m22210p(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m22211q(C21760d0 d0Var, int i, TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        long c = d0Var.mo32328f().mo34106e() ? d0Var.mo32328f().mo34104c() - nanoTime : Long.MAX_VALUE;
        d0Var.mo32328f().mo34105d(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C21766h hVar = new C21766h();
            while (d0Var.mo32327L0(hVar, 8192) != -1) {
                hVar.skip(hVar.f61695e);
            }
            if (c == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                d0Var.mo32328f().mo34102a();
            } else {
                d0Var.mo32328f().mo34105d(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                d0Var.mo32328f().mo34102a();
            } else {
                d0Var.mo32328f().mo34105d(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            if (c == MAlarmHandler.NEXT_FIRE_INTERVAL) {
                d0Var.mo32328f().mo34102a();
            } else {
                d0Var.mo32328f().mo34105d(nanoTime + c);
            }
            throw th;
        }
    }

    /* renamed from: r */
    public static int m22212r(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: s */
    public static int m22213s(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: t */
    public static C20419r m22214t(List<C21157c> list) {
        C20419r.C20420a aVar = new C20419r.C20420a();
        for (C21157c next : list) {
            C20507a aVar2 = C20507a.f57727a;
            String n = next.f59816a.mo34163n();
            String n2 = next.f59817b.mo34163n();
            ((C20425v.C20426a) aVar2).getClass();
            aVar.mo31935b(n, n2);
        }
        return new C20419r(aVar);
    }

    /* renamed from: u */
    public static String m22215u(String str, int i, int i2) {
        int r = m22212r(str, i, i2);
        return str.substring(r, m22213s(str, r, i2));
    }
}
