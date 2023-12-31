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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.appbrand_menu_header_lbs */
public class appbrand_menu_header_lbs extends C24542c {
    private final int height = 12;
    private final int width = 11;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 11;
        }
        if (i2 == 1) {
            return 12;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -286.0f, 0.0f, 1.0f, -423.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 279.0f, 0.0f, 1.0f, 417.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 1.0f);
        instancePath.lineTo(14.0f, 1.0f);
        instancePath.lineTo(14.0f, 15.0f);
        instancePath.lineTo(0.0f, 15.0f);
        instancePath.lineTo(0.0f, 1.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint4, looper));
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 0.70710677f, -0.70710677f, 7.0931454f, 0.70710677f, 0.70710677f, -3.6893396f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(8.323189f, 1.4547651f);
        instancePath2.lineTo(11.987649f, 11.762449f);
        Path path = instancePath2;
        path.cubicTo(12.051114f, 11.940967f, 11.957845f, 12.137132f, 11.779327f, 12.200596f);
        path.cubicTo(11.673446f, 12.238238f, 11.555841f, 12.221637f, 11.464518f, 12.156157f);
        instancePath2.lineTo(7.999954f, 9.672035f);
        instancePath2.lineTo(7.999954f, 9.672035f);
        instancePath2.lineTo(4.535392f, 12.156157f);
        Path path2 = instancePath2;
        path2.cubicTo(4.3814178f, 12.266557f, 4.1671f, 12.231234f, 4.0566998f, 12.07726f);
        path2.cubicTo(3.9912193f, 11.985935f, 3.9746175f, 11.868331f, 4.0122595f, 11.762449f);
        instancePath2.lineTo(7.6767197f, 1.4547651f);
        path2.cubicTo(7.7401843f, 1.2762476f, 7.9363494f, 1.1829786f, 8.114866f, 1.2464429f);
        path2.cubicTo(8.212108f, 1.2810129f, 8.288619f, 1.3575239f, 8.323189f, 1.4547651f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
