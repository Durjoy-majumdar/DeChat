package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.offline_info_icon */
public class offline_info_icon extends C24542c {
    private final int height = 165;
    private final int width = 165;

    public int doCommand(int i, Object... objArr) {
        int i2 = 165;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-4671304);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(165.0f, 83.51852f);
                Path path = instancePath;
                path.cubicTo(165.0f, 36.935555f, 128.06444f, 0.0f, 81.48148f, 0.0f);
                path.cubicTo(36.935555f, 0.0f, 0.0f, 36.935555f, 0.0f, 83.51852f);
                path.cubicTo(0.0f, 128.06444f, 36.935555f, 165.0f, 81.48148f, 165.0f);
                path.cubicTo(128.06444f, 165.0f, 165.0f, 128.06444f, 165.0f, 83.51852f);
                instancePath.close();
                instancePath.moveTo(156.0f, 83.40741f);
                Path path2 = instancePath;
                path2.cubicTo(156.0f, 41.906223f, 123.09378f, 9.0f, 81.59259f, 9.0f);
                path2.cubicTo(41.906223f, 9.0f, 9.0f, 41.906223f, 9.0f, 83.40741f);
                path2.cubicTo(9.0f, 123.09378f, 41.906223f, 156.0f, 81.59259f, 156.0f);
                path2.cubicTo(123.09378f, 156.0f, 156.0f, 123.09378f, 156.0f, 83.40741f);
                instancePath.close();
                instancePath.moveTo(81.06782f, 123.30645f);
                path2.cubicTo(79.40914f, 123.30645f, 78.03121f, 121.96418f, 77.99018f, 120.31069f);
                instancePath.lineTo(76.660355f, 66.71527f);
                instancePath.cubicTo(76.6193f, 65.06076f, 77.919846f, 63.719513f, 79.586006f, 63.719513f);
                instancePath.lineTo(85.413994f, 63.719513f);
                instancePath.cubicTo(87.07084f, 63.719513f, 88.38068f, 65.06178f, 88.339645f, 66.71527f);
                instancePath.lineTo(87.00982f, 120.31069f);
                instancePath.cubicTo(86.968765f, 121.9652f, 85.58817f, 123.30645f, 83.93218f, 123.30645f);
                instancePath.lineTo(81.06782f, 123.30645f);
                instancePath.close();
                instancePath.moveTo(82.5f, 41.693546f);
                Path path3 = instancePath;
                path3.cubicTo(86.41944f, 41.693546f, 89.59677f, 44.87088f, 89.59677f, 48.79032f);
                path3.cubicTo(89.59677f, 52.709763f, 86.41944f, 55.887096f, 82.5f, 55.887096f);
                path3.cubicTo(78.58056f, 55.887096f, 75.40323f, 52.709763f, 75.40323f, 48.79032f);
                path3.cubicTo(75.40323f, 44.87088f, 78.58056f, 41.693546f, 82.5f, 41.693546f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
