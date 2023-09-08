package com.tencent.matrix.iocanary.core;

import com.tencent.p014mm.matrix.C80993l;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p1001le.C88487a;
import p1001le.C88488b;
import p269xe.C91185g;
import p269xe.C91186h;
import p723vf.C118672d;
import p986je.C87952a;
import p994ke.C88142a;

public class IOCanaryCore implements OnJniIssuePublishListener, C91186h.C91187a {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "Matrix.IOCanaryCore";
    private C88487a mCloseGuardHooker;
    private final C88142a mIOConfig;
    private final C87952a mIoCanaryPlugin;
    private boolean mIsStart;

    public IOCanaryCore(C87952a aVar) {
        this.mIOConfig = aVar.f254520h;
        this.mIoCanaryPlugin = aVar;
    }

    private void initDetectorsAndHookers(C88142a aVar) {
        boolean z;
        if (((C80993l) aVar.f254910a).mo112816c("clicfg_matrix_io_file_io_main_thread_enable", true) || ((C80993l) aVar.f254910a).mo112816c("clicfg_matrix_io_small_buffer_enable", true) || ((C80993l) aVar.f254910a).mo112816c("clicfg_matrix_io_repeated_read_enable", true)) {
            IOCanaryJniBridge.install(aVar, this);
        }
        if (((C80993l) aVar.f254910a).mo112816c("clicfg_matrix_io_closeable_leak_enable", true)) {
            C88487a aVar2 = new C88487a(this);
            this.mCloseGuardHooker = aVar2;
            C118672d.m167353c("Matrix.CloseGuardHooker", "hook sIsTryHook=%b", Boolean.valueOf(aVar2.f255592a));
            if (!aVar2.f255592a) {
                try {
                    Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                    Class<?> cls2 = Class.forName("dalvik.system.CloseGuard$Reporter");
                    Method declaredMethod = cls.getDeclaredMethod("getReporter", new Class[0]);
                    Method declaredMethod2 = cls.getDeclaredMethod("setReporter", new Class[]{cls2});
                    Method declaredMethod3 = cls.getDeclaredMethod("setEnabled", new Class[]{Boolean.TYPE});
                    C88487a.f255591b = declaredMethod.invoke((Object) null, new Object[0]);
                    declaredMethod3.invoke((Object) null, new Object[]{Boolean.TRUE});
                    ClassLoader classLoader = cls2.getClassLoader();
                    if (classLoader == null) {
                        z = false;
                        C118672d.m167353c("Matrix.CloseGuardHooker", "hook hookRet=%b", Boolean.valueOf(z));
                        aVar2.f255592a = true;
                    }
                    declaredMethod2.invoke((Object) null, new Object[]{Proxy.newProxyInstance(classLoader, new Class[]{cls2}, new C88488b(this, C88487a.f255591b))});
                    z = true;
                    C118672d.m167353c("Matrix.CloseGuardHooker", "hook hookRet=%b", Boolean.valueOf(z));
                    aVar2.f255592a = true;
                } catch (Throwable th) {
                    C118672d.m167352b("Matrix.CloseGuardHooker", "tryHook exp=%s", th);
                }
            }
        }
    }

    public synchronized boolean isStart() {
        return this.mIsStart;
    }

    public void onDetectIssue(C91185g gVar) {
        this.mIoCanaryPlugin.onDetectIssue(gVar);
    }

    public void onIssuePublish(List<IOIssue> list) {
        C91185g gVar;
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C87952a aVar = this.mIoCanaryPlugin;
                IOIssue iOIssue = list.get(i);
                if (iOIssue == null) {
                    gVar = null;
                } else {
                    C91185g gVar2 = new C91185g(iOIssue.type);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("path", iOIssue.path);
                        jSONObject.put("size", iOIssue.fileSize);
                        jSONObject.put("op", iOIssue.opCnt);
                        jSONObject.put("buffer", iOIssue.bufferSize);
                        jSONObject.put("cost", iOIssue.opCostTime);
                        jSONObject.put("opType", iOIssue.opType);
                        jSONObject.put("opSize", iOIssue.opSize);
                        jSONObject.put("thread", iOIssue.threadName);
                        jSONObject.put("stack", iOIssue.stack);
                        jSONObject.put("repeat", iOIssue.repeatReadCnt);
                    } catch (JSONException unused) {
                    }
                    gVar2.f261446d = jSONObject;
                    gVar = gVar2;
                }
                aVar.onDetectIssue(gVar);
            }
        }
    }

    public void start() {
        initDetectorsAndHookers(this.mIOConfig);
        synchronized (this) {
            this.mIsStart = true;
        }
    }

    public void stop() {
        boolean z;
        synchronized (this) {
            this.mIsStart = false;
        }
        C88487a aVar = this.mCloseGuardHooker;
        if (aVar != null) {
            aVar.getClass();
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method declaredMethod = cls.getDeclaredMethod("setReporter", new Class[]{Class.forName("dalvik.system.CloseGuard$Reporter")});
                Method declaredMethod2 = cls.getDeclaredMethod("setEnabled", new Class[]{Boolean.TYPE});
                declaredMethod.invoke((Object) null, new Object[]{C88487a.f255591b});
                declaredMethod2.invoke((Object) null, new Object[]{Boolean.FALSE});
                z = true;
            } catch (Throwable th) {
                C118672d.m167352b("Matrix.CloseGuardHooker", "tryHook exp=%s", th);
                z = false;
            }
            C118672d.m167353c("Matrix.CloseGuardHooker", "unHook unHookRet=%b", Boolean.valueOf(z));
            aVar.f255592a = false;
        }
        IOCanaryJniBridge.uninstall();
    }
}
