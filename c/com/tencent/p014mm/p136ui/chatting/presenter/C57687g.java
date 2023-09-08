package com.tencent.p014mm.p136ui.chatting.presenter;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import dk3.C58319b;
import dk3.C75412a;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p716uu.C52617d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64658qj1;
import z04.C112551y;

/* renamed from: com.tencent.mm.ui.chatting.presenter.g */
public final class C57687g implements C75412a {

    /* renamed from: d */
    public final Context f165102d;

    /* renamed from: e */
    public final String f165103e;

    /* renamed from: f */
    public List<C64658qj1> f165104f;

    /* renamed from: g */
    public List<C64658qj1> f165105g;

    /* renamed from: h */
    public C58319b f165106h;

    /* renamed from: i */
    public final C13601g f165107i = C36568h.m40985a(C57694c.f165120d);

    /* renamed from: com.tencent.mm.ui.chatting.presenter.g$a */
    public static final class C57688a implements C52617d.C52618a {

        /* renamed from: d */
        public String f165108d = "";

        /* renamed from: e */
        public final MTimerHandler f165109e;

        /* renamed from: f */
        public final /* synthetic */ C57687g f165110f;

        /* renamed from: com.tencent.mm.ui.chatting.presenter.g$a$a */
        public static final class C57689a implements MTimerHandler.CallBack {

            /* renamed from: d */
            public final /* synthetic */ C57687g f165111d;

            /* renamed from: e */
            public final /* synthetic */ C57688a f165112e;

            /* renamed from: com.tencent.mm.ui.chatting.presenter.g$a$a$a */
            public static final class C57690a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C57687g f165113d;

                public C57690a(C57687g gVar) {
                    this.f165113d = gVar;
                }

                public final void run() {
                    C58319b bVar;
                    C57687g gVar = this.f165113d;
                    List<C64658qj1> list = gVar.f165104f;
                    if (list != null && (bVar = gVar.f165106h) != null) {
                        bVar.mo83073q2(false, list);
                    }
                }
            }

            /* renamed from: com.tencent.mm.ui.chatting.presenter.g$a$a$b */
            public static final class C57691b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C57687g f165114d;

                public C57691b(C57687g gVar) {
                    this.f165114d = gVar;
                }

                public final void run() {
                    C58319b bVar;
                    C57687g gVar = this.f165114d;
                    List<C64658qj1> list = gVar.f165104f;
                    if (list != null && (bVar = gVar.f165106h) != null) {
                        bVar.mo83073q2(false, list);
                    }
                }
            }

            public C57689a(C57687g gVar, C57688a aVar) {
                this.f165111d = gVar;
                this.f165112e = aVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e9, code lost:
                if (r4.mo82049f(r9, r3) != false) goto L_0x0145;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x0107, code lost:
                if (r4.mo82049f(r9, r3) != false) goto L_0x0145;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:45:0x0125, code lost:
                if (r4.mo82049f(r9, r3) != false) goto L_0x0145;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:49:0x0143, code lost:
                if (z04.C112550d0.m153801u(r3, r9, false) != false) goto L_0x0145;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x0162, code lost:
                if (z04.C112550d0.m153801u(r3, r9, false) != false) goto L_0x0145;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:58:0x0180, code lost:
                if (z04.C112550d0.m153801u(r3, r9, false) != false) goto L_0x0145;
             */
            /* JADX WARNING: Removed duplicated region for block: B:61:0x0186  */
            /* JADX WARNING: Removed duplicated region for block: B:68:0x0189 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean onTimerExpired() {
                /*
                    r16 = this;
                    r0 = r16
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "onTimeExpired dataListCache="
                    r1.append(r2)
                    com.tencent.mm.ui.chatting.presenter.g r2 = r0.f165111d
                    java.util.List<te3.qj1> r2 = r2.f165105g
                    if (r2 == 0) goto L_0x001b
                    int r2 = r2.size()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    goto L_0x001c
                L_0x001b:
                    r2 = 0
                L_0x001c:
                    r1.append(r2)
                    java.lang.String r2 = " query="
                    r1.append(r2)
                    com.tencent.mm.ui.chatting.presenter.g$a r2 = r0.f165112e
                    java.lang.String r2 = r2.f165108d
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    java.lang.String r2 = "Finder.FeedHistoryListPresenter"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
                    com.tencent.mm.ui.chatting.presenter.g r1 = r0.f165111d
                    dk3.b r1 = r1.f165106h
                    if (r1 == 0) goto L_0x0041
                    com.tencent.mm.ui.chatting.presenter.g$a r2 = r0.f165112e
                    java.lang.String r2 = r2.f165108d
                    r1.mo83070J2(r2)
                L_0x0041:
                    com.tencent.mm.ui.chatting.presenter.g$a r1 = r0.f165112e
                    java.lang.String r1 = r1.f165108d
                    boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L_0x0068
                    com.tencent.mm.ui.chatting.presenter.g r1 = r0.f165111d
                    java.util.List<te3.qj1> r4 = r1.f165105g
                    if (r4 != 0) goto L_0x0058
                    r1.mo82050g(r3)
                    goto L_0x019c
                L_0x0058:
                    r1.f165104f = r4
                    zt3.t r3 = zt3.C119157j.f356862d
                    com.tencent.mm.ui.chatting.presenter.g$a$a$a r4 = new com.tencent.mm.ui.chatting.presenter.g$a$a$a
                    r4.<init>(r1)
                    zt3.j r3 = (zt3.C119157j) r3
                    r3.mo183895z(r4)
                    goto L_0x019c
                L_0x0068:
                    com.tencent.mm.ui.chatting.presenter.g r1 = r0.f165111d
                    java.util.List<te3.qj1> r4 = r1.f165105g
                    r1.f165104f = r4
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    com.tencent.mm.ui.chatting.presenter.g r4 = r0.f165111d
                    java.util.List<te3.qj1> r5 = r4.f165104f
                    if (r5 == 0) goto L_0x018c
                    com.tencent.mm.ui.chatting.presenter.g$a r6 = r0.f165112e
                    java.util.Iterator r5 = r5.iterator()
                L_0x007f:
                    boolean r7 = r5.hasNext()
                    if (r7 == 0) goto L_0x018c
                    java.lang.Object r7 = r5.next()
                    te3.qj1 r7 = (te3.C64658qj1) r7
                    te3.rk1 r8 = r7.f185039f
                    if (r8 == 0) goto L_0x0189
                    gy3.C87412m.m108591d(r8)
                    java.lang.String r9 = r6.f165108d
                    r4.getClass()
                    java.lang.String r10 = "query"
                    gy3.C87412m.m108594g(r9, r10)
                    java.lang.String r10 = r8.f185187h
                    java.lang.String r11 = r8.f185185f
                    java.lang.String r8 = r8.f185198v
                    char[] r12 = r9.toCharArray()
                    java.lang.String r13 = "this as java.lang.String).toCharArray()"
                    gy3.C87412m.m108593f(r12, r13)
                    int r13 = r12.length
                    r14 = 0
                L_0x00ae:
                    if (r14 >= r13) goto L_0x00c6
                    char r15 = r12[r14]
                    r3 = 19968(0x4e00, float:2.7981E-41)
                    if (r3 > r15) goto L_0x00bd
                    r3 = 40892(0x9fbc, float:5.7302E-41)
                    if (r15 >= r3) goto L_0x00bd
                    r3 = 1
                    goto L_0x00be
                L_0x00bd:
                    r3 = 0
                L_0x00be:
                    if (r3 == 0) goto L_0x00c2
                    r3 = 1
                    goto L_0x00c7
                L_0x00c2:
                    int r14 = r14 + 1
                    r3 = 1
                    goto L_0x00ae
                L_0x00c6:
                    r3 = 0
                L_0x00c7:
                    java.lang.String r12 = "this as java.lang.String).toLowerCase(locale)"
                    java.lang.String r13 = "getDefault()"
                    if (r3 != 0) goto L_0x0128
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                    if (r3 != 0) goto L_0x00ec
                    gy3.C87412m.m108591d(r10)
                    java.util.Locale r3 = java.util.Locale.getDefault()
                    gy3.C87412m.m108593f(r3, r13)
                    java.lang.String r3 = r10.toLowerCase(r3)
                    gy3.C87412m.m108593f(r3, r12)
                    boolean r3 = r4.mo82049f(r9, r3)
                    if (r3 == 0) goto L_0x00ec
                    goto L_0x0145
                L_0x00ec:
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                    if (r3 != 0) goto L_0x010a
                    gy3.C87412m.m108591d(r11)
                    java.util.Locale r3 = java.util.Locale.getDefault()
                    gy3.C87412m.m108593f(r3, r13)
                    java.lang.String r3 = r11.toLowerCase(r3)
                    gy3.C87412m.m108593f(r3, r12)
                    boolean r3 = r4.mo82049f(r9, r3)
                    if (r3 == 0) goto L_0x010a
                    goto L_0x0145
                L_0x010a:
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                    if (r3 != 0) goto L_0x0183
                    gy3.C87412m.m108591d(r8)
                    java.util.Locale r3 = java.util.Locale.getDefault()
                    gy3.C87412m.m108593f(r3, r13)
                    java.lang.String r3 = r8.toLowerCase(r3)
                    gy3.C87412m.m108593f(r3, r12)
                    boolean r3 = r4.mo82049f(r9, r3)
                    if (r3 == 0) goto L_0x0183
                    goto L_0x0145
                L_0x0128:
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
                    if (r3 != 0) goto L_0x0147
                    gy3.C87412m.m108591d(r10)
                    java.util.Locale r3 = java.util.Locale.getDefault()
                    gy3.C87412m.m108593f(r3, r13)
                    java.lang.String r3 = r10.toLowerCase(r3)
                    gy3.C87412m.m108593f(r3, r12)
                    boolean r3 = z04.C112550d0.m153801u(r3, r9, r2)
                    if (r3 == 0) goto L_0x0147
                L_0x0145:
                    r3 = 1
                    goto L_0x0184
                L_0x0147:
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)
                    if (r3 != 0) goto L_0x0165
                    gy3.C87412m.m108591d(r11)
                    java.util.Locale r3 = java.util.Locale.getDefault()
                    gy3.C87412m.m108593f(r3, r13)
                    java.lang.String r3 = r11.toLowerCase(r3)
                    gy3.C87412m.m108593f(r3, r12)
                    boolean r3 = z04.C112550d0.m153801u(r3, r9, r2)
                    if (r3 == 0) goto L_0x0165
                    goto L_0x0145
                L_0x0165:
                    boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
                    if (r3 != 0) goto L_0x0183
                    gy3.C87412m.m108591d(r8)
                    java.util.Locale r3 = java.util.Locale.getDefault()
                    gy3.C87412m.m108593f(r3, r13)
                    java.lang.String r3 = r8.toLowerCase(r3)
                    gy3.C87412m.m108593f(r3, r12)
                    boolean r3 = z04.C112550d0.m153801u(r3, r9, r2)
                    if (r3 == 0) goto L_0x0183
                    goto L_0x0145
                L_0x0183:
                    r3 = 0
                L_0x0184:
                    if (r3 == 0) goto L_0x0189
                    r1.add(r7)
                L_0x0189:
                    r3 = 1
                    goto L_0x007f
                L_0x018c:
                    com.tencent.mm.ui.chatting.presenter.g r3 = r0.f165111d
                    r3.f165104f = r1
                    zt3.t r1 = zt3.C119157j.f356862d
                    com.tencent.mm.ui.chatting.presenter.g$a$a$b r4 = new com.tencent.mm.ui.chatting.presenter.g$a$a$b
                    r4.<init>(r3)
                    zt3.j r1 = (zt3.C119157j) r1
                    r1.mo183895z(r4)
                L_0x019c:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.presenter.C57687g.C57688a.C57689a.onTimerExpired():boolean");
            }
        }

        public C57688a(C57687g gVar) {
            this.f165110f = gVar;
            this.f165109e = new MTimerHandler(C86709a0.m107525e().getLooper(), (MTimerHandler.CallBack) new C57689a(gVar, this), false);
        }

        /* renamed from: H1 */
        public void mo63485H1(boolean z, String[] strArr, long j, int i) {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            Log.m105924i("Finder.FeedHistoryListPresenter", "onQuitSearch");
            C58319b bVar = this.f165110f.f165106h;
            if (bVar != null) {
                bVar.onFinish();
            }
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            return false;
        }

        /* renamed from: T3 */
        public void mo63486T3() {
        }

        /* renamed from: U1 */
        public void mo63487U1() {
        }

        /* renamed from: i7 */
        public void mo1323i7() {
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            C87412m.m108594g(str, "searchText");
            Log.m105924i("Finder.FeedHistoryListPresenter", "onSearchChange query=" + this.f165108d + " searchText=" + str);
            if (!C87412m.m108589b(this.f165108d, str)) {
                this.f165108d = str;
                this.f165109e.stopTimer();
                this.f165109e.startTimer(500);
            }
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
            Log.m105924i("Finder.FeedHistoryListPresenter", "onSearchEditTextReady");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.g$b */
    public static final class C57692b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C57687g f165115d;

        /* renamed from: e */
        public final /* synthetic */ boolean f165116e;

        /* renamed from: com.tencent.mm.ui.chatting.presenter.g$b$a */
        public static final class C57693a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C57687g f165117d;

            /* renamed from: e */
            public final /* synthetic */ List<C64658qj1> f165118e;

            /* renamed from: f */
            public final /* synthetic */ boolean f165119f;

            public C57693a(C57687g gVar, List<C64658qj1> list, boolean z) {
                this.f165117d = gVar;
                this.f165118e = list;
                this.f165119f = z;
            }

            public final void run() {
                C57687g gVar = this.f165117d;
                List<C64658qj1> list = this.f165118e;
                gVar.f165104f = list;
                gVar.f165105g = list;
                C58319b bVar = gVar.f165106h;
                if (bVar != null) {
                    bVar.mo83073q2(this.f165119f, list);
                }
            }
        }

        public C57692b(C57687g gVar, boolean z) {
            this.f165115d = gVar;
            this.f165116e = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
            cy3.C58003b.m67160a(r0, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r10 = this;
                eb0.c r0 = eb0.C97625j3.m125812b()
                g62.l r0 = r0.mo105911z()
                com.tencent.mm.ui.chatting.presenter.g r1 = r10.f165115d
                java.lang.String r1 = r1.f165103e
                r2 = -1
                com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
                r3 = 0
                android.database.Cursor r0 = r0.mo101073LL(r1, r3, r2)
                if (r0 != 0) goto L_0x001e
                java.lang.String r0 = "Finder.FeedHistoryListPresenter"
                java.lang.String r1 = "loadData cursor is null!!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                return
            L_0x001e:
                com.tencent.mm.ui.chatting.presenter.g r1 = r10.f165115d
                boolean r2 = r10.f165116e
                java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0087 }
                r4.<init>()     // Catch:{ all -> 0x0087 }
            L_0x0027:
                boolean r5 = r0.moveToNext()     // Catch:{ all -> 0x0087 }
                r6 = 0
                if (r5 == 0) goto L_0x0075
                com.tencent.mm.storage.f4 r5 = new com.tencent.mm.storage.f4     // Catch:{ all -> 0x0087 }
                r5.<init>()     // Catch:{ all -> 0x0087 }
                r5.convertFrom(r0)     // Catch:{ all -> 0x0087 }
                java.lang.String r7 = r5.getContent()     // Catch:{ all -> 0x0087 }
                if (r7 == 0) goto L_0x0027
                com.tencent.mm.message.l$b r6 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r7, r6)     // Catch:{ all -> 0x0087 }
                if (r6 == 0) goto L_0x0027
                int r7 = r6.f195582i     // Catch:{ all -> 0x0087 }
                r1.getClass()     // Catch:{ all -> 0x0087 }
                r8 = 51
                if (r7 != r8) goto L_0x004d
                r7 = 1
                goto L_0x004e
            L_0x004d:
                r7 = 0
            L_0x004e:
                if (r7 == 0) goto L_0x0027
                java.lang.Class<ht1.f> r7 = ht1.C60166f.class
                com.tencent.mm.message.g r6 = r6.mo93555w(r7)     // Catch:{ all -> 0x0087 }
                ht1.f r6 = (ht1.C60166f) r6     // Catch:{ all -> 0x0087 }
                if (r6 == 0) goto L_0x0027
                te3.rk1 r6 = r6.f171710b     // Catch:{ all -> 0x0087 }
                if (r6 == 0) goto L_0x0027
                te3.qj1 r7 = new te3.qj1     // Catch:{ all -> 0x0087 }
                r7.<init>()     // Catch:{ all -> 0x0087 }
                long r8 = r5.getMsgId()     // Catch:{ all -> 0x0087 }
                r7.f185037d = r8     // Catch:{ all -> 0x0087 }
                long r8 = r5.getCreateTime()     // Catch:{ all -> 0x0087 }
                r7.f185038e = r8     // Catch:{ all -> 0x0087 }
                r7.f185039f = r6     // Catch:{ all -> 0x0087 }
                r4.add(r7)     // Catch:{ all -> 0x0087 }
                goto L_0x0027
            L_0x0075:
                zt3.t r3 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0087 }
                com.tencent.mm.ui.chatting.presenter.g$b$a r5 = new com.tencent.mm.ui.chatting.presenter.g$b$a     // Catch:{ all -> 0x0087 }
                r5.<init>(r1, r4, r2)     // Catch:{ all -> 0x0087 }
                zt3.j r3 = (zt3.C119157j) r3     // Catch:{ all -> 0x0087 }
                r3.mo183895z(r5)     // Catch:{ all -> 0x0087 }
                rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0087 }
                cy3.C58003b.m67160a(r0, r6)
                return
            L_0x0087:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0089 }
            L_0x0089:
                r2 = move-exception
                cy3.C58003b.m67160a(r0, r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.presenter.C57687g.C57692b.run():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.presenter.g$c */
    public static final class C57694c extends C87413o implements C32224a<Pattern> {

        /* renamed from: d */
        public static final C57694c f165120d = new C57694c();

        public C57694c() {
            super(0);
        }

        public Object invoke() {
            return Pattern.compile("[._a-zA-Z0-9]+");
        }
    }

    public C57687g(Context context, String str) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "talker");
        this.f165102d = context;
        this.f165103e = str;
    }

    /* renamed from: c */
    public String mo82046c() {
        String string = this.f165102d.getString(C0966R.string.f7549ag);
        C87412m.m108593f(string, "context.getString(R.stri….all_history_finder_feed)");
        return string;
    }

    /* renamed from: d */
    public C52617d.C52618a mo82047d() {
        return new C57688a(this);
    }

    /* renamed from: e */
    public String mo82048e() {
        String string = this.f165102d.getString(C0966R.string.f7549ag);
        C87412m.m108593f(string, "context.getString(R.stri….all_history_finder_feed)");
        return string;
    }

    /* renamed from: f */
    public final boolean mo82049f(String str, String str2) {
        if (Util.isNullOrNil(str2)) {
            return false;
        }
        Matcher matcher = ((Pattern) ((C36570n) this.f165107i).getValue()).matcher(str2);
        boolean z = false;
        while (matcher.find()) {
            String group = matcher.group();
            C87412m.m108593f(group, "group");
            boolean s = C112551y.m153819s(group, str, false);
            Log.m105924i("Finder.FeedHistoryListPresenter", "[isContains] search=" + str + " group=" + group);
            if (s) {
                return s;
            }
            z = s;
        }
        return z;
    }

    /* renamed from: g */
    public void mo82050g(boolean z) {
        Log.m105924i("Finder.FeedHistoryListPresenter", "loadData isFirst=" + z);
        C58319b bVar = this.f165106h;
        if (bVar != null) {
            bVar.mo83071f(z);
        }
        C86709a0.m107525e().postToWorker(new C57692b(this, z));
    }

    public void onDetach() {
        C58319b bVar = this.f165106h;
        if (bVar != null) {
            bVar.mo82061t5(null);
        }
        this.f165106h = null;
    }
}
