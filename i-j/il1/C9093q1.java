package il1;

import android.content.Context;
import com.tencent.p014mm.p136ui.widget.picker.C7045j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50555nj3;

/* renamed from: il1.q1 */
public final class C9093q1 {

    /* renamed from: a */
    public final Context f28669a;

    /* renamed from: b */
    public final C45795b f28670b;

    /* renamed from: c */
    public final C13601g f28671c = C36568h.m40985a(C9094a.f28673d);

    /* renamed from: d */
    public C7045j f28672d;

    /* renamed from: il1.q1$a */
    public static final class C9094a extends C87413o implements C32224a<C50555nj3> {

        /* renamed from: d */
        public static final C9094a f28673d = new C9094a();

        public C9094a() {
            super(0);
        }

        public Object invoke() {
            return new C50555nj3();
        }
    }

    public C9093q1(Context context, C45795b bVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        this.f28669a = context;
        this.f28670b = bVar;
    }

    /* renamed from: a */
    public final C50555nj3 mo9902a() {
        return (C50555nj3) ((C36570n) this.f28671c).getValue();
    }
}
