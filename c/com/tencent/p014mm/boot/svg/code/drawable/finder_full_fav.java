package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_full_fav */
public class finder_full_fav extends C24542c {
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
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 55.00487f);
        instancePath.lineTo(21.983503f, 62.37378f);
        Path path = instancePath;
        path.cubicTo(20.51697f, 63.144783f, 18.703089f, 62.580944f, 17.932085f, 61.11441f);
        path.cubicTo(17.625069f, 60.53043f, 17.519125f, 59.861523f, 17.630655f, 59.21125f);
        instancePath.lineTo(20.307568f, 43.603653f);
        instancePath.lineTo(8.967983f, 32.55029f);
        Path path2 = instancePath;
        path2.cubicTo(7.781533f, 31.393785f, 7.7572556f, 29.494446f, 8.913759f, 28.307995f);
        path2.cubicTo(9.374285f, 27.835545f, 9.977713f, 27.528084f, 10.630624f, 27.433208f);
        instancePath.lineTo(26.301544f, 25.156092f);
        instancePath.lineTo(33.30979f, 10.955829f);
        Path path3 = instancePath;
        path3.cubicTo(34.04306f, 9.470068f, 35.841938f, 8.860051f, 37.327698f, 9.593318f);
        path3.cubicTo(37.919334f, 9.885308f, 38.398216f, 10.364191f, 38.69021f, 10.955829f);
        instancePath.lineTo(45.698456f, 25.156092f);
        instancePath.lineTo(61.369377f, 27.433208f);
        Path path4 = instancePath;
        path4.cubicTo(63.00901f, 27.671463f, 64.14506f, 29.19379f, 63.906803f, 30.833426f);
        path4.cubicTo(63.811928f, 31.486336f, 63.504467f, 32.089764f, 63.032017f, 32.55029f);
        instancePath.lineTo(51.692432f, 43.603653f);
        instancePath.lineTo(54.369347f, 59.21125f);
        Path path5 = instancePath;
        path5.cubicTo(54.64943f, 60.84426f, 53.552666f, 62.395126f, 51.919655f, 62.675213f);
        path5.cubicTo(51.269382f, 62.786743f, 50.60048f, 62.680798f, 50.0165f, 62.37378f);
        instancePath.lineTo(36.0f, 55.00487f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
