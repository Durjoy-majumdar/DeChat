package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.eclipsesource.mmv8.snapshot.CreateSnapshotResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import kotlin.Metadata;
import rx3.C13598b0;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/v8_snapshot/AndroidWxaCommLibV8SnapshotService$Companion$doCreateSnapshot$1$1", "Landroid/os/ResultReceiver;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$doCreateSnapshot$1$1 */
public final class C84814x779f831a extends ResultReceiver {

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$doCreateSnapshot$1$1$a */
    public static final class C84815a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<CreateSnapshotResult, C13598b0> f247252d;

        public C84815a(C32226l<? super CreateSnapshotResult, C13598b0> lVar) {
            this.f247252d = lVar;
        }

        public final void run() {
            this.f247252d.invoke(new CreateSnapshotResult.Failure(-202, "Serialize/Deserialize params failure"));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$doCreateSnapshot$1$1$b */
    public static final class C84816b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<CreateSnapshotResult, C13598b0> f247253d;

        public C84816b(C32226l<? super CreateSnapshotResult, C13598b0> lVar) {
            this.f247253d = lVar;
        }

        public final void run() {
            this.f247253d.invoke(new CreateSnapshotResult.Failure(-202, "Serialize/Deserialize params failure"));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$doCreateSnapshot$1$1$c */
    public static final class C84817c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<CreateSnapshotResult, C13598b0> f247254d;

        public C84817c(C32226l<? super CreateSnapshotResult, C13598b0> lVar) {
            this.f247254d = lVar;
        }

        public final void run() {
            this.f247254d.invoke(new CreateSnapshotResult.Failure(-202, "Serialize/Deserialize params failure"));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.AndroidWxaCommLibV8SnapshotService$Companion$doCreateSnapshot$1$1$d */
    public static final class C84818d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<CreateSnapshotResult, C13598b0> f247255d;

        /* renamed from: e */
        public final /* synthetic */ CreateSnapshotResult f247256e;

        public C84818d(C32226l<? super CreateSnapshotResult, C13598b0> lVar, CreateSnapshotResult createSnapshotResult) {
            this.f247255d = lVar;
            this.f247256e = createSnapshotResult;
        }

        public final void run() {
            this.f247255d.invoke(this.f247256e);
        }
    }

    public void onReceiveResult(int i, Bundle bundle) {
        C84810x3fae91e0 androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult;
        C2052xea772199 androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult;
        StringBuilder sb = new StringBuilder();
        sb.append("onReceiveResult, resultCode: ");
        sb.append(i);
        sb.append(", resultData exists: ");
        sb.append(bundle != null);
        Log.m105924i("MicroMsg.AndroidWxaCommLibV8SnapshotService", sb.toString());
        C84840f0.f247297a.getClass();
        if (C84840f0.f247299c) {
            Log.m105924i("MicroMsg.AndroidWxaCommLibV8SnapshotService", "onReceiveResult, resultData: " + bundle);
        }
        if (i != 0 || bundle == null) {
            ((C119157j) C119157j.f356862d).mo183884o(new C84815a((C32226l<? super CreateSnapshotResult, C13598b0>) null));
            return;
        }
        bundle.setClassLoader(C84812x5dc836a4.class.getClassLoader());
        C84812x5dc836a4 androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult = (C84812x5dc836a4) bundle.getParcelable("result");
        if (androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult == null) {
            Log.m105920e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "onReceiveResult, ipcResult is null");
            ((C119157j) C119157j.f356862d).mo183884o(new C84816b((C32226l<? super CreateSnapshotResult, C13598b0>) null));
            return;
        }
        boolean z = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult.f247249d;
        CreateSnapshotResult failure = (!z || (androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult.f247250e) == null) ? (z || (androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult = androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotResult.f247251f) == null) ? null : new CreateSnapshotResult.Failure(androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult.f247247d, androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotFailureResult.f247248e) : new CreateSnapshotResult.Success(androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult.f11998d, androidWxaCommLibV8SnapshotService$Companion$IPCCreateSnapshotSuccessResult.f11999e);
        if (failure == null) {
            Log.m105920e("MicroMsg.AndroidWxaCommLibV8SnapshotService", "onReceiveResult, result is null");
            ((C119157j) C119157j.f356862d).mo183884o(new C84817c((C32226l<? super CreateSnapshotResult, C13598b0>) null));
            return;
        }
        ((C119157j) C119157j.f356862d).mo183884o(new C84818d((C32226l<? super CreateSnapshotResult, C13598b0>) null, failure));
    }
}
