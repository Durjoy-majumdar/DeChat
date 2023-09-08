package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_ad_finder_link_icon */
public class album_ad_finder_link_icon extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 48;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(1275068416);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 7.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(34.8207f, 0.55402f);
                Path path = instancePath;
                path.cubicTo(35.8629f, 1.04513f, 36.6463f, 2.00355f, 37.1545f, 3.2757f);
                path.cubicTo(37.8451f, 5.0042f, 37.925f, 7.7807f, 37.6601f, 10.8349f);
                path.cubicTo(37.3913f, 13.9333f, 36.7527f, 17.4635f, 35.896f, 20.7925f);
                path.cubicTo(35.0404f, 24.1169f, 33.958f, 27.2773f, 32.788f, 29.624f);
                path.cubicTo(32.2048f, 30.7939f, 31.5816f, 31.7989f, 30.9284f, 32.5236f);
                path.cubicTo(30.2958f, 33.2253f, 29.5112f, 33.8001f, 28.6017f, 33.8001f);
                path.cubicTo(27.6381f, 33.8001f, 26.7406f, 33.3971f, 25.8957f, 32.7571f);
                path.cubicTo(25.0539f, 32.1195f, 24.2121f, 31.2077f, 23.3415f, 30.0926f);
                path.cubicTo(22.5507f, 29.0795f, 21.7322f, 27.8811f, 20.8973f, 26.5405f);
                path.cubicTo(20.2486f, 25.4988f, 19.6118f, 24.4072f, 19.0f, 23.3036f);
                path.cubicTo(18.3881f, 24.4074f, 17.7514f, 25.4991f, 17.1028f, 26.5405f);
                path.cubicTo(16.2679f, 27.8811f, 15.4494f, 29.0795f, 14.6586f, 30.0926f);
                path.cubicTo(13.788f, 31.2077f, 12.9462f, 32.1195f, 12.1044f, 32.7571f);
                path.cubicTo(11.2594f, 33.3971f, 10.362f, 33.8001f, 9.3984f, 33.8001f);
                path.cubicTo(8.4889f, 33.8001f, 7.7043f, 33.2253f, 7.0717f, 32.5236f);
                path.cubicTo(6.4185f, 31.7989f, 5.7953f, 30.7939f, 5.2121f, 29.624f);
                path.cubicTo(4.04213f, 27.2773f, 2.95969f, 24.117f, 2.10413f, 20.7926f);
                path.cubicTo(1.24738f, 17.4635f, 0.60874f, 13.9333f, 0.34001f, 10.835f);
                path.cubicTo(0.07511f, 7.7808f, 0.15496f, 5.0043f, 0.84558f, 3.2758f);
                instancePath.lineTo(0.9508898f, 3.025594f);
                Path path2 = instancePath;
                path2.cubicTo(1.4594111f, 1.8779098f, 2.206672f, 1.0124086f, 3.17942f, 0.55403f);
                path2.cubicTo(4.23151f, 0.05827f, 5.4199f, 0.09878f, 6.6049f, 0.57814f);
                path2.cubicTo(8.2798f, 1.25566f, 10.0248f, 2.82112f, 11.8742f, 4.9939f);
                path2.cubicTo(12.9876f, 6.3019f, 14.1455f, 7.8427f, 15.3308f, 9.5644f);
                path2.cubicTo(16.596f, 11.4022f, 17.8345f, 13.3598f, 19.0f, 15.3184f);
                instancePath.lineTo(19.0f, 15.3184f);
                instancePath.cubicTo(19.9238f, 13.7661f, 20.8932f, 12.2147f, 21.8854f, 10.7232f);
                instancePath.lineTo(21.8888f, 10.7179f);
                instancePath.lineTo(22.6693f, 9.5644f);
                Path path3 = instancePath;
                path3.cubicTo(23.8546f, 7.8426f, 25.0125f, 6.3019f, 26.1258f, 4.9939f);
                path3.cubicTo(27.9753f, 2.82112f, 29.7203f, 1.25566f, 31.3952f, 0.57814f);
                path3.cubicTo(32.5802f, 0.09878f, 33.7686f, 0.05827f, 34.8207f, 0.55402f);
                instancePath.close();
                instancePath.moveTo(33.2061f, 4.032f);
                Path path4 = instancePath;
                path4.cubicTo(33.1742f, 4.0296f, 33.0742f, 4.0362f, 32.8459f, 4.1286f);
                path4.cubicTo(31.9795f, 4.479f, 30.6756f, 5.5787f, 29.0648f, 7.4711f);
                path4.cubicTo(28.051f, 8.6622f, 26.9707f, 10.098f, 25.8467f, 11.7306f);
                path4.cubicTo(24.8421f, 13.1898f, 23.8492f, 14.7371f, 22.8959f, 16.3043f);
                path4.cubicTo(22.8953f, 16.3052f, 22.8948f, 16.3062f, 22.8942f, 16.3072f);
                instancePath.lineTo(21.8885f, 17.9924f);
                instancePath.lineTo(21.1798f, 19.2237f);
                instancePath.lineTo(21.2952f, 19.4469f);
                instancePath.lineTo(21.2982f, 19.4527f);
                instancePath.lineTo(21.726f, 20.264f);
                Path path5 = instancePath;
                path5.cubicTo(21.7263f, 20.2646f, 21.7266f, 20.2652f, 21.7269f, 20.2658f);
                path5.cubicTo(22.5045f, 21.7216f, 23.3316f, 23.1734f, 24.1712f, 24.5215f);
                path5.cubicTo(24.9477f, 25.7685f, 25.691f, 26.8547f, 26.3832f, 27.7413f);
                path5.cubicTo(27.0031f, 28.5355f, 27.5578f, 29.128f, 27.9989f, 29.5131f);
                path5.cubicTo(28.1826f, 29.6735f, 28.3361f, 29.7886f, 28.4573f, 29.8659f);
                path5.cubicTo(28.5233f, 29.7752f, 28.6025f, 29.655f, 28.6939f, 29.5013f);
                path5.cubicTo(28.9948f, 28.995f, 29.3643f, 28.2336f, 29.7681f, 27.2594f);
                path5.cubicTo(30.5727f, 25.3183f, 31.4807f, 22.6121f, 32.2267f, 19.5948f);
                instancePath.lineTo(32.5324f, 18.3091f);
                Path path6 = instancePath;
                path6.cubicTo(33.2347f, 15.232f, 33.6957f, 12.2921f, 33.8749f, 9.8656f);
                path6.cubicTo(33.9646f, 8.6516f, 33.9828f, 7.578f, 33.9286f, 6.6866f);
                path6.cubicTo(33.8736f, 5.783f, 33.7467f, 5.1179f, 33.5764f, 4.6917f);
                path6.cubicTo(33.4723f, 4.431f, 33.3831f, 4.2609f, 33.3087f, 4.1519f);
                path6.cubicTo(33.2545f, 4.0726f, 33.2189f, 4.0417f, 33.2061f, 4.032f);
                instancePath.close();
                instancePath.moveTo(8.935f, 7.4711f);
                Path path7 = instancePath;
                path7.cubicTo(7.3242f, 5.5787f, 6.0203f, 4.479f, 5.154f, 4.1286f);
                path7.cubicTo(4.92562f, 4.0362f, 4.82565f, 4.0296f, 4.79374f, 4.032f);
                path7.cubicTo(4.78093f, 4.0417f, 4.74538f, 4.0726f, 4.69114f, 4.1519f);
                path7.cubicTo(4.61669f, 4.2609f, 4.52748f, 4.4311f, 4.42332f, 4.6919f);
                path7.cubicTo(4.353524f, 4.866574f, 4.2925324f, 5.076168f, 4.2409725f, 5.3190737f);
                instancePath.lineTo(4.204827f, 5.5040126f);
                Path path8 = instancePath;
                path8.cubicTo(4.0402646f, 6.415586f, 3.9939132f, 7.7268314f, 4.09195f, 9.3722f);
                path8.cubicTo(4.22239f, 11.5614f, 4.59911f, 14.2198f, 5.1908f, 17.045f);
                instancePath.lineTo(5.4682f, 18.3126f);
                instancePath.lineTo(5.7731f, 19.5948f);
                Path path9 = instancePath;
                path9.cubicTo(6.5191f, 22.6121f, 7.4271f, 25.3182f, 8.2317f, 27.2594f);
                path9.cubicTo(8.6355f, 28.2336f, 9.005f, 28.995f, 9.3059f, 29.5013f);
                path9.cubicTo(9.3973f, 29.655f, 9.4765f, 29.7752f, 9.5425f, 29.8659f);
                path9.cubicTo(9.6637f, 29.7886f, 9.8172f, 29.6735f, 10.0009f, 29.5132f);
                path9.cubicTo(10.442f, 29.128f, 10.9967f, 28.5355f, 11.6167f, 27.7413f);
                path9.cubicTo(12.3088f, 26.8547f, 13.0521f, 25.7685f, 13.8287f, 24.5215f);
                path9.cubicTo(14.4578f, 23.5112f, 15.0802f, 22.4424f, 15.6801f, 21.357f);
                instancePath.lineTo(16.4078f, 20.0122f);
                instancePath.lineTo(16.8184f, 19.2213f);
                instancePath.lineTo(16.3941f, 18.4783f);
                instancePath.lineTo(15.8128f, 17.4854f);
                Path path10 = instancePath;
                path10.cubicTo(15.8124f, 17.4848f, 15.8121f, 17.4843f, 15.8117f, 17.4837f);
                path10.cubicTo(14.6472f, 15.5176f, 13.4093f, 13.5553f, 12.1531f, 11.7306f);
                path10.cubicTo(11.778466f, 11.1864f, 11.408667f, 10.664066f, 11.044556f, 10.165374f);
                instancePath.lineTo(10.863827f, 9.921013f);
                instancePath.lineTo(10.682372f, 9.674627f);
                instancePath.cubicTo(10.082f, 8.8700695f, 9.498222f, 8.132822f, 8.935f, 7.4711f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
