package com.tencent.p014mm.p136ui.chatting.gallery;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import bp3.C104160f;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.TPVideoPlayReportStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.thumbplayer.view.ThumbPlayerViewContainer;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.RedesignVideoPlayerSeekBar;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C97625j3;
import f03.C97787h;
import f14.C58901s;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hd0.C98408n0;
import hd0.C98410o0;
import hd0.C98429r0;
import hd0.C98442x0;
import iy3.C60641c;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import m03.C99783d;
import mk3.C99910f;
import nc3.C34767b;
import nj3.C76912y0;
import p1081gi.C98127h;
import p159gw.C98250h;
import p206nj.C11171e;
import p682rz.C101488s;
import p682rz.C101489t;
import p682rz.C101491u;
import p740wo.C53193b;
import rx3.C13598b0;
import s90.C48300n;
import te3.C64598o03;
import wx3.C15601d;
import wx3.C66212f;
import xn2.C102693c;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.chatting.gallery.u0 */
public final class C97136u0 extends C97052g {

    /* renamed from: E */
    public static final boolean f285023E = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_enable_c2c_tp, false);

    /* renamed from: A */
    public long f285024A;

    /* renamed from: B */
    public long f285025B;

    /* renamed from: C */
    public int f285026C;

    /* renamed from: D */
    public int f285027D;

    /* renamed from: i */
    public C0000n0 f285028i = C53930o0.m60555b();

    /* renamed from: j */
    public C34767b.C34768c f285029j;

    /* renamed from: n */
    public C53973z1 f285030n;

    /* renamed from: o */
    public C53973z1 f285031o;

    /* renamed from: p */
    public long f285032p;

    /* renamed from: q */
    public boolean f285033q;

    /* renamed from: r */
    public String f285034r;

    /* renamed from: s */
    public final HashMap<String, C97137a> f285035s = new HashMap<>();

    /* renamed from: t */
    public boolean f285036t;

    /* renamed from: u */
    public C97787h f285037u;

    /* renamed from: v */
    public C101489t.C77595a f285038v;

    /* renamed from: w */
    public boolean f285039w;

    /* renamed from: x */
    public boolean f285040x;

    /* renamed from: y */
    public final C102693c f285041y;

    /* renamed from: z */
    public int f285042z;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$a */
    public static final class C97137a {

        /* renamed from: a */
        public final int f285043a;

        /* renamed from: b */
        public final C72963f4 f285044b;

        /* renamed from: c */
        public final C97787h f285045c;

        public C97137a(int i, C72963f4 f4Var, C97787h hVar, int i2, C8480h hVar2) {
            hVar = (i2 & 4) != 0 ? null : hVar;
            C87412m.m108594g(f4Var, "msg");
            this.f285043a = i;
            this.f285044b = f4Var;
            this.f285045c = hVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C97137a)) {
                return false;
            }
            C97137a aVar = (C97137a) obj;
            return this.f285043a == aVar.f285043a && C87412m.m108589b(this.f285044b, aVar.f285044b) && C87412m.m108589b(this.f285045c, aVar.f285045c);
        }

        public int hashCode() {
            int hashCode = ((this.f285043a * 31) + this.f285044b.hashCode()) * 31;
            C97787h hVar = this.f285045c;
            return hashCode + (hVar == null ? 0 : hVar.hashCode());
        }

        public String toString() {
            return "VideoItem(position=" + this.f285043a + ", msg=" + this.f285044b + ", downloader=" + this.f285045c + ')';
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$b */
    public static final class C97138b implements C96875r0.C96879e {

        /* renamed from: d */
        public final /* synthetic */ C97136u0 f285046d;

        /* renamed from: e */
        public final /* synthetic */ C97087m1 f285047e;

        public C97138b(C97136u0 u0Var, C97087m1 m1Var) {
            this.f285046d = u0Var;
            this.f285047e = m1Var;
        }

        /* renamed from: r */
        public final void mo79636r() {
            Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "First video frame has been rendered");
            C97136u0.m125066F(this.f285046d, this.f285047e);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$play$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {449, 465, 465, 569, 586}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$c */
    public static final class C97139c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f285048d;

        /* renamed from: e */
        public Object f285049e;

        /* renamed from: f */
        public Object f285050f;

        /* renamed from: g */
        public int f285051g;

        /* renamed from: h */
        public int f285052h;

        /* renamed from: i */
        public int f285053i;

        /* renamed from: j */
        public int f285054j;

        /* renamed from: n */
        public /* synthetic */ Object f285055n;

        /* renamed from: o */
        public final /* synthetic */ C97136u0 f285056o;

        /* renamed from: p */
        public final /* synthetic */ C72963f4 f285057p;

        /* renamed from: q */
        public final /* synthetic */ C97087m1 f285058q;

        /* renamed from: r */
        public final /* synthetic */ C99783d f285059r;

        /* renamed from: s */
        public final /* synthetic */ int f285060s;

        /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$c$a */
        public static final class C97140a implements C96875r0.C19571b {

            /* renamed from: d */
            public final /* synthetic */ C97136u0 f285061d;

            /* renamed from: e */
            public final /* synthetic */ C97087m1 f285062e;

            public C97140a(C97136u0 u0Var, C97087m1 m1Var) {
                this.f285061d = u0Var;
                this.f285062e = m1Var;
            }

            /* renamed from: j */
            public final void mo25380j(int i, int i2) {
                if (i == 701) {
                    Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "on buffering start");
                    C97136u0.m125064D(this.f285061d, this.f285062e);
                } else if (i == 702) {
                    Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "on buffering end");
                    C97136u0.m125066F(this.f285061d, this.f285062e);
                }
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$play$1$fileIdDeferred$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$c$b */
        public static final class C97141b extends C91594j implements C32227p<C0000n0, C15601d<? super String>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C98408n0 f285063d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97141b(C98408n0 n0Var, C15601d<? super C97141b> dVar) {
                super(2, dVar);
                this.f285063d = n0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97141b(this.f285063d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97141b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                return C98408n0.m127710c(this.f285063d.mo137705i());
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$play$1$info$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$c$c */
        public static final class C97142c extends C91594j implements C32227p<C0000n0, C15601d<? super C98408n0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f285064d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97142c(C72963f4 f4Var, C15601d<? super C97142c> dVar) {
                super(2, dVar);
                this.f285064d = f4Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97142c(this.f285064d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97142c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                return C97052g.m124927o(this.f285064d);
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$play$1$memberCountDeferred$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$c$d */
        public static final class C97143d extends C91594j implements C32227p<C0000n0, C15601d<? super Integer>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C98408n0 f285065d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97143d(C98408n0 n0Var, C15601d<? super C97143d> dVar) {
                super(2, dVar);
                this.f285065d = n0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C97143d(this.f285065d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C97143d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                return new Integer(C72996z1.m85820U5(this.f285065d.mo137707k()) ? ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(this.f285065d.mo137707k()) : 0);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$c$e */
        public static final class C97144e extends C87413o implements C32226l<C98127h, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ TPVideoPlayReportStruct f285066d;

            /* renamed from: e */
            public final /* synthetic */ C98408n0 f285067e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C97144e(TPVideoPlayReportStruct tPVideoPlayReportStruct, C98408n0 n0Var) {
                super(1);
                this.f285066d = tPVideoPlayReportStruct;
                this.f285067e = n0Var;
            }

            public Object invoke(Object obj) {
                long j;
                C98127h hVar = (C98127h) obj;
                C87412m.m108594g(hVar, LocaleUtil.ITALIAN);
                TPVideoPlayReportStruct tPVideoPlayReportStruct = this.f285066d;
                tPVideoPlayReportStruct.f266336f = tPVideoPlayReportStruct.mo86045b("FileId", hVar.field_fileId, true);
                TPVideoPlayReportStruct tPVideoPlayReportStruct2 = this.f285066d;
                tPVideoPlayReportStruct2.f266337g = tPVideoPlayReportStruct2.mo86045b("MediaId", hVar.field_mediaId, true);
                TPVideoPlayReportStruct tPVideoPlayReportStruct3 = this.f285066d;
                tPVideoPlayReportStruct3.f266351u = (long) hVar.f287669p;
                int i = this.f285067e.f288539G;
                tPVideoPlayReportStruct3.f266352v = (long) i;
                int i2 = hVar.f287692W0;
                if (i2 <= 0) {
                    j = 1;
                } else {
                    j = ((float) i) < (((float) i2) / 100.0f) * ((float) hVar.f287687U) ? 2 : 3;
                }
                tPVideoPlayReportStruct3.f266353w = j;
                tPVideoPlayReportStruct3.f266338h = (long) hVar.field_totalLen;
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97139c(C97136u0 u0Var, C72963f4 f4Var, C97087m1 m1Var, C99783d dVar, int i, C15601d<? super C97139c> dVar2) {
            super(2, dVar2);
            this.f285056o = u0Var;
            this.f285057p = f4Var;
            this.f285058q = m1Var;
            this.f285059r = dVar;
            this.f285060s = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C97139c cVar = new C97139c(this.f285056o, this.f285057p, this.f285058q, this.f285059r, this.f285060s, dVar);
            cVar.f285055n = obj;
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C97139c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:121:0x03df  */
        /* JADX WARNING: Removed duplicated region for block: B:122:0x03e1  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x03f9  */
        /* JADX WARNING: Removed duplicated region for block: B:131:0x0419  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0167 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0168  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0188  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x01a8  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01ed  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x02f5  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0300  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                r23 = this;
                r1 = r23
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r1.f285054j
                java.lang.String r3 = "MicroMsg.Imagegallery.handler.video.tp"
                r4 = 4
                r5 = 5
                r6 = 0
                r7 = 1
                r8 = 2131838363(0x7f11459b, float:1.9309947E38)
                r9 = 3
                r10 = 2
                r11 = 0
                if (r2 == 0) goto L_0x0093
                if (r2 == r7) goto L_0x0089
                if (r2 == r10) goto L_0x006a
                if (r2 == r9) goto L_0x0046
                if (r2 == r4) goto L_0x003a
                if (r2 != r5) goto L_0x0032
                java.lang.Object r0 = r1.f285049e
                com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader r0 = (com.tencent.p014mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader) r0
                java.lang.Object r2 = r1.f285048d
                hd0.n0 r2 = (hd0.C98408n0) r2
                java.lang.Object r4 = r1.f285055n
                a14.n0 r4 = (a14.C0000n0) r4
                kotlin.ResultKt.throwOnFailure(r24)     // Catch:{ IllegalStateException -> 0x002f }
                goto L_0x03b2
            L_0x002f:
                r0 = move-exception
                goto L_0x042d
            L_0x0032:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x003a:
                java.lang.Object r0 = r1.f285055n
                hd0.n0 r0 = (hd0.C98408n0) r0
                kotlin.ResultKt.throwOnFailure(r24)     // Catch:{ a -> 0x0043 }
                goto L_0x02d6
            L_0x0043:
                r0 = move-exception
                goto L_0x0309
            L_0x0046:
                int r2 = r1.f285053i
                int r12 = r1.f285052h
                int r13 = r1.f285051g
                java.lang.Object r14 = r1.f285050f
                java.lang.String r14 = (java.lang.String) r14
                java.lang.Object r15 = r1.f285049e
                com.tencent.mm.ui.chatting.gallery.m1 r15 = (com.tencent.p014mm.p136ui.chatting.gallery.C97087m1) r15
                java.lang.Object r5 = r1.f285048d
                hd0.n0 r5 = (hd0.C98408n0) r5
                java.lang.Object r4 = r1.f285055n
                a14.n0 r4 = (a14.C0000n0) r4
                kotlin.ResultKt.throwOnFailure(r24)
                r8 = r14
                r14 = r4
                r4 = r24
                r22 = r5
                r5 = r2
                r2 = r22
                goto L_0x016e
            L_0x006a:
                int r2 = r1.f285052h
                int r4 = r1.f285051g
                java.lang.Object r5 = r1.f285050f
                com.tencent.mm.ui.chatting.gallery.m1 r5 = (com.tencent.p014mm.p136ui.chatting.gallery.C97087m1) r5
                java.lang.Object r12 = r1.f285049e
                a14.u0 r12 = (a14.C53953u0) r12
                java.lang.Object r13 = r1.f285048d
                hd0.n0 r13 = (hd0.C98408n0) r13
                java.lang.Object r14 = r1.f285055n
                a14.n0 r14 = (a14.C0000n0) r14
                kotlin.ResultKt.throwOnFailure(r24)
                r15 = r5
                r5 = r4
                r4 = r12
                r12 = r2
                r2 = r24
                goto L_0x0147
            L_0x0089:
                java.lang.Object r2 = r1.f285055n
                a14.n0 r2 = (a14.C0000n0) r2
                kotlin.ResultKt.throwOnFailure(r24)
                r4 = r24
                goto L_0x00ae
            L_0x0093:
                kotlin.ResultKt.throwOnFailure(r24)
                java.lang.Object r2 = r1.f285055n
                a14.n0 r2 = (a14.C0000n0) r2
                a14.h0 r4 = a14.C53872d1.f151119c
                com.tencent.mm.ui.chatting.gallery.u0$c$c r5 = new com.tencent.mm.ui.chatting.gallery.u0$c$c
                com.tencent.mm.storage.f4 r12 = r1.f285057p
                r5.<init>(r12, r11)
                r1.f285055n = r2
                r1.f285054j = r7
                java.lang.Object r4 = a14.C53895h.m60469g(r4, r5, r1)
                if (r4 != r0) goto L_0x00ae
                return r0
            L_0x00ae:
                r14 = r2
                r13 = r4
                hd0.n0 r13 = (hd0.C98408n0) r13
                if (r13 != 0) goto L_0x00b7
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x00b7:
                com.tencent.mm.ui.chatting.gallery.u0 r2 = r1.f285056o
                java.lang.String r4 = r13.mo137700d()
                r2.f285034r = r4
                com.tencent.mm.storage.f4 r2 = r1.f285057p
                boolean r2 = r2.mo100983V3()
                if (r2 != 0) goto L_0x00df
                com.tencent.mm.storage.f4 r2 = r1.f285057p
                boolean r2 = r2.mo100972K3()
                if (r2 == 0) goto L_0x00df
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.h r0 = r0.f284638d
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r8, (int) r6)
                r0.show()
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x00df:
                com.tencent.mm.ui.chatting.gallery.u0 r2 = r1.f285056o
                java.lang.String r4 = r13.mo137700d()
                java.lang.String r5 = "info.fileName"
                gy3.C87412m.m108593f(r4, r5)
                boolean r5 = r2.f285040x
                if (r5 != 0) goto L_0x0102
                java.util.HashMap<java.lang.String, com.tencent.mm.ui.chatting.gallery.u0$a> r5 = r2.f285035s
                java.lang.Object r4 = r5.get(r4)
                com.tencent.mm.ui.chatting.gallery.u0$a r4 = (com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.C97137a) r4
                boolean r2 = r2.mo136045G(r4)
                if (r2 != 0) goto L_0x0102
                java.lang.String r2 = "show tool bar error."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
            L_0x0102:
                a14.h0 r17 = a14.C53872d1.f151117a
                r18 = 0
                com.tencent.mm.ui.chatting.gallery.u0$c$b r2 = new com.tencent.mm.ui.chatting.gallery.u0$c$b
                r2.<init>(r13, r11)
                r20 = 2
                r21 = 0
                r16 = r14
                r19 = r2
                a14.u0 r12 = a14.C53895h.m60464b(r16, r17, r18, r19, r20, r21)
                a14.h0 r17 = a14.C53872d1.f151119c
                com.tencent.mm.ui.chatting.gallery.u0$c$d r2 = new com.tencent.mm.ui.chatting.gallery.u0$c$d
                r2.<init>(r13, r11)
                r19 = r2
                a14.u0 r2 = a14.C53895h.m60464b(r16, r17, r18, r19, r20, r21)
                com.tencent.mm.ui.chatting.gallery.m1 r4 = r1.f285058q
                int r5 = r13.f288566m
                int r15 = r13.f288559f
                r1.f285055n = r14
                r1.f285048d = r13
                r1.f285049e = r12
                r1.f285050f = r4
                r1.f285051g = r5
                r1.f285052h = r15
                r1.f285054j = r10
                a14.v0 r2 = (a14.C53957v0) r2
                java.lang.Object r2 = r2.mo74549z(r1)
                if (r2 != r0) goto L_0x0141
                return r0
            L_0x0141:
                r22 = r15
                r15 = r4
                r4 = r12
                r12 = r22
            L_0x0147:
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.String r8 = r13.mo137707k()
                r1.f285055n = r14
                r1.f285048d = r13
                r1.f285049e = r15
                r1.f285050f = r8
                r1.f285051g = r5
                r1.f285052h = r12
                r1.f285053i = r2
                r1.f285054j = r9
                java.lang.Object r4 = r4.mo74634A(r1)
                if (r4 != r0) goto L_0x0168
                return r0
            L_0x0168:
                r22 = r5
                r5 = r2
                r2 = r13
                r13 = r22
            L_0x016e:
                java.lang.String r4 = (java.lang.String) r4
                long r6 = r2.f288563j
                r15.f284828K = r13
                r15.f284829L = r12
                r15.f284830M = r5
                r15.f284831N = r8
                r15.f284833P = r4
                r15.f284832O = r6
                com.tencent.mm.ui.chatting.gallery.u0 r4 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.h r4 = r4.f284638d
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r4 = r4.f284714g
                boolean r5 = r4.f284370K2
                if (r5 == 0) goto L_0x018b
                r4.mo135763c9()
            L_0x018b:
                com.tencent.mm.ui.chatting.gallery.u0 r4 = r1.f285056o
                boolean r5 = com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.f285023E
                r4.getClass()
                com.tencent.mm.ui.chatting.gallery.h r5 = r4.f284638d     // Catch:{ Exception -> 0x01a0 }
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r5 = r5.f284714g     // Catch:{ Exception -> 0x01a0 }
                r5.mo135781o8()     // Catch:{ Exception -> 0x01a0 }
                com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r5 = r5.f284400U0     // Catch:{ Exception -> 0x01a0 }
                xn2.c r4 = r4.f285041y     // Catch:{ Exception -> 0x01a0 }
                r5.setIplaySeekCallback(r4)     // Catch:{ Exception -> 0x01a0 }
            L_0x01a0:
                m03.d r4 = r1.f285059r
                boolean r4 = r4.mo24843h()
                if (r4 == 0) goto L_0x01ed
                m03.d r0 = r1.f285059r
                r0.start()
                java.lang.String r0 = "resume playing"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.m1 r4 = r1.f285058q
                com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.m125066F(r0, r4)
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o
                f03.h r0 = r0.f285037u
                if (r0 == 0) goto L_0x01d1
                m03.d r4 = r1.f285059r
                boolean r4 = r4.mo24838g()
                if (r4 == 0) goto L_0x01d1
                boolean r4 = r0.mo134534g()
                if (r4 != 0) goto L_0x01d1
                r0.start()
            L_0x01d1:
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o
                mk3.f r4 = new mk3.f
                com.tencent.mm.storage.f4 r5 = r1.f285057p
                java.lang.String r6 = r0.f285034r
                r7 = 0
                r4.<init>(r5, r6, r7, r10)
                r0.f284697e = r4
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o
                mk3.f r0 = r0.f284697e
                if (r0 == 0) goto L_0x0490
                long r4 = java.lang.System.currentTimeMillis()
                r0.f292759e = r4
                goto L_0x0490
            L_0x01ed:
                com.tencent.mm.ui.chatting.gallery.u0 r4 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.h r4 = r4.f284638d
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r4 = r4.f284714g
                com.tencent.mm.storage.f4 r5 = r1.f285057p
                long r5 = r5.getMsgId()
                int r4 = r4.mo135773i8(r5)
                m03.d r5 = r1.f285059r
                if (r4 != r9) goto L_0x0203
                r4 = 1
                goto L_0x0204
            L_0x0203:
                r4 = 0
            L_0x0204:
                r5.setMute(r4)
                m03.d r4 = r1.f285059r
                com.tencent.mm.ui.chatting.gallery.u0$c$a r5 = new com.tencent.mm.ui.chatting.gallery.u0$c$a
                com.tencent.mm.ui.chatting.gallery.u0 r6 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.m1 r7 = r1.f285058q
                r5.<init>(r6, r7)
                r4.setOnInfoCallback(r5)
                com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct r4 = new com.tencent.mm.autogen.mmdata.rpt.TPVideoPlayReportStruct
                r4.<init>()
                com.tencent.mm.storage.f4 r5 = r1.f285057p
                long r5 = r5.mo108774y2()
                r4.f266339i = r5
                l03.b r5 = new l03.b
                com.tencent.mm.ui.chatting.gallery.u0 r6 = r1.f285056o
                long r6 = r6.f285032p
                r5.<init>(r6)
                com.tencent.mm.ui.chatting.gallery.e r6 = new com.tencent.mm.ui.chatting.gallery.e
                com.tencent.mm.storage.f4 r7 = r1.f285057p
                com.tencent.mm.ui.chatting.gallery.u0$c$e r8 = new com.tencent.mm.ui.chatting.gallery.u0$c$e
                r8.<init>(r4, r2)
                r6.<init>(r7, r2, r5, r8)
                l03.s r7 = new l03.s
                com.tencent.mm.ui.chatting.gallery.u0 r8 = r1.f285056o
                long r8 = r8.f285032p
                r12 = 1
                r7.<init>(r4, r8, r12)
                com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader r4 = new com.tencent.mm.plugin.thumbplayer.downloader.CdnVideoResourceDownloader
                r4.<init>(r6)
                r4.mo134540m(r7)
                com.tencent.mm.ui.chatting.gallery.b r6 = new com.tencent.mm.ui.chatting.gallery.b
                com.tencent.mm.storage.f4 r8 = r1.f285057p
                java.lang.String r9 = r2.mo137700d()
                r12 = 0
                r6.<init>(r8, r9, r12)
                r4.mo134540m(r6)
                r4.mo134540m(r5)
                com.tencent.mm.ui.chatting.gallery.u0 r6 = r1.f285056o
                r6.f285037u = r4
                m03.d r6 = r1.f285059r
                r6.mo24847j()
                m03.d r6 = r1.f285059r
                r6.mo24836c(r7)
                m03.d r6 = r1.f285059r
                r6.mo24836c(r5)
                boolean r5 = r4.mo134534g()
                if (r5 != 0) goto L_0x045e
                com.tencent.mm.ui.chatting.gallery.u0 r5 = r1.f285056o
                com.tencent.mm.storage.f4 r6 = r1.f285057p
                r5.getClass()
                int r5 = r6.mo108769t2()
                r7 = 1
                if (r5 != r7) goto L_0x02a6
                int r5 = r2.f288562i
                r7 = 121(0x79, float:1.7E-43)
                if (r5 == r7) goto L_0x0291
                r7 = 122(0x7a, float:1.71E-43)
                if (r5 == r7) goto L_0x0291
                switch(r5) {
                    case 111: goto L_0x0291;
                    case 112: goto L_0x0291;
                    case 113: goto L_0x0291;
                    default: goto L_0x028f;
                }
            L_0x028f:
                r5 = 1
                goto L_0x02a7
            L_0x0291:
                java.lang.Object[] r7 = new java.lang.Object[r10]
                java.lang.String r6 = r6.mo108768t()
                r8 = 0
                r7[r8] = r6
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r6 = 1
                r7[r6] = r5
                java.lang.String r5 = "download video. msg talker[%s], info status[%d]"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r5, r7)
            L_0x02a6:
                r5 = 0
            L_0x02a7:
                if (r5 == 0) goto L_0x02ab
                goto L_0x045e
            L_0x02ab:
                boolean r5 = r4.start()
                if (r5 == 0) goto L_0x0386
                java.lang.String r5 = "start online play video."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                m03.d r5 = r1.f285059r
                r5.setResourceDownloader(r4)
                com.tencent.mm.ui.chatting.gallery.u0 r5 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.m1 r6 = r1.f285058q
                com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.m125064D(r5, r6)
                r1.f285055n = r2     // Catch:{ a -> 0x0043 }
                r1.f285048d = r11     // Catch:{ a -> 0x0043 }
                r1.f285049e = r11     // Catch:{ a -> 0x0043 }
                r1.f285050f = r11     // Catch:{ a -> 0x0043 }
                r5 = 4
                r1.f285054j = r5     // Catch:{ a -> 0x0043 }
                java.lang.Object r4 = r4.mo134539k(r1)     // Catch:{ a -> 0x0043 }
                if (r4 != r0) goto L_0x02d5
                return r0
            L_0x02d5:
                r0 = r2
            L_0x02d6:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "moov is Ready: waitingForDownload="
                r2.append(r4)
                com.tencent.mm.ui.chatting.gallery.u0 r4 = r1.f285056o
                boolean r4 = r4.f285036t
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
                com.tencent.mm.ui.chatting.gallery.u0 r2 = r1.f285056o
                boolean r2 = r2.f285036t
                if (r2 != 0) goto L_0x02fa
                m03.d r2 = r1.f285059r
                r2.prepare()
            L_0x02fa:
                com.tencent.mm.ui.chatting.gallery.u0 r2 = r1.f285056o
                mk3.f r2 = r2.f284697e
                if (r2 == 0) goto L_0x0306
                long r4 = java.lang.System.currentTimeMillis()
                r2.f292759e = r4
            L_0x0306:
                r2 = r0
                goto L_0x0490
            L_0x0309:
                java.lang.String r2 = "Unable to wait moov ready"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r2)
                com.tencent.mm.ui.chatting.gallery.u0 r2 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.m1 r4 = r1.f285058q
                boolean r5 = com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.f285023E
                r2.getClass()
                boolean r5 = r0 instanceof f03.C97787h.C97790c
                if (r5 == 0) goto L_0x033c
                java.lang.String r0 = "download online video time out, quit imageGalleryUI."
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
                com.tencent.mm.ui.chatting.gallery.h r0 = r2.f284638d
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
                r3 = 0
                r4 = 2131838363(0x7f11459b, float:1.9309947E38)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r4, (int) r3)
                r0.show()
                zt3.t r0 = zt3.C119157j.f356862d
                com.tencent.mm.ui.chatting.gallery.e1 r3 = new com.tencent.mm.ui.chatting.gallery.e1
                r3.<init>(r2)
                zt3.j r0 = (zt3.C119157j) r0
                r0.mo183895z(r3)
                goto L_0x0383
            L_0x033c:
                java.lang.String r3 = r2.f285034r
                hd0.C98429r0.m127816g(r3)
                com.tencent.mm.ui.chatting.gallery.h r3 = r2.f284638d
                if (r3 != 0) goto L_0x0346
                goto L_0x0383
            L_0x0346:
                r2.mo135851y(r4)
                boolean r0 = r0 instanceof f03.C97787h.C97789b
                if (r0 == 0) goto L_0x0363
                com.tencent.mm.ui.chatting.gallery.h r0 = r2.f284638d
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
                r3 = 2131838365(0x7f11459d, float:1.9309951E38)
                java.lang.String r0 = r0.getString(r3)
                java.lang.String r3 = "adapter.ui.getString(R.string.video_file_expired)"
                gy3.C87412m.m108593f(r0, r3)
                com.tencent.mm.ui.chatting.gallery.f1 r3 = new com.tencent.mm.ui.chatting.gallery.f1
                r3.<init>(r2)
                goto L_0x0375
            L_0x0363:
                com.tencent.mm.ui.chatting.gallery.h r0 = r2.f284638d
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
                r3 = 2131838366(0x7f11459e, float:1.9309953E38)
                java.lang.String r0 = r0.getString(r3)
                java.lang.String r3 = "adapter.ui.getString(com…ng.video_file_play_faile)"
                gy3.C87412m.m108593f(r0, r3)
                com.tencent.mm.ui.chatting.gallery.g1 r3 = com.tencent.p014mm.p136ui.chatting.gallery.C85817g1.f249939d
            L_0x0375:
                com.tencent.mm.ui.chatting.gallery.h r2 = r2.f284638d
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r2 = r2.f284714g
                r4 = 2131823616(0x7f110c00, float:1.9280037E38)
                java.lang.String r4 = r2.getString(r4)
                nj3.C76879j.m92749t(r2, r0, r4, r3)
            L_0x0383:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0386:
                java.lang.String r5 = "start offline play video."
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                com.tencent.mm.ui.chatting.gallery.u0 r5 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.m1 r6 = r1.f285058q
                int r7 = hd0.C98429r0.m127817h(r2)
                com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.m125065E(r5, r6, r7)
                com.tencent.mm.ui.chatting.gallery.u0 r5 = r1.f285056o     // Catch:{ IllegalStateException -> 0x002f }
                r6 = 1
                r5.f285036t = r6     // Catch:{ IllegalStateException -> 0x002f }
                com.tencent.mm.storage.f4 r6 = r1.f285057p     // Catch:{ IllegalStateException -> 0x002f }
                r1.f285055n = r14     // Catch:{ IllegalStateException -> 0x002f }
                r1.f285048d = r2     // Catch:{ IllegalStateException -> 0x002f }
                r1.f285049e = r4     // Catch:{ IllegalStateException -> 0x002f }
                r1.f285050f = r11     // Catch:{ IllegalStateException -> 0x002f }
                r7 = 5
                r1.f285054j = r7     // Catch:{ IllegalStateException -> 0x002f }
                java.lang.Object r5 = com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.m125063C(r5, r6, r1)     // Catch:{ IllegalStateException -> 0x002f }
                if (r5 != r0) goto L_0x03b0
                return r0
            L_0x03b0:
                r0 = r4
                r4 = r14
            L_0x03b2:
                com.tencent.mm.ui.chatting.gallery.u0 r5 = r1.f285056o
                r6 = 0
                r5.f285036t = r6
                boolean r5 = a14.C53930o0.m60560g(r4)
                if (r5 == 0) goto L_0x03c3
                com.tencent.mm.ui.chatting.gallery.u0 r5 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.h r5 = r5.f284638d
                if (r5 != 0) goto L_0x03ec
            L_0x03c3:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Seems the job is canceled(it shouldn't happen at all), isActive="
                r5.append(r6)
                boolean r4 = a14.C53930o0.m60560g(r4)
                r5.append(r4)
                java.lang.String r4 = ", adapter is null="
                r5.append(r4)
                com.tencent.mm.ui.chatting.gallery.u0 r4 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.h r4 = r4.f284638d
                if (r4 != 0) goto L_0x03e1
                r7 = 1
                goto L_0x03e2
            L_0x03e1:
                r7 = 0
            L_0x03e2:
                r5.append(r7)
                java.lang.String r4 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r4)
            L_0x03ec:
                java.lang.String r0 = r0.mo134538j()
                if (r0 == 0) goto L_0x0419
                boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
                if (r4 != 0) goto L_0x03f9
                goto L_0x0419
            L_0x03f9:
                m03.d r4 = r1.f285059r
                r4.setVideoPath(r0)
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o
                mk3.f r4 = new mk3.f
                com.tencent.mm.storage.f4 r5 = r1.f285057p
                java.lang.String r6 = r0.f285034r
                r7 = 0
                r4.<init>(r5, r6, r7, r10)
                r0.f284697e = r4
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o
                mk3.f r0 = r0.f284697e
                if (r0 == 0) goto L_0x0490
                long r4 = java.lang.System.currentTimeMillis()
                r0.f292759e = r4
                goto L_0x0490
            L_0x0419:
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.h r0 = r0.f284638d
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
                r2 = 0
                r3 = 2131838363(0x7f11459b, float:1.9309947E38)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r3, (int) r2)
                r0.show()
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x042d:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0457 }
                r2.<init>()     // Catch:{ all -> 0x0457 }
                java.lang.String r4 = "awaiting video to be downloaded doesn't success: "
                r2.append(r4)     // Catch:{ all -> 0x0457 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0457 }
                r2.append(r0)     // Catch:{ all -> 0x0457 }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0457 }
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)     // Catch:{ all -> 0x0457 }
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o     // Catch:{ all -> 0x0457 }
                com.tencent.mm.ui.chatting.gallery.m1 r2 = r1.f285058q     // Catch:{ all -> 0x0457 }
                boolean r3 = com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.f285023E     // Catch:{ all -> 0x0457 }
                r3 = 1
                r0.mo136046I(r2, r3)     // Catch:{ all -> 0x0457 }
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0457 }
                com.tencent.mm.ui.chatting.gallery.u0 r2 = r1.f285056o
                r3 = 0
                r2.f285036t = r3
                return r0
            L_0x0457:
                r0 = move-exception
                com.tencent.mm.ui.chatting.gallery.u0 r2 = r1.f285056o
                r3 = 0
                r2.f285036t = r3
                throw r0
            L_0x045e:
                java.lang.String r0 = r4.mo134538j()
                if (r0 == 0) goto L_0x04b4
                boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
                if (r4 != 0) goto L_0x046b
                goto L_0x04b4
            L_0x046b:
                java.lang.String r4 = "start play local video file"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                m03.d r4 = r1.f285059r
                r4.setVideoPath(r0)
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o
                mk3.f r4 = new mk3.f
                com.tencent.mm.storage.f4 r5 = r1.f285057p
                java.lang.String r6 = r0.f285034r
                r7 = 0
                r4.<init>(r5, r6, r7, r10)
                r0.f284697e = r4
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o
                mk3.f r0 = r0.f284697e
                if (r0 == 0) goto L_0x0490
                long r4 = java.lang.System.currentTimeMillis()
                r0.f292759e = r4
            L_0x0490:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r4 = "play video: video status="
                r0.append(r4)
                int r2 = r2.f288562i
                r0.append(r2)
                java.lang.String r2 = ", position="
                r0.append(r2)
                int r2 = r1.f285060s
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x04b4:
                com.tencent.mm.ui.chatting.gallery.u0 r0 = r1.f285056o
                com.tencent.mm.ui.chatting.gallery.h r0 = r0.f284638d
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r0 = r0.f284714g
                r2 = 0
                r3 = 2131838363(0x7f11459b, float:1.9309947E38)
                android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (int) r3, (int) r2)
                r0.show()
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.C97139c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$d */
    public static final class C97145d implements C102693c {

        /* renamed from: d */
        public final /* synthetic */ C97056h f285068d;

        /* renamed from: e */
        public final /* synthetic */ C97136u0 f285069e;

        /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$d$a */
        public static final class C97146a implements C96875r0.C96877c {

            /* renamed from: d */
            public final /* synthetic */ C97136u0 f285070d;

            /* renamed from: e */
            public final /* synthetic */ C97087m1 f285071e;

            public C97146a(C97136u0 u0Var, C97087m1 m1Var) {
                this.f285070d = u0Var;
                this.f285071e = m1Var;
            }

            /* renamed from: z */
            public final void mo86881z(boolean z) {
                Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "seek completed");
                C97136u0 u0Var = this.f285070d;
                C97087m1 m1Var = this.f285071e;
                C87412m.m108593f(m1Var, "holder");
                C97136u0.m125066F(u0Var, m1Var);
            }
        }

        public C97145d(C97056h hVar, C97136u0 u0Var) {
            this.f285068d = hVar;
            this.f285069e = u0Var;
        }

        /* renamed from: a */
        public void mo4335a(int i) {
            C97087m1 v = this.f285068d.mo135934v();
            C96875r0 r0Var = v.f284849p;
            C87412m.m108592e(r0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            C99783d dVar = (C99783d) r0Var;
            Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onSeekTo(" + i + ')');
            v.mo135970f();
            v.f284848o.setVisibility(8);
            if (dVar.mo24843h()) {
                dVar.setOnSeekCompleteCallback(new C97146a(this.f285069e, v));
                dVar.mo24787a(((double) i) * ((double) 1000), true);
            } else {
                C72963f4 w = this.f285068d.mo135935w();
                if (w != null && w.mo100994f4()) {
                    C98429r0.m127832w(w.mo108765s2(), i * 1000, dVar.mo24838g());
                }
                C97056h hVar = this.f285068d;
                hVar.mo135921P(hVar.f284714g.mo135768f8());
            }
            this.f285068d.f284714g.mo135763c9();
            C72963f4 w2 = this.f285068d.mo135935w();
            if (w2 != null && w2.mo100983V3()) {
                this.f285068d.f284714g.f284478w.mo136024c(w2, 13);
            }
        }

        /* renamed from: c */
        public void mo4336c(int i) {
        }

        public void onSeekPre() {
            C97087m1 v = this.f285068d.mo135934v();
            if (v != null) {
                v.mo135970f();
                v.f284849p.pause();
                this.f285069e.mo136046I(v, false);
            }
            Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onSeekPre");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.gallery.ImageGalleryVideoTPHandler$toggleVideoMenu$1", mo125469f = "ImageGalleryVideoTPHandler.kt", mo125470l = {264}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$e */
    public static final class C97147e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f285072d;

        /* renamed from: e */
        public final /* synthetic */ C99783d f285073e;

        /* renamed from: f */
        public final /* synthetic */ C97136u0 f285074f;

        /* renamed from: g */
        public final /* synthetic */ C97087m1 f285075g;

        /* renamed from: h */
        public final /* synthetic */ C72963f4 f285076h;

        /* renamed from: i */
        public final /* synthetic */ int f285077i;

        /* renamed from: j */
        public final /* synthetic */ C98408n0 f285078j;

        /* renamed from: com.tencent.mm.ui.chatting.gallery.u0$e$a */
        public static final class C97148a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C97136u0 f285079d;

            /* renamed from: e */
            public final /* synthetic */ int f285080e;

            public C97148a(C97136u0 u0Var, int i) {
                this.f285079d = u0Var;
                this.f285080e = i;
            }

            public final void run() {
                ((C101491u) C86312j.m106911c(C101491u.class)).Tk0(this.f285079d.f285034r, this.f285080e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C97147e(C99783d dVar, C97136u0 u0Var, C97087m1 m1Var, C72963f4 f4Var, int i, C98408n0 n0Var, C15601d<? super C97147e> dVar2) {
            super(2, dVar2);
            this.f285073e = dVar;
            this.f285074f = u0Var;
            this.f285075g = m1Var;
            this.f285076h = f4Var;
            this.f285077i = i;
            this.f285078j = n0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C97147e(this.f285073e, this.f285074f, this.f285075g, this.f285076h, this.f285077i, this.f285078j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C97147e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C97787h hVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f285072d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f285073e.mo24838g() && (hVar = this.f285074f.f285037u) != null) {
                    hVar.mo134532e();
                }
                C97136u0.m125065E(this.f285074f, this.f285075g, C98429r0.m127817h(C97052g.m124927o(this.f285076h)));
                ((C119157j) C119157j.f356862d).mo183875f(new C97148a(this.f285074f, this.f285077i == 2 ? 8 : 5));
                int i2 = this.f285077i;
                if (i2 == 2) {
                    this.f285074f.getClass();
                    C115669n.INSTANCE.idkeyStat(354, 14, 1, false);
                } else if (i2 == 1) {
                    this.f285074f.getClass();
                    C115669n.INSTANCE.idkeyStat(354, 11, 1, false);
                }
                C97136u0 u0Var = this.f285074f;
                u0Var.f285036t = true;
                C72963f4 f4Var = this.f285076h;
                this.f285072d = 1;
                if (C97136u0.m125063C(u0Var, f4Var, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (IllegalStateException e) {
                    Log.m105928w("MicroMsg.Imagegallery.handler.video.tp", "Failed to wait video to be downloaded: " + e.getMessage());
                    C13598b0 b0Var = C13598b0.f38549a;
                    C97136u0 u0Var2 = this.f285074f;
                    u0Var2.f285036t = false;
                    u0Var2.mo136046I(this.f285075g, true);
                    return b0Var;
                } catch (Throwable th) {
                    C97136u0 u0Var3 = this.f285074f;
                    u0Var3.f285036t = false;
                    u0Var3.mo136046I(this.f285075g, true);
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C97136u0 u0Var4 = this.f285074f;
            u0Var4.f285036t = false;
            u0Var4.mo136046I(this.f285075g, true);
            int i3 = this.f285077i;
            if (i3 == 1) {
                Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "do restransmit video");
                this.f285074f.getClass();
                C115669n.INSTANCE.idkeyStat(354, 15, 1, false);
                this.f285074f.f284638d.mo135929p(this.f285076h);
                this.f285074f.f284638d.f284714g.mo135733N8(-1);
                if (this.f285073e.mo24838g()) {
                    C98429r0.m127832w(this.f285078j.mo137700d(), this.f285073e.getCurrentPosition(), true);
                }
            } else if (i3 == 2) {
                this.f285074f.getClass();
                C115669n.INSTANCE.idkeyStat(354, 16, 1, false);
                ImageGalleryUI imageGalleryUI = this.f285074f.f284638d.f284714g;
                C72963f4 f4Var2 = this.f285076h;
                if (!(imageGalleryUI == null || f4Var2 == null)) {
                    ((C98250h) C86312j.m106911c(C98250h.class)).Rj0(imageGalleryUI, new C97071i(imageGalleryUI, f4Var2, true), new C97074j(true, imageGalleryUI));
                }
                this.f285074f.f284638d.f284714g.mo135733N8(-1);
                if (this.f285073e.mo24838g()) {
                    C98429r0.m127832w(this.f285078j.mo137700d(), this.f285073e.getCurrentPosition(), true);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97136u0(C97056h hVar) {
        super(hVar);
        C87412m.m108594g(hVar, "adapter");
        this.f285041y = new C97145d(hVar, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m125063C(com.tencent.p014mm.p136ui.chatting.gallery.C97136u0 r7, com.tencent.p014mm.storage.C72963f4 r8, wx3.C15601d r9) {
        /*
            r7.getClass()
            java.lang.Class<rz.u> r0 = p682rz.C101491u.class
            boolean r1 = r9 instanceof com.tencent.p014mm.p136ui.chatting.gallery.C97152w0
            if (r1 == 0) goto L_0x0018
            r1 = r9
            com.tencent.mm.ui.chatting.gallery.w0 r1 = (com.tencent.p014mm.p136ui.chatting.gallery.C97152w0) r1
            int r2 = r1.f285094h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0018
            int r2 = r2 - r3
            r1.f285094h = r2
            goto L_0x001d
        L_0x0018:
            com.tencent.mm.ui.chatting.gallery.w0 r1 = new com.tencent.mm.ui.chatting.gallery.w0
            r1.<init>(r7, r9)
        L_0x001d:
            java.lang.Object r9 = r1.f285092f
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r1.f285094h
            java.lang.String r4 = "MicroMsg.Imagegallery.handler.video.tp"
            r5 = 1
            if (r3 == 0) goto L_0x0037
            if (r3 != r5) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x00eb
        L_0x002f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r9)
            di3.d r9 = di3.C86312j.m106911c(r0)
            rz.u r9 = (p682rz.C101491u) r9
            java.lang.String r3 = r8.mo108765s2()
            hd0.n0 r9 = r9.mo140806Zd(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "await video to be fully downloaded, status="
            r3.append(r6)
            int r6 = r9.f288562i
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r3)
            boolean r9 = r9.mo137711o()
            if (r9 == 0) goto L_0x0072
            di3.d r9 = di3.C86312j.m106911c(r0)
            rz.u r9 = (p682rz.C101491u) r9
            java.lang.String r0 = r8.mo108765s2()
            r9.mo140797FT(r0)
            goto L_0x0091
        L_0x0072:
            java.lang.String r9 = "start offline mode receive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            zt3.t r9 = zt3.C119157j.f356862d
            com.tencent.mm.ui.chatting.gallery.x0 r3 = new com.tencent.mm.ui.chatting.gallery.x0
            r3.<init>(r8)
            zt3.j r9 = (zt3.C119157j) r9
            r9.mo183875f(r3)
            di3.d r9 = di3.C86312j.m106911c(r0)
            rz.u r9 = (p682rz.C101491u) r9
            java.lang.String r0 = r8.mo108765s2()
            r9.M00(r0)
        L_0x0091:
            boolean r9 = r8.mo100972K3()
            if (r9 != 0) goto L_0x00b0
            hd0.n0 r9 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r8)
            r0 = 0
            if (r9 == 0) goto L_0x00a5
            boolean r9 = r9.mo137710n()
            if (r9 != r5) goto L_0x00a5
            r0 = 1
        L_0x00a5:
            if (r0 == 0) goto L_0x00b0
            java.lang.String r7 = "msg is not clean and video has been downloaded"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r7)
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0108
        L_0x00b0:
            r1.f285090d = r7
            r1.f285091e = r8
            r1.f285094h = r5
            a14.m r9 = new a14.m
            wx3.d r0 = xx3.C66447b.m78392b(r1)
            r9.<init>(r0, r5)
            r9.mo74609p()
            com.tencent.mm.ui.chatting.gallery.z0 r0 = new com.tencent.mm.ui.chatting.gallery.z0
            r0.<init>(r9, r8, r7)
            java.lang.Class<rz.s> r7 = p682rz.C101488s.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            rz.s r7 = (p682rz.C101488s) r7
            rz.t r7 = r7.Kj0()
            android.os.Looper r8 = android.os.Looper.getMainLooper()
            hd0.o0 r7 = (hd0.C98410o0) r7
            r7.mo137716b(r0, r8)
            com.tencent.mm.ui.chatting.gallery.y0 r7 = new com.tencent.mm.ui.chatting.gallery.y0
            r7.<init>(r0)
            r9.mo74599v(r7)
            java.lang.Object r9 = r9.mo74608o()
            if (r9 != r2) goto L_0x00eb
            goto L_0x0108
        L_0x00eb:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "video has been fully downloaded: ret="
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0108:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.m125063C(com.tencent.mm.ui.chatting.gallery.u0, com.tencent.mm.storage.f4, wx3.d):java.lang.Object");
    }

    /* renamed from: D */
    public static final void m125064D(C97136u0 u0Var, C97087m1 m1Var) {
        if (u0Var.f284638d != null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onVideoBuffering");
            m1Var.mo135970f();
            m1Var.f284848o.setVisibility(8);
            m1Var.mo135970f();
            m1Var.f284850q.setVisibility(8);
            m1Var.mo135970f();
            m1Var.f284858y.setVisibility(0);
            u0Var.f284638d.f284714g.mo135767e9();
            C53973z1 z1Var = u0Var.f285031o;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            u0Var.f285031o = null;
        }
    }

    /* renamed from: E */
    public static final void m125065E(C97136u0 u0Var, C97087m1 m1Var, int i) {
        if (u0Var.f284638d != null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onVideoDownloading: " + i);
            m1Var.mo135970f();
            m1Var.f284848o.setVisibility(8);
            m1Var.mo135970f();
            m1Var.f284850q.setVisibility(0);
            m1Var.mo135970f();
            m1Var.f284850q.setProgress(i);
            m1Var.mo135970f();
            m1Var.f284858y.setVisibility(8);
        }
    }

    /* renamed from: F */
    public static final void m125066F(C97136u0 u0Var, C97087m1 m1Var) {
        ImageGalleryUI imageGalleryUI;
        Class cls = C34767b.class;
        if (u0Var.f284638d != null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onVideoPlaying");
            m1Var.mo135973i(true, 1.0f);
            m1Var.mo135970f();
            m1Var.f284858y.setVisibility(8);
            boolean z = false;
            u0Var.f284638d.f284714g.mo135741R8(false);
            ImageGalleryUI imageGalleryUI2 = u0Var.f284638d.f284714g;
            if (imageGalleryUI2.f284370K2) {
                imageGalleryUI2.mo135763c9();
            }
            m1Var.mo135970f();
            C96875r0 r0Var = m1Var.f284849p;
            C87412m.m108592e(r0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            C99783d dVar = (C99783d) r0Var;
            C34767b.C34768c cVar = u0Var.f285029j;
            if (cVar != null) {
                ((C34767b) C86312j.m106911c(cls)).b20(cVar);
            }
            if (!dVar.isMuted()) {
                C34767b.C34768c el = ((C34767b) C86312j.m106911c(cls)).mo34192el(C34767b.C34769b.C34777c.f93460c, new C97070h1(dVar));
                u0Var.f285029j = el;
                if (el != null && el.mo34198a()) {
                    z = true;
                }
                dVar.setMute(!z);
            } else {
                Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onVideoPlaying: mute play, no need to request focus");
            }
            ImageGalleryUI imageGalleryUI3 = u0Var.f284638d.f284714g;
            imageGalleryUI3.mo135781o8();
            RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = imageGalleryUI3.f284400U0;
            redesignVideoPlayerSeekBar.setVideoTotalTime(dVar.getDuration() / 1000);
            redesignVideoPlayerSeekBar.seek(dVar.getCurrentPosition() / 1000);
            C53973z1 z1Var = u0Var.f285030n;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            u0Var.f285030n = C53895h.m60466d(u0Var.f285028i, (C66212f) null, (C53934p0) null, new C97044d1(dVar, redesignVideoPlayerSeekBar, u0Var, (C15601d<? super C97044d1>) null), 3, (Object) null);
            C53973z1 z1Var2 = u0Var.f285031o;
            if (z1Var2 != null) {
                C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
            }
            u0Var.f285031o = C53895h.m60466d(u0Var.f285028i, (C66212f) null, (C53934p0) null, new C97080k1(u0Var, dVar, (C15601d<? super C97080k1>) null), 3, (Object) null);
            if (u0Var.f284638d != null) {
                Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "keep screen on");
                u0Var.f284638d.f284714g.getContext().getWindow().addFlags(128);
            }
            C97056h hVar = u0Var.f284638d;
            if (hVar != null && (imageGalleryUI = hVar.f284714g) != null) {
                C97123s sVar = imageGalleryUI.f284478w;
                C72963f4 w = hVar.mo135935w();
                sVar.getClass();
                if (w != null && w.mo100983V3() && sVar.f119454i != 2) {
                    sVar.mo136024c(w, sVar.mo68720a());
                    sVar.f119454i = 2;
                }
            }
        }
    }

    /* renamed from: H */
    public static final boolean m125067H() {
        return f285023E;
    }

    /* renamed from: A */
    public void mo135824A(C72963f4 f4Var, int i) {
        boolean z;
        Class cls = C101488s.class;
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "toggleVideo: position=" + i);
        if (f4Var != null) {
            if (!C97056h.m124955K(f4Var) && !C97056h.m124954I(f4Var)) {
                return;
            }
            if (this.f285036t) {
                Log.m105928w("MicroMsg.Imagegallery.handler.video.tp", "it's waiting for download, ignore operation");
                return;
            }
            if (!C53930o0.m60560g(this.f285028i)) {
                this.f285028i = C53930o0.m60555b();
            }
            C98408n0 p = C97052g.m124928p(f4Var);
            C98442x0 b = C98442x0.f288734i.mo137781b(p.mo137705i());
            boolean z2 = false;
            if (b == null || !b.f288738b) {
                z = false;
            } else {
                b.f288744h = true;
                this.f284697e = new C99910f(f4Var, p.mo137700d(), false, 1);
                C97087m1 h = mo135877h(i);
                if (h != null) {
                    h.mo135972h(h.f284848o, 8);
                }
                if (C31543z5.m39451a() - f4Var.getCreateTime() > 432000000) {
                    ImageGalleryUI imageGalleryUI = this.f284638d.f284714g;
                    imageGalleryUI.mo135755Y8(imageGalleryUI.getString(C0966R.string.lvb));
                } else {
                    ((C119157j) C119157j.f356862d).mo183895z(new C97034a1(this));
                    this.f285038v = new C97037b1(p, this, f4Var, i);
                    ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137716b(this.f285038v, Looper.getMainLooper());
                }
                z = true;
            }
            if (!z) {
                int i2 = p.f288562i;
                boolean z3 = i2 == 199 || i2 == 123;
                if (f4Var.mo100983V3()) {
                    Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "MP_VIDEO toggle mp video, status: " + p + ".status");
                    String q = ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(f4Var.mo108765s2());
                    if (z3 && !C86013q1.m106450k(q)) {
                        p.f288562i = 111;
                        ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137733w(p);
                        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "MP_VIDEO_WARN user delete local file,reset video info status");
                        z3 = false;
                    }
                }
                if (f4Var.mo100983V3()) {
                    C48300n n = C97052g.m124926n(f4Var);
                    if (n == null) {
                        Log.m105928w("MicroMsg.Imagegallery.handler.video.tp", "MP_VIDEO_ERROR mpShareVideoInfo is null");
                        return;
                    }
                    Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "mpVideo videoDownload " + z3 + ", playKey " + n.mo73008d(f4Var.mo108765s2()));
                    C85820q1 q1Var = C85820q1.f249947a;
                    String d = n.mo73008d(f4Var.mo108765s2());
                    C87412m.m108593f(d, "mpShareVideoInfo.getPlayKey(msg.imgPath)");
                    String a = q1Var.mo119746a(d);
                    String d2 = n.mo73008d(f4Var.mo108765s2());
                    C87412m.m108593f(d2, "mpShareVideoInfo.getPlayKey(msg.imgPath)");
                    C64598o03 b2 = q1Var.mo119747b(d2);
                    if (b2.f184602e == 1) {
                        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "MP_VIDEO block video");
                        mo135911x(mo135877h(i), b2.f184603f);
                        return;
                    }
                    mo135910q(mo135877h(i));
                    if (!(a == null || a.length() == 0) && (p.f288559f <= 0 || !C87412m.m108589b(a, p.f288535C.f299537d))) {
                        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "MP_VIDEO  update video info. playUrl:" + a + ", length:" + b2.f184604g);
                        p.f288535C.f299537d = a;
                        p.f288559f = b2.f184604g;
                        ((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137733w(p);
                    }
                    if (C97052g.m124924l(p, n, f4Var, i, z3, this) && !z3) {
                        C97087m1 h2 = mo135877h(i);
                        if (h2 != null) {
                            h2.mo135970f();
                            h2.mo135970f();
                            h2.f284848o.setVisibility(8);
                            h2.mo135970f();
                            h2.f284858y.setVisibility(0);
                            return;
                        }
                        return;
                    }
                } else {
                    mo135910q(mo135877h(i));
                }
                ImageGalleryUI imageGalleryUI2 = this.f284638d.f284714g;
                imageGalleryUI2.mo135781o8();
                if (imageGalleryUI2.f284400U0.f283824z) {
                    Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "toggle pause video.");
                    mo135849v(i);
                } else if (!C97625j3.m125812b().mo105883I()) {
                    C76912y0.m92771j(this.f284638d.f284714g.getContext(), (View) null);
                } else {
                    Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "play(" + i + ')');
                    C97087m1 h3 = mo135877h(i);
                    if (h3 != null) {
                        h3.mo135970f();
                        C96875r0 r0Var = h3.f284849p;
                        C87412m.m108592e(r0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
                        C99783d dVar = (C99783d) r0Var;
                        if (C11171e.m11046c(24) && ((C32735h) C86312j.m106911c(C32735h.class)).dl0(C32735h.C32737c.clicfg_c2c_video_dolby_play_enable, C104160f.RepairerConfig_Media_PlayDolbyVideo_Int, 1) == 1) {
                            z2 = true;
                        }
                        dVar.setDolbyEnable(z2);
                        if (C11171e.m11044a(23)) {
                            dVar.setAutoFixRotation(true);
                        }
                        C53895h.m60466d(this.f285028i, (C66212f) null, (C53934p0) null, new C97083l1(f4Var, this, i, dVar, h3, (C15601d<? super C97083l1>) null), 3, (Object) null);
                    }
                }
            }
        }
    }

    /* renamed from: B */
    public void mo135825B(C72963f4 f4Var, int i) {
        int i2 = i;
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "toggleVideoMenu: position=" + i2);
        if (f4Var != null) {
            if (!C53930o0.m60560g(this.f285028i)) {
                this.f285028i = C53930o0.m60555b();
            }
            C98408n0 Zd = ((C101491u) C86312j.m106911c(C101491u.class)).mo140806Zd(f4Var.mo108765s2());
            if (Zd != null && !Zd.mo137710n()) {
                C97087m1 h = mo135877h(i2);
                C96875r0 r0Var = h != null ? h.f284849p : null;
                C99783d dVar = r0Var instanceof C99783d ? (C99783d) r0Var : null;
                if (dVar != null) {
                    dVar.pause();
                    mo136046I(h, true);
                    h.mo135970f();
                    h.mo135972h(h.f284848o, 8);
                    this.f284638d.f284714g.mo135741R8(true);
                    int i8 = this.f284638d.f284714g.mo135773i8(f4Var.getMsgId());
                    C0000n0 n0Var = this.f285028i;
                    C53896h0 h0Var = C53872d1.f151117a;
                    C53895h.m60466d(n0Var, C58901s.f168555a.mo74590i0(), (C53934p0) null, new C97147e(dVar, this, h, f4Var, i8, Zd, (C15601d<? super C97147e>) null), 2, (Object) null);
                }
            }
        }
    }

    /* renamed from: G */
    public final boolean mo136045G(C97137a aVar) {
        if (aVar == null) {
            return false;
        }
        int f8 = this.f284638d.f284714g.mo135768f8();
        int i = aVar.f285043a;
        if (f8 == i) {
            C97087m1 h = mo135877h(i);
            if (h != null) {
                h.mo135970f();
                h.f284858y.setVisibility(8);
                h.mo135970f();
                h.f284850q.setVisibility(8);
                h.mo135970f();
                h.f284848o.setVisibility(8);
            }
            this.f285040x = true;
            this.f284638d.f284714g.mo135753X8(false);
            return true;
        }
        this.f284638d.f284720p.mo135878i(i);
        return false;
    }

    /* renamed from: I */
    public final void mo136046I(C97087m1 m1Var, boolean z) {
        ImageGalleryUI imageGalleryUI;
        int i;
        if (this.f284638d != null) {
            Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onVideoStopped(" + m1Var.f284836c + ')');
            this.f284638d.f284714g.mo135767e9();
            if (z) {
                this.f284638d.f284714g.mo135741R8(true);
                m1Var.mo135970f();
                m1Var.f284850q.setVisibility(8);
                m1Var.mo135970f();
                m1Var.f284858y.setVisibility(8);
                m1Var.mo135970f();
                m1Var.mo135972h(m1Var.f284848o, 0);
            }
            C34767b.C34768c cVar = this.f285029j;
            if (cVar != null) {
                ((C34767b) C86312j.m106911c(C34767b.class)).b20(cVar);
            }
            this.f285029j = null;
            if (this.f284638d != null) {
                Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "release screen on");
                this.f284638d.f284714g.getContext().getWindow().clearFlags(128);
            }
            C53973z1 z1Var = this.f285030n;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            this.f285030n = null;
            C53973z1 z1Var2 = this.f285031o;
            if (z1Var2 != null) {
                C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
            }
            this.f285031o = null;
            C97056h hVar = this.f284638d;
            if (!(hVar == null || (imageGalleryUI = hVar.f284714g) == null)) {
                C97123s sVar = imageGalleryUI.f284478w;
                C72963f4 w = hVar.mo135935w();
                sVar.getClass();
                if (!(w == null || !w.mo100983V3() || (i = sVar.f119454i) == 4)) {
                    if (i != 3) {
                        sVar.mo136024c(w, 8);
                    }
                    sVar.f119454i = 3;
                }
            }
            C99910f fVar = this.f284697e;
            if (fVar != null) {
                fVar.f292761g.f266513m = C60641c.m70922c((double) (((float) (System.currentTimeMillis() - fVar.f292759e)) / 1000.0f));
            }
            C99910f fVar2 = this.f284697e;
            if (fVar2 != null) {
                fVar2.mo139264a();
            }
            this.f284697e = null;
        }
    }

    /* renamed from: J */
    public final void mo136047J(C72963f4 f4Var, int i) {
        this.f285039w = false;
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "play(" + i + ')');
        C97087m1 h = mo135877h(i);
        if (h != null) {
            h.mo135970f();
            C96875r0 r0Var = h.f284849p;
            ThumbPlayerViewContainer thumbPlayerViewContainer = r0Var instanceof ThumbPlayerViewContainer ? (ThumbPlayerViewContainer) r0Var : null;
            if (thumbPlayerViewContainer != null) {
                thumbPlayerViewContainer.mo134548f();
            }
            h.mo135970f();
            C96875r0 r0Var2 = h.f284849p;
            C87412m.m108592e(r0Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            C53895h.m60466d(this.f285028i, (C66212f) null, (C53934p0) null, new C97139c(this, f4Var, h, (C99783d) r0Var2, i, (C15601d<? super C97139c>) null), 3, (Object) null);
        }
    }

    /* renamed from: g */
    public boolean mo135842g(C97087m1 m1Var, C72963f4 f4Var, int i) {
        C87412m.m108594g(m1Var, "holder");
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "filling: " + i);
        if (f4Var == null) {
            Log.m105928w("MicroMsg.Imagegallery.handler.video.tp", "null msg: imgPath=null");
            return false;
        }
        if (!this.f285035s.containsKey(f4Var.mo108765s2())) {
            this.f285035s.put(f4Var.mo108765s2(), new C97137a(i, f4Var, (C97787h) null, 4, (C8480h) null));
        }
        if (!C53930o0.m60560g(this.f285028i)) {
            this.f285028i = C53930o0.m60555b();
        }
        m1Var.mo135970f();
        if (m1Var.f284849p instanceof C99783d) {
            m1Var.mo135970f();
            C96875r0 r0Var = m1Var.f284849p;
            C87412m.m108592e(r0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.thumbplayer.view.IThumbPlayerVideoView");
            C99783d dVar = (C99783d) r0Var;
            if (dVar.isPlaying()) {
                dVar.stop();
            }
            dVar.setScaleType((C85875k4.m106208w() || C85875k4.m106157N()) ? C96814a.C96817e.CONTAIN : C96814a.C96817e.DEFAULT);
            m1Var.f284851r.setVisibility(8);
            m1Var.mo135970f();
            m1Var.f284850q.setVisibility(8);
            m1Var.mo135970f();
            m1Var.f284858y.setVisibility(8);
            m1Var.mo135973i(false, 0.0f);
            this.f285032p = Util.nowMilliSecond();
            C0001s1 s1Var = C0001s1.f0d;
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C97041c1(f4Var, m1Var, this, (C15601d<? super C97041c1>) null), 2, (Object) null);
            return true;
        }
        throw new IllegalStateException("Must use ThumbPlayerTextureView".toString());
    }

    /* renamed from: h */
    public C97087m1 mo135877h(int i) {
        C97087m1 h = super.mo135877h(i);
        if (h == null) {
            Log.m105928w("MicroMsg.Imagegallery.handler.video.tp", "getHolder(" + i + ") returns null!");
        }
        return h;
    }

    /* renamed from: j */
    public void mo135843j() {
        C99783d dVar;
        C97787h hVar;
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "pauseVideo");
        C97056h hVar2 = this.f284638d;
        C97087m1 v = hVar2 != null ? hVar2.mo135934v() : null;
        if (v != null && (dVar = (C99783d) v.f284849p) != null) {
            if (!this.f285033q) {
                C98429r0.m127832w(this.f285034r, dVar.getCurrentPosition(), dVar.mo24838g());
            }
            if (dVar.isPlaying()) {
                dVar.pause();
                C53895h.m60466d(this.f285028i, (C66212f) null, (C53934p0) null, new C97073i1(this, v, (C15601d<? super C97073i1>) null), 3, (Object) null);
            }
            if (dVar.mo24838g() && (hVar = this.f285037u) != null) {
                hVar.stop();
            }
        }
    }

    /* renamed from: k */
    public void mo135844k() {
        Log.m105928w("MicroMsg.Imagegallery.handler.video.tp", "detach");
        C101489t.C77595a aVar = this.f285038v;
        if (aVar != null) {
            ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137731u(aVar);
        }
        mo135852z();
        super.mo135844k();
        C53930o0.m60558e(this.f285028i, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: r */
    public void mo135845r() {
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onResume");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.tencent.mm.pluginsdk.ui.tools.r0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo135846s() {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.Imagegallery.handler.video.tp"
            java.lang.String r1 = "onVideoCompletion"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.ui.chatting.gallery.h r0 = r4.f284638d
            r1 = 0
            if (r0 == 0) goto L_0x0012
            com.tencent.mm.ui.chatting.gallery.m1 r0 = r0.mo135934v()
            goto L_0x0013
        L_0x0012:
            r0 = r1
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            com.tencent.mm.pluginsdk.ui.tools.r0 r2 = r0.f284849p
            boolean r3 = r2 instanceof m03.C99783d
            if (r3 == 0) goto L_0x001f
            r1 = r2
            m03.d r1 = (m03.C99783d) r1
        L_0x001f:
            if (r1 != 0) goto L_0x0022
            return
        L_0x0022:
            r2 = 1
            r4.mo136046I(r0, r2)
            com.tencent.mm.ui.chatting.gallery.h r2 = r4.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r2 = r2.f284714g
            r2.mo135781o8()
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r2 = r2.f284400U0
            r3 = 0
            r2.seek(r3)
            r2 = 0
            r0.mo135973i(r3, r2)
            java.lang.String r0 = r4.f285034r
            boolean r2 = r1.mo24838g()
            hd0.C98429r0.m127832w(r0, r3, r2)
            r1.stop()
            f03.h r0 = r4.f285037u
            if (r0 == 0) goto L_0x004a
            r0.stop()
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.mo135846s():void");
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.tencent.mm.pluginsdk.ui.tools.r0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo135847t(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onVideoError("
            r1.append(r2)
            r2 = r17
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            r2 = r18
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.Imagegallery.handler.video.tp"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
            com.tencent.mm.ui.chatting.gallery.h r1 = r0.f284638d
            r3 = 0
            if (r1 == 0) goto L_0x0034
            com.tencent.mm.ui.chatting.gallery.m1 r1 = r1.mo135934v()
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            if (r1 != 0) goto L_0x0038
            return
        L_0x0038:
            com.tencent.mm.pluginsdk.ui.tools.r0 r4 = r1.f284849p
            boolean r5 = r4 instanceof m03.C99783d
            if (r5 == 0) goto L_0x0041
            r3 = r4
            m03.d r3 = (m03.C99783d) r3
        L_0x0041:
            if (r3 != 0) goto L_0x0044
            return
        L_0x0044:
            java.lang.Class<rz.u> r4 = p682rz.C101491u.class
            di3.d r5 = di3.C86312j.m106911c(r4)
            rz.u r5 = (p682rz.C101491u) r5
            java.lang.String r6 = r0.f285034r
            hd0.n0 r5 = r5.mo140806Zd(r6)
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L_0x0077
            boolean r8 = r0.f285039w
            if (r8 == 0) goto L_0x0077
            r0.f285039w = r6
            di3.d r4 = di3.C86312j.m106911c(r4)
            rz.u r4 = (p682rz.C101491u) r4
            java.lang.String r5 = r5.f288546N
            hd0.n0 r4 = r4.mo140806Zd(r5)
            if (r4 == 0) goto L_0x0075
            r5 = 143(0x8f, float:2.0E-43)
            r4.f288562i = r5
            r5 = 256(0x100, float:3.59E-43)
            r4.f288548P = r5
            hd0.C98429r0.m127808N(r4)
        L_0x0075:
            r4 = 1
            goto L_0x0078
        L_0x0077:
            r4 = 0
        L_0x0078:
            if (r4 == 0) goto L_0x00b2
            java.lang.Class<rz.s> r1 = p682rz.C101488s.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            rz.s r1 = (p682rz.C101488s) r1
            rz.t r1 = r1.Kj0()
            java.lang.String r2 = r0.f285034r
            hd0.o0 r1 = (hd0.C98410o0) r1
            java.lang.String r1 = r1.mo137728q(r2)
            r3.setVideoPath(r1)
            com.tencent.mm.ui.chatting.gallery.h r1 = r0.f284638d
            if (r1 == 0) goto L_0x00a6
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = r1.f284714g
            if (r1 == 0) goto L_0x00a6
            android.widget.TextView r2 = r1.f284368K
            r3 = 8
            r2.setVisibility(r3)
            android.widget.TextView r1 = r1.f284368K
            r2 = -1
            r1.setTextColor(r2)
        L_0x00a6:
            com.tencent.mm.ui.chatting.gallery.h r1 = r0.f284638d
            if (r1 == 0) goto L_0x00b1
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r1 = r1.f284714g
            if (r1 == 0) goto L_0x00b1
            r1.mo135753X8(r6)
        L_0x00b1:
            return
        L_0x00b2:
            r0.f285033q = r7
            boolean r4 = r3.mo24838g()
            if (r4 != 0) goto L_0x0154
            java.lang.String r4 = r3.getVideoPath()
            if (r4 == 0) goto L_0x00c9
            int r5 = r4.length()
            if (r5 != 0) goto L_0x00c7
            goto L_0x00c9
        L_0x00c7:
            r5 = 0
            goto L_0x00ca
        L_0x00c9:
            r5 = 1
        L_0x00ca:
            if (r5 == 0) goto L_0x00ce
            goto L_0x0154
        L_0x00ce:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "play video error, use third player.["
            r5.append(r8)
            r5.append(r4)
            r8 = 93
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r5)
            android.content.Intent r5 = new android.content.Intent     // Catch:{ Exception -> 0x0141 }
            r5.<init>()     // Catch:{ Exception -> 0x0141 }
            java.lang.String r8 = "android.intent.action.VIEW"
            r5.setAction(r8)     // Catch:{ Exception -> 0x0141 }
            com.tencent.mm.ui.chatting.gallery.h r8 = r0.f284638d     // Catch:{ Exception -> 0x0141 }
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r8 = r8.f284714g     // Catch:{ Exception -> 0x0141 }
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x0141 }
            r9.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r4 = "video/*"
            com.tencent.p014mm.sdk.platformtools.FileProviderHelper.setIntentDataAndType((android.content.Context) r8, (android.content.Intent) r5, (com.tencent.p014mm.vfs.C86009m1) r9, (java.lang.String) r4, (boolean) r6)     // Catch:{ Exception -> 0x0141 }
            com.tencent.mm.ui.chatting.gallery.h r4 = r0.f284638d     // Catch:{ Exception -> 0x0141 }
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r4 = r4.f284714g     // Catch:{ Exception -> 0x0141 }
            k20.a r15 = new k20.a     // Catch:{ Exception -> 0x0141 }
            r15.<init>()     // Catch:{ Exception -> 0x0141 }
            r15.mo10233c(r5)     // Catch:{ Exception -> 0x0141 }
            java.lang.Object[] r9 = r15.mo10232b()     // Catch:{ Exception -> 0x0141 }
            java.lang.String r10 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryVideoTPHandler"
            java.lang.String r11 = "openByExternalPlayer"
            java.lang.String r12 = "(Ljava/lang/String;)V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "startActivity"
            java.lang.String r5 = "(Landroid/content/Intent;)V"
            r8 = r4
            r7 = r15
            r15 = r5
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0141 }
            java.lang.Object r5 = r7.mo10231a(r6)     // Catch:{ Exception -> 0x0141 }
            android.content.Intent r5 = (android.content.Intent) r5     // Catch:{ Exception -> 0x0141 }
            r4.startActivity(r5)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r9 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryVideoTPHandler"
            java.lang.String r10 = "openByExternalPlayer"
            java.lang.String r11 = "(Ljava/lang/String;)V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "startActivity"
            java.lang.String r14 = "(Landroid/content/Intent;)V"
            r8 = r4
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0154
        L_0x0141:
            java.lang.String r4 = "startActivity fail, activity not found"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r4)
            com.tencent.mm.ui.chatting.gallery.h r2 = r0.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r2 = r2.f284714g
            r4 = 2131825705(0x7f111429, float:1.9284274E38)
            r5 = 2131825706(0x7f11142a, float:1.9284276E38)
            nj3.C76879j.m92738i(r2, r4, r5)
        L_0x0154:
            r2 = 1
            r0.mo136046I(r1, r2)
            f03.h r2 = r0.f285037u
            if (r2 == 0) goto L_0x015f
            r2.stop()
        L_0x015f:
            com.tencent.mm.ui.chatting.gallery.h r2 = r0.f284638d
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI r2 = r2.f284714g
            r2.mo135781o8()
            com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar r2 = r2.f284400U0
            r2.seek(r6)
            r2 = 0
            r1.mo135973i(r6, r2)
            java.lang.String r1 = r0.f285034r
            boolean r2 = r3.mo24838g()
            hd0.C98429r0.m127832w(r1, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.mo135847t(int, int):void");
    }

    /* renamed from: u */
    public void mo135848u() {
        C96875r0 r0Var;
        String str;
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "onVideoPrepared");
        boolean z = false;
        this.f285033q = false;
        C97056h hVar = this.f284638d;
        C97087m1 v = hVar != null ? hVar.mo135934v() : null;
        if (v != null) {
            v.mo135970f();
            r0Var = v.f284849p;
        } else {
            r0Var = null;
        }
        C99783d dVar = r0Var instanceof C99783d ? (C99783d) r0Var : null;
        if (v == null || dVar == null) {
            Log.m105928w("MicroMsg.Imagegallery.handler.video.tp", "notify video prepared, but holder or videoView is null.");
            return;
        }
        int videoMsToSec = Util.videoMsToSec((long) dVar.getDuration());
        int b = C98429r0.m127811b(videoMsToSec, this.f285034r);
        ImageGalleryUI imageGalleryUI = this.f284638d.f284714g;
        imageGalleryUI.mo135781o8();
        int videoTotalTime = imageGalleryUI.f284400U0.getVideoTotalTime();
        StringBuilder sb = new StringBuilder();
        sb.append("onVideoPrepared(");
        sb.append(hashCode());
        sb.append("): lastPlayPosition=");
        sb.append(b);
        sb.append(", videoDuration=");
        sb.append(videoMsToSec);
        sb.append(", hadSetTotalTime=");
        sb.append(videoTotalTime);
        sb.append(", isUiPlaying=");
        ImageGalleryUI imageGalleryUI2 = this.f284638d.f284714g;
        imageGalleryUI2.mo135781o8();
        sb.append(imageGalleryUI2.f284400U0.f283824z);
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", sb.toString());
        if (videoTotalTime <= 0 || Math.abs(videoTotalTime - videoMsToSec) >= 2) {
            ImageGalleryUI imageGalleryUI3 = this.f284638d.f284714g;
            imageGalleryUI3.mo135781o8();
            imageGalleryUI3.f284400U0.setVideoTotalTime(videoMsToSec);
        }
        try {
            ImageGalleryUI imageGalleryUI4 = this.f284638d.f284714g;
            imageGalleryUI4.mo135781o8();
            imageGalleryUI4.f284400U0.setIplaySeekCallback(this.f285041y);
        } catch (Exception unused) {
        }
        if (videoMsToSec == 0 || videoMsToSec >= 1800) {
            Log.m105929w("MicroMsg.Imagegallery.handler.video.tp", "%d repair video duration[%d] error. filename[%s]", Integer.valueOf(hashCode()), Integer.valueOf(videoMsToSec), this.f285034r);
        } else {
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C97077j1(this, videoMsToSec, (C15601d<? super C97077j1>) null), 2, (Object) null);
        }
        dVar.setOneTimeVideoTextureUpdateCallback(new C97138b(this, v));
        if (!this.f284638d.f284714g.isPaused() && !this.f285036t) {
            if (1 <= b && b < videoMsToSec) {
                dVar.mo24787a((double) (b * 1000), true);
            } else {
                dVar.start();
            }
            v.mo135973i(true, 0.0f);
        } else if (this.f285036t) {
            Log.m105928w("MicroMsg.Imagegallery.handler.video.tp", "video is prepared, but we're waiting for fully download");
        } else {
            Log.m105928w("MicroMsg.Imagegallery.handler.video.tp", "video is prepared, but activity is paused, ignored.");
        }
        TextView textView = v.f284851r;
        if (textView != null) {
            if (dVar.mo24838g()) {
                C97787h hVar2 = this.f285037u;
                str = hVar2 != null ? hVar2.mo134538j() : null;
            } else {
                str = dVar.getVideoPath();
            }
            Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "video path=" + str);
            if (str == null || str.length() == 0) {
                z = true;
            }
            if (!z) {
                C53895h.m60466d(this.f285028i, (C66212f) null, (C53934p0) null, new C6782v0(textView, str, (C15601d<? super C6782v0>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: v */
    public void mo135849v(int i) {
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "pause()");
        C97087m1 h = mo135877h(i);
        if (h != null) {
            h.mo135970f();
            h.f284849p.pause();
            this.f284638d.f284714g.mo135741R8(true);
            mo136046I(h, true);
        }
    }

    /* renamed from: w */
    public void mo135850w(int i) {
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "removePlayingCache");
    }

    /* renamed from: x */
    public void mo135911x(C97087m1 m1Var, String str) {
        super.mo135911x(m1Var, str);
        if (m1Var != null) {
            m1Var.mo135970f();
            m1Var.mo135972h(m1Var.f284848o, 8);
        }
    }

    /* renamed from: y */
    public void mo135851y(C97087m1 m1Var) {
        C87412m.m108594g(m1Var, "holder");
        Log.m105924i("MicroMsg.Imagegallery.handler.video.tp", "stop(" + m1Var.f284836c + ')');
        m1Var.mo135973i(false, 0.0f);
        C96875r0 r0Var = m1Var.f284849p;
        C99783d dVar = r0Var instanceof C99783d ? (C99783d) r0Var : null;
        if (dVar != null) {
            m1Var.mo135970f();
            int currentPosition = m1Var.f284849p.getCurrentPosition();
            if (!this.f285033q) {
                C98429r0.m127832w(this.f285034r, Math.max(currentPosition - 1000, 0), dVar.mo24838g());
            }
            this.f285036t = false;
            dVar.stop();
            C97787h hVar = this.f285037u;
            if (hVar != null) {
                hVar.stop();
            }
            mo136046I(m1Var, true);
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [com.tencent.mm.pluginsdk.ui.tools.r0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo135852z() {
        /*
            r8 = this;
            java.lang.String r0 = "MicroMsg.Imagegallery.handler.video.tp"
            java.lang.String r1 = "stopAll"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.ui.chatting.gallery.h r0 = r8.f284638d
            android.util.SparseArray<java.lang.Object> r0 = r0.f293276f
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L_0x0012:
            r4 = 0
            if (r3 >= r1) goto L_0x0049
            int r5 = r0.keyAt(r3)
            java.lang.Object r5 = r0.get(r5)
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x0026
            java.lang.Object r5 = r5.getTag()
            goto L_0x0027
        L_0x0026:
            r5 = r4
        L_0x0027:
            com.tencent.mm.ui.chatting.gallery.m1 r5 = (com.tencent.p014mm.p136ui.chatting.gallery.C97087m1) r5
            if (r5 == 0) goto L_0x002e
            android.widget.RelativeLayout r6 = r5.f284845l
            goto L_0x002f
        L_0x002e:
            r6 = r4
        L_0x002f:
            if (r6 != 0) goto L_0x0032
            goto L_0x0046
        L_0x0032:
            com.tencent.mm.pluginsdk.ui.tools.r0 r6 = r5.f284849p
            boolean r7 = r6 instanceof m03.C99783d
            if (r7 == 0) goto L_0x003b
            r4 = r6
            m03.d r4 = (m03.C99783d) r4
        L_0x003b:
            if (r4 == 0) goto L_0x0046
            boolean r4 = r4.isInitialized()
            if (r4 == 0) goto L_0x0046
            r8.mo135851y(r5)
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x0049:
            r8.f285037u = r4
            r8.f285036t = r2
            a14.n0 r0 = r8.f285028i
            r1 = 1
            a14.C53930o0.m60558e(r0, r4, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C97136u0.mo135852z():void");
    }
}
