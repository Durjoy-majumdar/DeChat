package hu1;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.charset.StandardCharsets;
import kj2.C117407d;
import p172io.flutter.embedding.engine.EngineDataReportListener;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;

/* renamed from: hu1.a */
public class C117113a implements EngineDataReportListener {

    /* renamed from: d */
    public final FlutterEngine f350905d;

    /* renamed from: e */
    public boolean f350906e = false;

    /* renamed from: f */
    public final FlutterEngine.EngineLifecycleListener f350907f;

    /* renamed from: g */
    public FlutterUiDisplayListener f350908g;

    /* renamed from: hu1.a$a */
    public class C117114a implements FlutterEngine.EngineLifecycleListener {
        public C117114a() {
        }

        public void onEngineWillDestroy() {
            Log.m105918d("MicroMsg.Flutter.EngineDataReportHandler", "onEngineWillDestroy");
            C117113a aVar = C117113a.this;
            aVar.f350906e = true;
            aVar.f350905d.getRenderer().removeIsDisplayingFlutterUiListener(C117113a.this.f350908g);
        }

        public void onPreEngineRestart() {
        }
    }

    /* renamed from: hu1.a$b */
    public class C117115b implements FlutterUiDisplayListener {
        public C117115b() {
        }

        public void onFlutterUiDisplayed() {
            Log.m105924i("MicroMsg.Flutter.EngineDataReportHandler", "onFlutterUiDisplayed");
            C117113a aVar = C117113a.this;
            if (!aVar.f350906e) {
                aVar.f350905d.getStatChannel().reportMemoryUsage();
            }
        }

        public void onFlutterUiNoLongerDisplayed() {
        }
    }

    public C117113a(FlutterEngine flutterEngine) {
        C117114a aVar = new C117114a();
        this.f350907f = aVar;
        this.f350908g = new C117115b();
        Log.m105924i("MicroMsg.Flutter.EngineDataReportHandler", "EngineDataReportHandler " + flutterEngine);
        this.f350905d = flutterEngine;
        flutterEngine.addEngineLifecycleListener(aVar);
        flutterEngine.getRenderer().addIsDisplayingFlutterUiListener(this.f350908g);
    }

    public void onReportJSON(byte[] bArr) {
        try {
            String str = new String(bArr, StandardCharsets.UTF_8);
            Log.m105924i("MicroMsg.Flutter.EngineDataReportHandler", "onReportJSON: " + str);
            C117407d dVar = C117407d.INSTANCE;
            dVar.kvStat(24757, "flutter_engine_mm," + str.replaceAll(",", ";"));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.Flutter.EngineDataReportHandler", e, "parse json sys err", new Object[0]);
        }
    }
}
