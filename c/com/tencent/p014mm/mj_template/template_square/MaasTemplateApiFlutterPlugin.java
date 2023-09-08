package com.tencent.p014mm.mj_template.template_square;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.app.Activity;
import android.content.Intent;
import com.tencent.p014mm.mj_template.api.MJTemplateSession;
import com.tencent.p014mm.mj_template.report.MaasPageFinderReporter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.MJTemplateApi;
import da0.C58245c;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import ha0.C108221t;
import java.util.LinkedList;
import kotlin.Result;
import kotlin.ResultKt;
import ma0.C61445c;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.plugin.common.PluginRegistry;
import qa0.C62586b;
import qr3.C110470e;
import rx3.C13598b0;
import sa0.C48325d;
import te3.C51754vy;
import te3.pr4;
import te3.qf4;
import te3.rf4;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin */
public final class MaasTemplateApiFlutterPlugin extends MJTemplateApi.HostPageLaunch implements FlutterPlugin, ActivityAware {

    /* renamed from: d */
    public final C58245c f157689d;

    /* renamed from: e */
    public final C61445c f157690e;

    /* renamed from: f */
    public Activity f157691f;

    /* renamed from: g */
    public PluginRegistry.ActivityResultListener f157692g;

    /* renamed from: h */
    public MaasPageFinderReporter f157693h;

    /* renamed from: i */
    public final C0000n0 f157694i = C53930o0.m60554a(C53872d1.f151119c.plus(C53959v2.m60598a((C53973z1) null, 1, (Object) null)));

    @C91590f(mo125468c = "com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$getResourceList$1", mo125469f = "MaasTemplateApiFlutterPlugin.kt", mo125470l = {194}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$a */
    public static final class C40342a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f108426d;

        /* renamed from: e */
        public final /* synthetic */ MJTemplateApi.Result<byte[]> f108427e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40342a(MJTemplateApi.Result<byte[]> result, C15601d<? super C40342a> dVar) {
            super(2, dVar);
            this.f108427e = result;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C40342a(this.f108427e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C40342a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f108426d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f108426d = 1;
                obj = C53895h.m60469g(C53872d1.f151119c, new C48325d((C15601d<? super C48325d>) null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            LinkedList<qf4> linkedList = (LinkedList) obj;
            rf4 rf4 = new rf4();
            rf4.f140886d = linkedList;
            MJTemplateApi.Result<byte[]> result = this.f108427e;
            try {
                Result.Companion companion = Result.Companion;
                result.success(rf4.toByteArray());
                Log.m105924i("MicroMsg.MJTemplateApiFlutterPlugin", "getResourceList: " + linkedList.size());
                obj2 = Result.m168114constructorimpl(C13598b0.f38549a);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                obj2 = Result.m168114constructorimpl(ResultKt.createFailure(th));
            }
            MJTemplateApi.Result<byte[]> result2 = this.f108427e;
            Throwable r6 = Result.m168117exceptionOrNullimpl(obj2);
            if (r6 != null) {
                result2.success(new byte[0]);
                Log.m105921e("MicroMsg.MJTemplateApiFlutterPlugin", "getResourceList", r6);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$b */
    public static final class C55373b implements PluginRegistry.ActivityResultListener {

        /* renamed from: d */
        public final /* synthetic */ MJTemplateApi.Result<Boolean> f157695d;

        /* renamed from: e */
        public final /* synthetic */ MaasTemplateApiFlutterPlugin f157696e;

        public C55373b(MJTemplateApi.Result<Boolean> result, MaasTemplateApiFlutterPlugin maasTemplateApiFlutterPlugin) {
            this.f157695d = result;
            this.f157696e = maasTemplateApiFlutterPlugin;
        }

        public final boolean onActivityResult(int i, int i2, Intent intent) {
            if (i == 1 && i2 == -1) {
                Log.m105924i("MicroMsg.MJTemplateApiFlutterPlugin", "square finished");
                this.f157695d.success(Boolean.TRUE);
            } else {
                Log.m105924i("MicroMsg.MJTemplateApiFlutterPlugin", "square not finished ");
                this.f157695d.success(Boolean.FALSE);
            }
            this.f157696e.f157692g = null;
            return true;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$c */
    public static final class C55374c implements PluginRegistry.ActivityResultListener {

        /* renamed from: d */
        public final /* synthetic */ MaasTemplateApiFlutterPlugin f157697d;

        public C55374c(MaasTemplateApiFlutterPlugin maasTemplateApiFlutterPlugin) {
            this.f157697d = maasTemplateApiFlutterPlugin;
        }

        public final boolean onActivityResult(int i, int i2, Intent intent) {
            PluginRegistry.ActivityResultListener activityResultListener = this.f157697d.f157692g;
            if (activityResultListener != null) {
                return activityResultListener.onActivityResult(i, i2, intent);
            }
            return false;
        }
    }

    /* renamed from: com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$d */
    public static final class C55375d implements PluginRegistry.ActivityResultListener {

        /* renamed from: d */
        public final /* synthetic */ MJTemplateApi.Result<Boolean> f157698d;

        /* renamed from: e */
        public final /* synthetic */ MaasTemplateApiFlutterPlugin f157699e;

        public C55375d(MJTemplateApi.Result<Boolean> result, MaasTemplateApiFlutterPlugin maasTemplateApiFlutterPlugin) {
            this.f157698d = result;
            this.f157699e = maasTemplateApiFlutterPlugin;
        }

        public final boolean onActivityResult(int i, int i2, Intent intent) {
            if (i == 1 && i2 == -1) {
                Log.m105924i("MicroMsg.MJTemplateApiFlutterPlugin", "requestMusicPost square finished");
                this.f157698d.success(Boolean.TRUE);
            } else {
                Log.m105928w("MicroMsg.MJTemplateApiFlutterPlugin", "requestMusicPost square not finished ");
                this.f157698d.success(Boolean.FALSE);
            }
            this.f157699e.f157692g = null;
            return true;
        }
    }

    public MaasTemplateApiFlutterPlugin(C58245c cVar, C61445c cVar2) {
        C87412m.m108594g(cVar, "finderApi");
        C87412m.m108594g(cVar2, "plugin");
        this.f157689d = cVar;
        this.f157690e = cVar2;
    }

    public Long getMaasVersion() {
        return 1011000L;
    }

    public void getResourceList(MJTemplateApi.Result<byte[]> result) {
        C87412m.m108594g(result, "result");
        Log.m105924i("MicroMsg.MJTemplateApiFlutterPlugin", "getResourceList");
        C53895h.m60466d(this.f157694i, (C66212f) null, (C53934p0) null, new C40342a(result, (C15601d<? super C40342a>) null), 3, (Object) null);
    }

    public Long getWeVisionVersion() {
        if (C110470e.f330363a == 0) {
            C110470e.f330363a = 2011400;
        }
        return Long.valueOf((long) C110470e.f330363a);
    }

    public void launchAlbum(MJTemplateApi.AlbumRequest albumRequest, MJTemplateApi.Result<Boolean> result) {
        C87412m.m108594g(albumRequest, "request");
        C87412m.m108594g(result, "result");
        Activity activity = this.f157691f;
        if (activity == null) {
            Log.m105920e("MicroMsg.MJTemplateApiFlutterPlugin", "activity is null");
            result.error(new Throwable("activity not attached"));
            return;
        }
        pr4 pr4 = new pr4();
        boolean z = false;
        try {
            pr4.parseFrom(albumRequest.getBuffer());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.MJTemplateApiFlutterPlugin", "parse template info error", e);
        }
        Integer num = null;
        C108221t.f324032a.mo158631k(false);
        C62586b bVar = C62586b.f177739a;
        String str = pr4.f139919d;
        if (str == null) {
            str = "";
        }
        bVar.mo87647g(str, 2);
        C58245c cVar = this.f157689d;
        Intent intent = new Intent();
        byte[] buffer = albumRequest.getBuffer();
        C87412m.m108593f(buffer, "request.buffer");
        intent.putExtra("mj_template_session", new MJTemplateSession(buffer, (String) null, 2, (C8480h) null));
        C51754vy vyVar = pr4.f139922g;
        intent.putExtra("album_footer_info_str", vyVar != null ? vyVar.f143762f : null);
        Integer valueOf = Integer.valueOf(pr4.f139924i.f137827e);
        if (valueOf.intValue() > 0) {
            z = true;
        }
        if (z) {
            num = valueOf;
        }
        intent.putExtra("max_select_count", num != null ? num.intValue() : 20);
        intent.putExtra("min_select_count", pr4.f139924i.f137826d);
        C13598b0 b0Var = C13598b0.f38549a;
        cVar.mo79148a(activity, 1, intent);
        this.f157692g = new C55373b(result, this);
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToActivity(p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding r6) {
        /*
            r5 = this;
            java.lang.String r0 = "p0"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "MicroMsg.MJTemplateApiFlutterPlugin"
            java.lang.String r1 = "onAttachedToActivity"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.app.Activity r0 = r6.getActivity()
            r5.f157691f = r0
            com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$c r0 = new com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$c
            r0.<init>(r5)
            r6.addActivityResultListener(r0)
            com.tencent.mm.mj_template.report.MaasPageFinderReporter r6 = new com.tencent.mm.mj_template.report.MaasPageFinderReporter
            java.lang.Class<h81.i> r0 = h81.C59774i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.i r0 = (h81.C59774i) r0
            java.lang.String r0 = r0.mo84751Wb()
            if (r0 != 0) goto L_0x002c
            java.lang.String r0 = ""
        L_0x002c:
            r1 = 134(0x86, float:1.88E-43)
            android.app.Activity r2 = r5.f157691f
            r3 = 0
            if (r2 == 0) goto L_0x0038
            android.content.Intent r2 = r2.getIntent()
            goto L_0x0039
        L_0x0038:
            r2 = r3
        L_0x0039:
            if (r2 != 0) goto L_0x0040
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
        L_0x0040:
            java.lang.String r4 = "square_feed_template"
            r6.<init>(r0, r1, r4, r2)
            android.app.Activity r0 = r5.f157691f
            r1 = 0
            if (r0 == 0) goto L_0x0058
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0058
            java.lang.String r4 = "key_topic_id"
            long r1 = r0.getLongExtra(r4, r1)
        L_0x0058:
            java.lang.String r0 = "activityid"
            r6.mo1201a(r0, r1)
            r5.f157693h = r6
            android.app.Activity r0 = r5.f157691f
            boolean r1 = r0 instanceof androidx.lifecycle.C0125s
            if (r1 == 0) goto L_0x0068
            r3 = r0
            androidx.lifecycle.s r3 = (androidx.lifecycle.C0125s) r3
        L_0x0068:
            if (r3 == 0) goto L_0x007b
            androidx.lifecycle.j r0 = r3.getLifecycle()
            if (r0 == 0) goto L_0x007b
            r0.addObserver(r6)
            com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$onAttachedToActivity$2$1 r6 = new com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$onAttachedToActivity$2$1
            r6.<init>()
            r0.addObserver(r6)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.template_square.MaasTemplateApiFlutterPlugin.onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding):void");
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "p0");
        Log.m105924i("MicroMsg.MJTemplateApiFlutterPlugin", "onAttachedToEngine");
        MJTemplateApi.HostPageLaunch.setup(flutterPluginBinding.getBinaryMessenger(), this);
    }

    public void onDetachedFromActivity() {
        Log.m105924i("MicroMsg.MJTemplateApiFlutterPlugin", "onDetachedFromActivity");
        this.f157691f = null;
        this.f157693h = null;
        this.f157690e.M60();
    }

    public void onDetachedFromActivityForConfigChanges() {
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "p0");
        Log.m105924i("MicroMsg.MJTemplateApiFlutterPlugin", "onDetachedFromEngine");
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "p0");
    }

    public void reportTemplateListItemClicked(String str) {
        if (C87412m.m108589b(str, "empty_id")) {
            MaasPageFinderReporter maasPageFinderReporter = this.f157693h;
            if (maasPageFinderReporter != null) {
                maasPageFinderReporter.mo1209i(str, "no_template1");
                return;
            }
            return;
        }
        MaasPageFinderReporter maasPageFinderReporter2 = this.f157693h;
        if (maasPageFinderReporter2 != null) {
            if (str == null) {
                str = "";
            }
            maasPageFinderReporter2.mo1209i(str, maasPageFinderReporter2.f10369f);
        }
    }

    public void reportTemplateListItemExposed(String str) {
        MaasPageFinderReporter maasPageFinderReporter;
        if (!C87412m.m108589b(str, "empty_id") && (maasPageFinderReporter = this.f157693h) != null) {
            if (str == null) {
                str = "";
            }
            maasPageFinderReporter.mo1208h(str, false, maasPageFinderReporter.f10369f);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void requestMusicPost(com.tencent.pigeon.MJTemplateApi.MusicPostRequest r11, com.tencent.pigeon.MJTemplateApi.Result<java.lang.Boolean> r12) {
        /*
            r10 = this;
            java.lang.String r0 = "request"
            gy3.C87412m.m108594g(r11, r0)
            java.lang.String r0 = "result"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "MicroMsg.MJTemplateApiFlutterPlugin"
            java.lang.String r1 = "requestMusicPost: "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            android.app.Activity r1 = r10.f157691f
            if (r1 != 0) goto L_0x0020
            java.lang.String r11 = "requestMusicPost activity is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r11)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r12.success(r11)
            return
        L_0x0020:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            byte[] r3 = r11.getBuffer()
            java.lang.String r4 = "key_template_square_rsp_pb"
            r2.putExtra(r4, r3)
            java.lang.Long r3 = r11.getChooseIdx()
            java.lang.String r4 = "request.chooseIdx"
            gy3.C87412m.m108593f(r3, r4)
            long r3 = r3.longValue()
            r5 = 0
            r7 = 1
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 < 0) goto L_0x00e1
            te3.y92 r3 = new te3.y92
            r3.<init>()
            byte[] r4 = r11.getBuffer()
            r5 = 0
            r6 = 0
            if (r4 != 0) goto L_0x0051
        L_0x004f:
            r3 = r6
            goto L_0x0062
        L_0x0051:
            r3.parseFrom(r4)     // Catch:{ Exception -> 0x0055 }
            goto L_0x0062
        L_0x0055:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r7]
            r4[r5] = r3
            java.lang.String r3 = "safeParser"
            java.lang.String r8 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r8, r4)
            goto L_0x004f
        L_0x0062:
            if (r3 != 0) goto L_0x006f
            java.lang.String r11 = "requestMusicPost: parser buffer error"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r11)
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r12.success(r11)
            return
        L_0x006f:
            java.util.LinkedList<te3.pr4> r3 = r3.f145188d
            java.lang.String r4 = "response.tpls"
            gy3.C87412m.m108593f(r3, r4)
            java.lang.Long r4 = r11.getChooseIdx()
            long r8 = r4.longValue()
            int r4 = (int) r8
            java.lang.Object r3 = sx3.C110818d0.m150917O(r3, r4)
            te3.pr4 r3 = (te3.pr4) r3
            if (r3 == 0) goto L_0x00e1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "requestMusicPost: set res info "
            r4.append(r8)
            java.lang.String r8 = r3.f139919d
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            te3.vy r0 = r3.f139922g
            if (r0 == 0) goto L_0x00a4
            java.lang.String r0 = r0.f143762f
            goto L_0x00a5
        L_0x00a4:
            r0 = r6
        L_0x00a5:
            java.lang.String r4 = "album_footer_info_str"
            r2.putExtra(r4, r0)
            te3.m4 r0 = r3.f139924i
            int r0 = r0.f137827e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r4 = r0.intValue()
            if (r4 <= 0) goto L_0x00b9
            r5 = 1
        L_0x00b9:
            if (r5 == 0) goto L_0x00bc
            r6 = r0
        L_0x00bc:
            if (r6 == 0) goto L_0x00c3
            int r0 = r6.intValue()
            goto L_0x00c5
        L_0x00c3:
            r0 = 20
        L_0x00c5:
            java.lang.String r4 = "max_select_count"
            r2.putExtra(r4, r0)
            te3.m4 r0 = r3.f139924i
            int r0 = r0.f137826d
            java.lang.String r3 = "min_select_count"
            r2.putExtra(r3, r0)
            java.lang.Long r11 = r11.getChooseIdx()
            long r3 = r11.longValue()
            int r11 = (int) r3
            java.lang.String r0 = "key_template_square_chosen_pos"
            r2.putExtra(r0, r11)
        L_0x00e1:
            da0.c r11 = r10.f157689d
            r11.mo79148a(r1, r7, r2)
            com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$d r11 = new com.tencent.mm.mj_template.template_square.MaasTemplateApiFlutterPlugin$d
            r11.<init>(r12, r10)
            r10.f157692g = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.mj_template.template_square.MaasTemplateApiFlutterPlugin.requestMusicPost(com.tencent.pigeon.MJTemplateApi$MusicPostRequest, com.tencent.pigeon.MJTemplateApi$Result):void");
    }
}
