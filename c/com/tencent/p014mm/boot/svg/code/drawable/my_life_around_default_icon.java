package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.my_life_around_default_icon */
public class my_life_around_default_icon extends C24542c {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-372399);
            instancePaint4.setStrokeWidth(3.7565217f);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 13.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(33.423096f, 23.393011f);
            Path path = instancePath;
            path.cubicTo(33.423096f, 28.885603f, 28.958527f, 33.335987f, 23.453514f, 33.335987f);
            path.cubicTo(17.946226f, 33.335987f, 13.483933f, 28.885603f, 13.483933f, 23.393011f);
            path.cubicTo(13.483933f, 17.90042f, 17.946226f, 13.450035f, 23.453514f, 13.450035f);
            path.cubicTo(28.958527f, 13.450035f, 33.423096f, 17.90042f, 33.423096f, 23.393011f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            instancePaint6.setStrokeJoin(Paint.Join.MITER);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(36.644825f, 43.30803f);
            instancePath2.lineTo(23.453743f, 56.466183f);
            instancePath2.lineTo(14.822849f, 47.85832f);
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.save();
            Paint instancePaint7 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(40.033207f, 39.928688f);
            Path path2 = instancePath3;
            path2.cubicTo(49.190014f, 30.796316f, 49.190014f, 15.989706f, 40.033207f, 6.857335f);
            path2.cubicTo(30.876402f, -2.275036f, 16.030172f, -2.275036f, 6.873366f, 6.857335f);
            path2.cubicTo(-2.2834404f, 15.989706f, -2.2834404f, 30.796316f, 6.873366f, 39.928688f);
            instancePath3.lineTo(11.679438f, 44.721935f);
            canvas.drawPath(instancePath3, instancePaint7);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
