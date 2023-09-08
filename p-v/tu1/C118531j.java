package tu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.api.ITPPlayer;
import com.tencent.thumbplayer.api.ITPPlayerListener;

/* renamed from: tu1.j */
public final class C118531j implements ITPPlayerListener.IOnInfoListener {

    /* renamed from: d */
    public final /* synthetic */ C118522d f354729d;

    public C118531j(C118522d dVar) {
        this.f354729d = dVar;
    }

    public final void onInfo(ITPPlayer iTPPlayer, int i, long j, long j2, Object obj) {
        String str = this.f354729d.f354709a;
        Log.m105924i(str, "tplayer log " + iTPPlayer + ", msg:" + i);
        if (i == 108) {
            String str2 = this.f354729d.f354709a;
            Log.m105924i(str2, "video_status firstFrame ok: " + iTPPlayer);
            C118541p pVar = this.f354729d.f354713e;
            if (pVar != null) {
                ((C118539n) pVar).mo183257a(false, 10);
            }
        } else if (i == 200) {
            String str3 = this.f354729d.f354709a;
            Log.m105924i(str3, "video_status need buffer: " + iTPPlayer + " mediaId:" + this.f354729d.f354715g);
            C118541p pVar2 = this.f354729d.f354713e;
            if (pVar2 != null) {
                ((C118539n) pVar2).mo183257a(false, 7);
            }
        } else if (i == 201) {
            String str4 = this.f354729d.f354709a;
            Log.m105924i(str4, "video_status buffer ok: " + iTPPlayer);
            C118541p pVar3 = this.f354729d.f354713e;
            if (pVar3 != null) {
                ((C118539n) pVar3).mo183257a(false, 8);
            }
        }
    }
}
