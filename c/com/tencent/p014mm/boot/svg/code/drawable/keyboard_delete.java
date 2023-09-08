package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.keyboard_delete */
public class keyboard_delete extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(63.0f, 12.0f);
        instancePath.cubicTo(64.65685f, 12.0f, 66.0f, 13.343145f, 66.0f, 15.0f);
        instancePath.lineTo(66.0f, 57.0f);
        instancePath.cubicTo(66.0f, 58.656853f, 64.65685f, 60.0f, 63.0f, 60.0f);
        instancePath.lineTo(25.5f, 60.0f);
        instancePath.cubicTo(24.555729f, 60.0f, 23.666563f, 59.555416f, 23.1f, 58.8f);
        instancePath.lineTo(7.35f, 37.8f);
        instancePath.cubicTo(6.55f, 36.733334f, 6.55f, 35.266666f, 7.35f, 34.2f);
        instancePath.lineTo(23.1f, 13.2f);
        Path path = instancePath;
        path.cubicTo(23.666563f, 12.444583f, 24.555729f, 12.0f, 25.5f, 12.0f);
        instancePath.lineTo(63.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(52.272793f, 25.727207f);
        path.cubicTo(51.569847f, 25.024263f, 50.430153f, 25.024263f, 49.727207f, 25.727207f);
        instancePath.lineTo(49.727207f, 25.727207f);
        instancePath.lineTo(42.0f, 33.455f);
        instancePath.lineTo(34.272793f, 25.727207f);
        Path path2 = instancePath;
        path2.cubicTo(33.569847f, 25.024263f, 32.430153f, 25.024263f, 31.727207f, 25.727207f);
        path2.cubicTo(31.024263f, 26.430151f, 31.024263f, 27.569849f, 31.727207f, 28.272793f);
        instancePath.lineTo(31.727207f, 28.272793f);
        instancePath.lineTo(39.455f, 36.0f);
        instancePath.lineTo(31.727207f, 43.727207f);
        Path path3 = instancePath;
        path3.cubicTo(31.024263f, 44.430153f, 31.024263f, 45.569847f, 31.727207f, 46.272793f);
        path3.cubicTo(32.430153f, 46.975735f, 33.569847f, 46.975735f, 34.272793f, 46.272793f);
        instancePath.lineTo(34.272793f, 46.272793f);
        instancePath.lineTo(42.0f, 38.545f);
        instancePath.lineTo(49.727207f, 46.272793f);
        Path path4 = instancePath;
        path4.cubicTo(50.430153f, 46.975735f, 51.569847f, 46.975735f, 52.272793f, 46.272793f);
        path4.cubicTo(52.975735f, 45.569847f, 52.975735f, 44.430153f, 52.272793f, 43.727207f);
        instancePath.lineTo(52.272793f, 43.727207f);
        instancePath.lineTo(44.545f, 36.0f);
        instancePath.lineTo(52.272793f, 28.272793f);
        path4.cubicTo(52.975735f, 27.569849f, 52.975735f, 26.430151f, 52.272793f, 25.727207f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
