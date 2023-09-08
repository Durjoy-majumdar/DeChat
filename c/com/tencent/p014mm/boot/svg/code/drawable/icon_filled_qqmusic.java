package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_qqmusic */
public class icon_filled_qqmusic extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(18.372496f, 2.8502698f);
                instancePath.lineTo(18.388624f, 3.0441446f);
                Path path = instancePath;
                path.cubicTo(21.180046f, 5.038913f, 23.0f, 8.30692f, 23.0f, 12.0f);
                path.cubicTo(23.0f, 18.075132f, 18.075132f, 23.0f, 12.0f, 23.0f);
                path.cubicTo(5.9248676f, 23.0f, 1.0f, 18.075132f, 1.0f, 12.0f);
                path.cubicTo(1.0f, 5.9248676f, 5.9248676f, 1.0f, 12.0f, 1.0f);
                path.cubicTo(13.508068f, 1.0f, 14.945256f, 1.3034767f, 16.253824f, 1.8526912f);
                path.cubicTo(14.491923f, 2.6855428f, 13.080966f, 3.0549493f, 9.4463215f, 3.365224f);
                path.cubicTo(8.114638f, 3.419226f, 7.822844f, 3.9873922f, 8.570937f, 5.0697227f);
                instancePath.lineTo(8.6657f, 5.20207f);
                instancePath.lineTo(13.248832f, 13.1414995f);
                Path path2 = instancePath;
                path2.cubicTo(12.849658f, 13.049127f, 12.431204f, 13.0f, 12.0f, 13.0f);
                path2.cubicTo(9.238576f, 13.0f, 7.0f, 15.014719f, 7.0f, 17.5f);
                path2.cubicTo(7.0f, 19.985281f, 9.238576f, 22.0f, 12.0f, 22.0f);
                path2.cubicTo(14.761424f, 22.0f, 17.0f, 19.985281f, 17.0f, 17.5f);
                path2.cubicTo(17.0f, 16.89559f, 16.867601f, 16.31901f, 16.62878f, 15.792655f);
                instancePath.lineTo(16.51999f, 15.570215f);
                instancePath.lineTo(16.478785f, 15.497319f);
                instancePath.lineTo(16.440762f, 15.43f);
                instancePath.lineTo(16.440762f, 15.43f);
                instancePath.lineTo(16.401527f, 15.363338f);
                instancePath.lineTo(12.0f, 7.7038918f);
                instancePath.lineTo(12.371978f, 7.4556355f);
                instancePath.cubicTo(14.694061f, 5.8769765f, 16.342192f, 4.1984005f, 17.31637f, 2.4199083f);
                instancePath.lineTo(17.315317f, 2.4193087f);
                Path path3 = instancePath;
                path3.cubicTo(17.750837f, 1.5128536f, 17.97853f, 1.0038981f, 17.998402f, 0.8924422f);
                path3.cubicTo(18.019985f, 0.77137804f, 18.248217f, 1.4391421f, 18.372496f, 2.8502698f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
