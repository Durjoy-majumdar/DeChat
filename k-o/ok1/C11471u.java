package ok1;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C58739j4;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import lg3.C88497f;
import p1028re.C89928a;
import p1028re.C89931d;
import rx3.C13601g;
import rx3.C13603j;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ok1.u */
public final class C11471u {

    /* renamed from: a */
    public static final C11471u f33728a = new C11471u();

    /* renamed from: b */
    public static final C13601g f33729b = C36568h.m40985a(C11474c.f33734d);

    /* renamed from: ok1.u$a */
    public static final class C11472a implements C89928a {
        /* renamed from: a */
        public void mo391a(int i) {
            C11471u.m11283a(C11471u.f33728a, "systemTrim");
        }

        /* renamed from: b */
        public void mo392b() {
            C11471u.m11283a(C11471u.f33728a, "backgroundTrim");
        }
    }

    /* renamed from: ok1.u$b */
    public enum C11473b {
        AUTO,
        FORCE_DARK,
        FORCE_LIGHT
    }

    /* renamed from: ok1.u$c */
    public static final class C11474c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C11474c f33734d = new C11474c();

        public C11474c() {
            super(0);
        }

        public Object invoke() {
            return Boolean.valueOf(C32444a.f86035A2.mo60266n().intValue() == 0);
        }
    }

    static {
        Log.m105924i("LiveLayoutInflater", "initMemoryTrim");
        C89931d.f258426c.mo124253c(new C11472a());
    }

    /* renamed from: a */
    public static final void m11283a(C11471u uVar, String str) {
        uVar.getClass();
        try {
            Log.m105924i("LiveLayoutInflater", str + " lruDarkInflaterInfo cache Size:" + 0 + ",lruLightInflaterInfo cache Size:" + 0 + '!');
        } catch (Exception e) {
            C58739j4.f168176a.mo83712h0(e, "LiveLayoutInflater-memoryTrim");
        }
    }

    /* renamed from: b */
    public final View mo11443b(int i, ViewGroup viewGroup, boolean z, C11473b bVar, Context context, LayoutInflater layoutInflater) {
        View view;
        Context context2;
        C87412m.m108594g(bVar, "mode");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(layoutInflater, "layoutInflater");
        try {
            C13601g gVar = f33729b;
            if (((Boolean) ((C36570n) gVar).getValue()).booleanValue()) {
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    context2 = context;
                } else if (ordinal == 1) {
                    Configuration configuration = new Configuration(context.getResources().getConfiguration());
                    C88497f.m110370c(configuration, true);
                    context2 = context.createConfigurationContext(configuration);
                } else if (ordinal == 2) {
                    Configuration configuration2 = new Configuration(context.getResources().getConfiguration());
                    C88497f.m110370c(configuration2, false);
                    context2 = context.createConfigurationContext(configuration2);
                } else {
                    throw new C13603j();
                }
                C87412m.m108593f(context2, "copyContext");
                mo11444c("inflate", context, context2);
                view = C85868k2.m106136a(layoutInflater, context2).inflate(i, viewGroup, z);
            } else {
                Log.m105924i("LiveLayoutInflater", "inflate but enableChangeSkin:" + ((Boolean) ((C36570n) gVar).getValue()).booleanValue() + '!');
                view = layoutInflater.inflate(i, viewGroup, z);
            }
            C87412m.m108593f(view, "{\n            if(enableC…)\n            }\n        }");
            return view;
        } catch (Exception e) {
            C58739j4 j4Var = C58739j4.f168176a;
            j4Var.mo83712h0(e, "LiveLayoutInflater-inflate-" + bVar);
            View inflate = layoutInflater.inflate(i, viewGroup, z);
            C87412m.m108593f(inflate, "{\n            FinderUtil…, attachToRoot)\n        }");
            return inflate;
        }
    }

    /* renamed from: c */
    public final void mo11444c(String str, Context context, Context context2) {
        Log.m105924i("LiveLayoutInflater", str + " context:" + context + ",context resources:" + context.getResources() + ",context resources config:" + context.getResources().getConfiguration() + "\napplication context:" + MMApplicationContext.getContext() + ",app resources:" + MMApplicationContext.getContext().getResources() + ",app resources config:" + MMApplicationContext.getContext().getResources().getConfiguration() + "\ncopyContext:" + context2 + ",copy resources:" + context2.getResources() + ",copy resources config:" + context2.getResources().getConfiguration() + '!');
    }
}
