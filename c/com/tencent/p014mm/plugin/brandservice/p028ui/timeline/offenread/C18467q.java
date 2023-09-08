package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.offenread;

import androidx.recyclerview.widget.C54248l;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.offenread.q */
public class C18467q extends C54248l.C54250b {

    /* renamed from: a */
    public List<C18468r> f51249a;

    /* renamed from: b */
    public List<C18468r> f51250b;

    /* renamed from: c */
    public boolean f51251c = false;

    public C18467q(List<C18468r> list, List<C18468r> list2) {
        this.f51249a = list;
        this.f51250b = list2;
    }

    /* renamed from: a */
    public boolean mo11465a(int i, int i2) {
        C18468r f = mo23080f(this.f51249a, i);
        C18468r f2 = mo23080f(this.f51250b, i2);
        if ((f instanceof C18469s) && (f2 instanceof C18469s)) {
            return !this.f51251c;
        }
        if (f.f51256t == f2.f51256t && f.f51261y == f2.f51261y && f.f51262z == f2.f51262z) {
            String str = f.f354230e;
            return (str != null && str.equalsIgnoreCase(f2.f354230e)) && f.f51259w == f2.f51259w && f.f354231f == f2.f354231f && f.f51254r == f2.f51254r && f.f354232g == f2.f354232g && f.f51258v == f2.f51258v;
        }
    }

    /* renamed from: b */
    public boolean mo11466b(int i, int i2) {
        C18468r f = mo23080f(this.f51249a, i);
        C18468r f2 = mo23080f(this.f51250b, i2);
        if (f == null || f2 == null) {
            return false;
        }
        return Util.isEqual(f.f354229d, f2.f354229d);
    }

    /* renamed from: d */
    public int mo11468d() {
        List<C18468r> list = this.f51250b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: e */
    public int mo11469e() {
        List<C18468r> list = this.f51249a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: f */
    public final C18468r mo23080f(List<C18468r> list, int i) {
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }
}
