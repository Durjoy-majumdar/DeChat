package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_delete */
public class icons_outlined_delete extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(20.320658f, 19.199991f);
        instancePath.lineTo(22.757717f, 60.142605f);
        instancePath.cubicTo(22.833185f, 61.410458f, 23.88338f, 62.4f, 25.153477f, 62.4f);
        instancePath.lineTo(46.846523f, 62.4f);
        instancePath.cubicTo(48.11662f, 62.4f, 49.166817f, 61.410458f, 49.242283f, 60.142605f);
        instancePath.lineTo(51.679344f, 19.199991f);
        instancePath.lineTo(20.320658f, 19.199991f);
        instancePath.close();
        instancePath.moveTo(55.285713f, 19.199991f);
        instancePath.lineTo(52.835922f, 60.35651f);
        instancePath.cubicTo(52.647255f, 63.526142f, 50.021767f, 66.0f, 46.846523f, 66.0f);
        instancePath.lineTo(25.153477f, 66.0f);
        instancePath.cubicTo(21.978235f, 66.0f, 19.352747f, 63.526142f, 19.164078f, 60.35651f);
        instancePath.lineTo(16.714285f, 19.199991f);
        instancePath.lineTo(10.5f, 19.199991f);
        instancePath.lineTo(10.5f, 17.09999f);
        instancePath.cubicTo(10.5f, 16.271564f, 11.171573f, 15.599991f, 12.0f, 15.599991f);
        instancePath.lineTo(60.0f, 15.599991f);
        instancePath.cubicTo(60.828426f, 15.599991f, 61.5f, 16.271564f, 61.5f, 17.09999f);
        instancePath.lineTo(61.5f, 19.199991f);
        instancePath.lineTo(55.285713f, 19.199991f);
        instancePath.close();
        instancePath.moveTo(42.0f, 9.000082f);
        instancePath.cubicTo(42.828426f, 9.000082f, 43.5f, 9.671655f, 43.5f, 10.500082f);
        instancePath.lineTo(43.5f, 12.600073f);
        instancePath.lineTo(28.5f, 12.600073f);
        instancePath.lineTo(28.5f, 10.500082f);
        instancePath.cubicTo(28.5f, 9.671655f, 29.171574f, 9.000082f, 30.0f, 9.000082f);
        instancePath.lineTo(42.0f, 9.000082f);
        instancePath.close();
        instancePath.moveTo(28.5f, 27.0f);
        instancePath.lineTo(32.100037f, 27.0f);
        instancePath.lineTo(33.600037f, 54.0f);
        instancePath.lineTo(30.0f, 54.0f);
        instancePath.lineTo(28.5f, 27.0f);
        instancePath.close();
        instancePath.moveTo(39.899963f, 27.0f);
        instancePath.lineTo(43.5f, 27.0f);
        instancePath.lineTo(42.0f, 54.0f);
        instancePath.lineTo(38.399963f, 54.0f);
        instancePath.lineTo(39.899963f, 27.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
