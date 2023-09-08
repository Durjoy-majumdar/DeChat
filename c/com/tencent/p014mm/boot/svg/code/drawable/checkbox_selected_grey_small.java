package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_grey_small */
public class checkbox_selected_grey_small extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = 60;
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
                canvas.saveLayerAlpha((RectF) null, 76, 31);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(60.0f, 30.37037f);
                Path path = instancePath;
                path.cubicTo(60.0f, 13.431111f, 46.56889f, 0.0f, 29.62963f, 0.0f);
                path.cubicTo(13.431111f, 0.0f, 0.0f, 13.431111f, 0.0f, 30.37037f);
                path.cubicTo(0.0f, 46.56889f, 13.431111f, 60.0f, 29.62963f, 60.0f);
                path.cubicTo(46.56889f, 60.0f, 60.0f, 46.56889f, 60.0f, 30.37037f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(25.909903f, 38.28427f);
                instancePath2.lineTo(17.65165f, 30.02602f);
                instancePath2.lineTo(15.0f, 32.67767f);
                instancePath2.lineTo(24.142136f, 41.819805f);
                instancePath2.cubicTo(25.118446f, 42.796116f, 26.701359f, 42.796116f, 27.67767f, 41.819805f);
                instancePath2.lineTo(46.845825f, 22.65165f);
                instancePath2.lineTo(46.845825f, 22.65165f);
                instancePath2.lineTo(44.19417f, 20.0f);
                instancePath2.lineTo(25.909903f, 38.28427f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
