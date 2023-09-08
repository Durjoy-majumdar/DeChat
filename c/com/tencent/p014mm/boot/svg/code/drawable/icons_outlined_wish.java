package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_wish */
public class icons_outlined_wish extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.25f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(29.090195f, 4.973805f);
            instancePath.lineTo(29.924355f, 5.7914824f);
            instancePath.lineTo(31.50009f, 7.2903695f);
            instancePath.lineTo(33.075825f, 5.7914824f);
            instancePath.lineTo(33.909985f, 4.973805f);
            instancePath.cubicTo(37.122936f, 1.7719597f, 41.2997f, 0.115985245f, 45.50961f, 0.0058815526f);
            instancePath.lineTo(45.50931f, 3.6074605f);
            instancePath.cubicTo(42.219185f, 3.7165506f, 38.961636f, 5.0219946f, 36.45116f, 7.5237927f);
            instancePath.lineTo(35.584538f, 8.3734255f);
            instancePath.lineTo(33.964275f, 9.91483f);
            instancePath.lineTo(31.50009f, 12.228526f);
            instancePath.lineTo(27.912859f, 8.851456f);
            instancePath.lineTo(26.54902f, 7.5237927f);
            Path path = instancePath;
            path.cubicTo(21.29915f, 2.2920692f, 12.782281f, 2.2920692f, 7.53241f, 7.5237927f);
            path.cubicTo(2.5114386f, 12.527409f, 2.2934105f, 20.516182f, 6.8730874f, 25.741629f);
            instancePath.lineTo(7.347047f, 26.25475f);
            instancePath.lineTo(31.497f, 50.325f);
            instancePath.lineTo(51.618f, 30.27f);
            instancePath.lineTo(54.174f, 32.808f);
            instancePath.lineTo(33.909985f, 53.00511f);
            instancePath.cubicTo(32.579105f, 54.33153f, 30.421213f, 54.331642f, 29.090195f, 53.005363f);
            instancePath.lineTo(4.8058605f, 28.804724f);
            Path path2 = instancePath;
            path2.cubicTo(-1.6629304f, 22.158043f, -1.6016039f, 11.543857f, 4.991237f, 4.973805f);
            path2.cubicTo(11.64598f, -1.6579349f, 22.435452f, -1.6579349f, 29.090195f, 4.973805f);
            instancePath.close();
            instancePath.moveTo(56.322712f, 0.48331445f);
            instancePath.cubicTo(56.388638f, 0.5058267f, 56.440414f, 0.5576055f, 56.46293f, 0.62352985f);
            instancePath.lineTo(59.68654f, 10.063461f);
            instancePath.lineTo(69.12647f, 13.287073f);
            Path path3 = instancePath;
            path3.cubicTo(69.244064f, 13.32723f, 69.30685f, 13.455115f, 69.266685f, 13.572712f);
            path3.cubicTo(69.24417f, 13.638636f, 69.1924f, 13.690414f, 69.12647f, 13.712927f);
            instancePath.lineTo(59.68654f, 16.936539f);
            instancePath.lineTo(56.46293f, 26.37647f);
            Path path4 = instancePath;
            path4.cubicTo(56.42277f, 26.494066f, 56.294884f, 26.556843f, 56.177288f, 26.516685f);
            path4.cubicTo(56.111362f, 26.494173f, 56.059586f, 26.442394f, 56.03707f, 26.37647f);
            instancePath.lineTo(52.81346f, 16.936539f);
            instancePath.lineTo(43.37353f, 13.712927f);
            Path path5 = instancePath;
            path5.cubicTo(43.25593f, 13.67277f, 43.193157f, 13.544885f, 43.233315f, 13.427288f);
            path5.cubicTo(43.255825f, 13.361363f, 43.307606f, 13.309586f, 43.37353f, 13.287073f);
            instancePath.lineTo(52.81346f, 10.063461f);
            instancePath.lineTo(56.03707f, 0.62352985f);
            instancePath.cubicTo(56.07723f, 0.50593334f, 56.205116f, 0.4431568f, 56.322712f, 0.48331445f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
