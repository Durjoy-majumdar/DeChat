package n91;

import android.util.Pair;
import android.view.View;
import e91.C20552a;
import gy3.C87412m;
import j20.C21153d;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import te3.xr4;

/* renamed from: n91.b */
public final class C21611b {

    /* renamed from: a */
    public C21613c f61189a;

    /* renamed from: b */
    public int f61190b = -1;

    /* renamed from: c */
    public final Map<String, List<Pair<String, String>>> f61191c = new LinkedHashMap();

    /* renamed from: d */
    public final C21612a f61192d = new C21612a(this);

    /* renamed from: n91.b$a */
    public static final class C21612a implements C21153d {

        /* renamed from: a */
        public final /* synthetic */ C21611b f61193a;

        public C21612a(C21611b bVar) {
            this.f61193a = bVar;
        }

        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (obj != null) {
                C21611b bVar = this.f61193a;
                if ((obj instanceof View) && objArr != null && objArr.length >= 2) {
                    Integer num = objArr[0];
                    C87412m.m108592e(num, "null cannot be cast to non-null type kotlin.Int");
                    int intValue = num.intValue();
                    Boolean bool = objArr[1];
                    C87412m.m108592e(bool, "null cannot be cast to non-null type kotlin.Boolean");
                    bool.booleanValue();
                    if (intValue > 0 || bVar.f61190b != -1) {
                        bVar.f61190b = intValue;
                        xr4 xr4 = new xr4();
                        String str4 = "Horizontal-Scroll-" + intValue;
                        xr4.f354547d = str4;
                        xr4.f354548e = str4;
                        xr4.f354549f = str4;
                        WeakReference<Object> weakReference = C20552a.m22323a().f57845c;
                        String str5 = null;
                        Object obj2 = weakReference == null ? null : weakReference.get();
                        if (obj2 != null) {
                            str5 = obj2.getClass().getName();
                        }
                        if (str5 != null) {
                            str = str5;
                        }
                        xr4.f354550g = str;
                        xr4.f354551h = obj.getClass().getName();
                        xr4.f354552i = 10;
                        View view = (View) obj;
                        xr4.f354553j = view.hashCode();
                        xr4.f354554n = view.hashCode();
                        xr4.f354555o = System.currentTimeMillis();
                        xr4.f354561u = 1;
                        xr4.f354557q = intValue;
                        C21613c cVar = bVar.f61189a;
                        if (cVar != null) {
                            cVar.mo33861a(view, xr4);
                        }
                    }
                }
            }
        }
    }
}
