package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.appbrand.jsapi.contact.C82341m;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.JsApiChooseMultiMedia;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C75592q0;
import eg0.C7648a;
import eg0.C7649d;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import gg0.C8277f;
import gg0.C8278g;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p214om.C11502f;
import p910lj.C76701a;
import tc0.C77885p;
import te3.C64266br1;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI */
public class BindLinkedInUI extends MMActivity implements C11385n {

    /* renamed from: E */
    public static final /* synthetic */ int f10498E = 0;

    /* renamed from: A */
    public String f10499A;

    /* renamed from: B */
    public String f10500B;

    /* renamed from: C */
    public String f10501C;

    /* renamed from: D */
    public ProgressDialog f10502D;

    /* renamed from: d */
    public boolean f10503d = false;

    /* renamed from: e */
    public String f10504e;

    /* renamed from: f */
    public String f10505f;

    /* renamed from: g */
    public boolean f10506g = false;

    /* renamed from: h */
    public boolean f10507h = false;

    /* renamed from: i */
    public boolean f10508i = false;

    /* renamed from: j */
    public Bundle f10509j;

    /* renamed from: n */
    public int f10510n;

    /* renamed from: o */
    public boolean f10511o = false;

    /* renamed from: p */
    public boolean f10512p = false;

    /* renamed from: q */
    public TextView f10513q;

    /* renamed from: r */
    public TextView f10514r;

    /* renamed from: s */
    public View f10515s;

    /* renamed from: t */
    public MMSwitchBtn f10516t;

    /* renamed from: u */
    public TextView f10517u;

    /* renamed from: v */
    public TextView f10518v;

    /* renamed from: w */
    public TextView f10519w;

    /* renamed from: x */
    public String f10520x;

    /* renamed from: y */
    public String f10521y;

    /* renamed from: z */
    public String f10522z;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$a */
    public class C1342a implements MMSwitchBtn.C7041b {
        public C1342a() {
        }

        public void onStatusChange(boolean z) {
            BindLinkedInUI bindLinkedInUI = BindLinkedInUI.this;
            int i = BindLinkedInUI.f10498E;
            bindLinkedInUI.mo1288M7(z, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$b */
    public class C1343b implements DialogInterface.OnClickListener {
        public C1343b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            BindLinkedInUI bindLinkedInUI = BindLinkedInUI.this;
            int i2 = BindLinkedInUI.f10498E;
            bindLinkedInUI.mo1284I7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$c */
    public class C1344c implements View.OnClickListener {
        public C1344c() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = (String) C86709a0.m107535s().mo121142i().mo119684e(286723, (Object) null);
            if (!Util.isNullOrNil(str)) {
                Intent intent = new Intent();
                intent.putExtra("rawUrl", str);
                intent.putExtra("geta8key_username", C75592q0.m90789s());
                C88144b.m109791i(BindLinkedInUI.this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, (Bundle) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$d */
    public class C1345d implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$d$a */
        public class C1346a implements DialogInterface.OnClickListener {
            public C1346a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                BindLinkedInUI bindLinkedInUI = BindLinkedInUI.this;
                int i2 = BindLinkedInUI.f10498E;
                bindLinkedInUI.mo1283H7(false);
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$d$b */
        public class C1347b implements DialogInterface.OnClickListener {
            public C1347b(C1345d dVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C1345d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindLinkedInUI bindLinkedInUI = BindLinkedInUI.this;
            if (!bindLinkedInUI.f10507h) {
                bindLinkedInUI.getClass();
                Intent intent = new Intent();
                intent.putExtra("rawUrl", "http://www.linkedin.com/bind/plugin/");
                intent.putExtra("geta8key_username", C75592q0.m90789s());
                if (bindLinkedInUI.f10508i) {
                    intent.putExtra("geta8key_scene", 3);
                } else {
                    intent.putExtra("geta8key_scene", 8);
                }
                C88144b.m109795m(bindLinkedInUI, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 100);
            } else if (!bindLinkedInUI.f10503d) {
                bindLinkedInUI.mo1283H7(false);
            } else {
                C76879j.m92750u(bindLinkedInUI, bindLinkedInUI.getString(C0966R.string.bng), (String) null, new C1346a(), new C1347b(this));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$e */
    public class C1348e implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$e$a */
        public class C1349a implements DialogInterface.OnClickListener {

            /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$e$a$a */
            public class C1350a implements DialogInterface.OnCancelListener {

                /* renamed from: d */
                public final /* synthetic */ C7649d f10530d;

                public C1350a(C1349a aVar, C7649d dVar) {
                    this.f10530d = dVar;
                }

                public void onCancel(DialogInterface dialogInterface) {
                    C86709a0.m107524d().mo123458d(this.f10530d);
                }
            }

            public C1349a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C7649d dVar = new C7649d(1);
                BindLinkedInUI bindLinkedInUI = BindLinkedInUI.this;
                bindLinkedInUI.f10502D = C76879j.m92723Q(bindLinkedInUI, (String) null, bindLinkedInUI.getString(C0966R.string.gas), true, false, new C1350a(this, dVar));
                C86709a0.m107524d().mo123460f(dVar);
            }
        }

        /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$e$b */
        public class C1351b implements DialogInterface.OnClickListener {
            public C1351b(C1348e eVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        public C1348e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindLinkedInUI bindLinkedInUI = BindLinkedInUI.this;
            C76879j.m92750u(bindLinkedInUI, bindLinkedInUI.getString(C0966R.string.bni), (String) null, new C1349a(), new C1351b(this));
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$f */
    public class C1352f implements View.OnClickListener {
        public C1352f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            BindLinkedInUI bindLinkedInUI = BindLinkedInUI.this;
            int i = BindLinkedInUI.f10498E;
            bindLinkedInUI.mo1284I7();
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$g */
    public class C1353g implements MenuItem.OnMenuItemClickListener {
        public C1353g() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BindLinkedInUI bindLinkedInUI = BindLinkedInUI.this;
            int i = BindLinkedInUI.f10498E;
            bindLinkedInUI.mo1284I7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$h */
    public class C1354h implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C7648a f10533d;

        public C1354h(BindLinkedInUI bindLinkedInUI, C7648a aVar) {
            this.f10533d = aVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f10533d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI$i */
    public class C1355i extends ClickableSpan {
        public C1355i() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$8", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(BindLinkedInUI.this.getResources().getColor(C0966R.color.a1d));
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: H7 */
    public final void mo1283H7(boolean z) {
        C7648a aVar;
        if (this.f10509j == null) {
            Log.m105920e("MicroMsg.BindLinkedInUI", "bindBundle is null !!");
            return;
        }
        C7648a aVar2 = new C7648a(1, this.f10516t.f220433y ? 1 : 2, this.f10520x, this.f10521y, "", this.f10522z, this.f10499A, this.f10500B, this.f10501C);
        if (!z) {
            aVar = aVar2;
            this.f10502D = C76879j.m92723Q(this, (String) null, getString(C0966R.string.gas), true, false, new C1354h(this, aVar2));
        } else {
            aVar = aVar2;
        }
        C86709a0.m107524d().mo123460f(aVar);
    }

    /* renamed from: I7 */
    public final void mo1284I7() {
        if (!this.f10507h) {
            setResult(-1);
            finish();
        } else if (this.f10512p) {
            Intent b = ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93169b(this);
            b.addFlags(603979776);
            b.putExtra("preferred_tab", 2);
            C9556a aVar = new C9556a();
            aVar.mo10233c(b);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "goBack", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            setResult(-1);
            finish();
        }
    }

    /* renamed from: J7 */
    public final void mo1285J7() {
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(286721, (Object) null);
        this.f10504e = str;
        boolean z = true;
        this.f10503d = !Util.isNullOrNil(str);
        this.f10505f = (String) C86709a0.m107535s().mo121142i().mo119684e(286722, (Object) null);
        int q = C75592q0.m90787q();
        this.f10510n = q;
        if ((q & 4194304) == 0) {
            z = false;
        }
        this.f10506g = z;
    }

    /* renamed from: K7 */
    public final void mo1286K7(String str) {
        int indexOf = getString(C0966R.string.bne).indexOf("%s");
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(getString(C0966R.string.bne, new Object[]{str}));
        newSpannable.setSpan(new C1355i(), indexOf, str.length() + indexOf, 33);
        this.f10513q.setText(newSpannable);
    }

    /* renamed from: L7 */
    public final void mo1287L7(boolean z, boolean z2, String str, boolean z3) {
        this.f10519w.setVisibility(8);
        if (z) {
            this.f10514r.setVisibility(8);
            this.f10513q.setVisibility(0);
            mo1286K7(str);
            View view = this.f10515s;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f10517u.setVisibility(8);
            if (z2) {
                this.f10518v.setVisibility(0);
            }
            this.f10516t.setCheck(z3);
            this.f10516t.setSwitchListener(new C1342a());
            return;
        }
        this.f10513q.setVisibility(8);
        this.f10513q.setText(getString(C0966R.string.bnf));
        this.f10514r.setVisibility(0);
        View view3 = this.f10515s;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showNormalBindView", "(ZZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f10517u.setVisibility(0);
        this.f10518v.setVisibility(8);
    }

    /* renamed from: M7 */
    public final void mo1288M7(boolean z, boolean z2) {
        if (z) {
            this.f10510n |= 4194304;
        } else {
            this.f10510n &= -4194305;
        }
        int i = z ? 1 : 2;
        C86709a0.m107535s().mo121142i().mo119676J(7, Integer.valueOf(this.f10510n));
        if (z2) {
            C64266br1 br12 = new C64266br1();
            br12.f182324d = 33;
            br12.f182325e = i;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
            ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        }
    }

    /* renamed from: N7 */
    public final void mo1289N7() {
        boolean z = this.f10507h;
        if (z && this.f10509j == null) {
            Log.m105920e("MicroMsg.BindLinkedInUI", "bindBundle is null");
        } else if (this.f10508i) {
            mo1287L7(this.f10503d, false, this.f10505f, this.f10506g);
        } else {
            boolean z2 = true;
            if (z) {
                if (!this.f10503d || !this.f10504e.equals(this.f10520x)) {
                    z2 = false;
                }
                String str = this.f10521y;
                boolean z3 = this.f10506g;
                this.f10513q.setVisibility(0);
                mo1286K7(str);
                View view = this.f10515s;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showQrBindView", "(ZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI", "showQrBindView", "(ZLjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f10518v.setVisibility(8);
                if (z2) {
                    this.f10514r.setVisibility(8);
                    this.f10517u.setVisibility(8);
                    this.f10519w.setVisibility(8);
                    this.f10516t.setCheck(z3);
                    this.f10516t.setSwitchListener(new C8278g(this));
                    return;
                }
                this.f10514r.setVisibility(0);
                this.f10517u.setVisibility(0);
                this.f10519w.setVisibility(0);
                this.f10516t.setCheck(z3);
                this.f10516t.setSwitchListener(new C8277f(this));
                return;
            }
            mo1287L7(this.f10503d, true, this.f10505f, this.f10506g);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6571in;
    }

    public void initView() {
        if (this.f10507h) {
            setMMTitle((int) C0966R.string.bnr);
        } else if (this.f10508i) {
            setMMTitle((int) C0966R.string.bnu);
        } else {
            setMMTitle((int) C0966R.string.bnk);
        }
        this.f10513q = (TextView) findViewById(C0966R.C0970id.jd_);
        this.f10514r = (TextView) findViewById(C0966R.C0970id.jda);
        this.f10515s = findViewById(C0966R.C0970id.jk9);
        this.f10516t = (MMSwitchBtn) findViewById(C0966R.C0970id.jk8);
        this.f10517u = (TextView) findViewById(C0966R.C0970id.a9c);
        this.f10518v = (TextView) findViewById(C0966R.C0970id.kzp);
        this.f10519w = (TextView) findViewById(C0966R.C0970id.apx);
        this.f10513q.setOnClickListener(new C1344c());
        this.f10517u.setOnClickListener(new C1345d());
        this.f10518v.setOnClickListener(new C1348e());
        this.f10519w.setOnClickListener(new C1352f());
        setBackBtn(new C1353g());
        mo1289N7();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105918d("MicroMsg.BindLinkedInUI", "onActivityResult . requestCode:" + i + "  resultCode:" + i2);
        if (intent != null) {
            if (i != 100) {
                Log.m105920e("MicroMsg.BindLinkedInUI", "onActivityResult unknow request");
                return;
            }
            Bundle bundleExtra = intent.getBundleExtra("result_data");
            String string = bundleExtra.getString("ret");
            String string2 = bundleExtra.getString("limid");
            String string3 = bundleExtra.getString("liname");
            String string4 = bundleExtra.getString("liurl");
            String string5 = bundleExtra.getString("liswitch");
            if (Util.isNullOrNil(string)) {
                Log.m105920e("MicroMsg.BindLinkedInUI", "linkedin oauth ret is null, maybe canceled");
                return;
            }
            int safeParseInt = Util.safeParseInt(string);
            boolean z = true;
            if (safeParseInt != 0) {
                Log.m105921e("MicroMsg.BindLinkedInUI", "linkedin oauth bind failed ret %s ", Integer.valueOf(safeParseInt));
                C76879j.m92748s(this, getString(safeParseInt == 1 ? C0966R.string.bnp : C0966R.string.bno), (String) null);
            } else if (Util.isNullOrNil(string2)) {
                Log.m105920e("MicroMsg.BindLinkedInUI", "linkedin member id is null");
            } else {
                Log.m105919d("MicroMsg.BindLinkedInUI", "%s, %s, %s, %s", string2, string3, string4, string5);
                C86709a0.m107535s().mo121142i().mo119676J(286722, string3);
                C86709a0.m107535s().mo121142i().mo119676J(286721, string2);
                C86709a0.m107535s().mo121142i().mo119676J(286723, string4);
                if (!Util.isNullOrNil(string5)) {
                    if (Util.safeParseInt(string5) != 1) {
                        z = false;
                    }
                    mo1288M7(z, false);
                }
                mo1285J7();
                mo1289N7();
                String string6 = getString(C0966R.string.bnl);
                if (!isFinishing()) {
                    C76701a.makeText((Context) this, (CharSequence) string6, 0).show();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C86709a0.m107524d().mo123455a(JsApiChooseMultiMedia.CTRL_INDEX, this);
        C86709a0.m107524d().mo123455a(C82341m.CTRL_INDEX, this);
        Bundle bundleExtra = getIntent().getBundleExtra("qrcode_bundle");
        this.f10509j = bundleExtra;
        this.f10507h = bundleExtra != null;
        if (bundleExtra != null) {
            this.f10520x = bundleExtra.getString("i");
            this.f10521y = this.f10509j.getString("n");
            this.f10522z = this.f10509j.getString("t");
            this.f10499A = this.f10509j.getString("o");
            this.f10500B = this.f10509j.getString("s");
            String string = this.f10509j.getString("r");
            this.f10501C = string;
            if (this.f10520x == null || this.f10521y == null || this.f10522z == null || this.f10500B == null || string == null) {
                C76879j.m92713G(this, getString(C0966R.string.bnh), (String) null, false, new C1343b());
            }
        }
        this.f10508i = getIntent().getBooleanExtra("oversea_entry", false);
        mo1285J7();
        if (this.f10507h) {
            this.f10506g = true;
        }
        initView();
        if (this.f10509j != null && this.f10503d && this.f10504e.equals(this.f10520x)) {
            this.f10511o = true;
            mo1283H7(true);
        }
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(C82341m.CTRL_INDEX, this);
        C86709a0.m107524d().mo123470p(JsApiChooseMultiMedia.CTRL_INDEX, this);
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo1284I7();
        return true;
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        int i4;
        ProgressDialog progressDialog = this.f10502D;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f10502D = null;
        }
        if (i == 0 && i2 == 0) {
            if (yVar.getType() == 549) {
                this.f10512p = true;
                i4 = !this.f10511o ? C0966R.string.bnl : C0966R.string.bnm;
            } else if (yVar.getType() == 550) {
                i4 = C0966R.string.bnw;
            } else {
                return;
            }
            String string = getString(i4);
            if (!isFinishing()) {
                C76701a.makeText((Context) this, (CharSequence) string, 0).show();
            }
            mo1285J7();
            this.f10506g = this.f10516t.f220433y;
            mo1289N7();
            return;
        }
        if (yVar.getType() == 549) {
            i3 = i2 == 1 ? C0966R.string.bnp : C0966R.string.bno;
        } else if (yVar.getType() == 550) {
            i3 = C0966R.string.bnq;
        } else {
            return;
        }
        C76879j.m92748s(this, getString(i3), (String) null);
    }
}
