package com.tencent.tencentmap.mapsdk.map;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;

public class TencentMapOptions {
    public static final int GL_MAP_VIEW = 0;
    public static final int MAP_RENDER_LAYER = 2;
    public static final int TEXTURE_MAP_VIEW = 1;
    private boolean enableHandDrawMap = false;
    private boolean enableMSAA = false;
    private boolean isMutipleInfowindowEnabled = false;
    private Object mExtSurface;
    private int mExtSurfaceHeight;
    private int mExtSurfaceWidth;
    private int mMapType = 0;
    private Object mProtocolDataDesc;
    private int mProtocolFrom;
    private String mSubId;
    private String mSubKey;

    @Deprecated
    public TencentMapOptions enableHandDrawMap(boolean z) {
        setHandDrawMapEnable(z);
        return this;
    }

    public boolean enableMSAA() {
        return this.enableMSAA;
    }

    public Object getExtSurface() {
        return this.mExtSurface;
    }

    public final int getExtSurfaceHeight() {
        return this.mExtSurfaceHeight;
    }

    public final int getExtSurfaceWidth() {
        return this.mExtSurfaceWidth;
    }

    public int getMapType() {
        return this.mMapType;
    }

    public final Object getProtocolDataDesc() {
        return this.mProtocolDataDesc;
    }

    public final int getProtocolFrom() {
        return this.mProtocolFrom;
    }

    public final String getSubId() {
        return this.mSubId;
    }

    public final String getSubKey() {
        return this.mSubKey;
    }

    public boolean isHandDrawMapEnable() {
        return this.enableHandDrawMap;
    }

    public boolean isMutipleInfowindowEnabled() {
        return this.isMutipleInfowindowEnabled;
    }

    public void setEnableMSAA(boolean z) {
        this.enableMSAA = z;
    }

    public void setExtSurface(Object obj) {
        if ((obj instanceof Surface) || (obj instanceof SurfaceTexture) || (obj instanceof SurfaceHolder)) {
            this.mExtSurface = obj;
            return;
        }
        throw new IllegalArgumentException("Parameter Surface should be Surface,SurfaceTexture or SurfaceHolder");
    }

    public final void setExtSurfaceDimension(int i, int i2) {
        this.mExtSurfaceWidth = i;
        this.mExtSurfaceHeight = i2;
    }

    public void setHandDrawMapEnable(boolean z) {
        this.enableHandDrawMap = z;
    }

    public void setMapType(int i) {
        if (i >= 0 && i <= 2) {
            this.mMapType = i;
        }
    }

    public void setMutipleInfowindowEnabled(boolean z) {
        this.isMutipleInfowindowEnabled = z;
    }

    public final void setServiceProtocol(int i, Object obj) {
        this.mProtocolFrom = i;
        this.mProtocolDataDesc = obj;
    }

    public final void setSubInfo(String str, String str2) {
        this.mSubId = str2;
        this.mSubKey = str;
    }
}
