package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.brandservice.p028ui.EnterpriseBizContactListView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import gx0.C45967h;
import gx0.C45970k;
import gx0.C45973l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p248ug.C52558c;
import rb0.C47969h;
import rb0.C47984k;
import rb0.C48009v0;
import te3.C49480fw1;
import te3.C50254lf;
import te3.ey4;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI */
public class EnterpriseBizContactListUI extends MMActivity {

    /* renamed from: o */
    public static final /* synthetic */ int f109076o = 0;

    /* renamed from: d */
    public C45973l f109077d;

    /* renamed from: e */
    public String f109078e;

    /* renamed from: f */
    public EnterpriseBizContactListView f109079f;

    /* renamed from: g */
    public View f109080g;

    /* renamed from: h */
    public MMHandler f109081h;

    /* renamed from: i */
    public boolean f109082i = false;

    /* renamed from: j */
    public long f109083j;

    /* renamed from: n */
    public long f109084n = 0;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI$a */
    public class C40606a implements MenuItem.OnMenuItemClickListener {
        public C40606a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EnterpriseBizContactListUI.this.hideVKB();
            EnterpriseBizContactListUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI$b */
    public class C40607b implements EnterpriseBizContactListView.C40612c {
        public C40607b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI$c */
    public static class C40608c implements C11385n {

        /* renamed from: d */
        public final WeakReference<EnterpriseBizContactListUI> f109087d;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI$c$a */
        public class C40609a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ EnterpriseBizContactListUI f109088d;

            /* renamed from: e */
            public final /* synthetic */ C49480fw1 f109089e;

            public C40609a(C40608c cVar, EnterpriseBizContactListUI enterpriseBizContactListUI, C49480fw1 fw12) {
                this.f109088d = enterpriseBizContactListUI;
                this.f109089e = fw12;
            }

            public void run() {
                try {
                    EnterpriseBizContactListUI enterpriseBizContactListUI = this.f109088d;
                    LinkedList<ey4> linkedList = this.f109089e.f133716e.f136740u;
                    int i = EnterpriseBizContactListUI.f109076o;
                    enterpriseBizContactListUI.mo63488H7(linkedList);
                } catch (Throwable unused) {
                }
            }
        }

        public C40608c(EnterpriseBizContactListUI enterpriseBizContactListUI) {
            this.f109087d = new WeakReference<>(enterpriseBizContactListUI);
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            try {
                if (this.f109087d.get() != null) {
                    EnterpriseBizContactListUI enterpriseBizContactListUI = this.f109087d.get();
                    if (!enterpriseBizContactListUI.isFinishing()) {
                        ((C119157j) C119157j.f356862d).mo183895z(new C40609a(this, enterpriseBizContactListUI, (C49480fw1) ((C47350c) yVar.getReqResp()).f127056b.f127083a));
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: H7 */
    public final void mo63488H7(List<ey4> list) {
        LinkedList linkedList = list;
        if (list == null) {
            LinkedList linkedList2 = new LinkedList();
            ey4 ey4 = new ey4();
            ey4.f133174d = 1;
            ey4.f133175e = getString(C0966R.string.cau);
            ey4.f133176f = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fms) + "/node/wework/images/icon_im.48490d44c5.png";
            linkedList2.add(ey4);
            linkedList = linkedList2;
        }
        ArrayList arrayList = new ArrayList();
        for (ey4 next : linkedList) {
            if (next.f133174d != 2) {
                EnterpriseBizContactListView.C40613d dVar = new EnterpriseBizContactListView.C40613d();
                dVar.f134063e = new C72996z1();
                dVar.f134064f = new C52558c();
                dVar.f109103g = true;
                dVar.f109104h = next;
                arrayList.add(dVar);
            }
        }
        this.f109079f.setFixedBrandServiceItem(arrayList);
        this.f109079f.mo63499i();
    }

    public void finish() {
        this.f109084n = System.currentTimeMillis() / 1000;
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a3m;
    }

    public void initView() {
        LinkedList<ey4> linkedList;
        C52558c b;
        setMMTitle(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(this.f109078e).mo62909j3());
        setBackBtn(new C40606a());
        if (!Util.isNullOrNil(this.f109078e) && (b = C47984k.m53328b(this.f109078e)) != null && b.mo72811g1()) {
            C45973l lVar = this.f109077d;
            lVar.getClass();
            addIconOptionMenu(1, (int) C0966R.string.f7374ee, (int) C0966R.raw.actionbar_icon_dark_add, (MenuItem.OnMenuItemClickListener) new C45970k(lVar));
        }
        this.f109080g = findViewById(C0966R.C0970id.ckg);
        EnterpriseBizContactListView enterpriseBizContactListView = (EnterpriseBizContactListView) findViewById(C0966R.C0970id.cke);
        this.f109079f = enterpriseBizContactListView;
        enterpriseBizContactListView.setFatherBizName(this.f109078e);
        this.f109079f.setExcludeBizChat(true);
        EnterpriseBizContactListView enterpriseBizContactListView2 = this.f109079f;
        enterpriseBizContactListView2.getClass();
        enterpriseBizContactListView2.setOnItemClickListener(new C40661d(enterpriseBizContactListView2));
        if (enterpriseBizContactListView2.getMode() == 0) {
            enterpriseBizContactListView2.setOnItemLongClickListener(new C40662e(enterpriseBizContactListView2));
        }
        this.f109079f.setEmptyListener(new C40607b());
        try {
            C47969h jo = C48009v0.Ex0().mo72749jo(this.f109078e);
            C50254lf lfVar = new C50254lf();
            lfVar.parseFrom(jo.field_raw_attrs);
            linkedList = lfVar.f137368d;
        } catch (Throwable unused) {
            linkedList = null;
        }
        mo63488H7(linkedList);
        C48009v0.Ex0().mo72745SE(this.f109078e, new C40608c(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C45973l lVar = this.f109077d;
        if (lVar != null) {
            lVar.mo71367a(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("enterprise_biz_name");
        this.f109078e = stringExtra;
        this.f109077d = new C45973l(this, stringExtra);
        this.f109083j = System.currentTimeMillis() / 1000;
        MMHandler mMHandler = this.f109081h;
        if (mMHandler == null) {
            this.f109081h = new C45967h(this);
        } else {
            mMHandler.removeMessages(1);
        }
        this.f109081h.sendEmptyMessageDelayed(1, 500);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.EnterpriseBizContactListUI).mo86179qs(this, C76986a.EnterpriseBiz);
    }

    public void onDestroy() {
        if (this.f109079f != null) {
            ((ArrayList) C48009v0.Lx0().f128790a).clear();
        }
        long j = this.f109083j;
        if (j > 0) {
            long j2 = this.f109084n;
            if (j2 > 0) {
                long j3 = j2 - j;
                C47969h jo = C48009v0.Ex0().mo72749jo(this.f109078e);
                int i = jo != null ? jo.field_qyUin : 0;
                int i2 = jo != null ? jo.field_userUin : 0;
                C115669n.INSTANCE.mo160131h(13465, "", Integer.valueOf(i), 0, Integer.valueOf(i2), 2, Long.valueOf(j3));
                Log.m105919d("MicroMsg.BrandService.EnterpriseBizContactListUI", "quit biz enterprise father report: %s,%s,%s,%s,%s", Integer.valueOf(i), 0, Integer.valueOf(i2), 2, Long.valueOf(j3));
            }
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (!C45628s0.m50740E(this.f109078e)) {
            Log.m105921e("MicroMsg.BrandService.EnterpriseBizContactListUI", "%s !isContact", this.f109078e);
            finish();
            return;
        }
        initView();
        if (!this.f109082i) {
            int intExtra = getIntent().getIntExtra("enterprise_from_scene", 5);
            EnterpriseBizContactListView enterpriseBizContactListView = this.f109079f;
            int contactCount = enterpriseBizContactListView != null ? enterpriseBizContactListView.getContactCount() : -1;
            C47969h jo = C48009v0.Ex0().mo72749jo(this.f109078e);
            int i = jo != null ? jo.field_qyUin : 0;
            long j = 0;
            long j2 = jo != null ? jo.field_wwCorpId : 0;
            if (jo != null) {
                j = jo.field_wwUserVid;
            }
            C115669n.INSTANCE.mo160131h(12892, this.f109078e, Integer.valueOf(intExtra), Integer.valueOf(contactCount), "", 0, 0, 0, 0, 0, 0, Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(j));
            Log.m105919d("MicroMsg.BrandService.EnterpriseBizContactListUI", "enter biz enterprise father report: %s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", this.f109078e, Integer.valueOf(intExtra), Integer.valueOf(contactCount), "", 0, 0, 0, 0, 0, 0, Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(j));
            this.f109082i = true;
        }
    }
}
