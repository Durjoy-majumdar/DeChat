package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.login_showpassword_icon */
public class login_showpassword_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-2500135);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 27.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 21.0f);
                Path path = instancePath;
                path.cubicTo(6.541142f, 9.067516f, 19.195314f, 0.2773516f, 33.0f, -3.5527137E-15f);
                path.cubicTo(47.47057f, -0.56266415f, 61.090485f, 8.457505f, 68.0f, 21.0f);
                path.cubicTo(61.279648f, 33.217968f, 48.147583f, 42.128136f, 34.0f, 42.0f);
                path.cubicTo(19.862371f, 42.148136f, 6.7402635f, 33.23797f, 0.0f, 21.0f);
                instancePath.lineTo(0.0f, 21.0f);
                instancePath.close();
                instancePath.moveTo(30.0f, 10.0f);
                path.cubicTo(26.510271f, 10.850008f, 23.349888f, 14.148959f, 22.0f, 18.0f);
                path.cubicTo(20.448715f, 24.932842f, 25.872211f, 32.447674f, 33.0f, 33.0f);
                path.cubicTo(40.05904f, 33.833035f, 46.808502f, 27.08563f, 46.0f, 20.0f);
                path.cubicTo(45.492508f, 12.574233f, 37.337322f, 7.1324587f, 30.0f, 10.0f);
                instancePath.lineTo(30.0f, 10.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
