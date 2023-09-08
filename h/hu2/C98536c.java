package hu2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94916o0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.protocal.protobuf.SnsObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32227p;
import gy3.C87412m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;
import kj2.C61103a;
import kotlin.ResultKt;
import l31.C99333f;
import ob0.C11385n;
import ob0.C117747y;
import pu2.C62549p;
import rx3.C13598b0;
import ut2.C102101q;
import ut2.C102104r;
import wx3.C15601d;
import wx3.C66217g;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z31.C102972b;
import z31.C16097e;

/* renamed from: hu2.c */
public final class C98536c extends C98528a implements C11385n {

    /* renamed from: f */
    public final TreeSet<String> f288949f = new TreeSet<>();

    /* renamed from: g */
    public int f288950g;

    /* renamed from: h */
    public long f288951h;

    /* renamed from: i */
    public int f288952i;

    /* renamed from: j */
    public String f288953j = "";

    /* renamed from: n */
    public String f288954n = "";

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1", mo125469f = "Report12076.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: hu2.c$a */
    public static final class C98537a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C98536c f288955d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98537a(C98536c cVar, C15601d<? super C98537a> dVar) {
            super(2, dVar);
            this.f288955d = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
            C98537a aVar = new C98537a(this.f288955d, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
            Object invokeSuspend = ((C98537a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
            ResultKt.throwOnFailure(obj);
            C98536c cVar = this.f288955d;
            SnsMethodCalculate.markStartTimeMs("access$initFirstFeedId", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
            cVar.getClass();
            SnsMethodCalculate.markStartTimeMs("initFirstFeedId", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
            cVar.f288951h = C94866e1.Yx0().c40(0, 1, true);
            SnsMethodCalculate.markEndTimeMs("initFirstFeedId", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
            SnsMethodCalculate.markEndTimeMs("access$initFirstFeedId", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onCreate$1");
            return b0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.report.Report12076", mo125469f = "Report12076.kt", mo125470l = {90}, mo125471m = "onScrollStateChanged")
    /* renamed from: hu2.c$b */
    public static final class C98538b extends C66704d {

        /* renamed from: d */
        public Object f288956d;

        /* renamed from: e */
        public Object f288957e;

        /* renamed from: f */
        public /* synthetic */ Object f288958f;

        /* renamed from: g */
        public final /* synthetic */ C98536c f288959g;

        /* renamed from: h */
        public int f288960h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98538b(C98536c cVar, C15601d<? super C98538b> dVar) {
            super(dVar);
            this.f288959g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onScrollStateChanged$1");
            this.f288958f = obj;
            this.f288960h |= Integer.MIN_VALUE;
            Object f = this.f288959g.mo137889f((RecyclerView) null, (C102104r) null, 0, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076$onScrollStateChanged$1");
            return f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98536c(C102101q qVar) {
        super(qVar);
        C87412m.m108594g(qVar, "uic");
    }

    /* renamed from: b */
    public void mo137885b(Bundle bundle) {
        Class cls = C99333f.class;
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        super.mo137885b(bundle);
        C66217g gVar = null;
        C98537a aVar = new C98537a(this, (C15601d<? super C98537a>) null);
        SnsMethodCalculate.markStartTimeMs("launch$default", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        if (true && true) {
            gVar = C66217g.f190253d;
        }
        C66217g gVar2 = gVar;
        SnsMethodCalculate.markStartTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        C87412m.m108594g(gVar2, "context");
        C0000n0 n0Var = C62549p.f177651a;
        if (n0Var != null) {
            C53895h.m60466d(n0Var, gVar2, (C53934p0) null, aVar, 2, (Object) null);
        }
        SnsMethodCalculate.markEndTimeMs("launch", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        SnsMethodCalculate.markEndTimeMs("launch$default", "com.tencent.mm.plugin.sns.ui.item.improve.TimelineCoroutines");
        long currentTimeMillis = System.currentTimeMillis();
        C86709a0.m107529k().f251779b.mo123455a(211, this);
        ((C99333f) C86312j.m106911c(cls)).mo138724nU(12076, "StartBrowseTime", Long.valueOf(currentTimeMillis));
        ((C99333f) C86312j.m106911c(cls)).mo138724nU(12076, "EnterObjectId", Long.valueOf(currentTimeMillis));
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        C102972b bVar = C102972b.f303874a;
        bVar.getClass();
        C61103a a = bVar.mo142707a(12076, true);
        if (a != null) {
            a.mo86052l("BrowseTime", Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* renamed from: c */
    public void mo137886c() {
        long j;
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        super.mo137886c();
        this.f288950g = this.f288949f.size();
        if (!this.f288949f.isEmpty()) {
            String last = this.f288949f.last();
            C87412m.m108593f(last, "feedSet.last()");
            this.f288953j = last;
            String first = this.f288949f.first();
            C87412m.m108593f(first, "feedSet.first()");
            this.f288954n = first;
        }
        C86709a0.m107529k().f251779b.mo123470p(211, this);
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        C102972b bVar = C102972b.f303874a;
        bVar.mo142709c(12076, "BrowseFeedCount", Integer.valueOf(this.f288950g));
        bVar.mo142709c(12076, "BrowseNewFeedCount", Integer.valueOf(this.f288952i));
        bVar.mo142709c(12076, "StartBrowseSnsObjectId", this.f288953j);
        bVar.mo142709c(12076, "EndBrowseSnsObjectId", this.f288954n);
        C61103a a = bVar.mo142707a(12076, true);
        if (a != null) {
            Object i = a.mo86050i("BrowseTime");
            if (i instanceof Integer) {
                j = (long) ((Number) i).intValue();
            } else {
                C87412m.m108592e(i, "null cannot be cast to non-null type kotlin.Long");
                j = ((Long) i).longValue();
            }
            a.mo86052l("BrowseTime", Long.valueOf(System.currentTimeMillis() - j));
        }
        bVar.mo142708b(12076, "ClickFeedIdList", "ClickFeedCount");
        bVar.mo142708b(12076, "ExposeFeedIdList", "ExposeFeedCount");
        bVar.mo142708b(12076, "FavFeedIdList", "FavFeedCount");
        bVar.mo142708b(12076, "ClickAlbumUserList", "ClickAlbumCount");
        bVar.mo142708b(12076, "ForwardFeedIdList", "ForwardFeedIdCount");
        bVar.mo142708b(12076, "ClickAvatarFeedIdList", "ClickAvatarFeedIdCount");
        bVar.mo142708b(12076, "ClickNickNameFeedIdList", "NickNameFeedIdCount");
        bVar.mo142708b(12076, "ForwardToSingleChatFeedIdList", "ForwardToSingleChatFeedIdCount");
        bVar.mo142708b(12076, "ForwardToChatRoomFeedIdList", "ForwardToChatRoomFeedIdCount");
        C61103a a2 = bVar.mo142707a(12076, false);
        if (a2 == null) {
            C102972b.f303877d.remove(12076);
            C102972b.f303875b.remove(12076);
            return;
        }
        HashSet<C16097e> hashSet = C102972b.f303877d.get(12076);
        if (hashSet != null) {
            for (C16097e eVar : hashSet) {
                a2.mo86052l(eVar.f43248a, Integer.valueOf(eVar.f43249b.size()));
                Log.m105918d("MicroMsg.KVReportManager", "logid:" + 12076 + " key:" + eVar.f43248a + " value:" + eVar.f43249b.size());
            }
        }
        Iterator<Map.Entry<String, Long>> it = C102972b.f303876c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Long> next = it.next();
            C87412m.m108593f(next, "iterator.next()");
            Object key = next.getKey();
            C87412m.m108593f(key, "item.key");
            if (C112550d0.m153801u((CharSequence) key, String.valueOf(12076), false)) {
                it.remove();
            }
        }
        a2.mo86054n();
        C102972b.f303877d.remove(12076);
        C102972b.f303875b.remove(12076);
    }

    /* renamed from: d */
    public void mo137887d() {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        super.mo137887d();
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        C102972b bVar = C102972b.f303874a;
        bVar.mo142712f(12076, "BackGroundTime");
        bVar.mo142711e(12076, "BrowseTimeLineTime");
    }

    /* renamed from: e */
    public void mo137888e() {
        Class cls = C99333f.class;
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        super.mo137888e();
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseMyAlbumTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseOtherAlbumTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseMessageListTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "ClickNewPostTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseFullScreenImageTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseFullScreenSightTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseMPArticleTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseExternalArticleTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseAdFullScreenTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseAdCanvasPageTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseAdShortVideoTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseAdLongVideoTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "BrowseForwardAdLongVideoTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "FinderFeedTime");
        ((C99333f) C86312j.m106911c(cls)).mo138725nY(12076, "MusicPlayerFeedTime");
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        C102972b bVar = C102972b.f303874a;
        bVar.mo142712f(12076, "BrowseTimeLineTime");
        bVar.mo142711e(12076, "BackGroundTime");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: ut2.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065 A[LOOP:0: B:18:0x005f->B:20:0x0065, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo137889f(androidx.recyclerview.widget.RecyclerView r7, ut2.C102104r r8, int r9, wx3.C15601d<? super rx3.C13598b0> r10) {
        /*
            r6 = this;
            java.lang.String r0 = "onScrollStateChanged"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.report.Report12076"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r10 instanceof hu2.C98536c.C98538b
            if (r2 == 0) goto L_0x001b
            r2 = r10
            hu2.c$b r2 = (hu2.C98536c.C98538b) r2
            int r3 = r2.f288960h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f288960h = r3
            goto L_0x0020
        L_0x001b:
            hu2.c$b r2 = new hu2.c$b
            r2.<init>(r6, r10)
        L_0x0020:
            java.lang.Object r10 = r2.f288958f
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f288960h
            r5 = 1
            if (r4 == 0) goto L_0x0043
            if (r4 != r5) goto L_0x0038
            java.lang.Object r7 = r2.f288957e
            r8 = r7
            ut2.r r8 = (ut2.C102104r) r8
            java.lang.Object r7 = r2.f288956d
            hu2.c r7 = (hu2.C98536c) r7
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0057
        L_0x0038:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r7
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r10)
            r2.f288956d = r6
            r2.f288957e = r8
            r2.f288960h = r5
            java.lang.Object r7 = super.mo137889f(r7, r8, r9, r2)
            if (r7 != r3) goto L_0x0056
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x0056:
            r7 = r6
        L_0x0057:
            java.util.ArrayList r8 = r8.mo141604a()
            java.util.Iterator r8 = r8.iterator()
        L_0x005f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0088
            java.lang.Object r9 = r8.next()
            ut2.j r9 = (ut2.C65477j) r9
            java.util.TreeSet<java.lang.String> r10 = r7.f288949f
            r9.getClass()
            java.lang.String r2 = "getItem"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveItemSnapshot"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            iu2.a r9 = r9.f188429b
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            gu2.b r9 = r9.mo138170b()
            java.lang.String r9 = r9.mo137504B2()
            r10.add(r9)
            goto L_0x005f
        L_0x0088:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hu2.C98536c.mo137889f(androidx.recyclerview.widget.RecyclerView, ut2.r, int, wx3.d):java.lang.Object");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
        boolean z = false;
        if (yVar != null && yVar.getType() == 211) {
            z = true;
        }
        if (z) {
            C87412m.m108592e(yVar, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.model.NetSceneSnsTimeLine");
            C94916o0 o0Var = (C94916o0) yVar;
            if (o0Var.mo131165Z0()) {
                LinkedList<SnsObject> linkedList = o0Var.mo131170k1().f299592f;
                if (linkedList.isEmpty()) {
                    SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
                    return;
                }
                for (SnsObject snsObject : linkedList) {
                    if (snsObject.f283891Id > this.f288951h) {
                        this.f288952i++;
                    }
                }
                this.f288951h = linkedList.getFirst().f283891Id;
            }
        }
        SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ui.improve.report.Report12076");
    }
}
