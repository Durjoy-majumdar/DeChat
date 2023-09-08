package hd1;

import bd1.C39758f;
import bd1.C39759i;
import bd1.C54447c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Result;
import kotlin.ResultKt;
import sf0.C48374j0;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: hd1.a */
public final class C46019a {
    /* renamed from: a */
    public boolean mo71439a(C39758f fVar) {
        Object obj;
        C87412m.m108594g(fVar, "publicInfoModify");
        try {
            Result.Companion companion = Result.Companion;
            if (fVar.mo62397b().f140463d == null) {
                Object f = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_INIT_KEYBUF2_STRING_SYNC, "");
                C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
                fVar.mo62397b().f140463d = C48374j0.m53712a(Util.decodeHexString((String) f));
            }
            String str = fVar.f131580d;
            boolean z = true;
            if (str == null || str.length() == 0) {
                C66785b bVar = C66785b.f191882e;
                fVar.f131580d = bVar.mo90662O5();
                Log.m105924i("Finder.AccountsUpgradeHandler", "[onUpgrade] cover master_finder_username=" + bVar.mo90662O5());
            }
            C66785b bVar2 = C66785b.f191882e;
            C54447c cVar = new C54447c(bVar2.mo90662O5());
            String str2 = cVar.field_finder_version_username_history;
            if (str2 != null) {
                if (str2.length() != 0) {
                    z = false;
                }
            }
            if (z) {
                String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_FINDER_FINDER_USERNAME_LIST_STRING_SYNC, "");
                C87412m.m108593f(I, "storage().configStg.getS…AME_LIST_STRING_SYNC, \"\")");
                cVar.field_finder_version_username_history = C112551y.m153814n(I, ",", ";", false);
                Log.m105924i("Finder.AccountsUpgradeHandler", "[onUpgrade] cover field_finder_version_username_history=" + cVar.field_finder_version_username_history);
            }
            if (cVar.field_messageLikeBuf == null) {
                Object f2 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_LIKE_MSG_LAST_BUF_STRING_SYNC, "");
                C87412m.m108592e(f2, "null cannot be cast to non-null type kotlin.String");
                cVar.field_messageLikeBuf = (String) f2;
            }
            if (cVar.field_messageFollowBuf == null) {
                Object f3 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_FOLLOW_MSG_LAST_BUF_STRING_SYNC, "");
                C87412m.m108592e(f3, "null cannot be cast to non-null type kotlin.String");
                cVar.field_messageFollowBuf = (String) f3;
            }
            if (cVar.field_messageCommentBuf == null) {
                Object f4 = C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_FINDER_GET_FINDER_IDENTITY_COMMENT_MSG_LAST_BUF_STRING_SYNC, "");
                C87412m.m108592e(f4, "null cannot be cast to non-null type kotlin.String");
                cVar.field_messageCommentBuf = (String) f4;
            }
            obj = Result.m168114constructorimpl(Boolean.valueOf(bVar2.mo90672m1(cVar, C39759i.UPGRADE)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m168114constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m168121isSuccessimpl(obj);
    }
}
