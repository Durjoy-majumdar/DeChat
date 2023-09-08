package com.tencent.p014mm.plugin.card.sharecard.p317ui;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.sharecard.p317ui.C18550a;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C20483c;
import gz0.C20867d;
import gz0.C45985e;
import hz0.C46153l0;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import te3.C22498fy;
import wz0.C22945n;
import wz0.C53246b;
import wz0.C53248d;
import wz0.C53263p;

/* renamed from: com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI */
public class CardConsumeCodeUI extends MMActivity implements C45985e.C45986a, C20867d.C20870c, View.OnClickListener {

    /* renamed from: d */
    public C20483c f51618d;

    /* renamed from: e */
    public int f51619e = 3;

    /* renamed from: f */
    public int f51620f = 3;

    /* renamed from: g */
    public int f51621g = 0;

    /* renamed from: h */
    public C18550a f51622h;

    /* renamed from: i */
    public TextView f51623i;

    /* renamed from: j */
    public TextView f51624j;

    /* renamed from: n */
    public LinearLayout f51625n;

    /* renamed from: o */
    public ImageView f51626o;

    /* renamed from: p */
    public View f51627p;

    /* renamed from: q */
    public LinearLayout f51628q;

    /* renamed from: r */
    public View f51629r;

    /* renamed from: s */
    public TextView f51630s;

    /* renamed from: t */
    public TextView f51631t;

    /* renamed from: u */
    public TextView f51632u;

    /* renamed from: v */
    public Vibrator f51633v;

    /* renamed from: w */
    public boolean f51634w = false;

    /* renamed from: com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI$a */
    public class C18545a implements MenuItem.OnMenuItemClickListener {
        public C18545a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            CardConsumeCodeUI.this.setResult(-1);
            CardConsumeCodeUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.sharecard.ui.CardConsumeCodeUI$b */
    public class C18546b implements C18550a.C18553c {
        public C18546b() {
        }
    }

    /* renamed from: C */
    public void mo23305C() {
        this.f51622h.mo23324a();
    }

    /* renamed from: F6 */
    public void mo23306F6() {
        Log.m105924i("MicroMsg.CardConsumeCodeUI", "onFinishUI");
        finish();
    }

    /* renamed from: V6 */
    public void mo23307V6(String str) {
        Log.m105924i("MicroMsg.CardConsumeCodeUI", "onStartConsumedSuccUI");
        if (this.f51634w) {
            Log.m105920e("MicroMsg.CardConsumeCodeUI", "has start CardConsumeSuccessUI!");
            return;
        }
        Log.m105924i("MicroMsg.CardConsumeCodeUI", "startConsumedSuccUI() ");
        this.f51634w = true;
        Intent intent = new Intent(this, CardConsumeSuccessUI.class);
        intent.putExtra("KEY_CARD_ID", this.f51618d.getCardId());
        intent.putExtra("KEY_CARD_CONSUMED_JSON", str);
        intent.putExtra("KEY_CARD_COLOR", this.f51618d.mo23264L0().f64145p);
        intent.putExtra("key_stastic_scene", this.f51619e);
        intent.putExtra("key_from_scene", 0);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "startConsumedSuccUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "startConsumedSuccUI", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* renamed from: W5 */
    public void mo23308W5() {
        this.f51633v.vibrate(300);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6700m5;
    }

    public void initView() {
        if (this.f51618d.mo23291o()) {
            if (!TextUtils.isEmpty(this.f51618d.mo23264L0().f64156y)) {
                setMMTitle(getString(C0966R.string.awj, new Object[]{this.f51618d.mo23264L0().f64156y}));
            } else {
                setMMTitle(getString(C0966R.string.awj, new Object[]{getString(C0966R.string.azp)}));
            }
        }
        setBackBtn(new C18545a());
        if (this.f51622h == null) {
            C18550a aVar = new C18550a(this, getContentView());
            this.f51622h = aVar;
            aVar.f51680o = aVar.f51667b.getWindow().getAttributes().screenBrightness;
            C18550a aVar2 = this.f51622h;
            aVar2.f51673h = (TextView) aVar2.f51666a.findViewById(C0966R.C0970id.aw8);
            aVar2.f51674i = (TextView) aVar2.f51666a.findViewById(C0966R.C0970id.awh);
            CheckBox checkBox = (CheckBox) aVar2.f51666a.findViewById(C0966R.C0970id.hk4);
            aVar2.f51675j = checkBox;
            checkBox.setChecked(true);
            aVar2.f51675j.setOnClickListener(aVar2.f51681p);
            if (aVar2.f51680o < 0.8f) {
                WindowManager.LayoutParams attributes = aVar2.f51667b.getWindow().getAttributes();
                attributes.screenBrightness = 0.8f;
                aVar2.f51667b.getWindow().setAttributes(attributes);
            }
            this.f51622h.f51679n = new C18546b();
        }
        C18550a aVar3 = this.f51622h;
        C20483c cVar = this.f51618d;
        aVar3.f51676k = cVar;
        aVar3.f51678m = true;
        if (cVar.mo23272T0()) {
            this.f51622h.f51677l = 1;
        }
        this.f51633v = (Vibrator) getSystemService("vibrator");
        this.f51623i = (TextView) findViewById(C0966R.C0970id.aio);
        this.f51624j = (TextView) findViewById(C0966R.C0970id.knx);
        this.f51625n = (LinearLayout) findViewById(C0966R.C0970id.f6047vu);
        this.f51626o = (ImageView) findViewById(C0966R.C0970id.f6046vt);
        this.f51627p = findViewById(C0966R.C0970id.byv);
        this.f51628q = (LinearLayout) findViewById(C0966R.C0970id.bfp);
        if (this.f51618d.mo23291o()) {
            findViewById(C0966R.C0970id.atj).setBackgroundColor(getResources().getColor(C0966R.color.f3199ip));
            setActionbarColor(getResources().getColor(C0966R.color.al6));
        } else {
            findViewById(C0966R.C0970id.atj).setBackgroundColor(C22945n.m27004d(this.f51618d.mo23264L0().f64145p));
            setActionbarColor(C22945n.m27004d(this.f51618d.mo23264L0().f64145p));
        }
        if (!this.f51618d.mo23291o() || TextUtils.isEmpty(this.f51618d.mo23264L0().f64137e)) {
            this.f51623i.setText(this.f51618d.mo23264L0().f64142j);
            this.f51624j.setText(this.f51618d.mo23264L0().f64143n);
        } else {
            this.f51625n.setVisibility(0);
            this.f51623i.setVisibility(8);
            this.f51624j.setVisibility(8);
            View view = this.f51627p;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C53263p.m59701b(this.f51626o, this.f51618d.mo23264L0().f64137e, getResources().getDimensionPixelSize(C0966R.dimen.f4213we), C0966R.C0969drawable.f357296c91, true);
        }
        if (this.f51618d.mo23264L0().f64135Z != null) {
            C22498fy fyVar = this.f51618d.mo23264L0().f64135Z;
            if (!TextUtils.isEmpty(fyVar.f63884d)) {
                if (this.f51629r == null) {
                    this.f51629r = ((ViewStub) findViewById(C0966R.C0970id.awi)).inflate();
                }
                this.f51629r.setOnClickListener(this);
                this.f51630s = (TextView) this.f51629r.findViewById(C0966R.C0970id.awk);
                this.f51631t = (TextView) this.f51629r.findViewById(C0966R.C0970id.awj);
                this.f51632u = (TextView) this.f51629r.findViewById(C0966R.C0970id.awg);
                this.f51630s.setVisibility(0);
                this.f51630s.setText(fyVar.f63884d);
                Drawable drawable = getResources().getDrawable(C0966R.C0969drawable.bwx);
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                drawable.setColorFilter(C22945n.m27004d(this.f51618d.mo23264L0().f64145p), PorterDuff.Mode.SRC_IN);
                this.f51630s.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                this.f51630s.setTextColor(C22945n.m27004d(this.f51618d.mo23264L0().f64145p));
                this.f51630s.setOnClickListener(this);
                if (!TextUtils.isEmpty(fyVar.f63885e)) {
                    this.f51631t.setVisibility(0);
                    this.f51631t.setText(fyVar.f63885e);
                } else {
                    this.f51631t.setVisibility(0);
                    this.f51631t.setText(getString(C0966R.string.azq));
                }
                if (!TextUtils.isEmpty(fyVar.f63886f)) {
                    this.f51632u.setVisibility(0);
                    this.f51632u.setText(fyVar.f63886f);
                }
                ViewGroup.LayoutParams layoutParams = this.f51626o.getLayoutParams();
                layoutParams.height = getResources().getDimensionPixelSize(C0966R.dimen.f4214wf);
                layoutParams.width = getResources().getDimensionPixelSize(C0966R.dimen.f4214wf);
                this.f51626o.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = this.f51625n.getLayoutParams();
                layoutParams2.height = C76577a.m92151b(this, 54);
                layoutParams2.width = C76577a.m92151b(this, 54);
                this.f51625n.setLayoutParams(layoutParams2);
                C53263p.m59701b(this.f51626o, this.f51618d.mo23264L0().f64137e, getResources().getDimensionPixelSize(C0966R.dimen.f4214wf), C0966R.C0969drawable.f357296c91, true);
                this.f51628q.setPadding(0, C76577a.m92151b(this, 10), 0, C76577a.m92151b(this, 30));
            }
        }
        C45985e xx02 = C46153l0.xx0();
        if (xx02.f124003e == null) {
            xx02.f124003e = new ArrayList();
        }
        ((ArrayList) xx02.f124003e).add(new WeakReference(this));
        if (this.f51618d.mo23278d0()) {
            C20867d wx02 = C46153l0.wx0();
            if (wx02.f58956d == null) {
                wx02.f58956d = new ArrayList();
            }
            ((ArrayList) wx02.f58956d).add(new WeakReference(this));
            if (!C46153l0.wx0().mo32571c()) {
                C46153l0.wx0().mo32572d();
                return;
            }
            Log.m105924i("MicroMsg.CardConsumeCodeUI", "registerListener doGetCardCodes");
            C46153l0.wx0().mo32569a(this.f51618d.getCardId());
        }
    }

    /* renamed from: k1 */
    public void mo23309k1(C20483c cVar) {
        Log.m105924i("MicroMsg.CardConsumeCodeUI", "onDataChange");
        if (cVar != null && cVar.getCardId() != null && cVar.getCardId().equals(this.f51618d.getCardId())) {
            this.f51618d = cVar;
            C18550a aVar = this.f51622h;
            aVar.f51676k = cVar;
            aVar.mo23324a();
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getId() == C0966R.C0970id.awk || view.getId() == C0966R.C0970id.awf) {
            if (this.f51618d.mo23286i2()) {
                C53246b.m59675g(this, 0, (String) null, false, this.f51618d);
            } else {
                C22498fy fyVar = this.f51618d.mo23264L0().f64135Z;
                if (!C53246b.m59673e(this.f51618d.getCardId(), fyVar, this.f51620f, this.f51621g) && fyVar != null && !TextUtils.isEmpty(fyVar.f63887g)) {
                    C53246b.m59678j(this, C22945n.m27011k(fyVar.f63887g, fyVar.f63888h), 1);
                    C115669n.INSTANCE.mo160131h(11941, 9, this.f51618d.getCardId(), this.f51618d.mo23270R0(), "", fyVar.f63884d);
                    if (C22945n.m26990C(fyVar, this.f51618d.getCardId())) {
                        C22945n.m26999L(this.f51618d.getCardId(), fyVar.f63884d);
                        C53246b.m59676h(this, this.f51618d.mo23264L0().f64142j);
                    }
                }
            }
            finish();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/card/sharecard/ui/CardConsumeCodeUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.CardConsumeCodeUI", "onCreate()");
        setResult(0);
        this.f51618d = (C20483c) getIntent().getParcelableExtra("key_card_info_data");
        this.f51619e = getIntent().getIntExtra("key_from_scene", 3);
        this.f51620f = getIntent().getIntExtra("key_previous_scene", 3);
        getIntent().getStringExtra("key_mark_user");
        this.f51621g = getIntent().getIntExtra("key_from_appbrand_type", 0);
        C20483c cVar = this.f51618d;
        if (cVar == null || cVar.mo23264L0() == null || this.f51618d.mo23263J0() == null) {
            Log.m105920e("MicroMsg.CardConsumeCodeUI", "mCardInfo == null or mCardInfo.getCardTpInfo() == null or mCardInfo.getDataInfo() == null");
            finish();
            return;
        }
        initView();
        C46153l0.Jx0().mo71409a("", "", 3);
    }

    public void onDestroy() {
        C18550a aVar = this.f51622h;
        float f = aVar.f51680o;
        WindowManager.LayoutParams attributes = aVar.f51667b.getWindow().getAttributes();
        attributes.screenBrightness = f;
        aVar.f51667b.getWindow().setAttributes(attributes);
        C22945n.m26993F(aVar.f51671f);
        C22945n.m26993F(aVar.f51672g);
        aVar.f51679n = null;
        aVar.f51667b = null;
        C45985e xx02 = C46153l0.xx0();
        if (xx02.f124004f == null) {
            xx02.f124004f = new HashMap<>();
        }
        xx02.f124004f.remove(this);
        C46153l0.xx0().mo71381f(this);
        if (this.f51618d.mo23278d0()) {
            C46153l0.wx0().mo32575g(this);
            C46153l0.wx0().mo32574f();
        }
        this.f51633v.cancel();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            Log.m105920e("MicroMsg.CardConsumeCodeUI", "onKeyDown finishUI");
            setResult(-1);
            finish();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public void onPause() {
        C46153l0.xx0().mo71380e(this, false);
        super.onPause();
    }

    public void onResume() {
        this.f51622h.mo23324a();
        C46153l0.xx0().mo71380e(this, true);
        super.onResume();
    }

    public void onSuccess() {
        this.f51622h.mo23324a();
    }

    /* renamed from: z */
    public void mo23312z(int i, String str) {
        C53248d.m59685e(this, str, true);
    }
}
