package com.tencent.p014mm.plugin.honey_pay.p063ui;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.accessibility.base.ViewSetter;
import com.tencent.p014mm.accessibility.type.ViewType;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.honey_pay.model.HoneyPayCardType;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72476y0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75113f0;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C7092q;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WcPayBannerView;
import de3.C75355a0;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import ob0.C117747y;
import q02.C47737a;
import q02.C47738b;
import q02.C47742f;
import t02.C48527c;
import te3.C50248ld3;
import te3.C50399mg2;
import te3.C50678og2;
import te3.C50826pg2;
import te3.C51687ve2;
import te3.C52016xt;
import te3.C52302zt;
import te3.C77933g43;
import te3.eh4;
import u02.C52410j;
import u02.C52411k;
import u02.C52412l;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI */
public class HoneyPayMainUI extends HoneyPayBaseUI {

    /* renamed from: u */
    public static final /* synthetic */ int f114848u = 0;

    /* renamed from: f */
    public LinearLayout f114849f;

    /* renamed from: g */
    public ImageView f114850g;

    /* renamed from: h */
    public RelativeLayout f114851h;

    /* renamed from: i */
    public Button f114852i;

    /* renamed from: j */
    public LinearLayout f114853j;

    /* renamed from: n */
    public TextView f114854n;

    /* renamed from: o */
    public TextView f114855o;

    /* renamed from: p */
    public LinearLayout f114856p;

    /* renamed from: q */
    public CheckBox f114857q;

    /* renamed from: r */
    public ArrayList<HoneyPayCardLayout> f114858r = new ArrayList<>();

    /* renamed from: s */
    public String f114859s = "";

    /* renamed from: t */
    public boolean f114860t = false;

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI$f */
    public static class C4600f extends MMBaseAccessibilityConfig {

        /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI$f$a */
        public class C4601a implements C32226l<View, String> {
            public C4601a(C4600f fVar) {
            }

            public Object invoke(Object obj) {
                View view = (View) obj;
                return ((TextView) view.findViewById(C0966R.C0970id.eya)).getText() + ((TextView) view.findViewById(C0966R.C0970id.eyf)).getText() + MMApplicationContext.getContext().getString(C0966R.string.fjx, new Object[]{((TextView) view.findViewById(C0966R.C0970id.eyd)).getText()}) + ((TextView) view.findViewById(C0966R.C0970id.eye)).getText();
            }
        }

        public C4600f(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
        }

        public void initConfig() {
            ViewSetter desc = root(C0966R.C0971layout.azn).view(C0966R.C0970id.ezz).desc((int) C0966R.C0970id.ezz);
            ViewType viewType = ViewType.Button;
            desc.type(viewType);
            root(C0966R.C0970id.ezo).view(C0966R.C0970id.eyc).desc((C32226l<? super View, String>) new C4601a(this)).type(viewType);
            root(C0966R.C0970id.f05).view(C0966R.C0970id.ezp).desc((int) C0966R.C0970id.ezq).type(viewType);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI$a */
    public class C42438a implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47738b f114861a;

        public C42438a(C47738b bVar) {
            this.f114861a = bVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            HoneyPayMainUI honeyPayMainUI = HoneyPayMainUI.this;
            C47738b bVar = this.f114861a;
            C52302zt ztVar = bVar.f128252r;
            long j = ztVar.f146204g;
            long j2 = ztVar.f146203f;
            String str2 = ztVar.f146205h;
            String str3 = ztVar.f146206i;
            String str4 = bVar.f128253s;
            String str5 = ztVar.f146210p;
            int i3 = HoneyPayMainUI.f114848u;
            Log.m105924i(honeyPayMainUI.f114712d, "go to give card");
            Intent intent = new Intent(honeyPayMainUI, HoneyPayGiveCardUI.class);
            intent.putExtra("key_max_credit_line", j);
            intent.putExtra("key_min_credit_line", j2);
            intent.putExtra("key_min_credit_line", j2);
            intent.putExtra("key_true_name", str2);
            intent.putExtra("key_take_message", str3);
            intent.putExtra("key_username", str4);
            intent.putExtra("key_over_max_limit_warning", str5);
            honeyPayMainUI.startActivityForResult(intent, 2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI$b */
    public class C42439b extends C7089c0 {
        public C42439b() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105918d(HoneyPayMainUI.this.f114712d, "click add friend");
            HoneyPayMainUI.m46103I7(HoneyPayMainUI.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI$c */
    public class C42440c extends C7089c0 {
        public C42440c() {
        }

        /* renamed from: a */
        public void mo2066a(View view) {
            Log.m105924i(HoneyPayMainUI.this.f114712d, "click empty header add friend");
            if (HoneyPayMainUI.this.f114856p.getVisibility() != 0) {
                HoneyPayMainUI.m46103I7(HoneyPayMainUI.this);
            } else if (HoneyPayMainUI.this.f114857q.isChecked()) {
                HoneyPayMainUI.m46103I7(HoneyPayMainUI.this);
            } else {
                int dimensionPixelOffset = HoneyPayMainUI.this.getResources().getDimensionPixelOffset(C0966R.dimen.f3766df);
                float f = (float) (-dimensionPixelOffset);
                ObjectAnimator duration = ObjectAnimator.ofFloat(HoneyPayMainUI.this.f114856p, "translationX", new float[]{0.0f, f, (float) dimensionPixelOffset, f, 0.0f}).setDuration(300);
                duration.setInterpolator(new LinearInterpolator());
                duration.start();
                HoneyPayMainUI honeyPayMainUI = HoneyPayMainUI.this;
                honeyPayMainUI.f114852i.announceForAccessibility(honeyPayMainUI.getString(C0966R.string.fk9, new Object[]{honeyPayMainUI.f114859s}));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI$d */
    public class C42441d implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47742f f114865a;

        public C42441d(C47742f fVar) {
            this.f114865a = fVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            HoneyPayMainUI honeyPayMainUI = HoneyPayMainUI.this;
            Iterator<HoneyPayCardLayout> it = honeyPayMainUI.f114858r.iterator();
            while (it.hasNext()) {
                honeyPayMainUI.f114853j.removeView(it.next());
            }
            honeyPayMainUI.f114858r.clear();
            HoneyPayMainUI.this.removeAllOptionMenu();
            if (this.f114865a.f128257r.f139162o) {
                HoneyPayMainUI.this.f114860t = true;
                C115669n.INSTANCE.mo160131h(24522, 1, 1);
            } else {
                HoneyPayMainUI.this.f114860t = false;
            }
            LinkedList<C50826pg2> linkedList = this.f114865a.f128257r.f139156f;
            if (linkedList == null || linkedList.isEmpty()) {
                Log.m105924i(HoneyPayMainUI.this.f114712d, "empty card");
                HoneyPayMainUI honeyPayMainUI2 = HoneyPayMainUI.this;
                C50248ld3 ld32 = this.f114865a.f128257r.f139157g;
                honeyPayMainUI2.f114851h.setVisibility(0);
                C4600f fVar = (C4600f) honeyPayMainUI2.component(C4600f.class);
                fVar.getClass();
                C119179t tVar = C119157j.f356862d;
                C4605b bVar = new C4605b(fVar);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(bVar, 300, false);
                if (ld32 == null || Util.isNullOrNil(ld32.f137315d)) {
                    Log.m105928w(honeyPayMainUI2.f114712d, "empty help word!");
                    honeyPayMainUI2.f114854n.setVisibility(8);
                } else {
                    C75228t.m90240d(honeyPayMainUI2.f114854n);
                    honeyPayMainUI2.f114854n.setClickable(true);
                    honeyPayMainUI2.f114854n.setOnTouchListener(new C75355a0(honeyPayMainUI2));
                    C72476y0 y0Var = new C72476y0(7, (C72476y0.C72477a) new C52410j(honeyPayMainUI2, ld32));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ld32.f137315d);
                    spannableStringBuilder.setSpan(y0Var, 0, spannableStringBuilder.length(), 18);
                    honeyPayMainUI2.f114854n.setText(spannableStringBuilder);
                }
                HoneyPayMainUI honeyPayMainUI3 = HoneyPayMainUI.this;
                C50678og2 og22 = this.f114865a.f128257r;
                honeyPayMainUI3.getClass();
                if (og22.f139162o) {
                    honeyPayMainUI3.f114856p.setVisibility(0);
                    honeyPayMainUI3.f114854n.setVisibility(8);
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) honeyPayMainUI3.f114852i.getLayoutParams();
                    layoutParams.bottomMargin = C76577a.m92151b(honeyPayMainUI3, 96);
                    honeyPayMainUI3.f114852i.setLayoutParams(layoutParams);
                    String str2 = honeyPayMainUI3.f114712d;
                    C50399mg2 mg22 = og22.f139163p;
                    Log.m105919d(str2, "text:%s desc:%s url:%s", mg22.f138021d, mg22.f138022e, mg22.f138023f);
                    if (!Util.isNullOrNil(og22.f139163p.f138021d)) {
                        C50399mg2 mg23 = og22.f139163p;
                        honeyPayMainUI3.f114859s = mg23.f138022e;
                        StringBuilder sb = new StringBuilder(mg23.f138021d);
                        int length = sb.length();
                        sb.append(og22.f139163p.f138022e);
                        honeyPayMainUI3.f114855o.setText(sb.toString());
                        if (!Util.isNullOrNil(og22.f139163p.f138022e)) {
                            C75228t.m90253j0(honeyPayMainUI3.f114855o, sb.toString(), length, sb.length(), new C7092q((C7092q.C7093a) new C52411k(honeyPayMainUI3, og22), true), honeyPayMainUI3);
                        }
                    }
                } else {
                    honeyPayMainUI3.f114856p.setVisibility(8);
                    honeyPayMainUI3.f114854n.setVisibility(0);
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) honeyPayMainUI3.f114852i.getLayoutParams();
                    layoutParams2.bottomMargin = C76577a.m92151b(honeyPayMainUI3, 64);
                    honeyPayMainUI3.f114852i.setLayoutParams(layoutParams2);
                }
                HoneyPayMainUI.this.f114849f.setVisibility(8);
                HoneyPayMainUI honeyPayMainUI4 = HoneyPayMainUI.this;
                honeyPayMainUI4.f114713e = C0966R.color.al6;
                honeyPayMainUI4.setMMTitle("");
            } else {
                HoneyPayMainUI.this.f114851h.setVisibility(8);
                HoneyPayMainUI honeyPayMainUI5 = HoneyPayMainUI.this;
                LinkedList<C50826pg2> linkedList2 = this.f114865a.f128257r.f139156f;
                honeyPayMainUI5.getClass();
                int i3 = 1;
                for (C50826pg2 next : linkedList2) {
                    HoneyPayCardLayout honeyPayCardLayout = new HoneyPayCardLayout(honeyPayMainUI5);
                    honeyPayCardLayout.setCardRecord(next);
                    honeyPayCardLayout.setOnClickListener(new C52412l(honeyPayMainUI5, next));
                    honeyPayMainUI5.f114853j.addView(honeyPayCardLayout, i3);
                    honeyPayMainUI5.f114858r.add(honeyPayCardLayout);
                    if (i3 == 1) {
                        honeyPayCardLayout.sendAccessibilityEvent(8);
                    }
                    i3++;
                }
                Log.m105925i(HoneyPayMainUI.this.f114712d, "show open card: %s", Boolean.valueOf(this.f114865a.f128257r.f139159i));
                if (this.f114865a.f128257r.f139159i) {
                    HoneyPayMainUI.this.f114849f.setVisibility(0);
                } else {
                    HoneyPayMainUI.this.f114849f.setVisibility(8);
                }
                HoneyPayMainUI honeyPayMainUI6 = HoneyPayMainUI.this;
                honeyPayMainUI6.f114713e = C0966R.color.f3565xw;
                honeyPayMainUI6.setMMTitle((int) C0966R.string.fkm);
            }
            HoneyPayMainUI honeyPayMainUI7 = HoneyPayMainUI.this;
            C77933g43 g432 = this.f114865a.f128257r.f139161n;
            if (g432 != null) {
                WcPayBannerView wcPayBannerView = (WcPayBannerView) honeyPayMainUI7.findViewById(C0966R.C0970id.lkt);
                wcPayBannerView.setBannerData(g432);
                wcPayBannerView.setBgColor(honeyPayMainUI7.getResources().getColor(C0966R.color.f2960ag));
                wcPayBannerView.setTextColor(honeyPayMainUI7.getResources().getColor(C0966R.color.f2975b6));
            } else {
                honeyPayMainUI7.getClass();
            }
            HoneyPayMainUI.this.mo66493H7();
            HoneyPayMainUI.this.findViewById(C0966R.C0970id.f05).setBackgroundResource(HoneyPayMainUI.this.f114713e);
            C48527c.m53912h(HoneyPayMainUI.this, this.f114865a.f128257r.f139158h, (String) null, 0, (eh4) null);
            View findViewById = HoneyPayMainUI.this.findViewById(C0966R.C0970id.ezu);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C115669n.INSTANCE.mo175913w(875, 0, 1);
        }
    }

    /* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI$e */
    public class C42442e implements C75113f0.C75114a {

        /* renamed from: a */
        public final /* synthetic */ C47737a f114867a;

        public C42442e(C47737a aVar) {
            this.f114867a = aVar;
        }

        /* renamed from: a */
        public void mo66496a(int i, int i2, String str, C117747y yVar) {
            C52016xt xtVar = this.f114867a.f128251r;
            if (xtVar.f144932f != null) {
                Log.m105924i(HoneyPayMainUI.this.f114712d, "do realname guide");
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayMainUI");
                C48527c.m53913i(HoneyPayMainUI.this, bundle, this.f114867a.f128251r.f144932f, true);
                return;
            }
            HoneyPayMainUI honeyPayMainUI = HoneyPayMainUI.this;
            LinkedList<C51687ve2> linkedList = xtVar.f144933g;
            int i3 = HoneyPayMainUI.f114848u;
            honeyPayMainUI.getClass();
            ArrayList arrayList = new ArrayList();
            if (linkedList != null && !linkedList.isEmpty()) {
                for (C51687ve2 honeyPayCardType : linkedList) {
                    arrayList.add(new HoneyPayCardType(honeyPayCardType));
                }
            }
            Intent intent = new Intent(honeyPayMainUI, HoneyPaySelectCardTypeUI.class);
            intent.putParcelableArrayListExtra("key_card_type_list", arrayList);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            HoneyPayMainUI honeyPayMainUI2 = honeyPayMainUI;
            C117292a.m165358d(honeyPayMainUI2, aVar.mo10232b(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI", "gotoSelectCardTypeUI", "(Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            honeyPayMainUI.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(honeyPayMainUI2, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI", "gotoSelectCardTypeUI", "(Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    /* renamed from: I7 */
    public static void m46103I7(HoneyPayMainUI honeyPayMainUI) {
        Log.m105924i(honeyPayMainUI.f114712d, "do check payer");
        C47737a aVar = new C47737a();
        aVar.mo104821m1(honeyPayMainUI);
        honeyPayMainUI.doSceneProgress(aVar, true);
    }

    /* renamed from: J7 */
    public final void mo66527J7(String str, boolean z, String str2) {
        Log.m105925i(this.f114712d, "go to card manager: %s", str);
        Intent intent = new Intent(this, HoneyPayCardManagerUI.class);
        intent.putExtra("key_card_no", str);
        intent.putExtra("key_scene", 0);
        intent.putExtra("key_is_create", z);
        intent.putExtra("key_card_type", str2);
        startActivityForResult(intent, 3);
    }

    /* renamed from: K7 */
    public final void mo66528K7(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("key_create_succ", false);
        String stringExtra = intent.getStringExtra("key_card_no");
        String stringExtra2 = intent.getStringExtra("key_card_type");
        Log.m105925i(this.f114712d, "create succ: %s", Boolean.valueOf(booleanExtra));
        if (booleanExtra) {
            mo66527J7(stringExtra, true, stringExtra2);
            if (this.f114860t) {
                C115669n.INSTANCE.mo160131h(24522, 1, 2);
            }
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.azn;
    }

    public void initView() {
        this.f114853j = (LinearLayout) findViewById(C0966R.C0970id.ezo);
        this.f114851h = (RelativeLayout) findViewById(C0966R.C0970id.ezy);
        this.f114850g = (ImageView) findViewById(C0966R.C0970id.ezx);
        Button button = (Button) findViewById(C0966R.C0970id.ezv);
        this.f114852i = button;
        C85875k4.m106189j0(button.getPaint(), 0.8f);
        TextView textView = (TextView) findViewById(C0966R.C0970id.ezz);
        this.f114854n = textView;
        if (textView != null) {
            C75228t.m90240d(textView);
        }
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.f358418f03);
        if (textView2 != null) {
            C75228t.m90240d(textView2);
        }
        this.f114856p = (LinearLayout) findViewById(C0966R.C0970id.ezs);
        this.f114857q = (CheckBox) findViewById(C0966R.C0970id.ezr);
        this.f114855o = (TextView) findViewById(C0966R.C0970id.ezt);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.ezp);
        this.f114849f = linearLayout;
        linearLayout.setOnClickListener(new C42439b());
        this.f114852i.setOnClickListener(new C42440c());
        if (C85875k4.m106211z()) {
            this.f114850g.setImageResource(C0966R.raw.honey_pay_input_logo_dm);
            this.f114857q.setBackgroundResource(C0966R.C0969drawable.a99);
            return;
        }
        this.f114850g.setImageResource(C0966R.raw.honey_pay_input_logo);
        this.f114857q.setBackgroundResource(C0966R.C0969drawable.a98);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 3) {
            Log.m105924i(this.f114712d, "get payer list");
            C47742f fVar = new C47742f();
            fVar.mo104821m1(this);
            doSceneProgress(fVar, false);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        fixStatusbar(true);
        super.onCreate(bundle);
        addSceneEndListener(2725);
        addSceneEndListener(2618);
        addSceneEndListener(2926);
        mo66528K7(getIntent());
        initView();
        Log.m105924i(this.f114712d, "get payer list");
        C47742f fVar = new C47742f();
        fVar.mo104821m1(this);
        doSceneProgress(fVar, true);
        setMMTitle("");
    }

    public void onDestroy() {
        super.onDestroy();
        removeSceneEndListener(2725);
        removeSceneEndListener(2618);
        removeSceneEndListener(2926);
        if (this.f114860t) {
            C115669n.INSTANCE.mo160131h(24522, 1, 3);
        }
    }

    public void onNewIntent(Intent intent) {
        Log.m105924i(this.f114712d, "on new intent");
        mo66528K7(intent);
        super.onNewIntent(intent);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C47742f) {
            C47742f fVar = (C47742f) yVar;
            fVar.mo104823q1(new C42441d(fVar));
            if (fVar.f221040j) {
                C115669n.INSTANCE.mo175913w(875, 1, 1);
            }
            if (fVar.f221039i) {
                C115669n.INSTANCE.mo175913w(875, 1, 1);
            }
        } else if (yVar instanceof C47737a) {
            C47737a aVar = (C47737a) yVar;
            aVar.mo104823q1(new C42442e(aVar));
            if (aVar.f221040j && aVar.f128251r.f144932f != null) {
                Log.m105924i(this.f114712d, "do realname guide");
                Bundle bundle = new Bundle();
                bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayMainUI");
                C48527c.m53913i(this, bundle, aVar.f128251r.f144932f, true);
            }
        } else if (yVar instanceof C47738b) {
            C47738b bVar = (C47738b) yVar;
            bVar.mo104823q1(new C42438a(bVar));
        }
        return true;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C4600f.class);
    }
}
