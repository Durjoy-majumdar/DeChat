package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voice_rcd_hint */
public class voice_rcd_hint extends C24542c {
    private final int height = 180;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 120;
        }
        if (i2 == 1) {
            return 180;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(24.0f, 76.0f);
        instancePath.lineTo(24.0f, 98.23779f);
        instancePath.cubicTo(24.0f, 121.084274f, 40.67616f, 139.71544f, 62.0f, 141.80502f);
        instancePath.lineTo(62.0f, 152.0f);
        instancePath.lineTo(70.0f, 152.0f);
        instancePath.lineTo(70.0f, 141.80527f);
        instancePath.lineTo(70.0f, 141.80527f);
        instancePath.cubicTo(91.31973f, 139.7189f, 108.0f, 121.12331f, 108.0f, 98.434006f);
        instancePath.lineTo(108.0f, 76.0f);
        instancePath.lineTo(100.0f, 76.0f);
        instancePath.lineTo(100.0f, 98.63076f);
        Path path = instancePath;
        path.cubicTo(100.0f, 118.188705f, 84.77768f, 134.0f, 66.0f, 134.0f);
        path.cubicTo(47.21819f, 134.0f, 32.0f, 118.16465f, 32.0f, 98.63076f);
        instancePath.lineTo(32.0f, 76.0f);
        instancePath.lineTo(24.0f, 76.0f);
        instancePath.lineTo(24.0f, 76.0f);
        instancePath.close();
        instancePath.moveTo(38.0f, 152.0f);
        Path path2 = instancePath;
        path2.cubicTo(35.79086f, 152.0f, 34.0f, 153.79086f, 34.0f, 156.0f);
        path2.cubicTo(34.0f, 158.20914f, 35.79086f, 160.0f, 38.0f, 160.0f);
        instancePath.lineTo(94.0f, 160.0f);
        Path path3 = instancePath;
        path3.cubicTo(96.20914f, 160.0f, 98.0f, 158.20914f, 98.0f, 156.0f);
        path3.cubicTo(98.0f, 153.79086f, 96.20914f, 152.0f, 94.0f, 152.0f);
        instancePath.lineTo(38.0f, 152.0f);
        instancePath.close();
        instancePath.moveTo(40.0f, 98.66034f);
        path3.cubicTo(40.0f, 113.75961f, 51.63744f, 126.0f, 66.0f, 126.0f);
        path3.cubicTo(80.359406f, 126.0f, 92.0f, 113.77821f, 92.0f, 98.66034f);
        instancePath.lineTo(92.0f, 45.339664f);
        Path path4 = instancePath;
        path4.cubicTo(92.0f, 30.240385f, 80.362564f, 18.0f, 66.0f, 18.0f);
        path4.cubicTo(51.6406f, 18.0f, 40.0f, 30.22179f, 40.0f, 45.339664f);
        instancePath.lineTo(40.0f, 98.66034f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(104.0f, 80.0f);
        Path path5 = instancePath2;
        path5.cubicTo(106.20914f, 80.0f, 108.0f, 78.20914f, 108.0f, 76.0f);
        path5.cubicTo(108.0f, 73.79086f, 106.20914f, 72.0f, 104.0f, 72.0f);
        path5.cubicTo(101.79086f, 72.0f, 100.0f, 73.79086f, 100.0f, 76.0f);
        path5.cubicTo(100.0f, 78.20914f, 101.79086f, 80.0f, 104.0f, 80.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(28.0f, 80.0f);
        Path path6 = instancePath3;
        path6.cubicTo(30.209139f, 80.0f, 32.0f, 78.20914f, 32.0f, 76.0f);
        path6.cubicTo(32.0f, 73.79086f, 30.209139f, 72.0f, 28.0f, 72.0f);
        path6.cubicTo(25.790861f, 72.0f, 24.0f, 73.79086f, 24.0f, 76.0f);
        path6.cubicTo(24.0f, 78.20914f, 25.790861f, 80.0f, 28.0f, 80.0f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
