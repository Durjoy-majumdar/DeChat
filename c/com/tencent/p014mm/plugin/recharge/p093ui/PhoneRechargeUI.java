package com.tencent.p014mm.plugin.recharge.p093ui;

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.telephony.PhoneNumberUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.autogen.events.WalletPayResultEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83018k;
import com.tencent.p014mm.plugin.recharge.p093ui.form.InstantAutoCompleteTextView;
import com.tencent.p014mm.plugin.recharge.p093ui.form.MallFormView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.mall.MallFunction;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.wallet_core.p137ui.C75197d0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import f40.C86709a0;
import ie3.C76324c;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import jg2.C76415b;
import kg2.C46726g;
import kg2.C76574a;
import kg2.C76575b;
import kg2.C76576f;
import kg3.C76577a;
import lg2.C76674c;
import lg2.C76676e;
import lg2.C76677f;
import lg2.C76678g;
import lg2.C76679h;
import lg2.C76680i;
import lg2.C76681j;
import lg2.C76686o;
import nj3.C76879j;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import qo3.C77398g;
import y43.C79031e;
import y43.C79036x;
import y43.C79037y;
import yq3.C79144b;

/* renamed from: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI */
public class PhoneRechargeUI extends MMActivity implements C11385n, C76686o.C76690d {

    /* renamed from: Q */
    public static final /* synthetic */ int f203517Q = 0;

    /* renamed from: A */
    public ArrayList<C79037y> f203518A = null;

    /* renamed from: B */
    public ArrayList<C79037y> f203519B = null;

    /* renamed from: C */
    public C79031e f203520C = null;

    /* renamed from: D */
    public C79031e f203521D = null;

    /* renamed from: E */
    public C79031e f203522E = null;

    /* renamed from: F */
    public C79031e f203523F = null;

    /* renamed from: G */
    public C79031e f203524G = null;

    /* renamed from: H */
    public String f203525H = "";

    /* renamed from: I */
    public boolean f203526I = false;

    /* renamed from: J */
    public C76681j f203527J = null;

    /* renamed from: K */
    public C79036x f203528K = null;

    /* renamed from: L */
    public boolean f203529L = false;

    /* renamed from: M */
    public List<String[]> f203530M;

    /* renamed from: N */
    public boolean f203531N;

    /* renamed from: P */
    public IListener f203532P = new IListener<WalletPayResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 520089918;
        }

        public boolean callback(IEvent iEvent) {
            WalletPayResultEvent walletPayResultEvent = (WalletPayResultEvent) iEvent;
            if (walletPayResultEvent instanceof WalletPayResultEvent) {
                WalletPayResultEvent.C67828a aVar = walletPayResultEvent.f194085d;
                if (aVar.f194091f) {
                    Log.m105922f("MicroMsg.PhoneRechargeUI", "WalletPayResultEvent is from kinda, ScanQRCodePay");
                    return false;
                }
                if (aVar.f194088c != -1) {
                    Log.m105924i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : cancel");
                } else if (!PhoneRechargeUI.this.f203526I) {
                    Log.m105924i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : ok");
                    String text = PhoneRechargeUI.this.f203536g.getText();
                    C76574a aVar2 = PhoneRechargeUI.this.f203527J.f224371b;
                    C76415b.wx0().vx0(new C76574a(text, aVar2 != null ? Util.nullAsNil(aVar2.f224104b) : "", 0));
                    PhoneRechargeUI.this.finish();
                    PhoneRechargeUI.this.f203526I = true;
                }
                return true;
            }
            Log.m105922f("MicroMsg.PhoneRechargeUI", "hy: mismatched event");
            return false;
        }
    };

    /* renamed from: d */
    public View f203533d = null;

    /* renamed from: e */
    public ImageView f203534e = null;

    /* renamed from: f */
    public TextView f203535f = null;

    /* renamed from: g */
    public MallFormView f203536g = null;

    /* renamed from: h */
    public TextView f203537h = null;

    /* renamed from: i */
    public TextView f203538i = null;

    /* renamed from: j */
    public GridView f203539j = null;

    /* renamed from: n */
    public GridView f203540n = null;

    /* renamed from: o */
    public TextView f203541o = null;

    /* renamed from: p */
    public TextView f203542p = null;

    /* renamed from: q */
    public TextView f203543q = null;

    /* renamed from: r */
    public TextView f203544r = null;

    /* renamed from: s */
    public TextView f203545s = null;

    /* renamed from: t */
    public TextView f203546t = null;

    /* renamed from: u */
    public C70455e f203547u = null;

    /* renamed from: v */
    public C70455e f203548v = null;

    /* renamed from: w */
    public Dialog f203549w = null;

    /* renamed from: x */
    public MallFunction f203550x = null;

    /* renamed from: y */
    public String f203551y = "";

    /* renamed from: z */
    public int f203552z;

    /* renamed from: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$a */
    public class C70429a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f203554d;

        public C70429a(PhoneRechargeUI phoneRechargeUI, C117747y yVar) {
            this.f203554d = yVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f203554d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$b */
    public class C70430b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f203555d;

        public C70430b(PhoneRechargeUI phoneRechargeUI, C117747y yVar) {
            this.f203555d = yVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f203555d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$c */
    public class C70431c implements MenuItem.OnMenuItemClickListener {
        public C70431c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            PhoneRechargeUI phoneRechargeUI = PhoneRechargeUI.this;
            C79031e eVar = phoneRechargeUI.f203524G;
            if (!PhoneRechargeUI.m82986J7(phoneRechargeUI, eVar.f232063f, eVar.f232064g, eVar.f232062e, "")) {
                try {
                    String decode = URLDecoder.decode(PhoneRechargeUI.this.f203524G.f232061d, "utf-8");
                    PhoneRechargeUI phoneRechargeUI2 = PhoneRechargeUI.this;
                    PhoneRechargeUI.m82988L7(phoneRechargeUI2, decode, phoneRechargeUI2.f203524G.f232062e, "");
                } catch (UnsupportedEncodingException e) {
                    Log.printErrStackTrace("MicroMsg.PhoneRechargeUI", e, "", new Object[0]);
                }
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$d */
    public class C70432d implements View.OnClickListener {
        public C70432d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            PhoneRechargeUI phoneRechargeUI = PhoneRechargeUI.this;
            C79031e eVar = phoneRechargeUI.f203523F;
            if (!PhoneRechargeUI.m82986J7(phoneRechargeUI, eVar.f232063f, eVar.f232064g, eVar.f232062e, "")) {
                PhoneRechargeUI phoneRechargeUI2 = PhoneRechargeUI.this;
                String K7 = PhoneRechargeUI.m82987K7(phoneRechargeUI2, phoneRechargeUI2.f203523F.f232061d);
                Log.m105919d("MicroMsg.PhoneRechargeUI", "go to h5: %s", K7);
                PhoneRechargeUI phoneRechargeUI3 = PhoneRechargeUI.this;
                PhoneRechargeUI.m82988L7(phoneRechargeUI3, K7, phoneRechargeUI3.f203523F.f232062e, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$e */
    public class C70433e implements View.OnClickListener {
        public C70433e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            PhoneRechargeUI phoneRechargeUI = PhoneRechargeUI.this;
            C79031e eVar = phoneRechargeUI.f203520C;
            if (!PhoneRechargeUI.m82986J7(phoneRechargeUI, eVar.f232063f, eVar.f232064g, eVar.f232062e, "")) {
                PhoneRechargeUI phoneRechargeUI2 = PhoneRechargeUI.this;
                String K7 = PhoneRechargeUI.m82987K7(phoneRechargeUI2, phoneRechargeUI2.f203520C.f232061d);
                Log.m105919d("MicroMsg.PhoneRechargeUI", "go to h5: %s", K7);
                PhoneRechargeUI phoneRechargeUI3 = PhoneRechargeUI.this;
                PhoneRechargeUI.m82988L7(phoneRechargeUI3, K7, phoneRechargeUI3.f203520C.f232062e, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$f */
    public class C70434f implements View.OnClickListener {
        public C70434f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            PhoneRechargeUI phoneRechargeUI = PhoneRechargeUI.this;
            C79031e eVar = phoneRechargeUI.f203521D;
            if (!PhoneRechargeUI.m82986J7(phoneRechargeUI, eVar.f232063f, eVar.f232064g, eVar.f232062e, "")) {
                PhoneRechargeUI phoneRechargeUI2 = PhoneRechargeUI.this;
                String K7 = PhoneRechargeUI.m82987K7(phoneRechargeUI2, phoneRechargeUI2.f203521D.f232061d);
                Log.m105919d("MicroMsg.PhoneRechargeUI", "go to h5: %s", K7);
                PhoneRechargeUI phoneRechargeUI3 = PhoneRechargeUI.this;
                PhoneRechargeUI.m82988L7(phoneRechargeUI3, K7, phoneRechargeUI3.f203521D.f232062e, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$g */
    public class C70435g implements View.OnClickListener {
        public C70435g() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            PhoneRechargeUI phoneRechargeUI = PhoneRechargeUI.this;
            C79031e eVar = phoneRechargeUI.f203522E;
            if (!PhoneRechargeUI.m82986J7(phoneRechargeUI, eVar.f232063f, eVar.f232064g, eVar.f232062e, "")) {
                PhoneRechargeUI phoneRechargeUI2 = PhoneRechargeUI.this;
                String K7 = PhoneRechargeUI.m82987K7(phoneRechargeUI2, phoneRechargeUI2.f203522E.f232061d);
                Log.m105919d("MicroMsg.PhoneRechargeUI", "go to h5: %s", K7);
                PhoneRechargeUI phoneRechargeUI3 = PhoneRechargeUI.this;
                PhoneRechargeUI.m82988L7(phoneRechargeUI3, K7, phoneRechargeUI3.f203522E.f232062e, "");
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$h */
    public class C70436h implements Runnable {
        public C70436h() {
        }

        public void run() {
            PhoneRechargeUI.this.f203536g.mo97093a();
        }
    }

    /* renamed from: com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$i */
    public class C70437i implements C76879j.C76886k {

        /* renamed from: a */
        public final /* synthetic */ List f203562a;

        /* renamed from: b */
        public final /* synthetic */ String f203563b;

        public C70437i(List list, String str) {
            this.f203562a = list;
            this.f203563b = str;
        }

        /* renamed from: a */
        public void mo97047a(int i) {
            Log.m105919d("MicroMsg.PhoneRechargeUI", "choose: %d", Integer.valueOf(i));
            PhoneRechargeUI.this.f203527J.mo106950b(new C76574a((String) this.f203562a.get(i), this.f203563b, 1));
            PhoneRechargeUI phoneRechargeUI = PhoneRechargeUI.this;
            phoneRechargeUI.getClass();
            C86709a0.m107524d().mo123460f(new C76576f(phoneRechargeUI.f203536g.getText(), 0));
        }
    }

    /* renamed from: H7 */
    public static boolean m82984H7(PhoneRechargeUI phoneRechargeUI, C79037y yVar) {
        String str;
        C76574a aVar = phoneRechargeUI.f203527J.f224371b;
        if (aVar != null) {
            String text = phoneRechargeUI.f203536g.getText();
            String str2 = null;
            int i = phoneRechargeUI.f203552z;
            int i2 = 2;
            if (i == 1) {
                str = phoneRechargeUI.getString(C0966R.string.l6r);
                i2 = 3;
            } else if (i == 2 && aVar.f224106d != 3) {
                str = phoneRechargeUI.getString(C0966R.string.gow, new Object[]{text, phoneRechargeUI.getString(C0966R.string.f361607l71), yVar.f232102e});
            } else if (aVar.f224106d != 1 || !Util.isNullOrNil(aVar.f224104b)) {
                int i3 = aVar.f224106d;
                if (i3 == 0) {
                    str = !Util.isNullOrNil(aVar.f224105c) ? phoneRechargeUI.getString(C0966R.string.gox, new Object[]{text}) : phoneRechargeUI.getString(C0966R.string.gov, new Object[]{text, phoneRechargeUI.getString(C0966R.string.l6y)});
                    i2 = 5;
                } else if (i3 == 3 || yVar.f232111q != 1) {
                    str = null;
                    i2 = 0;
                } else {
                    String str3 = !Util.isNullOrNil(aVar.f224104b) ? aVar.f224104b : !Util.isNullOrNil(aVar.f224105c) ? aVar.f224105c : "";
                    if (!Util.isNullOrNil(str3)) {
                        str2 = phoneRechargeUI.getString(C0966R.string.gow, new Object[]{text, str3, yVar.f232102e});
                    }
                    str = str2;
                    i2 = 1;
                }
            } else {
                str = phoneRechargeUI.getString(C0966R.string.gov, new Object[]{phoneRechargeUI.f203536g.getText(), phoneRechargeUI.getString(C0966R.string.f361607l71)});
                i2 = 4;
            }
            if (!Util.isNullOrNil(str)) {
                C77398g A = C76879j.m92707A(phoneRechargeUI, str, "", phoneRechargeUI.getString(C0966R.string.goy), phoneRechargeUI.getString(C0966R.string.bj_), new C70471q(phoneRechargeUI, yVar, i2), new C5040r(phoneRechargeUI, i2));
                if (A == null) {
                    return false;
                }
                A.setCanceledOnTouchOutside(false);
                return false;
            }
        }
        return true;
    }

    /* renamed from: I7 */
    public static void m82985I7(PhoneRechargeUI phoneRechargeUI, C79037y yVar) {
        String str = phoneRechargeUI.f203551y;
        String str2 = phoneRechargeUI.f203550x.f209731d;
        String str3 = yVar.f232101d;
        StringBuilder sb = new StringBuilder();
        sb.append("mobile=");
        sb.append(C76575b.m92141a(phoneRechargeUI.f203536g.getText()));
        sb.append("&");
        sb.append("markup");
        sb.append("=");
        C76574a aVar = phoneRechargeUI.f203527J.f224371b;
        sb.append(aVar != null ? aVar.f224104b : "");
        phoneRechargeUI.mo97036M7(new C46726g(str, str2, str3, sb.toString()), true);
        C115669n.INSTANCE.mo160131h(17620, yVar.f232102e, yVar.f232103f, 3);
    }

    /* renamed from: J7 */
    public static boolean m82986J7(PhoneRechargeUI phoneRechargeUI, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        String str7;
        C76574a aVar;
        phoneRechargeUI.getClass();
        if (Util.isNullOrNil(str) || Util.isNullOrNil(str2)) {
            return false;
        }
        C76681j jVar = phoneRechargeUI.f203527J;
        if (jVar == null || (aVar = jVar.f224371b) == null) {
            str5 = "";
            str7 = str5;
            str6 = str7;
        } else {
            str7 = aVar.f224103a;
            str6 = aVar.f224104b;
            str5 = aVar.f224106d == 3 ? "1" : "0";
        }
        String replace = str2.replace("{phone}", str7).replace("{remark}", str6).replace("{isbind}", str5);
        Log.m105925i("MicroMsg.PhoneRechargeUI", "weappID: %s, weappPath: %s", str, replace);
        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
        StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
        aVar2.f9526a = str;
        aVar2.f9527b = Util.nullAs(replace, "");
        StartAppBrandUIFromOuterEvent.C1142a aVar3 = startAppBrandUIFromOuterEvent.f9522d;
        aVar3.f9529d = 1098;
        aVar3.f9528c = 0;
        startAppBrandUIFromOuterEvent.publish();
        C115669n.INSTANCE.mo160131h(17620, str3, str4, 2, str);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r6 = r6.f224371b;
     */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m82987K7(com.tencent.p014mm.plugin.recharge.p093ui.PhoneRechargeUI r8, java.lang.String r9) {
        /*
            r8.getClass()
            java.lang.String r0 = "%7Bremark%7D"
            java.lang.String r1 = "%7Bphone%7D"
            java.lang.String r2 = "utf-8"
            java.lang.String r3 = "MicroMsg.PhoneRechargeUI"
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x0016
            goto L_0x00b9
        L_0x0016:
            r4 = 0
            lg2.j r6 = r8.f203527J     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            if (r6 == 0) goto L_0x002e
            kg2.a r6 = r6.f224371b     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            if (r6 == 0) goto L_0x002e
            java.lang.String r6 = r6.f224104b     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            if (r6 != 0) goto L_0x002e
            lg2.j r6 = r8.f203527J     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            kg2.a r6 = r6.f224371b     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            java.lang.String r6 = r6.f224104b     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            goto L_0x002f
        L_0x002e:
            r6 = r5
        L_0x002f:
            r7 = 2131839618(0x7f114a82, float:1.9312493E38)
            java.lang.String r7 = r8.getString(r7)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            boolean r7 = r6.equals(r7)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            if (r7 == 0) goto L_0x003e
            java.lang.String r6 = "WeChatAccountBindNumber"
        L_0x003e:
            com.tencent.mm.plugin.recharge.ui.form.MallFormView r8 = r8.f203536g     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            java.lang.String r8 = r8.getText()     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r2)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r2)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            java.lang.String r7 = "http://"
            boolean r7 = r9.startsWith(r7)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            if (r7 != 0) goto L_0x0085
            java.lang.String r7 = "https://"
            boolean r7 = r9.startsWith(r7)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            if (r7 == 0) goto L_0x005d
            goto L_0x0085
        L_0x005d:
            java.lang.String r0 = "old url"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            java.lang.String r0 = java.net.URLDecoder.decode(r9, r2)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            java.lang.String r0 = "?phone=%s&remark=%s"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            r2[r4] = r8     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            r8 = 1
            r2[r8] = r6     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            java.lang.String r8 = java.lang.String.format(r0, r2)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            r1.append(r8)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            java.lang.String r5 = r1.toString()     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            goto L_0x00b9
        L_0x0085:
            java.lang.String r2 = "new url"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            int r2 = r9.indexOf(r1)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            if (r2 <= 0) goto L_0x0096
            java.lang.String r8 = r9.replace(r1, r8)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            goto L_0x009d
        L_0x0096:
            java.lang.String r1 = "{phone}"
            java.lang.String r8 = r9.replace(r1, r8)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
        L_0x009d:
            r9 = r8
            int r8 = r9.indexOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            if (r8 <= 0) goto L_0x00a9
            java.lang.String r8 = r9.replace(r0, r6)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r8 = "{remark}"
            java.lang.String r8 = r9.replace(r8, r6)     // Catch:{ UnsupportedEncodingException -> 0x00b2 }
        L_0x00b0:
            r5 = r8
            goto L_0x00b9
        L_0x00b2:
            r8 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r8, r5, r0)
            r5 = r9
        L_0x00b9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recharge.p093ui.PhoneRechargeUI.m82987K7(com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI, java.lang.String):java.lang.String");
    }

    /* renamed from: L7 */
    public static void m82988L7(PhoneRechargeUI phoneRechargeUI, String str, String str2, String str3) {
        phoneRechargeUI.getClass();
        try {
            Log.m105919d("MicroMsg.PhoneRechargeUI", "url: %s", str);
            Intent intent = new Intent();
            intent.putExtra("rawUrl", str);
            C75228t.m90217J(phoneRechargeUI.getContext(), intent);
            C115669n.INSTANCE.mo160131h(17620, str2, str3, 1, str);
        } catch (Exception unused) {
            Log.m105921e("MicroMsg.PhoneRechargeUI", "hy: url decode failed: raw url: %s", str);
        }
    }

    /* renamed from: M7 */
    public final void mo97036M7(C117747y yVar, boolean z) {
        Dialog dialog = this.f203549w;
        if (dialog == null || (dialog != null && !dialog.isShowing())) {
            if (z) {
                this.f203549w = C75197d0.m90164e(getContext(), true, new C70429a(this, yVar));
            } else {
                this.f203549w = C75197d0.m90163d(getContext(), true, false, new C70430b(this, yVar));
            }
        }
        C86709a0.m107524d().mo123460f(yVar);
    }

    /* renamed from: N7 */
    public final void mo97037N7() {
        this.f203518A = new ArrayList<>();
        C79037y yVar = new C79037y();
        yVar.f232102e = getString(C0966R.string.l6i);
        yVar.f232104g = 0;
        C79037y yVar2 = new C79037y();
        yVar2.f232102e = getString(C0966R.string.l6j);
        yVar2.f232104g = 0;
        C79037y yVar3 = new C79037y();
        yVar3.f232102e = getString(C0966R.string.l6k);
        yVar3.f232104g = 0;
        C79037y yVar4 = new C79037y();
        yVar4.f232102e = getString(C0966R.string.l6l);
        yVar4.f232104g = 0;
        C79037y yVar5 = new C79037y();
        yVar5.f232102e = getString(C0966R.string.l6m);
        yVar5.f232104g = 0;
        C79037y yVar6 = new C79037y();
        yVar6.f232102e = getString(C0966R.string.l6n);
        yVar6.f232104g = 0;
        this.f203518A.add(yVar);
        this.f203518A.add(yVar2);
        this.f203518A.add(yVar3);
        this.f203518A.add(yVar4);
        this.f203518A.add(yVar5);
        this.f203518A.add(yVar6);
        this.f203519B = new ArrayList<>();
        C79037y yVar7 = new C79037y();
        yVar7.f232102e = getString(C0966R.string.l6o);
        yVar7.f232104g = 0;
        C79037y yVar8 = new C79037y();
        yVar8.f232102e = getString(C0966R.string.l6p);
        yVar8.f232104g = 0;
        C79037y yVar9 = new C79037y();
        yVar9.f232102e = getString(C0966R.string.l6q);
        yVar9.f232104g = 0;
        this.f203519B.add(yVar7);
        this.f203519B.add(yVar8);
        this.f203519B.add(yVar9);
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0285  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x028e  */
    /* renamed from: O7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo97038O7(boolean r16, boolean r17) {
        /*
            r15 = this;
            r0 = r15
            y43.x r1 = r0.f203528K
            java.lang.String r2 = "MicroMsg.PhoneRechargeUI"
            r3 = 1
            r4 = 8
            r5 = 0
            if (r1 == 0) goto L_0x00b9
            if (r1 == 0) goto L_0x0059
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_PHONE_RECHARGE_CLOSED_BANNER_STRING
            java.lang.String r7 = ""
            java.lang.Object r1 = r1.mo119685f(r6, r7)
            java.lang.String r1 = (java.lang.String) r1
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r6 != 0) goto L_0x0052
            java.lang.String r6 = ";"
            java.lang.String[] r1 = r1.split(r6)
            if (r1 == 0) goto L_0x004c
            int r6 = r1.length
            r7 = 0
        L_0x002f:
            if (r7 >= r6) goto L_0x004c
            r8 = r1[r7]
            if (r8 == 0) goto L_0x0049
            y43.x r9 = r0.f203528K
            int r9 = r9.f232096d
            java.lang.String r9 = java.lang.String.valueOf(r9)
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0049
            java.lang.String r1 = "hy: found closed. "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x005e
        L_0x0049:
            int r7 = r7 + 1
            goto L_0x002f
        L_0x004c:
            java.lang.String r1 = "hy: not found closed banner."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            goto L_0x0057
        L_0x0052:
            java.lang.String r1 = "hy: no banner before, show"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
        L_0x0057:
            r1 = 0
            goto L_0x005f
        L_0x0059:
            java.lang.String r1 = "hy: no banner"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
        L_0x005e:
            r1 = 1
        L_0x005f:
            if (r1 != 0) goto L_0x00b9
            android.view.View r1 = r0.f203533d
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r14.mo10233c(r6)
            java.lang.Object[] r7 = r14.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI"
            java.lang.String r9 = "updateViews"
            java.lang.String r10 = "(ZZ)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r14.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI"
            java.lang.String r8 = "updateViews"
            java.lang.String r9 = "(ZZ)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r1
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            android.widget.TextView r1 = r0.f203535f
            y43.x r6 = r0.f203528K
            java.lang.String r6 = r6.f232097e
            r1.setText(r6)
            java.lang.String r1 = "hy: Show banner!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            r1 = 6
            qe3.C77329i.m93195a(r1, r5)
            goto L_0x0103
        L_0x00b9:
            android.view.View r1 = r0.f203533d
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r14.mo10233c(r6)
            java.lang.Object[] r7 = r14.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI"
            java.lang.String r9 = "updateViews"
            java.lang.String r10 = "(ZZ)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r6 = r1
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r6 = r14.mo10231a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r1.setVisibility(r6)
            java.lang.String r7 = "com/tencent/mm/plugin/recharge/ui/PhoneRechargeUI"
            java.lang.String r8 = "updateViews"
            java.lang.String r9 = "(ZZ)V"
            java.lang.String r10 = "android/view/View_EXEC_"
            java.lang.String r11 = "setVisibility"
            java.lang.String r12 = "(I)V"
            r6 = r1
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r1 = "hy: dismiss banner!"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
        L_0x0103:
            com.tencent.mm.plugin.recharge.ui.e r1 = r0.f203547u
            java.util.ArrayList<y43.y> r6 = r0.f203518A
            r1.f203608d = r6
            r1.notifyDataSetChanged()
            com.tencent.mm.plugin.recharge.ui.e r1 = r0.f203548v
            java.util.ArrayList<y43.y> r6 = r0.f203519B
            r1.f203608d = r6
            r1.notifyDataSetChanged()
            if (r16 != 0) goto L_0x0122
            android.widget.TextView r1 = r0.f203545s
            r1.setVisibility(r4)
            android.widget.TextView r1 = r0.f203546t
            r1.setVisibility(r4)
            goto L_0x016e
        L_0x0122:
            java.util.ArrayList<y43.y> r1 = r0.f203518A
            java.util.Iterator r1 = r1.iterator()
        L_0x0128:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x013a
            java.lang.Object r6 = r1.next()
            y43.y r6 = (y43.C79037y) r6
            int r6 = r6.f232104g
            if (r6 == 0) goto L_0x0128
            r1 = 0
            goto L_0x013b
        L_0x013a:
            r1 = 1
        L_0x013b:
            if (r1 == 0) goto L_0x0143
            android.widget.TextView r1 = r0.f203545s
            r1.setVisibility(r5)
            goto L_0x0148
        L_0x0143:
            android.widget.TextView r1 = r0.f203545s
            r1.setVisibility(r4)
        L_0x0148:
            java.util.ArrayList<y43.y> r1 = r0.f203519B
            java.util.Iterator r1 = r1.iterator()
        L_0x014e:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0160
            java.lang.Object r6 = r1.next()
            y43.y r6 = (y43.C79037y) r6
            int r6 = r6.f232104g
            if (r6 == 0) goto L_0x014e
            r1 = 0
            goto L_0x0161
        L_0x0160:
            r1 = 1
        L_0x0161:
            if (r1 == 0) goto L_0x0169
            android.widget.TextView r1 = r0.f203546t
            r1.setVisibility(r5)
            goto L_0x016e
        L_0x0169:
            android.widget.TextView r1 = r0.f203546t
            r1.setVisibility(r4)
        L_0x016e:
            if (r17 == 0) goto L_0x017c
            y43.e r1 = r0.f203524G
            java.lang.String r1 = r1.f232062e
            com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$c r6 = new com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$c
            r6.<init>()
            r15.addTextOptionMenu(r5, r1, r6)
        L_0x017c:
            android.widget.TextView r1 = r0.f203537h
            java.util.ArrayList<y43.y> r6 = r0.f203518A
            if (r6 == 0) goto L_0x01a3
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x01a3
            java.util.ArrayList<y43.y> r6 = r0.f203518A
            java.lang.Object r6 = r6.get(r5)
            y43.y r6 = (y43.C79037y) r6
            java.lang.String r6 = r6.f232107j
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x01a3
            java.util.ArrayList<y43.y> r6 = r0.f203518A
            java.lang.Object r6 = r6.get(r5)
            y43.y r6 = (y43.C79037y) r6
            java.lang.String r6 = r6.f232107j
            goto L_0x01aa
        L_0x01a3:
            r6 = 2131839612(0x7f114a7c, float:1.931248E38)
            java.lang.String r6 = r15.getString(r6)
        L_0x01aa:
            r1.setText(r6)
            android.widget.TextView r1 = r0.f203538i
            java.util.ArrayList<y43.y> r6 = r0.f203519B
            if (r6 == 0) goto L_0x01d4
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x01d4
            java.util.ArrayList<y43.y> r6 = r0.f203519B
            java.lang.Object r6 = r6.get(r5)
            y43.y r6 = (y43.C79037y) r6
            java.lang.String r6 = r6.f232107j
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r6 != 0) goto L_0x01d4
            java.util.ArrayList<y43.y> r6 = r0.f203519B
            java.lang.Object r6 = r6.get(r5)
            y43.y r6 = (y43.C79037y) r6
            java.lang.String r6 = r6.f232107j
            goto L_0x01db
        L_0x01d4:
            r6 = 2131839613(0x7f114a7d, float:1.9312482E38)
            java.lang.String r6 = r15.getString(r6)
        L_0x01db:
            r1.setText(r6)
            y43.e r1 = r0.f203523F
            if (r1 == 0) goto L_0x0204
            java.lang.String r1 = r1.f232062e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x01eb
            goto L_0x0204
        L_0x01eb:
            android.widget.TextView r1 = r0.f203542p
            r1.setVisibility(r5)
            android.widget.TextView r1 = r0.f203542p
            y43.e r6 = r0.f203523F
            java.lang.String r6 = r6.f232062e
            r1.setText(r6)
            android.widget.TextView r1 = r0.f203542p
            com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$d r6 = new com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$d
            r6.<init>()
            r1.setOnClickListener(r6)
            goto L_0x0209
        L_0x0204:
            android.widget.TextView r1 = r0.f203542p
            r1.setVisibility(r4)
        L_0x0209:
            y43.e r1 = r0.f203520C
            if (r1 == 0) goto L_0x022f
            java.lang.String r1 = r1.f232062e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0216
            goto L_0x022f
        L_0x0216:
            android.widget.TextView r1 = r0.f203541o
            r1.setVisibility(r5)
            android.widget.TextView r1 = r0.f203541o
            y43.e r6 = r0.f203520C
            java.lang.String r6 = r6.f232062e
            r1.setText(r6)
            android.widget.TextView r1 = r0.f203541o
            com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$e r6 = new com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$e
            r6.<init>()
            r1.setOnClickListener(r6)
            goto L_0x0234
        L_0x022f:
            android.widget.TextView r1 = r0.f203541o
            r1.setVisibility(r4)
        L_0x0234:
            y43.e r1 = r0.f203521D
            if (r1 == 0) goto L_0x025a
            java.lang.String r1 = r1.f232062e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x0241
            goto L_0x025a
        L_0x0241:
            android.widget.TextView r1 = r0.f203543q
            r1.setVisibility(r5)
            android.widget.TextView r1 = r0.f203543q
            y43.e r6 = r0.f203521D
            java.lang.String r6 = r6.f232062e
            r1.setText(r6)
            android.widget.TextView r1 = r0.f203543q
            com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$f r6 = new com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$f
            r6.<init>()
            r1.setOnClickListener(r6)
            goto L_0x025f
        L_0x025a:
            android.widget.TextView r1 = r0.f203543q
            r1.setVisibility(r4)
        L_0x025f:
            y43.e r1 = r0.f203522E
            if (r1 == 0) goto L_0x0285
            java.lang.String r1 = r1.f232062e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x026c
            goto L_0x0285
        L_0x026c:
            android.widget.TextView r1 = r0.f203544r
            r1.setVisibility(r5)
            android.widget.TextView r1 = r0.f203544r
            y43.e r4 = r0.f203522E
            java.lang.String r4 = r4.f232062e
            r1.setText(r4)
            android.widget.TextView r1 = r0.f203544r
            com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$g r4 = new com.tencent.mm.plugin.recharge.ui.PhoneRechargeUI$g
            r4.<init>()
            r1.setOnClickListener(r4)
            goto L_0x028a
        L_0x0285:
            android.widget.TextView r1 = r0.f203544r
            r1.setVisibility(r4)
        L_0x028a:
            boolean r1 = r0.f203531N
            if (r1 == 0) goto L_0x0314
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r1 = r0.f203550x
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_RECHARGE_SHOW_REMIND_BOOLEAN
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r1 = r1.f209739o
            if (r1 == 0) goto L_0x02bc
            int r6 = r1.f209755s
            if (r6 != r3) goto L_0x02bc
            java.lang.String r1 = r1.f209756t
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 == 0) goto L_0x02a3
            goto L_0x02bc
        L_0x02a3:
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.Object r1 = r1.mo119685f(r4, r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5 = r1 ^ 1
        L_0x02bc:
            if (r5 == 0) goto L_0x0314
            f40.C86709a0.m107528h()
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r1.mo119677K(r4, r3)
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r1 = r0.f203550x
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r1 = r1.f209739o
            if (r1 != 0) goto L_0x02d5
            goto L_0x0314
        L_0x02d5:
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r2, r1)
            com.tencent.mm.plugin.wallet_core.model.mall.MallFunction r1 = r0.f203550x
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews r1 = r1.f209739o
            java.lang.String r1 = r1.f209756t
            android.view.LayoutInflater r2 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r15)
            r3 = 2131497101(0x7f0c108d, float:1.8617786E38)
            r4 = 0
            android.view.View r7 = r2.inflate(r3, r4)
            androidx.appcompat.app.AppCompatActivity r5 = r15.getContext()
            r2 = 2131839627(0x7f114a8b, float:1.931251E38)
            java.lang.String r6 = r15.getString(r2)
            r2 = 2131839628(0x7f114a8c, float:1.9312513E38)
            java.lang.String r8 = r15.getString(r2)
            r2 = 2131839626(0x7f114a8a, float:1.9312509E38)
            java.lang.String r9 = r15.getString(r2)
            com.tencent.mm.plugin.recharge.ui.f r10 = new com.tencent.mm.plugin.recharge.ui.f
            r10.<init>(r15, r1)
            com.tencent.mm.plugin.recharge.ui.g r11 = new com.tencent.mm.plugin.recharge.ui.g
            r11.<init>(r15)
            nj3.C76879j.m92747r(r5, r6, r7, r8, r9, r10, r11)
        L_0x0314:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recharge.p093ui.PhoneRechargeUI.mo97038O7(boolean, boolean):void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bms;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        if (i3 != 1) {
            if (i3 == 2) {
                if (i4 != -1) {
                    Log.m105924i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : cancel");
                } else if (!this.f203526I) {
                    Log.m105924i("MicroMsg.PhoneRechargeUI", "hy: MallRecharge pay result : ok");
                    C76415b.wx0().vx0(new C76574a(this.f203536g.getText(), this.f203536g.getTipsTv().getText().toString(), 0));
                    finish();
                    this.f203526I = true;
                }
            }
        } else if (i4 == -1) {
            this.f203529L = true;
            String str = null;
            ArrayList arrayList = new ArrayList();
            Uri data = intent.getData();
            if (data == null) {
                Log.m105920e("MicroMsg.PhoneRechargeUI", "hy: uri == null");
                return;
            }
            try {
                Cursor query = getContentResolver().query(data, (String[]) null, (String) null, (String[]) null, (String) null);
                if (query != null && query.getCount() > 0) {
                    query.moveToFirst();
                    int columnIndex = query.getColumnIndex("has_phone_number");
                    if (columnIndex <= 0 || query.getInt(columnIndex) > 0) {
                        String string = query.getString(query.getColumnIndex("_id"));
                        ContentResolver contentResolver = getContentResolver();
                        Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                        Cursor query2 = contentResolver.query(uri, (String[]) null, "contact_id = " + string, (String[]) null, (String) null);
                        if (query2 != null && query2.moveToFirst()) {
                            while (!query2.isAfterLast()) {
                                int columnIndex2 = query2.getColumnIndex("data1");
                                int columnIndex3 = query2.getColumnIndex("display_name");
                                String string2 = query2.getString(columnIndex2);
                                String string3 = query2.getString(columnIndex3);
                                Log.m105918d("MicroMsg.PhoneRechargeUI", "hy: username : " + string3);
                                if (string2 != null) {
                                    Log.m105918d("MicroMsg.PhoneRechargeUI", "hy: phoneNumber : " + string2);
                                    String a = C76575b.m92141a(string2);
                                    Log.m105918d("MicroMsg.PhoneRechargeUI", "hy: phoneNumber : " + a);
                                    if (PhoneNumberUtils.isGlobalPhoneNumber(a) && a.length() == 11) {
                                        arrayList.add(a);
                                    }
                                    Log.m105918d("MicroMsg.PhoneRechargeUI", "hy: phoneResult : " + a);
                                }
                                query2.moveToNext();
                                str = string3;
                            }
                        }
                        if (query2 != null) {
                            query2.close();
                        }
                    }
                }
                if (query != null && !query.isClosed()) {
                    query.close();
                }
                if (arrayList.size() > 1) {
                    C77398g S = C76879j.m92725S(this, getString(C0966R.string.f361608l72), arrayList, -1, (String) null, new C70437i(arrayList, str));
                    if (S != null) {
                        S.setCanceledOnTouchOutside(true);
                    }
                } else if (arrayList.size() == 1) {
                    this.f203527J.mo106950b(new C76574a((String) arrayList.get(0), str, 1));
                    C86709a0.m107524d().mo123460f(new C76576f(this.f203536g.getText(), 0));
                } else {
                    C76879j.m92748s(this, getString(C0966R.string.f361021gp2), "");
                }
            } catch (SecurityException e) {
                Log.m105921e("MicroMsg.PhoneRechargeUI", "hy: permission denied: %s", e.toString());
                C76879j.m92748s(this, getString(C0966R.string.gp4), "");
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        setActionbarColor(getActionbarColor());
        C86709a0.m107524d().mo123455a(1571, this);
        C86709a0.m107524d().mo123455a(C83018k.CTRL_INDEX, this);
        this.f203550x = (MallFunction) getIntent().getParcelableExtra("key_func_info");
        this.f203531N = getIntent().getBooleanExtra("key_need_show_remind_dialog", true);
        mo97037N7();
        MallFunction mallFunction = this.f203550x;
        if (mallFunction == null) {
            Log.m105920e("MicroMsg.PhoneRechargeUI", "hy: function info is null");
            C76912y0.makeText((Context) this, (CharSequence) "function info is null", 1).show();
            finish();
            return;
        }
        setMMTitle(mallFunction.f209732e);
        setBackBtn(new C5037i(this));
        C79031e eVar = new C79031e();
        this.f203524G = eVar;
        eVar.f232062e = getString(C0966R.string.l6w);
        this.f203524G.f232061d = "http%3A%2F%2Fkf.qq.com%2Ftouch%2Fproduct%2Fwechatrecharge_app.html";
        this.f203533d = findViewById(C0966R.C0970id.hvm);
        this.f203534e = (ImageView) findViewById(C0966R.C0970id.hf_);
        this.f203535f = (TextView) findViewById(C0966R.C0970id.hfa);
        MallFormView mallFormView = (MallFormView) findViewById(C0966R.C0970id.ifv);
        this.f203536g = mallFormView;
        if (mallFormView == null) {
            Log.m105920e("MicroMsg.CommonHintViewConfig", "hy: param error");
        } else {
            mallFormView.setLogicDelegate(new C76674c());
        }
        C76681j jVar = new C76681j(this.f203536g);
        this.f203527J = jVar;
        Log.m105918d("MicroMsg.CommonHintViewConfig", "hy: setMobileEditTv");
        MallFormView mallFormView2 = jVar.f224372c;
        C76676e eVar2 = new C76676e(jVar);
        EditText editText = mallFormView2.f203635f;
        if (editText != null) {
            editText.addTextChangedListener(eVar2);
        }
        InstantAutoCompleteTextView instantAutoCompleteTextView = (InstantAutoCompleteTextView) jVar.f224372c.getContentEditText();
        ThreadPool.post(new C76677f(jVar), "fetch_phone_book");
        C76686o oVar = new C76686o(jVar.f224372c, jVar.f224370a);
        jVar.f224373d = oVar;
        oVar.f224385p = this;
        instantAutoCompleteTextView.setShowAlways(true);
        instantAutoCompleteTextView.setAdapter(jVar.f224373d);
        instantAutoCompleteTextView.setOnItemClickListener(new C76678g(jVar, instantAutoCompleteTextView));
        jVar.f224372c.setOnFocusChangeListener(new C76679h(jVar, instantAutoCompleteTextView));
        instantAutoCompleteTextView.setOnClickListener(new C76680i(jVar, instantAutoCompleteTextView));
        this.f203539j = (GridView) findViewById(C0966R.C0970id.igc);
        this.f203541o = (TextView) findViewById(C0966R.C0970id.igk);
        this.f203542p = (TextView) findViewById(C0966R.C0970id.igl);
        this.f203543q = (TextView) findViewById(C0966R.C0970id.ift);
        this.f203544r = (TextView) findViewById(C0966R.C0970id.ig9);
        this.f203537h = (TextView) findViewById(C0966R.C0970id.ige);
        this.f203538i = (TextView) findViewById(C0966R.C0970id.igg);
        this.f203540n = (GridView) findViewById(C0966R.C0970id.ifw);
        this.f203545s = (TextView) findViewById(C0966R.C0970id.igd);
        this.f203546t = (TextView) findViewById(C0966R.C0970id.igf);
        this.f203536g.setOnInputValidChangeListener(new C70467k(this));
        this.f203536g.getInfoIv().setOnClickListener(new C5038l(this));
        C70455e eVar3 = new C70455e();
        this.f203547u = eVar3;
        eVar3.f203609e = new C70468m(this);
        C70455e eVar4 = new C70455e();
        this.f203548v = eVar4;
        eVar4.f203609e = new C70469n(this);
        this.f203539j.setAdapter(this.f203547u);
        this.f203540n.setAdapter(this.f203548v);
        this.f203534e.setOnClickListener(new C5039o(this));
        this.f203535f.setOnClickListener(new C70470p(this));
        this.f203536g.mo97096d();
        int A = (C76577a.m92145A(this) / 4) - 20;
        Log.m105925i("MicroMsg.PhoneRechargeUI", "max width: %s", Integer.valueOf(A));
        this.f203541o.setMaxWidth(A);
        this.f203542p.setMaxWidth(A);
        this.f203543q.setMaxWidth(A);
        this.f203544r.setMaxWidth(A);
        getResources().getColor(C0966R.color.a7f);
        C76574a aVar = this.f203527J.f224371b;
        if (aVar != null && !Util.isNullOrNil(aVar.f224104b)) {
            String str = this.f203527J.f224371b.f224104b;
        }
        this.f203536g.getContentEditText().setHintTextColor(getResources().getColor(C0966R.color.a9p));
        if (Util.isNullOrNil(this.f203536g.getText())) {
            mo97036M7(new C76576f("", 0), false);
        } else {
            mo97036M7(new C76576f(this.f203536g.getText(), 0), false);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(1571, this);
        C86709a0.m107524d().mo123470p(C83018k.CTRL_INDEX, this);
        this.f203532P.dead();
    }

    public void onResume() {
        super.onResume();
        mo97038O7(false, true);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        boolean z;
        if (yVar instanceof C76576f) {
            C76576f fVar = (C76576f) yVar;
            Dialog dialog = this.f203549w;
            if (!(dialog == null || !dialog.isShowing() || yVar.getType() == 497)) {
                this.f203549w.dismiss();
                this.f203549w = null;
            }
            if (fVar.f224126y != 0) {
                Log.m105924i("MicroMsg.PhoneRechargeUI", "do delete phone number");
            } else if (!Util.isNullOrNil(fVar.f224110f) && !fVar.f224110f.equals(this.f203536g.getText())) {
                Log.m105925i("MicroMsg.PhoneRechargeUI", "hy: mobiel num not match.abourt, %s, %s", fVar.f224110f, this.f203536g.getText());
            } else if (fVar.f224112h) {
                Log.m105920e("MicroMsg.PhoneRechargeUI", "hy: cgi failed.");
                C76879j.m92713G(this, fVar.f224124w, "", false, new C70464h(this));
                this.f203551y = "";
                mo97037N7();
            } else {
                this.f203551y = fVar.f224111g;
                this.f203552z = fVar.f224114j;
                this.f203518A = fVar.f224115n;
                this.f203520C = fVar.f224117p;
                this.f203521D = fVar.f224118q;
                this.f203522E = fVar.f224119r;
                this.f203523F = fVar.f224120s;
                String str2 = fVar.f224113i;
                this.f203525H = str2;
                Log.m105925i("MicroMsg.PhoneRechargeUI", "desc: %s, mobile: %s", str2, this.f203536g.getText());
                if (Util.isNullOrNil(this.f203525H)) {
                    getResources().getColor(C0966R.color.a7f);
                } else {
                    C76574a aVar = this.f203527J.f224371b;
                    if (aVar != null && aVar.f224103a.trim().equals(this.f203536g.getText())) {
                        C76681j jVar = this.f203527J;
                        C76574a aVar2 = jVar.f224371b;
                        aVar2.f224105c = this.f203525H;
                        jVar.mo106950b(aVar2);
                    }
                }
                this.f203528K = fVar.f224122u;
                ArrayList<C79037y> arrayList = fVar.f224116o;
                this.f203519B = arrayList;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        C79037y yVar2 = this.f203519B.get(size);
                        if (yVar2.f232102e.isEmpty()) {
                            this.f203519B.remove(yVar2);
                        }
                    }
                }
                C79031e eVar = fVar.f224121t;
                if (eVar == null || (eVar.f232062e.equals(this.f203524G.f232062e) && fVar.f224121t.f232061d.equals(this.f203524G.f232061d) && fVar.f224121t.f232063f.equals(this.f203524G.f232063f) && fVar.f224121t.f232064g.equals(this.f203524G.f232064g))) {
                    z = false;
                } else {
                    Log.m105924i("MicroMsg.PhoneRechargeUI", "need to update head");
                    this.f203524G = fVar.f224121t;
                    z = true;
                }
                mo97038O7(!this.f203525H.equals(""), z);
                List<C76574a> list = fVar.f224125x;
                Log.m105918d("MicroMsg.PhoneRechargeUI", "update record history");
                C76415b.wx0().zx0(list);
                if (this.f203527J != null) {
                    if (Util.isNullOrNil(this.f203536g.getText())) {
                        this.f203527J.mo106949a(true);
                    } else {
                        this.f203527J.mo106949a(false);
                    }
                }
                this.f203536g.postDelayed(new C70436h(), 300);
            }
        } else if (yVar instanceof C46726g) {
            Dialog dialog2 = this.f203549w;
            if (!(dialog2 == null || !dialog2.isShowing() || yVar.getType() == 497)) {
                this.f203549w.dismiss();
                this.f203549w = null;
            }
            if (i == 0 && i2 == 0) {
                C79144b.m95773a().getClass();
                ((C76324c) C86312j.m106911c(C76324c.class)).startWxpayQueryCashierPay(((C46726g) yVar).f125796f.f212592j, 6, 0);
                this.f203532P.alive();
                return;
            }
            if (Util.isNullOrNil(str)) {
                str = getString(C0966R.string.l_3);
            }
            C76879j.m92713G(this, str, "", false, new C70464h(this));
        }
    }
}
