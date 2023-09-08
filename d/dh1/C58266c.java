package dh1;

import al1.C54127h;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import j50.C60735a;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;
import vk1.C65761b;

/* renamed from: dh1.c */
public abstract class C58266c extends C58269e {

    /* renamed from: e */
    public final AppCompatActivity f166841e;

    /* renamed from: f */
    public C65761b f166842f;

    /* renamed from: g */
    public final C13601g f166843g = C36568h.m40985a(new C58267a(this));

    /* renamed from: h */
    public C60735a f166844h;

    /* renamed from: i */
    public C54127h f166845i;

    /* renamed from: dh1.c$a */
    public static final class C58267a extends C87413o implements C32224a<C49712hj1> {

        /* renamed from: d */
        public final /* synthetic */ C58266c f166846d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58267a(C58266c cVar) {
            super(0);
            this.f166846d = cVar;
        }

        public Object invoke() {
            C49712hj1 q3 = ((C60172g4) C39818r.f106831a.mo62444c(this.f166846d.f166841e).mo62447c(C60172g4.class)).mo12861q3();
            q3.f134675i = 65;
            return q3;
        }
    }

    public C58266c(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, "context");
        this.f166841e = appCompatActivity;
    }

    /* renamed from: i */
    public void mo83045i(C65761b bVar) {
        C87412m.m108594g(bVar, "baseRouter");
        C45795b buContext = bVar.getBuContext();
        C87412m.m108594g(buContext, "<set-?>");
        this.f166851d = buContext;
        this.f166844h = bVar.getLiveCore();
        this.f166842f = bVar;
        this.f166845i = bVar.getData();
    }
}
