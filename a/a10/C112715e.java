package a10;

import a10.C103290p;
import a14.C0000n0;
import android.text.format.DateFormat;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import p172io.flutter.FlutterInjector;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.MMFlutterEngineGroup;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.PluginRegistry;
import p172io.flutter.embedding.engine.systemchannels.SettingsChannel;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.flutter.base.EngineGroup$spawn$5", mo125469f = "CachedFlutterEngineGroup.kt", mo125470l = {153}, mo125471m = "invokeSuspend")
/* renamed from: a10.e */
public final class C112715e extends C91594j implements C32227p<C0000n0, C15601d<? super C112725w>, Object> {

    /* renamed from: d */
    public long f337483d;

    /* renamed from: e */
    public long f337484e;

    /* renamed from: f */
    public int f337485f;

    /* renamed from: g */
    public final /* synthetic */ C112732z f337486g;

    /* renamed from: h */
    public final /* synthetic */ C112713c f337487h;

    /* renamed from: i */
    public final /* synthetic */ boolean f337488i;

    /* renamed from: a10.e$a */
    public static final class C112716a extends C87413o implements C32226l<C112725w, C13598b0> {

        /* renamed from: d */
        public static final C112716a f337489d = new C112716a();

        public C112716a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C112725w wVar = (C112725w) obj;
            C87412m.m108594g(wVar, LocaleUtil.ITALIAN);
            C112717f.f337490a.mo164456b(wVar);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112715e(C112732z zVar, C112713c cVar, boolean z, C15601d<? super C112715e> dVar) {
        super(2, dVar);
        this.f337486g = zVar;
        this.f337487h = cVar;
        this.f337488i = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112715e(this.f337486g, this.f337487h, this.f337488i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112715e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f337485f;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m165288i("MicroMsg.CachedFlutterEngineGroup", "spawn");
            j = System.currentTimeMillis();
            DartExecutor.DartEntrypoint dartEntrypoint = new DartExecutor.DartEntrypoint(FlutterInjector.instance().flutterLoader().findAppBundlePath(), this.f337486g.f337544b);
            String a = this.f337486g.mo164475a();
            long currentTimeMillis = System.currentTimeMillis();
            MMFlutterEngineGroup mMFlutterEngineGroup = this.f337487h.f337467a;
            boolean z2 = this.f337488i;
            C112716a aVar2 = C112716a.f337489d;
            this.f337483d = j;
            this.f337484e = currentTimeMillis;
            this.f337485f = 1;
            obj = mMFlutterEngineGroup.createAndRunEngine(dartEntrypoint, a, z2, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
            j2 = currentTimeMillis;
        } else if (i == 1) {
            j2 = this.f337484e;
            j = this.f337483d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C112725w wVar = (C112725w) obj;
        long currentTimeMillis2 = System.currentTimeMillis();
        C112713c cVar = this.f337487h;
        if (cVar.f337468b == null) {
            FlutterEngine flutterEngine = wVar.f337501b;
            cVar.f337468b = flutterEngine;
            cVar.f337472f = new C112720l(flutterEngine);
            this.f337487h.f337469c = wVar.f337500a;
            PluginRegistry plugins = wVar.f337501b.getPlugins();
            C112713c cVar2 = this.f337487h;
            plugins.add((FlutterPlugin) cVar2.f337473g);
            plugins.add((FlutterPlugin) cVar2.f337474h);
            C112712b bVar = new C112712b();
            String str = wVar.f337500a;
            C87412m.m108594g(str, "<set-?>");
            bVar.f337456a = str;
            String str2 = this.f337486g.f337543a + XVFSFile.SEPARATOR_CHAR + this.f337486g.f337545c;
            C87412m.m108594g(str2, "<set-?>");
            bVar.f337462g = str2;
            bVar.f337457b = currentTimeMillis2 - j2;
            bVar.f337458c = true;
            long currentTimeMillis3 = System.currentTimeMillis();
            C112713c cVar3 = this.f337487h;
            bVar.f337459d = currentTimeMillis3 - cVar3.f337475i;
            bVar.f337461f = (long) cVar3.f337467a.getActiveEngines().size();
            C112713c cVar4 = this.f337487h;
            bVar.f337460e = (long) (cVar4.f337467a.getActiveEngines().size() + cVar4.f337467a.getDestroyEngineCount());
            C32226l<? super C112712b, C13598b0> lVar = this.f337487h.f337477k;
            if (lVar != null) {
                lVar.invoke(bVar);
            }
            Log.m165288i("MicroMsg.CachedFlutterEngineGroup", C87412m.m108600m("create rootEngine cost:", new Long(bVar.f337457b)));
        } else {
            PluginRegistry plugins2 = wVar.f337501b.getPlugins();
            C112720l lVar2 = this.f337487h.f337472f;
            C87412m.m108591d(lVar2);
            plugins2.add((FlutterPlugin) new C112722m(lVar2));
            C32226l<? super C112725w, C13598b0> lVar3 = this.f337487h.f337476j;
            if (lVar3 != null) {
                lVar3.invoke(wVar);
            }
        }
        if ((this.f337487h.f337467a.getContext().getResources().getConfiguration().uiMode & 48) != 32) {
            z = false;
        }
        SettingsChannel.PlatformBrightness platformBrightness = z ? SettingsChannel.PlatformBrightness.dark : SettingsChannel.PlatformBrightness.light;
        SettingsChannel.MessageBuilder startMessage = wVar.f337501b.getSettingsChannel().startMessage();
        C32224a<Float> aVar3 = C112717f.f337492c;
        Float invoke = aVar3 == null ? null : aVar3.invoke();
        startMessage.setTextScaleFactor(invoke == null ? this.f337487h.f337467a.getContext().getResources().getConfiguration().fontScale : invoke.floatValue()).setUse24HourFormat(DateFormat.is24HourFormat(this.f337487h.f337467a.getContext())).setPlatformBrightness(platformBrightness).send();
        C103290p.C103291a aVar4 = C103290p.f304558c;
        String str3 = wVar.f337500a;
        FlutterEngine flutterEngine2 = wVar.f337501b;
        C87412m.m108594g(str3, "engineId");
        C87412m.m108594g(flutterEngine2, "engine");
        DartExecutor dartExecutor = flutterEngine2.getDartExecutor();
        C87412m.m108593f(dartExecutor, "engine.dartExecutor");
        C103290p pVar = new C103290p(dartExecutor);
        pVar.f304561b = str3;
        C103290p.f304559d.put(str3, pVar);
        Log.m165288i("MicroMsg.CachedFlutterEngineGroup", C87412m.m108600m("spawn cost:", new Long(System.currentTimeMillis() - j)));
        return wVar;
    }
}
