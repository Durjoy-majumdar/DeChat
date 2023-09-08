package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_audio_tips */
public class finder_live_audio_tips extends C24542c {
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
                canvas.saveLayerAlpha((RectF) null, 230, 31);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(13.571068f, 4.5f);
                Path path = instancePath;
                path.cubicTo(15.380712f, 6.4194174f, 16.5f, 9.071068f, 16.5f, 12.0f);
                path.cubicTo(16.5f, 14.928932f, 15.380712f, 17.580582f, 13.571068f, 19.5f);
                instancePath.lineTo(12.510407f, 18.375f);
                Path path2 = instancePath;
                path2.cubicTo(14.095152f, 16.694124f, 15.0f, 14.425054f, 15.0f, 12.0f);
                path2.cubicTo(15.0f, 9.574946f, 14.095152f, 7.305876f, 12.510407f, 5.625f);
                instancePath.lineTo(13.571068f, 4.5f);
                instancePath.close();
                instancePath.moveTo(11.096194f, 7.125f);
                path2.cubicTo(12.272463f, 8.372622f, 13.0f, 10.096194f, 13.0f, 12.0f);
                path2.cubicTo(13.0f, 13.903806f, 12.272463f, 15.627378f, 11.096194f, 16.875f);
                instancePath.lineTo(10.035534f, 15.75f);
                Path path3 = instancePath;
                path3.cubicTo(10.968138f, 14.760825f, 11.5f, 13.427082f, 11.5f, 12.0f);
                path3.cubicTo(11.5f, 10.572918f, 10.968138f, 9.239176f, 10.035534f, 8.25f);
                instancePath.lineTo(11.096194f, 7.125f);
                instancePath.close();
                instancePath.moveTo(8.621321f, 9.75f);
                Path path4 = instancePath;
                path4.cubicTo(9.164213f, 10.325825f, 9.5f, 11.121321f, 9.5f, 12.0f);
                path4.cubicTo(9.5f, 12.878679f, 9.164213f, 13.674175f, 8.621321f, 14.25f);
                instancePath.lineTo(8.621321f, 14.25f);
                instancePath.lineTo(6.5f, 12.0f);
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
