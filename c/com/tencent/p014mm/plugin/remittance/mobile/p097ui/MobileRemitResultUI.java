package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.autogen.events.MobilePayCheckEvent;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.C45056f1;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75129p;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import fy3.C32226l;
import j20.C117292a;
import java.util.HashSet;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ob0.C117747y;
import te3.C64731tl2;
import te3.qj4;
import wi2.C66127e;
import xi2.C78842a;
import yq3.C79144b;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI */
public class MobileRemitResultUI extends MobileRemitBaseUI {

    /* renamed from: A */
    public String f203912A;

    /* renamed from: d */
    public LinearLayout f203913d;

    /* renamed from: e */
    public TextView f203914e;

    /* renamed from: f */
    public ImageView f203915f;

    /* renamed from: g */
    public LinearLayout f203916g;

    /* renamed from: h */
    public TextView f203917h;

    /* renamed from: i */
    public TextView f203918i;

    /* renamed from: j */
    public WalletTextView f203919j;

    /* renamed from: n */
    public View f203920n;

    /* renamed from: o */
    public LinearLayout f203921o;

    /* renamed from: p */
    public PayInfo f203922p;

    /* renamed from: q */
    public String f203923q;

    /* renamed from: r */
    public String f203924r;

    /* renamed from: s */
    public String f203925s;

    /* renamed from: t */
    public String f203926t;

    /* renamed from: u */
    public int f203927u;

    /* renamed from: v */
    public String f203928v;

    /* renamed from: w */
    public String f203929w;

    /* renamed from: x */
    public int f203930x;

    /* renamed from: y */
    public String f203931y;

    /* renamed from: z */
    public String f203932z;

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI$d */
    public static class C42832d extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI$d$a */
        public class C42833a implements C32226l<View, String> {
            public C42833a() {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                TextView textView = (TextView) C42832d.this.findViewById(C0966R.C0970id.f358761gx2);
                TextView textView2 = (TextView) C42832d.this.findViewById(C0966R.C0970id.gx5);
                if (textView == null || textView2 == null) {
                    return "";
                }
                return textView.getText().toString() + textView2.getText().toString();
            }
        }

        public C42832d(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            MMBaseAccessibilityConfig.ConfigHelper root = root(C0966R.C0970id.gxa);
            root.disable(C0966R.C0970id.gxa);
            root.view(C0966R.C0970id.f358762gx3).desc((C32226l<? super View, String>) new C42833a());
            root(C0966R.C0971layout.f6311bc).disable(C0966R.C0970id.f5470g0);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI$a */
    public class C70538a extends C7089c0 {
        public C70538a() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemitResultUI", "mFinishBt click");
            MobileRemitResultUI.this.mo97196H7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI$b */
    public class C70539b implements Runnable {
        public C70539b() {
        }

        public void run() {
            int measuredWidth = MobileRemitResultUI.this.f203916g.getMeasuredWidth();
            MobileRemitResultUI mobileRemitResultUI = MobileRemitResultUI.this;
            String string = mobileRemitResultUI.getString(C0966R.string.guf, new Object[]{mobileRemitResultUI.f203931y});
            MobileRemitResultUI mobileRemitResultUI2 = MobileRemitResultUI.this;
            String string2 = mobileRemitResultUI2.getString(C0966R.string.gug, new Object[]{mobileRemitResultUI2.f203932z});
            if (measuredWidth != 0) {
                float measureText = MobileRemitResultUI.this.f203917h.getPaint().measureText(string);
                float measureText2 = MobileRemitResultUI.this.f203918i.getPaint().measureText(string2);
                float f = (float) measuredWidth;
                if (measureText + measureText2 > f) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) MobileRemitResultUI.this.f203917h.getLayoutParams();
                    layoutParams.width = (int) (f - measureText2);
                    MobileRemitResultUI.this.f203917h.setLayoutParams(layoutParams);
                }
            }
            MobileRemitResultUI.this.f203917h.setText(string);
            MobileRemitResultUI.this.f203918i.setText(string2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI$c */
    public class C70540c extends C7089c0 {

        /* renamed from: g */
        public final /* synthetic */ qj4 f203935g;

        /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitResultUI$c$a */
        public class C70541a extends C78842a {
            public C70541a() {
            }

            /* renamed from: c */
            public void mo6028c(Object obj) {
                Log.m105924i("MicroMsg.mobileRemit.MobileRemitResultUI", "notice click jumpItem.action:exit");
                MobileRemitResultUI.this.mo97196H7();
            }

            /* renamed from: f */
            public void mo97200f(Object obj) {
                Log.m105924i("MicroMsg.mobileRemit.MobileRemitResultUI", "notice click jumpItem.action:continue");
            }
        }

        public C70540c(qj4 qj4) {
            this.f203935g = qj4;
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemitResultUI", "notice click!");
            C75129p.m90108c(MobileRemitResultUI.this.getContext(), this.f203935g.f185044h, null, new C70541a());
        }
    }

    /* renamed from: I7 */
    public final void mo97213I7(int i) {
        if (i == 0) {
            this.f203915f.setImageDrawable(C76577a.m92158i(this, C0966R.raw.icons_filled_done2));
            this.f203915f.getDrawable().setColorFilter(getResources().getColor(C0966R.color.f2939n), PorterDuff.Mode.SRC_ATOP);
            return;
        }
        this.f203915f.setImageDrawable(C76577a.m92158i(this, C0966R.raw.icons_filled_time));
        this.f203915f.getDrawable().setColorFilter(getResources().getColor(C0966R.color.f2933h), PorterDuff.Mode.SRC_ATOP);
    }

    /* renamed from: J7 */
    public final void mo97214J7(qj4 qj4) {
        qj4 qj42 = qj4;
        if (qj42 == null) {
            mo97213I7(this.f203930x);
            this.f203916g.post(new C70539b());
            this.f203919j.setText(C75228t.m90258m(((double) this.f203927u) / 100.0d, "CNY"));
            View view = this.f203920n;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f203921o.setVisibility(8);
        } else {
            mo97213I7(qj42.f185042f);
            if (qj42.f185044h != null) {
                this.f203913d.setVisibility(0);
                this.f203914e.setText(qj42.f185044h.f227478d);
                this.f203913d.setOnClickListener(new C70540c(qj42));
            }
            LinkedList<C64731tl2> linkedList = qj42.f185043g;
            if (linkedList == null || linkedList.isEmpty()) {
                this.f203921o.setVisibility(8);
                View view3 = this.f203920n;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                for (int i = 0; i < qj42.f185043g.size(); i++) {
                    C64731tl2 tl22 = qj42.f185043g.get(i);
                    View inflate = getLayoutInflater().inflate(C0966R.C0971layout.bgb, (ViewGroup) null);
                    ((TextView) inflate.findViewById(C0966R.C0970id.ffe)).setText(tl22.f185610d);
                    ((TextView) inflate.findViewById(C0966R.C0970id.l3h)).setText(tl22.f185611e);
                    this.f203921o.addView(inflate);
                }
                this.f203921o.setVisibility(0);
                View view5 = this.f203920n;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemitResultUI", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TransferPhoneSuccPageResp;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        C45056f1.m49908a(getContext(), (ScrollView) findViewById(C0966R.C0970id.iwq), findViewById(C0966R.C0970id.ah7), findViewById(C0966R.C0970id.ai4), findViewById(C0966R.C0970id.agw), 48);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bgc;
    }

    public void initView() {
        super.initView();
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackGroundColorResource(C0966R.color.al6);
        setBackBtn((MenuItem.OnMenuItemClickListener) null);
        setBackBtnVisible(false);
        this.f203913d = (LinearLayout) findViewById(C0966R.C0970id.gx_);
        this.f203914e = (TextView) findViewById(C0966R.C0970id.a7l);
        this.f203915f = (ImageView) findViewById(C0966R.C0970id.gx4);
        this.f203916g = (LinearLayout) findViewById(C0966R.C0970id.f358762gx3);
        this.f203917h = (TextView) findViewById(C0966R.C0970id.f358761gx2);
        this.f203918i = (TextView) findViewById(C0966R.C0970id.gx5);
        WalletTextView walletTextView = (WalletTextView) findViewById(C0966R.C0970id.gx6);
        this.f203919j = walletTextView;
        walletTextView.setTypeface(0);
        this.f203920n = findViewById(C0966R.C0970id.gx8);
        this.f203921o = (LinearLayout) findViewById(C0966R.C0970id.gx9);
        ((Button) findViewById(C0966R.C0970id.gx7)).setOnClickListener(new C70538a());
        mo97214J7((qj4) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C79144b.m95773a().getClass();
        C79144b.m95773a().getClass();
        Boolean bool = Boolean.TRUE;
        Log.m105925i("MicroMsg.mobileRemit.MobileRemitResultUI", "isKindaEnable: %s，isKindaMobileRemittanceEnable ：%s", bool, bool);
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitResultUI", "use Kinda");
        if (getIntent() == null || getIntent().getExtras() == null) {
            PayInfo payInfo = (PayInfo) getInput().getParcelable("key_pay_info");
            this.f203922p = payInfo;
            if (payInfo == null || payInfo.f212600u == null) {
                Log.m105924i("MicroMsg.mobileRemit.MobileRemitResultUI", "payInfo != null && payInfo.extInfo != null");
                mo97196H7();
            } else {
                Log.m105924i("MicroMsg.mobileRemit.MobileRemitResultUI", "use native");
                Bundle bundle2 = this.f203922p.f212600u;
                this.f203923q = bundle2.getString("extinfo_key_1");
                this.f203924r = bundle2.getString("extinfo_key_2");
                this.f203925s = bundle2.getString("extinfo_key_3");
                this.f203926t = bundle2.getString("extinfo_key_4");
                this.f203927u = bundle2.getInt("extinfo_key_5");
                this.f203928v = bundle2.getString("extinfo_key_6");
                this.f203929w = bundle2.getString("extinfo_key_7");
                this.f203930x = bundle2.getInt("extinfo_key_8");
                this.f203931y = bundle2.getString("extinfo_key_9");
                this.f203932z = bundle2.getString("extinfo_key_10");
                this.f203912A = bundle2.getString("extinfo_key_11");
            }
        } else {
            Bundle extras = getIntent().getExtras();
            this.f203923q = extras.getString("extinfo_key_1");
            this.f203924r = extras.getString("extinfo_key_2");
            this.f203925s = extras.getString("extinfo_key_3");
            this.f203926t = extras.getString("extinfo_key_4");
            this.f203927u = extras.getInt("extinfo_key_5");
            this.f203928v = extras.getString("extinfo_key_6");
            this.f203929w = extras.getString("extinfo_key_7");
            this.f203930x = extras.getInt("extinfo_key_8");
            this.f203931y = extras.getString("extinfo_key_9");
            this.f203932z = extras.getString("extinfo_key_10");
            this.f203912A = extras.getString("extinfo_key_11");
        }
        initView();
        doSceneProgress(new C66127e(this.f203923q, this.f203924r, this.f203925s, this.f203926t, this.f203927u, this.f203928v, this.f203929w));
        addSceneEndListener(1903);
        MobilePayCheckEvent mobilePayCheckEvent = new MobilePayCheckEvent();
        mobilePayCheckEvent.f193736d.f193737a = this.f203912A;
        mobilePayCheckEvent.publish();
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(1903);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Log.m105924i("MicroMsg.mobileRemit.MobileRemitResultUI", "onKeyUp KEYCODE_BACK click");
            mo97196H7();
        }
        return super.onKeyUp(i, keyEvent);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("MicroMsg.mobileRemit.MobileRemitResultUI", "errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scenetype:" + yVar.getType());
        if (i == 0 && i2 == 0 && (yVar instanceof C66127e)) {
            qj4 qj4 = ((C66127e) yVar).f190058t;
            if (qj4 == null) {
                qj4 = null;
            }
            if (qj4 == null) {
                Log.m105920e("MicroMsg.mobileRemit.MobileRemitResultUI", "NetSceneMobileRemitGetSuccPage succPageResp is null");
                return true;
            }
            int i3 = qj4.f185040d;
            if (i3 == 0) {
                mo97214J7(qj4);
            } else {
                Log.m105925i("MicroMsg.mobileRemit.MobileRemitResultUI", "NetSceneMobileRemitGetSuccPage ret_code:%s ret_msg:%s", Integer.valueOf(i3), qj4.f185041e);
            }
        }
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C42832d.class);
    }
}
