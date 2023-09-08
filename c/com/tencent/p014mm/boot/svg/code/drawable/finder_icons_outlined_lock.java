package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_outlined_lock */
public class finder_icons_outlined_lock extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(10.799999f, 7.0f);
        instancePath.lineTo(10.799999f, 4.0f);
        Path path = instancePath;
        path.cubicTo(10.799997f, 2.4535997f, 9.546394f, 1.199997f, 8.0f, 1.199997f);
        path.cubicTo(6.4535995f, 1.199997f, 5.199997f, 2.4535997f, 5.199997f, 4.0f);
        instancePath.lineTo(5.2000003f, 7.0f);
        instancePath.lineTo(10.799999f, 7.0f);
        instancePath.close();
        instancePath.moveTo(14.8f, 8.2f);
        instancePath.lineTo(1.2f, 8.2f);
        instancePath.lineTo(1.2f, 18.8f);
        instancePath.lineTo(14.8f, 18.8f);
        instancePath.lineTo(14.8f, 8.2f);
        instancePath.close();
        instancePath.moveTo(8.0f, 11.0f);
        Path path2 = instancePath;
        path2.cubicTo(8.828427f, 11.0f, 9.5f, 11.671573f, 9.5f, 12.5f);
        path2.cubicTo(9.5f, 13.115096f, 9.129771f, 13.64372f, 8.599999f, 13.875187f);
        instancePath.lineTo(8.599999f, 16.0f);
        instancePath.lineTo(7.3999996f, 16.0f);
        instancePath.lineTo(7.3999996f, 13.875187f);
        Path path3 = instancePath;
        path3.cubicTo(6.8702283f, 13.64372f, 6.5f, 13.115095f, 6.5f, 12.5f);
        path3.cubicTo(6.5f, 11.671573f, 7.1715727f, 11.0f, 8.0f, 11.0f);
        instancePath.close();
        instancePath.moveTo(4.0f, 4.0f);
        path3.cubicTo(4.0f, 1.790861f, 5.790861f, 0.0f, 8.0f, 0.0f);
        path3.cubicTo(10.209139f, 0.0f, 12.0f, 1.790861f, 12.0f, 4.0f);
        instancePath.lineTo(12.0f, 7.0f);
        instancePath.lineTo(14.999128f, 7.0f);
        instancePath.cubicTo(15.551894f, 7.0f, 16.0f, 7.4474893f, 16.0f, 7.9985023f);
        instancePath.lineTo(16.0f, 19.001497f);
        instancePath.cubicTo(16.0f, 19.552956f, 15.555369f, 20.0f, 14.999128f, 20.0f);
        instancePath.lineTo(1.0008717f, 20.0f);
        instancePath.cubicTo(0.4481055f, 20.0f, 0.0f, 19.552511f, 0.0f, 19.001497f);
        instancePath.lineTo(0.0f, 7.9985023f);
        instancePath.cubicTo(0.0f, 7.447045f, 0.44463086f, 7.0f, 1.0008717f, 7.0f);
        instancePath.lineTo(4.0f, 7.0f);
        instancePath.lineTo(4.0f, 4.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
