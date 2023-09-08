package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_nearby */
public class icons_filled_nearby extends C24542c {
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
        instancePath.moveTo(21.0f, 18.0f);
        Path path = instancePath;
        path.cubicTo(17.68629f, 18.0f, 15.0f, 15.313708f, 15.0f, 12.0f);
        path.cubicTo(15.0f, 8.686292f, 17.68629f, 6.0f, 21.0f, 6.0f);
        path.cubicTo(24.31371f, 6.0f, 27.0f, 8.686292f, 27.0f, 12.0f);
        path.cubicTo(27.0f, 15.313708f, 24.31371f, 18.0f, 21.0f, 18.0f);
        instancePath.close();
        instancePath.moveTo(16.919687f, 24.0f);
        instancePath.lineTo(25.080313f, 24.0f);
        Path path2 = instancePath;
        path2.cubicTo(27.565594f, 24.0f, 29.580313f, 26.014719f, 29.580313f, 28.5f);
        path2.cubicTo(29.580313f, 28.633596f, 29.574364f, 28.767126f, 29.562483f, 28.900194f);
        instancePath.lineTo(26.494036f, 63.266796f);
        instancePath.cubicTo(26.355885f, 64.8141f, 25.059385f, 66.0f, 23.505922f, 66.0f);
        instancePath.lineTo(18.494078f, 66.0f);
        instancePath.cubicTo(16.940615f, 66.0f, 15.644116f, 64.8141f, 15.505964f, 63.266796f);
        instancePath.lineTo(12.437517f, 28.900194f);
        Path path3 = instancePath;
        path3.cubicTo(12.216496f, 26.424759f, 14.04406f, 24.238852f, 16.519493f, 24.01783f);
        path3.cubicTo(16.652561f, 24.005949f, 16.78609f, 24.0f, 16.919687f, 24.0f);
        instancePath.close();
        instancePath.moveTo(51.0f, 18.0f);
        Path path4 = instancePath;
        path4.cubicTo(47.68629f, 18.0f, 45.0f, 15.313708f, 45.0f, 12.0f);
        path4.cubicTo(45.0f, 8.686292f, 47.68629f, 6.0f, 51.0f, 6.0f);
        path4.cubicTo(54.31371f, 6.0f, 57.0f, 8.686292f, 57.0f, 12.0f);
        path4.cubicTo(57.0f, 15.313708f, 54.31371f, 18.0f, 51.0f, 18.0f);
        instancePath.close();
        instancePath.moveTo(46.919685f, 24.0f);
        instancePath.lineTo(55.080315f, 24.0f);
        Path path5 = instancePath;
        path5.cubicTo(57.565594f, 24.0f, 59.580315f, 26.014719f, 59.580315f, 28.5f);
        path5.cubicTo(59.580315f, 28.633596f, 59.574364f, 28.767126f, 59.56248f, 28.900194f);
        instancePath.lineTo(56.494038f, 63.266796f);
        instancePath.cubicTo(56.355885f, 64.8141f, 55.059387f, 66.0f, 53.505924f, 66.0f);
        instancePath.lineTo(48.494076f, 66.0f);
        Path path6 = instancePath;
        path6.cubicTo(46.940613f, 66.0f, 45.644115f, 64.8141f, 45.505962f, 63.266796f);
        instancePath.lineTo(42.43752f, 28.900194f);
        path6.cubicTo(42.216496f, 26.424759f, 44.04406f, 24.238852f, 46.519493f, 24.01783f);
        path6.cubicTo(46.65256f, 24.005949f, 46.78609f, 24.0f, 46.919685f, 24.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
