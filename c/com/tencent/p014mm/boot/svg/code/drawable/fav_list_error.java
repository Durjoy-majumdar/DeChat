package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fav_list_error */
public class fav_list_error extends C24542c {
    private final int height = 66;
    private final int width = 66;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 66;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-564640);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(57.0f, 30.37037f);
                Path path = instancePath;
                path.cubicTo(57.0f, 15.087965f, 44.912033f, 3.0f, 29.62963f, 3.0f);
                path.cubicTo(14.985957f, 3.0f, 3.0f, 15.1921425f, 3.0f, 30.37037f);
                path.cubicTo(3.0f, 44.912033f, 15.087965f, 57.0f, 29.62963f, 57.0f);
                path.cubicTo(44.807858f, 57.0f, 57.0f, 45.01404f, 57.0f, 30.37037f);
                instancePath.close();
                instancePath.moveTo(60.0f, 30.37037f);
                Path path2 = instancePath;
                path2.cubicTo(60.0f, 46.56889f, 46.56889f, 60.0f, 29.62963f, 60.0f);
                path2.cubicTo(13.431111f, 60.0f, 0.0f, 46.56889f, 0.0f, 30.37037f);
                path2.cubicTo(0.0f, 13.431111f, 13.431111f, 0.0f, 29.62963f, 0.0f);
                path2.cubicTo(46.56889f, 0.0f, 60.0f, 13.431111f, 60.0f, 30.37037f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(30.0f, 45.0f);
                Path path3 = instancePath2;
                path3.cubicTo(31.656855f, 45.0f, 33.0f, 43.656853f, 33.0f, 42.0f);
                path3.cubicTo(33.0f, 40.343147f, 31.656855f, 39.0f, 30.0f, 39.0f);
                path3.cubicTo(28.343145f, 39.0f, 27.0f, 40.343147f, 27.0f, 42.0f);
                path3.cubicTo(27.0f, 43.656853f, 28.343145f, 45.0f, 30.0f, 45.0f);
                instancePath2.close();
                instancePath2.moveTo(28.498575f, 15.0f);
                path3.cubicTo(27.670935f, 15.0f, 27.032139f, 15.674923f, 27.071115f, 16.493433f);
                instancePath2.lineTo(28.0f, 36.0f);
                instancePath2.lineTo(32.0f, 36.0f);
                instancePath2.lineTo(32.928883f, 16.493433f);
                instancePath2.cubicTo(32.96816f, 15.6686325f, 32.33497f, 15.0f, 31.501425f, 15.0f);
                instancePath2.lineTo(28.498575f, 15.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
