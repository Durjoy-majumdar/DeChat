package dm2;

import android.content.ComponentName;
import android.content.Intent;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import pe3.C47465a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import z04.C112550d0;

/* renamed from: dm2.b */
public class C45416b<T extends C47465a> implements C45425h<T> {

    /* renamed from: a */
    public final List<String> f122931a;

    /* renamed from: b */
    public final Class<T> f122932b;

    /* renamed from: c */
    public final int f122933c;

    /* renamed from: d */
    public final boolean f122934d;

    /* renamed from: e */
    public final C13601g f122935e = C36568h.m40985a(new C45417a(this));

    /* renamed from: dm2.b$a */
    public static final class C45417a extends C87413o implements C32224a<T> {

        /* renamed from: d */
        public final /* synthetic */ C45416b<T> f122936d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45417a(C45416b<T> bVar) {
            super(0);
            this.f122936d = bVar;
        }

        public Object invoke() {
            return (C47465a) this.f122936d.f122932b.newInstance();
        }
    }

    public C45416b(List<String> list, Class<T> cls, int i, boolean z) {
        C87412m.m108594g(list, "activityNameList");
        C87412m.m108594g(cls, "clazz");
        this.f122931a = list;
        this.f122932b = cls;
        this.f122933c = i;
        this.f122934d = z;
    }

    /* renamed from: a */
    public boolean mo70912a() {
        return this.f122934d;
    }

    /* renamed from: b */
    public boolean mo70913b(Intent intent) {
        String str;
        String className;
        if (intent == null) {
            return false;
        }
        ComponentName component = intent.getComponent();
        if (component == null || (className = component.getClassName()) == null || (str = (String) C110818d0.m150925W(C112550d0.m153785U(className, new String[]{"."}, false, 0, 6, (Object) null))) == null) {
            str = "";
        }
        return this.f122931a.contains(str);
    }

    /* renamed from: c */
    public T mo70914c() {
        T t = (C47465a) ((C36570n) this.f122935e).getValue();
        C87412m.m108593f(t, "data");
        return t;
    }

    public int getType() {
        return this.f122933c;
    }
}
