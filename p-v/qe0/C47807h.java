package qe0;

import com.tencent.p014mm.hardcoder.C40318k;

/* renamed from: qe0.h */
public final class C47807h {

    /* renamed from: a */
    public int f128364a = 0;

    /* renamed from: b */
    public int f128365b;

    /* renamed from: a */
    public void mo72573a(int i) {
        int i2 = (~i) & this.f128364a;
        this.f128364a = i2;
        if (i2 == 0) {
            C40318k.m43492a().stopPerformance(C40318k.m43492a().getHcUpdateChatroomEnable(), this.f128365b);
            this.f128365b = 0;
        }
    }
}
