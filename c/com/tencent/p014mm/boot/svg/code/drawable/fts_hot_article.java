package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fts_hot_article */
public class fts_hot_article extends C24542c {
    private final int height = 76;
    private final int width = 76;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 76;
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
        instancePaint3.setColor(-11184811);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -529.0f, 0.0f, 1.0f, -427.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 534.0f, 0.0f, 1.0f, 434.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(64.0f, 10.0f);
        instancePath.lineTo(64.0f, 10.0f);
        Path path = instancePath;
        path.cubicTo(64.0f, 9.882686f, 63.991978f, 9.8073f, 63.984455f, 9.774971f);
        path.cubicTo(63.995667f, 9.823138f, 64.027534f, 9.904926f, 64.09329f, 10.0147295f);
        path.cubicTo(64.411995f, 10.546919f, 65.079636f, 11.0f, 66.0f, 11.0f);
        instancePath.lineTo(56.0f, 11.0f);
        instancePath.lineTo(59.0f, 8.0f);
        instancePath.lineTo(59.0f, 58.0f);
        Path path2 = instancePath;
        path2.cubicTo(59.0f, 58.130436f, 59.051327f, 58.22705f, 59.27441f, 58.38821f);
        path2.cubicTo(59.773357f, 58.748653f, 60.693993f, 59.0f, 62.0f, 59.0f);
        path2.cubicTo(63.33438f, 59.0f, 64.0f, 58.45092f, 64.0f, 58.0f);
        instancePath.lineTo(64.0f, 10.0f);
        instancePath.close();
        instancePath.moveTo(67.0f, 10.0f);
        instancePath.lineTo(67.0f, 10.0f);
        instancePath.lineTo(67.0f, 58.0f);
        Path path3 = instancePath;
        path3.cubicTo(67.0f, 60.186752f, 64.95295f, 62.0f, 62.0f, 62.0f);
        path3.cubicTo(58.047047f, 62.0f, 56.0f, 60.186752f, 56.0f, 58.0f);
        instancePath.lineTo(56.0f, 8.0f);
        instancePath.lineTo(66.0f, 8.0f);
        instancePath.cubicTo(66.44552f, 8.0f, 67.0f, 8.595759f, 67.0f, 10.0f);
        instancePath.lineTo(67.0f, 10.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(58.110535f, 62.0f);
        instancePath2.cubicTo(56.9593f, 60.32874f, 56.270737f, 58.518147f, 55.99838f, 56.32013f);
        instancePath2.lineTo(55.97561f, 56.13638f);
        instancePath2.lineTo(55.97561f, 55.951218f);
        instancePath2.lineTo(55.97561f, 3.0243902f);
        instancePath2.lineTo(55.97561f, 2.755022f);
        instancePath2.lineTo(56.023594f, 2.4899626f);
        Path path4 = instancePath2;
        path4.cubicTo(56.01672f, 2.5279436f, 56.08146f, 2.764993f, 56.26943f, 2.9529014f);
        path4.cubicTo(56.336334f, 3.0197873f, 56.385796f, 3.049719f, 56.39374f, 3.0524664f);
        path4.cubicTo(56.30831f, 3.0229237f, 56.15949f, 3.0f, 55.951218f, 3.0f);
        instancePath2.lineTo(3.0243902f, 3.0f);
        instancePath2.cubicTo(2.8651917f, 3.0f, 3.0f, 2.8653867f, 3.0f, 3.0243902f);
        instancePath2.lineTo(3.0f, 55.951218f);
        instancePath2.cubicTo(3.0f, 57.929375f, 4.0706234f, 59.0f, 6.0487804f, 59.0f);
        instancePath2.lineTo(59.831577f, 59.0f);
        Path path5 = instancePath2;
        path5.cubicTo(60.363014f, 60.123505f, 61.09911f, 61.07564f, 62.0f, 62.0f);
        instancePath2.lineTo(58.110535f, 62.0f);
        instancePath2.lineTo(58.110535f, 62.0f);
        instancePath2.close();
        instancePath2.moveTo(58.97561f, 55.951218f);
        instancePath2.lineTo(58.97561f, 55.951218f);
        path5.cubicTo(59.304348f, 58.60424f, 60.388535f, 60.346558f, 62.0f, 62.0f);
        instancePath2.lineTo(6.0487804f, 62.0f);
        instancePath2.cubicTo(2.4137692f, 62.0f, 0.0f, 59.58623f, 0.0f, 55.951218f);
        instancePath2.lineTo(0.0f, 3.0243902f);
        Path path6 = instancePath2;
        path6.cubicTo(0.0f, 1.2053713f, 1.2115004f, 0.0f, 3.0243902f, 0.0f);
        instancePath2.lineTo(55.951218f, 0.0f);
        path6.cubicTo(58.094494f, 0.0f, 59.304348f, 1.2085422f, 58.97561f, 3.0243902f);
        instancePath2.lineTo(58.97561f, 55.951218f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(9.0f, 26.5f);
        instancePath3.cubicTo(9.0f, 25.671574f, 9.895431f, 25.0f, 11.0f, 25.0f);
        instancePath3.lineTo(28.0f, 25.0f);
        instancePath3.cubicTo(29.10457f, 25.0f, 30.0f, 25.671574f, 30.0f, 26.5f);
        instancePath3.lineTo(30.0f, 26.5f);
        Path path7 = instancePath3;
        path7.cubicTo(30.0f, 27.328426f, 29.10457f, 28.0f, 28.0f, 28.0f);
        instancePath3.lineTo(11.0f, 28.0f);
        path7.cubicTo(9.895431f, 28.0f, 9.0f, 27.328426f, 9.0f, 26.5f);
        instancePath3.lineTo(9.0f, 26.5f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(9.0f, 18.5f);
        instancePath4.cubicTo(9.0f, 17.671574f, 9.895431f, 17.0f, 11.0f, 17.0f);
        instancePath4.lineTo(28.0f, 17.0f);
        instancePath4.cubicTo(29.10457f, 17.0f, 30.0f, 17.671574f, 30.0f, 18.5f);
        instancePath4.lineTo(30.0f, 18.5f);
        instancePath4.cubicTo(30.0f, 19.328426f, 29.10457f, 20.0f, 28.0f, 20.0f);
        instancePath4.lineTo(11.0f, 20.0f);
        instancePath4.cubicTo(9.895431f, 20.0f, 9.0f, 19.328426f, 9.0f, 18.5f);
        instancePath4.lineTo(9.0f, 18.5f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(10.493433f, 9.0f);
        instancePath5.lineTo(28.506567f, 9.0f);
        Path path8 = instancePath5;
        path8.cubicTo(29.331367f, 9.0f, 30.0f, 9.665797f, 30.0f, 10.5f);
        path8.cubicTo(30.0f, 11.328427f, 29.325077f, 12.0f, 28.506567f, 12.0f);
        instancePath5.lineTo(10.493433f, 12.0f);
        Path path9 = instancePath5;
        path9.cubicTo(9.6686325f, 12.0f, 9.0f, 11.334203f, 9.0f, 10.5f);
        path9.cubicTo(9.0f, 9.671573f, 9.674923f, 9.0f, 10.493433f, 9.0f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
