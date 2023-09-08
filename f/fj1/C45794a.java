package fj1;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import bl3.C39816f;
import cl1.C39970c;
import gy3.C87412m;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: fj1.a */
public final class C45794a extends C54209k0.C39628d {

    /* renamed from: b */
    public final /* synthetic */ C39816f f123696b;

    public C45794a(C39816f fVar) {
        this.f123696b = fVar;
    }

    public <T extends C39622i0> T create(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        if (!C39970c.class.isAssignableFrom(cls)) {
            return super.create(cls);
        }
        try {
            Constructor<T> constructor = cls.getConstructor(new Class[]{C45795b.class});
            C39816f fVar = this.f123696b;
            C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.context.LiveBuContext");
            return (C39622i0) constructor.newInstance(new Object[]{(C45795b) fVar});
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }
}
