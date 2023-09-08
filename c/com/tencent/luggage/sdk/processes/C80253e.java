package com.tencent.luggage.sdk.processes;

import gy3.C87412m;
import lu3.C109426i;

/* renamed from: com.tencent.luggage.sdk.processes.e */
public final class C80253e implements C109426i {
    public String getKey() {
        return "";
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        C80254f<C80250c<C80278n>, C80278n> fVar = C80254f.f234946e;
        if (fVar != null) {
            for (C80250c j : fVar.mo111395j()) {
                j.mo111365j();
            }
            return;
        }
        C87412m.m108603p("INSTANCE_");
        throw null;
    }
}
