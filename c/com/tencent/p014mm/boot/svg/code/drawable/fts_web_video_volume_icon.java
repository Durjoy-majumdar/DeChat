package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fts_web_video_volume_icon */
public class fts_web_video_volume_icon extends C24542c {
    private final int height = 144;
    private final int width = 144;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 144;
        }
        if (i2 == 2) {
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
            instancePaint3.setColor(-2565928);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(144.0f, 0.0f);
            instancePath.lineTo(144.0f, 144.0f);
            instancePath.lineTo(0.0f, 144.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha((RectF) null, 0, 31);
            canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(78.44484f, 44.162613f);
            Path path = instancePath2;
            path.cubicTo(84.704666f, 51.292156f, 88.5f, 60.63898f, 88.5f, 70.87225f);
            path.cubicTo(88.5f, 81.723785f, 84.23221f, 91.57853f, 77.28353f, 98.84956f);
            instancePath2.lineTo(72.523056f, 95.138885f);
            Path path2 = instancePath2;
            path2.cubicTo(78.69114f, 88.90604f, 82.5f, 80.33395f, 82.5f, 70.87225f);
            path2.cubicTo(82.5f, 61.983555f, 79.138504f, 53.87998f, 73.6174f, 47.763412f);
            instancePath2.lineTo(78.44484f, 44.162613f);
            instancePath2.close();
            instancePath2.moveTo(100.12927f, 27.988129f);
            path2.cubicTo(109.732765f, 39.648514f, 115.5f, 54.58688f, 115.5f, 70.87225f);
            path2.cubicTo(115.5f, 87.98085f, 109.13496f, 103.60282f, 98.64374f, 115.499306f);
            instancePath2.lineTo(93.90192f, 111.80317f);
            Path path3 = instancePath2;
            path3.cubicTo(103.60352f, 100.93096f, 109.5f, 86.5902f, 109.5f, 70.87225f);
            path3.cubicTo(109.5f, 55.931896f, 104.17251f, 42.23584f, 95.3136f, 31.580154f);
            instancePath2.lineTo(100.12927f, 27.988129f);
            instancePath2.close();
            instancePath2.moveTo(120.587326f, 12.728405f);
            path3.cubicTo(133.35962f, 28.652878f, 141.0f, 48.87031f, 141.0f, 70.87225f);
            path3.cubicTo(141.0f, 93.89153f, 132.63672f, 114.95747f, 118.78293f, 131.1973f);
            instancePath2.lineTo(114.045685f, 127.50474f);
            Path path4 = instancePath2;
            path4.cubicTo(127.1076f, 112.28587f, 135.0f, 92.50075f, 135.0f, 70.87225f);
            path4.cubicTo(135.0f, 50.21541f, 127.8008f, 31.240032f, 115.77455f, 16.318272f);
            instancePath2.lineTo(120.587326f, 12.728405f);
            instancePath2.close();
            instancePath2.moveTo(6.0f, 54.0f);
            instancePath2.lineTo(27.0f, 54.0f);
            instancePath2.lineTo(56.9668f, 32.595142f);
            instancePath2.lineTo(56.9668f, 32.595142f);
            Path path5 = instancePath2;
            path5.cubicTo(57.416214f, 32.27413f, 58.040764f, 32.378223f, 58.361774f, 32.827637f);
            path5.cubicTo(58.477894f, 32.990208f, 58.54266f, 33.18383f, 58.547718f, 33.38355f);
            instancePath2.lineTo(59.347828f, 64.964676f);
            instancePath2.lineTo(58.533905f, 110.598976f);
            instancePath2.lineTo(58.533905f, 110.598976f);
            Path path6 = instancePath2;
            path6.cubicTo(58.524055f, 111.15118f, 58.068428f, 111.590836f, 57.51623f, 111.580986f);
            path6.cubicTo(57.313927f, 111.57738f, 57.117477f, 111.51248f, 56.952827f, 111.394875f);
            instancePath2.lineTo(27.0f, 90.0f);
            instancePath2.lineTo(6.0f, 90.0f);
            instancePath2.cubicTo(4.343146f, 90.0f, 3.0f, 88.65685f, 3.0f, 87.0f);
            instancePath2.lineTo(3.0f, 57.0f);
            instancePath2.lineTo(3.0f, 57.0f);
            instancePath2.cubicTo(3.0f, 55.343147f, 4.343146f, 54.0f, 6.0f, 54.0f);
            instancePath2.lineTo(6.0f, 54.0f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
