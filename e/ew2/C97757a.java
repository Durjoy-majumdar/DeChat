package ew2;

import gy3.C87412m;
import te3.ob4;

/* renamed from: ew2.a */
public final class C97757a {

    /* renamed from: a */
    public String f286808a;

    /* renamed from: b */
    public String f286809b;

    /* renamed from: c */
    public int f286810c;

    /* renamed from: d */
    public long f286811d;

    /* renamed from: e */
    public int f286812e;

    /* renamed from: f */
    public boolean f286813f;

    /* renamed from: g */
    public boolean f286814g;

    /* renamed from: h */
    public boolean f286815h;

    /* renamed from: i */
    public boolean f286816i;

    /* renamed from: j */
    public String f286817j;

    /* renamed from: k */
    public String f286818k;

    /* renamed from: l */
    public int f286819l;

    public C97757a() {
        this.f286808a = "";
        this.f286809b = "";
        this.f286817j = "";
        this.f286818k = "";
    }

    public String toString() {
        return "StoryCommentItem(fromUser='" + this.f286808a + "', content='" + this.f286809b + "', createTime=" + this.f286810c + ", commentId=" + this.f286812e + ", isUnread=" + this.f286813f + " )";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C97757a(ob4 ob4) {
        this();
        C87412m.m108594g(ob4, "commentDetail");
        this.f286811d = ob4.f299014d;
        this.f286810c = ob4.f299019i;
        this.f286812e = ob4.f299024q;
        String str = ob4.f299015e;
        String str2 = "";
        this.f286808a = str == null ? str2 : str;
        String str3 = ob4.f299020j;
        this.f286809b = str3 == null ? str2 : str3;
        boolean z = false;
        this.f286814g = str3 == null || str3.length() == 0;
        this.f286816i = ob4.f299027t == 1 ? true : z;
        String str4 = ob4.f299016f;
        this.f286817j = str4 != null ? str4 : str2;
        this.f286819l = ob4.f299023p;
    }
}
