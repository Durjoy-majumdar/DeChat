package sb2;

import android.content.Intent;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.MvEnterReportStruct;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.p081mv.p082ui.uic.MusicMvMainUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C87412m;
import hb2.C59822f;
import hb2.C59829j;
import hb2.C59830o;
import hb2.C59833q;
import hb2.C59835r;
import java.util.LinkedList;
import la2.C61261g;
import la2.C99355b;
import la2.C99364n;
import ma2.C61453s;
import nb2.C61646d;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import p145dx.C58457w;
import p529fv.C59327o;
import p529fv.C59331r;
import p640ox.C77049b;
import qc0.C101093a;
import qc0.C101106m;
import sx3.C110818d0;
import te3.C51194s23;
import te3.C51635v23;
import te3.C64488kb1;
import te3.C64793w23;
import ve3.C65681f0;
import ve3.C65682g;
import ve3.C65685n0;
import wj2.C66132f;
import z04.C112551y;

/* renamed from: sb2.e */
public final class C63756e extends UIComponent implements C11385n {

    /* renamed from: A */
    public String f180729A = "";

    /* renamed from: B */
    public String f180730B = "";

    /* renamed from: C */
    public int f180731C;

    /* renamed from: D */
    public int f180732D;

    /* renamed from: E */
    public int f180733E;

    /* renamed from: F */
    public boolean f180734F;

    /* renamed from: G */
    public String f180735G = "";

    /* renamed from: H */
    public int f180736H = 2;

    /* renamed from: I */
    public LinkedList<String> f180737I = new LinkedList<>();

    /* renamed from: J */
    public LinkedList<Object> f180738J = new LinkedList<>();

    /* renamed from: d */
    public final String f180739d = "MicroMsg.Mv.MusicMvDataUIC";

    /* renamed from: e */
    public final String f180740e = "MicroMsg.Mv.GetLyric";

    /* renamed from: f */
    public Integer f180741f;

    /* renamed from: g */
    public String f180742g;

    /* renamed from: h */
    public C59822f f180743h = new C59822f();

    /* renamed from: i */
    public C64488kb1 f180744i = new C64488kb1();

    /* renamed from: j */
    public C61453s f180745j;

    /* renamed from: n */
    public boolean f180746n = true;

    /* renamed from: o */
    public long f180747o;

    /* renamed from: p */
    public String f180748p;

    /* renamed from: q */
    public C51194s23 f180749q = new C51194s23();

    /* renamed from: r */
    public boolean f180750r;

    /* renamed from: s */
    public long f180751s;

    /* renamed from: t */
    public boolean f180752t;

    /* renamed from: u */
    public int f180753u;

    /* renamed from: v */
    public C65685n0 f180754v;

    /* renamed from: w */
    public boolean f180755w;

    /* renamed from: x */
    public C51635v23 f180756x;

    /* renamed from: y */
    public boolean f180757y;

    /* renamed from: z */
    public int f180758z = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63756e(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final int mo88569c3() {
        C101106m b = C101093a.m132480b();
        String str = null;
        if (TextUtils.isEmpty(b != null ? b.f295954P : null)) {
            return 1;
        }
        C59327o oVar = (C59327o) C86312j.m106911c(C59327o.class);
        C101106m b2 = C101093a.m132480b();
        if (b2 != null) {
            str = b2.f295954P;
        }
        Integer Z30 = oVar.Z30(str);
        return ((Z30 != null && Z30.intValue() == 2) || this.f180758z == 2) ? 2 : 3;
    }

    /* renamed from: d3 */
    public final String mo88570d3() {
        String str = this.f180744i.f183905e;
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        sb.append("");
        C51635v23 v232 = this.f180756x;
        int i = 1;
        if (v232 != null && !TextUtils.isEmpty(v232.f143267d)) {
            C51635v23 v233 = this.f180756x;
            boolean z = false;
            if (v233 != null && v233.f143269f == 1) {
                z = true;
            }
            if (z) {
                i = 2;
            }
        }
        sb.append(i);
        jSONObject.putOpt(str, sb.toString());
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "obj.toString()");
        return jSONObject2;
    }

    /* renamed from: e3 */
    public final int mo88571e3() {
        return C59829j.f170804f == 0 ? 1 : 2;
    }

    /* renamed from: f3 */
    public final boolean mo88572f3(C101106m mVar) {
        if (mVar == null) {
            return false;
        }
        int i = mVar.f295959d;
        Integer num = this.f180741f;
        return num != null && i == num.intValue() && C87412m.m108589b(mVar.f295960e, this.f180742g);
    }

    /* renamed from: g3 */
    public final void mo88573g3() {
        C64488kb1 kb12 = this.f180744i;
        String str = kb12.f183910j;
        C61453s sVar = null;
        if (!(!(str == null || str.length() == 0))) {
            kb12 = null;
        }
        if (kb12 != null) {
            C61453s f = C61453s.m72164f(kb12.f183910j, getActivity().getString(C0966R.string.h3z), "", ((C59331r) C86312j.m106911c(C59331r.class)).mo84030xB(kb12.f183908h, kb12.f183906f), kb12.f183905e, false, false);
            if (f.mo86427b() > 1) {
                sVar = f;
            }
            this.f180745j = sVar;
        }
    }

    /* renamed from: i3 */
    public final void mo88574i3() {
        C66132f Nr0;
        C65682g gVar;
        Class cls = C58457w.class;
        C65685n0 n0Var = this.f180754v;
        boolean z = false;
        if (!(!(n0Var != null && n0Var.f189020d == 2) || n0Var == null || (gVar = n0Var.f189022f) == null)) {
            C65685n0 n0Var2 = this.f180754v;
            C87412m.m108591d(n0Var2);
            C66132f JW = ((C58457w) C86312j.m106911c(cls)).mo82787JW(gVar, n0Var2);
            if (JW != null) {
                JW.f190083f = this.f180754v;
            }
        }
        C65685n0 n0Var3 = this.f180754v;
        if (n0Var3 != null && n0Var3.f189020d == 1) {
            z = true;
        }
        if (z) {
            C65681f0 f0Var = n0Var3 != null ? n0Var3.f189021e : null;
            if (f0Var != null && n0Var3 != null && (Nr0 = ((C58457w) C86312j.m106911c(cls)).Nr0(0, f0Var.f188990i, n0Var3, (String) null)) != null) {
                Nr0.f190083f = n0Var3;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:95:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x027c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = r18
            super.onCreate(r19)
            android.content.Intent r1 = r18.getIntent()
            java.lang.Class<fp.e> r2 = p523fp.C32147e.class
            java.lang.String r3 = "intent"
            gy3.C87412m.m108594g(r1, r3)
            java.lang.Class<fv.q> r3 = p529fv.C59330q.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            fv.q r3 = (p529fv.C59330q) r3
            androidx.appcompat.app.AppCompatActivity r4 = r18.getActivity()
            xh.n6 r3 = r3.mo84438bp(r4)
            java.lang.String r4 = "songInfo"
            java.lang.String r5 = ""
            if (r3 == 0) goto L_0x004a
            te3.kb1 r6 = r0.f180744i
            gy3.C87412m.m108594g(r6, r4)
            java.lang.String r7 = r3.field_songName
            r6.f183904d = r7
            java.lang.String r7 = r3.field_songSinger
            r6.f183905e = r7
            java.lang.String r7 = r3.field_songWebUrl
            r6.f183908h = r7
            java.lang.String r7 = r3.field_appId
            r6.f183907g = r7
            java.lang.String r7 = r3.field_songWifiUrl
            r6.f183906f = r7
            java.lang.String r7 = r3.field_songHAlbumUrl
            r6.f183912o = r7
            java.lang.String r3 = r3.field_songLyric
            r6.f183910j = r3
            r6.f183909i = r5
        L_0x004a:
            la2.b r3 = la2.C99364n.m129618m()
            if (r3 == 0) goto L_0x0063
            boolean r7 = r3 instanceof la2.C61261g
            if (r7 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r3 = 0
        L_0x0056:
            if (r3 == 0) goto L_0x0063
            r7 = r3
            la2.g r7 = (la2.C61261g) r7
            sb2.d r8 = new sb2.d
            r8.<init>(r0, r3)
            r7.mo86252K(r8)
        L_0x0063:
            te3.kb1 r3 = r0.f180744i
            java.lang.String r3 = r3.f183907g
            java.lang.String r7 = "wx485a97c844086dc9"
            boolean r3 = gy3.C87412m.m108589b(r3, r7)
            if (r3 == 0) goto L_0x0077
            te3.kb1 r3 = r0.f180744i
            java.lang.String r7 = "wx5aa333606550dfd5"
            r3.f183907g = r7
        L_0x0077:
            java.lang.String r3 = "key_mv_music_from_shake"
            r7 = 0
            boolean r3 = r1.getBooleanExtra(r3, r7)
            r0.f180757y = r3
            java.lang.String r3 = "key_mv_audio_type"
            r8 = 1
            int r3 = r1.getIntExtra(r3, r8)
            r0.f180758z = r3
            java.lang.String r3 = "key_mv_entity_id"
            java.lang.String r3 = r1.getStringExtra(r3)
            if (r3 != 0) goto L_0x0092
            r3 = r5
        L_0x0092:
            r0.f180735G = r3
            hb2.o r3 = hb2.C59830o.f170808a
            te3.kb1 r9 = r0.f180744i
            androidx.appcompat.app.AppCompatActivity r10 = r18.getActivity()
            gy3.C87412m.m108594g(r9, r4)
            java.lang.String r11 = "activity"
            gy3.C87412m.m108594g(r10, r11)
            hb2.C59830o.f170829v = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r12 = "onMvMainUIEnter, songName:"
            r10.append(r12)
            java.lang.String r13 = r9.f183904d
            r10.append(r13)
            java.lang.String r13 = ", singer:"
            r10.append(r13)
            java.lang.String r14 = r9.f183905e
            r10.append(r14)
            java.lang.String r10 = r10.toString()
            java.lang.String r14 = "MicroMsg.Mv.MvChattingDataManger"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r15 = r9.f183904d
            if (r15 != 0) goto L_0x00d3
            r15 = r5
        L_0x00d3:
            r10.append(r15)
            r15 = 95
            r10.append(r15)
            java.lang.String r6 = r9.f183905e
            if (r6 != 0) goto L_0x00e0
            r6 = r5
        L_0x00e0:
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            boolean r10 = hb2.C59830o.f170809b
            if (r10 != 0) goto L_0x00f9
            java.lang.String r10 = hb2.C59830o.f170810c
            boolean r10 = gy3.C87412m.m108589b(r6, r10)
            r10 = r10 ^ r8
            hb2.C59830o.f170809b = r10
            if (r10 == 0) goto L_0x00f9
            r3.mo84788b()
        L_0x00f9:
            hb2.C59830o.f170828u = r8
            boolean r3 = hb2.C59830o.f170809b
            java.lang.String r10 = "onSessionStart, Not new session"
            if (r3 != 0) goto L_0x0106
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
            goto L_0x0118
        L_0x0106:
            hb2.C59830o.f170810c = r6
            hb2.C59830o.f170818k = r9
            hb2.C59830o.f170809b = r7
            jb2.t r3 = new jb2.t
            r3.<init>(r9, r8)
            ob0.b0 r6 = f40.C86709a0.m107524d()
            r6.mo123460f(r3)
        L_0x0118:
            te3.kb1 r3 = r0.f180744i
            androidx.appcompat.app.AppCompatActivity r6 = r18.getActivity()
            gy3.C87412m.m108594g(r3, r4)
            gy3.C87412m.m108594g(r6, r11)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            java.lang.String r6 = r3.f183904d
            r4.append(r6)
            r4.append(r13)
            java.lang.String r6 = r3.f183905e
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            java.lang.String r6 = "MicroMsg.Mv.MusicMvDataManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r9 = r3.f183904d
            if (r9 != 0) goto L_0x014c
            r9 = r5
        L_0x014c:
            r4.append(r9)
            r4.append(r15)
            java.lang.String r9 = r3.f183905e
            if (r9 != 0) goto L_0x0157
            goto L_0x0158
        L_0x0157:
            r5 = r9
        L_0x0158:
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            long r11 = java.lang.System.currentTimeMillis()
            boolean r5 = hb2.C59829j.f170799a
            r7 = 0
            if (r5 != 0) goto L_0x01d9
            java.lang.String r5 = hb2.C59829j.f170800b
            boolean r5 = gy3.C87412m.m108589b(r4, r5)
            r14 = 1
            r5 = r5 ^ r14
            hb2.C59829j.f170799a = r5
            if (r5 == 0) goto L_0x01a8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "onSessionEnd, songName:"
            r5.append(r9)
            te3.kb1 r9 = hb2.C59829j.f170801c
            if (r9 == 0) goto L_0x0187
            java.lang.String r9 = r9.f183904d
            goto L_0x0188
        L_0x0187:
            r9 = 0
        L_0x0188:
            r5.append(r9)
            r5.append(r13)
            te3.kb1 r9 = hb2.C59829j.f170801c
            if (r9 == 0) goto L_0x0195
            java.lang.String r9 = r9.f183905e
            goto L_0x0196
        L_0x0195:
            r9 = 0
        L_0x0196:
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            r5 = 1
            hb2.C59829j.f170799a = r5
            hb2.C59829j.f170805g = r7
            hb2.C59829j.f170806h = r7
            goto L_0x01d9
        L_0x01a8:
            long r16 = hb2.C59829j.f170806h
            int r5 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x01d9
            long r14 = r11 - r16
            int r13 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r13 <= 0) goto L_0x01ba
            long r16 = hb2.C59829j.f170805g
            long r16 = r16 + r14
            hb2.C59829j.f170805g = r16
        L_0x01ba:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r5 = "songTotalDuration:"
            r13.append(r5)
            long r7 = hb2.C59829j.f170805g
            r13.append(r7)
            java.lang.String r5 = ", playTimeInFloat:"
            r13.append(r5)
            r13.append(r14)
            java.lang.String r5 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
        L_0x01d9:
            r5 = 1
            hb2.C59829j.f170803e = r5
            boolean r5 = hb2.C59829j.f170799a
            if (r5 != 0) goto L_0x01e4
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)
            goto L_0x0207
        L_0x01e4:
            hb2.C59829j.f170800b = r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r4)
            r5.append(r4)
            r4 = 95
            r5.append(r4)
            r5.append(r11)
            java.lang.String r4 = r5.toString()
            hb2.C59829j.f170807i = r4
            hb2.C59829j.f170801c = r3
            r3 = 0
            hb2.C59829j.f170799a = r3
            hb2.C59829j.f170804f = r3
        L_0x0207:
            la2.n r3 = la2.C99364n.m129616h()
            qc0.m r3 = r3.mo138832k()
            if (r3 == 0) goto L_0x0218
            int r3 = r3.f295959d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0219
        L_0x0218:
            r3 = 0
        L_0x0219:
            r0.f180741f = r3
            la2.n r3 = la2.C99364n.m129616h()
            qc0.m r3 = r3.mo138832k()
            if (r3 == 0) goto L_0x0228
            java.lang.String r3 = r3.f295960e
            goto L_0x0229
        L_0x0228:
            r3 = 0
        L_0x0229:
            r0.f180742g = r3
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_song_name"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x024a
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x023f
            r4 = 1
            goto L_0x0240
        L_0x023f:
            r4 = 0
        L_0x0240:
            if (r4 == 0) goto L_0x0243
            goto L_0x0244
        L_0x0243:
            r3 = 0
        L_0x0244:
            if (r3 == 0) goto L_0x024a
            te3.kb1 r4 = r0.f180744i
            r4.f183904d = r3
        L_0x024a:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_song_lyric"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x0280
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x025e
            r4 = 1
            goto L_0x025f
        L_0x025e:
            r4 = 0
        L_0x025f:
            if (r4 == 0) goto L_0x0275
            te3.kb1 r4 = r0.f180744i
            java.lang.String r4 = r4.f183910j
            if (r4 == 0) goto L_0x0270
            int r4 = r4.length()
            if (r4 != 0) goto L_0x026e
            goto L_0x0270
        L_0x026e:
            r4 = 0
            goto L_0x0271
        L_0x0270:
            r4 = 1
        L_0x0271:
            if (r4 == 0) goto L_0x0275
            r4 = 1
            goto L_0x0276
        L_0x0275:
            r4 = 0
        L_0x0276:
            if (r4 == 0) goto L_0x0279
            goto L_0x027a
        L_0x0279:
            r3 = 0
        L_0x027a:
            if (r3 == 0) goto L_0x0280
            te3.kb1 r4 = r0.f180744i
            r4.f183910j = r3
        L_0x0280:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_singer_name"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x029f
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0294
            r4 = 1
            goto L_0x0295
        L_0x0294:
            r4 = 0
        L_0x0295:
            if (r4 == 0) goto L_0x0298
            goto L_0x0299
        L_0x0298:
            r3 = 0
        L_0x0299:
            if (r3 == 0) goto L_0x029f
            te3.kb1 r4 = r0.f180744i
            r4.f183905e = r3
        L_0x029f:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_album_name"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x02be
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x02b3
            r4 = 1
            goto L_0x02b4
        L_0x02b3:
            r4 = 0
        L_0x02b4:
            if (r4 == 0) goto L_0x02b7
            goto L_0x02b8
        L_0x02b7:
            r3 = 0
        L_0x02b8:
            if (r3 == 0) goto L_0x02be
            te3.kb1 r4 = r0.f180744i
            r4.f183911n = r3
        L_0x02be:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_album_cover_url"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x02dd
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x02d2
            r4 = 1
            goto L_0x02d3
        L_0x02d2:
            r4 = 0
        L_0x02d3:
            if (r4 == 0) goto L_0x02d6
            goto L_0x02d7
        L_0x02d6:
            r3 = 0
        L_0x02d7:
            if (r3 == 0) goto L_0x02dd
            te3.kb1 r4 = r0.f180744i
            r4.f183912o = r3
        L_0x02dd:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_issue_date"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x0300
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x02f1
            r4 = 1
            goto L_0x02f2
        L_0x02f1:
            r4 = 0
        L_0x02f2:
            if (r4 == 0) goto L_0x02f5
            goto L_0x02f6
        L_0x02f5:
            r3 = 0
        L_0x02f6:
            if (r3 == 0) goto L_0x0300
            te3.kb1 r4 = r0.f180744i
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r3)
            r4.f183915r = r5
        L_0x0300:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_music_genre"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x031f
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0314
            r4 = 1
            goto L_0x0315
        L_0x0314:
            r4 = 0
        L_0x0315:
            if (r4 == 0) goto L_0x0318
            goto L_0x0319
        L_0x0318:
            r3 = 0
        L_0x0319:
            if (r3 == 0) goto L_0x031f
            te3.kb1 r4 = r0.f180744i
            r4.f183913p = r3
        L_0x031f:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_identification"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x033e
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0333
            r4 = 1
            goto L_0x0334
        L_0x0333:
            r4 = 0
        L_0x0334:
            if (r4 == 0) goto L_0x0337
            goto L_0x0338
        L_0x0337:
            r3 = 0
        L_0x0338:
            if (r3 == 0) goto L_0x033e
            te3.kb1 r4 = r0.f180744i
            r4.f183917t = r3
        L_0x033e:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_extra_info"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x035d
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0352
            r4 = 1
            goto L_0x0353
        L_0x0352:
            r4 = 0
        L_0x0353:
            if (r4 == 0) goto L_0x0356
            goto L_0x0357
        L_0x0356:
            r3 = 0
        L_0x0357:
            if (r3 == 0) goto L_0x035d
            te3.kb1 r4 = r0.f180744i
            r4.f183916s = r3
        L_0x035d:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_thumb_path"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x037c
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0371
            r4 = 1
            goto L_0x0372
        L_0x0371:
            r4 = 0
        L_0x0372:
            if (r4 == 0) goto L_0x0375
            goto L_0x0376
        L_0x0375:
            r3 = 0
        L_0x0376:
            if (r3 == 0) goto L_0x037c
            te3.s23 r4 = r0.f180749q
            r4.f141283d = r3
        L_0x037c:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_music_operation_url"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x03ad
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x0390
            r4 = 1
            goto L_0x0391
        L_0x0390:
            r4 = 0
        L_0x0391:
            if (r4 == 0) goto L_0x0394
            goto L_0x0395
        L_0x0394:
            r3 = 0
        L_0x0395:
            if (r3 == 0) goto L_0x03ad
            te3.kb1 r4 = r0.f180744i
            te3.lb1 r5 = r4.f183921x
            if (r5 != 0) goto L_0x03a4
            te3.lb1 r5 = new te3.lb1
            r5.<init>()
            r4.f183921x = r5
        L_0x03a4:
            te3.kb1 r4 = r0.f180744i
            te3.lb1 r4 = r4.f183921x
            gy3.C87412m.m108591d(r4)
            r4.f184069d = r3
        L_0x03ad:
            android.content.Intent r3 = r18.getIntent()
            java.lang.String r4 = "key_mv_song_mid"
            java.lang.String r3 = r3.getStringExtra(r4)
            if (r3 == 0) goto L_0x03cc
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x03c1
            r4 = 1
            goto L_0x03c2
        L_0x03c1:
            r4 = 0
        L_0x03c2:
            if (r4 == 0) goto L_0x03c5
            goto L_0x03c6
        L_0x03c5:
            r3 = 0
        L_0x03c6:
            if (r3 == 0) goto L_0x03cc
            te3.kb1 r4 = r0.f180744i
            r4.f183922y = r3
        L_0x03cc:
            te3.kb1 r3 = r0.f180744i
            android.content.Intent r4 = r18.getIntent()
            java.lang.String r5 = "key_mv_music_duration"
            r6 = 0
            int r4 = r4.getIntExtra(r5, r6)
            r3.f183918u = r4
            java.lang.String r3 = r0.f180739d
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            te3.kb1 r5 = r0.f180744i
            java.lang.String r7 = r5.f183916s
            r4[r6] = r7
            java.lang.String r6 = r5.f183917t
            r7 = 1
            r4[r7] = r6
            te3.lb1 r6 = r5.f183921x
            if (r6 == 0) goto L_0x03f2
            java.lang.String r6 = r6.f184069d
            goto L_0x03f3
        L_0x03f2:
            r6 = 0
        L_0x03f3:
            r7 = 2
            r4[r7] = r6
            int r5 = r5.f183918u
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            r4[r6] = r5
            r5 = 4
            te3.kb1 r8 = r0.f180744i
            java.lang.String r10 = r8.f183907g
            r4[r5] = r10
            r5 = 5
            lb2.h r10 = lb2.C61275h.f174381a
            java.lang.String r8 = r10.mo86261c(r8)
            r4[r5] = r8
            java.lang.String r5 = "alvinluo checkAndFillThirdAppSongInfo ext: %s, identification: %s, operationUrl: %s, duration: %s, musicAppId: %s, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r3, r5, r4)
            java.lang.String r3 = "markTryListen"
            r4 = 0
            boolean r3 = r1.getBooleanExtra(r3, r4)
            r0.f180755w = r3
            java.lang.String r3 = "key_track_data"
            byte[] r3 = r1.getByteArrayExtra(r3)
            if (r3 == 0) goto L_0x04a2
            te3.p23 r4 = new te3.p23
            r4.<init>()
            r4.parseFrom(r3)
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r4.f184739d
            if (r3 == 0) goto L_0x0440
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r3 = r3.objectDesc
            if (r3 == 0) goto L_0x0440
            te3.hb1 r3 = r3.mvInfo
            if (r3 == 0) goto L_0x0440
            te3.kb1 r3 = r3.f183456e
            if (r3 == 0) goto L_0x0440
            r0.f180744i = r3
        L_0x0440:
            hb2.f$a r3 = hb2.C59822f.f170752A
            hb2.f r3 = r3.mo84776a(r4)
            r0.f180743h = r3
            wp1.f$a r3 = wp1.C15585f.f42211a
            long r4 = r4.f184743h
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.mo14341d(r4)
            if (r3 == 0) goto L_0x046d
            boolean r4 = r3.isPostFailed()
            if (r4 == 0) goto L_0x045d
            hb2.f r3 = r0.f180743h
            r3.f170768p = r6
            goto L_0x046d
        L_0x045d:
            boolean r3 = r3.isPostFinish()
            if (r3 != 0) goto L_0x0468
            hb2.f r3 = r0.f180743h
            r3.f170768p = r7
            goto L_0x046d
        L_0x0468:
            hb2.f r3 = r0.f180743h
            r4 = 1
            r3.f170768p = r4
        L_0x046d:
            java.lang.String r3 = r0.f180739d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "init by trackData mvLocalId:"
            r4.append(r5)
            hb2.f r5 = r0.f180743h
            java.lang.Long r5 = r5.f170753a
            r4.append(r5)
            java.lang.String r5 = " coverPath:"
            r4.append(r5)
            hb2.f r5 = r0.f180743h
            java.lang.String r5 = r5.f170754b
            r4.append(r5)
            java.lang.String r5 = " mvPostStatus:"
            r4.append(r5)
            hb2.f r5 = r0.f180743h
            int r5 = r5.f170768p
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            rx3.b0 r3 = rx3.C13598b0.f38549a
            goto L_0x04a3
        L_0x04a2:
            r3 = 0
        L_0x04a3:
            if (r3 != 0) goto L_0x057d
            java.lang.String r3 = "key_mv_feed_id"
            java.lang.String r3 = r1.getStringExtra(r3)
            java.lang.String r4 = "key_mv_nonce_id"
            java.lang.String r4 = r1.getStringExtra(r4)
            java.lang.String r5 = "key_mv_cover_url"
            java.lang.String r5 = r1.getStringExtra(r5)
            java.lang.String r6 = "key_mv_poster"
            java.lang.String r6 = r1.getStringExtra(r6)
            if (r3 == 0) goto L_0x056e
            if (r4 == 0) goto L_0x056e
            if (r5 == 0) goto L_0x056e
            if (r6 == 0) goto L_0x056e
            int r7 = r3.length()
            if (r7 <= 0) goto L_0x04cd
            r7 = 1
            goto L_0x04ce
        L_0x04cd:
            r7 = 0
        L_0x04ce:
            if (r7 == 0) goto L_0x053c
            int r7 = r4.length()
            if (r7 <= 0) goto L_0x04d8
            r7 = 1
            goto L_0x04d9
        L_0x04d8:
            r7 = 0
        L_0x04d9:
            if (r7 == 0) goto L_0x053c
            int r7 = r5.length()
            if (r7 <= 0) goto L_0x04e3
            r7 = 1
            goto L_0x04e4
        L_0x04e3:
            r7 = 0
        L_0x04e4:
            if (r7 == 0) goto L_0x053c
            int r7 = r6.length()
            if (r7 <= 0) goto L_0x04ee
            r7 = 1
            goto L_0x04ef
        L_0x04ee:
            r7 = 0
        L_0x04ef:
            if (r7 == 0) goto L_0x053c
            long r7 = o40.C61926c.m72671P(r3)
            hb2.f r10 = r0.f180743h
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r10.f170755c = r7
            hb2.f r7 = r0.f180743h
            r7.f170756d = r4
            r7.f170757e = r5
            r7.f170758f = r6
            java.lang.String r5 = "key_need_update_music_ball_url"
            r6 = 0
            boolean r5 = r1.getBooleanExtra(r5, r6)
            if (r5 == 0) goto L_0x051d
            java.lang.Class<fv.j> r5 = p529fv.C59326j.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            fv.j r5 = (p529fv.C59326j) r5
            hb2.f r6 = r0.f180743h
            java.lang.String r6 = r6.f170757e
            r5.mo84431a8(r6)
        L_0x051d:
            java.lang.String r5 = r0.f180739d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "init by feedId:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = " feedNonceId:"
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
            goto L_0x056b
        L_0x053c:
            hb2.f r7 = r0.f180743h
            r8 = 1
            r7.f170771s = r8
            java.lang.String r7 = r0.f180739d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "enter empty mv 1 "
            r8.append(r10)
            r8.append(r3)
            r3 = 32
            r8.append(r3)
            r8.append(r4)
            r8.append(r3)
            r8.append(r5)
            r8.append(r3)
            r8.append(r6)
            java.lang.String r3 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r3)
        L_0x056b:
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x056f
        L_0x056e:
            r6 = 0
        L_0x056f:
            if (r6 != 0) goto L_0x057d
            hb2.f r3 = r0.f180743h
            r4 = 1
            r3.f170771s = r4
            java.lang.String r3 = r0.f180739d
            java.lang.String r4 = "enter empty mv 2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
        L_0x057d:
            r18.mo88573g3()
            java.lang.String r3 = "key_launch_mv_comment"
            r4 = 0
            boolean r3 = r1.getBooleanExtra(r3, r4)
            r0.f180750r = r3
            java.lang.String r3 = "key_refer_mv_comment_id"
            r4 = 0
            long r3 = r1.getLongExtra(r3, r4)
            r0.f180751s = r3
            di3.d r1 = di3.C86312j.m106911c(r2)
            fp.e r1 = (p523fp.C32147e) r1
            r3 = 87
            r1.Yi0(r3)
            di3.d r1 = di3.C86312j.m106911c(r2)
            fp.e r1 = (p523fp.C32147e) r1
            r2 = 92
            r1.Yi0(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C63756e.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C59833q qVar;
        long j;
        MusicMvMainUIC musicMvMainUIC = (MusicMvMainUIC) C39818r.f106831a.mo62444c(getActivity()).mo75002a(MusicMvMainUIC.class);
        C61646d dVar = (C61646d) C110818d0.m150917O(musicMvMainUIC.f163270g, musicMvMainUIC.f163275o);
        C59822f fVar = dVar != null ? dVar.f175298d : null;
        C59833q qVar2 = C59833q.f170832a;
        AppCompatActivity activity = getActivity();
        C64488kb1 kb12 = this.f180744i;
        C99364n.m129616h().mo138822a().getPlayPosition();
        int e3 = mo88571e3();
        int c3 = mo88569c3();
        String d3 = mo88570d3();
        qVar2.getClass();
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(kb12, "songInfo");
        C64793w23 w232 = (C64793w23) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(activity, 7, C64793w23.class);
        if (w232 == null) {
            w232 = C59833q.f170834c;
        }
        MvEnterReportStruct mvEnterReportStruct = new MvEnterReportStruct();
        if (w232 != null) {
            mvEnterReportStruct.f156578d = mvEnterReportStruct.mo86045b("ContextId", w232.f186034e, true);
            mvEnterReportStruct.f156583i = (long) w232.f186033d;
            mvEnterReportStruct.f156584j = mvEnterReportStruct.mo86045b("FromSourceId", w232.f186036g, true);
            mvEnterReportStruct.f156593s = (long) w232.f186037h;
            mvEnterReportStruct.f156595u = (long) w232.f186044r;
            mvEnterReportStruct.f156597w = (long) w232.f186045s;
            mvEnterReportStruct.f156598x = (long) w232.f186046t;
            mvEnterReportStruct.f156599y = (long) w232.f186047u;
            mvEnterReportStruct.f156600z = w232.f186048v;
            if (w232.f186051y == 3) {
                mvEnterReportStruct.f156568A = 3;
            } else {
                mvEnterReportStruct.f156568A = 2;
            }
        }
        int i = C59833q.f170833b;
        if (i == 18) {
            mvEnterReportStruct.f156583i = (long) i;
            Intent intent = activity.getIntent();
            mvEnterReportStruct.f156569B = mvEnterReportStruct.mo86045b("SceneNote", intent != null ? intent.getStringExtra("key_mv_scene_note") : null, true);
            C59833q.f170833b = 0;
        }
        C59835r b = qVar2.mo84791b(activity);
        mvEnterReportStruct.f156590p = b.f170836a;
        mvEnterReportStruct.f156591q = b.f170837b;
        mvEnterReportStruct.f156592r = b.f170838c;
        String str = kb12.f183904d;
        mvEnterReportStruct.f156579e = mvEnterReportStruct.mo86045b("SongName", str != null ? C112551y.m153814n(str, ",", " ", false) : null, true);
        mvEnterReportStruct.f156582h = mvEnterReportStruct.mo86045b("AppId", kb12.f183907g, true);
        mvEnterReportStruct.f156580f = mvEnterReportStruct.mo86045b("WebUrl", kb12.f183908h, true);
        mvEnterReportStruct.f156581g = mvEnterReportStruct.mo86045b("DataUrl", kb12.f183906f, true);
        String str2 = kb12.f183910j;
        if (str2 == null || str2.length() == 0) {
            qVar = qVar2;
            j = 2;
        } else {
            qVar = qVar2;
            j = 1;
        }
        mvEnterReportStruct.f156587m = j;
        String str3 = kb12.f183909i;
        mvEnterReportStruct.f156588n = mvEnterReportStruct.mo86045b("SongId", str3 != null ? C112551y.m153814n(str3, ",", " ", false) : null, true);
        String str4 = kb12.f183905e;
        mvEnterReportStruct.f156596v = mvEnterReportStruct.mo86045b("Singer", str4 != null ? C112551y.m153814n(str4, ",", " ", false) : null, true);
        mvEnterReportStruct.f156589o = 2;
        long c = qVar.mo84792c(activity);
        mvEnterReportStruct.f156594t = c;
        mvEnterReportStruct.f156570C = (long) e3;
        mvEnterReportStruct.f156571D = (long) c3;
        mvEnterReportStruct.f156572E = mvEnterReportStruct.mo86045b("JumpType", d3, true);
        long j2 = C59829j.f170805g;
        long j3 = j2 + c;
        C59829j.f170805g = j3;
        mvEnterReportStruct.f156574G = (long) kb12.f183918u;
        mvEnterReportStruct.f156575H = j3;
        Log.m105924i("MicroMsg.Mv.MvReportLogic", "songPlayDurationSoFar:" + j3 + ", currentSongPlayDurationSoFar:" + j2 + ", playMusicTime:" + c);
        StringBuilder sb = new StringBuilder();
        sb.append("isMvWithBeat:");
        sb.append(fVar != null ? Boolean.valueOf(fVar.f170778z) : null);
        Log.m105924i("MicroMsg.Mv.MvReportLogic", sb.toString());
        mvEnterReportStruct.f156576I = 0;
        mvEnterReportStruct.f156577J = mvEnterReportStruct.mo86045b("SyncBeatFeedID", "", true);
        mvEnterReportStruct.f156573F = mvEnterReportStruct.mo86045b("PlaySameSongSessionId", C59829j.f170807i, true);
        Log.m105924i("MicroMsg.Mv.MvReportLogic", "songTotalDuration:" + kb12.f183918u + ", playMusicTime:" + c + ", syncBeatPlayDurationSoFar:" + mvEnterReportStruct.f156576I);
        Log.m105924i("MicroMsg.Mv.MvReportLogic", "struct.contextId:" + mvEnterReportStruct.f156578d + ", struct.syncBeatFeedID:" + mvEnterReportStruct.f156577J + ", playSameSongSessionId:" + mvEnterReportStruct.f156573F);
        mvEnterReportStruct.mo86054n();
        mvEnterReportStruct.mo86056r();
        C59833q.f170833b = 0;
        C59830o oVar = C59830o.f170808a;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("onMvMainUIExit, songName:");
        C64488kb1 kb13 = C59830o.f170818k;
        sb4.append(kb13 != null ? kb13.f183904d : null);
        sb4.append(", singer:");
        C64488kb1 kb14 = C59830o.f170818k;
        sb4.append(kb14 != null ? kb14.f183905e : null);
        Log.m105924i("MicroMsg.Mv.MvChattingDataManger", sb4.toString());
        C61261g gVar = null;
        C59830o.f170829v = null;
        C59830o.f170822o.clear();
        C59830o.f170823p.clear();
        C59830o.f170824q.clear();
        C59830o.f170825r.clear();
        if (2 == C59830o.f170827t) {
            Log.m105924i("MicroMsg.Mv.MvChattingDataManger", "song is stop Playing, session End");
            oVar.mo84788b();
        }
        C59830o.f170828u = false;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("onMvMainUIExit, songName:");
        C64488kb1 kb15 = C59829j.f170801c;
        sb5.append(kb15 != null ? kb15.f183904d : null);
        sb5.append(", singer:");
        C64488kb1 kb16 = C59829j.f170801c;
        sb5.append(kb16 != null ? kb16.f183905e : null);
        Log.m105924i("MicroMsg.Mv.MusicMvDataManager", sb5.toString());
        C59829j.f170806h = System.currentTimeMillis();
        if (2 == C59829j.f170802d) {
            Log.m105924i("MicroMsg.Mv.MusicMvDataManager", "song is stop Playing, session End");
            StringBuilder sb6 = new StringBuilder();
            sb6.append("onSessionEnd, songName:");
            C64488kb1 kb17 = C59829j.f170801c;
            sb6.append(kb17 != null ? kb17.f183904d : null);
            sb6.append(", singer:");
            C64488kb1 kb18 = C59829j.f170801c;
            sb6.append(kb18 != null ? kb18.f183905e : null);
            Log.m105924i("MicroMsg.Mv.MusicMvDataManager", sb6.toString());
            C59829j.f170799a = true;
            C59829j.f170805g = 0;
            C59829j.f170806h = 0;
        }
        C59829j.f170803e = false;
        C99355b m = C99364n.m129618m();
        if (m != null) {
            if (m instanceof C61261g) {
                gVar = m;
            }
            if (gVar != null) {
                gVar.mo86253w();
            }
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2 = this.f180739d;
        Log.m105924i(str2, "onSceneEnd errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scene:" + yVar);
    }
}
