package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.CommandFunctionModelClass;
import com.tencent.map.lib.models.CommonParamsModelClass;
import com.tencent.map.lib.models.ReturnInfoModelClass;
import com.tencent.map.sdk.utilities.visualization.heatmap.GradientVectorOverlay;

/* renamed from: com.tencent.mapsdk.internal.ni */
public class C113989ni extends C113970ms<C113991nk> implements GradientVectorOverlay {
    public C113989ni(C113990nj njVar, C113991nk nkVar) {
        super(njVar, nkVar);
    }

    public void enableClick(boolean z) {
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
            ((C113991nk) this.f340956d).setZoomLevelRange(zoomLevelRangeParams.minLevel, zoomLevelRangeParams.maxLevel);
            mo172478a(this.f340956d);
            return new ReturnInfoModelClass.ReturnStatus();
        } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$SetVisibleCommand")) {
            CommonParamsModelClass.VisibleParams visibleParams = ((CommandFunctionModelClass.SetVisibleCommand) baseCommandFunction).params;
            if (visibleParams == null) {
                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            setVisibility(visibleParams.isVisible);
            return new ReturnInfoModelClass.ReturnStatus();
        } else if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetVisibleCommand")) {
            return new ReturnInfoModelClass.BaseBooleanReturnInfo(((C113991nk) this.f340956d).isVisible());
        } else {
            if (name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetClickEnabledCommand")) {
                return new ReturnInfoModelClass.BaseBooleanReturnInfo(isClickEnabled());
            }
            if (!name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$EnableClickCommand")) {
                return !name.equals("com.tencent.map.lib.models.CommandFunctionModelClass$GetTypeCommand") ? new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.unsupported) : new ReturnInfoModelClass.BaseStringReturnInfo(getType());
            }
            CommonParamsModelClass.EnableClickParams enableClickParams = ((CommandFunctionModelClass.EnableClickCommand) baseCommandFunction).params;
            if (enableClickParams == null) {
                return new ReturnInfoModelClass.ErrorReturnInfo(ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg.jsonparse);
            }
            enableClick(enableClickParams.enabled);
            return new ReturnInfoModelClass.ReturnStatus();
        }
    }

    public String getType() {
        return C113646dz.Gradient.f340043h;
    }

    public boolean isClickEnabled() {
        return false;
    }

    public void setLevel(int i) {
        T t = this.f340956d;
        if (((C113991nk) t).f340980a != null) {
            ((C113991nk) t).f340980a.displayLevel(i);
        }
        ((C113991nk) this.f340956d).setLevel(i);
        mo172478a(this.f340956d);
    }

    public void setOpacity(float f) {
        T t = this.f340956d;
        if (((C113991nk) t).f340980a != null) {
            ((C113991nk) t).f340980a.opacity(f);
        }
        ((C113991nk) this.f340956d).setOpacity(f);
        mo172478a(this.f340956d);
    }

    public void setVisibility(boolean z) {
        T t = this.f340956d;
        if (((C113991nk) t).f340980a != null) {
            ((C113991nk) t).f340980a.visibility(z);
        }
        ((C113991nk) this.f340956d).setVisible(z);
        mo172478a(this.f340956d);
    }

    public void setZIndex(int i) {
        T t = this.f340956d;
        if (((C113991nk) t).f340980a != null) {
            ((C113991nk) t).f340980a.zIndex(i);
        }
        ((C113991nk) this.f340956d).setzIndex(i);
        mo172478a(this.f340956d);
    }
}
