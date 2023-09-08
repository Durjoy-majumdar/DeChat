package com.tencent.p014mm.plugin.p081mv.p082ui.uic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderCommentReportEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.MvLikeReportStruct;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import hb2.C59822f;
import hb2.C59833q;
import kotlin.Metadata;
import nb2.C61646d;
import o40.C61926c;
import p640ox.C77049b;
import sb2.C63756e;
import sx3.C110818d0;
import te3.C64488kb1;
import te3.C64793w23;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/mv/ui/uic/MusicMvMainUIC$finderCommentEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FinderCommentReportEvent;", "plugin-mv_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC$finderCommentEventListener$1 */
public final class MusicMvMainUIC$finderCommentEventListener$1 extends IListener<FinderCommentReportEvent> {

    /* renamed from: d */
    public final /* synthetic */ AppCompatActivity f163328d;

    /* renamed from: e */
    public final /* synthetic */ MusicMvMainUIC f163329e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMvMainUIC$finderCommentEventListener$1(AppCompatActivity appCompatActivity, MusicMvMainUIC musicMvMainUIC, C40008f fVar) {
        super(fVar);
        this.f163328d = appCompatActivity;
        this.f163329e = musicMvMainUIC;
    }

    public boolean callback(IEvent iEvent) {
        String str;
        FinderContact finderContact;
        FinderCommentReportEvent finderCommentReportEvent = (FinderCommentReportEvent) iEvent;
        C87412m.m108594g(finderCommentReportEvent, "event");
        AppCompatActivity appCompatActivity = this.f163328d;
        MusicMvMainUIC musicMvMainUIC = this.f163329e;
        C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C63756e.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…sicMvDataUIC::class.java)");
        C63756e eVar = (C63756e) a;
        C61646d dVar = (C61646d) C110818d0.m150917O(musicMvMainUIC.f163270g, musicMvMainUIC.f163275o);
        if (dVar != null) {
            FinderCommentReportEvent.C55121a aVar = finderCommentReportEvent.f154760d;
            int i = aVar.f154761a;
            int i2 = 4;
            int i3 = 2;
            if (i == 2 || i == 3) {
                if (2 == i) {
                    i2 = 3;
                }
                C59833q qVar = C59833q.f170832a;
                C64488kb1 kb12 = eVar.f180744i;
                C59822f fVar = dVar.f175298d;
                long j = aVar.f154762b;
                qVar.getClass();
                C87412m.m108594g(kb12, "songInfo");
                C87412m.m108594g(fVar, "musicMv");
                Log.m105924i("MicroMsg.Mv.MvReportLogic", "reportCommentLike, action:" + i2);
                C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(appCompatActivity, 7, C64793w23.class);
                MvLikeReportStruct mvLikeReportStruct = new MvLikeReportStruct();
                if (w232 != null) {
                    mvLikeReportStruct.f156646d = mvLikeReportStruct.mo86045b("ContextId", w232.f186034e, true);
                    mvLikeReportStruct.f156656n = qVar.mo84792c(appCompatActivity);
                    mvLikeReportStruct.f156657o = qVar.mo84790a(fVar) / ((long) 1000);
                }
                String str2 = kb12.f183904d;
                String str3 = null;
                mvLikeReportStruct.f156647e = mvLikeReportStruct.mo86045b("SongName", str2 != null ? C112551y.m153814n(str2, ",", " ", false) : null, true);
                String str4 = kb12.f183909i;
                mvLikeReportStruct.f156648f = mvLikeReportStruct.mo86045b("SongId", str4 != null ? C112551y.m153814n(str4, ",", " ", false) : null, true);
                mvLikeReportStruct.f156649g = mvLikeReportStruct.mo86045b("WebUrl", kb12.f183908h, true);
                mvLikeReportStruct.f156650h = mvLikeReportStruct.mo86045b("DataUrl", kb12.f183906f, true);
                String str5 = kb12.f183905e;
                if (str5 != null) {
                    str3 = C112551y.m153814n(str5, ",", " ", false);
                }
                mvLikeReportStruct.f156661s = mvLikeReportStruct.mo86045b("Singer", str3, true);
                mvLikeReportStruct.f156655m = ((long) kb12.f183918u) / ((long) 1000);
                Long l = fVar.f170755c;
                mvLikeReportStruct.f156652j = mvLikeReportStruct.mo86045b("MvObjectId", C61926c.m72691p(l != null ? l.longValue() : 0), true);
                mvLikeReportStruct.f156653k = mvLikeReportStruct.mo86045b("MvNonceId", fVar.f170756d, true);
                FinderObject d = C59822f.f170752A.mo84779d(fVar);
                if (d == null || (finderContact = d.contact) == null || (str = finderContact.username) == null) {
                    str = "";
                }
                mvLikeReportStruct.f156654l = mvLikeReportStruct.mo86045b("MvUserId", str, true);
                mvLikeReportStruct.f156651i = (long) i2;
                mvLikeReportStruct.f156658p = mvLikeReportStruct.mo86045b("CommentId", String.valueOf(j), true);
                mvLikeReportStruct.mo86054n();
                mvLikeReportStruct.mo86056r();
            } else {
                if (i != 1) {
                    i3 = i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3;
                }
                C59833q.f170832a.mo84793d(appCompatActivity, eVar.f180744i, dVar.f175298d, i3, aVar.f154762b);
            }
        }
        return false;
    }
}
