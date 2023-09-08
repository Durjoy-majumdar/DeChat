package p465cl;

import android.util.Base64;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import i61.C98602h;
import javax.crypto.BadPaddingException;
import p384tk.C101897a;
import p823sg.C90191a;
import p833zk.C103045g;
import p833zk.C103048i;
import v51.C102148e;
import z04.C112551y;
import z51.C39315g;
import zc3.C39343a;

/* renamed from: cl.d */
public final class C92426d {

    /* renamed from: a */
    public static final C92426d f264475a = new C92426d();

    /* renamed from: a */
    public final boolean mo126427a(EmojiInfo emojiInfo) {
        int i;
        boolean z;
        EmojiInfo emojiInfo2 = emojiInfo;
        C87412m.m108594g(emojiInfo2, "emojiInfo");
        C92424b bVar = new C92424b();
        String md5 = emojiInfo.getMd5();
        String str = emojiInfo.mo62640K1() + "_temp";
        if (C103048i.m136280b(emojiInfo)) {
            md5 = emojiInfo2.field_externMd5;
            z = true;
            i = 2;
        } else if (C103048i.m136279a(emojiInfo)) {
            z = true;
            i = 1;
        } else {
            if (!Util.isNullOrNil(emojiInfo2.field_tpurl) && !Util.isNullOrNil(emojiInfo2.field_aeskey)) {
                z = true;
                i = 3;
            } else {
                z = false;
                i = 0;
            }
        }
        String str2 = md5 == null ? "" : md5;
        String str3 = emojiInfo2.field_aeskey;
        String str4 = str3 == null ? "" : str3;
        String K1 = emojiInfo.mo62640K1();
        C92425c cVar = new C92425c(emojiInfo, str2, z, str4, K1 == null ? "" : K1, str, i);
        if (cVar.f264470c) {
            try {
                byte[] a = C90191a.m112871a(C86013q1.m106433O(cVar.f264473f, 0, -1), Base64.encodeToString(Util.decodeHexString(cVar.f264471d), 0));
                boolean z2 = a != null && C86013q1.m106438T(cVar.f264472e, a, 0, a.length) == 0;
                C86013q1.m106447h(cVar.f264473f);
                if (!z2) {
                    Log.m105928w("MicroMsg.EmojiLoader.EmojiFileVerify", "decrypt failed : " + cVar.f264471d);
                    bVar.mo126423a(cVar, false);
                    return false;
                }
                bVar.mo126423a(cVar, true);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.EmojiLoader.EmojiFileVerify", e, "decrypt exception : " + cVar.f264471d, new Object[0]);
                bVar.mo126423a(cVar, false);
                if (!(e instanceof BadPaddingException)) {
                    return false;
                }
                Log.m105924i("MicroMsg.EmojiLoader.EmojiFileVerify", "checkFixAesKey: " + cVar.f264471d);
                EmojiInfo emojiInfo3 = cVar.f264468a;
                if (Util.isNullOrNil(emojiInfo3.field_tpurl)) {
                    return false;
                }
                emojiInfo3.field_externUrl = "";
                emojiInfo3.field_encrypturl = "";
                emojiInfo3.field_cdnUrl = "";
                emojiInfo3.field_tpurl = "";
                emojiInfo3.field_aeskey = "";
                new C103045g(emojiInfo3, C28605a.f78497d);
                return false;
            }
        } else {
            C86013q1.m106463x(cVar.f264473f, cVar.f264472e);
        }
        String q = C86013q1.m106456q(cVar.f264472e);
        Log.m105924i("MicroMsg.EmojiLoader.EmojiFileVerify", "file md5 " + q + ", " + cVar.f264469b);
        boolean z3 = !Util.isNullOrNil(q) && C112551y.m153809i(q, cVar.f264469b, true);
        EmojiInfo emojiInfo4 = cVar.f264468a;
        if (z3) {
            int i2 = cVar.f264474g;
            if (i2 == 0) {
                C102148e.m134581b(emojiInfo4.getMd5(), 4, 0, 0, emojiInfo4.field_groupId, 0, emojiInfo4.field_designerID);
                C102148e.m134580a(4, 1);
            } else if (i2 == 1) {
                C102148e.m134581b(emojiInfo4.getMd5(), 2, 0, 0, emojiInfo4.field_groupId, 0, emojiInfo4.field_designerID);
                C102148e.m134580a(4, 1);
            } else if (i2 == 2) {
                C102148e.m134581b(emojiInfo4.getMd5(), 4, 0, 0, emojiInfo4.field_groupId, 1, emojiInfo4.field_designerID);
                C102148e.m134580a(13, 1);
            } else if (i2 == 3) {
                C102148e.m134580a(26, 1);
            }
        } else {
            int i3 = cVar.f264474g;
            if (i3 == 0) {
                C102148e.m134581b(emojiInfo4.getMd5(), 4, 1, 1, emojiInfo4.field_groupId, 1, emojiInfo4.field_designerID);
                C102148e.m134580a(5, 1);
            } else if (i3 == 1) {
                C102148e.m134581b(emojiInfo4.getMd5(), 2, 1, 1, emojiInfo4.field_groupId, 1, emojiInfo4.field_designerID);
                C102148e.m134580a(5, 1);
            } else if (i3 == 2) {
                C102148e.m134581b(emojiInfo4.getMd5(), 4, 1, 1, emojiInfo4.field_groupId, 1, emojiInfo4.field_designerID);
                C102148e.m134580a(14, 1);
            } else if (i3 == 3) {
                C102148e.m134580a(27, 1);
            }
        }
        if (!z3 || !C86709a0.m107523b().mo121114l()) {
            return false;
        }
        C39343a cm = ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm();
        EmojiInfo emojiInfo5 = cVar.f264468a;
        ((C98602h) cm).getClass();
        C101897a.m134075e().mo141394c(emojiInfo5, true);
        return true;
    }
}
