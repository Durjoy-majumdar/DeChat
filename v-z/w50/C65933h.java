package w50;

import a14.C0000n0;
import a70.C112760b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import k14.C60949f;
import k14.C99088c;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: w50.h */
public final class C65933h {

    /* renamed from: a */
    public static final C65933h f189544a = new C65933h();

    /* renamed from: b */
    public static final String f189545b = (C112760b.m154231g() + "live/super_cdn_zip_makeup_v_001");

    /* renamed from: c */
    public static final String f189546c;

    /* renamed from: d */
    public static final String f189547d;

    /* renamed from: e */
    public static final String f189548e;

    /* renamed from: f */
    public static boolean f189549f;

    /* renamed from: g */
    public static final C99088c f189550g = C60949f.m71437a(false, 1, (Object) null);

    /* renamed from: h */
    public static final C99088c f189551h = C60949f.m71437a(false, 1, (Object) null);

    /* renamed from: w50.h$a */
    public enum C65934a {
        LiveAnchorTRTCCore("LiveAnchorTRTCCore"),
        FinderLiveAnchorCameraOptPanelPlugin("FinderLiveAnchorCameraOptPanelPlugin"),
        PluginLive("PluginLive");

        /* access modifiers changed from: public */
        C65934a(String str) {
        }
    }

    /* renamed from: w50.h$b */
    public static final class C65935b {

        /* renamed from: a */
        public final int f189556a;

        /* renamed from: b */
        public final String f189557b;

        /* renamed from: c */
        public final int f189558c;

        /* renamed from: d */
        public final String f189559d;

        /* renamed from: e */
        public final String f189560e;

        public C65935b(int i, String str, int i2, String str2, String str3) {
            C87412m.m108594g(str, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C87412m.m108594g(str2, "makeupPath");
            C87412m.m108594g(str3, "filterPath");
            this.f189556a = i;
            this.f189557b = str;
            this.f189558c = i2;
            this.f189559d = str2;
            this.f189560e = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C65935b)) {
                return false;
            }
            C65935b bVar = (C65935b) obj;
            return this.f189556a == bVar.f189556a && C87412m.m108589b(this.f189557b, bVar.f189557b) && this.f189558c == bVar.f189558c && C87412m.m108589b(this.f189559d, bVar.f189559d) && C87412m.m108589b(this.f189560e, bVar.f189560e);
        }

        public int hashCode() {
            return (((((((this.f189556a * 31) + this.f189557b.hashCode()) * 31) + this.f189558c) * 31) + this.f189559d.hashCode()) * 31) + this.f189560e.hashCode();
        }

        public String toString() {
            return "MakeupInfo(makeupId=" + this.f189556a + ", title=" + this.f189557b + ", bgRes=" + this.f189558c + ", makeupPath=" + this.f189559d + ", filterPath=" + this.f189560e + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.live.core.util.LiveMakeupUtil", mo125469f = "LiveMakeupUtil.kt", mo125470l = {231}, mo125471m = "checkAndMakeToReady")
    /* renamed from: w50.h$c */
    public static final class C65936c extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f189561d;

        /* renamed from: e */
        public final /* synthetic */ C65933h f189562e;

        /* renamed from: f */
        public int f189563f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65936c(C65933h hVar, C15601d<? super C65936c> dVar) {
            super(dVar);
            this.f189562e = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f189561d = obj;
            this.f189563f |= Integer.MIN_VALUE;
            return this.f189562e.mo89974d((C65934a) null, false, (C32224a<Boolean>) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.live.core.util.LiveMakeupUtil$checkAndMakeToReady$2", mo125469f = "LiveMakeupUtil.kt", mo125470l = {519, 273, 274}, mo125471m = "invokeSuspend")
    /* renamed from: w50.h$d */
    public static final class C65937d extends C91594j implements C32227p<C0000n0, C15601d<? super Object>, Object> {

        /* renamed from: d */
        public Object f189564d;

        /* renamed from: e */
        public Object f189565e;

        /* renamed from: f */
        public Object f189566f;

        /* renamed from: g */
        public Object f189567g;

        /* renamed from: h */
        public boolean f189568h;

        /* renamed from: i */
        public int f189569i;

        /* renamed from: j */
        public final /* synthetic */ C65934a f189570j;

        /* renamed from: n */
        public final /* synthetic */ String f189571n;

        /* renamed from: o */
        public final /* synthetic */ C32224a<Boolean> f189572o;

        /* renamed from: p */
        public final /* synthetic */ boolean f189573p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65937d(C65934a aVar, String str, C32224a<Boolean> aVar2, boolean z, C15601d<? super C65937d> dVar) {
            super(2, dVar);
            this.f189570j = aVar;
            this.f189571n = str;
            this.f189572o = aVar2;
            this.f189573p = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C65937d(this.f189570j, this.f189571n, this.f189572o, this.f189573p, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C65937d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: k14.d} */
        /* JADX WARNING: type inference failed for: r4v9 */
        /* JADX WARNING: type inference failed for: r4v13, types: [k14.c] */
        /* JADX WARNING: type inference failed for: r4v14, types: [k14.c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x020f A[Catch:{ all -> 0x0054 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0211 A[Catch:{ all -> 0x0054 }] */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x021e A[Catch:{ all -> 0x0054 }] */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0254 A[Catch:{ all -> 0x0054 }] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0256 A[Catch:{ all -> 0x0054 }] */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0259 A[Catch:{ all -> 0x0054 }] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x01d0=Splitter:B:64:0x01d0, B:71:0x01f7=Splitter:B:71:0x01f7, B:92:0x0278=Splitter:B:92:0x0278} */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r1 = r18
                java.lang.Class<fp.e> r0 = p523fp.C32147e.class
                w50.h$a r2 = w50.C65933h.C65934a.FinderLiveAnchorCameraOptPanelPlugin
                xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r1.f189569i
                r6 = 2
                r7 = 3
                r9 = 1
                java.lang.String r10 = " resource ready, done"
                java.lang.String r11 = " isLiving:"
                r12 = 0
                java.lang.String r13 = "#checkAndMakeToReady from:"
                java.lang.String r14 = "LiveMakeupUtil"
                if (r4 == 0) goto L_0x0073
                if (r4 == r9) goto L_0x0057
                if (r4 == r6) goto L_0x003d
                if (r4 != r7) goto L_0x0035
                java.lang.Object r3 = r1.f189567g
                w50.h$a r3 = (w50.C65933h.C65934a) r3
                java.lang.Object r4 = r1.f189566f
                fy3.a r4 = (fy3.C32224a) r4
                java.lang.Object r6 = r1.f189565e
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r1.f189564d
                k14.c r7 = (k14.C99088c) r7
                kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x0054 }
                r5 = r19
                goto L_0x01f7
            L_0x0035:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x003d:
                java.lang.Object r3 = r1.f189567g
                w50.h$a r3 = (w50.C65933h.C65934a) r3
                java.lang.Object r4 = r1.f189566f
                fy3.a r4 = (fy3.C32224a) r4
                java.lang.Object r6 = r1.f189565e
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r7 = r1.f189564d
                k14.c r7 = (k14.C99088c) r7
                kotlin.ResultKt.throwOnFailure(r19)     // Catch:{ all -> 0x0054 }
                r5 = r19
                goto L_0x01d0
            L_0x0054:
                r0 = move-exception
                goto L_0x0281
            L_0x0057:
                boolean r4 = r1.f189568h
                java.lang.Object r15 = r1.f189567g
                w50.h$a r15 = (w50.C65933h.C65934a) r15
                java.lang.Object r7 = r1.f189566f
                fy3.a r7 = (fy3.C32224a) r7
                java.lang.Object r6 = r1.f189565e
                java.lang.String r6 = (java.lang.String) r6
                java.lang.Object r8 = r1.f189564d
                k14.c r8 = (k14.C99088c) r8
                kotlin.ResultKt.throwOnFailure(r19)
                r17 = r7
                r7 = r4
            L_0x006f:
                r4 = r17
                goto L_0x010a
            L_0x0073:
                kotlin.ResultKt.throwOnFailure(r19)
                java.lang.String r4 = eb0.C75592q0.m90778h()
                if (r4 == 0) goto L_0x0085
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0083
                goto L_0x0085
            L_0x0083:
                r4 = 0
                goto L_0x0086
            L_0x0085:
                r4 = 1
            L_0x0086:
                if (r4 == 0) goto L_0x0090
                java.lang.String r0 = "#checkAndMakeToReady no have account"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L_0x0090:
                android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                boolean r4 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.isConnected((android.content.Context) r4)
                if (r4 != 0) goto L_0x00a2
                java.lang.String r0 = "#checkAndMakeToReady no have network"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L_0x00a2:
                w50.h$a r4 = r1.f189570j
                if (r4 != r2) goto L_0x00a9
                k14.c r4 = w50.C65933h.f189551h
                goto L_0x00ab
            L_0x00a9:
                k14.c r4 = w50.C65933h.f189550g
            L_0x00ab:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r13)
                java.lang.String r7 = r1.f189571n
                r6.append(r7)
                r6.append(r11)
                fy3.a<java.lang.Boolean> r7 = r1.f189572o
                java.lang.Object r7 = r7.invoke()
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                r6.append(r7)
                java.lang.String r7 = " forceDoCheck:"
                r6.append(r7)
                boolean r7 = r1.f189573p
                r6.append(r7)
                java.lang.String r7 = " mutex.isLocked="
                r6.append(r7)
                r8 = r4
                k14.d r8 = (k14.C60942d) r8
                boolean r4 = r8.mo85907a()
                r6.append(r4)
                java.lang.String r4 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
                java.lang.String r4 = r1.f189571n
                fy3.a<java.lang.Boolean> r6 = r1.f189572o
                boolean r7 = r1.f189573p
                w50.h$a r15 = r1.f189570j
                r1.f189564d = r8
                r1.f189565e = r4
                r1.f189566f = r6
                r1.f189567g = r15
                r1.f189568h = r7
                r1.f189569i = r9
                java.lang.Object r5 = r8.mo85908b(r12, r1)
                if (r5 != r3) goto L_0x0105
                return r3
            L_0x0105:
                r17 = r6
                r6 = r4
                goto L_0x006f
            L_0x010a:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
                r5.<init>()     // Catch:{ all -> 0x0283 }
                r5.append(r13)     // Catch:{ all -> 0x0283 }
                r5.append(r6)     // Catch:{ all -> 0x0283 }
                r5.append(r11)     // Catch:{ all -> 0x0283 }
                java.lang.Object r11 = r4.invoke()     // Catch:{ all -> 0x0283 }
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0283 }
                boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0283 }
                r5.append(r11)     // Catch:{ all -> 0x0283 }
                java.lang.String r11 = " get in"
                r5.append(r11)     // Catch:{ all -> 0x0283 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0283 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)     // Catch:{ all -> 0x0283 }
                if (r15 != r2) goto L_0x0136
                java.lang.String r5 = w50.C65933h.f189545b     // Catch:{ all -> 0x0283 }
                goto L_0x0144
            L_0x0136:
                w50.h r5 = w50.C65933h.f189544a     // Catch:{ all -> 0x0283 }
                di3.d r5 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0283 }
                fp.e r5 = (p523fp.C32147e) r5     // Catch:{ all -> 0x0283 }
                r11 = 151(0x97, float:2.12E-43)
                java.lang.String r5 = r5.mo58507AD(r11, r9)     // Catch:{ all -> 0x0283 }
            L_0x0144:
                w50.C65933h.m77666a(r4, r6, r5)     // Catch:{ all -> 0x0283 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
                r5.<init>()     // Catch:{ all -> 0x0283 }
                r5.append(r13)     // Catch:{ all -> 0x0283 }
                r5.append(r6)     // Catch:{ all -> 0x0283 }
                java.lang.String r11 = " first time checkAndUnzip done"
                r5.append(r11)     // Catch:{ all -> 0x0283 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0283 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)     // Catch:{ all -> 0x0283 }
                java.lang.String r5 = w50.C65933h.f189546c     // Catch:{ all -> 0x0283 }
                r11 = 0
                java.lang.Iterable r16 = com.tencent.p014mm.vfs.C86013q1.m106459t(r5, r11)     // Catch:{ all -> 0x0283 }
                if (r16 == 0) goto L_0x0169
                r11 = 1
                goto L_0x016a
            L_0x0169:
                r11 = 0
            L_0x016a:
                if (r11 == 0) goto L_0x0183
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
                r11.<init>()     // Catch:{ all -> 0x0283 }
                r11.append(r13)     // Catch:{ all -> 0x0283 }
                r11.append(r6)     // Catch:{ all -> 0x0283 }
                r11.append(r10)     // Catch:{ all -> 0x0283 }
                java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0283 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r11)     // Catch:{ all -> 0x0283 }
                w50.C65933h.f189549f = r9     // Catch:{ all -> 0x0283 }
            L_0x0183:
                java.lang.Object r11 = r4.invoke()     // Catch:{ all -> 0x0283 }
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x0283 }
                boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x0283 }
                if (r11 == 0) goto L_0x0191
                if (r7 != 0) goto L_0x019d
            L_0x0191:
                r7 = 0
                java.lang.Iterable r5 = com.tencent.p014mm.vfs.C86013q1.m106459t(r5, r7)     // Catch:{ all -> 0x0283 }
                if (r5 == 0) goto L_0x019a
                r11 = 1
                goto L_0x019b
            L_0x019a:
                r11 = 0
            L_0x019b:
                if (r11 != 0) goto L_0x0277
            L_0x019d:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0283 }
                r5.<init>()     // Catch:{ all -> 0x0283 }
                r5.append(r13)     // Catch:{ all -> 0x0283 }
                r5.append(r6)     // Catch:{ all -> 0x0283 }
                java.lang.String r7 = " ready to download"
                r5.append(r7)     // Catch:{ all -> 0x0283 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0283 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r5)     // Catch:{ all -> 0x0283 }
                if (r15 != r2) goto L_0x01d7
                w50.h r5 = w50.C65933h.f189544a     // Catch:{ all -> 0x0283 }
                java.lang.String r7 = "https://dldir1.qq.com/weixin/android/weixin_finder_live_beauty_res_1.0.zip"
                java.lang.String r11 = w50.C65933h.f189545b     // Catch:{ all -> 0x0283 }
                r1.f189564d = r8     // Catch:{ all -> 0x0283 }
                r1.f189565e = r6     // Catch:{ all -> 0x0283 }
                r1.f189566f = r4     // Catch:{ all -> 0x0283 }
                r1.f189567g = r15     // Catch:{ all -> 0x0283 }
                r12 = 2
                r1.f189569i = r12     // Catch:{ all -> 0x0283 }
                java.lang.Object r5 = w50.C65933h.m77668c(r5, r7, r11, r1)     // Catch:{ all -> 0x0283 }
                if (r5 != r3) goto L_0x01ce
                return r3
            L_0x01ce:
                r7 = r8
                r3 = r15
            L_0x01d0:
                java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0054 }
                boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0054 }
                goto L_0x01fd
            L_0x01d7:
                w50.h r5 = w50.C65933h.f189544a     // Catch:{ all -> 0x0283 }
                java.lang.Object r7 = r4.invoke()     // Catch:{ all -> 0x0283 }
                java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0283 }
                boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0283 }
                r1.f189564d = r8     // Catch:{ all -> 0x0283 }
                r1.f189565e = r6     // Catch:{ all -> 0x0283 }
                r1.f189566f = r4     // Catch:{ all -> 0x0283 }
                r1.f189567g = r15     // Catch:{ all -> 0x0283 }
                r11 = 3
                r1.f189569i = r11     // Catch:{ all -> 0x0283 }
                java.lang.Object r5 = w50.C65933h.m77667b(r5, r15, r7, r1)     // Catch:{ all -> 0x0283 }
                if (r5 != r3) goto L_0x01f5
                return r3
            L_0x01f5:
                r7 = r8
                r3 = r15
            L_0x01f7:
                java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x0054 }
                boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x0054 }
            L_0x01fd:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
                r8.<init>()     // Catch:{ all -> 0x0054 }
                r8.append(r13)     // Catch:{ all -> 0x0054 }
                r8.append(r6)     // Catch:{ all -> 0x0054 }
                java.lang.String r11 = " downloadResult="
                r8.append(r11)     // Catch:{ all -> 0x0054 }
                if (r5 == 0) goto L_0x0211
                r11 = 1
                goto L_0x0212
            L_0x0211:
                r11 = 0
            L_0x0212:
                r8.append(r11)     // Catch:{ all -> 0x0054 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0054 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r8)     // Catch:{ all -> 0x0054 }
                if (r5 == 0) goto L_0x024b
                if (r3 != r2) goto L_0x0223
                java.lang.String r0 = w50.C65933h.f189545b     // Catch:{ all -> 0x0054 }
                goto L_0x0231
            L_0x0223:
                w50.h r2 = w50.C65933h.f189544a     // Catch:{ all -> 0x0054 }
                di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x0054 }
                fp.e r0 = (p523fp.C32147e) r0     // Catch:{ all -> 0x0054 }
                r2 = 151(0x97, float:2.12E-43)
                java.lang.String r0 = r0.mo58507AD(r2, r9)     // Catch:{ all -> 0x0054 }
            L_0x0231:
                w50.C65933h.m77666a(r4, r6, r0)     // Catch:{ all -> 0x0054 }
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
                r0.<init>()     // Catch:{ all -> 0x0054 }
                r0.append(r13)     // Catch:{ all -> 0x0054 }
                r0.append(r6)     // Catch:{ all -> 0x0054 }
                java.lang.String r2 = " secondly time checkAndUnzip done"
                r0.append(r2)     // Catch:{ all -> 0x0054 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0054 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)     // Catch:{ all -> 0x0054 }
            L_0x024b:
                java.lang.String r0 = w50.C65933h.f189546c     // Catch:{ all -> 0x0054 }
                r2 = 0
                java.lang.Iterable r0 = com.tencent.p014mm.vfs.C86013q1.m106459t(r0, r2)     // Catch:{ all -> 0x0054 }
                if (r0 == 0) goto L_0x0256
                r8 = 1
                goto L_0x0257
            L_0x0256:
                r8 = 0
            L_0x0257:
                if (r8 == 0) goto L_0x0278
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0054 }
                r0.<init>()     // Catch:{ all -> 0x0054 }
                r0.append(r13)     // Catch:{ all -> 0x0054 }
                r0.append(r6)     // Catch:{ all -> 0x0054 }
                r0.append(r10)     // Catch:{ all -> 0x0054 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0054 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)     // Catch:{ all -> 0x0054 }
                w50.C65933h.f189549f = r9     // Catch:{ all -> 0x0054 }
                java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0054 }
                r2 = 0
                r7.mo85909c(r2)
                return r0
            L_0x0277:
                r7 = r8
            L_0x0278:
                rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0054 }
                r2 = 0
                r7.mo85909c(r2)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0281:
                r8 = r7
                goto L_0x0284
            L_0x0283:
                r0 = move-exception
            L_0x0284:
                r2 = 0
                r8.mo85909c(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: w50.C65933h.C65937d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        String str = C112760b.m154231g() + "live/makeup_v_001";
        f189546c = str;
        f189547d = str + "/for_makeup";
        f189548e = str + "/for_filter";
    }

    /* renamed from: a */
    public static final void m77666a(C32224a aVar, String str, String str2) {
        String str3 = f189546c;
        boolean z = false;
        if (!(C86013q1.m106459t(str3, false) != null) || !((Boolean) aVar.invoke()).booleanValue()) {
            Log.m105924i("LiveMakeupUtil", "#checkAndMakeToReady-checkAndUnzip from:" + str + " filePath=" + str2);
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z && C86013q1.m106450k(str2)) {
                Log.m105924i("LiveMakeupUtil", "#checkAndMakeToReady-checkAndUnzip from:" + str + " unzip it");
                C86013q1.m106445f(str3);
                C86013q1.m106436R(str2, str3);
                return;
            }
            return;
        }
        Log.m105924i("LiveMakeupUtil", "#checkAndMakeToReady-checkAndUnzip from:" + str + " is exist, return");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m77667b(w50.C65933h r10, w50.C65933h.C65934a r11, boolean r12, wx3.C15601d r13) {
        /*
            r10.getClass()
            boolean r0 = r13 instanceof w50.C65938i
            if (r0 == 0) goto L_0x0016
            r0 = r13
            w50.i r0 = (w50.C65938i) r0
            int r1 = r0.f189580j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f189580j = r1
            goto L_0x001b
        L_0x0016:
            w50.i r0 = new w50.i
            r0.<init>(r10, r13)
        L_0x001b:
            java.lang.Object r10 = r0.f189578h
            xx3.a r13 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r0.f189580j
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0046
            if (r1 != r2) goto L_0x003e
            long r11 = r0.f189577g
            int r13 = r0.f189576f
            java.lang.Object r1 = r0.f189575e
            gy3.f0 r1 = (gy3.C8479f0) r1
            java.lang.Object r0 = r0.f189574d
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            goto L_0x00cb
        L_0x0038:
            r10 = move-exception
            goto L_0x00d3
        L_0x003b:
            goto L_0x00de
        L_0x003e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = r11.name()
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            java.lang.Class<fp.e> r4 = p523fp.C32147e.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            fp.e r4 = (p523fp.C32147e) r4
            r5 = 151(0x97, float:2.12E-43)
            java.lang.String r4 = r4.mo58507AD(r5, r2)
            if (r4 == 0) goto L_0x006b
            int r5 = r4.length()
            if (r5 != 0) goto L_0x0069
            goto L_0x006b
        L_0x0069:
            r5 = 0
            goto L_0x006c
        L_0x006b:
            r5 = 1
        L_0x006c:
            if (r5 != 0) goto L_0x0076
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r5 == 0) goto L_0x0076
            r5 = 1
            goto L_0x0077
        L_0x0076:
            r5 = 0
        L_0x0077:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "#downloadCdnRes from:"
            r6.append(r7)
            r6.append(r10)
            java.lang.String r7 = " isLiving:"
            r6.append(r7)
            r6.append(r12)
            java.lang.String r12 = " filePath="
            r6.append(r12)
            r6.append(r4)
            java.lang.String r12 = " isZipExist="
            r6.append(r12)
            r6.append(r5)
            java.lang.String r12 = r6.toString()
            java.lang.String r4 = "LiveMakeupUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
            w50.h$a r12 = w50.C65933h.C65934a.FinderLiveAnchorCameraOptPanelPlugin
            if (r11 == r12) goto L_0x0116
            long r11 = java.lang.System.currentTimeMillis()
            r6 = 60000(0xea60, double:2.9644E-319)
            w50.j r4 = new w50.j     // Catch:{ Exception -> 0x00db, all -> 0x00d6 }
            r8 = 0
            r4.<init>(r1, r10, r8)     // Catch:{ Exception -> 0x00db, all -> 0x00d6 }
            r0.f189574d = r10     // Catch:{ Exception -> 0x00db, all -> 0x00d6 }
            r0.f189575e = r1     // Catch:{ Exception -> 0x00db, all -> 0x00d6 }
            r0.f189576f = r5     // Catch:{ Exception -> 0x00db, all -> 0x00d6 }
            r0.f189577g = r11     // Catch:{ Exception -> 0x00db, all -> 0x00d6 }
            r0.f189580j = r2     // Catch:{ Exception -> 0x00db, all -> 0x00d6 }
            java.lang.Object r0 = a14.C53860b3.m60374b(r6, r4, r0)     // Catch:{ Exception -> 0x00db, all -> 0x00d6 }
            if (r0 != r13) goto L_0x00c7
            goto L_0x011a
        L_0x00c7:
            r13 = r5
            r9 = r0
            r0 = r10
            r10 = r9
        L_0x00cb:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            boolean r10 = r10.booleanValue()     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            r3 = r10
            goto L_0x00de
        L_0x00d3:
            r11 = r10
            r10 = r0
            goto L_0x00d7
        L_0x00d6:
            r11 = move-exception
        L_0x00d7:
            m77669e(r1, r10)
            throw r11
        L_0x00db:
            r0 = r10
            r13 = r5
        L_0x00de:
            m77669e(r1, r0)
            long r1 = java.lang.System.currentTimeMillis()
            if (r13 != 0) goto L_0x0116
            mr.q r10 = p204mr.C61570q.MAKEUP_RES_CDN
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r4 = "result="
            r13.append(r4)
            r13.append(r3)
            java.lang.String r4 = " consuming="
            r13.append(r4)
            long r1 = r1 - r11
            r13.append(r1)
            java.lang.String r11 = " from="
            r13.append(r11)
            r13.append(r0)
            java.lang.String r11 = r13.toString()
            java.lang.Class<mr.i> r12 = p204mr.C61567i.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            mr.i r12 = (p204mr.C61567i) r12
            r12.mo86501dh(r10, r11)
        L_0x0116:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
        L_0x011a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: w50.C65933h.m77667b(w50.h, w50.h$a, boolean, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m77668c(w50.C65933h r16, java.lang.String r17, java.lang.String r18, wx3.C15601d r19) {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r16.getClass()
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            boolean r4 = r2 instanceof w50.C65939k
            if (r4 == 0) goto L_0x001e
            r4 = r2
            w50.k r4 = (w50.C65939k) r4
            int r5 = r4.f189586i
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001e
            int r5 = r5 - r6
            r4.f189586i = r5
            goto L_0x0025
        L_0x001e:
            w50.k r4 = new w50.k
            r5 = r16
            r4.<init>(r5, r2)
        L_0x0025:
            java.lang.Object r2 = r4.f189584g
            int r5 = r4.f189586i
            r6 = 1
            if (r5 == 0) goto L_0x003d
            if (r5 != r6) goto L_0x0035
            long r0 = r4.f189583f
            kotlin.ResultKt.throwOnFailure(r2)
            goto L_0x0172
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003d:
            kotlin.ResultKt.throwOnFailure(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "#downloadCdnResV2 url:"
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = ", path:"
            r2.append(r5)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "LiveMakeupUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r18)
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = "#downloadCdnResV2 exist! why are you here?"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            com.tencent.p014mm.vfs.C86013q1.m106447h(r18)
        L_0x006c:
            long r7 = java.lang.System.currentTimeMillis()
            r4.f189581d = r0
            r4.f189582e = r1
            r4.f189583f = r7
            r4.f189586i = r6
            a14.m r2 = new a14.m
            wx3.d r4 = xx3.C66447b.m78392b(r4)
            r2.<init>(r4, r6)
            r2.mo74609p()
            gy3.a0 r4 = new gy3.a0
            r4.<init>()
            java.lang.String r9 = ""
            r10 = 0
            r11 = 0
            gi.f r12 = new gi.f     // Catch:{ MalformedURLException -> 0x0106 }
            r12.<init>()     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r13 = "task_FinderCdnDownloader"
            r12.f287660d = r13     // Catch:{ MalformedURLException -> 0x0106 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0106 }
            r13.<init>(r0)     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r13 = r13.getHost()     // Catch:{ MalformedURLException -> 0x0106 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0106 }
            r14.<init>()     // Catch:{ MalformedURLException -> 0x0106 }
            int r14 = com.tencent.p014mm.network.C81035d.m98965f(r13, r10, r14)     // Catch:{ MalformedURLException -> 0x0106 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0106 }
            r15.<init>()     // Catch:{ MalformedURLException -> 0x0106 }
            int r15 = com.tencent.p014mm.network.C81035d.m98965f(r13, r6, r15)     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r17)     // Catch:{ MalformedURLException -> 0x0106 }
            r12.field_mediaId = r6     // Catch:{ MalformedURLException -> 0x0106 }
            r12.f287631R = r0     // Catch:{ MalformedURLException -> 0x0106 }
            r12.f287633S = r13     // Catch:{ MalformedURLException -> 0x0106 }
            r12.f287635U = r1     // Catch:{ MalformedURLException -> 0x0106 }
            r12.f287638X = r14     // Catch:{ MalformedURLException -> 0x0106 }
            r12.f287639Y = r15     // Catch:{ MalformedURLException -> 0x0106 }
            r12.f287640Z = r10     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0106 }
            r6.<init>()     // Catch:{ MalformedURLException -> 0x0106 }
            r6.append(r9)     // Catch:{ MalformedURLException -> 0x0106 }
            com.tencent.mm.sdk.platformtools.ConnectivityCompat$Companion r13 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion     // Catch:{ MalformedURLException -> 0x0106 }
            r14 = 1
            int r13 = com.tencent.p014mm.sdk.platformtools.ConnectivityCompat.Companion.getCompatMixStrength$default(r13, r10, r14, r11)     // Catch:{ MalformedURLException -> 0x0106 }
            r6.append(r13)     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r6 = r6.toString()     // Catch:{ MalformedURLException -> 0x0106 }
            r12.f287641p0 = r6     // Catch:{ MalformedURLException -> 0x0106 }
            r12.f287642x0 = r9     // Catch:{ MalformedURLException -> 0x0106 }
            r6 = 150(0x96, float:2.1E-43)
            r12.f287630Q0 = r6     // Catch:{ MalformedURLException -> 0x0106 }
            r6 = 20201(0x4ee9, float:2.8308E-41)
            r12.f287632R0 = r6     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ MalformedURLException -> 0x0106 }
            r6.<init>()     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r13 = "#generateTaskInfo mediaId:"
            r6.append(r13)     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r13 = r12.field_mediaId     // Catch:{ MalformedURLException -> 0x0106 }
            r6.append(r13)     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r13 = " resCdnUrl:"
            r6.append(r13)     // Catch:{ MalformedURLException -> 0x0106 }
            r6.append(r0)     // Catch:{ MalformedURLException -> 0x0106 }
            java.lang.String r0 = r6.toString()     // Catch:{ MalformedURLException -> 0x0106 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)     // Catch:{ MalformedURLException -> 0x0106 }
            r11 = r12
            goto L_0x0120
        L_0x0106:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r10]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r9, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "#generateTaskInfo fail:"
            r6.append(r9)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r0)
        L_0x0120:
            if (r11 != 0) goto L_0x0135
            boolean r0 = r4.f27482d
            if (r0 != 0) goto L_0x016a
            r1 = 1
            r4.f27482d = r1
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r2.resumeWith(r0)
            goto L_0x016a
        L_0x0135:
            w50.l r0 = new w50.l
            r0.<init>(r1, r4, r2)
            r11.f287662f = r0
            java.lang.Class<qo.l> r0 = p663qo.C101213l.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            qo.l r0 = (p663qo.C101213l) r0
            boolean r0 = r0.xf0(r11)
            if (r0 == 0) goto L_0x0153
            w50.m r0 = new w50.m
            r0.<init>(r11)
            r2.mo74599v(r0)
            goto L_0x016a
        L_0x0153:
            java.lang.String r0 = "#downloadCdnResV2 addRecvTask failed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r0)
            boolean r0 = r4.f27482d
            if (r0 != 0) goto L_0x016a
            r1 = 1
            r4.f27482d = r1
            kotlin.Result$Companion r0 = kotlin.Result.Companion
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
            r2.resumeWith(r0)
        L_0x016a:
            java.lang.Object r2 = r2.mo74608o()
            if (r2 != r3) goto L_0x0171
            goto L_0x01a7
        L_0x0171:
            r0 = r7
        L_0x0172:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            long r3 = java.lang.System.currentTimeMillis()
            mr.q r5 = p204mr.C61570q.MAKEUP_RES_CDN_2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "result="
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " consuming="
            r6.append(r7)
            long r3 = r3 - r0
            r6.append(r3)
            java.lang.String r0 = r6.toString()
            java.lang.Class<mr.i> r1 = p204mr.C61567i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            mr.i r1 = (p204mr.C61567i) r1
            r1.mo86501dh(r5, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
        L_0x01a7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w50.C65933h.m77668c(w50.h, java.lang.String, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: e */
    public static final void m77669e(C8479f0<IListener<CheckResUpdateCacheFileEvent>> f0Var, String str) {
        IListener iListener = (IListener) f0Var.f27484d;
        if (iListener != null) {
            iListener.dead();
        }
        Log.m105924i("LiveMakeupUtil", "#downloadCdnRes from:" + str + " resEventListener-dead");
        f0Var.f27484d = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo89974d(w50.C65933h.C65934a r11, boolean r12, fy3.C32224a<java.lang.Boolean> r13, wx3.C15601d<? super java.lang.Boolean> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof w50.C65933h.C65936c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            w50.h$c r0 = (w50.C65933h.C65936c) r0
            int r1 = r0.f189563f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f189563f = r1
            goto L_0x0018
        L_0x0013:
            w50.h$c r0 = new w50.h$c
            r0.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f189561d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f189563f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x004b
        L_0x0027:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.String r6 = r11.name()
            a14.h0 r14 = a14.C53872d1.f151119c
            w50.h$d r2 = new w50.h$d
            r9 = 0
            r4 = r2
            r5 = r11
            r7 = r13
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f189563f = r3
            java.lang.Object r11 = a14.C53895h.m60469g(r14, r2, r0)
            if (r11 != r1) goto L_0x004b
            return r1
        L_0x004b:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w50.C65933h.mo89974d(w50.h$a, boolean, fy3.a, wx3.d):java.lang.Object");
    }

    /* renamed from: f */
    public final List<C65935b> mo89975f() {
        ArrayList arrayList = new ArrayList();
        C65933h hVar = f189544a;
        arrayList.add(new C65935b(0, hVar.mo89976g(0), C0966R.C0969drawable.b6q, "", ""));
        String g = hVar.mo89976g(5);
        StringBuilder sb = new StringBuilder();
        String str = f189547d;
        sb.append(str);
        sb.append("/roubai");
        String sb4 = sb.toString();
        StringBuilder sb5 = new StringBuilder();
        String str2 = f189548e;
        sb5.append(str2);
        sb5.append("/roubai");
        arrayList.add(new C65935b(5, g, C0966R.C0969drawable.b6p, sb4, sb5.toString()));
        arrayList.add(new C65935b(1, hVar.mo89976g(1), C0966R.C0969drawable.f357170b60, str + "/baitao", str2 + "/baitao"));
        arrayList.add(new C65935b(7, hVar.mo89976g(7), C0966R.C0969drawable.cla, str + "/dianzhi", str2 + "/dianzhi"));
        arrayList.add(new C65935b(8, hVar.mo89976g(8), C0966R.C0969drawable.clb, str + "/qinglengzhuang", str2 + "/qinglengzhuang"));
        arrayList.add(new C65935b(9, hVar.mo89976g(9), C0966R.C0969drawable.clc, str + "/taizhuang", str2 + "/taizhuang"));
        arrayList.add(new C65935b(2, hVar.mo89976g(2), C0966R.C0969drawable.f357171b61, str + "/chulian", str2 + "/chulian"));
        arrayList.add(new C65935b(3, hVar.mo89976g(3), C0966R.C0969drawable.f357172b62, str + "/hanxi", str2 + "/hanxi"));
        arrayList.add(new C65935b(6, hVar.mo89976g(6), C0966R.C0969drawable.b74, str + "/zhongxing", str2 + "/zhongxing"));
        arrayList.add(new C65935b(4, hVar.mo89976g(4), C0966R.C0969drawable.b6o, str + "/nvtuan", str2 + "/nvtuan"));
        return arrayList;
    }

    /* renamed from: g */
    public final String mo89976g(int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = C0966R.string.m64;
                break;
            case 1:
                i2 = C0966R.string.m48;
                break;
            case 2:
                i2 = C0966R.string.m4c;
                break;
            case 3:
                i2 = C0966R.string.m4g;
                break;
            case 4:
                i2 = C0966R.string.f360617m62;
                break;
            case 5:
                i2 = C0966R.string.f360618m63;
                break;
            case 6:
                i2 = C0966R.string.m65;
                break;
            case 7:
                i2 = C0966R.string.mvn;
                break;
            case 8:
                i2 = C0966R.string.mvp;
                break;
            case 9:
                i2 = C0966R.string.mvq;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 == 0) {
            return "";
        }
        String string = MMApplicationContext.getContext().getResources().getString(i2);
        C87412m.m108593f(string, "{\n            MMApplicat…etString(resId)\n        }");
        return string;
    }
}
