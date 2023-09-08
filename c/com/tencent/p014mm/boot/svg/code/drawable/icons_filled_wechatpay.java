package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_wechatpay */
public class icons_filled_wechatpay extends C24542c {
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(21.820826f, 34.15849f);
            Path path = instancePath;
            path.cubicTo(21.549904f, 34.29667f, 21.24491f, 34.378048f, 20.921633f, 34.378048f);
            path.cubicTo(20.171196f, 34.378048f, 19.518824f, 33.956734f, 19.176432f, 33.334515f);
            instancePath.lineTo(19.045958f, 33.042904f);
            instancePath.lineTo(13.583479f, 20.817225f);
            Path path2 = instancePath;
            path2.cubicTo(13.524474f, 20.684134f, 13.487908f, 20.533241f, 13.487908f, 20.386587f);
            path2.cubicTo(13.487908f, 19.823708f, 13.935843f, 19.36764f, 14.4876585f, 19.36764f);
            path2.cubicTo(14.713704f, 19.36764f, 14.918973f, 19.443087f, 15.086844f, 19.570242f);
            instancePath.lineTo(21.531622f, 24.250452f);
            Path path3 = instancePath;
            path3.cubicTo(22.001163f, 24.564104f, 22.565445f, 24.748905f, 23.170448f, 24.748905f);
            path3.cubicTo(23.530293f, 24.748905f, 23.875177f, 24.681087f, 24.19513f, 24.561562f);
            instancePath.lineTo(54.50428f, 10.802374f);
            Path path4 = instancePath;
            path4.cubicTo(49.07172f, 4.2699175f, 40.123825f, 0.0f, 29.999168f, 0.0f);
            path4.cubicTo(13.429735f, 0.0f, 0.0f, 11.417811f, 0.0f, 25.50252f);
            path4.cubicTo(0.0f, 33.186165f, 4.039724f, 40.104332f, 10.36483f, 44.779453f);
            path4.cubicTo(10.872601f, 45.14821f, 11.204188f, 45.754322f, 11.204188f, 46.440968f);
            path4.cubicTo(11.204188f, 46.66815f, 11.158481f, 46.8733f, 11.098645f, 47.090313f);
            path4.cubicTo(10.594199f, 49.01292f, 9.785589f, 52.090107f, 9.748193f, 52.235065f);
            path4.cubicTo(9.685033f, 52.474968f, 9.586138f, 52.727585f, 9.586138f, 52.981052f);
            path4.cubicTo(9.586138f, 53.543083f, 10.033242f, 54.0f, 10.587551f, 54.0f);
            path4.cubicTo(10.803623f, 54.0f, 10.980637f, 53.91777f, 11.164298f, 53.81096f);
            instancePath.lineTo(17.73207f, 49.94201f);
            Path path5 = instancePath;
            path5.cubicTo(18.225712f, 49.651245f, 18.748442f, 49.47153f, 19.32519f, 49.47153f);
            path5.cubicTo(19.631845f, 49.47153f, 19.92853f, 49.51985f, 20.20693f, 49.607166f);
            path5.cubicTo(23.271006f, 50.505737f, 26.576914f, 51.00504f, 29.999168f, 51.00504f);
            path5.cubicTo(46.567772f, 51.00504f, 60.0f, 39.587227f, 60.0f, 25.50252f);
            path5.cubicTo(60.0f, 21.237688f, 58.760906f, 17.219542f, 56.5819f, 13.686284f);
            instancePath.lineTo(22.040222f, 34.02879f);
            instancePath.lineTo(21.820826f, 34.15849f);
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
