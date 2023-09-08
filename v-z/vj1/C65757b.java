package vj1;

import a14.C53896h0;
import a14.C53973z1;
import androidx.lifecycle.C0125s;
import d50.C58113g;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i31.C117134d;
import p50.C62193a;

/* renamed from: vj1.b */
public final class C65757b extends C117134d<String, C62193a, C65756a> {

    /* renamed from: vj1.b$a */
    public static final class C65758a extends C87413o implements C32224a<C65756a> {

        /* renamed from: d */
        public final /* synthetic */ C58113g f189162d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65758a(C58113g gVar) {
            super(0);
            this.f189162d = gVar;
        }

        public Object invoke() {
            return new C65756a(this.f189162d.f166232b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65757b(C58113g gVar, C53896h0 h0Var) {
        super(new C65758a(gVar), (C53973z1) null, (C0125s) null, h0Var, 6, (C8480h) null);
        C87412m.m108594g(gVar, "liveRoomInfo");
        C87412m.m108594g(h0Var, "coroutineDispatcher");
    }
}
