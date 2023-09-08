package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_table */
public class icons_outlined_table extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(18.0f, 2.0f);
        Path path = instancePath;
        path.cubicTo(19.10457f, 2.0f, 20.0f, 2.8954306f, 20.0f, 4.0f);
        instancePath.lineTo(20.0f, 20.0f);
        path.cubicTo(20.0f, 21.10457f, 19.10457f, 22.0f, 18.0f, 22.0f);
        instancePath.lineTo(6.0f, 22.0f);
        Path path2 = instancePath;
        path2.cubicTo(4.8954306f, 22.0f, 4.0f, 21.10457f, 4.0f, 20.0f);
        instancePath.lineTo(4.0f, 4.0f);
        path2.cubicTo(4.0f, 2.8954306f, 4.8954306f, 2.0f, 6.0f, 2.0f);
        instancePath.lineTo(18.0f, 2.0f);
        instancePath.close();
        instancePath.moveTo(18.0f, 3.2f);
        instancePath.lineTo(6.0f, 3.2f);
        instancePath.cubicTo(5.558172f, 3.2f, 5.2f, 3.5581722f, 5.2f, 4.0f);
        instancePath.lineTo(5.2f, 20.0f);
        Path path3 = instancePath;
        path3.cubicTo(5.2f, 20.441828f, 5.558172f, 20.8f, 6.0f, 20.8f);
        instancePath.lineTo(18.0f, 20.8f);
        path3.cubicTo(18.441828f, 20.8f, 18.8f, 20.441828f, 18.8f, 20.0f);
        instancePath.lineTo(18.8f, 4.0f);
        path3.cubicTo(18.8f, 3.5581722f, 18.441828f, 3.2f, 18.0f, 3.2f);
        instancePath.close();
        instancePath.moveTo(7.5f, 16.0f);
        path3.cubicTo(8.052285f, 16.0f, 8.5f, 16.447716f, 8.5f, 17.0f);
        path3.cubicTo(8.5f, 17.552284f, 8.052285f, 18.0f, 7.5f, 18.0f);
        path3.cubicTo(6.9477153f, 18.0f, 6.5f, 17.552284f, 6.5f, 17.0f);
        path3.cubicTo(6.5f, 16.447716f, 6.9477153f, 16.0f, 7.5f, 16.0f);
        instancePath.close();
        instancePath.moveTo(16.9f, 16.4f);
        path3.cubicTo(17.23137f, 16.4f, 17.5f, 16.668629f, 17.5f, 17.0f);
        path3.cubicTo(17.5f, 17.331371f, 17.23137f, 17.6f, 16.9f, 17.6f);
        instancePath.lineTo(10.1f, 17.6f);
        Path path4 = instancePath;
        path4.cubicTo(9.768629f, 17.6f, 9.5f, 17.331371f, 9.5f, 17.0f);
        path4.cubicTo(9.5f, 16.668629f, 9.768629f, 16.4f, 10.1f, 16.4f);
        instancePath.lineTo(16.9f, 16.4f);
        instancePath.close();
        instancePath.moveTo(7.5f, 11.0f);
        path4.cubicTo(8.052285f, 11.0f, 8.5f, 11.447716f, 8.5f, 12.0f);
        path4.cubicTo(8.5f, 12.552284f, 8.052285f, 13.0f, 7.5f, 13.0f);
        path4.cubicTo(6.9477153f, 13.0f, 6.5f, 12.552284f, 6.5f, 12.0f);
        path4.cubicTo(6.5f, 11.447716f, 6.9477153f, 11.0f, 7.5f, 11.0f);
        instancePath.close();
        instancePath.moveTo(16.9f, 11.4f);
        path4.cubicTo(17.23137f, 11.4f, 17.5f, 11.66863f, 17.5f, 12.0f);
        path4.cubicTo(17.5f, 12.33137f, 17.23137f, 12.6f, 16.9f, 12.6f);
        instancePath.lineTo(10.1f, 12.6f);
        Path path5 = instancePath;
        path5.cubicTo(9.768629f, 12.6f, 9.5f, 12.33137f, 9.5f, 12.0f);
        path5.cubicTo(9.5f, 11.66863f, 9.768629f, 11.4f, 10.1f, 11.4f);
        instancePath.lineTo(16.9f, 11.4f);
        instancePath.close();
        instancePath.moveTo(7.5f, 6.0f);
        path5.cubicTo(8.052285f, 6.0f, 8.5f, 6.4477153f, 8.5f, 7.0f);
        path5.cubicTo(8.5f, 7.5522847f, 8.052285f, 8.0f, 7.5f, 8.0f);
        path5.cubicTo(6.9477153f, 8.0f, 6.5f, 7.5522847f, 6.5f, 7.0f);
        path5.cubicTo(6.5f, 6.4477153f, 6.9477153f, 6.0f, 7.5f, 6.0f);
        instancePath.close();
        instancePath.moveTo(16.9f, 6.4f);
        path5.cubicTo(17.23137f, 6.4f, 17.5f, 6.668629f, 17.5f, 7.0f);
        path5.cubicTo(17.5f, 7.331371f, 17.23137f, 7.6f, 16.9f, 7.6f);
        instancePath.lineTo(10.1f, 7.6f);
        path5.cubicTo(9.768629f, 7.6f, 9.5f, 7.331371f, 9.5f, 7.0f);
        path5.cubicTo(9.5f, 6.668629f, 9.768629f, 6.4f, 10.1f, 6.4f);
        instancePath.lineTo(16.9f, 6.4f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
