package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_play_list_icon_filled */
public class finder_live_play_list_icon_filled extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(4.80004f, 11.6f);
        instancePath.lineTo(14.0001f, 11.6f);
        instancePath.lineTo(14.0001f, 12.8f);
        instancePath.lineTo(4.80004f, 12.8f);
        instancePath.lineTo(4.80004f, 11.6f);
        instancePath.close();
        instancePath.moveTo(4.80004f, 14.8001f);
        instancePath.lineTo(10.6f, 14.8001f);
        instancePath.lineTo(10.6f, 16.0001f);
        instancePath.lineTo(4.80004f, 16.0001f);
        instancePath.lineTo(4.80004f, 14.8001f);
        instancePath.close();
        instancePath.moveTo(16.0f, 3.16001f);
        instancePath.cubicTo(15.98f, 2.52001f, 15.44f, 2.00002f, 14.8f, 2.00002f);
        instancePath.lineTo(4.00005f, 2.00002f);
        instancePath.lineTo(3.96004f, 2.00002f);
        instancePath.cubicTo(3.32004f, 2.02001f, 2.80005f, 2.56001f, 2.80005f, 3.20002f);
        instancePath.lineTo(2.80005f, 19.0001f);
        instancePath.lineTo(2.80005f, 19.0601f);
        instancePath.cubicTo(2.84004f, 20.7f, 4.16004f, 22.0001f, 5.80005f, 22.0001f);
        instancePath.lineTo(17.8f, 22.0001f);
        instancePath.lineTo(17.86f, 22.0001f);
        instancePath.cubicTo(19.5001f, 21.96f, 20.8f, 20.64f, 20.8f, 19.0001f);
        instancePath.lineTo(20.8f, 9.40001f);
        instancePath.lineTo(20.8f, 9.36001f);
        instancePath.cubicTo(20.78f, 9.04001f, 20.5201f, 8.80001f, 20.2f, 8.80001f);
        instancePath.lineTo(17.2f, 8.80001f);
        instancePath.lineTo(17.2f, 19.0001f);
        instancePath.cubicTo(17.2f, 19.34f, 17.4601f, 19.6001f, 17.8f, 19.6001f);
        instancePath.lineTo(17.8f, 20.8001f);
        instancePath.cubicTo(16.82f, 20.8001f, 16.04f, 20.0201f, 16.0f, 19.0601f);
        instancePath.lineTo(16.0f, 3.20002f);
        instancePath.lineTo(16.0f, 3.16001f);
        instancePath.close();
        instancePath.moveTo(5.697f, 9.42056f);
        instancePath.lineTo(6.60006f, 8.9458f);
        instancePath.lineTo(7.50312f, 9.42056f);
        Path path = instancePath;
        path.cubicTo(7.54074f, 9.44035f, 7.58383f, 9.44717f, 7.62573f, 9.43999f);
        path.cubicTo(7.73094f, 9.42194f, 7.8016f, 9.32201f, 7.78356f, 9.2168f);
        instancePath.lineTo(7.61109f, 8.21125f);
        instancePath.lineTo(8.34168f, 7.49909f);
        Path path2 = instancePath;
        path2.cubicTo(8.37211f, 7.46942f, 8.39193f, 7.43054f, 8.39803f, 7.38848f);
        path2.cubicTo(8.41339f, 7.28284f, 8.34019f, 7.18477f, 8.23455f, 7.16941f);
        instancePath.lineTo(7.22491f, 7.0227f);
        instancePath.lineTo(6.77338f, 6.10781f);
        Path path3 = instancePath;
        path3.cubicTo(6.75457f, 6.06969f, 6.72372f, 6.03884f, 6.6856f, 6.02003f);
        path3.cubicTo(6.58987f, 5.97278f, 6.47397f, 6.01208f, 6.42673f, 6.10781f);
        instancePath.lineTo(5.9752f, 7.0227f);
        instancePath.lineTo(4.96555f, 7.16941f);
        Path path4 = instancePath;
        path4.cubicTo(4.92349f, 7.17553f, 4.88461f, 7.19534f, 4.85494f, 7.22578f);
        path4.cubicTo(4.78044f, 7.30222f, 4.782f, 7.42459f, 4.85844f, 7.49909f);
        instancePath.lineTo(5.58903f, 8.21125f);
        instancePath.lineTo(5.41656f, 9.2168f);
        Path path5 = instancePath;
        path5.cubicTo(5.40937f, 9.25869f, 5.4162f, 9.30179f, 5.43598f, 9.33943f);
        path5.cubicTo(5.48565f, 9.43391f, 5.60251f, 9.47024f, 5.697f, 9.42056f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
