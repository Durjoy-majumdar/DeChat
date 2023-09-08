package sx1;

import com.tencent.p014mm.plugin.game.commlib.C41853c;
import com.tencent.p014mm.plugin.game.protobuf.GetGameCenterGlobalSettingResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import py1.C47631n;
import sx1.C48493b;

/* renamed from: sx1.a */
public class C48492a implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ String f129696d;

    /* renamed from: e */
    public final /* synthetic */ C48493b.C48494a f129697e;

    /* renamed from: f */
    public final /* synthetic */ C48493b f129698f;

    public C48492a(C48493b bVar, String str, C48493b.C48494a aVar) {
        this.f129698f = bVar;
        this.f129696d = str;
        this.f129697e = aVar;
    }

    public boolean onTimerExpired() {
        boolean z;
        C48493b.C48494a aVar;
        C47631n nVar;
        ((ConcurrentHashMap) this.f129698f.f129700a).remove(this.f129696d);
        C48493b bVar = this.f129698f;
        String str = this.f129696d;
        bVar.getClass();
        MultiProcessMMKV mmkv = MultiProcessMMKV.getMMKV("game_mmkv");
        String str2 = "";
        if (mmkv != null) {
            str2 = mmkv.decodeString("auto_run_switch", str2);
        }
        Log.m105925i("MicroMsg.GameAutoRunController", "autoRunSwitch:%s", str2);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has(str)) {
                if (jSONObject.getInt(str) == 0) {
                    z = false;
                    Log.m105925i("MicroMsg.GameAutoRunController", "taskId:%s, allowInvoke:%b", this.f129696d, Boolean.valueOf(z));
                    aVar = this.f129697e;
                    if (aVar != null && z) {
                        aVar.mo65649a();
                    }
                    return true;
                }
                z = true;
                Log.m105925i("MicroMsg.GameAutoRunController", "taskId:%s, allowInvoke:%b", this.f129696d, Boolean.valueOf(z));
                aVar = this.f129697e;
                aVar.mo65649a();
                return true;
            }
        } catch (JSONException unused) {
        }
        C41853c.m45371e();
        HashMap hashMap = new HashMap();
        if (C41853c.f112797a == null) {
            C41853c.m45381o();
        }
        GetGameCenterGlobalSettingResponse getGameCenterGlobalSettingResponse = C41853c.f112797a;
        if (!(getGameCenterGlobalSettingResponse == null || (nVar = getGameCenterGlobalSettingResponse.AutoRunTaskSetting) == null)) {
            hashMap.put("md5_check", Boolean.valueOf(nVar.f127877d));
            hashMap.put("download_resume", Boolean.valueOf(C41853c.f112797a.AutoRunTaskSetting.f127878e));
            hashMap.put("preload_commlib", Boolean.valueOf(C41853c.f112797a.AutoRunTaskSetting.f127879f));
            hashMap.put("game_silent_download", Boolean.valueOf(C41853c.f112797a.AutoRunTaskSetting.f127880g));
            hashMap.put("wepkg_download_retry", Boolean.valueOf(C41853c.f112797a.AutoRunTaskSetting.f127881h));
            hashMap.put("wepkg_expired_clean", Boolean.valueOf(C41853c.f112797a.AutoRunTaskSetting.f127882i));
            hashMap.put("game_cache_clean", Boolean.valueOf(C41853c.f112797a.AutoRunTaskSetting.f127883j));
            hashMap.put("game_resource_check", Boolean.valueOf(C41853c.f112797a.AutoRunTaskSetting.f127884n));
        }
        if (hashMap.containsKey(str)) {
            z = !((Boolean) hashMap.get(str)).booleanValue();
            Log.m105925i("MicroMsg.GameAutoRunController", "taskId:%s, allowInvoke:%b", this.f129696d, Boolean.valueOf(z));
            aVar = this.f129697e;
            aVar.mo65649a();
            return true;
        }
        z = true;
        Log.m105925i("MicroMsg.GameAutoRunController", "taskId:%s, allowInvoke:%b", this.f129696d, Boolean.valueOf(z));
        aVar = this.f129697e;
        aVar.mo65649a();
        return true;
    }
}
