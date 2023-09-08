package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import com.tencent.xweb.util.WXWebReporter;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voiceinput_icon_button_care */
public class voiceinput_icon_button_care extends C24542c {
    private final int height = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD;
    private final int width = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD;
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
        instancePaint3.setColor(-16676542);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(94.5f, 0.0f);
        Path path = instancePath;
        path.cubicTo(146.69092f, 0.0f, 189.0f, 42.30909f, 189.0f, 94.5f);
        path.cubicTo(189.0f, 146.69092f, 146.69092f, 189.0f, 94.5f, 189.0f);
        path.cubicTo(42.30909f, 189.0f, 0.0f, 146.69092f, 0.0f, 94.5f);
        path.cubicTo(0.0f, 42.30909f, 42.30909f, 0.0f, 94.5f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.8660254f, -0.5f, 59.728077f, 0.5f, 0.8660254f, -34.824978f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(98.173996f, 132.51166f);
        instancePath2.lineTo(95.49956f, 138.75635f);
        Path path2 = instancePath2;
        path2.cubicTo(95.34553f, 139.11601f, 94.92909f, 139.2827f, 94.56943f, 139.12866f);
        path2.cubicTo(94.40209f, 139.057f, 94.26877f, 138.92368f, 94.197105f, 138.75635f);
        instancePath2.lineTo(91.52267f, 132.51166f);
        instancePath2.lineTo(98.173996f, 132.51166f);
        instancePath2.close();
        instancePath2.moveTo(71.56867f, 82.34297f);
        instancePath2.lineTo(71.56867f, 92.5091f);
        Path path3 = instancePath2;
        path3.cubicTo(71.56867f, 105.366104f, 81.99133f, 115.788765f, 94.848335f, 115.788765f);
        path3.cubicTo(107.70533f, 115.788765f, 118.12799f, 105.366104f, 118.12799f, 92.5091f);
        instancePath2.lineTo(118.12799f, 82.34297f);
        instancePath2.lineTo(124.77932f, 82.34297f);
        instancePath2.lineTo(124.77932f, 92.546936f);
        instancePath2.cubicTo(124.77932f, 107.953156f, 113.13948f, 120.64075f, 98.17429f, 122.29521f);
        instancePath2.lineTo(98.173996f, 129.16708f);
        instancePath2.lineTo(91.52267f, 129.16708f);
        instancePath2.lineTo(91.52237f, 122.29521f);
        Path path4 = instancePath2;
        path4.cubicTo(76.55718f, 120.64075f, 64.91734f, 107.953156f, 64.91734f, 92.546936f);
        instancePath2.lineTo(64.91734f, 82.34297f);
        instancePath2.lineTo(71.56867f, 82.34297f);
        instancePath2.close();
        instancePath2.moveTo(94.848335f, 48.89718f);
        path4.cubicTo(104.031906f, 48.89718f, 111.47666f, 56.341934f, 111.47666f, 65.525505f);
        instancePath2.lineTo(111.47666f, 92.471275f);
        path4.cubicTo(111.47666f, 101.65485f, 104.031906f, 109.09961f, 94.848335f, 109.09961f);
        path4.cubicTo(85.66476f, 109.09961f, 78.22f, 101.65485f, 78.22f, 92.471275f);
        instancePath2.lineTo(78.22f, 65.525505f);
        path4.cubicTo(78.22f, 56.341934f, 85.66476f, 48.89718f, 94.848335f, 48.89718f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
