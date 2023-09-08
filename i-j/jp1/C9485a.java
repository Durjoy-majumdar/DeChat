package jp1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import pe3.C89349b;

/* renamed from: jp1.a */
public final class C9485a {

    /* renamed from: a */
    public final int f29651a;

    /* renamed from: b */
    public String f29652b;

    /* renamed from: c */
    public final List<BaseFinderFeed> f29653c;

    /* renamed from: d */
    public int f29654d;

    /* renamed from: e */
    public C89349b f29655e;

    /* renamed from: f */
    public int f29656f;

    public C9485a(int i, String str, List<BaseFinderFeed> list, int i2, C89349b bVar, int i3, int i4, C8480h hVar) {
        str = (i4 & 2) != 0 ? "" : str;
        list = (i4 & 4) != 0 ? new ArrayList<>() : list;
        i2 = (i4 & 8) != 0 ? 0 : i2;
        bVar = (i4 & 16) != 0 ? null : bVar;
        i3 = (i4 & 32) != 0 ? 0 : i3;
        C87412m.m108594g(str, "tabTitle");
        C87412m.m108594g(list, "feedList");
        this.f29651a = i;
        this.f29652b = str;
        this.f29653c = list;
        this.f29654d = i2;
        this.f29655e = bVar;
        this.f29656f = i3;
    }

    public String toString() {
        return "(tabId=" + this.f29651a + ", tabTitle=" + this.f29652b + ", feedSize=" + this.f29653c.size() + ')';
    }
}
