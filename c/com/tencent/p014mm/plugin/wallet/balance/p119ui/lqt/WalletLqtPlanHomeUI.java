package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b63.C67197o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43322v0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71651s;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.CgiLqtPlanIndex;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75097a;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import di3.C86312j;
import g63.C75886j;
import j20.C117292a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lp3.C88633e;
import lp3.C88643g;
import p755xs.C102720b;
import te3.C51510u9;
import te3.C78012xd3;
import te3.C78017yd3;
import te3.pi4;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI */
public class WalletLqtPlanHomeUI extends WalletLqtBasePresenterUI {

    /* renamed from: s */
    public static final /* synthetic */ int f208085s = 0;

    /* renamed from: e */
    public ListView f208086e;

    /* renamed from: f */
    public Button f208087f;

    /* renamed from: g */
    public RelativeLayout f208088g;

    /* renamed from: h */
    public LinearLayout f208089h;

    /* renamed from: i */
    public RelativeLayout f208090i;

    /* renamed from: j */
    public TextView f208091j;

    /* renamed from: n */
    public ViewGroup f208092n;

    /* renamed from: o */
    public C43322v0 f208093o = ((C43322v0) this.f207915d.mo136940b(this, C43322v0.class));

    /* renamed from: p */
    public C71755f f208094p = new C71755f((C71750a) null);

    /* renamed from: q */
    public List<C78017yd3> f208095q = new ArrayList();

    /* renamed from: r */
    public int f208096r;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI$a */
    public class C71750a implements View.OnClickListener {
        public C71750a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtPlanHomeUI walletLqtPlanHomeUI = WalletLqtPlanHomeUI.this;
            int i = WalletLqtPlanHomeUI.f208085s;
            walletLqtPlanHomeUI.mo98954J7(65281);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI$b */
    public class C71751b implements AdapterView.OnItemClickListener {
        public C71751b(WalletLqtPlanHomeUI walletLqtPlanHomeUI) {
        }

        /* JADX WARNING: type inference failed for: r8v0, types: [android.widget.AdapterView<?>, java.lang.Object, android.widget.AdapterView] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
                r0.add(r9)
                java.lang.Long r9 = java.lang.Long.valueOf(r11)
                r0.add(r9)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$2"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                r9 = 1
                java.lang.Object[] r9 = new java.lang.Object[r9]
                r11 = 0
                java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
                r9[r11] = r12
                java.lang.String r11 = "MicroMsg.WalletLqtPlanHomeUI"
                java.lang.String r12 = "pos: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r9)
                android.widget.Adapter r8 = r8.getAdapter()
                java.lang.Object r8 = r8.getItem(r10)
                te3.yd3 r8 = (te3.C78017yd3) r8
                java.lang.String r8 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$2"
                java.lang.String r9 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r10 = "onItemClick"
                java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                j20.C117292a.m165361g(r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtPlanHomeUI.C71751b.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI$c */
    public class C71752c implements View.OnClickListener {
        public C71752c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtPlanHomeUI walletLqtPlanHomeUI = WalletLqtPlanHomeUI.this;
            int i = WalletLqtPlanHomeUI.f208085s;
            walletLqtPlanHomeUI.mo98954J7(65283);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI$d */
    public class C71753d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C78012xd3 f208099d;

        public C71753d(C78012xd3 xd32) {
            this.f208099d = xd32;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletLqtPlanHomeUI", "click banner");
            C75228t.m90219L(WalletLqtPlanHomeUI.this.getContext(), this.f208099d.f228412i.f142684e, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI$e */
    public class C71754e implements C75097a.C75099b<C78012xd3> {

        /* renamed from: a */
        public final /* synthetic */ boolean f208101a;

        public C71754e(boolean z) {
            this.f208101a = z;
        }

        /* renamed from: a */
        public void mo67542a(Object obj) {
            C78012xd3 xd32 = (C78012xd3) obj;
            Log.m105924i("MicroMsg.WalletLqtPlanHomeUI", "on index cache callback");
            if (xd32 != null && this.f208101a) {
                WalletLqtPlanHomeUI walletLqtPlanHomeUI = WalletLqtPlanHomeUI.this;
                int i = WalletLqtPlanHomeUI.f208085s;
                walletLqtPlanHomeUI.mo98956L7(xd32);
            }
        }

        /* renamed from: b */
        public void mo67543b(Object obj, int i, int i2) {
            C78012xd3 xd32 = (C78012xd3) obj;
            Log.m105924i("MicroMsg.WalletLqtPlanHomeUI", "on index response callback");
            if (xd32 != null) {
                int i3 = xd32.f228407d;
                if (i3 == 0) {
                    WalletLqtPlanHomeUI walletLqtPlanHomeUI = WalletLqtPlanHomeUI.this;
                    int i4 = WalletLqtPlanHomeUI.f208085s;
                    walletLqtPlanHomeUI.mo98956L7(xd32);
                    return;
                }
                C67197o.m79488c(i3, xd32.f228408e).mo91297a(WalletLqtPlanHomeUI.this.getContext(), true);
                return;
            }
            C67197o.m79487b(-1, -1).mo91297a(WalletLqtPlanHomeUI.this.getContext(), true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI$f */
    public class C71755f extends BaseAdapter {
        public C71755f(C71750a aVar) {
        }

        public int getCount() {
            return WalletLqtPlanHomeUI.this.f208095q.size();
        }

        public Object getItem(int i) {
            return WalletLqtPlanHomeUI.this.f208095q.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(WalletLqtPlanHomeUI.this.getContext()).inflate(C0966R.C0971layout.b94, viewGroup, false);
                view.setTag(new C71756g(view));
            }
            C78017yd3 yd32 = WalletLqtPlanHomeUI.this.f208095q.get(i);
            C71756g gVar = (C71756g) view.getTag();
            gVar.f208105b.mo105015b();
            BigDecimal h = C75228t.m90248h("" + yd32.f228572e, "100", 2, RoundingMode.HALF_UP);
            if (((double) h.intValue()) == h.doubleValue()) {
                WalletTextView walletTextView = gVar.f208105b;
                WalletLqtPlanHomeUI walletLqtPlanHomeUI = WalletLqtPlanHomeUI.this;
                walletTextView.setText(WalletLqtPlanHomeUI.m84227H7(walletLqtPlanHomeUI, "" + h.intValue()));
            } else {
                gVar.f208105b.setText(WalletLqtPlanHomeUI.m84227H7(WalletLqtPlanHomeUI.this, h.toString()));
            }
            gVar.f208108e.setText(String.format("%s %s(%s)", new Object[]{yd32.f228582r, yd32.f228584t, yd32.f228574g}));
            Bitmap N6 = ((C102720b) C86312j.m106911c(C102720b.class)).mo142104N6(new C75886j(yd32.f228583s));
            if (N6 != null) {
                gVar.f208113j.setImageBitmap(N6);
            }
            pi4 pi4 = yd32.f228577j;
            if (pi4 == null || Util.isNullOrNil(pi4.f184817d)) {
                gVar.f208109f.setVisibility(8);
            } else {
                gVar.f208109f.setText(yd32.f228577j.f184817d);
                if (!Util.isNullOrNil(yd32.f228577j.f184818e)) {
                    gVar.f208109f.setTextColor(C43423i0.m46931b(yd32.f228577j.f184818e, true));
                } else {
                    gVar.f208109f.setTextColor(WalletLqtPlanHomeUI.this.getResources().getColor(C0966R.color.BW_50));
                }
                gVar.f208109f.setVisibility(0);
            }
            gVar.f208112i.setVisibility(8);
            gVar.f208110g.setVisibility(8);
            if (yd32.f228578n != null) {
                gVar.f208107d.setOnClickListener(new C71825q1(gVar, yd32));
            }
            if (yd32.f228581q != 1) {
                gVar.f208111h.setVisibility(0);
                gVar.f208108e.setAlpha(0.2f);
                gVar.f208105b.setAlpha(0.2f);
                gVar.f208113j.setAlpha(0.3f);
                gVar.f208106c.setAlpha(1.0f);
            } else {
                gVar.f208111h.setVisibility(8);
                gVar.f208108e.setAlpha(1.0f);
                gVar.f208105b.setAlpha(1.0f);
                gVar.f208113j.setAlpha(1.0f);
                gVar.f208106c.setAlpha(1.0f);
            }
            return view;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanHomeUI$g */
    public class C71756g {

        /* renamed from: a */
        public View f208104a;

        /* renamed from: b */
        public WalletTextView f208105b;

        /* renamed from: c */
        public ImageView f208106c;

        /* renamed from: d */
        public LinearLayout f208107d;

        /* renamed from: e */
        public TextView f208108e;

        /* renamed from: f */
        public TextView f208109f;

        /* renamed from: g */
        public TextView f208110g;

        /* renamed from: h */
        public TextView f208111h;

        /* renamed from: i */
        public LinearLayout f208112i;

        /* renamed from: j */
        public CdnImageView f208113j;

        public C71756g(View view) {
            this.f208104a = view;
            this.f208105b = (WalletTextView) view.findViewById(C0966R.C0970id.g8_);
            this.f208106c = (ImageView) view.findViewById(C0966R.C0970id.g8a);
            this.f208111h = (TextView) view.findViewById(C0966R.C0970id.g8b);
            this.f208108e = (TextView) view.findViewById(C0966R.C0970id.g87);
            this.f208109f = (TextView) view.findViewById(C0966R.C0970id.g88);
            this.f208110g = (TextView) view.findViewById(C0966R.C0970id.g86);
            this.f208112i = (LinearLayout) view.findViewById(C0966R.C0970id.g85);
            this.f208113j = (CdnImageView) view.findViewById(C0966R.C0970id.g84);
            this.f208107d = (LinearLayout) view.findViewById(C0966R.C0970id.g89);
            int b = C76577a.m92151b(WalletLqtPlanHomeUI.this.getContext(), 50);
            Util.expandViewTouchArea(this.f208106c, b, b, b, b);
        }
    }

    /* renamed from: H7 */
    public static String m84227H7(WalletLqtPlanHomeUI walletLqtPlanHomeUI, String str) {
        walletLqtPlanHomeUI.getClass();
        if (str.contains(".")) {
            return str;
        }
        return str + ".00";
    }

    /* renamed from: I7 */
    public final void mo98953I7(boolean z) {
        C71651s sVar = new C71651s();
        sVar.f221004c = new CgiLqtPlanIndex();
        sVar.mo104792c(new C71754e(z), true);
    }

    /* renamed from: J7 */
    public final void mo98954J7(int i) {
        Log.m105924i("MicroMsg.WalletLqtPlanHomeUI", "go to add plan ui -> add");
        Intent intent = new Intent(this, WalletLqtPlanAddUI.class);
        intent.putExtra("key_mode", 1);
        startActivityForResult(intent, i);
    }

    /* renamed from: K7 */
    public final void mo98955K7() {
        Log.m105924i("MicroMsg.WalletLqtPlanHomeUI", "show null plan home ui");
        setMMTitle(getString(C0966R.string.kyn));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.f358657gb1);
        this.f208090i = relativeLayout;
        relativeLayout.setVisibility(0);
        ((LinearLayout) findViewById(C0966R.C0970id.f358656gb0)).setOnClickListener(new C71752c());
    }

    /* renamed from: L7 */
    public final void mo98956L7(C78012xd3 xd32) {
        C78012xd3 xd33 = xd32;
        Log.m105918d("MicroMsg.WalletLqtPlanHomeUI", "update view");
        if (xd33 != null) {
            LinkedList<C78017yd3> linkedList = xd33.f228409f;
            if (linkedList == null || linkedList.isEmpty()) {
                Log.m105924i("MicroMsg.WalletLqtPlanHomeUI", "show empty view");
                if (this.f208096r == 3) {
                    mo98955K7();
                    this.f208095q = xd33.f228409f;
                    this.f208094p.notifyDataSetChanged();
                    this.f208092n.setVisibility(8);
                    return;
                }
                finish();
                return;
            }
            if (Util.isNullOrNil(xd33.f228414n)) {
                setMMTitle("");
            } else {
                setMMTitle(xd33.f228414n);
            }
            setActionbarColor(getContext().getResources().getColor(C0966R.color.f2927a));
            this.f208088g.setVisibility(8);
            this.f208086e.setVisibility(0);
            Log.m105925i("MicroMsg.WalletLqtPlanHomeUI", "limit: %s", Long.valueOf(xd33.f228410g));
            this.f208092n.setVisibility(0);
            if (xd33.f228410g <= ((long) xd33.f228409f.size())) {
                View findViewById = this.f208092n.findViewById(C0966R.C0970id.g98);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView = (TextView) this.f208092n.findViewById(C0966R.C0970id.g99);
                textView.setPadding(C76577a.m92151b(getContext(), 24), 0, 0, 0);
                textView.setText(xd33.f228413j);
                textView.setTextColor(getContext().getResources().getColor(C0966R.color.f3563xt));
                this.f208092n.setEnabled(false);
            } else {
                View findViewById2 = this.f208092n.findViewById(C0966R.C0970id.g98);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanHomeUI", "updateFooterView", "(Lcom/tencent/mm/protocal/protobuf/PlanIndexResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                TextView textView2 = (TextView) this.f208092n.findViewById(C0966R.C0970id.g99);
                textView2.setPadding(0, 0, 0, 0);
                textView2.setText(C0966R.string.f361570kw3);
                textView2.setTextColor(getResources().getColor(C0966R.color.a7f));
                this.f208092n.setEnabled(true);
            }
            this.f208095q = xd33.f228409f;
            this.f208094p.notifyDataSetChanged();
            C51510u9 u9Var = xd33.f228412i;
            if (u9Var == null || Util.isNullOrNil(u9Var.f142683d)) {
                this.f208089h.setVisibility(8);
                return;
            }
            this.f208091j.setText(xd33.f228412i.f142683d);
            this.f208089h.setOnClickListener(new C71753d(xd33));
            this.f208089h.setVisibility(0);
            return;
        }
        Log.m105924i("MicroMsg.WalletLqtPlanHomeUI", "resp is null");
        finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b96;
    }

    public void initView() {
        this.f208086e = (ListView) findViewById(C0966R.C0970id.g8h);
        TextView textView = (TextView) findViewById(C0966R.C0970id.g8f);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.g8d);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.g8g);
        this.f208087f = (Button) findViewById(C0966R.C0970id.g8c);
        this.f208088g = (RelativeLayout) findViewById(C0966R.C0970id.g8e);
        this.f208089h = (LinearLayout) findViewById(C0966R.C0970id.g9y);
        this.f208091j = (TextView) findViewById(C0966R.C0970id.g9z);
        C71755f fVar = new C71755f((C71750a) null);
        this.f208094p = fVar;
        this.f208086e.setAdapter(fVar);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(C0966R.C0971layout.b95, this.f208086e, false);
        this.f208092n = viewGroup;
        viewGroup.setOnClickListener(new C71810m1(this));
        this.f208086e.addFooterView(this.f208092n);
        this.f208087f.setOnClickListener(new C71750a());
        this.f208086e.setOnItemClickListener(new C71751b(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.WalletLqtPlanHomeUI", "activity result: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 5 && i2 == -1) {
            i = intent.getIntExtra("oper_type", -1);
        }
        this.f208096r = i;
        if (i != 1 && i != 2 && i != 3) {
            switch (i) {
                case 65281:
                    if (i2 == -1) {
                        mo98953I7(false);
                        break;
                    }
                    break;
                case 65282:
                    if (i2 != -1) {
                        finish();
                        break;
                    } else {
                        mo98953I7(false);
                        break;
                    }
                case 65283:
                    if (i2 == -1) {
                        mo98953I7(false);
                        this.f208090i.setVisibility(8);
                        break;
                    }
                    break;
            }
        } else if (i2 == -1) {
            String stringExtra = intent.getStringExtra("encrypt_pwd");
            int intExtra = intent.getIntExtra("oper_type", -1);
            int intExtra2 = intent.getIntExtra("plan_id", -1);
            Dialog d = C75197d0.m90163d(getContext(), false, false, (DialogInterface.OnCancelListener) null);
            C43322v0.C43323a aVar = this.f208093o.f117159b;
            aVar.getClass();
            ((C88633e) C88643g.m110549g(Integer.valueOf(intExtra), Integer.valueOf(intExtra2), stringExtra)).mo123061d(aVar).mo123062e(new C71822p1(this, d)).mo123065b(new C71812n1(this, d));
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.f2927a));
        setStatusColor();
        hideActionbarLine();
        initView();
        int intExtra = getIntent().getIntExtra("key_plan_go_scene_ui", 0);
        Log.m105925i("MicroMsg.WalletLqtPlanHomeUI", "WalletLqtPlanHomeUI scene：%s", Integer.valueOf(intExtra));
        if (intExtra == 1) {
            mo98954J7(65282);
        } else if (intExtra != 2) {
            Log.m105924i("MicroMsg.WalletLqtPlanHomeUI", "go to plan home ui");
            Parcelable parcelableExtra = getIntent().getParcelableExtra("key_plan_index_resp");
            if (parcelableExtra instanceof CgiLqtPlanIndex.PlanIndexParcel) {
                mo98956L7(CgiLqtPlanIndex.m84098l((CgiLqtPlanIndex.PlanIndexParcel) parcelableExtra));
                return;
            }
            Log.m105924i("MicroMsg.WalletLqtPlanHomeUI", "parcelable no instanceof CgiLqtPlanIndex.PlanIndexParcel");
            finish();
        } else {
            mo98955K7();
        }
    }
}
