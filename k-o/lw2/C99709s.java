package lw2;

import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.sdk.platformtools.Util;
import ew2.C97757a;
import java.util.List;

/* renamed from: lw2.s */
public final class C99709s extends C54248l.C54250b {

    /* renamed from: a */
    public final /* synthetic */ C99706q f292247a;

    /* renamed from: b */
    public final /* synthetic */ List<C97757a> f292248b;

    public C99709s(C99706q qVar, List<C97757a> list) {
        this.f292247a = qVar;
        this.f292248b = list;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        return this.f292247a.f292238d.get(i).f286813f == this.f292248b.get(i2).f286813f && Util.isEqual(this.f292247a.f292238d.get(i).f286809b, this.f292248b.get(i2).f286809b);
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        return this.f292247a.f292238d.get(i).f286811d == this.f292248b.get(i2).f286811d && this.f292247a.f292238d.get(i).f286812e == this.f292248b.get(i2).f286812e;
    }

    /* renamed from: d */
    public int mo11468d() {
        return this.f292248b.size();
    }

    /* renamed from: e */
    public int mo11469e() {
        return this.f292247a.f292238d.size();
    }
}
