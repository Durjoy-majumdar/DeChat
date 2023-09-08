package com.tencent.p014mm.plugin.wear.model;

/* renamed from: com.tencent.mm.plugin.wear.model.g */
public class C43462g {

    /* renamed from: a */
    public String f117476a = "";

    /* renamed from: b */
    public int f117477b = 0;

    /* renamed from: c */
    public String f117478c = "";

    /* renamed from: d */
    public int f117479d = 0;

    /* renamed from: e */
    public C43463a f117480e;

    /* renamed from: com.tencent.mm.plugin.wear.model.g$a */
    public enum C43463a {
        INIT,
        SHOWING,
        IGNORE,
        REPLY
    }

    public Object clone() {
        C43462g gVar = new C43462g();
        gVar.f117477b = this.f117477b;
        gVar.f117476a = this.f117476a;
        gVar.f117478c = this.f117478c;
        gVar.f117479d = this.f117479d;
        gVar.f117480e = this.f117480e;
        return gVar;
    }

    public String toString() {
        return "WearNotification [talker=" + this.f117476a + ", id=" + this.f117477b + ", md5=" + this.f117478c + ", ignoreInWatch=" + this.f117479d + ", status=" + this.f117480e + "]";
    }
}
