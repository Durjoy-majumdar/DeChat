package tf0;

import android.app.Activity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.pigeon.FlutterAPMApi;
import gy3.C87412m;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import p172io.flutter.embedding.engine.EngineDataReportListener;
import p172io.flutter.embedding.engine.FlutterEngine;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.embedding.engine.plugins.activity.ActivityAware;
import p172io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import p172io.flutter.embedding.engine.systemchannels.StatChannel;

/* renamed from: tf0.d1 */
public final class C118486d1 implements FlutterAPMApi.WeAPMApi, FlutterPlugin, ActivityAware, EngineDataReportListener {

    /* renamed from: d */
    public final long f354632d;

    /* renamed from: e */
    public final long f354633e;

    /* renamed from: f */
    public FlutterEngine f354634f;

    /* renamed from: g */
    public List<FlutterAPMApi.Result<String>> f354635g = new ArrayList();

    /* renamed from: h */
    public Activity f354636h;

    /* renamed from: i */
    public long f354637i;

    /* renamed from: j */
    public long f354638j;

    /* renamed from: n */
    public long f354639n;

    public C118486d1(long j, long j2) {
        this.f354632d = j;
        this.f354633e = j2;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo183211a() {
        /*
            r5 = this;
            android.app.Activity r0 = r5.f354636h
            boolean r1 = r0 instanceof tf0.C118485c1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            tf0.c1 r0 = (tf0.C118485c1) r0
            goto L_0x000b
        L_0x000a:
            r0 = r2
        L_0x000b:
            r3 = 0
            if (r0 == 0) goto L_0x0014
            long r0 = r0.getNativeFirstPointerDownMills()
            goto L_0x0015
        L_0x0014:
            r0 = r3
        L_0x0015:
            r5.f354637i = r0
            android.app.Activity r0 = r5.f354636h
            boolean r1 = r0 instanceof tf0.C118485c1
            if (r1 == 0) goto L_0x0020
            tf0.c1 r0 = (tf0.C118485c1) r0
            goto L_0x0021
        L_0x0020:
            r0 = r2
        L_0x0021:
            if (r0 == 0) goto L_0x0028
            long r0 = r0.getNativeFirstScrollMills()
            goto L_0x0029
        L_0x0028:
            r0 = r3
        L_0x0029:
            r5.f354638j = r0
            android.app.Activity r0 = r5.f354636h
            boolean r1 = r0 instanceof tf0.C118485c1
            if (r1 == 0) goto L_0x0034
            r2 = r0
            tf0.c1 r2 = (tf0.C118485c1) r2
        L_0x0034:
            if (r2 == 0) goto L_0x003a
            long r3 = r2.getSnapshotRenderMills()
        L_0x003a:
            r5.f354639n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tf0.C118486d1.mo183211a():void");
    }

    public void getDartVMMemoryInfo(FlutterAPMApi.Result<String> result) {
        StatChannel statChannel;
        if (result != null) {
            ((ArrayList) this.f354635g).add(result);
            FlutterEngine flutterEngine = this.f354634f;
            if (flutterEngine != null && (statChannel = flutterEngine.getStatChannel()) != null) {
                statChannel.reportMemoryUsage();
            }
        }
    }

    public Long getFlutterEngineCreateFinishMills() {
        return Long.valueOf(this.f354633e);
    }

    public Long getFlutterEngineCreateStartMills() {
        return Long.valueOf(this.f354632d);
    }

    public Long getNativeFirstPointerDownMills() {
        return Long.valueOf(this.f354637i);
    }

    public Long getNativeFirstScrollMills() {
        return Long.valueOf(this.f354638j);
    }

    public Long getSnapshotRenderMills() {
        return Long.valueOf(this.f354639n);
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "p0");
        this.f354636h = activityPluginBinding.getActivity();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        FlutterAPMApi.WeAPMApi.CC.m163970h(flutterPluginBinding.getBinaryMessenger(), this);
        FlutterEngine flutterEngine = flutterPluginBinding.getFlutterEngine();
        this.f354634f = flutterEngine;
        if (flutterEngine != null) {
            flutterEngine.addDataReportListener(this);
        }
    }

    public void onDetachedFromActivity() {
        mo183211a();
        this.f354636h = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        mo183211a();
        this.f354636h = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        C87412m.m108594g(flutterPluginBinding, "binding");
        this.f354634f = null;
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C87412m.m108594g(activityPluginBinding, "p0");
        this.f354636h = activityPluginBinding.getActivity();
    }

    public void onReportJSON(byte[] bArr) {
        try {
            C87412m.m108591d(bArr);
            Charset charset = StandardCharsets.UTF_8;
            C87412m.m108593f(charset, "UTF_8");
            String str = new String(bArr, charset);
            Log.m105918d("MicroMsg.FlutterAPMPlugin", "onReportJSON: " + str);
            for (FlutterAPMApi.Result success : this.f354635g) {
                success.success(str);
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FlutterAPMPlugin", e, "parse json sys err", new Object[0]);
            for (FlutterAPMApi.Result error : this.f354635g) {
                error.error(e);
            }
        }
        ((ArrayList) this.f354635g).clear();
    }
}
