package com.tencent.p014mm.plugin.appbrand.p026ui.autofill;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.AppBrandJsApiPayService;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1796d;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gt0.C76063l;
import gt0.C87362k;
import hk0.C76200a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qo3.C89779i0;
import te3.C64461j8;
import te3.x44;
import te3.xc4;
import te3.y44;
import te3.yc4;
import wr0.c$$a;
import zq0.C91919w;
import zt3.C119157j;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI */
public class AppBrandIDCardUI extends MMActivity {

    /* renamed from: C */
    public static final /* synthetic */ int f345438C = 0;

    /* renamed from: A */
    public PhoneItem f345439A;

    /* renamed from: B */
    public C115272d f345440B = new C115267a();

    /* renamed from: d */
    public MMFragment f345441d;

    /* renamed from: e */
    public String f345442e;

    /* renamed from: f */
    public String f345443f;

    /* renamed from: g */
    public String f345444g;

    /* renamed from: h */
    public String f345445h;

    /* renamed from: i */
    public int f345446i;

    /* renamed from: j */
    public String f345447j;

    /* renamed from: n */
    public String f345448n;

    /* renamed from: o */
    public y44 f345449o;

    /* renamed from: p */
    public C64461j8 f345450p;

    /* renamed from: q */
    public LinkedList<Integer> f345451q;

    /* renamed from: r */
    public int f345452r;

    /* renamed from: s */
    public String f345453s;

    /* renamed from: t */
    public String f345454t;

    /* renamed from: u */
    public String f345455u;

    /* renamed from: v */
    public int f345456v;

    /* renamed from: w */
    public boolean f345457w = false;

    /* renamed from: x */
    public C87362k f345458x;

    /* renamed from: y */
    public C76200a f345459y;

    /* renamed from: z */
    public C89779i0 f345460z;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI$a */
    public class C115267a implements C115272d {

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI$a$a */
        public class C115268a implements C1796d {

            /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI$a$a$a */
            public class C115269a implements C40324j.C40326a {

                /* renamed from: a */
                public final /* synthetic */ String f345463a;

                public C115269a(String str) {
                    this.f345463a = str;
                }

                /* renamed from: a */
                public void mo288a(int i, int i2, String str, C47350c cVar) {
                    AppBrandIDCardUI.this.runOnUiThread(new c$$a(this, i, i2, cVar, str, this.f345463a));
                }
            }

            public C115268a() {
            }

            /* renamed from: a */
            public void mo1767a(boolean z, String str) {
                PhoneItem phoneItem;
                if (z) {
                    C115669n.INSTANCE.mo160131h(14943, AppBrandIDCardUI.this.f345442e, 4, AppBrandIDCardUI.this.f345449o.f354574s);
                    C47350c.C47352b bVar = new C47350c.C47352b();
                    bVar.f127066a = new xc4();
                    bVar.f127067b = new yc4();
                    bVar.f127068c = "/cgi-bin/mmbiz-bin/userdata/submitauthorizeuserid";
                    bVar.f127069d = 1721;
                    bVar.f127070e = 0;
                    bVar.f127071f = 0;
                    C47350c a = bVar.mo72403a();
                    xc4 xc4 = (xc4) a.f127055a.f127080a;
                    AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
                    xc4.f144591d = appBrandIDCardUI.f345442e;
                    xc4.f144592e = appBrandIDCardUI.f345451q;
                    xc4.f144593f = str;
                    xc4.f144594g = appBrandIDCardUI.f345449o.f354574s;
                    int i = appBrandIDCardUI.f345456v;
                    if ((i == 1 || i == 2) && (phoneItem = appBrandIDCardUI.f345439A) != null && !phoneItem.f245278n) {
                        xc4.f144595h = Util.nullAsNil(phoneItem.f245271d);
                    }
                    C89779i0 i0Var = AppBrandIDCardUI.this.f345460z;
                    if (i0Var != null && !i0Var.isShowing()) {
                        AppBrandIDCardUI.this.f345460z.show();
                    }
                    ((C40324j) C86312j.m106911c(C40324j.class)).mo63013cp(a, new C115269a(str), AppBrandIDCardUI.this.theCreate());
                } else {
                    AppBrandIDCardUI appBrandIDCardUI2 = AppBrandIDCardUI.this;
                    int i2 = appBrandIDCardUI2.f345456v;
                    if (i2 == 1 || i2 == 2) {
                        appBrandIDCardUI2.setResult(0);
                        AppBrandIDCardUI.this.finish();
                    }
                }
                Log.m105925i("MicroMsg.AppBrandIDCardUI", "verifyOk:%b", Boolean.valueOf(z));
            }
        }

        public C115267a() {
        }

        /* renamed from: a */
        public static void m162024a(C115267a aVar, String str) {
            AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
            C76879j.m92717K(appBrandIDCardUI, false, str, "", appBrandIDCardUI.getString(C0966R.string.f7642md), "", new C115284l(aVar), new C115285m(aVar));
        }

        /* renamed from: b */
        public void mo175055b() {
            Log.m105924i("MicroMsg.AppBrandIDCardUI", "verifyPassword");
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo160131h(14943, AppBrandIDCardUI.this.f345442e, 2, AppBrandIDCardUI.this.f345449o.f354574s);
            if (AppBrandIDCardUI.this.f345449o.f354575t == null) {
                Log.m105920e("MicroMsg.AppBrandIDCardUI", "showAuthorizeUserIDResp.verify_pay_req is null");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appId", AppBrandIDCardUI.this.f345449o.f354575t.f354520d);
                jSONObject.put("timeStamp", AppBrandIDCardUI.this.f345449o.f354575t.f354521e);
                jSONObject.put("nonceStr", AppBrandIDCardUI.this.f345449o.f354575t.f354522f);
                jSONObject.put("package", AppBrandIDCardUI.this.f345449o.f354575t.f354523g);
                jSONObject.put("signType", AppBrandIDCardUI.this.f345449o.f354575t.f354524h);
                jSONObject.put("paySign", AppBrandIDCardUI.this.f345449o.f354575t.f354525i);
                nVar.mo160131h(14943, AppBrandIDCardUI.this.f345442e, 3, AppBrandIDCardUI.this.f345449o.f354574s);
                AppBrandJsApiPayService.INSTANCE.verifyPassword(AppBrandIDCardUI.this, (AppBrandStatObject) null, jSONObject, new C115268a());
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.AppBrandIDCardUI", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI$b */
    public class C115270b implements MenuItem.OnMenuItemClickListener {
        public C115270b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
            int i = AppBrandIDCardUI.f345438C;
            appBrandIDCardUI.mo175053I7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI$c */
    public class C115271c implements DialogInterface.OnCancelListener {
        public C115271c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            AppBrandIDCardUI.this.setResult(0);
            AppBrandIDCardUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI$d */
    public interface C115272d {
    }

    /* renamed from: H7 */
    public static void m162021H7(AppBrandIDCardUI appBrandIDCardUI, String str) {
        appBrandIDCardUI.getClass();
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.AppBrandIDCardUI", "url is null");
            return;
        }
        Log.m105926v("MicroMsg.AppBrandIDCardUI", "goToWebview url: " + str);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("forceHideShare", true);
        C88144b.m109791i(appBrandIDCardUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: I7 */
    public final void mo175053I7() {
        C87362k kVar;
        if (!(this.f345441d instanceof AppBrandIDCardVerifyPwdFrag) || this.f345456v != 0) {
            int i = this.f345456v;
            if ((i != 1 && i != 2) || (kVar = this.f345458x) == null || !kVar.mo121782e()) {
                finish();
                return;
            }
            return;
        }
        Log.m105924i("MicroMsg.AppBrandIDCardUI", "switchToShowFragment");
        ((C119157j) C119157j.f356862d).mo183895z(new C115287o(this));
    }

    /* renamed from: J7 */
    public final void mo175054J7(int i) {
        C115669n.INSTANCE.mo160131h(21655, Integer.valueOf(this.f345446i), this.f345447j, Integer.valueOf(i), this.f345448n);
    }

    public void finish() {
        C76200a aVar;
        C89779i0 i0Var = this.f345460z;
        if (i0Var != null && i0Var.isShowing()) {
            this.f345460z.dismiss();
        }
        C87362k kVar = this.f345458x;
        if (!(kVar == null || (aVar = this.f345459y) == null)) {
            kVar.mo121777a(aVar);
        }
        super.finish();
        int i = this.f345456v;
        if (i == 1 || i == 2) {
            overridePendingTransition(0, 0);
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public boolean noActionBar() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105925i("MicroMsg.AppBrandIDCardUI", "onActivityResult, requestcode: %d", Integer.valueOf(i));
        if (i == 10000 || i == 10001) {
            C76200a aVar = this.f345459y;
            if (aVar != null) {
                aVar.mo106466d((ArrayList) C91919w.f263170a.mo125747b());
            } else {
                Log.m105920e("MicroMsg.AppBrandIDCardUI", "onActivityResult, AuthDialog is null");
            }
        }
    }

    public void onBackPressed() {
        mo175053I7();
    }

    public void onCreate(Bundle bundle) {
        int identifier;
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f345456v = extras.getInt("id_ui_theme", 0);
        }
        int i = this.f345456v;
        if (i == 1 || i == 2) {
            setTheme(C0966R.style.f8648pu);
        }
        super.onCreate(bundle);
        if (extras == null) {
            Log.m105920e("MicroMsg.AppBrandIDCardUI", "bundle is null, return");
            finish();
            return;
        }
        this.f345442e = extras.getString("intent_appid", "");
        this.f345443f = extras.getString("wecoin_protocol_url", "");
        this.f345444g = extras.getString("wecoin_apply_info", "");
        this.f345445h = extras.getString("wecoin_apply_wording", "");
        this.f345446i = extras.getInt("wecoin_kv_scene_id", 1);
        this.f345447j = extras.getString("wecoin_kv_session_id", "");
        this.f345448n = extras.getString("wecoin_kv_cgi_session_id", "");
        this.f345455u = extras.getString("intent_app_name", "");
        if (Util.isNullOrNil(this.f345442e)) {
            Log.m105920e("MicroMsg.AppBrandIDCardUI", "appId is null, return");
            finish();
            return;
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        try {
            String string = extras.getString("intent_category_id");
            Log.m105925i("MicroMsg.AppBrandIDCardUI", "[processCategoryId] categoryIdStr:%s", string);
            JSONArray jSONArray = new JSONArray(string);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                linkedList.add(Integer.valueOf(jSONArray.optInt(i2)));
            }
        } catch (JSONException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandIDCardUI", e, "", new Object[0]);
            linkedList = null;
        }
        this.f345451q = linkedList;
        if (Util.isNullOrNil((List) linkedList) || this.f345451q.size() <= 0) {
            Log.m105920e("MicroMsg.AppBrandIDCardUI", "categoryId is null, return");
            Intent intent = new Intent();
            intent.putExtra("intent_err_code", 40003);
            intent.putExtra("intent_err_msg", "category_id is null");
            setResult(1, intent);
            finish();
            return;
        }
        this.f345452r = extras.getInt("intent_auth_type", 1);
        getContentView().setBackgroundColor(getResources().getColor(C0966R.color.a7_));
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(C0966R.C0970id.f5910s2);
        ((ViewGroup) getContentView()).addView(frameLayout, layoutParams);
        setBackBtn(new C115270b());
        C89779i0 Q = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.gas), true, true, new C115271c());
        this.f345460z = Q;
        Q.show();
        int i3 = this.f345456v;
        if (i3 == 1 || i3 == 2) {
            C85875k4.m106177d0(getWindow());
            getContentView().setBackgroundColor(0);
            getContentView().findViewById(C0966R.C0970id.f5910s2).setBackgroundColor(0);
            this.f345458x = new C87362k(getContext(), (C76063l) null);
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            View childAt = viewGroup.getChildAt(0);
            if (!(childAt instanceof ViewGroup) || !this.f345457w) {
                Log.m105925i("MicroMsg.AppBrandIDCardUI", "can't find sub viewgroup in decorview, request overlay: %b", Boolean.valueOf(this.f345457w));
                ((ViewGroup) getContentView()).addView(this.f345458x);
            } else {
                if (!(childAt instanceof FrameLayout)) {
                    FrameLayout frameLayout2 = new FrameLayout(childAt.getContext());
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                    AppCompatActivity context = getContext();
                    int l = C85875k4.m106192l(context);
                    layoutParams2.bottomMargin = (!(l > 0 && l != C85875k4.m106198o(context)) || (identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", Platform.ANDROID)) <= 0) ? 0 : Resources.getSystem().getDimensionPixelSize(identifier);
                    viewGroup.addView(frameLayout2, layoutParams2);
                    childAt = frameLayout2;
                }
                Log.m105924i("MicroMsg.AppBrandIDCardUI", "find sub viewgroup in decorview");
                childAt.setFitsSystemWindows(false);
                try {
                    ((ViewGroup) childAt).addView(this.f345458x);
                } catch (Exception e2) {
                    Log.m105929w("MicroMsg.AppBrandIDCardUI", "add view to decorSubView error", e2);
                    ((ViewGroup) getContentView()).addView(this.f345458x);
                }
            }
        }
        C115267a aVar = (C115267a) this.f345440B;
        aVar.getClass();
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new x44();
        bVar.f127067b = new y44();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/userdata/showauthorizeuserid";
        bVar.f127069d = 1774;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        x44 x44 = (x44) a.f127055a.f127080a;
        AppBrandIDCardUI appBrandIDCardUI = AppBrandIDCardUI.this;
        x44.f144453d = appBrandIDCardUI.f345442e;
        x44.f144454e = appBrandIDCardUI.f345451q;
        x44.f144455f = appBrandIDCardUI.f345452r;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63013cp(a, new C115279g(aVar), AppBrandIDCardUI.this.theCreate());
        if (isSupportNavigationSwipeBack()) {
            getSwipeBackLayout().setEnableGesture(false);
        }
    }

    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        int i = this.f345456v;
        if (i == 1 || i == 2) {
            setTheme(C0966R.style.f8648pu);
        }
        try {
            getWindow().requestFeature(10);
            this.f345457w = true;
        } catch (Throwable th) {
            Log.m105929w("MicroMsg.AppBrandIDCardUI", "request overlay failed", th);
            this.f345457w = false;
        }
        getWindow().getDecorView().setFitsSystemWindows(true);
        supportRequestWindowFeature(10);
        supportRequestWindowFeature(1);
    }

    public void onSwipeBack() {
        mo175053I7();
    }
}
