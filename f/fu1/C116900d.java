package fu1;

import a10.C112723u;
import a10.C112725w;
import a10.C112732z;
import a14.C0000n0;
import a14.C53895h;
import a14.C53973z1;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.HandlerThread;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines;
import com.tencent.p014mm.plugin.flutter.p884ui.MMFlutterViewActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32227p;
import gu1.C116990g;
import gu1.C116991k;
import gu1.C8458j;
import gy3.C87412m;
import h81.C32735h;
import hu1.C117113a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.UUID;
import kg3.C76577a;
import kotlin.ResultKt;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.FlutterEngineCache;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.PluginRegistry;
import p206nj.C88957l;
import rx3.C13598b0;
import tf0.C118486d1;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z51.C119061h;

/* renamed from: fu1.d */
public final class C116900d implements C112723u {

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.MMFlutterConfig$checkInit$1", mo125469f = "MMFlutterConfig.kt", mo125470l = {25}, mo125471m = "invokeSuspend")
    /* renamed from: fu1.d$a */
    public static final class C107580a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f321882d;

        public C107580a(C15601d<? super C107580a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C107580a(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C107580a((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f321882d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53973z1 d = CachedFlutterEngines.f346097a.mo175366d();
                this.f321882d = 1;
                if (d.mo74521O(this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public Class<? extends Activity> mo164455a() {
        return MMFlutterViewActivity.class;
    }

    /* renamed from: b */
    public void mo164456b(C112725w wVar) {
        C87412m.m108594g(wVar, "engine");
        CachedFlutterEngines.f346097a.getClass();
        long currentTicks = Util.currentTicks();
        C88957l.m111078n("dart2cpp");
        Log.m105918d("MicroMsg.CachedFlutterEngines", "System.loadLibrary libdart2cpp.so, cost:" + Util.ticksToNow(currentTicks));
        FlutterEngine flutterEngine = wVar.f337501b;
        String str = wVar.f337500a;
        C116990g gVar = C116990g.f350564a;
        PluginRegistry plugins = flutterEngine.getPlugins();
        C87412m.m108593f(plugins, "flutterEngine.plugins");
        gVar.mo180958a(plugins);
        flutterEngine.addDataReportListener(new C117113a(flutterEngine));
        flutterEngine.getPlugins().add((FlutterPlugin) new C118486d1(wVar.f337502c, wVar.f337503d));
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 23 || ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_flutter_enable_surface_background_executor, false)) {
            z = true;
        }
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("FlutterEngineBackgroundExecutor_" + str, 5);
        a.start();
        MMHandler mMHandler = new MMHandler(a.getLooper());
        flutterEngine.setBackgroundExecutor(new C8458j(mMHandler), z);
        CachedFlutterEngines.f346098b.put(str, new CachedFlutterEngines.C105354a(a, mMHandler));
        FlutterEngineCache.getInstance().put(str, flutterEngine);
        flutterEngine.addEngineLifecycleListener(new C116991k(str));
    }

    /* renamed from: c */
    public Activity mo164457c() {
        WeakReference<Activity> g = AppForegroundDelegate.m161224g();
        if (g != null) {
            return g.get();
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo164458d(Context context) {
        C87412m.m108594g(context, "context");
        return C85875k4.m106190k(context);
    }

    /* renamed from: e */
    public void mo164459e(C112732z zVar) {
        Class cls = C119061h.class;
        C87412m.m108594g(zVar, "routeInfo");
        Context context = MMApplicationContext.getContext();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("fontScale", Float.valueOf(C76577a.m92165p(context)));
        hashMap.put("layoutScale", Float.valueOf(C76577a.m92175z(context)));
        hashMap.put(FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, LocaleUtil.getApplicationLanguage());
        hashMap.put("sessionId", UUID.randomUUID().toString());
        C119061h hVar = (C119061h) C86312j.m106911c(cls);
        String str = "";
        hashMap.put("SystemEmojiResPath", hVar == null ? str : hVar.G70());
        C119061h hVar2 = (C119061h) C86312j.m106911c(cls);
        hashMap.put("QQSmileyDirPath", hVar2 == null ? str : hVar2.mo141692gU());
        C119061h hVar3 = (C119061h) C86312j.m106911c(cls);
        hashMap.put("NewSmileyDirPath", hVar3 == null ? str : hVar3.mo141689MP());
        C119061h hVar4 = (C119061h) C86312j.m106911c(cls);
        if (hVar4 != null) {
            str = hVar4.mo141693jF();
        }
        hashMap.put("EmojiPanelConfigPath", str);
        C119061h hVar5 = (C119061h) C86312j.m106911c(cls);
        boolean z = true;
        hashMap.put("IsEnableInitOnIsolate", Boolean.valueOf(hVar5 == null ? true : hVar5.Qe0()));
        C119061h hVar6 = (C119061h) C86312j.m106911c(cls);
        if (hVar6 != null) {
            z = hVar6.mo141691fJ();
        }
        hashMap.put("IsEnableSupportEmoji", Boolean.valueOf(z));
        zVar.f337547e = hashMap;
    }

    /* renamed from: f */
    public void mo164460f() {
        C53895h.m60468f((C66212f) null, new C107580a((C15601d<? super C107580a>) null), 1, (Object) null);
    }

    public Point getDisplayRealSize(Context context) {
        C87412m.m108594g(context, "context");
        return C85875k4.m106184h(context);
    }
}
