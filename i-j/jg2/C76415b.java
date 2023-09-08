package jg2;

import android.telephony.PhoneNumberUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kg2.C76574a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: jg2.b */
public class C76415b extends C86301e {

    /* renamed from: d */
    public List<C76574a> f223734d = null;

    public static C76415b wx0() {
        return (C76415b) C86312j.m106911c(C76415b.class);
    }

    public static C76574a yx0() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        if (!Util.isNullOrNil(str)) {
            return new C76574a(str, MMApplicationContext.getContext().getString(C0966R.string.l6z), 3);
        }
        return null;
    }

    public boolean vx0(C76574a aVar) {
        if (aVar == null || !PhoneNumberUtils.isGlobalPhoneNumber(aVar.f224103a)) {
            return false;
        }
        List<C76574a> xx02 = xx0();
        Iterator<C76574a> it = xx02.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C76574a next = it.next();
            if (aVar.f224103a.equals(next.f224103a)) {
                if (Util.isNullOrNil(aVar.f224104b)) {
                    aVar.f224104b = next.f224104b;
                }
                xx02.remove(next);
            }
        }
        xx02.add(0, aVar);
        zx0(xx02);
        return true;
    }

    public List<C76574a> xx0() {
        List<C76574a> list = this.f223734d;
        if (list != null) {
            return list;
        }
        this.f223734d = new LinkedList();
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(270337, (Object) null);
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.SubCoreRecharge", "empty history");
            return this.f223734d;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < Math.min(jSONArray.length(), 100); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.optString("name");
                String optString2 = jSONObject.optString("record");
                C76574a aVar = !Util.isNullOrNil(optString2) ? new C76574a(optString2, optString, jSONObject.optString(FirebaseAnalytics.C113379b.LOCATION), 2) : null;
                if (aVar != null) {
                    this.f223734d.add(aVar);
                }
            }
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.SubCoreRecharge", e, "", new Object[0]);
            String[] split = str.split("&");
            if (split != null && split.length > 0) {
                for (int i2 = 0; i2 < Math.min(split.length, 100); i2++) {
                    String[] split2 = split[i2].split("=");
                    if (split2.length == 2) {
                        this.f223734d.add(new C76574a(split2[0], split2[1], 2));
                    } else if (split2.length == 1) {
                        this.f223734d.add(new C76574a(split2[0], "", 2));
                    }
                }
            }
        }
        Log.m105924i("MicroMsg.SubCoreRecharge", "getMobileHistory : " + this.f223734d.size());
        return this.f223734d;
    }

    public void zx0(List<C76574a> list) {
        this.f223734d = list;
        if (list == null || list.size() == 0) {
            this.f223734d = new LinkedList();
        } else if (list.size() > 10) {
            for (int size = list.size() - 1; size >= 10; size--) {
                list.remove(size);
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (C76574a next : this.f223734d) {
            next.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("record", Util.nullAs(next.f224103a, ""));
                jSONObject.put("name", Util.nullAs(next.f224104b, ""));
                jSONObject.put(FirebaseAnalytics.C113379b.LOCATION, Util.nullAs(next.f224105c, ""));
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.MallInputRecord", e, "", new Object[0]);
                jSONObject = null;
            }
            jSONArray.put(jSONObject);
            Log.m105925i("MicroMsg.SubCoreRecharge", "number: %s", next.f224104b);
        }
        Log.m105918d("MicroMsg.SubCoreRecharge", "setMobileHistory : " + jSONArray.toString());
        C86709a0.m107535s().mo121142i().mo119676J(270337, jSONArray.toString());
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }
}
