package h60;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.view.LiveAnchorPluginLayout;
import d60.C58124b;

/* renamed from: h60.j */
public final class C59759j implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorPluginLayout f170652d;

    public C59759j(LiveAnchorPluginLayout liveAnchorPluginLayout) {
        this.f170652d = liveAnchorPluginLayout;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        RoomLiveService.f157190a.mo76446d();
        C58124b.C7172a.m7372a(this.f170652d, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
    }
}
