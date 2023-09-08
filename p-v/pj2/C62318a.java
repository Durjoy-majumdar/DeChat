package pj2;

import gy3.C87412m;
import jq3.C9493c;
import ve3.C52833i;

/* renamed from: pj2.a */
public final class C62318a implements C9493c {

    /* renamed from: d */
    public final C52833i f177144d;

    /* renamed from: e */
    public boolean f177145e;

    public C62318a(C52833i iVar) {
        C87412m.m108594g(iVar, "exclusiveRingtoneData");
        this.f177144d = iVar;
    }

    /* renamed from: c */
    public int mo75c() {
        return 1;
    }

    public long getItemId() {
        String str = this.f177144d.f147588d;
        return (long) (str != null ? str.hashCode() : 0);
    }
}
