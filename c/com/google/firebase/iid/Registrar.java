package com.google.firebase.iid;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import java.util.Arrays;
import java.util.List;
import p516f9.C116819f;
import p516f9.C116821g;

public final class Registrar implements ComponentRegistrar {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    public static class C113381a implements FirebaseInstanceIdInternal {
        public C113381a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    public final List<Component<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        return Arrays.asList(new Component[]{Component.builder(cls).add(Dependency.required(FirebaseApp.class)).factory(C116819f.f350172a).alwaysEager().build(), Component.builder(FirebaseInstanceIdInternal.class).add(Dependency.required(cls)).factory(C116821g.f350173a).build()});
    }
}
