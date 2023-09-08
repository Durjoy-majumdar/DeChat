package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelvoiceaddr.p878ui.C114760b;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.sortview.C44721b;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import nj3.C88989a;
import p716uu.C52617d;
import p716uu.C52619e;
import rb0.C48009v0;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizSearchUI */
public class EnterpriseBizSearchUI extends MMActivity implements C52617d.C52618a, EnterpriseBizContactListView.C40615f {

    /* renamed from: d */
    public String f109156d;

    /* renamed from: e */
    public C52617d f109157e;

    /* renamed from: f */
    public EnterpriseBizContactListView f109158f;

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
        return C0966R.C0971layout.a3o;
    }

    /* renamed from: i7 */
    public void mo1323i7() {
    }

    public void initView() {
        if (Util.isNullOrNil(this.f109156d)) {
            String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
            this.f109156d = stringExtra;
            if (Util.isNullOrNil(stringExtra)) {
                finish();
            }
        }
        EnterpriseBizContactListView enterpriseBizContactListView = (EnterpriseBizContactListView) findViewById(C0966R.C0970id.jy5);
        this.f109158f = enterpriseBizContactListView;
        enterpriseBizContactListView.setFatherBizName(this.f109156d);
        this.f109158f.setExcludeBizChat(true);
        this.f109158f.mo63499i();
        this.f109158f.setMode(1);
        EnterpriseBizContactListView enterpriseBizContactListView2 = this.f109158f;
        enterpriseBizContactListView2.getClass();
        enterpriseBizContactListView2.setOnItemClickListener(new C40661d(enterpriseBizContactListView2));
        if (enterpriseBizContactListView2.getMode() == 0) {
            enterpriseBizContactListView2.setOnItemLongClickListener(new C40662e(enterpriseBizContactListView2));
        }
        EnterpriseBizContactListView enterpriseBizContactListView3 = this.f109158f;
        enterpriseBizContactListView3.f121306p = false;
        C44721b bVar = enterpriseBizContactListView3.f121300g;
        bVar.mo69954b(bVar.f121310d);
        this.f109158f.mo69937d(false);
        this.f109158f.setOnTouchListener(this);
        ((TextView) this.f109158f.getNoResultView()).setText(C0966R.string.cbb);
        C52617d lX = ((C52619e) C86312j.m106911c(C52619e.class)).mo73375lX();
        this.f109157e = lX;
        ((C106742j1) lX).mo153851c(true);
        C114760b bVar2 = (C114760b) this.f109157e;
        bVar2.f344100u = this;
        bVar2.f319122j = this;
        bVar2.f344097r = false;
    }

    /* renamed from: l3 */
    public void mo1324l3(String str) {
        Log.m105925i("MicroMsg.EnterpriseBizSearchUI", "search biz, key word : %s", str);
        this.f109158f.mo69936a(str);
    }

    /* renamed from: l5 */
    public void mo1325l5() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ((C106742j1) this.f109157e).mo23882j(this, menu);
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f109158f != null) {
            ((ArrayList) C48009v0.Lx0().f128790a).clear();
        }
    }

    public void onPause() {
        super.onPause();
        ((C114760b) this.f109157e).mo174407s();
        ((C106742j1) this.f109157e).mo153849a();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        ((C114760b) this.f109157e).mo153858m(this, menu);
        return true;
    }

    /* renamed from: y4 */
    public void mo1326y4() {
    }
}
