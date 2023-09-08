package g60;

import a60.C53979a;
import com.tencent.p014mm.live.model.RoomLiveService;
import com.tencent.p014mm.live.p016ui.dialog.LiveAnchorMicUserListView;
import fy3.C32227p;
import gy3.C24564k0;
import gy3.C87413o;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: g60.f */
public final class C59370f extends C87413o implements C32227p<Integer, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ LiveAnchorMicUserListView f169686d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59370f(LiveAnchorMicUserListView liveAnchorMicUserListView) {
        super(2);
        this.f169686d = liveAnchorMicUserListView;
    }

    public Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        if (intValue == 0 && intValue2 == 0) {
            ArrayList<C53979a.C53980a> arrayList = RoomLiveService.f157185Q.f151233h;
            C24564k0.m30737a(arrayList).remove(this.f169686d.f157242n);
            RoomLiveService.f157185Q.mo74652b();
            LiveAnchorMicUserListView liveAnchorMicUserListView = this.f169686d;
            liveAnchorMicUserListView.f157243o = true;
            liveAnchorMicUserListView.f157242n = null;
            C32227p<Boolean, C53979a.C53980a, C13598b0> callMicListener = liveAnchorMicUserListView.getCallMicListener();
            if (callMicListener != null) {
                callMicListener.invoke(Boolean.FALSE, null);
            }
        }
        return C13598b0.f38549a;
    }
}
