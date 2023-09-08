package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CardOfflinePayFinishButtonEvent;
import com.tencent.p014mm.autogen.events.ChangePayActivityViewEvent;
import com.tencent.p014mm.autogen.events.FuckOfflinePayResultEvent;
import com.tencent.p014mm.autogen.events.JsapiResultEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.events.WalletOfflineRealNameNotifyEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.WCPayJSAPIPayCallbackManageStruct;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.Orders;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletSuccPageAwardWidget;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.plugin.wallet_core.utils.C72517z;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75119h0;
import com.tencent.p014mm.wallet_core.model.C75136r0;
import com.tencent.p014mm.wallet_core.model.C75155x0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import id2.C76313t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import ob0.C89137b0;
import org.json.JSONObject;
import p206nj.C11171e;
import p281yz.C79173v;
import p910lj.C76701a;
import st1.C77781t;
import t14.C77820c;
import t14.C77821d;
import te3.C48875bl3;
import te3.C49477fv1;
import te3.C51042r1;
import ul0.C90694b;
import v53.C52763a;
import v53.C52764b;
import v53.C52765c;
import v53.C52774n;
import v53.C52777q;
import v53.C78342e0;
import v53.C78344g0;
import v53.C78353t;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI */
public class WalletOrderInfoNewUI extends WalletOrderInfoUI {

    /* renamed from: w1 */
    public static final /* synthetic */ int f210081w1 = 0;

    /* renamed from: A */
    public TextView f210082A;

    /* renamed from: B */
    public TextView f210083B;

    /* renamed from: C */
    public TextView f210084C;

    /* renamed from: D */
    public WalletTextView f210085D;

    /* renamed from: E */
    public TextView f210086E;

    /* renamed from: F */
    public Button f210087F;

    /* renamed from: G */
    public LinearLayout f210088G;

    /* renamed from: H */
    public ViewGroup f210089H;

    /* renamed from: I */
    public ViewGroup f210090I;

    /* renamed from: J */
    public ViewGroup f210091J;

    /* renamed from: K */
    public ViewGroup f210092K;

    /* renamed from: L */
    public ViewGroup f210093L;

    /* renamed from: M */
    public ViewGroup f210094M;

    /* renamed from: N */
    public ViewGroup f210095N;

    /* renamed from: P */
    public ViewGroup f210096P;

    /* renamed from: Q */
    public ViewGroup f210097Q;

    /* renamed from: Q0 */
    public RelativeLayout f210098Q0;

    /* renamed from: R */
    public ViewGroup f210099R;

    /* renamed from: R0 */
    public LinearLayout f210100R0;

    /* renamed from: S */
    public CdnImageView f210101S;

    /* renamed from: S0 */
    public CdnImageView f210102S0;

    /* renamed from: T */
    public TextView f210103T;

    /* renamed from: T0 */
    public TextView f210104T0;

    /* renamed from: U */
    public TextView f210105U;

    /* renamed from: U0 */
    public ImageView f210106U0;

    /* renamed from: V */
    public View f210107V;

    /* renamed from: V0 */
    public ViewGroup f210108V0;

    /* renamed from: W */
    public Button f210109W;

    /* renamed from: W0 */
    public TextView f210110W0;

    /* renamed from: X */
    public RelativeLayout f210111X;

    /* renamed from: X0 */
    public CheckBox f210112X0;

    /* renamed from: Y */
    public CdnImageView f210113Y;

    /* renamed from: Y0 */
    public ViewGroup f210114Y0;

    /* renamed from: Z */
    public CdnImageView f210115Z;

    /* renamed from: Z0 */
    public CdnImageView f210116Z0;

    /* renamed from: a1 */
    public TextView f210117a1;

    /* renamed from: b1 */
    public ProgressBar f210118b1;

    /* renamed from: c1 */
    public ViewGroup f210119c1;

    /* renamed from: d1 */
    public Button f210120d1;

    /* renamed from: e1 */
    public ViewGroup f210121e1;

    /* renamed from: f1 */
    public boolean f210122f1 = false;

    /* renamed from: g */
    public Orders f210123g;

    /* renamed from: g1 */
    public boolean f210124g1 = false;

    /* renamed from: h */
    public boolean f210125h = false;

    /* renamed from: h1 */
    public C77820c f210126h1;

    /* renamed from: i */
    public Set<String> f210127i = null;

    /* renamed from: i1 */
    public WalletSuccPageAwardWidget f210128i1;

    /* renamed from: j */
    public String f210129j;

    /* renamed from: j1 */
    public int f210130j1 = 0;

    /* renamed from: k1 */
    public boolean f210131k1 = false;

    /* renamed from: l1 */
    public boolean f210132l1 = false;

    /* renamed from: m1 */
    public boolean f210133m1 = false;

    /* renamed from: n */
    public List<Orders.Commodity> f210134n = null;

    /* renamed from: n1 */
    public C79148e f210135n1;

    /* renamed from: o */
    public PayInfo f210136o;

    /* renamed from: o1 */
    public IListener f210137o1;

    /* renamed from: p */
    public String f210138p;

    /* renamed from: p0 */
    public TextView f210139p0;

    /* renamed from: p1 */
    public IListener f210140p1;

    /* renamed from: q */
    public String f210141q;

    /* renamed from: q1 */
    public boolean f210142q1;

    /* renamed from: r */
    public String f210143r;

    /* renamed from: r1 */
    public IListener<WalletPayResultEvent> f210144r1;

    /* renamed from: s */
    public int f210145s;

    /* renamed from: s1 */
    public C52763a f210146s1;

    /* renamed from: t */
    public Orders.RecommendTinyAppInfo f210147t;

    /* renamed from: t1 */
    public C52765c f210148t1;

    /* renamed from: u */
    public String f210149u;

    /* renamed from: u1 */
    public boolean f210150u1;

    /* renamed from: v */
    public C72287o f210151v;

    /* renamed from: v1 */
    public int f210152v1;

    /* renamed from: w */
    public HashMap<String, C43379n> f210153w = new HashMap<>();

    /* renamed from: x */
    public String f210154x;

    /* renamed from: x0 */
    public TextView f210155x0;

    /* renamed from: y */
    public Orders.Promotions f210156y = null;

    /* renamed from: y0 */
    public View f210157y0;

    /* renamed from: z */
    public String f210158z = "-1";

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$d */
    public class C5781d implements Runnable {
        public C5781d() {
        }

        public void run() {
            try {
                if (WalletOrderInfoNewUI.this.f210109W.getVisibility() == 0 && WalletOrderInfoNewUI.this.f210103T.getRight() > 0 && WalletOrderInfoNewUI.this.f210109W.getLeft() > 0 && WalletOrderInfoNewUI.this.f210103T.getRight() >= WalletOrderInfoNewUI.this.f210109W.getLeft() && !Util.isNullOrNil(WalletOrderInfoNewUI.this.f210103T.getText())) {
                    float textSize = WalletOrderInfoNewUI.this.f210103T.getTextSize();
                    Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv size exceed, tinyAppDescTv.getRight(): %s, tinyAppButton.getLeft(): %s", Integer.valueOf(WalletOrderInfoNewUI.this.f210103T.getRight()), Integer.valueOf(WalletOrderInfoNewUI.this.f210109W.getLeft()));
                    Paint paint = new Paint();
                    paint.setTextSize(textSize);
                    String charSequence = WalletOrderInfoNewUI.this.f210103T.getText().toString();
                    float left = (float) (WalletOrderInfoNewUI.this.f210109W.getLeft() - WalletOrderInfoNewUI.this.f210103T.getLeft());
                    int i = 1;
                    while (true) {
                        if (paint.measureText(charSequence.substring(0, (charSequence.length() - i) - 1)) <= left) {
                            break;
                        } else if (i > charSequence.length() - 1) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "tinyAppDescTv, exceed len, final search count: %s, text.length: %s", Integer.valueOf(i), Integer.valueOf(charSequence.length()));
                    String substring = charSequence.substring(0, (charSequence.length() - i) - 1);
                    if (charSequence.length() > 9 && substring.length() < 9) {
                        substring = charSequence.substring(0, 9);
                    }
                    WalletOrderInfoNewUI.this.f210103T.setText(substring);
                    WalletOrderInfoNewUI.this.f210103T.append("...");
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WalletOrderInfoNewUI", e, "calc tinyapp name error: %s", e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$e */
    public class C5782e implements C76879j.C11180n {
        public C5782e() {
        }

        /* renamed from: j */
        public void mo782j(int i) {
            if (i == 0) {
                WalletOrderInfoNewUI walletOrderInfoNewUI = WalletOrderInfoNewUI.this;
                int i2 = WalletOrderInfoNewUI.f210081w1;
                walletOrderInfoNewUI.getClass();
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:null"));
                intent.addFlags(268435456);
                WalletOrderInfoNewUI walletOrderInfoNewUI2 = WalletOrderInfoNewUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                WalletOrderInfoNewUI walletOrderInfoNewUI3 = walletOrderInfoNewUI2;
                C117292a.m165358d(walletOrderInfoNewUI3, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$26", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                walletOrderInfoNewUI2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(walletOrderInfoNewUI3, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI$26", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$a */
    public class C72276a extends C7089c0 {
        public C72276a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "click activity button");
            WalletOrderInfoNewUI.m84612P7(WalletOrderInfoNewUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$b */
    public class C72277b extends C7089c0 {
        public C72277b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "click activity layout");
            WalletOrderInfoNewUI.m84612P7(WalletOrderInfoNewUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$c */
    public class C72278c extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ Orders.Commodity f210163g;

        public C72278c(Orders.Commodity commodity) {
            this.f210163g = commodity;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletOrderInfoNewUI walletOrderInfoNewUI = WalletOrderInfoNewUI.this;
            Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "click tiny app, userName: %s, path: %s, version: %s", walletOrderInfoNewUI.f210141q, walletOrderInfoNewUI.f210143r, Integer.valueOf(walletOrderInfoNewUI.f210145s));
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            WalletOrderInfoNewUI walletOrderInfoNewUI2 = WalletOrderInfoNewUI.this;
            aVar.f9526a = walletOrderInfoNewUI2.f210141q;
            aVar.f9527b = Util.nullAs(walletOrderInfoNewUI2.f210143r, "");
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9529d = 1034;
            aVar2.f9528c = 0;
            WalletOrderInfoNewUI walletOrderInfoNewUI3 = WalletOrderInfoNewUI.this;
            int i = walletOrderInfoNewUI3.f210145s;
            if (i > 0) {
                aVar2.f9534i = i;
            }
            aVar2.f9531f = walletOrderInfoNewUI3;
            startAppBrandUIFromOuterEvent.publish();
            WalletOrderInfoNewUI.this.f210122f1 = !Util.isNullOrNil(this.f210163g.f209588D.f209689i) && this.f210163g.f209588D.f209690j > 0;
            WalletOrderInfoNewUI walletOrderInfoNewUI4 = WalletOrderInfoNewUI.this;
            if (walletOrderInfoNewUI4.f210122f1) {
                C115669n.INSTANCE.mo160131h(14118, walletOrderInfoNewUI4.f210129j, walletOrderInfoNewUI4.getPayReqKey(), 3);
            } else {
                C115669n.INSTANCE.mo160131h(14118, walletOrderInfoNewUI4.f210129j, walletOrderInfoNewUI4.getPayReqKey(), 1);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$f */
    public class C72279f implements DialogInterface.OnClickListener {
        public C72279f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletOrderInfoNewUI.this.mo99592O7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$g */
    public class C72280g implements DialogInterface.OnClickListener {
        public C72280g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            WalletOrderInfoNewUI.this.mo99592O7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$h */
    public class C72281h implements DialogInterface.OnClickListener {
        public C72281h(WalletOrderInfoNewUI walletOrderInfoNewUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$i */
    public class C72282i implements DialogInterface.OnClickListener {
        public C72282i(WalletOrderInfoNewUI walletOrderInfoNewUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$j */
    public class C72283j extends C7089c0 {
        public C72283j() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletOrderInfoNewUI.this.mo99583R7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$k */
    public class C72284k implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ImageView f210168d;

        public C72284k(ImageView imageView) {
            this.f210168d = imageView;
        }

        public void run() {
            ViewGroup.LayoutParams layoutParams = this.f210168d.getLayoutParams();
            layoutParams.width = WalletOrderInfoNewUI.this.f210097Q.getWidth();
            layoutParams.height = WalletOrderInfoNewUI.this.f210097Q.getHeight();
            this.f210168d.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$l */
    public class C72285l extends C7089c0 {
        public C72285l() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            C77820c cVar;
            C77820c cVar2;
            Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "click card mch subscribe");
            WalletOrderInfoNewUI walletOrderInfoNewUI = WalletOrderInfoNewUI.this;
            if (walletOrderInfoNewUI.f210131k1) {
                Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "do uncheck mch service pos");
                if (walletOrderInfoNewUI.f210148t1 == null && (cVar2 = walletOrderInfoNewUI.f210126h1) != null && cVar2.f226718r != null) {
                    walletOrderInfoNewUI.f210118b1.setVisibility(0);
                    walletOrderInfoNewUI.f210116Z0.setVisibility(8);
                    walletOrderInfoNewUI.f210130j1 = 0;
                    C52765c cVar3 = new C52765c(walletOrderInfoNewUI.f210126h1.f226718r.f226724i);
                    walletOrderInfoNewUI.f210148t1 = cVar3;
                    cVar3.mo9225i().mo123062e(new C72416q0(walletOrderInfoNewUI));
                    return;
                }
                return;
            }
            Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "do check mch service pos");
            if (walletOrderInfoNewUI.f210146s1 == null && (cVar = walletOrderInfoNewUI.f210126h1) != null && cVar.f226718r != null) {
                walletOrderInfoNewUI.f210118b1.setVisibility(0);
                walletOrderInfoNewUI.f210116Z0.setVisibility(8);
                walletOrderInfoNewUI.f210130j1 = 1;
                C52763a aVar = new C52763a(walletOrderInfoNewUI.f210126h1.f226718r.f226724i);
                walletOrderInfoNewUI.f210146s1 = aVar;
                aVar.mo9225i().mo123062e(new C72414p0(walletOrderInfoNewUI));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$m */
    public class C72286m implements Runnable {
        public C72286m() {
        }

        public void run() {
            View findViewById;
            int height = WalletOrderInfoNewUI.this.f210121e1.getHeight();
            int i = -1;
            ViewGroup viewGroup = WalletOrderInfoNewUI.this.f210097Q;
            int height2 = viewGroup != null ? viewGroup.getHeight() : 0;
            boolean z = WalletOrderInfoNewUI.this.f210099R.getVisibility() == 0;
            boolean z2 = WalletOrderInfoNewUI.this.f210089H.getVisibility() == 0;
            boolean z3 = WalletOrderInfoNewUI.this.f210128i1.getVisibility() == 0;
            if (z2) {
                i = WalletOrderInfoNewUI.this.f210089H.getBottom();
            }
            if (z) {
                i = WalletOrderInfoNewUI.this.f210099R.getBottom();
            }
            if (z3) {
                i = WalletOrderInfoNewUI.this.f210128i1.getBottom();
            }
            if (i <= 0 && (findViewById = WalletOrderInfoNewUI.this.findViewById(C0966R.C0970id.hs6)) != null) {
                i = findViewById.getBottom();
            }
            if (!(WalletOrderInfoNewUI.this.f210108V0.getVisibility() == 0 || WalletOrderInfoNewUI.this.f210119c1.getVisibility() == 0)) {
                height += C76577a.m92151b(WalletOrderInfoNewUI.this, 70);
            }
            Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "autoAdjustLayout inner, height: %s, topViewPos: %s, contentHeight: %s, topMargin: %s, 50dp: %s", Integer.valueOf(height), Integer.valueOf(i), Integer.valueOf(height2), Integer.valueOf((height2 - i) - height), Integer.valueOf(C76577a.m92151b(WalletOrderInfoNewUI.this, 50)));
        }
    }

    public WalletOrderInfoNewUI() {
        C40008f fVar = C40008f.f107254d;
        this.f210137o1 = new IListener<WalletOfflineRealNameNotifyEvent>(fVar) {
            {
                this.__eventId = 201806318;
            }

            public boolean callback(IEvent iEvent) {
                WalletOfflineRealNameNotifyEvent walletOfflineRealNameNotifyEvent = (WalletOfflineRealNameNotifyEvent) iEvent;
                if (!(walletOfflineRealNameNotifyEvent instanceof WalletOfflineRealNameNotifyEvent)) {
                    return false;
                }
                C76313t.C76322j jVar = walletOfflineRealNameNotifyEvent.f194081d.f194082a;
                if (!jVar.f223585f) {
                    Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "block pass");
                    return true;
                } else if (!"1".equals(jVar.f223580a) && !"2".equals(walletOfflineRealNameNotifyEvent.f194081d.f194082a.f223580a)) {
                    return false;
                } else {
                    RealnameGuideHelper realnameGuideHelper = new RealnameGuideHelper();
                    C76313t.C76322j jVar2 = walletOfflineRealNameNotifyEvent.f194081d.f194082a;
                    String str = jVar2.f223580a;
                    String str2 = jVar2.f223581b;
                    String str3 = jVar2.f223582c;
                    String str4 = jVar2.f223583d;
                    String str5 = jVar2.f223584e;
                    PayInfo payInfo = WalletOrderInfoNewUI.this.f210136o;
                    realnameGuideHelper.mo99373d(str, str2, str3, str4, str5, payInfo == null ? 0 : payInfo.f212587e);
                    Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "receive guide");
                    WalletOrderInfoNewUI.this.getInput().putParcelable("key_realname_guide_helper", realnameGuideHelper);
                    return false;
                }
            }
        };
        this.f210140p1 = new IListener<ChangePayActivityViewEvent>(fVar) {
            {
                this.__eventId = -1936299298;
            }

            public boolean callback(IEvent iEvent) {
                ChangePayActivityViewEvent changePayActivityViewEvent = (ChangePayActivityViewEvent) iEvent;
                ChangePayActivityViewEvent.C0996a aVar = changePayActivityViewEvent.f9034d;
                String str = aVar.f9036a;
                boolean z = aVar.f9037b;
                boolean z2 = aVar.f9038c;
                boolean z3 = aVar.f9039d;
                Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "ChangePayActivityViewEvent callback, mActivityBtnTitle: %s, isButtonEnable: %s, isButtonHidden: %s, isActivityViewHidden: %s", str, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3));
                if (z3 && !Util.isNullOrNil(WalletOrderInfoNewUI.this.f210154x)) {
                    WalletOrderInfoNewUI.this.f210119c1.setVisibility(8);
                }
                if (!Util.isNullOrNil(WalletOrderInfoNewUI.this.f210154x)) {
                    WalletOrderInfoNewUI.this.f210120d1.setClickable(z);
                    WalletOrderInfoNewUI.this.f210120d1.setEnabled(z);
                    WalletOrderInfoNewUI.this.f210120d1.setOnClickListener((View.OnClickListener) null);
                    if (z2) {
                        WalletOrderInfoNewUI.this.f210120d1.setVisibility(8);
                    }
                }
                changePayActivityViewEvent.f9035e.f9040a = true;
                return false;
            }
        };
        this.f210142q1 = false;
        this.f210144r1 = new IListener<WalletPayResultEvent>(fVar) {
            {
                this.__eventId = 520089918;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
                r3 = r2.f210160d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public boolean callback(com.tencent.p014mm.sdk.event.IEvent r3) {
                /*
                    r2 = this;
                    com.tencent.mm.autogen.events.WalletPayResultEvent r3 = (com.tencent.p014mm.autogen.events.WalletPayResultEvent) r3
                    java.lang.String r0 = "MicroMsg.WalletOrderInfoNewUI"
                    java.lang.String r1 = "receive pay result event, do finish"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
                    com.tencent.mm.autogen.events.WalletPayResultEvent$a r3 = r3.f194085d
                    int r3 = r3.f194087b
                    r0 = 1000(0x3e8, float:1.401E-42)
                    if (r3 == r0) goto L_0x0015
                    r0 = 1001(0x3e9, float:1.403E-42)
                    if (r3 != r0) goto L_0x0036
                L_0x0015:
                    com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI r3 = com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoNewUI.this
                    com.tencent.mm.pluginsdk.wallet.PayInfo r0 = r3.f210136o
                    if (r0 == 0) goto L_0x0036
                    int r0 = r0.f212587e
                    r1 = 46
                    if (r0 != r1) goto L_0x0036
                    yq3.e r0 = r3.f210135n1
                    if (r0 == 0) goto L_0x002c
                    androidx.appcompat.app.AppCompatActivity r3 = r3.getContext()
                    r0.mo109119z(r3)
                L_0x002c:
                    com.tencent.mm.plugin.wallet_core.ui.s0 r3 = new com.tencent.mm.plugin.wallet_core.ui.s0
                    r3.<init>(r2)
                    r0 = 100
                    com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThreadDelayed(r3, r0)
                L_0x0036:
                    r3 = 0
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoNewUI.C722753.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f210150u1 = false;
        this.f210152v1 = 2;
    }

    /* renamed from: P7 */
    public static void m84612P7(WalletOrderInfoNewUI walletOrderInfoNewUI) {
        WalletOrderInfoNewUI walletOrderInfoNewUI2 = walletOrderInfoNewUI;
        Object[] objArr = new Object[1];
        Orders.Promotions promotions = walletOrderInfoNewUI2.f210156y;
        objArr[0] = Long.valueOf(promotions != null ? promotions.f209672o : 0);
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "onClickActivity, activityId: %s", objArr);
        Orders.Promotions promotions2 = walletOrderInfoNewUI2.f210156y;
        if (promotions2 != null && promotions2.f209672o > 0) {
            walletOrderInfoNewUI2.f210124g1 = true;
            if (walletOrderInfoNewUI2.f210158z.equals("-1") || walletOrderInfoNewUI2.f210158z.equals("3")) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(13472, walletOrderInfoNewUI2.f210138p, Integer.valueOf(walletOrderInfoNewUI2.f210156y.f209673p), 1, Long.valueOf(walletOrderInfoNewUI2.f210156y.f209672o), Long.valueOf(walletOrderInfoNewUI2.f210156y.f209680w));
                Orders.Promotions promotions3 = walletOrderInfoNewUI2.f210156y;
                nVar.mo160131h(13033, 2, "", promotions3.f209668h, promotions3.f209666f, "");
                if (Util.isNullOrNil(walletOrderInfoNewUI2.f210156y.f209678u) || Util.isNullOrNil(walletOrderInfoNewUI2.f210156y.f209679v)) {
                    Orders.Promotions promotions4 = walletOrderInfoNewUI2.f210156y;
                    int i = promotions4.f209673p;
                    if (i == 1) {
                        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "doSceneSendPayAward, getAwardParams==null: %s, %s", Boolean.valueOf(Util.isNullOrNil(promotions4.f209682y)), promotions4.f209682y);
                        if (!Util.isNullOrNil(promotions4.f209682y)) {
                            walletOrderInfoNewUI2.doSceneForceProgress(new C52774n(promotions4.f209682y, promotions4.f209672o));
                        } else {
                            walletOrderInfoNewUI2.doSceneForceProgress(new C78353t(promotions4, walletOrderInfoNewUI.getPayReqKey(), walletOrderInfoNewUI2.f210129j, promotions4.f209680w));
                        }
                    } else if (i != 2 || Util.isNullOrNil(promotions4.f209668h)) {
                        Log.m105920e("MicroMsg.WalletOrderInfoNewUI", "promotion's activityActionType != ACTION_TYPE_NORMAL and url is null,unknow option");
                    } else {
                        if (walletOrderInfoNewUI2.f210153w.containsKey(walletOrderInfoNewUI2.f210156y.f209672o + "")) {
                            C43379n nVar2 = walletOrderInfoNewUI2.f210153w.get(walletOrderInfoNewUI2.f210156y.f209672o + "");
                            Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "go to new url %s", nVar2.f117303a);
                            if (!Util.isNullOrNil(nVar2.f117303a)) {
                                walletOrderInfoNewUI2.mo99595T7(nVar2.f117303a);
                            } else {
                                walletOrderInfoNewUI2.mo99595T7(walletOrderInfoNewUI2.f210156y.f209668h);
                            }
                        } else {
                            String str = walletOrderInfoNewUI2.f210156y.f209668h;
                            walletOrderInfoNewUI2.f210154x = str;
                            String payReqKey = walletOrderInfoNewUI.getPayReqKey();
                            String str2 = walletOrderInfoNewUI2.f210138p;
                            Orders.Promotions promotions5 = walletOrderInfoNewUI2.f210156y;
                            C72287o oVar = new C72287o(walletOrderInfoNewUI2.f210156y.f209672o + "", walletOrderInfoNewUI2.f210156y.f209674q + "", walletOrderInfoNewUI2.f210156y.f209675r + "", walletOrderInfoNewUI2.f210156y.f209676s + "", payReqKey, str2, promotions5.f209680w, promotions5.f209683z);
                            Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "jumpToH5: %s", str);
                            walletOrderInfoNewUI.mo99584U7();
                            walletOrderInfoNewUI2.f210151v = oVar;
                            C75228t.m90220M(walletOrderInfoNewUI2, str, false, 1);
                        }
                    }
                } else {
                    Orders.Promotions promotions6 = walletOrderInfoNewUI2.f210156y;
                    Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "promotion jump tiny app, username: %s, path: %s, version: %s", promotions6.f209678u, promotions6.f209679v, Integer.valueOf(promotions6.f209681x));
                    String payReqKey2 = walletOrderInfoNewUI.getPayReqKey();
                    String str3 = walletOrderInfoNewUI2.f210138p;
                    Orders.Promotions promotions7 = walletOrderInfoNewUI2.f210156y;
                    C115669n nVar3 = nVar;
                    walletOrderInfoNewUI2.f210151v = new C72287o(walletOrderInfoNewUI2.f210156y.f209672o + "", walletOrderInfoNewUI2.f210156y.f209674q + "", walletOrderInfoNewUI2.f210156y.f209675r + "", walletOrderInfoNewUI2.f210156y.f209676s + "", payReqKey2, str3, promotions7.f209680w, promotions7.f209683z);
                    StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                    StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                    Orders.Promotions promotions8 = walletOrderInfoNewUI2.f210156y;
                    aVar.f9526a = promotions8.f209678u;
                    aVar.f9527b = Util.nullAs(promotions8.f209679v, "");
                    StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
                    aVar2.f9529d = C90694b.CTRL_INDEX;
                    aVar2.f9530e = walletOrderInfoNewUI2.f210129j;
                    aVar2.f9528c = 0;
                    int i2 = walletOrderInfoNewUI2.f210156y.f209681x;
                    if (i2 > 0) {
                        aVar2.f9534i = i2;
                    }
                    aVar2.f9531f = walletOrderInfoNewUI2;
                    startAppBrandUIFromOuterEvent.publish();
                    nVar3.mo160131h(14118, walletOrderInfoNewUI2.f210129j, walletOrderInfoNewUI.getPayReqKey(), 2);
                }
            }
        }
    }

    /* renamed from: M7 */
    public boolean mo99591M7() {
        return false;
    }

    /* renamed from: O7 */
    public void mo99592O7() {
        String str;
        int i;
        Bundle bundle;
        mo99584U7();
        CardOfflinePayFinishButtonEvent cardOfflinePayFinishButtonEvent = new CardOfflinePayFinishButtonEvent();
        int i2 = 1;
        cardOfflinePayFinishButtonEvent.f193511d.f193512a = true;
        cardOfflinePayFinishButtonEvent.publish();
        FuckOfflinePayResultEvent fuckOfflinePayResultEvent = new FuckOfflinePayResultEvent();
        fuckOfflinePayResultEvent.f193628d.f193629a = "ok";
        fuckOfflinePayResultEvent.publish();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("intent_pay_end_errcode", getInput().getInt("intent_pay_end_errcode"));
        bundle2.putString("intent_pay_app_url", getInput().getString("intent_pay_app_url"));
        bundle2.putBoolean("intent_pay_end", getInput().getBoolean("intent_pay_end"));
        Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "pay done...feedbackData errCode:" + getInput().getInt("intent_pay_end_errcode"));
        Iterator<String> it = this.f210127i.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (!Util.isNullOrNil(next)) {
                Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "hy: doing netscene subscribe...appName: %s", next);
                if (this.f210123g == null || this.f210136o == null) {
                    C86709a0.m107529k().f251779b.mo123460f(new C75119h0(next));
                } else {
                    C89137b0 b0Var = C86709a0.m107529k().f251779b;
                    Orders orders = this.f210123g;
                    String str2 = orders.f209563e;
                    String str3 = ((ArrayList) orders.f209542M).size() > 0 ? ((Orders.Commodity) ((ArrayList) this.f210123g.f209542M).get(0)).f209606r : str;
                    PayInfo payInfo = this.f210136o;
                    b0Var.mo123460f(new C75119h0(next, str2, str3, payInfo.f212587e, payInfo.f212589g, this.f210123g.f209530A));
                }
            }
            C115669n.INSTANCE.mo160131h(13033, 2, next, str, str, str);
        }
        C79148e eVar = this.f210135n1;
        if (eVar != null) {
            eVar.mo91264o(this, 0, bundle2);
            this.f210135n1 = null;
        } else {
            Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "process is null! finish directly");
            finish();
        }
        PayInfo payInfo2 = this.f210136o;
        if (payInfo2 != null && ((i = payInfo2.f212587e) == 46 || i == 3)) {
            WCPayJSAPIPayCallbackManageStruct wCPayJSAPIPayCallbackManageStruct = new WCPayJSAPIPayCallbackManageStruct();
            int i3 = this.f210136o.f212587e;
            if (i3 == 46) {
                wCPayJSAPIPayCallbackManageStruct.f194669d = 2;
            } else if (i3 == 3) {
                wCPayJSAPIPayCallbackManageStruct.f194669d = 1;
            }
            Orders orders2 = this.f210123g;
            if (orders2 != null && orders2.f209560Y == 0) {
                wCPayJSAPIPayCallbackManageStruct.f194670e = 1;
            } else if (orders2 != null && orders2.f209560Y == 1) {
                wCPayJSAPIPayCallbackManageStruct.f194670e = 2;
            } else if (orders2 != null && orders2.f209560Y == 0 && !Util.isNullOrNil(orders2.f209581x0) && !Util.isNullOrNil(this.f210123g.f209572p0)) {
                wCPayJSAPIPayCallbackManageStruct.f194670e = 3;
            }
            PayInfo payInfo3 = this.f210136o;
            if (!(payInfo3 == null || (bundle = payInfo3.f212600u) == null)) {
                String string = bundle.getString("extinfo_key_20", str);
                if (!Util.isNullOrNil(string)) {
                    wCPayJSAPIPayCallbackManageStruct.f194671f = wCPayJSAPIPayCallbackManageStruct.mo86045b("SourceH5Url", string, false);
                }
                String string2 = this.f210136o.f212600u.getString("extinfo_key_21", str);
                if (!Util.isNullOrNil(string2)) {
                    wCPayJSAPIPayCallbackManageStruct.f194673h = wCPayJSAPIPayCallbackManageStruct.mo86045b("SourceAppPath", string2, true);
                }
                String string3 = this.f210136o.f212600u.getString("extinfo_key_22", str);
                if (!Util.isNullOrNil(string3)) {
                    wCPayJSAPIPayCallbackManageStruct.f194672g = wCPayJSAPIPayCallbackManageStruct.mo86045b("SourceAppUsername", string3, true);
                }
            }
            Orders orders3 = this.f210123g;
            if (orders3 != null && orders3.f209560Y == 0 && !Util.isNullOrNil(orders3.f209581x0) && !Util.isNullOrNil(this.f210123g.f209572p0)) {
                wCPayJSAPIPayCallbackManageStruct.f194675j = wCPayJSAPIPayCallbackManageStruct.mo86045b("TargetAppPath", this.f210123g.f209581x0, true);
                wCPayJSAPIPayCallbackManageStruct.f194674i = wCPayJSAPIPayCallbackManageStruct.mo86045b("TargetAppUsername", this.f210123g.f209572p0, true);
            }
            wCPayJSAPIPayCallbackManageStruct.mo86054n();
            Orders orders4 = this.f210123g;
            if (orders4 != null && orders4.f209560Y == 0 && !Util.isNullOrNil(orders4.f209581x0) && !Util.isNullOrNil(this.f210123g.f209572p0)) {
                StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                Orders orders5 = this.f210123g;
                aVar.f9526a = orders5.f209572p0;
                aVar.f9527b = orders5.f209581x0;
                aVar.f9529d = C90694b.CTRL_INDEX;
                aVar.f9530e = this.f210129j;
                aVar.f9528c = 0;
                aVar.f9531f = this;
                startAppBrandUIFromOuterEvent.publish();
                return;
            }
        }
        Orders orders6 = this.f210123g;
        if (orders6 != null && !Util.isNullOrNil(orders6.f209533D)) {
            if (((ArrayList) this.f210123g.f209542M).size() > 0) {
                str = ((Orders.Commodity) ((ArrayList) this.f210123g.f209542M).get(0)).f209606r;
            }
            Orders orders7 = this.f210123g;
            String str4 = orders7.f209533D;
            String str5 = orders7.f209563e;
            PayInfo payInfo4 = this.f210136o;
            String H7 = mo99629H7(str4, str5, str, payInfo4.f212601v, payInfo4.f212602w);
            Log.m105918d("MicroMsg.WalletOrderInfoNewUI", "url = " + H7);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", H7);
            intent.putExtra("showShare", false);
            intent.putExtra("geta8key_username", C75592q0.m90789s());
            intent.putExtra("stastic_scene", 8);
            C75228t.m90217J(getContext(), intent);
        }
        if (this.f210114Y0.getVisibility() == 0 && this.f210126h1.f226718r != null) {
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[6];
            objArr[0] = this.f210138p;
            objArr[1] = this.f210117a1.getText();
            objArr[2] = Integer.valueOf(this.f210126h1.f226718r.f226719d == 0 ? 1 : 2);
            if (!this.f210131k1) {
                i2 = 2;
            }
            objArr[3] = Integer.valueOf(i2);
            objArr[4] = Integer.valueOf(this.f210152v1);
            objArr[5] = Long.valueOf(System.currentTimeMillis());
            nVar.mo160131h(17271, objArr);
        }
    }

    /* renamed from: Q7 */
    public final void mo99593Q7() {
        this.f210099R.getVisibility();
        this.f210089H.getVisibility();
        this.f210108V0.getVisibility();
        this.f210119c1.getVisibility();
        this.f210121e1.post(new C72286m());
    }

    /* renamed from: R7 */
    public void mo99583R7() {
        if (getInput().containsKey("key_realname_guide_helper")) {
            RealnameGuideHelper realnameGuideHelper = (RealnameGuideHelper) getInput().getParcelable("key_realname_guide_helper");
            if (realnameGuideHelper != null) {
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.WalletOrderInfoNewUI");
                bundle.putString("realname_verify_process_jump_plugin", "wallet_core");
                boolean a = realnameGuideHelper.mo99370a(this, bundle, new C72279f(), (C79148e.C79149a) null);
                boolean c = realnameGuideHelper.mo99372c(this, bundle, new C72280g(), (C79148e.C79149a) null, false);
                getInput().remove("key_realname_guide_helper");
                if (!a && !c) {
                    mo99592O7();
                    return;
                }
                return;
            }
            return;
        }
        mo99592O7();
    }

    /* renamed from: S7 */
    public void mo99594S7(Orders orders) {
        List<Orders.Commodity> list;
        this.f210127i.clear();
        if (orders == null || (list = orders.f209542M) == null) {
            Log.m105928w("MicroMsg.WalletOrderInfoNewUI", "hy: orders is null");
            return;
        }
        for (Orders.Commodity next : list) {
            if (next.f209614z == 2 && !Util.isNullOrNil(next.f209610v)) {
                Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "hy: has username and is force recommend");
                this.f210127i.add(next.f209610v);
            }
        }
    }

    /* renamed from: T7 */
    public void mo99595T7(String str) {
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "jumpToH5: %s", str);
        mo99584U7();
        C75228t.m90219L(this, str, true);
    }

    /* renamed from: U7 */
    public void mo99584U7() {
        if (!this.f210125h) {
            JsapiResultEvent jsapiResultEvent = new JsapiResultEvent();
            JsapiResultEvent.C67720a aVar = jsapiResultEvent.f193694d;
            aVar.f193695a = 4;
            int i = 0;
            if (getInput().getBoolean("intent_pay_end", false)) {
                i = -1;
            }
            aVar.f193696b = i;
            jsapiResultEvent.f193694d.f193697c = new Intent();
            Orders orders = this.f210123g;
            if (orders != null) {
                jsapiResultEvent.f193694d.f193697c.putExtra("key_jsapi_close_page_after_pay", orders.f209560Y);
            }
            Orders orders2 = this.f210123g;
            if (orders2 != null && orders2.f209560Y == 0 && !Util.isNullOrNil(orders2.f209581x0) && !Util.isNullOrNil(this.f210123g.f209572p0)) {
                jsapiResultEvent.f193694d.f193697c.putExtra("key_jsapi_close_page_after_pay", 1);
            }
            C79148e eVar = this.f210135n1;
            if (eVar != null) {
                jsapiResultEvent.f193694d.f193697c.putExtra("key_is_clear_failure", eVar.f232423c.getInt("key_is_clear_failure", -1));
            }
            jsapiResultEvent.publish();
            this.f210125h = true;
        }
    }

    /* renamed from: V7 */
    public final void mo99596V7() {
        List<Orders.Commodity> list;
        boolean z;
        if (this.f210123g != null && (list = this.f210134n) != null && list.size() > 0) {
            Iterator<Orders.Commodity> it = this.f210134n.iterator();
            while (true) {
                if (it.hasNext()) {
                    if ("1".equals(it.next().f209603o)) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            this.f210082A.setVisibility(0);
            this.f210082A.setTextSize(1, 17.0f);
            if (!z) {
                this.f210082A.setText(C0966R.string.f361583l10);
            } else if (!Util.isNullOrNil(this.f210123g.f209532C) && !Util.isNullOrNil(this.f210123g.f209532C.trim())) {
                this.f210082A.setText(this.f210123g.f209532C);
            } else if (this.f210123g.f209567i != 1) {
                this.f210082A.setText(C0966R.string.l0z);
            } else {
                this.f210082A.setText(C0966R.string.l0y);
            }
        }
    }

    /* renamed from: W7 */
    public final void mo99597W7(boolean z) {
        Orders.Commodity commodity;
        Orders.Promotions promotions;
        this.f210099R.setVisibility(8);
        this.f210124g1 = false;
        this.f210122f1 = false;
        if (this.f210123g != null) {
            List<Orders.Commodity> list = this.f210134n;
            if (!(list == null || ((ArrayList) list).size() <= 0 || (commodity = (Orders.Commodity) ((ArrayList) this.f210134n).get(0)) == null)) {
                Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "setTinyAppActivityInfo, hasSubscribeBiz: %s", Boolean.valueOf(commodity.f209593I));
                List<Orders.Promotions> list2 = commodity.f209592H;
                if (list2 != null && ((ArrayList) list2).size() > 0) {
                    Iterator it = ((ArrayList) commodity.f209592H).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        promotions = (Orders.Promotions) it.next();
                        if (promotions.f209664d == 1) {
                            break;
                        }
                    }
                }
                promotions = null;
                Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "activityPromotions: %s", promotions);
                if (promotions == null || promotions.f209672o <= 0 || Util.isNullOrNil(promotions.f209667g)) {
                    Orders.RecommendTinyAppInfo recommendTinyAppInfo = commodity.f209588D;
                    if (recommendTinyAppInfo != null && !Util.isNullOrNil(recommendTinyAppInfo.f209687g)) {
                        Orders.RecommendTinyAppInfo recommendTinyAppInfo2 = commodity.f209588D;
                        this.f210141q = recommendTinyAppInfo2.f209687g;
                        this.f210143r = recommendTinyAppInfo2.f209688h;
                        this.f210145s = recommendTinyAppInfo2.f209695r;
                        this.f210147t = recommendTinyAppInfo2;
                        this.f210101S.setUrl(recommendTinyAppInfo2.f209685e);
                        this.f210103T.setText(commodity.f209588D.f209686f);
                        this.f210105U.setText(getString(C0966R.string.kki));
                        this.f210105U.setVisibility(0);
                        this.f210101S.setRoundCorner(true);
                        this.f210109W.setEnabled(true);
                        this.f210109W.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f210105U.getLayoutParams();
                        layoutParams.addRule(15, 0);
                        this.f210105U.setLayoutParams(layoutParams);
                        Orders.RecommendTinyAppInfo recommendTinyAppInfo3 = commodity.f209588D;
                        if (recommendTinyAppInfo3.f209690j > 0) {
                            if (!Util.isNullOrNil(recommendTinyAppInfo3.f209689i)) {
                                this.f210109W.setVisibility(0);
                                this.f210109W.setText(commodity.f209588D.f209689i);
                                View view = this.f210107V;
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI", "setTinyAppActivityInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI", "setTinyAppActivityInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            C43379n nVar = this.f210153w.get(commodity.f209588D.f209690j + "");
                            if (nVar != null) {
                                if (!Util.isNullOrNil(nVar.f117308f)) {
                                    this.f210101S.setUrl(nVar.f117308f);
                                }
                                if (!Util.isNullOrNil(nVar.f117309g)) {
                                    this.f210103T.setText(nVar.f117309g);
                                }
                                if (!Util.isNullOrNil(nVar.f117313k)) {
                                    this.f210109W.setText(nVar.f117313k);
                                    this.f210109W.setBackgroundResource(C0966R.C0969drawable.f357427b23);
                                }
                                if (!Util.isNullOrNil(nVar.f117310h)) {
                                    this.f210141q = nVar.f117310h;
                                }
                                if (!Util.isNullOrNil(nVar.f117311i)) {
                                    this.f210143r = nVar.f117311i;
                                }
                                int i = nVar.f117312j;
                                if (i > 0) {
                                    this.f210145s = i;
                                }
                            }
                        } else {
                            this.f210109W.setVisibility(8);
                            View view3 = this.f210107V;
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(8);
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI", "setTinyAppActivityInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI", "setTinyAppActivityInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C72278c cVar = new C72278c(commodity);
                        this.f210099R.setOnClickListener(cVar);
                        this.f210109W.setOnClickListener(cVar);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f210099R.getLayoutParams();
                        List<Orders.DiscountInfo> list3 = commodity.f209585A;
                        double d = commodity.f209602n;
                        if ((d < 0.0d || commodity.f209601j >= d) && (list3 == null || ((ArrayList) list3).size() <= 0)) {
                            marginLayoutParams.topMargin = C76577a.m92151b(this, 50);
                        } else {
                            marginLayoutParams.topMargin = 0;
                        }
                        this.f210099R.setLayoutParams(marginLayoutParams);
                        this.f210099R.setVisibility(0);
                    }
                } else {
                    this.f210156y = promotions;
                    View view5 = this.f210107V;
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar3.mo10233c(8);
                    View view6 = view5;
                    C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI", "setTinyAppActivityInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view6, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI", "setTinyAppActivityInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f210101S.setRoundCorner(true);
                    this.f210109W.setEnabled(true);
                    this.f210109W.setBackgroundResource(C0966R.C0969drawable.f4653j6);
                    this.f210105U.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    C43379n nVar2 = this.f210153w.get(promotions.f209672o + "");
                    if (nVar2 != null) {
                        if (!Util.isNullOrNil(nVar2.f117305c)) {
                            this.f210101S.setUrl(nVar2.f117305c);
                        }
                        if (!Util.isNullOrNil(nVar2.f117304b)) {
                            this.f210103T.setText(nVar2.f117304b);
                        }
                        if (!Util.isNullOrNil(nVar2.f117306d)) {
                            this.f210109W.setText(nVar2.f117306d);
                            this.f210109W.setBackgroundResource(C0966R.C0969drawable.f357427b23);
                        }
                        if (!Util.isNullOrNil(nVar2.f117310h)) {
                            this.f210156y.f209678u = nVar2.f117310h;
                        }
                        if (!Util.isNullOrNil(nVar2.f117311i)) {
                            this.f210156y.f209679v = nVar2.f117311i;
                        }
                        int i2 = nVar2.f117312j;
                        if (i2 > 0) {
                            this.f210156y.f209681x = i2;
                        }
                    } else {
                        this.f210101S.setUrl(promotions.f209665e);
                        this.f210103T.setText(promotions.f209666f);
                        this.f210109W.setText(promotions.f209667g);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f210105U.getLayoutParams();
                    char c = 65535;
                    if (nVar2 != null && !Util.isNullOrNil(nVar2.f117307e)) {
                        this.f210105U.setText(nVar2.f117307e);
                        layoutParams2.addRule(15, 0);
                    } else if (!Util.isNullOrNil(promotions.f209670j)) {
                        this.f210105U.setText(promotions.f209670j);
                        layoutParams2.addRule(15, 0);
                    } else {
                        this.f210105U.setVisibility(8);
                        layoutParams2.addRule(15, -1);
                    }
                    this.f210105U.setLayoutParams(layoutParams2);
                    this.f210109W.setVisibility(0);
                    this.f210109W.setOnClickListener(new C72276a());
                    if (promotions.f209673p != 1) {
                        this.f210099R.setOnClickListener(new C72277b());
                    }
                    String str = this.f210158z;
                    int hashCode = str.hashCode();
                    if (hashCode != 1444) {
                        switch (hashCode) {
                            case 48:
                                if (str.equals("0")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 49:
                                if (str.equals("1")) {
                                    c = 5;
                                    break;
                                }
                                break;
                            case 50:
                                if (str.equals("2")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 51:
                                if (str.equals("3")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 52:
                                if (str.equals(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_EMBEDINSTALL)) {
                                    c = 3;
                                    break;
                                }
                                break;
                        }
                    } else if (str.equals("-1")) {
                        c = 1;
                    }
                    if (c == 0) {
                        this.f210109W.setEnabled(false);
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f210099R.getLayoutParams();
                    List<Orders.DiscountInfo> list4 = commodity.f209585A;
                    double d2 = commodity.f209602n;
                    if ((d2 < 0.0d || commodity.f209601j >= d2) && (list4 == null || ((ArrayList) list4).size() <= 0)) {
                        marginLayoutParams2.topMargin = C76577a.m92151b(this, 50);
                    } else {
                        marginLayoutParams2.topMargin = 0;
                    }
                    this.f210099R.setLayoutParams(marginLayoutParams2);
                    this.f210099R.setVisibility(0);
                    if (z) {
                        C115669n nVar3 = C115669n.INSTANCE;
                        Object[] objArr = new Object[6];
                        objArr[0] = this.f210138p;
                        objArr[1] = 1;
                        objArr[2] = Integer.valueOf(promotions.f209673p);
                        objArr[3] = this.f210158z.equals("-1") ? 5 : this.f210158z;
                        objArr[4] = Long.valueOf(promotions.f209672o);
                        objArr[5] = Long.valueOf(promotions.f209680w);
                        nVar3.mo160131h(13471, objArr);
                    }
                }
            }
            if (this.f210103T.getVisibility() == 0) {
                this.f210103T.setSingleLine();
                this.f210103T.post(new C5781d());
            }
        }
    }

    /* renamed from: X7 */
    public final void mo99598X7() {
        if (this.f210114Y0.getVisibility() == 0) {
            if (!this.f210131k1) {
                if (!Util.isNullOrNil(this.f210126h1.f226718r.f226721f)) {
                    this.f210116Z0.setUrl(this.f210126h1.f226718r.f226721f);
                }
                if (!Util.isNullOrNil(this.f210126h1.f226718r.f226720e)) {
                    this.f210117a1.setText(this.f210126h1.f226718r.f226720e);
                    if (!Util.isNullOrNil(this.f210126h1.f226718r.f226722g)) {
                        this.f210117a1.setTextColor(C43423i0.m46931b(this.f210126h1.f226718r.f226722g, true));
                    }
                    long j = this.f210126h1.f226718r.f226723h;
                    if (j > 0) {
                        this.f210117a1.setTextSize(1, (float) j);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!Util.isNullOrNil(this.f210126h1.f226718r.f226727o)) {
                this.f210116Z0.setUrl(this.f210126h1.f226718r.f226727o);
            }
            if (!Util.isNullOrNil(this.f210126h1.f226718r.f226729q)) {
                this.f210117a1.setText(this.f210126h1.f226718r.f226729q);
                if (!Util.isNullOrNil(this.f210126h1.f226718r.f226728p)) {
                    this.f210117a1.setTextColor(C43423i0.m46931b(this.f210126h1.f226718r.f226728p, true));
                }
                long j2 = this.f210126h1.f226718r.f226723h;
                if (j2 > 0) {
                    this.f210117a1.setTextSize(1, (float) j2);
                }
            }
        }
    }

    public void finish() {
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "finish this %s %s", this, Util.getStack());
        if (!this.f210142q1) {
            this.f210142q1 = true;
            super.finish();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cfu;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v130, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: com.tencent.mm.plugin.wallet_core.model.Orders$Commodity} */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0b11, code lost:
        r8.f210126h1 = r2;
        com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, "get exposureInfo: %s, from promotion: %s", r2, java.lang.Integer.valueOf(r1.f209673p));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0709  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0946  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x095d  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0aba  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0ad2  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0b28  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0b31  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0b97  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x0baa  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0c1c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r29 = this;
            r8 = r29
            java.lang.Class<ym.l> r0 = p763ym.C79138l.class
            androidx.appcompat.app.ActionBar r1 = r29.getSupportActionBar()
            if (r1 == 0) goto L_0x0011
            androidx.appcompat.app.ActionBar r1 = r29.getSupportActionBar()
            r1.mo91104o()
        L_0x0011:
            r1 = 2131317303(0x7f095237, float:1.8253112E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 2131310817(0x7f0938e1, float:1.8239957E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.f210082A = r1
            android.text.TextPaint r1 = r1.getPaint()
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r1, r2)
            r1 = 2131298314(0x7f09080a, float:1.8214598E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.f210083B = r1
            r1 = 2131302293(0x7f091795, float:1.8222668E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.f210084C = r1
            r1 = 2131315568(0x7f094b70, float:1.8249593E38)
            android.view.View r1 = r8.findViewById(r1)
            com.tencent.mm.wallet_core.ui.WalletTextView r1 = (com.tencent.p014mm.wallet_core.p137ui.WalletTextView) r1
            r8.f210085D = r1
            r1 = 2131302291(0x7f091793, float:1.8222664E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r8.f210088G = r1
            r1 = 2131302944(0x7f091a20, float:1.8223988E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r8.f210111X = r1
            r1 = 2131302945(0x7f091a21, float:1.822399E38)
            android.view.View r1 = r8.findViewById(r1)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r1
            r8.f210113Y = r1
            r1 = 2131302947(0x7f091a23, float:1.8223995E38)
            android.view.View r1 = r8.findViewById(r1)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r1
            r8.f210115Z = r1
            r1 = 2131302948(0x7f091a24, float:1.8223997E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.f210139p0 = r1
            r1 = 2131302941(0x7f091a1d, float:1.8223982E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.f210155x0 = r1
            r1 = 2131302942(0x7f091a1e, float:1.8223984E38)
            android.view.View r1 = r8.findViewById(r1)
            r8.f210157y0 = r1
            r1 = 2131302943(0x7f091a1f, float:1.8223986E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1
            r8.f210098Q0 = r1
            r1 = 2131316787(0x7f095033, float:1.8252065E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r8.f210100R0 = r1
            r1 = 2131307212(0x7f092acc, float:1.8232645E38)
            android.view.View r1 = r8.findViewById(r1)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r1
            r8.f210102S0 = r1
            r1 = 2131307211(0x7f092acb, float:1.8232643E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.f210104T0 = r1
            r1 = 2131307210(0x7f092aca, float:1.823264E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r8.f210106U0 = r1
            r1 = 2131310640(0x7f093830, float:1.8239598E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.f210086E = r1
            r1 = 2131310809(0x7f0938d9, float:1.823994E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.Button r1 = (android.widget.Button) r1
            r8.f210087F = r1
            r1 = 2131312640(0x7f094000, float:1.8243654E38)
            android.view.View r1 = r8.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r8.f210097Q = r1
            r9 = 0
            r8.showHomeBtn(r9)
            r8.enableBackMenu(r9)
            r1 = 2131821539(0x7f1103e3, float:1.9275824E38)
            java.lang.String r1 = r8.getString(r1)
            com.tencent.mm.pluginsdk.wallet.PayInfo r2 = r8.f210136o
            r10 = 2
            if (r2 == 0) goto L_0x0181
            int r2 = r2.f212587e
            if (r2 != r10) goto L_0x0181
            com.tencent.mm.plugin.wallet_core.model.Orders r2 = r8.f210123g
            if (r2 == 0) goto L_0x011c
            java.lang.String r2 = r2.f209557W
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x011c
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            java.lang.String r1 = r0.f209557W
            goto L_0x0191
        L_0x011c:
            com.tencent.mm.pluginsdk.wallet.PayInfo r2 = r8.f210136o
            java.lang.String r2 = r2.f212595p
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r3 = 2131820948(0x7f110194, float:1.9274625E38)
            if (r2 != 0) goto L_0x0141
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r8.getString(r3)
            r0.append(r1)
            com.tencent.mm.pluginsdk.wallet.PayInfo r1 = r8.f210136o
            java.lang.String r1 = r1.f212595p
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            goto L_0x0191
        L_0x0141:
            com.tencent.mm.pluginsdk.wallet.PayInfo r2 = r8.f210136o
            java.lang.String r2 = r2.f212594o
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0191
            di3.d r2 = di3.C86312j.m106911c(r0)
            ym.l r2 = (p763ym.C79138l) r2
            com.tencent.mm.pluginsdk.wallet.PayInfo r4 = r8.f210136o
            java.lang.String r4 = r4.f212594o
            java.lang.String r2 = r2.mo74012l5(r8, r4)
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0191
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r8.getString(r3)
            r1.append(r2)
            di3.d r0 = di3.C86312j.m106911c(r0)
            ym.l r0 = (p763ym.C79138l) r0
            com.tencent.mm.pluginsdk.wallet.PayInfo r2 = r8.f210136o
            java.lang.String r2 = r2.f212594o
            java.lang.String r0 = r0.mo74012l5(r8, r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            goto L_0x0191
        L_0x0181:
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            if (r0 == 0) goto L_0x0191
            java.lang.String r0 = r0.f209557W
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x0191
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            java.lang.String r1 = r0.f209557W
        L_0x0191:
            android.widget.Button r0 = r8.f210087F
            r0.setText(r1)
            android.widget.Button r0 = r8.f210087F
            com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$j r1 = new com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$j
            r1.<init>()
            r0.setOnClickListener(r1)
            r0 = 2131301059(0x7f0912c3, float:1.8220165E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210089H = r0
            r0 = 2131301058(0x7f0912c2, float:1.8220163E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210090I = r0
            r0 = 2131316773(0x7f095025, float:1.8252037E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210121e1 = r0
            r0 = 2131301060(0x7f0912c4, float:1.8220167E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210091J = r0
            r0 = 2131310648(0x7f093838, float:1.8239614E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210092K = r0
            r0 = 2131308057(0x7f092e19, float:1.8234359E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210093L = r0
            r0 = 2131301062(0x7f0912c6, float:1.8220171E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210094M = r0
            r0 = 2131313527(0x7f094377, float:1.8245453E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210096P = r0
            r0 = 2131312155(0x7f093e1b, float:1.824267E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210095N = r0
            r0 = 2131315275(0x7f094a4b, float:1.8248999E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210099R = r0
            r0 = 2131315277(0x7f094a4d, float:1.8249003E38)
            android.view.View r0 = r8.findViewById(r0)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r0
            r8.f210101S = r0
            r11 = 1
            r0.setUseSdcardCache(r11)
            r0 = 2131315274(0x7f094a4a, float:1.8248997E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f210103T = r0
            r0 = 2131315279(0x7f094a4f, float:1.8249007E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f210105U = r0
            r0 = 2131315272(0x7f094a48, float:1.8248993E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r8.f210109W = r0
            r0 = 2131315276(0x7f094a4c, float:1.8249E38)
            android.view.View r0 = r8.findViewById(r0)
            r8.f210107V = r0
            r0 = 2131314677(0x7f0947f5, float:1.8247786E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210108V0 = r0
            r0 = 2131297908(0x7f090674, float:1.8213774E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f210110W0 = r0
            r0 = 2131314676(0x7f0947f4, float:1.8247784E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r8.f210112X0 = r0
            r0 = 2131296547(0x7f090123, float:1.8211014E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210119c1 = r0
            r0 = 2131296548(0x7f090124, float:1.8211016E38)
            android.view.View r0 = r8.findViewById(r0)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r0
            r0.setUseSdcardCache(r11)
            r0 = 2131296549(0x7f090125, float:1.8211018E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2131296541(0x7f09011d, float:1.8211002E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 2131296534(0x7f090116, float:1.8210987E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r8.f210120d1 = r0
            r0 = 2131316766(0x7f09501e, float:1.8252023E38)
            android.view.View r0 = r8.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r8.f210114Y0 = r0
            r0 = 2131316768(0x7f095020, float:1.8252027E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r8.f210117a1 = r0
            r0 = 2131316765(0x7f09501d, float:1.825202E38)
            android.view.View r0 = r8.findViewById(r0)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r0 = (com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView) r0
            r8.f210116Z0 = r0
            r0 = 2131316767(0x7f09501f, float:1.8252025E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r8.f210118b1 = r0
            r0 = 2131297498(0x7f0904da, float:1.8212943E38)
            android.view.View r0 = r8.findViewById(r0)
            com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget r0 = (com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletSuccPageAwardWidget) r0
            r8.f210128i1 = r0
            r29.mo99596V7()
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            r1 = 1111490560(0x42400000, float:48.0)
            if (r0 == 0) goto L_0x0323
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            if (r0 == 0) goto L_0x0323
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0323
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r9)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r0 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r0
            android.widget.TextView r2 = r8.f210083B
            java.lang.String r3 = r0.f209598g
            r2.setText(r3)
            android.widget.TextView r2 = r8.f210084C
            java.lang.String r3 = r0.f209608t
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90266q(r3)
            r2.setText(r3)
            com.tencent.mm.wallet_core.ui.WalletTextView r2 = r8.f210085D
            java.lang.Object[] r3 = new java.lang.Object[r11]
            double r4 = r0.f209601j
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r3[r9] = r0
            java.lang.String r0 = "%.2f"
            java.lang.String r0 = java.lang.String.format(r0, r3)
            r2.setText(r0)
            android.widget.TextView r0 = r8.f210084C
            r0.setTextSize(r11, r1)
            com.tencent.mm.wallet_core.ui.WalletTextView r0 = r8.f210085D
            r0.setTextSize(r11, r1)
        L_0x0323:
            java.lang.Object[] r0 = new java.lang.Object[r11]
            com.tencent.mm.plugin.wallet_core.model.Orders r2 = r8.f210123g
            if (r2 != 0) goto L_0x032b
            r2 = 0
            goto L_0x032d
        L_0x032b:
            int r2 = r2.f209559X
        L_0x032d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r9] = r2
            java.lang.String r12 = "MicroMsg.WalletOrderInfoNewUI"
            java.lang.String r2 = "is_use_show_info: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r2, r0)
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            r2 = 1096810496(0x41600000, float:14.0)
            r13 = 0
            r15 = 16
            r7 = 8
            if (r0 == 0) goto L_0x0463
            int r0 = r0.f209559X
            if (r0 != r11) goto L_0x0463
            android.view.ViewGroup r0 = r8.f210093L
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r8.f210094M
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r8.f210092K
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r8.f210091J
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r8.f210095N
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r8.f210096P
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r8.f210096P
            r0.removeAllViews()
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            if (r0 == 0) goto L_0x045f
            int r3 = r0.f209559X
            if (r3 != r11) goto L_0x045f
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Orders$ShowInfo> r0 = r0.f209561Z
            if (r0 == 0) goto L_0x045f
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x045f
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.tencent.mm.plugin.wallet_core.model.Orders r3 = r8.f210123g
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Orders$ShowInfo> r3 = r3.f209561Z
            r0[r9] = r3
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0[r11] = r3
            java.lang.String r3 = "orders.showInfoList: %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r0)
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            java.util.ArrayList<com.tencent.mm.plugin.wallet_core.model.Orders$ShowInfo> r0 = r0.f209561Z
            java.util.Iterator r0 = r0.iterator()
        L_0x039e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0455
            java.lang.Object r3 = r0.next()
            com.tencent.mm.plugin.wallet_core.model.Orders$ShowInfo r3 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.ShowInfo) r3
            java.lang.Object[] r4 = new java.lang.Object[r11]
            r4[r9] = r3
            java.lang.String r5 = "showInfo: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r4)
            android.view.LayoutInflater r4 = r29.getLayoutInflater()
            r5 = 2131498274(0x7f0c1522, float:1.8620165E38)
            android.view.ViewGroup r6 = r8.f210096P
            android.view.View r4 = r4.inflate(r5, r6, r9)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r5 = 2131307244(0x7f092aec, float:1.823271E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r6 = 2131312531(0x7f093f93, float:1.8243433E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.setTextSize(r11, r2)
            r6.setTextSize(r11, r2)
            java.lang.String r1 = r3.f209698d
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x03e7
            java.lang.String r1 = r3.f209698d
            r5.setText(r1)
        L_0x03e7:
            java.lang.String r1 = r3.f209700f
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x03fa
            java.lang.String r1 = r3.f209700f     // Catch:{ Exception -> 0x03f9 }
            int r1 = com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46931b(r1, r11)     // Catch:{ Exception -> 0x03f9 }
            r5.setTextColor(r1)     // Catch:{ Exception -> 0x03f9 }
            goto L_0x03fa
        L_0x03f9:
        L_0x03fa:
            java.lang.String r1 = r3.f209699e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0407
            java.lang.String r1 = r3.f209699e
            r6.setText(r1)
        L_0x0407:
            int r1 = r3.f209706o
            if (r1 != r11) goto L_0x0412
            android.text.TextPaint r1 = r6.getPaint()
            r1.setFlags(r15)
        L_0x0412:
            java.lang.String r1 = r3.f209701g
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0425
            java.lang.String r1 = r3.f209701g     // Catch:{ Exception -> 0x0424 }
            int r1 = com.tencent.p014mm.plugin.wallet_core.utils.C43423i0.m46931b(r1, r11)     // Catch:{ Exception -> 0x0424 }
            r6.setTextColor(r1)     // Catch:{ Exception -> 0x0424 }
            goto L_0x0425
        L_0x0424:
        L_0x0425:
            int r1 = r3.f209702h
            if (r1 != r11) goto L_0x043a
            java.lang.String r1 = r3.f209705n
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x044c
            com.tencent.mm.plugin.wallet_core.ui.n0 r1 = new com.tencent.mm.plugin.wallet_core.ui.n0
            r1.<init>(r8, r3)
            r4.setOnClickListener(r1)
            goto L_0x044c
        L_0x043a:
            if (r1 != r10) goto L_0x044c
            java.lang.String r1 = r3.f209703i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x044c
            com.tencent.mm.plugin.wallet_core.ui.o0 r1 = new com.tencent.mm.plugin.wallet_core.ui.o0
            r1.<init>(r8, r3)
            r4.setOnClickListener(r1)
        L_0x044c:
            android.view.ViewGroup r1 = r8.f210096P
            r1.addView(r4)
            r1 = 1111490560(0x42400000, float:48.0)
            goto L_0x039e
        L_0x0455:
            android.view.ViewGroup r0 = r8.f210089H
            r0.setVisibility(r9)
            android.view.ViewGroup r0 = r8.f210096P
            r0.setVisibility(r9)
        L_0x045f:
            r17 = r12
            goto L_0x0619
        L_0x0463:
            android.view.ViewGroup r0 = r8.f210089H
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r8.f210090I
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r8.f210091J
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r8.f210092K
            r0.setVisibility(r7)
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            if (r0 == 0) goto L_0x0567
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            if (r0 == 0) goto L_0x0567
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0567
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r9)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r0 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r0
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$DiscountInfo> r1 = r0.f209585A
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r3[r9] = r1
            if (r1 == 0) goto L_0x04a1
            r4 = r1
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            goto L_0x04a2
        L_0x04a1:
            r4 = 0
        L_0x04a2:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3[r11] = r4
            java.lang.String r4 = "discountInfoList: %s, size: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r4, r3)
            if (r1 == 0) goto L_0x053a
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            if (r3 <= 0) goto L_0x053a
            android.view.ViewGroup r3 = r8.f210090I
            r3.removeAllViews()
            r3 = 0
        L_0x04bd:
            int r4 = r1.size()
            if (r3 >= r4) goto L_0x0528
            java.lang.Object r4 = r1.get(r3)
            com.tencent.mm.plugin.wallet_core.model.Orders$DiscountInfo r4 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.DiscountInfo) r4
            android.widget.TextView r5 = new android.widget.TextView
            androidx.appcompat.app.AppCompatActivity r6 = r29.getContext()
            r5.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r10 = -2
            r6.<init>(r10, r10)
            r5.setLayoutParams(r6)
            r5.setTextSize(r11, r2)
            android.content.res.Resources r6 = r29.getResources()
            r10 = 2131099865(0x7f0600d9, float:1.7812095E38)
            int r6 = r6.getColor(r10)
            r5.setTextColor(r6)
            r17 = r12
            double r11 = r4.f209632d
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x0517
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = r4.f209633e
            r6.append(r11)
            double r11 = r4.f209632d
            r18 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r11 = r11 / r18
            com.tencent.mm.plugin.wallet_core.model.Orders r4 = r8.f210123g
            java.lang.String r4 = r4.f209568j
            java.lang.String r4 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r11, r4)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            r5.setText(r4)
            goto L_0x051c
        L_0x0517:
            java.lang.String r4 = r4.f209633e
            r5.setText(r4)
        L_0x051c:
            android.view.ViewGroup r4 = r8.f210090I
            r4.addView(r5)
            int r3 = r3 + 1
            r12 = r17
            r10 = 2
            r11 = 1
            goto L_0x04bd
        L_0x0528:
            r17 = r12
            android.view.ViewGroup r1 = r8.f210090I
            r1.setVisibility(r9)
            android.view.ViewGroup r1 = r8.f210089H
            r1.setVisibility(r9)
            android.view.ViewGroup r1 = r8.f210091J
            r1.setVisibility(r9)
            goto L_0x053c
        L_0x053a:
            r17 = r12
        L_0x053c:
            double r1 = r0.f209602n
            int r3 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x0569
            double r3 = r0.f209601j
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x0569
            android.widget.TextView r3 = r8.f210086E
            java.lang.String r0 = r0.f209608t
            java.lang.String r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90258m(r1, r0)
            r3.setText(r0)
            android.widget.TextView r0 = r8.f210086E
            android.text.TextPaint r0 = r0.getPaint()
            r0.setFlags(r15)
            android.view.ViewGroup r0 = r8.f210092K
            r0.setVisibility(r9)
            android.view.ViewGroup r0 = r8.f210089H
            r0.setVisibility(r9)
            goto L_0x0569
        L_0x0567:
            r17 = r12
        L_0x0569:
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            if (r0 == 0) goto L_0x05b5
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            if (r0 == 0) goto L_0x05b5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x05b5
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r9)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r0 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r0
            com.tencent.mm.plugin.wallet_core.model.Orders$RemarksInfo r1 = r0.f209591G
            if (r1 == 0) goto L_0x05b5
            android.view.ViewGroup r1 = r8.f210095N
            r2 = 2131312154(0x7f093e1a, float:1.8242669E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.view.ViewGroup r2 = r8.f210095N
            r3 = 2131312153(0x7f093e19, float:1.8242666E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.tencent.mm.plugin.wallet_core.model.Orders$RemarksInfo r3 = r0.f209591G
            java.lang.String r3 = r3.f209696d
            r1.setText(r3)
            com.tencent.mm.plugin.wallet_core.model.Orders$RemarksInfo r0 = r0.f209591G
            java.lang.String r0 = r0.f209697e
            r2.setText(r0)
            android.view.ViewGroup r0 = r8.f210095N
            r0.setVisibility(r9)
            android.view.ViewGroup r0 = r8.f210089H
            r0.setVisibility(r9)
        L_0x05b5:
            android.view.ViewGroup r0 = r8.f210094M
            r0.setVisibility(r7)
            android.view.ViewGroup r0 = r8.f210093L
            r0.setVisibility(r7)
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            if (r0 == 0) goto L_0x0619
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            if (r0 == 0) goto L_0x0619
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0619
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r9)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r0 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r0
            java.lang.String r1 = r0.f209587C
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x05f9
            r1 = 2131308058(0x7f092e1a, float:1.823436E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r2 = r0.f209587C
            r1.setText(r2)
            android.view.ViewGroup r1 = r8.f210093L
            r1.setVisibility(r9)
            android.view.ViewGroup r1 = r8.f210089H
            r1.setVisibility(r9)
        L_0x05f9:
            java.lang.String r1 = r0.f209586B
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0619
            r1 = 2131301063(0x7f0912c7, float:1.8220173E38)
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r0.f209586B
            r1.setText(r0)
            android.view.ViewGroup r0 = r8.f210094M
            r0.setVisibility(r9)
            android.view.ViewGroup r0 = r8.f210089H
            r0.setVisibility(r9)
        L_0x0619:
            android.view.ViewGroup r0 = r8.f210108V0
            r0.setVisibility(r7)
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            r11 = 5
            r12 = 4
            r5 = 3
            if (r0 == 0) goto L_0x06f8
            r8.mo99594S7(r0)
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            if (r0 == 0) goto L_0x06f8
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x06f8
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r9)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r0 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            boolean r1 = r0.f209593I
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2[r9] = r1
            java.lang.String r1 = "setSubscribeBizInfo, hasSubscribeBiz: %s"
            r4 = r17
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r2)
            boolean r1 = r0.f209593I
            if (r1 == 0) goto L_0x06fa
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Promotions> r1 = r0.f209592H
            if (r1 == 0) goto L_0x06fa
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x06fa
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Promotions> r1 = r0.f209592H
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0668:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x067a
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.wallet_core.model.Orders$Promotions r2 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Promotions) r2
            int r3 = r2.f209664d
            if (r3 != 0) goto L_0x0668
            r1 = 1
            goto L_0x067c
        L_0x067a:
            r1 = 1
            r2 = 0
        L_0x067c:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r9] = r2
            java.lang.String r1 = "subscribePromotions: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r3)
            if (r2 == 0) goto L_0x06fa
            java.lang.String r1 = r2.f209669i
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x06fa
            java.lang.String r0 = r0.f209606r
            r8.f210138p = r0
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 13033(0x32e9, float:1.8263E-41)
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r10 = 1
            java.lang.Integer r17 = java.lang.Integer.valueOf(r10)
            r3[r9] = r17
            java.lang.String r13 = r2.f209669i
            r3[r10] = r13
            java.lang.String r13 = r2.f209668h
            r14 = 2
            r3[r14] = r13
            java.lang.String r13 = r2.f209666f
            r3[r5] = r13
            java.lang.String r13 = r8.f210138p
            r3[r12] = r13
            r0.mo160131h(r1, r3)
            android.widget.TextView r0 = r8.f210110W0
            r1 = 2131839403(0x7f1149ab, float:1.9312057E38)
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.String r13 = r2.f209666f
            r3[r9] = r13
            java.lang.String r1 = r8.getString(r1, r3)
            r0.setText(r1)
            java.lang.String r0 = r2.f209669i
            r8.f210149u = r0
            android.widget.CheckBox r0 = r8.f210112X0
            r0.setVisibility(r9)
            java.util.Set<java.lang.String> r0 = r8.f210127i
            java.lang.String r1 = r2.f209669i
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x06e3
            android.widget.CheckBox r0 = r8.f210112X0
            r1 = 1
            r0.setChecked(r1)
            goto L_0x06e8
        L_0x06e3:
            android.widget.CheckBox r0 = r8.f210112X0
            r0.setChecked(r9)
        L_0x06e8:
            android.view.ViewGroup r0 = r8.f210108V0
            com.tencent.mm.plugin.wallet_core.ui.m0 r1 = new com.tencent.mm.plugin.wallet_core.ui.m0
            r1.<init>(r8)
            r0.setOnClickListener(r1)
            android.view.ViewGroup r0 = r8.f210108V0
            r0.setVisibility(r9)
            goto L_0x06fa
        L_0x06f8:
            r4 = r17
        L_0x06fa:
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            java.lang.String r13 = "commditys.size() < 0"
            java.lang.String r14 = "corders == null || commditys == null"
            r3 = -1
            if (r0 == 0) goto L_0x0946
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            if (r0 != 0) goto L_0x0709
            goto L_0x0946
        L_0x0709:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 >= 0) goto L_0x071a
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r13)
            android.widget.RelativeLayout r0 = r8.f210111X
            r0.setVisibility(r7)
            goto L_0x0732
        L_0x071a:
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r9)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r0 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r0
            com.tencent.mm.plugin.wallet_core.model.Orders$FinderInfo r1 = r0.f209589E
            if (r1 != 0) goto L_0x0737
            java.lang.String r0 = "commodity.finder_info == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            android.widget.RelativeLayout r0 = r8.f210111X
            r0.setVisibility(r7)
        L_0x0732:
            r6 = r4
            r7 = -1
            r11 = 3
            goto L_0x0953
        L_0x0737:
            java.lang.String r2 = r1.f209639i
            java.lang.String r10 = r1.f209640j
            java.lang.String r11 = r1.f209641n
            java.lang.String r6 = r1.f209642o
            java.lang.String r15 = r1.f209643p
            java.lang.String r1 = r1.f209644q
            boolean r20 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r20 != 0) goto L_0x0921
            boolean r20 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r20 == 0) goto L_0x0751
            goto L_0x0921
        L_0x0751:
            android.widget.RelativeLayout r12 = r8.f210111X
            r12.setVisibility(r9)
            android.widget.LinearLayout r12 = r8.f210088G
            android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r12 = (android.widget.RelativeLayout.LayoutParams) r12
            r5 = 24
            int r5 = kg3.C76577a.m92151b(r8, r5)
            r12.topMargin = r5
            android.widget.LinearLayout r5 = r8.f210088G
            r5.setLayoutParams(r12)
            android.widget.TextView r5 = r8.f210083B
            r5.setVisibility(r7)
            android.widget.TextView r5 = r8.f210139p0
            r5.setText(r15)
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r5 != 0) goto L_0x0786
            android.widget.TextView r5 = r8.f210155x0
            r5.setVisibility(r9)
            android.widget.TextView r5 = r8.f210155x0
            r5.setText(r1)
            goto L_0x078b
        L_0x0786:
            android.widget.TextView r1 = r8.f210155x0
            r1.setVisibility(r7)
        L_0x078b:
            r1 = 1111490560(0x42400000, float:48.0)
            int r1 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r8, r1)
            r5 = 1101004800(0x41a00000, float:20.0)
            int r5 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r8, r5)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r12 = r8.f210113Y
            r7 = 1
            r12.setRoundCorner(r7)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r12 = r8.f210113Y
            r9 = 1056964608(0x3f000000, float:0.5)
            r12.setRoundCornerRate(r9)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r12 = r8.f210115Z
            r12.setRoundCorner(r7)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r12 = r8.f210115Z
            r12.setRoundCornerRate(r9)
            boolean r9 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r9 == 0) goto L_0x07c0
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            if (r9 != 0) goto L_0x07c0
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r9 = r8.f210113Y
            r9.mo100288c(r10, r1, r1, r3)
            goto L_0x07c5
        L_0x07c0:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r9 = r8.f210113Y
            r9.mo100288c(r2, r1, r1, r3)
        L_0x07c5:
            boolean r1 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r1 == 0) goto L_0x07d7
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r1 != 0) goto L_0x07d7
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r8.f210115Z
            r1.mo100288c(r6, r5, r5, r3)
            goto L_0x07dc
        L_0x07d7:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r1 = r8.f210115Z
            r1.mo100288c(r11, r5, r5, r3)
        L_0x07dc:
            com.tencent.mm.plugin.wallet_core.model.Orders$FinderInfo r1 = r0.f209589E
            int r1 = r1.f209634d
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r7 = 0
            r6[r7] = r5
            java.lang.String r5 = "finder jump_type：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r6)
            if (r1 <= 0) goto L_0x0807
            com.tencent.mm.plugin.report.service.n r5 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r6 = 22110(0x565e, float:3.0983E-41)
            r9 = 2
            java.lang.Object[] r11 = new java.lang.Object[r9]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r11[r7] = r12
            java.lang.String r7 = r8.f210138p
            r10 = 1
            r11[r10] = r7
            r5.mo160131h(r6, r11)
            goto L_0x0809
        L_0x0807:
            r9 = 2
            r10 = 1
        L_0x0809:
            if (r1 == r10) goto L_0x08c8
            if (r1 == r9) goto L_0x0895
            r5 = 15
            if (r1 == r5) goto L_0x0861
            android.view.View r0 = r8.f210157y0
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            r2 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r5)
            java.lang.Object[] r22 = r1.mo10232b()
            java.lang.String r23 = "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI"
            java.lang.String r24 = "setFinderInfoView"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            r21 = r0
            j20.C117292a.m165358d(r21, r22, r23, r24, r25, r26, r27, r28)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r22 = "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI"
            java.lang.String r23 = "setFinderInfoView"
            java.lang.String r24 = "()V"
            java.lang.String r25 = "android/view/View_EXEC_"
            java.lang.String r26 = "setVisibility"
            java.lang.String r27 = "(I)V"
            j20.C117292a.m165359e(r21, r22, r23, r24, r25, r26, r27)
            android.widget.RelativeLayout r0 = r8.f210098Q0
            r1 = 8
            r0.setVisibility(r1)
            r6 = r4
            r7 = -1
            r11 = 3
            goto L_0x08e9
        L_0x0861:
            com.tencent.mm.plugin.wallet_core.model.Orders$FinderInfo r0 = r0.f209589E
            int r5 = r0.f209645r
            java.lang.String r6 = r0.f209646s
            java.lang.String r7 = r0.f209647t
            java.lang.String r9 = r0.f209648u
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r1 = 0
            r0[r1] = r2
            r1 = 1
            r0[r1] = r15
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r2 = 2
            r0[r2] = r1
            java.lang.String r1 = " finder_logo_normal: %s ，finder_title:%s，finder_uri_type：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r1, r0)
            android.widget.RelativeLayout r12 = r8.f210111X
            com.tencent.mm.plugin.wallet_core.ui.i0 r15 = new com.tencent.mm.plugin.wallet_core.ui.i0
            r0 = r15
            r1 = r29
            r2 = r5
            r5 = -1
            r3 = r6
            r6 = r4
            r4 = r7
            r7 = -1
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r12.setOnClickListener(r15)
            goto L_0x08e9
        L_0x0895:
            r6 = r4
            r7 = -1
            r11 = 3
            com.tencent.mm.plugin.wallet_core.model.Orders$FinderInfo r0 = r0.f209589E
            java.lang.String r1 = r0.f209636f
            java.lang.String r2 = r0.f209637g
            java.lang.String r0 = r0.f209638h
            r3 = 0
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r3)
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r1
            r3 = 1
            r5[r3] = r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r4 = 2
            r5[r4] = r3
            java.lang.String r3 = r8.f210138p
            r5[r11] = r3
            java.lang.String r3 = "finder username：%s，path：%s，version：%s ,mTransactionId：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r5)
            android.widget.RelativeLayout r3 = r8.f210111X
            com.tencent.mm.plugin.wallet_core.ui.h0 r4 = new com.tencent.mm.plugin.wallet_core.ui.h0
            r4.<init>(r8, r1, r2, r0)
            r3.setOnClickListener(r4)
            goto L_0x08e9
        L_0x08c8:
            r6 = r4
            r7 = -1
            r11 = 3
            com.tencent.mm.plugin.wallet_core.model.Orders$FinderInfo r0 = r0.f209589E
            java.lang.String r0 = r0.f209635e
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r1 = 0
            r2[r1] = r0
            java.lang.String r1 = r8.f210138p
            r3 = 1
            r2[r3] = r1
            java.lang.String r1 = "finder url：%s，mTransactionId：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r1, r2)
            android.widget.RelativeLayout r1 = r8.f210111X
            com.tencent.mm.plugin.wallet_core.ui.g0 r2 = new com.tencent.mm.plugin.wallet_core.ui.g0
            r2.<init>(r8, r0)
            r1.setOnClickListener(r2)
        L_0x08e9:
            android.widget.RelativeLayout r0 = r8.f210098Q0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0953
            boolean r0 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r0 != 0) goto L_0x090c
            android.widget.RelativeLayout r0 = r8.f210098Q0
            androidx.appcompat.app.AppCompatActivity r1 = r29.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131235619(0x7f081323, float:1.8087437E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setBackgroundDrawable(r1)
            goto L_0x0953
        L_0x090c:
            android.widget.RelativeLayout r0 = r8.f210098Q0
            androidx.appcompat.app.AppCompatActivity r1 = r29.getContext()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131235620(0x7f081324, float:1.808744E38)
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setBackground(r1)
            goto L_0x0953
        L_0x0921:
            r6 = r4
            r7 = -1
            r11 = 3
            java.lang.String r0 = "Util.isNullOrNil(finder_logo_normal) || Util.isNullOrNil(finder_title)"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            android.widget.RelativeLayout r0 = r8.f210111X
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r8.f210088G
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r0 = (android.widget.RelativeLayout.LayoutParams) r0
            r1 = 16
            int r2 = kg3.C76577a.m92151b(r8, r1)
            r0.topMargin = r2
            android.widget.LinearLayout r1 = r8.f210088G
            r1.setLayoutParams(r0)
            goto L_0x0953
        L_0x0946:
            r6 = r4
            r7 = -1
            r11 = 3
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r14)
            android.widget.RelativeLayout r0 = r8.f210111X
            r1 = 8
            r0.setVisibility(r1)
        L_0x0953:
            com.tencent.mm.plugin.wallet_core.model.Orders r0 = r8.f210123g
            if (r0 == 0) goto L_0x0aba
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            if (r0 != 0) goto L_0x095d
            goto L_0x0aba
        L_0x095d:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 >= 0) goto L_0x0970
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r13)
            android.widget.LinearLayout r0 = r8.f210100R0
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x098b
        L_0x0970:
            r1 = 8
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r0 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r0
            com.tencent.mm.plugin.wallet_core.model.Orders$LeadTailViewInfo r2 = r0.f209590F
            if (r2 != 0) goto L_0x0991
            java.lang.String r0 = "commodity.lead_tail_view_info == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            android.widget.LinearLayout r0 = r8.f210100R0
            r0.setVisibility(r1)
        L_0x098b:
            r13 = r6
            r11 = 0
            r12 = 8
            goto L_0x0ac6
        L_0x0991:
            java.lang.String r1 = r2.f209649d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 != 0) goto L_0x0aab
            android.widget.TextView r2 = r8.f210104T0
            r2.setText(r1)
            com.tencent.mm.plugin.wallet_core.model.Orders$LeadTailViewInfo r1 = r0.f209590F
            java.lang.String r9 = r1.f209650e
            java.lang.String r5 = r1.f209651f
            java.lang.String r2 = r1.f209652g
            java.lang.String r3 = r1.f209653h
            int r4 = r1.f209654i
            int r12 = r1.f209655j
            java.lang.String r13 = r1.f209656n
            java.lang.String r14 = r1.f209657o
            java.lang.String r15 = r1.f209658p
            java.lang.String r1 = r1.f209659q
            r10 = 0
            int r1 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r1, (int) r10)
            com.tencent.mm.plugin.wallet_core.model.Orders$LeadTailViewInfo r0 = r0.f209590F
            java.lang.String r10 = r0.f209661s
            java.lang.String r11 = r0.f209662t
            java.lang.String r0 = r0.f209660r
            r7 = 1097859072(0x41700000, float:15.0)
            int r7 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.fromDPToPix(r8, r7)
            boolean r23 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            if (r23 == 0) goto L_0x09dc
            boolean r23 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r23 != 0) goto L_0x09dc
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r2 = r8.f210102S0
            r23 = r0
            r0 = -1
            r2.mo100288c(r3, r7, r7, r0)
            goto L_0x09e4
        L_0x09dc:
            r23 = r0
            r0 = -1
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r3 = r8.f210102S0
            r3.mo100288c(r2, r7, r7, r0)
        L_0x09e4:
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r16 = 0
            r2[r16] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r0 = 1
            r2[r0] = r3
            java.lang.String r3 = "leadViewInfo jump_type，route_info_type：%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r3, r2)
            r2 = 2131235623(0x7f081327, float:1.8087445E38)
            r3 = 2
            if (r4 != r3) goto L_0x0a64
            if (r12 == r0) goto L_0x0a3c
            if (r12 == r3) goto L_0x0a18
            android.widget.ImageView r1 = r8.f210106U0
            r12 = 8
            r1.setVisibility(r12)
            android.widget.LinearLayout r1 = r8.f210100R0
            r3 = 0
            r1.setOnClickListener(r3)
            android.widget.LinearLayout r1 = r8.f210100R0
            r1.setBackground(r3)
            goto L_0x0a60
        L_0x0a18:
            r3 = 0
            r12 = 8
            android.widget.LinearLayout r4 = r8.f210100R0
            r4.setClickable(r0)
            android.widget.LinearLayout r0 = r8.f210100R0
            androidx.appcompat.app.AppCompatActivity r4 = r29.getContext()
            android.content.res.Resources r4 = r4.getResources()
            android.graphics.drawable.Drawable r2 = r4.getDrawable(r2)
            r0.setBackground(r2)
            android.widget.LinearLayout r0 = r8.f210100R0
            com.tencent.mm.plugin.wallet_core.ui.k0 r2 = new com.tencent.mm.plugin.wallet_core.ui.k0
            r2.<init>(r8, r14, r15, r1)
            r0.setOnClickListener(r2)
            goto L_0x0a60
        L_0x0a3c:
            r3 = 0
            r12 = 8
            android.widget.LinearLayout r0 = r8.f210100R0
            r1 = 1
            r0.setClickable(r1)
            android.widget.LinearLayout r0 = r8.f210100R0
            androidx.appcompat.app.AppCompatActivity r1 = r29.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setBackground(r1)
            android.widget.LinearLayout r0 = r8.f210100R0
            com.tencent.mm.plugin.wallet_core.ui.j0 r1 = new com.tencent.mm.plugin.wallet_core.ui.j0
            r1.<init>(r8, r13)
            r0.setOnClickListener(r1)
        L_0x0a60:
            r11 = r3
            r13 = r6
            goto L_0x0ac6
        L_0x0a64:
            r13 = r10
            r0 = 3
            r3 = 0
            r12 = 8
            if (r4 != r0) goto L_0x0a99
            android.widget.LinearLayout r0 = r8.f210100R0
            r1 = 1
            r0.setClickable(r1)
            android.widget.LinearLayout r0 = r8.f210100R0
            androidx.appcompat.app.AppCompatActivity r1 = r29.getContext()
            android.content.res.Resources r1 = r1.getResources()
            android.graphics.drawable.Drawable r1 = r1.getDrawable(r2)
            r0.setBackground(r1)
            android.widget.LinearLayout r14 = r8.f210100R0
            com.tencent.mm.plugin.wallet_core.ui.l0 r15 = new com.tencent.mm.plugin.wallet_core.ui.l0
            r4 = r23
            r0 = r15
            r1 = r29
            r2 = r13
            r13 = r3
            r3 = r11
            r11 = r13
            r13 = r6
            r6 = r7
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r14.setOnClickListener(r15)
            goto L_0x0ac6
        L_0x0a99:
            r11 = r3
            r13 = r6
            android.widget.ImageView r0 = r8.f210106U0
            r0.setVisibility(r12)
            android.widget.LinearLayout r0 = r8.f210100R0
            r0.setOnClickListener(r11)
            android.widget.LinearLayout r0 = r8.f210100R0
            r0.setBackground(r11)
            goto L_0x0ac6
        L_0x0aab:
            r13 = r6
            r11 = 0
            r12 = 8
            java.lang.String r0 = "commodity.lead_tail_view_info desc == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r0)
            android.widget.LinearLayout r0 = r8.f210100R0
            r0.setVisibility(r12)
            goto L_0x0ac6
        L_0x0aba:
            r13 = r6
            r11 = 0
            r12 = 8
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
            android.widget.LinearLayout r0 = r8.f210100R0
            r0.setVisibility(r12)
        L_0x0ac6:
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            if (r0 == 0) goto L_0x0b28
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0b28
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Commodity> r0 = r8.f210134n
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r6 = r0
            com.tencent.mm.plugin.wallet_core.model.Orders$Commodity r6 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Commodity) r6
            if (r6 == 0) goto L_0x0b29
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Promotions> r0 = r6.f209592H
            if (r0 == 0) goto L_0x0b29
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0b29
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$Promotions> r0 = r6.f209592H
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0af4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0b29
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.wallet_core.model.Orders$Promotions r1 = (com.tencent.p014mm.plugin.wallet_core.model.Orders.Promotions) r1
            t14.c r2 = r1.f209663A
            if (r2 == 0) goto L_0x0b0a
            int r3 = r1.f209673p
            r4 = 5
            if (r3 == r4) goto L_0x0b11
            goto L_0x0b0b
        L_0x0b0a:
            r4 = 5
        L_0x0b0b:
            if (r2 == 0) goto L_0x0af4
            t14.d r3 = r2.f226718r
            if (r3 == 0) goto L_0x0af4
        L_0x0b11:
            r8.f210126h1 = r2
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r0 = 0
            r3[r0] = r2
            int r0 = r1.f209673p
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 1
            r3[r1] = r0
            java.lang.String r0 = "get exposureInfo: %s, from promotion: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r3)
            goto L_0x0b29
        L_0x0b28:
            r6 = r11
        L_0x0b29:
            t14.c r0 = r8.f210126h1
            boolean r0 = com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletSuccPageAwardWidget.m84798e(r0)
            if (r0 == 0) goto L_0x0b97
            if (r6 == 0) goto L_0x0b66
            com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget r0 = r8.f210128i1
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            java.util.List<com.tencent.mm.plugin.wallet_core.model.Orders$DiscountInfo> r1 = r6.f209585A
            double r2 = r6.f209602n
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x0b4b
            double r4 = r6.f209601j
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x0b55
        L_0x0b4b:
            if (r1 == 0) goto L_0x0b59
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0b59
        L_0x0b55:
            r1 = 0
            r0.topMargin = r1
            goto L_0x0b61
        L_0x0b59:
            r1 = 16
            int r1 = kg3.C76577a.m92151b(r8, r1)
            r0.topMargin = r1
        L_0x0b61:
            com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget r1 = r8.f210128i1
            r1.setLayoutParams(r0)
        L_0x0b66:
            com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget r0 = r8.f210128i1
            t14.c r2 = r8.f210126h1
            java.lang.String r3 = r8.f210129j
            r4 = 0
            r6 = 2131297523(0x7f0904f3, float:1.8212993E38)
            android.view.View r1 = r8.findViewById(r6)
            r5 = r1
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1 = r29
            r0.mo99841n(r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget r0 = r8.f210128i1
            r0.mo99834g()
            com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget r0 = r8.f210128i1
            r1 = 0
            r0.setVisibility(r1)
            android.view.View r0 = r8.findViewById(r6)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$k r1 = new com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$k
            r1.<init>(r0)
            r0.post(r1)
            r0 = 1
            goto L_0x0ba0
        L_0x0b97:
            r0 = 1
            r8.mo99597W7(r0)
            com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget r1 = r8.f210128i1
            r1.setVisibility(r12)
        L_0x0ba0:
            t14.c r1 = r8.f210126h1
            r2 = 17267(0x4373, float:2.4196E-41)
            if (r1 == 0) goto L_0x0c1c
            t14.d r1 = r1.f226718r
            if (r1 == 0) goto L_0x0c1c
            java.lang.Object[] r3 = new java.lang.Object[r0]
            int r0 = r1.f226719d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r3[r1] = r0
            java.lang.String r0 = "show card info: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r13, r0, r3)
            android.view.ViewGroup r0 = r8.f210114Y0
            r0.setVisibility(r1)
            t14.c r0 = r8.f210126h1
            t14.d r0 = r0.f226718r
            int r3 = r0.f226719d
            if (r3 != 0) goto L_0x0bed
            r8.f210131k1 = r1
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r8.f210138p
            r4[r1] = r5
            java.lang.String r0 = r0.f226720e
            r1 = 1
            r4[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r1 = 2
            r4[r1] = r0
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 3
            r4[r1] = r0
            r3.mo160131h(r2, r4)
            goto L_0x0c45
        L_0x0bed:
            r1 = 1
            if (r3 != r1) goto L_0x0c16
            r8.f210131k1 = r1
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = r8.f210138p
            r6 = 0
            r4[r6] = r5
            java.lang.String r0 = r0.f226729q
            r4[r1] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r1 = 2
            r4[r1] = r0
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 3
            r4[r1] = r0
            r3.mo160131h(r2, r4)
            goto L_0x0c45
        L_0x0c16:
            android.view.ViewGroup r0 = r8.f210114Y0
            r0.setVisibility(r12)
            goto L_0x0c45
        L_0x0c1c:
            android.view.ViewGroup r0 = r8.f210114Y0
            r0.setVisibility(r12)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = r8.f210138p
            r4 = 0
            r1[r4] = r3
            java.lang.String r3 = ""
            r5 = 1
            r1[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r4 = 2
            r1[r4] = r3
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 3
            r1[r4] = r3
            r0.mo160131h(r2, r1)
        L_0x0c45:
            r29.mo99598X7()
            android.view.ViewGroup r0 = r8.f210114Y0
            r1 = 12
            com.tencent.p014mm.sdk.platformtools.Util.expandViewTouchArea(r0, r1, r1, r1, r1)
            android.view.ViewGroup r0 = r8.f210114Y0
            com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$l r1 = new com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$l
            r1.<init>()
            r0.setOnClickListener(r1)
            r29.mo99593Q7()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoNewUI.initView():void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "onActivityResult %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1) {
            Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "do query pay arawrd, query_award_status_params==null: %s, isCallQueryPayAward: %s", Boolean.valueOf(Util.isNullOrNil(this.f210151v.f210180i)), Boolean.valueOf(this.f210132l1));
            if (!this.f210132l1) {
                this.f210132l1 = true;
                if (Util.isNullOrNil(this.f210151v.f210180i)) {
                    C72287o oVar = this.f210151v;
                    doSceneProgress(new C78344g0(oVar.f210172a, oVar.f210173b, oVar.f210174c, oVar.f210175d, oVar.f210176e, oVar.f210177f, oVar.f210178g));
                    return;
                }
                C72287o oVar2 = this.f210151v;
                doSceneProgress(new C52777q(oVar2.f210180i, oVar2.f210172a));
            }
        }
    }

    public void onCreate(Bundle bundle) {
        Orders.SimpleCashierInfo simpleCashierInfo;
        int i;
        List<Orders.Commodity> list;
        super.onCreate(bundle);
        if (C11171e.m11046c(21)) {
            if (C11171e.m11046c(23)) {
                getWindow().setStatusBarColor(getResources().getColor(C0966R.color.f2929c));
                getWindow().getDecorView().setSystemUiVisibility(8192);
            } else {
                getWindow().setStatusBarColor(getResources().getColor(C0966R.color.f2929c));
            }
        }
        setContentViewVisibility(4);
        this.f210127i = new HashSet();
        C79148e g = C79143a.m95768g(this);
        this.f210136o = (PayInfo) getInput().getParcelable("key_pay_info");
        this.f210129j = getInput().getString("key_trans_id");
        getInput().getInt("key_pay_type", -1);
        int i2 = 0;
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "mTransId %s", this.f210129j);
        Orders K7 = mo99582K7();
        this.f210123g = K7;
        if (K7 != null) {
            setContentViewVisibility(0);
            mo99594S7(this.f210123g);
            if (!(g == null || this.f210123g == null || this.f210136o == null)) {
                boolean s = g.mo109117s();
                C72517z.m84856d(this, getInput(), 7);
                int i3 = getInput().getInt("key_support_bankcard", 1) == 2 ? 2 : 1;
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[7];
                objArr[0] = Integer.valueOf(this.f210136o.f212587e);
                objArr[1] = Boolean.valueOf(this.f210136o.f212587e == 3);
                objArr[2] = Integer.valueOf(s ? 1 : 2);
                objArr[3] = Integer.valueOf((int) ((System.currentTimeMillis() - C75136r0.f221075a) / 1000));
                objArr[4] = Integer.valueOf((int) (this.f210123g.f209566h * 100.0d));
                objArr[5] = this.f210123g.f209568j;
                objArr[6] = Integer.valueOf(i3);
                nVar.mo160131h(10691, objArr);
            }
            if ((!((C79173v) C86312j.m106911c(C79173v.class)).Ex0().mo91341w() && g != null && g.mo109117s()) || !C75592q0.m90761I()) {
                C75592q0.m90767O();
            }
            Orders orders = this.f210123g;
            if (orders == null || (list = orders.f209542M) == null || ((ArrayList) list).size() <= 0) {
                Log.printInfoStack("MicroMsg.WalletOrderInfoNewUI", "mOrders info is Illegal!", new Object[0]);
                C76879j.m92742m(getContext(), C0966R.string.l0d, 0, new C72432t0(this));
            } else {
                List<Orders.Commodity> list2 = this.f210123g.f209542M;
                this.f210134n = list2;
                Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "init data commoditys size: %s", Integer.valueOf(((ArrayList) list2).size()));
                this.f210129j = ((Orders.Commodity) ((ArrayList) this.f210134n).get(0)).f209606r;
                this.f210138p = ((Orders.Commodity) ((ArrayList) this.f210134n).get(0)).f209606r;
                if (!(this.f210136o == null || g == null)) {
                    if ((g.f232423c.getInt("key_pay_flag", 0) == 2) || g.mo109117s()) {
                        doSceneProgress(new C78342e0(getPayReqKey(), 21));
                    }
                }
            }
            ((C77781t) C86312j.m106911c(C77781t.class)).mo107897LJ(this);
        } else {
            Log.printInfoStack("MicroMsg.WalletOrderInfoNewUI", "mOrders info is Illegal!", new Object[0]);
            C76879j.m92742m(getContext(), C0966R.string.l0d, 0, new C72434u0(this));
        }
        initView();
        this.f210135n1 = getProcess();
        mo99596V7();
        PayInfo payInfo = this.f210136o;
        if (payInfo != null && payInfo.f212587e == 46) {
            Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "early send result");
            WalletPayResultEvent walletPayResultEvent = new WalletPayResultEvent();
            Intent intent = new Intent();
            intent.putExtras(getInput());
            Orders orders2 = this.f210123g;
            if (orders2 != null) {
                intent.putExtra("key_total_fee", orders2.f209566h);
            }
            C79148e eVar = this.f210135n1;
            if (eVar != null) {
                i = -1;
                intent.putExtra("key_is_clear_failure", eVar.f232423c.getInt("key_is_clear_failure", -1));
            } else {
                i = -1;
            }
            WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
            aVar.f194086a = intent;
            aVar.f194092g = 1;
            aVar.f194089d = getPayReqKey();
            WalletPayResultEvent.C67828a aVar2 = walletPayResultEvent.f194085d;
            if (!intent.getBooleanExtra("intent_pay_end", false)) {
                i = 0;
            }
            aVar2.f194088c = i;
            walletPayResultEvent.publish();
        }
        Orders orders3 = this.f210123g;
        if (orders3 == null || (simpleCashierInfo = orders3.f209558W0) == null || simpleCashierInfo.f209707d != 1) {
            addSceneEndListener(1979);
            addSceneEndListener(2948);
            addSceneEndListener(2710);
            this.f210140p1.alive();
            this.f210137o1.alive();
            this.f210144r1.alive();
            this.f210133m1 = true;
            PayInfo payInfo2 = this.f210136o;
            if (payInfo2 != null) {
                i2 = payInfo2.f212587e;
            }
            C75155x0.m90135a(i2, payInfo2 == null ? "" : payInfo2.f212592j, 16, "");
            return;
        }
        Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "simple cashier");
        mo99592O7();
    }

    @Deprecated
    public Dialog onCreateDialog(int i) {
        C76879j.m92736g(getContext(), getString(C0966R.string.l0u), getResources().getStringArray(C0966R.array.f2610aw), "", new C5782e());
        return null;
    }

    public void onDestroy() {
        C77821d dVar;
        super.onDestroy();
        if (!this.f210142q1) {
            FuckOfflinePayResultEvent fuckOfflinePayResultEvent = new FuckOfflinePayResultEvent();
            fuckOfflinePayResultEvent.f193628d.f193629a = "ok";
            fuckOfflinePayResultEvent.publish();
        }
        Log.m105924i("MicroMsg.WalletOrderInfoNewUI", "do follow card bd mch");
        C77820c cVar = this.f210126h1;
        if (!(cVar == null || (dVar = cVar.f226718r) == null)) {
            new C52764b(dVar.f226724i, dVar.f226719d, this.f210130j1).mo9225i().mo123064p(new C43411r0(this));
        }
        this.f210140p1.dead();
        this.f210137o1.dead();
        removeSceneEndListener(1979);
        removeSceneEndListener(2948);
        removeSceneEndListener(2710);
        this.f210144r1.dead();
        if (WalletSuccPageAwardWidget.m84798e(this.f210126h1)) {
            this.f210128i1.mo99837j();
        }
        C52763a aVar = this.f210146s1;
        if (aVar != null) {
            aVar.mo85581g();
        }
        C52765c cVar2 = this.f210148t1;
        if (cVar2 != null) {
            cVar2.mo85581g();
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        mo99583R7();
        return true;
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "onResume, isFirstInit: %s activityPromotions: %s, isClickTinyappActivity: %s, isClickActivity: %s, recommendTinyAppInfo: %s, exposureInfo: %s", Boolean.valueOf(this.f210133m1), this.f210156y, Boolean.valueOf(this.f210122f1), Boolean.valueOf(this.f210124g1), this.f210147t, this.f210126h1);
        if (WalletSuccPageAwardWidget.m84798e(this.f210126h1)) {
            this.f210128i1.mo99838k();
        } else if (this.f210133m1) {
            this.f210133m1 = false;
        } else {
            Orders.Promotions promotions = this.f210156y;
            if (promotions != null && this.f210124g1) {
                Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "do query payAward, queryAwardStatusParams==null: %s %s, isCallQueryPayAward: %s", Boolean.valueOf(Util.isNullOrNil(promotions.f209683z)), this.f210156y.f209683z, Boolean.valueOf(this.f210132l1));
                if (!this.f210132l1) {
                    this.f210132l1 = true;
                    if (Util.isNullOrNil(this.f210156y.f209683z)) {
                        doSceneProgress(new C78344g0(this.f210156y.f209672o + "", this.f210156y.f209674q + "", this.f210156y.f209675r + "", this.f210156y.f209676s + "", getPayReqKey(), this.f210138p, this.f210156y.f209680w));
                        return;
                    }
                    doSceneProgress(new C52777q(this.f210156y.f209683z, this.f210156y.f209672o + ""));
                }
            } else if (this.f210122f1 && this.f210147t != null) {
                doSceneProgress(new C78344g0(this.f210147t.f209690j + "", this.f210147t.f209691n + "", this.f210147t.f209692o + "", this.f210147t.f209693p + "", getPayReqKey(), this.f210138p, this.f210147t.f209694q));
            }
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        Log.m105925i("MicroMsg.WalletOrderInfoNewUI", "onSceneEnd, errType: %s, errCode: %s, scene: %s", Integer.valueOf(i), Integer.valueOf(i2), yVar2);
        if (WalletSuccPageAwardWidget.m84798e(this.f210126h1)) {
            str2 = str;
            if (this.f210128i1.mo99839l(i3, i4, str2, yVar2)) {
                return true;
            }
        } else {
            str2 = str;
        }
        if (yVar2 instanceof C78344g0) {
            if (i3 == 0 && i4 == 0) {
                C78344g0 g0Var = (C78344g0) yVar2;
                C43379n nVar = new C43379n(g0Var.f229579e);
                if (this.f210151v != null) {
                    this.f210153w.put(g0Var.f229578d, nVar);
                    mo99597W7(false);
                    mo99593Q7();
                } else if (this.f210122f1) {
                    this.f210153w.put(g0Var.f229578d, nVar);
                    mo99597W7(false);
                    mo99593Q7();
                }
            }
            this.f210132l1 = false;
        } else if (yVar2 instanceof C52777q) {
            if (i3 == 0 && i4 == 0) {
                C52777q qVar = (C52777q) yVar2;
                C48875bl3 bl32 = qVar.f147467d;
                if (bl32.f131186d == 0) {
                    C43379n nVar2 = new C43379n(bl32);
                    if (this.f210151v != null) {
                        this.f210153w.put(qVar.f147470g + "", nVar2);
                        mo99597W7(false);
                        mo99593Q7();
                    } else if (this.f210122f1) {
                        this.f210153w.put(qVar.f147470g + "", nVar2);
                        mo99597W7(false);
                        mo99593Q7();
                    }
                }
            }
            this.f210132l1 = false;
        } else if (!(yVar2 instanceof C78353t)) {
            String str3 = "3";
            if (yVar2 instanceof C52774n) {
                if (i3 == 0 && i4 == 0) {
                    C52774n nVar3 = (C52774n) yVar2;
                    C49477fv1 fv12 = nVar3.f147455d;
                    if (fv12.f133706d == 0) {
                        String str4 = fv12.f133708f + "";
                        Orders.Promotions promotions = this.f210156y;
                        if (promotions != null) {
                            String str5 = "MicroMsg.WalletOrderInfoNewUI";
                            String str6 = "btnName: %s";
                            if (promotions.f209672o == nVar3.f147458g) {
                                String str7 = str5;
                                Log.m105925i(str7, "activityAwardState: %s", promotions);
                                this.f210158z = str4;
                                Log.m105919d(str7, str6, fv12.f133710h);
                                mo99597W7(false);
                                mo99593Q7();
                                if (!Util.isNullOrNil(fv12.f133710h) && !str3.equals(str4)) {
                                    this.f210109W.setText(fv12.f133710h);
                                }
                            }
                        }
                        if (!"-1".equals(str4) && !"0".equals(str4) && !Util.isNullOrNil(fv12.f133709g)) {
                            C76879j.m92712F(this, fv12.f133709g, "", true);
                        } else if ("0".equals(str4)) {
                            C76701a.makeText((Context) this, (CharSequence) !Util.isNullOrNil(fv12.f133709g) ? fv12.f133709g : getString(C0966R.string.l3h), 0).show();
                        }
                    }
                    return true;
                }
                C76879j.m92713G(this, Util.isNullOrNil(str) ? getString(C0966R.string.l_3) : str2, (String) null, false, new C72282i(this));
                return true;
            }
        } else if (i3 == 0 && i4 == 0) {
            C78353t tVar = (C78353t) yVar2;
            String str8 = tVar.f229609e;
            Orders.Promotions promotions2 = this.f210156y;
            if (promotions2 != null) {
                String str9 = "3";
                String str10 = "MicroMsg.WalletOrderInfoNewUI";
                if (promotions2.f209672o == tVar.f229608d.f209672o) {
                    String str11 = str10;
                    Log.m105925i(str11, "activityAwardState: %s", promotions2);
                    this.f210158z = str8;
                    Log.m105919d(str11, "btnName: %s", tVar.f229608d.f209667g);
                    mo99597W7(false);
                    mo99593Q7();
                    if (!Util.isNullOrNil(tVar.f229610f) && !str9.equals(str8)) {
                        this.f210109W.setText(tVar.f229610f);
                    }
                }
            }
            if (!"-1".equals(str8) && !"0".equals(str8) && !Util.isNullOrNil(tVar.f229611g)) {
                C76879j.m92712F(this, tVar.f229611g, "", true);
            } else if ("0".equals(str8)) {
                C76701a.makeText((Context) this, (CharSequence) !Util.isNullOrNil(tVar.f229611g) ? tVar.f229611g : getString(C0966R.string.l3h), 0).show();
            }
            return true;
        } else {
            C76879j.m92713G(this, Util.isNullOrNil(str) ? getString(C0966R.string.l_3) : str2, (String) null, false, new C72281h(this));
            return true;
        }
        return false;
    }

    public void setContentViewVisibility(int i) {
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoNewUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$o */
    public static class C72287o {

        /* renamed from: a */
        public String f210172a;

        /* renamed from: b */
        public String f210173b;

        /* renamed from: c */
        public String f210174c;

        /* renamed from: d */
        public String f210175d;

        /* renamed from: e */
        public String f210176e;

        /* renamed from: f */
        public String f210177f;

        /* renamed from: g */
        public long f210178g;

        /* renamed from: h */
        public long f210179h;

        /* renamed from: i */
        public String f210180i;

        public C72287o(String str, String str2, String str3, String str4, String str5, String str6, long j, String str7) {
            this.f210172a = str;
            this.f210173b = str2;
            this.f210174c = str3;
            this.f210175d = str4;
            this.f210176e = str5;
            this.f210177f = str6;
            this.f210178g = j;
            this.f210180i = str7;
        }

        public C72287o(String str, String str2, String str3, String str4, String str5, String str6, long j, long j2, String str7) {
            this.f210172a = str;
            this.f210173b = str2;
            this.f210174c = str3;
            this.f210175d = str4;
            this.f210176e = str5;
            this.f210177f = str6;
            this.f210178g = j;
            this.f210179h = j2;
            this.f210180i = str7;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$n */
    public static class C43379n {

        /* renamed from: a */
        public String f117303a;

        /* renamed from: b */
        public String f117304b;

        /* renamed from: c */
        public String f117305c;

        /* renamed from: d */
        public String f117306d;

        /* renamed from: e */
        public String f117307e;

        /* renamed from: f */
        public String f117308f;

        /* renamed from: g */
        public String f117309g;

        /* renamed from: h */
        public String f117310h;

        /* renamed from: i */
        public String f117311i;

        /* renamed from: j */
        public int f117312j;

        /* renamed from: k */
        public String f117313k;

        public C43379n(JSONObject jSONObject) {
            JSONObject optJSONObject;
            if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("activity_change_info")) != null) {
                this.f117303a = optJSONObject.optString("url");
                this.f117304b = optJSONObject.optString("wording");
                this.f117305c = optJSONObject.optString("icon");
                this.f117306d = optJSONObject.optString("btn_text");
                this.f117307e = optJSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                optJSONObject.optString("tinyapp_name");
                this.f117308f = optJSONObject.optString("tinyapp_logo");
                this.f117309g = optJSONObject.optString("tinyapp_desc");
                this.f117310h = optJSONObject.optString("tinyapp_username");
                this.f117311i = optJSONObject.optString("tinyapp_path");
                this.f117313k = optJSONObject.optString("activity_tinyapp_btn_text");
            }
        }

        public String toString() {
            return this.f117303a + " , " + this.f117304b + " , " + this.f117305c + " , " + this.f117306d + " , " + this.f117307e;
        }

        public C43379n(C48875bl3 bl32) {
            C51042r1 r1Var;
            if (bl32 != null && (r1Var = bl32.f131188f) != null) {
                this.f117303a = r1Var.f140648d;
                String str = r1Var.f140649e;
                this.f117304b = str;
                String str2 = r1Var.f140650f;
                this.f117305c = str2;
                String str3 = r1Var.f140651g;
                this.f117306d = str3;
                this.f117307e = r1Var.f140652h;
                this.f117310h = r1Var.f140653i;
                this.f117311i = r1Var.f140654j;
                this.f117312j = r1Var.f140655n;
                this.f117308f = str2;
                this.f117309g = str;
                this.f117313k = str3;
            }
        }
    }
}
