package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_ear */
public class icons_filled_ear extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(44.373455f, 28.187357f);
            Path path = instancePath;
            path.cubicTo(45.830715f, 28.322323f, 47.446033f, 28.18514f, 48.813538f, 27.636559f);
            path.cubicTo(50.527588f, 26.948957f, 51.648552f, 25.72406f, 52.26621f, 23.285063f);
            path.cubicTo(53.751987f, 17.416075f, 48.32909f, 12.0f, 38.941086f, 12.0f);
            path.cubicTo(28.728106f, 12.0f, 23.414364f, 16.087114f, 21.78099f, 21.502277f);
            path.cubicTo(19.96176f, 27.533615f, 21.340872f, 32.435795f, 25.14864f, 37.374653f);
            path.cubicTo(26.022875f, 38.50858f, 26.753454f, 39.333687f, 28.262457f, 40.9497f);
            path.cubicTo(31.131123f, 44.021797f, 32.075672f, 47.219032f, 32.676674f, 52.580505f);
            path.cubicTo(32.70588f, 52.84103f, 32.729557f, 53.058964f, 32.778843f, 53.516945f);
            path.cubicTo(33.062805f, 56.153008f, 33.25349f, 57.195194f, 33.571743f, 57.893948f);
            path.cubicTo(34.291115f, 59.47341f, 35.43545f, 60.004646f, 38.93313f, 60.000004f);
            path.cubicTo(40.626034f, 59.99776f, 42.892834f, 58.913296f, 43.710384f, 56.79499f);
            path.cubicTo(44.706993f, 54.21274f, 44.21988f, 48.810486f, 42.60123f, 47.113945f);
            path.cubicTo(41.95588f, 46.437534f, 41.24428f, 45.856598f, 40.41251f, 45.31139f);
            path.cubicTo(39.8433f, 44.938282f, 39.220215f, 44.582123f, 38.43973f, 44.177216f);
            path.cubicTo(37.977962f, 43.93765f, 36.3226f, 43.115288f, 36.117172f, 43.010937f);
            path.cubicTo(30.497211f, 40.156147f, 27.59008f, 36.88083f, 27.286228f, 30.611256f);
            path.cubicTo(26.968924f, 24.014212f, 30.866747f, 19.74962f, 36.492775f, 18.276604f);
            path.cubicTo(38.682762f, 17.703218f, 40.831554f, 17.595663f, 42.791634f, 17.733803f);
            path.cubicTo(43.08544f, 17.754509f, 43.32174f, 17.777874f, 43.493397f, 17.79913f);
            instancePath.lineTo(42.756084f, 23.753653f);
            Path path2 = instancePath;
            path2.cubicTo(42.756084f, 23.753653f, 32.904655f, 22.533808f, 33.2793f, 30.323002f);
            path2.cubicTo(33.56411f, 36.19961f, 37.86729f, 36.89687f, 42.491665f, 39.552254f);
            path2.cubicTo(42.80912f, 39.77472f, 43.104702f, 39.972496f, 43.37841f, 40.145584f);
            path2.cubicTo(43.78898f, 40.405212f, 45.826626f, 41.802704f, 46.942364f, 42.972137f);
            path2.cubicTo(50.873383f, 47.09234f, 50.694675f, 55.362328f, 49.30796f, 58.95535f);
            path2.cubicTo(46.944668f, 65.07873f, 40.665535f, 65.99771f, 38.941086f, 66.0f);
            path2.cubicTo(33.958065f, 66.00661f, 30.134794f, 64.82345f, 28.11141f, 60.38087f);
            path2.cubicTo(26.088026f, 55.938293f, 27.59972f, 49.031265f, 23.877104f, 45.04466f);
            path2.cubicTo(20.056442f, 40.953053f, 12.17825f, 32.561337f, 16.036615f, 19.769604f);
            path2.cubicTo(17.667137f, 14.363896f, 23.538895f, 6.0f, 38.941086f, 6.0f);
            path2.cubicTo(52.097633f, 6.0f, 60.592396f, 14.844056f, 58.082718f, 24.757557f);
            path2.cubicTo(55.93419f, 33.24164f, 48.740044f, 34.25759f, 45.28148f, 34.236015f);
            path2.cubicTo(44.761826f, 34.236015f, 44.12747f, 34.21076f, 43.37841f, 34.160248f);
            path2.cubicTo(43.45507f, 33.719574f, 43.5045f, 33.433228f, 43.52671f, 33.30121f);
            instancePath.lineTo(44.373455f, 28.187357f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
