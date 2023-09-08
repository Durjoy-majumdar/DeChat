package com.tencent.p014mm.xeffect.effect;

import android.util.Pair;
import android.util.Size;
import com.tencent.p014mm.xeffect.XEffectLog;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import rr3.C110625c0;
import rr3.C110629f;
import rr3.C110630g;
import rr3.C110631h;
import rr3.C13101q;
import sx3.C110818d0;
import sx3.C64197v;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\b\u001b\bÆ\u0002\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H J!\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H J1\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH J9\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H J)\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH J!\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH J\u0011\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H J\u0011\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H J\u0011\u0010 \u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H J\u0019\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0014H JA\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H J#\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u0014H J\u0011\u0010)\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H J\u0019\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0010H J\u0019\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\tH J\u0019\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0014H J!\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u001d2\u0006\u00102\u001a\u000201H J\u000e\u00106\u001a\u00020\u00042\u0006\u00105\u001a\u000204J\u001f\u0010<\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u00109\u001a\u000208H\u0000¢\u0006\u0004\b:\u0010;J\u001f\u0010A\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010>\u001a\u00020=H\u0000¢\u0006\u0004\b?\u0010@J\u001f\u0010F\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bD\u0010EJ/\u0010I\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0000¢\u0006\u0004\bG\u0010HJ'\u0010L\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010P\u001a\u00020M2\u0006\u00107\u001a\u00020\u0002H\u0000¢\u0006\u0004\bN\u0010OJ\u0017\u0010S\u001a\u00020\t2\u0006\u00107\u001a\u00020\u0002H\u0000¢\u0006\u0004\bQ\u0010RJ\u0017\u0010V\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u0002H\u0000¢\u0006\u0004\bT\u0010UJ\u001f\u0010Y\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0014H\u0000¢\u0006\u0004\bW\u0010XJ'\u0010\\\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0000¢\u0006\u0004\bZ\u0010[J9\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020_0^2\u0006\u00107\u001a\u00020\u00022\u0006\u0010%\u001a\u00020]2\u0006\u0010&\u001a\u00020\u0014H\u0000¢\u0006\u0004\b`\u0010aJ\u0017\u0010e\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0002H\u0000¢\u0006\u0004\bc\u0010dJ\u001f\u0010h\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0010H\u0000¢\u0006\u0004\bf\u0010gJ\u001f\u0010k\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\tH\u0000¢\u0006\u0004\bi\u0010jJ\u001f\u0010m\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0014H\u0000¢\u0006\u0004\bl\u0010XJ+\u0010r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0nH\u0000¢\u0006\u0004\bp\u0010qJ\u0019\u0010t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010s\u001a\u00020\u0014H J\u0019\u0010v\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010u\u001a\u00020\u0014H J\u0019\u0010x\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010w\u001a\u00020\fH J\u0019\u0010y\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010u\u001a\u00020\u0014H J\u0019\u0010z\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010u\u001a\u00020\u0014H J\u0019\u0010|\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010{\u001a\u00020\fH J\u0019\u0010~\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010}\u001a\u00020\fH J,\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u00020\f2\u0007\u0010\u0001\u001a\u00020\f2\u0007\u0010\u0001\u001a\u00020\fH J\u001b\u0010\u0001\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0007\u0010\u0001\u001a\u00020\fH R\u0017\u0010\u0001\u001a\u00020\u00108\u0002XD¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, mo182094d2 = {"Lcom/tencent/mm/xeffect/effect/VLogEffectJNI;", "", "", "ptr", "Lrx3/b0;", "nDestroy", "start", "end", "nSetEffectTime", "", "centerX", "centerY", "", "scale", "rotate", "nSetEffectLayout", "", "text", "fontSize", "fontFamily", "", "italic", "bold", "nSetEffectText", "textureId", "width", "height", "nSetEffectTexture", "nSetStickerSize", "", "nGetPagSize", "nGetPagImageNum", "nGetPagDuration", "check", "nSetCheckMarker", "index", "nSetPagTemplateText", "replacementType", "checkMarker", "", "nGetPagTemplateInfo", "nGetPagFrameRate", "json", "nSetConfigJson", "scene", "nSetScene", "show", "nSetShowLandmarks", "keys", "", "values", "nSetEffectParams", "Lrr3/c0;", "effect", "destroyEffect", "nPtr", "Lrr3/h;", "timeRange", "setEffectTime$renderlib_release", "(JLrr3/h;)V", "setEffectTime", "Lrr3/f;", "layout", "setEffectLayout$renderlib_release", "(JLrr3/f;)V", "setEffectLayout", "Lrr3/g;", "textInfo", "setEffectText$renderlib_release", "(JLrr3/g;)V", "setEffectText", "setEffectTexture$renderlib_release", "(JIII)V", "setEffectTexture", "setStickerSize$renderlib_release", "(JII)V", "setStickerSize", "Landroid/util/Size;", "getPagSize$renderlib_release", "(J)Landroid/util/Size;", "getPagSize", "getPagImageNum$renderlib_release", "(J)I", "getPagImageNum", "getPagDuration$renderlib_release", "(J)J", "getPagDuration", "setCheckMarker$renderlib_release", "(JZ)V", "setCheckMarker", "setPagTemplateText$renderlib_release", "(JILrr3/g;)V", "setPagTemplateText", "Lrr3/q;", "", "Landroid/util/Pair;", "getPagTemplateInfo$renderlib_release", "(JLrr3/q;Z)Ljava/util/List;", "getPagTemplateInfo", "getPagFrameRate$renderlib_release", "(J)F", "getPagFrameRate", "setConfigJson$renderlib_release", "(JLjava/lang/String;)V", "setConfigJson", "setScene$renderlib_release", "(JI)V", "setScene", "setShowLandmarks$renderlib_release", "setShowLandmarks", "", "effectParams", "setEffectParams$renderlib_release", "(JLjava/util/Map;)V", "setEffectParams", "isPreMultiplied", "nSetEffectIsPreMultiplied", "blur", "nSetGradientBlurEffectCenterCropBlur", "ratio", "nSetGradientBlurEffectBlurMaskRatio", "nSetGradientBlurEffectBlurTop", "nSetGradientBlurEffectBlurBottom", "offset", "nSetGradientBlurEffectContentOffset", "percent", "nSetGradientBlurContentOffsetPercent", "red", "green", "blue", "nSetFadeEffectFadeBackgroundColor", "weight", "nSetLutFilterWeight", "TAG", "Ljava/lang/String;", "<init>", "()V", "renderlib_release"}, mo182095k = 1, mo182096mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.effect.VLogEffectJNI */
public final class VLogEffectJNI {
    public static final VLogEffectJNI INSTANCE = new VLogEffectJNI();
    private static final String TAG = TAG;

    private VLogEffectJNI() {
    }

    private final native void nDestroy(long j);

    private final native long nGetPagDuration(long j);

    private final native float nGetPagFrameRate(long j);

    private final native int nGetPagImageNum(long j);

    private final native int[] nGetPagSize(long j);

    private final native long[] nGetPagTemplateInfo(long j, int i, boolean z);

    private final native void nSetCheckMarker(long j, boolean z);

    private final native void nSetConfigJson(long j, String str);

    private final native void nSetEffectLayout(long j, int i, int i2, float f, float f2);

    private final native void nSetEffectParams(long j, int[] iArr, float[] fArr);

    private final native void nSetEffectText(long j, String str, float f, String str2, boolean z, boolean z2);

    private final native void nSetEffectTexture(long j, int i, int i2, int i3);

    private final native void nSetEffectTime(long j, long j2, long j3);

    private final native void nSetPagTemplateText(long j, int i, String str, float f, String str2, boolean z, boolean z2);

    private final native void nSetScene(long j, int i);

    private final native void nSetShowLandmarks(long j, boolean z);

    private final native void nSetStickerSize(long j, int i, int i2);

    public final void destroyEffect(C110625c0 c0Var) {
        C87412m.m108595h(c0Var, "effect");
        long j = c0Var.f330969c;
        if (j != 0) {
            nDestroy(j);
        }
    }

    public final long getPagDuration$renderlib_release(long j) {
        if (j == 0) {
            return 0;
        }
        return nGetPagDuration(j);
    }

    public final float getPagFrameRate$renderlib_release(long j) {
        if (j == 0) {
            return 0.0f;
        }
        return nGetPagFrameRate(j);
    }

    public final int getPagImageNum$renderlib_release(long j) {
        if (j == 0) {
            return 0;
        }
        return nGetPagImageNum(j);
    }

    public final Size getPagSize$renderlib_release(long j) {
        if (j == 0) {
            return new Size(0, 0);
        }
        int[] nGetPagSize = nGetPagSize(j);
        return new Size(nGetPagSize[0], nGetPagSize[1]);
    }

    public final List<Pair<Long, Long>> getPagTemplateInfo$renderlib_release(long j, C13101q qVar, boolean z) {
        C87412m.m108595h(qVar, "replacementType");
        ArrayList arrayList = new ArrayList();
        long[] nGetPagTemplateInfo = nGetPagTemplateInfo(j, qVar.ordinal(), z);
        if (nGetPagTemplateInfo != null) {
            int length = nGetPagTemplateInfo.length / 2;
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                arrayList.add(new Pair(Long.valueOf(nGetPagTemplateInfo[i2]), Long.valueOf(nGetPagTemplateInfo[i2 + 1])));
            }
        }
        return arrayList;
    }

    public final native void nSetEffectIsPreMultiplied(long j, boolean z);

    public final native void nSetFadeEffectFadeBackgroundColor(long j, float f, float f2, float f3);

    public final native void nSetGradientBlurContentOffsetPercent(long j, float f);

    public final native void nSetGradientBlurEffectBlurBottom(long j, boolean z);

    public final native void nSetGradientBlurEffectBlurMaskRatio(long j, float f);

    public final native void nSetGradientBlurEffectBlurTop(long j, boolean z);

    public final native void nSetGradientBlurEffectCenterCropBlur(long j, boolean z);

    public final native void nSetGradientBlurEffectContentOffset(long j, float f);

    public final native void nSetLutFilterWeight(long j, float f);

    public final void setCheckMarker$renderlib_release(long j, boolean z) {
        if (j != 0) {
            nSetCheckMarker(j, z);
        }
    }

    public final void setConfigJson$renderlib_release(long j, String str) {
        C87412m.m108595h(str, "json");
        if (j != 0) {
            nSetConfigJson(j, str);
        }
    }

    public final void setEffectLayout$renderlib_release(long j, C110629f fVar) {
        C87412m.m108595h(fVar, "layout");
        if (j != 0) {
            nSetEffectLayout(j, fVar.f330970a, fVar.f330971b, fVar.f330972c, fVar.f330973d);
        }
    }

    public final void setEffectParams$renderlib_release(long j, Map<Integer, Float> map) {
        C87412m.m108595h(map, "effectParams");
        if (j != 0) {
            int size = map.size();
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            int i = 0;
            for (T next : map.entrySet()) {
                int i2 = i + 1;
                if (i >= 0) {
                    Map.Entry entry = (Map.Entry) next;
                    iArr[i] = ((Number) entry.getKey()).intValue();
                    fArr[i] = ((Number) entry.getValue()).floatValue();
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            nSetEffectParams(j, C110818d0.m150952x0(map.keySet()), C110818d0.m150950v0(map.values()));
        }
    }

    public final void setEffectText$renderlib_release(long j, C110630g gVar) {
        C87412m.m108595h(gVar, "textInfo");
        if (j != 0) {
            nSetEffectText(j, gVar.f330974a, gVar.f330975b, gVar.f330976c, gVar.f330977d, gVar.f330978e);
        }
    }

    public final void setEffectTexture$renderlib_release(long j, int i, int i2, int i3) {
        if (j != 0) {
            nSetEffectTexture(j, i, i2, i3);
        }
    }

    public final void setEffectTime$renderlib_release(long j, C110631h hVar) {
        C87412m.m108595h(hVar, "timeRange");
        if (j != 0) {
            nSetEffectTime(j, hVar.f330979a, hVar.f330980b);
        }
    }

    public final void setPagTemplateText$renderlib_release(long j, int i, C110630g gVar) {
        C110630g gVar2 = gVar;
        C87412m.m108595h(gVar2, "textInfo");
        if (j != 0) {
            nSetPagTemplateText(j, i, gVar2.f330974a, gVar2.f330975b, gVar2.f330976c, gVar2.f330977d, gVar2.f330978e);
        }
    }

    public final void setScene$renderlib_release(long j, int i) {
        if (j != 0) {
            nSetScene(j, i);
        }
    }

    public final void setShowLandmarks$renderlib_release(long j, boolean z) {
        if (j != 0) {
            nSetShowLandmarks(j, z);
        }
    }

    public final void setStickerSize$renderlib_release(long j, int i, int i2) {
        String str = TAG;
        XEffectLog.f319986a.mo143272i(str, "setStickerSize ptr:" + j + ", width:" + i + ", height:" + i2, new Object[0]);
        if (j != 0) {
            nSetStickerSize(j, i, i2);
        }
    }
}
