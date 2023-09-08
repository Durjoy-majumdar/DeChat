package com.tencent.p014mm.p136ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.BaseActivity;
import com.tencent.p014mm.p136ui.C74793m3;

/* renamed from: com.tencent.mm.ui.SearchBarUI */
public abstract class SearchBarUI extends BaseActivity implements C74793m3.C74794a {

    /* renamed from: z */
    public C74793m3 f214615z;

    /* renamed from: com.tencent.mm.ui.SearchBarUI$a */
    public class C73132a implements MenuItem.OnMenuItemClickListener {
        public C73132a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            View currentFocus;
            SearchBarUI searchBarUI = SearchBarUI.this;
            if (!searchBarUI.f214188x.isEmpty()) {
                searchBarUI.f214188x.clear();
                searchBarUI.supportInvalidateOptionsMenu();
            }
            C74793m3 m3Var = new C74793m3(searchBarUI);
            searchBarUI.f214615z = m3Var;
            m3Var.setSearchViewListener(searchBarUI);
            searchBarUI.f214615z.setHint(searchBarUI.getResources().getString(C0966R.string.k67));
            searchBarUI.getSupportActionBar().mo91114y(searchBarUI.f214615z);
            InputMethodManager inputMethodManager = (InputMethodManager) searchBarUI.getSystemService("input_method");
            if (!(inputMethodManager == null || (currentFocus = searchBarUI.getCurrentFocus()) == null || currentFocus.getWindowToken() == null)) {
                inputMethodManager.toggleSoftInput(0, 2);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.ui.SearchBarUI$b */
    public class C73133b implements MenuItem.OnMenuItemClickListener {
        public C73133b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SearchBarUI.this.finish();
            return true;
        }
    }

    public void onClickBackBtn(View view) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo101258G7(0, 0, "", new C73132a(), (View.OnLongClickListener) null, BaseActivity.C73016e.SEARCH);
        mo101260I7(new C73133b(), 0, BaseActivity.C73014c.BACK);
    }
}
