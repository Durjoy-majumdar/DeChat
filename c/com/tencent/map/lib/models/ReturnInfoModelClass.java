package com.tencent.map.lib.models;

import com.tencent.map.lib.models.CommonParamsModelClass;
import com.tencent.map.sdk.comps.vis.VisualLayer;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import java.util.ArrayList;
import java.util.List;

public class ReturnInfoModelClass {

    public static class BaseBooleanReturnInfo extends ReturnStatus {
        public boolean value;

        public BaseBooleanReturnInfo(boolean z) {
            this.status = "success";
            this.value = z;
        }
    }

    public static class BaseFloatReturnInfo extends ReturnStatus {
        public float value;

        public BaseFloatReturnInfo(float f) {
            this.status = "success";
            this.value = f;
        }
    }

    public static class BaseIntReturnInfo extends ReturnStatus {
        public int value;

        public BaseIntReturnInfo(int i) {
            this.status = "success";
            this.value = i;
        }
    }

    public static class BaseStringReturnInfo extends ReturnStatus {
        public String value;

        public BaseStringReturnInfo(String str) {
            this.status = "success";
            this.value = str;
        }
    }

    public static class ErrorReturnInfo extends ReturnStatus {
        public int errorCode;
        public String errorMsg;

        public enum ErrorMsg {
            success(0, "none"),
            jsonparse(1, "json parse error"),
            unsupported(2, "unsupported function"),
            internal(3, VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR);
            
            private int errorCode;
            private String errorMsg;

            private ErrorMsg(int i, String str) {
                this.errorCode = i;
                this.errorMsg = str;
            }

            public final int getErrorCode() {
                return this.errorCode;
            }

            public final String getErrorMsg() {
                return this.errorMsg;
            }
        }

        public ErrorReturnInfo(ErrorMsg errorMsg2) {
            this.status = StateEvent.ProcessResult.FAILED;
            this.errorCode = errorMsg2.getErrorCode();
            this.errorMsg = errorMsg2.getErrorMsg();
        }
    }

    public static class MaterialVariantsReturnInfo extends ReturnStatus {
        public CommonParamsModelClass.MaterialVariantsInfoParams value;

        public MaterialVariantsReturnInfo(List<CommonParamsModelClass.MaterialVariantInfo> list) {
            CommonParamsModelClass.MaterialVariantsInfoParams materialVariantsInfoParams = new CommonParamsModelClass.MaterialVariantsInfoParams();
            this.value = materialVariantsInfoParams;
            materialVariantsInfoParams.materialVariantInfoList = list;
        }
    }

    public static class PositionReturnInfo extends ReturnStatus {
        public CommonParamsModelClass.PositionParams value;

        public PositionReturnInfo(LatLng latLng) {
            CommonParamsModelClass.PositionParams positionParams = new CommonParamsModelClass.PositionParams();
            this.value = positionParams;
            positionParams.lat = latLng.latitude;
            positionParams.lng = latLng.longitude;
            positionParams.altitude = latLng.altitude;
        }
    }

    public static class ReturnStatus extends JsonComposer {
        public String status = "success";
    }

    public static class RotationReturnInfo extends ReturnStatus {
        public CommonParamsModelClass.RotationParams value;

        public RotationReturnInfo(float f, float f2, float f3) {
            CommonParamsModelClass.RotationParams rotationParams = new CommonParamsModelClass.RotationParams();
            this.value = rotationParams;
            rotationParams.rotationX = f;
            rotationParams.rotationY = f2;
            rotationParams.rotationZ = f3;
        }
    }

    public static class SkeletonAnimationReturnInfo extends ReturnStatus {
        public CommonParamsModelClass.SkeletonAnimationParams value;

        public SkeletonAnimationReturnInfo(List<CommonParamsModelClass.AnimationInfo> list) {
            CommonParamsModelClass.SkeletonAnimationParams skeletonAnimationParams = new CommonParamsModelClass.SkeletonAnimationParams();
            this.value = skeletonAnimationParams;
            skeletonAnimationParams.animationInfoList = list == null ? new ArrayList<>() : list;
        }
    }
}
