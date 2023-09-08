package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatting_item_notify_msg_more */
public class chatting_item_notify_msg_more extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-2565928);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint4, looper));
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint5.setStrokeWidth(1.0f);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.5f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        instancePaint6.setColor(855638016);
        instancePaint6.setStrokeWidth(0.5f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.25f, 7.0f);
        instancePath2.cubicTo(0.25f, 3.2720778f, 3.2720778f, 0.25f, 7.0f, 0.25f);
        instancePath2.lineTo(14.0f, 0.25f);
        instancePath2.cubicTo(17.727922f, 0.25f, 20.75f, 3.2720778f, 20.75f, 7.0f);
        instancePath2.lineTo(20.75f, 7.0f);
        instancePath2.cubicTo(20.75f, 10.727922f, 17.727922f, 13.75f, 14.0f, 13.75f);
        instancePath2.lineTo(7.0f, 13.75f);
        instancePath2.cubicTo(3.2720778f, 13.75f, 0.25f, 10.727922f, 0.25f, 7.0f);
        instancePath2.lineTo(0.25f, 7.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(855638016);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 0.70710677f, -0.70710677f, 7.9091887f, 0.70710677f, 0.70710677f, -5.2091885f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(10.7426405f, 3.9426408f);
        instancePath3.lineTo(10.7426405f, 6.441641f);
        instancePath3.lineTo(13.2426405f, 6.442641f);
        instancePath3.lineTo(13.2426405f, 7.442641f);
        instancePath3.lineTo(10.7426405f, 7.441641f);
        instancePath3.lineTo(10.7426405f, 9.94264f);
        instancePath3.lineTo(9.7426405f, 9.94264f);
        instancePath3.lineTo(9.7426405f, 7.441641f);
        instancePath3.lineTo(7.2426405f, 7.442641f);
        instancePath3.lineTo(7.2426405f, 6.442641f);
        instancePath3.lineTo(9.7426405f, 6.441641f);
        instancePath3.lineTo(9.7426405f, 3.9426408f);
        instancePath3.lineTo(10.7426405f, 3.9426408f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
