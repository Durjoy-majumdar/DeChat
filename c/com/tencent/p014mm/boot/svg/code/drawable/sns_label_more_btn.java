package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_label_more_btn */
public class sns_label_more_btn extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                canvas.saveLayerAlpha((RectF) null, 128, 31);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(10.0f, 20.0f);
                Path path = instancePath;
                path.cubicTo(4.4771523f, 20.0f, 0.0f, 15.522847f, 0.0f, 10.0f);
                path.cubicTo(0.0f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
                path.cubicTo(15.522847f, 0.0f, 20.0f, 4.4771523f, 20.0f, 10.0f);
                path.cubicTo(20.0f, 15.522847f, 15.522847f, 20.0f, 10.0f, 20.0f);
                instancePath.close();
                instancePath.moveTo(10.0f, 18.8f);
                Path path2 = instancePath;
                path2.cubicTo(14.8601055f, 18.8f, 18.8f, 14.8601055f, 18.8f, 10.0f);
                path2.cubicTo(18.8f, 5.139894f, 14.8601055f, 1.2f, 10.0f, 1.2f);
                path2.cubicTo(5.139894f, 1.2f, 1.2f, 5.139894f, 1.2f, 10.0f);
                path2.cubicTo(1.2f, 14.8601055f, 5.139894f, 18.8f, 10.0f, 18.8f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(6.0f, 9.0f);
                Path path3 = instancePath2;
                path3.cubicTo(6.5522847f, 9.0f, 7.0f, 9.447715f, 7.0f, 10.0f);
                path3.cubicTo(7.0f, 10.552285f, 6.5522847f, 11.0f, 6.0f, 11.0f);
                path3.cubicTo(5.4477153f, 11.0f, 5.0f, 10.552285f, 5.0f, 10.0f);
                path3.cubicTo(5.0f, 9.447715f, 5.4477153f, 9.0f, 6.0f, 9.0f);
                instancePath2.close();
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.save();
                Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath3 = C24542c.instancePath(looper);
                instancePath3.moveTo(10.0f, 9.0f);
                Path path4 = instancePath3;
                path4.cubicTo(10.552285f, 9.0f, 11.0f, 9.447715f, 11.0f, 10.0f);
                path4.cubicTo(11.0f, 10.552285f, 10.552285f, 11.0f, 10.0f, 11.0f);
                path4.cubicTo(9.447715f, 11.0f, 9.0f, 10.552285f, 9.0f, 10.0f);
                path4.cubicTo(9.0f, 9.447715f, 9.447715f, 9.0f, 10.0f, 9.0f);
                instancePath3.close();
                canvas.drawPath(instancePath3, instancePaint6);
                canvas.restore();
                canvas.save();
                Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath4 = C24542c.instancePath(looper);
                instancePath4.moveTo(14.0f, 9.0f);
                Path path5 = instancePath4;
                path5.cubicTo(14.552285f, 9.0f, 15.0f, 9.447715f, 15.0f, 10.0f);
                path5.cubicTo(15.0f, 10.552285f, 14.552285f, 11.0f, 14.0f, 11.0f);
                path5.cubicTo(13.447715f, 11.0f, 13.0f, 10.552285f, 13.0f, 10.0f);
                path5.cubicTo(13.0f, 9.447715f, 13.447715f, 9.0f, 14.0f, 9.0f);
                instancePath4.close();
                canvas.drawPath(instancePath4, instancePaint7);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
