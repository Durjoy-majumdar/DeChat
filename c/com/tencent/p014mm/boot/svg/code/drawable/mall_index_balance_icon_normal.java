package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mall_index_balance_icon_normal */
public class mall_index_balance_icon_normal extends C24542c {
    private final int height = 93;
    private final int width = 93;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 93;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 31.0f, 0.0f, 1.0f, 31.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.restore();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(78.991554f, 14.00827f);
                Path path = instancePath;
                path.cubicTo(97.66948f, 31.740889f, 97.66948f, 61.25771f, 78.991554f, 78.99145f);
                path.cubicTo(61.258163f, 97.66952f, 31.741741f, 97.66952f, 14.008727f, 78.99145f);
                path.cubicTo(-4.6695757f, 61.25771f, -4.6695757f, 31.740889f, 14.008727f, 14.00827f);
                path.cubicTo(31.740246f, -4.669423f, 61.258163f, -4.669423f, 78.991554f, 14.00827f);
                instancePath.close();
                instancePath.moveTo(86.38453f, 48.423794f);
                Path path2 = instancePath;
                path2.cubicTo(86.38453f, 25.27637f, 68.759476f, 7.65122f, 48.42406f, 7.65122f);
                path2.cubicTo(25.275711f, 7.65122f, 7.6517115f, 25.27637f, 7.6517115f, 48.423794f);
                path2.cubicTo(7.6517115f, 68.759315f, 25.276764f, 86.38446f, 45.612175f, 86.38446f);
                path2.cubicTo(68.759476f, 86.38446f, 86.38453f, 68.759315f, 86.38453f, 48.423794f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(48.44434f, 43.142254f);
                instancePath2.lineTo(55.190773f, 29.0f);
                instancePath2.lineTo(61.51553f, 29.0f);
                instancePath2.lineTo(54.769096f, 43.142254f);
                instancePath2.lineTo(61.51553f, 43.142254f);
                instancePath2.lineTo(61.51553f, 48.44558f);
                instancePath2.lineTo(49.28777f, 48.44558f);
                instancePath2.lineTo(49.28777f, 53.306904f);
                instancePath2.lineTo(61.51553f, 53.306904f);
                instancePath2.lineTo(61.51553f, 58.61023f);
                instancePath2.lineTo(49.28777f, 58.61023f);
                instancePath2.lineTo(49.28777f, 66.565216f);
                instancePath2.lineTo(44.227966f, 66.565216f);
                instancePath2.lineTo(44.227966f, 58.61023f);
                instancePath2.lineTo(32.0f, 58.61023f);
                instancePath2.lineTo(32.0f, 53.306904f);
                instancePath2.lineTo(44.227966f, 53.306904f);
                instancePath2.lineTo(44.227966f, 48.44558f);
                instancePath2.lineTo(32.0f, 48.44558f);
                instancePath2.lineTo(32.0f, 43.142254f);
                instancePath2.lineTo(38.746433f, 43.142254f);
                instancePath2.lineTo(32.0f, 29.0f);
                instancePath2.lineTo(38.324757f, 29.0f);
                instancePath2.lineTo(45.07119f, 43.142254f);
                instancePath2.lineTo(48.44434f, 43.142254f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
