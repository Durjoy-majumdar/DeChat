package jd0;

import com.tencent.p014mm.autogen.events.MediaInfoRptEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import hd0.C98397f0;

/* renamed from: jd0.b */
public class C98938b extends IStaticListener<MediaInfoRptEvent> {
    public boolean callback(IEvent iEvent) {
        MediaInfoRptEvent mediaInfoRptEvent = (MediaInfoRptEvent) iEvent;
        Log.m105918d("MediaInfoRptEventIListener", "get media info report event.");
        if (mediaInfoRptEvent == null) {
            return false;
        }
        String str = mediaInfoRptEvent.f264906d.f264914h;
        try {
            if (str.endsWith(".tmp")) {
                str = str.substring(0, str.lastIndexOf(".tmp"));
                Log.m105925i("MediaInfoRptEventIListener", "media info event path[%s, %s]", str, mediaInfoRptEvent.f264906d.f264914h);
            }
        } catch (Exception unused) {
        }
        String str2 = str;
        MediaInfoRptEvent.C92530a aVar = mediaInfoRptEvent.f264906d;
        String str3 = aVar.f264907a;
        String str4 = aVar.f264908b;
        int i = aVar.f264909c;
        String str5 = aVar.f264910d;
        String str6 = aVar.f264916j;
        long j = aVar.f264912f;
        long j2 = aVar.f264913g;
        String[] strArr = aVar.f264915i;
        int i2 = aVar.f264917k;
        int i3 = aVar.f264918l;
        String str7 = aVar.f264919m;
        C86709a0.m107525e().postToWorker(new C98397f0(str2, strArr, str3, str4, i, str5, str6, j, j2, i2, i3, str7));
        return false;
    }
}
