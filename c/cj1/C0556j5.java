package cj1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import gy3.C87412m;
import te3.C49765hx0;
import te3.C64674r41;

/* renamed from: cj1.j5 */
public class C0556j5 implements C0581o5, C0584p5 {

    /* renamed from: a */
    public C64674r41 f1344a;

    /* renamed from: b */
    public boolean f1345b;

    /* renamed from: c */
    public int f1346c;

    /* renamed from: d */
    public boolean f1347d;

    /* renamed from: e */
    public boolean f1348e;

    public C0556j5(C64674r41 r412) {
        C87412m.m108594g(r412, "msg");
        this.f1344a = r412;
    }

    /* renamed from: a */
    public boolean mo567a() {
        return this.f1348e;
    }

    /* renamed from: b */
    public void mo568b(int i) {
        this.f1346c = i;
    }

    /* renamed from: c */
    public boolean mo569c() {
        return this.f1345b;
    }

    /* renamed from: d */
    public void mo570d(boolean z) {
        this.f1345b = z;
    }

    /* renamed from: e */
    public String mo571e() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1344a.f185132o;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.username;
    }

    /* renamed from: f */
    public String mo572f() {
        String str = this.f1344a.f185133p;
        return str == null ? "" : str;
    }

    /* renamed from: g */
    public String mo573g() {
        FinderContact finderContact;
        C49765hx0 hx02 = this.f1344a.f185132o;
        if (hx02 == null || (finderContact = hx02.f134919d) == null) {
            return null;
        }
        return finderContact.nickname;
    }

    public String getContent() {
        return this.f1344a.f185126f;
    }

    public int getLikeCount() {
        return this.f1346c;
    }

    public int getMsgTime() {
        return this.f1344a.f185138u;
    }

    public long getSeq() {
        return this.f1344a.f185129i;
    }

    public int getType() {
        return this.f1344a.f185127g;
    }

    /* renamed from: h */
    public boolean mo578h() {
        return this.f1344a.f185136s == 1;
    }

    /* renamed from: i */
    public C49765hx0 mo579i() {
        return this.f1344a.f185132o;
    }

    /* renamed from: j */
    public String mo580j() {
        return "";
    }

    /* renamed from: k */
    public C49765hx0 mo581k() {
        return this.f1344a.f185135r;
    }

    /* renamed from: l */
    public void mo582l(boolean z) {
        this.f1347d = z;
    }

    /* renamed from: m */
    public boolean mo583m() {
        return this.f1347d;
    }

    /* renamed from: n */
    public int mo584n() {
        return this.f1344a.f185137t;
    }

    /* renamed from: o */
    public String mo585o() {
        return "";
    }

    /* renamed from: p */
    public void mo586p(boolean z) {
        this.f1348e = z;
    }

    /* renamed from: q */
    public Object mo563q() {
        return null;
    }
}
