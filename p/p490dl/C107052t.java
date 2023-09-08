package p490dl;

import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;
import uc0.C111156r;
import uc0.C65321s;

/* renamed from: dl.t */
public final class C107052t extends C97484a {

    /* renamed from: b */
    public final C111156r f320467b = new C111156r();

    /* renamed from: b */
    public void mo125836b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
        switch (str.hashCode()) {
            case -2025406440:
                if (str.equals("SubTitle")) {
                    this.f320467b.f332901g = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case -1563547017:
                if (str.equals("CouponSmallTitle")) {
                    this.f320467b.f332910s = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case -1282287868:
                if (str.equals("ButtonTextColor")) {
                    this.f320467b.f332913v = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case -1061003427:
                if (str.equals("EntryAnimType")) {
                    C65321s sVar = new C65321s();
                    sVar.f188000f = mo136750c(xmlPullParser, "size");
                    sVar.f187998d = mo136751d(xmlPullParser, DownloadInfo.FILENAME);
                    sVar.f187999e = mo136752e(xmlPullParser);
                    this.f320467b.f332915x = sVar;
                    return;
                }
                break;
            case -834434302:
                if (str.equals("UseLightStyle")) {
                    this.f320467b.f332916y = mo136752e(xmlPullParser);
                    return;
                }
                break;
            case -511925738:
                if (str.equals("DefaultCover")) {
                    this.f320467b.f332914w = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case -473313749:
                if (str.equals("SubTitleColor")) {
                    this.f320467b.f332902h = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case -270362873:
                if (str.equals("RedEnvelopeCoverSmallTitle")) {
                    this.f320467b.f332908q = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 6969246:
                if (str.equals("CouponBigTitle")) {
                    this.f320467b.f332909r = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 63475452:
                if (str.equals("AppId")) {
                    this.f320467b.f332898d = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 231778350:
                if (str.equals("RedEnvelopeCoverBigTitle")) {
                    this.f320467b.f332907p = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 290107061:
                if (str.equals("BackgroundColor")) {
                    this.f320467b.f332905n = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 425268249:
                if (str.equals("BackgroundLogo")) {
                    this.f320467b.f332906o = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 1216348288:
                if (str.equals("BrandIcon")) {
                    this.f320467b.f332903i = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 1216495250:
                if (str.equals("BrandName")) {
                    this.f320467b.f332904j = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 1435418957:
                if (str.equals("LoadingAnim")) {
                    this.f320467b.f332911t = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 1465142563:
                if (str.equals("ButtonBackgroundColor")) {
                    this.f320467b.f332912u = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 1742469119:
                if (str.equals("MainTitle")) {
                    this.f320467b.f332899e = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case 2098097828:
                if (str.equals("MainTitleColor")) {
                    this.f320467b.f332900f = mo136753f(xmlPullParser);
                    return;
                }
                break;
        }
        mo136754g(xmlPullParser);
    }
}
