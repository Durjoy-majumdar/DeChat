package com.tencent.p014mm.plugin.recordvideo.plugin.parent;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C75054z4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import e80.C107254b;
import e80.C107256d;
import e80.C107257e;
import e80.C107258f;
import e80.C107259g;
import e80.C107260h;
import fh2.C97884j;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h90.C98324b;
import hi2.C98453h;
import i21.C60242i;
import i80.C108402e;
import j20.C117292a;
import java.util.ArrayList;
import k21.C60960c;
import kotlin.Metadata;
import kotlin.ResultKt;
import lh2.C109337b;
import lh2.C109360o0;
import lh2.C99466t0;
import lh2.C99471w0;
import lh2.C99473x0;
import o40.C61926c;
import p447aw.C103918d;
import p625nu.C61901d;
import p80.C110194c;
import qh2.C101198e;
import qh2.C110398c;
import rh2.C110563b;
import rx3.C13598b0;
import th2.C101891f;
import th2.C110992d;
import ug2.C102031b;
import v70.C111387b;
import wg2.C102440a;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001b\u0012\u0006\u0010L\u001a\u00020K\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0004\bO\u0010PJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0014J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0004X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0004X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010 \u001a\u0004\u0018\u00010\u00198\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0004X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010,\u001a\u00020'8\u0004X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0004X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R$\u0010:\u001a\u0004\u0018\u0001038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010B\u001a\u0004\u0018\u00010;8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006Q"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/RecordCheckAudioPermissionPluginLayout;", "Lqh2/e;", "Landroidx/lifecycle/s;", "Lnu/d$a;", "Lv70/b;", "", "visible", "Lrx3/b0;", "setPluginVisibility", "getLayoutId", "Landroidx/lifecycle/j;", "getLifecycle", "Lrh2/b;", "p", "Lrh2/b;", "getRecorder", "()Lrh2/b;", "recorder", "Li80/e;", "q", "Li80/e;", "getCameraUsage", "()Li80/e;", "cameraUsage", "Llh2/b;", "r", "Llh2/b;", "getRecordPlugin", "()Llh2/b;", "setRecordPlugin", "(Llh2/b;)V", "recordPlugin", "Llh2/x0;", "s", "Llh2/x0;", "getCameraSwitchPlugin", "()Llh2/x0;", "cameraSwitchPlugin", "Llh2/t0;", "t", "Llh2/t0;", "getClosePlugin", "()Llh2/t0;", "closePlugin", "Llh2/w0;", "u", "Llh2/w0;", "getOrientationPlugin", "()Llh2/w0;", "orientationPlugin", "Lwg2/a;", "v", "Lwg2/a;", "getNavigator", "()Lwg2/a;", "setNavigator", "(Lwg2/a;)V", "navigator", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "w", "Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "getConfigProvider", "()Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;", "setConfigProvider", "(Lcom/tencent/mm/plugin/recordvideo/jumper/RecordConfigProvider;)V", "configProvider", "", "x", "Z", "getEnableLandscape", "()Z", "setEnableLandscape", "(Z)V", "enableLandscape", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout */
public class CameraKitPluginLayout extends RecordCheckAudioPermissionPluginLayout implements C0125s, C61901d.C61902a, C111387b {

    /* renamed from: o */
    public final C103766u f315317o = new C103766u(this);

    /* renamed from: p */
    public final C110563b f315318p = new C110563b(false, 1, (C8480h) null);

    /* renamed from: q */
    public final C108402e f315319q;

    /* renamed from: r */
    public C109337b f315320r;

    /* renamed from: s */
    public final C99473x0 f315321s;

    /* renamed from: t */
    public final C99466t0 f315322t;

    /* renamed from: u */
    public final C99471w0 f315323u;

    /* renamed from: v */
    public C102440a f315324v;

    /* renamed from: w */
    public RecordConfigProvider f315325w;

    /* renamed from: x */
    public boolean f315326x;

    /* renamed from: y */
    public VideoTransPara f315327y;

    /* renamed from: z */
    public long f315328z;

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$a */
    public static final class C105950a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ CameraKitPluginLayout f315329d;

        /* renamed from: e */
        public final /* synthetic */ int f315330e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105950a(CameraKitPluginLayout cameraKitPluginLayout, int i) {
            super(0);
            this.f315329d = cameraKitPluginLayout;
            this.f315330e = i;
        }

        public Object invoke() {
            this.f315329d.getCameraSwitchPlugin().mo138906b((float) (this.f315329d.getEnableLandscape() ? 0 : this.f315330e));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$statusChange$1", mo125469f = "CameraKitPluginLayout.kt", mo125470l = {204, 221, 225, 232, 244}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$b */
    public static final class C105951b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f315331d;

        /* renamed from: e */
        public int f315332e;

        /* renamed from: f */
        public final /* synthetic */ C101198e.C101199b f315333f;

        /* renamed from: g */
        public final /* synthetic */ CameraKitPluginLayout f315334g;

        /* renamed from: h */
        public final /* synthetic */ Bundle f315335h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$statusChange$1$1", mo125469f = "CameraKitPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$b$a */
        public static final class C105952a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ CameraKitPluginLayout f315336d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C105952a(CameraKitPluginLayout cameraKitPluginLayout, C15601d<? super C105952a> dVar) {
                super(2, dVar);
                this.f315336d = cameraKitPluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C105952a(this.f315336d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C105952a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f315336d.getClosePlugin().setVisibility(4);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$statusChange$1$2", mo125469f = "CameraKitPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$b$b */
        public static final class C105953b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ CameraKitPluginLayout f315337d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C105953b(CameraKitPluginLayout cameraKitPluginLayout, C15601d<? super C105953b> dVar) {
                super(2, dVar);
                this.f315337d = cameraKitPluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C105953b(this.f315337d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C105953b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f315337d.getClosePlugin().setVisibility(0);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$statusChange$1$3", mo125469f = "CameraKitPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$b$c */
        public static final class C105954c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ CameraKitPluginLayout f315338d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C105954c(CameraKitPluginLayout cameraKitPluginLayout, C15601d<? super C105954c> dVar) {
                super(2, dVar);
                this.f315338d = cameraKitPluginLayout;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C105954c(this.f315338d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C105954c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C109337b recordPlugin = this.f315338d.getRecordPlugin();
                if (recordPlugin != null) {
                    recordPlugin.reset();
                }
                C109337b recordPlugin2 = this.f315338d.getRecordPlugin();
                if (recordPlugin2 == null) {
                    return null;
                }
                recordPlugin2.mo160529d();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105951b(C101198e.C101199b bVar, CameraKitPluginLayout cameraKitPluginLayout, Bundle bundle, C15601d<? super C105951b> dVar) {
            super(2, dVar);
            this.f315333f = bVar;
            this.f315334g = cameraKitPluginLayout;
            this.f315335h = bundle;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105951b(this.f315333f, this.f315334g, this.f315335h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105951b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x0118 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x012d  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0174  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x017f  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0189  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r12.f315332e
                r2 = 2
                r3 = 0
                r4 = 1
                java.lang.String r5 = "MicroMsg.CameraKitPluginLayout"
                r6 = 4
                r7 = 0
                r8 = 5
                r9 = 3
                if (r1 == 0) goto L_0x003c
                if (r1 == r4) goto L_0x0037
                if (r1 == r2) goto L_0x0032
                if (r1 == r9) goto L_0x002b
                if (r1 == r6) goto L_0x0026
                if (r1 != r8) goto L_0x001e
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x01da
            L_0x001e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0026:
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0141
            L_0x002b:
                long r3 = r12.f315331d
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x00d7
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x00c2
            L_0x0037:
                kotlin.ResultKt.throwOnFailure(r13)
                goto L_0x0159
            L_0x003c:
                kotlin.ResultKt.throwOnFailure(r13)
                qh2.e$b r13 = r12.f315333f
                int r13 = r13.ordinal()
                if (r13 == r4) goto L_0x01bd
                if (r13 == r2) goto L_0x01b3
                if (r13 == r9) goto L_0x019f
                if (r13 == r8) goto L_0x0145
                r1 = 6
                java.lang.String r3 = "KEY_MEDIA_SOURCE_INT"
                if (r13 == r1) goto L_0x008f
                r1 = 14
                if (r13 == r1) goto L_0x006f
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r0 = "unknown status "
                r13.append(r0)
                qh2.e$b r0 = r12.f315333f
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
                goto L_0x01da
            L_0x006f:
                th2.d r13 = th2.C110992d.f332425a
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r1 = r12.f315334g
                lh2.x0 r1 = r1.getCameraSwitchPlugin()
                boolean r1 = r1.f291651h
                if (r1 == 0) goto L_0x007c
                r2 = 1
            L_0x007c:
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r2)
                r13.mo162677k(r3, r1)
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r13 = r12.f315334g
                r12.f315332e = r8
                java.lang.Object r13 = com.tencent.p014mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout.m142487q(r13, r12)
                if (r13 != r0) goto L_0x01da
                return r0
            L_0x008f:
                th2.f r13 = th2.C101891f.f300035a
                long r10 = android.os.SystemClock.elapsedRealtime()
                r13.mo141376j(r10)
                th2.d r13 = th2.C110992d.f332425a
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r1 = r12.f315334g
                lh2.x0 r1 = r1.getCameraSwitchPlugin()
                boolean r1 = r1.f291651h
                if (r1 == 0) goto L_0x00a5
                goto L_0x00a6
            L_0x00a5:
                r4 = 2
            L_0x00a6:
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r4)
                r13.mo162677k(r3, r1)
                a14.h0 r13 = a14.C53872d1.f151117a
                a14.k2 r13 = f14.C58901s.f168555a
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$b$b r1 = new com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$b$b
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r3 = r12.f315334g
                r1.<init>(r3, r7)
                r12.f315332e = r2
                java.lang.Object r13 = a14.C53895h.m60469g(r13, r1, r12)
                if (r13 != r0) goto L_0x00c2
                return r0
            L_0x00c2:
                long r3 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r13 = r12.f315334g
                rh2.b r13 = r13.getRecorder()
                r12.f315331d = r3
                r12.f315332e = r9
                java.lang.Object r13 = r13.mo162060l(r12)
                if (r13 != r0) goto L_0x00d7
                return r0
            L_0x00d7:
                rx3.l r13 = (rx3.C13604l) r13
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r8 = "stopRecord result:"
                r1.append(r8)
                A r8 = r13.f38555d
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                r1.append(r8)
                java.lang.String r8 = " info:"
                r1.append(r8)
                B r8 = r13.f38556e
                r1.append(r8)
                java.lang.String r8 = " cost:"
                r1.append(r8)
                long r8 = java.lang.System.currentTimeMillis()
                long r8 = r8 - r3
                r1.append(r8)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r1)
                A r1 = r13.f38555d
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                r3 = -4
                if (r1 == r3) goto L_0x012d
                if (r1 == 0) goto L_0x011c
                goto L_0x01da
            L_0x011c:
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r0 = r12.f315334g
                wg2.a r0 = r0.getNavigator()
                if (r0 == 0) goto L_0x01da
                B r13 = r13.f38556e
                h90.b r13 = (h90.C98324b) r13
                r0.mo142012b(r2, r13)
                goto L_0x01da
            L_0x012d:
                a14.h0 r13 = a14.C53872d1.f151117a
                a14.k2 r13 = f14.C58901s.f168555a
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$b$c r1 = new com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$b$c
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r2 = r12.f315334g
                r1.<init>(r2, r7)
                r12.f315332e = r6
                java.lang.Object r13 = a14.C53895h.m60469g(r13, r1, r12)
                if (r13 != r0) goto L_0x0141
                return r0
            L_0x0141:
                rx3.b0 r13 = (rx3.C13598b0) r13
                goto L_0x01da
            L_0x0145:
                a14.h0 r13 = a14.C53872d1.f151117a
                a14.k2 r13 = f14.C58901s.f168555a
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$b$a r1 = new com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$b$a
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r2 = r12.f315334g
                r1.<init>(r2, r7)
                r12.f315332e = r4
                java.lang.Object r13 = a14.C53895h.m60469g(r13, r1, r12)
                if (r13 != r0) goto L_0x0159
                return r0
            L_0x0159:
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r13 = r12.f315334g
                lh2.w0 r13 = r13.getOrientationPlugin()
                int r13 = r13.f291643f
                int r13 = -r13
                int r13 = r13 + 360
                int r13 = r13 % 360
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r0 = r12.f315334g
                lh2.w0 r0 = r0.getOrientationPlugin()
                int r0 = r0.f291643f
                int r0 = r0 + 360
                int r0 = r0 % 180
                if (r0 == 0) goto L_0x0176
                r0 = 1
                goto L_0x0177
            L_0x0176:
                r0 = 0
            L_0x0177:
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r1 = r12.f315334g
                boolean r1 = r1.getEnableLandscape()
                if (r1 == 0) goto L_0x0189
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r13 = r12.f315334g
                rh2.b r13 = r13.getRecorder()
                r13.mo162059k(r3, r3)
                goto L_0x0192
            L_0x0189:
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r1 = r12.f315334g
                rh2.b r1 = r1.getRecorder()
                r1.mo162059k(r13, r0)
            L_0x0192:
                th2.f r13 = th2.C101891f.f300035a
                long r0 = android.os.SystemClock.elapsedRealtime()
                r13.mo141387u(r0)
                r13.mo141381o(r4)
                goto L_0x01da
            L_0x019f:
                android.os.Bundle r13 = r12.f315335h
                if (r13 == 0) goto L_0x01da
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r0 = r12.f315334g
                java.lang.String r1 = "PARAM_1_BOOLEAN"
                boolean r13 = r13.getBoolean(r1, r3)
                i80.e r0 = r0.getCameraUsage()
                r0.mo148273i(r13)
                goto L_0x01da
            L_0x01b3:
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r13 = r12.f315334g
                i80.e r13 = r13.getCameraUsage()
                r13.switchCamera()
                goto L_0x01da
            L_0x01bd:
                android.os.Bundle r13 = r12.f315335h
                if (r13 == 0) goto L_0x01da
                com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r0 = r12.f315334g
                java.lang.String r1 = "PARAM_PREPARE_CAMERA_ZOOM_BOOLEAN"
                boolean r13 = r13.getBoolean(r1, r3)
                if (r13 == 0) goto L_0x01d3
                i80.e r13 = r0.getCameraUsage()
                r13.mo148263a()
                goto L_0x01da
            L_0x01d3:
                i80.e r13 = r0.getCameraUsage()
                r13.mo148264b()
            L_0x01da:
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout.C105951b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout$c */
    public static final class C105955c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CameraKitPluginLayout f315339d;

        public C105955c(CameraKitPluginLayout cameraKitPluginLayout) {
            this.f315339d = cameraKitPluginLayout;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.CameraKitPluginLayout", "updateRecordTipByAudioPermission: recordPlugin click event invoke");
            this.f315339d.setCheckAudioPermission(true);
            Context context = this.f315339d.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7((Activity) context);
            C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitPluginLayout$updateRecordTipByAudioPermission$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraKitPluginLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C99471w0 w0Var = new C99471w0(context);
        this.f315323u = w0Var;
        LayoutInflater.from(context).inflate(getLayoutId(), this, true);
        View findViewById = findViewById(C0966R.C0970id.apr);
        C87412m.m108593f(findViewById, "findViewById(R.id.camera_view)");
        C108402e eVar = (C108402e) findViewById;
        this.f315319q = eVar;
        eVar.mo148275k(this);
        eVar.setCustomRender(this);
        C53895h.m60466d(getScope(), (C66212f) null, (C53934p0) null, new C110398c(this, (C15601d<? super C110398c>) null), 3, (Object) null);
        View findViewById2 = findViewById(C0966R.C0970id.kaw);
        C87412m.m108593f(findViewById2, "findViewById(R.id.switch_camera)");
        C99473x0 x0Var = new C99473x0((ImageView) findViewById2, this);
        this.f315321s = x0Var;
        View findViewById3 = findViewById(C0966R.C0970id.bex);
        C87412m.m108593f(findViewById3, "findViewById(R.id.close_plugin)");
        C99466t0 t0Var = new C99466t0((WeImageView) findViewById3, this);
        this.f315322t = t0Var;
        w0Var.f291644g = this;
        getPluginList().add(t0Var);
        getPluginList().add(x0Var);
        getPluginList().add(w0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m142487q(com.tencent.p014mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r33, wx3.C15601d r34) {
        /*
            r0 = r33
            r1 = r34
            r33.getClass()
            boolean r2 = r1 instanceof qh2.C110400d
            if (r2 == 0) goto L_0x001a
            r2 = r1
            qh2.d r2 = (qh2.C110400d) r2
            int r3 = r2.f330271h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.f330271h = r3
            goto L_0x001f
        L_0x001a:
            qh2.d r2 = new qh2.d
            r2.<init>(r0, r1)
        L_0x001f:
            r9 = r2
            java.lang.Object r1 = r9.f330269f
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r9.f330271h
            java.lang.String r12 = "path"
            r13 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r13) goto L_0x003d
            java.lang.Object r0 = r9.f330268e
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r9.f330267d
            com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout r2 = (com.tencent.p014mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout) r2
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r1
            r1 = r0
            r0 = r2
            goto L_0x006d
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r1)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r1 = r0.f315325w
            gy3.C87412m.m108591d(r1)
            java.lang.String r1 = r1.f272903D
            i80.e r3 = r0.f315319q
            r4 = 0
            r5 = 1920(0x780, float:2.69E-42)
            lh2.w0 r6 = r0.f315323u
            int r6 = r6.f291643f
            gy3.C87412m.m108593f(r1, r12)
            boolean r8 = r0.f315326x
            r10 = 1
            r11 = 0
            r9.f330267d = r0
            r9.f330268e = r1
            r9.f330271h = r13
            r7 = r1
            java.lang.Object r3 = i80.C108402e.C108403a.m146864a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r2) goto L_0x006d
            goto L_0x00ab
        L_0x006d:
            java.lang.Number r3 = (java.lang.Number) r3
            int r2 = r3.intValue()
            if (r2 != 0) goto L_0x00a9
            gy3.C87412m.m108593f(r1, r12)
            h90.b r2 = new h90.b
            r14 = r2
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 65019(0xfdfb, float:9.1111E-41)
            r32 = 0
            r24 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            wg2.a r0 = r0.f315324v
            if (r0 == 0) goto L_0x00a9
            r0.mo142012b(r13, r2)
        L_0x00a9:
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x00ab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout.m142487q(com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout, wx3.d):java.lang.Object");
    }

    private final void setPluginVisibility(int i) {
        this.f315322t.setVisibility(i);
        this.f315321s.f291647d.setVisibility(i);
        C109337b bVar = this.f315320r;
        if (bVar != null) {
            bVar.setVisibility(i);
        }
    }

    /* renamed from: a */
    public Object mo149729a(C110194c cVar, C15601d<? super C110194c> dVar) {
        return this.f315318p.mo149729a(cVar, dVar);
    }

    /* renamed from: b */
    public Object mo149730b(C15601d<? super C13598b0> dVar) {
        Object b = this.f315318p.mo149730b(dVar);
        return b == C15911a.COROUTINE_SUSPENDED ? b : C13598b0.f38549a;
    }

    public final C99473x0 getCameraSwitchPlugin() {
        return this.f315321s;
    }

    public final C108402e getCameraUsage() {
        return this.f315319q;
    }

    public final C99466t0 getClosePlugin() {
        return this.f315322t;
    }

    public final RecordConfigProvider getConfigProvider() {
        return this.f315325w;
    }

    public final boolean getEnableLandscape() {
        return this.f315326x;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ck4;
    }

    public C39623j getLifecycle() {
        return this.f315317o;
    }

    public final C102440a getNavigator() {
        return this.f315324v;
    }

    public final C99471w0 getOrientationPlugin() {
        return this.f315323u;
    }

    public final C109337b getRecordPlugin() {
        return this.f315320r;
    }

    public final C110563b getRecorder() {
        return this.f315318p;
    }

    /* renamed from: i */
    public Object mo149731i(C15601d<? super C13598b0> dVar) {
        Object i = this.f315318p.mo149731i(dVar);
        return i == C15911a.COROUTINE_SUSPENDED ? i : C13598b0.f38549a;
    }

    /* renamed from: k */
    public void mo128671k(C102440a aVar, RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(aVar, "navigator");
        C87412m.m108594g(recordConfigProvider, "configProvider");
        super.mo128671k(aVar, recordConfigProvider);
        this.f315327y = recordConfigProvider.f272926n;
        C102031b.f300466a.mo141540a(recordConfigProvider);
        C97884j jVar = C97884j.f287164a;
        VideoTransPara videoTransPara = recordConfigProvider.f272926n;
        C87412m.m108593f(videoTransPara, "configProvider.videoParam");
        jVar.mo137210c(videoTransPara, recordConfigProvider.f272905F, mo133885t());
        if (this.f315327y == null) {
            this.f315327y = recordConfigProvider.f272926n;
        }
        this.f315324v = aVar;
        this.f315325w = recordConfigProvider;
        if (mo133885t()) {
            Point a = C75054z4.m90003a(getContext());
            if (C85875k4.m106181f0(MMApplicationContext.getContext())) {
                a = C85875k4.m106186i(MMApplicationContext.getContext());
            }
            int i = a.x;
            int i2 = a.y;
            VideoTransPara videoTransPara2 = recordConfigProvider.f272926n;
            videoTransPara2.f267167e = (i2 * videoTransPara2.f267166d) / i;
            Log.m105924i("MicroMsg.CameraKitPluginLayout", "makeRecordVideoFullScreen width:" + videoTransPara2.f267166d + " height:" + videoTransPara2.f267167e);
        }
        this.f315320r = mo151240x();
        C98453h.f288774a.mo137804b(recordConfigProvider);
        C109337b bVar = this.f315320r;
        if (bVar != null) {
            bVar.mo160531g(false);
        }
        C109337b bVar2 = this.f315320r;
        if (bVar2 != null) {
            bVar2.mo160527b(recordConfigProvider);
        }
        this.f315318p.mo162057h(recordConfigProvider, false);
        mo151239w();
        VideoTransPara videoTransPara3 = this.f315327y;
        if (videoTransPara3 != null) {
            Log.m105924i("MicroMsg.CameraKitPluginLayout", "report info swEnableHevc:" + videoTransPara3.f267164K + " hwEnableHevc:" + videoTransPara3.f267163J);
            if (videoTransPara3.f267164K == 1) {
                C101891f.f300035a.mo141372f(1);
            } else if (videoTransPara3.f267163J == 1) {
                C101891f.f300035a.mo141372f(2);
            }
        }
        C101891f fVar = C101891f.f300035a;
        fVar.mo141383q(false);
        fVar.mo141382p(jVar.mo137209b());
    }

    /* renamed from: l */
    public void mo129855l(C98324b bVar) {
        super.mo129855l(bVar);
        C110992d.f332425a.mo162677k("KEY_MEDIA_SOURCE_INT", 2);
    }

    /* renamed from: n */
    public boolean mo149732n() {
        boolean n = super.mo149732n();
        this.f315318p.mo162058j(!n);
        return n;
    }

    /* renamed from: o */
    public void mo149733o(boolean z) {
        this.f315318p.mo162058j(!z);
        if (z) {
            C109337b bVar = this.f315320r;
            if (bVar != null) {
                bVar.mo160526a();
                return;
            }
            return;
        }
        C109337b bVar2 = this.f315320r;
        if (bVar2 != null) {
            bVar2.mo160532h(new C105955c(this));
        }
    }

    public void onAttach() {
        super.onAttach();
        setPluginVisibility(0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        StringBuilder sb = new StringBuilder();
        sb.append("onConfigurationChanged orientation:");
        sb.append(configuration != null ? Integer.valueOf(configuration.orientation) : null);
        Log.m105924i("MicroMsg.CameraKitPluginLayout", sb.toString());
        super.onConfigurationChanged(configuration);
        boolean z = false;
        if (configuration != null && configuration.orientation == 2) {
            z = true;
        }
        if (z) {
            this.f315326x = true;
        }
        RecordConfigProvider recordConfigProvider = this.f315325w;
        if (recordConfigProvider != null) {
            recordConfigProvider.f272926n = this.f315327y;
            C102031b.f300466a.mo141540a(recordConfigProvider);
            this.f315318p.mo162057h(recordConfigProvider, true);
        }
    }

    public void onDetach() {
        Log.m105924i("MicroMsg.CameraKitPluginLayout", "onDetach: ");
        super.onDetach();
        setPluginVisibility(4);
    }

    public void onOrientationChange(int i) {
        C61926c.m72668M(new C105950a(this, i));
    }

    public void onPause() {
        Log.m105924i("MicroMsg.CameraKitPluginLayout", "onPause");
        super.onPause();
        try {
            this.f315317o.mo145135c(C39623j.C39625b.ON_PAUSE);
            C60960c.f173618a.mo85927k("SnsPublishProcess", "cameraPageStaytime_", Long.valueOf(SystemClock.elapsedRealtime() - this.f315328z), C60242i.APPEND);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CameraKitPluginLayout", e, "handleLifecycleEvent error", new Object[0]);
        }
    }

    public void onResume() {
        Log.m105924i("MicroMsg.CameraKitPluginLayout", "onResume");
        super.onResume();
        try {
            this.f315317o.mo145135c(C39623j.C39625b.ON_RESUME);
            this.f315328z = SystemClock.elapsedRealtime();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CameraKitPluginLayout", e, "handleLifecycleEvent error", new Object[0]);
        }
    }

    /* renamed from: p */
    public void mo14585p(C101198e.C101199b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        Log.m105924i("MicroMsg.CameraKitPluginLayout", "status : " + bVar + "  param: " + bundle);
        C53895h.m60466d(getScope(), C53872d1.f151119c, (C53934p0) null, new C105951b(bVar, this, bundle, (C15601d<? super C105951b>) null), 2, (Object) null);
    }

    /* renamed from: r */
    public Object mo151234r(boolean z, C15601d<? super C13598b0> dVar) {
        this.f315321s.mo138905a(z);
        C110992d.f332425a.mo162677k("KEY_MEDIA_SOURCE_INT", new Integer(z ? 1 : 2));
        return C13598b0.f38549a;
    }

    public void release() {
        Log.m105924i("MicroMsg.CameraKitPluginLayout", "release: ");
        super.release();
        try {
            this.f315317o.mo145135c(C39623j.C39625b.ON_DESTROY);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.CameraKitPluginLayout", e, "handleLifecycleEvent error", new Object[0]);
        }
        C0000n0 scope = getScope();
        C53930o0.m60557d(scope, this + " release.", (Throwable) null, 2, (Object) null);
    }

    public void reset() {
        Log.m105924i("MicroMsg.CameraKitPluginLayout", "reset: ");
        super.reset();
        this.f315318p.reset();
        C109337b bVar = this.f315320r;
        if (bVar != null) {
            bVar.reset();
        }
    }

    public final void setConfigProvider(RecordConfigProvider recordConfigProvider) {
        this.f315325w = recordConfigProvider;
    }

    public final void setEnableLandscape(boolean z) {
        this.f315326x = z;
    }

    public final void setNavigator(C102440a aVar) {
        this.f315324v = aVar;
    }

    public final void setRecordPlugin(C109337b bVar) {
        this.f315320r = bVar;
    }

    /* renamed from: t */
    public boolean mo133885t() {
        return true;
    }

    /* renamed from: w */
    public void mo151239w() {
        Bundle bundle;
        Bundle bundle2;
        RecordConfigProvider recordConfigProvider = this.f315325w;
        int i = -1;
        int i2 = recordConfigProvider != null ? recordConfigProvider.f272905F : -1;
        if (!(recordConfigProvider == null || (bundle2 = recordConfigProvider.f272912M) == null)) {
            i = bundle2.getInt("key_sub_scene", -1);
        }
        RecordConfigProvider recordConfigProvider2 = this.f315325w;
        this.f315319q.setCameraKitSetting(new C107259g((C107260h) null, new C107254b(0, 0, (C107256d) null, (C107257e) null, ((recordConfigProvider2 == null || (bundle = recordConfigProvider2.f272912M) == null) ? 2 : bundle.getInt("key_camera_select", 2)) == 2, false, false, false, WXWebReporter.WXXWEB_PRE_DOWN_ARM64_SUC, (C8480h) null), new C107258f(i2, i), 1, (C8480h) null));
    }

    /* renamed from: x */
    public C109337b mo151240x() {
        return new C109360o0(this, this);
    }
}
