package x61;

import com.tencent.p014mm.plugin.emojicapture.proxy.EmojiCaptureProxy;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tavkit.component.TAVExporter;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import l80.C99347c;
import lc3.C10485b;

/* renamed from: x61.a */
public final class C102566a extends C99347c<C102567a> {

    /* renamed from: b */
    public static final C102566a f302002b = new C102566a();

    /* renamed from: c */
    public static boolean f302003c = true;

    /* renamed from: x61.a$a */
    public static final class C102567a {

        /* renamed from: a */
        public int f302004a;

        /* renamed from: b */
        public boolean f302005b;

        /* renamed from: c */
        public int f302006c;

        /* renamed from: d */
        public int f302007d;

        /* renamed from: e */
        public boolean f302008e;

        public C102567a() {
            this(0, false, 0, 0, false, 31, (C8480h) null);
        }

        public C102567a(int i, boolean z, int i2, int i3, boolean z2, int i4, C8480h hVar) {
            i = (i4 & 1) != 0 ? 1080 : i;
            z = (i4 & 2) != 0 ? false : z;
            i2 = (i4 & 4) != 0 ? 640 : i2;
            i3 = (i4 & 8) != 0 ? 1 : i3;
            z2 = (i4 & 16) != 0 ? false : z2;
            this.f302004a = i;
            this.f302005b = z;
            this.f302006c = i2;
            this.f302007d = i3;
            this.f302008e = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C102567a)) {
                return false;
            }
            C102567a aVar = (C102567a) obj;
            return this.f302004a == aVar.f302004a && this.f302005b == aVar.f302005b && this.f302006c == aVar.f302006c && this.f302007d == aVar.f302007d && this.f302008e == aVar.f302008e;
        }

        public int hashCode() {
            int i = this.f302004a * 31;
            boolean z = this.f302005b;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (((((i + (z ? 1 : 0)) * 31) + this.f302006c) * 31) + this.f302007d) * 31;
            boolean z3 = this.f302008e;
            if (!z3) {
                z2 = z3;
            }
            return i2 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "CameraPreviewConfig(resolution=" + this.f302004a + ", useCpuCrop=" + this.f302005b + ", previewSize=" + this.f302006c + ", stickerSampleSize=" + this.f302007d + ", useCameraApi2=" + this.f302008e + ')';
        }
    }

    /* renamed from: f */
    public int mo138763f(String str, int i) {
        C87412m.m108594g(str, "key");
        if (MMApplicationContext.isMMProcess()) {
            return Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c(str), i);
        }
        EmojiCaptureProxy.C93278a aVar = EmojiCaptureProxy.f269148h;
        return Util.getInt(EmojiCaptureProxy.f269149i.getDynamicConfig(str), i);
    }

    /* renamed from: g */
    public Object mo137402g() {
        return new C102567a(0, false, 0, 0, false, 31, (C8480h) null);
    }

    /* renamed from: h */
    public void mo137403h() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_EMOJI_SPRING_FESTIVAL_CROP_TYPE_INT;
        boolean z = false;
        ((C102567a) mo138762e()).f302005b = false;
        if (WeChatEnvironment.hasDebugger()) {
            if (MMApplicationContext.isMMProcess()) {
                C102567a aVar2 = (C102567a) mo138762e();
                if (C86709a0.m107535s().mo121142i().mo119689j(aVar, 1) == 0) {
                    z = true;
                }
                aVar2.f302005b = z;
            } else {
                C102567a aVar3 = (C102567a) mo138762e();
                EmojiCaptureProxy.C93278a aVar4 = EmojiCaptureProxy.f269148h;
                if (EmojiCaptureProxy.f269149i.getInt(aVar, 1) == 0) {
                    z = true;
                }
                aVar3.f302005b = z;
            }
        }
        if (((C102567a) mo138762e()).f302005b) {
            ((C102567a) mo138762e()).f302004a = TAVExporter.VIDEO_EXPORT_WIDTH;
        } else {
            ((C102567a) mo138762e()).f302004a = 1080;
        }
        Log.m105924i("MicroMsg.EmojiCameraElementConfig", "config resolution:" + ((C102567a) mo138762e()).f302004a + ", useCpuCrop:" + ((C102567a) mo138762e()).f302005b);
    }
}
