package com.tencent.p014mm.plugin.wallet_core.p125ui.cashier;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.kinda.gen.TraitsType;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72371d0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72394l;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m;
import com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.C72362a;
import com.tencent.p014mm.plugin.wallet_core.utils.BankcardLogoHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import com.tencent.p014mm.wallet_core.p137ui.formview.EditHintPasswdView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import di3.C86312j;
import e63.C75556b;
import f40.C86709a0;
import f62.C75700k0;
import f63.C45762o;
import f63.C75716d;
import f63.C75720h;
import f63.C75721i;
import f63.C75722j;
import f63.C75723k;
import f63.C75724l;
import f63.C75725m;
import gr3.C76024a;
import hi3.C87515a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lt3.C21460a;
import p281yz.C79173v;
import p602ly.C76737c;
import p629ny.C76979h;
import p910lj.C76701a;
import qo3.C77390c0;
import st1.C77761h0;
import te3.C50456mv3;
import te3.te4;
import te3.zf4;
import vt1.C78473a;
import y43.C79030d0;
import y43.C79033l;
import y43.C79034n;
import yq3.C79145c;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog */
public class WcPayCashierDialog extends C77390c0 implements C0124r {

    /* renamed from: Q0 */
    public static final int f210406Q0 = C76577a.m92151b(MMApplicationContext.getContext(), 40);

    /* renamed from: R0 */
    public static final int f210407R0 = C76577a.m92151b(MMApplicationContext.getContext(), 40);

    /* renamed from: S0 */
    public static final int f210408S0 = C76577a.m92151b(MMApplicationContext.getContext(), 24);

    /* renamed from: y0 */
    public static final int f210409y0 = C76577a.m92151b(MMApplicationContext.getContext(), 30);

    /* renamed from: A */
    public WcPayCashierDetailItemLayout f210410A;

    /* renamed from: B */
    public WcPayCashierDetailItemLayout f210411B;

    /* renamed from: C */
    public WcPayCashierDetailItemLayout f210412C;

    /* renamed from: D */
    public WcPayCashierDetailItemLayout f210413D;

    /* renamed from: E */
    public WcPayCashierFingerprintDialog f210414E;

    /* renamed from: F */
    public C72362a f210415F;

    /* renamed from: G */
    public C72371d0 f210416G;

    /* renamed from: H */
    public Context f210417H;

    /* renamed from: I */
    public int f210418I = 0;

    /* renamed from: J */
    public int f210419J = 0;

    /* renamed from: K */
    public int f210420K = 0;

    /* renamed from: L */
    public PayInfo f210421L = new PayInfo();

    /* renamed from: M */
    public Orders f210422M = new Orders();

    /* renamed from: N */
    public FavorPayInfo f210423N;

    /* renamed from: P */
    public Bankcard f210424P;

    /* renamed from: Q */
    public boolean f210425Q = false;

    /* renamed from: R */
    public boolean f210426R;

    /* renamed from: S */
    public boolean f210427S = true;

    /* renamed from: T */
    public BankcardLogoHelper f210428T;

    /* renamed from: U */
    public boolean f210429U;

    /* renamed from: V */
    public String f210430V;

    /* renamed from: W */
    public String f210431W;

    /* renamed from: X */
    public String f210432X;

    /* renamed from: Y */
    public boolean f210433Y;

    /* renamed from: Z */
    public boolean f210434Z;

    /* renamed from: d */
    public ViewGroup f210435d;

    /* renamed from: e */
    public ImageView f210436e;

    /* renamed from: f */
    public TextView f210437f;

    /* renamed from: g */
    public TextView f210438g;

    /* renamed from: h */
    public TextView f210439h;

    /* renamed from: i */
    public ViewGroup f210440i;

    /* renamed from: j */
    public WalletTextView f210441j;

    /* renamed from: n */
    public ViewGroup f210442n;

    /* renamed from: o */
    public EditHintPasswdView f210443o;

    /* renamed from: p */
    public ViewGroup f210444p;

    /* renamed from: p0 */
    public C72356i f210445p0;

    /* renamed from: q */
    public Button f210446q;

    /* renamed from: r */
    public TextView f210447r;

    /* renamed from: s */
    public ViewGroup f210448s;

    /* renamed from: t */
    public CdnImageView f210449t;

    /* renamed from: u */
    public TextView f210450u;

    /* renamed from: v */
    public TextView f210451v;

    /* renamed from: w */
    public Button f210452w;

    /* renamed from: x */
    public MyKeyboardWindow f210453x;

    /* renamed from: x0 */
    public List<C72357j> f210454x0 = new ArrayList();

    /* renamed from: y */
    public ViewGroup f210455y;

    /* renamed from: z */
    public View f210456z;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$b */
    public class C43389b extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ te4 f117335g;

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$b$a */
        public class C43390a implements DialogInterface.OnDismissListener {
            public C43390a() {
            }

            public void onDismiss(DialogInterface dialogInterface) {
                WcPayCashierDialog.this.show();
            }
        }

        public C43389b(te4 te4) {
            this.f117335g = te4;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105925i("MicroMsg.WcPayCashierDialog", "click item: %s", this.f117335g.f142189n.f138231e);
            C50456mv3 mv32 = this.f117335g.f142189n;
            if (mv32.f138230d == 13 && mv32.f138237n != null && "fetchfavordialog".equals(mv32.f138231e)) {
                C45762o oVar = new C45762o(WcPayCashierDialog.this.f210417H);
                if (this.f117335g.f142189n.f138237n.f138898f.size() > 0 && this.f117335g.f142189n.f138237n.f138898f.get(0).f143659x != null) {
                    LinkedList<te4> linkedList = this.f117335g.f142189n.f138237n.f138898f.get(0).f143659x.f131777e;
                    zf4 zf4 = this.f117335g.f142189n.f138237n.f138896d.f145657d;
                    if (zf4 != null) {
                        C43423i0.m46937h(oVar.f123617e, zf4, (C43423i0.C43428e) null);
                    }
                    if (linkedList != null && !linkedList.isEmpty()) {
                        for (te4 next : linkedList) {
                            View inflate = View.inflate(oVar.getContext(), C0966R.C0971layout.ch7, (ViewGroup) null);
                            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.lsm);
                            TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.lsk);
                            LinkedList<zf4> linkedList2 = next.f142183e;
                            if (linkedList2 != null && linkedList2.size() >= 1) {
                                C43423i0.m46937h(textView, next.f142183e.get(0), (C43423i0.C43428e) null);
                                if (next.f142183e.size() >= 2) {
                                    C43423i0.m46937h(textView2, next.f142183e.get(1), (C43423i0.C43428e) null);
                                }
                            }
                            oVar.f123619g.addView(inflate);
                        }
                    }
                }
                oVar.setOnDismissListener(new C43390a());
                oVar.show();
                WcPayCashierDialog.this.hide();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$a */
    public class C72347a implements Runnable {
        public C72347a() {
        }

        public void run() {
            WcPayCashierDialog.this.f210446q.sendAccessibilityEvent(128);
            WcPayCashierDialog wcPayCashierDialog = WcPayCashierDialog.this;
            ImageView imageView = wcPayCashierDialog.f210436e;
            if (imageView != null) {
                imageView.setContentDescription(wcPayCashierDialog.getContext().getString(C0966R.string.bfj));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$c */
    public class C72348c extends C30870z1 {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$c$a */
        public class C72349a implements C72371d0.C72374b {
            public C72349a() {
            }

            /* renamed from: a */
            public void mo99162a(FavorPayInfo favorPayInfo) {
                Log.m105925i("MicroMsg.WcPayCashierDialog", "on select favor: %s", favorPayInfo.f209524d);
                WcPayCashierDialog wcPayCashierDialog = WcPayCashierDialog.this;
                wcPayCashierDialog.f210416G = null;
                PayInfo payInfo = wcPayCashierDialog.f210421L;
                C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 15, favorPayInfo.f209524d);
                List<Bankcard> h = C72394l.m84744h(favorPayInfo.f209525e, favorPayInfo.f209526f);
                WcPayCashierDialog wcPayCashierDialog2 = WcPayCashierDialog.this;
                wcPayCashierDialog2.f210423N.f209528h = "";
                if (C72394l.m84745j(favorPayInfo, wcPayCashierDialog2.f210424P)) {
                    if (((ArrayList) h).size() == 0) {
                        favorPayInfo.f209528h = WcPayCashierDialog.this.getContext().getString(C0966R.string.ksu);
                    } else {
                        favorPayInfo.f209528h = WcPayCashierDialog.this.getContext().getString(C0966R.string.ksv);
                    }
                    WcPayCashierDialog.this.mo99697g(true, -100, false, favorPayInfo);
                } else {
                    WcPayCashierDialog wcPayCashierDialog3 = WcPayCashierDialog.this;
                    wcPayCashierDialog3.f210423N = favorPayInfo;
                    wcPayCashierDialog3.show();
                }
                WcPayCashierDialog.this.mo99706q();
                WcPayCashierDialog.this.mo99711u();
                WcPayCashierDialog wcPayCashierDialog4 = WcPayCashierDialog.this;
                wcPayCashierDialog4.mo99696f(wcPayCashierDialog4.f210412C.f210403f);
            }
        }

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$c$b */
        public class C72350b implements DialogInterface.OnCancelListener {
            public C72350b() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                Log.m105924i("MicroMsg.WcPayCashierDialog", "on cancel");
                WcPayCashierDialog wcPayCashierDialog = WcPayCashierDialog.this;
                wcPayCashierDialog.f210416G = null;
                wcPayCashierDialog.show();
            }
        }

        public C72348c() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            PayInfo payInfo = WcPayCashierDialog.this.f210421L;
            C75155x0.m90135a(payInfo == null ? 0 : payInfo.f212587e, payInfo == null ? "" : payInfo.f212592j, 12, "");
            WcPayCashierDialog.this.hide();
            WcPayCashierDialog wcPayCashierDialog = WcPayCashierDialog.this;
            C72371d0 d0Var = wcPayCashierDialog.f210416G;
            if (d0Var != null) {
                d0Var.dismiss();
                WcPayCashierDialog.this.f210416G = null;
                return;
            }
            Context context = wcPayCashierDialog.getContext();
            WcPayCashierDialog wcPayCashierDialog2 = WcPayCashierDialog.this;
            wcPayCashierDialog.f210416G = C72371d0.m84703d(context, wcPayCashierDialog2.f210422M, wcPayCashierDialog2.f210423N.f209524d, new C72349a(), new C72350b());
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$d */
    public class C72351d extends C7089c0 {
        public C72351d() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105918d("MicroMsg.WcPayCashierDialog", "click bankcard item");
            WcPayCashierDialog wcPayCashierDialog = WcPayCashierDialog.this;
            wcPayCashierDialog.mo99697g(false, 0, false, wcPayCashierDialog.f210423N);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$e */
    public class C72352e implements C72362a.C72364b {

        /* renamed from: a */
        public final /* synthetic */ FavorPayInfo f210462a;

        /* renamed from: b */
        public final /* synthetic */ boolean f210463b;

        public C72352e(FavorPayInfo favorPayInfo, boolean z) {
            this.f210462a = favorPayInfo;
            this.f210463b = z;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$f */
    public class C72353f implements DialogInterface.OnCancelListener {
        public C72353f() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.WcPayCashierDialog", "on canceled");
            WcPayCashierDialog wcPayCashierDialog = WcPayCashierDialog.this;
            wcPayCashierDialog.f210434Z = true;
            C72356i iVar = wcPayCashierDialog.f210445p0;
            if (iVar != null) {
                iVar.onCancel();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$g */
    public class C72354g implements DialogInterface.OnDismissListener {
        public C72354g() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            Log.m105924i("MicroMsg.WcPayCashierDialog", "on dismissed");
            WcPayCashierDialog wcPayCashierDialog = WcPayCashierDialog.this;
            wcPayCashierDialog.f210434Z = true;
            Iterator it = ((ArrayList) wcPayCashierDialog.f210454x0).iterator();
            while (it.hasNext()) {
                ((C72357j) it.next()).mo99720a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$h */
    public class C72355h implements Runnable {
        public C72355h() {
        }

        public void run() {
            WcPayCashierDialog.this.f210437f.sendAccessibilityEvent(128);
            WcPayCashierDialog wcPayCashierDialog = WcPayCashierDialog.this;
            ImageView imageView = wcPayCashierDialog.f210436e;
            if (imageView != null) {
                imageView.setContentDescription(wcPayCashierDialog.getContext().getString(C0966R.string.bfj));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$i */
    public interface C72356i {
        /* renamed from: a */
        void mo98829a();

        /* renamed from: b */
        void mo98830b(String str, PayInfo payInfo, FavorPayInfo favorPayInfo, Bankcard bankcard);

        void onCancel();
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$j */
    public interface C72357j {
        /* renamed from: a */
        void mo99720a();
    }

    public WcPayCashierDialog(Context context) {
        super(context, C0966R.style.a66);
        this.f210417H = context;
        mo99699i();
    }

    /* renamed from: c */
    public static void m84669c(WcPayCashierDialog wcPayCashierDialog) {
        int i = 0;
        Log.m105925i("MicroMsg.WcPayCashierDialog", "trigger switch mVerifyWay: %s", Integer.valueOf(wcPayCashierDialog.f210418I));
        int i2 = wcPayCashierDialog.f210418I;
        if (i2 == 0) {
            int i3 = wcPayCashierDialog.f210419J;
            if (i3 == 1) {
                PayInfo payInfo = wcPayCashierDialog.f210421L;
                if (payInfo != null) {
                    i = payInfo.f212587e;
                }
                C75155x0.m90135a(i, payInfo == null ? "" : payInfo.f212592j, 21, "");
                wcPayCashierDialog.mo99692C();
            } else if (i3 == 2) {
                wcPayCashierDialog.mo99691B();
            }
        } else if (i2 == 1) {
            wcPayCashierDialog.mo99693D(false);
            wcPayCashierDialog.f210438g.setText(C0966R.string.f361560kt0);
            C75228t.m90243e0(29, 1);
            PayInfo payInfo2 = wcPayCashierDialog.f210421L;
            if (payInfo2 != null) {
                i = payInfo2.f212587e;
            }
            C75155x0.m90135a(i, payInfo2 == null ? "" : payInfo2.f212592j, 19, "");
        } else if (i2 == 2) {
            wcPayCashierDialog.mo99693D(false);
            wcPayCashierDialog.f210438g.setText(C0966R.string.kss);
            C115669n.INSTANCE.mo160131h(15817, 4);
        }
    }

    /* renamed from: d */
    public static void m84670d(WcPayCashierDialog wcPayCashierDialog, String str, PayInfo payInfo, FavorPayInfo favorPayInfo) {
        C72356i iVar;
        if (wcPayCashierDialog.f210433Y || !wcPayCashierDialog.f210426R || wcPayCashierDialog.f210424P != null) {
            if (!wcPayCashierDialog.f210434Z && (iVar = wcPayCashierDialog.f210445p0) != null) {
                iVar.mo98830b(str, payInfo, favorPayInfo, wcPayCashierDialog.f210424P);
            }
            wcPayCashierDialog.dismiss();
            return;
        }
        C76701a.makeText(wcPayCashierDialog.getContext(), (int) C0966R.string.f361628ld0, 1).show();
    }

    /* renamed from: B */
    public final void mo99691B() {
        this.f210418I = 2;
        this.f210421L.f212603x = 1;
        this.f210444p.setVisibility(8);
        this.f210446q.setVisibility(0);
        this.f210443o.mo105043a();
        mo99698h();
        this.f210437f.setVisibility(8);
        this.f210438g.setText(C0966R.string.l5z);
    }

    /* renamed from: C */
    public final void mo99692C() {
        this.f210418I = 1;
        this.f210421L.f212603x = 1;
        this.f210444p.setVisibility(8);
        this.f210446q.setVisibility(0);
        this.f210443o.mo105043a();
        mo99698h();
        this.f210437f.setVisibility(8);
        this.f210438g.setText(C0966R.string.l5z);
    }

    /* renamed from: D */
    public final void mo99693D(boolean z) {
        Log.m105925i("MicroMsg.WcPayCashierDialog", "switch to pwd: %s", Boolean.valueOf(z));
        this.f210418I = 0;
        this.f210421L.f212603x = 0;
        this.f210444p.setVisibility(0);
        this.f210446q.setVisibility(8);
        this.f210443o.mo105043a();
        mo99714z();
        this.f210437f.setVisibility(0);
        if (z) {
            this.f210438g.setVisibility(8);
        } else {
            this.f210438g.setVisibility(0);
        }
    }

    /* renamed from: E */
    public final void mo99694E() {
        Class cls = C78473a.class;
        Log.m105925i("MicroMsg.WcPayCashierDialog", "update verify way: %s", Integer.valueOf(this.f210422M.f209538I));
        if (this.f210422M.f209538I == 1) {
            C78473a aVar = (C78473a) C86709a0.m107533q(cls);
            if (aVar.mo107921ys() && aVar.iw0() && !aVar.mo107884d6() && aVar.mo107880J3() && aVar.mo107907Vr()) {
                this.f210419J = 1;
            } else if (!aVar.Fk0() || !aVar.mo107913l3() || aVar.mo107879H0() || !aVar.mo107883Zi() || !aVar.mo107907Vr()) {
                this.f210419J = 0;
                this.f210420K = 2;
            } else {
                this.f210419J = 2;
            }
            C77761h0 h0Var = C77761h0.IML;
            boolean z = h0Var.f226592f;
            boolean qV = (((C79173v) C86312j.m106911c(C79173v.class)).Ex0() == null || this.f210419J <= 0) ? true : aVar.mo107914qV();
            Class cls2 = C76737c.class;
            C78473a aVar2 = (C78473a) C86709a0.m107533q(cls);
            if (aVar2.type() == 1 && ((aVar2.mo107880J3() || aVar2.mo107883Zi()) && ((C76737c) C86312j.m106911c(cls2)).mo59456ve() && ((C76737c) C86312j.m106911c(cls2)).p40() && C21460a.m24273g() == 0)) {
                Log.m105924i("MicroMsg.WcPayCashierDialog", "may treble init error");
                C115669n.INSTANCE.mo175911u(1104, 23);
            } else if (aVar2.type() == 2) {
                if (C21460a.m24273g() == 1) {
                    if (!C21460a.m24282p()) {
                        Log.m105924i("MicroMsg.WcPayCashierDialog", "soter service disconnected");
                        C115669n.INSTANCE.mo175911u(1104, 24);
                    } else if (!qV) {
                        Log.m105924i("MicroMsg.WcPayCashierDialog", "soter treble key error");
                        C115669n.INSTANCE.mo175911u(1104, 25);
                    }
                } else if (!qV) {
                    Log.m105924i("MicroMsg.WcPayCashierDialog", "soter1.0 key error");
                    C115669n.INSTANCE.mo175911u(1104, 26);
                }
            }
            if (aVar2.type() == 2) {
                if (C21460a.m24273g() == 0) {
                    C115669n.INSTANCE.mo175911u(1104, 28);
                } else {
                    C115669n.INSTANCE.mo175911u(1104, 31);
                }
            }
            if (!qV) {
                C115669n.INSTANCE.mo175911u(1104, 27);
            }
            if (z) {
                C115669n.INSTANCE.mo175911u(1104, 33);
            }
            boolean z2 = (!z) & qV;
            if (!z2) {
                h0Var.f226592f = true;
                this.f210419J = 0;
                this.f210420K = 3;
                this.f210421L.f212605z = true;
                h0Var.f226592f = true;
            } else {
                PayInfo payInfo = this.f210421L;
                int i = payInfo.f212574E;
                if (i == 100000 || i == 100102) {
                    if (i == 100000) {
                        payInfo.f212603x = 0;
                    }
                    this.f210419J = 0;
                    this.f210420K = 4;
                }
            }
            this.f210418I = this.f210419J;
            Log.m105925i("MicroMsg.WcPayCashierDialog", "keystatus: %s, errcode: %s, payway: %s, supportMode: %s", Boolean.valueOf(z2), Integer.valueOf(this.f210421L.f212574E), Integer.valueOf(this.f210418I), Integer.valueOf(this.f210419J));
            return;
        }
        this.f210418I = 0;
        this.f210419J = 0;
        this.f210420K = 1;
        C78473a aVar3 = (C78473a) C86709a0.m107533q(cls);
        if (aVar3.mo107921ys() && aVar3.iw0() && !aVar3.mo107884d6() && aVar3.mo107880J3()) {
            Log.m105928w("MicroMsg.WcPayCashierDialog", "wired case");
            C115669n.INSTANCE.mo175911u(1104, 2);
        }
    }

    /* renamed from: e */
    public final void mo99695e() {
        if (this.f210442n.getChildCount() == 0 && this.f210411B.getVisibility() == 8) {
            Log.m105918d("MicroMsg.WcPayCashierDialog", "invisible divider");
            View view = this.f210456z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierDialog", "adjustDetailDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierDialog", "adjustDetailDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f210456z;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierDialog", "adjustDetailDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet_core/ui/cashier/WcPayCashierDialog", "adjustDetailDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f2  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99696f(android.widget.TextView r12) {
        /*
            r11 = this;
            com.tencent.mm.plugin.wallet_core.ui.m r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m.INSTANCE
            com.tencent.mm.plugin.wallet_core.model.Orders r1 = r11.f210422M
            com.tencent.mm.plugin.wallet_core.ui.l r0 = r0.mo99776a(r1)
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r1 = r11.f210423N
            java.lang.String r1 = r1.f209524d
            y43.n r1 = r0.mo99770f(r1)
            java.util.List r2 = r0.mo99772i()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x002c
            double r6 = r1.f232091j
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x002c
            java.lang.String r0 = r1.f232093o
            r3.append(r0)
            goto L_0x0099
        L_0x002c:
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x0099
            java.util.Map<java.lang.String, y43.n> r2 = r0.f210616c
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x005d
            java.util.Map<java.lang.String, y43.n> r2 = r0.f210616c
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x005d
            java.lang.Object r2 = r2.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            y43.n r2 = (y43.C79034n) r2
            goto L_0x005e
        L_0x005d:
            r2 = 0
        L_0x005e:
            if (r1 != 0) goto L_0x008d
            java.util.Map<java.lang.String, y43.n> r0 = r0.f210616c
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            if (r0 != r5) goto L_0x008d
            if (r2 == 0) goto L_0x008d
            int r0 = r2.f232092n
            if (r0 != 0) goto L_0x008d
            boolean r0 = r11.f210427S
            if (r0 == 0) goto L_0x008d
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r11.f210422M
            y43.l r0 = r0.f209543N
            y43.b r0 = r0.f232084w
            if (r0 == 0) goto L_0x008d
            int r0 = r0.f232035e
            if (r0 != r5) goto L_0x008d
            android.content.Context r0 = r11.getContext()
            r2 = 2131839580(0x7f114a5c, float:1.9312416E38)
            java.lang.String r0 = r0.getString(r2)
            r2 = 0
            goto L_0x009c
        L_0x008d:
            android.content.Context r0 = r11.getContext()
            r2 = 2131839573(0x7f114a55, float:1.9312401E38)
            java.lang.String r0 = r0.getString(r2)
            goto L_0x009b
        L_0x0099:
            java.lang.String r0 = ""
        L_0x009b:
            r2 = 1
        L_0x009c:
            java.lang.String r6 = ","
            if (r1 == 0) goto L_0x00b2
            int r7 = r1.f232092n
            if (r7 == 0) goto L_0x00b2
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r3)
            if (r7 != 0) goto L_0x00b2
            r3.append(r6)
            java.lang.String r1 = r1.f232094p
            r3.append(r1)
        L_0x00b2:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r3)
            if (r1 != 0) goto L_0x00c5
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x00c5
            r3.append(r6)
            r3.append(r0)
            goto L_0x00ce
        L_0x00c5:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x00ce
            r3.append(r0)
        L_0x00ce:
            java.lang.String r0 = r3.toString()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r0
            java.lang.String r3 = "MicroMsg.WcPayCashierDialog"
            java.lang.String r4 = "favor text: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r4, r1)
            if (r2 == 0) goto L_0x00f2
            android.content.Context r1 = r11.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099865(0x7f0600d9, float:1.7812095E38)
            int r1 = r1.getColor(r2)
            r12.setTextColor(r1)
            goto L_0x0104
        L_0x00f2:
            android.content.Context r1 = r11.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131100897(0x7f0604e1, float:1.7814188E38)
            int r1 = r1.getColor(r2)
            r12.setTextColor(r1)
        L_0x0104:
            r12.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog.mo99696f(android.widget.TextView):void");
    }

    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r11v1, types: [boolean, int] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99697g(boolean r17, int r18, boolean r19, com.tencent.p014mm.plugin.wallet_core.model.FavorPayInfo r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r20
            java.lang.String r3 = "MicroMsg.WcPayCashierDialog"
            java.lang.String r4 = "go to bankcard dialog"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            com.tencent.mm.plugin.wallet_core.ui.cashier.a r3 = r0.f210415F
            if (r3 == 0) goto L_0x0014
            r3.dismiss()
        L_0x0014:
            r16.hide()
            com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView r3 = r0.f210443o
            r3.mo105043a()
            com.tencent.mm.pluginsdk.wallet.PayInfo r3 = r0.f210421L
            r4 = 0
            if (r3 != 0) goto L_0x0023
            r5 = 0
            goto L_0x0025
        L_0x0023:
            int r5 = r3.f212587e
        L_0x0025:
            java.lang.String r6 = ""
            if (r3 != 0) goto L_0x002b
            r3 = r6
            goto L_0x002d
        L_0x002b:
            java.lang.String r3 = r3.f212592j
        L_0x002d:
            r7 = 11
            com.tencent.p014mm.wallet_core.model.C75155x0.m90135a(r5, r3, r7, r6)
            com.tencent.mm.plugin.wallet_core.ui.cashier.a r3 = new com.tencent.mm.plugin.wallet_core.ui.cashier.a
            android.content.Context r5 = r0.f210417H
            r3.<init>(r5)
            r0.f210415F = r3
            com.tencent.mm.pluginsdk.wallet.PayInfo r5 = r0.f210421L
            com.tencent.mm.plugin.wallet_core.model.Orders r7 = r0.f210422M
            com.tencent.mm.plugin.wallet_core.model.Bankcard r8 = r0.f210424P
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            if (r8 != 0) goto L_0x0048
            r10 = r6
            goto L_0x004a
        L_0x0048:
            java.lang.String r10 = r8.field_desc
        L_0x004a:
            r9[r4] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r17)
            r11 = 1
            r9[r11] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
            r12 = 2
            r9[r12] = r10
            java.lang.String r10 = "MicroMsg.WcPayCashierBankcardDialog"
            java.lang.String r13 = "set view data: %s, %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r13, r9)
            r3.f210489j = r5
            r3.f210490n = r7
            r3.f210491o = r2
            r3.f210492p = r8
            int r7 = r7.f209567i
            r3.f210493q = r7
            r3.f210494r = r1
            r7 = r18
            r3.f210495s = r7
            if (r1 == 0) goto L_0x0077
            r3.f210496t = r4
        L_0x0077:
            int r1 = r5.f212587e
            r5 = 8
            if (r1 != r5) goto L_0x0082
            java.util.ArrayList r1 = b63.C67188h0.m79466a(r11)
            goto L_0x0086
        L_0x0082:
            java.util.ArrayList r1 = b63.C67188h0.m79466a(r4)
        L_0x0086:
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r7 = r3.f210491o
            if (r7 == 0) goto L_0x00cf
            int r8 = r7.f209525e
            if (r8 == 0) goto L_0x0090
            r8 = 1
            goto L_0x0091
        L_0x0090:
            r8 = 0
        L_0x0091:
            if (r8 == 0) goto L_0x00cf
            boolean r8 = r3.f210494r
            if (r8 != 0) goto L_0x0098
            goto L_0x00cf
        L_0x0098:
            java.lang.String r7 = r7.f209526f
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
        L_0x00a0:
            int r10 = r1.size()
            if (r9 >= r10) goto L_0x00ce
            java.lang.Object r10 = r1.get(r9)
            com.tencent.mm.plugin.wallet_core.model.Bankcard r10 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r10
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r13 == 0) goto L_0x00c0
            java.lang.String r13 = r10.field_bankcardType
            java.lang.String r14 = "CFT"
            boolean r13 = r13.equalsIgnoreCase(r14)
            if (r13 != 0) goto L_0x00cb
            r8.add(r10)
            goto L_0x00cb
        L_0x00c0:
            java.lang.String r13 = r10.field_bankcardType
            boolean r13 = r13.equals(r7)
            if (r13 == 0) goto L_0x00cb
            r8.add(r10)
        L_0x00cb:
            int r9 = r9 + 1
            goto L_0x00a0
        L_0x00ce:
            r1 = r8
        L_0x00cf:
            java.util.Iterator r1 = r1.iterator()
        L_0x00d3:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x03c8
            java.lang.Object r7 = r1.next()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r7 = (com.tencent.p014mm.plugin.wallet_core.model.Bankcard) r7
            java.lang.Class<yz.v> r8 = p281yz.C79173v.class
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout r9 = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout
            android.content.Context r10 = r3.getContext()
            r9.<init>(r10)
            java.util.List<com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout> r10 = r3.f210487h
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r10.add(r9)
            android.view.ViewGroup r10 = r3.f210485f
            r10.addView(r9)
            boolean r10 = r7.mo99388n2()
            if (r10 == 0) goto L_0x0113
            com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper r10 = r3.f210497u
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r13 = r9.f210393d
            r10.getClass()
            if (r13 == 0) goto L_0x0163
            r10 = 2131316711(0x7f094fe7, float:1.8251911E38)
            r14 = 0
            r13.setTag(r10, r14)
            r10 = 2131235559(0x7f0812e7, float:1.8087315E38)
            r13.setImageResource(r10)
            goto L_0x0163
        L_0x0113:
            boolean r10 = r7.mo99393s2()
            if (r10 == 0) goto L_0x0121
            com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper r10 = r3.f210497u
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r13 = r9.f210393d
            r10.mo99895f(r7, r13)
            goto L_0x0163
        L_0x0121:
            boolean r10 = r7.mo99392r2()
            if (r10 == 0) goto L_0x0158
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r10 = r9.f210393d
            android.content.Context r13 = r3.getContext()
            android.content.res.Resources r13 = r13.getResources()
            r14 = 0
            r15 = 2131755844(0x7f100344, float:1.9142579E38)
            android.graphics.drawable.Drawable r13 = hi3.C87515a.m108835e(r13, r15, r14)
            r10.setImageDrawable(r13)
            java.lang.String r10 = r7.f209391D2
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0163
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r10 = r9.f210393d
            r10.setUseSdcardCache(r11)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r10 = r9.f210393d
            java.lang.String r13 = e63.C75556b.f221973a
            r10.setImgSavedPath(r13)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r10 = r9.f210393d
            java.lang.String r13 = r7.f209391D2
            r10.mo100288c(r13, r4, r4, r15)
            goto L_0x0163
        L_0x0158:
            com.tencent.mm.plugin.wallet_core.utils.BankcardLogoHelper r10 = r3.f210497u
            android.content.Context r13 = r3.getContext()
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r14 = r9.f210393d
            r10.mo99894e(r13, r7, r14)
        L_0x0163:
            boolean r10 = r7.mo99388n2()
            r13 = 0
            if (r10 == 0) goto L_0x01c0
            di3.d r8 = di3.C86312j.m106911c(r8)
            yz.v r8 = (p281yz.C79173v) r8
            b63.s0 r8 = r8.Ex0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r8 = r8.f192955h
            java.lang.String r10 = r8.f209416k2
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r10 != 0) goto L_0x0189
            android.widget.TextView r10 = r9.f210394e
            java.lang.String r8 = r8.f209416k2
            r10.setText(r8)
            r10 = r6
            goto L_0x0236
        L_0x0189:
            r10 = r6
            double r5 = r8.f209415j2
            int r15 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x01b9
            android.widget.TextView r5 = r9.f210394e
            android.content.Context r6 = r3.getContext()
            r3.getContext()
            boolean r13 = eb0.C75592q0.m90763K()
            if (r13 == 0) goto L_0x01a3
            r13 = 2131839003(0x7f11481b, float:1.9311245E38)
            goto L_0x01a6
        L_0x01a3:
            r13 = 2131839002(0x7f11481a, float:1.9311243E38)
        L_0x01a6:
            java.lang.Object[] r14 = new java.lang.Object[r11]
            double r11 = r8.f209415j2
            java.lang.String r8 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90256l(r11)
            r14[r4] = r8
            java.lang.String r6 = r6.getString(r13, r14)
            r5.setText(r6)
            goto L_0x0236
        L_0x01b9:
            android.widget.TextView r5 = r9.f210394e
            r5.setText(r10)
            goto L_0x0236
        L_0x01c0:
            r10 = r6
            boolean r5 = r7.mo99393s2()
            if (r5 == 0) goto L_0x020b
            di3.d r5 = di3.C86312j.m106911c(r8)
            yz.v r5 = (p281yz.C79173v) r5
            b63.s0 r5 = r5.Ex0()
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r5.f192960m
            java.lang.String r6 = r5.f209416k2
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x01e3
            android.widget.TextView r6 = r9.f210394e
            java.lang.String r5 = r5.f209416k2
            r6.setText(r5)
            goto L_0x0236
        L_0x01e3:
            double r11 = r5.f209415j2
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 < 0) goto L_0x0205
            android.widget.TextView r6 = r9.f210394e
            android.content.Context r8 = r3.getContext()
            r11 = 1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            double r13 = r5.f209415j2
            java.lang.String r5 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90256l(r13)
            r12[r4] = r5
            r5 = 2131839224(0x7f1148f8, float:1.9311693E38)
            java.lang.String r5 = r8.getString(r5, r12)
            r6.setText(r5)
            goto L_0x0236
        L_0x0205:
            android.widget.TextView r5 = r9.f210394e
            r5.setText(r10)
            goto L_0x0236
        L_0x020b:
            boolean r5 = r7.mo99392r2()
            if (r5 == 0) goto L_0x022f
            android.widget.TextView r5 = r9.f210394e
            java.lang.Class<ny.h> r6 = p629ny.C76979h.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r8 = r3.getContext()
            java.lang.String r11 = r7.field_desc
            android.widget.TextView r12 = r9.f210394e
            float r12 = r12.getTextSize()
            android.text.SpannableString r6 = r6.yp0(r8, r11, r12)
            r5.setText(r6)
            goto L_0x0236
        L_0x022f:
            android.widget.TextView r5 = r9.f210394e
            java.lang.String r6 = r7.field_desc
            r5.setText(r6)
        L_0x0236:
            int r5 = r3.f210493q
            com.tencent.mm.plugin.wallet_core.model.Orders r6 = r3.f210490n
            int r5 = r7.mo99387l2(r5, r6)
            switch(r5) {
                case 1: goto L_0x0297;
                case 2: goto L_0x028b;
                case 3: goto L_0x027f;
                case 4: goto L_0x0273;
                case 5: goto L_0x0267;
                case 6: goto L_0x025b;
                case 7: goto L_0x024f;
                case 8: goto L_0x024c;
                default: goto L_0x0241;
            }
        L_0x0241:
            java.lang.String r5 = r7.field_tips
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x02a3
            java.lang.String r5 = r7.field_tips
            goto L_0x02a4
        L_0x024c:
            java.lang.String r5 = r7.field_forbidWord
            goto L_0x02a4
        L_0x024f:
            android.content.Context r5 = r3.getContext()
            r6 = 2131839506(0x7f114a12, float:1.9312265E38)
            java.lang.String r5 = r5.getString(r6)
            goto L_0x02a4
        L_0x025b:
            android.content.Context r5 = r3.getContext()
            r6 = 2131839501(0x7f114a0d, float:1.9312255E38)
            java.lang.String r5 = r5.getString(r6)
            goto L_0x02a4
        L_0x0267:
            android.content.Context r5 = r3.getContext()
            r6 = 2131839495(0x7f114a07, float:1.9312243E38)
            java.lang.String r5 = r5.getString(r6)
            goto L_0x02a4
        L_0x0273:
            android.content.Context r5 = r3.getContext()
            r6 = 2131839499(0x7f114a0b, float:1.9312251E38)
            java.lang.String r5 = r5.getString(r6)
            goto L_0x02a4
        L_0x027f:
            android.content.Context r5 = r3.getContext()
            r6 = 2131839508(0x7f114a14, float:1.931227E38)
            java.lang.String r5 = r5.getString(r6)
            goto L_0x02a4
        L_0x028b:
            android.content.Context r5 = r3.getContext()
            r6 = 2131839503(0x7f114a0f, float:1.931226E38)
            java.lang.String r5 = r5.getString(r6)
            goto L_0x02a4
        L_0x0297:
            android.content.Context r5 = r3.getContext()
            r6 = 2131839497(0x7f114a09, float:1.9312247E38)
            java.lang.String r5 = r5.getString(r6)
            goto L_0x02a4
        L_0x02a3:
            r5 = r10
        L_0x02a4:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>(r5)
            java.lang.String r8 = r7.field_forbid_title
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x02f0
            java.lang.String r8 = r7.field_forbid_url
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x02f0
            java.lang.String r8 = "  "
            r6.append(r8)
            java.lang.String r8 = r7.field_forbid_title
            r6.append(r8)
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            android.content.Context r11 = r3.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131101755(0x7f06083b, float:1.7815929E38)
            int r11 = r11.getColor(r12)
            r8.<init>(r11)
            int r5 = r5.length()
            r11 = 2
            int r5 = r5 + r11
            int r11 = r6.length()
            r12 = 34
            r6.setSpan(r8, r5, r11, r12)
            android.widget.TextView r5 = r9.f210395f
            f63.c r8 = new f63.c
            r8.<init>(r3, r7)
            r5.setOnClickListener(r8)
        L_0x02f0:
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r6)
            if (r5 != 0) goto L_0x0300
            android.widget.TextView r5 = r9.f210395f
            r5.setVisibility(r4)
            android.widget.TextView r5 = r9.f210395f
            r5.setText(r6)
        L_0x0300:
            boolean r5 = r3.f210496t
            if (r5 == 0) goto L_0x0366
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r6)
            if (r5 == 0) goto L_0x0366
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            com.tencent.mm.plugin.wallet_core.model.Orders r6 = r3.f210490n
            if (r6 == 0) goto L_0x034f
            y43.l r6 = r6.f209543N
            if (r6 == 0) goto L_0x034f
            y43.a r6 = r6.f232082u
            if (r6 == 0) goto L_0x034f
            java.util.LinkedList<y43.c> r6 = r6.f191293d
            java.util.Iterator r6 = r6.iterator()
        L_0x0321:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x034f
            java.lang.Object r8 = r6.next()
            y43.c r8 = (y43.C66498c) r8
            java.lang.String r11 = r8.f191295d
            java.lang.String r12 = r7.field_bindSerial
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0321
            java.util.LinkedList<y43.d> r6 = r8.f191296e
            java.util.Iterator r6 = r6.iterator()
        L_0x033d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x034f
            java.lang.Object r8 = r6.next()
            y43.d r8 = (y43.C66499d) r8
            java.lang.String r8 = r8.f191297d
            r5.add(r8)
            goto L_0x033d
        L_0x034f:
            int r6 = r5.size()
            if (r6 <= 0) goto L_0x0366
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r6 = r9.f210397h
            r6.setVisibility(r4)
            android.widget.TextView r6 = r9.f210395f
            r8 = 8
            r6.setVisibility(r8)
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r6 = r9.f210397h
            r6.setWording(r5)
        L_0x0366:
            com.tencent.mm.plugin.wallet_core.model.Bankcard r5 = r3.f210492p
            if (r5 == 0) goto L_0x037a
            java.lang.String r6 = r7.field_bindSerial
            java.lang.String r5 = r5.field_bindSerial
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x037a
            android.widget.RadioButton r5 = r9.f210396g
            r6 = 1
            r5.setChecked(r6)
        L_0x037a:
            int r5 = r3.f210493q
            com.tencent.mm.plugin.wallet_core.model.Orders r6 = r3.f210490n
            int r5 = r7.mo99387l2(r5, r6)
            if (r5 == 0) goto L_0x03a1
            android.widget.RadioButton r5 = r9.f210396g
            r5.setChecked(r4)
            android.widget.TextView r5 = r9.f210394e
            android.content.Context r6 = r3.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131100897(0x7f0604e1, float:1.7814188E38)
            int r6 = r6.getColor(r8)
            r5.setTextColor(r6)
            r9.setEnabled(r4)
            goto L_0x03b9
        L_0x03a1:
            android.widget.TextView r5 = r9.f210394e
            android.content.Context r6 = r3.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r8 = 2131101252(0x7f060644, float:1.7814908E38)
            int r6 = r6.getColor(r8)
            r5.setTextColor(r6)
            r5 = 1
            r9.setEnabled(r5)
        L_0x03b9:
            com.tencent.mm.plugin.wallet_core.ui.cashier.c r5 = new com.tencent.mm.plugin.wallet_core.ui.cashier.c
            r5.<init>(r3, r7)
            r9.setOnClickListener(r5)
            r6 = r10
            r5 = 8
            r11 = 1
            r12 = 2
            goto L_0x00d3
        L_0x03c8:
            r10 = r6
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout r1 = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierBankcardItemLayout
            android.content.Context r5 = r3.getContext()
            r1.<init>(r5)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r5 = r1.f210393d
            r6 = 4
            r5.setVisibility(r6)
            android.widget.TextView r5 = r1.f210394e
            r6 = 2131839491(0x7f114a03, float:1.9312235E38)
            r5.setText(r6)
            android.widget.TextView r5 = r1.f210394e
            android.content.Context r6 = r3.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131101015(0x7f060557, float:1.7814428E38)
            int r6 = r6.getColor(r7)
            r5.setTextColor(r6)
            android.widget.RadioButton r5 = r1.f210396g
            r6 = 8
            r5.setVisibility(r6)
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            com.tencent.mm.plugin.wallet_core.model.Orders r6 = r3.f210490n
            if (r6 == 0) goto L_0x0428
            y43.l r6 = r6.f209543N
            if (r6 == 0) goto L_0x0428
            y43.a r6 = r6.f232082u
            if (r6 == 0) goto L_0x0428
            y43.v r6 = r6.f191294e
            if (r6 == 0) goto L_0x0428
            java.util.LinkedList<y43.w> r6 = r6.f191306d
            java.util.Iterator r6 = r6.iterator()
        L_0x0416:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0428
            java.lang.Object r7 = r6.next()
            y43.w r7 = (y43.C66504w) r7
            java.lang.String r7 = r7.f191307d
            r5.add(r7)
            goto L_0x0416
        L_0x0428:
            boolean r6 = r3.f210496t
            if (r6 == 0) goto L_0x0443
            int r6 = r5.size()
            if (r6 <= 0) goto L_0x0443
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r6 = r1.f210397h
            r6.setVisibility(r4)
            android.widget.TextView r6 = r1.f210395f
            r7 = 8
            r6.setVisibility(r7)
            com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout r6 = r1.f210397h
            r6.setWording(r5)
        L_0x0443:
            com.tencent.mm.plugin.wallet_core.ui.cashier.d r5 = new com.tencent.mm.plugin.wallet_core.ui.cashier.d
            r5.<init>(r3)
            r1.setOnClickListener(r5)
            android.view.ViewGroup r5 = r3.f210485f
            r5.addView(r1)
            com.tencent.mm.plugin.wallet_core.model.Orders r1 = r3.f210490n
            if (r1 == 0) goto L_0x048c
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r1 = r1.f209542M
            if (r1 == 0) goto L_0x048c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x048c
            android.content.Context r1 = r3.getContext()
            r5 = 2131839004(0x7f11481c, float:1.9311247E38)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            com.tencent.mm.plugin.wallet_core.model.Orders r7 = r3.f210490n
            double r8 = r7.f209566h
            java.lang.String r7 = r7.f209568j
            java.lang.String r7 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r8, r7)
            r6[r4] = r7
            com.tencent.mm.plugin.wallet_core.model.Orders r7 = r3.f210490n
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r7 = r7.f209542M
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r7 = r7.get(r4)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r7 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r7
            java.lang.String r7 = r7.f209599h
            r8 = 1
            r6[r8] = r7
            java.lang.String r1 = r1.getString(r5, r6)
            goto L_0x048d
        L_0x048c:
            r1 = r10
        L_0x048d:
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r5 = r3.f210491o
            if (r5 == 0) goto L_0x04ac
            java.lang.String r5 = r5.f209528h
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x04ac
            android.widget.TextView r1 = r3.f210486g
            r1.setVisibility(r4)
            android.widget.TextView r1 = r3.f210486g
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r4 = r3.f210491o
            java.lang.String r4 = r4.f209528h
            r1.setText(r4)
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r1 = r3.f210491o
            r1.f209528h = r10
            goto L_0x04c2
        L_0x04ac:
            int r5 = r3.f210495s
            if (r5 == 0) goto L_0x04bb
            android.widget.TextView r5 = r3.f210486g
            r5.setVisibility(r4)
            android.widget.TextView r3 = r3.f210486g
            r3.setText(r1)
            goto L_0x04c2
        L_0x04bb:
            android.widget.TextView r1 = r3.f210486g
            r3 = 8
            r1.setVisibility(r3)
        L_0x04c2:
            com.tencent.mm.plugin.wallet_core.ui.cashier.a r1 = r0.f210415F
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$j r1 = r1.f210499w
            java.util.List<com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$j> r3 = r0.f210454x0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r1)
            com.tencent.mm.plugin.wallet_core.ui.cashier.a r1 = r0.f210415F
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$e r3 = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$e
            r4 = r19
            r3.<init>(r2, r4)
            r1.f210498v = r3
            r1.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog.mo99697g(boolean, int, boolean, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo):void");
    }

    /* renamed from: h */
    public final void mo99698h() {
        if (this.f210455y.isShown()) {
            this.f210455y.setVisibility(8);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2493eh);
            loadAnimation.setInterpolator(new DecelerateInterpolator());
            loadAnimation.setDuration(180);
            this.f210455y.startAnimation(loadAnimation);
        }
    }

    /* renamed from: i */
    public final void mo99699i() {
        ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), C0966R.C0971layout.ch6, (ViewGroup) null);
        this.f210435d = viewGroup;
        this.f210436e = (ImageView) viewGroup.findViewById(C0966R.C0970id.lrv);
        this.f210437f = (TextView) this.f210435d.findViewById(C0966R.C0970id.lrz);
        this.f210438g = (TextView) this.f210435d.findViewById(C0966R.C0970id.ls_);
        this.f210439h = (TextView) this.f210435d.findViewById(C0966R.C0970id.ls4);
        this.f210440i = (ViewGroup) this.f210435d.findViewById(C0966R.C0970id.ls6);
        this.f210451v = (TextView) this.f210435d.findViewById(C0966R.C0970id.lru);
        this.f210441j = (WalletTextView) this.f210435d.findViewById(C0966R.C0970id.ls5);
        this.f210442n = (ViewGroup) this.f210435d.findViewById(C0966R.C0970id.lry);
        this.f210443o = (EditHintPasswdView) this.f210435d.findViewById(C0966R.C0970id.ls8);
        this.f210444p = (ViewGroup) this.f210435d.findViewById(C0966R.C0970id.ls9);
        this.f210411B = (WcPayCashierDetailItemLayout) this.f210435d.findViewById(C0966R.C0970id.ls7);
        this.f210446q = (Button) this.f210435d.findViewById(C0966R.C0970id.lrw);
        this.f210447r = (TextView) this.f210435d.findViewById(C0966R.C0970id.f359601ls0);
        this.f210448s = (ViewGroup) this.f210435d.findViewById(C0966R.C0970id.lrt);
        this.f210449t = (CdnImageView) this.f210435d.findViewById(C0966R.C0970id.f359604ls3);
        this.f210450u = (TextView) this.f210435d.findViewById(C0966R.C0970id.f359603ls2);
        this.f210452w = (Button) this.f210435d.findViewById(C0966R.C0970id.f359602ls1);
        this.f210453x = (MyKeyboardWindow) this.f210435d.findViewById(C0966R.C0970id.f359361kh3);
        this.f210455y = (ViewGroup) this.f210435d.findViewById(C0966R.C0970id.f359359kh1);
        this.f210456z = this.f210435d.findViewById(C0966R.C0970id.lrx);
        C85875k4.m106189j0(this.f210437f.getPaint(), 0.8f);
        C85875k4.m106189j0(this.f210438g.getPaint(), 0.8f);
        ImageView imageView = this.f210436e;
        int i = f210409y0;
        Util.expandViewTouchArea(imageView, i, i, i, i);
        this.f210436e.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.actionbar_icon_dark_close, getContext().getResources().getColor(C0966R.color.f3137gl)));
        this.f210436e.setOnClickListener(new C75720h(this));
        C76024a.m91321b(this.f210443o);
        this.f210443o.setOnInputValidListener(new C75721i(this));
        EditText editText = (EditText) this.f210435d.findViewById(C0966R.C0970id.lg_);
        C75228t.m90251i0(editText);
        this.f210453x.setInputEditText(editText);
        C79145c cVar = new C79145c();
        this.f210453x.setSecureAccessibility(cVar);
        editText.setAccessibilityDelegate(cVar);
        editText.setOnClickListener(new C75722j(this));
        this.f210435d.findViewById(C0966R.C0970id.kh4).setOnClickListener(new C75723k(this));
        this.f210446q.setOnClickListener(new C75724l(this));
        this.f210438g.setOnClickListener(new C75725m(this));
        C79145c cVar2 = new C79145c();
        cVar2.setViewType(TraitsType.BUTTON);
        this.f210438g.setAccessibilityDelegate(cVar2);
        this.f210436e.setAccessibilityDelegate(cVar2);
        this.f210443o.setImportantForAccessibility(1);
        this.f210443o.setContentDescription(this.f210417H.getString(C0966R.string.lcu, new Object[]{"0"}));
        this.f210443o.getEditText().setImportantForAccessibility(2);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new C72353f());
        setOnDismissListener(new C72354g());
        ((MMActivity) this.f210417H).getLifecycle().addObserver(this);
        this.f210428T = new BankcardLogoHelper();
    }

    /* renamed from: l */
    public final void mo99700l() {
        if (!Util.isNullOrNil(this.f210430V)) {
            this.f210451v.setText(this.f210430V);
            this.f210451v.setVisibility(0);
            return;
        }
        this.f210451v.setVisibility(8);
    }

    /* renamed from: n */
    public final void mo99701n() {
        Bankcard bankcard;
        C79034n nVar;
        C79034n nVar2;
        C72394l a = C72400m.INSTANCE.mo99776a(this.f210422M);
        if (a == null) {
            Log.m105918d("MicroMsg.WcPayCashierDialog", "getFavorLogicHelper null");
        } else if (this.f210423N == null || (bankcard = this.f210424P) == null) {
            C79033l lVar = this.f210422M.f209543N;
            if (lVar != null) {
                this.f210423N = a.mo99771g(a.mo99765a(lVar.f232071g));
            }
        } else {
            boolean equalsIgnoreCase = bankcard.field_bankcardType.equalsIgnoreCase("CFT");
            Log.m105925i("MicroMsg.WcPayCashierDialog", "selectedFavorCompId %s isFilterNotSupportCft %s", this.f210423N.f209524d, Boolean.valueOf(equalsIgnoreCase));
            String c = a.mo99767c(this.f210423N.f209524d, equalsIgnoreCase);
            Log.m105925i("MicroMsg.WcPayCashierDialog", "nonBankSelectedFaovrCompId %s", c);
            Map<String, C72394l.C72395a> d = a.mo99768d(c, true);
            Map<String, C72394l.C72395a> b = a.mo99766b(c, true);
            C72394l.C72395a aVar = (C72394l.C72395a) ((HashMap) d).get(this.f210424P.field_bindSerial);
            C72394l.C72395a aVar2 = (C72394l.C72395a) ((HashMap) b).get(this.f210424P.field_bankcardType);
            C79034n e = a.mo99769e(c, equalsIgnoreCase);
            Object[] objArr = new Object[3];
            String str = "";
            objArr[0] = e == null ? str : e.f232085d;
            objArr[1] = aVar == null ? str : aVar.toString();
            if (aVar2 != null) {
                str = aVar2.toString();
            }
            objArr[2] = str;
            Log.m105925i("MicroMsg.WcPayCashierDialog", "defaultComposeInfo %s wrapperSerial %s wrapper %s", objArr);
            if (aVar != null && (nVar2 = aVar.f210617a) != null && !Util.isNullOrNil(nVar2.f232085d)) {
                this.f210423N.f209524d = aVar.f210617a.f232085d;
            } else if (aVar2 != null && (nVar = aVar2.f210617a) != null && !Util.isNullOrNil(nVar.f232085d)) {
                this.f210423N.f209524d = aVar2.f210617a.f232085d;
            } else if (e != null) {
                this.f210423N.f209524d = e.f232085d;
            } else {
                this.f210423N.f209524d = c;
            }
        }
    }

    /* renamed from: o */
    public final void mo99702o() {
        String str;
        Orders orders;
        List<Orders.Commodity> list;
        int i;
        String str2;
        Class cls = C75700k0.class;
        if (this.f210433Y) {
            str = this.f210431W;
        } else {
            Bundle bundle = this.f210421L.f212600u;
            String str3 = "";
            String string = bundle == null ? str3 : bundle.getString("extinfo_key_19", str3);
            boolean z = true;
            if (!Util.isNullOrNil(string)) {
                str = string;
            } else {
                PayInfo payInfo = this.f210421L;
                int i2 = payInfo.f212587e;
                if (i2 == 32 || i2 == 33) {
                    String string2 = payInfo.f212600u.getString("extinfo_key_5", str3);
                    String string3 = this.f210421L.f212600u.getString("extinfo_key_1", str3);
                    String string4 = getContext().getString(C0966R.string.l5v);
                    if (!Util.isNullOrNil(string2)) {
                        str2 = string2;
                    } else {
                        string2 = string4;
                        str2 = str3;
                    }
                    if (!Util.isNullOrNil(string3)) {
                        C72996z1 N2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69664N2(string3);
                        if (N2 != null) {
                            String f = N2.mo62898f();
                            Object[] objArr = new Object[1];
                            StringBuilder sb = new StringBuilder();
                            sb.append(C75228t.m90276y(f));
                            if (!Util.isNullOrNil(this.f210421L.f212585Q)) {
                                str3 = "(" + this.f210421L.f212585Q + ")";
                            }
                            sb.append(str3);
                            objArr[0] = sb.toString();
                            str2 = Util.safeFormatString(string2, objArr);
                        } else {
                            Log.m105920e("MicroMsg.WcPayCashierDialog", "can not found contact for user::" + string3 + str3);
                        }
                    } else {
                        Log.m105920e("MicroMsg.WcPayCashierDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                    }
                    str = str2;
                } else {
                    if (i2 == 31) {
                        String string5 = payInfo.f212600u.getString("extinfo_key_1", str3);
                        if (!Util.isNullOrNil(string5)) {
                            C72996z1 N22 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69664N2(string5);
                            if (N22 != null) {
                                String j3 = N22.mo62909j3();
                                Context context = getContext();
                                Object[] objArr2 = new Object[1];
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(j3);
                                if (!Util.isNullOrNil(this.f210421L.f212585Q)) {
                                    str3 = "(" + this.f210421L.f212585Q + ")";
                                }
                                sb4.append(str3);
                                objArr2[0] = sb4.toString();
                                str3 = context.getString(C0966R.string.l5v, objArr2);
                            } else {
                                Log.m105920e("MicroMsg.WcPayCashierDialog", "can not found contact for user::" + string5 + str3);
                            }
                        } else {
                            Log.m105920e("MicroMsg.WcPayCashierDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                        }
                    } else if (i2 == 42) {
                        String string6 = payInfo.f212600u.getString("extinfo_key_1", str3);
                        if (!Util.isNullOrNil(string6)) {
                            C86709a0.m107528h();
                            C72996z1 N23 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69664N2(string6);
                            if (N23 != null) {
                                String j35 = N23.mo62909j3();
                                Context context2 = getContext();
                                Object[] objArr3 = new Object[1];
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(j35);
                                if (!Util.isNullOrNil(this.f210421L.f212585Q)) {
                                    str3 = "(" + this.f210421L.f212585Q + ")";
                                }
                                sb5.append(str3);
                                objArr3[0] = sb5.toString();
                                str3 = context2.getString(C0966R.string.l5o, objArr3);
                            } else {
                                Log.m105920e("MicroMsg.WcPayCashierDialog", "can not found contact for user::" + string6 + str3);
                            }
                        } else {
                            Log.m105920e("MicroMsg.WcPayCashierDialog", "userName is null ,scene is MMPAY_PAY_SCENE_TRANSFER");
                        }
                    } else if (i2 == 48) {
                        str = getContext().getString(C0966R.string.hpd);
                    } else if (i2 == 49) {
                        String string7 = payInfo.f212600u.getString("extinfo_key_1", str3);
                        if (!Util.isNullOrNil(string7)) {
                            str3 = getContext().getString(C0966R.string.l5v, new Object[]{string7});
                        } else {
                            Log.m105921e("MicroMsg.WcPayCashierDialog", "userName is null, scene is %s", Integer.valueOf(this.f210421L.f212587e));
                        }
                    } else if (i2 == 56) {
                        String string8 = payInfo.f212600u.getString("extinfo_key_12", str3);
                        if (!Util.isNullOrNil(string8)) {
                            str3 = string8;
                        } else {
                            Log.m105921e("MicroMsg.WcPayCashierDialog", "title is null, scene is %s", Integer.valueOf(this.f210421L.f212587e));
                        }
                    } else if (i2 == 45 || i2 == 52) {
                        str = getContext().getString(C0966R.string.kyx);
                    } else if (i2 == 11) {
                        str = getContext().getString(C0966R.string.kmf);
                    }
                    str = str3;
                }
            }
            if (!Util.isNullOrNil(str) || (orders = this.f210422M) == null || (list = orders.f209542M) == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("orders null?:");
                if (this.f210422M != null) {
                    z = false;
                }
                sb6.append(z);
                Log.m105928w("MicroMsg.WcPayCashierDialog", sb6.toString());
            } else {
                Orders.Commodity commodity = (Orders.Commodity) ((ArrayList) list).get(0);
                if (commodity != null) {
                    String str4 = commodity.f209598g;
                    PayInfo payInfo2 = this.f210421L;
                    if (payInfo2 == null || !((i = payInfo2.f212587e) == 31 || i == 32 || i == 33)) {
                        z = false;
                    }
                    if (z) {
                        if (!Util.isNullOrNil(str4)) {
                            str4 = str4 + "\n";
                        }
                        str4 = str4 + commodity.f209599h;
                    }
                    if (Util.isNullOrNil(str)) {
                        str = commodity.f209599h;
                    }
                }
            }
        }
        this.f210439h.setText(str);
        mo99706q();
        this.f210440i.setContentDescription(this.f210439h.getText().toString() + "," + this.f210441j.mo105014a().toString());
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onActivityPause() {
        Log.m105924i("MicroMsg.WcPayCashierDialog", "activity paused, release and dismiss");
        this.f210443o.mo105043a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f210435d);
        Window window = getWindow();
        window.getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        window.setAttributes(attributes);
        window.addFlags(67108864);
        if (C75228t.m90212E()) {
            window.addFlags(8192);
        }
    }

    public void onStart() {
        super.onStart();
        if (this.f210418I == 0) {
            TextView textView = this.f210437f;
            if (textView != null) {
                textView.post(new C72355h());
                return;
            }
            return;
        }
        Button button = this.f210446q;
        if (button != null) {
            button.post(new C72347a());
        }
    }

    /* renamed from: q */
    public final void mo99706q() {
        String str;
        if (this.f210433Y) {
            str = this.f210432X;
        } else {
            C72394l a = C72400m.INSTANCE.mo99776a(this.f210422M);
            Orders orders = this.f210422M;
            String m = C75228t.m90258m(orders.f209566h, orders.f209568j);
            this.f210429U = false;
            if (a != null) {
                C79034n f = a.mo99770f(this.f210423N.f209524d);
                List<C79030d0> i = a.mo99772i();
                if (f != null && f.f232091j > 0.0d) {
                    this.f210429U = true;
                    str = C75228t.m90258m(f.f232090i, this.f210422M.f209568j);
                } else if (f == null || ((LinkedList) i).size() <= 0) {
                    Orders orders2 = this.f210422M;
                    str = C75228t.m90258m(orders2.f209566h, orders2.f209568j);
                } else {
                    str = C75228t.m90258m(f.f232090i, this.f210422M.f209568j);
                }
            } else {
                str = m;
            }
        }
        this.f210441j.setText(str);
    }

    /* renamed from: r */
    public final void mo99707r() {
        mo99694E();
        boolean z = true;
        Log.m105925i("MicroMsg.WcPayCashierDialog", "use touch pay: %s", Integer.valueOf(this.f210422M.f209538I));
        int i = this.f210418I;
        if (i == 0) {
            if (this.f210419J > 0) {
                z = false;
            } else {
                int i2 = this.f210420K;
                if (i2 == 1) {
                    this.f210447r.setVisibility(8);
                } else if (i2 == 3) {
                    this.f210447r.setText(C0966R.string.ksz);
                    this.f210447r.setVisibility(0);
                } else {
                    if (this.f210421L.f212574E == 100102) {
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINGER_PRINT_LAST_IS_SEVERE_ERROR_BOOLEAN_SYNC, Boolean.TRUE);
                        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
                        aVar.mo107878Fg(false);
                        aVar.W00(false);
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINGER_PRINT_SHOW_OPEN_GUIDE_IN_TRANSPARENT_NEW_BOOLEAN_SYNC, Boolean.FALSE);
                        this.f210447r.setText(C0966R.string.kt6);
                    } else {
                        this.f210447r.setText(C0966R.string.ksz);
                    }
                    this.f210447r.setTextColor(getContext().getResources().getColor(C0966R.color.ajw));
                    this.f210447r.setVisibility(0);
                }
            }
            mo99693D(z);
        } else if (i == 1) {
            mo99692C();
        } else if (i == 2) {
            mo99691B();
        }
    }

    /* renamed from: s */
    public final void mo99708s(List<te4> list) {
        if (list != null && !list.isEmpty()) {
            for (te4 next : list) {
                WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout = new WcPayCashierDetailItemLayout(getContext());
                wcPayCashierDetailItemLayout.f210402e.setVisibility(8);
                LinkedList<zf4> linkedList = next.f142183e;
                if (linkedList != null && linkedList.size() > 0) {
                    C43423i0.m46937h(wcPayCashierDetailItemLayout.f210401d, next.f142183e.get(0), (C43423i0.C43428e) null);
                }
                LinkedList<zf4> linkedList2 = next.f142184f;
                if (linkedList2 == null || linkedList2.size() <= 0) {
                    wcPayCashierDetailItemLayout.f210403f.setVisibility(8);
                    wcPayCashierDetailItemLayout.f210401d.setMaxWidth(Integer.MAX_VALUE);
                } else {
                    C43423i0.m46937h(wcPayCashierDetailItemLayout.f210403f, next.f142184f.get(0), (C43423i0.C43428e) null);
                }
                if (next.f142185g != null) {
                    C43423i0.m46934e(wcPayCashierDetailItemLayout.f210404g, next.f142185g, C0966R.raw.arrow_right, C76577a.m92151b(MMApplicationContext.getContext(), 8), C76577a.m92151b(MMApplicationContext.getContext(), 16), true);
                    wcPayCashierDetailItemLayout.f210404g.setVisibility(0);
                } else {
                    wcPayCashierDetailItemLayout.f210404g.setVisibility(8);
                }
                wcPayCashierDetailItemLayout.mo99688a();
                if (next.f142189n != null) {
                    wcPayCashierDetailItemLayout.setOnClickListener(new C43389b(next));
                }
                this.f210442n.addView(wcPayCashierDetailItemLayout);
            }
        }
    }

    public void show() {
        super.show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if ((r0 != null && ((java.util.HashMap) r0).size() > 0) == false) goto L_0x007c;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99710t() {
        /*
            r3 = this;
            com.tencent.mm.plugin.wallet_core.ui.m r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.C72400m.INSTANCE
            com.tencent.mm.plugin.wallet_core.model.Orders r1 = r3.f210422M
            com.tencent.mm.plugin.wallet_core.ui.l r0 = r0.mo99776a(r1)
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r1 = r3.f210423N
            if (r1 == 0) goto L_0x007c
            r1 = 0
            if (r0 == 0) goto L_0x0021
            java.util.Map<java.lang.String, y43.d0> r0 = r0.f210615b
            if (r0 == 0) goto L_0x001d
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x001d
            r0 = 1
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 != 0) goto L_0x0021
            goto L_0x007c
        L_0x0021:
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.f210412C
            if (r0 != 0) goto L_0x0074
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout
            android.content.Context r2 = r3.getContext()
            r0.<init>(r2)
            r3.f210412C = r0
            android.view.ViewGroup r2 = r3.f210442n
            r2.addView(r0)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.f210412C
            android.widget.TextView r0 = r0.f210401d
            r2 = 2131839895(0x7f114b97, float:1.9313054E38)
            r0.setText(r2)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.f210412C
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = r0.f210402e
            r2 = 8
            r0.setVisibility(r2)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.f210412C
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = r0.f210404g
            r0.setVisibility(r1)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.f210412C
            android.widget.TextView r0 = r0.f210403f
            android.content.Context r1 = r3.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099865(0x7f0600d9, float:1.7812095E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.f210412C
            r0.mo99688a()
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.f210412C
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$c r1 = new com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDialog$c
            r1.<init>()
            r0.setOnClickListener(r1)
        L_0x0074:
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r0 = r3.f210412C
            android.widget.TextView r0 = r0.f210403f
            r3.mo99696f(r0)
            return
        L_0x007c:
            android.view.ViewGroup r0 = r3.f210442n
            com.tencent.mm.plugin.wallet_core.ui.cashier.WcPayCashierDetailItemLayout r1 = r3.f210412C
            r0.removeView(r1)
            r0 = 0
            r3.f210412C = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.cashier.WcPayCashierDialog.mo99710t():void");
    }

    /* renamed from: u */
    public final void mo99711u() {
        String str;
        if (!this.f210429U) {
            WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout = this.f210410A;
            if (wcPayCashierDetailItemLayout != null) {
                this.f210442n.removeView(wcPayCashierDetailItemLayout);
                this.f210410A = null;
                return;
            }
            return;
        }
        if (this.f210410A == null) {
            WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout2 = new WcPayCashierDetailItemLayout(getContext());
            this.f210410A = wcPayCashierDetailItemLayout2;
            this.f210442n.addView(wcPayCashierDetailItemLayout2, 0);
            this.f210410A.f210401d.setText(C0966R.string.f361629ld1);
            this.f210410A.f210402e.setVisibility(8);
            this.f210410A.f210404g.setVisibility(8);
            this.f210410A.mo99688a();
            try {
                this.f210410A.f210403f.setTypeface(Typeface.createFromAsset(getContext().getAssets(), C75228t.m90273v(7)));
            } catch (Exception e) {
                Log.m105921e("MicroMsg.WcPayCashierDialog", "setTypeface() Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
            }
            this.f210410A.f210403f.getPaint().setFlags(16);
        }
        if (Util.isNullOrNil(this.f210422M.f209583y0) || Util.isNullOrNil(this.f210422M.f209548R0)) {
            str = "";
        } else {
            Orders orders = this.f210422M;
            str = String.format("%s%s", new Object[]{orders.f209548R0, orders.f209583y0});
        }
        Orders orders2 = this.f210422M;
        String m = C75228t.m90258m(orders2.f209566h, orders2.f209568j);
        if (!Util.isNullOrNil(str)) {
            m = String.format("%s(%s)", new Object[]{m, str});
        }
        this.f210410A.f210403f.setText(m);
    }

    /* renamed from: v */
    public final void mo99712v() {
        if (!this.f210426R) {
            Log.m105924i("MicroMsg.WcPayCashierDialog", "can not change pay way");
            this.f210411B.setVisibility(8);
            return;
        }
        this.f210411B.setVisibility(0);
        this.f210411B.f210401d.setText(C0966R.string.f361630ld2);
        this.f210411B.f210402e.setVisibility(0);
        this.f210411B.f210404g.setVisibility(0);
        this.f210411B.mo99688a();
        this.f210411B.setOnClickListener(new C72351d());
        this.f210411B.f210402e.setImageBitmap((Bitmap) null);
        Bankcard bankcard = this.f210424P;
        CdnImageView cdnImageView = this.f210411B.f210402e;
        if (bankcard == null) {
            Log.m105920e("MicroMsg.WcPayCashierDialog", "setBankcardText bankcard == null");
        } else if (bankcard.mo99388n2()) {
            cdnImageView.setImageResource(C0966R.C0969drawable.cek);
        } else if (bankcard.mo99393s2()) {
            this.f210428T.mo99895f(bankcard, cdnImageView);
        } else if (bankcard.mo99392r2()) {
            cdnImageView.setImageDrawable(C87515a.m108835e(getContext().getResources(), C0966R.raw.honey_pay_bank_logo, 0.0f));
            if (!Util.isNullOrNil(bankcard.f209391D2)) {
                cdnImageView.setUseSdcardCache(true);
                cdnImageView.setImgSavedPath(C75556b.f221973a);
                cdnImageView.mo100288c(bankcard.f209391D2, 0, 0, C0966R.raw.honey_pay_bank_logo);
            }
        } else {
            this.f210428T.mo99894e(getContext(), bankcard, cdnImageView);
        }
        Bankcard bankcard2 = this.f210424P;
        String str = bankcard2 == null ? "" : bankcard2.field_desc;
        if (bankcard2 != null && bankcard2.mo99392r2()) {
            str = ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f210417H, str);
        }
        WcPayCashierDetailItemLayout wcPayCashierDetailItemLayout = this.f210411B;
        wcPayCashierDetailItemLayout.f210403f.setText(str);
        wcPayCashierDetailItemLayout.post(new C75716d(wcPayCashierDetailItemLayout));
    }

    /* renamed from: y */
    public final void mo99713y(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f210444p.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f210446q.getLayoutParams();
        if (i == 0) {
            int i2 = f210408S0;
            layoutParams.topMargin = i2;
            layoutParams2.topMargin = i2;
        } else {
            layoutParams.topMargin = f210406Q0;
            layoutParams2.topMargin = f210407R0;
        }
        this.f210444p.setLayoutParams(layoutParams);
        this.f210446q.setLayoutParams(layoutParams2);
        this.f210448s.setVisibility(i);
    }

    /* renamed from: z */
    public final void mo99714z() {
        if (!this.f210455y.isShown()) {
            this.f210455y.setVisibility(0);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2492eg);
            loadAnimation.setInterpolator(new DecelerateInterpolator());
            loadAnimation.setDuration(180);
            this.f210455y.startAnimation(loadAnimation);
        }
    }

    public WcPayCashierDialog(Context context, int i) {
        super(context, C0966R.style.a66);
        this.f210417H = context;
        mo99699i();
    }
}
