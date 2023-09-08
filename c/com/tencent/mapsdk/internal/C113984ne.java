package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.CommandFunctionModelClass;
import com.tencent.map.lib.models.CommonParamsModelClass;
import com.tencent.map.lib.models.ReturnInfoModelClass;
import com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlay;
import com.tencent.map.sdk.utilities.visualization.glmodel.GLModelOverlayProvider;
import com.tencent.mapsdk.internal.C113971mt;
import com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import java.util.List;

/* renamed from: com.tencent.mapsdk.internal.ne */
public class C113984ne extends C113970ms<C113983nd> implements GLModelOverlay {

    /* renamed from: e */
    private GeneralTranslateAnimator f340976e;

    public C113984ne(C113982nc ncVar, C113983nd ndVar) {
        super(ncVar, ndVar);
    }

    /* renamed from: c */
    public final void mo172532c() {
        if (this.f340976e != null) {
            if (((C113983nd) this.f340956d).f340975a.getTransAnimatorEndListener() != null) {
                this.f340976e.removeAnimatorEndListener(((C113983nd) this.f340956d).f340975a.getTransAnimatorEndListener());
            }
            this.f340976e.cancelAnimation();
        }
    }

    public void enableClick(boolean z) {
        T t = this.f340956d;
        if (((C113983nd) t).f340975a != null) {
            ((C113983nd) t).f340975a.enableClick(z);
        }
        ((C113983nd) this.f340956d).enableClick(z);
        mo172478a(this.f340956d);
    }

    public ReturnInfoModelClass.ReturnStatus executeCommandFunction(CommandFunctionModelClass.BaseCommandFunction baseCommandFunction) {
        if (baseCommandFunction == null) {
            return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
        }
        String name = baseCommandFunction.getClass().getName();
        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetZoomLevelRangeCommand")) {
            CommonParamsModelClass.ZoomLevelRangeParams zoomLevelRangeParams = ((CommandFunctionModelClass.SetZoomLevelRangeCommand) baseCommandFunction).params;
            if (zoomLevelRangeParams == null) {
                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            ((C113983nd) this.f340956d).setZoomLevelRange(zoomLevelRangeParams.minLevel, zoomLevelRangeParams.maxLevel);
            mo172478a(this.f340956d);
            return new ReturnInfoModelClass.ReturnStatus();
        } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$StartTranslateAnimationCommand")) {
            CommandFunctionModelClass.StartTranslateAnimationCommand startTranslateAnimationCommand = (CommandFunctionModelClass.StartTranslateAnimationCommand) baseCommandFunction;
            CommonParamsModelClass.StartTranslateAnimationParams startTranslateAnimationParams = startTranslateAnimationCommand.params;
            if (startTranslateAnimationParams == null) {
                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            if (startTranslateAnimationParams.positions == null) {
                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            mo172532c();
            CommonParamsModelClass.StartTranslateAnimationParams startTranslateAnimationParams2 = startTranslateAnimationCommand.params;
            this.f340976e = new GeneralTranslateAnimator.Builder(this, (long) (startTranslateAnimationParams2.duration * 1000.0f), (LatLng[]) startTranslateAnimationParams2.positions.toArray(new LatLng[0])).rotateEnabled(startTranslateAnimationCommand.params.needRotate).modelType(GeneralTranslateAnimator.ModelType.MODEL_OVERLAY).initRotate(startTranslateAnimationCommand.params.initRotation).build();
            if (((C113983nd) this.f340956d).f340975a.getTransAnimatorEndListener() != null) {
                this.f340976e.addAnimatorEndListener(((C113983nd) this.f340956d).f340975a.getTransAnimatorEndListener());
            }
            this.f340976e.startAnimation();
            return new ReturnInfoModelClass.ReturnStatus();
        } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetRotationCommand")) {
            CommonParamsModelClass.RotationParams rotationParams = ((CommandFunctionModelClass.SetRotationCommand) baseCommandFunction).params;
            if (rotationParams == null) {
                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            float f = rotationParams.rotationX;
            float f2 = rotationParams.rotationY;
            float f3 = rotationParams.rotationZ;
            T t = this.f340956d;
            if (((C113983nd) t).f340975a != null) {
                ((C113983nd) t).f340975a.rotationX(f).rotationY(f2).rotationZ(f3);
            }
            ((C113983nd) this.f340956d).setRotationX(f);
            ((C113983nd) this.f340956d).setRotationY(f2);
            ((C113983nd) this.f340956d).setRotationZ(f3);
            mo172478a(this.f340956d);
            return new ReturnInfoModelClass.ReturnStatus();
        } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetExposureCommand")) {
            CommandFunctionModelClass.SetExposureCommand setExposureCommand = (CommandFunctionModelClass.SetExposureCommand) baseCommandFunction;
            CommonParamsModelClass.ExposureParams exposureParams = setExposureCommand.params;
            if (exposureParams == null) {
                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            T t2 = this.f340956d;
            if (((C113983nd) t2).f340975a != null) {
                ((C113983nd) t2).f340975a.setExposure(exposureParams.exposure);
            }
            ((C113983nd) this.f340956d).setExposure(setExposureCommand.params.exposure);
            mo172478a(this.f340956d);
            return new ReturnInfoModelClass.ReturnStatus();
        } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetVisibleCommand")) {
            CommonParamsModelClass.VisibleParams visibleParams = ((CommandFunctionModelClass.SetVisibleCommand) baseCommandFunction).params;
            if (visibleParams == null) {
                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            setVisibility(visibleParams.isVisible);
            return new ReturnInfoModelClass.ReturnStatus();
        } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetCurrentMaterialVariantCommand")) {
            return new ReturnInfoModelClass.BaseIntReturnInfo(getCurrentMaterialVariant());
        } else {
            if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$ErrorCommandFunction")) {
                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.unsupported);
            }
            if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetMaterialVariantCommand")) {
                CommonParamsModelClass.MaterialVariantIndexParams materialVariantIndexParams = ((CommandFunctionModelClass.SetMaterialVariantCommand) baseCommandFunction).params;
                if (materialVariantIndexParams == null) {
                    return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
                }
                setMaterialVariant(materialVariantIndexParams.variantIndex);
                return new ReturnInfoModelClass.ReturnStatus();
            } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetVisibleCommand")) {
                return new ReturnInfoModelClass.BaseBooleanReturnInfo(((C113983nd) this.f340956d).isVisible());
            } else {
                if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetMaterialVariantsCommand")) {
                    return new ReturnInfoModelClass.MaterialVariantsReturnInfo(getMaterialVariants());
                }
                if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetPixelBoundCommand")) {
                    CommandFunctionModelClass.SetPixelBoundCommand setPixelBoundCommand = (CommandFunctionModelClass.SetPixelBoundCommand) baseCommandFunction;
                    if (setPixelBoundCommand.params == null) {
                        return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
                    }
                    T t3 = this.f340956d;
                    if (((C113983nd) t3).f340975a != null) {
                        ((C113983nd) t3).f340975a.coordType(GLModelOverlayProvider.CoordType.PixelType);
                        GLModelOverlayProvider gLModelOverlayProvider = ((C113983nd) this.f340956d).f340975a;
                        CommonParamsModelClass.PixelBoundParams pixelBoundParams = setPixelBoundCommand.params;
                        gLModelOverlayProvider.pixelBounds(pixelBoundParams.width, pixelBoundParams.height);
                    }
                    ((C113983nd) this.f340956d).setCoordType(GLModelOverlayProvider.CoordType.PixelType.ordinal());
                    CommonParamsModelClass.PixelBoundParams pixelBoundParams2 = setPixelBoundCommand.params;
                    ((C113983nd) this.f340956d).setPixelBound(pixelBoundParams2.width, pixelBoundParams2.height);
                    mo172478a(this.f340956d);
                    return new ReturnInfoModelClass.ReturnStatus();
                } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetPositionCommand")) {
                    return new ReturnInfoModelClass.PositionReturnInfo(((C113983nd) this.f340956d).getPosition());
                } else {
                    if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetClickEnabledCommand")) {
                        return new ReturnInfoModelClass.BaseBooleanReturnInfo(isClickEnabled());
                    }
                    if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetScaleCommand")) {
                        return new ReturnInfoModelClass.BaseFloatReturnInfo((float) ((C113983nd) this.f340956d).getScale());
                    }
                    if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$ResetColorCommand")) {
                        resetMonoColor();
                        return new ReturnInfoModelClass.ReturnStatus();
                    } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetSkeletonAnimationInfoCommand")) {
                        return new ReturnInfoModelClass.SkeletonAnimationReturnInfo(getSkeletonAnimationProperties());
                    } else {
                        if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetPositionCommand")) {
                            CommandFunctionModelClass.SetPositionCommand setPositionCommand = (CommandFunctionModelClass.SetPositionCommand) baseCommandFunction;
                            if (setPositionCommand.params == null) {
                                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
                            }
                            CommonParamsModelClass.PositionParams positionParams = setPositionCommand.params;
                            LatLng latLng = new LatLng(positionParams.lat, positionParams.lng, positionParams.altitude);
                            T t4 = this.f340956d;
                            if (((C113983nd) t4).f340975a != null) {
                                ((C113983nd) t4).f340975a.position(latLng);
                            }
                            ((C113983nd) this.f340956d).setModelPosition(latLng);
                            mo172478a(this.f340956d);
                            return new ReturnInfoModelClass.ReturnStatus();
                        } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$EnableClickCommand")) {
                            CommonParamsModelClass.EnableClickParams enableClickParams = ((CommandFunctionModelClass.EnableClickCommand) baseCommandFunction).params;
                            if (enableClickParams == null) {
                                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
                            }
                            enableClick(enableClickParams.enabled);
                            return new ReturnInfoModelClass.ReturnStatus();
                        } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetScaleCommand")) {
                            CommonParamsModelClass.ScaleParams scaleParams = ((CommandFunctionModelClass.SetScaleCommand) baseCommandFunction).params;
                            if (scaleParams == null) {
                                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
                            }
                            float f4 = scaleParams.scale;
                            T t5 = this.f340956d;
                            if (((C113983nd) t5).f340975a != null) {
                                ((C113983nd) t5).f340975a.coordType(GLModelOverlayProvider.CoordType.GeoGraphicType);
                                ((C113983nd) this.f340956d).f340975a.scale((double) f4);
                            }
                            ((C113983nd) this.f340956d).setCoordType(GLModelOverlayProvider.CoordType.GeoGraphicType.ordinal());
                            ((C113983nd) this.f340956d).setScale(f4);
                            mo172478a(this.f340956d);
                            return new ReturnInfoModelClass.ReturnStatus();
                        } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetTypeCommand")) {
                            return new ReturnInfoModelClass.BaseStringReturnInfo(getType());
                        } else {
                            if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$PlaySkeletonAnimationCommand")) {
                                CommonParamsModelClass.PlaySkeletonAnimationParams playSkeletonAnimationParams = ((CommandFunctionModelClass.PlaySkeletonAnimationCommand) baseCommandFunction).params;
                                if (playSkeletonAnimationParams == null) {
                                    return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
                                }
                                playSkeletonAnimation(playSkeletonAnimationParams.index, playSkeletonAnimationParams.speed, playSkeletonAnimationParams.repeat);
                                return new ReturnInfoModelClass.ReturnStatus();
                            } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetMonoColorCommand")) {
                                CommonParamsModelClass.MonoColorParams monoColorParams = ((CommandFunctionModelClass.SetMonoColorCommand) baseCommandFunction).params;
                                if (monoColorParams == null) {
                                    return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
                                }
                                setMonoColor(monoColorParams);
                                return new ReturnInfoModelClass.ReturnStatus();
                            } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetRotationCommand")) {
                                return new ReturnInfoModelClass.RotationReturnInfo(((C113983nd) this.f340956d).getRotationX(), ((C113983nd) this.f340956d).getRotationY(), ((C113983nd) this.f340956d).getRotationZ());
                            } else {
                                if (!name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$StopSkeletonAnimationCommand")) {
                                    return !name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetExposureCommand") ? new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.unsupported) : new ReturnInfoModelClass.BaseFloatReturnInfo(((C113983nd) this.f340956d).getExposure());
                                }
                                stopSkeletonAnimation();
                                return new ReturnInfoModelClass.ReturnStatus();
                            }
                        }
                    }
                }
            }
        }
    }

    public int getCurrentMaterialVariant() {
        C113971mt<T> mtVar = this.f340955c;
        if (!(mtVar instanceof C113982nc)) {
            return 0;
        }
        return ((C113982nc) mtVar).mo172530d(this.f340954b);
    }

    public List<CommonParamsModelClass.MaterialVariantInfo> getMaterialVariants() {
        C113971mt<T> mtVar = this.f340955c;
        if (!(mtVar instanceof C113982nc)) {
            return null;
        }
        return ((C113982nc) mtVar).mo172529c(this.f340954b);
    }

    public float getRotation() {
        return ((C113983nd) this.f340956d).getRotationY();
    }

    public List<CommonParamsModelClass.AnimationInfo> getSkeletonAnimationProperties() {
        C113971mt<T> mtVar = this.f340955c;
        if (!(mtVar instanceof C113982nc)) {
            return null;
        }
        return ((C113982nc) mtVar).mo172528b(this.f340954b);
    }

    public String getType() {
        return C113646dz.GLModel.f340043h;
    }

    public boolean isClickEnabled() {
        return ((C113983nd) this.f340956d).isClickEnabled();
    }

    public void playSkeletonAnimation(int i, float f, boolean z) {
        ((C113982nc) this.f340955c).mo172527a(this.f340954b, i, f, z);
    }

    public void resetMonoColor() {
        C113971mt<T> mtVar = this.f340955c;
        if (mtVar instanceof C113982nc) {
            ((C113982nc) mtVar).mo172531e(this.f340954b);
        }
    }

    public void setLevel(int i) {
        T t = this.f340956d;
        if (((C113983nd) t).f340975a != null) {
            ((C113983nd) t).f340975a.displayLevel(i);
        }
        ((C113983nd) this.f340956d).setLevel(i);
        mo172478a(this.f340956d);
    }

    public void setMaterialVariant(int i) {
        C113971mt<T> mtVar = this.f340955c;
        if (mtVar instanceof C113982nc) {
            ((C113982nc) mtVar).mo172526a(this.f340954b, i);
        }
    }

    public void setMonoColor(CommonParamsModelClass.MonoColorParams monoColorParams) {
        C113971mt<T> mtVar = this.f340955c;
        if ((mtVar instanceof C113982nc) && monoColorParams != null) {
            ((C113982nc) mtVar).mo172525a(this.f340954b, monoColorParams.f339545r, monoColorParams.f339544g, monoColorParams.f339543b);
        }
    }

    public void setOpacity(float f) {
        T t = this.f340956d;
        if (((C113983nd) t).f340975a != null) {
            ((C113983nd) t).f340975a.opacity(f);
        }
        ((C113983nd) this.f340956d).setOpacity(f);
        mo172478a(this.f340956d);
    }

    public void setPosition(LatLng latLng) {
        T t = this.f340956d;
        if (((C113983nd) t).f340975a != null) {
            ((C113983nd) t).f340975a.position(latLng);
        }
        ((C113983nd) this.f340956d).setModelPosition(latLng);
        mo172478a(this.f340956d);
    }

    public void setRotation(float f) {
        T t = this.f340956d;
        if (((C113983nd) t).f340975a != null) {
            ((C113983nd) t).f340975a.rotationY(f);
        }
        ((C113983nd) this.f340956d).setRotationY(f);
        mo172478a(this.f340956d);
    }

    public void setVisibility(boolean z) {
        T t = this.f340956d;
        if (((C113983nd) t).f340975a != null) {
            ((C113983nd) t).f340975a.visibility(z);
        }
        ((C113983nd) this.f340956d).setVisible(z);
        mo172478a(this.f340956d);
    }

    public void setZIndex(int i) {
        T t = this.f340956d;
        if (((C113983nd) t).f340975a != null) {
            ((C113983nd) t).f340975a.zIndex(i);
        }
        ((C113983nd) this.f340956d).setzIndex(i);
        mo172478a(this.f340956d);
    }

    public void stopSkeletonAnimation() {
        ((C113982nc) this.f340955c).mo172524a(this.f340954b);
    }

    /* renamed from: a */
    public final void mo172477a(long j) {
        this.f340954b = j;
    }

    /* renamed from: a */
    private void m158341a(final C113971mt.C113972a aVar) {
        C113865kb.m157399a((Runnable) new Runnable() {
            public final void run() {
                if (((C113983nd) C113984ne.this.f340956d).getOutterVectorOverlayClickListener() != null) {
                    ((C113983nd) C113984ne.this.f340956d).getOutterVectorOverlayClickListener().onClicked(aVar.getPosition(), aVar.getIdentifier(), aVar.getName());
                }
            }
        });
    }
}
