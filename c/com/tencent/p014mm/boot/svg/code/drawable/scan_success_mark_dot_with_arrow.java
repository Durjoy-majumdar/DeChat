package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.scan_success_mark_dot_with_arrow */
public class scan_success_mark_dot_with_arrow extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = 40;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
                instancePaint3.setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                instancePaint4.setColor(-435699360);
                instancePaint5.setColor(-419430401);
                instancePaint5.setStrokeWidth(2.5f);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(20.0f, 1.25f);
                Path path = instancePath;
                path.cubicTo(30.35534f, 1.25f, 38.75f, 9.64466f, 38.75f, 20.0f);
                path.cubicTo(38.75f, 30.35534f, 30.35534f, 38.75f, 20.0f, 38.75f);
                path.cubicTo(9.64466f, 38.75f, 1.25f, 30.35534f, 1.25f, 20.0f);
                path.cubicTo(1.25f, 9.64466f, 9.64466f, 1.25f, 20.0f, 1.25f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint4);
                canvas.drawPath(instancePath, instancePaint5);
                canvas.restore();
                canvas.save();
                Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
                instancePaint6.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(21.5f, 13.64f);
                instancePath2.lineTo(27.156855f, 19.296854f);
                instancePath2.cubicTo(27.547379f, 19.687378f, 27.547379f, 20.320543f, 27.156855f, 20.711067f);
                instancePath2.lineTo(21.5f, 26.367922f);
                instancePath2.lineTo(19.732233f, 24.600155f);
                instancePath2.lineTo(23.081f, 21.25f);
                instancePath2.lineTo(13.0f, 21.25f);
                instancePath2.lineTo(13.0f, 18.75f);
                instancePath2.lineTo(23.075f, 18.75f);
                instancePath2.lineTo(19.732233f, 15.407767f);
                instancePath2.lineTo(21.5f, 13.64f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint6);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
