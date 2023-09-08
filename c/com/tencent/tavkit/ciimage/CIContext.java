package com.tencent.tavkit.ciimage;

import android.graphics.Matrix;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.tav.coremedia.CGSize;
import com.tencent.tav.coremedia.CMSampleBuffer;
import com.tencent.tav.coremedia.CMTime;
import com.tencent.tav.coremedia.TextureInfo;
import com.tencent.tav.decoder.RenderContext;
import com.tencent.tav.decoder.logger.Logger;

public class CIContext {
    private final String TAG = ("CIContext@" + Integer.toHexString(hashCode()));
    private CIImageFilter copyFilter;
    private CIImageFilter filter;
    private final RenderContext renderContext;
    private TextureInfo textureInfo;

    public CIContext(RenderContext renderContext2) {
        this.renderContext = renderContext2;
    }

    public static TextureInfo newTextureInfo(CGSize cGSize) {
        return newTextureInfo(cGSize.width, cGSize.height);
    }

    private void setDestImage(TextureInfo textureInfo2) {
        if (this.filter == null) {
            this.filter = new CIImageFilter();
        }
        this.filter.setOutputTextureInfo(textureInfo2);
    }

    public void clear(int i) {
        this.filter.clearBufferBuffer(i);
    }

    public TextureInfo convertImageToTexture(CIImage cIImage, TextureInfo textureInfo2) {
        if (textureInfo2 == null) {
            return null;
        }
        if (this.copyFilter == null) {
            this.copyFilter = new CIImageFilter();
        }
        this.copyFilter.setOutputTextureInfo(textureInfo2);
        this.copyFilter.clearBufferBuffer(-16777216);
        cIImage.draw(this.copyFilter);
        return textureInfo2;
    }

    public RenderContext getRenderContext() {
        return this.renderContext;
    }

    public void release() {
        String str = this.TAG;
        Logger.m144641d(str, "release: begin, currentThread = " + Thread.currentThread().getName());
        CIImageFilter cIImageFilter = this.filter;
        if (cIImageFilter != null) {
            cIImageFilter.release();
        }
        TextureInfo textureInfo2 = this.textureInfo;
        if (textureInfo2 != null) {
            textureInfo2.release();
        }
        CIImageFilter cIImageFilter2 = this.copyFilter;
        if (cIImageFilter2 != null) {
            cIImageFilter2.release();
        }
        String str2 = this.TAG;
        Logger.m144641d(str2, "release: end, currentThread = " + Thread.currentThread().getName());
    }

    public CMSampleBuffer renderToSampleBuffer(CIImage cIImage, CMTime cMTime, RenderContext renderContext2) {
        renderContext2.makeCurrent();
        TextureInfo textureInfo2 = this.textureInfo;
        if (!(textureInfo2 == null || (textureInfo2.width == renderContext2.width() && this.textureInfo.height == renderContext2.height()))) {
            this.textureInfo.release();
            this.textureInfo = null;
        }
        if (this.textureInfo == null) {
            this.textureInfo = newTextureInfo(renderContext2.width(), renderContext2.height());
        }
        setDestImage(this.textureInfo);
        clear(-16777216);
        cIImage.draw(this.filter);
        return new CMSampleBuffer(cMTime, this.textureInfo, false);
    }

    public static TextureInfo newTextureInfo(float f, float f2) {
        return newTextureInfo((int) f, (int) f2);
    }

    public static TextureInfo newTextureInfo(int i, int i2) {
        TextureInfo textureInfo2 = new TextureInfo(RenderContext.createTexture(3553), 3553, i, i2, (Matrix) null, 0);
        textureInfo2.setFormat(NativeBitmapStruct.GLFormat.GL_RGBA);
        return textureInfo2;
    }
}
