package rs1;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C113200q;
import bl3.C39818r;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.video.FinderVideoLayout;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo;
import com.tencent.p014mm.protocal.protobuf.FinderAuthInfo;
import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.protocal.protobuf.FinderObjectDesc;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import df1.C58259c;
import di3.C86312j;
import eb0.C31543z5;
import ef1.C58553c;
import ef1.C58555d;
import ef1.C7637b;
import er1.C58784w3;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import jq3.C60905o;
import l31.C61212e;
import o40.C61926c;
import p629ny.C76979h;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C110818d0;
import sx3.C90364q0;
import te3.C110964i13;
import te3.C48693ac1;
import te3.C49712hj1;
import te3.C52192z0;
import te3.C64272c13;
import te3.C64459j13;
import te3.C64827xe1;
import te3.C64897zv2;
import up1.C37521f;
import yl1.C66663a;
import yl1.C66667b;
import zt3.C119157j;

@C113200q(initialMode = 2)
/* renamed from: rs1.v */
public final class C63648v extends UIComponent {

    /* renamed from: d */
    public C66663a f180438d;

    /* renamed from: e */
    public final C64897zv2 f180439e = new C64897zv2();

    /* renamed from: f */
    public final C13601g f180440f = C36568h.m40985a(C36478b.f97058d);

    /* renamed from: g */
    public final C13601g f180441g = C36568h.m40985a(C36479c.f97059d);

    /* renamed from: h */
    public final ConcurrentHashMap<Long, MultiTaskInfo> f180442h = new ConcurrentHashMap<>();

    /* renamed from: i */
    public boolean f180443i;

    /* renamed from: j */
    public boolean f180444j;

    /* renamed from: n */
    public final C63650d f180445n = new C63650d(this);

    /* renamed from: rs1.v$f */
    public static final class C13481f extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C63648v f38201d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13481f(C63648v vVar) {
            super(0);
            this.f38201d = vVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: cm1.i2} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r8 = this;
                bl3.r r0 = bl3.C39818r.f106831a
                rs1.v r1 = r8.f38201d
                androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
                bl3.r$a r0 = r0.mo62444c(r1)
                java.lang.Class<rs1.o6> r1 = rs1.C13354o6.class
                bl3.t r0 = r0.mo62449e(r1)
                rs1.o6 r0 = (rs1.C13354o6) r0
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0025
                rs1.v r2 = r8.f38201d
                com.tencent.mm.plugin.finder.feed.n r0 = r0.f37856d
                jq3.o r0 = r0.mo2931f()
                r2.mo88474e3(r0, r1)
                goto L_0x00a5
            L_0x0025:
                rs1.v r0 = r8.f38201d
                androidx.recyclerview.widget.RecyclerView r0 = r0.mo88475f3()
                if (r0 == 0) goto L_0x00a5
                rs1.v r3 = r8.f38201d
                androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r0.getLayoutManager()
                boolean r5 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
                r6 = 0
                if (r5 == 0) goto L_0x003b
                androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
                goto L_0x003c
            L_0x003b:
                r4 = r6
            L_0x003c:
                if (r4 != 0) goto L_0x0040
                goto L_0x00a5
            L_0x0040:
                int r4 = r4.mo16957C()
                androidx.recyclerview.widget.RecyclerView$z r4 = r0.mo17023I0(r4)
                boolean r5 = r4 instanceof jq3.C60905o
                if (r5 == 0) goto L_0x004f
                jq3.o r4 = (jq3.C60905o) r4
                goto L_0x0050
            L_0x004f:
                r4 = r6
            L_0x0050:
                if (r4 == 0) goto L_0x00a5
                java.lang.Object r5 = r4.f173503E
                boolean r7 = r5 instanceof cm1.C0740i2
                if (r7 == 0) goto L_0x005b
                cm1.i2 r5 = (cm1.C0740i2) r5
                goto L_0x005c
            L_0x005b:
                r5 = r6
            L_0x005c:
                if (r5 == 0) goto L_0x0068
                int r5 = r5.mo75c()
                r7 = 9
                if (r5 != r7) goto L_0x0068
                r5 = 1
                goto L_0x0069
            L_0x0068:
                r5 = 0
            L_0x0069:
                if (r5 == 0) goto L_0x007a
                android.content.Context r0 = r0.getContext()
                r1 = 2131826593(0x7f1117a1, float:1.9286075E38)
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (int) r1, (int) r2)
                r0.show()
                goto L_0x00a0
            L_0x007a:
                java.lang.Object r5 = r4.f173503E
                boolean r7 = r5 instanceof cm1.C0740i2
                if (r7 == 0) goto L_0x0083
                r6 = r5
                cm1.i2 r6 = (cm1.C0740i2) r6
            L_0x0083:
                if (r6 == 0) goto L_0x008f
                int r5 = r6.mo75c()
                r6 = 15
                if (r5 != r6) goto L_0x008f
                r5 = 1
                goto L_0x0090
            L_0x008f:
                r5 = 0
            L_0x0090:
                if (r5 == 0) goto L_0x00a2
                android.content.Context r0 = r0.getContext()
                r1 = 2131826626(0x7f1117c2, float:1.9286142E38)
                android.widget.Toast r0 = nj3.C76912y0.makeText((android.content.Context) r0, (int) r1, (int) r2)
                r0.show()
            L_0x00a0:
                r1 = 0
                goto L_0x00a5
            L_0x00a2:
                r3.mo88474e3(r4, r1)
            L_0x00a5:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C63648v.C13481f.invoke():java.lang.Object");
        }
    }

    /* renamed from: rs1.v$b */
    public static final class C36478b extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C36478b f97058d = new C36478b();

        public C36478b() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return C37521f.f99160E4.mo60266n();
        }
    }

    /* renamed from: rs1.v$c */
    public static final class C36479c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C36479c f97059d = new C36479c();

        public C36479c() {
            super(0);
        }

        public Object invoke() {
            C37521f.f99374d.getClass();
            return C37521f.f99169F4.mo60266n();
        }
    }

    /* renamed from: rs1.v$a */
    public static final class C63649a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63648v f180446d;

        /* renamed from: e */
        public final /* synthetic */ Object f180447e;

        /* renamed from: f */
        public final /* synthetic */ int f180448f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63649a(C63648v vVar, Object obj, int i) {
            super(0);
            this.f180446d = vVar;
            this.f180447e = obj;
            this.f180448f = i;
        }

        public Object invoke() {
            try {
                C63648v vVar = this.f180446d;
                Object obj = this.f180447e;
                C87412m.m108593f(obj, "item");
                C63648v.m74965c3(vVar, (C55018j0) obj, this.f180448f);
            } catch (Throwable th) {
                Log.m105921e("FinderAddHistoryUIC", "addOrUpdateHistory: addToTaskbar, ", th);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: rs1.v$d */
    public static final class C63650d extends C58555d {

        /* renamed from: g */
        public final /* synthetic */ C63648v f180449g;

        /* renamed from: rs1.v$d$a */
        public static final class C63651a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63648v f180450d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63651a(C63648v vVar) {
                super(0);
                this.f180450d = vVar;
            }

            public Object invoke() {
                this.f180450d.mo88473d3();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: rs1.v$d$b */
        public static final class C63652b extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63648v f180451d;

            /* renamed from: e */
            public final /* synthetic */ C7637b f180452e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63652b(C63648v vVar, C7637b bVar) {
                super(0);
                this.f180451d = vVar;
                this.f180452e = bVar;
            }

            public Object invoke() {
                C63648v vVar = this.f180451d;
                long j = ((C58259c.C58260a) this.f180452e).f166817h;
                vVar.getClass();
                C61926c.m72657B("addHistory", true, new C63666x(vVar, j));
                return C13598b0.f38549a;
            }
        }

        public C63650d(C63648v vVar) {
            this.f180449g = vVar;
        }

        /* JADX WARNING: type inference failed for: r4v3, types: [cm1.i2] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: B1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2331B1(ef1.C7637b r13) {
            /*
                r12 = this;
                java.lang.String r0 = "ev"
                gy3.C87412m.m108594g(r13, r0)
                boolean r0 = r13 instanceof df1.C58259c.C58260a
                if (r0 == 0) goto L_0x00ed
                r0 = r13
                df1.c$a r0 = (df1.C58259c.C58260a) r0
                int r1 = r0.f166811b
                r2 = 3
                if (r1 != r2) goto L_0x00ed
                rs1.v r1 = r12.f180449g
                androidx.recyclerview.widget.RecyclerView r1 = r1.mo88475f3()
                r2 = 0
                if (r1 == 0) goto L_0x001f
                androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()
                goto L_0x0020
            L_0x001f:
                r1 = r2
            L_0x0020:
                boolean r3 = r1 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
                if (r3 == 0) goto L_0x0027
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
                goto L_0x0028
            L_0x0027:
                r1 = r2
            L_0x0028:
                if (r1 == 0) goto L_0x00ed
                rs1.v r3 = r12.f180449g
                java.util.List r1 = r1.getData()
                java.util.Iterator r1 = r1.iterator()
            L_0x0034:
                boolean r4 = r1.hasNext()
                r5 = 0
                r6 = 1
                if (r4 == 0) goto L_0x0053
                java.lang.Object r4 = r1.next()
                r7 = r4
                cm1.i2 r7 = (cm1.C0740i2) r7
                long r7 = r7.getItemId()
                long r9 = r0.f166817h
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 != 0) goto L_0x004f
                r7 = 1
                goto L_0x0050
            L_0x004f:
                r7 = 0
            L_0x0050:
                if (r7 == 0) goto L_0x0034
                goto L_0x0054
            L_0x0053:
                r4 = r2
            L_0x0054:
                cm1.i2 r4 = (cm1.C0740i2) r4
                boolean r1 = r4 instanceof cm1.C55018j0
                if (r1 == 0) goto L_0x005d
                r2 = r4
                cm1.j0 r2 = (cm1.C55018j0) r2
            L_0x005d:
                if (r2 == 0) goto L_0x00ed
                com.tencent.mm.plugin.finder.storage.FinderItem r1 = r2.mo3513o()
                boolean r1 = r1.isLongVideo()
                if (r1 != 0) goto L_0x006a
                return
            L_0x006a:
                rx3.g r1 = r3.f180440f
                rx3.n r1 = (rx3.C36570n) r1
                java.lang.Object r1 = r1.getValue()
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                int r4 = r0.f166816g
                rx3.g r7 = r3.f180441g
                rx3.n r7 = (rx3.C36570n) r7
                java.lang.Object r7 = r7.getValue()
                java.lang.Number r7 = (java.lang.Number) r7
                int r7 = r7.intValue()
                int r4 = r4 - r7
                int r7 = r0.f166815f
                if (r1 > r7) goto L_0x0091
                if (r7 > r4) goto L_0x0091
                r1 = 1
                goto L_0x0092
            L_0x0091:
                r1 = 0
            L_0x0092:
                if (r1 == 0) goto L_0x009e
                r2.f154480e = r5
                rs1.v$d$a r1 = new rs1.v$d$a
                r1.<init>(r3)
                o40.C61926c.m72668M(r1)
            L_0x009e:
                int r1 = r0.f166815f
                int r4 = r0.f166816g
                rx3.g r5 = r3.f180441g
                rx3.n r5 = (rx3.C36570n) r5
                java.lang.Object r5 = r5.getValue()
                java.lang.Number r5 = (java.lang.Number) r5
                int r5 = r5.intValue()
                int r4 = r4 - r5
                if (r1 < r4) goto L_0x00ed
                boolean r1 = r2.f154480e
                if (r1 != 0) goto L_0x00ed
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "onEventHappen: delete from history, offset = "
                r1.append(r4)
                int r4 = r0.f166815f
                r1.append(r4)
                java.lang.String r4 = ", total = "
                r1.append(r4)
                int r4 = r0.f166816g
                r1.append(r4)
                java.lang.String r4 = ", feedId = "
                r1.append(r4)
                long r4 = r0.f166817h
                r1.append(r4)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = "FinderAddHistoryUIC"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                r2.f154480e = r6
                rs1.v$d$b r0 = new rs1.v$d$b
                r0.<init>(r3, r13)
                o40.C61926c.m72668M(r0)
            L_0x00ed:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C63648v.C63650d.mo2331B1(ef1.b):void");
        }

        /* renamed from: y1 */
        public boolean mo2424y1() {
            return false;
        }

        /* renamed from: z1 */
        public boolean mo2333z1(C58553c cVar, C7637b bVar) {
            C87412m.m108594g(cVar, "dispatcher");
            C87412m.m108594g(bVar, "event");
            return (bVar instanceof C58259c.C58260a) && ((C58259c.C58260a) bVar).f166811b == 3;
        }
    }

    /* renamed from: rs1.v$e */
    public static final class C63653e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C63648v f180453d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63653e(C63648v vVar) {
            super(0);
            this.f180453d = vVar;
        }

        public Object invoke() {
            C63648v vVar = this.f180453d;
            if (!vVar.f180444j) {
                vVar.mo88473d3();
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63648v(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public static final void m74965c3(C63648v vVar, C55018j0 j0Var, int i) {
        String str;
        boolean z;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        String str2;
        String str3;
        vVar.getClass();
        boolean z2 = true;
        int i2 = 0;
        if (Util.isNullOrNil(j0Var.mo3513o().getDescription())) {
            Resources resources = vVar.getContext().getResources();
            Object[] objArr = new Object[1];
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Activity context = vVar.getContext();
            C58969q l = j0Var.mo3507l();
            objArr[0] = hVar.mo107057T1(context, l != null ? l.getNickname() : null);
            str = resources.getString(C0966R.string.m_1, objArr);
        } else {
            str = j0Var.mo3513o().getDescription();
        }
        C87412m.m108593f(str, "if (Util.isNullOrNil(vid…eo.feedObject.description");
        C64897zv2 zv22 = vVar.f180439e;
        zv22.f186887i = 0;
        zv22.f186885g = i;
        LinkedList<C48693ac1> linkedList2 = zv22.f186883e;
        if (linkedList2 != null) {
            linkedList2.clear();
        }
        LinkedList<FinderObject> linkedList3 = vVar.f180439e.f186888j;
        if (linkedList3 != null) {
            linkedList3.clear();
        }
        LinkedList<FinderObject> linkedList4 = vVar.f180439e.f186888j;
        if (linkedList4 != null) {
            linkedList4.add(j0Var.mo3513o().getFeedObject());
        }
        vVar.f180439e.f186889n = j0Var.mo3513o().getTimestamps() + (((long) j0Var.mo3513o().getFeedObject().urlValidDuration) * 1000);
        MultiTaskInfo multiTaskInfo = vVar.f180442h.get(Long.valueOf(j0Var.getItemId()));
        if (multiTaskInfo != null) {
            C66663a aVar = vVar.f180438d;
            if (aVar != null) {
                aVar.f326418a = multiTaskInfo;
                z = true;
            } else {
                C87412m.m108603p("multiTaskHelper");
                throw null;
            }
        } else {
            C66663a aVar2 = vVar.f180438d;
            if (aVar2 != null) {
                aVar2.f326418a = new MultiTaskInfo();
                C66663a aVar3 = vVar.f180438d;
                if (aVar3 != null) {
                    MultiTaskInfo multiTaskInfo2 = aVar3.f326418a;
                    if (multiTaskInfo2 != null) {
                        multiTaskInfo2.field_updateTime = C31543z5.m39453c();
                    }
                    C66663a aVar4 = vVar.f180438d;
                    if (aVar4 != null) {
                        MultiTaskInfo multiTaskInfo3 = aVar4.f326418a;
                        if (multiTaskInfo3 != null) {
                            multiTaskInfo3.field_id = C61926c.m72691p(j0Var.getItemId());
                        }
                        C66663a aVar5 = vVar.f180438d;
                        if (aVar5 != null) {
                            MultiTaskInfo multiTaskInfo4 = aVar5.f326418a;
                            if (multiTaskInfo4 != null) {
                                multiTaskInfo4.field_type = 22;
                            }
                            ConcurrentHashMap<Long, MultiTaskInfo> concurrentHashMap = vVar.f180442h;
                            Long valueOf = Long.valueOf(j0Var.getItemId());
                            C66663a aVar6 = vVar.f180438d;
                            if (aVar6 != null) {
                                MultiTaskInfo multiTaskInfo5 = aVar6.f326418a;
                                C87412m.m108591d(multiTaskInfo5);
                                MultiTaskInfo put = concurrentHashMap.put(valueOf, multiTaskInfo5);
                                z = false;
                            } else {
                                C87412m.m108603p("multiTaskHelper");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("multiTaskHelper");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("multiTaskHelper");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("multiTaskHelper");
                    throw null;
                }
            } else {
                C87412m.m108603p("multiTaskHelper");
                throw null;
            }
        }
        C66663a aVar7 = vVar.f180438d;
        if (aVar7 != null) {
            MultiTaskInfo multiTaskInfo6 = aVar7.f326418a;
            if (multiTaskInfo6 != null) {
                multiTaskInfo6.field_id = C61926c.m72691p(j0Var.getItemId());
                multiTaskInfo6.mo80305m2().f183752e = str;
                C64459j13 m2 = multiTaskInfo6.mo80305m2();
                C58969q l2 = j0Var.mo3507l();
                m2.f183756i = l2 != null ? l2.getAvatarUrl() : "";
                C64897zv2 zv23 = vVar.f180439e;
                multiTaskInfo6.field_data = zv23 != null ? zv23.toByteArray() : null;
                C58969q l3 = j0Var.mo3507l();
                if (l3 != null) {
                    multiTaskInfo6.mo80305m2().f183751d = l3.getNickname();
                    FinderAuthInfo finderAuthInfo = l3.field_authInfo;
                    if (finderAuthInfo != null) {
                        if (finderAuthInfo.authIconType <= 0) {
                            z2 = false;
                        }
                        if (!z2) {
                            finderAuthInfo = null;
                        }
                        if (finderAuthInfo != null) {
                            multiTaskInfo6.mo80305m2().f183757j = finderAuthInfo.authIconType;
                            multiTaskInfo6.mo80305m2().f183753f = finderAuthInfo.authIconUrl;
                        }
                    }
                }
                C58784w3 w3Var = C58784w3.f168295a;
                if (w3Var.mo83891O0(j0Var.mo3513o().getFeedObject())) {
                    C64459j13 m25 = multiTaskInfo6.mo80305m2();
                    C52192z0 j0 = w3Var.mo83940j0(j0Var.mo3513o().getFeedObject());
                    if (j0 == null || (str2 = j0.f145600d) == null) {
                        str2 = multiTaskInfo6.mo80305m2().f183751d;
                    }
                    m25.f183751d = str2;
                    C64459j13 m26 = multiTaskInfo6.mo80305m2();
                    C52192z0 j05 = w3Var.mo83940j0(j0Var.mo3513o().getFeedObject());
                    if (j05 == null || (str3 = j05.f145601e) == null) {
                        str3 = multiTaskInfo6.mo80305m2().f183756i;
                    }
                    m26.f183756i = str3;
                    multiTaskInfo6.mo80305m2().f183757j = 0;
                    multiTaskInfo6.mo80305m2().f183753f = "";
                }
                C64459j13 m27 = multiTaskInfo6.mo80305m2();
                FinderObjectDesc finderObjectDesc = j0Var.mo3513o().getFeedObject().objectDesc;
                if (!(finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null)) {
                    i2 = finderMedia.videoDuration;
                }
                m27.f183754g = i2;
            }
            if (!vVar.f180443i) {
                C66663a aVar8 = vVar.f180438d;
                if (aVar8 != null) {
                    ((C119157j) C119157j.f356862d).mo183884o(new C66667b(aVar8));
                    if (!z) {
                        Log.m105924i("FinderAddHistoryUIC", "addToTaskbar: add to history, playTime = " + i + ", feedId = " + C61926c.m72691p(j0Var.getItemId()));
                        return;
                    }
                    return;
                }
                C87412m.m108603p("multiTaskHelper");
                throw null;
            }
            return;
        }
        C87412m.m108603p("multiTaskHelper");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [androidx.recyclerview.widget.RecyclerView$z] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo88473d3() {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.mo88475f3()
            if (r0 == 0) goto L_0x005e
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
            boolean r2 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r3 = 0
            if (r2 == 0) goto L_0x0012
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            goto L_0x0013
        L_0x0012:
            r1 = r3
        L_0x0013:
            if (r1 != 0) goto L_0x0016
            return
        L_0x0016:
            int r1 = r1.mo16957C()
            androidx.recyclerview.widget.RecyclerView$z r0 = r0.mo17023I0(r1)
            boolean r1 = r0 instanceof jq3.C60905o
            if (r1 == 0) goto L_0x0025
            r3 = r0
            jq3.o r3 = (jq3.C60905o) r3
        L_0x0025:
            if (r3 == 0) goto L_0x005e
            java.lang.Object r0 = r3.f173503E
            boolean r1 = r0 instanceof cm1.C55018j0
            if (r1 == 0) goto L_0x005e
            r1 = r0
            cm1.j0 r1 = (cm1.C55018j0) r1
            com.tencent.mm.plugin.finder.storage.FinderItem r2 = r1.mo3513o()
            boolean r2 = r2.isLongVideo()
            if (r2 == 0) goto L_0x003e
            boolean r1 = r1.f154480e
            if (r1 == 0) goto L_0x0042
        L_0x003e:
            boolean r1 = r4.f180443i
            if (r1 == 0) goto L_0x005e
        L_0x0042:
            r1 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r1 = r3.mo85812D(r1)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r1 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r1
            if (r1 == 0) goto L_0x0052
            int r1 = r1.getCurrentPosSec()
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            rs1.v$a r2 = new rs1.v$a
            r2.<init>(r4, r0, r1)
            r0 = 1
            java.lang.String r1 = "addHistory"
            o40.C61926c.m72657B(r1, r0, r2)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63648v.mo88473d3():void");
    }

    /* renamed from: e3 */
    public final void mo88474e3(C60905o oVar, boolean z) {
        String str;
        String str2;
        String str3;
        LinkedList<FinderMedia> linkedList;
        FinderMedia finderMedia;
        C60905o oVar2 = oVar;
        boolean z2 = z;
        C87412m.m108594g(oVar2, "holder");
        Object obj = oVar2.f173503E;
        Integer num = null;
        BaseFinderFeed baseFinderFeed = obj instanceof BaseFinderFeed ? (BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            Log.m105924i("FinderAddHistoryUIC", "addToMultiTask: item is not BaseFinderFeed");
            return;
        }
        Log.m105924i("FinderAddHistoryUIC", "addToMultiTask: item=" + baseFinderFeed + ", isFromSwipe=" + z2);
        if (Util.isNullOrNil(baseFinderFeed.mo3513o().getDescription())) {
            Resources resources = getContext().getResources();
            Object[] objArr = new Object[1];
            C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
            Activity context = getContext();
            C58969q l = baseFinderFeed.mo3507l();
            objArr[0] = hVar.mo107057T1(context, l != null ? l.getNickname() : null);
            str = resources.getString(C0966R.string.m_1, objArr);
        } else {
            str = baseFinderFeed.mo3513o().getDescription();
        }
        C87412m.m108593f(str, "if (Util.isNullOrNil(ite…em.feedObject.description");
        C64897zv2 zv22 = new C64897zv2();
        zv22.f186885g = 0;
        LinkedList<C48693ac1> linkedList2 = zv22.f186883e;
        if (linkedList2 != null) {
            linkedList2.clear();
        }
        LinkedList<FinderObject> linkedList3 = zv22.f186888j;
        if (linkedList3 != null) {
            linkedList3.clear();
        }
        LinkedList<FinderObject> linkedList4 = zv22.f186888j;
        if (linkedList4 != null) {
            linkedList4.add(baseFinderFeed.mo3513o().getFeedObject());
        }
        C64827xe1 xe12 = baseFinderFeed.mo3513o().getFeedObject().client_local_buffer;
        zv22.f186889n = xe12 != null ? xe12.f186293d : C31543z5.m39453c();
        int i = baseFinderFeed.mo3513o().getFeedObject().urlValidDuration;
        long c = C31543z5.m39453c();
        C66663a aVar = this.f180438d;
        if (aVar != null) {
            MultiTaskInfo multiTaskInfo = aVar.f326418a;
            if (multiTaskInfo != null) {
                multiTaskInfo.field_id = C61926c.m72691p(baseFinderFeed.getItemId());
                multiTaskInfo.field_showData = new C64459j13();
                multiTaskInfo.mo80305m2().f183752e = str;
                C58969q l2 = baseFinderFeed.mo3507l();
                if (l2 != null) {
                    multiTaskInfo.mo80305m2().f183756i = l2.getAvatarUrl();
                    multiTaskInfo.mo80305m2().f183751d = l2.getNickname();
                    FinderAuthInfo finderAuthInfo = l2.field_authInfo;
                    if (finderAuthInfo != null) {
                        if (!(finderAuthInfo.authIconType > 0)) {
                            finderAuthInfo = null;
                        }
                        if (finderAuthInfo != null) {
                            multiTaskInfo.mo80305m2().f183757j = finderAuthInfo.authIconType;
                            multiTaskInfo.mo80305m2().f183753f = finderAuthInfo.authIconUrl;
                        }
                    }
                }
                multiTaskInfo.field_data = zv22.toByteArray();
                C64459j13 m2 = multiTaskInfo.mo80305m2();
                FinderObjectDesc finderObjectDesc = baseFinderFeed.mo3513o().getFeedObject().objectDesc;
                m2.f183754g = (finderObjectDesc == null || (linkedList = finderObjectDesc.media) == null || (finderMedia = (FinderMedia) C110818d0.m150916N(linkedList)) == null) ? 0 : finderMedia.videoDuration;
                multiTaskInfo.field_createTime = c;
                C58784w3 w3Var = C58784w3.f168295a;
                if (w3Var.mo83891O0(baseFinderFeed.mo3513o().getFeedObject())) {
                    C64459j13 m25 = multiTaskInfo.mo80305m2();
                    C52192z0 j0 = w3Var.mo83940j0(baseFinderFeed.mo3513o().getFeedObject());
                    if (j0 == null || (str2 = j0.f145600d) == null) {
                        str2 = multiTaskInfo.mo80305m2().f183751d;
                    }
                    m25.f183751d = str2;
                    C64459j13 m26 = multiTaskInfo.mo80305m2();
                    C52192z0 j05 = w3Var.mo83940j0(baseFinderFeed.mo3513o().getFeedObject());
                    if (j05 == null || (str3 = j05.f145601e) == null) {
                        str3 = multiTaskInfo.mo80305m2().f183756i;
                    }
                    m26.f183756i = str3;
                    multiTaskInfo.mo80305m2().f183757j = 0;
                    multiTaskInfo.mo80305m2().f183753f = "";
                }
            }
            C66663a aVar2 = this.f180438d;
            if (aVar2 != null) {
                C110964i13 i132 = aVar2.f326420c;
                C64272c13 c132 = i132 != null ? i132.f332063j : null;
                if (c132 != null) {
                    c132.f182352d = z2 ? 2 : 1;
                }
                C39818r rVar = C39818r.f106831a;
                if (((C13354o6) rVar.mo62444c(getActivity()).mo62449e(C13354o6.class)) != null) {
                    FinderVideoLayout finderVideoLayout = (FinderVideoLayout) oVar2.mo85812D(C0966R.C0970id.d7a);
                    C66663a aVar3 = this.f180438d;
                    if (aVar3 != null) {
                        C66663a.m78645Z(aVar3, finderVideoLayout.getBitmap(), C61926c.m72690o(finderVideoLayout), false, 4, (Object) null);
                    } else {
                        C87412m.m108603p("multiTaskHelper");
                        throw null;
                    }
                } else {
                    C66663a aVar4 = this.f180438d;
                    if (aVar4 != null) {
                        C66663a.m78645Z(aVar4, (Bitmap) null, (int[]) null, z, 3, (Object) null);
                    } else {
                        C87412m.m108603p("multiTaskHelper");
                        throw null;
                    }
                }
                C13371q qVar = (C13371q) rVar.mo62443b(getContext()).mo62449e(C13371q.class);
                if (qVar != null) {
                    qVar.f37885e = false;
                }
                if (!z2) {
                    C66663a aVar5 = this.f180438d;
                    if (aVar5 != null) {
                        aVar5.mo124068H(true, 1);
                    } else {
                        C87412m.m108603p("multiTaskHelper");
                        throw null;
                    }
                }
                C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
                C49712hj1 q3 = f != null ? f.mo12861q3() : null;
                C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                C13604l[] lVarArr = new C13604l[6];
                lVarArr[0] = new C13604l("view_id", "button_float_frame");
                lVarArr[1] = new C13604l("feed_id", C61926c.m72691p(baseFinderFeed.getItemId()));
                lVarArr[2] = new C13604l("behaviour_session_id", q3 != null ? q3.f134670d : null);
                lVarArr[3] = new C13604l("finder_context_id", q3 != null ? q3.f134671e : null);
                lVarArr[4] = new C13604l("finder_tab_context_id", q3 != null ? q3.f134672f : null);
                if (q3 != null) {
                    num = Integer.valueOf(q3.f134675i);
                }
                lVarArr[5] = new C13604l("comment_scene", num);
                eVar.mo86168ix("view_clk", C90364q0.m113147f(lVarArr), 25496);
                return;
            }
            C87412m.m108603p("multiTaskHelper");
            throw null;
        }
        C87412m.m108603p("multiTaskHelper");
        throw null;
    }

    /* renamed from: f3 */
    public final RecyclerView mo88475f3() {
        RefreshLoadMoreLayout refreshLoadMoreLayout;
        if (getActivity() instanceof FinderHomeUI) {
            View view = ((FinderHomeUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(FinderHomeUIC.class)).getActiveFragment().getView();
            refreshLoadMoreLayout = view != null ? (RefreshLoadMoreLayout) view.findViewById(C0966R.C0970id.ivb) : null;
        } else {
            refreshLoadMoreLayout = (RefreshLoadMoreLayout) findViewById(C0966R.C0970id.ivb);
        }
        if (refreshLoadMoreLayout != null) {
            return refreshLoadMoreLayout.getRecyclerView();
        }
        return null;
    }

    public boolean onBackPressed() {
        if (this.f180443i && !((C63575n3) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63575n3.class)).f180278d) {
            mo88473d3();
            C66663a aVar = this.f180438d;
            if (aVar == null) {
                C87412m.m108603p("multiTaskHelper");
                throw null;
            } else if (aVar.mo67896U(2, false)) {
                this.f180444j = true;
                return true;
            }
        }
        return super.onBackPressed();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreateAfter(android.os.Bundle r12) {
        /*
            r11 = this;
            java.lang.Class<rs1.s8> r0 = rs1.C13442s8.class
            super.onCreateAfter(r12)
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r1 = "KEY_FLOAT_BALL_INFO"
            byte[] r12 = r12.getByteArrayExtra(r1)
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            dp1.y0 r1 = (dp1.C58417y0) r1
            java.lang.String r1 = r1.mo83357yP()
            r2 = 0
            r3 = 1
            if (r12 == 0) goto L_0x0046
            te3.zv2 r4 = r11.f180439e     // Catch:{ all -> 0x0032 }
            r4.parseFrom(r12)     // Catch:{ all -> 0x0032 }
            te3.zv2 r12 = r11.f180439e     // Catch:{ all -> 0x0032 }
            java.lang.String r12 = r12.f186882d     // Catch:{ all -> 0x0032 }
            if (r12 == 0) goto L_0x0046
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x002f }
            r1 = r12
            r4 = 1
            goto L_0x0047
        L_0x002f:
            r1 = move-exception
            r4 = 1
            goto L_0x0037
        L_0x0032:
            r12 = move-exception
            r4 = 0
            r10 = r1
            r1 = r12
            r12 = r10
        L_0x0037:
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r2] = r1
            java.lang.String r1 = "FinderAddHistoryUIC"
            java.lang.String r6 = "onCreateAfter"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r6, r5)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r1 = r12
            goto L_0x0047
        L_0x0046:
            r4 = 0
        L_0x0047:
            yl1.a r12 = new yl1.a
            android.app.Activity r5 = r11.getContext()
            yl1.c r6 = new yl1.c
            android.app.Activity r7 = r11.getContext()
            android.app.Activity r8 = r11.getContext()
            android.view.Window r8 = r8.getWindow()
            android.view.View r8 = r8.getDecorView()
            java.lang.String r9 = "context.window.decorView"
            gy3.C87412m.m108593f(r8, r9)
            r9 = 0
            r6.<init>(r7, r9, r8)
            r12.<init>(r5, r6)
            r11.f180438d = r12
            r5 = 22
            r12.mo35809D(r5, r1)
            java.lang.String r12 = "multiTaskHelper"
            if (r4 == 0) goto L_0x0095
            yl1.a r1 = r11.f180438d
            if (r1 == 0) goto L_0x0091
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r1 = r1.f326418a
            if (r1 == 0) goto L_0x0095
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.mm.plugin.multitask.model.MultiTaskInfo> r4 = r11.f180442h
            java.lang.String r5 = r1.field_id
            long r5 = o40.C61926c.m72671P(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Object r1 = r4.put(r5, r1)
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo r1 = (com.tencent.p014mm.plugin.multitask.model.MultiTaskInfo) r1
            goto L_0x0095
        L_0x0091:
            gy3.C87412m.m108603p(r12)
            throw r9
        L_0x0095:
            yl1.a r1 = r11.f180438d
            if (r1 == 0) goto L_0x015c
            r1.f326437s = r2
            androidx.appcompat.app.AppCompatActivity r1 = r11.getActivity()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLoaderFeedUI
            if (r1 == 0) goto L_0x00cc
            androidx.appcompat.app.AppCompatActivity r1 = r11.getActivity()
            boolean r4 = r1 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLoaderFeedUI
            if (r4 == 0) goto L_0x00ae
            com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedUI r1 = (com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLoaderFeedUI) r1
            goto L_0x00af
        L_0x00ae:
            r1 = r9
        L_0x00af:
            if (r1 == 0) goto L_0x00b9
            boolean r1 = r1.mo2950T7()
            if (r1 != r3) goto L_0x00b9
            r1 = 1
            goto L_0x00ba
        L_0x00b9:
            r1 = 0
        L_0x00ba:
            if (r1 != 0) goto L_0x00cc
            yl1.a r1 = r11.f180438d
            if (r1 == 0) goto L_0x00c8
            g92.d r1 = r1.f326427i
            if (r1 == 0) goto L_0x00cc
            r1.stop()
            goto L_0x00cc
        L_0x00c8:
            gy3.C87412m.m108603p(r12)
            throw r9
        L_0x00cc:
            androidx.appcompat.app.AppCompatActivity r1 = r11.getActivity()
            boolean r1 = r1 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            if (r1 == 0) goto L_0x0118
            bl3.r r1 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r2 = r11.getActivity()
            bl3.r$a r1 = r1.mo62444c(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r2 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r1 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r1
            java.util.ArrayList r1 = r1.mo5130f3()
            java.util.Iterator r1 = r1.iterator()
        L_0x00ee:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0138
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r2 = (com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment) r2
            bl3.r r3 = bl3.C39818r.f106831a
            android.app.Activity r4 = r11.getContext()
            bl3.r$a r3 = r3.mo62443b(r4)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r0)
            rs1.s8 r3 = (rs1.C13442s8) r3
            int r2 = r2.f17334o
            ef1.c r2 = r3.mo12867y3(r2)
            if (r2 == 0) goto L_0x00ee
            rs1.v$d r3 = r11.f180445n
            r2.mo83450a(r3)
            goto L_0x00ee
        L_0x0118:
            bl3.r r1 = bl3.C39818r.f106831a
            android.app.Activity r4 = r11.getContext()
            bl3.r$a r1 = r1.mo62443b(r4)
            androidx.lifecycle.i0 r0 = r1.mo75002a(r0)
            java.lang.String r1 = "UICProvider.of(context).…rReporterUIC::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            ht1.g4 r0 = (ht1.C60172g4) r0
            ef1.c r0 = ht1.C60172g4.C60173a.m70189a(r0, r2, r3, r9)
            if (r0 == 0) goto L_0x0138
            rs1.v$d r1 = r11.f180445n
            r0.mo83450a(r1)
        L_0x0138:
            boolean r0 = r11.f180443i
            if (r0 == 0) goto L_0x014c
            yl1.a r0 = r11.f180438d
            if (r0 == 0) goto L_0x0148
            rs1.v$e r12 = new rs1.v$e
            r12.<init>(r11)
            r0.f191686v = r12
            goto L_0x0157
        L_0x0148:
            gy3.C87412m.m108603p(r12)
            throw r9
        L_0x014c:
            yl1.a r0 = r11.f180438d
            if (r0 == 0) goto L_0x0158
            rs1.v$f r12 = new rs1.v$f
            r12.<init>(r11)
            r0.f191687w = r12
        L_0x0157:
            return
        L_0x0158:
            gy3.C87412m.m108603p(r12)
            throw r9
        L_0x015c:
            gy3.C87412m.m108603p(r12)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63648v.onCreateAfter(android.os.Bundle):void");
    }

    public void onPause() {
        super.onPause();
        C66663a aVar = this.f180438d;
        if (aVar != null) {
            aVar.mo74189F();
        } else {
            C87412m.m108603p("multiTaskHelper");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C66663a aVar = this.f180438d;
        if (aVar != null) {
            aVar.mo74188E();
        } else {
            C87412m.m108603p("multiTaskHelper");
            throw null;
        }
    }
}
