package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.hook.HookManager;
import com.tencent.matrix.hook.pthread.PthreadHook;
import com.tencent.p014mm.app.C80611s0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import p206nj.C88957l;

/* renamed from: com.tencent.mm.sdk.platformtools.ThreadStackShinkerWrapper */
public class ThreadStackShinkerWrapper {
    private static final String DATA_DIR_NAME = "threadstack_shinker";
    private static final String ENABLED_MARK_FILE_NAME = "enabled";
    private static final String IGNORED_PATTERN_FILE_NAME = "ignored_patterns";
    private static final String TAG = "MicroMsg.ThreadStackShinkerWrapper";

    private static File getDataStoreDir(Context context) {
        File dir = context.getDir(DATA_DIR_NAME, 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    public static boolean isEnabled(Context context) {
        if (!isPreconditionsSatisfied(context)) {
            return false;
        }
        return new File(getDataStoreDir(context), ENABLED_MARK_FILE_NAME).exists();
    }

    private static boolean isPreconditionsSatisfied(Context context) {
        return !BuildInfo.IS_ARM64;
    }

    private static void loadIgnoredCreatorSoPatterns(Context context, PthreadHook.C80382a aVar) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(getDataStoreDir(context), IGNORED_PATTERN_FILE_NAME)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String trim = readLine.trim();
                    aVar.mo111845a(trim);
                    C80611s0.m98247e(TAG, "Pattern %s was loaded into config.", trim);
                } else {
                    bufferedReader.close();
                    return;
                }
            }
        } catch (Throwable th) {
            C80611s0.m98246d(TAG, th, "Fail to load ignored creator so patterns.", new Object[0]);
            return;
        }
        throw th;
    }

    public static void markDisabled(Context context) {
        try {
            if (isPreconditionsSatisfied(context)) {
                File file = new File(getDataStoreDir(context), ENABLED_MARK_FILE_NAME);
                if (file.exists()) {
                    if (!file.delete()) {
                        C80611s0.m98245c(TAG, "[-] Fail to mark disabled.", new Object[0]);
                        return;
                    }
                }
                C80611s0.m98247e(TAG, "[+] Mark disabled successfully.", new Object[0]);
            }
        } catch (Throwable th) {
            Log.printErrStackTrace(TAG, th, "[-] Fail to mark disabled.", new Object[0]);
        }
    }

    public static void markEnabled(Context context) {
        try {
            if (isPreconditionsSatisfied(context)) {
                C80611s0.m98247e(TAG, "[+] markEnabled called.", new Object[0]);
                File file = new File(getDataStoreDir(context), ENABLED_MARK_FILE_NAME);
                if (!file.exists()) {
                    if (!file.createNewFile()) {
                        C80611s0.m98245c(TAG, "[-] Fail to mark enabled.", new Object[0]);
                        return;
                    }
                }
                C80611s0.m98247e(TAG, "[+] Mark enabled successfully.", new Object[0]);
            }
        } catch (Throwable th) {
            C80611s0.m98246d(TAG, th, "[-] Fail to mark enabled.", new Object[0]);
        }
    }

    public static void storeIgnoredCreatorSoPatterns(Context context, String str) {
        PrintWriter printWriter;
        if (TextUtils.isEmpty(str)) {
            Log.m105920e(TAG, "patterns is empty or null, skip processing.");
            return;
        }
        String[] split = str.split("\\s*(?<!\\\\),\\s*");
        if (Util.isNullOrNil(split)) {
            Log.m105920e(TAG, "patterns is empty or null, skip processing.");
            return;
        }
        try {
            printWriter = new PrintWriter(new FileWriter(new File(getDataStoreDir(context), IGNORED_PATTERN_FILE_NAME)));
            for (String str2 : split) {
                C80611s0.m98247e(TAG, "Pattern: %s was stored.", str2);
                printWriter.println(str2);
            }
            printWriter.close();
            return;
        } catch (Throwable th) {
            C80611s0.m98246d(TAG, th, "Fail to store ignored creator so patterns.", new Object[0]);
            return;
        }
        throw th;
    }

    public static void tryToInstall(Context context) {
        if (isPreconditionsSatisfied(context)) {
            if (!isEnabled(context)) {
                C80611s0.m98247e(TAG, "[+] Not enabled, skip installation.", new Object[0]);
                return;
            }
            HookManager hookManager = HookManager.f235267e;
            hookManager.f235271d = new HookManager.C80378b() {
                public void loadLibrary(String str) {
                    C88957l.m111078n(str);
                }
            };
            try {
                PthreadHook.C80382a aVar = new PthreadHook.C80382a();
                aVar.f235310a = true;
                aVar.mo111845a(".*/app_tbs/.*");
                aVar.mo111845a(".*/libmttwebview\\.so$");
                aVar.mo111845a(".*/libmtticu\\.so$");
                aVar.mo111845a(".*/libtbs_v8\\.so$");
                aVar.mo111845a(".*/libmagicbrush\\.so$");
                aVar.mo111845a(".*/lib.*webview.*\\.so$");
                aVar.mo111845a(".*/libc\\.so$");
                loadIgnoredCreatorSoPatterns(context, aVar);
                PthreadHook pthreadHook = PthreadHook.f235303h;
                pthreadHook.f235308f = aVar;
                hookManager.mo111829a(pthreadHook);
                hookManager.mo111830b();
                C80611s0.m98247e(TAG, "[+] install successfully.", new Object[0]);
            } catch (Throwable th) {
                C80611s0.m98246d(TAG, th, "[-] install failed.", new Object[0]);
            }
        }
    }
}
