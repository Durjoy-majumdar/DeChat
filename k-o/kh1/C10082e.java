package kh1;

import a14.C0000n0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.DialogInterface;
import cl1.C0689t;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import java.util.concurrent.CancellationException;
import je1.C46523h2;
import kotlin.ResultKt;
import mp3.C88819d;
import ob0.C89132b;
import pe3.C89349b;
import q40.C89456b;
import rx3.C13598b0;
import te3.C51276so2;
import te3.C51323t01;
import te3.C51474u01;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zc1.C66785b;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.ShareEntranceController$onEntranceClick$1", mo125469f = "ShareEntranceController.kt", mo125470l = {152, 154}, mo125471m = "invokeSuspend")
/* renamed from: kh1.e */
public final class C10082e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f30857d;

    /* renamed from: e */
    public /* synthetic */ Object f30858e;

    /* renamed from: f */
    public final /* synthetic */ C10086f f30859f;

    /* renamed from: g */
    public final /* synthetic */ String f30860g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.ShareEntranceController$onEntranceClick$1$dialogJob$1", mo125469f = "ShareEntranceController.kt", mo125470l = {145}, mo125471m = "invokeSuspend")
    /* renamed from: kh1.e$a */
    public static final class C10083a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f30861d;

        /* renamed from: e */
        public final /* synthetic */ C10086f f30862e;

        /* renamed from: kh1.e$a$a */
        public static final class C10084a implements DialogInterface.OnCancelListener {

            /* renamed from: d */
            public final /* synthetic */ C10086f f30863d;

            public C10084a(C10086f fVar) {
                this.f30863d = fVar;
            }

            public final void onCancel(DialogInterface dialogInterface) {
                Log.m105920e("FinderLiveScreenShotShareEntranceController", "#onEntranceClick cancel dialog by user");
                C53973z1 z1Var = this.f30863d.f30872s;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10083a(C10086f fVar, C15601d<? super C10083a> dVar) {
            super(2, dVar);
            this.f30862e = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10083a(this.f30862e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10083a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f30861d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f30861d = 1;
                if (C53965x0.m60607b(500, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C10086f fVar = this.f30862e;
            fVar.mo10516m3(true, new C10084a(fVar));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.screenshotshare.ShareEntranceController$onEntranceClick$1$reqJob$1", mo125469f = "ShareEntranceController.kt", mo125470l = {137}, mo125471m = "invokeSuspend")
    /* renamed from: kh1.e$b */
    public static final class C10085b extends C91594j implements C32227p<C0000n0, C15601d<? super C51474u01>, Object> {

        /* renamed from: d */
        public int f30864d;

        /* renamed from: e */
        public final /* synthetic */ C10086f f30865e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10085b(C10086f fVar, C15601d<? super C10085b> dVar) {
            super(2, dVar);
            this.f30865e = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C10085b(this.f30865e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C10085b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Class cls = C55001u.class;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f30864d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C51323t01 t012 = new C51323t01();
                C10086f fVar = this.f30865e;
                t012.f141871d = C46523h2.f125330a.mo71859a(10017);
                t012.f141872e = C89349b.m111674a(((C55001u) fVar.business(cls)).f154417n);
                t012.f141873f = ((C55001u) fVar.business(cls)).f154420q.f182392d;
                t012.f141874g = ((C55001u) fVar.business(cls)).f154416j;
                t012.f141875h = ((C0689t) fVar.business(C0689t.class)).mo649c3() ? 2 : 1;
                t012.f141876i = ((C54991o) fVar.business(C54991o.class)).f154345o;
                C51276so2 so22 = ((C55001u) fVar.business(cls)).f154420q.f182413y0;
                t012.f141877j = so22 != null ? so22.f141652e : null;
                t012.f141878n = C66785b.f191882e.mo90662O5();
                C89132b<C51474u01> b = t012.mo73359b();
                this.f30864d = 1;
                obj = C89456b.m111831a(b, 0, (C88819d) null, this, 3, (Object) null);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e) {
                    Log.m105920e("FinderLiveScreenShotShareEntranceController", "#onEntranceClick FinderLiveGetPosterInfoResp err:" + e);
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (C51474u01) obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10082e(C10086f fVar, String str, C15601d<? super C10082e> dVar) {
        super(2, dVar);
        this.f30859f = fVar;
        this.f30860g = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C10082e eVar = new C10082e(this.f30859f, this.f30860g, dVar);
        eVar.f30858e = obj;
        return eVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C10082e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f30857d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0029
            if (r2 == r4) goto L_0x001f
            if (r2 != r3) goto L_0x0017
            java.lang.Object r1 = r0.f30858e
            te3.u01 r1 = (te3.C51474u01) r1
            kotlin.ResultKt.throwOnFailure(r23)
            goto L_0x006d
        L_0x0017:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x001f:
            java.lang.Object r2 = r0.f30858e
            a14.u0 r2 = (a14.C53953u0) r2
            kotlin.ResultKt.throwOnFailure(r23)
            r6 = r23
            goto L_0x0059
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r23)
            java.lang.Object r2 = r0.f30858e
            a14.n0 r2 = (a14.C0000n0) r2
            r7 = 0
            r8 = 0
            kh1.e$b r9 = new kh1.e$b
            kh1.f r6 = r0.f30859f
            r9.<init>(r6, r5)
            r10 = 3
            r11 = 0
            r6 = r2
            a14.u0 r12 = a14.C53895h.m60464b(r6, r7, r8, r9, r10, r11)
            kh1.e$a r9 = new kh1.e$a
            kh1.f r6 = r0.f30859f
            r9.<init>(r6, r5)
            r6 = r2
            a14.u0 r2 = a14.C53895h.m60464b(r6, r7, r8, r9, r10, r11)
            r0.f30858e = r2
            r0.f30857d = r4
            a14.v0 r12 = (a14.C53957v0) r12
            java.lang.Object r6 = r12.mo74549z(r0)
            if (r6 != r1) goto L_0x0059
            return r1
        L_0x0059:
            te3.u01 r6 = (te3.C51474u01) r6
            boolean r7 = r2.mo74466a()
            if (r7 == 0) goto L_0x006f
            r0.f30858e = r6
            r0.f30857d = r3
            java.lang.Object r2 = a14.C53873d2.m60391c(r2, r0)
            if (r2 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r1 = r6
        L_0x006d:
            r11 = r1
            goto L_0x0070
        L_0x006f:
            r11 = r6
        L_0x0070:
            kh1.f r1 = r0.f30859f
            r2 = 0
            r1.mo10516m3(r2, r5)
            java.lang.String r1 = "FinderLiveScreenShotShareEntranceController"
            if (r11 != 0) goto L_0x0082
            java.lang.String r2 = "#onEntranceClick FinderLiveGetPosterInfoResp is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x0082:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "#onEntranceClick live_id="
            r3.append(r6)
            kh1.f r6 = r0.f30859f
            java.lang.Class<cl1.u> r7 = cl1.C55001u.class
            androidx.lifecycle.i0 r6 = r6.business(r7)
            cl1.u r6 = (cl1.C55001u) r6
            te3.c21 r6 = r6.f154420q
            long r6 = r6.f182392d
            r3.append(r6)
            java.lang.String r6 = " nickname="
            r3.append(r6)
            java.lang.String r6 = r0.f30860g
            r3.append(r6)
            java.lang.String r6 = " nickname_suffix="
            r3.append(r6)
            java.lang.String r6 = r11.f142517g
            r3.append(r6)
            java.lang.String r6 = " subject="
            r3.append(r6)
            java.lang.String r6 = r11.f142518h
            r3.append(r6)
            java.lang.String r6 = "qrcode_url="
            r3.append(r6)
            java.lang.String r6 = r11.f142519i
            r3.append(r6)
            java.lang.String r6 = "qrcode_content="
            r3.append(r6)
            java.lang.String r6 = r11.f142523p
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "#onEntranceClick frameBitmap.width="
            r3.append(r6)
            kh1.f r6 = r0.f30859f
            android.graphics.Bitmap r6 = r6.f30867n
            if (r6 == 0) goto L_0x00f0
            int r6 = r6.getWidth()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            goto L_0x00f1
        L_0x00f0:
            r7 = r5
        L_0x00f1:
            r3.append(r7)
            java.lang.String r6 = " height="
            r3.append(r6)
            kh1.f r6 = r0.f30859f
            android.graphics.Bitmap r6 = r6.f30867n
            if (r6 == 0) goto L_0x0109
            int r6 = r6.getHeight()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            goto L_0x010a
        L_0x0109:
            r7 = r5
        L_0x010a:
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
            kh1.f r1 = r0.f30859f
            android.graphics.Bitmap r1 = r1.f30867n
            if (r1 == 0) goto L_0x01d8
            int r3 = r1.getWidth()
            if (r3 == 0) goto L_0x0128
            int r3 = r1.getHeight()
            if (r3 == 0) goto L_0x0128
            r3 = 1
            goto L_0x0129
        L_0x0128:
            r3 = 0
        L_0x0129:
            if (r3 == 0) goto L_0x012d
            r8 = r1
            goto L_0x012e
        L_0x012d:
            r8 = r5
        L_0x012e:
            if (r8 == 0) goto L_0x01d8
            kh1.f r1 = r0.f30859f
            java.lang.Class<kh1.c> r3 = kh1.C10079c.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r3 = r1.controller(r3)
            kh1.c r3 = (kh1.C10079c) r3
            if (r3 == 0) goto L_0x01d8
            android.graphics.Bitmap r9 = r1.f30868o
            android.graphics.Bitmap r10 = r1.f30869p
            android.widget.RelativeLayout r1 = r3.f30852j
            if (r1 == 0) goto L_0x01d8
            r3.mo10513n3()
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView r6 = r3.f30853n
            if (r6 != 0) goto L_0x018b
            boolean r6 = r3.mo9310g3()
            java.lang.String r7 = "rootLayout.context"
            if (r6 == 0) goto L_0x0164
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.LandscapeShellView r6 = new com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.LandscapeShellView
            android.content.Context r12 = r1.getContext()
            gy3.C87412m.m108593f(r12, r7)
            r6.<init>(r12, r5)
            r6.mo3190c(r3, r4)
            goto L_0x0173
        L_0x0164:
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.PortraitShellView r6 = new com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.PortraitShellView
            android.content.Context r4 = r1.getContext()
            gy3.C87412m.m108593f(r4, r7)
            r6.<init>(r4, r5)
            r6.mo3190c(r3, r2)
        L_0x0173:
            r3.f30853n = r6
            r1.removeAllViews()
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView r4 = r3.f30853n
            android.widget.RelativeLayout$LayoutParams r6 = new android.widget.RelativeLayout$LayoutParams
            r7 = -2
            r6.<init>(r7, r7)
            r7 = 13
            r12 = -1
            r6.addRule(r7, r12)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            r1.addView(r4, r6)
        L_0x018b:
            com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView r4 = r3.f30853n
            if (r4 == 0) goto L_0x01d5
            java.lang.Class<cl1.t> r6 = cl1.C0689t.class
            androidx.lifecycle.i0 r6 = r3.business(r6)
            cl1.t r6 = (cl1.C0689t) r6
            boolean r12 = r6.mo649c3()
            boolean r13 = r3.f30854o
            kh1.d r15 = new kh1.d
            r15.<init>(r3)
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r3 = r4.f15059h
            if (r3 == 0) goto L_0x01cf
            r17 = 0
            r18 = 0
            lh1.m r19 = new lh1.m
            r14 = 0
            r6 = r19
            r7 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r20 = 3
            r21 = 0
            r16 = r3
            nk1.C11207i.m11066b(r16, r17, r18, r19, r20, r21)
            android.view.View r3 = r4.f15056e
            if (r3 == 0) goto L_0x01c9
            lh1.n r4 = new lh1.n
            r4.<init>(r15)
            r3.setOnClickListener(r4)
            goto L_0x01d5
        L_0x01c9:
            java.lang.String r1 = "btnCancel"
            gy3.C87412m.m108603p(r1)
            throw r5
        L_0x01cf:
            java.lang.String r1 = "controller"
            gy3.C87412m.m108603p(r1)
            throw r5
        L_0x01d5:
            r1.setVisibility(r2)
        L_0x01d8:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kh1.C10082e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
