package ap2;

import android.os.Parcelable;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.preload.PreloadInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95136l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import java.util.regex.Pattern;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: ap2.a */
public final class C27993a {

    /* renamed from: a */
    public static final C27993a f77262a = new C27993a();

    /* renamed from: b */
    public static final LruCache<String, Boolean> f77263b = new LruCache<>(10);

    /* renamed from: c */
    public static final C32226l<Parcelable, C13598b0> f77264c = C27995b.f77268d;

    /* renamed from: ap2.a$a */
    public static final class C27994a {

        /* renamed from: a */
        public int f77265a;

        /* renamed from: b */
        public int f77266b;

        /* renamed from: c */
        public int f77267c;

        /* renamed from: a */
        public final void mo55740a(int i) {
            SnsMethodCalculate.markStartTimeMs("setCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
            this.f77266b = i;
            SnsMethodCalculate.markEndTimeMs("setCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        }

        /* renamed from: b */
        public final void mo55741b(int i) {
            SnsMethodCalculate.markStartTimeMs("setNodeType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
            this.f77265a = i;
            SnsMethodCalculate.markEndTimeMs("setNodeType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        }

        /* renamed from: c */
        public final void mo55742c(int i) {
            SnsMethodCalculate.markStartTimeMs("setSubCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
            this.f77267c = i;
            SnsMethodCalculate.markEndTimeMs("setSubCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
            boolean z = false;
            if (obj instanceof C27994a) {
                C27994a aVar = (C27994a) obj;
                if (aVar.f77265a == this.f77265a && aVar.f77266b == this.f77266b && aVar.f77267c == this.f77267c) {
                    z = true;
                }
            }
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
            return z;
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
            int i = this.f77265a + this.f77266b + this.f77267c;
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
            return i;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
            String str = "[nodeType=" + this.f77265a + ",compType=" + this.f77266b + ",subCompType=" + this.f77267c + ']';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
            return str;
        }
    }

    /* renamed from: ap2.a$b */
    public static final class C27995b extends C87413o implements C32226l<Parcelable, C13598b0> {

        /* renamed from: d */
        public static final C27995b f77268d = new C27995b();

        public C27995b() {
            super(1);
        }

        public Object invoke(Object obj) {
            boolean z;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
            Parcelable parcelable = (Parcelable) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
            C87412m.m108594g(parcelable, "obj");
            try {
                if (parcelable instanceof PreloadInfo) {
                    SnsMethodCalculate.markStartTimeMs("getXml", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
                    String str = ((PreloadInfo) parcelable).f81997d;
                    SnsMethodCalculate.markEndTimeMs("getXml", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadInfo");
                    if (str == null) {
                        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
                        C13598b0 b0Var = C13598b0.f38549a;
                        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
                        return b0Var;
                    }
                    C27993a aVar = C27993a.f77262a;
                    SnsMethodCalculate.markStartTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                    LruCache<String, Boolean> lruCache = C27993a.f77263b;
                    SnsMethodCalculate.markEndTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                    if (lruCache.check(str)) {
                        SnsMethodCalculate.markStartTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                        SnsMethodCalculate.markEndTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                        Boolean bool = lruCache.get(str);
                        C87412m.m108593f(bool, "xmlShouldPreloadWebViewMap.get(xml)");
                        z = bool.booleanValue();
                        Log.m105924i("PreloadSnsAdHelper", "already checked! " + z);
                    } else {
                        z = C27993a.m38052a(C27993a.f77262a, str);
                    }
                    SnsMethodCalculate.markStartTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                    SnsMethodCalculate.markEndTimeMs("access$getXmlShouldPreloadWebViewMap$p", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                    lruCache.put(str, Boolean.valueOf(z));
                    if (z) {
                        C95136l.m121018W();
                    }
                }
            } catch (Throwable th) {
                Log.printErrStackTrace("PreloadSnsAdHelper", th, " processPreload error", new Object[0]);
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$processPreload$1");
            return b0Var2;
        }
    }

    /* renamed from: a */
    public static final boolean m38052a(C27993a aVar, String str) {
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5 = str;
        SnsMethodCalculate.markStartTimeMs("access$shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        aVar.getClass();
        SnsMethodCalculate.markStartTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        int i = 1;
        if (str5 == null) {
            SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        } else {
            Map<String, String> parseXml = XmlParser.parseXml(str5, "adCanvasInfo", (String) null);
            if (parseXml == null || parseXml.isEmpty()) {
                Log.m105928w("PreloadSnsAdHelper", "invalid landingpages xml");
                SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
            } else {
                C27994a aVar2 = new C27994a();
                aVar2.mo55741b(0);
                aVar2.mo55740a(Util.safeParseInt(parseXml.get(".adCanvasInfo.type")));
                aVar2.mo55742c(Util.safeParseInt(parseXml.get(".adCanvasInfo.subtype")));
                String str6 = ".adCanvasInfo.PageList.Page";
                int i2 = 0;
                loop0:
                while (true) {
                    aVar2.mo55741b(i);
                    if (i2 == 0) {
                        str2 = str6;
                    } else {
                        str2 = str6 + i2;
                    }
                    if (!parseXml.containsKey(str2 + ".componentItemList.componentItem.type")) {
                        aVar2.mo55741b(2);
                        for (Map.Entry<String, String> key : parseXml.entrySet()) {
                            String str7 = (String) key.getKey();
                            if (str7 != null) {
                                Pattern compile = Pattern.compile("[\\s\\S]*\\.componentItem[0-9]*\\.type$");
                                C87412m.m108593f(compile, "compile(pattern)");
                                if (compile.matcher(str7).matches()) {
                                    String n = C112551y.m153814n(str7, ".type", ".subType", false);
                                    aVar2.mo55740a(Util.safeParseInt(parseXml.get(str7)));
                                    aVar2.mo55742c(Util.safeParseInt(parseXml.get(n)));
                                    SnsMethodCalculate.markStartTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                                    int i3 = aVar2.f77266b;
                                    SnsMethodCalculate.markEndTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                                    if (i3 == 82) {
                                        Log.m105924i("PreloadSnsAdHelper", "get webView type!");
                                        SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                    } else {
                        aVar2.mo55740a(Util.safeParseInt(parseXml.get(str2 + ".type")));
                        aVar2.mo55742c(Util.safeParseInt(parseXml.get(str2 + ".subType")));
                        SnsMethodCalculate.markStartTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                        int i4 = aVar2.f77266b;
                        SnsMethodCalculate.markEndTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                        if (i4 == 82) {
                            Log.m105924i("PreloadSnsAdHelper", "get webView type!");
                            SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                            break;
                        }
                        String str8 = str2 + ".componentItemList.componentItem";
                        aVar2.mo55741b(2);
                        int i5 = 0;
                        while (true) {
                            if (i5 == 0) {
                                str3 = str6;
                                str4 = str8;
                            } else {
                                str4 = str8 + i5;
                                str3 = str6;
                            }
                            if (!parseXml.containsKey(str4 + ".type")) {
                                break;
                            }
                            aVar2.mo55740a(Util.safeParseInt(parseXml.get(str4 + ".type")));
                            aVar2.mo55742c(Util.safeParseInt(parseXml.get(str4 + ".subType")));
                            SnsMethodCalculate.markStartTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                            int i6 = aVar2.f77266b;
                            SnsMethodCalculate.markEndTimeMs("getCompType", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper$TypeTriple");
                            if (i6 == 82) {
                                Log.m105924i("PreloadSnsAdHelper", "get webView type!");
                                SnsMethodCalculate.markEndTimeMs("shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                                break loop0;
                            }
                            i5++;
                            str6 = str3;
                        }
                    }
                    i2++;
                    str6 = str3;
                    i = 1;
                }
                z = true;
                SnsMethodCalculate.markEndTimeMs("access$shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
                return z;
            }
        }
        z = false;
        SnsMethodCalculate.markEndTimeMs("access$shouldPreloadWebView", "com.tencent.mm.plugin.sns.ad.landingpage.helper.preload.PreloadSnsAdHelper");
        return z;
    }
}
