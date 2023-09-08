package ml2;

import android.os.Bundle;
import com.tencent.p014mm.plugin.scanner.view.C94528d;
import com.tencent.scanlib.p325ui.ScanView;
import gy3.C87412m;
import ml2.C99930e;
import nl2.C21671i;
import nl2.C21672j;
import nl2.C21683r;

/* renamed from: ml2.g */
public final class C99932g extends C10931f<C34591a<Object>> {

    /* renamed from: g */
    public C99930e f292797g;

    /* renamed from: h */
    public C21672j f292798h;

    /* renamed from: i */
    public boolean f292799i;

    /* renamed from: ml2.g$a */
    public static final class C34591a<T> {

        /* renamed from: a */
        public final int f93007a;

        /* renamed from: b */
        public final T f93008b;

        public C34591a(int i, T t) {
            this.f93007a = i;
            this.f93008b = t;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C34591a)) {
                return false;
            }
            C34591a aVar = (C34591a) obj;
            return this.f93007a == aVar.f93007a && C87412m.m108589b(this.f93008b, aVar.f93008b);
        }

        public int hashCode() {
            int i = this.f93007a * 31;
            T t = this.f93008b;
            return i + (t == null ? 0 : t.hashCode());
        }

        public String toString() {
            return "ScanCodeProductMergeData(type=" + this.f93007a + ", data=" + this.f93008b + ')';
        }
    }

    public C99932g(int i, int i2, boolean z, ScanView scanView, C99930e.C99931a aVar, C94528d dVar, C21671i iVar) {
        C87412m.m108594g(scanView, "scanView");
        C87412m.m108594g(aVar, "uiCallback");
        C87412m.m108594g(dVar, "loadingViewModel");
        C87412m.m108594g(iVar, "aiImageHandleCallback");
        this.f292797g = new C99930e(i, i2, z, scanView, aVar, dVar);
        this.f292798h = new C21672j(iVar);
    }

    /* renamed from: a */
    public void mo360a(long j, Object obj) {
        C21672j jVar;
        C34591a aVar = (C34591a) obj;
        if (!this.f292799i) {
            boolean z = false;
            if (aVar != null && aVar.f93007a == 1) {
                T t = aVar.f93008b;
                if (t instanceof Bundle) {
                    C99930e eVar = this.f292797g;
                    if (eVar != null) {
                        eVar.mo360a(j, (Bundle) t);
                        return;
                    }
                    return;
                }
            }
            if (aVar != null && aVar.f93007a == 2) {
                z = true;
            }
            if (z) {
                T t2 = aVar.f93008b;
                if ((t2 instanceof C21683r) && (jVar = this.f292798h) != null) {
                    jVar.mo360a(j, (C21683r) t2);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo11131c(long j, boolean z) {
    }

    public void destroy() {
        this.f292799i = true;
        C99930e eVar = this.f292797g;
        if (eVar != null) {
            eVar.destroy();
        }
        C21672j jVar = this.f292798h;
        if (jVar != null) {
            jVar.destroy();
        }
    }
}
