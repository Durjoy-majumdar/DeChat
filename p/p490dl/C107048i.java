package p490dl;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.IXWebPreferences;
import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;
import uc0.C111153e;
import uc0.C111157v;
import uc0.C65319f;
import uc0.C65320l;

/* renamed from: dl.i */
public final class C107048i extends C97484a {

    /* renamed from: b */
    public final boolean f320460b;

    /* renamed from: c */
    public final C111153e f320461c = new C111153e();

    /* renamed from: d */
    public final C111157v f320462d = new C111157v();

    public C107048i(boolean z) {
        this.f320460b = z;
    }

    /* renamed from: a */
    public void mo125838a(XmlPullParser xmlPullParser) {
        C87412m.m108594g(xmlPullParser, "parser");
        this.f320461c.f332878e = mo136751d(xmlPullParser, "name");
        this.f320461c.f332880g = mo136750c(xmlPullParser, "reportType");
        this.f320461c.f332883j = mo136751d(xmlPullParser, "langs");
        String d = mo136751d(xmlPullParser, "BeginDate");
        String d2 = mo136751d(xmlPullParser, "EndDate");
        String d3 = mo136751d(xmlPullParser, "BeginTimeInterval");
        String d4 = mo136751d(xmlPullParser, "EndTimeInterval");
        super.mo125838a(xmlPullParser);
        int i = 0;
        this.f320461c.f332881h = Util.getSeconds(d, 0);
        this.f320461c.f332882i = Util.getSeconds(d2, 0);
        C111153e eVar = this.f320461c;
        if (eVar.f332881h != 0 || eVar.f332882i != 0) {
            int i2 = 86400;
            if (eVar.f332884n >= 3) {
                int safeParseInt = !Util.isNullOrNil(d3) ? Util.safeParseInt(d3) : 0;
                int safeParseInt2 = !Util.isNullOrNil(d4) ? Util.safeParseInt(d4) : 86400;
                int max = Math.max(0, Math.min(safeParseInt, 86400));
                i2 = Math.max(0, Math.min(safeParseInt2, 86400));
                i = max;
            }
            C111153e eVar2 = this.f320461c;
            eVar2.f332881h += i;
            eVar2.f332882i += i2;
        }
    }

    /* renamed from: b */
    public void mo125836b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
        boolean z = false;
        switch (str.hashCode()) {
            case -2105342875:
                if (str.equals("MagicEmojiEffectId")) {
                    this.f320461c.f332891u = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case -1565818326:
                if (str.equals("MiniApp")) {
                    C107050k kVar = new C107050k();
                    kVar.mo125838a(xmlPullParser);
                    this.f320461c.f332892v = kVar.f320465b;
                    return;
                }
                break;
            case -1289878496:
                if (str.equals("LuckyBag")) {
                    C107052t tVar = new C107052t();
                    tVar.mo125838a(xmlPullParser);
                    if (Util.isNullOrNil(tVar.f320467b.f332898d)) {
                        C115669n.INSTANCE.mo175911u(1263, 0);
                    } else {
                        z = true;
                    }
                    if (z) {
                        this.f320461c.f332885o = tVar.f320467b;
                        return;
                    }
                    return;
                }
                break;
            case -730941173:
                if (str.equals("AnimType")) {
                    this.f320462d.f332919f = mo136750c(xmlPullParser, "viewcount");
                    this.f320462d.f332920g = mo136750c(xmlPullParser, "minSize");
                    this.f320462d.f332921h = mo136750c(xmlPullParser, "maxSize");
                    this.f320462d.f332918e = mo136752e(xmlPullParser);
                    return;
                }
                break;
            case -671077817:
                if (str.equals("FileName")) {
                    this.f320461c.f332886p.add(this.f320462d);
                    this.f320462d.f332917d = mo136753f(xmlPullParser);
                    return;
                }
                break;
            case -585668469:
                if (str.equals("EffectType")) {
                    this.f320461c.f332890t = mo136752e(xmlPullParser);
                    return;
                }
                break;
            case -177232682:
                if (str.equals("RedEnvelopeCover")) {
                    C107051l lVar = new C107051l();
                    lVar.mo125838a(xmlPullParser);
                    this.f320461c.f332889s = lVar.f320466b;
                    return;
                }
                break;
            case 2211858:
                if (str.equals("Game")) {
                    C107047h hVar = new C107047h();
                    hVar.mo125838a(xmlPullParser);
                    this.f320461c.f332888r = hVar.f320459b;
                    return;
                }
                break;
            case 2622298:
                if (str.equals("Type")) {
                    this.f320461c.f332887q = mo136752e(xmlPullParser);
                    return;
                }
                break;
            case 524213478:
                if (str.equals("TopAnim")) {
                    C65320l lVar2 = new C65320l();
                    lVar2.f187994d = mo136750c(xmlPullParser, "width");
                    lVar2.f187995e = mo136750c(xmlPullParser, "height");
                    String d = mo136751d(xmlPullParser, "blockDuration");
                    if (d.length() == 0) {
                        z = true;
                    }
                    lVar2.f187996f = z ? 0.0d : Util.safeParseDouble(d);
                    lVar2.f187997g = mo136753f(xmlPullParser);
                    this.f320461c.f332893w = lVar2;
                    return;
                }
                break;
            case 849291753:
                if (str.equals("KeyWord")) {
                    C65319f fVar = new C65319f();
                    fVar.f187993e = mo136751d(xmlPullParser, IXWebPreferences.XWEB_LANGUAGE);
                    String f = mo136753f(xmlPullParser);
                    fVar.f187992d = f;
                    if (f.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        this.f320461c.f332877d.add(fVar);
                        return;
                    }
                    return;
                }
                break;
            case 947396446:
                if (str.equals("ClientEggVersion")) {
                    if (this.f320460b) {
                        this.f320461c.f332884n = mo136752e(xmlPullParser);
                        return;
                    } else {
                        mo136754g(xmlPullParser);
                        return;
                    }
                }
                break;
            case 2129029771:
                if (str.equals("NewAnimType")) {
                    C111157v vVar = new C111157v();
                    vVar.f332919f = mo136750c(xmlPullParser, "viewcount");
                    vVar.f332920g = mo136750c(xmlPullParser, "minSize");
                    vVar.f332921h = mo136750c(xmlPullParser, "maxSize");
                    vVar.f332917d = mo136751d(xmlPullParser, DownloadInfo.FILENAME);
                    vVar.f332918e = mo136752e(xmlPullParser);
                    this.f320461c.f332886p.add(vVar);
                    return;
                }
                break;
        }
        mo136754g(xmlPullParser);
    }
}
