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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_open */
public class icons_filled_open extends C24542c {
    private final int height = 70;
    private final int width = 70;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 70;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 3.5f, 0.0f, 0.0f, 0.0f, 3.5f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-2565928);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(20.0f, 0.0f);
        instancePath.lineTo(20.0f, 20.0f);
        instancePath.lineTo(0.0f, 20.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(9.833333f, 17.666666f);
        Path path = instancePath2;
        path.cubicTo(5.2309604f, 17.666666f, 1.5f, 13.935706f, 1.5f, 9.333333f);
        path.cubicTo(1.5f, 4.7309604f, 5.2309604f, 1.0f, 9.833333f, 1.0f);
        path.cubicTo(14.435706f, 1.0f, 18.166666f, 4.7309604f, 18.166666f, 9.333333f);
        path.cubicTo(18.166666f, 13.935706f, 14.435706f, 17.666666f, 9.833333f, 17.666666f);
        instancePath2.close();
        instancePath2.moveTo(13.514844f, 11.364062f);
        instancePath2.lineTo(13.514844f, 6.6742187f);
        Path path2 = instancePath2;
        path2.cubicTo(13.514844f, 6.463281f, 13.45f, 6.2921877f, 13.3203125f, 6.1609373f);
        path2.cubicTo(13.190625f, 6.0296874f, 13.017969f, 5.9640627f, 12.802343f, 5.9640627f);
        instancePath2.lineTo(8.110156f, 5.9640627f);
        Path path3 = instancePath2;
        path3.cubicTo(7.9101562f, 5.9640627f, 7.74375f, 6.0296874f, 7.6109376f, 6.1609373f);
        path3.cubicTo(7.478125f, 6.2921877f, 7.411719f, 6.4484377f, 7.411719f, 6.6296873f);
        path3.cubicTo(7.411719f, 6.809375f, 7.4792967f, 6.9617186f, 7.6144533f, 7.0867186f);
        path3.cubicTo(7.7496095f, 7.2117186f, 7.9125f, 7.2742186f, 8.103125f, 7.2742186f);
        instancePath2.lineTo(11.384375f, 7.2742186f);
        instancePath2.lineTo(6.422656f, 12.092969f);
        Path path4 = instancePath2;
        path4.cubicTo(6.271094f, 12.247656f, 6.1953125f, 12.414844f, 6.1953125f, 12.594531f);
        path4.cubicTo(6.1953125f, 12.711719f, 6.2277346f, 12.823047f, 6.292578f, 12.928515f);
        path4.cubicTo(6.357422f, 13.033984f, 6.441797f, 13.119141f, 6.545703f, 13.183985f);
        path4.cubicTo(6.6496096f, 13.248828f, 6.7617188f, 13.28125f, 6.8820314f, 13.28125f);
        path4.cubicTo(7.063281f, 13.28125f, 7.2304688f, 13.205469f, 7.3835936f, 13.053906f);
        instancePath2.lineTo(12.202344f, 8.089844f);
        instancePath2.lineTo(12.202344f, 11.371094f);
        Path path5 = instancePath2;
        path5.cubicTo(12.202344f, 11.563281f, 12.264063f, 11.7269535f, 12.3875f, 11.862109f);
        path5.cubicTo(12.510938f, 11.997266f, 12.6640625f, 12.064844f, 12.846875f, 12.064844f);
        path5.cubicTo(13.029688f, 12.064844f, 13.186719f, 11.997266f, 13.317968f, 11.862109f);
        path5.cubicTo(13.449219f, 11.7269535f, 13.514844f, 11.560938f, 13.514844f, 11.364062f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
