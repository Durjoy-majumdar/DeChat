package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.photo_edit_mark_sub */
public class photo_edit_mark_sub extends C24542c {
    private final int height = 24;
    private final int width = 30;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 30;
        }
        if (i == 1) {
            return 24;
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
            instancePaint3.setColor(-1);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(26.0f, 0.0f);
            instancePath.lineTo(26.0f, 20.0f);
            instancePath.lineTo(0.0f, 20.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(24.0f, 2.0f);
            instancePath.lineTo(2.0f, 2.0f);
            instancePath.lineTo(2.0f, 17.0f);
            instancePath.lineTo(24.0f, 17.0f);
            instancePath.lineTo(24.0f, 2.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(28.0f, 23.0f);
            instancePath2.lineTo(29.0f, 23.0f);
            instancePath2.lineTo(29.0f, 3.0f);
            instancePath2.lineTo(27.0f, 3.0f);
            instancePath2.lineTo(27.0f, 21.0f);
            instancePath2.lineTo(3.0f, 21.0f);
            instancePath2.lineTo(3.0f, 23.0f);
            instancePath2.lineTo(28.0f, 23.0f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(19.784946f, 8.898396f);
            instancePath3.lineTo(15.462585f, 11.916007f);
            instancePath3.lineTo(8.518518f, 6.5454545f);
            instancePath3.lineTo(0.0f, 13.368984f);
            instancePath3.lineTo(0.0f, 18.545454f);
            instancePath3.lineTo(25.555555f, 18.545454f);
            instancePath3.lineTo(25.555555f, 13.368984f);
            instancePath3.close();
            WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
