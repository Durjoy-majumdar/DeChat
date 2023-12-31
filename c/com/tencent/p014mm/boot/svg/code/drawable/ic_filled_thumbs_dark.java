package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ic_filled_thumbs_dark */
public class ic_filled_thumbs_dark extends C24542c {
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
        Matrix instanceMatrix = C24542c.instanceMatrix(looper);
        float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
        instancePaint3.setColor(-14671840);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 4.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath.lineTo(44.0f, 0.0f);
        path.cubicTo(46.20914f, 0.0f, 48.0f, 1.7908609f, 48.0f, 4.0f);
        instancePath.lineTo(48.0f, 44.0f);
        path.cubicTo(48.0f, 46.20914f, 46.20914f, 48.0f, 44.0f, 48.0f);
        instancePath.lineTo(4.0f, 48.0f);
        path.cubicTo(1.7908609f, 48.0f, 0.0f, 46.20914f, 0.0f, 44.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-15616);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 13.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 204, 31);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(15.361448f, 1.9526451f);
        Path path2 = instancePath2;
        path2.cubicTo(16.126657f, 3.079886f, 16.332129f, 4.269144f, 16.332129f, 6.769299f);
        path2.cubicTo(16.332129f, 7.451479f, 16.149721f, 7.621433f, 16.3936f, 8.051712f);
        path2.cubicTo(16.906f, 8.060102f, 19.500208f, 8.234269f, 20.209095f, 8.490161f);
        path2.cubicTo(21.089422f, 8.807939f, 21.764603f, 9.31892f, 22.107843f, 10.083771f);
        path2.cubicTo(23.332994f, 12.813801f, 21.794872f, 20.18185f, 18.91739f, 22.550528f);
        path2.cubicTo(18.054035f, 23.261503f, 16.303766f, 23.174044f, 14.963611f, 23.283785f);
        path2.cubicTo(14.332603f, 23.33533f, 11.736202f, 23.342722f, 7.2074957f, 23.322222f);
        instancePath2.lineTo(7.2070985f, 9.847586f);
        Path path3 = instancePath2;
        path3.cubicTo(7.4057093f, 9.748565f, 7.629142f, 9.6238365f, 7.9003778f, 9.464798f);
        path3.cubicTo(8.686465f, 9.003915f, 9.149695f, 8.480839f, 9.49743f, 7.561347f);
        path3.cubicTo(9.694043f, 7.0406475f, 9.760807f, 6.529837f, 9.832299f, 5.018408f);
        path3.cubicTo(9.841782f, 4.818275f, 9.8441515f, 4.7553024f, 9.860264f, 4.3009973f);
        path3.cubicTo(9.933334f, 2.240632f, 10.151803f, 1.5065356f, 11.292878f, 0.9766398f);
        path3.cubicTo(12.817902f, 0.26835197f, 14.639641f, 0.88911533f, 15.361448f, 1.9526451f);
        instancePath2.close();
        instancePath2.moveTo(5.707109f, 10.278362f);
        instancePath2.lineTo(5.707365f, 23.314808f);
        Path path4 = instancePath2;
        path4.cubicTo(4.6354866f, 23.309116f, 3.4726768f, 23.30219f, 2.2192743f, 23.294199f);
        path4.cubicTo(1.1555816f, 23.287859f, 0.29411766f, 22.433678f, 0.29411766f, 21.375988f);
        instancePath2.lineTo(0.29411766f, 12.275348f);
        instancePath2.cubicTo(0.29411766f, 11.213089f, 1.1652066f, 10.357124f, 2.2337618f, 10.357124f);
        instancePath2.lineTo(4.577087f, 10.357124f);
        instancePath2.cubicTo(4.9566307f, 10.357124f, 5.3201804f, 10.333967f, 5.707109f, 10.278362f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
