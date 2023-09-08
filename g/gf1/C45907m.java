package gf1;

import com.tencent.p014mm.autogen.events.FinderSyncGotTabTipsEvent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C45770k;
import ft1.C59319a;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import ht1.C60152b4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import o40.C11348f;
import o40.C61926c;
import p599lr.C61381b;
import pe3.C89349b;
import rx3.C13604l;
import sx3.C36907w;
import te3.C49017cl0;
import te3.C49170dn1;
import te3.C49985jf1;
import te3.C50137kj1;
import te3.C50160kp1;
import te3.C50389me1;
import te3.C50401mh0;
import te3.C50411mj1;
import te3.C50609ny0;
import te3.C50752oy0;
import te3.C51546uh1;
import te3.C51553uj0;
import te3.C51837wi1;
import te3.C51978xi1;
import te3.C64373fs0;
import te3.C64586nn1;
import wp1.C15587j;

/* renamed from: gf1.m */
public final class C45907m implements C45770k {

    /* renamed from: d */
    public final C20832n f123880d = new C20832n();

    /* renamed from: i4 */
    public void mo3121i4(C50401mh0 mh02, int i, int i2) {
        C50401mh0 mh03 = mh02;
        int i3 = i;
        int i4 = i2;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(mh03, "cmdItem");
        int i5 = mh03.f138028d;
        Log.m105924i("Finder.SyncHandler", "cmdId=" + i5 + " selector=" + i3 + " scene=" + i4);
        byte[] bArr = null;
        switch (i5) {
            case 103:
                C61926c.m72657B("processGetFollower", true, new C45906k(mh03, this));
                break;
            case 104:
                C51837wi1 wi12 = new C51837wi1();
                C89349b bVar = mh03.f138029e;
                if (bVar != null) {
                    bArr = bVar.mo123703f();
                }
                wi12.parseFrom(bArr);
                Log.m105924i("Finder.SyncHandler", "redDotEvent get red dot, showRed:" + wi12.f144067d);
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77224E(wi12);
                break;
            case 105:
                C49017cl0 cl02 = new C49017cl0();
                C89349b bVar2 = mh03.f138029e;
                if (bVar2 != null) {
                    bArr = bVar2.mo123703f();
                }
                cl02.parseFrom(bArr);
                Log.m105924i("Finder.SyncHandler", "save svr_follow count " + cl02.f131806d);
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC, Integer.valueOf(cl02.f131806d));
                break;
            case 107:
                C61926c.m72657B("processSpamObj", true, new C8273l(mh03, this));
                break;
            case 108:
                C50160kp1 kp12 = new C50160kp1();
                C89349b bVar3 = mh03.f138029e;
                if (bVar3 != null) {
                    bArr = bVar3.mo123703f();
                }
                kp12.parseFrom(bArr);
                int i6 = kp12.f136957f + kp12.f136956e + kp12.f136961j + kp12.f136962n + kp12.f136963o;
                Log.m105924i("Finder.SyncHandler", "redDotEvent new wx count info, msg count:" + kp12.f136955d + ", comment:" + kp12.f136957f + ", like:" + kp12.f136956e + ", objectlike_like:" + kp12.f136961j + ", objectrecommend_like:" + kp12.f136962n + ", follow_accepted_count:" + kp12.f136963o + ", headUrl:" + kp12.f136959h + " totalCount=" + i6 + " mentionMentionedCount:" + kp12.f136966r);
                if (i6 > 0) {
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_FIND_MORE_UI_RED_DOT_BOOLEAN_SYNC, Boolean.TRUE);
                }
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, Integer.valueOf(kp12.f136957f));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, Integer.valueOf(kp12.f136956e));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, Integer.valueOf(kp12.f136961j));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, Integer.valueOf(kp12.f136962n));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC, Integer.valueOf(kp12.f136963o));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, Integer.valueOf(kp12.f136966r));
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_WX_MENTION_AVATAR_STRING_SYNC, kp12.f136959h);
                if (!((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77226G(kp12)) {
                    FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
                    int i7 = kp12.f136956e + kp12.f136961j + kp12.f136962n;
                    int i8 = kp12.f136957f + kp12.f136966r;
                    if (i7 <= 0 && i8 <= 0) {
                        Log.m105924i("Finder.RedDotManager", "[notifyWxMsgCount] server error.");
                        break;
                    } else {
                        C51978xi1 xi12 = new C51978xi1();
                        xi12.f144673h = String.valueOf(C31543z5.m39453c());
                        xi12.f144669d = 400000;
                        xi12.f144670e = 1;
                        if (i7 > 0) {
                            C64586nn1 nn12 = new C64586nn1();
                            nn12.f184502d = 2;
                            nn12.f184506h = 1;
                            nn12.f184507i = "WxMessageLike";
                            nn12.f184503e = i7;
                            xi12.f144672g.add(nn12);
                        }
                        if (i8 > 0) {
                            C64586nn1 nn13 = new C64586nn1();
                            nn13.f184502d = 2;
                            nn13.f184506h = 1;
                            nn13.f184507i = "WxMessageComment";
                            nn13.f184503e = i8;
                            xi12.f144672g.add(nn13);
                        }
                        C60152b4.C8759a.m8561a(Nx0, xi12, "notifyWxMsgCount", (HashSet) null, false, (C13604l) null, (C32226l) null, 0, false, 252, (Object) null);
                        break;
                    }
                }
                break;
            case 109:
                C50389me1 me12 = new C50389me1();
                C89349b bVar4 = mh03.f138029e;
                if (bVar4 != null) {
                    me12.parseFrom(bVar4.mo123703f());
                    Log.m105924i("Finder.SyncHandler", "processNotInterestedConfig config:" + me12.f137973d);
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_NOT_INTERESTED_CONFIG_STRING, Util.encodeHexString(me12.toByteArray()));
                    break;
                }
                break;
            case 112:
                C51546uh1 uh12 = new C51546uh1();
                C89349b bVar5 = mh03.f138029e;
                if (bVar5 != null) {
                    bArr = bVar5.mo123703f();
                }
                uh12.parseFrom(bArr);
                Log.m105924i("Finder.SyncHandler", "processPreFetch needPrefetch:" + uh12.f142852d + " needShowRedDot:" + uh12.f142853e);
                break;
            case 113:
                long currentTicks = Util.currentTicks();
                FinderSyncGotTabTipsEvent finderSyncGotTabTipsEvent = new FinderSyncGotTabTipsEvent();
                FinderSyncGotTabTipsEvent.C40101a aVar = finderSyncGotTabTipsEvent.f107535d;
                aVar.f107537a = mh03;
                aVar.f107538b = i4;
                finderSyncGotTabTipsEvent.publish();
                Log.m105924i("Finder.SyncHandler", "process tab red dot scene:" + i4 + " isHitExpt:" + finderSyncGotTabTipsEvent.f107536e.f107539a + " cost:" + Util.ticksToNow(currentTicks));
                if (!finderSyncGotTabTipsEvent.f107536e.f107539a) {
                    C49170dn1 dn12 = new C49170dn1();
                    C89349b bVar6 = mh03.f138029e;
                    if (bVar6 == null) {
                        C11348f.C11349a.m11178b(C59319a.f169618b, "FinderTabTips_Null", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
                        break;
                    } else {
                        dn12.parseFrom(bVar6.mo123703f());
                        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77225F(dn12, "processTabRedDot", (long) i4);
                        break;
                    }
                }
                break;
            case 114:
                try {
                    C50411mj1 mj12 = new C50411mj1();
                    C89349b bVar7 = mh03.f138029e;
                    if (bVar7 != null) {
                        bArr = bVar7.mo123703f();
                    }
                    mj12.parseFrom(bArr);
                    ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77240N(mj12);
                    break;
                } catch (Exception e) {
                    Log.printDebugStack("Finder.SyncHandler", "", e);
                    break;
                }
            case 116:
                try {
                    C49985jf1 jf12 = new C49985jf1();
                    C89349b bVar8 = mh03.f138029e;
                    if (bVar8 != null) {
                        bArr = bVar8.mo123703f();
                    }
                    jf12.parseFrom(bArr);
                    C15587j.f42215a.mo14354f(jf12, true, Boolean.TRUE);
                    break;
                } catch (Exception e2) {
                    Log.printDebugStack("Finder.SyncHandler", "", e2);
                    break;
                }
            case 117:
                try {
                    C50137kj1 kj12 = new C50137kj1();
                    C89349b bVar9 = mh03.f138029e;
                    if (bVar9 != null) {
                        bArr = bVar9.mo123703f();
                    }
                    kj12.parseFrom(bArr);
                    ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77238M(kj12);
                    break;
                } catch (Exception e3) {
                    Log.printDebugStack("Finder.SyncHandler", "", e3);
                    break;
                }
            case 118:
                C64373fs0 fs02 = new C64373fs0();
                C89349b bVar10 = mh03.f138029e;
                if (bVar10 != null) {
                    bArr = bVar10.mo123703f();
                }
                fs02.parseFrom(bArr);
                C58784w3.f168295a.mo83975w1(fs02, Boolean.TRUE, "FinderSyncHandler");
                break;
            case 119:
                try {
                    C51553uj0 uj02 = new C51553uj0();
                    C89349b bVar11 = mh03.f138029e;
                    if (bVar11 != null) {
                        uj02.parseFrom(bVar11.mo123703f());
                        ((C61381b) C86312j.m106911c(C61381b.class)).mo78551eX(uj02, "FinderSync");
                        break;
                    }
                } catch (Exception e4) {
                    Log.printInfoStack("Finder.SyncHandler", "", e4);
                    break;
                }
                break;
            case 120:
                C50609ny0 ny02 = new C50609ny0();
                C89349b bVar12 = mh03.f138029e;
                if (bVar12 != null) {
                    bArr = bVar12.mo123703f();
                }
                ny02.parseFrom(bArr);
                LinkedList<C50752oy0> linkedList = ny02.f138834d;
                C87412m.m108593f(linkedList, "liveRedDot.live_feature_reddot_infos");
                for (C50752oy0 oy02 : linkedList) {
                    C51978xi1 xi13 = oy02.f139443d;
                    if (xi13 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("sync reddot ");
                        sb.append(xi13.f144670e);
                        sb.append(", showInfos = ");
                        LinkedList<C64586nn1> linkedList2 = xi13.f144672g;
                        C87412m.m108593f(linkedList2, "ctrlInfo.show_infos");
                        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
                        for (C64586nn1 nn14 : linkedList2) {
                            arrayList.add(nn14.f184507i);
                        }
                        sb.append(arrayList);
                        sb.append(", group Id = ");
                        sb.append(xi13.f144683u);
                        Log.m105924i("Finder.SyncHandler", sb.toString());
                        C60152b4.C8759a.m8561a(((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0(), xi13, "FinderSync", (HashSet) null, true, (C13604l) null, (C32226l) null, 0, false, 244, (Object) null);
                    }
                }
                break;
        }
        this.f123880d.mo3121i4(mh03, i3, i4);
    }
}
