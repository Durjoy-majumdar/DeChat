package p1192e9;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.inject.Provider;

/* renamed from: e9.a */
public /* synthetic */ class C116703a {
    public static Object get(ComponentContainer componentContainer, Class cls) {
        Provider provider = componentContainer.getProvider(cls);
        if (provider == null) {
            return null;
        }
        return provider.get();
    }
}
