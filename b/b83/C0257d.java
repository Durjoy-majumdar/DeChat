package b83;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import f40.C86709a0;
import f62.C75700k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lv1.C99681n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: b83.d */
public class C0257d extends C0251a<C99681n> {

    /* renamed from: c */
    public List<C99681n> f799c;

    /* renamed from: d */
    public List<String> f800d;

    /* renamed from: e */
    public boolean f801e;

    public C0257d(String str, List<String> list) {
        super(str, Integer.MAX_VALUE);
        this.f800d = list;
    }

    /* renamed from: a */
    public void mo289a(List<C99681n> list) {
        this.f799c = list;
        if (list != null) {
            ArrayList arrayList = new ArrayList(this.f800d.size());
            Iterator<C99681n> it = this.f799c.iterator();
            while (it.hasNext()) {
                C99681n next = it.next();
                int indexOf = this.f800d.indexOf(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(next.f292151e).getUsername());
                if (indexOf >= 0) {
                    if (indexOf < arrayList.size()) {
                        arrayList.add(indexOf, next);
                    } else {
                        arrayList.add(next);
                    }
                    it.remove();
                }
            }
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.f799c.add(0, (C99681n) arrayList.get(size));
            }
        }
        this.f801e = true;
    }

    /* renamed from: b */
    public void mo295b(C99681n nVar, C72996z1 z1Var, JSONObject jSONObject) {
        String str = nVar.f292154h;
        Context context = MMApplicationContext.getContext();
        String replaceFirst = str.replaceFirst(this.f791a, "<em class=\\\"highlight\\\">" + this.f791a + "</em>");
        int i = nVar.f292149c;
        if (i != 1) {
            if (i == 15) {
                replaceFirst = context.getString(C0966R.string.lej) + replaceFirst;
            } else if (!(i == 4 || i == 5)) {
                replaceFirst = "";
            }
        }
        try {
            jSONObject.put("displayText", replaceFirst);
        } catch (JSONException e) {
            Log.printErrStackTrace("JsapiFtsMatchContact", e, "", new Object[0]);
        }
    }
}
