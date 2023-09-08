package com.tencent.p014mm.p136ui.bizchat;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.notification.MMNotification;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MMSlideDelView;
import com.tencent.p014mm.p136ui.tools.C45082x0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorageEvent;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import nj3.C11184p0;
import ob0.C117747y;
import qo3.C89779i0;
import rb0.C47964c0;
import rb0.C48009v0;
import sb0.C48329b;
import sb0.C48334c;
import sb0.C48335d;
import sb0.C48349h;
import sb0.C48364s;
import sj3.C13684e;
import sj3.C13686j;
import sj3.C13687k;
import sj3.C13688l;
import sj3.C48400c;
import sj3.C48402d;
import sj3.C48404h;
import sj3.C48405i;
import sj3.C48406m;

/* renamed from: com.tencent.mm.ui.bizchat.BizChatFavUI */
public class BizChatFavUI extends MMActivity implements C47964c0 {

    /* renamed from: d */
    public TextView f121358d;

    /* renamed from: e */
    public ListView f121359e;

    /* renamed from: f */
    public C48400c f121360f;

    /* renamed from: g */
    public C11184p0 f121361g;

    /* renamed from: h */
    public String f121362h;

    /* renamed from: i */
    public long f121363i;

    /* renamed from: j */
    public boolean f121364j;

    /* renamed from: n */
    public C48329b.C48332c f121365n;

    /* renamed from: o */
    public C48335d.C48337b f121366o;

    /* renamed from: p */
    public C89779i0 f121367p;

    /* renamed from: c7 */
    public void mo7311c7(int i, C117747y yVar) {
        C89779i0 i0Var = this.f121367p;
        if (i0Var != null) {
            i0Var.dismiss();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a3p;
    }

    public void initView() {
        this.f121359e = (ListView) findViewById(C0966R.C0970id.kpr);
        TextView textView = (TextView) findViewById(C0966R.C0970id.f357933cj2);
        this.f121358d = textView;
        textView.setText(C0966R.string.arl);
        this.f121359e.setOnScrollListener(new C13687k(this));
        this.f121360f = new C48400c(this, new C13688l(this), this.f121362h);
        this.f121360f.getClass();
        this.f121359e.setAdapter(this.f121360f);
        this.f121361g = new C48406m(this);
        this.f121359e.setOnItemLongClickListener(new C48402d(this, new C45082x0(this)));
        this.f121359e.setOnItemClickListener(new C13684e(this));
        setBackBtn(new C13686j(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f121362h = getIntent().getStringExtra("Contact_User");
        Log.m105924i("MicroMsg.BizChatFavUI", "[registerListener]");
        this.f121365n = new C48404h(this);
        this.f121366o = new C48405i(this);
        C48329b Dx0 = C48009v0.Dx0();
        Dx0.f129406e.add(this.f121365n, getMainLooper());
        C48335d Ax0 = C48009v0.Ax0();
        Ax0.f129418e.add(this.f121366o, getMainLooper());
        initView();
        C48349h yx02 = C48009v0.yx0();
        String str = this.f121362h;
        yx02.getClass();
        C86709a0.m107529k().f251779b.mo123460f(new C48364s(str));
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        this.f121363i = ((C48334c) this.f121360f.getItem(adapterContextMenuInfo.position)).field_bizChatLocalId;
        contextMenu.add(adapterContextMenuInfo.position, 0, 1, C0966R.string.arm);
    }

    public void onDestroy() {
        Log.m105924i("MicroMsg.BizChatFavUI", "[unRegitListener]");
        C48329b Dx0 = C48009v0.Dx0();
        C48329b.C48332c cVar = this.f121365n;
        MStorageEvent<C48329b.C48332c, C48329b.C48332c.C48333a> mStorageEvent = Dx0.f129406e;
        if (mStorageEvent != null) {
            mStorageEvent.remove(cVar);
        }
        C48335d Ax0 = C48009v0.Ax0();
        C48335d.C48337b bVar = this.f121366o;
        MStorageEvent<C48335d.C48337b, C48335d.C48337b.C48339b> mStorageEvent2 = Ax0.f129418e;
        if (mStorageEvent2 != null) {
            mStorageEvent2.remove(bVar);
        }
        this.f121360f.mo5580b();
        super.onDestroy();
    }

    public void onPause() {
        MMSlideDelView.C73186f fVar = this.f121360f.f129574q;
        if (fVar != null) {
            fVar.mo97957b();
        }
        this.f121364j = false;
        ((MMNotification) C97625j3.m125816f()).f194715b = "";
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f121362h);
        if (z1Var == null || !z1Var.mo62927s3()) {
            finish();
            return;
        }
        setTitleMuteIconVisibility(8);
        this.f121364j = true;
        this.f121360f.mo7991f();
        ((MMNotification) C97625j3.m125816f()).f194715b = this.f121362h;
    }
}
