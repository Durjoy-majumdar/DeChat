package com.tencent.p014mm.plugin.wallet.pwd.p122ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPaySaftyClickReportStruct;
import com.tencent.p014mm.p136ui.C44701a2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75100a0;
import com.tencent.p014mm.wallet_core.model.C75138s0;
import com.tencent.p014mm.wallet_core.model.C75140t0;
import com.tencent.p014mm.wallet_core.p137ui.C7090o;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import f40.C86709a0;
import fy3.C32226l;
import j53.C76390m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import kg3.C76577a;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import ob0.C117747y;
import p910lj.C76701a;
import pv2.C110259i;
import pv2.C110260j;
import qo3.C77407n;
import vt1.C78473a;

/* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI */
public class WalletDigitalCertUI extends WalletBaseUI {

    /* renamed from: d */
    public TextView f208775d;

    /* renamed from: e */
    public ScrollView f208776e;

    /* renamed from: f */
    public Button f208777f;

    /* renamed from: g */
    public Button f208778g;

    /* renamed from: h */
    public LinearLayout f208779h;

    /* renamed from: i */
    public TextView f208780i;

    /* renamed from: j */
    public ImageView f208781j;

    /* renamed from: n */
    public ImageView f208782n;

    /* renamed from: o */
    public TextView f208783o;

    /* renamed from: p */
    public TextView f208784p;

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$a */
    public class C71971a extends C7090o {
        public C71971a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(WalletDigitalCertUI.this, WalletIdCardCheckUI.class);
            WalletDigitalCertUI.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$b */
    public class C71972b extends C7090o {

        /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$b$a */
        public class C71973a implements C11182m0 {
            public C71973a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107140d(1, WalletDigitalCertUI.this.getContext().getResources().getColor(C0966R.color.f2966ao), WalletDigitalCertUI.this.getString(C0966R.string.f361588l20));
            }
        }

        /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$b$b */
        public class C71974b implements C11184p0 {
            public C71974b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C75140t0.m90124c().getClass();
                WalletDigitalCertUI.this.doSceneProgress(new C75100a0(C75140t0.m90123b()));
                C115669n.INSTANCE.mo160131h(13731, 10);
            }
        }

        public C71972b() {
        }

        public void onClick(View view) {
            C77407n nVar = new C77407n((Context) WalletDigitalCertUI.this.getContext(), 1, true);
            TextView textView = new TextView(WalletDigitalCertUI.this.getContext());
            textView.setGravity(17);
            textView.setHeight(C76577a.m92151b(WalletDigitalCertUI.this.getContext(), 56));
            textView.setTextSize(12.0f);
            textView.setTextColor(WalletDigitalCertUI.this.getResources().getColor(C0966R.color.FG_1));
            WalletDigitalCertUI walletDigitalCertUI = WalletDigitalCertUI.this;
            textView.setText(walletDigitalCertUI.getString(C0966R.string.l1y, new Object[]{walletDigitalCertUI.getString(C0966R.string.l1z)}));
            nVar.mo107569n(textView, false);
            nVar.f225784p1 = true;
            nVar.f225771i = new C71973a();
            nVar.f225782p = new C71974b();
            nVar.mo107573q();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$c */
    public class C71975c extends C44701a2 {
        public C71975c() {
        }

        /* renamed from: a */
        public void mo62772a(MenuItem menuItem) {
            WalletDigitalCertUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$d */
    public class C71976d implements Runnable {
        public C71976d() {
        }

        public void run() {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) WalletDigitalCertUI.this.f208781j.getLayoutParams();
            layoutParams.topMargin = WalletDigitalCertUI.this.f208783o.getLineHeight() / 2;
            WalletDigitalCertUI.this.f208781j.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$e */
    public class C71977e implements Runnable {
        public C71977e() {
        }

        public void run() {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) WalletDigitalCertUI.this.f208782n.getLayoutParams();
            layoutParams.topMargin = WalletDigitalCertUI.this.f208784p.getLineHeight() / 2;
            WalletDigitalCertUI.this.f208782n.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$f */
    public class C71978f extends C7090o {

        /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$f$a */
        public class C71979a implements C11182m0 {
            public C71979a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                e0Var.mo107140d(1, WalletDigitalCertUI.this.getContext().getResources().getColor(C0966R.color.f2966ao), WalletDigitalCertUI.this.getString(C0966R.string.f361588l20));
            }
        }

        /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$f$b */
        public class C71980b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C75138s0 f208794d;

            public C71980b(C75138s0 s0Var) {
                this.f208794d = s0Var;
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                Log.m105925i("MicroMsg.WalletDigitalCertUI", "del crt %s", this.f208794d.f221082c);
                WalletDigitalCertUI.this.doSceneProgress(new C75100a0(this.f208794d.f221082c));
                WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new WCPaySaftyClickReportStruct();
                wCPaySaftyClickReportStruct.f194681d = 2;
                wCPaySaftyClickReportStruct.f194682e = 1;
                wCPaySaftyClickReportStruct.mo86054n();
            }
        }

        public C71978f() {
        }

        public void onClick(View view) {
            if (view.getTag() instanceof C75138s0) {
                C75138s0 s0Var = (C75138s0) view.getTag();
                C77407n nVar = new C77407n((Context) WalletDigitalCertUI.this.getContext(), 1, true);
                TextView textView = new TextView(WalletDigitalCertUI.this.getContext());
                textView.setGravity(17);
                textView.setHeight(C76577a.m92151b(WalletDigitalCertUI.this.getContext(), 56));
                textView.setTextSize(12.0f);
                textView.setTextColor(WalletDigitalCertUI.this.getResources().getColor(C0966R.color.FG_1));
                textView.setText(WalletDigitalCertUI.this.getString(C0966R.string.l1y, new Object[]{s0Var.f221080a}));
                nVar.mo107569n(textView, false);
                nVar.f225784p1 = true;
                nVar.f225771i = new C71979a();
                nVar.f225782p = new C71980b(s0Var);
                nVar.mo107573q();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$g */
    public static class C71981g extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI$g$a */
        public class C71982a implements C32226l<View, String> {
            public C71982a(C71981g gVar) {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                TextView textView = (TextView) view.findViewById(C0966R.C0970id.f357643az2);
                TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.ayt);
                StringBuilder sb = new StringBuilder();
                if (textView != null) {
                    sb.append(textView.getText());
                }
                if (textView2 != null) {
                    sb.append("," + textView2.getText());
                }
                return sb.toString();
            }
        }

        public C71981g(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0971layout.cem);
            root.disable(C0966R.C0970id.j3y);
            root.disable(C0966R.C0970id.az4);
            root.disable(C0966R.C0970id.ayy);
            root.disable(C0966R.C0970id.ayz);
            root.disable(C0966R.C0970id.f357641az0);
            root.disable(C0966R.C0970id.f357642az1);
            root.disable(C0966R.C0970id.f89);
            MMBaseAccessibilityConfig.ConfigHelper root2 = root(C0966R.C0971layout.ce9);
            root2.disable(C0966R.C0970id.lg8);
            root2.disable(C0966R.C0970id.f357643az2);
            root2.disable(C0966R.C0970id.ayt);
            root2.disable(C0966R.C0970id.agz);
            root2.view(C0966R.C0970id.f357644az3).type(ViewType.TextView).desc((C32226l<? super View, String>) new C71982a(this));
            root2.view(C0966R.C0970id.c0e).type(ViewType.Button);
        }

        public void onResume() {
            super.onResume();
        }
    }

    /* renamed from: H7 */
    public final void mo99193H7() {
        Log.m105924i("MicroMsg.WalletDigitalCertUI", "updateCrtState");
        this.f208779h.removeAllViews();
        Vector<C75138s0> vector = C75140t0.m90124c().f221095g;
        C75140t0 c = C75140t0.m90124c();
        c.getClass();
        if (!Util.isNullOrNil(C75140t0.m90123b()) && c.f221089a > 0) {
            this.f208777f.setVisibility(8);
            this.f208778g.setVisibility(0);
            this.f208775d.setText(C0966R.string.l2i);
            if (vector.size() == 0 || vector.size() == 1) {
                this.f208776e.setFillViewport(true);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f208778g.getLayoutParams();
                layoutParams.removeRule(3);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = C76577a.m92151b(getContext(), 96);
                this.f208778g.setLayoutParams(layoutParams);
            } else {
                this.f208776e.setFillViewport(false);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f208778g.getLayoutParams();
                layoutParams2.removeRule(12);
                layoutParams2.addRule(3, C0966R.C0970id.f357641az0);
                layoutParams2.topMargin = C76577a.m92151b(getContext(), 48);
                layoutParams2.bottomMargin = C76577a.m92151b(getContext(), 64);
                this.f208778g.setLayoutParams(layoutParams2);
            }
        } else {
            this.f208777f.setVisibility(0);
            this.f208778g.setVisibility(8);
            this.f208775d.setText(C0966R.string.f361590l22);
            if (vector.size() == 0) {
                this.f208776e.setFillViewport(true);
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f208777f.getLayoutParams();
                layoutParams3.removeRule(3);
                layoutParams3.addRule(12);
                layoutParams3.bottomMargin = C76577a.m92151b(getContext(), 96);
                this.f208777f.setLayoutParams(layoutParams3);
            } else {
                this.f208776e.setFillViewport(false);
                RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) this.f208777f.getLayoutParams();
                layoutParams4.removeRule(12);
                layoutParams4.addRule(3, C0966R.C0970id.f357641az0);
                layoutParams4.topMargin = C76577a.m92151b(getContext(), 48);
                layoutParams4.bottomMargin = C76577a.m92151b(getContext(), 64);
                this.f208777f.setLayoutParams(layoutParams4);
            }
        }
        if (vector.size() == 0) {
            this.f208779h.setVisibility(8);
            this.f208780i.setVisibility(8);
            return;
        }
        this.f208779h.setVisibility(0);
        this.f208780i.setVisibility(0);
        Iterator<C75138s0> it = vector.iterator();
        while (it.hasNext()) {
            C75138s0 next = it.next();
            if (next.f221083d <= 0) {
                View inflate = View.inflate(this, C0966R.C0971layout.ce9, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.c0e);
                ((TextView) inflate.findViewById(C0966R.C0970id.f357643az2)).setText(next.f221080a);
                ((TextView) inflate.findViewById(C0966R.C0970id.ayt)).setText(next.f221081b);
                textView.setTag(next);
                textView.setOnClickListener(new C71978f());
                this.f208779h.addView(inflate);
            }
        }
        if (this.f208779h.getChildCount() == 0) {
            this.f208780i.setVisibility(8);
        } else {
            this.f208780i.setVisibility(0);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cem;
    }

    public void initView() {
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.f2932f));
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.ays);
        TextView textView = (TextView) findViewById(C0966R.C0970id.ayu);
        this.f208775d = textView;
        C85875k4.m106189j0(textView.getPaint(), 0.8f);
        this.f208777f = (Button) findViewById(C0966R.C0970id.f86);
        this.f208778g = (Button) findViewById(C0966R.C0970id.c0b);
        this.f208779h = (LinearLayout) findViewById(C0966R.C0970id.f89);
        this.f208780i = (TextView) findViewById(C0966R.C0970id.f8_);
        this.f208777f.setOnClickListener(new C71971a());
        this.f208778g.setOnClickListener(new C71972b());
        this.f208776e = (ScrollView) findViewById(C0966R.C0970id.az5);
        setBackBtn(new C71975c());
        mo99193H7();
        this.f208781j = (ImageView) findViewById(C0966R.C0970id.ayz);
        this.f208782n = (ImageView) findViewById(C0966R.C0970id.f357642az1);
        this.f208783o = (TextView) findViewById(C0966R.C0970id.ayw);
        this.f208784p = (TextView) findViewById(C0966R.C0970id.ayx);
        this.f208783o.post(new C71976d());
        this.f208784p.post(new C71977e());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (1 == i && i2 == -1) {
            boolean J3 = ((C78473a) C86709a0.m107533q(C78473a.class)).mo107880J3();
            C110260j a = C110259i.m149874a();
            String str = a.f329808a;
            String str2 = a.f329809b;
            Log.m105925i("MicroMsg.WalletDigitalCertUI", "alvinluo getSecurityInfo isOpenTouchPay: %b", Boolean.valueOf(J3));
            doSceneProgress(new C76390m(false, J3, str, str2), false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1654);
        addSceneEndListener(1568);
        addSceneEndListener(1669);
        initView();
        C115669n.INSTANCE.mo160131h(13731, 1);
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1654);
        removeSceneEndListener(1568);
        removeSceneEndListener(1669);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C76390m) {
            mo99193H7();
        } else if (yVar instanceof C75100a0) {
            if (i2 == 0) {
                WCPaySaftyClickReportStruct wCPaySaftyClickReportStruct = new WCPaySaftyClickReportStruct();
                wCPaySaftyClickReportStruct.f194681d = 2;
                wCPaySaftyClickReportStruct.f194682e = 2;
                wCPaySaftyClickReportStruct.mo86054n();
                C115669n.INSTANCE.mo160131h(13731, 11);
                C75140t0.m90124c().mo104862a(((C75100a0) yVar).f221010d);
                Toast makeText = C76701a.makeText((Context) getContext(), (CharSequence) "", 0);
                View inflate = View.inflate(getContext(), C0966R.C0971layout.f6796os, (ViewGroup) null);
                ((WeImageView) inflate.findViewById(C0966R.C0970id.kpx)).setImageResource(C0966R.raw.icons_filled_done);
                ((TextView) inflate.findViewById(C0966R.C0970id.kpy)).setText(getString(C0966R.string.f361589l21));
                makeText.setGravity(17, 0, 0);
                makeText.setView(inflate);
                makeText.show();
            } else {
                C115669n.INSTANCE.mo160131h(13731, 12);
            }
            mo99193H7();
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C71981g.class);
    }
}
