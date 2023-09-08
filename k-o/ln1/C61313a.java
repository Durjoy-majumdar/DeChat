package ln1;

import cm1.C0797z;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLivePlayFeedEntranceLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import h81.C59774i;
import p185kq.C10383h;
import te3.C64273c21;

/* renamed from: ln1.a */
public final class C61313a {

    /* renamed from: a */
    public static final C61313a f174432a = new C61313a();

    /* renamed from: b */
    public static String f174433b = "94";

    /* renamed from: a */
    public final void mo86280a(C0797z zVar, long j, long j2) {
        String str;
        String userName = zVar.mo3513o().getUserName();
        C64273c21 liveInfo = zVar.mo3513o().getLiveInfo();
        String str2 = "";
        if (liveInfo == null || (str = Long.valueOf(liveInfo.f182392d).toString()) == null) {
            str = str2;
        }
        String XQ = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(zVar.mo3513o().getFeedObject().f164794id);
        String str3 = f174433b;
        String str4 = zVar.mo3513o().getFeedObject().sessionBuffer;
        if (str4 == null) {
            str4 = str2;
        }
        C64273c21 liveInfo2 = zVar.mo3513o().getLiveInfo();
        long j3 = liveInfo2 != null ? (long) liveInfo2.f182403q : 0;
        C64273c21 liveInfo3 = zVar.mo3513o().getLiveInfo();
        boolean z = false;
        if (liveInfo3 != null && liveInfo3.f182394f == 1) {
            z = true;
        }
        long j4 = z ? 1 : 2;
        C87412m.m108593f(XQ, "feedID");
        FinderLivePlayFeedEntranceLogStruct finderLivePlayFeedEntranceLogStruct = new FinderLivePlayFeedEntranceLogStruct();
        finderLivePlayFeedEntranceLogStruct.f155586d = finderLivePlayFeedEntranceLogStruct.mo86045b("UserName", userName, true);
        finderLivePlayFeedEntranceLogStruct.f155587e = finderLivePlayFeedEntranceLogStruct.mo86045b("LiveID", str, true);
        finderLivePlayFeedEntranceLogStruct.f155588f = finderLivePlayFeedEntranceLogStruct.mo86045b("FeedID", XQ, true);
        String Wb = ((C59774i) C86312j.m106911c(C59774i.class)).mo84751Wb();
        if (Wb != null) {
            str2 = Wb;
        }
        finderLivePlayFeedEntranceLogStruct.f155589g = finderLivePlayFeedEntranceLogStruct.mo86045b("sessionid", str2, true);
        finderLivePlayFeedEntranceLogStruct.f155590h = C31543z5.m39453c();
        finderLivePlayFeedEntranceLogStruct.f155591i = j2;
        finderLivePlayFeedEntranceLogStruct.f155592j = finderLivePlayFeedEntranceLogStruct.mo86045b("CommentScene", str3, true);
        finderLivePlayFeedEntranceLogStruct.f155593k = j;
        finderLivePlayFeedEntranceLogStruct.f155594l = j4;
        finderLivePlayFeedEntranceLogStruct.f155595m = finderLivePlayFeedEntranceLogStruct.mo86045b("ContextId", C10585g.f31934b, true);
        finderLivePlayFeedEntranceLogStruct.f155596n = finderLivePlayFeedEntranceLogStruct.mo86045b("ClickTabContextId", "1001-" + C31543z5.m39453c(), true);
        finderLivePlayFeedEntranceLogStruct.f155597o = finderLivePlayFeedEntranceLogStruct.mo86045b("SessionBuffer", str4, true);
        finderLivePlayFeedEntranceLogStruct.f155598p = j3;
        finderLivePlayFeedEntranceLogStruct.mo86054n();
        Log.m105924i("FinderLivePlayFeedEntranceLogReporter", finderLivePlayFeedEntranceLogStruct.mo1006q());
    }
}
