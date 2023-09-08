package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.shortvideo_pause_btn */
public class shortvideo_pause_btn extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 120;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(637534208);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(60.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
        path.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
        path.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
        path.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(60.0f, 0.0f);
        Path path2 = instancePath2;
        path2.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
        path2.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
        path2.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
        path2.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
        instancePath2.close();
        instancePath2.moveTo(60.0f, 3.6f);
        Path path3 = instancePath2;
        path3.cubicTo(28.851141f, 3.6f, 3.6f, 28.851141f, 3.6f, 60.0f);
        path3.cubicTo(3.6f, 91.14886f, 28.851141f, 116.4f, 60.0f, 116.4f);
        path3.cubicTo(91.14886f, 116.4f, 116.4f, 91.14886f, 116.4f, 60.0f);
        path3.cubicTo(116.4f, 28.851141f, 91.14886f, 3.6f, 60.0f, 3.6f);
        instancePath2.close();
        instancePath2.moveTo(45.615383f, 38.0f);
        instancePath2.lineTo(50.846153f, 38.0f);
        instancePath2.cubicTo(52.290592f, 38.0f, 53.46154f, 39.313297f, 53.46154f, 40.933334f);
        instancePath2.lineTo(53.46154f, 79.066666f);
        Path path4 = instancePath2;
        path4.cubicTo(53.46154f, 80.6867f, 52.290592f, 82.0f, 50.846153f, 82.0f);
        instancePath2.lineTo(45.615383f, 82.0f);
        path4.cubicTo(44.170948f, 82.0f, 43.0f, 80.6867f, 43.0f, 79.066666f);
        instancePath2.lineTo(43.0f, 40.933334f);
        instancePath2.cubicTo(43.0f, 39.313297f, 44.170948f, 38.0f, 45.615383f, 38.0f);
        instancePath2.close();
        instancePath2.moveTo(69.15385f, 38.0f);
        instancePath2.lineTo(74.38461f, 38.0f);
        instancePath2.cubicTo(75.829056f, 38.0f, 77.0f, 39.313297f, 77.0f, 40.933334f);
        instancePath2.lineTo(77.0f, 79.066666f);
        Path path5 = instancePath2;
        path5.cubicTo(77.0f, 80.6867f, 75.829056f, 82.0f, 74.38461f, 82.0f);
        instancePath2.lineTo(69.15385f, 82.0f);
        path5.cubicTo(67.70941f, 82.0f, 66.53846f, 80.6867f, 66.53846f, 79.066666f);
        instancePath2.lineTo(66.53846f, 40.933334f);
        path5.cubicTo(66.53846f, 39.313297f, 67.70941f, 38.0f, 69.15385f, 38.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
