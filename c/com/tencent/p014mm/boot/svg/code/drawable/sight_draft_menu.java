package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sight_draft_menu */
public class sight_draft_menu extends C24542c {
    private final int height = 12;
    private final int width = 64;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 64;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-2565928);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(6.0f, 12.0f);
        Path path = instancePath;
        instancePath.cubicTo(9.313708f, 12.0f, 12.0f, 9.313708f, 12.0f, 6.0f);
        Path path2 = path;
        path2.cubicTo(12.0f, 2.6862915f, 9.313708f, 0.0f, 6.0f, 0.0f);
        path2.cubicTo(2.6862915f, 0.0f, 0.0f, 2.6862915f, 0.0f, 6.0f);
        path2.cubicTo(0.0f, 9.313708f, 2.6862915f, 12.0f, 6.0f, 12.0f);
        path.close();
        Path path3 = path;
        path3.moveTo(32.0f, 12.0f);
        path3.cubicTo(35.31371f, 12.0f, 38.0f, 9.313708f, 38.0f, 6.0f);
        Path path4 = path;
        path4.cubicTo(38.0f, 2.6862915f, 35.31371f, 0.0f, 32.0f, 0.0f);
        path4.cubicTo(28.68629f, 0.0f, 26.0f, 2.6862915f, 26.0f, 6.0f);
        path4.cubicTo(26.0f, 9.313708f, 28.68629f, 12.0f, 32.0f, 12.0f);
        path.close();
        Path path5 = path;
        path5.moveTo(58.0f, 12.0f);
        path5.cubicTo(61.31371f, 12.0f, 64.0f, 9.313708f, 64.0f, 6.0f);
        Path path6 = path;
        path6.cubicTo(64.0f, 2.6862915f, 61.31371f, 0.0f, 58.0f, 0.0f);
        path6.cubicTo(54.68629f, 0.0f, 52.0f, 2.6862915f, 52.0f, 6.0f);
        path6.cubicTo(52.0f, 9.313708f, 54.68629f, 12.0f, 58.0f, 12.0f);
        path.close();
        WeChatSVGRenderC2Java.setFillType(path6, 2);
        canvas.drawPath(path6, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(6.0f, 12.0f);
        Path path7 = instancePath2;
        path7.cubicTo(9.313708f, 12.0f, 12.0f, 9.313708f, 12.0f, 6.0f);
        path7.cubicTo(12.0f, 2.6862915f, 9.313708f, 0.0f, 6.0f, 0.0f);
        path7.cubicTo(2.6862915f, 0.0f, 0.0f, 2.6862915f, 0.0f, 6.0f);
        path7.cubicTo(0.0f, 9.313708f, 2.6862915f, 12.0f, 6.0f, 12.0f);
        instancePath2.close();
        instancePath2.moveTo(32.0f, 12.0f);
        path7.cubicTo(35.31371f, 12.0f, 38.0f, 9.313708f, 38.0f, 6.0f);
        path7.cubicTo(38.0f, 2.6862915f, 35.31371f, 0.0f, 32.0f, 0.0f);
        path7.cubicTo(28.68629f, 0.0f, 26.0f, 2.6862915f, 26.0f, 6.0f);
        path7.cubicTo(26.0f, 9.313708f, 28.68629f, 12.0f, 32.0f, 12.0f);
        instancePath2.close();
        instancePath2.moveTo(58.0f, 12.0f);
        path7.cubicTo(61.31371f, 12.0f, 64.0f, 9.313708f, 64.0f, 6.0f);
        path7.cubicTo(64.0f, 2.6862915f, 61.31371f, 0.0f, 58.0f, 0.0f);
        path7.cubicTo(54.68629f, 0.0f, 52.0f, 2.6862915f, 52.0f, 6.0f);
        path7.cubicTo(52.0f, 9.313708f, 54.68629f, 12.0f, 58.0f, 12.0f);
        instancePath2.close();
        Paint instancePaint6 = C24542c.instancePaint(looper);
        instancePaint6.setFlags(385);
        instancePaint6.setStyle(Paint.Style.FILL);
        Paint instancePaint7 = C24542c.instancePaint(looper);
        instancePaint7.setFlags(385);
        instancePaint7.setStyle(Paint.Style.STROKE);
        instancePaint6.setColor(-16777216);
        instancePaint7.setStrokeWidth(1.0f);
        instancePaint7.setStrokeCap(Paint.Cap.BUTT);
        instancePaint7.setStrokeJoin(Paint.Join.MITER);
        instancePaint7.setStrokeMiter(4.0f);
        instancePaint7.setPathEffect((PathEffect) null);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 64.0f, 0.0f, 0.0f, 0.0f, 12.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        Path path8 = instancePath2;
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint5, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-6556649, -9903790}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        WeChatSVGRenderC2Java.setFillType(path8, 2);
        canvas.drawPath(path8, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
