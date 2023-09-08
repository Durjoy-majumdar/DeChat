package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_close2 */
public class icons_outlined_close2 extends C24542c {
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 66.0f);
        Path path = instancePath;
        instancePath.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
        Path path2 = path;
        path2.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
        path2.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
        path2.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
        path.close();
        Path path3 = path;
        path3.moveTo(36.0f, 62.4f);
        path3.cubicTo(50.58032f, 62.4f, 62.4f, 50.58032f, 62.4f, 36.0f);
        Path path4 = path;
        path4.cubicTo(62.4f, 21.419683f, 50.58032f, 9.6f, 36.0f, 9.6f);
        path4.cubicTo(21.419683f, 9.6f, 9.6f, 21.419683f, 9.6f, 36.0f);
        path4.cubicTo(9.6f, 50.58032f, 21.419683f, 62.4f, 36.0f, 62.4f);
        path.close();
        Path path5 = path;
        WeChatSVGRenderC2Java.setFillType(path5, 1);
        canvas.drawPath(path5, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 36.0f, 0.70710677f, 0.70710677f, -14.911686f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(37.8f, 34.2f);
        instancePath2.lineTo(51.0f, 34.2f);
        instancePath2.lineTo(51.0f, 37.8f);
        instancePath2.lineTo(37.8f, 37.8f);
        instancePath2.lineTo(37.8f, 51.0f);
        instancePath2.lineTo(34.2f, 51.0f);
        instancePath2.lineTo(34.2f, 37.8f);
        instancePath2.lineTo(21.0f, 37.8f);
        instancePath2.lineTo(21.0f, 34.2f);
        instancePath2.lineTo(34.2f, 34.2f);
        instancePath2.lineTo(34.2f, 21.0f);
        instancePath2.lineTo(37.8f, 21.0f);
        instancePath2.lineTo(37.8f, 34.2f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
