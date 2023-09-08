package p828wa;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.luggage.webview.default_impl.C17638a;
import com.tencent.p014mm.plugin.game.luggage.page.C41946e;
import com.tencent.p014mm.plugin.webview.luggage.C43630l1;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import p225rc.C89916g;
import p824tc.C48619a;
import p828wa.C53119o;

/* renamed from: wa.j */
public class C53106j {

    /* renamed from: a */
    public Class<? extends C48619a> f148201a;

    /* renamed from: b */
    public Context f148202b;

    /* renamed from: c */
    public FrameLayout f148203c;

    /* renamed from: d */
    public C53114g<C53104i> f148204d = new C53114g<>((C53107a) null);

    /* renamed from: e */
    public C53100e f148205e;

    /* renamed from: f */
    public C89916g f148206f;

    /* renamed from: g */
    public C53126p f148207g;

    /* renamed from: h */
    public Integer f148208h = null;

    /* renamed from: i */
    public Class<? extends C48619a> f148209i = null;

    /* renamed from: j */
    public C53118n f148210j = new C53113f();

    /* renamed from: wa.j$a */
    public class C53107a implements Runnable {

        /* renamed from: d */
        public boolean f148211d = false;

        /* renamed from: e */
        public final /* synthetic */ boolean f148212e;

        /* renamed from: f */
        public final /* synthetic */ C53104i f148213f;

        /* renamed from: wa.j$a$a */
        public class C53108a implements Runnable {
            public C53108a() {
            }

            public void run() {
                C53107a aVar = C53107a.this;
                C53106j.this.f148204d.push(aVar.f148213f);
                C53106j jVar = C53106j.this;
                if (jVar.f148208h == null) {
                    jVar.f148203c.postDelayed(new C53116l(jVar), 200);
                }
            }
        }

        public C53107a(boolean z, C53104i iVar) {
            this.f148212e = z;
            this.f148213f = iVar;
        }

        public void run() {
            C41946e.C41947a aVar = ((C41946e) C53106j.this).f112993l;
            if (aVar != null) {
                aVar.mo65726b();
            }
            if (!this.f148211d) {
                this.f148211d = true;
                if (C53106j.this.f148204d.peek() != null && this.f148212e) {
                    C53104i peek = C53106j.this.f148204d.peek();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(peek.mo73783b(), "translationX", new float[]{0.0f, -(((float) peek.mo73783b().getWidth()) * 0.25f)});
                    ofFloat.setDuration(250);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(peek.mo73783b(), "translationX", new float[]{0.0f});
                    ofFloat2.setDuration(0);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
                    animatorSet.addListener(new C53103h(peek, (Runnable) null));
                    animatorSet.start();
                    C53106j.this.f148204d.peek().mo73784f();
                }
                this.f148213f.mo73783b().bringToFront();
                View b = this.f148213f.mo73783b();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = b;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/luggage/container/LuggagePageContainer$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                b.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/luggage/container/LuggagePageContainer$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f148213f.mo73786i();
                C53108a aVar3 = new C53108a();
                if (this.f148212e) {
                    C53104i iVar = this.f148213f;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(iVar.mo73783b(), "translationX", new float[]{(float) iVar.mo73783b().getWidth(), 0.0f});
                    ofFloat3.setDuration(250);
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(iVar.mo73783b(), "alpha", new float[]{0.0f, 1.0f});
                    ofFloat4.setDuration(166);
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(new Animator[]{ofFloat3, ofFloat4});
                    animatorSet2.addListener(new C53103h(iVar, aVar3));
                    animatorSet2.start();
                    return;
                }
                aVar3.run();
            }
        }
    }

    /* renamed from: wa.j$b */
    public class C53109b extends C53119o.C53124e {

        /* renamed from: a */
        public final /* synthetic */ Runnable f148216a;

        public C53109b(C53106j jVar, Runnable runnable) {
            this.f148216a = runnable;
        }

        /* renamed from: b */
        public void mo73798b() {
            this.f148216a.run();
        }
    }

    /* renamed from: wa.j$c */
    public class C53110c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53104i f148217d;

        public C53110c(C53104i iVar) {
            this.f148217d = iVar;
        }

        public void run() {
            C53106j.this.mo73795j(this.f148217d);
        }
    }

    /* renamed from: wa.j$d */
    public class C53111d implements Runnable {
        public C53111d() {
        }

        public void run() {
            C53106j.this.f148204d.peek().mo73786i();
        }
    }

    /* renamed from: wa.j$e */
    public class C53112e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C53104i f148220d;

        public C53112e(C53104i iVar) {
            this.f148220d = iVar;
        }

        public void run() {
            C53106j.this.f148203c.removeView(this.f148220d.mo73783b());
        }
    }

    /* renamed from: wa.j$f */
    public class C53113f extends C53118n {
        public C53113f() {
        }
    }

    public C53106j(Activity activity) {
        this.f148202b = activity;
        FrameLayout frameLayout = new FrameLayout(this.f148202b);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(-1);
        this.f148203c = frameLayout;
        this.f148205e = new C53100e();
        this.f148207g = new C53117m(this);
        this.f148206f = C89916g.m112446a(activity);
    }

    /* renamed from: a */
    public void mo73787a() {
        Iterator<C53104i> it = this.f148204d.iterator();
        while (it.hasNext()) {
            it.next().mo65822a();
        }
        Integer num = this.f148208h;
        C53133t tVar = null;
        this.f148208h = null;
        C53133t a = C53136v.m59532a(this.f148202b, num);
        if (a != null && a.f148243g.equals(mo73789c())) {
            tVar = a;
        }
        if (tVar != null) {
            tVar.mo73818f();
        }
        C89916g.m112447b(this.f148202b);
    }

    /* renamed from: b */
    public C53104i mo73788b() {
        if (this.f148204d.size() > 0) {
            return this.f148204d.peek();
        }
        return null;
    }

    /* renamed from: c */
    public final Class<? extends C48619a> mo73789c() {
        if (this.f148209i == null) {
            Class cls = this.f148201a;
            if (cls == null) {
                cls = C17638a.class;
            }
            this.f148209i = cls;
        }
        return this.f148209i;
    }

    /* renamed from: d */
    public void mo67915d() {
        throw null;
    }

    /* renamed from: e */
    public boolean mo73790e() {
        C53104i b = mo73788b();
        if (b == null) {
            return false;
        }
        if (b.f148197e.mo73809a(C53119o.C53120a.class) || b.mo65819d()) {
            return true;
        }
        if (this.f148204d.size() <= 1) {
            return false;
        }
        mo73791f(true);
        return true;
    }

    /* renamed from: f */
    public boolean mo73791f(boolean z) {
        if (this.f148204d.size() <= 1) {
            return false;
        }
        C53104i pop = this.f148204d.pop();
        if (z) {
            C53110c cVar = new C53110c(pop);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pop.mo73783b(), "translationX", new float[]{0.0f, (float) pop.mo73783b().getWidth()});
            ofFloat.setDuration(250);
            ofFloat.addListener(new C53103h(pop, cVar));
            ofFloat.start();
        } else {
            mo73795j(pop);
        }
        if (z) {
            C53104i peek = this.f148204d.peek();
            C53111d dVar = new C53111d();
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(peek.mo73783b(), "translationX", new float[]{-(((float) peek.mo73783b().getWidth()) * 0.25f), 0.0f});
            ofFloat2.setDuration(250);
            ofFloat2.addListener(new C53103h(peek, dVar));
            ofFloat2.start();
        } else {
            this.f148204d.peek().mo73786i();
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo73792g(String str, Bundle bundle) {
        return mo73793h(str, bundle, !this.f148204d.isEmpty());
    }

    /* renamed from: h */
    public boolean mo73793h(String str, Bundle bundle, boolean z) {
        String str2 = str;
        Bundle bundle2 = bundle;
        boolean z2 = z;
        C53104i a = this.f148207g.mo65728a(str2, bundle2);
        if (a == null) {
            Log.m105921e("LuggagePageContainer", "No page specified for url %s", str2);
            return false;
        }
        C41946e eVar = (C41946e) this;
        C41946e.C41947a aVar = eVar.f112993l;
        if (!(aVar != null ? aVar.mo65725a() : true)) {
            Log.m105924i("LuggagePageContainer", "Pushing page is banned");
            return false;
        }
        this.f148203c.addView(a.mo73783b(), 0);
        View b = a.mo73783b();
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar2.mo10233c(4);
        View view = b;
        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/luggage/container/LuggagePageContainer", "push", "(Ljava/lang/String;Landroid/os/Bundle;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/luggage/container/LuggagePageContainer", "push", "(Ljava/lang/String;Landroid/os/Bundle;Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C53107a aVar3 = new C53107a(z2, a);
        a.f148197e.f148228a.put(new C53109b(this, aVar3), Boolean.TRUE);
        C41946e.C41947a aVar4 = eVar.f112993l;
        if (aVar4 != null) {
            aVar4.mo65727c();
        }
        a.mo65794c(str2, bundle2);
        this.f148203c.postDelayed(aVar3, 300);
        if (z2) {
            return true;
        }
        aVar3.run();
        return true;
    }

    /* renamed from: i */
    public boolean mo73794i(String str, Bundle bundle) {
        C53104i a = this.f148207g.mo65728a(str, bundle);
        if (a == null) {
            Log.m105921e("LuggagePageContainer", "No page specified for url %s", str);
            return false;
        }
        this.f148203c.addView(a.mo73783b(), 0);
        this.f148204d.add(a);
        a.mo65794c(str, bundle);
        a.mo73786i();
        if (this.f148208h == null) {
            this.f148203c.postDelayed(new C53116l(this), 200);
        }
        return true;
    }

    /* renamed from: j */
    public final void mo73795j(C53104i iVar) {
        this.f148203c.post(new C53112e(iVar));
        iVar.mo73784f();
        iVar.mo65822a();
    }

    /* renamed from: wa.j$g */
    public class C53114g<E> extends LinkedList<E> {
        public C53114g(C53107a aVar) {
        }

        public boolean add(E e) {
            boolean add = super.add(e);
            if (add) {
                C53106j.this.mo67915d();
            }
            return add;
        }

        public E pop() {
            E pop = super.pop();
            ((C43630l1) C53106j.this).mo67916k();
            return pop;
        }

        public void push(E e) {
            super.push(e);
            C53106j.this.mo67915d();
        }

        public E remove(int i) {
            E remove = super.remove(i);
            ((C43630l1) C53106j.this).mo67916k();
            return remove;
        }

        public void add(int i, E e) {
            super.add(i, e);
            C53106j.this.mo67915d();
        }
    }
}
