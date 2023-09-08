package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_like_group */
public class icons_outlined_like_group extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(55.49912f, 45.008f);
                instancePath.cubicTo(57.9408f, 45.008f, 59.92017f, 47.099808f, 59.92017f, 49.674908f);
                instancePath.lineTo(59.92017f, 51.66988f);
                instancePath.cubicTo(59.92017f, 52.998844f, 59.258045f, 54.904667f, 58.448055f, 55.918167f);
                instancePath.lineTo(58.04847f, 56.41815f);
                instancePath.cubicTo(57.396893f, 57.23344f, 57.60043f, 58.27113f, 58.511566f, 58.74026f);
                instancePath.lineTo(64.767746f, 61.961483f);
                instancePath.cubicTo(65.447815f, 62.311638f, 65.999115f, 63.237362f, 65.999115f, 64.0427f);
                instancePath.lineTo(65.999115f, 64.84133f);
                instancePath.cubicTo(65.999115f, 65.485664f, 65.47678f, 66.007996f, 64.83245f, 66.007996f);
                instancePath.lineTo(46.165783f, 66.007996f);
                instancePath.cubicTo(45.521454f, 66.007996f, 44.99912f, 65.485664f, 44.99912f, 64.84133f);
                instancePath.lineTo(44.99912f, 64.0427f);
                instancePath.cubicTo(44.99912f, 63.243435f, 45.549706f, 62.31189f, 46.230488f, 61.96122f);
                instancePath.lineTo(52.486668f, 58.738667f);
                instancePath.cubicTo(53.39401f, 58.271294f, 53.604984f, 57.236137f, 52.949768f, 56.41641f);
                instancePath.lineTo(52.55018f, 55.916492f);
                instancePath.cubicTo(51.737152f, 54.89933f, 51.078064f, 52.999077f, 51.078064f, 51.66884f);
                instancePath.lineTo(51.078064f, 49.674175f);
                instancePath.cubicTo(51.078064f, 47.09712f, 53.062405f, 45.008f, 55.49912f, 45.008f);
                instancePath.close();
                instancePath.moveTo(33.87176f, 18.193398f);
                instancePath.lineTo(35.030296f, 19.324907f);
                instancePath.lineTo(35.99308f, 20.239637f);
                instancePath.lineTo(37.380127f, 18.915659f);
                instancePath.lineTo(38.1144f, 18.193398f);
                Path path = instancePath;
                path.cubicTo(43.972263f, 12.335534f, 53.469738f, 12.335534f, 59.327602f, 18.193398f);
                path.cubicTo(65.13098f, 23.996773f, 65.18496f, 33.37236f, 59.48955f, 39.242195f);
                instancePath.lineTo(58.010017f, 40.71877f);
                Path path2 = instancePath;
                path2.cubicTo(57.213345f, 40.4839f, 56.37107f, 40.357998f, 55.49912f, 40.357998f);
                path2.cubicTo(54.05613f, 40.357998f, 52.694138f, 40.703136f, 51.485535f, 41.31654f);
                path2.cubicTo(51.10322f, 41.51058f, 51.02201f, 41.34219f, 51.28032f, 41.084095f);
                path2.cubicTo(51.573612f, 40.791046f, 51.815994f, 40.54886f, 52.007473f, 40.357536f);
                path2.cubicTo(52.95247f, 39.41332f, 54.36996f, 37.996994f, 56.25995f, 36.10856f);
                path2.cubicTo(60.107475f, 32.1432f, 60.201576f, 25.898825f, 56.565033f, 21.819502f);
                instancePath.lineTo(56.145622f, 21.37538f);
                instancePath.cubicTo(52.04512f, 17.274874f, 45.396885f, 17.274874f, 41.296383f, 21.37538f);
                instancePath.lineTo(40.5216f, 22.137657f);
                instancePath.lineTo(39.078976f, 23.514885f);
                instancePath.lineTo(35.99308f, 26.422373f);
                instancePath.lineTo(31.907845f, 22.565336f);
                instancePath.lineTo(30.68978f, 21.37538f);
                Path path3 = instancePath;
                path3.cubicTo(26.589273f, 17.274874f, 19.941042f, 17.274874f, 15.840537f, 21.37538f);
                path3.cubicTo(11.927703f, 25.288212f, 11.744398f, 31.531189f, 15.270326f, 35.616615f);
                instancePath.lineTo(15.677359f, 36.061443f);
                instancePath.lineTo(35.985f, 56.382f);
                Path path4 = instancePath;
                path4.cubicTo(40.70933f, 51.657196f, 44.25258f, 48.113594f, 46.614742f, 45.751194f);
                path4.cubicTo(46.820904f, 45.545013f, 47.08965f, 45.27624f, 47.420986f, 44.944874f);
                path4.cubicTo(47.635357f, 44.73048f, 47.753178f, 44.811417f, 47.583157f, 45.12271f);
                path4.cubicTo(46.847134f, 46.47032f, 46.428066f, 48.023617f, 46.428066f, 49.674175f);
                instancePath.lineTo(46.428066f, 51.66884f);
                instancePath.lineTo(46.446f, 52.281f);
                instancePath.lineTo(38.11429f, 60.619694f);
                instancePath.cubicTo(37.032997f, 61.701305f, 35.331314f, 61.78459f, 34.154396f, 60.86958f);
                instancePath.lineTo(33.87176f, 60.619804f);
                instancePath.lineTo(12.495378f, 39.243423f);
                Path path5 = instancePath;
                path5.cubicTo(6.801199f, 33.37236f, 6.8551817f, 23.996773f, 12.658556f, 18.193398f);
                path5.cubicTo(18.51642f, 12.335534f, 28.013895f, 12.335534f, 33.87176f, 18.193398f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
