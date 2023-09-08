package e02;

import com.tencent.p014mm.plugin.handoff.model.HandOff;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import org.xmlpull.v1.XmlPullParser;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: e02.f */
public abstract class C97566f<T extends HandOff> extends C97561a {

    /* renamed from: a */
    public final C13601g f286285a = C36568h.m40985a(new C97567a(this));

    /* renamed from: e02.f$a */
    public static final class C97567a extends C87413o implements C32224a<T> {

        /* renamed from: d */
        public final /* synthetic */ C97566f<T> f286286d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97567a(C97566f<? extends T> fVar) {
            super(0);
            this.f286286d = fVar;
        }

        public Object invoke() {
            return this.f286286d.mo136833h();
        }
    }

    /* renamed from: a */
    public void mo136827a(XmlPullParser xmlPullParser) {
        C87412m.m108594g(xmlPullParser, "parser");
        String e = mo136831e(xmlPullParser, "id");
        long d = mo136830d(xmlPullParser, "createtime");
        mo136834g().setId(e);
        mo136834g().setCreateTime(d);
        super.mo136827a(xmlPullParser);
    }

    /* renamed from: g */
    public final T mo136834g() {
        return (HandOff) ((C36570n) this.f286285a).getValue();
    }

    /* renamed from: h */
    public abstract T mo136833h();
}
