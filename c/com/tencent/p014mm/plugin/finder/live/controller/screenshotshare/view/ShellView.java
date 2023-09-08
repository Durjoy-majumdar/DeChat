package com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view;

import a14.C0000n0;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomController;
import di3.C7335d;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import nk1.C11207i;
import org.json.JSONObject;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\f"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView;", "Landroid/widget/RelativeLayout;", "", "getViewId", "()I", "viewId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView */
public abstract class ShellView extends RelativeLayout {

    /* renamed from: i */
    public static final /* synthetic */ int f15054i = 0;

    /* renamed from: d */
    public ScreenShotView f15055d;

    /* renamed from: e */
    public View f15056e;

    /* renamed from: f */
    public View f15057f;

    /* renamed from: g */
    public View f15058g;

    /* renamed from: h */
    public LiveRoomController f15059h;

    /* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView$a */
    public static final class C3142a implements View.OnClickListener {

        /* renamed from: d */
        public static final C3142a f15060d = new C3142a();

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$initView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView$b */
    public static final class C3143b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ShellView f15061d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView$initView$2$1$1", mo125469f = "ShellView.kt", mo125470l = {89}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView$b$a */
        public static final class C3144a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f15062d;

            /* renamed from: e */
            public final /* synthetic */ ShellView f15063e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3144a(ShellView shellView, C15601d<? super C3144a> dVar) {
                super(2, dVar);
                this.f15063e = shellView;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C3144a(this.f15063e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C3144a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f15062d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ShellView shellView = this.f15063e;
                    this.f15062d = 1;
                    if (ShellView.m3064a(shellView, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        public C3143b(ShellView shellView) {
            this.f15061d = shellView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 4);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().also { j ->…             }.toString()");
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_SCREEN_SHOT, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            ShellView shellView = this.f15061d;
            LiveRoomController liveRoomController = shellView.f15059h;
            if (liveRoomController != null) {
                C11207i.m11066b(liveRoomController, (C66212f) null, (C53934p0) null, new C3144a(shellView, (C15601d<? super C3144a>) null), 3, (Object) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$initView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("controller");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView$c */
    public static final class C3145c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ ShellView f15064d;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView$initView$3$1$1", mo125469f = "ShellView.kt", mo125470l = {103}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView$c$a */
        public static final class C3146a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f15065d;

            /* renamed from: e */
            public final /* synthetic */ ShellView f15066e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3146a(ShellView shellView, C15601d<? super C3146a> dVar) {
                super(2, dVar);
                this.f15066e = shellView;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C3146a(this.f15066e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C3146a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f15065d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    ShellView shellView = this.f15066e;
                    this.f15065d = 1;
                    if (ShellView.m3065b(shellView, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C13598b0.f38549a;
            }
        }

        public C3145c(ShellView shellView) {
            this.f15064d = shellView;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", 5);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().also { j ->…             }.toString()");
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Ex0((C54116w) c, C54067f0.C54076o0.LIVE_SCREEN_SHOT, jSONObject2, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (Object) null);
            ShellView shellView = this.f15064d;
            LiveRoomController liveRoomController = shellView.f15059h;
            if (liveRoomController != null) {
                C11207i.m11066b(liveRoomController, (C66212f) null, (C53934p0) null, new C3146a(shellView, (C15601d<? super C3146a>) null), 3, (Object) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/screenshotshare/view/ShellView$initView$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("controller");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m3064a(com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView r8, wx3.C15601d r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof lh1.C10520h
            if (r0 == 0) goto L_0x0016
            r0 = r9
            lh1.h r0 = (lh1.C10520h) r0
            int r1 = r0.f31771i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f31771i = r1
            goto L_0x001b
        L_0x0016:
            lh1.h r0 = new lh1.h
            r0.<init>(r8, r9)
        L_0x001b:
            java.lang.Object r9 = r0.f31769g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f31771i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r8 = r0.f31768f
            gy3.a0 r8 = (gy3.C8477a0) r8
            java.lang.Object r1 = r0.f31767e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f31766d
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView r0 = (com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView) r0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x008a
        L_0x003a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0042:
            java.lang.Object r8 = r0.f31766d
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView r8 = (com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x005c
        L_0x004a:
            kotlin.ResultKt.throwOnFailure(r9)
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView r9 = r8.f15055d
            if (r9 == 0) goto L_0x00a5
            r0.f31766d = r8
            r0.f31771i = r4
            java.lang.Object r9 = r9.mo3187a(r0)
            if (r9 != r1) goto L_0x005c
            goto L_0x00a4
        L_0x005c:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 == 0) goto L_0x00a2
            java.lang.Class<tf0.p1> r2 = tf0.C64916p1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            tf0.p1 r2 = (tf0.C64916p1) r2
            java.lang.String r2 = r2.e80()
            gy3.a0 r4 = new gy3.a0
            r4.<init>()
            a14.h0 r6 = a14.C53872d1.f151119c
            lh1.i r7 = new lh1.i
            r7.<init>(r4, r9, r2, r5)
            r0.f31766d = r8
            r0.f31767e = r2
            r0.f31768f = r4
            r0.f31771i = r3
            java.lang.Object r9 = a14.C53895h.m60469g(r6, r7, r0)
            if (r9 != r1) goto L_0x0087
            goto L_0x00a4
        L_0x0087:
            r0 = r8
            r1 = r2
            r8 = r4
        L_0x008a:
            boolean r8 = r8.f27482d
            if (r8 == 0) goto L_0x00a2
            java.lang.Class<gw.h> r8 = p159gw.C98250h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            gw.h r8 = (p159gw.C98250h) r8
            android.content.Context r9 = r0.getContext()
            lh1.j r2 = new lh1.j
            r2.<init>(r0)
            r8.mo137346Zv(r9, r1, r2)
        L_0x00a2:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00a4:
            return r1
        L_0x00a5:
            java.lang.String r8 = "screenShotView"
            gy3.C87412m.m108603p(r8)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView.m3064a(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m3065b(com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView r13, wx3.C15601d r14) {
        /*
            r13.getClass()
            boolean r0 = r14 instanceof lh1.C10523k
            if (r0 == 0) goto L_0x0016
            r0 = r14
            lh1.k r0 = (lh1.C10523k) r0
            int r1 = r0.f31781i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f31781i = r1
            goto L_0x001b
        L_0x0016:
            lh1.k r0 = new lh1.k
            r0.<init>(r13, r14)
        L_0x001b:
            java.lang.Object r14 = r0.f31779g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f31781i
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00e4
        L_0x0032:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003a:
            java.lang.Object r13 = r0.f31778f
            gy3.a0 r13 = (gy3.C8477a0) r13
            java.lang.Object r2 = r0.f31777e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f31776d
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView r4 = (com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView) r4
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0092
        L_0x004a:
            java.lang.Object r13 = r0.f31776d
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView r13 = (com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView) r13
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0065
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r14)
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ScreenShotView r14 = r13.f15055d
            if (r14 == 0) goto L_0x00e7
            r0.f31776d = r13
            r0.f31781i = r5
            java.lang.Object r14 = r14.mo3187a(r0)
            if (r14 != r1) goto L_0x0065
            goto L_0x00e6
        L_0x0065:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            if (r14 == 0) goto L_0x00e4
            java.lang.Class<tf0.p1> r2 = tf0.C64916p1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            tf0.p1 r2 = (tf0.C64916p1) r2
            java.lang.String r2 = r2.e80()
            gy3.a0 r7 = new gy3.a0
            r7.<init>()
            a14.h0 r8 = a14.C53872d1.f151119c
            lh1.l r9 = new lh1.l
            r9.<init>(r7, r14, r2, r6)
            r0.f31776d = r13
            r0.f31777e = r2
            r0.f31778f = r7
            r0.f31781i = r4
            java.lang.Object r14 = a14.C53895h.m60469g(r8, r9, r0)
            if (r14 != r1) goto L_0x0090
            goto L_0x00e6
        L_0x0090:
            r4 = r13
            r13 = r7
        L_0x0092:
            boolean r13 = r13.f27482d
            if (r13 == 0) goto L_0x00e4
            r0.f31776d = r6
            r0.f31777e = r6
            r0.f31778f = r6
            r0.f31781i = r3
            qo3.n r13 = new qo3.n
            android.content.Context r14 = r4.getContext()
            r0 = 0
            r13.<init>((android.content.Context) r14, (int) r0, (boolean) r5)
            r13.f225779n1 = r0
            r13.f225775k1 = r5
            r13.f225792t1 = r0
            java.lang.Class<wc3.e0> r14 = wc3.C15133e0.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            wc3.e0 r14 = (wc3.C15133e0) r14
            wc3.e0 r7 = r14.Ct0()
            android.content.Context r8 = r4.getContext()
            java.lang.String r14 = "context"
            gy3.C87412m.m108593f(r8, r14)
            lh1.e r12 = new lh1.e
            r12.<init>(r13, r2, r4)
            r10 = 2
            r11 = 0
            r9 = r13
            r7.Q60(r8, r9, r10, r11, r12)
            lh1.b r14 = new lh1.b
            r14.<init>(r13, r4)
            r13.f225771i = r14
            lh1.c r14 = new lh1.c
            r14.<init>(r13, r2, r4)
            r13.f225782p = r14
            r13.mo107573q()
            rx3.b0 r13 = rx3.C13598b0.f38549a
            if (r13 != r1) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00e6:
            return r1
        L_0x00e7:
            java.lang.String r13 = "screenShotView"
            gy3.C87412m.m108603p(r13)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.controller.screenshotshare.view.ShellView.m3065b(com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo3190c(LiveRoomController liveRoomController, boolean z) {
        C87412m.m108594g(liveRoomController, "c");
        this.f15059h = liveRoomController;
        View inflate = View.inflate(getContext(), getViewId(), this);
        View findViewById = inflate.findViewById(C0966R.C0970id.o_k);
        ScreenShotView screenShotView = (ScreenShotView) findViewById;
        screenShotView.setLandscape(z);
        screenShotView.setOnClickListener(C3142a.f15060d);
        C87412m.m108593f(findViewById, "root.findViewById<Screen…ickListener { }\n        }");
        this.f15055d = (ScreenShotView) findViewById;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.o_z);
        C87412m.m108593f(findViewById2, "root.findViewById(R.id.share_screen_cancel)");
        this.f15056e = findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.f359192oa0);
        findViewById3.setOnClickListener(new C3143b(this));
        this.f15057f = findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.f359193oa1);
        findViewById4.setOnClickListener(new C3145c(this));
        this.f15058g = findViewById4;
    }

    public abstract int getViewId();
}
