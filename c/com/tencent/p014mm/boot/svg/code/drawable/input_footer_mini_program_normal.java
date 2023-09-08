package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.input_footer_mini_program_normal */
public class input_footer_mini_program_normal extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-8617594);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(96.0f, 48.0f);
        Path path = instancePath;
        instancePath.cubicTo(96.0f, 74.50967f, 74.50967f, 96.0f, 48.0f, 96.0f);
        Path path2 = path;
        path2.cubicTo(21.490332f, 96.0f, 0.0f, 74.50967f, 0.0f, 48.0f);
        path2.cubicTo(0.0f, 21.490332f, 21.490332f, 0.0f, 48.0f, 0.0f);
        path2.cubicTo(74.50967f, 0.0f, 96.0f, 21.490332f, 96.0f, 48.0f);
        path.close();
        Path path3 = path;
        path3.moveTo(2.2325583f, 48.0f);
        path3.cubicTo(2.2325583f, 73.27666f, 22.72334f, 93.76744f, 48.0f, 93.76744f);
        Path path4 = path;
        path4.cubicTo(73.27666f, 93.76744f, 93.76744f, 73.27666f, 93.76744f, 48.0f);
        path4.cubicTo(93.76744f, 22.72334f, 73.27666f, 2.2325583f, 48.0f, 2.2325583f);
        path4.cubicTo(22.72334f, 2.2325583f, 2.2325583f, 22.72334f, 2.2325583f, 48.0f);
        path.close();
        Path path5 = path;
        WeChatSVGRenderC2Java.setFillType(path5, 1);
        canvas.drawPath(path5, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Paint instancePaint7 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-8617594);
        instancePaint7.setStrokeWidth(2.0f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(61.0f, 51.0f);
        Path path6 = instancePath2;
        path6.cubicTo(59.552845f, 51.154545f, 58.8374f, 50.327274f, 60.0f, 49.0f);
        path6.cubicTo(59.672085f, 48.436363f, 60.506775f, 47.727272f, 62.0f, 48.0f);
        path6.cubicTo(65.03794f, 46.663635f, 67.54201f, 43.945454f, 68.0f, 41.0f);
        path6.cubicTo(67.54201f, 36.736362f, 63.845528f, 33.545456f, 60.0f, 33.0f);
        path6.cubicTo(54.544716f, 33.545456f, 50.84824f, 36.736362f, 51.0f, 41.0f);
        instancePath2.lineTo(51.0f, 58.0f);
        Path path7 = instancePath2;
        path7.cubicTo(50.84824f, 64.27273f, 45.482384f, 69.0f, 39.0f, 69.0f);
        path7.cubicTo(32.365852f, 69.0f, 27.0f, 64.27273f, 27.0f, 58.0f);
        path7.cubicTo(27.0f, 53.163635f, 31.17344f, 48.79091f, 37.0f, 48.0f);
        path7.cubicTo(38.20867f, 47.96364f, 38.80488f, 49.618183f, 38.0f, 50.0f);
        path7.cubicTo(37.759224f, 50.496105f, 37.373985f, 51.390907f, 36.0f, 51.0f);
        path7.cubicTo(32.96206f, 52.454544f, 30.457994f, 55.172726f, 30.0f, 58.0f);
        path7.cubicTo(30.457994f, 62.263638f, 34.154472f, 65.454544f, 38.0f, 66.0f);
        path7.cubicTo(43.455284f, 65.454544f, 47.15176f, 62.263638f, 47.0f, 58.0f);
        instancePath2.lineTo(47.0f, 41.0f);
        Path path8 = instancePath2;
        path8.cubicTo(47.15176f, 34.727272f, 52.517616f, 30.0f, 59.0f, 30.0f);
        path8.cubicTo(65.63415f, 30.0f, 71.0f, 34.727272f, 71.0f, 41.0f);
        path8.cubicTo(71.0f, 45.954544f, 66.82656f, 50.20909f, 61.0f, 51.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.drawPath(instancePath2, instancePaint7);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
