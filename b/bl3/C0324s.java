package bl3;

import androidx.lifecycle.C39622i0;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import ny3.C25235d;

/* renamed from: bl3.s */
public final class C0324s {
    /* renamed from: a */
    public static final <T extends C0316c> Class<UIComponent> m265a(C25235d<T> dVar) {
        C87412m.m108594g(dVar, "<this>");
        C39818r.f106831a.getClass();
        ConcurrentHashMap<Object, Object> concurrentHashMap = C39818r.f106832b;
        String e = dVar.mo51262e();
        C87412m.m108591d(e);
        Object obj = concurrentHashMap.get(e);
        Class<UIComponent> cls = obj instanceof Class ? (Class) obj : null;
        if (cls != null) {
            return cls;
        }
        throw new RuntimeException(dVar + " never import any instance.");
    }

    /* renamed from: b */
    public static final <U extends C39622i0, T extends C0316c> Class<U> m266b(Class<U> cls, Class<T> cls2) {
        C87412m.m108594g(cls, "<this>");
        C87412m.m108594g(cls2, ProviderConstants.API_PATH);
        C39818r.f106831a.getClass();
        C39818r.f106832b.put(cls2.getName(), cls);
        Log.m105924i("UICProvider", "withApi " + cls2.getName() + " ==> " + cls.getName());
        return cls;
    }

    /* renamed from: c */
    public static final <U extends C39815b, T extends C39815b> Class<U> m267c(Class<U> cls, Class<T> cls2) {
        C87412m.m108594g(cls, "<this>");
        C87412m.m108594g(cls2, ProviderConstants.API_PATH);
        C39818r.f106831a.getClass();
        C39818r.f106833c.put(cls2.getName(), cls);
        Log.m105924i("UICProvider", "withInstanceApi " + cls2.getName() + " ==> " + cls.getName());
        return cls;
    }
}
