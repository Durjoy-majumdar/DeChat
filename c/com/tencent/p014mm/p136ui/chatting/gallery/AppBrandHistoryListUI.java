package com.tencent.p014mm.p136ui.chatting.gallery;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.chatting.presenter.C73778a;
import com.tencent.p014mm.p136ui.chatting.presenter.C73797e;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72996z1;
import dk3.C75413e;
import dk3.C75414f;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.ui.chatting.gallery.AppBrandHistoryListUI */
public class AppBrandHistoryListUI extends MMActivity implements C75414f {

    /* renamed from: d */
    public C75413e f216350d;

    /* renamed from: e */
    public RecyclerView f216351e;

    /* renamed from: f */
    public TextView f216352f;

    /* renamed from: g */
    public ProgressDialog f216353g;

    /* renamed from: h */
    public String f216354h;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.AppBrandHistoryListUI$a */
    public class C73691a implements MenuItem.OnMenuItemClickListener {
        public C73691a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            AppBrandHistoryListUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo102728H7(boolean z) {
        Log.m105925i("MicroMsg.AppBrandHistoryListUI", "[setProgress] isVisible:%s", Boolean.valueOf(z));
        if (z) {
            this.f216353g = C89779i0.m112248e(this, getString(C0966R.string.gas), true, 0, (DialogInterface.OnCancelListener) null);
            return;
        }
        ProgressDialog progressDialog = this.f216353g;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f216353g.dismiss();
            this.f216353g = null;
        }
    }

    /* renamed from: f */
    public void mo102729f(boolean z) {
        mo102728H7(true);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6507gp;
    }

    public void initView() {
        setMMTitle(getString(C0966R.string.b39));
        this.f216352f = (TextView) findViewById(C0966R.C0970id.j6m);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0966R.C0970id.ewn);
        this.f216351e = recyclerView;
        recyclerView.setBackgroundColor(-1);
        this.f216351e.setLayoutManager(this.f216350d.mo102839b(this));
        this.f216351e.setAdapter(this.f216350d.mo102841h(this.f216354h));
        this.f216351e.setHasFixedSize(true);
        setBackBtn(new C73691a());
    }

    /* renamed from: k */
    public void mo102730k(boolean z, int i) {
        mo102728H7(false);
        Log.m105925i("MicroMsg.AppBrandHistoryListUI", "[onDataLoaded] isFirst:%s addCount:%s", Boolean.valueOf(z), Integer.valueOf(i));
        if (i <= 0) {
            this.f216352f.setVisibility(0);
            this.f216351e.setVisibility(8);
            this.f216352f.setText(getString(C0966R.string.bav));
            return;
        }
        this.f216352f.setVisibility(8);
        this.f216351e.setVisibility(0);
        this.f216351e.getAdapter().notifyItemRangeChanged(0, i);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f216354h = getIntent().getStringExtra("Chat_User");
        C73778a aVar = new C73778a(this);
        aVar.f216569f = this;
        mo82061t5(aVar);
        initView();
        this.f216350d.mo102827g(true);
        if (C72996z1.m85820U5(this.f216354h)) {
            C115669n.INSTANCE.mo160131h(14562, this.f216354h, 0);
            return;
        }
        C115669n.INSTANCE.mo160131h(14562, this.f216354h, 1);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f216350d.onDetach();
    }

    public void onFinish() {
        Log.m105924i("MicroMsg.AppBrandHistoryListUI", "[onRefreshed]");
        finish();
    }

    /* renamed from: t2 */
    public void mo102732t2(String str, boolean z) {
    }

    /* renamed from: t5 */
    public void mo82061t5(C73797e eVar) {
        this.f216350d = (C75413e) eVar;
    }
}
