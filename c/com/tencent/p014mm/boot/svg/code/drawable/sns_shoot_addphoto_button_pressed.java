package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import com.tencent.xweb.util.WXWebReporter;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_shoot_addphoto_button_pressed */
public class sns_shoot_addphoto_button_pressed extends C24542c {
    private final int height = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS;
    private final int width = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS;

    public int doCommand(int i, Object... objArr) {
        int i2 = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD_SUCCESS;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-5065805);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(186.0f, 0.0f);
                instancePath.lineTo(186.0f, 186.0f);
                instancePath.lineTo(0.0f, 186.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(3.0f, 3.0f);
                instancePath.lineTo(3.0f, 183.0f);
                instancePath.lineTo(183.0f, 183.0f);
                instancePath.lineTo(183.0f, 3.0f);
                instancePath.lineTo(3.0f, 3.0f);
                instancePath.lineTo(3.0f, 3.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(90.0f, 33.0f);
                instancePath2.lineTo(96.0f, 33.0f);
                instancePath2.lineTo(96.0f, 90.0f);
                instancePath2.lineTo(153.0f, 90.0f);
                instancePath2.lineTo(153.0f, 96.0f);
                instancePath2.lineTo(96.0f, 96.0f);
                instancePath2.lineTo(96.0f, 153.0f);
                instancePath2.lineTo(90.0f, 153.0f);
                instancePath2.lineTo(90.0f, 96.0f);
                instancePath2.lineTo(33.0f, 96.0f);
                instancePath2.lineTo(33.0f, 90.0f);
                instancePath2.lineTo(90.0f, 90.0f);
                instancePath2.lineTo(90.0f, 33.0f);
                instancePath2.lineTo(90.0f, 33.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
