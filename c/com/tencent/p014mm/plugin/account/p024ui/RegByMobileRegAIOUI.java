package com.tencent.p014mm.plugin.account.p024ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import bc0.C67216a;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.LoginDisasterEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.ThirdAppRegisterStruct;
import com.tencent.p014mm.modelsimple.C114735a0;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.base.MMFormInputView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.appbrand.jsapi.C83049v5;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.PhoneFormater;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch;
import de3.C75364j;
import de3.C75365k;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f40.C86718e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import jg0.C46557i;
import k20.C9556a;
import lg3.C88504k;
import nc0.C76850a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C11385n;
import ob0.C117747y;
import p148ei.C7660a;
import p156gj.C87203t;
import p206nj.C11171e;
import p206nj.C88955f;
import p214om.C11502f;
import p629ny.C76978g;
import pe3.C47465a;
import qe3.C89625d;
import qg0.C12215a;
import qn3.C77382c;
import qo3.C89779i0;
import sf0.C13665i0;
import sf0.C90186h0;
import tc2.C118418g;
import tc2.C77890f;
import te3.C64305d33;
import te3.bg4;
import vg0.C14859b;
import wg0.C78595a;
import xb2.C118866a;

@C88989a(1)
/* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI */
public class RegByMobileRegAIOUI extends MMSecDataActivity implements C11385n {

    /* renamed from: Y */
    public static final /* synthetic */ int f344866Y = 0;

    /* renamed from: A */
    public boolean f344867A = false;

    /* renamed from: B */
    public ImageView f344868B;

    /* renamed from: C */
    public ImageView f344869C;

    /* renamed from: D */
    public MMFormInputView f344870D;

    /* renamed from: E */
    public int f344871E = 0;

    /* renamed from: F */
    public Bitmap f344872F;

    /* renamed from: G */
    public String f344873G;

    /* renamed from: H */
    public String f344874H;

    /* renamed from: I */
    public String f344875I;

    /* renamed from: J */
    public String f344876J;

    /* renamed from: K */
    public int f344877K;

    /* renamed from: L */
    public String f344878L;

    /* renamed from: M */
    public String f344879M;

    /* renamed from: N */
    public boolean f344880N = true;

    /* renamed from: P */
    public ThirdAppRegisterStruct f344881P = new ThirdAppRegisterStruct();

    /* renamed from: Q */
    public IListener f344882Q = new IListener<LoginDisasterEvent>(this, C40008f.f107254d) {
        {
            this.__eventId = -1399051904;
        }

        public boolean callback(IEvent iEvent) {
            LoginDisasterEvent.C114679a aVar;
            LoginDisasterEvent loginDisasterEvent = (LoginDisasterEvent) iEvent;
            if (loginDisasterEvent == null || (aVar = loginDisasterEvent.f343570d) == null) {
                return false;
            }
            Log.m105925i("MicroMsg.RegByMobileRegAIOUI", "summerdiz loginDisasterListener callback content[%s], url[%s]", aVar.f343571a, aVar.f343572b);
            Intent intent = new Intent();
            intent.putExtra("key_disaster_content", loginDisasterEvent.f343570d.f343571a);
            intent.putExtra("key_disaster_url", loginDisasterEvent.f343570d.f343572b);
            intent.setClass(MMApplicationContext.getContext(), DisasterUI.class).addFlags(268435456);
            Context context = MMApplicationContext.getContext();
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$1", "callback", "(Lcom/tencent/mm/autogen/events/LoginDisasterEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
    };

    /* renamed from: R */
    public String f344883R = "";

    /* renamed from: S */
    public C90186h0 f344884S = new C90186h0();

    /* renamed from: T */
    public boolean f344885T = false;

    /* renamed from: U */
    public int f344886U;

    /* renamed from: V */
    public int f344887V;

    /* renamed from: W */
    public boolean f344888W;

    /* renamed from: X */
    public boolean f344889X;

    /* renamed from: d */
    public LinearLayout f344890d;

    /* renamed from: e */
    public TextView f344891e;

    /* renamed from: f */
    public EditText f344892f;

    /* renamed from: g */
    public TextView f344893g;

    /* renamed from: h */
    public MMFormInputView f344894h;

    /* renamed from: i */
    public String f344895i = null;

    /* renamed from: j */
    public String f344896j = null;

    /* renamed from: n */
    public String f344897n = null;

    /* renamed from: o */
    public String f344898o = null;

    /* renamed from: p */
    public boolean f344899p = true;

    /* renamed from: q */
    public C89779i0 f344900q;

    /* renamed from: r */
    public String f344901r;

    /* renamed from: s */
    public String f344902s;

    /* renamed from: t */
    public String f344903t = null;

    /* renamed from: u */
    public String f344904u = null;

    /* renamed from: v */
    public View f344905v;

    /* renamed from: w */
    public CheckBox f344906w;

    /* renamed from: x */
    public TextView f344907x;

    /* renamed from: y */
    public Button f344908y;

    /* renamed from: z */
    public MMFormInputView f344909z;

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$e */
    public class C1451e implements View.OnClickListener {
        public C1451e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93149TE(RegByMobileRegAIOUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$a */
    public class C68467a implements View.OnTouchListener {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f196716d;

        public C68467a(boolean[] zArr) {
            this.f196716d = zArr;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
            if (r10 != 6) goto L_0x004f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
            /*
                r9 = this;
                tc2.g r0 = tc2.C118418g.INSTANCE
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r1.add(r10)
                r1.add(r11)
                java.lang.Object[] r7 = r1.toArray()
                r1.clear()
                java.lang.String r2 = "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10"
                java.lang.String r3 = "android/view/View$OnTouchListener"
                java.lang.String r4 = "onTouch"
                java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r6 = r9
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                int r10 = r11.getAction()
                r1 = 0
                java.lang.String r2 = "ce_reg"
                r3 = 1
                if (r10 == 0) goto L_0x003a
                if (r10 == r3) goto L_0x0033
                r4 = 5
                if (r10 == r4) goto L_0x003a
                r3 = 6
                if (r10 == r3) goto L_0x0033
                goto L_0x004f
            L_0x0033:
                r0.mo175827n9(r2, r11)
                r0.ec0(r2)
                goto L_0x004f
            L_0x003a:
                boolean[] r10 = r9.f196716d
                r10[r1] = r3
                com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI r10 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.this
                java.lang.String r11 = tc2.C77890f.m94019a(r3)
                r10.f344883R = r11
                com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI r10 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.this
                java.lang.String r10 = r10.f344883R
                java.lang.String r11 = "<Reg>"
                r0.Ud0(r2, r11, r10)
            L_0x004f:
                r3 = 0
                java.lang.String r5 = "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$10"
                java.lang.String r6 = "android/view/View$OnTouchListener"
                java.lang.String r7 = "onTouch"
                java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
                r4 = r9
                j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.C68467a.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$c */
    public class C68468c implements View.OnClickListener {
        public C68468c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("country_name", RegByMobileRegAIOUI.this.f344896j);
            intent.putExtra("couttry_code", RegByMobileRegAIOUI.this.f344897n);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93177j(intent, RegByMobileRegAIOUI.this, 100);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$j */
    public class C68469j implements DialogInterface.OnClickListener {
        public C68469j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(RegByMobileRegAIOUI.this.getClass().getName());
            sb.append(",");
            sb.append("RE200_200");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("RE200_200"));
            sb.append(",");
            sb.append(2);
            C78595a.m94983c(10645, false, sb.toString());
            C78595a.m94985e("RE200_100");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$l */
    public class C68470l implements Runnable {
        public C68470l() {
        }

        public void run() {
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(RegByMobileRegAIOUI.this);
            b.addFlags(67108864);
            RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            RegByMobileRegAIOUI regByMobileRegAIOUI2 = regByMobileRegAIOUI;
            C117292a.m165358d(regByMobileRegAIOUI2, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$23", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            regByMobileRegAIOUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(regByMobileRegAIOUI2, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$23", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            StringBuilder sb = new StringBuilder();
            C86709a0.m107523b();
            sb.append(C86718e.m107547e());
            sb.append(",");
            sb.append(RegByMobileRegAIOUI.this.getClass().getName());
            sb.append(",");
            sb.append("L14");
            sb.append(",");
            C86709a0.m107523b();
            sb.append(C86718e.m107548f("L14"));
            sb.append(",");
            sb.append(4);
            C78595a.m94982b(10645, sb.toString());
            RegByMobileRegAIOUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$o */
    public class C68471o implements C75364j<String> {
        public C68471o() {
        }

        /* renamed from: a */
        public void mo94024a(View view, int i, C75365k<String> kVar) {
            RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
            String e = C76850a.m92633e(regByMobileRegAIOUI, regByMobileRegAIOUI.f344897n, regByMobileRegAIOUI.getString(C0966R.string.bvs));
            int i2 = e.equalsIgnoreCase("cn") ? C0966R.string.m9m : C0966R.string.m9n;
            RegByMobileRegAIOUI regByMobileRegAIOUI2 = RegByMobileRegAIOUI.this;
            C12215a.m11778c(regByMobileRegAIOUI2, regByMobileRegAIOUI2.getString(i2, new Object[]{LocaleUtil.getApplicationLanguage(), e}), 0, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$b */
    public class C115021b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f344910d;

        /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$b$a */
        public class C115022a implements C77382c.C77383a {
            public C115022a() {
            }

            /* renamed from: L0 */
            public void mo4083L0(String str) {
                C76879j.m92738i(RegByMobileRegAIOUI.this, C0966R.string.iug, C0966R.string.iui);
            }

            /* renamed from: L3 */
            public void mo4084L3(String str) {
                C76879j.m92738i(RegByMobileRegAIOUI.this, C0966R.string.iuf, C0966R.string.iui);
            }

            /* renamed from: P4 */
            public void mo4086P4(String str) {
                RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
                regByMobileRegAIOUI.f344904u = PhoneFormater.pureNumber(regByMobileRegAIOUI.f344892f.getText().toString());
                RegByMobileRegAIOUI regByMobileRegAIOUI2 = RegByMobileRegAIOUI.this;
                regByMobileRegAIOUI2.f344903t = PhoneFormater.countryCodeWithPlus(regByMobileRegAIOUI2.f344897n);
                String str2 = RegByMobileRegAIOUI.this.f344903t + RegByMobileRegAIOUI.this.f344904u;
                RegByMobileRegAIOUI.this.hideVKB();
                RegByMobileRegAIOUI regByMobileRegAIOUI3 = RegByMobileRegAIOUI.this;
                if (regByMobileRegAIOUI3.f344880N) {
                    if (Util.isNullOrNil(regByMobileRegAIOUI3.f344898o)) {
                        RegByMobileRegAIOUI regByMobileRegAIOUI4 = RegByMobileRegAIOUI.this;
                        regByMobileRegAIOUI4.f344898o = C76850a.m92633e(regByMobileRegAIOUI4, regByMobileRegAIOUI4.f344897n, regByMobileRegAIOUI4.getString(C0966R.string.bvs));
                    }
                    C12215a.m11778c(RegByMobileRegAIOUI.this, RegByMobileRegAIOUI.this.getString(RegByMobileRegAIOUI.this.f344898o.equalsIgnoreCase("cn") ? C0966R.string.m8p : C0966R.string.m8q, new Object[]{LocaleUtil.getApplicationLanguage(), RegByMobileRegAIOUI.this.f344898o, "reg", 1, 0}), 30847, false);
                } else if (!Util.isNullOrNil(regByMobileRegAIOUI3.f344875I)) {
                    RegByMobileRegAIOUI.this.mo174773M7();
                } else {
                    RegByMobileRegAIOUI.this.mo174768H7(str2);
                }
            }
        }

        public C115021b(boolean[] zArr) {
            this.f344910d = zArr;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            boolean[] zArr = this.f344910d;
            if (zArr[0]) {
                zArr[0] = false;
            } else {
                RegByMobileRegAIOUI.this.f344883R = C77890f.m94019a(1);
                C118418g gVar = C118418g.INSTANCE;
                gVar.Ud0("ce_reg", "<Reg>", RegByMobileRegAIOUI.this.f344883R);
                gVar.mo175827n9("ce_reg", MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 65535));
                gVar.ec0("ce_reg");
            }
            if (!RegByMobileRegAIOUI.this.f344906w.isChecked()) {
                RegByMobileRegAIOUI.this.f344905v.startAnimation(AnimationUtils.loadAnimation(RegByMobileRegAIOUI.this, C0966R.C0968anim.f2342a7));
                C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C77382c b = C77382c.m93286b(RegByMobileRegAIOUI.this.f344870D.getContentEditText());
            b.f225611e = 1;
            b.f225610d = 32;
            b.f225607a = true;
            b.mo107499d(new C115022a());
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$d */
    public class C115023d implements MenuItem.OnMenuItemClickListener {
        public C115023d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            RegByMobileRegAIOUI.this.hideVKB();
            RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
            int i = RegByMobileRegAIOUI.f344866Y;
            regByMobileRegAIOUI.mo174770J7();
            RegByMobileRegAIOUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$f */
    public class C115024f implements MMHandlerThread.IWaitWorkThread {
        public C115024f() {
        }

        public boolean doInBackground() {
            return true;
        }

        public boolean onPostExecute() {
            if (!Util.isNullOrNil((String) null)) {
                if (Util.isNullOrNil(("" + RegByMobileRegAIOUI.this.f344870D.getText()).trim())) {
                    RegByMobileRegAIOUI.this.f344870D.setText((String) null);
                }
            }
            if (!C88955f.m111058b()) {
                Log.m105920e("MicroMsg.RegByMobileRegAIOUI", "SDcard is not available");
                return false;
            }
            Bitmap bitmap = RegByMobileRegAIOUI.this.f344872F;
            if (bitmap != null && !bitmap.isRecycled()) {
                RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
                if (!regByMobileRegAIOUI.f344867A) {
                    regByMobileRegAIOUI.f344868B.setImageBitmap(regByMobileRegAIOUI.f344872F);
                    RegByMobileRegAIOUI.this.f344869C.setVisibility(8);
                    RegByMobileRegAIOUI.this.f344867A = true;
                }
            }
            return true;
        }

        public String toString() {
            return super.toString() + "|initView2";
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$g */
    public class C115025g implements MMHandlerThread.IWaitWorkThread {
        public C115025g() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0056 A[Catch:{ Exception -> 0x005c, all -> 0x005a }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean doInBackground() {
            /*
                r8 = this;
                r0 = 0
                r1 = 0
                java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0052 }
                com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI r3 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.this     // Catch:{ all -> 0x0052 }
                java.lang.String r3 = r3.f344879M     // Catch:{ all -> 0x0052 }
                r2.<init>(r3)     // Catch:{ all -> 0x0052 }
                java.net.URLConnection r2 = r2.openConnection()     // Catch:{ all -> 0x0052 }
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ all -> 0x0052 }
                java.io.InputStream r1 = r2.getInputStream()     // Catch:{ all -> 0x0050 }
                com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI r3 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.this     // Catch:{ all -> 0x0050 }
                android.graphics.Bitmap r4 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(r1)     // Catch:{ all -> 0x0050 }
                r3.f344872F = r4     // Catch:{ all -> 0x0050 }
                com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI r3 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.this     // Catch:{ all -> 0x0050 }
                android.graphics.Bitmap r3 = r3.f344872F     // Catch:{ all -> 0x0050 }
                if (r3 == 0) goto L_0x004a
                boolean r3 = r3.isRecycled()     // Catch:{ all -> 0x0050 }
                if (r3 != 0) goto L_0x004a
                com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI r3 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.this     // Catch:{ all -> 0x0050 }
                android.graphics.Bitmap r3 = r3.f344872F     // Catch:{ all -> 0x0050 }
                r4 = 100
                android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0050 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
                r6.<init>()     // Catch:{ all -> 0x0050 }
                java.lang.String r7 = a70.C112760b.m154235i()     // Catch:{ all -> 0x0050 }
                r6.append(r7)     // Catch:{ all -> 0x0050 }
                java.lang.String r7 = "temp.avatar"
                r6.append(r7)     // Catch:{ all -> 0x0050 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0050 }
                com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r3, r4, r5, r6, r0)     // Catch:{ all -> 0x0050 }
            L_0x004a:
                if (r1 == 0) goto L_0x0068
                r1.close()     // Catch:{ Exception -> 0x005c }
                goto L_0x0068
            L_0x0050:
                r3 = move-exception
                goto L_0x0054
            L_0x0052:
                r3 = move-exception
                r2 = r1
            L_0x0054:
                if (r1 == 0) goto L_0x0059
                r1.close()     // Catch:{ Exception -> 0x005c }
            L_0x0059:
                throw r3     // Catch:{ Exception -> 0x005c }
            L_0x005a:
                r0 = move-exception
                goto L_0x006d
            L_0x005c:
                r1 = move-exception
                java.lang.String r3 = "MicroMsg.RegByMobileRegAIOUI"
                java.lang.String r4 = "get avatar from http failed!"
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x005a }
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r4, r0)     // Catch:{ all -> 0x005a }
                if (r2 == 0) goto L_0x006b
            L_0x0068:
                r2.disconnect()
            L_0x006b:
                r0 = 1
                return r0
            L_0x006d:
                if (r2 == 0) goto L_0x0072
                r2.disconnect()
            L_0x0072:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.C115025g.doInBackground():boolean");
        }

        public boolean onPostExecute() {
            Bitmap bitmap;
            RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
            if (!regByMobileRegAIOUI.f344867A && (bitmap = regByMobileRegAIOUI.f344872F) != null && !bitmap.isRecycled()) {
                RegByMobileRegAIOUI regByMobileRegAIOUI2 = RegByMobileRegAIOUI.this;
                regByMobileRegAIOUI2.f344868B.setImageBitmap(regByMobileRegAIOUI2.f344872F);
                RegByMobileRegAIOUI.this.f344869C.setVisibility(8);
                RegByMobileRegAIOUI.this.f344867A = true;
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$h */
    public class C115026h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f344916d;

        public C115026h(String str) {
            this.f344916d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0062, code lost:
            r3 = r6.f344902s;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r10 = this;
                com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI r6 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.this
                java.lang.String r7 = r10.f344916d
                int r0 = com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.f344866Y
                r6.getClass()
                bc0.a r8 = new bc0.a
                r2 = 12
                r4 = 0
                java.lang.String r3 = ""
                java.lang.String r5 = ""
                r0 = r8
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r0 = 2131821704(0x7f110488, float:1.9276159E38)
                java.lang.String r1 = r6.getString(r0)
                r0 = 2131821739(0x7f1104ab, float:1.927623E38)
                java.lang.String r2 = r6.getString(r0)
                com.tencent.mm.plugin.account.ui.u2 r5 = new com.tencent.mm.plugin.account.ui.u2
                r5.<init>(r6, r8)
                r3 = 1
                r4 = 1
                r0 = r6
                qo3.i0 r0 = nj3.C76879j.m92723Q(r0, r1, r2, r3, r4, r5)
                r6.f344900q = r0
                android.widget.EditText r0 = r6.f344892f
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r0.trim()
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.PhoneFormater.pureNumber(r0)
                java.lang.String r1 = r6.f344901r
                r2 = 1
                if (r1 == 0) goto L_0x005e
                java.lang.String r3 = r6.f344902s
                if (r3 == 0) goto L_0x005e
                boolean r1 = r0.equals(r1)
                if (r1 != 0) goto L_0x005e
                java.lang.String r1 = r6.f344902s
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L_0x005e
                r0 = 1
                goto L_0x0077
            L_0x005e:
                java.lang.String r1 = r6.f344901r
                if (r1 == 0) goto L_0x0076
                java.lang.String r3 = r6.f344902s
                if (r3 == 0) goto L_0x0076
                boolean r1 = r3.equals(r1)
                if (r1 != 0) goto L_0x0076
                java.lang.String r1 = r6.f344902s
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0076
                r0 = 2
                goto L_0x0077
            L_0x0076:
                r0 = 0
            L_0x0077:
                android.widget.EditText r1 = r6.f344892f
                android.text.Editable r1 = r1.getText()
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = r1.trim()
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.PhoneFormater.pureNumber(r1)
                r6.f344901r = r1
                int r1 = r6.f344871E
                r8.mo91364O(r1)
                r8.mo91370g0(r0)
                int r0 = r6.f344871E
                int r0 = r0 + r2
                r6.f344871E = r0
                com.tencent.mm.ui.base.MMFormInputView r0 = r6.f344870D
                android.text.Editable r0 = r0.getText()
                java.lang.String r3 = r0.toString()
                com.tencent.mm.ui.base.MMFormInputView r0 = r6.f344909z
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r0)
                com.tencent.mm.plugin.account.ui.v2 r9 = new com.tencent.mm.plugin.account.ui.v2
                r0 = r9
                r1 = r6
                r2 = r8
                r4 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r0 = 7
                java.lang.String r1 = "reg_permchk"
                com.tencent.p014mm.sdk.thread.ThreadPool.post((java.lang.Runnable) r9, (java.lang.String) r1, (int) r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.p024ui.RegByMobileRegAIOUI.C115026h.run():void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$i */
    public class C115027i implements DialogInterface.OnClickListener {
        public C115027i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
            int i2 = RegByMobileRegAIOUI.f344866Y;
            regByMobileRegAIOUI.mo174771K7();
            C78595a.m94985e("RE200_250");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$k */
    public class C115028k implements DialogInterface.OnClickListener {
        public C115028k() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
            int i2 = RegByMobileRegAIOUI.f344866Y;
            String string = regByMobileRegAIOUI.getString(C0966R.string.a3h);
            String string2 = regByMobileRegAIOUI.getString(C0966R.string.gda);
            C114735a0 a0Var = new C114735a0("facebook@wechat_auth", regByMobileRegAIOUI.f344875I, 0, "", "", "", 0, "", true, false);
            regByMobileRegAIOUI.f344900q = C76879j.m92723Q(regByMobileRegAIOUI, string, string2, true, true, new C1493w2(regByMobileRegAIOUI, a0Var));
            C86709a0.m107524d().mo123460f(a0Var);
            RegByMobileRegAIOUI regByMobileRegAIOUI2 = RegByMobileRegAIOUI.this;
            ThirdAppRegisterStruct thirdAppRegisterStruct = regByMobileRegAIOUI2.f344881P;
            thirdAppRegisterStruct.f343856d = (long) regByMobileRegAIOUI2.f344877K;
            thirdAppRegisterStruct.f343857e = 8;
            thirdAppRegisterStruct.mo86054n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$m */
    public class C115029m implements DialogInterface.OnCancelListener {
        public C115029m(RegByMobileRegAIOUI regByMobileRegAIOUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$n */
    public class C115030n implements CompoundButton.OnCheckedChangeListener {
        public C115030n() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
            int i = RegByMobileRegAIOUI.f344866Y;
            regByMobileRegAIOUI.mo174769I7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$p */
    public class C115031p implements TextWatcher {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f344921d;

        public C115031p(boolean[] zArr) {
            this.f344921d = zArr;
            new PhoneFormater();
        }

        public void afterTextChanged(Editable editable) {
            RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
            int i = RegByMobileRegAIOUI.f344866Y;
            regByMobileRegAIOUI.mo174769I7();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C118418g gVar = C118418g.INSTANCE;
            boolean[] zArr = this.f344921d;
            if (zArr[0]) {
                zArr[0] = false;
                gVar.mo175830qv("ie_reg");
            }
            gVar.mo175802VZ("ie_reg");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$q */
    public class C115032q implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ boolean[] f344923d;

        public C115032q(boolean[] zArr) {
            this.f344923d = zArr;
        }

        public void onFocusChange(View view, boolean z) {
            if (z) {
                this.f344923d[0] = true;
            } else {
                C118418g.INSTANCE.mo175826kl("ie_reg");
            }
            ((C118866a) C39818r.f106831a.mo62444c(RegByMobileRegAIOUI.this).mo75002a(C118866a.class)).mo183577i3(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$r */
    public class C115033r implements TextWatcher {
        public C115033r() {
        }

        public void afterTextChanged(Editable editable) {
            RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
            int i = RegByMobileRegAIOUI.f344866Y;
            regByMobileRegAIOUI.mo174769I7();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$s */
    public class C115034s implements View.OnFocusChangeListener {
        public C115034s() {
        }

        public void onFocusChange(View view, boolean z) {
            ((C118866a) C39818r.f106831a.mo62444c(RegByMobileRegAIOUI.this).mo75002a(C118866a.class)).mo183577i3(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$t */
    public class C115035t implements TextWatcher {
        public C115035t() {
        }

        public void afterTextChanged(Editable editable) {
            RegByMobileRegAIOUI regByMobileRegAIOUI = RegByMobileRegAIOUI.this;
            int i = RegByMobileRegAIOUI.f344866Y;
            regByMobileRegAIOUI.mo174769I7();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI$u */
    public class C115036u implements View.OnFocusChangeListener {
        public C115036u() {
        }

        public void onFocusChange(View view, boolean z) {
            ((C118866a) C39818r.f106831a.mo62444c(RegByMobileRegAIOUI.this).mo75002a(C118866a.class)).mo183577i3(z);
        }
    }

    /* renamed from: H7 */
    public final void mo174768H7(String str) {
        if (C12215a.m11776a(this, this.f344909z.getText().toString())) {
            C89779i0 i0Var = this.f344900q;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            this.f344884S.mo124429a(this, new C115026h(str));
        }
    }

    /* renamed from: I7 */
    public final boolean mo174769I7() {
        boolean z;
        boolean z2 = !Util.isNullOrNil(this.f344897n);
        Editable[] editableArr = {this.f344892f.getText(), this.f344909z.getText(), this.f344870D.getText()};
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = true;
                break;
            }
            Editable editable = editableArr[i];
            if (editable == null || editable.toString().length() == 0) {
                z = false;
            } else {
                i++;
            }
        }
        z = false;
        boolean z3 = z2 & (z && this.f344899p);
        if (z3) {
            this.f344908y.setEnabled(true);
        } else {
            this.f344908y.setEnabled(false);
        }
        return z3;
    }

    /* renamed from: J7 */
    public final void mo174770J7() {
        C78595a.m94985e((String) null);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("RE200_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("RE200_100"));
        sb.append(",");
        sb.append(2);
        C78595a.m94983c(10645, false, sb.toString());
        finish();
        overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
    }

    /* renamed from: K7 */
    public final void mo174771K7() {
        int i;
        this.f344900q = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.hwo), true, true, new C115029m(this));
        if (Util.isNullOrNil(this.f344875I)) {
            Log.m105925i("MicroMsg.RegByMobileRegAIOUI", "isMobile:%s, isMobileOpen:%s, SIM iso:%s", Boolean.valueOf(NetStatusUtil.isMobile(this)), Boolean.valueOf(NetStatusUtil.isMobileNetworkOpen(this)), C87203t.m108277m());
            if (NetStatusUtil.isMobile(this) || (NetStatusUtil.isMobileNetworkOpen(this) && !Util.isNullOrNil(C87203t.m108277m()))) {
                i = 2;
                Log.m105925i("MicroMsg.RegByMobileRegAIOUI", "select mobile check type %d", Integer.valueOf(i));
                C67216a aVar = new C67216a(this.f344903t + this.f344904u, 14, "", 0, "", i);
                aVar.mo91367W(this.f344873G);
                C86709a0.m107524d().mo123460f(aVar);
            }
        }
        i = 1;
        Log.m105925i("MicroMsg.RegByMobileRegAIOUI", "select mobile check type %d", Integer.valueOf(i));
        C67216a aVar2 = new C67216a(this.f344903t + this.f344904u, 14, "", 0, "", i);
        aVar2.mo91367W(this.f344873G);
        C86709a0.m107524d().mo123460f(aVar2);
    }

    /* renamed from: L7 */
    public final void mo174772L7() {
        if (Util.isNullOrNil(this.f344896j) || Util.isNullOrNil(this.f344897n)) {
            this.f344891e.setText(getString(C0966R.string.gtc));
        } else {
            this.f344891e.setText(PhoneFormater.countryNameWithCode(this.f344896j, this.f344897n));
        }
    }

    /* renamed from: M7 */
    public final void mo174773M7() {
        if (!Util.isNullOrNil(this.f344875I)) {
            C89779i0 i0Var = this.f344900q;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            this.f344900q = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, (DialogInterface.OnCancelListener) null);
            C86709a0.m107524d().mo123460f(new C46557i(1, 1, this.f344875I));
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.br6;
    }

    public void initView() {
        this.f344890d = (LinearLayout) findViewById(C0966R.C0970id.bua);
        this.f344891e = (TextView) findViewById(C0966R.C0970id.buc);
        this.f344893g = (TextView) findViewById(C0966R.C0970id.ik6);
        MMFormInputView mMFormInputView = (MMFormInputView) findViewById(C0966R.C0970id.ikc);
        this.f344894h = mMFormInputView;
        mMFormInputView.setInputType(3);
        this.f344892f = this.f344894h.getContentEditText();
        this.f344905v = findViewById(C0966R.C0970id.kh7);
        this.f344906w = (CheckBox) findViewById(C0966R.C0970id.ik5);
        this.f344907x = (TextView) findViewById(C0966R.C0970id.ik4);
        this.f344908y = (Button) findViewById(C0966R.C0970id.ijz);
        this.f344868B = (ImageView) findViewById(C0966R.C0970id.jcx);
        this.f344869C = (ImageView) findViewById(C0966R.C0970id.jcz);
        MMFormInputView mMFormInputView2 = (MMFormInputView) findViewById(C0966R.C0970id.ika);
        this.f344909z = mMFormInputView2;
        C77382c b = C77382c.m93286b(mMFormInputView2.getContentEditText());
        b.f225611e = 0;
        b.f225610d = 16;
        b.mo107499d((C77382c.C77383a) null);
        this.f344870D = (MMFormInputView) findViewById(C0966R.C0970id.f359048ik1);
        this.f344906w.setOnCheckedChangeListener(new C115030n());
        String string = getString(C0966R.string.g59);
        String str = string + getString(C0966R.string.g5a);
        C75365k kVar = new C75365k(str, string.length(), str.length());
        kVar.f221580f = new C68471o();
        LinkedList linkedList = new LinkedList();
        linkedList.add(kVar);
        ((C76978g) C86312j.m106911c(C76978g.class)).T90(this.f344907x, str, linkedList);
        boolean[] zArr = {true};
        this.f344892f.addTextChangedListener(new C115031p(zArr));
        this.f344892f.setOnFocusChangeListener(new C115032q(zArr));
        this.f344909z.mo101680a(new C115033r());
        this.f344909z.setOnFocusChangeListener(new C115034s());
        this.f344870D.mo101680a(new C115035t());
        this.f344870D.setOnFocusChangeListener(new C115036u());
        boolean[] zArr2 = {false};
        this.f344908y.setOnTouchListener(new C68467a(zArr2));
        this.f344908y.setOnClickListener(new C115021b(zArr2));
        this.f344908y.setEnabled(false);
        if (WeChatSomeFeatureSwitch.onlyUSMobile()) {
            this.f344897n = "1";
            this.f344896j = C76850a.m92631c(this, "1", getString(C0966R.string.bvs));
        }
        if (Util.isNullOrNil(this.f344897n)) {
            this.f344896j = getString(C0966R.string.bvu);
            this.f344897n = PhoneFormater.pureCountryCode(getString(C0966R.string.bvt));
        } else {
            this.f344896j = C76850a.m92631c(this, this.f344897n, getString(C0966R.string.bvs));
        }
        if (!Util.isNullOrNil(this.f344874H)) {
            this.f344893g.setText(this.f344874H);
        }
        if (Util.isNullOrNil(this.f344896j) || Util.isNullOrNil(this.f344897n)) {
            this.f344898o = ((TelephonyManager) getSystemService("phone")).getSimCountryIso();
            Log.m105924i("MicroMsg.RegByMobileRegAIOUI", "tm.getSimCountryIso()" + this.f344898o);
            if (Util.isNullOrNil(this.f344898o)) {
                Log.m105920e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
            } else {
                C76850a.C76851a a = C76850a.m92629a(this, this.f344898o, getString(C0966R.string.bvs));
                if (a == null) {
                    Log.m105920e("MicroMsg.RegByMobileRegAIOUI", "getDefaultCountryInfo error");
                } else {
                    this.f344896j = a.f224677c;
                    this.f344897n = a.f224676b;
                }
            }
        }
        mo174772L7();
        String str2 = this.f344895i;
        String str3 = "";
        if (str2 != null && !str2.equals(str3)) {
            this.f344892f.setText(this.f344895i);
        }
        this.f344890d.setOnClickListener(new C68468c());
        setBackBtn(new C115023d(), C0966R.raw.actionbar_icon_close_black);
        this.f344868B.setOnClickListener(new C1451e());
        if (Util.isNullOrNil(this.f344875I)) {
            C86709a0.m107525e().postAtFrontOfWorker(new C115024f());
        } else {
            this.f344870D.setText(this.f344878L);
            C86709a0.m107525e().postAtFrontOfWorker(new C115025g());
        }
        if (C89625d.f257845k || BuildInfo.IS_FLAVOR_BLUE) {
            str3 = getString(C0966R.string.a0u) + C88504k.m110376b(this);
        }
        setMMTitle(str3);
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        hideActionbarLine();
        if (C11171e.m11046c(23)) {
            getWindow().setStatusBarColor(getResources().getColor(C0966R.color.al6));
            updataStatusBarIcon(C85875k4.m106211z());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 30846) {
            if (i2 == -1 && mo174769I7()) {
                mo174771K7();
                C78595a.m94985e("RE200_250");
            }
        } else if (i == 30847) {
            Bundle bundle = null;
            if (intent != null) {
                bundle = intent.getBundleExtra("result_data");
            }
            if (bundle == null || !bundle.getString("go_next", "").equals("agree_privacy")) {
                C115669n.INSTANCE.idkeyStat(712, 1, 1, false);
                return;
            }
            C115669n.INSTANCE.idkeyStat(712, 2, 1, false);
            this.f344880N = false;
            if (!Util.isNullOrNil(this.f344875I)) {
                mo174773M7();
                return;
            }
            mo174768H7(this.f344903t + this.f344904u);
        } else if (i2 != 100) {
            Bitmap R5 = ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93147R5(this, i, i2, intent);
            this.f344872F = R5;
            if (R5 != null) {
                this.f344868B.setImageBitmap(R5);
                this.f344867A = true;
                this.f344869C.setVisibility(8);
            }
        } else {
            this.f344896j = Util.nullAs(intent.getStringExtra("country_name"), "");
            this.f344897n = Util.nullAs(intent.getStringExtra("couttry_code"), "");
            this.f344898o = Util.nullAs(intent.getStringExtra("iso_code"), "");
            if (!C76850a.m92638j(this.f344897n)) {
                mo174772L7();
            } else if (Util.isNullOrNil(this.f344875I) || Util.isNullOrNil(this.f344878L) || Util.isNullOrNil(this.f344879M)) {
                Intent intent2 = new Intent(this, MobileInputUI.class);
                intent2.putExtra("mobile_input_purpose", 2);
                intent2.putExtra("couttry_code", this.f344897n);
                intent2.putExtra("country_name", this.f344896j);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent2);
                C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                finish();
                overridePendingTransition(C0966R.C0968anim.f2333y, C0966R.C0968anim.f2333y);
            } else {
                mo174772L7();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        super.setRequestedOrientation(1);
        this.f344896j = Util.nullAs(getIntent().getStringExtra("country_name"), "");
        this.f344897n = PhoneFormater.pureCountryCode(Util.nullAs(getIntent().getStringExtra("couttry_code"), ""));
        this.f344898o = Util.nullAsNil(getIntent().getStringExtra("iso_code"));
        this.f344895i = Util.nullAs(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
        this.f344874H = getIntent().getStringExtra("register_title");
        this.f344878L = getIntent().getStringExtra("register_nick_name");
        this.f344879M = getIntent().getStringExtra("register_avatar");
        this.f344875I = getIntent().getStringExtra("third_app_token");
        this.f344877K = getIntent().getIntExtra("reg_3d_app_type", 0);
        initView();
    }

    public void onDestroy() {
        C118418g.INSTANCE.mo175826kl("ie_reg");
        this.f344881P.mo86054n();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        mo174770J7();
        return true;
    }

    public void onPause() {
        super.onPause();
        C89779i0 i0Var = this.f344900q;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f344882Q.dead();
        C86709a0.m107524d().mo123470p(701, this);
        C86709a0.m107524d().mo123470p(252, this);
        C86709a0.m107524d().mo123470p(145, this);
        C86709a0.m107524d().mo123470p(132, this);
        C86709a0.m107524d().mo123470p(C83049v5.CTRL_INDEX, this);
        C86709a0.m107524d().mo123470p(252, this);
        C86709a0.m107524d().mo123470p(701, this);
        C78595a.m94984d("RE200_100");
    }

    public void onResume() {
        this.f344882Q.alive();
        super.onResume();
        C86709a0.m107524d().mo123455a(701, this);
        C86709a0.m107524d().mo123455a(252, this);
        C86709a0.m107524d().mo123455a(145, this);
        C86709a0.m107524d().mo123455a(132, this);
        C86709a0.m107524d().mo123455a(C83049v5.CTRL_INDEX, this);
        C86709a0.m107524d().mo123455a(252, this);
        C86709a0.m107524d().mo123455a(701, this);
        StringBuilder sb = new StringBuilder();
        C86709a0.m107523b();
        sb.append(C86718e.m107547e());
        sb.append(",");
        sb.append(getClass().getName());
        sb.append(",");
        sb.append("RE200_100");
        sb.append(",");
        C86709a0.m107523b();
        sb.append(C86718e.m107548f("RE200_100"));
        sb.append(",");
        sb.append(1);
        C78595a.m94983c(10645, true, sb.toString());
        this.f344871E = 0;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C7660a a;
        int i3 = i;
        int i4 = i2;
        String str2 = str;
        Class cls = C11502f.class;
        Log.m105924i("MicroMsg.RegByMobileRegAIOUI", "onSceneEnd: errType = " + i3 + " errCode = " + i4 + " errMsg = " + str2);
        C89779i0 i0Var = this.f344900q;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f344900q = null;
        }
        if (i4 == -75) {
            C76879j.m92738i(this, C0966R.string.f7561jo, C0966R.string.hvq);
            return;
        }
        if (yVar.getType() == 145) {
            C67216a aVar = (C67216a) yVar;
            int f = aVar.mo91368f();
            if (f == 12) {
                if (i4 == -41 || i4 == -59) {
                    C7660a a2 = C7660a.m7782a(str);
                    if (a2 != null) {
                        a2.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                        return;
                    } else {
                        C76879j.m92738i(this, C0966R.string.hx6, C0966R.string.hx7);
                        return;
                    }
                } else {
                    this.f344904u = PhoneFormater.pureNumber(this.f344904u);
                    this.f344902s = this.f344903t + this.f344904u;
                    this.f344873G = aVar.mo91366V0();
                    if (i4 == -36 || i4 == -35 || i4 == -3) {
                        String K0 = aVar.mo91363K0();
                        if (!Util.isNullOrNil(K0)) {
                            this.f344904u = K0.trim();
                        }
                        C78595a.m94984d("RE200_100");
                        StringBuilder sb = new StringBuilder();
                        C86709a0.m107523b();
                        sb.append(C86718e.m107547e());
                        sb.append(",");
                        sb.append(getClass().getName());
                        sb.append(",");
                        sb.append("RE200_200");
                        sb.append(",");
                        C86709a0.m107523b();
                        sb.append(C86718e.m107548f("RE200_200"));
                        sb.append(",");
                        sb.append(1);
                        C78595a.m94983c(10645, true, sb.toString());
                        C7660a a3 = C7660a.m7782a(str);
                        if (a3 != null) {
                            a3.mo8792b(this, new C115027i(), new C68469j());
                            return;
                        }
                        mo174771K7();
                        C78595a.m94985e("RE200_250");
                        return;
                    } else if (i4 == -355) {
                        C13665i0.m12970c(this, str2, 30846);
                        ThirdAppRegisterStruct thirdAppRegisterStruct = this.f344881P;
                        thirdAppRegisterStruct.f343856d = (long) this.f344877K;
                        thirdAppRegisterStruct.f343857e = 5;
                        thirdAppRegisterStruct.mo86054n();
                        return;
                    } else if (i4 == -34) {
                        C76879j.m92748s(this, getString(C0966R.string.ajx), "");
                        return;
                    } else if (!((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93163uP(this, i3, i4, str2)) {
                        Toast.makeText(this, getString(C0966R.string.al8, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                    } else {
                        return;
                    }
                }
            }
            if (f == 14) {
                if (i4 == 0) {
                    int j1 = aVar.mo91372j1();
                    if (j1 == 2) {
                        C64305d33 d332 = ((C67216a.C67220c) aVar.f193010d).f193017b.f353291a.f227438C;
                        if (d332 != null) {
                            Log.m105925i("MicroMsg.RegByMobileRegAIOUI", "network check url %s", d332.f182630e);
                            Intent intent = new Intent();
                            intent.putExtra("Key_Seq", d332.f182629d);
                            intent.putExtra("Key_Url", d332.f182630e);
                            intent.putExtra("Key_CountryCode", this.f344903t);
                            intent.putExtra("Key_Mobile", this.f344904u);
                            intent.putExtra("Key_reg_sessionId", this.f344873G);
                            intent.putExtra("kintent_nickname", this.f344870D.getText().toString());
                            intent.putExtra("kintent_password", this.f344909z.getText().toString());
                            intent.putExtra("kintent_hasavatar", this.f344867A);
                            intent.setClass(this, RegByMobileAutoVerifyUI.class);
                            C9556a aVar2 = new C9556a();
                            aVar2.mo10233c(intent);
                            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            startActivity((Intent) aVar2.mo10231a(0));
                            C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        }
                    } else if (j1 == 1) {
                        C114799u uVar = aVar.f193010d;
                        String str3 = ((C67216a.C67220c) uVar).f193017b.f353291a.f227459y;
                        String str4 = ((C67216a.C67220c) uVar).f193017b.f353291a.f227458x;
                        Intent intent2 = new Intent(this, RegByMobileSendSmsUI.class);
                        intent2.putExtra("regsession_id", this.f344873G);
                        intent2.putExtra("key_reg_style", 1);
                        intent2.putExtra("from_mobile", this.f344903t + this.f344904u);
                        intent2.putExtra("to_mobile", str3);
                        intent2.putExtra("verify_code", str4);
                        intent2.putExtra("kintent_nickname", this.f344870D.getText().toString());
                        intent2.putExtra("kintent_password", this.f344909z.getText().toString());
                        intent2.putExtra("kintent_hasavatar", this.f344867A);
                        intent2.putExtra("reg_3d_app_type", this.f344877K);
                        intent2.putExtra("reg_3d_app_ticket", this.f344876J);
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(intent2);
                        C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar3.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/account/ui/RegByMobileRegAIOUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        this.f344886U = aVar.mo91373k1();
                        this.f344887V = aVar.mo91374l1();
                        this.f344888W = aVar.mo91375m1();
                        this.f344889X = aVar.mo91378p1();
                        synchronized (this) {
                            if (!this.f344885T) {
                                this.f344885T = true;
                                finish();
                                Intent intent3 = new Intent();
                                intent3.putExtra("bindmcontact_mobile", this.f344903t + " " + this.f344892f.getText().toString());
                                intent3.putExtra("bindmcontact_shortmobile", this.f344904u);
                                intent3.putExtra("country_name", this.f344896j);
                                intent3.putExtra("couttry_code", this.f344897n);
                                intent3.putExtra("mobileverify_countdownsec", this.f344886U);
                                intent3.putExtra("mobileverify_countdownstyle", this.f344887V);
                                intent3.putExtra("mobileverify_fb", this.f344888W);
                                intent3.putExtra("mobileverify_reg_qq", this.f344889X);
                                intent3.putExtra("kintent_nickname", this.f344870D.getText().toString());
                                intent3.putExtra("kintent_password", this.f344909z.getText().toString());
                                intent3.putExtra("kintent_hasavatar", this.f344867A);
                                intent3.putExtra("key_reg_style", 1);
                                intent3.putExtra("regsession_id", this.f344873G);
                                intent3.putExtra("reg_3d_app_ticket", this.f344876J);
                                intent3.putExtra("reg_3d_app_type", this.f344877K);
                                intent3.putExtra("mobile_verify_purpose", 2);
                                startActivity(MobileVerifyUI.class, intent3);
                            }
                        }
                    }
                } else if (i4 == -41) {
                    C76879j.m92738i(this, C0966R.string.hx6, C0966R.string.hx7);
                    return;
                } else if (i4 == -34) {
                    C76879j.m92748s(this, getString(C0966R.string.ajx), "");
                    return;
                } else if (!((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93163uP(this, i3, i4, str2)) {
                    Toast.makeText(this, getString(C0966R.string.al8, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
                    return;
                } else {
                    return;
                }
            }
        } else if (yVar.getType() == 755) {
            if (i3 == 0 && i4 == 0) {
                C47465a aVar4 = ((C46557i) yVar).f125450e.f127056b.f127083a;
                this.f344876J = aVar4 != null ? ((bg4) aVar4).f131108d : "";
                mo174768H7(this.f344903t + this.f344904u);
            } else if (i4 == -7) {
                ThirdAppRegisterStruct thirdAppRegisterStruct2 = this.f344881P;
                thirdAppRegisterStruct2.f343856d = (long) this.f344877K;
                thirdAppRegisterStruct2.f343857e = 7;
                thirdAppRegisterStruct2.mo86054n();
                C76879j.m92709C(this, getString(C0966R.string.clo), getString(C0966R.string.a3h), getString(C0966R.string.fex), getString(C0966R.string.f7926wf), true, new C115028k(), (DialogInterface.OnClickListener) null);
            }
        } else if ((yVar.getType() == 701 || yVar.getType() == 252) && i3 == 0 && i4 == 0) {
            ThirdAppRegisterStruct thirdAppRegisterStruct3 = this.f344881P;
            thirdAppRegisterStruct3.f343856d = (long) this.f344877K;
            thirdAppRegisterStruct3.f343857e = 12;
            thirdAppRegisterStruct3.mo86054n();
            C13665i0.m12968a(this, C75592q0.m90789s());
            C13665i0.m12969b(this, new C68470l(), false, 2);
            return;
        }
        if (!((C11502f) C86312j.m106911c(cls)).mo11461Sr().mo93163uP(this, i3, i4, str2)) {
            if ((yVar.getType() == 252 || yVar.getType() == 701) && (a = C7660a.m7782a(str)) != null) {
                a.mo8792b(this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
            }
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C118866a.class);
        hashSet.add(C14859b.class);
    }
}
