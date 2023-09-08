package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import com.eclipsesource.mmv8.C80135V8;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;
import com.tencent.p014mm.appbrand.p942v8.C80658e;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService;", "Landroid/app/Service;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService */
public final class AndroidWxaCommLibV8SnapshotService extends Service {

    /* renamed from: e */
    public static final /* synthetic */ int f247245e = 0;

    /* renamed from: d */
    public final Set<ICommLibReader> f247246d = Collections.newSetFromMap(new HashMap());

    /* renamed from: a */
    public final void mo117515a(ResultReceiver resultReceiver, CreateSnapshotResult createSnapshotResult) {
        C84812x5dc836a4 androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult;
        C87412m.m108594g(createSnapshotResult, "result");
        C84812x5dc836a4 androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult2 = null;
        if (createSnapshotResult instanceof CreateSnapshotResult.Success) {
            CreateSnapshotResult.Success success = (CreateSnapshotResult.Success) createSnapshotResult;
            String str = success.snapshotPath;
            C87412m.m108593f(str, "result.snapshotPath");
            Map<String, Integer> map = success.contextNameToSnapshotIndexMap;
            C87412m.m108593f(map, "result.contextNameToSnapshotIndexMap");
            androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult = new C84812x5dc836a4(true, new C2052xea772199(str, map), (C84810x3fae91e0) null);
        } else {
            if (createSnapshotResult instanceof CreateSnapshotResult.Failure) {
                CreateSnapshotResult.Failure failure = (CreateSnapshotResult.Failure) createSnapshotResult;
                int i = failure.errno;
                String str2 = failure.errMsg;
                C87412m.m108593f(str2, "result.errMsg");
                androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult = new C84812x5dc836a4(false, (C2052xea772199) null, new C84810x3fae91e0(i, str2));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("result", androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult2);
            resultReceiver.send(0, bundle);
        }
        androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult2 = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("result", androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult2);
        resultReceiver.send(0, bundle2);
    }

    public IBinder onBind(Intent intent) {
        C87412m.m108594g(intent, "intent");
        return null;
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.AndroidWxaCommLibV8SnapshotService", "onDestroy");
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Bundle extras;
        Log.m105918d("MicroMsg.AndroidWxaCommLibV8SnapshotService", "onStartCommand");
        C84834c cVar = new C84834c(this);
        if (intent == null || (extras = intent.getExtras()) == null) {
            Log.m105920e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, extras is null");
            cVar.invoke();
            return 2;
        } else if (!extras.containsKey("createNodeEmbedSnapshot")) {
            Log.m105920e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, createNodeEmbedSnapshot is null");
            cVar.invoke();
            return 2;
        } else if (extras.getBoolean("createNodeEmbedSnapshot")) {
            String string = extras.getString("snapshotDirPath");
            if (string == null) {
                Log.m105920e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, snapshotDirPath is null");
                cVar.invoke();
                return 2;
            }
            Log.m105924i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "doCreateNodeEmbedSnapshot, snapshotDirPath: " + string);
            boolean z = C80658e.f236022a;
            C80135V8.requireSoLoaded((String) null);
            Log.m105924i("MicroMsg.NodeEmbedV8SnapshotCreateLogic", "doCreateSnapshot, snapshotDirPath: " + string);
            C80135V8.createNodeSnapshot(string);
            cVar.invoke();
            return 2;
        } else {
            extras.setClassLoader(WxaPkgV8SnapshotInfo.class.getClassLoader());
            ResultReceiver resultReceiver = (ResultReceiver) extras.getParcelable("resultReceiver");
            if (resultReceiver == null) {
                Log.m105920e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, resultReceiver is null");
                cVar.invoke();
                return 2;
            }
            ICommLibReader iCommLibReader = (ICommLibReader) extras.getParcelable("commLibReader");
            if (iCommLibReader == null) {
                Log.m105920e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, commLibReader is null");
                mo117515a(resultReceiver, new CreateSnapshotResult.Failure(-202, "Serialize/Deserialize params failure"));
                cVar.invoke();
                return 2;
            }
            WxaPkgV8SnapshotInfo wxaPkgV8SnapshotInfo = (WxaPkgV8SnapshotInfo) extras.getParcelable("snapshotInfo");
            if (wxaPkgV8SnapshotInfo == null) {
                Log.m105920e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, snapshotInfo is null");
                mo117515a(resultReceiver, new CreateSnapshotResult.Failure(-202, "Serialize/Deserialize params failure"));
                cVar.invoke();
                return 2;
            } else if (!extras.containsKey("enableNodeSnapshot")) {
                Log.m105920e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, enableNodeSnapshot is null");
                mo117515a(resultReceiver, new CreateSnapshotResult.Failure(-202, "Serialize/Deserialize params failure"));
                cVar.invoke();
                return 2;
            } else {
                boolean z2 = extras.getBoolean("enableNodeSnapshot");
                if (!extras.containsKey("createNodeOnlySnapshot")) {
                    Log.m105920e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "parseParamsAndDoCreateSnapshot, createNodeOnlySnapshot is null");
                    cVar.invoke();
                    return 2;
                }
                boolean z3 = extras.getBoolean("createNodeOnlySnapshot");
                ((C119157j) C119157j.f356862d).mo183885p(new C84830a(this, iCommLibReader, z3, wxaPkgV8SnapshotInfo, z2, resultReceiver, cVar), "MicroMsg.AndroidWxaCommLibV8SnapshotService");
                return 2;
            }
        }
    }
}
