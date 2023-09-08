package fe1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import sx3.C110818d0;
import te3.C49182dr0;
import te3.C50266li0;
import te3.C50955qg0;
import te3.C51103rg0;
import te3.C51691vg0;
import te3.C64284cg;

/* renamed from: fe1.c */
public final class C58960c {
    /* renamed from: a */
    public static final C64284cg m68829a(FinderContact finderContact, boolean z) {
        LinkedList<C50955qg0> linkedList;
        T t;
        C51691vg0 vg02;
        LinkedList<C64284cg> linkedList2;
        boolean z2;
        LinkedList<C50955qg0> linkedList3;
        T t2;
        C51691vg0 vg03;
        LinkedList<C64284cg> linkedList4;
        boolean z3;
        C87412m.m108594g(finderContact, "<this>");
        if (z) {
            int i = finderContact.user_mode;
            if (!(i == 2 || i == 1)) {
                finderContact = null;
            }
            if (finderContact == null || (linkedList3 = finderContact.bind_info) == null) {
                return null;
            }
            Iterator<T> it = linkedList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (((C50955qg0) t2).f140290d == 1) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            C50955qg0 qg02 = (C50955qg0) t2;
            if (qg02 == null || (vg03 = qg02.f140291e) == null || (linkedList4 = vg03.f143474d) == null) {
                return null;
            }
            return (C64284cg) C110818d0.m150916N(linkedList4);
        }
        int i2 = finderContact.one_time_flag;
        if ((i2 & 2) > 0 || (i2 & 4) <= 0 || (linkedList = finderContact.bind_info) == null) {
            return null;
        }
        Iterator<T> it4 = linkedList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                t = null;
                break;
            }
            t = it4.next();
            if (((C50955qg0) t).f140290d == 1) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C50955qg0 qg03 = (C50955qg0) t;
        if (qg03 == null || (vg02 = qg03.f140291e) == null || (linkedList2 = vg02.f143474d) == null) {
            return null;
        }
        return (C64284cg) C110818d0.m150916N(linkedList2);
    }

    /* renamed from: b */
    public static final C64284cg m68830b(C58969q qVar, boolean z) {
        C51103rg0 rg02;
        LinkedList<C50955qg0> linkedList;
        T t;
        C51691vg0 vg02;
        LinkedList<C64284cg> linkedList2;
        boolean z2;
        C51103rg0 rg03;
        LinkedList<C50955qg0> linkedList3;
        T t2;
        C51691vg0 vg03;
        LinkedList<C64284cg> linkedList4;
        boolean z3;
        C87412m.m108594g(qVar, "<this>");
        if (z) {
            int i = qVar.field_user_mode;
            if (!(i == 2 || i == 1)) {
                qVar = null;
            }
            if (qVar == null || (rg03 = qVar.field_bindInfoList) == null || (linkedList3 = rg03.f140887d) == null) {
                return null;
            }
            Iterator<T> it = linkedList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (((C50955qg0) t2).f140290d == 1) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            C50955qg0 qg02 = (C50955qg0) t2;
            if (qg02 == null || (vg03 = qg02.f140291e) == null || (linkedList4 = vg03.f143474d) == null) {
                return null;
            }
            return (C64284cg) C110818d0.m150916N(linkedList4);
        }
        int i2 = qVar.f168735X1;
        if ((i2 & 2) > 0 || (i2 & 4) <= 0 || (rg02 = qVar.field_bindInfoList) == null || (linkedList = rg02.f140887d) == null) {
            return null;
        }
        Iterator<T> it4 = linkedList.iterator();
        while (true) {
            if (!it4.hasNext()) {
                t = null;
                break;
            }
            t = it4.next();
            if (((C50955qg0) t).f140290d == 1) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        C50955qg0 qg03 = (C50955qg0) t;
        if (qg03 == null || (vg02 = qg03.f140291e) == null || (linkedList2 = vg02.f143474d) == null) {
            return null;
        }
        return (C64284cg) C110818d0.m150916N(linkedList2);
    }

    /* renamed from: c */
    public static /* synthetic */ C64284cg m68831c(C58969q qVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m68830b(qVar, z);
    }

    /* renamed from: d */
    public static final C58969q m68832d(C58969q qVar) {
        C87412m.m108594g(qVar, "<this>");
        C58969q b = C58961d.f168673a.mo84155b(qVar.getUsername());
        qVar.field_retryCount = b != null ? b.field_retryCount : 0;
        return qVar;
    }

    /* renamed from: e */
    public static final C58969q m68833e(FinderContact finderContact, C58969q qVar, boolean z) {
        String str;
        String str2;
        C87412m.m108594g(finderContact, "<this>");
        C64284cg cgVar = null;
        if (!(!Util.isNullOrNil(finderContact.username))) {
            finderContact = null;
        }
        if (finderContact != null) {
            if (qVar == null) {
                qVar = new C58969q();
            }
            String str3 = finderContact.username;
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            qVar.field_username = str3;
            int i = 0;
            if (!z) {
                cgVar = m68829a(finderContact, false);
            }
            if (cgVar == null || (str = cgVar.f182470f) == null) {
                str = finderContact.headUrl;
            }
            if (str == null) {
                str = str4;
            }
            qVar.field_avatarUrl = str;
            if (cgVar == null || (str2 = cgVar.f182469e) == null) {
                str2 = finderContact.nickname;
            }
            if (str2 == null) {
                str2 = str4;
            }
            qVar.field_nickname = str2;
            String str5 = finderContact.headUrl;
            if (str5 == null) {
                str5 = str4;
            }
            qVar.field_rawAvatarUrl = str5;
            String str6 = finderContact.nickname;
            if (str6 == null) {
                str6 = str4;
            }
            qVar.field_rawNickname = str6;
            qVar.field_version = finderContact.seq;
            String str7 = finderContact.signature;
            if (str7 == null) {
                str7 = str4;
            }
            qVar.field_signature = str7;
            qVar.field_follow_Flag = finderContact.followFlag;
            qVar.field_followTime = finderContact.followTime;
            String str8 = finderContact.coverImgUrl;
            if (str8 == null) {
                str8 = str4;
            }
            qVar.field_coverImg = str8;
            qVar.field_spamStatus = finderContact.spamStatus;
            qVar.field_authInfo = finderContact.authInfo;
            qVar.field_extInfo = finderContact.extInfo;
            qVar.field_originalFlag = finderContact.originalFlag;
            qVar.field_originalEntranceFlag = finderContact.originalEntranceFlag;
            qVar.field_originalInfo = finderContact.originalInfo;
            qVar.field_extFlag = finderContact.extFlag;
            qVar.field_liveCoverImg = finderContact.liveCoverImgUrl;
            qVar.field_liveStatus = finderContact.liveStatus;
            C50266li0 li02 = finderContact.live_info;
            qVar.field_liveAnchorStatusFlag = li02 != null ? li02.f137430d : 0;
            qVar.field_friendFollowCount = finderContact.friend_follow_count;
            if (li02 != null) {
                i = li02.f137431e;
            }
            qVar.field_liveSwitchFlag = (long) i;
            String str9 = finderContact.wx_username_v5;
            if (str9 != null) {
                str4 = str9;
            }
            qVar.field_v5username = str4;
            qVar.field_feedCount = finderContact.feedCount;
            qVar.field_user_mode = finderContact.user_mode;
            C51103rg0 rg02 = new C51103rg0();
            rg02.f140887d = finderContact.bind_info;
            qVar.field_bindInfoList = rg02;
            qVar.field_guestInfo = finderContact.guest_info;
            qVar.field_coverUrl = finderContact.coverUrl;
            qVar.field_coverEntranceFlag = finderContact.coverEntranceFlag;
            C49182dr0 dr02 = new C49182dr0();
            dr02.f132483d = finderContact.menu;
            qVar.field_jumpInfoList = dr02;
            qVar.f168735X1 = finderContact.one_time_flag;
            qVar.field_messageStatus = finderContact.status;
            qVar.field_additionalFlag = finderContact.additionalFlag;
            qVar.field_liveRoomImg = finderContact.live_room_img;
            return qVar;
        }
        Log.m105920e("Finder.FinderContactEx", "error FinderContact username is null " + Util.getStack());
        return new C58969q();
    }

    /* renamed from: f */
    public static /* synthetic */ C58969q m68834f(FinderContact finderContact, C58969q qVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            qVar = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return m68833e(finderContact, qVar, z);
    }

    /* renamed from: g */
    public static final FinderContact m68835g(C58969q qVar) {
        C87412m.m108594g(qVar, "<this>");
        FinderContact finderContact = new FinderContact();
        finderContact.username = qVar.getUsername();
        finderContact.headUrl = qVar.mo84172g0();
        finderContact.nickname = qVar.mo84196w1();
        finderContact.seq = qVar.field_version;
        finderContact.signature = qVar.field_signature;
        finderContact.followFlag = qVar.field_follow_Flag;
        finderContact.followTime = qVar.field_followTime;
        String str = qVar.field_coverImg;
        finderContact.authInfo = qVar.field_authInfo;
        finderContact.coverImgUrl = str;
        finderContact.spamStatus = qVar.field_spamStatus;
        finderContact.extInfo = qVar.field_extInfo;
        finderContact.originalFlag = qVar.field_originalFlag;
        finderContact.originalEntranceFlag = qVar.field_originalEntranceFlag;
        finderContact.originalInfo = qVar.field_originalInfo;
        finderContact.extFlag = qVar.field_extFlag;
        finderContact.liveCoverImgUrl = qVar.field_liveCoverImg;
        finderContact.liveStatus = qVar.field_liveStatus;
        C50266li0 li02 = new C50266li0();
        li02.f137430d = qVar.field_liveAnchorStatusFlag;
        li02.f137431e = (int) qVar.field_liveSwitchFlag;
        finderContact.live_info = li02;
        finderContact.friend_follow_count = qVar.field_friendFollowCount;
        String str2 = qVar.field_v5username;
        if (str2 == null) {
            str2 = "";
        }
        finderContact.wx_username_v5 = str2;
        finderContact.user_mode = qVar.field_user_mode;
        C51103rg0 rg02 = qVar.field_bindInfoList;
        LinkedList<FinderJumpInfo> linkedList = null;
        finderContact.bind_info = rg02 != null ? rg02.f140887d : null;
        finderContact.guest_info = qVar.field_guestInfo;
        finderContact.coverUrl = qVar.field_coverUrl;
        finderContact.coverEntranceFlag = qVar.field_coverEntranceFlag;
        C49182dr0 dr02 = qVar.field_jumpInfoList;
        if (dr02 != null) {
            linkedList = dr02.f132483d;
        }
        finderContact.menu = linkedList;
        finderContact.status = qVar.field_messageStatus;
        finderContact.additionalFlag = qVar.field_additionalFlag;
        return finderContact;
    }
}
