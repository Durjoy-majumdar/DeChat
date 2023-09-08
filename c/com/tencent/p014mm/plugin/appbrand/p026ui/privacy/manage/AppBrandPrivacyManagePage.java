package com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage;

import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C54218t;
import as0.C39633a;
import as0.C39635c;
import at0.C103915c;
import bs0.C28412a;
import bs0.C79785b;
import bs0.C79786c;
import bs0.C79788d;
import bs0.C79789e;
import bs0.C79791f;
import bs0.C79792g;
import bs0.C79798p;
import bs0.C79800r;
import bs0.C79807t;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.IXWebBroadcastListener;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C76879j;
import p385u2.C111105a;
import qo3.C89779i0;
import rx3.C13598b0;
import sx3.C36907w;
import te3.y75;
import wx3.C15601d;
import wx3.C66212f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage;", "Lcom/tencent/mm/ui/MMFragment;", "<init>", "()V", "a", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage */
public final class AppBrandPrivacyManagePage extends MMFragment {

    /* renamed from: e */
    public static final C84576a f246784e = new C84576a((C8480h) null);

    /* renamed from: d */
    public C28412a f246785d;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandPrivacyManagePage$a */
    public static final class C84576a {
        public C84576a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo117264a(Activity activity, Class<? extends MMActivity> cls) {
            C87412m.m108594g(activity, "srcActivity");
            C87412m.m108594g(cls, "dstActivityClass");
            Log.m105924i("MicroMsg.AppBrandPrivacyManagePage", IXWebBroadcastListener.STAGE_START);
            Intent intent = new Intent(activity, cls);
            C39635c.m42239c(intent, AppBrandPrivacyManagePage.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/app/Activity;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(activity, "com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandPrivacyManagePage$Companion", IXWebBroadcastListener.STAGE_START, "(Landroid/app/Activity;Ljava/lang/Class;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public AppBrandPrivacyManagePage() {
        super(true);
    }

    /* renamed from: K */
    public final C79800r mo117261K(C79800r rVar) {
        T t;
        T t2;
        Iterator<T> it = rVar.f233865b.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (C87412m.m108589b("scope.userLocationBackground", ((y75) t2).f145164d)) {
                break;
            }
        }
        y75 y75 = (y75) t2;
        if (y75 == null) {
            return rVar;
        }
        Iterator<T> it4 = rVar.f233865b.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            T next = it4.next();
            if (C87412m.m108589b("scope.userLocation", ((y75) next).f145164d)) {
                t = next;
                break;
            }
        }
        if (!(t != null)) {
            return rVar;
        }
        Log.m105924i("MicroMsg.AppBrandPrivacyManagePage", "filterDuplicateBackgroundScope, both background and backgroundLocation are authorized for " + rVar.f233864a.field_username);
        WxaAttributes wxaAttributes = rVar.f233864a;
        ArrayList arrayList = new ArrayList(rVar.f233865b);
        arrayList.remove(y75);
        return new C79800r(wxaAttributes, arrayList, rVar.f233866c);
    }

    /* renamed from: L */
    public final List<C79800r> mo117262L(C79807t tVar) {
        List<C79800r> list = tVar.f233878b;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C79800r K : list) {
            arrayList.add(mo117261K(K));
        }
        return arrayList;
    }

    /* renamed from: M */
    public final void mo117263M(C28412a aVar) {
        if (this.f246785d != aVar) {
            int ordinal = aVar.ordinal();
            if (ordinal == 0) {
                Log.m105924i("MicroMsg.AppBrandPrivacyManagePage", "showActionbarDefault");
                setMMTitle("");
                C39635c.m42238b(this);
                C39635c.m42241e(this, C111105a.m151500b(C39635c.m42240d(this), C0966R.color.f2929c));
            } else if (ordinal == 1) {
                Log.m105924i("MicroMsg.AppBrandPrivacyManagePage", "showActionbarWithTitle");
                setMMTitle((int) C0966R.string.lq9);
                MMActivity a = C39635c.m42237a(this);
                if (a != null) {
                    a.showActionbarLine();
                    C13598b0 b0Var = C13598b0.f38549a;
                }
                C39635c.m42241e(this, C111105a.m151500b(C39635c.m42240d(this), C0966R.color.f2927a));
            }
            this.f246785d = aVar;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cjt;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C87412m.m108594g(view, "view");
        super.onViewCreated(view, bundle);
        setBackBtn(new C79785b(this));
        mo117263M(C28412a.DEFAULT);
        C39635c.m42242f(this, C111105a.m151500b(C39635c.m42240d(this), C0966R.color.f2929c));
        View findViewById = findViewById(C0966R.C0970id.brh);
        ViewGroup viewGroup = null;
        LoadMoreRecyclerView loadMoreRecyclerView = findViewById instanceof LoadMoreRecyclerView ? (LoadMoreRecyclerView) findViewById : null;
        if (loadMoreRecyclerView == null) {
            Log.m105928w("MicroMsg.AppBrandPrivacyManagePage", "initContentArea, authInfoContentArea is null");
            finish();
            return;
        }
        int f = C76577a.m92155f(C39635c.m42240d(this), C0966R.dimen.f3743cv);
        loadMoreRecyclerView.setPadding(f, 0, f, 0);
        View inflate = getLayoutInflater().inflate(C0966R.C0971layout.cjs, loadMoreRecyclerView, false);
        if (inflate instanceof ViewGroup) {
            viewGroup = (ViewGroup) inflate;
        }
        if (viewGroup == null) {
            Log.m105928w("MicroMsg.AppBrandPrivacyManagePage", "initContentArea, headerView is null");
            finish();
            return;
        }
        viewGroup.post(new C79786c(viewGroup, this, loadMoreRecyclerView));
        loadMoreRecyclerView.addHeaderView(viewGroup);
        C39633a aVar = new C39633a(loadMoreRecyclerView, C0966R.string.jki);
        loadMoreRecyclerView.setLoadingView(aVar.f106394d);
        loadMoreRecyclerView.mo63430I(false);
        C103915c.C67105b.m79374b(C103915c.f307262l, loadMoreRecyclerView, (Class) null, (Integer) null, true, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 8182, (Object) null);
        C79798p pVar = new C79798p();
        loadMoreRecyclerView.setAdapter(pVar);
        loadMoreRecyclerView.setOnItemClickListener(new C79788d(pVar, this));
        C8479f0 f0Var = new C8479f0();
        loadMoreRecyclerView.setOnLoadingStateChangedListener(new C79789e(aVar, this, f0Var, pVar));
        C89779i0 Q = C76879j.m92723Q(C39635c.m42240d(this), (String) null, (String) null, true, false, (DialogInterface.OnCancelListener) null);
        MMActivity a = C39635c.m42237a(this);
        if (a != null) {
            a.keep(new C79791f(Q));
        }
        C53895h.m60466d(C54218t.m60906a(this), (C66212f) null, (C53934p0) null, new C79792g(Q, viewGroup, aVar, f0Var, pVar, this, loadMoreRecyclerView, (C15601d<? super C79792g>) null), 3, (Object) null);
    }
}
