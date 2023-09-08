package oh1;

import a14.C0000n0;
import a14.C53934p0;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bl3.C39818r;
import cj1.C0572m5;
import cl1.C54979h1;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import eb0.C31543z5;
import fy3.C32227p;
import gh1.C8313a;
import gy3.C87412m;
import ht1.C60200t1;
import kotlin.ResultKt;
import l60.C99344b;
import nk1.C11207i;
import o40.C61926c;
import pl1.C100810g0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13598b0;
import te3.C51314sy0;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: oh1.c */
public final class C11415c extends C8313a {

    /* renamed from: j */
    public final String f33580j = "FlashSaleBubbleController";

    /* renamed from: n */
    public ViewGroup f33581n;

    /* renamed from: o */
    public ImageView f33582o;

    /* renamed from: p */
    public int f33583p;

    /* renamed from: q */
    public MTimerHandler f33584q = new MTimerHandler("FlashSaleBubble::Timer", (MTimerHandler.CallBack) new C11417b(this), true);

    /* renamed from: r */
    public TextView f33585r;

    /* renamed from: s */
    public View f33586s;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.flashsale.FlashSaleBubbleController$onNewFlashSale$1$1", mo125469f = "FlashSaleBubbleController.kt", mo125470l = {58}, mo125471m = "invokeSuspend")
    /* renamed from: oh1.c$a */
    public static final class C11416a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f33587d;

        /* renamed from: e */
        public final /* synthetic */ C11415c f33588e;

        /* renamed from: f */
        public final /* synthetic */ C0572m5 f33589f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11416a(C11415c cVar, C0572m5 m5Var, C15601d<? super C11416a> dVar) {
            super(2, dVar);
            this.f33588e = cVar;
            this.f33589f = m5Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C11416a(this.f33588e, this.f33589f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C11416a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f33587d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f33588e.f33584q.stopTimer();
                C11415c cVar = this.f33588e;
                ImageView imageView = cVar.f33582o;
                C51314sy0 sy02 = this.f33589f.f1375d;
                if (sy02 == null || (str = sy02.f141827e) == null) {
                    str = "";
                }
                this.f33587d = 1;
                cVar.getClass();
                if (imageView == null) {
                    obj2 = C13598b0.f38549a;
                } else {
                    C66218h hVar = new C66218h(C66447b.m78392b(this));
                    C99344b<C100810g0, Bitmap> a = ((C11990s0) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C11990s0.class)).mo11871f2().mo85955a(new C11984n0(str, C27696y.THUMB_IMAGE));
                    C11420f fVar = new C11420f(imageView, cVar, str, hVar);
                    a.getClass();
                    a.f291320d = fVar;
                    a.mo85951a();
                    obj2 = hVar.mo90314b();
                    if (obj2 != aVar) {
                        obj2 = C13598b0.f38549a;
                    }
                }
                if (obj2 == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C11415c cVar2 = this.f33588e;
            int i2 = this.f33589f.f1373b;
            cVar2.getClass();
            int e = C31543z5.m39455e();
            cVar2.f33583p = e > i2 ? 0 : i2 - e;
            String str2 = cVar2.f33580j;
            Log.m105924i(str2, "server time = " + e + ", expire time = " + i2 + ", set remaining time to " + cVar2.f33583p);
            ViewGroup viewGroup = this.f33588e.f33581n;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            this.f33588e.f33584q.startTimer(1000);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: oh1.c$b */
    public static final class C11417b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C11415c f33590d;

        public C11417b(C11415c cVar) {
            this.f33590d = cVar;
        }

        public final boolean onTimerExpired() {
            C11415c cVar = this.f33590d;
            cVar.getClass();
            C61926c.m72668M(new C11418d(cVar));
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11415c(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: m3 */
    public final void mo11424m3() {
        C0572m5 m5Var = ((C54979h1) business(C54979h1.class)).f154131X;
        if (m5Var != null) {
            C11207i.m11071g(this, (C66212f) null, (C53934p0) null, new C11416a(this, m5Var, (C15601d<? super C11416a>) null), 3, (Object) null);
        }
    }

    public void onLiveActivate() {
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewMount(android.view.ViewGroup r3) {
        /*
            r2 = this;
            java.lang.String r0 = "pluginLayout"
            gy3.C87412m.m108594g(r3, r0)
            super.onViewMount(r3)
            r3 = 2131303480(0x7f091c38, float:1.8225076E38)
            android.view.View r3 = r2.mo9308e3(r3)
            boolean r0 = r3 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x0018
        L_0x0017:
            r3 = r1
        L_0x0018:
            r2.f33581n = r3
            if (r3 == 0) goto L_0x0026
            r0 = 2131304965(0x7f092205, float:1.8228087E38)
            android.view.View r3 = r3.findViewById(r0)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            goto L_0x0027
        L_0x0026:
            r3 = r1
        L_0x0027:
            r2.f33582o = r3
            android.view.ViewGroup r3 = r2.f33581n
            if (r3 == 0) goto L_0x0035
            r0 = 2131304963(0x7f092203, float:1.8228083E38)
            android.view.View r3 = r3.findViewById(r0)
            goto L_0x0036
        L_0x0035:
            r3 = r1
        L_0x0036:
            r2.f33586s = r3
            android.view.ViewGroup r3 = r2.f33581n
            if (r3 == 0) goto L_0x0046
            r0 = 2131300480(0x7f091080, float:1.821899E38)
            android.view.View r3 = r3.findViewById(r0)
            r1 = r3
            android.widget.TextView r1 = (android.widget.TextView) r1
        L_0x0046:
            r2.f33585r = r1
            android.view.View r3 = r2.f33586s
            if (r3 == 0) goto L_0x0054
            oh1.a r0 = new oh1.a
            r0.<init>(r2)
            r3.setOnClickListener(r0)
        L_0x0054:
            android.view.ViewGroup r3 = r2.f33581n
            r0 = 0
            if (r3 == 0) goto L_0x0060
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0060
            r0 = 1
        L_0x0060:
            if (r0 != 0) goto L_0x0065
            r2.mo11424m3()
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oh1.C11415c.onViewMount(android.view.ViewGroup):void");
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f33584q.stopTimer();
        this.f33581n = null;
        this.f33582o = null;
        this.f33586s = null;
        this.f33585r = null;
    }
}
