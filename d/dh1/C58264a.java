package dh1;

import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import c50.C54655b;
import cj1.C54795n5;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;
import vk1.C65760a;

/* renamed from: dh1.a */
public abstract class C58264a extends C58269e {

    /* renamed from: e */
    public final AppCompatActivity f166836e;

    /* renamed from: f */
    public C65760a f166837f;

    /* renamed from: g */
    public final C13601g f166838g = C36568h.m40985a(new C58265a(this));

    /* renamed from: h */
    public C54655b f166839h;

    /* renamed from: dh1.a$a */
    public static final class C58265a extends C87413o implements C32224a<C49712hj1> {

        /* renamed from: d */
        public final /* synthetic */ C58264a f166840d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C58265a(C58264a aVar) {
            super(0);
            this.f166840d = aVar;
        }

        public Object invoke() {
            C49712hj1 q3 = ((C60172g4) C39818r.f106831a.mo62444c(this.f166840d.f166836e).mo62447c(C60172g4.class)).mo12861q3();
            q3.f134675i = 65;
            return q3;
        }
    }

    public C58264a(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, "context");
        this.f166836e = appCompatActivity;
    }

    /* renamed from: i */
    public C65760a mo83040i() {
        return this.f166837f;
    }

    /* renamed from: j */
    public final AppCompatActivity mo83041j() {
        return this.f166836e;
    }

    /* renamed from: k */
    public C54795n5 mo83042k() {
        FinderLiveService.f159376d.getClass();
        return FinderLiveService.f159396y;
    }

    /* renamed from: l */
    public C54655b mo83043l() {
        return this.f166839h;
    }

    /* renamed from: m */
    public void mo83044m(C65760a aVar) {
        C87412m.m108594g(aVar, "baseRouter");
        C45795b buContext = aVar.getBuContext();
        C87412m.m108594g(buContext, "<set-?>");
        this.f166851d = buContext;
        this.f166839h = aVar.getLiveCore();
        this.f166837f = aVar;
    }
}
