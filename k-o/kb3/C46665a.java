package kb3;

import com.tencent.p014mm.plugin.wepkg.model.BaseWepkgProcessTask;
import com.tencent.p014mm.plugin.wepkg.model.C44488a;
import com.tencent.p014mm.plugin.wepkg.model.C44500j;
import com.tencent.p014mm.plugin.wepkg.model.C44501k;
import com.tencent.p014mm.plugin.wepkg.model.C44502l;
import com.tencent.p014mm.plugin.wepkg.model.C44520o;
import com.tencent.p014mm.plugin.wepkg.model.WepkgCrossProcessTask;
import com.tencent.p014mm.plugin.wepkg.model.WepkgPreloadFile;
import com.tencent.p014mm.plugin.wepkg.model.WepkgVersion;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import java.util.Map;

/* renamed from: kb3.a */
public class C46665a {

    /* renamed from: a */
    public static C44501k f125635a;

    /* renamed from: b */
    public static boolean f125636b;

    /* renamed from: kb3.a$a */
    public class C46666a extends C44488a {
        /* renamed from: a */
        public void mo66027a(BaseWepkgProcessTask baseWepkgProcessTask) {
            WepkgVersion wepkgVersion = ((WepkgCrossProcessTask) baseWepkgProcessTask).f120619i;
            if (wepkgVersion == null) {
                Log.m105920e("MicroMsg.CommJsLoader", "wepkgVersion is null");
                C46665a.f125635a = null;
                return;
            }
            String str = wepkgVersion.f120653f;
            if (str == null) {
                Log.m105920e("MicroMsg.CommJsLoader", "version is null");
                C46665a.f125635a = null;
                return;
            }
            C44501k kVar = C46665a.f125635a;
            if (kVar != null && str.equals(kVar.f120697d.f120653f)) {
                return;
            }
            if (!wepkgVersion.f120667w) {
                Log.m105920e("MicroMsg.CommJsLoader", "bigPackage is not ready");
                C46665a.f125635a = null;
                return;
            }
            C44500j c = C44502l.m48873c(C46665a.m51974c(), wepkgVersion.f120653f, wepkgVersion.f120654g, wepkgVersion.f120660p, wepkgVersion.f120662r);
            if (c == null || Util.isNullOrNil(wepkgVersion.f120654g) || !C86013q1.m106450k(wepkgVersion.f120654g)) {
                Log.m105920e("MicroMsg.CommJsLoader", "path not exist");
                C46665a.f125635a = null;
                return;
            }
            C46665a.f125635a = new C44501k(wepkgVersion, c, (Map<String, WepkgPreloadFile>) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f120697d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m51972a() {
        /*
            com.tencent.mm.plugin.wepkg.model.k r0 = f125635a
            if (r0 == 0) goto L_0x000b
            com.tencent.mm.plugin.wepkg.model.WepkgVersion r0 = r0.f120697d
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.f120653f
            return r0
        L_0x000b:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kb3.C46665a.m51972a():java.lang.String");
    }

    /* renamed from: b */
    public static void m51973b() {
        Log.m105924i("MicroMsg.CommJsLoader", "load");
        String c = m51974c();
        C46666a aVar = new C46666a();
        Log.printInfoStack("MicroMsg.Wepkg.WepkgProcessTaskPerformer", "getWepkgVersionRecordWithAbleAsync", new Object[0]);
        WepkgCrossProcessTask wepkgCrossProcessTask = new WepkgCrossProcessTask();
        wepkgCrossProcessTask.f120618h = 3002;
        wepkgCrossProcessTask.f120619i.f120651d = c;
        if (MMApplicationContext.isMMProcess()) {
            wepkgCrossProcessTask.mo1553j();
            return;
        }
        wepkgCrossProcessTask.f120625r = new C44520o(aVar, wepkgCrossProcessTask);
        wepkgCrossProcessTask.mo114395c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019 A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m51974c() {
        /*
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.m45371e()
            if (r0 == 0) goto L_0x000f
            com.tencent.mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse r0 = com.tencent.p014mm.plugin.game.commlib.C41853c.f112797a
            py1.w r0 = r0.CommJsLib
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r0.f128093d
            goto L_0x0013
        L_0x000f:
            com.tencent.p014mm.plugin.game.commlib.C41853c.m45381o()
        L_0x0012:
            r0 = 0
        L_0x0013:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 != 0) goto L_0x001a
            return r0
        L_0x001a:
            java.lang.String r0 = "commlib"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kb3.C46665a.m51974c():java.lang.String");
    }
}
