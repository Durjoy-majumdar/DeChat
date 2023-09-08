package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import de3.C75355a0;
import di3.C86312j;
import j20.C117292a;
import java.io.IOException;
import k20.C60958c;
import k20.C9556a;
import ob0.C117747y;
import p629ny.C76979h;
import q02.C47749m;
import t02.C48527c;
import te3.C51105rg2;
import te3.C51409tk3;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardDetailUI */
public class HoneyPayCardDetailUI extends HoneyPayBaseUI {

    /* renamed from: f */
    public ImageView f114725f;

    /* renamed from: g */
    public TextView f114726g;

    /* renamed from: h */
    public TextView f114727h;

    /* renamed from: i */
    public TextView f114728i;

    /* renamed from: j */
    public TextView f114729j;

    /* renamed from: n */
    public TextView f114730n;

    /* renamed from: o */
    public TextView f114731o;

    /* renamed from: p */
    public WcPayBannerView f114732p;

    /* renamed from: q */
    public C51409tk3 f114733q;

    /* renamed from: r */
    public int f114734r;

    /* renamed from: s */
    public String f114735s;

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardDetailUI$a */
    public class C42412a implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47749m f114736a;

        public C42412a(C47749m mVar) {
            this.f114736a = mVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            HoneyPayCardDetailUI honeyPayCardDetailUI = HoneyPayCardDetailUI.this;
            honeyPayCardDetailUI.f114733q = this.f114736a.f128266r;
            honeyPayCardDetailUI.mo66497I7();
        }
    }

    /* renamed from: I7 */
    public final void mo66497I7() {
        Class cls = C76979h.class;
        C51105rg2 rg22 = this.f114733q.f142260f;
        if (rg22 != null) {
            setMMTitle(rg22.f140903p);
            this.f114726g.setText(rg22.f140902o);
            int i = rg22.f140897g;
            if (i == 2) {
                this.f114725f.setImageResource(C0966R.raw.icons_outlined_done2);
                this.f114725f.setColorFilter(getContext().getResources().getColor(C0966R.color.f2939n), PorterDuff.Mode.SRC_ATOP);
                if (!Util.isNullOrNil(rg22.f140907t)) {
                    rg22.f140907t = C48527c.m53914j(rg22.f140907t, this.f114733q.f142260f.f140895e, -1);
                    this.f114727h.setText(((C76979h) C86312j.m106911c(cls)).mo107051Lq(this, rg22.f140907t, (int) this.f114727h.getTextSize(), 1, (Object) null));
                }
                View findViewById = findViewById(C0966R.C0970id.exr);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view = findViewById;
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = findViewById(C0966R.C0970id.exs);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById3 = findViewById(C0966R.C0970id.exz);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view3 = findViewById3;
                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i == 3) {
                this.f114725f.setImageResource(C0966R.raw.remittance_timed_out);
                if (!Util.isNullOrNil(rg22.f140907t)) {
                    this.f114727h.setText(rg22.f140907t);
                }
                this.f114728i.setText(C0966R.string.fl4);
                this.f114729j.setText(C0966R.string.fl6);
                this.f114730n.setText(C48527c.m53906b((long) this.f114733q.f142260f.f140898h));
                this.f114731o.setText(C48527c.m53906b((long) this.f114733q.f142260f.f140899i));
            } else if (i == 4) {
                this.f114725f.setImageResource(C0966R.raw.remittance_timed_out);
                int i2 = this.f114733q.f142260f.f140901n;
                if (!Util.isNullOrNil(rg22.f140907t)) {
                    this.f114727h.setText(((C76979h) C86312j.m106911c(cls)).mo107050Jo(this, rg22.f140907t, (int) this.f114727h.getTextSize(), 1, (Object) null));
                }
                this.f114728i.setText(C0966R.string.fl5);
                this.f114730n.setText(C48527c.m53906b((long) this.f114733q.f142260f.f140900j));
                View findViewById4 = findViewById(C0966R.C0970id.exz);
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = findViewById4;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCardDetailUI", "onSceneSuccEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f114732p.setBannerData(this.f114733q.f142264j);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.azd;
    }

    public void initView() {
        this.f114725f = (ImageView) findViewById(C0966R.C0970id.ey4);
        this.f114726g = (TextView) findViewById(C0966R.C0970id.f358410ey3);
        this.f114727h = (TextView) findViewById(C0966R.C0970id.f358409ey2);
        this.f114730n = (TextView) findViewById(C0966R.C0970id.exu);
        this.f114731o = (TextView) findViewById(C0966R.C0970id.f358408ey1);
        this.f114728i = (TextView) findViewById(C0966R.C0970id.ext);
        this.f114729j = (TextView) findViewById(C0966R.C0970id.f358407ey0);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C0966R.C0970id.exy);
        CdnImageView cdnImageView = (CdnImageView) findViewById(C0966R.C0970id.exx);
        TextView textView = (TextView) findViewById(C0966R.C0970id.exw);
        Button button = (Button) findViewById(C0966R.C0970id.exv);
        WcPayBannerView wcPayBannerView = (WcPayBannerView) findViewById(C0966R.C0970id.lkt);
        this.f114732p = wcPayBannerView;
        wcPayBannerView.mo105020a();
        this.f114727h.setClickable(true);
        this.f114727h.setOnTouchListener(new C75355a0(this));
    }

    public void onCreate(Bundle bundle) {
        this.f114713e = C0966R.color.f3566xx;
        super.onCreate(bundle);
        addSceneEndListener(2613);
        this.f114734r = getIntent().getIntExtra("key_scene", 0);
        this.f114735s = getIntent().getStringExtra("key_card_no");
        initView();
        if (this.f114734r == 0) {
            C47749m mVar = new C47749m(this.f114735s);
            mVar.mo104821m1(this);
            doSceneProgress(mVar, true);
            return;
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_qry_response");
        try {
            C51409tk3 tk32 = new C51409tk3();
            this.f114733q = tk32;
            tk32.parseFrom(byteArrayExtra);
            mo66497I7();
        } catch (IOException e) {
            Log.printErrStackTrace(this.f114712d, e, "", new Object[0]);
            C47749m mVar2 = new C47749m(this.f114735s);
            mVar2.mo104821m1(this);
            doSceneProgress(mVar2, true);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2613);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!(yVar instanceof C47749m)) {
            return true;
        }
        C47749m mVar = (C47749m) yVar;
        mVar.mo104823q1(new C42412a(mVar));
        return true;
    }
}
