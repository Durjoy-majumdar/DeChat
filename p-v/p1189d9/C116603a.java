package p1189d9;

import android.content.Context;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import p1175c9.C113254b;

/* renamed from: d9.a */
public final /* synthetic */ class C116603a implements ComponentFactory {

    /* renamed from: a */
    public static final ComponentFactory f349661a = new C116603a();

    public final Object create(ComponentContainer componentContainer) {
        return C113254b.getInstance((Context) componentContainer.get(Context.class));
    }
}
