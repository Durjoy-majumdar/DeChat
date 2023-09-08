package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fts_video_icon */
public class fts_video_icon extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-420614675);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(18.627419f, 0.0f, 24.0f, 5.3725824f, 24.0f, 12.0f);
        path.cubicTo(24.0f, 18.627419f, 18.627419f, 24.0f, 12.0f, 24.0f);
        path.cubicTo(5.3725824f, 24.0f, 0.0f, 18.627419f, 0.0f, 12.0f);
        path.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.8f, 0.0f, 1.0f, 4.8f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        C24542c.instancePaint(instancePaint3, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(5.8408794f, 3.0470572f);
        instancePath2.lineTo(11.455324f, 6.5021f);
        Path path2 = instancePath2;
        path2.cubicTo(11.7939825f, 6.710505f, 11.899573f, 7.1539865f, 11.691168f, 7.4926443f);
        path2.cubicTo(11.632097f, 7.588635f, 11.551315f, 7.669417f, 11.455324f, 7.728488f);
        instancePath2.lineTo(5.8408794f, 11.183531f);
        Path path3 = instancePath2;
        path3.cubicTo(5.502222f, 11.391936f, 5.05874f, 11.286345f, 4.8503356f, 10.947687f);
        path3.cubicTo(4.7805033f, 10.834209f, 4.7435293f, 10.70358f, 4.7435293f, 10.570337f);
        instancePath2.lineTo(4.7435293f, 3.6602511f);
        Path path4 = instancePath2;
        path4.cubicTo(4.7435293f, 3.2626061f, 5.0658846f, 2.940251f, 5.4635296f, 2.940251f);
        path4.cubicTo(5.5967727f, 2.940251f, 5.727402f, 2.9772248f, 5.8408794f, 3.0470572f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
