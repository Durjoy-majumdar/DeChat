package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.report.model.C84166o;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyEmptyUI */
public final class AppBrandNearbyEmptyUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyEmptyUI$a */
    public class C84435a implements MenuItem.OnMenuItemClickListener {
        public C84435a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AppBrandNearbyEmptyUI.this.onBackPressed();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6427ek;
    }

    public void onCreate(Bundle bundle) {
        View findViewById;
        C84166o.C84168b bVar = C84166o.C84168b.TOP_ENTRANCE_IN_DESKTOP;
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        if (C85875k4.m106197n0()) {
            overridePendingTransition(0, 0);
        }
        getContentView().setBackgroundColor(getContext().getResources().getColor(C0966R.color.a7_));
        setActionbarColor(getContext().getResources().getColor(C0966R.color.a7_));
        setMMTitle((int) C0966R.string.f7763qv);
        setBackBtn(new C84435a());
        if (!(getSupportActionBar() == null || (findViewById = getSupportActionBar().mo91099j().findViewById(C0966R.C0970id.f5470g0)) == null || findViewById.getLayoutParams() == null || !(findViewById.getLayoutParams() instanceof ViewGroup.MarginLayoutParams))) {
            ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).rightMargin = 0;
            findViewById.requestLayout();
        }
        TextView textView = (TextView) findViewById(C0966R.C0970id.bsi);
        TextView textView2 = (TextView) findViewById(C0966R.C0970id.bs7);
        int intExtra = getIntent().getIntExtra("extra_enter_reason", 0);
        if (intExtra == 0) {
            C84166o oVar = new C84166o();
            oVar.f245741a = bVar;
            oVar.f245745e = C84166o.C84167a.EMPTY_PAGE;
            oVar.mo116840a();
        } else if (intExtra != 1) {
            finish();
            return;
        } else {
            textView.setText(C0966R.string.f7762qu);
            textView2.setText(C0966R.string.f7761qt);
            C84166o oVar2 = new C84166o();
            oVar2.f245741a = bVar;
            oVar2.f245745e = C84166o.C84167a.LBS_NOT_ALLOW;
            oVar2.mo116840a();
        }
        setResult(-1);
    }
}
