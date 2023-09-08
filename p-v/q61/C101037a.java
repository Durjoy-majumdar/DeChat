package q61;

import com.tencent.p014mm.autogen.mmdata.rpt.DesignerEmojiStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonPreviewClickStruct;
import com.tencent.p014mm.plugin.emoji.model.C93101b;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.emotion.EmojiInfo;
import te3.C101754a80;
import te3.C101800k70;

/* renamed from: q61.a */
public final class C101037a {

    /* renamed from: a */
    public static long f295825a = -1;

    /* renamed from: a */
    public static final String m132403a(C93101b bVar) {
        String str = "";
        if (bVar == null) {
            return str;
        }
        C101754a80 a802 = bVar.f268227a;
        String str2 = null;
        String str3 = a802 != null ? a802.f297846o : null;
        if (str3 != null) {
            str = str3;
        }
        if (!Util.isNullOrNil(str)) {
            return str;
        }
        if (!bVar.f268229c) {
            return "null";
        }
        C101754a80 a803 = bVar.f268227a;
        if (a803 != null) {
            str2 = a803.f297840f;
        }
        return Util.isNullOrNil(str2) ? "H5" : "Toptic";
    }

    /* renamed from: b */
    public static final void m132404b(String str, String str2, int i, String str3, int i2) {
        EmoticonPreviewClickStruct emoticonPreviewClickStruct = new EmoticonPreviewClickStruct();
        emoticonPreviewClickStruct.f265463d = emoticonPreviewClickStruct.mo86045b("md5", str, true);
        emoticonPreviewClickStruct.f265464e = emoticonPreviewClickStruct.mo86045b("pid", str2, true);
        emoticonPreviewClickStruct.f265467h = (long) i;
        emoticonPreviewClickStruct.f265465f = emoticonPreviewClickStruct.mo86045b("raw_md5", str3, true);
        emoticonPreviewClickStruct.f265466g = (long) i2;
        emoticonPreviewClickStruct.mo86054n();
    }

    /* renamed from: c */
    public static final void m132405c(EmojiInfo emojiInfo, int i, int i2, long j, int i3) {
        if (emojiInfo != null) {
            DesignerEmojiStruct designerEmojiStruct = new DesignerEmojiStruct();
            designerEmojiStruct.f265391d = (long) i2;
            designerEmojiStruct.f265392e = (long) i;
            designerEmojiStruct.f265393f = designerEmojiStruct.mo86045b("MD5Key", emojiInfo.field_md5.toString(), true);
            designerEmojiStruct.f265394g = designerEmojiStruct.mo86045b("SearchID", String.valueOf(j), true);
            designerEmojiStruct.f265395h = designerEmojiStruct.mo86045b("DesignerId", emojiInfo.field_designerID, true);
            designerEmojiStruct.f265396i = designerEmojiStruct.mo86045b("Pid", emojiInfo.field_groupId, true);
            designerEmojiStruct.f265397j = (long) i3;
            designerEmojiStruct.f265398k = designerEmojiStruct.mo86045b("sessionid", String.valueOf(f295825a), true);
            designerEmojiStruct.mo86054n();
        }
    }

    /* renamed from: d */
    public static final void m132406d(C101800k70 k702, int i, int i2, long j, int i3) {
        if (k702 != null) {
            DesignerEmojiStruct designerEmojiStruct = new DesignerEmojiStruct();
            designerEmojiStruct.f265391d = (long) i2;
            designerEmojiStruct.f265392e = (long) i;
            designerEmojiStruct.f265393f = designerEmojiStruct.mo86045b("MD5Key", k702.f298586d.toString(), true);
            designerEmojiStruct.f265394g = designerEmojiStruct.mo86045b("SearchID", String.valueOf(j), true);
            designerEmojiStruct.f265395h = designerEmojiStruct.mo86045b("DesignerId", k702.f298589g, true);
            designerEmojiStruct.f265396i = designerEmojiStruct.mo86045b("Pid", k702.f298592j, true);
            designerEmojiStruct.f265397j = (long) i3;
            designerEmojiStruct.f265398k = designerEmojiStruct.mo86045b("sessionid", String.valueOf(f295825a), true);
            designerEmojiStruct.mo86054n();
        }
    }
}
