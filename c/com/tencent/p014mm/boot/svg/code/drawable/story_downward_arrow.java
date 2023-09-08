package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.story_downward_arrow */
public class story_downward_arrow extends C24542c {
    private final int height = 60;
    private final int width = 42;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 42;
        }
        if (i == 1) {
            return 60;
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
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(35.841797f, 33.930176f);
            instancePath.lineTo(21.0f, 48.771973f);
            instancePath.lineTo(6.158203f, 33.930176f);
            instancePath.lineTo(8.872559f, 31.21582f);
            instancePath.lineTo(19.08252f, 41.450684f);
            instancePath.lineTo(19.08252f, 12.065918f);
            instancePath.lineTo(22.91748f, 12.065918f);
            instancePath.lineTo(22.91748f, 41.450684f);
            instancePath.lineTo(33.12744f, 31.21582f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
