package com.tencent.p014mm.plugin.appbrand.task.preload;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.WeAppQualityPreloadOpenRateStatisStruct;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.app.PluginAppBrand;
import com.tencent.p014mm.plugin.appbrand.preload.IAppBrandBatchPreloadController;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandPreloadProfiler;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.task.C84331q;
import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import com.tencent.p014mm.plugin.appbrand.task.preload.C84327g;
import com.tencent.p014mm.plugin.appbrand.task.q$$g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86301e;
import ei3.C86522b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import kr0.C88273g1;
import nj0.C34855o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C86522b(dependencies = {PluginAppBrand.class, C81161g2.class}, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_APPBRAND, C80625v0.MATCH_TOOLS})
/* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController */
public class AppBrandBatchPreloadController extends C86301e implements IAppBrandBatchPreloadController {
    private static final String TAG = "MicroMsg.Predownload.AppBrandBatchPreloadController";
    private int mBusinessScene = 0;
    private boolean mIsGameEnv = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController$a */
    public class C84318a implements Comparator<PreloadAppInfo> {
        public C84318a(AppBrandBatchPreloadController appBrandBatchPreloadController) {
        }

        public int compare(Object obj, Object obj2) {
            return new Float(((PreloadAppInfo) obj2).openRate).compareTo(new Float(((PreloadAppInfo) obj).openRate));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController$b */
    public class C84319b implements q$$g {

        /* renamed from: a */
        public final /* synthetic */ int f246209a;

        public C84319b(AppBrandBatchPreloadController appBrandBatchPreloadController, int i) {
            this.f246209a = i;
        }

        public void onReady() {
            C115669n.INSTANCE.mo175911u(this.f246209a, 50);
            Log.m105924i(AppBrandBatchPreloadController.TAG, "preloadMiniProgramEnv success");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController$c */
    public class C84320c implements C1256g<IPCVoid> {
        public C84320c(AppBrandBatchPreloadController appBrandBatchPreloadController) {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Log.m105924i(AppBrandBatchPreloadController.TAG, "predownloadPlugins success");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController$d */
    public class C84321d implements C1256g<IPCVoid> {
        public C84321d(AppBrandBatchPreloadController appBrandBatchPreloadController) {
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Log.m105924i(AppBrandBatchPreloadController.TAG, "predownloadAllPackages success");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController$e */
    public static class C84322e implements C80883e<IPCVoid, IPCVoid> {
        private C84322e() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Log.m105924i(AppBrandBatchPreloadController.TAG, "IPC_PreloadNextGame.invoke()");
            AppBrandProcessesManager.m103869I().mo116954S(LuggageServiceType.WAGAME, C88273g1.WXA_JSAPI_PRELOAD);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController$f */
    public static class C84323f implements C80883e<TaskParamsCallPredownload, IPCVoid> {
        private C84323f() {
        }

        public void invoke(Object obj, C1256g gVar) {
            TaskParamsCallPredownload taskParamsCallPredownload = (TaskParamsCallPredownload) obj;
            if (taskParamsCallPredownload == null) {
                Log.m105920e(AppBrandBatchPreloadController.TAG, "invoke in mm, NULL data");
                return;
            }
            MMHandlerThread.postToMainThread(new C84324a(this, taskParamsCallPredownload));
            gVar.mo894a(null);
        }
    }

    private void dealPreload(C84325d dVar, PreloadAppInfo preloadAppInfo) {
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            preloadMiniProgramEnv(preloadAppInfo.appType, PRELOAD_ENV_LEVEL.LOW_LEVEL, true);
        } else if (ordinal == 1) {
            preloadMiniProgramEnv(preloadAppInfo.appType, PRELOAD_ENV_LEVEL.MIDDLE_LEVEL, true);
            predownloadPlugins(preloadAppInfo);
        } else if (ordinal == 2) {
            preloadMiniProgramEnv(preloadAppInfo.appType, PRELOAD_ENV_LEVEL.HIGH_LEVEL, true);
            predownloadAllPackages(preloadAppInfo);
        }
    }

    private void predownloadAllPackages(PreloadAppInfo preloadAppInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new TaskParamsCallPredownload(preloadAppInfo.appId, preloadAppInfo.appType, preloadAppInfo.path, this.mBusinessScene, false, ""), C84323f.class, new C84321d(this));
    }

    private void predownloadPlugins(PreloadAppInfo preloadAppInfo) {
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new TaskParamsCallPredownload(preloadAppInfo.appId, preloadAppInfo.appType, preloadAppInfo.path, this.mBusinessScene, true, ""), C84323f.class, new C84320c(this));
    }

    private void preloadMiniProgramEnv(int i, PRELOAD_ENV_LEVEL preload_env_level, boolean z) {
        C84343y yVar = C84343y.NIL;
        if (i == 1004) {
            yVar = C84343y.WAGAME;
        } else if (i == 1000) {
            yVar = C84343y.WASERVICE;
        }
        C84343y yVar2 = yVar;
        if (!C34855o.m40516a() && this.mIsGameEnv && yVar2 == C84343y.WAGAME) {
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C84322e.class, (C1256g) null);
        } else if (C84331q.m103947b(yVar2)) {
            boolean z2 = yVar2 == C84343y.WAGAME;
            C84327g.C84329b bVar = C84327g.f246215a;
            int i2 = z2 ? 1539 : 1144;
            C115669n nVar = C115669n.INSTANCE;
            C88273g1 g1Var = C88273g1.WXA_JSAPI_BATCH_PRELOAD;
            nVar.mo175911u(i2, 49);
            C84331q.m103955j(yVar2, new C84319b(this, i2), z, (AppBrandPreloadProfiler) null, g1Var, 2);
        } else if (C84331q.m103957l(yVar2)) {
            Log.m105924i(TAG, "preloadMiniProgramEnv alreadyExist");
        } else {
            Log.m105924i(TAG, "preloadMiniProgramEnv fail internal error");
        }
    }

    public String preload(JSONObject jSONObject, boolean z) {
        float f;
        float f2;
        int i;
        this.mIsGameEnv = z;
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("openParams"));
            int optInt = jSONObject2.optInt("visitScene");
            this.mBusinessScene = jSONObject2.optInt("businessScene");
            int optInt2 = jSONObject2.optInt("innerScene");
            if (this.mBusinessScene == 0) {
                return "fail:mBusinessScene illegal";
            }
            JSONArray jSONArray = new JSONArray(jSONObject.optString("preloadList"));
            if (jSONArray.length() <= 0) {
                Log.m105928w(TAG, "preloadList is empty");
                return "fail:preloadList is empty";
            }
            if (C1972c.f11884a == null) {
                synchronized (C1972c.class) {
                    if (C1972c.f11884a == null) {
                        C1972c.f11884a = new C1972c();
                    }
                }
            }
            Map<Integer, Float> a = C1972c.f11884a.mo1871a(this.mBusinessScene, optInt2);
            if ((a == null || a.size() <= 0) && (i = this.mBusinessScene) != 1) {
                Log.m105921e(TAG, "predictRate null businessScene:%d,innerScene:%d", Integer.valueOf(i), Integer.valueOf(optInt2));
                return "fail:mBusinessScene predictRate error!";
            }
            float f3 = 1.0f;
            if (this.mBusinessScene == 1) {
                f2 = 0.0f;
                if (a != null) {
                    if (a.size() > 0) {
                        f3 = a.get(1).floatValue();
                        f = a.get(2).floatValue();
                    }
                }
                Log.m105921e(TAG, "inner predictRate null businessScene:%d,innerScene:%d", Integer.valueOf(this.mBusinessScene), Integer.valueOf(optInt2));
                f = 1.0f;
            } else {
                f2 = a.get(0).floatValue();
                f3 = a.get(1).floatValue();
                f = a.get(2).floatValue();
            }
            Log.m105925i(TAG, "mVisitScene:%d,mBusinessScene:%d,mInnerScene:%d,mLowLevelRate:%f,middleLevelRate:%f,highLevelRate:%f", Integer.valueOf(optInt), Integer.valueOf(this.mBusinessScene), Integer.valueOf(optInt2), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f));
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                PreloadAppInfo preloadAppInfo = new PreloadAppInfo();
                preloadAppInfo.openRate = (float) optJSONObject.optDouble("openRate");
                preloadAppInfo.appId = optJSONObject.optString("appId");
                preloadAppInfo.appType = optJSONObject.optInt("appType");
                preloadAppInfo.path = optJSONObject.optString("path");
                WeAppQualityPreloadOpenRateStatisStruct weAppQualityPreloadOpenRateStatisStruct = new WeAppQualityPreloadOpenRateStatisStruct();
                weAppQualityPreloadOpenRateStatisStruct.f237016d = (long) optInt;
                weAppQualityPreloadOpenRateStatisStruct.f237017e = (long) this.mBusinessScene;
                weAppQualityPreloadOpenRateStatisStruct.f237018f = (long) optInt2;
                weAppQualityPreloadOpenRateStatisStruct.f237019g = weAppQualityPreloadOpenRateStatisStruct.mo86045b("AppId", preloadAppInfo.appId, true);
                weAppQualityPreloadOpenRateStatisStruct.f237020h = (long) preloadAppInfo.appType;
                weAppQualityPreloadOpenRateStatisStruct.f237022j = weAppQualityPreloadOpenRateStatisStruct.mo86045b("openRate", String.valueOf(preloadAppInfo.openRate), true);
                weAppQualityPreloadOpenRateStatisStruct.f237021i = weAppQualityPreloadOpenRateStatisStruct.mo86045b("path", preloadAppInfo.path, true);
                weAppQualityPreloadOpenRateStatisStruct.mo86054n();
                float f4 = preloadAppInfo.openRate;
                if (f4 < f2) {
                    Log.m105925i(TAG, "preloadAppInfo.openRate:%f < mLowLevelRate:%f", Float.valueOf(f4), Float.valueOf(f2));
                } else {
                    arrayList.add(preloadAppInfo);
                }
            }
            if (arrayList.size() <= 0) {
                return "ok";
            }
            Collections.sort(arrayList, new C84318a(this));
            PreloadAppInfo preloadAppInfo2 = (PreloadAppInfo) arrayList.get(0);
            Log.m105925i(TAG, "high preloadAppInfo openRate:%f,appid:%s", Float.valueOf(preloadAppInfo2.openRate), preloadAppInfo2.appId);
            float f5 = preloadAppInfo2.openRate;
            if (f5 >= f) {
                dealPreload(C84325d.HIGH_LEVEL, preloadAppInfo2);
                return "ok";
            } else if (f5 >= f3) {
                dealPreload(C84325d.MIDDLE_LEVEL, preloadAppInfo2);
                return "ok";
            } else {
                dealPreload(C84325d.LOW_LEVEL, preloadAppInfo2);
                return "ok";
            }
        } catch (JSONException e) {
            Log.m105921e(TAG, "parse data error:%s", e);
            return "fail:params error!";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController$TaskParamsCallPredownload */
    public static class TaskParamsCallPredownload implements Parcelable {
        public static final Parcelable.Creator<TaskParamsCallPredownload> CREATOR = new C84317a();

        /* renamed from: d */
        public String f246203d;

        /* renamed from: e */
        public String f246204e;

        /* renamed from: f */
        public int f246205f;

        /* renamed from: g */
        public boolean f246206g;

        /* renamed from: h */
        public int f246207h;

        /* renamed from: i */
        public String f246208i;

        /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController$TaskParamsCallPredownload$a */
        public class C84317a implements Parcelable.Creator<TaskParamsCallPredownload> {
            public Object createFromParcel(Parcel parcel) {
                return new TaskParamsCallPredownload(parcel);
            }

            public Object[] newArray(int i) {
                return new TaskParamsCallPredownload[0];
            }
        }

        public TaskParamsCallPredownload(String str, int i, String str2, int i2, boolean z, String str3) {
            this.f246203d = str;
            this.f246207h = i;
            this.f246204e = str2;
            this.f246205f = i2;
            this.f246206g = z;
            this.f246208i = str3;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f246203d);
            parcel.writeInt(this.f246207h);
            parcel.writeString(this.f246204e);
            parcel.writeInt(this.f246205f);
            parcel.writeInt(this.f246206g ? 1 : 0);
            parcel.writeString(this.f246208i);
        }

        public TaskParamsCallPredownload(Parcel parcel) {
            this.f246203d = parcel.readString();
            this.f246207h = parcel.readInt();
            this.f246204e = parcel.readString();
            this.f246205f = parcel.readInt();
            this.f246206g = parcel.readInt() != 1 ? false : true;
            this.f246208i = parcel.readString();
        }
    }
}
