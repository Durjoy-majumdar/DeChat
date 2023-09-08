package com.tencent.map.lib.models;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.LatLngListDeserializer;
import java.util.List;

public class CommonParamsModelClass {

    public static class AnimationInfo extends JsonComposer {
        @Json(name = "duration")
        public float duration;
        @Json(name = "index")
        public int index;
        @Json(name = "name")
        public String name;

        public AnimationInfo(int i, String str, float f) {
            this.index = i;
            this.name = str;
            this.duration = f;
        }
    }

    public static class EnableClickParams extends JsonComposer {
        @Json(name = "enabled")
        public boolean enabled;
    }

    public static class ExposureParams extends JsonComposer {
        @Json(name = "exposure")
        public float exposure;
    }

    public static class MaterialVariantIndexParams extends JsonComposer {
        @Json(name = "index")
        public int variantIndex;
    }

    public static class MaterialVariantInfo extends JsonComposer {
        @Json(name = "name")
        public String variantName;
    }

    public static class MaterialVariantsInfoParams extends JsonComposer {
        @Json(name = "materialVariantsInfo")
        public List<MaterialVariantInfo> materialVariantInfoList;
    }

    public static class MonoColorParams extends JsonComposer {
        @Json(name = "b")

        /* renamed from: b */
        public float f339543b;
        @Json(name = "g")

        /* renamed from: g */
        public float f339544g;
        @Json(name = "r")

        /* renamed from: r */
        public float f339545r;
    }

    public static class PixelBoundParams extends JsonComposer {
        @Json(name = "height")
        public int height;
        @Json(name = "width")
        public int width;
    }

    public static class PlaySkeletonAnimationParams extends JsonComposer {
        @Json(name = "index")
        public int index;
        @Json(name = "repeat")
        public boolean repeat;
        @Json(name = "speed")
        public float speed;
    }

    public static class PositionParams extends JsonComposer {
        @Json(name = "altitude")
        public double altitude;
        @Json(name = "lat")
        public double lat;
        @Json(name = "lng")
        public double lng;
    }

    public static class RotationParams extends JsonComposer {
        @Json(name = "rotationX")
        public float rotationX;
        @Json(name = "rotationY")
        public float rotationY;
        @Json(name = "rotationZ")
        public float rotationZ;
    }

    public static class ScaleParams extends JsonComposer {
        @Json(name = "scale")
        public float scale;
    }

    public static class SkeletonAnimationParams extends JsonComposer {
        @Json(name = "animationInfo")
        public List<AnimationInfo> animationInfoList;
    }

    public static class StartTranslateAnimationParams extends JsonComposer {
        @Json(name = "duration")
        public float duration;
        @Json(name = "initRotation")
        public float initRotation;
        @Json(name = "needRotate")
        public boolean needRotate;
        @Json(deserializer = LatLngListDeserializer.class, name = "positions")
        public List<LatLng> positions;
    }

    public static class VisibleParams extends JsonComposer {
        @Json(name = "isVisible")
        public boolean isVisible;
    }

    public static class ZoomLevelRangeParams extends JsonComposer {
        @Json(name = "maxLevel")
        public int maxLevel;
        @Json(name = "minLevel")
        public int minLevel;
    }
}
