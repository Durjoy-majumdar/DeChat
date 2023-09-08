package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.F2fDynamicResultEvent;
import com.tencent.p014mm.autogen.events.F2fDynamicStartPayEvent;
import com.tencent.p014mm.autogen.events.RemittanceBusiUIF2fDynamicActivityResultEvent;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.plugin.remittance.model.C70608p;
import com.tencent.p014mm.plugin.remittance.p098ui.C70887f0;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.model.C75157y0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.WalletTextView;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import di3.C86312j;
import e21.C75484o;
import go3.C8371g;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nj3.C88989a;
import ob0.C117747y;
import p206nj.C11171e;
import p755xs.C102720b;
import te3.C49589gp;
import te3.C49823ib0;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI */
public class RemittanceF2fDynamicCodeUI extends WalletBaseUI {

    /* renamed from: I */
    public static final /* synthetic */ int f204864I = 0;

    /* renamed from: A */
    public LinearLayout f204865A;

    /* renamed from: B */
    public ImageView f204866B;

    /* renamed from: C */
    public LinearLayout f204867C;

    /* renamed from: D */
    public boolean f204868D = false;

    /* renamed from: E */
    public long f204869E = 0;

    /* renamed from: F */
    public long f204870F = 0;

    /* renamed from: G */
    public MTimerHandler f204871G = new MTimerHandler(new C70770e((C70765a) null), true);

    /* renamed from: H */
    public C102720b.C78973a f204872H = new C70765a();

    /* renamed from: d */
    public PayInfo f204873d;

    /* renamed from: e */
    public int f204874e;

    /* renamed from: f */
    public String f204875f;

    /* renamed from: g */
    public String f204876g;

    /* renamed from: h */
    public String f204877h;

    /* renamed from: i */
    public String f204878i;

    /* renamed from: j */
    public String f204879j;

    /* renamed from: n */
    public String f204880n;

    /* renamed from: o */
    public String f204881o;

    /* renamed from: p */
    public String f204882p;

    /* renamed from: q */
    public String f204883q;

    /* renamed from: r */
    public String f204884r;

    /* renamed from: s */
    public String f204885s;

    /* renamed from: t */
    public int f204886t;

    /* renamed from: u */
    public String f204887u;

    /* renamed from: v */
    public List<C49823ib0> f204888v = new ArrayList();

    /* renamed from: w */
    public boolean f204889w = false;

    /* renamed from: x */
    public TextView f204890x;

    /* renamed from: y */
    public TextView f204891y;

    /* renamed from: z */
    public Button f204892z;

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI$a */
    public class C70765a implements C102720b.C78973a {

        /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI$a$a */
        public class C70766a implements Runnable {
            public C70766a() {
            }

            public void run() {
                RemittanceF2fDynamicCodeUI.m83277H7(RemittanceF2fDynamicCodeUI.this);
            }
        }

        public C70765a() {
        }

        /* renamed from: j3 */
        public void mo24656j3(String str, Bitmap bitmap) {
            String str2;
            if (str != null && (str2 = RemittanceF2fDynamicCodeUI.this.f204883q) != null && str.equals(str2)) {
                Log.m105925i("MicroMsg.RemittanceF2fDynamicCodeUI", "cdnImageDownloadListener mchPhoto = %s notifyKey = %s", RemittanceF2fDynamicCodeUI.this.f204883q, str);
                RemittanceF2fDynamicCodeUI.this.runOnUiThread(new C70766a());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI$b */
    public class C70767b implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C70608p f204895a;

        public C70767b(C70608p pVar) {
            this.f204895a = pVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = RemittanceF2fDynamicCodeUI.this;
            C49589gp gpVar = this.f204895a.f204280r;
            remittanceF2fDynamicCodeUI.f204885s = gpVar.f134182g;
            remittanceF2fDynamicCodeUI.f204886t = C75157y0.m90138a(gpVar.f134184i);
            RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI2 = RemittanceF2fDynamicCodeUI.this;
            C49589gp gpVar2 = this.f204895a.f204280r;
            remittanceF2fDynamicCodeUI2.f204887u = gpVar2.f134181f;
            remittanceF2fDynamicCodeUI2.f204888v = gpVar2.f134183h;
            RemittanceF2fDynamicCodeUI.m83277H7(remittanceF2fDynamicCodeUI2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI$c */
    public class C70768c extends C30870z1 {
        public C70768c() {
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            RemittanceF2fDynamicCodeUI.m83278I7(RemittanceF2fDynamicCodeUI.this, 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI$d */
    public class C70769d implements View.OnLongClickListener {
        public C70769d() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/remittance/ui/RemittanceF2fDynamicCodeUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = RemittanceF2fDynamicCodeUI.this;
            int i = RemittanceF2fDynamicCodeUI.f204864I;
            C8371g gVar = new C8371g((Context) remittanceF2fDynamicCodeUI.getContext(), 1, false);
            gVar.f225771i = new C70886e1(remittanceF2fDynamicCodeUI);
            gVar.f225782p = new C70889f1(remittanceF2fDynamicCodeUI);
            gVar.mo107573q();
            gVar.f225761d = new C70891g1(remittanceF2fDynamicCodeUI);
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/remittance/ui/RemittanceF2fDynamicCodeUI$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceF2fDynamicCodeUI$e */
    public class C70770e implements MTimerHandler.CallBack {
        public C70770e(C70765a aVar) {
        }

        public boolean onTimerExpired() {
            Log.m105918d("MicroMsg.RemittanceF2fDynamicCodeUI", "timer expired");
            RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI = RemittanceF2fDynamicCodeUI.this;
            if (remittanceF2fDynamicCodeUI.f204868D) {
                return true;
            }
            remittanceF2fDynamicCodeUI.f204869E = System.currentTimeMillis();
            RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI2 = RemittanceF2fDynamicCodeUI.this;
            Log.m105925i("MicroMsg.RemittanceF2fDynamicCodeUI", "do get dynamic code %s", remittanceF2fDynamicCodeUI2.f204880n);
            remittanceF2fDynamicCodeUI2.f204868D = true;
            remittanceF2fDynamicCodeUI2.doSceneProgress(new C70608p(remittanceF2fDynamicCodeUI2.f204874e, remittanceF2fDynamicCodeUI2.f204875f, remittanceF2fDynamicCodeUI2.f204876g, remittanceF2fDynamicCodeUI2.f204877h, remittanceF2fDynamicCodeUI2.f204878i, remittanceF2fDynamicCodeUI2.f204879j, remittanceF2fDynamicCodeUI2.f204880n, remittanceF2fDynamicCodeUI2.f204881o, remittanceF2fDynamicCodeUI2.f204882p), false);
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m83277H7(RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI) {
        RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI2 = remittanceF2fDynamicCodeUI;
        remittanceF2fDynamicCodeUI.f204866B.setImageBitmap(C75484o.m90513a(remittanceF2fDynamicCodeUI2, remittanceF2fDynamicCodeUI.f204885s, remittanceF2fDynamicCodeUI.f204875f, remittanceF2fDynamicCodeUI.f204873d.f212581L, remittanceF2fDynamicCodeUI.f204883q, true, BackwardSupportUtil.BitmapFactory.fromDPToPix(remittanceF2fDynamicCodeUI, 197.0f), remittanceF2fDynamicCodeUI.f204872H, remittanceF2fDynamicCodeUI.f204889w, remittanceF2fDynamicCodeUI.f204886t, 0.0f, true));
        if (!Util.isNullOrNil(remittanceF2fDynamicCodeUI.f204887u)) {
            remittanceF2fDynamicCodeUI.f204890x.setText(remittanceF2fDynamicCodeUI.f204887u);
        }
        if (!Util.isNullOrNil(remittanceF2fDynamicCodeUI.f204884r)) {
            remittanceF2fDynamicCodeUI.f204891y.setText(remittanceF2fDynamicCodeUI.f204884r);
            remittanceF2fDynamicCodeUI.f204867C.setVisibility(0);
        } else {
            remittanceF2fDynamicCodeUI.f204867C.setVisibility(8);
        }
        remittanceF2fDynamicCodeUI.f204865A.removeAllViews();
        if (!remittanceF2fDynamicCodeUI.f204888v.isEmpty()) {
            for (C49823ib0 next : remittanceF2fDynamicCodeUI.f204888v) {
                F2fDynamicCodeItemLayout f2fDynamicCodeItemLayout = new F2fDynamicCodeItemLayout(remittanceF2fDynamicCodeUI);
                String str = next.f135195d;
                String str2 = next.f135196e;
                f2fDynamicCodeItemLayout.f20413d.setText(str);
                f2fDynamicCodeItemLayout.f20414e.setText(str2);
                remittanceF2fDynamicCodeUI.f204865A.addView(f2fDynamicCodeItemLayout, new LinearLayout.LayoutParams(-1, -2));
            }
        }
        remittanceF2fDynamicCodeUI.f204865A.requestLayout();
    }

    /* renamed from: I7 */
    public static void m83278I7(RemittanceF2fDynamicCodeUI remittanceF2fDynamicCodeUI, int i) {
        remittanceF2fDynamicCodeUI.getClass();
        Log.m105925i("MicroMsg.RemittanceF2fDynamicCodeUI", "send pay: %s", Integer.valueOf(i));
        F2fDynamicStartPayEvent f2fDynamicStartPayEvent = new F2fDynamicStartPayEvent();
        F2fDynamicStartPayEvent.C67691a aVar = f2fDynamicStartPayEvent.f193584d;
        aVar.f193588d = remittanceF2fDynamicCodeUI;
        aVar.f193587c = i;
        aVar.f193586b = 1;
        aVar.f193585a = remittanceF2fDynamicCodeUI.f204885s;
        f2fDynamicStartPayEvent.publish();
    }

    /* renamed from: J7 */
    public boolean mo97411J7() {
        return getIntent().getBooleanExtra("from_patch_ui", false);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.brl;
    }

    public void initView() {
        if (mo97411J7()) {
            this.f204890x = (TextView) findViewById(C0966R.C0970id.isr);
            this.f204891y = (TextView) findViewById(C0966R.C0970id.isq);
            this.f204892z = (Button) findViewById(C0966R.C0970id.isp);
            this.f204866B = (ImageView) findViewById(C0966R.C0970id.isn);
            this.f204865A = (LinearLayout) findViewById(C0966R.C0970id.iso);
            this.f204867C = (LinearLayout) findViewById(C0966R.C0970id.f359280jz1);
            ((WalletTextView) findViewById(C0966R.C0970id.f358910hs2)).setText(getString(C0966R.string.f361203i32, new Object[]{C75228t.m90256l(((double) this.f204874e) / 100.0d)}));
            this.f204892z.setOnClickListener(new C70768c());
            this.f204866B.setOnLongClickListener(new C70769d());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (mo97411J7()) {
            boolean z = true;
            Log.m105925i("MicroMsg.RemittanceF2fDynamicCodeUI", "onActivityResult requestCode:%s resultCode:%s %s", Integer.valueOf(i), Integer.valueOf(i2), intent);
            if (i == 1) {
                RemittanceBusiUIF2fDynamicActivityResultEvent remittanceBusiUIF2fDynamicActivityResultEvent = new RemittanceBusiUIF2fDynamicActivityResultEvent();
                RemittanceBusiUIF2fDynamicActivityResultEvent.C67775a aVar = remittanceBusiUIF2fDynamicActivityResultEvent.f193888d;
                if (i2 != -1) {
                    z = false;
                }
                aVar.f193889a = z;
                if (intent != null) {
                    aVar.f193890b = intent.getIntExtra("key_pay_reslut_type", 3);
                } else {
                    aVar.f193890b = 3;
                }
                remittanceBusiUIF2fDynamicActivityResultEvent.publish();
                if (i2 == -1) {
                    setResult(-1, intent);
                    finish();
                } else if (C75157y0.m90140c(intent)) {
                    setResult(0, intent);
                    finish();
                } else if (!C75157y0.m90141d(intent)) {
                    F2fDynamicResultEvent f2fDynamicResultEvent = new F2fDynamicResultEvent();
                    f2fDynamicResultEvent.f193583d.getClass();
                    f2fDynamicResultEvent.publish();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mo97411J7()) {
            if (getSupportActionBar() != null) {
                getSupportActionBar().mo91112w(new ColorDrawable(getResources().getColor(C0966R.color.a_7)));
                View j = getSupportActionBar().mo91099j();
                if (j != null) {
                    View findViewById = j.findViewById(C0966R.C0970id.c7p);
                    if (findViewById != null) {
                        findViewById.setBackgroundColor(getResources().getColor(C0966R.color.BW_0_Alpha_0_5));
                    }
                    View findViewById2 = j.findViewById(16908308);
                    if (findViewById2 != null && (findViewById2 instanceof TextView)) {
                        ((TextView) findViewById2).setTextColor(getResources().getColor(C0966R.color.a7f));
                    }
                }
            }
            Window window = getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(getResources().getColor(C0966R.color.a_7));
            if (C11171e.m11046c(21) && !C11171e.m11046c(23)) {
                getWindow().setStatusBarColor(getContext().getResources().getColor(C0966R.color.BW_93));
            }
            setBackBtn(new C70881d1(this), C0966R.raw.back_icon_normal_black);
            addSceneEndListener(2736);
            setMMTitle((int) C0966R.string.i05);
            PayInfo payInfo = (PayInfo) getIntent().getParcelableExtra("key_pay_info");
            this.f204873d = payInfo;
            if (payInfo == null) {
                Log.m105920e("MicroMsg.RemittanceF2fDynamicCodeUI", "payinfo is null");
                finish();
            }
            setContentViewVisibility(4);
            this.f204874e = this.f204873d.f212600u.getInt("extinfo_key_15");
            this.f204875f = this.f204873d.f212600u.getString("extinfo_key_1");
            this.f204882p = this.f204873d.f212600u.getString("extinfo_key_2");
            this.f204878i = this.f204873d.f212600u.getString("extinfo_key_17");
            this.f204879j = this.f204873d.f212600u.getString("extinfo_key_18");
            this.f204876g = getIntent().getStringExtra("key_rcvr_open_id");
            this.f204880n = getIntent().getStringExtra("key_mch_info");
            this.f204877h = getIntent().getStringExtra("key_transfer_qrcode_id");
            this.f204883q = getIntent().getStringExtra("key_mch_photo");
            getIntent().getStringExtra("show_paying_wording");
            this.f204884r = getIntent().getStringExtra("dynamic_code_spam_wording");
            this.f204889w = getIntent().getBooleanExtra("show_avatar_type", false);
            this.f204881o = C75228t.m90268r(this.f204875f);
            initView();
        }
    }

    public void onDestroy() {
        if (mo97411J7()) {
            removeSceneEndListener(2736);
        }
        ((C102720b) C86312j.m106911c(C102720b.class)).Bm0(this.f204872H);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        if (mo97411J7()) {
            this.f204871G.stopTimer();
            Log.m105918d("MicroMsg.RemittanceF2fDynamicCodeUI", "stop timer");
        }
    }

    public void onResume() {
        super.onResume();
        C70887f0.m83406d();
        C70887f0.C70888a.f205300a.mo97555a(this);
        if (mo97411J7()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f204869E;
            this.f204870F = j <= 0 ? 0 : ((long) CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL) - (currentTimeMillis - j);
            Log.m105925i("MicroMsg.RemittanceF2fDynamicCodeUI", "last time: %s, delay: %s", Long.valueOf(j), Long.valueOf(this.f204870F));
            if (this.f204870F < 0) {
                this.f204870F = 0;
            }
            this.f204871G.startTimer(this.f204870F, (long) CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
            Log.m105918d("MicroMsg.RemittanceF2fDynamicCodeUI", "start timer");
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (!mo97411J7() || !(yVar instanceof C70608p)) {
            return true;
        }
        this.f204868D = false;
        C70608p pVar = (C70608p) yVar;
        setContentViewVisibility(0);
        pVar.mo104823q1(new C70767b(pVar));
        return true;
    }
}
