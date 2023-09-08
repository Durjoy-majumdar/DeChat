package com.tencent.map.sdk.utilities.visualization.glmodel;

import com.tencent.map.lib.models.CommonParamsModelClass;
import com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel;
import com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay;
import java.util.List;

public interface GLModelOverlay extends IAnimatorModel, VectorOverlay {
    int getCurrentMaterialVariant();

    List<CommonParamsModelClass.MaterialVariantInfo> getMaterialVariants();

    List<CommonParamsModelClass.AnimationInfo> getSkeletonAnimationProperties();

    void playSkeletonAnimation(int i, float f, boolean z);

    void resetMonoColor();

    void setMaterialVariant(int i);

    void setMonoColor(CommonParamsModelClass.MonoColorParams monoColorParams);

    void stopSkeletonAnimation();
}
