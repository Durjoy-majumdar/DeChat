package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_third_party_running_flag */
public class app_brand_third_party_running_flag extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(16777215);
        instancePaint5.setColor(-1);
        instancePaint5.setStrokeWidth(1.2f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(14.72445f, 3.0f);
        Path path = instancePath;
        path.cubicTo(16.5315f, 3.0f, 17.4348f, 3.0f, 18.40755f, 3.3075f);
        path.cubicTo(19.46955f, 3.69405f, 20.30595f, 4.53045f, 20.6925f, 5.59245f);
        path.cubicTo(21.0f, 6.56505f, 21.0f, 7.46865f, 21.0f, 9.27555f);
        instancePath.lineTo(21.0f, 14.72445f);
        path.cubicTo(21.0f, 16.5315f, 21.0f, 17.4348f, 20.6925f, 18.40755f);
        path.cubicTo(20.30595f, 19.46955f, 19.46955f, 20.30595f, 18.40755f, 20.69235f);
        path.cubicTo(17.4348f, 21.0f, 16.5315f, 21.0f, 14.72445f, 21.0f);
        instancePath.lineTo(9.27555f, 21.0f);
        path.cubicTo(7.4685f, 21.0f, 6.56505f, 21.0f, 5.59245f, 20.69235f);
        path.cubicTo(4.53045f, 20.30595f, 3.69405f, 19.46955f, 3.3075f, 18.40755f);
        path.cubicTo(3.0f, 17.4348f, 3.0f, 16.5315f, 3.0f, 14.72445f);
        instancePath.lineTo(3.0f, 9.27555f);
        path.cubicTo(3.0f, 7.46865f, 3.0f, 6.56505f, 3.3075f, 5.59245f);
        path.cubicTo(3.69405f, 4.53045f, 4.53045f, 3.69405f, 5.59245f, 3.3075f);
        path.cubicTo(6.56505f, 3.0f, 7.4685f, 3.0f, 9.27555f, 3.0f);
        instancePath.lineTo(14.72445f, 3.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
