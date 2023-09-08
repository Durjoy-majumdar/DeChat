package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.os.Bundle;
import android.view.Menu;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelvoiceaddr.p878ui.C114760b;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.sortview.C44721b;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import nj3.C88989a;
import ob0.C117747y;
import p216op.C47389f;
import p385u2.C111105a;
import p716uu.C52617d;
import p716uu.C52619e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.brandservice.ui.BrandServiceLocalSearchUI */
public class BrandServiceLocalSearchUI extends MMActivity implements C52617d.C52618a, BrandServiceSortView.C40655e {

    /* renamed from: d */
    public C52617d f109074d;

    /* renamed from: e */
    public BrandServiceSortView f109075e;

    /* renamed from: H1 */
    public void mo63485H1(boolean z, String[] strArr, long j, int i) {
    }

    /* renamed from: H5 */
    public void mo1321H5() {
        finish();
    }

    /* renamed from: S6 */
    public boolean mo1322S6(String str) {
        hideVKB();
        return true;
    }

    /* renamed from: T3 */
    public void mo63486T3() {
        hideVKB();
    }

    /* renamed from: U1 */
    public void mo63487U1() {
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6667l9;
    }

    /* renamed from: i7 */
    public void mo1323i7() {
    }

    public void initView() {
        BrandServiceSortView brandServiceSortView = (BrandServiceSortView) findViewById(C0966R.C0970id.jy5);
        this.f109075e = brandServiceSortView;
        brandServiceSortView.setMode(1);
        this.f109075e.setReturnResult(getIntent().getBooleanExtra("is_return_result", false));
        BrandServiceSortView brandServiceSortView2 = this.f109075e;
        brandServiceSortView2.f121306p = false;
        C44721b bVar = brandServiceSortView2.f121300g;
        bVar.mo69954b(bVar.f121310d);
        this.f109075e.mo69937d(false);
        this.f109075e.setShowFooterView(false);
        this.f109075e.setITransferToChildOnTouchListener(this);
        C52617d lX = ((C52619e) C86312j.m106911c(C52619e.class)).mo73375lX();
        this.f109074d = lX;
        ((C106742j1) lX).mo153851c(true);
        C114760b bVar2 = (C114760b) this.f109074d;
        bVar2.f344100u = this;
        bVar2.f319122j = this;
        bVar2.f344097r = false;
    }

    /* renamed from: l3 */
    public void mo1324l3(String str) {
        Log.m105925i("MicroMsg.BrandServiceLocalSearchUI", "search biz, key word : %s", str);
        this.f109075e.mo69936a(str);
    }

    /* renamed from: l5 */
    public void mo1325l5() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(C111105a.m151500b(getContext(), C0966R.color.a7_));
        initView();
        C86709a0.m107524d().mo123460f((C117747y) ((C47389f) C86312j.m106911c(C47389f.class)).mo72332TD(18));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ((C106742j1) this.f109074d).mo23882j(this, menu);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f109075e.mo63549i();
    }

    public void onPause() {
        super.onPause();
        ((C114760b) this.f109074d).mo174407s();
        ((C106742j1) this.f109074d).mo153849a();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        ((C114760b) this.f109074d).mo153858m(this, menu);
        return true;
    }

    /* renamed from: y4 */
    public void mo1326y4() {
    }
}
