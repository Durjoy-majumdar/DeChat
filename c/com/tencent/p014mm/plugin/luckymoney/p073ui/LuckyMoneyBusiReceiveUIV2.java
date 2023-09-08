package com.tencent.p014mm.plugin.luckymoney.p073ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.C103733h;
import b63.C67186g0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69232i1;
import com.tencent.p014mm.plugin.luckymoney.model.C69242l1;
import com.tencent.p014mm.plugin.luckymoney.model.C69259q1;
import com.tencent.p014mm.plugin.luckymoney.model.C69261r1;
import com.tencent.p014mm.plugin.luckymoney.model.C69267u1;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.plugin.wallet_core.utils.C72506r;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import di3.C86312j;
import eb0.C75592q0;
import f32.C75672b;
import f32.C75674c;
import f32.C75675d;
import f40.C86709a0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p281yz.C79173v;
import tc2.C118418g;
import te3.C77935gl2;
import te3.C77994sf2;
import te3.C77999tf2;
import vo3.C90852c;
import yq3.C79148e;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2 */
public class LuckyMoneyBusiReceiveUIV2 extends LuckyMoneyBaseUI {

    /* renamed from: H */
    public static final String f199751H = MMApplicationContext.getContext().getResources().getString(C0966R.string.l_3);

    /* renamed from: A */
    public int f199752A = 0;

    /* renamed from: B */
    public int f199753B = 0;

    /* renamed from: C */
    public C69261r1 f199754C;

    /* renamed from: D */
    public ImageView f199755D;

    /* renamed from: E */
    public TextView f199756E;

    /* renamed from: F */
    public int f199757F;

    /* renamed from: G */
    public ImageView f199758G;

    /* renamed from: g */
    public View f199759g;

    /* renamed from: h */
    public ViewGroup f199760h;

    /* renamed from: i */
    public LinearLayout f199761i;

    /* renamed from: j */
    public View f199762j;

    /* renamed from: n */
    public ImageView f199763n;

    /* renamed from: o */
    public TextView f199764o;

    /* renamed from: p */
    public TextView f199765p;

    /* renamed from: q */
    public TextView f199766q;

    /* renamed from: r */
    public TextView f199767r;

    /* renamed from: s */
    public Button f199768s;

    /* renamed from: t */
    public WeImageView f199769t;

    /* renamed from: u */
    public ImageView f199770u;

    /* renamed from: v */
    public String f199771v = null;

    /* renamed from: w */
    public String f199772w;

    /* renamed from: x */
    public String f199773x = null;

    /* renamed from: y */
    public int f199774y;

    /* renamed from: z */
    public long f199775z;

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2$a */
    public class C69353a extends C7089c0 {
        public C69353a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "click close btn");
            LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2 = LuckyMoneyBusiReceiveUIV2.this;
            String str = LuckyMoneyBusiReceiveUIV2.f199751H;
            luckyMoneyBusiReceiveUIV2.mo95548K7(0, "click close btn");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2$b */
    public class C69354b implements C72506r.C72510d {
        public C69354b() {
        }

        /* renamed from: a */
        public void mo95297a(C77935gl2 gl22) {
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "click intercept button");
            LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2 = LuckyMoneyBusiReceiveUIV2.this;
            String str = LuckyMoneyBusiReceiveUIV2.f199751H;
            luckyMoneyBusiReceiveUIV2.mo95548K7(-1, "");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2$c */
    public class C69355c extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ C69259q1 f199778g;

        public C69355c(C69259q1 q1Var) {
            this.f199778g = q1Var;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go luckymoney detail mCheckDetailLl");
            Intent intent = LuckyMoneyBusiReceiveUIV2.this.getIntent();
            if (intent == null) {
                intent = new Intent();
            }
            intent.setClass(LuckyMoneyBusiReceiveUIV2.this.getContext(), LuckyMoneyBeforeDetailUI.class);
            intent.putExtra("key_lucky_money_can_received", true);
            intent.putExtra("key_native_url", LuckyMoneyBusiReceiveUIV2.this.f199771v);
            intent.putExtra("key_sendid", this.f199778g.f199298h);
            intent.putExtra("key_static_from_scene", LuckyMoneyBusiReceiveUIV2.this.f199753B);
            intent.putExtra("key_username", LuckyMoneyBusiReceiveUIV2.this.f199772w);
            intent.putExtra("key_from_username", LuckyMoneyBusiReceiveUIV2.this.getIntent().getStringExtra("key_from_username"));
            intent.putExtra("key_hb_kind", 2);
            intent.putExtra("key_msgid", LuckyMoneyBusiReceiveUIV2.this.f199775z);
            LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2 = LuckyMoneyBusiReceiveUIV2.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV22 = luckyMoneyBusiReceiveUIV2;
            C117292a.m165358d(luckyMoneyBusiReceiveUIV22, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2$3", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyBusiReceiveUIV2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(luckyMoneyBusiReceiveUIV22, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2$3", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            LuckyMoneyBusiReceiveUIV2.this.mo95548K7(-1, "");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2$d */
    public class C69356d implements DialogInterface.OnClickListener {
        public C69356d(LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "click btn");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2$e */
    public class C69357e implements C79148e.C79149a {
        public C69357e(LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2) {
        }

        public Intent onProcessEnd(int i, Bundle bundle) {
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "click onProcessEnd");
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2$f */
    public class C69358f extends C7089c0 {
        public C69358f() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "open btn click");
            C115669n.INSTANCE.mo160131h(11701, 10, 0, 0, 0, 2);
            LuckyMoneyBusiReceiveUIV2.this.f199768s.setClickable(false);
            LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2 = LuckyMoneyBusiReceiveUIV2.this;
            luckyMoneyBusiReceiveUIV2.getClass();
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do open hb");
            C69261r1 r1Var = luckyMoneyBusiReceiveUIV2.f199754C;
            luckyMoneyBusiReceiveUIV2.doSceneProgress(new C69259q1(r1Var.f199315i, r1Var.f199314h, r1Var.f199316j, luckyMoneyBusiReceiveUIV2.getIntent().getStringExtra("packageExt"), luckyMoneyBusiReceiveUIV2.f199772w), false);
            luckyMoneyBusiReceiveUIV2.f199768s.setVisibility(8);
            C69242l1.m81617w(luckyMoneyBusiReceiveUIV2.f199770u, 0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBusiReceiveUIV2$g */
    public class C69359g extends C7089c0 {
        public C69359g() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go luckymoney detail - receive");
            C115669n.INSTANCE.mo160131h(11701, 11, 0, 0, 0, 4);
            Intent intent = LuckyMoneyBusiReceiveUIV2.this.getIntent();
            if (intent == null) {
                intent = new Intent();
            }
            intent.setClass(LuckyMoneyBusiReceiveUIV2.this.getContext(), LuckyMoneyBeforeDetailUI.class);
            intent.putExtra("key_native_url", LuckyMoneyBusiReceiveUIV2.this.f199771v);
            intent.putExtra("key_sendid", LuckyMoneyBusiReceiveUIV2.this.f199754C.f199315i);
            intent.putExtra("key_static_from_scene", LuckyMoneyBusiReceiveUIV2.this.f199753B);
            intent.putExtra("key_lucky_money_can_received", true);
            intent.putExtra("key_username", LuckyMoneyBusiReceiveUIV2.this.f199772w);
            intent.putExtra("key_from_username", LuckyMoneyBusiReceiveUIV2.this.getIntent().getStringExtra("key_from_username"));
            intent.putExtra("key_msgid", LuckyMoneyBusiReceiveUIV2.this.f199775z);
            intent.putExtra("key_hb_kind", 2);
            LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV2 = LuckyMoneyBusiReceiveUIV2.this;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            LuckyMoneyBusiReceiveUIV2 luckyMoneyBusiReceiveUIV22 = luckyMoneyBusiReceiveUIV2;
            C117292a.m165358d(luckyMoneyBusiReceiveUIV22, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2$7", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyBusiReceiveUIV2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(luckyMoneyBusiReceiveUIV22, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2$7", "onRealClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            LuckyMoneyBusiReceiveUIV2.this.mo95548K7(-1, "");
        }
    }

    /* renamed from: J7 */
    public final void mo95547J7() {
        boolean z;
        int i;
        Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do receive hb");
        mo95549L7();
        C69261r1 r1Var = this.f199754C;
        String str = "";
        if (r1Var == null) {
            Log.m105920e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "ReceiveScene == null");
            mo95548K7(0, str);
        } else if (r1Var.f199321r == 2) {
            doSceneProgress(new C69267u1(this.f199773x, 11, 0, this.f199771v, "v1.0"), false);
        } else {
            C69242l1.m81610p(this.f199763n, r1Var.f199317n, (String) null, true);
            C69242l1.m81616v(getContext(), this.f199764o, this.f199754C.f199319p);
            C69261r1 r1Var2 = this.f199754C;
            if (r1Var2.f199321r == 1 || (i = r1Var2.f199320q) == 4 || i == 5 || i == 1) {
                C115669n.INSTANCE.mo160131h(11701, 11, 0, 0, 0, 3);
                this.f199768s.setVisibility(8);
                this.f199770u.setVisibility(8);
                if (!Util.isNullOrNil(this.f199754C.f199322s)) {
                    this.f199766q.setText(this.f199754C.f199322s);
                    this.f199766q.setVisibility(0);
                    this.f199766q.setSingleLine(false);
                } else {
                    this.f199766q.setVisibility(8);
                }
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f199762j.getLayoutParams();
                layoutParams.bottomMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 30.0f);
                this.f199762j.setLayoutParams(layoutParams);
                z = true;
            } else {
                if (!Util.isNullOrNil(r1Var2.f199322s)) {
                    this.f199765p.setText(this.f199754C.f199322s);
                    this.f199765p.setVisibility(0);
                }
                if (!Util.isNullOrNil(this.f199754C.f199318o)) {
                    C69242l1.m81616v(getContext(), this.f199766q, this.f199754C.f199318o);
                    this.f199766q.setVisibility(0);
                    this.f199765p.setVisibility(8);
                }
                this.f199768s.setOnClickListener(new C69358f());
                z = false;
            }
            if (C75592q0.m90789s().equals(this.f199772w) || (this.f199752A == 1 && z)) {
                if (this.f199752A == 1) {
                    this.f199767r.setText(C0966R.string.gfg);
                }
                View view = this.f199762j;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f199762j.setOnClickListener(new C69359g());
            } else {
                View view3 = this.f199762j;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            String stringExtra = getIntent().getStringExtra("key_receive_envelope_url");
            String stringExtra2 = getIntent().getStringExtra("key_receive_envelope_md5");
            String stringExtra3 = getIntent().getStringExtra("key_receive_envelope_widget_url");
            String stringExtra4 = getIntent().getStringExtra("key_receive_envelope_widget_md5");
            if (!Util.isNullOrNil(stringExtra)) {
                Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "has envelopeUrl");
                C77994sf2 sf22 = new C77994sf2();
                C77999tf2 tf22 = new C77999tf2();
                sf22.f228203g = tf22;
                tf22.f228245f = stringExtra;
                tf22.f228248i = stringExtra2;
                tf22.f228251o = stringExtra3;
                tf22.f228252p = stringExtra4;
                Class cls = C75672b.class;
                Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "render envelope");
                ((C75672b) C86312j.m106911c(cls)).ng0(this.f199755D, sf22, (C75672b.C75673a) null, 0, 0, 0);
                this.f199755D.setVisibility(0);
                if (this.f199757F == 2) {
                    this.f199756E.setVisibility(0);
                } else {
                    this.f199756E.setVisibility(8);
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f199761i.getLayoutParams();
                layoutParams2.topMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 88.0f);
                this.f199761i.setLayoutParams(layoutParams2);
                C69242l1.m81615u(this.f199766q);
                C69242l1.m81615u(this.f199765p);
                C69242l1.m81615u(this.f199764o);
                C77999tf2 tf23 = sf22.f228203g;
                if (tf23 != null) {
                    str = tf23.f228245f;
                }
                C75675d.m90931a(2, str);
                if (Util.isNullOrNil(sf22.f228203g.f228251o) || Util.isNullOrNil(sf22.f228203g.f228252p)) {
                    this.f199758G.setVisibility(8);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f199769t.getLayoutParams();
                    if (marginLayoutParams != null) {
                        marginLayoutParams.topMargin = C76577a.m92151b(getContext(), 24);
                        this.f199769t.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    this.f199758G.post(new C69675r(this));
                    ((C75672b) C86312j.m106911c(cls)).P30(this.f199758G, sf22, (C75672b.C75673a) null, 0, 0);
                    this.f199758G.setVisibility(0);
                    C69242l1.m81612r(this.f199758G);
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f199769t.getLayoutParams();
                    if (marginLayoutParams2 != null) {
                        marginLayoutParams2.topMargin = 0;
                        this.f199769t.setLayoutParams(marginLayoutParams2);
                    }
                }
            } else {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.f199761i.getLayoutParams();
                layoutParams3.topMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 118.0f);
                this.f199761i.setLayoutParams(layoutParams3);
            }
            if (C85875k4.m106211z()) {
                this.f199760h.setBackgroundResource(C0966R.color.BW_0_Alpha_0_8);
                C85875k4.m106187i0(this, getResources().getColor(C0966R.color.BW_0_Alpha_0_8));
            } else {
                this.f199760h.setBackgroundResource(C0966R.color.f356950a32);
                C85875k4.m106187i0(this, getResources().getColor(C0966R.color.f356950a32));
            }
            View contentView = getContentView();
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(0);
            View view5 = contentView;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view6 = this.f199759g;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "doReceiveHB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C69242l1.m81612r(this.f199759g);
        }
    }

    /* renamed from: K7 */
    public final void mo95548K7(int i, String str) {
        Log.m105925i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "finishByResult resultCode: %d  errMsg:%s", Integer.valueOf(i), str);
        Intent intent = new Intent();
        intent.putExtra("key_result_errmsg", str);
        setResult(i, intent);
        finish();
    }

    /* renamed from: L7 */
    public final void mo95549L7() {
        Button button = this.f199768s;
        if (button != null) {
            C118418g.INSTANCE.mo175815dy(button.getId());
            String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
            if (loadApplicationLanguage == null || loadApplicationLanguage.length() <= 0 || (!loadApplicationLanguage.equals("zh_CN") && !loadApplicationLanguage.equals("zh_TW") && !loadApplicationLanguage.equals("zh_HK"))) {
                this.f199768s.setBackgroundResource(C0966R.C0969drawable.aef);
                this.f199768s.setText(C0966R.string.f360994gi2);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_b;
    }

    public void initView() {
        this.f199759g = findViewById(C0966R.C0970id.gii);
        this.f199760h = (ViewGroup) findViewById(C0966R.C0970id.gif);
        this.f199761i = (LinearLayout) findViewById(C0966R.C0970id.f358699gj3);
        this.f199763n = (ImageView) findViewById(C0966R.C0970id.gig);
        this.f199764o = (TextView) findViewById(C0966R.C0970id.gih);
        this.f199765p = (TextView) findViewById(C0966R.C0970id.gij);
        this.f199766q = (TextView) findViewById(C0966R.C0970id.gim);
        this.f199767r = (TextView) findViewById(C0966R.C0970id.gin);
        this.f199762j = findViewById(C0966R.C0970id.gio);
        this.f199768s = (Button) findViewById(C0966R.C0970id.giq);
        this.f199770u = (ImageView) findViewById(C0966R.C0970id.gir);
        WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.gip);
        this.f199769t = weImageView;
        weImageView.setEnableColorFilter(false);
        this.f199769t.setImageResource(C0966R.C0969drawable.adn);
        this.f199769t.setOnClickListener(new C69353a());
        this.f199755D = (ImageView) findViewById(C0966R.C0970id.gi_);
        this.f199756E = (TextView) findViewById(C0966R.C0970id.gis);
        this.f199758G = (ImageView) findViewById(C0966R.C0970id.gib);
        this.f199765p.setLines(2);
        C103733h.m138106c(this.f199765p, 1);
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        this.f199661e = false;
        overridePendingTransition(0, 0);
        setTheme(C0966R.style.f8648pu);
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.ahf));
        this.f199771v = getIntent().getStringExtra("key_native_url");
        this.f199775z = getIntent().getLongExtra("key_msgid", 0);
        this.f199774y = getIntent().getIntExtra("key_way", 5);
        this.f199753B = getIntent().getIntExtra("key_static_from_scene", 0);
        this.f199772w = getIntent().getStringExtra("key_username");
        this.f199773x = getIntent().getStringExtra("key_sendid");
        this.f199752A = getIntent().getIntExtra("key_type", 0);
        this.f199757F = getIntent().getIntExtra("key_material_flag", 0);
        Log.m105925i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "mSendId：%s, nativeurl：%s  mWay：%s mSenderName：%s", this.f199773x, this.f199771v, Integer.valueOf(this.f199774y), this.f199772w);
        String stringExtra = getIntent().getStringExtra("key_lucky_money_busi_receive_resp");
        if (Util.isNullOrNil(stringExtra)) {
            Log.m105920e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "respStr is null");
            mo95548K7(0, "");
        } else {
            try {
                this.f199754C = C69232i1.m81579c(new JSONObject(stringExtra));
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "parse failed :%s", e.toString());
                mo95548K7(0, "");
            }
            C69261r1 r1Var = this.f199754C;
            r1Var.f199314h = this.f199771v;
            r1Var.f199316j = this.f199774y;
            r1Var.f199315i = this.f199773x;
        }
        initView();
        mo95547J7();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        if (intent != null && intent.hasExtra("key_is_realname_verify_process")) {
            if (intent.getIntExtra("realname_verify_process_ret", 0) == -1) {
                Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "new intent from realname verify process：succ");
                mo95547J7();
                return;
            }
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "new intent from realname verify process：cancel");
            mo95548K7(-1, "");
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i2;
        C117747y yVar2 = yVar;
        Class<LuckyMoneyBeforeDetailUI> cls = LuckyMoneyBeforeDetailUI.class;
        Log.m105925i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "onsceneend, errtype: %s, errcode: %s, errMsg: %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        if (yVar2 instanceof C69261r1) {
            Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do receive hb resp");
        } else {
            String str2 = "";
            if (yVar2 instanceof C69259q1) {
                Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do open hb resp");
                this.f199768s.setVisibility(0);
                C69242l1.m81618x(this.f199770u);
                this.f199768s.setClickable(true);
                mo95549L7();
                if (i == 0 && i3 == 0) {
                    C115591q5.m162472a(getContext(), C0966R.string.gek);
                    C69259q1 q1Var = (C69259q1) yVar2;
                    C67186g0 g0Var = new C67186g0();
                    g0Var.field_mNativeUrl = this.f199771v;
                    C69158a0 a0Var = q1Var.f199307t;
                    g0Var.field_hbType = a0Var.f198964d;
                    String str3 = "key_from_username";
                    String str4 = "key_username";
                    g0Var.field_receiveAmount = a0Var.f198974q;
                    g0Var.field_receiveTime = System.currentTimeMillis();
                    C69158a0 a0Var2 = q1Var.f199307t;
                    g0Var.field_hbStatus = a0Var2.f198965e;
                    g0Var.field_receiveStatus = a0Var2.f198939A;
                    if (g0Var.field_receiveAmount > 0) {
                        ((C79173v) C86312j.m106911c(C79173v.class)).mo109172tc().replace(g0Var);
                    }
                    if (C72506r.m84838d(q1Var.f199309v)) {
                        Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "should intercept");
                        setContentViewVisibility(8);
                        new C72506r(this).mo99912b(q1Var.f199309v, new C69354b());
                        return true;
                    } else if (q1Var.f199300j == 2) {
                        Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go luckymoney detail - open");
                        Intent intent = getIntent();
                        if (intent == null) {
                            intent = new Intent();
                        }
                        intent.setClass(getContext(), cls);
                        intent.putExtra("key_lucky_money_can_received", true);
                        C75674c.m90930b(this.f199773x, q1Var.f199307t);
                        intent.putExtra("key_jump_from", 2);
                        intent.putExtra("key_native_url", this.f199771v);
                        intent.putExtra("key_sendid", q1Var.f199298h);
                        intent.putExtra("key_static_from_scene", this.f199753B);
                        intent.putExtra("key_hb_kind", 2);
                        if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("PlayCoinSound", 0) > 0) {
                            intent.putExtra("play_sound", true);
                        }
                        RealnameGuideHelper realnameGuideHelper = q1Var.f199308u;
                        if (realnameGuideHelper != null) {
                            intent.putExtra("key_realname_guide_helper", realnameGuideHelper);
                        }
                        intent.putExtra(str4, this.f199772w);
                        String str5 = str3;
                        intent.putExtra(str5, getIntent().getStringExtra(str5));
                        intent.putExtra("key_msgid", this.f199775z);
                        C115669n.INSTANCE.mo160131h(11701, 12, null, null, null, 1);
                        C9556a aVar = new C9556a();
                        aVar.mo10233c(intent);
                        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mo95548K7(-1, str2);
                        return true;
                    } else {
                        this.f199768s.setBackgroundResource(C0966R.C0969drawable.c88);
                        this.f199768s.setText(C0966R.string.ghz);
                        this.f199768s.setOnClickListener((View.OnClickListener) null);
                        this.f199768s.setVisibility(8);
                        this.f199770u.setVisibility(8);
                        if (!Util.isNullOrNil(q1Var.f199307t.f198950L)) {
                            this.f199765p.setText(q1Var.f199307t.f198950L);
                            this.f199765p.setVisibility(0);
                        } else {
                            this.f199765p.setVisibility(8);
                        }
                        this.f199766q.setText(q1Var.f199307t.f198966f);
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f199762j.getLayoutParams();
                        layoutParams.bottomMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(getContext(), 30.0f);
                        this.f199762j.setLayoutParams(layoutParams);
                        if (C75592q0.m90789s().equals(this.f199772w) || this.f199752A == 1) {
                            View view = this.f199762j;
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar2.mo10233c((Object) null);
                            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            this.f199762j.setOnClickListener(new C69355c(q1Var));
                            return true;
                        }
                        View view2 = this.f199762j;
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar3.mo10233c(8);
                        View view3 = view2;
                        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return true;
                    }
                } else if (i3 == 416) {
                    Log.m105920e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go to real name");
                    Bundle bundle = new Bundle();
                    bundle.putString("realname_verify_process_jump_activity", ".pay.ui.WalletPayUPayUI");
                    bundle.putString("realname_verify_process_jump_plugin", "wallet_payu");
                    this.f199768s.setBackgroundResource(C0966R.C0969drawable.c27);
                    return C69242l1.m81596b(this, i2, str, yVar, bundle, false, new C69356d(this), new C69357e(this), 1005);
                } else {
                    Log.m105921e("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do open hb fail", Integer.valueOf(i), Integer.valueOf(i2));
                    C76879j.m92726T(this, !Util.isNullOrNil(str) ? str : f199751H);
                    mo95548K7(2, !Util.isNullOrNil(str) ? str : f199751H);
                    return true;
                }
            } else {
                String str6 = "key_from_username";
                String str7 = "key_username";
                String str8 = str2;
                if (yVar2 instanceof C69267u1) {
                    Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "do detail hb resp");
                    if (i == 0 && i3 == 0) {
                        Log.m105924i("MicroMsg.LuckyMoneyBusiReceiveUIV2", "go luckymoney detail - detail");
                        C69267u1 u1Var = (C69267u1) yVar2;
                        C75674c.m90930b(this.f199773x, u1Var.f199337h);
                        Intent intent2 = getIntent();
                        if (intent2 == null) {
                            intent2 = new Intent();
                        }
                        intent2.setClass(getContext(), cls);
                        intent2.putExtra("key_lucky_money_can_received", true);
                        intent2.putExtra("key_jump_from", 2);
                        intent2.putExtra("key_native_url", this.f199771v);
                        intent2.putExtra("key_sendid", this.f199773x);
                        intent2.putExtra("key_anim_slide", true);
                        intent2.putExtra(str7, this.f199772w);
                        String stringExtra = getIntent().getStringExtra(str6);
                        C69158a0 a0Var3 = u1Var.f199337h;
                        if (a0Var3 != null && !Util.isNullOrNil(a0Var3.f198954Q)) {
                            stringExtra = u1Var.f199337h.f198954Q;
                        }
                        intent2.putExtra(str6, stringExtra);
                        intent2.putExtra("key_way", this.f199774y);
                        intent2.putExtra("key_msgid", this.f199775z);
                        intent2.putExtra("key_static_from_scene", this.f199753B);
                        intent2.putExtra("key_hb_kind", 2);
                        C9556a aVar4 = new C9556a();
                        aVar4.mo10233c(intent2);
                        C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((Intent) aVar4.mo10231a(0));
                        C117292a.m165359e(this, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyBusiReceiveUIV2", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mo95548K7(-1, str8);
                        return true;
                    }
                    C76879j.m92726T(this, !Util.isNullOrNil(str) ? str : f199751H);
                    mo95548K7(2, !Util.isNullOrNil(str) ? str : f199751H);
                    return true;
                }
            }
        }
        if (i == 0 && i3 == 0) {
            return false;
        }
        C76879j.m92726T(this, !Util.isNullOrNil(str) ? str : f199751H);
        mo95548K7(2, !Util.isNullOrNil(str) ? str : f199751H);
        return false;
    }
}
