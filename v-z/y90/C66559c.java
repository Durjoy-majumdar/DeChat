package y90;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import aa0.C53991b;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import ca0.C54683f0;
import com.tencent.maas.MJMaasVersion;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.mm_compose.MMComposeView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.recordvideo.util.MultiMediaVideoChecker;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C45253g;
import di3.C86312j;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C24565l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import iy3.C60641c;
import ja0.C60781a;
import ja0.C60784e;
import java.util.List;
import kotlin.ResultKt;
import la0.C61242a;
import nj3.C76912y0;
import p175j0.C60667k2;
import p232rw.C63679m;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64197v;
import te3.C64237ap1;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: y90.c */
public abstract class C66559c extends UIComponent implements C61242a.C61246d {

    /* renamed from: d */
    public final C13601g f191422d = C36568h.m40985a(new C66560a(this));

    /* renamed from: e */
    public final C13601g f191423e = C36568h.m40985a(new C66571i(this));

    /* renamed from: f */
    public SurfaceView f191424f;

    /* renamed from: g */
    public final C13601g f191425g = C36568h.m40985a(new C66565f(this));

    /* renamed from: h */
    public C54683f0 f191426h;

    /* renamed from: i */
    public C53973z1 f191427i;

    /* renamed from: j */
    public boolean f191428j;

    /* renamed from: n */
    public final C53991b f191429n;

    /* renamed from: y90.c$a */
    public static final class C66560a extends C87413o implements C32224a<MMComposeView> {

        /* renamed from: d */
        public final /* synthetic */ C66559c f191430d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66560a(C66559c cVar) {
            super(0);
            this.f191430d = cVar;
        }

        public Object invoke() {
            return (MMComposeView) this.f191430d.findViewById(C0966R.C0970id.bks);
        }
    }

    /* renamed from: y90.c$b */
    public /* synthetic */ class C66561b extends C24565l implements C32226l<String, C13598b0> {
        public C66561b(Object obj) {
            super(1, obj, C66559c.class, "performSwitchMusic", "performSwitchMusic(Ljava/lang/String;)V", 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
            r1 = (r1 = r1.f153250b).getValue();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.String r11 = (java.lang.String) r11
                java.lang.String r0 = "p0"
                gy3.C87412m.m108594g(r11, r0)
                java.lang.Object r0 = r10.receiver
                y90.c r0 = (y90.C66559c) r0
                r0.getClass()
                ca0.f0 r1 = r0.f191426h
                r2 = 0
                if (r1 == 0) goto L_0x0024
                j0.k2<com.tencent.maas.model.MJMusicInfo> r1 = r1.f153250b
                if (r1 == 0) goto L_0x0024
                java.lang.Object r1 = r1.getValue()
                com.tencent.maas.model.MJMusicInfo r1 = (com.tencent.maas.model.MJMusicInfo) r1
                if (r1 == 0) goto L_0x0024
                java.lang.String r1 = r1.getMusicID()
                goto L_0x0025
            L_0x0024:
                r1 = r2
            L_0x0025:
                if (r1 != 0) goto L_0x0029
                java.lang.String r1 = ""
            L_0x0029:
                boolean r1 = gy3.C87412m.m108589b(r11, r1)
                if (r1 == 0) goto L_0x0037
                java.lang.String r11 = "MaasBaseUILogicUIC"
                java.lang.String r0 = "same music, no need to switch"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
                goto L_0x0058
            L_0x0037:
                y90.h r1 = r0.mo90625e3()
                r3 = 2131832924(0x7f11305c, float:1.9298916E38)
                java.lang.String r3 = r0.getString(r3)
                r1.mo90633a(r3)
                r1.show()
                a14.n0 r4 = r0.getMainScope()
                r5 = 0
                r6 = 0
                y90.f r7 = new y90.f
                r7.<init>(r0, r11, r2)
                r8 = 3
                r9 = 0
                a14.C53895h.m60466d(r4, r5, r6, r7, r8, r9)
            L_0x0058:
                rx3.b0 r11 = rx3.C13598b0.f38549a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: y90.C66559c.C66561b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: y90.c$c */
    public /* synthetic */ class C66562c extends C24565l implements C32224a<List<? extends String>> {
        public C66562c(Object obj) {
            super(0, obj, C61242a.class, "getCurrentLyricInfo", "getCurrentLyricInfo()Ljava/util/List;", 0);
        }

        public Object invoke() {
            return ((C61242a) this.receiver).mo86203B2();
        }
    }

    /* renamed from: y90.c$d */
    public /* synthetic */ class C66563d extends C24565l implements C32227p<Boolean, Boolean, C13598b0> {
        public C66563d(Object obj) {
            super(2, obj, C61242a.class, "setMovieOption", "setMovieOption(ZZ)V", 0);
        }

        public Object invoke(Object obj, Object obj2) {
            ((C61242a) this.receiver).mo86209J0(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: y90.c$e */
    public static final class C66564e extends C87413o implements C32227p<Boolean, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66559c f191431d;

        /* renamed from: e */
        public final /* synthetic */ C61242a f191432e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66564e(C66559c cVar, C61242a aVar) {
            super(2);
            this.f191431d = cVar;
            this.f191432e = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            C53895h.m60466d(this.f191431d.getMainScope(), (C66212f) null, (C53934p0) null, new C66576e(this.f191432e, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C15601d<? super C66576e>) null), 3, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: y90.c$f */
    public static final class C66565f extends C87413o implements C32224a<C66581h> {

        /* renamed from: d */
        public final /* synthetic */ C66559c f191433d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66565f(C66559c cVar) {
            super(0);
            this.f191433d = cVar;
        }

        public Object invoke() {
            C66581h hVar = new C66581h(this.f191433d.getContext());
            hVar.mo90633a(this.f191433d.getString(C0966R.string.gss));
            return hVar;
        }
    }

    /* renamed from: y90.c$g */
    public static final class C66566g implements SurfaceHolder.Callback {

        /* renamed from: d */
        public final /* synthetic */ C66559c f191434d;

        public C66566g(C66559c cVar) {
            this.f191434d = cVar;
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C87412m.m108594g(surfaceHolder, "holder");
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            Log.m105924i("MaasBaseUILogicUIC", "surfaceChanged: ");
            ((C61242a) C39818r.f106831a.mo62443b(this.f191434d.getContext()).mo62447c(C61242a.class)).mo86213O1(surfaceHolder.getSurface());
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C87412m.m108594g(surfaceHolder, "holder");
            Log.m105924i("MaasBaseUILogicUIC", "surfaceDestroyed: ");
            ((C61242a) C39818r.f106831a.mo62443b(this.f191434d.getContext()).mo62447c(C61242a.class)).mo86213O1((Surface) null);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.MaasBaseUILogicUIC$performExport$1", mo125469f = "MaasBaseUILogicUIC.kt", mo125470l = {270, 290}, mo125471m = "invokeSuspend")
    /* renamed from: y90.c$h */
    public static final class C66567h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f191435d;

        /* renamed from: e */
        public int f191436e;

        /* renamed from: f */
        public /* synthetic */ Object f191437f;

        /* renamed from: g */
        public final /* synthetic */ C66559c f191438g;

        @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.MaasBaseUILogicUIC$performExport$1$2", mo125469f = "MaasBaseUILogicUIC.kt", mo125470l = {271}, mo125471m = "invokeSuspend")
        /* renamed from: y90.c$h$a */
        public static final class C66568a extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f191439d;

            /* renamed from: e */
            public /* synthetic */ Object f191440e;

            /* renamed from: f */
            public final /* synthetic */ C66559c f191441f;

            /* renamed from: g */
            public final /* synthetic */ String f191442g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66568a(C66559c cVar, String str, C15601d<? super C66568a> dVar) {
                super(3, dVar);
                this.f191441f = cVar;
                this.f191442g = str;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C66568a aVar = new C66568a(this.f191441f, this.f191442g, (C15601d) obj3);
                aVar.f191440e = (Throwable) obj2;
                return aVar.invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0068  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r1 = r3.f191439d
                    r2 = 1
                    if (r1 == 0) goto L_0x0019
                    if (r1 != r2) goto L_0x0011
                    java.lang.Object r0 = r3.f191440e
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    kotlin.ResultKt.throwOnFailure(r4)
                    goto L_0x0034
                L_0x0011:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L_0x0019:
                    kotlin.ResultKt.throwOnFailure(r4)
                    java.lang.Object r4 = r3.f191440e
                    java.lang.Throwable r4 = (java.lang.Throwable) r4
                    y90.c r1 = r3.f191441f
                    a14.z1 r1 = r1.f191427i
                    if (r1 == 0) goto L_0x0035
                    r3.f191440e = r4
                    r3.f191439d = r2
                    a14.f2 r1 = (a14.C53884f2) r1
                    java.lang.Object r1 = r1.mo74521O(r3)
                    if (r1 != r0) goto L_0x0033
                    return r0
                L_0x0033:
                    r0 = r4
                L_0x0034:
                    r4 = r0
                L_0x0035:
                    y90.c r0 = r3.f191441f
                    y90.h r0 = r0.mo90625e3()
                    r0.dismiss()
                    java.lang.String r0 = "MaasBaseUILogicUIC"
                    if (r4 != 0) goto L_0x0068
                    y90.c r4 = r3.f191441f
                    r1 = 3
                    r4.mo90629k3(r1)
                    y90.c r4 = r3.f191441f
                    java.lang.String r1 = r3.f191442g
                    r4.mo90628j3(r1)
                    y90.c r4 = r3.f191441f
                    android.app.Activity r4 = r4.getContext()
                    r1 = -1
                    r4.setResult(r1)
                    y90.c r4 = r3.f191441f
                    android.app.Activity r4 = r4.getContext()
                    r4.finish()
                    java.lang.String r4 = "export successful"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
                    goto L_0x0076
                L_0x0068:
                    r1 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r1]
                    java.lang.String r2 = "maas error"
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r4, r2, r1)
                    y90.c r4 = r3.f191441f
                    r0 = 4
                    r4.mo90629k3(r0)
                L_0x0076:
                    rx3.b0 r4 = rx3.C13598b0.f38549a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: y90.C66559c.C66567h.C66568a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.MaasBaseUILogicUIC$performExport$1$3", mo125469f = "MaasBaseUILogicUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: y90.c$h$b */
        public static final class C66569b extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f191443d;

            /* renamed from: e */
            public final /* synthetic */ C66559c f191444e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66569b(C66559c cVar, C15601d<? super C66569b> dVar) {
                super(3, dVar);
                this.f191444e = cVar;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C66569b bVar = new C66569b(this.f191444e, (C15601d) obj3);
                bVar.f191443d = (Throwable) obj2;
                return bVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.printErrStackTrace("MaasBaseUILogicUIC", (Throwable) this.f191443d, "maas error", new Object[0]);
                this.f191444e.mo90625e3().dismiss();
                C76912y0.m92767f(this.f191444e.getContext(), this.f191444e.getString(C0966R.string.gsn));
                this.f191444e.mo90629k3(4);
                this.f191444e.getContext().setResult(0);
                this.f191444e.getContext().finish();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: y90.c$h$c */
        public static final class C66570c implements C45253g<Float> {

            /* renamed from: d */
            public final /* synthetic */ C66559c f191445d;

            public C66570c(C66559c cVar) {
                this.f191445d = cVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                float floatValue = ((Number) obj).floatValue();
                C66581h e3 = this.f191445d.mo90625e3();
                String string = this.f191445d.getResources().getString(C0966R.string.gsp, new Object[]{new Integer(C60641c.m70921b(floatValue * ((float) 100)))});
                C87412m.m108593f(string, "resources.getString(\n   …t()\n                    )");
                e3.mo90633a(string);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66567h(C66559c cVar, C15601d<? super C66567h> dVar) {
            super(2, dVar);
            this.f191438g = cVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C66567h hVar = new C66567h(this.f191438g, dVar);
            hVar.f191437f = obj;
            return hVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C66567h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:39:0x0197  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.Class<la0.a> r1 = la0.C61242a.class
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r3 = r0.f191436e
                r4 = 0
                r5 = 2
                r6 = 1
                r7 = 0
                if (r3 == 0) goto L_0x0033
                if (r3 == r6) goto L_0x0023
                if (r3 != r5) goto L_0x001b
                java.lang.Object r1 = r0.f191437f
                a14.n0 r1 = (a14.C0000n0) r1
                kotlin.ResultKt.throwOnFailure(r21)
                goto L_0x0193
            L_0x001b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0023:
                java.lang.Object r1 = r0.f191435d
                java.lang.String r1 = (java.lang.String) r1
                java.lang.Object r3 = r0.f191437f
                a14.n0 r3 = (a14.C0000n0) r3
                kotlin.ResultKt.throwOnFailure(r21)
                r9 = r1
                r1 = r21
                goto L_0x0163
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r21)
                java.lang.Object r3 = r0.f191437f
                a14.n0 r3 = (a14.C0000n0) r3
                y90.c r8 = r0.f191438g
                y90.h r8 = r8.mo90625e3()
                y90.c r9 = r0.f191438g
                r10 = 2131832917(0x7f113055, float:1.9298901E38)
                java.lang.String r9 = r9.getString(r10)
                r8.mo90633a(r9)
                r8.show()
                bl3.r r8 = bl3.C39818r.f106831a
                y90.c r9 = r0.f191438g
                android.app.Activity r9 = r9.getContext()
                bl3.r$a r9 = r8.mo62443b(r9)
                bl3.c r9 = r9.mo62447c(r1)
                la0.a r9 = (la0.C61242a) r9
                com.tencent.maas.model.MJChannelEventConfig r9 = r9.mo86223l1()
                if (r9 == 0) goto L_0x00b4
                y90.c r10 = r0.f191438g
                android.content.Intent r10 = r10.getIntent()
                java.lang.String r11 = "key_topic_id"
                boolean r10 = r10.hasExtra(r11)
                if (r10 != 0) goto L_0x00b4
                y90.c r10 = r0.f191438g
                android.content.Intent r11 = r10.mo90624c3()
                java.lang.String r12 = r9.getEventName()
                java.lang.String r13 = "eventInfo.eventName"
                gy3.C87412m.m108593f(r12, r13)
                java.lang.String r9 = r9.getFinderNickName()
                java.lang.String r13 = "eventInfo.finderNickName"
                gy3.C87412m.m108593f(r9, r13)
                r10.getClass()
                java.lang.String r13 = "fillIntent"
                gy3.C87412m.m108594g(r11, r13)
                a14.z1 r13 = r10.f191427i
                if (r13 == 0) goto L_0x009c
                a14.C53973z1.C53974a.m60623a(r13, r7, r6, r7)
            L_0x009c:
                a14.n0 r14 = r10.getLifecycleScope()
                r15 = 0
                r16 = 0
                y90.d r13 = new y90.d
                r13.<init>(r9, r12, r11, r7)
                r18 = 3
                r19 = 0
                r17 = r13
                a14.z1 r9 = a14.C53895h.m60466d(r14, r15, r16, r17, r18, r19)
                r10.f191427i = r9
            L_0x00b4:
                java.lang.Class<ht1.t1> r9 = ht1.C60200t1.class
                di3.d r9 = di3.C86312j.m106911c(r9)
                ht1.t1 r9 = (ht1.C60200t1) r9
                ht1.z4 r9 = r9.mo76861l7()
                java.lang.String r9 = r9.mo83775V5()
                y90.c r10 = r0.f191438g
                java.lang.String r11 = "finderVideoPath"
                gy3.C87412m.m108593f(r9, r11)
                r10.getClass()
                android.net.Uri r10 = com.tencent.p014mm.vfs.C116299g2.m163858n(r9)
                java.lang.String r11 = r10.getPath()
                if (r11 == 0) goto L_0x00f2
                java.lang.String r11 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r4, r4)
                java.lang.String r12 = r10.getPath()
                boolean r12 = r12.equals(r11)
                if (r12 != 0) goto L_0x00f2
                android.net.Uri$Builder r10 = r10.buildUpon()
                android.net.Uri$Builder r10 = r10.path(r11)
                android.net.Uri r10 = r10.build()
            L_0x00f2:
                com.tencent.mm.vfs.f0 r11 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r12 = r11.mo177799l(r10, r7)
                boolean r13 = r12.mo177810a()
                if (r13 != 0) goto L_0x0100
                r13 = 0
                goto L_0x0108
            L_0x0100:
                com.tencent.mm.vfs.FileSystem$c r13 = r12.f348991a
                java.lang.String r14 = r12.f348992b
                boolean r13 = r13.mo119948x(r14)
            L_0x0108:
                if (r13 != 0) goto L_0x011c
                com.tencent.mm.vfs.f0$h r10 = r11.mo177799l(r10, r12)
                boolean r11 = r10.mo177810a()
                if (r11 != 0) goto L_0x0115
                goto L_0x011c
            L_0x0115:
                com.tencent.mm.vfs.FileSystem$c r11 = r10.f348991a
                java.lang.String r10 = r10.f348992b
                r11.mo119937g(r10)
            L_0x011c:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r10.append(r9)
                y90.c r9 = r0.f191438g
                rx3.l r9 = r9.mo75242d3()
                A r9 = r9.f38555d
                java.lang.String r9 = (java.lang.String) r9
                r10.append(r9)
                r9 = 95
                r10.append(r9)
                long r11 = java.lang.System.currentTimeMillis()
                r10.append(r11)
                java.lang.String r9 = ".mp4"
                r10.append(r9)
                java.lang.String r9 = r10.toString()
                y90.c r10 = r0.f191438g
                android.app.Activity r10 = r10.getContext()
                bl3.r$a r8 = r8.mo62443b(r10)
                bl3.c r1 = r8.mo62447c(r1)
                la0.a r1 = (la0.C61242a) r1
                r0.f191437f = r3
                r0.f191435d = r9
                r0.f191436e = r6
                java.lang.Object r1 = r1.mo86212N2(r9, r0)
                if (r1 != r2) goto L_0x0163
                return r2
            L_0x0163:
                d14.f r1 = (d14.C45252f) r1
                if (r1 == 0) goto L_0x0195
                y90.c$h$a r6 = new y90.c$h$a
                y90.c r8 = r0.f191438g
                r6.<init>(r8, r9, r7)
                d14.q r8 = new d14.q
                r8.<init>(r1, r6)
                y90.c$h$b r1 = new y90.c$h$b
                y90.c r6 = r0.f191438g
                r1.<init>(r6, r7)
                d14.t r6 = new d14.t
                r6.<init>(r8, r1)
                y90.c$h$c r1 = new y90.c$h$c
                y90.c r8 = r0.f191438g
                r1.<init>(r8)
                r0.f191437f = r3
                r0.f191435d = r7
                r0.f191436e = r5
                java.lang.Object r1 = r6.mo31880a(r1, r0)
                if (r1 != r2) goto L_0x0193
                return r2
            L_0x0193:
                rx3.b0 r7 = rx3.C13598b0.f38549a
            L_0x0195:
                if (r7 != 0) goto L_0x01c8
                y90.c r1 = r0.f191438g
                java.lang.String r2 = "MaasBaseUILogicUIC"
                java.lang.String r3 = "unexpected export null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r3)
                y90.h r2 = r1.mo90625e3()
                r2.dismiss()
                android.app.Activity r2 = r1.getContext()
                r3 = 2131832916(0x7f113054, float:1.92989E38)
                java.lang.String r3 = r1.getString(r3)
                nj3.C76912y0.m92767f(r2, r3)
                r2 = 4
                r1.mo90629k3(r2)
                android.app.Activity r2 = r1.getContext()
                r2.setResult(r4)
                android.app.Activity r1 = r1.getContext()
                r1.finish()
            L_0x01c8:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: y90.C66559c.C66567h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: y90.c$i */
    public static final class C66571i extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ C66559c f191446d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66571i(C66559c cVar) {
            super(0);
            this.f191446d = cVar;
        }

        public Object invoke() {
            return (FrameLayout) this.f191446d.findViewById(C0966R.C0970id.gu_);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.MaasBaseUILogicUIC$templateListState$1$1", mo125469f = "MaasBaseUILogicUIC.kt", mo125470l = {84, 87, 96}, mo125471m = "invokeSuspend")
    /* renamed from: y90.c$j */
    public static final class C66572j extends C91594j implements C32228q<String, Boolean, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public int f191447d;

        /* renamed from: e */
        public /* synthetic */ Object f191448e;

        /* renamed from: f */
        public /* synthetic */ boolean f191449f;

        /* renamed from: g */
        public final /* synthetic */ C66559c f191450g;

        /* renamed from: h */
        public final /* synthetic */ C53991b f191451h;

        @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.MaasBaseUILogicUIC$templateListState$1$1$2", mo125469f = "MaasBaseUILogicUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: y90.c$j$a */
        public static final class C66573a extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f191452d;

            /* renamed from: e */
            public final /* synthetic */ C66559c f191453e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66573a(C66559c cVar, C15601d<? super C66573a> dVar) {
                super(3, dVar);
                this.f191453e = cVar;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C66573a aVar = new C66573a(this.f191453e, (C15601d) obj3);
                aVar.f191452d = (Throwable) obj2;
                return aVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Log.printErrStackTrace("MaasBaseUILogicUIC", (Throwable) this.f191452d, "maas error", new Object[0]);
                this.f191453e.mo90625e3().dismiss();
                C76912y0.m92767f(this.f191453e.getContext(), this.f191453e.getString(C0966R.string.aui));
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.mj_template.album_template.MaasBaseUILogicUIC$templateListState$1$1$3", mo125469f = "MaasBaseUILogicUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: y90.c$j$b */
        public static final class C66574b extends C91594j implements C32228q<C45253g<? super Float>, Throwable, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public /* synthetic */ Object f191454d;

            /* renamed from: e */
            public final /* synthetic */ C8477a0 f191455e;

            /* renamed from: f */
            public final /* synthetic */ C66559c f191456f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C66574b(C8477a0 a0Var, C66559c cVar, C15601d<? super C66574b> dVar) {
                super(3, dVar);
                this.f191455e = a0Var;
                this.f191456f = cVar;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                C45253g gVar = (C45253g) obj;
                C66574b bVar = new C66574b(this.f191455e, this.f191456f, (C15601d) obj3);
                bVar.f191454d = (Throwable) obj2;
                return bVar.invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                Throwable th = (Throwable) this.f191454d;
                Log.m105924i("MaasBaseUILogicUIC", "change on completion");
                this.f191455e.f27482d = th == null;
                this.f191456f.mo90625e3().dismiss();
                return C13598b0.f38549a;
            }
        }

        /* renamed from: y90.c$j$c */
        public static final class C66575c implements C45253g<Float> {

            /* renamed from: d */
            public final /* synthetic */ C66559c f191457d;

            public C66575c(C66559c cVar) {
                this.f191457d = cVar;
            }

            public Object emit(Object obj, C15601d dVar) {
                float floatValue = ((Number) obj).floatValue();
                C66581h e3 = this.f191457d.mo90625e3();
                String string = this.f191457d.getResources().getString(C0966R.string.gsy, new Object[]{new Integer(C60641c.m70921b(floatValue * ((float) 100)))});
                C87412m.m108593f(string, "resources.getString(\n   …t()\n                    )");
                e3.mo90633a(string);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66572j(C66559c cVar, C53991b bVar, C15601d<? super C66572j> dVar) {
            super(3, dVar);
            this.f191450g = cVar;
            this.f191451h = bVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C66572j jVar = new C66572j(this.f191450g, this.f191451h, (C15601d) obj3);
            jVar.f191448e = (String) obj;
            jVar.f191449f = booleanValue;
            return jVar.invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Class<la0.a> r0 = la0.C61242a.class
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r10.f191447d
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r5) goto L_0x002b
                if (r2 == r4) goto L_0x0023
                if (r2 != r3) goto L_0x001b
                java.lang.Object r0 = r10.f191448e
                gy3.a0 r0 = (gy3.C8477a0) r0
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x00c5
            L_0x001b:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0023:
                java.lang.Object r0 = r10.f191448e
                gy3.a0 r0 = (gy3.C8477a0) r0
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0097
            L_0x002b:
                java.lang.Object r0 = r10.f191448e
                gy3.a0 r0 = (gy3.C8477a0) r0
                kotlin.ResultKt.throwOnFailure(r11)
                goto L_0x0076
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r11)
                java.lang.Object r11 = r10.f191448e
                java.lang.String r11 = (java.lang.String) r11
                boolean r2 = r10.f191449f
                y90.c r7 = r10.f191450g
                y90.h r7 = r7.mo90625e3()
                y90.c r8 = r10.f191450g
                r9 = 2131832926(0x7f11305e, float:1.929892E38)
                java.lang.String r8 = r8.getString(r9)
                r7.mo90633a(r8)
                r7.show()
                gy3.a0 r7 = new gy3.a0
                r7.<init>()
                if (r2 == 0) goto L_0x0079
                bl3.r r11 = bl3.C39818r.f106831a
                y90.c r2 = r10.f191450g
                android.app.Activity r2 = r2.getContext()
                bl3.r$a r11 = r11.mo62443b(r2)
                bl3.c r11 = r11.mo62447c(r0)
                la0.a r11 = (la0.C61242a) r11
                r10.f191448e = r7
                r10.f191447d = r5
                java.lang.Object r11 = r11.mo86225p0(r10)
                if (r11 != r1) goto L_0x0075
                return r1
            L_0x0075:
                r0 = r7
            L_0x0076:
                d14.f r11 = (d14.C45252f) r11
                goto L_0x0099
            L_0x0079:
                bl3.r r2 = bl3.C39818r.f106831a
                y90.c r5 = r10.f191450g
                android.app.Activity r5 = r5.getContext()
                bl3.r$a r2 = r2.mo62443b(r5)
                bl3.c r0 = r2.mo62447c(r0)
                la0.a r0 = (la0.C61242a) r0
                r10.f191448e = r7
                r10.f191447d = r4
                java.lang.Object r11 = r0.mo86202A1(r11, r10)
                if (r11 != r1) goto L_0x0096
                return r1
            L_0x0096:
                r0 = r7
            L_0x0097:
                d14.f r11 = (d14.C45252f) r11
            L_0x0099:
                if (r11 == 0) goto L_0x00c7
                y90.c$j$a r2 = new y90.c$j$a
                y90.c r4 = r10.f191450g
                r2.<init>(r4, r6)
                d14.t r4 = new d14.t
                r4.<init>(r11, r2)
                y90.c$j$b r11 = new y90.c$j$b
                y90.c r2 = r10.f191450g
                r11.<init>(r0, r2, r6)
                d14.q r2 = new d14.q
                r2.<init>(r4, r11)
                y90.c$j$c r11 = new y90.c$j$c
                y90.c r4 = r10.f191450g
                r11.<init>(r4)
                r10.f191448e = r0
                r10.f191447d = r3
                java.lang.Object r11 = r2.mo31880a(r11, r10)
                if (r11 != r1) goto L_0x00c5
                return r1
            L_0x00c5:
                rx3.b0 r6 = rx3.C13598b0.f38549a
            L_0x00c7:
                if (r6 != 0) goto L_0x00e8
                y90.c r11 = r10.f191450g
                java.lang.String r1 = "MaasBaseUILogicUIC"
                java.lang.String r2 = "unexpected null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
                y90.h r1 = r11.mo90625e3()
                r1.dismiss()
                android.app.Activity r1 = r11.getContext()
                r2 = 2131822946(0x7f110962, float:1.9278678E38)
                java.lang.String r11 = r11.getString(r2)
                nj3.C76912y0.m92767f(r1, r11)
            L_0x00e8:
                boolean r11 = r0.f27482d
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: y90.C66559c.C66572j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66559c(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C53991b bVar = new C53991b(getMainScope());
        new C66572j(this, bVar, (C15601d<? super C66572j>) null);
        this.f191429n = bVar;
    }

    /* renamed from: W1 */
    public void mo86237W1() {
        SurfaceHolder holder;
        Log.m105924i("MaasBaseUILogicUIC", "onMovieSessionCreated: ");
        SurfaceView surfaceView = new SurfaceView(getActivity());
        this.f191424f = surfaceView;
        surfaceView.setVisibility(4);
        SurfaceView surfaceView2 = this.f191424f;
        if (!(surfaceView2 == null || (holder = surfaceView2.getHolder()) == null)) {
            holder.addCallback(new C66566g(this));
        }
        ((FrameLayout) ((C36570n) this.f191423e).getValue()).addView(this.f191424f, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: c3 */
    public Intent mo90624c3() {
        return getIntent();
    }

    /* renamed from: d0 */
    public void mo86238d0() {
        ((MMComposeView) ((C36570n) this.f191422d).getValue()).setVisibility(0);
        SurfaceView surfaceView = this.f191424f;
        if (surfaceView != null) {
            surfaceView.setVisibility(0);
        }
        mo90625e3().dismiss();
    }

    /* renamed from: d3 */
    public abstract C13604l<String, String> mo75242d3();

    /* renamed from: e3 */
    public final C66581h mo90625e3() {
        return (C66581h) ((C36570n) this.f191425g).getValue();
    }

    /* renamed from: f0 */
    public Object mo75243f0(C15601d<? super C13598b0> dVar) {
        return C13598b0.f38549a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.tencent.maas.model.MJMusicInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: ca0.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: com.tencent.maas.model.MJMusicInfo} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0085, code lost:
        r4 = new ca0.C54683f0(r5, r6, new y90.C66559c.C66561b(r0), r10, r9, new y90.C66559c.C66562c(r1), new y90.C66559c.C66563d(r1), new y90.C66559c.C66564e(r0, r1), r13, (ca0.C54679b) null, 512, (gy3.C8480h) null);
        r0.f191426h = r4;
        r2.mo51553F(r4);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ae, code lost:
        r23.mo51565P();
        r4 = (ca0.C54683f0) r4;
        r23.mo51565P();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00b6, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0083, code lost:
        if (r4 == r8) goto L_0x0085;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ca0.C54683f0 mo90626f3(la0.C61242a r21, boolean r22, p175j0.C108504h r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            java.lang.String r3 = "iMaasSdkUIC"
            gy3.C87412m.m108594g(r1, r3)
            r3 = -1079347522(0xffffffffbfaa76be, float:-1.3317487)
            r2.mo51557H(r3)
            r3 = r25 & 2
            if (r3 == 0) goto L_0x0018
            r3 = 1
            r13 = 1
            goto L_0x001a
        L_0x0018:
            r13 = r22
        L_0x001a:
            la0.a$b r3 = r21.mo86217Z0()
            androidx.lifecycle.LiveData r4 = r3.mo86231c()
            sx3.f0 r5 = sx3.C64186f0.f181907d
            r6 = 72
            j0.k2 r5 = p863r0.C63352a.m74693a(r4, r5, r2, r6)
            androidx.lifecycle.LiveData r4 = r3.mo86230b()
            r7 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r2.mo51557H(r7)
            java.lang.Object r7 = r23.mo51606q()
            int r8 = p175j0.C108504h.f324828a
            java.lang.Object r8 = p175j0.C108504h.C60656a.f172772a
            if (r7 != r8) goto L_0x0054
            com.tencent.maas.model.MJMusicInfo r7 = new com.tencent.maas.model.MJMusicInfo
            com.tencent.maas.model.time.MJTime r18 = com.tencent.maas.model.time.MJTime.InvalidTime
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r15 = ""
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            r14 = r7
            r19 = r9
            r14.<init>(r15, r16, r17, r18, r19)
            r2.mo51553F(r7)
        L_0x0054:
            r23.mo51565P()
            j0.k2 r6 = p863r0.C63352a.m74693a(r4, r7, r2, r6)
            androidx.lifecycle.LiveData r4 = r3.mo86229a()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r9 = 56
            j0.k2 r10 = p863r0.C63352a.m74693a(r4, r7, r2, r9)
            androidx.lifecycle.LiveData r3 = r3.mo86232d()
            j0.k2 r9 = p863r0.C63352a.m74693a(r3, r7, r2, r9)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r2.mo51557H(r4)
            boolean r3 = r2.mo51619x(r3)
            java.lang.Object r4 = r23.mo51606q()
            if (r3 != 0) goto L_0x0085
            if (r4 != r8) goto L_0x00ae
        L_0x0085:
            ca0.f0 r3 = new ca0.f0
            y90.c$b r7 = new y90.c$b
            r7.<init>(r0)
            y90.c$c r11 = new y90.c$c
            r11.<init>(r1)
            y90.c$d r12 = new y90.c$d
            r12.<init>(r1)
            y90.c$e r14 = new y90.c$e
            r14.<init>(r0, r1)
            r1 = 0
            r15 = 512(0x200, float:7.175E-43)
            r16 = 0
            r4 = r3
            r8 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r14 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.f191426h = r3
            r2.mo51553F(r3)
        L_0x00ae:
            r23.mo51565P()
            ca0.f0 r4 = (ca0.C54683f0) r4
            r23.mo51565P()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y90.C66559c.mo90626f3(la0.a, boolean, j0.h, int, int):ca0.f0");
    }

    /* renamed from: g3 */
    public abstract void mo75244g3();

    /* renamed from: i3 */
    public final void mo90627i3() {
        C53895h.m60466d(getMainScope(), (C66212f) null, (C53934p0) null, new C66567h(this, (C15601d<? super C66567h>) null), 3, (Object) null);
    }

    /* renamed from: j3 */
    public void mo90628j3(String str) {
        C60667k2<Boolean> k2Var;
        C87412m.m108594g(str, "path");
        C60200t1 t1Var = (C60200t1) C86312j.m106911c(C60200t1.class);
        Activity context = getContext();
        Intent intent = new Intent();
        C63679m.C63680a b = MultiMediaVideoChecker.f273077a.mo129930b(str);
        boolean z = true;
        boolean z2 = (b != null ? b.f180528d : 0) > 60000;
        intent.putExtras(getIntent());
        intent.putExtra("ORIGIN_MUSIC_INFO", getIntent().getByteArrayExtra("KEY_FINDER_POST_MUSIC_INFO"));
        intent.putExtra("ORIGIN_MUSIC_ID", getIntent().getStringExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID"));
        if (!intent.hasExtra("post_id")) {
            intent.putExtra("post_id", C86709a0.m107523b().mo121111i() + '_' + Util.nowMilliSecond());
        }
        intent.putExtra("postType", 4);
        intent.putExtra("postMediaList", C64197v.m75534c(str));
        intent.putExtra("postTypeList", C64197v.m75534c(4));
        C64237ap1 ap12 = new C64237ap1();
        C13604l<String, String> d3 = mo75242d3();
        ap12.f182115d = (String) d3.f38555d;
        ap12.f182116e = 1;
        ap12.f182117f = MJMaasVersion.VERSION_NUMBER_INT_VALUE;
        ap12.f182119h = getIntent().getIntExtra("key_maas_entrance", 0);
        C54683f0 f0Var = this.f191426h;
        if (f0Var == null || (k2Var = f0Var.f153252d) == null || k2Var.getValue().booleanValue()) {
            z = false;
        }
        if (z) {
            Log.m105924i("MaasBaseUILogicUIC", "performPost has music id");
            ap12.f182121j = (String) d3.f38556e;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        intent.putExtra("KEY_POST_VIDEO_TEMPLATE", ap12.toByteArray());
        intent.putExtra("isLongVideoPost", z2);
        intent.putExtra("edit_id", C60781a.f173118a);
        t1Var.mo76801Qy(context, intent);
    }

    /* renamed from: k3 */
    public final void mo90629k3(int i) {
        if (!this.f191428j) {
            C60784e.f173126a.mo85717b(i);
            this.f191428j = true;
        }
    }

    public void onBeforeFinish(Intent intent) {
        super.onBeforeFinish(intent);
        mo90629k3(1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo75244g3();
        mo90625e3().show();
    }

    public void onCreateBefore(Bundle bundle) {
        super.onCreateBefore(bundle);
        C61242a aVar = (C61242a) C39818r.f106831a.mo62443b(getContext()).mo62447c(C61242a.class);
        aVar.mo86204E2(C102826a.f303554a);
        aVar.mo86218b1(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f191424f = null;
        ((C61242a) C39818r.f106831a.mo62443b(getContext()).mo62447c(C61242a.class)).mo86208I2();
        mo90629k3(5);
    }

    /* renamed from: w */
    public void mo86239w(float f) {
        C66581h e3 = mo90625e3();
        String string = getResources().getString(C0966R.string.gst, new Object[]{Integer.valueOf(C60641c.m70921b(f * ((float) 100)))});
        C87412m.m108593f(string, "resources.getString(\n   …oundToInt()\n            )");
        e3.mo90633a(string);
    }
}
