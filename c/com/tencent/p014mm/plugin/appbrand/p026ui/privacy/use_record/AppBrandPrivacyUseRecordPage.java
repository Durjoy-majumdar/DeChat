package com.tencent.p014mm.plugin.appbrand.p026ui.privacy.use_record;

import a14.C53895h;
import a14.C53934p0;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C54218t;
import as0.C39633a;
import as0.C39635c;
import at0.C103915c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import ds0.C45441a;
import ds0.C45442b;
import ds0.C45444c;
import ds0.C45445d;
import ds0.C45447i;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.LinkedList;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import p385u2.C111105a;
import qo3.C89779i0;
import sx3.C110818d0;
import te3.a55;
import te3.x75;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/use_record/AppBrandPrivacyUseRecordPage;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.use_record.AppBrandPrivacyUseRecordPage */
public final class AppBrandPrivacyUseRecordPage extends MMFragment {

    /* renamed from: e */
    public static final /* synthetic */ int f108932e = 0;

    /* renamed from: d */
    public String f108933d;

    public AppBrandPrivacyUseRecordPage() {
        super(true);
    }

    /* renamed from: K */
    public final Integer mo63407K(a55 a55) {
        boolean z = true;
        if (1 != a55.f130323e) {
            z = false;
        }
        if (!z) {
            return null;
        }
        LinkedList<x75> linkedList = a55.f130322d;
        C87412m.m108593f(linkedList, "record_list");
        x75 x75 = (x75) C110818d0.m150925W(linkedList);
        if (x75 != null) {
            return Integer.valueOf(x75.f144515f);
        }
        return null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cjt;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getStringExtra("username");
        this.f108933d = stringExtra;
        if (stringExtra == null || stringExtra.length() == 0) {
            Log.m105928w("MicroMsg.AppBrandPrivacyUseRecordPage", "checkContextOnCreateEarly, username is empty");
            finish();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        setBackBtn(new C45441a(this));
        setMMTitle((int) C0966R.string.lqc);
        C39635c.m42238b(this);
        C39635c.m42241e(this, C111105a.m151500b(C39635c.m42240d(this), C0966R.color.f2929c));
        C39635c.m42242f(this, C111105a.m151500b(C39635c.m42240d(this), C0966R.color.f2929c));
        View findViewById = findViewById(C0966R.C0970id.brh);
        LoadMoreRecyclerView loadMoreRecyclerView = findViewById instanceof LoadMoreRecyclerView ? (LoadMoreRecyclerView) findViewById : null;
        if (loadMoreRecyclerView == null) {
            Log.m105928w("MicroMsg.AppBrandPrivacyUseRecordPage", "initContentArea, useRecordContentArea is null");
            finish();
            return;
        }
        loadMoreRecyclerView.setPadding(0, C76577a.m92155f(C39635c.m42240d(this), C0966R.dimen.f3736cp), 0, 0);
        C39633a aVar = new C39633a(loadMoreRecyclerView, C0966R.string.lqa);
        loadMoreRecyclerView.setLoadingView(aVar.f106394d);
        loadMoreRecyclerView.mo63430I(false);
        C103915c.C67105b.m79374b(C103915c.f307262l, loadMoreRecyclerView, (Class) null, (Integer) null, true, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 8182, (Object) null);
        C45447i iVar = new C45447i();
        loadMoreRecyclerView.setAdapter(iVar);
        C8479f0 f0Var = new C8479f0();
        loadMoreRecyclerView.setOnLoadingStateChangedListener(new C45442b(aVar, this, f0Var, iVar));
        C89779i0 Q = C76879j.m92723Q(C39635c.m42240d(this), (String) null, (String) null, true, false, (DialogInterface.OnCancelListener) null);
        MMActivity a = C39635c.m42237a(this);
        if (a != null) {
            a.keep(new C45444c(Q));
        }
        C53895h.m60466d(C54218t.m60906a(this), (C66212f) null, (C53934p0) null, new C45445d(this, Q, aVar, f0Var, iVar, loadMoreRecyclerView, (C15601d<? super C45445d>) null), 3, (Object) null);
    }
}
