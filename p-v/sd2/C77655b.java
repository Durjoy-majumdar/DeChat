package sd2;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceSmallCategory;
import com.tencent.p014mm.plugin.order.model.MallTransactionObject;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import pd2.C77077a;
import pj3.C47511g;

/* renamed from: sd2.b */
public class C77655b implements C77077a.C77080b {

    /* renamed from: sd2.b$a */
    public class C77656a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MallTransactionObject f226384d;

        /* renamed from: e */
        public final /* synthetic */ Context f226385e;

        public C77656a(C77655b bVar, MallTransactionObject mallTransactionObject, Context context) {
            this.f226384d = mallTransactionObject;
            this.f226385e = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/preference/FetchOrderPrefFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(this.f226384d.f202096C)) {
                C75228t.m90223P(this.f226385e, this.f226384d.f202096C);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/FetchOrderPrefFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sd2.b$b */
    public class C77657b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MallTransactionObject f226386d;

        /* renamed from: e */
        public final /* synthetic */ C77660f f226387e;

        /* renamed from: f */
        public final /* synthetic */ C47511g f226388f;

        public C77657b(C77655b bVar, MallTransactionObject mallTransactionObject, C77660f fVar, C47511g gVar) {
            this.f226386d = mallTransactionObject;
            this.f226387e = fVar;
            this.f226388f = gVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/preference/FetchOrderPrefFactory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f226387e.mo107827I(this.f226386d.f202132n + "\n" + this.f226386d.f202133o);
            this.f226388f.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/FetchOrderPrefFactory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: a */
    public List<Preference> mo107389a(Context context, C47511g gVar, MallTransactionObject mallTransactionObject) {
        boolean z;
        Context context2 = context;
        C47511g gVar2 = gVar;
        MallTransactionObject mallTransactionObject2 = mallTransactionObject;
        ArrayList arrayList = new ArrayList();
        boolean z2 = mallTransactionObject2.f202127f == 2;
        if (!Util.isNullOrNil(mallTransactionObject2.f202098E) && !Util.isNullOrNil(mallTransactionObject2.f202099F)) {
            C77658d dVar = new C77658d(context2);
            dVar.f226392M = mallTransactionObject2.f202099F;
            dVar.f226391L = mallTransactionObject2.f202098E;
            dVar.f226390K = new C77656a(this, mallTransactionObject2, context2);
            arrayList.add(dVar);
            arrayList.add(new PreferenceSmallCategory(context2, (AttributeSet) null));
        }
        Log.m105924i("MicroMsg.FetchOrderPrefFactory", "getOrderPrefList() chargeFee is " + mallTransactionObject2.f202119V + " and fetchTotalFee is " + mallTransactionObject2.f202114S0);
        boolean isEmpty = TextUtils.isEmpty(mallTransactionObject2.f202119V);
        int i = C0966R.string.l0g;
        if (!isEmpty) {
            C77664i iVar = new C77664i(context2);
            iVar.f226416L = C75228t.m90258m(mallTransactionObject2.f202114S0, mallTransactionObject2.f202095B);
            iVar.mo69924H(context2.getString(C0966R.string.f361578l00));
            if (!Util.isNullOrNil(mallTransactionObject2.f202116T0)) {
                try {
                    iVar.f226415K = C43423i0.m46931b(mallTransactionObject2.f202116T0, true);
                } catch (Exception unused) {
                    iVar.f226415K = -1;
                }
            }
            arrayList.add(iVar);
            C13657h hVar = new C13657h(context2);
            hVar.f38692K = false;
            hVar.f38693L = true;
            arrayList.add(hVar);
            C77660f fVar = new C77660f(context2);
            fVar.mo69923G(C0966R.string.l0g);
            fVar.mo107827I(C75228t.m90258m(mallTransactionObject2.f202136q, mallTransactionObject2.f202095B));
            arrayList.add(fVar);
            C77660f fVar2 = new C77660f(context2);
            fVar2.mo69923G(C0966R.string.f361579l01);
            fVar2.mo107827I(mallTransactionObject2.f202119V);
            arrayList.add(fVar2);
        } else {
            C77664i iVar2 = new C77664i(context2);
            iVar2.f226416L = C75228t.m90258m(mallTransactionObject2.f202136q, mallTransactionObject2.f202095B);
            if (z2) {
                i = C0966R.string.kzz;
            }
            iVar2.mo69924H(context2.getString(i));
            if (!Util.isNullOrNil(mallTransactionObject2.f202137r)) {
                try {
                    iVar2.f226415K = C43423i0.m46931b(mallTransactionObject2.f202137r, true);
                } catch (Exception unused2) {
                    iVar2.f226415K = -1;
                }
            }
            arrayList.add(iVar2);
            double d = mallTransactionObject2.f202136q;
            double d2 = mallTransactionObject2.f202103J;
            if (d == d2 || d2 <= 0.0d) {
                z = false;
            } else {
                C13657h hVar2 = new C13657h(context2);
                hVar2.f38692K = false;
                hVar2.f38693L = true;
                arrayList.add(hVar2);
                C77660f fVar3 = new C77660f(context2);
                fVar3.mo107827I(C75228t.m90258m(mallTransactionObject2.f202103J, mallTransactionObject2.f202095B));
                fVar3.mo69923G(C0966R.string.l0q);
                arrayList.add(fVar3);
                if (!Util.isNullOrNil(mallTransactionObject2.f202102I)) {
                    C77662g gVar3 = new C77662g(context2);
                    gVar3.mo69923G(C0966R.string.l0a);
                    gVar3.f226406K = gVar2;
                    String[] split = mallTransactionObject2.f202102I.split("\n");
                    if (split.length == 1) {
                        gVar3.f226407L = split[0];
                    } else {
                        gVar3.f226407L = context2.getString(C0966R.string.l0c, new Object[]{Integer.valueOf(split.length), C75228t.m90258m(mallTransactionObject2.f202103J - mallTransactionObject2.f202136q, mallTransactionObject2.f202095B)});
                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                        gVar3.f226408M = split;
                        gVar3.f226409N = truncateAt;
                        gVar3.f226410P = true;
                    }
                    arrayList.add(gVar3);
                }
                z = true;
            }
            C13657h hVar3 = new C13657h(context2);
            hVar3.f38692K = z;
            hVar3.f38693L = true;
            arrayList.add(hVar3);
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202132n)) {
            if (z2) {
                C77660f fVar4 = new C77660f(context2);
                fVar4.mo69923G(C0966R.string.l0m);
                fVar4.mo107827I(mallTransactionObject2.f202132n);
                arrayList.add(fVar4);
            } else {
                C77660f fVar5 = new C77660f(context2);
                fVar5.mo69923G(C0966R.string.l09);
                if (!Util.isNullOrNil(mallTransactionObject2.f202133o)) {
                    String string = context2.getString(C0966R.string.f361580l02);
                    String str = mallTransactionObject2.f202132n + " " + string;
                    int length = mallTransactionObject2.f202132n.length() + 1 + string.length();
                    C77657b bVar = new C77657b(this, mallTransactionObject2, fVar5, gVar2);
                    fVar5.f226397K = str;
                    fVar5.f226399M = true;
                    fVar5.f226400N = mallTransactionObject2.f202132n.length() + 1;
                    fVar5.f226401P = length;
                    fVar5.f226402Q = bVar;
                } else {
                    fVar5.mo107827I(mallTransactionObject2.f202132n);
                }
                arrayList.add(fVar5);
            }
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202131j)) {
            C77660f fVar6 = new C77660f(context2);
            fVar6.mo69923G(C0966R.string.l0p);
            fVar6.mo107827I(mallTransactionObject2.f202131j);
            arrayList.add(fVar6);
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202139t)) {
            C77660f fVar7 = new C77660f(context2);
            fVar7.mo69923G(C0966R.string.l15);
            fVar7.mo107827I(mallTransactionObject2.f202139t);
            if (!Util.isNullOrNil(mallTransactionObject2.f202140u)) {
                try {
                    fVar7.f226398L = C43423i0.m46931b(mallTransactionObject2.f202140u, true);
                } catch (Exception unused3) {
                    fVar7.f226398L = Integer.MAX_VALUE;
                }
            }
            arrayList.add(fVar7);
        }
        C77660f fVar8 = new C77660f(context2);
        fVar8.mo69923G(C0966R.string.l0j);
        fVar8.mo107827I(C75228t.m90262o(mallTransactionObject2.f202141v));
        arrayList.add(fVar8);
        if (mallTransactionObject2.f202111R > 0) {
            C77660f fVar9 = new C77660f(context2);
            fVar9.mo69923G(C0966R.string.l0h);
            fVar9.mo107827I(C75228t.m90262o(mallTransactionObject2.f202111R));
            arrayList.add(fVar9);
        } else if (mallTransactionObject2.f202109Q > 0) {
            C77660f fVar10 = new C77660f(context2);
            fVar10.mo69923G(C0966R.string.l0k);
            fVar10.mo107827I(C75228t.m90262o(mallTransactionObject2.f202109Q));
            arrayList.add(fVar10);
        } else {
            Log.m105920e("MicroMsg.FetchOrderPrefFactory", "hy: is fetch but no arrive time or fetch time");
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202147z)) {
            C77660f fVar11 = new C77660f(context2);
            fVar11.mo69923G(C0966R.string.l0i);
            String str2 = mallTransactionObject2.f202147z;
            if (!Util.isNullOrNil(mallTransactionObject2.f202094A)) {
                str2 = str2 + "(" + mallTransactionObject2.f202094A + ")";
            }
            fVar11.mo107827I(str2);
            arrayList.add(fVar11);
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202145y)) {
            C77660f fVar12 = new C77660f(context2);
            fVar12.mo69923G(C0966R.string.l0l);
            fVar12.mo107827I(mallTransactionObject2.f202145y);
            arrayList.add(fVar12);
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202107N) || !Util.isNullOrNil(mallTransactionObject2.f202096C) || !Util.isNullOrNil(mallTransactionObject2.f202097D)) {
            C13657h hVar4 = new C13657h(context2);
            hVar4.f38692K = true;
            arrayList.add(hVar4);
            arrayList.add(C77077a.m93005a(context2, mallTransactionObject2));
        } else {
            C13657h hVar5 = new C13657h(context2);
            hVar5.f38692K = true;
            hVar5.f38694M = false;
            arrayList.add(hVar5);
        }
        return arrayList;
    }
}
