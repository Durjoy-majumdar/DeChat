package gb0;

import android.content.SharedPreferences;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: gb0.a */
public abstract class C75895a {

    /* renamed from: a */
    public List<C75901e> f222571a = new ArrayList();

    /* renamed from: b */
    public String f222572b = mo106159e();

    /* renamed from: c */
    public String[] f222573c = mo106158d();

    /* renamed from: a */
    public void mo106155a(C75901e eVar) {
        if (!((ArrayList) this.f222571a).contains(eVar)) {
            ((ArrayList) this.f222571a).add(eVar);
        }
    }

    /* renamed from: b */
    public void mo106156b(String str) {
        SharedPreferences H = C97625j3.m125812b().mo105882H("banner");
        if (H != null) {
            H.edit().remove(this.f222572b + str).commit();
            String[] strArr = this.f222573c;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2 != null) {
                        H.edit().remove(this.f222572b + str2 + str).commit();
                    }
                }
            }
            Iterator it = ((ArrayList) this.f222571a).iterator();
            while (it.hasNext()) {
                ((C75901e) it.next()).mo102640b();
            }
        }
    }

    /* renamed from: c */
    public String mo106157c(String str, String str2) {
        SharedPreferences H = C97625j3.m125812b().mo105882H("banner");
        if (H == null || str2 == null) {
            return null;
        }
        return H.getString(this.f222572b + str2 + str, (String) null);
    }

    /* renamed from: d */
    public String[] mo106158d() {
        return null;
    }

    /* renamed from: e */
    public abstract String mo106159e();

    /* renamed from: f */
    public boolean mo106160f(String str) {
        SharedPreferences H = C97625j3.m125812b().mo105882H("banner");
        if (H == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f222572b);
        sb.append(str);
        return H.getBoolean(sb.toString(), false);
    }

    /* renamed from: g */
    public void mo106161g(String str, boolean z, String[] strArr) {
        SharedPreferences H = C97625j3.m125812b().mo105882H("banner");
        if (H != null) {
            H.edit().putBoolean(this.f222572b + str, z).commit();
            String[] strArr2 = this.f222573c;
            if (!(strArr2 == null || strArr == null || strArr2.length != strArr.length)) {
                int i = 0;
                for (String str2 : strArr2) {
                    if (str2 != null) {
                        String str3 = strArr[i];
                        if (str3 == null) {
                            str3 = "";
                        }
                        H.edit().putString(this.f222572b + str2 + str, str3).commit();
                    }
                    i++;
                }
            }
            Iterator it = ((ArrayList) this.f222571a).iterator();
            while (it.hasNext()) {
                ((C75901e) it.next()).mo102639a(z);
            }
        }
    }
}
