package p520fi;

import java.util.HashMap;
import java.util.Stack;
import p248ug.C111167t;

/* renamed from: fi.c */
public class C107546c {

    /* renamed from: c */
    public static C107546c f321771c = new C107546c();

    /* renamed from: a */
    public HashMap<String, Stack<C111167t>> f321772a = new HashMap<>();

    /* renamed from: b */
    public Stack<C111167t> f321773b = new Stack<>();

    /* renamed from: a */
    public C111167t mo157986a() {
        return this.f321773b.empty() ? C111167t.DEFAULT : this.f321773b.pop();
    }

    /* renamed from: b */
    public void mo157987b(String str) {
        if (this.f321772a.containsKey(str)) {
            this.f321773b = this.f321772a.get(str);
        } else {
            this.f321772a.put(str, new Stack());
        }
    }
}
