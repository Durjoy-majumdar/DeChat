package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.rank_torch */
public class rank_torch extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 16;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.333333f, 0.0f, 1.0f, 0.333333f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(5.442881f, 0.1418983f);
        Path path = instancePath;
        path.cubicTo(5.9334736f, 0.30760488f, 6.2776937f, 0.53254783f, 6.475542f, 0.8167271f);
        path.cubicTo(6.929953f, 1.4694198f, 7.0549126f, 2.1148126f, 6.618262f, 3.0272284f);
        path.cubicTo(6.3503494f, 3.5870519f, 6.153556f, 3.773557f, 6.153556f, 4.1107097f);
        path.cubicTo(6.153556f, 4.447862f, 6.637872f, 4.459275f, 6.8316183f, 4.1107097f);
        path.cubicTo(6.9607825f, 3.8783329f, 7.128021f, 3.6780257f, 7.3333335f, 3.5097885f);
        path.cubicTo(7.267127f, 3.7597153f, 7.227955f, 3.9600224f, 7.2158175f, 4.1107097f);
        path.cubicTo(7.1313f, 5.1600094f, 7.0333853f, 5.729563f, 6.475542f, 6.175742f);
        path.cubicTo(5.5606623f, 6.907489f, 4.5156474f, 6.425568f, 3.9279535f, 7.5547986f);
        instancePath.lineTo(3.921f, 7.5648985f);
        instancePath.lineTo(1.545f, 8.384898f);
        instancePath.lineTo(1.4522005f, 8.348656f);
        Path path2 = instancePath;
        path2.cubicTo(0.48406687f, 7.937883f, 0.0f, 7.213578f, 0.0f, 6.175742f);
        path2.cubicTo(0.0f, 5.4317636f, 0.41251928f, 4.564253f, 1.2646699f, 4.014979f);
        path2.cubicTo(1.6622612f, 3.758702f, 1.9155201f, 3.3914943f, 2.0244462f, 2.9133556f);
        path2.cubicTo(2.2243965f, 3.250077f, 2.2763784f, 3.586172f, 2.1803916f, 3.921641f);
        path2.cubicTo(2.074524f, 4.2916446f, 1.7838714f, 4.505305f, 1.8637158f, 4.712813f);
        path2.cubicTo(1.960616f, 4.964648f, 2.4147618f, 4.8410172f, 2.6990058f, 4.2843156f);
        path2.cubicTo(2.9832501f, 3.7276144f, 3.7682161f, 3.0559525f, 5.0051017f, 2.4171264f);
        path2.cubicTo(5.502418f, 2.1602728f, 5.9627147f, 1.4869635f, 5.851485f, 0.8167271f);
        path2.cubicTo(5.8216004f, 0.63665116f, 5.685399f, 0.4117082f, 5.442881f, 0.1418983f);
        instancePath.close();
        instancePath.moveTo(4.085828f, -1.1693503E-12f);
        Path path3 = instancePath;
        path3.cubicTo(4.778302f, 0.5861553f, 5.0165734f, 1.1255864f, 4.8006415f, 1.6182934f);
        path3.cubicTo(4.6454043f, 1.9725087f, 4.3705535f, 2.1293263f, 3.9534228f, 2.3702333f);
        path3.cubicTo(3.8072813f, 2.454635f, 3.5707278f, 2.6639097f, 3.2437625f, 2.9980578f);
        path3.cubicTo(3.3767328f, 2.5688705f, 3.498392f, 2.2701557f, 3.6087408f, 2.101913f);
        path3.cubicTo(3.880797f, 1.6871237f, 4.185555f, 1.4178061f, 4.251728f, 1.0876753f);
        path3.cubicTo(4.3292665f, 0.70084727f, 4.2739663f, 0.3382888f, 4.085828f, -1.1693503E-12f);
        instancePath.close();
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
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 7.3333335f, 0.0f, 0.0f, 0.0f, 8.384898f, -1.1693503E-12f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        Path path4 = instancePath;
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.88241315f, 0.0f, 0.37488568f, 1.0f, new int[]{-669359, -57542}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        WeChatSVGRenderC2Java.setFillType(path4, 2);
        canvas.drawPath(path4, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint paint = instancePaint;
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(2.9217007f, 11.775572f);
        instancePath2.cubicTo(2.5077991f, 12.784364f, 1.9605916f, 13.9702835f, 1.280078f, 15.333333f);
        instancePath2.lineTo(0.53093463f, 15.0747595f);
        Path path5 = instancePath2;
        path5.cubicTo(1.1172732f, 12.96637f, 1.4437054f, 11.679412f, 1.5102315f, 11.213886f);
        path5.cubicTo(1.5208856f, 11.139333f, 1.5298334f, 11.059348f, 1.537075f, 10.97393f);
        instancePath2.lineTo(3.3856237f, 10.431796f);
        Path path6 = instancePath2;
        path6.cubicTo(3.253186f, 10.896628f, 3.098545f, 11.344554f, 2.9217007f, 11.775572f);
        instancePath2.close();
        instancePath2.moveTo(3.7985253f, 8.471352f);
        path6.cubicTo(3.7432952f, 8.857797f, 3.6753244f, 9.234541f, 3.5946136f, 9.6015835f);
        instancePath2.lineTo(1.5589501f, 10.197035f);
        instancePath2.cubicTo(1.5546273f, 9.89661f, 1.5383878f, 9.558248f, 1.5102315f, 9.181948f);
        instancePath2.lineTo(3.7985253f, 8.471352f);
        instancePath2.close();
        Paint instancePaint7 = C24542c.instancePaint(looper);
        instancePaint7.setFlags(385);
        instancePaint7.setStyle(Paint.Style.FILL);
        Paint instancePaint8 = C24542c.instancePaint(looper);
        instancePaint8.setFlags(385);
        instancePaint8.setStyle(Paint.Style.STROKE);
        instancePaint7.setColor(-16777216);
        instancePaint8.setStrokeWidth(1.0f);
        instancePaint8.setStrokeCap(Paint.Cap.BUTT);
        instancePaint8.setStrokeJoin(Paint.Join.MITER);
        instancePaint8.setStrokeMiter(4.0f);
        instancePaint8.setPathEffect((PathEffect) null);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, -1.0749159f, -1.8917012f, 3.667845f, 7.003099f, -1.0728444f, 5.176819f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        WeChatSVGRenderC2Java.setRadialGradient(instancePaint6, 0.61905146f, 0.063436195f, 1.9876659f, new int[]{-3355444, -5000269}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 0.530935f, 0.0f, 1.0f, 8.471351f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(2.4144638f, 3.6836178f);
        instancePath3.cubicTo(1.9336181f, 4.9279375f, 1.3785113f, 5.9873924f, 0.7491434f, 6.8619823f);
        instancePath3.lineTo(0.0f, 6.6034083f);
        Path path7 = instancePath3;
        path7.cubicTo(0.5863386f, 4.4950185f, 0.91277087f, 3.2080607f, 0.9792969f, 2.742535f);
        path7.cubicTo(0.989951f, 2.6679819f, 0.99889886f, 2.5879965f, 1.0061405f, 2.5025792f);
        instancePath3.lineTo(2.9653063f, 1.9273388f);
        instancePath3.cubicTo(2.8257303f, 2.5090787f, 2.642116f, 3.094505f, 2.4144638f, 3.6836178f);
        instancePath3.close();
        instancePath3.moveTo(3.2675908f, 0.0f);
        instancePath3.cubicTo(3.240863f, 0.36833435f, 3.1959722f, 0.73818916f, 3.1329186f, 1.1095645f);
        instancePath3.lineTo(1.0280154f, 1.7256838f);
        instancePath3.cubicTo(1.0236927f, 1.4252588f, 1.0074532f, 1.0868964f, 0.9792969f, 0.7105968f);
        instancePath3.lineTo(3.2675908f, 0.0f);
        instancePath3.close();
        Paint instancePaint10 = C24542c.instancePaint(looper);
        instancePaint10.setFlags(385);
        instancePaint10.setStyle(Paint.Style.FILL);
        Paint instancePaint11 = C24542c.instancePaint(looper);
        instancePaint11.setFlags(385);
        instancePaint11.setStyle(Paint.Style.STROKE);
        instancePaint10.setColor(-16777216);
        instancePaint11.setStrokeWidth(1.0f);
        instancePaint11.setStrokeCap(Paint.Cap.BUTT);
        instancePaint11.setStrokeJoin(Paint.Join.MITER);
        instancePaint11.setStrokeMiter(4.0f);
        instancePaint11.setPathEffect((PathEffect) null);
        float[] matrixFloatArray5 = C24542c.setMatrixFloatArray(matrixFloatArray4, -0.9246707f, -1.6272908f, 2.6984525f, 3.134031f, -0.48011994f, -1.4743714f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray5);
        WeChatSVGRenderC2Java.setRadialGradient(instancePaint9, 0.61905146f, 0.063436195f, 1.9876659f, new int[]{-3355444, -5000269}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.restore();
        canvas.save();
        Paint instancePaint12 = C24542c.instancePaint(paint, looper);
        instancePaint12.setColor(-352965);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(2.5855715f, -3.1340423f);
        Path path8 = instancePath4;
        path8.cubicTo(3.7938833f, -3.1340423f, 4.773413f, -2.1412385f, 4.773413f, -0.9165528f);
        path8.cubicTo(4.773413f, 0.3081329f, 3.7938833f, 1.3009367f, 2.5855715f, 1.3009367f);
        path8.cubicTo(1.3772599f, 1.3009367f, 0.39772987f, 0.3081329f, 0.39772987f, -0.9165528f);
        path8.cubicTo(0.39772987f, -2.1412385f, 1.3772599f, -3.1340423f, 2.5855715f, -3.1340423f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint12);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint13 = C24542c.instancePaint(paint, looper);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(5.442881f, 0.1418983f);
        Path path9 = instancePath5;
        path9.cubicTo(5.9334736f, 0.30760488f, 6.2776937f, 0.53254783f, 6.475542f, 0.8167271f);
        path9.cubicTo(6.929953f, 1.4694198f, 7.0549126f, 2.1148126f, 6.618262f, 3.0272284f);
        path9.cubicTo(6.3503494f, 3.5870519f, 6.153556f, 3.773557f, 6.153556f, 4.1107097f);
        path9.cubicTo(6.153556f, 4.447862f, 6.637872f, 4.459275f, 6.8316183f, 4.1107097f);
        path9.cubicTo(6.9607825f, 3.8783329f, 7.128021f, 3.6780257f, 7.3333335f, 3.5097885f);
        path9.cubicTo(7.267127f, 3.7597153f, 7.227955f, 3.9600224f, 7.2158175f, 4.1107097f);
        path9.cubicTo(7.1313f, 5.1600094f, 7.0333853f, 5.729563f, 6.475542f, 6.175742f);
        path9.cubicTo(5.5606623f, 6.907489f, 4.5156474f, 6.425568f, 3.9279535f, 7.5547986f);
        instancePath5.lineTo(3.921f, 7.5648985f);
        instancePath5.lineTo(1.545f, 8.384898f);
        instancePath5.lineTo(1.4522005f, 8.348656f);
        Path path10 = instancePath5;
        path10.cubicTo(0.48406687f, 7.937883f, 1.2992782E-13f, 7.213578f, 1.2992782E-13f, 6.175742f);
        path10.cubicTo(1.2992782E-13f, 5.4317636f, 0.41251928f, 4.564253f, 1.2646699f, 4.014979f);
        path10.cubicTo(1.6622612f, 3.758702f, 1.9155201f, 3.3914943f, 2.0244462f, 2.9133556f);
        path10.cubicTo(2.2243965f, 3.250077f, 2.2763784f, 3.586172f, 2.1803916f, 3.921641f);
        path10.cubicTo(2.074524f, 4.2916446f, 1.7838714f, 4.505305f, 1.8637158f, 4.712813f);
        path10.cubicTo(1.960616f, 4.964648f, 2.4147618f, 4.8410172f, 2.6990058f, 4.2843156f);
        path10.cubicTo(2.9832501f, 3.7276144f, 3.7682161f, 3.0559525f, 5.0051017f, 2.4171264f);
        path10.cubicTo(5.502418f, 2.1602728f, 5.9627147f, 1.4869635f, 5.851485f, 0.8167271f);
        path10.cubicTo(5.8216004f, 0.63665116f, 5.685399f, 0.4117082f, 5.442881f, 0.1418983f);
        instancePath5.close();
        instancePath5.moveTo(4.085828f, -1.1693503E-12f);
        Path path11 = instancePath5;
        path11.cubicTo(4.778302f, 0.5861553f, 5.0165734f, 1.1255864f, 4.8006415f, 1.6182934f);
        path11.cubicTo(4.6454043f, 1.9725087f, 4.3705535f, 2.1293263f, 3.9534228f, 2.3702333f);
        path11.cubicTo(3.8072813f, 2.454635f, 3.5707278f, 2.6639097f, 3.2437625f, 2.9980578f);
        path11.cubicTo(3.3767328f, 2.5688705f, 3.498392f, 2.2701557f, 3.6087408f, 2.101913f);
        path11.cubicTo(3.880797f, 1.6871237f, 4.185555f, 1.4178061f, 4.251728f, 1.0876753f);
        path11.cubicTo(4.3292665f, 0.70084727f, 4.2739663f, 0.3382888f, 4.085828f, -1.1693503E-12f);
        instancePath5.close();
        Paint instancePaint14 = C24542c.instancePaint(looper);
        instancePaint14.setFlags(385);
        instancePaint14.setStyle(Paint.Style.FILL);
        Paint instancePaint15 = C24542c.instancePaint(looper);
        instancePaint15.setFlags(385);
        instancePaint15.setStyle(Paint.Style.STROKE);
        instancePaint14.setColor(-16777216);
        instancePaint15.setStrokeWidth(1.0f);
        instancePaint15.setStrokeCap(Paint.Cap.BUTT);
        instancePaint15.setStrokeJoin(Paint.Join.MITER);
        instancePaint15.setStrokeMiter(4.0f);
        instancePaint15.setPathEffect((PathEffect) null);
        float[] matrixFloatArray6 = C24542c.setMatrixFloatArray(matrixFloatArray5, 7.3333335f, 0.0f, 1.2992782E-13f, 0.0f, 8.384898f, -1.1693503E-12f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray6);
        float[] fArr = matrixFloatArray6;
        Matrix matrix = instanceMatrix;
        Path path12 = instancePath5;
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint13, 0.88241315f, 0.0f, 0.37488568f, 1.0f, new int[]{-669359, -57542}, new float[]{0.0f, 1.0f}, matrix, 0);
        WeChatSVGRenderC2Java.setFillType(path12, 2);
        canvas.drawPath(path12, instancePaint13);
        canvas.restore();
        canvas.save();
        Paint instancePaint16 = C24542c.instancePaint(paint, looper);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(5.442881f, 0.1418983f);
        Path path13 = instancePath6;
        path13.cubicTo(5.9334736f, 0.30760488f, 6.2776937f, 0.53254783f, 6.475542f, 0.8167271f);
        path13.cubicTo(6.929953f, 1.4694198f, 7.0549126f, 2.1148126f, 6.618262f, 3.0272284f);
        path13.cubicTo(6.3503494f, 3.5870519f, 6.153556f, 3.773557f, 6.153556f, 4.1107097f);
        path13.cubicTo(6.153556f, 4.447862f, 6.637872f, 4.459275f, 6.8316183f, 4.1107097f);
        path13.cubicTo(6.9607825f, 3.8783329f, 7.128021f, 3.6780257f, 7.3333335f, 3.5097885f);
        path13.cubicTo(7.267127f, 3.7597153f, 7.227955f, 3.9600224f, 7.2158175f, 4.1107097f);
        path13.cubicTo(7.1313f, 5.1600094f, 7.0333853f, 5.729563f, 6.475542f, 6.175742f);
        path13.cubicTo(5.5606623f, 6.907489f, 4.5156474f, 6.425568f, 3.9279535f, 7.5547986f);
        instancePath6.lineTo(3.921f, 7.5648985f);
        instancePath6.lineTo(1.545f, 8.384898f);
        instancePath6.lineTo(1.4522005f, 8.348656f);
        Path path14 = instancePath6;
        path14.cubicTo(0.48406687f, 7.937883f, 0.0f, 7.213578f, 0.0f, 6.175742f);
        path14.cubicTo(0.0f, 5.4317636f, 0.41251928f, 4.564253f, 1.2646699f, 4.014979f);
        path14.cubicTo(1.6622612f, 3.758702f, 1.9155201f, 3.3914943f, 2.0244462f, 2.9133556f);
        path14.cubicTo(2.2243965f, 3.250077f, 2.2763784f, 3.586172f, 2.1803916f, 3.921641f);
        path14.cubicTo(2.074524f, 4.2916446f, 1.7838714f, 4.505305f, 1.8637158f, 4.712813f);
        path14.cubicTo(1.960616f, 4.964648f, 2.4147618f, 4.8410172f, 2.6990058f, 4.2843156f);
        path14.cubicTo(2.9832501f, 3.7276144f, 3.7682161f, 3.0559525f, 5.0051017f, 2.4171264f);
        path14.cubicTo(5.502418f, 2.1602728f, 5.9627147f, 1.4869635f, 5.851485f, 0.8167271f);
        path14.cubicTo(5.8216004f, 0.63665116f, 5.685399f, 0.4117082f, 5.442881f, 0.1418983f);
        instancePath6.close();
        instancePath6.moveTo(4.085828f, 0.0f);
        Path path15 = instancePath6;
        path15.cubicTo(4.778302f, 0.5861553f, 5.0165734f, 1.1255864f, 4.8006415f, 1.6182934f);
        path15.cubicTo(4.6454043f, 1.9725087f, 4.3705535f, 2.1293263f, 3.9534228f, 2.3702333f);
        path15.cubicTo(3.8072813f, 2.454635f, 3.5707278f, 2.6639097f, 3.2437625f, 2.9980578f);
        path15.cubicTo(3.3767328f, 2.5688705f, 3.498392f, 2.2701557f, 3.6087408f, 2.101913f);
        path15.cubicTo(3.880797f, 1.6871237f, 4.185555f, 1.4178061f, 4.251728f, 1.0876753f);
        path15.cubicTo(4.3292665f, 0.70084727f, 4.2739663f, 0.3382888f, 4.085828f, 0.0f);
        instancePath6.close();
        Paint instancePaint17 = C24542c.instancePaint(looper);
        instancePaint17.setFlags(385);
        instancePaint17.setStyle(Paint.Style.FILL);
        Paint instancePaint18 = C24542c.instancePaint(looper);
        instancePaint18.setFlags(385);
        instancePaint18.setStyle(Paint.Style.STROKE);
        instancePaint17.setColor(-16777216);
        instancePaint18.setStrokeWidth(1.0f);
        instancePaint18.setStrokeCap(Paint.Cap.BUTT);
        instancePaint18.setStrokeJoin(Paint.Join.MITER);
        instancePaint18.setStrokeMiter(4.0f);
        instancePaint18.setPathEffect((PathEffect) null);
        float[] matrixFloatArray7 = C24542c.setMatrixFloatArray(fArr, 7.3333335f, 0.0f, 0.0f, 0.0f, 8.384898f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray7);
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint16, 0.88241315f, 0.0f, 0.37488568f, 1.0f, new int[]{-669359, -57542}, new float[]{0.0f, 1.0f}, matrix, 0);
        WeChatSVGRenderC2Java.setFillType(instancePath6, 2);
        canvas.drawPath(instancePath6, instancePaint16);
        canvas.restore();
        canvas.save();
        Paint instancePaint19 = C24542c.instancePaint(paint, looper);
        instancePaint19.setColor(-10930);
        Path instancePath7 = C24542c.instancePath(looper);
        instancePath7.moveTo(2.3626146f, 9.957603f);
        Path path16 = instancePath7;
        path16.cubicTo(3.0951107f, 9.957603f, 2.7276635f, 9.474654f, 2.7276635f, 8.732232f);
        path16.cubicTo(2.7276635f, 7.98981f, 3.9640458f, 6.59691f, 3.2211888f, 6.2848854f);
        path16.cubicTo(2.8543675f, 6.130808f, 2.1687405f, 6.772875f, 1.8525151f, 7.458153f);
        path16.cubicTo(1.6017951f, 8.001477f, 1.4530618f, 7.670274f, 1.2985014f, 7.581913f);
        path16.cubicTo(1.026229f, 7.426257f, 0.7728528f, 6.9863963f, 0.7728528f, 7.672511f);
        path16.cubicTo(0.7728528f, 9.273545f, 1.6301188f, 9.957603f, 2.3626146f, 9.957603f);
        instancePath7.close();
        WeChatSVGRenderC2Java.setFillType(instancePath7, 2);
        canvas.drawPath(instancePath7, instancePaint19);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
