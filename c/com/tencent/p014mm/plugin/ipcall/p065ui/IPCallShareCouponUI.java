package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.IPCallNewXmlInfoChangeEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C97625j3;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p12.C11800g;
import p156gj.C87200o;
import p156gj.C87203t;
import q12.C12028b;
import qe3.C89625d;
import r12.C12940b;
import te3.C49828ic2;
import te3.px4;

/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI */
public class IPCallShareCouponUI extends MMActivity implements C11385n {

    /* renamed from: A */
    public C12028b f19586A = new C12028b();

    /* renamed from: B */
    public String f19587B = null;

    /* renamed from: C */
    public String f19588C = null;

    /* renamed from: D */
    public String f19589D = null;

    /* renamed from: E */
    public LinkedList<px4> f19590E = null;

    /* renamed from: F */
    public IListener f19591F = new IListener<IPCallNewXmlInfoChangeEvent>(C40008f.f107254d) {
        {
            this.__eventId = 682820784;
        }

        public boolean callback(IEvent iEvent) {
            IPCallNewXmlInfoChangeEvent iPCallNewXmlInfoChangeEvent = (IPCallNewXmlInfoChangeEvent) iEvent;
            MMHandlerThread.postToMainThread(new C4681g1(this));
            return true;
        }
    };

    /* renamed from: G */
    public boolean f19592G = false;

    /* renamed from: d */
    public RelativeLayout f19593d;

    /* renamed from: e */
    public TextView f19594e;

    /* renamed from: f */
    public ImageView f19595f;

    /* renamed from: g */
    public RelativeLayout f19596g;

    /* renamed from: h */
    public TextView f19597h;

    /* renamed from: i */
    public LinearLayout f19598i;

    /* renamed from: j */
    public LinearLayout f19599j;

    /* renamed from: n */
    public LinearLayout f19600n;

    /* renamed from: o */
    public LinearLayout f19601o;

    /* renamed from: p */
    public ImageView f19602p;

    /* renamed from: q */
    public LinearLayout f19603q;

    /* renamed from: r */
    public TextView f19604r;

    /* renamed from: s */
    public TextView f19605s;

    /* renamed from: t */
    public TextView f19606t;

    /* renamed from: u */
    public ImageView f19607u;

    /* renamed from: v */
    public TextView f19608v;

    /* renamed from: w */
    public TextView f19609w;

    /* renamed from: x */
    public View f19610x;

    /* renamed from: y */
    public IPCallDynamicTextView f19611y;

    /* renamed from: z */
    public ProgressDialog f19612z;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallShareCouponUI$a */
    public class C4667a implements DialogInterface.OnClickListener {
        public C4667a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            IPCallShareCouponUI.this.finish();
        }
    }

    /* renamed from: H7 */
    public static void m4929H7(IPCallShareCouponUI iPCallShareCouponUI) {
        iPCallShareCouponUI.f19586A.f35023e++;
        C115669n.INSTANCE.idkeyStat(257, 2, 1, true);
        String string = MMApplicationContext.getContext().getString(C0966R.string.fuk);
        try {
            string = string + "&version=" + C89625d.f257841g + "&lang=" + LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()) + ("&uin=" + C86709a0.m107523b().mo121110g() + "&deviceName=" + URLEncoder.encode(C89625d.f257838d, "utf-8") + "&timeZone=" + URLEncoder.encode("" + Util.getTimeZoneOffset(), "utf-8") + "&imei=" + URLEncoder.encode(C87203t.m108270f(true), "utf-8") + "&deviceBrand=" + URLEncoder.encode(C89625d.f257836b, "utf-8") + "&deviceModel=" + URLEncoder.encode(C89625d.f257837c, "utf-8") + "&ostype=" + URLEncoder.encode(C87200o.f252872e, "utf-8") + "&clientSeqID=" + URLEncoder.encode(C86718e.m107547e(), "utf-8") + "&signature=" + URLEncoder.encode(Util.getSourceeMd5(MMApplicationContext.getContext()), "utf-8") + "&scene=0");
        } catch (UnsupportedEncodingException e) {
            Log.m105921e("MicroMsg.IPCallShareCouponUI", "[royle]UnsupportedEncodingException:%s", e.getMessage());
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("showShare", false);
        C88144b.m109791i(iPCallShareCouponUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: I7 */
    public static void m4930I7(IPCallShareCouponUI iPCallShareCouponUI) {
        iPCallShareCouponUI.f19586A.f35024f++;
        C115669n.INSTANCE.idkeyStat(257, 3, 1, true);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", iPCallShareCouponUI.getString(C0966R.string.ftq));
        intent.putExtra("showShare", false);
        C88144b.m109791i(iPCallShareCouponUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: J7 */
    public void mo5560J7() {
        if (!Util.isNullOrNil(this.f19588C)) {
            String str = this.f19587B;
            if (str == null) {
                IPCallDynamicTextView iPCallDynamicTextView = this.f19611y;
                String str2 = this.f19588C;
                iPCallDynamicTextView.mo175397b(str2, str2);
            } else {
                this.f19611y.mo175397b(str, this.f19588C);
            }
            this.f19587B = this.f19588C;
        }
        this.f19608v.getText();
        this.f19608v.setText(this.f19589D);
        if (Util.isNullOrNil(this.f19589D)) {
            this.f19608v.setVisibility(8);
        } else {
            this.f19608v.setVisibility(0);
        }
        StringBuffer stringBuffer = new StringBuffer("");
        LinkedList<px4> linkedList = this.f19590E;
        if (linkedList != null && linkedList.size() > 0) {
            Iterator<px4> it = this.f19590E.iterator();
            while (it.hasNext()) {
                px4 next = it.next();
                if (next != null && !Util.isNullOrNil(next.f140045d)) {
                    stringBuffer.append(next.f140045d);
                    stringBuffer.append(10);
                }
            }
        }
        if (!Util.isNullOrNil(stringBuffer.toString())) {
            if (stringBuffer.charAt(stringBuffer.length() - 1) == 10) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            this.f19609w.setText(stringBuffer.toString());
            this.f19609w.setVisibility(0);
        } else {
            this.f19609w.setText("");
            this.f19609w.setVisibility(8);
        }
        if (this.f19608v.getVisibility() == 0 && this.f19609w.getVisibility() == 0) {
            View view = this.f19610x;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        View view3 = this.f19610x;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponUI", "refreshView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b29;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x031c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            super.onCreate(r11)
            ob0.b0 r11 = eb0.C97625j3.m125815e()
            r0 = 257(0x101, float:3.6E-43)
            r11.mo123455a(r0, r10)
            com.tencent.mm.sdk.event.IListener r11 = r10.f19591F
            r11.alive()
            java.lang.Class<lc3.b> r11 = lc3.C10485b.class
            r0 = 2131831618(0x7f112b42, float:1.9296267E38)
            r10.setMMTitle((int) r0)
            com.tencent.mm.plugin.ipcall.ui.m1 r0 = new com.tencent.mm.plugin.ipcall.ui.m1
            r0.<init>(r10)
            r10.setBackBtn(r0)
            r10.removeAllOptionMenu()
            com.tencent.mm.plugin.ipcall.ui.l1 r0 = new com.tencent.mm.plugin.ipcall.ui.l1
            r0.<init>(r10)
            r1 = 0
            r2 = 2131756370(0x7f100552, float:1.9143646E38)
            r10.addIconOptionMenu(r1, r2, r0)
            r0 = 2131297586(0x7f090532, float:1.8213121E38)
            android.view.View r0 = r10.findViewById(r0)
            com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView r0 = (com.tencent.p014mm.plugin.ipcall.p065ui.IPCallDynamicTextView) r0
            r10.f19611y = r0
            r0 = 2131311884(0x7f093d0c, float:1.824212E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r10.f19593d = r0
            r0 = 2131311907(0x7f093d23, float:1.8242168E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f19594e = r0
            r0 = 2131311894(0x7f093d16, float:1.8242141E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.f19595f = r0
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_IPCALL_RECHARGE_SHOW_REDDOT_BOOLEAN
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.mo119685f(r2, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0079
            android.widget.ImageView r0 = r10.f19595f
            r0.setVisibility(r1)
        L_0x0079:
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERFINO_IPCALL_RECHARGE_STRING
            java.lang.String r4 = ""
            java.lang.Object r0 = r0.mo119685f(r2, r4)
            java.lang.String r0 = (java.lang.String) r0
            android.widget.TextView r2 = r10.f19594e
            r2.setText(r0)
            r0 = 2131311552(0x7f093bc0, float:1.8241448E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r10.f19596g = r0
            r0 = 2131310708(0x7f093874, float:1.8239736E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f19597h = r0
            r0 = 2131310705(0x7f093871, float:1.823973E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_IPCALL_PACKAGE_PURCHASE_STRING
            java.lang.Object r0 = r0.mo119685f(r2, r4)
            java.lang.String r0 = (java.lang.String) r0
            android.widget.TextView r2 = r10.f19597h
            r2.setText(r0)
            r0 = 2131300508(0x7f09109c, float:1.8219048E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f19608v = r0
            r0 = 2131310703(0x7f09386f, float:1.8239726E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f19609w = r0
            r0 = 2131313705(0x7f094429, float:1.8245814E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.f19610x = r0
            r0 = 2131301730(0x7f091562, float:1.8221526E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.f19598i = r0
            r0 = 2131310105(0x7f093619, float:1.8238513E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.f19607u = r0
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_IPCALL_EXCHANGE_RECORD_SHOW_REDDOT_BOOLEAN
            java.lang.Object r0 = r0.mo119685f(r2, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0114
            android.widget.ImageView r0 = r10.f19607u
            r0.setVisibility(r1)
        L_0x0114:
            r0 = 2131310347(0x7f09370b, float:1.8239003E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f19604r = r0
            r0 = 2131296756(0x7f0901f4, float:1.8211438E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f19605s = r0
            r0 = 2131314389(0x7f0946d5, float:1.8247202E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.f19606t = r0
            r0 = 2131313427(0x7f094313, float:1.824525E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.f19599j = r0
            r0 = 2131309946(0x7f09357a, float:1.823819E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.f19600n = r0
            r0 = 2131313024(0x7f094180, float:1.8244433E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.f19603q = r0
            r0 = 2131313025(0x7f094181, float:1.8244435E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 2131309574(0x7f093406, float:1.8237436E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.f19601o = r0
            r0 = 2131309575(0x7f093407, float:1.8237438E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.f19602p = r0
            eb0.c r0 = eb0.C97625j3.m125812b()
            com.tencent.mm.storage.v1 r0 = r0.mo105906u()
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_IPCALL_MSG_CENTER_SHOW_REDDOT_BOOLEAN
            java.lang.Object r0 = r0.mo119685f(r2, r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0190
            android.widget.ImageView r0 = r10.f19602p
            r0.setVisibility(r1)
        L_0x0190:
            boolean r0 = t12.C110899d.m151193g()
            r2 = 1
            if (r0 == 0) goto L_0x0198
            goto L_0x01af
        L_0x0198:
            k40.a r0 = f40.C86709a0.m107533q(r11)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r3 = "WCOPurchaseSwitch"
            int r0 = r0.mo107404b(r3, r1)
            if (r0 != r2) goto L_0x01ac
            r0 = 1
            goto L_0x01ad
        L_0x01ac:
            r0 = 0
        L_0x01ad:
            if (r0 == 0) goto L_0x01b1
        L_0x01af:
            r0 = 1
            goto L_0x01b2
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            r3 = 8
            if (r0 == 0) goto L_0x01bb
            android.widget.RelativeLayout r0 = r10.f19593d
            r0.setVisibility(r3)
        L_0x01bb:
            boolean r0 = t12.C110899d.m151193g()
            if (r0 == 0) goto L_0x01c2
            goto L_0x01d6
        L_0x01c2:
            k40.a r0 = f40.C86709a0.m107533q(r11)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r4 = "WCOPackagePurchaseSwitch"
            int r0 = r0.mo107404b(r4, r1)
            if (r0 == 0) goto L_0x01d6
            r0 = 1
            goto L_0x01d7
        L_0x01d6:
            r0 = 0
        L_0x01d7:
            if (r0 == 0) goto L_0x01de
            android.widget.RelativeLayout r0 = r10.f19596g
            r0.setVisibility(r1)
        L_0x01de:
            k40.a r0 = f40.C86709a0.m107533q(r11)
            lc3.b r0 = (lc3.C10485b) r0
            pj.f r0 = r0.vh0()
            java.lang.String r4 = "WCOAccountDetailSwitch"
            int r0 = r0.mo107404b(r4, r1)
            if (r0 != r2) goto L_0x01f2
            r0 = 1
            goto L_0x01f3
        L_0x01f2:
            r0 = 0
        L_0x01f3:
            if (r0 == 0) goto L_0x01fa
            android.widget.LinearLayout r0 = r10.f19598i
            r0.setVisibility(r3)
        L_0x01fa:
            boolean r0 = t12.C110899d.m151193g()
            if (r0 == 0) goto L_0x0201
            goto L_0x021a
        L_0x0201:
            k40.a r11 = f40.C86709a0.m107533q(r11)
            lc3.b r11 = (lc3.C10485b) r11
            pj.f r11 = r11.vh0()
            java.lang.String r0 = "WCOInviteFriend"
            int r11 = r11.mo107404b(r0, r1)
            if (r11 != r2) goto L_0x0215
            r11 = 1
            goto L_0x0216
        L_0x0215:
            r11 = 0
        L_0x0216:
            if (r11 == 0) goto L_0x0219
            goto L_0x021a
        L_0x0219:
            r2 = 0
        L_0x021a:
            if (r2 == 0) goto L_0x0221
            android.widget.LinearLayout r11 = r10.f19599j
            r11.setVisibility(r3)
        L_0x0221:
            android.widget.TextView r11 = r10.f19604r
            com.tencent.mm.plugin.ipcall.ui.n1 r0 = new com.tencent.mm.plugin.ipcall.ui.n1
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            android.widget.TextView r11 = r10.f19605s
            com.tencent.mm.plugin.ipcall.ui.o1 r0 = new com.tencent.mm.plugin.ipcall.ui.o1
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            android.widget.LinearLayout r11 = r10.f19598i
            com.tencent.mm.plugin.ipcall.ui.p1 r0 = new com.tencent.mm.plugin.ipcall.ui.p1
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            android.widget.LinearLayout r11 = r10.f19599j
            com.tencent.mm.plugin.ipcall.ui.q1 r0 = new com.tencent.mm.plugin.ipcall.ui.q1
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            android.widget.LinearLayout r11 = r10.f19601o
            com.tencent.mm.plugin.ipcall.ui.r1 r0 = new com.tencent.mm.plugin.ipcall.ui.r1
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            android.widget.LinearLayout r11 = r10.f19600n
            com.tencent.mm.plugin.ipcall.ui.s1 r0 = new com.tencent.mm.plugin.ipcall.ui.s1
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            android.widget.RelativeLayout r11 = r10.f19593d
            com.tencent.mm.plugin.ipcall.ui.t1 r0 = new com.tencent.mm.plugin.ipcall.ui.t1
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            android.widget.RelativeLayout r11 = r10.f19596g
            com.tencent.mm.plugin.ipcall.ui.h1 r0 = new com.tencent.mm.plugin.ipcall.ui.h1
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            android.widget.LinearLayout r11 = r10.f19603q
            com.tencent.mm.plugin.ipcall.ui.i1 r0 = new com.tencent.mm.plugin.ipcall.ui.i1
            r0.<init>(r10)
            r11.setOnClickListener(r0)
            te3.ic2 r11 = t12.C110899d.m151191e()
            if (r11 == 0) goto L_0x0291
            java.lang.String r0 = r11.f135212j
            r10.f19588C = r0
            java.lang.String r0 = r11.f135213n
            r10.f19589D = r0
            java.util.LinkedList<te3.px4> r11 = r11.f135222w
            r10.f19590E = r11
            r10.mo5560J7()
            goto L_0x02b7
        L_0x0291:
            com.tencent.mm.plugin.ipcall.ui.IPCallDynamicTextView r11 = r10.f19611y
            java.lang.String r0 = "0"
            r11.setText(r0)
            androidx.appcompat.app.AppCompatActivity r4 = r10.getContext()
            r11 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r5 = r10.getString(r11)
            r11 = 2131831567(0x7f112b0f, float:1.9296163E38)
            java.lang.String r6 = r10.getString(r11)
            r7 = 1
            r8 = 1
            com.tencent.mm.plugin.ipcall.ui.j1 r9 = new com.tencent.mm.plugin.ipcall.ui.j1
            r9.<init>(r10)
            qo3.i0 r11 = nj3.C76879j.m92723Q(r4, r5, r6, r7, r8, r9)
            r10.f19612z = r11
        L_0x02b7:
            boolean r11 = t12.C110899d.m151193g()
            if (r11 == 0) goto L_0x031c
            r11 = 2131831674(0x7f112b7a, float:1.929638E38)
            java.lang.String r11 = r10.getString(r11)
            r0 = 2131831673(0x7f112b79, float:1.9296378E38)
            java.lang.String r0 = r10.getString(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.mm.plugin.ipcall.ui.k1 r2 = new com.tencent.mm.plugin.ipcall.ui.k1
            r2.<init>(r10)
            android.text.Spannable$Factory r4 = android.text.Spannable.Factory.getInstance()
            android.text.Spannable r0 = r4.newSpannable(r0)
            int r11 = r11.length()
            int r4 = r0.length()
            r5 = 33
            if (r11 < 0) goto L_0x0301
            if (r11 >= r4) goto L_0x0301
            if (r4 < 0) goto L_0x0301
            int r6 = r0.length()
            if (r4 > r6) goto L_0x0301
            r0.setSpan(r2, r11, r4, r5)
            goto L_0x0308
        L_0x0301:
            int r11 = r0.length()
            r0.setSpan(r2, r1, r11, r5)
        L_0x0308:
            android.widget.TextView r11 = r10.f19606t
            r11.setText(r0)
            android.widget.TextView r11 = r10.f19606t
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r11.setMovementMethod(r0)
            android.widget.TextView r11 = r10.f19606t
            r11.setVisibility(r1)
            goto L_0x0321
        L_0x031c:
            android.widget.TextView r11 = r10.f19606t
            r11.setVisibility(r3)
        L_0x0321:
            r11 = 2131307057(0x7f092a31, float:1.823233E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r11 == 0) goto L_0x033f
            android.widget.RelativeLayout r0 = r10.f19593d
            int r0 = r0.getVisibility()
            if (r0 != r3) goto L_0x033f
            android.widget.RelativeLayout r0 = r10.f19596g
            int r0 = r0.getVisibility()
            if (r0 != r3) goto L_0x033f
            r11.setVisibility(r3)
        L_0x033f:
            r11 = 2131307059(0x7f092a33, float:1.8232335E38)
            android.view.View r11 = r10.findViewById(r11)
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            if (r11 == 0) goto L_0x035d
            android.widget.LinearLayout r0 = r10.f19599j
            int r0 = r0.getVisibility()
            if (r0 != r3) goto L_0x035d
            android.widget.LinearLayout r0 = r10.f19600n
            int r0 = r0.getVisibility()
            if (r0 != r3) goto L_0x035d
            r11.setVisibility(r3)
        L_0x035d:
            q12.b r11 = r10.f19586A
            r11.mo11893d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ipcall.p065ui.IPCallShareCouponUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(257, this);
        this.f19591F.dead();
        C12028b bVar = this.f19586A;
        bVar.getClass();
        bVar.f35021c = Util.nowMilliSecond();
        this.f19586A.mo11891b();
    }

    public void onResume() {
        super.onResume();
        if (C12940b.f36960b == null) {
            C12940b.f36960b = new C12940b();
        }
        C12940b.f36960b.mo12490a(false);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C11800g)) {
            return;
        }
        if (i == 0 && i2 == 0) {
            C49828ic2 ic22 = ((C11800g) yVar).f34521f;
            String str2 = ic22.f135206d;
            this.f19588C = ic22.f135212j;
            this.f19589D = ic22.f135213n;
            this.f19590E = ic22.f135222w;
            mo5560J7();
            ProgressDialog progressDialog = this.f19612z;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f19612z.dismiss();
                return;
            }
            return;
        }
        ProgressDialog progressDialog2 = this.f19612z;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            this.f19612z.dismiss();
            C76879j.m92749t(getContext(), getString(C0966R.string.fue), getString(C0966R.string.fu8), new C4667a());
        }
    }
}
