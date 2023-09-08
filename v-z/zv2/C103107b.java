package zv2;

import android.graphics.Point;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.story.proxy.StoryCaptureProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import lc3.C10485b;
import p156gj.C107835h0;
import p625nu.C100196e;
import p625nu.C61903f;
import p682rz.C36594q;
import yv2.C102968a;

/* renamed from: zv2.b */
public final class C103107b extends C102968a<C103108a> {

    /* renamed from: b */
    public static final C103107b f304215b = new C103107b();

    /* renamed from: zv2.b$a */
    public static final class C103108a {

        /* renamed from: a */
        public int f304216a;

        /* renamed from: b */
        public int f304217b;

        /* renamed from: c */
        public int f304218c;

        /* renamed from: d */
        public int f304219d;

        /* renamed from: e */
        public int f304220e;

        /* renamed from: f */
        public int f304221f;

        /* renamed from: g */
        public int f304222g;

        /* renamed from: h */
        public int f304223h;

        /* renamed from: i */
        public int f304224i;

        /* renamed from: j */
        public int f304225j;

        /* renamed from: k */
        public boolean f304226k;

        /* renamed from: l */
        public int f304227l;

        /* renamed from: m */
        public int f304228m;

        /* renamed from: n */
        public int f304229n;

        /* renamed from: o */
        public float f304230o;

        /* renamed from: p */
        public VideoTransPara f304231p;

        public C103108a() {
            this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, 0, 0.0f, 32767, (C8480h) null);
        }

        public C103108a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, boolean z, int i16, int i17, int i18, float f, int i19, C8480h hVar) {
            int i25 = i19;
            int i26 = 0;
            int i27 = (i25 & 1) != 0 ? 0 : i;
            int i28 = (i25 & 2) != 0 ? 0 : i2;
            int i29 = (i25 & 4) != 0 ? 0 : i3;
            int i35 = (i25 & 8) != 0 ? 0 : i4;
            int i36 = (i25 & 16) != 0 ? 0 : i5;
            int i37 = (i25 & 32) != 0 ? 0 : i6;
            int i38 = (i25 & 64) != 0 ? 0 : i7;
            int i39 = (i25 & 128) != 0 ? 0 : i8;
            int i44 = (i25 & 256) != 0 ? 0 : i9;
            int i45 = (i25 & 512) != 0 ? 0 : i15;
            boolean z2 = (i25 & 1024) != 0 ? false : z;
            int i46 = (i25 & 2048) != 0 ? 0 : i16;
            i26 = (i25 & 4096) == 0 ? i17 : i26;
            int i47 = (i25 & 8192) != 0 ? 2 : i18;
            float f2 = (i25 & 16384) != 0 ? 1.3f : f;
            this.f304216a = i27;
            this.f304217b = i28;
            this.f304218c = i29;
            this.f304219d = i35;
            this.f304220e = i36;
            this.f304221f = i37;
            this.f304222g = i38;
            this.f304223h = i39;
            this.f304224i = i44;
            this.f304225j = i45;
            this.f304226k = z2;
            this.f304227l = i46;
            this.f304228m = i26;
            this.f304229n = i47;
            this.f304230o = f2;
            this.f304231p = new VideoTransPara();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C103108a)) {
                return false;
            }
            C103108a aVar = (C103108a) obj;
            return this.f304216a == aVar.f304216a && this.f304217b == aVar.f304217b && this.f304218c == aVar.f304218c && this.f304219d == aVar.f304219d && this.f304220e == aVar.f304220e && this.f304221f == aVar.f304221f && this.f304222g == aVar.f304222g && this.f304223h == aVar.f304223h && this.f304224i == aVar.f304224i && this.f304225j == aVar.f304225j && this.f304226k == aVar.f304226k && this.f304227l == aVar.f304227l && this.f304228m == aVar.f304228m && this.f304229n == aVar.f304229n && C87412m.m108589b(Float.valueOf(this.f304230o), Float.valueOf(aVar.f304230o));
        }

        public int hashCode() {
            int i = ((((((((((((((((((this.f304216a * 31) + this.f304217b) * 31) + this.f304218c) * 31) + this.f304219d) * 31) + this.f304220e) * 31) + this.f304221f) * 31) + this.f304222g) * 31) + this.f304223h) * 31) + this.f304224i) * 31) + this.f304225j) * 31;
            boolean z = this.f304226k;
            if (z) {
                z = true;
            }
            return ((((((((i + (z ? 1 : 0)) * 31) + this.f304227l) * 31) + this.f304228m) * 31) + this.f304229n) * 31) + Float.floatToIntBits(this.f304230o);
        }

        public String toString() {
            return "EncodeConfig(targetWidth=" + this.f304216a + ", targetHeight=" + this.f304217b + ", videoBitrate=" + this.f304218c + ", audioBitrate=" + this.f304219d + ", frameRate=" + this.f304220e + ", videoRotate=" + this.f304221f + ", duration=" + this.f304222g + ", iFrame=" + this.f304223h + ", profileIndex=" + this.f304224i + ", presetIndex=" + this.f304225j + ", isDefault=" + this.f304226k + ", thumbSize=" + this.f304227l + ", audioSampleRate=" + this.f304228m + ", recorderType=" + this.f304229n + ", exceedVideoBitrateTolerance=" + this.f304230o + ')';
        }
    }

    /* renamed from: g */
    public Object mo137402g() {
        return new C103108a(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, 0, 0.0f, 32767, (C8480h) null);
    }

    /* renamed from: h */
    public void mo137403h() {
        VideoTransPara videoTransPara;
        Class cls = C100196e.class;
        C103108a aVar = (C103108a) mo138762e();
        if (MMApplicationContext.isMMProcess()) {
            videoTransPara = ((C36594q) C86312j.m106911c(C36594q.class)).ai0();
            C87412m.m108593f(videoTransPara, "getService(IVideoControl…getStoryRecordVideoPara()");
        } else {
            StoryCaptureProxy storyCaptureProxy = StoryCaptureProxy.f249114g;
            if (storyCaptureProxy != null) {
                videoTransPara = storyCaptureProxy.getVideoPara();
            } else {
                C87412m.m108603p("instance");
                throw null;
            }
        }
        C87412m.m108594g(videoTransPara, "<set-?>");
        aVar.f304231p = videoTransPara;
        VideoTransPara videoTransPara2 = ((C103108a) mo138762e()).f304231p;
        ((C103108a) mo138762e()).f304216a = videoTransPara2.f267166d;
        int i = videoTransPara2.f267166d;
        Point h = C85875k4.m106184h(MMApplicationContext.getContext());
        ((C103108a) mo138762e()).f304217b = (h.y * i) / h.x;
        if (((C103108a) mo138762e()).f304217b % 16 != 0) {
            ((C103108a) mo138762e()).f304217b = ((C100196e) C86312j.m106911c(cls)).mo139317f3(((C103108a) mo138762e()).f304217b);
        }
        if (((C103108a) mo138762e()).f304216a % 16 != 0) {
            ((C103108a) mo138762e()).f304216a = ((C100196e) C86312j.m106911c(cls)).mo139317f3(((C103108a) mo138762e()).f304216a);
        }
        ((C103108a) mo138762e()).f304231p.f267166d = ((C103108a) mo138762e()).f304216a;
        ((C103108a) mo138762e()).f304231p.f267167e = ((C103108a) mo138762e()).f304217b;
        ((C103108a) mo138762e()).f304218c = videoTransPara2.f267169g;
        ((C103108a) mo138762e()).f304219d = videoTransPara2.f267173n;
        ((C103108a) mo138762e()).f304220e = videoTransPara2.f267168f;
        ((C103108a) mo138762e()).f304223h = videoTransPara2.f267172j;
        ((C103108a) mo138762e()).f304222g = videoTransPara2.f267170h;
        ((C103108a) mo138762e()).f304225j = videoTransPara2.f267177r;
        ((C103108a) mo138762e()).f304224i = videoTransPara2.f267176q;
        ((C103108a) mo138762e()).f304226k = videoTransPara2.f267178s;
        ((C103108a) mo138762e()).f304227l = videoTransPara2.f267179t;
        ((C103108a) mo138762e()).f304228m = videoTransPara2.f267174o;
        ((C103108a) mo138762e()).f304230o = MMApplicationContext.isMMProcess() ? Util.getFloat(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("StoryCheckSendVideoBitrateLimit"), 1.3f) : Util.getFloat(((C61903f) C86312j.m106911c(C61903f.class)).x00().getDynamicConfig("StoryCheckSendVideoBitrateLimit"), 1.3f);
        if (C107835h0.f322853j.f322652a != -1) {
            ((C103108a) mo138762e()).f304229n = C107835h0.f322853j.f322652a;
        }
        if (WeChatEnvironment.hasDebugger()) {
            ((C103108a) mo138762e()).f304229n = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_TOP_STORY_ENCODER_TYPE_INT, 2);
        }
        Log.m105924i("MicroMsg.StoryEncodeElementConfig", "loadConfigFromVideoParam: " + mo138762e());
    }
}
