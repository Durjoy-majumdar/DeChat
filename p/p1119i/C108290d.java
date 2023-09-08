package p1119i;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import p1119i.C108285b;

/* renamed from: i.d */
public class C108290d extends C108285b {

    /* renamed from: t */
    public C108291a f324243t;

    /* renamed from: u */
    public boolean f324244u;

    /* renamed from: i.d$a */
    public static class C108291a extends C108285b.C108288c {

        /* renamed from: H */
        public int[][] f324245H;

        public C108291a(C108291a aVar, C108290d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f324245H = aVar.f324245H;
            } else {
                this.f324245H = new int[this.f324222g.length][];
            }
        }

        /* renamed from: e */
        public void mo158673e() {
            int[][] iArr = this.f324245H;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.f324245H[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.f324245H = iArr2;
        }

        /* renamed from: g */
        public int mo158751g(int[] iArr) {
            int[][] iArr2 = this.f324245H;
            int i = this.f324223h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C108290d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C108290d(this, resources);
        }
    }

    public C108290d(C108291a aVar, Resources resources) {
        mo158665e(new C108291a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* renamed from: e */
    public void mo158665e(C108285b.C108288c cVar) {
        this.f324195d = cVar;
        int i = this.f324201j;
        if (i >= 0) {
            Drawable d = cVar.mo158720d(i);
            this.f324197f = d;
            if (d != null) {
                mo158681c(d);
            }
        }
        this.f324198g = null;
        if (cVar instanceof C108291a) {
            this.f324243t = (C108291a) cVar;
        }
    }

    /* renamed from: f */
    public C108291a mo158664b() {
        return new C108291a(this.f324243t, this, (Resources) null);
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f324244u) {
            super.mutate();
            this.f324243t.mo158673e();
            this.f324244u = true;
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int g = this.f324243t.mo158751g(iArr);
        if (g < 0) {
            g = this.f324243t.mo158751g(StateSet.WILD_CARD);
        }
        return mo158683d(g) || onStateChange;
    }

    public C108290d(C108291a aVar) {
        if (aVar != null) {
            mo158665e(aVar);
        }
    }
}
