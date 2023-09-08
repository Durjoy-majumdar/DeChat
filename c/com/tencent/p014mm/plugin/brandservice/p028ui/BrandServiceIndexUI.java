package com.tencent.p014mm.plugin.brandservice.p028ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.plugin.brandservice.p028ui.base.BrandServiceSortView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import di3.C86312j;
import f40.C86709a0;
import f40.C86737h0;
import gx0.C8471c;
import gx0.C8472d;
import j20.C117292a;
import java.util.ArrayList;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import p248ug.C52570c0;
import p255vr.C65873e;
import qo3.C77407n;
import rb0.C48009v0;
import s00.C90110f;

@C86737h0
/* renamed from: com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI */
public class BrandServiceIndexUI extends MMActivity implements MStorage.IOnStorageChange {

    /* renamed from: h */
    public static final /* synthetic */ int f12040h = 0;

    /* renamed from: d */
    public TextView f12041d = null;

    /* renamed from: e */
    public BrandServiceSortView f12042e;

    /* renamed from: f */
    public boolean f12043f = false;

    /* renamed from: g */
    public boolean f12044g = false;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI$a */
    public class C2082a implements View.OnClickListener {
        public C2082a(BrandServiceIndexUI brandServiceIndexUI) {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/brandservice/ui/BrandServiceIndexUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/brandservice/ui/BrandServiceIndexUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI$b */
    public class C2083b implements MenuItem.OnMenuItemClickListener {
        public C2083b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BrandServiceIndexUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI$c */
    public class C2084c implements MenuItem.OnMenuItemClickListener {
        public C2084c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BrandServiceIndexUI brandServiceIndexUI = BrandServiceIndexUI.this;
            if (brandServiceIndexUI.f12044g) {
                Intent intent = new Intent(brandServiceIndexUI, BrandServiceLocalSearchUI.class);
                intent.putExtra("is_return_result", brandServiceIndexUI.f12044g);
                intent.addFlags(67108864);
                brandServiceIndexUI.startActivityForResult(intent, 1);
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("Search_Scene", 5);
                intent2.putExtra("detail_type", -7);
                ((C65873e) C86312j.m106911c(C65873e.class)).mo89915LO(brandServiceIndexUI, ".ui.FTSBizDetailUI", intent2);
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI$d */
    public class C2085d implements MenuItem.OnMenuItemClickListener {
        public C2085d() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            BrandServiceIndexUI brandServiceIndexUI = BrandServiceIndexUI.this;
            int i = BrandServiceIndexUI.f12040h;
            brandServiceIndexUI.getClass();
            C77407n nVar = new C77407n((Context) brandServiceIndexUI, 1, false);
            nVar.f225771i = new C8471c(brandServiceIndexUI);
            nVar.f225782p = new C8472d(brandServiceIndexUI);
            nVar.mo107573q();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6666l8;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.f7482hf);
        BrandServiceSortView brandServiceSortView = (BrandServiceSortView) findViewById(C0966R.C0970id.jy5);
        this.f12042e = brandServiceSortView;
        brandServiceSortView.setShowFooterView(true);
        this.f12042e.setReturnResult(this.f12044g);
        TextView textView = (TextView) findViewById(C0966R.C0970id.hpx);
        this.f12041d = textView;
        textView.setOnClickListener(new C2082a(this));
        this.f12041d.setVisibility(8);
        setBackBtn(new C2083b());
        if (((C52570c0) C86709a0.m107533q(C52570c0.class)).mo58180ND()) {
            addIconOptionMenu(0, (int) C0966R.string.k3j, (int) C0966R.raw.actionbar_icon_dark_search, (MenuItem.OnMenuItemClickListener) new C2084c());
        }
        addIconOptionMenu(1, (int) C0966R.string.k3h, (int) C0966R.raw.actionbar_icon_dark_more, (MenuItem.OnMenuItemClickListener) new C2085d());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1 && this.f12044g) {
            setResult(-1, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getIntent().getIntExtra("intent_service_type", 251658241);
        this.f12044g = C74560s1.m89275d(getIntent().getIntExtra("list_attr", 0), 16384);
        initView();
        C48009v0.Fx0().add(this);
        C115669n.INSTANCE.idkeyStat(1378, 7, 1, false);
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.BrandServiceIndexUI).mo86179qs(this, C76986a.ServiceBizList);
    }

    public void onDestroy() {
        if (C86709a0.m107522a()) {
            this.f12042e.mo63549i();
            C48009v0.Fx0().remove(this);
        }
        super.onDestroy();
    }

    public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Log.m105927v("MicroMsg.BrandService.BrandServiceIndexUI", "On Storage Change, event : %s.", str);
        this.f12043f = true;
    }

    public void onPause() {
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(233474, Long.valueOf(System.currentTimeMillis()));
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(233473, Long.valueOf(System.currentTimeMillis()));
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(233476, Long.valueOf(System.currentTimeMillis()));
        super.onPause();
    }

    public void onResume() {
        if (this.f12043f) {
            this.f12043f = false;
            this.f12042e.mo63548h();
        }
        super.onResume();
        ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        enableOptionMenu(1, true);
    }
}
