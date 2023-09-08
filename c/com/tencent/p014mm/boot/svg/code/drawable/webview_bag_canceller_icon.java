package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.webview_bag_canceller_icon */
public class webview_bag_canceller_icon extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 144;
        }
        if (i2 != 2) {
            return 0;
        }
        Canvas canvas = objArr[0];
        Looper looper = objArr[1];
        C24542c.instanceMatrix(looper);
        C24542c.instanceMatrixArray(looper);
        Paint instancePaint = C24542c.instancePaint(looper);
        instancePaint.setFlags(385);
        instancePaint.setStyle(Paint.Style.FILL);
        Paint instancePaint2 = C24542c.instancePaint(looper);
        instancePaint2.setFlags(385);
        instancePaint2.setStyle(Paint.Style.STROKE);
        instancePaint.setColor(-16777216);
        instancePaint2.setStrokeWidth(1.0f);
        instancePaint2.setStrokeCap(Paint.Cap.BUTT);
        instancePaint2.setStrokeJoin(Paint.Join.MITER);
        instancePaint2.setStrokeMiter(4.0f);
        instancePaint2.setPathEffect((PathEffect) null);
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(30.698973f, 20.516636f);
        Path path = instancePath;
        path.cubicTo(42.005985f, 11.434257f, 56.368374f, 6.0f, 72.0f, 6.0f);
        path.cubicTo(108.45079f, 6.0f, 138.0f, 35.549206f, 138.0f, 72.0f);
        path.cubicTo(138.0f, 87.63162f, 132.56575f, 101.99401f, 123.48336f, 113.301025f);
        instancePath.lineTo(128.00285f, 117.82052f);
        instancePath.lineTo(122.91169f, 122.91169f);
        instancePath.lineTo(21.08831f, 21.088312f);
        instancePath.lineTo(26.17948f, 15.997144f);
        instancePath.lineTo(30.698973f, 20.516636f);
        instancePath.close();
        instancePath.moveTo(118.35804f, 108.1757f);
        Path path2 = instancePath;
        path2.cubicTo(126.15405f, 98.19952f, 130.8f, 85.64232f, 130.8f, 72.0f);
        path2.cubicTo(130.8f, 39.525658f, 104.47434f, 13.200001f, 72.0f, 13.200001f);
        path2.cubicTo(58.357685f, 13.200001f, 45.80049f, 17.845951f, 35.824303f, 25.641966f);
        instancePath.lineTo(47.82981f, 37.647472f);
        path2.cubicTo(54.664818f, 32.82958f, 63.00197f, 30.0f, 72.0f, 30.0f);
        path2.cubicTo(95.19596f, 30.0f, 114.0f, 48.80404f, 114.0f, 72.0f);
        path2.cubicTo(114.0f, 80.99803f, 111.170425f, 89.33518f, 106.35253f, 96.17018f);
        instancePath.lineTo(118.35804f, 108.1757f);
        instancePath.close();
        instancePath.moveTo(101.16897f, 90.98663f);
        path2.cubicTo(104.73026f, 85.52662f, 106.8f, 79.00501f, 106.8f, 72.0f);
        path2.cubicTo(106.8f, 52.78049f, 91.21951f, 37.2f, 72.0f, 37.2f);
        path2.cubicTo(64.99499f, 37.2f, 58.47338f, 39.269733f, 53.013367f, 42.83103f);
        instancePath.lineTo(101.16897f, 90.98663f);
        instancePath.close();
        instancePath.moveTo(20.516634f, 30.698975f);
        instancePath.lineTo(25.641964f, 35.824303f);
        Path path3 = instancePath;
        path3.cubicTo(17.845951f, 45.80049f, 13.200001f, 58.357685f, 13.200001f, 72.0f);
        path3.cubicTo(13.200001f, 104.47434f, 39.525658f, 130.8f, 72.0f, 130.8f);
        path3.cubicTo(85.64232f, 130.8f, 98.19951f, 126.15405f, 108.1757f, 118.35804f);
        instancePath.lineTo(113.301025f, 123.48337f);
        Path path4 = instancePath;
        path4.cubicTo(101.99401f, 132.56575f, 87.63162f, 138.0f, 72.0f, 138.0f);
        path4.cubicTo(35.549206f, 138.0f, 6.0f, 108.45079f, 6.0f, 72.0f);
        path4.cubicTo(6.0f, 56.368374f, 11.434257f, 42.00599f, 20.516634f, 30.698975f);
        instancePath.close();
        instancePath.moveTo(37.647472f, 47.82981f);
        instancePath.lineTo(42.831028f, 53.01337f);
        Path path5 = instancePath;
        path5.cubicTo(39.269733f, 58.473385f, 37.2f, 64.99499f, 37.2f, 72.0f);
        path5.cubicTo(37.2f, 91.21951f, 52.78049f, 106.8f, 72.0f, 106.8f);
        path5.cubicTo(79.00501f, 106.8f, 85.52662f, 104.73026f, 90.98663f, 101.16897f);
        instancePath.lineTo(96.17019f, 106.35253f);
        Path path6 = instancePath;
        path6.cubicTo(89.33519f, 111.17042f, 80.99804f, 114.0f, 72.0f, 114.0f);
        path6.cubicTo(48.80404f, 114.0f, 30.0f, 95.19596f, 30.0f, 72.0f);
        path6.cubicTo(30.0f, 63.001965f, 32.82958f, 54.664814f, 37.647472f, 47.82981f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
