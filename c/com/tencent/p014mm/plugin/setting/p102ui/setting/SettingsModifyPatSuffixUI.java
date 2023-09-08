package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.emoji.view.EmojiPanelInputComponent;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import com.tencent.p014mm.p136ui.widget.MMClearEditText;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C31543z5;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import g62.C45882k;
import g62.C75880o;
import j20.C117292a;
import java.util.ArrayList;
import kg3.C76577a;
import lc3.C10485b;
import nj3.C76879j;
import p629ny.C76979h;
import qo3.C89779i0;
import te3.C49070cz2;
import te3.C52085y83;
import v51.C78336h;
import vl3.C102226d;
import vo3.C90852c;

@C90852c(0)
/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI */
public class SettingsModifyPatSuffixUI extends MMWizardActivity implements EmojiPanelInputComponent.C68041c, C45882k.C45884b {

    /* renamed from: q */
    public static final /* synthetic */ int f205739q = 0;

    /* renamed from: e */
    public EmojiPanelInputComponent f205740e;

    /* renamed from: f */
    public MMClearEditText f205741f;

    /* renamed from: g */
    public Button f205742g;

    /* renamed from: h */
    public TextView f205743h;

    /* renamed from: i */
    public C89779i0 f205744i;

    /* renamed from: j */
    public MTimerHandler f205745j;

    /* renamed from: n */
    public int f205746n = 20;

    /* renamed from: o */
    public int f205747o = 1;

    /* renamed from: p */
    public TextWatcher f205748p = new C71074d();

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI$a */
    public class C5283a implements MTimerHandler.CallBack {
        public C5283a() {
        }

        public boolean onTimerExpired() {
            SettingsModifyPatSuffixUI settingsModifyPatSuffixUI = SettingsModifyPatSuffixUI.this;
            settingsModifyPatSuffixUI.f205743h.setText(settingsModifyPatSuffixUI.getString(C0966R.string.inl));
            SettingsModifyPatSuffixUI settingsModifyPatSuffixUI2 = SettingsModifyPatSuffixUI.this;
            settingsModifyPatSuffixUI2.f205743h.setTextColor(settingsModifyPatSuffixUI2.getResources().getColor(C0966R.color.f3288ma));
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI$b */
    public class C5284b implements View.OnClickListener {
        public C5284b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/setting/ui/setting/SettingsModifyPatSuffixUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SettingsModifyPatSuffixUI.this.hideVKB();
            SettingsModifyPatSuffixUI settingsModifyPatSuffixUI = SettingsModifyPatSuffixUI.this;
            Editable text = settingsModifyPatSuffixUI.f205741f.getText();
            settingsModifyPatSuffixUI.getClass();
            Log.m105925i("MicroMsg.SettingsModifyPatSuffixUI", "doModifyPatSuffixScene %s", text);
            C49070cz2 cz22 = new C49070cz2();
            cz22.f132042d = Util.escapeStringForUCC(text.toString()).trim();
            ((C75700k0) C86709a0.m107533q(C75700k0.class)).x90().mo71315mc(new C32330n(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, cz22));
            settingsModifyPatSuffixUI.f205744i = C76879j.m92723Q(settingsModifyPatSuffixUI.getContext(), "", settingsModifyPatSuffixUI.getString(C0966R.string.gvc), false, false, (DialogInterface.OnCancelListener) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsModifyPatSuffixUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI$c */
    public class C5285c implements MenuItem.OnMenuItemClickListener {
        public C5285c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsModifyPatSuffixUI.this.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI$d */
    public class C71074d implements TextWatcher {
        public C71074d() {
        }

        public void afterTextChanged(Editable editable) {
            SettingsModifyPatSuffixUI settingsModifyPatSuffixUI = SettingsModifyPatSuffixUI.this;
            settingsModifyPatSuffixUI.f205741f.removeTextChangedListener(settingsModifyPatSuffixUI.f205748p);
            C78336h hVar = new C78336h(editable.toString(), (int) SettingsModifyPatSuffixUI.this.f205741f.getPaint().getTextSize());
            C45078p0.C45079a aVar = C45078p0.C45079a.MODE_CHINESE_AS_2;
            int a = hVar.mo108328a(aVar);
            editable.toString();
            SettingsModifyPatSuffixUI settingsModifyPatSuffixUI2 = SettingsModifyPatSuffixUI.this;
            int i = settingsModifyPatSuffixUI2.f205746n;
            if (a > i) {
                String b = hVar.mo108329b(i, aVar);
                SettingsModifyPatSuffixUI settingsModifyPatSuffixUI3 = SettingsModifyPatSuffixUI.this;
                settingsModifyPatSuffixUI3.f205743h.setText(settingsModifyPatSuffixUI3.getString(C0966R.string.ink, new Object[]{Integer.valueOf(settingsModifyPatSuffixUI3.f205746n / 2)}));
                SettingsModifyPatSuffixUI settingsModifyPatSuffixUI4 = SettingsModifyPatSuffixUI.this;
                settingsModifyPatSuffixUI4.f205743h.setTextColor(settingsModifyPatSuffixUI4.getResources().getColor(C0966R.color.a_3));
                SettingsModifyPatSuffixUI.this.f205743h.performHapticFeedback(3, 2);
                if (SettingsModifyPatSuffixUI.this.f205745j.stopped()) {
                    SettingsModifyPatSuffixUI.this.f205745j.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                }
                SettingsModifyPatSuffixUI settingsModifyPatSuffixUI5 = SettingsModifyPatSuffixUI.this;
                settingsModifyPatSuffixUI5.f205741f.setText(C102226d.m134696a(settingsModifyPatSuffixUI5, b));
                MMClearEditText mMClearEditText = SettingsModifyPatSuffixUI.this.f205741f;
                mMClearEditText.setSelection(mMClearEditText.getText().length());
            } else if (a < i) {
                settingsModifyPatSuffixUI2.f205745j.stopTimer();
                SettingsModifyPatSuffixUI settingsModifyPatSuffixUI6 = SettingsModifyPatSuffixUI.this;
                settingsModifyPatSuffixUI6.f205743h.setText(settingsModifyPatSuffixUI6.getString(C0966R.string.inl));
                SettingsModifyPatSuffixUI settingsModifyPatSuffixUI7 = SettingsModifyPatSuffixUI.this;
                settingsModifyPatSuffixUI7.f205743h.setTextColor(settingsModifyPatSuffixUI7.getResources().getColor(C0966R.color.f3288ma));
            }
            SettingsModifyPatSuffixUI.this.f205742g.setEnabled(true);
            SettingsModifyPatSuffixUI settingsModifyPatSuffixUI8 = SettingsModifyPatSuffixUI.this;
            settingsModifyPatSuffixUI8.f205741f.addTextChangedListener(settingsModifyPatSuffixUI8.f205748p);
            if (a > 0) {
                SettingsModifyPatSuffixUI.this.f205740e.setSmileySendButtonEnable(true);
            } else {
                SettingsModifyPatSuffixUI.this.f205740e.setSmileySendButtonEnable(false);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxn;
    }

    /* renamed from: i0 */
    public void mo1072i0(boolean z, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f205742g.getLayoutParams();
        if (z) {
            layoutParams.bottomMargin = C76577a.m92151b(this, 16) + i;
        } else {
            layoutParams.bottomMargin = C76577a.m92151b(this, 96);
        }
        this.f205742g.setLayoutParams(layoutParams);
    }

    public void initView() {
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        this.f205740e = (EmojiPanelInputComponent) findViewById(C0966R.C0970id.f7i);
        this.f205742g = (Button) findViewById(C0966R.C0970id.hfe);
        this.f205741f = (MMClearEditText) findViewById(C0966R.C0970id.hrk);
        this.f205743h = (TextView) findViewById(C0966R.C0970id.hrl);
        this.f205742g.setOnClickListener(new C5284b());
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC, (Object) null);
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, 0);
        Log.m105925i("MicroMsg.SettingsModifyPatSuffixUI", "curSuffix %s, suffixVersion %d", str, Integer.valueOf(j));
        if (!Util.isNullOrNil(str)) {
            if (j == 0 && LocaleUtil.isChineseAppLang()) {
                str = "的" + str;
            }
            this.f205741f.setText(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this, str));
            this.f205741f.setSelection(str.length());
        }
        this.f205741f.requestFocus();
        this.f205741f.addTextChangedListener(this.f205748p);
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).x90().mo71314m3(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, this);
        setBackBtn(new C5285c());
        this.f205740e.setMMEditText(this.f205741f);
        this.f205740e.setVisibility(4);
        this.f205740e.setInputComponentListener(this);
        if (this.f205741f.getText().length() > 0) {
            this.f205740e.setSmileySendButtonEnable(true);
        } else {
            this.f205740e.setSmileySendButtonEnable(false);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(20379, "" + System.currentTimeMillis(), 3, 0, Integer.valueOf(this.f205747o));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getBooleanExtra("jumptoPat", false)) {
            this.f205747o = 2;
        }
        C115669n nVar = C115669n.INSTANCE;
        nVar.mo160131h(20379, "" + System.currentTimeMillis(), 1, 0, Integer.valueOf(this.f205747o));
        this.f205746n = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("PatSuffixMaxByte", 16);
        initView();
        this.f205745j = new MTimerHandler(getMainLooper(), (MTimerHandler.CallBack) new C5283a(), false);
    }

    public void onDestroy() {
        EmojiPanelInputComponent emojiPanelInputComponent = this.f205740e;
        if (emojiPanelInputComponent != null) {
            emojiPanelInputComponent.f195280q = null;
            ChatFooterPanel chatFooterPanel = emojiPanelInputComponent.f195273g;
            if (chatFooterPanel != null) {
                chatFooterPanel.mo100200l();
                emojiPanelInputComponent.f195273g.mo100189b();
            }
        }
        ((C75700k0) C86709a0.m107533q(C75700k0.class)).x90().E20(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, this);
        MTimerHandler mTimerHandler = this.f205745j;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f205740e.mo93492d()) {
            EmojiPanelInputComponent emojiPanelInputComponent = this.f205740e;
            emojiPanelInputComponent.mo93491c();
            emojiPanelInputComponent.setVisibility(8);
            return true;
        }
        finish();
        return false;
    }

    /* renamed from: u1 */
    public void mo71282u1(int i, C52085y83 y832, C75880o oVar) {
        Log.m105925i("MicroMsg.SettingsModifyPatSuffixUI", "ret:%d, content:%s, title:%s", Integer.valueOf(i), y832.f145175d, y832.f145176e);
        C89779i0 i0Var = this.f205744i;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        if (i == 0) {
            try {
                C76879j.m92726T(this, getString(C0966R.string.a0g));
                C49070cz2 cz22 = (C49070cz2) oVar.f222536j;
                C85801v1 i2 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_PAT_SUFFIX_STRING_SYNC;
                if (!Util.nullAsNil((String) i2.mo119685f(aVar, (Object) null)).equals(cz22.f132042d)) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAT_SUFFIX_VERSION_INT_SYNC, 2);
                }
                C86709a0.m107535s().mo121142i().mo119677K(aVar, cz22.f132042d);
                mo7681K7(1);
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160131h(20379, "" + System.currentTimeMillis(), 2, 0, Integer.valueOf(this.f205747o));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAT_SUFFIX_MODIFY_TIP_TIMESTAMP_LONG, Long.valueOf(C31543z5.m39453c()));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_PAT_SUFFIX_MODIFY_TIP_COUNT_INT, 0);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.SettingsModifyPatSuffixUI", e, "", new Object[0]);
            }
        } else {
            if (!Util.isNullOrNil(y832.f145175d)) {
                C76879j.m92748s(this, y832.f145175d, getString(C0966R.string.a0f));
            } else {
                C76879j.m92738i(getContext(), C0966R.string.f7966xq, C0966R.string.a0f);
            }
            C115669n nVar2 = C115669n.INSTANCE;
            nVar2.mo160131h(20379, "" + System.currentTimeMillis(), 2, Integer.valueOf(i), Integer.valueOf(this.f205747o));
        }
    }
}
