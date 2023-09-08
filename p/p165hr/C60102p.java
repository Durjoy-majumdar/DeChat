package p165hr;

import ak1.C54067f0;
import ak1.C54108o;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLiveEntranceLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import java.util.UUID;
import o40.C61926c;
import p185kq.C10383h;
import p565ir.C60604l;
import z04.C112551y;

@C86522b
/* renamed from: hr.p */
public final class C60102p extends C86301e implements C60604l {
    /* renamed from: R1 */
    public String mo84969R1(int i, int i2, int i3) {
        String uuid = UUID.randomUUID().toString();
        C87412m.m108593f(uuid, "randomUUID().toString()");
        String n = C112551y.m153814n(uuid, "-", "", false);
        return i + '-' + i2 + '-' + i3 + '-' + n;
    }

    /* renamed from: fk */
    public void mo84970fk(long j, long j2, long j3, String str, int i) {
        C87412m.m108594g(str, "anchorUsername");
        C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR;
        if (j != 1) {
            qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
            if (j != 2) {
                qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR;
                if (j != 3) {
                    qVar = C54067f0.C54078q.LIVE_AUDIENCE_CLICK_SINGLE_AVATAR;
                    if (j != 4) {
                        qVar = C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_CARD_AVATAR_LIVING;
                        if (j != 5) {
                            qVar = C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_CARD_AVATAR;
                            if (j != 6) {
                                qVar = C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM;
                                if (j != 7) {
                                    qVar = C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM_REAL;
                                    if (j != 8) {
                                        qVar = C54067f0.C54078q.LIVE_AUDIENCE_CLICK_AVATAR_LIVING;
                                        if (j != 9) {
                                            qVar = C54067f0.C54078q.LIVE_AUDIENCE_CLICK_LIVE_FEED_AVATAR_LIVING;
                                            if (j != 10) {
                                                qVar = C54067f0.C54078q.LIVE_AUDIENCE_CLICK_FEED_AVATAR_LIVING;
                                                if (j != 11) {
                                                    qVar = C54067f0.C54078q.CLICK_ENTER_LINKMIC_ANCHOR_PROFILE;
                                                    if (j != 23) {
                                                        qVar = C54067f0.C54078q.LIVE_EXPOSE_MORE_LIVE;
                                                        if (j != 12) {
                                                            qVar = C54067f0.C54078q.LIVE_CLICK_MORE_LIVE;
                                                            if (j != 13) {
                                                                throw new IllegalArgumentException("Unknown exploreType " + j);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Class cls = C10383h.class;
        Class cls2 = C54108o.class;
        long j4 = (long) i;
        ((C54108o) C86312j.m106911c(cls2)).Bx0(j4, "temp_6");
        ((C54108o) C86312j.m106911c(cls2)).getClass();
        C54108o.f151869h.mo74763m(qVar, "");
        FinderLiveEntranceLogStruct finderLiveEntranceLogStruct = new FinderLiveEntranceLogStruct();
        ((C54108o) C86312j.m106911c(cls2)).Cx0(finderLiveEntranceLogStruct, str);
        finderLiveEntranceLogStruct.mo76259w(C61926c.m72691p(j2));
        finderLiveEntranceLogStruct.f155516e = j3;
        finderLiveEntranceLogStruct.mo76260x(((C10383h) C86312j.m106911c(cls)).mo10700XQ(j3));
        finderLiveEntranceLogStruct.f155520i = qVar.f151625d;
        finderLiveEntranceLogStruct.mo76257u("temp_6");
        finderLiveEntranceLogStruct.f155522k = j4;
        finderLiveEntranceLogStruct.f155523l = 0;
        finderLiveEntranceLogStruct.f155524m = (long) 2;
        finderLiveEntranceLogStruct.mo76262z("");
        finderLiveEntranceLogStruct.mo76258v(((C10383h) C86312j.m106911c(cls)).mo10696E());
        finderLiveEntranceLogStruct.f155527p = -1;
        finderLiveEntranceLogStruct.f155534w = 0;
        finderLiveEntranceLogStruct.mo76256t(((C10383h) C86312j.m106911c(cls)).mo10698S0());
        finderLiveEntranceLogStruct.f155537z = finderLiveEntranceLogStruct.mo86045b("ClickSubTabContextId", "", true);
        finderLiveEntranceLogStruct.mo76255s("");
        finderLiveEntranceLogStruct.mo76261y("temp_6");
        finderLiveEntranceLogStruct.mo86054n();
        Log.m105924i("Finder.FinderChatRoomLiveReporter", "reportTipsBar action:" + finderLiveEntranceLogStruct.f155520i + ", feedId:" + finderLiveEntranceLogStruct.f155517f + ", liveId:" + finderLiveEntranceLogStruct.f155531t);
    }
}
