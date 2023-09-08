package com.tencent.p014mm.plugin.webview.p128ui.tools.floatball;

import android.os.Bundle;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.floatball.a */
public final class C6160a {

    /* renamed from: a */
    public final int f22627a;

    /* renamed from: b */
    public final Bundle f22628b;

    public C6160a(int i, Bundle bundle) {
        C87412m.m108594g(bundle, "bundle");
        this.f22627a = i;
        this.f22628b = bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6160a)) {
            return false;
        }
        C6160a aVar = (C6160a) obj;
        return this.f22627a == aVar.f22627a && C87412m.m108589b(this.f22628b, aVar.f22628b);
    }

    public int hashCode() {
        return (this.f22627a * 31) + this.f22628b.hashCode();
    }

    public String toString() {
        return "JSApiInfo(id=" + this.f22627a + ", bundle=" + this.f22628b + ')';
    }
}
