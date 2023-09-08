package com.tencent.liteav.videobase.frame;

import android.graphics.Bitmap;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.utils.Rotation;
import com.tencent.wxmm.v2helper;
import java.nio.ByteBuffer;
import java.util.Collection;

@JNINamespace("liteav::video")
public class PixelFrame extends C17236k {
    public ByteBuffer mBuffer;
    public byte[] mData;
    public Object mGLContext;
    public int mHeight;
    private boolean mIsMirrorHorizontal;
    private boolean mIsMirrorVertical;
    private float[] mMatrix;
    public GLConstants.PixelBufferType mPixelBufferType;
    public GLConstants.PixelFormatType mPixelFormatType;
    private Rotation mRotation;
    public int mTextureId;
    private long mTimestamp;
    public int mWidth;

    public PixelFrame() {
        super((C17228g) null);
        this.mTimestamp = 0;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = Rotation.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
    }

    public static PixelFrame createFromBitmap(Bitmap bitmap) {
        int width = (bitmap.getWidth() / 2) * 2;
        int height = (bitmap.getHeight() / 2) * 2;
        if (!(width == 0 || height == 0 || (bitmap.getWidth() % 2 == 0 && bitmap.getHeight() % 2 == 0))) {
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getWidth() * 4 * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(allocateDirect);
        allocateDirect.position(0);
        PixelFrame pixelFrame = new PixelFrame();
        pixelFrame.setBuffer(allocateDirect);
        pixelFrame.setWidth(bitmap.getWidth());
        pixelFrame.setHeight(bitmap.getHeight());
        pixelFrame.setPixelBufferType(GLConstants.PixelBufferType.BYTE_BUFFER);
        pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.RGBA);
        return pixelFrame;
    }

    private int getPixelBufferTypeValue() {
        return this.mPixelBufferType.mValue;
    }

    private int getPixelFormatTypeValue() {
        return this.mPixelFormatType.getValue();
    }

    public static void releasePixelFrames(Collection<PixelFrame> collection) {
        if (collection != null) {
            for (PixelFrame next : collection) {
                if (next != null) {
                    next.release();
                }
            }
            collection.clear();
        }
    }

    public void copy(PixelFrame pixelFrame) {
        this.mTimestamp = pixelFrame.mTimestamp;
        this.mWidth = pixelFrame.mWidth;
        this.mHeight = pixelFrame.mHeight;
        this.mPixelBufferType = pixelFrame.mPixelBufferType;
        this.mPixelFormatType = pixelFrame.mPixelFormatType;
        this.mRotation = pixelFrame.mRotation;
        this.mIsMirrorHorizontal = pixelFrame.mIsMirrorHorizontal;
        this.mIsMirrorVertical = pixelFrame.mIsMirrorVertical;
        if (pixelFrame.mMatrix != null) {
            this.mMatrix = new float[16];
            float[] matrix = pixelFrame.getMatrix();
            float[] fArr = this.mMatrix;
            System.arraycopy(matrix, 0, fArr, 0, fArr.length);
        }
        this.mMatrix = pixelFrame.mMatrix;
        this.mData = pixelFrame.mData;
        this.mBuffer = pixelFrame.mBuffer;
        this.mTextureId = pixelFrame.mTextureId;
        this.mGLContext = pixelFrame.mGLContext;
    }

    public ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    public byte[] getData() {
        return this.mData;
    }

    public Object getGLContext() {
        return this.mGLContext;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public float[] getMatrix() {
        return this.mMatrix;
    }

    public GLConstants.PixelBufferType getPixelBufferType() {
        return this.mPixelBufferType;
    }

    public GLConstants.PixelFormatType getPixelFormatType() {
        return this.mPixelFormatType;
    }

    public Rotation getRotation() {
        return this.mRotation;
    }

    public int getTextureId() {
        return this.mTextureId;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean hasTransformParams() {
        return this.mRotation != Rotation.NORMAL || this.mIsMirrorHorizontal || this.mIsMirrorVertical || this.mMatrix != null;
    }

    public boolean isFrameDataValid() {
        GLConstants.PixelBufferType pixelBufferType = this.mPixelBufferType;
        if (pixelBufferType == GLConstants.PixelBufferType.TEXTURE_2D && this.mTextureId == -1) {
            return false;
        }
        if (pixelBufferType == GLConstants.PixelBufferType.BYTE_BUFFER && this.mBuffer == null) {
            return false;
        }
        return (pixelBufferType == GLConstants.PixelBufferType.BYTE_ARRAY && this.mData == null) ? false : true;
    }

    public boolean isMirrorHorizontal() {
        return this.mIsMirrorHorizontal;
    }

    public boolean isMirrorVertical() {
        return this.mIsMirrorVertical;
    }

    public void postRotate(Rotation rotation) {
        if (rotation == Rotation.ROTATION_90 || rotation == Rotation.ROTATION_270) {
            swapWidthHeight();
        }
        setRotation(Rotation.m139836a((this.mRotation.mValue + rotation.mValue) % v2helper.VOIP_ENC_HEIGHT_LV1));
    }

    public void setBuffer(ByteBuffer byteBuffer) {
        this.mBuffer = byteBuffer;
    }

    public void setData(byte[] bArr) {
        this.mData = bArr;
    }

    public void setGLContext(Object obj) {
        this.mGLContext = obj;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setMatrix(float[] fArr) {
        this.mMatrix = fArr;
    }

    public void setMirrorHorizontal(boolean z) {
        this.mIsMirrorHorizontal = z;
    }

    public void setMirrorVertical(boolean z) {
        this.mIsMirrorVertical = z;
    }

    public void setPixelBufferType(GLConstants.PixelBufferType pixelBufferType) {
        this.mPixelBufferType = pixelBufferType;
    }

    public void setPixelFormatType(GLConstants.PixelFormatType pixelFormatType) {
        this.mPixelFormatType = pixelFormatType;
    }

    public void setRotation(Rotation rotation) {
        this.mRotation = rotation;
    }

    public void setTextureId(int i) {
        this.mTextureId = i;
    }

    public void setTimestamp(long j) {
        this.mTimestamp = j;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }

    public void swapWidthHeight() {
        int i = this.mWidth;
        this.mWidth = this.mHeight;
        this.mHeight = i;
    }

    public PixelFrame(PixelFrame pixelFrame) {
        super((C17228g) null);
        this.mTimestamp = 0;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = Rotation.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        copy(pixelFrame);
    }

    public PixelFrame(int i, int i2, int i3, int i4) {
        this((C17228g<PixelFrame>) null, i, i2, GLConstants.PixelBufferType.m17043a(i3), GLConstants.PixelFormatType.m17044a(i4));
    }

    public PixelFrame(C17228g<PixelFrame> gVar, int i, int i2, GLConstants.PixelBufferType pixelBufferType, GLConstants.PixelFormatType pixelFormatType) {
        super(gVar);
        this.mTimestamp = 0;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = Rotation.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
        this.mWidth = i;
        this.mHeight = i2;
        this.mPixelFormatType = pixelFormatType;
        this.mPixelBufferType = pixelBufferType;
        int i3 = i * i2;
        int i4 = pixelFormatType == GLConstants.PixelFormatType.RGBA ? i3 * 4 : (i3 * 3) / 2;
        if (pixelBufferType == GLConstants.PixelBufferType.BYTE_ARRAY) {
            this.mData = new byte[i4];
        } else {
            this.mBuffer = ByteBuffer.allocateDirect(i4);
        }
    }

    public PixelFrame(C17228g<? extends PixelFrame> gVar) {
        super(gVar);
        this.mTimestamp = 0;
        this.mWidth = -1;
        this.mHeight = -1;
        this.mRotation = Rotation.NORMAL;
        this.mIsMirrorHorizontal = false;
        this.mIsMirrorVertical = false;
        this.mMatrix = null;
        this.mData = null;
        this.mBuffer = null;
        this.mTextureId = -1;
        this.mGLContext = null;
    }
}
