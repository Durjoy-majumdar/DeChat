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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.brand_100_loading_60_60 */
public class brand_100_loading_60_60 extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 60;
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
        instancePath.moveTo(30.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
        path.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
        instancePath.lineTo(30.0f, 54.75f);
        Path path2 = instancePath;
        path2.cubicTo(43.66905f, 54.75f, 54.75f, 43.66905f, 54.75f, 30.0f);
        path2.cubicTo(54.75f, 16.330952f, 43.66905f, 5.25f, 30.0f, 5.25f);
        instancePath.lineTo(30.0f, 0.0f);
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 60.0f, 0.0f, 30.0f, 0.0f, 60.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        Path path3 = instancePath;
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.94086915f, 0.0f, 0.94086915f, 0.90559083f, new int[]{508256, 1275576672}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        WeChatSVGRenderC2Java.setFillType(path3, 2);
        canvas.drawPath(path3, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint paint = instancePaint;
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(30.0f, 0.0f);
        instancePath2.lineTo(30.0f, 5.25f);
        Path path4 = instancePath2;
        path4.cubicTo(16.330952f, 5.25f, 5.25f, 16.330952f, 5.25f, 30.0f);
        path4.cubicTo(5.25f, 43.66905f, 16.330952f, 54.75f, 30.0f, 54.75f);
        instancePath2.lineTo(30.0f, 60.0f);
        Path path5 = instancePath2;
        path5.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
        path5.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
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
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 30.0f, 0.0f, 0.0f, 0.0f, 60.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        Matrix matrix = instanceMatrix;
        Path path6 = instancePath2;
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint6, 1.0f, 0.08673706f, 1.0f, 0.9062866f, new int[]{-16268960, 1275576672}, new float[]{0.0f, 1.0f}, matrix, 0);
        WeChatSVGRenderC2Java.setFillType(path6, 2);
        canvas.drawPath(path6, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(paint, looper);
        instancePaint9.setColor(-16268960);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(30.375f, 0.0f);
        Path path7 = instancePath3;
        path7.cubicTo(31.824747f, 0.0f, 33.0f, 1.1752524f, 33.0f, 2.625f);
        path7.cubicTo(33.0f, 4.0747476f, 31.824747f, 5.25f, 30.375f, 5.25f);
        path7.cubicTo(28.925253f, 5.25f, 27.75f, 4.0747476f, 27.75f, 2.625f);
        path7.cubicTo(27.75f, 1.1752524f, 28.925253f, 0.0f, 30.375f, 0.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
