package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fav_list_tag */
public class fav_list_tag extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-16777216);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(4.25911f, 13.9146f);
                instancePath.cubicTo(3.91363f, 13.5691f, 3.91363f, 13.009f, 4.25911f, 12.6635f);
                instancePath.lineTo(12.6635f, 4.25911f);
                instancePath.cubicTo(12.8294f, 4.09321f, 13.0544f, 4.0f, 13.2891f, 4.0f);
                instancePath.lineTo(19.1153f, 4.0f);
                instancePath.cubicTo(19.6039f, 4.0f, 20.0f, 4.39608f, 20.0f, 4.88467f);
                instancePath.lineTo(20.0f, 10.7109f);
                instancePath.cubicTo(20.0f, 10.9456f, 19.9068f, 11.1706f, 19.7409f, 11.3365f);
                instancePath.lineTo(11.3365f, 19.7409f);
                instancePath.cubicTo(10.991f, 20.0864f, 10.4309f, 20.0864f, 10.0854f, 19.7409f);
                instancePath.lineTo(4.25911f, 13.9146f);
                instancePath.close();
                instancePath.moveTo(18.8002f, 10.6938f);
                instancePath.lineTo(18.8002f, 5.2f);
                instancePath.lineTo(13.3064f, 5.2f);
                instancePath.lineTo(5.2002f, 13.3062f);
                instancePath.lineTo(10.694f, 18.8f);
                instancePath.lineTo(18.8002f, 10.6938f);
                instancePath.close();
                instancePath.moveTo(15.75f, 9.5f);
                Path path = instancePath;
                path.cubicTo(16.4404f, 9.5f, 17.0f, 8.94036f, 17.0f, 8.25f);
                path.cubicTo(17.0f, 7.55964f, 16.4404f, 7.0f, 15.75f, 7.0f);
                path.cubicTo(15.0596f, 7.0f, 14.5f, 7.55964f, 14.5f, 8.25f);
                path.cubicTo(14.5f, 8.94036f, 15.0596f, 9.5f, 15.75f, 9.5f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
