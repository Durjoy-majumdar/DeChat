package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_sticker_album */
public class icons_filled_sticker_album extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(62.4f, 6.0f);
        Path path = instancePath;
        path.cubicTo(64.38822f, 6.0f, 66.0f, 7.611775f, 66.0f, 9.6f);
        instancePath.lineTo(66.0f, 62.4f);
        path.cubicTo(66.0f, 64.38822f, 64.38822f, 66.0f, 62.4f, 66.0f);
        instancePath.lineTo(9.6f, 66.0f);
        path.cubicTo(7.611775f, 66.0f, 6.0f, 64.38822f, 6.0f, 62.4f);
        instancePath.lineTo(6.0f, 9.6f);
        path.cubicTo(6.0f, 7.611775f, 7.611775f, 6.0f, 9.6f, 6.0f);
        instancePath.lineTo(62.4f, 6.0f);
        instancePath.close();
        instancePath.moveTo(36.0f, 15.0f);
        Path path2 = instancePath;
        path2.cubicTo(24.40202f, 15.0f, 15.0f, 24.40202f, 15.0f, 36.0f);
        path2.cubicTo(15.0f, 47.59798f, 24.40202f, 57.0f, 36.0f, 57.0f);
        path2.cubicTo(47.59798f, 57.0f, 57.0f, 47.59798f, 57.0f, 36.0f);
        path2.cubicTo(57.0f, 24.40202f, 47.59798f, 15.0f, 36.0f, 15.0f);
        instancePath.close();
        instancePath.moveTo(47.502914f, 38.1f);
        path2.cubicTo(46.972424f, 43.986824f, 42.024944f, 48.6f, 36.0f, 48.6f);
        path2.cubicTo(29.975056f, 48.6f, 25.027575f, 43.986824f, 24.497086f, 38.1f);
        instancePath.lineTo(24.497086f, 38.1f);
        instancePath.close();
        instancePath.moveTo(28.65f, 26.55f);
        path2.cubicTo(30.389696f, 26.55f, 31.8f, 27.960302f, 31.8f, 29.7f);
        path2.cubicTo(31.8f, 31.439697f, 30.389696f, 32.85f, 28.65f, 32.85f);
        path2.cubicTo(26.910303f, 32.85f, 25.5f, 31.439697f, 25.5f, 29.7f);
        path2.cubicTo(25.5f, 27.960302f, 26.910303f, 26.55f, 28.65f, 26.55f);
        instancePath.close();
        instancePath.moveTo(43.35f, 26.55f);
        path2.cubicTo(45.0897f, 26.55f, 46.5f, 27.960302f, 46.5f, 29.7f);
        path2.cubicTo(46.5f, 31.439697f, 45.0897f, 32.85f, 43.35f, 32.85f);
        path2.cubicTo(41.610302f, 32.85f, 40.2f, 31.439697f, 40.2f, 29.7f);
        path2.cubicTo(40.2f, 27.960302f, 41.610302f, 26.55f, 43.35f, 26.55f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
