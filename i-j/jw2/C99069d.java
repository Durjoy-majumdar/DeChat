package jw2;

import com.tencent.p014mm.autogen.mmdata.rpt.StoryChatTopBarEntranceExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryComposeReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDoubleTapHeadViewStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryDownloadReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryEntranceExposeReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryImageVideoRemuxStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryImageVideoZipStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPageExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryPreviewReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryProfileTabExposeStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StorySinglePreviewReportStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.StoryStatusChangeStruct;
import gy3.C87412m;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import z04.C112551y;

/* renamed from: jw2.d */
public final class C99069d {

    /* renamed from: a */
    public static final C99069d f290418a = new C99069d();

    /* renamed from: b */
    public static StoryPageExposeStruct f290419b = new StoryPageExposeStruct();

    /* renamed from: c */
    public static int f290420c = -1;

    /* renamed from: d */
    public static StoryPreviewReportStruct f290421d = new StoryPreviewReportStruct();

    /* renamed from: e */
    public static C99065a f290422e = new C99065a();

    /* renamed from: f */
    public static Set<String> f290423f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g */
    public static Set<String> f290424g = Collections.synchronizedSet(new HashSet());

    /* renamed from: h */
    public static boolean f290425h = true;

    /* renamed from: i */
    public static boolean f290426i = true;

    /* renamed from: j */
    public static StoryChatTopBarEntranceExposeStruct f290427j = new StoryChatTopBarEntranceExposeStruct();

    /* renamed from: k */
    public static StoryDoubleTapHeadViewStruct f290428k = new StoryDoubleTapHeadViewStruct();

    /* renamed from: l */
    public static StoryDownloadReportStruct f290429l = new StoryDownloadReportStruct();

    /* renamed from: m */
    public static StorySinglePreviewReportStruct f290430m = new StorySinglePreviewReportStruct();

    /* renamed from: n */
    public static StoryProfileTabExposeStruct f290431n = new StoryProfileTabExposeStruct();

    /* renamed from: o */
    public static long f290432o;

    /* renamed from: p */
    public static long f290433p;

    /* renamed from: q */
    public static StoryStatusChangeStruct f290434q = new StoryStatusChangeStruct();

    static {
        new StoryComposeReportStruct();
        new StoryImageVideoRemuxStruct();
        new StoryImageVideoZipStruct();
        new HashMap();
        new StoryEntranceExposeReportStruct();
    }

    /* renamed from: f */
    public static void m129023f(C99069d dVar, long j, String str, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = f290421d.f266265e;
        }
        if ((i & 8) != 0) {
            j3 = f290421d.f266266f;
        }
        if ((i & 16) != 0) {
            j4 = 0;
        }
        dVar.getClass();
        C87412m.m108594g(str, "storyId");
        StoryStatusChangeStruct storyStatusChangeStruct = f290434q;
        storyStatusChangeStruct.f266301d = storyStatusChangeStruct.mo86045b("StoryId", str, true);
        StoryStatusChangeStruct storyStatusChangeStruct2 = f290434q;
        storyStatusChangeStruct2.f266302e = j;
        storyStatusChangeStruct2.f266305h = j4;
        storyStatusChangeStruct2.f266303f = j2;
        storyStatusChangeStruct2.f266304g = j3;
        storyStatusChangeStruct2.mo86054n();
        f290434q = new StoryStatusChangeStruct();
    }

    /* renamed from: a */
    public final void mo138412a(int i) {
        int i2 = f290420c;
        if (i2 == -1 && i == 4) {
            f290420c = i;
        } else if (i2 == 10 && i == 11) {
            f290420c = i;
        } else {
            f290420c = i;
            C99065a aVar = f290422e;
            aVar.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aid", i);
            boolean z = true;
            jSONObject.put("td", aVar.f290390a.length() + 1);
            if (aVar.f290390a.toString().length() + jSONObject.toString().length() > 1000) {
                z = false;
            }
            if (z) {
                synchronized (aVar.f290391b) {
                    aVar.f290390a.put(jSONObject);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo138413b() {
        f290419b.mo86054n();
        f290419b = new StoryPageExposeStruct();
    }

    /* renamed from: c */
    public final void mo138414c() {
        String n;
        StoryPreviewReportStruct storyPreviewReportStruct = f290421d;
        if (0 == storyPreviewReportStruct.f266274n) {
            mo138417g();
            return;
        }
        C99065a aVar = f290422e;
        synchronized (aVar.f290391b) {
            String jSONArray = aVar.f290390a.toString();
            C87412m.m108593f(jSONArray, "traceJsonArray.toString()");
            n = C112551y.m153814n(jSONArray, ",", ";", false);
            aVar.f290390a = new JSONArray();
        }
        storyPreviewReportStruct.f266278r = storyPreviewReportStruct.mo86045b("ActionTrace", n, true);
        StoryPreviewReportStruct storyPreviewReportStruct2 = f290421d;
        storyPreviewReportStruct2.f266279s += storyPreviewReportStruct2.f266276p;
        storyPreviewReportStruct2.mo86054n();
        StoryPreviewReportStruct storyPreviewReportStruct3 = f290421d;
        storyPreviewReportStruct3.f266272l = 0;
        storyPreviewReportStruct3.f266276p = 0;
        storyPreviewReportStruct3.f266275o = 0;
        storyPreviewReportStruct3.f266273m = 0;
        storyPreviewReportStruct3.f266277q = 0;
        storyPreviewReportStruct3.f266269i = 0;
        storyPreviewReportStruct3.f266279s = 0;
        storyPreviewReportStruct3.f266282v = 0;
        storyPreviewReportStruct3.f266280t = storyPreviewReportStruct3.mo86045b("SessionId", "", true);
        mo138417g();
    }

    /* renamed from: d */
    public final void mo138415d() {
        StoryProfileTabExposeStruct storyProfileTabExposeStruct = f290431n;
        if (storyProfileTabExposeStruct.f194473i != 0) {
            storyProfileTabExposeStruct.mo86054n();
            StoryProfileTabExposeStruct storyProfileTabExposeStruct2 = f290431n;
            storyProfileTabExposeStruct2.f194473i = 0;
            storyProfileTabExposeStruct2.f194469e = 0;
            storyProfileTabExposeStruct2.f194468d = 0;
            storyProfileTabExposeStruct2.f194470f = 0;
            storyProfileTabExposeStruct2.f194471g = f290432o;
            storyProfileTabExposeStruct2.f194472h = 0;
            storyProfileTabExposeStruct2.f194474j = f290433p;
        }
    }

    /* renamed from: e */
    public final void mo138416e() {
        StorySinglePreviewReportStruct storySinglePreviewReportStruct = f290430m;
        if (storySinglePreviewReportStruct.f266285f == 0) {
            f290430m = new StorySinglePreviewReportStruct();
            return;
        }
        storySinglePreviewReportStruct.mo86054n();
        f290430m = new StorySinglePreviewReportStruct();
    }

    /* renamed from: g */
    public final void mo138417g() {
        f290422e = new C99065a();
        f290420c = -1;
        f290423f.clear();
        f290424g.clear();
    }
}
