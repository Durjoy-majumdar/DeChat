package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icon_video_playlist */
public class finder_icon_video_playlist extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 16;
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
        instancePaint3.setColor(-1946157056);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 1.666667f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(10.666667f, 1.6666666f);
        instancePath.cubicTo(11.403047f, 1.6666666f, 12.0f, 2.2636204f, 12.0f, 3.0f);
        instancePath.lineTo(12.0f, 11.666667f);
        instancePath.cubicTo(12.0f, 12.403047f, 11.403047f, 13.0f, 10.666667f, 13.0f);
        instancePath.lineTo(1.3333334f, 13.0f);
        instancePath.cubicTo(0.5969537f, 13.0f, 0.0f, 12.403047f, 0.0f, 11.666667f);
        instancePath.lineTo(0.0f, 3.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 2.2636204f, 0.5969537f, 1.6666666f, 1.3333334f, 1.6666666f);
        instancePath.lineTo(10.666667f, 1.6666666f);
        instancePath.close();
        instancePath.moveTo(10.666667f, 2.4666667f);
        instancePath.lineTo(1.3333334f, 2.4666667f);
        path.cubicTo(1.0614393f, 2.4666667f, 0.83706564f, 2.6701255f, 0.8041554f, 2.9330997f);
        instancePath.lineTo(0.8f, 3.0f);
        instancePath.lineTo(0.8f, 11.666667f);
        path.cubicTo(0.8f, 11.9385605f, 1.0034587f, 12.162934f, 1.2664331f, 12.195845f);
        instancePath.lineTo(1.3333334f, 12.2f);
        instancePath.lineTo(10.666667f, 12.2f);
        Path path2 = instancePath;
        path2.cubicTo(10.9385605f, 12.2f, 11.162934f, 11.996541f, 11.195845f, 11.733567f);
        instancePath.lineTo(11.2f, 11.666667f);
        instancePath.lineTo(11.2f, 3.0f);
        path2.cubicTo(11.2f, 2.728106f, 10.996541f, 2.5037322f, 10.733567f, 2.470822f);
        instancePath.lineTo(10.666667f, 2.4666667f);
        instancePath.close();
        instancePath.moveTo(5.0f, 4.9561725f);
        path2.cubicTo(5.0658083f, 4.9561725f, 5.130144f, 4.9756517f, 5.1849003f, 5.0121555f);
        instancePath.lineTo(8.250642f, 7.055983f);
        path2.cubicTo(8.403818f, 7.1581006f, 8.4452095f, 7.365057f, 8.343092f, 7.5182333f);
        path2.cubicTo(8.31868f, 7.554851f, 8.287259f, 7.586272f, 8.250642f, 7.6106834f);
        instancePath.lineTo(5.1849003f, 9.654511f);
        path2.cubicTo(5.031724f, 9.756629f, 4.8247676f, 9.715238f, 4.72265f, 9.562061f);
        path2.cubicTo(4.686146f, 9.507305f, 4.6666665f, 9.442969f, 4.6666665f, 9.377161f);
        instancePath.lineTo(4.6666665f, 5.2895055f);
        path2.cubicTo(4.6666665f, 5.1054106f, 4.815905f, 4.9561725f, 5.0f, 4.9561725f);
        instancePath.close();
        instancePath.moveTo(10.266666f, 4.440892E-16f);
        path2.cubicTo(10.48758f, 4.440892E-16f, 10.666667f, 0.1790861f, 10.666667f, 0.4f);
        path2.cubicTo(10.666667f, 0.6209139f, 10.48758f, 0.8f, 10.266666f, 0.8f);
        instancePath.lineTo(1.7333333f, 0.8f);
        Path path3 = instancePath;
        path3.cubicTo(1.5124195f, 0.8f, 1.3333334f, 0.6209139f, 1.3333334f, 0.4f);
        path3.cubicTo(1.3333334f, 0.1790861f, 1.5124195f, 4.440892E-16f, 1.7333333f, 4.440892E-16f);
        instancePath.lineTo(10.266666f, 4.440892E-16f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
