package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_black */
public class icons_filled_black extends C24542c {
    private final int height = 20;
    private final int width = 20;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 20;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(10.0f, 1.6666666f);
        Path path = instancePath;
        instancePath.cubicTo(14.602373f, 1.6666666f, 18.333334f, 5.397627f, 18.333334f, 10.0f);
        Path path2 = path;
        path2.cubicTo(18.333334f, 14.602373f, 14.602373f, 18.333334f, 10.0f, 18.333334f);
        path2.cubicTo(5.397627f, 18.333334f, 1.6666666f, 14.602373f, 1.6666666f, 10.0f);
        path2.cubicTo(1.6666666f, 5.397627f, 5.397627f, 1.6666666f, 10.0f, 1.6666666f);
        path.close();
        Path path3 = path;
        path3.moveTo(10.0f, 3.3333333f);
        path3.cubicTo(6.318102f, 3.3333333f, 3.3333333f, 6.318102f, 3.3333333f, 10.0f);
        Path path4 = path;
        path4.cubicTo(3.3333333f, 13.681898f, 6.318102f, 16.666666f, 10.0f, 16.666666f);
        path4.cubicTo(13.681898f, 16.666666f, 16.666666f, 13.681898f, 16.666666f, 10.0f);
        path4.cubicTo(16.666666f, 6.318102f, 13.681898f, 3.3333333f, 10.0f, 3.3333333f);
        path.close();
        Path path5 = path;
        WeChatSVGRenderC2Java.setFillType(path5, 2);
        canvas.drawPath(path5, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -0.70710677f, 0.70710677f, 10.0f, 0.70710677f, 0.70710677f, -4.1421356f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(9.004842f, 2.207901f);
        instancePath2.lineTo(11.0f, 2.2112734f);
        instancePath2.lineTo(10.995158f, 17.792099f);
        instancePath2.lineTo(9.0f, 17.788727f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
