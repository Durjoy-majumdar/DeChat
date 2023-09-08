package h60;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.view.LiveVisitorPluginLayout;
import d60.C58124b;

/* renamed from: h60.t */
public final class C59768t implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ LiveVisitorPluginLayout f170661d;

    public C59768t(LiveVisitorPluginLayout liveVisitorPluginLayout) {
        this.f170661d = liveVisitorPluginLayout;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        RoomLiveService.f157190a.mo76446d();
        C58124b.C7172a.m7372a(this.f170661d, C58124b.C58125b.QUIT_LIVE, (Bundle) null, 2, (Object) null);
    }
}
