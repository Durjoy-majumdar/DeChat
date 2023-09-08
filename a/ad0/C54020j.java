package ad0;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import gy3.C87412m;
import ht1.C60167f1;
import java.util.Map;
import te3.C64623p81;

/* renamed from: ad0.j */
public final class C54020j implements C54013b {

    /* renamed from: a */
    public C64623p81 f151289a = new C64623p81();

    /* renamed from: b */
    public String mo74685b() {
        SnsMethodCalculate.markStartTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        String c = C60167f1.m70145c(mo74686c());
        C87412m.m108593f(c, "makeContent(shareLive)");
        SnsMethodCalculate.markEndTimeMs("makeContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        return c;
    }

    /* renamed from: c */
    public C64623p81 mo74686c() {
        SnsMethodCalculate.markStartTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
        C64623p81 p812 = this.f151289a;
        SnsMethodCalculate.markEndTimeMs("getShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
        return p812;
    }

    /* renamed from: d */
    public String mo74687d() {
        SnsMethodCalculate.markStartTimeMs("makeFestivalContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        C64623p81 c = mo74686c();
        StringBuilder sb = new StringBuilder();
        if (c != null) {
            try {
                if (!Util.isNullOrNil(c.f184778d)) {
                    sb.append("<SpringFinderLive>");
                    sb.append("<finderLiveID>");
                    sb.append(c.f184778d);
                    sb.append("</finderLiveID>");
                    sb.append("<finderUsername>");
                    sb.append(Util.escapeStringForXml(c.f184779e));
                    sb.append("</finderUsername>");
                    sb.append("<finderObjectID>");
                    sb.append(c.f184780f);
                    sb.append("</finderObjectID>");
                    sb.append("<nickname>");
                    sb.append(XmlParser.getCDataWrapper(c.f184781g));
                    sb.append("</nickname>");
                    sb.append("<finderNonceID>");
                    sb.append(Util.escapeStringForXml(c.f184790s));
                    sb.append("</finderNonceID>");
                    sb.append("<liveStatus>");
                    sb.append(XmlParser.getCDataWrapper(c.f184791t + ""));
                    sb.append("</liveStatus>");
                    sb.append("<headUrl>");
                    sb.append(XmlParser.getCDataWrapper(c.f184789r));
                    sb.append("</headUrl>");
                    sb.append("<media>");
                    sb.append("<coverUrl>");
                    sb.append(XmlParser.getCDataWrapper(c.f184783i));
                    sb.append("</coverUrl>");
                    sb.append("<width>");
                    sb.append(c.f184784j);
                    sb.append("</width>");
                    sb.append("<height>");
                    sb.append(c.f184785n);
                    sb.append("</height>");
                    sb.append("</media>");
                    sb.append("</SpringFinderLive>");
                }
            } catch (Exception e) {
                Log.m105921e("MicroMsg.FinderShareParser", "make content error! %s", e.getMessage());
            }
        }
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "makeFestivalContent(shareLive)");
        SnsMethodCalculate.markEndTimeMs("makeFestivalContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        return sb4;
    }

    /* renamed from: e */
    public void mo74688e(String str, Map<String, String> map) {
        SnsMethodCalculate.markStartTimeMs("parseContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
        mo74689f(C60167f1.m70153k(str, map));
        SnsMethodCalculate.markEndTimeMs("parseContent", "com.tencent.mm.modelsns.SnsFinderShareLive");
    }

    /* renamed from: f */
    public void mo74689f(C64623p81 p812) {
        SnsMethodCalculate.markStartTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
        C87412m.m108594g(p812, "<set-?>");
        this.f151289a = p812;
        SnsMethodCalculate.markEndTimeMs("setShareLive", "com.tencent.mm.modelsns.SnsFinderShareLive");
    }
}
