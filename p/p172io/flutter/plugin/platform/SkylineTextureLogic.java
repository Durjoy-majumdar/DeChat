package p172io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.util.SparseArray;
import android.view.MotionEvent;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002J\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\"\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\nJ:\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nJ0\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nJ \u0010\u001a\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\nJ(\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u001f\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b!\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R6\u0010'\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020%j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002`&0$8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R8\u0010)\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120%j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0012`&0$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006,"}, mo182094d2 = {"Lio/flutter/plugin/platform/SkylineTextureLogic;", "", "", "viewType", "", "isSkylineTextureType", "Lio/flutter/plugin/platform/ISkylineTextureHandler;", "handler", "Lrx3/b0;", "initSkylineTextureHandler", "", "engineId", "id", "isSkylineTexture", "type", "addSkylineTexture", "getSkylineTextureType", "removeSkylineTexture", "Lio/flutter/plugin/platform/SkylineTextureInfo;", "getSkylineTextureInfo", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "width", "height", "onTextureReady", "onTextureUpdate", "onTextureDestroy", "Landroid/view/MotionEvent;", "motionEvent", "onTextureTouch", "destroy", "TAG", "Ljava/lang/String;", "VIEW_TYPE", "sSkylineTextureHandler", "Lio/flutter/plugin/platform/ISkylineTextureHandler;", "Landroid/util/SparseArray;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "skylineTextureIdsArray", "Landroid/util/SparseArray;", "sSkylineTextureInfoMapArray", "<init>", "()V", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: io.flutter.plugin.platform.SkylineTextureLogic */
public final class SkylineTextureLogic {
    public static final SkylineTextureLogic INSTANCE = new SkylineTextureLogic();
    private static final String TAG = "SkylineTextureLogic";
    private static final String VIEW_TYPE = "skyline_texture";
    private static ISkylineTextureHandler sSkylineTextureHandler;
    private static SparseArray<HashMap<String, SkylineTextureInfo>> sSkylineTextureInfoMapArray = new SparseArray<>();
    private static final SparseArray<HashMap<String, String>> skylineTextureIdsArray = new SparseArray<>();

    private SkylineTextureLogic() {
    }

    public final void addSkylineTexture(int i, int i2, String str) {
        C87412m.m108594g(str, "type");
        SparseArray<HashMap<String, String>> sparseArray = skylineTextureIdsArray;
        HashMap hashMap = sparseArray.get(i);
        if (hashMap == null) {
            sparseArray.put(i, new HashMap());
            hashMap = sparseArray.get(i);
        }
        C87412m.m108593f(hashMap, "skylineTextureIds");
        hashMap.put(C87412m.m108600m("skyline_texture-", Integer.valueOf(i2)), str);
    }

    public final void destroy(int i) {
        C87412m.m108600m("destroy engineId:", Integer.valueOf(i));
        skylineTextureIdsArray.remove(i);
        HashMap hashMap = sSkylineTextureInfoMapArray.get(i);
        if (hashMap != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                SkylineTextureInfo skylineTextureInfo = (SkylineTextureInfo) entry.getValue();
                skylineTextureInfo.getType();
                skylineTextureInfo.getId();
                ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
                if (iSkylineTextureHandler != null) {
                    iSkylineTextureHandler.onTextureDestroy(i, skylineTextureInfo.getType(), skylineTextureInfo.getId());
                }
            }
        }
        sSkylineTextureInfoMapArray.clear();
    }

    public final SkylineTextureInfo getSkylineTextureInfo(int i, String str, int i2) {
        HashMap hashMap = sSkylineTextureInfoMapArray.get(i);
        if (hashMap == null) {
            return null;
        }
        return (SkylineTextureInfo) hashMap.get(str + '#' + i2);
    }

    public final String getSkylineTextureType(int i, int i2) {
        return (String) skylineTextureIdsArray.get(i).get(C87412m.m108600m("skyline_texture-", Integer.valueOf(i2)));
    }

    public final void initSkylineTextureHandler(ISkylineTextureHandler iSkylineTextureHandler) {
        C87412m.m108594g(iSkylineTextureHandler, "handler");
        sSkylineTextureHandler = iSkylineTextureHandler;
    }

    public final boolean isSkylineTexture(int i, int i2) {
        HashMap hashMap = skylineTextureIdsArray.get(i);
        if (hashMap == null) {
            return false;
        }
        return hashMap.containsKey(C87412m.m108600m("skyline_texture-", Integer.valueOf(i2)));
    }

    public final boolean isSkylineTextureType(String str) {
        C87412m.m108594g(str, "viewType");
        return C87412m.m108589b(str, VIEW_TYPE);
    }

    public final void onTextureDestroy(int i, String str, int i2) {
        HashMap hashMap = sSkylineTextureInfoMapArray.get(i);
        if (hashMap != null) {
            SkylineTextureInfo skylineTextureInfo = (SkylineTextureInfo) hashMap.remove(str + '#' + i2);
        }
        if (hashMap.isEmpty()) {
            sSkylineTextureInfoMapArray.remove(i);
        }
        ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
        if (iSkylineTextureHandler != null) {
            iSkylineTextureHandler.onTextureDestroy(i, str, i2);
        }
    }

    public final void onTextureReady(int i, String str, int i2, SurfaceTexture surfaceTexture, int i3, int i4) {
        Objects.toString(surfaceTexture);
        HashMap hashMap = sSkylineTextureInfoMapArray.get(i);
        if (hashMap == null) {
            sSkylineTextureInfoMapArray.put(i, new HashMap());
            hashMap = sSkylineTextureInfoMapArray.get(i);
        }
        C87412m.m108593f(hashMap, "sSkylineTextureInfoMap");
        hashMap.put(str + '#' + i2, new SkylineTextureInfo(i2, str, i3, i4));
        ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
        if (iSkylineTextureHandler != null) {
            iSkylineTextureHandler.onTextureReady(i, str, i2, surfaceTexture, i3, i4);
        }
    }

    public final void onTextureTouch(int i, String str, int i2, MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "motionEvent");
        motionEvent.toString();
        ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
        if (iSkylineTextureHandler != null) {
            iSkylineTextureHandler.onTextureTouch(i, str, i2, motionEvent);
        }
    }

    public final void onTextureUpdate(int i, String str, int i2, int i3, int i4) {
        ISkylineTextureHandler iSkylineTextureHandler = sSkylineTextureHandler;
        if (iSkylineTextureHandler != null) {
            iSkylineTextureHandler.onTextureUpdate(i, str, i2, i3, i4);
        }
    }

    public final void removeSkylineTexture(int i, int i2) {
        SparseArray<HashMap<String, String>> sparseArray = skylineTextureIdsArray;
        HashMap hashMap = sparseArray.get(i);
        hashMap.remove(C87412m.m108600m("skyline_texture-", Integer.valueOf(i2)));
        if (hashMap.isEmpty()) {
            sparseArray.remove(i);
        }
    }
}
