package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_element_icon */
public class finder_live_element_icon extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setColor(-16777216);
        instancePaint3.setStrokeWidth(2.0f);
        instancePaint3.setStrokeCap(Paint.Cap.ROUND);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(9.37462f, 21.7773f);
        Path path = instancePath;
        path.cubicTo(9.2157f, 21.327f, 8.703f, 20.4852f, 7.64431f, 19.2074f);
        path.cubicTo(7.49471f, 19.0268f, 7.21806f, 18.7299f, 6.81438f, 18.3167f);
        path.cubicTo(5.36914f, 16.9957f, 4.46082f, 15.0839f, 4.46082f, 12.9572f);
        path.cubicTo(4.46082f, 8.97087f, 7.65212f, 5.73935f, 11.5888f, 5.73935f);
        instancePath.lineTo(12.1371f, 5.73935f);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint4.setColor(-16777216);
        instancePaint5.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(8.47876f, 5.7394f);
        Path path2 = instancePath2;
        instancePath2.cubicTo(7.66325f, 5.20106f, 6.9461f, 4.82875f, 6.3273f, 4.62249f);
        path2.lineTo(6.27403f, 4.60505f);
        path2.lineTo(6.21882f, 4.58759f);
        path2.lineTo(6.16166f, 4.57013f);
        path2.lineTo(6.10256f, 4.55265f);
        path2.lineTo(6.04151f, 4.53515f);
        path2.lineTo(5.97851f, 4.51764f);
        path2.lineTo(5.91357f, 4.50012f);
        path2.lineTo(5.84668f, 4.48258f);
        path2.lineTo(5.77784f, 4.46503f);
        path2.lineTo(5.70706f, 4.44746f);
        path2.lineTo(5.59725f, 4.42109f);
        path2.lineTo(5.5216f, 4.40348f);
        path2.lineTo(5.44401f, 4.38587f);
        path2.lineTo(5.36447f, 4.36824f);
        path2.lineTo(5.24152f, 4.34176f);
        path2.lineTo(5.11419f, 4.31526f);
        path2.lineTo(5.02686f, 4.29757f);
        path2.lineTo(4.89223f, 4.27101f);
        path2.lineTo(4.80005f, 4.25329f);
        path2.lineTo(4.65812f, 4.22668f);
        path2.lineTo(4.51181f, 4.20003f);
        path2.lineTo(4.41184f, 4.18225f);
        path2.lineTo(4.25824f, 4.15556f);
        path2.lineTo(4.04662f, 4.11991f);
        path2.lineTo(3.9379f, 4.10206f);
        path2.lineTo(3.77116f, 4.07527f);
        path2.lineTo(3.60004f, 4.04845f);
        path2.lineTo(3.42454f, 4.02159f);
        path2.lineTo(3.30511f, 4.00366f);
        path2.cubicTo(3.28504f, 4.00068f, 3.2649f, 3.99769f, 3.24467f, 3.9947f);
        path2.lineTo(3.2809f, 4.23611f);
        path2.lineTo(3.30814f, 4.41257f);
        path2.lineTo(3.33534f, 4.58453f);
        path2.lineTo(3.36251f, 4.75198f);
        path2.lineTo(3.38965f, 4.91492f);
        path2.lineTo(3.40772f, 5.02105f);
        path2.lineTo(3.4348f, 5.17648f);
        path2.lineTo(3.45284f, 5.2776f);
        path2.lineTo(3.47086f, 5.37672f);
        path2.lineTo(3.49786f, 5.52164f);
        path2.lineTo(3.51585f, 5.61574f);
        path2.lineTo(3.5428f, 5.75315f);
        path2.lineTo(3.56971f, 5.88605f);
        path2.lineTo(3.59659f, 6.01445f);
        path2.lineTo(3.6145f, 6.09754f);
        path2.lineTo(3.63239f, 6.17863f);
        path2.lineTo(3.65026f, 6.25772f);
        path2.lineTo(3.66812f, 6.3348f);
        path2.lineTo(3.68597f, 6.40989f);
        path2.lineTo(3.7038f, 6.48297f);
        path2.lineTo(3.72161f, 6.55404f);
        path2.lineTo(3.74831f, 6.6569f);
        path2.lineTo(3.76609f, 6.72297f);
        path2.lineTo(3.78385f, 6.78704f);
        path2.lineTo(3.8016f, 6.8491f);
        path2.lineTo(3.81934f, 6.90916f);
        path2.cubicTo(3.82229f, 6.919f, 3.82525f, 6.92876f, 3.8282f, 6.93844f);
        path2.lineTo(3.84591f, 6.9955f);
        path2.lineTo(3.86361f, 7.05055f);
        Path path3 = path2;
        path3.cubicTo(3.86656f, 7.05956f, 3.86951f, 7.06848f, 3.87245f, 7.07733f);
        path3.cubicTo(4.06955f, 7.66862f, 4.41826f, 8.34973f, 4.91857f, 9.12064f);
        path2.lineTo(4.98936f, 9.22879f);
        path2.lineTo(8.47876f, 5.7394f);
        path2.close();
        WeChatSVGRenderC2Java.setFillType(path2, 2);
        canvas.drawPath(path2, instancePaint4);
        canvas.drawPath(path2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(2.0f);
        instancePaint6.setStrokeCap(Paint.Cap.ROUND);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(14.6255f, 21.7773f);
        Path path4 = instancePath3;
        path4.cubicTo(14.7844f, 21.327f, 15.2971f, 20.4853f, 16.3558f, 19.2074f);
        path4.cubicTo(16.5054f, 19.0268f, 16.782f, 18.7299f, 17.1857f, 18.3167f);
        path4.cubicTo(18.6309f, 16.9957f, 19.5393f, 15.0839f, 19.5393f, 12.9572f);
        path4.cubicTo(19.5393f, 8.97091f, 16.348f, 5.73938f, 12.4113f, 5.73938f);
        instancePath3.lineTo(11.863f, 5.73938f);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint8 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint7.setColor(-16777216);
        instancePaint8.setColor(-16777216);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(15.5211f, 5.7394f);
        instancePath4.cubicTo(16.3367f, 5.20106f, 17.0538f, 4.82875f, 17.6726f, 4.62249f);
        instancePath4.lineTo(17.7259f, 4.60505f);
        instancePath4.lineTo(17.7811f, 4.58759f);
        instancePath4.lineTo(17.8382f, 4.57013f);
        instancePath4.lineTo(17.8974f, 4.55265f);
        instancePath4.lineTo(17.9584f, 4.53515f);
        instancePath4.lineTo(18.0214f, 4.51764f);
        instancePath4.lineTo(18.0863f, 4.50012f);
        instancePath4.lineTo(18.1532f, 4.48258f);
        instancePath4.lineTo(18.2221f, 4.46503f);
        instancePath4.lineTo(18.2928f, 4.44746f);
        instancePath4.lineTo(18.4027f, 4.42109f);
        instancePath4.lineTo(18.4783f, 4.40348f);
        instancePath4.lineTo(18.5559f, 4.38587f);
        instancePath4.lineTo(18.6354f, 4.36824f);
        instancePath4.lineTo(18.7584f, 4.34176f);
        instancePath4.lineTo(18.8857f, 4.31526f);
        instancePath4.lineTo(18.973f, 4.29757f);
        instancePath4.lineTo(19.1077f, 4.27101f);
        instancePath4.lineTo(19.1999f, 4.25329f);
        instancePath4.lineTo(19.3418f, 4.22668f);
        instancePath4.lineTo(19.4881f, 4.20003f);
        instancePath4.lineTo(19.5881f, 4.18225f);
        instancePath4.lineTo(19.7417f, 4.15556f);
        instancePath4.lineTo(19.9533f, 4.11991f);
        instancePath4.lineTo(20.062f, 4.10206f);
        instancePath4.lineTo(20.2288f, 4.07527f);
        instancePath4.lineTo(20.3999f, 4.04845f);
        instancePath4.lineTo(20.5754f, 4.02159f);
        instancePath4.lineTo(20.6948f, 4.00366f);
        instancePath4.cubicTo(20.7149f, 4.00068f, 20.735f, 3.99769f, 20.7552f, 3.9947f);
        instancePath4.lineTo(20.719f, 4.23611f);
        instancePath4.lineTo(20.6918f, 4.41257f);
        instancePath4.lineTo(20.6646f, 4.58453f);
        instancePath4.lineTo(20.6374f, 4.75198f);
        instancePath4.lineTo(20.6103f, 4.91492f);
        instancePath4.lineTo(20.5922f, 5.02105f);
        instancePath4.lineTo(20.5651f, 5.17648f);
        instancePath4.lineTo(20.5471f, 5.2776f);
        instancePath4.lineTo(20.5291f, 5.37672f);
        instancePath4.lineTo(20.502f, 5.52164f);
        instancePath4.lineTo(20.4841f, 5.61574f);
        instancePath4.lineTo(20.4571f, 5.75315f);
        instancePath4.lineTo(20.4302f, 5.88605f);
        instancePath4.lineTo(20.4033f, 6.01445f);
        instancePath4.lineTo(20.3854f, 6.09754f);
        instancePath4.lineTo(20.3675f, 6.17863f);
        instancePath4.lineTo(20.3496f, 6.25772f);
        instancePath4.lineTo(20.3318f, 6.3348f);
        instancePath4.lineTo(20.3139f, 6.40989f);
        instancePath4.lineTo(20.2961f, 6.48297f);
        instancePath4.lineTo(20.2783f, 6.55404f);
        instancePath4.lineTo(20.2516f, 6.6569f);
        instancePath4.lineTo(20.2338f, 6.72297f);
        instancePath4.lineTo(20.2161f, 6.78704f);
        instancePath4.lineTo(20.1983f, 6.8491f);
        instancePath4.lineTo(20.1806f, 6.90916f);
        instancePath4.cubicTo(20.1776f, 6.919f, 20.1747f, 6.92876f, 20.1717f, 6.93844f);
        instancePath4.lineTo(20.154f, 6.9955f);
        instancePath4.lineTo(20.1363f, 7.05055f);
        Path path5 = instancePath4;
        path5.cubicTo(20.1333f, 7.05956f, 20.1304f, 7.06848f, 20.1275f, 7.07733f);
        path5.cubicTo(19.9304f, 7.66862f, 19.5816f, 8.34973f, 19.0813f, 9.12064f);
        instancePath4.lineTo(19.0105f, 9.22879f);
        instancePath4.lineTo(15.5211f, 5.7394f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
