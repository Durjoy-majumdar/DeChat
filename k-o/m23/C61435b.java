package m23;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fy3.C32229r;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import ob0.C11385n;
import ob0.C117747y;
import p914oj.C110052b;
import pe3.C47465a;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C49722hm;
import te3.C64368fm;

/* renamed from: m23.b */
public final class C61435b implements C11385n {

    /* renamed from: v */
    public static long f174677v;

    /* renamed from: d */
    public C32229r<? super Integer, ? super String, ? super Integer, ? super ArrayList<C64368fm>, C13598b0> f174678d;

    /* renamed from: e */
    public C61436q f174679e;

    /* renamed from: f */
    public C110052b f174680f;

    /* renamed from: g */
    public ArrayList<C64368fm> f174681g = new ArrayList<>();

    /* renamed from: h */
    public ByteBuffer f174682h;

    /* renamed from: i */
    public String f174683i = "";

    /* renamed from: j */
    public int f174684j;

    /* renamed from: n */
    public boolean f174685n;

    /* renamed from: o */
    public boolean f174686o = true;

    /* renamed from: p */
    public boolean f174687p;

    /* renamed from: q */
    public int f174688q;

    /* renamed from: r */
    public int f174689r = 2;

    /* renamed from: s */
    public int f174690s = 44100;

    /* renamed from: t */
    public int f174691t = 1;

    /* renamed from: u */
    public volatile boolean f174692u;

    public C61435b() {
        C86709a0.m107529k().f251779b.mo123455a(3835, this);
    }

    /* renamed from: a */
    public final void mo86404a(int i, C89349b bVar, int i2, int i3) {
        int i4 = this.f174684j;
        C61436q qVar = this.f174679e;
        Integer num = null;
        C61436q qVar2 = new C61436q(i, bVar, i2, i3, i4, qVar != null ? qVar.f174695f : null);
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(hashCode());
        sb.append("]do voiceTransLate vid:");
        C89349b bVar2 = qVar2.f174695f;
        sb.append(bVar2 != null ? bVar2.mo123704g("UTF-8") : null);
        sb.append(" seq:");
        sb.append(i2);
        sb.append(" size:");
        if (bVar != null) {
            num = Integer.valueOf(bVar.f257327a.length);
        }
        sb.append(num);
        sb.append(" offset:");
        sb.append(i3);
        Log.m105924i("MicroMsg.EditCaptionDataManager", sb.toString());
        String str = this.f174683i;
        C87412m.m108594g(str, "<set-?>");
        qVar2.f174699j = str;
        this.f174679e = qVar2;
        C86709a0.m107529k().f251779b.mo123460f(this.f174679e);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        C87412m.m108592e(yVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.ui.plugin.caption.NetSceneGetVideoCaption");
        C61436q qVar = (C61436q) yVar2;
        if (C87412m.m108589b(qVar.f174699j, this.f174683i) && !this.f174692u) {
            Log.m105924i("MicroMsg.EditCaptionDataManager", '[' + hashCode() + "]onSceneEnd errType:" + i3 + " errCode:" + i4 + " errMsg:" + str);
            int i5 = qVar.f174693d;
            if (i3 == 0 && i4 == 0) {
                this.f174681g = qVar.f174697h;
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                sb.append(hashCode());
                sb.append("]scene seq:");
                sb.append(qVar.f174694e);
                sb.append(" isLastRequest:");
                sb.append(qVar.f174698i);
                sb.append(" progress:");
                C47465a aVar = qVar.f174696g.f127056b.f127083a;
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
                sb.append(((C49722hm) aVar).f134722e);
                Log.m105924i("MicroMsg.EditCaptionDataManager", sb.toString());
                Iterator<C64368fm> it = this.f174681g.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    C64368fm next = it.next();
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        C64368fm fmVar = next;
                        Log.m105924i("MicroMsg.EditCaptionDataManager", '[' + hashCode() + "]result" + i6 + ": start:" + fmVar.f183149e + " end:" + fmVar.f183150f + " text:" + fmVar.f183148d.mo123704g("UTF-8"));
                        if (qVar.f174698i) {
                            C47465a aVar2 = qVar.f174696g.f127056b.f127083a;
                            C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
                            if (((C49722hm) aVar2).f134722e >= 100) {
                                long j = f174677v + 1;
                                f174677v = j;
                                fmVar.f183152h = j;
                            }
                        }
                        i6 = i7;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                Log.m105924i("MicroMsg.EditCaptionDataManager", "\n");
                if (qVar.f174698i) {
                    C47465a aVar3 = qVar.f174696g.f127056b.f127083a;
                    C87412m.m108592e(aVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
                    if (((C49722hm) aVar3).f134722e >= 100) {
                        this.f174687p = false;
                        C32229r<? super Integer, ? super String, ? super Integer, ? super ArrayList<C64368fm>, C13598b0> rVar = this.f174678d;
                        if (rVar != null) {
                            rVar.mo162I(Integer.valueOf(i5), this.f174683i, Integer.valueOf(this.f174681g.isEmpty() ^ true ? 0 : -2), this.f174681g);
                            return;
                        }
                        return;
                    }
                    C32229r<? super Integer, ? super String, ? super Integer, ? super ArrayList<C64368fm>, C13598b0> rVar2 = this.f174678d;
                    if (rVar2 != null) {
                        rVar2.mo162I(Integer.valueOf(i5), this.f174683i, 0, this.f174681g);
                    }
                    Log.m105924i("MicroMsg.EditCaptionDataManager", '[' + hashCode() + "]repeat query voice data");
                    C61436q qVar2 = this.f174679e;
                    C87412m.m108591d(qVar2);
                    mo86404a(i5, (C89349b) null, qVar2.f174694e, 0);
                }
            } else if (qVar.f174698i) {
                this.f174688q = -1;
                this.f174687p = false;
                C32229r<? super Integer, ? super String, ? super Integer, ? super ArrayList<C64368fm>, C13598b0> rVar3 = this.f174678d;
                if (rVar3 != null) {
                    rVar3.mo162I(Integer.valueOf(i5), this.f174683i, -1, null);
                }
                this.f174686o = true;
            }
        }
    }
}
