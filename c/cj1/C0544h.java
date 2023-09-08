package cj1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import gy3.C87412m;
import te3.C49765hx0;
import te3.C64674r41;

/* renamed from: cj1.h */
public final class C0544h implements C0581o5 {

    /* renamed from: a */
    public C64674r41 f1321a;

    /* renamed from: b */
    public int f1322b = 1;

    /* renamed from: c */
    public String f1323c;

    public C0544h(C64674r41 r412) {
        C87412m.m108594g(r412, "msg");
        this.f1321a = r412;
    }

    /* renamed from: e */
    public String mo571e() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1321a.f185132o;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.username;
    }

    /* renamed from: f */
    public String mo572f() {
        String str = this.f1321a.f185133p;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public String mo573g() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1321a.f185132o;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.nickname;
    }

    public String getContent() {
        return this.f1321a.f185126f;
    }

    public int getMsgTime() {
        return this.f1321a.f185138u;
    }

    public long getSeq() {
        return this.f1321a.f185129i;
    }

    public int getType() {
        return this.f1321a.f185127g;
    }

    /* renamed from: h */
    public boolean mo578h() {
        return this.f1321a.f185136s == 1;
    }

    /* renamed from: i */
    public C49765hx0 mo579i() {
        return this.f1321a.f185132o;
    }

    /* renamed from: j */
    public String mo580j() {
        return "";
    }

    /* renamed from: k */
    public C49765hx0 mo581k() {
        return this.f1321a.f185135r;
    }

    /* renamed from: n */
    public int mo584n() {
        return this.f1321a.f185137t;
    }

    /* renamed from: o */
    public String mo585o() {
        return "";
    }

    /* renamed from: q */
    public Object mo563q() {
        return null;
    }
}
