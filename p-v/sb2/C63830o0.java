package sb2;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d03.C58010a;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gc0.C20828a;
import gy3.C87412m;
import gy3.C87413o;
import hb2.C8503a;
import hc0.C20937c;
import i03.C60241d;
import ic0.C21070h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jc0.C21210b;
import kotlin.ResultKt;
import la2.C99364n;
import m03.C109458k;
import m03.C109459m;
import m03.C61426c;
import ma2.C61454t;
import my3.C61594j;
import my3.C61595o;
import o40.C61926c;
import p501dz.C58467i;
import p823sg.C90193h;
import rx3.C13598b0;
import sx3.C36904l0;
import sx3.C36907w;
import te3.C64621p23;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C119027c;

/* renamed from: sb2.o0 */
public final class C63830o0 extends UIComponent {

    /* renamed from: d */
    public final String f180942d = "MicroMsg.Mv.MusicMvPreviewBgUIC";

    /* renamed from: e */
    public String f180943e;

    /* renamed from: f */
    public String f180944f;

    /* renamed from: g */
    public C64621p23 f180945g;

    /* renamed from: h */
    public C32227p<? super Long, ? super Long, C13598b0> f180946h;

    /* renamed from: i */
    public C32226l<? super Long, C13598b0> f180947i;

    /* renamed from: j */
    public final LinkedList<C60241d> f180948j = new LinkedList<>();

    /* renamed from: n */
    public C61426c f180949n;

    /* renamed from: o */
    public boolean f180950o = true;

    /* renamed from: p */
    public boolean f180951p;

    /* renamed from: sb2.o0$a */
    public static final class C63831a implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ C63830o0 f180952a;

        /* renamed from: b */
        public final /* synthetic */ ImageView f180953b;

        /* renamed from: c */
        public final /* synthetic */ C63770h1 f180954c;

        /* renamed from: sb2.o0$a$a */
        public static final class C63832a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f180955d;

            /* renamed from: e */
            public final /* synthetic */ ImageView f180956e;

            /* renamed from: f */
            public final /* synthetic */ C63770h1 f180957f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63832a(Bitmap bitmap, ImageView imageView, C63770h1 h1Var) {
                super(0);
                this.f180955d = bitmap;
                this.f180956e = imageView;
                this.f180957f = h1Var;
            }

            public Object invoke() {
                this.f180956e.setImageBitmap(BitmapUtil.fastBlurBitmap(this.f180955d, 0.5f, 15));
                C63770h1 h1Var = this.f180957f;
                if (h1Var != null) {
                    Bitmap bitmap = this.f180955d;
                    C87412m.m108593f(bitmap, "bitmap");
                    h1Var.mo80356a(bitmap);
                }
                return C13598b0.f38549a;
            }
        }

        public C63831a(C63830o0 o0Var, ImageView imageView, C63770h1 h1Var) {
            this.f180952a = o0Var;
            this.f180953b = imageView;
            this.f180954c = h1Var;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
            C87412m.m108594g(str, "url");
            C87412m.m108594g(view, "view");
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            C87412m.m108594g(str, "url");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(bVar, "imageData");
            String str2 = this.f180952a.f180942d;
            Object[] objArr = new Object[2];
            boolean z = false;
            objArr[0] = str;
            if (bVar.f59988d != null) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            Log.m105925i(str2, "onImageLoadFinish %s %b", objArr);
            Bitmap bitmap = bVar.f59988d;
            if (bitmap != null && !bitmap.isRecycled()) {
                C61926c.m72668M(new C63832a(bVar.f59988d, this.f180953b, this.f180954c));
            }
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            C87412m.m108594g(str, "url");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(bVar, "imageData");
            return null;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvPreviewBgUIC$initBgVideo$1", mo125469f = "MusicMvPreviewBgUIC.kt", mo125470l = {251}, mo125471m = "invokeSuspend")
    /* renamed from: sb2.o0$b */
    public static final class C63833b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f180958d;

        /* renamed from: e */
        public final /* synthetic */ C63830o0 f180959e;

        /* renamed from: f */
        public final /* synthetic */ FrameLayout f180960f;

        /* renamed from: g */
        public final /* synthetic */ C109459m f180961g;

        /* renamed from: sb2.o0$b$a */
        public static final class C63834a implements C109458k {
            /* renamed from: a */
            public void mo80423a(int i) {
                C99364n.m129616h().mo138822a().mo32203a(i);
            }

            public long getCurrentPosition() {
                return (long) C99364n.m129616h().mo138822a().getPlayPosition();
            }
        }

        /* renamed from: sb2.o0$b$b */
        public static final class C63835b extends C87413o implements C32227p<Long, C58010a, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C63830o0 f180962d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63835b(C63830o0 o0Var) {
                super(2);
                this.f180962d = o0Var;
            }

            public Object invoke(Object obj, Object obj2) {
                long longValue = ((Number) obj).longValue();
                C58010a aVar = (C58010a) obj2;
                C87412m.m108594g(aVar, "mediaInfo");
                long j = longValue - aVar.f165942n;
                long j2 = aVar.f165943o;
                if (j2 <= 0) {
                    j2 = aVar.f165935g;
                }
                C32227p<? super Long, ? super Long, C13598b0> pVar = this.f180962d.f180946h;
                if (pVar != null) {
                    pVar.invoke(Long.valueOf(j), Long.valueOf(j2));
                }
                C32226l<? super Long, C13598b0> lVar = this.f180962d.f180947i;
                if (lVar != null) {
                    lVar.invoke(Long.valueOf(longValue));
                }
                return C13598b0.f38549a;
            }
        }

        /* renamed from: sb2.o0$b$c */
        public static final class C63836c extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FrameLayout f180963d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63836c(FrameLayout frameLayout) {
                super(0);
                this.f180963d = frameLayout;
            }

            public Object invoke() {
                this.f180963d.setAlpha(1.0f);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.uic.MusicMvPreviewBgUIC$initBgVideo$1$mediaInfoList$1", mo125469f = "MusicMvPreviewBgUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: sb2.o0$b$d */
        public static final class C63837d extends C91594j implements C32227p<C0000n0, C15601d<? super LinkedList<C60241d>>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C63830o0 f180964d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C63837d(C63830o0 o0Var, C15601d<? super C63837d> dVar) {
                super(2, dVar);
                this.f180964d = o0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C63837d(this.f180964d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C63837d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                return this.f180964d.mo88627d3();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63833b(C63830o0 o0Var, FrameLayout frameLayout, C109459m mVar, C15601d<? super C63833b> dVar) {
            super(2, dVar);
            this.f180959e = o0Var;
            this.f180960f = frameLayout;
            this.f180961g = mVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63833b(this.f180959e, this.f180960f, this.f180961g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63833b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f180958d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53896h0 h0Var = C53872d1.f151119c;
                C63837d dVar = new C63837d(this.f180959e, (C15601d<? super C63837d>) null);
                this.f180958d = 1;
                obj = C53895h.m60469g(h0Var, dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LinkedList linkedList = (LinkedList) obj;
            String str = this.f180959e.f180942d;
            Log.m105924i(str, "init mediaInfoList:" + linkedList.size());
            if (linkedList.isEmpty()) {
                return C13598b0.f38549a;
            }
            this.f180960f.setAlpha(0.0f);
            C61426c Nu0 = ((C58467i) C86312j.m106911c(C58467i.class)).Nu0(this.f180959e.getActivity());
            C109459m mVar = this.f180961g;
            FrameLayout frameLayout = this.f180960f;
            C63830o0 o0Var = this.f180959e;
            C87412m.m108592e(Nu0, "null cannot be cast to non-null type android.view.View");
            View view = (View) Nu0;
            view.setId(C0966R.C0970id.h7c);
            Nu0.setMediaChangeListener(mVar);
            Nu0.setMvMusicProxy(new C63834a());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            frameLayout.removeAllViews();
            frameLayout.addView(view, layoutParams);
            Nu0.setMute(true);
            Nu0.setLoop(true);
            ArrayList arrayList = new ArrayList();
            Iterator it = linkedList.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C60241d) next).f165943o > 0) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            Nu0.setMediaList(arrayList);
            Nu0.mo86377e();
            if (o0Var.f180950o) {
                o0Var.f180950o = false;
                if (o0Var.getIntent().getBooleanExtra("key_seek_to_start", false)) {
                    Log.m105924i(o0Var.f180942d, "first time play and music seek to start");
                } else {
                    int playPosition = C99364n.m129616h().mo138822a().getPlayPosition();
                    C61426c cVar = o0Var.f180949n;
                    if (cVar != null) {
                        cVar.seekTo((long) playPosition);
                    }
                    String str2 = o0Var.f180942d;
                    Log.m105924i(str2, "first time play and music seek to " + playPosition);
                }
            } else {
                int playPosition2 = C99364n.m129616h().mo138822a().getPlayPosition();
                C61426c cVar2 = o0Var.f180949n;
                if (cVar2 != null) {
                    cVar2.seekTo((long) playPosition2);
                }
                String str3 = o0Var.f180942d;
                Log.m105924i(str3, "first time play and music seek to " + playPosition2);
            }
            Nu0.setOnProgressCallback(new C63835b(o0Var));
            Nu0.setFirstFrameRenderCallback(new C63836c(frameLayout));
            view.setKeepScreenOn(true);
            o0Var.f180949n = Nu0;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63830o0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo88626c3(int i, C8503a aVar) {
        C60241d dVar = this.f180948j.get(i);
        C87412m.m108593f(dVar, "mediaInfoList[index]");
        C60241d dVar2 = dVar;
        String str = null;
        dVar2.f171757y = aVar != null ? aVar.f27534d : null;
        C61426c cVar = this.f180949n;
        if (cVar != null) {
            if (aVar != null) {
                str = aVar.f27534d;
            }
            cVar.mo86378f(dVar2, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r5 = (r5 = r5.objectDesc).mvInfo;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0059  */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.LinkedList<i03.C60241d> mo88627d3() {
        /*
            r24 = this;
            r1 = r24
            monitor-enter(r24)
            java.util.LinkedList<i03.d> r0 = r1.f180948j     // Catch:{ all -> 0x03be }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x03be }
            if (r0 == 0) goto L_0x03ba
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()     // Catch:{ all -> 0x03be }
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x03be }
            r0.<init>()     // Catch:{ all -> 0x03be }
            te3.p23 r4 = r1.f180945g     // Catch:{ all -> 0x03be }
            if (r4 == 0) goto L_0x039b
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r4.f184739d     // Catch:{ all -> 0x03be }
            if (r5 == 0) goto L_0x002b
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc     // Catch:{ all -> 0x03be }
            if (r5 == 0) goto L_0x002b
            te3.hb1 r5 = r5.mvInfo     // Catch:{ all -> 0x03be }
            if (r5 == 0) goto L_0x002b
            int r5 = r5.f183461j     // Catch:{ all -> 0x03be }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x03be }
            goto L_0x002c
        L_0x002b:
            r5 = 0
        L_0x002c:
            r7 = 1
            if (r5 != 0) goto L_0x0030
            goto L_0x0045
        L_0x0030:
            int r5 = r5.intValue()     // Catch:{ all -> 0x03be }
            if (r5 != r7) goto L_0x0045
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r4.f184739d     // Catch:{ all -> 0x03be }
            if (r5 == 0) goto L_0x0054
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc     // Catch:{ all -> 0x03be }
            if (r5 == 0) goto L_0x0054
            te3.hb1 r5 = r5.mvInfo     // Catch:{ all -> 0x03be }
            if (r5 == 0) goto L_0x0054
            java.util.LinkedList<te3.mb1> r5 = r5.f183460i     // Catch:{ all -> 0x03be }
            goto L_0x0055
        L_0x0045:
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r4.f184739d     // Catch:{ all -> 0x03be }
            if (r5 == 0) goto L_0x0054
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r5 = r5.objectDesc     // Catch:{ all -> 0x03be }
            if (r5 == 0) goto L_0x0054
            te3.hb1 r5 = r5.mvInfo     // Catch:{ all -> 0x03be }
            if (r5 == 0) goto L_0x0054
            java.util.LinkedList<te3.mb1> r5 = r5.f183455d     // Catch:{ all -> 0x03be }
            goto L_0x0055
        L_0x0054:
            r5 = 0
        L_0x0055:
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r4 = r4.f184740e     // Catch:{ all -> 0x03be }
            if (r5 == 0) goto L_0x039b
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x03be }
            r9 = 0
        L_0x005e:
            boolean r10 = r5.hasNext()     // Catch:{ all -> 0x03be }
            if (r10 == 0) goto L_0x0399
            java.lang.Object r10 = r5.next()     // Catch:{ all -> 0x03be }
            int r11 = r9 + 1
            if (r9 < 0) goto L_0x0394
            te3.mb1 r10 = (te3.C64550mb1) r10     // Catch:{ all -> 0x03be }
            long r12 = r10.f184260f     // Catch:{ all -> 0x03be }
            r14 = 0
            r6 = 95
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x01f7
            java.lang.String r12 = "refObjectList"
            gy3.C87412m.m108593f(r4, r12)     // Catch:{ all -> 0x03be }
            java.util.Iterator r12 = r4.iterator()     // Catch:{ all -> 0x03be }
        L_0x0082:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x03be }
            if (r13 == 0) goto L_0x01f3
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x03be }
            com.tencent.mm.protocal.protobuf.FinderObject r13 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r13     // Catch:{ all -> 0x03be }
            long r14 = r13.f164794id     // Catch:{ all -> 0x03be }
            long r7 = r10.f184260f     // Catch:{ all -> 0x03be }
            int r18 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r18 != 0) goto L_0x01ee
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r13.objectDesc     // Catch:{ all -> 0x03be }
            if (r7 == 0) goto L_0x01be
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r7 = r7.media     // Catch:{ all -> 0x03be }
            if (r7 == 0) goto L_0x01be
            java.lang.Object r7 = sx3.C110818d0.m150916N(r7)     // Catch:{ all -> 0x03be }
            com.tencent.mm.protocal.protobuf.FinderMedia r7 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r7     // Catch:{ all -> 0x03be }
            if (r7 == 0) goto L_0x01be
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x03be }
            r8.<init>()     // Catch:{ all -> 0x03be }
            java.lang.String r12 = "video_"
            r8.append(r12)     // Catch:{ all -> 0x03be }
            long r14 = r13.f164794id     // Catch:{ all -> 0x03be }
            r8.append(r14)     // Catch:{ all -> 0x03be }
            r8.append(r6)     // Catch:{ all -> 0x03be }
            r8.append(r9)     // Catch:{ all -> 0x03be }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x03be }
            java.lang.String r12 = "mediaId"
            gy3.C87412m.m108594g(r8, r12)     // Catch:{ all -> 0x03be }
            com.tencent.mm.vfs.m1 r12 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x03be }
            ma2.t r14 = ma2.C61454t.f174766a     // Catch:{ all -> 0x03be }
            java.lang.String r14 = r14.mo86431c(r8)     // Catch:{ all -> 0x03be }
            r12.<init>((java.lang.String) r14)     // Catch:{ all -> 0x03be }
            java.lang.String r12 = r12.mo119971i()     // Catch:{ all -> 0x03be }
            java.lang.String r14 = "VFSFile(MusicFileNameUti…th(mediaId)).absolutePath"
            gy3.C87412m.m108593f(r12, r14)     // Catch:{ all -> 0x03be }
            i03.d r14 = new i03.d     // Catch:{ all -> 0x03be }
            java.lang.String r15 = r7.url     // Catch:{ all -> 0x03be }
            if (r15 != 0) goto L_0x00e2
            java.lang.String r15 = ""
        L_0x00e2:
            r21 = r15
            float r15 = r7.width     // Catch:{ all -> 0x03be }
            int r22 = iy3.C60641c.m70921b(r15)     // Catch:{ all -> 0x03be }
            float r15 = r7.height     // Catch:{ all -> 0x03be }
            int r23 = iy3.C60641c.m70921b(r15)     // Catch:{ all -> 0x03be }
            r18 = r14
            r19 = r8
            r20 = r12
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x03be }
            r8 = 2
            r14.f165929a = r8     // Catch:{ all -> 0x03be }
            java.lang.String r8 = "xV2"
            r14.f165930b = r8     // Catch:{ all -> 0x03be }
            java.lang.String r8 = r7.url_token     // Catch:{ all -> 0x03be }
            if (r8 != 0) goto L_0x0107
            java.lang.String r8 = ""
        L_0x0107:
            r14.f165931c = r8     // Catch:{ all -> 0x03be }
            java.lang.String r8 = r7.decodeKey     // Catch:{ all -> 0x03be }
            r14.f165932d = r8     // Catch:{ all -> 0x03be }
            java.lang.String r8 = r7.thumbUrl     // Catch:{ all -> 0x03be }
            if (r8 != 0) goto L_0x0113
            java.lang.String r8 = ""
        L_0x0113:
            r14.f165936h = r8     // Catch:{ all -> 0x03be }
            java.lang.String r7 = r7.thumb_url_token     // Catch:{ all -> 0x03be }
            if (r7 != 0) goto L_0x011b
            java.lang.String r7 = ""
        L_0x011b:
            r14.f165937i = r7     // Catch:{ all -> 0x03be }
            int r7 = r10.f184259e     // Catch:{ all -> 0x03be }
            long r7 = (long) r7     // Catch:{ all -> 0x03be }
            r14.f165943o = r7     // Catch:{ all -> 0x03be }
            long r7 = r10.f184258d     // Catch:{ all -> 0x03be }
            r14.f165942n = r7     // Catch:{ all -> 0x03be }
            long r7 = r10.f184262h     // Catch:{ all -> 0x03be }
            r14.f165944p = r7     // Catch:{ all -> 0x03be }
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r7 = r13.objectDesc     // Catch:{ all -> 0x03be }
            if (r7 == 0) goto L_0x0140
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r7 = r7.media     // Catch:{ all -> 0x03be }
            if (r7 == 0) goto L_0x0140
            java.lang.Object r7 = sx3.C110818d0.m150914L(r7)     // Catch:{ all -> 0x03be }
            com.tencent.mm.protocal.protobuf.FinderMedia r7 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r7     // Catch:{ all -> 0x03be }
            if (r7 == 0) goto L_0x0140
            int r7 = r7.videoDuration     // Catch:{ all -> 0x03be }
            long r7 = (long) r7     // Catch:{ all -> 0x03be }
            r16 = r7
            goto L_0x0142
        L_0x0140:
            r16 = 0
        L_0x0142:
            r7 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r16
            r14.f165935g = r7     // Catch:{ all -> 0x03be }
            r7 = 0
            r14.f165933e = r7     // Catch:{ all -> 0x03be }
            r14.f165945q = r13     // Catch:{ all -> 0x03be }
            float r8 = r10.f184267p     // Catch:{ all -> 0x03be }
            r14.f171756x = r8     // Catch:{ all -> 0x03be }
            java.lang.String r8 = r10.f184268q     // Catch:{ all -> 0x03be }
            hb2.a$a r12 = hb2.C8503a.f27529e     // Catch:{ all -> 0x03be }
            java.util.LinkedHashMap<java.lang.String, hb2.a> r12 = hb2.C8503a.f27530f     // Catch:{ all -> 0x03be }
            java.lang.Object r8 = r12.get(r8)     // Catch:{ all -> 0x03be }
            hb2.a r8 = (hb2.C8503a) r8     // Catch:{ all -> 0x03be }
            if (r8 == 0) goto L_0x0163
            java.lang.String r8 = r8.f27534d     // Catch:{ all -> 0x03be }
            r14.f171757y = r8     // Catch:{ all -> 0x03be }
        L_0x0163:
            r0.add(r14)     // Catch:{ all -> 0x03be }
            java.lang.String r8 = r1.f180942d     // Catch:{ all -> 0x03be }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x03be }
            r12.<init>()     // Catch:{ all -> 0x03be }
            java.lang.String r13 = "add mediaTrack network id:"
            r12.append(r13)     // Catch:{ all -> 0x03be }
            java.lang.String r13 = r14.f165947s     // Catch:{ all -> 0x03be }
            r12.append(r13)     // Catch:{ all -> 0x03be }
            java.lang.String r13 = " path:"
            r12.append(r13)     // Catch:{ all -> 0x03be }
            java.lang.String r13 = r14.f165948t     // Catch:{ all -> 0x03be }
            r12.append(r13)     // Catch:{ all -> 0x03be }
            java.lang.String r13 = " width:"
            r12.append(r13)     // Catch:{ all -> 0x03be }
            int r13 = r14.f165950v     // Catch:{ all -> 0x03be }
            r12.append(r13)     // Catch:{ all -> 0x03be }
            java.lang.String r13 = " height:"
            r12.append(r13)     // Catch:{ all -> 0x03be }
            int r13 = r14.f165951w     // Catch:{ all -> 0x03be }
            r12.append(r13)     // Catch:{ all -> 0x03be }
            java.lang.String r13 = " timeOffsetInClipMs:"
            r12.append(r13)     // Catch:{ all -> 0x03be }
            long r6 = r14.f165944p     // Catch:{ all -> 0x03be }
            r12.append(r6)     // Catch:{ all -> 0x03be }
            java.lang.String r6 = " timeOffsetInMvMs:"
            r12.append(r6)     // Catch:{ all -> 0x03be }
            long r6 = r14.f165942n     // Catch:{ all -> 0x03be }
            r12.append(r6)     // Catch:{ all -> 0x03be }
            java.lang.String r6 = " timeLengthInMvMs:"
            r12.append(r6)     // Catch:{ all -> 0x03be }
            long r6 = r14.f165943o     // Catch:{ all -> 0x03be }
            r12.append(r6)     // Catch:{ all -> 0x03be }
            java.lang.String r6 = r12.toString()     // Catch:{ all -> 0x03be }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)     // Catch:{ all -> 0x03be }
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03be }
            r7 = 1
            goto L_0x01c0
        L_0x01be:
            r6 = 0
            r7 = 0
        L_0x01c0:
            if (r6 != 0) goto L_0x01f4
            java.lang.String r6 = r1.f180942d     // Catch:{ all -> 0x03be }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x03be }
            r8.<init>()     // Catch:{ all -> 0x03be }
            java.lang.String r12 = "not find ref object media "
            r8.append(r12)     // Catch:{ all -> 0x03be }
            r8.append(r9)     // Catch:{ all -> 0x03be }
            r12 = 32
            r8.append(r12)     // Catch:{ all -> 0x03be }
            long r14 = r10.f184260f     // Catch:{ all -> 0x03be }
            r8.append(r14)     // Catch:{ all -> 0x03be }
            r8.append(r12)     // Catch:{ all -> 0x03be }
            java.lang.String r12 = r10.f184261g     // Catch:{ all -> 0x03be }
            r8.append(r12)     // Catch:{ all -> 0x03be }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x03be }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r8)     // Catch:{ all -> 0x03be }
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03be }
            goto L_0x01f4
        L_0x01ee:
            r7 = 1
            r14 = 0
            goto L_0x0082
        L_0x01f3:
            r7 = 0
        L_0x01f4:
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03be }
            goto L_0x01f8
        L_0x01f7:
            r7 = 0
        L_0x01f8:
            if (r7 != 0) goto L_0x0390
            java.lang.String r6 = r1.f180942d     // Catch:{ all -> 0x03be }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x03be }
            r7.<init>()     // Catch:{ all -> 0x03be }
            java.lang.String r8 = "not find ref obj Id:"
            r7.append(r8)     // Catch:{ all -> 0x03be }
            long r14 = r10.f184260f     // Catch:{ all -> 0x03be }
            r7.append(r14)     // Catch:{ all -> 0x03be }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x03be }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x03be }
            gy3.f0 r6 = new gy3.f0     // Catch:{ all -> 0x03be }
            r6.<init>()     // Catch:{ all -> 0x03be }
            java.lang.String r7 = r10.f184261g     // Catch:{ all -> 0x03be }
            if (r7 == 0) goto L_0x029f
            int r8 = r7.length()     // Catch:{ all -> 0x03be }
            if (r8 <= 0) goto L_0x0224
            r8 = 1
            goto L_0x0225
        L_0x0224:
            r8 = 0
        L_0x0225:
            if (r8 == 0) goto L_0x0228
            goto L_0x0229
        L_0x0228:
            r7 = 0
        L_0x0229:
            if (r7 == 0) goto L_0x029f
            if (r4 == 0) goto L_0x029f
            java.util.Iterator r8 = r4.iterator()     // Catch:{ all -> 0x03be }
        L_0x0231:
            boolean r12 = r8.hasNext()     // Catch:{ all -> 0x03be }
            if (r12 == 0) goto L_0x029d
            java.lang.Object r12 = r8.next()     // Catch:{ all -> 0x03be }
            com.tencent.mm.protocal.protobuf.FinderObject r12 = (com.tencent.p014mm.protocal.protobuf.FinderObject) r12     // Catch:{ all -> 0x03be }
            java.lang.String r14 = r12.objectNonceId     // Catch:{ all -> 0x03be }
            boolean r14 = gy3.C87412m.m108589b(r7, r14)     // Catch:{ all -> 0x03be }
            if (r14 == 0) goto L_0x0231
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r14 = r12.objectDesc     // Catch:{ all -> 0x03be }
            if (r14 == 0) goto L_0x0231
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r14 = r14.media     // Catch:{ all -> 0x03be }
            if (r14 == 0) goto L_0x0231
            java.lang.Object r14 = sx3.C110818d0.m150916N(r14)     // Catch:{ all -> 0x03be }
            com.tencent.mm.protocal.protobuf.FinderMedia r14 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r14     // Catch:{ all -> 0x03be }
            if (r14 == 0) goto L_0x0231
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x03be }
            r15.<init>()     // Catch:{ all -> 0x03be }
            java.lang.String r13 = "video_"
            r15.append(r13)     // Catch:{ all -> 0x03be }
            java.lang.String r13 = r12.objectNonceId     // Catch:{ all -> 0x03be }
            r15.append(r13)     // Catch:{ all -> 0x03be }
            r13 = 95
            r15.append(r13)     // Catch:{ all -> 0x03be }
            r15.append(r9)     // Catch:{ all -> 0x03be }
            java.lang.String r19 = r15.toString()     // Catch:{ all -> 0x03be }
            i03.d r15 = new i03.d     // Catch:{ all -> 0x03be }
            java.lang.String r13 = r14.url     // Catch:{ all -> 0x03be }
            if (r13 != 0) goto L_0x0279
            java.lang.String r13 = ""
        L_0x0279:
            r20 = r13
            java.lang.String r21 = ""
            float r13 = r14.width     // Catch:{ all -> 0x03be }
            int r22 = iy3.C60641c.m70921b(r13)     // Catch:{ all -> 0x03be }
            float r13 = r14.height     // Catch:{ all -> 0x03be }
            int r23 = iy3.C60641c.m70921b(r13)     // Catch:{ all -> 0x03be }
            r18 = r15
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x03be }
            int r13 = r14.videoDuration     // Catch:{ all -> 0x03be }
            long r13 = (long) r13     // Catch:{ all -> 0x03be }
            r15.f165935g = r13     // Catch:{ all -> 0x03be }
            rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03be }
            r6.f27484d = r15     // Catch:{ all -> 0x03be }
            r15.f165945q = r12     // Catch:{ all -> 0x03be }
            r12 = 1
            r15.f165933e = r12     // Catch:{ all -> 0x03be }
            goto L_0x0231
        L_0x029d:
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03be }
        L_0x029f:
            T r7 = r6.f27484d     // Catch:{ all -> 0x03be }
            if (r7 != 0) goto L_0x02e9
            hb2.b$a r7 = hb2.C59809b.f170715f     // Catch:{ all -> 0x03be }
            hb2.b r7 = r7.mo84759a()     // Catch:{ all -> 0x03be }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x03be }
            r8.<init>()     // Catch:{ all -> 0x03be }
            java.lang.String r12 = "video_"
            r8.append(r12)     // Catch:{ all -> 0x03be }
            java.lang.String r12 = r7.f170717a     // Catch:{ all -> 0x03be }
            r8.append(r12)     // Catch:{ all -> 0x03be }
            r12 = 95
            r8.append(r12)     // Catch:{ all -> 0x03be }
            r8.append(r9)     // Catch:{ all -> 0x03be }
            java.lang.String r19 = r8.toString()     // Catch:{ all -> 0x03be }
            i03.d r8 = new i03.d     // Catch:{ all -> 0x03be }
            java.lang.String r20 = r7.mo84758a()     // Catch:{ all -> 0x03be }
            java.lang.String r21 = ""
            int r9 = r7.f170718b     // Catch:{ all -> 0x03be }
            int r12 = r7.f170719c     // Catch:{ all -> 0x03be }
            r18 = r8
            r22 = r9
            r23 = r12
            r18.<init>(r19, r20, r21, r22, r23)     // Catch:{ all -> 0x03be }
            long r12 = r7.f170720d     // Catch:{ all -> 0x03be }
            r8.f165935g = r12     // Catch:{ all -> 0x03be }
            r7 = 1
            r8.f165940l = r7     // Catch:{ all -> 0x03be }
            r8.f165941m = r7     // Catch:{ all -> 0x03be }
            rx3.b0 r9 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03be }
            r6.f27484d = r8     // Catch:{ all -> 0x03be }
            r8.f165933e = r7     // Catch:{ all -> 0x03be }
        L_0x02e9:
            T r6 = r6.f27484d     // Catch:{ all -> 0x03be }
            i03.d r6 = (i03.C60241d) r6     // Catch:{ all -> 0x03be }
            if (r6 == 0) goto L_0x0390
            int r7 = r10.f184270s     // Catch:{ all -> 0x03be }
            r6.f171755A = r7     // Catch:{ all -> 0x03be }
            java.util.ArrayList<java.lang.Integer> r7 = r6.f171758z     // Catch:{ all -> 0x03be }
            java.util.LinkedList<java.lang.Integer> r8 = r10.f184269r     // Catch:{ all -> 0x03be }
            r7.addAll(r8)     // Catch:{ all -> 0x03be }
            int r7 = r10.f184259e     // Catch:{ all -> 0x03be }
            long r7 = (long) r7     // Catch:{ all -> 0x03be }
            r6.f165943o = r7     // Catch:{ all -> 0x03be }
            long r7 = r10.f184258d     // Catch:{ all -> 0x03be }
            r6.f165942n = r7     // Catch:{ all -> 0x03be }
            long r7 = r10.f184262h     // Catch:{ all -> 0x03be }
            r6.f165944p = r7     // Catch:{ all -> 0x03be }
            r7 = 1
            r6.f165933e = r7     // Catch:{ all -> 0x03be }
            java.lang.Class<com.tencent.mm.feature.sight.api.ISightJNIService> r8 = com.tencent.p014mm.feature.sight.api.ISightJNIService.class
            di3.d r8 = di3.C86312j.m106911c(r8)     // Catch:{ all -> 0x03be }
            com.tencent.mm.feature.sight.api.ISightJNIService r8 = (com.tencent.p014mm.feature.sight.api.ISightJNIService) r8     // Catch:{ all -> 0x03be }
            java.lang.String r9 = r6.f165948t     // Catch:{ all -> 0x03be }
            int r8 = r8.getMp4RotateVFS(r9)     // Catch:{ all -> 0x03be }
            r6.f165939k = r8     // Catch:{ all -> 0x03be }
            boolean r8 = r6.mo85229a()     // Catch:{ all -> 0x03be }
            if (r8 == 0) goto L_0x0324
            r8 = 5000(0x1388, double:2.4703E-320)
            r6.f165935g = r8     // Catch:{ all -> 0x03be }
        L_0x0324:
            java.lang.String r8 = r10.f184268q     // Catch:{ all -> 0x03be }
            hb2.a$a r9 = hb2.C8503a.f27529e     // Catch:{ all -> 0x03be }
            java.util.LinkedHashMap<java.lang.String, hb2.a> r9 = hb2.C8503a.f27530f     // Catch:{ all -> 0x03be }
            java.lang.Object r8 = r9.get(r8)     // Catch:{ all -> 0x03be }
            hb2.a r8 = (hb2.C8503a) r8     // Catch:{ all -> 0x03be }
            if (r8 == 0) goto L_0x0336
            java.lang.String r8 = r8.f27534d     // Catch:{ all -> 0x03be }
            r6.f171757y = r8     // Catch:{ all -> 0x03be }
        L_0x0336:
            r0.add(r6)     // Catch:{ all -> 0x03be }
            java.lang.String r8 = r1.f180942d     // Catch:{ all -> 0x03be }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x03be }
            r9.<init>()     // Catch:{ all -> 0x03be }
            java.lang.String r10 = "add mediaTrack local id:"
            r9.append(r10)     // Catch:{ all -> 0x03be }
            java.lang.String r10 = r6.f165947s     // Catch:{ all -> 0x03be }
            r9.append(r10)     // Catch:{ all -> 0x03be }
            java.lang.String r10 = " path:"
            r9.append(r10)     // Catch:{ all -> 0x03be }
            java.lang.String r10 = r6.f165948t     // Catch:{ all -> 0x03be }
            r9.append(r10)     // Catch:{ all -> 0x03be }
            java.lang.String r10 = " width:"
            r9.append(r10)     // Catch:{ all -> 0x03be }
            int r10 = r6.f165950v     // Catch:{ all -> 0x03be }
            r9.append(r10)     // Catch:{ all -> 0x03be }
            java.lang.String r10 = " height:"
            r9.append(r10)     // Catch:{ all -> 0x03be }
            int r10 = r6.f165951w     // Catch:{ all -> 0x03be }
            r9.append(r10)     // Catch:{ all -> 0x03be }
            java.lang.String r10 = " timeOffsetInClipMs:"
            r9.append(r10)     // Catch:{ all -> 0x03be }
            long r12 = r6.f165944p     // Catch:{ all -> 0x03be }
            r9.append(r12)     // Catch:{ all -> 0x03be }
            java.lang.String r10 = " timeOffsetInMvMs:"
            r9.append(r10)     // Catch:{ all -> 0x03be }
            long r12 = r6.f165942n     // Catch:{ all -> 0x03be }
            r9.append(r12)     // Catch:{ all -> 0x03be }
            java.lang.String r10 = " timeLengthInMvMs:"
            r9.append(r10)     // Catch:{ all -> 0x03be }
            long r12 = r6.f165943o     // Catch:{ all -> 0x03be }
            r9.append(r12)     // Catch:{ all -> 0x03be }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x03be }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)     // Catch:{ all -> 0x03be }
            rx3.b0 r6 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03be }
            goto L_0x0391
        L_0x0390:
            r7 = 1
        L_0x0391:
            r9 = r11
            goto L_0x005e
        L_0x0394:
            sx3.C64197v.m75542k()     // Catch:{ all -> 0x03be }
            r0 = 0
            throw r0     // Catch:{ all -> 0x03be }
        L_0x0399:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x03be }
        L_0x039b:
            java.lang.String r4 = r1.f180942d     // Catch:{ all -> 0x03be }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x03be }
            r5.<init>()     // Catch:{ all -> 0x03be }
            java.lang.String r6 = "collectBgVideoInfo cost:"
            r5.append(r6)     // Catch:{ all -> 0x03be }
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)     // Catch:{ all -> 0x03be }
            r5.append(r2)     // Catch:{ all -> 0x03be }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x03be }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r2)     // Catch:{ all -> 0x03be }
            java.util.LinkedList<i03.d> r2 = r1.f180948j     // Catch:{ all -> 0x03be }
            r2.addAll(r0)     // Catch:{ all -> 0x03be }
        L_0x03ba:
            java.util.LinkedList<i03.d> r0 = r1.f180948j     // Catch:{ all -> 0x03be }
            monitor-exit(r24)
            return r0
        L_0x03be:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63830o0.mo88627d3():java.util.LinkedList");
    }

    /* renamed from: e3 */
    public final void mo88628e3(C63770h1 h1Var) {
        ImageView imageView = (ImageView) getActivity().findViewById(C0966R.C0970id.a3i);
        C63831a aVar = new C63831a(this, imageView, h1Var);
        String str = this.f180943e;
        if (str != null) {
            String str2 = this.f180942d;
            Log.m105924i(str2, "initBgCover thumbPath:" + this.f180943e);
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59345a = true;
            bVar.f59353i = 1;
            C20828a.m22825b().mo32520i(str, imageView, bVar.mo32666a(), aVar);
            return;
        }
        String str3 = this.f180944f;
        if (str3 != null) {
            C61454t tVar = C61454t.f174766a;
            StringBuilder sb = new StringBuilder();
            sb.append("thumb_");
            byte[] bytes = str3.getBytes(C119027c.f356488a);
            C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
            sb.append(C90193h.m112878f(bytes));
            String i = new C86009m1(tVar.mo86430b(sb.toString())).mo119971i();
            C87412m.m108593f(i, "VFSFile(MusicFileNameUti…Array())}\")).absolutePath");
            String str4 = this.f180942d;
            Log.m105924i(str4, "initBgCover url:" + str3 + " fullPath:" + i);
            C20937c.C20939b bVar2 = new C20937c.C20939b();
            bVar2.f59350f = i;
            bVar2.f59346b = true;
            bVar2.f59345a = true;
            C20828a.m22825b().mo32520i(str3, imageView, bVar2.mo32666a(), aVar);
        }
    }

    /* renamed from: f3 */
    public final void mo88629f3(C109459m mVar) {
        C87412m.m108594g(mVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C0001s1 s1Var = C0001s1.f0d;
        C53896h0 h0Var = C53872d1.f151117a;
        C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C63833b(this, (FrameLayout) getActivity().findViewById(C0966R.C0970id.a3h), mVar, (C15601d<? super C63833b>) null), 2, (Object) null);
    }

    /* renamed from: g3 */
    public final void mo88630g3(long j) {
        C61594j i = C61595o.m72301i(0, this.f180948j.size() - 1);
        LinkedList<C60241d> linkedList = this.f180948j;
        ArrayList<C60241d> arrayList = new ArrayList<>(C36907w.m41090l(i, 10));
        Iterator it = i.iterator();
        while (it.hasNext()) {
            arrayList.add(linkedList.get(((C36904l0) it).mo59695a()));
        }
        long j2 = 0;
        for (C60241d dVar : arrayList) {
            dVar.f165942n = j2;
            j2 += dVar.f165943o;
        }
        C60241d last = this.f180948j.getLast();
        last.f165942n = j2;
        last.f165943o = j;
    }

    /* renamed from: i3 */
    public final void mo88631i3(long j) {
        String str = this.f180942d;
        Log.m105924i(str, "seekToTime: " + j);
        C61426c cVar = this.f180949n;
        if (cVar != null) {
            cVar.seekTo(j);
        }
    }

    public void onCreate(Bundle bundle) {
        if (getIntent().getBooleanExtra("key_seek_to_start", false)) {
            C99364n.m129616h().mo138822a().mo32203a(0);
        }
    }

    public void onDestroy() {
        C61426c cVar = this.f180949n;
        if (cVar != null) {
            cVar.release();
        }
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null && intent.getBooleanExtra("key_seek_to_start", false)) {
            C99364n.m129616h().mo138822a().mo32203a(0);
        }
    }

    public void onPause() {
        this.f180951p = true;
        C61426c cVar = this.f180949n;
        if (cVar != null) {
            cVar.pause();
        }
    }

    public void onResume() {
        if (this.f180951p) {
            C61426c cVar = this.f180949n;
            if (cVar != null) {
                cVar.start();
            }
            this.f180951p = false;
        }
    }

    public void onStart() {
        super.onStart();
        C61426c cVar = this.f180949n;
        if (cVar != null) {
            cVar.start();
        }
    }

    public void onStop() {
        super.onStop();
        C61426c cVar = this.f180949n;
        if (cVar != null) {
            cVar.stop();
        }
    }
}
