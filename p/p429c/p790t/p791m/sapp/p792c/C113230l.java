package p429c.p790t.p791m.sapp.p792c;

import android.app.ActivityManager;
import android.content.Context;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.t.m.sapp.c.l */
public class C113230l {
    /* renamed from: a */
    public static boolean m154974a(Context context, int i) {
        try {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == i) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static int m154976b(Context context) {
        List<C113220a> e = C113233r.m155023e(C113233r.m155014c(context, "__SP_Tencent_Loc_COMP_INFO__sapp_", ""));
        int e2 = m154979e(context);
        if (e2 <= 3) {
            C113233r.m155020d(context, "__pro_dex_load_info___sapp", "default");
        }
        if (e == null || e.equals("")) {
            return 0;
        }
        String c = C113233r.m155014c(context, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "");
        if (c == null || c.equals("")) {
            return 1;
        }
        return m154975a(e, C113233r.m155023e(c)) ? e2 <= 3 ? 2 : 3 : e2 <= 3 ? 6 : 5;
    }

    /* renamed from: c */
    public static boolean m154977c(Context context) {
        String c;
        List<C113220a> e;
        Context context2 = context;
        if (!C113233r.m155014c(context2, "__SP_UPDATE_TencentLoc_COMP_SDK_VER__sapp_", "").equals(C113227h.f338802a) || (c = C113233r.m155014c(context2, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "")) == null || c.equals("") || (e = C113233r.m155023e(c)) == null || e.isEmpty()) {
            return false;
        }
        String c2 = C113233r.m155014c(context2, "__bad_dex_info___sapp", "preference_default_sapp");
        List<C113220a> e2 = C113233r.m155023e(c2);
        if (!c2.equals("preference_default_sapp") && !e2.isEmpty() && m154975a(e, e2)) {
            return false;
        }
        byte[] bArr = new byte[2048];
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(C113233r.f338823b);
        String sb4 = sb.toString();
        String str2 = context.getFilesDir().getAbsolutePath() + str + "TencentLocation_sapp/UpCp";
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C113220a next : e) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str2);
            String str3 = File.separator;
            sb5.append(str3);
            sb5.append(next.f338772c);
            List<C113220a> list = e;
            C113220a aVar = next;
            String str4 = str2;
            String str5 = str3;
            String str6 = "tmp_backup__sapp";
            if (!C113233r.m155009b(context, sb5.toString(), sb4, "tmp_backup__sapp" + next.f338772c, (long) next.f338773d, bArr)) {
                File file = new File(sb4 + str5 + str6 + aVar.f338772c);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
                e = list;
                str2 = str4;
                z = false;
            } else {
                arrayList.add(aVar);
                e = list;
                str2 = str4;
            }
        }
        String str7 = "tmp_backup__sapp";
        List<C113220a> list2 = e;
        if (!z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file2 = new File(sb4 + File.separator + str7 + ((C113220a) it.next()).f338772c);
                if (file2.exists() && file2.isFile()) {
                    file2.delete();
                }
            }
            arrayList.clear();
            return false;
        } else if (list2.size() != arrayList.size()) {
            return false;
        } else {
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                C113220a aVar2 = (C113220a) it4.next();
                File file3 = new File(sb4, aVar2.f338772c);
                if (file3.exists() && file3.isFile()) {
                    file3.delete();
                }
                new File(sb4, str7 + aVar2.f338772c).renameTo(file3);
            }
            String a = C113233r.m154992a((List<C113220a>) arrayList);
            C113233r.m155020d(context2, "__SP_Tencent_Loc_COMP_INFO__sapp_", a);
            C113223e.m154939a(context).mo165758a("DBC", a);
            return true;
        }
    }

    /* renamed from: d */
    public static boolean m154978d(Context context) {
        String str;
        boolean z;
        Context context2 = context;
        String c = C113233r.m155013c(context);
        if (!C113233r.m155002a(c)) {
            C113229j.m154971a("clear private dir failed");
        }
        StringBuilder sb = new StringBuilder();
        String str2 = "TencentLocationComp_sapp";
        sb.append(str2);
        sb.append(File.separator);
        sb.append("comp_list");
        String b = C113233r.m155006b(context2, sb.toString());
        C113229j.m154971a("base comp info:" + b);
        List<C113220a> e = C113233r.m155023e(b);
        byte[] bArr = new byte[2048];
        ArrayList arrayList = new ArrayList();
        Iterator<C113220a> it = e.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "tmp_asset__sapp";
                z = true;
                break;
            }
            C113220a next = it.next();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            String str3 = File.separator;
            sb4.append(str3);
            sb4.append(next.f338772c);
            next.f338772c += ShareConstants.DEX_SUFFIX;
            String str4 = "tmp_asset__sapp" + next.f338772c;
            String str5 = str4;
            String str6 = str2;
            Iterator<C113220a> it4 = it;
            C113220a aVar = next;
            String str7 = str3;
            str = "tmp_asset__sapp";
            if (!C113233r.m155000a(context, sb4.toString(), c, str4, (long) next.f338773d, bArr)) {
                File file = new File(c + str7 + str5);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
                z = false;
            } else {
                arrayList.add(aVar);
                str2 = str6;
                it = it4;
            }
        }
        if (!z) {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                File file2 = new File(c + File.separator + str + ((C113220a) it5.next()).f338772c);
                if (file2.exists() && file2.isFile()) {
                    file2.delete();
                }
            }
            return false;
        } else if (arrayList.size() != e.size()) {
            return false;
        } else {
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                C113220a aVar2 = (C113220a) it6.next();
                File file3 = new File(c, aVar2.f338772c);
                if (file3.exists() && file3.isFile()) {
                    file3.delete();
                }
                new File(c, str + aVar2.f338772c).renameTo(file3);
            }
            C113233r.m155020d(context2, "__SP_Tencent_Loc_COMP_INFO__sapp_", C113233r.m154992a(e));
            return true;
        }
    }

    /* renamed from: e */
    public static int m154979e(Context context) {
        String c = C113233r.m155014c(context, "__pro_dex_load_info___sapp", "default");
        boolean z = true;
        if (c.equals("default")) {
            return 1;
        }
        try {
            String[] split = c.split("#");
            if (split != null && split.length > 0) {
                boolean z2 = true;
                for (String split2 : split) {
                    String[] split3 = split2.split("&");
                    if (split3 != null && split3.length == 2) {
                        String str = split3[1];
                        if (m154974a(context, Integer.parseInt(split3[0]))) {
                            z2 = false;
                        }
                    }
                }
                z = z2;
            }
            return z ? 3 : 4;
        } catch (Exception unused) {
            return 4;
        }
    }

    /* renamed from: f */
    public static void m154980f(Context context) {
        String d = C113233r.m155018d(context);
        if (d != null) {
            int g = C113233r.m155026g();
            String c = C113233r.m155014c(context, "__pro_dex_load_info___sapp", "default");
            if (c.equals("default")) {
                C113233r.m155020d(context, "__pro_dex_load_info___sapp", g + "&" + d + "#");
                return;
            }
            try {
                String[] split = c.split("#");
                if (split != null && split.length > 0) {
                    boolean z = false;
                    for (int i = 0; i < split.length; i++) {
                        String[] split2 = split[i].split("&");
                        if (split2 != null && split2.length == 2) {
                            String str = split2[1];
                            Integer.parseInt(split2[0]);
                            if (d.equals(str)) {
                                split[i] = g + "&" + d;
                                z = true;
                            }
                        }
                    }
                    String str2 = "";
                    for (int i2 = 0; i2 < split.length; i2++) {
                        str2 = str2 + split[i2] + "#";
                    }
                    if (!z) {
                        str2 = str2 + g + "&" + d + "#";
                    }
                    C113233r.m155020d(context, "__pro_dex_load_info___sapp", str2);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m154973a(Context context) {
        try {
            File file = new File(context.getFilesDir(), C113233r.f338824c);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.canRead() && file.canWrite()) {
                if (file.canExecute()) {
                    C113223e.m154940b().mo165758a("DMK", "ods:ok");
                    return;
                }
            }
            boolean readable = file.setReadable(true);
            boolean writable = file.setWritable(true);
            boolean executable = file.setExecutable(true);
            C113223e b = C113223e.m154940b();
            StringBuilder sb = new StringBuilder();
            sb.append("ods:");
            sb.append(writable);
            sb.append("_");
            sb.append(readable);
            sb.append("_");
            sb.append(executable);
            b.mo165758a("DMK", sb.toString());
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2.canRead() && file2.canWrite()) {
                        if (file2.canExecute()) {
                            C113223e.m154940b().mo165758a("DMK", "ofs:ok");
                        }
                    }
                    boolean writable2 = file2.setWritable(true);
                    boolean readable2 = file2.setReadable(true);
                    boolean executable2 = file2.setExecutable(true);
                    C113223e b2 = C113223e.m154940b();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("ofs:");
                    sb4.append(writable2);
                    sb4.append("_");
                    sb4.append(readable2);
                    sb4.append("_");
                    sb4.append(executable2);
                    b2.mo165758a("DMK", sb4.toString());
                }
            }
        } catch (Throwable th) {
            C113223e.m154940b().mo165758a("DMK", "exp:" + th.toString());
        }
    }

    /* renamed from: a */
    public static boolean m154975a(List<C113220a> list, List<C113220a> list2) {
        boolean z;
        boolean z2 = true;
        for (C113220a next : list) {
            if (!next.f338772c.contains(ShareConstants.DEX_SUFFIX)) {
                next.f338772c += ShareConstants.DEX_SUFFIX;
            }
            Iterator<C113220a> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C113220a next2 = it.next();
                if (!next2.f338772c.contains(ShareConstants.DEX_SUFFIX)) {
                    next2.f338772c += ShareConstants.DEX_SUFFIX;
                }
                if (next.f338772c.equals(next2.f338772c) && next.f338773d == next2.f338773d && next.f338774e.equals(next2.f338774e)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                z2 = false;
            }
        }
        return z2;
    }
}
