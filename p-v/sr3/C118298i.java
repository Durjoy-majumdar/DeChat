package sr3;

import java.util.Collections;
import java.util.Map;

/* renamed from: sr3.i */
public class C118298i {

    /* renamed from: e */
    public static final C118298i f353559e = new C118298i();

    /* renamed from: a */
    public boolean f353560a;

    /* renamed from: b */
    public String f353561b;

    /* renamed from: c */
    public boolean f353562c;

    /* renamed from: d */
    public Map<String, C118300k<?>> f353563d;

    static {
        C118298i iVar = new C118298i();
        new C118298i(iVar.f353560a, "__content__", false, iVar.f353563d).f353560a = true;
    }

    public C118298i() {
        this.f353560a = false;
        this.f353561b = "__content__";
        this.f353562c = false;
        this.f353563d = Collections.emptyMap();
    }

    public Object clone() {
        return new C118298i(this.f353560a, this.f353561b, this.f353562c, this.f353563d);
    }

    public C118298i(boolean z, String str, boolean z2, Map<String, C118300k<?>> map) {
        this.f353560a = z;
        this.f353561b = str;
        this.f353562c = z2;
        this.f353563d = Collections.unmodifiableMap(map);
    }
}
