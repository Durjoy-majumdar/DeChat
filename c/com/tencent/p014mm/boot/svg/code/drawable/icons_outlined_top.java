package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_top */
public class icons_outlined_top extends C24542c {
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(38.12132f, 18.665476f);
                instancePath.lineTo(56.334522f, 36.87868f);
                Path path = instancePath;
                path.cubicTo(57.506096f, 38.05025f, 57.506096f, 39.94975f, 56.334522f, 41.12132f);
                path.cubicTo(55.771915f, 41.68393f, 55.008854f, 42.0f, 54.213203f, 42.0f);
                instancePath.lineTo(47.999798f, 41.999798f);
                instancePath.lineTo(48.0f, 63.0f);
                instancePath.cubicTo(48.0f, 64.65685f, 46.656853f, 66.0f, 45.0f, 66.0f);
                instancePath.lineTo(27.0f, 66.0f);
                instancePath.cubicTo(25.343145f, 66.0f, 24.0f, 64.65685f, 24.0f, 63.0f);
                instancePath.lineTo(23.999796f, 41.999798f);
                instancePath.lineTo(17.786797f, 42.0f);
                Path path2 = instancePath;
                path2.cubicTo(16.129942f, 42.0f, 14.786797f, 40.656853f, 14.786797f, 39.0f);
                path2.cubicTo(14.786797f, 38.20435f, 15.102867f, 37.441288f, 15.665476f, 36.87868f);
                instancePath.lineTo(33.87868f, 18.665476f);
                instancePath.cubicTo(35.05025f, 17.493904f, 36.94975f, 17.493904f, 38.12132f, 18.665476f);
                instancePath.close();
                instancePath.moveTo(36.0f, 21.636f);
                instancePath.lineTo(19.233f, 38.4f);
                instancePath.lineTo(27.599762f, 38.399677f);
                instancePath.lineTo(27.6f, 62.4f);
                instancePath.lineTo(44.4f, 62.4f);
                instancePath.lineTo(44.39976f, 38.399677f);
                instancePath.lineTo(52.764f, 38.4f);
                instancePath.lineTo(36.0f, 21.636f);
                instancePath.close();
                instancePath.moveTo(60.0f, 9.0f);
                instancePath.lineTo(60.0f, 12.6f);
                instancePath.lineTo(12.0f, 12.6f);
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
