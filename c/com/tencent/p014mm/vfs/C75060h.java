package com.tencent.p014mm.vfs;

import fy3.C32226l;
import gy3.C87412m;

/* renamed from: com.tencent.mm.vfs.h */
public final class C75060h extends C75059d {

    /* renamed from: b */
    public final C32226l<FileSystem, FileSystem> f220840b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C75060h(C30871e eVar, C32226l<? super FileSystem, ? extends FileSystem> lVar) {
        super(eVar.f82902d);
        C87412m.m108594g(eVar, "cleanType");
        C87412m.m108594g(lVar, "cleanerCreator");
        this.f220840b = lVar;
    }

    /* renamed from: a */
    public C32226l<FileSystem, FileSystem> mo104654a() {
        return this.f220840b;
    }
}
