package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.BusiF2fPaySuccEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.tools.C45056f1;
import com.tencent.p014mm.plugin.remittance.model.BusiRemittanceResp;
import com.tencent.p014mm.plugin.remittance.model.C42842h;
import com.tencent.p014mm.plugin.remittance.model.C42845l;
import com.tencent.p014mm.plugin.remittance.model.C57177c0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletSuccPageAwardWidget;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C88989a;
import ob0.C117747y;
import org.json.JSONObject;
import p196ln.C76705f;
import p206nj.C11171e;
import p629ny.C76979h;
import p910lj.C76701a;
import pe3.C89349b;
import t14.C77820c;
import te3.C48725ak;
import te3.C50967qj;
import te3.C52127yk;
import te3.C64344em;
import te3.C64776vl;
import te3.C77925f4;
import te3.C77992rj;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI */
public class RemittanceBusiResultUI extends WalletBaseUI {

    /* renamed from: V0 */
    public static final /* synthetic */ int f204440V0 = 0;

    /* renamed from: A */
    public String f204441A;

    /* renamed from: B */
    public double f204442B;

    /* renamed from: C */
    public String f204443C;

    /* renamed from: D */
    public String f204444D;

    /* renamed from: E */
    public int f204445E;

    /* renamed from: F */
    public int f204446F;

    /* renamed from: G */
    public String f204447G;

    /* renamed from: H */
    public String f204448H;

    /* renamed from: I */
    public String f204449I;

    /* renamed from: J */
    public boolean f204450J = false;

    /* renamed from: K */
    public String f204451K;

    /* renamed from: L */
    public BusiRemittanceResp f204452L;

    /* renamed from: M */
    public C77992rj f204453M;

    /* renamed from: N */
    public int f204454N;

    /* renamed from: P */
    public boolean f204455P = false;

    /* renamed from: Q */
    public ResultReceiver f204456Q;

    /* renamed from: Q0 */
    public boolean f204457Q0 = false;

    /* renamed from: R */
    public LinearLayout f204458R;

    /* renamed from: R0 */
    public String f204459R0;

    /* renamed from: S */
    public LinearLayout f204460S;

    /* renamed from: S0 */
    public IListener<WalletPayResultEvent> f204461S0 = new IListener<WalletPayResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 520089918;
        }

        public boolean callback(IEvent iEvent) {
            Log.m105924i("MicroMsg.RemittanceBusiResultUI", "receive pay result event, do finish");
            int i = ((WalletPayResultEvent) iEvent).f194085d.f194087b;
            if (i != 1000 && i != 1001) {
                return false;
            }
            RemittanceBusiResultUI.this.finish();
            return false;
        }
    };

    /* renamed from: T */
    public Runnable f204462T = new C70648a();

    /* renamed from: T0 */
    public boolean f204463T0 = true;

    /* renamed from: U */
    public C77925f4 f204464U = new C77925f4();

    /* renamed from: U0 */
    public Runnable f204465U0 = new C70653f();

    /* renamed from: V */
    public C64776vl f204466V = new C64776vl();

    /* renamed from: W */
    public int f204467W;

    /* renamed from: X */
    public String f204468X;

    /* renamed from: Y */
    public C77820c f204469Y;

    /* renamed from: Z */
    public WalletSuccPageAwardWidget f204470Z;

    /* renamed from: d */
    public TextView f204471d;

    /* renamed from: e */
    public TextView f204472e;

    /* renamed from: f */
    public TextView f204473f;

    /* renamed from: g */
    public TextView f204474g;

    /* renamed from: h */
    public TextView f204475h;

    /* renamed from: i */
    public TextView f204476i;

    /* renamed from: j */
    public CdnImageView f204477j;

    /* renamed from: n */
    public TextView f204478n;

    /* renamed from: o */
    public TextView f204479o;

    /* renamed from: p */
    public Button f204480p;

    /* renamed from: p0 */
    public ViewGroup f204481p0;

    /* renamed from: q */
    public Button f204482q;

    /* renamed from: r */
    public ViewGroup f204483r;

    /* renamed from: s */
    public ViewGroup f204484s;

    /* renamed from: t */
    public ViewGroup f204485t;

    /* renamed from: u */
    public ViewGroup f204486u;

    /* renamed from: v */
    public View f204487v;

    /* renamed from: w */
    public LinearLayout f204488w;

    /* renamed from: x */
    public String f204489x;

    /* renamed from: x0 */
    public ViewGroup f204490x0;

    /* renamed from: y */
    public String f204491y;

    /* renamed from: y0 */
    public ViewGroup f204492y0;

    /* renamed from: z */
    public String f204493z;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI$a */
    public class C70648a implements Runnable {
        public C70648a() {
        }

        public void run() {
            RemittanceBusiResultUI remittanceBusiResultUI = RemittanceBusiResultUI.this;
            if (remittanceBusiResultUI.f204446F == 65) {
                Log.m105924i("MicroMsg.RemittanceBusiResultUI", "mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS,do not doNetSceneBusiF2fSucpage");
                return;
            }
            int i = remittanceBusiResultUI.f204454N + 1;
            remittanceBusiResultUI.f204454N = i;
            RemittanceBusiResultUI.this.doSceneProgress(new C42845l(remittanceBusiResultUI.f204464U, remittanceBusiResultUI.f204447G, remittanceBusiResultUI.f204453M.f228169d, i - 1, System.currentTimeMillis()));
            RemittanceBusiResultUI remittanceBusiResultUI2 = RemittanceBusiResultUI.this;
            Log.m105925i("MicroMsg.RemittanceBusiResultUI", "retryFetchData() mRetryTime:%s mBusiF2FFaultConfig.succpage_retry_waiting_ms", Integer.valueOf(remittanceBusiResultUI2.f204454N), Integer.valueOf(remittanceBusiResultUI2.f204453M.f228172g));
            C77992rj rjVar = remittanceBusiResultUI2.f204453M;
            if (rjVar.f228171f > remittanceBusiResultUI2.f204454N) {
                MMHandlerThread.postToMainThreadDelayed(remittanceBusiResultUI2.f204462T, (long) rjVar.f228172g);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI$b */
    public class C70649b implements View.OnClickListener {
        public C70649b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (RemittanceBusiResultUI.this.f204445E == 56) {
                C115669n.INSTANCE.mo160131h(19821, 10, RemittanceBusiResultUI.this.f204459R0, 0);
            }
            RemittanceBusiResultUI remittanceBusiResultUI = RemittanceBusiResultUI.this;
            if (remittanceBusiResultUI.f204446F == 65 && remittanceBusiResultUI.f204456Q != null) {
                Log.m105924i("MicroMsg.RemittanceBusiResultUI", "mFinishBtn mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS");
                RemittanceBusiResultUI.this.f204456Q.send(-1, (Bundle) null);
            }
            if (RemittanceBusiResultUI.this.f204445E == 71) {
                new BusiF2fPaySuccEvent().publish();
            }
            RemittanceBusiResultUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI$c */
    public class C70650c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ImageView f204497d;

        /* renamed from: e */
        public final /* synthetic */ ViewGroup f204498e;

        public C70650c(RemittanceBusiResultUI remittanceBusiResultUI, ImageView imageView, ViewGroup viewGroup) {
            this.f204497d = imageView;
            this.f204498e = viewGroup;
        }

        public void run() {
            ViewGroup.LayoutParams layoutParams = this.f204497d.getLayoutParams();
            ViewGroup viewGroup = this.f204498e;
            if (viewGroup != null) {
                layoutParams.width = viewGroup.getWidth();
                layoutParams.height = this.f204498e.getHeight();
                this.f204497d.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI$d */
    public class C70651d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f204499d;

        public C70651d(View view) {
            this.f204499d = view;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (RemittanceBusiResultUI.this.f204463T0) {
                View view2 = this.f204499d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                RemittanceBusiResultUI.this.f204481p0.setVisibility(0);
                RemittanceBusiResultUI remittanceBusiResultUI = RemittanceBusiResultUI.this;
                remittanceBusiResultUI.mo97307M7(remittanceBusiResultUI.f204490x0);
            } else {
                View view4 = this.f204499d;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$6", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                RemittanceBusiResultUI.this.f204481p0.setVisibility(8);
                RemittanceBusiResultUI.this.mo97307M7(this.f204499d);
            }
            RemittanceBusiResultUI remittanceBusiResultUI2 = RemittanceBusiResultUI.this;
            remittanceBusiResultUI2.f204463T0 = !remittanceBusiResultUI2.f204463T0;
            C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI$e */
    public class C70652e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f204501d;

        public C70652e(View view) {
            this.f204501d = view;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (RemittanceBusiResultUI.this.f204463T0) {
                View view2 = this.f204501d;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                RemittanceBusiResultUI.this.f204481p0.setVisibility(0);
                RemittanceBusiResultUI remittanceBusiResultUI = RemittanceBusiResultUI.this;
                remittanceBusiResultUI.mo97307M7(remittanceBusiResultUI.f204490x0);
            } else {
                View view4 = this.f204501d;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(0);
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                RemittanceBusiResultUI.this.f204481p0.setVisibility(8);
                RemittanceBusiResultUI.this.mo97307M7(this.f204501d);
            }
            RemittanceBusiResultUI remittanceBusiResultUI2 = RemittanceBusiResultUI.this;
            remittanceBusiResultUI2.f204463T0 = !remittanceBusiResultUI2.f204463T0;
            C117292a.m165361g(this, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceBusiResultUI$f */
    public class C70653f implements Runnable {
        public C70653f() {
        }

        public void run() {
            RemittanceBusiResultUI remittanceBusiResultUI = RemittanceBusiResultUI.this;
            int i = RemittanceBusiResultUI.f204440V0;
            remittanceBusiResultUI.mo97305K7((C42845l) null);
        }
    }

    /* renamed from: H7 */
    public final boolean mo97302H7(View view) {
        return view == null || view.getVisibility() == 8;
    }

    /* renamed from: I7 */
    public final void mo97303I7() {
        if (WalletSuccPageAwardWidget.m84798e(this.f204469Y)) {
            Log.m105925i("MicroMsg.RemittanceBusiResultUI", "setAwardWidget, mTransId: %s", this.f204444D);
            this.f204470Z.mo99841n(this, this.f204469Y, this.f204444D, true, (ImageView) findViewById(C0966R.C0970id.a3a));
            this.f204470Z.mo99834g();
            this.f204470Z.setVisibility(0);
            ImageView imageView = (ImageView) findViewById(C0966R.C0970id.a3a);
            imageView.post(new C70650c(this, imageView, (ViewGroup) findViewById(C0966R.C0970id.j4c)));
            mo97307M7(this.f204470Z);
            return;
        }
        this.f204470Z.setVisibility(8);
    }

    /* renamed from: J7 */
    public final void mo97304J7(C42845l lVar) {
        C48725ak akVar;
        String str;
        C42845l lVar2 = lVar;
        this.f204490x0.setVisibility(8);
        this.f204481p0.setVisibility(8);
        this.f204492y0.setVisibility(8);
        TextView textView = (TextView) findViewById(C0966R.C0970id.kss);
        View findViewById = findViewById(C0966R.C0970id.kst);
        if (lVar2 != null && (akVar = lVar2.f116027e) != null && akVar.f130577i.size() > 0) {
            LinkedList<String> linkedList = lVar2.f116027e.f130577i;
            Object[] objArr = new Object[3];
            objArr[0] = linkedList;
            objArr[1] = Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            objArr[2] = Long.valueOf(lVar2.f116027e.f130576h);
            Log.m105925i("MicroMsg.RemittanceBusiResultUI", "discountInfoList: %s, size: %s received_amount: %s", objArr);
            int size = linkedList.size();
            if (linkedList.size() > 0) {
                this.f204490x0.removeAllViews();
                this.f204481p0.setOnClickListener((View.OnClickListener) null);
                if (size > 1) {
                    str = lVar2.f116027e.f130580o;
                    this.f204463T0 = true;
                    findViewById.setOnClickListener(new C70651d(findViewById));
                    this.f204481p0.setOnClickListener(new C70652e(findViewById));
                } else {
                    str = "";
                }
                if (size == 1 && linkedList.get(0) != null) {
                    str = linkedList.get(0);
                }
                for (int i = 0; i < linkedList.size(); i++) {
                    TextView textView2 = new TextView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.bottomMargin = C76577a.m92151b(this, 6);
                    textView2.setLayoutParams(layoutParams);
                    textView2.setTextSize(1, 12.0f);
                    textView2.setTextColor(getResources().getColor(C0966R.color.f2960ag));
                    textView2.setText(linkedList.get(i));
                    this.f204490x0.addView(textView2);
                }
                this.f204490x0.setVisibility(0);
                this.f204481p0.setVisibility(0);
            } else {
                str = "";
            }
            if (this.f204463T0) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                String nullAs = Util.nullAs(str, "");
                SpannableString spannableString = new SpannableString(nullAs + " ");
                if (size > 1) {
                    View findViewById2 = findViewById(C0966R.C0970id.ksu);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view2 = findViewById2;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    View findViewById3 = findViewById(C0966R.C0970id.ksu);
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view3 = findViewById3;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setDiscountInfo", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                textView.setText(spannableString);
                this.f204481p0.setVisibility(8);
            }
        }
    }

    /* renamed from: K7 */
    public final void mo97305K7(C42845l lVar) {
        String str;
        C42845l lVar2 = lVar;
        Class cls = C76705f.class;
        this.f204488w.removeAllViews();
        BusiRemittanceResp busiRemittanceResp = this.f204452L;
        if (busiRemittanceResp != null && !Util.isNullOrNil(busiRemittanceResp.f204054s)) {
            str = this.f204452L.f204054s;
        } else if (!Util.isNullOrNil(this.f204489x)) {
            str = C75228t.m90277z(this.f204489x, 6);
            if (!Util.isNullOrNil(this.f204451K)) {
                str = getString(C0966R.string.i0b, new Object[]{str, this.f204451K});
            }
        } else {
            str = C75228t.m90277z(C75228t.m90268r(this.f204441A), 6);
            if (!Util.isNullOrNil(this.f204451K)) {
                str = getString(C0966R.string.i0b, new Object[]{str, this.f204451K});
            }
        }
        if (!mo97302H7(this.f204483r) || !mo97302H7(this.f204484s) || !mo97302H7(this.f204492y0) || !mo97302H7(this.f204485t) || !mo97302H7(this.f204486u) || WalletSuccPageAwardWidget.m84798e(this.f204469Y) || !mo97302H7(findViewById(C0966R.C0970id.kst)) || !mo97302H7(this.f204481p0)) {
            this.f204488w.addView((ViewGroup) getLayoutInflater().inflate(C0966R.C0971layout.brf, this.f204488w, false));
            CdnImageView cdnImageView = (CdnImageView) findViewById(C0966R.C0970id.ils);
            View findViewById = findViewById(C0966R.C0970id.fkt);
            TextView textView = (TextView) findViewById(C0966R.C0970id.id4);
            ((TextView) findViewById(C0966R.C0970id.id5)).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, str));
            cdnImageView.setVisibility(0);
            if (!Util.isNullOrNil(this.f204468X)) {
                if (this.f204467W == 1) {
                    cdnImageView.setRoundCorner(true);
                }
                cdnImageView.setUrl(this.f204468X);
            } else if (this.f204467W == 1) {
                ((C76705f) C86312j.m106911c(cls)).mo106822J5(cdnImageView, this.f204441A);
            } else {
                ((C76705f) C86312j.m106911c(cls)).mo106849z(cdnImageView, this.f204441A);
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            TextView textView2 = textView;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(8);
            if (lVar2 != null) {
                if (lVar2.f116027e.f130579n == 1) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view2 = findViewById;
                    C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    textView2.setVisibility(0);
                    textView2.setText(C75228t.m90256l(((double) lVar2.f116027e.f130576h) / 100.0d));
                } else {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(8);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setF2fAvatarNameImp", "(Lcom/tencent/mm/plugin/remittance/model/NetSceneBusiF2fSucpage;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    textView2.setVisibility(8);
                }
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(C0966R.C0971layout.a5c, this.f204488w, false);
            this.f204488w.addView(viewGroup);
            CdnImageView cdnImageView2 = (CdnImageView) viewGroup.findViewById(C0966R.C0970id.ils);
            TextView textView3 = (TextView) viewGroup.findViewById(C0966R.C0970id.id5);
            if (!Util.isNullOrNil(this.f204468X)) {
                if (this.f204467W == 1) {
                    cdnImageView2.setRoundCorner(true);
                }
                cdnImageView2.setUrl(this.f204468X);
            } else if (this.f204467W == 1) {
                ((C76705f) C86312j.m106911c(cls)).mo106822J5(cdnImageView2, this.f204441A);
            } else {
                ((C76705f) C86312j.m106911c(cls)).mo106849z(cdnImageView2, this.f204441A);
            }
            textView3.setText(str);
        }
        mo97307M7(this.f204488w);
    }

    /* renamed from: L7 */
    public final void mo97306L7(C42845l lVar) {
        if (!Util.isNullOrNil(lVar.f116027e.f130581p)) {
            if (Util.isNullOrNil(lVar.f116027e.f130582q)) {
                this.f204476i.setTextColor(getResources().getColor(C0966R.color.a7b));
            } else {
                this.f204476i.setTextColor(C43423i0.m46931b(lVar.f116027e.f130582q, true));
            }
            this.f204476i.setText(lVar.f116027e.f130581p);
            this.f204485t.setVisibility(0);
            return;
        }
        this.f204485t.setVisibility(8);
    }

    /* renamed from: M7 */
    public final void mo97307M7(View view) {
        C45056f1.m49909b(this, (ScrollView) findViewById(C0966R.C0970id.j4c), findViewById(C0966R.C0970id.ano), findViewById(C0966R.C0970id.f5834px), findViewById(C0966R.C0970id.agw), 32, 0.0f, true);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void finish() {
        Log.m105925i("MicroMsg.RemittanceBusiResultUI", "finish this %s %s", this, Util.getStack());
        if (!this.f204457Q0) {
            super.finish();
            this.f204457Q0 = true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.brg;
    }

    public void initView() {
        this.f204471d = (TextView) findViewById(C0966R.C0970id.id6);
        this.f204472e = (TextView) findViewById(C0966R.C0970id.icw);
        this.f204473f = (TextView) findViewById(C0966R.C0970id.icx);
        this.f204474g = (TextView) findViewById(C0966R.C0970id.f359009id3);
        this.f204475h = (TextView) findViewById(C0966R.C0970id.icz);
        this.f204476i = (TextView) findViewById(C0966R.C0970id.f359007id1);
        this.f204483r = (LinearLayout) findViewById(C0966R.C0970id.f359008id2);
        this.f204484s = (LinearLayout) findViewById(C0966R.C0970id.icy);
        this.f204485t = (LinearLayout) findViewById(C0966R.C0970id.f359006id0);
        this.f204477j = (CdnImageView) findViewById(C0966R.C0970id.icr);
        this.f204478n = (TextView) findViewById(C0966R.C0970id.ict);
        this.f204479o = (TextView) findViewById(C0966R.C0970id.ics);
        this.f204480p = (Button) findViewById(C0966R.C0970id.icp);
        this.f204486u = (ViewGroup) findViewById(C0966R.C0970id.icq);
        this.f204482q = (Button) findViewById(C0966R.C0970id.icu);
        this.f204487v = findViewById(C0966R.C0970id.jmg);
        this.f204488w = (LinearLayout) findViewById(C0966R.C0970id.ilh);
        this.f204458R = (LinearLayout) findViewById(C0966R.C0970id.cos);
        this.f204460S = (LinearLayout) findViewById(C0966R.C0970id.icv);
        C85875k4.m106189j0(((TextView) findViewById(C0966R.C0970id.hsb)).getPaint(), 0.8f);
        this.f204472e.setText(C75228t.m90260n(this.f204442B));
        this.f204472e.setTextSize(1, 48.0f);
        this.f204473f.setTextSize(1, 48.0f);
        MMHandlerThread.postToMainThreadDelayed(this.f204465U0, 500);
        if (!Util.isNullOrNil(this.f204491y)) {
            this.f204474g.setText(this.f204491y);
            this.f204483r.setVisibility(0);
        } else {
            this.f204483r.setVisibility(8);
        }
        if (!Util.isNullOrNil(this.f204493z)) {
            this.f204475h.setText(this.f204493z);
            this.f204484s.setVisibility(0);
        } else {
            this.f204484s.setVisibility(8);
        }
        this.f204482q.setOnClickListener(new C70649b());
        this.f204470Z = (WalletSuccPageAwardWidget) findViewById(C0966R.C0970id.a2p);
        this.f204481p0 = (ViewGroup) findViewById(C0966R.C0970id.c7d);
        this.f204490x0 = (ViewGroup) findViewById(C0966R.C0970id.c7b);
        this.f204492y0 = (ViewGroup) findViewById(C0966R.C0970id.hp4);
        TextView textView = (TextView) findViewById(C0966R.C0970id.hoy);
    }

    public void onBackPressed() {
        Log.m105924i("MicroMsg.RemittanceBusiResultUI", "onBackPressed()");
        if (this.f204446F == 65 && this.f204456Q != null) {
            Log.m105924i("MicroMsg.RemittanceBusiResultUI", "mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS");
            this.f204456Q.send(-1, (Bundle) null);
        } else if (this.f204445E == 71) {
            new BusiF2fPaySuccEvent().publish();
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addSceneEndListener(1537);
        addSceneEndListener(1680);
        addSceneEndListener(2504);
        addSceneEndListener(4587);
        this.f204461S0.alive();
        if (C11171e.m11046c(21)) {
            if (C11171e.m11046c(23)) {
                getWindow().setStatusBarColor(getContext().getResources().getColor(C0966R.color.al6));
            } else {
                getWindow().setStatusBarColor(getContext().getResources().getColor(C0966R.color.BW_93));
            }
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
        setBackBtn((MenuItem.OnMenuItemClickListener) null);
        showHomeBtn(false);
        enableBackMenu(false);
        this.f204489x = getIntent().getStringExtra("key_mch_name");
        this.f204452L = (BusiRemittanceResp) getIntent().getParcelableExtra("BusiRemittanceResp");
        this.f204442B = getIntent().getDoubleExtra("key_money", 0.0d);
        this.f204441A = getIntent().getStringExtra("key_rcver_name");
        this.f204451K = getIntent().getStringExtra("key_rcver_true_name");
        this.f204491y = getIntent().getStringExtra("key_rcv_desc");
        this.f204493z = getIntent().getStringExtra("key_pay_desc");
        this.f204443C = getIntent().getStringExtra("key_f2f_id");
        this.f204444D = getIntent().getStringExtra("key_trans_id");
        this.f204448H = getIntent().getStringExtra("key_rcvr_open_id");
        this.f204449I = getIntent().getStringExtra("key_check_sign");
        getIntent().getStringExtra("key_pay_desc");
        getIntent().getStringExtra("key_rcv_desc");
        getIntent().getIntExtra("key_scan_sceen", 0);
        this.f204445E = getIntent().getIntExtra("key_channel", 0);
        this.f204447G = getIntent().getStringExtra("key_succ_page_extend");
        String stringExtra = getIntent().getStringExtra("key_succ_fault_config");
        C77992rj rjVar = new C77992rj();
        try {
            JSONObject jSONObject = new JSONObject(stringExtra);
            rjVar.f228169d = jSONObject.optInt("flag");
            rjVar.f228170e = jSONObject.optInt("succpage_first_delay_ms");
            rjVar.f228171f = jSONObject.optInt("succpage_max_retry_cnt");
            rjVar.f228172g = jSONObject.optInt("succpage_retry_waiting_ms");
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NetSceneBusiF2fPlaceOrder", "createBusiF2FFaultConfigFromJSONObject() Exception: %s", e.getMessage());
        }
        this.f204453M = rjVar;
        this.f204456Q = (ResultReceiver) getIntent().getParcelableExtra("key_open_result_receiver");
        int intExtra = getIntent().getIntExtra("pay_scene", 0);
        this.f204446F = intExtra;
        Log.m105925i("MicroMsg.RemittanceBusiResultUI", "mPayScene:%s", Integer.valueOf(intExtra));
        if (this.f204446F == 65) {
            try {
                this.f204466V.parseFrom(getIntent().getByteArrayExtra("AfterPlaceOrderCommReqC2C"));
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.RemittanceBusiResultUI", e2, "parse reqC2C failed", new Object[0]);
            }
        } else {
            try {
                this.f204464U.parseFrom(getIntent().getByteArrayExtra("AfterPlaceOrderCommReq"));
            } catch (Exception e3) {
                Log.printErrStackTrace("MicroMsg.RemittanceBusiResultUI", e3, "parse req failed", new Object[0]);
            }
        }
        this.f204467W = getIntent().getIntExtra("key_succ_show_avatar_type", 0);
        getIntent().getIntExtra("key_succ_show_avatar_show", 0);
        this.f204468X = getIntent().getStringExtra("key_succ_show_avatar_url");
        this.f204459R0 = getIntent().getStringExtra("app_id");
        this.f204450J = false;
        Log.m105924i("MicroMsg.RemittanceBusiResultUI", "fetch data");
        if (this.f204446F == 65) {
            Log.m105924i("MicroMsg.RemittanceBusiResultUI", "mPayScene == WalletConstantsProtocal.MMPAY_PAY_SCENE_PERSONAL_PAYMENT_PROCESS，do NetSceneC2CSuccPage");
            doSceneProgress(new C57177c0(this.f204466V));
        } else {
            Log.m105925i("MicroMsg.RemittanceBusiResultUI", "fetchData() mBusiF2FFaultConfig.flag:%s mBusiF2FFaultConfig.succpage_first_delay_ms:%s", Integer.valueOf(this.f204453M.f228169d), Integer.valueOf(this.f204453M.f228170e));
            if (Util.isEqual(this.f204453M.f228169d, 1)) {
                MMHandlerThread.postToMainThreadDelayed(this.f204462T, (long) this.f204453M.f228170e);
            } else {
                doSceneProgress(new C42845l(this.f204464U, this.f204447G, 0, 0, 0));
            }
        }
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1537);
        removeSceneEndListener(1680);
        removeSceneEndListener(2504);
        removeSceneEndListener(4587);
        this.f204461S0.dead();
        if (this.f204469Y != null) {
            this.f204470Z.mo99837j();
        }
        MMHandlerThread.removeRunnable(this.f204465U0);
    }

    public void onResume() {
        super.onResume();
        if (this.f204450J) {
            Log.m105924i("MicroMsg.RemittanceBusiResultUI", "do act qry");
            doSceneProgress(new C42842h(this.f204443C, this.f204444D, this.f204448H, (int) Math.round(this.f204442B * 100.0d), (C89349b) null, this.f204449I), false);
            this.f204450J = false;
        }
        if (this.f204469Y != null) {
            this.f204470Z.mo99838k();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        C117747y yVar2 = yVar;
        Log.m105924i("MicroMsg.RemittanceBusiResultUI", "errType:" + i3 + " errCode:" + i4 + " errMsg:" + str2 + " scenetype:" + yVar.getType());
        if (yVar2 instanceof C42845l) {
            C42845l lVar = (C42845l) yVar2;
            if (i3 == 0 && i4 == 0) {
                boolean z = this.f204455P;
                if (z) {
                    Log.m105925i("MicroMsg.RemittanceBusiResultUI", "NetSceneBusiF2fSucpage success(mIfSuccNetSceneBusiF2fSucpage:%s)", Boolean.valueOf(z));
                } else {
                    int i5 = lVar.f116027e.f130572d;
                    if (i5 == 0) {
                        this.f204455P = true;
                        MMHandlerThread.removeRunnable(this.f204462T);
                        Log.m105925i("MicroMsg.RemittanceBusiResultUI", "exposure info: %s", lVar.f116027e.f130575g);
                        this.f204469Y = lVar.f116027e.f130575g;
                        mo97303I7();
                        mo97304J7(lVar);
                        MMHandlerThread.removeRunnable(this.f204465U0);
                        mo97306L7(lVar);
                        mo97305K7(lVar);
                    } else {
                        C48725ak akVar = lVar.f116027e;
                        Log.m105921e("MicroMsg.RemittanceBusiResultUI", "result response: %s, %s, %s", Integer.valueOf(i5), akVar.f130573e, Boolean.valueOf(akVar.f130583r));
                        if (!lVar.f116027e.f130583r) {
                            this.f204455P = true;
                            MMHandlerThread.removeRunnable(this.f204462T);
                        }
                    }
                }
            } else {
                Log.m105921e("MicroMsg.RemittanceBusiResultUI", "net error: %s", lVar);
            }
        } else if (yVar2 instanceof C57177c0) {
            Log.m105924i("MicroMsg.RemittanceBusiResultUI", "scene instanceof NetSceneC2CSuccPage");
            if (i3 == 0 && i4 == 0) {
                boolean z2 = this.f204455P;
                if (z2) {
                    Log.m105925i("MicroMsg.RemittanceBusiResultUI", "NetSceneBusiF2fSucpage success(mIfSuccNetSceneBusiF2fSucpage:%s)", Boolean.valueOf(z2));
                } else {
                    C64344em emVar = ((C57177c0) yVar2).f163878f;
                    if (emVar == null) {
                        emVar = new C64344em();
                    }
                    C42845l lVar2 = new C42845l();
                    C48725ak akVar2 = new C48725ak();
                    lVar2.f116027e = akVar2;
                    int i6 = emVar.f182995d;
                    akVar2.f130572d = i6;
                    akVar2.f130573e = emVar.f182996e;
                    akVar2.f130575g = emVar.f182997f;
                    akVar2.f130576h = emVar.f182998g;
                    akVar2.f130579n = emVar.f182999h;
                    akVar2.f130577i = emVar.f183000i;
                    akVar2.f130578j = emVar.f183001j;
                    akVar2.f130580o = emVar.f183002n;
                    akVar2.f130581p = emVar.f183003o;
                    akVar2.f130582q = emVar.f183004p;
                    if (i6 == 0) {
                        this.f204455P = true;
                        MMHandlerThread.removeRunnable(this.f204462T);
                        Log.m105925i("MicroMsg.RemittanceBusiResultUI", "exposure info: %s", lVar2.f116027e.f130575g);
                        this.f204469Y = lVar2.f116027e.f130575g;
                        mo97303I7();
                        mo97304J7(lVar2);
                        MMHandlerThread.removeRunnable(this.f204465U0);
                        mo97306L7(lVar2);
                        this.f204488w.removeAllViews();
                        Log.m105925i("MicroMsg.RemittanceBusiResultUI", "setF2fAvatarNameImpC2C: name：%s，money：%s，photourl：%s", this.f204441A, Double.valueOf(this.f204442B), this.f204468X);
                        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(C0966R.C0971layout.a5c, this.f204488w, false);
                        this.f204488w.addView(viewGroup);
                        ((TextView) viewGroup.findViewById(C0966R.C0970id.id5)).setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, this.f204441A));
                        CdnImageView cdnImageView = (CdnImageView) viewGroup.findViewById(C0966R.C0970id.ils);
                        if (!Util.isNullOrNil(this.f204468X)) {
                            cdnImageView.setRoundCorner(true);
                            cdnImageView.setRoundCornerRate(0.1f);
                            cdnImageView.setUrl(this.f204468X);
                        } else {
                            cdnImageView.setVisibility(8);
                        }
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f204458R.getLayoutParams();
                        layoutParams.topMargin = C76577a.m92151b(getContext(), 48);
                        this.f204458R.setLayoutParams(layoutParams);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f204460S.getLayoutParams();
                        layoutParams2.topMargin = C76577a.m92151b(getContext(), 0);
                        this.f204460S.setLayoutParams(layoutParams2);
                        this.f204471d.setVisibility(8);
                        mo97307M7(this.f204488w);
                    } else {
                        C48725ak akVar3 = lVar2.f116027e;
                        Log.m105921e("MicroMsg.RemittanceBusiResultUI", "result response: %s, %s, %s", Integer.valueOf(i6), akVar3.f130573e, Boolean.valueOf(akVar3.f130583r));
                        if (!lVar2.f116027e.f130583r) {
                            this.f204455P = true;
                            MMHandlerThread.removeRunnable(this.f204462T);
                        }
                    }
                }
            } else {
                C76701a.makeText((Context) this, (int) C0966R.string.krp, 1).show();
                Log.m105920e("MicroMsg.RemittanceBusiResultUI", "NetSceneC2CSuccPage net error");
            }
        } else if (yVar2 instanceof C42842h) {
            C42842h hVar = (C42842h) yVar2;
            if (i3 == 0 && i4 == 0) {
                C50967qj qjVar = hVar.f116021e;
                int i7 = qjVar.f140341d;
                if (i7 == 0) {
                    C52127yk ykVar = qjVar.f140343f;
                    if (ykVar != null) {
                        this.f204477j.setUrl(ykVar.f145332f);
                        this.f204478n.setText(ykVar.f145333g);
                        this.f204479o.setText(ykVar.f145334h);
                        this.f204480p.setText(ykVar.f145331e);
                        this.f204480p.setOnClickListener(new C42871g0(this, ykVar));
                        this.f204480p.setBackgroundResource(C0966R.C0969drawable.aos);
                        this.f204480p.setTextColor(getResources().getColor(C0966R.color.ala));
                        this.f204486u.setVisibility(0);
                        mo97307M7(this.f204486u);
                    } else {
                        Log.m105924i("MicroMsg.RemittanceBusiResultUI", "app info is null");
                        this.f204486u.setVisibility(8);
                    }
                } else {
                    Log.m105921e("MicroMsg.RemittanceBusiResultUI", "qry response: %s, %s", Integer.valueOf(i7), hVar.f116021e.f140342e);
                    C76701a.makeText((Context) this, (CharSequence) hVar.f116021e.f140342e, 1).show();
                }
            } else {
                Log.m105921e("MicroMsg.RemittanceBusiResultUI", "net error: %s", hVar);
            }
        }
        boolean l = this.f204469Y != null ? this.f204470Z.mo99839l(i3, i4, str2, yVar2) : false;
        View view = this.f204487v;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return l;
    }

    public void setContentViewVisibility(int i) {
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/remittance/ui/RemittanceBusiResultUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
