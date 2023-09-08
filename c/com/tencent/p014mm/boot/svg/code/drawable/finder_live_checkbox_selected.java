package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_checkbox_selected */
public class finder_live_checkbox_selected extends C24542c {
    private final int height = 20;
    private final int width = 20;

    public int doCommand(int i, Object... objArr) {
        int i2 = 20;
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
                canvas.saveLayerAlpha((RectF) null, 204, 31);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(10.0f, 1.6666666f);
                Path path = instancePath;
                path.cubicTo(14.602373f, 1.6666666f, 18.333334f, 5.397627f, 18.333334f, 10.0f);
                path.cubicTo(18.333334f, 14.602373f, 14.602373f, 18.333334f, 10.0f, 18.333334f);
                path.cubicTo(5.397627f, 18.333334f, 1.6666666f, 14.602373f, 1.6666666f, 10.0f);
                path.cubicTo(1.6666666f, 5.397627f, 5.397627f, 1.6666666f, 10.0f, 1.6666666f);
                instancePath.close();
                instancePath.moveTo(13.685628f, 7.116667f);
                instancePath.lineTo(9.019531f, 11.7827635f);
                instancePath.lineTo(6.714615f, 9.477847f);
                instancePath.lineTo(5.8333335f, 10.359129f);
                instancePath.lineTo(8.550149f, 13.077909f);
                instancePath.lineTo(8.550149f, 13.077909f);
                instancePath.lineTo(8.632769f, 13.148366f);
                instancePath.cubicTo(8.893249f, 13.335872f, 9.258588f, 13.31251f, 9.492886f, 13.078178f);
                instancePath.lineTo(9.492886f, 13.078178f);
                instancePath.lineTo(14.571068f, 8.002107f);
                instancePath.lineTo(13.685628f, 7.116667f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
