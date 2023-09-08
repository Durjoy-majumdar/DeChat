package vo1;

import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import vo1.C65770a0;
import yo1.C39143f;

/* renamed from: vo1.b */
public final class C65779b {

    /* renamed from: a */
    public final C39143f f189212a;

    /* renamed from: b */
    public final String f189213b = "FinderLiveMsgOffsetProcessGenerator";

    /* renamed from: c */
    public final C13601g f189214c;

    /* renamed from: d */
    public final C13601g f189215d;

    /* renamed from: e */
    public final C13601g f189216e;

    /* renamed from: vo1.b$a */
    public static final class C65780a extends C87413o implements C32224a<C65768a> {

        /* renamed from: d */
        public final /* synthetic */ C65779b f189217d;

        /* renamed from: e */
        public final /* synthetic */ C65770a0 f189218e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65780a(C65779b bVar, C65770a0 a0Var) {
            super(0);
            this.f189217d = bVar;
            this.f189218e = a0Var;
        }

        public Object invoke() {
            String str = this.f189217d.f189213b;
            Log.m105924i(str, "generator process config:" + this.f189217d.f189212a);
            C45795b bVar = this.f189218e.f189189c;
            int i = this.f189217d.f189212a.f105350a;
            C65770a0.C65771b bVar2 = C65770a0.f189184r;
            return new C65768a(bVar, i, ((Boolean) ((C36570n) C65770a0.f189186t).getValue()).booleanValue(), (C65784c) ((C36570n) this.f189217d.f189216e).getValue(), (C14915d) ((C36570n) this.f189217d.f189215d).getValue());
        }
    }

    /* renamed from: vo1.b$b */
    public static final class C65781b extends C87413o implements C32224a<C65784c> {

        /* renamed from: d */
        public final /* synthetic */ C65770a0 f189219d;

        /* renamed from: e */
        public final /* synthetic */ C65779b f189220e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65781b(C65770a0 a0Var, C65779b bVar) {
            super(0);
            this.f189219d = a0Var;
            this.f189220e = bVar;
        }

        public Object invoke() {
            return new C65784c(this.f189219d, this.f189220e);
        }
    }

    /* renamed from: vo1.b$c */
    public static final class C65782c extends C87413o implements C32224a<C14915d> {

        /* renamed from: d */
        public final /* synthetic */ C65770a0 f189221d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65782c(C65770a0 a0Var) {
            super(0);
            this.f189221d = a0Var;
        }

        public Object invoke() {
            return new C14915d(this.f189221d);
        }
    }

    public C65779b(C65770a0 a0Var, C39143f fVar) {
        C87412m.m108594g(a0Var, "replayInstance");
        C87412m.m108594g(fVar, "config");
        this.f189212a = fVar;
        this.f189214c = C36568h.m40985a(new C65780a(this, a0Var));
        this.f189215d = C36568h.m40985a(new C65782c(a0Var));
        this.f189216e = C36568h.m40985a(new C65781b(a0Var, this));
    }
}
