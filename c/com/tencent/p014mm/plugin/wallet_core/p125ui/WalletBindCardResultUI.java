package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.JsapiResultEvent;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.events.WalletOfflineRealNameNotifyEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.model.BindCardOrder;
import com.tencent.p014mm.plugin.wallet_core.model.C72193b;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoNewUI;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import id2.C76313t;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p206nj.C11171e;
import p910lj.C76701a;
import v53.C78340d0;
import v53.C78352s;
import yq3.C79143a;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI */
public class WalletBindCardResultUI extends WalletBaseUI {

    /* renamed from: G */
    public static final /* synthetic */ int f209792G = 0;

    /* renamed from: A */
    public ViewGroup f209793A;

    /* renamed from: B */
    public boolean f209794B = false;

    /* renamed from: C */
    public boolean f209795C = false;

    /* renamed from: D */
    public boolean f209796D = false;

    /* renamed from: E */
    public C79148e f209797E;

    /* renamed from: F */
    public IListener f209798F = new IListener<WalletOfflineRealNameNotifyEvent>(C40008f.f107254d) {
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
                Log.m105924i("MicroMsg.WalletBindCardResultUI", "block pass");
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
                PayInfo payInfo = WalletBindCardResultUI.this.f209801f;
                realnameGuideHelper.mo99373d(str, str2, str3, str4, str5, payInfo == null ? 0 : payInfo.f212587e);
                Log.m105924i("MicroMsg.WalletBindCardResultUI", "receive guide");
                WalletBindCardResultUI.this.getInput().putParcelable("key_realname_guide_helper", realnameGuideHelper);
                return false;
            }
        }
    };

    /* renamed from: d */
    public BindCardOrder f209799d;

    /* renamed from: e */
    public boolean f209800e = false;

    /* renamed from: f */
    public PayInfo f209801f;

    /* renamed from: g */
    public String f209802g;

    /* renamed from: h */
    public String f209803h;

    /* renamed from: i */
    public int f209804i;

    /* renamed from: j */
    public C72193b.C72195b f209805j;

    /* renamed from: n */
    public WalletOrderInfoNewUI.C72287o f209806n;

    /* renamed from: o */
    public HashMap<String, WalletOrderInfoNewUI.C43379n> f209807o = new HashMap<>();

    /* renamed from: p */
    public BindCardOrder f209808p = null;

    /* renamed from: q */
    public String f209809q = "-1";

    /* renamed from: r */
    public TextView f209810r;

    /* renamed from: s */
    public Button f209811s;

    /* renamed from: t */
    public ImageView f209812t;

    /* renamed from: u */
    public ViewGroup f209813u;

    /* renamed from: v */
    public CdnImageView f209814v;

    /* renamed from: w */
    public TextView f209815w;

    /* renamed from: x */
    public TextView f209816x;

    /* renamed from: y */
    public View f209817y;

    /* renamed from: z */
    public Button f209818z;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$b */
    public class C5775b extends C7089c0 {
        public C5775b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.WalletBindCardResultUI", "click activity button");
            WalletBindCardResultUI.m84576H7(WalletBindCardResultUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$c */
    public class C5776c implements View.OnClickListener {
        public C5776c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.WalletBindCardResultUI", "click activity layout");
            WalletBindCardResultUI.m84576H7(WalletBindCardResultUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$e */
    public class C5777e implements Runnable {
        public C5777e() {
        }

        public void run() {
            if (WalletBindCardResultUI.this.f209818z.getVisibility() == 0 && WalletBindCardResultUI.this.f209815w.getRight() >= WalletBindCardResultUI.this.f209818z.getLeft() && !Util.isNullOrNil(WalletBindCardResultUI.this.f209815w.getText())) {
                float textSize = WalletBindCardResultUI.this.f209815w.getTextSize();
                Log.m105925i("MicroMsg.WalletBindCardResultUI", "tinyAppDescTv size exceed, tinyAppDescTv.getRight(): %s, tinyAppButton.getLeft(): %s", Integer.valueOf(WalletBindCardResultUI.this.f209815w.getRight()), Integer.valueOf(WalletBindCardResultUI.this.f209818z.getLeft()));
                Paint paint = new Paint();
                paint.setTextSize(textSize);
                String charSequence = WalletBindCardResultUI.this.f209815w.getText().toString();
                float measureText = paint.measureText(charSequence) - ((float) (WalletBindCardResultUI.this.f209815w.getRight() - WalletBindCardResultUI.this.f209818z.getLeft()));
                int i = 1;
                while (paint.measureText(charSequence.substring(0, (charSequence.length() - i) - 1)) > measureText && i <= charSequence.length() - 1) {
                    i++;
                }
                Log.m105925i("MicroMsg.WalletBindCardResultUI", "tinyAppDescTv, exceed len, final search count: %s, text.length: %s", Integer.valueOf(i), Integer.valueOf(charSequence.length()));
                WalletBindCardResultUI.this.f209815w.setText(charSequence.substring(0, (charSequence.length() - i) - 1));
                WalletBindCardResultUI.this.f209815w.append("...");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$f */
    public class C5778f implements C76879j.C11180n {
        public C5778f() {
        }

        /* renamed from: j */
        public void mo782j(int i) {
            if (i == 0) {
                WalletBindCardResultUI walletBindCardResultUI = WalletBindCardResultUI.this;
                int i2 = WalletBindCardResultUI.f209792G;
                walletBindCardResultUI.getClass();
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:null"));
                intent.addFlags(268435456);
                WalletBindCardResultUI walletBindCardResultUI2 = WalletBindCardResultUI.this;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                WalletBindCardResultUI walletBindCardResultUI3 = walletBindCardResultUI2;
                C117292a.m165358d(walletBindCardResultUI3, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                walletBindCardResultUI2.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(walletBindCardResultUI3, "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$7", "onClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$a */
    public class C72213a extends C7089c0 {
        public C72213a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            WalletBindCardResultUI walletBindCardResultUI = WalletBindCardResultUI.this;
            walletBindCardResultUI.getClass();
            Bundle bundle = new Bundle();
            C79148e eVar = walletBindCardResultUI.f209797E;
            if (eVar != null) {
                eVar.mo91264o(walletBindCardResultUI, 0, bundle);
            } else {
                walletBindCardResultUI.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$d */
    public class C72214d implements View.OnClickListener {
        public C72214d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletBindCardResultUI walletBindCardResultUI = WalletBindCardResultUI.this;
            Log.m105925i("MicroMsg.WalletBindCardResultUI", "click tiny app, userName: %s, path: %s, version: %s", walletBindCardResultUI.f209802g, walletBindCardResultUI.f209803h, Integer.valueOf(walletBindCardResultUI.f209804i));
            WalletBindCardResultUI.this.mo99507I7(2);
            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
            WalletBindCardResultUI walletBindCardResultUI2 = WalletBindCardResultUI.this;
            aVar.f9526a = walletBindCardResultUI2.f209802g;
            aVar.f9527b = Util.nullAs(walletBindCardResultUI2.f209803h, "");
            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
            aVar2.f9529d = 1034;
            aVar2.f9528c = 0;
            int i = WalletBindCardResultUI.this.f209804i;
            if (i > 0) {
                aVar2.f9534i = i;
            }
            startAppBrandUIFromOuterEvent.publish();
            if (!Util.isNullOrNil(WalletBindCardResultUI.this.f209799d.f209480s.f209729e)) {
                WalletBindCardResultUI walletBindCardResultUI3 = WalletBindCardResultUI.this;
                if (walletBindCardResultUI3.f209799d.f209478q.f209714a > 0) {
                    walletBindCardResultUI3.f209794B = true;
                    C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
            WalletBindCardResultUI.this.f209794B = false;
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$g */
    public class C72215g implements DialogInterface.OnClickListener {
        public C72215g(WalletBindCardResultUI walletBindCardResultUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: H7 */
    public static void m84576H7(WalletBindCardResultUI walletBindCardResultUI) {
        WalletBindCardResultUI walletBindCardResultUI2 = walletBindCardResultUI;
        Object[] objArr = new Object[1];
        BindCardOrder bindCardOrder = walletBindCardResultUI2.f209808p;
        objArr[0] = Long.valueOf(bindCardOrder != null ? bindCardOrder.f209478q.f209714a : 0);
        Log.m105925i("MicroMsg.WalletBindCardResultUI", "onClickActivity, activityId: %s", objArr);
        BindCardOrder bindCardOrder2 = walletBindCardResultUI2.f209808p;
        if (bindCardOrder2 != null && bindCardOrder2.f209478q.f209714a > 0) {
            walletBindCardResultUI2.mo99507I7(2);
            walletBindCardResultUI2.f209795C = true;
            if (walletBindCardResultUI2.f209809q.equals("-1") || walletBindCardResultUI2.f209809q.equals("3")) {
                BindCardOrder bindCardOrder3 = walletBindCardResultUI2.f209799d;
                int i = bindCardOrder3.f209471g;
                if (i == 6 && bindCardOrder3.f209479r != null) {
                    BindCardOrder bindCardOrder4 = walletBindCardResultUI2.f209808p;
                    C72193b bVar = bindCardOrder4.f209478q;
                    long j = bVar.f209719f;
                    long j2 = bVar.f209715b;
                    BindCardOrder bindCardOrder5 = walletBindCardResultUI2.f209799d;
                    walletBindCardResultUI2.doSceneForceProgress(new C78352s(bindCardOrder4, bindCardOrder4.f209478q.f209714a + "", bindCardOrder4.f209478q.f209716c + "", bindCardOrder4.f209478q.f209717d + "", bindCardOrder4.f209478q.f209718e + "", j, j2, bindCardOrder5.f209472h, bindCardOrder5.f209475n, bindCardOrder5.f209476o, bindCardOrder5.f209477p));
                    return;
                }
                if (!(i == 1 && bindCardOrder3.f209479r != null) || Util.isNullOrNil(walletBindCardResultUI2.f209808p.f209479r.f209720a)) {
                    Log.m105920e("MicroMsg.WalletBindCardResultUI", "promotion's activityActionType != ACTION_TYPE_NORMAL and url is null,unknow option");
                    return;
                }
                if (walletBindCardResultUI2.f209807o.containsKey(walletBindCardResultUI2.f209808p.f209478q.f209714a + "")) {
                    WalletOrderInfoNewUI.C43379n nVar = walletBindCardResultUI2.f209807o.get(walletBindCardResultUI2.f209808p.f209478q.f209714a + "");
                    Log.m105925i("MicroMsg.WalletBindCardResultUI", "go to new url %s", nVar.f117303a);
                    if (!Util.isNullOrNil(nVar.f117303a)) {
                        String str = nVar.f117303a;
                        walletBindCardResultUI.mo99508J7();
                        C75228t.m90219L(walletBindCardResultUI2, str, false);
                        return;
                    }
                    String str2 = walletBindCardResultUI2.f209808p.f209479r.f209720a;
                    walletBindCardResultUI.mo99508J7();
                    C75228t.m90219L(walletBindCardResultUI2, str2, false);
                    return;
                }
                String str3 = walletBindCardResultUI2.f209808p.f209479r.f209720a;
                String payReqKey = walletBindCardResultUI.getPayReqKey();
                C72193b bVar2 = walletBindCardResultUI2.f209808p.f209478q;
                WalletOrderInfoNewUI.C72287o oVar = new WalletOrderInfoNewUI.C72287o(walletBindCardResultUI2.f209808p.f209478q.f209714a + "", walletBindCardResultUI2.f209808p.f209478q.f209716c + "", walletBindCardResultUI2.f209808p.f209478q.f209717d + "", walletBindCardResultUI2.f209808p.f209478q.f209718e + "", payReqKey, (String) null, bVar2.f209719f, bVar2.f209715b, (String) null);
                walletBindCardResultUI.mo99508J7();
                walletBindCardResultUI2.f209806n = oVar;
                C75228t.m90220M(walletBindCardResultUI2, str3, false, 1);
            }
        }
    }

    /* renamed from: I7 */
    public void mo99507I7(int i) {
        C115669n nVar = C115669n.INSTANCE;
        Object[] objArr = new Object[4];
        String str = "";
        if (this.f209799d.f209478q != null) {
            str = Util.nullAs(this.f209799d.f209478q.f209714a + str, str);
        }
        objArr[0] = str;
        objArr[1] = this.f209799d.f209475n;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = this.f209799d.f209472h;
        nVar.mo160131h(14877, objArr);
    }

    /* renamed from: J7 */
    public void mo99508J7() {
        if (!this.f209800e) {
            JsapiResultEvent jsapiResultEvent = new JsapiResultEvent();
            JsapiResultEvent.C67720a aVar = jsapiResultEvent.f193694d;
            aVar.f193695a = 4;
            int i = 0;
            if (getInput().getBoolean("intent_pay_end", false)) {
                i = -1;
            }
            aVar.f193696b = i;
            jsapiResultEvent.publish();
            this.f209800e = true;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        if ((r2 == 6 && r6.f209479r != null) != false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e8  */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99509K7(boolean r26) {
        /*
            r25 = this;
            r0 = r25
            android.view.ViewGroup r1 = r0.f209813u
            r2 = 4
            r1.setVisibility(r2)
            r1 = 0
            r0.f209795C = r1
            r0.f209794B = r1
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r3 = r0.f209799d
            r4 = 8
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r3 == 0) goto L_0x03ef
            com.tencent.mm.plugin.wallet_core.model.b r3 = r3.f209478q
            if (r3 == 0) goto L_0x03dd
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r7 = r0.f209808p
            r6[r1] = r7
            java.lang.String r7 = "MicroMsg.WalletBindCardResultUI"
            java.lang.String r8 = "activityPromotions: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r6 = r0.f209799d
            r7 = 2131235621(0x7f081325, float:1.8087441E38)
            java.lang.String r8 = "..."
            java.lang.String r9 = ""
            r10 = 2131231392(0x7f0802a0, float:1.8078864E38)
            r11 = 0
            r15 = 15
            if (r6 == 0) goto L_0x022b
            int r2 = r6.f209471g
            if (r2 != r3) goto L_0x0045
            com.tencent.mm.plugin.wallet_core.model.b$a r14 = r6.f209479r
            if (r14 == 0) goto L_0x0045
            r14 = 1
            goto L_0x0046
        L_0x0045:
            r14 = 0
        L_0x0046:
            if (r14 != 0) goto L_0x0054
            r14 = 6
            if (r2 != r14) goto L_0x0051
            com.tencent.mm.plugin.wallet_core.model.b$a r2 = r6.f209479r
            if (r2 == 0) goto L_0x0051
            r2 = 1
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            if (r2 == 0) goto L_0x022b
        L_0x0054:
            com.tencent.mm.plugin.wallet_core.model.b r2 = r6.f209478q
            long r13 = r2.f209714a
            int r2 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r2 <= 0) goto L_0x022b
            com.tencent.mm.plugin.wallet_core.model.b$a r2 = r6.f209479r
            java.lang.String r2 = r2.f209723d
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x022b
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r2 = r0.f209799d
            r0.f209808p = r2
            android.view.View r2 = r0.f209817y
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
            r6.mo10233c(r5)
            java.lang.Object[] r18 = r6.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI"
            java.lang.String r20 = "setTinyAppActivityInfo"
            java.lang.String r21 = "(Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r2
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r5 = r6.mo10231a(r1)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r18 = "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI"
            java.lang.String r19 = "setTinyAppActivityInfo"
            java.lang.String r20 = "(Z)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r2 = r0.f209814v
            r2.setRoundCorner(r3)
            android.widget.Button r2 = r0.f209818z
            r2.setEnabled(r3)
            android.widget.Button r2 = r0.f209818z
            r2.setBackgroundResource(r10)
            android.widget.TextView r2 = r0.f209816x
            r5 = 0
            r2.setCompoundDrawables(r5, r5, r5, r5)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$n> r2 = r0.f209807o
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r6 = r0.f209808p
            com.tencent.mm.plugin.wallet_core.model.b r6 = r6.f209478q
            long r10 = r6.f209714a
            r5.append(r10)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.Object r2 = r2.get(r5)
            com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$n r2 = (com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoNewUI.C43379n) r2
            if (r2 == 0) goto L_0x010e
            java.lang.String r5 = r2.f117305c
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x00ea
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r5 = r0.f209814v
            java.lang.String r6 = r2.f117305c
            r5.setUrl(r6)
        L_0x00ea:
            java.lang.String r5 = r2.f117304b
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x00f9
            android.widget.TextView r5 = r0.f209815w
            java.lang.String r6 = r2.f117304b
            r5.setText(r6)
        L_0x00f9:
            java.lang.String r5 = r2.f117306d
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x012f
            android.widget.Button r5 = r0.f209818z
            java.lang.String r6 = r2.f117306d
            r5.setText(r6)
            android.widget.Button r5 = r0.f209818z
            r5.setBackgroundResource(r7)
            goto L_0x012f
        L_0x010e:
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r5 = r0.f209814v
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r6 = r0.f209799d
            com.tencent.mm.plugin.wallet_core.model.b$a r6 = r6.f209479r
            java.lang.String r6 = r6.f209722c
            r5.setUrl(r6)
            android.widget.TextView r5 = r0.f209815w
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r6 = r0.f209799d
            com.tencent.mm.plugin.wallet_core.model.b$a r6 = r6.f209479r
            java.lang.String r6 = r6.f209721b
            r5.setText(r6)
            android.widget.Button r5 = r0.f209818z
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r6 = r0.f209799d
            com.tencent.mm.plugin.wallet_core.model.b$a r6 = r6.f209479r
            java.lang.String r6 = r6.f209723d
            r5.setText(r6)
        L_0x012f:
            android.widget.TextView r5 = r0.f209816x
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            r6 = -1
            if (r2 == 0) goto L_0x014d
            java.lang.String r7 = r2.f117307e
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x014d
            android.widget.TextView r7 = r0.f209816x
            java.lang.String r2 = r2.f117307e
            r7.setText(r2)
            r5.addRule(r15, r1)
            goto L_0x0170
        L_0x014d:
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r2 = r0.f209799d
            com.tencent.mm.plugin.wallet_core.model.b$a r2 = r2.f209479r
            java.lang.String r2 = r2.f209724e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x0168
            android.widget.TextView r2 = r0.f209816x
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r7 = r0.f209799d
            com.tencent.mm.plugin.wallet_core.model.b$a r7 = r7.f209479r
            java.lang.String r7 = r7.f209724e
            r2.setText(r7)
            r5.addRule(r15, r1)
            goto L_0x0170
        L_0x0168:
            android.widget.TextView r2 = r0.f209816x
            r2.setVisibility(r4)
            r5.addRule(r15, r6)
        L_0x0170:
            android.widget.TextView r2 = r0.f209816x
            r2.setLayoutParams(r5)
            android.widget.Button r2 = r0.f209818z
            r2.setVisibility(r1)
            android.widget.Button r2 = r0.f209818z
            com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$b r5 = new com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$b
            r5.<init>()
            r2.setOnClickListener(r5)
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r2 = r0.f209808p
            com.tencent.mm.plugin.wallet_core.model.b r2 = r2.f209478q
            long r9 = r2.f209715b
            r11 = 1
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 == 0) goto L_0x019a
            android.view.ViewGroup r2 = r0.f209813u
            com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$c r5 = new com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$c
            r5.<init>()
            r2.setOnClickListener(r5)
        L_0x019a:
            java.lang.String r2 = r0.f209809q
            int r5 = r2.hashCode()
            r7 = 1444(0x5a4, float:2.023E-42)
            if (r5 == r7) goto L_0x01da
            switch(r5) {
                case 48: goto L_0x01d0;
                case 49: goto L_0x01c6;
                case 50: goto L_0x01bc;
                case 51: goto L_0x01b2;
                case 52: goto L_0x01a8;
                default: goto L_0x01a7;
            }
        L_0x01a7:
            goto L_0x01e4
        L_0x01a8:
            java.lang.String r3 = "4"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01e4
            r2 = 3
            goto L_0x01e5
        L_0x01b2:
            java.lang.String r3 = "3"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01e4
            r2 = 2
            goto L_0x01e5
        L_0x01bc:
            java.lang.String r3 = "2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01e4
            r2 = 4
            goto L_0x01e5
        L_0x01c6:
            java.lang.String r3 = "1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01e4
            r2 = 5
            goto L_0x01e5
        L_0x01d0:
            java.lang.String r3 = "0"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x01e4
            r2 = 0
            goto L_0x01e5
        L_0x01da:
            java.lang.String r5 = "-1"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01e4
            r2 = 1
            goto L_0x01e5
        L_0x01e4:
            r2 = -1
        L_0x01e5:
            if (r2 == 0) goto L_0x01e8
            goto L_0x01ed
        L_0x01e8:
            android.widget.Button r2 = r0.f209818z
            r2.setEnabled(r1)
        L_0x01ed:
            android.widget.TextView r2 = r0.f209815w
            java.lang.CharSequence r2 = r2.getText()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r2)
            if (r3 != 0) goto L_0x020f
            int r3 = r2.length()
            r5 = 9
            if (r3 <= r5) goto L_0x020f
            android.widget.TextView r3 = r0.f209815w
            java.lang.CharSequence r2 = r2.subSequence(r1, r5)
            r3.setText(r2)
            android.widget.TextView r2 = r0.f209815w
            r2.append(r8)
        L_0x020f:
            android.view.ViewGroup r2 = r0.f209813u
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r3 = 50
            int r3 = kg3.C76577a.m92151b(r0, r3)
            r2.topMargin = r3
            android.view.ViewGroup r3 = r0.f209813u
            r3.setLayoutParams(r2)
            android.view.ViewGroup r2 = r0.f209813u
            r2.setVisibility(r1)
            goto L_0x03dd
        L_0x022b:
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r2 = r0.f209799d
            com.tencent.mm.plugin.wallet_core.model.b$b r2 = r2.f209480s
            if (r2 == 0) goto L_0x03dd
            java.lang.String r2 = r2.f209727c
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x03dd
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r2 = r0.f209799d
            int r6 = r2.f209471g
            r13 = 2
            if (r6 != r13) goto L_0x0246
            com.tencent.mm.plugin.wallet_core.model.b$b r6 = r2.f209480s
            if (r6 == 0) goto L_0x0246
            r6 = 1
            goto L_0x0247
        L_0x0246:
            r6 = 0
        L_0x0247:
            if (r6 == 0) goto L_0x03dd
            com.tencent.mm.plugin.wallet_core.model.b$b r2 = r2.f209480s
            java.lang.String r6 = r2.f209727c
            r0.f209802g = r6
            java.lang.String r6 = r2.f209728d
            r0.f209803h = r6
            int r6 = r2.f209730f
            r0.f209804i = r6
            r0.f209805j = r2
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r6 = r0.f209814v
            java.lang.String r2 = r2.f209725a
            r6.setUrl(r2)
            android.widget.TextView r2 = r0.f209815w
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r6 = r0.f209799d
            com.tencent.mm.plugin.wallet_core.model.b$b r6 = r6.f209480s
            java.lang.String r6 = r6.f209726b
            r2.setText(r6)
            android.widget.TextView r2 = r0.f209816x
            r6 = 2131838775(0x7f114737, float:1.9310783E38)
            java.lang.String r6 = r0.getString(r6)
            r2.setText(r6)
            android.widget.TextView r2 = r0.f209816x
            r2.setVisibility(r1)
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r2 = r0.f209814v
            r2.setRoundCorner(r3)
            android.widget.Button r2 = r0.f209818z
            r2.setEnabled(r3)
            android.widget.Button r2 = r0.f209818z
            r2.setBackgroundResource(r10)
            android.widget.TextView r2 = r0.f209816x
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            r2.addRule(r15, r1)
            android.widget.TextView r3 = r0.f209816x
            r3.setLayoutParams(r2)
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r2 = r0.f209799d
            com.tencent.mm.plugin.wallet_core.model.b r3 = r2.f209478q
            long r13 = r3.f209714a
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0366
            com.tencent.mm.plugin.wallet_core.model.b$b r2 = r2.f209480s
            java.lang.String r2 = r2.f209729e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x02fc
            android.widget.Button r2 = r0.f209818z
            r2.setVisibility(r1)
            android.widget.Button r2 = r0.f209818z
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r3 = r0.f209799d
            com.tencent.mm.plugin.wallet_core.model.b$b r3 = r3.f209480s
            java.lang.String r3 = r3.f209729e
            r2.setText(r3)
            android.view.View r10 = r0.f209817y
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            r2.mo10233c(r5)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI"
            java.lang.String r20 = "setTinyAppActivityInfo"
            java.lang.String r21 = "(Z)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r10
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r2 = r2.mo10231a(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r10.setVisibility(r2)
            java.lang.String r11 = "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI"
            java.lang.String r12 = "setTinyAppActivityInfo"
            java.lang.String r13 = "(Z)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
        L_0x02fc:
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$n> r2 = r0.f209807o
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder r5 = r0.f209799d
            com.tencent.mm.plugin.wallet_core.model.b r5 = r5.f209478q
            long r5 = r5.f209714a
            r3.append(r5)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.Object r2 = r2.get(r3)
            com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoNewUI$n r2 = (com.tencent.p014mm.plugin.wallet_core.p125ui.WalletOrderInfoNewUI.C43379n) r2
            if (r2 == 0) goto L_0x03a7
            java.lang.String r3 = r2.f117308f
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x032a
            com.tencent.mm.pluginsdk.ui.applet.CdnImageView r3 = r0.f209814v
            java.lang.String r5 = r2.f117308f
            r3.setUrl(r5)
        L_0x032a:
            java.lang.String r3 = r2.f117309g
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0339
            android.widget.TextView r3 = r0.f209815w
            java.lang.String r5 = r2.f117309g
            r3.setText(r5)
        L_0x0339:
            java.lang.String r3 = r2.f117313k
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x034d
            android.widget.Button r3 = r0.f209818z
            java.lang.String r5 = r2.f117313k
            r3.setText(r5)
            android.widget.Button r3 = r0.f209818z
            r3.setBackgroundResource(r7)
        L_0x034d:
            java.lang.String r3 = r2.f117310h
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x0359
            java.lang.String r3 = r2.f117310h
            r0.f209802g = r3
        L_0x0359:
            java.lang.String r3 = r2.f117311i
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r3 != 0) goto L_0x03a7
            java.lang.String r2 = r2.f117311i
            r0.f209803h = r2
            goto L_0x03a7
        L_0x0366:
            android.widget.Button r2 = r0.f209818z
            r2.setVisibility(r4)
            android.view.View r2 = r0.f209817y
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r3.mo10233c(r5)
            java.lang.Object[] r10 = r3.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI"
            java.lang.String r12 = "setTinyAppActivityInfo"
            java.lang.String r13 = "(Z)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r2
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r3 = r3.mo10231a(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI"
            java.lang.String r11 = "setTinyAppActivityInfo"
            java.lang.String r12 = "(Z)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x03a7:
            com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$d r2 = new com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$d
            r2.<init>()
            android.view.ViewGroup r3 = r0.f209813u
            r3.setOnClickListener(r2)
            android.widget.Button r3 = r0.f209818z
            r3.setOnClickListener(r2)
            android.widget.TextView r2 = r0.f209815w
            java.lang.CharSequence r2 = r2.getText()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r2)
            if (r3 != 0) goto L_0x03d8
            int r3 = r2.length()
            r5 = 9
            if (r3 <= r5) goto L_0x03d8
            android.widget.TextView r3 = r0.f209815w
            java.lang.CharSequence r2 = r2.subSequence(r1, r5)
            r3.setText(r2)
            android.widget.TextView r2 = r0.f209815w
            r2.append(r8)
        L_0x03d8:
            android.view.ViewGroup r2 = r0.f209813u
            r2.setVisibility(r1)
        L_0x03dd:
            android.widget.TextView r1 = r0.f209815w
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x03ef
            android.widget.TextView r1 = r0.f209815w
            com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$e r2 = new com.tencent.mm.plugin.wallet_core.ui.WalletBindCardResultUI$e
            r2.<init>()
            r1.post(r2)
        L_0x03ef:
            android.view.ViewGroup r1 = r0.f209813u
            int r1 = r1.getVisibility()
            if (r1 != r4) goto L_0x040c
            android.widget.ImageView r1 = r0.f209812t
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r2 = 91
            int r2 = kg3.C76577a.m92151b(r0, r2)
            r1.topMargin = r2
            android.widget.ImageView r2 = r0.f209812t
            r2.setLayoutParams(r1)
        L_0x040c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.WalletBindCardResultUI.mo99509K7(boolean):void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ce5;
    }

    public void initView() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().mo91104o();
        }
        this.f209812t = (ImageView) findViewById(C0966R.C0970id.luk);
        this.f209810r = (TextView) findViewById(C0966R.C0970id.hs_);
        this.f209811s = (Button) findViewById(C0966R.C0970id.f358911hs3);
        showHomeBtn(false);
        enableBackMenu(false);
        String string = getString(C0966R.string.f8014z_);
        BindCardOrder bindCardOrder = this.f209799d;
        if (bindCardOrder == null || Util.isNullOrNil(bindCardOrder.f209469e)) {
            this.f209811s.setText(string);
        } else {
            this.f209811s.setText(this.f209799d.f209469e);
        }
        this.f209811s.setOnClickListener(new C72213a());
        this.f209793A = (ViewGroup) findViewById(C0966R.C0970id.lhv);
        this.f209813u = (ViewGroup) findViewById(C0966R.C0970id.f359380km0);
        CdnImageView cdnImageView = (CdnImageView) findViewById(C0966R.C0970id.f359382km2);
        this.f209814v = cdnImageView;
        cdnImageView.setUseSdcardCache(true);
        this.f209815w = (TextView) findViewById(C0966R.C0970id.klz);
        this.f209816x = (TextView) findViewById(C0966R.C0970id.km4);
        this.f209818z = (Button) findViewById(C0966R.C0970id.klx);
        this.f209817y = findViewById(C0966R.C0970id.f359381km1);
        this.f209793A.setVisibility(4);
        this.f209810r.setText(this.f209799d.f209470f);
        mo99509K7(true);
        this.f209793A.setVisibility(0);
        if (!Util.isNullOrNil(this.f209799d.f209473i) && !Util.isNullOrNil(this.f209799d.f209474j)) {
            BindCardOrder bindCardOrder2 = this.f209799d;
            ((TextView) findViewById(C0966R.C0970id.hsa)).setText(getString(C0966R.string.knb, new Object[]{bindCardOrder2.f209473i, bindCardOrder2.f209474j}));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.WalletBindCardResultUI", "onActivityResult %d %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1) {
            Log.m105924i("MicroMsg.WalletBindCardResultUI", "do query pay arawrd");
            WalletOrderInfoNewUI.C72287o oVar = this.f209806n;
            String str = oVar.f210172a;
            String str2 = oVar.f210173b;
            String str3 = oVar.f210174c;
            String str4 = oVar.f210175d;
            long j = oVar.f210178g;
            long j2 = oVar.f210179h;
            BindCardOrder bindCardOrder = this.f209799d;
            String str5 = bindCardOrder.f209472h;
            String str6 = bindCardOrder.f209475n;
            int i3 = bindCardOrder.f209476o;
            doSceneProgress(new C78340d0(str, str2, str3, str4, j, j2, str5, str6, i3, i3));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (C11171e.m11046c(21)) {
            if (C11171e.m11046c(23)) {
                getWindow().setStatusBarColor(getResources().getColor(C0966R.color.al6));
            } else {
                getWindow().setStatusBarColor(getResources().getColor(C0966R.color.BW_90));
            }
        }
        setContentViewVisibility(4);
        C79143a.m95768g(this);
        this.f209801f = (PayInfo) getInput().getParcelable("key_pay_info");
        getInput().getInt("key_pay_type", -1);
        BindCardOrder bindCardOrder = (BindCardOrder) getInput().getParcelable("key_bindcard_value_result");
        if (bindCardOrder == null) {
            bindCardOrder = new BindCardOrder();
        }
        this.f209799d = bindCardOrder;
        setContentViewVisibility(0);
        initView();
        this.f209797E = getProcess();
        this.f209810r.setText(this.f209799d.f209470f);
        mo99507I7(1);
        addSceneEndListener(1979);
        this.f209798F.alive();
        this.f209796D = true;
    }

    @Deprecated
    public Dialog onCreateDialog(int i) {
        C76879j.m92736g(getContext(), getString(C0966R.string.l0u), getResources().getStringArray(C0966R.array.f2610aw), "", new C5778f());
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f209798F.dead();
        removeSceneEndListener(1979);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        Bundle bundle = new Bundle();
        C79148e eVar = this.f209797E;
        if (eVar != null) {
            eVar.mo91264o(this, 0, bundle);
            return true;
        }
        finish();
        return true;
    }

    public void onResume() {
        super.onResume();
        Log.m105925i("MicroMsg.WalletBindCardResultUI", "onResume, isFirstInit: %s activityPromotions: %s, isClickTinyappActivity: %s, isClickActivity: %s, recommendTinyAppInfo: %s", Boolean.valueOf(this.f209796D), this.f209808p, Boolean.valueOf(this.f209794B), Boolean.valueOf(this.f209795C), this.f209805j);
        if (this.f209796D) {
            this.f209796D = false;
        } else if (this.f209808p != null && this.f209795C) {
            C72193b bVar = this.f209808p.f209478q;
            long j = bVar.f209715b;
            long j2 = bVar.f209719f;
            BindCardOrder bindCardOrder = this.f209799d;
            String str = bindCardOrder.f209472h;
            String str2 = bindCardOrder.f209475n;
            int i = bindCardOrder.f209476o;
            doSceneProgress(new C78340d0(this.f209808p.f209478q.f209714a + "", this.f209808p.f209478q.f209716c + "", this.f209808p.f209478q.f209717d + "", this.f209808p.f209478q.f209718e + "", j, j2, str, str2, i, i));
        } else if (this.f209794B && this.f209805j != null) {
            BindCardOrder bindCardOrder2 = this.f209799d;
            C72193b bVar2 = bindCardOrder2.f209478q;
            long j3 = bVar2.f209719f;
            long j4 = bVar2.f209715b;
            String str3 = bindCardOrder2.f209472h;
            String str4 = bindCardOrder2.f209475n;
            int i2 = bindCardOrder2.f209476o;
            doSceneProgress(new C78340d0(this.f209799d.f209478q.f209714a + "", this.f209799d.f209478q.f209716c + "", this.f209799d.f209478q.f209717d + "", this.f209799d.f209478q.f209718e + "", j3, j4, str3, str4, i2, i2));
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C78340d0) {
            if (i == 0 && i2 == 0) {
                C78340d0 d0Var = (C78340d0) yVar;
                WalletOrderInfoNewUI.C43379n nVar = new WalletOrderInfoNewUI.C43379n(d0Var.f229549e);
                if (this.f209806n != null) {
                    this.f209807o.put(d0Var.f229548d, nVar);
                    mo99509K7(false);
                    this.f209793A.setVisibility(0);
                } else if (this.f209794B) {
                    this.f209807o.put(d0Var.f229548d, nVar);
                    mo99509K7(false);
                    this.f209793A.setVisibility(0);
                }
            }
        } else if (yVar instanceof C78352s) {
            if (i == 0 && i2 == 0) {
                C78352s sVar = (C78352s) yVar;
                String str2 = sVar.f229604d;
                BindCardOrder bindCardOrder = this.f209808p;
                if (bindCardOrder != null && bindCardOrder.f209478q.f209714a == sVar.f229607g.f209478q.f209714a) {
                    Log.m105925i("MicroMsg.WalletBindCardResultUI", "activityAwardState: %s", bindCardOrder);
                    this.f209809q = str2;
                    mo99509K7(false);
                    this.f209793A.setVisibility(0);
                    if (!Util.isNullOrNil(sVar.f229605e) && !"3".equals(str2)) {
                        this.f209818z.setText(sVar.f229605e);
                    }
                }
                if (!"-1".equals(str2) && !"0".equals(str2) && !Util.isNullOrNil(sVar.f229606f)) {
                    C76879j.m92712F(this, sVar.f229606f, "", true);
                } else if ("0".equals(str2)) {
                    C76701a.makeText((Context) this, (CharSequence) !Util.isNullOrNil(sVar.f229606f) ? sVar.f229606f : getString(C0966R.string.l3h), 0).show();
                }
                return true;
            }
            if (Util.isNullOrNil(str)) {
                str = getString(C0966R.string.l_3);
            }
            C76879j.m92713G(this, str, (String) null, false, new C72215g(this));
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
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_core/ui/WalletBindCardResultUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
