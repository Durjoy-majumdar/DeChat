package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.note_ol_unpress */
public class note_ol_unpress extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 144;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-855638017);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 26.584616f);
        Path path = instancePath;
        path.cubicTo(0.0f, 11.902337f, 11.902337f, 0.0f, 26.584616f, 0.0f);
        instancePath.lineTo(117.41538f, 0.0f);
        path.cubicTo(132.09766f, 0.0f, 144.0f, 11.902337f, 144.0f, 26.584616f);
        instancePath.lineTo(144.0f, 117.41538f);
        path.cubicTo(144.0f, 132.09766f, 132.09766f, 144.0f, 117.41538f, 144.0f);
        instancePath.lineTo(26.584616f, 144.0f);
        path.cubicTo(11.902337f, 144.0f, 0.0f, 132.09766f, 0.0f, 117.41538f);
        instancePath.lineTo(0.0f, 26.584616f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint paint = instancePaint3;
        Paint paint2 = instancePaint;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 41.446156f, 0.0f, 1.0f, 43.661537f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(3.1015384f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(17.944616f, 9.969231f);
        instancePath2.lineTo(61.80923f, 9.969231f);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(paint, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeWidth(3.1015384f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(17.944616f, 29.907692f);
        instancePath3.lineTo(61.80923f, 29.907692f);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(paint, looper);
        instancePaint8.setColor(-16777216);
        instancePaint8.setStrokeWidth(3.1015384f);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(17.944616f, 49.846153f);
        instancePath4.lineTo(61.80923f, 49.846153f);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        Paint instancePaint9 = C24542c.instancePaint(paint2, looper);
        instancePaint9.setColor(-16777216);
        canvas.save();
        Paint instancePaint10 = C24542c.instancePaint(instancePaint9, looper);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(3.6060576f, 15.0f);
        instancePath5.lineTo(3.6060576f, 5.918654f);
        instancePath5.lineTo(3.559327f, 5.918654f);
        instancePath5.lineTo(0.69317305f, 7.896923f);
        instancePath5.lineTo(0.69317305f, 5.7784615f);
        instancePath5.lineTo(3.5982692f, 3.76125f);
        instancePath5.lineTo(5.934808f, 3.76125f);
        instancePath5.lineTo(5.934808f, 15.0f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint10);
        canvas.restore();
        Paint instancePaint11 = C24542c.instancePaint(paint2, looper);
        instancePaint11.setColor(-16777216);
        canvas.save();
        Paint instancePaint12 = C24542c.instancePaint(instancePaint11, looper);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(3.6060576f, 15.0f);
        instancePath6.lineTo(3.6060576f, 5.918654f);
        instancePath6.lineTo(3.559327f, 5.918654f);
        instancePath6.lineTo(0.69317305f, 7.896923f);
        instancePath6.lineTo(0.69317305f, 5.7784615f);
        instancePath6.lineTo(3.5982692f, 3.76125f);
        instancePath6.lineTo(5.934808f, 3.76125f);
        instancePath6.lineTo(5.934808f, 15.0f);
        instancePath6.close();
        WeChatSVGRenderC2Java.setFillType(instancePath6, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath6, 2);
        canvas.drawPath(instancePath6, instancePaint12);
        canvas.restore();
        canvas.save();
        Paint instancePaint13 = C24542c.instancePaint(paint2, looper);
        instancePaint13.setColor(-16777216);
        Path instancePath7 = C24542c.instancePath(looper);
        instancePath7.moveTo(0.66201925f, 27.079905f);
        Path path2 = instancePath7;
        path2.cubicTo(0.66201925f, 24.953653f, 2.3599038f, 23.450481f, 4.813269f, 23.450481f);
        path2.cubicTo(7.1809616f, 23.450481f, 8.80875f, 24.82125f, 8.80875f, 26.698269f);
        path2.cubicTo(8.80875f, 28.100193f, 7.8741345f, 29.151634f, 6.6357694f, 30.382212f);
        instancePath7.lineTo(3.8942308f, 33.0225f);
        instancePath7.lineTo(3.8942308f, 33.06923f);
        instancePath7.lineTo(8.9645195f, 33.06923f);
        instancePath7.lineTo(8.9645195f, 34.93846f);
        instancePath7.lineTo(0.7944231f, 34.93846f);
        instancePath7.lineTo(0.7944231f, 33.357403f);
        instancePath7.lineTo(5.0313463f, 29.27625f);
        Path path3 = instancePath7;
        path3.cubicTo(6.1684613f, 28.139135f, 6.5189424f, 27.570578f, 6.5189424f, 26.79173f);
        path3.cubicTo(6.5189424f, 25.950577f, 5.7790384f, 25.28077f, 4.7353845f, 25.28077f);
        path3.cubicTo(3.645f, 25.28077f, 2.8427885f, 26.044039f, 2.8427885f, 27.079905f);
        instancePath7.lineTo(2.8427885f, 27.118847f);
        instancePath7.lineTo(0.66201925f, 27.118847f);
        instancePath7.lineTo(0.66201925f, 27.079905f);
        instancePath7.close();
        WeChatSVGRenderC2Java.setFillType(instancePath7, 2);
        canvas.drawPath(instancePath7, instancePaint13);
        canvas.restore();
        canvas.save();
        Paint instancePaint14 = C24542c.instancePaint(paint2, looper);
        instancePaint14.setColor(-16777216);
        Path instancePath8 = C24542c.instancePath(looper);
        instancePath8.moveTo(3.528173f, 49.970192f);
        instancePath8.lineTo(3.528173f, 48.27231f);
        instancePath8.lineTo(4.891154f, 48.27231f);
        Path path4 = instancePath8;
        path4.cubicTo(5.9659615f, 48.27231f, 6.6902885f, 47.633656f, 6.6902885f, 46.706825f);
        path4.cubicTo(6.6902885f, 45.795578f, 6.043846f, 45.195866f, 4.875577f, 45.195866f);
        path4.cubicTo(3.7851923f, 45.195866f, 3.0608654f, 45.842308f, 2.9985578f, 46.823654f);
        instancePath8.lineTo(0.8333654f, 46.823654f);
        Path path5 = instancePath8;
        path5.cubicTo(0.9190385f, 44.744133f, 2.5390384f, 43.388943f, 4.976827f, 43.388943f);
        path5.cubicTo(7.3133655f, 43.388943f, 8.91f, 44.588364f, 8.91f, 46.3875f);
        path5.cubicTo(8.91f, 47.766056f, 7.967596f, 48.76298f, 6.5890384f, 49.01221f);
        instancePath8.lineTo(6.5890384f, 49.05894f);
        Path path6 = instancePath8;
        path6.cubicTo(8.263557f, 49.199135f, 9.346154f, 50.211636f, 9.346154f, 51.769325f);
        path6.cubicTo(9.346154f, 53.786537f, 7.5158653f, 55.126152f, 4.9223075f, 55.126152f);
        path6.cubicTo(2.3832693f, 55.126152f, 0.7243269f, 53.732018f, 0.61528844f, 51.66029f);
        instancePath8.lineTo(2.866154f, 51.66029f);
        Path path7 = instancePath8;
        path7.cubicTo(2.93625f, 52.61048f, 3.7150962f, 53.23356f, 4.9534616f, 53.23356f);
        path7.cubicTo(6.1295195f, 53.23356f, 6.9550962f, 52.571537f, 6.9550962f, 51.621346f);
        path7.cubicTo(6.9550962f, 50.59327f, 6.1840386f, 49.970192f, 4.9145193f, 49.970192f);
        instancePath8.lineTo(3.528173f, 49.970192f);
        instancePath8.close();
        WeChatSVGRenderC2Java.setFillType(instancePath8, 2);
        canvas.drawPath(instancePath8, instancePaint14);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
