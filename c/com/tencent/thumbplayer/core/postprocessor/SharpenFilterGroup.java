package com.tencent.thumbplayer.core.postprocessor;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;

public class SharpenFilterGroup {
    public boolean ifsharpen = true;
    private BlurFilter mBlurFilter;
    private OES2TextureFilter mOES2TextureFilter;
    private Texture2OESFIlter mTexture2OESFilter;
    private USM3FusionFilter mUSM3FusionFilter;

    public SharpenFilterGroup(String str) {
        this.mOES2TextureFilter = new OES2TextureFilter(str);
        this.mUSM3FusionFilter = new USM3FusionFilter(str);
        this.mBlurFilter = new BlurFilter(str);
        this.mTexture2OESFilter = new Texture2OESFIlter(str);
    }

    public void checkGlError(String str) {
        if (GLES20.glGetError() != 0) {
            throw new RuntimeException(str);
        }
    }

    public void destroyBuffers() {
        this.mOES2TextureFilter.destroyBuffers();
        this.mUSM3FusionFilter.destroyBuffers();
        this.mBlurFilter.destroyBuffers();
        this.mTexture2OESFilter.destroyBuffers();
    }

    public void genOESTexture() {
        OES2TextureFilter oES2TextureFilter = this.mOES2TextureFilter;
        if (oES2TextureFilter != null) {
            oES2TextureFilter.genOESTexture();
            return;
        }
        throw new RuntimeException("sifeng: OES2TextureFilter(null) generate texture failed");
    }

    public int getOESTextureid() {
        return this.mOES2TextureFilter.getOESTextureid();
    }

    public void process(SurfaceTexture surfaceTexture, int i, int i2, int i3, int i4, boolean z, int i5) {
        SurfaceTexture surfaceTexture2 = surfaceTexture;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int i9 = i4;
        boolean z2 = z;
        if (z2) {
            int process = this.mOES2TextureFilter.process(surfaceTexture, i, i7, z2);
            this.mBlurFilter.process(process, i, i7);
            this.mTexture2OESFilter.process(this.mUSM3FusionFilter.process(process, this.mBlurFilter.getTexid(0), this.mBlurFilter.getTexid(1), this.mBlurFilter.getTexid(2), i, i2, z, i5), i8, i9, z2);
        } else {
            this.mTexture2OESFilter.process(this.mOES2TextureFilter.process(surfaceTexture, i, i7, z2), i8, i9, z2);
        }
        GLES20.glFlush();
    }
}
