package p516f9;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.Registrar;

/* renamed from: f9.g */
public final /* synthetic */ class C116821g implements ComponentFactory {

    /* renamed from: a */
    public static final ComponentFactory f350173a = new C116821g();

    public final Object create(ComponentContainer componentContainer) {
        return new Registrar.C113381a((FirebaseInstanceId) componentContainer.get(FirebaseInstanceId.class));
    }
}
