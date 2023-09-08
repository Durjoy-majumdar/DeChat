package g60;

import a43.C103310i;
import a60.C53979a;
import a60.C53983b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.p016ui.dialog.LiveAnchorMicUserListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32227p;
import gy3.C87412m;
import kg3.C76577a;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import rx3.C13598b0;

/* renamed from: g60.a */
public final class C59365a implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorMicUserListView f169680d;

    /* renamed from: e */
    public final /* synthetic */ C53979a.C53980a f169681e;

    public C59365a(LiveAnchorMicUserListView liveAnchorMicUserListView, C53979a.C53980a aVar) {
        this.f169680d = liveAnchorMicUserListView;
        this.f169681e = aVar;
    }

    public final void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        yVar.setHasCallbackToQueue(true);
        String str2 = "[cgi]accept mic errType:" + i + " errCode:" + i2 + " errMsg:" + str;
        C87412m.m108594g(str2, "debugText");
        Log.m105924i("MicroMsg.LiveCoreMic", str2);
        if (i == 0 && i2 == 0) {
            ((C103310i) this.f169680d.f157236e).mo143086b("playend", true, 1, true);
            C53979a aVar = RoomLiveService.f157185Q;
            C53979a.C53980a aVar2 = this.f169681e;
            aVar.getClass();
            C87412m.m108594g(aVar2, "user");
            MMHandlerThread.postToMainThread(new C53983b(aVar, aVar2));
            return;
        }
        C76912y0.makeText(this.f169680d.getContext(), (CharSequence) C76577a.m92166q(this.f169680d.getContext(), C0966R.string.g9t), 0).show();
        LiveAnchorMicUserListView liveAnchorMicUserListView = this.f169680d;
        liveAnchorMicUserListView.f157243o = true;
        C32227p<Boolean, C53979a.C53980a, C13598b0> callMicListener = liveAnchorMicUserListView.getCallMicListener();
        if (callMicListener != null) {
            callMicListener.invoke(Boolean.FALSE, null);
        }
        this.f169680d.mo76461d();
    }
}
