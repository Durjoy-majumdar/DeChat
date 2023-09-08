package zq0;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableString;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import p224ra.C89909e;
import rx3.C13598b0;
import te3.cm4;
import te3.dm4;
import zp0.C16377l;

/* renamed from: zq0.i0 */
public final class C91882i0 implements C91913s {

    /* renamed from: a */
    public final Context f263062a;

    /* renamed from: b */
    public final String f263063b;

    /* renamed from: c */
    public final String f263064c;

    /* renamed from: d */
    public C91915t f263065d;

    /* renamed from: e */
    public final ArrayList<PhoneItem> f263066e = new ArrayList<>();

    /* renamed from: f */
    public final ArrayList<PhoneItem> f263067f = new ArrayList<>();

    /* renamed from: g */
    public boolean f263068g;

    /* renamed from: zq0.i0$a */
    public static final class C91883a extends C87413o implements C32227p<Integer, Intent, C13598b0> {

        /* renamed from: d */
        public static final C91883a f263069d = new C91883a();

        public C91883a() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Intent intent = (Intent) obj2;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: zq0.i0$b */
    public static final class C91884b extends C87413o implements C32226l<dm4, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C91882i0 f263070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91884b(C91882i0 i0Var) {
            super(1);
            this.f263070d = i0Var;
        }

        public Object invoke(Object obj) {
            dm4 dm4 = (dm4) obj;
            boolean z = true;
            Object[] objArr = new Object[1];
            if (dm4 == null) {
                z = false;
            }
            objArr[0] = Boolean.valueOf(z);
            Log.m105925i("MicroMsg.PhoneNumberManagerUI", "update %b", objArr);
            Long l = null;
            if (dm4 != null) {
                C91893l0 l0Var = C91893l0.f263119a;
                C91891k0 a = l0Var.mo125719a(this.f263070d.f263063b);
                if (a != null) {
                    C91891k0 a2 = l0Var.mo125719a(this.f263070d.f263063b);
                    if (a2 != null) {
                        l = Long.valueOf(a2.f263112v);
                    }
                    C87412m.m108591d(l);
                    a.f263112v = l.longValue() + 1;
                }
            } else {
                C91893l0 l0Var2 = C91893l0.f263119a;
                C91891k0 a3 = l0Var2.mo125719a(this.f263070d.f263063b);
                if (a3 != null) {
                    C91891k0 a4 = l0Var2.mo125719a(this.f263070d.f263063b);
                    if (a4 != null) {
                        l = Long.valueOf(a4.f263113w);
                    }
                    C87412m.m108591d(l);
                    a3.f263113w = l.longValue() + 1;
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C91882i0(Context context, String str, String str2) {
        C87412m.m108594g(context, "mContext");
        C87412m.m108594g(str, "mAppId");
        C87412m.m108594g(str2, "mPagePath");
        this.f263062a = context;
        this.f263063b = str;
        this.f263064c = str2;
    }

    /* renamed from: a */
    public SpannableString mo125706a() {
        C91910r rVar = C91875g0.f263042b;
        if (rVar == null) {
            rVar = new C91894m();
        }
        return rVar.mo121662c(this.f263062a, this.f263063b, this.f263064c);
    }

    /* renamed from: b */
    public void mo125707b(boolean z) {
        this.f263066e.clear();
        this.f263066e.addAll(C91919w.f263170a.mo125747b());
        C91915t tVar = this.f263065d;
        if (tVar != null) {
            ((C91886j0) tVar).mo125715a(z, this.f263066e);
        }
    }

    /* renamed from: c */
    public void mo125708c() {
        C91893l0 l0Var = C91893l0.f263119a;
        C91891k0 a = l0Var.mo125719a(this.f263063b);
        if (a != null) {
            C91891k0 a2 = l0Var.mo125719a(this.f263063b);
            Long valueOf = a2 != null ? Long.valueOf(a2.f263110t) : null;
            C87412m.m108591d(valueOf);
            a.f263110t = valueOf.longValue() + 1;
        }
        C91910r rVar = C91875g0.f263042b;
        if (rVar == null) {
            rVar = new C91894m();
        }
        rVar.mo125723b(this.f263062a, this.f263063b, C91883a.f263069d);
    }

    /* renamed from: d */
    public void mo125709d(boolean z) {
        boolean z2 = !z;
        this.f263068g = z2;
        C91915t tVar = this.f263065d;
        if (tVar != null) {
            ((C91886j0) tVar).mo125715a(z2, this.f263066e);
        }
    }

    /* renamed from: e */
    public void mo125710e() {
        boolean z;
        if (this.f263067f.size() >= 0) {
            Iterator<PhoneItem> it = this.f263067f.iterator();
            while (it.hasNext()) {
                PhoneItem next = it.next();
                C91893l0 l0Var = C91893l0.f263119a;
                C91891k0 a = l0Var.mo125719a(this.f263063b);
                if (a != null) {
                    C91891k0 a2 = l0Var.mo125719a(this.f263063b);
                    Long valueOf = a2 != null ? Long.valueOf(a2.f263111u) : null;
                    C87412m.m108591d(valueOf);
                    a.f263111u = valueOf.longValue() + 1;
                }
                String str = this.f263063b;
                String str2 = next.f245271d;
                C87412m.m108594g(str, "appId");
                C87412m.m108594g(str2, "mobile");
                C91884b bVar = new C91884b(this);
                cm4 cm4 = new cm4();
                cm4.f131830d = str;
                cm4.f131831e = str2;
                cm4.f131832f = 1;
                ((C16377l) C89909e.m112436a(C16377l.class)).mo14840YQ("/cgi-bin/mmbiz-bin/wxaapp/customphone/updateuserphone", str, cm4, dm4.class).mo123061d(new C91890k(bVar)).mo123065b(new C16394l(bVar));
            }
        }
        C91919w wVar = C91919w.f263170a;
        ArrayList<PhoneItem> arrayList = this.f263067f;
        C87412m.m108591d(arrayList);
        synchronized (wVar) {
            ArrayList arrayList2 = (ArrayList) wVar.mo125747b();
            Iterator<PhoneItem> it4 = arrayList.iterator();
            while (it4.hasNext()) {
                arrayList2.remove(it4.next());
            }
            Iterator it5 = arrayList2.iterator();
            while (true) {
                if (it5.hasNext()) {
                    if (((PhoneItem) it5.next()).f245279o) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z && arrayList2.size() >= 1) {
                ((PhoneItem) arrayList2.get(0)).f245279o = true;
            }
            Log.m105927v("MicroMsg.PhoneItemsManager", "remove phoneItems:%s", arrayList2);
            wVar.mo125749d(arrayList2);
        }
    }

    /* renamed from: f */
    public void mo125711f(PhoneItem phoneItem) {
        C87412m.m108594g(phoneItem, "phoneItem");
        this.f263067f.add(phoneItem);
        this.f263066e.remove(phoneItem);
        C91915t tVar = this.f263065d;
        if (tVar != null) {
            ((C91886j0) tVar).mo125715a(this.f263068g, this.f263066e);
        }
    }

    public View getView() {
        C91915t tVar = this.f263065d;
        if (tVar != null) {
            return ((C91886j0) tVar).f263076d;
        }
        return null;
    }

    public void init() {
        this.f263065d = new C91886j0(this.f263062a, this);
        this.f263066e.clear();
        this.f263066e.addAll(C91919w.f263170a.mo125747b());
        C91893l0.f263119a.mo125720b(this.f263063b);
    }

    public void uninit() {
        C91893l0.f263119a.mo125721c(this.f263063b);
    }
}
