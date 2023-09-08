package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_shoot_keyboard_icon_normal */
public class sns_shoot_keyboard_icon_normal extends C24542c {
    private final int height = 80;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 80;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-11316397);
        canvas.saveLayerAlpha((RectF) null, 171, 31);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(37.51f, 0.0f);
        instancePath.lineTo(41.01f, 0.0f);
        Path path = instancePath;
        path.cubicTo(50.9f, 0.33f, 60.66f, 4.26f, 67.74f, 11.21f);
        path.cubicTo(74.93f, 18.03f, 79.21f, 27.6f, 80.0f, 37.44f);
        instancePath.lineTo(80.0f, 41.85f);
        Path path2 = instancePath;
        path2.cubicTo(79.43f, 53.11f, 73.99f, 64.06f, 65.12f, 71.08f);
        path2.cubicTo(58.76f, 76.39f, 50.68f, 79.26f, 42.49f, 80.0f);
        instancePath.lineTo(37.87f, 80.0f);
        Path path3 = instancePath;
        path3.cubicTo(29.1f, 79.36f, 20.48f, 76.1f, 13.87f, 70.23f);
        path3.cubicTo(5.72f, 63.35f, 0.79f, 53.07f, 0.0f, 42.48f);
        instancePath.lineTo(0.0f, 37.71f);
        Path path4 = instancePath;
        path4.cubicTo(0.69f, 27.78f, 5.0f, 18.12f, 12.23f, 11.24f);
        path4.cubicTo(18.96f, 4.59f, 28.14f, 0.8f, 37.51f, 0.0f);
        instancePath.lineTo(37.51f, 0.0f);
        instancePath.close();
        instancePath.moveTo(17.29f, 19.27f);
        Path path5 = instancePath;
        path5.cubicTo(14.37f, 19.98f, 12.73f, 23.07f, 12.98f, 25.93f);
        path5.cubicTo(13.01f, 35.97f, 12.9f, 46.02f, 13.03f, 56.06f);
        path5.cubicTo(12.91f, 59.67f, 16.42f, 62.42f, 19.88f, 62.01f);
        path5.cubicTo(33.62f, 61.99f, 47.35f, 62.1f, 61.09f, 61.96f);
        path5.cubicTo(64.24f, 62.06f, 67.06f, 59.24f, 66.96f, 56.08f);
        path5.cubicTo(67.14f, 46.73f, 66.93f, 37.38f, 67.05f, 28.03f);
        path5.cubicTo(67.0f, 25.54f, 67.27f, 22.59f, 65.23f, 20.74f);
        path5.cubicTo(63.09f, 18.48f, 59.73f, 19.07f, 56.94f, 18.95f);
        path5.cubicTo(43.73f, 19.21f, 30.47f, 18.58f, 17.29f, 19.27f);
        instancePath.lineTo(17.29f, 19.27f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-7566196);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(56.0f, 47.0f);
        instancePath2.lineTo(49.991882f, 47.0f);
        instancePath2.cubicTo(48.8934f, 47.0f, 48.0f, 47.89808f, 48.0f, 49.00592f);
        instancePath2.lineTo(48.0f, 51.99408f);
        instancePath2.cubicTo(48.0f, 53.113445f, 48.891796f, 54.0f, 49.991882f, 54.0f);
        instancePath2.lineTo(61.008118f, 54.0f);
        instancePath2.cubicTo(62.1066f, 54.0f, 63.0f, 53.10192f, 63.0f, 51.99408f);
        instancePath2.lineTo(63.0f, 49.00702f);
        instancePath2.lineTo(63.0f, 37.991882f);
        instancePath2.cubicTo(63.0f, 36.8934f, 62.10192f, 36.0f, 60.99408f, 36.0f);
        instancePath2.lineTo(58.00592f, 36.0f);
        Path path6 = instancePath2;
        path6.cubicTo(56.886555f, 36.0f, 56.0f, 36.891796f, 56.0f, 37.991882f);
        instancePath2.lineTo(56.0f, 47.0f);
        instancePath2.lineTo(56.0f, 47.0f);
        instancePath2.close();
        instancePath2.moveTo(17.0f, 27.005919f);
        path6.cubicTo(17.0f, 25.89808f, 17.895857f, 25.0f, 18.99739f, 25.0f);
        instancePath2.lineTo(24.00261f, 25.0f);
        instancePath2.cubicTo(25.105738f, 25.0f, 26.0f, 25.886555f, 26.0f, 27.005919f);
        instancePath2.lineTo(26.0f, 29.994081f);
        instancePath2.cubicTo(26.0f, 31.10192f, 25.104143f, 32.0f, 24.00261f, 32.0f);
        instancePath2.lineTo(18.99739f, 32.0f);
        Path path7 = instancePath2;
        path7.cubicTo(17.894262f, 32.0f, 17.0f, 31.113445f, 17.0f, 29.994081f);
        instancePath2.lineTo(17.0f, 27.005919f);
        instancePath2.close();
        instancePath2.moveTo(17.0f, 38.00592f);
        path7.cubicTo(17.0f, 36.89808f, 17.893543f, 36.0f, 19.00276f, 36.0f);
        instancePath2.lineTo(27.99724f, 36.0f);
        instancePath2.cubicTo(29.103334f, 36.0f, 30.0f, 36.886555f, 30.0f, 38.00592f);
        instancePath2.lineTo(30.0f, 40.99408f);
        instancePath2.cubicTo(30.0f, 42.10192f, 29.106457f, 43.0f, 27.99724f, 43.0f);
        instancePath2.lineTo(19.00276f, 43.0f);
        Path path8 = instancePath2;
        path8.cubicTo(17.896666f, 43.0f, 17.0f, 42.113445f, 17.0f, 40.99408f);
        instancePath2.lineTo(17.0f, 38.00592f);
        instancePath2.close();
        instancePath2.moveTo(28.0f, 49.00592f);
        path8.cubicTo(28.0f, 47.89808f, 28.892622f, 47.0f, 29.995089f, 47.0f);
        instancePath2.lineTo(44.00491f, 47.0f);
        instancePath2.cubicTo(45.10677f, 47.0f, 46.0f, 47.886555f, 46.0f, 49.00592f);
        instancePath2.lineTo(46.0f, 51.99408f);
        instancePath2.cubicTo(46.0f, 53.10192f, 45.107376f, 54.0f, 44.00491f, 54.0f);
        instancePath2.lineTo(29.995089f, 54.0f);
        instancePath2.cubicTo(28.893232f, 54.0f, 28.0f, 53.113445f, 28.0f, 51.99408f);
        instancePath2.lineTo(28.0f, 49.00592f);
        instancePath2.close();
        instancePath2.moveTo(28.0f, 27.005919f);
        instancePath2.cubicTo(28.0f, 25.89808f, 28.895857f, 25.0f, 29.99739f, 25.0f);
        instancePath2.lineTo(35.00261f, 25.0f);
        instancePath2.cubicTo(36.105736f, 25.0f, 37.0f, 25.886555f, 37.0f, 27.005919f);
        instancePath2.lineTo(37.0f, 29.994081f);
        instancePath2.cubicTo(37.0f, 31.10192f, 36.10414f, 32.0f, 35.00261f, 32.0f);
        instancePath2.lineTo(29.99739f, 32.0f);
        instancePath2.cubicTo(28.894262f, 32.0f, 28.0f, 31.113445f, 28.0f, 29.994081f);
        instancePath2.lineTo(28.0f, 27.005919f);
        instancePath2.close();
        instancePath2.moveTo(32.0f, 38.00592f);
        instancePath2.cubicTo(32.0f, 36.89808f, 32.89586f, 36.0f, 33.99739f, 36.0f);
        instancePath2.lineTo(39.00261f, 36.0f);
        Path path9 = instancePath2;
        path9.cubicTo(40.105736f, 36.0f, 41.0f, 36.886555f, 41.0f, 38.00592f);
        instancePath2.lineTo(41.0f, 40.99408f);
        path9.cubicTo(41.0f, 42.10192f, 40.10414f, 43.0f, 39.00261f, 43.0f);
        instancePath2.lineTo(33.99739f, 43.0f);
        path9.cubicTo(32.894264f, 43.0f, 32.0f, 42.113445f, 32.0f, 40.99408f);
        instancePath2.lineTo(32.0f, 38.00592f);
        instancePath2.close();
        instancePath2.moveTo(17.0f, 49.00592f);
        path9.cubicTo(17.0f, 47.89808f, 17.895857f, 47.0f, 18.99739f, 47.0f);
        instancePath2.lineTo(24.00261f, 47.0f);
        path9.cubicTo(25.105738f, 47.0f, 26.0f, 47.886555f, 26.0f, 49.00592f);
        instancePath2.lineTo(26.0f, 51.99408f);
        instancePath2.cubicTo(26.0f, 53.10192f, 25.104143f, 54.0f, 24.00261f, 54.0f);
        instancePath2.lineTo(18.99739f, 54.0f);
        Path path10 = instancePath2;
        path10.cubicTo(17.894262f, 54.0f, 17.0f, 53.113445f, 17.0f, 51.99408f);
        instancePath2.lineTo(17.0f, 49.00592f);
        instancePath2.close();
        instancePath2.moveTo(43.0f, 38.00592f);
        path10.cubicTo(43.0f, 36.89808f, 43.89586f, 36.0f, 44.99739f, 36.0f);
        instancePath2.lineTo(50.00261f, 36.0f);
        instancePath2.cubicTo(51.105736f, 36.0f, 52.0f, 36.886555f, 52.0f, 38.00592f);
        instancePath2.lineTo(52.0f, 40.99408f);
        instancePath2.cubicTo(52.0f, 42.10192f, 51.10414f, 43.0f, 50.00261f, 43.0f);
        instancePath2.lineTo(44.99739f, 43.0f);
        Path path11 = instancePath2;
        path11.cubicTo(43.894264f, 43.0f, 43.0f, 42.113445f, 43.0f, 40.99408f);
        instancePath2.lineTo(43.0f, 38.00592f);
        instancePath2.close();
        instancePath2.moveTo(39.0f, 27.005919f);
        path11.cubicTo(39.0f, 25.89808f, 39.89586f, 25.0f, 40.99739f, 25.0f);
        instancePath2.lineTo(46.00261f, 25.0f);
        path11.cubicTo(47.105736f, 25.0f, 48.0f, 25.886555f, 48.0f, 27.005919f);
        instancePath2.lineTo(48.0f, 29.994081f);
        path11.cubicTo(48.0f, 31.10192f, 47.10414f, 32.0f, 46.00261f, 32.0f);
        instancePath2.lineTo(40.99739f, 32.0f);
        path11.cubicTo(39.894264f, 32.0f, 39.0f, 31.113445f, 39.0f, 29.994081f);
        instancePath2.lineTo(39.0f, 27.005919f);
        instancePath2.close();
        instancePath2.moveTo(50.0f, 27.005919f);
        Path path12 = instancePath2;
        path12.cubicTo(50.0f, 25.89808f, 50.893543f, 25.0f, 52.00276f, 25.0f);
        instancePath2.lineTo(60.99724f, 25.0f);
        path12.cubicTo(62.103333f, 25.0f, 63.0f, 25.886555f, 63.0f, 27.005919f);
        instancePath2.lineTo(63.0f, 29.994081f);
        path12.cubicTo(63.0f, 31.10192f, 62.106457f, 32.0f, 60.99724f, 32.0f);
        instancePath2.lineTo(52.00276f, 32.0f);
        path12.cubicTo(50.896667f, 32.0f, 50.0f, 31.113445f, 50.0f, 29.994081f);
        instancePath2.lineTo(50.0f, 27.005919f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}