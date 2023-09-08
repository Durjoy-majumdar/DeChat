package g60;

import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.p016ui.dialog.LiveAnchorMicUserListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;

/* renamed from: g60.g */
public final class C59371g implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorMicUserListView f169687d;

    public C59371g(LiveAnchorMicUserListView liveAnchorMicUserListView) {
        this.f169687d = liveAnchorMicUserListView;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        yVar.setHasCallbackToQueue(true);
        String str2 = "anchor close mic permission:" + i + " errCode:" + i2 + " errMsg:" + str;
        C87412m.m108594g(str2, "debugText");
        Log.m105924i("MicroMsg.LiveCoreMic", str2);
        if (i == 0 && i2 == 0) {
            this.f169687d.setMicPermission(false);
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            RoomLiveService.f157185Q.f151233h.clear();
            this.f169687d.mo76461d();
        } else {
            this.f169687d.setMicPermission(true);
        }
        C32226l<Boolean, C13598b0> micPermissionListener = this.f169687d.getMicPermissionListener();
        if (micPermissionListener != null) {
            micPermissionListener.invoke(Boolean.valueOf(this.f169687d.getMicPermission()));
        }
    }
}
