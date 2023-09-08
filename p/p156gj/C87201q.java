package p156gj;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: gj.q */
public class C87201q {

    /* renamed from: a */
    public static Map<String, String> f252875a;

    /* renamed from: gj.q$a */
    public class C87202a implements FileFilter {
        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    /* renamed from: a */
    public static HashMap<String, String> m108257a() {
        BufferedReader bufferedReader;
        IOException e;
        HashMap<String, String> hashMap = new HashMap<>();
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/cpuinfo"), "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(XVFSFile.PATH_SEPARATOR, 2);
                    if (split != null) {
                        if (split.length >= 2) {
                            String trim = split[0].trim();
                            String trim2 = split[1].trim();
                            if (hashMap.get(trim) == null) {
                                hashMap.put(trim, trim2);
                            }
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    try {
                        Log.printErrStackTrace("CpuFeatures", e, "getCpu() failed.", new Object[0]);
                        Util.qualityClose(bufferedReader);
                        return hashMap;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        Util.qualityClose(bufferedReader2);
                        throw th;
                    }
                }
            }
        } catch (IOException e3) {
            IOException iOException = e3;
            bufferedReader = null;
            e = iOException;
            Log.printErrStackTrace("CpuFeatures", e, "getCpu() failed.", new Object[0]);
            Util.qualityClose(bufferedReader);
            return hashMap;
        } catch (Throwable th4) {
            th = th4;
            Util.qualityClose(bufferedReader2);
            throw th;
        }
        Util.qualityClose(bufferedReader);
        return hashMap;
    }

    /* renamed from: b */
    public static String m108258b() {
        if (f252875a == null) {
            f252875a = m108257a();
        }
        return m108264h(f252875a, "Hardware");
    }

    /* renamed from: c */
    public static Map<String, String> m108259c() {
        if (f252875a == null) {
            f252875a = m108257a();
        }
        return f252875a;
    }

    /* renamed from: d */
    public static int m108260d() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(new C87202a()).length;
        } catch (Exception unused) {
            return 1;
        }
    }

    /* renamed from: e */
    public static boolean m108261e() {
        if (f252875a == null) {
            f252875a = m108257a();
        }
        Map<String, String> map = f252875a;
        if (map == null) {
            return false;
        }
        String h = m108264h(map, "Features");
        if (h == null || !h.contains("neon")) {
            return h != null && h.contains("asimd");
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m108262f() {
        int i;
        if (f252875a == null) {
            f252875a = m108257a();
        }
        Map<String, String> map = f252875a;
        if (map != null) {
            String str = (String) ((HashMap) map).get("CPU architecture");
            Log.m105918d("CpuFeatures", "arch " + str);
            if (str != null) {
                try {
                    if (str.length() > 0) {
                        try {
                            if (str.length() > 0) {
                                while (true) {
                                    char charAt = str.charAt(0);
                                    if (charAt >= '0' && charAt <= '9') {
                                        break;
                                    } else if (str.length() == 1) {
                                        str = null;
                                        break;
                                    } else {
                                        str = str.substring(1);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            Log.printErrStackTrace("CpuFeatures", e, "", new Object[0]);
                        }
                        int i2 = 0;
                        while (true) {
                            i = i2 + 1;
                            try {
                                char charAt2 = str.charAt(i2);
                                if (!(charAt2 >= '0' && charAt2 <= '9')) {
                                    break;
                                } else if (str.length() <= i) {
                                    break;
                                } else {
                                    i2 = i;
                                }
                            } catch (Exception e2) {
                                Log.printErrStackTrace("CpuFeatures", e2, "", new Object[0]);
                            }
                        }
                        int i3 = i - 1;
                        if (str.length() > i3 + 1 && i3 > 0) {
                            str = str.substring(0, i3);
                        }
                        int i4 = Util.getInt(str, 0);
                        Log.m105918d("CpuFeatures", "armarch " + i4);
                        if (i4 >= 6) {
                            return true;
                        }
                    }
                } catch (Exception e3) {
                    Log.printErrStackTrace("CpuFeatures", e3, "", new Object[0]);
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m108263g() {
        try {
            return m108261e();
        } catch (IncompatibleClassChangeError e) {
            Log.printErrStackTrace("MicroMsg.Crash", e, "May cause dvmFindCatchBlock crash!", new Object[0]);
            throw ((IncompatibleClassChangeError) new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(e));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static String m108264h(Map<String, String> map, String str) {
        return map.get(str);
    }
}
