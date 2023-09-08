package zr2;

import android.os.HandlerThread;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.LruCache;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import de3.C75359b0;
import de3.C75369r;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60197r4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o40.C61926c;
import oa1.C117731d;
import rx3.C13598b0;
import wd3.C53155r0;
import y04.C66483g;
import z04.C112551y;
import z04.C39297e;
import z04.C66716g;
import z04.C66723k;

/* renamed from: zr2.a */
public final class C66976a {

    /* renamed from: a */
    public static final C66976a f192427a = new C66976a();

    /* renamed from: b */
    public static final LruCache<String, C16399c> f192428b = new LruCache<>(100);

    /* renamed from: c */
    public static final Object f192429c = new Object();

    /* renamed from: d */
    public static final HashMap<String, C60197r4.C33073b> f192430d = new HashMap<>();

    /* renamed from: e */
    public static HandlerThread f192431e;

    /* renamed from: f */
    public static MMHandler f192432f;

    /* renamed from: g */
    public static final Object f192433g = new Object();

    /* renamed from: h */
    public static C66723k f192434h = new C66723k("");

    /* renamed from: i */
    public static final MStorage.IOnStorageChange f192435i = C66980e.f192440d;

    /* renamed from: zr2.a$b */
    public static final class C16398b extends C75359b0 {

        /* renamed from: d */
        public final String f43801d;

        /* renamed from: e */
        public C32226l<? super String, C13598b0> f43802e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16398b(String str, int i) {
            super(i, (C53155r0) null);
            C87412m.m108594g(str, "keyword");
            this.f43801d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/sns/keywords/SnsKeywordMatcher$KeywordClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
            SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
            C87412m.m108594g(view, "widget");
            C32226l<? super String, C13598b0> lVar = this.f43802e;
            if (lVar != null) {
                lVar.invoke(this.f43801d);
            }
            SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
            C117292a.m165361g(this, "com/tencent/mm/plugin/sns/keywords/SnsKeywordMatcher$KeywordClickableSpan", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zr2.a$c */
    public static final class C16399c {

        /* renamed from: a */
        public final String f43803a;

        /* renamed from: b */
        public final ArrayList<C66977a> f43804b;

        public C16399c(String str, ArrayList<C66977a> arrayList) {
            C87412m.m108594g(str, "content");
            C87412m.m108594g(arrayList, "contentMatchList");
            this.f43803a = str;
            this.f43804b = arrayList;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
                return true;
            } else if (!(obj instanceof C16399c)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
                return false;
            } else {
                C16399c cVar = (C16399c) obj;
                if (!C87412m.m108589b(this.f43803a, cVar.f43803a)) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
                    return false;
                }
                boolean b = C87412m.m108589b(this.f43804b, cVar.f43804b);
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
                return b;
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            int hashCode = (this.f43803a.hashCode() * 31) + this.f43804b.hashCode();
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            return hashCode;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            String str = "SnsInfoMatchResult(content=" + this.f43803a + ", contentMatchList=" + this.f43804b + ')';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            return str;
        }
    }

    /* renamed from: zr2.a$g */
    public static final class C16400g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a f43805d;

        public C16400g(C32224a aVar) {
            this.f43805d = aVar;
        }

        public final /* synthetic */ void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$sam$java_lang_Runnable$0");
            this.f43805d.invoke();
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$sam$java_lang_Runnable$0");
        }
    }

    /* renamed from: zr2.a$a */
    public static final class C66977a {

        /* renamed from: a */
        public final int f192436a;

        /* renamed from: b */
        public final int f192437b;

        /* renamed from: c */
        public final String f192438c;

        public C66977a(int i, int i2, String str) {
            C87412m.m108594g(str, "keyword");
            this.f192436a = i;
            this.f192437b = i2;
            this.f192438c = str;
        }

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            if (this == obj) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                return true;
            } else if (!(obj instanceof C66977a)) {
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                return false;
            } else {
                C66977a aVar = (C66977a) obj;
                if (this.f192436a != aVar.f192436a) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    return false;
                } else if (this.f192437b != aVar.f192437b) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    return false;
                } else {
                    boolean b = C87412m.m108589b(this.f192438c, aVar.f192438c);
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    return b;
                }
            }
        }

        public int hashCode() {
            SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            int hashCode = (((this.f192436a * 31) + this.f192437b) * 31) + this.f192438c.hashCode();
            SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            return hashCode;
        }

        public String toString() {
            SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            String str = "ContentMatchResult(startPos=" + this.f192436a + ", endPos=" + this.f192437b + ", keyword=" + this.f192438c + ')';
            SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
            return str;
        }
    }

    /* renamed from: zr2.a$d */
    public static final class C66978d implements C60197r4.C33072a {

        /* renamed from: zr2.a$d$a */
        public static final class C66979a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public static final C66979a f192439d = new C66979a();

            public C66979a() {
                super(0);
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1$onDone$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1$onDone$2");
                C66976a.m79132c();
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1$onDone$2");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1$onDone$2");
                return b0Var;
            }
        }

        public void onDone(List<C60197r4.C33073b> list) {
            String str;
            Object obj;
            String str2 = "onDone";
            SnsMethodCalculate.markStartTimeMs(str2, "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1");
            C87412m.m108594g(list, "dataList");
            if (Util.isNullOrNil((List) list)) {
                Log.m105920e("MicroMsg.SnsKeywordMatcher", "loadFinderKeywords callback no data.");
                SnsMethodCalculate.markEndTimeMs(str2, "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1");
                return;
            }
            long j = (long) 1000;
            long currentTimeMillis = System.currentTimeMillis() / j;
            Iterator<T> it = list.iterator();
            long j2 = currentTimeMillis;
            long j3 = j2;
            while (it.hasNext()) {
                C60197r4.C33073b bVar = (C60197r4.C33073b) it.next();
                int i = bVar.f89797b;
                Iterator<T> it4 = it;
                if (currentTimeMillis < ((long) i)) {
                    if (j2 < ((long) i)) {
                        j2 = (long) i;
                    }
                } else if (currentTimeMillis < ((long) bVar.f89798c)) {
                    C66976a.m79130a().put(bVar.f89799d, bVar);
                    int i2 = bVar.f89798c;
                    if (j3 < ((long) i2)) {
                        j3 = (long) i2;
                    }
                }
                List<C60197r4.C33073b> list2 = list;
                it = it4;
            }
            Log.m105924i("MicroMsg.SnsKeywordMatcher", "loadFinderKeywords done. dataList size:" + list.size() + ", keywordsHashMap size:" + C66976a.m79130a().size() + ", minStartTime:" + j2 + ", minEndTime:" + j3);
            if (C66976a.m79130a() == null || C66976a.m79130a().size() <= 0) {
                str = str2;
            } else {
                C66976a aVar = C66976a.f192427a;
                SnsMethodCalculate.markStartTimeMs("access$buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                SnsMethodCalculate.markStartTimeMs("buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                String pattern = C75369r.f221604t.toString();
                Iterator<Map.Entry<String, C60197r4.C33073b>> it5 = C66976a.f192430d.entrySet().iterator();
                boolean z = true;
                Object obj2 = "";
                while (it5.hasNext()) {
                    Map.Entry next = it5.next();
                    if (z) {
                        z = false;
                        obj = next.getKey();
                    } else {
                        Iterator<Map.Entry<String, C60197r4.C33073b>> it6 = it5;
                        StringBuilder sb = new StringBuilder();
                        String str3 = str2;
                        sb.append((String) obj2);
                        sb.append('|');
                        Object obj3 = sb.toString() + ((String) next.getKey());
                        it5 = it6;
                        str2 = str3;
                        obj = obj3;
                    }
                    obj2 = obj;
                }
                str = str2;
                C66976a.f192434h = new C66723k(String.valueOf(pattern + "|(" + ((String) obj2) + ')'));
                StringBuilder sb4 = new StringBuilder();
                sb4.append("finished build keywords keywordRegexs:");
                sb4.append(C66976a.f192434h);
                Log.m105924i("MicroMsg.SnsKeywordMatcher", sb4.toString());
                SnsMethodCalculate.markEndTimeMs("buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                SnsMethodCalculate.markEndTimeMs("access$buildKeywordsRegex", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            }
            if (j2 <= currentTimeMillis) {
                j2 = j3;
            } else if (j3 > currentTimeMillis) {
                j2 = Math.min(j2, j3);
            }
            if (j2 > currentTimeMillis) {
                C66979a aVar2 = C66979a.f192439d;
                SnsMethodCalculate.markStartTimeMs("access$queue", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                C66976a.f192427a.mo90948e((j2 - currentTimeMillis) * j, aVar2);
                SnsMethodCalculate.markEndTimeMs("access$queue", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            }
            SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$loadFinderKeywords$1");
        }
    }

    /* renamed from: zr2.a$e */
    public static final class C66980e implements MStorage.IOnStorageChange {

        /* renamed from: d */
        public static final C66980e f192440d = new C66980e();

        public final void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            SnsMethodCalculate.markStartTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$onStorageChange$1");
            Log.m105924i("MicroMsg.SnsKeywordMatcher", "receive SnsKeyWordsStorage change, reload data.");
            C66976a.m79132c();
            SnsMethodCalculate.markEndTimeMs("onNotifyChange", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$onStorageChange$1");
        }
    }

    /* renamed from: zr2.a$f */
    public static final class C66981f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f192441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66981f(String str) {
            super(0);
            this.f192441d = str;
        }

        public Object invoke() {
            LruCache<String, C16399c> lruCache;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
            String str = this.f192441d;
            if (str != null) {
                C66976a aVar = C66976a.f192427a;
                SnsMethodCalculate.markStartTimeMs("access$matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                SnsMethodCalculate.markStartTimeMs("matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                long currentTicks = Util.currentTicks();
                C16399c cVar = new C16399c(str, new ArrayList());
                C66483g.C66484a aVar2 = new C66483g.C66484a((C66483g) C66723k.m78722b(C66976a.f192434h, str, 0, 2, (Object) null));
                while (aVar2.hasNext()) {
                    C66716g gVar = (C66716g) aVar2.next();
                    if (gVar.mo90751a() != null && gVar.mo90751a().size() > 1) {
                        C39297e eVar = gVar.mo90751a().get(1);
                        if (C112551y.m153810j(eVar != null ? eVar.f105665a : null, gVar.getValue(), false, 2, (Object) null)) {
                            Log.m105918d("MicroMsg.SnsKeywordMatcher", "skip topic match, range:" + gVar.mo90753c() + ", keyword:" + gVar.getValue());
                        }
                    }
                    SnsMethodCalculate.markStartTimeMs("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
                    ArrayList<C66977a> arrayList = cVar.f43804b;
                    SnsMethodCalculate.markEndTimeMs("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
                    arrayList.add(new C66977a(gVar.mo90753c().f175174d, gVar.mo90753c().f175175e, gVar.getValue()));
                    Log.m105918d("MicroMsg.SnsKeywordMatcher", "match range:" + gVar.mo90753c() + ", keyword:" + gVar.getValue());
                }
                synchronized (C66976a.f192429c) {
                    try {
                        lruCache = C66976a.f192428b;
                        C16399c put = lruCache.put(str, cVar);
                    } catch (Throwable th) {
                        SnsMethodCalculate.markEndTimeMs("matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                        throw th;
                    }
                }
                Log.m105918d("MicroMsg.SnsKeywordMatcher", "matchContent cost:" + Util.ticksToNow(currentTicks) + ", cacheSize:" + lruCache.size() + ' ' + str);
                SnsMethodCalculate.markEndTimeMs("matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                SnsMethodCalculate.markEndTimeMs("access$matchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$putMatchContent$1");
            return b0Var;
        }
    }

    /* renamed from: zr2.a$h */
    public static final class C66982h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C66982h f192442d = new C66982h();

        public C66982h() {
            super(0);
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
            if (r2 != null) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r5 = this;
                java.lang.String r0 = "invoke"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$stop$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.lang.String r0 = "invoke"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$stop$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                android.os.HandlerThread r0 = zr2.C66976a.m79131b()
                if (r0 != 0) goto L_0x0022
                java.lang.String r0 = "access$getSpanHandler$p"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                com.tencent.mm.sdk.platformtools.MMHandler r2 = zr2.C66976a.f192432f
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                if (r2 == 0) goto L_0x00b1
            L_0x0022:
                java.lang.String r0 = "access$getThreadCreateLock$p"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                java.lang.Object r2 = zr2.C66976a.f192433g
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                monitor-enter(r2)
                java.lang.Class<ht1.r4> r0 = ht1.C60197r4.class
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x00c2 }
                ht1.r4 r0 = (ht1.C60197r4) r0     // Catch:{ all -> 0x00c2 }
                if (r0 == 0) goto L_0x004a
                zr2.a r1 = zr2.C66976a.f192427a     // Catch:{ all -> 0x00c2 }
                java.lang.String r1 = "getOnStorageChange"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)     // Catch:{ all -> 0x00c2 }
                com.tencent.mm.sdk.storage.MStorage$IOnStorageChange r4 = zr2.C66976a.f192435i     // Catch:{ all -> 0x00c2 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)     // Catch:{ all -> 0x00c2 }
                r0.mo57051g(r4)     // Catch:{ all -> 0x00c2 }
            L_0x004a:
                java.lang.String r0 = "access$getSpanHandler$p"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch:{ all -> 0x00c2 }
                com.tencent.mm.sdk.platformtools.MMHandler r3 = zr2.C66976a.f192432f     // Catch:{ all -> 0x00c2 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x00c2 }
                r0 = 0
                if (r3 == 0) goto L_0x005c
                r3.removeCallbacksAndMessages(r0)     // Catch:{ all -> 0x00c2 }
            L_0x005c:
                android.os.HandlerThread r1 = zr2.C66976a.m79131b()     // Catch:{ all -> 0x00c2 }
                if (r1 == 0) goto L_0x0065
                r1.quitSafely()     // Catch:{ all -> 0x00c2 }
            L_0x0065:
                java.lang.String r1 = "access$setSpanThread$p"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)     // Catch:{ all -> 0x00c2 }
                zr2.C66976a.f192431e = r0     // Catch:{ all -> 0x00c2 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)     // Catch:{ all -> 0x00c2 }
                java.lang.String r1 = "access$setSpanHandler$p"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)     // Catch:{ all -> 0x00c2 }
                zr2.C66976a.f192432f = r0     // Catch:{ all -> 0x00c2 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)     // Catch:{ all -> 0x00c2 }
                java.lang.String r0 = "access$getMatchCache$p"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)     // Catch:{ all -> 0x00c2 }
                com.tencent.mm.sdk.platformtools.LruCache<java.lang.String, zr2.a$c> r3 = zr2.C66976a.f192428b     // Catch:{ all -> 0x00c2 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)     // Catch:{ all -> 0x00c2 }
                r3.evictAll()     // Catch:{ all -> 0x00c2 }
                java.util.HashMap r0 = zr2.C66976a.m79130a()     // Catch:{ all -> 0x00c2 }
                r0.clear()     // Catch:{ all -> 0x00c2 }
                z04.k r0 = new z04.k     // Catch:{ all -> 0x00c2 }
                java.lang.String r1 = ""
                r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x00c2 }
                java.lang.String r1 = "access$setKeywordRegexs$p"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r3)     // Catch:{ all -> 0x00c2 }
                zr2.C66976a.f192434h = r0     // Catch:{ all -> 0x00c2 }
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r3)     // Catch:{ all -> 0x00c2 }
                java.lang.String r0 = "MicroMsg.SnsKeywordMatcher"
                java.lang.String r1 = "stop"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00c2 }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00c2 }
                monitor-exit(r2)
            L_0x00b1:
                java.lang.String r0 = "invoke"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$stop$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                java.lang.String r1 = "invoke"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$stop$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r0
            L_0x00c2:
                r0 = move-exception
                monitor-exit(r2)
                java.lang.String r1 = "invoke"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$stop$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zr2.C66976a.C66982h.invoke():java.lang.Object");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ HashMap m79130a() {
        SnsMethodCalculate.markStartTimeMs("access$getKeywordsHashMap$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        HashMap<String, C60197r4.C33073b> hashMap = f192430d;
        SnsMethodCalculate.markEndTimeMs("access$getKeywordsHashMap$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        return hashMap;
    }

    /* renamed from: b */
    public static final /* synthetic */ HandlerThread m79131b() {
        SnsMethodCalculate.markStartTimeMs("access$getSpanThread$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        HandlerThread handlerThread = f192431e;
        SnsMethodCalculate.markEndTimeMs("access$getSpanThread$p", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        return handlerThread;
    }

    /* renamed from: c */
    public static final void m79132c() {
        SnsMethodCalculate.markStartTimeMs("loadFinderKeywords", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        f192430d.clear();
        f192428b.evictAll();
        f192434h = new C66723k("");
        C60197r4 r4Var = (C60197r4) C86312j.m106911c(C60197r4.class);
        if (r4Var != null) {
            r4Var.ix0(new C66978d());
        }
        SnsMethodCalculate.markEndTimeMs("loadFinderKeywords", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
    }

    /* renamed from: d */
    public static final void m79133d(String str) {
        C66723k kVar;
        SnsMethodCalculate.markStartTimeMs("putMatchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        if (!Util.isNullOrNil(str) && (kVar = f192434h) != null) {
            String pattern = kVar.f191762d.pattern();
            C87412m.m108593f(pattern, "nativePattern.pattern()");
            if (!Util.isNullOrNil(pattern)) {
                if (f192428b.get(str) == null) {
                    C66976a aVar = f192427a;
                    C66981f fVar = new C66981f(str);
                    SnsMethodCalculate.markStartTimeMs("queue$default", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    aVar.mo90948e(0, fVar);
                    SnsMethodCalculate.markEndTimeMs("queue$default", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                }
                SnsMethodCalculate.markEndTimeMs("putMatchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                return;
            }
        }
        SnsMethodCalculate.markEndTimeMs("putMatchContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
    }

    /* renamed from: f */
    public static final CharSequence m79134f(long j, CharSequence charSequence, int i, int i2) {
        C16399c cVar;
        long j2;
        SpannableStringBuilder spannableStringBuilder = charSequence;
        SnsMethodCalculate.markStartTimeMs("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        C87412m.m108594g(spannableStringBuilder, "content");
        LruCache<String, C16399c> lruCache = f192428b;
        if (lruCache == null || lruCache.size() <= 0) {
            SnsMethodCalculate.markEndTimeMs("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            return spannableStringBuilder;
        }
        boolean z = false;
        boolean z2 = true;
        if (Util.getInt(C117731d.m166007c().mo182444f("clicfg_sns_keyword", "0", false, true), 0) <= 0) {
            Log.m105920e("MicroMsg.SnsKeywordMatcher", "switch close.");
            m79135g();
            SnsMethodCalculate.markEndTimeMs("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
            return spannableStringBuilder;
        }
        long currentTicks = Util.currentTicks();
        synchronized (f192429c) {
            try {
                cVar = lruCache.get(charSequence.toString());
            } catch (Throwable th) {
                SnsMethodCalculate.markEndTimeMs("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                throw th;
            }
        }
        if (cVar != null) {
            SnsMethodCalculate.markStartTimeMs("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            ArrayList<C66977a> arrayList = cVar.f43804b;
            SnsMethodCalculate.markEndTimeMs("getContentMatchList", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$SnsInfoMatchResult");
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (!arrayList2.isEmpty()) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C66977a aVar = (C66977a) it.next();
                    aVar.getClass();
                    SnsMethodCalculate.markStartTimeMs("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    String str = aVar.f192438c;
                    SnsMethodCalculate.markEndTimeMs("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    SnsMethodCalculate.markStartTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    int i3 = aVar.f192436a;
                    SnsMethodCalculate.markEndTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    SnsMethodCalculate.markStartTimeMs("buildKeywordSpan", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    C16398b bVar = new C16398b(str, i2);
                    C8478d0 d0Var = new C8478d0();
                    String topActivityName = Util.getTopActivityName(MMApplicationContext.getContext());
                    if (!Util.isNullOrNil(topActivityName)) {
                        if (C112551y.m153809i(topActivityName, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI", z2)) {
                            d0Var.f27483d = z2 ? 1 : 0;
                        } else if (C112551y.m153809i(topActivityName, "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI", z2)) {
                            d0Var.f27483d = 2;
                        }
                    }
                    Iterator it4 = it;
                    MMHandler my02 = C94866e1.my0();
                    C26712b bVar2 = r8;
                    C8478d0 d0Var2 = d0Var;
                    long j3 = currentTicks;
                    C16398b bVar3 = bVar;
                    C26712b bVar4 = new C26712b(j, i, str, i3, d0Var2);
                    my02.post(bVar2);
                    C66983d dVar = new C66983d(j, i, i3, d0Var2);
                    SnsMethodCalculate.markStartTimeMs("setCallBack", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
                    bVar3.f43802e = dVar;
                    SnsMethodCalculate.markEndTimeMs("setCallBack", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$KeywordClickableSpan");
                    SnsMethodCalculate.markEndTimeMs("buildKeywordSpan", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                    SnsMethodCalculate.markStartTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    int i4 = aVar.f192436a;
                    SnsMethodCalculate.markEndTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    SnsMethodCalculate.markStartTimeMs("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    int i5 = aVar.f192437b;
                    SnsMethodCalculate.markEndTimeMs("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    spannableStringBuilder2.setSpan(bVar3, i4, i5 + 1, 18);
                    StringBuilder sb = new StringBuilder();
                    sb.append("setSpan:[");
                    SnsMethodCalculate.markStartTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    int i6 = aVar.f192436a;
                    SnsMethodCalculate.markEndTimeMs("getStartPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    sb.append(i6);
                    sb.append(", ");
                    SnsMethodCalculate.markStartTimeMs("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    int i7 = aVar.f192437b;
                    SnsMethodCalculate.markEndTimeMs("getEndPos", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    sb.append(i7);
                    sb.append("], keyWord:");
                    SnsMethodCalculate.markStartTimeMs("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    String str2 = aVar.f192438c;
                    SnsMethodCalculate.markEndTimeMs("getKeyword", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher$ContentMatchResult");
                    sb.append(str2);
                    Log.m105918d("MicroMsg.SnsKeywordMatcher", sb.toString());
                    it = it4;
                    currentTicks = j3;
                    z = true;
                    z2 = true;
                }
                j2 = currentTicks;
                spannableStringBuilder = spannableStringBuilder2;
                Log.m105918d("MicroMsg.SnsKeywordMatcher", "spanContent cost:" + Util.ticksToNow(j2) + ", spanned:" + z);
                SnsMethodCalculate.markEndTimeMs("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
                return spannableStringBuilder;
            }
        }
        j2 = currentTicks;
        Log.m105918d("MicroMsg.SnsKeywordMatcher", "spanContent cost:" + Util.ticksToNow(j2) + ", spanned:" + z);
        SnsMethodCalculate.markEndTimeMs("spanContent", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        return spannableStringBuilder;
    }

    /* renamed from: g */
    public static final void m79135g() {
        SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
        C61926c.m72658C((String) null, C66982h.f192442d, 1, (Object) null);
        SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if ((r1 != null && r1.isAlive()) != false) goto L_0x0022;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90948e(long r5, fy3.C32224a<rx3.C13598b0> r7) {
        /*
            r4 = this;
            java.lang.String r0 = "queue"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.Object r0 = f192433g
            monitor-enter(r0)
            com.tencent.mm.sdk.platformtools.MMHandler r1 = f192432f     // Catch:{ all -> 0x004b }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0021
            android.os.HandlerThread r1 = f192431e     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x001d
            boolean r1 = r1.isAlive()     // Catch:{ all -> 0x004b }
            if (r1 != r2) goto L_0x001d
            r1 = 1
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r1 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r2 = 0
        L_0x0022:
            monitor-exit(r0)
            if (r2 != 0) goto L_0x0036
            java.lang.String r5 = "MicroMsg.SnsKeywordMatcher"
            java.lang.String r6 = "queue thread already release"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r6)
            java.lang.String r5 = "queue"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x0036:
            com.tencent.mm.sdk.platformtools.MMHandler r0 = f192432f
            if (r0 == 0) goto L_0x0042
            zr2.a$g r1 = new zr2.a$g
            r1.<init>(r7)
            r0.postDelayed(r1, r5)
        L_0x0042:
            java.lang.String r5 = "queue"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
            return
        L_0x004b:
            r5 = move-exception
            monitor-exit(r0)
            java.lang.String r6 = "queue"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.keywords.SnsKeywordMatcher"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zr2.C66976a.mo90948e(long, fy3.a):void");
    }
}
