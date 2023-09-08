package yq0;

import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C88643g;
import te3.C90411fk2;
import zp0.C16377l;

/* renamed from: yq0.i */
public class C91559i implements C87581a<Void, C90411fk2> {

    /* renamed from: a */
    public final /* synthetic */ C16377l f262393a;

    /* renamed from: b */
    public final /* synthetic */ String f262394b;

    /* renamed from: c */
    public final /* synthetic */ C91548e f262395c;

    public C91559i(C91548e eVar, C16377l lVar, String str) {
        this.f262395c = eVar;
        this.f262393a = lVar;
        this.f262394b = str;
    }

    public Object call(Object obj) {
        C90411fk2 fk22 = (C90411fk2) obj;
        try {
            C91548e eVar = this.f262395c;
            C16377l lVar = this.f262393a;
            eVar.getClass();
            C91548e.m114885a(eVar, lVar, fk22);
            return null;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth appId = %s, e = %s", this.f262394b, e);
            C88643g.m110544b().mo72091a(e);
            return null;
        }
    }
}
