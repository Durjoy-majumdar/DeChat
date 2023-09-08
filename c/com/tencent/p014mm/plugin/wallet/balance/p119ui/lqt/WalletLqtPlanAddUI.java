package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import b63.C67181d;
import b63.C67183e;
import b63.C67197o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.KindaBindCardEvent;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C45056f1;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43305l;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43314s0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43318t;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71649o1;
import com.tencent.p014mm.plugin.wallet_core.model.Bankcard;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdNewUI;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.keyboard.WcPayKeyboard;
import com.tencent.p014mm.wallet_core.model.C45121z0;
import com.tencent.p014mm.wallet_core.model.C75097a;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75217h;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tenpay.android.wechat.TenpaySecureEditText;
import di3.C86312j;
import e63.C75556b;
import g63.C75886j;
import h81.C32735h;
import ie3.C76324c;
import j20.C117292a;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import k53.C76492a;
import kg3.C76577a;
import lp3.C88633e;
import lp3.C88643g;
import nj3.C76874e0;
import p206nj.C11171e;
import p281yz.C79173v;
import p629ny.C76979h;
import p755xs.C102720b;
import qo3.C101218e0;
import te3.C48719ai2;
import te3.C48891bp3;
import te3.C49703hg3;
import te3.C50269li3;
import te3.C77909bp;
import te3.C78017yd3;
import yq3.C79143a;
import yq3.C79144b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI */
public class WalletLqtPlanAddUI extends WalletLqtBasePresenterUI implements WcPayKeyboard.C75086f {

    /* renamed from: y0 */
    public static final /* synthetic */ int f207994y0 = 0;

    /* renamed from: A */
    public C43314s0 f207995A = ((C43314s0) this.f207915d.mo136940b(this, C43314s0.class));

    /* renamed from: B */
    public int f207996B = 0;

    /* renamed from: C */
    public int f207997C;

    /* renamed from: D */
    public boolean f207998D = false;

    /* renamed from: E */
    public String f207999E;

    /* renamed from: F */
    public String f208000F;

    /* renamed from: G */
    public List<Bankcard> f208001G = new ArrayList();

    /* renamed from: H */
    public C50269li3 f208002H;

    /* renamed from: I */
    public C78017yd3 f208003I = new C78017yd3();

    /* renamed from: J */
    public LinearLayout f208004J;

    /* renamed from: K */
    public long f208005K;

    /* renamed from: L */
    public int f208006L;

    /* renamed from: M */
    public String f208007M;

    /* renamed from: N */
    public String f208008N;

    /* renamed from: P */
    public String[] f208009P;

    /* renamed from: Q */
    public Button f208010Q;

    /* renamed from: R */
    public Button f208011R;

    /* renamed from: S */
    public Button f208012S;

    /* renamed from: T */
    public RelativeLayout f208013T;

    /* renamed from: U */
    public List<C48891bp3> f208014U = new ArrayList();

    /* renamed from: V */
    public boolean f208015V = false;

    /* renamed from: W */
    public boolean f208016W = true;

    /* renamed from: X */
    public boolean f208017X = true;

    /* renamed from: Y */
    public C75217h f208018Y;

    /* renamed from: Z */
    public C76492a f208019Z;

    /* renamed from: e */
    public ScrollView f208020e;

    /* renamed from: f */
    public TextView f208021f;

    /* renamed from: g */
    public TextView f208022g;

    /* renamed from: h */
    public TextView f208023h;

    /* renamed from: i */
    public TextView f208024i;

    /* renamed from: j */
    public WalletFormView f208025j;

    /* renamed from: n */
    public TextView f208026n;

    /* renamed from: o */
    public CdnImageView f208027o;

    /* renamed from: p */
    public TextView f208028p;

    /* renamed from: p0 */
    public HashMap<String, Integer> f208029p0 = new HashMap<>();

    /* renamed from: q */
    public LinearLayout f208030q;

    /* renamed from: r */
    public TextView f208031r;

    /* renamed from: s */
    public LinearLayout f208032s;

    /* renamed from: t */
    public Button f208033t;

    /* renamed from: u */
    public CheckBox f208034u;

    /* renamed from: v */
    public LinearLayout f208035v;

    /* renamed from: w */
    public WcPayKeyboard f208036w;

    /* renamed from: x */
    public View f208037x;

    /* renamed from: x0 */
    public IListener<KindaBindCardEvent> f208038x0 = new IListener<KindaBindCardEvent>(C40008f.f107254d) {
        {
            this.__eventId = 572563856;
        }

        public boolean callback(IEvent iEvent) {
            KindaBindCardEvent kindaBindCardEvent = (KindaBindCardEvent) iEvent;
            Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "KindaBindCardEvent callback");
            if (kindaBindCardEvent == null) {
                return false;
            }
            C75133p0.m90117a();
            KindaBindCardEvent.C67721a aVar = kindaBindCardEvent.f193698d;
            if (aVar != null) {
                if (aVar.f193699a) {
                    Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "KindaBindCardEvent bindCard Succ");
                    Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "bind card serial: %s", kindaBindCardEvent.f193698d.f193701c);
                    WalletLqtPlanAddUI walletLqtPlanAddUI = WalletLqtPlanAddUI.this;
                    String str = kindaBindCardEvent.f193698d.f193701c;
                    int i = WalletLqtPlanAddUI.f207994y0;
                    Bankcard M7 = walletLqtPlanAddUI.mo98931M7(str);
                    if (M7 != null) {
                        WalletLqtPlanAddUI walletLqtPlanAddUI2 = WalletLqtPlanAddUI.this;
                        C78017yd3 yd32 = walletLqtPlanAddUI2.f208003I;
                        yd32.f228575h = M7.field_bindSerial;
                        yd32.f228573f = M7.field_bankcardType;
                        yd32.f228582r = M7.field_bankName;
                        yd32.f228574g = M7.field_bankcardTail;
                        walletLqtPlanAddUI2.mo98934P7();
                    }
                    WalletLqtPlanAddUI.this.mo98930L7(false);
                } else {
                    Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "KindaBindCardEvent bindCard Cancel");
                }
            }
            WalletLqtPlanAddUI.this.f208038x0.dead();
            return true;
        }
    };

    /* renamed from: y */
    public View f208039y;

    /* renamed from: z */
    public View f208040z;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$a */
    public class C43333a implements C75097a.C75099b<C49703hg3> {

        /* renamed from: a */
        public final /* synthetic */ boolean f117189a;

        /* renamed from: b */
        public final /* synthetic */ Dialog f117190b;

        public C43333a(boolean z, Dialog dialog) {
            this.f117189a = z;
            this.f117190b = dialog;
        }

        /* renamed from: a */
        public void mo67542a(Object obj) {
            C49703hg3 hg32 = (C49703hg3) obj;
            if (hg32 != null) {
                WalletLqtPlanAddUI.m84210H7(WalletLqtPlanAddUI.this, hg32, this.f117189a);
            }
        }

        /* renamed from: b */
        public void mo67543b(Object obj, int i, int i2) {
            C49703hg3 hg32 = (C49703hg3) obj;
            Dialog dialog = this.f117190b;
            if (dialog != null) {
                dialog.dismiss();
            }
            if (hg32 != null) {
                int i3 = hg32.f134617d;
                if (i3 == 0) {
                    WalletLqtPlanAddUI.m84210H7(WalletLqtPlanAddUI.this, hg32, this.f117189a);
                } else {
                    C67197o.m79488c(i3, hg32.f134618e).mo91297a(WalletLqtPlanAddUI.this.getContext(), true);
                }
            } else {
                C67197o.m79487b(0, 0).mo91297a(WalletLqtPlanAddUI.this.getContext(), true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$b */
    public class C71735b implements Runnable {
        public C71735b() {
        }

        public void run() {
            WalletFormView walletFormView = WalletLqtPlanAddUI.this.f208025j;
            TenpaySecureEditText tenpaySecureEditText = walletFormView.f221285g;
            if (tenpaySecureEditText != null) {
                tenpaySecureEditText.setFocusable(true);
                walletFormView.f221285g.requestFocus();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$c */
    public class C71736c implements Runnable {
        public C71736c() {
        }

        public void run() {
            View view = WalletLqtPlanAddUI.this.f208040z;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$23", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            WalletLqtPlanAddUI walletLqtPlanAddUI = WalletLqtPlanAddUI.this;
            ScrollView scrollView = walletLqtPlanAddUI.f208020e;
            View findViewById = walletLqtPlanAddUI.findViewById(C0966R.C0970id.hr8);
            WalletLqtPlanAddUI walletLqtPlanAddUI2 = WalletLqtPlanAddUI.this;
            C45056f1.m49908a(walletLqtPlanAddUI, scrollView, findViewById, walletLqtPlanAddUI2.f208037x, walletLqtPlanAddUI2.f208040z, 24);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$d */
    public class C71737d implements C102720b.C78973a {

        /* renamed from: d */
        public final /* synthetic */ Bankcard f208044d;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$d$a */
        public class C71738a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f208046d;

            public C71738a(Bitmap bitmap) {
                this.f208046d = bitmap;
            }

            public void run() {
                C71737d dVar = C71737d.this;
                if (dVar.f208044d != null && WalletLqtPlanAddUI.this.f208027o.getTag() != null && WalletLqtPlanAddUI.this.f208027o.getTag().equals(C71737d.this.f208044d.field_bindSerial)) {
                    WalletLqtPlanAddUI.this.f208027o.setImageBitmap(this.f208046d);
                }
            }
        }

        public C71737d(Bankcard bankcard) {
            this.f208044d = bankcard;
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            MMHandlerThread.postToMainThread(new C71738a(bitmap));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$e */
    public class C71739e implements TextView.OnEditorActionListener {
        public C71739e() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
                Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "click enter");
                WalletLqtPlanAddUI.this.hideWcKb();
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$f */
    public class C71740f implements View.OnClickListener {
        public C71740f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (WalletLqtPlanAddUI.this.f208036w.isShown()) {
                WalletLqtPlanAddUI.this.hideWcKb();
            }
            Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "click btn");
            WalletLqtPlanAddUI.m84212J7(WalletLqtPlanAddUI.this);
            if (!WalletLqtPlanAddUI.this.f208033t.isEnabled()) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C50269li3 li32 = WalletLqtPlanAddUI.this.f208002H;
            if (li32 == null || Util.isNullOrNil(li32.f137442d)) {
                WalletLqtPlanAddUI walletLqtPlanAddUI = WalletLqtPlanAddUI.this;
                if (walletLqtPlanAddUI.f207997C == 1) {
                    walletLqtPlanAddUI.mo98932N7(0);
                } else {
                    walletLqtPlanAddUI.mo98932N7(4);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            WalletLqtPlanAddUI walletLqtPlanAddUI2 = WalletLqtPlanAddUI.this;
            C101218e0 e0Var = new C101218e0(walletLqtPlanAddUI2.getContext(), 1, 3);
            e0Var.mo140667n(walletLqtPlanAddUI2.getString(C0966R.string.f7948x5), walletLqtPlanAddUI2.getString(C0966R.string.f7569jy));
            C71794e1 e1Var = new C71794e1(walletLqtPlanAddUI2, e0Var);
            C71796f1 f1Var = new C71796f1(walletLqtPlanAddUI2, e0Var);
            e0Var.f296373D = e1Var;
            e0Var.f296374E = f1Var;
            View inflate = View.inflate(walletLqtPlanAddUI2.getContext(), C0966R.C0971layout.b8m, (ViewGroup) null);
            TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.g9a);
            textView.setText(walletLqtPlanAddUI2.getString(C0966R.string.kxj));
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
            e0Var.mo140672r(inflate);
            View inflate2 = View.inflate(walletLqtPlanAddUI2.getContext(), C0966R.C0971layout.b8l, (ViewGroup) null);
            TextView textView2 = (TextView) inflate2.findViewById(C0966R.C0970id.g9_);
            C85875k4.m106189j0(textView2.getPaint(), 0.8f);
            String string = walletLqtPlanAddUI2.getString(C0966R.string.kxi, new Object[]{walletLqtPlanAddUI2.f208002H.f137442d});
            C75228t.m90253j0(textView2, string, 0, ((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(walletLqtPlanAddUI2, string).length(), new C7092q((C7092q.C7093a) new C43342g1(walletLqtPlanAddUI2), true), walletLqtPlanAddUI2.getContext());
            e0Var.mo140663j(inflate2);
            e0Var.mo140655A();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$g */
    public class C71741g implements CompoundButton.OnCheckedChangeListener {
        public C71741g() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            WalletLqtPlanAddUI.m84212J7(WalletLqtPlanAddUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$h */
    public class C71742h implements View.OnClickListener {
        public C71742h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtPlanAddUI walletLqtPlanAddUI = WalletLqtPlanAddUI.this;
            int i = WalletLqtPlanAddUI.f207994y0;
            walletLqtPlanAddUI.getClass();
            Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "show bankcard menu");
            if (walletLqtPlanAddUI.f208036w.isShown()) {
                walletLqtPlanAddUI.hideWcKb();
            }
            C76492a aVar = walletLqtPlanAddUI.f208019Z;
            if (aVar == null || !aVar.mo106726a()) {
                walletLqtPlanAddUI.f208019Z = new C76492a(walletLqtPlanAddUI);
                boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_payment_select_remove_confirm_button_android, false);
                List list = walletLqtPlanAddUI.f208001G;
                if (list == null) {
                    list = new LinkedList();
                }
                int size = list.size();
                Bankcard M7 = walletLqtPlanAddUI.mo98931M7(walletLqtPlanAddUI.f208003I.f228575h);
                if (M7 != null && !Util.isNullOrNil(M7.field_bindSerial)) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (M7.field_bindSerial.equals(((Bankcard) list.get(i2)).field_bindSerial)) {
                            size = i2;
                        }
                    }
                }
                if (M7 == null) {
                    size = -1;
                }
                walletLqtPlanAddUI.f208019Z.f223923c = new C71818p0(walletLqtPlanAddUI, list);
                C76874e0 e0Var = new C76874e0(walletLqtPlanAddUI);
                e0Var.mo107156p(0, walletLqtPlanAddUI.getString(C0966R.string.kxm), (CharSequence) null, walletLqtPlanAddUI.getResources().getDrawable(C0966R.raw.icons_outlined_pay_cards), walletLqtPlanAddUI.getResources().getColor(C0966R.color.FG_2), false);
                if (wf) {
                    e0Var.mo107160r(1, "", true);
                }
                C76492a aVar2 = walletLqtPlanAddUI.f208019Z;
                C71824q0 q0Var = new C71824q0(walletLqtPlanAddUI);
                aVar2.f223927g = e0Var;
                aVar2.f223925e = q0Var;
                if (wf) {
                    aVar2.f223924d = new C71827r0(walletLqtPlanAddUI, list);
                } else {
                    aVar2.f223921a.f296375F = new C71830s0(walletLqtPlanAddUI, list);
                }
                View inflate = View.inflate(walletLqtPlanAddUI, C0966R.C0971layout.b98, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gbk);
                textView.setText(C0966R.string.kxk);
                C85875k4.m106189j0(textView.getPaint(), 0.8f);
                View findViewById = inflate.findViewById(C0966R.C0970id.c4p);
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view2 = findViewById;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI", "showBankcardListMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI", "showBankcardListMenu", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.findViewById(C0966R.C0970id.gal).setOnClickListener(new C71833t0(walletLqtPlanAddUI));
                inflate.findViewById(C0966R.C0970id.gal).setContentDescription(walletLqtPlanAddUI.getString(C0966R.string.kk5));
                C76492a aVar4 = walletLqtPlanAddUI.f208019Z;
                aVar4.f223921a.mo140673s(inflate);
                aVar4.f223930j = inflate;
                C76492a aVar5 = walletLqtPlanAddUI.f208019Z;
                aVar5.f223933m = size;
                aVar5.f223932l = true;
                if (wf) {
                    aVar5.f223931k = false;
                } else {
                    aVar5.f223931k = true;
                }
                aVar5.f223921a.mo140677w(walletLqtPlanAddUI.getResources().getString(C0966R.string.kse));
                walletLqtPlanAddUI.f208019Z.mo106729d();
                MMHandlerThread.postToMainThreadDelayed(new C71836u0(walletLqtPlanAddUI, textView), 500);
            } else {
                Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "mmBottomSheet != null && mmBottomSheet.isShowing(),dont show bottomSheet");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$i */
    public class C71743i implements View.OnClickListener {
        public C71743i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtPlanAddUI walletLqtPlanAddUI = WalletLqtPlanAddUI.this;
            int i = WalletLqtPlanAddUI.f207994y0;
            walletLqtPlanAddUI.getClass();
            Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "show date picker");
            if (walletLqtPlanAddUI.f208036w.isShown()) {
                walletLqtPlanAddUI.hideWcKb();
            }
            C7045j jVar = new C7045j((Context) walletLqtPlanAddUI, walletLqtPlanAddUI.f208009P);
            int i2 = walletLqtPlanAddUI.f208003I.f228571d - 1;
            if (i2 >= 0) {
                jVar.mo8106i(i2);
            }
            jVar.f24869t = new C71838v0(walletLqtPlanAddUI, jVar);
            jVar.mo8109l();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$j */
    public class C71744j implements TextWatcher {
        public C71744j() {
        }

        public void afterTextChanged(Editable editable) {
            if (editable.toString().startsWith(".")) {
                editable.insert(0, "0");
            }
            String obj = editable.toString();
            int indexOf = obj.indexOf(".");
            int length = obj.length();
            if (indexOf >= 0 && length - indexOf > 2) {
                editable.delete(indexOf + 3, length);
            }
            WalletLqtPlanAddUI walletLqtPlanAddUI = WalletLqtPlanAddUI.this;
            int i = WalletLqtPlanAddUI.f207994y0;
            walletLqtPlanAddUI.mo98936R7();
            WalletLqtPlanAddUI.m84212J7(WalletLqtPlanAddUI.this);
            if (length == 0) {
                WalletLqtPlanAddUI.this.f208036w.mo104738c(false);
            } else {
                WalletLqtPlanAddUI.this.f208036w.mo104738c(true);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$k */
    public class C71745k implements C75217h {

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$k$a */
        public class C71746a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ boolean f208055d;

            public C71746a(boolean z) {
                this.f208055d = z;
            }

            public void run() {
                WalletLqtPlanAddUI walletLqtPlanAddUI = WalletLqtPlanAddUI.this;
                boolean z = this.f208055d;
                int i = WalletLqtPlanAddUI.f207994y0;
                walletLqtPlanAddUI.getClass();
                float b = (float) C76577a.m92151b(walletLqtPlanAddUI, 56);
                float b2 = (float) C76577a.m92151b(walletLqtPlanAddUI, 86);
                if (z && !walletLqtPlanAddUI.f208015V) {
                    if (walletLqtPlanAddUI.f207996B == 0) {
                        walletLqtPlanAddUI.f207996B = walletLqtPlanAddUI.f208022g.getBottom() + C76577a.m92151b(walletLqtPlanAddUI, 6);
                    }
                    if (walletLqtPlanAddUI.f207996B == 0) {
                        walletLqtPlanAddUI.f207996B = C76577a.m92151b(walletLqtPlanAddUI, 132);
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(walletLqtPlanAddUI.f208039y, "translationY", new float[]{0.0f, (float) (-walletLqtPlanAddUI.f207996B)});
                    ofFloat.setDuration(300);
                    ofFloat.setInterpolator(new LinearInterpolator());
                    ofFloat.addUpdateListener(new C43336a1(walletLqtPlanAddUI, b, b2));
                    if (!walletLqtPlanAddUI.f208016W) {
                        Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "do not Scroll Lv ");
                        return;
                    }
                    ofFloat.start();
                    walletLqtPlanAddUI.f208036w.post(new C71785b1(walletLqtPlanAddUI));
                    walletLqtPlanAddUI.f208015V = z;
                } else if (!z && walletLqtPlanAddUI.f208015V) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(walletLqtPlanAddUI.f208039y, "translationY", new float[]{(float) (-walletLqtPlanAddUI.f207996B), 0.0f});
                    ofFloat2.setDuration(300);
                    ofFloat2.setInterpolator(new LinearInterpolator());
                    ofFloat2.addUpdateListener(new C43341c1(walletLqtPlanAddUI, b, b2));
                    ofFloat2.start();
                    walletLqtPlanAddUI.f208036w.post(new C71790d1(walletLqtPlanAddUI));
                    walletLqtPlanAddUI.f208015V = z;
                }
            }
        }

        public C71745k() {
        }

        public void onVisibleStateChange(boolean z) {
            Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "onVisibleStateChange() visitable:%s", Boolean.valueOf(z));
            if (!WalletLqtPlanAddUI.this.f208036w.mo104745i()) {
                WalletLqtPlanAddUI.this.mWcKeyboard.post(new C71746a(z));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI$l */
    public class C71747l implements View.OnTouchListener {
        public C71747l() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            WalletLqtPlanAddUI walletLqtPlanAddUI = WalletLqtPlanAddUI.this;
            int i = WalletLqtPlanAddUI.f207994y0;
            if (!walletLqtPlanAddUI.mWcKeyboard.isShown() || !WalletLqtPlanAddUI.this.mWcKeyboard.mo104748l()) {
                C117292a.m165362h(false, this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            WalletLqtPlanAddUI.this.hideWcKb();
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtPlanAddUI$9", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    static {
        C76577a.m92151b(MMApplicationContext.getContext(), 48);
        C76577a.m92151b(MMApplicationContext.getContext(), 8);
    }

    /* renamed from: H7 */
    public static void m84210H7(WalletLqtPlanAddUI walletLqtPlanAddUI, C49703hg3 hg32, boolean z) {
        Bankcard M7;
        walletLqtPlanAddUI.getClass();
        C48719ai2 ai22 = hg32.f134619f;
        walletLqtPlanAddUI.f208002H = hg32.f134620g;
        walletLqtPlanAddUI.f208008N = hg32.f134625o;
        walletLqtPlanAddUI.f207999E = hg32.f134628r;
        walletLqtPlanAddUI.f208000F = hg32.f134630t;
        walletLqtPlanAddUI.f208014U = hg32.f134633w;
        LinkedList<C77909bp> linkedList = hg32.f134622i;
        if (linkedList != null && !linkedList.isEmpty()) {
            Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "array size: %s", hg32.f134622i);
            ((ArrayList) walletLqtPlanAddUI.f208001G).clear();
            LinkedList<C77909bp> linkedList2 = hg32.f134622i;
            ArrayList arrayList = new ArrayList();
            if (linkedList2 != null && !linkedList2.isEmpty()) {
                Log.m105925i("MicroMsg.BankcardParser", "record size: %s", Integer.valueOf(linkedList2.size()));
                for (C77909bp b : linkedList2) {
                    arrayList.add(C67181d.m79455b(b));
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Bankcard bankcard = (Bankcard) it.next();
                if (bankcard.field_support_lqt_turn_in == 1) {
                    ((ArrayList) walletLqtPlanAddUI.f208001G).add(bankcard);
                } else {
                    Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "not support: %s", bankcard.field_bankcardTypeName);
                }
            }
        }
        if (z && (M7 = walletLqtPlanAddUI.mo98931M7(hg32.f134621h)) != null) {
            C78017yd3 yd32 = walletLqtPlanAddUI.f208003I;
            yd32.f228575h = hg32.f134621h;
            yd32.f228573f = M7.field_bankcardType;
            yd32.f228582r = M7.field_bankName;
            yd32.f228574g = M7.field_bankcardTail;
        }
        C78017yd3 yd33 = walletLqtPlanAddUI.f208003I;
        yd33.f228580p = hg32.f134624n;
        int i = walletLqtPlanAddUI.f207997C;
        if (i == 1 || i == 3) {
            yd33.f228571d = hg32.f134626p;
            yd33.f228572e = hg32.f134627q;
        }
        if (!Util.isNullOrNil(hg32.f134628r)) {
            walletLqtPlanAddUI.f208021f.setText(hg32.f134628r);
        }
        if (!Util.isNullOrNil(hg32.f134629s)) {
            walletLqtPlanAddUI.f208022g.setText(hg32.f134629s);
        }
        if (!Util.isNullOrNil(hg32.f134631u)) {
            walletLqtPlanAddUI.f208023h.setText(hg32.f134631u);
        }
        if (!Util.isNullOrNil(hg32.f134632v)) {
            walletLqtPlanAddUI.f208024i.setText(hg32.f134632v);
        }
        walletLqtPlanAddUI.mo98937S7();
        walletLqtPlanAddUI.f208020e.postDelayed(new C71804k0(walletLqtPlanAddUI), 100);
        if (!walletLqtPlanAddUI.f208014U.isEmpty()) {
            Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "mRecommendedAmt Money: %s，%s,%s", Long.valueOf(walletLqtPlanAddUI.f208014U.get(0).f131248d), Long.valueOf(walletLqtPlanAddUI.f208014U.get(1).f131248d), Long.valueOf(walletLqtPlanAddUI.f208014U.get(2).f131248d));
            Button button = walletLqtPlanAddUI.f208010Q;
            button.setText(walletLqtPlanAddUI.getString(C0966R.string.kyk, new Object[]{"" + walletLqtPlanAddUI.mo98933O7(walletLqtPlanAddUI.f208014U.get(0).f131248d)}));
            Button button2 = walletLqtPlanAddUI.f208011R;
            button2.setText(walletLqtPlanAddUI.getString(C0966R.string.kyk, new Object[]{"" + walletLqtPlanAddUI.mo98933O7(walletLqtPlanAddUI.f208014U.get(1).f131248d)}));
            Button button3 = walletLqtPlanAddUI.f208012S;
            button3.setText(walletLqtPlanAddUI.getString(C0966R.string.kyk, new Object[]{"" + walletLqtPlanAddUI.mo98933O7(walletLqtPlanAddUI.f208014U.get(2).f131248d)}));
            return;
        }
        Button button4 = walletLqtPlanAddUI.f208010Q;
        button4.setText(walletLqtPlanAddUI.getString(C0966R.string.kyk, new Object[]{"" + walletLqtPlanAddUI.mo98933O7(20000)}));
        Button button5 = walletLqtPlanAddUI.f208011R;
        button5.setText(walletLqtPlanAddUI.getString(C0966R.string.kyk, new Object[]{"" + walletLqtPlanAddUI.mo98933O7(80000)}));
        Button button6 = walletLqtPlanAddUI.f208012S;
        button6.setText(walletLqtPlanAddUI.getString(C0966R.string.kyk, new Object[]{"" + walletLqtPlanAddUI.mo98933O7(2000000)}));
    }

    /* renamed from: I7 */
    public static void m84211I7(WalletLqtPlanAddUI walletLqtPlanAddUI) {
        walletLqtPlanAddUI.getClass();
        Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "go to bindcard");
        Bundle bundle = new Bundle();
        bundle.putInt("key_bind_scene", 20);
        boolean z = true;
        bundle.putBoolean("key_need_bind_response", true);
        bundle.putBoolean("key_is_bind_bankcard", true);
        if (C79144b.m95773a().mo109087b()) {
            walletLqtPlanAddUI.f208038x0.alive();
            Log.m105918d("MicroMsg.WalletLqtPlanAddUI", "startKindaBindCard:true");
            C75136r0.m90122d(6, bundle.getInt("key_bind_scene"));
            C75133p0.m90118b(bundle.getInt("key_bind_scene"));
            ((C76324c) C86312j.m106911c(C76324c.class)).startBindCardUseCase(walletLqtPlanAddUI, bundle);
        } else {
            Log.m105918d("MicroMsg.WalletLqtPlanAddUI", "startKindaBindCard:false");
            z = false;
        }
        if (!z) {
            C79143a.m95771j(walletLqtPlanAddUI, C71789d.class, bundle, new C71840w0(walletLqtPlanAddUI));
        }
    }

    /* renamed from: J7 */
    public static void m84212J7(WalletLqtPlanAddUI walletLqtPlanAddUI) {
        double d = Util.getDouble(walletLqtPlanAddUI.f208025j.getText(), 0.0d);
        Bankcard M7 = walletLqtPlanAddUI.mo98931M7(walletLqtPlanAddUI.f208003I.f228575h);
        C78017yd3 yd32 = walletLqtPlanAddUI.f208003I;
        Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "mode: %s, money: %s, bankcard: %s, day: %s", Integer.valueOf(walletLqtPlanAddUI.f207997C), Double.valueOf(d), yd32.f228573f, Integer.valueOf(yd32.f228571d));
        if (M7 == null || walletLqtPlanAddUI.f208003I.f228571d < 1 || d <= 0.0d || d > M7.field_onceQuotaKind) {
            walletLqtPlanAddUI.f208033t.setEnabled(false);
            return;
        }
        if (walletLqtPlanAddUI.f207997C == 2) {
            if (C75228t.m90230W("" + d, "100", 2, RoundingMode.HALF_UP).doubleValue() == ((double) walletLqtPlanAddUI.f208005K)) {
                C78017yd3 yd33 = walletLqtPlanAddUI.f208003I;
                if (yd33.f228571d == walletLqtPlanAddUI.f208006L && yd33.f228575h.equals(walletLqtPlanAddUI.f208007M)) {
                    Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "no changed old");
                    walletLqtPlanAddUI.f208033t.setEnabled(false);
                    return;
                }
            }
        }
        walletLqtPlanAddUI.f208033t.setEnabled(true);
    }

    /* renamed from: K7 */
    public static void m84213K7(WalletLqtPlanAddUI walletLqtPlanAddUI, Boolean bool) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        walletLqtPlanAddUI.getClass();
        if (bool.booleanValue()) {
            objectAnimator2 = ObjectAnimator.ofFloat(walletLqtPlanAddUI.f208013T, "translationY", new float[]{0.0f, (float) ((-walletLqtPlanAddUI.f208036w.getHeight()) + 10)});
            objectAnimator = ObjectAnimator.ofFloat(walletLqtPlanAddUI.f208040z, "translationY", new float[]{0.0f, (float) ((-walletLqtPlanAddUI.f208036w.getHeight()) / 5)});
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(walletLqtPlanAddUI.f208013T, "translationY", new float[]{(float) ((-walletLqtPlanAddUI.f208036w.getHeight()) + 10), 0.0f});
            objectAnimator = ObjectAnimator.ofFloat(walletLqtPlanAddUI.f208040z, "translationY", new float[]{(float) ((-walletLqtPlanAddUI.f208036w.getHeight()) / 5), 0.0f});
        }
        objectAnimator2.setDuration(300);
        objectAnimator2.setInterpolator(new LinearInterpolator());
        objectAnimator.setDuration(300);
        objectAnimator.setInterpolator(new LinearInterpolator());
        objectAnimator2.addListener(new C5755y0(walletLqtPlanAddUI, bool));
        objectAnimator.addListener(new C5757z0(walletLqtPlanAddUI, bool));
        objectAnimator2.start();
        objectAnimator.start();
    }

    /* renamed from: L7 */
    public final void mo98930L7(boolean z) {
        C78017yd3 yd32;
        int i = 0;
        Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "do pre add plan: %s", Boolean.valueOf(z));
        Dialog dialog = null;
        if (this.f207997C == 2 && (yd32 = this.f208003I) != null) {
            int i2 = yd32.f228580p;
            dialog = C75197d0.m90163d(getContext(), false, false, (DialogInterface.OnCancelListener) null);
            i = i2;
        }
        C43318t tVar = new C43318t();
        tVar.f221004c = new C43305l(this.f207997C, i);
        tVar.mo104792c(new C43333a(z, dialog), true);
    }

    /* renamed from: M7 */
    public final Bankcard mo98931M7(String str) {
        Iterator it = ((ArrayList) this.f208001G).iterator();
        while (it.hasNext()) {
            Bankcard bankcard = (Bankcard) it.next();
            if (bankcard.field_bindSerial.equals(str)) {
                return bankcard;
            }
        }
        return ((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91323e(str);
    }

    /* renamed from: N7 */
    public final void mo98932N7(int i) {
        Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "go to check pwd");
        Intent intent = new Intent(this, WalletCheckPwdNewUI.class);
        intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
        MMApplicationContext.getContext();
        intent.putExtra(FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        intent.putExtra("subtitle", C71649o1.m84126a(i));
        startActivityForResult(intent, i);
    }

    /* renamed from: O7 */
    public final String mo98933O7(long j) {
        String str = j + "";
        if (str.length() == 1) {
            return "0.0" + j;
        } else if (str.length() != 2) {
            return str.substring(0, str.length() - 2);
        } else {
            return "0." + j;
        }
    }

    /* renamed from: P7 */
    public final void mo98934P7() {
        Class cls = C102720b.class;
        Bankcard M7 = mo98931M7(this.f208003I.f228575h);
        if (M7 != null) {
            this.f208024i.setVisibility(8);
            if (Util.isNullOrNil(M7.field_bankcardTypeName)) {
                TextView textView = this.f208028p;
                C78017yd3 yd32 = this.f208003I;
                textView.setText(String.format("%s(%s)", new Object[]{yd32.f228582r, yd32.f228574g}));
            } else {
                TextView textView2 = this.f208028p;
                C78017yd3 yd33 = this.f208003I;
                textView2.setText(String.format("%s %s(%s)", new Object[]{yd33.f228582r, M7.field_bankcardTypeName, yd33.f228574g}));
            }
            this.f208027o.setTag(this.f208003I.f228575h);
            if (M7.mo99388n2()) {
                this.f208027o.setImageResource(C0966R.C0969drawable.cek);
                return;
            }
            C67183e c = C75556b.m90593c(this, M7.field_bankcardType, M7.mo99394u2());
            Bitmap N6 = ((C102720b) C86312j.m106911c(cls)).mo142104N6(new C75886j(c != null ? c.f192875a : ""));
            if (N6 != null) {
                this.f208027o.setImageBitmap(N6);
            }
            ((C102720b) C86312j.m106911c(cls)).Lu0(new C71737d(M7));
            return;
        }
        this.f208024i.setVisibility(0);
    }

    /* renamed from: Q7 */
    public final void mo98935Q7() {
        int i = this.f208003I.f228571d - 1;
        Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "select day index: %s", Integer.valueOf(i));
        if (i < 0 || i >= this.f208009P.length) {
            this.f208023h.setVisibility(0);
            return;
        }
        this.f208023h.setVisibility(8);
        this.f208031r.setText(this.f208009P[i]);
    }

    /* renamed from: R2 */
    public void mo95768R2(float f) {
        Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "onUpdateWcPayKeyboardHeight");
        if (this.f208017X) {
            boolean z = false;
            this.f208017X = false;
            int height = ((WindowManager) getSystemService("window")).getDefaultDisplay().getHeight();
            Rect rect = new Rect();
            this.f208030q.getGlobalVisibleRect(rect);
            Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "screenHeight：%s，mWcKeyboard.getHeight():%s,pageBottomRect.bottom:%s", Integer.valueOf(height), Integer.valueOf(this.mWcKeyboard.getHeight()), Integer.valueOf(rect.bottom));
            if ((height - this.mWcKeyboard.getHeight()) - rect.bottom <= C74942w4.m89784a(this, 22)) {
                z = true;
            }
            this.f208016W = z;
        }
    }

    /* renamed from: R7 */
    public final void mo98936R7() {
        double d = Util.getDouble(this.f208025j.getText(), 0.0d);
        Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "money: %s", Double.valueOf(d));
        Bankcard M7 = mo98931M7(this.f208003I.f228575h);
        if (M7 == null || d <= M7.field_dayQuotaKind) {
            this.f208026n.setText(this.f208000F);
            this.f208026n.setTextColor(getResources().getColor(C0966R.color.a7b));
            this.f208004J.setVisibility(0);
            return;
        }
        Log.m105924i("MicroMsg.WalletLqtPlanAddUI", "show over alert");
        this.f208026n.setText(this.f208008N);
        this.f208026n.setTextColor(getResources().getColor(C0966R.color.a_3));
        this.f208004J.setVisibility(0);
    }

    /* renamed from: S7 */
    public final void mo98937S7() {
        if (this.f207997C == 2) {
            BigDecimal h = C75228t.m90248h("" + this.f208003I.f228572e, "100", 2, RoundingMode.HALF_UP);
            if (((double) h.intValue()) == h.doubleValue()) {
                WalletFormView walletFormView = this.f208025j;
                walletFormView.setText("" + h.intValue());
            } else {
                this.f208025j.setText(h.toString());
            }
        }
        mo98934P7();
        mo98935Q7();
        this.f208035v.setVisibility(8);
        mo98936R7();
        this.f208020e.post(new C71736c());
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b97;
    }

    public void hideWcKb() {
        if (this.mWcKeyboard != null) {
            C75217h hVar = this.f208018Y;
            if (hVar != null) {
                ((C71745k) hVar).onVisibleStateChange(false);
            }
            this.mWcKeyboard.mo104741f();
        }
    }

    public void initView() {
        this.f208020e = (ScrollView) findViewById(C0966R.C0970id.g94);
        this.f208021f = (TextView) findViewById(C0966R.C0970id.g8v);
        this.f208022g = (TextView) findViewById(C0966R.C0970id.g8u);
        this.f208023h = (TextView) findViewById(C0966R.C0970id.g8z);
        this.f208024i = (TextView) findViewById(C0966R.C0970id.g8x);
        this.f208025j = (WalletFormView) findViewById(C0966R.C0970id.g8p);
        this.f208026n = (TextView) findViewById(C0966R.C0970id.g8o);
        this.f208027o = (CdnImageView) findViewById(C0966R.C0970id.g8i);
        this.f208028p = (TextView) findViewById(C0966R.C0970id.g8k);
        this.f208030q = (LinearLayout) findViewById(C0966R.C0970id.g8j);
        this.f208031r = (TextView) findViewById(C0966R.C0970id.f358648g90);
        this.f208032s = (LinearLayout) findViewById(C0966R.C0970id.g8y);
        this.f208033t = (Button) findViewById(C0966R.C0970id.g8m);
        this.f208034u = (CheckBox) findViewById(C0966R.C0970id.f358649g91);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f358651g93);
        this.f208035v = (LinearLayout) findViewById(C0966R.C0970id.f358650g92);
        this.f208004J = (LinearLayout) findViewById(C0966R.C0970id.g8n);
        this.f208036w = (WcPayKeyboard) findViewById(C0966R.C0970id.lrk);
        this.f208037x = findViewById(C0966R.C0970id.g95);
        this.f208039y = findViewById(C0966R.C0970id.g96);
        this.f208040z = findViewById(C0966R.C0970id.g8l);
        this.f208013T = (RelativeLayout) findViewById(C0966R.C0970id.igv);
        this.f208010Q = (Button) findViewById(C0966R.C0970id.igw);
        this.f208011R = (Button) findViewById(C0966R.C0970id.igx);
        this.f208012S = (Button) findViewById(C0966R.C0970id.igy);
        TenpaySecureEditText tenpaySecureEditText = this.f208025j.f221285g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setPadding(0, 0, 0, 0);
        }
        this.f208025j.setTitleText(C45121z0.m49962b());
        setWPKeyboard(this.f208025j.getContentEt(), false, false);
        if (C11171e.m11046c(28)) {
            this.f208025j.post(new C71735b());
        }
        this.f208036w.setActionText(getString(C0966R.string.a3d));
        this.f208036w.mo104738c(false);
        ((RelativeLayout.LayoutParams) this.f208036w.getLayoutParams()).addRule(12);
        this.f208025j.getContentEt().setOnEditorActionListener(new C71739e());
        this.f208033t.setOnClickListener(new C71740f());
        this.f208034u.setOnCheckedChangeListener(new C71741g());
        this.f208030q.setOnClickListener(new C71742h());
        this.f208032s.setOnClickListener(new C71743i());
        this.f208025j.mo105069a(new C71744j());
        C71745k kVar = new C71745k();
        this.f208018Y = kVar;
        setTenpayKBStateListener(kVar);
        this.f208020e.setOnTouchListener(new C71747l());
        setResult(0);
        this.f208013T.setVisibility(8);
        Button button = this.f208010Q;
        button.setOnClickListener(new C43358x0(this, button));
        Button button2 = this.f208011R;
        button2.setOnClickListener(new C43358x0(this, button2));
        Button button3 = this.f208012S;
        button3.setOnClickListener(new C43358x0(this, button3));
        setWcKbHeightListener(this);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        Log.m105925i("MicroMsg.WalletLqtPlanAddUI", "activity result: %s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i3 == 0) {
            if (i4 == -1) {
                String stringExtra = intent2.getStringExtra("encrypt_pwd");
                int X = C75228t.m90231X(this.f208025j.getText(), "100");
                C78017yd3 yd32 = this.f208003I;
                String str = yd32.f228573f;
                String str2 = yd32.f228574g;
                String str3 = yd32.f228575h;
                int i5 = yd32.f228571d;
                int i6 = yd32.f228580p;
                Dialog d = C75197d0.m90163d(getContext(), false, false, (DialogInterface.OnCancelListener) null);
                C43314s0.C43315a aVar = this.f207995A.f117151b;
                aVar.getClass();
                ((C88633e) C88643g.m110552j(stringExtra, str, str2, str3, Integer.valueOf(X), Integer.valueOf(i5), Integer.valueOf(i6))).mo123061d(aVar).mo123062e(new C43351m0(this, d)).mo123065b(new C43349l0(this, d));
            }
        } else if (i3 == 4 && i4 == -1) {
            String stringExtra2 = intent2.getStringExtra("encrypt_pwd");
            int X2 = C75228t.m90231X(this.f208025j.getText(), "100");
            C78017yd3 yd33 = this.f208003I;
            int i7 = yd33.f228580p;
            String str4 = yd33.f228573f;
            String str5 = yd33.f228574g;
            String str6 = yd33.f228575h;
            int i8 = yd33.f228571d;
            Dialog d2 = C75197d0.m90163d(getContext(), false, false, (DialogInterface.OnCancelListener) null);
            C43314s0.C43316b bVar = this.f207995A.f117152c;
            bVar.getClass();
            ((C88633e) C88643g.m110552j(Integer.valueOf(i7), str4, str5, str6, Integer.valueOf(X2), Integer.valueOf(i8), stringExtra2)).mo123061d(bVar).mo123062e(new C43355o0(this, d2)).mo123065b(new C43353n0(this, d2));
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        int intExtra = getIntent().getIntExtra("key_mode", 0);
        this.f207997C = intExtra;
        if (intExtra == 2) {
            try {
                C78017yd3 yd32 = new C78017yd3();
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_plan_item");
                if (byteArrayExtra != null) {
                    C78017yd3 yd33 = (C78017yd3) yd32.parseFrom(byteArrayExtra);
                    this.f208003I = yd33;
                    this.f208005K = yd33.f228572e;
                    this.f208006L = yd33.f228571d;
                    this.f208007M = yd33.f228575h;
                }
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.WalletLqtPlanAddUI", e, "", new Object[0]);
            }
        }
        this.f208009P = new String[28];
        int i = 0;
        while (i < 28) {
            int i2 = i + 1;
            this.f208009P[i] = getString(C0966R.string.kxt, new Object[]{String.valueOf(i2)});
            i = i2;
        }
        initView();
        mo98937S7();
        mo98930L7(true);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f208036w.isShown() || !Util.isNullOrNil(this.f208025j.getText())) {
            return super.onKeyUp(i, keyEvent);
        }
        hideWcKb();
        return true;
    }
}
