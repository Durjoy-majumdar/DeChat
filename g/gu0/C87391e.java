package gu0;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.C80681o;
import com.tencent.p014mm.plugin.appbrand.C84073q2;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: gu0.e */
public class C87391e implements C80669j.C80675f {

    /* renamed from: a */
    public final /* synthetic */ Boolean f253277a;

    /* renamed from: b */
    public final /* synthetic */ d$$c f253278b;

    public C87391e(d$$c d__c, Boolean bool) {
        this.f253278b = d__c;
        this.f253277a = bool;
    }

    /* renamed from: a */
    public void mo112506a(String str, C80669j.C80676g gVar) {
        C80681o.C80688g gVar2;
        if (this.f253277a.booleanValue() && (gVar2 = this.f253278b.f253259d) != null) {
            ((C84073q2.C84074a) gVar2).mo116736a(Util.nowMilliSecond() - this.f253278b.f253256a);
        }
    }
}
