package com.tencent.maas.composing;

import com.tencent.maas.base.Vec2;
import com.tencent.maas.model.composing.MJComposingDefines;

public class MJCoordinatingDesc {
    private final MJComposingDefines.MJCanvasOriginType canvasOriginType;
    private final Vec2 canvasSize;

    public MJCoordinatingDesc(Vec2 vec2, MJComposingDefines.MJCanvasOriginType mJCanvasOriginType) {
        this.canvasSize = vec2;
        this.canvasOriginType = mJCanvasOriginType;
    }

    public MJComposingDefines.MJCanvasOriginType getCanvasOriginType() {
        return this.canvasOriginType;
    }

    public Vec2 getCanvasSize() {
        return this.canvasSize;
    }
}
