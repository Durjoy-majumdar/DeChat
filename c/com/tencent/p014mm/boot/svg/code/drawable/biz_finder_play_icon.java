package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_finder_play_icon */
public class biz_finder_play_icon extends C24542c {
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(9.524097f, 4.9379063f);
        instancePath.lineTo(19.616055f, 11.148342f);
        Path path = instancePath;
        path.cubicTo(20.086412f, 11.437793f, 20.233067f, 12.05374f, 19.943617f, 12.524097f);
        path.cubicTo(19.861572f, 12.657418f, 19.749376f, 12.769615f, 19.616055f, 12.851658f);
        instancePath.lineTo(9.524097f, 19.062094f);
        path.cubicTo(9.05374f, 19.351545f, 8.437793f, 19.204891f, 8.148342f, 18.734533f);
        path.cubicTo(8.0513525f, 18.576925f, 8.0f, 18.395494f, 8.0f, 18.210436f);
        instancePath.lineTo(8.0f, 5.7895646f);
        path.cubicTo(8.0f, 5.23728f, 8.447715f, 4.7895646f, 9.0f, 4.7895646f);
        path.cubicTo(9.18506f, 4.7895646f, 9.366489f, 4.8409166f, 9.524097f, 4.9379063f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(9.524097f, 4.9379063f);
        instancePath2.lineTo(19.616055f, 11.148342f);
        Path path2 = instancePath2;
        path2.cubicTo(20.086412f, 11.437793f, 20.233067f, 12.05374f, 19.943617f, 12.524097f);
        path2.cubicTo(19.861572f, 12.657418f, 19.749376f, 12.769615f, 19.616055f, 12.851658f);
        instancePath2.lineTo(9.524097f, 19.062094f);
        path2.cubicTo(9.05374f, 19.351545f, 8.437793f, 19.204891f, 8.148342f, 18.734533f);
        path2.cubicTo(8.0513525f, 18.576925f, 8.0f, 18.395494f, 8.0f, 18.210436f);
        instancePath2.lineTo(8.0f, 5.7895646f);
        Path path3 = instancePath2;
        path3.cubicTo(8.0f, 5.23728f, 8.447715f, 4.7895646f, 9.0f, 4.7895646f);
        path3.cubicTo(9.18506f, 4.7895646f, 9.366489f, 4.8409166f, 9.524097f, 4.9379063f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
