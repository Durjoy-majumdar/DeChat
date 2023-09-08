package wi0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Locale;
import sf0.C90189z;

/* renamed from: wi0.j */
public final class C90985j {
    /* renamed from: a */
    public static void m114153a(C90985j jVar) {
        jVar.getClass();
        Log.m105918d("MicroMsg.AppBrandNewContactFixVersionStateTransfer", "doFix()");
        if (C81161g2.vx0() != null) {
            C81161g2.requireAccountInitializedOnDemand();
            C90189z.C90190a aVar = C81161g2.f238476o;
            C81161g2.Cx0();
            aVar.execSQL("WxaAttributesTable", String.format(Locale.US, "update %s set %s='' where %s is null or %s=''", new Object[]{"WxaAttributesTable", "syncVersion", "versionInfo", "versionInfo"}));
        }
    }
}
