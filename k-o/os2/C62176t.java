package os2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ps2.C100880k;
import rq2.C63489a;
import z04.C66730w;

/* renamed from: os2.t */
public final class C62176t {

    /* renamed from: d */
    public static final C62177a f176778d = new C62177a();

    /* renamed from: a */
    public final List<C62179t0> f176779a;

    /* renamed from: b */
    public final float f176780b;

    /* renamed from: c */
    public final float f176781c;

    /* renamed from: os2.t$a */
    public static final class C62177a {

        /* renamed from: os2.t$a$a */
        public static final class C62178a implements C100880k.C100881a {

            /* renamed from: a */
            public final /* synthetic */ String f176782a;

            public C62178a(String str) {
                this.f176782a = str;
            }

            /* renamed from: a */
            public void mo76113a() {
                SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
                Log.m105920e("PlayState", "tagIcon " + this.f176782a + "  failed!");
                SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
            }

            /* renamed from: b */
            public void mo76114b() {
                SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
                SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
            }

            /* renamed from: c */
            public void mo76115c(String str) {
                SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
                C87412m.m108594g(str, "path");
                Log.m105924i("PlayState", "onDownloaded tagIcon " + this.f176782a + "  path " + str);
                SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.storage.PlayState$Companion$preload$1$1");
            }
        }

        /* renamed from: a */
        public final C62176t mo87232a(Map<String, String> map, String str) {
            float f;
            Float d;
            Float d2;
            C62179t0 t0Var;
            Float d3;
            Map<String, String> map2 = map;
            String str2 = str;
            SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
            if (map2 == null) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
                return null;
            } else if (str2 == null) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
                return null;
            } else if (!map.containsKey(str)) {
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
                return null;
            } else {
                ArrayList arrayList = new ArrayList();
                String str3 = str2 + ".tagInfoList.tagInfo";
                int i = 0;
                while (true) {
                    String str4 = "";
                    String valueOf = i != 0 ? String.valueOf(i) : str4;
                    i++;
                    f = 0.0f;
                    if (!map2.containsKey(str3 + valueOf)) {
                        break;
                    }
                    String str5 = str3 + valueOf;
                    SnsMethodCalculate.markStartTimeMs("parse", "com.tencent.mm.plugin.sns.storage.TagInfo$Companion");
                    if (str5 == null) {
                        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.TagInfo$Companion");
                        t0Var = null;
                    } else {
                        String str6 = map2.get(str5 + ".tagIcon");
                        if (str6 == null) {
                            str6 = str4;
                        }
                        String str7 = map2.get(str5 + ".tagText");
                        if (str7 != null) {
                            str4 = str7;
                        }
                        String str8 = map2.get(str5 + ".animationDuration");
                        t0Var = new C62179t0(str6, str4, (str8 == null || (d3 = C66730w.m78730d(str8)) == null) ? 0.0f : d3.floatValue());
                        SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.TagInfo$Companion");
                    }
                    if (t0Var == null) {
                        break;
                    }
                    arrayList.add(t0Var);
                }
                String str9 = map2.get(str2 + ".sectionBegin");
                float floatValue = (str9 == null || (d2 = C66730w.m78730d(str9)) == null) ? 0.0f : d2.floatValue();
                String str10 = map2.get(str2 + ".sectionEnd");
                if (!(str10 == null || (d = C66730w.m78730d(str10)) == null)) {
                    f = d.floatValue();
                }
                C62176t tVar = new C62176t(arrayList, floatValue, f);
                SnsMethodCalculate.markEndTimeMs("parse", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
                return tVar;
            }
        }

        /* renamed from: b */
        public final void mo87233b(C62176t tVar) {
            SnsMethodCalculate.markStartTimeMs("preload", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
            C87412m.m108594g(tVar, "<this>");
            for (C62179t0 t0Var : tVar.mo87231a()) {
                if (t0Var != null) {
                    String a = t0Var.mo87234a();
                    C63489a.m74828c(a == null ? "" : a, new C62178a(a));
                }
            }
            SnsMethodCalculate.markEndTimeMs("preload", "com.tencent.mm.plugin.sns.storage.PlayState$Companion");
        }
    }

    public C62176t(List<C62179t0> list, float f, float f2) {
        C87412m.m108594g(list, "tagInfoList");
        this.f176779a = list;
        this.f176780b = f;
        this.f176781c = f2;
    }

    /* renamed from: a */
    public final List<C62179t0> mo87231a() {
        SnsMethodCalculate.markStartTimeMs("getTagInfoList", "com.tencent.mm.plugin.sns.storage.PlayState");
        List<C62179t0> list = this.f176779a;
        SnsMethodCalculate.markEndTimeMs("getTagInfoList", "com.tencent.mm.plugin.sns.storage.PlayState");
        return list;
    }
}
