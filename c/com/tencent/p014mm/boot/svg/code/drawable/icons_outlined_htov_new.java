package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_htov_new */
public class icons_outlined_htov_new extends C24542c {
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
        instancePath.moveTo(18.0f, 10.0f);
        instancePath.cubicTo(18.552284f, 10.0f, 19.0f, 10.447716f, 19.0f, 11.0f);
        instancePath.lineTo(19.0f, 19.0f);
        instancePath.cubicTo(19.0f, 19.552284f, 18.552284f, 20.0f, 18.0f, 20.0f);
        instancePath.lineTo(5.0f, 20.0f);
        Path path = instancePath;
        path.cubicTo(4.4477153f, 20.0f, 4.0f, 19.552284f, 4.0f, 19.0f);
        instancePath.lineTo(4.0f, 11.0f);
        path.cubicTo(4.0f, 10.447716f, 4.4477153f, 10.0f, 5.0f, 10.0f);
        instancePath.lineTo(18.0f, 10.0f);
        instancePath.close();
        instancePath.moveTo(17.5f, 11.5f);
        instancePath.lineTo(5.5f, 11.5f);
        instancePath.lineTo(5.5f, 18.5f);
        instancePath.lineTo(17.5f, 18.5f);
        instancePath.lineTo(17.5f, 11.5f);
        instancePath.close();
        instancePath.moveTo(16.0f, 4.25f);
        instancePath.cubicTo(19.648605f, 4.25f, 22.621082f, 7.144847f, 22.745918f, 10.763028f);
        instancePath.lineTo(22.75f, 11.0f);
        instancePath.lineTo(21.25f, 11.0f);
        instancePath.cubicTo(21.25f, 8.172993f, 19.01555f, 5.8678684f, 16.216404f, 5.7543793f);
        instancePath.lineTo(16.0f, 5.75f);
        instancePath.lineTo(16.0f, 4.25f);
        instancePath.close();
        instancePath.moveTo(15.579505f, 2.079505f);
        instancePath.lineTo(16.640165f, 3.140165f);
        instancePath.lineTo(15.53f, 4.249505f);
        instancePath.lineTo(16.0f, 4.25f);
        instancePath.lineTo(16.0f, 5.75f);
        instancePath.lineTo(15.31f, 5.749505f);
        instancePath.lineTo(16.640165f, 7.079505f);
        instancePath.lineTo(15.579505f, 8.140165f);
        instancePath.lineTo(13.079505f, 5.640165f);
        instancePath.cubicTo(12.813238f, 5.3738985f, 12.789032f, 4.957235f, 13.0068865f, 4.6636233f);
        instancePath.lineTo(13.079505f, 4.579505f);
        instancePath.lineTo(15.579505f, 2.079505f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
