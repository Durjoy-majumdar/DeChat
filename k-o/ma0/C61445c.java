package ma0;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.camera.core.FocusMeteringAction;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39630m0;
import bl3.C54494p;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.maas.MJMaasVersion;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.mj_template.album_template.multi_template.MaasAlbumMultiTemplatePreviewUI;
import com.tencent.p014mm.mj_template.album_template.single_template.MaasAlbumTemplatePreviewUI;
import com.tencent.p014mm.mj_template.api.MJTemplateSession;
import com.tencent.p014mm.mj_template.api.MaasAlbumMultiTemplateRequestParams;
import com.tencent.p014mm.mj_template.api.MaasAlbumTemplateRequestParams;
import com.tencent.p014mm.mj_template.api.MaasAlbumTemplateSnsFeedInfo;
import com.tencent.p014mm.mj_template.template_res.MaasTemplateResMgr;
import com.tencent.p014mm.mj_template.template_square.MaasTemplateApiFlutterPlugin;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import da0.C58245c;
import da0.C58246d;
import da0.C58247e;
import da0.C7256b;
import da0.C97455f;
import di3.C86301e;
import di3.C86312j;
import ea0.C45580a;
import ei3.C86522b;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ha0.C108221t;
import j20.C117292a;
import ja0.C24789f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import k20.C60958c;
import k20.C9556a;
import ka0.C33847f;
import ka0.C33848g;
import ka0.C33854h;
import ka0.C9574i;
import kotlin.ResultKt;
import o40.C61926c;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterEngineCache;
import p523fp.C32147e;
import p749xh.C118881x7;
import qa0.C62586b;
import rx3.C13598b0;
import te3.pr4;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import y90.C38980b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: ma0.c */
public final class C61445c extends C86301e implements C0123n0, C58247e {

    /* renamed from: d */
    public MaasTemplateApiFlutterPlugin f174732d;

    /* renamed from: e */
    public C34487a f174733e;

    /* renamed from: f */
    public final C0000n0 f174734f = C53930o0.m60555b();

    /* renamed from: g */
    public C53973z1 f174735g;

    /* renamed from: h */
    public final C54494p f174736h = new C54494p();

    /* renamed from: ma0.c$a */
    public static final class C34487a {

        /* renamed from: a */
        public final long f92814a;

        /* renamed from: b */
        public final String f92815b;

        /* renamed from: c */
        public final String f92816c;

        /* renamed from: d */
        public String f92817d;

        /* renamed from: e */
        public FlutterEngine f92818e;

        public C34487a() {
            this(0, (String) null, (String) null, (String) null, (FlutterEngine) null, 31, (C8480h) null);
        }

        public C34487a(long j, String str, String str2, String str3, FlutterEngine flutterEngine, int i, C8480h hVar) {
            j = (i & 1) != 0 ? 0 : j;
            str = (i & 2) != 0 ? "" : str;
            str2 = (i & 4) != 0 ? "" : str2;
            str3 = (i & 8) != 0 ? "" : str3;
            flutterEngine = (i & 16) != 0 ? null : flutterEngine;
            C87412m.m108594g(str, "priorityTplId");
            C87412m.m108594g(str2, "recMusicId");
            C87412m.m108594g(str3, "engineId");
            this.f92814a = j;
            this.f92815b = str;
            this.f92816c = str2;
            this.f92817d = str3;
            this.f92818e = flutterEngine;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!C87412m.m108589b(C34487a.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.mj_template.plugin.PluginMaasTemplate.CachedEngineInfo");
            C34487a aVar = (C34487a) obj;
            return this.f92814a == aVar.f92814a && C87412m.m108589b(this.f92815b, aVar.f92815b) && C87412m.m108589b(this.f92816c, aVar.f92816c);
        }

        public int hashCode() {
            long j = this.f92814a;
            return (((((int) (j ^ (j >>> 32))) * 31) + this.f92815b.hashCode()) * 31) + this.f92816c.hashCode();
        }

        public String toString() {
            return "CachedEngineInfo(eventTopicId=" + this.f92814a + ", priorityTplId=" + this.f92815b + ", recMusicId=" + this.f92816c + ", engineId=" + this.f92817d + ", flutterEngine=" + this.f92818e + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.plugin.PluginMaasTemplate$preload$1", mo125469f = "PluginMaasTemplate.kt", mo125470l = {101}, mo125471m = "invokeSuspend")
    /* renamed from: ma0.c$d */
    public static final class C34488d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f92819d;

        /* renamed from: e */
        public int f92820e;

        /* renamed from: f */
        public final /* synthetic */ C61445c f92821f;

        /* renamed from: g */
        public final /* synthetic */ long f92822g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34488d(C61445c cVar, long j, C15601d<? super C34488d> dVar) {
            super(2, dVar);
            this.f92821f = cVar;
            this.f92822g = j;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C34488d(this.f92821f, this.f92822g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C34488d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            long j;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f92820e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long currentTicks = Util.currentTicks();
                Log.m105924i("MicroMsg.PluginMJTemplate", "preload");
                C61445c cVar = this.f92821f;
                long j2 = this.f92822g;
                this.f92819d = currentTicks;
                this.f92820e = 1;
                if (C61445c.wx0(cVar, j2, (String) null, (String) null, this, 6, (Object) null) == aVar) {
                    return aVar;
                }
                j = currentTicks;
            } else if (i == 1) {
                j = this.f92819d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Log.m105924i("MicroMsg.PluginMJTemplate", "preload finished cost:" + Util.ticksToNow(j));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.plugin.PluginMaasTemplate$launchTemplateSquare$1", mo125469f = "PluginMaasTemplate.kt", mo125470l = {191, 194}, mo125471m = "invokeSuspend")
    /* renamed from: ma0.c$b */
    public static final class C61446b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174737d;

        /* renamed from: e */
        public final /* synthetic */ long f174738e;

        /* renamed from: f */
        public final /* synthetic */ C61445c f174739f;

        /* renamed from: g */
        public final /* synthetic */ Context f174740g;

        /* renamed from: h */
        public final /* synthetic */ Intent f174741h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61446b(long j, C61445c cVar, Context context, Intent intent, C15601d<? super C61446b> dVar) {
            super(2, dVar);
            this.f174738e = j;
            this.f174739f = cVar;
            this.f174740g = context;
            this.f174741h = intent;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61446b(this.f174738e, this.f174739f, this.f174740g, this.f174741h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61446b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
            if ((r0 != null ? r0.f92817d : null) == null) goto L_0x008f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r8 = r22
                xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r8.f174737d
                java.lang.String r10 = "MicroMsg.PluginMJTemplate"
                r1 = 2
                r11 = 0
                r12 = 1
                if (r0 == 0) goto L_0x001f
                if (r0 == r12) goto L_0x001a
                if (r0 != r1) goto L_0x0012
                goto L_0x001a
            L_0x0012:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001a:
                kotlin.ResultKt.throwOnFailure(r23)
                goto L_0x00ab
            L_0x001f:
                kotlin.ResultKt.throwOnFailure(r23)
                ma0.c$a r0 = new ma0.c$a
                long r14 = r8.f174738e
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 30
                r21 = 0
                r13 = r0
                r13.<init>(r14, r16, r17, r18, r19, r20, r21)
                ma0.c r2 = r8.f174739f
                a14.z1 r2 = r2.f174735g
                if (r2 == 0) goto L_0x0046
                a14.a r2 = (a14.C53851a) r2
                boolean r2 = r2.mo74466a()
                if (r2 != r12) goto L_0x0046
                r2 = 1
                goto L_0x0047
            L_0x0046:
                r2 = 0
            L_0x0047:
                if (r2 == 0) goto L_0x0077
                ma0.c r2 = r8.f174739f
                a14.z1 r2 = r2.f174735g
                if (r2 == 0) goto L_0x0059
                a14.f2 r2 = (a14.C53884f2) r2
                boolean r2 = r2.mo74530c()
                if (r2 != 0) goto L_0x0059
                r2 = 1
                goto L_0x005a
            L_0x0059:
                r2 = 0
            L_0x005a:
                if (r2 == 0) goto L_0x0077
                ma0.c r2 = r8.f174739f
                ma0.c$a r2 = r2.f174733e
                boolean r2 = gy3.C87412m.m108589b(r0, r2)
                if (r2 == 0) goto L_0x0077
                ma0.c r0 = r8.f174739f
                a14.z1 r0 = r0.f174735g
                if (r0 == 0) goto L_0x00ab
                r8.f174737d = r12
                a14.f2 r0 = (a14.C53884f2) r0
                java.lang.Object r0 = r0.mo74521O(r8)
                if (r0 != r9) goto L_0x00ab
                return r9
            L_0x0077:
                ma0.c r2 = r8.f174739f
                ma0.c$a r2 = r2.f174733e
                boolean r0 = gy3.C87412m.m108589b(r0, r2)
                if (r0 == 0) goto L_0x008f
                ma0.c r0 = r8.f174739f
                ma0.c$a r0 = r0.f174733e
                if (r0 == 0) goto L_0x008f
                if (r0 == 0) goto L_0x008c
                java.lang.String r0 = r0.f92817d
                goto L_0x008d
            L_0x008c:
                r0 = 0
            L_0x008d:
                if (r0 != 0) goto L_0x00ab
            L_0x008f:
                java.lang.String r0 = "trigger preload"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
                ma0.c r0 = r8.f174739f
                long r2 = r8.f174738e
                r4 = 0
                r5 = 0
                r6 = 6
                r7 = 0
                r8.f174737d = r1
                r1 = r2
                r3 = r4
                r4 = r5
                r5 = r22
                java.lang.Object r0 = ma0.C61445c.wx0(r0, r1, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L_0x00ab
                return r9
            L_0x00ab:
                ma0.c r0 = r8.f174739f
                ma0.c$a r1 = r0.f174733e
                if (r1 == 0) goto L_0x0136
                io.flutter.embedding.engine.FlutterEngine r1 = r1.f92818e
                if (r1 != 0) goto L_0x00b7
                goto L_0x0136
            L_0x00b7:
                com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin r0 = r0.f174732d
                if (r0 == 0) goto L_0x00c2
                io.flutter.embedding.engine.plugins.PluginRegistry r2 = r1.getPlugins()
                r2.add((p172io.flutter.embedding.engine.plugins.FlutterPlugin) r0)
            L_0x00c2:
                java.lang.Class<ou1.b> r0 = ou1.C62182b.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ou1.b r0 = (ou1.C62182b) r0
                r0.mo86832u(r1)
                java.lang.Class<pr.f> r0 = p220pr.C62491f.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                pr.f r0 = (p220pr.C62491f) r0
                ma0.c r1 = r8.f174739f
                ma0.c$a r1 = r1.f174733e
                if (r1 == 0) goto L_0x0133
                java.lang.String r1 = r1.f92817d
                if (r1 != 0) goto L_0x00e0
                goto L_0x0133
            L_0x00e0:
                io.flutter.embedding.android.PatchedFlutterActivity$CachedEngineIntentBuilder r0 = r0.mo87523kz(r1)
                io.flutter.embedding.android.PatchedFlutterActivity$CachedEngineIntentBuilder r0 = r0.destroyEngineWithActivity(r12)
                android.content.Context r1 = r8.f174740g
                android.content.Intent r0 = r0.build(r1)
                android.content.Intent r1 = r8.f174741h
                r0.putExtras(r1)
                android.content.Context r1 = r8.f174740g
                k20.a r2 = new k20.a
                r2.<init>()
                r2.mo10233c(r0)
                java.lang.Object[] r13 = r2.mo10232b()
                java.lang.String r14 = "com/tencent/mm/mj_template/plugin/PluginMaasTemplate$launchTemplateSquare$1"
                java.lang.String r15 = "invokeSuspend"
                java.lang.String r16 = "(Ljava/lang/Object;)Ljava/lang/Object;"
                java.lang.String r17 = "Undefined"
                java.lang.String r18 = "startActivity"
                java.lang.String r19 = "(Landroid/content/Intent;)V"
                r12 = r1
                j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
                java.lang.Object r0 = r2.mo10231a(r11)
                android.content.Intent r0 = (android.content.Intent) r0
                r1.startActivity(r0)
                java.lang.String r13 = "com/tencent/mm/mj_template/plugin/PluginMaasTemplate$launchTemplateSquare$1"
                java.lang.String r14 = "invokeSuspend"
                java.lang.String r15 = "(Ljava/lang/Object;)Ljava/lang/Object;"
                java.lang.String r16 = "Undefined"
                java.lang.String r17 = "startActivity"
                java.lang.String r18 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
                java.lang.String r0 = "launchTemplateSquare"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0133:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0136:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ma0.C61445c.C61446b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.plugin.PluginMaasTemplate$launchTemplateSquareWithMusicId$1", mo125469f = "PluginMaasTemplate.kt", mo125470l = {158, 161}, mo125471m = "invokeSuspend")
    /* renamed from: ma0.c$c */
    public static final class C61447c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f174742d;

        /* renamed from: e */
        public final /* synthetic */ String f174743e;

        /* renamed from: f */
        public final /* synthetic */ C61445c f174744f;

        /* renamed from: g */
        public final /* synthetic */ Context f174745g;

        /* renamed from: h */
        public final /* synthetic */ Intent f174746h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61447c(String str, C61445c cVar, Context context, Intent intent, C15601d<? super C61447c> dVar) {
            super(2, dVar);
            this.f174743e = str;
            this.f174744f = cVar;
            this.f174745g = context;
            this.f174746h = intent;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61447c(this.f174743e, this.f174744f, this.f174745g, this.f174746h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61447c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
            if ((r0 != null ? r0.f92817d : null) == null) goto L_0x0091;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                r22 = this;
                r8 = r22
                xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r8.f174742d
                java.lang.String r10 = "MicroMsg.PluginMJTemplate"
                r1 = 2
                r11 = 0
                r12 = 1
                if (r0 == 0) goto L_0x001f
                if (r0 == r12) goto L_0x001a
                if (r0 != r1) goto L_0x0012
                goto L_0x001a
            L_0x0012:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x001a:
                kotlin.ResultKt.throwOnFailure(r23)
                goto L_0x00ae
            L_0x001f:
                kotlin.ResultKt.throwOnFailure(r23)
                ma0.c$a r0 = new ma0.c$a
                r14 = 0
                r16 = 0
                java.lang.String r2 = r8.f174743e
                r18 = 0
                r19 = 0
                r20 = 27
                r21 = 0
                r13 = r0
                r17 = r2
                r13.<init>(r14, r16, r17, r18, r19, r20, r21)
                ma0.c r2 = r8.f174744f
                a14.z1 r2 = r2.f174735g
                if (r2 == 0) goto L_0x0048
                a14.a r2 = (a14.C53851a) r2
                boolean r2 = r2.mo74466a()
                if (r2 != r12) goto L_0x0048
                r2 = 1
                goto L_0x0049
            L_0x0048:
                r2 = 0
            L_0x0049:
                if (r2 == 0) goto L_0x0079
                ma0.c r2 = r8.f174744f
                a14.z1 r2 = r2.f174735g
                if (r2 == 0) goto L_0x005b
                a14.f2 r2 = (a14.C53884f2) r2
                boolean r2 = r2.mo74530c()
                if (r2 != 0) goto L_0x005b
                r2 = 1
                goto L_0x005c
            L_0x005b:
                r2 = 0
            L_0x005c:
                if (r2 == 0) goto L_0x0079
                ma0.c r2 = r8.f174744f
                ma0.c$a r2 = r2.f174733e
                boolean r2 = gy3.C87412m.m108589b(r0, r2)
                if (r2 == 0) goto L_0x0079
                ma0.c r0 = r8.f174744f
                a14.z1 r0 = r0.f174735g
                if (r0 == 0) goto L_0x00ae
                r8.f174742d = r12
                a14.f2 r0 = (a14.C53884f2) r0
                java.lang.Object r0 = r0.mo74521O(r8)
                if (r0 != r9) goto L_0x00ae
                return r9
            L_0x0079:
                ma0.c r2 = r8.f174744f
                ma0.c$a r2 = r2.f174733e
                boolean r0 = gy3.C87412m.m108589b(r0, r2)
                if (r0 == 0) goto L_0x0091
                ma0.c r0 = r8.f174744f
                ma0.c$a r0 = r0.f174733e
                if (r0 == 0) goto L_0x0091
                if (r0 == 0) goto L_0x008e
                java.lang.String r0 = r0.f92817d
                goto L_0x008f
            L_0x008e:
                r0 = 0
            L_0x008f:
                if (r0 != 0) goto L_0x00ae
            L_0x0091:
                java.lang.String r0 = "trigger preload"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r0)
                ma0.c r0 = r8.f174744f
                r2 = 0
                r4 = 0
                java.lang.String r5 = r8.f174743e
                r6 = 3
                r7 = 0
                r8.f174742d = r1
                r1 = r2
                r3 = r4
                r4 = r5
                r5 = r22
                java.lang.Object r0 = ma0.C61445c.wx0(r0, r1, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L_0x00ae
                return r9
            L_0x00ae:
                ma0.c r0 = r8.f174744f
                ma0.c$a r0 = r0.f174733e
                if (r0 == 0) goto L_0x0147
                io.flutter.embedding.engine.FlutterEngine r0 = r0.f92818e
                if (r0 != 0) goto L_0x00ba
                goto L_0x0147
            L_0x00ba:
                io.flutter.embedding.engine.plugins.PluginRegistry r1 = r0.getPlugins()
                sa0.a r2 = new sa0.a
                r2.<init>()
                r1.add((p172io.flutter.embedding.engine.plugins.FlutterPlugin) r2)
                ma0.c r1 = r8.f174744f
                com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin r1 = r1.f174732d
                if (r1 == 0) goto L_0x00d3
                io.flutter.embedding.engine.plugins.PluginRegistry r2 = r0.getPlugins()
                r2.add((p172io.flutter.embedding.engine.plugins.FlutterPlugin) r1)
            L_0x00d3:
                java.lang.Class<ou1.b> r1 = ou1.C62182b.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                ou1.b r1 = (ou1.C62182b) r1
                r1.mo86832u(r0)
                java.lang.Class<pr.f> r0 = p220pr.C62491f.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                pr.f r0 = (p220pr.C62491f) r0
                ma0.c r1 = r8.f174744f
                ma0.c$a r1 = r1.f174733e
                if (r1 == 0) goto L_0x0144
                java.lang.String r1 = r1.f92817d
                if (r1 != 0) goto L_0x00f1
                goto L_0x0144
            L_0x00f1:
                io.flutter.embedding.android.PatchedFlutterActivity$CachedEngineIntentBuilder r0 = r0.mo87523kz(r1)
                io.flutter.embedding.android.PatchedFlutterActivity$CachedEngineIntentBuilder r0 = r0.destroyEngineWithActivity(r12)
                android.content.Context r1 = r8.f174745g
                android.content.Intent r0 = r0.build(r1)
                android.content.Intent r1 = r8.f174746h
                r0.putExtras(r1)
                android.content.Context r1 = r8.f174745g
                k20.a r2 = new k20.a
                r2.<init>()
                r2.mo10233c(r0)
                java.lang.Object[] r13 = r2.mo10232b()
                java.lang.String r14 = "com/tencent/mm/mj_template/plugin/PluginMaasTemplate$launchTemplateSquareWithMusicId$1"
                java.lang.String r15 = "invokeSuspend"
                java.lang.String r16 = "(Ljava/lang/Object;)Ljava/lang/Object;"
                java.lang.String r17 = "Undefined"
                java.lang.String r18 = "startActivity"
                java.lang.String r19 = "(Landroid/content/Intent;)V"
                r12 = r1
                j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
                java.lang.Object r0 = r2.mo10231a(r11)
                android.content.Intent r0 = (android.content.Intent) r0
                r1.startActivity(r0)
                java.lang.String r13 = "com/tencent/mm/mj_template/plugin/PluginMaasTemplate$launchTemplateSquareWithMusicId$1"
                java.lang.String r14 = "invokeSuspend"
                java.lang.String r15 = "(Ljava/lang/Object;)Ljava/lang/Object;"
                java.lang.String r16 = "Undefined"
                java.lang.String r17 = "startActivity"
                java.lang.String r18 = "(Landroid/content/Intent;)V"
                j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
                java.lang.String r0 = "launchTemplateSquareWithMusicId"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r0)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0144:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0147:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ma0.C61445c.C61447c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.mj_template.plugin.PluginMaasTemplate", mo125469f = "PluginMaasTemplate.kt", mo125470l = {139}, mo125471m = "preloadEngineImpl")
    /* renamed from: ma0.c$e */
    public static final class C61448e extends C66704d {

        /* renamed from: d */
        public Object f174747d;

        /* renamed from: e */
        public long f174748e;

        /* renamed from: f */
        public /* synthetic */ Object f174749f;

        /* renamed from: g */
        public final /* synthetic */ C61445c f174750g;

        /* renamed from: h */
        public int f174751h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61448e(C61445c cVar, C15601d<? super C61448e> dVar) {
            super(dVar);
            this.f174750g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f174749f = obj;
            this.f174751h |= Integer.MIN_VALUE;
            return this.f174750g.vx0(0, (String) null, (String) null, this);
        }
    }

    /* renamed from: ma0.c$f */
    public static final class C61449f extends C87413o implements C32227p<FlutterEngine, Map<String, Object>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ long f174752d;

        /* renamed from: e */
        public final /* synthetic */ String f174753e;

        /* renamed from: f */
        public final /* synthetic */ String f174754f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61449f(long j, String str, String str2) {
            super(2);
            this.f174752d = j;
            this.f174753e = str;
            this.f174754f = str2;
        }

        public Object invoke(Object obj, Object obj2) {
            String str;
            Map map = (Map) obj2;
            C87412m.m108594g((FlutterEngine) obj, "<anonymous parameter 0>");
            C87412m.m108594g(map, "builder");
            long j = this.f174752d;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i == 0) {
                str = "";
            } else if (i == 0) {
                str = "0";
            } else if (i > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr = new char[64];
                long j2 = (j >>> 1) / ((long) 5);
                long j3 = (long) 10;
                int i2 = 63;
                cArr[63] = Character.forDigit((int) (j - (j2 * j3)), 10);
                while (j2 > 0) {
                    i2--;
                    cArr[i2] = Character.forDigit((int) (j2 % j3), 10);
                    j2 /= j3;
                }
                str = new String(cArr, i2, 64 - i2);
            }
            map.put("EventTopicId", str);
            map.put("PriorityTplId", this.f174753e);
            map.put("RecMusicId", this.f174754f);
            return C13598b0.f38549a;
        }
    }

    public static /* synthetic */ Object wx0(C61445c cVar, long j, String str, String str2, C15601d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return cVar.vx0(j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, dVar);
    }

    /* renamed from: HH */
    public void mo82977HH(Activity activity, int i, List<? extends GalleryItem$MediaItem> list, Intent intent) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(list, "mediaList");
        C87412m.m108594g(intent, "originIntent");
        Log.m105924i("MicroMsg.PluginMJTemplate", "enterMultiTemplatePreviewUI");
        intent.setClass(activity, MaasAlbumMultiTemplatePreviewUI.class);
        intent.putExtra("request_params", new MaasAlbumMultiTemplateRequestParams(list, false, false, false, (MaasAlbumTemplateSnsFeedInfo) null, 30, (C8480h) null));
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/mj_template/plugin/PluginMaasTemplate", "enterMultiTemplatePreviewUI", "(Landroid/app/Activity;ILjava/util/List;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public void Ln0() {
        C108221t.f324032a.mo158632l();
    }

    public void M60() {
        Log.m105924i("MicroMsg.PluginMJTemplate", "enter destroyEngine");
        C34487a aVar = this.f174733e;
        if (aVar != null) {
            Log.m105924i("MicroMsg.PluginMJTemplate", "destroyEngine " + aVar.f92817d);
            FlutterEngineCache.getInstance().remove(aVar.f92817d);
        }
        this.f174733e = null;
        this.f174732d = null;
        C53973z1 z1Var = this.f174735g;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f174735g = null;
    }

    public void On0() {
        C108221t.f324032a.mo158631k(false);
    }

    public void P70(boolean z) {
        C24789f.f70694a.mo51770b(z ? 3 : 2);
    }

    /* renamed from: Tl */
    public C58246d mo82982Tl() {
        return C45580a.f123293a;
    }

    /* renamed from: Vh */
    public void mo82983Vh(long j) {
        if (!C87412m.m108589b(this.f174733e, new C34487a(j, (String) null, (String) null, (String) null, (FlutterEngine) null, 30, (C8480h) null))) {
            this.f174735g = C53895h.m60466d(this.f174734f, (C66212f) null, (C53934p0) null, new C34488d(this, j, (C15601d<? super C34488d>) null), 3, (Object) null);
        }
    }

    /* renamed from: Yu */
    public Object mo82984Yu(String str, boolean z, C15601d<? super pr4> dVar) {
        return C62586b.f177739a.mo87644d(str, z ? 2 : 4, dVar);
    }

    /* renamed from: Ze */
    public boolean mo82985Ze() {
        return C38980b.f105023a.mo61860a();
    }

    /* renamed from: Zk */
    public void mo82986Zk(Context context, long j, Intent intent, C58245c cVar) {
        C58245c cVar2 = cVar;
        Context context2 = context;
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "originIntent");
        C87412m.m108594g(cVar2, ProviderConstants.API_PATH);
        if (this.f174732d == null) {
            this.f174732d = new MaasTemplateApiFlutterPlugin(cVar2, this);
        }
        C53895h.m60466d(this.f174734f, (C66212f) null, (C53934p0) null, new C61446b(j, this, context, intent, (C15601d<? super C61446b>) null), 3, (Object) null);
    }

    public void bv0(Activity activity, int i, ArrayList<GalleryItem$MediaItem> arrayList, Intent intent) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(arrayList, "mediaList");
        C87412m.m108594g(intent, "intent");
        int i2 = MaasAlbumTemplatePreviewUI.f157458g;
        intent.setClass(activity, MaasAlbumTemplatePreviewUI.class);
        intent.putParcelableArrayListExtra("Template_Media_List", arrayList);
        intent.putExtra("source_sns", true);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/mj_template/album_template/single_template/MaasAlbumTemplatePreviewUI$Companion", "jumpToTemplateUI", "(Landroid/app/Activity;ILjava/util/ArrayList;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* renamed from: cy */
    public void mo82988cy(String str, boolean z) {
        C87412m.m108594g(str, "templateId");
        C62586b.f177739a.mo87647g(str, z ? 2 : 4);
    }

    /* renamed from: fB */
    public pr4 mo82989fB(String str) {
        C87412m.m108594g(str, "templateId");
        return C62586b.f177739a.mo87646f(str);
    }

    public C39630m0 getViewModelStore() {
        return this.f174736h.f152776f;
    }

    public void ii0(Context context, String str, Intent intent, C58245c cVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "recMusicId");
        C87412m.m108594g(intent, "originIntent");
        C87412m.m108594g(cVar, ProviderConstants.API_PATH);
        if (this.f174732d == null) {
            this.f174732d = new MaasTemplateApiFlutterPlugin(cVar, this);
        }
        C108221t.f324032a.mo158631k(false);
        C53895h.m60466d(this.f174734f, (C66212f) null, (C53934p0) null, new C61447c(str, this, context, intent, (C15601d<? super C61447c>) null), 3, (Object) null);
    }

    public /* bridge */ /* synthetic */ C97455f ni0() {
        return C46974e.f126289a;
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        if (MMApplicationContext.isMainProcess()) {
            MaasTemplateResMgr.f79455g.mo56373e();
            MaasTemplateResMgr.f79456h.mo56373e();
        }
        C33848g gVar = C33848g.f91487a;
        Class cls = C32147e.class;
        Log.m105924i("MicroMsg.MaasSdkResMgr", "init: 11100015");
        if (!BuildInfo.IS_ARM64) {
            Log.m105928w("MicroMsg.MaasSdkResMgr", "check res only arm64");
            return;
        }
        List<C118881x7> Us = ((C32147e) C86312j.m106911c(cls)).mo58509Us(103);
        if (Us != null) {
            for (C118881x7 x7Var : Us) {
                int i = x7Var.field_subType;
                if (!C86013q1.m106450k(C33847f.f91484b + XVFSFile.SEPARATOR_CHAR + i)) {
                    String AD = ((C32147e) C86312j.m106911c(cls)).mo58507AD(103, i);
                    Log.m105924i("MicroMsg.MaasSdkResMgr", "init: get cached file " + i + ", " + AD);
                    if (AD != null) {
                        C33848g gVar2 = C33848g.f91487a;
                        ReentrantLock reentrantLock = C33848g.f91489c;
                        reentrantLock.lock();
                        try {
                            gVar2.mo59327g(i, AD);
                            reentrantLock.unlock();
                        } catch (Throwable th) {
                            C33848g.f91489c.unlock();
                            throw th;
                        }
                    }
                }
            }
        }
        ((C119157j) C119157j.f356862d).mo183878i(C9574i.f29813d, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        C61926c.m72658C((String) null, C33854h.f91496d, 1, (Object) null);
        Log.m105924i("MicroMsg.MaasSdkResMgr", "init: end");
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        this.f174736h.mo75334c();
    }

    public void onCreate(Context context) {
        C87412m.m108594g(context, "context");
        this.f174736h.mo75333b("PluginMaasTemplate");
    }

    /* renamed from: pn */
    public int mo82992pn() {
        return MJMaasVersion.VERSION_NUMBER_INT_VALUE;
    }

    public void q40(Context context, Intent intent, MaasAlbumMultiTemplateRequestParams maasAlbumMultiTemplateRequestParams) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(intent, "originIntent");
        C87412m.m108594g(maasAlbumMultiTemplateRequestParams, "params");
        Log.m105924i("MicroMsg.PluginMJTemplate", "enterMultiTemplatePreviewUI");
        intent.setClass(context, MaasAlbumMultiTemplatePreviewUI.class);
        intent.putExtra("request_params", maasAlbumMultiTemplateRequestParams);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/mj_template/plugin/PluginMaasTemplate", "enterMultiTemplatePreviewUI", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/mj_template/api/MaasAlbumMultiTemplateRequestParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/mj_template/plugin/PluginMaasTemplate", "enterMultiTemplatePreviewUI", "(Landroid/content/Context;Landroid/content/Intent;Lcom/tencent/mm/mj_template/api/MaasAlbumMultiTemplateRequestParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void qi0(android.app.Activity r9, te3.C64237ap1 r10, android.content.Intent r11, int r12) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r0 = "templateInfo"
            gy3.C87412m.m108594g(r10, r0)
            java.lang.String r0 = "originIntent"
            gy3.C87412m.m108594g(r11, r0)
            r8.On0()
            if (r12 <= 0) goto L_0x0026
            java.lang.Class<ht1.t1> r0 = ht1.C60200t1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t1 r0 = (ht1.C60200t1) r0
            ht1.z4 r0 = r0.mo76861l7()
            r1 = 133(0x85, float:1.86E-43)
            r0.mo83776W5(r9, r11, r1, r12)
        L_0x0026:
            java.lang.String r12 = r10.f182115d
            java.lang.String r0 = ""
            if (r12 != 0) goto L_0x002d
            r12 = r0
        L_0x002d:
            te3.pr4 r12 = r8.mo82989fB(r12)
            if (r12 != 0) goto L_0x004f
            te3.pr4 r12 = new te3.pr4
            r12.<init>()
            java.lang.String r1 = r10.f182115d
            r12.f139919d = r1
            int r1 = r10.f182116e
            r12.f139920e = r1
            int r1 = r10.f182117f
            r12.f139921f = r1
            te3.vy r1 = new te3.vy
            r1.<init>()
            int r2 = r10.f182118g
            r1.f143761e = r2
            r12.f139922g = r1
        L_0x004f:
            java.lang.Class<lr.b> r1 = p599lr.C61381b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            lr.b r1 = (p599lr.C61381b) r1
            qo1.i r2 = r1.Yp0()
            int r1 = r10.f182116e
            r3 = 2
            if (r1 != r3) goto L_0x0079
            byte[] r12 = r12.toByteArray()
            java.lang.String r0 = "KEY_POST_VIDEO_TEMPLATE"
            r11.putExtra(r0, r12)
            int r10 = r10.f182123o
            if (r10 <= 0) goto L_0x0072
            java.lang.String r12 = "key_activity_camera_position"
            r11.putExtra(r12, r10)
        L_0x0072:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            r2.mo88199j(r9, r11)
            goto L_0x00df
        L_0x0079:
            com.tencent.mm.mj_template.api.MJTemplateSession r1 = new com.tencent.mm.mj_template.api.MJTemplateSession
            byte[] r3 = r12.toByteArray()
            java.lang.String r4 = "videoTemplate.toByteArray()"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.String r10 = r10.f182121j
            if (r10 != 0) goto L_0x008a
            r10 = r0
        L_0x008a:
            r1.<init>(r3, r10)
            java.lang.String r10 = "mj_template_session"
            r11.putExtra(r10, r1)
            te3.vy r10 = r12.f139922g
            r1 = 0
            if (r10 == 0) goto L_0x009a
            java.lang.String r10 = r10.f143762f
            goto L_0x009b
        L_0x009a:
            r10 = r1
        L_0x009b:
            if (r10 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r0 = r10
        L_0x009f:
            java.lang.String r10 = "album_footer_info_str"
            r11.putExtra(r10, r0)
            te3.m4 r10 = r12.f139924i
            r0 = 0
            if (r10 == 0) goto L_0x00c2
            int r10 = r10.f137827e
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r3 = r10.intValue()
            if (r3 <= 0) goto L_0x00b7
            r3 = 1
            goto L_0x00b8
        L_0x00b7:
            r3 = 0
        L_0x00b8:
            if (r3 == 0) goto L_0x00bb
            r1 = r10
        L_0x00bb:
            if (r1 == 0) goto L_0x00c2
            int r10 = r1.intValue()
            goto L_0x00c4
        L_0x00c2:
            r10 = 20
        L_0x00c4:
            java.lang.String r1 = "max_select_count"
            r11.putExtra(r1, r10)
            te3.m4 r10 = r12.f139924i
            if (r10 == 0) goto L_0x00cf
            int r0 = r10.f137826d
        L_0x00cf:
            java.lang.String r10 = "min_select_count"
            r11.putExtra(r10, r0)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            r5 = 3
            r6 = 0
            r7 = 666(0x29a, float:9.33E-43)
            r3 = r9
            r4 = r11
            r2.mo88198i(r3, r4, r5, r6, r7)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ma0.C61445c.qi0(android.app.Activity, te3.ap1, android.content.Intent, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object vx0(long r19, java.lang.String r21, java.lang.String r22, wx3.C15601d<? super rx3.C13598b0> r23) {
        /*
            r18 = this;
            r0 = r18
            r10 = r19
            r12 = r21
            r1 = r23
            boolean r2 = r1 instanceof ma0.C61445c.C61448e
            if (r2 == 0) goto L_0x001b
            r2 = r1
            ma0.c$e r2 = (ma0.C61445c.C61448e) r2
            int r3 = r2.f174751h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f174751h = r3
            goto L_0x0020
        L_0x001b:
            ma0.c$e r2 = new ma0.c$e
            r2.<init>(r0, r1)
        L_0x0020:
            r13 = r2
            java.lang.Object r1 = r13.f174749f
            xx3.a r14 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r13.f174751h
            r15 = 1
            java.lang.String r9 = "MicroMsg.PluginMJTemplate"
            if (r2 == 0) goto L_0x0042
            if (r2 != r15) goto L_0x003a
            long r2 = r13.f174748e
            java.lang.Object r4 = r13.f174747d
            ma0.c$a r4 = (ma0.C61445c.C34487a) r4
            kotlin.ResultKt.throwOnFailure(r1)
            r14 = r9
            goto L_0x00e4
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "preload flutter engine impl with topicId: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = ", priorityTplId: "
            r1.append(r2)
            r1.append(r12)
            r2 = 32
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
            ma0.c$a r8 = new ma0.c$a
            r5 = 0
            r6 = 0
            r7 = 0
            r16 = 28
            r17 = 0
            r1 = r8
            r2 = r19
            r4 = r21
            r15 = r8
            r8 = r16
            r16 = r14
            r14 = r9
            r9 = r17
            r1.<init>(r2, r4, r5, r6, r7, r8, r9)
            ma0.c$a r1 = r0.f174733e
            boolean r1 = gy3.C87412m.m108589b(r1, r15)
            if (r1 != 0) goto L_0x011a
            ma0.c$a r1 = r0.f174733e
            if (r1 == 0) goto L_0x00bb
            if (r1 == 0) goto L_0x0090
            java.lang.String r1 = r1.f92817d
            goto L_0x0091
        L_0x0090:
            r1 = 0
        L_0x0091:
            if (r1 == 0) goto L_0x00bb
            java.lang.String r1 = "has unreleased engine"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r14, r1)
            ma0.c$a r1 = r0.f174733e
            if (r1 == 0) goto L_0x00bb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "do release first "
            r2.append(r3)
            java.lang.String r3 = r1.f92817d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            io.flutter.embedding.engine.FlutterEngineCache r2 = p172io.flutter.embedding.engine.FlutterEngineCache.getInstance()
            java.lang.String r1 = r1.f92817d
            r2.remove(r1)
        L_0x00bb:
            r0.f174733e = r15
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            java.lang.Class<pr.f> r1 = p220pr.C62491f.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            pr.f r1 = (p220pr.C62491f) r1
            r4 = 0
            ma0.c$f r5 = new ma0.c$f
            r6 = r22
            r5.<init>(r10, r12, r6)
            r13.f174747d = r15
            r13.f174748e = r2
            r6 = 1
            r13.f174751h = r6
            java.lang.String r6 = "mj_template"
            java.lang.Object r1 = r1.xo0(r6, r4, r5, r13)
            r4 = r16
            if (r1 != r4) goto L_0x00e3
            return r4
        L_0x00e3:
            r4 = r15
        L_0x00e4:
            rx3.l r1 = (rx3.C13604l) r1
            A r5 = r1.f38555d
            java.lang.String r5 = (java.lang.String) r5
            B r1 = r1.f38556e
            io.flutter.embedding.engine.FlutterEngine r1 = (p172io.flutter.embedding.engine.FlutterEngine) r1
            r4.getClass()
            java.lang.String r6 = "<set-?>"
            gy3.C87412m.m108594g(r5, r6)
            r4.f92817d = r5
            r4.f92818e = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "preload flutter engine finished cost:"
            r1.append(r4)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.ticksToNow(r2)
            r1.append(r2)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
        L_0x011a:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ma0.C61445c.vx0(long, java.lang.String, java.lang.String, wx3.d):java.lang.Object");
    }

    public void wq0(Activity activity, int i, List<? extends GalleryItem$MediaItem> list, Intent intent) {
        C13598b0 b0Var;
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(list, "mediaList");
        C87412m.m108594g(intent, "originIntent");
        Log.m105924i("MicroMsg.PluginMJTemplate", "enterAlubmTemplatePreviewUI");
        MJTemplateSession mJTemplateSession = (MJTemplateSession) intent.getParcelableExtra("mj_template_session");
        if (mJTemplateSession != null) {
            Intent intent2 = new Intent(activity, MaasAlbumTemplatePreviewUI.class);
            intent2.putExtras(intent);
            intent2.putExtra("request_params", new MaasAlbumTemplateRequestParams(list, mJTemplateSession));
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            aVar.mo10233c(intent2);
            C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/mj_template/plugin/PluginMaasTemplate", "enterAlubmTemplatePreviewUI", "(Landroid/app/Activity;ILjava/util/List;Landroid/content/Intent;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105920e("MicroMsg.PluginMJTemplate", "mjTemplateSession is null");
        }
    }

    public C7256b yf0() {
        return C34486b.f92813a;
    }
}
