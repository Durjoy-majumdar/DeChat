package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.friendactivity_comment_icon_golden_normal */
public class friendactivity_comment_icon_golden_normal extends C24542c {
    private final int height = 46;
    private final int width = 66;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 66;
        }
        if (i == 1) {
            return 46;
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
            instancePaint3.setColor(-4547478);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(12.0f, 31.470589f);
            instancePath.lineTo(12.0f, 46.0f);
            instancePath.lineTo(66.0f, 46.0f);
            instancePath.lineTo(66.0f, 0.0f);
            instancePath.lineTo(12.0f, 0.0f);
            instancePath.lineTo(12.0f, 14.529412f);
            instancePath.lineTo(0.0f, 23.0f);
            instancePath.lineTo(12.0f, 31.470589f);
            instancePath.close();
            instancePath.moveTo(27.0f, 29.0f);
            Path path = instancePath;
            path.cubicTo(30.31371f, 29.0f, 33.0f, 26.31371f, 33.0f, 23.0f);
            path.cubicTo(33.0f, 19.68629f, 30.31371f, 17.0f, 27.0f, 17.0f);
            path.cubicTo(23.68629f, 17.0f, 21.0f, 19.68629f, 21.0f, 23.0f);
            path.cubicTo(21.0f, 26.31371f, 23.68629f, 29.0f, 27.0f, 29.0f);
            instancePath.close();
            instancePath.moveTo(51.0f, 29.0f);
            Path path2 = instancePath;
            path2.cubicTo(54.31371f, 29.0f, 57.0f, 26.31371f, 57.0f, 23.0f);
            path2.cubicTo(57.0f, 19.68629f, 54.31371f, 17.0f, 51.0f, 17.0f);
            path2.cubicTo(47.68629f, 17.0f, 45.0f, 19.68629f, 45.0f, 23.0f);
            path2.cubicTo(45.0f, 26.31371f, 47.68629f, 29.0f, 51.0f, 29.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
