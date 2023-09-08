package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.compatible.util.Exif;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.plugin.wallet_core.utils.WcPayTextApppearanceSpan;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import de3.C45335p;
import de3.C75355a0;
import di3.C86312j;
import eb0.C75592q0;
import j20.C117292a;
import java.io.IOException;
import java.util.HashSet;
import k20.C9556a;
import ob0.C117747y;
import p196ln.C76705f;
import p629ny.C76978g;
import p629ny.C76979h;
import q02.C47741e;
import q02.C47749m;
import t02.C48527c;
import te3.C50399mg2;
import te3.C51105rg2;
import te3.C51409tk3;
import wd3.C53155r0;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI */
public class HoneyPayReceiveCardUI extends HoneyPayBaseUI {

    /* renamed from: E */
    public static final /* synthetic */ int f114895E = 0;

    /* renamed from: A */
    public String f114896A = "";

    /* renamed from: B */
    public boolean f114897B = false;

    /* renamed from: C */
    public int f114898C;

    /* renamed from: D */
    public C45335p f114899D = new C42450b(this);

    /* renamed from: f */
    public ImageView f114900f;

    /* renamed from: g */
    public TextView f114901g;

    /* renamed from: h */
    public TextView f114902h;

    /* renamed from: i */
    public TextView f114903i;

    /* renamed from: j */
    public Button f114904j;

    /* renamed from: n */
    public TextView f114905n;

    /* renamed from: o */
    public TextView f114906o;

    /* renamed from: p */
    public TextView f114907p;

    /* renamed from: q */
    public TextView f114908q;

    /* renamed from: r */
    public TextView f114909r;

    /* renamed from: s */
    public TextView f114910s;

    /* renamed from: t */
    public LinearLayout f114911t;

    /* renamed from: u */
    public CheckBox f114912u;

    /* renamed from: v */
    public TextView f114913v;

    /* renamed from: w */
    public ImageView f114914w;

    /* renamed from: x */
    public CdnImageView f114915x;

    /* renamed from: y */
    public WcPayBannerView f114916y;

    /* renamed from: z */
    public String f114917z;

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI$g */
    public static class C4603g extends MMBaseAccessibilityConfig {
        public C4603g(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            root(C0966R.C0971layout.azr).view(C0966R.C0970id.f0i).desc((int) C0966R.C0970id.f0i).type(ViewType.Button);
            focusFirst(C0966R.C0970id.f0k);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI$a */
    public class C42449a implements C7092q.C7093a {

        /* renamed from: a */
        public final /* synthetic */ C51409tk3 f114918a;

        public C42449a(C51409tk3 tk32) {
            this.f114918a = tk32;
        }

        public void onClick(View view) {
            C75228t.m90219L(HoneyPayReceiveCardUI.this, this.f114918a.f142266o.f138023f, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI$b */
    public class C42450b implements C45335p {
        public C42450b(HoneyPayReceiveCardUI honeyPayReceiveCardUI) {
        }

        /* renamed from: a */
        public Object mo22792a(C53155r0 r0Var) {
            return null;
        }

        /* renamed from: b */
        public Object mo22793b(C53155r0 r0Var) {
            Object obj;
            if (r0Var.f148313d != 1 || (obj = r0Var.f148314e) == null || !(obj instanceof Bundle) || !((Bundle) obj).getBoolean("click_help", false)) {
                return null;
            }
            C115669n.INSTANCE.mo160131h(15191, 0, 1, 0, 0, 0, 0);
            return null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI$c */
    public class C42451c extends C7089c0 {
        public C42451c() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            if (HoneyPayReceiveCardUI.this.f114911t.getVisibility() != 0) {
                HoneyPayReceiveCardUI honeyPayReceiveCardUI = HoneyPayReceiveCardUI.this;
                Log.m105924i(honeyPayReceiveCardUI.f114712d, "do get honey pay card");
                C47741e eVar = new C47741e(honeyPayReceiveCardUI.f114917z);
                eVar.mo104821m1(honeyPayReceiveCardUI);
                honeyPayReceiveCardUI.doSceneProgress(eVar, true);
            } else if (HoneyPayReceiveCardUI.this.f114912u.isChecked()) {
                HoneyPayReceiveCardUI honeyPayReceiveCardUI2 = HoneyPayReceiveCardUI.this;
                Log.m105924i(honeyPayReceiveCardUI2.f114712d, "do get honey pay card");
                C47741e eVar2 = new C47741e(honeyPayReceiveCardUI2.f114917z);
                eVar2.mo104821m1(honeyPayReceiveCardUI2);
                honeyPayReceiveCardUI2.doSceneProgress(eVar2, true);
            } else {
                int dimensionPixelOffset = HoneyPayReceiveCardUI.this.getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
                float f = (float) (-dimensionPixelOffset);
                ObjectAnimator duration = ObjectAnimator.ofFloat(HoneyPayReceiveCardUI.this.f114911t, "translationX", new float[]{0.0f, f, (float) dimensionPixelOffset, f, 0.0f}).setDuration(300);
                duration.setInterpolator(new LinearInterpolator());
                duration.start();
                HoneyPayReceiveCardUI honeyPayReceiveCardUI3 = HoneyPayReceiveCardUI.this;
                honeyPayReceiveCardUI3.f114904j.announceForAccessibility(honeyPayReceiveCardUI3.getString(C0966R.string.fk9, new Object[]{honeyPayReceiveCardUI3.f114896A}));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI$d */
    public class C42452d implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47741e f114921a;

        public C42452d(C47741e eVar) {
            this.f114921a = eVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            if (this.f114921a.f128256r.f142547f != null) {
                Log.m105924i(HoneyPayReceiveCardUI.this.f114712d, "do real name");
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayReceiveCardUI");
                C48527c.m53913i(HoneyPayReceiveCardUI.this, bundle, this.f114921a.f128256r.f142547f, false);
            }
            C115669n.INSTANCE.mo175913w(875, 5, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI$e */
    public class C42453e implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47741e f114923a;

        public C42453e(C47741e eVar) {
            this.f114923a = eVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            if (this.f114923a.f128256r.f142547f != null) {
                Log.m105924i(HoneyPayReceiveCardUI.this.f114712d, "do real name");
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayReceiveCardUI");
                C48527c.m53913i(HoneyPayReceiveCardUI.this, bundle, this.f114923a.f128256r.f142547f, false);
            } else {
                HoneyPayReceiveCardUI honeyPayReceiveCardUI = HoneyPayReceiveCardUI.this;
                int i3 = HoneyPayReceiveCardUI.f114895E;
                Log.m105924i(honeyPayReceiveCardUI.f114712d, "go to honey pay card detail");
                Intent intent = new Intent(honeyPayReceiveCardUI, HoneyPayCardDetailUI.class);
                intent.putExtra("key_scene", 0);
                intent.putExtra("key_card_no", honeyPayReceiveCardUI.f114917z);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                HoneyPayReceiveCardUI honeyPayReceiveCardUI2 = honeyPayReceiveCardUI;
                C117292a.m165358d(honeyPayReceiveCardUI2, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayReceiveCardUI", "gotoHoneyPayCardDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                honeyPayReceiveCardUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(honeyPayReceiveCardUI2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayReceiveCardUI", "gotoHoneyPayCardDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                C48527c.m53909e(1, HoneyPayReceiveCardUI.this.f114917z);
                HoneyPayReceiveCardUI.this.finish();
            }
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(875, 4, 1);
            HoneyPayReceiveCardUI honeyPayReceiveCardUI3 = HoneyPayReceiveCardUI.this;
            if (honeyPayReceiveCardUI3.f114897B) {
                honeyPayReceiveCardUI3.f114897B = false;
                nVar.mo160131h(24522, 2, 2);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI$f */
    public class C42454f implements C72476y0.C72477a {

        /* renamed from: a */
        public final /* synthetic */ C51409tk3 f114925a;

        public C42454f(C51409tk3 tk32) {
            this.f114925a = tk32;
        }

        /* renamed from: a */
        public void mo66525a(View view) {
            if (!Util.isNullOrNil(this.f114925a.f142262h)) {
                C75228t.m90219L(HoneyPayReceiveCardUI.this.getContext(), this.f114925a.f142262h, false);
            }
            C115669n.INSTANCE.mo160131h(15191, 0, 1, 0, 0, 0, 0);
        }
    }

    /* renamed from: I7 */
    public final void mo66538I7(C51409tk3 tk32) {
        mo66539J7(tk32);
        C51105rg2 rg22 = tk32.f142260f;
        if (rg22 != null) {
            setMMTitle(rg22.f140903p);
        }
        this.f114916y.setBannerData(tk32.f142264j);
        this.f114916y.setBgColor(getResources().getColor(C0966R.color.f2960ag));
        this.f114916y.setTextColor(getResources().getColor(C0966R.color.f2975b6));
    }

    /* renamed from: J7 */
    public final void mo66539J7(C51409tk3 tk32) {
        Class cls = C76979h.class;
        C51105rg2 rg22 = tk32.f142260f;
        if (rg22 != null) {
            this.f114905n.setText(rg22.f140907t);
            this.f114907p.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), rg22.f140904q, this.f114907p.getTextSize()));
            this.f114907p.setText(((C76979h) C86312j.m106911c(cls)).yp0(getContext(), rg22.f140904q, this.f114907p.getTextSize()));
            SpannableString spannableString = new SpannableString(getString(C0966R.string.fky) + " " + C75228t.m90256l((double) (rg22.f140896f / 100)));
            WcPayTextApppearanceSpan wcPayTextApppearanceSpan = new WcPayTextApppearanceSpan((String) null, 0, -1, (ColorStateList) null, (ColorStateList) null);
            wcPayTextApppearanceSpan.f210885d = C75228t.m90274w(this, 4);
            spannableString.setSpan(wcPayTextApppearanceSpan, getString(C0966R.string.fky).length(), spannableString.length(), 18);
            this.f114908q.setText(spannableString);
            Bundle bundle = new Bundle();
            bundle.putBoolean("click_help", true);
            this.f114909r.setText(((C76979h) C86312j.m106911c(cls)).mo107051Lq(getContext(), rg22.f140906s, (int) this.f114909r.getTextSize(), 1, bundle));
            this.f114909r.setClickable(true);
            this.f114909r.setOnTouchListener(new C75355a0(this));
            if (!Util.isNullOrNil(tk32.f142261g)) {
                C72476y0 y0Var = new C72476y0(7, new C42454f(tk32), true);
                SpannableString spannableString2 = new SpannableString(tk32.f142261g);
                spannableString2.setSpan(y0Var, 0, spannableString2.length(), 18);
                C75228t.m90240d(this.f114903i);
                this.f114903i.setText(spannableString2);
                this.f114903i.setOnTouchListener(new C75355a0(this));
                this.f114903i.setClickable(true);
            } else {
                Log.m105918d(this.f114712d, "no help url");
                this.f114903i.setVisibility(8);
            }
            this.f114902h.setText(((C76979h) C86312j.m106911c(cls)).yp0(this.f114902h.getContext(), getString(C0966R.string.fla, new Object[]{C75228t.m90246g(rg22.f140895e, 10), rg22.f140903p}), this.f114902h.getTextSize()));
            ((C76705f) C86312j.m106911c(C76705f.class)).D20(this.f114900f, rg22.f140895e, 0.06f);
            C75228t.m90249h0(this.f114901g, rg22.f140895e, 10);
            C75228t.m90249h0(this.f114910s, rg22.f140895e, 10);
            int i = rg22.f140908u;
            if (i == 1) {
                this.f114906o.setText(C0966R.string.fkb);
            } else if (i == 2) {
                this.f114906o.setText(C0966R.string.fkz);
            } else {
                this.f114906o.setText(((C76979h) C86312j.m106911c(cls)).yp0(this, C75228t.m90277z(C75592q0.m90783m(), 16), this.f114906o.getTextSize()));
            }
            if (!Util.isNullOrNil(rg22.f140905r)) {
                this.f114915x.mo100288c(rg22.f140905r, 0, 0, C48527c.m53908d(rg22.f140908u));
            } else {
                this.f114915x.setImageResource(C48527c.m53908d(rg22.f140908u));
            }
            if (tk32.f142265n) {
                this.f114897B = true;
                C115669n.INSTANCE.mo160131h(24522, 2, 1);
                this.f114911t.setVisibility(0);
                String str = this.f114712d;
                C50399mg2 mg22 = tk32.f142266o;
                Log.m105919d(str, "text:%s desc:%s url:%s", mg22.f138021d, mg22.f138022e, mg22.f138023f);
                if (!Util.isNullOrNil(tk32.f142266o.f138021d)) {
                    C50399mg2 mg23 = tk32.f142266o;
                    this.f114896A = mg23.f138022e;
                    StringBuilder sb = new StringBuilder(mg23.f138021d);
                    int length = sb.length();
                    sb.append(tk32.f142266o.f138022e);
                    this.f114913v.setText(sb.toString());
                    if (!Util.isNullOrNil(tk32.f142266o.f138022e)) {
                        C75228t.m90253j0(this.f114913v, sb.toString(), length, sb.length(), new C7092q((C7092q.C7093a) new C42449a(tk32), true), this);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f114897B = false;
            this.f114911t.setVisibility(8);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.azr;
    }

    public void initView() {
        this.f114900f = (ImageView) findViewById(C0966R.C0970id.f09);
        this.f114901g = (TextView) findViewById(C0966R.C0970id.f0d);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f0l);
        this.f114906o = textView;
        C75228t.m90240d(textView);
        this.f114902h = (TextView) findViewById(C0966R.C0970id.f0e);
        this.f114910s = (TextView) findViewById(C0966R.C0970id.f0h);
        this.f114903i = (TextView) findViewById(C0966R.C0970id.f0_);
        Button button = (Button) findViewById(C0966R.C0970id.f0i);
        this.f114904j = button;
        C85875k4.m106189j0(button.getPaint(), 0.8f);
        this.f114905n = (TextView) findViewById(C0966R.C0970id.f0j);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.f0f);
        this.f114907p = (TextView) findViewById(C0966R.C0970id.f0m);
        this.f114908q = (TextView) findViewById(C0966R.C0970id.f0b);
        this.f114909r = (TextView) findViewById(C0966R.C0970id.f0a);
        this.f114915x = (CdnImageView) findViewById(C0966R.C0970id.f0g);
        this.f114916y = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f114911t = (LinearLayout) findViewById(C0966R.C0970id.f07);
        this.f114912u = (CheckBox) findViewById(C0966R.C0970id.f06);
        this.f114913v = (TextView) findViewById(C0966R.C0970id.f08);
        this.f114914w = (ImageView) findViewById(C0966R.C0970id.f0c);
        this.f114904j.setOnClickListener(new C42451c());
        if (C85875k4.m106211z()) {
            this.f114914w.setImageResource(C0966R.raw.honey_pay_bank_logo_dm);
            this.f114904j.setTextColor(getResources().getColor(C0966R.color.BW_100_Alpha_0_8));
            this.f114912u.setBackgroundResource(C0966R.C0969drawable.a99);
            return;
        }
        this.f114914w.setImageResource(C0966R.raw.honey_pay_bank_logo);
        this.f114904j.setTextColor(getResources().getColor(C0966R.color.f2960ag));
        this.f114912u.setBackgroundResource(C0966R.C0969drawable.a98);
    }

    public void onCreate(Bundle bundle) {
        this.f114713e = C0966R.color.al6;
        super.onCreate(bundle);
        ((C76978g) C86312j.m106911c(C76978g.class)).k30(this.f114899D);
        addSceneEndListener(2613);
        addSceneEndListener(Exif.PARSE_EXIF_ERROR_NO_EXIF);
        this.f114917z = getIntent().getStringExtra("key_card_no");
        this.f114898C = getIntent().getIntExtra("key_scene", 0);
        initView();
        if (this.f114898C == 1) {
            C51409tk3 tk32 = new C51409tk3();
            try {
                tk32.parseFrom(getIntent().getByteArrayExtra("key_qry_response"));
                mo66538I7(tk32);
            } catch (IOException e) {
                Log.printErrStackTrace(this.f114712d, e, "", new Object[0]);
                Log.m105924i(this.f114712d, "qry user detail");
                C47749m mVar = new C47749m(this.f114917z);
                mVar.mo104821m1(this);
                doSceneProgress(mVar, true);
            }
        } else {
            Log.m105924i(this.f114712d, "qry user detail");
            C47749m mVar2 = new C47749m(this.f114917z);
            mVar2.mo104821m1(this);
            doSceneProgress(mVar2, true);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ((C76978g) C86312j.m106911c(C76978g.class)).bj0(this.f114899D);
        removeSceneEndListener(2613);
        removeSceneEndListener(Exif.PARSE_EXIF_ERROR_NO_EXIF);
        if (this.f114897B) {
            C115669n.INSTANCE.mo160131h(24522, 2, 3);
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C47749m) {
            C47749m mVar = (C47749m) yVar;
            if (mVar.f221039i || mVar.f221040j) {
                return true;
            }
            mo66539J7(mVar.f128266r);
            return true;
        } else if (!(yVar instanceof C47741e)) {
            return true;
        } else {
            C47741e eVar = (C47741e) yVar;
            eVar.mo104823q1(new C42453e(eVar));
            eVar.mo104820l1(new C42452d(eVar));
            if (!eVar.f221039i) {
                return true;
            }
            C115669n.INSTANCE.mo175913w(875, 5, 1);
            return true;
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C4603g.class);
    }
}
