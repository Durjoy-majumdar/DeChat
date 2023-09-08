package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_outlined_collect_security */
public class icon_outlined_collect_security extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 16;
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
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(7.9993334f, 10.666333f);
        instancePath.lineTo(1.3333334f, 10.666667f);
        instancePath.lineTo(1.3333334f, 10.666667f);
        instancePath.lineTo(1.3333334f, 9.333333f);
        instancePath.cubicTo(1.3333334f, 5.819692f, 4.0515366f, 2.940921f, 7.499815f, 2.685148f);
        instancePath.lineTo(7.5f, 1.8333334f);
        instancePath.lineTo(7.5080557f, 1.7434577f);
        Path path = instancePath;
        path.cubicTo(7.5503917f, 1.5102085f, 7.75454f, 1.3333334f, 8.0f, 1.3333334f);
        path.cubicTo(8.276142f, 1.3333334f, 8.5f, 1.557191f, 8.5f, 1.8333334f);
        instancePath.lineTo(8.500185f, 2.685148f);
        instancePath.cubicTo(11.948463f, 2.940921f, 14.666667f, 5.819692f, 14.666667f, 9.333333f);
        instancePath.lineTo(14.666667f, 9.333333f);
        instancePath.lineTo(14.666667f, 10.666667f);
        instancePath.lineTo(8.999333f, 10.666333f);
        instancePath.lineTo(9.0f, 12.666667f);
        Path path2 = instancePath;
        path2.cubicTo(9.0f, 13.771236f, 8.104569f, 14.666667f, 7.0f, 14.666667f);
        path2.cubicTo(5.8954306f, 14.666667f, 5.0f, 13.771236f, 5.0f, 12.666667f);
        instancePath.lineTo(6.0f, 12.666667f);
        Path path3 = instancePath;
        path3.cubicTo(6.0f, 13.218951f, 6.4477153f, 13.666667f, 7.0f, 13.666667f);
        path3.cubicTo(7.5522847f, 13.666667f, 8.0f, 13.218951f, 8.0f, 12.666667f);
        instancePath.lineTo(7.9993334f, 10.666333f);
        instancePath.close();
        instancePath.moveTo(8.0f, 3.6666667f);
        instancePath.cubicTo(4.8703866f, 3.6666667f, 2.3333333f, 6.2037196f, 2.3333333f, 9.333333f);
        instancePath.lineTo(2.3333333f, 9.333333f);
        instancePath.lineTo(2.3333333f, 9.666667f);
        instancePath.lineTo(13.666667f, 9.666667f);
        instancePath.lineTo(13.666667f, 9.333333f);
        instancePath.cubicTo(13.666667f, 6.2037196f, 11.129614f, 3.6666667f, 8.0f, 3.6666667f);
        instancePath.close();
        instancePath.moveTo(9.646446f, 4.9797797f);
        instancePath.lineTo(10.353554f, 5.686887f);
        instancePath.lineTo(7.686887f, 8.353554f);
        instancePath.cubicTo(7.4916244f, 8.548816f, 7.175042f, 8.548816f, 6.9797797f, 8.353554f);
        instancePath.lineTo(6.9797797f, 8.353554f);
        instancePath.lineTo(5.6464467f, 7.0202203f);
        instancePath.lineTo(6.3535533f, 6.313113f);
        instancePath.lineTo(7.3333335f, 7.2928934f);
        instancePath.lineTo(9.646446f, 4.9797797f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
