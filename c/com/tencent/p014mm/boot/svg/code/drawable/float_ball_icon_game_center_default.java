package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.float_ball_icon_game_center_default */
public class float_ball_icon_game_center_default extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
        }
        if (i2 != 2) {
            return 0;
        }
        Canvas canvas = objArr[0];
        Looper looper = objArr[1];
        Matrix instanceMatrix = C24542c.instanceMatrix(looper);
        float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(48.0f, 0.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(0.0f, 48.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-352965);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(2.3050551f, 13.125f);
        Path path = instancePath2;
        path.cubicTo(2.4187791f, 12.8417225f, 2.5899003f, 12.576766f, 2.818128f, 12.348538f);
        instancePath2.lineTo(12.348538f, 2.818128f);
        path.cubicTo(12.577369f, 2.5892978f, 12.842251f, 2.41826f, 13.125f, 2.3047276f);
        instancePath2.lineTo(13.125f, 9.1779f);
        path.cubicTo(11.120219f, 9.539286f, 9.539286f, 11.120219f, 9.1779f, 13.125f);
        instancePath2.lineTo(2.3050551f, 13.125f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-15683841);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(25.695272f, 13.125f);
        instancePath3.lineTo(18.8221f, 13.125f);
        Path path2 = instancePath3;
        path2.cubicTo(18.460714f, 11.120219f, 16.879782f, 9.539286f, 14.875f, 9.1779f);
        instancePath3.lineTo(14.875f, 2.3050551f);
        path2.cubicTo(15.1582775f, 2.4187791f, 15.423234f, 2.5899003f, 15.651462f, 2.818128f);
        instancePath3.lineTo(25.181871f, 12.348538f);
        path2.cubicTo(25.410702f, 12.577369f, 25.58174f, 12.842251f, 25.695272f, 13.125f);
        instancePath3.lineTo(25.695272f, 13.125f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16268960);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(25.694944f, 14.875f);
        Path path3 = instancePath4;
        path3.cubicTo(25.58122f, 15.1582775f, 25.410099f, 15.423234f, 25.181871f, 15.651462f);
        instancePath4.lineTo(15.651462f, 25.181871f);
        path3.cubicTo(15.422631f, 25.410702f, 15.157749f, 25.58174f, 14.875f, 25.695272f);
        instancePath4.lineTo(14.875f, 18.8221f);
        instancePath4.cubicTo(16.879782f, 18.460714f, 18.460714f, 16.879782f, 18.8221f, 14.875f);
        instancePath4.lineTo(25.694944f, 14.875f);
        instancePath4.lineTo(25.694944f, 14.875f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-372399);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(2.3047276f, 14.875f);
        instancePath5.lineTo(9.1779f, 14.875f);
        Path path4 = instancePath5;
        path4.cubicTo(9.539286f, 16.879782f, 11.120219f, 18.460714f, 13.125f, 18.8221f);
        instancePath5.lineTo(13.125f, 25.694944f);
        path4.cubicTo(12.8417225f, 25.58122f, 12.576766f, 25.410099f, 12.348538f, 25.181871f);
        instancePath5.lineTo(2.818128f, 15.651462f);
        instancePath5.cubicTo(2.5892978f, 15.422631f, 2.41826f, 15.157749f, 2.3047276f, 14.875f);
        instancePath5.lineTo(2.3047276f, 14.875f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
