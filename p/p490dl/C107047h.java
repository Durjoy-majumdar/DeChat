package p490dl;

import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;
import uc0.C111152d;
import uc0.C111157v;

/* renamed from: dl.h */
public final class C107047h extends C97484a {

    /* renamed from: b */
    public final C111152d f320459b = new C111152d();

    /* renamed from: b */
    public void mo125836b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
        switch (str.hashCode()) {
            case -1578523488:
                if (str.equals("AndroidURL")) {
                    this.f320459b.f332875f = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case -1213391326:
                if (str.equals("iOSURL")) {
                    this.f320459b.f332874e = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case -1061003427:
                if (str.equals("EntryAnimType")) {
                    C111157v vVar = new C111157v();
                    vVar.f332919f = 1;
                    int c = mo136750c(xmlPullParser, "size");
                    vVar.f332920g = c;
                    vVar.f332921h = c;
                    vVar.f332917d = mo136751d(xmlPullParser, DownloadInfo.FILENAME);
                    vVar.f332918e = mo136752e(xmlPullParser);
                    this.f320459b.f332876g = vVar;
                    return;
                }
                break;
            case 63475452:
                if (str.equals("AppId")) {
                    this.f320459b.f332873d = mo136753f(xmlPullParser);
                    return;
                }
                break;
        }
        mo136754g(xmlPullParser);
    }
}
