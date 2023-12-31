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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_lct_operation */
public class icons_lct_operation extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(19.957447f, 15.6595745f);
        instancePath.lineTo(19.957447f, 15.6595745f);
        Path path = instancePath;
        path.cubicTo(19.702127f, 14.638298f, 19.361702f, 13.276596f, 19.361702f, 12.468085f);
        path.cubicTo(19.361702f, 11.744681f, 19.404255f, 11.063829f, 19.404255f, 10.553191f);
        path.cubicTo(19.404255f, 10.553191f, 19.404255f, 10.553191f, 19.404255f, 10.553191f);
        path.cubicTo(19.404255f, 10.297873f, 19.446808f, 10.042553f, 19.446808f, 9.787234f);
        path.cubicTo(19.446808f, 9.787234f, 19.446808f, 9.787234f, 19.446808f, 9.787234f);
        path.cubicTo(19.446808f, 9.74468f, 19.446808f, 9.702127f, 19.446808f, 9.702127f);
        path.cubicTo(19.446808f, 9.702127f, 19.446808f, 9.702127f, 19.446808f, 9.74468f);
        path.cubicTo(19.446808f, 9.6595745f, 19.446808f, 9.531915f, 19.446808f, 9.446809f);
        path.cubicTo(19.361702f, 7.4468083f, 18.680851f, 5.4468083f, 17.48936f, 3.787234f);
        path.cubicTo(16.553192f, 2.5106382f, 15.276596f, 1.3191489f, 13.787234f, 0.7659575f);
        path.cubicTo(12.510638f, 0.29787233f, 10.3404255f, -0.04255319f, 9.489362f, 1.1914893f);
        path.cubicTo(7.9574466f, 3.4468086f, 10.978724f, 5.9148936f, 11.702127f, 6.5531917f);
        instancePath.lineTo(11.702127f, 6.5531917f);
        Path path2 = instancePath;
        path2.cubicTo(11.829787f, 6.638298f, 11.957447f, 6.7659574f, 12.085107f, 6.893617f);
        path2.cubicTo(12.12766f, 6.93617f, 12.12766f, 6.93617f, 12.170213f, 6.9787235f);
        path2.cubicTo(12.212766f, 7.0212765f, 12.297873f, 7.106383f, 12.3404255f, 7.1489363f);
        path2.cubicTo(12.382978f, 7.191489f, 12.468085f, 7.2765956f, 12.510638f, 7.319149f);
        path2.cubicTo(12.510638f, 7.319149f, 12.510638f, 7.319149f, 12.510638f, 7.361702f);
        path2.cubicTo(13.106383f, 8.297873f, 13.404255f, 10.893617f, 12.297873f, 12.382978f);
        path2.cubicTo(12.297873f, 12.382978f, 12.255319f, 12.425532f, 12.297873f, 12.468085f);
        path2.cubicTo(12.297873f, 12.510638f, 12.3404255f, 12.553191f, 12.425532f, 12.553191f);
        path2.cubicTo(12.425532f, 12.553191f, 12.468085f, 12.553191f, 12.468085f, 12.553191f);
        path2.cubicTo(12.936171f, 12.297873f, 13.446809f, 12.0f, 13.744681f, 11.914893f);
        path2.cubicTo(13.744681f, 11.914893f, 13.744681f, 11.914893f, 13.744681f, 11.914893f);
        path2.cubicTo(13.574468f, 13.148936f, 13.021276f, 14.212766f, 12.255319f, 15.021276f);
        path2.cubicTo(12.255319f, 15.021276f, 12.212766f, 15.063829f, 12.212766f, 15.063829f);
        path2.cubicTo(12.12766f, 15.148936f, 12.042553f, 15.234042f, 11.914893f, 15.319149f);
        path2.cubicTo(11.87234f, 15.361702f, 11.87234f, 15.361702f, 11.829787f, 15.404255f);
        path2.cubicTo(11.744681f, 15.489362f, 11.6595745f, 15.531915f, 11.574468f, 15.617022f);
        path2.cubicTo(11.531915f, 15.6595745f, 11.489362f, 15.702127f, 11.446809f, 15.702127f);
        path2.cubicTo(11.361702f, 15.744681f, 11.276596f, 15.829787f, 11.191489f, 15.87234f);
        path2.cubicTo(11.148936f, 15.914893f, 11.063829f, 15.957447f, 11.021276f, 15.957447f);
        path2.cubicTo(10.936171f, 16.0f, 10.851064f, 16.042553f, 10.765958f, 16.085106f);
        path2.cubicTo(10.723404f, 16.127659f, 10.638298f, 16.170214f, 10.553191f, 16.170214f);
        path2.cubicTo(10.468085f, 16.212767f, 10.382978f, 16.25532f, 10.297873f, 16.297873f);
        path2.cubicTo(10.212766f, 16.340425f, 10.170213f, 16.340425f, 10.085107f, 16.382978f);
        path2.cubicTo(10.0f, 16.425531f, 9.914893f, 16.425531f, 9.829787f, 16.468084f);
        path2.cubicTo(9.74468f, 16.51064f, 9.6595745f, 16.51064f, 9.574468f, 16.553192f);
        path2.cubicTo(9.489362f, 16.595745f, 9.446809f, 16.595745f, 9.361702f, 16.595745f);
        path2.cubicTo(9.276596f, 16.638298f, 9.148936f, 16.638298f, 9.063829f, 16.680851f);
        path2.cubicTo(9.021276f, 16.680851f, 8.936171f, 16.723404f, 8.893617f, 16.723404f);
        path2.cubicTo(8.723404f, 16.765957f, 8.553191f, 16.765957f, 8.382978f, 16.80851f);
        path2.cubicTo(8.212766f, 16.80851f, 8.0f, 16.851065f, 7.8297873f, 16.80851f);
        path2.cubicTo(7.787234f, 16.80851f, 7.7021275f, 16.80851f, 7.6595745f, 16.80851f);
        path2.cubicTo(7.5319147f, 16.80851f, 7.4042554f, 16.80851f, 7.2765956f, 16.765957f);
        path2.cubicTo(7.191489f, 16.765957f, 7.1489363f, 16.765957f, 7.06383f, 16.723404f);
        path2.cubicTo(6.93617f, 16.723404f, 6.8510637f, 16.680851f, 6.7234044f, 16.680851f);
        path2.cubicTo(6.638298f, 16.680851f, 6.5531917f, 16.638298f, 6.510638f, 16.638298f);
        path2.cubicTo(6.425532f, 16.595745f, 6.2978725f, 16.595745f, 6.212766f, 16.553192f);
        path2.cubicTo(6.12766f, 16.51064f, 6.0425534f, 16.51064f, 6.0f, 16.468084f);
        path2.cubicTo(5.9148936f, 16.425531f, 5.8297873f, 16.382978f, 5.7021275f, 16.382978f);
        path2.cubicTo(5.617021f, 16.340425f, 5.5319147f, 16.340425f, 5.489362f, 16.297873f);
        path2.cubicTo(5.4042554f, 16.25532f, 5.319149f, 16.212767f, 5.2340426f, 16.170214f);
        path2.cubicTo(5.1489363f, 16.127659f, 5.06383f, 16.085106f, 5.0212765f, 16.042553f);
        path2.cubicTo(4.93617f, 16.0f, 4.8510637f, 15.957447f, 4.7659574f, 15.87234f);
        path2.cubicTo(4.680851f, 15.829787f, 4.638298f, 15.787234f, 4.5531917f, 15.744681f);
        path2.cubicTo(3.106383f, 14.765958f, 2.1276596f, 13.191489f, 2.0425532f, 11.191489f);
        path2.cubicTo(2.0f, 9.574468f, 2.4255319f, 8.3404255f, 3.2340426f, 7.319149f);
        path2.cubicTo(4.808511f, 5.319149f, 7.2340426f, 3.787234f, 6.510638f, 0.08510638f);
        instancePath.lineTo(6.510638f, 0.08510638f);
        instancePath.lineTo(6.510638f, 0.08510638f);
        Path path3 = instancePath;
        path3.cubicTo(6.510638f, 0.04255319f, 6.4680853f, 1.5117931E-15f, 6.425532f, 1.5117931E-15f);
        path3.cubicTo(6.382979f, 1.5117931E-15f, 6.3404255f, 0.04255319f, 6.3404255f, 0.04255319f);
        instancePath.lineTo(6.3404255f, 0.04255319f);
        Path path4 = instancePath;
        path4.cubicTo(6.2978725f, 0.08510638f, 6.2978725f, 0.12765957f, 6.255319f, 0.17021276f);
        path4.cubicTo(5.361702f, 1.9148936f, 3.2765958f, 2.7234042f, 1.4468085f, 2.0851064f);
        path4.cubicTo(1.4468085f, 2.0851064f, 1.4468085f, 2.0851064f, 1.4042553f, 2.0851064f);
        path4.cubicTo(1.3617021f, 2.0851064f, 1.3191489f, 2.1276596f, 1.3191489f, 2.212766f);
        path4.cubicTo(1.3191489f, 2.212766f, 1.3191489f, 2.255319f, 1.3191489f, 2.255319f);
        path4.cubicTo(1.7872341f, 4.1702127f, 0.89361703f, 5.489362f, 0.38297874f, 7.2765956f);
        path4.cubicTo(0.34042552f, 7.4042554f, 0.29787233f, 7.5319147f, 0.29787233f, 7.6595745f);
        path4.cubicTo(0.29787233f, 7.6595745f, 0.29787233f, 7.6595745f, 0.29787233f, 7.6595745f);
        path4.cubicTo(0.29787233f, 7.6595745f, 0.29787233f, 7.6595745f, 0.29787233f, 7.6595745f);
        path4.cubicTo(0.25531915f, 7.9148936f, 0.17021276f, 8.170213f, 0.12765957f, 8.425532f);
        path4.cubicTo(0.12765957f, 8.468085f, 0.12765957f, 8.468085f, 0.12765957f, 8.510638f);
        path4.cubicTo(0.08510638f, 8.765958f, 0.04255319f, 8.978724f, 0.04255319f, 9.234042f);
        path4.cubicTo(0.04255319f, 9.276596f, 0.04255319f, 9.319149f, 0.04255319f, 9.319149f);
        path4.cubicTo(0.0f, 9.574468f, 0.0f, 9.787234f, 0.0f, 10.042553f);
        path4.cubicTo(0.0f, 10.085107f, 0.0f, 10.12766f, 0.0f, 10.12766f);
        path4.cubicTo(0.0f, 10.3404255f, 0.0f, 10.595745f, 0.04255319f, 10.808511f);
        path4.cubicTo(0.04255319f, 10.851064f, 0.04255319f, 10.893617f, 0.04255319f, 10.893617f);
        path4.cubicTo(0.08510638f, 11.106383f, 0.08510638f, 11.361702f, 0.12765957f, 11.574468f);
        path4.cubicTo(0.12765957f, 11.617022f, 0.12765957f, 11.617022f, 0.12765957f, 11.6595745f);
        path4.cubicTo(0.17021276f, 11.914893f, 0.21276596f, 12.12766f, 0.29787233f, 12.382978f);
        path4.cubicTo(0.29787233f, 12.425532f, 0.29787233f, 12.425532f, 0.34042552f, 12.468085f);
        path4.cubicTo(0.42553192f, 12.765958f, 0.5106383f, 12.978724f, 0.59574467f, 13.234042f);
        path4.cubicTo(0.59574467f, 13.234042f, 0.59574467f, 13.276596f, 0.59574467f, 13.276596f);
        path4.cubicTo(0.68085104f, 13.531915f, 0.80851066f, 13.787234f, 0.9361702f, 14.042553f);
        path4.cubicTo(1.7021277f, 15.574468f, 2.8510637f, 16.851065f, 4.255319f, 17.787233f);
        path4.cubicTo(4.255319f, 17.787233f, 4.255319f, 17.787233f, 4.255319f, 17.787233f);
        path4.cubicTo(4.2978725f, 17.829786f, 4.382979f, 17.872341f, 4.425532f, 17.914894f);
        path4.cubicTo(4.5531917f, 18.0f, 4.680851f, 18.085106f, 4.808511f, 18.170214f);
        path4.cubicTo(4.893617f, 18.212767f, 4.9787235f, 18.25532f, 5.06383f, 18.297873f);
        path4.cubicTo(5.191489f, 18.382978f, 5.319149f, 18.425531f, 5.4468083f, 18.51064f);
        path4.cubicTo(5.5319147f, 18.553192f, 5.617021f, 18.595745f, 5.7021275f, 18.638298f);
        path4.cubicTo(5.8297873f, 18.680851f, 5.9574466f, 18.765957f, 6.0851064f, 18.80851f);
        path4.cubicTo(6.1702127f, 18.851065f, 6.255319f, 18.893618f, 6.382979f, 18.93617f);
        path4.cubicTo(6.510638f, 18.978724f, 6.638298f, 19.021276f, 6.808511f, 19.06383f);
        path4.cubicTo(6.893617f, 19.106382f, 7.0212765f, 19.106382f, 7.106383f, 19.148935f);
        path4.cubicTo(7.2340426f, 19.19149f, 7.4042554f, 19.234043f, 7.5319147f, 19.234043f);
        path4.cubicTo(7.617021f, 19.276596f, 7.744681f, 19.276596f, 7.8297873f, 19.319149f);
        path4.cubicTo(7.9574466f, 19.361702f, 8.12766f, 19.361702f, 8.25532f, 19.404255f);
        path4.cubicTo(8.3404255f, 19.404255f, 8.468085f, 19.446808f, 8.553191f, 19.446808f);
        path4.cubicTo(8.723404f, 19.446808f, 8.893617f, 19.48936f, 9.063829f, 19.48936f);
        path4.cubicTo(9.148936f, 19.48936f, 9.234042f, 19.48936f, 9.319149f, 19.48936f);
        path4.cubicTo(9.574468f, 19.48936f, 9.829787f, 19.48936f, 10.085107f, 19.48936f);
        path4.cubicTo(10.808511f, 19.446808f, 11.531915f, 19.361702f, 12.212766f, 19.19149f);
        path4.cubicTo(12.212766f, 19.19149f, 12.212766f, 19.19149f, 12.212766f, 19.19149f);
        path4.cubicTo(12.212766f, 19.19149f, 12.255319f, 19.19149f, 12.255319f, 19.19149f);
        path4.cubicTo(12.553191f, 19.106382f, 12.808511f, 19.021276f, 13.106383f, 18.93617f);
        path4.cubicTo(13.148936f, 18.93617f, 13.148936f, 18.893618f, 13.191489f, 18.893618f);
        path4.cubicTo(13.446809f, 18.80851f, 13.744681f, 18.680851f, 14.0f, 18.553192f);
        path4.cubicTo(14.042553f, 18.553192f, 14.042553f, 18.51064f, 14.085107f, 18.51064f);
        path4.cubicTo(14.3404255f, 18.382978f, 14.595745f, 18.25532f, 14.851064f, 18.085106f);
        path4.cubicTo(14.893617f, 18.085106f, 14.893617f, 18.042553f, 14.936171f, 18.042553f);
        path4.cubicTo(15.191489f, 17.872341f, 15.404255f, 17.702127f, 15.6595745f, 17.531916f);
        path4.cubicTo(15.702127f, 17.531916f, 15.702127f, 17.48936f, 15.744681f, 17.48936f);
        path4.cubicTo(15.957447f, 17.319149f, 16.212767f, 17.106382f, 16.425531f, 16.93617f);
        path4.cubicTo(16.425531f, 16.93617f, 16.468084f, 16.893618f, 16.468084f, 16.893618f);
        path4.cubicTo(16.680851f, 16.680851f, 16.893618f, 16.468084f, 17.06383f, 16.25532f);
        path4.cubicTo(17.06383f, 16.25532f, 17.106382f, 16.212767f, 17.106382f, 16.212767f);
        path4.cubicTo(17.319149f, 16.0f, 17.48936f, 15.744681f, 17.659575f, 15.531915f);
        path4.cubicTo(17.659575f, 15.531915f, 17.702127f, 15.489362f, 17.702127f, 15.489362f);
        path4.cubicTo(17.872341f, 15.234042f, 18.042553f, 14.978724f, 18.170214f, 14.723404f);
        path4.cubicTo(18.170214f, 14.723404f, 18.170214f, 14.723404f, 18.170214f, 14.680851f);
        path4.cubicTo(18.723404f, 14.595745f, 19.404255f, 15.361702f, 19.787233f, 15.87234f);
        instancePath.lineTo(19.787233f, 15.87234f);
        Path path5 = instancePath;
        path5.cubicTo(19.787233f, 15.914893f, 19.829786f, 15.914893f, 19.872341f, 15.914893f);
        path5.cubicTo(19.914894f, 15.787234f, 19.957447f, 15.744681f, 19.957447f, 15.6595745f);
        path5.cubicTo(19.957447f, 15.6595745f, 19.957447f, 15.6595745f, 19.957447f, 15.6595745f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(6.3404255f, 11.063829f);
        instancePath2.lineTo(7.787234f, 12.510638f);
        instancePath2.cubicTo(7.9148936f, 12.638298f, 8.085107f, 12.638298f, 8.170213f, 12.510638f);
        instancePath2.lineTo(9.617022f, 11.063829f);
        instancePath2.cubicTo(9.74468f, 10.936171f, 9.74468f, 10.765958f, 9.617022f, 10.680851f);
        instancePath2.lineTo(8.170213f, 9.234042f);
        instancePath2.cubicTo(8.042553f, 9.106383f, 7.87234f, 9.106383f, 7.787234f, 9.234042f);
        instancePath2.lineTo(6.3404255f, 10.680851f);
        instancePath2.cubicTo(6.212766f, 10.765958f, 6.212766f, 10.936171f, 6.3404255f, 11.063829f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1250582);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(0.0f, 0.0f);
        instancePath3.lineTo(24.0f, 0.0f);
        instancePath3.lineTo(24.0f, 24.0f);
        instancePath3.lineTo(0.0f, 24.0f);
        instancePath3.lineTo(0.0f, 0.0f);
        instancePath3.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath3, C24542c.instancePaint(instancePaint6, looper));
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
