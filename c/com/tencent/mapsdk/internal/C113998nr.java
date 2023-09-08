package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.CommandFunctionModelClass;
import com.tencent.map.lib.models.CommonParamsModelClass;
import com.tencent.map.lib.models.ReturnInfoModelClass;
import com.tencent.map.sdk.utilities.visualization.scatterplot.BitmapScatterPlotOverlay;
import com.tencent.map.sdk.utilities.visualization.scatterplot.DotScatterPlotOverlay;
import com.tencent.map.sdk.utilities.visualization.scatterplot.ScatterPlotOverlay;

/* renamed from: com.tencent.mapsdk.internal.nr */
public class C113998nr extends C113970ms<C114000nt> implements BitmapScatterPlotOverlay, DotScatterPlotOverlay, ScatterPlotOverlay {
    public C113998nr(C113971mt mtVar, C114000nt ntVar) {
        super(mtVar, ntVar);
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
            ((C114000nt) this.f340956d).setZoomLevelRange(zoomLevelRangeParams.minLevel, zoomLevelRangeParams.maxLevel);
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
            return new ReturnInfoModelClass.BaseBooleanReturnInfo(((C114000nt) this.f340956d).isVisible());
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
        return C113646dz.Scatter.f340043h;
    }

    public boolean isClickEnabled() {
        return false;
    }

    public void setActiveDataIndex(int i) {
        ((C114000nt) this.f340956d).setActiveIndex(i);
        mo172478a(this.f340956d);
    }

    public void setLevel(int i) {
        T t = this.f340956d;
        if (((C114000nt) t).f340981a != null) {
            ((C114000nt) t).f340981a.displayLevel(i);
        }
        ((C114000nt) this.f340956d).setLevel(i);
        mo172478a(this.f340956d);
    }

    public void setOpacity(float f) {
        T t = this.f340956d;
        if (((C114000nt) t).f340981a != null) {
            ((C114000nt) t).f340981a.opacity(f);
        }
        ((C114000nt) this.f340956d).setOpacity(f);
        mo172478a(this.f340956d);
    }

    public void setVisibility(boolean z) {
        T t = this.f340956d;
        if (((C114000nt) t).f340981a != null) {
            ((C114000nt) t).f340981a.visibility(z);
        }
        ((C114000nt) this.f340956d).setVisible(z);
        mo172478a(this.f340956d);
    }

    public void setZIndex(int i) {
        T t = this.f340956d;
        if (((C114000nt) t).f340981a != null) {
            ((C114000nt) t).f340981a.zIndex(i);
        }
        ((C114000nt) this.f340956d).setzIndex(i);
        mo172478a(this.f340956d);
    }
}
