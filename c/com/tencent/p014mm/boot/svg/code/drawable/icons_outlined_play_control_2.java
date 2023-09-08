package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_play_control_2 */
public class icons_outlined_play_control_2 extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        instancePaint3.setColor(-436207616);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 0.0f, 22.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(10.0f, 2.0f);
        Path path = instancePath;
        path.cubicTo(15.522847f, 2.0f, 20.0f, 6.4771523f, 20.0f, 12.0f);
        path.cubicTo(20.0f, 17.522848f, 15.522847f, 22.0f, 10.0f, 22.0f);
        path.cubicTo(4.4771523f, 22.0f, 0.0f, 17.522848f, 0.0f, 12.0f);
        path.cubicTo(0.0f, 6.4771523f, 4.4771523f, 2.0f, 10.0f, 2.0f);
        instancePath.close();
        instancePath.moveTo(10.0f, 3.2f);
        Path path2 = instancePath;
        path2.cubicTo(5.139894f, 3.2f, 1.2f, 7.139894f, 1.2f, 12.0f);
        path2.cubicTo(1.2f, 16.860106f, 5.139894f, 20.8f, 10.0f, 20.8f);
        path2.cubicTo(14.8601055f, 20.8f, 18.8f, 16.860106f, 18.8f, 12.0f);
        path2.cubicTo(18.8f, 7.139894f, 14.8601055f, 3.2f, 10.0f, 3.2f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 7.5f, 0.0f, 1.0f, 7.805963f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.133743f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.24101035f, 0.41291845f);
        instancePath2.cubicTo(0.08499616f, 0.60795593f, 0.0f, 0.8502805f, 0.0f, 1.1000406f);
        instancePath2.lineTo(0.0f, 7.019416f);
        Path path3 = instancePath2;
        path3.cubicTo(0.0f, 7.626929f, 0.49248677f, 8.119415f, 1.1f, 8.119415f);
        path3.cubicTo(1.3497972f, 8.119415f, 1.5921558f, 8.034394f, 1.787207f, 7.8783374f);
        instancePath2.lineTo(5.194002f, 5.152625f);
        Path path4 = instancePath2;
        path4.cubicTo(5.797745f, 4.669582f, 5.8955913f, 3.7885678f, 5.412548f, 3.184825f);
        path4.cubicTo(5.34796f, 3.1040976f, 5.274628f, 3.030773f, 5.1938944f, 2.9661925f);
        instancePath2.lineTo(1.7871221f, 0.24105088f);
        instancePath2.cubicTo(1.3466014f, -0.11132995f, 0.7182744f, -0.07015223f, 0.32692236f, 0.31736487f);
        instancePath2.lineTo(0.24101035f, 0.41291845f);
        instancePath2.close();
        instancePath2.moveTo(1.2f, 6.810794f);
        instancePath2.lineTo(1.2f, 1.307794f);
        instancePath2.lineTo(4.4443064f, 3.9032722f);
        instancePath2.lineTo(4.4755425f, 3.9345052f);
        instancePath2.lineTo(4.507074f, 3.9902363f);
        instancePath2.cubicTo(4.536067f, 4.068824f, 4.513321f, 4.1604147f, 4.444322f, 4.2156196f);
        instancePath2.lineTo(1.2f, 6.810794f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(4.6289945f, 0.9370796f);
        instancePath3.lineTo(5.3785825f, 0.0f);
        instancePath3.lineTo(9.253894f, 3.0999355f);
        Path path5 = instancePath3;
        path5.cubicTo(9.334628f, 3.164516f, 9.40796f, 3.2378404f, 9.4725485f, 3.318568f);
        path5.cubicTo(9.925402f, 3.8845768f, 9.867707f, 4.694281f, 9.361258f, 5.1912985f);
        instancePath3.lineTo(9.254003f, 5.286368f);
        instancePath3.lineTo(5.378704f, 8.386921f);
        instancePath3.lineTo(4.6289945f, 7.449915f);
        instancePath3.lineTo(8.504322f, 4.3493624f);
        instancePath3.cubicTo(8.59057f, 4.2803564f, 8.604548f, 4.154497f, 8.5355425f, 4.0682483f);
        instancePath3.lineTo(8.504307f, 4.037015f);
        instancePath3.lineTo(4.6289945f, 0.9370796f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
