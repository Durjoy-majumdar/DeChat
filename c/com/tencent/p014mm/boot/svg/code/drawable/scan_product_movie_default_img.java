package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.TinkerStatusReport;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.scan_product_movie_default_img */
public class scan_product_movie_default_img extends C24542c {
    private final int height = 390;
    private final int width = TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return TinkerStatusReport.KVSTAT_TYPE_ID_TINKER_EXCEPTION;
        }
        if (i2 == 1) {
            return 390;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(260.0f, 0.0f);
        instancePath.lineTo(260.0f, 390.0f);
        instancePath.lineTo(0.0f, 390.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(59.198353f, 143.22687f);
        Path path = instancePath;
        instancePath.cubicTo(57.748947f, 143.91635f, 58.15878f, 145.61507f, 58.03883f, 146.9141f);
        Path path2 = path;
        path2.cubicTo(58.07881f, 179.9493f, 58.018837f, 212.99449f, 58.068817f, 246.0297f);
        path2.cubicTo(57.658985f, 247.83833f, 59.13838f, 249.32721f, 60.947636f, 248.9375f);
        path2.cubicTo(106.65889f, 248.99747f, 152.38014f, 248.9275f, 198.1014f, 248.96748f);
        path2.cubicTo(199.5408f, 248.98747f, 202.0098f, 249.08739f, 201.89984f, 246.99896f);
        path2.cubicTo(202.10976f, 213.66399f, 201.90984f, 180.30902f, 201.9998f, 146.97404f);
        path2.cubicTo(201.87985f, 145.66502f, 202.28969f, 143.96631f, 200.87027f, 143.22687f);
        path2.cubicTo(196.93188f, 142.79718f, 192.9535f, 143.12694f, 188.99513f, 143.037f);
        Path path3 = path;
        path3.lineTo(68.074715f, 143.037f);
        Matrix matrix = instanceMatrix;
        Path path4 = path3;
        path3.cubicTo(65.11593f, 143.06699f, 62.137146f, 142.85713f, 59.198353f, 143.22687f);
        path4.lineTo(59.198353f, 143.22687f);
        path4.close();
        WeChatSVGRenderC2Java.setFillType(path4, 2);
        canvas.drawPath(path4, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(64.0225f, 149.01395f);
        Path path5 = instancePath2;
        path5.cubicTo(108.01035f, 148.99394f, 151.99821f, 148.99394f, 195.98607f, 149.02394f);
        path5.cubicTo(195.99608f, 172.03217f, 196.01607f, 195.05038f, 195.97607f, 218.0686f);
        path5.cubicTo(185.94656f, 208.76527f, 176.03705f, 199.35191f, 165.99753f, 190.0686f);
        path5.cubicTo(159.30786f, 195.35048f, 152.65819f, 200.67238f, 146.04851f, 206.0343f);
        path5.cubicTo(148.28839f, 211.38622f, 150.70828f, 216.6581f, 152.97816f, 222.0f);
        path5.cubicTo(136.62897f, 205.70418f, 120.36975f, 189.32834f, 104.00055f, 173.05252f);
        path5.cubicTo(90.641205f, 186.92747f, 77.391846f, 200.90247f, 64.0225f, 214.76743f);
        path5.cubicTo(63.9925f, 192.8496f, 63.9925f, 170.93176f, 64.0225f, 149.01395f);
        instancePath2.lineTo(64.0225f, 149.01395f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-3552823);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 57.0f, 0.0f, 1.0f, 142.0f, 0.0f, 0.0f, 1.0f);
        matrix.reset();
        Matrix matrix2 = matrix;
        matrix2.setValues(matrixFloatArray);
        canvas.concat(matrix2);
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint6, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(2.1983528f, 1.2268617f);
        instancePath3.cubicTo(5.137148f, 0.8571393f, 8.115927f, 1.0669817f, 11.074713f, 1.0370042f);
        instancePath3.lineTo(131.99513f, 1.0370042f);
        Path path6 = instancePath3;
        path6.cubicTo(135.9535f, 1.1269367f, 139.93188f, 0.7971843f, 143.87027f, 1.2268617f);
        path6.cubicTo(145.28969f, 1.9663066f, 144.87985f, 3.6650314f, 144.9998f, 4.9740486f);
        path6.cubicTo(144.90984f, 38.309025f, 145.10976f, 71.66399f, 144.89984f, 104.99896f);
        path6.cubicTo(145.0098f, 107.087395f, 142.5408f, 106.987465f, 141.1014f, 106.96748f);
        path6.cubicTo(95.38014f, 106.92751f, 49.658894f, 106.99746f, 3.9476354f, 106.93751f);
        path6.cubicTo(2.1383774f, 107.32721f, 0.6589839f, 105.83833f, 1.0688158f, 104.029686f);
        path6.cubicTo(1.0188364f, 70.994484f, 1.0788118f, 37.949295f, 1.0388281f, 4.9140935f);
        path6.cubicTo(1.158779f, 3.615069f, 0.748947f, 1.9163442f, 2.1983528f, 1.2268617f);
        instancePath3.lineTo(2.1983528f, 1.2268617f);
        instancePath3.close();
        instancePath3.moveTo(7.022499f, 7.0139437f);
        path6.cubicTo(6.9925003f, 28.931768f, 6.9925003f, 50.849594f, 7.022499f, 72.76742f);
        path6.cubicTo(20.391848f, 58.90247f, 33.6412f, 44.92748f, 47.000553f, 31.052526f);
        path6.cubicTo(63.369755f, 47.328335f, 79.62896f, 63.70418f, 95.978165f, 80.0f);
        path6.cubicTo(93.708275f, 74.6581f, 91.28839f, 69.38621f, 89.0485f, 64.0343f);
        path6.cubicTo(95.65818f, 58.672386f, 102.30786f, 53.350487f, 108.997536f, 48.0686f);
        path6.cubicTo(119.03704f, 57.351913f, 128.94656f, 66.765274f, 138.97607f, 76.068596f);
        path6.cubicTo(139.01607f, 53.05038f, 138.99608f, 30.032162f, 138.98607f, 7.0239472f);
        path6.cubicTo(94.998215f, 6.9939365f, 51.010357f, 6.9939365f, 7.022499f, 7.0139437f);
        instancePath3.lineTo(7.022499f, 7.0139437f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
