package p1061wj;

import a70.C79471a;
import android.content.Context;
import android.os.Process;
import android.util.Pair;
import com.tencent.nativecrash.NativeCrash;
import com.tencent.p014mm.recoveryv2.C85672d;
import com.tencent.p014mm.recoveryv2.C85695l;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.CrashMonitorForJni;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.file.XVFSFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: wj.b */
public final class C91007b implements NativeCrash.CrashCallback {

    /* renamed from: a */
    public CrashMonitorForJni.CrashExtraMessageGetter f261104a;

    /* renamed from: wj.b$a */
    public class C91008a implements Comparator<Pair<String, Integer>> {
        public int compare(Object obj, Object obj2) {
            return ((Integer) ((Pair) obj2).second).intValue() - ((Integer) ((Pair) obj).second).intValue();
        }
    }

    /* renamed from: wj.b$b */
    public static class C91009b {

        /* renamed from: a */
        public int f261105a;

        /* renamed from: b */
        public String f261106b;

        /* renamed from: c */
        public String f261107c;
    }

    /* renamed from: wj.b$c */
    public static class C91010c {

        /* renamed from: a */
        public static C91007b f261108a = new C91007b((C91008a) null);
    }

    public C91007b(C91008a aVar) {
        Context context = MMApplicationContext.getContext();
        String replace = MMApplicationContext.getProcessName().replace(XVFSFile.PATH_SEPARATOR_CHAR, '_');
        File filesDir = context.getFilesDir();
        File file = new File(filesDir, "crash/NativeCrash_" + replace + '_' + System.currentTimeMillis());
        file.getParentFile().mkdirs();
        NativeCrash.init(file.getAbsolutePath(), 1871, 2048, false);
        NativeCrash.resetCustomInfo();
        NativeCrash.customInfo("Client Version: " + BuildInfo.CLIENT_VERSION);
        NativeCrash.customInfo("Base Version: " + C79471a.f233015c);
        NativeCrash.crashCallback(this);
    }

    /* renamed from: a */
    public static void m114175a(BufferedReader bufferedReader, StringBuilder sb) {
        String readLine;
        int indexOf;
        ArrayList arrayList = new ArrayList();
        while (true) {
            readLine = bufferedReader.readLine();
            if (readLine != null && !readLine.isEmpty() && (indexOf = readLine.indexOf(" -> ")) > 0) {
                arrayList.add(readLine.substring(indexOf + 4));
            }
        }
        if (arrayList.size() >= 900) {
            Collections.sort(arrayList);
            ArrayList arrayList2 = new ArrayList();
            String str = (String) arrayList.get(0);
            int size = arrayList.size();
            int i = 1;
            for (int i2 = 1; i2 < size; i2++) {
                String str2 = (String) arrayList.get(i2);
                if (!str2.equals(str)) {
                    arrayList2.add(Pair.create(str, Integer.valueOf(i)));
                    str = str2;
                    i = 1;
                } else {
                    i++;
                }
            }
            arrayList2.add(Pair.create(str, Integer.valueOf(i)));
            Collections.sort(arrayList2, new C91008a());
            sb.append("[File Descriptors]\n");
            if (readLine != null && readLine.startsWith("Total: ")) {
                sb.append(readLine);
                sb.append(10);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                sb.append('(');
                sb.append(pair.second);
                sb.append(") ");
                sb.append((String) pair.first);
                sb.append(10);
            }
            sb.append(10);
        }
    }

    /* renamed from: b */
    public static C91009b m114176b(int i, String str, String str2) {
        BufferedReader bufferedReader;
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(2048);
        FileReader fileReader = new FileReader(str);
        try {
            CharBuffer allocate = CharBuffer.allocate(2048);
            while (fileReader.read(allocate) > 0) {
                allocate.flip();
                sb.append(allocate);
                allocate.clear();
            }
            sb.append(10);
            fileReader.close();
            C91009b bVar = new C91009b();
            Matcher matcher = Pattern.compile("\nSignal: (\\d+) \\(").matcher(sb);
            if (matcher.find()) {
                bVar.f261105a = Util.safeParseInt(matcher.group(1));
            }
            Matcher matcher2 = Pattern.compile("\nClient Version: (0x[0-9A-Fa-f]{4,8})\n").matcher(sb);
            if (matcher2.find()) {
                bVar.f261106b = matcher2.group(1);
            } else {
                bVar.f261106b = BuildInfo.CLIENT_VERSION;
            }
            if (i != 0) {
                sb.append("\n !!! DUMPER EXITED UNEXPECTEDLY WITH STATUS: ");
                sb.append(i);
                sb.append(" !!!\n");
            }
            Log.m105925i("MicroMsg.WeChatNativeCrash", "generateCrashReport startTime:%s interTime:%s", Long.valueOf(currentTimeMillis), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            if (str2 != null) {
                try {
                    bufferedReader = new BufferedReader(new FileReader(str2));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        char c = 65535;
                        if (readLine.hashCode() == -539141342) {
                            if (readLine.equals("[File Descriptors]")) {
                                c = 0;
                            }
                        }
                        if (c != 0) {
                            sb.append(readLine);
                            sb.append(10);
                        } else {
                            m114175a(bufferedReader, sb);
                        }
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    sb.append("Cannot read full dump file: ");
                    sb.append(e);
                    sb.append(10);
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            bVar.f261107c = sb.toString();
            Log.m105925i("MicroMsg.WeChatNativeCrash", "generateCrashReport startTime:%s interTime:%s", Long.valueOf(currentTimeMillis), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return bVar;
            throw th;
            throw th;
        } catch (Throwable th4) {
            th.addSuppressed(th4);
        }
    }

    public boolean onCrashDumped(int i, String str, String str2) {
        BufferedReader bufferedReader;
        Throwable th;
        String extraMessage;
        String str3 = str;
        String str4 = str2;
        C91009b b = m114176b(i, str, str2);
        CrashMonitorForJni.CrashExtraMessageGetter crashExtraMessageGetter = this.f261104a;
        if (!(crashExtraMessageGetter == null || (extraMessage = crashExtraMessageGetter.getExtraMessage()) == null || extraMessage.isEmpty())) {
            b.f261107c += extraMessage;
        }
        CrashReportFactory.reportJniCrash(b.f261105a, b.f261107c, "NativeCrash");
        if (str3 != null) {
            new File(str3).delete();
        }
        if (str4 != null) {
            new File(str4).delete();
        }
        Log.m105920e("MicroMsg.WeChatNativeCrash", "[MAPPINGS]");
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/maps"), 1024);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                Log.m105920e("MicroMsg.WeChatNativeCrash", readLine);
            }
            bufferedReader.close();
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.WeChatNativeCrash", e, "Cannot read dump file: %s", str4);
        } catch (Throwable th4) {
            th.addSuppressed(th4);
        }
        Log.appenderFlush();
        Log.appenderClose();
        if (!MMApplicationContext.isMainProcess()) {
            return false;
        }
        C85672d.C85674b bVar = new C85672d.C85674b(MMApplicationContext.getContext(), "recovery_statistic");
        bVar.mo119256e();
        int i2 = bVar.getInt("crash_count", 0);
        boolean z = bVar.getBoolean("launch_recovery", false);
        boolean z2 = bVar.getBoolean("launch_recovery_real", false);
        boolean z3 = bVar.getBoolean("recover_from_crash", false);
        int i3 = bVar.getInt("recovery_status", -1);
        int i4 = bVar.getInt("recovery_from", 0);
        int i5 = bVar.getInt("recover_internal_status", 0);
        int i6 = bVar.getInt("recover_launch_mode", 0);
        boolean z4 = bVar.getBoolean("recover_is_discard", false);
        bVar.getString("recover_app_ver", "");
        bVar.mo119258g("crash_count", (long) i2);
        bVar.putBoolean("launch_recovery", z);
        bVar.putBoolean("launch_recovery_real", z2);
        bVar.putBoolean("recover_from_crash", z3);
        bVar.putInt("recovery_status", i3);
        bVar.putInt("recovery_from", i4);
        bVar.putInt("recover_internal_status", i5);
        bVar.putInt("recover_launch_mode", i6);
        bVar.putLong("recover_running_time", bVar.getLong("recover_running_time", 0));
        bVar.putBoolean("recover_is_discard", z4);
        bVar.putString("recover_app_ver", BuildInfo.CLIENT_VERSION);
        bVar.mo119242c();
        C85695l.m105842a().mo119282c(4);
        return false;
        throw th;
    }
}
