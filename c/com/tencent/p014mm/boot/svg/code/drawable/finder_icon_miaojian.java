package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icon_miaojian */
public class finder_icon_miaojian extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
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
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(16.348555f, 12.799092f);
                Path path = instancePath2;
                path.cubicTo(16.342684f, 12.74922f, 16.342684f, 12.74922f, 16.336014f, 12.699682f);
                path.cubicTo(16.303434f, 12.465599f, 16.250753f, 12.234824f, 16.178398f, 12.010095f);
                path.cubicTo(16.16259f, 11.96178f, 16.16259f, 11.96178f, 16.14575f, 11.91312f);
                path.cubicTo(16.123219f, 11.848694f, 16.099066f, 11.784815f, 16.0732f, 11.721278f);
                path.cubicTo(16.034607f, 11.626345f, 15.992115f, 11.532303f, 15.945775f, 11.439275f);
                path.cubicTo(15.899429f, 11.346236f, 15.849263f, 11.25446f, 15.7955265f, 11.164422f);
                path.cubicTo(15.7592125f, 11.103638f, 15.72151f, 11.04398f, 15.682463f, 10.985555f);
                path.cubicTo(15.58294f, 10.836676f, 15.473501f, 10.693494f, 15.354364f, 10.556642f);
                instancePath2.lineTo(14.259884f, 9.299305f);
                instancePath2.cubicTo(13.441234f, 8.358824f, 13.557642f, 6.9429364f, 14.517672f, 6.1438427f);
                instancePath2.lineTo(15.081129f, 5.6749086f);
                Path path2 = instancePath2;
                path2.cubicTo(15.104784f, 5.655214f, 15.127757f, 5.6345625f, 15.149867f, 5.6131606f);
                path2.cubicTo(15.171174f, 5.592145f, 15.171174f, 5.592145f, 15.191983f, 5.5701876f);
                path2.cubicTo(15.21201f, 5.548333f, 15.21201f, 5.548333f, 15.231733f, 5.5252886f);
                path2.cubicTo(15.24088f, 5.51435f, 15.24088f, 5.51435f, 15.2499275f, 5.503161f);
                path2.cubicTo(15.26791f, 5.480281f, 15.26791f, 5.480281f, 15.285226f, 5.4566317f);
                path2.cubicTo(15.302091f, 5.432826f, 15.302091f, 5.432826f, 15.317861f, 5.408883f);
                path2.cubicTo(15.333037f, 5.385f, 15.333037f, 5.385f, 15.347306f, 5.360831f);
                path2.cubicTo(15.361588f, 5.336089f, 15.3749695f, 5.310797f, 15.387071f, 5.2857604f);
                path2.cubicTo(15.399728f, 5.2594757f, 15.411071f, 5.233593f, 15.421147f, 5.208011f);
                path2.cubicTo(15.431231f, 5.1817985f, 15.431231f, 5.1817985f, 15.440262f, 5.155908f);
                path2.cubicTo(15.452372f, 5.120014f, 15.462586f, 5.084128f, 15.470999f, 5.0478578f);
                path2.cubicTo(15.483586f, 4.993795f, 15.492186f, 4.938867f, 15.496739f, 4.8834686f);
                path2.cubicTo(15.498757f, 4.8561625f, 15.498757f, 4.8561625f, 15.499854f, 4.8300705f);
                path2.cubicTo(15.500314f, 4.8135343f, 15.500314f, 4.8135343f, 15.500507f, 4.800204f);
                path2.cubicTo(15.500846f, 4.7633963f, 15.499367f, 4.7263427f, 15.496168f, 4.690269f);
                path2.cubicTo(15.493622f, 4.662111f, 15.490091f, 4.634264f, 15.485683f, 4.607398f);
                path2.cubicTo(15.48071f, 4.5785947f, 15.48071f, 4.5785947f, 15.475382f, 4.5527215f);
                path2.cubicTo(15.465346f, 4.506362f, 15.452652f, 4.461218f, 15.437212f, 4.4171515f);
                path2.cubicTo(15.389651f, 4.2811155f, 15.315909f, 4.15395f, 15.217227f, 4.0405746f);
                path2.cubicTo(14.815203f, 3.5787609f, 14.115158f, 3.4902985f, 13.589898f, 3.8433166f);
                path2.cubicTo(13.10088f, 4.1508255f, 12.101827f, 4.92324f, 11.027184f, 5.831243f);
                path2.cubicTo(9.791084f, 6.87563f, 8.752372f, 7.851078f, 8.52011f, 8.173771f);
                path2.cubicTo(8.490862f, 8.210814f, 8.490862f, 8.210814f, 8.464741f, 8.244831f);
                path2.cubicTo(8.433402f, 8.286421f, 8.433402f, 8.286421f, 8.402573f, 8.328904f);
                path2.cubicTo(8.362305f, 8.384723f, 8.323252f, 8.441872f, 8.285656f, 8.499933f);
                path2.cubicTo(8.257755f, 8.543502f, 8.257755f, 8.543502f, 8.230467f, 8.587658f);
                path2.cubicTo(8.159002f, 8.704409f, 8.09345f, 8.824584f, 8.034196f, 8.947316f);
                path2.cubicTo(8.012126f, 8.993563f, 8.012126f, 8.993563f, 7.9909196f, 9.039904f);
                path2.cubicTo(7.949108f, 9.13229f, 7.9107428f, 9.226215f, 7.8757634f, 9.32179f);
                path2.cubicTo(7.841201f, 9.416114f, 7.810003f, 9.512171f, 7.7822185f, 9.609674f);
                path2.cubicTo(7.763763f, 9.674511f, 7.746993f, 9.739424f, 7.7317996f, 9.804932f);
                path2.cubicTo(7.7166476f, 9.869945f, 7.703119f, 9.935329f, 7.691173f, 10.001265f);
                path2.cubicTo(7.6791735f, 10.067453f, 7.6688094f, 10.133648f, 7.6601133f, 10.19965f);
                path2.cubicTo(7.507468f, 11.36053f, 7.8528705f, 12.532615f, 8.645578f, 13.443341f);
                instancePath2.lineTo(9.740116f, 14.700688f);
                instancePath2.cubicTo(10.558778f, 15.641183f, 10.442348f, 17.05708f, 9.4823f, 17.856134f);
                instancePath2.lineTo(8.9188f, 18.325142f);
                Path path3 = instancePath2;
                path3.cubicTo(8.4174795f, 18.742414f, 8.357599f, 19.470907f, 8.782819f, 19.959415f);
                path3.cubicTo(8.875686f, 20.066092f, 8.984854f, 20.153997f, 9.108724f, 20.222439f);
                path3.cubicTo(9.119329f, 20.228277f, 9.119329f, 20.228277f, 9.132618f, 20.235266f);
                path3.cubicTo(9.2275095f, 20.28478f, 9.329012f, 20.32167f, 9.434563f, 20.345108f);
                path3.cubicTo(9.449634f, 20.348408f, 9.449634f, 20.348408f, 9.46284f, 20.351057f);
                path3.cubicTo(9.492527f, 20.35669f, 9.492527f, 20.35669f, 9.52029f, 20.361065f);
                path3.cubicTo(9.53588f, 20.363327f, 9.53588f, 20.363327f, 9.549995f, 20.365164f);
                path3.cubicTo(9.578909f, 20.368565f, 9.578909f, 20.368565f, 9.608612f, 20.371126f);
                path3.cubicTo(9.676822f, 20.376503f, 9.745599f, 20.376284f, 9.813682f, 20.37049f);
                path3.cubicTo(9.853067f, 20.367115f, 9.891968f, 20.361942f, 9.930653f, 20.35491f);
                path3.cubicTo(9.998305f, 20.342665f, 10.064805f, 20.324787f, 10.129699f, 20.301321f);
                path3.cubicTo(10.157192f, 20.29114f, 10.157192f, 20.29114f, 10.184575f, 20.27993f);
                path3.cubicTo(10.257686f, 20.249397f, 10.327742f, 20.211733f, 10.410124f, 20.156662f);
                path3.cubicTo(10.898957f, 19.849298f, 11.897792f, 19.07703f, 12.972806f, 18.168758f);
                path3.cubicTo(14.208881f, 17.124348f, 15.247569f, 16.148884f, 15.480127f, 15.825814f);
                path3.cubicTo(15.543108f, 15.746457f, 15.602127f, 15.66653f, 15.657121f, 15.586049f);
                path3.cubicTo(15.695903f, 15.529306f, 15.733329f, 15.471437f, 15.769637f, 15.4120865f);
                path3.cubicTo(15.796299f, 15.3681555f, 15.796299f, 15.3681555f, 15.822004f, 15.32412f);
                path3.cubicTo(15.856494f, 15.264404f, 15.889289f, 15.204283f, 15.920337f, 15.1438465f);
                path3.cubicTo(15.997954f, 14.992702f, 16.066021f, 14.8372345f, 16.12413f, 14.678624f);
                path3.cubicTo(16.147432f, 14.614889f, 16.169008f, 14.551106f, 16.188978f, 14.486871f);
                path3.cubicTo(16.228874f, 14.358807f, 16.262466f, 14.228769f, 16.289675f, 14.097167f);
                path3.cubicTo(16.343939f, 13.834913f, 16.37246f, 13.567983f, 16.374832f, 13.300266f);
                path3.cubicTo(16.375742f, 13.200563f, 16.372946f, 13.100247f, 16.366472f, 12.999552f);
                path3.cubicTo(16.362127f, 12.93247f, 16.356173f, 12.865768f, 16.348555f, 12.799092f);
                instancePath2.close();
                instancePath2.moveTo(17.624783f, 13.311509f);
                Path path4 = instancePath2;
                path4.cubicTo(17.621689f, 13.660442f, 17.584501f, 14.008489f, 17.513767f, 14.3503475f);
                path4.cubicTo(17.47831f, 14.521844f, 17.434484f, 14.691496f, 17.382519f, 14.858304f);
                path4.cubicTo(17.356554f, 14.941821f, 17.32842f, 15.024988f, 17.297983f, 15.108239f);
                path4.cubicTo(17.222078f, 15.315424f, 17.133392f, 15.517987f, 17.032244f, 15.714954f);
                path4.cubicTo(16.991745f, 15.793786f, 16.949133f, 15.871903f, 16.90434f, 15.949458f);
                path4.cubicTo(16.870428f, 16.007555f, 16.870428f, 16.007555f, 16.8357f, 16.064783f);
                path4.cubicTo(16.788681f, 16.141642f, 16.739819f, 16.217192f, 16.689148f, 16.291328f);
                path4.cubicTo(16.61719f, 16.396637f, 16.5405f, 16.500496f, 16.477617f, 16.578533f);
                path4.cubicTo(16.179562f, 16.994225f, 15.102211f, 18.005999f, 13.779546f, 19.123573f);
                path4.cubicTo(12.663156f, 20.066803f, 11.625873f, 20.8688f, 11.091719f, 21.204304f);
                path4.cubicTo(10.957291f, 21.294758f, 10.814821f, 21.371353f, 10.667109f, 21.433039f);
                path4.cubicTo(10.610605f, 21.45615f, 10.610605f, 21.45615f, 10.554483f, 21.47693f);
                path4.cubicTo(10.423886f, 21.524157f, 10.289652f, 21.560244f, 10.153766f, 21.584835f);
                path4.cubicTo(10.076682f, 21.598852f, 9.998775f, 21.60921f, 9.920044f, 21.615955f);
                path4.cubicTo(9.783683f, 21.627562f, 9.64659f, 21.628f, 9.510462f, 21.617266f);
                path4.cubicTo(9.452553f, 21.612274f, 9.452553f, 21.612274f, 9.394028f, 21.605396f);
                path4.cubicTo(9.364708f, 21.601578f, 9.364708f, 21.601578f, 9.336441f, 21.597471f);
                path4.cubicTo(9.277716f, 21.58821f, 9.277716f, 21.58821f, 9.221963f, 21.57763f);
                path4.cubicTo(9.191126f, 21.57142f, 9.191126f, 21.57142f, 9.1634f, 21.565342f);
                path4.cubicTo(8.951603f, 21.51831f, 8.746754f, 21.443861f, 8.554691f, 21.343643f);
                path4.cubicTo(8.528258f, 21.32975f, 8.528258f, 21.32975f, 8.50205f, 21.315344f);
                path4.cubicTo(8.253115f, 21.177813f, 8.029293f, 20.997585f, 7.8399954f, 20.780138f);
                path4.cubicTo(6.9537263f, 19.761957f, 7.0796833f, 18.229576f, 8.11914f, 17.364391f);
                instancePath2.lineTo(8.68265f, 16.895374f);
                instancePath2.cubicTo(9.104564f, 16.544212f, 9.154887f, 15.932221f, 8.797289f, 15.521406f);
                instancePath2.lineTo(7.702741f, 14.264048f);
                Path path5 = instancePath2;
                path5.cubicTo(6.67292f, 13.080907f, 6.2217894f, 11.550042f, 6.4208026f, 10.036529f);
                path5.cubicTo(6.4321585f, 9.950338f, 6.4456387f, 9.864242f, 6.461209f, 9.778356f);
                path5.cubicTo(6.4768324f, 9.692122f, 6.494561f, 9.606437f, 6.5142727f, 9.521862f);
                path5.cubicTo(6.5339866f, 9.436863f, 6.555907f, 9.3520155f, 6.580024f, 9.267288f);
                path5.cubicTo(6.616224f, 9.140252f, 6.6569023f, 9.015005f, 6.7019935f, 8.891949f);
                path5.cubicTo(6.74749f, 8.767637f, 6.7975426f, 8.645099f, 6.8521485f, 8.524443f);
                path5.cubicTo(6.8796945f, 8.464248f, 6.8796945f, 8.464248f, 6.9083753f, 8.40415f);
                path5.cubicTo(6.9857717f, 8.243841f, 7.0711913f, 8.087245f, 7.164489f, 7.9348245f);
                path5.cubicTo(7.1995378f, 7.878106f, 7.1995378f, 7.878106f, 7.2361326f, 7.8209624f);
                path5.cubicTo(7.285333f, 7.74498f, 7.3362155f, 7.6705194f, 7.388171f, 7.5985007f);
                path5.cubicTo(7.4285398f, 7.5428843f, 7.4285398f, 7.5428843f, 7.4695845f, 7.4884152f);
                path5.cubicTo(7.505978f, 7.4410343f, 7.505978f, 7.4410343f, 7.5223355f, 7.4214125f);
                path5.cubicTo(7.8203874f, 7.0057254f, 8.897762f, 5.9939694f, 10.220443f, 4.8764296f);
                path5.cubicTo(11.336425f, 3.9334974f, 12.373952f, 3.131337f, 12.908319f, 2.795663f);
                path5.cubicTo(13.938164f, 2.1028185f, 15.342073f, 2.280226f, 16.160063f, 3.2198665f);
                path5.cubicTo(16.363226f, 3.4532807f, 16.517328f, 3.7190218f, 16.617033f, 4.0042114f);
                path5.cubicTo(16.649538f, 4.0969753f, 16.676214f, 4.1918416f, 16.697222f, 4.2888885f);
                path5.cubicTo(16.709248f, 4.3472886f, 16.709248f, 4.3472886f, 16.719088f, 4.4043894f);
                path5.cubicTo(16.728506f, 4.4617867f, 16.735834f, 4.5195885f, 16.741182f, 4.5787525f);
                path5.cubicTo(16.748066f, 4.6563363f, 16.751167f, 4.734087f, 16.75045f, 4.8122187f);
                path5.cubicTo(16.750025f, 4.8413877f, 16.750025f, 4.8413877f, 16.749222f, 4.8697987f);
                path5.cubicTo(16.746838f, 4.927623f, 16.746838f, 4.927623f, 16.742535f, 4.9859204f);
                path5.cubicTo(16.732977f, 5.102198f, 16.714901f, 5.2176456f, 16.688557f, 5.3307915f);
                path5.cubicTo(16.671024f, 5.406391f, 16.64968f, 5.4813743f, 16.624249f, 5.556748f);
                path5.cubicTo(16.605186f, 5.6114793f, 16.605186f, 5.6114793f, 16.584127f, 5.6662436f);
                path5.cubicTo(16.56271f, 5.7206197f, 16.53907f, 5.7745614f, 16.512903f, 5.8289003f);
                path5.cubicTo(16.487158f, 5.882167f, 16.459494f, 5.934455f, 16.429424f, 5.9865465f);
                path5.cubicTo(16.399366f, 6.0375056f, 16.399366f, 6.0375056f, 16.367346f, 6.0879116f);
                path5.cubicTo(16.333944f, 6.138599f, 16.333944f, 6.138599f, 16.299582f, 6.1870995f);
                path5.cubicTo(16.263702f, 6.2360806f, 16.263702f, 6.2360806f, 16.225658f, 6.2844725f);
                path5.cubicTo(16.206871f, 6.307726f, 16.206871f, 6.307726f, 16.187515f, 6.330883f);
                path5.cubicTo(16.147852f, 6.377208f, 16.147852f, 6.377208f, 16.1063f, 6.42255f);
                path5.cubicTo(16.06419f, 6.466993f, 16.06419f, 6.466993f, 16.019566f, 6.5110054f);
                path5.cubicTo(15.974884f, 6.5542545f, 15.928723f, 6.595751f, 15.88084f, 6.6356177f);
                instancePath2.lineTo(15.317319f, 7.1046057f);
                instancePath2.cubicTo(14.895431f, 7.45577f, 14.845114f, 8.067773f, 15.20272f, 8.478598f);
                instancePath2.lineTo(16.297178f, 9.7359085f);
                Path path6 = instancePath2;
                path6.cubicTo(16.451115f, 9.912735f, 16.592743f, 10.098032f, 16.72169f, 10.290927f);
                path6.cubicTo(16.77255f, 10.367028f, 16.821527f, 10.444526f, 16.868753f, 10.523576f);
                path6.cubicTo(16.93882f, 10.640976f, 17.004168f, 10.760526f, 17.064646f, 10.881933f);
                path6.cubicTo(17.125065f, 11.003227f, 17.180605f, 11.126148f, 17.231054f, 11.250245f);
                path6.cubicTo(17.264698f, 11.332885f, 17.296246f, 11.416326f, 17.325474f, 11.499902f);
                path6.cubicTo(17.347313f, 11.563012f, 17.347313f, 11.563012f, 17.368158f, 11.626728f);
                path6.cubicTo(17.462791f, 11.920647f, 17.531574f, 12.2219515f, 17.5741f, 12.527514f);
                path6.cubicTo(17.58289f, 12.59278f, 17.58289f, 12.59278f, 17.590528f, 12.657666f);
                path6.cubicTo(17.60043f, 12.744324f, 17.608206f, 12.831455f, 17.613869f, 12.918928f);
                path6.cubicTo(17.62232f, 13.050296f, 17.62597f, 13.181222f, 17.624783f, 13.311509f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}