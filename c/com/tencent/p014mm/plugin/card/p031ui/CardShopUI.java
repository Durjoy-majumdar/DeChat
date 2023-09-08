package com.tencent.p014mm.plugin.card.p031ui;

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.jsapi.lbs.C1715u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.LocationUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import dz0.C20483c;
import f40.C86709a0;
import fy3.C32226l;
import gz0.C46000r;
import hz0.C46153l0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import p447aw.C103918d;
import p702ts.C78085c;
import te3.C49029co;
import wz0.C15613e;
import wz0.C22945n;
import wz0.C53246b;
import wz0.C53259f;

/* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI */
public class CardShopUI extends MMActivity implements C46000r.C46001a {

    /* renamed from: s */
    public static final /* synthetic */ int f109820s = 0;

    /* renamed from: d */
    public ListView f109821d;

    /* renamed from: e */
    public ProgressDialog f109822e;

    /* renamed from: f */
    public ArrayList<C49029co> f109823f = new ArrayList<>();

    /* renamed from: g */
    public C20483c f109824g;

    /* renamed from: h */
    public String f109825h = "";

    /* renamed from: i */
    public String f109826i;

    /* renamed from: j */
    public C40851g f109827j;

    /* renamed from: n */
    public LinearLayout f109828n;

    /* renamed from: o */
    public View f109829o;

    /* renamed from: p */
    public boolean f109830p = false;

    /* renamed from: q */
    public BroadcastReceiver f109831q = new C40848d();

    /* renamed from: r */
    public View.OnClickListener f109832r = new C40849e();

    /* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI$a */
    public class C40845a implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ Intent f109833d;

        public C40845a(Intent intent) {
            this.f109833d = intent;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardShopUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (i == 0) {
                Log.m105926v("MicroMsg.CardShopUI", "onItemClick pos is 0, click headerview");
                C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardShopUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            if (i > 0) {
                i--;
            }
            C49029co coVar = CardShopUI.this.f109823f.get(i);
            if (!TextUtils.isEmpty(coVar.f131859r) && !TextUtils.isEmpty(coVar.f131860s)) {
                C53246b.m59672d(CardShopUI.this.f109826i, coVar.f131859r, coVar.f131860s, 1052, this.f109833d.getIntExtra("key_from_appbrand_type", 0));
            } else if (!TextUtils.isEmpty(coVar.f131858q)) {
                C53246b.m59678j(CardShopUI.this, coVar.f131858q, 1);
                C115669n.INSTANCE.mo160131h(11941, 4, CardShopUI.this.f109824g.getCardId(), CardShopUI.this.f109824g.mo23270R0(), "", coVar.f131848d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardShopUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI$b */
    public class C40846b implements MenuItem.OnMenuItemClickListener {
        public C40846b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardShopUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI$c */
    public class C40847c implements DialogInterface.OnCancelListener {
        public C40847c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C46000r Fx0 = C46153l0.Fx0();
            CardShopUI cardShopUI = CardShopUI.this;
            Fx0.mo71411a(cardShopUI.f109825h, cardShopUI);
            if (Fx0.f124046h != null) {
                C86709a0.m107529k().f251779b.mo123458d(Fx0.f124046h);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI$d */
    public class C40848d extends BroadcastReceiver {
        public C40848d() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.intent.action.LOCALE_CHANGED")) {
                CardShopUI cardShopUI = CardShopUI.this;
                int i = CardShopUI.f109820s;
                cardShopUI.getClass();
                if (!(!LocationUtil.isGpsEnable() && !LocationUtil.isNetworkProviderEnable())) {
                    CardShopUI.this.mo63801I7();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI$e */
    public class C40849e implements View.OnClickListener {
        public C40849e() {
        }

        public void onClick(View view) {
            C49029co coVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/card/ui/CardShopUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.getId() == C0966R.C0970id.jjc && (coVar = (C49029co) view.getTag()) != null) {
                C53246b.m59671c(CardShopUI.this, coVar.f131857p, coVar.f131856o, coVar.f131848d, coVar.f131854j);
                C115669n.INSTANCE.mo160131h(11941, 5, CardShopUI.this.f109824g.getCardId(), CardShopUI.this.f109824g.mo23270R0(), "", coVar.f131848d);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/card/ui/CardShopUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI$f */
    public class C40850f implements DialogInterface.OnClickListener {
        public C40850f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(CardShopUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI$g */
    public class C40851g extends BaseAdapter {

        /* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI$g$a */
        public class C40852a {

            /* renamed from: a */
            public TextView f109841a;

            /* renamed from: b */
            public TextView f109842b;

            /* renamed from: c */
            public TextView f109843c;

            /* renamed from: d */
            public View f109844d;

            public C40852a(C40851g gVar) {
            }
        }

        public C40851g(C40845a aVar) {
        }

        public int getCount() {
            return CardShopUI.this.f109823f.size();
        }

        public Object getItem(int i) {
            return CardShopUI.this.f109823f.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C40852a aVar;
            if (view == null) {
                view = View.inflate(CardShopUI.this.getContext(), C0966R.C0971layout.f6775o7, (ViewGroup) null);
                aVar = new C40852a(this);
                aVar.f109841a = (TextView) view.findViewById(C0966R.C0970id.jj_);
                aVar.f109842b = (TextView) view.findViewById(C0966R.C0970id.jj6);
                aVar.f109843c = (TextView) view.findViewById(C0966R.C0970id.f359197jj3);
                ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.jjb);
                aVar.f109844d = view.findViewById(C0966R.C0970id.jjc);
                view.setTag(aVar);
            } else {
                aVar = (C40852a) view.getTag();
            }
            C49029co coVar = CardShopUI.this.f109823f.get(i);
            if (coVar == null) {
                aVar.f109841a.setText("");
                aVar.f109842b.setText("");
                aVar.f109843c.setText("");
                return view;
            }
            aVar.f109841a.setText(coVar.f131848d);
            if (coVar.f131855n <= 0.0f) {
                aVar.f109842b.setVisibility(8);
            } else {
                aVar.f109842b.setText(C22945n.m26991D(CardShopUI.this.getBaseContext(), coVar.f131855n));
                aVar.f109842b.setVisibility(0);
            }
            TextView textView = aVar.f109843c;
            textView.setText(coVar.f131852h + coVar.f131853i + coVar.f131854j);
            aVar.f109844d.setOnClickListener(CardShopUI.this.f109832r);
            aVar.f109844d.setTag(coVar);
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI$h */
    public static class C40853h extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.card.ui.CardShopUI$h$a */
        public class C40854a implements C32226l<View, String> {
            public C40854a(C40853h hVar) {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return ((TextView) view.findViewById(C0966R.C0970id.jj_)).getText().toString() + ((TextView) view.findViewById(C0966R.C0970id.f359197jj3)).getText().toString() + ((TextView) view.findViewById(C0966R.C0970id.jj6)).getText().toString();
            }
        }

        public C40853h(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            root(C0966R.C0971layout.f6775o7).view(C0966R.C0970id.jj8).desc((C32226l<? super View, String>) new C40854a(this)).type(ViewType.Button);
        }
    }

    /* renamed from: H7 */
    public final void mo63800H7() {
        Log.m105924i("MicroMsg.CardShopUI", C1715u.NAME);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
        registerReceiver(this.f109831q, intentFilter);
        if (!(!LocationUtil.isGpsEnable() && !LocationUtil.isNetworkProviderEnable())) {
            mo63801I7();
        } else {
            C76879j.m92750u(this, getString(C0966R.string.b0f, new Object[]{getString(C0966R.string.f360214aw1)}), getString(C0966R.string.a3h), new C15613e(this), new C53259f());
        }
    }

    /* renamed from: I7 */
    public final void mo63801I7() {
        boolean z;
        C46000r Fx0 = C46153l0.Fx0();
        String str = this.f109825h;
        String str2 = this.f109826i;
        Fx0.getClass();
        boolean z2 = false;
        Log.m105919d("MicroMsg.CardShopLBSManager", "getShopList, cardTpId = %s, card_id = %s", str, str2);
        Fx0.f124044f = str;
        synchronized (Fx0.f124042d) {
            if (!((HashMap) Fx0.f124042d).containsKey(str)) {
                ((HashMap) Fx0.f124042d).put(str, new HashSet());
            }
            if (!((Set) ((HashMap) Fx0.f124042d).get(str)).contains(this)) {
                ((Set) ((HashMap) Fx0.f124042d).get(str)).add(this);
            }
        }
        synchronized (Fx0.f124043e) {
            if (!TextUtils.isEmpty(str2)) {
                Fx0.f124043e.put(str, str2);
            }
        }
        C92411b ms = ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms();
        if (ms == null) {
            Log.m105920e("MicroMsg.CardShopLBSManager", "getShopList fail, get IGetLocation fail, plugin no loaded?");
            z = false;
        } else {
            ms.mo126409c(Fx0, true, false);
            C5139t.m5183e(22, 10);
            z = true;
        }
        if (!z) {
            Log.m105920e("MicroMsg.CardShopLBSManager", "getShopList fail, get IGetLocation fail, plugin no loaded?");
        } else {
            if (Fx0.f124046h != null) {
                C86709a0.m107529k().f251779b.mo123458d(Fx0.f124046h);
            }
            z2 = true;
        }
        if (z2) {
            this.f109822e = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.ax9), true, true, new C40847c());
        } else {
            C76879j.m92726T(this, getString(C0966R.string.ax8));
        }
    }

    /* renamed from: K5 */
    public void mo63802K5(boolean z, ArrayList<C49029co> arrayList) {
        ArrayList<C49029co> arrayList2 = arrayList;
        ProgressDialog progressDialog = this.f109822e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f109822e = null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(z);
        objArr[1] = Integer.valueOf(arrayList2 == null ? 0 : arrayList.size());
        Log.m105919d("MicroMsg.CardShopUI", "onGotCardShop, isOk = %b, shop list size = %d", objArr);
        if (!z) {
            Log.m105920e("MicroMsg.CardShopUI", "onGotCardShop fail");
        } else if (arrayList2 == null || arrayList.size() == 0) {
            Log.m105920e("MicroMsg.CardShopUI", "list == null || list.size() == 0");
        } else {
            ArrayList<C49029co> arrayList3 = this.f109823f;
            if (arrayList3 != null) {
                arrayList3.clear();
                this.f109823f.addAll(arrayList2);
                View view = this.f109829o;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = this.f109829o;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f109827j.notifyDataSetChanged();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6777o9;
    }

    public void initView() {
        if (!TextUtils.isEmpty(this.f109824g.mo23264L0().f64134Y)) {
            setMMTitle(this.f109824g.mo23264L0().f64134Y);
        } else {
            setMMTitle((int) C0966R.string.f360214aw1);
        }
        this.f109821d = (ListView) findViewById(C0966R.C0970id.ax5);
        LinearLayout linearLayout = (LinearLayout) View.inflate(getBaseContext(), C0966R.C0971layout.f6752nk, (ViewGroup) null);
        this.f109828n = linearLayout;
        this.f109821d.addHeaderView(linearLayout);
        C40851g gVar = new C40851g((C40845a) null);
        this.f109827j = gVar;
        this.f109821d.setAdapter(gVar);
        this.f109821d.setOnItemClickListener(new C40845a(getIntent()));
        setBackBtn(new C40846b());
        View inflate = View.inflate(this, C0966R.C0971layout.f6751nj, (ViewGroup) null);
        this.f109829o = inflate;
        LinearLayout linearLayout2 = this.f109828n;
        if (linearLayout2 != null) {
            linearLayout2.addView(inflate);
        }
        ((TextView) this.f109829o.findViewById(C0966R.C0970id.avn)).setText(C0966R.string.b1i);
        View view = this.f109829o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/card/ui/CardShopUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/card/ui/CardShopUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f109824g = (C20483c) getIntent().getParcelableExtra("key_card_info_data");
        String stringExtra = getIntent().getStringExtra("KEY_CARD_TP_ID");
        String stringExtra2 = getIntent().getStringExtra("KEY_CARD_ID");
        if (this.f109824g != null) {
            Log.m105924i("MicroMsg.CardShopUI", "onCreate  mCardInfo != null");
            this.f109825h = this.f109824g.mo23270R0();
            this.f109826i = this.f109824g.getCardId();
        } else if (!TextUtils.isEmpty(stringExtra)) {
            this.f109825h = stringExtra;
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = "";
            }
            this.f109826i = stringExtra2;
        }
        if (TextUtils.isEmpty(this.f109825h)) {
            Log.m105920e("MicroMsg.CardShopUI", "onCreate  mCardTpid == null");
            finish();
        }
        boolean Uu0 = ((C103918d) C86312j.m106911c(C103918d.class)).Uu0(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, (String) null, (String) null);
        Log.m105925i("MicroMsg.CardShopUI", "checkPermission checkLocation[%b]", Boolean.valueOf(Uu0));
        this.f109830p = Uu0;
        if (Uu0) {
            mo63800H7();
        }
        initView();
    }

    public void onDestroy() {
        if (this.f109830p) {
            unregisterReceiver(this.f109831q);
        }
        C46153l0.Fx0().mo71411a(this.f109825h, this);
        super.onDestroy();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.CardShopUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.CardShopUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 69) {
            if (iArr[0] == 0) {
                Log.m105924i("MicroMsg.CardShopUI", "onMPermissionGranted LocationPermissionGranted " + this.f109830p);
                if (!this.f109830p) {
                    this.f109830p = true;
                    mo63800H7();
                    return;
                }
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.f361129hi0), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.bj_), false, new C40850f(), (DialogInterface.OnClickListener) null);
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C40853h.class);
    }
}
