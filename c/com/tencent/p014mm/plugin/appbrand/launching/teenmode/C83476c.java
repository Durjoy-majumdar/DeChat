package com.tencent.p014mm.plugin.appbrand.launching.teenmode;

import com.tencent.p014mm.plugin.appbrand.appusage.C81500i0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import gy3.C87412m;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.c */
public final class C83476c implements MStorage.IOnStorageChange {

    /* renamed from: d */
    public static final C83476c f243922d = new C83476c();

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.c$a */
    public static final class C83477a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81500i0.C29371c f243923d;

        public C83477a(C81500i0.C29371c cVar) {
            this.f243923d = cVar;
        }

        public final void run() {
            C83472a aVar = C83472a.f243917a;
            C81500i0.C29371c cVar = this.f243923d;
            aVar.mo115771a(cVar.field_username, cVar.field_versionType);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.teenmode.c$b */
    public static final class C83478b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81500i0.C29371c f243924d;

        public C83478b(C81500i0.C29371c cVar) {
            this.f243924d = cVar;
        }

        public final void run() {
            C83472a aVar = C83472a.f243917a;
            C81500i0.C29371c cVar = this.f243924d;
            String str = cVar.field_username;
            int i = cVar.field_versionType;
            if (!(str == null || str.length() == 0)) {
                C83472a.f243918b.remove(aVar.mo115772b(str, i));
                Log.m105925i("MicroMsg.AppBrandTeenModeReporter", "removeCollection %s, %d, %d", str, Integer.valueOf(i), Integer.valueOf(C83472a.f243918b.size()));
            }
            C83472a.m102434c(this.f243924d.field_username);
        }
    }

    public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
        Object[] objArr = new Object[3];
        boolean z = false;
        objArr[0] = str;
        Object obj = null;
        objArr[1] = mStorageEventData != null ? Integer.valueOf(mStorageEventData.eventId) : null;
        if (mStorageEventData != null) {
            obj = mStorageEventData.obj;
        }
        objArr[2] = obj;
        Log.m105925i("MicroMsg.AppBrandTeenModeReporter", "alvinluo starAppStorage onNotifyChanged event: %s, eventId: %s, eventData.obj: %s", objArr);
        if (mStorageEventData != null && mStorageEventData.eventId == 2) {
            Object obj2 = mStorageEventData.obj;
            if (obj2 instanceof C81500i0.C29371c) {
                C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandStarAppStorage.AppBrandStarAppRecord");
                C83472a aVar = C83472a.f243917a;
                ((C119157j) C119157j.f356862d).mo183871b(new C83477a((C81500i0.C29371c) obj2), "AppBrandTeenModeReporter");
                return;
            }
            return;
        }
        if (mStorageEventData != null && mStorageEventData.eventId == 5) {
            z = true;
        }
        if (z) {
            Object obj3 = mStorageEventData.obj;
            if (obj3 instanceof C81500i0.C29371c) {
                C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.appusage.AppBrandStarAppStorage.AppBrandStarAppRecord");
                C83472a aVar2 = C83472a.f243917a;
                ((C119157j) C119157j.f356862d).mo183871b(new C83478b((C81500i0.C29371c) obj3), "AppBrandTeenModeReporter");
            }
        }
    }
}
