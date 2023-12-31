package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;
import xk0.C91263b;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.backup_move_error */
public class backup_move_error extends C24542c {
    private final int height = C91263b.CTRL_INDEX;
    private final int width = 438;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 438;
        }
        if (i2 == 1) {
            return C91263b.CTRL_INDEX;
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
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(171.0f, 225.46962f);
        instancePath.lineTo(171.0f, 312.0046f);
        instancePath.cubicTo(171.0f, 320.83633f, 163.8328f, 328.0f, 154.99161f, 328.0f);
        instancePath.lineTo(22.008387f, 328.0f);
        instancePath.cubicTo(13.169351f, 328.0f, 6.0f, 320.83862f, 6.0f, 312.0046f);
        instancePath.lineTo(6.0f, 45.995407f);
        instancePath.cubicTo(6.0f, 37.163662f, 13.167199f, 30.0f, 22.008387f, 30.0f);
        instancePath.lineTo(154.99161f, 30.0f);
        instancePath.cubicTo(163.83064f, 30.0f, 171.0f, 37.16139f, 171.0f, 45.995407f);
        instancePath.lineTo(171.0f, 120.0f);
        instancePath.lineTo(168.0f, 120.0f);
        instancePath.lineTo(168.0f, 45.994846f);
        instancePath.cubicTo(168.0f, 38.81799f, 162.17625f, 33.0f, 155.00523f, 33.0f);
        instancePath.lineTo(21.99477f, 33.0f);
        instancePath.cubicTo(14.817957f, 33.0f, 9.0f, 38.81637f, 9.0f, 45.994846f);
        instancePath.lineTo(9.0f, 312.00516f);
        instancePath.cubicTo(9.0f, 319.182f, 14.823739f, 325.0f, 21.99477f, 325.0f);
        instancePath.lineTo(155.00523f, 325.0f);
        instancePath.cubicTo(162.18204f, 325.0f, 168.0f, 319.18362f, 168.0f, 312.00516f);
        instancePath.lineTo(168.0f, 225.46962f);
        instancePath.lineTo(171.0f, 225.46962f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(161.0f, 225.46962f);
        instancePath2.lineTo(161.0f, 288.0f);
        instancePath2.lineTo(18.0f, 288.0f);
        instancePath2.lineTo(18.0f, 62.0f);
        instancePath2.lineTo(161.0f, 62.0f);
        instancePath2.lineTo(161.0f, 120.0f);
        instancePath2.lineTo(159.5f, 120.0f);
        instancePath2.lineTo(159.5f, 63.5f);
        instancePath2.lineTo(19.5f, 63.5f);
        instancePath2.lineTo(19.5f, 286.5f);
        instancePath2.lineTo(159.5f, 286.5f);
        instancePath2.lineTo(159.5f, 225.46962f);
        instancePath2.lineTo(161.0f, 225.46962f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(77.0f, 45.0f);
        instancePath3.lineTo(100.0f, 45.0f);
        instancePath3.lineTo(100.0f, 47.5f);
        instancePath3.lineTo(77.0f, 47.5f);
        instancePath3.lineTo(77.0f, 45.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(247.0f, 120.0f);
        instancePath4.lineTo(247.0f, 45.0f);
        instancePath4.lineTo(419.0f, 45.0f);
        instancePath4.lineTo(419.0f, 318.0f);
        instancePath4.lineTo(247.0f, 318.0f);
        instancePath4.lineTo(247.0f, 225.46962f);
        instancePath4.lineTo(248.5f, 225.46962f);
        instancePath4.lineTo(248.5f, 316.5f);
        instancePath4.lineTo(417.5f, 316.5f);
        instancePath4.lineTo(417.5f, 46.5f);
        instancePath4.lineTo(248.5f, 46.5f);
        instancePath4.lineTo(248.5f, 120.0f);
        instancePath4.lineTo(247.0f, 120.0f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(234.0f, 120.0f);
        instancePath5.lineTo(234.0f, 21.991756f);
        instancePath5.cubicTo(234.0f, 13.170865f, 241.1606f, 6.0f, 249.99364f, 6.0f);
        instancePath5.lineTo(416.00635f, 6.0f);
        instancePath5.cubicTo(424.8361f, 6.0f, 432.0f, 13.159754f, 432.0f, 21.991756f);
        instancePath5.lineTo(432.0f, 350.00824f);
        instancePath5.cubicTo(432.0f, 358.82913f, 424.83942f, 366.0f, 416.00635f, 366.0f);
        instancePath5.lineTo(249.99364f, 366.0f);
        instancePath5.cubicTo(241.1639f, 366.0f, 234.0f, 358.84024f, 234.0f, 350.00824f);
        instancePath5.lineTo(234.0f, 225.46962f);
        instancePath5.lineTo(237.0f, 225.46962f);
        instancePath5.lineTo(237.0f, 350.00754f);
        instancePath5.cubicTo(237.0f, 357.18307f, 242.82472f, 363.0f, 250.00838f, 363.0f);
        instancePath5.lineTo(415.99164f, 363.0f);
        instancePath5.cubicTo(423.17596f, 363.0f, 429.0f, 357.18747f, 429.0f, 350.00754f);
        instancePath5.lineTo(429.0f, 21.992458f);
        instancePath5.cubicTo(429.0f, 14.816921f, 423.17526f, 9.0f, 415.99164f, 9.0f);
        instancePath5.lineTo(250.00838f, 9.0f);
        instancePath5.cubicTo(242.82405f, 9.0f, 237.0f, 14.812543f, 237.0f, 21.992458f);
        instancePath5.lineTo(237.0f, 120.0f);
        instancePath5.lineTo(234.0f, 120.0f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint, looper);
        instancePaint8.setColor(-16777216);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(320.0f, 24.0f);
        instancePath6.lineTo(346.0f, 24.0f);
        instancePath6.lineTo(346.0f, 27.0f);
        instancePath6.lineTo(320.0f, 27.0f);
        instancePath6.lineTo(320.0f, 24.0f);
        instancePath6.close();
        canvas.drawPath(instancePath6, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-16777216);
        Path instancePath7 = C24542c.instancePath(looper);
        instancePath7.moveTo(182.65118f, 249.89926f);
        instancePath7.lineTo(182.5955f, 225.46962f);
        instancePath7.lineTo(155.88837f, 225.46962f);
        Path path = instancePath7;
        path.cubicTo(149.33305f, 225.46962f, 144.0f, 220.17123f, 144.0f, 213.65854f);
        instancePath7.lineTo(144.0f, 131.81108f);
        path.cubicTo(144.0f, 125.298386f, 149.33305f, 120.0f, 155.88837f, 120.0f);
        instancePath7.lineTo(282.11163f, 120.0f);
        path.cubicTo(288.66693f, 120.0f, 294.0f, 125.298386f, 294.0f, 131.81108f);
        instancePath7.lineTo(294.0f, 213.65854f);
        path.cubicTo(294.0f, 220.17123f, 288.66693f, 225.46962f, 282.11163f, 225.46962f);
        instancePath7.lineTo(219.13837f, 225.46962f);
        instancePath7.lineTo(191.35858f, 253.56952f);
        path.cubicTo(190.35439f, 254.50647f, 189.10912f, 254.99985f, 187.80786f, 255.0f);
        path.cubicTo(184.97136f, 255.0003f, 182.6581f, 252.7121f, 182.65118f, 249.89926f);
        instancePath7.close();
        instancePath7.moveTo(185.58853f, 247.54555f);
        instancePath7.lineTo(185.60806f, 222.6283f);
        instancePath7.lineTo(158.50444f, 222.48622f);
        path.cubicTo(150.85406f, 222.5878f, 147.13077f, 218.84735f, 147.09161f, 211.1126f);
        instancePath7.lineTo(147.0f, 134.37363f);
        path.cubicTo(147.13213f, 125.48259f, 152.01384f, 122.979996f, 158.41283f, 123.0f);
        instancePath7.lineTo(279.58716f, 123.0f);
        path.cubicTo(289.20505f, 123.0f, 291.02707f, 128.21953f, 291.0f, 134.37363f);
        instancePath7.lineTo(291.0916f, 211.1126f);
        path.cubicTo(291.11636f, 218.63168f, 288.0281f, 222.59373f, 279.67877f, 222.48622f);
        instancePath7.lineTo(217.95168f, 222.58171f);
        instancePath7.lineTo(190.5552f, 250.40294f);
        path.cubicTo(189.59119f, 251.30519f, 188.85378f, 251.84087f, 187.63156f, 251.84087f);
        path.cubicTo(185.60806f, 251.86566f, 185.59517f, 250.2542f, 185.58853f, 247.54555f);
        instancePath7.close();
        WeChatSVGRenderC2Java.setFillType(instancePath7, 2);
        canvas.drawPath(instancePath7, instancePaint9);
        canvas.restore();
        canvas.save();
        Paint instancePaint10 = C24542c.instancePaint(instancePaint, looper);
        instancePaint10.setColor(-564640);
        Path instancePath8 = C24542c.instancePath(looper);
        instancePath8.moveTo(252.0f, 171.40741f);
        Path path2 = instancePath8;
        path2.cubicTo(252.0f, 152.77422f, 237.22578f, 138.0f, 218.59259f, 138.0f);
        path2.cubicTo(200.77422f, 138.0f, 186.0f, 152.77422f, 186.0f, 171.40741f);
        path2.cubicTo(186.0f, 189.22578f, 200.77422f, 204.0f, 218.59259f, 204.0f);
        path2.cubicTo(237.22578f, 204.0f, 252.0f, 189.22578f, 252.0f, 171.40741f);
        instancePath8.close();
        instancePath8.moveTo(249.0f, 171.37038f);
        Path path3 = instancePath8;
        path3.cubicTo(249.0f, 154.4311f, 235.5689f, 141.0f, 218.62962f, 141.0f);
        path3.cubicTo(202.4311f, 141.0f, 189.0f, 154.4311f, 189.0f, 171.37038f);
        path3.cubicTo(189.0f, 187.5689f, 202.4311f, 201.0f, 218.62962f, 201.0f);
        path3.cubicTo(235.5689f, 201.0f, 249.0f, 187.5689f, 249.0f, 171.37038f);
        instancePath8.close();
        instancePath8.moveTo(219.0763f, 156.97f);
        instancePath8.cubicTo(217.41943f, 156.97f, 216.14113f, 158.31671f, 216.22063f, 159.96783f);
        instancePath8.lineTo(216.93195f, 174.74138f);
        instancePath8.cubicTo(217.01166f, 176.39705f, 218.41936f, 177.73923f, 220.06693f, 177.73923f);
        instancePath8.lineTo(218.08566f, 177.73923f);
        instancePath8.cubicTo(219.73734f, 177.73923f, 221.14113f, 176.3925f, 221.22063f, 174.74138f);
        instancePath8.lineTo(221.93195f, 159.96783f);
        instancePath8.cubicTo(222.01166f, 158.31218f, 220.72977f, 156.97f, 219.0763f, 156.97f);
        instancePath8.close();
        instancePath8.moveTo(219.0763f, 186.97f);
        Path path4 = instancePath8;
        path4.cubicTo(220.73314f, 186.97f, 222.0763f, 185.67851f, 222.0763f, 184.08537f);
        path4.cubicTo(222.0763f, 182.49225f, 220.73314f, 181.20076f, 219.0763f, 181.20076f);
        path4.cubicTo(217.41943f, 181.20076f, 216.0763f, 182.49225f, 216.0763f, 184.08537f);
        path4.cubicTo(216.0763f, 185.67851f, 217.41943f, 186.97f, 219.0763f, 186.97f);
        instancePath8.close();
        WeChatSVGRenderC2Java.setFillType(instancePath8, 2);
        canvas.drawPath(instancePath8, instancePaint10);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
