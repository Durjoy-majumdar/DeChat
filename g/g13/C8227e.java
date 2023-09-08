package g13;

import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C54209k0;
import gy3.C87412m;

/* renamed from: g13.e */
public final class C8227e implements C54209k0.C54210b {
    public <T extends C39622i0> T create(Class<T> cls) {
        C87412m.m108594g(cls, "modelClass");
        T newInstance = cls.newInstance();
        C87412m.m108593f(newInstance, "modelClass.newInstance()");
        return (C39622i0) newInstance;
    }
}
