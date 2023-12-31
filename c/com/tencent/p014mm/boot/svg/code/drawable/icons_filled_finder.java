package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_finder */
public class icons_filled_finder extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = 32;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
                instancePaint3.setStrokeWidth(1.0f);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(32.0f, 0.0f);
                instancePath.lineTo(32.0f, 32.0f);
                instancePath.lineTo(0.0f, 32.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                instancePaint4.setColor(-352965);
                instancePaint5.setColor(-352965);
                instancePaint5.setStrokeWidth(0.5f);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(7.6303225f, 4.981387f);
                Path path = instancePath2;
                path.cubicTo(8.648119f, 5.3931026f, 9.777188f, 6.3700366f, 11.033724f, 7.846231f);
                path.cubicTo(11.765956f, 8.706466f, 12.532071f, 9.72506f, 13.320479f, 10.870253f);
                path.cubicTo(14.190683f, 12.134259f, 15.043268f, 13.485884f, 15.844148f, 14.838078f);
                path.cubicTo(16.677511f, 13.89155f, 17.297403f, 12.945533f, 17.90186f, 12.028513f);
                instancePath2.lineTo(18.160545f, 11.6373625f);
                instancePath2.lineTo(18.679535f, 10.870253f);
                Path path2 = instancePath2;
                path2.cubicTo(19.467941f, 9.72506f, 20.234058f, 8.706466f, 20.96629f, 7.846231f);
                path2.cubicTo(22.222824f, 6.3700366f, 23.351894f, 5.3931026f, 24.36969f, 4.981387f);
                path2.cubicTo(25.132742f, 4.6727204f, 25.838182f, 4.6780076f, 26.436687f, 4.963882f);
                path2.cubicTo(27.019594f, 5.2423067f, 27.508762f, 5.793485f, 27.839827f, 6.62222f);
                path2.cubicTo(28.69017f, 8.750344f, 28.108444f, 13.913297f, 26.90473f, 18.448881f);
                path2.cubicTo(26.300581f, 20.725313f, 25.54378f, 22.840717f, 24.746618f, 24.327414f);
                path2.cubicTo(24.371073f, 25.027802f, 23.984692f, 25.59084f, 23.602127f, 25.973198f);
                path2.cubicTo(23.196579f, 26.378529f, 22.7887f, 26.583334f, 22.401094f, 26.583334f);
                path2.cubicTo(21.375332f, 26.583334f, 20.327095f, 25.76995f, 19.117651f, 24.220646f);
                path2.cubicTo(18.600466f, 23.558125f, 18.060427f, 22.768503f, 17.505348f, 21.877174f);
                path2.cubicTo(17.063187f, 21.167164f, 16.62854f, 20.420666f, 16.210083f, 19.663507f);
                path2.cubicTo(15.509863f, 20.181726f, 15.007312f, 21.05398f, 14.494664f, 21.877174f);
                path2.cubicTo(13.939587f, 22.768503f, 13.399548f, 23.558125f, 12.882361f, 24.220646f);
                path2.cubicTo(11.672919f, 25.76995f, 10.624681f, 26.583334f, 9.598918f, 26.583334f);
                path2.cubicTo(9.211314f, 26.583334f, 8.803436f, 26.378529f, 8.39789f, 25.973202f);
                path2.cubicTo(8.015327f, 25.590845f, 7.628947f, 25.027811f, 7.253402f, 24.327427f);
                path2.cubicTo(6.4562426f, 22.840738f, 5.6994405f, 20.725346f, 5.0952897f, 18.448925f);
                path2.cubicTo(3.8915668f, 13.913337f, 3.30983f, 8.750378f, 4.160157f, 6.622296f);
                path2.cubicTo(4.4912376f, 5.793516f, 4.9804096f, 5.2423253f, 5.5633154f, 4.963893f);
                path2.cubicTo(6.1618237f, 4.6780076f, 6.8672676f, 4.6727195f, 7.6303225f, 4.981387f);
                instancePath2.close();
                instancePath2.moveTo(6.3930383f, 6.7726626f);
                Path path3 = instancePath2;
                path3.cubicTo(6.2455764f, 6.8564796f, 6.140506f, 7.0534697f, 6.019628f, 7.3560567f);
                path3.cubicTo(5.4905295f, 8.680212f, 5.7343717f, 12.01832f, 6.5175323f, 15.75707f);
                instancePath2.lineTo(6.5175323f, 15.75707f);
                instancePath2.lineTo(6.7035875f, 16.606953f);
                instancePath2.lineTo(6.9074655f, 17.464348f);
                instancePath2.lineTo(7.0261235f, 17.932764f);
                Path path4 = instancePath2;
                path4.cubicTo(7.467946f, 19.635796f, 7.980607f, 21.173548f, 8.453728f, 22.354115f);
                path4.cubicTo(8.743988f, 23.078392f, 9.01863f, 23.666948f, 9.252618f, 24.074335f);
                path4.cubicTo(9.350004f, 24.243889f, 9.4404335f, 24.378351f, 9.676785f, 24.583574f);
                path4.cubicTo(10.002801f, 24.495806f, 10.596868f, 23.904623f, 11.3016205f, 23.00183f);
                path4.cubicTo(11.773288f, 22.397617f, 12.27445f, 21.664156f, 12.793452f, 20.830757f);
                path4.cubicTo(13.21672f, 20.151085f, 13.634468f, 19.433468f, 14.036369f, 18.70624f);
                instancePath2.lineTo(14.036369f, 18.70624f);
                instancePath2.lineTo(14.523737f, 17.805576f);
                instancePath2.lineTo(14.8687315f, 17.141039f);
                instancePath2.lineTo(14.507871f, 16.50913f);
                instancePath2.lineTo(14.118853f, 15.8447895f);
                instancePath2.lineTo(13.646282f, 15.057373f);
                Path path5 = instancePath2;
                path5.cubicTo(13.008824f, 14.0092945f, 12.343495f, 12.97234f, 11.669296f, 11.99304f);
                path5.cubicTo(10.918297f, 10.902184f, 10.192277f, 9.936336f, 9.506277f, 9.130413f);
                path5.cubicTo(8.4653425f, 7.9075103f, 7.5613546f, 7.100234f, 6.3930383f, 6.7726626f);
                instancePath2.close();
                instancePath2.moveTo(25.123941f, 6.8230257f);
                Path path6 = instancePath2;
                path6.cubicTo(24.438658f, 7.100234f, 23.534672f, 7.9075103f, 22.493736f, 9.130413f);
                path6.cubicTo(21.807735f, 9.936336f, 21.081717f, 10.902184f, 20.330717f, 11.99304f);
                path6.cubicTo(19.65661f, 12.972205f, 18.991371f, 14.009015f, 18.353668f, 15.057495f);
                instancePath2.lineTo(18.353668f, 15.057495f);
                instancePath2.lineTo(17.697296f, 16.1574f);
                instancePath2.lineTo(17.325169f, 17.517403f);
                instancePath2.lineTo(17.567654f, 17.977322f);
                instancePath2.lineTo(17.963614f, 18.706207f);
                Path path7 = instancePath2;
                path7.cubicTo(18.365337f, 19.43312f, 18.783188f, 20.150917f, 19.206562f, 20.830757f);
                path7.cubicTo(19.725563f, 21.664156f, 20.226725f, 22.397617f, 20.698393f, 23.00183f);
                path7.cubicTo(21.397917f, 23.897924f, 21.999332f, 24.531473f, 22.747395f, 24.074335f);
                path7.cubicTo(22.981382f, 23.666948f, 23.256025f, 23.078392f, 23.546286f, 22.354115f);
                path7.cubicTo(24.062418f, 21.066223f, 24.625605f, 19.353252f, 25.093075f, 17.462177f);
                instancePath2.lineTo(25.093075f, 17.462177f);
                instancePath2.lineTo(25.297422f, 16.60259f);
                instancePath2.lineTo(25.38281f, 16.221725f);
                Path path8 = instancePath2;
                path8.cubicTo(26.246569f, 12.297194f, 26.531525f, 8.735373f, 25.98037f, 7.3560195f);
                path8.cubicTo(25.859497f, 7.0534415f, 25.754433f, 6.8564663f, 25.123941f, 6.8230257f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
