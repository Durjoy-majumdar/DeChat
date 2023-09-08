package o60;

import gy3.C87412m;
import o60.C100284b;
import t60.C101725g;
import u60.C101960c;
import w60.C102355h;
import x60.C102564a;

/* renamed from: o60.c */
public final class C100287c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101960c f293792d;

    /* renamed from: e */
    public final /* synthetic */ C100284b<Object> f293793e;

    /* renamed from: f */
    public final /* synthetic */ C102564a<Object> f293794f;

    /* renamed from: g */
    public final /* synthetic */ C101725g f293795g;

    /* renamed from: h */
    public final /* synthetic */ C100284b.C100286b f293796h;

    /* renamed from: o60.c$a */
    public static final class C100288a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100284b<Object> f293797d;

        /* renamed from: e */
        public final /* synthetic */ C102564a<Object> f293798e;

        /* renamed from: f */
        public final /* synthetic */ C101725g f293799f;

        /* renamed from: g */
        public final /* synthetic */ C100284b.C100286b f293800g;

        /* renamed from: o60.c$a$a */
        public static final class C100289a implements C100284b.C100285a {

            /* renamed from: a */
            public final /* synthetic */ C100284b.C100286b f293801a;

            public C100289a(C100284b.C100286b bVar) {
                this.f293801a = bVar;
            }

            /* renamed from: a */
            public void mo129424a() {
                this.f293801a.mo126149a();
            }

            /* renamed from: b */
            public void mo129425b(C102355h<?> hVar) {
                C87412m.m108594g(hVar, "resp");
                this.f293801a.mo126150b(hVar);
            }
        }

        public C100288a(C100284b<Object> bVar, C102564a<Object> aVar, C101725g gVar, C100284b.C100286b bVar2) {
            this.f293797d = bVar;
            this.f293798e = aVar;
            this.f293799f = gVar;
            this.f293800g = bVar2;
        }

        public final void run() {
            this.f293797d.mo95802a(this.f293798e, this.f293799f, new C100289a(this.f293800g));
        }
    }

    public C100287c(C101960c cVar, C100284b<Object> bVar, C102564a<Object> aVar, C101725g gVar, C100284b.C100286b bVar2) {
        this.f293792d = cVar;
        this.f293793e = bVar;
        this.f293794f = aVar;
        this.f293795g = gVar;
        this.f293796h = bVar2;
    }

    public final void run() {
        this.f293792d.execute(new C100288a(this.f293793e, this.f293794f, this.f293795g, this.f293796h));
    }
}
