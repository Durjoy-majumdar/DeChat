package com.tencent.p014mm.pluginsdk.cmd;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import java.util.regex.Pattern;
import yc3.C38992a;

/* renamed from: com.tencent.mm.pluginsdk.cmd.a */
public class C30650a {

    /* renamed from: a */
    public static final HashMap<String, C38992a> f82494a = new HashMap<>();

    /* renamed from: b */
    public static final HashMap<String, C6643a> f82495b = new HashMap<>();

    /* renamed from: c */
    public static final Pattern f82496c = Pattern.compile(" +");

    /* renamed from: com.tencent.mm.pluginsdk.cmd.a$a */
    public static class C6643a {
    }

    /* renamed from: a */
    public static boolean m39146a(Context context, String str, String str2) {
        C38992a aVar;
        String[] split = f82496c.split(str);
        HashMap<String, C38992a> hashMap = f82494a;
        synchronized (hashMap) {
            aVar = hashMap.get(split[0]);
        }
        if (aVar == null) {
            return false;
        }
        Log.m105925i("MicroMsg.UnifiedCommandProcessor", "Command: %s", split[0]);
        return aVar.mo38a(context, split, str2);
    }

    /* renamed from: b */
    public static void m39147b(C38992a aVar, String... strArr) {
        synchronized (f82494a) {
            for (String str : strArr) {
                C38992a put = f82494a.put(str, aVar);
                Log.m105925i("MicroMsg.UnifiedCommandProcessor", "Registered command: %s", str);
            }
        }
    }

    /* renamed from: c */
    public static void m39148c(String... strArr) {
        synchronized (f82494a) {
            for (String str : strArr) {
                f82494a.remove(str);
                Log.m105925i("MicroMsg.UnifiedCommandProcessor", "Unregistered command: %s", str);
            }
        }
    }
}
