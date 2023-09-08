package qp2;

import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.sns.p104ad.remote.ipc.impl.IPCRemoteProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.IntentUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import ef3.C86514b;
import java.lang.reflect.Method;
import np2.C117634b;
import op2.C100371a;
import op2.C100372b;
import pp2.C47518b;
import pp2.C62489a;
import rq2.C101425k;
import zt3.C119157j;

/* renamed from: qp2.a */
public final class C101232a implements C47518b, C62489a {

    /* renamed from: a */
    public C100372b f296417a;

    /* renamed from: b */
    public C100371a f296418b;

    /* renamed from: c */
    public IPCRemoteProxy f296419c;

    /* renamed from: qp2.a$a */
    public class C101233a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C100371a f296420d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f296421e;

        public C101233a(C101232a aVar, C100371a aVar2, Bundle bundle) {
            this.f296420d = aVar2;
            this.f296421e = bundle;
        }

        public void run() {
            SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl$1");
            this.f296420d.mo86295b(this.f296421e);
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl$1");
        }
    }

    /* renamed from: a */
    public final void mo140691a(Bundle bundle) {
        C117634b bVar;
        SnsMethodCalculate.markStartTimeMs("callbackFromServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        C100371a aVar = this.f296418b;
        if (!(bundle == null || aVar == null)) {
            bundle.setClassLoader(C101232a.class.getClassLoader());
            SnsMethodCalculate.markStartTimeMs("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            C100371a aVar2 = this.f296418b;
            boolean z = false;
            if (aVar2 == null) {
                SnsMethodCalculate.markEndTimeMs("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
            } else {
                try {
                    Method[] methods = C100371a.class.getMethods();
                    if (C101425k.m133099c(methods)) {
                        SnsMethodCalculate.markEndTimeMs("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                    } else {
                        String name = methods[0].getName();
                        Method method = aVar2.getClass().getMethod(name, new Class[]{Bundle.class});
                        if (!(method == null || (bVar = (C117634b) method.getAnnotation(C117634b.class)) == null)) {
                            z = bVar.value();
                            SnsMethodCalculate.markEndTimeMs("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                        }
                        SnsMethodCalculate.markEndTimeMs("shouldCallbackToClientInMainThread", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                    }
                } catch (Throwable unused) {
                }
            }
            if (z) {
                ((C119157j) C119157j.f356862d).mo183895z(new C101233a(this, aVar, bundle));
            } else {
                aVar.mo86295b(bundle);
            }
        }
        SnsMethodCalculate.markEndTimeMs("callbackFromServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
    }

    @C86514b
    /* renamed from: b */
    public final Bundle mo140692b(C47518b bVar, Bundle bundle) {
        Object obj;
        SnsMethodCalculate.markStartTimeMs("calledOnServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        if (bundle != null) {
            bundle.setClassLoader(C101232a.class.getClassLoader());
            String string = IntentUtil.getString(bundle, "key_server_class");
            if (!TextUtils.isEmpty(string)) {
                SnsMethodCalculate.markStartTimeMs("objectFromString", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                try {
                    obj = Class.forName(string).newInstance();
                    SnsMethodCalculate.markEndTimeMs("objectFromString", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                } catch (Throwable unused) {
                    SnsMethodCalculate.markEndTimeMs("objectFromString", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                    obj = null;
                }
                if (obj instanceof C100372b) {
                    Log.m105918d("SimpleRemoteRequest", "the object is IOnIPCServerCall, the onServer is called.");
                    Bundle a = ((C100372b) obj).mo67224a(bVar, bundle);
                    SnsMethodCalculate.markEndTimeMs("calledOnServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
                    return a;
                }
                Log.m105928w("SimpleRemoteRequest", "the object is not IOnIPCServerCall");
            }
        }
        SnsMethodCalculate.markEndTimeMs("calledOnServer", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle mo140693c(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.String r0 = "clientRequestToServer"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            if (r10 == 0) goto L_0x0062
            java.lang.String r3 = "getServerName"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            op2.b r4 = r9.f296417a
            if (r4 == 0) goto L_0x001f
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            goto L_0x0024
        L_0x001f:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            java.lang.String r4 = ""
        L_0x0024:
            java.lang.String r3 = "key_server_class"
            r10.putCharSequence(r3, r4)
            java.lang.String r3 = "callToRemoteServer"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r1)
            com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRemoteProxy r4 = r9.f296419c
            if (r4 == 0) goto L_0x005b
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            java.lang.String r7 = "getClassName"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r1)
            java.lang.Class<qp2.a> r8 = qp2.C101232a.class
            java.lang.String r8 = r8.getName()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r1)
            r5[r6] = r8
            r6 = 1
            r5[r6] = r10
            java.lang.String r10 = "calledOnServer"
            java.lang.Object r10 = r4.REMOTE_CALL(r10, r5)
            boolean r4 = r10 instanceof android.os.Bundle
            if (r4 == 0) goto L_0x005b
            r2 = r10
            android.os.Bundle r2 = (android.os.Bundle) r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
            goto L_0x005e
        L_0x005b:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r1)
        L_0x005e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        L_0x0062:
            java.lang.String r10 = "SimpleRemoteRequest"
            java.lang.String r3 = "the input args is null, are you sure?"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r10, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qp2.C101232a.mo140693c(android.os.Bundle):android.os.Bundle");
    }

    /* renamed from: d */
    public final void mo140694d(Bundle bundle) {
        IPCRemoteProxy iPCRemoteProxy;
        SnsMethodCalculate.markStartTimeMs("serverResponseToClient", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
        if (!(bundle == null || (iPCRemoteProxy = this.f296419c) == null)) {
            iPCRemoteProxy.CLIENT_CALL("callbackFromServer", bundle);
        }
        SnsMethodCalculate.markEndTimeMs("serverResponseToClient", "com.tencent.mm.plugin.sns.ad.remote.ipc.impl.IPCRequestImpl");
    }
}
