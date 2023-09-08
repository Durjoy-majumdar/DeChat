package p172io.flutter.plugin.platform;

import android.view.MotionEvent;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.Metadata;
import p172io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import p172io.flutter.plugin.common.StandardMessageCodec;
import p172io.flutter.view.TextureRegistry;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH\u0016J \u0010\u0011\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0012\u0010\u0014\u001a\u00020\u00042\b\b\u0001\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¨\u0006\u001b"}, mo182094d2 = {"io/flutter/plugin/platform/SkylinePlatformViewsController$skylineChannelHandler$1", "Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewsHandler;", "Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewCreationRequest;", "request", "Lrx3/b0;", "createForPlatformViewLayer", "", "createForTextureLayer", "", "viewId", "dispose", "Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewResizeRequest;", "Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewBufferSize;", "resize", "", "top", "left", "offset", "Lio/flutter/embedding/engine/systemchannels/PlatformViewsChannel$PlatformViewTouch;", "touch", "onTouch", "direction", "setDirection", "clearFocus", "", "yes", "synchronizeToNativeViewHierarchy", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0})
/* renamed from: io.flutter.plugin.platform.SkylinePlatformViewsController$skylineChannelHandler$1 */
public final class SkylinePlatformViewsController$skylineChannelHandler$1 implements PlatformViewsChannel.PlatformViewsHandler {
    public final /* synthetic */ SkylinePlatformViewsController this$0;

    public SkylinePlatformViewsController$skylineChannelHandler$1(SkylinePlatformViewsController skylinePlatformViewsController) {
        this.this$0 = skylinePlatformViewsController;
    }

    public void clearFocus(int i) {
        if (!SkylineTextureLogic.INSTANCE.isSkylineTexture(this.this$0.getEngineId(), i)) {
            this.this$0.channelHandler.clearFocus(i);
        }
    }

    public void createForPlatformViewLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        C87412m.m108594g(platformViewCreationRequest, "request");
        this.this$0.channelHandler.createForPlatformViewLayer(platformViewCreationRequest);
    }

    public long createForTextureLayer(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        C87412m.m108594g(platformViewCreationRequest, "request");
        String str = platformViewCreationRequest.viewType;
        C87412m.m108593f(str, "request.viewType");
        SkylineTextureLogic skylineTextureLogic = SkylineTextureLogic.INSTANCE;
        if (!skylineTextureLogic.isSkylineTextureType(str)) {
            return this.this$0.channelHandler.createForTextureLayer(platformViewCreationRequest);
        }
        int i = platformViewCreationRequest.viewId;
        int physicalPixels = this.this$0.toPhysicalPixels(platformViewCreationRequest.logicalWidth);
        int physicalPixels2 = this.this$0.toPhysicalPixels(platformViewCreationRequest.logicalHeight);
        TextureRegistry textureRegistry = this.this$0.textureRegistry;
        Object obj = null;
        TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry == null ? null : textureRegistry.createSurfaceTexture();
        if (createSurfaceTexture == null) {
            return -1;
        }
        this.this$0.textureEntryList.put(i, createSurfaceTexture);
        ByteBuffer byteBuffer = platformViewCreationRequest.params;
        Map map = (Map) (byteBuffer != null ? StandardMessageCodec.INSTANCE.decodeMessage(byteBuffer) : null);
        if (map != null) {
            obj = map.get("type");
        }
        String str2 = (String) obj;
        String str3 = str2 == null ? "empty" : str2;
        skylineTextureLogic.addSkylineTexture(this.this$0.getEngineId(), i, str3);
        skylineTextureLogic.onTextureReady(this.this$0.getEngineId(), str3, i, createSurfaceTexture.surfaceTexture(), physicalPixels, physicalPixels2);
        return createSurfaceTexture.mo159349id();
    }

    public void dispose(int i) {
        C87412m.m108600m("dispose ", Integer.valueOf(i));
        SkylineTextureLogic skylineTextureLogic = SkylineTextureLogic.INSTANCE;
        if (!skylineTextureLogic.isSkylineTexture(this.this$0.getEngineId(), i)) {
            this.this$0.channelHandler.dispose(i);
            return;
        }
        String skylineTextureType = skylineTextureLogic.getSkylineTextureType(this.this$0.getEngineId(), i);
        skylineTextureLogic.removeSkylineTexture(this.this$0.getEngineId(), i);
        skylineTextureLogic.onTextureDestroy(this.this$0.getEngineId(), skylineTextureType, i);
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = (TextureRegistry.SurfaceTextureEntry) this.this$0.textureEntryList.get(i);
        if (surfaceTextureEntry != null) {
            surfaceTextureEntry.release();
        }
        this.this$0.textureEntryList.remove(i);
    }

    public void offset(int i, double d, double d2) {
        this.this$0.channelHandler.offset(i, d, d2);
    }

    public void onTouch(PlatformViewsChannel.PlatformViewTouch platformViewTouch) {
        C87412m.m108594g(platformViewTouch, "touch");
        int i = platformViewTouch.viewId;
        SkylineTextureLogic skylineTextureLogic = SkylineTextureLogic.INSTANCE;
        if (!skylineTextureLogic.isSkylineTexture(this.this$0.getEngineId(), i)) {
            this.this$0.channelHandler.onTouch(platformViewTouch);
            return;
        }
        MotionEvent motionEvent = this.this$0.toMotionEvent(this.this$0.context.getResources().getDisplayMetrics().density, platformViewTouch);
        String skylineTextureType = skylineTextureLogic.getSkylineTextureType(this.this$0.getEngineId(), i);
        int engineId = this.this$0.getEngineId();
        C87412m.m108593f(motionEvent, "event");
        skylineTextureLogic.onTextureTouch(engineId, skylineTextureType, i, motionEvent);
    }

    public PlatformViewsChannel.PlatformViewBufferSize resize(PlatformViewsChannel.PlatformViewResizeRequest platformViewResizeRequest) {
        C87412m.m108594g(platformViewResizeRequest, "request");
        int i = platformViewResizeRequest.viewId;
        SkylineTextureLogic skylineTextureLogic = SkylineTextureLogic.INSTANCE;
        if (!skylineTextureLogic.isSkylineTexture(this.this$0.getEngineId(), i)) {
            return this.this$0.channelHandler.resize(platformViewResizeRequest);
        }
        skylineTextureLogic.onTextureUpdate(this.this$0.getEngineId(), skylineTextureLogic.getSkylineTextureType(this.this$0.getEngineId(), i), i, this.this$0.toPhysicalPixels(platformViewResizeRequest.newLogicalWidth), this.this$0.toPhysicalPixels(platformViewResizeRequest.newLogicalHeight));
        return new PlatformViewsChannel.PlatformViewBufferSize((int) platformViewResizeRequest.newLogicalWidth, (int) platformViewResizeRequest.newLogicalHeight);
    }

    public void setDirection(int i, int i2) {
        if (!SkylineTextureLogic.INSTANCE.isSkylineTexture(this.this$0.getEngineId(), i)) {
            this.this$0.channelHandler.setDirection(i, i2);
        }
    }

    public void synchronizeToNativeViewHierarchy(boolean z) {
        this.this$0.channelHandler.synchronizeToNativeViewHierarchy(z);
    }
}
