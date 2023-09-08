package cj1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import gy3.C87412m;
import te3.C49765hx0;
import te3.C52013xs0;

/* renamed from: cj1.z0 */
public abstract class C0643z0 implements C0581o5 {

    /* renamed from: a */
    public C52013xs0 f1530a;

    public C0643z0(C52013xs0 xs02) {
        C87412m.m108594g(xs02, "msg");
        this.f1530a = xs02;
    }

    /* renamed from: e */
    public String mo571e() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1530a.f144914s;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.username;
    }

    /* renamed from: f */
    public String mo572f() {
        String str = this.f1530a.f144915t;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public String mo573g() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1530a.f144914s;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.nickname;
    }

    public String getContent() {
        return "";
    }

    public int getMsgTime() {
        return 0;
    }

    public long getSeq() {
        return this.f1530a.f144913r;
    }

    public int getType() {
        return this.f1530a.f144903e;
    }

    /* renamed from: h */
    public boolean mo578h() {
        return this.f1530a.f144911p == 1;
    }

    /* renamed from: i */
    public C49765hx0 mo579i() {
        return this.f1530a.f144914s;
    }

    /* renamed from: j */
    public String mo580j() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1530a.f144902d;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.username;
    }

    /* renamed from: k */
    public C49765hx0 mo581k() {
        return this.f1530a.f144902d;
    }

    /* renamed from: n */
    public int mo584n() {
        return this.f1530a.f144912q;
    }

    /* renamed from: o */
    public String mo585o() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1530a.f144902d;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.nickname;
    }
}
