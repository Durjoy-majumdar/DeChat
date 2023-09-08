package p429c.p790t.p791m.sapp.p792c;

import android.content.Context;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: c.t.m.sapp.c.i */
public class C113228i implements Runnable {

    /* renamed from: a */
    public Context f338806a;

    /* renamed from: b */
    public List<C113220a> f338807b = null;

    /* renamed from: c */
    public boolean f338808c = false;

    /* renamed from: d */
    public List<C113220a> f338809d = null;

    /* renamed from: e */
    public C113222c f338810e = null;

    /* renamed from: f */
    public boolean f338811f;

    public C113228i(Context context, List<C113220a> list, boolean z) {
        this.f338806a = context;
        this.f338811f = z;
        ArrayList arrayList = new ArrayList();
        this.f338807b = arrayList;
        arrayList.addAll(list);
        this.f338810e = new C113222c(this.f338806a);
    }

    /* renamed from: a */
    public final boolean mo165775a(String str) {
        String d = C113233r.m155019d(C79909m.m97059a(str, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q"));
        if (d == null) {
            return false;
        }
        this.f338809d = C113233r.m155023e(d);
        List<C113220a> e = C113233r.m155023e(C113233r.m155014c(this.f338806a, "__bad_dex_info___sapp", "preference_default_sapp"));
        boolean a = !e.isEmpty() ? C113230l.m154975a(e, this.f338809d) : false;
        boolean a2 = mo165776a(this.f338807b, this.f338809d);
        List<C113220a> e2 = C113233r.m155023e(C113233r.m155014c(this.f338806a, "__SP_UPDATE_TencentLoc_COMP_INFO__sapp_", "preference_default_sapp"));
        boolean a3 = !e2.isEmpty() ? C113230l.m154975a(e2, this.f338809d) : false;
        C113223e a4 = C113223e.m154939a(this.f338806a);
        a4.mo165758a("DRG", "need and samebad:" + a2 + "," + a);
        if (a2 || a || a3) {
            return false;
        }
        C113223e a5 = C113223e.m154939a(this.f338806a);
        a5.mo165758a("DRG", "to download:" + d);
        this.f338810e.mo165753b(this.f338809d);
        return true;
    }

    /* renamed from: b */
    public final boolean mo165777b() {
        return System.currentTimeMillis() - C113233r.m154990a(this.f338806a, "__last_check_update_time___sapp", (Long) 0L).longValue() > 3600000;
    }

    /* renamed from: c */
    public final boolean mo165778c() {
        byte[] bytes;
        String a = mo165774a();
        if (a != null && (bytes = a.getBytes()) != null) {
            new HashMap();
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i >= 3) {
                    break;
                }
                byte[] a2 = C39880p.m42653a("https://cc.map.qq.com?desc_c", bytes);
                if (a2 != null) {
                    String str = new String(a2);
                    C113223e a3 = C113223e.m154939a(this.f338806a);
                    a3.mo165758a("DRG", "response suc,try:" + i2);
                    return mo165775a(str);
                }
                C113233r.m154996a(10000);
                i = i2;
            }
        }
        return false;
    }

    public void run() {
        boolean b = mo165777b();
        C113223e a = C113223e.m154939a(this.f338806a);
        a.mo165758a("DRG", "t:" + b + ",i:" + this.f338811f);
        mo165778c();
        C113233r.m155008b(this.f338806a, "__last_check_update_time___sapp", Long.valueOf(System.currentTimeMillis()));
        C113223e.m154939a(this.f338806a).mo165762d();
    }

    /* renamed from: a */
    public final boolean mo165776a(List<C113220a> list, List<C113220a> list2) {
        boolean z;
        boolean z2 = true;
        for (C113220a next : list) {
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

    /* renamed from: a */
    public final String mo165774a() {
        JSONObject jSONObject = new JSONObject();
        String str = this.f338806a.getFilesDir().getAbsolutePath() + File.separator + C113233r.f338823b;
        try {
            jSONObject.put("appkey", C113233r.m155031k(this.f338806a));
            jSONObject.put("appversion", C113233r.m155005b(this.f338806a));
            jSONObject.put("imei", C113233r.m155027g(this.f338806a));
            jSONObject.put("coverSDKver", C113227h.f338802a);
            StringBuilder sb = new StringBuilder();
            sb.append(C113233r.m155021e());
            sb.append("_");
            sb.append(C113233r.m155025f());
            jSONObject.put("model", sb.toString());
            jSONObject.put("APILevel", C113233r.m155004b());
            JSONArray jSONArray = new JSONArray();
            List<C113220a> list = this.f338807b;
            if (list != null) {
                for (C113220a next : list) {
                    if (next != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("compId", next.f338770a);
                        jSONObject2.put("compVer", next.f338771b);
                        jSONObject2.put("size", next.f338773d);
                        jSONObject2.put("md5", C113233r.m154991a(new File(str, next.f338772c)));
                        jSONArray.put(jSONObject2);
                    }
                }
            }
            jSONObject.put("compList", jSONArray);
            String jSONObject3 = jSONObject.toString();
            C113223e a = C113223e.m154939a(this.f338806a);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("req:");
            sb4.append(jSONObject3);
            a.mo165758a("DRG", sb4.toString());
            return C79909m.m97068b(jSONObject3, "sE0zy%DVqLnXA$hmNZ8NBwcg7FDrvi!q");
        } catch (Exception e) {
            C113223e.m154939a(this.f338806a).mo165758a("DRG", "reqDerror:" + e.toString());
            return null;
        }
    }
}
