package com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.InsectRelativeLayout;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorInputView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.EditorPanelHolder;
import com.tencent.p014mm.plugin.recordvideo.plugin.parent.AutoRegisterPluginLayout;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.p117ui.widget.VLogThumbView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import d23.C106976a;
import fy3.C32227p;
import gy3.C87412m;
import h90.C98324b;
import hi2.C98453h;
import i33.C98595b;
import j23.C108531a;
import kg3.C76577a;
import kotlin.Metadata;
import kotlin.ResultKt;
import l23.C109165b0;
import l23.C109190g0;
import l23.C109202j;
import l23.C109219q0;
import l23.C109232t0;
import l23.C109245y0;
import l23.C99324x;
import lh2.C109348i;
import lh2.C109359m;
import lh2.C99426e;
import lh2.C99447k;
import li3.C109386b;
import li3.C99482e;
import m23.C109475c;
import mi3.C25007m;
import o23.C109923a;
import r23.C110496a;
import rx3.C13598b0;
import sp3.C110801c;
import sp3.C110807k;
import uh2.C111175f;
import uh2.C111176g;
import uh2.C111177h;
import v23.C111333a;
import v23.C111348f;
import v23.C111350g;
import v23.C111364o;
import v23.C111367p;
import v23.C111369t;
import v23.C111379x;
import wg2.C102440a;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u00107\u001a\u000206\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0004R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0004X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010*\u001a\u00020\u00028\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006<"}, mo182094d2 = {"Lcom/tencent/mm/plugin/vlog/ui/timelineeditor/scene/TimelineEditorBaseVideoPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/AutoRegisterPluginLayout;", "", "seekStart", "Lrx3/b0;", "setSingleTrackPlayRange", "Lli3/e;", "getCurrentTrackPlayRange", "Lsp3/c;", "getCurrentTrack", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "i", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "getConfigProvider", "()Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "setConfigProvider", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "configProvider", "Lh90/b;", "n", "Lh90/b;", "getCaptureInfo", "()Lh90/b;", "setCaptureInfo", "(Lh90/b;)V", "captureInfo", "Landroid/view/ViewGroup;", "o", "Landroid/view/ViewGroup;", "getPluginLayout", "()Landroid/view/ViewGroup;", "pluginLayout", "", "r", "Ljava/lang/String;", "getEditId", "()Ljava/lang/String;", "setEditId", "(Ljava/lang/String;)V", "editId", "s", "Z", "isMediaMute", "()Z", "setMediaMute", "(Z)V", "", "t", "J", "getMaxCropVideoDurationMs", "()J", "setMaxCropVideoDurationMs", "(J)V", "maxCropVideoDurationMs", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout */
public class TimelineEditorBaseVideoPluginLayout extends AutoRegisterPluginLayout {

    /* renamed from: i */
    public RecordConfigProvider f316948i;

    /* renamed from: j */
    public C102440a f316949j;

    /* renamed from: n */
    public C98324b f316950n;

    /* renamed from: o */
    public final ViewGroup f316951o;

    /* renamed from: p */
    public final ViewGroup f316952p;

    /* renamed from: q */
    public final ViewGroup f316953q;

    /* renamed from: r */
    public String f316954r = "";

    /* renamed from: s */
    public boolean f316955s;

    /* renamed from: t */
    public long f316956t = 60000;

    /* renamed from: u */
    public long f316957u;

    /* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$a */
    public static final class C106286a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ TimelineEditorBaseVideoPluginLayout f316958d;

        public C106286a(TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout) {
            this.f316958d = timelineEditorBaseVideoPluginLayout;
        }

        public final void run() {
            this.f316958d.getPluginLayout().setVisibility(4);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$statusChange$12$1$1", mo125469f = "TimelineEditorBaseVideoPluginLayout.kt", mo125470l = {407, 413}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$b */
    public static final class C106287b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f316959d;

        /* renamed from: e */
        public int f316960e;

        /* renamed from: f */
        public /* synthetic */ Object f316961f;

        /* renamed from: g */
        public final /* synthetic */ TimelineEditorBaseVideoPluginLayout f316962g;

        /* renamed from: h */
        public final /* synthetic */ Long f316963h;

        /* renamed from: i */
        public final /* synthetic */ long f316964i;

        /* renamed from: j */
        public final /* synthetic */ long f316965j;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$statusChange$12$1$1$1$1", mo125469f = "TimelineEditorBaseVideoPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$b$a */
        public static final class C106288a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ TimelineEditorBaseVideoPluginLayout f316966d;

            /* renamed from: e */
            public final /* synthetic */ C110807k f316967e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106288a(TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout, C110807k kVar, C15601d<? super C106288a> dVar) {
                super(2, dVar);
                this.f316966d = timelineEditorBaseVideoPluginLayout;
                this.f316967e = kVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C106288a(this.f316966d, this.f316967e, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C106288a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C111367p pVar = (C111367p) this.f316966d.mo151221j(C111367p.class);
                if (pVar == null) {
                    return null;
                }
                C111367p.m151846A(pVar, this.f316967e, false, false, 0, 14, (Object) null);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$statusChange$12$1$1$1$2", mo125469f = "TimelineEditorBaseVideoPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$b$b */
        public static final class C106289b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ TimelineEditorBaseVideoPluginLayout f316968d;

            /* renamed from: e */
            public final /* synthetic */ C96552p0 f316969e;

            /* renamed from: f */
            public final /* synthetic */ long f316970f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C106289b(TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout, C96552p0 p0Var, long j, C15601d<? super C106289b> dVar) {
                super(2, dVar);
                this.f316968d = timelineEditorBaseVideoPluginLayout;
                this.f316969e = p0Var;
                this.f316970f = j;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C106289b(this.f316968d, this.f316969e, this.f316970f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C106289b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                VLogThumbView vLogThumbView;
                Class cls = C109232t0.class;
                ResultKt.throwOnFailure(obj);
                C109232t0 t0Var = (C109232t0) this.f316968d.mo151221j(cls);
                if (t0Var != null) {
                    C109202j.C109205d.C109206a.m148291a(t0Var, this.f316969e, 0, false, 6, (Object) null);
                }
                Log.m105924i("MicroMsg.TimelineProfile", "VLogThumbViewPlugin:" + (System.currentTimeMillis() - this.f316970f));
                this.f316968d.setSingleTrackPlayRange(true);
                C109232t0 t0Var2 = (C109232t0) this.f316968d.mo151221j(cls);
                if (!(t0Var2 == null || (vLogThumbView = t0Var2.f327035h) == null)) {
                    vLogThumbView.f317028o = true;
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106287b(TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout, Long l, long j, long j2, C15601d<? super C106287b> dVar) {
            super(2, dVar);
            this.f316962g = timelineEditorBaseVideoPluginLayout;
            this.f316963h = l;
            this.f316964i = j;
            this.f316965j = j2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C106287b bVar = new C106287b(this.f316962g, this.f316963h, this.f316964i, this.f316965j, dVar);
            bVar.f316961f = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C106287b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: a14.n0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r14.f316960e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 == r3) goto L_0x0019
                if (r1 != r2) goto L_0x0011
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x00d8
            L_0x0011:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0019:
                long r3 = r14.f316959d
                java.lang.Object r1 = r14.f316961f
                a14.n0 r1 = (a14.C0000n0) r1
                kotlin.ResultKt.throwOnFailure(r15)
                r9 = r3
                r3 = r1
                goto L_0x005c
            L_0x0025:
                kotlin.ResultKt.throwOnFailure(r15)
                java.lang.Object r15 = r14.f316961f
                r1 = r15
                a14.n0 r1 = (a14.C0000n0) r1
                long r4 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout r15 = r14.f316962g
                java.lang.Class<v23.f> r6 = v23.C111348f.class
                lh2.g0 r15 = r15.mo151221j(r6)
                r12 = r15
                v23.f r12 = (v23.C111348f) r12
                if (r12 == 0) goto L_0x00d8
                java.lang.Long r11 = r14.f316963h
                long r7 = r14.f316964i
                long r9 = r14.f316965j
                r14.f316961f = r1
                r14.f316959d = r4
                r14.f316960e = r3
                a14.h0 r15 = a14.C53872d1.f151119c
                v23.h r3 = new v23.h
                r13 = 0
                r6 = r3
                r6.<init>(r7, r9, r11, r12, r13)
                java.lang.Object r15 = a14.C53895h.m60469g(r15, r3, r14)
                if (r15 != r0) goto L_0x005a
                return r0
            L_0x005a:
                r3 = r1
                r9 = r4
            L_0x005c:
                sp3.k r15 = (sp3.C110807k) r15
                if (r15 == 0) goto L_0x00d8
                com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout r1 = r14.f316962g
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "jni updateTrackDuration coast:"
                r4.append(r5)
                long r5 = java.lang.System.currentTimeMillis()
                long r5 = r5 - r9
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r11 = "MicroMsg.TimelineProfile"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r4)
                r4 = 0
                r5 = 0
                com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$b$a r6 = new com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$b$a
                r12 = 0
                r6.<init>(r1, r15, r12)
                r7 = 3
                r8 = 0
                a14.C53895h.m60464b(r3, r4, r5, r6, r7, r8)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "updateComposition:"
                r3.append(r4)
                long r4 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r9
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
                com.tencent.mm.plugin.vlog.model.p0 r6 = x23.C102552a.m135387a(r15)
                java.lang.StringBuilder r15 = new java.lang.StringBuilder
                r15.<init>()
                java.lang.String r3 = "videoComposition2VLogComposition coast:"
                r15.append(r3)
                long r3 = java.lang.System.currentTimeMillis()
                long r3 = r3 - r9
                r15.append(r3)
                java.lang.String r15 = r15.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r15)
                a14.k2 r15 = f14.C58901s.f168555a
                com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$b$b r3 = new com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$b$b
                r11 = 0
                r4 = r3
                r5 = r1
                r7 = r9
                r9 = r11
                r4.<init>(r5, r6, r7, r9)
                r14.f316961f = r12
                r14.f316960e = r2
                java.lang.Object r15 = a14.C53895h.m60469g(r15, r3, r14)
                if (r15 != r0) goto L_0x00d8
                return r0
            L_0x00d8:
                rx3.b0 r15 = rx3.C13598b0.f38549a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.C106287b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$statusChange$21$1$1", mo125469f = "TimelineEditorBaseVideoPluginLayout.kt", mo125470l = {535}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$c */
    public static final class C106290c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f316971d;

        /* renamed from: e */
        public final /* synthetic */ C111348f f316972e;

        /* renamed from: f */
        public final /* synthetic */ int f316973f;

        /* renamed from: g */
        public final /* synthetic */ long f316974g;

        /* renamed from: h */
        public final /* synthetic */ long f316975h;

        /* renamed from: i */
        public final /* synthetic */ boolean f316976i;

        /* renamed from: j */
        public final /* synthetic */ TimelineEditorBaseVideoPluginLayout f316977j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C106290c(C111348f fVar, int i, long j, long j2, boolean z, TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout, C15601d<? super C106290c> dVar) {
            super(2, dVar);
            this.f316972e = fVar;
            this.f316973f = i;
            this.f316974g = j;
            this.f316975h = j2;
            this.f316976i = z;
            this.f316977j = timelineEditorBaseVideoPluginLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C106290c(this.f316972e, this.f316973f, this.f316974g, this.f316975h, this.f316976i, this.f316977j, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C106290c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f316971d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C111348f fVar = this.f316972e;
                int i2 = this.f316973f;
                long j = this.f316974g;
                long j2 = this.f316975h;
                this.f316971d = 1;
                fVar.getClass();
                if (C53895h.m60469g(C53872d1.f151119c, new C111350g(i2, fVar, j, j2, (C15601d<? super C111350g>) null), this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C110807k y = this.f316972e.mo163030y();
            if (y != null) {
                boolean z = this.f316976i;
                int i3 = this.f316973f;
                TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout = this.f316977j;
                long j3 = z ? y.f331511l.get(i3).f331464b : y.f331511l.get(i3).f331465c;
                C111367p pVar = (C111367p) timelineEditorBaseVideoPluginLayout.mo151221j(C111367p.class);
                if (pVar != null) {
                    pVar.f333407j = y;
                    pVar.f333403f.mo154765l(y, false, true, j3);
                }
                C111333a aVar2 = (C111333a) timelineEditorBaseVideoPluginLayout.mo151221j(C111333a.class);
                if (aVar2 != null) {
                    aVar2.mo163021y().mo152326b((C96552p0) null, j3);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimelineEditorBaseVideoPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        String r = mo152376r();
        Log.m105924i(r, "create TimelineEditorVideoPluginLayout instance[" + hashCode() + ']');
        Activity activity = (Activity) context;
        if (((ViewGroup) activity.findViewById(C0966R.C0970id.iie)).getChildCount() == 0) {
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(16908290)).setAlpha(0.0f);
        }
        LayoutInflater.from(context).inflate(C0966R.C0971layout.c_i, this, true);
        View findViewById = findViewById(C0966R.C0970id.hxs);
        ((InsectRelativeLayout) findViewById).setDiscardKeyboard(true);
        C87412m.m108593f(findViewById, "findViewById<InsectRelat…Keyboard = true\n        }");
        this.f316951o = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.f359378kl2);
        C87412m.m108593f(findViewById2, "findViewById(R.id.timeline_editor_bottom_layout)");
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        this.f316952p = viewGroup;
        View findViewById3 = findViewById(C0966R.C0970id.kl4);
        C87412m.m108593f(findViewById3, "findViewById(R.id.timeline_editor_head_layout)");
        this.f316953q = (ViewGroup) findViewById3;
        View findViewById4 = viewGroup.findViewById(C0966R.C0970id.kl6);
        if (findViewById4 != null) {
            C98595b.f289089a.mo137988f(findViewById4);
        }
    }

    private final C99482e getCurrentTrackPlayRange() {
        int i;
        C111348f fVar;
        C110807k kVar;
        C109165b0 b0Var = (C109165b0) mo151221j(C109165b0.class);
        if (b0Var == null || (i = b0Var.f326861i) < 0 || (fVar = (C111348f) mo151221j(C111348f.class)) == null || (kVar = fVar.f333357h) == null) {
            return null;
        }
        C110801c cVar = kVar.f331511l.get(i);
        long j = cVar.f331464b;
        long j2 = cVar.f331465c;
        C99482e eVar = new C99482e(j, j2);
        if (cVar.f331477o.mo162376b()) {
            eVar = new C99482e(j - (cVar.f331477o.f331495c / ((long) 2)), j2);
        }
        int i2 = i + 1;
        if (i2 >= kVar.f331511l.size()) {
            return eVar;
        }
        C110801c cVar2 = kVar.f331511l.get(i2);
        return cVar2.f331477o.mo162376b() ? new C99482e(eVar.f291673a, eVar.f291674b + (cVar2.f331477o.f331495c / ((long) 2))) : eVar;
    }

    /* access modifiers changed from: private */
    public final void setSingleTrackPlayRange(boolean z) {
        C111367p pVar;
        Class cls = C111367p.class;
        C99482e currentTrackPlayRange = getCurrentTrackPlayRange();
        if (currentTrackPlayRange != null) {
            C111367p pVar2 = (C111367p) mo151221j(cls);
            if (pVar2 != null) {
                pVar2.mo163040z(currentTrackPlayRange.f291673a, currentTrackPlayRange.f291674b);
            }
            if (z && (pVar = (C111367p) mo151221j(cls)) != null) {
                pVar.mo163039y(currentTrackPlayRange.f291673a);
            }
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m143026x(TimelineEditorBaseVideoPluginLayout timelineEditorBaseVideoPluginLayout, Long l, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                l = null;
            }
            timelineEditorBaseVideoPluginLayout.mo152383w(l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeVideo");
    }

    /* renamed from: e */
    public boolean mo78564e() {
        C102440a aVar;
        if (super.mo78564e() || (aVar = this.f316949j) == null) {
            return true;
        }
        C102440a.C102441a.m135179a(aVar, 0, (C98324b) null, 2, (Object) null);
        return true;
    }

    public final C98324b getCaptureInfo() {
        return this.f316950n;
    }

    public final RecordConfigProvider getConfigProvider() {
        return this.f316948i;
    }

    public final C110801c getCurrentTrack() {
        int i;
        C111348f fVar;
        C110807k kVar;
        C109165b0 b0Var = (C109165b0) mo151221j(C109165b0.class);
        if (b0Var == null || (i = b0Var.f326861i) < 0 || (fVar = (C111348f) mo151221j(C111348f.class)) == null || (kVar = fVar.f333357h) == null) {
            return null;
        }
        return kVar.f331511l.get(i);
    }

    public final String getEditId() {
        return this.f316954r;
    }

    public final long getMaxCropVideoDurationMs() {
        return this.f316956t;
    }

    public final ViewGroup getPluginLayout() {
        return this.f316951o;
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        this.f316948i = recordConfigProvider;
        this.f316949j = aVar;
        Bundle bundle = recordConfigProvider.f272912M;
        if (bundle != null) {
            bundle.setClassLoader(GalleryItem$MediaItem.class.getClassLoader());
        }
        C98453h.f288774a.mo137806d(recordConfigProvider);
        Log.m105924i("MicroMsg.TimelineEditorFirstEnterOperate", "checkResUpdate");
        C111175f fVar = C111175f.f332956d;
        fVar.mo151272b();
        C111176g gVar = C111176g.f332958d;
        gVar.mo151272b();
        C111177h hVar = C111177h.f332960d;
        hVar.mo151272b();
        fVar.mo151283m();
        gVar.mo151283m();
        hVar.mo151283m();
        mo152374o();
        C108531a aVar2 = (C108531a) mo151221j(C108531a.class);
        if (aVar2 != null) {
            aVar2.f324876h.setImageDrawable(aVar2.f324874f.getContext().getResources().getDrawable(C0966R.raw.popvideo_post_selected_origin));
        }
        C109348i iVar = (C109348i) mo151221j(C109348i.class);
        if (iVar != null) {
            iVar.mo160547y(Integer.valueOf(C0966R.C0969drawable.f4653j6), (Integer) null);
        }
        mo152375q(aVar, recordConfigProvider);
        super.mo128671k(aVar, recordConfigProvider);
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02a8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x032d  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo129855l(h90.C98324b r19) {
        /*
            r18 = this;
            r0 = r18
            r2 = r19
            java.lang.Class<v23.f> r1 = v23.C111348f.class
            java.lang.String r3 = r18.mo152376r()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loadCurrentPage time:"
            r4.append(r5)
            long r5 = java.lang.System.currentTimeMillis()
            r4.append(r5)
            java.lang.String r5 = " model:"
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            super.mo129855l(r19)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            f40.e r4 = f40.C86709a0.m107523b()
            java.lang.String r4 = r4.mo121111i()
            r3.append(r4)
            r4 = 95
            r3.append(r4)
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.f316954r = r3
            r0.f316950n = r2
            java.lang.Class<v23.o> r3 = v23.C111364o.class
            lh2.g0 r3 = r0.mo151221j(r3)
            v23.o r3 = (v23.C111364o) r3
            r6 = 0
            r7 = 2
            java.lang.String r8 = "media_list"
            if (r3 == 0) goto L_0x01d0
            wg2.a r9 = r0.f316949j
            gy3.C87412m.m108591d(r9)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r9 = r0.f316948i
            gy3.C87412m.m108591d(r9)
            android.os.Bundle r9 = r9.f272912M
            if (r9 == 0) goto L_0x00a1
            java.util.ArrayList r9 = r9.getParcelableArrayList(r8)
            if (r9 == 0) goto L_0x00a1
            java.lang.Object r10 = sx3.C110818d0.m150914L(r9)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r10 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r10
            int r11 = r10.getType()
            if (r11 != r7) goto L_0x0093
            qw1.k r10 = qw1.C63342k.f179710a
            java.lang.Object r9 = sx3.C110818d0.m150914L(r9)
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r9 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r9
            java.lang.String r9 = r9.f162747d
            com.tencent.mm.plugin.sight.base.a r9 = r10.mo88239a(r9)
            int r10 = r9.f273445c
            float r10 = (float) r10
            int r9 = r9.f273446d
            goto L_0x009e
        L_0x0093:
            java.lang.String r9 = r10.f162747d
            android.graphics.BitmapFactory$Options r9 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.getImageOptions(r9)
            int r10 = r9.outWidth
            float r10 = (float) r10
            int r9 = r9.outHeight
        L_0x009e:
            float r9 = (float) r9
            float r10 = r10 / r9
            goto L_0x00a3
        L_0x00a1:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a3:
            android.content.Context r9 = r3.f333397h
            android.graphics.Point r9 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r9)
            int r11 = r9.x
            int r9 = r9.y
            android.util.Size r12 = new android.util.Size
            r12.<init>(r11, r9)
            i33.b r12 = i33.C98595b.f289089a
            r12.mo137985c()
            float r12 = (float) r11
            float r10 = r12 / r10
            float r9 = (float) r9
            float r9 = r9 - r10
            float r13 = (float) r7
            float r9 = r9 / r13
            float r13 = r9 + r10
            com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView r14 = r3.f333396g
            android.view.ViewParent r14 = r14.getParent()
            boolean r15 = r14 instanceof com.tencent.p014mm.plugin.vlog.p117ui.widget.CropOperationContainer
            if (r15 == 0) goto L_0x00cd
            com.tencent.mm.plugin.vlog.ui.widget.CropOperationContainer r14 = (com.tencent.p014mm.plugin.vlog.p117ui.widget.CropOperationContainer) r14
            goto L_0x00ce
        L_0x00cd:
            r14 = 0
        L_0x00ce:
            if (r14 == 0) goto L_0x00d3
            r14.setEditorItemFirstTouch(r6)
        L_0x00d3:
            android.graphics.RectF r14 = new android.graphics.RectF
            r15 = 0
            r14.<init>(r15, r9, r12, r13)
            r3.f333399j = r14
            com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView r12 = r3.f333396g
            android.graphics.RectF r5 = r3.f333400n
            r12.getClass()
            java.lang.String r4 = "visibilityRect"
            gy3.C87412m.m108594g(r5, r4)
            r12.f207434i = r5
            r12.f207435j = r14
            r12.f207432g = r5
            r12.mo98727a()
            r12.postInvalidate()
            android.graphics.RectF r5 = r3.f333399j
            r3.f333400n = r5
            com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView r12 = r3.f333396g
            r12.getClass()
            gy3.C87412m.m108594g(r5, r4)
            r12.f207434i = r5
            r12.f207435j = r5
            r12.f207432g = r5
            r12.mo98727a()
            r12.postInvalidate()
            com.tencent.mm.plugin.vlog.ui.timelineeditor.view.TimelineEditorDragRectView r4 = r3.f333396g
            r5 = 4
            r4.setVisibility(r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "screenWidth:"
            r4.append(r5)
            r4.append(r11)
            java.lang.String r5 = " scaleHeight:"
            r4.append(r5)
            r4.append(r10)
            java.lang.String r5 = " scaleTop:"
            r4.append(r5)
            r4.append(r9)
            java.lang.String r5 = " scaleBottom:"
            r4.append(r5)
            r4.append(r13)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "MicroMsg.TimelineEditorHalfScreenPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r4)
            android.graphics.Rect r4 = zg2.C103020m.f303988d
            android.graphics.RectF r5 = r3.f333399j
            float r9 = r5.top
            int r9 = (int) r9
            r4.top = r9
            float r5 = r5.bottom
            int r5 = (int) r5
            r4.bottom = r5
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            android.graphics.RectF r5 = r3.f333399j
            r5.round(r4)
            lh2.g0 r5 = r0.mo151221j(r1)
            v23.f r5 = (v23.C111348f) r5
            if (r5 == 0) goto L_0x0188
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r9 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r9)
            android.graphics.Rect r10 = new android.graphics.Rect
            int r11 = r9.x
            int r9 = r9.y
            r10.<init>(r6, r6, r11, r9)
            com.tencent.mm.timelineedit.TimelineEditor r9 = r5.f333356g
            li3.b r11 = r5.f333355f
            r9.mo153344o(r10, r4, r11)
            com.tencent.mm.timelineedit.TimelineEditor r4 = r5.f333356g
            com.tencent.mm.xeffect.effect.EffectManager r4 = r4.mo153349t()
            if (r4 == 0) goto L_0x0188
            w23.d r5 = new w23.d
            r5.<init>()
            r4.mo154937q(r5)
        L_0x0188:
            android.graphics.RectF r3 = r3.f333399j
            java.lang.String r4 = "valid"
            gy3.C87412m.m108594g(r3, r4)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 208(0xd0, float:2.91E-43)
            int r4 = kg3.C76577a.m92151b(r4, r5)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r5 = com.tencent.p014mm.p136ui.C85875k4.m106184h(r5)
            int r5 = r5.y
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r9 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r9)
            android.graphics.RectF r10 = new android.graphics.RectF
            float r11 = r3.top
            float r12 = r3.right
            int r5 = r5 - r4
            int r5 = r5 - r9
            float r4 = (float) r5
            float r3 = r3.bottom
            float r3 = java.lang.Math.min(r4, r3)
            r10.<init>(r15, r11, r12, r3)
            java.lang.Class<l23.y0> r3 = l23.C109245y0.class
            lh2.g0 r3 = r0.mo151221j(r3)
            l23.y0 r3 = (l23.C109245y0) r3
            if (r3 == 0) goto L_0x01cb
            r3.mo160480x(r10)
        L_0x01cb:
            android.graphics.Rect r3 = zg2.C103020m.f303989e
            r10.round(r3)
        L_0x01d0:
            lh2.g0 r3 = r0.mo151221j(r1)
            v23.f r3 = (v23.C111348f) r3
            if (r3 == 0) goto L_0x01df
            com.tencent.mm.timelineedit.TimelineEditor r3 = r3.f333356g
            com.tencent.mm.xeffect.effect.EffectManager r3 = r3.mo153349t()
            goto L_0x01e0
        L_0x01df:
            r3 = 0
        L_0x01e0:
            d23.a r4 = d23.C106976a.f320208a
            r4.mo157401e(r3)
            lh2.g0 r3 = r0.mo151221j(r1)
            v23.f r3 = (v23.C111348f) r3
            if (r3 == 0) goto L_0x01f2
            boolean r4 = r0.f316955s
            r3.mo163026B(r4)
        L_0x01f2:
            lh2.g0 r1 = r0.mo151221j(r1)
            v23.f r1 = (v23.C111348f) r1
            if (r1 == 0) goto L_0x0377
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r0.f316948i
            if (r3 == 0) goto L_0x0338
            android.os.Bundle r3 = r3.f272912M
            if (r3 == 0) goto L_0x0338
            java.util.ArrayList r3 = r3.getParcelableArrayList(r8)
            if (r3 == 0) goto L_0x0338
            java.util.Iterator r3 = r3.iterator()
            r8 = 0
            r9 = 0
        L_0x020f:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x0338
            java.lang.Object r11 = r3.next()
            int r12 = r8 + 1
            if (r8 < 0) goto L_0x0333
            com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem r11 = (com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem) r11
            long r13 = java.lang.System.currentTimeMillis()
            com.tencent.mm.timelineedit.TimelineEditor r15 = r1.f333356g
            java.lang.String r6 = r11.f162747d
            java.lang.String r4 = "item.mOriginalPath"
            gy3.C87412m.m108593f(r6, r4)
            int r4 = r11.getType()
            r5 = 3
            r11 = 1
            if (r4 == r11) goto L_0x023a
            if (r4 == r7) goto L_0x0238
            r4 = 0
            goto L_0x023b
        L_0x0238:
            r4 = 1
            goto L_0x023b
        L_0x023a:
            r4 = 3
        L_0x023b:
            li3.f r4 = r15.mo153346q(r6, r4)
            long r16 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r15 = "createTrack cost:"
            r6.append(r15)
            long r13 = r16 - r13
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            java.lang.String r13 = "MicroMsg.TimelineEditorCorePlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r6)
            if (r4 == 0) goto L_0x0280
            com.google.protobuf.j1$a r6 = r4.mo160583a()
            mi3.p$b r6 = (mi3.C25016p.C25018b) r6
            int r6 = r6.f71295f
            mi3.i r6 = mi3.C109631i.m148941a(r6)
            if (r6 != 0) goto L_0x026d
            mi3.i r6 = mi3.C109631i.UNRECOGNIZED
        L_0x026d:
            int r6 = r6.ordinal()
            if (r6 == r11) goto L_0x027b
            if (r6 == r7) goto L_0x027c
            if (r6 == r5) goto L_0x0279
            r5 = 0
            goto L_0x027c
        L_0x0279:
            r5 = 1
            goto L_0x027c
        L_0x027b:
            r5 = 2
        L_0x027c:
            if (r5 != r11) goto L_0x0280
            r5 = 1
            goto L_0x0281
        L_0x0280:
            r5 = 0
        L_0x0281:
            if (r5 == 0) goto L_0x02a6
            sp3.c r5 = new sp3.c
            java.lang.String r6 = r4.mo160585c()
            r5.<init>(r6, r11)
            int r6 = r5.f331471i
            int r5 = r5.f331472j
            com.google.protobuf.j1$a r14 = r4.mo160583a()
            mi3.p$b r14 = (mi3.C25016p.C25018b) r14
            r14.f71301o = r6
            r14.onChanged()
            com.google.protobuf.j1$a r6 = r4.mo160583a()
            mi3.p$b r6 = (mi3.C25016p.C25018b) r6
            r6.f71302p = r5
            r6.onChanged()
        L_0x02a6:
            if (r4 == 0) goto L_0x032d
            li3.e r5 = new li3.e
            com.google.protobuf.j1$a r6 = r4.mo160583a()
            mi3.p$b r6 = (mi3.C25016p.C25018b) r6
            long r14 = r6.f71300n
            r5.<init>(r9, r14)
            r4.mo160588f(r5)
            li3.e r5 = new li3.e
            com.google.protobuf.j1$a r6 = r4.mo160583a()
            mi3.p$b r6 = (mi3.C25016p.C25018b) r6
            long r9 = r6.f71300n
            r14 = 0
            r5.<init>(r14, r9)
            r4.mo160589g(r5)
            r4.mo160587e(r11)
            com.google.protobuf.j1$a r5 = r4.mo160583a()
            mi3.p$b r5 = (mi3.C25016p.C25018b) r5
            r6 = 1065353216(0x3f800000, float:1.0)
            r5.f71304r = r6
            r5.onChanged()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "add track index:"
            r5.append(r9)
            r5.append(r8)
            java.lang.String r8 = " info:"
            r5.append(r8)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r5)
            long r8 = java.lang.System.currentTimeMillis()
            com.tencent.mm.timelineedit.TimelineEditor r5 = r1.f333356g
            sp3.k r5 = r5.mo153343n(r4)
            r1.mo163025A(r5)
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "addTrack cost:"
            r5.append(r6)
            long r10 = r10 - r8
            r5.append(r10)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r5)
            com.google.protobuf.j1$a r5 = r4.mo160583a()
            mi3.p$b r5 = (mi3.C25016p.C25018b) r5
            long r5 = r5.f71296g
            com.google.protobuf.j1$a r4 = r4.mo160583a()
            mi3.p$b r4 = (mi3.C25016p.C25018b) r4
            long r9 = r4.f71297h
            goto L_0x032f
        L_0x032d:
            r14 = 0
        L_0x032f:
            r8 = r12
            r6 = 0
            goto L_0x020f
        L_0x0333:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x0338:
            r1.mo163027C()
            sp3.k r1 = r1.f333357h
            if (r1 == 0) goto L_0x0377
            java.lang.Class<v23.p> r3 = v23.C111367p.class
            lh2.g0 r3 = r0.mo151221j(r3)
            v23.p r3 = (v23.C111367p) r3
            if (r3 == 0) goto L_0x0350
            r3.f333407j = r1
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r3 = r3.f333403f
            r3.mo79510k(r1)
        L_0x0350:
            java.lang.Class<l23.t0> r3 = l23.C109232t0.class
            lh2.g0 r3 = r0.mo151221j(r3)
            r8 = r3
            l23.t0 r8 = (l23.C109232t0) r8
            if (r8 == 0) goto L_0x0367
            com.tencent.mm.plugin.vlog.model.p0 r9 = x23.C102552a.m135387a(r1)
            r10 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            l23.C109202j.C109205d.C109206a.m148291a(r8, r9, r10, r12, r13, r14)
        L_0x0367:
            long r3 = r1.mo162384g()
            long r5 = r0.f316956t
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0377
            qh2.e$b r1 = qh2.C101198e.C101199b.EDIT_CROP_VIDEO
            r3 = 0
            qh2.C101198e.C62622a.m73576a(r0, r1, r3, r7, r3)
        L_0x0377:
            java.lang.Class<j23.a> r1 = j23.C108531a.class
            lh2.g0 r1 = r0.mo151221j(r1)
            j23.a r1 = (j23.C108531a) r1
            if (r1 == 0) goto L_0x0392
            gy3.C87412m.m108591d(r19)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r3 = r0.f316948i
            r4 = 0
            boolean r5 = r0.f316955s
            r6 = 0
            r7 = 20
            r8 = 0
            r2 = r19
            j23.C108531a.m147079H(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0392:
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r0.f316948i
            if (r1 == 0) goto L_0x03a3
            java.lang.Class<m23.c> r2 = m23.C109475c.class
            lh2.g0 r2 = r0.mo151221j(r2)
            m23.c r2 = (m23.C109475c) r2
            if (r2 == 0) goto L_0x03a3
            r2.mo78575v(r1)
        L_0x03a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.mo129855l(h90.b):void");
    }

    /* renamed from: n */
    public final void mo152373n() {
        this.f316951o.animate().cancel();
        this.f316951o.animate().alpha(0.0f).setDuration(100).withEndAction(new C106286a(this)).start();
    }

    /* renamed from: o */
    public void mo152374o() {
        View findViewById = findViewById(C0966R.C0970id.l4z);
        C87412m.m108593f(findViewById, "findViewById(R.id.video_composition_player)");
        C111367p pVar = new C111367p((VideoCompositionPlayView) findViewById, this);
        C109386b bVar = new C109386b();
        RecordConfigProvider recordConfigProvider = this.f316948i;
        long j = 60000;
        if (recordConfigProvider != null) {
            j = recordConfigProvider.f272912M.getLong("video_max_duration", 60000);
            Log.m105924i("MicroMsg.TimelineEditorModelParser", "getMaxDurationMs by parse:" + j);
        } else {
            Log.m105924i("MicroMsg.TimelineEditorModelParser", "getMaxDurationMs by default:60000");
        }
        this.f316956t = j;
        RecordConfigProvider recordConfigProvider2 = this.f316948i;
        long j2 = 0;
        if (recordConfigProvider2 != null) {
            j2 = recordConfigProvider2.f272912M.getLong("video_track_max_duration", 0);
            Log.m105924i("MicroMsg.TimelineEditorModelParser", "getMaxTrackDurationMs by parse:" + j2);
        } else {
            Log.m105924i("MicroMsg.TimelineEditorModelParser", "getMaxDurationMs by default:0");
        }
        this.f316957u = j2;
        C25007m.C25009b bVar2 = (C25007m.C25009b) bVar.mo160583a();
        bVar2.f71254n = C76577a.m92145A(MMApplicationContext.getContext()) / 2;
        bVar2.onChanged();
        C25007m.C25009b bVar3 = (C25007m.C25009b) bVar.mo160583a();
        bVar3.f71255o = C76577a.m92159j(MMApplicationContext.getContext()) / 2;
        bVar3.onChanged();
        new C111348f(this, bVar);
        Context context = getContext();
        C87412m.m108593f(context, "context");
        C111379x.m151864y(new C111379x(context, this), (Integer) null, 1, (Object) null);
        View findViewById2 = findViewById(C0966R.C0970id.cbs);
        C87412m.m108593f(findViewById2, "findViewById(R.id.editor_add_emoji)");
        new C99426e(this, (ImageView) findViewById2, this);
        View findViewById3 = findViewById(C0966R.C0970id.azh);
        C87412m.m108593f(findViewById3, "findViewById(R.id.change_text_root)");
        C109359m mVar = new C109359m((EditorInputView) findViewById3, this);
        mVar.f327377f.setEnableClickOutsideConfirm(true);
        new C109348i(this, this, mVar.f327377f);
        new C99324x(this, this);
        C108531a aVar = new C108531a(this, this);
        aVar.f324884s = true;
        aVar.f324878j.setBackground(C0966R.C0969drawable.azc);
        pVar.f333406i = aVar;
        View findViewById4 = findViewById(C0966R.C0970id.f359377kl1);
        C87412m.m108593f(findViewById4, "findViewById(R.id.timeline_editor_back)");
        new C99447k((ImageView) findViewById4, this);
        new C111364o(this, this);
        C111333a aVar2 = new C111333a(this, this);
        pVar.mo163038x(aVar2);
        new C109190g0(this, this).mo160431x(aVar2);
        pVar.mo163038x(new C109232t0(this, this));
        new C109165b0(this, this);
        View findViewById5 = findViewById(C0966R.C0970id.f357903cd1);
        C87412m.m108593f(findViewById5, "findViewById(R.id.editor_track_play_rate_panel)");
        new C109219q0((EditorPanelHolder) findViewById5, this);
        View findViewById6 = findViewById(C0966R.C0970id.f357902cd0);
        C87412m.m108593f(findViewById6, "findViewById(R.id.editor_track_edit_panel)");
        pVar.mo163038x(new C111369t((EditorPanelHolder) findViewById6, this));
        new C110496a(this, this, false);
        View findViewById7 = findViewById(C0966R.C0970id.cbq);
        C87412m.m108593f(findViewById7, "findViewById(R.id.editor_add_caption_group)");
        View findViewById8 = findViewById(C0966R.C0970id.cc7);
        C87412m.m108593f(findViewById8, "findViewById(R.id.editor_caption_preview_panel)");
        View findViewById9 = findViewById(C0966R.C0970id.cc6);
        C87412m.m108593f(findViewById9, "findViewById(R.id.editor_caption_edit_panel)");
        pVar.mo163038x(new C109475c((ViewGroup) findViewById7, (EditorPanelHolder) findViewById8, (EditorPanelHolder) findViewById9, this));
        View findViewById10 = findViewById(C0966R.C0970id.cd4);
        C87412m.m108593f(findViewById10, "findViewById(R.id.editor_tts_panel)");
        pVar.mo163038x(new C109923a((ViewGroup) findViewById10, this));
        new C109245y0(this, this);
    }

    public void onDetach() {
        VideoCompositionPlayView videoCompositionPlayView;
        Class cls = C111367p.class;
        super.onDetach();
        C111367p pVar = (C111367p) mo151221j(cls);
        if (!(pVar == null || (videoCompositionPlayView = pVar.f333403f) == null)) {
            videoCompositionPlayView.stop();
        }
        C111367p pVar2 = (C111367p) mo151221j(cls);
        VideoCompositionPlayView videoCompositionPlayView2 = pVar2 != null ? pVar2.f333403f : null;
        if (videoCompositionPlayView2 != null) {
            videoCompositionPlayView2.setAlpha(0.0f);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: sp3.k} */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x08f2, code lost:
        if (r0 == false) goto L_0x08fa;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0687  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14585p(qh2.C101198e.C101199b r27, android.os.Bundle r28) {
        /*
            r26 = this;
            r10 = r26
            r0 = r27
            r1 = r28
            java.lang.Class<l23.y0> r2 = l23.C109245y0.class
            java.lang.Class<v23.a> r3 = v23.C111333a.class
            java.lang.Class<l23.q0> r4 = l23.C109219q0.class
            java.lang.Class<r23.a> r5 = r23.C110496a.class
            java.lang.Class<l23.g0> r6 = l23.C109190g0.class
            java.lang.Class<l23.t0> r7 = l23.C109232t0.class
            java.lang.Class<v23.f> r8 = v23.C111348f.class
            java.lang.Class<v23.p> r9 = v23.C111367p.class
            java.lang.String r11 = "status"
            gy3.C87412m.m108594g(r0, r11)
            int r11 = r27.ordinal()
            r12 = 35
            if (r11 == r12) goto L_0x094c
            r12 = 36
            if (r11 == r12) goto L_0x093c
            r12 = 38
            if (r11 == r12) goto L_0x092a
            r12 = 39
            if (r11 == r12) goto L_0x091f
            r12 = 49
            if (r11 == r12) goto L_0x0919
            r12 = 50
            if (r11 == r12) goto L_0x0903
            r12 = 57
            if (r11 == r12) goto L_0x08fd
            r12 = 58
            java.lang.String r14 = "PARAM_1_BOOLEAN"
            if (r11 == r12) goto L_0x08d3
            r12 = 89
            r16 = r14
            r13 = 0
            if (r11 == r12) goto L_0x08bb
            r12 = 90
            if (r11 == r12) goto L_0x08bb
            r12 = 102(0x66, float:1.43E-43)
            if (r11 == r12) goto L_0x0892
            r4 = 103(0x67, float:1.44E-43)
            if (r11 == r4) goto L_0x0815
            r4 = 105(0x69, float:1.47E-43)
            if (r11 == r4) goto L_0x0746
            r4 = 106(0x6a, float:1.49E-43)
            if (r11 == r4) goto L_0x0746
            r0 = 127(0x7f, float:1.78E-43)
            if (r11 == r0) goto L_0x073f
            r0 = 128(0x80, float:1.794E-43)
            if (r11 == r0) goto L_0x0919
            java.lang.String r0 = "EDIT_VLOG_TRAKC_CROP_END"
            java.lang.String r4 = "EDIT_VLOG_TRACK_CROP_START"
            r12 = 29
            if (r11 == r12) goto L_0x0738
            r12 = 33
            if (r11 == r12) goto L_0x072e
            r12 = 42
            if (r11 == r12) goto L_0x06fc
            r12 = 45
            if (r11 == r12) goto L_0x073f
            r12 = 47
            if (r11 == r12) goto L_0x08fd
            r12 = 53
            if (r11 == r12) goto L_0x068f
            r3 = 114(0x72, float:1.6E-43)
            r12 = 4
            if (r11 == r3) goto L_0x060e
            r3 = 136(0x88, float:1.9E-43)
            if (r11 == r3) goto L_0x055f
            r3 = 138(0x8a, float:1.93E-43)
            if (r11 == r3) goto L_0x0551
            r3 = 143(0x8f, float:2.0E-43)
            if (r11 == r3) goto L_0x04e8
            switch(r11) {
                case 94: goto L_0x0273;
                case 95: goto L_0x021b;
                case 96: goto L_0x014d;
                case 97: goto L_0x0116;
                case 98: goto L_0x0116;
                case 99: goto L_0x00a3;
                default: goto L_0x0095;
            }
        L_0x0095:
            r0 = 2
            java.lang.String r2 = "PARAM_1_INT"
            java.lang.String r3 = "PARAM_1_STRING"
            java.lang.String r4 = "EDIT_SELECT_TRANSITION_INDEX"
            r16 = 1000(0x3e8, double:4.94E-321)
            switch(r11) {
                case 117: goto L_0x0471;
                case 118: goto L_0x03f0;
                case 119: goto L_0x0399;
                case 120: goto L_0x0314;
                case 121: goto L_0x02c0;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            goto L_0x060a
        L_0x00a3:
            sp3.c r0 = r26.getCurrentTrack()
            if (r0 == 0) goto L_0x0961
            lh2.g0 r1 = r10.mo151221j(r8)
            v23.f r1 = (v23.C111348f) r1
            if (r1 == 0) goto L_0x00cb
            long r2 = r0.f331463a
            com.tencent.mm.timelineedit.TimelineEditor r1 = r1.f333356g
            r1.getClass()
            ki3.e r4 = new ki3.e
            r4.<init>(r1, r2)
            ki3.f r2 = new ki3.f
            r2.<init>(r1)
            java.lang.Object r1 = r1.mo153351v(r4, r2)
            r13 = r1
            sp3.k r13 = (sp3.C110807k) r13
            r2 = r13
            goto L_0x00cc
        L_0x00cb:
            r2 = 0
        L_0x00cc:
            lh2.g0 r1 = r10.mo151221j(r9)
            v23.p r1 = (v23.C111367p) r1
            if (r1 == 0) goto L_0x00e0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 14
            r8 = 0
            v23.C111367p.m151846A(r1, r2, r3, r4, r5, r7, r8)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00e0:
            lh2.g0 r1 = r10.mo151221j(r9)
            v23.p r1 = (v23.C111367p) r1
            if (r1 == 0) goto L_0x00f9
            long r2 = r0.f331466d
            float r2 = (float) r2
            float r3 = r0.f331468f
            float r2 = r2 / r3
            long r4 = (long) r2
            long r6 = r0.f331467e
            float r2 = (float) r6
            float r2 = r2 / r3
            long r2 = (long) r2
            r1.mo163040z(r4, r2)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00f9:
            java.lang.Class<v23.t> r1 = v23.C111369t.class
            lh2.g0 r1 = r10.mo151221j(r1)
            r16 = r1
            v23.t r16 = (v23.C111369t) r16
            if (r16 == 0) goto L_0x0961
            r18 = 0
            r19 = 0
            r21 = 6
            r22 = 0
            r17 = r0
            v23.C111369t.m151857x(r16, r17, r18, r19, r21, r22)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0116:
            if (r1 == 0) goto L_0x0149
            java.lang.String r2 = "EDIT_COMPOSITION_TRACK_INDEX"
            int r2 = r1.getInt(r2)
            java.lang.String r3 = "EDIT_COMPOSITION_LEFT"
            boolean r7 = r1.getBoolean(r3)
            long r3 = r1.getLong(r4)
            long r5 = r1.getLong(r0)
            lh2.g0 r0 = r10.mo151221j(r8)
            r1 = r0
            v23.f r1 = (v23.C111348f) r1
            if (r1 == 0) goto L_0x0149
            a14.s1 r11 = a14.C0001s1.f0d
            a14.h0 r12 = a14.C53872d1.f151119c
            r13 = 0
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$c r14 = new com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$c
            r9 = 0
            r0 = r14
            r8 = r26
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            r15 = 2
            r16 = 0
            a14.C53895h.m60466d(r11, r12, r13, r14, r15, r16)
        L_0x0149:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x014d:
            if (r1 == 0) goto L_0x0961
            java.lang.String r0 = "EDIT_VLOG_TRACK_CROP_CONFIRM"
            boolean r0 = r1.getBoolean(r0)
            lh2.g0 r1 = r10.mo151221j(r8)
            v23.f r1 = (v23.C111348f) r1
            if (r1 == 0) goto L_0x0214
            r2 = r0 ^ 1
            com.tencent.mm.timelineedit.TimelineEditor r3 = r1.f333356g
            r3.getClass()
            ki3.k r4 = new ki3.k
            r4.<init>(r3, r2)
            ki3.l r5 = new ki3.l
            r5.<init>(r3)
            java.lang.Object r3 = r3.mo153351v(r4, r5)
            sp3.k r3 = (sp3.C110807k) r3
            if (r2 == 0) goto L_0x0179
            r1.mo163025A(r3)
        L_0x0179:
            sp3.k r1 = r1.f333357h
            if (r1 == 0) goto L_0x0214
            long r2 = r1.mo162384g()
            long r4 = r10.f316956t
            r6 = 200(0xc8, float:2.8E-43)
            long r11 = (long) r6
            long r4 = r4 + r11
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x01d9
            if (r0 == 0) goto L_0x01d5
            lh2.g0 r0 = r10.mo151221j(r8)
            v23.f r0 = (v23.C111348f) r0
            if (r0 == 0) goto L_0x01cf
            long r1 = r10.f316956t
            sp3.k r0 = r0.mo163031z(r1)
            if (r0 == 0) goto L_0x01cf
            lh2.g0 r1 = r10.mo151221j(r9)
            r16 = r1
            v23.p r16 = (v23.C111367p) r16
            if (r16 == 0) goto L_0x01b8
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 12
            r23 = 0
            r17 = r0
            v23.C111367p.m151846A(r16, r17, r18, r19, r20, r22, r23)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x01b8:
            lh2.g0 r1 = r10.mo151221j(r7)
            r2 = r1
            l23.t0 r2 = (l23.C109232t0) r2
            if (r2 == 0) goto L_0x01cf
            com.tencent.mm.plugin.vlog.model.p0 r3 = x23.C102552a.m135387a(r0)
            r4 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            l23.C109202j.C109205d.C109206a.m148291a(r2, r3, r4, r6, r7, r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x01cf:
            r0 = 1
            r1 = 0
            m143026x(r10, r1, r0, r1)
            goto L_0x0212
        L_0x01d5:
            r26.mo78564e()
            return
        L_0x01d9:
            lh2.g0 r2 = r10.mo151221j(r9)
            r16 = r2
            v23.p r16 = (v23.C111367p) r16
            if (r16 == 0) goto L_0x01f4
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 12
            r23 = 0
            r17 = r1
            v23.C111367p.m151846A(r16, r17, r18, r19, r20, r22, r23)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x01f4:
            if (r0 == 0) goto L_0x020d
            lh2.g0 r0 = r10.mo151221j(r7)
            r2 = r0
            l23.t0 r2 = (l23.C109232t0) r2
            if (r2 == 0) goto L_0x020d
            com.tencent.mm.plugin.vlog.model.p0 r3 = x23.C102552a.m135387a(r1)
            r4 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            l23.C109202j.C109205d.C109206a.m148291a(r2, r3, r4, r6, r7, r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x020d:
            r0 = 1
            r1 = 0
            m143026x(r10, r1, r0, r1)
        L_0x0212:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0214:
            r26.mo152384y()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x021b:
            sp3.c r2 = r26.getCurrentTrack()
            if (r2 == 0) goto L_0x026f
            if (r1 == 0) goto L_0x026f
            long r3 = r1.getLong(r4)
            long r5 = r1.getLong(r0)
            sp3.c r0 = r26.getCurrentTrack()
            if (r0 == 0) goto L_0x0239
            long r7 = r0.f331463a
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r2 = r0
            goto L_0x023a
        L_0x0239:
            r2 = 0
        L_0x023a:
            java.lang.String r0 = "EDIT_VLOG_TRACK_CROP_CHANGE"
            r7 = 0
            boolean r0 = r1.getBoolean(r0, r7)
            if (r0 == 0) goto L_0x025b
            a14.s1 r16 = a14.C0001s1.f0d
            a14.h0 r17 = a14.C53872d1.f151119c
            r18 = 0
            com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$b r19 = new com.tencent.mm.plugin.vlog.ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout$b
            r7 = 0
            r0 = r19
            r1 = r26
            r0.<init>(r1, r2, r3, r5, r7)
            r20 = 2
            r21 = 0
            a14.C53895h.m60466d(r16, r17, r18, r19, r20, r21)
            goto L_0x026f
        L_0x025b:
            lh2.g0 r0 = r10.mo151221j(r9)
            v23.p r0 = (v23.C111367p) r0
            if (r0 == 0) goto L_0x0268
            r0.mo163040z(r3, r5)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0268:
            r0 = 1
            r1 = 0
            m143026x(r10, r1, r0, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x026f:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0273:
            if (r1 == 0) goto L_0x0961
            java.lang.String r0 = "EDIT_VLOG_SELECT_TRACK"
            r2 = -1
            int r0 = r1.getInt(r0, r2)
            java.lang.Class<l23.b0> r1 = l23.C109165b0.class
            lh2.g0 r1 = r10.mo151221j(r1)
            l23.b0 r1 = (l23.C109165b0) r1
            if (r1 == 0) goto L_0x028c
            int r1 = r1.f326861i
            if (r1 != r0) goto L_0x028c
            r1 = 1
            goto L_0x028d
        L_0x028c:
            r1 = 0
        L_0x028d:
            if (r1 != 0) goto L_0x02bc
            if (r0 < 0) goto L_0x02bc
            android.view.ViewGroup r1 = r10.f316953q
            r1.setVisibility(r12)
            android.view.ViewGroup r1 = r10.f316952p
            r1.setVisibility(r12)
            java.lang.Class<l23.b0> r1 = l23.C109165b0.class
            lh2.g0 r1 = r10.mo151221j(r1)
            l23.b0 r1 = (l23.C109165b0) r1
            if (r1 != 0) goto L_0x02a6
            goto L_0x02a8
        L_0x02a6:
            r1.f326861i = r0
        L_0x02a8:
            java.lang.Class<l23.b0> r0 = l23.C109165b0.class
            lh2.g0 r0 = r10.mo151221j(r0)
            l23.b0 r0 = (l23.C109165b0) r0
            if (r0 == 0) goto L_0x02b8
            r1 = 0
            r0.setVisibility(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x02b8:
            r0 = 1
            r10.setSingleTrackPlayRange(r0)
        L_0x02bc:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x02c0:
            if (r1 == 0) goto L_0x0961
            java.lang.String r0 = r1.getString(r3)
            long r1 = r1.getLong(r2)
            lh2.g0 r3 = r10.mo151221j(r8)
            v23.f r3 = (v23.C111348f) r3
            if (r3 == 0) goto L_0x0961
            sp3.k r4 = r3.f333357h
            if (r4 == 0) goto L_0x02f9
            java.util.ArrayList<sp3.c> r4 = r4.f331511l
            if (r4 == 0) goto L_0x02f9
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x02df:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02f9
            java.lang.Object r6 = r4.next()
            int r7 = r5 + 1
            if (r5 < 0) goto L_0x02f4
            sp3.c r6 = (sp3.C110801c) r6
            r3.mo163029x(r0, r1, r5)
            r5 = r7
            goto L_0x02df
        L_0x02f4:
            sx3.C64197v.m75542k()
            r0 = 0
            throw r0
        L_0x02f9:
            sp3.k r2 = r3.f333357h
            if (r2 == 0) goto L_0x0961
            lh2.g0 r0 = r10.mo151221j(r9)
            r1 = r0
            v23.p r1 = (v23.C111367p) r1
            if (r1 == 0) goto L_0x0961
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 14
            r8 = 0
            v23.C111367p.m151846A(r1, r2, r3, r4, r5, r7, r8)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0314:
            if (r1 == 0) goto L_0x0961
            java.lang.String r3 = r1.getString(r3)
            long r5 = r1.getLong(r2)
            int r1 = r1.getInt(r4)
            lh2.g0 r2 = r10.mo151221j(r8)
            v23.f r2 = (v23.C111348f) r2
            if (r2 == 0) goto L_0x0961
            sp3.k r19 = r2.mo163029x(r3, r5, r1)
            if (r19 == 0) goto L_0x0961
            lh2.g0 r2 = r10.mo151221j(r9)
            r18 = r2
            v23.p r18 = (v23.C111367p) r18
            if (r18 == 0) goto L_0x0349
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 14
            r25 = 0
            v23.C111367p.m151846A(r18, r19, r20, r21, r22, r24, r25)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0349:
            lh2.g0 r2 = r10.mo151221j(r8)
            v23.f r2 = (v23.C111348f) r2
            if (r2 == 0) goto L_0x0961
            sp3.k r3 = r2.f333357h
            if (r3 == 0) goto L_0x035e
            java.util.ArrayList<sp3.c> r3 = r3.f331511l
            if (r3 == 0) goto L_0x035e
            int r3 = r3.size()
            goto L_0x035f
        L_0x035e:
            r3 = 0
        L_0x035f:
            int r4 = r1 + 1
            if (r3 <= r4) goto L_0x0383
            sp3.k r2 = r2.f333357h
            gy3.C87412m.m108591d(r2)
            java.util.ArrayList<sp3.c> r2 = r2.f331511l
            java.lang.Object r1 = r2.get(r1)
            sp3.c r1 = (sp3.C110801c) r1
            sp3.h r2 = r1.f331477o
            long r2 = r2.f331495c
            long r4 = r1.f331465c
            long r0 = (long) r0
            long r2 = r2 / r0
            long r4 = r4 - r2
            li3.e r13 = new li3.e
            long r0 = r4 - r16
            long r4 = r4 + r16
            r13.<init>(r0, r4)
            goto L_0x0384
        L_0x0383:
            r13 = 0
        L_0x0384:
            if (r13 == 0) goto L_0x0961
            lh2.g0 r0 = r10.mo151221j(r9)
            v23.p r0 = (v23.C111367p) r0
            if (r0 == 0) goto L_0x0961
            long r1 = r13.f291673a
            long r3 = r13.f291674b
            r0.mo163040z(r1, r3)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0399:
            lh2.g0 r0 = r10.mo151221j(r8)
            v23.f r0 = (v23.C111348f) r0
            if (r0 == 0) goto L_0x0961
            sp3.k r0 = r0.f333357h
            if (r0 == 0) goto L_0x0961
            java.util.ArrayList<sp3.c> r0 = r0.f331511l
            if (r0 == 0) goto L_0x0961
            lh2.g0 r1 = r10.mo151221j(r7)
            l23.t0 r1 = (l23.C109232t0) r1
            if (r1 == 0) goto L_0x0961
            int r2 = r0.size()
            int r2 = r2 + -1
            java.util.List r0 = sx3.C110818d0.m150948t0(r0, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = sx3.C36907w.m41090l(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x03ca:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x03e9
            java.lang.Object r3 = r0.next()
            sp3.c r3 = (sp3.C110801c) r3
            sp3.h r3 = r3.f331477o
            long r3 = r3.f331495c
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x03e0
            r3 = 1
            goto L_0x03e1
        L_0x03e0:
            r3 = 0
        L_0x03e1:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r2.add(r3)
            goto L_0x03ca
        L_0x03e9:
            r1.mo160475y(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x03f0:
            java.lang.Class<l23.b0> r0 = l23.C109165b0.class
            lh2.g0 r0 = r10.mo151221j(r0)
            l23.b0 r0 = (l23.C109165b0) r0
            if (r0 == 0) goto L_0x03fd
            int r0 = r0.f326861i
            goto L_0x03fe
        L_0x03fd:
            r0 = -1
        L_0x03fe:
            if (r0 < 0) goto L_0x0402
            r0 = 1
            goto L_0x0403
        L_0x0402:
            r0 = 0
        L_0x0403:
            if (r0 == 0) goto L_0x0432
            sp3.c r0 = r26.getCurrentTrack()
            if (r0 == 0) goto L_0x046d
            li3.e r0 = r26.getCurrentTrackPlayRange()
            if (r0 == 0) goto L_0x046d
            lh2.g0 r1 = r10.mo151221j(r9)
            v23.p r1 = (v23.C111367p) r1
            if (r1 == 0) goto L_0x0422
            long r2 = r0.f291673a
            long r4 = r0.f291674b
            r1.mo163040z(r2, r4)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0422:
            lh2.g0 r1 = r10.mo151221j(r9)
            v23.p r1 = (v23.C111367p) r1
            if (r1 == 0) goto L_0x046d
            long r2 = r0.f291673a
            r1.mo163039y(r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x046d
        L_0x0432:
            lh2.g0 r0 = r10.mo151221j(r8)
            v23.f r0 = (v23.C111348f) r0
            if (r0 == 0) goto L_0x046d
            sp3.k r0 = r0.f333357h
            if (r0 == 0) goto L_0x046d
            lh2.g0 r1 = r10.mo151221j(r9)
            v23.p r1 = (v23.C111367p) r1
            if (r1 == 0) goto L_0x044f
            long r2 = r0.mo162389l()
            r1.mo163040z(r13, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x044f:
            lh2.g0 r0 = r10.mo151221j(r5)
            r23.a r0 = (r23.C110496a) r0
            if (r0 == 0) goto L_0x0466
            long r0 = r0.f330407n
            lh2.g0 r2 = r10.mo151221j(r9)
            v23.p r2 = (v23.C111367p) r2
            if (r2 == 0) goto L_0x0466
            r2.mo163039y(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0466:
            r0 = 1
            r1 = 0
            m143026x(r10, r1, r0, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x046d:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0471:
            if (r1 == 0) goto L_0x0961
            int r1 = r1.getInt(r4)
            lh2.g0 r2 = r10.mo151221j(r8)
            v23.f r2 = (v23.C111348f) r2
            if (r2 == 0) goto L_0x0961
            sp3.k r2 = r2.f333357h
            if (r2 == 0) goto L_0x0961
            java.util.ArrayList<sp3.c> r3 = r2.f331511l
            java.lang.Object r3 = r3.get(r1)
            sp3.c r3 = (sp3.C110801c) r3
            java.util.ArrayList<sp3.c> r4 = r2.f331511l
            int r6 = r1 + 1
            java.lang.Object r4 = r4.get(r6)
            sp3.c r4 = (sp3.C110801c) r4
            long r6 = r3.f331465c
            sp3.h r3 = r4.f331477o
            long r11 = r3.f331495c
            long r13 = (long) r0
            long r11 = r11 / r13
            long r6 = r6 - r11
            long r11 = r6 - r16
            r13 = 0
            long r11 = java.lang.Math.max(r13, r11)
            long r2 = r2.mo162384g()
            long r6 = r6 + r16
            long r2 = java.lang.Math.min(r2, r6)
            lh2.g0 r0 = r10.mo151221j(r9)
            v23.p r0 = (v23.C111367p) r0
            if (r0 == 0) goto L_0x04bd
            r0.mo163040z(r11, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x04bd:
            lh2.g0 r0 = r10.mo151221j(r9)
            v23.p r0 = (v23.C111367p) r0
            if (r0 == 0) goto L_0x04ca
            r0.mo163039y(r11)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x04ca:
            lh2.g0 r0 = r10.mo151221j(r5)
            r23.a r0 = (r23.C110496a) r0
            if (r0 != 0) goto L_0x04d3
            goto L_0x04d5
        L_0x04d3:
            r0.f330407n = r11
        L_0x04d5:
            lh2.g0 r0 = r10.mo151221j(r5)
            r23.a r0 = (r23.C110496a) r0
            if (r0 == 0) goto L_0x0961
            sp3.h r2 = r4.f331477o
            java.lang.String r2 = r2.f331493a
            r0.mo161964D(r1, r2)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x04e8:
            java.lang.Class<v23.x> r0 = v23.C111379x.class
            lh2.g0 r0 = r10.mo151221j(r0)
            v23.x r0 = (v23.C111379x) r0
            if (r0 == 0) goto L_0x04f7
            r0.mo163044x()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x04f7:
            android.content.Context r0 = r26.getContext()
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            gy3.C87412m.m108592e(r0, r1)
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            lh2.g0 r0 = r10.mo151221j(r9)
            v23.p r0 = (v23.C111367p) r0
            if (r0 == 0) goto L_0x0523
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r13 = r0.f333403f
            goto L_0x0524
        L_0x0523:
            r13 = 0
        L_0x0524:
            if (r13 != 0) goto L_0x0527
            goto L_0x052a
        L_0x0527:
            r13.setAlpha(r1)
        L_0x052a:
            lh2.g0 r0 = r10.mo151221j(r8)
            v23.f r0 = (v23.C111348f) r0
            if (r0 == 0) goto L_0x0961
            sp3.k r0 = r0.f333357h
            if (r0 == 0) goto L_0x0961
            lh2.g0 r0 = r10.mo151221j(r2)
            l23.y0 r0 = (l23.C109245y0) r0
            if (r0 == 0) goto L_0x0543
            r0.getClass()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0543:
            lh2.g0 r0 = r10.mo151221j(r2)
            l23.y0 r0 = (l23.C109245y0) r0
            if (r0 == 0) goto L_0x0961
            d23.a r0 = d23.C106976a.f320208a
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0551:
            java.lang.Class<v23.n> r0 = v23.C111363n.class
            lh2.g0 r0 = r10.mo151221j(r0)
            v23.n r0 = (v23.C111363n) r0
            if (r0 != 0) goto L_0x055d
            goto L_0x0961
        L_0x055d:
            r0 = 0
            throw r0
        L_0x055f:
            if (r1 == 0) goto L_0x0569
            r0 = 0
            r2 = r16
            boolean r0 = r1.getBoolean(r2, r0)
            goto L_0x056a
        L_0x0569:
            r0 = 0
        L_0x056a:
            lh2.g0 r1 = r10.mo151221j(r8)
            v23.f r1 = (v23.C111348f) r1
            if (r1 == 0) goto L_0x05fd
            sp3.k r1 = r1.f333357h
            if (r1 == 0) goto L_0x05fd
            d23.a$b r2 = d23.C106976a.f320213f
            if (r2 == 0) goto L_0x05bf
            if (r0 == 0) goto L_0x059e
            rr3.m r3 = r2.f320221a
            if (r3 != 0) goto L_0x059e
            com.tencent.mm.xeffect.effect.EffectManager r3 = d23.C106976a.f320215h
            if (r3 == 0) goto L_0x058b
            rr3.i r4 = rr3.C110632i.ImageEnhanceEffect
            rr3.c0 r3 = r3.mo154927g(r4)
            goto L_0x058c
        L_0x058b:
            r3 = 0
        L_0x058c:
            com.tencent.mm.xeffect.effect.EffectManager r4 = d23.C106976a.f320215h
            if (r4 == 0) goto L_0x0593
            r4.mo154923c(r3)
        L_0x0593:
            boolean r4 = r3 instanceof rr3.C110636m
            if (r4 == 0) goto L_0x059a
            rr3.m r3 = (rr3.C110636m) r3
            goto L_0x059b
        L_0x059a:
            r3 = 0
        L_0x059b:
            r2.f320221a = r3
            goto L_0x05b0
        L_0x059e:
            if (r0 != 0) goto L_0x05b0
            rr3.m r3 = r2.f320221a
            if (r3 == 0) goto L_0x05b0
            com.tencent.mm.xeffect.effect.EffectManager r4 = d23.C106976a.f320215h
            if (r4 == 0) goto L_0x05ad
            long r5 = r3.f330967a
            r4.mo154934n(r5)
        L_0x05ad:
            r3 = 0
            r2.f320221a = r3
        L_0x05b0:
            if (r0 == 0) goto L_0x05bf
            n23.b r2 = n23.C109676b.f328306a
            r2.mo160900a()
            d23.f r2 = new d23.f
            r2.<init>(r1)
            r1.mo162380a(r2)
        L_0x05bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "setVideoEnhancement enable:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ", effectId:"
            r1.append(r0)
            d23.a$b r0 = d23.C106976a.f320213f
            if (r0 == 0) goto L_0x05de
            long r2 = r0.mo157411a()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x05df
        L_0x05de:
            r0 = 0
        L_0x05df:
            r1.append(r0)
            java.lang.String r0 = ", rangeId:"
            r1.append(r0)
            d23.a$b r0 = d23.C106976a.f320213f
            if (r0 == 0) goto L_0x05ee
            rr3.m r13 = r0.f320221a
            goto L_0x05ef
        L_0x05ee:
            r13 = 0
        L_0x05ef:
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.LocalEffectManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x05fd:
            lh2.g0 r0 = r10.mo151221j(r9)
            v23.p r0 = (v23.C111367p) r0
            if (r0 == 0) goto L_0x0961
            com.tencent.mm.videocomposition.play.VideoCompositionPlayView r0 = r0.f333403f
            r0.mo154755e()
        L_0x060a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x060e:
            android.view.ViewGroup r0 = r10.f316953q
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0674
            java.lang.Class<l23.b0> r0 = l23.C109165b0.class
            lh2.g0 r0 = r10.mo151221j(r0)
            l23.b0 r0 = (l23.C109165b0) r0
            if (r0 != 0) goto L_0x0621
            goto L_0x0624
        L_0x0621:
            r1 = -1
            r0.f326861i = r1
        L_0x0624:
            java.lang.Class<l23.b0> r0 = l23.C109165b0.class
            lh2.g0 r0 = r10.mo151221j(r0)
            l23.b0 r0 = (l23.C109165b0) r0
            if (r0 == 0) goto L_0x0633
            r0.setVisibility(r12)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0633:
            android.view.ViewGroup r0 = r10.f316953q
            r1 = 0
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r10.f316952p
            r0.setVisibility(r1)
            lh2.g0 r0 = r10.mo151221j(r8)
            v23.f r0 = (v23.C111348f) r0
            if (r0 == 0) goto L_0x0674
            sp3.k r0 = r0.f333357h
            if (r0 == 0) goto L_0x0674
            lh2.g0 r1 = r10.mo151221j(r9)
            v23.p r1 = (v23.C111367p) r1
            if (r1 == 0) goto L_0x065f
            long r2 = r0.mo162388k()
            long r4 = r0.mo162386i()
            r1.mo163040z(r2, r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x065f:
            lh2.g0 r0 = r10.mo151221j(r7)
            r16 = r0
            l23.t0 r16 = (l23.C109232t0) r16
            if (r16 == 0) goto L_0x0674
            r17 = -1
            r18 = 0
            r20 = 0
            r16.mo160474x(r17, r18, r20)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0674:
            lh2.g0 r0 = r10.mo151221j(r6)
            l23.g0 r0 = (l23.C109190g0) r0
            if (r0 == 0) goto L_0x0683
            boolean r0 = r0.f326926j
            r1 = 1
            if (r0 != r1) goto L_0x0684
            r0 = 1
            goto L_0x0685
        L_0x0683:
            r1 = 1
        L_0x0684:
            r0 = 0
        L_0x0685:
            if (r0 == 0) goto L_0x068b
            r0 = 0
            m143026x(r10, r0, r1, r0)
        L_0x068b:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x068f:
            r26.mo152373n()
            lh2.g0 r0 = r10.mo151221j(r6)
            l23.g0 r0 = (l23.C109190g0) r0
            if (r0 == 0) goto L_0x069f
            r0.mo160429A()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x069f:
            lh2.g0 r0 = r10.mo151221j(r8)
            v23.f r0 = (v23.C111348f) r0
            if (r0 == 0) goto L_0x0961
            sp3.k r12 = r0.mo163030y()
            if (r12 == 0) goto L_0x0961
            lh2.g0 r0 = r10.mo151221j(r8)
            v23.f r0 = (v23.C111348f) r0
            if (r0 == 0) goto L_0x06bc
            com.tencent.mm.timelineedit.TimelineEditor r0 = r0.f333356g
            r0.mo153352w()
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x06bc:
            long r0 = r10.f316957u
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x06d4
            lh2.g0 r0 = r10.mo151221j(r3)
            v23.a r0 = (v23.C111333a) r0
            if (r0 == 0) goto L_0x06e4
            long r1 = r10.f316957u
            r0.mo163022z(r12, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x06e4
        L_0x06d4:
            lh2.g0 r0 = r10.mo151221j(r3)
            v23.a r0 = (v23.C111333a) r0
            if (r0 == 0) goto L_0x06e4
            r1 = 60000(0xea60, double:2.9644E-319)
            r0.mo163022z(r12, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x06e4:
            lh2.g0 r0 = r10.mo151221j(r9)
            r11 = r0
            v23.p r11 = (v23.C111367p) r11
            if (r11 == 0) goto L_0x0961
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 14
            r18 = 0
            v23.C111367p.m151846A(r11, r12, r13, r14, r15, r17, r18)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x06fc:
            if (r1 == 0) goto L_0x072a
            r26.mo152382t()
            java.lang.String r0 = "PARAM_EDIT_TEXT_CONTENT"
            java.lang.CharSequence r0 = r1.getCharSequence(r0)
            java.lang.String r2 = "PARAM_EDIT_TEXT_COLOR"
            int r2 = r1.getInt(r2)
            java.lang.String r3 = "PARAM_EDIT_TEXT_COLOR_BG_INT"
            int r3 = r1.getInt(r3)
            java.lang.String r4 = "PARAM_EDIT_TEXT_FONT"
            java.lang.String r1 = r1.getString(r4)
            java.lang.Class<lh2.i> r4 = lh2.C109348i.class
            lh2.g0 r4 = r10.mo151221j(r4)
            lh2.i r4 = (lh2.C109348i) r4
            if (r4 == 0) goto L_0x0728
            r4.mo160546x(r0, r2, r3, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0728:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x072a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x072e:
            r26.mo152373n()
            r26.mo152382t()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0738:
            r26.mo78564e()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x073f:
            r26.mo152373n()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0746:
            if (r1 == 0) goto L_0x07d7
            java.lang.String r2 = "EDIT_TRACK_DURATION_SCALE"
            r3 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1.getFloat(r2, r3)
            sp3.c r2 = r26.getCurrentTrack()
            if (r2 == 0) goto L_0x075d
            long r2 = r2.f331463a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x075e
        L_0x075d:
            r2 = 0
        L_0x075e:
            lh2.g0 r3 = r10.mo151221j(r8)
            v23.f r3 = (v23.C111348f) r3
            if (r3 == 0) goto L_0x07aa
            if (r2 == 0) goto L_0x07a3
            r2.longValue()
            sp3.k r4 = r3.f333357h
            if (r4 == 0) goto L_0x07a3
            java.util.ArrayList<sp3.c> r4 = r4.f331511l
            if (r4 == 0) goto L_0x07a3
            java.util.Iterator r4 = r4.iterator()
        L_0x0777:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x07a3
            java.lang.Object r5 = r4.next()
            sp3.c r5 = (sp3.C110801c) r5
            long r11 = r5.f331463a
            long r13 = r2.longValue()
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0777
            r11 = 0
            float r11 = (float) r11
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0795
            r5.f331468f = r1
        L_0x0795:
            com.tencent.mm.timelineedit.TimelineEditor r11 = r3.f333356g
            li3.f r5 = li3.C109385a.m148548c(r5)
            sp3.k r5 = r11.mo153353x(r5)
            r3.mo163025A(r5)
            goto L_0x0777
        L_0x07a3:
            r3.mo163027C()
            sp3.k r13 = r3.f333357h
            r15 = r13
            goto L_0x07ab
        L_0x07aa:
            r15 = 0
        L_0x07ab:
            lh2.g0 r1 = r10.mo151221j(r9)
            r14 = r1
            v23.p r14 = (v23.C111367p) r14
            if (r14 == 0) goto L_0x07d1
            lh2.g0 r1 = r10.mo151221j(r6)
            l23.g0 r1 = (l23.C109190g0) r1
            if (r1 == 0) goto L_0x07c1
            boolean r1 = r1.f326925i
            r16 = r1
            goto L_0x07c4
        L_0x07c1:
            r1 = 0
            r16 = 0
        L_0x07c4:
            r17 = 0
            r18 = 0
            r20 = 8
            r21 = 0
            v23.C111367p.m151846A(r14, r15, r16, r17, r18, r20, r21)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x07d1:
            r1 = 1
            r10.setSingleTrackPlayRange(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x07d7:
            qh2.e$b r1 = qh2.C101198e.C101199b.EDIT_TRACK_DURATION_SCALE_FINISH
            if (r0 != r1) goto L_0x0811
            lh2.g0 r0 = r10.mo151221j(r8)
            v23.f r0 = (v23.C111348f) r0
            if (r0 == 0) goto L_0x0811
            sp3.k r0 = r0.f333357h
            if (r0 == 0) goto L_0x0811
            lh2.g0 r1 = r10.mo151221j(r7)
            r11 = r1
            l23.t0 r11 = (l23.C109232t0) r11
            if (r11 == 0) goto L_0x0800
            com.tencent.mm.plugin.vlog.model.p0 r12 = x23.C102552a.m135387a(r0)
            r13 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            l23.C109202j.C109205d.C109206a.m148291a(r11, r12, r13, r15, r16, r17)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0800:
            lh2.g0 r0 = r10.mo151221j(r7)
            l23.t0 r0 = (l23.C109232t0) r0
            if (r0 == 0) goto L_0x0811
            com.tencent.mm.plugin.vlog.ui.widget.VLogThumbView r0 = r0.f327035h
            if (r0 == 0) goto L_0x0811
            r1 = 1
            r0.f317028o = r1
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0811:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0815:
            if (r1 == 0) goto L_0x088e
            java.lang.String r0 = "EDIT_CROP_VLOG_LENGTH_START_TIME_LONG"
            long r2 = r1.getLong(r0)
            java.lang.String r0 = "EDIT_CROP_VLOG_LENGTH_END_TIME_LONG"
            long r4 = r1.getLong(r0)
            java.lang.String r0 = "EDIT_CROP_VLOG_SEEKTIME_LONG"
            long r6 = r1.getLong(r0)
            java.lang.String r0 = "EDIT_CROP_VLOG_ON_UP_BOOLEAN"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x0837
            r0 = 1
            r1 = 0
            m143026x(r10, r1, r0, r1)
            goto L_0x087f
        L_0x0837:
            r26.mo152382t()
            lh2.g0 r0 = r10.mo151221j(r9)
            v23.p r0 = (v23.C111367p) r0
            if (r0 == 0) goto L_0x0847
            r0.mo163039y(r6)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0847:
            java.lang.Class<q23.a> r0 = q23.C110351a.class
            lh2.g0 r0 = r10.mo151221j(r0)
            q23.a r0 = (q23.C110351a) r0
            if (r0 == 0) goto L_0x0858
            com.tencent.mm.plugin.vlog.ui.plugin.timeedit.TimeEditorItemContainer r0 = r0.f330093f
            java.util.List r13 = r0.getAllTTSData()
            goto L_0x0859
        L_0x0858:
            r13 = 0
        L_0x0859:
            lh2.g0 r0 = r10.mo151221j(r8)
            v23.f r0 = (v23.C111348f) r0
            if (r0 == 0) goto L_0x087f
            sp3.k r15 = r0.mo163028D(r13)
            if (r15 == 0) goto L_0x087f
            lh2.g0 r0 = r10.mo151221j(r9)
            r14 = r0
            v23.p r14 = (v23.C111367p) r14
            if (r14 == 0) goto L_0x087f
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 14
            r21 = 0
            v23.C111367p.m151846A(r14, r15, r16, r17, r18, r20, r21)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x087f:
            lh2.g0 r0 = r10.mo151221j(r9)
            v23.p r0 = (v23.C111367p) r0
            if (r0 == 0) goto L_0x088c
            r0.mo163040z(r2, r4)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x088c:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x088e:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0892:
            sp3.c r0 = r26.getCurrentTrack()
            if (r0 == 0) goto L_0x0961
            lh2.g0 r1 = r10.mo151221j(r4)
            l23.q0 r1 = (l23.C109219q0) r1
            if (r1 == 0) goto L_0x08a7
            float r0 = r0.f331468f
            r1.mo160471y(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x08a7:
            lh2.g0 r0 = r10.mo151221j(r4)
            l23.q0 r0 = (l23.C109219q0) r0
            if (r0 == 0) goto L_0x0961
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder r0 = r0.f327007f
            if (r0 == 0) goto L_0x0961
            r1 = 1
            r0.setShow(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x08bb:
            lh2.g0 r0 = r10.mo151221j(r9)
            v23.p r0 = (v23.C111367p) r0
            if (r0 == 0) goto L_0x08ca
            r1 = 0
            r0.mo163039y(r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x08ca:
            r0 = 1
            r1 = 0
            m143026x(r10, r1, r0, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x08d3:
            r2 = r14
            if (r1 == 0) goto L_0x08dc
            r0 = 0
            boolean r0 = r1.getBoolean(r2, r0)
            goto L_0x08dd
        L_0x08dc:
            r0 = 0
        L_0x08dd:
            if (r0 != 0) goto L_0x08f5
            if (r0 != 0) goto L_0x08fa
            lh2.g0 r0 = r10.mo151221j(r6)
            l23.g0 r0 = (l23.C109190g0) r0
            if (r0 == 0) goto L_0x08f0
            boolean r0 = r0.f326926j
            r1 = 1
            if (r0 != r1) goto L_0x08f1
            r0 = 1
            goto L_0x08f2
        L_0x08f0:
            r1 = 1
        L_0x08f1:
            r0 = 0
        L_0x08f2:
            if (r0 == 0) goto L_0x08fa
            goto L_0x08f6
        L_0x08f5:
            r1 = 1
        L_0x08f6:
            r0 = 0
            m143026x(r10, r0, r1, r0)
        L_0x08fa:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x08fd:
            r26.mo152382t()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0903:
            if (r1 == 0) goto L_0x0961
            java.lang.String r0 = "PARAM_EDIT_ORIGIN_VOICE_MUTE_BOOLEAN"
            boolean r0 = r1.getBoolean(r0)
            lh2.g0 r1 = r10.mo151221j(r8)
            v23.f r1 = (v23.C111348f) r1
            if (r1 == 0) goto L_0x0916
            r1.mo163026B(r0)
        L_0x0916:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x0919:
            r26.mo152384y()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x091f:
            r26.mo152384y()
            r0 = 1
            r1 = 0
            m143026x(r10, r1, r0, r1)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x092a:
            java.lang.Class<lh2.i> r0 = lh2.C109348i.class
            lh2.g0 r0 = r10.mo151221j(r0)
            lh2.i r0 = (lh2.C109348i) r0
            if (r0 == 0) goto L_0x0961
            android.widget.ImageView r0 = r0.f327360h
            r0.performClick()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x093c:
            java.lang.Class<lh2.e> r0 = lh2.C99426e.class
            lh2.g0 r0 = r10.mo151221j(r0)
            lh2.e r0 = (lh2.C99426e) r0
            if (r0 == 0) goto L_0x0961
            r0.mo138867z()
            rx3.b0 r0 = rx3.C13598b0.f38549a
            goto L_0x0961
        L_0x094c:
            if (r1 == 0) goto L_0x0961
            java.lang.String r0 = "PARAM_1_LONG"
            long r0 = r1.getLong(r0)
            lh2.g0 r2 = r10.mo151221j(r9)
            v23.p r2 = (v23.C111367p) r2
            if (r2 == 0) goto L_0x0961
            r2.mo163039y(r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0961:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.vlog.p117ui.timelineeditor.scene.TimelineEditorBaseVideoPluginLayout.mo14585p(qh2.e$b, android.os.Bundle):void");
    }

    /* renamed from: q */
    public void mo152375q(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        Bundle bundle = recordConfigProvider.f272912M;
        if (bundle != null) {
            bundle.getBoolean("KEY_DISABLE_VIDEO_ENHANCEMENT", false);
            C109245y0 y0Var = (C109245y0) mo151221j(C109245y0.class);
            if (y0Var != null) {
                C106976a aVar2 = C106976a.f320208a;
                y0Var.f327073i.setVisibility(8);
            }
        }
    }

    /* renamed from: r */
    public String mo152376r() {
        return "MicroMsg.TimelineEditorVideoPluginLayout";
    }

    public void release() {
        super.release();
        C106976a.f320208a.mo157410n();
    }

    public void reset() {
        super.reset();
        this.f316953q.setVisibility(0);
        this.f316952p.setVisibility(0);
    }

    public final void setCaptureInfo(C98324b bVar) {
        this.f316950n = bVar;
    }

    public final void setConfigProvider(RecordConfigProvider recordConfigProvider) {
        this.f316948i = recordConfigProvider;
    }

    public final void setEditId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f316954r = str;
    }

    public final void setMaxCropVideoDurationMs(long j) {
        this.f316956t = j;
    }

    public final void setMediaMute(boolean z) {
        this.f316955s = z;
    }

    /* renamed from: t */
    public final void mo152382t() {
        C109190g0 g0Var = (C109190g0) mo151221j(C109190g0.class);
        if (g0Var != null) {
            g0Var.mo160433z();
        }
        C111367p pVar = (C111367p) mo151221j(C111367p.class);
        if (pVar != null) {
            pVar.f333403f.pause();
        }
        C108531a aVar = (C108531a) mo151221j(C108531a.class);
        if (aVar != null) {
            aVar.mo159382B();
        }
    }

    /* renamed from: w */
    public final void mo152383w(Long l) {
        C111367p pVar;
        Class cls = C111367p.class;
        C109190g0 g0Var = (C109190g0) mo151221j(C109190g0.class);
        if (g0Var != null) {
            g0Var.mo160429A();
        }
        C111367p pVar2 = (C111367p) mo151221j(cls);
        if (pVar2 != null) {
            pVar2.f333403f.mo154761h();
        }
        C108531a aVar = (C108531a) mo151221j(C108531a.class);
        if (aVar != null) {
            aVar.mo159385E();
        }
        if (l != null && (pVar = (C111367p) mo151221j(cls)) != null) {
            pVar.mo163039y(l.longValue());
        }
    }

    /* renamed from: y */
    public final void mo152384y() {
        this.f316951o.setVisibility(0);
        this.f316951o.animate().cancel();
        this.f316951o.animate().alpha(1.0f).setDuration(100).start();
    }
}
