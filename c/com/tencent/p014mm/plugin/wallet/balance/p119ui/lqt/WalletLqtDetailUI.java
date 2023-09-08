package com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C104428a;
import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OfflineUpdateCardListEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.events.WCPayLqtDetailUIShowDialogEvent;
import com.tencent.p014mm.autogen.events.WCPayUpdateSaveFetchUIEvent;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.jsapi.advertise.JsApiOpenAdCanvas;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43287e0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C43290f0;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71648n1;
import com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71649o1;
import com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.C43337b;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C5792e0;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WcPayMoneyLoadingView;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75227s;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import hp3.C87581a;
import ie3.C76324c;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lp3.C88631d;
import lp3.C88633e;
import lp3.C88643g;
import nj3.C76879j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qo3.C101218e0;
import r43.C12945b;
import s24.C77613a;
import sf0.C90188n0;
import te3.C49344ex;
import te3.C50162kp3;
import te3.C51892wy;
import te3.C64483k33;
import te3.C64514l50;
import te3.C64526lm2;
import te3.C64677re0;
import te3.C77977pf3;
import te3.C77997sx2;
import te3.C78008wk;
import te3.C78023zk3;
import ub3.C78144b;
import yb3.C79064a;
import yb3.C79066c;
import yq3.C79144b;

/* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI */
public class WalletLqtDetailUI extends WalletLqtBasePresenterUI {

    /* renamed from: e1 */
    public static final int f207921e1 = C76577a.m92151b(MMApplicationContext.getContext(), 16);

    /* renamed from: A */
    public View f207922A;

    /* renamed from: B */
    public TextView f207923B;

    /* renamed from: C */
    public View f207924C;

    /* renamed from: D */
    public TextView f207925D;

    /* renamed from: E */
    public WeImageView f207926E;

    /* renamed from: F */
    public View f207927F;

    /* renamed from: G */
    public View f207928G;

    /* renamed from: H */
    public CdnImageView f207929H;

    /* renamed from: I */
    public TextView f207930I;

    /* renamed from: J */
    public TextView f207931J;

    /* renamed from: K */
    public LinearLayout f207932K;

    /* renamed from: L */
    public TextView f207933L;

    /* renamed from: M */
    public TextView f207934M;

    /* renamed from: N */
    public TextView f207935N;

    /* renamed from: P */
    public LinearLayout f207936P;

    /* renamed from: Q */
    public TextView f207937Q;

    /* renamed from: Q0 */
    public TextView f207938Q0;

    /* renamed from: R */
    public WcPayMoneyLoadingView f207939R;

    /* renamed from: R0 */
    public ImageView f207940R0;

    /* renamed from: S */
    public ProgressBar f207941S;

    /* renamed from: S0 */
    public WeImageView f207942S0;

    /* renamed from: T */
    public Dialog f207943T;

    /* renamed from: T0 */
    public boolean f207944T0 = false;

    /* renamed from: U */
    public boolean f207945U = true;

    /* renamed from: U0 */
    public boolean f207946U0 = false;

    /* renamed from: V */
    public MMHandler f207947V = new MMHandler(Looper.getMainLooper());

    /* renamed from: V0 */
    public C43337b f207948V0;

    /* renamed from: W */
    public boolean f207949W = false;

    /* renamed from: W0 */
    public LinearLayout f207950W0;

    /* renamed from: X */
    public boolean f207951X = false;

    /* renamed from: X0 */
    public LinearLayout f207952X0;

    /* renamed from: Y */
    public boolean f207953Y = false;

    /* renamed from: Y0 */
    public boolean f207954Y0 = false;

    /* renamed from: Z */
    public boolean f207955Z = false;

    /* renamed from: Z0 */
    public C101218e0 f207956Z0;

    /* renamed from: a1 */
    public C101218e0 f207957a1;

    /* renamed from: b1 */
    public boolean f207958b1 = false;

    /* renamed from: c1 */
    public IListener f207959c1;

    /* renamed from: d1 */
    public IListener f207960d1;

    /* renamed from: e */
    public C43290f0 f207961e = ((C43290f0) this.f207915d.mo136940b(this, C43290f0.class));

    /* renamed from: f */
    public C78023zk3 f207962f;

    /* renamed from: g */
    public ViewGroup f207963g;

    /* renamed from: h */
    public TextView f207964h;

    /* renamed from: i */
    public ViewGroup f207965i;

    /* renamed from: j */
    public TextView f207966j;

    /* renamed from: n */
    public TextView f207967n;

    /* renamed from: o */
    public ViewGroup f207968o;

    /* renamed from: p */
    public TextView f207969p;

    /* renamed from: p0 */
    public LinearLayout f207970p0;

    /* renamed from: q */
    public WalletTextView f207971q;

    /* renamed from: r */
    public Button f207972r;

    /* renamed from: s */
    public Button f207973s;

    /* renamed from: t */
    public LinearLayout f207974t;

    /* renamed from: u */
    public LinearLayout f207975u;

    /* renamed from: v */
    public LinearLayout f207976v;

    /* renamed from: w */
    public TextView f207977w;

    /* renamed from: x */
    public TextView f207978x;

    /* renamed from: x0 */
    public LinearLayout f207979x0;

    /* renamed from: y */
    public LinearLayout f207980y;

    /* renamed from: y0 */
    public CdnImageView f207981y0;

    /* renamed from: z */
    public TextView f207982z;

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$a0 */
    public class C5730a0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f21756d;

        /* renamed from: e */
        public final /* synthetic */ C64483k33 f21757e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup f21758f;

        public C5730a0(JSONObject jSONObject, C64483k33 k332, ViewGroup viewGroup) {
            this.f21756d = jSONObject;
            this.f21757e = k332;
            this.f21758f = viewGroup;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "go to lqt make plan");
            WalletLqtDetailUI.m84197J7(WalletLqtDetailUI.this, this.f21756d, this.f21757e, this.f21758f);
            C115669n.INSTANCE.mo160131h(22449, 2);
            ((C76324c) C86312j.m106911c(C76324c.class)).startLqtFixedDepositMakePlanUseCase(WalletLqtDetailUI.this.getContext(), new Bundle());
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, Boolean.TRUE);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$b */
    public class C5731b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f21760d;

        /* renamed from: e */
        public final /* synthetic */ C64483k33 f21761e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup f21762f;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$b$a */
        public class C5732a implements UseCaseCallback {
            public C5732a() {
            }

            public void call(ITransmitKvData iTransmitKvData) {
                WalletLqtDetailUI.this.mo98916M7(0, true);
            }
        }

        public C5731b(JSONObject jSONObject, C64483k33 k332, ViewGroup viewGroup) {
            this.f21760d = jSONObject;
            this.f21761e = k332;
            this.f21762f = viewGroup;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "go to lqt hhc make plan");
            WalletLqtDetailUI.m84197J7(WalletLqtDetailUI.this, this.f21760d, this.f21761e, this.f21762f);
            ((C76324c) C86312j.m106911c(C76324c.class)).startUseCase("HHCMakePlanUseCase", ITransmitKvData.create(), new C5732a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$b0 */
    public class C5733b0 implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f21765d;

        /* renamed from: e */
        public final /* synthetic */ C64483k33 f21766e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup f21767f;

        public C5733b0(JSONObject jSONObject, C64483k33 k332, ViewGroup viewGroup) {
            this.f21765d = jSONObject;
            this.f21766e = k332;
            this.f21767f = viewGroup;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C115669n.INSTANCE.mo160131h(22449, 2);
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "go to lqt plan list");
            WalletLqtDetailUI.m84197J7(WalletLqtDetailUI.this, this.f21765d, this.f21766e, this.f21767f);
            ((C76324c) C86312j.m106911c(C76324c.class)).startLqtFixedDepositPlanListUseCase(WalletLqtDetailUI.this.getContext(), new Bundle());
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC, Boolean.TRUE);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$c */
    public class C5734c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f21769d;

        /* renamed from: e */
        public final /* synthetic */ C64483k33 f21770e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup f21771f;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$c$a */
        public class C5735a implements UseCaseCallback {
            public C5735a() {
            }

            public void call(ITransmitKvData iTransmitKvData) {
                WalletLqtDetailUI.this.mo98916M7(0, true);
            }
        }

        public C5734c(JSONObject jSONObject, C64483k33 k332, ViewGroup viewGroup) {
            this.f21769d = jSONObject;
            this.f21770e = k332;
            this.f21771f = viewGroup;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "go to lqt hhc plan detail");
            WalletLqtDetailUI.m84197J7(WalletLqtDetailUI.this, this.f21769d, this.f21770e, this.f21771f);
            ((C76324c) C86312j.m106911c(C76324c.class)).startUseCase("HHCPlanDetailUseCase", ITransmitKvData.create(), new C5735a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$d */
    public class C5736d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f21774d;

        /* renamed from: e */
        public final /* synthetic */ C64483k33 f21775e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup f21776f;

        public C5736d(JSONObject jSONObject, C64483k33 k332, ViewGroup viewGroup) {
            this.f21774d = jSONObject;
            this.f21775e = k332;
            this.f21776f = viewGroup;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtDetailUI.m84197J7(WalletLqtDetailUI.this, this.f21774d, this.f21775e, this.f21776f);
            C75228t.m90221N(WalletLqtDetailUI.this, (String) this.f21776f.getTag(), false);
            C115669n.INSTANCE.mo160131h(16807, 2, 2, this.f21775e.f183887f);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$e */
    public class C5737e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f21778d;

        /* renamed from: e */
        public final /* synthetic */ C64483k33 f21779e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup f21780f;

        public C5737e(JSONObject jSONObject, C64483k33 k332, ViewGroup viewGroup) {
            this.f21778d = jSONObject;
            this.f21779e = k332;
            this.f21780f = viewGroup;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtDetailUI.m84197J7(WalletLqtDetailUI.this, this.f21778d, this.f21779e, this.f21780f);
            C64483k33 k332 = this.f21779e;
            C75228t.m90224Q(k332.f183890i, k332.f183887f, 0, 1061);
            C115669n nVar = C115669n.INSTANCE;
            C64483k33 k333 = this.f21779e;
            nVar.mo160131h(16807, 2, 2, k333.f183887f, k333.f183890i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$f */
    public class C5738f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f21782d;

        public C5738f(ViewGroup viewGroup) {
            this.f21782d = viewGroup;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C75228t.m90221N(WalletLqtDetailUI.this, (String) this.f21782d.getTag(), false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$g */
    public class C5739g implements View.OnClickListener {
        public C5739g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtDetailUI.m84196I7(WalletLqtDetailUI.this);
            C115669n.INSTANCE.mo160131h(17084, 3);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$k */
    public class C5740k implements View.OnClickListener {
        public C5740k() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            C77997sx2 sx22 = WalletLqtDetailUI.this.f207962f.f228739v;
            aVar.f9526a = sx22.f228230g;
            aVar.f9527b = Util.nullAs(sx22.f228231h, "");
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9529d = 1061;
            aVar2.f9528c = 0;
            startAppBrandUIFromOuterEvent.publish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$l */
    public class C5741l implements View.OnClickListener {
        public C5741l() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "click top biz");
            C64483k33 k332 = WalletLqtDetailUI.this.f207962f.f228702L;
            int i = k332.f183889h;
            if (i == 2) {
                if (!Util.isNullOrNil(k332.f183887f)) {
                    WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
                    C75228t.m90221N(walletLqtDetailUI, walletLqtDetailUI.f207962f.f228702L.f183887f, false);
                    C115669n.INSTANCE.mo160131h(16807, 1, 2, WalletLqtDetailUI.this.f207962f.f228702L.f183887f);
                }
            } else if (i == 3 && !Util.isNullOrNil(k332.f183890i) && !Util.isNullOrNil(WalletLqtDetailUI.this.f207962f.f228702L.f183887f)) {
                C64483k33 k333 = WalletLqtDetailUI.this.f207962f.f228702L;
                C75228t.m90224Q(k333.f183890i, k333.f183887f, 0, 1061);
                C115669n nVar = C115669n.INSTANCE;
                C64483k33 k334 = WalletLqtDetailUI.this.f207962f.f228702L;
                nVar.mo160131h(16807, 1, 3, k334.f183887f, k334.f183890i);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$t */
    public class C5742t implements View.OnClickListener {
        public C5742t() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "click balance title");
            C115669n.INSTANCE.mo160131h(25138, 1);
            C75228t.m90221N(WalletLqtDetailUI.this.getContext(), WalletLqtDetailUI.this.f207962f.f228718W, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$u */
    public class C5743u implements Runnable {
        public C5743u() {
        }

        public void run() {
            WalletLqtDetailUI.this.f207925D.setWidth(((WalletLqtDetailUI.this.f207924C.getWidth() - (WalletLqtDetailUI.this.f207924C.getPaddingLeft() * 2)) - WalletLqtDetailUI.this.f207926E.getWidth()) - C76577a.m92151b(WalletLqtDetailUI.this.getContext(), 16));
            WalletLqtDetailUI.this.f207925D.setVisibility(0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$v */
    public class C5744v implements View.OnClickListener {
        public C5744v() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$41", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105925i("MicroMsg.WalletLqtDetailUI", "click middle banner with urltype : %d", Integer.valueOf(WalletLqtDetailUI.this.f207962f.f228733p0.f183889h));
            C64483k33 k332 = WalletLqtDetailUI.this.f207962f.f228733p0;
            int i = k332.f183889h;
            if (i == 2) {
                String str = k332.f183887f;
                if (!Util.isNullOrNil(str)) {
                    Log.m105925i("MicroMsg.WalletLqtDetailUI", "open middle banner h5 with url : %s", str);
                    C75228t.m90221N(WalletLqtDetailUI.this, str, false);
                }
            } else if (i == 3) {
                String str2 = k332.f183890i;
                if (!Util.isNullOrNil(str2)) {
                    Log.m105925i("MicroMsg.WalletLqtDetailUI", "open middle banner tinyapp with username : %s", str2);
                    C75228t.m90224Q(str2, WalletLqtDetailUI.this.f207962f.f228733p0.f183887f, 0, 1061);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$41", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$w */
    public class C5745w implements View.OnClickListener {
        public C5745w() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(WalletLqtDetailUI.this.f207962f.f228695E)) {
                WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
                C75228t.m90221N(walletLqtDetailUI, walletLqtDetailUI.f207962f.f228695E, false);
                C115669n.INSTANCE.mo160131h(17084, 1);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$x */
    public class C5746x implements View.OnClickListener {
        public C5746x() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!Util.isNullOrNil(WalletLqtDetailUI.this.f207962f.f228696F)) {
                WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
                C75228t.m90221N(walletLqtDetailUI, walletLqtDetailUI.f207962f.f228696F, false);
                C115669n.INSTANCE.mo160131h(17084, 2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$y */
    public class C5747y implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f21792d;

        /* renamed from: e */
        public final /* synthetic */ C64483k33 f21793e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup f21794f;

        public C5747y(JSONObject jSONObject, C64483k33 k332, ViewGroup viewGroup) {
            this.f21792d = jSONObject;
            this.f21793e = k332;
            this.f21794f = viewGroup;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "go to lqt plan home");
            WalletLqtDetailUI.m84197J7(WalletLqtDetailUI.this, this.f21792d, this.f21793e, this.f21794f);
            Intent intent = new Intent(WalletLqtDetailUI.this.getContext(), WalletLqtPlanBeforeHomeUI.class);
            WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            WalletLqtDetailUI walletLqtDetailUI2 = walletLqtDetailUI;
            C117292a.m165358d(walletLqtDetailUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            walletLqtDetailUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(walletLqtDetailUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C115669n.INSTANCE.mo160131h(16807, 2, 1, "", "", Integer.valueOf(this.f21793e.f183888g));
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$z */
    public class C5748z implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ JSONObject f21796d;

        /* renamed from: e */
        public final /* synthetic */ C64483k33 f21797e;

        /* renamed from: f */
        public final /* synthetic */ ViewGroup f21798f;

        public C5748z(JSONObject jSONObject, C64483k33 k332, ViewGroup viewGroup) {
            this.f21796d = jSONObject;
            this.f21797e = k332;
            this.f21798f = viewGroup;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "go to lqt auto charge home");
            WalletLqtDetailUI.m84197J7(WalletLqtDetailUI.this, this.f21796d, this.f21797e, this.f21798f);
            Intent intent = new Intent(WalletLqtDetailUI.this.getContext(), WalletLqtBalanceAutoTransferUI.class);
            WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            WalletLqtDetailUI walletLqtDetailUI2 = walletLqtDetailUI;
            C117292a.m165358d(walletLqtDetailUI2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            walletLqtDetailUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(walletLqtDetailUI2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$7", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C115669n.INSTANCE.mo160131h(16807, 2, 1, "", "", Integer.valueOf(this.f21797e.f183888g));
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$s */
    public class C43332s implements C87581a<Void, C49344ex> {
        public C43332s() {
        }

        public Object call(Object obj) {
            C49344ex exVar = (C49344ex) obj;
            WalletLqtDetailUI.this.f207947V.postDelayed(new C43340c0(this), 1000);
            OfflineUpdateCardListEvent offlineUpdateCardListEvent = new OfflineUpdateCardListEvent();
            OfflineUpdateCardListEvent.C28784a aVar = offlineUpdateCardListEvent.f78882d;
            aVar.f78883a = 2;
            aVar.f78884b = "LQT";
            offlineUpdateCardListEvent.publish();
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$a */
    public class C71721a implements C88631d.C76721a {

        /* renamed from: a */
        public final /* synthetic */ int f207984a;

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$a$a */
        public class C71722a implements DialogInterface.OnClickListener {
            public C71722a(C71721a aVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C71721a(int i) {
            this.f207984a = i;
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            Dialog dialog = WalletLqtDetailUI.this.f207943T;
            if (dialog != null) {
                dialog.dismiss();
            }
            Log.m105925i("MicroMsg.WalletLqtDetailUI", "fetch detail failed: %s", obj);
            int i = this.f207984a - 1;
            if (i > 0) {
                WalletLqtDetailUI.this.mo98916M7(i, false);
            } else if (obj != null) {
                C76879j.m92754y(WalletLqtDetailUI.this.getContext(), obj instanceof String ? obj.toString() : WalletLqtDetailUI.this.getString(C0966R.string.kxh), "", WalletLqtDetailUI.this.getString(C0966R.string.f8028zq), new C71722a(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$c0 */
    public static class C71723c0 extends C75227s {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C71723c0(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
            MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) appCompatActivity;
            mo108699c3("lqt_save_btn", new C79064a(true, true, 300, (View) null, C0966R.C0970id.g_p, C79066c.ViewId_Lqt_Save_Btn.toString(), mMFragmentActivity, false, 0, 0));
            mo108699c3("lqt_fetch_btn", new C79064a(true, true, 300, (View) null, C0966R.C0970id.g_8, C79066c.ViewId_Lqt_Fetch_Btn.toString(), mMFragmentActivity, false, 0, 0));
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$h */
    public class C71724h implements View.OnClickListener {
        public C71724h() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
            C75228t.m90221N(walletLqtDetailUI, walletLqtDetailUI.f207962f.f228736s.f184040f, false);
            C115669n.INSTANCE.mo160131h(17084, 4);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$i */
    public class C71725i implements View.OnClickListener {
        public C71725i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
            C51892wy wyVar = walletLqtDetailUI.f207962f.f228707Q0;
            if (wyVar.f144347f == 2) {
                C75228t.m90219L(walletLqtDetailUI, wyVar.f144348g, false);
                C115669n.INSTANCE.mo160131h(17084, 5);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$j */
    public class C71726j implements View.OnClickListener {
        public C71726j() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
            C75228t.m90221N(walletLqtDetailUI, walletLqtDetailUI.f207962f.f228738u.f184040f, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$m */
    public class C71727m implements View.OnClickListener {
        public C71727m() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean z = C90188n0.f258933a;
            WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
            C78023zk3 zk32 = walletLqtDetailUI.f207962f;
            C64526lm2 lm22 = zk32.f228703M;
            if (lm22 == null || !lm22.f184113g || zk32.f228712T == null) {
                walletLqtDetailUI.f207961e.f117129e.mo67529b(zk32.f228693C, 1);
                if (!Util.isNullOrNil(WalletLqtDetailUI.this.f207962f.f228740w)) {
                    Log.m105925i("MicroMsg.WalletLqtDetailUI", "click save button, go to block url: %s", WalletLqtDetailUI.this.f207962f.f228740w);
                    WalletLqtDetailUI walletLqtDetailUI2 = WalletLqtDetailUI.this;
                    C75228t.m90221N(walletLqtDetailUI2, walletLqtDetailUI2.f207962f.f228740w, false);
                } else {
                    WalletLqtDetailUI walletLqtDetailUI3 = WalletLqtDetailUI.this;
                    WalletLqtDetailUI.m84198K7(walletLqtDetailUI3, true, walletLqtDetailUI3.f207962f.f228703M);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C71649o1.m84127b(walletLqtDetailUI.getContext(), WalletLqtDetailUI.this.f207962f.f228712T);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$n */
    public class C71728n implements View.OnClickListener {
        public C71728n() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
            C78023zk3 zk32 = walletLqtDetailUI.f207962f;
            C64526lm2 lm22 = zk32.f228704N;
            if (lm22 == null || !lm22.f184113g || zk32.f228712T == null) {
                if (C79144b.m95773a().mo109088c(C32735h.C32737c.clicfg_wcpay_lqt_transfer_kinda_enable_android, false)) {
                    WalletLqtDetailUI.this.mo98917N7("");
                } else {
                    WalletLqtDetailUI walletLqtDetailUI2 = WalletLqtDetailUI.this;
                    C43290f0.C43296f fVar = walletLqtDetailUI2.f207961e.f117128d;
                    int i = walletLqtDetailUI2.f207962f.f228693C;
                    fVar.getClass();
                    ((C88633e) C88643g.m110548f(Integer.valueOf(i), 1)).mo123061d(fVar);
                    WalletLqtDetailUI walletLqtDetailUI3 = WalletLqtDetailUI.this;
                    WalletLqtDetailUI.m84198K7(walletLqtDetailUI3, false, walletLqtDetailUI3.f207962f.f228704N);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C71649o1.m84127b(walletLqtDetailUI.getContext(), WalletLqtDetailUI.this.f207962f.f228712T);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI$22", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$o */
    public class C71729o implements C76324c.C76325a {
        public C71729o(WalletLqtDetailUI walletLqtDetailUI) {
        }

        /* renamed from: a */
        public void mo5281a(Intent intent) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$p */
    public class C71730p implements C76324c.C76325a {
        public C71730p() {
        }

        /* renamed from: a */
        public void mo5281a(Intent intent) {
            String stringExtra = intent.getStringExtra("dataSource");
            String stringExtra2 = intent.getStringExtra("cmdWord");
            if (!stringExtra.equals("LQTRedeemUseCase")) {
                return;
            }
            if (stringExtra2.equals("onAlertResetPwd")) {
                WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
                int i = WalletLqtDetailUI.f207921e1;
                C79144b.m95773a().getClass();
                Log.m105918d("MicroMsg.WalletLqtDetailUI", "startKindaResetPwd:true");
                ((C76324c) C86312j.m106911c(C76324c.class)).startResetPwdUseCase(walletLqtDetailUI, (Bundle) null);
                return;
            }
            stringExtra2.equals("updateWalletLQTBalance");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$q */
    public class C71731q implements C87581a<Void, C78023zk3> {
        public C71731q() {
        }

        public Object call(Object obj) {
            C78023zk3 zk32 = (C78023zk3) obj;
            if (zk32 != null) {
                Log.m105925i("MicroMsg.WalletLqtDetailUI", "fetch detail success, account_type: %s, is_hide_close_account_btn: %s", Integer.valueOf(zk32.f228693C), Boolean.valueOf(zk32.f228692B));
                WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
                walletLqtDetailUI.f207962f = zk32;
                if (!walletLqtDetailUI.f207949W && !Util.isNullOrNil(zk32.f228716V)) {
                    try {
                        JSONObject jSONObject = new JSONObject(walletLqtDetailUI.f207962f.f228716V);
                        String optString = jSONObject.optString("done_button_wording");
                        int optInt = jSONObject.optInt("is_show_protocol", 0);
                        String optString2 = jSONObject.optString("left_protocol_wording");
                        String optString3 = jSONObject.optString("new_upload_credit_url");
                        String optString4 = jSONObject.optString("protocol_url");
                        String optString5 = jSONObject.optString("right_protocol_wording");
                        String optString6 = jSONObject.optString("subtitle");
                        String optString7 = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                        JSONArray optJSONArray = jSONObject.optJSONArray("upload_reasons");
                        LinkedList linkedList = new LinkedList();
                        if (optJSONArray != null) {
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                linkedList.add(optJSONArray.optString(i));
                            }
                        }
                        C5792e0.m5547c(walletLqtDetailUI.getContext(), optString7, optString6, linkedList, optString, optInt, optString2, optString5, optString4, optString3);
                        walletLqtDetailUI.f207949W = true;
                    } catch (JSONException e) {
                        Log.printErrStackTrace("MicroMsg.WalletLqtDetailUI", e, "", new Object[0]);
                    }
                }
                WalletLqtDetailUI.this.mo98919P7(false);
                if (zk32.f228711S0) {
                    WalletLqtDetailUI.m84196I7(WalletLqtDetailUI.this);
                }
                C77977pf3 pf32 = zk32.f228719W0;
                if (pf32 != null) {
                    WalletLqtDetailUI walletLqtDetailUI2 = WalletLqtDetailUI.this;
                    walletLqtDetailUI2.getClass();
                    if (Util.isNullOrNil(pf32.f228010d)) {
                        Log.m105928w("MicroMsg.WalletLqtDetailUI", "firstPurchaseDialog title is nil, ignore show");
                    } else if (walletLqtDetailUI2.f207957a1 != null) {
                        Log.m105928w("MicroMsg.WalletLqtDetailUI", "firstPurchaseDialog has been shown");
                    } else {
                        String className = walletLqtDetailUI2.getComponentName().getClassName();
                        if (className.contains(".")) {
                            className = className.substring(className.lastIndexOf(".") + 1);
                        }
                        if (!Util.getTopActivityName2(walletLqtDetailUI2).equalsIgnoreCase(className)) {
                            Log.m105928w("MicroMsg.WalletLqtDetailUI", "showFirstPurchaseDialog when is not top activity, ignore show");
                        } else {
                            C78008wk wkVar = pf32.f228014h;
                            if (wkVar == null || Util.isNullOrNil(wkVar.f228354g)) {
                                Log.m105928w("MicroMsg.WalletLqtDetailUI", "firstPurchaseDialog first_button is null");
                            } else {
                                C115669n.INSTANCE.mo160131h(16807, 3);
                                C78008wk wkVar2 = pf32.f228015i;
                                if (wkVar2 != null && !Util.isNullOrNil(wkVar2.f228354g)) {
                                    C101218e0 e0Var = new C101218e0(walletLqtDetailUI2, 1, 0);
                                    walletLqtDetailUI2.f207957a1 = e0Var;
                                    e0Var.mo140667n(pf32.f228014h.f228354g, pf32.f228015i.f228354g);
                                    C101218e0 e0Var2 = walletLqtDetailUI2.f207957a1;
                                    C71826r rVar = new C71826r(walletLqtDetailUI2, pf32);
                                    C71829s sVar = new C71829s(walletLqtDetailUI2, pf32);
                                    e0Var2.f296373D = rVar;
                                    e0Var2.f296374E = sVar;
                                    C85875k4.m106191k0(e0Var2.f296394t.getPaint());
                                    C85875k4.m106191k0(walletLqtDetailUI2.f207957a1.f296395u.getPaint());
                                } else {
                                    C101218e0 e0Var3 = new C101218e0(walletLqtDetailUI2, 2, 0);
                                    walletLqtDetailUI2.f207957a1 = e0Var3;
                                    e0Var3.mo140677w(pf32.f228014h.f228354g);
                                    C101218e0 e0Var4 = walletLqtDetailUI2.f207957a1;
                                    e0Var4.f296375F = new C71832t(walletLqtDetailUI2, pf32);
                                    C85875k4.m106191k0(e0Var4.f296398x.getPaint());
                                }
                                walletLqtDetailUI2.f207957a1.mo140665l(new C71835u(walletLqtDetailUI2));
                                View inflate = LayoutInflater.from(walletLqtDetailUI2.getContext()).inflate(C0966R.C0971layout.f359869cw3, (ViewGroup) null);
                                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.n3g);
                                C75228t.m90240d(textView);
                                textView.setText(pf32.f228010d);
                                ((TextView) inflate.findViewById(C0966R.C0970id.n4h)).setText(walletLqtDetailUI2.getString(C0966R.string.nad));
                                ImageView imageView = (ImageView) inflate.findViewById(C0966R.C0970id.n3f);
                                if (C85875k4.m106211z()) {
                                    imageView.setBackgroundResource(C0966R.C0969drawable.f357252ch1);
                                } else {
                                    imageView.setBackgroundResource(C0966R.C0969drawable.f357251ch0);
                                }
                                walletLqtDetailUI2.f207957a1.mo140663j(inflate);
                                walletLqtDetailUI2.f207957a1.mo140655A();
                            }
                        }
                    }
                }
                C78023zk3 zk33 = WalletLqtDetailUI.this.f207962f;
                if (zk33 != null) {
                    try {
                        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119993e(C72994y1.C72995a.USERINFO_LQT_DETAIL_STRING_SYNC, new String(zk33.toByteArray(), C77613a.f226275a));
                    } catch (IOException e2) {
                        Log.printErrStackTrace("MicroMsg.WalletLqtDetailUI", e2, "", new Object[0]);
                    }
                }
            } else {
                Log.m105924i("MicroMsg.WalletLqtDetailUI", "fetch detail failed");
            }
            Dialog dialog = WalletLqtDetailUI.this.f207943T;
            if (dialog != null) {
                dialog.dismiss();
            }
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$r */
    public class C71732r implements C88631d.C76721a {

        /* renamed from: com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$r$a */
        public class C71733a implements DialogInterface.OnClickListener {
            public C71733a(C71732r rVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C71732r() {
        }

        /* renamed from: a */
        public void mo1720a(Object obj) {
            Dialog dialog = WalletLqtDetailUI.this.f207943T;
            if (dialog != null) {
                dialog.dismiss();
            }
            Log.m105925i("MicroMsg.WalletLqtDetailUI", "close account failed: %s", obj);
            if (obj != null) {
                C76879j.m92754y(WalletLqtDetailUI.this.getContext(), obj instanceof String ? obj.toString() : WalletLqtDetailUI.this.getString(C0966R.string.kxh), "", WalletLqtDetailUI.this.getString(C0966R.string.f8028zq), new C71733a(this));
            }
        }
    }

    public WalletLqtDetailUI() {
        C43287e0 e0Var = (C43287e0) this.f207915d.mo136941c(this, C43287e0.class);
        C40008f fVar = C40008f.f107254d;
        this.f207959c1 = new IListener<WCPayUpdateSaveFetchUIEvent>(fVar) {
            {
                this.__eventId = 2351806;
            }

            public boolean callback(IEvent iEvent) {
                int i = ((WCPayUpdateSaveFetchUIEvent) iEvent).f194032d.f194033a;
                if (i == 1) {
                    WalletLqtDetailUI walletLqtDetailUI = WalletLqtDetailUI.this;
                    walletLqtDetailUI.f207961e.f117129e.mo67529b(walletLqtDetailUI.f207962f.f228693C, 1);
                    return false;
                } else if (i != 2) {
                    return false;
                } else {
                    WalletLqtDetailUI walletLqtDetailUI2 = WalletLqtDetailUI.this;
                    C43290f0.C43296f fVar = walletLqtDetailUI2.f207961e.f117128d;
                    int i2 = walletLqtDetailUI2.f207962f.f228693C;
                    fVar.getClass();
                    ((C88633e) C88643g.m110548f(Integer.valueOf(i2), 1)).mo123061d(fVar);
                    return false;
                }
            }
        };
        this.f207960d1 = new IListener<WCPayLqtDetailUIShowDialogEvent>(fVar) {
            {
                this.__eventId = -391684019;
            }

            public boolean callback(IEvent iEvent) {
                WalletLqtDetailUI.this.f207948V0.mo67549a(((WCPayLqtDetailUIShowDialogEvent) iEvent).f107803d.f107804a, (C43337b.C43339b) null);
                return false;
            }
        };
    }

    /* renamed from: H7 */
    public static void m84195H7(WalletLqtDetailUI walletLqtDetailUI, C101218e0 e0Var, C78008wk wkVar) {
        String str;
        walletLqtDetailUI.getClass();
        if (e0Var != null) {
            e0Var.mo140680z();
        }
        if (wkVar != null) {
            Log.m105925i("MicroMsg.WalletLqtDetailUI", "performDialogButtonAction action:%s url:%s", Integer.valueOf(wkVar.f228351d), wkVar.f228352e);
            int i = wkVar.f228351d;
            if (i == 1) {
                walletLqtDetailUI.finish();
            } else if (i == 2) {
                C75228t.m90219L(walletLqtDetailUI.getContext(), wkVar.f228352e, true);
            } else if (i == 3) {
                C75228t.m90224Q(wkVar.f228353f, wkVar.f228352e, 0, 1000);
            } else if (i == 4 && (str = wkVar.f228352e) != null && str.startsWith("weixin://wcpay/lqt/save")) {
                C71648n1.m84124b(wkVar.f228352e);
                String a = C71648n1.m84123a(wkVar.f228352e);
                Intent intent = new Intent(walletLqtDetailUI.getContext(), WalletLqtSaveFetchUI.class);
                try {
                    Uri parse = Uri.parse(wkVar.f228352e);
                    String queryParameter = parse.getQueryParameter("default_amount");
                    String queryParameter2 = parse.getQueryParameter("default_card_bind_serial");
                    String queryParameter3 = parse.getQueryParameter("pull_keyboard");
                    intent.putExtra("fill_money", C75228t.m90260n(Double.parseDouble(queryParameter) / 100.0d));
                    intent.putExtra("card_serial", queryParameter2);
                    intent.putExtra("need_pull_keyboard", "1".equals(queryParameter3));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WalletLqtDetailUI", e, "", new Object[0]);
                }
                walletLqtDetailUI.mo98918O7(a, intent);
            }
        }
    }

    /* renamed from: I7 */
    public static void m84196I7(WalletLqtDetailUI walletLqtDetailUI) {
        WalletLqtDetailUI walletLqtDetailUI2 = walletLqtDetailUI;
        if (walletLqtDetailUI2.f207962f.f228708R != null) {
            C104428a aVar = new C104428a(walletLqtDetailUI.getContext(), 0);
            int i = walletLqtDetailUI2.f207962f.f228708R.f185004h;
            if (i == 0) {
                View inflate = View.inflate(walletLqtDetailUI.getContext(), C0966R.C0971layout.b8v, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gae);
                ViewGroup viewGroup = (ViewGroup) inflate.findViewById(C0966R.C0970id.gaj);
                TextView textView2 = (TextView) inflate.findViewById(C0966R.C0970id.gai);
                ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(C0966R.C0970id.f358535m33);
                ((TextView) inflate.findViewById(C0966R.C0970id.gak)).setText(walletLqtDetailUI2.f207962f.f228708R.f185000d);
                if (!Util.isNullOrNil(walletLqtDetailUI2.f207962f.f228708R.f185003g)) {
                    textView.setText(walletLqtDetailUI2.f207962f.f228708R.f185003g);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                if (!Util.isNullOrNil(walletLqtDetailUI2.f207962f.f228708R.f185007n)) {
                    textView2.setText(walletLqtDetailUI2.f207962f.f228708R.f185007n);
                } else {
                    textView2.setText(walletLqtDetailUI2.getString(C0966R.string.m0g));
                }
                if (walletLqtDetailUI2.f207962f.f228708R.f185002f != null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = f207921e1;
                    Iterator<C64677re0> it = walletLqtDetailUI2.f207962f.f228708R.f185002f.iterator();
                    while (it.hasNext()) {
                        C64677re0 next = it.next();
                        ViewGroup viewGroup3 = (ViewGroup) View.inflate(walletLqtDetailUI.getContext(), C0966R.C0971layout.b8w, (ViewGroup) null);
                        ((CdnImageView) viewGroup3.findViewById(C0966R.C0970id.gag)).setUrl(next.f185152d);
                        ((TextView) viewGroup3.findViewById(C0966R.C0970id.gah)).setText(next.f185153e);
                        ((TextView) viewGroup3.findViewById(C0966R.C0970id.gaf)).setText(next.f185154f);
                        viewGroup.addView(viewGroup3, layoutParams);
                    }
                }
                viewGroup2.setOnClickListener(new C5753v(walletLqtDetailUI2, aVar));
                aVar.setContentView(inflate);
                BottomSheetBehavior y = BottomSheetBehavior.m139527y((View) inflate.getParent());
                if (y != null) {
                    y.mo146383A(C76577a.m92151b(walletLqtDetailUI.getContext(), JsApiOpenAdCanvas.CTRL_INDEX));
                    y.f309230p = false;
                }
            } else if (i == 1) {
                View inflate2 = View.inflate(walletLqtDetailUI.getContext(), C0966R.C0971layout.b8v, (ViewGroup) null);
                ViewGroup viewGroup4 = (ViewGroup) inflate2.findViewById(C0966R.C0970id.gaj);
                TextView textView3 = (TextView) inflate2.findViewById(C0966R.C0970id.gai);
                ViewGroup viewGroup5 = (ViewGroup) inflate2.findViewById(C0966R.C0970id.f358535m33);
                View findViewById = inflate2.findViewById(C0966R.C0970id.nx7);
                ((TextView) inflate2.findViewById(C0966R.C0970id.gak)).setText(walletLqtDetailUI2.f207962f.f228708R.f185000d);
                ((TextView) inflate2.findViewById(C0966R.C0970id.gae)).setVisibility(8);
                if (!Util.isNullOrNil(walletLqtDetailUI2.f207962f.f228708R.f185007n)) {
                    textView3.setText(walletLqtDetailUI2.f207962f.f228708R.f185007n);
                } else {
                    textView3.setText(walletLqtDetailUI2.getString(C0966R.string.m0g));
                }
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "configStaticVideoFinancialInfoDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "configStaticVideoFinancialInfoDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (walletLqtDetailUI2.f207962f.f228708R.f185005i != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) View.inflate(walletLqtDetailUI.getContext(), C0966R.C0971layout.d58, (ViewGroup) null);
                    String str = walletLqtDetailUI2.f207962f.f228708R.f185005i.f143952d;
                    CdnImageView cdnImageView = (CdnImageView) constraintLayout.findViewById(C0966R.C0970id.nx8);
                    cdnImageView.setUrl(str);
                    viewGroup4.setPadding(0, viewGroup4.getPaddingTop(), 0, viewGroup4.getPaddingBottom());
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) cdnImageView.getLayoutParams();
                    layoutParams2.width = (C75044y4.m89990b(MMApplicationContext.getContext()).x - layoutParams2.leftMargin) - layoutParams2.rightMargin;
                    layoutParams2.height = (int) ((((double) ((C75044y4.m89990b(MMApplicationContext.getContext()).x - layoutParams2.leftMargin) - layoutParams2.rightMargin)) / 366.0d) * 196.0d);
                    cdnImageView.setLayoutParams(layoutParams2);
                    viewGroup4.addView(constraintLayout);
                    constraintLayout.setOnClickListener(new C57493w(walletLqtDetailUI2));
                }
                viewGroup5.setOnClickListener(new C5754x(walletLqtDetailUI2, aVar));
                aVar.setContentView(inflate2);
                BottomSheetBehavior y2 = BottomSheetBehavior.m139527y((View) inflate2.getParent());
                if (y2 != null) {
                    y2.mo146383A(C76577a.m92151b(walletLqtDetailUI.getContext(), JsApiOpenAdCanvas.CTRL_INDEX));
                    y2.f309230p = false;
                }
            } else if (i == 2) {
                View inflate3 = View.inflate(walletLqtDetailUI.getContext(), C0966R.C0971layout.b8v, (ViewGroup) null);
                ViewGroup viewGroup6 = (ViewGroup) inflate3.findViewById(C0966R.C0970id.gaj);
                TextView textView4 = (TextView) inflate3.findViewById(C0966R.C0970id.gai);
                ViewGroup viewGroup7 = (ViewGroup) inflate3.findViewById(C0966R.C0970id.f358535m33);
                View findViewById2 = inflate3.findViewById(C0966R.C0970id.nx7);
                ((TextView) inflate3.findViewById(C0966R.C0970id.gak)).setText(walletLqtDetailUI2.f207962f.f228708R.f185000d);
                ((TextView) inflate3.findViewById(C0966R.C0970id.gae)).setVisibility(8);
                if (!Util.isNullOrNil(walletLqtDetailUI2.f207962f.f228708R.f185007n)) {
                    textView4.setText(walletLqtDetailUI2.f207962f.f228708R.f185007n);
                } else {
                    textView4.setText(walletLqtDetailUI2.getString(C0966R.string.m0g));
                }
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar3.mo10233c(8);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "configVideoFeedFinancialInfoDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "configVideoFeedFinancialInfoDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (walletLqtDetailUI2.f207962f.f228708R.f185006j != null) {
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) View.inflate(walletLqtDetailUI.getContext(), C0966R.C0971layout.d58, (ViewGroup) null);
                    String str2 = walletLqtDetailUI2.f207962f.f228708R.f185006j.f183979d;
                    CdnImageView cdnImageView2 = (CdnImageView) constraintLayout2.findViewById(C0966R.C0970id.nx8);
                    cdnImageView2.setUrl(str2);
                    viewGroup6.setPadding(0, viewGroup6.getPaddingTop(), 0, viewGroup6.getPaddingBottom());
                    ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) cdnImageView2.getLayoutParams();
                    layoutParams3.width = (C75044y4.m89990b(MMApplicationContext.getContext()).x - layoutParams3.leftMargin) - layoutParams3.rightMargin;
                    layoutParams3.height = (int) ((((double) ((C75044y4.m89990b(MMApplicationContext.getContext()).x - layoutParams3.leftMargin) - layoutParams3.rightMargin)) / 366.0d) * 196.0d);
                    cdnImageView2.setLayoutParams(layoutParams3);
                    viewGroup6.addView(constraintLayout2);
                    constraintLayout2.setOnClickListener(new C57494y(walletLqtDetailUI2));
                }
                viewGroup7.setOnClickListener(new C5756z(walletLqtDetailUI2, aVar));
                aVar.setContentView(inflate3);
                BottomSheetBehavior y3 = BottomSheetBehavior.m139527y((View) inflate3.getParent());
                if (y3 != null) {
                    y3.mo146383A(C76577a.m92151b(walletLqtDetailUI.getContext(), JsApiOpenAdCanvas.CTRL_INDEX));
                    y3.f309230p = false;
                }
            }
            aVar.show();
        }
    }

    /* renamed from: J7 */
    public static void m84197J7(WalletLqtDetailUI walletLqtDetailUI, JSONObject jSONObject, C64483k33 k332, ViewGroup viewGroup) {
        C50162kp3 kp32;
        walletLqtDetailUI.mo98915L7(viewGroup);
        if (jSONObject != null && (kp32 = k332.f183892n) != null && !Util.isNullOrNil(kp32.f136973e)) {
            if (k332.f183892n.f136972d == 4) {
                ((TextView) viewGroup.findViewById(C0966R.C0970id.g_1)).setText("");
            }
            C43290f0.C43295e eVar = walletLqtDetailUI.f207961e.f117131g;
            String str = k332.f183892n.f136973e;
            eVar.getClass();
            ((C88633e) C88643g.m110547e(str)).mo123061d(eVar);
            jSONObject.remove(k332.f183892n.f136973e);
            jSONObject.remove(String.format("%s_expiretime", new Object[]{k332.f183892n.f136973e}));
            jSONObject.remove(String.format("%s_wording", new Object[]{k332.f183892n.f136973e}));
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC, jSONObject.toString());
            C115669n.INSTANCE.mo160131h(22735, k332.f183892n.f136973e, 3, "");
            k332.f183892n = null;
        }
    }

    /* renamed from: K7 */
    public static void m84198K7(WalletLqtDetailUI walletLqtDetailUI, boolean z, C64526lm2 lm22) {
        Class<WalletLqtSaveFetchUI> cls = WalletLqtSaveFetchUI.class;
        if (lm22 != null) {
            walletLqtDetailUI.getClass();
            if (lm22.f184110d != 1 || Util.isNullOrNil(lm22.f184111e)) {
                int i = lm22.f184110d;
                if (i == 2) {
                    C75228t.m90221N(walletLqtDetailUI.getContext(), lm22.f184111e, true);
                } else if (i == 3) {
                    C75228t.m90224Q(lm22.f184112f, lm22.f184111e, 0, 1061);
                } else if (z) {
                    walletLqtDetailUI.mo98918O7("", new Intent(walletLqtDetailUI, cls));
                } else {
                    walletLqtDetailUI.mo98917N7("");
                }
            } else {
                String a = C71648n1.m84123a(lm22.f184111e);
                if (z) {
                    walletLqtDetailUI.mo98918O7(a, new Intent(walletLqtDetailUI, cls));
                } else {
                    walletLqtDetailUI.mo98917N7(a);
                }
            }
        } else if (z) {
            walletLqtDetailUI.getClass();
            walletLqtDetailUI.mo98918O7("", new Intent(walletLqtDetailUI, cls));
        } else {
            walletLqtDetailUI.mo98917N7("");
        }
    }

    /* renamed from: L7 */
    public final void mo98915L7(ViewGroup viewGroup) {
        ViewGroup viewGroup2 = viewGroup;
        View findViewById = viewGroup2.findViewById(C0966R.C0970id.h99);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "clearRedDot", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "clearRedDot", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = viewGroup2.findViewById(C0966R.C0970id.h9_);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(8);
        C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "clearRedDot", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "clearRedDot", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById3 = viewGroup2.findViewById(C0966R.C0970id.h96);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        C117292a.m165358d(findViewById3, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "clearRedDot", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "clearRedDot", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById4 = viewGroup2.findViewById(C0966R.C0970id.h97);
        C9556a aVar4 = new C9556a();
        aVar4.mo10233c(8);
        C117292a.m165358d(findViewById4, aVar4.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "clearRedDot", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
        C117292a.m165359e(findViewById4, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "clearRedDot", "(Landroid/view/ViewGroup;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: M7 */
    public void mo98916M7(int i, boolean z) {
        Log.m105925i("MicroMsg.WalletLqtDetailUI", "fetch detail: %s", Integer.valueOf(i));
        if (this.f207961e != null) {
            if (z) {
                Dialog dialog = this.f207943T;
                if (dialog == null) {
                    this.f207943T = C75197d0.m90163d(this, false, false, (DialogInterface.OnCancelListener) null);
                } else {
                    dialog.show();
                }
            }
            this.f207961e.f117126b.mo67528b().mo123062e(new C71731q()).mo123065b(new C71721a(i));
        }
    }

    /* renamed from: N7 */
    public final void mo98917N7(String str) {
        Log.m105924i("MicroMsg.WalletLqtDetailUI", "go to fetch ui");
        Intent intent = new Intent(this, WalletLqtSaveFetchUI.class);
        intent.putExtra("lqt_save_fetch_mode", 2);
        intent.putExtra("lqt_balance", this.f207962f.f228725f);
        intent.putExtra("lqt_max_redeem_amount", this.f207962f.f228741x);
        intent.putExtra("lqt_redeem_invalid_amount_hint", this.f207962f.f228743y);
        intent.putExtra("lqt_account_type", this.f207962f.f228693C);
        intent.putExtra("operate_id", str);
        intent.putExtra("entrance_type", 1);
        if (!((C76324c) C86312j.m106911c(C76324c.class)).startLqtFetchUseCase(getContext(), intent, new C71730p())) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "gotoFetchUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "gotoFetchUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: O7 */
    public final void mo98918O7(String str, Intent intent) {
        Log.m105924i("MicroMsg.WalletLqtDetailUI", "go to save ui");
        C78023zk3 zk32 = this.f207962f;
        intent.putExtra("lqt_save_fund_code", zk32 != null ? zk32.f228735r : null);
        intent.putExtra("lqt_save_fetch_mode", 1);
        intent.putExtra("lqt_is_show_protocol", this.f207962f.f228731o == 1);
        intent.putExtra("lqt_is_agree_protocol", this.f207962f.f228732p == 1);
        ArrayList arrayList = new ArrayList();
        LinkedList<C64514l50> linkedList = this.f207962f.f228734q;
        if (linkedList != null && linkedList.size() > 0) {
            Iterator<C64514l50> it = this.f207962f.f228734q.iterator();
            while (it.hasNext()) {
                C64514l50 next = it.next();
                if (!Util.isNullOrNil(next.f184038d) && !Util.isNullOrNil(next.f184040f)) {
                    arrayList.add(String.format("%s||%s", new Object[]{next.f184038d, next.f184040f}));
                }
            }
        }
        intent.putStringArrayListExtra("lqt_protocol_list", arrayList);
        intent.putExtra("lqt_profile_wording", this.f207962f.f228745z);
        intent.putExtra("lqt_account_type", this.f207962f.f228693C);
        intent.putExtra("lqt_fund_spid", this.f207962f.f228694D);
        intent.putExtra("operate_id", str);
        intent.putExtra("entrance_type", 1);
        if (!((C76324c) C86312j.m106911c(C76324c.class)).startLqtSaveUseCase(getContext(), intent, new C71729o(this))) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "gotoSaveUI", "(Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "gotoSaveUI", "(Ljava/lang/String;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x064b  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0655  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x06cb  */
    /* renamed from: P7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo98919P7(boolean r29) {
        /*
            r28 = this;
            r1 = r28
            te3.zk3 r0 = r1.f207962f
            java.lang.String r2 = "MicroMsg.WalletLqtDetailUI"
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 0
            if (r0 == 0) goto L_0x0ba8
            te3.k33 r0 = r0.f228722Z
            r6 = 17084(0x42bc, float:2.394E-41)
            r7 = 4
            r8 = 8
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "svr not return data, hide security entry"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            android.widget.LinearLayout r0 = r1.f207979x0
            r0.setVisibility(r8)
            goto L_0x00bd
        L_0x0024:
            java.lang.String r0 = "show lqt security entry with svr data"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            android.widget.LinearLayout r0 = r1.f207979x0
            r0.setVisibility(r5)
            te3.zk3 r0 = r1.f207962f
            te3.k33 r0 = r0.f228722Z
            java.lang.String r0 = r0.f183891j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x004b
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = r1.f207981y0
            r0.setVisibility(r5)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = r1.f207981y0
            te3.zk3 r9 = r1.f207962f
            te3.k33 r9 = r9.f228722Z
            java.lang.String r9 = r9.f183891j
            r0.setUrl(r9)
            goto L_0x0050
        L_0x004b:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = r1.f207981y0
            r0.setVisibility(r8)
        L_0x0050:
            android.widget.TextView r0 = r1.f207938Q0
            te3.zk3 r9 = r1.f207962f
            te3.k33 r9 = r9.f228722Z
            java.lang.String r9 = r9.f183885d
            r0.setText(r9)
            android.widget.LinearLayout r0 = r1.f207970p0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            if (r0 == 0) goto L_0x0076
            androidx.appcompat.app.AppCompatActivity r9 = r28.getContext()
            r10 = 16
            int r9 = kg3.C76577a.m92151b(r9, r10)
            r0.topMargin = r9
            android.widget.LinearLayout r9 = r1.f207970p0
            r9.setLayoutParams(r0)
        L_0x0076:
            java.lang.String r0 = "has click reddot"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r1.f207942S0
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            android.widget.ImageView r9 = r1.f207940R0
            r9.setVisibility(r8)
            if (r0 == 0) goto L_0x0099
            androidx.appcompat.app.AppCompatActivity r9 = r28.getContext()
            int r9 = kg3.C76577a.m92151b(r9, r7)
            r0.leftMargin = r9
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = r1.f207942S0
            r9.setLayoutParams(r0)
        L_0x0099:
            boolean r0 = r1.f207944T0
            if (r0 != 0) goto L_0x00b3
            r1.f207944T0 = r3
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r10 = 20
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9[r5] = r10
            r0.mo160131h(r6, r9)
            java.lang.String r0 = "report show security entry"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x00b3:
            android.widget.LinearLayout r0 = r1.f207979x0
            com.tencent.mm.plugin.wallet.balance.ui.lqt.d0 r9 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.d0
            r9.<init>(r1)
            r0.setOnClickListener(r9)
        L_0x00bd:
            r9 = 0
            r10 = 2
            if (r29 != 0) goto L_0x019b
            te3.zk3 r0 = r1.f207962f
            te3.pf3 r0 = r0.f228717V0
            if (r0 != 0) goto L_0x00c9
            goto L_0x019b
        L_0x00c9:
            boolean r11 = r1.f207954Y0
            if (r11 == 0) goto L_0x00d4
            java.lang.String r0 = "has showed dialog, ignore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            goto L_0x019b
        L_0x00d4:
            r1.f207954Y0 = r3
            qo3.e0 r11 = new qo3.e0
            androidx.appcompat.app.AppCompatActivity r12 = r28.getContext()
            r11.<init>(r12, r10, r5, r5)
            r1.f207956Z0 = r11
            te3.wk r11 = r0.f228014h
            java.lang.String r11 = r11.f228354g
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x00f5
            qo3.e0 r11 = r1.f207956Z0
            te3.wk r12 = r0.f228014h
            java.lang.String r12 = r12.f228354g
            r11.mo140677w(r12)
            goto L_0x0105
        L_0x00f5:
            qo3.e0 r11 = r1.f207956Z0
            android.content.res.Resources r12 = r28.getResources()
            r13 = 2131831354(0x7f112a3a, float:1.9295731E38)
            java.lang.String r12 = r12.getString(r13)
            r11.mo140677w(r12)
        L_0x0105:
            qo3.e0 r11 = r1.f207956Z0
            r11.mo140676v(r5)
            qo3.e0 r11 = r1.f207956Z0
            com.tencent.mm.plugin.wallet.balance.ui.lqt.e0 r12 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.e0
            r12.<init>(r1)
            r11.f296375F = r12
            androidx.appcompat.app.AppCompatActivity r11 = r28.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            r12 = 2131498248(0x7f0c1508, float:1.8620112E38)
            android.view.View r11 = r11.inflate(r12, r9)
            r12 = 2131308365(0x7f092f4d, float:1.8234984E38)
            android.view.View r12 = r11.findViewById(r12)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r12 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r12
            r13 = 2131308366(0x7f092f4e, float:1.8234986E38)
            android.view.View r13 = r11.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r14 = 2131308364(0x7f092f4c, float:1.8234981E38)
            android.view.View r14 = r11.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            java.lang.String r15 = r0.f228016j
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 == 0) goto L_0x0149
            r12.setVisibility(r8)
            goto L_0x0165
        L_0x0149:
            r12.setVisibility(r5)
            boolean r15 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r15 == 0) goto L_0x0160
            java.lang.String r15 = r0.f228017n
            boolean r15 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r15 != 0) goto L_0x0160
            java.lang.String r15 = r0.f228017n
            r12.setUrl(r15)
            goto L_0x0165
        L_0x0160:
            java.lang.String r15 = r0.f228016j
            r12.setUrl(r15)
        L_0x0165:
            java.lang.String r12 = r0.f228018o
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x0171
            r13.setVisibility(r8)
            goto L_0x0179
        L_0x0171:
            r13.setVisibility(r5)
            java.lang.String r12 = r0.f228018o
            r13.setText(r12)
        L_0x0179:
            te3.wy r12 = r0.f228013g
            java.lang.String r12 = r12.f144345d
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r12)
            if (r12 == 0) goto L_0x0187
            r14.setVisibility(r8)
            goto L_0x0191
        L_0x0187:
            r14.setVisibility(r5)
            te3.wy r0 = r0.f228013g
            java.lang.String r0 = r0.f144345d
            r14.setText(r0)
        L_0x0191:
            qo3.e0 r0 = r1.f207956Z0
            r0.mo140663j(r11)
            qo3.e0 r0 = r1.f207956Z0
            r0.mo140655A()
        L_0x019b:
            android.view.ViewGroup r0 = r1.f207963g
            r0.setVisibility(r5)
            java.lang.Class<ub3.b> r0 = ub3.C78144b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ub3.b r0 = (ub3.C78144b) r0
            com.tencent.mm.wallet_core.model.q0 r0 = r0.mo107980OI()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEW_LQT_LONG_SYNC
            r12 = 0
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            java.lang.Object r0 = r0.mo119992d(r11, r12)
            java.lang.Long r0 = (java.lang.Long) r0
            long r11 = r0.longValue()
            com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView r0 = r1.f207939R
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = ""
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            java.math.RoundingMode r12 = java.math.RoundingMode.HALF_UP
            java.lang.String r13 = "100"
            double r11 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90250i(r11, r13, r10, r12)
            java.lang.String r11 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r11)
            r12 = r29 ^ 1
            r0.mo99856e(r11, r12, r5)
            r0 = 2131308338(0x7f092f32, float:1.8234929E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x01fe
            te3.zk3 r11 = r1.f207962f
            java.lang.String r11 = r11.f228695E
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x01fb
            r0.setVisibility(r5)
            goto L_0x01fe
        L_0x01fb:
            r0.setVisibility(r8)
        L_0x01fe:
            r0 = 2131308361(0x7f092f49, float:1.8234975E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L_0x021a
            te3.zk3 r11 = r1.f207962f
            java.lang.String r11 = r11.f228695E
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x0217
            r0.setVisibility(r5)
            goto L_0x021a
        L_0x0217:
            r0.setVisibility(r8)
        L_0x021a:
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$t r0 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$t
            r0.<init>()
            android.widget.LinearLayout r11 = r1.f207952X0
            r11.setOnClickListener(r0)
            te3.zk3 r0 = r1.f207962f
            java.lang.String r0 = r0.f228709R0
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0237
            android.widget.TextView r0 = r1.f207964h
            te3.zk3 r11 = r1.f207962f
            java.lang.String r11 = r11.f228709R0
            r0.setText(r11)
        L_0x0237:
            android.view.ViewGroup r0 = r1.f207965i
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$w r11 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$w
            r11.<init>()
            r0.setOnClickListener(r11)
            android.widget.TextView r0 = r1.f207966j
            te3.zk3 r11 = r1.f207962f
            java.lang.String r11 = r11.f228726g
            r0.setText(r11)
            android.widget.TextView r0 = r1.f207967n
            te3.zk3 r11 = r1.f207962f
            java.lang.String r11 = r11.f228727h
            r0.setText(r11)
            android.widget.TextView r0 = r1.f207969p
            te3.zk3 r11 = r1.f207962f
            java.lang.String r11 = r11.f228728i
            r0.setText(r11)
            com.tencent.mm.wallet_core.ui.WalletTextView r0 = r1.f207971q
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r14)
            te3.zk3 r12 = r1.f207962f
            int r12 = r12.f228729j
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.math.RoundingMode r12 = java.math.RoundingMode.HALF_UP
            double r11 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90250i(r11, r13, r10, r12)
            java.lang.String r11 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90256l(r11)
            r0.setText(r11)
            android.view.ViewGroup r0 = r1.f207968o
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$x r11 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$x
            r11.<init>()
            r0.setOnClickListener(r11)
            te3.zk3 r0 = r1.f207962f
            java.lang.String r0 = r0.f228698H
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02a1
            android.widget.TextView r0 = r1.f207934M
            te3.zk3 r11 = r1.f207962f
            java.lang.String r11 = r11.f228698H
            r0.setText(r11)
            android.widget.TextView r0 = r1.f207934M
            r0.setVisibility(r5)
            goto L_0x02a6
        L_0x02a1:
            android.widget.TextView r0 = r1.f207934M
            r0.setVisibility(r7)
        L_0x02a6:
            te3.zk3 r0 = r1.f207962f
            java.lang.String r0 = r0.f228705P
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x02bf
            android.widget.TextView r0 = r1.f207935N
            te3.zk3 r11 = r1.f207962f
            java.lang.String r11 = r11.f228705P
            r0.setText(r11)
            android.widget.TextView r0 = r1.f207935N
            r0.setVisibility(r5)
            goto L_0x02c4
        L_0x02bf:
            android.widget.TextView r0 = r1.f207935N
            r0.setVisibility(r7)
        L_0x02c4:
            android.widget.LinearLayout r0 = r1.f207974t
            r0.removeAllViews()
            android.widget.LinearLayout r0 = r1.f207975u
            r0.removeAllViews()
            te3.zk3 r0 = r1.f207962f
            te3.hn2 r0 = r0.f228721Y
            r11 = 3
            r12 = -2
            r13 = -1
            if (r0 == 0) goto L_0x0381
            int r15 = r0.f183518d
            if (r15 != r3) goto L_0x0381
            java.lang.String r0 = "showLctOperationView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            boolean r0 = r1.f207951X
            if (r0 != 0) goto L_0x02fa
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r15 = new java.lang.Object[r3]
            r16 = 10
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r15[r5] = r16
            r0.mo160131h(r6, r15)
            r1.f207951X = r3
            java.lang.String r0 = "ReportShowLctOperationView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x02fa:
            android.view.LayoutInflater r0 = r28.getLayoutInflater()
            r6 = 2131496340(0x7f0c0d94, float:1.8616242E38)
            android.widget.LinearLayout r15 = r1.f207975u
            android.view.View r0 = r0.inflate(r6, r15, r5)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6 = 2131308423(0x7f092f87, float:1.8235101E38)
            android.view.View r6 = r0.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r15 = 2131308422(0x7f092f86, float:1.82351E38)
            android.view.View r15 = r0.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            te3.zk3 r9 = r1.f207962f
            te3.hn2 r9 = r9.f228721Y
            te3.k33 r9 = r9.f183519e
            java.lang.String r9 = r9.f183885d
            r6.setText(r9)
            te3.zk3 r6 = r1.f207962f
            te3.hn2 r6 = r6.f228721Y
            te3.k33 r6 = r6.f183519e
            java.lang.String r6 = r6.f183886e
            r15.setText(r6)
            te3.zk3 r6 = r1.f207962f
            te3.hn2 r6 = r6.f228721Y
            te3.k33 r6 = r6.f183519e
            int r9 = r6.f183889h
            if (r9 != r3) goto L_0x033c
            goto L_0x037a
        L_0x033c:
            if (r9 != r10) goto L_0x035a
            java.lang.String r6 = r6.f183887f
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x037a
            te3.zk3 r6 = r1.f207962f
            te3.hn2 r6 = r6.f228721Y
            te3.k33 r6 = r6.f183519e
            java.lang.String r6 = r6.f183887f
            r0.setTag(r6)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.f0 r6 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.f0
            r6.<init>(r1, r0)
            r0.setOnClickListener(r6)
            goto L_0x037a
        L_0x035a:
            if (r9 != r11) goto L_0x037a
            java.lang.String r6 = r6.f183890i
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x037a
            te3.zk3 r6 = r1.f207962f
            te3.hn2 r6 = r6.f228721Y
            te3.k33 r6 = r6.f183519e
            java.lang.String r6 = r6.f183887f
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x037a
            com.tencent.mm.plugin.wallet.balance.ui.lqt.g0 r6 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.g0
            r6.<init>(r1)
            r0.setOnClickListener(r6)
        L_0x037a:
            android.widget.LinearLayout r6 = r1.f207975u
            r6.addView(r0)
            goto L_0x04ed
        L_0x0381:
            if (r0 == 0) goto L_0x04ed
            int r6 = r0.f183518d
            if (r6 != r10) goto L_0x04ed
            te3.jn2 r0 = r0.f183520f
            if (r0 == 0) goto L_0x04ed
            java.util.LinkedList<te3.in2> r0 = r0.f183815e
            r6 = 21309(0x533d, float:2.986E-41)
            r9 = 2131308424(0x7f092f88, float:1.8235103E38)
            r15 = 2131308414(0x7f092f7e, float:1.8235083E38)
            if (r0 == 0) goto L_0x0470
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x039f
            goto L_0x0470
        L_0x039f:
            java.lang.String r0 = "showLctOperationView3"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            te3.zk3 r0 = r1.f207962f
            te3.hn2 r0 = r0.f228721Y
            te3.jn2 r0 = r0.f183520f
            te3.k33 r0 = r0.f183814d
            if (r0 == 0) goto L_0x04ed
            boolean r0 = r1.f207955Z
            if (r0 != 0) goto L_0x03c3
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r7 = new java.lang.Object[r10]
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)
            r7[r5] = r17
            r7[r3] = r4
            r0.mo160131h(r6, r7)
            r1.f207955Z = r3
        L_0x03c3:
            te3.zk3 r0 = r1.f207962f
            te3.hn2 r0 = r0.f228721Y
            te3.jn2 r0 = r0.f183520f
            te3.k33 r6 = r0.f183814d
            java.util.LinkedList<te3.in2> r0 = r0.f183815e
            java.lang.Object r0 = r0.get(r5)
            te3.in2 r0 = (te3.C64448in2) r0
            android.view.LayoutInflater r7 = r28.getLayoutInflater()
            r11 = 2131496342(0x7f0c0d96, float:1.8616246E38)
            android.widget.LinearLayout r3 = r1.f207975u
            android.view.View r3 = r7.inflate(r11, r3, r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r7 = r3.findViewById(r15)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r7 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r7
            android.view.View r9 = r3.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            java.lang.String r11 = r6.f183891j
            boolean r11 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
            if (r11 != 0) goto L_0x03ff
            java.lang.String r11 = r6.f183891j
            r7.setUrl(r11)
            r7.setVisibility(r5)
            goto L_0x0402
        L_0x03ff:
            r7.setVisibility(r8)
        L_0x0402:
            java.lang.String r7 = r6.f183885d
            r9.setText(r7)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.i0 r7 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.i0
            r7.<init>(r1, r6, r0)
            r3.setOnClickListener(r7)
            r6 = 2131308418(0x7f092f82, float:1.823509E38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r7 = 2131308416(0x7f092f80, float:1.8235087E38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r9 = 2131308420(0x7f092f84, float:1.8235095E38)
            android.view.View r9 = r3.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r11 = 2131308419(0x7f092f83, float:1.8235093E38)
            android.view.View r11 = r3.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r15 = 2131308417(0x7f092f81, float:1.8235089E38)
            android.view.View r15 = r3.findViewById(r15)
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            java.lang.String r5 = r0.f183698d
            r6.setText(r5)
            java.lang.String r5 = r0.f183699e
            r7.setText(r5)
            java.lang.String r5 = r0.f183700f
            r9.setText(r5)
            java.lang.String r5 = r0.f183701g
            r11.setText(r5)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.j0 r5 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.j0
            r5.<init>(r1, r0)
            r15.setOnClickListener(r5)
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r13, r12)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r5 = kg3.C76577a.m92151b(r5, r8)
            r0.leftMargin = r5
            r0.rightMargin = r5
            android.widget.LinearLayout r5 = r1.f207975u
            r5.addView(r3, r0)
            goto L_0x04ed
        L_0x0470:
            java.lang.String r0 = "showLctOperationView2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            te3.zk3 r0 = r1.f207962f
            te3.hn2 r0 = r0.f228721Y
            te3.jn2 r0 = r0.f183520f
            te3.k33 r0 = r0.f183814d
            if (r0 == 0) goto L_0x04ed
            boolean r0 = r1.f207953Y
            if (r0 != 0) goto L_0x0492
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r5 = 0
            r3[r5] = r4
            r5 = 1
            r3[r5] = r4
            r0.mo160131h(r6, r3)
            r1.f207953Y = r5
        L_0x0492:
            te3.zk3 r0 = r1.f207962f
            te3.hn2 r0 = r0.f228721Y
            te3.jn2 r0 = r0.f183520f
            te3.k33 r0 = r0.f183814d
            android.view.LayoutInflater r3 = r28.getLayoutInflater()
            r5 = 2131496341(0x7f0c0d95, float:1.8616244E38)
            android.widget.LinearLayout r6 = r1.f207975u
            r7 = 0
            android.view.View r3 = r3.inflate(r5, r6, r7)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.View r5 = r3.findViewById(r15)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r5 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r5
            android.view.View r6 = r3.findViewById(r9)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.String r9 = r0.f183891j
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x04c7
            java.lang.String r9 = r0.f183891j
            r5.setUrl(r9)
            r5.setVisibility(r7)
            goto L_0x04ca
        L_0x04c7:
            r5.setVisibility(r8)
        L_0x04ca:
            java.lang.String r5 = r0.f183885d
            r6.setText(r5)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.h0 r5 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.h0
            r5.<init>(r1, r0)
            r3.setOnClickListener(r5)
            android.view.ViewGroup$MarginLayoutParams r0 = new android.view.ViewGroup$MarginLayoutParams
            r0.<init>(r13, r12)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r5 = kg3.C76577a.m92151b(r5, r8)
            r0.leftMargin = r5
            r0.rightMargin = r5
            android.widget.LinearLayout r5 = r1.f207975u
            r5.addView(r3, r0)
        L_0x04ed:
            te3.zk3 r0 = r1.f207962f
            java.util.LinkedList<te3.k33> r0 = r0.f228697G
            r3 = 2131307209(0x7f092ac9, float:1.8232639E38)
            r5 = 2131308348(0x7f092f3c, float:1.823495E38)
            r6 = 2131308350(0x7f092f3e, float:1.8234953E38)
            r7 = 2131496331(0x7f0c0d8b, float:1.8616224E38)
            if (r0 == 0) goto L_0x0723
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0723
            te3.zk3 r0 = r1.f207962f
            java.util.LinkedList<te3.k33> r0 = r0.f228697G
            java.util.Iterator r9 = r0.iterator()
            r11 = 0
        L_0x050e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x07f2
            java.lang.Object r0 = r9.next()
            r15 = r0
            te3.k33 r15 = (te3.C64483k33) r15
            android.view.LayoutInflater r0 = r28.getLayoutInflater()
            android.widget.LinearLayout r12 = r1.f207974t
            r13 = 0
            android.view.View r0 = r0.inflate(r7, r12, r13)
            r12 = r0
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            android.view.View r0 = r12.findViewById(r6)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.view.View r13 = r12.findViewById(r5)
            android.widget.TextView r13 = (android.widget.TextView) r13
            r5 = 2131307207(0x7f092ac7, float:1.8232635E38)
            android.view.View r5 = r12.findViewById(r5)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r5 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r5
            android.view.View r6 = r12.findViewById(r3)
            te3.zk3 r3 = r1.f207962f
            java.util.LinkedList<te3.k33> r3 = r3.f228697G
            int r3 = r3.size()
            r17 = 1
            int r3 = r3 + -1
            if (r11 != r3) goto L_0x0596
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r18 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r3.mo10233c(r7)
            java.lang.Object[] r19 = r3.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r21 = "setViewData"
            java.lang.String r22 = "(Z)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r6
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r7 = 0
            java.lang.Object r3 = r3.mo10231a(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r6.setVisibility(r3)
            java.lang.String r19 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r20 = "setViewData"
            java.lang.String r21 = "(Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            r3 = 2131231366(0x7f080286, float:1.807881E38)
            r12.setBackgroundResource(r3)
        L_0x0596:
            java.lang.String r3 = "wxpay://lqt/fixeddeposit/makeplan"
            if (r15 != 0) goto L_0x059c
            goto L_0x05f7
        L_0x059c:
            java.lang.String r6 = r15.f183887f
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x05af
            java.lang.String r6 = r15.f183887f
            java.lang.String r7 = "wxpay://lqt/fixeddeposit/planlist"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x05f7
        L_0x05af:
            boolean r6 = r1.f207946U0
            if (r6 != 0) goto L_0x05c2
            r6 = 1
            r1.f207946U0 = r6
            com.tencent.mm.plugin.report.service.n r7 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r10 = 22449(0x57b1, float:3.1458E-41)
            java.lang.Object[] r8 = new java.lang.Object[r6]
            r6 = 0
            r8[r6] = r4
            r7.mo160131h(r10, r8)
        L_0x05c2:
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LQT_FIXED_DEPOSIT_HAS_SHOW_ENTRANCE_TIPS_BOOLEAN_SYNC
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            java.lang.Object r6 = r6.mo119685f(r7, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x05f7
            java.lang.String r6 = r15.f183886e
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 == 0) goto L_0x05f7
            androidx.appcompat.app.AppCompatActivity r6 = r28.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131839260(0x7f11491c, float:1.9311766E38)
            java.lang.CharSequence r6 = r6.getText(r7)
            java.lang.String r6 = r6.toString()
            r15.f183886e = r6
        L_0x05f7:
            java.lang.String r6 = r15.f183885d
            r0.setText(r6)
            f40.C86709a0.m107528h()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_ITEM_REDDOT_CONFIG_STRING_SYNC
            java.lang.Object r0 = r0.mo119685f(r6, r14)
            java.lang.String r0 = (java.lang.String) r0
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r6 != 0) goto L_0x0622
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x061b }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x061b }
            goto L_0x0623
        L_0x061b:
            r0 = move-exception
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r14, r7)
        L_0x0622:
            r6 = 0
        L_0x0623:
            te3.kp3 r0 = r15.f183892n
            if (r0 == 0) goto L_0x062d
            if (r6 == 0) goto L_0x062d
            r1.mo98921R7(r6, r0, r15, r12)
            goto L_0x0635
        L_0x062d:
            r1.mo98915L7(r12)
            java.lang.String r0 = r15.f183886e
            r13.setText(r0)
        L_0x0635:
            java.lang.String r0 = r15.f183891j
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x064b
            r7 = 1
            r5.setUseSdcardCache(r7)
            java.lang.String r0 = r15.f183891j
            r5.setUrl(r0)
            r8 = 0
            r5.setVisibility(r8)
            goto L_0x0651
        L_0x064b:
            r7 = 1
            r8 = 8
            r5.setVisibility(r8)
        L_0x0651:
            int r0 = r15.f183889h
            if (r0 != r7) goto L_0x06cb
            java.lang.String r0 = r15.f183887f
            java.lang.String r5 = "wxpay://lqt/planindex"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x066a
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$y r0 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$y
            r0.<init>(r6, r15, r12)
            r12.setOnClickListener(r0)
            goto L_0x06e3
        L_0x066a:
            java.lang.String r0 = r15.f183887f
            java.lang.String r5 = "wxpay://lqt/autochargesetting"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x067e
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$z r0 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$z
            r0.<init>(r6, r15, r12)
            r12.setOnClickListener(r0)
            goto L_0x06e3
        L_0x067e:
            java.lang.String r0 = r15.f183887f
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x068f
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$a0 r0 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$a0
            r0.<init>(r6, r15, r12)
            r12.setOnClickListener(r0)
            goto L_0x06e3
        L_0x068f:
            java.lang.String r0 = r15.f183887f
            java.lang.String r3 = "wxpay://lqt/fixeddeposit/planlist"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x06a3
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$b0 r0 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$b0
            r0.<init>(r6, r15, r12)
            r12.setOnClickListener(r0)
            goto L_0x06e3
        L_0x06a3:
            java.lang.String r0 = r15.f183887f
            java.lang.String r3 = "wxpay://lqt/spenddeposit/makeplan"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x06b7
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$b r0 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$b
            r0.<init>(r6, r15, r12)
            r12.setOnClickListener(r0)
            goto L_0x06e3
        L_0x06b7:
            java.lang.String r0 = r15.f183887f
            java.lang.String r3 = "wxpay://lqt/spenddeposit/plandetail"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x06e3
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$c r0 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$c
            r0.<init>(r6, r15, r12)
            r12.setOnClickListener(r0)
            goto L_0x06e3
        L_0x06cb:
            r3 = 2
            if (r0 != r3) goto L_0x06e5
            java.lang.String r0 = r15.f183887f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x06e3
            java.lang.String r0 = r15.f183887f
            r12.setTag(r0)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$d r0 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$d
            r0.<init>(r6, r15, r12)
            r12.setOnClickListener(r0)
        L_0x06e3:
            r3 = 3
            goto L_0x0700
        L_0x06e5:
            r3 = 3
            if (r0 != r3) goto L_0x0700
            java.lang.String r0 = r15.f183890i
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0700
            java.lang.String r0 = r15.f183887f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0700
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$e r0 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$e
            r0.<init>(r6, r15, r12)
            r12.setOnClickListener(r0)
        L_0x0700:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = -2
            r7 = -1
            r0.<init>(r7, r6, r5)
            android.widget.LinearLayout r5 = r1.f207974t
            r5.addView(r12, r0)
            int r11 = r11 + 1
            r3 = 2131307209(0x7f092ac9, float:1.8232639E38)
            r5 = 2131308348(0x7f092f3c, float:1.823495E38)
            r6 = 2131308350(0x7f092f3e, float:1.8234953E38)
            r7 = 2131496331(0x7f0c0d8b, float:1.8616224E38)
            r8 = 8
            r10 = 2
            r12 = -2
            r13 = -1
            goto L_0x050e
        L_0x0723:
            te3.zk3 r0 = r1.f207962f
            java.util.LinkedList<te3.l50> r0 = r0.f228730n
            if (r0 == 0) goto L_0x07f2
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x07f2
            te3.zk3 r0 = r1.f207962f
            java.util.LinkedList<te3.l50> r0 = r0.f228730n
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L_0x0738:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x07f2
            java.lang.Object r4 = r0.next()
            te3.l50 r4 = (te3.C64514l50) r4
            android.view.LayoutInflater r5 = r28.getLayoutInflater()
            android.widget.LinearLayout r6 = r1.f207974t
            r7 = 2131496331(0x7f0c0d8b, float:1.8616224E38)
            r8 = 0
            android.view.View r5 = r5.inflate(r7, r6, r8)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r6 = 2131308350(0x7f092f3e, float:1.8234953E38)
            android.view.View r8 = r5.findViewById(r6)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 2131308348(0x7f092f3c, float:1.823495E38)
            android.view.View r10 = r5.findViewById(r9)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r11 = 2131307209(0x7f092ac9, float:1.8232639E38)
            android.view.View r12 = r5.findViewById(r11)
            te3.zk3 r13 = r1.f207962f
            java.util.LinkedList<te3.l50> r13 = r13.f228730n
            int r13 = r13.size()
            r14 = 1
            int r13 = r13 - r14
            if (r3 != r13) goto L_0x07c1
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            r14 = 8
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            r13.mo10233c(r15)
            java.lang.Object[] r21 = r13.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r23 = "setViewData"
            java.lang.String r24 = "(Z)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r12
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r14 = 0
            java.lang.Object r13 = r13.mo10231a(r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r12.setVisibility(r13)
            java.lang.String r21 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r22 = "setViewData"
            java.lang.String r23 = "(Z)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            r12 = 2131231366(0x7f080286, float:1.807881E38)
            r5.setBackgroundResource(r12)
        L_0x07c1:
            java.lang.String r12 = r4.f184038d
            r8.setText(r12)
            java.lang.String r8 = r4.f184039e
            r10.setText(r8)
            java.lang.String r8 = r4.f184040f
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x07e0
            java.lang.String r4 = r4.f184040f
            r5.setTag(r4)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$f r4 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$f
            r4.<init>(r5)
            r5.setOnClickListener(r4)
        L_0x07e0:
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = -2
            r12 = -1
            r4.<init>(r12, r10, r8)
            android.widget.LinearLayout r8 = r1.f207974t
            r8.addView(r5, r4)
            int r3 = r3 + 1
            goto L_0x0738
        L_0x07f2:
            android.widget.LinearLayout r0 = r1.f207974t
            int r0 = r0.getChildCount()
            if (r0 != 0) goto L_0x0844
            r0 = 2131308386(0x7f092f62, float:1.8235026E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x0844
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r6 = "setViewData"
            java.lang.String r7 = "(Z)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = 0
            java.lang.Object r4 = r11.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            r0.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r5 = "setViewData"
            java.lang.String r6 = "(Z)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0844:
            te3.zk3 r0 = r1.f207962f
            boolean r0 = r0.f228744y0
            if (r0 == 0) goto L_0x0852
            android.widget.Button r0 = r1.f207973s
            r3 = 0
            r0.setEnabled(r3)
            r4 = 1
            goto L_0x0859
        L_0x0852:
            r3 = 0
            android.widget.Button r0 = r1.f207973s
            r4 = 1
            r0.setEnabled(r4)
        L_0x0859:
            te3.zk3 r0 = r1.f207962f
            boolean r0 = r0.f228742x0
            if (r0 == 0) goto L_0x0865
            android.widget.Button r0 = r1.f207972r
            r0.setEnabled(r3)
            goto L_0x086a
        L_0x0865:
            android.widget.Button r0 = r1.f207972r
            r0.setEnabled(r4)
        L_0x086a:
            te3.zk3 r0 = r1.f207962f
            int r0 = r0.f228725f
            if (r0 > 0) goto L_0x0875
            android.widget.Button r0 = r1.f207973s
            r0.setEnabled(r3)
        L_0x0875:
            te3.zk3 r0 = r1.f207962f
            java.lang.String r0 = r0.f228706Q
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r3 = 1
            r0 = r0 ^ r3
            te3.zk3 r3 = r1.f207962f
            te3.l50 r3 = r3.f228736s
            if (r3 == 0) goto L_0x088f
            java.lang.String r3 = r3.f184038d
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x088f
            r3 = 1
            goto L_0x0890
        L_0x088f:
            r3 = 0
        L_0x0890:
            te3.zk3 r4 = r1.f207962f
            te3.wy r4 = r4.f228707Q0
            if (r4 == 0) goto L_0x08a0
            java.lang.String r4 = r4.f144346e
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x08a0
            r4 = 1
            goto L_0x08a1
        L_0x08a0:
            r4 = 0
        L_0x08a1:
            r5 = 1061997773(0x3f4ccccd, float:0.8)
            if (r0 == 0) goto L_0x08d0
            android.widget.TextView r0 = r1.f207937Q
            te3.zk3 r6 = r1.f207962f
            java.lang.String r6 = r6.f228706Q
            r0.setText(r6)
            android.widget.TextView r0 = r1.f207937Q
            android.text.TextPaint r0 = r0.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r5)
            android.widget.TextView r0 = r1.f207937Q
            r6 = 50
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90252j(r0, r6)
            android.widget.LinearLayout r0 = r1.f207936P
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$g r6 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$g
            r6.<init>()
            r0.setOnClickListener(r6)
            android.widget.LinearLayout r0 = r1.f207936P
            r6 = 0
            r0.setVisibility(r6)
            goto L_0x08d7
        L_0x08d0:
            android.widget.LinearLayout r0 = r1.f207936P
            r6 = 8
            r0.setVisibility(r6)
        L_0x08d7:
            if (r3 == 0) goto L_0x08fe
            android.widget.TextView r0 = r1.f207977w
            te3.zk3 r3 = r1.f207962f
            te3.l50 r3 = r3.f228736s
            java.lang.String r3 = r3.f184038d
            r0.setText(r3)
            android.widget.TextView r0 = r1.f207977w
            android.text.TextPaint r0 = r0.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r5)
            android.widget.LinearLayout r0 = r1.f207976v
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$h r3 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$h
            r3.<init>()
            r0.setOnClickListener(r3)
            android.widget.LinearLayout r0 = r1.f207976v
            r3 = 0
            r0.setVisibility(r3)
            goto L_0x0905
        L_0x08fe:
            android.widget.LinearLayout r0 = r1.f207976v
            r3 = 8
            r0.setVisibility(r3)
        L_0x0905:
            if (r4 == 0) goto L_0x092e
            android.widget.TextView r0 = r1.f207982z
            te3.zk3 r3 = r1.f207962f
            te3.wy r3 = r3.f228707Q0
            java.lang.String r3 = r3.f144346e
            r0.setText(r3)
            android.widget.TextView r0 = r1.f207982z
            android.text.TextPaint r0 = r0.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r5)
            android.widget.LinearLayout r0 = r1.f207980y
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$i r3 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$i
            r3.<init>()
            r0.setOnClickListener(r3)
            android.widget.LinearLayout r0 = r1.f207980y
            r3 = 0
            r0.setVisibility(r3)
            r3 = 8
            goto L_0x0935
        L_0x092e:
            android.widget.LinearLayout r0 = r1.f207980y
            r3 = 8
            r0.setVisibility(r3)
        L_0x0935:
            android.view.View r0 = r1.f207922A
            k20.a r4 = new k20.a
            r4.<init>()
            k20.C60958c.m71442b(r3, r4)
            java.lang.Object[] r7 = r4.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r9 = "setViewData"
            java.lang.String r10 = "(Z)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r0
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r3 = 0
            java.lang.Object r4 = r4.mo10231a(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r3 = r4.intValue()
            r0.setVisibility(r3)
            java.lang.String r7 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r8 = "setViewData"
            java.lang.String r9 = "(Z)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            te3.zk3 r0 = r1.f207962f
            te3.l50 r0 = r0.f228738u
            if (r0 == 0) goto L_0x09e3
            java.lang.String r0 = r0.f184038d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x09e3
            android.view.View r0 = r1.f207922A
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 0
            k20.C60958c.m71442b(r4, r3)
            java.lang.Object[] r7 = r3.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r9 = "setViewData"
            java.lang.String r10 = "(Z)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r0
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r7 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r8 = "setViewData"
            java.lang.String r9 = "(Z)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.widget.TextView r0 = r1.f207923B
            te3.zk3 r3 = r1.f207962f
            te3.l50 r3 = r3.f228738u
            java.lang.String r3 = r3.f184038d
            r0.setText(r3)
            android.view.View r0 = r1.f207922A
            r3 = 128(0x80, float:1.794E-43)
            r0.sendAccessibilityEvent(r3)
            te3.zk3 r0 = r1.f207962f
            te3.l50 r0 = r0.f228738u
            java.lang.String r0 = r0.f184040f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x09ea
            android.view.View r0 = r1.f207922A
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$j r3 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$j
            r3.<init>()
            r0.setOnClickListener(r3)
            goto L_0x09ea
        L_0x09e3:
            android.widget.LinearLayout r0 = r1.f207950W0
            r3 = 128(0x80, float:1.794E-43)
            r0.sendAccessibilityEvent(r3)
        L_0x09ea:
            r28.mo98920Q7()
            android.view.View r0 = r1.f207928G
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r6)
            java.lang.Object[] r7 = r3.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r9 = "setViewData"
            java.lang.String r10 = "(Z)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r0
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r7 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r8 = "setViewData"
            java.lang.String r9 = "(Z)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r0 = r1.f207927F
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 8
            k20.C60958c.m71442b(r4, r3)
            java.lang.Object[] r21 = r3.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r23 = "setViewData"
            java.lang.String r24 = "(Z)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r21 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r22 = "setViewData"
            java.lang.String r23 = "(Z)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
            te3.zk3 r0 = r1.f207962f
            te3.sx2 r0 = r0.f228739v
            if (r0 == 0) goto L_0x0b1e
            java.lang.String r0 = r0.f228230g
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0b1e
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = r1.f207929H
            te3.zk3 r3 = r1.f207962f
            te3.sx2 r3 = r3.f228739v
            java.lang.String r3 = r3.f228227d
            r0.setUrl(r3)
            android.widget.TextView r0 = r1.f207930I
            te3.zk3 r3 = r1.f207962f
            te3.sx2 r3 = r3.f228739v
            java.lang.String r3 = r3.f228228e
            r0.setText(r3)
            android.widget.TextView r0 = r1.f207931J
            te3.zk3 r3 = r1.f207962f
            te3.sx2 r3 = r3.f228739v
            java.lang.String r3 = r3.f228229f
            r0.setText(r3)
            android.view.View r0 = r1.f207928G
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$k r3 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$k
            r3.<init>()
            r0.setOnClickListener(r3)
            android.view.View r0 = r1.f207927F
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 0
            k20.C60958c.m71442b(r4, r3)
            java.lang.Object[] r7 = r3.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r9 = "setViewData"
            java.lang.String r10 = "(Z)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r0
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r7 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r8 = "setViewData"
            java.lang.String r9 = "(Z)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.view.View r0 = r1.f207928G
            k20.a r3 = new k20.a
            r3.<init>()
            r4 = 0
            k20.C60958c.m71442b(r4, r3)
            java.lang.Object[] r21 = r3.mo10232b()
            java.lang.String r22 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r23 = "setViewData"
            java.lang.String r24 = "(Z)V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            r20 = r0
            j20.C117292a.m165358d(r20, r21, r22, r23, r24, r25, r26, r27)
            r4 = 0
            java.lang.Object r3 = r3.mo10231a(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r21 = "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI"
            java.lang.String r22 = "setViewData"
            java.lang.String r23 = "(Z)V"
            java.lang.String r24 = "android/view/View_EXEC_"
            java.lang.String r25 = "setVisibility"
            java.lang.String r26 = "(I)V"
            j20.C117292a.m165359e(r20, r21, r22, r23, r24, r25, r26)
        L_0x0b1e:
            te3.zk3 r0 = r1.f207962f
            java.lang.String r0 = r0.f228701K
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0b32
            android.widget.TextView r0 = r1.f207978x
            te3.zk3 r3 = r1.f207962f
            java.lang.String r3 = r3.f228701K
            r0.setText(r3)
            goto L_0x0b4d
        L_0x0b32:
            te3.zk3 r0 = r1.f207962f
            int r0 = r0.f228693C
            r3 = 1
            if (r0 != r3) goto L_0x0b42
            android.widget.TextView r0 = r1.f207978x
            r3 = 2131839229(0x7f1148fd, float:1.9311704E38)
            r0.setText(r3)
            goto L_0x0b4d
        L_0x0b42:
            r3 = 2
            if (r0 != r3) goto L_0x0b4d
            android.widget.TextView r0 = r1.f207978x
            r3 = 2131839230(0x7f1148fe, float:1.9311706E38)
            r0.setText(r3)
        L_0x0b4d:
            te3.zk3 r0 = r1.f207962f
            te3.k33 r0 = r0.f228702L
            if (r0 == 0) goto L_0x0b80
            java.lang.String r0 = r0.f183885d
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0b80
            android.widget.LinearLayout r0 = r1.f207932K
            r3 = 0
            r0.setVisibility(r3)
            android.widget.TextView r0 = r1.f207933L
            te3.zk3 r3 = r1.f207962f
            te3.k33 r3 = r3.f228702L
            java.lang.String r3 = r3.f183885d
            r0.setText(r3)
            android.widget.TextView r0 = r1.f207933L
            android.text.TextPaint r0 = r0.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r0, r5)
            android.widget.LinearLayout r0 = r1.f207932K
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$l r3 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$l
            r3.<init>()
            r0.setOnClickListener(r3)
            goto L_0x0b87
        L_0x0b80:
            android.widget.LinearLayout r0 = r1.f207932K
            r3 = 8
            r0.setVisibility(r3)
        L_0x0b87:
            android.widget.Button r0 = r1.f207972r
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$m r3 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$m
            r3.<init>()
            r0.setOnClickListener(r3)
            android.widget.Button r0 = r1.f207973s
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$n r3 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$n
            r3.<init>()
            r0.setOnClickListener(r3)
            te3.zk3 r0 = r1.f207962f
            boolean r3 = r0.f228710S
            if (r3 == 0) goto L_0x0ba8
            te3.qf3 r0 = r0.f228712T
            if (r0 == 0) goto L_0x0ba8
            com.tencent.p014mm.plugin.wallet.balance.model.lqt.C71649o1.m84127b(r1, r0)
        L_0x0ba8:
            r28.removeAllOptionMenu()
            te3.zk3 r0 = r1.f207962f
            if (r0 == 0) goto L_0x0be7
            java.util.LinkedList<te3.k33> r0 = r0.f228714U
            if (r0 == 0) goto L_0x0bdb
            int r0 = r0.size()
            r3 = 1
            if (r0 != r3) goto L_0x0bdb
            te3.zk3 r0 = r1.f207962f
            boolean r0 = r0.f228692B
            if (r0 == 0) goto L_0x0bdb
            java.lang.String r0 = "show text menu"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            te3.zk3 r0 = r1.f207962f
            java.util.LinkedList<te3.k33> r0 = r0.f228714U
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            te3.k33 r0 = (te3.C64483k33) r0
            java.lang.String r3 = r0.f183885d
            com.tencent.mm.plugin.wallet.balance.ui.lqt.a0 r4 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.a0
            r4.<init>(r1, r0)
            r1.addTextOptionMenu(r2, r3, r4)
            goto L_0x0be7
        L_0x0bdb:
            r2 = 0
            r0 = 2131756370(0x7f100552, float:1.9143646E38)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.b0 r3 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.b0
            r3.<init>(r1)
            r1.addIconOptionMenu(r2, r0, r3)
        L_0x0be7:
            java.lang.Class<com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$c0> r0 = com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtDetailUI.C71723c0.class
            androidx.lifecycle.i0 r0 = r1.component(r0)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtDetailUI$c0 r0 = (com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtDetailUI.C71723c0) r0
            te3.zk3 r2 = r1.f207962f
            xb3.k$a r3 = xb3.C78781k.C78782a.Event_Custom
            if (r2 == 0) goto L_0x0c22
            r2 = 2131308373(0x7f092f55, float:1.8235E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            r4 = 2131308355(0x7f092f43, float:1.8234963E38)
            android.view.View r4 = r0.findViewById(r4)
            android.widget.Button r4 = (android.widget.Button) r4
            if (r4 == 0) goto L_0x0c14
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L_0x0c14
            java.lang.String r4 = "lqt_fetch_btn"
            r0.mo108702f3(r3, r4)
        L_0x0c14:
            if (r2 == 0) goto L_0x0c25
            boolean r2 = r2.isEnabled()
            if (r2 == 0) goto L_0x0c25
            java.lang.String r2 = "lqt_save_btn"
            r0.mo108702f3(r3, r2)
            goto L_0x0c25
        L_0x0c22:
            r0.getClass()
        L_0x0c25:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet.balance.p119ui.lqt.WalletLqtDetailUI.mo98919P7(boolean):void");
    }

    /* renamed from: Q7 */
    public final void mo98920Q7() {
        C64483k33 k332 = this.f207962f.f228733p0;
        if (k332 == null) {
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "svr not return middle banner, hide middle banner");
            View view = this.f207924C;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (Util.isNullOrNil(k332.f183885d)) {
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "middle banner title is nil, hide middle banner");
            View view3 = this.f207924C;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            View view5 = this.f207924C;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "showLqtMiddleBanner", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f207924C.setImportantForAccessibility(1);
            this.f207925D.setText(k332.f183885d);
            if (!Util.isNullOrNil(k332.f183887f) || !Util.isNullOrNil(k332.f183890i)) {
                this.f207926E.setVisibility(0);
                this.f207925D.post(new C5743u());
                this.f207924C.setOnClickListener(new C5744v());
                TextView textView = this.f207925D;
                textView.setContentDescription(this.f207925D.getText() + getString(C0966R.string.bio));
            } else {
                this.f207925D.setVisibility(0);
                this.f207926E.setVisibility(8);
            }
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f207924C.getLayoutParams();
            if (this.f207962f.f228722Z != null) {
                if (layoutParams != null) {
                    layoutParams.topMargin = C76577a.m92151b(getContext(), 16);
                    this.f207924C.setLayoutParams(layoutParams);
                }
            } else if (layoutParams != null) {
                layoutParams.topMargin = C76577a.m92151b(getContext(), 24);
                this.f207924C.setLayoutParams(layoutParams);
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f207970p0.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.topMargin = C76577a.m92151b(getContext(), 8);
                this.f207970p0.setLayoutParams(layoutParams2);
            }
        }
    }

    /* renamed from: R7 */
    public final void mo98921R7(JSONObject jSONObject, C50162kp3 kp32, C64483k33 k332, ViewGroup viewGroup) {
        JSONObject jSONObject2 = jSONObject;
        C50162kp3 kp33 = kp32;
        C64483k33 k333 = k332;
        ViewGroup viewGroup2 = viewGroup;
        boolean z = jSONObject2.optInt(kp33.f136973e, 0) == 1;
        long optLong = jSONObject2.optLong(String.format("%s_expiretime", new Object[]{kp33.f136973e}), 0);
        boolean z2 = (optLong <= 0 || System.currentTimeMillis() <= optLong) ? z : false;
        Log.m105925i("MicroMsg.WalletLqtDetailUI", "show red dot: %s, red dot id: %s, red dot expired: %s, red dot type: %s", Boolean.valueOf(z2), kp33.f136973e, Long.valueOf(optLong), Integer.valueOf(kp33.f136972d));
        if (z && !z2) {
            C115669n.INSTANCE.mo160131h(22735, kp33.f136973e, 2, "");
        }
        mo98915L7(viewGroup2);
        if (z2) {
            ImageView imageView = (ImageView) viewGroup2.findViewById(C0966R.C0970id.h99);
            ImageView imageView2 = (ImageView) viewGroup2.findViewById(C0966R.C0970id.h9_);
            TextView textView = (TextView) viewGroup2.findViewById(C0966R.C0970id.h96);
            TextView textView2 = (TextView) viewGroup2.findViewById(C0966R.C0970id.h97);
            TextView textView3 = (TextView) viewGroup2.findViewById(C0966R.C0970id.g_1);
            int i = kp33.f136972d;
            if (i != 1) {
                if (i == 2) {
                    textView.setVisibility(0);
                } else if (i == 3) {
                    textView2.setText(C43423i0.m46933d(getContext(), kp33.f136974f, (C43423i0.C43428e) null).toString());
                    textView2.setVisibility(0);
                } else if (i != 4) {
                    z2 = false;
                } else {
                    imageView2.setVisibility(0);
                    C43423i0.m46937h(textView3, kp33.f136974f, (C43423i0.C43428e) null);
                }
            } else if (!Util.isNullOrNil(k333.f183886e)) {
                textView3.setText(k333.f183886e);
                imageView2.setVisibility(0);
            } else {
                imageView.setVisibility(0);
            }
            if (z2) {
                C115669n.INSTANCE.mo160131h(22735, kp33.f136973e, 1, "");
            } else {
                C115669n.INSTANCE.mo160131h(22735, kp33.f136973e, 0, "Red Dot Type returned by server is invalid.");
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cf7;
    }

    public Class<? extends C75227s> getReportUIC() {
        return C71723c0.class;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 123 && i2 == -1) {
            this.f207945U = false;
            String stringExtra = intent.getStringExtra("lqt_enc_pwd");
            Dialog dialog = this.f207943T;
            if (dialog == null) {
                this.f207943T = C75197d0.m90163d(this, false, false, (DialogInterface.OnCancelListener) null);
            } else {
                dialog.show();
            }
            C43290f0.C43291a aVar = this.f207961e.f117127c;
            int i3 = this.f207962f.f228693C;
            aVar.getClass();
            ((C88633e) C88643g.m110548f(stringExtra, Integer.valueOf(i3))).mo123061d(aVar).mo123062e(new C43332s()).mo123065b(new C71732r());
        }
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.ajh));
        setActionbarElementColor(getResources().getColor(C0966R.color.f2975b6));
        hideActionbarLine();
        setMMTitle("");
        this.f207948V0 = new C43337b(this);
        Log.m105925i("MicroMsg.WalletLqtDetailUI", "inputAccountType: %s", Integer.valueOf(getIntent().getIntExtra("key_account_type", 1)));
        if (getIntent().getIntExtra("key_auto_jump_transfer", 0) == 1) {
            Log.m105924i("MicroMsg.WalletLqtDetailUI", "auto jump to balance transfer");
            Intent intent = new Intent(getContext(), WalletLqtBalanceAutoTransferUI.class);
            intent.putExtra("show_open_toast", getIntent().getIntExtra("show_open_toast", 0));
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtDetailUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        this.f207963g = (ViewGroup) findViewById(C0966R.C0970id.c3h);
        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.g_y)).getPaint(), 0.8f);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.g9u);
        ViewGroup viewGroup = (ViewGroup) findViewById(C0966R.C0970id.m3x);
        TextView textView = (TextView) findViewById(C0966R.C0970id.m3w);
        this.f207964h = textView;
        TextPaint paint = textView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        this.f207965i = (ViewGroup) findViewById(C0966R.C0970id.c3e);
        this.f207966j = (TextView) findViewById(C0966R.C0970id.g9s);
        this.f207967n = (TextView) findViewById(C0966R.C0970id.g9t);
        this.f207968o = (ViewGroup) findViewById(C0966R.C0970id.c3k);
        this.f207969p = (TextView) findViewById(C0966R.C0970id.g_e);
        this.f207971q = (WalletTextView) findViewById(C0966R.C0970id.g_f);
        Button button = (Button) findViewById(C0966R.C0970id.g_p);
        this.f207972r = button;
        C85875k4.m106189j0(button.getPaint(), 0.8f);
        Button button2 = (Button) findViewById(C0966R.C0970id.g_8);
        this.f207973s = button2;
        C85875k4.m106189j0(button2.getPaint(), 0.8f);
        this.f207974t = (LinearLayout) findViewById(C0966R.C0970id.g_2);
        this.f207975u = (LinearLayout) findViewById(C0966R.C0970id.gap);
        this.f207976v = (LinearLayout) findViewById(C0966R.C0970id.g_6);
        this.f207977w = (TextView) findViewById(C0966R.C0970id.g_7);
        this.f207980y = (LinearLayout) findViewById(C0966R.C0970id.g_a);
        this.f207982z = (TextView) findViewById(C0966R.C0970id.g_b);
        this.f207922A = findViewById(C0966R.C0970id.g9y);
        this.f207923B = (TextView) findViewById(C0966R.C0970id.g9z);
        this.f207924C = findViewById(C0966R.C0970id.g_l);
        this.f207925D = (TextView) findViewById(C0966R.C0970id.g_m);
        this.f207926E = (WeImageView) findViewById(C0966R.C0970id.g_k);
        this.f207928G = findViewById(C0966R.C0970id.g_w);
        this.f207929H = (CdnImageView) findViewById(C0966R.C0970id.klv);
        this.f207930I = (TextView) findViewById(C0966R.C0970id.klw);
        this.f207931J = (TextView) findViewById(C0966R.C0970id.klu);
        this.f207927F = findViewById(C0966R.C0970id.g_v);
        this.f207978x = (TextView) findViewById(C0966R.C0970id.g_4);
        this.f207932K = (LinearLayout) findViewById(C0966R.C0970id.g_z);
        this.f207933L = (TextView) findViewById(C0966R.C0970id.f358652ga0);
        this.f207934M = (TextView) findViewById(C0966R.C0970id.g_c);
        this.f207935N = (TextView) findViewById(C0966R.C0970id.f358653ga1);
        this.f207936P = (LinearLayout) findViewById(C0966R.C0970id.g_9);
        this.f207937Q = (TextView) findViewById(C0966R.C0970id.g__);
        this.f207939R = (WcPayMoneyLoadingView) findViewById(C0966R.C0970id.g9w);
        this.f207941S = (ProgressBar) findViewById(C0966R.C0970id.lhb);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.g_r);
        this.f207979x0 = linearLayout;
        linearLayout.setImportantForAccessibility(1);
        this.f207981y0 = (CdnImageView) findViewById(C0966R.C0970id.g_s);
        this.f207938Q0 = (TextView) findViewById(C0966R.C0970id.g_u);
        this.f207940R0 = (ImageView) findViewById(C0966R.C0970id.g_t);
        this.f207942S0 = (WeImageView) findViewById(C0966R.C0970id.g_q);
        this.f207970p0 = (LinearLayout) findViewById(C0966R.C0970id.g_j);
        this.f207950W0 = (LinearLayout) findViewById(C0966R.C0970id.g_x);
        this.f207952X0 = (LinearLayout) findViewById(C0966R.C0970id.g9q);
        this.f207950W0.setImportantForAccessibility(1);
        this.f207952X0.setImportantForAccessibility(1);
        this.f207939R.setLoadingPb(this.f207941S);
        getLifecycle().addObserver(this.f207939R);
        this.f207939R.setPrefixSymbol(getString(C0966R.string.l7o));
        this.f207976v.setVisibility(4);
        this.f207980y.setVisibility(4);
        this.f207959c1.alive();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f207961e = null;
        this.f207959c1.dead();
    }

    public void onPause() {
        super.onPause();
        this.f207960d1.dead();
        this.f207939R.mo99855d();
    }

    public void onResume() {
        super.onResume();
        this.f207960d1.alive();
        if (this.f207945U) {
            try {
                String str = (String) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_LQT_DETAIL_STRING_SYNC, "");
                if (!Util.isNullOrNil(str)) {
                    this.f207962f = (C78023zk3) new C78023zk3().parseFrom(str.getBytes(C77613a.f226275a));
                }
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.WalletLqtDetailUI", e, "", new Object[0]);
            }
            mo98919P7(true);
            mo98916M7(0, false);
        } else {
            C86709a0.m107528h();
            if (((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PAY_LQT_SECURITY_REDDOT_TIME_INT_SYNC, 0)).intValue() == -1 && this.f207940R0.getVisibility() == 0) {
                Log.m105924i("MicroMsg.WalletLqtDetailUI", "remove lqt security reddot");
                this.f207940R0.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f207942S0.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.leftMargin = C76577a.m92151b(getContext(), 4);
                    this.f207942S0.setLayoutParams(layoutParams);
                }
            }
        }
        this.f207945U = true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C12945b.class);
    }
}
