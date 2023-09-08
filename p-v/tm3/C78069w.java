package tm3;

import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.statecenter.BaseState;
import gy3.C87412m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

/* renamed from: tm3.w */
public final class C78069w extends BaseState {

    /* renamed from: d */
    public String f228819d = "";

    /* renamed from: e */
    public String f228820e = "";

    /* renamed from: f */
    public int f228821f;

    /* renamed from: g */
    public int f228822g;

    /* renamed from: h */
    public int f228823h;

    /* renamed from: i */
    public int f228824i;

    /* renamed from: j */
    public HashSet<String> f228825j = new HashSet<>();

    /* renamed from: n */
    public LinkedList<String> f228826n = new LinkedList<>();

    /* renamed from: o */
    public HashSet<String> f228827o = new HashSet<>();

    /* renamed from: p */
    public boolean f228828p;

    /* renamed from: q */
    public String f228829q;

    /* renamed from: r */
    public HashMap<Integer, Object> f228830r;

    /* renamed from: s */
    public String f228831s;

    /* renamed from: t */
    public HashMap<String, Long> f228832t = new HashMap<>();

    /* renamed from: u */
    public boolean f228833u;

    /* renamed from: v */
    public String f228834v = "";

    /* renamed from: w */
    public String f228835w = "";

    /* renamed from: a */
    public final boolean mo108032a(String str) {
        C87412m.m108594g(str, "username");
        return this.f228825j.contains(str);
    }

    /* renamed from: b */
    public final boolean mo108033b() {
        return CommonKt.hasAttr(this.f228821f, 64);
    }

    /* renamed from: c */
    public final boolean mo108034c(String str) {
        C87412m.m108594g(str, "username");
        return this.f228826n.contains(str);
    }

    public Object clone() {
        return super.clone();
    }
}
