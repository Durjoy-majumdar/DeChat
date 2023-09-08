package p168i6;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: i6.a */
public class C87663a {

    /* renamed from: a */
    public static final FileFilter f253911a = new C87664a();

    /* renamed from: i6.a$a */
    public class C87664a implements FileFilter {
        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static int m109017a(byte[] bArr, int i) {
        byte b;
        while (i < bArr.length && (b = bArr[i]) != 10) {
            if (Character.isDigit(b)) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Util.safeParseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public static int m109018b() {
        InputStream E;
        int i;
        InputStream E2;
        int i2 = 0;
        int i3 = -1;
        for (int i4 = 0; i4 < m109020d(); i4++) {
            try {
                File file = new File("/sys/devices/system/cpu/cpu" + i4 + "/cpufreq/cpuinfo_max_freq");
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    E2 = C86013q1.m106423E(file.getPath());
                    E2.read(bArr);
                    int i5 = 0;
                    while (Character.isDigit(bArr[i5]) && i5 < 128) {
                        i5++;
                    }
                    Integer valueOf = Integer.valueOf(Util.safeParseInt(new String(bArr, 0, i5)));
                    if (valueOf.intValue() > i3) {
                        i3 = valueOf.intValue();
                    }
                    E2.close();
                }
            } catch (NumberFormatException unused) {
            } catch (IOException unused2) {
                return -1;
            } catch (Throwable th) {
                E2.close();
                throw th;
            }
        }
        if (i3 == -1) {
            E = C86013q1.m106423E("/proc/cpuinfo");
            byte[] bArr2 = new byte[1024];
            try {
                int read = E.read(bArr2);
                loop2:
                while (true) {
                    if (i2 >= read) {
                        break;
                    }
                    byte b = bArr2[i2];
                    if (b == 10 || i2 == 0) {
                        if (b == 10) {
                            i2++;
                        }
                        int i6 = i2;
                        while (true) {
                            if (i6 >= read) {
                                continue;
                                break;
                            }
                            int i7 = i6 - i2;
                            if (bArr2[i6] != "cpu MHz".charAt(i7)) {
                                break;
                            } else if (i7 == 6) {
                                i = m109017a(bArr2, i6);
                                break loop2;
                            } else {
                                i6++;
                            }
                        }
                    }
                    i2++;
                }
            } catch (IOException | NumberFormatException unused3) {
            }
            i = -1;
            int i8 = i * 1000;
            if (i8 > i3) {
                i3 = i8;
            }
            E.close();
        }
        return i3;
    }

    /* renamed from: c */
    public static int m109019c(String str) {
        int i = -1;
        InputStream inputStream = null;
        try {
            InputStream E = C86013q1.m106423E(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(E));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            if (readLine != null) {
                if (readLine.matches("0-[\\d]+$")) {
                    i = Util.getInt(readLine.substring(2), 0) + 1;
                }
            }
            if (E != null) {
                try {
                    E.close();
                } catch (IOException unused) {
                }
            }
            return i;
        } catch (IOException unused2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    /* renamed from: d */
    public static int m109020d() {
        try {
            int c = m109019c("/sys/devices/system/cpu/possible");
            if (c == -1) {
                c = m109019c("/sys/devices/system/cpu/present");
            }
            return c == -1 ? new File("/sys/devices/system/cpu/").listFiles(f253911a).length : c;
        } catch (NullPointerException | SecurityException unused) {
            return -1;
        }
    }

    /* renamed from: e */
    public static long m109021e(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }
}
