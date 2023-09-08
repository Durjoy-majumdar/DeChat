package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.CommandFunctionModelClass;
import com.tencent.map.lib.models.CommonParamsModelClass;
import com.tencent.map.lib.models.ReturnInfoModelClass;
import com.tencent.map.sdk.utilities.visualization.trails.TrailOverlay;

/* renamed from: com.tencent.mapsdk.internal.nu */
public class C114001nu extends C113970ms<C114003nw> implements TrailOverlay {
    public C114001nu(C114002nv nvVar, C114003nw nwVar) {
        super(nvVar, nwVar);
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
            ((C114003nw) this.f340956d).setZoomLevelRange(zoomLevelRangeParams.minLevel, zoomLevelRangeParams.maxLevel);
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
            return new ReturnInfoModelClass.BaseBooleanReturnInfo(((C114003nw) this.f340956d).isVisible());
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
        return C113646dz.Trail.f340043h;
    }

    public boolean isClickEnabled() {
        return false;
    }

    public void setLevel(int i) {
        T t = this.f340956d;
        if (((C114003nw) t).f340982a != null) {
            ((C114003nw) t).f340982a.displayLevel(i);
        }
        ((C114003nw) this.f340956d).setDisplayLevel(i);
        mo172478a(this.f340956d);
    }

    public void setOpacity(float f) {
        T t = this.f340956d;
        if (((C114003nw) t).f340982a != null) {
            ((C114003nw) t).f340982a.opacity(f);
        }
        ((C114003nw) this.f340956d).setOpacity(f);
        mo172478a(this.f340956d);
    }

    public void setVisibility(boolean z) {
        T t = this.f340956d;
        if (((C114003nw) t).f340982a != null) {
            ((C114003nw) t).f340982a.visibility(z);
        }
        ((C114003nw) this.f340956d).setVisibility(z);
        mo172478a(this.f340956d);
    }

    public void setZIndex(int i) {
        T t = this.f340956d;
        if (((C114003nw) t).f340982a != null) {
            ((C114003nw) t).f340982a.zIndex(i);
        }
        ((C114003nw) this.f340956d).setzIndex(i);
        mo172478a(this.f340956d);
    }
}
