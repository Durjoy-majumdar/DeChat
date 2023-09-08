package com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.receive;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.WxaLuckyMoneyBaseUI;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import k32.C46640e;
import kg3.C76577a;
import nj3.C76879j;
import nj3.C88989a;
import o32.C47327b;
import o32.C47328d;
import o32.C76987a;
import o32.C76988c;
import o32.C76990f;
import qo3.C89779i0;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI */
public class WxaLuckyMoneyReceiveUI extends WxaLuckyMoneyBaseUI implements C47327b {

    /* renamed from: y */
    public static final /* synthetic */ int f198850y = 0;

    /* renamed from: h */
    public int f198851h = -1;

    /* renamed from: i */
    public int f198852i = -1;

    /* renamed from: j */
    public C76987a f198853j;

    /* renamed from: n */
    public ImageView f198854n;

    /* renamed from: o */
    public TextView f198855o;

    /* renamed from: p */
    public TextView f198856p;

    /* renamed from: q */
    public TextView f198857q;

    /* renamed from: r */
    public Button f198858r;

    /* renamed from: s */
    public ImageView f198859s;

    /* renamed from: t */
    public View f198860t;

    /* renamed from: u */
    public ImageView f198861u;

    /* renamed from: v */
    public TextView f198862v;

    /* renamed from: w */
    public View f198863w;

    /* renamed from: x */
    public C89779i0 f198864x = null;

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI$a */
    public class C69142a implements View.OnClickListener {
        public C69142a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C76987a aVar = WxaLuckyMoneyReceiveUI.this.f198853j;
            if (aVar != null) {
                C76990f fVar = (C76990f) aVar;
                if (fVar.f224978a == null) {
                    Log.m105924i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onDetailBtnClick ui == null");
                } else {
                    fVar.mo107310b();
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI$b */
    public class C69143b implements View.OnClickListener {
        public C69143b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WxaLuckyMoneyReceiveUI wxaLuckyMoneyReceiveUI = WxaLuckyMoneyReceiveUI.this;
            int i = WxaLuckyMoneyReceiveUI.f198850y;
            wxaLuckyMoneyReceiveUI.mo95278I7(4, -1);
            WxaLuckyMoneyReceiveUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI$c */
    public class C69144c implements DialogInterface.OnCancelListener {
        public C69144c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            WxaLuckyMoneyReceiveUI.this.mo95258s1();
            if (WxaLuckyMoneyReceiveUI.this.getContentView().getVisibility() == 8 || WxaLuckyMoneyReceiveUI.this.getContentView().getVisibility() == 4) {
                Log.m105924i("MicroMsg.WxaLuckyMoneyReceiveUI", "user cancel & finish");
                WxaLuckyMoneyReceiveUI.this.mo95278I7(4, -1);
                WxaLuckyMoneyReceiveUI.this.finish();
            }
        }
    }

    /* renamed from: H7 */
    public final void mo95277H7() {
        if (this.f198858r != null) {
            String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
            if (loadApplicationLanguage == null || loadApplicationLanguage.length() <= 0 || (!loadApplicationLanguage.equals("zh_CN") && !loadApplicationLanguage.equals("zh_TW") && !loadApplicationLanguage.equals("zh_HK"))) {
                this.f198858r.setBackgroundResource(C0966R.C0969drawable.aef);
                this.f198858r.setText(C0966R.string.f360994gi2);
            }
        }
    }

    /* renamed from: I7 */
    public final void mo95278I7(int i, int i2) {
        Log.m105925i("MicroMsg.WxaLuckyMoneyReceiveUI", "setBackResult cgiType:[%d],errCode:[%d]", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 1) {
            setResult(0, new Intent().putExtra("result_error_code", 10001).putExtra("result_error_msg", "fail:no permission to receive the red packet"));
        } else if (i == 4) {
            setResult(0, new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}"));
        }
    }

    /* renamed from: J7 */
    public final void mo95279J7(TextView textView, int i) {
        int f = (int) (((float) C76577a.m92155f(getContext(), i)) * C76577a.m92171v(getContext()));
        int h = C76577a.m92157h(getContext(), i);
        if (h <= f) {
            f = h;
        }
        textView.setTextSize(0, (float) f);
    }

    /* renamed from: K7 */
    public final void mo95280K7(boolean z, boolean z2) {
        if (z) {
            View view = this.f198860t;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z2) {
                this.f198862v.setText(C0966R.string.gfg);
            } else {
                this.f198862v.setText(C0966R.string.f360978gf2);
            }
            this.f198861u.setVisibility(8);
            this.f198860t.setOnClickListener(new C69142a());
            return;
        }
        View view3 = this.f198860t;
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showCheckDetailBtnOrImg", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f198861u.setVisibility(0);
    }

    /* renamed from: L7 */
    public final void mo95281L7() {
        C69242l1.m81613s(this.f198863w, (Animation.AnimationListener) null);
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "showRedPacket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: M7 */
    public final void mo95282M7(String str, String str2) {
        if (!Util.isNullOrNil(str)) {
            this.f198856p.setText(str);
            this.f198856p.setVisibility(0);
        } else {
            this.f198856p.setVisibility(8);
        }
        if (!Util.isNullOrNil(str2)) {
            C69242l1.m81616v(getContext(), this.f198857q, str2);
            this.f198857q.setVisibility(0);
        }
    }

    /* renamed from: V2 */
    public void mo72378V2() {
        this.f198858r.setVisibility(0);
        C69242l1.m81618x(this.f198859s);
    }

    /* renamed from: Y2 */
    public void mo72379Y2(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        mo95258s1();
        C69242l1.m81595a(this.f198854n, str2, (String) null);
        C69242l1.m81616v(getContext(), this.f198855o, str);
        mo95282M7(str3, str4);
        this.f198858r.setOnClickListener(new C76988c(this));
        this.f198858r.setVisibility(0);
        mo95280K7(z, z2);
        mo95281L7();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360077cj3;
    }

    public void initView() {
        this.f198863w = findViewById(C0966R.C0970id.gic);
        this.f198854n = (ImageView) findViewById(C0966R.C0970id.gig);
        this.f198855o = (TextView) findViewById(C0966R.C0970id.gih);
        this.f198856p = (TextView) findViewById(C0966R.C0970id.gij);
        this.f198857q = (TextView) findViewById(C0966R.C0970id.gim);
        this.f198858r = (Button) findViewById(C0966R.C0970id.giq);
        this.f198859s = (ImageView) findViewById(C0966R.C0970id.gir);
        this.f198862v = (TextView) findViewById(C0966R.C0970id.gin);
        this.f198860t = findViewById(C0966R.C0970id.gio);
        this.f198861u = (ImageView) findViewById(C0966R.C0970id.gbu);
        ((ImageView) findViewById(C0966R.C0970id.gip)).setOnClickListener(new C69143b());
        mo95279J7(this.f198855o, C0966R.dimen.aeb);
        mo95279J7(this.f198856p, C0966R.dimen.aec);
        mo95279J7(this.f198857q, C0966R.dimen.aed);
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/WxaLuckyMoneyReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C89779i0 Q = C76879j.m92723Q(getContext(), (String) null, getString(C0966R.string.gas), true, true, new C69144c());
        this.f198864x = Q;
        Q.show();
        mo95277H7();
    }

    public void onBackPressed() {
        mo95278I7(this.f198852i, this.f198851h);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.WxaLuckyMoneyReceiveUI", "WxaLuckyMoneyReceiveUI.onCreate ");
        initView();
        getIntent();
        C76990f fVar = new C76990f();
        this.f198853j = fVar;
        Intent intent = getIntent();
        Log.m105924i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onCreate ");
        fVar.f224978a = this;
        if (intent == null) {
            Log.m105924i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onCreate intent == null");
            fVar.mo107309a(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{intent is null}}"));
            return;
        }
        fVar.f224979b = intent.getStringExtra("appId");
        fVar.f224980c = intent.getStringExtra("sendId");
        if (Util.isNullOrNil(fVar.f224979b) || Util.isNullOrNil(fVar.f224980c)) {
            Log.m105925i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onCreate appId = [%s] sendId = [%s]", fVar.f224979b, fVar.f224980c);
            fVar.mo107309a(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{appid or send is nil}}"));
            return;
        }
        new C46640e(fVar.f224979b, fVar.f224980c).mo71901a(new C47328d(fVar));
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("MicroMsg.WxaLuckyMoneyReceiveUI", "WxaLuckyMoneyReceiveUI.onDestroy ");
        C89779i0 i0Var = this.f198864x;
        if (i0Var != null && i0Var.isShowing()) {
            this.f198864x.dismiss();
        }
        C76987a aVar = this.f198853j;
        if (aVar != null) {
            C76990f fVar = (C76990f) aVar;
            Log.m105924i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onDestroy ");
            fVar.f224978a = null;
            fVar.f224982e = null;
            fVar.f224983f = null;
            this.f198853j = null;
        }
    }

    public void onResume() {
        super.onResume();
        this.f198858r.setVisibility(0);
        C69242l1.m81618x(this.f198859s);
        this.f198858r.setBackgroundResource(C0966R.C0969drawable.c27);
        mo95277H7();
    }

    /* renamed from: r6 */
    public void mo72380r6(String str, String str2, int i, int i2, String str3, boolean z, boolean z2) {
        this.f198851h = i2;
        this.f198852i = i;
        mo95258s1();
        C69242l1.m81595a(this.f198854n, str2, (String) null);
        C69242l1.m81616v(getContext(), this.f198855o, str);
        mo95282M7((String) null, str3);
        this.f198858r.setOnClickListener((View.OnClickListener) null);
        this.f198858r.setVisibility(8);
        this.f198859s.setVisibility(8);
        mo95280K7(z, z2);
        mo95281L7();
    }

    /* renamed from: s1 */
    public void mo95258s1() {
        C89779i0 i0Var = this.f198864x;
        if (i0Var != null && i0Var.isShowing()) {
            this.f198864x.dismiss();
        }
    }

    /* renamed from: t */
    public MMActivity mo95266t() {
        return this;
    }
}
