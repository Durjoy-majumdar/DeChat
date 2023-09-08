package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_ringtone */
public class icons_filled_ringtone extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 96;
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
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(96.0f, 0.0f);
            instancePath.lineTo(96.0f, 96.0f);
            instancePath.lineTo(0.0f, 96.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-6247);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(48.0f, 10.0f);
            Path path = instancePath2;
            path.cubicTo(50.20914f, 10.0f, 52.0f, 11.790861f, 52.0f, 14.0f);
            path.cubicTo(52.0f, 16.209139f, 50.20914f, 18.0f, 48.0f, 18.0f);
            path.cubicTo(31.431458f, 18.0f, 18.0f, 31.431458f, 18.0f, 48.0f);
            path.cubicTo(18.0f, 64.56854f, 31.431458f, 78.0f, 48.0f, 78.0f);
            path.cubicTo(64.56854f, 78.0f, 78.0f, 64.56854f, 78.0f, 48.0f);
            path.cubicTo(78.0f, 45.79086f, 79.79086f, 44.0f, 82.0f, 44.0f);
            path.cubicTo(84.20914f, 44.0f, 86.0f, 45.79086f, 86.0f, 48.0f);
            path.cubicTo(86.0f, 68.986824f, 68.986824f, 86.0f, 48.0f, 86.0f);
            path.cubicTo(27.01318f, 86.0f, 10.0f, 68.986824f, 10.0f, 48.0f);
            path.cubicTo(10.0f, 27.01318f, 27.01318f, 10.0f, 48.0f, 10.0f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-15616);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(48.0f, 24.0f);
            Path path2 = instancePath3;
            path2.cubicTo(50.20914f, 24.0f, 52.0f, 25.790861f, 52.0f, 28.0f);
            path2.cubicTo(52.0f, 30.209139f, 50.20914f, 32.0f, 48.0f, 32.0f);
            path2.cubicTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f);
            path2.cubicTo(32.0f, 56.836555f, 39.163445f, 64.0f, 48.0f, 64.0f);
            path2.cubicTo(56.836555f, 64.0f, 64.0f, 56.836555f, 64.0f, 48.0f);
            path2.cubicTo(64.0f, 45.79086f, 65.79086f, 44.0f, 68.0f, 44.0f);
            path2.cubicTo(70.20914f, 44.0f, 72.0f, 45.79086f, 72.0f, 48.0f);
            path2.cubicTo(72.0f, 61.254833f, 61.254833f, 72.0f, 48.0f, 72.0f);
            path2.cubicTo(34.745167f, 72.0f, 24.0f, 61.254833f, 24.0f, 48.0f);
            path2.cubicTo(24.0f, 34.745167f, 34.745167f, 24.0f, 48.0f, 24.0f);
            instancePath3.close();
            instancePath3.moveTo(65.10037f, 17.689407f);
            instancePath3.lineTo(65.557724f, 17.784908f);
            instancePath3.lineTo(74.25105f, 20.114279f);
            instancePath3.cubicTo(75.19944f, 20.368399f, 75.80509f, 21.263142f, 75.72719f, 22.208176f);
            instancePath3.lineTo(75.66527f, 22.563768f);
            instancePath3.lineTo(74.11235f, 28.359324f);
            instancePath3.cubicTo(73.85824f, 29.307709f, 72.96349f, 29.913363f, 72.018456f, 29.835459f);
            instancePath3.lineTo(71.662865f, 29.773537f);
            instancePath3.lineTo(63.935455f, 27.702986f);
            instancePath3.lineTo(57.7238f, 50.885204f);
            Path path3 = instancePath3;
            path3.cubicTo(56.293823f, 56.221947f, 50.86139f, 59.39919f, 45.5005f, 57.96274f);
            path3.cubicTo(40.13961f, 56.5263f, 36.975307f, 51.045563f, 38.405285f, 45.708824f);
            path3.cubicTo(39.83526f, 40.372086f, 45.31599f, 37.207783f, 50.67688f, 38.644226f);
            path3.cubicTo(51.009815f, 38.733437f, 51.33423f, 38.840294f, 51.6498f, 38.963257f);
            path3.cubicTo(54.59986f, 39.75893f, 55.555965f, 39.287758f, 56.12228f, 37.633373f);
            instancePath3.lineTo(60.659763f, 20.60953f);
            instancePath3.lineTo(60.80649f, 20.165907f);
            instancePath3.cubicTo(61.431007f, 18.590582f, 62.98243f, 17.593792f, 64.644844f, 17.648163f);
            instancePath3.lineTo(65.10037f, 17.689407f);
            instancePath3.close();
            WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.drawPath(instancePath3, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
