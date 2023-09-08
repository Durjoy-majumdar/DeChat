package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_plugin_icon_contract */
public class default_plugin_icon_contract extends C24542c {
    private final int height = 480;
    private final int width = 480;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 480;
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
        instancePaint3.setColor(-16337763);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(480.0f, 0.0f);
        instancePath.lineTo(480.0f, 480.0f);
        instancePath.lineTo(0.0f, 480.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(110.0f, 114.0f);
        Path path = instancePath2;
        path.cubicTo(110.0f, 111.79086f, 111.79086f, 110.0f, 114.0f, 110.0f);
        instancePath2.lineTo(366.0f, 110.0f);
        path.cubicTo(368.20914f, 110.0f, 370.0f, 111.79086f, 370.0f, 114.0f);
        instancePath2.lineTo(370.0f, 366.0f);
        path.cubicTo(370.0f, 368.20914f, 368.20914f, 370.0f, 366.0f, 370.0f);
        instancePath2.lineTo(114.0f, 370.0f);
        path.cubicTo(111.79086f, 370.0f, 110.0f, 368.20914f, 110.0f, 366.0f);
        instancePath2.lineTo(110.0f, 114.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16337763);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(240.0f, 156.0f);
        Path path2 = instancePath3;
        path2.cubicTo(262.0914f, 156.0f, 280.0f, 173.90862f, 280.0f, 196.0f);
        path2.cubicTo(280.0f, 218.09138f, 262.0914f, 236.0f, 240.0f, 236.0f);
        path2.cubicTo(217.90862f, 236.0f, 200.0f, 218.09138f, 200.0f, 196.0f);
        path2.cubicTo(200.0f, 173.90862f, 217.90862f, 156.0f, 240.0f, 156.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16337763);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(191.0f, 244.0f);
        Path path3 = instancePath4;
        path3.cubicTo(213.09138f, 244.0f, 231.0f, 261.9086f, 231.0f, 284.0f);
        path3.cubicTo(231.0f, 306.0914f, 213.09138f, 324.0f, 191.0f, 324.0f);
        path3.cubicTo(168.90862f, 324.0f, 151.0f, 306.0914f, 151.0f, 284.0f);
        path3.cubicTo(151.0f, 261.9086f, 168.90862f, 244.0f, 191.0f, 244.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16337763);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(289.0f, 324.0f);
        Path path4 = instancePath5;
        path4.cubicTo(311.0914f, 324.0f, 329.0f, 306.0914f, 329.0f, 284.0f);
        path4.cubicTo(329.0f, 261.9086f, 311.0914f, 244.0f, 289.0f, 244.0f);
        path4.cubicTo(266.9086f, 244.0f, 249.0f, 261.9086f, 249.0f, 284.0f);
        path4.cubicTo(249.0f, 306.0914f, 266.9086f, 324.0f, 289.0f, 324.0f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
