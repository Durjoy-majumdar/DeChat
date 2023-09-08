package td1;

import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C7878t0;
import gy3.C87412m;
import java.math.BigInteger;
import java.util.regex.Pattern;
import md1.C10779c;
import o40.C61926c;
import te3.C51270sn1;
import te3.C51959xd1;

/* renamed from: td1.b */
public final class C13873b extends C10779c {

    /* renamed from: f */
    public final C51270sn1 f39040f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13873b(C51270sn1 sn12, AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f39040f = sn12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        r0 = r0.f141636z;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11012c() {
        /*
            r8 = this;
            te3.sn1 r0 = r8.f39040f
            if (r0 == 0) goto L_0x0010
            te3.xd1 r1 = r0.f141636z
            if (r1 == 0) goto L_0x0010
            te3.td1 r1 = r1.f144603g
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = r1.f185546s
            if (r1 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r1 = ""
        L_0x0012:
            if (r0 == 0) goto L_0x001b
            te3.xd1 r0 = r0.f141636z
            if (r0 == 0) goto L_0x001b
            long r2 = r0.f144600d
            goto L_0x001d
        L_0x001b:
            r2 = 0
        L_0x001d:
            androidx.appcompat.app.AppCompatActivity r0 = r8.f32250d
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r0, r4)
            r4 = 3
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 83
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 0
            r5[r7] = r6
            r6 = 1
            r5[r6] = r1
            java.lang.String r1 = o40.C61926c.m72691p(r2)
            r2 = 2
            r5[r2] = r1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r2 = "https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&song_id=%s=&topic_id=%s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.String r2 = "format(format, *args)"
            gy3.C87412m.m108593f(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "rawUrl"
            r2.putExtra(r3, r1)
            r1 = 0
            java.lang.String r3 = "webview"
            java.lang.String r4 = ".ui.tools.WebViewUI"
            ke3.C88144b.m109791i(r0, r3, r4, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: td1.C13873b.mo11012c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f141636z;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11013d() {
        /*
            r1 = this;
            te3.sn1 r0 = r1.f39040f
            if (r0 == 0) goto L_0x000b
            te3.xd1 r0 = r0.f141636z
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r0.f144601e
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            if (r0 == 0) goto L_0x0017
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x0018
        L_0x0017:
            r0 = 1
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: td1.C13873b.mo11013d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r4 = r2.f141636z;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11016g() {
        /*
            r14 = this;
            er1.v2$a r0 = er1.C7888v2.f26513a
            androidx.appcompat.app.AppCompatActivity r1 = r14.f32250d
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            te3.sn1 r2 = r14.f39040f
            r3 = 0
            if (r2 == 0) goto L_0x0017
            te3.xd1 r4 = r2.f141636z
            if (r4 == 0) goto L_0x0017
            java.lang.String r4 = r4.f144601e
            goto L_0x0018
        L_0x0017:
            r4 = r3
        L_0x0018:
            r5 = 15
            if (r2 == 0) goto L_0x0024
            te3.xd1 r6 = r2.f141636z
            if (r6 == 0) goto L_0x0024
            int r6 = r6.f144604h
            long r6 = (long) r6
            goto L_0x0026
        L_0x0024:
            r6 = 0
        L_0x0026:
            if (r2 == 0) goto L_0x0032
            te3.xd1 r2 = r2.f141636z
            if (r2 == 0) goto L_0x0032
            te3.td1 r2 = r2.f144603g
            if (r2 == 0) goto L_0x0032
            java.lang.String r3 = r2.f185542o
        L_0x0032:
            if (r3 != 0) goto L_0x0038
            java.lang.String r2 = ""
            r8 = r2
            goto L_0x0039
        L_0x0038:
            r8 = r3
        L_0x0039:
            java.lang.String r9 = r14.mo13202k()
            r10 = 0
            r11 = 9
            te3.bf0 r12 = r14.mo13203l()
            java.lang.String r13 = ""
            r2 = r4
            r3 = r5
            r4 = r6
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r13
            r11 = r12
            r0.mo9001A(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: td1.C13873b.mo11016g():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r4 = r2.f141636z;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11017h() {
        /*
            r14 = this;
            er1.v2$a r0 = er1.C7888v2.f26513a
            androidx.appcompat.app.AppCompatActivity r1 = r14.f32250d
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r1, r2)
            com.tencent.mm.ui.MMActivity r1 = (com.tencent.p014mm.p136ui.MMActivity) r1
            te3.sn1 r2 = r14.f39040f
            r3 = 0
            if (r2 == 0) goto L_0x0017
            te3.xd1 r4 = r2.f141636z
            if (r4 == 0) goto L_0x0017
            java.lang.String r4 = r4.f144601e
            goto L_0x0018
        L_0x0017:
            r4 = r3
        L_0x0018:
            r5 = 15
            if (r2 == 0) goto L_0x0024
            te3.xd1 r6 = r2.f141636z
            if (r6 == 0) goto L_0x0024
            int r6 = r6.f144604h
            long r6 = (long) r6
            goto L_0x0026
        L_0x0024:
            r6 = 0
        L_0x0026:
            if (r2 == 0) goto L_0x0032
            te3.xd1 r2 = r2.f141636z
            if (r2 == 0) goto L_0x0032
            te3.td1 r2 = r2.f144603g
            if (r2 == 0) goto L_0x0032
            java.lang.String r3 = r2.f185542o
        L_0x0032:
            if (r3 != 0) goto L_0x0038
            java.lang.String r2 = ""
            r8 = r2
            goto L_0x0039
        L_0x0038:
            r8 = r3
        L_0x0039:
            java.lang.String r9 = r14.mo13202k()
            r10 = 0
            r11 = 9
            te3.bf0 r12 = r14.mo13203l()
            java.lang.String r13 = ""
            r2 = r4
            r3 = r5
            r4 = r6
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r13
            r11 = r12
            r0.mo9002C(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: td1.C13873b.mo11017h():void");
    }

    /* renamed from: k */
    public final String mo13202k() {
        C51959xd1 xd12;
        String str;
        C51270sn1 sn12 = this.f39040f;
        if (sn12 == null || (xd12 = sn12.f141636z) == null) {
            return "";
        }
        String c = C7878t0.m8034c(2, xd12.f144604h);
        int i = xd12.f144605i;
        Pattern pattern = C61926c.f176038a;
        String e = C7878t0.m8036e(new BigInteger(Integer.toBinaryString(i), 2).longValue());
        if (((long) xd12.f144604h) > 0) {
            str = "" + this.f32250d.getResources().getString(C0966R.string.hdv, new Object[]{c});
        } else {
            str = "";
        }
        if (((long) xd12.f144604h) > 0 && ((long) xd12.f144605i) > 0) {
            str = str + " · ";
        }
        if (((long) xd12.f144605i) > 0) {
            str = str + this.f32250d.getResources().getString(C0966R.string.fzg, new Object[]{e});
        }
        return str == null ? "" : str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r1 = r1.f141636z;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final te3.C64258bf0 mo13203l() {
        /*
            r3 = this;
            te3.bf0 r0 = new te3.bf0
            r0.<init>()
            te3.sn1 r1 = r3.f39040f
            if (r1 == 0) goto L_0x0010
            te3.xd1 r1 = r1.f141636z
            if (r1 == 0) goto L_0x0010
            long r1 = r1.f144600d
            goto L_0x0012
        L_0x0010:
            r1 = 0
        L_0x0012:
            java.lang.String r1 = o40.C61926c.m72691p(r1)
            r0.f182280d = r1
            te3.sn1 r1 = r3.f39040f
            if (r1 == 0) goto L_0x0024
            te3.xd1 r2 = r1.f141636z
            if (r2 == 0) goto L_0x0024
            java.lang.String r2 = r2.f144601e
            if (r2 != 0) goto L_0x0026
        L_0x0024:
            java.lang.String r2 = ""
        L_0x0026:
            r0.f182281e = r2
            if (r1 == 0) goto L_0x0032
            te3.xd1 r1 = r1.f141636z
            if (r1 == 0) goto L_0x0032
            java.lang.String r1 = r1.f144601e
            if (r1 != 0) goto L_0x0041
        L_0x0032:
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r2 = 2131829257(0x7f112209, float:1.9291478E38)
            java.lang.CharSequence r1 = r1.getText(r2)
            java.lang.String r1 = r1.toString()
        L_0x0041:
            r0.f182285i = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: td1.C13873b.mo13203l():te3.bf0");
    }
}
