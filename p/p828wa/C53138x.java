package p828wa;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import p361me.imid.swipebacklayout.lib.SwipeBackLayout;
import p828wa.C53104i;
import p828wa.C53119o;

/* renamed from: wa.x */
public class C53138x extends C53104i implements C53095a {

    /* renamed from: h */
    public View f148258h;

    /* renamed from: i */
    public C53133t f148259i;

    /* renamed from: j */
    public SwipeBackLayout f148260j;

    /* renamed from: n */
    public Bundle f148261n;

    /* renamed from: o */
    public String f148262o = null;

    /* renamed from: p */
    public C53135u f148263p = new C53139a();

    /* renamed from: wa.x$a */
    public class C53139a extends C53135u {
        public C53139a() {
        }

        /* renamed from: a */
        public String mo65889a() {
            C53138x xVar = C53138x.this;
            if (xVar.f148262o == null) {
                String k = xVar.mo65883k();
                if (TextUtils.isEmpty(k)) {
                    k = "";
                }
                xVar.f148262o = k;
            }
            return xVar.f148262o;
        }

        /* renamed from: b */
        public void mo65890b(String str) {
            C53138x xVar = C53138x.this;
            C53104i.C53105a aVar = xVar.f148199g;
            if (((C53140b) aVar) != null) {
                ((C53140b) aVar).mo67949c(xVar, str);
            }
            C53138x.this.f148197e.mo73809a(C53119o.C53124e.class);
        }

        /* renamed from: c */
        public void mo65891c(String str) {
            C53138x xVar = C53138x.this;
            C53104i.C53105a aVar = xVar.f148199g;
            if (((C53140b) aVar) != null) {
                ((C53140b) aVar).mo67950d(xVar, str);
            }
        }

        /* renamed from: d */
        public WebResourceResponse mo65892d(WebResourceRequest webResourceRequest, Bundle bundle) {
            C53104i.C53105a aVar = C53138x.this.f148199g;
            if (((C53140b) aVar) != null) {
                return ((C53140b) aVar).mo67948a(webResourceRequest, bundle);
            }
            return null;
        }

        /* renamed from: e */
        public WebResourceResponse mo65893e(String str) {
            C53104i.C53105a aVar = C53138x.this.f148199g;
            if (((C53140b) aVar) != null) {
                return ((C53140b) aVar).mo73828b(str);
            }
            return null;
        }
    }

    /* renamed from: wa.x$b */
    public static class C53140b extends C53104i.C53105a {
        public C53140b() {
        }

        /* renamed from: a */
        public WebResourceResponse mo67948a(WebResourceRequest webResourceRequest, Bundle bundle) {
            C53104i.C53105a aVar = this.f148200a;
            if (aVar instanceof C53140b) {
                return ((C53140b) aVar).mo67948a(webResourceRequest, bundle);
            }
            return null;
        }

        /* renamed from: b */
        public WebResourceResponse mo73828b(String str) {
            C53104i.C53105a aVar = this.f148200a;
            if (aVar instanceof C53140b) {
                return ((C53140b) aVar).mo73828b(str);
            }
            return null;
        }

        /* renamed from: c */
        public void mo67949c(C53138x xVar, String str) {
            C53104i.C53105a aVar = this.f148200a;
            if (aVar instanceof C53140b) {
                ((C53140b) aVar).mo67949c(xVar, str);
            }
        }

        /* renamed from: d */
        public void mo67950d(C53138x xVar, String str) {
            C53104i.C53105a aVar = this.f148200a;
            if (aVar instanceof C53140b) {
                ((C53140b) aVar).mo67950d(xVar, str);
            }
        }

        public C53140b(C53104i.C53105a aVar) {
            super(aVar);
        }
    }

    public C53138x(C53118n nVar, C53133t tVar, Bundle bundle) {
        super(nVar);
        this.f148261n = bundle == null ? new Bundle() : bundle;
        this.f148259i = tVar;
        if (tVar == null) {
            C53106j jVar = C53106j.this;
            Integer num = jVar.f148208h;
            jVar.f148208h = null;
            C53133t a = C53136v.m59532a(jVar.f148202b, num);
            tVar = (a == null || !a.f148243g.equals(jVar.mo73789c())) ? null : a;
        }
        tVar = tVar == null ? new C53133t(this.f148196d, C53106j.this.mo73789c()) : tVar;
        this.f148259i = tVar;
        for (Class e : (LinkedList) C53106j.this.f148205e.f148191a.clone()) {
            tVar.mo73816e(e, this);
        }
        tVar.f148244h = this.f148263p;
        View l = mo65803l();
        SwipeBackLayout swipeBackLayout = new SwipeBackLayout(this.f148196d, (AttributeSet) null);
        this.f148260j = swipeBackLayout;
        swipeBackLayout.setScrimColor(0);
        this.f148260j.addView(l);
        this.f148260j.setContentView(l);
        this.f148260j.mo33654a(new C53137w(this, new boolean[]{false}));
        this.f148258h = this.f148260j;
    }

    /* renamed from: a */
    public void mo65822a() {
        mo65800g();
        this.f148197e.mo73809a(C53119o.C53122c.class);
        C53133t tVar = this.f148259i;
        ViewParent parent = tVar.f148245i.getView().getParent();
        if (parent instanceof ViewGroup) {
            Log.m105924i("Luggage.LuggageWebCore", "removeSelfFromParent");
            ((ViewGroup) parent).removeView(tVar.f148245i.getView());
        }
        mo65802j();
    }

    /* renamed from: b */
    public View mo73783b() {
        return this.f148258h;
    }

    /* renamed from: c */
    public void mo65794c(String str, Bundle bundle) {
        this.f148259i.mo73821i(str);
    }

    /* renamed from: d */
    public boolean mo65819d() {
        C53133t tVar = this.f148259i;
        if (!(tVar.f148245i.canGoBack() && tVar.f148252s)) {
            return false;
        }
        this.f148259i.f148245i.goBack();
        return true;
    }

    public C53127q getRuntime() {
        return this.f148259i;
    }

    /* renamed from: j */
    public void mo65802j() {
        this.f148259i.mo73818f();
    }

    /* renamed from: k */
    public String mo65883k() {
        return "";
    }

    /* renamed from: l */
    public View mo65803l() {
        return this.f148259i.f148245i.getView();
    }
}
