package p813fl;

import androidx.recyclerview.widget.C54248l;
import gy3.C87412m;
import java.util.List;

/* renamed from: fl.m0 */
public final class C97917m0 extends C54248l.C54250b {

    /* renamed from: a */
    public final /* synthetic */ List<C97927q0> f287231a;

    /* renamed from: b */
    public final /* synthetic */ List<C97927q0> f287232b;

    public C97917m0(List<? extends C97927q0> list, List<? extends C97927q0> list2) {
        this.f287231a = list;
        this.f287232b = list2;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        return this.f287231a.get(i).mo136854a(this.f287232b.get(i2));
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        return C87412m.m108589b(this.f287231a.get(i), this.f287232b.get(i2));
    }

    /* renamed from: d */
    public int mo11468d() {
        return this.f287232b.size();
    }

    /* renamed from: e */
    public int mo11469e() {
        return this.f287231a.size();
    }
}
