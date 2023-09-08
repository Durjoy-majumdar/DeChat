package p1043ua;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.text.TextUtils;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import zi0.C91755a;

/* renamed from: ua.b */
public class C90623b implements C91755a {

    /* renamed from: d */
    public final List<C91755a.C91756a> f260365d = new LinkedList();

    public C90623b() {
        mo124760a(new C90624c());
    }

    /* renamed from: N0 */
    public void mo124757N0(String str, Map<String, String> map, C91755a.C91758c cVar) {
        if (!TextUtils.isEmpty(str)) {
            for (C91755a.C91756a next : this.f260365d) {
                if (next.mo115834Q0(str)) {
                    next.mo115839N0(str, map, cVar);
                    return;
                }
            }
        } else if (cVar != null) {
            cVar.mo121428a((InputStream) null);
        }
    }

    /* renamed from: Om */
    public void mo124758Om(String str, C91755a.C91758c cVar) {
        mo124757N0(str, (Map<String, String>) null, cVar);
    }

    /* renamed from: Rb */
    public Bitmap mo124759Rb(String str, Rect rect, C91755a.C91757b bVar) {
        if (!(str == null || str.length() == 0)) {
            for (C91755a.C91756a next : this.f260365d) {
                if (next.mo115834Q0(str)) {
                    return next.mo115833P0(str, rect, bVar);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo124760a(C91755a.C91756a aVar) {
        if (aVar != null) {
            this.f260365d.remove(aVar);
            this.f260365d.add(aVar);
        }
    }

    public Bitmap load(String str) {
        return mo124759Rb(str, (Rect) null, (C91755a.C91757b) null);
    }
}
