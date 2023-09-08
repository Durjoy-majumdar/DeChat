package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.C74965a;
import com.tencent.p014mm.p136ui.widget.InputPanelLinearLayout;
import com.tencent.p014mm.plugin.wallet_core.utils.C5810l;
import com.tencent.p014mm.pluginsdk.p133ui.wallet.WalletIconImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tencent.p014mm.wallet_core.p137ui.formview.WalletFormView;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import ke3.C88144b;
import kg3.C76577a;
import ob0.C117747y;
import p1136n3.C109678b;
import wc3.C78538u;

/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI */
public class WcPayRealnameInputAddressUI extends WalletBaseUI {

    /* renamed from: t */
    public static final /* synthetic */ int f209110t = 0;

    /* renamed from: d */
    public WalletFormView f209111d;

    /* renamed from: e */
    public WalletFormView f209112e;

    /* renamed from: f */
    public Button f209113f;

    /* renamed from: g */
    public InputPanelLinearLayout f209114g;

    /* renamed from: h */
    public int f209115h = 1;

    /* renamed from: i */
    public String f209116i;

    /* renamed from: j */
    public String f209117j;

    /* renamed from: n */
    public String f209118n;

    /* renamed from: o */
    public String f209119o;

    /* renamed from: p */
    public String f209120p;

    /* renamed from: q */
    public int f209121q;

    /* renamed from: r */
    public boolean f209122r;

    /* renamed from: s */
    public ArrayList<String> f209123s;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI$a */
    public class C72088a implements MenuItem.OnMenuItemClickListener {
        public C72088a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI = WcPayRealnameInputAddressUI.this;
            if (wcPayRealnameInputAddressUI.f209122r) {
                wcPayRealnameInputAddressUI.hideVKB();
                WcPayRealnameInputAddressUI.this.f209122r = false;
            } else {
                wcPayRealnameInputAddressUI.setResult(0);
                WcPayRealnameInputAddressUI.this.finish();
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI$b */
    public class C72089b implements View.OnClickListener {
        public C72089b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameInputAddressUI.this.hideVKB();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI$c */
    public class C72090c implements TextWatcher {
        public C72090c() {
        }

        public void afterTextChanged(Editable editable) {
            WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI = WcPayRealnameInputAddressUI.this;
            int i = WcPayRealnameInputAddressUI.f209110t;
            wcPayRealnameInputAddressUI.mo99304H7();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI$d */
    public class C72091d implements View.OnClickListener {
        public C72091d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI = WcPayRealnameInputAddressUI.this;
            int i = WcPayRealnameInputAddressUI.f209110t;
            wcPayRealnameInputAddressUI.getClass();
            Log.m105924i("MicroMsg.WcPayRealnameInputAddressUI", "go to select address ui");
            Intent intent = new Intent();
            intent.putExtra("GetAddress", true);
            intent.putExtra("ShowSelectedLocation", false);
            intent.putExtra("IsRealNameVerifyScene", true);
            intent.putExtra("IsNeedShowSearchBar", true);
            if (!wcPayRealnameInputAddressUI.f209123s.isEmpty()) {
                intent.putStringArrayListExtra("BlockedCountries", wcPayRealnameInputAddressUI.f209123s);
            }
            C88144b.m109802t(wcPayRealnameInputAddressUI.getContext(), ".ui.tools.MultiStageCitySelectUI", intent, wcPayRealnameInputAddressUI.f209115h);
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI$e */
    public class C72092e implements View.OnClickListener {
        public C72092e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WcPayRealnameInputAddressUI.this.hideVKB();
            Intent intent = new Intent();
            int i = WcPayRealnameInputAddressUI.f209110t;
            intent.putExtra("key_countrycode", WcPayRealnameInputAddressUI.this.f209116i);
            intent.putExtra("key_provincecode", WcPayRealnameInputAddressUI.this.f209117j);
            intent.putExtra("key_citycode", WcPayRealnameInputAddressUI.this.f209118n);
            intent.putExtra("key_zone", WcPayRealnameInputAddressUI.this.f209111d.getText());
            intent.putExtra("key_address", WcPayRealnameInputAddressUI.this.f209112e.getText());
            WcPayRealnameInputAddressUI.this.setResult(-1, intent);
            WcPayRealnameInputAddressUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameInputAddressUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI$f */
    public class C72093f implements C74965a.C74969d {
        public C72093f() {
        }

        /* renamed from: i0 */
        public void mo1072i0(boolean z, int i) {
            ObjectAnimator objectAnimator;
            boolean z2 = z;
            Log.m105919d("MicroMsg.WcPayRealnameInputAddressUI", "lastshow: %s, new: %s", Boolean.valueOf(WcPayRealnameInputAddressUI.this.f209122r), Boolean.valueOf(z));
            WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI = WcPayRealnameInputAddressUI.this;
            if (!wcPayRealnameInputAddressUI.f209122r && z2) {
                int height = ((WindowManager) wcPayRealnameInputAddressUI.getSystemService("window")).getDefaultDisplay().getHeight();
                int b = C76577a.m92151b(WcPayRealnameInputAddressUI.this.getContext(), 96);
                int b2 = C76577a.m92151b(WcPayRealnameInputAddressUI.this.getContext(), 40);
                int b3 = C76577a.m92151b(WcPayRealnameInputAddressUI.this.getContext(), 32);
                int b4 = C76577a.m92151b(WcPayRealnameInputAddressUI.this.getContext(), 40);
                int h = (((height - C75044y4.m89996h(WcPayRealnameInputAddressUI.this.getContext())) - C75044y4.m89991c(WcPayRealnameInputAddressUI.this.getContext())) - C78538u.m94865a(WcPayRealnameInputAddressUI.this.getContext())) - WcPayRealnameInputAddressUI.this.f209112e.getBottom();
                int i2 = ((h - b4) - i) - b2;
                Log.m105919d("MicroMsg.WcPayRealnameInputAddressUI", "marginBottomOriginPix：%s, marginBottomNewPix: %s, marginTopMinPix: %s, buttonHeightPix: %s, height: %s, offset: %s", Integer.valueOf(b), Integer.valueOf(b2), Integer.valueOf(b3), Integer.valueOf(b4), Integer.valueOf(h), Integer.valueOf(i2));
                if (i2 > b3) {
                    WcPayRealnameInputAddressUI.this.f209121q = i - (b - b2);
                } else {
                    WcPayRealnameInputAddressUI.this.f209121q = ((h - b3) - b4) - b;
                }
            }
            WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI2 = WcPayRealnameInputAddressUI.this;
            if (wcPayRealnameInputAddressUI2.f209122r == z2) {
                Log.m105918d("MicroMsg.WcPayRealnameInputAddressUI", "skip move");
            } else {
                wcPayRealnameInputAddressUI2.f209122r = z2;
                if (z2) {
                    Button button = wcPayRealnameInputAddressUI2.f209113f;
                    objectAnimator = ObjectAnimator.ofFloat(button, "translationY", new float[]{button.getTranslationY(), wcPayRealnameInputAddressUI2.f209113f.getTranslationY() - ((float) wcPayRealnameInputAddressUI2.f209121q)});
                } else {
                    Button button2 = wcPayRealnameInputAddressUI2.f209113f;
                    objectAnimator = ObjectAnimator.ofFloat(button2, "translationY", new float[]{button2.getTranslationY(), wcPayRealnameInputAddressUI2.f209113f.getTranslationY() + ((float) wcPayRealnameInputAddressUI2.f209121q)});
                }
                objectAnimator.setDuration(175);
                objectAnimator.setInterpolator(new C109678b());
                objectAnimator.start();
            }
            Log.m105925i("MicroMsg.WcPayRealnameInputAddressUI", "onInputPanelChange() isKeyboardShow:%s keyboardHeight:%s moveHeight:%s", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(WcPayRealnameInputAddressUI.this.f209121q));
        }
    }

    public WcPayRealnameInputAddressUI() {
        new Bundle();
        this.f209123s = new ArrayList<>();
    }

    /* renamed from: H7 */
    public final void mo99304H7() {
        boolean z = !Util.isNullOrNil(this.f209111d.getText());
        if (Util.isNullOrNil(this.f209112e.getText())) {
            z = false;
        }
        this.f209113f.setEnabled(z);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.chc;
    }

    public void initView() {
        this.f209111d = (WalletFormView) findViewById(C0966R.C0970id.lsr);
        this.f209112e = (WalletFormView) findViewById(C0966R.C0970id.lsn);
        this.f209113f = (Button) findViewById(C0966R.C0970id.lso);
        InputPanelLinearLayout inputPanelLinearLayout = (InputPanelLinearLayout) findViewById(C0966R.C0970id.lsp);
        this.f209114g = inputPanelLinearLayout;
        inputPanelLinearLayout.setOnClickListener(new C72089b());
        this.f209112e.getContentEt().setInputType(StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0966R.dimen.f3895i6);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0966R.dimen.f3703bv);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        layoutParams.rightMargin = dimensionPixelSize2;
        this.f209112e.getInfoIv().setLayoutParams(layoutParams);
        this.f209112e.getInfoIv().setScaleType(ImageView.ScaleType.FIT_CENTER);
        WalletIconImageView infoIv = this.f209112e.getInfoIv();
        int color = getResources().getColor(C0966R.color.FG_2);
        infoIv.f212566u = C0966R.raw.icons_filled_close2;
        infoIv.f212567v = color;
        this.f209112e.setText(this.f209120p);
        this.f209112e.mo105069a(new C72090c());
        this.f209111d.setText(this.f209119o);
        this.f209111d.setOnClickListener(new C72091d());
        this.f209113f.setOnClickListener(new C72092e());
        mo99304H7();
        this.f209114g.mo104200a(new C72093f());
        float titleMeasuredWidth = this.f209112e.getTitleMeasuredWidth();
        float titleMeasuredWidth2 = this.f209111d.getTitleMeasuredWidth();
        Log.m105919d("MicroMsg.WcPayRealnameInputAddressUI", "measured width: %s, %s", Float.valueOf(titleMeasuredWidth), Float.valueOf(titleMeasuredWidth2));
        int max = (int) (Math.max(titleMeasuredWidth, titleMeasuredWidth2) + 10.0f);
        this.f209112e.setTitleWidth(max);
        this.f209111d.setTitleWidth(max);
        C75228t.m90236b(new WalletFormView[]{this.f209112e, this.f209111d}, 10);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == this.f209115h && i2 == -1) {
            String stringExtra = intent.getStringExtra("CountryName");
            String stringExtra2 = intent.getStringExtra("ProviceName");
            String stringExtra3 = intent.getStringExtra("CityName");
            this.f209116i = intent.getStringExtra("Country");
            this.f209117j = intent.getStringExtra("Contact_Province");
            this.f209118n = intent.getStringExtra("Contact_City");
            StringBuilder sb = new StringBuilder();
            if (!Util.isNullOrNil(stringExtra)) {
                sb.append(stringExtra);
                sb.append(" ");
            }
            if (!Util.isNullOrNil(stringExtra2)) {
                sb.append(stringExtra2);
                sb.append(" ");
            }
            if (!Util.isNullOrNil(stringExtra3)) {
                sb.append(stringExtra3);
            }
            this.f209119o = sb.toString();
            this.f209111d.setText(sb.toString());
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(C0966R.color.f2932f));
        hideActionbarLine();
        setMMTitle("");
        this.f209116i = getIntent().getStringExtra("key_countrycode");
        this.f209117j = getIntent().getStringExtra("key_provincecode");
        this.f209118n = getIntent().getStringExtra("key_citycode");
        this.f209119o = getIntent().getStringExtra("key_zone");
        this.f209120p = getIntent().getStringExtra("key_address");
        String[] stringArrayExtra = getIntent().getStringArrayExtra("key_exclude_country");
        if (stringArrayExtra != null && stringArrayExtra.length > 0) {
            this.f209123s.addAll(Arrays.asList(stringArrayExtra));
            this.f209123s.remove("CN");
            this.f209123s.remove("TW");
            this.f209123s.remove("HK");
            this.f209123s.remove("MO");
        }
        initView();
        setBackBtn(new C72088a(), C0966R.raw.actionbar_icon_dark_close);
    }

    public void onPause() {
        super.onPause();
        if (this.f209122r) {
            hideVKB();
            this.f209114g.getInputPanelHelper().f220483j = false;
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C5810l.class);
    }
}
