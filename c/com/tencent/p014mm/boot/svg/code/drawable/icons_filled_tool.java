package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_tool */
public class icons_filled_tool extends C24542c {
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
        instancePaint4.setColor(-436207616);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(4.6f, 3.4f);
        instancePath2.lineTo(9.4f, 3.4f);
        instancePath2.cubicTo(10.283655f, 3.4f, 11.0f, 4.1163445f, 11.0f, 5.0f);
        instancePath2.lineTo(11.0f, 9.8f);
        instancePath2.cubicTo(11.0f, 10.683656f, 10.283655f, 11.4f, 9.4f, 11.4f);
        instancePath2.lineTo(4.6f, 11.4f);
        instancePath2.cubicTo(3.7163444f, 11.4f, 3.0f, 10.683656f, 3.0f, 9.8f);
        instancePath2.lineTo(3.0f, 5.0f);
        instancePath2.cubicTo(3.0f, 4.1163445f, 3.7163444f, 3.4f, 4.6f, 3.4f);
        instancePath2.close();
        instancePath2.moveTo(14.2f, 13.0f);
        instancePath2.lineTo(19.0f, 13.0f);
        instancePath2.cubicTo(19.883656f, 13.0f, 20.6f, 13.716345f, 20.6f, 14.6f);
        instancePath2.lineTo(20.6f, 19.4f);
        Path path = instancePath2;
        path.cubicTo(20.6f, 20.283655f, 19.883656f, 21.0f, 19.0f, 21.0f);
        instancePath2.lineTo(14.2f, 21.0f);
        path.cubicTo(13.316344f, 21.0f, 12.6f, 20.283655f, 12.6f, 19.4f);
        instancePath2.lineTo(12.6f, 14.6f);
        path.cubicTo(12.6f, 13.716345f, 13.316344f, 13.0f, 14.2f, 13.0f);
        instancePath2.close();
        instancePath2.moveTo(4.6f, 13.0f);
        instancePath2.lineTo(9.4f, 13.0f);
        path.cubicTo(10.283655f, 13.0f, 11.0f, 13.716345f, 11.0f, 14.6f);
        instancePath2.lineTo(11.0f, 19.4f);
        path.cubicTo(11.0f, 20.283655f, 10.283655f, 21.0f, 9.4f, 21.0f);
        instancePath2.lineTo(4.6f, 21.0f);
        path.cubicTo(3.7163444f, 21.0f, 3.0f, 20.283655f, 3.0f, 19.4f);
        instancePath2.lineTo(3.0f, 14.6f);
        path.cubicTo(3.0f, 13.716345f, 3.7163444f, 13.0f, 4.6f, 13.0f);
        instancePath2.close();
        instancePath2.moveTo(17.70292f, 3.2699792f);
        instancePath2.lineTo(20.67277f, 6.2398276f);
        instancePath2.cubicTo(21.219503f, 6.786562f, 21.219503f, 7.6729927f, 20.67277f, 8.219727f);
        instancePath2.lineTo(17.70292f, 11.189575f);
        instancePath2.cubicTo(17.156187f, 11.736309f, 16.269756f, 11.736309f, 15.723022f, 11.189575f);
        instancePath2.lineTo(12.753174f, 8.219727f);
        Path path2 = instancePath2;
        path2.cubicTo(12.20644f, 7.6729927f, 12.20644f, 6.786562f, 12.753174f, 6.2398276f);
        instancePath2.lineTo(15.723022f, 3.2699792f);
        path2.cubicTo(16.269756f, 2.7232454f, 17.156187f, 2.7232454f, 17.70292f, 3.2699792f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
