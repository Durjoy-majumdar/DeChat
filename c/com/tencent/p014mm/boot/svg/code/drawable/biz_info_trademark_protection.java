package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_info_trademark_protection */
public class biz_info_trademark_protection extends C24542c {
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
        instancePaint3.setColor(-16336124);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(24.0f, 4.0f);
        Path path = instancePath;
        path.cubicTo(24.0f, 4.0f, 16.25142f, 8.95561f, 7.0f, 11.0f);
        path.cubicTo(7.039861f, 42.419357f, 24.0f, 44.0f, 24.0f, 44.0f);
        instancePath.lineTo(24.0f, 4.0f);
        instancePath.close();
        instancePath.moveTo(24.0f, 4.0f);
        path.cubicTo(24.0f, 4.0f, 31.74858f, 8.95561f, 41.0f, 11.0f);
        path.cubicTo(40.96014f, 42.419357f, 24.0f, 44.0f, 24.0f, 44.0f);
        instancePath.lineTo(24.0f, 4.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1315349);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(24.0f, 6.0f);
        Path path2 = instancePath2;
        path2.cubicTo(24.0f, 6.0f, 17.163017f, 10.46005f, 9.0f, 12.3f);
        path2.cubicTo(9.0351715f, 40.577423f, 24.0f, 42.0f, 24.0f, 42.0f);
        instancePath2.lineTo(24.0f, 6.0f);
        instancePath2.close();
        instancePath2.moveTo(24.0f, 6.0f);
        path2.cubicTo(24.0f, 6.0f, 30.836983f, 10.46005f, 39.0f, 12.3f);
        path2.cubicTo(38.96483f, 40.577423f, 24.0f, 42.0f, 24.0f, 42.0f);
        instancePath2.lineTo(24.0f, 6.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16336124);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(20.410254f, 18.501059f);
        instancePath3.lineTo(20.410254f, 23.028254f);
        instancePath3.lineTo(24.400131f, 23.028254f);
        Path path3 = instancePath3;
        path3.cubicTo(25.192776f, 23.028254f, 25.787249f, 22.936796f, 26.18357f, 22.753878f);
        path3.cubicTo(26.884756f, 22.433771f, 27.235344f, 21.80119f, 27.235344f, 20.856113f);
        path3.cubicTo(27.235344f, 19.834824f, 26.896189f, 19.148891f, 26.217869f, 18.798298f);
        path3.cubicTo(25.83679f, 18.600138f, 25.265179f, 18.501059f, 24.503021f, 18.501059f);
        instancePath3.lineTo(20.410254f, 18.501059f);
        instancePath3.close();
        instancePath3.moveTo(29.578968f, 17.186342f);
        Path path4 = instancePath3;
        path4.cubicTo(29.944803f, 17.613152f, 30.234419f, 18.085682f, 30.447824f, 18.603949f);
        path4.cubicTo(30.661228f, 19.122217f, 30.76793f, 19.71288f, 30.76793f, 20.375957f);
        path4.cubicTo(30.76793f, 21.176224f, 30.56596f, 21.963139f, 30.162016f, 22.736729f);
        path4.cubicTo(29.758072f, 23.51032f, 29.091194f, 24.05716f, 28.161362f, 24.377266f);
        path4.cubicTo(28.938763f, 24.68975f, 29.489414f, 25.133701f, 29.81333f, 25.709131f);
        path4.cubicTo(30.137247f, 26.28456f, 30.078083f, 26.648375f, 30.447823f, 28.688023f);
        path4.cubicTo(30.817564f, 30.72767f, 31.030872f, 32.425613f, 31.030872f, 32.425613f);
        instancePath3.lineTo(27.155317f, 32.425613f);
        path4.cubicTo(27.075876f, 32.147568f, 26.471811f, 27.43906f, 26.471811f, 27.43906f);
        path4.cubicTo(26.471811f, 27.43906f, 26.282516f, 25.70913f, 24.045729f, 25.817738f);
        instancePath3.lineTo(20.410254f, 25.817738f);
        instancePath3.lineTo(20.410254f, 32.425613f);
        instancePath3.lineTo(16.969128f, 32.425613f);
        instancePath3.lineTo(16.969128f, 15.574387f);
        instancePath3.lineTo(25.23469f, 15.574387f);
        path4.cubicTo(26.416035f, 15.597251f, 27.324894f, 15.742059f, 27.961296f, 16.008814f);
        path4.cubicTo(27.961296f, 16.008814f, 29.136917f, 16.668076f, 29.578968f, 17.186342f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
