package p429c.p790t.p791m.sapp.p792c;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.t.m.sapp.c.g */
public class C113226g {
    /* renamed from: a */
    public static void m154954a(Context context) {
        boolean z;
        Iterator<C113220a> it;
        String str;
        byte[] bArr;
        boolean z2;
        Context context2 = context;
        m154955b(context);
        List<String> c = m154956c(context);
        List<C113220a> e = C113233r.m155023e(C113233r.m155014c(context2, "__SP_Tencent_Loc_COMP_INFO__sapp_", ""));
        if (c == null || c.size() == 0 || e.size() == 0) {
            z = false;
        } else {
            z = true;
            for (C113220a next : e) {
                Iterator<String> it4 = c.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z2 = false;
                        break;
                    }
                    String[] split = it4.next().split(",");
                    if (split.length == 3 && next.f338772c.equals(split[0]) && String.valueOf(next.f338773d).equals(split[1]) && next.f338774e.equals(split[2])) {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    z = false;
                }
            }
        }
        if (z) {
            byte[] bArr2 = new byte[2048];
            StringBuilder sb = new StringBuilder();
            sb.append(context.getFilesDir().getAbsolutePath());
            String str2 = File.separator;
            sb.append(str2);
            sb.append(C113233r.f338823b);
            String sb4 = sb.toString();
            String str3 = context.getFilesDir().getAbsolutePath() + str2 + "TencentLocation_sapp/lastComp";
            ArrayList arrayList = new ArrayList();
            Iterator<C113220a> it5 = e.iterator();
            boolean z3 = false;
            while (it5.hasNext()) {
                C113220a next2 = it5.next();
                File file = new File(str3, next2.f338772c);
                if (file.exists()) {
                    if (next2.f338774e.equals(C113233r.m154991a(file))) {
                        bArr = bArr2;
                        str = sb4;
                        it = it5;
                        bArr2 = bArr;
                        sb4 = str;
                        it5 = it;
                    }
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                String str4 = File.separator;
                sb5.append(str4);
                sb5.append(next2.f338772c);
                bArr = bArr2;
                str = sb4;
                it = it5;
                C113220a aVar = next2;
                String str5 = str4;
                String str6 = "tmp__sapp";
                if (C113233r.m155009b(context, sb5.toString(), str3, "tmp__sapp" + next2.f338772c, (long) next2.f338773d, bArr)) {
                    arrayList.add(aVar);
                    bArr2 = bArr;
                    sb4 = str;
                    it5 = it;
                } else {
                    File file2 = new File(str3 + str5 + str6 + aVar.f338772c);
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                    bArr2 = bArr;
                    sb4 = str;
                    it5 = it;
                    z3 = true;
                }
            }
            String str7 = "tmp__sapp";
            if (z3) {
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    File file3 = new File(str3 + File.separator + str7 + ((C113220a) it6.next()).f338772c);
                    if (file3.exists() && file3.isFile()) {
                        file3.delete();
                    }
                }
            } else if (e.size() == arrayList.size()) {
                Iterator it7 = arrayList.iterator();
                while (it7.hasNext()) {
                    C113220a aVar2 = (C113220a) it7.next();
                    File file4 = new File(str3, aVar2.f338772c);
                    if (file4.exists() && file4.isFile()) {
                        file4.delete();
                    }
                    new File(str3, str7 + aVar2.f338772c).renameTo(file4);
                }
                C113233r.m155020d(context2, "__SP_LAST_TencentLoc_COMP_INFO__sapp_", C113233r.m154992a((List<C113220a>) arrayList));
                C113233r.m155020d(context2, "__SP_LAST_TencentLoc_COMP_SDK_VER__sapp_", C113227h.f338802a);
            }
        }
    }

    /* renamed from: b */
    public static void m154955b(Context context) {
        File file = new File(context.getFilesDir(), "TencentLocation_sapp/lastComp");
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: c */
    public static List<String> m154956c(Context context) {
        File[] listFiles;
        File file = new File(context.getFilesDir(), C113233r.f338823b);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : listFiles) {
            arrayList.add(file2.getName() + "," + file2.length() + "," + C113233r.m154991a(file2));
        }
        return arrayList;
    }
}
