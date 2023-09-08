package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_lucky_money */
public class icons_outlined_lucky_money extends C24542c {
    private final int height = 20;
    private final int width = 20;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 20;
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
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(15.631578f, 2.5f);
        instancePath.cubicTo(16.387337f, 2.5f, 17.0f, 3.0969536f, 17.0f, 3.8333333f);
        instancePath.lineTo(17.0f, 3.8333333f);
        instancePath.lineTo(17.0f, 17.166666f);
        instancePath.cubicTo(17.0f, 17.903046f, 16.387337f, 18.5f, 15.631578f, 18.5f);
        instancePath.lineTo(15.631578f, 18.5f);
        instancePath.lineTo(5.368421f, 18.5f);
        Path path = instancePath;
        path.cubicTo(4.612663f, 18.5f, 4.0f, 17.903046f, 4.0f, 17.166666f);
        instancePath.lineTo(4.0f, 17.166666f);
        instancePath.lineTo(4.0f, 3.8333333f);
        path.cubicTo(4.0f, 3.0969536f, 4.612663f, 2.5f, 5.368421f, 2.5f);
        instancePath.lineTo(5.368421f, 2.5f);
        instancePath.close();
        instancePath.moveTo(12.405732f, 9.948215f);
        Path path2 = instancePath;
        path2.cubicTo(12.017823f, 10.5786295f, 11.309415f, 11.0f, 10.5f, 11.0f);
        path2.cubicTo(9.710093f, 11.0f, 9.016382f, 10.598696f, 8.621902f, 9.9939165f);
        instancePath.lineTo(8.948097f, 10.0397215f);
        Path path3 = instancePath;
        path3.cubicTo(7.6187563f, 9.874238f, 6.3108873f, 9.474421f, 5.0262003f, 8.841527f);
        instancePath.lineTo(5.0263157f, 17.166666f);
        path3.cubicTo(5.0263157f, 17.350761f, 5.1794815f, 17.5f, 5.368421f, 17.5f);
        instancePath.lineTo(5.368421f, 17.5f);
        instancePath.lineTo(15.631578f, 17.5f);
        instancePath.cubicTo(15.8205185f, 17.5f, 15.973684f, 17.350761f, 15.973684f, 17.166666f);
        instancePath.lineTo(15.973684f, 17.166666f);
        instancePath.lineTo(15.973363f, 8.796353f);
        instancePath.cubicTo(14.776812f, 9.357676f, 13.587359f, 9.741942f, 12.405732f, 9.948215f);
        instancePath.close();
        instancePath.moveTo(10.5f, 7.6666665f);
        Path path4 = instancePath;
        path4.cubicTo(9.838712f, 7.6666665f, 9.302631f, 8.189001f, 9.302631f, 8.833333f);
        path4.cubicTo(9.302631f, 9.477666f, 9.838712f, 10.0f, 10.5f, 10.0f);
        path4.cubicTo(11.161288f, 10.0f, 11.697369f, 9.477666f, 11.697369f, 8.833333f);
        path4.cubicTo(11.697369f, 8.189001f, 11.161288f, 7.6666665f, 10.5f, 7.6666665f);
        instancePath.close();
        instancePath.moveTo(5.0261106f, 6.2148943f);
        instancePath.lineTo(5.026f, 7.898f);
        instancePath.lineTo(5.1932034f, 7.9874845f);
        instancePath.cubicTo(6.214511f, 8.514234f, 7.24696f, 8.881271f, 8.291614f, 9.08938f);
        instancePath.lineTo(8.281899f, 8.988068f);
        instancePath.lineTo(8.276316f, 8.833333f);
        Path path5 = instancePath;
        path5.cubicTo(8.276316f, 8.643525f, 8.301365f, 8.459417f, 8.348418f, 8.2839775f);
        path5.cubicTo(7.0511303f, 7.9320846f, 5.94092f, 7.2407155f, 5.0261106f, 6.2148943f);
        instancePath.close();
        instancePath.moveTo(12.653671f, 8.295406f);
        Path path6 = instancePath;
        path6.cubicTo(12.6995735f, 8.46638f, 12.723684f, 8.647113f, 12.723684f, 8.833333f);
        path6.cubicTo(12.723684f, 8.902132f, 12.720393f, 8.970181f, 12.713956f, 9.037341f);
        path6.cubicTo(13.725654f, 8.819795f, 14.748303f, 8.460581f, 15.7815075f, 7.960102f);
        instancePath.lineTo(15.973f, 7.864f);
        instancePath.lineTo(15.973398f, 6.191445f);
        instancePath.cubicTo(15.076875f, 7.239985f, 13.967325f, 7.9428406f, 12.653671f, 8.295406f);
        instancePath.close();
        instancePath.moveTo(15.631578f, 3.5f);
        instancePath.lineTo(5.368421f, 3.5f);
        Path path7 = instancePath;
        path7.cubicTo(5.1794815f, 3.5f, 5.0263157f, 3.6492383f, 5.0263157f, 3.8333333f);
        instancePath.lineTo(5.0263157f, 3.8333333f);
        instancePath.lineTo(5.026f, 4.826f);
        instancePath.lineTo(5.132337f, 4.9842052f);
        path7.cubicTo(6.063459f, 6.3167877f, 7.2577586f, 7.1599064f, 8.731339f, 7.522288f);
        path7.cubicTo(9.137182f, 7.0015125f, 9.778459f, 6.6666665f, 10.5f, 6.6666665f);
        path7.cubicTo(11.225256f, 6.6666665f, 11.869418f, 7.0049686f, 12.275335f, 7.5284514f);
        path7.cubicTo(13.766685f, 7.1696754f, 14.951494f, 6.3116913f, 15.848779f, 4.947186f);
        instancePath.lineTo(15.973f, 4.75f);
        instancePath.lineTo(15.973684f, 3.8333333f);
        path7.cubicTo(15.973684f, 3.6722503f, 15.856417f, 3.5378542f, 15.700525f, 3.506772f);
        instancePath.lineTo(15.631578f, 3.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
