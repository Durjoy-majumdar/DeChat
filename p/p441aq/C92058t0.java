package p441aq;

import android.graphics.drawable.Drawable;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import di3.C86301e;
import ei3.C86522b;
import java.util.ArrayList;
import org.json.JSONObject;
import p008bq.C67305d1;
import p1035sf.C90183c;
import u61.C101964h;

@C86522b
/* renamed from: aq.t0 */
public class C92058t0 extends C86301e implements C67305d1 {
    /* renamed from: Bw */
    public boolean mo91425Bw(IEmojiInfo iEmojiInfo) {
        return C101964h.m134227i(iEmojiInfo);
    }

    /* renamed from: La */
    public int mo91426La(IEmojiInfo iEmojiInfo) {
        String str;
        EmojiInfo emojiInfo = (EmojiInfo) iEmojiInfo;
        ArrayList<String> arrayList = C101964h.f300169a;
        if (!emojiInfo.mo62678k() || (str = emojiInfo.field_name) == null) {
            return 0;
        }
        return MMApplicationContext.getContext().getResources().getIdentifier(str.split("\\.")[0], "drawable", MMApplicationContext.getApplicationId());
    }

    /* renamed from: Nk */
    public void mo91427Nk(String str, JSONObject jSONObject, IEmojiInfo iEmojiInfo) {
        EmojiInfo emojiInfo = (EmojiInfo) iEmojiInfo;
        ArrayList<String> arrayList = C101964h.f300169a;
        try {
            if (!Util.isNullOrNil(emojiInfo.field_md5)) {
                if (!emojiInfo.field_md5.equals(jSONObject.getString("md5"))) {
                    return;
                }
            }
            emojiInfo.field_md5 = C101964h.m134221c(jSONObject.optString("md5", ""), emojiInfo.field_md5);
            emojiInfo.field_cdnUrl = C101964h.m134221c(jSONObject.optString("productUrl", ""), emojiInfo.field_cdnUrl);
            emojiInfo.field_thumbUrl = C101964h.m134221c(jSONObject.optString("thumb", ""), emojiInfo.field_thumbUrl);
            emojiInfo.field_encrypturl = C101964h.m134221c(jSONObject.optString("encryptUrl", ""), emojiInfo.field_encrypturl);
            emojiInfo.field_aeskey = C101964h.m134221c(jSONObject.optString("aesKey", ""), emojiInfo.field_aeskey);
            emojiInfo.field_groupId = C101964h.m134221c(jSONObject.optString("productID", ""), emojiInfo.field_groupId);
            emojiInfo.f284126R1 = C101964h.m134221c(jSONObject.optString("productName", ""), emojiInfo.f284126R1);
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = EmojiInfo.f284123W1;
            emojiInfo.field_catalog = 65;
            if (C90183c.m112859g(emojiInfo.field_cdnUrl) && C90183c.m112859g(emojiInfo.field_aeskey)) {
                emojiInfo.field_cdnUrl = emojiInfo.field_encrypturl;
            }
        } catch (Exception e) {
            Log.printErrStackTrace(str, e, "convertEmojiInfo", new Object[0]);
        }
    }

    public Drawable Zw0(String str) {
        ArrayList<String> arrayList = C101964h.f300169a;
        return C96926b0.m124490b().mo135518c(str);
    }

    public boolean f10(long j) {
        ArrayList<String> arrayList = C101964h.f300169a;
        EmojiInfo bO = C30790w2.m39221h().mo57717d().mo142052bO(j);
        if (bO == null || bO.mo62647T1() != IEmojiInfo.C40005a.STATUS_UPLOAD_FAIL) {
            return false;
        }
        int ordinal = bO.mo62651X1().ordinal();
        return ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 6;
    }

    /* renamed from: hJ */
    public boolean mo91430hJ(IEmojiInfo iEmojiInfo) {
        ArrayList<String> arrayList = C101964h.f300169a;
        return Util.isEqual(iEmojiInfo.getGroupId(), "capture");
    }

    /* renamed from: n8 */
    public String mo91431n8(String str) {
        return C101964h.m134230l(str);
    }

    public String rx0() {
        return C101964h.m134224f();
    }

    /* renamed from: yi */
    public boolean mo91433yi(IEmojiInfo iEmojiInfo) {
        return C101964h.m134231m(iEmojiInfo);
    }
}
