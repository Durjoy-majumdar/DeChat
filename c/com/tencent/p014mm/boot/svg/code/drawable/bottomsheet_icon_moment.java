package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_moment */
public class bottomsheet_icon_moment extends C24542c {
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
        instancePaint3.setColor(-16268960);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(28.5f, 65.05487f);
        instancePath.lineTo(28.5f, 45.470562f);
        instancePath.lineTo(46.96314f, 63.933704f);
        Path path = instancePath;
        path.cubicTo(43.567234f, 65.26753f, 39.869156f, 66.0f, 36.0f, 66.0f);
        path.cubicTo(33.41025f, 66.0f, 30.89715f, 65.67185f, 28.5f, 65.05487f);
        instancePath.lineTo(28.5f, 65.05487f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-7220480);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(24.0f, 63.50374f);
        instancePath2.cubicTo(18.196375f, 60.968025f, 13.350096f, 56.649204f, 10.153644f, 51.239754f);
        instancePath2.lineTo(24.0f, 37.3934f);
        instancePath2.lineTo(24.0f, 63.50374f);
        instancePath2.lineTo(24.0f, 63.50374f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-15616);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(8.066298f, 46.96314f);
        Path path2 = instancePath3;
        path2.cubicTo(6.7324653f, 43.567234f, 6.0f, 39.869156f, 6.0f, 36.0f);
        path2.cubicTo(6.0f, 33.41025f, 6.3281474f, 30.89715f, 6.9451313f, 28.5f);
        instancePath3.lineTo(26.529438f, 28.5f);
        instancePath3.lineTo(8.066298f, 46.96314f);
        instancePath3.lineTo(8.066298f, 46.96314f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-352965);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(8.496263f, 24.0f);
        instancePath4.cubicTo(11.031974f, 18.196375f, 15.350795f, 13.350096f, 20.760244f, 10.153644f);
        instancePath4.lineTo(34.6066f, 24.0f);
        instancePath4.lineTo(8.496263f, 24.0f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-372399);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(36.0f, 6.0f);
        Path path3 = instancePath5;
        path3.cubicTo(38.58975f, 6.0f, 41.10285f, 6.3281474f, 43.5f, 6.9451313f);
        instancePath5.lineTo(43.5f, 26.529438f);
        instancePath5.lineTo(25.03686f, 8.066298f);
        path3.cubicTo(28.432766f, 6.7324653f, 32.130844f, 6.0f, 36.0f, 6.0f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint, looper);
        instancePaint8.setColor(-10197008);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(48.0f, 8.496263f);
        instancePath6.cubicTo(53.803627f, 11.031974f, 58.649906f, 15.350795f, 61.846355f, 20.760244f);
        instancePath6.lineTo(48.0f, 34.6066f);
        instancePath6.lineTo(48.0f, 8.496263f);
        instancePath6.close();
        WeChatSVGRenderC2Java.setFillType(instancePath6, 2);
        canvas.drawPath(instancePath6, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-15432210);
        Path instancePath7 = C24542c.instancePath(looper);
        instancePath7.moveTo(63.933704f, 25.03686f);
        Path path4 = instancePath7;
        path4.cubicTo(65.26753f, 28.432766f, 66.0f, 32.130844f, 66.0f, 36.0f);
        path4.cubicTo(66.0f, 38.58975f, 65.67185f, 41.10285f, 65.05487f, 43.5f);
        instancePath7.lineTo(45.470562f, 43.5f);
        instancePath7.lineTo(63.933704f, 25.03686f);
        instancePath7.lineTo(63.933704f, 25.03686f);
        instancePath7.close();
        WeChatSVGRenderC2Java.setFillType(instancePath7, 2);
        canvas.drawPath(instancePath7, instancePaint9);
        canvas.restore();
        canvas.save();
        Paint instancePaint10 = C24542c.instancePaint(instancePaint, looper);
        instancePaint10.setColor(-15683841);
        Path instancePath8 = C24542c.instancePath(looper);
        instancePath8.moveTo(63.50374f, 48.0f);
        instancePath8.cubicTo(60.968025f, 53.803627f, 56.649204f, 58.649906f, 51.239754f, 61.846355f);
        instancePath8.lineTo(37.3934f, 48.0f);
        instancePath8.lineTo(63.50374f, 48.0f);
        instancePath8.lineTo(63.50374f, 48.0f);
        instancePath8.close();
        WeChatSVGRenderC2Java.setFillType(instancePath8, 2);
        canvas.drawPath(instancePath8, instancePaint10);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
