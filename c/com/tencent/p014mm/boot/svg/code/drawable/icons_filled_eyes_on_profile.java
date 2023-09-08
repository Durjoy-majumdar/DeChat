package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_eyes_on_profile */
public class icons_filled_eyes_on_profile extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(12.0f, 17.8f);
                Path path = instancePath;
                path.cubicTo(16.034317f, 17.8f, 19.686224f, 15.549875f, 21.647873f, 12.0f);
                path.cubicTo(19.686224f, 8.450126f, 16.034317f, 6.2f, 12.0f, 6.2f);
                path.cubicTo(7.9656825f, 6.2f, 4.313775f, 8.450126f, 2.3521278f, 12.0f);
                path.cubicTo(4.313775f, 15.549875f, 7.9656825f, 17.8f, 12.0f, 17.8f);
                instancePath.close();
                instancePath.moveTo(12.0f, 5.0f);
                Path path2 = instancePath;
                path2.cubicTo(16.80779f, 5.0f, 20.972063f, 7.8476276f, 23.0f, 12.0f);
                path2.cubicTo(20.972063f, 16.152372f, 16.80779f, 19.0f, 12.0f, 19.0f);
                path2.cubicTo(7.1922092f, 19.0f, 3.0279365f, 16.152372f, 1.0f, 12.0f);
                path2.cubicTo(3.0279365f, 7.8476276f, 7.1922092f, 5.0f, 12.0f, 5.0f);
                instancePath.close();
                instancePath.moveTo(12.0f, 14.8f);
                Path path3 = instancePath;
                path3.cubicTo(13.546397f, 14.8f, 14.8f, 13.546397f, 14.8f, 12.0f);
                path3.cubicTo(14.8f, 10.453603f, 13.546397f, 9.2f, 12.0f, 9.2f);
                path3.cubicTo(10.453603f, 9.2f, 9.2f, 10.453603f, 9.2f, 12.0f);
                path3.cubicTo(9.2f, 13.546397f, 10.453603f, 14.8f, 12.0f, 14.8f);
                instancePath.close();
                instancePath.moveTo(12.0f, 16.0f);
                Path path4 = instancePath;
                path4.cubicTo(9.790861f, 16.0f, 8.0f, 14.209139f, 8.0f, 12.0f);
                path4.cubicTo(8.0f, 9.790861f, 9.790861f, 8.0f, 12.0f, 8.0f);
                path4.cubicTo(14.209139f, 8.0f, 16.0f, 9.790861f, 16.0f, 12.0f);
                path4.cubicTo(16.0f, 14.209139f, 14.209139f, 16.0f, 12.0f, 16.0f);
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
