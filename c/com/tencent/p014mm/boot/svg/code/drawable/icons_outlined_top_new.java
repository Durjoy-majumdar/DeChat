package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_top_new */
public class icons_outlined_top_new extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(31.463224f, 20.921848f);
                instancePath.lineTo(15.078757f, 37.81709f);
                instancePath.cubicTo(14.047418f, 38.88058f, 13.470644f, 40.30383f, 13.470644f, 41.78527f);
                instancePath.lineTo(13.487794f, 42.230724f);
                instancePath.cubicTo(13.715041f, 45.170555f, 16.172527f, 47.48527f, 19.170645f, 47.48527f);
                instancePath.lineTo(23.7f, 47.484f);
                instancePath.lineTo(23.7f, 59.805664f);
                instancePath.cubicTo(23.7f, 62.45663f, 25.849033f, 64.60566f, 28.5f, 64.60566f);
                instancePath.lineTo(43.5f, 64.60566f);
                instancePath.lineTo(43.936897f, 64.586044f);
                instancePath.cubicTo(46.383114f, 64.36533f, 48.3f, 62.309353f, 48.3f, 59.805664f);
                instancePath.lineTo(48.3f, 47.484f);
                instancePath.lineTo(52.823856f, 47.48527f);
                Path path = instancePath;
                path.cubicTo(54.30667f, 47.48527f, 55.731125f, 46.907433f, 56.794884f, 45.874397f);
                path.cubicTo(59.05324f, 43.68126f, 59.106117f, 40.072605f, 56.91298f, 37.814243f);
                instancePath.lineTo(40.37172f, 20.785122f);
                instancePath.cubicTo(37.87395f, 18.362865f, 33.885483f, 18.42408f, 31.463224f, 20.921848f);
                instancePath.close();
                instancePath.moveTo(35.985f, 25.737f);
                instancePath.lineTo(50.694f, 40.884f);
                instancePath.lineTo(41.7f, 40.885273f);
                instancePath.lineTo(41.7f, 58.005f);
                instancePath.lineTo(30.3f, 58.005f);
                instancePath.lineTo(30.3f, 40.885273f);
                instancePath.lineTo(21.297f, 40.884f);
                instancePath.lineTo(35.985f, 25.737f);
                instancePath.close();
                instancePath.moveTo(60.0f, 9.0f);
                instancePath.lineTo(60.0f, 15.6f);
                instancePath.lineTo(12.0f, 15.6f);
                instancePath.lineTo(12.0f, 9.0f);
                instancePath.lineTo(60.0f, 9.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
