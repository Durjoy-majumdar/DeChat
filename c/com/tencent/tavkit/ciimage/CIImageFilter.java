package com.tencent.tavkit.ciimage;

import android.graphics.Matrix;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.TextureInfo;

class CIImageFilter extends TextureFilter {
    private final String TAG = ("CIImageFilter@" + Integer.toHexString(hashCode()));
    private int clearColor;
    private TextureInfo destTextureInfo;
    private TextureFilter oesFilter;
    private TextureFilter rgbFilter;

    public CIImageFilter() {
        if (this.rgbFilter == null) {
            this.rgbFilter = new TextureFilter();
        }
        if (this.oesFilter == null) {
            this.oesFilter = new TextureFilter();
        }
    }

    private TextureInfo tryApplyOESFilter(TextureInfo textureInfo, Matrix matrix, Matrix matrix2, float f, CGRect cGRect) {
        return this.oesFilter.applyFilter(textureInfo, matrix, matrix2, f, cGRect);
    }

    private TextureInfo tryApplyRGBFilter(TextureInfo textureInfo, Matrix matrix, Matrix matrix2, float f, CGRect cGRect) {
        return this.rgbFilter.applyFilter(textureInfo, matrix, matrix2, f, cGRect);
    }

    public TextureInfo applyFilter(TextureInfo textureInfo, Matrix matrix, Matrix matrix2, float f, CGRect cGRect) {
        if (textureInfo != null) {
            return textureInfo.textureType == 36197 ? tryApplyOESFilter(textureInfo, matrix, matrix2, f, cGRect) : tryApplyRGBFilter(textureInfo, matrix, matrix2, f, cGRect);
        }
        return null;
    }

    public void clearBufferBuffer(int i) {
        this.clearColor = i;
        TextureFilter textureFilter = this.oesFilter;
        if (textureFilter != null) {
            textureFilter.clearBufferBuffer(i);
        }
        TextureFilter textureFilter2 = this.rgbFilter;
        if (textureFilter2 != null) {
            textureFilter2.clearBufferBuffer(i);
        }
    }

    public void release() {
        TextureFilter textureFilter = this.oesFilter;
        if (textureFilter != null) {
            textureFilter.release();
        }
        TextureFilter textureFilter2 = this.rgbFilter;
        if (textureFilter2 != null) {
            textureFilter2.release();
        }
    }

    public void setOutputTextureInfo(TextureInfo textureInfo) {
        this.destTextureInfo = textureInfo;
        TextureFilter textureFilter = this.oesFilter;
        if (textureFilter != null) {
            textureFilter.setOutputTextureInfo(textureInfo);
        }
        TextureFilter textureFilter2 = this.rgbFilter;
        if (textureFilter2 != null) {
            textureFilter2.setOutputTextureInfo(textureInfo);
        }
    }

    public String toString() {
        return "CIImageFilter{program=" + this.program + ", clearColor=" + this.clearColor + ", destTextureInfo=" + this.destTextureInfo + '}';
    }
}
