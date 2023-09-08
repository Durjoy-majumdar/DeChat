package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_unlock */
public class icons_outlined_unlock extends C24542c {
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
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(14.8f, 9.0f);
        instancePath.lineTo(14.8f, 6.0f);
        Path path = instancePath;
        path.cubicTo(14.8f, 3.790861f, 16.59086f, 2.0f, 18.8f, 2.0f);
        path.cubicTo(21.009138f, 2.0f, 22.8f, 3.790861f, 22.8f, 6.0f);
        instancePath.lineTo(22.8f, 9.0f);
        instancePath.lineTo(21.599998f, 9.0f);
        instancePath.lineTo(21.599998f, 6.0f);
        Path path2 = instancePath;
        path2.cubicTo(21.599997f, 4.4535995f, 20.346394f, 3.199997f, 18.799997f, 3.199997f);
        path2.cubicTo(17.2536f, 3.199997f, 15.999997f, 4.4535995f, 15.999997f, 5.9999967f);
        instancePath.lineTo(16.0f, 9.0f);
        instancePath.lineTo(18.999128f, 9.0f);
        path2.cubicTo(19.551895f, 9.0f, 20.0f, 9.44749f, 20.0f, 9.998503f);
        instancePath.lineTo(20.0f, 21.001497f);
        instancePath.cubicTo(20.0f, 21.552956f, 19.555368f, 22.0f, 18.999128f, 22.0f);
        instancePath.lineTo(5.0008717f, 22.0f);
        Path path3 = instancePath;
        path3.cubicTo(4.4481053f, 22.0f, 4.0f, 21.552511f, 4.0f, 21.001497f);
        instancePath.lineTo(4.0f, 9.998503f);
        path3.cubicTo(4.0f, 9.447044f, 4.4446306f, 9.0f, 5.0008717f, 9.0f);
        instancePath.lineTo(14.8f, 9.0f);
        instancePath.close();
        instancePath.moveTo(5.2f, 10.2f);
        instancePath.lineTo(5.2f, 20.8f);
        instancePath.lineTo(18.8f, 20.8f);
        instancePath.lineTo(18.8f, 10.2f);
        instancePath.lineTo(5.2f, 10.2f);
        instancePath.close();
        instancePath.moveTo(11.4f, 15.875187f);
        path3.cubicTo(10.870229f, 15.64372f, 10.5f, 15.115095f, 10.5f, 14.5f);
        path3.cubicTo(10.5f, 13.671573f, 11.171573f, 13.0f, 12.0f, 13.0f);
        path3.cubicTo(12.828427f, 13.0f, 13.5f, 13.671573f, 13.5f, 14.5f);
        path3.cubicTo(13.5f, 15.115096f, 13.129771f, 15.64372f, 12.599999f, 15.875187f);
        instancePath.lineTo(12.599999f, 18.0f);
        instancePath.lineTo(11.4f, 18.0f);
        instancePath.lineTo(11.4f, 15.875187f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
