package rs1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C0317e;
import bl3.C113200q;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.plugin.finder.feed.model.C2815r0;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.finder.view.FinderWordingLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import dp1.C7435f2;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8766f5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C9387y;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.ResultKt;
import mf1.C10827i1;
import mp3.C88819d;
import org.json.JSONObject;
import p185kq.C10383h;
import pf1.C62273n;
import q40.C12040d;
import q40.C89456b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sx3.C36907w;
import te3.C49160dl;
import te3.C49442fm0;
import tr1.C14063b;
import vq1.C14951b0;
import vq1.C14954c0;
import vq1.C14955d0;
import vq1.C14958f0;
import vq1.C65854g;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C113200q(initialMode = 2)
/* renamed from: rs1.d3 */
public final class C13181d3 extends C13308kb implements C8766f5, C10827i1 {

    /* renamed from: f */
    public final C13601g f37489f = C36568h.m40985a(C13183b.f37496d);

    /* renamed from: g */
    public WeakReference<FinderWordingLayout> f37490g;

    /* renamed from: h */
    public C32226l<? super C60905o, C13598b0> f37491h;

    /* renamed from: rs1.d3$a */
    public final class C13182a implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final BaseFinderFeed f37492d;

        /* renamed from: e */
        public final C60905o f37493e;

        /* renamed from: f */
        public final FinderWordingLayout f37494f;

        /* renamed from: g */
        public final /* synthetic */ C13181d3 f37495g;

        public C13182a(C13181d3 d3Var, BaseFinderFeed baseFinderFeed, C60905o oVar) {
            C87412m.m108594g(baseFinderFeed, "item");
            C87412m.m108594g(oVar, "feedHolder");
            this.f37495g = d3Var;
            this.f37492d = baseFinderFeed;
            this.f37493e = oVar;
            this.f37494f = (FinderWordingLayout) oVar.mo85812D(C0966R.C0970id.lz5);
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C2815r0 r0Var;
            C32226l<? super C60905o, C13598b0> lVar;
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            if (this.f37494f != null && (r0Var = (C2815r0) oVar.f173503E) != null) {
                C13181d3 d3Var = this.f37495g;
                C14951b0 b0Var = C14951b0.f40992g;
                boolean z = !b0Var.mo13999a(r0Var);
                boolean c = C65854g.f189373e.mo89893c(this.f37492d.mo3513o().getFeedObject());
                Log.m105924i("Finder.WordingActionMgr", "doLikeWording feedId = " + r0Var.f14070h + " buzzwordId = " + r0Var.f131802d + " buzzword = " + r0Var.f131803e + " like = " + z);
                C14958f0 f0Var = new C14958f0(r0Var, z);
                b0Var.f40995c.put(new C14951b0.C14952a(r0Var.f14070h, r0Var.f131802d), f0Var);
                b0Var.f40993a.mo89349c(new C14955d0(f0Var), new C14954c0(b0Var, f0Var));
                FeedUpdateEvent feedUpdateEvent = new FeedUpdateEvent();
                FeedUpdateEvent.C1041a aVar = feedUpdateEvent.f9173d;
                aVar.f9174a = r0Var.f14070h;
                aVar.f9178e = z ? 1 : 0;
                aVar.f9184k = r0Var.f131802d;
                aVar.f9175b = 25;
                feedUpdateEvent.publish();
                if (z) {
                    View D = oVar.mo85812D(C0966R.C0970id.m1k);
                    C14063b bVar = C14063b.f39453a;
                    C87412m.m108593f(D, "wordingItem");
                    C14063b.m13415c(bVar, D, 0, 2, (Object) null);
                    if (!c && (lVar = d3Var.f37491h) != null) {
                        lVar.invoke(this.f37493e);
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("feedid", ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ(r0Var.f14070h));
                jSONObject.put("buzz_word", r0Var.f131803e + '|' + r0Var.f131804f);
                jSONObject.put("click_type", z ^ true ? 1 : 0);
                C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                C13442s8 f = aVar2.mo12873f(context);
                C7435f2.f25626a.mo8580d(f != null ? f.mo12861q3() : null, "buzz_bar", true, jSONObject);
            }
        }
    }

    /* renamed from: rs1.d3$b */
    public static final class C13183b extends C87413o implements C32224a<C62273n> {

        /* renamed from: d */
        public static final C13183b f37496d = new C13183b();

        public C13183b() {
            super(0);
        }

        public Object invoke() {
            C39622i0 a = C39818r.f106831a.mo62446e(C60200t1.class).mo75002a(C62273n.class);
            C87412m.m108593f(a, "UICProvider.of(IFinderCo…perGlobalUIC::class.java)");
            return (C62273n) a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedWordingUIC$request$1", mo125469f = "FinderFeedWordingUIC.kt", mo125470l = {383, 390}, mo125471m = "invokeSuspend")
    /* renamed from: rs1.d3$c */
    public static final class C13184c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f37497d;

        /* renamed from: e */
        public final /* synthetic */ List<Long> f37498e;

        /* renamed from: f */
        public final /* synthetic */ C13181d3 f37499f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedWordingUIC$request$1$1", mo125469f = "FinderFeedWordingUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: rs1.d3$c$a */
        public static final class C13185a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ LinkedList<C49160dl> f37500d;

            /* renamed from: e */
            public final /* synthetic */ C13181d3 f37501e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13185a(LinkedList<C49160dl> linkedList, C13181d3 d3Var, C15601d<? super C13185a> dVar) {
                super(2, dVar);
                this.f37500d = linkedList;
                this.f37501e = d3Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C13185a(this.f37500d, this.f37501e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C13185a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
                r3 = new androidx.lifecycle.C54219z<>();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                /*
                    r5 = this;
                    kotlin.ResultKt.throwOnFailure(r6)
                    java.util.LinkedList<te3.dl> r6 = r5.f37500d
                    rs1.d3 r0 = r5.f37501e
                    java.util.Iterator r6 = r6.iterator()
                L_0x000b:
                    boolean r1 = r6.hasNext()
                    if (r1 == 0) goto L_0x0042
                    java.lang.Object r1 = r6.next()
                    te3.dl r1 = (te3.C49160dl) r1
                    long r2 = r1.f132387d
                    rx3.g r4 = r0.f37489f
                    rx3.n r4 = (rx3.C36570n) r4
                    java.lang.Object r4 = r4.getValue()
                    pf1.n r4 = (pf1.C62273n) r4
                    java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.lifecycle.z<te3.dl>> r4 = r4.f177026n
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    java.lang.Object r3 = r4.get(r2)
                    if (r3 != 0) goto L_0x003c
                    androidx.lifecycle.z r3 = new androidx.lifecycle.z
                    r3.<init>()
                    java.lang.Object r2 = r4.putIfAbsent(r2, r3)
                    if (r2 != 0) goto L_0x003b
                    goto L_0x003c
                L_0x003b:
                    r3 = r2
                L_0x003c:
                    androidx.lifecycle.z r3 = (androidx.lifecycle.C54219z) r3
                    r3.postValue(r1)
                    goto L_0x000b
                L_0x0042:
                    rx3.b0 r6 = rx3.C13598b0.f38549a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: rs1.C13181d3.C13184c.C13185a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13184c(List<Long> list, C13181d3 d3Var, C15601d<? super C13184c> dVar) {
            super(2, dVar);
            this.f37498e = list;
            this.f37499f = d3Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13184c(this.f37498e, this.f37499f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13184c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C49442fm0 fm02;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f37497d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C9387y yVar = new C9387y(new LinkedList(this.f37498e));
                this.f37497d = 1;
                obj = C89456b.m111831a(yVar, 0, (C88819d) null, this, 3, (Object) null);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (C12040d e) {
                    Log.m105920e("Finder.FeedWordingLogic", "request CgiFinderGetBuzzword fail, errType=" + e.f35057e + " errCode=" + e.f35058f + " fail:" + e.getLocalizedMessage());
                    fm02 = null;
                }
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fm02 = (C49442fm0) obj;
            LinkedList<C49160dl> linkedList = fm02 != null ? fm02.f133585d : null;
            if (linkedList == null) {
                linkedList = new LinkedList<>();
            }
            Log.m105918d("Finder.FeedWordingLogic", "request idList.size = " + this.f37498e.size() + ", buzzInfoList.size = " + linkedList.size());
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C13185a aVar2 = new C13185a(linkedList, this.f37499f, (C15601d<? super C13185a>) null);
            this.f37497d = 2;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13181d3(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: X */
    public void mo11050X(List<? extends FinderItem> list) {
        C87412m.m108594g(list, "feedList");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (FinderItem id : list) {
            arrayList.add(Long.valueOf(id.getId()));
        }
        C0317e.launch$default(this, (C66212f) null, (C53934p0) null, new C13184c(arrayList, this, (C15601d<? super C13184c>) null), 3, (Object) null);
    }

    /* renamed from: c3 */
    public View mo12677c3(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        return (FinderWordingLayout) oVar.mo85812D(C0966R.C0970id.lz5);
    }

    /* renamed from: d3 */
    public void mo12619d3(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
        FinderWordingLayout finderWordingLayout = (FinderWordingLayout) oVar.mo85812D(C0966R.C0970id.lz5);
        if (finderWordingLayout != null && finderWordingLayout.getVisibility() == 0) {
            ViewPropertyAnimator alpha = finderWordingLayout.animate().alpha(0.0f);
            if (z) {
                finderWordingLayout.setPivotX(((float) finderWordingLayout.getWidth()) / 2.0f);
                finderWordingLayout.setPivotY(((float) finderWordingLayout.getHeight()) * 1.0f);
                finderWordingLayout.setScaleX(1.0f);
                finderWordingLayout.setScaleY(1.0f);
                alpha.scaleX(0.0f).scaleY(0.0f);
            }
            alpha.setDuration(250).setListener(new C13214e3(finderWordingLayout)).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        r2 = new androidx.lifecycle.C54219z<>();
     */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo12620e3(jq3.C60905o r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r5 = "holder"
            gy3.C87412m.m108594g(r4, r5)
            java.lang.Object r5 = r4.f173503E
            boolean r0 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r0 == 0) goto L_0x000e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            goto L_0x000f
        L_0x000e:
            r5 = 0
        L_0x000f:
            r0 = 0
            if (r5 != 0) goto L_0x0013
            return r0
        L_0x0013:
            long r1 = r5.getItemId()
            rx3.g r5 = r3.f37489f
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            pf1.n r5 = (pf1.C62273n) r5
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.lifecycle.z<te3.dl>> r5 = r5.f177026n
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r2 = r5.get(r1)
            if (r2 != 0) goto L_0x003a
            androidx.lifecycle.z r2 = new androidx.lifecycle.z
            r2.<init>()
            java.lang.Object r5 = r5.putIfAbsent(r1, r2)
            if (r5 != 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r2 = r5
        L_0x003a:
            androidx.lifecycle.z r2 = (androidx.lifecycle.C54219z) r2
            java.lang.Object r5 = r2.getValue()
            te3.dl r5 = (te3.C49160dl) r5
            if (r5 != 0) goto L_0x0045
            return r0
        L_0x0045:
            r1 = 2131302903(0x7f0919f7, float:1.8223905E38)
            android.view.View r4 = r4.mo85812D(r1)
            com.tencent.mm.plugin.finder.view.FinderWordingLayout r4 = (com.tencent.p014mm.plugin.finder.view.FinderWordingLayout) r4
            if (r4 == 0) goto L_0x0059
            java.util.LinkedList<te3.cl> r4 = r5.f132389f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 != 0) goto L_0x0059
            r0 = 1
        L_0x0059:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13181d3.mo12620e3(jq3.o, boolean):boolean");
    }

    /* renamed from: g3 */
    public void mo12678g3(C60905o oVar, boolean z, long j, long j2) {
        C87412m.m108594g(oVar, "holder");
        FinderWordingLayout finderWordingLayout = (FinderWordingLayout) oVar.mo85812D(C0966R.C0970id.lz5);
        if (finderWordingLayout != null) {
            this.f37490g = new WeakReference<>(finderWordingLayout);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        r5 = new androidx.lifecycle.C54219z<>();
     */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12621i3(jq3.C60905o r12, boolean r13) {
        /*
            r11 = this;
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r12, r0)
            r0 = 2131302903(0x7f0919f7, float:1.8223905E38)
            android.view.View r0 = r12.mo85812D(r0)
            com.tencent.mm.plugin.finder.view.FinderWordingLayout r0 = (com.tencent.p014mm.plugin.finder.view.FinderWordingLayout) r0
            if (r0 != 0) goto L_0x0012
            goto L_0x01a0
        L_0x0012:
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x001a
            goto L_0x01a0
        L_0x001a:
            java.lang.Object r1 = r12.f173503E
            boolean r2 = r1 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            r3 = 0
            if (r2 == 0) goto L_0x0024
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            goto L_0x0025
        L_0x0024:
            r1 = r3
        L_0x0025:
            if (r1 != 0) goto L_0x0029
            goto L_0x01a0
        L_0x0029:
            long r4 = r1.getItemId()
            rx3.g r2 = r11.f37489f
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            pf1.n r2 = (pf1.C62273n) r2
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.lifecycle.z<te3.dl>> r2 = r2.f177026n
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r5 = r2.get(r4)
            if (r5 != 0) goto L_0x0050
            androidx.lifecycle.z r5 = new androidx.lifecycle.z
            r5.<init>()
            java.lang.Object r2 = r2.putIfAbsent(r4, r5)
            if (r2 != 0) goto L_0x004f
            goto L_0x0050
        L_0x004f:
            r5 = r2
        L_0x0050:
            androidx.lifecycle.z r5 = (androidx.lifecycle.C54219z) r5
            java.lang.Object r2 = r5.getValue()
            te3.dl r2 = (te3.C49160dl) r2
            if (r2 != 0) goto L_0x005c
            goto L_0x01a0
        L_0x005c:
            java.util.LinkedList<te3.cl> r4 = r2.f132389f
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r4)
            if (r4 == 0) goto L_0x006b
            r12 = 8
            r0.setVisibility(r12)
            goto L_0x01a0
        L_0x006b:
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.LinkedList<te3.cl> r2 = r2.f132389f
            java.lang.String r5 = "buzzwordItem.items"
            gy3.C87412m.m108593f(r2, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = sx3.C36907w.m41090l(r2, r6)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x0086:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00ae
            java.lang.Object r6 = r2.next()
            te3.cl r6 = (te3.C49016cl) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r6.f131803e
            r7.append(r8)
            r8 = 124(0x7c, float:1.74E-43)
            r7.append(r8)
            long r8 = r6.f131804f
            r7.append(r8)
            java.lang.String r6 = r7.toString()
            r5.add(r6)
            goto L_0x0086
        L_0x00ae:
            java.util.Iterator r2 = r5.iterator()
        L_0x00b2:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00c2
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            r4.put(r5)
            goto L_0x00b2
        L_0x00c2:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.Class<kq.h> r5 = p185kq.C10383h.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            kq.h r5 = (p185kq.C10383h) r5
            long r6 = r1.getItemId()
            java.lang.String r1 = r5.mo10700XQ(r6)
            java.lang.String r5 = "feedid"
            r2.put(r5, r1)
            java.lang.String r1 = "buzz_words"
            r2.put(r1, r4)
            java.lang.String r1 = "expose_type"
            r2.put(r1, r13)
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            android.content.Context r4 = r12.f173499A
            java.lang.String r5 = "holder.context"
            gy3.C87412m.m108593f(r4, r5)
            rs1.s8 r1 = r1.mo12873f(r4)
            if (r1 == 0) goto L_0x00f9
            te3.hj1 r3 = r1.mo12861q3()
        L_0x00f9:
            dp1.f2 r1 = dp1.C7435f2.f25626a
            r9 = 0
            java.lang.String r4 = "buzz_bar"
            r1.mo8580d(r3, r4, r9, r2)
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r10.mo10233c(r1)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedWordingUIC"
            java.lang.String r4 = "animateWordingShow"
            java.lang.String r5 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Z)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r10.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedWordingUIC"
            java.lang.String r3 = "animateWordingShow"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Z)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r1 = 0
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r10.mo10233c(r1)
            java.lang.Object[] r2 = r10.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedWordingUIC"
            java.lang.String r4 = "animateWordingShow"
            java.lang.String r5 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Z)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r10.mo10231a(r9)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r0.setAlpha(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedWordingUIC"
            java.lang.String r3 = "animateWordingShow"
            java.lang.String r4 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Z)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setScaleX(r1)
            r0.setScaleY(r1)
            if (r13 == 0) goto L_0x018f
            r1 = 0
            goto L_0x0191
        L_0x018f:
            r1 = 150(0x96, double:7.4E-322)
        L_0x0191:
            zt3.t r3 = zt3.C119157j.f356862d
            rs1.f3 r4 = new rs1.f3
            r4.<init>(r0, r13, r11, r12)
            zt3.j r3 = (zt3.C119157j) r3
            r3.getClass()
            r3.mo183892w(r4, r1, r9)
        L_0x01a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13181d3.mo12621i3(jq3.o, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r3 = new androidx.lifecycle.C54219z<>();
     */
    /* renamed from: j3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12679j3(cm1.C0740i2 r11, jq3.C60905o r12, long r13, int r15) {
        /*
            r10 = this;
            java.lang.String r0 = "feed"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r12, r0)
            boolean r0 = r11 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            r1 = 0
            if (r0 == 0) goto L_0x0012
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r11
            goto L_0x0013
        L_0x0012:
            r11 = r1
        L_0x0013:
            if (r11 != 0) goto L_0x0016
            return
        L_0x0016:
            long r2 = r11.getItemId()
            rx3.g r0 = r10.f37489f
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            pf1.n r0 = (pf1.C62273n) r0
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.lifecycle.z<te3.dl>> r0 = r0.f177026n
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L_0x003d
            androidx.lifecycle.z r3 = new androidx.lifecycle.z
            r3.<init>()
            java.lang.Object r0 = r0.putIfAbsent(r2, r3)
            if (r0 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r3 = r0
        L_0x003d:
            androidx.lifecycle.z r3 = (androidx.lifecycle.C54219z) r3
            java.lang.Object r0 = r3.getValue()
            te3.dl r0 = (te3.C49160dl) r0
            if (r0 == 0) goto L_0x00e6
            java.util.LinkedList<te3.cl> r0 = r0.f132389f
            if (r0 == 0) goto L_0x00e6
            java.util.Iterator r0 = r0.iterator()
        L_0x004f:
            boolean r2 = r0.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x006a
            java.lang.Object r2 = r0.next()
            r5 = r2
            te3.cl r5 = (te3.C49016cl) r5
            long r5 = r5.f131802d
            int r7 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x0066
            r5 = 1
            goto L_0x0067
        L_0x0066:
            r5 = 0
        L_0x0067:
            if (r5 == 0) goto L_0x004f
            goto L_0x006b
        L_0x006a:
            r2 = r1
        L_0x006b:
            te3.cl r2 = (te3.C49016cl) r2
            if (r2 != 0) goto L_0x0071
            goto L_0x00e6
        L_0x0071:
            r0 = -1
            if (r15 != r3) goto L_0x0082
            long r5 = r2.f131804f
            int r7 = r2.f131805g
            if (r7 != r3) goto L_0x007c
            r7 = 0
            goto L_0x007d
        L_0x007c:
            r7 = 1
        L_0x007d:
            long r7 = (long) r7
            long r5 = r5 + r7
            r2.f131804f = r5
            goto L_0x008f
        L_0x0082:
            long r5 = r2.f131804f
            int r7 = r2.f131805g
            if (r7 != r3) goto L_0x008a
            r7 = -1
            goto L_0x008b
        L_0x008a:
            r7 = 0
        L_0x008b:
            long r7 = (long) r7
            long r5 = r5 + r7
            r2.f131804f = r5
        L_0x008f:
            r2.f131805g = r15
            r2 = 2131302903(0x7f0919f7, float:1.8223905E38)
            android.view.View r12 = r12.mo85812D(r2)
            com.tencent.mm.plugin.finder.view.FinderWordingLayout r12 = (com.tencent.p014mm.plugin.finder.view.FinderWordingLayout) r12
            if (r12 != 0) goto L_0x009d
            return
        L_0x009d:
            long r5 = r11.getItemId()
            java.util.ArrayList<com.tencent.mm.plugin.finder.feed.model.r0> r11 = r12.f17975h
            java.util.Iterator r11 = r11.iterator()
        L_0x00a7:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00c6
            java.lang.Object r12 = r11.next()
            r2 = r12
            com.tencent.mm.plugin.finder.feed.model.r0 r2 = (com.tencent.p014mm.plugin.finder.feed.model.C2815r0) r2
            long r7 = r2.f14070h
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x00c2
            long r7 = r2.f131802d
            int r2 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00c2
            r2 = 1
            goto L_0x00c3
        L_0x00c2:
            r2 = 0
        L_0x00c3:
            if (r2 == 0) goto L_0x00a7
            r1 = r12
        L_0x00c6:
            com.tencent.mm.plugin.finder.feed.model.r0 r1 = (com.tencent.p014mm.plugin.finder.feed.model.C2815r0) r1
            if (r1 != 0) goto L_0x00cb
            goto L_0x00e6
        L_0x00cb:
            if (r15 != r3) goto L_0x00d9
            long r11 = r1.f131804f
            int r13 = r1.f131805g
            if (r13 != r3) goto L_0x00d4
            r3 = 0
        L_0x00d4:
            long r13 = (long) r3
            long r11 = r11 + r13
            r1.f131804f = r11
            goto L_0x00e4
        L_0x00d9:
            long r11 = r1.f131804f
            int r13 = r1.f131805g
            if (r13 != r3) goto L_0x00e0
            r4 = -1
        L_0x00e0:
            long r13 = (long) r4
            long r11 = r11 + r13
            r1.f131804f = r11
        L_0x00e4:
            r1.f131805g = r15
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13181d3.mo12679j3(cm1.i2, jq3.o, long, int):void");
    }

    public boolean onBackPressed() {
        WeakReference<FinderWordingLayout> weakReference = this.f37490g;
        FinderWordingLayout.C3984a aVar = null;
        FinderWordingLayout finderWordingLayout = weakReference != null ? weakReference.get() : null;
        if (finderWordingLayout != null) {
            aVar = finderWordingLayout.getCurrMode();
        }
        return aVar == FinderWordingLayout.C3984a.MANAGE;
    }

    public boolean onInterceptFinish() {
        WeakReference<FinderWordingLayout> weakReference = this.f37490g;
        FinderWordingLayout.C3984a aVar = null;
        FinderWordingLayout finderWordingLayout = weakReference != null ? weakReference.get() : null;
        if (finderWordingLayout != null) {
            aVar = finderWordingLayout.getCurrMode();
        }
        return aVar == FinderWordingLayout.C3984a.MANAGE;
    }
}
