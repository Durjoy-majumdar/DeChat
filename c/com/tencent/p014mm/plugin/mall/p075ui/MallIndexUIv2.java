package com.tencent.p014mm.plugin.mall.p075ui;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import b63.C0248u;
import b63.C113146l;
import b63.C67199q0;
import b73.C28273c;
import b73.C67213b;
import c63.C67345b;
import com.tencent.kinda.gen.ITransmitKvData;
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
import com.tencent.p014mm.plugin.wallet_core.utils.C72502o;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.p014mm.wallet_core.model.C75121j;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.model.C86018q0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86737h0;
import fy3.C32227p;
import h81.C32735h;
import ie3.C76324c;
import j20.C117292a;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import l31.C61212e;
import lg3.C76695c;
import nc0.C76850a;
import nj3.C76874e0;
import nj3.C76875f0;
import o31.C11345b;
import o31.C76986a;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import p626nv.C109759g;
import p626nv.C76963d;
import qo3.C77407n;
import rx3.C13598b0;
import s52.C77619d;
import s52.C77620f;
import te3.C77933g43;
import te3.tg4;
import ub3.C78144b;
import v53.C78342e0;
import zt3.C119157j;

@C86737h0
/* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2 */
public class MallIndexUIv2 extends MallIndexBaseUIv2 implements MStorageEx.IOnStorageChange {

    /* renamed from: A */
    public View f201279A = null;

    /* renamed from: B */
    public boolean f201280B = false;

    /* renamed from: C */
    public TextView f201281C = null;

    /* renamed from: D */
    public boolean f201282D = false;

    /* renamed from: E */
    public Dialog f201283E;

    /* renamed from: F */
    public C69766l f201284F = null;

    /* renamed from: G */
    public C69768m f201285G = null;

    /* renamed from: H */
    public WcPayMoneyLoadingView f201286H;

    /* renamed from: I */
    public ProgressBar f201287I;

    /* renamed from: J */
    public int f201288J;

    /* renamed from: K */
    public ArrayList<C0248u> f201289K;

    /* renamed from: L */
    public boolean f201290L = false;

    /* renamed from: M */
    public IListener<OpenECardFinishEvent> f201291M;

    /* renamed from: N */
    public boolean f201292N;

    /* renamed from: P */
    public IListener f201293P;

    /* renamed from: Q */
    public IListener<WxPayGdprResultEvent> f201294Q;

    /* renamed from: R */
    public boolean f201295R;

    /* renamed from: w */
    public boolean f201296w = false;

    /* renamed from: x */
    public WalletGetUserInfoEvent.C67825b f201297x;

    /* renamed from: y */
    public RelativeLayout f201298y;

    /* renamed from: z */
    public C72428s1 f201299z = new C72428s1();

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$a */
    public class C4885a implements MenuItem.OnMenuItemClickListener {
        public C4885a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ArrayList<C0248u> arrayList;
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(14872, 0, 0, "", "", 0);
            nVar.mo160131h(16500, 3);
            if (!((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91334p().mo91306f() || (arrayList = MallIndexUIv2.this.f201289K) == null || arrayList.size() <= 0) {
                MallIndexUIv2 mallIndexUIv2 = MallIndexUIv2.this;
                boolean z = mallIndexUIv2.f201297x.f194065k;
                mallIndexUIv2.getClass();
                Intent intent = new Intent();
                intent.putExtra("key_default_show_currency", z);
                C88144b.m109795m(mallIndexUIv2, "wallet", ".pwd.ui.WalletPasswordSettingUI", intent, 6);
            } else {
                MallIndexUIv2 mallIndexUIv22 = MallIndexUIv2.this;
                mallIndexUIv22.getClass();
                Log.m105924i("MicorMsg.MallIndexUIv2", "openNewPayManageMenu");
                AppCompatActivity context = mallIndexUIv22.getContext();
                LayoutInflater.from(context);
                C77407n nVar2 = new C77407n((Context) context, 1, false);
                ArrayList arrayList2 = new ArrayList();
                new ArrayList();
                C4889w wVar = new C4889w(mallIndexUIv22);
                C4890x xVar = new C4890x(mallIndexUIv22);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C76875f0 f0Var = (C76875f0) ((MenuItem) it.next());
                    f0Var.f224728w = null;
                    f0Var.f224729x = null;
                }
                arrayList2.clear();
                C76874e0 e0Var = new C76874e0(context);
                wVar.onCreateMMMenu(e0Var);
                if (e0Var.mo107176v()) {
                    Log.m105928w("MicroMsg.MMSubMenuHelper", "show, menu empty");
                } else {
                    nVar2.f225771i = wVar;
                    nVar2.f225782p = xVar;
                    nVar2.f225761d = null;
                    nVar2.f225725D = null;
                    nVar2.mo107573q();
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$h */
    public class C4886h extends C7089c0 {
        public C4886h() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicorMsg.MallIndexUIv2", "click settings btn");
            C88144b.m109789g(MallIndexUIv2.this.getContext(), "mall", ".ui.MallFunctionSettingsUI");
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$i */
    public class C4887i implements Runnable {
        public C4887i() {
        }

        public void run() {
            int j = C76577a.m92159j(MallIndexUIv2.this.getContext());
            int b = C76577a.m92151b(MallIndexUIv2.this.getContext(), 53);
            int[] iArr = new int[2];
            MallIndexUIv2.this.f201183d.getLocationInWindow(iArr);
            int bottom = (MallIndexUIv2.this.f201195s.getBottom() + iArr[1]) - j;
            int height = (MallIndexUIv2.this.f201183d.getHeight() - MallIndexUIv2.this.f201195s.getHeight()) + iArr[1];
            if (bottom > 0) {
                height += bottom;
            }
            int i = (j - height) - b;
            int b2 = C76577a.m92151b(MallIndexUIv2.this.getContext(), 33);
            Log.m105919d("MicorMsg.MallIndexUIv2", "winHeight: %d, height: %d, footerHeight: %s, Y: %d, scrollDiff: %d, diff: %d", Integer.valueOf(j), Integer.valueOf(height), Integer.valueOf(MallIndexUIv2.this.f201195s.getHeight()), Integer.valueOf(iArr[1]), Integer.valueOf(bottom), Integer.valueOf(i));
            if (i > b2) {
                MallIndexUIv2 mallIndexUIv2 = MallIndexUIv2.this;
                mallIndexUIv2.f201195s.setPadding(C76577a.m92155f(mallIndexUIv2.getContext(), C0966R.dimen.f3736cp), i, C76577a.m92155f(MallIndexUIv2.this.getContext(), C0966R.dimen.f3736cp), b2);
                return;
            }
            MallIndexUIv2 mallIndexUIv22 = MallIndexUIv2.this;
            mallIndexUIv22.f201195s.setPadding(C76577a.m92155f(mallIndexUIv22.getContext(), C0966R.dimen.f3736cp), b2, C76577a.m92155f(MallIndexUIv2.this.getContext(), C0966R.dimen.f3736cp), b2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$b */
    public class C69758b implements C75121j {
        public C69758b(MallIndexUIv2 mallIndexUIv2) {
        }

        /* renamed from: a */
        public void mo95711a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$c */
    public class C69759c extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C77619d f201301g;

        public C69759c(C77619d dVar) {
            this.f201301g = dVar;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            new Intent();
            C75228t.m90222O(MallIndexUIv2.this, this.f201301g.f226283a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$d */
    public class C69760d extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C77619d f201303g;

        public C69760d(C77619d dVar) {
            this.f201303g = dVar;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C75228t.m90219L(MallIndexUIv2.this.getContext(), this.f201303g.f226283a, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$e */
    public class C69761e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f201305d;

        public C69761e(LinearLayout linearLayout) {
            this.f201305d = linearLayout;
        }

        public void run() {
            Class cls = C78144b.class;
            int width = this.f201305d.getWidth();
            MallIndexUIv2.this.f201288J = this.f201305d.getHeight();
            int b = (width - (C76577a.m92151b(MallIndexUIv2.this.getContext(), 8) * 3)) / 2;
            LinearLayout linearLayout = (LinearLayout) MallIndexUIv2.this.f201194r.findViewById(C0966R.C0970id.gtz);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
            int width2 = linearLayout.getWidth();
            int height = linearLayout.getHeight();
            if (width2 > b) {
                layoutParams.width = b;
                width2 = b;
            }
            Log.m105925i("MicorMsg.MallIndexUIv2", "headContentLayoutWidth:%s,itemLayoutMaxWidth ：%s,walletLayoutWidth:%s", Integer.valueOf(width), Integer.valueOf(b), Integer.valueOf(width2));
            LinearLayout linearLayout2 = (LinearLayout) MallIndexUIv2.this.f201194r.findViewById(C0966R.C0970id.gtv);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
            layoutParams2.width = width2;
            layoutParams2.height = height;
            ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119993e(C72994y1.C72995a.WALLET_MALL_HEADER_ITEM_WIDTH_INT_SYNC, Integer.valueOf(width2));
            ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119990a(true);
            ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119993e(C72994y1.C72995a.WALLET_MALL_HEADER_ITEM_HEIGHT_INT_SYNC, Integer.valueOf(height));
            ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119990a(true);
            int i = (width - (width2 * 2)) / 3;
            C86018q0 OI = ((C78144b) C86312j.m106911c(cls)).mo107980OI();
            C72994y1.C72995a aVar = C72994y1.C72995a.WALLET_MALL_HEADER_INTERVAL_INT_SYNC;
            int intValue = ((Integer) OI.mo119992d(aVar, 0)).intValue();
            Log.m105925i("MicorMsg.MallIndexUIv2", "caculate interval:%s lastInterval:%s", Integer.valueOf(i), Integer.valueOf(intValue));
            if (intValue != i) {
                ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119993e(aVar, Integer.valueOf(i));
                ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119990a(true);
                layoutParams2.leftMargin = i;
                layoutParams.rightMargin = i;
            }
            linearLayout2.setLayoutParams(layoutParams2);
            linearLayout.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$f */
    public class C69762f implements Runnable {
        public C69762f(MallIndexUIv2 mallIndexUIv2) {
        }

        public void run() {
            C113146l.m154807e(2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$g */
    public class C69763g implements C72428s1.C72430b {
        public C69763g() {
        }

        public Context getContext() {
            return MallIndexUIv2.this;
        }

        public int getShowAgreenRequestCode() {
            return 3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$j */
    public class C69764j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WalletGetBulletinEvent f201308d;

        public C69764j(WalletGetBulletinEvent walletGetBulletinEvent) {
            this.f201308d = walletGetBulletinEvent;
        }

        public void run() {
            C77933g43 g432;
            WalletGetBulletinEvent.C28848b bVar = this.f201308d.f79043e;
            if (bVar.f79049d == 2 && (g432 = bVar.f79050e) != null) {
                MallIndexUIv2.this.f201187h.setBannerData(g432);
            } else if (!Util.isNullOrNil(bVar.f79046a)) {
                TextView textView = MallIndexUIv2.this.f201186g;
                WalletGetBulletinEvent.C28848b bVar2 = this.f201308d.f79043e;
                C75228t.m90247g0((View) null, textView, bVar2.f79046a, bVar2.f79047b, bVar2.f79048c);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$k */
    public abstract class C69765k implements C115619a {

        /* renamed from: d */
        public Context f201310d;

        /* renamed from: e */
        public ImageView f201311e;

        /* renamed from: f */
        public TextView f201312f;

        public C69765k(MallIndexUIv2 mallIndexUIv2, Context context, View view) {
            this.f201310d = context;
            mo95986a(view);
        }

        /* renamed from: a */
        public abstract void mo95986a(View view);

        /* renamed from: f */
        public boolean mo25956f(boolean z) {
            if (z) {
                this.f201311e.setVisibility(0);
                return true;
            }
            this.f201311e.setVisibility(8);
            return true;
        }

        /* renamed from: g */
        public boolean mo25958g(boolean z, tg4 tg4) {
            if (z) {
                this.f201312f.setVisibility(0);
                String str = tg4.f354435d + "";
                if (tg4.f354435d > 99) {
                    str = this.f201310d.getString(C0966R.string.jsy);
                }
                this.f201312f.setText(str);
                return true;
            }
            this.f201312f.setVisibility(8);
            return true;
        }

        /* renamed from: h */
        public boolean mo25960h(boolean z) {
            if (z) {
                this.f201312f.setVisibility(0);
                this.f201312f.setText(this.f201310d.getString(C0966R.string.f360088a12));
                return true;
            }
            this.f201312f.setVisibility(8);
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

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$l */
    public class C69766l extends C69765k {

        /* renamed from: g */
        public LinearLayout f201313g;

        /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$l$a */
        public class C69767a extends C7089c0 {
            public C69767a() {
            }

            /* renamed from: a */
            public void mo2066a(View view) {
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(5);
                Intent intent = new Intent();
                intent.putExtra("key_from_scene", 1);
                C88144b.m109791i(MallIndexUIv2.this.getContext(), "offline", ".ui.WalletOfflineEntranceUI", intent, (Bundle) null);
                C75136r0.m90122d(9, 0);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(11850, 5, 0);
                nVar.mo160131h(14419, MallIndexUIv2.this.f201188i, 1);
            }
        }

        public C69766l(Context context, View view) {
            super(MallIndexUIv2.this, context, view);
        }

        /* renamed from: a */
        public void mo95986a(View view) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gtv);
            this.f201313g = linearLayout;
            this.f201311e = (ImageView) linearLayout.findViewById(C0966R.C0970id.gtw);
            this.f201312f = (TextView) this.f201313g.findViewById(C0966R.C0970id.gtx);
            this.f201313g.setOnClickListener(new C69767a());
        }

        /* renamed from: e */
        public View mo64133e() {
            return this.f201313g;
        }

        public String getPath() {
            return "pay_receiveorpay";
        }
    }

    /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$m */
    public class C69768m extends C69765k {

        /* renamed from: g */
        public LinearLayout f201316g;

        /* renamed from: h */
        public boolean f201317h = false;

        /* renamed from: com.tencent.mm.plugin.mall.ui.MallIndexUIv2$m$a */
        public class C69769a extends C7089c0 {
            public C69769a() {
            }

            /* renamed from: a */
            public void mo2066a(View view) {
                if (C69768m.this.f201311e.getVisibility() == 0) {
                    C115669n.INSTANCE.mo160131h(25075, 2, 1);
                }
                MallIndexUIv2.m82170a8(MallIndexUIv2.this);
                ((C115627l) ((C109759g) C86312j.m106911c(C109759g.class)).V40()).mo175762a(15);
            }
        }

        public C69768m(Context context, View view) {
            super(MallIndexUIv2.this, context, view);
        }

        /* renamed from: a */
        public void mo95986a(View view) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.gtz);
            this.f201316g = linearLayout;
            MallIndexUIv2.this.f201185f = (TextView) linearLayout.findViewById(C0966R.C0970id.lfm);
            MallIndexUIv2.this.f201286H = (WcPayMoneyLoadingView) this.f201316g.findViewById(C0966R.C0970id.lfn);
            MallIndexUIv2.this.f201287I = (ProgressBar) this.f201316g.findViewById(C0966R.C0970id.lhb);
            MallIndexUIv2.this.f201298y = (RelativeLayout) this.f201316g.findViewById(C0966R.C0970id.lfl);
            if (C76695c.m92341b()) {
                MallIndexUIv2.this.f201185f.setAlpha(1.0f);
                MallIndexUIv2.this.f201286H.setAlpha(1.0f);
            }
            MallIndexUIv2.this.getLifecycle().addObserver(MallIndexUIv2.this.f201286H);
            MallIndexUIv2 mallIndexUIv2 = MallIndexUIv2.this;
            mallIndexUIv2.f201286H.setLoadingPb(mallIndexUIv2.f201287I);
            MallIndexUIv2.this.f201286H.setPrefixSymbol("¥");
            MallIndexUIv2.this.f201286H.setTextColor(-1);
            MallIndexUIv2 mallIndexUIv22 = MallIndexUIv2.this;
            mallIndexUIv22.f201286H.setTextSize((float) C76577a.m92151b(mallIndexUIv22.getContext(), 15));
            this.f201311e = (ImageView) this.f201316g.findViewById(C0966R.C0970id.f358745gu0);
            this.f201312f = (TextView) this.f201316g.findViewById(C0966R.C0970id.f358747gu2);
            this.f201316g.setOnClickListener(new C69769a());
        }

        /* renamed from: e */
        public View mo64133e() {
            return this.f201316g;
        }

        public String getPath() {
            return "wallet";
        }
    }

    public MallIndexUIv2() {
        C40008f fVar = C40008f.f107254d;
        this.f201291M = new IListener<OpenECardFinishEvent>(this, fVar) {
            {
                this.__eventId = 1883130380;
            }

            public boolean callback(IEvent iEvent) {
                OpenECardFinishEvent openECardFinishEvent = (OpenECardFinishEvent) iEvent;
                Log.m105924i("MicorMsg.MallIndexUIv2", "open ecard finish");
                ECardInfo.m5536b((JSONObject) null);
                return false;
            }
        };
        this.f201292N = false;
        this.f201293P = new IListener<WalletRealNameResultNotifyEvent>(fVar) {
            {
                this.__eventId = 323604482;
            }

            public boolean callback(IEvent iEvent) {
                WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent = (WalletRealNameResultNotifyEvent) iEvent;
                Log.m105925i("MicorMsg.MallIndexUIv2", "real name verify callback, result: %s, isDoRealNameForBalance: %s", Integer.valueOf(walletRealNameResultNotifyEvent.f9603d.f9604a), Boolean.valueOf(MallIndexUIv2.this.f201292N));
                if (walletRealNameResultNotifyEvent.f9603d.f9604a == -1) {
                    MallIndexUIv2 mallIndexUIv2 = MallIndexUIv2.this;
                    if (mallIndexUIv2.f201292N) {
                        mallIndexUIv2.f201292N = false;
                        MallIndexUIv2.m82170a8(mallIndexUIv2);
                    }
                }
                return false;
            }
        };
        this.f201294Q = new IListener<WxPayGdprResultEvent>(this, fVar) {
            {
                this.__eventId = -553207673;
            }

            public boolean callback(IEvent iEvent) {
                String str = ((WxPayGdprResultEvent) iEvent).f9615d.f9616a;
                Log.m105925i("MicorMsg.MallIndexUIv2", "get result %s", str);
                if ("agree_privacy".equals(str)) {
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, Boolean.TRUE);
                }
                return false;
            }
        };
        this.f201295R = false;
    }

    /* renamed from: a8 */
    public static void m82170a8(MallIndexUIv2 mallIndexUIv2) {
        mallIndexUIv2.getClass();
        if (C75592q0.m90763K()) {
            Intent intent = new Intent();
            intent.putExtra("key_scene_balance_manager", 2);
            C88144b.m109791i(mallIndexUIv2, "wallet_payu", ".balance.ui.WalletPayUBalanceManagerUI", intent, (Bundle) null);
        } else {
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_main_wallet_kinda_switch, false)) {
                ((C76324c) C86312j.m106911c(C76324c.class)).startUseCase("walletUseCase", ITransmitKvData.create(), new C69802y(mallIndexUIv2));
            } else {
                Intent intent2 = new Intent(mallIndexUIv2.getContext(), MallWalletUI.class);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(mallIndexUIv2, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "handleClickBalanceEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mallIndexUIv2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(mallIndexUIv2, "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "handleClickBalanceEntry", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            ((ImageView) mallIndexUIv2.findViewById(C0966R.C0970id.f358745gu0)).setVisibility(8);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_BOOLEAN_SYNC, Boolean.FALSE);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WALLET_New_MALL_UI_REDDOT_CONFIG_EXPIRETIME_LONG_SYNC, 0L);
            C115669n.INSTANCE.mo160131h(16500, 2);
        }
        C75228t.m90243e0(11, 1);
        C115669n.INSTANCE.mo160131h(14419, mallIndexUIv2.f201188i, 2);
    }

    /* renamed from: J7 */
    public void mo95954J7() {
        removeAllOptionMenu();
        Log.m105924i("MicorMsg.MallIndexUIv2", "addIconOptionMenuByMode");
        addIconOptionMenu(0, (int) C0966R.string.l3c, (int) C0966R.raw.icons_outlined_more, false, (MenuItem.OnMenuItemClickListener) new C4885a());
        C115669n.INSTANCE.mo160131h(14872, 0, 0, "", "", 1);
    }

    /* renamed from: K7 */
    public void mo95955K7() {
        View view = this.f201194r;
        if (view == null) {
            Log.m105924i("MicorMsg.MallIndexUIv2", "header = null");
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0966R.C0970id.euj);
        if (linearLayout == null) {
            Log.m105924i("MicorMsg.MallIndexUIv2", "headerContentLayout = null");
            return;
        }
        if (C76695c.m92341b()) {
            linearLayout.setBackgroundResource(C0966R.C0969drawable.af9);
        }
        Class cls = C78144b.class;
        LinearLayout linearLayout2 = (LinearLayout) this.f201194r.findViewById(C0966R.C0970id.gtz);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
        LinearLayout linearLayout3 = (LinearLayout) this.f201194r.findViewById(C0966R.C0970id.gtv);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout3.getLayoutParams();
        int intValue = ((Integer) ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119992d(C72994y1.C72995a.WALLET_MALL_HEADER_INTERVAL_INT_SYNC, 0)).intValue();
        Log.m105925i("MicorMsg.MallIndexUIv2", "init lastInterval:%s", Integer.valueOf(intValue));
        if (intValue != 0) {
            layoutParams2.leftMargin = intValue;
            layoutParams.rightMargin = intValue;
        }
        int intValue2 = ((Integer) ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119992d(C72994y1.C72995a.WALLET_MALL_HEADER_ITEM_WIDTH_INT_SYNC, 0)).intValue();
        Log.m105925i("MicorMsg.MallIndexUIv2", "init lastWidth:%s", Integer.valueOf(intValue2));
        if (intValue2 != 0) {
            layoutParams2.width = intValue2;
        }
        int intValue3 = ((Integer) ((C78144b) C86312j.m106911c(cls)).mo107980OI().mo119992d(C72994y1.C72995a.WALLET_MALL_HEADER_ITEM_HEIGHT_INT_SYNC, 0)).intValue();
        Log.m105925i("MicorMsg.MallIndexUIv2", "init lastHeight:%s", Integer.valueOf(intValue3));
        if (intValue3 != 0) {
            layoutParams2.height = intValue3;
        }
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout3.setLayoutParams(layoutParams2);
        linearLayout.post(new C69761e(linearLayout));
    }

    /* renamed from: L7 */
    public void mo95956L7() {
        int color = getResources().getColor(C0966R.color.a3o);
        setActionbarColor(color);
        hideActionbarLine();
        findViewById(C0966R.C0970id.iwk).setBackgroundColor(color);
    }

    /* renamed from: M7 */
    public int mo95957M7() {
        return this.f201288J;
    }

    /* renamed from: Q7 */
    public void mo95959Q7() {
        String str = C67345b.m79690d(1).f138779e;
        Log.m105925i("MicorMsg.MallIndexUIv2", "emptyHint: %s", str);
        if (this.f201195s == null) {
            View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.ba_, (ViewGroup) null);
            this.f201195s = inflate;
            this.f201183d.addFooterView(inflate, (Object) null, false);
            TextView textView = (TextView) this.f201195s.findViewById(C0966R.C0970id.gu8);
            C75228t.m90252j(textView, 100);
            textView.setOnClickListener(new C4886h());
        }
        if (Util.isNullOrNil(str)) {
            View view = this.f201195s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f201195s.setPadding(C76577a.m92155f(getContext(), C0966R.dimen.f3736cp), 0, C76577a.m92155f(getContext(), C0966R.dimen.f3736cp), 0);
            return;
        }
        View view3 = this.f201195s;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/mall/ui/MallIndexUIv2", "initFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) this.f201195s.findViewById(C0966R.C0970id.gu8)).setText(str);
        getWindow().getDecorView().post(new C4887i());
    }

    /* renamed from: R7 */
    public boolean mo95960R7() {
        Log.m105924i("MicorMsg.MallIndexUIv2", "init BankcardList");
        WalletGetUserInfoEvent walletGetUserInfoEvent = new WalletGetUserInfoEvent();
        WalletGetUserInfoEvent.C67824a aVar = walletGetUserInfoEvent.f194038d;
        aVar.f194040a = 1;
        aVar.f194041b = true;
        aVar.f194043d = 0;
        aVar.f194042c = true;
        walletGetUserInfoEvent.f194039e.f194055a = new C69799u(this, walletGetUserInfoEvent);
        walletGetUserInfoEvent.asyncPublish(Looper.myLooper());
        return false;
    }

    /* renamed from: S7 */
    public void mo95961S7(View view) {
        Class cls = C109759g.class;
        this.f201284F = new C69766l(this, view);
        ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175770k(this.f201284F);
        C69768m mVar = new C69768m(this, view);
        this.f201285G = mVar;
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
            Log.m105924i("MicorMsg.MallIndexUIv2", "hasRedDot expire, ignore reddot");
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar, bool);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(aVar2, 0L);
            booleanValue = false;
        }
        if (booleanValue) {
            mVar.f201311e.setVisibility(0);
            if (!mVar.f201317h) {
                C115669n.INSTANCE.mo160131h(25075, 2, 0);
                mVar.f201317h = true;
            }
        } else {
            mVar.f201311e.setVisibility(8);
        }
        mVar.mo64136k(C115631n.MMNEWTIPS_SHOWTYPE_REDPOINT, booleanValue);
        ((C115627l) ((C109759g) C86312j.m106911c(cls)).V40()).mo175770k(this.f201285G);
    }

    /* renamed from: T7 */
    public void mo95962T7() {
        View inflate = C85868k2.m106137b(this).inflate(C0966R.C0971layout.ba9, (ViewGroup) null);
        this.f201194r = inflate;
        this.f201183d.addHeaderView(inflate, (Object) null, false);
        mo95955K7();
    }

    /* renamed from: U7 */
    public void mo95963U7() {
        SyncOfflineTokenEvent syncOfflineTokenEvent = new SyncOfflineTokenEvent();
        syncOfflineTokenEvent.f79021d.f79022a = false;
        syncOfflineTokenEvent.publish();
    }

    /* renamed from: V7 */
    public void mo95964V7() {
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_android_more_tab_new_name_cn_config, false);
        Log.m105925i("MicorMsg.MallIndexUIv2", " cn wallet open new name ：%s", Boolean.valueOf(wf));
        if (wf) {
            setMMTitle((int) C0966R.string.lr8);
        } else {
            setMMTitle((int) C0966R.string.gn6);
        }
    }

    /* renamed from: W7 */
    public void mo95965W7() {
        WalletGetBulletinEvent walletGetBulletinEvent = new WalletGetBulletinEvent();
        walletGetBulletinEvent.f79042d.f79044a = "1";
        walletGetBulletinEvent.callback = new C69764j(walletGetBulletinEvent);
        walletGetBulletinEvent.publish();
    }

    /* renamed from: X7 */
    public void mo95966X7() {
    }

    /* renamed from: Y7 */
    public void mo95967Y7() {
        Log.m105924i("MicorMsg.MallIndexUIv2", "updateBalanceNum");
        C67199q0 q0Var = new C67199q0();
        if (q0Var.mo91301a()) {
            this.f201185f.setText((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_RELEAY_NAME_BALANCE_CONTENT_STRING_SYNC, getString(C0966R.string.hsh)));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f201185f.getLayoutParams();
            layoutParams.bottomMargin = C76577a.m92151b(getContext(), 16);
            this.f201185f.setLayoutParams(layoutParams);
            this.f201185f.setVisibility(0);
            this.f201286H.setVisibility(8);
            this.f201287I.setVisibility(8);
            this.f201298y.setVisibility(8);
        } else if (q0Var.mo91304d()) {
            Log.m105924i("MicorMsg.MallIndexUIv2", "show balance amount");
            long longValue = ((Long) ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().mo119992d(C72994y1.C72995a.USERINFO_NEW_BALANCE_LONG_SYNC, 0L)).longValue();
            if (this.f201286H != null) {
                if (q0Var.mo91303c()) {
                    this.f201185f.setText(getString(C0966R.string.ktx));
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f201185f.getLayoutParams();
                    layoutParams2.bottomMargin = C76577a.m92151b(getContext(), 16);
                    this.f201185f.setLayoutParams(layoutParams2);
                    this.f201185f.setVisibility(0);
                    this.f201286H.setVisibility(8);
                    this.f201287I.setVisibility(8);
                    this.f201298y.setVisibility(8);
                    this.f201286H.mo99855d();
                } else {
                    this.f201185f.setVisibility(8);
                    this.f201286H.setVisibility(0);
                    this.f201287I.setVisibility(0);
                    this.f201298y.setVisibility(0);
                }
                if (this.f201286H.getVisibility() == 0) {
                    WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f201286H;
                    wcPayMoneyLoadingView.setMoney(C75228t.m90260n(C75228t.m90248h("" + longValue, "100", 2, RoundingMode.HALF_UP).doubleValue()));
                    return;
                }
                return;
            }
            Log.m105928w("MicorMsg.MallIndexUIv2", "moneyLoadingView is null");
        }
    }

    /* renamed from: b8 */
    public final void mo95981b8(C77619d dVar) {
        if (dVar != null && !Util.isNullOrNil(dVar.f226283a)) {
            if (this.f201280B) {
                TextView textView = this.f201281C;
                if (textView != null) {
                    textView.setText(C0966R.string.f361012gn1);
                    this.f201281C.setOnClickListener(new C69759c(dVar));
                    return;
                }
                return;
            }
            View inflate = View.inflate(this, C0966R.C0971layout.ba7, (ViewGroup) null);
            this.f201279A = inflate;
            inflate.setClickable(false);
            this.f201279A.setEnabled(false);
            TextView textView2 = (TextView) this.f201279A.findViewById(C0966R.C0970id.lje);
            this.f201281C = textView2;
            textView2.setVisibility(0);
            this.f201281C.setText(C0966R.string.f361012gn1);
            this.f201281C.setTextColor(getResources().getColor(C0966R.color.a1d));
            this.f201281C.setOnClickListener(new C69760d(dVar));
            ListView listView = this.f201183d;
            if (listView != null) {
                listView.addFooterView(this.f201279A);
                this.f201280B = true;
            }
        }
    }

    /* renamed from: c8 */
    public final boolean mo95982c8(String str) {
        if (Util.isNullOrNil(str) || this.f201290L) {
            return false;
        }
        Log.m105924i("MicorMsg.MallIndexUIv2", "will show compliance half page");
        if (C72502o.f210909a.mo99911a(str, (C32227p<? super C72502o.C72503a, ? super Long, C13598b0>) null) != null) {
            this.f201290L = true;
        }
        return true;
    }

    public void finish() {
        this.f201296w = true;
        super.finish();
    }

    public void initView() {
        super.initView();
        ListView listView = this.f201183d;
        int i = C69770b.f201320a;
        listView.setPadding(i, 0, i, 0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicorMsg.MallIndexUIv2", "onActivityResult %s %s %s", Integer.valueOf(i), Integer.valueOf(i2), intent);
        super.onActivityResult(i, i2, intent);
        if (i == 3) {
            if (i2 == -1) {
                this.f201299z.mo99789a(intent);
                return;
            }
            C72428s1.C72429a aVar = this.f201299z.f210687g;
            if (aVar != null) {
                aVar.cancel();
            }
        } else if (i == 5) {
            C86709a0.m107528h();
            if (!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MALL_INDEX_GDPR_AGREE_BOOLEAN_SYNC, Boolean.FALSE)).booleanValue()) {
                finish();
            }
        } else if (i == 6) {
            if (intent != null && intent.getIntExtra("is_switch_wallet", 0) == 1) {
                finish();
                RequestEnterWalletEvent requestEnterWalletEvent = new RequestEnterWalletEvent();
                requestEnterWalletEvent.f9428d.f9429a = getContext();
                requestEnterWalletEvent.publish();
            }
        } else if (i != 65281 || i2 != -1) {
        } else {
            if (C75592q0.m90753A()) {
                finish();
                return;
            }
            setResult(-1, intent);
            finish();
            RequestEnterWalletEvent requestEnterWalletEvent2 = new RequestEnterWalletEvent();
            requestEnterWalletEvent2.f9428d.f9429a = getContext();
            requestEnterWalletEvent2.publish();
        }
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        if (26 != Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().add(this);
        ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf().mo91354h(this, (C67213b.C67214b) null);
        ((C119157j) C119157j.f356862d).mo183877h(new C69762f(this), "wxpay_mallindex_refresh_location");
        WalletGetUserInfoEvent.C67825b bVar = new WalletGetUserInfoEvent.C67825b();
        this.f201297x = bVar;
        bVar.f194056b = false;
        bVar.f194057c = true;
        bVar.f194058d = false;
        this.f201291M.alive();
        this.f201294Q.alive();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_PAY_MANAGE_LABEL_LIST_STRING_SYNC, "");
        ArrayList<C0248u> arrayList = new ArrayList<>();
        if (!Util.isNullOrNil(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(C0248u.m207a(optJSONObject));
                    }
                }
            } catch (JSONException e) {
                Log.printErrStackTrace("PayManageLabel", e, "", new Object[0]);
            }
        }
        this.f201289K = arrayList;
        this.f201299z.f210686f = new C69763g();
        C69803z.f201412a = true;
        C69770b.m82208c(this);
        super.onCreate(bundle);
        this.f201293P.alive();
        addSceneEndListener(2713);
        addSceneEndListener(385);
        if (C76850a.m92639k((String) C86709a0.m107535s().mo121142i().mo119684e(274436, (Object) null))) {
            C86709a0.m107528h();
            mo95981b8(new C77619d((String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_MALL_INDEX_GDPR_CACHE_STRING_SYNC, "")));
            doSceneProgress(new C77620f(), false);
        }
        C115669n.INSTANCE.mo160131h(16500, 1);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.MallIndexUI).mo86179qs(this, C76986a.WxPay);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f201299z.getClass();
        ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI().remove(this);
        this.f201291M.dead();
        this.f201294Q.dead();
        removeSceneEndListener(2713);
        removeSceneEndListener(385);
        this.f201293P.dead();
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        if (mStorageEx == ((C78144b) C86312j.m106911c(C78144b.class)).mo107980OI() && i == 4) {
            Log.m105925i("MicorMsg.MallIndexUIv2", "on cache update: %s", obj);
            if (obj.equals("USERINFO_NEW_BALANCE_LONG")) {
                mo95967Y7();
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.f201299z.mo99790b();
        WcPayMoneyLoadingView wcPayMoneyLoadingView = this.f201286H;
        if (wcPayMoneyLoadingView != null) {
            wcPayMoneyLoadingView.mo99855d();
        }
    }

    public void onResume() {
        Log.m105926v("MicorMsg.MallIndexUIv2", "alvinluo MallIndexUI onResume");
        this.f201299z.mo99791c();
        C67213b Jf = ((C28273c) C86312j.m106911c(C28273c.class)).mo55895Jf();
        Jf.mo91357j(this, Jf.mo91358k(), (C67213b.C67215a) null);
        super.onResume();
        mo95967Y7();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        super.onSceneEnd(i, i2, str, yVar);
        if (yVar instanceof C77620f) {
            mo95981b8(((C77620f) yVar).f226284d);
        } else if (yVar instanceof C78342e0) {
            C78342e0 e0Var = (C78342e0) yVar;
            if (e0Var.isJumpRemind()) {
                e0Var.getJumpRemind().mo104782f(this, new C69758b(this));
                return true;
            }
            mo95982c8(e0Var.f229555C);
        }
        return true;
    }
}
