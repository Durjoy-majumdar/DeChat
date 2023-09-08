package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_lqt_detailbg */
public class kinda_lqt_detailbg extends C24542c {
    private final int height = 1334;
    private final int width = 750;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 750;
        }
        if (i == 1) {
            return 1334;
        }
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-870400);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(750.0f, 0.0f);
            instancePath.lineTo(750.0f, 1334.0f);
            instancePath.lineTo(0.0f, 1334.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-877312);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(68.52344f, 1334.0f);
            instancePath2.lineTo(849.0469f, 377.4297f);
            instancePath2.lineTo(5.891446E-14f, 199.80469f);
            instancePath2.lineTo(0.0f, 1334.0f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.saveLayerAlpha((RectF) null, 69, 31);
            Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
            instancePaint7.setColor(-748799);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(801.0469f, 102.0f);
            instancePath3.lineTo(-62.109375f, 375.08594f);
            instancePath3.lineTo(-62.109375f, 657.77344f);
            instancePath3.lineTo(785.65625f, 1323.5469f);
            instancePath3.close();
            WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.saveLayerAlpha((RectF) null, 39, 31);
            Paint instancePaint8 = C24542c.instancePaint(instancePaint7, looper);
            WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
            canvas.drawPath(instancePath3, instancePaint8);
            canvas.restore();
            Paint instancePaint9 = C24542c.instancePaint(instancePaint, looper);
            instancePaint9.setColor(-25344);
            Path instancePath4 = C24542c.instancePath(looper);
            instancePath4.moveTo(-88.0f, 1217.8438f);
            instancePath4.lineTo(903.0781f, 1441.7344f);
            instancePath4.lineTo(855.39844f, 671.83594f);
            instancePath4.close();
            WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
            canvas.saveLayerAlpha((RectF) null, 103, 31);
            Paint instancePaint10 = C24542c.instancePaint(instancePaint9, looper);
            WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
            canvas.drawPath(instancePath4, instancePaint10);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
