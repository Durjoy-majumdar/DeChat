package com.tencent.p014mm.plugin.remittance.p098ui;

import al3.C0086a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import b63.C67175a;
import c53.C67342b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent;
import com.tencent.p014mm.autogen.events.F2fPayCheckEvent;
import com.tencent.p014mm.autogen.events.WalletErrorCodeDialogClickEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayLargeAmountTransferReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.plugin.remittance.model.C42839e0;
import com.tencent.p014mm.plugin.remittance.model.C42851q;
import com.tencent.p014mm.plugin.remittance.model.C5061w0;
import com.tencent.p014mm.plugin.remittance.model.C70584f0;
import com.tencent.p014mm.plugin.remittance.model.C70587h0;
import com.tencent.p014mm.plugin.remittance.model.C70614v0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tenpay.android.wechat.MyKeyboardWindow;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C75592q0;
import eb0.C75597w2;
import f40.C86709a0;
import g63.C45890a;
import g63.C59372b;
import g63.C59373c;
import g63.C59374e;
import g63.C8236d;
import g63.C8237f;
import g63.C8238g;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C76912y0;
import nj3.C88989a;
import ob0.C117747y;
import oi2.C77010f;
import p196ln.C10579k;
import p196ln.C10581n;
import p196ln.C76706g;
import p196ln.C76708i;
import p629ny.C76979h;
import q43.C77302a;
import qn3.C77382c;
import qo3.C47883u;
import qo3.C77389a;
import qo3.C77398g;
import qo3.C77426q;
import te3.C77965lu;
import v53.C78347j0;
import v53.C78348k0;
import yq3.C79144b;

@C88989a(2)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI */
public abstract class RemittanceBaseUI extends WalletBaseUI implements C10579k.C10580a {

    /* renamed from: f1 */
    public static final /* synthetic */ int f204341f1 = 0;

    /* renamed from: A */
    public TextView f204342A;

    /* renamed from: B */
    public ScrollView f204343B;

    /* renamed from: C */
    public LinearLayout f204344C;

    /* renamed from: D */
    public LinearLayout f204345D;

    /* renamed from: E */
    public LinearLayout f204346E;

    /* renamed from: F */
    public TextView f204347F;

    /* renamed from: G */
    public TextView f204348G;

    /* renamed from: H */
    public String f204349H;

    /* renamed from: I */
    public String f204350I;

    /* renamed from: J */
    public String f204351J;

    /* renamed from: K */
    public String f204352K;

    /* renamed from: L */
    public boolean f204353L = true;

    /* renamed from: M */
    public String f204354M;

    /* renamed from: N */
    public String f204355N;

    /* renamed from: P */
    public double f204356P;

    /* renamed from: Q */
    public String f204357Q;

    /* renamed from: Q0 */
    public boolean f204358Q0 = false;

    /* renamed from: R */
    public int f204359R;

    /* renamed from: R0 */
    public String f204360R0;

    /* renamed from: S */
    public String f204361S;

    /* renamed from: S0 */
    public IListener f204362S0;

    /* renamed from: T */
    public String f204363T = null;

    /* renamed from: T0 */
    public boolean f204364T0;

    /* renamed from: U */
    public String f204365U = null;

    /* renamed from: U0 */
    public boolean f204366U0;

    /* renamed from: V */
    public int f204367V;

    /* renamed from: V0 */
    public boolean f204368V0;

    /* renamed from: W */
    public int f204369W;

    /* renamed from: W0 */
    public boolean f204370W0;

    /* renamed from: X */
    public String f204371X;

    /* renamed from: X0 */
    public C77965lu f204372X0;

    /* renamed from: Y */
    public String f204373Y;

    /* renamed from: Y0 */
    public IListener f204374Y0;

    /* renamed from: Z */
    public Map<String, C70646q> f204375Z = new HashMap();

    /* renamed from: Z0 */
    public int f204376Z0;

    /* renamed from: a1 */
    public double f204377a1;

    /* renamed from: b1 */
    public String f204378b1;

    /* renamed from: c1 */
    public String f204379c1;

    /* renamed from: d */
    public C77302a f204380d = null;

    /* renamed from: d1 */
    public String f204381d1;

    /* renamed from: e */
    public double f204382e;

    /* renamed from: e1 */
    public IListener<F2fPayCheckEvent> f204383e1;

    /* renamed from: f */
    public String f204384f;

    /* renamed from: g */
    public String f204385g;

    /* renamed from: h */
    public String f204386h;

    /* renamed from: i */
    public String f204387i;

    /* renamed from: j */
    public int f204388j;

    /* renamed from: n */
    public int f204389n;

    /* renamed from: o */
    public int f204390o = -1;

    /* renamed from: p */
    public String f204391p;

    /* renamed from: p0 */
    public String f204392p0;

    /* renamed from: q */
    public Button f204393q;

    /* renamed from: r */
    public WalletFormView f204394r;

    /* renamed from: s */
    public ImageView f204395s;

    /* renamed from: t */
    public TextView f204396t;

    /* renamed from: u */
    public TextView f204397u;

    /* renamed from: v */
    public TextView f204398v;

    /* renamed from: w */
    public TextView f204399w;

    /* renamed from: x */
    public TextView f204400x;

    /* renamed from: x0 */
    public C70587h0 f204401x0;

    /* renamed from: y */
    public TextView f204402y;

    /* renamed from: y0 */
    public WCPayLargeAmountTransferReportStruct f204403y0;

    /* renamed from: z */
    public TextView f204404z;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$a */
    public class C70626a implements View.OnClickListener {
        public C70626a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RemittanceBaseUI remittanceBaseUI = RemittanceBaseUI.this;
            int i = remittanceBaseUI.f204388j;
            String str = remittanceBaseUI.f204355N;
            double d = remittanceBaseUI.f204356P;
            int i2 = C70896i0.f205308g;
            Log.m105924i("RemittanceChargeDialog", "showAlert");
            C70896i0 i0Var = new C70896i0(remittanceBaseUI);
            i0Var.f205310e = i;
            Log.m105924i("RemittanceChargeDialog", "showTips");
            TextView textView = (TextView) i0Var.findViewById(C0966R.C0970id.imu);
            if (Util.isNullOrNil(str)) {
                Log.m105920e("RemittanceChargeDialog", "desc is null");
            } else {
                textView.setText(str);
                textView.setVisibility(0);
            }
            ((TextView) i0Var.findViewById(C0966R.C0970id.f74)).setText(remittanceBaseUI.getResources().getString(C0966R.string.i1y, new Object[]{C75228t.m90256l(d)}));
            View findViewById = i0Var.findViewById(C0966R.C0970id.kma);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowTips", "(Landroid/content/Context;Ljava/lang/String;D)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowTips", "(Landroid/content/Context;Ljava/lang/String;D)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById2 = i0Var.findViewById(C0966R.C0970id.f75);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view3 = findViewById2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowTips", "(Landroid/content/Context;Ljava/lang/String;D)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceChargeDialog", "doShowTips", "(Landroid/content/Context;Ljava/lang/String;D)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i0Var.show();
            C76879j.m92730a(remittanceBaseUI, i0Var);
            if (RemittanceBaseUI.this.f204388j == 1) {
                C115669n.INSTANCE.mo160131h(12689, 13, 1);
            } else {
                C115669n.INSTANCE.mo160131h(12689, 4, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$b */
    public class C70627b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C70587h0 f204409d;

        public C70627b(C70587h0 h0Var) {
            this.f204409d = h0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105925i("MicroMsg.RemittanceBaseUI", "goto h5: %s", this.f204409d.f204112z.f192847d);
            C75228t.m90219L(RemittanceBaseUI.this.getContext(), this.f204409d.f204112z.f192847d, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$c */
    public class C70628c implements DialogInterface.OnClickListener {
        public C70628c(RemittanceBaseUI remittanceBaseUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$d */
    public class C70629d implements MenuItem.OnMenuItemClickListener {
        public C70629d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RemittanceBaseUI remittanceBaseUI = RemittanceBaseUI.this;
            int i = remittanceBaseUI.f204388j;
            if (i == 1 || i == 6) {
                remittanceBaseUI.mo97272L7();
                RemittanceBaseUI.this.finish();
            } else if (i == 2 || i == 5) {
                remittanceBaseUI.finish();
            } else {
                remittanceBaseUI.mo97277Q7();
            }
            RemittanceBaseUI.this.mo97270J7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$e */
    public class C70630e implements C45890a.C45894c {
        public C70630e() {
        }

        /* renamed from: a */
        public boolean mo97290a(boolean z, String str, String str2, String str3, String str4) {
            RemittanceBaseUI.this.f204353L = z;
            if (!Util.isNullOrNil(str)) {
                RemittanceBaseUI.this.f204349H = str;
            } else {
                RemittanceBaseUI.this.f204349H = null;
            }
            if (!RemittanceBaseUI.this.f204353L) {
                if (!Util.isNullOrNil(str2)) {
                    RemittanceBaseUI.this.f204350I = str2;
                } else {
                    RemittanceBaseUI.this.f204350I = null;
                }
                if (!Util.isNullOrNil(str3)) {
                    RemittanceBaseUI.this.f204351J = str3;
                } else {
                    RemittanceBaseUI.this.f204351J = null;
                }
                if (!Util.isNullOrNil(str4)) {
                    RemittanceBaseUI.this.f204352K = str4;
                } else {
                    RemittanceBaseUI.this.f204352K = null;
                }
            }
            RemittanceBaseUI remittanceBaseUI = RemittanceBaseUI.this;
            int i = remittanceBaseUI.f204389n;
            if (!(i == 33 || i == 32)) {
                if (!Util.isEqual(remittanceBaseUI.f204390o, 0)) {
                    remittanceBaseUI.f204346E.setVisibility(8);
                } else if (Util.isNullOrNil(remittanceBaseUI.f204350I)) {
                    remittanceBaseUI.f204346E.setVisibility(8);
                } else {
                    remittanceBaseUI.f204346E.setVisibility(0);
                    TextView textView = remittanceBaseUI.f204347F;
                    textView.setText(remittanceBaseUI.f204350I + "  " + remittanceBaseUI.f204351J);
                    remittanceBaseUI.f204348G.setText(remittanceBaseUI.f204352K);
                }
            }
            RemittanceBaseUI.m83152I7(RemittanceBaseUI.this);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$f */
    public class C70631f implements C47883u {

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$f$a */
        public class C70632a implements Runnable {
            public C70632a() {
            }

            public void run() {
                RemittanceBaseUI.this.hideVKB();
            }
        }

        public C70631f() {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            MMHandlerThread.postToMainThreadDelayed(new C70632a(), 500);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$g */
    public class C70633g implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C70587h0 f204415d;

        /* renamed from: e */
        public final /* synthetic */ String f204416e;

        /* renamed from: f */
        public final /* synthetic */ String f204417f;

        /* renamed from: g */
        public final /* synthetic */ String f204418g;

        public C70633g(C70587h0 h0Var, String str, String str2, String str3) {
            this.f204415d = h0Var;
            this.f204416e = str;
            this.f204417f = str2;
            this.f204418g = str3;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105925i("MicroMsg.RemittanceBaseUI", "onClick1 realNameCheckMessage %s", RemittanceBaseUI.this.f204372X0);
            WCPayTrasnferCheckRealNameReportStruct wCPayTrasnferCheckRealNameReportStruct = new WCPayTrasnferCheckRealNameReportStruct();
            C70587h0 h0Var = this.f204415d;
            wCPayTrasnferCheckRealNameReportStruct.f194689f = (long) ((int) h0Var.f204111y);
            wCPayTrasnferCheckRealNameReportStruct.mo93202s(h0Var.f204088S);
            wCPayTrasnferCheckRealNameReportStruct.f194687d = 9;
            wCPayTrasnferCheckRealNameReportStruct.mo86054n();
            C70587h0 h0Var2 = this.f204415d;
            h0Var2.f204087R = null;
            RemittanceBaseUI.this.mo97281V7(this.f204416e, this.f204417f, this.f204418g, h0Var2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$h */
    public class C70634h implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C70587h0 f204420d;

        public C70634h(RemittanceBaseUI remittanceBaseUI, C70587h0 h0Var) {
            this.f204420d = h0Var;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.RemittanceBaseUI", "onClick1");
            WCPayTrasnferCheckRealNameReportStruct wCPayTrasnferCheckRealNameReportStruct = new WCPayTrasnferCheckRealNameReportStruct();
            C70587h0 h0Var = this.f204420d;
            wCPayTrasnferCheckRealNameReportStruct.f194689f = (long) ((int) h0Var.f204111y);
            wCPayTrasnferCheckRealNameReportStruct.mo93202s(h0Var.f204088S);
            wCPayTrasnferCheckRealNameReportStruct.f194687d = 8;
            wCPayTrasnferCheckRealNameReportStruct.mo86054n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$i */
    public class C70635i implements DialogInterface.OnClickListener {
        public C70635i(RemittanceBaseUI remittanceBaseUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$j */
    public class C70636j extends C30870z1 {
        public C70636j() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            RemittanceBaseUI remittanceBaseUI = RemittanceBaseUI.this;
            if (remittanceBaseUI.f204389n == 33) {
                remittanceBaseUI.mo97273M7(remittanceBaseUI.f204349H, remittanceBaseUI.f204390o, remittanceBaseUI.f204350I, remittanceBaseUI.f204351J, remittanceBaseUI.f204352K, remittanceBaseUI.f204354M, "", (F2fDynamicStartPayEvent) null);
            } else {
                remittanceBaseUI.f204382e = Util.getDouble(remittanceBaseUI.f204394r.getText(), 0.0d);
                if (!RemittanceBaseUI.this.f204394r.mo105094l()) {
                    C76912y0.makeText((Context) RemittanceBaseUI.this.getContext(), (int) C0966R.string.kmc, 0).show();
                } else {
                    RemittanceBaseUI remittanceBaseUI2 = RemittanceBaseUI.this;
                    if (remittanceBaseUI2.f204382e < 0.01d) {
                        remittanceBaseUI2.mo97279S7();
                    } else {
                        remittanceBaseUI2.hideTenpayKB();
                        RemittanceBaseUI.this.getClass();
                        RemittanceBaseUI remittanceBaseUI3 = RemittanceBaseUI.this;
                        remittanceBaseUI3.mo97273M7(remittanceBaseUI3.f204349H, remittanceBaseUI3.f204390o, remittanceBaseUI3.f204350I, remittanceBaseUI3.f204351J, remittanceBaseUI3.f204352K, (String) null, "", (F2fDynamicStartPayEvent) null);
                    }
                }
            }
            RemittanceBaseUI remittanceBaseUI4 = RemittanceBaseUI.this;
            if (remittanceBaseUI4.f204356P == 0.0d) {
                if (remittanceBaseUI4.f204388j == 1) {
                    C115669n.INSTANCE.mo160131h(12689, 15, 1);
                } else {
                    C115669n.INSTANCE.mo160131h(12689, 6, 1);
                }
            }
            RemittanceBaseUI remittanceBaseUI5 = RemittanceBaseUI.this;
            if (remittanceBaseUI5.f204388j == 1 && !Util.isNullOrNil(remittanceBaseUI5.f204349H)) {
                C115669n.INSTANCE.mo160131h(14074, 2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$k */
    public class C70637k implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$k$a */
        public class C70638a implements C76879j.C47267l {
            public C70638a() {
            }

            public boolean onFinish(CharSequence charSequence) {
                if (!Util.isNullOrNil(charSequence.toString())) {
                    RemittanceBaseUI.this.f204349H = charSequence.toString();
                    RemittanceBaseUI.m83152I7(RemittanceBaseUI.this);
                    return true;
                }
                RemittanceBaseUI remittanceBaseUI = RemittanceBaseUI.this;
                remittanceBaseUI.f204349H = null;
                RemittanceBaseUI.m83152I7(remittanceBaseUI);
                return true;
            }
        }

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$k$b */
        public class C70639b implements DialogInterface.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$k$b$a */
            public class C70640a implements Runnable {
                public C70640a() {
                }

                public void run() {
                    RemittanceBaseUI.this.hideVKB();
                }
            }

            public C70639b() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                MMHandlerThread.postToMainThreadDelayed(new C70640a(), 500);
            }
        }

        public C70637k() {
        }

        public void onClick(View view) {
            String str;
            String str2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            RemittanceBaseUI.this.hideTenpayKB();
            RemittanceBaseUI remittanceBaseUI = RemittanceBaseUI.this;
            int i = RemittanceBaseUI.f204341f1;
            remittanceBaseUI.getClass();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(12689, 9, 1);
            RemittanceBaseUI remittanceBaseUI2 = RemittanceBaseUI.this;
            int i2 = remittanceBaseUI2.f204388j;
            if (i2 == 1 || i2 == 6) {
                String string = remittanceBaseUI2.getString(C0966R.string.hzm);
                String string2 = RemittanceBaseUI.this.getString(C0966R.string.i0k);
                nVar.mo160131h(14074, 1);
                str2 = string;
                str = string2;
            } else {
                String string3 = remittanceBaseUI2.getString(C0966R.string.hzl);
                String string4 = RemittanceBaseUI.this.getString(C0966R.string.hzs);
                if (Util.isEqual(RemittanceBaseUI.this.f204390o, 0)) {
                    RemittanceBaseUI.this.getClass();
                }
                str2 = string3;
                str = string4;
            }
            RemittanceBaseUI remittanceBaseUI3 = RemittanceBaseUI.this;
            C45890a.m51175a(remittanceBaseUI3, str2, remittanceBaseUI3.f204349H, str, false, 20, new C70638a(), new C70639b());
            C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$l */
    public class C70641l implements DialogInterface.OnClickListener {
        public C70641l(RemittanceBaseUI remittanceBaseUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$m */
    public class C70642m implements MenuItem.OnMenuItemClickListener {
        public C70642m() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C75228t.m90219L(RemittanceBaseUI.this.getContext(), RemittanceBaseUI.this.f204365U, false);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$n */
    public class C70643n implements C75597w2.C31525a {

        /* renamed from: a */
        public final /* synthetic */ long f204427a;

        public C70643n(long j) {
            this.f204427a = j;
        }

        /* renamed from: a */
        public void mo1109a(String str, boolean z) {
            if (z) {
                Log.m105926v("MicroMsg.RemittanceBaseUI", "getContact suc; cost=" + (Util.nowMilliSecond() - this.f204427a) + " ms");
                ((C76708i) C86312j.m106911c(C76708i.class)).mo106848yE(str, 3);
            } else {
                Log.m105928w("MicroMsg.RemittanceBaseUI", "getContact failed");
            }
            RemittanceBaseUI remittanceBaseUI = RemittanceBaseUI.this;
            int i = RemittanceBaseUI.f204341f1;
            remittanceBaseUI.mo97282W7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$o */
    public class C70644o implements Runnable {
        public C70644o() {
        }

        public void run() {
            Bitmap N50 = ((C76708i) C86312j.m106911c(C76708i.class)).N50(RemittanceBaseUI.this.f204384f);
            if (N50 == null) {
                RemittanceBaseUI.this.f204395s.setImageResource(C0966R.C0969drawable.bfa);
            } else {
                RemittanceBaseUI.this.f204395s.setImageBitmap(N50);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$p */
    public class C70645p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Runnable f204430d;

        public C70645p(RemittanceBaseUI remittanceBaseUI, Runnable runnable) {
            this.f204430d = runnable;
        }

        public void run() {
            this.f204430d.run();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$q */
    public static class C70646q {

        /* renamed from: a */
        public String f204431a;

        /* renamed from: b */
        public String f204432b;

        /* renamed from: c */
        public String f204433c;

        /* renamed from: d */
        public String f204434d;

        /* renamed from: e */
        public int f204435e;

        /* renamed from: f */
        public String f204436f;

        /* renamed from: g */
        public String f204437g;

        /* renamed from: h */
        public String f204438h;

        /* renamed from: i */
        public long f204439i;

        public C70646q(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, long j) {
            this.f204431a = str;
            this.f204432b = str2;
            this.f204433c = str3;
            this.f204434d = str4;
            this.f204435e = i;
            this.f204436f = str5;
            this.f204437g = str6;
            this.f204438h = str7;
            this.f204439i = j;
        }
    }

    public RemittanceBaseUI() {
        C76577a.m92151b(MMApplicationContext.getContext(), 270);
        C40008f fVar = C40008f.f107254d;
        this.f204362S0 = new IListener<WalletErrorCodeDialogClickEvent>(fVar) {
            {
                this.__eventId = -260010650;
            }

            public boolean callback(IEvent iEvent) {
                if (!Util.isEqual(RemittanceBaseUI.this.f204401x0.getUri(), ((WalletErrorCodeDialogClickEvent) iEvent).f194036d.f194037a) || !Util.isEqual(RemittanceBaseUI.this.f204401x0.f204089T, 1)) {
                    return false;
                }
                RemittanceBaseUI.this.finish();
                return false;
            }
        };
        this.f204364T0 = false;
        this.f204366U0 = false;
        this.f204368V0 = false;
        this.f204370W0 = false;
        this.f204372X0 = null;
        this.f204374Y0 = new IListener<F2fDynamicStartPayEvent>(fVar) {
            {
                this.__eventId = -1113934945;
            }

            public boolean callback(IEvent iEvent) {
                F2fDynamicStartPayEvent f2fDynamicStartPayEvent = (F2fDynamicStartPayEvent) iEvent;
                if (f2fDynamicStartPayEvent.f193584d.f193587c == 1) {
                    C115669n.INSTANCE.mo160131h(15386, 4, 1);
                } else {
                    C115669n.INSTANCE.mo160131h(15386, 5, 1);
                }
                F2fDynamicStartPayEvent.C67691a aVar = f2fDynamicStartPayEvent.f193584d;
                String str = aVar.f193585a;
                Log.m105925i("MicroMsg.RemittanceBaseUI", "receive dynamic req: %s, %s", Integer.valueOf(aVar.f193587c), str);
                RemittanceBaseUI remittanceBaseUI = RemittanceBaseUI.this;
                if (remittanceBaseUI.f204389n == 33) {
                    remittanceBaseUI.mo97273M7(remittanceBaseUI.f204349H, remittanceBaseUI.f204390o, remittanceBaseUI.f204350I, remittanceBaseUI.f204351J, remittanceBaseUI.f204352K, remittanceBaseUI.f204354M, str, f2fDynamicStartPayEvent);
                } else {
                    remittanceBaseUI.mo97273M7(remittanceBaseUI.f204349H, remittanceBaseUI.f204390o, remittanceBaseUI.f204350I, remittanceBaseUI.f204351J, remittanceBaseUI.f204352K, (String) null, str, f2fDynamicStartPayEvent);
                }
                return false;
            }
        };
        this.f204376Z0 = 0;
        this.f204377a1 = 0.0d;
        this.f204378b1 = "";
        this.f204379c1 = "";
        this.f204381d1 = "";
        this.f204383e1 = new IListener<F2fPayCheckEvent>(fVar) {
            {
                this.__eventId = 1822922800;
            }

            public boolean callback(IEvent iEvent) {
                F2fPayCheckEvent f2fPayCheckEvent = (F2fPayCheckEvent) iEvent;
                F2fPayCheckEvent.C67693a aVar = f2fPayCheckEvent.f193594d;
                if (aVar.f193598d) {
                    Log.m105922f("MicroMsg.RemittanceBaseUI", "F2fPayCheckEvent is from kinda");
                    F2fPayCheckEvent.C67693a aVar2 = f2fPayCheckEvent.f193594d;
                    int i = aVar2.f193599e;
                    boolean z = true;
                    if (i == 1) {
                        RemittanceBaseUI.m83151H7(RemittanceBaseUI.this, aVar2.f193595a, aVar2.f193597c);
                        if (f2fPayCheckEvent.f193594d.f193600f == RemittanceBaseUI.this.getContext().hashCode()) {
                            C70614v0 xx02 = C77010f.vx0().xx0();
                            RemittanceBaseUI remittanceBaseUI = RemittanceBaseUI.this;
                            xx02.mo97262d(remittanceBaseUI.f204392p0, remittanceBaseUI.f204384f, "");
                        } else {
                            Log.m105929w("MicroMsg.RemittanceBaseUI", "callback to wrong page: %s, %s", Integer.valueOf(f2fPayCheckEvent.f193594d.f193600f), Integer.valueOf(RemittanceBaseUI.this.getContext().hashCode()));
                        }
                    } else if (i == 2) {
                        RemittanceBaseUI remittanceBaseUI2 = RemittanceBaseUI.this;
                        int i2 = remittanceBaseUI2.f204388j;
                        if (!(i2 == 2 || i2 == 5)) {
                            z = false;
                        }
                        if (Util.isNullOrNil(remittanceBaseUI2.f204384f) || z) {
                            RemittanceBaseUI.this.finish();
                        } else {
                            Intent intent = new Intent();
                            intent.putExtra("Chat_User", RemittanceBaseUI.this.f204384f);
                            intent.putExtra("finish_direct", false);
                            C88144b.m109801s(RemittanceBaseUI.this, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                        }
                    }
                } else {
                    RemittanceBaseUI.m83151H7(RemittanceBaseUI.this, aVar.f193595a, aVar.f193597c);
                }
                return false;
            }
        };
    }

    /* renamed from: H7 */
    public static void m83151H7(RemittanceBaseUI remittanceBaseUI, String str, String str2) {
        C70646q qVar = (C70646q) ((HashMap) remittanceBaseUI.f204375Z).get(str);
        Log.m105919d("MicroMsg.RemittanceBaseUI", "match reqKey: %s, %d", str, Integer.valueOf(((HashMap) remittanceBaseUI.f204375Z).size()));
        if (qVar == null) {
            Log.m105925i("MicroMsg.RemittanceBaseUI", "no data for: %s", str);
        } else {
            Log.m105925i("MicroMsg.RemittanceBaseUI", "pay check: %d", Integer.valueOf(remittanceBaseUI.f204389n));
            if (Util.isNullOrNil(qVar.f204437g)) {
                qVar.f204437g = str2;
            }
            if (Util.isNullOrNil(qVar.f204432b)) {
                qVar.f204432b = str2;
            }
            if (remittanceBaseUI.f204389n == 31) {
                C86709a0.m107524d().mo123460f(new C42839e0(str, qVar.f204436f, qVar.f204437g, qVar.f204438h, qVar.f204439i, qVar.f204433c));
            } else {
                C86709a0.m107524d().mo123460f(new C42851q(qVar.f204431a, qVar.f204432b, qVar.f204433c, qVar.f204434d, qVar.f204435e));
            }
        }
        ((HashMap) remittanceBaseUI.f204375Z).clear();
    }

    /* renamed from: I7 */
    public static void m83152I7(RemittanceBaseUI remittanceBaseUI) {
        if (Util.isNullOrNil(remittanceBaseUI.f204349H)) {
            remittanceBaseUI.f204399w.setVisibility(8);
            if (remittanceBaseUI.f204388j == 1) {
                remittanceBaseUI.f204400x.setText(C0966R.string.hzm);
            } else {
                remittanceBaseUI.f204400x.setText(C0966R.string.hzl);
            }
            remittanceBaseUI.f204400x.setVisibility(0);
            return;
        }
        new C72478z(remittanceBaseUI.getContext());
        String string = remittanceBaseUI.getString(C0966R.string.i1o);
        SpannableString T1 = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(remittanceBaseUI, remittanceBaseUI.getString(C0966R.string.bgb, new Object[]{remittanceBaseUI.f204349H, string}));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(T1);
        spannableStringBuilder.setSpan(Util.isEqual(remittanceBaseUI.f204390o, 0) ? new ForegroundColorSpan(-15970418) : new ForegroundColorSpan(remittanceBaseUI.getContext().getResources().getColor(C0966R.color.a1d)), T1.length() - string.length(), T1.length(), 34);
        remittanceBaseUI.f204399w.setText(spannableStringBuilder);
        remittanceBaseUI.f204400x.setVisibility(8);
        remittanceBaseUI.f204399w.setVisibility(0);
    }

    /* renamed from: U7 */
    public static void m83153U7(Context context, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        C77389a aVar = new C77389a();
        aVar.f225644a = str2;
        aVar.f225660q = str;
        aVar.f225663t = str3;
        aVar.f225620C = onClickListener;
        aVar.f225664u = str4;
        aVar.f225621D = onClickListener2;
        aVar.f225668y = false;
        aVar.f225669z = true;
        C77398g gVar = new C77398g(context, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        C76879j.m92730a(context, gVar);
    }

    /* renamed from: J7 */
    public void mo97270J7() {
    }

    /* renamed from: K7 */
    public abstract void mo97271K7();

    /* renamed from: L7 */
    public void mo97272L7() {
        C70584f0 f0Var = new C70584f0(this.f204384f, this.f204391p);
        f0Var.setProcessName("RemittanceProcess");
        doSceneProgress(f0Var);
    }

    /* renamed from: M7 */
    public abstract void mo97273M7(String str, int i, String str2, String str3, String str4, String str5, String str6, F2fDynamicStartPayEvent f2fDynamicStartPayEvent);

    /* renamed from: N7 */
    public final void mo97274N7(boolean z, Intent intent) {
        if (z) {
            String stringExtra = intent.getStringExtra("key_trans_id");
            if (Util.isNullOrNil(this.f204392p0)) {
                this.f204392p0 = stringExtra;
            }
            int i = this.f204389n;
            if (!(i == 33 || i == 32)) {
                C5061w0.m5169a(this.f204384f);
            }
            if (this.f204356P == 0.0d) {
                if (this.f204388j == 1) {
                    C115669n.INSTANCE.mo160131h(12689, 17, 1);
                } else {
                    C115669n.INSTANCE.mo160131h(12689, 8, 1);
                }
            }
            finish();
        } else if (C75157y0.m90140c(intent)) {
            finish();
            return;
        } else if (!C75157y0.m90141d(intent)) {
            if (this.f204388j == 1) {
                C115669n.INSTANCE.mo160131h(12689, 16, 1);
            } else {
                C115669n.INSTANCE.mo160131h(12689, 7, 1);
            }
        } else {
            return;
        }
        if (Util.isEqual(this.f204390o, 0)) {
            if (z) {
                this.f204376Z0 = 1;
            } else if (intent != null) {
                this.f204376Z0 = intent.getIntExtra("key_pay_reslut_type", 3);
                this.f204377a1 = this.f204382e;
                this.f204378b1 = this.f204349H;
                this.f204379c1 = this.f204352K;
                this.f204381d1 = this.f204392p0;
            } else {
                return;
            }
            Log.m105925i("MicroMsg.RemittanceBaseUI", "savePayInfoInReRemittanceUI() mLastPayResult:%s mlastTotalFee:%s mLastDesc:%s mLastAddress:%s mLastTransferId:%s", Integer.valueOf(this.f204376Z0), Double.valueOf(this.f204377a1), this.f204378b1, this.f204379c1, this.f204381d1);
        }
    }

    /* renamed from: O7 */
    public void mo97275O7() {
        boolean z;
        C10581n eg;
        C68097n Lo;
        String str;
        Class cls = C76979h.class;
        String z2 = C75228t.m90277z(C75228t.m90268r(this.f204384f), 10);
        if (!Util.isNullOrNil(this.f204361S)) {
            z2 = getString(C0966R.string.i0b, new Object[]{z2, this.f204361S});
        }
        int i = this.f204388j;
        if (i == 1) {
            z2 = getIntent().getStringExtra("receiver_tips");
            this.f204396t.setTextColor(getResources().getColor(C0966R.color.a7f));
            this.f204397u.setVisibility(0);
            if (Util.isNullOrNil(this.f204384f)) {
                str = getString(C0966R.string.i0e, new Object[]{this.f204361S});
            } else {
                str = getString(C0966R.string.i0d, new Object[]{C75228t.m90277z(C75228t.m90268r(this.f204384f), 10), this.f204361S});
            }
            this.f204397u.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, str, this.f204397u.getTextSize()));
        } else if (i == 6) {
            String stringExtra = getIntent().getStringExtra("receiver_tips");
            if (!Util.isNullOrNil(this.f204386h)) {
                z2 = this.f204386h;
            }
            if (Util.isNullOrNil(stringExtra)) {
                z2 = getString(C0966R.string.i0c, new Object[]{z2});
            } else {
                z2 = Util.safeFormatString(stringExtra, z2);
            }
        }
        this.f204396t.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, z2, this.f204396t.getTextSize()));
        if (!C86709a0.m107522a() || (eg = ((C76706g) C86312j.m106911c(C76706g.class)).mo106832eg()) == null || Util.isNullOrNil(this.f204384f) || ((Lo = ((C68098o) eg).mo93607Lo(this.f204384f)) != null && !Util.isNullOrNil(Lo.mo93597f()))) {
            z = false;
        } else {
            C31519v2.m39436a().mo55988e(this.f204384f, "", new C70643n(Util.nowMilliSecond()));
            z = true;
        }
        if (Util.isNullOrNil(this.f204384f) && !Util.isNullOrNil(this.f204385g)) {
            Log.m105925i("MicroMsg.RemittanceBaseUI", "use mRecvHeadimgurl(%s) to avatar, mReceiverAvatarIv:%s", this.f204385g, this.f204395s.getClass().getSimpleName());
            if (this.f204395s instanceof CdnImageView) {
                int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this, 44.0f);
                ((CdnImageView) this.f204395s).setRoundCorner(true);
                ((CdnImageView) this.f204395s).mo100288c(this.f204385g, fromDPToPix, fromDPToPix, C0966R.C0969drawable.bfa);
            }
        } else if (!z) {
            mo97282W7();
        }
    }

    /* renamed from: P7 */
    public final void mo97276P7(int i, int i2, String str) {
        WCPayLargeAmountTransferReportStruct wCPayLargeAmountTransferReportStruct = new WCPayLargeAmountTransferReportStruct();
        this.f204403y0 = wCPayLargeAmountTransferReportStruct;
        wCPayLargeAmountTransferReportStruct.f194676d = (long) i;
        wCPayLargeAmountTransferReportStruct.f194677e = (long) i2;
        wCPayLargeAmountTransferReportStruct.f194678f = wCPayLargeAmountTransferReportStruct.mo86045b("OrderId", str, true);
        this.f204403y0.mo86054n();
    }

    /* renamed from: Q7 */
    public void mo97277Q7() {
        Intent intent = new Intent();
        intent.putExtra("recent_remittance_contact_list", C5061w0.m5170b());
        intent.setClass(getContext(), SelectRemittanceContactUI.class);
        startActivityForResult(intent, 2);
    }

    /* renamed from: R7 */
    public final boolean mo97278R7(C70587h0 h0Var) {
        C67175a aVar = h0Var.f204112z;
        if (aVar == null || !aVar.mo91283a()) {
            return false;
        }
        this.f204370W0 = true;
        C67175a aVar2 = h0Var.f204112z;
        C76879j.m92707A(this, aVar2.f192844a, "", aVar2.f192846c, aVar2.f192845b, new C70627b(h0Var), new C70628c(this));
        return true;
    }

    /* renamed from: S7 */
    public abstract void mo97279S7();

    /* renamed from: T7 */
    public final boolean mo97280T7(C70587h0 h0Var) {
        boolean z;
        char c;
        int i;
        boolean z2;
        C70587h0 h0Var2 = h0Var;
        if (this.f204364T0 || Util.isNullOrNil(h0Var2.f204098i)) {
            z = false;
        } else {
            this.f204364T0 = true;
            mo97276P7(2, 1, h0Var2.f204074D);
            C76879j.m92707A(this, h0Var2.f204098i, getString(C0966R.string.a2d), getString(C0966R.string.i0h), getString(C0966R.string.f7926wf), new C70950u(this, h0Var2), new C70953v(this, h0Var2));
            z = true;
        }
        if (!z && !this.f204366U0) {
            if (h0Var2.f204094e > 0) {
                this.f204366U0 = true;
                C70587h0.C70589b bVar = h0Var2.f204095f;
                if (bVar != null) {
                    m83153U7(this, Util.isNullOrNil(bVar.f204115a) ? getString(C0966R.string.i2q, new Object[]{Integer.valueOf(h0Var2.f204094e)}) : h0Var2.f204095f.f204115a, "", getString(C0966R.string.i0h), Util.isNullOrNil(h0Var2.f204095f.f204116b) ? getString(C0966R.string.i2a) : h0Var2.f204095f.f204116b, new C70956w(this, h0Var2), new C70959x(this, h0Var2));
                } else {
                    Log.m105924i("MicroMsg.RemittanceBaseUI", "scene.zaituMessage == null");
                    m83153U7(this, getString(C0966R.string.i2q, new Object[]{Integer.valueOf(h0Var2.f204094e)}), getString(C0966R.string.a2d), getString(C0966R.string.i0h), getString(C0966R.string.i2a), new C70962y(this, h0Var2), new C70965z(this));
                }
                z = true;
            } else {
                z = false;
            }
        }
        if (z || this.f204368V0) {
            i = 2;
            c = 1;
        } else {
            if (h0Var2.f204102p) {
                this.f204368V0 = true;
                c = 1;
                i = 2;
                C70896i0.m83416c(this, this.f204388j, this.f204382e, h0Var2.f204104r / 100.0d, (String) null, h0Var2.f204103q / 100.0d, h0Var2.f204100n / 100.0d, h0Var2.f204101o, new C70867a0(this, h0Var2));
                z2 = true;
            } else {
                i = 2;
                c = 1;
                z2 = false;
            }
            z = z2;
        }
        if (!z && !this.f204370W0) {
            z = mo97278R7(h0Var);
        }
        boolean z3 = z;
        if (z3 || Util.isNullOrNil(h0Var2.f204072B) || Util.isNullOrNil(h0Var2.f204073C)) {
            return z3;
        }
        String z4 = C75228t.m90277z(C75228t.m90268r(this.f204384f), 10);
        if (!Util.isNullOrNil(this.f204386h)) {
            z4 = this.f204386h;
        }
        if (!Util.isNullOrNil(this.f204361S)) {
            Object[] objArr = new Object[i];
            objArr[0] = z4;
            objArr[c] = this.f204361S;
            z4 = getString(C0966R.string.i0b, objArr);
        }
        String str = h0Var2.f204093d;
        String str2 = h0Var2.f204073C;
        String str3 = h0Var2.f204072B;
        View inflate = LayoutInflater.from(this).inflate(C0966R.C0971layout.brw, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f359112ix3);
        ((TextView) inflate.findViewById(C0966R.C0970id.ix4)).setText(str2);
        textView.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, z4, textView.getTextSize()));
        Double valueOf = Double.valueOf(Util.getDouble(str3, 0.0d));
        Object[] objArr2 = new Object[i];
        objArr2[0] = C45121z0.m49962b();
        objArr2[c] = Double.valueOf(valueOf.doubleValue() / 100.0d);
        ((TextView) inflate.findViewById(C0966R.C0970id.f359111ix2)).setText(String.format("%s%.2f", objArr2));
        C77389a aVar = new C77389a();
        aVar.f225668y = false;
        aVar.f225644a = C0086a.m38a(this).getString(C0966R.string.f361205i34);
        aVar.f225627J = inflate;
        aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.i0h);
        aVar.f225664u = C0086a.m38a(this).getString(C0966R.string.atx);
        aVar.f225621D = new C70877c0(this);
        aVar.f225620C = new C70880d0(this, str, h0Var2);
        C77398g gVar = new C77398g(this, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        r1 = r6.f204087R;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0325  */
    /* renamed from: V7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo97281V7(java.lang.String r18, java.lang.String r19, java.lang.String r20, com.tencent.p014mm.plugin.remittance.model.C70587h0 r21) {
        /*
            r17 = this;
            r8 = r17
            r3 = r18
            r4 = r19
            r6 = r21
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            boolean r2 = r8.mKindaEnable
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r5 = 0
            r1[r5] = r2
            r2 = 1
            r1[r2] = r3
            java.lang.String r7 = "MicroMsg.RemittanceBaseUI"
            java.lang.String r9 = "startPay mKindaEnable %s reqKey %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r9, r1)
            int r1 = r6.f204086Q
            if (r1 != r2) goto L_0x0027
            te3.lu r1 = r6.f204087R
            if (r1 != 0) goto L_0x002f
        L_0x0027:
            te3.lu r1 = r6.f204087R
            if (r1 == 0) goto L_0x0031
            int r1 = r1.f227826h
            if (r1 <= 0) goto L_0x0031
        L_0x002f:
            r1 = 1
            goto L_0x0032
        L_0x0031:
            r1 = 0
        L_0x0032:
            if (r1 == 0) goto L_0x00c7
            te3.lu r12 = r6.f204087R
            int r1 = r12.f227826h
            if (r1 != 0) goto L_0x0053
            r8.f204372X0 = r12
            r8.f204358Q0 = r2
            com.tencent.mm.plugin.remittance.ui.k r9 = new com.tencent.mm.plugin.remittance.ui.k
            r9.<init>(r8)
            com.tencent.mm.plugin.remittance.ui.b0 r13 = new com.tencent.mm.plugin.remittance.ui.b0
            r13.<init>(r8)
            int r10 = r6.f204110x
            java.lang.String r11 = r6.f204088S
            java.lang.String r14 = ""
            r9.mo97569a(r10, r11, r12, r13, r14)
            goto L_0x00c6
        L_0x0053:
            if (r1 != r2) goto L_0x00ad
            com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct r0 = new com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct
            r0.<init>()
            double r1 = r6.f204111y
            int r1 = (int) r1
            long r1 = (long) r1
            r0.f194689f = r1
            java.lang.String r1 = r6.f204088S
            r0.mo93202s(r1)
            r1 = 4
            r0.f194687d = r1
            r0.mo86054n()
            te3.lu r0 = r6.f204087R
            java.lang.String r7 = r0.f227823e
            java.lang.String r9 = r0.f227822d
            android.content.res.Resources r0 = r17.getResources()
            r1 = 2131834814(0x7f1137be, float:1.9302749E38)
            java.lang.String r10 = r0.getString(r1)
            android.content.res.Resources r0 = r17.getResources()
            r1 = 2131834813(0x7f1137bd, float:1.9302747E38)
            java.lang.String r11 = r0.getString(r1)
            com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$g r12 = new com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$g
            r0 = r12
            r1 = r17
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r0.<init>(r2, r3, r4, r5)
            com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$h r13 = new com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$h
            r13.<init>(r8, r6)
            r14 = 2131101337(0x7f060699, float:1.781508E38)
            r0 = r17
            r1 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            nj3.C76879j.m92708B(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00c6
        L_0x00ad:
            if (r1 != r0) goto L_0x00c6
            java.lang.String r0 = r12.f227823e
            java.lang.String r1 = r12.f227822d
            android.content.res.Resources r2 = r17.getResources()
            r3 = 2131840199(0x7f114cc7, float:1.9313671E38)
            java.lang.String r2 = r2.getString(r3)
            com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$i r3 = new com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI$i
            r3.<init>(r8)
            nj3.C76879j.m92754y(r8, r0, r1, r2, r3)
        L_0x00c6:
            return
        L_0x00c7:
            boolean r1 = r8.f204358Q0
            if (r1 == 0) goto L_0x00e1
            com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.WCPayTrasnferCheckRealNameReportStruct
            r1.<init>()
            int r9 = r6.f204110x
            long r9 = (long) r9
            r1.f194689f = r9
            java.lang.String r9 = r6.f204088S
            r1.mo93202s(r9)
            r9 = 5
            r1.f194687d = r9
            r1.mo86054n()
        L_0x00e1:
            r8.f204358Q0 = r5
            int r1 = r8.f204389n
            r9 = 31
            if (r1 != r9) goto L_0x0153
            java.lang.String r1 = r8.f204357Q
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 == 0) goto L_0x00f8
            java.lang.String r1 = "msgxml is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            goto L_0x0153
        L_0x00f8:
            java.lang.String r1 = java.net.URLDecoder.decode(r1)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "helios:"
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r9)
            r9 = 0
            java.lang.String r10 = "msg"
            java.util.Map r9 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r1, r10, r9)
            java.lang.String r10 = ".msg.appmsg.wcpayinfo.transferid"
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 == 0) goto L_0x012d
            java.lang.String r1 = "paymsgid count't be null in appmsg"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r1)
            goto L_0x0153
        L_0x012d:
            oi2.f r10 = oi2.C77010f.vx0()
            com.tencent.mm.plugin.remittance.model.v0 r10 = r10.xx0()
            r10.getClass()
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r11 != 0) goto L_0x014b
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r11 == 0) goto L_0x0145
            goto L_0x014b
        L_0x0145:
            java.util.HashMap<java.lang.String, java.lang.String> r10 = r10.f204300b
            r10.put(r9, r1)
            goto L_0x0153
        L_0x014b:
            java.lang.String r1 = "MicroMsg.RemittanceLocalMsgMgr"
            java.lang.String r9 = "saveMsgContent param error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r9)
        L_0x0153:
            com.tencent.mm.pluginsdk.wallet.PayInfo r13 = new com.tencent.mm.pluginsdk.wallet.PayInfo
            r13.<init>()
            r13.f212592j = r3
            int r1 = r8.f204389n
            r13.f212587e = r1
            int r1 = r8.f204359R
            if (r1 <= 0) goto L_0x0164
            r13.f212589g = r1
        L_0x0164:
            int r1 = r8.f204388j
            r3 = 5
            if (r1 == r0) goto L_0x016e
            if (r1 != r3) goto L_0x016c
            goto L_0x016e
        L_0x016c:
            r1 = 0
            goto L_0x016f
        L_0x016e:
            r1 = 1
        L_0x016f:
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
            java.lang.String r10 = "extinfo_key_1"
            r9.putString(r10, r4)
            android.content.Intent r11 = r17.getIntent()
            java.lang.String r12 = "receiver_true_name"
            java.lang.String r11 = r11.getStringExtra(r12)
            java.lang.String r12 = "extinfo_key_2"
            r9.putString(r12, r11)
            java.lang.String r11 = r8.f204354M
            java.lang.String r14 = "extinfo_key_3"
            r9.putString(r14, r11)
            java.lang.String r11 = "extinfo_key_4"
            r9.putBoolean(r11, r1)
            android.content.Intent r1 = r17.getIntent()
            java.lang.String r11 = "receiver_tips"
            java.lang.String r1 = r1.getStringExtra(r11)
            java.lang.String r11 = "extinfo_key_5"
            r9.putString(r11, r1)
            android.content.Intent r1 = r17.getIntent()
            java.lang.String r11 = "payer_desc"
            java.lang.String r1 = r1.getStringExtra(r11)
            java.lang.String r11 = "extinfo_key_6"
            r9.putString(r11, r1)
            java.lang.String r1 = r8.f204349H
            java.lang.String r11 = "extinfo_key_7"
            r9.putString(r11, r1)
            android.content.Intent r1 = r17.getIntent()
            java.lang.String r11 = "rcvr_new_desc"
            java.lang.String r1 = r1.getStringExtra(r11)
            java.lang.String r11 = "extinfo_key_8"
            r9.putString(r11, r1)
            java.lang.String r1 = r8.f204392p0
            java.lang.String r11 = "extinfo_key_16"
            r9.putString(r11, r1)
            java.lang.String r1 = r6.f204083M
            java.lang.String r11 = "extinfo_key_19"
            r9.putString(r11, r1)
            int r1 = r8.f204388j
            if (r1 != r2) goto L_0x020b
            java.lang.String r1 = r6.f204106t
            java.lang.String r11 = "extinfo_key_11"
            r9.putString(r11, r1)
            int r1 = r6.f204077G
            java.lang.String r11 = "extinfo_key_12"
            r9.putInt(r11, r1)
            java.lang.String r1 = r6.f204078H
            java.lang.String r11 = "extinfo_key_13"
            r9.putString(r11, r1)
            java.lang.String r1 = r6.f204079I
            java.lang.String r11 = "extinfo_key_14"
            r9.putString(r11, r1)
            java.lang.String r1 = r6.f204081K
            java.lang.String r11 = "extinfo_key_17"
            r9.putString(r11, r1)
            java.lang.String r1 = r6.f204082L
            java.lang.String r11 = "extinfo_key_18"
            r9.putString(r11, r1)
            int r1 = r6.f204080J
            goto L_0x020c
        L_0x020b:
            r1 = 0
        L_0x020c:
            int r11 = r6.f204110x
            java.lang.String r14 = "extinfo_key_15"
            r9.putInt(r14, r11)
            r13.f212600u = r9
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            r9[r5] = r11
            java.lang.String r11 = "dynamic code flag: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r11, r9)
            if (r1 != r2) goto L_0x0289
            java.lang.Class<com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI> r1 = com.tencent.p014mm.plugin.remittance.p098ui.RemittanceF2fDynamicCodeUI.class
            r15.setClass(r8, r1)
            java.lang.String r1 = "key_pay_info"
            r15.putExtra(r1, r13)
            java.lang.String r1 = r8.f204371X
            java.lang.String r4 = "key_rcvr_open_id"
            r15.putExtra(r4, r1)
            java.lang.String r1 = r8.f204387i
            java.lang.String r4 = "key_mch_info"
            r15.putExtra(r4, r1)
            java.lang.String r1 = "from_patch_ui"
            r15.putExtra(r1, r2)
            java.lang.String r1 = r6.f204081K
            java.lang.String r4 = "get_dynamic_code_sign"
            r15.putExtra(r4, r1)
            java.lang.String r1 = r6.f204082L
            java.lang.String r4 = "get_dynamic_code_extend"
            r15.putExtra(r4, r1)
            java.lang.String r1 = r6.f204084N
            java.lang.String r4 = "dynamic_code_spam_wording"
            r15.putExtra(r4, r1)
            java.lang.String r1 = r6.f204083M
            java.lang.String r4 = "show_paying_wording"
            r15.putExtra(r4, r1)
            java.lang.String r1 = r8.f204391p
            java.lang.String r4 = "key_transfer_qrcode_id"
            r15.putExtra(r4, r1)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 15386(0x3c1a, float:2.156E-41)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6[r2] = r0
            r1.mo160131h(r4, r6)
            com.tencent.mm.sdk.event.IListener r0 = r8.f204374Y0
            r0.alive()
            r8.startActivityForResult((android.content.Intent) r15, (int) r3)
            goto L_0x037f
        L_0x0289:
            boolean r0 = r8.mKindaEnable
            if (r0 == 0) goto L_0x0353
            r0 = 2131839577(0x7f114a59, float:1.931241E38)
            java.lang.String r0 = r8.getString(r0)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r19)
            java.lang.String r3 = ""
            if (r1 != 0) goto L_0x0319
            f40.C86709a0.m107528h()
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            f62.k0 r1 = (f62.C75700k0) r1
            com.tencent.mm.storage.u3 r1 = r1.mo96097Ni()
            com.tencent.mm.storage.z1 r1 = r1.mo69664N2(r4)
            if (r1 == 0) goto L_0x0301
            java.lang.String r1 = r1.mo62898f()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90276y(r1)
            r6.append(r7)
            java.lang.String r7 = r8.f204361S
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x02ca
            goto L_0x02e2
        L_0x02ca:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "("
            r3.append(r7)
            java.lang.String r7 = r8.f204361S
            r3.append(r7)
            java.lang.String r7 = ")"
            r3.append(r7)
            java.lang.String r3 = r3.toString()
        L_0x02e2:
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r5] = r3
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.safeFormatString(r0, r6)
            r6 = 2131834795(0x7f1137ab, float:1.930271E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90276y(r1)
            r2[r5] = r1
            java.lang.String r1 = r8.getString(r6, r2)
            goto L_0x0321
        L_0x0301:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "can not found contact for user::"
            r0.append(r1)
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            goto L_0x031f
        L_0x0319:
            java.lang.String r0 = "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
        L_0x031f:
            r0 = r3
            r1 = r0
        L_0x0321:
            android.os.Bundle r2 = r13.f212600u
            if (r2 != 0) goto L_0x032c
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r13.f212600u = r2
        L_0x032c:
            android.os.Bundle r2 = r13.f212600u
            r2.putString(r10, r4)
            java.lang.String r4 = r8.f204361S
            r2.putString(r12, r4)
            java.lang.String r4 = "cashier_desc"
            r2.putString(r4, r0)
            java.lang.String r0 = "prepay_page_payee"
            r2.putString(r0, r3)
            java.lang.String r0 = "succ_tip"
            r2.putString(r0, r1)
            java.lang.Class<ie3.c> r0 = ie3.C76324c.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ie3.c r0 = (ie3.C76324c) r0
            r0.startSNSPay(r8, r13)
            goto L_0x037f
        L_0x0353:
            r17.hideLoading()
            q43.a r0 = r8.f204380d
            q43.C77302a.m93125e(r0, r15)
            com.tencent.mm.autogen.events.F2fDynamicStartPayEvent r0 = r6.f204085P
            if (r0 == 0) goto L_0x0372
            com.tencent.mm.autogen.events.F2fDynamicStartPayEvent$a r0 = r0.f193584d
            android.app.Activity r10 = r0.f193588d
            if (r10 == 0) goto L_0x0372
            r11 = 0
            int r0 = r0.f193586b
            java.lang.String r12 = ""
            r14 = r20
            r16 = r0
            ie3.C76331i.m91762f(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x037f
        L_0x0372:
            r1 = 0
            r6 = 1
            java.lang.String r2 = ""
            r0 = r17
            r3 = r13
            r4 = r20
            r5 = r15
            ie3.C76331i.m91762f(r0, r1, r2, r3, r4, r5, r6)
        L_0x037f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBaseUI.mo97281V7(java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.plugin.remittance.model.h0):void");
    }

    /* renamed from: W7 */
    public final void mo97282W7() {
        C70644o oVar = new C70644o();
        if (MMHandlerThread.isMainThread()) {
            oVar.run();
        } else {
            MMHandlerThread.postToMainThread(new C70645p(this, oVar));
        }
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        Log.m105924i("MicroMsg.RemittanceBaseUI", "onGet");
        if (Util.nullAsNil(str).length() <= 0) {
            Log.m105920e("MicroMsg.RemittanceBaseUI", "notifyChanged: user = " + str);
        } else if (str.equals(this.f204384f)) {
            mo97282W7();
        }
    }

    /* renamed from: X7 */
    public abstract void mo97283X7();

    /* renamed from: Y7 */
    public final void mo97284Y7() {
        int i = this.f204388j;
        if (!(i == 0 || i == 2) || Util.isNullOrNil(this.f204365U) || this.f204369W == 0 || this.f204367V != 1) {
            removeAllOptionMenu();
        } else {
            addIconOptionMenu(0, C0966R.C0969drawable.cf_, new C70642m());
        }
    }

    /* renamed from: Z7 */
    public final void mo97285Z7() {
        int i;
        if (Util.isNullOrNil(this.f204363T) || (i = this.f204369W) == 0) {
            this.f204398v.setText("");
            this.f204398v.setVisibility(8);
            return;
        }
        int i2 = i == 1 ? 2 : 24;
        try {
            this.f204398v.setText(String.format(this.f204363T, new Object[]{Integer.valueOf(i2)}));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.RemittanceBaseUI", e, "", new Object[0]);
            this.f204398v.setText(getString(C0966R.string.f361197i21, new Object[]{Integer.valueOf(i2)}));
        }
        this.f204398v.setVisibility(0);
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        int i = this.f204389n;
        if (i == 33 || i == 32) {
            return C0966R.C0971layout.brp;
        }
        if (!Util.isEqual(this.f204390o, 0)) {
            return C0966R.C0971layout.bro;
        }
        hideActionbarLine();
        return C0966R.C0971layout.brs;
    }

    public void initView() {
        int i = this.f204389n;
        if (i == 33 || i == 32) {
            setMMTitle((int) C0966R.string.i05);
        } else {
            setMMTitle((int) C0966R.string.i3a);
        }
        setBackBtn(new C70629d());
        this.mKeyboard = (MyKeyboardWindow) findViewById(C0966R.C0970id.f359361kh3);
        this.mKBLayout = findViewById(C0966R.C0970id.f359359kh1);
        this.f204343B = (ScrollView) findViewById(C0966R.C0970id.iwq);
        this.f204395s = (ImageView) findViewById(C0966R.C0970id.ing);
        this.f204396t = (TextView) findViewById(C0966R.C0970id.inh);
        TextView textView = (TextView) findViewById(C0966R.C0970id.ini);
        this.f204397u = textView;
        textView.setVisibility(8);
        this.f204345D = (LinearLayout) findViewById(C0966R.C0970id.imt);
        this.f204344C = (LinearLayout) findViewById(C0966R.C0970id.imy);
        this.f204404z = (TextView) findViewById(C0966R.C0970id.imw);
        this.f204342A = (TextView) findViewById(C0966R.C0970id.imx);
        this.f204402y = (TextView) findViewById(C0966R.C0970id.imv);
        if (Util.isEqual(this.f204390o, 0)) {
            this.f204346E = (LinearLayout) findViewById(C0966R.C0970id.il_);
            this.f204347F = (TextView) findViewById(C0966R.C0970id.h_c);
            this.f204348G = (TextView) findViewById(C0966R.C0970id.f5618jz);
        }
        mo97275O7();
        WalletFormView walletFormView = (WalletFormView) findViewById(C0966R.C0970id.gym);
        this.f204394r = walletFormView;
        if (this.f204389n == 33) {
            this.f204404z.setText(C75228t.m90260n(this.f204382e));
            this.f204342A.setText(C45121z0.m49962b());
            String stringExtra = getIntent().getStringExtra("desc");
            this.f204354M = stringExtra;
            if (!Util.isNullOrNil(stringExtra)) {
                this.f204402y.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(getContext(), this.f204354M, this.f204402y.getTextSize()));
                this.f204402y.setVisibility(0);
            } else {
                this.f204402y.setVisibility(8);
            }
            this.f204344C.setVisibility(0);
            this.f204345D.setVisibility(8);
        } else {
            walletFormView.setOnClickListener(new C70885e0(this));
            this.f204394r.getTitleTv().setText(String.format(getString(C0966R.string.i1s), new Object[]{"¥"}));
            this.f204394r.mo105069a(new C70944s(this));
            setEditFocusListener(this.f204394r, 2, false);
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.hwo);
            View findViewById = findViewById(C0966R.C0970id.in8);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI", "initFeeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI", "initFeeView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f204344C.setVisibility(8);
            this.f204345D.setVisibility(0);
            setTenpayKBStateListener(new C70948t(this));
        }
        Button button = (Button) findViewById(C0966R.C0970id.hfe);
        this.f204393q = button;
        button.setOnClickListener(new C70636j());
        this.f204399w = (TextView) findViewById(C0966R.C0970id.f359066im2);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.f5597je);
        this.f204400x = textView3;
        int i2 = this.f204388j;
        if (i2 == 1 || i2 == 6) {
            textView3.setText(C0966R.string.hzm);
        } else {
            textView3.setText(C0966R.string.hzl);
        }
        if (!C75592q0.m90763K()) {
            findViewById(C0966R.C0970id.f359067im3).setOnClickListener(new C70637k());
        }
        if (this.f204388j == 1) {
            C86709a0.m107528h();
            if (((String) C86709a0.m107535s().mo121142i().mo119684e(327732, "0")).equals("0")) {
                C76879j.m92742m(getContext(), C0966R.string.i1v, C0966R.string.i1w, new C70641l(this));
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119676J(327732, "1");
                C86709a0.m107528h();
                C86709a0.m107535s().mo121142i().mo119681a(true);
            }
        }
        this.f204398v = (TextView) findViewById(C0966R.C0970id.hwo);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.in8);
        mo97285Z7();
        mo97283X7();
        mo97284Y7();
    }

    public boolean needLockPage() {
        int i = this.f204389n;
        return i == 33 || i == 32;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        Log.m105924i("MicroMsg.RemittanceBaseUI", "reqcode=" + i3 + ", resultCode=" + i4 + ", username=" + Util.nullAs(this.f204384f, "null") + ", =" + Util.nullAs(this.f204386h, "null"));
        boolean z = true;
        if (i3 == 1) {
            Intent intent3 = intent2;
            if (i4 != -1) {
                z = false;
            }
            mo97274N7(z, intent3);
        } else if (i3 == 2) {
            Intent intent4 = intent2;
            if (i4 != -1 || intent4 == null) {
                finish();
            } else {
                String stringExtra = intent4.getStringExtra("Select_Conv_User");
                if (!Util.isNullOrNil(stringExtra)) {
                    this.f204384f = stringExtra;
                    mo97275O7();
                } else {
                    finish();
                }
            }
        } else if (i3 == 5) {
            Intent intent5 = intent;
            if (i4 != -1) {
                z = false;
            }
            mo97274N7(z, intent5);
        } else if (i3 != 6) {
            int i5 = i4;
            Intent intent6 = intent2;
        } else {
            if (i4 == -1 && intent2 != null) {
                hideTenpayKB();
                String string = getString(C0966R.string.f360162ai2);
                String string2 = getString(C0966R.string.i0k);
                String stringExtra2 = intent2.getStringExtra("userName");
                String stringExtra3 = intent2.getStringExtra("telNumber");
                String str = intent2.getStringExtra("proviceFirstStageName") + intent2.getStringExtra("addressCitySecondStageName") + intent2.getStringExtra("addressCountiesThirdStageName") + intent2.getStringExtra("addressDetailInfo");
                String str2 = this.f204349H;
                C70630e eVar = new C70630e();
                C70631f fVar = new C70631f();
                if (!isFinishing()) {
                    C77426q qVar = new C77426q(this);
                    qVar.mo107589a(true);
                    qVar.mo107597i(fVar);
                    qVar.mo107606r(string);
                    View inflate = View.inflate(this, C0966R.C0971layout.cdh, (ViewGroup) null);
                    EditText editText = (EditText) inflate.findViewById(C0966R.C0970id.cd7);
                    if (!Util.isNullOrNil(str2)) {
                        editText.append(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, str2, editText.getTextSize()));
                    }
                    if (!Util.isNullOrNil(string2)) {
                        editText.setHint(string2);
                    }
                    LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.f5581iz);
                    LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0966R.C0970id.f5620k1);
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.h_c);
                    TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.f5618jz);
                    ((ImageView) inflate.findViewById(C0966R.C0970id.f5580iy)).getDrawable().setColorFilter(-15970418, PorterDuff.Mode.SRC_ATOP);
                    ((TextView) inflate.findViewById(C0966R.C0970id.f5621k2)).setText(MMApplicationContext.getContext().getString(C0966R.string.hzk));
                    linearLayout.setOnClickListener(new C59372b(eVar, editText, this, qVar));
                    linearLayout.setVisibility(8);
                    linearLayout2.setVisibility(0);
                    textView.setText(stringExtra2 + "  " + stringExtra3);
                    textView2.setText(str);
                    EditText editText2 = editText;
                    View view = inflate;
                    TextView textView3 = textView2;
                    TextView textView4 = textView;
                    C77426q qVar2 = qVar;
                    inflate.findViewById(C0966R.C0970id.clt).setOnClickListener(new C59373c(eVar, editText2, stringExtra2, stringExtra3, textView3, this, qVar2));
                    TextView textView5 = textView3;
                    view.findViewById(C0966R.C0970id.c19).setOnClickListener(new C8236d(linearLayout, linearLayout2, textView4, textView5));
                    C77426q qVar3 = qVar2;
                    qVar3.mo107601m(C0966R.string.a18);
                    qVar3.mo107600l(new C59374e(this, eVar, textView4, editText2, stringExtra2, stringExtra3, textView5));
                    C77382c b = C77382c.m93286b(editText2);
                    b.f225611e = 0;
                    b.f225610d = 20;
                    b.mo107499d((C77382c.C77383a) null);
                    qVar3.mo107592d(view);
                    qVar3.mo107603o();
                    qVar3.f225839c.getContentView().post(new C8237f(false, textView5, this));
                    MMHandlerThread.postToMainThread(new C8238g(this, editText2));
                    int i6 = i2;
                    Intent intent7 = intent;
                }
            }
            int i64 = i2;
            Intent intent72 = intent;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        this.f204388j = getIntent().getIntExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f204389n = getIntent().getIntExtra("pay_scene", 31);
        int i = this.f204388j;
        if (!(i == 0 || i == 2)) {
            String uuid = UUID.randomUUID().toString();
            this.f204360R0 = uuid;
            C67342b.m79685d(uuid);
        }
        if (this instanceof RemittanceHKUI) {
            this.f204390o = 1;
        } else if (this instanceof RemittanceOSUI) {
            this.f204390o = 2;
        }
        super.onCreate(bundle);
        this.f204380d = C77302a.m93124d(getIntent());
        this.f204391p = getIntent().getStringExtra("scan_remittance_id");
        this.f204382e = getIntent().getDoubleExtra("fee", 0.0d);
        this.f204384f = getIntent().getStringExtra("receiver_name");
        this.f204385g = getIntent().getStringExtra("recv_headimgurl");
        this.f204386h = getIntent().getStringExtra("receiver_nick_name");
        this.f204361S = getIntent().getStringExtra("receiver_true_name");
        getIntent().getStringExtra("mch_name");
        this.f204387i = getIntent().getStringExtra("mch_info");
        this.f204359R = getIntent().getIntExtra("pay_channel", 0);
        this.f204371X = Util.nullAs(getIntent().getStringExtra("rcvr_open_id"), "");
        Log.m105925i("MicroMsg.RemittanceBaseUI", "mUserName %s", this.f204384f);
        C86709a0.m107528h();
        long longValue = ((Long) C86709a0.m107535s().mo121142i().mo119684e(147457, 0L)).longValue();
        if ((16 & longValue) != 0) {
            this.f204369W = 1;
        } else if ((longValue & 32) != 0) {
            this.f204369W = 2;
        } else {
            this.f204369W = 0;
        }
        mo97271K7();
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93557b(this);
        initView();
        this.f204383e1.alive();
        C79144b.m95773a().getClass();
        this.mKindaEnable = true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f204362S0.dead();
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93567p(this);
        this.f204383e1.dead();
        this.f204374Y0.dead();
        C67342b.m79684c(this.f204360R0);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        C117747y yVar2 = yVar;
        String str2 = "";
        if (i != 0 || i3 != 0) {
            if (yVar2 instanceof C78348k0) {
                Log.m105924i("MicroMsg.RemittanceBaseUI", "net error, use hardcode wording");
                this.f204398v.setText(str2);
                this.f204398v.setVisibility(8);
            } else if (yVar2 instanceof C70587h0) {
                if (this.mKindaEnable) {
                    hideLoading();
                }
                C70587h0 h0Var = (C70587h0) yVar2;
                this.f204401x0 = h0Var;
                this.f204362S0.alive();
                C75155x0.m90137c(this.f204389n, str2, i3);
                if (mo97278R7(h0Var)) {
                    return true;
                }
            }
            return false;
        } else if (yVar2 instanceof C70587h0) {
            C70587h0 h0Var2 = (C70587h0) yVar2;
            C75155x0.m90137c(this.f204389n, h0Var2.f204093d, i3);
            this.f204357Q = h0Var2.f204099j;
            if (!Util.isNullOrNil(h0Var2.f204105s)) {
                this.f204361S = h0Var2.f204105s;
            }
            int i4 = this.f204389n;
            if (i4 == 32 || i4 == 33) {
                this.f204392p0 = h0Var2.f204107u;
            } else {
                this.f204392p0 = h0Var2.f204074D;
            }
            C77302a aVar = this.f204380d;
            if (aVar != null) {
                aVar.mo107447b(10000, Integer.valueOf(i4), this.f204384f, Double.valueOf(h0Var2.f204111y));
            }
            C77965lu luVar = h0Var2.f204087R;
            if (luVar != null) {
                str2 = Util.isNullOrNil(luVar.f227825g) ? this.f204373Y : h0Var2.f204087R.f227825g;
            }
            this.f204373Y = str2;
            if (!mo97280T7(h0Var2)) {
                mo97281V7(h0Var2.f204093d, this.f204384f, this.f204361S, h0Var2);
            } else if (this.mKindaEnable) {
                hideLoading();
            }
            ((HashMap) this.f204375Z).put(h0Var2.f204093d, new C70646q(h0Var2.f204106t, h0Var2.f204107u, h0Var2.f204108v, h0Var2.f204109w, h0Var2.f204110x, h0Var2.f204074D, h0Var2.f204075E, h0Var2.f204076F, Util.getLong(h0Var2.f204072B, 0)));
            return true;
        } else if (yVar2 instanceof C78347j0) {
            C78347j0 j0Var = (C78347j0) yVar2;
            if (!Util.isNullOrNil(j0Var.f229582d)) {
                ((TextView) findViewById(C0966R.C0970id.iny)).setText(j0Var.f229582d);
                View findViewById = findViewById(C0966R.C0970id.kmb);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceBaseUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setOnClickListener(new C70626a());
            }
            this.f204355N = j0Var.f229583e;
            double d = j0Var.f229584f;
            this.f204356P = d;
            if (d != 0.0d) {
                return true;
            }
            if (this.f204388j == 1) {
                C115669n.INSTANCE.mo160131h(12689, 14, 1);
                return true;
            }
            C115669n.INSTANCE.mo160131h(12689, 5, 1);
            return true;
        } else if (!(yVar2 instanceof C78348k0)) {
            return true;
        } else {
            C78348k0 k0Var = (C78348k0) yVar2;
            this.f204363T = k0Var.f229585d;
            this.f204365U = k0Var.f229590i;
            this.f204367V = k0Var.f229591j;
            mo97285Z7();
            mo97284Y7();
            return true;
        }
    }
}
