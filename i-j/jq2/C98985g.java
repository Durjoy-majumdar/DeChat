package jq2;

import com.tencent.p014mm.memory.C92714n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94901o;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import com.tencent.p014mm.vfs.C86013q1;
import d14.C20380j;
import d14.C45252f;
import d14.C45253g;
import d14.C58054k;
import d14.C58056k1;
import d14.C58063m0;
import d14.C58072n1;
import d14.C58078q;
import d14.C58087u0;
import fy3.C32228q;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import lo2.C99556n;
import rx3.C13598b0;
import te3.C101804kv2;
import vr2.C102236a0;
import vr2.C102268v;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: jq2.g */
public final class C98985g {

    /* renamed from: a */
    public static final C98985g f290230a = new C98985g();

    /* renamed from: b */
    public static final Map<String, C58087u0<C98987b>> f290231b = new LinkedHashMap();

    /* renamed from: c */
    public static final Map<String, C58087u0<C98988c>> f290232c = new LinkedHashMap();

    /* renamed from: d */
    public static final Set<String> f290233d = new LinkedHashSet();

    /* renamed from: e */
    public static final Set<String> f290234e = new LinkedHashSet();

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3", mo125469f = "AdMediaDownloadHelper.kt", mo125470l = {299}, mo125471m = "invokeSuspend")
    /* renamed from: jq2.g$e */
    public static final class C60888e extends C91594j implements C32228q<C45253g<? super C98988c>, Throwable, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f173458d;

        /* renamed from: e */
        public /* synthetic */ Object f173459e;

        /* renamed from: f */
        public final /* synthetic */ C101804kv2 f173460f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60888e(C101804kv2 kv22, C15601d<? super C60888e> dVar) {
            super(3, dVar);
            this.f173460f = kv22;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
            Throwable th = (Throwable) obj2;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
            C60888e eVar = new C60888e(this.f173460f, (C15601d) obj3);
            eVar.f173459e = (C45253g) obj;
            Object invokeSuspend = eVar.invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
            int i = this.f173458d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45253g gVar = (C45253g) this.f173459e;
                String str = this.f173460f.f298689d;
                C87412m.m108593f(str, "media.Id");
                C58087u0<C98988c> c = C98985g.m128892c(str);
                C101804kv2 kv22 = this.f173460f;
                this.f173458d = 1;
                if (!(gVar instanceof C58072n1)) {
                    SnsMethodCalculate.markStartTimeMs("collect", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1");
                    Object a = c.mo31880a(new C58063m0.C58064a(new C98991h(gVar, kv22)), this);
                    if (a != aVar) {
                        a = C13598b0.f38549a;
                    }
                    if (a == aVar) {
                        SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1");
                    } else {
                        a = C13598b0.f38549a;
                        SnsMethodCalculate.markEndTimeMs("collect", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3$invokeSuspend$$inlined$map$1");
                    }
                    if (a != aVar) {
                        a = C13598b0.f38549a;
                    }
                    if (a == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
                        return aVar;
                    }
                } else {
                    throw ((C58072n1) gVar).f166092d;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$3");
            return b0Var;
        }
    }

    /* renamed from: jq2.g$a */
    public enum C98986a {
        RESULT_STATE_DOWNLOADING,
        RESULT_STATE_ERROR,
        RESULT_STATE_COMPLETE
    }

    /* renamed from: jq2.g$b */
    public static final class C98987b {

        /* renamed from: a */
        public final String f290239a;

        /* renamed from: b */
        public final WeakReference<C92714n> f290240b;

        /* renamed from: c */
        public final C98986a f290241c;

        public C98987b(String str, WeakReference<C92714n> weakReference, C98986a aVar) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(aVar, "state");
            this.f290239a = str;
            this.f290240b = weakReference;
            this.f290241c = aVar;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
                return true;
            } else if (!(obj instanceof C98987b)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
                return false;
            } else {
                C98987b bVar = (C98987b) obj;
                if (!C87412m.m108589b(this.f290239a, bVar.f290239a)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
                    return false;
                } else if (!C87412m.m108589b(this.f290240b, bVar.f290240b)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
                    return false;
                } else {
                    C98986a aVar = this.f290241c;
                    C98986a aVar2 = bVar.f290241c;
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
                    return aVar == aVar2;
                }
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            int hashCode = this.f290239a.hashCode() * 31;
            WeakReference<C92714n> weakReference = this.f290240b;
            int hashCode2 = ((hashCode + (weakReference == null ? 0 : weakReference.hashCode())) * 31) + this.f290241c.hashCode();
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            return hashCode2;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            String str = "ThumbResult(mediaId=" + this.f290239a + ", bitmap=" + this.f290240b + ", state=" + this.f290241c + ')';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ThumbResult");
            return str;
        }
    }

    /* renamed from: jq2.g$c */
    public static final class C98988c {

        /* renamed from: a */
        public final String f290242a;

        /* renamed from: b */
        public final String f290243b;

        /* renamed from: c */
        public final C98986a f290244c;

        public C98988c(String str, String str2, C98986a aVar) {
            C87412m.m108594g(str, "mediaId");
            C87412m.m108594g(aVar, "state");
            this.f290242a = str;
            this.f290243b = str2;
            this.f290244c = aVar;
        }

        /* renamed from: a */
        public final String mo138347a() {
            SnsMethodCalculate.markStartTimeMs("getFilePath", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            String str = this.f290243b;
            SnsMethodCalculate.markEndTimeMs("getFilePath", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return str;
        }

        /* renamed from: b */
        public final C98986a mo138348b() {
            SnsMethodCalculate.markStartTimeMs("getState", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            C98986a aVar = this.f290244c;
            SnsMethodCalculate.markEndTimeMs("getState", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return aVar;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
                return true;
            } else if (!(obj instanceof C98988c)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
                return false;
            } else {
                C98988c cVar = (C98988c) obj;
                if (!C87412m.m108589b(this.f290242a, cVar.f290242a)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
                    return false;
                } else if (!C87412m.m108589b(this.f290243b, cVar.f290243b)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
                    return false;
                } else {
                    C98986a aVar = this.f290244c;
                    C98986a aVar2 = cVar.f290244c;
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
                    return aVar == aVar2;
                }
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            int hashCode = this.f290242a.hashCode() * 31;
            String str = this.f290243b;
            int hashCode2 = ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f290244c.hashCode();
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return hashCode2;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            String str = "VideoResult(mediaId=" + this.f290242a + ", filePath=" + this.f290243b + ", state=" + this.f290244c + ')';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$VideoResult");
            return str;
        }
    }

    /* renamed from: jq2.g$d */
    public static final class C98989d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f290245d;

        /* renamed from: e */
        public final /* synthetic */ C96983o3 f290246e;

        public C98989d(C101804kv2 kv22, C96983o3 o3Var) {
            this.f290245d = kv22;
            this.f290246e = o3Var;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$2");
            C94866e1.Vx0().mo130979d(this.f290245d, 4, (C102268v) null, this.f290246e);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getSightDownloadFlow$2");
        }
    }

    /* renamed from: jq2.g$f */
    public static final class C98990f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101804kv2 f290247d;

        /* renamed from: e */
        public final /* synthetic */ C96983o3 f290248e;

        public C98990f(C101804kv2 kv22, C96983o3 o3Var) {
            this.f290247d = kv22;
            this.f290248e = o3Var;
        }

        public final void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$triggerDownloadMediaSight$2");
            C94866e1.Vx0().mo130979d(this.f290247d, 4, (C102268v) null, this.f290248e);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$triggerDownloadMediaSight$2");
        }
    }

    /* renamed from: b */
    public static final C58087u0<C98987b> m128891b(String str) {
        String str2;
        String str3;
        C58087u0<C98987b> u0Var;
        SnsMethodCalculate.markStartTimeMs("getThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        C87412m.m108594g(str, "cacheName");
        Map<String, C58087u0<C98987b>> map = f290231b;
        synchronized (map) {
            try {
                if (!map.containsKey(str) || ((LinkedHashMap) map).get(str) == null) {
                    map.put(str, C58056k1.m67214a(null));
                    Object obj = ((LinkedHashMap) map).get(str);
                    C87412m.m108591d(obj);
                    u0Var = (C58087u0) obj;
                } else {
                    Object obj2 = ((LinkedHashMap) map).get(str);
                    C87412m.m108591d(obj2);
                    u0Var = (C58087u0) obj2;
                }
            } finally {
                str2 = "getThumbDownloadChannelById";
                str3 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper";
                SnsMethodCalculate.markEndTimeMs(str2, str3);
            }
        }
        return u0Var;
    }

    /* renamed from: c */
    public static final C58087u0<C98988c> m128892c(String str) {
        String str2;
        String str3;
        C58087u0<C98988c> u0Var;
        SnsMethodCalculate.markStartTimeMs("getVideoDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        C87412m.m108594g(str, "mediaId");
        Map<String, C58087u0<C98988c>> map = f290232c;
        synchronized (map) {
            try {
                if (!map.containsKey(str) || ((LinkedHashMap) map).get(str) == null) {
                    map.put(str, C58056k1.m67214a(null));
                    Object obj = ((LinkedHashMap) map).get(str);
                    C87412m.m108591d(obj);
                    u0Var = (C58087u0) obj;
                } else {
                    Object obj2 = ((LinkedHashMap) map).get(str);
                    C87412m.m108591d(obj2);
                    u0Var = (C58087u0) obj2;
                }
            } finally {
                str2 = "getVideoDownloadChannelById";
                str3 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper";
                SnsMethodCalculate.markEndTimeMs(str2, str3);
            }
        }
        return u0Var;
    }

    /* renamed from: d */
    public static final void m128893d(String str) {
        String str2;
        String str3;
        SnsMethodCalculate.markStartTimeMs("removeThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("removeThumbDownloadChannelById", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return;
        }
        Map<String, C58087u0<C98987b>> map = f290231b;
        synchronized (map) {
            try {
                C58087u0 remove = map.remove(str);
            } finally {
                str2 = "removeThumbDownloadChannelById";
                str3 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper";
                SnsMethodCalculate.markEndTimeMs(str2, str3);
            }
        }
    }

    /* renamed from: e */
    public static final void m128894e(String str, C98987b bVar) {
        String str2;
        String str3;
        SnsMethodCalculate.markStartTimeMs("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (str == null) {
            SnsMethodCalculate.markEndTimeMs("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        } else if (bVar == null) {
            SnsMethodCalculate.markEndTimeMs("setThumbDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        } else {
            Set<String> set = f290233d;
            synchronized (set) {
                try {
                    boolean contains = set.contains(str);
                    if (contains) {
                        m128891b(str).setValue(bVar);
                    }
                    Log.m105918d("AdMediaDownloadHelper", "setThumbDownloadValue() called with: mediaId = " + str + ", contains = " + contains);
                    C13598b0 b0Var = C13598b0.f38549a;
                } finally {
                    str2 = "setThumbDownloadValue";
                    str3 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper";
                    SnsMethodCalculate.markEndTimeMs(str2, str3);
                }
            }
        }
    }

    /* renamed from: a */
    public final C45252f<C98988c> mo138342a(SnsInfo snsInfo, C94901o oVar, C101804kv2 kv22, C96983o3 o3Var) {
        String str;
        SnsMethodCalculate.markStartTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        boolean z = false;
        if (oVar == null) {
            C20380j jVar = new C20380j(new C98988c[0]);
            SnsMethodCalculate.markEndTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return jVar;
        } else if (kv22 == null) {
            C20380j jVar2 = new C20380j(new C98988c[0]);
            SnsMethodCalculate.markEndTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return jVar2;
        } else {
            kv22.f298681N = true;
            C99556n.m129940c(snsInfo, kv22);
            Set<String> set = f290234e;
            synchronized (set) {
                try {
                    String str2 = kv22.f298689d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    set.add(str2);
                } catch (Throwable th) {
                    SnsMethodCalculate.markEndTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                    throw th;
                }
            }
            String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
            C87412m.m108593f(e, "getMediaFilePath(SnsCore…etAccSnsPath(), media.Id)");
            String T = C102236a0.m134725T(kv22);
            C87412m.m108593f(T, "getSnsSightName(media)");
            if (C86013q1.m106450k(e + T)) {
                str = e + T;
            } else {
                str = null;
            }
            if (str == null || C112551y.m153811k(str)) {
                z = true;
            }
            if (!z) {
                String str3 = kv22.f298689d;
                C87412m.m108593f(str3, "media.Id");
                C58054k kVar = new C58054k(new C98988c(str3, str, C98986a.RESULT_STATE_COMPLETE));
                SnsMethodCalculate.markEndTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                return kVar;
            }
            String str4 = kv22.f298689d;
            C87412m.m108593f(str4, "media.Id");
            m128892c(str4).setValue(null);
            Log.m105924i("AdMediaDownloadHelper", "down load sight is " + kv22.f298689d + " url: " + kv22.f298692g);
            C94866e1.ly0().postDelayed(new C98989d(kv22, o3Var), 0);
            String str5 = kv22.f298689d;
            C87412m.m108593f(str5, "media.Id");
            C58078q qVar = new C58078q(new C58054k(new C98988c(str5, (String) null, C98986a.RESULT_STATE_DOWNLOADING)), new C60888e(kv22, (C15601d<? super C60888e>) null));
            SnsMethodCalculate.markEndTimeMs("getSightDownloadFlow", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
            return qVar;
        }
    }

    /* renamed from: f */
    public final void mo138343f(SnsInfo snsInfo, C101804kv2 kv22, C96983o3 o3Var) {
        String str;
        String str2;
        String str3;
        SnsMethodCalculate.markStartTimeMs("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (kv22 == null) {
            SnsMethodCalculate.markEndTimeMs("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        } else if (snsInfo == null) {
            SnsMethodCalculate.markEndTimeMs("triggerDownloadMediaSight", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        } else {
            boolean z = true;
            kv22.f298681N = true;
            Set<String> set = f290234e;
            synchronized (set) {
                try {
                    String str4 = kv22.f298689d;
                    if (str4 == null) {
                        str4 = "";
                    }
                    set.add(str4);
                } finally {
                    str = "triggerDownloadMediaSight";
                    str2 = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper";
                    SnsMethodCalculate.markEndTimeMs(str, str2);
                }
            }
            C99556n.m129940c(snsInfo, kv22);
            String e = C94938q1.m120518e(C94866e1.m120262YO(), kv22.f298689d);
            C87412m.m108593f(e, "getMediaFilePath(SnsCore…etAccSnsPath(), media.Id)");
            String T = C102236a0.m134725T(kv22);
            C87412m.m108593f(T, "getSnsSightName(media)");
            if (C86013q1.m106450k(e + T)) {
                str3 = e + T;
            } else {
                str3 = null;
            }
            if (str3 != null && !C112551y.m153811k(str3)) {
                z = false;
            }
            if (z) {
                C94866e1.ly0().postDelayed(new C98990f(kv22, o3Var), 0);
            }
        }
    }
}
