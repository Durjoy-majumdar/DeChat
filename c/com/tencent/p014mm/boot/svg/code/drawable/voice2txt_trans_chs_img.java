package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voice2txt_trans_chs_img */
public class voice2txt_trans_chs_img extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(5.3333335f, 4.0f);
        instancePath.lineTo(26.666666f, 4.0f);
        Path path = instancePath;
        path.cubicTo(27.403046f, 4.0f, 28.0f, 4.596954f, 28.0f, 5.3333335f);
        instancePath.lineTo(28.0f, 26.666666f);
        path.cubicTo(28.0f, 27.403046f, 27.403046f, 28.0f, 26.666666f, 28.0f);
        instancePath.lineTo(5.3333335f, 28.0f);
        path.cubicTo(4.596954f, 28.0f, 4.0f, 27.403046f, 4.0f, 26.666666f);
        instancePath.lineTo(4.0f, 5.3333335f);
        path.cubicTo(4.0f, 4.596954f, 4.596954f, 4.0f, 5.3333335f, 4.0f);
        instancePath.close();
        instancePath.moveTo(9.597333f, 11.797334f);
        instancePath.lineTo(9.597333f, 13.322667f);
        instancePath.lineTo(11.826667f, 13.322667f);
        path.cubicTo(12.442667f, 15.449333f, 13.542666f, 17.312f, 15.126667f, 18.925333f);
        path.cubicTo(13.601334f, 20.216f, 11.665334f, 21.154667f, 9.333333f, 21.756f);
        instancePath.lineTo(10.154667f, 23.105333f);
        Path path2 = instancePath;
        path2.cubicTo(12.545333f, 22.430666f, 14.569333f, 21.36f, 16.212f, 19.908f);
        path2.cubicTo(17.766666f, 21.198668f, 19.717333f, 22.284f, 22.064f, 23.164f);
        instancePath.lineTo(22.914667f, 21.858667f);
        Path path3 = instancePath;
        path3.cubicTo(20.685333f, 21.037333f, 18.808f, 20.04f, 17.297333f, 18.837334f);
        path3.cubicTo(18.646667f, 17.356f, 19.673334f, 15.522667f, 20.377333f, 13.322667f);
        instancePath.lineTo(22.592f, 13.322667f);
        instancePath.lineTo(22.592f, 11.797334f);
        instancePath.lineTo(17.048f, 11.797334f);
        path3.cubicTo(16.608f, 10.844f, 16.124f, 10.022667f, 15.596f, 9.333333f);
        instancePath.lineTo(14.056f, 9.890667f);
        Path path4 = instancePath;
        path4.cubicTo(14.584f, 10.492f, 15.038667f, 11.122666f, 15.4053335f, 11.797334f);
        instancePath.lineTo(9.597333f, 11.797334f);
        instancePath.close();
        instancePath.moveTo(13.293333f, 13.322667f);
        instancePath.lineTo(18.793333f, 13.322667f);
        path4.cubicTo(18.221333f, 15.097333f, 17.356f, 16.622667f, 16.212f, 17.884f);
        path4.cubicTo(14.862667f, 16.564f, 13.894667f, 15.053333f, 13.293333f, 13.322667f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
