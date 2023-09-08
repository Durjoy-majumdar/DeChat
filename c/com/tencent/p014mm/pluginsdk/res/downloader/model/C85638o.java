package com.tencent.p014mm.pluginsdk.res.downloader.model;

import com.tencent.p014mm.pluginsdk.res.downloader.model.C85632g;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.pluginsdk.res.downloader.model.o */
public abstract class C85638o implements C85632g.C85634b {

    /* renamed from: a */
    public final String f249581a;

    /* renamed from: b */
    public final int f249582b;

    /* renamed from: c */
    public final String f249583c;

    /* renamed from: d */
    public final String f249584d;

    /* renamed from: e */
    public final int f249585e;

    /* renamed from: f */
    public final String f249586f;

    /* renamed from: g */
    public final Map<String, String> f249587g = new HashMap();

    /* renamed from: h */
    public volatile int f249588h = 15000;

    /* renamed from: i */
    public volatile int f249589i = 20000;

    /* renamed from: j */
    public volatile int f249590j = 15000;

    /* renamed from: k */
    public final int f249591k;

    public C85638o(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3) {
        this.f249581a = str;
        this.f249583c = str2;
        this.f249584d = str4;
        this.f249586f = str5;
        this.f249591k = i;
        this.f249582b = i2;
        this.f249585e = Math.max(i3, 0);
    }

    /* renamed from: a */
    public String mo119169a() {
        return this.f249581a;
    }

    /* renamed from: b */
    public int mo119180b() {
        return this.f249588h;
    }

    /* renamed from: c */
    public String mo119181c() {
        return this.f249583c;
    }

    /* renamed from: d */
    public String mo119182d() {
        return this.f249584d;
    }

    /* renamed from: e */
    public int mo119183e() {
        return this.f249589i;
    }

    /* renamed from: f */
    public void mo119184f(int i) {
        this.f249588h = i;
    }

    /* renamed from: g */
    public void mo119185g(int i) {
        this.f249589i = i;
    }
}
