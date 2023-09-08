package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_share */
public class icons_outlined_share extends C24542c {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-2565928);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(72.0f, 0.0f);
            instancePath.lineTo(72.0f, 72.0f);
            instancePath.lineTo(0.0f, 72.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha((RectF) null, 0, 31);
            canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(43.14043f, 10.22545f);
            instancePath2.cubicTo(41.487034f, 10.404614f, 40.2f, 11.805049f, 40.2f, 13.506086f);
            instancePath2.lineTo(40.197f, 21.24f);
            instancePath2.lineTo(40.025116f, 21.257164f);
            Path path = instancePath2;
            path.cubicTo(20.355965f, 23.332092f, 9.482774f, 39.766853f, 11.353268f, 60.873375f);
            path.cubicTo(11.34624f, 60.993927f, 11.363081f, 61.195847f, 11.4496155f, 61.46426f);
            path.cubicTo(11.8654785f, 62.754185f, 13.51148f, 63.211304f, 14.509784f, 62.176414f);
            path.cubicTo(14.743529f, 61.9341f, 14.84062f, 61.77636f, 14.988257f, 61.418777f);
            instancePath2.lineTo(16.088976f, 58.52446f);
            instancePath2.cubicTo(17.321796f, 55.415096f, 18.772772f, 52.53561f, 20.66736f, 49.795597f);
            instancePath2.lineTo(21.201338f, 49.043903f);
            instancePath2.cubicTo(25.885242f, 42.62709f, 32.03321f, 38.76672f, 40.06666f, 38.426186f);
            instancePath2.lineTo(40.197f, 38.421f);
            instancePath2.lineTo(40.2f, 48.263622f);
            Path path2 = instancePath2;
            path2.cubicTo(40.2f, 49.13866f, 40.547676f, 49.978027f, 41.166546f, 50.596897f);
            path2.cubicTo(42.455276f, 51.885628f, 44.544724f, 51.885628f, 45.833454f, 50.596897f);
            instancePath2.lineTo(62.15147f, 34.278877f);
            instancePath2.cubicTo(64.025986f, 32.40436f, 64.025986f, 29.36517f, 62.15147f, 27.490654f);
            instancePath2.lineTo(45.833454f, 11.172633f);
            instancePath2.cubicTo(45.21458f, 10.553763f, 44.375214f, 10.206086f, 43.5f, 10.206086f);
            instancePath2.lineTo(43.14043f, 10.22545f);
            instancePath2.close();
            instancePath2.moveTo(43.797f, 14.226f);
            instancePath2.lineTo(59.60589f, 30.036238f);
            instancePath2.lineTo(59.759655f, 30.224485f);
            instancePath2.cubicTo(60.067196f, 30.690266f, 60.015938f, 31.323244f, 59.60589f, 31.733294f);
            instancePath2.lineTo(43.797f, 47.541f);
            instancePath2.lineTo(43.798695f, 34.855198f);
            instancePath2.lineTo(42.043533f, 34.81163f);
            instancePath2.cubicTo(31.419947f, 34.547916f, 23.444914f, 39.448765f, 17.706284f, 47.748154f);
            instancePath2.lineTo(16.95311f, 48.87648f);
            instancePath2.cubicTo(16.465988f, 49.632713f, 16.008179f, 50.397274f, 15.5756445f, 51.171898f);
            instancePath2.lineTo(14.922f, 52.386f);
            instancePath2.lineTo(14.926991f, 52.334656f);
            instancePath2.cubicTo(16.342087f, 36.630383f, 26.180569f, 25.618937f, 42.1024f, 24.69901f);
            instancePath2.lineTo(43.798317f, 24.601027f);
            instancePath2.lineTo(43.797f, 14.226f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
