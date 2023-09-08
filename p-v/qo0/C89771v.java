package qo0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ej0.C58608e;
import ej0.C86525c;
import gy3.C87412m;
import hj0.C87535e;
import qo0.C89750q;

/* renamed from: qo0.v */
public final class C89771v extends C89750q.C89752b {

    /* renamed from: a */
    public final /* synthetic */ C89750q f258132a;

    /* renamed from: b */
    public final /* synthetic */ int f258133b;

    /* renamed from: c */
    public final /* synthetic */ int f258134c;

    /* renamed from: qo0.v$a */
    public static final class C89772a extends C89750q.C89752b {

        /* renamed from: a */
        public final /* synthetic */ C89750q f258135a;

        /* renamed from: b */
        public final /* synthetic */ int f258136b;

        /* renamed from: c */
        public final /* synthetic */ int f258137c;

        /* renamed from: qo0.v$a$a */
        public static final class C89773a extends C89750q.C89752b {

            /* renamed from: a */
            public final /* synthetic */ C89750q f258138a;

            /* renamed from: b */
            public final /* synthetic */ int f258139b;

            /* renamed from: c */
            public final /* synthetic */ int f258140c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C89773a(C89750q qVar, int i, int i2) {
                super(qVar);
                this.f258138a = qVar;
                this.f258139b = i;
                this.f258140c = i2;
            }

            /* renamed from: a */
            public void mo88410a(C87535e eVar) {
                StringBuilder sb = new StringBuilder();
                sb.append("play new fail");
                sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : "");
                Log.m105920e("MicroMsg.VideoCast.VideoCastController", sb.toString());
                C89750q.C89751a aVar = new C89750q.C89751a(C89724a.ACTION_ERROR);
                aVar.f258107b = Integer.valueOf(this.f258140c);
                C89750q.m112209a(this.f258138a, aVar);
            }

            /* renamed from: b */
            public void mo88411b(C87535e eVar) {
                C87412m.m108594g(eVar, "response");
                Log.m105924i("MicroMsg.VideoCast.VideoCastController", "play new success");
                C86525c b = this.f258138a.f258094e.mo124027b();
                C89750q qVar = this.f258138a;
                b.f251389h = qVar.f258102m;
                qVar.f258094e.mo124027b().f251386e.f167798a = C58608e.C58609a.Playing;
                this.f258138a.f258094e.mo124027b().mo121005f();
                this.f258138a.f258094e.mo124027b().mo121006g();
                int i = this.f258139b;
                C89750q qVar2 = this.f258138a;
                if (i > 0) {
                    qVar2.f258101l = new C89774w(qVar2, i);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89772a(C89750q qVar, int i, int i2) {
            super(qVar);
            this.f258135a = qVar;
            this.f258136b = i;
            this.f258137c = i2;
        }

        /* renamed from: a */
        public void mo88410a(C87535e eVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("set AVTransportURI fail");
            sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : "");
            Log.m105920e("MicroMsg.VideoCast.VideoCastController", sb.toString());
            C89750q.C89751a aVar = new C89750q.C89751a(C89724a.ACTION_ERROR);
            aVar.f258107b = Integer.valueOf(this.f258137c);
            C89750q.m112209a(this.f258135a, aVar);
        }

        /* renamed from: b */
        public void mo88411b(C87535e eVar) {
            C87412m.m108594g(eVar, "response");
            Log.m105924i("MicroMsg.VideoCast.VideoCastController", "playNew: setAvTransUrl success");
            this.f258135a.f258094e.mo124027b().f251386e.f167798a = C58608e.C58609a.Transitioning;
            this.f258135a.f258094e.mo124027b().mo121001c(new C89773a(this.f258135a, this.f258136b, this.f258137c));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89771v(C89750q qVar, int i, int i2) {
        super(qVar);
        this.f258132a = qVar;
        this.f258133b = i;
        this.f258134c = i2;
    }

    /* renamed from: a */
    public void mo88410a(C87535e eVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("stop fail before play new");
        sb.append(eVar != null ? Integer.valueOf(eVar.f253592c) : "");
        Log.m105920e("MicroMsg.VideoCast.VideoCastController", sb.toString());
    }

    /* renamed from: b */
    public void mo88411b(C87535e eVar) {
        C87412m.m108594g(eVar, "response");
        Log.m105924i("MicroMsg.VideoCast.VideoCastController", "playNew: stop success");
        this.f258132a.f258094e.mo124027b().f251386e.f167798a = C58608e.C58609a.Stopped;
        C86525c b = this.f258132a.f258094e.mo124027b();
        C89750q qVar = this.f258132a;
        b.mo121002d(qVar.f258092c.f257411f, new C89772a(qVar, this.f258133b, this.f258134c));
    }
}
