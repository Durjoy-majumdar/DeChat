package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_add_emoji */
public class icons_outlined_add_emoji extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        instancePaint3.setColor(-16777216);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 2.333333f, 0.0f, 1.0f, 2.333333f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(11.666667f, 21.933332f);
        Path path = instancePath;
        path.cubicTo(17.33679f, 21.933332f, 21.933332f, 17.33679f, 21.933332f, 11.666667f);
        path.cubicTo(21.933332f, 5.9965434f, 17.33679f, 1.4f, 11.666667f, 1.4f);
        path.cubicTo(5.9965434f, 1.4f, 1.4f, 5.9965434f, 1.4f, 11.666667f);
        path.cubicTo(1.4f, 17.33679f, 5.9965434f, 21.933332f, 11.666667f, 21.933332f);
        instancePath.close();
        instancePath.moveTo(11.666667f, 23.333334f);
        Path path2 = instancePath;
        path2.cubicTo(5.223345f, 23.333334f, 0.0f, 18.10999f, 0.0f, 11.666667f);
        path2.cubicTo(0.0f, 5.223345f, 5.223345f, 0.0f, 11.666667f, 0.0f);
        path2.cubicTo(18.10999f, 0.0f, 23.333334f, 5.223345f, 23.333334f, 11.666667f);
        path2.cubicTo(23.333334f, 18.10999f, 18.10999f, 23.333334f, 11.666667f, 23.333334f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(11.666667f, 17.85f);
        instancePath2.cubicTo(14.276042f, 17.85f, 16.468582f, 16.065317f, 17.090242f, 13.65f);
        instancePath2.lineTo(6.243091f, 13.65f);
        instancePath2.cubicTo(6.864751f, 16.065317f, 9.057291f, 17.85f, 11.666667f, 17.85f);
        instancePath2.close();
        instancePath2.moveTo(4.6666665f, 12.25f);
        instancePath2.lineTo(18.666666f, 12.25f);
        Path path3 = instancePath2;
        path3.cubicTo(18.666666f, 16.115993f, 15.53266f, 19.25f, 11.666667f, 19.25f);
        path3.cubicTo(7.8006735f, 19.25f, 4.6666665f, 16.115993f, 4.6666665f, 12.25f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(7.5833335f, 9.916667f);
        Path path4 = instancePath3;
        path4.cubicTo(6.616835f, 9.916667f, 5.8333335f, 9.133165f, 5.8333335f, 8.166667f);
        path4.cubicTo(5.8333335f, 7.200168f, 6.616835f, 6.4166665f, 7.5833335f, 6.4166665f);
        path4.cubicTo(8.549831f, 6.4166665f, 9.333333f, 7.200168f, 9.333333f, 8.166667f);
        path4.cubicTo(9.333333f, 9.133165f, 8.549831f, 9.916667f, 7.5833335f, 9.916667f);
        instancePath3.close();
        instancePath3.moveTo(15.75f, 9.916667f);
        Path path5 = instancePath3;
        path5.cubicTo(14.783502f, 9.916667f, 14.0f, 9.133165f, 14.0f, 8.166667f);
        path5.cubicTo(14.0f, 7.200168f, 14.783502f, 6.4166665f, 15.75f, 6.4166665f);
        path5.cubicTo(16.716497f, 6.4166665f, 17.5f, 7.200168f, 17.5f, 8.166667f);
        path5.cubicTo(17.5f, 9.133165f, 16.716497f, 9.916667f, 15.75f, 9.916667f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
