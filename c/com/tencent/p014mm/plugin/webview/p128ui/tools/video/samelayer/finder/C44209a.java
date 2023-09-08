package com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder;

import android.os.Bundle;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.autogen.events.OnEnterFinderFullscreenEvent;
import com.tencent.p014mm.autogen.events.OnExitFinderFullscreenEvent;
import com.tencent.p014mm.plugin.webview.model.C43720k;
import com.tencent.p014mm.plugin.webview.model.C43721l;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import e00.C45514j0;
import gy3.C87412m;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.a */
public final class C44209a implements C45514j0 {

    /* renamed from: a */
    public static final C44209a f119774a = new C44209a();

    /* renamed from: b */
    public static final ArrayList<C43720k> f119775b = new ArrayList<>();

    /* renamed from: c */
    public static final ArrayList<C43721l> f119776c = new ArrayList<>();

    /* renamed from: a */
    public void mo68870a(C43720k kVar) {
        C87412m.m108594g(kVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ArrayList<C43720k> arrayList = f119775b;
        synchronized (arrayList) {
            Log.m105919d("MicroMsg.FinderFeedInfoUpdateEventManager", "addFinderFeedInfoEventListener size: %s", Integer.valueOf(arrayList.size()));
            arrayList.add(kVar);
        }
    }

    /* renamed from: b */
    public void mo68871b(C43721l lVar) {
        C87412m.m108594g(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        ArrayList<C43721l> arrayList = f119776c;
        synchronized (arrayList) {
            Log.m105919d("MicroMsg.FinderFeedInfoUpdateEventManager", "addFinderFullscreenListener size: %s", Integer.valueOf(arrayList.size()));
            arrayList.add(lVar);
        }
    }

    /* renamed from: c */
    public void mo68872c(Bundle bundle) {
        C87412m.m108594g(bundle, "data");
        ArrayList<C43720k> arrayList = f119775b;
        synchronized (arrayList) {
            Log.m105919d("MicroMsg.FinderFeedInfoUpdateEventManager", "notifyFinderFeedInfoUpdate %s", Integer.valueOf(arrayList.size()));
            for (C43720k a : arrayList) {
                a.mo62556a(bundle);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: d */
    public void mo68873d(int i, Bundle bundle) {
        ArrayList<C43721l> arrayList = f119776c;
        synchronized (arrayList) {
            Log.m105919d("MicroMsg.FinderFeedInfoUpdateEventManager", "notifyFinderFullscreenStatusChanged %s", Integer.valueOf(arrayList.size()));
            for (C43721l a : arrayList) {
                a.mo18000a(i, bundle);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
    }

    /* renamed from: e */
    public void mo68874e(int i, IEvent iEvent) {
        C87412m.m108594g(iEvent, "event");
        byte[] bArr = null;
        if (i == 2 && (iEvent instanceof OnExitFinderFullscreenEvent)) {
            Bundle bundle = new Bundle();
            OnExitFinderFullscreenEvent onExitFinderFullscreenEvent = (OnExitFinderFullscreenEvent) iEvent;
            bundle.putString("status", onExitFinderFullscreenEvent.f9360d.f9361a);
            bundle.putFloat("playbackTime", onExitFinderFullscreenEvent.f9360d.f9362b);
            bundle.putFloat("playbackRate", onExitFinderFullscreenEvent.f9360d.f9364d);
            bundle.putBoolean("isPause", onExitFinderFullscreenEvent.f9360d.f9363c);
            onExitFinderFullscreenEvent.f9360d.getClass();
            bundle.putBoolean("showBarrage", false);
            try {
                bArr = ((OnExitFinderFullscreenEvent) iEvent).f9360d.f9365e.toByteArray();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FinderFeedInfoUpdateEventManager", e, "FinderVideoInfoForMp.toByteArray exception", new Object[0]);
            }
            if (bArr != null) {
                bundle.putByteArray("videoInfoForMp", bArr);
            }
            mo68873d(i, bundle);
        } else if (i == 1 && (iEvent instanceof OnEnterFinderFullscreenEvent)) {
            mo68873d(i, (Bundle) null);
        }
    }
}
