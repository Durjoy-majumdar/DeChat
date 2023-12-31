package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ofm_add_icon */
public class ofm_add_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 20.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(23.0f, 1.0f);
        Path path = instancePath;
        path.cubicTo(28.777954f, -1.1186252f, 35.400658f, 0.56103134f, 39.0f, 5.0f);
        path.cubicTo(41.067303f, 8.92932f, 40.778492f, 13.488388f, 41.0f, 18.0f);
        path.cubicTo(40.1212f, 22.556534f, 36.277046f, 26.055819f, 35.0f, 30.0f);
        path.cubicTo(33.618004f, 32.64447f, 35.0023f, 34.973995f, 37.0f, 36.0f);
        path.cubicTo(42.451595f, 39.88299f, 48.875122f, 42.39248f, 54.0f, 47.0f);
        path.cubicTo(56.603268f, 49.061115f, 57.0813f, 55.329834f, 53.0f, 56.0f);
        path.cubicTo(36.585773f, 56.069683f, 20.273008f, 55.959705f, 4.0f, 56.0f);
        path.cubicTo(-0.89972633f, 56.339626f, -0.93956214f, 49.261074f, 2.0f, 47.0f);
        path.cubicTo(7.226779f, 42.172523f, 14.028744f, 39.73302f, 20.0f, 36.0f);
        path.cubicTo(21.796728f, 34.26414f, 22.314592f, 31.33474f, 21.0f, 29.0f);
        path.cubicTo(18.45052f, 24.816072f, 14.805542f, 20.506954f, 15.0f, 15.0f);
        path.cubicTo(14.566527f, 9.139277f, 17.364994f, 2.430649f, 23.0f, 1.0f);
        instancePath.lineTo(23.0f, 1.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(59.0f, 14.0f);
        Path path2 = instancePath2;
        path2.cubicTo(59.550797f, 11.291986f, 64.49609f, 11.311896f, 65.0f, 14.0f);
        path2.cubicTo(65.09821f, 17.404175f, 64.91067f, 20.709135f, 65.0f, 24.0f);
        path2.cubicTo(68.60236f, 24.073826f, 72.244705f, 23.884686f, 76.0f, 24.0f);
        path2.cubicTo(77.397285f, 25.348026f, 77.338066f, 28.59326f, 76.0f, 30.0f);
        path2.cubicTo(72.26445f, 30.11633f, 68.612236f, 29.92719f, 65.0f, 30.0f);
        path2.cubicTo(64.91067f, 33.321743f, 65.108086f, 36.65657f, 65.0f, 40.0f);
        path2.cubicTo(64.357895f, 42.699074f, 59.540924f, 42.66921f, 59.0f, 40.0f);
        path2.cubicTo(58.89932f, 36.606796f, 59.106606f, 33.291878f, 59.0f, 30.0f);
        path2.cubicTo(55.40504f, 29.92719f, 51.762695f, 30.11633f, 48.0f, 30.0f);
        path2.cubicTo(46.659466f, 28.662943f, 46.56076f, 25.20866f, 48.0f, 24.0f);
        path2.cubicTo(51.81205f, 23.874731f, 55.43465f, 24.073826f, 59.0f, 24.0f);
        path2.cubicTo(59.106606f, 20.709135f, 58.90919f, 17.39422f, 59.0f, 14.0f);
        instancePath2.lineTo(59.0f, 14.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
