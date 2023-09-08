package h60;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.view.LiveAnchorPluginLayout;
import d60.C58124b;

/* renamed from: h60.d */
public final class C59753d implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorPluginLayout f170646d;

    public C59753d(LiveAnchorPluginLayout liveAnchorPluginLayout) {
        this.f170646d = liveAnchorPluginLayout;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        RoomLiveService.f157190a.mo76446d();
        C58124b.C7172a.m7372a(this.f170646d, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
    }
}
