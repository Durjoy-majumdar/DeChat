package com.tencent.p014mm.p136ui.tools;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.tools.MMTextInputUI */
public class MMTextInputUI extends MMActivity {

    /* renamed from: j */
    public static final /* synthetic */ int f285306j = 0;

    /* renamed from: d */
    public EditText f285307d;

    /* renamed from: e */
    public TextView f285308e;

    /* renamed from: f */
    public int f285309f;

    /* renamed from: g */
    public int f285310g;

    /* renamed from: h */
    public int f285311h;

    /* renamed from: i */
    public boolean f285312i;

    /* renamed from: com.tencent.mm.ui.tools.MMTextInputUI$a */
    public class C97232a implements DialogInterface.OnClickListener {
        public C97232a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            MMTextInputUI.this.hideVKB();
            MMTextInputUI.this.setResult(0);
            MMTextInputUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMTextInputUI$b */
    public class C97233b implements MenuItem.OnMenuItemClickListener {
        public C97233b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MMTextInputUI mMTextInputUI = MMTextInputUI.this;
            int i = MMTextInputUI.f285306j;
            mMTextInputUI.mo136201H7();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMTextInputUI$c */
    public class C97234c implements MenuItem.OnMenuItemClickListener {
        public C97234c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            MMTextInputUI mMTextInputUI = MMTextInputUI.this;
            mMTextInputUI.mo66593I7(mMTextInputUI.f285307d.getText());
            Intent intent = new Intent();
            intent.putExtra("key_result", MMTextInputUI.this.f285307d.getText());
            MMTextInputUI.this.setResult(-1, intent);
            MMTextInputUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.MMTextInputUI$d */
    public class C97235d implements TextWatcher {
        public C97235d() {
        }

        public void afterTextChanged(Editable editable) {
            String obj = editable.toString();
            boolean z = false;
            if (!MMTextInputUI.this.f285312i) {
                if (obj.trim().length() > 0) {
                    MMTextInputUI.this.enableOptionMenu(true);
                } else {
                    MMTextInputUI.this.enableOptionMenu(false);
                }
            }
            MMTextInputUI mMTextInputUI = MMTextInputUI.this;
            if (mMTextInputUI.f285309f > 0) {
                mMTextInputUI.f285311h = 0;
                for (int i = 0; i < obj.length(); i++) {
                    if (Util.isChinese(obj.charAt(i))) {
                        MMTextInputUI.this.f285311h += 2;
                    } else {
                        MMTextInputUI.this.f285311h++;
                    }
                }
                MMTextInputUI mMTextInputUI2 = MMTextInputUI.this;
                int i2 = mMTextInputUI2.f285311h;
                if (i2 >= mMTextInputUI2.f285310g && i2 <= mMTextInputUI2.f285309f) {
                    mMTextInputUI2.enableOptionMenu(true);
                    MMTextInputUI.this.f285308e.setVisibility(0);
                    MMTextInputUI mMTextInputUI3 = MMTextInputUI.this;
                    mMTextInputUI3.f285308e.setTextColor(mMTextInputUI3.getResources().getColor(C0966R.color.agg));
                    MMTextInputUI mMTextInputUI4 = MMTextInputUI.this;
                    mMTextInputUI4.f285308e.setText(mMTextInputUI4.getString(C0966R.string.f361449jz2, new Object[]{Integer.valueOf((mMTextInputUI4.f285309f - mMTextInputUI4.f285311h) >> 1)}));
                } else if (i2 > mMTextInputUI2.f285309f) {
                    mMTextInputUI2.enableOptionMenu(false);
                    MMTextInputUI.this.f285308e.setVisibility(0);
                    MMTextInputUI mMTextInputUI5 = MMTextInputUI.this;
                    mMTextInputUI5.f285308e.setTextColor(mMTextInputUI5.getResources().getColor(C0966R.color.agh));
                    MMTextInputUI mMTextInputUI6 = MMTextInputUI.this;
                    mMTextInputUI6.f285308e.setText(mMTextInputUI6.getString(C0966R.string.f361450jz3, new Object[]{Integer.valueOf(((mMTextInputUI6.f285311h - mMTextInputUI6.f285309f) >> 1) + 1)}));
                } else {
                    if (mMTextInputUI2.f285312i || i2 > 0) {
                        z = true;
                    }
                    mMTextInputUI2.enableOptionMenu(z);
                    MMTextInputUI.this.f285308e.setVisibility(8);
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: H7 */
    public final void mo136201H7() {
        if (getIntent().getBooleanExtra("key_show_confirm", false)) {
            C76879j.m92750u(getContext(), getString(C0966R.string.hqo), "", new C97232a(), (DialogInterface.OnClickListener) null);
            return;
        }
        hideVKB();
        setResult(0);
        finish();
    }

    /* renamed from: I7 */
    public void mo66593I7(CharSequence charSequence) {
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b1q;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f285307d = (EditText) findViewById(C0966R.C0970id.ki7);
        this.f285308e = (TextView) findViewById(C0966R.C0970id.f359287k10);
        this.f285307d.setHint(Util.nullAs(getIntent().getStringExtra("key_hint"), ""));
        this.f285307d.append(Util.nullAs(getIntent().getStringExtra("key_value"), ""));
        int intExtra = getIntent().getIntExtra("key_max_count", -1) << 1;
        this.f285309f = intExtra;
        this.f285311h = 0;
        this.f285310g = Math.max(intExtra - 120, (intExtra * 9) / 10);
        this.f285312i = getIntent().getBooleanExtra("key_nullable", false);
        setBackBtn(new C97233b());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C97234c(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        enableOptionMenu(this.f285312i);
        if (!this.f285312i || this.f285309f > 0) {
            this.f285307d.addTextChangedListener(new C97235d());
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 != i) {
            return super.onKeyDown(i, keyEvent);
        }
        Log.m105924i("MicroMsg.MMTextInputUI", "on back key down");
        mo136201H7();
        return true;
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
