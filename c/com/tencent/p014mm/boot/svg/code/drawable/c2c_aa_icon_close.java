package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.c2c_aa_icon_close */
public class c2c_aa_icon_close extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 120;
        }
        if (i2 == 2) {
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
            instancePaint3.setColor(-1);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(60.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(93.137085f, 0.0f, 120.0f, 26.862917f, 120.0f, 60.0f);
            path.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
            path.cubicTo(26.862917f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
            path.cubicTo(0.0f, 26.862917f, 26.862917f, 0.0f, 60.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(60.0f, 3.5294118f);
            Path path2 = instancePath;
            path2.cubicTo(28.812153f, 3.5294118f, 3.5294118f, 28.812153f, 3.5294118f, 60.0f);
            path2.cubicTo(3.5294118f, 91.18784f, 28.812153f, 116.47059f, 60.0f, 116.47059f);
            path2.cubicTo(91.18784f, 116.47059f, 116.47059f, 91.18784f, 116.47059f, 60.0f);
            path2.cubicTo(116.47059f, 28.812153f, 91.18784f, 3.5294118f, 60.0f, 3.5294118f);
            instancePath.close();
            instancePath.moveTo(82.355896f, 30.0f);
            path2.cubicTo(83.653755f, 30.0f, 84.70588f, 31.054106f, 84.70588f, 32.35207f);
            instancePath.lineTo(84.70588f, 87.64793f);
            instancePath.cubicTo(84.70588f, 88.94694f, 83.650986f, 90.0f, 82.355896f, 90.0f);
            instancePath.lineTo(37.644104f, 90.0f);
            instancePath.cubicTo(36.34625f, 90.0f, 35.294117f, 88.94589f, 35.294117f, 87.64793f);
            instancePath.lineTo(35.294117f, 32.35207f);
            instancePath.cubicTo(35.294117f, 31.053059f, 36.34901f, 30.0f, 37.644104f, 30.0f);
            instancePath.lineTo(82.355896f, 30.0f);
            instancePath.close();
            instancePath.moveTo(81.17647f, 33.52941f);
            instancePath.lineTo(38.82353f, 33.52941f);
            instancePath.lineTo(38.82353f, 86.47059f);
            instancePath.lineTo(81.17647f, 86.47059f);
            instancePath.lineTo(81.17647f, 33.52941f);
            instancePath.close();
            instancePath.moveTo(74.67125f, 60.0f);
            instancePath.lineTo(77.166916f, 62.49567f);
            instancePath.lineTo(68.43207f, 71.230515f);
            instancePath.lineTo(77.166916f, 79.96536f);
            instancePath.lineTo(74.67125f, 82.46104f);
            instancePath.lineTo(65.9364f, 73.72619f);
            instancePath.lineTo(57.201553f, 82.46104f);
            instancePath.lineTo(54.705883f, 79.96536f);
            instancePath.lineTo(63.44073f, 71.230515f);
            instancePath.lineTo(54.705883f, 62.49567f);
            instancePath.lineTo(57.201553f, 60.0f);
            instancePath.lineTo(65.9364f, 68.73485f);
            instancePath.lineTo(74.67125f, 60.0f);
            instancePath.close();
            instancePath.moveTo(61.764706f, 47.64706f);
            instancePath.lineTo(61.764706f, 51.17647f);
            instancePath.lineTo(44.11765f, 51.17647f);
            instancePath.lineTo(44.11765f, 47.64706f);
            instancePath.lineTo(61.764706f, 47.64706f);
            instancePath.close();
            instancePath.moveTo(61.764706f, 38.82353f);
            instancePath.lineTo(61.764706f, 42.35294f);
            instancePath.lineTo(44.11765f, 42.35294f);
            instancePath.lineTo(44.11765f, 38.82353f);
            instancePath.lineTo(61.764706f, 38.82353f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
