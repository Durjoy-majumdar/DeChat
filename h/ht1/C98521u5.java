package ht1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.Map;
import te3.C64719t23;

/* renamed from: ht1.u5 */
public class C98521u5 {
    /* renamed from: a */
    public static String m127973a(C64719t23 t232) {
        StringBuilder sb = new StringBuilder();
        if (t232 != null) {
            try {
                sb.append("<musicShareItem>");
                sb.append("<mvObjectId>");
                sb.append(Util.escapeStringForXml(t232.f185459d));
                sb.append("</mvObjectId>");
                sb.append("<mvNonceId>");
                sb.append(Util.escapeStringForXml(t232.f185460e));
                sb.append("</mvNonceId>");
                sb.append("<mvCoverUrl>");
                sb.append(Util.escapeStringForXml(t232.f185461f));
                sb.append("</mvCoverUrl>");
                sb.append("<mvMakerFinderNickname>");
                sb.append(Util.escapeStringForXml(t232.f185462g));
                sb.append("</mvMakerFinderNickname>");
                sb.append("<mvSingerName>");
                sb.append(Util.escapeStringForXml(t232.f185463h));
                sb.append("</mvSingerName>");
                sb.append("<mvAlbumName>");
                sb.append(Util.escapeStringForXml(t232.f185464i));
                sb.append("</mvAlbumName>");
                sb.append("<mvMusicGenre>");
                sb.append(Util.escapeStringForXml(t232.f185466n));
                sb.append("</mvMusicGenre>");
                sb.append("<mvIssueDate>");
                sb.append(t232.f185467o);
                sb.append("</mvIssueDate>");
                sb.append("<mvIdentification>");
                sb.append(Util.escapeStringForXml(t232.f185468p));
                sb.append("</mvIdentification>");
                sb.append("<musicDuration>");
                sb.append(t232.f185469q);
                sb.append("</musicDuration>");
                sb.append("<mvExtInfo>");
                sb.append(Util.escapeStringForXml(t232.f185465j));
                sb.append("</mvExtInfo>");
                sb.append("<mvOperationUrl>");
                sb.append(Util.escapeStringForXml(t232.f185471s));
                sb.append("</mvOperationUrl>");
                sb.append("<mid>");
                sb.append(Util.escapeStringForXml(t232.f185470r));
                sb.append("</mid>");
                sb.append("<appIdForSourceDisplay>");
                sb.append(Util.escapeStringForXml(t232.f185476x));
                sb.append("</appIdForSourceDisplay>");
                sb.append("</musicShareItem>");
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MusicMvShareParser", "make content error! %s", e.getMessage());
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static C64719t23 m127974b(String str, Map<String, String> map) {
        C64719t23 t232 = new C64719t23();
        try {
            String str2 = str + ".musicShareItem";
            if (!map.isEmpty()) {
                t232.f185459d = Util.nullAsNil(map.get(str2 + ".mvObjectId"));
                t232.f185460e = Util.nullAsNil(map.get(str2 + ".mvNonceId"));
                t232.f185461f = Util.nullAsNil(map.get(str2 + ".mvCoverUrl"));
                t232.f185462g = Util.nullAsNil(map.get(str2 + ".mvMakerFinderNickname"));
                t232.f185463h = Util.nullAsNil(map.get(str2 + ".mvSingerName"));
                t232.f185464i = Util.nullAsNil(map.get(str2 + ".mvAlbumName"));
                t232.f185466n = Util.nullAsNil(map.get(str2 + ".mvMusicGenre"));
                t232.f185467o = Util.safeParseLong(map.get(str2 + ".mvIssueDate"));
                t232.f185468p = Util.nullAsNil(map.get(str2 + ".mvIdentification"));
                t232.f185469q = Util.safeParseInt(map.get(str2 + ".musicDuration"));
                t232.f185465j = Util.nullAsNil(map.get(str2 + ".mvExtInfo"));
                t232.f185471s = Util.nullAsNil(map.get(str2 + ".mvOperationUrl"));
                t232.f185470r = Util.nullAsNil(map.get(str2 + ".mid"));
                t232.f185476x = Util.nullAsNil(map.get(str2 + ".appIdForSourceDisplay"));
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MusicMvShareParser", "parse error! %s", e.getMessage());
        }
        return t232;
    }
}
