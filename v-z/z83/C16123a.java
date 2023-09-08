package z83;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.plugin.webview.luggage.C43626k0;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
import p828wa.C53138x;

/* renamed from: z83.a */
public class C16123a implements C80883e<Bundle, Bundle> {
    public void invoke(Object obj, C1256g gVar) {
        Bundle bundle = (Bundle) obj;
        if (bundle != null) {
            String string = bundle.getString("name");
            String string2 = bundle.getString("data");
            LinkedList<C53138x> b = C43626k0.m47360b();
            C16124b bVar = new C16124b();
            bVar.f43310b = string;
            try {
                bVar.f43309a = new JSONObject(string2);
                Iterator<C53138x> it = b.iterator();
                while (it.hasNext()) {
                    it.next().f148259i.mo73815b(bVar);
                }
            } catch (Exception unused) {
            }
        }
    }
}
