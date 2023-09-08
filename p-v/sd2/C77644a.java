package sd2;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceSmallCategory;
import com.tencent.p014mm.plugin.order.model.MallOrderDetailObject;
import com.tencent.p014mm.plugin.order.model.MallTransactionObject;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C75218i;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C76901s0;
import p156gj.C87200o;
import p156gj.C87203t;
import p200lx.C76736w;
import pd2.C77077a;
import pj3.C47511g;
import qe3.C89625d;

/* renamed from: sd2.a */
public class C77644a implements C77077a.C77080b {

    /* renamed from: a */
    public C75218i f226363a;

    /* renamed from: sd2.a$a */
    public class C77645a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MallTransactionObject f226364d;

        /* renamed from: e */
        public final /* synthetic */ Context f226365e;

        public C77645a(C77644a aVar, MallTransactionObject mallTransactionObject, Context context) {
            this.f226364d = mallTransactionObject;
            this.f226365e = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(this.f226364d.f202096C)) {
                C75228t.m90223P(this.f226365e, this.f226364d.f202096C);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sd2.a$b */
    public class C77646b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MallTransactionObject f226366d;

        /* renamed from: e */
        public final /* synthetic */ C77660f f226367e;

        /* renamed from: f */
        public final /* synthetic */ C47511g f226368f;

        public C77646b(C77644a aVar, MallTransactionObject mallTransactionObject, C77660f fVar, C47511g gVar) {
            this.f226366d = mallTransactionObject;
            this.f226367e = fVar;
            this.f226368f = gVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f226367e.mo107827I(this.f226366d.f202132n + "\n" + this.f226366d.f202133o);
            this.f226368f.notifyDataSetChanged();
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sd2.a$c */
    public class C77647c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f226369d;

        /* renamed from: e */
        public final /* synthetic */ MallTransactionObject f226370e;

        /* renamed from: sd2.a$c$a */
        public class C77648a implements DialogInterface.OnClickListener {
            public C77648a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                intent.putExtra(FirebaseAnalytics.C113379b.TRANSACTION_ID, C77647c.this.f226370e.f202143x);
                intent.putExtra("receiver_name", C77647c.this.f226370e.f202115T);
                intent.putExtra("resend_msg_from_flag", 1);
                C88144b.m109791i(C77647c.this.f226369d, "remittance", ".ui.RemittanceResendMsgUI", intent, (Bundle) null);
            }
        }

        /* renamed from: sd2.a$c$b */
        public class C77649b implements DialogInterface.OnClickListener {
            public C77649b(C77647c cVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C77647c(C77644a aVar, Context context, MallTransactionObject mallTransactionObject) {
            this.f226369d = context;
            this.f226370e = mallTransactionObject;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Context context = this.f226369d;
            C76879j.m92707A(context, context.getString(C0966R.string.i0g), this.f226369d.getString(C0966R.string.a2d), this.f226369d.getString(C0966R.string.i2s), this.f226369d.getString(C0966R.string.f7926wf), new C77648a(), new C77649b(this));
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sd2.a$d */
    public class C77650d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f226372d;

        /* renamed from: e */
        public final /* synthetic */ MallTransactionObject f226373e;

        public C77650d(Bitmap bitmap, MallTransactionObject mallTransactionObject) {
            this.f226372d = bitmap;
            this.f226373e = mallTransactionObject;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C75218i iVar = C77644a.this.f226363a;
            if (iVar != null) {
                Bitmap bitmap = this.f226372d;
                iVar.f221321e = this.f226373e.f202145y;
                iVar.f221318b = bitmap;
                iVar.f221319c = bitmap;
                C76901s0 s0Var = iVar.f221324h;
                if (s0Var != null && s0Var.isShowing()) {
                    iVar.mo105150d();
                }
                C77644a.this.f226363a.mo105149c(view, true);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sd2.a$e */
    public class C77651e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ MallTransactionObject f226375d;

        /* renamed from: e */
        public final /* synthetic */ Context f226376e;

        /* renamed from: sd2.a$e$a */
        public class C77652a implements C76879j.C76888o {
            public C77652a() {
            }

            /* renamed from: a */
            public void mo5759a(int i, int i2) {
                C77651e eVar = C77651e.this;
                C77077a.m93006b(i2, eVar.f226376e, eVar.f226375d);
            }
        }

        public C77651e(C77644a aVar, MallTransactionObject mallTransactionObject, Context context) {
            this.f226375d = mallTransactionObject;
            this.f226376e = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            if (!Util.isNullOrNil(this.f226375d.f202096C)) {
                linkedList2.add(0);
                linkedList.add(this.f226376e.getString(C0966R.string.l18));
            }
            if (!Util.isNullOrNil(this.f226375d.f202097D)) {
                linkedList2.add(1);
                linkedList.add(this.f226376e.getString(C0966R.string.l19));
            }
            if (!Util.isNullOrNil(this.f226375d.f202107N)) {
                linkedList2.add(2);
                linkedList.add(this.f226376e.getString(C0966R.string.l1a));
            }
            if (linkedList2.size() == 1) {
                C77077a.m93006b(((Integer) linkedList2.get(0)).intValue(), this.f226376e, this.f226375d);
                C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C76879j.m92733d(this.f226376e, (String) null, linkedList, linkedList2, (String) null, true, new C77652a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sd2.a$f */
    public class C77653f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f226378d;

        /* renamed from: e */
        public final /* synthetic */ MallTransactionObject f226379e;

        public C77653f(Context context, MallTransactionObject mallTransactionObject) {
            this.f226378d = context;
            this.f226379e = mallTransactionObject;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C77644a aVar = C77644a.this;
            Context context = this.f226378d;
            MallTransactionObject mallTransactionObject = this.f226379e;
            C77644a.m93622b(aVar, context, mallTransactionObject.f202107N, mallTransactionObject);
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sd2.a$g */
    public class C77654g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ Context f226381d;

        /* renamed from: e */
        public final /* synthetic */ MallTransactionObject f226382e;

        public C77654g(Context context, MallTransactionObject mallTransactionObject) {
            this.f226381d = context;
            this.f226382e = mallTransactionObject;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getTag() == null) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (view.getTag() instanceof MallOrderDetailObject.HelpCenter) {
                C77644a.m93622b(C77644a.this, this.f226381d, ((MallOrderDetailObject.HelpCenter) view.getTag()).f202082e, this.f226382e);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/order/ui/preference/DefaultOrderPrefFactory$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: b */
    public static void m93622b(C77644a aVar, Context context, String str, MallTransactionObject mallTransactionObject) {
        aVar.getClass();
        Intent intent = new Intent();
        Uri parse = Uri.parse(str);
        String str2 = mallTransactionObject.f202143x;
        String i = C87203t.m108273i();
        int i2 = C89625d.f257835a;
        String str3 = C87200o.f252868a;
        String uri = parse.buildUpon().appendQueryParameter("trans_id", str2).appendQueryParameter("deviceid", i).appendQueryParameter(TPDownloadProxyEnum.USER_BSSID, NetStatusUtil.isWifi(MMApplicationContext.getContext()) ? Util.nullAs(ConnectivityCompat.Companion.getWiFiBssid(), "") : TPDownloadProxyEnum.USER_BSSID).appendQueryParameter("deviceType", str3).appendQueryParameter(MJTextResolver.KEY_DEVICE_NAME, C87203t.m108275k()).appendQueryParameter("ostype", C87203t.m108274j()).build().toString();
        Log.m105925i("MicroMsg.DefaultOrderPrefFactory", "new url %s", uri);
        intent.putExtra("rawUrl", uri);
        intent.putExtra("geta8key_username", C75592q0.m90789s());
        C75228t.m90217J(context, intent);
    }

    /* renamed from: a */
    public List<Preference> mo107389a(Context context, C47511g gVar, MallTransactionObject mallTransactionObject) {
        boolean z;
        int i;
        Context context2 = context;
        C47511g gVar2 = gVar;
        MallTransactionObject mallTransactionObject2 = mallTransactionObject;
        Class cls = C75700k0.class;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        boolean z3 = mallTransactionObject2.f202127f == 2;
        if (!Util.isNullOrNil(mallTransactionObject2.f202098E) && !Util.isNullOrNil(mallTransactionObject2.f202099F)) {
            C77658d dVar = new C77658d(context2);
            dVar.f226392M = mallTransactionObject2.f202099F;
            dVar.f226391L = mallTransactionObject2.f202098E;
            dVar.f226390K = new C77645a(this, mallTransactionObject2, context2);
            arrayList.add(dVar);
            arrayList.add(new PreferenceSmallCategory(context2, (AttributeSet) null));
        }
        C77664i iVar = new C77664i(context2);
        iVar.f226416L = C75228t.m90258m(mallTransactionObject2.f202136q, mallTransactionObject2.f202095B);
        iVar.mo69924H(z3 ? context2.getString(C0966R.string.kzz) : mallTransactionObject2.f202126e == 11 ? context2.getString(C0966R.string.f361584l11) : context2.getString(C0966R.string.kzy));
        if (!Util.isNullOrNil(mallTransactionObject2.f202137r)) {
            try {
                iVar.f226415K = C43423i0.m46931b(mallTransactionObject2.f202137r, true);
            } catch (Exception unused) {
                iVar.f226415K = -1;
            }
        }
        arrayList.add(iVar);
        if (mallTransactionObject2.f202136q != mallTransactionObject2.f202103J) {
            C13657h hVar = new C13657h(context2);
            hVar.f38692K = false;
            hVar.f38693L = true;
            arrayList.add(hVar);
            C77660f fVar = new C77660f(context2);
            fVar.mo107827I(C75228t.m90258m(mallTransactionObject2.f202103J, mallTransactionObject2.f202095B));
            fVar.mo69923G(C0966R.string.l0q);
            arrayList.add(fVar);
            z = true;
        } else {
            z = false;
        }
        if (mallTransactionObject2.f202136q != mallTransactionObject2.f202103J && !Util.isNullOrNil(mallTransactionObject2.f202102I)) {
            C77662g gVar3 = new C77662g(context2);
            gVar3.mo69923G(C0966R.string.l0a);
            gVar3.f226406K = gVar2;
            String[] split = mallTransactionObject2.f202102I.split("\n");
            if (split.length == 1) {
                gVar3.f226407L = split[0];
            } else {
                z2 = true;
                gVar3.f226407L = context2.getString(C0966R.string.l0c, new Object[]{Integer.valueOf(split.length), C75228t.m90258m(mallTransactionObject2.f202103J - mallTransactionObject2.f202136q, mallTransactionObject2.f202095B)});
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                gVar3.f226408M = split;
                gVar3.f226409N = truncateAt;
                gVar3.f226410P = true;
            }
            arrayList.add(gVar3);
        }
        C13657h hVar2 = new C13657h(context2);
        hVar2.f38692K = z;
        hVar2.f38693L = z2;
        arrayList.add(hVar2);
        if (!z3 && !Util.isNullOrNil(mallTransactionObject2.f202115T)) {
            C86709a0.m107528h();
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(mallTransactionObject2.f202115T);
            if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
                String f = z1Var.mo62898f();
                C77660f fVar2 = new C77660f(context2);
                fVar2.mo69923G(C0966R.string.f361587l14);
                fVar2.mo107827I(f);
                arrayList.add(fVar2);
            }
        }
        if (mallTransactionObject2.f202126e == 31 && z3 && !Util.isNullOrNil(mallTransactionObject2.f202135p0)) {
            C86709a0.m107528h();
            C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(mallTransactionObject2.f202135p0);
            if (z1Var2 != null && ((int) z1Var2.f108320R1) > 0) {
                String f2 = z1Var2.mo62898f();
                C77660f fVar3 = new C77660f(context2);
                fVar3.mo69923G(C0966R.string.l0m);
                fVar3.mo107827I(f2);
                arrayList.add(fVar3);
            }
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202132n)) {
            if (z3) {
                C77660f fVar4 = new C77660f(context2);
                int i2 = mallTransactionObject2.f202126e;
                if (i2 == 32 || i2 == 33 || i2 == 31) {
                    fVar4.mo69923G(C0966R.string.f361581l03);
                } else {
                    fVar4.mo69923G(C0966R.string.l0m);
                }
                fVar4.mo107827I(mallTransactionObject2.f202132n);
                arrayList.add(fVar4);
            } else {
                C77660f fVar5 = new C77660f(context2);
                if (mallTransactionObject2.f202126e == 31) {
                    fVar5.mo69923G(C0966R.string.l0x);
                } else {
                    fVar5.mo69923G(C0966R.string.l09);
                }
                if (!Util.isNullOrNil(mallTransactionObject2.f202133o)) {
                    String string = context2.getString(C0966R.string.f361580l02);
                    String str = mallTransactionObject2.f202132n + " " + string;
                    int length = mallTransactionObject2.f202132n.length() + 1 + string.length();
                    C77646b bVar = new C77646b(this, mallTransactionObject2, fVar5, gVar2);
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
        if (!Util.isNullOrNil(mallTransactionObject2.f202112R0)) {
            C77660f fVar6 = new C77660f(context2);
            fVar6.mo69923G(C0966R.string.l1f);
            fVar6.mo107827I(mallTransactionObject2.f202112R0);
            arrayList.add(fVar6);
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202110Q0)) {
            C77660f fVar7 = new C77660f(context2);
            fVar7.mo69923G(C0966R.string.l1g);
            fVar7.mo107827I(mallTransactionObject2.f202110Q0);
            arrayList.add(fVar7);
        }
        if (!TextUtils.isEmpty(mallTransactionObject2.f202119V)) {
            C77660f fVar8 = new C77660f(context2);
            fVar8.mo69923G(C0966R.string.f361579l01);
            fVar8.mo107827I(mallTransactionObject2.f202119V);
            arrayList.add(fVar8);
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202131j)) {
            C77660f fVar9 = new C77660f(context2);
            fVar9.mo69923G(C0966R.string.l0p);
            fVar9.mo107827I(mallTransactionObject2.f202131j);
            arrayList.add(fVar9);
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202139t)) {
            C77660f fVar10 = new C77660f(context2);
            fVar10.mo69923G(C0966R.string.l15);
            if (mallTransactionObject2.f202126e != 31 || C75592q0.m90789s().equals(mallTransactionObject2.f202115T) || mallTransactionObject2.f202117U <= 0 || Util.isNullOrNil(mallTransactionObject2.f202115T) || Util.isNullOrNil(mallTransactionObject2.f202143x)) {
                fVar10.mo107827I(mallTransactionObject2.f202139t);
                if (!Util.isNullOrNil(mallTransactionObject2.f202140u)) {
                    try {
                        fVar10.f226398L = C43423i0.m46931b(mallTransactionObject2.f202140u, true);
                    } catch (Exception unused2) {
                        fVar10.f226398L = Integer.MAX_VALUE;
                    }
                }
            } else {
                String string2 = context2.getString(C0966R.string.i2t);
                String str2 = mallTransactionObject2.f202139t + " " + string2;
                C77647c cVar = new C77647c(this, context2, mallTransactionObject2);
                fVar10.f226397K = str2;
                fVar10.f226399M = true;
                fVar10.f226400N = mallTransactionObject2.f202139t.length() + 1;
                fVar10.f226401P = mallTransactionObject2.f202139t.length() + string2.length() + 1;
                fVar10.f226402Q = cVar;
            }
            arrayList.add(fVar10);
        }
        C77660f fVar11 = new C77660f(context2);
        fVar11.mo69923G(C0966R.string.l06);
        fVar11.mo107827I(C75228t.m90262o(mallTransactionObject2.f202141v));
        arrayList.add(fVar11);
        if (!Util.isNullOrNil(mallTransactionObject2.f202147z)) {
            C77660f fVar12 = new C77660f(context2);
            fVar12.mo69923G(C0966R.string.l0s);
            String str3 = mallTransactionObject2.f202147z;
            if (!Util.isNullOrNil(mallTransactionObject2.f202094A)) {
                str3 = str3 + "(" + mallTransactionObject2.f202094A + ")";
            }
            fVar12.mo107827I(str3);
            arrayList.add(fVar12);
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202143x)) {
            C77660f fVar13 = new C77660f(context2);
            fVar13.mo69923G(C0966R.string.l1b);
            fVar13.mo107827I(mallTransactionObject2.f202143x);
            arrayList.add(fVar13);
        }
        if (!Util.isNullOrNil(mallTransactionObject2.f202145y)) {
            C77660f fVar14 = new C77660f(context2);
            fVar14.mo69923G(C0966R.string.f361585l12);
            if (mallTransactionObject2.f202126e == 8) {
                fVar14.mo107827I(context2.getString(C0966R.string.f361586l13));
                C13656c cVar2 = new C13656c(context2);
                Bitmap qj = ((C76736w) C86312j.m106911c(C76736w.class)).mo106913qj(context2, mallTransactionObject2.f202145y, 5, 0);
                cVar2.f38689N = C75228t.m90263o0(mallTransactionObject2.f202145y);
                cVar2.f38690P = qj;
                cVar2.f38688M = new C77650d(qj, mallTransactionObject2);
                arrayList.add(fVar14);
                arrayList.add(cVar2);
            } else {
                fVar14.mo107827I(mallTransactionObject2.f202145y);
                arrayList.add(fVar14);
            }
        }
        boolean z4 = ((LinkedList) mallTransactionObject2.f202118U0).size() != 0;
        if (z4 || (Util.isNullOrNil(mallTransactionObject2.f202107N) && Util.isNullOrNil(mallTransactionObject2.f202096C) && Util.isNullOrNil(mallTransactionObject2.f202097D))) {
            i = 1;
            C13657h hVar3 = new C13657h(context2);
            hVar3.f38692K = true;
            hVar3.f38694M = false;
            arrayList.add(hVar3);
        } else {
            C13657h hVar4 = new C13657h(context2);
            i = 1;
            hVar4.f38692K = true;
            arrayList.add(hVar4);
            arrayList.add(C77077a.m93005a(context2, mallTransactionObject2));
        }
        if (z4) {
            C77665j jVar = new C77665j(context2);
            if (mallTransactionObject2.f202120V0 == i) {
                if (!Util.isNullOrNil(mallTransactionObject2.f202107N) || !Util.isNullOrNil(mallTransactionObject2.f202096C) || !Util.isNullOrNil(mallTransactionObject2.f202097D)) {
                    if (!Util.isNullOrNil(mallTransactionObject2.f202108P)) {
                        jVar.f226419L = mallTransactionObject2.f202108P;
                    } else {
                        jVar.f226419L = context2.getString(C0966R.string.l1_);
                    }
                    jVar.f226420M = new C77651e(this, mallTransactionObject2, context2);
                }
            } else if (!Util.isNullOrNil(mallTransactionObject2.f202108P)) {
                jVar.f226419L = mallTransactionObject2.f202108P;
                jVar.f226420M = new C77653f(context2, mallTransactionObject2);
            }
            jVar.f226421N = mallTransactionObject2.f202118U0;
            jVar.f226418K = new C77654g(context2, mallTransactionObject2);
            C13657h hVar5 = new C13657h(context2);
            hVar5.f38692K = true;
            arrayList.add(hVar5);
            arrayList.add(jVar);
        }
        return arrayList;
    }
}
