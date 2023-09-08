package p490dl;

import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;
import uc0.C111155i;
import uc0.C111157v;

/* renamed from: dl.l */
public final class C107051l extends C97484a {

    /* renamed from: b */
    public final C111155i f320466b = new C111155i();

    /* renamed from: b */
    public void mo125836b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
        if (C87412m.m108589b(str, "AppId")) {
            this.f320466b.f332896d = mo136753f(xmlPullParser);
        } else if (C87412m.m108589b(str, "EntryAnimType")) {
            C111157v vVar = new C111157v();
            vVar.f332919f = 1;
            int c = mo136750c(xmlPullParser, "size");
            vVar.f332920g = c;
            vVar.f332921h = c;
            vVar.f332917d = mo136751d(xmlPullParser, DownloadInfo.FILENAME);
            vVar.f332918e = mo136752e(xmlPullParser);
            this.f320466b.f332897e = vVar;
        } else {
            mo136754g(xmlPullParser);
        }
    }
}
