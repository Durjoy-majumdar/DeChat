package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_bellring_off */
public class icons_outlined_bellring_off extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(39.0f, 60.00001f);
        instancePath.lineTo(39.0f, 60.6f);
        Path path = instancePath;
        path.cubicTo(39.0f, 62.256855f, 37.656853f, 63.6f, 36.0f, 63.6f);
        path.cubicTo(34.343147f, 63.6f, 33.0f, 62.256855f, 33.0f, 60.6f);
        instancePath.lineTo(33.0f, 60.0f);
        instancePath.lineTo(15.560121f, 60.0f);
        Path path2 = instancePath;
        path2.cubicTo(14.921177f, 60.0f, 14.2989235f, 59.795994f, 13.784002f, 59.4177f);
        path2.cubicTo(12.448801f, 58.43678f, 12.161601f, 56.55919f, 13.142524f, 55.223988f);
        path2.cubicTo(16.380814f, 50.815952f, 18.0f, 46.407974f, 18.0f, 42.0f);
        instancePath.lineTo(18.0f, 30.0f);
        instancePath.cubicTo(18.0f, 27.92808f, 18.350065f, 25.937923f, 18.994276f, 24.085447f);
        instancePath.lineTo(21.91342f, 27.004591f);
        instancePath.cubicTo(21.707672f, 27.974428f, 21.6f, 28.976965f, 21.6f, 30.0f);
        instancePath.lineTo(21.6f, 42.0f);
        instancePath.cubicTo(21.6f, 46.890984f, 19.945477f, 51.706535f, 16.722664f, 56.40008f);
        instancePath.lineTo(36.000015f, 56.4f);
        instancePath.lineTo(51.30889f, 56.400063f);
        instancePath.lineTo(54.90891f, 60.00008f);
        instancePath.lineTo(39.0f, 60.00001f);
        instancePath.close();
        instancePath.moveTo(56.414642f, 51.32347f);
        instancePath.lineTo(67.27494f, 62.183765f);
        instancePath.lineTo(64.729355f, 64.72935f);
        instancePath.lineTo(14.545586f, 14.545585f);
        instancePath.lineTo(17.091171f, 12.0f);
        instancePath.lineTo(22.825727f, 17.734556f);
        Path path3 = instancePath;
        path3.cubicTo(24.80219f, 15.612583f, 27.285189f, 13.968691f, 30.08219f, 12.995409f);
        path3.cubicTo(30.028131f, 12.671648f, 30.0f, 12.339109f, 30.0f, 12.0f);
        path3.cubicTo(30.0f, 8.686292f, 32.68629f, 6.0f, 36.0f, 6.0f);
        path3.cubicTo(39.31371f, 6.0f, 42.0f, 8.686292f, 42.0f, 12.0f);
        path3.cubicTo(42.0f, 12.339109f, 41.971867f, 12.671648f, 41.91781f, 12.995409f);
        path3.cubicTo(48.951862f, 15.443072f, 54.0f, 22.132008f, 54.0f, 30.0f);
        instancePath.lineTo(54.0f, 42.0f);
        instancePath.cubicTo(54.0f, 45.107822f, 54.804882f, 48.21565f, 56.414642f, 51.32347f);
        instancePath.close();
        instancePath.moveTo(25.371933f, 20.280764f);
        instancePath.lineTo(50.701653f, 45.61048f);
        Path path4 = instancePath;
        path4.cubicTo(50.500984f, 44.412064f, 50.4f, 43.208336f, 50.4f, 42.0f);
        instancePath.lineTo(50.4f, 30.0f);
        path4.cubicTo(50.4f, 23.822582f, 46.474163f, 18.392626f, 40.734688f, 16.395443f);
        instancePath.lineTo(37.866898f, 15.397528f);
        instancePath.lineTo(38.366966f, 12.402531f);
        Path path5 = instancePath;
        path5.cubicTo(38.388844f, 12.27149f, 38.4f, 12.137221f, 38.4f, 12.0f);
        path5.cubicTo(38.4f, 10.674517f, 37.325485f, 9.6f, 36.0f, 9.6f);
        path5.cubicTo(34.674515f, 9.6f, 33.6f, 10.674517f, 33.6f, 12.0f);
        path5.cubicTo(33.6f, 12.137221f, 33.611156f, 12.27149f, 33.633034f, 12.402531f);
        instancePath.lineTo(34.133102f, 15.397528f);
        instancePath.lineTo(31.26531f, 16.395443f);
        instancePath.cubicTo(28.963835f, 17.196295f, 26.95398f, 18.549114f, 25.371933f, 20.280764f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
