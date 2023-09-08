package vf1;

import cm1.C0734g2;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import gy3.C87412m;

/* renamed from: vf1.y0 */
public final class C14848y0 implements FTSSearchView.C6996f {

    /* renamed from: d */
    public final C0734g2 f40860d;

    public C14848y0(C0734g2 g2Var) {
        C87412m.m108594g(g2Var, "topic");
        this.f40860d = g2Var;
    }

    /* renamed from: SE */
    public String mo8025SE() {
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        String str = this.f40860d.f1749d.f141617d;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public int compareTo(Object obj) {
        return 0;
    }
}
