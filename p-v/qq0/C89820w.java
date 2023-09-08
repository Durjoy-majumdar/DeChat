package qq0;

import android.graphics.drawable.Drawable;
import java.util.LinkedList;
import qq0.C89816t;

/* renamed from: qq0.w */
public abstract class C89820w extends C89810o {

    /* renamed from: d */
    public final LinkedList<C89822b> f258222d = new C89821a();

    /* renamed from: qq0.w$a */
    public class C89821a extends LinkedList<C89822b> {
        public C89821a() {
        }

        public boolean remove(Object obj) {
            boolean remove = super.remove(obj);
            C89820w wVar = C89820w.this;
            C89822b peekFirst = wVar.f258222d.peekFirst();
            Drawable drawable = null;
            CharSequence charSequence = peekFirst == null ? null : peekFirst.f258225e;
            C89794b bVar = (C89794b) wVar;
            if (!bVar.mo124078i()) {
                bVar.f258177f.mo124099a(charSequence);
            }
            if (peekFirst != null) {
                drawable = peekFirst.f258224d;
            }
            bVar.f258178g = drawable;
            if (!bVar.mo124078i()) {
                bVar.f258177f.mo124102g(drawable);
            }
            int i = peekFirst == null ? Integer.MIN_VALUE : peekFirst.f258228h;
            bVar.f258179h = i;
            if (!bVar.mo124078i()) {
                bVar.f258177f.mo124100d(i);
            }
            return remove;
        }
    }

    /* renamed from: qq0.w$b */
    public final class C89822b implements C89816t.C89818b {

        /* renamed from: d */
        public Drawable f258224d = null;

        /* renamed from: e */
        public CharSequence f258225e = null;

        /* renamed from: f */
        public boolean f258226f;

        /* renamed from: g */
        public String f258227g = "";

        /* renamed from: h */
        public int f258228h = Integer.MIN_VALUE;

        /* renamed from: qq0.w$b$a */
        public class C89823a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Drawable f258230d;

            public C89823a(Drawable drawable) {
                this.f258230d = drawable;
            }

            public void run() {
                C89822b bVar = C89822b.this;
                bVar.f258224d = this.f258230d;
                if (C89820w.this.f258222d.peekFirst() == bVar) {
                    C89822b bVar2 = C89822b.this;
                    C89820w wVar = C89820w.this;
                    Drawable drawable = bVar2.f258224d;
                    C89794b bVar3 = (C89794b) wVar;
                    bVar3.f258178g = drawable;
                    if (!bVar3.mo124078i()) {
                        bVar3.f258177f.mo124102g(drawable);
                    }
                }
            }
        }

        /* renamed from: qq0.w$b$b */
        public class C89824b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ CharSequence f258232d;

            public C89824b(CharSequence charSequence) {
                this.f258232d = charSequence;
            }

            public void run() {
                C89822b bVar = C89822b.this;
                bVar.f258225e = this.f258232d;
                if (C89820w.this.f258222d.peekFirst() == bVar) {
                    C89820w wVar = C89820w.this;
                    CharSequence charSequence = this.f258232d;
                    C89794b bVar2 = (C89794b) wVar;
                    if (!bVar2.mo124078i()) {
                        bVar2.f258177f.mo124099a(charSequence);
                    }
                }
            }
        }

        /* renamed from: qq0.w$b$c */
        public class C89825c implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f258234d;

            public C89825c(int i) {
                this.f258234d = i;
            }

            public void run() {
                C89822b bVar = C89822b.this;
                bVar.f258228h = this.f258234d;
                if (C89820w.this.f258222d.peekFirst() == bVar) {
                    C89820w wVar = C89820w.this;
                    int i = this.f258234d;
                    C89794b bVar2 = (C89794b) wVar;
                    bVar2.f258179h = i;
                    if (!bVar2.mo124078i()) {
                        bVar2.f258177f.mo124100d(i);
                    }
                }
            }
        }

        /* renamed from: qq0.w$b$d */
        public class C89826d implements Runnable {
            public C89826d() {
            }

            public void run() {
                C89822b bVar = C89822b.this;
                C89820w.this.f258222d.remove(bVar);
            }
        }

        public C89822b(boolean z) {
            this.f258226f = z;
        }

        /* renamed from: a */
        public void mo124099a(CharSequence charSequence) {
            C89820w.this.mo124077h(new C89824b(charSequence));
        }

        /* renamed from: d */
        public void mo124100d(int i) {
            C89820w.this.mo124077h(new C89825c(i));
        }

        public void dismiss() {
            C89820w.this.mo124077h(new C89826d());
        }

        /* renamed from: g */
        public void mo124102g(Drawable drawable) {
            C89820w.this.mo124077h(new C89823a(drawable));
        }
    }
}
