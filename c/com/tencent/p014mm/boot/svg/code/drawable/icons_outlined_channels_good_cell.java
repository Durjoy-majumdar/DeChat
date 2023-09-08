package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_channels_good_cell */
public class icons_outlined_channels_good_cell extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
            instancePath.lineTo(24.0f, 0.0f);
            instancePath.lineTo(24.0f, 24.0f);
            instancePath.lineTo(0.0f, 24.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha((RectF) null, 0, 31);
            canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(22.0f, 20.8f);
            instancePath2.lineTo(22.0f, 22.0f);
            instancePath2.lineTo(15.5f, 22.0f);
            instancePath2.lineTo(15.5f, 20.8f);
            instancePath2.lineTo(22.0f, 20.8f);
            instancePath2.close();
            instancePath2.moveTo(15.654308f, 6.7972217f);
            instancePath2.lineTo(15.477115f, 9.554661f);
            instancePath2.lineTo(19.486067f, 9.554661f);
            instancePath2.cubicTo(20.832874f, 9.554661f, 21.845377f, 10.939997f, 21.641657f, 12.317988f);
            instancePath2.lineTo(21.615135f, 12.465539f);
            instancePath2.lineTo(21.311f, 13.899f);
            instancePath2.lineTo(20.085f, 13.899f);
            instancePath2.lineTo(20.434063f, 12.25325f);
            instancePath2.lineTo(20.45456f, 12.14249f);
            instancePath2.cubicTo(20.553305f, 11.474555f, 20.100386f, 10.834553f, 19.583595f, 10.761569f);
            instancePath2.lineTo(19.486067f, 10.754662f);
            instancePath2.lineTo(14.197527f, 10.754662f);
            instancePath2.lineTo(14.456695f, 6.7215896f);
            Path path = instancePath2;
            path.cubicTo(14.548167f, 5.2731385f, 13.593668f, 3.955784f, 12.86344f, 4.2762957f);
            path.cubicTo(12.703644f, 4.3464336f, 12.581654f, 4.5708847f, 12.51796f, 4.990225f);
            instancePath2.lineTo(12.496847f, 5.156692f);
            instancePath2.lineTo(12.477716f, 5.381091f);
            instancePath2.lineTo(12.454343f, 5.9851623f);
            instancePath2.lineTo(12.440366f, 6.1892447f);
            instancePath2.cubicTo(12.187761f, 8.674805f, 10.82563f, 11.074067f, 8.938261f, 11.51311f);
            instancePath2.lineTo(8.840975f, 11.531271f);
            instancePath2.lineTo(8.637804f, 11.553719f);
            instancePath2.lineTo(8.456257f, 11.566079f);
            instancePath2.lineTo(8.2f, 11.576f);
            instancePath2.lineTo(8.2f, 19.794f);
            instancePath2.lineTo(14.0f, 19.796f);
            instancePath2.lineTo(14.0f, 20.996f);
            instancePath2.lineTo(4.35f, 20.992437f);
            instancePath2.cubicTo(3.7978618f, 20.991854f, 3.3503754f, 20.5442f, 3.35f, 19.992062f);
            instancePath2.lineTo(3.35f, 11.411823f);
            instancePath2.cubicTo(3.35f, 10.859539f, 3.7977152f, 10.411823f, 4.35f, 10.411823f);
            instancePath2.lineTo(6.791204f, 10.411823f);
            instancePath2.lineTo(8.053139f, 10.382094f);
            instancePath2.lineTo(8.470286f, 10.363713f);
            instancePath2.lineTo(8.638076f, 10.349261f);
            instancePath2.lineTo(8.666373f, 10.344317f);
            instancePath2.lineTo(8.666373f, 10.344317f);
            instancePath2.cubicTo(10.021544f, 10.029075f, 11.056473f, 7.9378824f, 11.246515f, 6.067915f);
            instancePath2.lineTo(11.256829f, 5.907949f);
            instancePath2.lineTo(11.278582f, 5.335525f);
            instancePath2.lineTo(11.300713f, 5.060455f);
            Path path2 = instancePath2;
            path2.cubicTo(11.373992f, 4.352575f, 11.599814f, 3.5204237f, 12.381148f, 3.1774807f);
            path2.cubicTo(14.434894f, 2.276051f, 15.767029f, 5.012321f, 15.654308f, 6.7972217f);
            instancePath2.close();
            instancePath2.moveTo(7.0f, 11.607f);
            instancePath2.lineTo(6.791204f, 11.611823f);
            instancePath2.lineTo(4.549f, 11.611f);
            instancePath2.lineTo(4.549f, 19.792f);
            instancePath2.lineTo(7.0f, 19.793f);
            instancePath2.lineTo(7.0f, 11.607f);
            instancePath2.close();
            instancePath2.moveTo(22.0f, 18.1f);
            instancePath2.lineTo(22.0f, 19.3f);
            instancePath2.lineTo(15.5f, 19.3f);
            instancePath2.lineTo(15.5f, 18.1f);
            instancePath2.lineTo(22.0f, 18.1f);
            instancePath2.close();
            instancePath2.moveTo(22.0f, 15.4f);
            instancePath2.lineTo(22.0f, 16.6f);
            instancePath2.lineTo(15.5f, 16.6f);
            instancePath2.lineTo(15.5f, 15.4f);
            instancePath2.lineTo(22.0f, 15.4f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
