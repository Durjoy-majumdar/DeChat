package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_switch_camera */
public class icon_filled_switch_camera extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(14.732409f, 4.0f);
        instancePath2.cubicTo(14.899585f, 4.0f, 15.0557f, 4.0835505f, 15.148434f, 4.22265f);
        instancePath2.lineTo(17.0f, 7.0f);
        instancePath2.lineTo(21.0f, 7.0f);
        instancePath2.cubicTo(21.552284f, 7.0f, 22.0f, 7.4477153f, 22.0f, 8.0f);
        instancePath2.lineTo(22.0f, 19.0f);
        instancePath2.cubicTo(22.0f, 19.552284f, 21.552284f, 20.0f, 21.0f, 20.0f);
        instancePath2.lineTo(3.0f, 20.0f);
        instancePath2.cubicTo(2.4477153f, 20.0f, 2.0f, 19.552284f, 2.0f, 19.0f);
        instancePath2.lineTo(2.0f, 8.0f);
        instancePath2.cubicTo(2.0f, 7.4477153f, 2.4477153f, 7.0f, 3.0f, 7.0f);
        instancePath2.lineTo(7.0f, 7.0f);
        instancePath2.lineTo(8.851566f, 4.22265f);
        instancePath2.cubicTo(8.9443f, 4.0835505f, 9.100415f, 4.0f, 9.267591f, 4.0f);
        instancePath2.lineTo(14.732409f, 4.0f);
        instancePath2.close();
        instancePath2.moveTo(8.0f, 12.0f);
        instancePath2.lineTo(6.0f, 14.0f);
        instancePath2.lineTo(7.409008f, 14.000028f);
        Path path = instancePath2;
        path.cubicTo(7.8656044f, 16.059689f, 9.702923f, 17.6f, 11.9f, 17.6f);
        path.cubicTo(13.146032f, 17.6f, 14.312778f, 17.101137f, 15.168172f, 16.237185f);
        instancePath2.lineTo(15.335031f, 16.059566f);
        instancePath2.lineTo(14.439188f, 15.261151f);
        instancePath2.lineTo(14.297587f, 15.410781f);
        Path path2 = instancePath2;
        path2.cubicTo(13.666547f, 16.038834f, 12.813014f, 16.4f, 11.9f, 16.4f);
        path2.cubicTo(10.43684f, 16.4f, 9.189546f, 15.475769f, 8.710076f, 14.179267f);
        instancePath2.lineTo(8.649506f, 14.000216f);
        instancePath2.lineTo(10.0f, 14.0f);
        instancePath2.lineTo(8.0f, 12.0f);
        instancePath2.close();
        instancePath2.moveTo(12.0f, 8.4f);
        Path path3 = instancePath2;
        path3.cubicTo(10.753968f, 8.4f, 9.587222f, 8.898863f, 8.731828f, 9.762815f);
        instancePath2.lineTo(8.56497f, 9.9404335f);
        instancePath2.lineTo(9.460812f, 10.738849f);
        instancePath2.lineTo(9.602413f, 10.589219f);
        path3.cubicTo(10.233454f, 9.961165f, 11.086987f, 9.6f, 12.0f, 9.6f);
        path3.cubicTo(13.46281f, 9.6f, 14.709857f, 10.523788f, 15.189579f, 11.819803f);
        instancePath2.lineTo(15.250188f, 11.998787f);
        instancePath2.lineTo(14.0f, 12.0f);
        instancePath2.lineTo(16.0f, 14.0f);
        instancePath2.lineTo(18.0f, 12.0f);
        instancePath2.lineTo(16.49077f, 11.998976f);
        path3.cubicTo(16.033802f, 9.939815f, 14.196723f, 8.4f, 12.0f, 8.4f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
