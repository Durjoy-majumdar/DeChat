package eb0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: eb0.t5 */
public class C75593t5 {

    /* renamed from: c */
    public static C75593t5 f222075c = new C75593t5();

    /* renamed from: d */
    public static boolean f222076d = false;

    /* renamed from: a */
    public SharedPreferences f222077a;

    /* renamed from: b */
    public SharedPreferences f222078b;

    public C75593t5() {
        Context context = MMApplicationContext.getContext();
        this.f222077a = context.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_account_history", 0);
        Context context2 = MMApplicationContext.getContext();
        this.f222078b = context2.getSharedPreferences(MMApplicationContext.getDefaultPreferencePath() + "_account_switch", 0);
    }

    /* renamed from: a */
    public void mo105938a(String str) {
        if (!Util.isNullOrNil(str)) {
            Set stringSet = this.f222078b.getStringSet("first_switch_group", (Set) null);
            if (stringSet == null) {
                stringSet = new HashSet();
            }
            if (!stringSet.contains(str) && stringSet.size() < 5) {
                stringSet.add(str);
            }
            SharedPreferences.Editor edit = this.f222078b.edit();
            edit.remove("first_switch_group").apply();
            edit.putStringSet("first_switch_group", stringSet).commit();
        }
    }

    /* renamed from: b */
    public void mo105939b(String str, String str2) {
        if (!Util.isNullOrNil(str, str2) && !str.equals(str2)) {
            Set<String> stringSet = this.f222078b.getStringSet("first_switch_group", (Set) null);
            if (stringSet == null) {
                stringSet = new HashSet<>();
            }
            if (!stringSet.contains(str) || stringSet.size() >= 5) {
                for (String k : stringSet) {
                    mo105948k(k);
                }
                stringSet.clear();
                stringSet.add(str);
                stringSet.add(str2);
            } else {
                stringSet.add(str2);
            }
            SharedPreferences.Editor edit = this.f222078b.edit();
            edit.remove("first_switch_group").apply();
            edit.putStringSet("first_switch_group", stringSet).commit();
        }
    }

    /* renamed from: c */
    public boolean mo105940c(String str) {
        Set<String> stringSet = this.f222078b.getStringSet("first_switch_group", (Set) null);
        if (stringSet == null) {
            return false;
        }
        return stringSet.contains(str);
    }

    /* renamed from: d */
    public String mo105941d(String str, String str2) {
        try {
            Log.m105925i("MicroMsg.SwitchAccountInfo", "get %s, %s", str, str2);
            if (this.f222077a.contains(str)) {
                String str3 = new String(Base64.decode(this.f222077a.getString(str, ""), 0));
                if (!Util.isNullOrNil(str3)) {
                    Log.m105925i("MicroMsg.SwitchAccountInfo", "get json str %s", str3);
                    JSONObject jSONObject = new JSONObject(str3);
                    if (jSONObject.has(str2)) {
                        return jSONObject.getString(str2);
                    }
                }
            } else {
                Log.m105929w("MicroMsg.SwitchAccountInfo", "account info about %s is not found!", str);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SwitchAccountInfo", "get account info %s about %s failed, error: %s", str2, str, e.getMessage());
        }
        return "";
    }

    /* renamed from: e */
    public Set<String> mo105942e() {
        HashSet hashSet = new HashSet();
        Set<String> stringSet = this.f222078b.getStringSet("first_switch_group", (Set) null);
        if (stringSet != null && !stringSet.isEmpty()) {
            hashSet.addAll(stringSet);
        }
        return hashSet;
    }

    /* renamed from: f */
    public String mo105943f() {
        Set<String> e = mo105942e();
        LinkedList linkedList = new LinkedList();
        Iterator it = ((HashSet) e).iterator();
        while (it.hasNext()) {
            linkedList.add(Util.nullAs(mo105941d((String) it.next(), "last_login_uin"), "0"));
        }
        Log.m105925i("MicroMsg.SwitchAccountInfo", "switch users %s", linkedList);
        return TextUtils.join(";", linkedList);
    }

    /* renamed from: g */
    public String mo105944g() {
        Set<String> e = mo105942e();
        StringBuilder sb = new StringBuilder();
        Iterator it = ((HashSet) e).iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(';');
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        Log.m105925i("MicroMsg.SwitchAccountInfo", "switch users %s", sb.toString());
        return sb.toString();
    }

    /* renamed from: h */
    public void mo105945h(String str, Map<String, String> map) {
        JSONObject jSONObject;
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    if (this.f222077a.contains(str)) {
                        String string = this.f222077a.getString(str, "");
                        jSONObject = !Util.isNullOrNil(string) ? new JSONObject(new String(Base64.decode(string, 0))) : new JSONObject();
                    } else {
                        jSONObject = new JSONObject();
                    }
                    for (String next : map.keySet()) {
                        jSONObject.put(next, map.get(next));
                    }
                    Log.m105925i("MicroMsg.SwitchAccountInfo", "put json str %s", jSONObject.toString());
                    this.f222077a.edit().putString(str, Base64.encodeToString(jSONObject.toString().getBytes(), 0)).commit();
                    return;
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.SwitchAccountInfo", "save account info about %s failed, error: %s", str, e.getMessage());
                return;
            }
        }
        Log.m105924i("MicroMsg.SwitchAccountInfo", "kv map is null or empty!");
    }

    /* renamed from: i */
    public void mo105946i(String str, String str2, String str3) {
        JSONObject jSONObject;
        try {
            if (this.f222077a.contains(str)) {
                String string = this.f222077a.getString(str, "");
                jSONObject = !Util.isNullOrNil(string) ? new JSONObject(new String(Base64.decode(string, 0))) : new JSONObject();
            } else {
                jSONObject = new JSONObject();
            }
            if (!Util.isNullOrNil(str2, str3)) {
                jSONObject.put(str2, str3);
                Log.m105925i("MicroMsg.SwitchAccountInfo", "put key %s, jsonStr %s", str2, jSONObject.toString());
                this.f222077a.edit().putString(str, Base64.encodeToString(jSONObject.toString().getBytes(), 0)).commit();
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.SwitchAccountInfo", "save account info %s about %s failed, error: %s", str2, str, e.getMessage());
        }
    }

    /* renamed from: j */
    public void mo105947j(String str) {
        Set<String> stringSet;
        if (mo105940c(str) && (stringSet = this.f222078b.getStringSet("first_switch_group", (Set) null)) != null) {
            stringSet.remove(str);
            SharedPreferences.Editor edit = this.f222078b.edit();
            edit.remove("first_switch_group").apply();
            edit.putStringSet("first_switch_group", stringSet).commit();
        }
        if (this.f222077a.contains(str)) {
            mo105948k(str);
        }
    }

    /* renamed from: k */
    public void mo105948k(String str) {
        if (this.f222077a.contains(str)) {
            try {
                C86013q1.m106447h(mo105941d(str, "last_avatar_path"));
            } catch (Exception e) {
                Log.m105929w("MicroMsg.SwitchAccountInfo", "remove avatar file error %s", e.getMessage());
            }
            this.f222077a.edit().remove(str).commit();
        }
    }
}
