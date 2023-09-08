package com.tencent.p014mm.plugin.finder.utils;

import android.content.Intent;
import bh3.C113177k;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fe1.C8014g;
import gy3.C87412m;
import ht1.C60200t1;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.utils.FinderLbsLogic */
public final class FinderLbsLogic {

    /* renamed from: a */
    public static final FinderLbsLogic f17479a = new FinderLbsLogic();

    /* renamed from: a */
    public final boolean mo4229a() {
        return ((C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class)).mo9103H();
    }

    /* renamed from: b */
    public final void mo4230b(MMActivity mMActivity) {
        Class cls = C113177k.class;
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C113177k.C113179b bVar = C113177k.C113179b.LOCAION;
        boolean z = ((C113177k) C86312j.m106911c(cls)).w00(bVar, C113177k.C113178a.FINDER) && ((C113177k) C86312j.m106911c(cls)).w00(bVar, C113177k.C113178a.LIVE);
        if (mo4229a() && !z) {
            Intent intent = new Intent();
            intent.setClassName(mMActivity, "com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(mMActivity, aVar.mo10232b(), "com/tencent/mm/plugin/finder/utils/FinderLbsLogic", "requestLocationPermission", "(Lcom/tencent/mm/ui/MMActivity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMActivity, "com/tencent/mm/plugin/finder/utils/FinderLbsLogic", "requestLocationPermission", "(Lcom/tencent/mm/ui/MMActivity;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        ((C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class)).mo9107u(mMActivity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("Finder.FinderLbsLogic", r0, "syncWaitLbs exception", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4231c() {
        /*
            r6 = this;
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1 = 0
            monitor-enter(r0)     // Catch:{ all -> 0x005a }
            java.lang.String r2 = "Finder.FinderLbsLogic"
            java.lang.String r3 = "start syncWaitLbs"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x0057 }
            com.tencent.mm.app.f r2 = com.tencent.p014mm.app.C40008f.f107254d     // Catch:{ all -> 0x0057 }
            com.tencent.mm.plugin.finder.utils.FinderLbsLogic$syncWaitLbs$1$listener$1 r3 = new com.tencent.mm.plugin.finder.utils.FinderLbsLogic$syncWaitLbs$1$listener$1     // Catch:{ all -> 0x0057 }
            r3.<init>(r0, r2)     // Catch:{ all -> 0x0057 }
            r3.alive()     // Catch:{ all -> 0x0057 }
            bl3.r r2 = bl3.C39818r.f106831a     // Catch:{ all -> 0x0057 }
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            bl3.r$a r2 = r2.mo62446e(r3)     // Catch:{ all -> 0x0057 }
            java.lang.Class<fe1.g> r3 = fe1.C8014g.class
            bl3.c r2 = r2.mo62447c(r3)     // Catch:{ all -> 0x0057 }
            fe1.g r2 = (fe1.C8014g) r2     // Catch:{ all -> 0x0057 }
            r3 = 1
            boolean r2 = r2.mo9105q2(r3)     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x004d
            java.lang.String r2 = "Finder.FinderLbsLogic"
            java.lang.String r4 = "wait syncWaitLbs"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x0057 }
            up1.f r2 = up1.C37521f.f99374d     // Catch:{ all -> 0x0057 }
            r2.getClass()     // Catch:{ all -> 0x0057 }
            int r2 = up1.C37521f.f99305V     // Catch:{ all -> 0x0057 }
            long r4 = (long) r2     // Catch:{ all -> 0x0057 }
            r0.wait(r4)     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = "Finder.FinderLbsLogic"
            java.lang.String r4 = "syncWaitLbs ok"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ all -> 0x0057 }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r3
        L_0x004d:
            java.lang.String r2 = "Finder.FinderLbsLogic"
            java.lang.String r3 = "syncWaitLbs no permission"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ all -> 0x0057 }
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return r1
        L_0x0057:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r2     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            java.lang.String r2 = "Finder.FinderLbsLogic"
            java.lang.String r3 = "syncWaitLbs exception"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.utils.FinderLbsLogic.mo4231c():boolean");
    }
}
