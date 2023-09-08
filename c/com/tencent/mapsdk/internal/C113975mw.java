package com.tencent.mapsdk.internal;

import com.tencent.map.lib.models.CommandFunctionModelClass;
import com.tencent.map.lib.models.CommonParamsModelClass;
import com.tencent.map.lib.models.ReturnInfoModelClass;
import com.tencent.map.sdk.utilities.visualization.aggregation.AggregationOverlay;
import com.tencent.tencentmap.mapsdk.maps.model.LatLng;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit;
import com.tencent.tencentmap.mapsdk.maps.model.VectorHeatOverlay;

/* renamed from: com.tencent.mapsdk.internal.mw */
public class C113975mw extends C113970ms<C113976mx> implements AggregationOverlay, VectorHeatOverlay {
    public C113975mw(C113977my myVar, C113976mx mxVar) {
        super(myVar, mxVar);
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
            ((C113976mx) this.f340956d).setZoomLevelRange(zoomLevelRangeParams.minLevel, zoomLevelRangeParams.maxLevel);
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
            return new ReturnInfoModelClass.BaseBooleanReturnInfo(((C113976mx) this.f340956d).isVisible());
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
        return C113646dz.Aggregation.f340043h;
    }

    public VectorHeatAggregationUnit getUnit(LatLng latLng) {
        C113971mt<T> mtVar = this.f340955c;
        if (mtVar == null) {
            return null;
        }
        long j = this.f340954b;
        if (j == 0) {
            return null;
        }
        return ((C113977my) mtVar).mo172508a(j, latLng);
    }

    public boolean isClickEnabled() {
        return false;
    }

    public void setLevel(int i) {
        T t = this.f340956d;
        if (((C113976mx) t).f340969a != null) {
            ((C113976mx) t).f340969a.displayLevel(i);
        }
        ((C113976mx) this.f340956d).setDisplayLevel(i);
        mo172478a(this.f340956d);
    }

    public void setOpacity(float f) {
        T t = this.f340956d;
        if (((C113976mx) t).f340969a != null) {
            ((C113976mx) t).f340969a.opacity(f);
        }
        ((C113976mx) this.f340956d).setOpacity(f);
        mo172478a(this.f340956d);
    }

    public void setVisibility(boolean z) {
        T t = this.f340956d;
        if (((C113976mx) t).f340969a != null) {
            ((C113976mx) t).f340969a.visibility(z);
        }
        ((C113976mx) this.f340956d).setVisibility(z);
        mo172478a(this.f340956d);
    }

    public void setZIndex(int i) {
        T t = this.f340956d;
        if (((C113976mx) t).f340969a != null) {
            ((C113976mx) t).f340969a.zIndex(i);
        }
        ((C113976mx) this.f340956d).setZIndex(i);
        mo172478a(this.f340956d);
    }
}
