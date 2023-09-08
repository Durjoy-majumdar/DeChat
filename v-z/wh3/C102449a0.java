package wh3;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wh3.a0 */
public class C102449a0 extends MStorage {

    /* renamed from: d */
    public final LinkedList<C102452z> f301700d;

    public C102449a0() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_RECENT_SMILEY_STRING;
        LinkedList<C102452z> linkedList = new LinkedList<>();
        this.f301700d = linkedList;
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(aVar, "");
        try {
            synchronized (linkedList) {
                linkedList.clear();
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    C102452z zVar = new C102452z();
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    zVar.f301705a = jSONObject.optString("key", "");
                    zVar.f301706b = jSONObject.optInt("use_count", 0);
                    zVar.f301707c = jSONObject.optLong("last_time", 0);
                    this.f301700d.add(zVar);
                }
            }
        } catch (JSONException unused) {
            Log.m105928w("SmileyUsageInfoStorage", "data error clear all");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, (Object) null);
            this.f301700d.clear();
        }
    }

    /* renamed from: jo */
    public List<C102452z> mo142017jo() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f301700d) {
            Iterator<C102452z> it = this.f301700d.iterator();
            while (it.hasNext()) {
                C102452z next = it.next();
                if (C96926b0.m124490b().mo135517a(next.f301705a)) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }
}
