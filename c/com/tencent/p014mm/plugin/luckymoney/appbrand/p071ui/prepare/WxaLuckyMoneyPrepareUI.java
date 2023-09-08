package com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.prepare;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C30870z1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.WxaLuckyMoneyBaseUI;
import com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.WxaLuckyMoneyMoneyInputView;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69631l1;
import com.tencent.p014mm.plugin.luckymoney.p073ui.C69727y2;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyNumInputView;
import com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyTextInputView;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72478z;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.MMScrollView;
import com.tenpay.android.wechat.MyKeyboardWindow;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import k32.C76490i;
import k32.C9559h;
import n32.C76816a;
import n32.C76818c;
import n32.C76819d;
import n32.C76820e;
import n32.C76821f;
import n32.C76822g;
import n32.C76823h;
import n32.C76824i;
import n32.C76825j;
import n32.C76827k;
import n32.C76828l;
import nj3.C76912y0;
import nj3.C88989a;
import te3.C51013qt3;

@C88989a(19)
/* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI */
public class WxaLuckyMoneyPrepareUI extends WxaLuckyMoneyBaseUI implements C76818c, C69727y2 {

    /* renamed from: z */
    public static final String f198811z = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fls) + "/touch/scene_product.html?scene_id=kf7");

    /* renamed from: h */
    public C76816a f198812h = null;

    /* renamed from: i */
    public C76490i f198813i = C76490i.RANDOM_LUCK;

    /* renamed from: j */
    public LuckyMoneyNumInputView f198814j = null;

    /* renamed from: n */
    public WxaLuckyMoneyMoneyInputView f198815n = null;

    /* renamed from: o */
    public LuckyMoneyTextInputView f198816o = null;

    /* renamed from: p */
    public TextView f198817p = null;

    /* renamed from: q */
    public Button f198818q = null;

    /* renamed from: r */
    public MyKeyboardWindow f198819r;

    /* renamed from: s */
    public LinearLayout f198820s;

    /* renamed from: t */
    public View f198821t;

    /* renamed from: u */
    public TextView f198822u;

    /* renamed from: v */
    public TextView f198823v;

    /* renamed from: w */
    public MMScrollView f198824w;

    /* renamed from: x */
    public int f198825x = 0;

    /* renamed from: y */
    public C69631l1 f198826y = new C69631l1();

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI$a */
    public class C69131a implements View.OnFocusChangeListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f198827d;

        /* renamed from: e */
        public final /* synthetic */ int f198828e;

        /* renamed from: f */
        public final /* synthetic */ EditText f198829f;

        /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI$a$a */
        public class C69132a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ View f198831d;

            public C69132a(View view) {
                this.f198831d = view;
            }

            public void run() {
                if (!WxaLuckyMoneyPrepareUI.this.f198821t.isShown() && this.f198831d.isShown()) {
                    View view = WxaLuckyMoneyPrepareUI.this.f198821t;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$14$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$14$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C69131a aVar2 = C69131a.this;
                WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = WxaLuckyMoneyPrepareUI.this;
                wxaLuckyMoneyPrepareUI.f198819r.setXMode(aVar2.f198828e);
                WxaLuckyMoneyPrepareUI.this.f198819r.setInputEditText((EditText) this.f198831d);
                ((InputMethodManager) WxaLuckyMoneyPrepareUI.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f198831d.getWindowToken(), 0);
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI$a$b */
        public class C69133b implements Runnable {
            public C69133b() {
            }

            public void run() {
                WxaLuckyMoneyPrepareUI.this.hideTenpayKB();
                ((InputMethodManager) WxaLuckyMoneyPrepareUI.this.getContext().getSystemService("input_method")).showSoftInput(C69131a.this.f198829f, 0);
            }
        }

        public C69131a(boolean z, int i, EditText editText) {
            this.f198827d = z;
            this.f198828e = i;
            this.f198829f = editText;
        }

        public void onFocusChange(View view, boolean z) {
            if (!view.isFocused() || this.f198827d) {
                new MMHandler().postDelayed(new C69133b(), 200);
                return;
            }
            ((InputMethodManager) WxaLuckyMoneyPrepareUI.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new MMHandler().postDelayed(new C69132a(view), 300);
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI$b */
    public class C69134b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f198834d;

        /* renamed from: e */
        public final /* synthetic */ int f198835e;

        /* renamed from: f */
        public final /* synthetic */ EditText f198836f;

        public C69134b(boolean z, int i, EditText editText) {
            this.f198834d = z;
            this.f198835e = i;
            this.f198836f = editText;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!WxaLuckyMoneyPrepareUI.this.f198821t.isShown() && !this.f198834d) {
                View view2 = WxaLuckyMoneyPrepareUI.this.f198821t;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                WxaLuckyMoneyPrepareUI.this.f198819r.setInputEditText((EditText) view);
                WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = WxaLuckyMoneyPrepareUI.this;
                wxaLuckyMoneyPrepareUI.f198819r.setXMode(this.f198835e);
            } else if (this.f198834d) {
                View view4 = WxaLuckyMoneyPrepareUI.this.f198821t;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view5 = view4;
                C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view5, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$15", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((InputMethodManager) WxaLuckyMoneyPrepareUI.this.getContext().getSystemService("input_method")).showSoftInput(this.f198836f, 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI$c */
    public class C69135c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ boolean f198838d;

        /* renamed from: e */
        public final /* synthetic */ EditText f198839e;

        /* renamed from: f */
        public final /* synthetic */ View f198840f;

        /* renamed from: g */
        public final /* synthetic */ int f198841g;

        /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI$c$a */
        public class C69136a implements Runnable {
            public C69136a() {
            }

            public void run() {
                View view = WxaLuckyMoneyPrepareUI.this.f198821t;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C69135c.this.f198840f.requestFocus();
                C69135c cVar = C69135c.this;
                MyKeyboardWindow myKeyboardWindow = WxaLuckyMoneyPrepareUI.this.f198819r;
                if (myKeyboardWindow != null) {
                    myKeyboardWindow.setInputEditText(cVar.f198839e);
                }
                C69135c cVar2 = C69135c.this;
                WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = WxaLuckyMoneyPrepareUI.this;
                wxaLuckyMoneyPrepareUI.f198819r.setXMode(cVar2.f198841g);
            }
        }

        public C69135c(boolean z, EditText editText, View view, int i) {
            this.f198838d = z;
            this.f198839e = editText;
            this.f198840f = view;
            this.f198841g = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (WxaLuckyMoneyPrepareUI.this.f198821t.isShown() && !this.f198838d) {
                MyKeyboardWindow myKeyboardWindow = WxaLuckyMoneyPrepareUI.this.f198819r;
                if (myKeyboardWindow != null) {
                    myKeyboardWindow.setInputEditText(this.f198839e);
                }
            } else if (!WxaLuckyMoneyPrepareUI.this.f198821t.isShown() && !this.f198838d) {
                ((InputMethodManager) WxaLuckyMoneyPrepareUI.this.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
                new MMHandler().postDelayed(new C69136a(), 200);
            } else if (this.f198838d) {
                View view2 = WxaLuckyMoneyPrepareUI.this.f198821t;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((InputMethodManager) WxaLuckyMoneyPrepareUI.this.getContext().getSystemService("input_method")).showSoftInput(this.f198839e, 0);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI$d */
    public class C69137d implements View.OnClickListener {
        public C69137d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WxaLuckyMoneyPrepareUI.this.hideTenpayKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI$e */
    public class C69138e implements MenuItem.OnMenuItemClickListener {
        public C69138e() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WxaLuckyMoneyPrepareUI.this.setResult(0, new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}"));
            WxaLuckyMoneyPrepareUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI$f */
    public class C69139f extends C30870z1 {

        /* renamed from: e */
        public final /* synthetic */ String f198846e;

        public C69139f(String str) {
            this.f198846e = str;
        }

        /* renamed from: a */
        public void mo57772a(View view) {
            WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI = WxaLuckyMoneyPrepareUI.this;
            if (wxaLuckyMoneyPrepareUI.f198812h == null) {
                Log.m105920e("MicroMsg.WxaLuckyMoneyPrepareUI", "Click PrepareBtn but, mLogic == null");
            } else if (wxaLuckyMoneyPrepareUI.f198815n.mo5753c() != 0) {
                C76912y0.makeText((Context) WxaLuckyMoneyPrepareUI.this.getContext(), (int) C0966R.string.kmc, 0).show();
            } else {
                int input = WxaLuckyMoneyPrepareUI.this.f198814j.getInput();
                double input2 = WxaLuckyMoneyPrepareUI.this.f198815n.getInput();
                String input3 = WxaLuckyMoneyPrepareUI.this.f198816o.getInput();
                if (Util.isNullOrNil(input3)) {
                    input3 = !Util.isNullOrNil(this.f198846e) ? this.f198846e : WxaLuckyMoneyPrepareUI.this.getString(C0966R.string.gf7);
                }
                WxaLuckyMoneyPrepareUI wxaLuckyMoneyPrepareUI2 = WxaLuckyMoneyPrepareUI.this;
                C76490i iVar = wxaLuckyMoneyPrepareUI2.f198813i;
                if (iVar == C76490i.RANDOM_LUCK) {
                    C76816a aVar = wxaLuckyMoneyPrepareUI2.f198812h;
                    int r0 = (int) C75228t.m90269r0(input2);
                    int i = WxaLuckyMoneyPrepareUI.this.f198825x;
                    C76828l lVar = (C76828l) aVar;
                    lVar.getClass();
                    Log.m105924i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareRandomLuckyMoney() called with: moneyTotalAmount = [" + r0 + "], packageAmount = [" + input + "], wishing = [" + input3 + "], scope = [" + i + "]");
                    if (lVar.f224645d != null) {
                        C51013qt3 qt32 = new C51013qt3();
                        qt32.f140548d = lVar.f224646e;
                        qt32.f140549e = 1;
                        qt32.f140550f = input;
                        qt32.f140551g = (long) r0;
                        qt32.f140553i = input3;
                        qt32.f140554j = i;
                        lVar.mo107097b(qt32);
                    }
                } else if (iVar == C76490i.FIX_NORMAL) {
                    C76816a aVar2 = wxaLuckyMoneyPrepareUI2.f198812h;
                    int r05 = (int) C75228t.m90269r0(input2);
                    int i2 = WxaLuckyMoneyPrepareUI.this.f198825x;
                    C76828l lVar2 = (C76828l) aVar2;
                    lVar2.getClass();
                    Log.m105924i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareFixLuckyMoney() called with: packageMoneyAmount = [" + r05 + "], packageAmount = [" + input + "], wishing = [" + input3 + "], scope = [" + i2 + "]");
                    if (lVar2.f224645d != null) {
                        C51013qt3 qt33 = new C51013qt3();
                        qt33.f140548d = lVar2.f224646e;
                        qt33.f140549e = 0;
                        qt33.f140550f = input;
                        qt33.f140552h = r05;
                        qt33.f140553i = input3;
                        qt33.f140554j = i2;
                        lVar2.mo107097b(qt33);
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI$g */
    public class C69140g implements View.OnTouchListener {
        public C69140g() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                WxaLuckyMoneyPrepareUI.this.hideTenpayKB();
                WxaLuckyMoneyPrepareUI.this.hideVKB();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI$4", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI$h */
    public class C69141h implements MenuItem.OnMenuItemClickListener {
        public C69141h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C75228t.m90219L(WxaLuckyMoneyPrepareUI.this.getContext(), WxaLuckyMoneyPrepareUI.f198811z, false);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01d4  */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo95263Q(boolean r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            k32.i r1 = k32.C76490i.FIX_NORMAL
            com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView r2 = r0.f198815n
            int r2 = r2.mo5753c()
            r3 = 3
            r4 = 0
            if (r2 == r3) goto L_0x003f
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r2 = r0.f198814j
            int r2 = r2.mo5753c()
            if (r2 == r3) goto L_0x003f
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r2 = r0.f198814j
            int r2 = r2.getInput()
            com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView r3 = r0.f198815n
            double r6 = r3.getInput()
            k32.i r3 = r0.f198813i
            if (r3 != r1) goto L_0x0031
            double r2 = (double) r2
            double r6 = r6 * r2
            com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView r2 = r0.f198815n
            double r2 = r2.getInput()
            goto L_0x0041
        L_0x0031:
            if (r2 <= 0) goto L_0x003d
            com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView r3 = r0.f198815n
            double r8 = r3.getInput()
            double r2 = (double) r2
            double r2 = r8 / r2
            goto L_0x0041
        L_0x003d:
            r2 = r4
            goto L_0x0041
        L_0x003f:
            r2 = r4
            r6 = r2
        L_0x0041:
            com.tencent.mm.plugin.luckymoney.ui.l1 r8 = r0.f198826y
            r9 = r20
            r10 = r21
            boolean r8 = r8.mo95866a(r10, r9)
            k32.h r9 = k32.C9559h.GLOBAL
            java.lang.String r10 = "MicroMsg.WxaLuckyMoneyPrepareUI"
            r11 = 0
            if (r8 == 0) goto L_0x0065
            java.lang.String r1 = "has error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            android.widget.Button r1 = r0.f198818q
            r1.setClickable(r11)
            android.widget.Button r1 = r0.f198818q
            r1.setEnabled(r11)
            r17 = r6
            goto L_0x01de
        L_0x0065:
            r8 = 1
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 == 0) goto L_0x00a9
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r12 != 0) goto L_0x006f
            goto L_0x00a9
        L_0x006f:
            r9.getClass()
            r4 = 4656510908468559872(0x409f400000000000, double:2000.0)
            r13 = 2
            java.lang.String r14 = ""
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 <= 0) goto L_0x00ad
            com.tencent.mm.plugin.luckymoney.ui.l1 r1 = r0.f198826y
            r2 = 2131832550(0x7f112ee6, float:1.9298157E38)
            java.lang.Object[] r3 = new java.lang.Object[r13]
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            long r4 = java.lang.Math.round(r4)
            r10.append(r4)
            r10.append(r14)
            java.lang.String r4 = r10.toString()
            r3[r11] = r4
            java.lang.String r4 = r9.f29782d
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r4, (java.lang.String) r14)
            r3[r8] = r4
            java.lang.String r2 = r0.getString(r2, r3)
            r1.mo95869d(r2)
        L_0x00a9:
            r17 = r6
            goto L_0x01c6
        L_0x00ad:
            if (r12 <= 0) goto L_0x01c2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "perAmount "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r4)
            k32.i r4 = r0.f198813i
            r15 = 4641240890982006784(0x4069000000000000, double:200.0)
            if (r4 != r1) goto L_0x00fe
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x00fb
            com.tencent.mm.plugin.luckymoney.ui.l1 r4 = r0.f198826y
            java.lang.Object[] r12 = new java.lang.Object[r13]
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r17 = r6
            long r5 = java.lang.Math.round(r15)
            r13.append(r5)
            r13.append(r14)
            java.lang.String r5 = r13.toString()
            r12[r11] = r5
            java.lang.String r5 = r9.f29782d
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r14)
            r12[r8] = r5
            r5 = 2131832485(0x7f112ea5, float:1.9298025E38)
            java.lang.String r5 = r0.getString(r5, r12)
            r4.mo95869d(r5)
            goto L_0x013a
        L_0x00fb:
            r17 = r6
            goto L_0x013c
        L_0x00fe:
            r17 = r6
            int r4 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x013c
            com.tencent.mm.plugin.luckymoney.ui.l1 r4 = r0.f198826y
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            long r12 = java.lang.Math.round(r15)
            r5.append(r12)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            r6[r11] = r5
            java.lang.String r5 = r9.f29782d
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r5, (java.lang.String) r14)
            r6[r8] = r5
            r5 = 2131832485(0x7f112ea5, float:1.9298025E38)
            java.lang.String r5 = r0.getString(r5, r6)
            r4.mo95869d(r5)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r4 = r0.f198814j
            r4.mo5751a()
            com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView r4 = r0.f198815n
            r4.mo5751a()
        L_0x013a:
            r4 = 1
            goto L_0x013d
        L_0x013c:
            r4 = 0
        L_0x013d:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "furtherCheckHasErr:"
            r5.append(r6)
            r5.append(r4)
            java.lang.String r7 = " for max value"
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r5)
            if (r4 != 0) goto L_0x01aa
            k32.i r5 = r0.f198813i
            r7 = 2131832487(0x7f112ea7, float:1.929803E38)
            r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            if (r5 != r1) goto L_0x0183
            int r1 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x01aa
            com.tencent.mm.plugin.luckymoney.ui.l1 r1 = r0.f198826y
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r12)
            r2[r11] = r3
            java.lang.String r3 = r9.f29782d
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r14)
            r2[r8] = r3
            java.lang.String r2 = r0.getString(r7, r2)
            r1.mo95869d(r2)
            goto L_0x01a9
        L_0x0183:
            int r1 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r1 >= 0) goto L_0x01aa
            com.tencent.mm.plugin.luckymoney.ui.l1 r1 = r0.f198826y
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "0.01"
            r2[r11] = r3
            java.lang.String r3 = r9.f29782d
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r3, (java.lang.String) r14)
            r2[r8] = r3
            java.lang.String r2 = r0.getString(r7, r2)
            r1.mo95869d(r2)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView r1 = r0.f198814j
            r1.mo5751a()
            com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyMoneyInputView r1 = r0.f198815n
            r1.mo5751a()
        L_0x01a9:
            r4 = 1
        L_0x01aa:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            r1.append(r4)
            java.lang.String r2 = " for min value"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            goto L_0x01c7
        L_0x01c2:
            r17 = r6
            r4 = 0
            goto L_0x01c7
        L_0x01c6:
            r4 = 1
        L_0x01c7:
            if (r4 == 0) goto L_0x01d4
            android.widget.Button r1 = r0.f198818q
            r1.setClickable(r11)
            android.widget.Button r1 = r0.f198818q
            r1.setEnabled(r11)
            goto L_0x01de
        L_0x01d4:
            android.widget.Button r1 = r0.f198818q
            r1.setClickable(r8)
            android.widget.Button r1 = r0.f198818q
            r1.setEnabled(r8)
        L_0x01de:
            r9.getClass()
            java.lang.String r1 = "¥"
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r2 == 0) goto L_0x01f4
            android.widget.TextView r1 = r0.f198817p
            java.lang.String r2 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90256l(r17)
            r1.setText(r2)
            goto L_0x020c
        L_0x01f4:
            android.widget.TextView r2 = r0.f198817p
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = com.tencent.p014mm.wallet_core.p137ui.C75228t.m90260n(r17)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.setText(r1)
        L_0x020c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.appbrand.p071ui.prepare.WxaLuckyMoneyPrepareUI.mo95263Q(boolean, int):void");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360076cj2;
    }

    public void hideTenpayKB() {
        View view = this.f198821t;
        if (view != null && view.isShown()) {
            View view2 = this.f198821t;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void initView() {
        setBackBtn(new C69138e());
        LuckyMoneyTextInputView luckyMoneyTextInputView = (LuckyMoneyTextInputView) findViewById(C0966R.C0970id.gjm);
        this.f198816o = luckyMoneyTextInputView;
        luckyMoneyTextInputView.setHintText(getString(C0966R.string.gf7));
        String stringExtra = getIntent().getStringExtra("defaultWishingWord");
        Log.m105925i("MicroMsg.WxaLuckyMoneyPrepareUI", "initView defaultWishingWord = %s", stringExtra);
        if (!Util.isNullOrNil(stringExtra)) {
            this.f198816o.setHintText(stringExtra);
        }
        this.f198818q = (Button) findViewById(C0966R.C0970id.ghm);
        this.f198819r = (MyKeyboardWindow) findViewById(C0966R.C0970id.f359361kh3);
        this.f198821t = findViewById(C0966R.C0970id.f359359kh1);
        this.f198822u = (TextView) findViewById(C0966R.C0970id.ghk);
        this.f198814j = (LuckyMoneyNumInputView) findViewById(C0966R.C0970id.ghg);
        this.f198815n = (WxaLuckyMoneyMoneyInputView) findViewById(C0966R.C0970id.gbq);
        this.f198817p = (TextView) findViewById(C0966R.C0970id.f358690gi0);
        this.f198824w = (MMScrollView) findViewById(C0966R.C0970id.gj4);
        TextView textView = (TextView) findViewById(C0966R.C0970id.ghr);
        this.f198820s = (LinearLayout) findViewById(C0966R.C0970id.f358692gi2);
        this.f198823v = (TextView) findViewById(C0966R.C0970id.f358693gi3);
        setMMTitle((int) C0966R.string.gjl);
        C76490i iVar = this.f198813i;
        C76490i iVar2 = C76490i.RANDOM_LUCK;
        if (iVar == iVar2) {
            this.f198815n.setTitle(getString(C0966R.string.gjp));
            this.f198815n.setShowGroupIcon(true);
        } else {
            this.f198815n.setTitle(getString(C0966R.string.gjq));
            this.f198815n.setShowGroupIcon(false);
        }
        this.f198815n.setOnInputValidChangerListener(this);
        this.f198815n.setHint(getString(C0966R.string.ghc));
        this.f198814j.setOnInputValidChangerListener(this);
        this.f198814j.setHint(getString(C0966R.string.ghs));
        this.f198814j.setNum("");
        this.f198816o.setOnInputValidChangerListener(this);
        EditText editText = (EditText) this.f198815n.findViewById(C0966R.C0970id.geq);
        EditText editText2 = (EditText) this.f198814j.findViewById(C0966R.C0970id.geq);
        C75228t.m90251i0(editText);
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText, 0);
        editText.addTextChangedListener(new C76827k(this));
        editText.setOnClickListener(new C76819d(this, editText, editText2));
        editText.requestFocus();
        TextView textView2 = (TextView) this.f198815n.findViewById(C0966R.C0970id.gbs);
        if (textView2 != null) {
            textView2.setOnClickListener(new C76820e(this, editText, editText2));
        }
        C75228t.m90251i0(editText2);
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(editText2, 0);
        editText2.setOnClickListener(new C76821f(this, editText, editText2));
        ((MMEditText) this.f198816o.findViewById(C0966R.C0970id.gj6)).setOnFocusChangeListener(new C76822g(this, editText, editText2));
        C9559h hVar = C9559h.GLOBAL;
        if (this.f198813i == iVar2) {
            WxaLuckyMoneyMoneyInputView wxaLuckyMoneyMoneyInputView = this.f198815n;
            hVar.getClass();
            wxaLuckyMoneyMoneyInputView.setMaxAmount(2000.0d);
        } else {
            WxaLuckyMoneyMoneyInputView wxaLuckyMoneyMoneyInputView2 = this.f198815n;
            hVar.getClass();
            wxaLuckyMoneyMoneyInputView2.setMaxAmount(200.0d);
        }
        WxaLuckyMoneyMoneyInputView wxaLuckyMoneyMoneyInputView3 = this.f198815n;
        hVar.getClass();
        wxaLuckyMoneyMoneyInputView3.setMinAmount(0.01d);
        this.f198814j.setMaxNum(100);
        if (this.f198813i == iVar2) {
            this.f198814j.setMinNum(1);
        } else {
            this.f198814j.setMinNum(1);
        }
        this.f198815n.setMaxLen(12);
        String string = getString(C0966R.string.gge);
        String string2 = getString(C0966R.string.ggt);
        String string3 = getString(C0966R.string.gg9);
        String string4 = getString(C0966R.string.ggu);
        C72478z zVar = new C72478z(this);
        SpannableString spannableString = new SpannableString(string + string2);
        spannableString.setSpan(zVar, string.length(), string.length() + string2.length(), 33);
        SpannableString spannableString2 = new SpannableString(string3 + string4);
        C72478z zVar2 = new C72478z(this);
        spannableString2.setSpan(zVar2, string3.length(), string3.length() + string4.length(), 33);
        zVar.f210835d = new C76823h(this, spannableString2);
        zVar2.f210835d = new C76824i(this, spannableString);
        this.f198822u.setMovementMethod(LinkMovementMethod.getInstance());
        this.f198822u.setText(spannableString);
        this.f198822u.setVisibility(0);
        this.f198818q.setClickable(false);
        this.f198818q.setEnabled(false);
        this.f198818q.setOnClickListener(new C69139f(stringExtra));
        this.f198826y.mo95868c(this.f198814j);
        this.f198826y.mo95868c(this.f198815n);
        this.f198826y.mo95868c(this.f198816o);
        TextView textView3 = (TextView) findViewById(C0966R.C0970id.gho);
        C69631l1 l1Var = this.f198826y;
        if (textView3 != null) {
            l1Var.f201004d = textView3;
        } else {
            l1Var.getClass();
        }
        MMScrollView mMScrollView = this.f198824w;
        if (mMScrollView != null) {
            mMScrollView.setOnTouchListener(new C69140g());
        }
        this.f198815n.setType(this.f198813i);
        addIconOptionMenu(0, C0966R.C0969drawable.f357261ae3, new C69141h());
        int intExtra = getIntent().getIntExtra("range", 0);
        Log.m105925i("MicroMsg.WxaLuckyMoneyPrepareUI", "initRange range = %d", Integer.valueOf(intExtra));
        this.f198820s.setVisibility(8);
        if (intExtra == 0) {
            this.f198825x = 0;
        } else if (intExtra == 1) {
            this.f198825x = 1;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(getString(C0966R.string.ln4));
            arrayList.add(getString(C0966R.string.ln5));
            this.f198820s.setVisibility(0);
            this.f198823v.setText((CharSequence) arrayList.get(this.f198825x));
            this.f198820s.setOnClickListener(new C76825j(this, arrayList));
        }
    }

    public void onBackPressed() {
        setResult(0, new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{user cancel}}"));
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C76828l lVar = new C76828l();
        this.f198812h = lVar;
        Intent intent = getIntent();
        Log.m105924i("MicroMsg.WxaPrepareLuckyMoneyLogic", "onCreate ");
        lVar.f224646e = intent.getStringExtra("appId");
        lVar.f224645d = this;
    }

    public void onDestroy() {
        super.onDestroy();
        C69631l1 l1Var = this.f198826y;
        ((LinkedList) l1Var.f201001a).clear();
        l1Var.f201004d = null;
        C76816a aVar = this.f198812h;
        if (aVar != null) {
            Log.m105924i("MicroMsg.WxaPrepareLuckyMoneyLogic", "onDestroy ");
            ((C76828l) aVar).f224645d = null;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        View view;
        if (i != 4 || (view = this.f198821t) == null || !view.isShown()) {
            return super.onKeyUp(i, keyEvent);
        }
        View view2 = this.f198821t;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/WxaLuckyMoneyPrepareUI", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    public void setEditFocusListener(View view, int i, boolean z) {
        this.f198819r = (MyKeyboardWindow) findViewById(C0966R.C0970id.f359361kh3);
        this.f198821t = findViewById(C0966R.C0970id.f359359kh1);
        View findViewById = findViewById(C0966R.C0970id.kh4);
        EditText editText = (EditText) view.findViewById(C0966R.C0970id.geq);
        if (this.f198819r != null && editText != null && this.f198821t != null) {
            C75228t.m90251i0(editText);
            editText.setOnFocusChangeListener(new C69131a(z, i, editText));
            editText.setOnClickListener(new C69134b(z, i, editText));
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.gbs);
            if (textView != null) {
                textView.setOnClickListener(new C69135c(z, editText, view, i));
            }
            findViewById.setOnClickListener(new C69137d());
        }
    }

    /* renamed from: t */
    public MMActivity mo95266t() {
        return this;
    }
}
