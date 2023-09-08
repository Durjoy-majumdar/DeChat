package p516f9;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.iid.FirebaseInstanceId;

/* renamed from: f9.f */
public final /* synthetic */ class C116819f implements ComponentFactory {

    /* renamed from: a */
    public static final ComponentFactory f350172a = new C116819f();

    public final Object create(ComponentContainer componentContainer) {
        return new FirebaseInstanceId((FirebaseApp) componentContainer.get(FirebaseApp.class));
    }
}
