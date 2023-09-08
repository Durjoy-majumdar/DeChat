package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_pref_switch_mask_icon_dark */
public class checkbox_pref_switch_mask_icon_dark extends C24542c {
    private final int height = 24;
    private final int width = 46;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 46;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(1279674184);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(12.0f, 0.0f);
            instancePath.lineTo(34.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(40.62742f, -1.2174367E-15f, 46.0f, 5.372583f, 46.0f, 12.0f);
            path.cubicTo(46.0f, 18.627417f, 40.62742f, 24.0f, 34.0f, 24.0f);
            instancePath.lineTo(12.0f, 24.0f);
            Path path2 = instancePath;
            path2.cubicTo(5.372583f, 24.0f, 8.116245E-16f, 18.627417f, 0.0f, 12.0f);
            path2.cubicTo(-8.116245E-16f, 5.372583f, 5.372583f, 1.2174367E-15f, 12.0f, 0.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(1291845631);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(12.0f, 2.0f);
            Path path3 = instancePath2;
            path3.cubicTo(17.522848f, 2.0f, 22.0f, 6.4771523f, 22.0f, 12.0f);
            path3.cubicTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f);
            path3.cubicTo(6.4771523f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f);
            path3.cubicTo(2.0f, 6.4771523f, 6.4771523f, 2.0f, 12.0f, 2.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
