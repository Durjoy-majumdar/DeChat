package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.count_down_4 */
public class count_down_4 extends C24542c {
    private final int height = 80;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 80;
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
            instancePaint3.setColor(-1);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(45.344f, 14.0f);
            instancePath.lineTo(52.544f, 14.0f);
            instancePath.lineTo(52.544f, 47.984f);
            instancePath.lineTo(60.32f, 47.984f);
            instancePath.lineTo(60.32f, 54.248f);
            instancePath.lineTo(52.544f, 54.248f);
            instancePath.lineTo(52.544f, 65.408f);
            instancePath.lineTo(45.056f, 65.408f);
            instancePath.lineTo(45.056f, 54.248f);
            instancePath.lineTo(20.0f, 54.248f);
            instancePath.lineTo(20.0f, 46.832f);
            instancePath.lineTo(45.344f, 14.0f);
            instancePath.close();
            instancePath.moveTo(44.84f, 23.936f);
            instancePath.lineTo(26.408f, 47.984f);
            instancePath.lineTo(45.056f, 47.984f);
            instancePath.lineTo(45.056f, 23.936f);
            instancePath.lineTo(44.84f, 23.936f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
