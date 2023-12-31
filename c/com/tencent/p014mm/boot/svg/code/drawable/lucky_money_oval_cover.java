package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lucky_money_oval_cover */
public class lucky_money_oval_cover extends C24542c {
    private final int height = 204;
    private final int width = 1126;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 1126;
        }
        if (i2 == 1) {
            return 204;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.5f, 24.0f);
        Path path = instancePath;
        instancePath.cubicTo(0.5f, 37.390865f, 10.107852f, 53.318604f, 21.959738f, 59.56154f);
        Path path2 = path;
        path2.cubicTo(21.959738f, 59.56154f, 49.279743f, 74.45131f, 76.2338f, 86.16695f);
        path2.cubicTo(207.33737f, 143.15135f, 377.29916f, 177.54317f, 563.0f, 177.54317f);
        path2.cubicTo(748.93994f, 177.54317f, 919.1003f, 143.06273f, 1050.2725f, 85.946724f);
        path2.cubicTo(1077.0372f, 74.29258f, 1104.0334f, 59.570366f, 1104.0334f, 59.570366f);
        path2.cubicTo(1115.9077f, 53.35358f, 1125.5f, 37.397163f, 1125.5f, 24.0f);
        Path path3 = path;
        path3.lineTo(1125.5f, 204.0f);
        path3.lineTo(0.5f, 204.0f);
        path3.lineTo(0.5f, 24.0f);
        path3.close();
        Paint instancePaint4 = C24542c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(Paint.Style.FILL);
        Paint instancePaint5 = C24542c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect((PathEffect) null);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1125.5f, 0.0f, 0.5f, 0.0f, 204.0f, 24.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        Path path4 = path3;
        Paint paint = instancePaint;
        Path path5 = path4;
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-1, -1, 16777215}, new float[]{0.0f, 0.87503606f, 1.0f}, instanceMatrix, 0);
        WeChatSVGRenderC2Java.setFillType(path5, 1);
        canvas.drawPath(path5, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-2511000);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.49069256f, 24.0f);
        instancePath2.cubicTo(0.49069256f, 36.109203f, 10.398101f, 51.3323f, 21.907948f, 57.824688f);
        instancePath2.lineTo(25.902914f, 59.97636f);
        instancePath2.lineTo(30.66614f, 62.490044f);
        Path path6 = instancePath2;
        path6.cubicTo(31.933975f, 63.153477f, 33.25746f, 63.841785f, 34.631824f, 64.55186f);
        path6.cubicTo(43.794273f, 69.28567f, 53.33801f, 74.01941f, 62.776997f, 78.43641f);
        path6.cubicTo(66.34585f, 80.10647f, 69.837036f, 81.70119f, 73.235214f, 83.210625f);
        instancePath2.lineTo(76.83174f, 84.791275f);
        Path path7 = instancePath2;
        path7.cubicTo(211.5285f, 143.33746f, 382.30917f, 176.04317f, 563.0f, 176.04317f);
        path7.cubicTo(742.1125f, 176.04317f, 911.4844f, 143.90594f, 1045.6196f, 86.32413f);
        instancePath2.lineTo(1050.354f, 84.27454f);
        Path path8 = instancePath2;
        path8.cubicTo(1054.549f, 82.44008f, 1058.8961f, 80.46737f, 1063.365f, 78.37608f);
        path8.cubicTo(1072.7715f, 73.97424f, 1082.2803f, 69.256744f, 1091.4077f, 64.53918f);
        instancePath2.lineTo(1095.3582f, 62.484444f);
        instancePath2.lineTo(1103.3378f, 58.241474f);
        instancePath2.cubicTo(1114.8965f, 52.189884f, 1125.0494f, 37.07831f, 1125.4855f, 24.813318f);
        instancePath2.lineTo(1125.5f, 24.0f);
        Path path9 = instancePath2;
        path9.cubicTo(1125.5f, 30.0f, 1125.5f, 34.454426f, 1125.5f, 37.363277f);
        path9.cubicTo(1125.5f, 37.387295f, 1125.4795f, 37.41131f, 1125.4692f, 37.435318f);
        path9.cubicTo(1121.4637f, 46.836327f, 1113.928f, 55.77127f, 1105.5458f, 60.4574f);
        instancePath2.lineTo(1101.5134f, 62.627083f);
        instancePath2.cubicTo(1099.2911f, 63.811024f, 1096.8214f, 65.11073f, 1094.1421f, 66.501434f);
        instancePath2.lineTo(1092.7852f, 67.204254f);
        Path path10 = instancePath2;
        path10.cubicTo(1083.625f, 71.93871f, 1074.0819f, 76.67323f, 1064.6366f, 81.093285f);
        path10.cubicTo(1061.0437f, 82.77462f, 1057.5282f, 84.38011f, 1054.1055f, 85.89975f);
        instancePath2.lineTo(1050.8712f, 87.32201f);
        Path path11 = instancePath2;
        path11.cubicTo(915.7089f, 146.17545f, 744.3189f, 179.04317f, 563.0f, 179.04317f);
        path11.cubicTo(383.7234f, 179.04317f, 214.15054f, 146.9121f, 79.69936f, 89.29634f);
        instancePath2.lineTo(74.56355f, 87.07496f);
        Path path12 = instancePath2;
        path12.cubicTo(70.351036f, 85.2317f, 65.988525f, 83.25148f, 61.50547f, 81.15362f);
        path12.cubicTo(53.607338f, 77.457664f, 45.639652f, 73.54258f, 37.881966f, 69.591f);
        instancePath2.lineTo(33.25479f, 67.21715f);
        instancePath2.cubicTo(30.956034f, 66.02949f, 28.79884f, 64.90235f, 26.805254f, 63.85013f);
        instancePath2.lineTo(21.26067f, 60.88868f);
        Path path13 = instancePath2;
        path13.cubicTo(12.543673f, 56.297035f, 4.649197f, 47.08582f, 0.52061206f, 37.392197f);
        path13.cubicTo(0.51061684f, 37.36873f, 0.49069256f, 37.34526f, 0.49069256f, 37.321785f);
        path13.cubicTo(0.49069256f, 33.440594f, 0.49069256f, 29.0f, 0.49069256f, 24.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
