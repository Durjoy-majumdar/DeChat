package nk1;

import bd1.C54446b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import er1.C58739j4;
import f40.C86709a0;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import ky2.C10432i;
import o40.C61926c;
import o40.C61937h;
import te3.C49603gs0;
import te3.C49747hs1;
import te3.C49890is1;
import te3.C64373fs0;
import tf0.C64916p1;
import z04.C119027c;
import zc1.C66783a;
import zc1.C66785b;

/* renamed from: nk1.o */
public final class C61791o {

    /* renamed from: a */
    public static final C61791o f175673a = new C61791o();

    /* renamed from: a */
    public final LinkedList<C64373fs0> mo86719a() {
        LinkedList<C64373fs0> linkedList;
        Exception e;
        boolean z;
        LinkedList<C64373fs0> linkedList2 = new LinkedList<>();
        try {
            T t = null;
            String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_LIVE_ALIAS_LIST1_STRING_SYNC, (Object) null);
            C49603gs0 gs02 = new C49603gs0();
            if (str != null) {
                byte[] bytes = str.getBytes(C119027c.f356489b);
                C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                gs02.parseFrom(bytes);
            }
            linkedList = gs02.f134244d;
            C87412m.m108593f(linkedList, "safeAliasInfo.alias_info");
            try {
                C54446b c = C66783a.C66784a.m78800c(C66785b.f191882e, false, 1, (Object) null);
                if (c != null) {
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (((C64373fs0) next).f183215f == 3) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (z) {
                            t = next;
                            break;
                        }
                    }
                    C64373fs0 fs02 = (C64373fs0) t;
                    if (fs02 != null) {
                        fs02.f183213d = c.field_nickname;
                        fs02.f183214e = c.field_avatarUrl;
                    }
                }
                Log.m105924i("LiveUtil", "getAliasInfoList result:" + C61937h.m72709h(gs02));
                return linkedList;
            } catch (Exception e2) {
                e = e2;
                try {
                    C58739j4 j4Var = C58739j4.f168176a;
                    j4Var.mo83712h0(e, "getAliasInfoList:" + e.getMessage());
                } catch (Throwable unused) {
                }
                return linkedList;
            }
        } catch (Exception e3) {
            Exception exc = e3;
            linkedList = linkedList2;
            e = exc;
            C58739j4 j4Var2 = C58739j4.f168176a;
            j4Var2.mo83712h0(e, "getAliasInfoList:" + e.getMessage());
            return linkedList;
        } catch (Throwable unused2) {
            return linkedList2;
        }
    }

    /* renamed from: b */
    public final boolean mo86720b(long j) {
        boolean u = C61926c.m72696u((int) j, 2);
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        boolean D0 = ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76656D0();
        Log.m105924i("LiveUtil", "giftFuncEnableBySwitchFlag isTeenMode:" + e + " pagEnable:" + D0 + " enableGiftBySwitchFlag:" + u + " switchFlag:" + j);
        return u && D0 && !e;
    }

    /* renamed from: c */
    public final void mo86721c(C49890is1 is12, String str) {
        C87412m.m108594g(is12, "<this>");
        C87412m.m108594g(str, "TAG");
        LinkedList<C49747hs1> linkedList = is12.f135633d;
        if (linkedList != null) {
            for (C49747hs1 hs12 : linkedList) {
                if (hs12 != null) {
                    Log.m105924i(str, "GameRankSwitch appid:" + hs12.f134839d + ", name:" + hs12.f134840e + ", enable:" + hs12.f134841f);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo86722d(String str, int i) {
        C87412m.m108594g(str, "tag");
        Log.m105924i(str, "check AnchorStatus1, tag:" + str + ", status:" + i + ", BAN_COMMENT:" + C61926c.m72696u(i, 8) + ", SHOPPING:" + C61926c.m72696u(i, 16) + ", GIFT:" + C61926c.m72696u(i, 128) + ", BAN_LIKE:" + C61926c.m72696u(i, 512) + ", LINK_MIC:" + C61926c.m72696u(i, 64) + ", SING_SONG:" + C61926c.m72696u(i, 32768) + ", ");
        Log.m105924i(str, "check AnchorStatus2, tag:" + str + ", status:" + i + ", ENTER_BACKGROUND:" + C61926c.m72696u(i, 1) + ", CALL_INTERRUPTION:" + C61926c.m72696u(i, 2) + ", RECORD_SCREEN_ON:" + C61926c.m72696u(i, 4) + ", BREAK_LIVE_RULE:" + C61926c.m72696u(i, 32) + ", AUDIO_MODE:" + C61926c.m72696u(i, 256) + ", SCREEN_SHARE:" + C61926c.m72696u(i, 1024) + ", HIDE_AUDIENCE_NICKNAME:" + C61926c.m72696u(i, 8192) + ", DISABLE_SHOW_BIZ:" + C61926c.m72696u(i, 4096) + ", ");
    }
}
