package com.tencent.p014mm.p136ui.contact;

import java.util.List;

/* renamed from: com.tencent.mm.ui.contact.m1 */
public abstract class C74526m1 extends C74502i1 {

    /* renamed from: i */
    public boolean f219095i;

    /* renamed from: j */
    public List<String> f219096j;

    public C74526m1(C74493g1 g1Var, List<String> list, boolean z, boolean z2, boolean z3) {
        this(g1Var, list, z, z2, 0, z3);
    }

    /* renamed from: q */
    public int mo7852q(String str) {
        return -1;
    }

    /* renamed from: r */
    public void mo7853r() {
    }

    public C74526m1(C74493g1 g1Var, List<String> list, boolean z, boolean z2) {
        this(g1Var, list, z, z2, 0);
    }

    public C74526m1(C74493g1 g1Var, List<String> list, boolean z, boolean z2, int i) {
        this(g1Var, list, z, z2, i, false);
    }

    public C74526m1(C74493g1 g1Var, List<String> list, boolean z, boolean z2, int i, boolean z3) {
        super(g1Var, z2, i, z3);
        this.f219096j = list;
        this.f219095i = z;
    }
}
