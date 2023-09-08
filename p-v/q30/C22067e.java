package q30;

import com.tencent.p014mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent;
import di3.C86312j;
import k30.C99096a;
import ky2.C10432i;

/* renamed from: q30.e */
public class C22067e implements C99096a.C99098b {

    /* renamed from: a */
    public final /* synthetic */ C22073k f62449a;

    public C22067e(C22073k kVar) {
        this.f62449a = kVar;
    }

    public Object getData() {
        Class cls = C10432i.class;
        ShouldShowAppBrandEntranceInFindMoreEvent shouldShowAppBrandEntranceInFindMoreEvent = new ShouldShowAppBrandEntranceInFindMoreEvent();
        shouldShowAppBrandEntranceInFindMoreEvent.f236288d.f236290a = true;
        shouldShowAppBrandEntranceInFindMoreEvent.publish();
        return (!shouldShowAppBrandEntranceInFindMoreEvent.f236289e.f236291a || C22073k.m25483b(this.f62449a, 16777216) || (((C10432i) C86312j.m106911c(cls)).mo10750e() && ((C10432i) C86312j.m106911c(cls)).Oh0() == 2)) ? Boolean.FALSE : Boolean.TRUE;
    }
}
