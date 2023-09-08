package fh3;

import dh3.C116616b;
import dh3.C116617e;
import eh3.C116770b;
import java.util.List;
import rx3.C13604l;
import sx3.C26236u;

/* renamed from: fh3.l */
public final class C116885l extends C116770b {

    /* renamed from: c */
    public final C116616b f350307c = new C116616b(22);

    /* renamed from: b */
    public List<C116617e> mo180749b() {
        return C26236u.m33719b(this.f350307c);
    }

    /* renamed from: c */
    public String mo180751c() {
        return "listenForSubscriber";
    }

    public C13604l<Boolean, Object> value() {
        return new C13604l<>(Boolean.valueOf(this.f350307c.mo8501a()), null);
    }
}
