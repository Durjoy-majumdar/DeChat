package yq0;

import android.text.TextUtils;
import android.view.View;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.sdk.platformtools.Log;
import gt0.C87330d0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import te3.C90411fk2;
import te3.C90429p4;
import te3.C90437rw3;
import te3.gp4;
import yq0.C91548e;
import yq0.C91566l;
import zp0.C16377l;

/* renamed from: yq0.j */
public class C91560j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f262396d;

    /* renamed from: e */
    public final /* synthetic */ C81879g f262397e;

    /* renamed from: f */
    public final /* synthetic */ String f262398f;

    /* renamed from: g */
    public final /* synthetic */ C90411fk2 f262399g;

    /* renamed from: h */
    public final /* synthetic */ String f262400h;

    /* renamed from: i */
    public final /* synthetic */ String f262401i;

    /* renamed from: j */
    public final /* synthetic */ C16377l f262402j;

    /* renamed from: n */
    public final /* synthetic */ String f262403n;

    /* renamed from: o */
    public final /* synthetic */ C90437rw3 f262404o;

    /* renamed from: p */
    public final /* synthetic */ String f262405p;

    /* renamed from: q */
    public final /* synthetic */ String f262406q;

    /* renamed from: r */
    public final /* synthetic */ boolean f262407r;

    /* renamed from: s */
    public final /* synthetic */ String f262408s;

    /* renamed from: t */
    public final /* synthetic */ C91548e f262409t;

    /* renamed from: yq0.j$a */
    public class C91561a implements C91566l.C91570c {

        /* renamed from: yq0.j$a$a */
        public class C91562a implements C91548e.C91555f {

            /* renamed from: a */
            public final /* synthetic */ boolean f262411a;

            public C91562a(boolean z) {
                this.f262411a = z;
            }

            public void callback() {
                if (this.f262411a) {
                    ((C91548e.C91549a) C91560j.this.f262409t.f262378a).mo115867a();
                }
            }
        }

        /* renamed from: yq0.j$a$b */
        public class C91563b implements C91548e.C91555f {
            public C91563b() {
            }

            public void callback() {
                ((C91548e.C91549a) C91560j.this.f262409t.f262378a).mo115868b((String) null);
            }
        }

        public C91561a() {
        }

        /* renamed from: a */
        public void mo114536a(int i, ArrayList<String> arrayList, int i2, boolean z) {
            boolean z2;
            int i3 = i;
            ArrayList<String> arrayList2 = arrayList;
            C91560j jVar = C91560j.this;
            String str = jVar.f262398f;
            if (jVar.f262399g.f259515e.size() > 1) {
                str = (arrayList2 == null ? Collections.emptyList() : arrayList2).size() > 0 ? arrayList2.get(0) : C91560j.this.f262398f;
                C91560j jVar2 = C91560j.this;
                Log.m105925i("MicroMsg.AppBrandJsApiUserAuth", "response.jsapi_scope %s, scopeAcc %s, appId %s, api %s", jVar2.f262399g.f259523p, str, jVar2.f262400h, jVar2.f262401i);
                C91560j jVar3 = C91560j.this;
                String str2 = jVar3.f262399g.f259523p;
                if (str2 == null) {
                    ((C91548e.C91549a) jVar3.f262409t.f262378a).onCancel();
                    return;
                }
                z2 = str2.equals(str);
            } else {
                z2 = true;
            }
            if (i3 == 1) {
                C91560j jVar4 = C91560j.this;
                C91548e.m114886b(jVar4.f262409t, jVar4.f262402j, str, 1, z2, z, new C91562a(z2));
                if (!z2) {
                    C91560j jVar5 = C91560j.this;
                    Log.m105925i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth appId %s, api %s , target scope:%s, accept scope:%s, deny!", jVar5.f262400h, jVar5.f262401i, jVar5.f262398f, str);
                    ((C91548e.C91549a) C91560j.this.f262409t.f262378a).mo115868b((String) null);
                    return;
                }
                if (C91560j.this.f262398f.equals("scope.voip")) {
                    C91576o.m114916a(C91560j.this.f262397e);
                }
                C91548e.C91550b bVar = C91548e.f262377e;
                C91560j jVar6 = C91560j.this;
                bVar.mo122464e(jVar6.f262400h, jVar6.f262401i);
                C91560j jVar7 = C91560j.this;
                Log.m105925i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user confirm, appId %s, api %s", jVar7.f262400h, jVar7.f262401i);
            } else if (i3 == 2) {
                C91560j jVar8 = C91560j.this;
                C91548e.m114886b(jVar8.f262409t, jVar8.f262402j, str, 2, z2, z, new C91563b());
                C91548e.C91550b bVar2 = C91548e.f262377e;
                C91560j jVar9 = C91560j.this;
                bVar2.mo122465f(jVar9.f262400h, jVar9.f262401i);
                C91560j jVar10 = C91560j.this;
                Log.m105925i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user deny, appId %s, api %s", jVar10.f262400h, jVar10.f262401i);
            } else if (i3 == 3) {
                C91548e.C91550b bVar3 = C91548e.f262377e;
                C91560j jVar11 = C91560j.this;
                bVar3.mo122465f(jVar11.f262400h, jVar11.f262401i);
                C91560j jVar12 = C91560j.this;
                Log.m105925i("MicroMsg.AppBrandJsApiUserAuth", "requestUserAuth, user cancel, appId %s, api %s", jVar12.f262400h, jVar12.f262401i);
                ((C91548e.C91549a) C91560j.this.f262409t.f262378a).onCancel();
            }
        }
    }

    /* renamed from: yq0.j$b */
    public class C91564b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91566l f262414d;

        /* renamed from: e */
        public final /* synthetic */ String f262415e;

        public C91564b(C91566l lVar, String str) {
            this.f262414d = lVar;
            this.f262415e = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/permission/jsauth/AppBrandJsApiUserAuth$6$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C91566l lVar = this.f262414d;
            C81879g gVar = C91560j.this.f262397e;
            lVar.mo121450n(gVar, this.f262415e, (C40469j0) gVar.mo109668l(C40469j0.class)).mo121451o(C91560j.this.f262397e);
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/permission/jsauth/AppBrandJsApiUserAuth$6$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C91560j(C91548e eVar, AppBrandRuntime appBrandRuntime, C81879g gVar, String str, C90411fk2 fk22, String str2, String str3, C16377l lVar, String str4, C90437rw3 rw32, String str5, String str6, boolean z, String str7) {
        this.f262409t = eVar;
        this.f262396d = appBrandRuntime;
        this.f262397e = gVar;
        this.f262398f = str;
        this.f262399g = fk22;
        this.f262400h = str2;
        this.f262401i = str3;
        this.f262402j = lVar;
        this.f262403n = str4;
        this.f262404o = rw32;
        this.f262405p = str5;
        this.f262406q = str6;
        this.f262407r = z;
        this.f262408s = str7;
    }

    public void run() {
        if (this.f262396d.mo113042Z() != null) {
            C91566l a = C91566l.C91567a.m114904a(this.f262397e, new C91561a(), this.f262399g.f259515e);
            a.setAppBrandName(this.f262396d.mo113051d0().f261061d);
            a.setApplyWording(this.f262403n);
            a.setRequestDesc(this.f262404o.f259823e);
            a.setNegativeButtonText(this.f262405p);
            a.setPositiveButtonText(this.f262406q);
            a.setIconUrl(this.f262399g.f259517g);
            LinkedList<C90437rw3> linkedList = this.f262399g.f259515e;
            String str = (linkedList == null || linkedList.size() <= 0) ? "" : this.f262399g.f259515e.get(0).f259827i;
            if (!TextUtils.isEmpty(str)) {
                a.setSimpleDetailDesc(str);
            } else if (this.f262407r) {
                a.setSimpleDetailDesc(this.f262408s);
            }
            if (this.f262409t.mo113354c(this.f262396d)) {
                a.mo121473t(false);
            } else {
                C90429p4 p4Var = this.f262399g.f259521n;
                boolean z = p4Var == null ? false : p4Var.f259729d;
                String str2 = p4Var == null ? null : p4Var.f259730e;
                if (!z || TextUtils.isEmpty(str2)) {
                    a.mo121473t(false);
                } else {
                    a.mo121473t(true);
                    a.setExplainOnClickListener(new C91564b(a, str2));
                }
            }
            if (this.f262399g.f259515e.size() > 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C87330d0.C87331a(1, this.f262399g.f259515e.get(0).f259828j, this.f262399g.f259515e.get(0).f259822d, true));
                for (int i = 1; i < this.f262399g.f259515e.size(); i++) {
                    arrayList.add(new C87330d0.C87331a(1, this.f262399g.f259515e.get(i).f259828j, this.f262399g.f259515e.get(i).f259822d, false));
                }
                a.setFunctionButtonVisibility(8);
                a.setSelectListItem(arrayList);
            }
            gp4 gp4 = this.f262399g.f259524q;
            if (gp4 != null && gp4.f183354d && !TextUtils.isEmpty(gp4.f183355e)) {
                a.setUserAgreementCheckBoxWording(this.f262399g.f259524q.f183355e);
                a.setIExternalToolsHelper((C40469j0) this.f262397e.mo109668l(C40469j0.class));
            }
            a.mo121451o(this.f262397e);
        }
    }
}
