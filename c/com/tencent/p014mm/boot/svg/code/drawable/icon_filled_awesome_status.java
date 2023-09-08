package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_awesome_status */
public class icon_filled_awesome_status extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(12.664062f, 19.394531f);
            Path path = instancePath;
            path.cubicTo(18.523438f, 13.535156f, 28.019531f, 13.535156f, 33.878906f, 19.394531f);
            path.cubicTo(34.42578f, 19.941406f, 35.132812f, 20.625f, 36.0f, 21.441406f);
            path.cubicTo(36.867188f, 20.625f, 37.57422f, 19.941406f, 38.121094f, 19.394531f);
            path.cubicTo(43.98047f, 13.535156f, 53.476562f, 13.535156f, 59.335938f, 19.394531f);
            path.cubicTo(65.13672f, 25.195312f, 65.19141f, 34.57422f, 59.496094f, 40.441406f);
            instancePath.lineTo(38.121094f, 61.820312f);
            instancePath.cubicTo(36.94922f, 62.992188f, 35.05078f, 62.992188f, 33.878906f, 61.820312f);
            instancePath.lineTo(12.503906f, 40.445312f);
            instancePath.cubicTo(6.808594f, 34.57422f, 6.863281f, 25.195312f, 12.664062f, 19.394531f);
            instancePath.close();
            instancePath.moveTo(12.664062f, 19.394531f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
