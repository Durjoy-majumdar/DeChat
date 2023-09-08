package com.tencent.p014mm.plugin.finder.extension.reddot;

import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import h81.C32735h;
import lc3.C10485b;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.extension.reddot.t0 */
public final class C29945t0 {

    /* renamed from: a */
    public static final C29945t0 f81101a = new C29945t0();

    /* renamed from: a */
    public final long mo57008a() {
        Class cls = C10485b.class;
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC, 0);
        if (j == 1) {
            return (((long) ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("FinderNewFeedTipsFastEnterFirstTimeInterval", 86400)) * 1000) / ((long) mo57019l());
        }
        if (j == 2) {
            return (((long) ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("FinderNewFeedTipsFastEnterSecondTimeInterval", 172800)) * 1000) / ((long) mo57019l());
        }
        if (j != 3) {
            return 0;
        }
        return (((long) ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("FinderNewFeedTipsFastEnterThirdTimeInterval", 604800)) * 1000) / ((long) mo57019l());
    }

    /* renamed from: b */
    public final long mo57009b() {
        return ((((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_live_square_red_dot_interval, 7200)) * 1000) / ((long) mo57019l())) + mo57008a();
    }

    /* renamed from: c */
    public final long mo57010c() {
        return ((((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_more_tab_follow_entrance_red_dot_interval, 7200)) * 1000) / ((long) mo57019l())) + mo57008a();
    }

    /* renamed from: d */
    public final long mo57011d() {
        return ((((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_more_tab_follow_tab_red_dot_interval, 0)) * 1000) / ((long) mo57019l())) + mo57008a();
    }

    /* renamed from: e */
    public final long mo57012e() {
        return ((((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_more_tab_friend_tab_red_dot_interval, 7200)) * 1000) / ((long) mo57019l())) + mo57008a();
    }

    /* renamed from: f */
    public final long mo57013f() {
        return ((((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_more_tab_friend_post_tab_red_dot_interval, 7200)) * 1000) / ((long) mo57019l())) + mo57008a();
    }

    /* renamed from: g */
    public final long mo57014g() {
        return ((((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_more_tab_hot_tab_red_dot_interval, 7200)) * 1000) / ((long) mo57019l())) + mo57008a();
    }

    /* renamed from: h */
    public final long mo57015h() {
        return ((((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_more_tab_live_tab_red_dot_interval, 7200)) * 1000) / ((long) mo57019l())) + mo57008a();
    }

    /* renamed from: i */
    public final long mo57016i() {
        return ((((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_more_tab_nearby_red_dot_interval, 7200)) * 1000) / ((long) mo57019l())) + mo57008a();
    }

    /* renamed from: j */
    public final long mo57017j() {
        return ((((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_more_tab_news_tab_red_dot_interval, 7200)) * 1000) / ((long) mo57019l())) + mo57008a();
    }

    /* renamed from: k */
    public final long mo57018k() {
        return ((((long) ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_new_msg_tips_enter_interval, 7200)) * 1000) / ((long) mo57019l())) + mo57008a();
    }

    /* renamed from: l */
    public final int mo57019l() {
        C37521f.f99374d.getClass();
        return C37521f.f99280S1.mo60266n().intValue();
    }
}
