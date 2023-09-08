package com.tencent.p014mm.booter;

import android.content.SharedPreferences;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.booter.y */
public class C67852y {

    /* renamed from: a */
    public static long f194759a;

    /* renamed from: com.tencent.mm.booter.y$a */
    public static class C67853a {

        /* renamed from: a */
        public int f194760a;

        /* renamed from: b */
        public int f194761b = 1;

        /* renamed from: c */
        public int f194762c;

        /* renamed from: d */
        public int f194763d;

        /* renamed from: e */
        public int f194764e;

        /* renamed from: a */
        public boolean mo93243a(String str) {
            String[] split = str.split(",");
            if (split == null || split.length != 5) {
                Log.m105920e("MicroMsg.ProcessReport", "error format");
                return false;
            }
            try {
                this.f194760a = Util.getInt(split[0], 0);
                this.f194761b = Util.getInt(split[1], 0);
                this.f194762c = Util.getInt(split[2], 0);
                this.f194763d = Util.getInt(split[3], 0);
                this.f194764e = Util.getInt(split[4], 0);
                return true;
            } catch (Exception e) {
                Log.m105920e("MicroMsg.ProcessReport", "ParseFrom parse failed");
                Log.printErrStackTrace("MicroMsg.ProcessReport", e, "", new Object[0]);
                return false;
            }
        }

        public String toString() {
            return String.format("%d,%d,%d,%d,%d", new Object[]{Integer.valueOf(this.f194760a), Integer.valueOf(this.f194761b), Integer.valueOf(this.f194762c), Integer.valueOf(this.f194763d), Integer.valueOf(this.f194764e)});
        }
    }

    /* renamed from: a */
    public static void m80216a(String str) {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences(str, 0);
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV(str);
        MultiProcessMMKV.transport2MMKV(sharedPreferences, singleMMKV);
        String[] split = singleMMKV.getString("startup_info", "").split("=");
        if (split == null || split.length <= 1) {
            Log.m105924i("MicroMsg.ProcessReport", "nothing to reprot");
            return;
        }
        for (int i = 0; i < split.length - 1; i++) {
            Log.m105925i("MicroMsg.ProcessReport", "reprot %s: %s", str, split[i]);
            C115669n.INSTANCE.kvStat(10667, split[i]);
        }
        singleMMKV.edit().putString("startup_info", split[split.length - 1]).commit();
    }

    /* renamed from: b */
    public static String m80217b(String[] strArr) {
        boolean z = true;
        String str = "";
        for (String str2 : strArr) {
            if (z) {
                z = false;
            } else {
                str = str + "=";
            }
            str = str + str2;
        }
        return str;
    }

    /* renamed from: c */
    public static void m80218c(String str) {
        SharedPreferences sharedPreferences = MMApplicationContext.getContext().getSharedPreferences(str, 0);
        MultiProcessMMKV singleMMKV = MultiProcessMMKV.getSingleMMKV(str);
        MultiProcessMMKV.transport2MMKV(sharedPreferences, singleMMKV);
        String[] split = singleMMKV.getString("startup_info", "").split("=");
        if (split != null && split.length != 0) {
            C67853a aVar = new C67853a();
            if (aVar.mo93243a(split[split.length - 1])) {
                aVar.f194761b = 2;
                split[split.length - 1] = aVar.toString();
            }
            String b = m80217b(split);
            Log.m105919d("MicroMsg.ProcessReport", "uerExit new info %s", b);
            singleMMKV.edit().putString("startup_info", b).commit();
        }
    }
}
