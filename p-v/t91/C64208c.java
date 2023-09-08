package t91;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sx3.C64197v;
import v91.C22733i;

/* renamed from: t91.c */
public final class C64208c {

    /* renamed from: A */
    public static final List<String> f181934A = new ArrayList();

    /* renamed from: B */
    public static final List<String> f181935B = new ArrayList();

    /* renamed from: C */
    public static final List<String> f181936C = new ArrayList();

    /* renamed from: D */
    public static final List<String> f181937D = new ArrayList();

    /* renamed from: E */
    public static String f181938E;

    /* renamed from: F */
    public static String f181939F;

    /* renamed from: G */
    public static String f181940G;

    /* renamed from: H */
    public static final ArrayList<String> f181941H = C64197v.m75534c("com.tencent.mm.plugin.finder.feed.ui.FinderNewUIB", "com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI", "com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI", "com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI", "com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2", "com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI", "com.tencent.mm.plugin.finder.feed.ui.FinderLbsStreamListUI", "com.tencent.mm.plugin.finder.feed.ui.FinderMultiTaskUI", "com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI", "com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoNewFormUI", "com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI", "com.tencent.mm.plugin.finder.ui.FinderImmersiveFeedUI");

    /* renamed from: I */
    public static final ArrayList<String> f181942I = C64197v.m75534c("com.tencent.mm.plugin.finder.feed.ui.FinderNewUIB", "com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI", "com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI", "com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI", "com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI2", "com.tencent.mm.plugin.finder.feed.ui.FinderMultiTaskUI", "com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI", "com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoNewFormUI", "com.tencent.mm.plugin.finder.feed.ui.FinderHorizontalVideoHalfFeedUI");

    /* renamed from: J */
    public static final ArrayList<String> f181943J = C64197v.m75534c("com.tencent.mm.plugin.finder.ui.fragment.FinderLbsTabFragment", "com.tencent.mm.plugin.finder.feed.ui.FinderNewUIC", "com.tencent.mm.plugin.finder.feed.ui.FinderTimelineLbsUI", "com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI", "com.tencent.mm.plugin.finder.search.FinderMixSearchUI", "com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI", "com.tencent.mm.plugin.finder.feed.ui.FinderFavFeedUI");

    /* renamed from: K */
    public static int f181944K = 1;

    /* renamed from: L */
    public static String f181945L = "";

    /* renamed from: M */
    public static String f181946M = "";

    /* renamed from: N */
    public static HashMap<Long, HashMap<String, String>> f181947N = new HashMap<>();

    /* renamed from: O */
    public static boolean f181948O;

    /* renamed from: P */
    public static ConcurrentHashMap<String, Object> f181949P = new ConcurrentHashMap<>();

    /* renamed from: Q */
    public static final ConcurrentHashMap<String, List<Map<String, Object>>> f181950Q = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static final C64209a f181951a = new C64209a((C8480h) null);

    /* renamed from: b */
    public static boolean f181952b;

    /* renamed from: c */
    public static boolean f181953c;

    /* renamed from: d */
    public static final Map<Integer, Map<String, C22733i>> f181954d = new LinkedHashMap();

    /* renamed from: e */
    public static final Map<String, Map<String, C22733i>> f181955e = new LinkedHashMap();

    /* renamed from: f */
    public static String f181956f;

    /* renamed from: g */
    public static int f181957g;

    /* renamed from: h */
    public static String f181958h = "";

    /* renamed from: i */
    public static String f181959i = "";

    /* renamed from: j */
    public static String f181960j = "";

    /* renamed from: k */
    public static boolean f181961k;

    /* renamed from: l */
    public static boolean f181962l = true;

    /* renamed from: m */
    public static String f181963m = "";

    /* renamed from: n */
    public static long f181964n;

    /* renamed from: o */
    public static String f181965o = "";

    /* renamed from: p */
    public static int f181966p = 1001;

    /* renamed from: q */
    public static String f181967q = "";

    /* renamed from: r */
    public static boolean f181968r;

    /* renamed from: s */
    public static String f181969s = "";

    /* renamed from: t */
    public static String f181970t = "";

    /* renamed from: u */
    public static String f181971u = "";

    /* renamed from: v */
    public static String f181972v = "";

    /* renamed from: w */
    public static String f181973w = "";

    /* renamed from: x */
    public static float f181974x;

    /* renamed from: y */
    public static final List<String> f181975y = new ArrayList();

    /* renamed from: z */
    public static final List<String> f181976z = new ArrayList();

    /* renamed from: t91.c$a */
    public static final class C64209a {
        public C64209a(C8480h hVar) {
        }

        /* renamed from: a */
        public final List<Map<String, Object>> mo89026a(String str) {
            C87412m.m108594g(str, "liveId");
            ArrayList arrayList = new ArrayList();
            ConcurrentHashMap<String, List<Map<String, Object>>> concurrentHashMap = C64208c.f181950Q;
            List list = concurrentHashMap.get(str);
            if (list != null) {
                arrayList.addAll(list);
            }
            concurrentHashMap.remove(str);
            return arrayList;
        }

        /* renamed from: b */
        public final String mo89027b(String str) {
            if (str != null) {
                return C87412m.m108589b(C64208c.f181946M, str) ? C64208c.f181945L : "";
            }
            Log.m105924i("HABBYGE-MALI.HellFinderConfig", "getSnsAdData finderUsername is null");
            return "";
        }

        /* renamed from: c */
        public final boolean mo89028c(long j, String str, Map<String, Object> map, int i) {
            String str2;
            C87412m.m108594g(str, "eventId");
            C87412m.m108594g(map, "params");
            Object obj = map.get("udf_kv");
            C87412m.m108592e(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
            Map map2 = (Map) obj;
            if (map2.get("live_id") != null) {
                Object obj2 = map2.get("live_id");
                C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
                str2 = (String) obj2;
            } else {
                str2 = "";
            }
            if (!C64208c.f181950Q.containsKey(str2)) {
                return false;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("event_time", Long.valueOf(j));
            linkedHashMap.put("event_id", str);
            linkedHashMap.put("event_params", map);
            mo89030e(str2, linkedHashMap);
            return true;
        }

        /* renamed from: d */
        public final void mo89029d(String str, String str2) {
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.DEBUG || WeChatEnvironment.hasDebugger()) {
                Log.printInfoStack(str, str2, new Object[0]);
            } else {
                Log.m105924i(str, str2);
            }
        }

        /* renamed from: e */
        public final void mo89030e(String str, Map<String, Object> map) {
            if (str != null) {
                ConcurrentHashMap<String, List<Map<String, Object>>> concurrentHashMap = C64208c.f181950Q;
                List list = concurrentHashMap.get(str);
                if (list == null) {
                    list = null;
                } else if (map != null) {
                    list.add(map);
                }
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    if (map != null) {
                        arrayList.add(map);
                    }
                    concurrentHashMap.put(str, arrayList);
                }
            }
        }

        /* renamed from: f */
        public final void mo89031f(String str) {
            C87412m.m108594g(str, "liveId");
            C64208c.f181950Q.remove(str);
        }

        /* renamed from: g */
        public final void mo89032g(String str, String str2) {
            if (str == null || str2 == null) {
                C64208c.f181945L = "";
                C64208c.f181946M = "";
                mo89029d("HABBYGE-MALI.HellFinderConfig", "setSnsAdData fail!");
                return;
            }
            C64208c.f181945L = str;
            C64208c.f181946M = str2;
            mo89029d("HABBYGE-MALI.HellFinderConfig", "setSnsAdData, snsAdData=" + C64208c.f181945L + ", snsFinderUsername=" + C64208c.f181946M);
        }

        /* renamed from: h */
        public final void mo89033h(String str, String str2, String str3, String str4, String str5) {
            if (str == null) {
                str = "";
            }
            C64208c.f181969s = str;
            if (str2 == null) {
                str2 = "";
            }
            C64208c.f181970t = str2;
            if (str3 == null) {
                str3 = "";
            }
            C64208c.f181971u = str3;
            if (str4 == null) {
                str4 = "";
            }
            C64208c.f181972v = str4;
            if (str5 == null) {
                str5 = "";
            }
            C64208c.f181973w = str5;
        }

        /* renamed from: i */
        public final Map<String, Object> mo89034i(Map<String, Object> map, int i) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (C87412m.m108589b(next.getKey(), "udf_kv")) {
                        Object value = next.getValue();
                        C87412m.m108592e(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                        linkedHashMap2.putAll((Map) value);
                        linkedHashMap2.put("live_enter_status", Integer.valueOf(i));
                        linkedHashMap.put(next.getKey(), linkedHashMap2);
                    } else {
                        linkedHashMap.put(next.getKey(), next.getValue());
                    }
                }
            }
            return linkedHashMap;
        }
    }

    /* renamed from: t91.c$b */
    public enum C64210b {
        VISIABLE_ON_SCROLL(0),
        INVISIABLE_ON_SCROLL(1),
        VISIABLE_ON_RESUME(2),
        INVISIABLE_ON_PAUSE(3),
        EVENT_ON_DESTROY(4);

        /* access modifiers changed from: public */
        C64210b(int i) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m75547a(java.lang.String r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            goto L_0x0050
        L_0x0004:
            java.lang.String r1 = "."
            boolean r1 = z04.C112550d0.m153801u(r3, r1, r0)
            r2 = 1
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = "com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment"
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment"
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "com.tencent.mm.plugin.finder.ui.fragment.FinderLbsTabFragment"
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment"
            boolean r3 = gy3.C87412m.m108589b(r1, r3)
            if (r3 == 0) goto L_0x0050
        L_0x002d:
            r0 = 1
            goto L_0x0050
        L_0x002f:
            java.lang.String r1 = "FinderFollowTabFragment"
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "FinderFriendTabFragment"
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "FinderLbsTabFragment"
            boolean r1 = gy3.C87412m.m108589b(r1, r3)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "FinderMachineTabFragment"
            boolean r3 = gy3.C87412m.m108589b(r1, r3)
            if (r3 == 0) goto L_0x0050
            goto L_0x002d
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t91.C64208c.m75547a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public static final void m75548b(String str, Map<String, Object> map) {
        f181951a.mo89030e(str, map);
    }
}
