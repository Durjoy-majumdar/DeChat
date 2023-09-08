package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_rec_card_close_icon */
public class biz_rec_card_close_icon extends C24542c {
    private final int height = 14;
    private final int width = 22;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 22;
        }
        if (i2 == 1) {
            return 14;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(13.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(16.865993f, 0.0f, 20.0f, 3.1340067f, 20.0f, 7.0f);
        path.cubicTo(20.0f, 10.8659935f, 16.865993f, 14.0f, 13.0f, 14.0f);
        instancePath.lineTo(7.0f, 14.0f);
        Path path2 = instancePath;
        path2.cubicTo(3.1340067f, 14.0f, 0.0f, 10.8659935f, 0.0f, 7.0f);
        path2.cubicTo(0.0f, 3.1340067f, 3.1340067f, 0.0f, 7.0f, 0.0f);
        instancePath.lineTo(13.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(13.0f, 0.5f);
        instancePath.lineTo(7.0f, 0.5f);
        path2.cubicTo(3.410149f, 0.5f, 0.5f, 3.410149f, 0.5f, 7.0f);
        path2.cubicTo(0.5f, 10.51181f, 3.2849963f, 13.373151f, 6.7668657f, 13.495897f);
        instancePath.lineTo(7.0f, 13.5f);
        instancePath.lineTo(13.0f, 13.5f);
        Path path3 = instancePath;
        path3.cubicTo(16.589851f, 13.5f, 19.5f, 10.58985f, 19.5f, 7.0f);
        path3.cubicTo(19.5f, 3.4881895f, 16.715004f, 0.6268495f, 13.233134f, 0.504103f);
        instancePath.lineTo(13.0f, 0.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(12.353554f, 4.0202203f);
        instancePath2.lineTo(13.02022f, 4.686887f);
        instancePath2.lineTo(10.686f, 7.02f);
        instancePath2.lineTo(13.02022f, 9.353554f);
        instancePath2.lineTo(12.353554f, 10.02022f);
        instancePath2.lineTo(10.02f, 7.686f);
        instancePath2.lineTo(7.686887f, 10.02022f);
        instancePath2.lineTo(7.0202203f, 9.353554f);
        instancePath2.lineTo(9.353f, 7.02f);
        instancePath2.lineTo(7.0202203f, 4.686887f);
        instancePath2.lineTo(7.686887f, 4.0202203f);
        instancePath2.lineTo(10.02f, 6.353f);
        instancePath2.lineTo(12.353554f, 4.0202203f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
