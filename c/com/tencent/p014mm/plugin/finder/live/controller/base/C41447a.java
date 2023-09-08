package com.tencent.p014mm.plugin.finder.live.controller.base;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import bl3.C39816f;
import gy3.C87412m;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.tencent.mm.plugin.finder.live.controller.base.a */
public final class C41447a extends C54209k0.C39628d {

    /* renamed from: b */
    public final /* synthetic */ C39816f f111611b;

    public C41447a(C39816f fVar) {
        this.f111611b = fVar;
    }

    public <T extends C39622i0> T create(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        if (LiveRoomController.class.isAssignableFrom(cls)) {
            try {
                Constructor<T> constructor = cls.getConstructor(new Class[]{LiveRoomControllerStore.class});
                C39816f fVar = this.f111611b;
                C87412m.m108592e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore");
                T t = (C39622i0) constructor.newInstance(new Object[]{(LiveRoomControllerStore) fVar});
                C87412m.m108593f(t, "{\n                      …  }\n                    }");
                return t;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        } else {
            T create = super.create(cls);
            C87412m.m108593f(create, "super.create(modelClass)");
            return create;
        }
    }
}
