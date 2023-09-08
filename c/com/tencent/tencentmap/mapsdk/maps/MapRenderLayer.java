package com.tencent.tencentmap.mapsdk.maps;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.tencentmap.mapsdk.maps.model.MapViewType;

public class MapRenderLayer extends MapView {
    public MapRenderLayer(Context context, TencentMapOptions tencentMapOptions) {
        super(context, tencentMapOptions);
        onResume();
    }

    public final MapViewType getViewType() {
        return MapViewType.RenderLayer;
    }

    public final void onSurfaceChanged(Object obj, int i, int i2) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture) || (obj instanceof SurfaceHolder)) {
            super.onSurfaceChanged(obj, i, i2);
        }
    }
}
