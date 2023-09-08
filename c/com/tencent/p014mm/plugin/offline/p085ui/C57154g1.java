package com.tencent.p014mm.plugin.offline.p085ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletCheckPwdNewUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import cr3.C75283h;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import id2.C46215a;
import id2.C76309n;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nr3.C89059e;
import o40.C61926c;
import ob0.C117747y;
import ob0.C89132b;
import org.json.JSONObject;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49803i53;
import te3.C64651q80;

/* renamed from: com.tencent.mm.plugin.offline.ui.g1 */
public final class C57154g1 extends UIComponent implements MStorageEx.IOnStorageChange {

    /* renamed from: d */
    public C64651q80 f163791d;

    /* renamed from: e */
    public final C13601g f163792e = C36568h.m40985a(new C57156c(this));

    /* renamed from: f */
    public final C13601g f163793f = C36568h.m40985a(new C57158e(this));

    /* renamed from: g */
    public final C13601g f163794g = C36568h.m40985a(new C57155b(this));

    /* renamed from: com.tencent.mm.plugin.offline.ui.g1$b */
    public static final class C57155b extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C57154g1 f163795d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57155b(C57154g1 g1Var) {
            super(0);
            this.f163795d = g1Var;
        }

        public Object invoke() {
            return (ViewGroup) this.f163795d.findViewById(C0966R.C0970id.lhl);
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.g1$c */
    public static final class C57156c extends C87413o implements C32224a<OfflineAlertView> {

        /* renamed from: d */
        public final /* synthetic */ C57154g1 f163796d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57156c(C57154g1 g1Var) {
            super(0);
            this.f163796d = g1Var;
        }

        public Object invoke() {
            return (OfflineAlertView) this.f163796d.findViewById(C0966R.C0970id.hl7);
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.g1$d */
    public static final class C57157d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C57154g1 f163797d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57157d(C57154g1 g1Var) {
            super(0);
            this.f163797d = g1Var;
        }

        public Object invoke() {
            this.f163797d.mo80731d3();
            this.f163797d.mo80732e3();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.g1$e */
    public static final class C57158e extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C57154g1 f163798d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57158e(C57154g1 g1Var) {
            super(0);
            this.f163798d = g1Var;
        }

        public Object invoke() {
            return (ViewGroup) this.f163798d.findViewById(C0966R.C0970id.ljd);
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.g1$f */
    public static final class C57159f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C57154g1 f163799d;

        public C57159f(C57154g1 g1Var) {
            this.f163799d = g1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/offline/ui/WalletOfflineEnableUIC$showEnableTokenAlert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C57154g1 g1Var = this.f163799d;
            g1Var.getClass();
            Log.m105924i("MicroMsg.WalletOfflineEnableUIC", "goto pwd ui");
            Intent intent = new Intent(g1Var.getActivity(), WalletCheckPwdNewUI.class);
            intent.putExtra(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
            g1Var.getActivity().startActivityForResult(intent, 256);
            C117292a.m165361g(this, "com/tencent/mm/plugin/offline/ui/WalletOfflineEnableUIC$showEnableTokenAlert$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.offline.ui.g1$a */
    public static final class C57160a implements WalletCheckPwdNewUI.C72258c {

        /* renamed from: a */
        public final WalletCheckPwdNewUI f163800a;

        /* renamed from: com.tencent.mm.plugin.offline.ui.g1$a$a */
        public static final class C57161a extends C87413o implements C32226l {

            /* renamed from: d */
            public final /* synthetic */ C57160a f163801d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57161a(C57160a aVar) {
                super(1);
                this.f163801d = aVar;
            }

            public Object invoke(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                this.f163801d.f163800a.hideLoading();
                if (cVar == null) {
                    return null;
                }
                Log.m105924i("MicroMsg.WalletOfflineEnableUIC", "enable token response: " + cVar.f256793a + ", " + cVar.f256794b + ", " + ((C49803i53) cVar.f256796d).f135118d);
                if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    C49803i53 i532 = (C49803i53) cVar.f256796d;
                    int i = i532.f135118d;
                    if (i == 0) {
                        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, "");
                        this.f163801d.f163800a.setResult(-1);
                        this.f163801d.f163800a.finish();
                        return null;
                    } else if (C75283h.m90311a(this.f163801d.f163800a, cVar.f256797e, 1000, i, i532.f135119e) || Util.isNullOrNil(((C49803i53) cVar.f256796d).f135119e)) {
                        return null;
                    } else {
                        C57160a aVar = this.f163801d;
                        C76879j.m92749t(aVar.f163800a, ((C49803i53) cVar.f256796d).f135119e, "", new C70001e1(aVar));
                        return null;
                    }
                } else {
                    WalletCheckPwdNewUI walletCheckPwdNewUI = this.f163801d.f163800a;
                    C76879j.m92754y(walletCheckPwdNewUI, walletCheckPwdNewUI.getString(C0966R.string.kzk), "", this.f163801d.f163800a.getString(C0966R.string.f8029zr), new C70004f1(this.f163801d));
                    this.f163801d.f163800a.f210014g.mo105043a();
                    return null;
                }
            }
        }

        public C57160a(WalletCheckPwdNewUI walletCheckPwdNewUI) {
            C87412m.m108594g(walletCheckPwdNewUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            this.f163800a = walletCheckPwdNewUI;
        }

        /* renamed from: a */
        public boolean mo80734a() {
            return false;
        }

        /* renamed from: b */
        public void mo80735b(String str) {
            if (!Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.WalletOfflineEnableUIC", "do offline enable token cgi");
                this.f163800a.showLoading();
                C87412m.m108591d(str);
                C89059e i = new C46215a(str).mo9225i();
                C87412m.m108593f(i, "CgiOfflineEnableToken(pwd!!).run()");
                C61926c.m72665J(i, new C57161a(this)).mo11397F(this.f163800a);
            }
        }

        public void onCreate() {
        }

        public void onDestroy() {
        }

        public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57154g1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final OfflineAlertView mo80730c3() {
        Object value = ((C36570n) this.f163792e).getValue();
        C87412m.m108593f(value, "<get-offlineAlertView>(...)");
        return (OfflineAlertView) value;
    }

    /* renamed from: d3 */
    public final void mo80731d3() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC, (Object) null);
        if (!(str == null || str.length() == 0)) {
            try {
                this.f163791d = C76309n.m91733k1(new JSONObject(str));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WalletOfflineEnableUIC", e, "", new Object[0]);
            }
        } else {
            this.f163791d = null;
        }
    }

    /* renamed from: e3 */
    public final void mo80732e3() {
        C64651q80 q802 = this.f163791d;
        if (q802 != null) {
            if (!(q802 != null && q802.f184980d == 0)) {
                if (mo80730c3().mo96281d(9)) {
                    if (mo80730c3().f201797d == 9) {
                        mo80730c3().mo96278a();
                    }
                    Object value = ((C36570n) this.f163794g).getValue();
                    C87412m.m108593f(value, "<get-menuLayout>(...)");
                    ((ViewGroup) value).setVisibility(4);
                    OfflineAlertView c3 = mo80730c3();
                    Object value2 = ((C36570n) this.f163793f).getValue();
                    C87412m.m108593f(value2, "<get-qrcodeView>(...)");
                    ViewGroup viewGroup = (ViewGroup) value2;
                    C64651q80 q803 = this.f163791d;
                    C57159f fVar = new C57159f(this);
                    Log.m105924i("MicroMsg.OfflineAlertView", "showEnableTokenAlert");
                    c3.f201797d = 9;
                    c3.f201800g = false;
                    c3.setVisibility(0);
                    c3.f201799f.removeAllViews();
                    View inflate = LayoutInflater.from(c3.getContext()).inflate(C0966R.C0971layout.cfn, c3.f201799f, false);
                    c3.f201799f.addView(inflate);
                    View findViewById = inflate.findViewById(C0966R.C0970id.hme);
                    if (findViewById != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view = findViewById;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/offline/ui/OfflineAlertView", "showEnableTokenAlert", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/EnableCodePage;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/offline/ui/OfflineAlertView", "showEnableTokenAlert", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/EnableCodePage;Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.f5782oh);
                    Button button = (Button) inflate.findViewById(C0966R.C0970id.f358422f12);
                    ((WeImageView) inflate.findViewById(C0966R.C0970id.f2p)).setImageResource(C0966R.raw.pay_safe);
                    if (!Util.isNullOrNil(q803.f184982f)) {
                        textView.setText(q803.f184982f);
                    }
                    if (!Util.isNullOrNil(q803.f184983g)) {
                        button.setText(q803.f184983g);
                    }
                    ((ViewGroup) inflate.findViewById(C0966R.C0970id.j0f)).setVisibility(8);
                    button.setOnClickListener(new C57163k(c3, fVar));
                    viewGroup.post(new OfflineAlertView$$a(c3, viewGroup, inflate));
                    return;
                }
                return;
            }
        }
        if (mo80730c3().f201797d == 9) {
            mo80730c3().mo96278a();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.WalletOfflineEnableUIC", "onActivityResult: " + i + ", " + i2);
        if (i == 256 && i2 == -1) {
            C76309n nVar = new C76309n("" + ((int) (System.currentTimeMillis() / ((long) 1000))), 0, 0);
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI");
            ((WalletOfflineCoinPurseUI) activity).doSceneProgress(nVar, false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo80731d3();
        mo80732e3();
        C86709a0.m107535s().mo121142i().add(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107535s().mo121142i().remove(this);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (C87412m.m108589b(mStorageEx, C86709a0.m107535s().mo121142i())) {
            Log.m105918d("MicroMsg.WalletOfflineEnableUIC", "on configstg change: " + i + ", " + obj);
            if (obj == C72994y1.C72995a.USERINFO_WALLET_OFFLINE_ENABLECODEPAGE_STRING_SYNC) {
                Log.m105924i("MicroMsg.WalletOfflineEnableUIC", "update enableCodePage changed");
                C61926c.m72668M(new C57157d(this));
            }
        }
    }
}
