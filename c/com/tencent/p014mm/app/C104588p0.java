package com.tencent.p014mm.app;

import com.tencent.p014mm.autogen.events.MediaLeakEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.Map;
import p331dj.C107046f;

/* renamed from: com.tencent.mm.app.p0 */
public class C104588p0 extends IStaticListener<MediaLeakEvent> {

    /* renamed from: d */
    public static boolean f309989d;

    /* renamed from: e */
    public static int f309990e;

    /* renamed from: f */
    public static int f309991f;

    public C104588p0() {
        if (MMApplicationContext.isMainProcess()) {
            f309990e = 2;
            f309991f = 12;
        } else if (MMApplicationContext.isToolsProcess()) {
            f309990e = 22;
            f309991f = 32;
        } else if (MMApplicationContext.isAppBrandProcess()) {
            f309990e = 42;
            f309991f = 52;
        }
    }

    public boolean callback(IEvent iEvent) {
        MediaLeakEvent mediaLeakEvent = (MediaLeakEvent) iEvent;
        if (mediaLeakEvent != null) {
            Log.m105929w("MicroMsg.MediaLeakReporter", "event audio[%b %d] mediaplayer[%b %d] audioRecord[%b %d] hadRpt[%b]", Boolean.valueOf(mediaLeakEvent.f310003d.f310004a), Integer.valueOf(mediaLeakEvent.f310003d.f310005b), Boolean.valueOf(mediaLeakEvent.f310003d.f310006c), Integer.valueOf(mediaLeakEvent.f310003d.f310007d), Boolean.valueOf(mediaLeakEvent.f310003d.f310008e), Integer.valueOf(mediaLeakEvent.f310003d.f310009f), Boolean.valueOf(f309989d));
            if (mediaLeakEvent.f310003d.f310004a) {
                C115669n.INSTANCE.idkeyStat(650, (long) f309990e, 1, false);
            }
            if (mediaLeakEvent.f310003d.f310006c) {
                C115669n.INSTANCE.idkeyStat(650, (long) f309991f, 1, false);
            }
            if (mediaLeakEvent.f310003d.f310008e) {
                C115669n.INSTANCE.idkeyStat(650, (long) (f309991f + 1), 1, false);
            }
            if (!f309989d) {
                MediaLeakEvent.C104594a aVar = mediaLeakEvent.f310003d;
                if (aVar.f310005b > 10 || aVar.f310007d > 10 || aVar.f310009f >= 1) {
                    C115669n.INSTANCE.mo160135k("mediaLeak", C107046f.m144907b(), (Map<String, Object>) null);
                    f309989d = true;
                }
            }
        }
        return false;
    }
}
