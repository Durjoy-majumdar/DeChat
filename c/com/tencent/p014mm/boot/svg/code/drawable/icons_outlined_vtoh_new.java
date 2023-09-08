package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_vtoh_new */
public class icons_outlined_vtoh_new extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(14.0f, 5.5f);
        instancePath.cubicTo(14.552284f, 5.5f, 15.0f, 5.9477153f, 15.0f, 6.5f);
        instancePath.lineTo(15.0f, 19.5f);
        instancePath.cubicTo(15.0f, 20.052284f, 14.552284f, 20.5f, 14.0f, 20.5f);
        instancePath.lineTo(6.0f, 20.5f);
        instancePath.cubicTo(5.4477153f, 20.5f, 5.0f, 20.052284f, 5.0f, 19.5f);
        instancePath.lineTo(5.0f, 6.5f);
        instancePath.cubicTo(5.0f, 5.9477153f, 5.4477153f, 5.5f, 6.0f, 5.5f);
        instancePath.lineTo(14.0f, 5.5f);
        instancePath.close();
        instancePath.moveTo(13.5f, 7.0f);
        instancePath.lineTo(6.5f, 7.0f);
        instancePath.lineTo(6.5f, 19.0f);
        instancePath.lineTo(13.5f, 19.0f);
        instancePath.lineTo(13.5f, 7.0f);
        instancePath.close();
        instancePath.moveTo(14.216405f, 2.254379f);
        instancePath.lineTo(14.0f, 2.25f);
        instancePath.lineTo(14.0f, 0.75f);
        instancePath.cubicTo(17.648605f, 0.75f, 20.621082f, 3.644847f, 20.745918f, 7.2630286f);
        instancePath.lineTo(20.75f, 7.5f);
        instancePath.lineTo(20.75f, 8.189f);
        instancePath.lineTo(21.96967f, 6.96967f);
        instancePath.lineTo(23.03033f, 8.03033f);
        instancePath.lineTo(20.53033f, 10.53033f);
        instancePath.cubicTo(20.264063f, 10.796597f, 19.8474f, 10.820803f, 19.55379f, 10.602948f);
        instancePath.lineTo(19.46967f, 10.53033f);
        instancePath.lineTo(16.96967f, 8.03033f);
        instancePath.lineTo(18.03033f, 6.96967f);
        instancePath.lineTo(19.25f, 8.189f);
        instancePath.lineTo(19.25f, 7.5f);
        instancePath.cubicTo(19.25f, 4.672992f, 17.01555f, 2.3678684f, 14.216405f, 2.254379f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
