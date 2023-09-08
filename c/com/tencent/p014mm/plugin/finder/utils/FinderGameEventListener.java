package com.tencent.p014mm.plugin.finder.utils;

import android.app.Activity;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderGamePostEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/utils/FinderGameEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderGamePostEvent;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "activity", "<init>", "(Ljava/lang/ref/WeakReference;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.utils.FinderGameEventListener */
public final class FinderGameEventListener extends IListener<FinderGamePostEvent> {

    /* renamed from: d */
    public final WeakReference<Activity> f161645d;

    /* renamed from: e */
    public final String f161646e = "Finder.FinderGameEventListener";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderGameEventListener(WeakReference<Activity> weakReference) {
        super(C40008f.f107254d);
        C87412m.m108594g(weakReference, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f161645d = weakReference;
    }

    /* JADX WARNING: type inference failed for: r5v12, types: [androidx.lifecycle.i0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r5) {
        /*
            r4 = this;
            com.tencent.mm.autogen.events.FinderGamePostEvent r5 = (com.tencent.p014mm.autogen.events.FinderGamePostEvent) r5
            java.lang.String r0 = "event"
            gy3.C87412m.m108594g(r5, r0)
            com.tencent.mm.autogen.events.FinderGamePostEvent$a r0 = r5.f154773d
            boolean r0 = r0.f154774a
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = r4.f161646e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.ref.WeakReference<android.app.Activity> r2 = r4.f161645d
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            r3 = 0
            if (r2 == 0) goto L_0x0028
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            goto L_0x0029
        L_0x0028:
            r2 = r3
        L_0x0029:
            r1.append(r2)
            java.lang.String r2 = " finish"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.autogen.events.FinderGamePostEvent$a r5 = r5.f154773d
            boolean r5 = r5.f154775b
            if (r5 == 0) goto L_0x0058
            java.lang.String r5 = r4.f161646e
            java.lang.String r0 = "keepGlobalData"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            fj1.b r5 = fj1.C45795b.f123698n
            if (r5 == 0) goto L_0x0052
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            androidx.lifecycle.i0 r5 = r5.mo71262a(r0)
            r3 = r5
            cl1.o r3 = (cl1.C54991o) r3
        L_0x0052:
            if (r3 != 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            r5 = 1
            r3.f154334k3 = r5
        L_0x0058:
            java.lang.ref.WeakReference<android.app.Activity> r5 = r4.f161645d
            java.lang.Object r5 = r5.get()
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 == 0) goto L_0x0065
            r5.finish()
        L_0x0065:
            r4.dead()
        L_0x0068:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.utils.FinderGameEventListener.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
