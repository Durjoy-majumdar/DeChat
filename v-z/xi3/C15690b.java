package xi3;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: xi3.b */
public class C15690b {

    /* renamed from: a */
    public List<String> f42386a = new ArrayList();

    /* renamed from: a */
    public C15690b mo14432a(String str) {
        ((ArrayList) this.f42386a).add(str);
        return this;
    }

    /* renamed from: b */
    public void mo14433b(View view) {
        if (view != null && ((ArrayList) this.f42386a).size() > 0) {
            Iterator it = ((ArrayList) this.f42386a).iterator();
            String str = "";
            while (it.hasNext()) {
                str = str + ((String) it.next()) + ",";
            }
            view.setContentDescription(str);
        }
    }
}
