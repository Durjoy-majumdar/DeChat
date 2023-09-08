package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_video_play_btn_play */
public class app_brand_video_play_btn_play extends C24542c {
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
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -60.0f, 0.0f, 1.0f, -60.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 60.0f, 0.0f, 1.0f, 60.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(20.292746f, 12.457271f);
                instancePath2.lineTo(5.766108f, 21.589363f);
                Path path = instancePath2;
                path.cubicTo(5.5323234f, 21.73633f, 5.223663f, 21.66595f, 5.0766954f, 21.432167f);
                path.cubicTo(5.026585f, 21.352453f, 5.0f, 21.260212f, 5.0f, 21.166058f);
                instancePath2.lineTo(5.0f, 2.9018748f);
                Path path2 = instancePath2;
                path2.cubicTo(5.0f, 2.6257324f, 5.2238574f, 2.4018748f, 5.5f, 2.4018748f);
                path2.cubicTo(5.594155f, 2.4018748f, 5.6863956f, 2.42846f, 5.766108f, 2.4785705f);
                instancePath2.lineTo(20.292746f, 11.610662f);
                Path path3 = instancePath2;
                path3.cubicTo(20.52653f, 11.757629f, 20.596909f, 12.06629f, 20.449942f, 12.300075f);
                path3.cubicTo(20.410004f, 12.3636055f, 20.356277f, 12.417333f, 20.292746f, 12.457271f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
