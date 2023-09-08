package p172io.flutter.embedding.android;

import android.graphics.Matrix;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p172io.flutter.embedding.engine.renderer.FlutterRenderer;

/* renamed from: io.flutter.embedding.android.AndroidTouchProcessor */
public class AndroidTouchProcessor {
    private static final int BYTES_PER_FIELD = 8;
    private static final Matrix IDENTITY_TRANSFORM = new Matrix();
    private static final int POINTER_DATA_FIELD_COUNT = 29;
    private static final int POINTER_DATA_FLAG_BATCHED = 1;
    private static final int _POINTER_BUTTON_PRIMARY = 1;
    private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();
    private final FlutterRenderer renderer;
    private final boolean trackMotionEvents;

    /* renamed from: io.flutter.embedding.android.AndroidTouchProcessor$PointerChange */
    public @interface PointerChange {
        public static final int ADD = 1;
        public static final int CANCEL = 0;
        public static final int DOWN = 4;
        public static final int HOVER = 3;
        public static final int MOVE = 5;
        public static final int REMOVE = 2;

        /* renamed from: UP */
        public static final int f324794UP = 6;
    }

    /* renamed from: io.flutter.embedding.android.AndroidTouchProcessor$PointerDeviceKind */
    public @interface PointerDeviceKind {
        public static final int INVERTED_STYLUS = 3;
        public static final int MOUSE = 1;
        public static final int STYLUS = 2;
        public static final int TOUCH = 0;
        public static final int UNKNOWN = 4;
    }

    /* renamed from: io.flutter.embedding.android.AndroidTouchProcessor$PointerSignalKind */
    public @interface PointerSignalKind {
        public static final int NONE = 0;
        public static final int SCROLL = 1;
        public static final int UNKNOWN = 2;
    }

    public AndroidTouchProcessor(FlutterRenderer flutterRenderer, boolean z) {
        this.renderer = flutterRenderer;
        this.trackMotionEvents = z;
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i, int i2, int i3, Matrix matrix, ByteBuffer byteBuffer) {
        long j;
        double d;
        double d2;
        InputDevice.MotionRange motionRange;
        MotionEvent motionEvent2 = motionEvent;
        int i4 = i;
        int i5 = i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (i5 != -1) {
            long id = this.trackMotionEvents ? this.motionEventTracker.track(motionEvent2).getId() : 0;
            int pointerDeviceTypeForToolType = getPointerDeviceTypeForToolType(motionEvent.getToolType(i));
            int i6 = motionEvent.getActionMasked() == 8 ? 1 : 0;
            byteBuffer2.putLong(id);
            byteBuffer2.putLong(motionEvent.getEventTime() * 1000);
            byteBuffer2.putLong((long) i5);
            byteBuffer2.putLong((long) pointerDeviceTypeForToolType);
            byteBuffer2.putLong((long) i6);
            byteBuffer2.putLong((long) motionEvent.getPointerId(i));
            byteBuffer2.putLong(0);
            float[] fArr = {motionEvent.getX(i), motionEvent.getY(i)};
            matrix.mapPoints(fArr);
            byteBuffer2.putDouble((double) fArr[0]);
            byteBuffer2.putDouble((double) fArr[1]);
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
            if (pointerDeviceTypeForToolType == 1) {
                j = (long) (motionEvent.getButtonState() & 31);
                if (j == 0 && motionEvent.getSource() == 8194 && (i5 == 4 || i5 == 5)) {
                    j = 1;
                }
            } else {
                j = pointerDeviceTypeForToolType == 2 ? (long) ((motionEvent.getButtonState() >> 4) & 15) : 0;
            }
            byteBuffer2.putLong(j);
            byteBuffer2.putLong(0);
            byteBuffer2.putLong(0);
            byteBuffer2.putDouble((double) motionEvent.getPressure(i));
            double d3 = 1.0d;
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d = 0.0d;
            } else {
                double min = (double) motionRange.getMin();
                d3 = (double) motionRange.getMax();
                d = min;
            }
            byteBuffer2.putDouble(d);
            byteBuffer2.putDouble(d3);
            if (pointerDeviceTypeForToolType == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(24, i4));
                d2 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            } else {
                d2 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble((double) motionEvent.getSize(i));
            byteBuffer2.putDouble((double) motionEvent.getToolMajor(i));
            byteBuffer2.putDouble((double) motionEvent.getToolMinor(i));
            byteBuffer2.putDouble(d2);
            byteBuffer2.putDouble(d2);
            byteBuffer2.putDouble((double) motionEvent2.getAxisValue(8, i4));
            if (pointerDeviceTypeForToolType == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(25, i4));
            } else {
                byteBuffer2.putDouble(d2);
            }
            byteBuffer2.putLong((long) i3);
            if (i6 == 1) {
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(10)));
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(9)));
                return;
            }
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
        }
    }

    private int getPointerChangeForAction(int i) {
        if (i == 0) {
            return 4;
        }
        if (i == 1) {
            return 6;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return 6;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 7) {
            return 3;
        }
        if (i == 3) {
            return 0;
        }
        return i == 8 ? 3 : -1;
    }

    private int getPointerDeviceTypeForToolType(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return i != 4 ? 4 : 3;
        }
        return 1;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z = motionEvent.isFromSource(2);
        boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z || !z2) {
            return false;
        }
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 29 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, IDENTITY_TRANSFORM, allocateDirect);
        if (allocateDirect.position() % 232 == 0) {
            this.renderer.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent, IDENTITY_TRANSFORM);
    }

    public boolean onTouchEvent(MotionEvent motionEvent, Matrix matrix) {
        int pointerCount = motionEvent.getPointerCount();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(pointerCount * 29 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        int actionMasked = motionEvent.getActionMasked();
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        boolean z = actionMasked == 0 || actionMasked == 5;
        boolean z2 = !z && (actionMasked == 1 || actionMasked == 6);
        if (z) {
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, allocateDirect);
        } else if (z2) {
            for (int i = 0; i < pointerCount; i++) {
                if (i != motionEvent.getActionIndex() && motionEvent.getToolType(i) == 1) {
                    addPointerForIndex(motionEvent, i, 5, 1, matrix, allocateDirect);
                }
            }
            addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, matrix, allocateDirect);
        } else {
            for (int i2 = 0; i2 < pointerCount; i2++) {
                addPointerForIndex(motionEvent, i2, pointerChangeForAction, 0, matrix, allocateDirect);
            }
        }
        if (allocateDirect.position() % 232 == 0) {
            this.renderer.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary");
    }
}
