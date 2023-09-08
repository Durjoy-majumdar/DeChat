package e02;

import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.plugin.handoff.model.HandOffURL;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: e02.g */
public final class C97568g extends C97566f<HandOffURL> {
    /* renamed from: b */
    public void mo136828b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
        switch (str.hashCode()) {
            case -103833126:
                if (str.equals("handofftype")) {
                    String f = mo136832f(xmlPullParser);
                    int i = 0;
                    if (!(f.length() == 0)) {
                        i = Integer.parseInt(f);
                    }
                    ((HandOffURL) mo136834g()).setHandOffType(i);
                    return;
                }
                return;
            case 116079:
                if (str.equals("url")) {
                    ((HandOffURL) mo136834g()).setUrl(mo136832f(xmlPullParser));
                    return;
                }
                return;
            case 3226745:
                if (str.equals("icon")) {
                    ((HandOffURL) mo136834g()).setIcon(mo136832f(xmlPullParser));
                    return;
                }
                return;
            case 110371416:
                if (str.equals(FFmpegMetadataRetriever.METADATA_KEY_TITLE)) {
                    ((HandOffURL) mo136834g()).setTitle(mo136832f(xmlPullParser));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: h */
    public HandOff mo136833h() {
        return new HandOffURL();
    }
}
