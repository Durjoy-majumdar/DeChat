package gu0;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.C80681o;
import com.tencent.p014mm.plugin.appbrand.C84073q2;
import com.tencent.p014mm.plugin.appbrand.utils.C84768n1;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.ArrayList;
import p210o.C11323a;

public class d$$c implements C11323a<Boolean, Void> {

    /* renamed from: a */
    public final long f253256a = Util.nowMilliSecond();

    /* renamed from: b */
    public final /* synthetic */ ArrayList f253257b;

    /* renamed from: c */
    public final /* synthetic */ C80669j f253258c;

    /* renamed from: d */
    public final /* synthetic */ C80681o.C80688g f253259d;

    public d$$c(C87388d dVar, ArrayList arrayList, C80669j jVar, C80681o.C80688g gVar) {
        this.f253257b = arrayList;
        this.f253258c = jVar;
        this.f253259d = gVar;
    }

    public Object apply(Object obj) {
        C80681o.C80688g gVar;
        Boolean bool = (Boolean) obj;
        if (!this.f253257b.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f253257b);
            this.f253257b.clear();
            this.f253258c.mo112498b(arrayList, C84768n1.m104425a(), new C87391e(this, bool));
            return null;
        } else if (!bool.booleanValue() || (gVar = this.f253259d) == null) {
            return null;
        } else {
            ((C84073q2.C84074a) gVar).mo116736a(Util.nowMilliSecond() - this.f253256a);
            return null;
        }
    }
}
