package in2;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import sx3.C64197v;
import zb2.C66777a;

/* renamed from: in2.a */
public final class C9205a extends C66777a<C9205a> {

    /* renamed from: n */
    public static int f28947n;

    /* renamed from: d */
    public final String f28948d;

    /* renamed from: e */
    public final String f28949e;

    /* renamed from: f */
    public View f28950f;

    /* renamed from: g */
    public final List<C9212e> f28951g;

    /* renamed from: h */
    public C32226l<? super C9205a, C13598b0> f28952h;

    /* renamed from: i */
    public ViewGroup.LayoutParams f28953i;

    /* renamed from: j */
    public ViewGroup.LayoutParams f28954j;

    public C9205a() {
        this((String) null, 1, (C8480h) null);
    }

    public C9205a(String str) {
        C87412m.m108594g(str, "key");
        this.f28948d = str;
        f28947n++;
        this.f28949e = "GroupItem@UniqueId_" + f28947n;
        this.f28951g = new ArrayList();
    }

    /* renamed from: Oa */
    public String mo344Oa() {
        String str = this.f28948d;
        return str.length() == 0 ? this.f28949e : str;
    }

    /* renamed from: b */
    public final void mo10010b(C9212e eVar) {
        C87412m.m108594g(eVar, "item");
        Log.m105924i("MicroMsg.GroupListControl", this + ' ' + this.f28948d + " switch addItem: " + eVar.f28961a);
        if (eVar.f28962b == null) {
            eVar.f28962b = this;
            C32226l<? super C9205a, C13598b0> lVar = this.f28952h;
            if (lVar != null) {
                lVar.invoke(this);
            }
            ((ArrayList) this.f28951g).add(eVar);
            return;
        }
        throw new IllegalArgumentException("parent is not null! this item has attach parent: " + eVar.f28962b);
    }

    public Object clone() {
        return super.clone();
    }

    public int compareTo(Object obj) {
        C87412m.m108594g((C9205a) obj, "other");
        return 0;
    }

    /* renamed from: f */
    public final void mo10012f(C32226l<? super C9205a, C13598b0> lVar) {
        C87412m.m108594g(lVar, "notifyCallback");
        Log.m105924i("MicroMsg.GroupListControl", this + ' ' + this.f28948d + " bindNotifyCallback");
        this.f28952h = lVar;
    }

    /* renamed from: g5 */
    public boolean mo347g5(Object obj) {
        C9205a aVar = (C9205a) obj;
        C87412m.m108594g(aVar, "other");
        if (((ArrayList) aVar.f28951g).size() != ((ArrayList) this.f28951g).size()) {
            return false;
        }
        List<C9212e> list = aVar.f28951g;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                if (!C87412m.m108589b((C9212e) next, ((ArrayList) this.f28951g).get(i))) {
                    arrayList.add(next);
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        return arrayList.isEmpty();
    }

    /* renamed from: j */
    public final C9212e mo10013j(String str) {
        T t;
        C87412m.m108594g(str, "key");
        Iterator<T> it = this.f28951g.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (C87412m.m108589b(((C9212e) t).f28961a, str)) {
                break;
            }
        }
        return (C9212e) t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9205a(String str, int i, C8480h hVar) {
        this((i & 1) != 0 ? "" : str);
    }
}
