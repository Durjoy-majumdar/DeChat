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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.spinner_white_76_outer_holo */
public class spinner_white_76_outer_holo extends C24542c {
    private final int height = 228;
    private final int width = 228;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 228;
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
        canvas.saveLayerAlpha((RectF) null, 230, 31);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(114.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(176.96046f, 0.0f, 228.0f, 51.03954f, 228.0f, 114.0f);
        path.cubicTo(228.0f, 176.96046f, 176.96046f, 228.0f, 114.0f, 228.0f);
        instancePath.lineTo(114.0f, 208.05f);
        Path path2 = instancePath;
        path2.cubicTo(165.94238f, 208.05f, 208.05f, 165.94238f, 208.05f, 114.0f);
        path2.cubicTo(208.05f, 62.05762f, 165.94238f, 19.95f, 114.0f, 19.95f);
        instancePath.lineTo(114.0f, 0.0f);
        instancePath.close();
        Paint instancePaint4 = C24542c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(Paint.Style.FILL);
        Paint instancePaint5 = C24542c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect((PathEffect) null);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 228.0f, 0.0f, 114.0f, 0.0f, 228.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        Path path3 = instancePath;
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.94086915f, 0.0f, 0.94086915f, 0.90559083f, new int[]{15592941, 1290661357}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        WeChatSVGRenderC2Java.setFillType(path3, 2);
        canvas.drawPath(path3, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint paint = instancePaint;
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(114.0f, 0.0f);
        instancePath2.lineTo(114.0f, 19.95f);
        Path path4 = instancePath2;
        path4.cubicTo(62.05762f, 19.95f, 19.95f, 62.05762f, 19.95f, 114.0f);
        path4.cubicTo(19.95f, 165.94238f, 62.05762f, 208.05f, 114.0f, 208.05f);
        instancePath2.lineTo(114.0f, 228.0f);
        Path path5 = instancePath2;
        path5.cubicTo(51.03954f, 228.0f, 0.0f, 176.96046f, 0.0f, 114.0f);
        path5.cubicTo(0.0f, 51.03954f, 51.03954f, 0.0f, 114.0f, 0.0f);
        instancePath2.close();
        Paint instancePaint7 = C24542c.instancePaint(looper);
        instancePaint7.setFlags(385);
        instancePaint7.setStyle(Paint.Style.FILL);
        Paint instancePaint8 = C24542c.instancePaint(looper);
        instancePaint8.setFlags(385);
        instancePaint8.setStyle(Paint.Style.STROKE);
        instancePaint7.setColor(-16777216);
        instancePaint8.setStrokeWidth(1.0f);
        instancePaint8.setStrokeCap(Paint.Cap.BUTT);
        instancePaint8.setStrokeJoin(Paint.Join.MITER);
        instancePaint8.setStrokeMiter(4.0f);
        instancePaint8.setPathEffect((PathEffect) null);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 114.0f, 0.0f, 0.0f, 0.0f, 228.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        Matrix matrix = instanceMatrix;
        Path path6 = instancePath2;
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint6, 1.0f, 0.08673706f, 1.0f, 0.9062866f, new int[]{-1184275, 1290661357}, new float[]{0.0f, 1.0f}, matrix, 0);
        WeChatSVGRenderC2Java.setFillType(path6, 2);
        canvas.drawPath(path6, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(paint, looper);
        instancePaint9.setColor(-1184275);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(115.425f, 0.0f);
        Path path7 = instancePath3;
        path7.cubicTo(120.934044f, 0.0f, 125.4f, 4.4659595f, 125.4f, 9.975f);
        path7.cubicTo(125.4f, 15.484041f, 120.934044f, 19.95f, 115.425f, 19.95f);
        path7.cubicTo(109.91596f, 19.95f, 105.450005f, 15.484041f, 105.450005f, 9.975f);
        path7.cubicTo(105.450005f, 4.4659595f, 109.91596f, 0.0f, 115.425f, 0.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
