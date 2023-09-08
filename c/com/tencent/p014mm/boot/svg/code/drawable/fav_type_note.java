package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fav_type_note */
public class fav_type_note extends C24542c {
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
        instancePath.moveTo(18.0f, 2.0f);
        instancePath.cubicTo(19.1046f, 2.0f, 20.0f, 2.89543f, 20.0f, 4.0f);
        instancePath.lineTo(20.0f, 20.0f);
        instancePath.cubicTo(20.0f, 21.1046f, 19.1046f, 22.0f, 18.0f, 22.0f);
        instancePath.lineTo(4.0f, 22.0f);
        instancePath.lineTo(4.0f, 2.0f);
        instancePath.lineTo(18.0f, 2.0f);
        instancePath.close();
        instancePath.moveTo(18.0f, 19.0093f);
        instancePath.lineTo(5.199f, 19.009f);
        instancePath.lineTo(5.2f, 20.8f);
        instancePath.lineTo(18.0f, 20.8f);
        instancePath.cubicTo(18.4418f, 20.8f, 18.8f, 20.4418f, 18.8f, 20.0f);
        instancePath.lineTo(18.7998f, 18.8429f);
        instancePath.cubicTo(18.5549f, 18.9499f, 18.2844f, 19.0093f, 18.0f, 19.0093f);
        instancePath.close();
        instancePath.moveTo(7.0f, 3.199f);
        instancePath.lineTo(5.2f, 3.2f);
        instancePath.lineTo(5.199f, 17.809f);
        instancePath.lineTo(7.0f, 17.809f);
        instancePath.lineTo(7.0f, 3.199f);
        instancePath.close();
        instancePath.moveTo(18.0f, 3.2f);
        instancePath.lineTo(8.2f, 3.199f);
        instancePath.lineTo(8.2f, 17.809f);
        instancePath.lineTo(18.0f, 17.8093f);
        Path path = instancePath;
        path.cubicTo(18.4371f, 17.8093f, 18.7923f, 17.4588f, 18.7999f, 17.0235f);
        instancePath.lineTo(18.8f, 4.0f);
        path.cubicTo(18.8f, 3.55817f, 18.4418f, 3.2f, 18.0f, 3.2f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
