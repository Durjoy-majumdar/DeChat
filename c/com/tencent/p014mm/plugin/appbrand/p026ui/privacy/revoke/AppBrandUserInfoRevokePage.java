package com.tencent.p014mm.plugin.appbrand.p026ui.privacy.revoke;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C54209k0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import as0.C39635c;
import at0.C103915c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.sdk.platformtools.Log;
import cs0.C30910a;
import cs0.C45156c;
import cs0.C45159d0;
import cs0.C45160e;
import cs0.C45162f;
import cs0.C45164f0;
import cs0.C45181m;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.Metadata;
import p385u2.C111105a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13602i;
import rx3.C36568h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/revoke/AppBrandUserInfoRevokePage;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage */
public final class AppBrandUserInfoRevokePage extends MMFragment {

    /* renamed from: f */
    public static final /* synthetic */ int f108928f = 0;

    /* renamed from: d */
    public final C13601g f108929d = C36568h.m40986b(C13602i.NONE, new C40552a(this));

    /* renamed from: e */
    public C30910a f108930e;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage$a */
    public static final class C40552a extends C87413o implements C32224a<C45164f0> {

        /* renamed from: d */
        public final /* synthetic */ AppBrandUserInfoRevokePage f108931d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40552a(AppBrandUserInfoRevokePage appBrandUserInfoRevokePage) {
            super(0);
            this.f108931d = appBrandUserInfoRevokePage;
        }

        public Object invoke() {
            AppBrandUserInfoRevokePage appBrandUserInfoRevokePage = this.f108931d;
            String stringExtra = appBrandUserInfoRevokePage.getStringExtra("appId");
            if (stringExtra == null) {
                stringExtra = "";
            }
            return (C45164f0) new C54209k0(appBrandUserInfoRevokePage.getViewModelStore(), (C54209k0.C54210b) new C45159d0(appBrandUserInfoRevokePage, stringExtra)).mo75002a(C45164f0.class);
        }
    }

    public AppBrandUserInfoRevokePage() {
        super(true);
    }

    /* renamed from: K */
    public final C45164f0 mo63404K() {
        return (C45164f0) this.f108929d.getValue();
    }

    /* renamed from: L */
    public final void mo63405L(C30910a aVar) {
        if (this.f108930e != aVar) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "showActionbarDefault");
                setMMTitle("");
                C39635c.m42238b(this);
                C39635c.m42241e(this, C111105a.m151500b(C39635c.m42240d(this), C0966R.color.f2929c));
            } else if (ordinal == 1) {
                Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "showActionbarWithTitle");
                setMMTitle((int) C0966R.string.a4x);
                MMActivity a = C39635c.m42237a(this);
                if (a != null) {
                    a.showActionbarLine();
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                C39635c.m42241e(this, C111105a.m151500b(C39635c.m42240d(this), C0966R.color.f2927a));
            }
            this.f108930e = aVar;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6483g2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getStringExtra("appId");
        if (stringExtra == null || stringExtra.length() == 0) {
            Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "checkContextOnCreateEarly, appId is empty");
            finish();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        setBackBtn(new C45156c(this));
        mo63405L(C30910a.DEFAULT);
        C39635c.m42242f(this, C111105a.m151500b(C39635c.m42240d(this), C0966R.color.f2929c));
        View findViewById = findViewById(C0966R.C0970id.f359468l20);
        RecyclerView recyclerView = findViewById instanceof RecyclerView ? (RecyclerView) findViewById : null;
        if (recyclerView == null) {
            Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "initContentArea, findViewById return null");
            finish();
            return;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        C45181m mVar = new C45181m(this, new C45162f(recyclerView, this));
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mVar);
        C103915c.C67105b.m79374b(C103915c.f307262l, recyclerView, (Class) null, (Integer) null, true, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 8182, (Object) null);
        mo63404K().f122461f.observe(getViewLifecycleOwner(), new C45160e(recyclerView, this, mVar, linearLayoutManager));
    }
}
