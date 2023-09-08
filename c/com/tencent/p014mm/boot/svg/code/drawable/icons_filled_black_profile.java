package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_black_profile */
public class icons_filled_black_profile extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 32;
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
            canvas.saveLayerAlpha((RectF) null, 204, 31);
            canvas.restore();
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(16.0f, 3.1f);
            Path path = instancePath;
            path.cubicTo(23.124474f, 3.1f, 28.9f, 8.875526f, 28.9f, 16.0f);
            path.cubicTo(28.9f, 23.124474f, 23.124474f, 28.9f, 16.0f, 28.9f);
            path.cubicTo(8.875526f, 28.9f, 3.1f, 23.124474f, 3.1f, 16.0f);
            path.cubicTo(3.1f, 8.875526f, 8.875526f, 3.1f, 16.0f, 3.1f);
            instancePath.close();
            instancePath.moveTo(7.3629313f, 9.02724f);
            Path path2 = instancePath;
            path2.cubicTo(5.822522f, 10.932937f, 4.9f, 13.358735f, 4.9f, 16.0f);
            path2.cubicTo(4.9f, 22.130362f, 9.869639f, 27.1f, 16.0f, 27.1f);
            path2.cubicTo(18.641266f, 27.1f, 21.067064f, 26.177479f, 22.972761f, 24.637068f);
            instancePath.close();
            instancePath.moveTo(16.0f, 4.9f);
            instancePath.cubicTo(13.231251f, 4.9f, 10.69927f, 5.9137244f, 8.754966f, 7.5902653f);
            instancePath.lineTo(24.409735f, 23.245033f);
            Path path3 = instancePath;
            path3.cubicTo(26.086275f, 21.30073f, 27.1f, 18.76875f, 27.1f, 16.0f);
            path3.cubicTo(27.1f, 9.869639f, 22.130362f, 4.9f, 16.0f, 4.9f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
