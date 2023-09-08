package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.file_float_ball_icon_ofd */
public class file_float_ball_icon_ofd extends C24542c {
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
        instancePaint3.setColor(-9132032);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(48.0f, 0.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(0.0f, 48.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(13.305084f, 30.0f);
        Path path = instancePath2;
        path.cubicTo(16.864407f, 30.0f, 19.101694f, 27.698189f, 19.101694f, 24.004025f);
        path.cubicTo(19.101694f, 20.309858f, 16.864407f, 18.0f, 13.305084f, 18.0f);
        path.cubicTo(9.737288f, 18.0f, 7.5f, 20.309858f, 7.5f, 24.004025f);
        path.cubicTo(7.5f, 27.698189f, 9.737288f, 30.0f, 13.305084f, 30.0f);
        instancePath2.close();
        instancePath2.moveTo(13.305084f, 28.229376f);
        Path path2 = instancePath2;
        path2.cubicTo(11.118644f, 28.229376f, 9.737288f, 26.587524f, 9.737288f, 24.004025f);
        path2.cubicTo(9.737288f, 21.412476f, 11.118644f, 19.770624f, 13.305084f, 19.770624f);
        path2.cubicTo(15.48305f, 19.770624f, 16.87288f, 21.412476f, 16.87288f, 24.004025f);
        path2.cubicTo(16.87288f, 26.587524f, 15.48305f, 28.229376f, 13.305084f, 28.229376f);
        instancePath2.close();
        instancePath2.moveTo(23.025423f, 29.80684f);
        instancePath2.lineTo(23.025423f, 25.066399f);
        instancePath2.lineTo(28.152542f, 25.066399f);
        instancePath2.lineTo(28.152542f, 23.376257f);
        instancePath2.lineTo(23.025423f, 23.376257f);
        instancePath2.lineTo(23.025423f, 19.947685f);
        instancePath2.lineTo(28.635593f, 19.947685f);
        instancePath2.lineTo(28.635593f, 18.19316f);
        instancePath2.lineTo(20.838984f, 18.19316f);
        instancePath2.lineTo(20.838984f, 29.80684f);
        instancePath2.lineTo(23.025423f, 29.80684f);
        instancePath2.close();
        instancePath2.moveTo(34.68644f, 29.80684f);
        Path path3 = instancePath2;
        path3.cubicTo(38.347458f, 29.80684f, 40.5f, 27.649899f, 40.5f, 23.97183f);
        path3.cubicTo(40.5f, 20.293762f, 38.33898f, 18.19316f, 34.68644f, 18.19316f);
        instancePath2.lineTo(30.220339f, 18.19316f);
        instancePath2.lineTo(30.220339f, 29.80684f);
        instancePath2.lineTo(34.68644f, 29.80684f);
        instancePath2.close();
        instancePath2.moveTo(34.457626f, 28.052315f);
        instancePath2.lineTo(32.40678f, 28.052315f);
        instancePath2.lineTo(32.40678f, 19.947685f);
        instancePath2.lineTo(34.457626f, 19.947685f);
        Path path4 = instancePath2;
        path4.cubicTo(36.898304f, 19.947685f, 38.271187f, 21.380281f, 38.271187f, 23.97988f);
        path4.cubicTo(38.271187f, 26.627766f, 36.915253f, 28.052315f, 34.457626f, 28.052315f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
