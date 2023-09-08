package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39629l0;
import androidx.lifecycle.C54209k0;
import androidx.lifecycle.C54219z;
import b63.C67193m;
import b63.C67209v;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.picker.C19877i;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.p136ui.widget.picker.CustomDatePickerNew;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.RealNameBundle;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSelectProfessionUI;
import com.tencent.p014mm.plugin.wallet_core.utils.C5810l;
import com.tencent.p014mm.pluginsdk.p133ui.wallet.WalletIconImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tencent.xweb.util.WXWebReporter;
import com.tenpay.android.wechat.TenpaySecureEncrypt;
import gr3.C76024a;
import hr3.C76241b;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import qo3.C101218e0;
import s24.C77613a;
import te3.C77919e72;
import te3.C77922en3;
import te3.da4;
import yq3.C79148e;
import z53.C79309g;
import z53.C79312k;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI */
public class WcPayRealnameVerifyIdInputUI extends WalletBaseUI {

    /* renamed from: X */
    public static final /* synthetic */ int f209158X = 0;

    /* renamed from: A */
    public C72131r f209159A;

    /* renamed from: B */
    public Profession[] f209160B;

    /* renamed from: C */
    public String f209161C;

    /* renamed from: D */
    public String f209162D;

    /* renamed from: E */
    public String[] f209163E;

    /* renamed from: F */
    public List<C77922en3> f209164F = new ArrayList();

    /* renamed from: G */
    public da4 f209165G;

    /* renamed from: H */
    public String[] f209166H = new String[100];

    /* renamed from: I */
    public int f209167I;

    /* renamed from: J */
    public int f209168J;

    /* renamed from: K */
    public int f209169K;

    /* renamed from: L */
    public int f209170L;

    /* renamed from: M */
    public int f209171M;

    /* renamed from: N */
    public int f209172N;

    /* renamed from: P */
    public int f209173P;

    /* renamed from: Q */
    public int f209174Q;

    /* renamed from: R */
    public int f209175R;

    /* renamed from: S */
    public String f209176S;

    /* renamed from: T */
    public TenpaySecureEncrypt f209177T;

    /* renamed from: U */
    public int f209178U;

    /* renamed from: V */
    public int f209179V;

    /* renamed from: W */
    public final IListener<WalletRealNameResultNotifyEvent> f209180W;

    /* renamed from: d */
    public WalletFormView f209181d;

    /* renamed from: e */
    public WalletFormView f209182e;

    /* renamed from: f */
    public WalletFormView f209183f;

    /* renamed from: g */
    public WalletFormView f209184g;

    /* renamed from: h */
    public WalletFormView f209185h;

    /* renamed from: i */
    public WalletFormView f209186i;

    /* renamed from: j */
    public WalletFormView f209187j;

    /* renamed from: n */
    public WalletFormView f209188n;

    /* renamed from: o */
    public WalletFormView f209189o;

    /* renamed from: p */
    public WalletFormView f209190p;

    /* renamed from: q */
    public WalletFormView f209191q;

    /* renamed from: r */
    public WalletFormView f209192r;

    /* renamed from: s */
    public Button f209193s;

    /* renamed from: t */
    public C7045j f209194t;

    /* renamed from: u */
    public TextView f209195u;

    /* renamed from: v */
    public TextView f209196v;

    /* renamed from: w */
    public C19877i f209197w;

    /* renamed from: x */
    public String f209198x;

    /* renamed from: y */
    public String f209199y;

    /* renamed from: z */
    public boolean f209200z;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$a */
    public class C72107a implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$a$a */
        public class C72108a implements C7045j.C7056k {

            /* renamed from: a */
            public final /* synthetic */ C7045j f209203a;

            public C72108a(C7045j jVar) {
                this.f209203a = jVar;
            }

            public void onResult(boolean z, Object obj, Object obj2) {
                if (z) {
                    WcPayRealnameVerifyIdInputUI.this.f209159A.f209245u.setValue(Integer.valueOf(this.f209203a.mo8099b()));
                }
                this.f209203a.mo8101d();
            }
        }

        public C72107a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C7045j jVar = new C7045j((Context) WcPayRealnameVerifyIdInputUI.this.getContext(), WcPayRealnameVerifyIdInputUI.this.f209166H);
            jVar.f24869t = new C72108a(jVar);
            if (WcPayRealnameVerifyIdInputUI.this.f209159A.f209245u.getValue() != null) {
                jVar.mo8106i(WcPayRealnameVerifyIdInputUI.this.f209159A.f209245u.getValue().intValue());
            }
            jVar.mo8109l();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$b */
    public class C72109b implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$b$a */
        public class C72110a implements C19877i.C19878a {

            /* renamed from: a */
            public final /* synthetic */ C19877i f209206a;

            public C72110a(C19877i iVar) {
                this.f209206a = iVar;
            }

            public void onResult(boolean z, int i, int i2, int i3) {
                if (z) {
                    String format = String.format("%04d/%02d/%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
                    WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = WcPayRealnameVerifyIdInputUI.this;
                    wcPayRealnameVerifyIdInputUI.f209173P = i;
                    wcPayRealnameVerifyIdInputUI.f209174Q = i2;
                    wcPayRealnameVerifyIdInputUI.f209175R = i3;
                    wcPayRealnameVerifyIdInputUI.f209159A.f209246v.setValue(format);
                }
                this.f209206a.mo26532b();
            }
        }

        public C72109b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C19877i iVar = new C19877i(WcPayRealnameVerifyIdInputUI.this.getContext());
            Calendar instance = Calendar.getInstance();
            int i = instance.get(1);
            int i2 = instance.get(2) + 1;
            int i3 = instance.get(5);
            iVar.mo26533c(i, i2, i3);
            int i4 = i - 200;
            if (i4 < 1) {
                i4 = 1;
            }
            iVar.mo26535e(i4, 1, 1);
            iVar.mo26534d(i, i2, i3);
            iVar.f56638o = new C72110a(iVar);
            String value = WcPayRealnameVerifyIdInputUI.this.f209159A.f209246v.getValue();
            if (!Util.isNullOrNil(value) && value.length() >= 10) {
                int i5 = Util.getInt(value.substring(0, 4), 0);
                int i6 = Util.getInt(value.substring(5, 7), 0);
                int i7 = Util.getInt(value.substring(9, 10), 0);
                if (i5 > 0 && i6 > 0 && i7 > 0) {
                    iVar.mo26533c(i5, i6, i7);
                }
            }
            iVar.mo26536f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$c */
    public class C72111c implements View.OnClickListener {
        public C72111c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameVerifyIdInputUI.m84524H7(WcPayRealnameVerifyIdInputUI.this);
            Intent intent = new Intent();
            intent.setClassName(WcPayRealnameVerifyIdInputUI.this.getContext(), "com.tencent.mm.ui.tools.CountryCodeUI");
            String[] strArr = WcPayRealnameVerifyIdInputUI.this.f209163E;
            if (strArr != null) {
                intent.putExtra("exclude_countries_iso", strArr);
            }
            intent.putExtra("CountryCodeUI_isShowCountryCode", false);
            intent.putExtra("ui_title", WcPayRealnameVerifyIdInputUI.this.getString(C0966R.string.l8x));
            WcPayRealnameVerifyIdInputUI.this.startActivityForResult(intent, 3);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$d */
    public class C72112d implements View.OnClickListener {
        public C72112d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameVerifyIdInputUI.m84524H7(WcPayRealnameVerifyIdInputUI.this);
            Intent intent = new Intent();
            intent.setClassName(WcPayRealnameVerifyIdInputUI.this.getContext(), "com.tencent.mm.ui.tools.CountryCodeUI");
            String[] strArr = WcPayRealnameVerifyIdInputUI.this.f209163E;
            if (strArr != null) {
                intent.putExtra("exclude_countries_iso", strArr);
            }
            intent.putExtra("CountryCodeUI_isShowCountryCode", false);
            intent.putExtra("ui_title", WcPayRealnameVerifyIdInputUI.this.getString(C0966R.string.l8x));
            WcPayRealnameVerifyIdInputUI.this.startActivityForResult(intent, 3);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$e */
    public class C72113e implements View.OnClickListener {
        public C72113e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameVerifyIdInputUI.m84524H7(WcPayRealnameVerifyIdInputUI.this);
            WcPayRealnameVerifyIdInputUI.this.hideTenpayKB();
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = WcPayRealnameVerifyIdInputUI.this;
            wcPayRealnameVerifyIdInputUI.getClass();
            Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "go to select profession ui");
            Intent intent = new Intent(wcPayRealnameVerifyIdInputUI.getContext(), WalletSelectProfessionUI.class);
            intent.putExtra("key_profession_list", wcPayRealnameVerifyIdInputUI.f209160B);
            wcPayRealnameVerifyIdInputUI.startActivityForResult(intent, 2);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$f */
    public class C72114f implements View.OnClickListener {
        public C72114f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameVerifyIdInputUI.m84524H7(WcPayRealnameVerifyIdInputUI.this);
            WcPayRealnameVerifyIdInputUI.this.hideTenpayKB();
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = WcPayRealnameVerifyIdInputUI.this;
            if (!wcPayRealnameVerifyIdInputUI.f209200z) {
                wcPayRealnameVerifyIdInputUI.getClass();
                Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "go to select address ui");
                Intent intent = new Intent();
                intent.putExtra("GetAddress", true);
                intent.putExtra("ShowSelectedLocation", false);
                intent.putExtra("IsRealNameVerifyScene", true);
                intent.putExtra("IsNeedShowSearchBar", true);
                C88144b.m109802t(wcPayRealnameVerifyIdInputUI.getContext(), ".ui.tools.MultiStageCitySelectUI", intent, 1);
            } else {
                wcPayRealnameVerifyIdInputUI.getClass();
                Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "go to detail address ui");
                Intent intent2 = new Intent(wcPayRealnameVerifyIdInputUI.getContext(), WcPayRealnameInputAddressUI.class);
                intent2.putExtra("key_countrycode", wcPayRealnameVerifyIdInputUI.f209159A.f209236i.getValue());
                intent2.putExtra("key_provincecode", wcPayRealnameVerifyIdInputUI.f209159A.f209237j.getValue());
                intent2.putExtra("key_citycode", wcPayRealnameVerifyIdInputUI.f209159A.f209238n.getValue());
                intent2.putExtra("key_zone", wcPayRealnameVerifyIdInputUI.f209159A.f209239o.getValue());
                intent2.putExtra("key_address", wcPayRealnameVerifyIdInputUI.f209159A.f209240p.getValue());
                intent2.putExtra("key_exclude_country", wcPayRealnameVerifyIdInputUI.f209163E);
                wcPayRealnameVerifyIdInputUI.startActivityForResult(intent2, 4);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$g */
    public class C72115g implements View.OnClickListener {
        public C72115g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameVerifyIdInputUI.m84524H7(WcPayRealnameVerifyIdInputUI.this);
            WcPayRealnameVerifyIdInputUI.this.hideTenpayKB();
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = WcPayRealnameVerifyIdInputUI.this;
            wcPayRealnameVerifyIdInputUI.getClass();
            Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "do verify real name");
            String string = wcPayRealnameVerifyIdInputUI.getInput().getString("key_realname_sessionid");
            String str = wcPayRealnameVerifyIdInputUI.getString(C0966R.string.f361346j32).equals(wcPayRealnameVerifyIdInputUI.f209159A.f209232e.getValue()) ? "1" : "2";
            Log.m105919d("MicroMsg.WcPayRealnameVerifyIdInputUI", "%s, %s, %s", Integer.valueOf(wcPayRealnameVerifyIdInputUI.f209170L), Integer.valueOf(wcPayRealnameVerifyIdInputUI.f209171M), Integer.valueOf(wcPayRealnameVerifyIdInputUI.f209172N));
            String desedeEncode = wcPayRealnameVerifyIdInputUI.f209187j.isShown() ? wcPayRealnameVerifyIdInputUI.f209177T.desedeEncode(String.format("%04d%02d%02d", new Object[]{Integer.valueOf(wcPayRealnameVerifyIdInputUI.f209170L), Integer.valueOf(wcPayRealnameVerifyIdInputUI.f209171M), Integer.valueOf(wcPayRealnameVerifyIdInputUI.f209172N)}), C75228t.m90271t()) : "";
            Log.m105919d("MicroMsg.WcPayRealnameVerifyIdInputUI", "enc: %s", desedeEncode);
            wcPayRealnameVerifyIdInputUI.doSceneProgress(new C79309g(wcPayRealnameVerifyIdInputUI.f209159A.f209231d.getValue(), wcPayRealnameVerifyIdInputUI.f209159A.f209234g.getValue(), wcPayRealnameVerifyIdInputUI.f209178U, wcPayRealnameVerifyIdInputUI.f209159A.f209233f.getValue().f227260d.f184008d, wcPayRealnameVerifyIdInputUI.f209159A.f209241q.getValue(), wcPayRealnameVerifyIdInputUI.f209159A.f209236i.getValue(), wcPayRealnameVerifyIdInputUI.f209159A.f209237j.getValue(), wcPayRealnameVerifyIdInputUI.f209159A.f209238n.getValue(), desedeEncode, (long) wcPayRealnameVerifyIdInputUI.f209159A.f209245u.getValue().intValue(), wcPayRealnameVerifyIdInputUI.f209190p.isShown() ? wcPayRealnameVerifyIdInputUI.f209177T.desedeEncode(String.format("%04d%02d%02d", new Object[]{Integer.valueOf(wcPayRealnameVerifyIdInputUI.f209173P), Integer.valueOf(wcPayRealnameVerifyIdInputUI.f209174Q), Integer.valueOf(wcPayRealnameVerifyIdInputUI.f209175R)}), C75228t.m90271t()) : "", wcPayRealnameVerifyIdInputUI.f209159A.f209247w.getValue(), string, wcPayRealnameVerifyIdInputUI.f209159A.f209243s.getValue(), wcPayRealnameVerifyIdInputUI.f209159A.f209240p.getValue(), str, wcPayRealnameVerifyIdInputUI.getInput().getBoolean("key_marketing_switch_closed", false), wcPayRealnameVerifyIdInputUI.f209159A.f209244t.getValue(), wcPayRealnameVerifyIdInputUI.f209179V), true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$h */
    public class C72116h implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$h$a */
        public class C72117a implements C101218e0.C12907m {

            /* renamed from: a */
            public final /* synthetic */ C101218e0 f209214a;

            public C72117a(C101218e0 e0Var) {
                this.f209214a = e0Var;
            }

            /* renamed from: a */
            public void mo2001a() {
                C75228t.m90219L(WcPayRealnameVerifyIdInputUI.this.getContext(), WcPayRealnameVerifyIdInputUI.this.f209165G.f227151h, true);
                this.f209214a.mo140680z();
            }
        }

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$h$b */
        public class C72118b implements C101218e0.C12907m {

            /* renamed from: a */
            public final /* synthetic */ C101218e0 f209216a;

            public C72118b(C72116h hVar, C101218e0 e0Var) {
                this.f209216a = e0Var;
            }

            /* renamed from: a */
            public void mo2001a() {
                this.f209216a.mo140680z();
            }
        }

        public C72116h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.WcPayRealnameVerifyIdInputUI", "on click listener");
            C101218e0 e0Var = new C101218e0(WcPayRealnameVerifyIdInputUI.this.getContext(), 1, 2);
            e0Var.mo140671q(WcPayRealnameVerifyIdInputUI.this.f209165G.f227148e);
            da4 da4 = WcPayRealnameVerifyIdInputUI.this.f209165G;
            e0Var.mo140667n(da4.f227150g, da4.f227152i);
            C72117a aVar = new C72117a(e0Var);
            C72118b bVar = new C72118b(this, e0Var);
            e0Var.f296373D = aVar;
            e0Var.f296374E = bVar;
            View inflate = LayoutInflater.from(WcPayRealnameVerifyIdInputUI.this.getContext()).inflate(C0966R.C0971layout.chk, (ViewGroup) null);
            ((TextView) inflate.findViewById(C0966R.C0970id.ltv)).setText(WcPayRealnameVerifyIdInputUI.this.f209165G.f227149f);
            e0Var.mo140663j(inflate);
            e0Var.mo140655A();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$i */
    public class C72119i implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C79309g f209217d;

        public C72119i(C79309g gVar) {
            this.f209217d = gVar;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "NetSceneRealNameVerify dialog lOk");
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = WcPayRealnameVerifyIdInputUI.this;
            C79309g gVar = this.f209217d;
            int i2 = WcPayRealnameVerifyIdInputUI.f209158X;
            wcPayRealnameVerifyIdInputUI.mo99327I7(gVar);
            C67209v.m79539a(1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$j */
    public class C72120j implements DialogInterface.OnClickListener {
        public C72120j(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "NetSceneRealNameVerify dialog lCancel");
            C67209v.m79539a(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$k */
    public class C72121k implements TextWatcher {
        public C72121k() {
        }

        public void afterTextChanged(Editable editable) {
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = WcPayRealnameVerifyIdInputUI.this;
            C72131r rVar = wcPayRealnameVerifyIdInputUI.f209159A;
            rVar.f209231d.setValue(wcPayRealnameVerifyIdInputUI.f209181d.getText());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$l */
    public class C72122l implements View.OnClickListener {
        public C72122l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105918d("MicroMsg.WcPayRealnameVerifyIdInputUI", "click cre type");
            WcPayRealnameVerifyIdInputUI.this.f209159A.f209235h.setValue(Boolean.TRUE);
            WcPayRealnameVerifyIdInputUI.m84524H7(WcPayRealnameVerifyIdInputUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$m */
    public class C72123m implements TextWatcher {
        public C72123m() {
        }

        public void afterTextChanged(Editable editable) {
            WcPayRealnameVerifyIdInputUI.this.f209161C = editable.toString();
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = WcPayRealnameVerifyIdInputUI.this;
            wcPayRealnameVerifyIdInputUI.f209162D = wcPayRealnameVerifyIdInputUI.f209183f.getText();
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI2 = WcPayRealnameVerifyIdInputUI.this;
            C72131r rVar = wcPayRealnameVerifyIdInputUI2.f209159A;
            rVar.f209234g.setValue(wcPayRealnameVerifyIdInputUI2.f209162D);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$n */
    public class C72124n implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$n$a */
        public class C72125a implements C7045j.C7056k {

            /* renamed from: a */
            public final /* synthetic */ C7045j f209223a;

            public C72125a(C7045j jVar) {
                this.f209223a = jVar;
            }

            public void onResult(boolean z, Object obj, Object obj2) {
                if (z) {
                    WcPayRealnameVerifyIdInputUI.this.f209159A.f209232e.setValue((String) obj);
                }
                this.f209223a.mo8101d();
            }
        }

        public C72124n() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameVerifyIdInputUI.m84524H7(WcPayRealnameVerifyIdInputUI.this);
            C7045j jVar = new C7045j((Context) WcPayRealnameVerifyIdInputUI.this.getContext(), WcPayRealnameVerifyIdInputUI.this.getResources().getStringArray(C0966R.array.f2612b0));
            jVar.f24869t = new C72125a(jVar);
            jVar.mo8109l();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$o */
    public class C72126o implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$o$a */
        public class C72127a implements C19877i.C19878a {

            /* renamed from: a */
            public final /* synthetic */ C19877i f209226a;

            public C72127a(C19877i iVar) {
                this.f209226a = iVar;
            }

            public void onResult(boolean z, int i, int i2, int i3) {
                if (z) {
                    Log.m105919d("MicroMsg.WcPayRealnameVerifyIdInputUI", "year: %s, month: %s, day: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                    String format = String.format("%04d/%02d/%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
                    WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = WcPayRealnameVerifyIdInputUI.this;
                    wcPayRealnameVerifyIdInputUI.f209167I = i;
                    wcPayRealnameVerifyIdInputUI.f209168J = i2;
                    wcPayRealnameVerifyIdInputUI.f209169K = i3;
                    wcPayRealnameVerifyIdInputUI.f209159A.f209243s.setValue(format);
                }
                this.f209226a.mo26532b();
            }
        }

        public C72126o() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameVerifyIdInputUI.m84524H7(WcPayRealnameVerifyIdInputUI.this);
            C19877i iVar = new C19877i(WcPayRealnameVerifyIdInputUI.this.getContext());
            Calendar instance = Calendar.getInstance();
            int i = instance.get(1);
            int i2 = instance.get(2) + 1;
            int i3 = instance.get(5);
            iVar.mo26534d(i, i2, i3);
            iVar.mo26535e(WXWebReporter.WXWEB_IDKEY_FR_AUDIO_ID, 1, 1);
            iVar.f56638o = new C72127a(iVar);
            String value = WcPayRealnameVerifyIdInputUI.this.f209159A.f209243s.getValue();
            if (Util.isNullOrNil(value) || value.length() < 10) {
                iVar.mo26533c(i, i2, i3);
            } else {
                int i4 = Util.getInt(value.substring(0, 4), 0);
                int i5 = Util.getInt(value.substring(5, 7), 0);
                int i6 = Util.getInt(value.substring(9, 10), 0);
                if (i4 > 0 && i5 > 0 && i6 > 0) {
                    iVar.mo26533c(i4, i5, i6);
                }
            }
            iVar.mo26536f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$p */
    public class C72128p implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$p$a */
        public class C72129a implements C19877i.C19878a {
            public C72129a() {
            }

            public void onResult(boolean z, int i, int i2, int i3) {
                if (z) {
                    Log.m105919d("MicroMsg.WcPayRealnameVerifyIdInputUI", "year: %s, month: %s, day: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
                    if (i == 1) {
                        String format = String.format("%04d/%02d/%02d", new Object[]{9999, 12, 31});
                        WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = WcPayRealnameVerifyIdInputUI.this;
                        wcPayRealnameVerifyIdInputUI.f209170L = 9999;
                        wcPayRealnameVerifyIdInputUI.f209171M = 12;
                        wcPayRealnameVerifyIdInputUI.f209172N = 31;
                        wcPayRealnameVerifyIdInputUI.f209159A.f209244t.setValue(format);
                    } else {
                        String format2 = String.format("%04d/%02d/%02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
                        WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI2 = WcPayRealnameVerifyIdInputUI.this;
                        wcPayRealnameVerifyIdInputUI2.f209170L = i;
                        wcPayRealnameVerifyIdInputUI2.f209171M = i2;
                        wcPayRealnameVerifyIdInputUI2.f209172N = i3;
                        wcPayRealnameVerifyIdInputUI2.f209159A.f209244t.setValue(format2);
                    }
                }
                WcPayRealnameVerifyIdInputUI.this.f209197w.mo26532b();
            }
        }

        public C72128p() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameVerifyIdInputUI.m84524H7(WcPayRealnameVerifyIdInputUI.this);
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = WcPayRealnameVerifyIdInputUI.this;
            wcPayRealnameVerifyIdInputUI.f209197w = new C19877i(wcPayRealnameVerifyIdInputUI.getContext());
            Calendar instance = Calendar.getInstance();
            int i = instance.get(1);
            int i2 = instance.get(2) + 1;
            int i3 = instance.get(5);
            WcPayRealnameVerifyIdInputUI.this.f209197w.mo26533c(i, i2, i3);
            WcPayRealnameVerifyIdInputUI.this.f209197w.mo26535e(i, i2, i3);
            WcPayRealnameVerifyIdInputUI.this.f209197w.mo26534d(i + 200, 12, 31);
            CustomDatePickerNew customDatePickerNew = WcPayRealnameVerifyIdInputUI.this.f209197w.f56637n;
            if (customDatePickerNew != null) {
                customDatePickerNew.setLongTermYear(true);
            }
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI2 = WcPayRealnameVerifyIdInputUI.this;
            wcPayRealnameVerifyIdInputUI2.f209197w.f56638o = new C72129a();
            String value = wcPayRealnameVerifyIdInputUI2.f209159A.f209244t.getValue();
            if (!Util.isNullOrNil(value) && value.length() >= 8) {
                int i4 = Util.getInt(value.substring(0, 4), 0);
                int i5 = Util.getInt(value.substring(5, 7), 0);
                int i6 = Util.getInt(value.substring(8, 10), 0);
                if (i4 > 0 && i5 > 0 && i6 > 0) {
                    if (i4 == 9999) {
                        WcPayRealnameVerifyIdInputUI.this.f209197w.mo26533c(1, 1, 1);
                    } else {
                        WcPayRealnameVerifyIdInputUI.this.f209197w.mo26533c(i4, i5, i6);
                    }
                }
            }
            WcPayRealnameVerifyIdInputUI.this.f209197w.mo26536f();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$q */
    public class C72130q implements TextWatcher {
        public C72130q() {
        }

        public void afterTextChanged(Editable editable) {
            WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = WcPayRealnameVerifyIdInputUI.this;
            C72131r rVar = wcPayRealnameVerifyIdInputUI.f209159A;
            rVar.f209249y.setValue(wcPayRealnameVerifyIdInputUI.f209191q.getText());
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$r */
    public static class C72131r extends C39622i0 {

        /* renamed from: d */
        public C54219z<String> f209231d = new C54219z<>();

        /* renamed from: e */
        public C54219z<String> f209232e = new C54219z<>();

        /* renamed from: f */
        public C54219z<C77922en3> f209233f = new C54219z<>();

        /* renamed from: g */
        public C54219z<String> f209234g = new C54219z<>();

        /* renamed from: h */
        public C54219z<Boolean> f209235h = new C54219z<>();

        /* renamed from: i */
        public C54219z<String> f209236i = new C54219z<>();

        /* renamed from: j */
        public C54219z<String> f209237j = new C54219z<>();

        /* renamed from: n */
        public C54219z<String> f209238n = new C54219z<>();

        /* renamed from: o */
        public C54219z<String> f209239o = new C54219z<>();

        /* renamed from: p */
        public C54219z<String> f209240p = new C54219z<>();

        /* renamed from: q */
        public C54219z<Profession> f209241q = new C54219z<>();

        /* renamed from: r */
        public C54219z<Boolean> f209242r = new C54219z<>();

        /* renamed from: s */
        public C54219z<String> f209243s = new C54219z<>();

        /* renamed from: t */
        public C54219z<String> f209244t = new C54219z<>();

        /* renamed from: u */
        public C54219z<Integer> f209245u = new C54219z<>();

        /* renamed from: v */
        public C54219z<String> f209246v = new C54219z<>();

        /* renamed from: w */
        public C54219z<String> f209247w = new C54219z<>();

        /* renamed from: x */
        public C54219z<String> f209248x = new C54219z<>();

        /* renamed from: y */
        public C54219z<String> f209249y = new C54219z<>();

        /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI$r$a */
        public class C72132a implements C0120a0<Object> {
            public C72132a() {
            }

            public void onChanged(Object obj) {
                C77922en3 value;
                C72131r rVar = C72131r.this;
                boolean z = false;
                if (!Util.isNullOrNil(rVar.f209231d.getValue()) && !Util.isNullOrNil(rVar.f209234g.getValue()) && (value = rVar.f209233f.getValue()) != null && ((!value.f227266j || !Util.isNullOrNil(rVar.f209247w.getValue())) && ((!value.f227262f || !Util.isNullOrNil(rVar.f209236i.getValue()) || !Util.isNullOrNil(rVar.f209237j.getValue()) || !Util.isNullOrNil(rVar.f209238n.getValue()) || !Util.isNullOrNil(rVar.f209240p.getValue())) && ((!value.f227261e || rVar.f209241q.getValue() != null) && ((!value.f227264h || rVar.f209245u.getValue() != null) && ((!value.f227263g || !Util.isNullOrNil(rVar.f209244t.getValue())) && ((!value.f227267n || !Util.isNullOrNil(rVar.f209243s.getValue())) && ((!value.f227265i || !Util.isNullOrNil(rVar.f209246v.getValue())) && (!value.f227268o || !Util.isNullOrNil(rVar.f209249y.getValue())))))))))) {
                    z = true;
                }
                if (z) {
                    C72131r.this.f209242r.setValue(Boolean.TRUE);
                } else {
                    C72131r.this.f209242r.setValue(Boolean.FALSE);
                }
            }
        }

        public C72131r() {
            this.f209245u.setValue(0);
            C72132a aVar = new C72132a();
            this.f209231d.observeForever(aVar);
            this.f209234g.observeForever(aVar);
            this.f209241q.observeForever(aVar);
            this.f209236i.observeForever(aVar);
            this.f209237j.observeForever(aVar);
            this.f209238n.observeForever(aVar);
            this.f209243s.observeForever(aVar);
            this.f209244t.observeForever(aVar);
            this.f209245u.observeForever(aVar);
            this.f209247w.observeForever(aVar);
            this.f209248x.observeForever(aVar);
            this.f209246v.observeForever(aVar);
            this.f209249y.observeForever(aVar);
            this.f209232e.observeForever(aVar);
        }
    }

    static {
        C76577a.m92151b(MMApplicationContext.getContext(), 88);
    }

    public WcPayRealnameVerifyIdInputUI() {
        int i = 0;
        while (true) {
            String[] strArr = this.f209166H;
            if (i < strArr.length) {
                strArr[i] = MMApplicationContext.getContext().getString(C0966R.string.krl, new Object[]{Integer.valueOf(i)});
                i++;
            } else {
                this.f209167I = 0;
                this.f209168J = 0;
                this.f209169K = 0;
                this.f209170L = 0;
                this.f209171M = 0;
                this.f209172N = 0;
                this.f209173P = 0;
                this.f209174Q = 0;
                this.f209175R = 0;
                this.f209176S = "";
                this.f209177T = new TenpaySecureEncrypt();
                this.f209180W = new IListener<WalletRealNameResultNotifyEvent>(C40008f.f107254d) {
                    {
                        this.__eventId = 323604482;
                    }

                    public boolean callback(IEvent iEvent) {
                        WcPayRealnameVerifyIdInputUI.this.f209180W.dead();
                        int i = ((WalletRealNameResultNotifyEvent) iEvent).f9603d.f9604a;
                        if (i != -1 && i != 0) {
                            return false;
                        }
                        WcPayRealnameVerifyIdInputUI.this.finish();
                        return false;
                    }
                };
                return;
            }
        }
    }

    /* renamed from: H7 */
    public static void m84524H7(WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        if (wcPayRealnameVerifyIdInputUI.f209181d.getContentEt().hasFocus()) {
            wcPayRealnameVerifyIdInputUI.f209181d.getContentEt().clearFocus();
        }
        if (wcPayRealnameVerifyIdInputUI.f209183f.getContentEt().hasFocus()) {
            wcPayRealnameVerifyIdInputUI.f209183f.getContentEt().clearFocus();
        }
    }

    /* renamed from: I7 */
    public final void mo99327I7(C79309g gVar) {
        C79148e process = getProcess();
        Bundle input = getInput();
        String str = gVar.f232830d;
        Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "NetSceneRealNameVerify response succ");
        if (process != null) {
            input.putString("key_real_name_token", str);
            input.putString("key_country_code", this.f209159A.f209236i.getValue());
            input.putString("key_province_code", this.f209159A.f209237j.getValue());
            input.putString("key_city_code", this.f209159A.f209238n.getValue());
            input.putParcelable("key_profession", this.f209159A.f209241q.getValue());
            input.putBoolean("realname_verify_process_need_bind_card", gVar.f232831e);
            input.putBoolean("realname_verify_process_need_face", gVar.f232832f);
            input.putLong("realname_verify_process_face_scene", gVar.f232833g);
            input.putString("realname_verify_process_face_package", gVar.f232834h);
            input.putString("realname_verify_process_face_package_sign", gVar.f232835i);
            input.putString("realname_verify_process_add_bank_word", gVar.f232836j);
            input.putString("realname_verify_process_req_key", gVar.f232841r);
            RealNameBundle realNameBundle = new RealNameBundle();
            realNameBundle.f209301d = this.f209159A.f209231d.getValue();
            realNameBundle.f209302e = this.f209161C;
            realNameBundle.f209303f = this.f209162D;
            realNameBundle.f209304g = this.f209159A.f209233f.getValue().f227260d.f184008d;
            realNameBundle.f209305h = this.f209182e.getText();
            realNameBundle.f209306i = this.f209159A.f209241q.getValue();
            realNameBundle.f209307j = this.f209159A.f209236i.getValue();
            realNameBundle.f209308n = this.f209159A.f209237j.getValue();
            realNameBundle.f209309o = this.f209159A.f209238n.getValue();
            realNameBundle.f209310p = this.f209159A.f209239o.getValue();
            realNameBundle.f209311q = this.f209159A.f209245u.getValue().intValue();
            realNameBundle.f209295D = this.f209159A.f209243s.getValue();
            realNameBundle.f209296E = this.f209167I;
            realNameBundle.f209297F = this.f209168J;
            realNameBundle.f209298G = this.f209169K;
            realNameBundle.f209312r = this.f209159A.f209244t.getValue();
            realNameBundle.f209313s = this.f209170L;
            realNameBundle.f209314t = this.f209171M;
            realNameBundle.f209315u = this.f209172N;
            realNameBundle.f209316v = this.f209190p.getText();
            realNameBundle.f209317w = this.f209173P;
            realNameBundle.f209318x = this.f209174Q;
            realNameBundle.f209319y = this.f209175R;
            realNameBundle.f209320z = this.f209159A.f209247w.getValue();
            realNameBundle.f209292A = this.f209159A.f209248x.getValue();
            realNameBundle.f209293B = this.f209176S;
            realNameBundle.f209294C = this.f209159A.f209240p.getValue();
            realNameBundle.f209299H = this.f209159A.f209249y.getValue();
            realNameBundle.f209300I = getString(C0966R.string.f361346j32).equals(this.f209159A.f209232e.getValue()) ? 1 : 2;
            input.putParcelable("realname_verify_process_bundle", realNameBundle);
            process.mo91264o(this, 0, input);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.chg;
    }

    public void initView() {
        this.f209181d = (WalletFormView) findViewById(C0966R.C0970id.lt9);
        this.f209192r = (WalletFormView) findViewById(C0966R.C0970id.ltc);
        this.f209182e = (WalletFormView) findViewById(C0966R.C0970id.lt7);
        this.f209183f = (WalletFormView) findViewById(C0966R.C0970id.lt6);
        this.f209186i = (WalletFormView) findViewById(C0966R.C0970id.lt5);
        this.f209187j = (WalletFormView) findViewById(C0966R.C0970id.lt4);
        this.f209188n = (WalletFormView) findViewById(C0966R.C0970id.f359608lt3);
        this.f209189o = (WalletFormView) findViewById(C0966R.C0970id.lt_);
        this.f209190p = (WalletFormView) findViewById(C0966R.C0970id.f359607lt2);
        this.f209184g = (WalletFormView) findViewById(C0966R.C0970id.ltb);
        this.f209185h = (WalletFormView) findViewById(C0966R.C0970id.f359606lt1);
        this.f209191q = (WalletFormView) findViewById(C0966R.C0970id.lt8);
        this.f209193s = (Button) findViewById(C0966R.C0970id.lta);
        this.f209195u = (TextView) findViewById(C0966R.C0970id.lte);
        this.f209196v = (TextView) findViewById(C0966R.C0970id.ltd);
        if (!Util.isNullOrNil(this.f209198x)) {
            this.f209195u.setText(this.f209198x);
        }
        if (!Util.isNullOrNil(this.f209199y)) {
            this.f209196v.setText(this.f209199y);
            this.f209196v.setVisibility(0);
        }
        this.f209181d.setFilterChar("\\x20\\t\\r\\n".toCharArray());
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = dimensionPixelSize2;
        da4 da4 = this.f209165G;
        if (da4 == null || Util.isNullOrNil(da4.f227147d)) {
            this.f209181d.getInfoIv().setLayoutParams(layoutParams);
            this.f209181d.getInfoIv().setScaleType(ImageView.ScaleType.FIT_CENTER);
            WalletIconImageView infoIv = this.f209181d.getInfoIv();
            int color = getResources().getColor(C0966R.color.FG_2);
            infoIv.f212566u = C0966R.raw.icons_filled_close2;
            infoIv.f212567v = color;
            this.f209181d.mo105069a(new C72121k());
        } else {
            this.f209181d.setText(this.f209165G.f227147d);
            C72131r rVar = this.f209159A;
            rVar.f209231d.setValue(this.f209165G.f227147d);
            this.f209181d.setContentTextColor(getResources().getColor(C0966R.color.FG_2));
            this.f209181d.setInputEnable(false);
            this.f209181d.getInfoIv().setImageResource(C0966R.raw.icons_outlined_info);
            this.f209181d.getInfoIv().setmUserSetImageIconColor(getResources().getColor(C0966R.color.FG_2));
            this.f209181d.getInfoIv().setVisibility(0);
            this.f209181d.getInfoIv().setClickable(true);
            this.f209181d.setOnInfoIvClickListener(new C72116h());
        }
        this.f209182e.setOnClickListener(new C72122l());
        this.f209182e.getInfoIv().setClickable(false);
        this.f209182e.getContentEt().setInputType(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON);
        this.f209183f.getInfoIv().setLayoutParams(layoutParams);
        this.f209183f.getInfoIv().setScaleType(ImageView.ScaleType.FIT_CENTER);
        WalletIconImageView infoIv2 = this.f209183f.getInfoIv();
        int color2 = getResources().getColor(C0966R.color.FG_2);
        infoIv2.f212566u = C0966R.raw.icons_filled_close2;
        infoIv2.f212567v = color2;
        C76024a.m91324e(this.f209183f);
        this.f209183f.mo105069a(new C72123m());
        this.f209192r.setOnClickListener(new C72124n());
        this.f209186i.setOnClickListener(new C72126o());
        this.f209186i.getInfoIv().setClickable(false);
        this.f209186i.getContentEt().setClickable(false);
        this.f209186i.getContentEt().setFocusable(false);
        this.f209187j.getContentEt().setClickable(false);
        this.f209187j.getContentEt().setFocusable(false);
        this.f209186i.getContentEt().setInputType(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON);
        this.f209187j.getContentEt().setInputType(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON);
        this.f209187j.setOnClickListener(new C72128p());
        this.f209187j.getInfoIv().setClickable(false);
        this.f209191q.setInputType(3);
        this.f209191q.mo105069a(new C72130q());
        this.f209188n.setOnClickListener(new C72107a());
        this.f209188n.getInfoIv().setClickable(false);
        this.f209190p.setOnClickListener(new C72109b());
        this.f209190p.getInfoIv().setClickable(false);
        this.f209189o.getContentEt().setFocusable(true);
        this.f209189o.getContentEt().setClickable(true);
        this.f209189o.getContentEt().setEnabled(true);
        this.f209189o.getContentEt().setOnClickListener(new C72111c());
        this.f209189o.setOnClickListener(new C72112d());
        this.f209189o.getInfoIv().setClickable(false);
        this.f209184g.getContentEt().setInputType(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON);
        this.f209184g.setOnClickListener(new C72113e());
        this.f209184g.getInfoIv().setClickable(false);
        this.f209185h.getContentEt().setInputType(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON);
        this.f209185h.setOnClickListener(new C72114f());
        this.f209185h.getInfoIv().setClickable(false);
        this.f209193s.setOnClickListener(new C72115g());
        this.f209181d.mo105095m();
        this.f209159A.f209235h.observe(this, new C72156n(this));
        this.f209159A.f209233f.observe(this, new C72157o(this));
        this.f209159A.f209243s.observe(this, new C72158p(this));
        this.f209159A.f209244t.observe(this, new C72159q(this));
        this.f209159A.f209232e.observe(this, new C72160r(this));
        this.f209159A.f209245u.observe(this, new C72161s(this));
        this.f209159A.f209246v.observe(this, new C72162t(this));
        this.f209159A.f209239o.observe(this, new C72163u(this));
        this.f209159A.f209240p.observe(this, new C72166v(this));
        this.f209159A.f209248x.observe(this, new C72167w(this));
        this.f209159A.f209241q.observe(this, new C72168x(this));
        this.f209159A.f209242r.observe(this, new C72169y(this));
        if (((ArrayList) this.f209164F).size() > 0) {
            this.f209159A.f209233f.setValue((C77922en3) ((ArrayList) this.f209164F).get(0));
        } else {
            C76241b logicDelegate = this.f209183f.getLogicDelegate();
            if (logicDelegate instanceof C76024a.C76033i) {
                ((C76024a.C76033i) logicDelegate).mo106242f(-1);
            }
        }
        C75228t.m90236b(new WalletFormView[]{this.f209181d, this.f209182e, this.f209183f, this.f209184g, this.f209185h, this.f209186i, this.f209187j, this.f209188n, this.f209189o, this.f209190p, this.f209191q, this.f209192r}, 10);
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                String stringExtra = intent.getStringExtra("CountryName");
                String stringExtra2 = intent.getStringExtra("ProviceName");
                String stringExtra3 = intent.getStringExtra("CityName");
                String stringExtra4 = intent.getStringExtra("Country");
                String stringExtra5 = intent.getStringExtra("Contact_Province");
                String stringExtra6 = intent.getStringExtra("Contact_City");
                StringBuilder sb = new StringBuilder();
                if (!Util.isNullOrNil(stringExtra)) {
                    sb.append(stringExtra);
                    sb.append(" ");
                }
                if (!Util.isNullOrNil(stringExtra2)) {
                    sb.append(stringExtra2);
                    sb.append(" ");
                }
                if (!Util.isNullOrNil(stringExtra3)) {
                    sb.append(stringExtra3);
                }
                C72131r rVar = this.f209159A;
                String sb4 = sb.toString();
                rVar.f209236i.setValue(stringExtra4);
                rVar.f209237j.setValue(stringExtra5);
                rVar.f209238n.setValue(stringExtra6);
                rVar.f209239o.setValue(sb4);
                return;
            }
            Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "no area choose!");
        } else if (i == 2) {
            if (i2 == -1) {
                this.f209159A.f209241q.setValue((Profession) intent.getParcelableExtra("key_select_profession"));
                return;
            }
            Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "no choose!");
        } else if (i == 3 && i2 == 100) {
            if (!Util.isNullOrNil(intent.getStringExtra("country_name"))) {
                String stringExtra7 = intent.getStringExtra("iso_code");
                String stringExtra8 = intent.getStringExtra("country_name");
                this.f209176S = intent.getStringExtra("couttry_code");
                C72131r rVar2 = this.f209159A;
                rVar2.f209247w.setValue(stringExtra7);
                rVar2.f209248x.setValue(stringExtra8);
            }
        } else if (i == 4 && i2 == -1 && intent != null) {
            String stringExtra9 = intent.getStringExtra("key_countrycode");
            String stringExtra10 = intent.getStringExtra("key_provincecode");
            String stringExtra11 = intent.getStringExtra("key_citycode");
            String stringExtra12 = intent.getStringExtra("key_zone");
            String stringExtra13 = intent.getStringExtra("key_address");
            C72131r rVar3 = this.f209159A;
            rVar3.f209236i.setValue(stringExtra9);
            rVar3.f209237j.setValue(stringExtra10);
            rVar3.f209238n.setValue(stringExtra11);
            rVar3.f209239o.setValue(stringExtra12);
            this.f209159A.f209240p.setValue(stringExtra13);
        } else if (i != 5) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            getProcess().mo91259f(this, getInput());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.f2932f));
        hideActionbarLine();
        setMMTitle("");
        this.f209178U = getInput().getInt("entry_scene", -1);
        this.f209179V = getInput().getInt("realname_entry_scene", 0);
        this.mNetSceneMgr.mo105624c(1616);
        this.f209180W.alive();
        this.f209159A = (C72131r) C39629l0.m42233a(this, (C54209k0.C54210b) null).mo75002a(C72131r.class);
        String string = getInput().getString("realname_verify_process_get_wording_cache");
        try {
            if (!Util.isNullOrNil(string)) {
                C77919e72 e722 = (C77919e72) new C77919e72().parseFrom(string.getBytes(C77613a.f226275a));
                ((ArrayList) this.f209164F).addAll(e722.f227216E);
                this.f209198x = e722.f227217F;
                this.f209199y = e722.f227218G;
                this.f209165G = e722.f227220I;
            }
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.WcPayRealnameVerifyIdInputUI", e, "", new Object[0]);
        }
        initView();
        Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "do get user ext info");
        doSceneForceProgress(new C79312k((String) null));
    }

    public void onDestroy() {
        super.onDestroy();
        this.mNetSceneMgr.mo105630i(1616);
        this.f209180W.dead();
    }

    public void onNewIntent(Intent intent) {
        getInput().getInt("key_err_code");
        super.onNewIntent(intent);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C79312k) {
            C79312k kVar = (C79312k) yVar;
            this.f209160B = kVar.f232855f;
            this.f209163E = kVar.f232856g;
        } else if ((yVar instanceof C79309g) && i == 0 && i2 == 0) {
            C79309g gVar = (C79309g) yVar;
            C67209v vVar = gVar.f232837n;
            if (!((vVar == null && gVar.f232838o == null) ? false : true)) {
                mo99327I7(gVar);
            } else if (gVar.f232838o != null) {
                Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "NetSceneRealNameVerify show underAgeMidDialog");
                C67193m mVar = gVar.f232838o;
                C101218e0 e0Var = new C101218e0(getContext(), 1, 0);
                e0Var.mo140667n(mVar.f192917c, mVar.f192918d);
                C72170z zVar = new C72170z(this, e0Var);
                C72139a0 a0Var = new C72139a0(this, e0Var, gVar);
                e0Var.f296373D = zVar;
                e0Var.f296374E = a0Var;
                View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.f360068d60, (ViewGroup) null);
                ((TextView) inflate.findViewById(C0966R.C0970id.et6)).setText(mVar.f192915a);
                ((TextView) inflate.findViewById(C0966R.C0970id.f358384et2)).setText(mVar.f192916b);
                e0Var.mo140663j(inflate);
                e0Var.mo140655A();
                C75228t.m90245f0(20, 1, Util.nowSecond(), this.f209178U);
            } else if (vVar != null) {
                Log.m105924i("MicroMsg.WcPayRealnameVerifyIdInputUI", "NetSceneRealNameVerify show juveniles dialog");
                C67209v vVar2 = gVar.f232837n;
                C76879j.m92707A(this, vVar2.f192980a, "", vVar2.f192982c, vVar2.f192981b, new C72119i(gVar), new C72120j(this));
            }
            return true;
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5810l.class);
    }
}
