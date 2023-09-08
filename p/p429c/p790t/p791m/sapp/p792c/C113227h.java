package p429c.p790t.p791m.sapp.p792c;

import android.content.Context;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.t.m.sapp.c.h */
public class C113227h {

    /* renamed from: a */
    public static String f338802a = "6.10.8.1";

    /* renamed from: b */
    public static C113227h f338803b;

    /* renamed from: c */
    public Context f338804c;

    /* renamed from: d */
    public List<C113220a> f338805d = new ArrayList();

    public C113227h(Context context) {
        this.f338804c = context;
    }

    /* renamed from: a */
    public static C113227h m154957a(Context context) {
        if (f338803b == null) {
            synchronized (C113227h.class) {
                if (f338803b == null) {
                    f338803b = new C113227h(context);
                }
            }
        }
        return f338803b;
    }

    /* renamed from: b */
    public DexClassLoader mo165771b() {
        mo165769a();
        if (C113230l.m154976b(this.f338804c) == 6) {
            C113230l.m154977c(this.f338804c);
        }
        if (!mo165770a(true, mo165768a("__SP_Tencent_Loc_COMP_INFO__sapp_"), C113233r.f338823b)) {
            mo165773d();
        }
        return C113221b.m154930a(this.f338804c).mo165748a(mo165768a("__SP_Tencent_Loc_COMP_INFO__sapp_"), C113233r.f338823b);
    }

    /* renamed from: c */
    public final void mo165772c() {
        File file = new File(this.f338804c.getFilesDir(), C113233r.f338823b);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(this.f338804c.getFilesDir(), C113233r.f338824c);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        C113230l.m154973a(this.f338804c);
    }

    /* renamed from: d */
    public void mo165773d() {
        C113223e.m154939a(this.f338804c).mo165758a("DCR", "goback");
        if (!C113230l.m154978d(this.f338804c)) {
            C113223e.m154939a(this.f338804c).mo165758a("DCR", "copy from asset failed");
        }
    }

    /* renamed from: a */
    public boolean mo165769a() {
        mo165772c();
        String str = f338802a;
        String c = C113233r.m155014c(this.f338804c, "__Tencent_Cover_SDK_Version__sapp_", "");
        C113229j.m154971a("cv:" + c + "_" + str);
        C113223e a = C113223e.m154939a(this.f338804c);
        a.mo165758a("DCV", c + "_" + str);
        if (str.equals(c)) {
            return false;
        }
        System.currentTimeMillis();
        if (!C113230l.m154978d(this.f338804c)) {
            C113229j.m154971a("copy to private dir failed");
            return false;
        }
        C113233r.m155020d(this.f338804c, "__Tencent_Cover_SDK_Version__sapp_", str);
        C113233r.m155020d(this.f338804c, "__pro_dex_load_info___sapp", "default");
        C113233r.m155020d(this.f338804c, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "");
        C113233r.m155002a(this.f338804c.getFilesDir().getAbsolutePath() + File.separator + "TencentLocation_sapp/UpCp");
        return true;
    }

    /* renamed from: a */
    public boolean mo165770a(boolean z, List<C113220a> list, String str) {
        boolean z2;
        List<String> a = C113233r.m154994a(this.f338804c, new File(this.f338804c.getFilesDir(), str));
        if (a == null || a.size() == 0 || list.size() == 0) {
            C113229j.m154971a("private dir files is empty");
            C113223e.m154939a(this.f338804c).mo165758a("DLC", "localComp file error");
            return false;
        }
        String c = C113233r.m155014c(this.f338804c, "__bad_dex_info___sapp", "preference_default_sapp");
        List<C113220a> e = C113233r.m155023e(c);
        if (!c.equals("preference_default_sapp") && !e.isEmpty() && C113230l.m154975a(list, e)) {
            return false;
        }
        boolean z3 = true;
        for (C113220a next : list) {
            Iterator<String> it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                String[] split = it.next().split(",");
                if (split.length == 3 && next.f338772c.equals(split[0]) && String.valueOf(next.f338773d).equals(split[1]) && next.f338774e.equals(split[2])) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                z3 = false;
            }
        }
        return z3;
    }

    /* renamed from: a */
    public List<C113220a> mo165768a(String str) {
        List<C113220a> e = C113233r.m155023e(C113233r.m155014c(this.f338804c, str, ""));
        if (e.size() == 0) {
            C113223e.m154939a(this.f338804c).mo165758a("DLC", "localComp parse error");
        }
        return e;
    }
}
