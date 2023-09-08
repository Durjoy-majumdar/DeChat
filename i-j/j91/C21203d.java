package j91;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ao3.C113066a;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWCAccessible;
import com.tencent.p014mm.plugin.appbrand.p026ui.AppBrandUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import e91.C116711b;
import e91.C20552a;
import fi3.C86868b;
import g91.C20813c;
import gy3.C87412m;
import h81.C20928j;
import i20.C21043a;
import i20.C21045c;
import i91.C21060a;
import i91.C21062c;
import ia1.C98625h;
import j20.C21152b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k91.C117394e;
import l31.C61212e;
import l91.C117467h;
import n91.C117614e;
import n91.C21611b;
import rx3.C36570n;
import s91.C22316b;
import s91.C22317c;
import s91.C22320d;
import s91.C22323e;
import s91.C22332h;
import s91.C22335i;
import s91.C22341k;
import s91.C22344l;
import s91.C22347m;
import s91.C22350n;
import t91.C101740m;
import t91.C22466j;
import te3.fh4;

/* renamed from: j91.d */
public final class C21203d {

    /* renamed from: a */
    public final C21207e f59975a;

    /* renamed from: b */
    public final C21045c f59976b = new C21204a();

    /* renamed from: c */
    public final C21152b f59977c = new C21205b();

    /* renamed from: d */
    public final C113066a f59978d = new C21206c();

    /* renamed from: j91.d$a */
    public class C21204a implements C21045c {
        public C21204a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0257, code lost:
            if (r6.equals("com.tencent.mm.plugin.finder.ui.FinderHomeUI") == false) goto L_0x0264;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x025a, code lost:
            t91.C22466j.f63626f.mo35601d((androidx.fragment.app.FragmentActivity) r14, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0264, code lost:
            r3 = t91.C22466j.f63630j;
            r3.getClass();
            r4 = r14.getClass().getName();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0277, code lost:
            if (t91.C64208c.f181941H.contains(r4) == false) goto L_0x02f4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0279, code lost:
            r6 = r3.f65377b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x027b, code lost:
            if (r6 != null) goto L_0x027f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0283, code lost:
            if (gy3.C87412m.m108589b(r4, r6) != false) goto L_0x0286;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0288, code lost:
            if (r3.f65378c != null) goto L_0x028c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x028a, code lost:
            r3.f65377b = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x028c, code lost:
            r4 = e91.C116711b.m164583h(r4);
            r6 = r3.f65376a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0294, code lost:
            if (r6 == null) goto L_0x02f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x029c, code lost:
            if (gy3.C87412m.m108589b(r6.f65065b, r4) == false) goto L_0x02f4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x029e, code lost:
            r6 = r3.f65376a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x02a0, code lost:
            if (r6 == null) goto L_0x02ec;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x02a2, code lost:
            r6.f65068e = r10;
            r6.f65066c = r10 - r6.f65067d;
            r6.f65069f = e91.C116711b.m164579d();
            r6 = r3.f65376a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b2, code lost:
            if (r6 == null) goto L_0x02e8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x02b4, code lost:
            r8 = r14.getIntent().getStringExtra("key_enter_source_info");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x02be, code lost:
            if (r8 != null) goto L_0x02c2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c0, code lost:
            r8 = "";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c2, code lost:
            r6.f65074k = r8;
            r6 = u91.C22618a.f65058a;
            r3 = r3.f65376a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x02c8, code lost:
            if (r3 == null) goto L_0x02e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x02ca, code lost:
            r6.mo35741b(r3);
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("HABBYGE-MALI.FinderShareStatistics", "onPagePaused: " + r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x02e4, code lost:
            gy3.C87412m.m108603p("mStayTime");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e7, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x02e8, code lost:
            gy3.C87412m.m108603p("mStayTime");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x02eb, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x02ec, code lost:
            gy3.C87412m.m108603p("mStayTime");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x02ef, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x02f0, code lost:
            gy3.C87412m.m108603p("mStayTime");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x02f3, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x02f4, code lost:
            g91.C20813c.m22810a().mo32508c(205, r1.mo33178b(r14, r10));
            r1 = (l91.C21406g) e91.C20552a.m22323a().f57844b;
            r1.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x030e, code lost:
            if ((r14 instanceof androidx.fragment.app.FragmentActivity) == false) goto L_0x0381;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x0310, code lost:
            r7 = (androidx.fragment.app.FragmentActivity) r14;
            r1 = r1.f60560a.f60559a;
            r3 = r1.f60551b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x0319, code lost:
            if (r3 == null) goto L_0x0320;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x031b, code lost:
            r3 = r3.isInstance(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x0320, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0321, code lost:
            if (r3 != false) goto L_0x0324;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0324, code lost:
            i20.C21043a.m23197h().mo32764r(r1.f60556g, r1.f60554e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x033f, code lost:
            if ("com.tencent.mm.ui.chatting.ChattingUI".equals(r7.getClass().getCanonicalName()) == false) goto L_0x034a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x0342, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x0343, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace("HABBYGE-MALI.FragmentLauncherUIMonitor", r4, "fragmentGoneCallback", new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d8, code lost:
            if (r6.equals("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI") == false) goto L_0x0264;
         */
        /* JADX WARNING: Removed duplicated region for block: B:156:0x038f A[LOOP:1: B:154:0x0389->B:156:0x038f, LOOP_END] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo33182a(java.lang.Object r14) {
            /*
                r13 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Class r1 = r14.getClass()
                java.lang.String r1 = r1.getName()
                r2 = 0
                r0[r2] = r1
                int r1 = r14.hashCode()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r3 = 1
                r0[r3] = r1
                java.lang.String r1 = "HABBYGE-MALI.HellActivityStub"
                java.lang.String r4 = "mOnActivityListener, onPause: %s, %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r0)
                j91.d r0 = j91.C21203d.this
                j91.e r0 = r0.f59975a
                if (r0 == 0) goto L_0x0399
                android.app.Activity r14 = (android.app.Activity) r14
                boolean r0 = fi3.C86868b.m107886a(r14)
                if (r0 == 0) goto L_0x0399
                j91.d r0 = j91.C21203d.this
                j91.e r0 = r0.f59975a
                j91.b r0 = (j91.C21200b) r0
                boolean r1 = r0.f59972d
                java.lang.String r4 = "com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI"
                r5 = 0
                if (r1 == 0) goto L_0x0178
                j91.c r1 = r0.f59971c
                r1.getClass()
                te3.fh4 r1 = new te3.fh4
                r1.<init>()
                int r6 = r14.hashCode()
                r1.f354002e = r6
                java.lang.Class r6 = r14.getClass()
                java.lang.String r6 = r6.getCanonicalName()
                r1.f354001d = r6
                long r6 = java.lang.System.currentTimeMillis()
                r1.f354003f = r6
                java.lang.String r6 = r1.f354001d
                t91.C64208c.f181940G = r6
                g91.c r6 = g91.C20813c.m22810a()
                r7 = 204(0xcc, float:2.86E-43)
                r6.mo32508c(r7, r1)
                java.lang.String r6 = r1.f354001d
                java.lang.String r7 = "pageName"
                gy3.C87412m.m108594g(r6, r7)
                int r7 = r6.hashCode()
                switch(r7) {
                    case -2031553009: goto L_0x0118;
                    case -1615773847: goto L_0x0107;
                    case -1605333887: goto L_0x00f6;
                    case -1490149623: goto L_0x00e5;
                    case -936307702: goto L_0x00d6;
                    case 1670085563: goto L_0x00c5;
                    case 1670607163: goto L_0x00b2;
                    case 1878606788: goto L_0x009f;
                    case 1966129866: goto L_0x008c;
                    case 2029821223: goto L_0x0079;
                    default: goto L_0x0077;
                }
            L_0x0077:
                goto L_0x0128
            L_0x0079:
                java.lang.String r7 = "com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI"
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x0083
                goto L_0x0128
            L_0x0083:
                s91.c r6 = s91.C22316b.f63279c
                if (r6 == 0) goto L_0x0128
                r6.mo35475e(r3, r7, r14)
                goto L_0x0128
            L_0x008c:
                java.lang.String r7 = "com.tencent.mm.plugin.finder.feed.ui.FinderTimelineUI"
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x0096
                goto L_0x0128
            L_0x0096:
                s91.m r6 = s91.C22316b.f63278b
                if (r6 == 0) goto L_0x0128
                r6.mo35485e(r3, r7, r14)
                goto L_0x0128
            L_0x009f:
                java.lang.String r7 = "com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI"
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x00a9
                goto L_0x0128
            L_0x00a9:
                s91.i r6 = s91.C22316b.f63281e
                if (r6 == 0) goto L_0x0128
                r6.mo35482e(r3, r7, r14)
                goto L_0x0128
            L_0x00b2:
                java.lang.String r7 = "com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelTimelineUI"
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x00bc
                goto L_0x0128
            L_0x00bc:
                s91.e r6 = s91.C22316b.f63284h
                if (r6 == 0) goto L_0x0128
                r6.mo35480e(r3, r7, r14)
                goto L_0x0128
            L_0x00c5:
                java.lang.String r7 = "com.tencent.mm.plugin.finder.feed.ui.FinderFavTimelineUI"
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x00ce
                goto L_0x0128
            L_0x00ce:
                s91.d r6 = s91.C22316b.f63285i
                if (r6 == 0) goto L_0x0128
                r6.mo35479e(r3, r7, r14)
                goto L_0x0128
            L_0x00d6:
                boolean r6 = r6.equals(r4)
                if (r6 != 0) goto L_0x00dd
                goto L_0x0128
            L_0x00dd:
                s91.h r6 = s91.C22316b.f63286j
                if (r6 == 0) goto L_0x0128
                r6.mo35481e(r3, r4, r14)
                goto L_0x0128
            L_0x00e5:
                java.lang.String r7 = "com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI"
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x00ee
                goto L_0x0128
            L_0x00ee:
                s91.c r6 = s91.C22316b.f63279c
                if (r6 == 0) goto L_0x0128
                r6.mo35475e(r3, r7, r14)
                goto L_0x0128
            L_0x00f6:
                java.lang.String r7 = "com.tencent.mm.plugin.finder.search.FinderFeedSearchUI"
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x00ff
                goto L_0x0128
            L_0x00ff:
                s91.l r6 = s91.C22316b.f63283g
                if (r6 == 0) goto L_0x0128
                r6.mo35484e(r3, r7, r14)
                goto L_0x0128
            L_0x0107:
                java.lang.String r7 = "com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI"
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x0110
                goto L_0x0128
            L_0x0110:
                s91.k r6 = s91.C22316b.f63282f
                if (r6 == 0) goto L_0x0128
                r6.mo35483e(r3, r7, r14)
                goto L_0x0128
            L_0x0118:
                java.lang.String r7 = "com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI"
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x0121
                goto L_0x0128
            L_0x0121:
                s91.n r6 = s91.C22316b.f63280d
                if (r6 == 0) goto L_0x0128
                r6.mo35486e(r3, r7, r14)
            L_0x0128:
                ia1.h r6 = ia1.C98625h.m128225a()
                java.lang.String r1 = r1.f354001d
                r6.mo138056b(r3, r1, r14)
                java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>> r1 = n91.C117614e.f351842a
                rx3.g r1 = n91.C117614e.f351845d
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                n91.b r1 = (n91.C21611b) r1
                r6 = -1
                r1.f61190b = r6
                r1.f61189a = r5
                i20.a r6 = i20.C21043a.m23197h()
                java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>> r7 = r1.f61191c
                n91.b$a r1 = r1.f61192d
                r6.mo32762p(r7, r1)
                java.lang.Class r1 = r14.getClass()
                java.lang.String r1 = r1.getSimpleName()
                t91.j r6 = t91.C22466j.f63621a
                java.lang.String r6 = "SnsTimeLineUI"
                boolean r6 = gy3.C87412m.m108589b(r6, r1)
                if (r6 != 0) goto L_0x0167
                java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
                boolean r1 = gy3.C87412m.m108589b(r6, r1)
                if (r1 == 0) goto L_0x0192
            L_0x0167:
                t91.m r1 = t91.C22466j.f63632l
                r1.getClass()
                i20.a r6 = i20.C21043a.m23197h()
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>>> r7 = r1.f297817a
                j20.d r1 = r1.f297818b
                r6.mo32764r(r7, r1)
                goto L_0x0192
            L_0x0178:
                java.lang.Class r1 = r14.getClass()
                java.lang.String r1 = r1.getCanonicalName()
                int r6 = r14.hashCode()
                r7 = 106(0x6a, float:1.49E-43)
                k91.C117394e.m165538d(r1, r5, r7)
                i91.a r7 = i91.C21060a.PAUSE
                i91.c r8 = i91.C21062c.m23249d()
                r8.mo32777h(r1, r6, r7)
            L_0x0192:
                java.util.List<h81.j$d> r0 = r0.f59969a
                java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x019a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x01aa
                java.lang.Object r1 = r0.next()
                h81.j$d r1 = (h81.C20928j.C20932d) r1
                r1.mo32645c(r14)
                goto L_0x019a
            L_0x01aa:
                j91.d r0 = j91.C21203d.this
                j91.e r0 = r0.f59975a
                j91.b r0 = (j91.C21200b) r0
                boolean r1 = r0.f59972d
                if (r1 == 0) goto L_0x0381
                j91.c r1 = r0.f59971c
                r1.getClass()
                long r10 = java.lang.System.currentTimeMillis()
                r6 = 7
                t91.C22466j.m26191l(r14, r5, r10, r6)
                java.lang.Class r6 = r14.getClass()
                java.lang.String r6 = r6.getName()
                int r7 = r6.hashCode()
                switch(r7) {
                    case -2055689330: goto L_0x0251;
                    case -2013384910: goto L_0x023f;
                    case -936307702: goto L_0x01dc;
                    case 259026134: goto L_0x01d2;
                    default: goto L_0x01d0;
                }
            L_0x01d0:
                goto L_0x0264
            L_0x01d2:
                java.lang.String r3 = "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"
                boolean r3 = r6.equals(r3)
                if (r3 != 0) goto L_0x025a
                goto L_0x0264
            L_0x01dc:
                java.lang.String r7 = "com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI"
                boolean r6 = r6.equals(r7)
                if (r6 != 0) goto L_0x01e6
                goto L_0x0264
            L_0x01e6:
                t91.b r6 = t91.C22466j.f63626f
                r7 = r14
                androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
                r6.getClass()
                r91.b r6 = r6.f63606e
                if (r6 == 0) goto L_0x02f4
                java.lang.String r4 = e91.C116711b.m164583h(r4)
                u91.c r7 = r6.f62958e
                if (r7 == 0) goto L_0x01fb
                goto L_0x01fc
            L_0x01fb:
                r3 = 0
            L_0x01fc:
                if (r3 == 0) goto L_0x02f4
                java.lang.String r3 = "statyTimeStaticLbsList"
                if (r7 == 0) goto L_0x023b
                java.lang.String r7 = r7.f65065b
                boolean r4 = gy3.C87412m.m108589b(r7, r4)
                if (r4 == 0) goto L_0x02f4
                u91.c r4 = r6.f62958e
                if (r4 == 0) goto L_0x0237
                r4.f65068e = r10
                long r7 = r4.f65067d
                long r7 = r10 - r7
                r4.f65066c = r7
                java.lang.String r7 = "143"
                r4.f65070g = r7
                java.lang.String r7 = e91.C116711b.m164579d()
                r4.f65069f = r7
                u91.a$a r4 = u91.C22618a.f65058a
                u91.c r6 = r6.f62958e
                if (r6 == 0) goto L_0x0233
                r4.mo35741b(r6)
                java.lang.String r3 = "HABBYGE-MALI.FinderHomeMonitor"
                java.lang.String r4 = "onFinderLbsStreamListUIPause..."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                goto L_0x02f4
            L_0x0233:
                gy3.C87412m.m108603p(r3)
                throw r5
            L_0x0237:
                gy3.C87412m.m108603p(r3)
                throw r5
            L_0x023b:
                gy3.C87412m.m108603p(r3)
                throw r5
            L_0x023f:
                java.lang.String r3 = "com.tencent.mm.plugin.finder.ui.FinderConversationUI"
                boolean r3 = r6.equals(r3)
                if (r3 == 0) goto L_0x0264
                t91.b r3 = t91.C22466j.f63626f
                r4 = r14
                androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
                r3.mo35601d(r4, r10)
                goto L_0x02f4
            L_0x0251:
                java.lang.String r3 = "com.tencent.mm.plugin.finder.ui.FinderHomeUI"
                boolean r3 = r6.equals(r3)
                if (r3 != 0) goto L_0x025a
                goto L_0x0264
            L_0x025a:
                t91.b r3 = t91.C22466j.f63626f
                r4 = r14
                androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
                r3.mo35601d(r4, r10)
                goto L_0x02f4
            L_0x0264:
                v91.d r3 = t91.C22466j.f63630j
                r3.getClass()
                java.lang.Class r4 = r14.getClass()
                java.lang.String r4 = r4.getName()
                java.util.ArrayList<java.lang.String> r6 = t91.C64208c.f181941H
                boolean r6 = r6.contains(r4)
                if (r6 == 0) goto L_0x02f4
                java.lang.String r6 = r3.f65377b
                if (r6 != 0) goto L_0x027f
                goto L_0x02f4
            L_0x027f:
                boolean r6 = gy3.C87412m.m108589b(r4, r6)
                if (r6 != 0) goto L_0x0286
                goto L_0x02f4
            L_0x0286:
                java.lang.String r6 = r3.f65378c
                if (r6 != 0) goto L_0x028c
                r3.f65377b = r5
            L_0x028c:
                java.lang.String r4 = e91.C116711b.m164583h(r4)
                u91.c r6 = r3.f65376a
                java.lang.String r7 = "mStayTime"
                if (r6 == 0) goto L_0x02f0
                java.lang.String r6 = r6.f65065b
                boolean r6 = gy3.C87412m.m108589b(r6, r4)
                if (r6 == 0) goto L_0x02f4
                u91.c r6 = r3.f65376a
                if (r6 == 0) goto L_0x02ec
                r6.f65068e = r10
                long r8 = r6.f65067d
                long r8 = r10 - r8
                r6.f65066c = r8
                java.lang.String r8 = e91.C116711b.m164579d()
                r6.f65069f = r8
                u91.c r6 = r3.f65376a
                if (r6 == 0) goto L_0x02e8
                android.content.Intent r8 = r14.getIntent()
                java.lang.String r9 = "key_enter_source_info"
                java.lang.String r8 = r8.getStringExtra(r9)
                if (r8 != 0) goto L_0x02c2
                java.lang.String r8 = ""
            L_0x02c2:
                r6.f65074k = r8
                u91.a$a r6 = u91.C22618a.f65058a
                u91.c r3 = r3.f65376a
                if (r3 == 0) goto L_0x02e4
                r6.mo35741b(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "onPagePaused: "
                r3.append(r5)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = "HABBYGE-MALI.FinderShareStatistics"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
                goto L_0x02f4
            L_0x02e4:
                gy3.C87412m.m108603p(r7)
                throw r5
            L_0x02e8:
                gy3.C87412m.m108603p(r7)
                throw r5
            L_0x02ec:
                gy3.C87412m.m108603p(r7)
                throw r5
            L_0x02f0:
                gy3.C87412m.m108603p(r7)
                throw r5
            L_0x02f4:
                te3.a63 r1 = r1.mo33178b(r14, r10)
                g91.c r3 = g91.C20813c.m22810a()
                r4 = 205(0xcd, float:2.87E-43)
                r3.mo32508c(r4, r1)
                e91.a r1 = e91.C20552a.m22323a()
                e91.e r1 = r1.f57844b
                l91.g r1 = (l91.C21406g) r1
                r1.getClass()
                boolean r3 = r14 instanceof androidx.fragment.app.FragmentActivity
                if (r3 == 0) goto L_0x0381
                l91.f r1 = r1.f60560a
                r7 = r14
                androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
                l91.e r1 = r1.f60559a
                java.lang.Class<?> r3 = r1.f60551b
                if (r3 == 0) goto L_0x0320
                boolean r3 = r3.isInstance(r7)
                goto L_0x0321
            L_0x0320:
                r3 = 0
            L_0x0321:
                if (r3 != 0) goto L_0x0324
                goto L_0x0381
            L_0x0324:
                i20.a r3 = i20.C21043a.m23197h()
                java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>>> r4 = r1.f60556g
                j20.d r5 = r1.f60554e
                r3.mo32764r(r4, r5)
                java.lang.String r3 = "HABBYGE-MALI.FragmentLauncherUIMonitor"
                java.lang.Class r4 = r7.getClass()     // Catch:{ Exception -> 0x0342 }
                java.lang.String r4 = r4.getCanonicalName()     // Catch:{ Exception -> 0x0342 }
                java.lang.String r5 = "com.tencent.mm.ui.chatting.ChattingUI"
                boolean r2 = r5.equals(r4)     // Catch:{ Exception -> 0x0342 }
                if (r2 == 0) goto L_0x034a
                goto L_0x0381
            L_0x0342:
                r4 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r5 = "fragmentGoneCallback"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r4, r5, r2)
            L_0x034a:
                androidx.fragment.app.Fragment r2 = l91.C117467h.m165689d(r7)
                if (r2 == 0) goto L_0x037c
                java.lang.Class r4 = r2.getClass()
                java.lang.String r8 = r4.getCanonicalName()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "fragmentPauseCallback: curFragment = "
                r4.append(r5)
                r4.append(r8)
                java.lang.String r4 = r4.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                e91.d r1 = r1.f60550a
                if (r1 == 0) goto L_0x0381
                int r9 = r2.hashCode()
                r12 = 1
                r6 = r1
                l91.g r6 = (l91.C21406g) r6
                r6.mo33534e(r7, r8, r9, r10, r12)
                goto L_0x0381
            L_0x037c:
                java.lang.String r1 = "fragmentGoneCallback unmonitor: curFragment = null"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            L_0x0381:
                java.util.List<h81.j$d> r0 = r0.f59969a
                java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0389:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0399
                java.lang.Object r1 = r0.next()
                h81.j$d r1 = (h81.C20928j.C20932d) r1
                r1.mo32658t(r14)
                goto L_0x0389
            L_0x0399:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j91.C21203d.C21204a.mo33182a(java.lang.Object):void");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: androidx.fragment.app.Fragment} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: androidx.fragment.app.FragmentActivity} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: androidx.fragment.app.FragmentActivity} */
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x0337, code lost:
            if (r8 != null) goto L_0x033b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0339, code lost:
            r8 = "";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x033b, code lost:
            r6.f65073j = r8;
            r6 = r5.f65376a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x033f, code lost:
            if (r6 == null) goto L_0x03a9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0341, code lost:
            r6 = r6.f65073j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0343, code lost:
            if (r6 != null) goto L_0x0347;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0345, code lost:
            r6 = "";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x0347, code lost:
            p217oq.C11716d.f34294a = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x034f, code lost:
            if (gy3.C87412m.m108589b(r3, "com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI") == false) goto L_0x0367;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0351, code lost:
            r3 = r5.f65376a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0353, code lost:
            if (r3 == null) goto L_0x0360;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0358, code lost:
            if (t91.C64208c.f181944K != 2) goto L_0x035c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x035a, code lost:
            r6 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x035c, code lost:
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x035d, code lost:
            r3.f65072i = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x0360, code lost:
            gy3.C87412m.m108603p("mStayTime");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0366, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0367, code lost:
            r3 = r5.f65376a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0369, code lost:
            if (r3 == null) goto L_0x03a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x036b, code lost:
            r3.f65072i = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x036e, code lost:
            r3 = r0.getIntent().getStringExtra("KEY_RINGTONE_REPORT_JSON");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x0378, code lost:
            if (r3 != null) goto L_0x037c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x037a, code lost:
            r3 = "";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x037c, code lost:
            v91.C22730d.f65375d = r3;
            r6 = new java.lang.StringBuilder();
            r6.append("doPageResume: ");
            r5 = r5.f65376a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x038c, code lost:
            if (r5 == null) goto L_0x039b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x038e, code lost:
            r6.append(r5.f65065b);
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("HABBYGE-MALI.FinderShareStatistics", r6.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x039b, code lost:
            gy3.C87412m.m108603p("mStayTime");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x03a1, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x03a2, code lost:
            gy3.C87412m.m108603p("mStayTime");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x03a8, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x03a9, code lost:
            gy3.C87412m.m108603p("mStayTime");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x03af, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x03b0, code lost:
            gy3.C87412m.m108603p("mStayTime");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x03b6, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x03b7, code lost:
            gy3.C87412m.m108603p("mStayTime");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x03bd, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x03be, code lost:
            gy3.C87412m.m108603p("mStayTime");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x03c4, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x03c5, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x03c6, code lost:
            r5 = (l91.C21406g) e91.C20552a.m22323a().f57844b;
            r5.getClass();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x03d5, code lost:
            if (d91.C20449a.m22052d() != false) goto L_0x03d9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x03db, code lost:
            if ((r0 instanceof androidx.fragment.app.FragmentActivity) == false) goto L_0x0502;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x03dd, code lost:
            r6 = (androidx.fragment.app.FragmentActivity) r0;
            r5 = r5.f60560a.f60559a;
            r8 = r5.f60551b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x03e6, code lost:
            if (r8 == null) goto L_0x0502;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x03ec, code lost:
            if (r8.isInstance(r6) != false) goto L_0x03f0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x03f2, code lost:
            if ((r6 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity) == false) goto L_0x03f7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x03f4, code lost:
            r6 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x03f7, code lost:
            r6 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:152:0x03f8, code lost:
            r10 = l91.C117467h.m165689d(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x03fe, code lost:
            if (r10 == null) goto L_0x0462;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x0400, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("HABBYGE-MALI.FragmentLauncherUIMonitor", "callbackMMFragmentActivityWhenResume: " + r10.getClass().getName());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x041e, code lost:
            if (r5.f60550a == null) goto L_0x045e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x0420, code lost:
            if (r6 == null) goto L_0x042b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0422, code lost:
            r9 = r6.getClass().getCanonicalName();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x042b, code lost:
            r9 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x042c, code lost:
            r11 = r10.getClass().getCanonicalName();
            r12 = r10.hashCode();
            com.tencent.p014mm.sdk.platformtools.Log.m105925i("HABBYGE-MALI.FragmentLauncherUIMonitor", "callbackMMFActivityWhenResume, %s, %s", r9, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x044b, code lost:
            if ("com.tencent.mm.ui.chatting.ChattingUI".equals(r9) == false) goto L_0x044e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x044e, code lost:
            r3 = r5.f60550a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x0450, code lost:
            if (r3 == null) goto L_0x045e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0452, code lost:
            r18 = r13;
            ((l91.C21406g) r3).mo33535f(r6, r10, r11, r12, r13, true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x045e, code lost:
            r18 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x0462, code lost:
            r18 = r13;
            com.tencent.p014mm.sdk.platformtools.Log.m105928w("HABBYGE-MALI.FragmentLauncherUIMonitor", "callbackMMFragmentActivityWhenResume curFragment == null");
            r8 = l91.C117467h.m165691f(r6, "com.tencent.mm.ui.conversation.MainUI");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x046f, code lost:
            if (r8 != null) goto L_0x04af;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0471, code lost:
            if (r6 != null) goto L_0x0474;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0480, code lost:
            if (e91.C116711b.m164587l(r6.getClass().getCanonicalName()) != false) goto L_0x0483;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
            r8 = java.lang.Class.forName(r6.getClass().getCanonicalName()).getDeclaredMethod("getMainTabCurFragment", new java.lang.Class[0]);
            r8.setAccessible(true);
            r7 = r8.invoke(r6, new java.lang.Object[0]);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:172:0x04a1, code lost:
            if (r7 == null) goto L_0x04ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:174:0x04a5, code lost:
            if ((r7 instanceof androidx.fragment.app.Fragment) == false) goto L_0x04ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x04a9, code lost:
            r9 = (androidx.fragment.app.Fragment) r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x04af, code lost:
            r10 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x0502, code lost:
            r18 = r13;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f8, code lost:
            if (r5.equals("com.tencent.mm.plugin.finder.ui.FinderHomeUI") == false) goto L_0x0106;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fb, code lost:
            t91.C22466j.f63626f.mo35602e((androidx.fragment.app.FragmentActivity) r0, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0103, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0106, code lost:
            r5 = t91.C22466j.f63630j;
            r5.getClass();
            r8 = r0.getClass().getName();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0119, code lost:
            if (t91.C64208c.f181942I.contains(r8) != false) goto L_0x011d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x011f, code lost:
            if (r5.f65378c == null) goto L_0x0123;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0123, code lost:
            r8 = e91.C116711b.m164583h(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0127, code lost:
            if (r8 != null) goto L_0x012b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x012b, code lost:
            r10 = r0.hashCode();
            r11 = r0.getIntent().getStringExtra("key_extra_info");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0139, code lost:
            if (r11 != null) goto L_0x013d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x013b, code lost:
            r11 = "";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x013d, code lost:
            p217oq.C11716d.f34294a = r11;
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("HABBYGE-MALI.FinderShareStatistics", "onActivityCreateV1, sPage=" + r8 + ", hashCode=" + r10);
            r9 = v91.C22731f.f65379a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0163, code lost:
            if (r9.mo35822g(r8, r10) != null) goto L_0x01fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0165, code lost:
            r12 = new te3.C22507la3();
            r12.f64159d = aa1.C91980d.vx0().mo84751Wb();
            r12.f64160e = r8;
            r12.f64161f = r10;
            r12.f64163h = r13;
            r12.f64166n = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a.mo175246c();
            r12.f64167o = 2;
            r12.f64169q = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0186, code lost:
            monitor-enter(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            r11 = r9.mo35816a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x018b, code lost:
            if (r11 != null) goto L_0x0192;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x018d, code lost:
            r11 = new te3.C64574na3();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0192, code lost:
            r3 = r12.f64160e + r12.f64161f;
            r15 = r11.f184449d;
            gy3.C87412m.m108593f(r15, "pageMap.map");
            r6 = r15.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x01b5, code lost:
            if (r6.hasNext() == false) goto L_0x01c7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c3, code lost:
            if (gy3.C87412m.m108589b(r3, r6.next().f184256d) == false) goto L_0x01b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c5, code lost:
            r6 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c7, code lost:
            r6 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c8, code lost:
            if (r6 != false) goto L_0x01db;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ca, code lost:
            r6 = new te3.C64549ma3();
            r6.f184256d = r3;
            r6.f184257e = r12;
            r11.f184449d.add(r6);
            r9.mo35818c(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x01db, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01dc, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("HABBYGE-MALI.FinderShareStatistics", "onActivityCreateV1, YES, sPage=" + r8 + ", hashCode=" + r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01fe, code lost:
            r3 = p217oq.C11716d.f34294a;
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("HABBYGE-MALI.FinderShareStatistics", "onActivityCreateV2, sPage=" + r8 + ", hashCode=" + r10);
            r6 = v91.C22731f.f65379a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0224, code lost:
            if (r6.mo35823h(r8, r10) != null) goto L_0x02c1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0226, code lost:
            r9 = new te3.C22507la3();
            r9.f64159d = aa1.C91980d.vx0().mo84751Wb();
            r9.f64160e = r8;
            r9.f64161f = r10;
            r9.f64163h = r13;
            r9.f64166n = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a.mo175246c();
            r9.f64167o = 1;
            r9.f64169q = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0247, code lost:
            monitor-enter(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            r3 = r6.mo35817b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x024c, code lost:
            if (r3 != null) goto L_0x0253;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x024e, code lost:
            r3 = new te3.C64574na3();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0253, code lost:
            r11 = r9.f64160e + r9.f64161f;
            r12 = r3.f184449d;
            gy3.C87412m.m108593f(r12, "pageMap.map");
            r12 = r12.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0276, code lost:
            if (r12.hasNext() == false) goto L_0x0288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0284, code lost:
            if (gy3.C87412m.m108589b(r11, r12.next().f184256d) == false) goto L_0x0272;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x0286, code lost:
            r12 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x0288, code lost:
            r12 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x0289, code lost:
            if (r12 != false) goto L_0x029c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x028b, code lost:
            r12 = new te3.C64549ma3();
            r12.f184256d = r11;
            r12.f184257e = r9;
            r3.f184449d.add(r12);
            r6.mo35819d(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:0x029c, code lost:
            monitor-exit(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x029d, code lost:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i("HABBYGE-MALI.FinderShareStatistics", "onActivityCreateV2, YES, sPage=" + r8 + ", hashCode=" + r10);
            r5.f65378c = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x02c1, code lost:
            r3 = r0.getClass().getName();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x02cf, code lost:
            if (t91.C64208c.f181941H.contains(r3) == false) goto L_0x03c5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x02d1, code lost:
            r6 = r5.f65377b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x02d3, code lost:
            if (r6 == null) goto L_0x02dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:0x02d9, code lost:
            if (gy3.C87412m.m108589b(r3, r6) != false) goto L_0x02dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x02dd, code lost:
            r5.f65377b = r3;
            r18 = new u91.C22623c((java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, 0, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 4095, (gy3.C8480h) null);
            r5.f65376a = r18;
            r18.f65064a = aa1.C91980d.vx0().mo84751Wb();
            r6 = r5.f65376a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:94:0x0310, code lost:
            if (r6 == null) goto L_0x03be;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x0312, code lost:
            r6.f65065b = e91.C116711b.m164583h(r3);
            r6 = r5.f65376a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x031a, code lost:
            if (r6 == null) goto L_0x03b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x031c, code lost:
            r6.f65067d = r13;
            r6.f65070g = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a.mo175246c();
            r6 = r5.f65376a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0328, code lost:
            if (r6 == null) goto L_0x03b0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x032a, code lost:
            r6.f65071h = 0;
            r8 = r0.getIntent().getStringExtra("key_extra_info");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x005f, code lost:
            if (r5.equals("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI") == false) goto L_0x0106;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x0529 A[LOOP:2: B:205:0x0523->B:207:0x0529, LOOP_END] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo33183b(java.lang.Object r37) {
            /*
                r36 = this;
                r1 = r36
                java.lang.String r0 = "HABBYGE-MALI.HellActivityStub"
                java.lang.String r2 = "mOnActivityListener, onPostResume: %s, %d"
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]
                java.lang.Class r5 = r37.getClass()
                java.lang.String r5 = r5.getName()
                r6 = 0
                r4[r6] = r5
                int r5 = r37.hashCode()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r7 = 1
                r4[r7] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r4)
                j91.d r0 = j91.C21203d.this
                j91.e r0 = r0.f59975a
                if (r0 == 0) goto L_0x0533
                r0 = r37
                android.app.Activity r0 = (android.app.Activity) r0
                boolean r2 = fi3.C86868b.m107886a(r0)
                if (r2 == 0) goto L_0x0533
                j91.d r2 = j91.C21203d.this
                j91.e r2 = r2.f59975a
                j91.b r2 = (j91.C21200b) r2
                boolean r4 = r2.f59972d
                if (r4 == 0) goto L_0x051b
                j91.c r4 = r2.f59971c
                r4.getClass()
                long r13 = java.lang.System.currentTimeMillis()
                t91.j r5 = t91.C22466j.f63621a
                java.lang.Class r5 = r0.getClass()
                java.lang.String r5 = r5.getName()
                int r8 = r5.hashCode()
                r9 = 0
                switch(r8) {
                    case -2055689330: goto L_0x00f2;
                    case -2013384910: goto L_0x00e1;
                    case -936307702: goto L_0x0063;
                    case 259026134: goto L_0x0059;
                    default: goto L_0x0057;
                }
            L_0x0057:
                goto L_0x0106
            L_0x0059:
                java.lang.String r8 = "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"
                boolean r5 = r5.equals(r8)
                if (r5 != 0) goto L_0x00fb
                goto L_0x0106
            L_0x0063:
                java.lang.String r8 = "com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI"
                boolean r5 = r5.equals(r8)
                if (r5 != 0) goto L_0x006d
                goto L_0x0106
            L_0x006d:
                t91.b r5 = t91.C22466j.f63626f
                r8 = r0
                androidx.fragment.app.FragmentActivity r8 = (androidx.fragment.app.FragmentActivity) r8
                r5.getClass()
                r91.b r5 = r5.f63606e
                if (r5 == 0) goto L_0x0103
                u91.c r8 = new u91.c
                r15 = r8
                r16 = 0
                r18 = 0
                r20 = 0
                r22 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r30 = r28
                r29 = r28
                r31 = 4095(0xfff, float:5.738E-42)
                r32 = 0
                r17 = 0
                r15.<init>(r16, r17, r18, r20, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                r5.f62958e = r8
                aa1.d r10 = aa1.C91980d.vx0()
                java.lang.String r10 = r10.mo84751Wb()
                r8.f65064a = r10
                u91.c r8 = r5.f62958e
                java.lang.String r10 = "statyTimeStaticLbsList"
                if (r8 == 0) goto L_0x00dd
                java.lang.String r11 = "com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI"
                java.lang.String r11 = e91.C116711b.m164583h(r11)
                r8.f65065b = r11
                u91.c r8 = r5.f62958e
                if (r8 == 0) goto L_0x00d9
                r8.f65067d = r13
                java.lang.String r10 = "143"
                r8.f65070g = r10
                r8.f65071h = r6
                u91.c r5 = r5.f62957d
                if (r5 == 0) goto L_0x00d2
                java.lang.String r8 = p217oq.C11716d.f34294a
                r5.f65073j = r8
                java.lang.String r5 = "HABBYGE-MALI.FinderHomeMonitor"
                java.lang.String r8 = "onFinderLbsStreamListUIResume..."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)
                goto L_0x0103
            L_0x00d2:
                java.lang.String r0 = "statyTimeStaticHome"
                gy3.C87412m.m108603p(r0)
                throw r9
            L_0x00d9:
                gy3.C87412m.m108603p(r10)
                throw r9
            L_0x00dd:
                gy3.C87412m.m108603p(r10)
                throw r9
            L_0x00e1:
                java.lang.String r8 = "com.tencent.mm.plugin.finder.ui.FinderConversationUI"
                boolean r5 = r5.equals(r8)
                if (r5 == 0) goto L_0x0106
                t91.b r5 = t91.C22466j.f63626f
                r8 = r0
                androidx.fragment.app.FragmentActivity r8 = (androidx.fragment.app.FragmentActivity) r8
                r5.mo35602e(r8, r13)
                goto L_0x0103
            L_0x00f2:
                java.lang.String r8 = "com.tencent.mm.plugin.finder.ui.FinderHomeUI"
                boolean r5 = r5.equals(r8)
                if (r5 != 0) goto L_0x00fb
                goto L_0x0106
            L_0x00fb:
                t91.b r5 = t91.C22466j.f63626f
                r8 = r0
                androidx.fragment.app.FragmentActivity r8 = (androidx.fragment.app.FragmentActivity) r8
                r5.mo35602e(r8, r13)
            L_0x0103:
                r3 = r9
                goto L_0x03c6
            L_0x0106:
                v91.d r5 = t91.C22466j.f63630j
                r5.getClass()
                java.lang.Class r8 = r0.getClass()
                java.lang.String r8 = r8.getName()
                java.util.ArrayList<java.lang.String> r10 = t91.C64208c.f181942I
                boolean r10 = r10.contains(r8)
                if (r10 != 0) goto L_0x011d
                goto L_0x02c1
            L_0x011d:
                java.lang.String r10 = r5.f65378c
                if (r10 == 0) goto L_0x0123
                goto L_0x02c1
            L_0x0123:
                java.lang.String r8 = e91.C116711b.m164583h(r8)
                if (r8 != 0) goto L_0x012b
                goto L_0x02c1
            L_0x012b:
                int r10 = r0.hashCode()
                android.content.Intent r11 = r0.getIntent()
                java.lang.String r12 = "key_extra_info"
                java.lang.String r11 = r11.getStringExtra(r12)
                if (r11 != 0) goto L_0x013d
                java.lang.String r11 = ""
            L_0x013d:
                p217oq.C11716d.f34294a = r11
                java.lang.String r12 = "HABBYGE-MALI.FinderShareStatistics"
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r9 = "onActivityCreateV1, sPage="
                r15.append(r9)
                r15.append(r8)
                java.lang.String r9 = ", hashCode="
                r15.append(r9)
                r15.append(r10)
                java.lang.String r9 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
                v91.f$a r9 = v91.C22731f.f65379a
                te3.la3 r12 = r9.mo35822g(r8, r10)
                if (r12 != 0) goto L_0x01fe
                te3.la3 r12 = new te3.la3
                r12.<init>()
                aa1.d r15 = aa1.C91980d.vx0()
                java.lang.String r15 = r15.mo84751Wb()
                r12.f64159d = r15
                r12.f64160e = r8
                r12.f64161f = r10
                r12.f64163h = r13
                com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r15 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
                java.lang.String r15 = r15.mo175246c()
                r12.f64166n = r15
                r12.f64167o = r3
                r12.f64169q = r11
                monitor-enter(r9)
                te3.na3 r11 = r9.mo35816a()     // Catch:{ all -> 0x01fb }
                if (r11 != 0) goto L_0x0192
                te3.na3 r11 = new te3.na3     // Catch:{ all -> 0x01fb }
                r11.<init>()     // Catch:{ all -> 0x01fb }
            L_0x0192:
                java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fb }
                r15.<init>()     // Catch:{ all -> 0x01fb }
                java.lang.String r3 = r12.f64160e     // Catch:{ all -> 0x01fb }
                r15.append(r3)     // Catch:{ all -> 0x01fb }
                int r3 = r12.f64161f     // Catch:{ all -> 0x01fb }
                r15.append(r3)     // Catch:{ all -> 0x01fb }
                java.lang.String r3 = r15.toString()     // Catch:{ all -> 0x01fb }
                java.util.LinkedList<te3.ma3> r15 = r11.f184449d     // Catch:{ all -> 0x01fb }
                java.lang.String r6 = "pageMap.map"
                gy3.C87412m.m108593f(r15, r6)     // Catch:{ all -> 0x01fb }
                java.util.Iterator r6 = r15.iterator()     // Catch:{ all -> 0x01fb }
            L_0x01b1:
                boolean r15 = r6.hasNext()     // Catch:{ all -> 0x01fb }
                if (r15 == 0) goto L_0x01c7
                java.lang.Object r15 = r6.next()     // Catch:{ all -> 0x01fb }
                te3.ma3 r15 = (te3.C64549ma3) r15     // Catch:{ all -> 0x01fb }
                java.lang.String r15 = r15.f184256d     // Catch:{ all -> 0x01fb }
                boolean r15 = gy3.C87412m.m108589b(r3, r15)     // Catch:{ all -> 0x01fb }
                if (r15 == 0) goto L_0x01b1
                r6 = 1
                goto L_0x01c8
            L_0x01c7:
                r6 = 0
            L_0x01c8:
                if (r6 != 0) goto L_0x01db
                te3.ma3 r6 = new te3.ma3     // Catch:{ all -> 0x01fb }
                r6.<init>()     // Catch:{ all -> 0x01fb }
                r6.f184256d = r3     // Catch:{ all -> 0x01fb }
                r6.f184257e = r12     // Catch:{ all -> 0x01fb }
                java.util.LinkedList<te3.ma3> r3 = r11.f184449d     // Catch:{ all -> 0x01fb }
                r3.add(r6)     // Catch:{ all -> 0x01fb }
                r9.mo35818c(r11)     // Catch:{ all -> 0x01fb }
            L_0x01db:
                monitor-exit(r9)
                java.lang.String r3 = "HABBYGE-MALI.FinderShareStatistics"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "onActivityCreateV1, YES, sPage="
                r6.append(r9)
                r6.append(r8)
                java.lang.String r9 = ", hashCode="
                r6.append(r9)
                r6.append(r10)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
                goto L_0x01fe
            L_0x01fb:
                r0 = move-exception
                monitor-exit(r9)
                throw r0
            L_0x01fe:
                java.lang.String r3 = p217oq.C11716d.f34294a
                java.lang.String r6 = "HABBYGE-MALI.FinderShareStatistics"
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "onActivityCreateV2, sPage="
                r9.append(r11)
                r9.append(r8)
                java.lang.String r11 = ", hashCode="
                r9.append(r11)
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r9)
                v91.f$a r6 = v91.C22731f.f65379a
                te3.la3 r9 = r6.mo35823h(r8, r10)
                if (r9 != 0) goto L_0x02c1
                te3.la3 r9 = new te3.la3
                r9.<init>()
                aa1.d r11 = aa1.C91980d.vx0()
                java.lang.String r11 = r11.mo84751Wb()
                r9.f64159d = r11
                r9.f64160e = r8
                r9.f64161f = r10
                r9.f64163h = r13
                com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r11 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
                java.lang.String r11 = r11.mo175246c()
                r9.f64166n = r11
                r9.f64167o = r7
                r9.f64169q = r3
                monitor-enter(r6)
                te3.na3 r3 = r6.mo35817b()     // Catch:{ all -> 0x02be }
                if (r3 != 0) goto L_0x0253
                te3.na3 r3 = new te3.na3     // Catch:{ all -> 0x02be }
                r3.<init>()     // Catch:{ all -> 0x02be }
            L_0x0253:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x02be }
                r11.<init>()     // Catch:{ all -> 0x02be }
                java.lang.String r12 = r9.f64160e     // Catch:{ all -> 0x02be }
                r11.append(r12)     // Catch:{ all -> 0x02be }
                int r12 = r9.f64161f     // Catch:{ all -> 0x02be }
                r11.append(r12)     // Catch:{ all -> 0x02be }
                java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x02be }
                java.util.LinkedList<te3.ma3> r12 = r3.f184449d     // Catch:{ all -> 0x02be }
                java.lang.String r15 = "pageMap.map"
                gy3.C87412m.m108593f(r12, r15)     // Catch:{ all -> 0x02be }
                java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x02be }
            L_0x0272:
                boolean r15 = r12.hasNext()     // Catch:{ all -> 0x02be }
                if (r15 == 0) goto L_0x0288
                java.lang.Object r15 = r12.next()     // Catch:{ all -> 0x02be }
                te3.ma3 r15 = (te3.C64549ma3) r15     // Catch:{ all -> 0x02be }
                java.lang.String r15 = r15.f184256d     // Catch:{ all -> 0x02be }
                boolean r15 = gy3.C87412m.m108589b(r11, r15)     // Catch:{ all -> 0x02be }
                if (r15 == 0) goto L_0x0272
                r12 = 1
                goto L_0x0289
            L_0x0288:
                r12 = 0
            L_0x0289:
                if (r12 != 0) goto L_0x029c
                te3.ma3 r12 = new te3.ma3     // Catch:{ all -> 0x02be }
                r12.<init>()     // Catch:{ all -> 0x02be }
                r12.f184256d = r11     // Catch:{ all -> 0x02be }
                r12.f184257e = r9     // Catch:{ all -> 0x02be }
                java.util.LinkedList<te3.ma3> r9 = r3.f184449d     // Catch:{ all -> 0x02be }
                r9.add(r12)     // Catch:{ all -> 0x02be }
                r6.mo35819d(r3)     // Catch:{ all -> 0x02be }
            L_0x029c:
                monitor-exit(r6)
                java.lang.String r3 = "HABBYGE-MALI.FinderShareStatistics"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r9 = "onActivityCreateV2, YES, sPage="
                r6.append(r9)
                r6.append(r8)
                java.lang.String r9 = ", hashCode="
                r6.append(r9)
                r6.append(r10)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r6)
                r5.f65378c = r8
                goto L_0x02c1
            L_0x02be:
                r0 = move-exception
                monitor-exit(r6)
                throw r0
            L_0x02c1:
                java.lang.Class r3 = r0.getClass()
                java.lang.String r3 = r3.getName()
                java.util.ArrayList<java.lang.String> r6 = t91.C64208c.f181941H
                boolean r6 = r6.contains(r3)
                if (r6 == 0) goto L_0x03c5
                java.lang.String r6 = r5.f65377b
                if (r6 == 0) goto L_0x02dd
                boolean r6 = gy3.C87412m.m108589b(r3, r6)
                if (r6 != 0) goto L_0x02dd
                goto L_0x03c5
            L_0x02dd:
                r5.f65377b = r3
                u91.c r6 = new u91.c
                r18 = r6
                r19 = 0
                r20 = 0
                r21 = 0
                r23 = 0
                r25 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 4095(0xfff, float:5.738E-42)
                r35 = 0
                r18.<init>(r19, r20, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35)
                r5.f65376a = r6
                aa1.d r8 = aa1.C91980d.vx0()
                java.lang.String r8 = r8.mo84751Wb()
                r6.f65064a = r8
                u91.c r6 = r5.f65376a
                if (r6 == 0) goto L_0x03be
                java.lang.String r8 = e91.C116711b.m164583h(r3)
                r6.f65065b = r8
                u91.c r6 = r5.f65376a
                if (r6 == 0) goto L_0x03b7
                r6.f65067d = r13
                com.tencent.mm.plugin.expt.hellhound.ext.session.config.b$a r8 = com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b.f345922a
                java.lang.String r8 = r8.mo175246c()
                r6.f65070g = r8
                u91.c r6 = r5.f65376a
                if (r6 == 0) goto L_0x03b0
                r8 = 0
                r6.f65071h = r8
                android.content.Intent r8 = r0.getIntent()
                java.lang.String r9 = "key_extra_info"
                java.lang.String r8 = r8.getStringExtra(r9)
                if (r8 != 0) goto L_0x033b
                java.lang.String r8 = ""
            L_0x033b:
                r6.f65073j = r8
                u91.c r6 = r5.f65376a
                if (r6 == 0) goto L_0x03a9
                java.lang.String r6 = r6.f65073j
                if (r6 != 0) goto L_0x0347
                java.lang.String r6 = ""
            L_0x0347:
                p217oq.C11716d.f34294a = r6
                java.lang.String r6 = "com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI"
                boolean r3 = gy3.C87412m.m108589b(r3, r6)
                if (r3 == 0) goto L_0x0367
                u91.c r3 = r5.f65376a
                if (r3 == 0) goto L_0x0360
                int r6 = t91.C64208c.f181944K
                r8 = 2
                if (r6 != r8) goto L_0x035c
                r6 = 1
                goto L_0x035d
            L_0x035c:
                r6 = 0
            L_0x035d:
                r3.f65072i = r6
                goto L_0x036e
            L_0x0360:
                java.lang.String r0 = "mStayTime"
                gy3.C87412m.m108603p(r0)
                r0 = 0
                throw r0
            L_0x0367:
                u91.c r3 = r5.f65376a
                if (r3 == 0) goto L_0x03a2
                r6 = 0
                r3.f65072i = r6
            L_0x036e:
                android.content.Intent r3 = r0.getIntent()
                java.lang.String r6 = "KEY_RINGTONE_REPORT_JSON"
                java.lang.String r3 = r3.getStringExtra(r6)
                if (r3 != 0) goto L_0x037c
                java.lang.String r3 = ""
            L_0x037c:
                v91.C22730d.f65375d = r3
                java.lang.String r3 = "HABBYGE-MALI.FinderShareStatistics"
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r8 = "doPageResume: "
                r6.append(r8)
                u91.c r5 = r5.f65376a
                if (r5 == 0) goto L_0x039b
                java.lang.String r5 = r5.f65065b
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                goto L_0x03c5
            L_0x039b:
                java.lang.String r0 = "mStayTime"
                gy3.C87412m.m108603p(r0)
                r3 = 0
                throw r3
            L_0x03a2:
                r3 = 0
                java.lang.String r0 = "mStayTime"
                gy3.C87412m.m108603p(r0)
                throw r3
            L_0x03a9:
                r3 = 0
                java.lang.String r0 = "mStayTime"
                gy3.C87412m.m108603p(r0)
                throw r3
            L_0x03b0:
                r3 = 0
                java.lang.String r0 = "mStayTime"
                gy3.C87412m.m108603p(r0)
                throw r3
            L_0x03b7:
                r3 = 0
                java.lang.String r0 = "mStayTime"
                gy3.C87412m.m108603p(r0)
                throw r3
            L_0x03be:
                r3 = 0
                java.lang.String r0 = "mStayTime"
                gy3.C87412m.m108603p(r0)
                throw r3
            L_0x03c5:
                r3 = 0
            L_0x03c6:
                e91.a r5 = e91.C20552a.m22323a()
                e91.e r5 = r5.f57844b
                l91.g r5 = (l91.C21406g) r5
                r5.getClass()
                boolean r6 = d91.C20449a.m22052d()
                if (r6 != 0) goto L_0x03d9
                goto L_0x0502
            L_0x03d9:
                boolean r6 = r0 instanceof androidx.fragment.app.FragmentActivity
                if (r6 == 0) goto L_0x0502
                l91.f r5 = r5.f60560a
                r6 = r0
                androidx.fragment.app.FragmentActivity r6 = (androidx.fragment.app.FragmentActivity) r6
                l91.e r5 = r5.f60559a
                java.lang.Class<?> r8 = r5.f60551b
                if (r8 == 0) goto L_0x0502
                boolean r8 = r8.isInstance(r6)
                if (r8 != 0) goto L_0x03f0
                goto L_0x0502
            L_0x03f0:
                boolean r8 = r6 instanceof com.tencent.p014mm.p136ui.MMFragmentActivity
                if (r8 == 0) goto L_0x03f7
                com.tencent.mm.ui.MMFragmentActivity r6 = (com.tencent.p014mm.p136ui.MMFragmentActivity) r6
                goto L_0x03f8
            L_0x03f7:
                r6 = r3
            L_0x03f8:
                androidx.fragment.app.Fragment r10 = l91.C117467h.m165689d(r6)
                java.lang.String r8 = "HABBYGE-MALI.FragmentLauncherUIMonitor"
                if (r10 == 0) goto L_0x0462
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "callbackMMFragmentActivityWhenResume: "
                r9.append(r11)
                java.lang.Class r11 = r10.getClass()
                java.lang.String r11 = r11.getName()
                r9.append(r11)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
                e91.d r9 = r5.f60550a
                if (r9 == 0) goto L_0x045e
                if (r6 == 0) goto L_0x042b
                java.lang.Class r3 = r6.getClass()
                java.lang.String r9 = r3.getCanonicalName()
                goto L_0x042c
            L_0x042b:
                r9 = r3
            L_0x042c:
                java.lang.Class r3 = r10.getClass()
                java.lang.String r11 = r3.getCanonicalName()
                int r12 = r10.hashCode()
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r15 = 0
                r3[r15] = r9
                r3[r7] = r11
                java.lang.String r7 = "callbackMMFActivityWhenResume, %s, %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r7, r3)
                java.lang.String r3 = "com.tencent.mm.ui.chatting.ChattingUI"
                boolean r3 = r3.equals(r9)
                if (r3 == 0) goto L_0x044e
                goto L_0x045e
            L_0x044e:
                e91.d r3 = r5.f60550a
                if (r3 == 0) goto L_0x045e
                r15 = 1
                r8 = r3
                l91.g r8 = (l91.C21406g) r8
                r9 = r6
                r18 = r13
                r8.mo33535f(r9, r10, r11, r12, r13, r15)
                goto L_0x04c9
            L_0x045e:
                r18 = r13
                goto L_0x04c9
            L_0x0462:
                r18 = r13
                java.lang.String r9 = "callbackMMFragmentActivityWhenResume curFragment == null"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r9)
                java.lang.String r8 = "com.tencent.mm.ui.conversation.MainUI"
                androidx.fragment.app.Fragment r8 = l91.C117467h.m165691f(r6, r8)
                if (r8 != 0) goto L_0x04af
                if (r6 != 0) goto L_0x0474
                goto L_0x04ac
            L_0x0474:
                java.lang.Class r8 = r6.getClass()
                java.lang.String r8 = r8.getCanonicalName()
                boolean r8 = e91.C116711b.m164587l(r8)
                if (r8 != 0) goto L_0x0483
                goto L_0x04ac
            L_0x0483:
                java.lang.Class r8 = r6.getClass()     // Catch:{ Exception -> 0x04ab }
                java.lang.String r8 = r8.getCanonicalName()     // Catch:{ Exception -> 0x04ab }
                java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ Exception -> 0x04ab }
                java.lang.String r9 = "getMainTabCurFragment"
                r10 = 0
                java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x04ab }
                java.lang.reflect.Method r8 = r8.getDeclaredMethod(r9, r11)     // Catch:{ Exception -> 0x04ab }
                r8.setAccessible(r7)     // Catch:{ Exception -> 0x04ab }
                java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x04ab }
                java.lang.Object r7 = r8.invoke(r6, r7)     // Catch:{ Exception -> 0x04ab }
                if (r7 == 0) goto L_0x04ac
                boolean r8 = r7 instanceof androidx.fragment.app.Fragment     // Catch:{ Exception -> 0x04ab }
                if (r8 == 0) goto L_0x04ac
                androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7     // Catch:{ Exception -> 0x04ab }
                r9 = r7
                goto L_0x04ad
            L_0x04ab:
            L_0x04ac:
                r9 = r3
            L_0x04ad:
                r10 = r9
                goto L_0x04b0
            L_0x04af:
                r10 = r8
            L_0x04b0:
                if (r10 == 0) goto L_0x04b8
                int r3 = r10.hashCode()
                r12 = r3
                goto L_0x04b9
            L_0x04b8:
                r12 = 0
            L_0x04b9:
                e91.d r3 = r5.f60550a
                if (r3 == 0) goto L_0x04c9
                r15 = 1
                r8 = r3
                l91.g r8 = (l91.C21406g) r8
                java.lang.String r11 = "com.tencent.mm.ui.conversation.MainUI"
                r9 = r6
                r13 = r18
                r8.mo33535f(r9, r10, r11, r12, r13, r15)
            L_0x04c9:
                if (r6 != 0) goto L_0x04cc
                goto L_0x04de
            L_0x04cc:
                java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
                r3.<init>(r6)
                r5.f60555f = r3
                i20.a r3 = i20.C21043a.m23197h()
                java.util.HashMap<java.lang.String, java.util.Map<java.lang.String, java.util.List<android.util.Pair<java.lang.String, java.lang.String>>>> r6 = r5.f60556g
                j20.d r7 = r5.f60554e
                r3.mo32760n(r6, r7)
            L_0x04de:
                l91.b r3 = r5.f60552c
                if (r3 == 0) goto L_0x0504
                l91.a r5 = l91.C21398a.f60538a
                l91.i r3 = r3.f60548d
                monitor-enter(r5)
                java.lang.String r6 = "listener"
                gy3.C87412m.m108594g(r3, r6)     // Catch:{ all -> 0x04ff }
                java.util.List<l91.i> r6 = l91.C21398a.f60542e     // Catch:{ all -> 0x04ff }
                java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x04ff }
                boolean r6 = r6.contains(r3)     // Catch:{ all -> 0x04ff }
                if (r6 != 0) goto L_0x04fd
                java.util.List<l91.i> r6 = l91.C21398a.f60542e     // Catch:{ all -> 0x04ff }
                java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x04ff }
                r6.add(r3)     // Catch:{ all -> 0x04ff }
            L_0x04fd:
                monitor-exit(r5)
                goto L_0x0504
            L_0x04ff:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            L_0x0502:
                r18 = r13
            L_0x0504:
                r5 = r18
                te3.a63 r3 = r4.mo33178b(r0, r5)
                g91.c r4 = g91.C20813c.m22810a()
                r5 = 203(0xcb, float:2.84E-43)
                r4.mo32508c(r5, r3)
                z91.b r3 = z91.C23462b.m28021f()
                r4 = 0
                r3.mo36917a(r0, r4)
            L_0x051b:
                java.util.List<h81.j$d> r2 = r2.f59969a
                java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
                java.util.Iterator r2 = r2.iterator()
            L_0x0523:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0533
                java.lang.Object r3 = r2.next()
                h81.j$d r3 = (h81.C20928j.C20932d) r3
                r3.mo32646d(r0)
                goto L_0x0523
            L_0x0533:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j91.C21203d.C21204a.mo33183b(java.lang.Object):void");
        }

        /* renamed from: c */
        public void mo33184c(Object obj) {
            boolean z;
            Log.m105925i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onResume: %s, %d", obj.getClass().getName(), Integer.valueOf(obj.hashCode()));
            if (C21203d.this.f59975a != null) {
                Activity activity = (Activity) obj;
                if (C86868b.m107886a(activity)) {
                    C21200b bVar = (C21200b) C21203d.this.f59975a;
                    if (bVar.f59972d) {
                        bVar.f59971c.getClass();
                        C20552a.m22323a().mo32135d(activity);
                        if (C116711b.m164586k(activity.getClass().getSimpleName())) {
                            Class<AppBrandUI> cls = AppBrandUI.class;
                            try {
                                boolean z2 = AppBrandUI.f246480N;
                                Field declaredField = cls.getDeclaredField("mRuntimeContainer");
                                declaredField.setAccessible(true);
                                Object obj2 = declaredField.get(activity);
                                Log.m105919d("HABBYGE-MALI.LazySessionId", "mRuntimeContainer: %s", obj2.getClass().getCanonicalName());
                                Method declaredMethod = Class.forName("com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer").getDeclaredMethod("getActiveRuntime", new Class[0]);
                                declaredMethod.setAccessible(true);
                                Object invoke = declaredMethod.invoke(obj2, new Object[0]);
                                Log.m105919d("HABBYGE-MALI.LazySessionId", "appBrandRuntime: %s", invoke.getClass().getCanonicalName());
                                Method declaredMethod2 = AppBrandRuntimeWCAccessible.class.getDeclaredMethod("isGame", new Class[]{AppBrandRuntime.class});
                                declaredMethod2.setAccessible(true);
                                z = ((Boolean) declaredMethod2.invoke((Object) null, new Object[]{invoke})).booleanValue();
                            } catch (Exception e) {
                                Log.printErrStackTrace("HABBYGE-MALI.LazySessionId", e, "isAppBrandGame, crash: %s", e.getMessage());
                                z = false;
                            }
                            if (z) {
                                C20813c.m22810a().mo32508c(WXWebReporter.WXXWEB_IDKEY_XWEB_LOAD_URL_MAX_FAILED_SWITCH_TO_SYS, "144");
                            }
                        }
                        C22466j.m26187h(activity, (Fragment) null, System.currentTimeMillis(), 5);
                        fh4 fh4 = new fh4();
                        fh4.f354001d = activity.getClass().getCanonicalName();
                        fh4.f354002e = activity.hashCode();
                        fh4.f354003f = System.currentTimeMillis();
                        C20813c.m22810a().mo32508c(202, fh4);
                        String str = fh4.f354001d;
                        C87412m.m108594g(str, "pageName");
                        switch (str.hashCode()) {
                            case -2031553009:
                                if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI")) {
                                    if (C22316b.f63280d == null) {
                                        C22316b.f63280d = new C22350n();
                                    }
                                    C22350n nVar = C22316b.f63280d;
                                    if (nVar != null) {
                                        nVar.mo35486e(0, str, activity);
                                        break;
                                    }
                                }
                                break;
                            case -1615773847:
                                if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI")) {
                                    if (C22316b.f63282f == null) {
                                        C22316b.f63282f = new C22341k();
                                    }
                                    C22341k kVar = C22316b.f63282f;
                                    if (kVar != null) {
                                        kVar.mo35483e(0, str, activity);
                                        break;
                                    }
                                }
                                break;
                            case -1605333887:
                                if (str.equals("com.tencent.mm.plugin.finder.search.FinderFeedSearchUI")) {
                                    if (C22316b.f63283g == null) {
                                        C22316b.f63283g = new C22344l();
                                    }
                                    C22344l lVar = C22316b.f63283g;
                                    if (lVar != null) {
                                        lVar.mo35484e(0, str, activity);
                                        break;
                                    }
                                }
                                break;
                            case -1490149623:
                                if (str.equals("com.tencent.mm.plugin.finder.ui.FinderMsgFeedDetailUI")) {
                                    if (C22316b.f63279c == null) {
                                        C22316b.f63279c = new C22317c();
                                    }
                                    C22317c cVar = C22316b.f63279c;
                                    if (cVar != null) {
                                        cVar.mo35475e(0, str, activity);
                                        break;
                                    }
                                }
                                break;
                            case -936307702:
                                if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorUI")) {
                                    if (C22316b.f63286j == null) {
                                        C22316b.f63286j = new C22332h();
                                    }
                                    C22332h hVar = C22316b.f63286j;
                                    if (hVar != null) {
                                        hVar.mo35481e(0, str, activity);
                                        break;
                                    }
                                }
                                break;
                            case 1670085563:
                                if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderFavTimelineUI")) {
                                    if (C22316b.f63285i == null) {
                                        C22316b.f63285i = new C22320d();
                                    }
                                    C22320d dVar = C22316b.f63285i;
                                    if (dVar != null) {
                                        dVar.mo35479e(0, str, activity);
                                        break;
                                    }
                                }
                                break;
                            case 1670607163:
                                if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderFeedRelTimelineUI")) {
                                    if (C22316b.f63284h == null) {
                                        C22316b.f63284h = new C22323e();
                                    }
                                    C22323e eVar = C22316b.f63284h;
                                    if (eVar != null) {
                                        eVar.mo35480e(0, str, activity);
                                        break;
                                    }
                                }
                                break;
                            case 1878606788:
                                if (str.equals("com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI")) {
                                    if (C22316b.f63281e == null) {
                                        C22316b.f63281e = new C22335i();
                                    }
                                    C22335i iVar = C22316b.f63281e;
                                    if (iVar != null) {
                                        iVar.mo35482e(0, str, activity);
                                        break;
                                    }
                                }
                                break;
                            case 1966129866:
                                if (str.equals("com.tencent.mm.plugin.finder.feed.ui.FinderTimelineUI")) {
                                    if (C22316b.f63278b == null) {
                                        C22316b.f63278b = new C22347m();
                                    }
                                    C22347m mVar = C22316b.f63278b;
                                    if (mVar != null) {
                                        mVar.mo35485e(0, str, activity);
                                        break;
                                    }
                                }
                                break;
                            case 2029821223:
                                if (str.equals("com.tencent.mm.plugin.finder.ui.FinderShareFeedDetailUI")) {
                                    if (C22316b.f63279c == null) {
                                        C22316b.f63279c = new C22317c();
                                    }
                                    C22317c cVar2 = C22316b.f63279c;
                                    if (cVar2 != null) {
                                        cVar2.mo35475e(0, str, activity);
                                        break;
                                    }
                                }
                                break;
                        }
                        C98625h.m128225a().mo138056b(0, fh4.f354001d, activity);
                        Map<String, WeakReference<View>> map = C117614e.f351842a;
                        C21611b bVar2 = (C21611b) ((C36570n) C117614e.f351845d).getValue();
                        bVar2.f61189a = C117614e.f351846e;
                        bVar2.f61190b = -1;
                        ArrayList arrayList = new ArrayList();
                        Pair create = Pair.create("onPageChange", "(IZ)V");
                        C87412m.m108593f(create, "create(METHOD_NAME, METHOD_DESC)");
                        arrayList.add(create);
                        bVar2.f61191c.put("com/tencent/mm/view/RecyclerHorizontalViewPager", arrayList);
                        C21043a.m23197h().mo32758l(bVar2.f61191c, bVar2.f61192d);
                        String simpleName = activity.getClass().getSimpleName();
                        if (C87412m.m108589b(simpleName, "SnsTimeLineUI")) {
                            C101740m mVar2 = C22466j.f63632l;
                            mVar2.getClass();
                            C21043a.m23197h().mo32760n(mVar2.f297817a, mVar2.f297818b);
                        } else if (C87412m.m108589b(simpleName, "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI")) {
                            C101740m mVar3 = C22466j.f63632l;
                            mVar3.getClass();
                            C21043a.m23197h().mo32760n(mVar3.f297817a, mVar3.f297818b);
                        }
                    } else {
                        String canonicalName = activity.getClass().getCanonicalName();
                        int hashCode = activity.hashCode();
                        C117394e.m165538d(canonicalName, (String) null, 105);
                        C21062c.m23249d().mo32771a(canonicalName, hashCode);
                        C21062c.m23249d().mo32777h(canonicalName, hashCode, C21060a.RESUME);
                    }
                    Iterator it = ((CopyOnWriteArrayList) bVar.f59969a).iterator();
                    while (it.hasNext()) {
                        ((C20928j.C20932d) it.next()).mo32640I(activity);
                    }
                }
            }
        }

        /* renamed from: d */
        public void mo33185d(Object obj) {
            Log.m105925i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, onStop: %s, %d", obj.getClass().getName(), Integer.valueOf(obj.hashCode()));
            if (C21203d.this.f59975a != null) {
                Activity activity = (Activity) obj;
                if (C86868b.m107886a(activity)) {
                    C21200b bVar = (C21200b) C21203d.this.f59975a;
                    if (bVar.f59972d) {
                        bVar.f59971c.getClass();
                        fh4 fh4 = new fh4();
                        fh4.f354002e = activity.hashCode();
                        fh4.f354001d = activity.getClass().getCanonicalName();
                        fh4.f354003f = System.currentTimeMillis();
                        C20813c.m22810a().mo32508c(206, fh4);
                    } else {
                        String canonicalName = activity.getClass().getCanonicalName();
                        int hashCode = activity.hashCode();
                        if (!"com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI".equals(canonicalName)) {
                            C117394e.m165538d(canonicalName, (String) null, 107);
                            C21062c.m23249d().mo32777h(canonicalName, hashCode, C21060a.STOP);
                        }
                    }
                    Iterator it = ((CopyOnWriteArrayList) bVar.f59969a).iterator();
                    while (it.hasNext()) {
                        ((C20928j.C20932d) it.next()).mo32647f(activity);
                    }
                }
            }
        }
    }

    /* renamed from: j91.d$b */
    public class C21205b implements C21152b {
        public C21205b() {
        }

        /* renamed from: a */
        public void mo33108a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
            if (obj != null && objArr != null && objArr.length > 0 && (obj instanceof Context) && !(obj instanceof Activity)) {
                if ("startActivity".equals(str4)) {
                    if (C21203d.this.f59975a != null && (objArr[0] instanceof Intent)) {
                        Log.m105925i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, startActivity: %s, %s, %s, %d, %s", str, str2, obj.getClass().getName(), Integer.valueOf(obj.hashCode()), "from: mContextListener");
                        ((C21200b) C21203d.this.f59975a).mo33175a((Activity) null, objArr[0]);
                    }
                } else if ("startActivities".equals(str4) && C21203d.this.f59975a != null) {
                    Intent[] intentArr = objArr[0];
                    if (intentArr instanceof Intent[]) {
                        Intent[] intentArr2 = intentArr;
                        if (intentArr2.length > 0) {
                            Log.m105925i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, startActivities: %s, %s, %s, %d, %s", str, str2, obj.getClass().getName(), Integer.valueOf(obj.hashCode()), "from: mContextListener");
                            ((C21200b) C21203d.this.f59975a).mo33175a((Activity) null, intentArr2[0]);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo33109b(String str, String str2, String str3, String str4, String str5, Object obj, Object obj2) {
        }
    }

    /* renamed from: j91.d$c */
    public class C21206c implements C113066a {
        public C21206c() {
        }

        /* renamed from: bF */
        public void mo33186bF(Activity activity) {
            if (activity != null) {
                ((C21204a) C21203d.this.f59976b).mo33182a(activity);
                ((C21204a) C21203d.this.f59976b).mo33185d(activity);
                if ((activity instanceof FragmentActivity) && C116711b.m164587l(activity.getClass().getName())) {
                    Fragment c = C117467h.m165688c((FragmentActivity) activity);
                    Log.m105925i("HABBYGE-MALI.HellActivityStub", "onVASEnter add fragment pause event [%s]", c);
                    ((C61212e) C86312j.m106911c(C61212e.class)).mo86150RW(c, true);
                }
            }
        }

        /* renamed from: jo */
        public void mo33187jo(Activity activity) {
            if (activity != null) {
                ((C21204a) C21203d.this.f59976b).mo33184c(activity);
                ((C21204a) C21203d.this.f59976b).mo33183b(activity);
                if ((activity instanceof FragmentActivity) && C116711b.m164587l(activity.getClass().getName())) {
                    Fragment c = C117467h.m165688c((FragmentActivity) activity);
                    Log.m105925i("HABBYGE-MALI.HellActivityStub", "onVASExit add fragment resume event [%s]", c);
                    ((C61212e) C86312j.m106911c(C61212e.class)).mo86143M0(c);
                }
            }
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostPaused(Activity activity) {
        }

        public void onActivityPostResumed(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void r50(Object obj, Intent intent) {
        }
    }

    public C21203d(C21207e eVar) {
        this.f59975a = eVar;
    }
}
