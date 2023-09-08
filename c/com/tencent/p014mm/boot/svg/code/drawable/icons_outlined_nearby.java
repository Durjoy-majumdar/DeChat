package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_nearby */
public class icons_outlined_nearby extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePath.moveTo(21.0f, 17.4f);
        Path path = instancePath;
        path.cubicTo(23.15391f, 17.4f, 24.9f, 15.653911f, 24.9f, 13.5f);
        path.cubicTo(24.9f, 11.346089f, 23.15391f, 9.6f, 21.0f, 9.6f);
        path.cubicTo(18.84609f, 9.6f, 17.1f, 11.346089f, 17.1f, 13.5f);
        path.cubicTo(17.1f, 15.653911f, 18.84609f, 17.4f, 21.0f, 17.4f);
        instancePath.close();
        instancePath.moveTo(21.0f, 21.0f);
        path.cubicTo(16.857864f, 21.0f, 13.5f, 17.642136f, 13.5f, 13.5f);
        path.cubicTo(13.5f, 9.357864f, 16.857864f, 6.0f, 21.0f, 6.0f);
        path.cubicTo(25.142136f, 6.0f, 28.5f, 9.357864f, 28.5f, 13.5f);
        path.cubicTo(28.5f, 17.642136f, 25.142136f, 21.0f, 21.0f, 21.0f);
        instancePath.close();
        instancePath.moveTo(51.0f, 17.4f);
        path.cubicTo(53.15391f, 17.4f, 54.9f, 15.653911f, 54.9f, 13.5f);
        path.cubicTo(54.9f, 11.346089f, 53.15391f, 9.6f, 51.0f, 9.6f);
        path.cubicTo(48.84609f, 9.6f, 47.1f, 11.346089f, 47.1f, 13.5f);
        path.cubicTo(47.1f, 15.653911f, 48.84609f, 17.4f, 51.0f, 17.4f);
        instancePath.close();
        instancePath.moveTo(51.0f, 21.0f);
        path.cubicTo(46.857864f, 21.0f, 43.5f, 17.642136f, 43.5f, 13.5f);
        path.cubicTo(43.5f, 9.357864f, 46.857864f, 6.0f, 51.0f, 6.0f);
        path.cubicTo(55.142136f, 6.0f, 58.5f, 9.357864f, 58.5f, 13.5f);
        path.cubicTo(58.5f, 17.642136f, 55.142136f, 21.0f, 51.0f, 21.0f);
        instancePath.close();
        instancePath.moveTo(18.23489f, 62.4f);
        instancePath.lineTo(23.76511f, 62.4f);
        instancePath.lineTo(27.209145f, 30.25568f);
        Path path2 = instancePath;
        path2.cubicTo(27.218243f, 30.170757f, 27.222803f, 30.08541f, 27.222803f, 30.0f);
        path2.cubicTo(27.222803f, 28.674517f, 26.148285f, 27.6f, 24.822802f, 27.6f);
        instancePath.lineTo(17.177198f, 27.6f);
        path2.cubicTo(17.09179f, 27.6f, 17.006441f, 27.604559f, 16.921518f, 27.613659f);
        path2.cubicTo(15.603578f, 27.754866f, 14.649648f, 28.937738f, 14.790855f, 30.25568f);
        instancePath.lineTo(18.23489f, 62.4f);
        instancePath.close();
        instancePath.moveTo(17.177198f, 24.0f);
        instancePath.lineTo(24.822802f, 24.0f);
        path2.cubicTo(28.13651f, 24.0f, 30.822802f, 26.68629f, 30.822802f, 30.0f);
        path2.cubicTo(30.822802f, 30.213522f, 30.811405f, 30.426891f, 30.788658f, 30.639198f);
        instancePath.lineTo(27.287186f, 63.3196f);
        path2.cubicTo(27.123856f, 64.84402f, 25.837402f, 66.0f, 24.304258f, 66.0f);
        instancePath.lineTo(17.695742f, 66.0f);
        path2.cubicTo(16.162598f, 66.0f, 14.876144f, 64.84402f, 14.712814f, 63.3196f);
        instancePath.lineTo(11.211343f, 30.639198f);
        path2.cubicTo(10.858323f, 27.344349f, 13.243148f, 24.387165f, 16.537998f, 24.034145f);
        path2.cubicTo(16.750305f, 24.011398f, 16.963676f, 24.0f, 17.177198f, 24.0f);
        instancePath.close();
        instancePath.moveTo(53.76511f, 62.4f);
        instancePath.lineTo(57.209145f, 30.25568f);
        Path path3 = instancePath;
        path3.cubicTo(57.218243f, 30.170757f, 57.2228f, 30.08541f, 57.2228f, 30.0f);
        path3.cubicTo(57.2228f, 28.674517f, 56.148285f, 27.6f, 54.822803f, 27.6f);
        instancePath.lineTo(47.177197f, 27.6f);
        path3.cubicTo(47.09179f, 27.6f, 47.00644f, 27.604559f, 46.921516f, 27.613659f);
        path3.cubicTo(45.603577f, 27.754866f, 44.649647f, 28.937738f, 44.790855f, 30.25568f);
        instancePath.lineTo(48.23489f, 62.4f);
        instancePath.lineTo(53.76511f, 62.4f);
        instancePath.close();
        instancePath.moveTo(47.177197f, 24.0f);
        instancePath.lineTo(54.822803f, 24.0f);
        path3.cubicTo(58.136513f, 24.0f, 60.822803f, 26.68629f, 60.822803f, 30.0f);
        path3.cubicTo(60.822803f, 30.213522f, 60.811405f, 30.426891f, 60.78866f, 30.639198f);
        instancePath.lineTo(57.287186f, 63.3196f);
        path3.cubicTo(57.123856f, 64.84402f, 55.837402f, 66.0f, 54.304256f, 66.0f);
        instancePath.lineTo(47.695744f, 66.0f);
        path3.cubicTo(46.162598f, 66.0f, 44.876144f, 64.84402f, 44.712814f, 63.3196f);
        instancePath.lineTo(41.21134f, 30.639198f);
        path3.cubicTo(40.858322f, 27.344349f, 43.24315f, 24.387165f, 46.538f, 24.034145f);
        path3.cubicTo(46.750305f, 24.011398f, 46.963676f, 24.0f, 47.177197f, 24.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
