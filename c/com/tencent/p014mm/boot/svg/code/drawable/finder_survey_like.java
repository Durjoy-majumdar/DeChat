package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_survey_like */
public class finder_survey_like extends C24542c {
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
        instancePaint3.setColor(-2565928);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(15.344483f, 6.583551f);
        instancePath2.lineTo(15.148372f, 9.576538f);
        instancePath2.lineTo(19.585342f, 9.576538f);
        instancePath2.cubicTo(21.075941f, 9.576538f, 22.196543f, 11.080213f, 21.971073f, 12.575916f);
        instancePath2.lineTo(21.941721f, 12.736071f);
        instancePath2.lineTo(20.360384f, 20.056133f);
        instancePath2.cubicTo(20.12584f, 21.13336f, 19.231306f, 21.915438f, 18.172482f, 21.990952f);
        instancePath2.lineTo(18.004005f, 21.996944f);
        instancePath2.lineTo(7.199954f, 21.99596f);
        instancePath2.lineTo(7.2f, 22.0f);
        instancePath2.lineTo(6.0f, 22.0f);
        instancePath2.lineTo(5.999954f, 21.99596f);
        instancePath2.lineTo(4.027954f, 21.996944f);
        instancePath2.cubicTo(2.9735923f, 21.996944f, 2.109789f, 21.181067f, 2.0334399f, 20.146206f);
        instancePath2.lineTo(2.027954f, 19.996944f);
        instancePath2.lineTo(2.027954f, 12.471283f);
        instancePath2.cubicTo(2.027954f, 11.416909f, 2.8438416f, 10.553096f, 3.8787138f, 10.476766f);
        instancePath2.lineTo(4.027978f, 10.471283f);
        instancePath2.lineTo(7.2443237f, 10.471283f);
        instancePath2.cubicTo(8.867068f, 10.471283f, 10.229164f, 8.07828f, 10.46609f, 5.791945f);
        instancePath2.lineTo(10.477506f, 5.6183143f);
        instancePath2.lineTo(10.50158f, 4.996992f);
        instancePath2.lineTo(10.50158f, 4.996992f);
        instancePath2.lineTo(10.526074f, 4.698425f);
        Path path = instancePath2;
        path.cubicTo(10.607177f, 3.9300756f, 10.857109f, 3.0268402f, 11.721863f, 2.654602f);
        path.cubicTo(13.994878f, 1.6761699f, 15.469238f, 4.646179f, 15.344483f, 6.583551f);
        instancePath2.close();
        instancePath2.moveTo(5.999954f, 11.67096f);
        instancePath2.lineTo(4.027952f, 11.671284f);
        instancePath2.cubicTo(3.6201148f, 11.671274f, 3.283553f, 11.976461f, 3.2341874f, 12.370931f);
        instancePath2.lineTo(3.2279541f, 12.471283f);
        instancePath2.lineTo(3.2279541f, 19.996944f);
        instancePath2.cubicTo(3.2279541f, 20.404785f, 3.5331423f, 20.741344f, 3.9276037f, 20.79071f);
        instancePath2.lineTo(4.027954f, 20.796944f);
        instancePath2.lineTo(5.999954f, 20.795961f);
        instancePath2.lineTo(5.999954f, 11.67096f);
        instancePath2.close();
        instancePath2.moveTo(12.19632f, 3.7568228f);
        Path path2 = instancePath2;
        path2.cubicTo(11.996856f, 3.8426833f, 11.861793f, 4.0518723f, 11.774023f, 4.468053f);
        path2.cubicTo(11.759245f, 4.5381265f, 11.747102f, 4.604965f, 11.736948f, 4.6741843f);
        instancePath2.lineTo(11.711806f, 4.8945956f);
        instancePath2.lineTo(11.69472f, 5.1629763f);
        instancePath2.lineTo(11.670765f, 5.7835255f);
        instancePath2.lineTo(11.6596985f, 5.915635f);
        path2.cubicTo(11.35804f, 8.82664f, 9.657895f, 11.517689f, 7.436027f, 11.664946f);
        instancePath2.lineTo(7.199954f, 11.67096f);
        instancePath2.lineTo(7.199954f, 20.795961f);
        instancePath2.lineTo(18.004005f, 20.796944f);
        path2.cubicTo(18.521711f, 20.796944f, 18.983236f, 20.449461f, 19.151596f, 19.934792f);
        instancePath2.lineTo(19.18744f, 19.802746f);
        instancePath2.lineTo(20.768826f, 12.482467f);
        path2.cubicTo(20.941572f, 11.683531f, 20.382359f, 10.867286f, 19.700089f, 10.783578f);
        instancePath2.lineTo(19.585342f, 10.776538f);
        instancePath2.lineTo(13.866638f, 10.776538f);
        instancePath2.lineTo(14.146964f, 6.506438f);
        path2.cubicTo(14.252311f, 4.870451f, 13.131992f, 3.354057f, 12.19632f, 3.7568228f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
