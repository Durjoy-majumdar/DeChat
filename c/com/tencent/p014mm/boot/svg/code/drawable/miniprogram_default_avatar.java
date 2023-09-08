package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.miniprogram_default_avatar */
public class miniprogram_default_avatar extends C24542c {
    private final int height = 150;
    private final int width = 150;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 150;
        }
        if (i == 2) {
            Canvas canvas = objArr[0];
            Looper looper = objArr[1];
            C24542c.instanceMatrix(looper);
            C24542c.instanceMatrixArray(looper);
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
            instancePaint3.setColor(-921103);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(150.0f, 0.0f);
            instancePath.lineTo(150.0f, 150.0f);
            instancePath.lineTo(0.0f, 150.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-3552823);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(88.629036f, 47.177418f);
            Path path = instancePath2;
            path.cubicTo(85.16202f, 47.177418f, 81.93403f, 48.098953f, 79.19355f, 49.66629f);
            path.cubicTo(74.166534f, 52.543064f, 70.80645f, 57.627743f, 70.80645f, 63.427418f);
            instancePath2.lineTo(70.80645f, 87.54032f);
            Path path2 = instancePath2;
            path2.cubicTo(70.80645f, 91.882744f, 66.58145f, 95.40323f, 61.370968f, 95.40323f);
            path2.cubicTo(56.159435f, 95.40323f, 51.935482f, 91.882744f, 51.935482f, 87.54032f);
            path2.cubicTo(51.935482f, 84.44968f, 54.080482f, 81.78363f, 57.193146f, 80.49831f);
            path2.cubicTo(57.4175f, 80.40605f, 57.645f, 80.317986f, 57.87879f, 80.2404f);
            path2.cubicTo(59.838226f, 79.45411f, 61.51879f, 77.97798f, 62.142582f, 76.26387f);
            path2.cubicTo(63.064114f, 73.73306f, 61.348953f, 71.68242f, 58.312824f, 71.68242f);
            path2.cubicTo(57.555885f, 71.68242f, 56.788467f, 71.810326f, 56.048306f, 72.04097f);
            path2.cubicTo(56.045162f, 72.042015f, 56.042015f, 72.04307f, 56.037823f, 72.04411f);
            path2.cubicTo(51.648228f, 73.304276f, 47.98411f, 76.067825f, 45.784595f, 79.67742f);
            path2.cubicTo(44.364033f, 82.01008f, 43.548386f, 84.68871f, 43.548386f, 87.54032f);
            path2.cubicTo(43.548386f, 96.500885f, 51.54339f, 103.79032f, 61.370968f, 103.79032f);
            path2.cubicTo(64.83798f, 103.79032f, 68.06597f, 102.86879f, 70.80645f, 101.30145f);
            path2.cubicTo(75.833466f, 98.424675f, 79.19355f, 93.34f, 79.19355f, 87.54032f);
            instancePath2.lineTo(79.19355f, 63.427418f);
            Path path3 = instancePath2;
            path3.cubicTo(79.19355f, 59.085f, 83.4175f, 55.564518f, 88.629036f, 55.564518f);
            path3.cubicTo(93.839516f, 55.564518f, 98.064514f, 59.085f, 98.064514f, 63.427418f);
            path3.cubicTo(98.064514f, 66.65016f, 95.738144f, 69.42f, 92.40742f, 70.63403f);
            path3.cubicTo(90.25928f, 71.35427f, 88.49903f, 72.909035f, 87.828064f, 74.751045f);
            path3.cubicTo(86.91177f, 77.26927f, 88.618546f, 79.31153f, 91.641045f, 79.31153f);
            path3.cubicTo(92.325645f, 79.31153f, 93.01758f, 79.194115f, 93.691696f, 79.0033f);
            path3.cubicTo(93.80177f, 78.9729f, 93.910805f, 78.939354f, 94.01984f, 78.90685f);
            path3.cubicTo(98.383224f, 77.63936f, 102.02532f, 74.88419f, 104.214355f, 71.29032f);
            path3.cubicTo(105.63597f, 68.95871f, 106.451614f, 66.27903f, 106.451614f, 63.427418f);
            path3.cubicTo(106.451614f, 54.466854f, 98.45661f, 47.177418f, 88.629036f, 47.177418f);
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
