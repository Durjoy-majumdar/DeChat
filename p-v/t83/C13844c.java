package t83;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import gy3.C87412m;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C51254sj2;
import te3.C51405tj2;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: t83.c */
public abstract class C13844c {

    /* renamed from: a */
    public static boolean f38985a = true;

    /* renamed from: t83.c$a */
    public static final class C13845a extends C89132b<C51405tj2> {
        public C13845a(int i, String str, String str2, String str3, int i2) {
            C51254sj2 sj22 = new C51254sj2();
            sj22.f141558d = i;
            sj22.f141559e = str;
            sj22.f141560f = str2;
            sj22.f141561g = str3;
            sj22.f141562h = i2;
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = sj22;
            bVar.f127067b = new C51405tj2();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/jsapi-moduseuserinfo";
            bVar.f127069d = 4810;
            mo123453j(bVar.mo72403a());
        }

        /* renamed from: h */
        public void mo10094h(int i, int i2, String str, C49335eu3 eu32, C117747y yVar) {
            C51405tj2 tj22 = (C51405tj2) eu32;
            C47465a aVar = this.f256789f.f127055a.f127080a;
            if (aVar instanceof C51254sj2) {
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.JSAPIModUseUserInfoRequest");
                C51254sj2 sj22 = (C51254sj2) aVar;
                if ((BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) && C13844c.f38985a && i == 0 && i2 == 0) {
                    C119179t tVar = C119157j.f356862d;
                    C13842b bVar = new C13842b("Mod信息发送后台成功！参数：scene_type = " + sj22.f141558d + ", appId = " + sj22.f141559e + ", jsapi_name = " + sj22.f141560f + ", scope = " + sj22.f141561g + ", state = " + sj22.f141562h + ' ');
                    C119157j jVar = (C119157j) tVar;
                    jVar.getClass();
                    jVar.mo183892w(bVar, 300, false);
                }
            }
        }
    }
}
