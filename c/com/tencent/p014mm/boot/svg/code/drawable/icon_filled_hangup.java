package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_hangup */
public class icon_filled_hangup extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = 40;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(40.0f, 0.0f);
                instancePath.lineTo(40.0f, 40.0f);
                instancePath.lineTo(0.0f, 40.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(10.15568f, 25.258675f);
                instancePath2.lineTo(4.4720387f, 27.775742f);
                Path path = instancePath2;
                path.cubicTo(3.797533f, 28.04357f, 3.0556054f, 27.901602f, 2.5110948f, 27.403084f);
                path.cubicTo(2.289532f, 27.207245f, 2.1657293f, 26.85095f, 2.1338305f, 26.779697f);
                path.cubicTo(1.1544515f, 24.39265f, 1.719437f, 21.48761f, 3.7867353f, 19.525818f);
                path.cubicTo(4.3693376f, 18.972948f, 5.0326343f, 18.580393f, 5.1979847f, 18.491163f);
                path.cubicTo(9.955722f, 15.600619f, 15.278155f, 14.170835f, 20.524742f, 14.166676f);
                path.cubicTo(25.771328f, 14.162518f, 30.942066f, 15.583985f, 35.392624f, 18.46723f);
                path.cubicTo(35.5297f, 18.57404f, 36.170074f, 18.947742f, 36.693893f, 19.499735f);
                path.cubicTo(38.552612f, 21.458416f, 38.80852f, 24.362804f, 37.575058f, 26.751606f);
                path.cubicTo(37.535572f, 26.822916f, 37.35695f, 27.16163f, 37.131428f, 27.375645f);
                path.cubicTo(36.55072f, 27.892872f, 35.79362f, 28.036028f, 35.14756f, 27.769247f);
                instancePath2.lineTo(29.73128f, 25.260979f);
                Path path2 = instancePath2;
                path2.cubicTo(29.470234f, 25.136448f, 29.406435f, 24.993942f, 29.333326f, 24.691067f);
                path2.cubicTo(29.117788f, 23.71116f, 28.532906f, 21.288162f, 28.14477f, 19.862904f);
                path2.cubicTo(28.056658f, 19.50658f, 27.87837f, 19.16815f, 27.624908f, 18.901056f);
                path2.cubicTo(27.35455f, 18.616158f, 26.990223f, 18.420431f, 26.620207f, 18.331627f);
                path2.cubicTo(24.578568f, 17.798658f, 22.472963f, 17.461754f, 20.367191f, 17.463423f);
                path2.cubicTo(18.24452f, 17.447287f, 16.102888f, 17.787556f, 14.004365f, 18.323807f);
                path2.cubicTo(13.624867f, 18.413206f, 13.258476f, 18.591692f, 12.938985f, 18.894878f);
                path2.cubicTo(12.638287f, 19.18023f, 12.442766f, 19.501137f, 12.316731f, 19.857628f);
                path2.cubicTo(11.795694f, 21.265789f, 10.952932f, 23.68992f, 10.614311f, 24.688086f);
                path2.cubicTo(10.508966f, 24.991102f, 10.448792f, 25.115887f, 10.15568f, 25.258675f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
