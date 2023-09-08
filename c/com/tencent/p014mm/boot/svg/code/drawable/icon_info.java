package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_info */
public class icon_info extends C24542c {
    private final int height = 27;
    private final int width = 29;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 29;
        }
        if (i2 == 1) {
            return 27;
        }
        if (i2 == 2) {
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -333.0f, 0.0f, 1.0f, -227.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16268960);
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 335.0f, 0.0f, 1.0f, 229.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(12.0f, 24.0f);
            Path path = instancePath;
            path.cubicTo(5.372583f, 24.0f, 0.0f, 18.627417f, 0.0f, 12.0f);
            path.cubicTo(0.0f, 5.372583f, 5.372583f, 0.0f, 12.0f, 0.0f);
            path.cubicTo(18.627417f, 0.0f, 24.0f, 5.372583f, 24.0f, 12.0f);
            path.cubicTo(24.0f, 18.627417f, 18.627417f, 24.0f, 12.0f, 24.0f);
            instancePath.close();
            instancePath.moveTo(12.0f, 22.56f);
            Path path2 = instancePath;
            path2.cubicTo(17.832127f, 22.56f, 22.56f, 17.832127f, 22.56f, 12.0f);
            path2.cubicTo(22.56f, 6.167873f, 17.832127f, 1.44f, 12.0f, 1.44f);
            path2.cubicTo(6.167873f, 1.44f, 1.44f, 6.167873f, 1.44f, 12.0f);
            path2.cubicTo(1.44f, 17.832127f, 6.167873f, 22.56f, 12.0f, 22.56f);
            instancePath.close();
            instancePath.moveTo(11.28f, 9.6f);
            instancePath.lineTo(12.719999f, 9.6f);
            instancePath.lineTo(12.719999f, 18.0f);
            instancePath.lineTo(11.28f, 18.0f);
            instancePath.lineTo(11.28f, 9.6f);
            instancePath.close();
            instancePath.moveTo(12.0f, 8.4f);
            Path path3 = instancePath;
            path3.cubicTo(11.337258f, 8.4f, 10.8f, 7.8627415f, 10.8f, 7.2f);
            path3.cubicTo(10.8f, 6.537258f, 11.337258f, 6.0f, 12.0f, 6.0f);
            path3.cubicTo(12.662742f, 6.0f, 13.2f, 6.537258f, 13.2f, 7.2f);
            path3.cubicTo(13.2f, 7.8627415f, 12.662742f, 8.4f, 12.0f, 8.4f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(14211288);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(333.0f, 227.0f);
            instancePath2.lineTo(362.0f, 227.0f);
            instancePath2.lineTo(362.0f, 254.0f);
            instancePath2.lineTo(333.0f, 254.0f);
            instancePath2.lineTo(333.0f, 227.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
