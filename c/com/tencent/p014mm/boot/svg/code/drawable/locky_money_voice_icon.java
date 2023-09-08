package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import com.tencent.xweb.util.WXWebReporter;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.locky_money_voice_icon */
public class locky_money_voice_icon extends C24542c {
    private final int height = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD;
    private final int width = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-2243680);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(94.5f, 0.0f);
                Path path = instancePath;
                path.cubicTo(146.69092f, 0.0f, 189.0f, 42.30909f, 189.0f, 94.5f);
                path.cubicTo(189.0f, 146.69092f, 146.69092f, 189.0f, 94.5f, 189.0f);
                path.cubicTo(42.30909f, 189.0f, 0.0f, 146.69092f, 0.0f, 94.5f);
                path.cubicTo(0.0f, 42.30909f, 42.30909f, 0.0f, 94.5f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-7503);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 44.5f, 0.0f, 1.0f, 39.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 0.8660254f, -0.5f, 46.36397f, 0.5f, 0.8660254f, 0.12389612f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(14.281093f, 17.051855f);
                instancePath2.cubicTo(14.281093f, 7.8682823f, 21.725847f, 0.4235266f, 30.90942f, 0.4235266f);
                instancePath2.lineTo(30.909422f, 0.4235266f);
                instancePath2.cubicTo(40.092995f, 0.4235266f, 47.53775f, 7.8682823f, 47.53775f, 17.051855f);
                instancePath2.lineTo(47.53775f, 43.997627f);
                instancePath2.cubicTo(47.53775f, 53.1812f, 40.092995f, 60.625954f, 30.909422f, 60.625954f);
                instancePath2.lineTo(30.90942f, 60.625954f);
                instancePath2.cubicTo(21.725847f, 60.625954f, 14.281093f, 53.1812f, 14.281093f, 43.997627f);
                instancePath2.lineTo(14.281093f, 17.051855f);
                instancePath2.close();
                canvas.drawPath(instancePath2, instancePaint6);
                canvas.restore();
                canvas.save();
                Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
                Path instancePath3 = C24542c.instancePath(looper);
                instancePath3.moveTo(7.629761f, 33.86932f);
                instancePath3.lineTo(7.629761f, 44.035454f);
                Path path2 = instancePath3;
                path2.cubicTo(7.629761f, 56.892452f, 18.05242f, 67.31511f, 30.90942f, 67.31511f);
                path2.cubicTo(43.76642f, 67.31511f, 54.18908f, 56.892452f, 54.18908f, 44.035454f);
                instancePath3.lineTo(54.18908f, 33.86932f);
                instancePath3.lineTo(60.84041f, 33.86932f);
                instancePath3.lineTo(60.84041f, 44.07328f);
                Path path3 = instancePath3;
                path3.cubicTo(60.84041f, 60.60371f, 47.43985f, 74.00427f, 30.90942f, 74.00427f);
                path3.cubicTo(14.378991f, 74.00427f, 0.97843033f, 60.60371f, 0.97843033f, 44.07328f);
                instancePath3.lineTo(0.97843033f, 33.86932f);
                instancePath3.lineTo(7.629761f, 33.86932f);
                instancePath3.close();
                WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint7);
                canvas.restore();
                canvas.save();
                Paint instancePaint8 = C24542c.instancePaint(instancePaint5, looper);
                Path instancePath4 = C24542c.instancePath(looper);
                instancePath4.moveTo(27.583754f, 70.65969f);
                instancePath4.lineTo(34.235085f, 70.65969f);
                instancePath4.lineTo(34.235085f, 80.69343f);
                instancePath4.lineTo(27.583754f, 80.69343f);
                instancePath4.lineTo(27.583754f, 70.65969f);
                instancePath4.close();
                canvas.drawPath(instancePath4, instancePaint8);
                canvas.restore();
                canvas.save();
                Paint instancePaint9 = C24542c.instancePaint(instancePaint5, looper);
                Path instancePath5 = C24542c.instancePath(looper);
                instancePath5.moveTo(27.583754f, 84.03801f);
                instancePath5.lineTo(34.235085f, 84.03801f);
                instancePath5.lineTo(31.560646f, 90.28269f);
                Path path4 = instancePath5;
                path4.cubicTo(31.406612f, 90.64236f, 30.99018f, 90.80905f, 30.630516f, 90.655014f);
                path4.cubicTo(30.463182f, 90.58335f, 30.329857f, 90.45002f, 30.258192f, 90.28269f);
                instancePath5.lineTo(27.583754f, 84.03801f);
                instancePath5.close();
                WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
                canvas.drawPath(instancePath5, instancePaint9);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}