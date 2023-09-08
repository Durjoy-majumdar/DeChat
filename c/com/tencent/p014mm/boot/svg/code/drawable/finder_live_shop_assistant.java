package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_shop_assistant */
public class finder_live_shop_assistant extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 6.0f);
        instancePath.cubicTo(50.11328f, 6.0f, 61.695312f, 16.828125f, 62.898438f, 30.628906f);
        instancePath.lineTo(62.90625f, 30.75f);
        instancePath.cubicTo(64.75f, 31.773438f, 66.0f, 33.742188f, 66.0f, 36.0f);
        instancePath.lineTo(66.0f, 39.0f);
        instancePath.cubicTo(66.0f, 41.710938f, 64.203125f, 44.003906f, 61.734375f, 44.746094f);
        instancePath.lineTo(61.70703f, 44.753906f);
        instancePath.cubicTo(58.214844f, 53.023438f, 50.847656f, 59.253906f, 41.882812f, 61.179688f);
        instancePath.lineTo(41.914062f, 61.01953f);
        Path path = instancePath;
        path.cubicTo(41.429688f, 63.847656f, 38.964844f, 66.0f, 36.0f, 66.0f);
        path.cubicTo(32.6875f, 66.0f, 30.0f, 63.3125f, 30.0f, 60.0f);
        path.cubicTo(30.0f, 56.6875f, 32.6875f, 54.0f, 36.0f, 54.0f);
        path.cubicTo(38.410156f, 54.0f, 40.48828f, 55.421875f, 41.441406f, 57.46875f);
        instancePath.lineTo(41.48828f, 57.57422f);
        instancePath.cubicTo(48.527344f, 55.953125f, 54.398438f, 51.26953f, 57.621094f, 45.0f);
        instancePath.lineTo(60.0f, 45.0f);
        instancePath.lineTo(60.164062f, 44.996094f);
        instancePath.cubicTo(60.109375f, 45.0f, 60.054688f, 45.0f, 60.0f, 45.0f);
        instancePath.lineTo(57.847656f, 45.0f);
        Path path2 = instancePath;
        path2.cubicTo(56.507812f, 45.0f, 56.023438f, 44.859375f, 55.535156f, 44.597656f);
        path2.cubicTo(55.046875f, 44.335938f, 54.664062f, 43.953125f, 54.402344f, 43.464844f);
        path2.cubicTo(54.140625f, 42.976562f, 54.0f, 42.492188f, 54.0f, 41.152344f);
        instancePath.lineTo(54.0f, 33.847656f);
        Path path3 = instancePath;
        path3.cubicTo(54.0f, 32.507812f, 54.140625f, 32.023438f, 54.402344f, 31.535156f);
        path3.cubicTo(54.664062f, 31.046875f, 55.046875f, 30.664062f, 55.535156f, 30.402344f);
        path3.cubicTo(56.023438f, 30.140625f, 56.507812f, 30.0f, 57.847656f, 30.0f);
        instancePath.lineTo(59.20703f, 29.996094f);
        instancePath.lineTo(59.101562f, 29.253906f);
        Path path4 = instancePath;
        path4.cubicTo(57.308594f, 18.113281f, 47.648438f, 9.601562f, 36.0f, 9.601562f);
        path4.cubicTo(24.09375f, 9.601562f, 14.265625f, 18.492188f, 12.789062f, 30.0f);
        instancePath.lineTo(14.152344f, 30.0f);
        Path path5 = instancePath;
        path5.cubicTo(15.492188f, 30.0f, 15.976562f, 30.140625f, 16.464844f, 30.402344f);
        path5.cubicTo(16.953125f, 30.664062f, 17.335938f, 31.046875f, 17.597656f, 31.535156f);
        path5.cubicTo(17.859375f, 32.023438f, 18.0f, 32.507812f, 18.0f, 33.847656f);
        instancePath.lineTo(18.0f, 41.152344f);
        Path path6 = instancePath;
        path6.cubicTo(18.0f, 42.492188f, 17.859375f, 42.976562f, 17.597656f, 43.464844f);
        path6.cubicTo(17.335938f, 43.953125f, 16.953125f, 44.335938f, 16.464844f, 44.597656f);
        path6.cubicTo(15.976562f, 44.859375f, 15.492188f, 45.0f, 14.152344f, 45.0f);
        instancePath.lineTo(12.0f, 45.0f);
        path6.cubicTo(8.6875f, 45.0f, 6.0f, 42.3125f, 6.0f, 39.0f);
        instancePath.lineTo(6.0f, 36.0f);
        path6.cubicTo(6.0f, 33.890625f, 7.085938f, 32.035156f, 8.734375f, 30.964844f);
        instancePath.lineTo(9.089844f, 30.75f);
        path6.cubicTo(10.238281f, 16.890625f, 21.847656f, 6.0f, 36.0f, 6.0f);
        instancePath.close();
        instancePath.moveTo(36.0f, 57.601562f);
        path6.cubicTo(34.67578f, 57.601562f, 33.601562f, 58.67578f, 33.601562f, 60.0f);
        path6.cubicTo(33.601562f, 61.32422f, 34.67578f, 62.398438f, 36.0f, 62.398438f);
        path6.cubicTo(37.32422f, 62.398438f, 38.398438f, 61.32422f, 38.398438f, 60.0f);
        path6.cubicTo(38.398438f, 58.67578f, 37.32422f, 57.601562f, 36.0f, 57.601562f);
        instancePath.close();
        instancePath.moveTo(57.597656f, 33.597656f);
        instancePath.lineTo(57.597656f, 41.398438f);
        instancePath.lineTo(60.0f, 41.398438f);
        path6.cubicTo(61.222656f, 41.398438f, 62.234375f, 40.484375f, 62.382812f, 39.30078f);
        instancePath.lineTo(62.398438f, 39.0f);
        instancePath.lineTo(62.398438f, 36.0f);
        Path path7 = instancePath;
        path7.cubicTo(62.398438f, 34.777344f, 61.484375f, 33.765625f, 60.30078f, 33.617188f);
        instancePath.lineTo(60.0f, 33.601562f);
        instancePath.close();
        instancePath.moveTo(14.398438f, 33.597656f);
        instancePath.lineTo(12.0f, 33.601562f);
        path7.cubicTo(10.777344f, 33.601562f, 9.765625f, 34.515625f, 9.617188f, 35.69922f);
        instancePath.lineTo(9.601562f, 36.0f);
        instancePath.lineTo(9.601562f, 39.0f);
        instancePath.cubicTo(9.601562f, 40.222656f, 10.515625f, 41.234375f, 11.699219f, 41.382812f);
        instancePath.lineTo(12.0f, 41.398438f);
        instancePath.lineTo(14.398438f, 41.398438f);
        instancePath.close();
        instancePath.moveTo(14.398438f, 33.597656f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
