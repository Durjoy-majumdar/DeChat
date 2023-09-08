package dp1;

import com.tencent.p014mm.autogen.mmdata.rpt.FinderPostStruct;
import com.tencent.p014mm.protocal.protobuf.FinderFeedReportObject;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import er1.C58741j5;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import org.json.JSONObject;
import rx3.C13598b0;
import te3.C64311db1;
import z04.C112551y;

/* renamed from: dp1.u0 */
public final class C58412u0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedReportObject f167344d;

    /* renamed from: e */
    public final /* synthetic */ boolean f167345e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58412u0(FinderFeedReportObject finderFeedReportObject, boolean z) {
        super(0);
        this.f167344d = finderFeedReportObject;
        this.f167345e = z;
    }

    public Object invoke() {
        FinderPostStruct finderPostStruct = new FinderPostStruct();
        finderPostStruct.f155851d = finderPostStruct.mo86045b("SessionId", this.f167344d.sessionId, true);
        finderPostStruct.f155853e = this.f167344d.enterScene;
        finderPostStruct.f155855f = this.f167345e ? 3 : 2;
        finderPostStruct.f155857g = finderPostStruct.mo86045b("FeedID", "0", true);
        finderPostStruct.f155858g0 = finderPostStruct.mo86045b("draftId", C61926c.m72691p((long) this.f167344d.draftId), true);
        FinderFeedReportObject finderFeedReportObject = this.f167344d;
        finderPostStruct.f155860h0 = (long) finderFeedReportObject.draftType;
        finderPostStruct.f155859h = finderFeedReportObject.exitPageId;
        finderPostStruct.f155861i = finderFeedReportObject.enterTakePhotoTime;
        finderPostStruct.f155863j = finderFeedReportObject.enterVideoEditTime;
        finderPostStruct.f155865k = finderFeedReportObject.sendOrExitButtonTime;
        finderPostStruct.f155867l = finderFeedReportObject.videoRecordTime;
        finderPostStruct.f155869m = (long) finderFeedReportObject.videoSource;
        finderPostStruct.f155870n = (long) finderFeedReportObject.videoEmojiCount;
        finderPostStruct.f155871o = (long) finderFeedReportObject.videoWordingCount;
        String str = finderFeedReportObject.videoMusicId;
        if (str == null) {
            str = "";
        }
        finderPostStruct.f155872p = finderPostStruct.mo86045b("VideoMusicId", str, true);
        FinderFeedReportObject finderFeedReportObject2 = this.f167344d;
        finderPostStruct.f155873q = (long) finderFeedReportObject2.videoMusicIndex;
        finderPostStruct.f155874r = (long) finderFeedReportObject2.videoMusicSearch;
        finderPostStruct.f155875s = (long) finderFeedReportObject2.videoPostType;
        String str2 = finderFeedReportObject2.videoMediaInfo;
        if (str2 == null) {
            str2 = "";
        }
        finderPostStruct.f155876t = finderPostStruct.mo86045b("ExtInfo", str2, true);
        FinderFeedReportObject finderFeedReportObject3 = this.f167344d;
        finderPostStruct.f155877u = (long) finderFeedReportObject3.existDesc;
        finderPostStruct.f155878v = (long) finderFeedReportObject3.descCount;
        String str3 = finderFeedReportObject3.actionTrace;
        if (str3 == null) {
            str3 = "";
        }
        finderPostStruct.f155879w = finderPostStruct.mo86045b("Action", str3, true);
        FinderFeedReportObject finderFeedReportObject4 = this.f167344d;
        finderPostStruct.f155880x = (long) finderFeedReportObject4.lbsFlag;
        String str4 = finderFeedReportObject4.link;
        if (str4 == null) {
            str4 = "";
        }
        finderPostStruct.f155881y = finderPostStruct.mo86045b("Url", str4, true);
        finderPostStruct.f155882z = (long) this.f167344d.draft;
        finderPostStruct.f155822A = finderPostStruct.mo86045b("Tag", "", true);
        finderPostStruct.f155823B = finderPostStruct.mo86045b("TagId", "", true);
        finderPostStruct.f155824C = BuildInfo.DEBUG ? 0 : 2;
        FinderFeedReportObject finderFeedReportObject5 = this.f167344d;
        finderPostStruct.f155828G = finderFeedReportObject5.mentionCount;
        finderPostStruct.f155829H = (long) finderFeedReportObject5.clickMentionCount;
        finderPostStruct.f155830I = (long) finderFeedReportObject5.clickSucMentionCount;
        finderPostStruct.f155831J = (long) finderFeedReportObject5.mentionRepeatCount;
        C58408t0 t0Var = C58408t0.f167336a;
        JSONObject e = t0Var.mo83259e((JSONObject) null, "is_change_product_title", finderFeedReportObject5.is_change_product_title);
        int i = this.f167344d.recommend_lbs_position;
        if (i >= 0) {
            e = t0Var.mo83259e(e, "recommend_lbs_position", i);
        }
        String jSONObject = e.toString();
        C87412m.m108593f(jSONObject, "editInfoJson.toString()");
        boolean z = false;
        finderPostStruct.f155825D = finderPostStruct.mo86045b("EditInfo", C112551y.m153814n(jSONObject, ",", ";", false), true);
        finderPostStruct.f155852d0 = finderPostStruct.mo86045b("ForwardingAppId", this.f167344d.forwardingAppId, true);
        finderPostStruct.f155854e0 = finderPostStruct.mo86045b("ActivityID", this.f167344d.topicActivityId, true);
        FinderFeedReportObject finderFeedReportObject6 = this.f167344d;
        finderPostStruct.f155856f0 = (long) finderFeedReportObject6.topicActivityType;
        String jSONObject2 = t0Var.mo83259e(t0Var.mo83259e(t0Var.mo83259e(t0Var.mo83259e(t0Var.mo83259e((JSONObject) null, "IsMultiShot", finderFeedReportObject6.isMultiShot), "MultiShotChangeCnt", this.f167344d.multiShotChangeCnt), "MultiShotClickCnt", this.f167344d.multiShotClickCnt), "MultiShotSuccessCnt", this.f167344d.multiShotSuccessCnt), "MultiShotVideoCnt", this.f167344d.multiShotVideoCnt).toString();
        C87412m.m108593f(jSONObject2, "recordInfo.toString()");
        finderPostStruct.f155832K = finderPostStruct.mo86045b("RecordInfo", C112551y.m153814n(jSONObject2, ",", ";", false), true);
        FinderFeedReportObject finderFeedReportObject7 = this.f167344d;
        finderPostStruct.f155833L = (long) finderFeedReportObject7.videoSubType;
        finderPostStruct.f155834M = finderPostStruct.mo86045b("PostId", finderFeedReportObject7.postId, true);
        finderPostStruct.f155835N = finderPostStruct.mo86045b("EditId", this.f167344d.editId, true);
        finderPostStruct.f155840S = finderPostStruct.mo86045b("ClickId", this.f167344d.clickId, true);
        C64311db1 db12 = this.f167344d.selectLocation;
        if (db12 != null) {
            finderPostStruct.f155836O = finderPostStruct.mo86045b("LbsInfo", C58784w3.f168295a.mo83946l0(db12.f182663f, db12.f182664g), true);
        }
        FinderFeedReportObject finderFeedReportObject8 = this.f167344d;
        finderPostStruct.f155837P = (long) finderFeedReportObject8.remuxType;
        finderPostStruct.f155845X = (long) finderFeedReportObject8.musicType;
        finderPostStruct.f155847Z = finderPostStruct.mo86045b("FollowSoundTrackId", finderFeedReportObject8.followSoundTrackId, true);
        FinderFeedReportObject finderFeedReportObject9 = this.f167344d;
        finderPostStruct.f155846Y = (long) finderFeedReportObject9.soundTrackType;
        finderPostStruct.f155862i0 = finderPostStruct.mo86045b("MusicFeedid", finderFeedReportObject9.musicFeedId, true);
        String str5 = this.f167344d.tempateInfo;
        if (str5 == null || str5.length() == 0) {
            z = true;
        }
        if (!z) {
            finderPostStruct.f155848a0 = finderPostStruct.mo86045b("TemplateInfo", this.f167344d.tempateInfo, true);
        }
        t0Var.mo83256b(finderPostStruct);
        finderPostStruct.mo86054n();
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(finderPostStruct);
        if (this.f167345e) {
            String str6 = C58741j5.f168194k + "postdraft.info";
            if (C86013q1.m106450k(str6)) {
                C86013q1.m106447h(str6);
            }
            C86013q1.m106437S(str6, this.f167344d.toByteArray());
            Log.m105924i("Finder.FinderPostReportLogic", "saveDraftToFile " + str6);
        }
        return C13598b0.f38549a;
    }
}
