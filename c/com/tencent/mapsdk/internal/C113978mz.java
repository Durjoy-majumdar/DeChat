package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.CommandFunctionModelClass;
import com.tencent.map.lib.models.CommonParamsModelClass;
import com.tencent.map.lib.models.ReturnInfoModelClass;
import com.tencent.map.sdk.utilities.visualization.p1182od.ArcLineOverlay;

/* renamed from: com.tencent.mapsdk.internal.mz */
public class C113978mz extends C113970ms<C113981nb> implements ArcLineOverlay {
    public C113978mz(C113980na naVar, C113981nb nbVar) {
        super(naVar, nbVar);
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
            ((C113981nb) this.f340956d).setZoomLevelRange(zoomLevelRangeParams.minLevel, zoomLevelRangeParams.maxLevel);
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
            return new ReturnInfoModelClass.BaseBooleanReturnInfo(((C113981nb) this.f340956d).isVisible());
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
        return C113646dz.ArcLine.f340043h;
    }

    public boolean isClickEnabled() {
        return false;
    }

    public void setLevel(int i) {
        T t = this.f340956d;
        if (((C113981nb) t).f340973a != null) {
            ((C113981nb) t).f340973a.displayLevel(i);
        }
        ((C113981nb) this.f340956d).setDisplayLevel(i);
        mo172478a(this.f340956d);
    }

    public void setOpacity(float f) {
        T t = this.f340956d;
        if (((C113981nb) t).f340973a != null) {
            ((C113981nb) t).f340973a.opacity(f);
        }
        ((C113981nb) this.f340956d).setOpacity(f);
        mo172478a(this.f340956d);
    }

    public void setVisibility(boolean z) {
        T t = this.f340956d;
        if (((C113981nb) t).f340973a != null) {
            ((C113981nb) t).f340973a.visibility(z);
        }
        ((C113981nb) this.f340956d).setVisibility(z);
        mo172478a(this.f340956d);
    }

    public void setZIndex(int i) {
        T t = this.f340956d;
        if (((C113981nb) t).f340973a != null) {
            ((C113981nb) t).f340973a.zIndex(i);
        }
        ((C113981nb) this.f340956d).setzIndex(i);
        mo172478a(this.f340956d);
    }
}
