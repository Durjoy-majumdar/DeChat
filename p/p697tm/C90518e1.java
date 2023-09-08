package p697tm;

import com.tencent.p014mm.autogen.events.FetchAppBrandInfoForMusicEvent;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.media.music.C83613a;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: tm.e1 */
public class C90518e1 extends IStaticListener<FetchAppBrandInfoForMusicEvent> {
    public boolean callback(IEvent iEvent) {
        FetchAppBrandInfoForMusicEvent fetchAppBrandInfoForMusicEvent = (FetchAppBrandInfoForMusicEvent) iEvent;
        if (!C86709a0.m107522a()) {
            return false;
        }
        Log.m105924i("MicroMsg.SubCoreAppBrand", "FetchAppBrandInfoForMusicEvent callback");
        FetchAppBrandInfoForMusicEvent.C80720a aVar = fetchAppBrandInfoForMusicEvent.f236206d;
        C83613a aVar2 = C83613a.C83615b.f244198a;
        aVar.f236207a = aVar2.f244191a;
        aVar.f236208b = aVar2.f244196f;
        aVar.f236209c = aVar2.f244195e;
        aVar.f236210d = aVar2.f244194d;
        if (C81161g2.Cx0().mo114000LL(fetchAppBrandInfoForMusicEvent.f236206d.f236208b, "roundedSquareIconURL", "brandIconURL", "bigHeadURL") != null) {
            fetchAppBrandInfoForMusicEvent.f236206d.getClass();
        }
        return true;
    }
}
