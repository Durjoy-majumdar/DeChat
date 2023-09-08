package qh3;

import qh3.C89661b;

/* renamed from: qh3.c */
public class C89664c extends C89665d<Boolean, Boolean, Boolean> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89664c(C89661b.C89663b<Boolean> bVar, C89661b.C89663b<Boolean> bVar2) {
        super(bVar.name() + " && " + bVar2.name(), bVar, bVar2, Boolean.valueOf(bVar.get().booleanValue() && bVar2.get().booleanValue()));
    }
}
