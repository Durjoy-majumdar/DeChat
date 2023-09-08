package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_moment */
public class icons_outlined_moment extends C24542c {
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
        Matrix instanceMatrix = C24542c.instanceMatrix(looper);
        float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
        instancePaint3.setColor(-436207616);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(10.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(4.5f, 0.0f, 0.0f, 4.5f, 0.0f, 10.0f);
        path.cubicTo(0.0f, 15.5f, 4.5f, 20.0f, 10.0f, 20.0f);
        path.cubicTo(15.5f, 20.0f, 20.0f, 15.5f, 20.0f, 10.0f);
        path.cubicTo(20.0f, 4.5f, 15.5f, 0.0f, 10.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(18.0f, 6.3f);
        instancePath.lineTo(14.2f, 10.0f);
        path.cubicTo(14.2f, 10.0f, 14.2f, 10.0f, 14.2f, 10.0f);
        instancePath.lineTo(14.2f, 2.3f);
        path.cubicTo(15.8f, 3.2f, 17.2f, 4.6f, 18.0f, 6.3f);
        instancePath.close();
        instancePath.moveTo(12.1f, 12.1f);
        path.cubicTo(11.6f, 12.7f, 10.8f, 13.0f, 10.0f, 13.0f);
        path.cubicTo(9.2f, 13.0f, 8.4f, 12.7f, 7.9f, 12.1f);
        instancePath.lineTo(7.9f, 12.1f);
        instancePath.lineTo(7.9f, 12.1f);
        Path path2 = instancePath;
        path2.cubicTo(7.3f, 11.6f, 7.0f, 10.8f, 7.0f, 10.0f);
        path2.cubicTo(7.0f, 8.3f, 8.3f, 7.0f, 10.0f, 7.0f);
        path2.cubicTo(11.7f, 7.0f, 13.0f, 8.3f, 13.0f, 10.0f);
        path2.cubicTo(13.0f, 10.8f, 12.7f, 11.6f, 12.1f, 12.1f);
        instancePath.lineTo(12.1f, 12.1f);
        instancePath.lineTo(12.1f, 12.1f);
        instancePath.close();
        instancePath.moveTo(13.0f, 1.7f);
        instancePath.lineTo(13.0f, 7.0f);
        path2.cubicTo(13.0f, 7.0f, 13.0f, 7.0f, 13.0f, 7.0f);
        instancePath.lineTo(13.0f, 7.0f);
        instancePath.lineTo(7.5f, 1.6f);
        Path path3 = instancePath;
        path3.cubicTo(8.3f, 1.4f, 9.1f, 1.2f, 10.0f, 1.2f);
        path3.cubicTo(11.1f, 1.2f, 12.1f, 1.4f, 13.0f, 1.7f);
        instancePath.close();
        instancePath.moveTo(6.3f, 2.0f);
        instancePath.lineTo(10.0f, 5.8f);
        path3.cubicTo(10.0f, 5.8f, 10.0f, 5.8f, 10.0f, 5.8f);
        instancePath.lineTo(2.3f, 5.8f);
        path3.cubicTo(3.2f, 4.2f, 4.6f, 2.8f, 6.3f, 2.0f);
        instancePath.close();
        instancePath.moveTo(1.7f, 7.0f);
        instancePath.lineTo(7.0f, 7.0f);
        path3.cubicTo(7.0f, 7.0f, 7.0f, 7.0f, 7.0f, 7.0f);
        instancePath.lineTo(7.0f, 7.0f);
        instancePath.lineTo(1.5f, 12.5f);
        path3.cubicTo(1.3f, 11.7f, 1.1f, 10.9f, 1.1f, 10.0f);
        path3.cubicTo(1.2f, 8.9f, 1.4f, 7.9f, 1.7f, 7.0f);
        instancePath.close();
        instancePath.moveTo(2.0f, 13.7f);
        instancePath.lineTo(5.8f, 10.0f);
        path3.cubicTo(5.8f, 10.0f, 5.8f, 10.0f, 5.8f, 10.0f);
        instancePath.lineTo(5.8f, 17.7f);
        path3.cubicTo(4.2f, 16.8f, 2.8f, 15.4f, 2.0f, 13.7f);
        instancePath.close();
        instancePath.moveTo(7.0f, 18.3f);
        instancePath.lineTo(7.0f, 13.0f);
        instancePath.cubicTo(7.0f, 13.0f, 7.0f, 13.0f, 7.0f, 13.0f);
        instancePath.lineTo(7.0f, 13.0f);
        instancePath.lineTo(12.5f, 18.5f);
        Path path4 = instancePath;
        path4.cubicTo(11.7f, 18.7f, 10.9f, 18.9f, 10.0f, 18.9f);
        path4.cubicTo(8.9f, 18.8f, 7.9f, 18.6f, 7.0f, 18.3f);
        instancePath.close();
        instancePath.moveTo(13.7f, 18.0f);
        instancePath.lineTo(10.0f, 14.2f);
        Path path5 = instancePath;
        path5.cubicTo(10.0f, 14.2f, 10.0f, 14.2f, 10.0f, 14.2f);
        instancePath.lineTo(17.7f, 14.2f);
        path5.cubicTo(16.8f, 15.8f, 15.4f, 17.2f, 13.7f, 18.0f);
        instancePath.close();
        instancePath.moveTo(18.3f, 13.0f);
        instancePath.lineTo(13.0f, 13.0f);
        path5.cubicTo(13.0f, 13.0f, 13.0f, 13.0f, 13.0f, 13.0f);
        instancePath.lineTo(13.0f, 13.0f);
        instancePath.lineTo(18.5f, 7.5f);
        path5.cubicTo(18.7f, 8.3f, 18.9f, 9.1f, 18.9f, 10.0f);
        path5.cubicTo(18.8f, 11.1f, 18.6f, 12.1f, 18.3f, 13.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
