package bd1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C49849ii0;

/* renamed from: bd1.d */
public final class C54448d {
    /* renamed from: a */
    public static final C54447c m61169a(FinderContact finderContact) {
        C87412m.m108594g(finderContact, "<this>");
        String str = finderContact.username;
        if (str == null) {
            str = "";
        }
        C54447c cVar = new C54447c(str);
        cVar.field_username = finderContact.username;
        cVar.field_nickname = finderContact.nickname;
        cVar.field_signature = finderContact.signature;
        cVar.field_avatarUrl = finderContact.headUrl;
        cVar.field_coverUrl = finderContact.coverUrl;
        cVar.field_liveCoverImgUrl = finderContact.liveCoverImgUrl;
        C49849ii0 ii02 = finderContact.extInfo;
        cVar.field_sex = ii02 != null ? ii02.f135356g : 0;
        cVar.field_seq = finderContact.seq;
        cVar.field_extFlag = finderContact.extFlag;
        cVar.field_contact_user_flag = finderContact.user_flag;
        cVar.field_spamStatus = finderContact.spamStatus;
        cVar.field_authInfo = finderContact.authInfo;
        String str2 = null;
        cVar.field_country = ii02 != null ? ii02.f135353d : null;
        cVar.field_province = ii02 != null ? ii02.f135354e : null;
        if (ii02 != null) {
            str2 = ii02.f135355f;
        }
        cVar.field_city = str2;
        cVar.field_liveInfo = finderContact.live_info;
        cVar.field_originalInfo = finderContact.originalInfo;
        Log.m105924i("FinderAccount", "[toFinderAccount] " + finderContact);
        return cVar;
    }
}
