package p622no;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import ob0.C117747y;
import p215oo.C11586g;
import sy0.C48503b;
import sy0.C48504d;

@C86522b
/* renamed from: no.c */
public final class C47291c extends C86301e implements C11586g {
    /* renamed from: Pv */
    public C117747y mo11515Pv(int i, String str, String str2, String str3, IEmojiInfo iEmojiInfo, long j) {
        C87412m.m108594g(str, "session_id");
        C87412m.m108594g(str2, "from_username");
        C87412m.m108594g(str3, "to_username");
        C87412m.m108594g(iEmojiInfo, "emoji");
        return new C48503b(i, str, str2, str3, iEmojiInfo, j);
    }

    public C117747y ht0(int i, String str, String str2, String str3, String str4, long j) {
        C87412m.m108594g(str, "session_id");
        C87412m.m108594g(str2, "from_username");
        C87412m.m108594g(str3, "to_username");
        C87412m.m108594g(str4, MimeTypes.BASE_TYPE_TEXT);
        return new C48504d(i, str, str2, str3, str4, j);
    }
}
