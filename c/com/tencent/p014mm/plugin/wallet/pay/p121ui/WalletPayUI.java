package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import a63.C67008a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import b53.C67153a;
import b53.C67154b;
import b63.C67185g;
import c53.C67341a;
import c53.C67342b;
import c53.C67344d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.WalletCloseProgressEvent;
import com.tencent.p014mm.autogen.events.WalletPayOrdersEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyMoreEvent;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.pay.p121ui.C71950a;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.Authen;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72379f1;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72394l;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72404n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDetailItemLayout;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.p014mm.wallet_core.model.C75124l;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.model.JumpRemind;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.MMScrollView;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import d53.C75326b;
import di3.C86312j;
import e53.C20511b;
import f40.C86709a0;
import f53.C75682a;
import f53.C75683b;
import f53.C75684c;
import f53.C75685d;
import f53.C75686e;
import f53.C75687f;
import f53.C75688g;
import f53.C75689h;
import f53.C75690i;
import f53.C75691j;
import f53.C75692k;
import f62.C75700k0;
import f63.C75717e;
import f63.C75718f;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import q43.C77302a;
import tt1.C78101i;
import vt1.C78473a;
import y43.C79028b;
import y43.C79029b0;
import y43.C79030d0;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI */
public class WalletPayUI extends WalletBaseUI implements C71950a.C71952b {

    /* renamed from: Y0 */
    public static boolean f208614Y0;

    /* renamed from: Z0 */
    public static List<C71923d0> f208615Z0 = new ArrayList();

    /* renamed from: A */
    public TextView f208616A;

    /* renamed from: B */
    public TextView f208617B;

    /* renamed from: C */
    public TextView f208618C;

    /* renamed from: D */
    public TextView f208619D;

    /* renamed from: E */
    public TextView f208620E;

    /* renamed from: F */
    public TextView f208621F;

    /* renamed from: G */
    public ImageView f208622G;

    /* renamed from: H */
    public TextView f208623H;

    /* renamed from: I */
    public TextView f208624I;

    /* renamed from: J */
    public LinearLayout f208625J;

    /* renamed from: K */
    public C71921c0 f208626K;

    /* renamed from: L */
    public Dialog f208627L;

    /* renamed from: M */
    public C72404n f208628M;

    /* renamed from: N */
    public C71950a f208629N;

    /* renamed from: P */
    public long f208630P = 0;

    /* renamed from: Q */
    public TextView f208631Q;

    /* renamed from: Q0 */
    public boolean f208632Q0 = false;

    /* renamed from: R */
    public LinearLayout f208633R;

    /* renamed from: R0 */
    public C67344d f208634R0 = null;

    /* renamed from: S */
    public boolean f208635S = true;

    /* renamed from: S0 */
    public int f208636S0 = 0;

    /* renamed from: T */
    public boolean f208637T = false;

    /* renamed from: T0 */
    public Runnable f208638T0 = new C71930k();

    /* renamed from: U */
    public boolean f208639U = false;

    /* renamed from: U0 */
    public C71923d0 f208640U0;

    /* renamed from: V */
    public String f208641V;

    /* renamed from: V0 */
    public long f208642V0 = 0;

    /* renamed from: W */
    public boolean f208643W = false;

    /* renamed from: W0 */
    public IListener f208644W0 = new IListener<WalletRealNameResultNotifyMoreEvent>(C40008f.f107254d) {
        {
            this.__eventId = 586120621;
        }

        public boolean callback(IEvent iEvent) {
            WalletRealNameResultNotifyMoreEvent walletRealNameResultNotifyMoreEvent = (WalletRealNameResultNotifyMoreEvent) iEvent;
            Log.m105925i(WalletPayUI.this.f208649d, "WalletRealNameResultNotifyMoreEvent %s", Integer.valueOf(walletRealNameResultNotifyMoreEvent.f9605d.f9606a));
            if (walletRealNameResultNotifyMoreEvent.f9605d.f9606a == -1) {
                WalletPayUI walletPayUI = WalletPayUI.this;
                walletPayUI.f208670y0 = true;
                walletPayUI.f208632Q0 = true;
                walletPayUI.mo99120P7();
            }
            return false;
        }
    };

    /* renamed from: X */
    public int f208645X = -1;

    /* renamed from: X0 */
    public boolean f208646X0 = false;

    /* renamed from: Y */
    public boolean f208647Y = false;

    /* renamed from: Z */
    public boolean f208648Z = false;

    /* renamed from: d */
    public String f208649d = "MicroMsg.WalletPayUI";

    /* renamed from: e */
    public Orders f208650e = null;

    /* renamed from: f */
    public C75687f f208651f = null;

    /* renamed from: g */
    public int f208652g = 0;

    /* renamed from: h */
    public String f208653h = null;

    /* renamed from: i */
    public ArrayList<Bankcard> f208654i = null;

    /* renamed from: j */
    public Bankcard f208655j = null;

    /* renamed from: n */
    public FavorPayInfo f208656n = null;

    /* renamed from: o */
    public C72394l f208657o = null;

    /* renamed from: p */
    public boolean f208658p = false;

    /* renamed from: p0 */
    public C75687f f208659p0;

    /* renamed from: q */
    public boolean f208660q = false;

    /* renamed from: r */
    public boolean f208661r = false;

    /* renamed from: s */
    public C79148e.C79149a f208662s;

    /* renamed from: t */
    public boolean f208663t = false;

    /* renamed from: u */
    public String f208664u = "";

    /* renamed from: v */
    public PayInfo f208665v = null;

    /* renamed from: w */
    public boolean f208666w = false;

    /* renamed from: x */
    public Bundle f208667x = null;

    /* renamed from: x0 */
    public C77302a f208668x0 = null;

    /* renamed from: y */
    public boolean f208669y = false;

    /* renamed from: y0 */
    public boolean f208670y0 = false;

    /* renamed from: z */
    public Button f208671z;

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$b */
    public class C5759b implements View.OnClickListener {
        public C5759b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletPayUI.this.mo99115K7(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$a */
    public class C71917a implements View.OnClickListener {
        public C71917a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C79029b0.vx0().wx0().mo91342x()) {
                PayInfo payInfo = WalletPayUI.this.f208665v;
                C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 6, "");
            }
            WalletPayUI walletPayUI = WalletPayUI.this;
            if (walletPayUI.f208650e.f209544P == 1) {
                if (C79029b0.vx0().wx0().mo91342x()) {
                    PayInfo payInfo2 = WalletPayUI.this.f208665v;
                    C75155x0.m90135a(payInfo2 == null ? 0 : payInfo2.f212587e, payInfo2 == null ? "" : payInfo2.f212592j, 5, "");
                }
                WalletPayUI walletPayUI2 = WalletPayUI.this;
                walletPayUI2.getClass();
                Bundle bundle = new Bundle();
                Orders orders = walletPayUI2.f208650e;
                if (orders != null) {
                    bundle.putString("key_reqKey", orders.f209563e);
                    List<Orders.Commodity> list = walletPayUI2.f208650e.f209542M;
                    if (list != null && ((ArrayList) list).size() > 0) {
                        bundle.putString("key_TransId", ((Orders.Commodity) ((ArrayList) walletPayUI2.f208650e.f209542M).get(0)).f209606r);
                    }
                    bundle.putLong("key_SessionId", walletPayUI2.f208630P);
                }
                PayInfo payInfo3 = walletPayUI2.f208665v;
                if (payInfo3 != null) {
                    bundle.putInt("key_scene", payInfo3.f212587e);
                }
                PayInfo payInfo4 = walletPayUI2.f208665v;
                if (payInfo4 == null || payInfo4.f212587e != 11) {
                    bundle.putInt("key_bind_scene", 0);
                } else {
                    bundle.putInt("key_bind_scene", 13);
                }
                bundle.putBoolean("key_need_bind_response", true);
                bundle.putInt("key_req_bind_scene", 0);
                bundle.putBoolean("key_is_bind_bankcard", true);
                bundle.putBoolean("key_is_oversea", !walletPayUI2.mo99126V7());
                C79143a.m95771j(walletPayUI2, C67153a.class, bundle, (C79148e.C79149a) null);
            } else {
                Log.m105924i(walletPayUI.f208649d, "SimpleReg , assigned userinfo pay! payWithNewBankcard");
                if (C79029b0.vx0().wx0().mo91342x()) {
                    PayInfo payInfo5 = WalletPayUI.this.f208665v;
                    C75155x0.m90135a(payInfo5 == null ? 0 : payInfo5.f212587e, payInfo5 == null ? "" : payInfo5.f212592j, 5, "");
                }
                WalletPayUI.this.mo99130Z7(false, 0, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$a0 */
    public class C71918a0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CheckedTextView f208674d;

        /* renamed from: e */
        public final /* synthetic */ CheckedTextView f208675e;

        public C71918a0(CheckedTextView checkedTextView, CheckedTextView checkedTextView2) {
            this.f208674d = checkedTextView;
            this.f208675e = checkedTextView2;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f208674d.setChecked(true);
            this.f208675e.setChecked(false);
            WalletPayUI walletPayUI = WalletPayUI.this;
            walletPayUI.f208635S = false;
            walletPayUI.mo99136f8();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$b0 */
    public class C71919b0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CheckedTextView f208677d;

        /* renamed from: e */
        public final /* synthetic */ CheckedTextView f208678e;

        public C71919b0(CheckedTextView checkedTextView, CheckedTextView checkedTextView2) {
            this.f208677d = checkedTextView;
            this.f208678e = checkedTextView2;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f208677d.setChecked(false);
            this.f208678e.setChecked(true);
            WalletPayUI walletPayUI = WalletPayUI.this;
            walletPayUI.f208635S = true;
            walletPayUI.mo99136f8();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$c */
    public class C71920c implements DialogInterface.OnClickListener {
        public C71920c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Orders orders;
            List<Orders.Commodity> list;
            Log.m105924i(WalletPayUI.this.f208649d, "click continue pay");
            WalletPayUI walletPayUI = WalletPayUI.this;
            if (!(walletPayUI.f208665v == null || (orders = walletPayUI.f208650e) == null || (list = orders.f209542M) == null || ((ArrayList) list).size() <= 0)) {
                if (WalletPayUI.this.f208665v.f212587e == 8) {
                    C115669n.INSTANCE.mo160131h(15368, 2, 2, 3, ((Orders.Commodity) ((ArrayList) WalletPayUI.this.f208650e.f209542M).get(0)).f209606r);
                } else {
                    C115669n.INSTANCE.mo160131h(15368, 1, 2, 3, ((Orders.Commodity) ((ArrayList) WalletPayUI.this.f208650e.f209542M).get(0)).f209606r);
                }
            }
            WalletPayUI.this.mo99118N7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$c0 */
    public class C71921c0 {
        public C71921c0() {
        }

        /* renamed from: a */
        public void mo99144a() {
            int i;
            WalletPayUI.this.f208625J.removeAllViews();
            WalletPayUI walletPayUI = WalletPayUI.this;
            int i2 = walletPayUI.f208652g;
            if (i2 == 0) {
                i2 = 0;
            } else if (!walletPayUI.f208666w) {
                i2 = 1;
            }
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            for (int i3 = 0; i3 < i2; i3++) {
                View inflate = ((LayoutInflater) WalletPayUI.this.getSystemService("layout_inflater")).inflate(C0966R.C0971layout.cfw, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.lhz);
                TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.lil);
                Orders.Commodity commodity = (Orders.Commodity) ((ArrayList) WalletPayUI.this.f208650e.f209542M).get(i3);
                PayInfo payInfo = WalletPayUI.this.f208665v;
                String str = "";
                if (payInfo != null && ((i = payInfo.f212587e) == 32 || i == 33 || i == 31 || i == 48)) {
                    String string = payInfo.f212600u.getString("extinfo_key_1", str);
                    if (!Util.isNullOrNil(string)) {
                        C86709a0.m107528h();
                        C72996z1 N2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69664N2(string);
                        if (N2 != null) {
                            str = N2.mo62898f();
                        } else {
                            String str2 = WalletPayUI.this.f208649d;
                            Log.m105920e(str2, "can not found contact for user::" + string + str);
                        }
                    } else {
                        Log.m105920e(WalletPayUI.this.f208649d, "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                    }
                }
                if (commodity != null) {
                    if (!Util.isNullOrNil(str)) {
                        textView2.setText(str);
                        textView2.setVisibility(0);
                        ((TextView) inflate.findViewById(C0966R.C0970id.lim)).setVisibility(0);
                    } else if (!Util.isNullOrNil(commodity.f209598g)) {
                        textView2.setText(commodity.f209598g);
                        textView2.setVisibility(0);
                        ((TextView) inflate.findViewById(C0966R.C0970id.lim)).setVisibility(0);
                    } else {
                        ((TextView) inflate.findViewById(C0966R.C0970id.lim)).setVisibility(8);
                        textView2.setVisibility(8);
                    }
                    if (!Util.isNullOrNil(commodity.f209599h)) {
                        textView.setText(commodity.f209599h);
                        textView.setVisibility(8);
                        ((TextView) inflate.findViewById(C0966R.C0970id.f359556li1)).setVisibility(8);
                    } else {
                        ((TextView) inflate.findViewById(C0966R.C0970id.f359556li1)).setVisibility(8);
                        textView.setVisibility(8);
                    }
                    if (!Util.isNullOrNil(str) || !Util.isNullOrNil(commodity.f209598g)) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view = inflate;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        inflate.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view2 = inflate;
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        inflate.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$OrderInfoAdapter", "getView", "(I)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                inflate.setLayoutParams(layoutParams);
                inflate.measure(-2, -2);
                WalletPayUI.this.f208625J.addView(inflate);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d */
    public class C71922d implements DialogInterface.OnClickListener {
        public C71922d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Orders orders;
            List<Orders.Commodity> list;
            Log.m105924i(WalletPayUI.this.f208649d, "click cancel pay");
            WalletPayUI walletPayUI = WalletPayUI.this;
            if (!(walletPayUI.f208665v == null || (orders = walletPayUI.f208650e) == null || (list = orders.f209542M) == null || ((ArrayList) list).size() <= 0)) {
                if (WalletPayUI.this.f208665v.f212587e == 8) {
                    C115669n.INSTANCE.mo160131h(15368, 2, 2, 2, ((Orders.Commodity) ((ArrayList) WalletPayUI.this.f208650e.f209542M).get(0)).f209606r);
                } else {
                    C115669n.INSTANCE.mo160131h(15368, 1, 2, 2, ((Orders.Commodity) ((ArrayList) WalletPayUI.this.f208650e.f209542M).get(0)).f209606r);
                }
            }
            WalletPayUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d0 */
    public class C71923d0 {

        /* renamed from: a */
        public long f208683a;

        /* renamed from: b */
        public WeakReference<WalletPayUI> f208684b;

        /* renamed from: c */
        public int f208685c;

        public C71923d0(WalletPayUI walletPayUI, C71930k kVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$e */
    public class C71924e implements DialogInterface.OnClickListener {
        public C71924e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletPayUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$f */
    public class C71925f implements WcPayCashierDialog.C72356i {
        public C71925f() {
        }

        /* renamed from: a */
        public void mo98829a() {
            Log.m105924i(WalletPayUI.this.f208649d, "click add new bankcard");
            C67185g a = C67185g.m79463a();
            if (a.mo91288b()) {
                C76879j.m92748s(WalletPayUI.this.getContext(), a.f192891b, WalletPayUI.this.getString(C0966R.string.a3h));
                return;
            }
            PayInfo payInfo = WalletPayUI.this.f208665v;
            C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 14, "");
            WalletPayUI.this.f208627L.dismiss();
            WalletPayUI walletPayUI = WalletPayUI.this;
            walletPayUI.f208627L = null;
            walletPayUI.mo99116L7();
        }

        /* renamed from: b */
        public void mo98830b(String str, PayInfo payInfo, FavorPayInfo favorPayInfo, Bankcard bankcard) {
            WalletPayUI walletPayUI = WalletPayUI.this;
            if (walletPayUI.f208646X0) {
                Log.m105928w(walletPayUI.f208649d, "has received canceled");
                C115669n.INSTANCE.mo175913w(965, 3, 1);
                return;
            }
            walletPayUI.setAuthState(true);
            WalletPayUI.this.hideVKB();
            WalletPayUI walletPayUI2 = WalletPayUI.this;
            walletPayUI2.f208656n = favorPayInfo;
            walletPayUI2.f208655j = bankcard;
            String str2 = walletPayUI2.f208649d;
            Object[] objArr = new Object[1];
            objArr[0] = favorPayInfo == null ? "" : favorPayInfo.toString();
            Log.m105925i(str2, "WalletPwdDialog showAlert with favinfo %s", objArr);
            if (!Util.isNullOrNil(str)) {
                PayInfo payInfo2 = WalletPayUI.this.f208665v;
                C75155x0.m90135a(payInfo2 == null ? 0 : payInfo2.f212587e, payInfo2 == null ? "" : payInfo2.f212592j, 9, "");
            }
            WalletPayUI walletPayUI3 = WalletPayUI.this;
            walletPayUI3.f208653h = str;
            walletPayUI3.mo99119O7(false);
            C72517z.m84857e();
        }

        public void onCancel() {
            Log.m105924i(WalletPayUI.this.f208649d, "cashier dialog canceled");
            WalletPayUI walletPayUI = WalletPayUI.this;
            walletPayUI.f208646X0 = true;
            PayInfo payInfo = walletPayUI.f208665v;
            C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 10, "");
            if (WalletPayUI.this.isTransparent()) {
                WalletPayUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$g */
    public class C71926g implements C72379f1.C72388f {
        public C71926g() {
        }

        /* renamed from: a */
        public void mo96337a(String str, FavorPayInfo favorPayInfo, boolean z) {
            WalletPayUI walletPayUI = WalletPayUI.this;
            if (walletPayUI.f208646X0) {
                Log.m105928w(walletPayUI.f208649d, "has received canceled");
                C115669n.INSTANCE.mo175913w(965, 3, 1);
                return;
            }
            walletPayUI.setAuthState(true);
            WalletPayUI.this.hideVKB();
            WalletPayUI walletPayUI2 = WalletPayUI.this;
            walletPayUI2.f208656n = favorPayInfo;
            String str2 = walletPayUI2.f208649d;
            Object[] objArr = new Object[2];
            objArr[0] = favorPayInfo == null ? "" : favorPayInfo.toString();
            objArr[1] = Boolean.valueOf(z);
            Log.m105925i(str2, "WalletPwdDialog showAlert with favinfo %s isNeedChangeBankcard %s", objArr);
            WalletPayUI walletPayUI3 = WalletPayUI.this;
            if (walletPayUI3.f208656n == null || !z) {
                if (!Util.isNullOrNil(str)) {
                    PayInfo payInfo = WalletPayUI.this.f208665v;
                    C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 9, "");
                }
                WalletPayUI walletPayUI4 = WalletPayUI.this;
                walletPayUI4.f208653h = str;
                walletPayUI4.mo99119O7(false);
                C72517z.m84857e();
                WalletPayUI.this.f208628M = null;
                return;
            }
            walletPayUI3.mo99125U7(-100, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$h */
    public class C71927h implements View.OnClickListener {
        public C71927h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i(WalletPayUI.this.f208649d, "WalletPwdDialog event1 %s", Util.getStack().toString());
            WalletPayUI.this.f208656n = (FavorPayInfo) view.getTag();
            WalletPayUI walletPayUI = WalletPayUI.this;
            FavorPayInfo favorPayInfo = walletPayUI.f208656n;
            if (favorPayInfo != null) {
                favorPayInfo.f209528h = "";
            }
            walletPayUI.mo99132b8(false, 0, "");
            WalletPayUI.this.f208627L.dismiss();
            WalletPayUI walletPayUI2 = WalletPayUI.this;
            walletPayUI2.f208653h = null;
            walletPayUI2.f208627L = null;
            walletPayUI2.f208628M = null;
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$i */
    public class C71928i implements DialogInterface.OnCancelListener {
        public C71928i() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            int i = 0;
            Log.m105925i(WalletPayUI.this.f208649d, "WalletPwdDialog event2 %s", Util.getStack().toString());
            WalletPayUI walletPayUI = WalletPayUI.this;
            walletPayUI.mPayResultType = 4;
            walletPayUI.f208646X0 = true;
            PayInfo payInfo = walletPayUI.f208665v;
            if (payInfo != null) {
                i = payInfo.f212587e;
            }
            C75155x0.m90135a(i, payInfo == null ? "" : payInfo.f212592j, 10, "");
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            WalletPayUI walletPayUI2 = WalletPayUI.this;
            walletPayUI2.f208653h = null;
            walletPayUI2.f208627L = null;
            if (walletPayUI2.isTransparent()) {
                WalletPayUI.this.finish();
            }
            WalletPayUI.this.f208628M = null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$j */
    public class C71929j implements DialogInterface.OnClickListener {
        public C71929j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletPayUI.this.mo99116L7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$k */
    public class C71930k implements Runnable {
        public C71930k() {
        }

        public void run() {
            Log.m105924i(WalletPayUI.this.f208649d, "auto reset create flag");
            WalletPayUI.f208614Y0 = false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$l */
    public class C71931l implements DialogInterface.OnClickListener {
        public C71931l() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (WalletPayUI.this.isTransparent()) {
                WalletPayUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$m */
    public class C71932m implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f208694d;

        public C71932m(int i) {
            this.f208694d = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletPayUI walletPayUI = WalletPayUI.this;
            boolean z = WalletPayUI.f208614Y0;
            if (walletPayUI.mo99129Y7()) {
                WalletPayUI.this.mo99131a8(true);
            } else {
                WalletPayUI.this.mo99125U7(this.f208694d, false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$n */
    public class C71933n implements DialogInterface.OnClickListener {
        public C71933n() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (WalletPayUI.this.isTransparent()) {
                WalletPayUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$o */
    public class C71934o implements C75124l {

        /* renamed from: a */
        public final /* synthetic */ JumpRemind f208697a;

        /* renamed from: b */
        public final /* synthetic */ C75687f f208698b;

        public C71934o(JumpRemind jumpRemind, C75687f fVar) {
            this.f208697a = jumpRemind;
            this.f208698b = fVar;
        }

        public void onCancel() {
            if (this.f208697a.mo104780b()) {
                WalletPayUI walletPayUI = WalletPayUI.this;
                C75687f fVar = this.f208698b;
                boolean z = WalletPayUI.f208614Y0;
                walletPayUI.mo99114J7(fVar);
                return;
            }
            WalletPayUI.this.finish();
        }

        public void onEnter() {
        }

        public void onUrlCancel() {
            if (this.f208697a.mo104780b()) {
                WalletPayUI walletPayUI = WalletPayUI.this;
                C75687f fVar = this.f208698b;
                boolean z = WalletPayUI.f208614Y0;
                walletPayUI.mo99114J7(fVar);
                return;
            }
            WalletPayUI.this.finish();
        }

        public void onUrlOk() {
            if (this.f208697a.mo104780b()) {
                WalletPayUI walletPayUI = WalletPayUI.this;
                C75687f fVar = this.f208698b;
                boolean z = WalletPayUI.f208614Y0;
                walletPayUI.mo99114J7(fVar);
                return;
            }
            WalletPayUI.this.mo99120P7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$p */
    public class C71935p implements DialogInterface.OnClickListener {
        public C71935p() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletPayUI.this.f208667x.putInt("key_pay_flag", 3);
            WalletPayUI walletPayUI = WalletPayUI.this;
            walletPayUI.mo99134d8(walletPayUI.f208667x);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$q */
    public class C71936q implements DialogInterface.OnClickListener {
        public C71936q() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (WalletPayUI.this.isTransparent()) {
                WalletPayUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$r */
    public class C71937r implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f208702d;

        public C71937r(int i) {
            this.f208702d = i;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (WalletPayUI.this.getProcess() != null) {
                C79143a.m95764c(WalletPayUI.this.getContext(), WalletPayUI.this.getInput(), this.f208702d);
            }
            if (WalletPayUI.this.isTransparent()) {
                WalletPayUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$s */
    public class C71938s implements DialogInterface.OnClickListener {
        public C71938s() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletPayUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$t */
    public class C71939t implements DialogInterface.OnClickListener {
        public C71939t() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletPayUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$u */
    public class C71940u implements C79148e.C79149a {
        public C71940u() {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            Log.m105924i(WalletPayUI.this.f208649d, "pay process end");
            WalletPayUI.this.f208661r = false;
            return new Intent();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$v */
    public class C71941v implements DialogInterface.OnClickListener {
        public C71941v() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletPayUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$w */
    public class C71942w extends C30870z1 {
        public C71942w() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            WalletPayUI.this.mo99130Z7(false, 0, "");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$x */
    public class C71943x implements View.OnClickListener {
        public C71943x() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletPayUI walletPayUI = WalletPayUI.this;
            if (walletPayUI.f208666w) {
                walletPayUI.f208622G.setImageResource(C0966R.C0969drawable.alk);
                WalletPayUI.this.f208666w = false;
            } else {
                walletPayUI.f208622G.setImageResource(C0966R.C0969drawable.all);
                WalletPayUI.this.f208666w = true;
            }
            WalletPayUI.this.f208626K.mo99144a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$y */
    public class C71944y extends C30870z1 {
        public C71944y() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            if (!C79029b0.vx0().wx0().mo91342x()) {
                PayInfo payInfo = WalletPayUI.this.f208665v;
                C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 6, "");
            }
            WalletPayUI.this.mo99115K7(true);
            WalletPayUI.this.f208669y = true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z */
    public class C71945z implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z$a */
        public class C71946a implements C72371d0.C72374b {

            /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z$a$a */
            public class C71947a implements View.OnClickListener {
                public C71947a() {
                }

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    Log.m105924i(WalletPayUI.this.f208649d, "mDefaultBankcard null or needToPayWithBankcard after favor selection! payWithNewBankcard");
                    WalletPayUI.this.mo99130Z7(false, 0, "");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }

            /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z$a$b */
            public class C71948b implements View.OnClickListener {
                public C71948b() {
                }

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    Log.m105924i(WalletPayUI.this.f208649d, "Balance amount not meet, after favor selection! payWithNewBankcard");
                    WalletPayUI.this.mo99130Z7(false, 0, "");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }

            /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z$a$c */
            public class C71949c implements View.OnClickListener {
                public C71949c() {
                }

                public void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    WalletPayUI.this.mo99115K7(true);
                    C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }

            public C71946a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:30:0x00e6  */
            /* JADX WARNING: Removed duplicated region for block: B:37:0x011f  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x0141  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo99162a(com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo r10) {
                /*
                    r9 = this;
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    r0.f208656n = r10
                    java.lang.String r0 = r0.f208649d
                    r1 = 1
                    java.lang.Object[] r2 = new java.lang.Object[r1]
                    java.lang.String r3 = ""
                    if (r10 != 0) goto L_0x0011
                    r10 = r3
                    goto L_0x0015
                L_0x0011:
                    java.lang.String r10 = r10.toString()
                L_0x0015:
                    r4 = 0
                    r2[r4] = r10
                    java.lang.String r10 = "WalletFavorDialog onSelectionDone %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r10, r2)
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r0 = r10.f208656n
                    if (r0 == 0) goto L_0x0151
                    com.tencent.mm.pluginsdk.wallet.PayInfo r10 = r10.f208665v
                    if (r10 != 0) goto L_0x002b
                    r2 = 0
                    goto L_0x002d
                L_0x002b:
                    int r2 = r10.f212587e
                L_0x002d:
                    if (r10 != 0) goto L_0x0030
                    goto L_0x0032
                L_0x0030:
                    java.lang.String r3 = r10.f212592j
                L_0x0032:
                    r10 = 15
                    java.lang.String r0 = r0.f209524d
                    com.tencent.p014mm.wallet_core.model.C75155x0.m90135a(r2, r3, r10, r0)
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r10.f208655j
                    r2 = 8
                    if (r0 == 0) goto L_0x00a1
                    com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r10 = r10.f208656n
                    boolean r10 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72394l.m84745j(r10, r0)
                    if (r10 == 0) goto L_0x004c
                    goto L_0x00a1
                L_0x004c:
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    com.tencent.mm.plugin.wallet_core.ui.l r0 = r10.f208657o
                    com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r10 = r10.f208656n
                    java.lang.String r10 = r10.f209524d
                    y43.n r10 = r0.mo99770f(r10)
                    if (r10 == 0) goto L_0x009f
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r0.f208655j
                    boolean r0 = r0.mo99388n2()
                    if (r0 == 0) goto L_0x009f
                    y43.b0 r0 = y43.C79029b0.vx0()
                    b63.s0 r0 = r0.wx0()
                    com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r0.f192955h
                    double r5 = r10.f232087f
                    if (r0 == 0) goto L_0x009f
                    double r7 = r0.f209415j2
                    int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                    if (r10 >= 0) goto L_0x009f
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    java.lang.String r10 = r10.f208649d
                    java.lang.String r0 = "balance not meet"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.TextView r10 = r10.f208621F
                    r10.setVisibility(r2)
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.Button r10 = r10.f208671z
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z$a$b r0 = new com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z$a$b
                    r0.<init>()
                    r10.setOnClickListener(r0)
                    goto L_0x00b8
                L_0x009f:
                    r10 = 0
                    goto L_0x00b9
                L_0x00a1:
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.TextView r10 = r10.f208621F
                    r10.setVisibility(r2)
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.Button r10 = r10.f208671z
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z$a$a r0 = new com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z$a$a
                    r0.<init>()
                    r10.setOnClickListener(r0)
                L_0x00b8:
                    r10 = 1
                L_0x00b9:
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    java.lang.String r0 = r0.f208649d
                    java.lang.Object[] r3 = new java.lang.Object[r1]
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)
                    r3[r4] = r5
                    java.lang.String r5 = "needBindBankCard %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r3)
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.LinearLayout r0 = r0.f208633R
                    r0.setVisibility(r4)
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.TextView r0 = r0.f208631Q
                    r0.setVisibility(r4)
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r3 = r0.f208656n
                    if (r3 == 0) goto L_0x011c
                    com.tencent.mm.plugin.wallet_core.ui.m r3 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m.INSTANCE
                    com.tencent.mm.plugin.wallet_core.model.Orders r5 = r0.f208650e
                    com.tencent.mm.plugin.wallet_core.ui.l r3 = r3.mo99776a(r5)
                    r0.f208657o = r3
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r0 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    com.tencent.mm.plugin.wallet_core.ui.l r3 = r0.f208657o
                    com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r0 = r0.f208656n
                    java.lang.String r0 = r0.f209524d
                    y43.n r0 = r3.mo99770f(r0)
                    if (r0 == 0) goto L_0x011c
                    double r5 = r0.f232087f
                    r7 = 0
                    int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                    if (r0 != 0) goto L_0x011c
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.LinearLayout r10 = r10.f208633R
                    r10.setVisibility(r2)
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.TextView r10 = r10.f208631Q
                    r10.setVisibility(r2)
                    r10 = 0
                    goto L_0x011d
                L_0x011c:
                    r1 = 0
                L_0x011d:
                    if (r10 != 0) goto L_0x013f
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.TextView r10 = r10.f208620E
                    r10.setVisibility(r2)
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.TextView r10 = r10.f208621F
                    r10.setVisibility(r4)
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.Button r10 = r10.f208671z
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z$a$c r0 = new com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z$a$c
                    r0.<init>()
                    r10.setOnClickListener(r0)
                L_0x013f:
                    if (r1 == 0) goto L_0x014a
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    android.widget.TextView r10 = r10.f208621F
                    r10.setVisibility(r2)
                L_0x014a:
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$z r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.this
                    com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r10 = com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.this
                    r10.mo99135e8()
                L_0x0151:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71945z.C71946a.mo99162a(com.tencent.mm.plugin.wallet_core.model.FavorPayInfo):void");
            }
        }

        public C71945z() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            PayInfo payInfo = WalletPayUI.this.f208665v;
            C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 12, "");
            AppCompatActivity context = WalletPayUI.this.getContext();
            WalletPayUI walletPayUI = WalletPayUI.this;
            C72371d0.m84703d(context, walletPayUI.f208650e, walletPayUI.f208656n.f209524d, new C71946a(), (DialogInterface.OnCancelListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: C4 */
    public void mo99087C4(boolean z, String str, String str2) {
        Log.m105924i(this.f208649d, "onGenFinish callback");
        if (z) {
            Log.m105924i(this.f208649d, "onGenFinish callback, result.isSuccess is true");
            PayInfo payInfo = this.f208665v;
            payInfo.f212570A = str;
            payInfo.f212571B = str2;
            mo99119O7(false);
            C72517z.m84857e();
            return;
        }
        Log.m105920e(this.f208649d, "onGenFinish callback, result.isSuccess is false");
        mo99119O7(false);
        C72517z.m84857e();
    }

    /* renamed from: H7 */
    public boolean mo99112H7() {
        PayInfo payInfo = this.f208665v;
        return (payInfo == null || payInfo.f212587e == 11) ? false : true;
    }

    /* renamed from: I7 */
    public boolean mo99113I7() {
        List<Orders.Commodity> list;
        Orders orders = this.f208650e;
        if (orders == null || (list = orders.f209542M) == null || ((ArrayList) list).size() < 1) {
            Log.m105928w(this.f208649d, "mOrders info is Illegal!");
            C75687f fVar = this.f208651f;
            if (fVar != null && fVar.isJumpRemind()) {
                return false;
            }
            String string = getString(C0966R.string.l0d);
            C75687f fVar2 = this.f208651f;
            if (fVar2 != null && !Util.isNullOrNil(fVar2.f222301q)) {
                string = this.f208651f.f222301q;
            }
            Log.m105925i(this.f208649d, "checkInfo() errMsg:%s", string);
            C76879j.m92749t(getContext(), string, "", new C71938s());
            return false;
        } else if (!this.f208663t || Util.isNullOrNil(this.f208664u) || mo99122R7() != null) {
            return true;
        } else {
            C75687f fVar3 = this.f208651f;
            if (fVar3 != null && fVar3.isJumpRemind()) {
                return false;
            }
            Log.m105928w(this.f208649d, "hy: should use given bankcard, but resolved as null. show error msg and quit");
            String string2 = getString(C0966R.string.l0d);
            C75687f fVar4 = this.f208651f;
            if (fVar4 != null && !Util.isNullOrNil(fVar4.f222301q)) {
                string2 = this.f208651f.f222301q;
            }
            Log.m105925i(this.f208649d, "checkInfo() errMsg:%s", string2);
            C76879j.m92749t(getContext(), string2, "", new C71939t());
            return false;
        }
    }

    /* renamed from: J7 */
    public final void mo99114J7(C75687f fVar) {
        PayInfo payInfo;
        Orders.SimpleCashierInfo simpleCashierInfo;
        PayInfo payInfo2;
        C75687f fVar2 = fVar;
        Class cls = C79173v.class;
        int i = 1;
        Log.m105925i(this.f208649d, "stopRealname realnameGuideFlag %s guide_type %s", fVar2.f222294g, Integer.valueOf(fVar2.f222293f));
        if ("1".equals(fVar2.f222294g) || "2".equals(fVar2.f222294g)) {
            this.f208659p0 = fVar2;
        } else {
            this.f208659p0 = null;
        }
        this.f208634R0 = fVar2.f222299o;
        this.f208647Y = true;
        Orders orders = fVar2.f222291d;
        this.f208650e = orders;
        this.f208652g = orders != null ? ((ArrayList) orders.f209542M).size() : 0;
        String str = this.f208649d;
        StringBuilder sb = new StringBuilder();
        sb.append("get mOrders! bankcardTag : ");
        Orders orders2 = this.f208650e;
        sb.append(orders2 != null ? Integer.valueOf(orders2.f209567i) : "");
        Log.m105918d(str, sb.toString());
        mo99113I7();
        Orders orders3 = this.f208650e;
        if (!(orders3 == null || orders3.f209543N == null)) {
            C72394l a = C72400m.INSTANCE.mo99776a(orders3);
            this.f208657o = a;
            if (a != null) {
                if (((LinkedList) a.mo99772i()).size() > 0) {
                    this.f208658p = true;
                }
                FavorPayInfo g = this.f208657o.mo99771g(this.f208650e.f209543N.f232071g);
                this.f208656n = g;
                g.f209524d = this.f208657o.mo99765a(g.f209524d);
                String str2 = this.f208649d;
                FavorPayInfo favorPayInfo = this.f208656n;
                String str3 = favorPayInfo.f209524d;
                Log.m105925i(str2, "onSceneEnd init favInfo id favorComposeId %s selectedFavorCompId %s selectedFavorCompId %s  mFavorPayInfo %s", this.f208650e.f209543N.f232071g, str3, str3, favorPayInfo.toString());
            }
        }
        Orders orders4 = this.f208650e;
        if (!(orders4 == null || this.f208654i == null || (payInfo2 = this.f208665v) == null)) {
            C72517z.m84855c(this, payInfo2, orders4, 1);
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[5];
            objArr[0] = Integer.valueOf(this.f208665v.f212587e);
            objArr[1] = 0;
            objArr[2] = Integer.valueOf(C79029b0.vx0().wx0().mo91341w() ? 2 : 1);
            objArr[3] = Integer.valueOf((int) (this.f208650e.f209566h * 100.0d));
            objArr[4] = this.f208650e.f209568j;
            nVar.mo160131h(10690, objArr);
        }
        Orders orders5 = this.f208650e;
        if (!(orders5 == null || orders5.f209542M == null)) {
            LinkedList<String> linkedList = new LinkedList<>();
            Iterator it = ((ArrayList) this.f208650e.f209542M).iterator();
            while (it.hasNext()) {
                linkedList.add(((Orders.Commodity) it.next()).f209606r);
            }
            if (linkedList.size() > 0) {
                WalletPayOrdersEvent walletPayOrdersEvent = new WalletPayOrdersEvent();
                walletPayOrdersEvent.f194083d.f194084a = linkedList;
                walletPayOrdersEvent.publish();
                C77302a aVar = this.f208668x0;
                if (aVar != null) {
                    aVar.mo107446a(10001, linkedList.get(0));
                }
            }
        }
        Orders orders6 = this.f208650e;
        if (orders6 != null && (simpleCashierInfo = orders6.f209558W0) != null && simpleCashierInfo.f209707d == 1 && !Util.isNullOrNil(simpleCashierInfo.f209709f)) {
            this.f208663t = true;
            this.f208664u = this.f208650e.f209558W0.f209709f;
        }
        this.f208654i = C79029b0.vx0().wx0().mo91319a(mo99112H7());
        if (!Util.isNullOrNil(this.f208664u)) {
            this.f208655j = mo99122R7();
        } else {
            this.f208655j = C79029b0.vx0().wx0().mo91329k((ArrayList<Bankcard>) null, (String) null, mo99112H7(), false);
        }
        String nullAs = Util.nullAs(getIntent().getStringExtra("key_is_use_default_card"), "");
        if (!Util.isNullOrNil(nullAs)) {
            this.f208655j = mo99123S7(nullAs);
        }
        this.f208671z.setClickable(true);
        if (!Util.isNullOrNil(((C79173v) C86312j.m106911c(cls)).Ex0().f192968u)) {
            this.f208623H.setVisibility(0);
            this.f208623H.setText(((C79173v) C86312j.m106911c(cls)).Ex0().f192968u);
        } else {
            this.f208623H.setVisibility(8);
            this.f208623H.setText("");
        }
        Orders orders7 = this.f208650e;
        if (!(orders7 == null || this.f208654i == null || (payInfo = this.f208665v) == null)) {
            C72517z.m84855c(this, payInfo, orders7, 1);
            C115669n nVar2 = C115669n.INSTANCE;
            Object[] objArr2 = new Object[5];
            objArr2[0] = Integer.valueOf(this.f208665v.f212587e);
            objArr2[1] = 0;
            if (C79029b0.vx0().wx0().mo91341w()) {
                i = 2;
            }
            objArr2[2] = Integer.valueOf(i);
            objArr2[3] = Integer.valueOf((int) (this.f208650e.f209566h * 100.0d));
            objArr2[4] = this.f208650e.f209568j;
            nVar2.mo160131h(10690, objArr2);
        }
        if (this.f208637T) {
            mo99125U7(0, false);
        }
        long j = mo99124T7().f212600u == null ? 0 : mo99124T7().f212600u.getLong("wallet_pay_key_check_time");
        if (j > 0) {
            C115669n nVar3 = C115669n.INSTANCE;
            nVar3.idkeyStat(641, 4, 1, true);
            nVar3.idkeyStat(641, 5, Util.milliSecondsToNow(j), true);
        }
        if (this.f208642V0 > 0) {
            C115669n nVar4 = C115669n.INSTANCE;
            nVar4.idkeyStat(641, 7, 1, true);
            nVar4.idkeyStat(641, 8, Util.milliSecondsToNow(this.f208642V0), true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x010c  */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo99115K7(boolean r17) {
        /*
            r16 = this;
            r7 = r16
            r8 = 0
            r9 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            if (r17 == 0) goto L_0x00c0
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r7.f208650e
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r0.f209531B
            if (r0 == 0) goto L_0x00bc
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            r1 = 196614(0x30006, float:2.75515E-40)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r0.mo119684e(r1, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00bc
            android.view.LayoutInflater r0 = r16.getLayoutInflater()
            r1 = 2131498278(0x7f0c1526, float:1.8620173E38)
            r2 = 0
            android.view.View r2 = r0.inflate(r1, r2)
            r0 = 2131315320(0x7f094a78, float:1.824909E38)
            android.view.View r0 = r2.findViewById(r0)
            r11 = r0
            android.widget.CheckBox r11 = (android.widget.CheckBox) r11
            r0 = 2131310076(0x7f0935fc, float:1.8238454E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r1 = r16.getResources()
            r3 = 2131839532(0x7f114a2c, float:1.9312318E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.Object[] r3 = new java.lang.Object[r9]
            android.content.res.Resources r4 = r16.getResources()
            r5 = 2131838770(0x7f114732, float:1.9310773E38)
            java.lang.String r4 = r4.getString(r5)
            r3[r8] = r4
            java.lang.String r1 = java.lang.String.format(r1, r3)
            android.text.Spanned r1 = android.text.Html.fromHtml(r1)
            r0.setText(r1)
            android.text.method.MovementMethod r1 = android.text.method.LinkMovementMethod.getInstance()
            r0.setMovementMethod(r1)
            r0 = 2131315352(0x7f094a98, float:1.8249155E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.tencent.mm.plugin.wallet.pay.ui.h r1 = new com.tencent.mm.plugin.wallet.pay.ui.h
            r1.<init>(r7, r11)
            r0.setOnClickListener(r1)
            r0 = 2131839534(0x7f114a2e, float:1.9312322E38)
            java.lang.String r1 = r7.getString(r0)
            r0 = 2131839001(0x7f114819, float:1.9311241E38)
            java.lang.String r3 = r7.getString(r0)
            r0 = 2131839630(0x7f114a8e, float:1.9312517E38)
            java.lang.String r4 = r7.getString(r0)
            com.tencent.mm.plugin.wallet.pay.ui.i r5 = new com.tencent.mm.plugin.wallet.pay.ui.i
            r5.<init>(r7, r11)
            com.tencent.mm.plugin.wallet.pay.ui.j r6 = new com.tencent.mm.plugin.wallet.pay.ui.j
            r6.<init>(r7)
            r0 = r16
            qo3.g r0 = nj3.C76879j.m92747r(r0, r1, r2, r3, r4, r5, r6)
            r0.setCancelable(r8)
            com.tencent.mm.plugin.wallet.pay.ui.k r1 = new com.tencent.mm.plugin.wallet.pay.ui.k
            r1.<init>(r7, r0)
            r11.setOnCheckedChangeListener(r1)
            r0 = 0
            goto L_0x00bd
        L_0x00bc:
            r0 = 1
        L_0x00bd:
            if (r0 != 0) goto L_0x00c0
            return
        L_0x00c0:
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r0 = r7.f208656n
            if (r0 == 0) goto L_0x00e2
            com.tencent.mm.plugin.wallet_core.ui.m r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m.INSTANCE
            com.tencent.mm.plugin.wallet_core.model.Orders r1 = r7.f208650e
            com.tencent.mm.plugin.wallet_core.ui.l r0 = r0.mo99776a(r1)
            r7.f208657o = r0
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r1 = r7.f208656n
            java.lang.String r1 = r1.f209524d
            y43.n r0 = r0.mo99770f(r1)
            if (r0 == 0) goto L_0x00e2
            double r0 = r0.f232087f
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x00e2
            r0 = 1
            goto L_0x00e3
        L_0x00e2:
            r0 = 0
        L_0x00e3:
            f53.f r1 = r7.f208659p0
            if (r1 == 0) goto L_0x0108
            int r1 = r1.f222293f
            if (r1 != 0) goto L_0x00f8
            java.lang.String r0 = r7.f208649d
            java.lang.String r1 = "need real name,stop"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            f53.f r0 = r7.f208659p0
            r7.mo99117M7(r0)
            return
        L_0x00f8:
            if (r1 != r9) goto L_0x0108
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = r7.f208649d
            java.lang.String r1 = "need real name, zero stop"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            f53.f r0 = r7.f208659p0
            r7.mo99117M7(r0)
        L_0x0108:
            c53.d r0 = r7.f208634R0
            if (r0 == 0) goto L_0x023f
            int r1 = r0.f193193a
            r2 = 8
            r3 = 3
            r4 = 4
            r5 = 15368(0x3c08, float:2.1535E-41)
            r6 = 2
            if (r1 != r9) goto L_0x01b1
            java.lang.String r0 = r0.f193195c
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01b1
            c53.d r0 = r7.f208634R0
            java.lang.String r0 = r0.f193196d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01b1
            c53.d r0 = r7.f208634R0
            java.lang.String r0 = r0.f193194b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01b1
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r7.f208665v
            if (r0 == 0) goto L_0x0194
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r7.f208650e
            if (r0 == 0) goto L_0x0194
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r0.f209542M
            if (r0 == 0) goto L_0x0194
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0194
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r7.f208665v
            int r0 = r0.f212587e
            if (r0 != r2) goto L_0x0173
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1[r8] = r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1[r9] = r2
            r1[r6] = r10
            com.tencent.mm.plugin.wallet_core.model.Orders r2 = r7.f208650e
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r2 = r2.f209542M
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r8)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r2 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r2
            java.lang.String r2 = r2.f209606r
            r1[r3] = r2
            r0.mo160131h(r5, r1)
            goto L_0x0194
        L_0x0173:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r8] = r10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1[r9] = r2
            r1[r6] = r10
            com.tencent.mm.plugin.wallet_core.model.Orders r2 = r7.f208650e
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r2 = r2.f209542M
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r8)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r2 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r2
            java.lang.String r2 = r2.f209606r
            r1[r3] = r2
            r0.mo160131h(r5, r1)
        L_0x0194:
            androidx.appcompat.app.AppCompatActivity r8 = r16.getContext()
            c53.d r0 = r7.f208634R0
            java.lang.String r9 = r0.f193194b
            java.lang.String r11 = r0.f193196d
            java.lang.String r12 = r0.f193195c
            r13 = 0
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$c r14 = new com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$c
            r14.<init>()
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d r15 = new com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d
            r15.<init>()
            java.lang.String r10 = ""
            nj3.C76879j.m92709C(r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x01b1:
            c53.d r0 = r7.f208634R0
            int r1 = r0.f193193a
            if (r1 != r6) goto L_0x023f
            java.lang.String r0 = r0.f193194b
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x023f
            c53.d r0 = r7.f208634R0
            java.lang.String r0 = r0.f193197e
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x023f
            java.lang.String r0 = r7.f208649d
            java.lang.String r1 = "pay has been blocked"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r7.f208665v
            if (r0 == 0) goto L_0x0229
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r7.f208650e
            if (r0 == 0) goto L_0x0229
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r0.f209542M
            if (r0 == 0) goto L_0x0229
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0229
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r7.f208665v
            int r0 = r0.f212587e
            if (r0 != r2) goto L_0x020c
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r1[r8] = r2
            r1[r9] = r10
            r1[r6] = r10
            com.tencent.mm.plugin.wallet_core.model.Orders r2 = r7.f208650e
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r2 = r2.f209542M
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r8)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r2 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r2
            java.lang.String r2 = r2.f209606r
            r1[r3] = r2
            r0.mo160131h(r5, r1)
            goto L_0x0229
        L_0x020c:
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r8] = r10
            r1[r9] = r10
            r1[r6] = r10
            com.tencent.mm.plugin.wallet_core.model.Orders r2 = r7.f208650e
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r2 = r2.f209542M
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r2 = r2.get(r8)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r2 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r2
            java.lang.String r2 = r2.f209606r
            r1[r3] = r2
            r0.mo160131h(r5, r1)
        L_0x0229:
            androidx.appcompat.app.AppCompatActivity r8 = r16.getContext()
            c53.d r0 = r7.f208634R0
            java.lang.String r9 = r0.f193194b
            java.lang.String r11 = r0.f193197e
            r12 = 0
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$e r13 = new com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$e
            r13.<init>()
            java.lang.String r10 = ""
            nj3.C76879j.m92711E(r8, r9, r10, r11, r12, r13)
            return
        L_0x023f:
            r16.mo99118N7()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.mo99115K7(boolean):void");
    }

    /* renamed from: L7 */
    public void mo99116L7() {
        Bundle extras = getIntent().getExtras();
        extras.putInt("key_pay_flag", C79029b0.vx0().wx0().mo91341w() ? 2 : 1);
        extras.putParcelable("key_orders", this.f208650e);
        extras.putParcelable("key_pay_info", this.f208665v);
        extras.putParcelable("key_favor_pay_info", this.f208656n);
        mo99134d8(extras);
    }

    /* renamed from: M7 */
    public final boolean mo99117M7(C75687f fVar) {
        if ("1".equals(fVar.f222294g)) {
            Log.m105924i(this.f208649d, "need realname verify");
            this.f208639U = true;
            Bundle bundle = new Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUI");
            bundle.putString("realname_verify_process_jump_plugin", "wallet");
            String str = fVar.f222295h;
            String str2 = fVar.f222296i;
            String str3 = fVar.f222297j;
            boolean isTransparent = isTransparent();
            PayInfo payInfo = this.f208665v;
            return C67008a.m79172h(this, str, 0, str2, str3, bundle, isTransparent, (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, payInfo != null ? payInfo.f212587e : 0, 2);
        } else if ("2".equals(fVar.f222294g)) {
            Log.m105924i(this.f208649d, "need upload credit");
            C67008a.m79173i(this, fVar.f222295h, fVar.f222298n, fVar.f222296i, fVar.f222297j, isTransparent(), (DialogInterface.OnClickListener) null);
            return true;
        } else {
            String str4 = this.f208649d;
            Log.m105924i(str4, "realnameGuideFlag =  " + fVar.f222294g);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8  */
    /* renamed from: N7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99118N7() {
        /*
            r12 = this;
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r4 = 0
            r3[r4] = r2
            r5 = 13958(0x3686, float:1.956E-41)
            r0.mo160131h(r5, r3)
            com.tencent.mm.pluginsdk.wallet.PayInfo r3 = r12.f208665v
            r5 = 8
            if (r3 == 0) goto L_0x0049
            int r3 = r3.f212587e
            if (r5 != r3) goto L_0x0049
            r3 = 13955(0x3683, float:1.9555E-41)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            r7 = 2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r6[r4] = r8
            r0.mo160131h(r3, r6)
            com.tencent.mm.pluginsdk.wallet.PayInfo r3 = r12.f208665v
            android.os.Bundle r3 = r3.f212600u
            if (r3 == 0) goto L_0x0049
            java.lang.String r6 = "extinfo_key_9"
            long r8 = r3.getLong(r6)
            r3 = 13956(0x3684, float:1.9557E-41)
            java.lang.Object[] r6 = new java.lang.Object[r7]
            r6[r4] = r2
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r8
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r6[r1] = r2
            r0.mo160131h(r3, r6)
        L_0x0049:
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r0 = r12.f208656n
            if (r0 == 0) goto L_0x006b
            com.tencent.mm.plugin.wallet_core.ui.m r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m.INSTANCE
            com.tencent.mm.plugin.wallet_core.model.Orders r2 = r12.f208650e
            com.tencent.mm.plugin.wallet_core.ui.l r0 = r0.mo99776a(r2)
            r12.f208657o = r0
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r2 = r12.f208656n
            java.lang.String r2 = r2.f209524d
            y43.n r0 = r0.mo99770f(r2)
            if (r0 == 0) goto L_0x006b
            double r2 = r0.f232087f
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x006b
            r0 = 1
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            r2 = 3
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x00a8
            y43.b0 r0 = y43.C79029b0.vx0()
            b63.s0 r0 = r0.wx0()
            boolean r0 = r0.mo91342x()
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = r12.f208649d
            java.lang.String r5 = "payWithoutPassword zeroPay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r12.f208665v
            if (r0 != 0) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            int r4 = r0.f212587e
        L_0x008d:
            if (r0 != 0) goto L_0x0091
            r0 = r3
            goto L_0x0093
        L_0x0091:
            java.lang.String r0 = r0.f212592j
        L_0x0093:
            com.tencent.p014mm.wallet_core.model.C75155x0.m90135a(r4, r0, r2, r3)
            r12.mo99119O7(r1)
            com.tencent.p014mm.plugin.wallet_core.utils.C72517z.m84857e()
            goto L_0x00a7
        L_0x009d:
            java.lang.String r0 = r12.f208649d
            java.lang.String r1 = "has useful bankcard ! payWithOldBankcard zeroPay"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r12.mo99131a8(r4)
        L_0x00a7:
            return
        L_0x00a8:
            boolean r6 = r12.f208663t
            r7 = 5
            r8 = 17
            if (r6 == 0) goto L_0x010b
            java.lang.String r0 = r12.f208649d
            java.lang.String r1 = "hy: start do pay with force use given bankcard"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.String r0 = r12.f208664u
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x00c8
            com.tencent.mm.plugin.wallet_core.model.Bankcard r0 = r12.mo99122R7()
            r12.f208655j = r0
            r12.mo99131a8(r4)
            goto L_0x010a
        L_0x00c8:
            y43.b0 r0 = y43.C79029b0.vx0()
            b63.s0 r0 = r0.wx0()
            boolean r0 = r0.mo91343y()
            if (r0 == 0) goto L_0x00e8
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r12.f208665v
            if (r0 != 0) goto L_0x00dc
            r1 = 0
            goto L_0x00de
        L_0x00dc:
            int r1 = r0.f212587e
        L_0x00de:
            if (r0 != 0) goto L_0x00e2
            r0 = r3
            goto L_0x00e4
        L_0x00e2:
            java.lang.String r0 = r0.f212592j
        L_0x00e4:
            com.tencent.p014mm.wallet_core.model.C75155x0.m90135a(r1, r0, r8, r3)
            goto L_0x0107
        L_0x00e8:
            y43.b0 r0 = y43.C79029b0.vx0()
            b63.s0 r0 = r0.wx0()
            boolean r0 = r0.mo91342x()
            if (r0 == 0) goto L_0x0107
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r12.f208665v
            if (r0 != 0) goto L_0x00fc
            r1 = 0
            goto L_0x00fe
        L_0x00fc:
            int r1 = r0.f212587e
        L_0x00fe:
            if (r0 != 0) goto L_0x0102
            r0 = r3
            goto L_0x0104
        L_0x0102:
            java.lang.String r0 = r0.f212592j
        L_0x0104:
            com.tencent.p014mm.wallet_core.model.C75155x0.m90135a(r1, r0, r7, r3)
        L_0x0107:
            r12.mo99130Z7(r4, r4, r3)
        L_0x010a:
            return
        L_0x010b:
            android.content.Intent r6 = r12.getIntent()
            java.lang.String r9 = "key_is_use_default_card"
            java.lang.String r6 = r6.getStringExtra(r9)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r6, (java.lang.String) r3)
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r9 != 0) goto L_0x0125
            com.tencent.mm.plugin.wallet_core.model.Bankcard r6 = r12.mo99123S7(r6)
            r12.f208655j = r6
        L_0x0125:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r6 = r12.f208655j
            if (r6 != 0) goto L_0x0188
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Bankcard> r0 = r12.f208654i
            if (r0 == 0) goto L_0x013e
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x013e
            java.lang.String r0 = r12.f208649d
            java.lang.String r1 = " no last pay bankcard ! jump to select bankcard!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r12.mo99132b8(r4, r5, r3)
            goto L_0x0187
        L_0x013e:
            java.lang.String r0 = r12.f208649d
            java.lang.String r1 = "default bankcard not found! payWithNewBankcard"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            y43.b0 r0 = y43.C79029b0.vx0()
            b63.s0 r0 = r0.wx0()
            boolean r0 = r0.mo91343y()
            if (r0 == 0) goto L_0x0165
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r12.f208665v
            if (r0 != 0) goto L_0x0159
            r1 = 0
            goto L_0x015b
        L_0x0159:
            int r1 = r0.f212587e
        L_0x015b:
            if (r0 != 0) goto L_0x015f
            r0 = r3
            goto L_0x0161
        L_0x015f:
            java.lang.String r0 = r0.f212592j
        L_0x0161:
            com.tencent.p014mm.wallet_core.model.C75155x0.m90135a(r1, r0, r8, r3)
            goto L_0x0184
        L_0x0165:
            y43.b0 r0 = y43.C79029b0.vx0()
            b63.s0 r0 = r0.wx0()
            boolean r0 = r0.mo91342x()
            if (r0 == 0) goto L_0x0184
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r12.f208665v
            if (r0 != 0) goto L_0x0179
            r1 = 0
            goto L_0x017b
        L_0x0179:
            int r1 = r0.f212587e
        L_0x017b:
            if (r0 != 0) goto L_0x017f
            r0 = r3
            goto L_0x0181
        L_0x017f:
            java.lang.String r0 = r0.f212592j
        L_0x0181:
            com.tencent.p014mm.wallet_core.model.C75155x0.m90135a(r1, r0, r7, r3)
        L_0x0184:
            r12.mo99130Z7(r4, r4, r3)
        L_0x0187:
            return
        L_0x0188:
            com.tencent.mm.plugin.wallet_core.model.Orders r5 = r12.f208650e
            int r7 = r5.f209567i
            int r5 = r6.mo99387l2(r7, r5)
            q43.a r6 = r12.f208668x0
            if (r6 == 0) goto L_0x0199
            r7 = 10002(0x2712, float:1.4016E-41)
            r6.mo107446a(r7, r3)
        L_0x0199:
            if (r5 == 0) goto L_0x01bc
            if (r0 != 0) goto L_0x01bc
            java.lang.String r0 = r12.f208649d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "main bankcard("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ") is useless! jump to select bankcard!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r12.mo99132b8(r4, r5, r3)
            goto L_0x01f2
        L_0x01bc:
            y43.b0 r0 = y43.C79029b0.vx0()
            b63.s0 r0 = r0.wx0()
            boolean r0 = r0.mo91342x()
            if (r0 == 0) goto L_0x01e8
            java.lang.String r0 = r12.f208649d
            java.lang.String r5 = "payWithoutPassword"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r5)
            com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r12.f208665v
            if (r0 != 0) goto L_0x01d6
            goto L_0x01d8
        L_0x01d6:
            int r4 = r0.f212587e
        L_0x01d8:
            if (r0 != 0) goto L_0x01dc
            r0 = r3
            goto L_0x01de
        L_0x01dc:
            java.lang.String r0 = r0.f212592j
        L_0x01de:
            com.tencent.p014mm.wallet_core.model.C75155x0.m90135a(r4, r0, r2, r3)
            r12.mo99119O7(r1)
            com.tencent.p014mm.plugin.wallet_core.utils.C72517z.m84857e()
            goto L_0x01f2
        L_0x01e8:
            java.lang.String r0 = r12.f208649d
            java.lang.String r1 = "has useful bankcard ! payWithOldBankcard"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r12.mo99131a8(r4)
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.mo99118N7():void");
    }

    /* renamed from: O7 */
    public void mo99119O7(boolean z) {
        Bundle bundle;
        C75326b a = C67341a.m79678a(mo99121Q7(), this.f208650e, z);
        if (this.f208650e != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("key_reqKey", this.f208650e.f209563e);
            List<Orders.Commodity> list = this.f208650e.f209542M;
            if (list != null && ((ArrayList) list).size() > 0) {
                bundle2.putString("key_TransId", ((Orders.Commodity) ((ArrayList) this.f208650e.f209542M).get(0)).f209606r);
            }
            bundle2.putLong("key_SessionId", this.f208630P);
            a.setProcessName("PayProcess");
            a.setProcessBundle(bundle2);
        }
        PayInfo payInfo = this.f208665v;
        if (payInfo != null) {
            int i = payInfo.f212587e;
            if (i == 6 && payInfo.f212588f == 100) {
                a.setScene(100);
            } else {
                a.setScene(i);
            }
        }
        doSceneProgress(a);
        PayInfo payInfo2 = this.f208665v;
        if (payInfo2 != null && 8 == payInfo2.f212587e && (bundle = payInfo2.f212600u) != null) {
            long j = bundle.getLong("extinfo_key_9");
            C115669n.INSTANCE.mo160131h(13956, 2, Long.valueOf(System.currentTimeMillis() - j));
        }
    }

    /* renamed from: P7 */
    public void mo99120P7() {
        C75123k0 k0Var;
        int i = 2;
        C115669n.INSTANCE.mo160131h(11850, 2, Integer.valueOf(this.f208665v.f212587e));
        PayInfo payInfo = this.f208665v;
        if (payInfo.f212587e == 11) {
            i = 3;
        }
        if (payInfo == null || Util.isNullOrNil(payInfo.f212592j)) {
            Log.m105924i("MicroMsg.CgiManager", "no payInfo or reqKey");
            k0Var = null;
        } else {
            String str = payInfo.f212592j;
            Log.m105925i("MicroMsg.CgiManager", "qrorderinfo reqKey: %s", str);
            Log.m105924i("MicroMsg.CgiManager", "qrorderinfo go new split cgi");
            k0Var = str.startsWith("sns_aa_") ? new C75682a(payInfo, i) : str.startsWith("sns_tf_") ? new C75691j(payInfo, i) : str.startsWith("sns_ff_") ? new C75684c(payInfo, i) : str.startsWith("ts_") ? new C75685d(payInfo, i) : str.startsWith("sns_") ? new C75689h(payInfo, i) : str.startsWith("offline_") ? new C75686e(payInfo, i) : str.startsWith("up_") ? new C75692k(payInfo, i) : str.startsWith("seb_ff_") ? new C75688g(payInfo, i) : str.startsWith("tax_") ? new C75690i(payInfo, i) : str.startsWith("dc_") ? new C75683b(payInfo, i) : new C75687f(payInfo, i);
        }
        if (k0Var != null) {
            k0Var.setProcessName("PayProcess");
            k0Var.setProcessSessionId(this.f208630P);
            PayInfo payInfo2 = this.f208665v;
            int i2 = payInfo2.f212587e;
            if (i2 == 6 && payInfo2.f212588f == 100) {
                k0Var.setScene(100);
            } else {
                k0Var.setScene(i2);
            }
            doSceneProgress(k0Var, true, this.f208665v.f212591i);
        }
    }

    /* renamed from: Q7 */
    public Authen mo99121Q7() {
        C72394l lVar;
        Authen authen = new Authen();
        if (mo99126V7()) {
            authen.f209367d = 3;
        } else {
            authen.f209367d = 6;
        }
        if (!Util.isNullOrNil(this.f208653h)) {
            authen.f209369f = this.f208653h;
        }
        Bankcard bankcard = this.f208655j;
        if (bankcard != null) {
            authen.f209371h = bankcard.field_bindSerial;
            authen.f209370g = bankcard.field_bankcardType;
        }
        if (!(this.f208656n == null || (lVar = this.f208657o) == null)) {
            Map<String, C79030d0> map = lVar.f210615b;
            if (map != null && ((HashMap) map).size() > 0) {
                FavorPayInfo favorPayInfo = this.f208656n;
                authen.f209355H = favorPayInfo.f209524d;
                authen.f209354G = favorPayInfo.f209527g;
            }
        }
        authen.f209382v = this.f208665v;
        return authen;
    }

    /* renamed from: R7 */
    public final Bankcard mo99122R7() {
        ArrayList<Bankcard> a = C79029b0.vx0().wx0().mo91319a(true);
        if (a.size() == 0) {
            return null;
        }
        Iterator<Bankcard> it = a.iterator();
        while (it.hasNext()) {
            Bankcard next = it.next();
            if (Util.nullAsNil(this.f208664u).equals(next.field_bindSerial)) {
                Log.m105924i(this.f208649d, "hy: get given bankcard");
                return next;
            }
        }
        return null;
    }

    /* renamed from: S7 */
    public final Bankcard mo99123S7(String str) {
        ArrayList<Bankcard> a = C79029b0.vx0().wx0().mo91319a(true);
        if (a.size() == 0) {
            return null;
        }
        Iterator<Bankcard> it = a.iterator();
        while (it.hasNext()) {
            Bankcard next = it.next();
            if (Util.nullAsNil(str).equals(next.field_bindSerial)) {
                Log.m105924i(this.f208649d, "hy: get given bankcard");
                return next;
            }
        }
        return null;
    }

    /* renamed from: T7 */
    public PayInfo mo99124T7() {
        if (this.f208665v == null) {
            this.f208665v = (PayInfo) getIntent().getParcelableExtra("key_pay_info");
        }
        return this.f208665v;
    }

    /* renamed from: U7 */
    public void mo99125U7(int i, boolean z) {
        C115669n nVar = C115669n.INSTANCE;
        int i2 = 0;
        nVar.mo160131h(13958, 2);
        nVar.mo160131h(13955, 4);
        PayInfo payInfo = this.f208665v;
        if (payInfo != null) {
            i2 = payInfo.f212587e;
        }
        C75155x0.m90135a(i2, payInfo == null ? "" : payInfo.f212592j, 11, "");
        Bundle input = getInput();
        input.putInt("key_main_bankcard_state", i);
        input.putParcelable("key_orders", this.f208650e);
        input.putParcelable("key_pay_info", this.f208665v);
        input.putParcelable("key_authen", mo99121Q7());
        input.putString("key_pwd1", this.f208653h);
        input.putInt("key_pay_flag", 3);
        input.putInt("key_err_code", -1004);
        input.putParcelable("key_favor_pay_info", this.f208656n);
        input.putBoolean("key_is_filter_bank_type", z);
        Bankcard bankcard = this.f208655j;
        if (bankcard != null) {
            input.putString("key_is_cur_bankcard_bind_serial", bankcard.field_bindSerial);
        }
        mo99134d8(input);
    }

    /* renamed from: V7 */
    public boolean mo99126V7() {
        Orders orders;
        Bankcard bankcard = this.f208655j;
        if (bankcard != null && (orders = this.f208650e) != null && orders.f209567i == 3) {
            return bankcard.mo99390p2();
        }
        Orders orders2 = this.f208650e;
        if (orders2 != null) {
            int i = orders2.f209567i;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = Bankcard.f209387V2;
            if (!((i & 2) > 0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W7 */
    public final boolean mo99127W7() {
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("intent_pay_end")) {
            Log.m105924i(this.f208649d, "hy: pay end. finish the activity");
            if (extras.getBoolean("intent_pay_end", false)) {
                String str = this.f208649d;
                Log.m105918d(str, "pay done... errCode:" + extras.getInt("intent_pay_end_errcode"));
                String str2 = this.f208649d;
                Log.m105918d(str2, "pay done INTENT_PAY_APP_URL:" + extras.getString("intent_pay_app_url"));
                String str3 = this.f208649d;
                Log.m105918d(str3, "pay done INTENT_PAY_END:" + extras.getBoolean("intent_pay_end", false));
                mo99133c8(-1, getIntent());
                this.f208660q = true;
            } else {
                Log.m105918d(this.f208649d, "pay cancel");
                mo99133c8(0, getIntent());
                this.f208660q = false;
            }
            return true;
        } else if (extras != null && extras.getBoolean("key_is_realname_verify_process")) {
            return extras.getInt("realname_verify_process_ret", 0) == -1;
        } else {
            Log.m105924i(this.f208649d, "hy: pay not end");
            return false;
        }
    }

    /* renamed from: X7 */
    public void mo99128X7(int i) {
        this.f208636S0 = i;
        Log.m105925i(this.f208649d, "markForceFinish errorType %s %s", Integer.valueOf(i), Util.getStack().toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        r0 = r4.f208650e;
     */
    /* renamed from: Y7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo99129Y7() {
        /*
            r4 = this;
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r1 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FORCE_USE_NEW_CASHIER_INT_SYNC
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.mo119685f(r1, r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            boolean r1 = com.tencent.p014mm.sdk.crash.CrashReportFactory.hasDebuger()
            r3 = 1
            if (r1 != 0) goto L_0x0028
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r1 != 0) goto L_0x0028
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            if (r0 == r3) goto L_0x0035
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r4.f208650e
            if (r0 == 0) goto L_0x0034
            int r0 = r0.f209556V0
            if (r0 != r3) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            return r2
        L_0x0035:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.mo99129Y7():boolean");
    }

    /* renamed from: Z7 */
    public void mo99130Z7(boolean z, int i, String str) {
        String str2 = this.f208649d;
        Log.m105918d(str2, "pay with new bankcard! user's wxpay register status :" + C79029b0.vx0().wx0().mo91341w() + ", need confirm ? " + z);
        if (z) {
            if (Util.isNullOrNil(str)) {
                str = Bankcard.m84544m2(this, i);
            }
            C76879j.m92707A(this, str, "", getString(C0966R.string.l3j), getString(C0966R.string.f7926wf), new C71929j(), new C71931l());
            return;
        }
        mo99116L7();
    }

    /* renamed from: a8 */
    public void mo99131a8(boolean z) {
        C79028b bVar;
        if (mo99113I7()) {
            this.f208646X0 = false;
            Log.m105925i(this.f208649d, "pay with old bankcard! from statck %s", Util.getStack().toString());
            PayInfo payInfo = this.f208665v;
            C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 8, "");
            if (this.f208627L != null) {
                Log.m105928w(this.f208649d, "close previous cashier dialog");
                this.f208627L.dismiss();
            }
            this.f208646X0 = false;
            if (mo99129Y7()) {
                WcPayCashierDialog wcPayCashierDialog = new WcPayCashierDialog(getContext());
                this.f208627L = wcPayCashierDialog;
                WcPayCashierDialog wcPayCashierDialog2 = wcPayCashierDialog;
                PayInfo payInfo2 = this.f208665v;
                Orders orders = this.f208650e;
                FavorPayInfo favorPayInfo = this.f208656n;
                Bankcard bankcard = this.f208655j;
                boolean z2 = !this.f208663t;
                Log.m105925i("MicroMsg.WcPayCashierDialog", "set view data: %s, %s, %s", Boolean.valueOf(z2), Boolean.valueOf(z), bankcard);
                wcPayCashierDialog.f210421L = payInfo2;
                wcPayCashierDialog.f210422M = orders;
                wcPayCashierDialog.f210423N = favorPayInfo;
                if (!z) {
                    wcPayCashierDialog.f210424P = bankcard;
                }
                wcPayCashierDialog.f210426R = z2;
                wcPayCashierDialog.f210430V = "";
                wcPayCashierDialog.mo99701n();
                wcPayCashierDialog.mo99707r();
                wcPayCashierDialog.mo99702o();
                if (!wcPayCashierDialog.f210427S || (bVar = wcPayCashierDialog.f210422M.f209543N.f232084w) == null || bVar.f232035e != 1) {
                    wcPayCashierDialog.mo99713y(8);
                } else {
                    wcPayCashierDialog.f210449t.setUrl(bVar.f232042o);
                    wcPayCashierDialog.f210450u.setText(bVar.f232037g);
                    if (!Util.isNullOrNil(bVar.f232038h)) {
                        wcPayCashierDialog.f210450u.setTextColor(C43423i0.m46931b(bVar.f232038h, true));
                    }
                    wcPayCashierDialog.f210452w.setText(bVar.f232039i);
                    if (!Util.isNullOrNil(bVar.f232040j)) {
                        wcPayCashierDialog.f210452w.setTextColor(C43423i0.m46931b(bVar.f232040j, true));
                    }
                    wcPayCashierDialog.f210452w.setOnClickListener(new C75718f(wcPayCashierDialog, bVar));
                    wcPayCashierDialog.mo99713y(0);
                }
                wcPayCashierDialog.mo99700l();
                wcPayCashierDialog.mo99711u();
                if (wcPayCashierDialog.f210429U) {
                    Log.m105924i("MicroMsg.WcPayCashierDialog", "don't show foreign currency");
                    WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout = wcPayCashierDialog.f210413D;
                    if (wcPayCashierDetailItemLayout != null) {
                        wcPayCashierDialog.f210442n.removeView(wcPayCashierDetailItemLayout);
                        wcPayCashierDialog.f210413D = null;
                    }
                } else if (!Util.isNullOrNil(wcPayCashierDialog.f210422M.f209546Q0) && !Util.isNullOrNil(wcPayCashierDialog.f210422M.f209548R0)) {
                    WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout2 = new WcPayCashierDetailItemLayout(wcPayCashierDialog.getContext());
                    wcPayCashierDialog.f210413D = wcPayCashierDetailItemLayout2;
                    wcPayCashierDialog.f210442n.addView(wcPayCashierDetailItemLayout2, 0);
                    wcPayCashierDialog.f210413D.f210402e.setVisibility(8);
                    wcPayCashierDialog.f210413D.f210404g.setVisibility(8);
                    wcPayCashierDialog.f210413D.f210401d.setText(C0966R.string.lcy);
                    wcPayCashierDialog.f210413D.mo99688a();
                    if (!wcPayCashierDialog.f210422M.f209546Q0.equals("CNY") || Util.isNullOrNil(wcPayCashierDialog.f210422M.f209583y0)) {
                        StringBuilder sb = new StringBuilder(wcPayCashierDialog.f210422M.f209548R0);
                        sb.append(wcPayCashierDialog.f210422M.f209583y0);
                        wcPayCashierDialog.f210413D.f210403f.setText(sb);
                    } else {
                        StringBuilder sb4 = new StringBuilder(wcPayCashierDialog.f210422M.f209548R0);
                        sb4.append(wcPayCashierDialog.f210422M.f209583y0);
                        if (!Util.isNullOrNil(wcPayCashierDialog.f210422M.f209552T0) && !Util.isNullOrNil(wcPayCashierDialog.f210422M.f209554U0)) {
                            Orders orders2 = wcPayCashierDialog.f210422M;
                            sb4.append(String.format("(%s%s)", new Object[]{orders2.f209554U0, orders2.f209550S0}));
                        }
                        wcPayCashierDialog.f210413D.f210403f.setText(sb4);
                    }
                }
                wcPayCashierDialog.mo99708s(wcPayCashierDialog.f210422M.field_infos);
                wcPayCashierDialog.mo99710t();
                wcPayCashierDialog.mo99712v();
                wcPayCashierDialog.mo99695e();
                if (z) {
                    wcPayCashierDialog.setOnShowListener(new C75717e(wcPayCashierDialog));
                }
                wcPayCashierDialog.f210445p0 = new C71925f();
                wcPayCashierDialog.show();
                addDialog(wcPayCashierDialog);
                return;
            }
            C72379f1 t = C72379f1.m84719t(this, !this.f208663t, this.f208650e, this.f208656n, this.f208655j, this.f208665v, this.f208641V, new C71926g(), new C71927h(), new C71928i());
            this.f208627L = t;
            this.f208628M = t;
        }
    }

    /* renamed from: b8 */
    public void mo99132b8(boolean z, int i, String str) {
        String str2 = this.f208649d;
        Log.m105918d(str2, "pay with select bankcard! need confirm ? " + z);
        if (z) {
            if (Util.isNullOrNil(str)) {
                str = Bankcard.m84544m2(this, i);
            }
            C76879j.m92707A(this, str, "", getString(C0966R.string.f361599l42), getString(C0966R.string.f7926wf), new C71932m(i), new C71933n());
        } else if (mo99129Y7()) {
            mo99131a8(true);
        } else {
            mo99125U7(i, false);
        }
    }

    /* renamed from: c8 */
    public final void mo99133c8(int i, Intent intent) {
        Orders orders;
        PayInfo payInfo = this.f208665v;
        if (!(payInfo == null || payInfo.f212587e != 46 || (orders = this.f208650e) == null)) {
            intent.putExtra("key_total_fee", orders.f209566h);
            Log.m105925i(this.f208649d, "sentCancelEvent set fee:%s", Double.valueOf(this.f208650e.f209566h));
        }
        WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
        WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
        aVar.f194086a = intent;
        int i2 = this.f208636S0;
        if (i2 == 1) {
            aVar.f194087b = 1000;
        } else if (i2 == 2) {
            aVar.f194087b = 1001;
        }
        aVar.f194088c = i;
        PayInfo payInfo2 = this.f208665v;
        aVar.f194089d = payInfo2 == null ? "" : payInfo2.f212592j;
        aVar.f194092g = 1;
        if (payInfo2 != null && i == 0) {
            C20511b.m22216a(payInfo2.f212592j, payInfo2.f212587e, payInfo2.f212589g);
        }
        walletPayResultEvent.publish();
    }

    public boolean checkProcLife() {
        return false;
    }

    public void cleanUiData(int i) {
        if (i == 0) {
            if (isTransparent()) {
                finish();
            }
        } else if (i == 1) {
            mo99131a8(false);
        }
    }

    /* renamed from: d8 */
    public void mo99134d8(Bundle bundle) {
        this.f208661r = true;
        Orders orders = this.f208650e;
        if (orders != null) {
            bundle.putInt("key_support_bankcard", orders.f209567i);
            bundle.putString("key_reqKey", this.f208650e.f209563e);
            List<Orders.Commodity> list = this.f208650e.f209542M;
            if (list != null && ((ArrayList) list).size() > 0) {
                bundle.putString("key_TransId", ((Orders.Commodity) ((ArrayList) this.f208650e.f209542M).get(0)).f209606r);
            }
            bundle.putLong("key_SessionId", this.f208630P);
        }
        PayInfo payInfo = this.f208665v;
        if (payInfo != null) {
            bundle.putInt("key_scene", payInfo.f212587e);
        }
        bundle.putBoolean("key_is_oversea", true ^ mo99126V7());
        bundle.putInt("is_deduct_open", this.f208645X);
        C71940u uVar = new C71940u();
        this.f208662s = uVar;
        C79143a.m95771j(this, C67154b.class, bundle, uVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: e8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo99135e8() {
        /*
            r13 = this;
            com.tencent.mm.plugin.wallet_core.ui.l r0 = r13.f208657o
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r1 = r13.f208656n
            java.lang.String r1 = r1.f209524d
            y43.n r0 = r0.mo99770f(r1)
            com.tencent.mm.plugin.wallet_core.ui.l r1 = r13.f208657o
            java.util.List r1 = r1.mo99772i()
            com.tencent.mm.plugin.wallet_core.ui.l r2 = r13.f208657o
            y43.l r2 = r2.f210614a
            java.lang.String r3 = ","
            r4 = 1
            java.lang.String r5 = ""
            r6 = 0
            r7 = 0
            if (r0 == 0) goto L_0x004c
            double r9 = r0.f232091j
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 <= 0) goto L_0x0049
            java.lang.String r11 = r0.f232093o
            java.lang.String r12 = r0.f232094p
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 != 0) goto L_0x0046
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r3)
            java.lang.String r11 = r0.f232094p
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            r12 = r11
            r10 = r9
            r9 = 1
            goto L_0x0050
        L_0x0046:
            r12 = r11
            r10 = r9
            goto L_0x004f
        L_0x0049:
            r12 = r5
            r10 = r9
            goto L_0x004e
        L_0x004c:
            r12 = r5
            r10 = r7
        L_0x004e:
            r4 = 0
        L_0x004f:
            r9 = 0
        L_0x0050:
            if (r4 != 0) goto L_0x007b
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x007b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            if (r9 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r3 = r5
        L_0x0066:
            r1.append(r3)
            androidx.appcompat.app.AppCompatActivity r3 = r13.getContext()
            r4 = 2131839573(0x7f114a55, float:1.9312401E38)
            java.lang.String r3 = r3.getString(r4)
            r1.append(r3)
            java.lang.String r12 = r1.toString()
        L_0x007b:
            int r1 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b4
            if (r2 == 0) goto L_0x00b4
            int r1 = r2.f232074j
            if (r1 != 0) goto L_0x00b4
            if (r0 == 0) goto L_0x0092
            android.widget.TextView r1 = r13.f208616A
            double r2 = r0.f232090i
            java.lang.String r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r2)
            r1.setText(r0)
        L_0x0092:
            android.widget.TextView r0 = r13.f208619D
            com.tencent.mm.plugin.wallet_core.model.Orders r1 = r13.f208650e
            java.lang.String r1 = r1.f209568j
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90254k(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r13.f208618C
            com.tencent.mm.plugin.wallet_core.model.Orders r1 = r13.f208650e
            double r2 = r1.f209566h
            java.lang.String r1 = r1.f209568j
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r2, r1)
            r0.setText(r1)
            android.widget.TextView r0 = r13.f208618C
            r0.setVisibility(r6)
            goto L_0x00d5
        L_0x00b4:
            android.widget.TextView r0 = r13.f208616A
            com.tencent.mm.plugin.wallet_core.model.Orders r1 = r13.f208650e
            double r1 = r1.f209566h
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r13.f208619D
            com.tencent.mm.plugin.wallet_core.model.Orders r1 = r13.f208650e
            java.lang.String r1 = r1.f209568j
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90254k(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r13.f208618C
            r1 = 8
            r0.setVisibility(r1)
        L_0x00d5:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r0 != 0) goto L_0x00e0
            android.widget.TextView r0 = r13.f208624I
            r0.setText(r12)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.mo99135e8():void");
    }

    /* renamed from: f8 */
    public final void mo99136f8() {
        if (this.f208635S) {
            this.f208671z.setOnClickListener(new C71917a());
        } else {
            this.f208671z.setOnClickListener(new C5759b());
        }
    }

    public void finish() {
        Log.m105925i(this.f208649d, "finish %s %s mPayResultType:%s", Integer.valueOf(hashCode()), Util.getStack().toString(), Integer.valueOf(this.mPayResultType));
        cancelQRPay();
        Orders orders = this.f208650e;
        if (orders != null && !((ArrayList) orders.f209542M).isEmpty()) {
            getIntent().putExtra("key_trans_id", ((Orders.Commodity) ((ArrayList) this.f208650e.f209542M).get(0)).f209606r);
        }
        if (this.f208665v != null) {
            getIntent().putExtra("key_reqKey", this.f208665v.f212592j);
        }
        if (this.f208660q) {
            if (this.f208650e != null) {
                getIntent().putExtra("key_total_fee", this.f208650e.f209566h);
            }
            getIntent().putExtra("key_pay_reslut_type", 1);
            mo99133c8(-1, getIntent());
            setResult(-1, getIntent());
        } else {
            PayInfo payInfo = this.f208665v;
            if (!(payInfo == null || payInfo.f212587e != 8 || this.f208650e == null)) {
                payInfo.f212580K = 0;
                doSceneProgress(C67341a.m79678a(mo99121Q7(), this.f208650e, true), false);
                Bundle bundle = this.f208665v.f212600u;
                if (bundle != null) {
                    C115669n.INSTANCE.mo160131h(13956, 3, Long.valueOf(System.currentTimeMillis() - bundle.getLong("extinfo_key_9")));
                }
            }
            mo99133c8(0, getIntent());
            getIntent().putExtra("key_pay_reslut_type", this.mPayResultType);
            int i = this.f208636S0;
            if (i == 1) {
                getIntent().putExtra("key_pay_reslut_type", 1000);
            } else if (i == 2) {
                getIntent().putExtra("key_pay_reslut_type", 1001);
            }
            setResult(0, getIntent());
            if (C79029b0.vx0().wx0().mo91343y()) {
                PayInfo payInfo2 = this.f208665v;
                C75155x0.m90135a(payInfo2 == null ? 0 : payInfo2.f212587e, payInfo2 == null ? "" : payInfo2.f212592j, 18, "");
            } else if (C79029b0.vx0().wx0().mo91342x()) {
                PayInfo payInfo3 = this.f208665v;
                C75155x0.m90135a(payInfo3 == null ? 0 : payInfo3.f212587e, payInfo3 == null ? "" : payInfo3.f212592j, 4, "");
            } else {
                PayInfo payInfo4 = this.f208665v;
                C75155x0.m90135a(payInfo4 == null ? 0 : payInfo4.f212587e, payInfo4 == null ? "" : payInfo4.f212592j, 7, "");
            }
            Iterator it = ((ArrayList) C79143a.m95767f("PayProcess")).iterator();
            while (it.hasNext()) {
                C79148e eVar = (C79148e) it.next();
                eVar.getClass();
                eVar.mo109107a("specEndProcessWithoutFinish");
                Bundle bundle2 = eVar.f232423c;
                if (bundle2 != null) {
                    bundle2.clear();
                }
                C79143a.m95770i(eVar.getClass().hashCode());
                eVar.mo91269x();
            }
        }
        C79148e process = getProcess();
        if (process != null) {
            WeakReference<Context> weakReference = process.f232422b;
            if (this == (weakReference != null ? weakReference.get() : null)) {
                Log.m105924i(this.f208649d, "remove process end callback to prevent ui leak");
                process.f232421a = null;
                process.f232422b = null;
            }
        }
        super.finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x02cd  */
    /* renamed from: g8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99137g8() {
        /*
            r27 = this;
            r0 = r27
            com.tencent.mm.plugin.wallet_core.model.Orders r1 = r0.f208650e
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = r0.f208649d
            java.lang.String r2 = "updatePaymentMethodForFavor mOrders is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            return
        L_0x000f:
            android.widget.TextView r1 = r0.f208621F
            r2 = 8
            r1.setVisibility(r2)
            android.widget.TextView r1 = r0.f208620E
            r1.setVisibility(r2)
            android.widget.Button r1 = r0.f208671z
            r3 = 2131839488(0x7f114a00, float:1.9312229E38)
            r1.setText(r3)
            android.widget.TextView r1 = r0.f208631Q
            r3 = 0
            r1.setVisibility(r3)
            android.widget.LinearLayout r1 = r0.f208633R
            r1.setVisibility(r3)
            android.widget.LinearLayout r1 = r0.f208633R
            r4 = 2131297601(0x7f090541, float:1.8213152E38)
            android.view.View r1 = r1.findViewById(r4)
            android.widget.LinearLayout r4 = r0.f208633R
            r5 = 2131296672(0x7f0901a0, float:1.8211267E38)
            android.view.View r4 = r4.findViewById(r5)
            com.tencent.mm.plugin.wallet_core.model.Orders r5 = r0.f208650e
            java.lang.String r5 = r5.f209536G
            java.lang.String r6 = "CFT"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x008d
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r5.mo10233c(r6)
            java.lang.Object[] r7 = r5.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r9 = "updatePaymentMethodForFavor"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r4
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r5 = r5.mo10231a(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r7 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r8 = "updatePaymentMethodForFavor"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x00cd
        L_0x008d:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r5.mo10233c(r6)
            java.lang.Object[] r7 = r5.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r9 = "updatePaymentMethodForFavor"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r4
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r5 = r5.mo10231a(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r4.setVisibility(r5)
            java.lang.String r7 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r8 = "updatePaymentMethodForFavor"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
        L_0x00cd:
            android.widget.LinearLayout r5 = r0.f208633R
            r6 = 2131297595(0x7f09053b, float:1.821314E38)
            android.view.View r5 = r5.findViewById(r6)
            r13 = r5
            android.widget.CheckedTextView r13 = (android.widget.CheckedTextView) r13
            android.widget.LinearLayout r5 = r0.f208633R
            r6 = 2131296671(0x7f09019f, float:1.8211265E38)
            android.view.View r5 = r5.findViewById(r6)
            r14 = r5
            android.widget.CheckedTextView r14 = (android.widget.CheckedTextView) r14
            r15 = 1
            r1.setEnabled(r15)
            com.tencent.mm.plugin.wallet_core.model.Orders r5 = r0.f208650e
            if (r5 == 0) goto L_0x0105
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r5 = r5.f209542M
            if (r5 == 0) goto L_0x0105
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0105
            com.tencent.mm.plugin.wallet_core.model.Orders r5 = r0.f208650e
            int r5 = r5.f209571p
            if (r5 != r15) goto L_0x0101
            r5 = 1
            goto L_0x0102
        L_0x0101:
            r5 = 0
        L_0x0102:
            r16 = r5
            goto L_0x0107
        L_0x0105:
            r16 = 0
        L_0x0107:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r0.f208655j
            if (r5 != 0) goto L_0x014e
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r12.mo10233c(r5)
            java.lang.Object[] r6 = r12.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r8 = "updatePaymentMethodForFavor"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r5 = r1
            r15 = r12
            r12 = r17
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r15.mo10231a(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r7 = "updatePaymentMethodForFavor"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r1
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0195
        L_0x014e:
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r15.mo10233c(r5)
            java.lang.Object[] r6 = r15.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r8 = "updatePaymentMethodForFavor"
            java.lang.String r9 = "()V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r5 = r1
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r5 = r15.mo10231a(r3)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.setVisibility(r5)
            java.lang.String r6 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r7 = "updatePaymentMethodForFavor"
            java.lang.String r8 = "()V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r5 = r1
            j20.C117292a.m165359e(r5, r6, r7, r8, r9, r10, r11)
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$a0 r5 = new com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$a0
            r5.<init>(r13, r14)
            r1.setOnClickListener(r5)
        L_0x0195:
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$b0 r5 = new com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$b0
            r5.<init>(r13, r14)
            r4.setOnClickListener(r5)
            android.widget.TextView r4 = r0.f208631Q
            r4.setVisibility(r3)
            android.widget.LinearLayout r4 = r0.f208633R
            r4.setVisibility(r3)
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r4 = r0.f208656n
            if (r4 == 0) goto L_0x01d5
            com.tencent.mm.plugin.wallet_core.ui.m r4 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m.INSTANCE
            com.tencent.mm.plugin.wallet_core.model.Orders r5 = r0.f208650e
            com.tencent.mm.plugin.wallet_core.ui.l r4 = r4.mo99776a(r5)
            r0.f208657o = r4
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r5 = r0.f208656n
            java.lang.String r5 = r5.f209524d
            y43.n r4 = r4.mo99770f(r5)
            if (r4 == 0) goto L_0x01d5
            double r4 = r4.f232087f
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01d5
            android.widget.LinearLayout r4 = r0.f208633R
            r4.setVisibility(r2)
            android.widget.TextView r4 = r0.f208631Q
            r4.setVisibility(r2)
            r4 = 1
            r18 = 1
            goto L_0x01d8
        L_0x01d5:
            r4 = 1
            r18 = 0
        L_0x01d8:
            r0.f208635S = r4
            if (r18 == 0) goto L_0x01de
            r0.f208635S = r3
        L_0x01de:
            r13.setChecked(r3)
            r14.setChecked(r4)
            java.lang.String r4 = r0.f208649d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "updatePaymentMethodForFavor needbindcardtoshowfavinfo is "
            r5.append(r6)
            com.tencent.mm.plugin.wallet_core.model.Orders r6 = r0.f208650e
            int r6 = r6.f209544P
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            com.tencent.mm.plugin.wallet_core.model.Orders r4 = r0.f208650e
            int r4 = r4.f209544P
            r5 = 2131297609(0x7f090549, float:1.8213168E38)
            r6 = 2131301068(0x7f0912cc, float:1.8220183E38)
            r7 = 1
            if (r4 != r7) goto L_0x02cd
            android.widget.LinearLayout r4 = r0.f208633R
            android.view.View r4 = r4.findViewById(r6)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6.mo10233c(r7)
            java.lang.Object[] r15 = r6.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r17 = "updatePaymentMethodForFavor"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r4
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r15 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r16 = "updatePaymentMethodForFavor"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.widget.LinearLayout r4 = r0.f208633R
            r6 = 2131301067(0x7f0912cb, float:1.8220181E38)
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            com.tencent.mm.plugin.wallet_core.model.Orders r6 = r0.f208650e
            java.lang.String r6 = r6.f209545Q
            r4.setText(r6)
            com.tencent.mm.plugin.wallet_core.model.Orders r4 = r0.f208650e
            java.lang.String r4 = r4.f209547R
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            r6 = 2131302249(0x7f091769, float:1.8222579E38)
            if (r4 != 0) goto L_0x0295
            android.widget.LinearLayout r4 = r0.f208633R
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = " ("
            r6.append(r7)
            com.tencent.mm.plugin.wallet_core.model.Orders r7 = r0.f208650e
            java.lang.String r7 = r7.f209547R
            r6.append(r7)
            java.lang.String r7 = ")"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.setText(r6)
            goto L_0x02a2
        L_0x0295:
            android.widget.LinearLayout r4 = r0.f208633R
            android.view.View r4 = r4.findViewById(r6)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r6 = ""
            r4.setText(r6)
        L_0x02a2:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r0.f208655j
            if (r4 == 0) goto L_0x035b
            boolean r4 = r4.mo99388n2()
            if (r4 == 0) goto L_0x035b
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r0.f208655j
            java.lang.String r4 = r4.field_forbidWord
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x035b
            r1.setEnabled(r3)
            r13.setVisibility(r2)
            android.widget.LinearLayout r1 = r0.f208633R
            android.view.View r1 = r1.findViewById(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r0.f208655j
            java.lang.String r2 = r2.field_forbidWord
            r1.setText(r2)
            goto L_0x035b
        L_0x02cd:
            android.widget.LinearLayout r4 = r0.f208633R
            android.view.View r4 = r4.findViewById(r6)
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            r6.mo10233c(r7)
            java.lang.Object[] r20 = r6.mo10232b()
            java.lang.String r21 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r22 = "updatePaymentMethodForFavor"
            java.lang.String r23 = "()V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            r19 = r4
            j20.C117292a.m165358d(r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Object r6 = r6.mo10231a(r3)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.setVisibility(r6)
            java.lang.String r20 = "com/tencent/mm/plugin/wallet/pay/ui/WalletPayUI"
            java.lang.String r21 = "updatePaymentMethodForFavor"
            java.lang.String r22 = "()V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            j20.C117292a.m165359e(r19, r20, r21, r22, r23, r24, r25)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r0.f208655j
            if (r4 == 0) goto L_0x033c
            boolean r4 = r4.mo99388n2()
            if (r4 == 0) goto L_0x033c
            com.tencent.mm.plugin.wallet_core.model.Bankcard r4 = r0.f208655j
            java.lang.String r4 = r4.field_forbidWord
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x033c
            r1.setEnabled(r3)
            r13.setVisibility(r2)
            android.widget.LinearLayout r1 = r0.f208633R
            android.view.View r1 = r1.findViewById(r5)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.tencent.mm.plugin.wallet_core.model.Bankcard r2 = r0.f208655j
            java.lang.String r2 = r2.field_forbidWord
            r1.setText(r2)
            goto L_0x035b
        L_0x033c:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = r0.f208655j
            if (r1 == 0) goto L_0x035b
            boolean r1 = r1.mo99388n2()
            if (r1 == 0) goto L_0x035b
            com.tencent.mm.plugin.wallet_core.model.Bankcard r1 = r0.f208655j
            java.lang.String r1 = r1.field_forbidWord
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x035b
            if (r16 != 0) goto L_0x035b
            r1 = 1
            r13.setChecked(r1)
            r14.setChecked(r3)
            r0.f208635S = r3
        L_0x035b:
            r27.mo99136f8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.mo99137g8():void");
    }

    public boolean getCancelable() {
        return false;
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cfy;
    }

    /* renamed from: i8 */
    public void mo99139i8() {
        List<Orders.Commodity> list;
        Orders orders = this.f208650e;
        if (!(orders == null || (list = orders.f209542M) == null || ((ArrayList) list).size() <= 0)) {
            this.f208616A.setText(C75228t.m90260n(this.f208650e.f209566h));
            this.f208619D.setText(C75228t.m90254k(this.f208650e.f209568j));
            this.f208626K.mo99144a();
            if (((ArrayList) this.f208650e.f209542M).size() > 1) {
                this.f208622G.setVisibility(0);
                TextView textView = this.f208617B;
                textView.setText(getString(C0966R.string.l4u, new Object[]{((Orders.Commodity) ((ArrayList) this.f208650e.f209542M).get(0)).f209599h, ((ArrayList) this.f208650e.f209542M).size() + ""}));
            } else {
                this.f208617B.setText(((Orders.Commodity) ((ArrayList) this.f208650e.f209542M).get(0)).f209599h);
                this.f208622G.setVisibility(8);
            }
            this.f208666w = false;
            int i = this.f208650e.f209571p;
        }
        PayInfo payInfo = this.f208665v;
        if (payInfo != null && payInfo.f212587e == 48) {
            this.f208617B.setText(C0966R.string.hpd);
        }
        this.f208620E.setVisibility(8);
        this.f208621F.setVisibility(8);
        this.f208631Q.setVisibility(8);
        this.f208633R.setVisibility(8);
        this.f208671z.setText(C0966R.string.l3g);
        Bankcard bankcard = this.f208655j;
        if (bankcard == null || !bankcard.mo99388n2()) {
            if (C79029b0.vx0().wx0().mo91343y()) {
                mo99137g8();
            }
        } else if (!Util.isNullOrNil(this.f208655j.field_forbidWord)) {
            this.f208620E.setText(this.f208655j.field_forbidWord);
            this.f208620E.setVisibility(4);
            this.f208621F.setVisibility(8);
            if (C79029b0.vx0().wx0().mo91342x()) {
                mo99137g8();
            }
        } else if (C79029b0.vx0().wx0().mo91342x()) {
            mo99137g8();
        }
        boolean z = C79029b0.vx0().wx0().mo91342x() || C79029b0.vx0().wx0().mo91343y();
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.li4);
        if (!z || this.f208656n == null || this.f208657o == null || !this.f208658p || this.f208650e == null) {
            linearLayout.setVisibility(8);
        } else {
            mo99135e8();
            this.f208624I.setOnClickListener(new C71945z());
            linearLayout.setVisibility(0);
        }
        if (this.f208650e == null || this.f208654i == null || this.f208665v == null) {
            this.f208671z.setClickable(false);
            this.f208671z.setEnabled(false);
        } else {
            this.f208671z.setClickable(true);
            this.f208671z.setEnabled(true);
        }
        if (this.f208650e == null) {
            this.f208621F.setVisibility(8);
        }
    }

    public void initView() {
        C85875k4.m106177d0(getWindow());
        MMScrollView mMScrollView = (MMScrollView) findViewById(C0966R.C0970id.ljl);
        mMScrollView.mo104932a(mMScrollView, mMScrollView);
        Button button = (Button) findViewById(C0966R.C0970id.f359560lj1);
        this.f208671z = button;
        button.setClickable(false);
        this.f208671z.setEnabled(false);
        this.f208616A = (TextView) findViewById(C0966R.C0970id.liq);
        this.f208617B = (TextView) findViewById(C0966R.C0970id.lip);
        this.f208619D = (TextView) findViewById(C0966R.C0970id.li7);
        this.f208624I = (TextView) findViewById(C0966R.C0970id.f359558li3);
        this.f208618C = (TextView) findViewById(C0966R.C0970id.lie);
        this.f208623H = (TextView) findViewById(C0966R.C0970id.lix);
        this.f208618C.getPaint().setFlags(16);
        this.f208620E = (TextView) findViewById(C0966R.C0970id.f359561lj2);
        TextView textView = (TextView) findViewById(C0966R.C0970id.liy);
        this.f208621F = textView;
        textView.setOnClickListener(new C71942w());
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.f359555li0);
        this.f208622G = imageView;
        imageView.setOnClickListener(new C71943x());
        this.f208625J = (LinearLayout) findViewById(C0966R.C0970id.lib);
        this.f208626K = new C71921c0();
        this.f208671z.setOnClickListener(new C71944y());
        this.f208671z.setText(C0966R.string.l3g);
        this.f208631Q = (TextView) findViewById(C0966R.C0970id.htk);
        this.f208633R = (LinearLayout) findViewById(C0966R.C0970id.htj);
        mo99139i8();
    }

    public boolean isTransparent() {
        Bankcard bankcard;
        if (this.f208647Y) {
            String str = this.f208649d;
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(mo99124T7() == null || !mo99124T7().f212590h);
            objArr[1] = Util.getStack().toString();
            Log.m105925i(str, "case 1 %s,  stack %s", objArr);
            Log.m105919d(this.f208649d, "case 2 %s,", Boolean.valueOf(!C79029b0.vx0().wx0().mo91341w()));
            String str2 = this.f208649d;
            Object[] objArr2 = new Object[2];
            ArrayList<Bankcard> arrayList = this.f208654i;
            objArr2[0] = Integer.valueOf(arrayList == null ? 0 : arrayList.size());
            Bankcard bankcard2 = this.f208655j;
            objArr2[1] = bankcard2 == null ? "" : bankcard2.field_forbidWord;
            Log.m105919d(str2, "case 3 mBankcardList %s, mDefaultBankcard %s", objArr2);
            if (mo99124T7() == null || !mo99124T7().f212590h) {
                Log.m105924i(this.f208649d, "get isTransparent1");
                return false;
            }
            int i = this.f208665v.f212587e;
            if (i == 45 || i == 52) {
                Log.m105924i(this.f208649d, "lqt must be transparent");
                return true;
            } else if (!C79029b0.vx0().wx0().mo91341w()) {
                Log.m105924i(this.f208649d, "get isTransparent2");
                return false;
            } else {
                ArrayList<Bankcard> arrayList2 = this.f208654i;
                if (arrayList2 == null || (arrayList2.size() != 0 && ((bankcard = this.f208655j) == null || Util.isNullOrNil(bankcard.field_forbidWord)))) {
                    Log.m105924i(this.f208649d, "get isTransparent4");
                    return true;
                }
                String str3 = this.f208649d;
                Object[] objArr3 = new Object[2];
                ArrayList<Bankcard> arrayList3 = this.f208654i;
                objArr3[0] = Boolean.valueOf(arrayList3 != null && arrayList3.size() == 0);
                Bankcard bankcard3 = this.f208655j;
                objArr3[1] = Boolean.valueOf(bankcard3 != null && !Util.isNullOrNil(bankcard3.field_forbidWord));
                Log.m105925i(str3, "get isTransparent3 1 %s 2 %s", objArr3);
                return false;
            }
        } else {
            Log.m105924i(this.f208649d, "get isTransparent5");
            return true;
        }
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Orders.DeductInfo deductInfo;
        String str = this.f208649d;
        Log.m105924i(str, "onAcvityResult requestCode:" + i + ", resultCode:" + i2);
        if (i == 0) {
            if (i2 == -1) {
                if (intent != null) {
                    int intExtra = intent.getIntExtra("auto_deduct_flag", -1);
                    this.f208645X = intExtra;
                    Orders orders = this.f208650e;
                    if (!(orders == null || (deductInfo = orders.f209549S) == null)) {
                        deductInfo.f209617f = intExtra;
                    }
                    PayInfo T7 = mo99124T7();
                    int i3 = this.f208645X;
                    T7.f212577H = i3;
                    if (i3 == 1) {
                        mo99124T7().f212578I = intent.getStringExtra("deduct_bank_type");
                        mo99124T7().f212579J = intent.getStringExtra("deduct_bind_serial");
                    }
                }
                this.f208643W = true;
                onProgressFinish();
            } else {
                finish();
            }
            C115669n.INSTANCE.mo160131h(13958, 3);
        } else if (i == 1) {
            this.f208627L.dismiss();
            this.f208669y = false;
            mo99120P7();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r29) {
        /*
            r28 = this;
            r0 = r28
            super.onCreate(r29)
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            super.setRequestedOrientation(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "MicroMsg.WalletPayUI@"
            r3.append(r4)
            int r4 = r28.hashCode()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.f208649d = r3
            boolean r4 = f208614Y0
            r5 = 2
            if (r4 == 0) goto L_0x0040
            java.lang.String r1 = "has Undestory WalletPayUI!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r1)
            com.tencent.mm.plugin.report.service.n r6 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r7 = 965(0x3c5, double:4.77E-321)
            r9 = 1
            r11 = 1
            r6.mo175913w(r7, r9, r11)
            r0.mo99128X7(r5)
            r28.finish()
            return
        L_0x0040:
            f208614Y0 = r1
            long r3 = java.lang.System.currentTimeMillis()
            android.content.Intent r6 = r28.getIntent()
            java.lang.String r7 = "key_context_hashcode"
            r8 = -1
            int r6 = r6.getIntExtra(r7, r8)
            java.util.List<com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d0> r7 = f208615Z0
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r7 = r7.size()
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d0[] r7 = new com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71923d0[r7]
            java.lang.String r9 = r0.f208649d
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.util.List<com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d0> r11 = f208615Z0
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            int r11 = r11.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 0
            r10[r12] = r11
            int r11 = r28.hashCode()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r10[r1] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            r10[r5] = r11
            java.lang.String r11 = "WalletPayUI check %s this %s fromHashCode %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r11, r10)
            java.util.List<com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d0> r9 = f208615Z0
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object[] r7 = r9.toArray(r7)
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d0[] r7 = (com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.C71923d0[]) r7
            int r9 = r7.length
            r10 = 0
        L_0x0090:
            if (r10 >= r9) goto L_0x00e2
            r11 = r7[r10]
            java.lang.ref.WeakReference<com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI> r13 = r11.f208684b
            java.lang.Object r13 = r13.get()
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI r13 = (com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI) r13
            if (r13 == 0) goto L_0x00de
            java.lang.String r14 = r0.f208649d
            java.lang.Object[] r15 = new java.lang.Object[r1]
            int r16 = r13.hashCode()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r15[r12] = r16
            java.lang.String r12 = "has old payui, both finish %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r14, r12, r15)
            int r12 = r11.f208685c
            if (r6 != r12) goto L_0x00c6
            if (r6 == r8) goto L_0x00c6
            r13.mo99128X7(r5)
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 965(0x3c5, double:4.77E-321)
            r17 = 41
            r19 = 1
            r14.mo175913w(r15, r17, r19)
            goto L_0x00d4
        L_0x00c6:
            r13.mo99128X7(r1)
            com.tencent.mm.plugin.report.service.n r21 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r22 = 965(0x3c5, double:4.77E-321)
            r24 = 40
            r26 = 1
            r21.mo175913w(r22, r24, r26)
        L_0x00d4:
            java.util.List<com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d0> r12 = f208615Z0
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.remove(r11)
            r13.finish()
        L_0x00de:
            int r10 = r10 + 1
            r12 = 0
            goto L_0x0090
        L_0x00e2:
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d0 r5 = new com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d0
            r7 = 0
            r5.<init>(r0, r7)
            r0.f208640U0 = r5
            r5.f208683a = r3
            r5.f208685c = r6
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r5.f208684b = r3
            java.util.List<com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d0> r3 = f208615Z0
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$d0 r4 = r0.f208640U0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r4)
            boolean r3 = f40.C86709a0.m107522a()
            if (r3 != 0) goto L_0x010f
            java.lang.String r1 = r0.f208649d
            java.lang.String r2 = "hy: account not ready. finish now"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            r28.finish()
            return
        L_0x010f:
            android.view.Window r3 = r28.getWindow()
            android.view.View r3 = r3.getDecorView()
            java.lang.Runnable r4 = r0.f208638T0
            r5 = 5000(0x1388, double:2.4703E-320)
            r3.postDelayed(r4, r5)
            long r3 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r0.f208642V0 = r3
            com.tencent.mm.sdk.event.IListener r3 = r0.f208644W0
            r3.alive()
            r3 = 5
            b63.C113146l.m154807e(r3)
            android.content.Intent r3 = r28.getIntent()
            q43.a r3 = q43.C77302a.m93124d(r3)
            r0.f208668x0 = r3
            r3 = 2131839538(0x7f114a32, float:1.931233E38)
            r0.setMMTitle((int) r3)
            com.tencent.mm.pluginsdk.wallet.PayInfo r3 = r28.mo99124T7()
            r0.f208665v = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "key_is_force_use_given_card"
            r5 = 0
            boolean r3 = r3.getBooleanExtra(r4, r5)
            r0.f208663t = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r4 = "key_force_use_bind_serail"
            java.lang.String r3 = r3.getStringExtra(r4)
            java.lang.String r4 = ""
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r4)
            r0.f208664u = r3
            android.content.Intent r3 = r28.getIntent()
            java.lang.String r5 = "key_receiver_true_name"
            java.lang.String r3 = r3.getStringExtra(r5)
            r0.f208641V = r3
            com.tencent.mm.pluginsdk.wallet.PayInfo r3 = r0.f208665v
            if (r3 == 0) goto L_0x017e
            long r5 = r3.f212575F
            r8 = 0
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x017b
            goto L_0x017e
        L_0x017b:
            r0.f208630P = r5
            goto L_0x0184
        L_0x017e:
            long r5 = java.lang.System.currentTimeMillis()
            r0.f208630P = r5
        L_0x0184:
            y43.b0 r3 = y43.C79029b0.vx0()
            b63.s0 r3 = r3.wx0()
            boolean r3 = r3.mo91341w()
            if (r3 != 0) goto L_0x01a3
            com.tencent.mm.pluginsdk.wallet.PayInfo r3 = r0.f208665v
            if (r3 != 0) goto L_0x0198
            r5 = 0
            goto L_0x019a
        L_0x0198:
            int r5 = r3.f212587e
        L_0x019a:
            if (r3 != 0) goto L_0x019e
            r3 = r4
            goto L_0x01a0
        L_0x019e:
            java.lang.String r3 = r3.f212592j
        L_0x01a0:
            com.tencent.p014mm.wallet_core.model.C75155x0.m90135a(r5, r3, r1, r4)
        L_0x01a3:
            boolean r3 = r28.mo99127W7()
            if (r3 != 0) goto L_0x01fb
            java.lang.String r3 = r0.f208649d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "PayInfo = "
            r4.append(r5)
            com.tencent.mm.pluginsdk.wallet.PayInfo r5 = r0.f208665v
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)
            com.tencent.mm.pluginsdk.wallet.PayInfo r3 = r0.f208665v
            if (r3 == 0) goto L_0x01d1
            java.lang.String r3 = r3.f212592j
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x01d1
            r28.mo99120P7()
            goto L_0x01f2
        L_0x01d1:
            com.tencent.mm.pluginsdk.wallet.PayInfo r3 = r0.f208665v
            if (r3 == 0) goto L_0x01e2
            java.lang.String r3 = r3.f212599t
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x01e2
            com.tencent.mm.pluginsdk.wallet.PayInfo r3 = r0.f208665v
            java.lang.String r3 = r3.f212599t
            goto L_0x01e9
        L_0x01e2:
            r3 = 2131839531(0x7f114a2b, float:1.9312316E38)
            java.lang.String r3 = r0.getString(r3)
        L_0x01e9:
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$v r4 = new com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI$v
            r4.<init>()
            r5 = 0
            nj3.C76879j.m92713G(r0, r3, r7, r5, r4)
        L_0x01f2:
            jm2.f r3 = jm2.C117361f.INSTANCE
            r3.Tj0()
            r28.initView()
            goto L_0x0205
        L_0x01fb:
            java.lang.String r3 = r0.f208649d
            java.lang.String r4 = "hy: pay end on create. finish"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            r28.finish()
        L_0x0205:
            com.tencent.mm.pluginsdk.wallet.PayInfo r3 = r0.f208665v
            if (r3 == 0) goto L_0x023b
            java.lang.String r3 = r3.f212583N
            java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> r4 = c53.C67342b.f193187a
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r4 == 0) goto L_0x0214
            goto L_0x023b
        L_0x0214:
            java.util.Map<java.lang.String, java.lang.Integer> r4 = c53.C67342b.f193189c
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L_0x0234
            java.util.Map<java.lang.String, java.lang.Integer> r4 = c53.C67342b.f193189c
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            java.lang.Object r4 = r4.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 != 0) goto L_0x022b
            goto L_0x0234
        L_0x022b:
            int r2 = r4.intValue()
            int r2 = r2 + r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0234:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = c53.C67342b.f193189c
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r3, r2)
        L_0x023b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.pay.p121ui.WalletPayUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C71950a aVar = this.f208629N;
        if (aVar != null) {
            aVar.mo99166a();
            C71950a aVar2 = this.f208629N;
            aVar2.f208718c = null;
            aVar2.f208717b = null;
        }
        this.f208644W0.dead();
        this.f208628M = null;
        getWindow().getDecorView().removeCallbacks(this.f208638T0);
        ((ArrayList) f208615Z0).remove(this.f208640U0);
        f208614Y0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        for (C71923d0 d0Var : (C71923d0[]) ((ArrayList) f208615Z0).toArray(new C71923d0[((ArrayList) f208615Z0).size()])) {
            WalletPayUI walletPayUI = d0Var.f208684b.get();
            if (walletPayUI != null && currentTimeMillis - d0Var.f208683a > 600000) {
                Log.m105928w(this.f208649d, "has old payui, both finish");
                C115669n.INSTANCE.mo175913w(965, 2, 1);
                ((ArrayList) f208615Z0).remove(d0Var);
                walletPayUI.mo99128X7(1);
                walletPayUI.finish();
            }
        }
        PayInfo payInfo = this.f208665v;
        if (payInfo != null) {
            String str = payInfo.f212583N;
            Map<String, List<Integer>> map = C67342b.f193187a;
            if (!Util.isNullOrNil(str)) {
                ((ConcurrentHashMap) C67342b.f193189c).remove(str);
            }
        }
        setAuthState(false);
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        PayInfo payInfo;
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        if (isAuthDoing()) {
            Log.m105928w(this.f208649d, "block when authening");
            return true;
        }
        if (this.f208627L == null || (payInfo = this.f208665v) == null || !payInfo.f212590h || this.mNetSceneMgr.mo105628g()) {
            hideVKB();
            showDialog(1000);
        } else {
            finish();
        }
        return true;
    }

    public void onNewIntent(Intent intent) {
        boolean z;
        Log.m105924i(this.f208649d, "onNewIntent");
        setIntent(intent);
        boolean z2 = true;
        if (!mo99127W7()) {
            Log.m105928w(this.f208649d, "hy: pay not end if judge from intent, but should finish this ui, and set cancel event");
            if (intent.getBooleanExtra("send_cancel_event", true)) {
                mo99133c8(0, getIntent());
            }
            this.f208660q = false;
        }
        if (intent.getBooleanExtra("direc_change_bankcard", false)) {
            mo99131a8(true);
            return;
        }
        if (intent.getBooleanExtra("intent_bind_end", false)) {
            this.f208637T = true;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Log.m105924i(this.f208649d, "isFromBindCard is true");
            mo99120P7();
            return;
        }
        if (!intent.getBooleanExtra("key_is_realname_verify_process", false)) {
            z2 = false;
        }
        if (z2) {
            Log.m105924i(this.f208649d, "isFromRealNameVerify is true");
            finish();
        } else {
            Log.m105920e(this.f208649d, "isFromBindCard is false,isFromRealNameVerify is false");
        }
        finish();
    }

    public void onPause() {
        super.onPause();
        C72404n nVar = this.f208628M;
        if (nVar != null) {
            nVar.onActivityPause();
        }
    }

    public boolean onProgressFinish() {
        Orders orders;
        boolean z;
        Log.m105925i(this.f208649d, "onProgressFinish isFromH5RealNameVerify %s", Boolean.valueOf(this.f208670y0));
        new WalletCloseProgressEvent().publish();
        Orders orders2 = this.f208650e;
        boolean z2 = (orders2 == null || orders2.f209549S == null || this.f208643W) ? false : true;
        if (!z2) {
            if (isTransparent()) {
                setContentViewVisibility(4);
                C85875k4.m106187i0(this, 0);
                z = false;
            } else {
                setContentViewVisibility(0);
                C85875k4.m106187i0(this, getActionbarColor());
                z = true;
            }
            if (!z) {
                PayInfo payInfo = this.f208665v;
                C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 2, "");
            }
        }
        if (this.f208670y0) {
            mo99115K7(true);
            return true;
        } else if (this.f208639U) {
            return true;
        } else {
            if (z2) {
                Intent intent = new Intent(this, WalletPayDeductUI.class);
                intent.putExtra("orders", this.f208650e);
                startActivityForResult(intent, 0);
                return true;
            } else if (getContentView().getVisibility() == 0) {
                if (getContentView().getVisibility() == 0 && (orders = this.f208650e) != null && orders.f209549S != null && this.f208671z.isEnabled() && !this.f208648Z) {
                    this.f208671z.performClick();
                    this.f208648Z = true;
                }
                return false;
            } else if (this.f208669y || !mo99113I7()) {
                return true;
            } else {
                mo99115K7(true);
                this.f208669y = true;
                return true;
            }
        }
    }

    public void onResume() {
        Dialog dialog;
        Log.m105925i(this.f208649d, "hy: onResume isFromH5RealNameVerify %s", Boolean.valueOf(this.f208670y0));
        if (!isProcessing()) {
            if (!Util.isNullOrNil(this.f208664u)) {
                this.f208655j = mo99122R7();
            } else if (this.f208655j == null) {
                this.f208655j = C79029b0.vx0().wx0().mo91329k((ArrayList<Bankcard>) null, (String) null, mo99112H7(), false);
            } else {
                this.f208655j = C79029b0.vx0().wx0().mo91329k((ArrayList<Bankcard>) null, this.f208655j.field_bindSerial, mo99112H7(), false);
            }
        }
        if (this.f208632Q0) {
            Log.m105924i(this.f208649d, "onResume isResumePassFinish");
            this.f208632Q0 = false;
        } else if (!this.f208661r || getContentViewVisibility() == 0 || ((dialog = this.f208627L) != null && dialog.isShowing())) {
            C72404n nVar = this.f208628M;
            if (nVar != null) {
                nVar.mo99670a();
            }
        } else {
            Log.m105924i(this.f208649d, "hy: has started process and is transparent and no pwd appeared. finish self");
            finish();
        }
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar, boolean z) {
        super.onSceneEnd(i, i2, str, yVar, z);
        if (yVar instanceof C75326b) {
            setAuthState(false);
        }
    }

    public boolean shouldEnsureSoterConnection() {
        return true;
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        Orders orders;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6 = i2;
        String str3 = str;
        C117747y yVar2 = yVar;
        Log.m105925i(this.f208649d, "errorType %s errCode %s, errmsg %s, scene %s", Integer.valueOf(i), Integer.valueOf(i2), str3, yVar2);
        if (i == 0 && i6 == 0) {
            if (yVar2 instanceof C75687f) {
                this.mPayResultType = 1;
                C75687f fVar = (C75687f) yVar2;
                this.f208651f = fVar;
                if (fVar.isJumpRemind()) {
                    JumpRemind jumpRemind = fVar.getJumpRemind();
                    jumpRemind.mo104779a();
                    jumpRemind.mo104784h(this, new C71934o(jumpRemind, fVar));
                    return true;
                }
                mo99114J7(fVar);
            } else if (yVar2 instanceof C75326b) {
                this.mPayResultType = 1;
                C75326b bVar = (C75326b) yVar2;
                Bundle input = getInput();
                input.putParcelable("key_pay_info", this.f208665v);
                input.putParcelable("key_bankcard", this.f208655j);
                input.putString("key_bank_type", this.f208655j.field_bankcardType);
                if (!Util.isNullOrNil(this.f208653h)) {
                    input.putString("key_pwd1", this.f208653h);
                }
                input.putString("kreq_token", bVar.f221494D);
                input.putParcelable("key_authen", bVar.f221493C);
                input.putBoolean("key_need_verify_sms", !bVar.f221491A);
                input.putInt("key_can_verify_tail", bVar.f221497G);
                input.putString("key_verify_tail_wording", bVar.f221498H);
                getInput().putBoolean("key_block_bind_new_card", bVar.f221499I == 1);
                if (Util.isNullOrNil(bVar.f221495E)) {
                    input.putString("key_mobile", this.f208655j.field_mobile);
                } else {
                    input.putString("key_mobile", bVar.f221495E);
                }
                input.putString("key_QADNA_URL", bVar.f221496F);
                if (bVar.isPaySuccess) {
                    C77302a aVar = this.f208668x0;
                    if (aVar != null) {
                        aVar.mo107446a(10003, "");
                        C77302a aVar2 = this.f208668x0;
                        aVar2.getClass();
                        C115669n.INSTANCE.mo160131h(13455, aVar2.f225422a, Long.valueOf(System.currentTimeMillis()), aVar2.f225424c);
                    }
                    input.putParcelable("key_orders", bVar.f221492B);
                    PayInfo payInfo = this.f208665v;
                    if (payInfo != null) {
                        Log.m105925i(this.f208649d, "payscene %d", Integer.valueOf(payInfo.f212587e));
                        if (8 == this.f208665v.f212587e) {
                            C86709a0.m107528h();
                            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, Boolean.TRUE);
                        }
                    }
                } else {
                    input.putParcelable("key_orders", this.f208650e);
                }
                Bundle bundle = new Bundle();
                bundle.putString("pwd", this.f208653h);
                C78101i iVar = (C78101i) C86709a0.m107533q(C78101i.class);
                if (iVar.mo73371F7()) {
                    i5 = 1;
                } else {
                    i5 = iVar.Km0() ? 2 : 0;
                }
                bundle.putInt("key_open_biometric_type", i5);
                iVar.mo108072Hz(bVar.f221493C.f209382v.f212603x == 1, true, this.f208665v.f212605z, bundle);
                input.putInt("key_pay_flag", 3);
                RealnameGuideHelper realnameGuideHelper = bVar.f222394s;
                if (realnameGuideHelper != null) {
                    input.putParcelable("key_realname_guide_helper", realnameGuideHelper);
                }
                mo99134d8(input);
                return true;
            }
            mo99139i8();
            return true;
        }
        if (yVar2 instanceof C75326b) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("pwd", this.f208653h);
            String str4 = "key_orders";
            ((C78473a) C86709a0.m107533q(C78473a.class)).mo107920vu(this.f208665v.f212603x == 1, false, bundle2);
            if (i6 == -1 || i6 == -500) {
                this.mPayResultType = 3;
            } else {
                this.mPayResultType = 2;
            }
            switch (i6) {
                case 402:
                case 403:
                case 408:
                    C75326b bVar2 = (C75326b) yVar2;
                    Bundle input2 = getInput();
                    this.f208667x = input2;
                    input2.putParcelable("key_pay_info", this.f208665v);
                    this.f208667x.putParcelable("key_bankcard", this.f208655j);
                    if (!Util.isNullOrNil(this.f208653h)) {
                        this.f208667x.putString("key_pwd1", this.f208653h);
                    }
                    this.f208667x.putString("kreq_token", bVar2.f221494D);
                    this.f208667x.putParcelable("key_authen", bVar2.f221493C);
                    this.f208667x.putBoolean("key_need_verify_sms", !bVar2.f221491A);
                    this.f208667x.putString("key_mobile", this.f208655j.field_mobile);
                    this.f208667x.putInt("key_err_code", i6);
                    this.f208667x.putParcelable(str4, this.f208650e);
                    if (Util.isNullOrNil(str)) {
                        Bankcard bankcard = this.f208655j;
                        str2 = getString(C0966R.string.l4r, new Object[]{bankcard.field_desc, bankcard.field_mobile});
                    } else {
                        str2 = str3;
                    }
                    C76879j.m92707A(this, str2, "", getString(C0966R.string.l4q), getString(C0966R.string.f7926wf), new C71935p(), new C71936q());
                    return true;
                case 404:
                    Bankcard bankcard2 = this.f208655j;
                    if (!(bankcard2 == null || (orders = this.f208650e) == null)) {
                        bankcard2.f209414i2 = orders.f209563e;
                        PayInfo payInfo2 = this.f208665v;
                        if (payInfo2 == null || !((i4 = payInfo2.f212587e) == 45 || i4 == 52)) {
                            ArrayList<Bankcard> arrayList = this.f208654i;
                            if (arrayList != null) {
                                z = true;
                                if (arrayList.size() > 1) {
                                    mo99132b8(true, 4, str3);
                                    return true;
                                }
                                i3 = 4;
                            } else {
                                i3 = 4;
                                z = true;
                            }
                            mo99130Z7(z, i3, str3);
                            return z;
                        }
                        C76879j.m92754y(getContext(), str3, "", getString(C0966R.string.a18), new C71937r(i6));
                        return true;
                    }
                    break;
                case 100000:
                case 100001:
                case 100102:
                    this.f208665v.f212574E = i6;
                    mo99131a8(false);
                    return true;
                case 100100:
                case 100101:
                    PayInfo payInfo3 = this.f208665v;
                    payInfo3.f212574E = i6;
                    boolean z2 = i6 == 100100;
                    if (this.f208629N == null) {
                        this.f208629N = new C71950a(this, this);
                    }
                    this.f208629N.mo99167b(z2, payInfo3.f212572C, payInfo3.f212592j);
                    String str5 = this.f208649d;
                    Log.m105924i(str5, "mRegenFingerPrintRsaKey.genRsaKey isGenRsa is " + z2);
                    return true;
            }
        } else if (yVar2 instanceof C75687f) {
            this.f208647Y = true;
            if (isTransparent()) {
                setContentViewVisibility(4);
                C85875k4.m106187i0(this, 0);
            } else {
                setContentViewVisibility(0);
                C85875k4.m106187i0(this, getActionbarColor());
            }
            if (i6 == 416) {
                Log.m105920e(this.f208649d, "errCode is 416 need real name verify!");
                this.mPayResultType = 2;
                this.f208639U = true;
                Bundle bundle3 = new Bundle();
                bundle3.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUI");
                bundle3.putString("realname_verify_process_jump_plugin", "wallet");
                PayInfo payInfo4 = this.f208665v;
                return C67008a.m79169b(this, i2, str, yVar, bundle3, false, (DialogInterface.OnClickListener) null, (C79148e.C79149a) null, payInfo4 != null ? payInfo4.f212587e : 0);
            }
            this.mPayResultType = 3;
            Log.m105925i(this.f208649d, "errCode is %d , not need real name verify!", Integer.valueOf(i2));
            return false;
        }
        return false;
    }
}
