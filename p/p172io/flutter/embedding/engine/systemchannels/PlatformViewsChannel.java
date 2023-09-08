package p172io.flutter.embedding.engine.systemchannels;

import com.tencent.map.geolocation.sapp.TencentLocation;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.plugin.common.StandardMethodCodec;

/* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel */
public class PlatformViewsChannel {
    private static final String TAG = "PlatformViewsChannel";
    private final MethodChannel channel;
    /* access modifiers changed from: private */
    public PlatformViewsHandler handler;
    private final MethodChannel.MethodCallHandler parsingHandler;

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewBufferSize */
    public static class PlatformViewBufferSize {
        public final int height;
        public final int width;

        public PlatformViewBufferSize(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewCreationRequest */
    public static class PlatformViewCreationRequest {
        public final int direction;
        public final double logicalHeight;
        public final double logicalLeft;
        public final double logicalTop;
        public final double logicalWidth;
        public final ByteBuffer params;
        public final int viewId;
        public final String viewType;

        public PlatformViewCreationRequest(int i, String str, double d, double d2, double d3, double d4, int i2, ByteBuffer byteBuffer) {
            this.viewId = i;
            this.viewType = str;
            this.logicalTop = d;
            this.logicalLeft = d2;
            this.logicalWidth = d3;
            this.logicalHeight = d4;
            this.direction = i2;
            this.params = byteBuffer;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewResizeRequest */
    public static class PlatformViewResizeRequest {
        public final double newLogicalHeight;
        public final double newLogicalWidth;
        public final int viewId;

        public PlatformViewResizeRequest(int i, double d, double d2) {
            this.viewId = i;
            this.newLogicalWidth = d;
            this.newLogicalHeight = d2;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewTouch */
    public static class PlatformViewTouch {
        public final int action;
        public final int buttonState;
        public final int deviceId;
        public final Number downTime;
        public final int edgeFlags;
        public final Number eventTime;
        public final int flags;
        public final int metaState;
        public final long motionEventId;
        public final int pointerCount;
        public final Object rawPointerCoords;
        public final Object rawPointerPropertiesList;
        public final int source;
        public final int viewId;
        public final float xPrecision;
        public final float yPrecision;

        public PlatformViewTouch(int i, Number number, Number number2, int i2, int i3, Object obj, Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
            this.viewId = i;
            this.downTime = number;
            this.eventTime = number2;
            this.action = i2;
            this.pointerCount = i3;
            this.rawPointerPropertiesList = obj;
            this.rawPointerCoords = obj2;
            this.metaState = i4;
            this.buttonState = i5;
            this.xPrecision = f;
            this.yPrecision = f2;
            this.deviceId = i6;
            this.edgeFlags = i7;
            this.source = i8;
            this.flags = i9;
            this.motionEventId = j;
        }
    }

    /* renamed from: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewsHandler */
    public interface PlatformViewsHandler {
        void clearFocus(int i);

        void createForPlatformViewLayer(PlatformViewCreationRequest platformViewCreationRequest);

        long createForTextureLayer(PlatformViewCreationRequest platformViewCreationRequest);

        void dispose(int i);

        void offset(int i, double d, double d2);

        void onTouch(PlatformViewTouch platformViewTouch);

        PlatformViewBufferSize resize(PlatformViewResizeRequest platformViewResizeRequest);

        void setDirection(int i, int i2);

        void synchronizeToNativeViewHierarchy(boolean z);
    }

    public PlatformViewsChannel(DartExecutor dartExecutor) {
        C246231 r0 = new MethodChannel.MethodCallHandler() {
            private void clearFocus(MethodCall methodCall, MethodChannel.Result result) {
                try {
                    PlatformViewsChannel.this.handler.clearFocus(((Integer) methodCall.arguments()).intValue());
                    result.success((Object) null);
                } catch (IllegalStateException e) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), (Object) null);
                }
            }

            private void create(MethodCall methodCall, MethodChannel.Result result) {
                MethodChannel.Result result2 = result;
                Map map = (Map) methodCall.arguments();
                boolean z = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                if (z) {
                    try {
                        PlatformViewsChannel.this.handler.createForPlatformViewLayer(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get(TencentLocation.EXTRA_DIRECTION)).intValue(), wrap));
                        result2.success((Object) null);
                    } catch (IllegalStateException e) {
                        result2.error("error", PlatformViewsChannel.detailedExceptionString(e), (Object) null);
                    }
                } else {
                    int intValue = ((Integer) map.get("id")).intValue();
                    String str = (String) map.get("viewType");
                    double d = 0.0d;
                    double doubleValue = map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d;
                    if (map.containsKey("left")) {
                        d = ((Double) map.get("left")).doubleValue();
                    }
                    result2.success(Long.valueOf(PlatformViewsChannel.this.handler.createForTextureLayer(new PlatformViewCreationRequest(intValue, str, doubleValue, d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get(TencentLocation.EXTRA_DIRECTION)).intValue(), wrap))));
                }
            }

            private void dispose(MethodCall methodCall, MethodChannel.Result result) {
                try {
                    PlatformViewsChannel.this.handler.dispose(((Integer) ((Map) methodCall.arguments()).get("id")).intValue());
                    result.success((Object) null);
                } catch (IllegalStateException e) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), (Object) null);
                }
            }

            private void offset(MethodCall methodCall, MethodChannel.Result result) {
                Map map = (Map) methodCall.arguments();
                try {
                    PlatformViewsChannel.this.handler.offset(((Integer) map.get("id")).intValue(), ((Double) map.get("top")).doubleValue(), ((Double) map.get("left")).doubleValue());
                    result.success((Object) null);
                } catch (IllegalStateException e) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), (Object) null);
                }
            }

            private void resize(MethodCall methodCall, MethodChannel.Result result) {
                Map map = (Map) methodCall.arguments();
                try {
                    PlatformViewBufferSize resize = PlatformViewsChannel.this.handler.resize(new PlatformViewResizeRequest(((Integer) map.get("id")).intValue(), ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue()));
                    if (resize == null) {
                        result.error("error", "Failed to resize the platform view", (Object) null);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("width", Double.valueOf((double) resize.width));
                    hashMap.put("height", Double.valueOf((double) resize.height));
                    result.success(hashMap);
                } catch (IllegalStateException e) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), (Object) null);
                }
            }

            private void setDirection(MethodCall methodCall, MethodChannel.Result result) {
                Map map = (Map) methodCall.arguments();
                try {
                    PlatformViewsChannel.this.handler.setDirection(((Integer) map.get("id")).intValue(), ((Integer) map.get(TencentLocation.EXTRA_DIRECTION)).intValue());
                    result.success((Object) null);
                } catch (IllegalStateException e) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), (Object) null);
                }
            }

            private void synchronizeToNativeViewHierarchy(MethodCall methodCall, MethodChannel.Result result) {
                try {
                    PlatformViewsChannel.this.handler.synchronizeToNativeViewHierarchy(((Boolean) methodCall.arguments()).booleanValue());
                    result.success((Object) null);
                } catch (IllegalStateException e) {
                    result.error("error", PlatformViewsChannel.detailedExceptionString(e), (Object) null);
                }
            }

            private void touch(MethodCall methodCall, MethodChannel.Result result) {
                MethodChannel.Result result2;
                MethodChannel.Result result3 = result;
                List list = (List) methodCall.arguments();
                PlatformViewTouch platformViewTouch = r2;
                PlatformViewTouch platformViewTouch2 = platformViewTouch;
                PlatformViewTouch platformViewTouch3 = new PlatformViewTouch(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue());
                try {
                    PlatformViewsChannel.this.handler.onTouch(platformViewTouch);
                    result2 = result;
                    try {
                        result2.success((Object) null);
                    } catch (IllegalStateException e) {
                        e = e;
                    }
                } catch (IllegalStateException e2) {
                    e = e2;
                    result2 = result;
                    result2.error("error", PlatformViewsChannel.detailedExceptionString(e), (Object) null);
                }
            }

            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                if (PlatformViewsChannel.this.handler != null) {
                    Log.m165290v(PlatformViewsChannel.TAG, "Received '" + methodCall.method + "' message.");
                    String str = methodCall.method;
                    str.getClass();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case -1352294148:
                            if (str.equals("create")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1019779949:
                            if (str.equals("offset")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -934437708:
                            if (str.equals("resize")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -756050293:
                            if (str.equals("clearFocus")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -308988850:
                            if (str.equals("synchronizeToNativeViewHierarchy")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 110550847:
                            if (str.equals("touch")) {
                                c = 5;
                                break;
                            }
                            break;
                        case 576796989:
                            if (str.equals("setDirection")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 1671767583:
                            if (str.equals("dispose")) {
                                c = 7;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            create(methodCall, result);
                            return;
                        case 1:
                            offset(methodCall, result);
                            return;
                        case 2:
                            resize(methodCall, result);
                            return;
                        case 3:
                            clearFocus(methodCall, result);
                            return;
                        case 4:
                            synchronizeToNativeViewHierarchy(methodCall, result);
                            return;
                        case 5:
                            touch(methodCall, result);
                            return;
                        case 6:
                            setDirection(methodCall, result);
                            return;
                        case 7:
                            dispose(methodCall, result);
                            return;
                        default:
                            result.notImplemented();
                            return;
                    }
                }
            }
        };
        this.parsingHandler = r0;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform_views", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(r0);
    }

    /* access modifiers changed from: private */
    public static String detailedExceptionString(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public void invokeViewFocused(int i) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("viewFocused", Integer.valueOf(i));
        }
    }

    public void setPlatformViewsHandler(PlatformViewsHandler platformViewsHandler) {
        this.handler = platformViewsHandler;
    }
}
