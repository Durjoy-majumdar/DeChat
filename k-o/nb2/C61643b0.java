package nb2;

import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import te3.C64488kb1;
import te3.C64519lb1;
import z04.C66725r;

/* renamed from: nb2.b0 */
public final class C61643b0 {
    /* renamed from: a */
    public static final String m72359a(Object obj) {
        String str;
        if (obj == null || (str = obj.toString()) == null) {
            str = "";
        }
        String escapeStringForXml = Util.escapeStringForXml(str);
        C87412m.m108593f(escapeStringForXml, "escapeStringForXml(this?.toString() ?: \"\")");
        return escapeStringForXml;
    }

    /* renamed from: b */
    public static final String m72360b(C64488kb1 kb12) {
        C87412m.m108594g(kb12, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("<FinderMVSongInfo>\n    <songName>");
        sb.append(m72359a(kb12.f183904d));
        sb.append("</songName>\n    <singer>");
        sb.append(m72359a(kb12.f183905e));
        sb.append("</singer>\n    <musicDataUrl>");
        sb.append(m72359a(kb12.f183906f));
        sb.append("</musicDataUrl>\n    <musicAppId>");
        sb.append(m72359a(kb12.f183907g));
        sb.append("</musicAppId>\n    <musicWebUrl>");
        sb.append(m72359a(kb12.f183908h));
        sb.append("</musicWebUrl>\n    <songId>");
        sb.append(m72359a(kb12.f183909i));
        sb.append("</songId>\n    <lyric>");
        sb.append(m72359a(kb12.f183910j));
        sb.append("</lyric>\n    <albumName>");
        sb.append(m72359a(kb12.f183911n));
        sb.append("</albumName>\n    <albumUrl>");
        sb.append(m72359a(kb12.f183912o));
        sb.append("</albumUrl>\n    <genre>");
        sb.append(m72359a(kb12.f183913p));
        sb.append("</genre>\n    <publicTime>");
        sb.append(m72359a(kb12.f183914q));
        sb.append("</publicTime>\n    <publicTimeS>");
        sb.append(m72359a(Long.valueOf(kb12.f183915r)));
        sb.append("</publicTimeS>\n    <extraInfo>");
        sb.append(m72359a(kb12.f183916s));
        sb.append("</extraInfo>\n    <identification>");
        sb.append(m72359a(kb12.f183917t));
        sb.append("</identification>\n    <duration>");
        sb.append(kb12.f183918u);
        sb.append("</duration>\n    <musicOperationUrl>");
        C64519lb1 lb12 = kb12.f183921x;
        sb.append(m72359a(lb12 != null ? lb12.f184069d : null));
        sb.append("</musicOperationUrl>\n    <mid>");
        sb.append(m72359a(kb12.f183922y));
        sb.append("</mid>\n</FinderMVSongInfo>\n");
        return C66725r.m78728b(sb.toString());
    }
}
