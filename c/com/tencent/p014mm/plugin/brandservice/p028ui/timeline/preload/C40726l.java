package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53965x0;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ea3.C45590f;
import ea3.C7616k;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Set;
import jw0.C9533e;
import kotlin.Metadata;
import kotlin.ResultKt;
import org.xwalk.core.XWalkEnvironment;
import p564iq.C87790d;
import p823sg.C101614i;
import rb0.C47970h0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import t73.C48555a;
import t73.C48572p;
import te3.ah4;
import te3.zg4;
import wx3.C15601d;
import wx3.C66212f;
import xx0.C53458b;
import xx3.C15911a;
import ym0.C91512j;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l */
public final class C40726l {

    /* renamed from: a */
    public static final C40726l f109414a;

    /* renamed from: b */
    public static final C13601g f109415b = C36568h.m40985a(C29775d.f80784d);

    /* renamed from: c */
    public static final C47970h0 f109416c = new C47970h0(BuildInfo.DEBUG ? 1000 : 600000);

    /* renamed from: d */
    public static final LinkedList<C40729c> f109417d = new LinkedList<>();

    /* renamed from: e */
    public static int f109418e = 1;

    /* renamed from: f */
    public static String f109419f = "";

    /* renamed from: g */
    public static boolean f109420g;

    /* renamed from: h */
    public static final C101614i<String, Bundle> f109421h = new C101614i<>(10);

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$d */
    public static final class C29775d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C29775d f80784d = new C29775d();

        public C29775d() {
            super(0);
        }

        public Object invoke() {
            if (!((C87790d) C86312j.m106911c(C87790d.class)).isInstalled(XWalkEnvironment.MODULE_APPBRAND)) {
                return Boolean.FALSE;
            }
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            boolean z = true;
            if (!(hVar != null && hVar.mo58779Qe(C32735h.C32737c.clicfg_open_timeline_video_preload, 0) == 1) && !BuildInfo.IS_FLAVOR_RED && !BuildInfo.DEBUG) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "bundle", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$a */
    public static final class C40727a<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C40727a<InputType, ResultType> f109422d = new C40727a<>();

        public void invoke(Object obj, C1256g gVar) {
            C91512j c = C91512j.m114810c();
            ((Bundle) obj).getBoolean("abTest");
            c.getClass();
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "bundle", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$b */
    public static final class C40728b<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C40728b<InputType, ResultType> f109423d = new C40728b<>();

        public void invoke(Object obj, C1256g gVar) {
            C91512j c = C91512j.m114810c();
            ((Bundle) obj).getBoolean("abTest");
            c.getClass();
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$c */
    public static final class C40729c {

        /* renamed from: a */
        public String f109424a;

        /* renamed from: b */
        public int f109425b;

        /* renamed from: c */
        public String f109426c;

        /* renamed from: d */
        public C48555a f109427d;

        public C40729c(String str, int i, String str2, C48555a aVar) {
            C87412m.m108594g(str, "url");
            C87412m.m108594g(aVar, "manifest");
            this.f109424a = str;
            this.f109425b = i;
            this.f109426c = str2;
            this.f109427d = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C40729c)) {
                return false;
            }
            C40729c cVar = (C40729c) obj;
            return C87412m.m108589b(this.f109424a, cVar.f109424a) && this.f109425b == cVar.f109425b && C87412m.m108589b(this.f109426c, cVar.f109426c) && C87412m.m108589b(this.f109427d, cVar.f109427d);
        }

        public int hashCode() {
            int hashCode = ((this.f109424a.hashCode() * 31) + this.f109425b) * 31;
            String str = this.f109426c;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f109427d.hashCode();
        }

        public String toString() {
            return "FetchData(url=" + this.f109424a + ", itemShowType=" + this.f109425b + ", extInfo=" + this.f109426c + ", manifest=" + this.f109427d + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.BizVideoPreloadLogic$doCacheVideo$2", mo125469f = "BizVideoPreloadLogic.kt", mo125470l = {346}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$e */
    public static final class C40730e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f109428d;

        /* renamed from: e */
        public final /* synthetic */ String f109429e;

        /* renamed from: f */
        public final /* synthetic */ C8479f0<Bundle> f109430f;

        @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "bundle", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$e$a */
        public static final class C40731a<InputType, ResultType> implements C80883e {

            /* renamed from: d */
            public static final C40731a<InputType, ResultType> f109431d = new C40731a<>();

            /* JADX WARNING: Removed duplicated region for block: B:15:0x0067  */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0097  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void invoke(java.lang.Object r14, com.tencent.p014mm.ipcinvoker.C1256g r15) {
                /*
                    r13 = this;
                    android.os.Bundle r14 = (android.os.Bundle) r14
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.l r15 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.f109414a
                    java.lang.String r15 = "url"
                    java.lang.String r15 = r14.getString(r15)
                    java.lang.String r0 = "position"
                    long r6 = r14.getLong(r0)
                    java.lang.String r0 = "length"
                    long r8 = r14.getLong(r0)
                    java.lang.String r0 = "useThumbPlayer"
                    boolean r0 = r14.getBoolean(r0)
                    java.lang.String r1 = "videoType"
                    int r14 = r14.getInt(r1)
                    if (r15 != 0) goto L_0x002a
                    goto L_0x016f
                L_0x002a:
                    java.lang.String r10 = "MicroMsg.BizVideoPreloadLogic"
                    if (r0 == 0) goto L_0x00ef
                    com.tencent.mm.plugin.appbrand.video.player.thumb.e r0 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18054e.f49894a
                    java.lang.String r1 = r0.mo22563a(r15)
                    r2 = 1
                    r3 = 0
                    boolean r4 = z04.C112551y.m153811k(r1)     // Catch:{ Exception -> 0x0058 }
                    if (r4 == 0) goto L_0x003d
                    goto L_0x0062
                L_0x003d:
                    com.tencent.mm.sdk.platformtools.MMKVSlotManager r0 = r0.mo22565c()     // Catch:{ Exception -> 0x0058 }
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0058 }
                    r4.<init>()     // Catch:{ Exception -> 0x0058 }
                    java.lang.String r5 = "su"
                    r4.append(r5)     // Catch:{ Exception -> 0x0058 }
                    r4.append(r1)     // Catch:{ Exception -> 0x0058 }
                    java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0058 }
                    boolean r0 = r0.decodeBool(r4, r3)     // Catch:{ Exception -> 0x0058 }
                    goto L_0x0063
                L_0x0058:
                    r0 = move-exception
                    java.lang.Object[] r4 = new java.lang.Object[r3]
                    java.lang.String r5 = "MicroMsg.AppBrand.ThumbPlayerInitLogic"
                    java.lang.String r6 = ""
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r0, r6, r4)
                L_0x0062:
                    r0 = 0
                L_0x0063:
                    java.lang.String r4 = "  preloadSize:"
                    if (r0 == 0) goto L_0x0097
                    java.lang.StringBuilder r14 = new java.lang.StringBuilder
                    r14.<init>()
                    java.lang.String r0 = "preloadTTPlayer is preload success, no need preload again,  fileId:"
                    r14.append(r0)
                    r14.append(r1)
                    java.lang.String r0 = " url:"
                    r14.append(r0)
                    r14.append(r15)
                    r14.append(r4)
                    com.tencent.mm.plugin.appbrand.video.player.thumb.e r15 = com.tencent.p014mm.plugin.appbrand.video.player.thumb.C18054e.f49894a
                    long r0 = r15.mo22564b(r1)
                    r14.append(r0)
                    java.lang.String r15 = "  "
                    r14.append(r15)
                    java.lang.String r14 = r14.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)
                    goto L_0x016f
                L_0x0097:
                    android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                    r5 = 100
                    com.tencent.thumbplayer.api.proxy.ITPPreloadProxy r0 = com.tencent.thumbplayer.api.proxy.TPP2PProxyFactory.createPreloadManager(r0, r5)
                    if (r14 != r2) goto L_0x00a9
                    com.tencent.thumbplayer.api.proxy.TPDownloadParamData r3 = new com.tencent.thumbplayer.api.proxy.TPDownloadParamData
                    r3.<init>((int) r2)
                    goto L_0x00af
                L_0x00a9:
                    com.tencent.thumbplayer.api.proxy.TPDownloadParamData r2 = new com.tencent.thumbplayer.api.proxy.TPDownloadParamData
                    r2.<init>((int) r3)
                    r3 = r2
                L_0x00af:
                    r3.url = r15
                    r3.setDownloadFileID(r1)
                    r3.setPreloadSize(r8)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r5 = "preloadTTPlayer:"
                    r2.append(r5)
                    r2.append(r15)
                    java.lang.String r5 = "   fileId:"
                    r2.append(r5)
                    r2.append(r1)
                    r2.append(r4)
                    r2.append(r8)
                    java.lang.String r4 = "  videoType:"
                    r2.append(r4)
                    r2.append(r14)
                    java.lang.String r14 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.n r14 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.n
                    r14.<init>(r1, r15, r8)
                    r0.setPreloadListener(r14)
                    r0.startPreload(r1, r3)
                    goto L_0x016f
                L_0x00ef:
                    r11 = 0
                    int r14 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                    if (r14 < 0) goto L_0x0153
                    int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
                    if (r14 > 0) goto L_0x00fa
                    goto L_0x0153
                L_0x00fa:
                    ym0.j r0 = ym0.C91512j.m114810c()
                    r1 = r15
                    r2 = r6
                    r4 = r8
                    long r0 = r0.mo123036D(r1, r2, r4)
                    java.lang.StringBuilder r14 = new java.lang.StringBuilder
                    r14.<init>()
                    java.lang.String r2 = "[TRACE_VIDEO_PRELOAD] cacheVideoInClientProcess cacheByte = "
                    r14.append(r2)
                    r14.append(r0)
                    java.lang.String r2 = ", length = "
                    r14.append(r2)
                    r14.append(r8)
                    java.lang.String r2 = ", url = "
                    r14.append(r2)
                    r14.append(r15)
                    java.lang.String r14 = r14.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)
                    int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                    if (r14 > 0) goto L_0x016f
                    ym0.j r14 = ym0.C91512j.m114810c()
                    boolean r14 = r14.f262321e
                    if (r14 != 0) goto L_0x0140
                    ln0.e r0 = ln0.C88600e.m110458f()
                    r1 = r15
                    r2 = r6
                    r4 = r8
                    r0.mo123042d(r1, r2, r4)
                    goto L_0x016f
                L_0x0140:
                    dn0.m r14 = dn0.C86368m.m106993b()     // Catch:{ Exception -> 0x0148 }
                    r14.mo120760d(r15, r8)     // Catch:{ Exception -> 0x0148 }
                    goto L_0x016f
                L_0x0148:
                    r14 = move-exception
                    r15 = 6
                    java.lang.String r0 = "MicroMsg.SameLayer.VideoCore"
                    java.lang.String r1 = "preload exception"
                    fn0.C87002g.m108023q(r15, r0, r1, r14)
                    goto L_0x016f
                L_0x0153:
                    java.lang.StringBuilder r14 = new java.lang.StringBuilder
                    r14.<init>()
                    java.lang.String r15 = "[TRACE_VIDEO_PRELOAD] cacheVideoInClientProcess params invalid position="
                    r14.append(r15)
                    r14.append(r6)
                    java.lang.String r15 = ", length="
                    r14.append(r15)
                    r14.append(r8)
                    java.lang.String r14 = r14.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r14)
                L_0x016f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.C40730e.C40731a.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40730e(String str, C8479f0<Bundle> f0Var, C15601d<? super C40730e> dVar) {
            super(2, dVar);
            this.f109429e = str;
            this.f109430f = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C40730e(this.f109429e, this.f109430f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C40730e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f109428d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f109429e;
                if (C44594n1.m49046b() && C87412m.m108589b(this.f109429e, WeChatProcess.PROCESS_TOOLS)) {
                    str = WeChatProcess.PROCESS_MAIN;
                    C87412m.m108593f(str, "PROCESS_MAIN");
                }
                StringBuilder sb = new StringBuilder();
                sb.append("[TRACE_VIDEO_PRELOAD] doCacheVideo  url:");
                Bundle bundle = (Bundle) this.f109430f.f27484d;
                sb.append(bundle != null ? bundle.getString("url") : null);
                sb.append("  length:");
                Bundle bundle2 = (Bundle) this.f109430f.f27484d;
                sb.append(bundle2 != null ? new Long(bundle2.getLong("length")) : null);
                Log.m105924i("MicroMsg.BizVideoPreloadLogic", sb.toString());
                C28947a.m38500a(str, (Parcelable) this.f109430f.f27484d, C40731a.f109431d, (C32226l) null);
                this.f109428d = 1;
                if (C53965x0.m60607b(1000, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C40726l.f109414a.mo63634c(this.f109429e);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.BizVideoPreloadLogic$preloadVideo$1", mo125469f = "BizVideoPreloadLogic.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f */
    public static final class C40732f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ String f109432d;

        /* renamed from: e */
        public final /* synthetic */ int f109433e;

        /* renamed from: f */
        public final /* synthetic */ String f109434f;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f$a */
        public static final class C40733a extends C87413o implements C32226l<String, C13598b0> {

            /* renamed from: d */
            public static final C40733a f109435d = new C40733a();

            public C40733a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C87412m.m108594g((String) obj, LocaleUtil.ITALIAN);
                Log.m105924i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] preloadVideo JsStatus.INIT_END");
                C40726l lVar = C40726l.f109414a;
                C40726l.f109418e = 3;
                C40726l.m44005a(lVar);
                return C13598b0.f38549a;
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f$b */
        public static final class C40734b extends C87413o implements C32226l<C48555a, Integer> {

            /* renamed from: d */
            public static final C40734b f109436d = new C40734b();

            public C40734b() {
                super(1);
            }

            public Object invoke(Object obj) {
                C48555a aVar = (C48555a) obj;
                C87412m.m108594g(aVar, "manifest");
                String str = aVar.f129888b.f141127e;
                C87412m.m108593f(str, "manifest.manifest.ManifestUrl");
                String a = C48572p.m53970a(str);
                if (!Util.isNullOrNil(C40726l.f109419f) && C87412m.m108589b(C40726l.f109419f, a)) {
                    return Integer.valueOf(C40726l.f109418e);
                }
                C87412m.m108594g(a, "<set-?>");
                C40726l.f109419f = a;
                return 1;
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f$c */
        public static final class C40735c extends C87413o implements C32226l<String, String> {

            /* renamed from: d */
            public static final C40735c f109437d = new C40735c();

            public C40735c() {
                super(1);
            }

            public Object invoke(Object obj) {
                String str = (String) obj;
                C87412m.m108594g(str, "path");
                try {
                    return C86013q1.m106432N(str);
                } catch (IOException e) {
                    Log.printErrStackTrace("MicroMsg.BizVideoPreloadLogic", e, "", new Object[0]);
                    return "";
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f$d */
        public static final class C40736d extends C87413o implements C32224a<ah4> {

            /* renamed from: d */
            public static final C40736d f109438d = new C40736d();

            public C40736d() {
                super(0);
            }

            public Object invoke() {
                if (!C9533e.f29725m) {
                    zg4 g = C53458b.m59913g(6);
                    ah4 ah4 = new ah4();
                    ah4.f130539g = C40716j0.m43973a(g) + "videoPrefetcher.js";
                    ah4.f130545p = g.f145939f;
                    ah4.f130537e = g.f145938e;
                    return ah4;
                }
                ah4 ah42 = new ah4();
                ah42.f130536d = 6;
                ah42.f130537e = (int) (System.currentTimeMillis() / ((long) 1000));
                C13601g gVar = C9533e.f29724l;
                ah42.f130539g = (String) ((C36570n) gVar).getValue();
                ah42.f130545p = (String) ((C36570n) gVar).getValue();
                return ah42;
            }
        }

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f$e */
        public static final class C40737e extends C87413o implements C32227p<String, ah4, C48555a> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<ah4> f109439d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C40737e(C8479f0<ah4> f0Var) {
                super(2);
                this.f109439d = f0Var;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
                if (r0 == null) goto L_0x0027;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
                /*
                    r11 = this;
                    java.lang.String r12 = (java.lang.String) r12
                    te3.ah4 r13 = (te3.ah4) r13
                    java.lang.String r0 = "url"
                    gy3.C87412m.m108594g(r12, r0)
                    java.lang.String r0 = "tmpl"
                    gy3.C87412m.m108594g(r13, r0)
                    te3.rt1 r3 = new te3.rt1
                    r3.<init>()
                    gy3.f0<te3.ah4> r13 = r11.f109439d
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.f109359a
                    java.lang.String r0 = ea3.C45590f.m50647g(r12)     // Catch:{ Exception -> 0x0027 }
                    android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x0027 }
                    java.lang.String r0 = r0.getPath()     // Catch:{ Exception -> 0x0027 }
                    if (r0 != 0) goto L_0x0029
                L_0x0027:
                    java.lang.String r0 = ""
                L_0x0029:
                    r3.f141126d = r0
                    T r13 = r13.f27484d
                    te3.ah4 r13 = (te3.ah4) r13
                    java.lang.String r13 = r13.f130545p
                    r3.f141127e = r13
                    te3.qt1 r2 = new te3.qt1
                    r2.<init>()
                    java.lang.String r12 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43961j(r12)
                    r2.f140537d = r12
                    java.util.LinkedList<te3.rt1> r12 = r2.f140539f
                    r12.add(r3)
                    t73.a r12 = new t73.a
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder
                    r13.<init>()
                    java.lang.String r0 = r3.f141131i
                    r13.append(r0)
                    r0 = 45
                    r13.append(r0)
                    java.lang.String r0 = r3.f141127e
                    r13.append(r0)
                    java.lang.String r13 = r13.toString()
                    java.lang.String r8 = t73.C48572p.m53970a(r13)
                    r9 = 60
                    r10 = 0
                    r1 = r12
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.C40732f.C40737e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40732f(String str, int i, String str2, C15601d<? super C40732f> dVar) {
            super(2, dVar);
            this.f109432d = str;
            this.f109433e = i;
            this.f109434f = str2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C40732f(this.f109432d, this.f109433e, this.f109434f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C40732f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d9 A[Catch:{ Exception -> 0x011c }, LOOP:0: B:35:0x00d9->B:38:0x00e9, LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.String r0 = "MicroMsg.BizVideoPreloadLogic"
                kotlin.ResultKt.throwOnFailure(r12)
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f$d r12 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.C40732f.C40736d.f109438d
                gy3.f0 r1 = new gy3.f0
                r1.<init>()
                java.lang.Object r12 = r12.invoke()     // Catch:{ Exception -> 0x011f }
                r1.f27484d = r12     // Catch:{ Exception -> 0x011f }
                if (r12 != 0) goto L_0x001c
                java.lang.String r12 = "[TRACE_VIDEO_PRELOAD] preloadVideo tmplParams not exist"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ Exception -> 0x011f }
                rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x011f }
                return r12
            L_0x001c:
                ea3.k r12 = ea3.C7616k.f25897a     // Catch:{ Exception -> 0x011f }
                boolean r12 = r12.mo8749a()     // Catch:{ Exception -> 0x011f }
                r2 = 0
                if (r12 != 0) goto L_0x0066
                T r12 = r1.f27484d     // Catch:{ Exception -> 0x011f }
                te3.ah4 r12 = (te3.ah4) r12     // Catch:{ Exception -> 0x011f }
                if (r12 == 0) goto L_0x002e
                java.lang.String r12 = r12.f130539g     // Catch:{ Exception -> 0x011f }
                goto L_0x002f
            L_0x002e:
                r12 = r2
            L_0x002f:
                com.tencent.p014mm.vfs.C86013q1.m106461v(r12)     // Catch:{ Exception -> 0x011f }
                T r12 = r1.f27484d     // Catch:{ Exception -> 0x011f }
                te3.ah4 r12 = (te3.ah4) r12     // Catch:{ Exception -> 0x011f }
                if (r12 == 0) goto L_0x003b
                java.lang.String r12 = r12.f130539g     // Catch:{ Exception -> 0x011f }
                goto L_0x003c
            L_0x003b:
                r12 = r2
            L_0x003c:
                boolean r12 = com.tencent.p014mm.vfs.C86013q1.m106450k(r12)     // Catch:{ Exception -> 0x011f }
                if (r12 != 0) goto L_0x0066
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011f }
                r12.<init>()     // Catch:{ Exception -> 0x011f }
                java.lang.String r3 = "[TRACE_VIDEO_PRELOAD] preloadVideo "
                r12.append(r3)     // Catch:{ Exception -> 0x011f }
                T r1 = r1.f27484d     // Catch:{ Exception -> 0x011f }
                te3.ah4 r1 = (te3.ah4) r1     // Catch:{ Exception -> 0x011f }
                if (r1 == 0) goto L_0x0054
                java.lang.String r2 = r1.f130539g     // Catch:{ Exception -> 0x011f }
            L_0x0054:
                r12.append(r2)     // Catch:{ Exception -> 0x011f }
                java.lang.String r1 = " not exist"
                r12.append(r1)     // Catch:{ Exception -> 0x011f }
                java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x011f }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ Exception -> 0x011f }
                rx3.b0 r12 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x011f }
                return r12
            L_0x0066:
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f$e r12 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f$e     // Catch:{ Exception -> 0x011c }
                r12.<init>(r1)     // Catch:{ Exception -> 0x011c }
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f$b r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.C40732f.C40734b.f109436d     // Catch:{ Exception -> 0x011c }
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f$c r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.C40732f.C40735c.f109437d     // Catch:{ Exception -> 0x011c }
                java.lang.String r5 = r11.f109432d     // Catch:{ Exception -> 0x011c }
                T r6 = r1.f27484d     // Catch:{ Exception -> 0x011c }
                java.lang.Object r12 = r12.invoke(r5, r6)     // Catch:{ Exception -> 0x011c }
                t73.a r12 = (t73.C48555a) r12     // Catch:{ Exception -> 0x011c }
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.l r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.f109414a     // Catch:{ Exception -> 0x011c }
                java.util.LinkedList<com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$c> r6 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.f109417d     // Catch:{ Exception -> 0x011c }
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$c r7 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$c     // Catch:{ Exception -> 0x011c }
                java.lang.String r8 = r11.f109432d     // Catch:{ Exception -> 0x011c }
                int r9 = r11.f109433e     // Catch:{ Exception -> 0x011c }
                java.lang.String r10 = r11.f109434f     // Catch:{ Exception -> 0x011c }
                r7.<init>(r8, r9, r10, r12)     // Catch:{ Exception -> 0x011c }
                r6.add(r7)     // Catch:{ Exception -> 0x011c }
                java.lang.Object r3 = r3.invoke(r12)     // Catch:{ Exception -> 0x011c }
                java.lang.Number r3 = (java.lang.Number) r3     // Catch:{ Exception -> 0x011c }
                int r3 = r3.intValue()     // Catch:{ Exception -> 0x011c }
                com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.f109418e = r3     // Catch:{ Exception -> 0x011c }
                r6 = 2
                r7 = 1
                if (r3 == r7) goto L_0x00ab
                if (r3 == r6) goto L_0x00a5
                r12 = 3
                if (r3 == r12) goto L_0x00a1
                goto L_0x00eb
            L_0x00a1:
                com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.m44005a(r5)     // Catch:{ Exception -> 0x011c }
                goto L_0x00eb
            L_0x00a5:
                java.lang.String r12 = "[TRACE_VIDEO_PRELOAD] preloadVideo jsStatus.INIT_ING"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)     // Catch:{ Exception -> 0x011c }
                goto L_0x00eb
            L_0x00ab:
                java.lang.String r3 = "[TRACE_VIDEO_PRELOAD] preloadVideo JsStatus.SHOULD_INIT"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ Exception -> 0x011c }
                T r3 = r1.f27484d     // Catch:{ Exception -> 0x011c }
                te3.ah4 r3 = (te3.ah4) r3     // Catch:{ Exception -> 0x011c }
                java.lang.String r3 = r3.f130539g     // Catch:{ Exception -> 0x011c }
                java.lang.String r5 = "tmplParams.initFilePath"
                gy3.C87412m.m108593f(r3, r5)     // Catch:{ Exception -> 0x011c }
                java.lang.Object r3 = r4.invoke(r3)     // Catch:{ Exception -> 0x011c }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x011c }
                if (r3 == 0) goto L_0x00eb
                com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.f109418e = r6     // Catch:{ Exception -> 0x011c }
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a     // Catch:{ Exception -> 0x011c }
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$f$a r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.C40732f.C40733a.f109435d     // Catch:{ Exception -> 0x011c }
                java.lang.String r6 = "onCallback"
                gy3.C87412m.m108594g(r5, r6)     // Catch:{ Exception -> 0x011c }
                t73.d r4 = r4.mo63594f()     // Catch:{ Exception -> 0x011c }
                java.util.concurrent.ConcurrentLinkedDeque<t73.o> r4 = r4.f129909C     // Catch:{ Exception -> 0x011c }
                java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x011c }
            L_0x00d9:
                boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x011c }
                if (r6 == 0) goto L_0x00eb
                java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x011c }
                t73.o r6 = (t73.C48571o) r6     // Catch:{ Exception -> 0x011c }
                boolean r6 = r6.mo63709f(r7, r12, r3, r5)     // Catch:{ Exception -> 0x011c }
                if (r6 == 0) goto L_0x00d9
            L_0x00eb:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r3 = "[TRACE_VIDEO_PRELOAD] tmplParams initFilePath = "
                r12.append(r3)
                T r1 = r1.f27484d
                te3.ah4 r1 = (te3.ah4) r1
                if (r1 == 0) goto L_0x00fd
                java.lang.String r2 = r1.f130539g
            L_0x00fd:
                if (r2 != 0) goto L_0x0101
                java.lang.String r2 = ""
            L_0x0101:
                r12.append(r2)
                java.lang.String r1 = ", WebComponent.info = "
                r12.append(r1)
                com.tencent.mm.plugin.webview.webcompt.c$b r1 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                java.lang.String r1 = r1.mo69188f()
                r12.append(r1)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r12)
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            L_0x011c:
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            L_0x011f:
                r12 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[TRACE_VIDEO_PRELOAD] preloadVideo exception = "
                r1.append(r2)
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
                rx3.b0 r12 = rx3.C13598b0.f38549a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.C40732f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        C40726l lVar = new C40726l();
        f109414a = lVar;
        C91512j c = C91512j.m114810c();
        lVar.mo63635d();
        c.getClass();
        String str = C44594n1.m49046b() ? WeChatProcess.PROCESS_MAIN : WeChatProcess.PROCESS_TOOLS;
        C87412m.m108593f(str, "webViewProgressName");
        Bundle bundle = new Bundle();
        bundle.putBoolean("abTest", lVar.mo63635d());
        C28947a.m38500a(str, bundle, C40727a.f109422d, (C32226l) null);
        String str2 = WeChatProcess.PROCESS_APPBRAND0;
        C87412m.m108593f(str2, "PROCESS_APPBRAND0");
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("abTest", lVar.mo63635d());
        C28947a.m38500a(str2, bundle2, C40728b.f109423d, (C32226l) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x008f A[Catch:{ Exception -> 0x00be }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m44005a(com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l r12) {
        /*
            monitor-enter(r12)
            java.util.LinkedList<com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$c> r0 = f109417d     // Catch:{ all -> 0x00e4 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)     // Catch:{ all -> 0x00e4 }
            if (r1 != 0) goto L_0x00ca
            int r1 = f109418e     // Catch:{ all -> 0x00e4 }
            r2 = 3
            if (r1 == r2) goto L_0x0010
            goto L_0x00ca
        L_0x0010:
            r1 = 0
            java.lang.Object r0 = r0.poll()     // Catch:{ Exception -> 0x00be }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.l$c r0 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.C40729c) r0     // Catch:{ Exception -> 0x00be }
            if (r0 == 0) goto L_0x00c8
            java.lang.String r2 = "MicroMsg.BizVideoPreloadLogic"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00be }
            r3.<init>()     // Catch:{ Exception -> 0x00be }
            java.lang.String r4 = "doFetch fetchData = "
            r3.append(r4)     // Catch:{ Exception -> 0x00be }
            r3.append(r0)     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00be }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)     // Catch:{ Exception -> 0x00be }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x00be }
            r2.<init>()     // Catch:{ Exception -> 0x00be }
            int r3 = r0.f109425b     // Catch:{ Exception -> 0x00be }
            java.lang.String r4 = r0.f109426c     // Catch:{ Exception -> 0x00be }
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)     // Catch:{ Exception -> 0x00be }
            if (r4 != 0) goto L_0x0053
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = r0.f109426c     // Catch:{ Exception -> 0x0053 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = "itemshowType"
            int r3 = r4.optInt(r5)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = "preloadType"
            int r4 = r4.optInt(r5)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0054
        L_0x0053:
            r4 = 0
        L_0x0054:
            java.lang.String r5 = "itemShowType"
            r2.put(r5, r3)     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = "preloadType"
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = "scene"
            r4 = 90
            r2.put(r3, r4)     // Catch:{ Exception -> 0x00be }
            java.lang.String r3 = "MicroMsg.BizVideoPreloadLogic"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00be }
            r4.<init>()     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = "[TRACE_VIDEO_PRELOAD] doFetch url = "
            r4.append(r5)     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = r0.f109424a     // Catch:{ Exception -> 0x00be }
            r4.append(r5)     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = "   json:"
            r4.append(r5)     // Catch:{ Exception -> 0x00be }
            r4.append(r2)     // Catch:{ Exception -> 0x00be }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00be }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x00be }
            ea3.k r3 = ea3.C7616k.f25897a     // Catch:{ Exception -> 0x00be }
            boolean r3 = r3.mo8749a()     // Catch:{ Exception -> 0x00be }
            if (r3 == 0) goto L_0x009b
            com.tencent.mm.plugin.report.service.n r4 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE     // Catch:{ Exception -> 0x00be }
            r5 = 1379(0x563, double:6.813E-321)
            r7 = 50
            r9 = 1
            r11 = 0
            r4.idkeyStat(r5, r7, r9, r11)     // Catch:{ Exception -> 0x00be }
        L_0x009b:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a     // Catch:{ Exception -> 0x00be }
            t73.a r4 = r0.f109427d     // Catch:{ Exception -> 0x00be }
            java.lang.String r5 = "fetch"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ Exception -> 0x00be }
            java.lang.String r0 = r0.f109424a     // Catch:{ Exception -> 0x00be }
            r6[r1] = r0     // Catch:{ Exception -> 0x00be }
            r0 = 1
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00be }
            java.lang.String r7 = "json.toString()"
            gy3.C87412m.m108593f(r2, r7)     // Catch:{ Exception -> 0x00be }
            r6[r0] = r2     // Catch:{ Exception -> 0x00be }
            java.util.List r0 = sx3.C64197v.m75537f(r6)     // Catch:{ Exception -> 0x00be }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.m r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40739m.f109447d     // Catch:{ Exception -> 0x00be }
            r3.mo63595g(r4, r5, r0, r2)     // Catch:{ Exception -> 0x00be }
            goto L_0x00c8
        L_0x00be:
            r0 = move-exception
            java.lang.String r2 = "MicroMsg.BizVideoPreloadLogic"
            java.lang.String r3 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e4 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)     // Catch:{ all -> 0x00e4 }
        L_0x00c8:
            monitor-exit(r12)
            goto L_0x00e3
        L_0x00ca:
            java.lang.String r0 = "MicroMsg.BizVideoPreloadLogic"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r1.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "doFetch fetchQueue null, jsContextStatus = "
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            int r2 = f109418e     // Catch:{ all -> 0x00e4 }
            r1.append(r2)     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00e4 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r12)
        L_0x00e3:
            return
        L_0x00e4:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.m44005a(com.tencent.mm.plugin.brandservice.ui.timeline.preload.l):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0098, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo63633b(java.lang.String r6, java.lang.String r7, long r8, long r10, int r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)     // Catch:{ all -> 0x0099 }
            if (r0 == 0) goto L_0x0010
            java.lang.String r6 = "MicroMsg.BizVideoPreloadLogic"
            java.lang.String r7 = "[TRACE_VIDEO_PRELOAD] cacheVideo url error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x0099 }
            monitor-exit(r5)
            return
        L_0x0010:
            ym0.j r0 = ym0.C91512j.m114810c()     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = r0.mo125425b(r7)     // Catch:{ all -> 0x0099 }
            sg.i<java.lang.String, android.os.Bundle> r1 = f109421h     // Catch:{ all -> 0x0099 }
            java.lang.Object r2 = r1.get(r0)     // Catch:{ all -> 0x0099 }
            if (r2 == 0) goto L_0x0029
            java.lang.String r6 = "MicroMsg.BizVideoPreloadLogic"
            java.lang.String r7 = "[TRACE_VIDEO_PRELOAD] cacheVideo lruList contains"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)     // Catch:{ all -> 0x0099 }
            monitor-exit(r5)
            return
        L_0x0029:
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0099 }
            r2.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "url"
            r2.putString(r3, r7)     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "position"
            r2.putLong(r3, r8)     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "length"
            r2.putLong(r3, r10)     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "useThumbPlayer"
            ea3.k r4 = ea3.C7616k.f25897a     // Catch:{ all -> 0x0099 }
            boolean r4 = r4.mo8749a()     // Catch:{ all -> 0x0099 }
            r2.putBoolean(r3, r4)     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "videoType"
            r2.putInt(r3, r12)     // Catch:{ all -> 0x0099 }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0099 }
            r1.put(r0, r2)     // Catch:{ all -> 0x0099 }
            java.lang.String r0 = "MicroMsg.BizVideoPreloadLogic"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0099 }
            r2.<init>()     // Catch:{ all -> 0x0099 }
            java.lang.String r3 = "[TRACE_VIDEO_PRELOAD] cacheVideo lruList.size = "
            r2.append(r3)     // Catch:{ all -> 0x0099 }
            int r1 = r1.size()     // Catch:{ all -> 0x0099 }
            r2.append(r1)     // Catch:{ all -> 0x0099 }
            java.lang.String r1 = ", position="
            r2.append(r1)     // Catch:{ all -> 0x0099 }
            r2.append(r8)     // Catch:{ all -> 0x0099 }
            java.lang.String r8 = ", length="
            r2.append(r8)     // Catch:{ all -> 0x0099 }
            r2.append(r10)     // Catch:{ all -> 0x0099 }
            java.lang.String r8 = ", videoType="
            r2.append(r8)     // Catch:{ all -> 0x0099 }
            r2.append(r12)     // Catch:{ all -> 0x0099 }
            java.lang.String r8 = ", url="
            r2.append(r8)     // Catch:{ all -> 0x0099 }
            r2.append(r7)     // Catch:{ all -> 0x0099 }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x0099 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)     // Catch:{ all -> 0x0099 }
            boolean r7 = f109420g     // Catch:{ all -> 0x0099 }
            if (r7 != 0) goto L_0x0097
            r5.mo63634c(r6)     // Catch:{ all -> 0x0099 }
        L_0x0097:
            monitor-exit(r5)
            return
        L_0x0099:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40726l.mo63633b(java.lang.String, java.lang.String, long, long, int):void");
    }

    /* renamed from: c */
    public final synchronized void mo63634c(String str) {
        C101614i<String, Bundle> iVar = f109421h;
        if (iVar.size() <= 0) {
            Log.m105924i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] doCacheVideo lruList is empty");
            f109420g = false;
            return;
        }
        f109420g = true;
        C8479f0 f0Var = new C8479f0();
        Set<String> keySet = iVar.keySet();
        C87412m.m108593f(keySet, "this.keySet()");
        String str2 = (String) C110818d0.m150922T(keySet);
        if (str2 != null) {
            T t = (Bundle) iVar.get(str2);
            if (t != null) {
                f0Var.f27484d = t;
                Bundle bundle = (Bundle) iVar.remove(str2);
                C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C40730e(str, f0Var, (C15601d<? super C40730e>) null), 3, (Object) null);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo63635d() {
        return ((Boolean) f109415b.getValue()).booleanValue();
    }

    /* renamed from: e */
    public final void mo63636e(String str, int i) {
        mo63637f(str, i, "");
    }

    /* renamed from: f */
    public final void mo63637f(String str, int i, String str2) {
        Log.m105924i("MicroMsg.BizVideoPreloadLogic", "preloadVideo itemShowType:" + i);
        if (!mo63635d() || str == null) {
            return;
        }
        if (!C45590f.m50650j(str) && !C45590f.m50651k(str)) {
            return;
        }
        if (!C7616k.f25897a.mo8749a()) {
            Log.m105924i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] is not thumbPlayer , do not preload");
            return;
        }
        String k = C40714i.m43962k(str);
        C47970h0 h0Var = f109416c;
        if (h0Var.mo72742b(k)) {
            Log.m105924i("MicroMsg.BizVideoPreloadLogic", "[TRACE_VIDEO_PRELOAD] preloadLimiter contains id = " + k);
            return;
        }
        h0Var.mo72741a(k);
        C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C40732f(str, i, str2, (C15601d<? super C40732f>) null), 2, (Object) null);
    }
}
