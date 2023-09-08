package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.text_status_edit_poi_selected */
public class text_status_edit_poi_selected extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
            if (i == 2) {
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
                instancePaint3.setColor(-16268960);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(24.0f, 12.148149f);
                Path path = instancePath;
                path.cubicTo(24.0f, 5.3724446f, 18.627556f, 0.0f, 11.851851f, 0.0f);
                path.cubicTo(5.3724446f, 0.0f, 0.0f, 5.3724446f, 0.0f, 12.148149f);
                path.cubicTo(0.0f, 18.627556f, 5.3724446f, 24.0f, 11.851851f, 24.0f);
                path.cubicTo(18.627556f, 24.0f, 24.0f, 18.627556f, 24.0f, 12.148149f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(10.363961f, 15.313708f);
                instancePath2.lineTo(7.0606604f, 12.010407f);
                instancePath2.lineTo(6.0f, 13.071068f);
                instancePath2.lineTo(9.656855f, 16.727922f);
                instancePath2.cubicTo(10.047379f, 17.118446f, 10.680544f, 17.118446f, 11.071068f, 16.727922f);
                instancePath2.lineTo(18.738329f, 9.06066f);
                instancePath2.lineTo(18.738329f, 9.06066f);
                instancePath2.lineTo(17.67767f, 8.0f);
                instancePath2.lineTo(10.363961f, 15.313708f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
