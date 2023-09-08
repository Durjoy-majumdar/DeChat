package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_mini_windows_new */
public class icons_outlined_mini_windows_new extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(74.7207f, 45.6f);
        instancePath.cubicTo(78.7599f, 45.6f, 82.0708f, 48.7185f, 82.377f, 52.6792f);
        instancePath.lineTo(82.4001f, 53.2794f);
        instancePath.lineTo(82.4001f, 74.0f);
        instancePath.cubicTo(82.4001f, 78.4375f, 78.9592f, 82.0713f, 74.6f, 82.3789f);
        instancePath.lineTo(74.0001f, 82.4f);
        instancePath.lineTo(54.0001f, 82.4f);
        instancePath.cubicTo(49.5626f, 82.4f, 45.9288f, 78.9591f, 45.6212f, 74.5999f);
        instancePath.lineTo(45.6001f, 74.0f);
        instancePath.lineTo(45.6001f, 54.0f);
        Path path = instancePath;
        path.cubicTo(45.6001f, 49.5625f, 49.041f, 45.9287f, 53.4002f, 45.6211f);
        instancePath.lineTo(54.0001f, 45.6f);
        instancePath.lineTo(74.7207f, 45.6f);
        instancePath.close();
        instancePath.moveTo(74.7207f, 50.4f);
        instancePath.lineTo(54.0001f, 50.4f);
        path.cubicTo(52.1648f, 50.4f, 50.6503f, 51.7733f, 50.4281f, 53.5484f);
        instancePath.lineTo(50.4001f, 54.0f);
        instancePath.lineTo(50.4001f, 74.0f);
        instancePath.cubicTo(50.4001f, 75.8353f, 51.7734f, 77.3498f, 53.5485f, 77.5719f);
        instancePath.lineTo(54.0001f, 77.6f);
        instancePath.lineTo(74.0001f, 77.6f);
        Path path2 = instancePath;
        path2.cubicTo(75.8354f, 77.6f, 77.3499f, 76.2266f, 77.572f, 74.4515f);
        instancePath.lineTo(77.6001f, 74.0f);
        instancePath.lineTo(77.6001f, 53.2794f);
        path2.cubicTo(77.6001f, 51.8216f, 76.5168f, 50.6169f, 75.1114f, 50.4263f);
        instancePath.lineTo(74.7207f, 50.4f);
        instancePath.close();
        instancePath.moveTo(64.0001f, 13.6f);
        path2.cubicTo(67.3383f, 13.6f, 70.0797f, 16.1558f, 70.3739f, 19.4174f);
        instancePath.lineTo(70.4001f, 20.0f);
        instancePath.lineTo(70.4001f, 37.6f);
        instancePath.lineTo(65.6001f, 37.6f);
        instancePath.lineTo(65.6001f, 20.0f);
        instancePath.cubicTo(65.6001f, 19.2268f, 65.0516f, 18.5817f, 64.3226f, 18.4325f);
        instancePath.lineTo(64.0001f, 18.4f);
        instancePath.lineTo(20.0001f, 18.4f);
        instancePath.cubicTo(19.2269f, 18.4f, 18.5818f, 18.9484f, 18.4326f, 19.6775f);
        instancePath.lineTo(18.4001f, 20.0f);
        instancePath.lineTo(18.4001f, 64.0f);
        instancePath.cubicTo(18.4001f, 64.7732f, 18.9485f, 65.4183f, 19.6776f, 65.5675f);
        instancePath.lineTo(20.0001f, 65.6f);
        instancePath.lineTo(37.6001f, 65.6f);
        instancePath.lineTo(37.6001f, 70.4f);
        instancePath.lineTo(20.0001f, 70.4f);
        instancePath.cubicTo(16.6618f, 70.4f, 13.9205f, 67.8441f, 13.6263f, 64.5825f);
        instancePath.lineTo(13.6001f, 64.0f);
        instancePath.lineTo(13.6001f, 20.0f);
        instancePath.cubicTo(13.6001f, 16.6617f, 16.1559f, 13.9204f, 19.4176f, 13.6261f);
        instancePath.lineTo(20.0001f, 13.6f);
        instancePath.lineTo(64.0001f, 13.6f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
