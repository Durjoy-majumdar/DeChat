package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_previous2 */
public class icons_filled_previous2 extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 66.0f);
        Path path = instancePath;
        path.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
        path.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
        path.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
        path.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
        instancePath.close();
        instancePath.moveTo(27.805887f, 33.6f);
        instancePath.lineTo(42.0f, 33.6f);
        path.cubicTo(44.982338f, 33.6f, 47.4f, 36.017662f, 47.4f, 39.0f);
        path.cubicTo(47.4f, 41.982338f, 44.982338f, 44.4f, 42.0f, 44.4f);
        instancePath.lineTo(36.0f, 44.4f);
        instancePath.lineTo(36.0f, 48.0f);
        instancePath.lineTo(42.0f, 48.0f);
        Path path2 = instancePath;
        path2.cubicTo(46.970562f, 48.0f, 51.0f, 43.970562f, 51.0f, 39.0f);
        path2.cubicTo(51.0f, 34.029438f, 46.970562f, 30.0f, 42.0f, 30.0f);
        instancePath.lineTo(27.976452f, 30.0f);
        instancePath.lineTo(32.030865f, 25.945585f);
        instancePath.lineTo(29.485281f, 23.400002f);
        instancePath.lineTo(22.06066f, 30.824621f);
        instancePath.cubicTo(21.474874f, 31.410408f, 21.474874f, 32.360157f, 22.06066f, 32.945942f);
        instancePath.lineTo(29.485281f, 40.370564f);
        instancePath.lineTo(32.030865f, 37.824978f);
        instancePath.lineTo(27.805887f, 33.6f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
