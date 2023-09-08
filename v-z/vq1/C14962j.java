package vq1;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import java.util.HashMap;
import rx3.C13598b0;
import zc1.C66785b;

@C86522b
/* renamed from: vq1.j */
public final class C14962j extends C86301e implements C14967t {

    /* renamed from: d */
    public String f41019d = "";

    /* renamed from: e */
    public C14966n f41020e;

    /* renamed from: f */
    public C14966n f41021f;

    /* renamed from: g */
    public C14966n f41022g;

    /* renamed from: h */
    public C14963a f41023h;

    /* renamed from: i */
    public final HashMap<String, C14963a> f41024i = new HashMap<>();

    /* renamed from: vq1.j$a */
    public static final class C14963a {

        /* renamed from: a */
        public final String f41025a;

        /* renamed from: b */
        public final C14966n f41026b;

        /* renamed from: c */
        public final C14966n f41027c;

        /* renamed from: d */
        public final C14966n f41028d;

        public C14963a(String str, C14966n nVar, C14966n nVar2, C14966n nVar3) {
            C87412m.m108594g(str, "username");
            C87412m.m108594g(nVar, "followRecorder");
            C87412m.m108594g(nVar2, "noSeeAuthorRecorder");
            C87412m.m108594g(nVar3, "noSeeFriendRecorder");
            this.f41025a = str;
            this.f41026b = nVar;
            this.f41027c = nVar2;
            this.f41028d = nVar3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14963a)) {
                return false;
            }
            C14963a aVar = (C14963a) obj;
            return C87412m.m108589b(this.f41025a, aVar.f41025a) && C87412m.m108589b(this.f41026b, aVar.f41026b) && C87412m.m108589b(this.f41027c, aVar.f41027c) && C87412m.m108589b(this.f41028d, aVar.f41028d);
        }

        public int hashCode() {
            return (((((this.f41025a.hashCode() * 31) + this.f41026b.hashCode()) * 31) + this.f41027c.hashCode()) * 31) + this.f41028d.hashCode();
        }

        public String toString() {
            return "RecorderStore(username=" + this.f41025a + ", followRecorder=" + this.f41026b + ", noSeeAuthorRecorder=" + this.f41027c + ", noSeeFriendRecorder=" + this.f41028d + ')';
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016c, code lost:
        if (r3 != 4) goto L_0x0184;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b0  */
    /* renamed from: JY */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14012JY(java.util.ArrayList<com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "fragments"
            gy3.C87412m.m108594g(r15, r0)
            r14.requireAccountInitialized()
            vq1.n r0 = r14.f41020e
            r1 = 0
            java.lang.String r2 = "followRecorder"
            if (r0 == 0) goto L_0x024b
            java.util.Set<java.lang.String> r0 = r0.f41031a
            boolean r0 = r0.isEmpty()
            java.lang.String r3 = "noSeeFriend"
            java.lang.String r4 = "noSeeAuthorRecorder"
            r5 = 1
            if (r0 == 0) goto L_0x003e
            vq1.n r0 = r14.f41021f
            if (r0 == 0) goto L_0x003a
            java.util.Set<java.lang.String> r0 = r0.f41031a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003e
            vq1.n r0 = r14.f41022g
            if (r0 == 0) goto L_0x0036
            java.util.Set<java.lang.String> r0 = r0.f41031a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x0036:
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x003a:
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x003e:
            r0 = 0
        L_0x003f:
            java.lang.String r6 = "Finder.FeedCleaner"
            if (r0 == 0) goto L_0x0049
            java.lang.String r15 = "cleanTimeline return for record empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r15)
            return
        L_0x0049:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "printRecord followRecorder:"
            r0.append(r7)
            vq1.n r7 = r14.f41020e
            if (r7 == 0) goto L_0x0247
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "printRecord noSeeAuthorRecorder:"
            r0.append(r7)
            vq1.n r7 = r14.f41021f
            if (r7 == 0) goto L_0x0243
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "printRecord noSeeFriend:"
            r0.append(r7)
            vq1.n r7 = r14.f41022g
            if (r7 == 0) goto L_0x023f
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            java.util.Iterator r15 = r15.iterator()
        L_0x0095:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0224
            java.lang.Object r0 = r15.next()
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r0 = (com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment) r0
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r7 = r3.mo62445d(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC> r8 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC.class
            bl3.t r7 = r7.mo62449e(r8)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC r7 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC) r7
            java.lang.String r8 = "presenter"
            if (r7 == 0) goto L_0x00c8
            kf1.m9 r7 = r7.f18785d
            if (r7 == 0) goto L_0x00c4
            boolean r9 = r7 instanceof com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter
            if (r9 == 0) goto L_0x00be
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r7 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r7
            goto L_0x00bf
        L_0x00be:
            r7 = r1
        L_0x00bf:
            if (r7 == 0) goto L_0x00c8
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r7 = r7.f13285z
            goto L_0x00c9
        L_0x00c4:
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x00c8:
            r7 = r1
        L_0x00c9:
            if (r7 != 0) goto L_0x00e5
            bl3.r$a r3 = r3.mo62445d(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC> r7 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC.class
            bl3.t r3 = r3.mo62449e(r7)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC r3 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC) r3
            if (r3 == 0) goto L_0x00e4
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r3 = r3.f18796e
            if (r3 == 0) goto L_0x00e0
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r7 = r3.f30175e
            goto L_0x00e5
        L_0x00e0:
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x00e4:
            r7 = r1
        L_0x00e5:
            int r3 = r0.f17334o
            if (r7 == 0) goto L_0x00ee
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r8 = r7.getDataList()
            goto L_0x00ef
        L_0x00ee:
            r8 = r1
        L_0x00ef:
            boolean r9 = r14.vx0(r3)
            java.lang.String r10 = "cleanFeed: "
            r11 = 4
            r12 = 3
            java.lang.String r13 = " return"
            if (r9 != 0) goto L_0x0112
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            r8.append(r3)
            r8.append(r13)
            java.lang.String r3 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            goto L_0x0184
        L_0x0112:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            r9.append(r3)
            java.lang.String r10 = " size: "
            r9.append(r10)
            if (r8 == 0) goto L_0x012d
            int r10 = r8.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x012e
        L_0x012d:
            r10 = r1
        L_0x012e:
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "followRecorder size: "
            r9.append(r10)
            vq1.n r10 = r14.f41020e
            if (r10 == 0) goto L_0x0220
            java.util.Set<java.lang.String> r10 = r10.f41031a
            int r10 = r10.size()
            r9.append(r10)
            java.lang.String r10 = " noSeeAuthorRecorder:"
            r9.append(r10)
            vq1.n r10 = r14.f41021f
            if (r10 == 0) goto L_0x021c
            java.util.Set<java.lang.String> r10 = r10.f41031a
            int r10 = r10.size()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
            if (r3 == r5) goto L_0x017a
            if (r3 == r12) goto L_0x016f
            if (r3 == r11) goto L_0x017a
            goto L_0x0184
        L_0x016f:
            if (r8 == 0) goto L_0x0184
            vq1.k r3 = new vq1.k
            r3.<init>(r14)
            sx3.C64175a0.m75512t(r8, r3)
            goto L_0x0184
        L_0x017a:
            if (r8 == 0) goto L_0x0184
            vq1.l r3 = new vq1.l
            r3.<init>(r14)
            sx3.C64175a0.m75512t(r8, r3)
        L_0x0184:
            if (r7 == 0) goto L_0x018f
            tf1.g r3 = r7.dispatcher()
            if (r3 == 0) goto L_0x018f
            r3.mo13376a()
        L_0x018f:
            int r0 = r0.f17334o
            boolean r3 = r14.vx0(r0)
            java.lang.String r7 = "cleanTimelinePage: "
            if (r3 != 0) goto L_0x01b0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r0)
            r3.append(r13)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            goto L_0x0095
        L_0x01b0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r7)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
            java.lang.String r3 = ""
            if (r0 == r5) goto L_0x01fc
            if (r0 == r12) goto L_0x01cc
            if (r0 == r11) goto L_0x01fc
            goto L_0x0095
        L_0x01cc:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            vq1.n r7 = r14.f41020e
            if (r7 == 0) goto L_0x01f8
            java.util.Set<java.lang.String> r7 = r7.f41031a
            r0.addAll(r7)
            vq1.n r7 = r14.f41021f
            if (r7 == 0) goto L_0x01f4
            java.util.Set<java.lang.String> r7 = r7.f41031a
            r0.addAll(r7)
            vp1.o$a r7 = vp1.C14937o.f40972a
            r8 = 7
            java.util.List r0 = sx3.C110818d0.m150953y0(r0)
            vp1.h r9 = new vp1.h
            r9.<init>(r0)
            r7.mo13983d(r8, r3, r9, r5)
            goto L_0x0095
        L_0x01f4:
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x01f8:
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x01fc:
            if (r0 != r5) goto L_0x0200
            r0 = 5
            goto L_0x0202
        L_0x0200:
            r0 = 8
        L_0x0202:
            vp1.o$a r7 = vp1.C14937o.f40972a
            vq1.n r8 = r14.f41021f
            if (r8 == 0) goto L_0x0218
            java.util.Set<java.lang.String> r8 = r8.f41031a
            java.util.List r8 = sx3.C110818d0.m150953y0(r8)
            vp1.h r9 = new vp1.h
            r9.<init>(r8)
            r7.mo13983d(r0, r3, r9, r5)
            goto L_0x0095
        L_0x0218:
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x021c:
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x0220:
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0224:
            vq1.n r15 = r14.f41020e
            if (r15 == 0) goto L_0x023b
            java.util.Set<java.lang.String> r15 = r15.f41031a
            r15.clear()
            vq1.n r15 = r14.f41021f
            if (r15 == 0) goto L_0x0237
            java.util.Set<java.lang.String> r15 = r15.f41031a
            r15.clear()
            return
        L_0x0237:
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x023b:
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x023f:
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0243:
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x0247:
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x024b:
            gy3.C87412m.m108603p(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vq1.C14962j.mo14012JY(java.util.ArrayList):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: LZ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14013LZ(int r3, java.lang.String r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "finderUserName"
            gy3.C87412m.m108594g(r4, r0)
            r2.requireAccountInitialized()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "recordClean type:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "  finderUserName: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " isClean:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FeedCleaner"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 1
            r1 = 0
            if (r3 == r0) goto L_0x004f
            r0 = 2
            if (r3 == r0) goto L_0x0044
            r0 = 3
            if (r3 == r0) goto L_0x0039
            goto L_0x0054
        L_0x0039:
            vq1.n r3 = r2.f41022g
            if (r3 == 0) goto L_0x003e
            goto L_0x0053
        L_0x003e:
            java.lang.String r3 = "noSeeFriend"
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0044:
            vq1.n r3 = r2.f41021f
            if (r3 == 0) goto L_0x0049
            goto L_0x0053
        L_0x0049:
            java.lang.String r3 = "noSeeAuthorRecorder"
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x004f:
            vq1.n r3 = r2.f41020e
            if (r3 == 0) goto L_0x0064
        L_0x0053:
            r1 = r3
        L_0x0054:
            if (r1 == 0) goto L_0x0063
            if (r5 == 0) goto L_0x005e
            java.util.Set<java.lang.String> r3 = r1.f41031a
            r3.add(r4)
            goto L_0x0063
        L_0x005e:
            java.util.Set<java.lang.String> r3 = r1.f41031a
            r3.remove(r4)
        L_0x0063:
            return
        L_0x0064:
            java.lang.String r3 = "followRecorder"
            gy3.C87412m.m108603p(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vq1.C14962j.mo14013LZ(int, java.lang.String, boolean):void");
    }

    public void onAccountInitialized(Context context) {
        C13598b0 b0Var;
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.FeedCleaner", "onAccountInit");
        String O5 = C66785b.f191882e.mo90662O5();
        this.f41019d = O5;
        if (this.f41024i.containsKey(O5)) {
            C14963a aVar = this.f41024i.get(this.f41019d);
            C87412m.m108591d(aVar);
            this.f41023h = aVar;
        }
        C14963a aVar2 = this.f41023h;
        if (aVar2 != null) {
            this.f41020e = aVar2.f41026b;
            this.f41021f = aVar2.f41027c;
            this.f41022g = aVar2.f41028d;
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            this.f41020e = new C14966n();
            this.f41021f = new C14966n();
            C14966n nVar = new C14966n();
            this.f41022g = nVar;
            String str = this.f41019d;
            C14966n nVar2 = this.f41020e;
            if (nVar2 != null) {
                C14966n nVar3 = this.f41021f;
                if (nVar3 != null) {
                    C14963a aVar3 = new C14963a(str, nVar2, nVar3, nVar);
                    this.f41024i.put(this.f41019d, aVar3);
                    this.f41023h = aVar3;
                    return;
                }
                C87412m.m108603p("noSeeAuthorRecorder");
                throw null;
            }
            C87412m.m108603p("followRecorder");
            throw null;
        }
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i("Finder.FeedCleaner", "onAccountRelease");
    }

    public final boolean vx0(int i) {
        if (i != 1) {
            if (i == 3) {
                C14966n nVar = this.f41020e;
                if (nVar != null) {
                    boolean z = !nVar.f41031a.isEmpty();
                    C14966n nVar2 = this.f41021f;
                    if (nVar2 != null) {
                        return z | (!nVar2.f41031a.isEmpty());
                    }
                    C87412m.m108603p("noSeeAuthorRecorder");
                    throw null;
                }
                C87412m.m108603p("followRecorder");
                throw null;
            } else if (i != 4) {
                return false;
            }
        }
        C14966n nVar3 = this.f41021f;
        if (nVar3 != null) {
            return !nVar3.f41031a.isEmpty();
        }
        C87412m.m108603p("noSeeAuthorRecorder");
        throw null;
    }
}
