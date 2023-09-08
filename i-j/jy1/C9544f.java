package jy1;

import android.content.Context;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p828wa.C53104i;
import p828wa.C53138x;
import z83.C16124b;

/* renamed from: jy1.f */
public final class C9544f {

    /* renamed from: a */
    public static boolean f29735a;

    /* renamed from: b */
    public static String f29736b;

    /* renamed from: c */
    public static String f29737c;

    /* renamed from: d */
    public static int f29738d;

    /* renamed from: e */
    public static WeakReference<C53104i> f29739e;

    /* renamed from: a */
    public static final void m9233a(String str, String str2, boolean z, C53104i iVar, int i) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "actId");
        C87412m.m108594g(iVar, "page");
        f29736b = str;
        f29737c = str2;
        f29738d = i;
        f29735a = z;
        Context context = iVar.f148196d;
        if (context instanceof MMActivity) {
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) context).getSwipeBackLayout().setEnableGesture(!z);
        }
        f29739e = new WeakReference<>(iVar);
    }

    /* renamed from: b */
    public static final boolean m9234b(C53104i iVar) {
        if (iVar instanceof C53138x) {
            C16124b bVar = new C16124b();
            bVar.f43310b = "userAction";
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", "back");
            bVar.f43309a = jSONObject;
            ((C53138x) iVar).f148259i.mo73815b(bVar);
        }
        if (f29738d == 0) {
            return f29735a;
        }
        if (!f29735a || Util.isNullOrNil(f29736b) || Util.isNullOrNil(f29737c)) {
            return false;
        }
        WeakReference<C53104i> weakReference = f29739e;
        return C87412m.m108589b(iVar, weakReference != null ? weakReference.get() : null);
    }
}
