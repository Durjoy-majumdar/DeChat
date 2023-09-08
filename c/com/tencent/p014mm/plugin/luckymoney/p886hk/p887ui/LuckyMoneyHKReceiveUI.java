package com.tencent.p014mm.plugin.luckymoney.p886hk.p887ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.C103733h;
import b63.C67186g0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.view.BaseEmojiView;
import com.tencent.p014mm.plugin.luckymoney.model.C69158a0;
import com.tencent.p014mm.plugin.luckymoney.model.C69232i1;
import com.tencent.p014mm.plugin.luckymoney.model.C69236j1;
import com.tencent.p014mm.plugin.luckymoney.model.C69248m2;
import com.tencent.p014mm.plugin.luckymoney.model.LuckyMoneyEmojiSwitch;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyBaseUI;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import f32.C75674c;
import f40.C86709a0;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import p281yz.C79173v;
import qo3.C89779i0;
import tc2.C118418g;
import te3.C77914cq1;
import te3.C77936gq1;
import te3.C77944hq1;
import u32.C65211c;
import v32.C78329f;
import v32.C78330g;
import v32.C78333j;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI */
public class LuckyMoneyHKReceiveUI extends LuckyMoneyBaseUI {

    /* renamed from: B */
    public static final String f198909B = MMApplicationContext.getContext().getResources().getString(C0966R.string.l_3);

    /* renamed from: A */
    public C65211c f198910A;

    /* renamed from: g */
    public LinearLayout f198911g;

    /* renamed from: h */
    public ImageView f198912h;

    /* renamed from: i */
    public TextView f198913i;

    /* renamed from: j */
    public TextView f198914j;

    /* renamed from: n */
    public TextView f198915n;

    /* renamed from: o */
    public Button f198916o;

    /* renamed from: p */
    public ImageView f198917p;

    /* renamed from: q */
    public View f198918q;

    /* renamed from: r */
    public ImageView f198919r;

    /* renamed from: s */
    public TextView f198920s;

    /* renamed from: t */
    public View f198921t;

    /* renamed from: u */
    public C89779i0 f198922u = null;

    /* renamed from: v */
    public ViewGroup f198923v;

    /* renamed from: w */
    public String f198924w;

    /* renamed from: x */
    public String f198925x;

    /* renamed from: y */
    public int f198926y;

    /* renamed from: z */
    public long f198927z;

    /* renamed from: com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI$a */
    public class C69155a extends C7089c0 {
        public C69155a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            LuckyMoneyHKReceiveUI.this.finish();
        }
    }

    /* renamed from: J7 */
    public static void m81488J7(LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI, C77936gq1 gq12) {
        C69158a0 a0Var;
        LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI2 = luckyMoneyHKReceiveUI;
        C77936gq1 gq13 = gq12;
        luckyMoneyHKReceiveUI.getClass();
        Class cls = C75339i.class;
        if (gq13 == null) {
            a0Var = null;
        } else {
            C69158a0 a0Var2 = new C69158a0();
            a0Var2.f198964d = gq13.f227508o;
            a0Var2.f198965e = gq13.f227512s;
            a0Var2.f198966f = gq13.f227513t;
            a0Var2.f198968h = gq13.f227514u;
            a0Var2.f198971n = gq13.f227502f;
            a0Var2.f198974q = gq13.f227503g;
            a0Var2.f198958U = gq13.f227496M;
            a0Var2.f198975r = (long) gq13.f227504h;
            a0Var2.f198976s = gq13.f227505i;
            a0Var2.f198977t = gq13.f227506j;
            a0Var2.f198978u = gq13.f227507n;
            a0Var2.f198979v = gq13.f227515v;
            a0Var2.f198981x = gq13.f227509p;
            a0Var2.f198982y = gq13.f227510q;
            a0Var2.f198983z = gq13.f227516w;
            a0Var2.f198939A = gq13.f227511r;
            a0Var2.f198942D = gq13.f227519z;
            a0Var2.f198943E = gq13.f227484A;
            a0Var2.f198952N = gq13.f227486C;
            String str = gq13.f227485B;
            a0Var2.f198954Q = str;
            if (!Util.isNullOrNil(str)) {
                a0Var2.f198969i = ((C75339i) C86312j.m106911c(cls)).getDisplayName(a0Var2.f198954Q);
            }
            a0Var2.f198955R = gq13.f227490G;
            a0Var2.f198956S = gq13.f227491H;
            a0Var2.f198944F = new LinkedList<>();
            if (!gq13.f227517x.isEmpty()) {
                Iterator<C77944hq1> it = gq13.f227517x.iterator();
                while (it.hasNext()) {
                    C77944hq1 next = it.next();
                    C69248m2 m2Var = new C69248m2();
                    m2Var.f199273g = next.f227591f;
                    m2Var.f199276j = next.f227595j;
                    m2Var.f199270d = next.f227592g;
                    m2Var.f199275i = next.f227593h;
                    m2Var.f199271e = next.f227589d;
                    m2Var.f199274h = next.f227594i;
                    int i = next.f227590e;
                    if (i == 1) {
                        m2Var.f199272f = "Appid";
                    } else if (i == 2) {
                        m2Var.f199272f = "Text";
                    } else if (i == 3) {
                        m2Var.f199272f = "Pic";
                    } else if (i == 4) {
                        m2Var.f199272f = "Native";
                    }
                    a0Var2.f198944F.add(m2Var);
                }
            }
            if (gq13.f227499Q != null) {
                C69248m2 m2Var2 = new C69248m2();
                a0Var2.f198945G = m2Var2;
                C77944hq1 hq12 = gq13.f227499Q;
                m2Var2.f199273g = hq12.f227591f;
                m2Var2.f199276j = hq12.f227595j;
                m2Var2.f199270d = hq12.f227592g;
                m2Var2.f199275i = hq12.f227593h;
                m2Var2.f199271e = hq12.f227589d;
                m2Var2.f199274h = hq12.f227594i;
                int i2 = hq12.f227590e;
                if (i2 == 1) {
                    m2Var2.f199272f = "Appid";
                } else if (i2 == 2) {
                    m2Var2.f199272f = "Text";
                } else if (i2 == 3) {
                    m2Var2.f199272f = "Pic";
                } else if (i2 == 4) {
                    m2Var2.f199272f = "Native";
                }
            }
            a0Var2.f198960W = C69232i1.m81577a(gq13.f227498P);
            a0Var2.f198951M = new LinkedList<>();
            if (!gq13.f227518y.isEmpty()) {
                Iterator<C77914cq1> it4 = gq13.f227518y.iterator();
                while (it4.hasNext()) {
                    C77914cq1 next2 = it4.next();
                    C69236j1 j1Var = new C69236j1();
                    j1Var.f199218j = next2.f227144h;
                    j1Var.f199217i = next2.f227142f;
                    j1Var.f199214f = next2.f227140d;
                    j1Var.f199215g = next2.f227141e;
                    j1Var.f199219n = next2.f227145i;
                    j1Var.f199220o = next2.f227146j;
                    if (Util.isNullOrNil(j1Var.f199212d) && !Util.isNullOrNil(j1Var.f199219n)) {
                        j1Var.f199212d = ((C75339i) C86312j.m106911c(cls)).getDisplayName(j1Var.f199219n);
                    }
                    a0Var2.f198951M.add(j1Var);
                }
            }
            a0Var = a0Var2;
        }
        if (a0Var.f198939A == 2) {
            Intent intent = new Intent();
            intent.setClass(luckyMoneyHKReceiveUI.getContext(), LuckyMoneyHKBeforeDetailUI.class);
            intent.putExtra("key_lucky_money_can_received", true);
            try {
                C75674c.m90930b(luckyMoneyHKReceiveUI2.f198924w, a0Var);
                intent.putExtra("key_jump_from", 2);
            } catch (Exception e) {
                Log.m105928w("MicroMsg.LuckyMoneyHKReceiveUI", "luckyMoneyDetail.toByteArray() fail! " + e.getLocalizedMessage());
            }
            intent.putExtra("key_native_url", luckyMoneyHKReceiveUI2.f198925x);
            intent.putExtra("key_sendid", luckyMoneyHKReceiveUI2.f198924w);
            if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("PlayCoinSound", 0) > 0) {
                intent.putExtra("play_sound", true);
            }
            LuckyMoneyEmojiSwitch luckyMoneyEmojiSwitch = new LuckyMoneyEmojiSwitch();
            luckyMoneyEmojiSwitch.f198931f = gq13.f227493J;
            luckyMoneyEmojiSwitch.f198932g = gq13.f227494K;
            intent.putExtra("key_emoji_switch", luckyMoneyEmojiSwitch);
            intent.putExtra("key_username", luckyMoneyHKReceiveUI.getIntent().getStringExtra("key_username"));
            intent.putExtra("key_msgid", luckyMoneyHKReceiveUI2.f198927z);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI3 = luckyMoneyHKReceiveUI;
            C117292a.m165358d(luckyMoneyHKReceiveUI3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyHKReceiveUI2.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(luckyMoneyHKReceiveUI3, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            luckyMoneyHKReceiveUI.finish();
            C67186g0 g0Var = new C67186g0();
            g0Var.field_mNativeUrl = luckyMoneyHKReceiveUI2.f198925x;
            g0Var.field_hbType = a0Var.f198964d;
            g0Var.field_receiveAmount = a0Var.f198974q;
            g0Var.field_receiveTime = System.currentTimeMillis();
            g0Var.field_hbStatus = a0Var.f198965e;
            g0Var.field_receiveStatus = a0Var.f198939A;
            if (g0Var.field_receiveAmount > 0) {
                ((C79173v) C86312j.m106911c(C79173v.class)).mo109172tc().replace(g0Var);
                return;
            }
            return;
        }
        luckyMoneyHKReceiveUI2.f198916o.setBackgroundResource(C0966R.C0969drawable.c88);
        luckyMoneyHKReceiveUI2.f198916o.setText(C0966R.string.ghz);
        luckyMoneyHKReceiveUI2.f198916o.setOnClickListener((View.OnClickListener) null);
        luckyMoneyHKReceiveUI2.f198916o.setVisibility(8);
        luckyMoneyHKReceiveUI2.f198917p.setVisibility(8);
        if (!Util.isNullOrNil(a0Var.f198950L)) {
            luckyMoneyHKReceiveUI2.f198914j.setText(a0Var.f198950L);
            luckyMoneyHKReceiveUI2.f198914j.setVisibility(0);
        } else {
            luckyMoneyHKReceiveUI2.f198914j.setVisibility(8);
        }
        luckyMoneyHKReceiveUI2.f198915n.setText(a0Var.f198966f);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) luckyMoneyHKReceiveUI2.f198918q.getLayoutParams();
        layoutParams.bottomMargin = BackwardSupportUtil.BitmapFactory.fromDPToPix(luckyMoneyHKReceiveUI.getContext(), 30.0f);
        luckyMoneyHKReceiveUI2.f198918q.setLayoutParams(layoutParams);
        if (C75592q0.m90789s().equals((Object) null) || a0Var.f198964d == 1) {
            View view = luckyMoneyHKReceiveUI2.f198918q;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(0);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            luckyMoneyHKReceiveUI2.f198918q.setOnClickListener(new C78329f(luckyMoneyHKReceiveUI2, gq13));
            luckyMoneyHKReceiveUI2.f198919r.setVisibility(8);
            return;
        }
        View view3 = luckyMoneyHKReceiveUI2.f198918q;
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        View view4 = view3;
        C117292a.m165358d(view4, aVar3.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view4, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "openLuckyDetail", "(Lcom/tencent/mm/protocal/protobuf/ForeignHbOpenResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        luckyMoneyHKReceiveUI2.f198919r.setVisibility(0);
    }

    /* renamed from: K7 */
    public final void mo95303K7() {
        Button button = this.f198916o;
        if (button != null) {
            C118418g.INSTANCE.mo175815dy(button.getId());
            String loadApplicationLanguage = LocaleUtil.loadApplicationLanguage(MMApplicationContext.getContext().getSharedPreferences(MMApplicationContext.getDefaultPreferencePath(), 0), MMApplicationContext.getContext());
            if (loadApplicationLanguage == null || loadApplicationLanguage.length() <= 0 || (!loadApplicationLanguage.equals("zh_CN") && !loadApplicationLanguage.equals("zh_TW") && !loadApplicationLanguage.equals("zh_HK"))) {
                this.f198916o.setBackgroundResource(C0966R.C0969drawable.aef);
                this.f198916o.setText(C0966R.string.f360994gi2);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b_b;
    }

    public void initView() {
        this.f198921t = findViewById(C0966R.C0970id.gii);
        this.f198923v = (ViewGroup) findViewById(C0966R.C0970id.gif);
        this.f198911g = (LinearLayout) findViewById(C0966R.C0970id.f358699gj3);
        this.f198912h = (ImageView) findViewById(C0966R.C0970id.gig);
        this.f198913i = (TextView) findViewById(C0966R.C0970id.gih);
        this.f198914j = (TextView) findViewById(C0966R.C0970id.gij);
        this.f198915n = (TextView) findViewById(C0966R.C0970id.gim);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.gea);
        BaseEmojiView baseEmojiView = (BaseEmojiView) findViewById(C0966R.C0970id.ge7);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f358698gj2);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.gfs);
        ProgressBar progressBar = (ProgressBar) findViewById(C0966R.C0970id.f357919cg0);
        this.f198916o = (Button) findViewById(C0966R.C0970id.giq);
        this.f198917p = (ImageView) findViewById(C0966R.C0970id.gir);
        this.f198920s = (TextView) findViewById(C0966R.C0970id.gin);
        this.f198918q = findViewById(C0966R.C0970id.gio);
        this.f198919r = (ImageView) findViewById(C0966R.C0970id.gbu);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.gi_);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.gis);
        ((ImageView) findViewById(C0966R.C0970id.gip)).setOnClickListener(new C69155a());
        this.f198914j.setLines(2);
        C103733h.m138106c(this.f198914j, 1);
        C76577a.m92155f(getContext(), C0966R.dimen.aed);
        C76577a.m92157h(getContext(), C0966R.dimen.aed);
        View contentView = getContentView();
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view = contentView;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo95303K7();
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        this.f199661e = false;
        super.onCreate(bundle);
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(getResources().getColor(C0966R.color.ahf));
        this.f198925x = getIntent().getStringExtra("key_native_url");
        this.f198927z = getIntent().getLongExtra("key_msgid", 0);
        this.f198926y = getIntent().getIntExtra("key_way", 0);
        try {
            this.f198924w = Uri.parse(Util.nullAsNil(this.f198925x)).getQueryParameter("sendid");
        } catch (Exception unused) {
            finish();
        }
        initView();
        Log.m105925i("MicroMsg.LuckyMoneyHKReceiveUI", "do receive hb: %s, %s", this.f198925x, this.f198924w);
        C65211c cVar = this.f198910A;
        if (cVar != null) {
            cVar.mo85581g();
        }
        C89779i0 i0Var = this.f198922u;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f198922u = C76879j.m92721O(getContext(), (String) null, 3, C0966R.style.f8510l3, getString(C0966R.string.gas), true, true, new C78330g(this));
        C65211c cVar2 = new C65211c(this.f198925x, this.f198924w, 1, this.f198926y);
        this.f198910A = cVar2;
        cVar2.mo9225i().mo123062e(new C78333j(this)).mo11397F(this);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
