package r80;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import java.nio.ByteBuffer;
import o80.C109993a;
import rx3.C13598b0;

/* renamed from: r80.i0 */
public final class C110524i0 {

    /* renamed from: a */
    public final String f330505a = "MicroMsg.RemuxerCallback";

    /* renamed from: b */
    public int f330506b;

    /* renamed from: c */
    public C110533m0 f330507c;

    /* renamed from: d */
    public C109993a f330508d;

    /* renamed from: e */
    public int f330509e;

    /* renamed from: f */
    public String f330510f = "";

    /* renamed from: g */
    public int f330511g;

    /* renamed from: h */
    public String f330512h = "";

    /* renamed from: i */
    public int f330513i;

    /* renamed from: j */
    public int f330514j;

    /* renamed from: k */
    public C32226l<? super String, C13598b0> f330515k;

    /* renamed from: l */
    public C32227p<? super ByteBuffer, ? super MediaCodec.BufferInfo, C13598b0> f330516l = new C110528d(this);

    /* renamed from: m */
    public C32228q<? super ByteBuffer, ? super MediaCodec.BufferInfo, ? super MediaFormat, C13598b0> f330517m = new C110525a(this);

    /* renamed from: n */
    public C32226l<? super C32226l<? super String, C13598b0>, C13598b0> f330518n = new C110527c(this);

    /* renamed from: o */
    public C32224a<C13598b0> f330519o = new C110526b(this);

    /* renamed from: r80.i0$a */
    public static final class C110525a extends C87413o implements C32228q<ByteBuffer, MediaCodec.BufferInfo, MediaFormat, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110524i0 f330520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110525a(C110524i0 i0Var) {
            super(3);
            this.f330520d = i0Var;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj2;
            MediaFormat mediaFormat = (MediaFormat) obj3;
            C87412m.m108594g(byteBuffer, "data");
            C87412m.m108594g(bufferInfo, "bufferInfo");
            C87412m.m108594g(mediaFormat, TPReportKeys.PlayerStep.PLAYER_FORMAT);
            C110533m0 m0Var = this.f330520d.f330507c;
            if (m0Var != null) {
                m0Var.mo161989c(byteBuffer, bufferInfo, mediaFormat);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: r80.i0$b */
    public static final class C110526b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110524i0 f330521d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110526b(C110524i0 i0Var) {
            super(0);
            this.f330521d = i0Var;
        }

        public Object invoke() {
            this.f330521d.f330509e++;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: r80.i0$c */
    public static final class C110527c extends C87413o implements C32226l<C32226l<? super String, ? extends C13598b0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110524i0 f330522d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110527c(C110524i0 i0Var) {
            super(1);
            this.f330522d = i0Var;
        }

        public Object invoke(Object obj) {
            Log.m105924i(this.f330522d.f330505a, "onEncodeEnd");
            C110524i0 i0Var = this.f330522d;
            i0Var.f330515k = (C32226l) obj;
            int i = 0;
            boolean z = i0Var.f330511g == 0;
            if (!Util.isNullOrNil(i0Var.f330510f)) {
                boolean z2 = i0Var.f330511g == 1;
                if (i0Var.f330506b > 0) {
                    C110533m0 m0Var = i0Var.f330507c;
                    if (m0Var != null) {
                        C109993a aVar = i0Var.f330508d;
                        String str = i0Var.f330510f;
                        int i2 = z2 ? 0 : i0Var.f330513i;
                        if (!z2) {
                            i = i0Var.f330514j;
                        }
                        i = m0Var.mo161987a(aVar, str, i2, i, z);
                    } else {
                        i = -1;
                    }
                    SightVideoJNI.tagRotateVideoVFS(i0Var.f330510f, i0Var.f330512h, i0Var.f330506b);
                    C86013q1.m106463x(i0Var.f330512h, i0Var.f330510f);
                } else {
                    C110533m0 m0Var2 = i0Var.f330507c;
                    if (m0Var2 != null) {
                        C109993a aVar2 = i0Var.f330508d;
                        String str2 = i0Var.f330510f;
                        int i3 = z2 ? 0 : i0Var.f330513i;
                        if (!z2) {
                            i = i0Var.f330514j;
                        }
                        i = m0Var2.mo161987a(aVar2, str2, i3, i, z);
                    } else {
                        i = -1;
                    }
                }
            }
            C94554a c = C94555d.m119567c(i0Var.f330510f, true);
            String str3 = i0Var.f330505a;
            Log.m105924i(str3, "output mediaInfo :" + c);
            String str4 = i0Var.f330505a;
            Log.m105924i(str4, "finish process, ret:" + i);
            if (i >= 0) {
                C32226l<? super String, C13598b0> lVar = i0Var.f330515k;
                if (lVar != null) {
                    lVar.invoke(i0Var.f330510f);
                }
            } else {
                C32226l<? super String, C13598b0> lVar2 = i0Var.f330515k;
                if (lVar2 != null) {
                    lVar2.invoke(null);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: r80.i0$d */
    public static final class C110528d extends C87413o implements C32227p<ByteBuffer, MediaCodec.BufferInfo, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110524i0 f330523d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110528d(C110524i0 i0Var) {
            super(2);
            this.f330523d = i0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) obj2;
            C87412m.m108594g(byteBuffer, "data");
            C87412m.m108594g(bufferInfo, "bufferInfo");
            C110533m0 m0Var = this.f330523d.f330507c;
            if (m0Var != null) {
                m0Var.mo161990e(byteBuffer, bufferInfo);
            }
            Log.m105924i("MicroMsg.TimeCost", "onFrameDraw : " + this.f330523d.f330509e);
            return C13598b0.f38549a;
        }
    }

    public C110524i0(C110533m0 m0Var, C109993a aVar, String str, int i, int i2, int i3) {
        C87412m.m108594g(m0Var, "mixMuxerController");
        C87412m.m108594g(str, "outputFilePath");
        this.f330512h = str + '_' + System.currentTimeMillis() + ".mp4";
        this.f330507c = m0Var;
        this.f330508d = aVar;
        this.f330510f = str;
        this.f330513i = i2;
        this.f330514j = i3;
        this.f330511g = i;
    }
}
