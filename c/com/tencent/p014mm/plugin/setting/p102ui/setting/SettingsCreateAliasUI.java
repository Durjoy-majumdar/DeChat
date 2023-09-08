package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import java.util.Map;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p196ln.C76705f;
import p629ny.C76979h;
import tm2.C14049d;
import xm2.C15860k;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI */
public class SettingsCreateAliasUI extends MMActivity implements C11385n {

    /* renamed from: q */
    public static final /* synthetic */ int f20831q = 0;

    /* renamed from: d */
    public EditText f20832d;

    /* renamed from: e */
    public ProgressDialog f20833e = null;

    /* renamed from: f */
    public C15860k f20834f;

    /* renamed from: g */
    public String f20835g;

    /* renamed from: h */
    public boolean f20836h = false;

    /* renamed from: i */
    public ImageView f20837i;

    /* renamed from: j */
    public TextView f20838j;

    /* renamed from: n */
    public TextView f20839n;

    /* renamed from: o */
    public TextView f20840o;

    /* renamed from: p */
    public C11385n f20841p = null;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI$a */
    public class C5269a implements TextWatcher {
        public C5269a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
            /*
                r4 = this;
                com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI r6 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsCreateAliasUI.this
                r6.getClass()
                int r7 = r5.length()
                r8 = 2131838305(0x7f114561, float:1.930983E38)
                r0 = 6
                r1 = 1
                r2 = 0
                if (r7 < r0) goto L_0x0079
                int r7 = r5.length()
                r0 = 20
                if (r7 <= r0) goto L_0x001a
                goto L_0x0079
            L_0x001a:
                char r7 = r5.charAt(r2)
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isAlpha(r7)
                if (r7 != 0) goto L_0x002c
                r7 = 2131838303(0x7f11455f, float:1.9309825E38)
                java.lang.String r6 = r6.getString(r7)
                goto L_0x007d
            L_0x002c:
                int r7 = r5.length()
                int r7 = r7 - r1
            L_0x0031:
                if (r7 <= 0) goto L_0x0070
                char r0 = r5.charAt(r7)
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isAlpha(r0)
                if (r3 != 0) goto L_0x006d
                r3 = 45
                if (r0 == r3) goto L_0x006d
                r3 = 95
                if (r0 == r3) goto L_0x006d
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNum(r0)
                if (r3 == 0) goto L_0x004c
                goto L_0x006d
            L_0x004c:
                boolean r7 = java.lang.Character.isSpace(r0)
                if (r7 == 0) goto L_0x005a
                r7 = 2131838302(0x7f11455e, float:1.9309823E38)
                java.lang.String r6 = r6.getString(r7)
                goto L_0x007d
            L_0x005a:
                boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isChinese((char) r0)
                if (r7 == 0) goto L_0x0068
                r7 = 2131838300(0x7f11455c, float:1.930982E38)
                java.lang.String r6 = r6.getString(r7)
                goto L_0x007d
            L_0x0068:
                java.lang.String r6 = r6.getString(r8)
                goto L_0x007d
            L_0x006d:
                int r7 = r7 + -1
                goto L_0x0031
            L_0x0070:
                r7 = 2131833026(0x7f1130c2, float:1.9299122E38)
                java.lang.String r6 = r6.getString(r7)
                r7 = 1
                goto L_0x007e
            L_0x0079:
                java.lang.String r6 = r6.getString(r8)
            L_0x007d:
                r7 = 0
            L_0x007e:
                if (r7 == 0) goto L_0x0098
                com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI r7 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsCreateAliasUI.this
                r7.enableOptionMenu(r1)
                com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI r7 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsCreateAliasUI.this
                android.widget.TextView r8 = r7.f20840o
                android.content.res.Resources r7 = r7.getResources()
                r0 = 2131100909(0x7f0604ed, float:1.7814213E38)
                android.content.res.ColorStateList r7 = r7.getColorStateList(r0)
                r8.setTextColor(r7)
                goto L_0x00af
            L_0x0098:
                com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI r7 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsCreateAliasUI.this
                r7.enableOptionMenu(r2)
                com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI r7 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsCreateAliasUI.this
                android.widget.TextView r8 = r7.f20840o
                android.content.res.Resources r7 = r7.getResources()
                r0 = 2131101431(0x7f0606f7, float:1.7815271E38)
                android.content.res.ColorStateList r7 = r7.getColorStateList(r0)
                r8.setTextColor(r7)
            L_0x00af:
                com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI r7 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsCreateAliasUI.this
                android.widget.TextView r7 = r7.f20840o
                r7.setText(r6)
                com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI r6 = com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsCreateAliasUI.this
                android.widget.TextView r7 = r6.f20839n
                r8 = 2131820937(0x7f110189, float:1.9274603E38)
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r2] = r5
                java.lang.String r5 = r6.getString(r8, r0)
                r7.setText(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.setting.p102ui.setting.SettingsCreateAliasUI.C5269a.onTextChanged(java.lang.CharSequence, int, int, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI$b */
    public class C5270b implements MenuItem.OnMenuItemClickListener {
        public C5270b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsCreateAliasUI.this.hideVKB();
            SettingsCreateAliasUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI$c */
    public class C5271c implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI$c$a */
        public class C5272a implements DialogInterface.OnClickListener {
            public C5272a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                SettingsCreateAliasUI settingsCreateAliasUI = SettingsCreateAliasUI.this;
                if (settingsCreateAliasUI.f20835g.equals(C75592q0.m90789s())) {
                    C76879j.m92738i(settingsCreateAliasUI.getContext(), C0966R.string.gvj, C0966R.string.gvh);
                } else if (!Util.isValidAccount(settingsCreateAliasUI.f20835g)) {
                    C76879j.m92738i(settingsCreateAliasUI.getContext(), C0966R.string.k9r, C0966R.string.hvr);
                } else {
                    settingsCreateAliasUI.f20833e = C76879j.m92723Q(settingsCreateAliasUI.getContext(), settingsCreateAliasUI.getString(C0966R.string.gvh), settingsCreateAliasUI.getString(C0966R.string.gvc), false, true, new C5349e2(settingsCreateAliasUI));
                    if (settingsCreateAliasUI.f20834f != null) {
                        C86709a0.m107524d().mo123458d(settingsCreateAliasUI.f20834f);
                    }
                    settingsCreateAliasUI.f20834f = new C15860k(1, settingsCreateAliasUI.f20835g, (Map<Integer, String>) null);
                    C86709a0.m107524d().mo123460f(settingsCreateAliasUI.f20834f);
                }
            }
        }

        public C5271c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsCreateAliasUI settingsCreateAliasUI = SettingsCreateAliasUI.this;
            settingsCreateAliasUI.f20835g = settingsCreateAliasUI.f20832d.getText().toString().trim();
            if (C75592q0.m90789s().equalsIgnoreCase(SettingsCreateAliasUI.this.f20835g)) {
                SettingsCreateAliasUI.this.hideVKB();
                SettingsCreateAliasUI.this.finish();
                return true;
            }
            AppCompatActivity context = SettingsCreateAliasUI.this.getContext();
            SettingsCreateAliasUI settingsCreateAliasUI2 = SettingsCreateAliasUI.this;
            C76879j.m92750u(context, settingsCreateAliasUI2.getString(C0966R.string.gvi, new Object[]{settingsCreateAliasUI2.f20835g}), SettingsCreateAliasUI.this.getString(C0966R.string.bji), new C5272a(), (DialogInterface.OnClickListener) null);
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bxa;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.bvy);
        this.f20837i = (ImageView) findViewById(C0966R.C0970id.a27);
        this.f20838j = (TextView) findViewById(C0966R.C0970id.hg4);
        this.f20839n = (TextView) findViewById(C0966R.C0970id.l2q);
        this.f20840o = (TextView) findViewById(C0966R.C0970id.gyg);
        this.f20832d = (EditText) findViewById(C0966R.C0970id.ikh);
        String s = C75592q0.m90789s();
        if (!C72996z1.m85802I4(s)) {
            this.f20832d.setText(C75592q0.m90789s());
            this.f20839n.setText(getString(C0966R.string.f7565jt, new Object[]{s}));
        }
        EditText editText = this.f20832d;
        editText.setSelection(editText.getText().length());
        this.f20832d.setFocusable(true);
        this.f20832d.setFocusableInTouchMode(true);
        this.f20832d.addTextChangedListener(new C5269a());
        this.f20838j.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this, Util.nullAsNil(C75592q0.m90783m()), this.f20838j.getTextSize()));
        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(this.f20837i, s);
        setBackBtn(new C5270b());
        addTextOptionMenu(0, getString(C0966R.string.a2n), new C5271c(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        enableOptionMenu(false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20836h = getIntent().getBooleanExtra("KFromSetAliasTips", false);
        initView();
        C86709a0.m107524d().mo123455a(WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL, this);
    }

    public void onDestroy() {
        if (this.f20834f != null) {
            C86709a0.m107524d().mo123458d(this.f20834f);
        }
        C86709a0.m107524d().mo123470p(WXWebReporter.WXWEB_GET_MMKV_CALLBACK_IS_NULL, this);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            if (this.f20836h) {
                C115669n.INSTANCE.kvStat(10358, String.valueOf(1));
            }
            hideVKB();
            C86709a0.m107535s().mo121142i().mo119676J(42, this.f20835g);
            C89137b0 d = C86709a0.m107524d();
            C5352f2 f2Var = new C5352f2(this);
            this.f20841p = f2Var;
            d.mo123455a(255, f2Var);
            C86709a0.m107524d().mo123460f(new C1302b0(1));
            return;
        }
        ProgressDialog progressDialog = this.f20833e;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f20833e = null;
        }
        if (C14049d.m13402a().mo93163uP(getContext(), i, i2, str) || i != 4) {
            return;
        }
        if (i2 == -7 || i2 == -10) {
            C76879j.m92738i(getContext(), C0966R.string.hvp, C0966R.string.gvl);
        }
    }
}
