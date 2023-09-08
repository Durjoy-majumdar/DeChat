package gk3;

import com.tencent.p014mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import gk3.C98136e;
import gy3.C87412m;

/* renamed from: gk3.f */
public final class C98139f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98136e.C98138b f287748d;

    /* renamed from: e */
    public final /* synthetic */ int f287749e;

    /* renamed from: f */
    public final /* synthetic */ int f287750f;

    /* renamed from: g */
    public final /* synthetic */ long f287751g;

    public C98139f(C98136e.C98138b bVar, int i, int i2, long j) {
        this.f287748d = bVar;
        this.f287749e = i;
        this.f287750f = i2;
        this.f287751g = j;
    }

    public final void run() {
        byte[] O;
        C98136e.C98138b bVar = this.f287748d;
        int i = this.f287749e;
        int i2 = this.f287750f;
        long j = this.f287751g;
        if (C86013q1.m106450k(bVar.f287745h) && (O = C86013q1.m106433O(bVar.f287745h, 0, -1)) != null) {
            try {
                String mD5String = MD5Util.getMD5String(O);
                C87412m.m108593f(mD5String, "getMD5String(data)");
                bVar.f287746i = mD5String;
            } catch (Exception unused) {
            }
            Log.m105927v("MicroMsg.ImageScanButtonReporter", "alvinluo doReportSearchButtonAction sessionId: %s, msgId: %s, detectId: %s, action: %d, source: %d, scene: %d, chatType: %d, username: %s, chatRoomId: %s, imagePath: %s, md5: %s, serverSessionId: %s", bVar.f287738a, Long.valueOf(bVar.f287741d), Long.valueOf(bVar.f287739b), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bVar.f287740c), Integer.valueOf(bVar.f287743f), bVar.f287742e, bVar.f287744g, bVar.f287745h, bVar.f287746i, 0L);
            ChatImageWebSearchActionStruct chatImageWebSearchActionStruct = new ChatImageWebSearchActionStruct();
            chatImageWebSearchActionStruct.mo126611w(bVar.f287738a);
            chatImageWebSearchActionStruct.f265369e = i;
            chatImageWebSearchActionStruct.f265370f = i2;
            chatImageWebSearchActionStruct.f265371g = bVar.f287740c;
            chatImageWebSearchActionStruct.mo126609u(String.valueOf(bVar.f287741d));
            chatImageWebSearchActionStruct.f265374j = bVar.f287743f;
            chatImageWebSearchActionStruct.mo126607s(bVar.f287744g);
            chatImageWebSearchActionStruct.mo126610v(bVar.f287746i);
            chatImageWebSearchActionStruct.f265377m = j;
            chatImageWebSearchActionStruct.mo86054n();
        }
    }
}
