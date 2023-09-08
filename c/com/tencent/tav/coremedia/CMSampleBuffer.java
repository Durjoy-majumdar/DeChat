package com.tencent.tav.coremedia;

import java.nio.ByteBuffer;

public class CMSampleBuffer {
    private ByteBuffer sampleByteBuffer;
    private CMSampleState state;
    private TextureInfo texture;

    public CMSampleBuffer(CMSampleState cMSampleState) {
        this.state = cMSampleState;
        cMSampleState.setNewFrame(false);
        this.texture = null;
        this.sampleByteBuffer = null;
    }

    public ByteBuffer getSampleByteBuffer() {
        return this.sampleByteBuffer;
    }

    public CMSampleState getState() {
        return this.state;
    }

    public TextureInfo getTextureInfo() {
        return this.texture;
    }

    public CMTime getTime() {
        return this.state.getTime();
    }

    public boolean isNewFrame() {
        return this.state.isNewFrame();
    }

    public void setNewFrame(boolean z) {
        this.state.setNewFrame(z);
    }

    public void setSampleByteBuffer(ByteBuffer byteBuffer) {
        this.sampleByteBuffer = byteBuffer;
    }

    public String toString() {
        return "CMSampleBuffer{, state=" + this.state + ", texture=" + this.texture + ", sampleByteBuffer=" + this.sampleByteBuffer + '}';
    }

    public CMSampleBuffer(CMSampleState cMSampleState, TextureInfo textureInfo) {
        this.state = cMSampleState;
        this.texture = textureInfo;
        this.sampleByteBuffer = null;
    }

    public CMSampleBuffer(CMSampleState cMSampleState, TextureInfo textureInfo, boolean z) {
        this.state = cMSampleState;
        cMSampleState.setNewFrame(z);
        this.texture = textureInfo;
        this.sampleByteBuffer = null;
    }

    public CMSampleBuffer(CMSampleState cMSampleState, ByteBuffer byteBuffer) {
        this.state = cMSampleState;
        this.sampleByteBuffer = byteBuffer;
        this.texture = null;
    }

    public CMSampleBuffer(CMSampleState cMSampleState, ByteBuffer byteBuffer, boolean z) {
        this.state = cMSampleState;
        cMSampleState.setNewFrame(z);
        this.sampleByteBuffer = byteBuffer;
        this.texture = null;
    }

    public CMSampleBuffer(CMTime cMTime) {
        this(new CMSampleState(cMTime));
    }

    public CMSampleBuffer(CMTime cMTime, TextureInfo textureInfo) {
        this(new CMSampleState(cMTime), textureInfo);
    }

    public CMSampleBuffer(CMTime cMTime, TextureInfo textureInfo, boolean z) {
        this(new CMSampleState(cMTime), textureInfo, z);
    }

    public CMSampleBuffer(CMTime cMTime, ByteBuffer byteBuffer) {
        this(new CMSampleState(cMTime), byteBuffer);
    }

    public CMSampleBuffer(CMTime cMTime, ByteBuffer byteBuffer, boolean z) {
        this(new CMSampleState(cMTime), byteBuffer, z);
    }
}
