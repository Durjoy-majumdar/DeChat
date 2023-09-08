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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.new_voice2txt_voice */
public class new_voice2txt_voice extends C24542c {
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
                canvas.saveLayerAlpha((RectF) null, 231, 31);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.restore();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(19.333334f, 12.0f);
                instancePath2.cubicTo(19.333334f, 16.165592f, 17.691711f, 19.936829f, 15.037566f, 22.666666f);
                instancePath2.lineTo(13.481931f, 21.066668f);
                Path path = instancePath2;
                path.cubicTo(15.737954f, 18.746304f, 17.133333f, 15.540753f, 17.133333f, 12.0f);
                path.cubicTo(17.133333f, 8.459247f, 15.737954f, 5.2536955f, 13.481931f, 2.9333334f);
                instancePath2.lineTo(15.037566f, 1.3333334f);
                instancePath2.cubicTo(17.691711f, 4.0631714f, 19.333334f, 7.8344073f, 19.333334f, 12.0f);
                instancePath2.close();
                instancePath2.moveTo(14.2f, 12.0f);
                instancePath2.cubicTo(14.2f, 14.707635f, 13.132945f, 17.15894f, 11.407751f, 18.933332f);
                instancePath2.lineTo(9.852117f, 17.333334f);
                Path path2 = instancePath2;
                path2.cubicTo(11.179189f, 15.968414f, 12.0f, 14.082796f, 12.0f, 12.0f);
                path2.cubicTo(12.0f, 9.917204f, 11.179189f, 8.031586f, 9.852117f, 6.6666665f);
                instancePath2.lineTo(11.407751f, 5.0666666f);
                instancePath2.cubicTo(13.132945f, 6.8410616f, 14.2f, 9.292365f, 14.2f, 12.0f);
                instancePath2.close();
                instancePath2.moveTo(7.7779365f, 8.8f);
                Path path3 = instancePath2;
                path3.cubicTo(8.57418f, 9.618952f, 9.066667f, 10.750322f, 9.066667f, 12.0f);
                path3.cubicTo(9.066667f, 13.249425f, 8.57438f, 14.38059f, 7.7784204f, 15.199502f);
                instancePath2.lineTo(4.6666665f, 12.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
