package tf1;

import gy3.C8480h;

/* renamed from: tf1.i */
public enum C13908i {
    FEED_DEFAULT(-1),
    FEED_TIMELINE_ALL(0),
    FEED_TIMELINE_FRIEND(1),
    FEED_TIMELINE_LBS(2),
    FEED_NEARBY_LIVE(1001),
    FEED_TIMELINE_FOLLOW(3),
    FEED_TIMELINE_MACHINE(4),
    FEED_PROFILE(100),
    FEED_PROFILE_TIMELINE(101),
    FEED_LIKED_TIMELINE(102),
    FEED_RETRANSMIT_SOURCE(103),
    FEED_TOPIC_TIMELINE(104),
    FEED_FAV_LIST(105),
    FEED_FOLDED_LIST(106),
    FEED_FRIEND_LIKE_LIST(107),
    SELF_FEED_PROFILE(108),
    SELF_FEED_FULL_PROFILE(109),
    SELF_FEED_AT_MANAGER(200),
    FEED_REL_RECOMMEND(17),
    FEED_AT_TIMELINE(18);
    

    /* renamed from: e */
    public static final C13909a f39090e = null;

    /* renamed from: d */
    public final int f39109d;

    /* renamed from: tf1.i$a */
    public static final class C13909a {
        public C13909a(C8480h hVar) {
        }

        /* renamed from: a */
        public final C13908i mo13382a(int i) {
            C13908i iVar = C13908i.FEED_TIMELINE_ALL;
            if (i == 0) {
                return iVar;
            }
            C13908i iVar2 = C13908i.FEED_TIMELINE_MACHINE;
            if (i == 4) {
                return iVar2;
            }
            C13908i iVar3 = C13908i.FEED_TIMELINE_LBS;
            if (i == 2) {
                return iVar3;
            }
            C13908i iVar4 = C13908i.FEED_TIMELINE_FOLLOW;
            if (i == 3) {
                return iVar4;
            }
            C13908i iVar5 = C13908i.FEED_TIMELINE_FRIEND;
            if (i == 1) {
                return iVar5;
            }
            C13908i iVar6 = C13908i.FEED_NEARBY_LIVE;
            if (i == 1001) {
                return iVar6;
            }
            C13908i iVar7 = C13908i.FEED_PROFILE;
            if (i == 100) {
                return iVar7;
            }
            C13908i iVar8 = C13908i.FEED_PROFILE_TIMELINE;
            if (i == 101) {
                return iVar8;
            }
            C13908i iVar9 = C13908i.FEED_LIKED_TIMELINE;
            if (i == 102) {
                return iVar9;
            }
            C13908i iVar10 = C13908i.FEED_RETRANSMIT_SOURCE;
            if (i == 103) {
                return iVar10;
            }
            C13908i iVar11 = C13908i.FEED_TOPIC_TIMELINE;
            if (i == 104) {
                return iVar11;
            }
            C13908i iVar12 = C13908i.FEED_FAV_LIST;
            if (i == 105) {
                return iVar12;
            }
            C13908i iVar13 = C13908i.FEED_FOLDED_LIST;
            if (i == 106) {
                return iVar13;
            }
            C13908i iVar14 = C13908i.FEED_FRIEND_LIKE_LIST;
            if (i == 107) {
                return iVar14;
            }
            C13908i iVar15 = C13908i.FEED_REL_RECOMMEND;
            if (i == 17) {
                return iVar15;
            }
            return i == 18 ? C13908i.FEED_AT_TIMELINE : C13908i.FEED_DEFAULT;
        }
    }

    /* access modifiers changed from: public */
    static {
        f39090e = new C13909a((C8480h) null);
    }

    /* access modifiers changed from: public */
    C13908i(int i) {
        this.f39109d = i;
    }
}
