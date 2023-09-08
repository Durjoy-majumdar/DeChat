package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_info */
public class icons_filled_info extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(30.0f, 60.0f);
            Path path = instancePath;
            path.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
            path.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
            path.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
            path.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
            instancePath.close();
            instancePath.moveTo(27.75f, 24.0f);
            instancePath.lineTo(27.75f, 45.0f);
            instancePath.lineTo(32.25f, 45.0f);
            instancePath.lineTo(32.25f, 24.0f);
            instancePath.lineTo(27.75f, 24.0f);
            instancePath.close();
            instancePath.moveTo(30.0f, 21.0f);
            Path path2 = instancePath;
            path2.cubicTo(31.656855f, 21.0f, 33.0f, 19.656855f, 33.0f, 18.0f);
            path2.cubicTo(33.0f, 16.343145f, 31.656855f, 15.0f, 30.0f, 15.0f);
            path2.cubicTo(28.343145f, 15.0f, 27.0f, 16.343145f, 27.0f, 18.0f);
            path2.cubicTo(27.0f, 19.656855f, 28.343145f, 21.0f, 30.0f, 21.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
