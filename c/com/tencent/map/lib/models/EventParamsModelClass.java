package com.tencent.map.lib.models;

import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;

public class EventParamsModelClass {

    public static class ClickEventParams extends EventParams {
        @Json(name = "clickedPosition")
        public float[] clickedPosition;
        @Json(name = "identifier")
        public String identifier;
        @Json(name = "name")
        public String name;

        public ClickEventParams(String str, LatLng latLng, String str2, String str3) {
            this.eventType = VisualLayer.OnLayerStatusChangedListener.EventType.ON_CLICK;
            this.layerId = str;
            float[] fArr = new float[2];
            this.clickedPosition = fArr;
            fArr[0] = (float) latLng.getLatitude();
            this.clickedPosition[1] = (float) latLng.getLongitude();
            this.identifier = str2;
            this.name = str3;
        }
    }

    public static class EventParams extends JsonComposer {
        @Json(name = "eventType")
        public String eventType;
        @Json(name = "layerId")
        public String layerId;
    }

    public static class LoadFinishEventParams extends EventParams {
        public int errorCode;
        public String errorMsg;

        public enum LoadFinishInfo {
            ok(0, ""),
            errNetwork(1, VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_NETWORK),
            errAuth(2, VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_AUTH),
            errDataDecode(3, VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_DATA_DECODE),
            errDataAvailable(4, VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_DATA_AVAILABLE),
            errInternal(20, VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR);
            
            /* access modifiers changed from: private */
            public int errorCode;
            /* access modifiers changed from: private */
            public String errorMsg;

            private LoadFinishInfo(int i, String str) {
                this.errorCode = i;
                this.errorMsg = str;
            }

            public static LoadFinishInfo getById(int i) {
                for (LoadFinishInfo loadFinishInfo : values()) {
                    if (loadFinishInfo.checkStatus(i)) {
                        return loadFinishInfo;
                    }
                }
                return ok;
            }

            public final boolean checkStatus(int i) {
                return this.errorCode == i;
            }

            public final int getErrorCode() {
                return this.errorCode;
            }

            public final String getErrorMsg() {
                return this.errorMsg;
            }
        }

        public LoadFinishEventParams(String str, LoadFinishInfo loadFinishInfo) {
            this.eventType = VisualLayer.OnLayerStatusChangedListener.EventType.ON_LAYER_LOAD_FINISH;
            this.layerId = str;
            this.errorCode = loadFinishInfo.errorCode;
            this.errorMsg = loadFinishInfo.errorMsg;
        }
    }

    public static class TranslateAnimationCompleteEventParams extends EventParams {
        public TranslateAnimationCompleteEventParams(String str) {
            this.eventType = VisualLayer.OnLayerStatusChangedListener.EventType.ON_TRANSLATEANIMATION_COMPLETE;
            this.layerId = str;
        }
    }
}
