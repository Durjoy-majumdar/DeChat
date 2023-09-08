package p156gj;

import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.net.LocalServerSocket;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.zip.CRC32;
import k20.C9556a;
import p823sg.C90193h;
import tc2.C118418g;

/* renamed from: gj.t */
public final class C87203t {

    /* renamed from: a */
    public static boolean f252876a;

    /* renamed from: b */
    public static final C87221r f252877b = new C87212i(new C87211h("a", 5));

    /* renamed from: c */
    public static final C87221r f252878c = new C87213j(new C87223t("c", 5));

    /* renamed from: d */
    public static final C87221r f252879d = new C87214k(new C87223t("d", 5));

    /* renamed from: e */
    public static final C87221r f252880e = new C87215l(new C87223t("e", 5));

    /* renamed from: f */
    public static final C87221r f252881f = new C87217n(new C87216m("f", 5));

    /* renamed from: g */
    public static final C87221r f252882g = new C87218o(new C87223t("g", 5));

    /* renamed from: h */
    public static final C87221r f252883h = new C87219p(new C87223t("h", 5));

    /* renamed from: i */
    public static final C87221r f252884i = new C87204a(new C87223t("i", 5));

    /* renamed from: j */
    public static final C87221r f252885j = new C87206c(new C87205b("j", 5));

    /* renamed from: k */
    public static final C87221r f252886k = new C87207d(new C87223t("MODEL", 5));

    /* renamed from: l */
    public static final C87221r f252887l = new C87209f(new C87208e("DEVICE_ID", 5));

    /* renamed from: m */
    public static final C87221r f252888m = new C87210g(new C87223t("FIRST_INSTALL_TIMEl", 5));

    /* renamed from: n */
    public static boolean f252889n = false;

    /* renamed from: o */
    public static String f252890o = null;

    /* renamed from: p */
    public static String f252891p = null;

    /* renamed from: q */
    public static String f252892q = null;

    /* renamed from: r */
    public static String f252893r = null;

    /* renamed from: s */
    public static final Boolean[] f252894s = {null};

    /* renamed from: gj.t$a */
    public class C87204a extends C87221r {
        public C87204a(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            return Build.getRadioVersion();
        }
    }

    /* renamed from: gj.t$b */
    public class C87205b extends C87223t {
        public C87205b(String str, int i) {
            super(str, i);
        }

        /* renamed from: d */
        public void mo121638d() {
            C87225u.m108324a(1064, 9, 1, true);
        }

        /* renamed from: e */
        public void mo121639e(boolean z) {
            if (z) {
                C87225u.m108324a(1064, 7, 1, true);
            }
        }
    }

    /* renamed from: gj.t$c */
    public class C87206c extends C87221r {
        public C87206c(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            return UUID.nameUUIDFromBytes((C87203t.m108266b() + '#' + Util.nullAsNil(C87203t.f252881f.mo121645a()) + '#' + System.currentTimeMillis() + '#' + SystemClock.elapsedRealtimeNanos()).getBytes(Charset.forName("UTF-8"))).toString();
        }

        /* renamed from: c */
        public void mo121640c() {
        }

        /* renamed from: d */
        public void mo121641d() {
            C87225u.m108324a(1064, 8, 1, true);
        }
    }

    /* renamed from: gj.t$d */
    public class C87207d extends C87221r {
        public C87207d(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            return Build.MODEL;
        }
    }

    /* renamed from: gj.t$e */
    public class C87208e extends C87223t {
        public C87208e(String str, int i) {
            super(str, i);
        }

        /* renamed from: a */
        public String mo121642a(String str) {
            if (str == null) {
                str = C87203t.m108273i();
            }
            return super.mo121642a(str);
        }
    }

    /* renamed from: gj.t$f */
    public class C87209f extends C87221r {
        public C87209f(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            StringBuilder sb = new StringBuilder();
            sb.append(C87203t.m108266b());
            Random random = new Random();
            random.setSeed(System.currentTimeMillis());
            sb.append(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
            for (int i = 0; i < 15; i++) {
                sb.append((char) (random.nextInt(25) + 65));
            }
            sb.append(Util.nullAsNil(C87203t.f252881f.mo121645a()));
            String sb4 = sb.toString();
            Log.m105925i("MicroMsg.DeviceInfo", "[+] new deviceid, dev:%s", sb4);
            return ExifInterface.GPS_MEASUREMENT_IN_PROGRESS + C90193h.m112878f(sb4.getBytes()).substring(0, 15);
        }
    }

    /* renamed from: gj.t$g */
    public class C87210g extends C87221r {
        public C87210g(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            return C87203t.m108267c();
        }
    }

    /* renamed from: gj.t$h */
    public class C87211h extends C87223t {
        public C87211h(String str, int i) {
            super(str, i);
        }

        /* renamed from: d */
        public void mo121638d() {
            C87225u.m108324a(1064, 4, 1, true);
        }

        /* renamed from: e */
        public void mo121639e(boolean z) {
            if (z) {
                C87225u.m108324a(1064, 2, 1, true);
            }
        }
    }

    /* renamed from: gj.t$i */
    public class C87212i extends C87221r {

        /* renamed from: b */
        public final C87220q f252895b = new C87222s(258);

        public C87212i(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            String a = this.f252895b.mo121642a("1234567890ABCDEF");
            if ("1234567890ABCDEF".equals(a)) {
                return null;
            }
            C87225u.m108324a(1064, 0, 1, true);
            return a;
        }

        /* renamed from: c */
        public void mo121640c() {
        }

        /* renamed from: d */
        public void mo121641d() {
            C87225u.m108324a(1064, 3, 1, true);
        }
    }

    /* renamed from: gj.t$j */
    public class C87213j extends C87221r {
        public C87213j(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            Log.m105919d("MicroMsg.DeviceInfo", "READ_PHONE_STATE.getSerial, %s", Util.getStack());
            if (!C87203t.f252876a) {
                return null;
            }
            return Build.VERSION.SDK_INT < 26 ? Build.SERIAL : "unknown";
        }
    }

    /* renamed from: gj.t$k */
    public class C87214k extends C87221r {
        public C87214k(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            return ConnectivityCompat.INVALID_WIFI_BSSID;
        }
    }

    /* renamed from: gj.t$l */
    public class C87215l extends C87221r {
        public C87215l(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            try {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
                    return null;
                }
                return defaultAdapter.getAddress();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: gj.t$m */
    public class C87216m extends C87223t {
        public C87216m(String str, int i) {
            super(str, i);
        }

        /* renamed from: d */
        public void mo121638d() {
            C87225u.m108324a(1064, 14, 1, true);
        }

        /* renamed from: e */
        public void mo121639e(boolean z) {
            if (z) {
                C87225u.m108324a(1064, 12, 1, true);
            }
        }
    }

    /* renamed from: gj.t$n */
    public class C87217n extends C87221r {

        /* renamed from: b */
        public final C87220q f252896b = new C87222s(TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION);

        public C87217n(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            String a = this.f252896b.mo121642a((String) null);
            if (a != null) {
                C87225u.m108324a(1064, 10, 1, true);
                return a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Build.MANUFACTURER);
            sb.append(C87203t.m108275k());
            if (C87201q.f252875a == null) {
                C87201q.f252875a = C87201q.m108257a();
            }
            sb.append(": " + C87201q.m108264h(C87201q.f252875a, "Features") + ": " + C87201q.m108264h(C87201q.f252875a, "Processor") + ": " + C87201q.m108264h(C87201q.f252875a, "CPU architecture") + ": " + C87201q.m108264h(C87201q.f252875a, "Hardware") + ": " + C87201q.m108264h(C87201q.f252875a, "Serial"));
            return sb.toString();
        }

        /* renamed from: c */
        public void mo121640c() {
        }

        /* renamed from: d */
        public void mo121641d() {
            C87225u.m108324a(1064, 13, 1, true);
        }
    }

    /* renamed from: gj.t$o */
    public class C87218o extends C87221r {
        public C87218o(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            try {
                ContentResolver contentResolver = MMApplicationContext.getContext().getContentResolver();
                C9556a aVar = new C9556a();
                aVar.mo10233c("android_id");
                aVar.mo10233c(contentResolver);
                return (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/compatible/deviceinfo/DeviceInfo$8", "newValue", "()Ljava/lang/String;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "[-] Fail to get android id.", new Object[0]);
                return "";
            }
        }
    }

    /* renamed from: gj.t$p */
    public class C87219p extends C87221r {

        /* renamed from: b */
        public final C87222s f252897b = new C87222s(256);

        public C87219p(C87220q qVar) {
            super(qVar);
        }

        /* renamed from: b */
        public String mo121637b() {
            boolean z;
            StringBuilder sb = new StringBuilder();
            sb.append(C87203t.m108266b());
            String a = this.f252897b.mo121642a((String) null);
            if (a == null) {
                a = C87203t.m108270f(false);
                Log.m105929w("MicroMsg.DeviceInfo", "[!] fail to fetch devId from deprecated cache, using getIMEI instead. value: %s", a);
                z = false;
            } else {
                z = true;
            }
            Log.m105925i("MicroMsg.DeviceInfo", "[+] devId: %s, useDeprecatedDevId: %s", a, Boolean.valueOf(z));
            if (z) {
                sb.append(a);
            } else if (!TextUtils.isEmpty(a)) {
                sb.append((ExifInterface.GPS_MEASUREMENT_IN_PROGRESS + a + "123456789ABCDEF").substring(0, 15));
            } else {
                Random random = new Random();
                random.setSeed(System.currentTimeMillis());
                sb.append(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
                for (int i = 0; i < 15; i++) {
                    sb.append((char) (random.nextInt(25) + 65));
                }
                if (!this.f252897b.f252902d.f252867c) {
                    C87225u.m108324a(1064, 28, 1, true);
                }
            }
            sb.append(Util.nullAsNil(C87203t.f252881f.mo121645a()));
            String sb4 = sb.toString();
            Log.m105925i("MicroMsg.DeviceInfo", "[+] new mmguid, dev:%s", sb4);
            return ExifInterface.GPS_MEASUREMENT_IN_PROGRESS + C90193h.m112878f(sb4.getBytes()).substring(0, 15);
        }
    }

    /* renamed from: gj.t$q */
    public static abstract class C87220q {

        /* renamed from: a */
        public boolean f252898a = false;

        /* renamed from: b */
        public String f252899b = null;

        /* renamed from: c */
        public final byte[] f252900c = new byte[0];

        public C87220q(C87211h hVar) {
        }

        /* renamed from: a */
        public String mo121642a(String str) {
            synchronized (this.f252900c) {
                if (this.f252898a) {
                    String str2 = this.f252899b;
                    return str2;
                }
                String b = mo121643b();
                this.f252899b = b;
                if (b == null) {
                    return str;
                }
                this.f252898a = true;
                return b;
            }
        }

        /* renamed from: b */
        public abstract String mo121643b();

        /* renamed from: c */
        public abstract void mo121644c(String str);
    }

    /* renamed from: gj.t$r */
    public static abstract class C87221r {

        /* renamed from: a */
        public final C87220q f252901a;

        public C87221r(C87220q qVar) {
            this.f252901a = qVar;
        }

        /* renamed from: a */
        public final String mo121645a() {
            String a = this.f252901a.mo121642a((String) null);
            if (!TextUtils.isEmpty(a)) {
                mo121640c();
                return a;
            }
            mo121641d();
            return mo121646e();
        }

        /* renamed from: b */
        public abstract String mo121637b();

        /* renamed from: c */
        public void mo121640c() {
        }

        /* renamed from: d */
        public void mo121641d() {
        }

        /* renamed from: e */
        public final String mo121646e() {
            String b = mo121637b();
            if (!TextUtils.isEmpty(b)) {
                C87220q qVar = this.f252901a;
                synchronized (qVar.f252900c) {
                    if (!qVar.f252898a || !TextUtils.equals(qVar.f252899b, b)) {
                        qVar.f252899b = b;
                        qVar.f252898a = true;
                        qVar.mo121644c(b);
                    }
                }
            }
            return b;
        }
    }

    /* renamed from: gj.t$s */
    public static class C87222s extends C87220q {

        /* renamed from: d */
        public final C87199n f252902d = C87199n.m108254a();

        /* renamed from: e */
        public final int f252903e;

        public C87222s(int i) {
            super((C87211h) null);
            this.f252903e = i;
        }

        /* renamed from: b */
        public String mo121643b() {
            String str = (String) this.f252902d.f252865a.get(Integer.valueOf(this.f252903e));
            if (str == null && !this.f252902d.f252867c) {
                int i = this.f252903e;
                if (i == 256) {
                    C87225u.m108324a(1064, 27, 1, true);
                } else if (i == 258) {
                    C87225u.m108324a(1064, 25, 1, true);
                } else if (i == 259) {
                    C87225u.m108324a(1064, 26, 1, true);
                }
            }
            return str;
        }

        /* renamed from: c */
        public void mo121644c(String str) {
            this.f252902d.mo121634b(this.f252903e, str);
        }
    }

    /* renamed from: gj.t$t */
    public static class C87223t extends C87220q {

        /* renamed from: g */
        public static final Set<String> f252904g = new HashSet();

        /* renamed from: d */
        public final int f252905d;

        /* renamed from: e */
        public final File f252906e;

        /* renamed from: f */
        public final C87224u f252907f;

        public C87223t(String str, int i) {
            super((C87211h) null);
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("id is null or empty.");
            } else if (i > 0) {
                HashSet hashSet = (HashSet) f252904g;
                if (!hashSet.contains(str)) {
                    hashSet.add(str);
                    String uuid = UUID.nameUUIDFromBytes(str.getBytes(Charset.forName("UTF-8"))).toString();
                    this.f252905d = i;
                    C87224u uVar = new C87224u(str);
                    this.f252907f = uVar;
                    synchronized (this) {
                        try {
                            uVar.mo121649a();
                            File parentFile = MMApplicationContext.getContext().getFilesDir().getParentFile();
                            File file = new File(parentFile, ".auth_cache/" + uuid);
                            this.f252906e = file;
                            if (!file.exists()) {
                                if (!file.mkdirs()) {
                                    Log.m105921e("MicroMsg.DeviceInfo", "[-] Fail to make base dir: %s", file.getAbsolutePath());
                                }
                            }
                            uVar.mo121651c();
                        } catch (Throwable th) {
                            this.f252907f.mo121651c();
                            throw th;
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("name: " + str + " is duplicated.");
            } else {
                throw new IllegalArgumentException("cacheFileCount is less or equal than zero.");
            }
        }

        /* renamed from: b */
        public synchronized String mo121643b() {
            try {
                this.f252907f.mo121649a();
                if (!this.f252906e.exists()) {
                    Log.m105920e("MicroMsg.DeviceInfo", "[-] Base dir does not exist, base cache will return defValue.");
                    this.f252907f.mo121651c();
                    return null;
                }
                int i = this.f252905d;
                int i2 = 0;
                for (int i3 = 0; i3 < this.f252905d; i3++) {
                    File file = new File(this.f252906e, String.valueOf(i3));
                    if (!file.exists()) {
                        i--;
                    } else {
                        String f = mo121647f(file);
                        if (f != null) {
                            this.f252907f.mo121651c();
                            return f;
                        }
                        i2++;
                    }
                }
                if (i2 > 0) {
                    mo121639e(i2 == i);
                }
                Log.m105928w("MicroMsg.DeviceInfo", "[!] Cache missed, base cache will return defValue.");
                this.f252907f.mo121651c();
                return null;
            } catch (Throwable th) {
                this.f252907f.mo121651c();
                throw th;
            }
        }

        /* renamed from: c */
        public synchronized void mo121644c(String str) {
            int i;
            try {
                this.f252907f.mo121649a();
                if (!this.f252906e.exists()) {
                    Log.m105920e("MicroMsg.DeviceInfo", "[-] Base dir does not exist, skip rest logic.");
                    mo121638d();
                    this.f252907f.mo121651c();
                    return;
                }
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    i = this.f252905d;
                    if (i2 >= i) {
                        break;
                    }
                    File file = new File(this.f252906e, String.valueOf(i2));
                    if (file.isDirectory()) {
                        Log.m105928w("MicroMsg.DeviceInfo", "[!] Cache file %s is occupied by a directory, try to delete it first.");
                        file.delete();
                    }
                    if (!mo121648g(file, str)) {
                        i3++;
                    }
                    i2++;
                }
                if (i3 == i) {
                    mo121638d();
                }
                this.f252907f.mo121651c();
            } catch (Throwable th) {
                this.f252907f.mo121651c();
                throw th;
            }
        }

        /* renamed from: d */
        public void mo121638d() {
        }

        /* renamed from: e */
        public void mo121639e(boolean z) {
        }

        /* renamed from: f */
        public final String mo121647f(File file) {
            BufferedReader bufferedReader;
            FileReader fileReader;
            try {
                fileReader = new FileReader(file);
                try {
                    bufferedReader = new BufferedReader(fileReader);
                    try {
                        String readLine = bufferedReader.readLine();
                        if (TextUtils.isEmpty(readLine)) {
                            Log.m105928w("MicroMsg.DeviceInfo", "[-] Illegal cached data. Maybe reset before.");
                        } else {
                            int lastIndexOf = readLine.lastIndexOf(44);
                            if (lastIndexOf < 0) {
                                Log.m105920e("MicroMsg.DeviceInfo", "[-] Illegal cached data.");
                            } else {
                                String substring = readLine.substring(0, lastIndexOf);
                                String substring2 = readLine.substring(lastIndexOf + 1);
                                CRC32 crc32 = new CRC32();
                                crc32.update(substring.getBytes(Charset.forName("UTF-8")));
                                if (crc32.getValue() != Long.parseLong(substring2)) {
                                    Log.m105920e("MicroMsg.DeviceInfo", "[-] crc32 of data mismatch.");
                                } else {
                                    Util.qualityClose(bufferedReader);
                                    Util.qualityClose(fileReader);
                                    return substring;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "[-] Exception occurred when read from cache file.", new Object[0]);
                            Util.qualityClose(bufferedReader);
                            Util.qualityClose(fileReader);
                            return null;
                        } catch (Throwable th4) {
                            Util.qualityClose(bufferedReader);
                            Util.qualityClose(fileReader);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    bufferedReader = null;
                    Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "[-] Exception occurred when read from cache file.", new Object[0]);
                    Util.qualityClose(bufferedReader);
                    Util.qualityClose(fileReader);
                    return null;
                }
            } catch (Throwable th6) {
                th = th6;
                bufferedReader = null;
                fileReader = null;
                Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "[-] Exception occurred when read from cache file.", new Object[0]);
                Util.qualityClose(bufferedReader);
                Util.qualityClose(fileReader);
                return null;
            }
            Util.qualityClose(bufferedReader);
            Util.qualityClose(fileReader);
            return null;
        }

        /* renamed from: g */
        public final boolean mo121648g(File file, String str) {
            PrintWriter printWriter = null;
            if (str == null) {
                try {
                    if (file.exists()) {
                        new PrintWriter(new FileWriter(file)).close();
                    }
                    Util.qualityClose(printWriter);
                    return true;
                } catch (Throwable th) {
                    th = th;
                    try {
                        Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "[-] Exception occurred when store value to file: %s", file.getAbsolutePath());
                        return false;
                    } finally {
                        Util.qualityClose(printWriter);
                    }
                }
            } else {
                PrintWriter printWriter2 = new PrintWriter(new FileWriter(file));
                try {
                    CRC32 crc32 = new CRC32();
                    crc32.update(str.getBytes(Charset.forName("UTF-8")));
                    printWriter2.print(str + "," + crc32.getValue());
                    Util.qualityClose(printWriter2);
                    return true;
                } catch (Throwable th4) {
                    th = th4;
                    printWriter = printWriter2;
                    Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "[-] Exception occurred when store value to file: %s", file.getAbsolutePath());
                    return false;
                }
            }
        }
    }

    /* renamed from: gj.t$u */
    public static class C87224u {

        /* renamed from: a */
        public final String f252908a;

        /* renamed from: b */
        public volatile LocalServerSocket f252909b = null;

        /* renamed from: c */
        public volatile int f252910c = 0;

        public C87224u(String str) {
            if (!TextUtils.isEmpty(str)) {
                synchronized (this) {
                    this.f252908a = str;
                }
                return;
            }
            throw new IllegalArgumentException("lockName is null or empty.");
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
        /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:12:0x0001, LOOP_START, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo121649a() {
            /*
                r2 = this;
                monitor-enter(r2)
            L_0x0001:
                boolean r0 = r2.mo121650b()     // Catch:{ all -> 0x000f }
                if (r0 == 0) goto L_0x0009
                monitor-exit(r2)
                return
            L_0x0009:
                r0 = 10
                java.lang.Thread.sleep(r0)     // Catch:{ all -> 0x0001 }
                goto L_0x0001
            L_0x000f:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p156gj.C87203t.C87224u.mo121649a():void");
        }

        /* renamed from: b */
        public synchronized boolean mo121650b() {
            if (this.f252909b == null) {
                try {
                    this.f252909b = new LocalServerSocket(this.f252908a);
                    this.f252910c++;
                    return true;
                } catch (Throwable unused) {
                    this.f252909b = null;
                    return false;
                }
            } else {
                this.f252910c++;
                return true;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|13) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0019 */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void mo121651c() {
            /*
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.f252910c     // Catch:{ all -> 0x001d }
                if (r0 <= 0) goto L_0x000b
                int r0 = r2.f252910c     // Catch:{ all -> 0x001d }
                int r0 = r0 + -1
                r2.f252910c = r0     // Catch:{ all -> 0x001d }
            L_0x000b:
                int r0 = r2.f252910c     // Catch:{ all -> 0x001d }
                if (r0 != 0) goto L_0x001b
                android.net.LocalServerSocket r0 = r2.f252909b     // Catch:{ all -> 0x001d }
                if (r0 == 0) goto L_0x001b
                r0 = 0
                android.net.LocalServerSocket r1 = r2.f252909b     // Catch:{ all -> 0x0019 }
                r1.close()     // Catch:{ all -> 0x0019 }
            L_0x0019:
                r2.f252909b = r0     // Catch:{ all -> 0x001d }
            L_0x001b:
                monitor-exit(r2)
                return
            L_0x001d:
                r0 = move-exception
                monitor-exit(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p156gj.C87203t.C87224u.mo121651c():void");
        }
    }

    /* renamed from: a */
    public static boolean m108265a() {
        Log.m105924i("MicroMsg.DeviceInfo", "init DeviceInfo ");
        String c = m108267c();
        C87221r rVar = f252888m;
        String a = rVar.mo121645a();
        f252890o = a;
        if (!c.equalsIgnoreCase(a)) {
            C87221r rVar2 = f252882g;
            String nullAsNil = Util.nullAsNil(rVar2.mo121645a());
            f252891p = nullAsNil;
            ContentResolver contentResolver = MMApplicationContext.getContext().getContentResolver();
            C9556a aVar = new C9556a();
            aVar.mo10233c("android_id");
            aVar.mo10233c(contentResolver);
            if (!nullAsNil.equalsIgnoreCase((String) C117292a.m165364j(new Object(), aVar.mo10232b(), "com/tencent/mm/compatible/deviceinfo/DeviceInfo", "detectDeviceChange", "()Z", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;"))) {
                f252892q = m108275k();
                C87221r rVar3 = f252887l;
                f252893r = rVar3.mo121645a();
                rVar.mo121646e();
                rVar3.mo121646e();
                rVar2.mo121646e();
                C87221r rVar4 = f252886k;
                rVar4.mo121646e();
                C87220q qVar = f252880e.f252901a;
                synchronized (qVar.f252900c) {
                    qVar.f252898a = false;
                    qVar.f252899b = null;
                    qVar.mo121644c((String) null);
                }
                C87220q qVar2 = f252884i.f252901a;
                synchronized (qVar2.f252900c) {
                    qVar2.f252898a = false;
                    qVar2.f252899b = null;
                    qVar2.mo121644c((String) null);
                }
                f252889n = true;
                Log.m105928w("MicroMsg.DeviceInfo", String.format("[!!] Reset DeviceInfo. InstallTime(%s -> %s), Model(%s -> %s), MMGUID(%s, %s -> %s), AndroidID(%s -> %s)", new Object[]{f252890o, c, f252892q, rVar4.mo121645a(), f252883h.mo121645a(), f252893r, rVar3.mo121645a(), f252891p, rVar2.mo121645a()}));
                return f252889n;
            }
        }
        Log.m105924i("MicroMsg.DeviceInfo", String.format("No need to reset DeviceInfo as usual. [%s]", new Object[]{c}));
        return f252889n;
    }

    /* renamed from: b */
    public static String m108266b() {
        return (f252876a || (TextUtils.isEmpty(f252882g.f252901a.mo121642a((String) null)) ^ true)) ? Util.nullAsNil(f252882g.mo121645a()) : "";
    }

    /* renamed from: c */
    public static String m108267c() {
        try {
            return Long.toString(MMApplicationContext.getContext().getPackageManager().getPackageInfo(MMApplicationContext.getApplicationId(), 0).firstInstallTime);
        } catch (Exception unused) {
            return "unknown";
        }
    }

    /* renamed from: d */
    public static Map<String, String> m108268d() {
        BufferedReader bufferedReader;
        Throwable th;
        HashMap hashMap = new HashMap();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/cpuinfo"), "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (!readLine.trim().isEmpty()) {
                        String[] split = readLine.split(XVFSFile.PATH_SEPARATOR);
                        if (split.length > 1) {
                            hashMap.put(split[0].trim().toLowerCase(), split[1].trim());
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "getCPUInfoMap() failed.", new Object[0]);
                        hashMap.clear();
                        Util.qualityClose(bufferedReader);
                        return hashMap;
                    } catch (Throwable th5) {
                        Util.qualityClose(bufferedReader);
                        throw th5;
                    }
                }
            }
        } catch (Throwable th6) {
            Throwable th7 = th6;
            bufferedReader = null;
            th = th7;
            Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "getCPUInfoMap() failed.", new Object[0]);
            hashMap.clear();
            Util.qualityClose(bufferedReader);
            return hashMap;
        }
        Util.qualityClose(bufferedReader);
        return hashMap;
    }

    /* renamed from: e */
    public static String[] m108269e() {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/cpuinfo"), "UTF-8"));
            try {
                StringBuilder sb = new StringBuilder();
                String[] split = bufferedReader2.readLine().split("\\s+");
                for (int i = 2; i < split.length; i++) {
                    sb.append(split[i]);
                    sb.append(' ');
                }
                String[] strArr = {sb.toString(), bufferedReader2.readLine().split("\\s+")[2]};
                Util.qualityClose(bufferedReader2);
                return strArr;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                try {
                    Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "getFirstCPUCoreDescs() failed.", new Object[0]);
                    return new String[]{"", "0"};
                } finally {
                    Util.qualityClose(bufferedReader);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "getFirstCPUCoreDescs() failed.", new Object[0]);
            return new String[]{"", "0"};
        }
    }

    /* renamed from: f */
    public static String m108270f(boolean z) {
        String a = f252877b.mo121645a();
        return !Util.isNullOrNil(a) ? a : z ? "1234567890ABCDEF" : "";
    }

    /* renamed from: g */
    public static String m108271g() {
        TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
        try {
            Log.m105919d("MicroMsg.DeviceInfo", "READ_PHONE_STATE.getSubscriberId, %s", Util.getStack());
            return Util.nullAsNil((String) C117292a.m165363i(telephonyManager, "com/tencent/mm/compatible/deviceinfo/DeviceInfo", "getIMSI", "()Ljava/lang/String;", "android/telephony/TelephonyManager", "getSubscriberId", "()Ljava/lang/String;"));
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "getIMSI", new Object[0]);
            return "";
        }
    }

    /* renamed from: h */
    public static String m108272h() {
        return m108273i();
    }

    /* renamed from: i */
    public static String m108273i() {
        return Util.nullAsNil(f252883h.mo121645a());
    }

    /* renamed from: j */
    public static String m108274j() {
        return "android-" + m108275k() + "-" + Build.VERSION.SDK_INT;
    }

    /* renamed from: k */
    public static String m108275k() {
        return Util.nullAsNil(f252886k.mo121645a());
    }

    /* renamed from: l */
    public static String m108276l() {
        return Util.nullAsNil(C118418g.INSTANCE.mo175831r4());
    }

    /* renamed from: m */
    public static String m108277m() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) MMApplicationContext.getContext().getSystemService("phone");
            return telephonyManager != null ? Util.nullAsNil(telephonyManager.getSimCountryIso()) : "";
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.DeviceInfo", th, "getSimCountryIso", new Object[0]);
            return "";
        }
    }

    /* renamed from: n */
    public static String m108278n() {
        return Util.nullAsNil(f252885j.mo121645a());
    }

    /* renamed from: o */
    public static boolean m108279o() {
        boolean booleanValue;
        Boolean[] boolArr = f252894s;
        Boolean bool = boolArr[0];
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (boolArr) {
            Boolean bool2 = boolArr[0];
            if (bool2 == null) {
                bool2 = Build.VERSION.SDK_INT >= 23 ? Boolean.valueOf(Process.is64Bit()) : Boolean.valueOf(Build.CPU_ABI.contains("64"));
                boolArr[0] = bool2;
            }
            booleanValue = bool2.booleanValue();
        }
        return booleanValue;
    }
}
