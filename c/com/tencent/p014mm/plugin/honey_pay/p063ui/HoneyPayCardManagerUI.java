package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import b63.C39736t0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import de3.C75355a0;
import di3.C86312j;
import fy3.C32226l;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ob0.C117747y;
import p196ln.C76705f;
import p629ny.C76979h;
import q02.C47745i;
import q02.C47746j;
import q02.C47748l;
import t02.C48527c;
import te3.C49546gd3;
import te3.C50062k03;
import te3.C50957qg2;
import te3.C51121rk3;
import te3.C51222sb3;
import te3.C51469tz2;
import te3.eh4;
import u02.C52402a;
import u02.C52403b;
import u02.C52404c;
import u02.C52409h;
import u02.i$$a;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI */
public class HoneyPayCardManagerUI extends HoneyPayBaseUI {

    /* renamed from: Z */
    public static final /* synthetic */ int f114744Z = 0;

    /* renamed from: A */
    public View f114745A;

    /* renamed from: B */
    public View f114746B;

    /* renamed from: C */
    public TextView f114747C;

    /* renamed from: D */
    public WcPayBannerView f114748D;

    /* renamed from: E */
    public C42416e f114749E;

    /* renamed from: F */
    public List<C51222sb3> f114750F = new ArrayList();

    /* renamed from: G */
    public Bankcard f114751G;

    /* renamed from: H */
    public C49546gd3 f114752H;

    /* renamed from: I */
    public C49546gd3 f114753I;

    /* renamed from: J */
    public String f114754J = "";

    /* renamed from: K */
    public String f114755K = "";

    /* renamed from: L */
    public String f114756L = "";

    /* renamed from: M */
    public String f114757M;

    /* renamed from: N */
    public long f114758N;

    /* renamed from: P */
    public long f114759P;

    /* renamed from: Q */
    public int f114760Q;

    /* renamed from: R */
    public eh4 f114761R;

    /* renamed from: S */
    public boolean f114762S;

    /* renamed from: T */
    public String f114763T;

    /* renamed from: U */
    public C39736t0.C39737a f114764U;

    /* renamed from: V */
    public String f114765V;

    /* renamed from: W */
    public String f114766W;

    /* renamed from: X */
    public String f114767X;

    /* renamed from: Y */
    public String f114768Y;

    /* renamed from: f */
    public ListView f114769f;

    /* renamed from: g */
    public ViewGroup f114770g;

    /* renamed from: h */
    public ViewGroup f114771h;

    /* renamed from: i */
    public ViewGroup f114772i;

    /* renamed from: j */
    public ViewGroup f114773j;

    /* renamed from: n */
    public ImageView f114774n;

    /* renamed from: o */
    public WalletTextView f114775o;

    /* renamed from: p */
    public TextView f114776p;

    /* renamed from: q */
    public MMSwitchBtn f114777q;

    /* renamed from: r */
    public LinearLayout f114778r;

    /* renamed from: s */
    public TextView f114779s;

    /* renamed from: t */
    public TextView f114780t;

    /* renamed from: u */
    public TextView f114781u;

    /* renamed from: v */
    public TextView f114782v;

    /* renamed from: w */
    public TextView f114783w;

    /* renamed from: x */
    public TextView f114784x;

    /* renamed from: y */
    public TextView f114785y;

    /* renamed from: z */
    public TextView f114786z;

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI$d */
    public static class C4598d extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI$d$a */
        public class C4599a implements C32226l<View, String> {
            public C4599a(C4598d dVar) {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return ((TextView) view.findViewById(C0966R.C0970id.ey7)).getText() + MMApplicationContext.getContext().getString(C0966R.string.fjy, new Object[]{((TextView) view.findViewById(C0966R.C0970id.ey5)).getText()});
            }
        }

        public C4598d(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            ViewSetter desc = root(C0966R.C0970id.eyq).view(C0966R.C0970id.eyu).desc((C32226l<? super View, String>) new i$$a());
            ViewType viewType = ViewType.Button;
            desc.type(viewType);
            root(C0966R.C0971layout.azj).view(C0966R.C0970id.ey8).desc((C32226l<? super View, String>) new C4599a(this)).type(viewType);
            root(C0966R.C0971layout.azh).view(C0966R.C0970id.eyg).desc((int) C0966R.string.f360880fk2).type(viewType);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI$a */
    public class C42413a extends C7089c0 {
        public C42413a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            HoneyPayCardManagerUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI$b */
    public class C42414b implements AdapterView.OnItemClickListener {
        public C42414b() {
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
                java.lang.String r1 = "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$1"
                java.lang.String r2 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r3 = "onItemClick"
                java.lang.String r4 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                android.widget.Adapter r8 = r8.getAdapter()
                java.lang.Object r8 = r8.getItem(r10)
                te3.sb3 r8 = (te3.C51222sb3) r8
                if (r8 == 0) goto L_0x0098
                java.lang.String r9 = r8.f141428f
                boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
                if (r9 != 0) goto L_0x0098
                com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI r9 = com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI.this
                java.lang.String r9 = r9.f114712d
                r11 = 2
                java.lang.Object[] r12 = new java.lang.Object[r11]
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                r0 = 0
                r12[r0] = r10
                long r1 = r8.f141427e
                java.lang.Long r10 = java.lang.Long.valueOf(r1)
                r1 = 1
                r12[r1] = r10
                java.lang.String r10 = "click item: %s, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r12)
                com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI r9 = com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI.this
                androidx.appcompat.app.AppCompatActivity r9 = r9.getContext()
                java.lang.String r8 = r8.f141428f
                com.tencent.p014mm.wallet_core.p137ui.C75228t.m90219L(r9, r8, r0)
                com.tencent.mm.plugin.report.service.n r8 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r9 = 15191(0x3b57, float:2.1287E-41)
                r10 = 6
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
                r10[r0] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
                r10[r1] = r12
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
                r10[r11] = r12
                r11 = 3
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
                r10[r11] = r12
                r11 = 4
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                r10[r11] = r12
                r11 = 5
                java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
                r10[r11] = r12
                r8.mo160131h(r9, r10)
            L_0x0098:
                java.lang.String r8 = "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$1"
                java.lang.String r9 = "android/widget/AdapterView$OnItemClickListener"
                java.lang.String r10 = "onItemClick"
                java.lang.String r11 = "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V"
                j20.C117292a.m165361g(r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI.C42414b.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI$c */
    public class C42415c implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47748l f114789a;

        public C42415c(C47748l lVar) {
            this.f114789a = lVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            HoneyPayCardManagerUI honeyPayCardManagerUI = HoneyPayCardManagerUI.this;
            C51121rk3 rk32 = this.f114789a.f128265r;
            int i3 = HoneyPayCardManagerUI.f114744Z;
            honeyPayCardManagerUI.mo66502K7(rk32);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI$e */
    public class C42416e extends BaseAdapter {
        public C42416e(C42414b bVar) {
        }

        public int getCount() {
            return HoneyPayCardManagerUI.this.f114750F.size();
        }

        public Object getItem(int i) {
            return HoneyPayCardManagerUI.this.f114750F.get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            if (view == null) {
                view2 = LayoutInflater.from(HoneyPayCardManagerUI.this.getContext()).inflate(C0966R.C0971layout.azj, viewGroup, false);
                C42417f fVar = new C42417f((C42414b) null);
                fVar.f114792a = (TextView) view2.findViewById(C0966R.C0970id.ey7);
                WalletTextView walletTextView = (WalletTextView) view2.findViewById(C0966R.C0970id.ey5);
                fVar.f114793b = walletTextView;
                walletTextView.mo105015b();
                fVar.f114794c = view2.findViewById(C0966R.C0970id.ey6);
                view2.setTag(fVar);
            } else {
                view2 = view;
            }
            C51222sb3 sb32 = HoneyPayCardManagerUI.this.f114750F.get(i);
            C42417f fVar2 = (C42417f) view2.getTag();
            fVar2.f114792a.setText(sb32.f141426d);
            fVar2.f114793b.setText(C48527c.m53905a(sb32.f141427e));
            if (HoneyPayCardManagerUI.this.f114750F.size() == 1) {
                View view3 = fVar2.f114794c;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view5 = fVar2.f114794c;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar2.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI$SettingViewHolder", "setCreditLine", "(Lcom/tencent/mm/protocal/protobuf/PayCreditLine;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return view2;
        }

        public boolean isEnabled(int i) {
            return !Util.isNullOrNil(HoneyPayCardManagerUI.this.f114750F.get(i).f141428f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardManagerUI$f */
    public class C42417f {

        /* renamed from: a */
        public TextView f114792a;

        /* renamed from: b */
        public WalletTextView f114793b;

        /* renamed from: c */
        public View f114794c;

        public C42417f(C42414b bVar) {
        }
    }

    /* renamed from: I7 */
    public final void mo66500I7() {
        Log.m105924i(this.f114712d, "do qry detail");
        C47748l lVar = new C47748l(this.f114757M);
        lVar.mo104821m1(this);
        doSceneProgress(lVar, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r0 = ((p281yz.C79173v) di3.C86312j.m106911c(r0)).Ex0().f192960m;
     */
    /* renamed from: J7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tencent.p014mm.plugin.wallet_core.model.Bankcard mo66501J7(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Class<yz.v> r0 = p281yz.C79173v.class
            di3.d r1 = di3.C86312j.m106911c(r0)
            yz.v r1 = (p281yz.C79173v) r1
            b63.s0 r1 = r1.Ex0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = r1.mo91323e(r4)
            if (r1 != 0) goto L_0x0029
            di3.d r0 = di3.C86312j.m106911c(r0)
            yz.v r0 = (p281yz.C79173v) r0
            b63.s0 r0 = r0.Ex0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r0.f192960m
            if (r0 == 0) goto L_0x0029
            java.lang.String r2 = r0.field_bindSerial
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x0029
            return r0
        L_0x0029:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayCardManagerUI.mo66501J7(java.lang.String):com.tencent.mm.plugin.wallet_core.model.Bankcard");
    }

    /* renamed from: K7 */
    public final void mo66502K7(C51121rk3 rk32) {
        C51121rk3 rk33 = rk32;
        this.f114754J = rk33.f140987r;
        this.f114756L = rk33.f140988s;
        this.f114761R = rk33.f140984o;
        this.f114755K = rk33.f140989t;
        this.f114750F.clear();
        this.f114749E.notifyDataSetChanged();
        C51469tz2 tz22 = rk33.f140990u;
        if (tz22 != null) {
            this.f114765V = tz22.f142505d;
            this.f114766W = tz22.f142507f;
            this.f114767X = tz22.f142508g;
            this.f114768Y = tz22.f142506e;
        }
        C50957qg2 qg22 = rk33.f140978f;
        if (qg22 != null) {
            setMMTitle(qg22.f140308s);
            this.f114758N = rk33.f140981i;
            this.f114759P = rk33.f140980h;
            C49546gd3 gd32 = rk33.f140978f.f140302j;
            if (gd32 != null) {
                this.f114751G = mo66501J7(gd32.f133978g);
                this.f114752H = rk33.f140978f.f140302j;
            }
            C50957qg2 qg23 = rk33.f140978f;
            this.f114779s.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, C75228t.m90246g(qg23.f140297e, 6) + getString(C0966R.string.fkr), this.f114779s.getTextSize()));
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f114774n, qg23.f140297e, 0.06f);
            this.f114775o.setText(C48527c.m53905a(qg23.f140298f));
            this.f114777q.setCheck(qg23.f140301i != 0);
            mo66503L7();
            this.f114748D.setBannerData(rk33.f140986q);
            int i = rk33.f140978f.f140299g;
            Log.m105925i(this.f114712d, "detail state: %s", Integer.valueOf(i));
            Log.m105919d(this.f114712d, "state title: %s", rk33.f140978f.f140307r);
            if (!Util.isNullOrNil(rk33.f140978f.f140307r)) {
                this.f114781u.setText(rk33.f140978f.f140307r);
                this.f114781u.setVisibility(0);
            } else {
                this.f114781u.setVisibility(8);
            }
            if (!Util.isNullOrNil(rk33.f140978f.f140300h)) {
                this.f114782v.setText(rk33.f140978f.f140300h);
                this.f114782v.setVisibility(0);
            } else {
                this.f114782v.setVisibility(8);
            }
            if (i == 1) {
                this.f114781u.setTextColor(getResources().getColor(C0966R.color.f2960ag));
                this.f114775o.setTextColor(getResources().getColor(C0966R.color.FG_1));
                View findViewById = findViewById(C0966R.C0970id.eyl);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f114769f.removeFooterView(this.f114771h);
                this.f114771h.setVisibility(8);
                View view2 = this.f114745A;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (this.f114762S) {
                    ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(C0966R.C0971layout.azf, (ViewGroup) null);
                    this.f114773j = viewGroup;
                    ((Button) viewGroup.findViewById(C0966R.C0970id.eym)).setOnClickListener(new C42413a());
                    this.f114769f.addFooterView(this.f114773j);
                    showHomeBtn(false);
                    enableBackMenu(false);
                    setMMTitle("");
                }
            } else if (i == 2) {
                LinkedList<C51222sb3> linkedList = rk33.f140979g;
                if (linkedList != null && !linkedList.isEmpty()) {
                    this.f114750F = rk33.f140979g;
                    this.f114749E.notifyDataSetChanged();
                    this.f114769f.removeFooterView(this.f114771h);
                    this.f114771h.setVisibility(8);
                    C50062k03 k032 = rk33.f140985p;
                    if (k032 != null) {
                        ViewGroup viewGroup2 = (ViewGroup) View.inflate(this, C0966R.C0971layout.azh, (ViewGroup) null);
                        this.f114772i = viewGroup2;
                        ((TextView) viewGroup2.findViewById(C0966R.C0970id.eyh)).setText(k032.f136498d);
                        this.f114772i.setOnClickListener(new C52409h(this, k032));
                        this.f114769f.addFooterView(this.f114772i);
                    }
                    findViewById(C0966R.C0970id.eyz).setBackgroundResource(C0966R.color.f3565xw);
                }
                this.f114776p.setVisibility(0);
                this.f114775o.setVisibility(0);
                View view3 = this.f114745A;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view4 = view3;
                C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = findViewById(C0966R.C0970id.eyl);
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                View view5 = findViewById2;
                C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i == 3) {
                View findViewById3 = findViewById(C0966R.C0970id.eyl);
                C9556a aVar5 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar5.mo10233c(0);
                View view6 = findViewById3;
                C117292a.m165358d(view6, aVar5.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f114783w.setText(C0966R.string.fka);
                this.f114785y.setText(C0966R.string.fl6);
                this.f114784x.setText(C48527c.m53906b((long) rk33.f140978f.f140303n));
                this.f114786z.setText(C48527c.m53906b((long) rk33.f140978f.f140304o));
                this.f114769f.removeFooterView(this.f114771h);
                this.f114771h.setVisibility(8);
                View view7 = this.f114745A;
                C9556a aVar6 = new C9556a();
                aVar6.mo10233c(8);
                View view8 = view7;
                C117292a.m165358d(view8, aVar6.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                C117292a.m165359e(view8, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById4 = findViewById(C0966R.C0970id.f358414ez3);
                C9556a aVar7 = new C9556a();
                aVar7.mo10233c(8);
                View view9 = findViewById4;
                C117292a.m165358d(view9, aVar7.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                C117292a.m165359e(view9, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i == 4) {
                this.f114776p.setVisibility(8);
                View findViewById5 = findViewById(C0966R.C0970id.eyl);
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar8.mo10233c(0);
                View view10 = findViewById5;
                C117292a.m165358d(view10, aVar8.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(view10, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f114783w.setText(C0966R.string.fl5);
                this.f114784x.setText(C48527c.m53906b((long) rk33.f140978f.f140305p));
                View findViewById6 = findViewById(C0966R.C0970id.f358411ez0);
                C9556a aVar9 = new C9556a();
                aVar9.mo10233c(8);
                View view11 = findViewById6;
                C117292a.m165358d(view11, aVar9.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                C117292a.m165359e(view11, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f114769f.removeFooterView(this.f114771h);
                this.f114771h.setVisibility(8);
                View view12 = this.f114745A;
                C9556a aVar10 = new C9556a();
                aVar10.mo10233c(8);
                View view13 = view12;
                C117292a.m165358d(view13, aVar10.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((Integer) aVar10.mo10231a(0)).intValue());
                C117292a.m165359e(view13, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById7 = findViewById(C0966R.C0970id.f358414ez3);
                C9556a aVar11 = new C9556a();
                aVar11.mo10233c(8);
                View view14 = findViewById7;
                C117292a.m165358d(view14, aVar11.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById(C0966R.C0970id.eyz).setBackgroundResource(C0966R.color.al6);
            } else {
                Log.m105919d(this.f114712d, "unknown state: %s", Integer.valueOf(i));
            }
        }
        View view15 = this.f114746B;
        C9556a aVar12 = new C9556a();
        ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
        aVar12.mo10233c(8);
        View view16 = view15;
        C117292a.m165358d(view16, aVar12.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view15.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
        C117292a.m165359e(view16, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardManagerUI", "onDetailSceneSuccEnd", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C48527c.m53912h(this, rk33.f140982j, this.f114757M, 2, this.f114761R);
        C4598d dVar = (C4598d) component(C4598d.class);
        dVar.getClass();
        C119179t tVar = C119157j.f356862d;
        C4604a aVar13 = new C4604a(dVar);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(aVar13, 300, false);
    }

    /* renamed from: L7 */
    public final void mo66503L7() {
        C49546gd3 gd32 = this.f114752H;
        if (gd32 != null) {
            this.f114780t.setText(gd32.f133975d);
            if (!Util.isNullOrNil(this.f114752H.f133976e)) {
                this.f114780t.setTextColor(C43423i0.m46931b(this.f114752H.f133976e, true));
            } else {
                this.f114780t.setTextColor(getResources().getColor(C0966R.color.a7f));
            }
            if (!Util.isNullOrNil(this.f114752H.f133981j)) {
                this.f114747C.setText(this.f114752H.f133981j);
                this.f114747C.setVisibility(0);
                return;
            }
            this.f114747C.setVisibility(8);
            return;
        }
        Log.m105924i(this.f114712d, "reset payway view for null");
        this.f114780t.setText("");
        this.f114780t.setTextColor(getResources().getColor(C0966R.color.a7f));
        this.f114747C.setVisibility(8);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.azk;
    }

    public void initView() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this).inflate(C0966R.C0971layout.azi, (ViewGroup) null);
        this.f114770g = viewGroup;
        this.f114777q = (MMSwitchBtn) viewGroup.findViewById(C0966R.C0970id.eyt);
        this.f114778r = (LinearLayout) this.f114770g.findViewById(C0966R.C0970id.eyu);
        this.f114780t = (TextView) this.f114770g.findViewById(C0966R.C0970id.eyx);
        this.f114774n = (ImageView) this.f114770g.findViewById(C0966R.C0970id.eyi);
        this.f114775o = (WalletTextView) this.f114770g.findViewById(C0966R.C0970id.eyy);
        this.f114779s = (TextView) this.f114770g.findViewById(C0966R.C0970id.ez7);
        this.f114776p = (TextView) this.f114770g.findViewById(C0966R.C0970id.eys);
        this.f114781u = (TextView) this.f114770g.findViewById(C0966R.C0970id.ez5);
        this.f114782v = (TextView) this.f114770g.findViewById(C0966R.C0970id.ez4);
        this.f114783w = (TextView) this.f114770g.findViewById(C0966R.C0970id.eyo);
        this.f114784x = (TextView) this.f114770g.findViewById(C0966R.C0970id.eyp);
        this.f114785y = (TextView) this.f114770g.findViewById(C0966R.C0970id.f358412ez1);
        this.f114786z = (TextView) this.f114770g.findViewById(C0966R.C0970id.f358413ez2);
        this.f114745A = this.f114770g.findViewById(C0966R.C0970id.eyk);
        this.f114747C = (TextView) this.f114770g.findViewById(C0966R.C0970id.eyv);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) this.f114770g.findViewById(C0966R.C0970id.lkt);
        this.f114748D = wcPayBannerView;
        wcPayBannerView.mo105020a();
        this.f114775o.mo105015b();
        this.f114777q.setSwitchListener(new C52402a(this));
        this.f114778r.setOnClickListener(new C52403b(this));
        String string = getString(C0966R.string.fkr);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append(getString(C0966R.string.fkt));
        spannableStringBuilder.setSpan(new C72476y0(1, (C72476y0.C72477a) new C52404c(this)), string.length(), spannableStringBuilder.length(), 18);
        this.f114776p.setClickable(true);
        this.f114776p.setOnTouchListener(new C75355a0(this));
        this.f114776p.setText(spannableStringBuilder);
        this.f114771h = (ViewGroup) LayoutInflater.from(this).inflate(C0966R.C0971layout.azg, (ViewGroup) null);
        this.f114746B = findViewById(C0966R.C0970id.eyj);
        ListView listView = (ListView) findViewById(C0966R.C0970id.eyr);
        this.f114769f = listView;
        listView.addHeaderView(this.f114770g);
        this.f114769f.addFooterView(this.f114771h, (Object) null, false);
        C42416e eVar = new C42416e((C42414b) null);
        this.f114749E = eVar;
        this.f114769f.setAdapter(eVar);
        this.f114769f.setOnItemClickListener(new C42414b());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1 && intent.getBooleanExtra("key_modify_create_line_succ", false)) {
                this.f114775o.setText(C48527c.m53905a(intent.getLongExtra("key_credit_line", 0)));
                setResult(-1);
            }
        } else if (i == 2) {
            if (i2 == -1) {
                removeAllOptionMenu();
                setResult(-1);
                finish();
            }
        } else if (i == 3 && i2 == -1) {
            mo66500I7();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(2876);
        addSceneEndListener(2742);
        addSceneEndListener(2941);
        this.f114757M = getIntent().getStringExtra("key_card_no");
        this.f114760Q = getIntent().getIntExtra("key_scene", 0);
        this.f114762S = getIntent().getBooleanExtra("key_is_create", false);
        this.f114763T = getIntent().getStringExtra("key_card_type");
        initView();
        Log.m105919d(this.f114712d, "cardtype: %s", this.f114763T);
        setMMTitle((int) C0966R.string.fkm);
        if (this.f114760Q == 1) {
            C51121rk3 rk32 = new C51121rk3();
            try {
                rk32.parseFrom(getIntent().getByteArrayExtra("key_qry_response"));
                mo66502K7(rk32);
            } catch (IOException e) {
                Log.printErrStackTrace(this.f114712d, e, "", new Object[0]);
                mo66500I7();
            }
        } else {
            mo66500I7();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2876);
        removeSceneEndListener(2742);
        removeSceneEndListener(2941);
        C39736t0.C39737a aVar = this.f114764U;
        if (aVar != null) {
            C39736t0.f106613d.mo62367d(aVar);
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C47748l) {
            C47748l lVar = (C47748l) yVar;
            lVar.mo104823q1(new C42415c(lVar));
        } else if (yVar instanceof C47745i) {
            C47745i iVar = (C47745i) yVar;
            boolean z = iVar.f221039i;
            boolean z2 = false;
            if (iVar.f221040j) {
                this.f114777q.setCheck(iVar.f128262s != 1);
            }
            if (iVar.f221039i) {
                MMSwitchBtn mMSwitchBtn = this.f114777q;
                if (iVar.f128262s != 1) {
                    z2 = true;
                }
                mMSwitchBtn.setCheck(z2);
            }
        } else if (yVar instanceof C47746j) {
            C47746j jVar = (C47746j) yVar;
            if (!jVar.f221039i && !jVar.f221040j) {
                C49546gd3 gd32 = jVar.f128263r.f130874f;
                this.f114752H = gd32;
                if (gd32 != null) {
                    this.f114751G = mo66501J7(gd32.f133978g);
                }
                mo66503L7();
            }
            if (jVar.f221040j) {
                C49546gd3 gd33 = this.f114753I;
                this.f114752H = gd33;
                if (gd33 != null) {
                    this.f114751G = mo66501J7(gd33.f133978g);
                }
                mo66503L7();
            }
            if (jVar.f221039i) {
                C49546gd3 gd34 = this.f114753I;
                this.f114752H = gd34;
                if (gd34 != null) {
                    this.f114751G = mo66501J7(gd34.f133978g);
                }
                mo66503L7();
            }
        }
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C4598d.class);
    }
}
