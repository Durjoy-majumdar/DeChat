package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ui_rescoures_checkbox_unselected */
public class ui_rescoures_checkbox_unselected extends C24542c {
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(68.4f, 36.444443f);
            Path path = instancePath;
            path.cubicTo(68.4f, 18.105558f, 53.89444f, 3.6f, 35.555557f, 3.6f);
            path.cubicTo(17.983149f, 3.6f, 3.6f, 18.230572f, 3.6f, 36.444443f);
            path.cubicTo(3.6f, 53.89444f, 18.105558f, 68.4f, 35.555557f, 68.4f);
            path.cubicTo(53.76943f, 68.4f, 68.4f, 54.01685f, 68.4f, 36.444443f);
            instancePath.close();
            instancePath.moveTo(72.0f, 36.444443f);
            Path path2 = instancePath;
            path2.cubicTo(72.0f, 55.882668f, 55.882668f, 72.0f, 35.555557f, 72.0f);
            path2.cubicTo(16.117332f, 72.0f, 0.0f, 55.882668f, 0.0f, 36.444443f);
            path2.cubicTo(0.0f, 16.117332f, 16.117332f, 0.0f, 35.555557f, 0.0f);
            path2.cubicTo(55.882668f, 0.0f, 72.0f, 16.117332f, 72.0f, 36.444443f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
