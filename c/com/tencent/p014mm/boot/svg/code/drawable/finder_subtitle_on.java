package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_subtitle_on */
public class finder_subtitle_on extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(20.1931f, 3.75f);
        instancePath.lineTo(3.75694f, 3.75f);
        Path path = instancePath;
        path.cubicTo(3.25996f, 3.75f, 2.98763f, 3.80259f, 2.70362f, 3.95448f);
        path.cubicTo(2.43609f, 4.09755f, 2.22255f, 4.31109f, 2.07948f, 4.57862f);
        path.cubicTo(1.92759f, 4.86263f, 1.875f, 5.13496f, 1.875f, 5.63194f);
        instancePath.lineTo(1.875f, 18.0681f);
        Path path2 = instancePath;
        path2.cubicTo(1.875f, 18.565f, 1.92759f, 18.8374f, 2.07948f, 19.1214f);
        path2.cubicTo(2.22255f, 19.3889f, 2.43609f, 19.6024f, 2.70362f, 19.7455f);
        path2.cubicTo(2.98763f, 19.8974f, 3.25996f, 19.95f, 3.75694f, 19.95f);
        instancePath.lineTo(20.1931f, 19.95f);
        Path path3 = instancePath;
        path3.cubicTo(20.69f, 19.95f, 20.9624f, 19.8974f, 21.2464f, 19.7455f);
        path3.cubicTo(21.5139f, 19.6024f, 21.7274f, 19.3889f, 21.8705f, 19.1214f);
        path3.cubicTo(22.0224f, 18.8374f, 22.075f, 18.565f, 22.075f, 18.0681f);
        instancePath.lineTo(22.075f, 5.63194f);
        Path path4 = instancePath;
        path4.cubicTo(22.075f, 5.13496f, 22.0224f, 4.86263f, 21.8705f, 4.57862f);
        path4.cubicTo(21.7274f, 4.31109f, 21.5139f, 4.09755f, 21.2464f, 3.95448f);
        path4.cubicTo(20.9624f, 3.80259f, 20.69f, 3.75f, 20.1931f, 3.75f);
        instancePath.close();
        instancePath.moveTo(3.64887f, 4.9508f);
        instancePath.lineTo(20.3011f, 4.9508f);
        instancePath.lineTo(20.4633f, 4.95764f);
        instancePath.lineTo(20.5716f, 4.97253f);
        Path path5 = instancePath;
        path5.cubicTo(20.6158f, 4.98218f, 20.6481f, 4.99533f, 20.6805f, 5.01265f);
        path5.cubicTo(20.7389f, 5.04389f, 20.7811f, 5.08613f, 20.8123f, 5.14454f);
        instancePath.lineTo(20.8416f, 5.21273f);
        instancePath.lineTo(20.861f, 5.3022f);
        instancePath.lineTo(20.8717f, 5.43469f);
        instancePath.lineTo(20.875f, 5.63194f);
        instancePath.lineTo(20.875f, 18.0681f);
        instancePath.cubicTo(20.875f, 18.147f, 20.874f, 18.2116f, 20.8717f, 18.2653f);
        instancePath.lineTo(20.861f, 18.3978f);
        instancePath.lineTo(20.8416f, 18.4873f);
        instancePath.lineTo(20.8123f, 18.5555f);
        Path path6 = instancePath;
        path6.cubicTo(20.7811f, 18.6139f, 20.7389f, 18.6561f, 20.6805f, 18.6873f);
        path6.cubicTo(20.6265f, 18.7162f, 20.5729f, 18.7335f, 20.4633f, 18.7424f);
        instancePath.lineTo(20.3011f, 18.7492f);
        instancePath.lineTo(3.64887f, 18.7492f);
        instancePath.lineTo(3.48671f, 18.7424f);
        Path path7 = instancePath;
        path7.cubicTo(3.37706f, 18.7335f, 3.32353f, 18.7162f, 3.26954f, 18.6873f);
        path7.cubicTo(3.21113f, 18.6561f, 3.16889f, 18.6139f, 3.13765f, 18.5555f);
        instancePath.lineTo(3.10837f, 18.4873f);
        path7.cubicTo(3.10033f, 18.4622f, 3.09394f, 18.4336f, 3.089f, 18.3978f);
        instancePath.lineTo(3.07829f, 18.2653f);
        instancePath.lineTo(3.075f, 18.0681f);
        instancePath.lineTo(3.075f, 5.63194f);
        path7.cubicTo(3.075f, 5.55299f, 3.07603f, 5.48844f, 3.07829f, 5.43469f);
        instancePath.lineTo(3.089f, 5.3022f);
        path7.cubicTo(3.09394f, 5.26642f, 3.10033f, 5.2378f, 3.10837f, 5.21273f);
        instancePath.lineTo(3.13765f, 5.14454f);
        path7.cubicTo(3.16889f, 5.08613f, 3.21113f, 5.04389f, 3.26954f, 5.01265f);
        path7.cubicTo(3.30194f, 4.99533f, 3.33416f, 4.98218f, 3.37845f, 4.97253f);
        instancePath.lineTo(3.48671f, 4.95764f);
        instancePath.lineTo(3.64887f, 4.9508f);
        instancePath.close();
        instancePath.moveTo(5.47158f, 15.0257f);
        instancePath.lineTo(7.47158f, 15.0257f);
        instancePath.lineTo(7.47158f, 16.2257f);
        instancePath.lineTo(5.47158f, 16.2257f);
        instancePath.lineTo(5.47158f, 15.0257f);
        instancePath.close();
        instancePath.moveTo(9.47158f, 15.0257f);
        instancePath.lineTo(18.9508f, 15.0257f);
        instancePath.lineTo(18.9508f, 16.2257f);
        instancePath.lineTo(9.47158f, 16.2257f);
        instancePath.lineTo(9.47158f, 15.0257f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
