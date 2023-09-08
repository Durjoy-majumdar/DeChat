package com.tencent.p014mm.plugin.story.model.sync;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import fy3.C32224a;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import hw2.C8826e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kw2.C99264e;
import kw2.C99268i;
import o40.C61926c;
import rx3.C13598b0;
import ux3.C65486b;
import xv2.C102780i;
import xv2.C102781j;
import xv2.C102782k;

/* renamed from: com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher */
public final class ContactSyncFetcher implements C102781j, MStorage.IOnStorageChange {

    /* renamed from: d */
    public static final ContactSyncFetcher f281758d = new ContactSyncFetcher();

    /* renamed from: e */
    public static final Map<String, C99264e> f281759e = Collections.synchronizedMap(new ConcurrentHashMap());

    /* renamed from: f */
    public static final Map<String, C8826e> f281760f = Collections.synchronizedMap(new ConcurrentHashMap());

    /* renamed from: g */
    public static final List<String> f281761g = Collections.synchronizedList(new LinkedList());

    /* renamed from: h */
    public static final List<String> f281762h = Collections.synchronizedList(new LinkedList());

    /* renamed from: i */
    public static final List<String> f281763i = Collections.synchronizedList(new LinkedList());

    /* renamed from: j */
    public static final List<C102782k> f281764j = Collections.synchronizedList(new LinkedList());

    /* renamed from: n */
    public static final LinkedList<C102780i> f281765n = new LinkedList<>();

    /* renamed from: o */
    public static final ContactSyncFetcher$snsPermissionNotifyListener$1 f281766o = new ContactSyncFetcher$snsPermissionNotifyListener$1(C40008f.f107254d);

    /* renamed from: p */
    public static final C32229r<Long, Boolean, String, String, C13598b0> f281767p = C96342e.f281771d;

    /* renamed from: com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$a */
    public static final class C96338a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C96338a f281768d = new C96338a();

        public C96338a() {
            super(0);
        }

        public Object invoke() {
            ContactSyncFetcher.m123593j(ContactSyncFetcher.f281758d);
            C61926c.m72668M(C96343a.f281772d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$b */
    public static final class C96339b<T> implements Comparator {
        public final int compare(T t, T t2) {
            return C65486b.m77169a(Long.valueOf(((C99264e) t2).field_readTime), Long.valueOf(((C99264e) t).field_readTime));
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$c */
    public static final class C96340c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C96340c f281769d = new C96340c();

        public C96340c() {
            super(0);
        }

        public Object invoke() {
            ContactSyncFetcher.m123593j(ContactSyncFetcher.f281758d);
            C61926c.m72668M(C96344b.f281773d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$d */
    public static final class C96341d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ MStorageEventData f281770d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96341d(MStorageEventData mStorageEventData) {
            super(0);
            this.f281770d = mStorageEventData;
        }

        public Object invoke() {
            Object obj = this.f281770d.obj;
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryInfo");
            String str = ((C99268i) obj).field_userName;
            Object obj2 = this.f281770d.obj;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryInfo");
            long j = ((C99268i) obj2).field_storyID;
            ContactSyncFetcher contactSyncFetcher = ContactSyncFetcher.f281758d;
            Log.m105924i("MicroMsg.ContactSyncFetcher", "[StoryInfo] onNotifyChange: " + str + ' ' + j);
            C8826e eVar = ContactSyncFetcher.f281760f.get(str);
            if (eVar != null) {
                eVar.getClass();
            }
            ContactSyncFetcher.m123593j(ContactSyncFetcher.f281758d);
            C61926c.m72668M(C96345c.f281774d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$e */
    public static final class C96342e extends C87413o implements C32229r<Long, Boolean, String, String, C13598b0> {

        /* renamed from: d */
        public static final C96342e f281771d = new C96342e();

        public C96342e() {
            super(4);
        }

        /* renamed from: I */
        public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
            long longValue = ((Number) obj).longValue();
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            String str = (String) obj3;
            String str2 = (String) obj4;
            C87412m.m108594g(str, "fromUser");
            C87412m.m108594g(str2, "storyOwner");
            C61926c.m72657B("ContactSyncFetcher_checkContactState", true, new C96347e(longValue, booleanValue, str2, str));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: i */
    public static final void m123592i(ContactSyncFetcher contactSyncFetcher) {
        contactSyncFetcher.getClass();
        for (C102780i a : f281765n) {
            a.mo133941a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x032c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m123593j(com.tencent.p014mm.plugin.story.model.sync.ContactSyncFetcher r21) {
        /*
            java.lang.Class<lc3.b> r0 = lc3.C10485b.class
            monitor-enter(r21)
            java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ all -> 0x03f7 }
            r1.<init>()     // Catch:{ all -> 0x03f7 }
            java.util.Map<java.lang.String, kw2.e> r2 = f281759e     // Catch:{ all -> 0x03f7 }
            java.lang.String r3 = "userStateMap"
            gy3.C87412m.m108593f(r2, r3)     // Catch:{ all -> 0x03f7 }
            monitor-enter(r2)     // Catch:{ all -> 0x03f7 }
            java.util.Set r3 = r2.entrySet()     // Catch:{ all -> 0x03f4 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x03f4 }
        L_0x0019:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x03f4 }
            r5 = 0
            if (r4 == 0) goto L_0x0061
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x03f4 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x03f4 }
            com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher r6 = f281758d     // Catch:{ all -> 0x03f4 }
            java.lang.Object r7 = r4.getKey()     // Catch:{ all -> 0x03f4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x03f4 }
            boolean r6 = r6.mo134204k(r7)     // Catch:{ all -> 0x03f4 }
            if (r6 != 0) goto L_0x0019
            com.tencent.mm.plugin.story.model.StoryCore$h r6 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t     // Catch:{ all -> 0x03f4 }
            java.lang.String r6 = r6.mo134187e()     // Catch:{ all -> 0x03f4 }
            java.lang.Object r7 = r4.getKey()     // Catch:{ all -> 0x03f4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x03f4 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x03f4 }
            java.lang.Object r7 = r4.getValue()     // Catch:{ all -> 0x03f4 }
            java.lang.String r8 = "it.value"
            gy3.C87412m.m108593f(r7, r8)     // Catch:{ all -> 0x03f4 }
            kw2.e r7 = (kw2.C99264e) r7     // Catch:{ all -> 0x03f4 }
            if (r6 == 0) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            boolean r5 = r7.mo138638l2()     // Catch:{ all -> 0x03f4 }
        L_0x0057:
            if (r5 == 0) goto L_0x0019
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x03f4 }
            r1.add(r4)     // Catch:{ all -> 0x03f4 }
            goto L_0x0019
        L_0x0061:
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03f4 }
            monitor-exit(r2)     // Catch:{ all -> 0x03f7 }
            k40.a r2 = f40.C86709a0.m107533q(r0)     // Catch:{ all -> 0x03f7 }
            lc3.b r2 = (lc3.C10485b) r2     // Catch:{ all -> 0x03f7 }
            pj.f r2 = r2.vh0()     // Catch:{ all -> 0x03f7 }
            java.lang.String r3 = "StoryEntranceShouldShowInTimelineOfUnreadCount"
            r4 = 3
            int r2 = r2.mo107404b(r3, r4)     // Catch:{ all -> 0x03f7 }
            k40.a r0 = f40.C86709a0.m107533q(r0)     // Catch:{ all -> 0x03f7 }
            lc3.b r0 = (lc3.C10485b) r0     // Catch:{ all -> 0x03f7 }
            pj.f r0 = r0.vh0()     // Catch:{ all -> 0x03f7 }
            java.lang.String r3 = "StoryShouldShowEntranceInTimelineOfTimeDuration"
            r4 = 3600(0xe10, float:5.045E-42)
            int r0 = r0.mo107404b(r3, r4)     // Catch:{ all -> 0x03f7 }
            java.lang.String r3 = "MicroMsg.ContactSyncFetcher"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f7 }
            r4.<init>()     // Catch:{ all -> 0x03f7 }
            java.lang.String r6 = "updateUnreadList: unread "
            r4.append(r6)     // Catch:{ all -> 0x03f7 }
            int r6 = r1.size()     // Catch:{ all -> 0x03f7 }
            r4.append(r6)     // Catch:{ all -> 0x03f7 }
            java.lang.String r6 = ", displayUnread:"
            r4.append(r6)     // Catch:{ all -> 0x03f7 }
            java.util.List<java.lang.String> r6 = f281762h     // Catch:{ all -> 0x03f7 }
            int r7 = r6.size()     // Catch:{ all -> 0x03f7 }
            r4.append(r7)     // Catch:{ all -> 0x03f7 }
            java.lang.String r7 = ", displayOld:"
            r4.append(r7)     // Catch:{ all -> 0x03f7 }
            java.util.List<java.lang.String> r7 = f281761g     // Catch:{ all -> 0x03f7 }
            int r8 = r7.size()     // Catch:{ all -> 0x03f7 }
            r4.append(r8)     // Catch:{ all -> 0x03f7 }
            java.lang.String r8 = ", displayNewReply:"
            r4.append(r8)     // Catch:{ all -> 0x03f7 }
            java.util.Map<java.lang.String, hw2.e> r8 = f281760f     // Catch:{ all -> 0x03f7 }
            int r9 = r8.size()     // Catch:{ all -> 0x03f7 }
            r4.append(r9)     // Catch:{ all -> 0x03f7 }
            java.lang.String r9 = ", totalCount:"
            r4.append(r9)     // Catch:{ all -> 0x03f7 }
            r4.append(r2)     // Catch:{ all -> 0x03f7 }
            java.lang.String r9 = ", showDuration:"
            r4.append(r9)     // Catch:{ all -> 0x03f7 }
            r4.append(r0)     // Catch:{ all -> 0x03f7 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x03f7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ all -> 0x03f7 }
            zv2.c r3 = zv2.C103109c.f304232b     // Catch:{ all -> 0x03f7 }
            boolean r3 = r3.mo108963a()     // Catch:{ all -> 0x03f7 }
            r4 = 1000(0x3e8, float:1.401E-42)
            r9 = 0
            r11 = 1000(0x3e8, double:4.94E-321)
            r13 = 1
            if (r3 != 0) goto L_0x014c
            int r3 = r6.size()     // Catch:{ all -> 0x03f7 }
            int r6 = r7.size()     // Catch:{ all -> 0x03f7 }
            int r3 = r3 + r6
            int r6 = r8.size()     // Catch:{ all -> 0x03f7 }
            int r3 = r3 + r6
            if (r3 <= 0) goto L_0x00fd
            r3 = 1
            goto L_0x00fe
        L_0x00fd:
            r3 = 0
        L_0x00fe:
            if (r3 != 0) goto L_0x0112
            int r6 = r1.size()     // Catch:{ all -> 0x03f7 }
            if (r6 < r2) goto L_0x0112
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x03f7 }
            r15 = 1015(0x3f7, double:5.015E-321)
            r17 = 10
            r19 = 1
            r14.mo175913w(r15, r17, r19)     // Catch:{ all -> 0x03f7 }
            r3 = 1
        L_0x0112:
            if (r3 != 0) goto L_0x0147
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x03f7 }
        L_0x0118:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x03f7 }
            if (r6 == 0) goto L_0x0147
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x03f7 }
            kw2.e r6 = (kw2.C99264e) r6     // Catch:{ all -> 0x03f7 }
            long r7 = r6.field_updateTime     // Catch:{ all -> 0x03f7 }
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x012f
            int r6 = r6.field_storyPostTime     // Catch:{ all -> 0x03f7 }
            long r6 = (long) r6     // Catch:{ all -> 0x03f7 }
            long r7 = r6 * r11
        L_0x012f:
            long r14 = (long) r4     // Catch:{ all -> 0x03f7 }
            long r7 = r7 / r14
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.secondsToNow(r7)     // Catch:{ all -> 0x03f7 }
            long r14 = (long) r0     // Catch:{ all -> 0x03f7 }
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 < 0) goto L_0x0118
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ all -> 0x03f7 }
            r15 = 1015(0x3f7, double:5.015E-321)
            r17 = 11
            r19 = 1
            r14.mo175913w(r15, r17, r19)     // Catch:{ all -> 0x03f7 }
            r3 = 1
            goto L_0x0118
        L_0x0147:
            if (r3 != 0) goto L_0x014c
            monitor-exit(r21)
            goto L_0x03f0
        L_0x014c:
            int r0 = r1.size()     // Catch:{ all -> 0x03f7 }
            if (r0 <= r13) goto L_0x015a
            hw2.c r0 = new hw2.c     // Catch:{ all -> 0x03f7 }
            r0.<init>()     // Catch:{ all -> 0x03f7 }
            sx3.C77813z.m93909o(r1, r0)     // Catch:{ all -> 0x03f7 }
        L_0x015a:
            java.lang.Object r0 = sx3.C110818d0.m150916N(r1)     // Catch:{ all -> 0x03f7 }
            kw2.e r0 = (kw2.C99264e) r0     // Catch:{ all -> 0x03f7 }
            if (r0 == 0) goto L_0x0168
            r1.remove(r0)     // Catch:{ all -> 0x03f7 }
            r1.add(r5, r0)     // Catch:{ all -> 0x03f7 }
        L_0x0168:
            java.util.List<java.lang.String> r0 = f281762h     // Catch:{ all -> 0x03f7 }
            r0.clear()     // Catch:{ all -> 0x03f7 }
            java.util.List<java.lang.String> r0 = f281761g     // Catch:{ all -> 0x03f7 }
            r0.clear()     // Catch:{ all -> 0x03f7 }
            java.util.List<java.lang.String> r0 = f281763i     // Catch:{ all -> 0x03f7 }
            r0.clear()     // Catch:{ all -> 0x03f7 }
            java.util.List<xv2.k> r0 = f281764j     // Catch:{ all -> 0x03f7 }
            r0.clear()     // Catch:{ all -> 0x03f7 }
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x03f7 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ all -> 0x03f7 }
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_STORY_SNS_SHOW_TIME_LONG     // Catch:{ all -> 0x03f7 }
            long r2 = r0.mo119673G(r2, r9)     // Catch:{ all -> 0x03f7 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x03f7 }
            r0.<init>()     // Catch:{ all -> 0x03f7 }
            java.util.Map<java.lang.String, hw2.e> r6 = f281760f     // Catch:{ all -> 0x03f7 }
            java.util.Collection r6 = r6.values()     // Catch:{ all -> 0x03f7 }
            r0.addAll(r6)     // Catch:{ all -> 0x03f7 }
            hw2.d r6 = new hw2.d     // Catch:{ all -> 0x03f7 }
            r6.<init>()     // Catch:{ all -> 0x03f7 }
            java.util.List r0 = sx3.C110818d0.m150943o0(r0, r6)     // Catch:{ all -> 0x03f7 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x03f7 }
        L_0x01a5:
            boolean r6 = r0.hasNext()     // Catch:{ all -> 0x03f7 }
            if (r6 == 0) goto L_0x01d5
            java.lang.Object r6 = r0.next()     // Catch:{ all -> 0x03f7 }
            hw2.e r6 = (hw2.C8826e) r6     // Catch:{ all -> 0x03f7 }
            java.util.List<java.lang.String> r7 = f281763i     // Catch:{ all -> 0x03f7 }
            r8 = 0
            r6.getClass()     // Catch:{ all -> 0x03f7 }
            r7.add(r8)     // Catch:{ all -> 0x03f7 }
            r7 = 0
            r6.getClass()     // Catch:{ all -> 0x03f7 }
            long r7 = (long) r7     // Catch:{ all -> 0x03f7 }
            long r14 = (long) r4     // Catch:{ all -> 0x03f7 }
            long r14 = r2 / r14
            int r16 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x01a5
            java.util.List<xv2.k> r7 = f281764j     // Catch:{ all -> 0x03f7 }
            xv2.k r8 = new xv2.k     // Catch:{ all -> 0x03f7 }
            r14 = 0
            r6.getClass()     // Catch:{ all -> 0x03f7 }
            r8.<init>(r14, r13)     // Catch:{ all -> 0x03f7 }
            r7.add(r8)     // Catch:{ all -> 0x03f7 }
            goto L_0x01a5
        L_0x01d5:
            f40.o r0 = f40.C86709a0.m107535s()     // Catch:{ all -> 0x03f7 }
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()     // Catch:{ all -> 0x03f7 }
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_STORY_SNS_UPDATE_TIME_LONG     // Catch:{ all -> 0x03f7 }
            long r6 = r0.mo119673G(r4, r9)     // Catch:{ all -> 0x03f7 }
            monitor-enter(r1)     // Catch:{ all -> 0x03f7 }
            java.util.Iterator r0 = r1.iterator()     // Catch:{ all -> 0x03f1 }
        L_0x01e8:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x03f1 }
            if (r4 == 0) goto L_0x03a5
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x03f1 }
            kw2.e r4 = (kw2.C99264e) r4     // Catch:{ all -> 0x03f1 }
            com.tencent.mm.plugin.story.model.StoryCore$h r8 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t     // Catch:{ all -> 0x03f1 }
            kw2.j r9 = r8.mo134191i()     // Catch:{ all -> 0x03f1 }
            java.lang.String r10 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            int r13 = eb0.C31543z5.m39455e()     // Catch:{ all -> 0x03f1 }
            cw2.k$a r14 = cw2.C97387k.f285887a     // Catch:{ all -> 0x03f1 }
            r14.mo136646a()     // Catch:{ all -> 0x03f1 }
            r15 = 86400(0x15180, float:1.21072E-40)
            int r13 = r13 - r15
            java.util.List r9 = r9.mo138665SE(r10, r5, r13)     // Catch:{ all -> 0x03f1 }
            kw2.j r10 = r8.mo134191i()     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            int r16 = eb0.C31543z5.m39455e()     // Catch:{ all -> 0x03f1 }
            r14.mo136646a()     // Catch:{ all -> 0x03f1 }
            int r14 = r16 - r15
            java.util.List r10 = r10.mo138668bD(r13, r5, r14, r5)     // Catch:{ all -> 0x03f1 }
            int r10 = r10.size()     // Catch:{ all -> 0x03f1 }
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x03f1 }
            int r13 = r9.size()     // Catch:{ all -> 0x03f1 }
            if (r10 == r13) goto L_0x0232
            r10 = 1
            goto L_0x0233
        L_0x0232:
            r10 = 0
        L_0x0233:
            if (r10 == 0) goto L_0x02e7
            boolean r8 = r9.isEmpty()     // Catch:{ all -> 0x03f1 }
            if (r8 != 0) goto L_0x03a1
            java.lang.Object r8 = r9.get(r5)     // Catch:{ all -> 0x03f1 }
            kw2.i r8 = (kw2.C99268i) r8     // Catch:{ all -> 0x03f1 }
            int r8 = r8.field_createTime     // Catch:{ all -> 0x03f1 }
            long r8 = (long) r8     // Catch:{ all -> 0x03f1 }
            long r8 = r8 * r11
            long r11 = r4.field_readTime     // Catch:{ all -> 0x03f1 }
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0287
            zv2.c r11 = zv2.C103109c.f304232b     // Catch:{ all -> 0x03f1 }
            boolean r11 = r11.mo108963a()     // Catch:{ all -> 0x03f1 }
            if (r11 == 0) goto L_0x0270
            java.util.List<java.lang.String> r11 = f281762h     // Catch:{ all -> 0x03f1 }
            java.lang.String r12 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            r11.add(r12)     // Catch:{ all -> 0x03f1 }
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x0287
            java.util.List<xv2.k> r11 = f281764j     // Catch:{ all -> 0x03f1 }
            xv2.k r12 = new xv2.k     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            r12.<init>(r13, r5)     // Catch:{ all -> 0x03f1 }
            r11.add(r12)     // Catch:{ all -> 0x03f1 }
            goto L_0x0287
        L_0x0270:
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x027e
            java.util.List<java.lang.String> r11 = f281762h     // Catch:{ all -> 0x03f1 }
            java.lang.String r12 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            r11.add(r12)     // Catch:{ all -> 0x03f1 }
            goto L_0x0287
        L_0x027e:
            java.util.List<java.lang.String> r11 = f281761g     // Catch:{ all -> 0x03f1 }
            java.lang.String r12 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            r11.add(r12)     // Catch:{ all -> 0x03f1 }
        L_0x0287:
            java.lang.String r11 = "MicroMsg.ContactSyncFetcher"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f1 }
            r12.<init>()     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "make list username:"
            r12.append(r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            r12.append(r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = " updateTime:"
            r12.append(r13)     // Catch:{ all -> 0x03f1 }
            long r13 = r4.field_updateTime     // Catch:{ all -> 0x03f1 }
            r12.append(r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = " posTime:"
            r12.append(r13)     // Catch:{ all -> 0x03f1 }
            int r4 = r4.field_storyPostTime     // Catch:{ all -> 0x03f1 }
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = " makeTime:"
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            r12.append(r6)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = " itUpdateTime "
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            r12.append(r8)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = " result "
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x02ca
            r4 = 1
            goto L_0x02cb
        L_0x02ca:
            r4 = 0
        L_0x02cb:
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = " hasInvisibleItem:"
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            r12.append(r10)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = " lastShowEntranceTime:"
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            r12.append(r2)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = r12.toString()     // Catch:{ all -> 0x03f1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)     // Catch:{ all -> 0x03f1 }
            goto L_0x03a1
        L_0x02e7:
            java.lang.String r8 = r8.mo134187e()     // Catch:{ all -> 0x03f1 }
            java.lang.String r9 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r8, (java.lang.String) r9)     // Catch:{ all -> 0x03f1 }
            if (r8 == 0) goto L_0x02fd
            int r8 = r4.field_storyPostTime     // Catch:{ all -> 0x03f1 }
        L_0x02f7:
            long r8 = (long) r8     // Catch:{ all -> 0x03f1 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r11
            goto L_0x0308
        L_0x02fd:
            long r8 = r4.field_updateTime     // Catch:{ all -> 0x03f1 }
            r11 = 0
            int r13 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0308
            int r8 = r4.field_storyPostTime     // Catch:{ all -> 0x03f1 }
            goto L_0x02f7
        L_0x0308:
            zv2.c r11 = zv2.C103109c.f304232b     // Catch:{ all -> 0x03f1 }
            boolean r11 = r11.mo108963a()     // Catch:{ all -> 0x03f1 }
            if (r11 == 0) goto L_0x032c
            java.util.List<java.lang.String> r11 = f281762h     // Catch:{ all -> 0x03f1 }
            java.lang.String r12 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            r11.add(r12)     // Catch:{ all -> 0x03f1 }
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x0343
            java.util.List<xv2.k> r11 = f281764j     // Catch:{ all -> 0x03f1 }
            xv2.k r12 = new xv2.k     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            r12.<init>(r13, r5)     // Catch:{ all -> 0x03f1 }
            r11.add(r12)     // Catch:{ all -> 0x03f1 }
            goto L_0x0343
        L_0x032c:
            int r11 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r11 <= 0) goto L_0x033a
            java.util.List<java.lang.String> r11 = f281762h     // Catch:{ all -> 0x03f1 }
            java.lang.String r12 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            r11.add(r12)     // Catch:{ all -> 0x03f1 }
            goto L_0x0343
        L_0x033a:
            java.util.List<java.lang.String> r11 = f281761g     // Catch:{ all -> 0x03f1 }
            java.lang.String r12 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            r11.add(r12)     // Catch:{ all -> 0x03f1 }
        L_0x0343:
            java.lang.String r11 = "MicroMsg.ContactSyncFetcher"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f1 }
            r12.<init>()     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = "make list username:"
            r12.append(r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = r4.getUserName()     // Catch:{ all -> 0x03f1 }
            r12.append(r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = " updateTime:"
            r12.append(r13)     // Catch:{ all -> 0x03f1 }
            long r13 = r4.field_updateTime     // Catch:{ all -> 0x03f1 }
            r12.append(r13)     // Catch:{ all -> 0x03f1 }
            java.lang.String r13 = " posTime:"
            r12.append(r13)     // Catch:{ all -> 0x03f1 }
            int r4 = r4.field_storyPostTime     // Catch:{ all -> 0x03f1 }
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = " makeTime:"
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            r12.append(r6)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = " itUpdateTime "
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            r12.append(r8)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = " result "
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0386
            r4 = 1
            goto L_0x0387
        L_0x0386:
            r4 = 0
        L_0x0387:
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = " hasInvisibleItem:"
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            r12.append(r10)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = " lastShowEntranceTime:"
            r12.append(r4)     // Catch:{ all -> 0x03f1 }
            r12.append(r2)     // Catch:{ all -> 0x03f1 }
            java.lang.String r4 = r12.toString()     // Catch:{ all -> 0x03f1 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)     // Catch:{ all -> 0x03f1 }
        L_0x03a1:
            r11 = 1000(0x3e8, double:4.94E-321)
            goto L_0x01e8
        L_0x03a5:
            monitor-exit(r1)     // Catch:{ all -> 0x03f7 }
            java.lang.String r0 = "MicroMsg.ContactSyncFetcher"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03f7 }
            r1.<init>()     // Catch:{ all -> 0x03f7 }
            java.lang.String r2 = "update time "
            r1.append(r2)     // Catch:{ all -> 0x03f7 }
            r1.append(r6)     // Catch:{ all -> 0x03f7 }
            java.lang.String r2 = " displayUnreadUserList "
            r1.append(r2)     // Catch:{ all -> 0x03f7 }
            java.util.List<java.lang.String> r2 = f281762h     // Catch:{ all -> 0x03f7 }
            r1.append(r2)     // Catch:{ all -> 0x03f7 }
            java.lang.String r2 = " displayOlderUserList "
            r1.append(r2)     // Catch:{ all -> 0x03f7 }
            java.util.List<java.lang.String> r2 = f281761g     // Catch:{ all -> 0x03f7 }
            r1.append(r2)     // Catch:{ all -> 0x03f7 }
            java.lang.String r2 = " userReplyStateMap "
            r1.append(r2)     // Catch:{ all -> 0x03f7 }
            java.util.Map<java.lang.String, hw2.e> r2 = f281760f     // Catch:{ all -> 0x03f7 }
            r1.append(r2)     // Catch:{ all -> 0x03f7 }
            java.lang.String r2 = " displaySortedReplyUserList:"
            r1.append(r2)     // Catch:{ all -> 0x03f7 }
            java.util.List<java.lang.String> r2 = f281763i     // Catch:{ all -> 0x03f7 }
            r1.append(r2)     // Catch:{ all -> 0x03f7 }
            java.lang.String r2 = " displayNewList:"
            r1.append(r2)     // Catch:{ all -> 0x03f7 }
            java.util.List<xv2.k> r2 = f281764j     // Catch:{ all -> 0x03f7 }
            r1.append(r2)     // Catch:{ all -> 0x03f7 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x03f7 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x03f7 }
            monitor-exit(r21)
        L_0x03f0:
            return
        L_0x03f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03f7 }
            throw r0     // Catch:{ all -> 0x03f7 }
        L_0x03f4:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03f7 }
            throw r0     // Catch:{ all -> 0x03f7 }
        L_0x03f7:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.model.sync.ContactSyncFetcher.m123593j(com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher):void");
    }

    /* renamed from: a */
    public void mo134196a(C102780i iVar) {
        if (iVar != null) {
            f281765n.remove(iVar);
        }
    }

    /* renamed from: b */
    public int mo134197b() {
        Set<Map.Entry<String, C8826e>> entrySet = f281760f.entrySet();
        synchronized (entrySet) {
            Iterator<T> it = entrySet.iterator();
            if (it.hasNext()) {
                ((C8826e) ((Map.Entry) it.next()).getValue()).getClass();
                throw null;
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0010 A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> mo134198c() {
        /*
            r13 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Map<java.lang.String, kw2.e> r1 = f281759e
            java.util.Set r1 = r1.entrySet()
            monitor-enter(r1)
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x00e7 }
        L_0x0010:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00e7 }
            r4 = 1
            if (r3 == 0) goto L_0x009a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00e7 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00e7 }
            com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher r5 = f281758d     // Catch:{ all -> 0x00e7 }
            java.lang.Object r6 = r3.getKey()     // Catch:{ all -> 0x00e7 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00e7 }
            boolean r5 = r5.mo134204k(r6)     // Catch:{ all -> 0x00e7 }
            if (r5 != 0) goto L_0x0010
            com.tencent.mm.plugin.story.model.StoryCore$h r5 = com.tencent.p014mm.plugin.story.model.StoryCore.f281736t     // Catch:{ all -> 0x00e7 }
            java.lang.String r6 = r5.mo134187e()     // Catch:{ all -> 0x00e7 }
            java.lang.Object r7 = r3.getKey()     // Catch:{ all -> 0x00e7 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x00e7 }
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ all -> 0x00e7 }
            java.lang.Object r7 = r3.getValue()     // Catch:{ all -> 0x00e7 }
            java.lang.String r8 = "it.value"
            gy3.C87412m.m108593f(r7, r8)     // Catch:{ all -> 0x00e7 }
            kw2.e r7 = (kw2.C99264e) r7     // Catch:{ all -> 0x00e7 }
            r8 = 0
            if (r6 == 0) goto L_0x0081
            int r6 = r7.field_storyPostTime     // Catch:{ all -> 0x00e7 }
            cw2.k$a r9 = cw2.C97387k.f285887a     // Catch:{ all -> 0x00e7 }
            r9.mo136646a()     // Catch:{ all -> 0x00e7 }
            r9 = 86400(0x15180, float:1.21072E-40)
            int r6 = r6 + r9
            int r9 = eb0.C31543z5.m39455e()     // Catch:{ all -> 0x00e7 }
            if (r6 >= r9) goto L_0x005d
            r6 = 1
            goto L_0x005e
        L_0x005d:
            r6 = 0
        L_0x005e:
            if (r6 != 0) goto L_0x008e
            java.lang.String r5 = r5.mo134187e()     // Catch:{ all -> 0x00e7 }
            java.lang.String r6 = r7.getUserName()     // Catch:{ all -> 0x00e7 }
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x00e7 }
            if (r5 == 0) goto L_0x007d
            int r5 = r7.field_storyPostTime     // Catch:{ all -> 0x00e7 }
            long r5 = (long) r5     // Catch:{ all -> 0x00e7 }
            long r9 = r7.field_readTime     // Catch:{ all -> 0x00e7 }
            r7 = 1000(0x3e8, float:1.401E-42)
            long r11 = (long) r7     // Catch:{ all -> 0x00e7 }
            long r9 = r9 / r11
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x007d
            r5 = 1
            goto L_0x007e
        L_0x007d:
            r5 = 0
        L_0x007e:
            if (r5 != 0) goto L_0x008e
            goto L_0x008f
        L_0x0081:
            boolean r5 = r7.isValid()     // Catch:{ all -> 0x00e7 }
            if (r5 == 0) goto L_0x008e
            boolean r5 = r7.mo138638l2()     // Catch:{ all -> 0x00e7 }
            if (r5 != 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r4 = 0
        L_0x008f:
            if (r4 == 0) goto L_0x0010
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00e7 }
            r0.add(r3)     // Catch:{ all -> 0x00e7 }
            goto L_0x0010
        L_0x009a:
            monitor-exit(r1)
            int r1 = r0.size()
            if (r1 <= r4) goto L_0x00a9
            com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$b r1 = new com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$b
            r1.<init>()
            sx3.C77813z.m93909o(r0, r1)
        L_0x00a9:
            java.lang.String r1 = "MicroMsg.ContactSyncFetcher"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getReadList: size "
            r2.append(r3)
            int r3 = r0.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = sx3.C36907w.m41090l(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x00d2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00e6
            java.lang.Object r2 = r0.next()
            kw2.e r2 = (kw2.C99264e) r2
            java.lang.String r2 = r2.getUserName()
            r1.add(r2)
            goto L_0x00d2
        L_0x00e6:
            return r1
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.model.sync.ContactSyncFetcher.mo134198c():java.util.List");
    }

    /* renamed from: d */
    public List<String> mo134199d() {
        LinkedList linkedList;
        StringBuilder sb = new StringBuilder();
        sb.append("getUnreadList: size ");
        List<String> list = f281762h;
        sb.append(list.size());
        Log.m105924i("MicroMsg.ContactSyncFetcher", sb.toString());
        C87412m.m108593f(list, "displayUnreadUserList");
        synchronized (list) {
            linkedList = new LinkedList(list);
        }
        return linkedList;
    }

    /* renamed from: e */
    public List<String> mo134200e() {
        LinkedList linkedList;
        StringBuilder sb = new StringBuilder();
        sb.append("getOlderList: size ");
        List<String> list = f281761g;
        sb.append(list.size());
        Log.m105924i("MicroMsg.ContactSyncFetcher", sb.toString());
        C87412m.m108593f(list, "displayOlderUserList");
        synchronized (list) {
            linkedList = new LinkedList(list);
        }
        return linkedList;
    }

    /* renamed from: f */
    public void mo134201f() {
        C61926c.m72657B("ContactSyncFetcher_checkContactState", true, C96338a.f281768d);
    }

    /* renamed from: g */
    public LinkedHashMap<String, ArrayList<Long>> mo134202g() {
        StringBuilder sb = new StringBuilder();
        sb.append("getNewReplyList: size ");
        Map<String, C8826e> map = f281760f;
        sb.append(map.size());
        Log.m105924i("MicroMsg.ContactSyncFetcher", sb.toString());
        LinkedHashMap<String, ArrayList<Long>> linkedHashMap = new LinkedHashMap<>();
        synchronized (this) {
            C87412m.m108593f(map, "userReplyStateMap");
            Iterator<Map.Entry<String, C8826e>> it = map.entrySet().iterator();
            if (!it.hasNext()) {
                C13598b0 b0Var = C13598b0.f38549a;
            } else {
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                new ArrayList();
                ((C8826e) next.getValue()).getClass();
                throw null;
            }
        }
        return linkedHashMap;
    }

    /* renamed from: h */
    public void mo134203h(C102780i iVar) {
        if (iVar != null) {
            LinkedList<C102780i> linkedList = f281765n;
            if (!linkedList.contains(iVar)) {
                linkedList.add(iVar);
            }
        }
    }

    /* renamed from: k */
    public final boolean mo134204k(String str) {
        return (str == null || str.length() == 0) || Util.isEqual(str, StoryCore.f281736t.mo134187e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r8.equals("notify_story_read") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (r8.equals("notify_story_invalid") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r8.equals("notify_story_valid") == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r8.equals("notify_story_preload") != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        r9 = r9.obj;
        gy3.C87412m.m108592e(r9, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
        r9 = (kw2.C99264e) r9;
        r3 = r9.getUserName();
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.ContactSyncFetcher", "[StoryExtInfo] onNotifyChange: event " + r8 + ' ' + r3);
        r2 = f281759e;
        gy3.C87412m.m108593f(r2, "userStateMap");
        r2.put(r3, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0081, code lost:
        if (gy3.C87412m.m108589b(r8, "notify_story_preload") != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0083, code lost:
        o40.C61926c.m72657B("ContactSyncFetcher_checkContactState", true, com.tencent.p014mm.plugin.story.model.sync.ContactSyncFetcher.C96340c.f281769d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.ContactSyncFetcher", "[StoryExtInfo] unknown event " + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r8.equals("notify_story_unread") == false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotifyChange(java.lang.String r8, com.tencent.p014mm.sdk.storage.MStorageEventData r9) {
        /*
            r7 = this;
            r0 = 1
            java.lang.String r1 = "ContactSyncFetcher_checkContactState"
            java.lang.String r2 = "MicroMsg.ContactSyncFetcher"
            if (r8 == 0) goto L_0x009e
            if (r9 == 0) goto L_0x009e
            java.lang.Object r3 = r9.obj
            boolean r3 = r3 instanceof kw2.C99264e
            if (r3 == 0) goto L_0x009e
            int r3 = r8.hashCode()
            java.lang.String r4 = "notify_story_preload"
            switch(r3) {
                case -1921532343: goto L_0x0042;
                case -533270468: goto L_0x0038;
                case 356729399: goto L_0x002e;
                case 398324054: goto L_0x0024;
                case 632036207: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0089
        L_0x001a:
            java.lang.String r3 = "notify_story_unread"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x0089
        L_0x0024:
            java.lang.String r3 = "notify_story_read"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x0089
        L_0x002e:
            java.lang.String r3 = "notify_story_invalid"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x0089
        L_0x0038:
            java.lang.String r3 = "notify_story_valid"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x0089
        L_0x0042:
            boolean r3 = r8.equals(r4)
            if (r3 == 0) goto L_0x0089
        L_0x0048:
            java.lang.Object r9 = r9.obj
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo"
            gy3.C87412m.m108592e(r9, r3)
            kw2.e r9 = (kw2.C99264e) r9
            java.lang.String r3 = r9.getUserName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "[StoryExtInfo] onNotifyChange: event "
            r5.append(r6)
            r5.append(r8)
            r6 = 32
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            java.util.Map<java.lang.String, kw2.e> r2 = f281759e
            java.lang.String r5 = "userStateMap"
            gy3.C87412m.m108593f(r2, r5)
            r2.put(r3, r9)
            boolean r8 = gy3.C87412m.m108589b(r8, r4)
            if (r8 != 0) goto L_0x00ce
            com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$c r8 = com.tencent.p014mm.plugin.story.model.sync.ContactSyncFetcher.C96340c.f281769d
            o40.C61926c.m72657B(r1, r0, r8)
            goto L_0x00ce
        L_0x0089:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "[StoryExtInfo] unknown event "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
            goto L_0x00ce
        L_0x009e:
            if (r8 == 0) goto L_0x00ce
            if (r9 == 0) goto L_0x00ce
            java.lang.Object r3 = r9.obj
            boolean r3 = r3 instanceof kw2.C99268i
            if (r3 == 0) goto L_0x00ce
            java.lang.String r3 = "notify_story_info_delete"
            boolean r3 = gy3.C87412m.m108589b(r8, r3)
            if (r3 == 0) goto L_0x00ba
            com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$d r8 = new com.tencent.mm.plugin.story.model.sync.ContactSyncFetcher$d
            r8.<init>(r9)
            o40.C61926c.m72657B(r1, r0, r8)
            goto L_0x00ce
        L_0x00ba:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "[StoryInfo] unknown event "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r8)
        L_0x00ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.story.model.sync.ContactSyncFetcher.onNotifyChange(java.lang.String, com.tencent.mm.sdk.storage.MStorageEventData):void");
    }
}
