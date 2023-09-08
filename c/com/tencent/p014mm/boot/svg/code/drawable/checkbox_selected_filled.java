package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_filled */
public class checkbox_selected_filled extends C24542c {
    private final int height = 70;
    private final int width = 70;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 70;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16268960);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(34.5679f, 0.0f);
            Path path = instancePath;
            path.cubicTo(54.33037f, 0.0f, 70.0f, 15.66963f, 70.0f, 35.4321f);
            path.cubicTo(70.0f, 54.33037f, 54.33037f, 70.0f, 34.5679f, 70.0f);
            path.cubicTo(15.66963f, 70.0f, 0.0f, 54.33037f, 0.0f, 35.4321f);
            path.cubicTo(0.0f, 15.66963f, 15.66963f, 0.0f, 34.5679f, 0.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(52.03301f, 23.0f);
            instancePath2.lineTo(30.091883f, 44.941124f);
            instancePath2.lineTo(20.18198f, 35.031223f);
            instancePath2.lineTo(17.0f, 38.213203f);
            instancePath2.lineTo(27.970562f, 49.183765f);
            instancePath2.cubicTo(29.142136f, 50.35534f, 31.04163f, 50.35534f, 32.213203f, 49.183765f);
            instancePath2.lineTo(55.21499f, 26.18198f);
            instancePath2.lineTo(52.03301f, 23.0f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
