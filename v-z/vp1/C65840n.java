package vp1;

import com.tencent.p014mm.protocal.protobuf.FinderMedia;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.LinkedList;
import p823sg.C101614i;
import rx3.C13598b0;
import te3.C50296lq0;
import te3.C50435mq0;
import te3.C64450iq0;
import te3.C64475jq0;
import te3.C64477jr2;
import te3.C64689rq2;
import te3.C64771vf1;
import te3.C64850yb1;
import te3.zr4;

/* renamed from: vp1.n */
public final class C65840n {

    /* renamed from: a */
    public static final C101614i<String, String> f189341a = new C101614i<>(200);

    /* renamed from: a */
    public static final String m77565a(String str) {
        Object obj;
        if (str == null) {
            return "";
        }
        C101614i<String, String> iVar = f189341a;
        synchronized (iVar) {
            obj = iVar.get(str);
            C13598b0 b0Var = C13598b0.f38549a;
        }
        if (obj == null) {
            obj = MD5Util.getMD5String(Util.nullAs(str, ""));
            synchronized (iVar) {
                iVar.mo139557c(str, obj);
            }
        }
        String str2 = (String) obj;
        return str2 == null ? "" : str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r3 = r2.f185248P;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.util.Size m77566b(te3.C64689rq2 r2, boolean r3) {
        /*
            java.lang.String r0 = "<this>"
            gy3.C87412m.m108594g(r2, r0)
            if (r3 != 0) goto L_0x0033
            te3.iq0 r3 = r2.f185248P
            if (r3 == 0) goto L_0x0033
            float r0 = r3.f183719f
            float r1 = r3.f183717d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0033
            float r0 = r3.f183720g
            float r1 = r3.f183718e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0033
            android.util.Size r2 = new android.util.Size
            float r0 = r3.f183719f
            float r1 = r3.f183717d
            float r0 = r0 - r1
            int r0 = iy3.C60641c.m70921b(r0)
            float r1 = r3.f183720g
            float r3 = r3.f183718e
            float r1 = r1 - r3
            int r3 = iy3.C60641c.m70921b(r1)
            r2.<init>(r0, r3)
            return r2
        L_0x0033:
            android.util.Size r3 = new android.util.Size
            float r0 = r2.f185270h
            int r0 = (int) r0
            float r2 = r2.f185271i
            int r2 = (int) r2
            r3.<init>(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: vp1.C65840n.m77566b(te3.rq2, boolean):android.util.Size");
    }

    /* renamed from: c */
    public static final LinkedList<C64689rq2> m77567c(LinkedList<FinderMedia> linkedList) {
        C87412m.m108594g(linkedList, "<this>");
        LinkedList<C64689rq2> linkedList2 = new LinkedList<>();
        for (FinderMedia d : linkedList) {
            linkedList2.add(m77568d(d));
        }
        return linkedList2;
    }

    /* renamed from: d */
    public static final C64689rq2 m77568d(FinderMedia finderMedia) {
        LinkedList<C64850yb1> linkedList;
        LinkedList<C50296lq0> linkedList2;
        C87412m.m108594g(finderMedia, "<this>");
        C64689rq2 rq22 = new C64689rq2();
        String str = finderMedia.url;
        rq22.f185266d = str;
        rq22.f185267e = finderMedia.thumbUrl;
        rq22.f185268f = finderMedia.mediaType;
        rq22.f185269g = finderMedia.videoDuration;
        rq22.f185270h = finderMedia.width;
        rq22.f185271i = finderMedia.height;
        rq22.f185272j = finderMedia.md5sum;
        rq22.f185273n = finderMedia.fileSize;
        rq22.f185274o = finderMedia.bitrate;
        rq22.f185260V0 = finderMedia.live_cover_imgs;
        rq22.f185275p = m77565a(str);
        C64771vf1 vf12 = finderMedia.scaling_info;
        if (vf12 != null) {
            C64771vf1 vf13 = new C64771vf1();
            vf13.f185881d = vf12.f185881d;
            vf13.f185882e = vf12.f185882e;
            vf13.f185883f = vf12.f185883f;
            vf13.f185884g = vf12.f185884g;
            vf13.f185885h = vf12.f185885h;
            rq22.f185276p0 = vf13;
        }
        C64450iq0 iq02 = finderMedia.half_rect;
        if (iq02 != null) {
            C64477jr2 jr22 = new C64477jr2();
            zr4 zr4 = new zr4();
            zr4.f186847d = (int) iq02.f183717d;
            zr4.f186848e = (int) iq02.f183718e;
            zr4.f186849f = (int) iq02.f183719f;
            zr4.f186850g = (int) iq02.f183720g;
            jr22.f183830d = zr4;
            rq22.f185281u = jr22;
        }
        rq22.f185238E = ((long) finderMedia.videoDuration) * 1000;
        rq22.f185282v = finderMedia.spec;
        rq22.f185283w = finderMedia.coverUrl;
        rq22.f185261W = finderMedia.full_cover_url;
        rq22.f185284x = finderMedia.decodeKey;
        rq22.f185257U = finderMedia.hot_flag;
        rq22.f185286y = finderMedia.url_token;
        rq22.f185288z = finderMedia.thumb_url_token;
        rq22.f185234A = finderMedia.cover_url_token;
        rq22.f185236C = finderMedia.codec_info;
        rq22.f185239F = finderMedia.full_thumb_url;
        rq22.f185240G = finderMedia.full_thumb_url_token;
        rq22.f185248P = finderMedia.half_rect;
        rq22.f185285x0 = m77565a(finderMedia.thumbUrl);
        rq22.f185287y0 = m77565a(finderMedia.coverUrl);
        rq22.f185256T0 = finderMedia.card_show_style;
        C50435mq0 mq02 = finderMedia.hls_spec;
        if (!(mq02 == null || (linkedList2 = mq02.f138150d) == null)) {
            rq22.f185264Y.addAll(linkedList2);
        }
        C64475jq0 jq02 = finderMedia.hdr_spec;
        if (!(jq02 == null || (linkedList = jq02.f183817d) == null)) {
            rq22.f185265Z.addAll(linkedList);
        }
        return rq22;
    }
}
