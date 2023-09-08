package tn1;

import cm1.C0740i2;
import er1.C58739j4;
import gy3.C87412m;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Locale;
import te3.C49398f93;
import te3.C50077k40;
import te3.C50221l60;
import te3.C51883wv3;
import te3.k45;
import te3.m54;
import te3.n54;
import te3.s44;
import te3.v54;
import tf1.C13914m;

/* renamed from: tn1.a */
public final class C14051a implements C0740i2 {

    /* renamed from: d */
    public final C50221l60 f39399d;

    /* renamed from: e */
    public final String f39400e;

    /* renamed from: f */
    public final String f39401f;

    /* renamed from: g */
    public final String f39402g;

    /* renamed from: h */
    public final String f39403h;

    /* renamed from: i */
    public final LinkedList<C49398f93> f39404i;

    /* renamed from: j */
    public final String f39405j;

    /* renamed from: n */
    public final String f39406n;

    /* renamed from: o */
    public final String f39407o;

    /* renamed from: p */
    public final String f39408p;

    /* renamed from: q */
    public final String f39409q;

    /* renamed from: r */
    public final LinkedList<v54> f39410r;

    /* renamed from: s */
    public boolean f39411s;

    /* renamed from: t */
    public final String f39412t;

    /* renamed from: u */
    public final String f39413u;

    /* renamed from: v */
    public final String f39414v;

    /* renamed from: w */
    public final String f39415w;

    /* renamed from: x */
    public final String f39416x;

    public C14051a(C50221l60 l602, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        n54 n54;
        String str6;
        n54 n542;
        String str7;
        C50077k40 k402;
        String str8;
        C50077k40 k403;
        k45 k45;
        String str9;
        C50077k40 k404;
        k45 k452;
        String str10;
        String str11;
        C87412m.m108594g(l602, "order");
        C87412m.m108594g(str, "detailJson");
        this.f39399d = l602;
        this.f39400e = str;
        s44 s44 = l602.f137198e;
        LinkedList<C49398f93> linkedList = null;
        String str12 = s44 != null ? s44.f141320e : null;
        String str13 = "";
        if (str12 == null || str12.length() == 0) {
            s44 s442 = l602.f137198e;
            if (s442 == null || (str2 = s442.f141322g) == null) {
                str2 = str13;
            }
        } else {
            s44 s443 = l602.f137198e;
            str2 = s443 != null ? s443.f141320e : null;
        }
        this.f39401f = str2;
        s44 s444 = l602.f137198e;
        this.f39402g = (s444 == null || (str11 = s444.f141319d) == null) ? str13 : str11;
        this.f39403h = (s444 == null || (str10 = s444.f141321f) == null) ? str13 : str10;
        this.f39404i = s444 != null ? s444.f141325j : linkedList;
        this.f39405j = (s444 == null || (k404 = s444.f141323h) == null || (k452 = k404.f136540d) == null || (str9 = k452.f136556e) == null) ? str13 : str9;
        this.f39406n = (s444 == null || (k403 = s444.f141323h) == null || (k45 = k403.f136540d) == null || (str8 = k45.f136555d) == null) ? str13 : str8;
        this.f39407o = (s444 == null || (k402 = s444.f141323h) == null || (str7 = k402.f136541e) == null) ? str13 : str7;
        m54 m54 = l602.f137200g;
        this.f39408p = (m54 == null || (n542 = m54.f137848e) == null || (str6 = n542.f138420f) == null) ? str13 : str6;
        this.f39409q = (m54 == null || (n54 = m54.f137848e) == null || (str5 = n54.f138421g) == null) ? str13 : str5;
        this.f39410r = l602.f137199f;
        this.f39412t = l602.f137204n > 0 ? new SimpleDateFormat("M/d HH:mm", Locale.getDefault()).format(Long.valueOf(l602.f137204n)) : str13;
        this.f39413u = C58739j4.f168176a.mo83699a0((int) l602.f137201h);
        this.f39414v = String.valueOf((int) (((double) ((int) l602.f137201h)) / 100.0d));
        C51883wv3 wv32 = l602.f137202i;
        this.f39415w = (wv32 == null || (str4 = wv32.f144311e) == null) ? str13 : str4;
        if (!(wv32 == null || (str3 = wv32.f144310d) == null)) {
            str13 = str3;
        }
        this.f39416x = str13;
    }

    /* renamed from: c */
    public int mo75c() {
        return C14051a.class.hashCode();
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return (!(mVar instanceof C14051a) || !C87412m.m108589b(((C14051a) mVar).f39399d.f137197d, this.f39399d.f137197d)) ? -1 : 0;
    }

    public long getItemId() {
        String str = this.f39399d.f137197d;
        if (str == null) {
            str = "";
        }
        return (long) str.hashCode();
    }
}
