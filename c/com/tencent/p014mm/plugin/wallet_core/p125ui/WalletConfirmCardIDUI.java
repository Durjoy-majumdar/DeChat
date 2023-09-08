package com.tencent.p014mm.plugin.wallet_core.p125ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75133p0;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import com.tenpay.android.wechat.MyKeyboardWindow;
import com.tenpay.bankcard.TenpaySegmentEditText;
import eb0.C31543z5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import ob0.C117747y;
import v53.C78358z;
import yq3.C79143a;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI */
public class WalletConfirmCardIDUI extends WalletBaseUI {

    /* renamed from: g */
    public static final /* synthetic */ int f210049g = 0;

    /* renamed from: d */
    public Button f210050d;

    /* renamed from: e */
    public TenpaySegmentEditText f210051e;

    /* renamed from: f */
    public boolean f210052f = true;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI$a */
    public class C72267a implements MenuItem.OnMenuItemClickListener {
        public C72267a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (WalletConfirmCardIDUI.this.needConfirmFinish()) {
                WalletConfirmCardIDUI.this.hideVKB();
                WalletConfirmCardIDUI.this.showDialog(1000);
                return false;
            }
            WalletConfirmCardIDUI.this.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI$b */
    public class C72268b implements View.OnClickListener {
        public C72268b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletConfirmCardIDUI walletConfirmCardIDUI = WalletConfirmCardIDUI.this;
            int i = WalletConfirmCardIDUI.f210049g;
            if (!walletConfirmCardIDUI.mKBLayout.isShown()) {
                WalletConfirmCardIDUI walletConfirmCardIDUI2 = WalletConfirmCardIDUI.this;
                if (!walletConfirmCardIDUI2.f210052f) {
                    View view2 = walletConfirmCardIDUI2.mKBLayout;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view3 = view2;
                    C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    WalletConfirmCardIDUI.this.mKeyboard.setVisibility(0);
                }
            }
            WalletConfirmCardIDUI.this.f210052f = false;
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI$c */
    public class C72269c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f210055d;

        public C72269c(String str) {
            this.f210055d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            String str = WalletConfirmCardIDUI.this.f210051e.get3DesEncrptData();
            if (str == null || !str.equals(this.f210055d)) {
                C115669n.INSTANCE.mo160131h(11353, 0, 2);
            } else {
                C115669n.INSTANCE.mo160131h(11353, 0, 1);
            }
            WalletConfirmCardIDUI walletConfirmCardIDUI = WalletConfirmCardIDUI.this;
            walletConfirmCardIDUI.getClass();
            TenpaySegmentEditText.setSalt(Long.toString(C31543z5.m39451a() / 1000));
            int i = walletConfirmCardIDUI.getInput().getInt("entry_scene", -1);
            int i2 = walletConfirmCardIDUI.getInput().getInt("real_name_verify_mode") == 4 ? 1 : 0;
            String string = walletConfirmCardIDUI.getInput().getString("kreq_token");
            if (string == null || string.isEmpty()) {
                walletConfirmCardIDUI.doSceneProgress(new C78358z(3, walletConfirmCardIDUI.getPayReqKey(), walletConfirmCardIDUI.f210051e.getEncryptDataWithHash(false), (PayInfo) walletConfirmCardIDUI.getInput().getParcelable("key_pay_info"), (String) null, -1, i, i2));
            } else {
                int i3 = walletConfirmCardIDUI.getInput().getInt("key_bind_scene");
                Log.m105920e("MicroMsg.WalletConfirmCardIDUI", "doNext has token, bind_scene:" + i3);
                walletConfirmCardIDUI.doSceneProgress(new C78358z(walletConfirmCardIDUI.getPayReqKey(), walletConfirmCardIDUI.f210051e.getEncryptDataWithHash(false), (PayInfo) walletConfirmCardIDUI.getInput().getParcelable("key_pay_info"), string, i3, i, i2));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public void finish() {
        super.finish();
        C75133p0.m90117a();
        getInput().remove("key_bankcard_cropimg");
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ced;
    }

    public void initView() {
        String string = getInput().getString("key_bankcard_id");
        String string2 = getInput().getString("key_bankcard_des");
        Bitmap bitmap = (Bitmap) getInput().getParcelable("key_bankcard_cropimg");
        if (TextUtils.isEmpty(string)) {
            Log.m105920e("MicroMsg.WalletConfirmCardIDUI", "cardID is empty");
            finish();
        } else if (bitmap == null) {
            Log.m105920e("MicroMsg.WalletConfirmCardIDUI", "cardID bitmap is null");
            finish();
        } else {
            setMMTitle((int) C0966R.string.krf);
            this.f210050d = (Button) findViewById(C0966R.C0970id.hfe);
            TenpaySegmentEditText tenpaySegmentEditText = (TenpaySegmentEditText) findViewById(C0966R.C0970id.cat);
            this.f210051e = tenpaySegmentEditText;
            tenpaySegmentEditText.setText(string, string2);
            this.mKeyboard = (MyKeyboardWindow) findViewById(C0966R.C0970id.f359361kh3);
            this.mKBLayout = findViewById(C0966R.C0970id.f359359kh1);
            ((ImageView) findViewById(C0966R.C0970id.av7)).setImageBitmap(bitmap);
            this.f210051e.setKeyboard(this.mKeyboard);
            this.mKeyboard.setXMode(0);
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f210051e.getWindowToken(), 0);
            View view = this.mKBLayout;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f210051e.setOnClickListener(new C72268b());
            this.f210050d.setOnClickListener(new C72269c(this.f210051e.get3DesEncrptData()));
            this.mKeyboard = (MyKeyboardWindow) findViewById(C0966R.C0970id.f359361kh3);
            this.mKBLayout = findViewById(C0966R.C0970id.f359359kh1);
            View findViewById = findViewById(C0966R.C0970id.kh4);
            if (!(this.mKeyboard == null || this.mKBLayout == null)) {
                findViewById.setOnClickListener(new C72335a0(this));
            }
            this.f210051e.setFocusable(false);
            this.f210051e.setFocusableInTouchMode(true);
        }
    }

    public boolean needConfirmFinish() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        setBackBtn(new C72267a());
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Bundle bundle = new Bundle();
        boolean z = getInput().getBoolean("key_is_reset_with_new_card", false);
        if (i == 0 && i2 == 0) {
            if (yVar instanceof C78358z) {
                C78358z zVar = (C78358z) yVar;
                bundle.putBoolean("key_need_area", zVar.f229626i == 1);
                bundle.putBoolean("key_need_profession", zVar.f229627j == 1);
                bundle.putParcelableArray("key_profession_list", zVar.f229628n);
                bundle.putBoolean("key_need_country", zVar.f229629o == 1);
                bundle.putStringArray("key_country_excludes", zVar.f229630p);
                ElementQuery elementQuery = zVar.f229622e;
                if (elementQuery == null) {
                    bundle.putBoolean("key_is_reset_with_new_card", z);
                    bundle.putString("bank_name", "");
                    bundle.putParcelable("elemt_query", new ElementQuery());
                    bundle.putString("key_card_id", this.f210051e.getEncryptDataWithHash(false));
                    C79143a.m95765d(this, bundle);
                } else if (!elementQuery.f209513p || !elementQuery.mo99417c()) {
                    bundle.putBoolean("key_is_reset_with_new_card", z);
                    bundle.putString("bank_name", zVar.f229622e.f209505e);
                    bundle.putParcelable("elemt_query", zVar.f229622e);
                    bundle.putString("key_card_id", this.f210051e.getEncryptDataWithHash(false));
                    C79143a.m95765d(this, bundle);
                    return true;
                } else {
                    C76879j.m92738i(this, C0966R.string.kmh, C0966R.string.a3h);
                    return true;
                }
            }
        } else if (i2 == 1 && (yVar instanceof C78358z)) {
            bundle.putString("bank_name", "");
            bundle.putBoolean("key_is_reset_with_new_card", z);
            bundle.putParcelable("elemt_query", new ElementQuery());
            bundle.putString("key_card_id", this.f210051e.getEncryptDataWithHash(false));
            C79143a.m95765d(this, bundle);
            return true;
        }
        return false;
    }
}
