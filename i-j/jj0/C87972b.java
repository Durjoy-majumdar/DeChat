package jj0;

import l34.C117453e;
import l34.C117456i;
import o34.C117677q;
import p34.C117932b;
import p418rx.schedulers.Schedulers;
import q34.C118162i;
import q34.C118164k;
import q34.C89453l;

/* renamed from: jj0.b */
public abstract class C87972b<T> {

    /* renamed from: a */
    public final C117453e.C88378c<T, T> f254566a = new C87973a(this);

    /* renamed from: jj0.b$a */
    public class C87973a implements C117453e.C88378c<T, T> {
        public C87973a(C87972b bVar) {
        }

        public Object call(Object obj) {
            C117453e eVar;
            C117453e eVar2 = (C117453e) obj;
            C117456i io = Schedulers.m166801io();
            eVar2.getClass();
            if (eVar2 instanceof C89453l) {
                C89453l lVar = (C89453l) eVar2;
                eVar = C117453e.m165660c(new C89453l.C89454a(null, io instanceof C117932b ? new C118162i(lVar, (C117932b) io) : new C118164k(lVar, io)));
            } else {
                eVar = C117453e.m165660c(new C117677q(eVar2, io));
            }
            return eVar.mo182154e(C87971a.m109468a());
        }
    }
}
