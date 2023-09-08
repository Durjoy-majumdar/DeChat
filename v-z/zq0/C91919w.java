package zq0;

import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: zq0.w */
public final class C91919w {

    /* renamed from: a */
    public static final C91919w f263170a = new C91919w();

    /* renamed from: b */
    public static final MultiProcessMMKV f263171b = MultiProcessMMKV.getMMKV("MicroMsg.PhoneItemsManager");

    /* renamed from: a */
    public final void mo125746a(PhoneItem phoneItem) {
        C87412m.m108594g(phoneItem, "phoneItem");
        ArrayList arrayList = (ArrayList) mo125747b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((PhoneItem) it.next()).f245279o = false;
        }
        if (arrayList.contains(phoneItem)) {
            arrayList.set(arrayList.indexOf(phoneItem), phoneItem);
        } else {
            arrayList.add(phoneItem);
        }
        mo125749d(arrayList);
    }

    /* renamed from: b */
    public final List<PhoneItem> mo125747b() {
        JSONArray jSONArray;
        try {
            jSONArray = new JSONArray(f263171b.getString("PhoneItemsManager#PhoneItems", "{}"));
        } catch (Exception e) {
            Log.m105921e("MicroMsg.PhoneItemsManager", "e:%s", e);
            jSONArray = null;
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                PhoneItem.C84013a aVar = PhoneItem.f245270q;
                String string = jSONArray.getString(i);
                C87412m.m108593f(string, "jsonArray.getString(i)");
                PhoneItem a = aVar.mo116667a(string);
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        Log.m105919d("MicroMsg.PhoneItemsManager", "get %s", String.valueOf(jSONArray));
        return arrayList;
    }

    /* renamed from: c */
    public final List<PhoneItem> mo125748c(List<PhoneItem> list, List<PhoneItem> list2) {
        boolean z;
        if (list == null) {
            return null;
        }
        if (list2 != null) {
            Iterator<PhoneItem> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PhoneItem next = it.next();
                if (next.f245279o) {
                    Iterator<PhoneItem> it4 = list.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        PhoneItem next2 = it4.next();
                        if (C87412m.m108589b(next.f245271d, next2.f245271d)) {
                            next2.f245279o = true;
                            z = true;
                            break;
                        }
                    }
                }
            }
            if (!z && list.size() >= 1) {
                list.get(0).f245279o = true;
            }
            Log.m105927v("MicroMsg.PhoneItemsManager", "init oldphoneItems:%s", list2);
            Log.m105927v("MicroMsg.PhoneItemsManager", "init phoneItems:%s", list);
            return list;
        }
        z = false;
        list.get(0).f245279o = true;
        Log.m105927v("MicroMsg.PhoneItemsManager", "init oldphoneItems:%s", list2);
        Log.m105927v("MicroMsg.PhoneItemsManager", "init phoneItems:%s", list);
        return list;
    }

    /* renamed from: d */
    public final void mo125749d(List<PhoneItem> list) {
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (PhoneItem next : list) {
                next.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("mobile", next.f245271d);
                jSONObject.put("show_mobile", next.f245272e);
                jSONObject.put("need_auth", next.f245276i);
                jSONObject.put("allow_send_sms", next.f245277j);
                jSONObject.put("encryptedData", next.f245273f);
                jSONObject.put("iv", next.f245274g);
                jSONObject.put("cloud_id", next.f245275h);
                jSONObject.put("is_wechat", next.f245278n);
                jSONObject.put("is_check", next.f245279o);
                jSONObject.put("data", next.f245280p);
                String jSONObject2 = jSONObject.toString();
                C87412m.m108593f(jSONObject2, "jsonObject.toString()");
                jSONArray.put(jSONObject2);
            }
            MultiProcessMMKV multiProcessMMKV = f263171b;
            multiProcessMMKV.putString("PhoneItemsManager#PhoneItems", jSONArray.toString());
            multiProcessMMKV.commit();
            Log.m105919d("MicroMsg.PhoneItemsManager", "savePhoneNumbers %s", jSONArray.toString());
        }
    }

    /* renamed from: e */
    public final void mo125750e(PhoneItem phoneItem) {
        List<PhoneItem> b = mo125747b();
        if (phoneItem != null) {
            ArrayList arrayList = (ArrayList) b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((PhoneItem) it.next()).f245279o = false;
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                PhoneItem phoneItem2 = (PhoneItem) it4.next();
                if (C87412m.m108589b(phoneItem.f245271d, phoneItem2.f245271d)) {
                    phoneItem2.f245279o = true;
                }
            }
        }
        mo125749d(b);
        Log.m105927v("MicroMsg.PhoneItemsManager", "uninit phoneItems:%s", b);
    }
}
