package p257w;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: w.h0 */
public final class C37902h0<T> implements C37901h<T> {

    /* renamed from: a */
    public final C37948y<T> f100314a;

    /* renamed from: b */
    public final C37924q0 f100315b;

    /* renamed from: c */
    public final long f100316c;

    public C37902h0(C37948y yVar, C37924q0 q0Var, long j, C8480h hVar) {
        this.f100314a = yVar;
        this.f100315b = q0Var;
        this.f100316c = j;
    }

    /* renamed from: a */
    public <V extends C37919o> C37918n1<V> mo61393a(C37906k1<T, V> k1Var) {
        C87412m.m108594g(k1Var, "converter");
        return new C37942v1(this.f100314a.mo61393a(k1Var), this.f100315b, this.f100316c, (C8480h) null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C37902h0) {
            C37902h0 h0Var = (C37902h0) obj;
            if (C87412m.m108589b(h0Var.f100314a, this.f100314a) && h0Var.f100315b == this.f100315b) {
                if (h0Var.f100316c == this.f100316c) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.f100316c;
        return (((this.f100314a.hashCode() * 31) + this.f100315b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)));
    }
}
