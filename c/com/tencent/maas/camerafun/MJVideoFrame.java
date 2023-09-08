package com.tencent.maas.camerafun;

import com.tencent.maas.camstudio.frame.BufferVideoFrame;
import com.tencent.maas.camstudio.frame.Plane;
import java.nio.ByteBuffer;

public class MJVideoFrame implements BufferVideoFrame {
    private final int frameCWAngle;
    private final int height;
    private final boolean isMirrored;
    private final MyPlane[] planes;
    private final long timestamp;
    private final int width;

    public static class MyPlane implements Plane {
        private final ByteBuffer buffer;
        private final int pixelStride;
        private final int rowStride;

        public MyPlane(int i, int i2, ByteBuffer byteBuffer) {
            this.rowStride = i;
            this.pixelStride = i2;
            this.buffer = byteBuffer;
        }

        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        public int getPixelStride() {
            return this.pixelStride;
        }

        public int getRowStride() {
            return this.rowStride;
        }
    }

    public MJVideoFrame(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, int i5, long j) {
        this(i, i2, i3, i4, byteBuffer, i5, j, false);
    }

    public int accessibility() {
        return 0;
    }

    public ByteBuffer getBuffer() {
        return this.planes[0].getBuffer();
    }

    public int getFormat() {
        return 0;
    }

    public int getFrameCWAngle() {
        return this.frameCWAngle;
    }

    public int getHeight() {
        return this.height;
    }

    public boolean getIsMirrored() {
        return this.isMirrored;
    }

    public int getPixelStride() {
        return this.planes[0].getPixelStride();
    }

    public Plane[] getPlanes() {
        return this.planes;
    }

    public int getRowStride() {
        return this.planes[0].getRowStride();
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isMirrored() {
        return this.isMirrored;
    }

    public void release() {
    }

    public MJVideoFrame(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, int i5, long j, boolean z) {
        this.width = i;
        this.height = i2;
        this.frameCWAngle = i5;
        this.timestamp = j;
        this.isMirrored = z;
        MyPlane[] myPlaneArr = new MyPlane[1];
        this.planes = myPlaneArr;
        myPlaneArr[0] = new MyPlane(i3, i4, byteBuffer);
    }
}
