package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import java.util.Collections;
import java.util.List;
import p1175c9.C113253a;
import p1189d9.C116603a;

public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public List<Component<?>> getComponents() {
        return Collections.singletonList(Component.builder(C113253a.class).add(Dependency.required(FirebaseApp.class)).add(Dependency.required(Context.class)).factory(C116603a.f349661a).build());
    }
}
