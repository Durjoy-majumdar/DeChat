package e02;

import com.tencent.p014mm.plugin.handoff.model.HandOff;
import com.tencent.p014mm.plugin.handoff.model.HandOffMP;
import gy3.C87412m;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: e02.e */
public final class C97565e extends C97566f<HandOffMP> {
    /* renamed from: b */
    public void mo136828b(String str, XmlPullParser xmlPullParser) {
        C87412m.m108594g(str, "tag");
        C87412m.m108594g(xmlPullParser, "parser");
        super.mo136828b(str, xmlPullParser);
    }

    /* renamed from: h */
    public HandOff mo136833h() {
        return new HandOffMP();
    }
}
