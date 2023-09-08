package p552hs;

import com.tencent.p014mm.app.C80625v0;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import ex1.C45711d;
import ex1.C45712e;
import ex1.C45713f;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import yw1.C53609m;
import zh3.C91753f;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: hs.b */
public final class C46103b extends C86301e implements C45712e {

    /* renamed from: d */
    public final C13601g f124274d = C36568h.m40985a(C33031a.f89700d);

    /* renamed from: hs.b$a */
    public static final class C33031a extends C87413o implements C32224a<C45713f> {

        /* renamed from: d */
        public static final C33031a f89700d = new C33031a();

        public C33031a() {
            super(0);
        }

        public Object invoke() {
            C91753f wx02 = ((C53609m) C86312j.m106911c(C53609m.class)).wx0();
            C87412m.m108593f(wx02, "getService(PluginGameChatRoom::class.java).db");
            return new C45713f(wx02);
        }
    }

    /* renamed from: Dw */
    public void mo71201Dw(String str) {
        C87412m.m108594g(str, "chatroomName");
        vx0().mo71201Dw(str);
    }

    public List<C45711d> Mj0(String str, String str2) {
        C87412m.m108594g(str, "keyword");
        C87412m.m108594g(str2, "chatroomName");
        return vx0().Mj0(str, str2);
    }

    /* renamed from: OQ */
    public void mo71203OQ(List<? extends C45711d> list, String str) {
        C87412m.m108594g(list, "users");
        C87412m.m108594g(str, "chatroomName");
        vx0().mo71203OQ(list, str);
    }

    public List<C45711d> Rh0(String str, int i) {
        C87412m.m108594g(str, "chatroomName");
        return vx0().Rh0(str, i);
    }

    /* renamed from: Sp */
    public void mo71205Sp(String str, String str2) {
        C87412m.m108594g(str, "chatroomName");
        C87412m.m108594g(str2, "userName");
        vx0().mo71205Sp(str, str2);
    }

    /* renamed from: fS */
    public long mo71206fS(String str) {
        C87412m.m108594g(str, "chatroomName");
        return vx0().mo71206fS(str);
    }

    /* renamed from: iP */
    public List<C45711d> mo71207iP(List<String> list, String str) {
        C87412m.m108594g(list, "userNameList");
        C87412m.m108594g(str, "chatroomName");
        return vx0().mo71207iP(list, str);
    }

    /* renamed from: m */
    public List<C45711d> mo71208m(String str) {
        C87412m.m108594g(str, "userName");
        return vx0().mo71208m(str);
    }

    public final C45713f vx0() {
        return (C45713f) ((C36570n) this.f124274d).getValue();
    }
}
