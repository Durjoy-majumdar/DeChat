package com.tencent.p014mm.plugin.mmsight.model;

import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.remoteservice.C96897a;
import com.tencent.p014mm.remoteservice.C96905d;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import ef3.C86513a;
import ef3.C86514b;
import f40.C86709a0;
import h81.C32735h;
import hd0.C98398h0;
import java.io.Serializable;
import java.lang.reflect.Method;
import lc3.C10485b;
import p158gt.C98201k;
import p511ew.C58849b;
import p625nu.C100195c;
import xb0.C102609h;

/* renamed from: com.tencent.mm.plugin.mmsight.model.CaptureMMProxy */
public class CaptureMMProxy extends C96897a implements C100195c {

    /* renamed from: f */
    public static CaptureMMProxy f272126f = null;

    /* renamed from: g */
    public static String f272127g = "";

    public CaptureMMProxy(C96905d dVar) {
        super(dVar);
    }

    public static void createProxy(CaptureMMProxy captureMMProxy) {
        f272126f = captureMMProxy;
    }

    public static CaptureMMProxy getInstance() {
        return f272126f;
    }

    /* renamed from: a */
    public Bundle mo127939a(Object... objArr) {
        Bundle bundle = new Bundle();
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            C72994y1.C72995a aVar = objArr[i];
            if (aVar instanceof Bundle) {
                bundle.putBundle("" + i, objArr[i]);
            } else if (aVar instanceof Parcelable) {
                bundle.putParcelable("" + i, objArr[i]);
            } else if (aVar instanceof C72994y1.C72995a) {
                Log.m105925i("MicroMsg.CaptureMMProxy", "objectsToBundle: %s", Integer.valueOf(aVar.ordinal()));
                bundle.putInt("" + i, objArr[i].ordinal());
            } else {
                bundle.putSerializable("" + i, objArr[i]);
            }
        }
        return bundle;
    }

    public boolean checkUseMMVideoPlayer() {
        Object REMOTE_CALL = REMOTE_CALL("checkUseMMVideoPlayerInMM", new Object[0]);
        if (REMOTE_CALL == null) {
            return true;
        }
        Log.m105925i("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayer[%b]", REMOTE_CALL);
        return ((Boolean) REMOTE_CALL).booleanValue();
    }

    @C86514b
    public boolean checkUseMMVideoPlayerInMM() {
        Log.m105918d("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayerInMM() called");
        C102609h.Fx0();
        boolean Am = C102609h.m135509Am();
        Log.m105918d("MicroMsg.CaptureMMProxy", "checkUseMMVideoPlayerInMM() returned: " + Am);
        return Am;
    }

    public void clearArtistCache() {
        REMOTE_CALL("clearArtistCacheInMM", new Object[0]);
    }

    @C86514b
    public void clearArtistCacheInMM() {
        Log.m105918d("MicroMsg.CaptureMMProxy", "clearArtistCacheInMM() called");
        ((C58849b) C86312j.m106911c(C58849b.class)).mo58069ZD().mo162892a();
    }

    public Object get(C72994y1.C72995a aVar, Object obj) {
        Log.m105925i("MicroMsg.CaptureMMProxy", "get %s %s", aVar, obj);
        Object REMOTE_CALL = REMOTE_CALL("getConfigStorage", aVar, obj);
        Log.m105925i("MicroMsg.CaptureMMProxy", "get %s %s and get val %s", aVar, obj, REMOTE_CALL);
        return REMOTE_CALL == null ? obj : REMOTE_CALL;
    }

    public String getAccVideoPath() {
        String str = (String) REMOTE_CALL("getAccVideoPathInMM", new Object[0]);
        Log.m105924i("MicroMsg.CaptureMMProxy", "getAccVideoPathInMM " + str + " accVideoPath: " + f272127g);
        if (!Util.isNullOrNil(str)) {
            f272127g = str;
        }
        return !Util.isNullOrNil(f272127g) ? f272127g : str;
    }

    @C86514b
    public String getAccVideoPathInMM() {
        Log.m105918d("MicroMsg.CaptureMMProxy", "getAccVideoPathInMM");
        return C98398h0.wx0().ca0();
    }

    public boolean getBoolean(C72994y1.C72995a aVar, boolean z) {
        Log.m105925i("MicroMsg.CaptureMMProxy", "getBoolean %s %s", aVar, Boolean.valueOf(z));
        Object REMOTE_CALL = REMOTE_CALL("getConfigStorage", aVar, Boolean.valueOf(z));
        Log.m105925i("MicroMsg.CaptureMMProxy", "getBoolean %s %s and get val %s", aVar, Boolean.valueOf(z), REMOTE_CALL);
        return REMOTE_CALL == null ? z : Util.getBoolean(REMOTE_CALL.toString(), z);
    }

    @C86514b
    public Object getConfigStorage(int i, Object obj) {
        C72994y1.C72995a aVar = ((C72994y1.C72995a[]) C72994y1.C72995a.class.getEnumConstants())[i];
        Log.m105925i("MicroMsg.CaptureMMProxy", "getConfigStorage, %s %s", aVar, obj);
        C86709a0.m107528h();
        return C86709a0.m107535s().mo121142i().mo119685f(aVar, obj);
    }

    public String getDeviceInfoConfig() {
        String str = (String) REMOTE_CALL("getDeviceInfoConfigInMM", new Object[0]);
        Log.m105925i("MicroMsg.CaptureMMProxy", "getDeviceInfoConfig return: %s", str);
        return str;
    }

    @C86514b
    public String getDeviceInfoConfigInMM() {
        C86709a0.m107528h();
        return C86709a0.m107535s().mo121144k().mo119656Lo(77825);
    }

    public String getDynamicConfig(String str) {
        String str2 = (String) REMOTE_CALL("getDynamicConfigInMM", str);
        Log.m105925i("MicroMsg.CaptureMMProxy", "getDynamicConfig, key: %s, value: %s", str, str2);
        return str2;
    }

    @C86514b
    public String getDynamicConfigInMM(String str) {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(str);
    }

    public VideoTransPara getGameVideoTransPara(int i) {
        Parcelable parcelable = (Parcelable) REMOTE_CALL("getGameVideoTransParaInMM", Integer.valueOf(i));
        Log.m105918d("MicroMsg.CaptureMMProxy", "getGameVideoTransPara() returned: " + parcelable);
        return (VideoTransPara) parcelable;
    }

    @C86514b
    public VideoTransPara getGameVideoTransParaInMM(int i) {
        Log.m105918d("MicroMsg.CaptureMMProxy", "getGameVideoTransParaInMM() called");
        VideoTransPara id = C102609h.Fx0().mo142240id(i);
        Log.m105918d("MicroMsg.CaptureMMProxy", "getVideoTransParaInMM() returned: " + id);
        return id;
    }

    public int getInt(C72994y1.C72995a aVar, int i) {
        Log.m105925i("MicroMsg.CaptureMMProxy", "getInt %s %s", aVar, Integer.valueOf(i));
        Object REMOTE_CALL = REMOTE_CALL("getConfigStorage", aVar, Integer.valueOf(i));
        Log.m105925i("MicroMsg.CaptureMMProxy", "getInt %s %s and get val %s", aVar, Integer.valueOf(i), REMOTE_CALL);
        return REMOTE_CALL == null ? i : Util.getInt(REMOTE_CALL.toString(), i);
    }

    public VideoTransPara getSnsAlbumVideoTransPara() {
        Parcelable parcelable = (Parcelable) REMOTE_CALL("getSnsAlbumVideoTransParaInMM", new Object[0]);
        Log.m105918d("MicroMsg.CaptureMMProxy", "getSnsAlbumVideoTransPara() returned: " + parcelable);
        return (VideoTransPara) parcelable;
    }

    @C86514b
    public VideoTransPara getSnsAlbumVideoTransParaInMM() {
        Log.m105918d("MicroMsg.CaptureMMProxy", "getSnsAlbumVideoTransParaInMM() called");
        VideoTransPara Gx0 = C102609h.Fx0().Gx0();
        Log.m105918d("MicroMsg.CaptureMMProxy", "getVideoTransParaInMM() returned: " + Gx0);
        return Gx0;
    }

    public String getSubCoreImageFullPath(String str) {
        String str2 = (String) REMOTE_CALL("getSubCoreImageFullPathInMM", str);
        Log.m105924i("MicroMsg.CaptureMMProxy", "getSubCoreImageFullPath " + str2);
        return str2;
    }

    @C86514b
    public String getSubCoreImageFullPathInMM(String str) {
        Log.m105919d("MicroMsg.CaptureMMProxy", "getSubCoreImageFullPathInMM, %s", str);
        return ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).mo127193mf(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getWeixinMeta() {
        /*
            r4 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "getWeixinMetaDataInMM"
            java.lang.Object r1 = r4.REMOTE_CALL(r2, r1)
            byte[] r1 = (byte[]) r1
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r1
            java.lang.String r0 = "MicroMsg.CaptureMMProxy"
            java.lang.String r3 = "getWeixinMeta result: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.model.CaptureMMProxy.getWeixinMeta():byte[]");
    }

    @C86514b
    public byte[] getWeixinMetaDataInMM() {
        return C102609h.Fx0().Ix0();
    }

    public void onCallback(String str, Bundle bundle, boolean z) {
        Log.m105925i("MicroMsg.CaptureMMProxy", "class:%s, method:%s, clientCall:%B", getClass().getName(), str, Boolean.valueOf(z));
        Method method = null;
        try {
            Method[] methods = getClass().getMethods();
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                if (method2.getName().equalsIgnoreCase(str)) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method != null) {
                if (method.isAnnotationPresent(z ? C86513a.class : C86514b.class)) {
                    Object invoke = method.invoke(this, getArgs(bundle));
                    if (method.getReturnType() == Void.TYPE) {
                        return;
                    }
                    if (invoke instanceof Parcelable) {
                        bundle.putParcelable("result_key", (Parcelable) invoke);
                        return;
                    }
                    if ("getConfigStorage".equals(str)) {
                        Log.m105925i("MicroMsg.CaptureMMProxy", "put result as Serializable: %s", (Serializable) invoke);
                    }
                    bundle.putSerializable("result_key", (Serializable) invoke);
                }
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.CaptureMMProxy", "exception:%s", Util.stackTraceToString(e));
        }
    }

    public boolean set(C72994y1.C72995a aVar, Object obj) {
        Object[] objArr = {aVar, obj};
        Log.m105919d("MicroMsg.CaptureMMProxy", "setConfigStorage, %s %s", aVar, obj);
        return ((Boolean) REMOTE_CALL("setConfigStorage", objArr)).booleanValue();
    }

    @C86514b
    public boolean setConfigStorage(int i, Object obj) {
        C72994y1.C72995a aVar = ((C72994y1.C72995a[]) C72994y1.C72995a.class.getEnumConstants())[i];
        Log.m105925i("MicroMsg.CaptureMMProxy", "setConfigStorage, %s %s", aVar, obj);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(aVar, obj);
        return true;
    }

    public boolean useMediaRecordNew() {
        Object REMOTE_CALL = REMOTE_CALL("useMediaRecordNewInMM", new Object[0]);
        if (REMOTE_CALL == null) {
            return true;
        }
        Log.m105925i("MicroMsg.CaptureMMProxy", "useMediaRecordNewInMM[%b]", REMOTE_CALL);
        return ((Boolean) REMOTE_CALL).booleanValue();
    }

    @C86514b
    public Boolean useMediaRecordNewInMM() {
        Log.m105918d("MicroMsg.CaptureMMProxy", "useMediaRecordNewInMM() called");
        return Boolean.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_jump_to_record_media, true));
    }
}
