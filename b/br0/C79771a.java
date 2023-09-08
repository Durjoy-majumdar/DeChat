package br0;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import br0.C39836d;
import cr0.C86127t;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: br0.a */
public abstract class C79771a implements C39836d {

    /* renamed from: a */
    public final C39836d.C39839b f233779a = new C79772a();

    /* renamed from: b */
    public C79774c f233780b;

    /* renamed from: c */
    public C39836d.C39839b f233781c;

    /* renamed from: d */
    public View f233782d;

    /* renamed from: e */
    public WebChromeClient.CustomViewCallback f233783e;

    /* renamed from: f */
    public int f233784f;

    /* renamed from: g */
    public ViewGroup.LayoutParams f233785g;

    /* renamed from: h */
    public ViewGroup f233786h;

    /* renamed from: i */
    public final Set<C79773b> f233787i = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: j */
    public View f233788j;

    /* renamed from: k */
    public boolean f233789k = false;

    /* renamed from: br0.a$a */
    public class C79772a implements C39836d.C39839b {
        public C79772a() {
        }

        /* renamed from: a */
        public ViewGroup mo62481a(View view) {
            C79774c cVar = C79771a.this.f233780b;
            Activity w = cVar instanceof C86127t ? ((C86127t) cVar).mo120548w() : null;
            return w == null ? (ViewGroup) view.getRootView() : (ViewGroup) w.getWindow().getDecorView();
        }
    }

    public C79771a(C79774c cVar, C39836d.C39839b bVar) {
        this.f233781c = bVar;
        this.f233780b = cVar;
    }

    /* renamed from: a */
    public void mo62473a(C79773b bVar) {
        if (bVar != null) {
            this.f233787i.add(bVar);
        }
    }

    /* renamed from: b */
    public void mo62474b(WebChromeClient.CustomViewCallback customViewCallback) {
        this.f233783e = customViewCallback;
    }

    /* renamed from: c */
    public void mo62475c(View view, int i) {
        this.f233789k = true;
        C39836d.C39839b bVar = this.f233781c;
        if (bVar == null) {
            bVar = this.f233779a;
        }
        View view2 = this.f233782d;
        this.f233788j = view2;
        this.f233782d = view;
        if (view2 == null) {
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                this.f233786h = viewGroup;
                this.f233784f = viewGroup.indexOfChild(view);
                this.f233785g = view.getLayoutParams();
                this.f233786h.removeView(view);
            } else {
                this.f233784f = 0;
                this.f233786h = null;
                this.f233785g = null;
            }
            ViewGroup a = bVar.mo62481a(view);
            a.addView(view, new ViewGroup.LayoutParams(-1, -1));
            a.bringChildToFront(view);
            ViewParent parent = a.getParent();
            if (parent != null) {
                parent.bringChildToFront(a);
            }
            view.setX(0.0f);
            view.setY(0.0f);
        }
    }

    /* renamed from: d */
    public boolean mo62476d() {
        if (this.f233782d == null) {
            return false;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f233783e;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        if (this.f233782d.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f233782d.getParent()).removeView(this.f233782d);
        }
        ViewGroup viewGroup = this.f233786h;
        if (viewGroup != null) {
            viewGroup.addView(this.f233782d, this.f233784f, this.f233785g);
        }
        this.f233782d = null;
        this.f233783e = null;
        this.f233789k = false;
        return true;
    }

    /* renamed from: f */
    public void mo62478f(C79773b bVar) {
        if (bVar != null) {
            this.f233787i.remove(bVar);
        }
    }

    /* renamed from: g */
    public final boolean mo62479g() {
        return this.f233789k;
    }

    /* renamed from: h */
    public void mo109899h() {
        for (C79773b f : this.f233787i) {
            f.mo109901f();
        }
    }

    public void release() {
        mo62476d();
        this.f233787i.clear();
        this.f233783e = null;
    }
}
