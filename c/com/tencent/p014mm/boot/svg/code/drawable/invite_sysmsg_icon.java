package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.invite_sysmsg_icon */
public class invite_sysmsg_icon extends C24542c {
    private final int height = 45;
    private final int width = 45;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 45;
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
        instancePaint3.setColor(-16139513);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 1.9916575f);
        Path path = instancePath;
        path.cubicTo(0.0f, 0.89169544f, 0.89889205f, 0.0f, 1.9916575f, 0.0f);
        instancePath.lineTo(43.008343f, 0.0f);
        path.cubicTo(44.108303f, 0.0f, 45.0f, 0.89889205f, 45.0f, 1.9916575f);
        instancePath.lineTo(45.0f, 43.008343f);
        path.cubicTo(45.0f, 44.108303f, 44.10111f, 45.0f, 43.008343f, 45.0f);
        instancePath.lineTo(1.9916575f, 45.0f);
        path.cubicTo(0.89169544f, 45.0f, 0.0f, 44.10111f, 0.0f, 43.008343f);
        instancePath.lineTo(0.0f, 1.9916575f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(31.0f, 29.0f);
        instancePath2.lineTo(27.0f, 29.0f);
        instancePath2.lineTo(27.0f, 27.0f);
        instancePath2.lineTo(31.0f, 27.0f);
        instancePath2.lineTo(31.0f, 23.0f);
        instancePath2.lineTo(33.0f, 23.0f);
        instancePath2.lineTo(33.0f, 27.0f);
        instancePath2.lineTo(37.0f, 27.0f);
        instancePath2.lineTo(37.0f, 29.0f);
        instancePath2.lineTo(33.0f, 29.0f);
        instancePath2.lineTo(33.0f, 33.0f);
        instancePath2.lineTo(31.0f, 33.0f);
        instancePath2.lineTo(31.0f, 29.0f);
        instancePath2.close();
        instancePath2.moveTo(25.730555f, 35.0f);
        instancePath2.lineTo(6.130553f, 35.0f);
        instancePath2.cubicTo(5.440284f, 35.0f, 5.0f, 34.490055f, 5.0f, 33.845936f);
        instancePath2.lineTo(5.0f, 32.11464f);
        Path path2 = instancePath2;
        path2.cubicTo(5.0f, 30.729998f, 7.1157656f, 29.698303f, 11.782929f, 27.036438f);
        path2.cubicTo(13.08324f, 26.29513f, 15.77804f, 25.127686f, 14.031632f, 22.438671f);
        path2.cubicTo(12.713493f, 20.408728f, 11.588755f, 19.536785f, 11.588755f, 16.113152f);
        path2.cubicTo(11.588755f, 12.560062f, 14.101395f, 9.0f, 18.0f, 9.0f);
        path2.cubicTo(21.898605f, 9.0f, 24.411245f, 12.560062f, 24.411245f, 16.113152f);
        path2.cubicTo(24.411245f, 19.536785f, 23.286507f, 20.408728f, 21.968369f, 22.438671f);
        path2.cubicTo(20.814322f, 24.215603f, 21.599625f, 25.328108f, 22.640343f, 26.092281f);
        path2.cubicTo(22.548069f, 26.631046f, 22.5f, 27.184908f, 22.5f, 27.75f);
        path2.cubicTo(22.5f, 29.225077f, 22.827538f, 30.623629f, 23.413855f, 31.876896f);
        path2.cubicTo(23.971626f, 33.069145f, 24.763592f, 34.129913f, 25.730555f, 35.0f);
        instancePath2.close();
        instancePath2.moveTo(24.0f, 28.125736f);
        Path path3 = instancePath2;
        path3.cubicTo(24.0f, 28.536228f, 24.030445f, 28.939606f, 24.089201f, 29.333736f);
        path3.cubicTo(24.672707f, 33.24789f, 28.048365f, 36.25f, 32.125f, 36.25f);
        path3.cubicTo(36.612865f, 36.25f, 40.25f, 32.612865f, 40.25f, 28.125736f);
        path3.cubicTo(40.25f, 23.637873f, 36.612865f, 20.0f, 32.125f, 20.0f);
        path3.cubicTo(27.637873f, 20.0f, 24.0f, 23.637873f, 24.0f, 28.125736f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
