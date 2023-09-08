package com.tencent.map.lib.models;

import com.tencent.map.lib.models.CommonParamsModelClass;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;

public class CommandFunctionModelClass {

    public static class BaseCommandFunction extends JsonComposer {
        @Json(name = "function")
        public String commandFunction;
    }

    public static class EnableClickCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.EnableClickParams params;
    }

    public static class ErrorCommandFunction extends BaseCommandFunction {
    }

    public static class GetClickEnabledCommand extends BaseCommandFunction {
    }

    public static class GetCurrentMaterialVariantCommand extends BaseCommandFunction {
    }

    public static class GetExposureCommand extends BaseCommandFunction {
    }

    public static class GetMaterialVariantsCommand extends BaseCommandFunction {
    }

    public static class GetPositionCommand extends BaseCommandFunction {
    }

    public static class GetRotationCommand extends BaseCommandFunction {
    }

    public static class GetScaleCommand extends BaseCommandFunction {
    }

    public static class GetSkeletonAnimationInfoCommand extends BaseCommandFunction {
    }

    public static class GetTypeCommand extends BaseCommandFunction {
    }

    public static class GetVisibleCommand extends BaseCommandFunction {
    }

    public static class PlaySkeletonAnimationCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.PlaySkeletonAnimationParams params;
    }

    public static class ResetColorCommand extends BaseCommandFunction {
    }

    public static class SetExposureCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.ExposureParams params;
    }

    public static class SetMaterialVariantCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.MaterialVariantIndexParams params;
    }

    public static class SetMonoColorCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.MonoColorParams params;
    }

    public static class SetPixelBoundCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.PixelBoundParams params;
    }

    public static class SetPositionCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.PositionParams params;
    }

    public static class SetRotationCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.RotationParams params;
    }

    public static class SetScaleCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.ScaleParams params;
    }

    public static class SetVisibleCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.VisibleParams params;
    }

    public static class SetZoomLevelRangeCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.ZoomLevelRangeParams params;
    }

    public static class StartTranslateAnimationCommand extends BaseCommandFunction {
        @Json(name = "params")
        public CommonParamsModelClass.StartTranslateAnimationParams params;
    }

    public static class StopSkeletonAnimationCommand extends BaseCommandFunction {
    }
}
