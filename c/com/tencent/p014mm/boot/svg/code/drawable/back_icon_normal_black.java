package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.back_icon_normal_black */
public class back_icon_normal_black extends C24542c {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(48.054966f, 24.0f);
            Path path = instancePath;
            path.cubicTo(49.47408f, 25.437006f, 50.893192f, 26.874012f, 52.292316f, 28.320997f);
            path.cubicTo(46.73579f, 33.86944f, 41.179264f, 39.4079f, 35.63273f, 44.95634f);
            path.cubicTo(47.755154f, 44.96632f, 59.877575f, 44.95634f, 72.0f, 44.96632f);
            instancePath.lineTo(72.0f, 51.01372f);
            instancePath.lineTo(35.58276f, 51.01372f);
            Path path2 = instancePath;
            path2.cubicTo(41.129295f, 56.612057f, 46.725796f, 62.15052f, 52.292316f, 67.7289f);
            path2.cubicTo(50.873203f, 69.15592f, 49.444096f, 70.572975f, 48.01499f, 72.0f);
            path2.cubicTo(40.009995f, 64.00665f, 32.004997f, 56.013306f, 24.0f, 48.01996f);
            path2.cubicTo(32.01499f, 40.016632f, 40.02998f, 32.003326f, 48.054966f, 24.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
