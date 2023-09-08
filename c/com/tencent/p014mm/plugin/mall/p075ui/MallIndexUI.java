package com.tencent.p014mm.plugin.mall.p075ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import b63.C113146l;
import b63.C67199q0;
import b73.C28273c;
import b73.C67213b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OpenECardFinishEvent;
import com.tencent.p014mm.autogen.events.RequestEnterWalletEvent;
import com.tencent.p014mm.autogen.events.SyncOfflineTokenEvent;
import com.tencent.p014mm.autogen.events.WalletGetBulletinEvent;
import com.tencent.p014mm.autogen.events.WalletGetUserInfoEvent;
import com.tencent.p014mm.autogen.events.WalletRealNameResultNotifyEvent;
import com.tencent.p014mm.autogen.events.WxPayGdprResultEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.newtips.model.C115619a;
import com.tencent.p014mm.plugin.newtips.model.C115627l;
import com.tencent.p014mm.plugin.newtips.model.C115631n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72428s1;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WcPayMoneyLoadingView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.model.C75121j;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86737h0;
import h81.C32735h;
import j20.C117292a;
import java.math.RoundingMode;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import l31.C61212e;
import nc0.C76850a;
import o31.C11345b;
import o31.C76986a;
import ob0.C117747y;
import org.json.JSONObject;
import p281yz.C79173v;
import p626nv.C109759g;
import p626nv.C76963d;
import s52.C36626n;
import s52.C77619d;
import s52.C77620f;
import te3.tg4;
import ub3.C78144b;
import v53.C78342e0;
import x53.C78770a;

@C86737h0
/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI */
public class MallIndexUI extends MallIndexBaseUI implements MStorageEx.IOnStorageChange {

    /* renamed from: A */
    public TextView f201245A = null;

    /* renamed from: B */
    public boolean f201246B = false;

    /* renamed from: C */
    public Dialog f201247C;

    /* renamed from: D */
    public C69753j f201248D = null;

    /* renamed from: E */
    public C69755k f201249E = null;

    /* renamed from: F */
    public WcPayMoneyLoadingView f201250F;

    /* renamed from: G */
    public ProgressBar f201251G;

    /* renamed from: H */
    public IListener<OpenECardFinishEvent> f201252H;

    /* renamed from: I */
    public boolean f201253I;

    /* renamed from: J */
    public IListener f201254J;

    /* renamed from: K */
    public IListener<WxPayGdprResultEvent> f201255K;

    /* renamed from: L */
    public boolean f201256L;

    /* renamed from: v */
    public boolean f201257v = false;

    /* renamed from: w */
    public WalletGetUserInfoEvent.C67825b f201258w;

    /* renamed from: x */
    public C72428s1 f201259x = new C72428s1();

    /* renamed from: y */
    public View f201260y = null;

    /* renamed from: z */
    public boolean f201261z = false;

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$a */
    public class C4880a implements MenuItem.OnMenuItemClickListener {
        public C4880a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(14872, 0, 0, "", "", 0);
            nVar.mo160131h(16500, 3);
            MallIndexUI mallIndexUI = MallIndexUI.this;
            boolean z = mallIndexUI.f201258w.f194065k;
            mallIndexUI.getClass();
            Intent intent = new Intent();
            intent.putExtra("key_default_show_currency", z);
            C88144b.m109795m(mallIndexUI, "wallet", ".pwd.ui.WalletPasswordSettingUI", intent, 6);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$f */
    public class C4881f implements View.OnClickListener {
        public C4881f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mall/ui/MallIndexUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicorMsg.MallIndexUI", "click settings btn");
            C88144b.m109789g(MallIndexUI.this.getContext(), "mall", ".ui.MallFunctionSettingsUI");
            C117292a.m165361g(this, "com/tencent/mm/plugin/mall/ui/MallIndexUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$g */
    public class C4882g implements Runnable {
        public C4882g() {
        }

        public void run() {
            int j = C76577a.m92159j(MallIndexUI.this.getContext());
            int b = C76577a.m92151b(MallIndexUI.this.getContext(), 53);
            int[] iArr = new int[2];
            MallIndexUI.this.f201166d.getLocationInWindow(iArr);
            int bottom = (MallIndexUI.this.f201178s.getBottom() + iArr[1]) - j;
            int height = (MallIndexUI.this.f201166d.getHeight() - MallIndexUI.this.f201178s.getHeight()) + iArr[1];
            if (bottom > 0) {
                height += bottom;
            }
            int i = (j - height) - b;
            int b2 = C76577a.m92151b(MallIndexUI.this.getContext(), 33);
            Log.m105919d("MicorMsg.MallIndexUI", "winHeight: %d, height: %d, footerHeight: %s, Y: %d, scrollDiff: %d, diff: %d", Integer.valueOf(j), Integer.valueOf(height), Integer.valueOf(MallIndexUI.this.f201178s.getHeight()), Integer.valueOf(iArr[1]), Integer.valueOf(bottom), Integer.valueOf(i));
            if (i > b2) {
                MallIndexUI.this.f201178s.setPadding(0, i, 0, b2);
            } else {
                MallIndexUI.this.f201178s.setPadding(0, b2, 0, b2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$b */
    public class C69747b implements C75121j {
        public C69747b(MallIndexUI mallIndexUI) {
        }

        /* renamed from: a */
        public void mo95711a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$c */
    public class C69748c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77619d f201263d;

        public C69748c(C77619d dVar) {
            this.f201263d = dVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mall/ui/MallIndexUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            new Intent();
            C75228t.m90222O(MallIndexUI.this, this.f201263d.f226283a);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mall/ui/MallIndexUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$d */
    public class C69749d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C77619d f201265d;

        public C69749d(C77619d dVar) {
            this.f201265d = dVar;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/mall/ui/MallIndexUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C75228t.m90219L(MallIndexUI.this.getContext(), this.f201265d.f226283a, true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/mall/ui/MallIndexUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$e */
    public class C69750e implements C72428s1.C72430b {
        public C69750e() {
        }

        public Context getContext() {
            return MallIndexUI.this;
        }

        public int getShowAgreenRequestCode() {
            return 3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$h */
    public class C69751h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WalletGetBulletinEvent f201268d;

        public C69751h(WalletGetBulletinEvent walletGetBulletinEvent) {
            this.f201268d = walletGetBulletinEvent;
        }

        public void run() {
            if (!Util.isNullOrNil(this.f201268d.f79043e.f79046a)) {
                TextView textView = MallIndexUI.this.f201169g;
                WalletGetBulletinEvent.C28848b bVar = this.f201268d.f79043e;
                C75228t.m90247g0((View) null, textView, bVar.f79046a, bVar.f79047b, bVar.f79048c);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$i */
    public abstract class C69752i implements C115619a {

        /* renamed from: d */
        public Context f201270d;

        /* renamed from: e */
        public ImageView f201271e;

        /* renamed from: f */
        public TextView f201272f;

        public C69752i(MallIndexUI mallIndexUI, Context context, View view) {
            this.f201270d = context;
            mo95978a(view);
        }

        /* renamed from: a */
        public abstract void mo95978a(View view);

        /* renamed from: f */
        public boolean mo25956f(boolean z) {
            if (z) {
                this.f201271e.setVisibility(0);
                return true;
            }
            this.f201271e.setVisibility(8);
            return true;
        }

        /* renamed from: g */
        public boolean mo25958g(boolean z, tg4 tg4) {
            if (z) {
                this.f201272f.setVisibility(0);
                String str = tg4.f354435d + "";
                if (tg4.f354435d > 99) {
                    str = this.f201270d.getString(C0966R.string.jsy);
                }
                this.f201272f.setText(str);
                return true;
            }
            this.f201272f.setVisibility(8);
            return true;
        }

        /* renamed from: h */
        public boolean mo25960h(boolean z) {
            if (z) {
                this.f201272f.setVisibility(0);
                this.f201272f.setText(this.f201270d.getString(C0966R.string.f360088a12));
                return true;
            }
            this.f201272f.setVisibility(8);
            return true;
        }

        /* renamed from: i */
        public boolean mo25962i(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: j */
        public boolean mo64135j(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: k */
        public void mo64136k(C115631n nVar, boolean z) {
            ((C76963d) C86312j.m106911c(C76963d.class)).mo107037m2(this, nVar, z);
        }

        /* renamed from: l */
        public boolean mo64137l() {
            return false;
        }

        /* renamed from: m */
        public boolean mo64138m(boolean z) {
            return ((C76963d) C86312j.m106911c(C76963d.class)).mo107036I0(z, this);
        }

        /* renamed from: n */
        public boolean mo64139n(boolean z, tg4 tg4) {
            return false;
        }

        /* renamed from: o */
        public void mo64140o(boolean z, C115631n nVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$j */
    public class C69753j extends C69752i {

        /* renamed from: g */
        public LinearLayout f201273g;

        /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$j$a */
        public class C69754a implements View.OnClickListener {
            public C69754a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/mall/ui/MallIndexUI$PosView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(5);
                Intent intent = new Intent();
                intent.putExtra("key_from_scene", 1);
                C88144b.m109791i(MallIndexUI.this.getContext(), "offline", ".ui.WalletOfflineEntranceUI", intent, (Bundle) null);
                C75136r0.m90122d(9, 0);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(11850, 5, 0);
                nVar.mo160131h(14419, MallIndexUI.this.f201170h, 1);
                C117292a.m165361g(this, "com/tencent/mm/plugin/mall/ui/MallIndexUI$PosView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C69753j(Context context, View view) {
            super(MallIndexUI.this, context, view);
        }

        /* renamed from: a */
        public void mo95978a(View view) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gtv);
            this.f201273g = linearLayout;
            this.f201271e = (ImageView) linearLayout.findViewById(C0966R.C0970id.gtw);
            this.f201272f = (TextView) this.f201273g.findViewById(C0966R.C0970id.gtx);
            this.f201273g.setOnClickListener(new C69754a());
        }

        /* renamed from: e */
        public View mo64133e() {
            return this.f201273g;
        }

        public String getPath() {
            return "pay_receiveorpay";
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$k */
    public class C69755k extends C69752i {

        /* renamed from: g */
        public LinearLayout f201276g;

        /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUI$k$a */
        public class C69756a implements View.OnClickListener {
            public C69756a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/mall/ui/MallIndexUI$WalletView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                MallIndexUI.m82140Y7(MallIndexUI.this);
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(15);
                C117292a.m165361g(this, "com/tencent/mm/plugin/mall/ui/MallIndexUI$WalletView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C69755k(Context context, View view) {
            super(MallIndexUI.this, context, view);
        }

        /* renamed from: a */
        public void mo95978a(View view) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gtz);
            this.f201276g = linearLayout;
            MallIndexUI.this.f201168f = (TextView) linearLayout.findViewById(C0966R.C0970id.lfm);
            MallIndexUI.this.f201250F = (WcPayMoneyLoadingView) this.f201276g.findViewById(C0966R.C0970id.lfn);
            MallIndexUI.this.f201251G = (ProgressBar) this.f201276g.findViewById(C0966R.C0970id.lhb);
            MallIndexUI.this.getLifecycle().addObserver(MallIndexUI.this.f201250F);
            MallIndexUI mallIndexUI = MallIndexUI.this;
            mallIndexUI.f201250F.setLoadingPb(mallIndexUI.f201251G);
            MallIndexUI.this.f201250F.setPrefixSymbol("¥");
            MallIndexUI.this.f201250F.setTextColor(-1);
            MallIndexUI mallIndexUI2 = MallIndexUI.this;
            mallIndexUI2.f201250F.setTextSize((float) C76577a.m92151b(mallIndexUI2.getContext(), 15));
            this.f201271e = (ImageView) this.f201276g.findViewById(C0966R.C0970id.f358745gu0);
            this.f201272f = (TextView) this.f201276g.findViewById(C0966R.C0970id.f358747gu2);
            this.f201276g.setOnClickListener(new C69756a());
        }

        /* renamed from: e */
        public View mo64133e() {
            return this.f201276g;
        }

        public String getPath() {
            return "wallet";
        }
    }

    public MallIndexUI() {
        C40008f fVar = C40008f.f107254d;
        this.f201252H = new IListener<OpenECardFinishEvent>(this, fVar) {
            {
                this.__eventId = 1883130380;
            }

            public boolean callback(IEvent iEvent) {
                OpenECardFinishEvent openECardFinishEvent = (OpenECardFinishEvent) iEvent;
                Log.m105924i("MicorMsg.MallIndexUI", "open ecard finish");
                ECardInfo.m5536b((JSONObject) null);
                return false;
            }
        };
        this.f201253I = false;
        this.f201254J = new IListener<WalletRealNameResultNotifyEvent>(fVar) {
            {
                this.__eventId = 323604482;
            }

            public boolean callback(IEvent iEvent) {
                WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent = (WalletRealNameResultNotifyEvent) iEvent;
                Log.m105925i("MicorMsg.MallIndexUI", "real name verify callback, result: %s, isDoRealNameForBalance: %s", Integer.valueOf(walletRealNameResultNotifyEvent.f9603d.f9604a), Boolean.valueOf(MallIndexUI.this.f201253I));
                if (walletRealNameResultNotifyEvent.f9603d.f9604a == -1) {
                    MallIndexUI mallIndexUI = MallIndexUI.this;
                    if (mallIndexUI.f201253I) {
                        mallIndexUI.f201253I = false;
                        MallIndexUI.m82140Y7(mallIndexUI);
                    }
                }
                return false;
            }
        };
        this.f201255K = new IListener<WxPayGdprResultEvent>(this, fVar) {
            {
                this.__eventId = -553207673;
            }

            public boolean callback(IEvent iEvent) {
                String str = ((WxPayGdprResultEvent) iEvent).f9615d.f9616a;
                Log.m105925i("MicorMsg.MallIndexUI", "get result %s", str);
                if ("agree_privacy".equals(str)) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, Boolean.TRUE);
                }
                return false;
            }
        };
        this.f201256L = false;
    }

    /* renamed from: Y7 */
    public static void m82140Y7(MallIndexUI mallIndexUI) {
        mallIndexUI.getClass();
        if (C75592q0.m90763K()) {
            Intent intent = new Intent();
            intent.putExtra("key_scene_balance_manager", 2);
            C88144b.m109791i(mallIndexUI, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", intent, (Bundle) null);
        } else {
            Intent intent2 = new Intent(mallIndexUI.getContext(), MallWalletUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent2);
            C117292a.m165358d(mallIndexUI, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallIndexUI", "handleClickBalanceEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mallIndexUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mallIndexUI, "com/tencent/mm/plugin/mall/ui/MallIndexUI", "handleClickBalanceEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ((ImageView) mallIndexUI.findViewById(C0966R.C0970id.f358745gu0)).setVisibility(8);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_BOOLEAN_SYNC, Boolean.FALSE);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC, 0L);
            C115669n.INSTANCE.mo160131h(16500, 2);
        }
        C75228t.m90243e0(11, 1);
        C115669n.INSTANCE.mo160131h(14419, mallIndexUI.f201170h, 2);
    }

    /* renamed from: H7 */
    public void mo95931H7() {
        removeAllOptionMenu();
        Log.m105924i("MicorMsg.MallIndexUI", "addIconOptionMenuByMode");
        addIconOptionMenu(0, 0, (int) C0966R.raw.icons_outlined_more, false, (MenuItem.OnMenuItemClickListener) new C4880a());
        C115669n.INSTANCE.mo160131h(14872, 0, 0, "", "", 1);
    }

    /* renamed from: I7 */
    public void mo95932I7() {
        int color = getResources().getColor(C0966R.color.a3o);
        setActionbarColor(color);
        hideActionbarLine();
        findViewById(C0966R.C0970id.iwk).setBackgroundColor(color);
    }

    /* renamed from: M7 */
    public void mo95936M7() {
        this.f201176q = C36626n.vx0().xx0(this.f201175p).field_isShowSetting;
        if (this.f201178s == null) {
            View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.ba_, (ViewGroup) null);
            this.f201178s = inflate;
            this.f201166d.addFooterView(inflate, (Object) null, false);
            TextView textView = (TextView) this.f201178s.findViewById(C0966R.C0970id.gu8);
            C75228t.m90252j(textView, 100);
            textView.setOnClickListener(new C4881f());
        }
        Log.m105925i("MicorMsg.MallIndexUI", "is show setting: %s", Integer.valueOf(this.f201176q));
        if (this.f201176q == 0) {
            View view = this.f201178s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f201178s.setPadding(0, 0, 0, 0);
            return;
        }
        View view2 = this.f201178s;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/mall/ui/MallIndexUI", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getWindow().getDecorView().post(new C4882g());
    }

    /* renamed from: N7 */
    public boolean mo95937N7() {
        Log.m105924i("MicorMsg.MallIndexUI", "init BankcardList");
        WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
        WalletGetUserInfoEvent.C67824a aVar = walletGetUserInfoEvent.f194038d;
        aVar.f194040a = 1;
        aVar.f194041b = true;
        aVar.f194043d = 0;
        aVar.f194042c = true;
        walletGetUserInfoEvent.f194039e.f194055a = new C69795r(this, walletGetUserInfoEvent);
        walletGetUserInfoEvent.asyncPublish(Looper.myLooper());
        return false;
    }

    /* renamed from: O7 */
    public void mo95938O7(View view) {
        Class cls = C109759g.class;
        this.f201248D = new C69753j(this, view);
        ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175770k(this.f201248D);
        C69755k kVar = new C69755k(this, view);
        this.f201249E = kVar;
        C86709a0.m107528h();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_BOOLEAN_SYNC;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) i.mo119685f(aVar, bool)).booleanValue();
        C86709a0.m107528h();
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar2 = C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC;
        long longValue = ((Long) i2.mo119685f(aVar2, 0L)).longValue();
        if (booleanValue && longValue > 0 && System.currentTimeMillis() >= longValue) {
            Log.m105924i("MicorMsg.MallIndexUI", "hasRedDot expire, ignore reddot");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, bool);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, 0L);
            booleanValue = false;
        }
        if (booleanValue) {
            kVar.f201271e.setVisibility(0);
        } else {
            kVar.f201271e.setVisibility(8);
        }
        kVar.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT, booleanValue);
        ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175770k(this.f201249E);
    }

    /* renamed from: P7 */
    public void mo95939P7() {
        View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.ba8, (ViewGroup) null);
        this.f201177r = inflate;
        this.f201166d.addHeaderView(inflate, (Object) null, false);
        LinearLayout linearLayout = (LinearLayout) this.f201177r.findViewById(C0966R.C0970id.euj);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams.height = C69770b.f201325f;
        linearLayout.setLayoutParams(layoutParams);
    }

    /* renamed from: R7 */
    public void mo95941R7() {
        SyncOfflineTokenEvent syncOfflineTokenEvent = new SyncOfflineTokenEvent();
        syncOfflineTokenEvent.f79021d.f79022a = false;
        syncOfflineTokenEvent.publish();
    }

    /* renamed from: S7 */
    public void mo95942S7() {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_more_tab_new_name_cn_config, false);
        Log.m105925i("MicorMsg.MallIndexUI", " cn wallet open new name ：%s", Boolean.valueOf(wf));
        if (wf) {
            setMMTitle((int) C0966R.string.lr8);
        } else {
            setMMTitle((int) C0966R.string.gn6);
        }
    }

    /* renamed from: T7 */
    public void mo95943T7() {
        Class cls = C79173v.class;
        ((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo();
        boolean z = true;
        if (!(((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_is_reg == -1)) {
            if (((C79173v) C86312j.m106911c(cls)).Dx0().mo105873jo().field_is_reg != 0) {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        if (C75592q0.m90763K()) {
            Log.m105920e("MicorMsg.MallIndexUI", "hy: user not open wallet or status unknown. try query");
            doSceneForceProgress(new C78770a("", false));
        }
    }

    /* renamed from: U7 */
    public void mo95944U7() {
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = "1";
        walletGetBulletinEvent.callback = new C69751h(walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
    }

    /* renamed from: V7 */
    public void mo95945V7() {
    }

    /* renamed from: W7 */
    public void mo95946W7() {
        Log.m105924i("MicorMsg.MallIndexUI", "updateBalanceNum");
        C67199q0 q0Var = new C67199q0();
        if (q0Var.mo91301a()) {
            this.f201168f.setText((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_RELEAY_NAME_BALANCE_CONTENT_STRING_SYNC, getString(C0966R.string.hsh)));
            this.f201168f.setVisibility(0);
            this.f201250F.setVisibility(8);
            this.f201251G.setVisibility(8);
        } else if (q0Var.mo91304d()) {
            Log.m105924i("MicorMsg.MallIndexUI", "show balance amount");
            long longValue = ((Long) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
            if (this.f201250F != null) {
                if (q0Var.mo91303c()) {
                    this.f201168f.setText(getString(C0966R.string.ktx));
                    this.f201168f.setVisibility(0);
                    this.f201250F.setVisibility(8);
                    this.f201251G.setVisibility(8);
                    this.f201250F.mo99855d();
                } else {
                    this.f201168f.setVisibility(8);
                    this.f201250F.setVisibility(0);
                    this.f201251G.setVisibility(0);
                }
                if (this.f201250F.getVisibility() == 0) {
                    WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f201250F;
                    wcPayMoneyLoadingView.setMoney(C75228t.m90260n(C75228t.m90248h("" + longValue, "100", 2, RoundingMode.HALF_UP).doubleValue()));
                    return;
                }
                return;
            }
            Log.m105928w("MicorMsg.MallIndexUI", "moneyLoadingView is null");
        }
    }

    /* renamed from: Z7 */
    public final void mo95974Z7(C77619d dVar) {
        if (dVar != null && !Util.isNullOrNil(dVar.f226283a)) {
            if (this.f201261z) {
                TextView textView = this.f201245A;
                if (textView != null) {
                    textView.setText(C0966R.string.f361012gn1);
                    this.f201245A.setOnClickListener(new C69748c(dVar));
                    return;
                }
                return;
            }
            View inflate = View.inflate(this, C0966R.C0971layout.ba7, (ViewGroup) null);
            this.f201260y = inflate;
            inflate.setClickable(false);
            this.f201260y.setEnabled(false);
            TextView textView2 = (TextView) this.f201260y.findViewById(C0966R.C0970id.lje);
            this.f201245A = textView2;
            textView2.setVisibility(0);
            this.f201245A.setText(C0966R.string.f361012gn1);
            this.f201245A.setTextColor(getResources().getColor(C0966R.color.a1d));
            this.f201245A.setOnClickListener(new C69749d(dVar));
            ListView listView = this.f201166d;
            if (listView != null) {
                listView.addFooterView(this.f201260y);
                this.f201261z = true;
            }
        }
    }

    public void finish() {
        this.f201257v = true;
        super.finish();
    }

    public void initView() {
        super.initView();
        ListView listView = this.f201166d;
        int i = C69770b.f201320a;
        listView.setPadding(i, 0, i, 0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicorMsg.MallIndexUI", "onActivityResult %s %s %s", Integer.valueOf(i), Integer.valueOf(i2), intent);
        super.onActivityResult(i, i2, intent);
        if (i == 3) {
            if (i2 == -1) {
                this.f201259x.mo99789a(intent);
                return;
            }
            C72428s1.C72429a aVar = this.f201259x.f210687g;
            if (aVar != null) {
                aVar.cancel();
            }
        } else if (i == 5) {
            C86709a0.m107528h();
            if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                finish();
            }
        } else if (i == 6 && intent != null && intent.getIntExtra("is_switch_wallet", 0) == 1) {
            finish();
            RequestEnterWalletEvent requestEnterWalletEvent = new RequestEnterWalletEvent();
            requestEnterWalletEvent.f9428d.f9429a = getContext();
            requestEnterWalletEvent.publish();
        }
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        if (26 != Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().add(this);
        ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91354h(this, (C67213b.C67214b) null);
        C113146l.m154807e(2);
        WalletGetUserInfoEvent.C67825b bVar = new WalletGetUserInfoEvent.C67825b();
        this.f201258w = bVar;
        bVar.f194056b = false;
        bVar.f194057c = true;
        bVar.f194058d = false;
        this.f201252H.alive();
        this.f201255K.alive();
        this.f201259x.f210686f = new C69750e();
        C69803z.f201412a = true;
        C69770b.m82207b(this, false, true);
        super.onCreate(bundle);
        this.f201254J.alive();
        addSceneEndListener(2713);
        addSceneEndListener(385);
        if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            C86709a0.m107528h();
            mo95974Z7(new C77619d((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MALL_INDEX_GDPR_CACHE_STRING_SYNC, "")));
            C86709a0.m107528h();
            ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue();
            doSceneProgress(new C77620f(), false);
        }
        C115669n.INSTANCE.mo160131h(16500, 1);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.MallIndexUI).mo86179qs(this, C76986a.WxPay);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f201259x.getClass();
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().remove(this);
        this.f201252H.dead();
        this.f201255K.dead();
        removeSceneEndListener(2713);
        removeSceneEndListener(385);
        this.f201254J.dead();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (mStorageEx == ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI() && i == 4) {
            Log.m105925i("MicorMsg.MallIndexUI", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG")) {
                mo95946W7();
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.f201259x.mo99790b();
        WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f201250F;
        if (wcPayMoneyLoadingView != null) {
            wcPayMoneyLoadingView.mo99855d();
        }
    }

    public void onResume() {
        Log.m105926v("MicorMsg.MallIndexUI", "alvinluo MallIndexUI onResume");
        this.f201259x.mo99791c();
        C67213b Jf = ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf();
        Jf.mo91357j(this, Jf.mo91358k(), (C67213b.C67215a) null);
        super.onResume();
        mo95946W7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        super.onSceneEnd(i, i2, str, yVar);
        if (yVar instanceof C77620f) {
            mo95974Z7(((C77620f) yVar).f226284d);
        } else if (yVar instanceof C78342e0) {
            C78342e0 e0Var = (C78342e0) yVar;
            if (e0Var.isJumpRemind()) {
                e0Var.getJumpRemind().mo104782f(this, new C69747b(this));
            }
        }
        return true;
    }
}
