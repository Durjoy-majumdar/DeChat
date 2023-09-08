package kn0;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87762h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import mn0.C21518b;
import p300c8.C79946g;
import p300c8.C79952o;
import p300c8.C79958t;
import p404z6.C91618d;

/* renamed from: kn0.m */
public class C88235m {

    /* renamed from: a */
    public static final C21518b f255053a = new C21518b();

    /* renamed from: b */
    public static final C91618d f255054b = new C91618d();

    /* renamed from: a */
    public static C79946g.C79947a m109882a(Context context, Map<String, String> map) {
        C21518b bVar = f255053a;
        C88229b bVar2 = new C88229b(C87762h.m109196a(context), bVar, 8000, 8000, true);
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                Log.m105925i("MicroMsg.SameLayer.ExoMediaPlayerUtils", "buildDefaultHttpDataSourceFactory, header: %s: %s", next.getKey(), next.getValue());
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                C79958t.C79963e eVar = bVar2.f234226a;
                synchronized (eVar) {
                    eVar.f234230b = null;
                    ((HashMap) eVar.f234229a).put(str, str2);
                }
            }
        }
        return new C79952o(context, bVar, bVar2);
    }

    @Deprecated
    /* renamed from: b */
    public static String m109883b(int i, String str, int i2) {
        String str2;
        String[] strArr;
        String str3;
        String str4;
        int i3 = i;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - ((long) (i2 * 1000));
        int i4 = Calendar.getInstance().get(1);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS", Locale.getDefault());
        String str5 = "^\\d\\d-\\d\\d\\s\\d\\d:.*";
        String str6 = "getLogcatContent exception3";
        int i5 = 0;
        if (str == null) {
            str2 = "getLogcatContent exception2";
            strArr = new String[]{"logcat", "-d", "-v", "threadtime"};
        } else {
            str2 = "getLogcatContent exception2";
            strArr = new String[]{"logcat", "-d", "-v", "threadtime", "-s", str};
        }
        Process process = null;
        StringBuilder sb = new StringBuilder();
        try {
            Process exec = Runtime.getRuntime().exec(strArr);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            boolean z = false;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                } else if (readLine.matches(str5)) {
                    BufferedReader bufferedReader2 = bufferedReader;
                    String str7 = str5;
                    String substring = readLine.substring(i5, 18);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i4);
                    sb4.append("-");
                    int i6 = i4;
                    sb4.append(substring.substring(0, 18));
                    long time = simpleDateFormat.parse(sb4.toString()).getTime();
                    if (time > currentTimeMillis) {
                        break;
                    }
                    if (time > j) {
                        if (!z) {
                            sb.append(">>>>>> start logcat log <<<<<<\n");
                            z = true;
                        }
                        sb.append(readLine);
                        sb.append("\n");
                    }
                    if (i3 > 0 && sb.length() > i3) {
                        sb.delete(0, sb.length() - i3);
                    }
                    bufferedReader = bufferedReader2;
                    str5 = str7;
                    i4 = i6;
                    i5 = 0;
                }
            }
            sb.append(">>>>>> end logcat log <<<<<<");
            String sb5 = sb.toString();
            try {
                exec.getOutputStream().close();
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.SameLayer.ExoMediaPlayerUtils", e, "getLogcatContent exception1", new Object[0]);
            }
            try {
                exec.getInputStream().close();
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.SameLayer.ExoMediaPlayerUtils", e2, str2, new Object[0]);
            }
            try {
                exec.getErrorStream().close();
            } catch (IOException e3) {
                Log.printErrStackTrace("MicroMsg.SameLayer.ExoMediaPlayerUtils", e3, str6, new Object[0]);
            }
            return sb5;
        } catch (Throwable th) {
            Throwable th4 = th;
            if (process != null) {
                try {
                    process.getOutputStream().close();
                } catch (IOException e4) {
                    Log.printErrStackTrace("MicroMsg.SameLayer.ExoMediaPlayerUtils", e4, "getLogcatContent exception1", new Object[0]);
                }
                try {
                    process.getInputStream().close();
                } catch (Exception e5) {
                    Log.printErrStackTrace("MicroMsg.SameLayer.ExoMediaPlayerUtils", e5, str4, new Object[0]);
                }
                try {
                    process.getErrorStream().close();
                } catch (IOException e6) {
                    Log.printErrStackTrace("MicroMsg.SameLayer.ExoMediaPlayerUtils", e6, str3, new Object[0]);
                }
            }
            throw th4;
        }
    }

    /* renamed from: c */
    public static String m109884c(C91618d dVar) {
        if (dVar == null) {
            return String.valueOf((char[]) null);
        }
        return "DecoderCounters{decoderInitCount=" + dVar.f262468a + ", decoderReleaseCount=" + dVar.f262469b + ", inputBufferCount=" + dVar.f262470c + ", renderedOutputBufferCount=" + dVar.f262471d + ", skippedOutputBufferCount=" + dVar.f262472e + ", droppedOutputBufferCount=" + dVar.f262473f + ", maxConsecutiveDroppedOutputBufferCount=" + dVar.f262474g + '}';
    }
}
