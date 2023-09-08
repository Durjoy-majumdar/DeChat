package com.tencent.tav.coremedia;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import java.util.ArrayList;
import java.util.Iterator;

public class TextureInfo {
    public static boolean enableDebugInfo;
    private static final ArrayList<TextureInfo> textureList = new ArrayList<>();
    private int format;
    private int frameBuffer;
    public final int height;
    private boolean mixAlpha;
    private boolean needRelease;
    public final int preferRotation;
    private boolean released;
    public final int textureID;
    private Matrix textureMatrix;
    private Rect textureRect;
    public final int textureType;
    public final int width;

    public TextureInfo(int i, int i2, int i3, int i4, int i5) {
        this.frameBuffer = -1;
        this.needRelease = false;
        this.textureRect = null;
        this.mixAlpha = true;
        this.format = NativeBitmapStruct.GLFormat.GL_RGB;
        this.textureMatrix = null;
        this.textureID = i;
        this.textureType = i2;
        this.width = i3;
        this.height = i4;
        this.preferRotation = i5;
        addTextureInfo(this);
    }

    private void addTextureInfo(TextureInfo textureInfo) {
        if (enableDebugInfo) {
            ArrayList<TextureInfo> arrayList = textureList;
            synchronized (arrayList) {
                if (!arrayList.contains(textureInfo)) {
                    arrayList.add(textureInfo);
                }
            }
        }
    }

    public static String printTextureInfo() {
        StringBuilder sb = new StringBuilder();
        Iterator<TextureInfo> it = textureList.iterator();
        float f = 0.0f;
        while (it.hasNext()) {
            TextureInfo next = it.next();
            sb.append("id:" + next.textureID);
            sb.append(",size:" + next.width + "x" + next.height);
            sb.append("\n");
            f += ((((float) (next.width * next.height)) * 3.0f) / 1024.0f) / 1024.0f;
        }
        return String.format("size:%d memory:%d info:%s", new Object[]{Integer.valueOf(textureList.size()), Integer.valueOf((int) f), sb.toString()});
    }

    public boolean equals(Object obj) {
        return obj instanceof TextureInfo ? ((TextureInfo) obj).textureID == this.textureID : super.equals(obj);
    }

    public int getFormat() {
        return this.format;
    }

    public int getFrameBuffer() {
        return this.frameBuffer;
    }

    public Matrix getTextureMatrix() {
        return this.textureMatrix;
    }

    public Rect getTextureRect() {
        return this.textureRect;
    }

    public boolean isMixAlpha() {
        return this.mixAlpha;
    }

    public boolean isNeedRelease() {
        return this.needRelease;
    }

    public boolean isReleased() {
        return this.released;
    }

    public void release() {
        this.released = true;
        int i = this.frameBuffer;
        if (i != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.frameBuffer = -1;
        }
        GLES20.glDeleteTextures(1, new int[]{this.textureID}, 0);
        if (enableDebugInfo) {
            ArrayList<TextureInfo> arrayList = textureList;
            synchronized (arrayList) {
                arrayList.remove(this);
            }
        }
    }

    public void setFormat(int i) {
        this.format = i;
    }

    public void setFrameBuffer(int i) {
        this.frameBuffer = i;
    }

    public void setMixAlpha(boolean z) {
        this.mixAlpha = z;
    }

    public void setTextureMatrix(Matrix matrix) {
        this.textureMatrix = matrix;
    }

    public void setTextureRect(Rect rect) {
        this.textureRect = rect;
    }

    public String toString() {
        return "TextureInfo{textureID=" + this.textureID + ", textureType=" + this.textureType + ", width=" + this.width + ", height=" + this.height + ", preferRotation=" + this.preferRotation + ", textureMatrix=" + this.textureMatrix + ", frameBuffer=" + this.frameBuffer + ", needRelease=" + this.needRelease + ", mixAlpha=" + this.mixAlpha + ", format=" + this.format + '}';
    }

    public TextureInfo clone() {
        TextureInfo textureInfo = new TextureInfo(this.textureID, this.textureType, this.width, this.height, this.textureMatrix, this.preferRotation);
        textureInfo.needRelease = true;
        textureInfo.textureRect = this.textureRect;
        return textureInfo;
    }

    public TextureInfo(int i, int i2, int i3, int i4, Matrix matrix, int i5) {
        this.frameBuffer = -1;
        this.needRelease = false;
        this.textureRect = null;
        this.mixAlpha = true;
        this.format = NativeBitmapStruct.GLFormat.GL_RGB;
        this.textureMatrix = matrix;
        this.textureID = i;
        this.textureType = i2;
        this.width = i3;
        this.height = i4;
        this.preferRotation = i5;
        addTextureInfo(this);
    }
}
