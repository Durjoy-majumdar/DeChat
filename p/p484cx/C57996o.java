package p484cx;

import a14.C53895h;
import a14.C53934p0;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import ck2.C54873a;
import ck2.C54878c;
import ck2.C54883d0;
import ck2.C54885e0;
import ck2.C54913i0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import nj2.C61759g;
import p145dx.C58448m;
import p145dx.C58449n;
import p145dx.C58453t;
import p145dx.C58454u;
import p145dx.C58455v;
import p145dx.C58457w;
import qo3.C89779i0;
import sj2.C13683d;
import sj2.C63924f;
import ve3.C65681f0;
import ve3.C65682g;
import ve3.C65684l0;
import ve3.C65685n0;
import wj2.C66132f;
import wj2.C66135h;
import wx3.C15601d;
import wx3.C66212f;

@C86522b
/* renamed from: cx.o */
public final class C57996o extends C86301e implements C58457w {
    /* renamed from: Bt */
    public C58449n mo82784Bt(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(RingtoneDataUIC.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…gtoneDataUIC::class.java)");
        return (C58449n) a;
    }

    public void Fo0(Context context) {
        C87412m.m108594g(context, "context");
        RingtoneDataUIC ringtoneDataUIC = (RingtoneDataUIC) C39818r.f106831a.mo62443b(context).mo75002a(RingtoneDataUIC.class);
        C61759g.C61760a.m72462b(C61759g.f175551f, ringtoneDataUIC.getActivity(), ringtoneDataUIC.f164071d, ringtoneDataUIC.f164073f, ringtoneDataUIC.f164072e, true, (C66132f) null, 32, (Object) null);
    }

    /* renamed from: Iv */
    public C58448m mo82786Iv(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C54873a.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…eDataFlowUIC::class.java)");
        return (C58448m) a;
    }

    /* renamed from: JW */
    public C66132f mo82787JW(C65682g gVar, C65685n0 n0Var) {
        C87412m.m108594g(gVar, "detail");
        C87412m.m108594g(n0Var, "info");
        return C66135h.f190107E.mo90189e(gVar, n0Var);
    }

    /* renamed from: KG */
    public void mo82788KG(Activity activity, int i, String str, int i2, boolean z, C66132f fVar) {
        C87412m.m108594g(activity, "context");
        C87412m.m108594g(str, "username");
        C61759g.f175551f.mo86678a(activity, i, str, i2, z, fVar);
    }

    public C66132f Nr0(long j, long j2, C65685n0 n0Var, String str) {
        C87412m.m108594g(n0Var, "rawDetail");
        return C66135h.f190107E.mo90191g(j, j2, n0Var, str);
    }

    public C58453t Pp0(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C54883d0.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…gtonePlayUIC::class.java)");
        return (C58453t) a;
    }

    /* renamed from: Pu */
    public void mo82791Pu(Context context, int i) {
        C87412m.m108594g(context, "context");
        C61759g.f175551f.mo86679c(context, i);
    }

    public C13683d R10(int i) {
        return C63924f.f181198b.mo88701a(i);
    }

    /* renamed from: VA */
    public C58454u mo82793VA(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C54885e0.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…earchDataUIC::class.java)");
        return (C58454u) a;
    }

    /* renamed from: b8 */
    public void mo82794b8(Context context, C66132f fVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(fVar, "info");
        RingtoneDataUIC ringtoneDataUIC = (RingtoneDataUIC) C39818r.f106831a.mo62443b(context).mo75002a(RingtoneDataUIC.class);
        ringtoneDataUIC.getClass();
        Intent intent = new Intent();
        intent.putExtra("exclusvie_name", ringtoneDataUIC.f164073f);
        C65685n0 n0Var = fVar.f190083f;
        if (n0Var != null) {
            C65684l0 l0Var = new C65684l0();
            l0Var.f189016e = 0;
            int i = n0Var.f189020d;
            int i2 = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            if (i == 1) {
                C65681f0 f0Var = n0Var.f189021e;
                if (f0Var != null) {
                    i2 = (int) f0Var.f188990i;
                }
                l0Var.f189017f = i2;
            } else {
                l0Var.f189017f = CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            }
            C65682g gVar = n0Var.f189022f;
            l0Var.f189019h = gVar != null ? gVar.f188994d : null;
            C65681f0 f0Var2 = n0Var.f189021e;
            l0Var.f189018g = f0Var2 != null ? f0Var2.f188985d : null;
            l0Var.f189015d = i;
            C89779i0 e = C89779i0.m112248e(ringtoneDataUIC.getContext(), ringtoneDataUIC.getContext().getResources().getString(C0966R.string.in7), false, 3, (DialogInterface.OnCancelListener) null);
            e.show();
            C53895h.m60466d(ringtoneDataUIC.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54878c(l0Var, ringtoneDataUIC, fVar, e, intent, (C15601d<? super C54878c>) null), 3, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r5 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0047, code lost:
        if (r5 != null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String m10(com.tencent.p014mm.protocal.protobuf.FinderObject r8) {
        /*
            r7 = this;
            java.lang.String r0 = "finderObj"
            gy3.C87412m.m108594g(r8, r0)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r1 = 2131829767(0x7f112407, float:1.9292512E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "getContext().getString(R.string.finder_resource)"
            gy3.C87412m.m108593f(r0, r1)
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r1 = r8.objectDesc
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x007d
            te3.l93 r1 = r1.originalsound_info
            if (r1 == 0) goto L_0x007d
            java.lang.String r5 = r1.f137266d
            if (r5 == 0) goto L_0x0036
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x002c
            r6 = 1
            goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            if (r6 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r5 = r2
        L_0x0031:
            if (r5 == 0) goto L_0x0036
        L_0x0033:
            r0 = r5
            goto L_0x00a7
        L_0x0036:
            java.lang.String r5 = r1.f137269g
            if (r5 == 0) goto L_0x004a
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x0042
            r6 = 1
            goto L_0x0043
        L_0x0042:
            r6 = 0
        L_0x0043:
            if (r6 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r5 = r2
        L_0x0047:
            if (r5 == 0) goto L_0x004a
            goto L_0x0033
        L_0x004a:
            java.lang.String r5 = r1.f137267e
            java.lang.String r1 = r1.f137268f
            if (r5 == 0) goto L_0x007d
            if (r1 == 0) goto L_0x007d
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x005a
            r6 = 1
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 == 0) goto L_0x007d
            int r6 = r1.length()
            if (r6 <= 0) goto L_0x0065
            r6 = 1
            goto L_0x0066
        L_0x0065:
            r6 = 0
        L_0x0066:
            if (r6 == 0) goto L_0x007d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            java.lang.String r0 = " - "
            r8.append(r0)
            r8.append(r1)
            java.lang.String r0 = r8.toString()
            goto L_0x00a7
        L_0x007d:
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.contact
            if (r8 == 0) goto L_0x00a7
            java.lang.String r8 = r8.nickname
            if (r8 == 0) goto L_0x00a7
            int r1 = r8.length()
            if (r1 <= 0) goto L_0x008d
            r1 = 1
            goto L_0x008e
        L_0x008d:
            r1 = 0
        L_0x008e:
            if (r1 == 0) goto L_0x0091
            r2 = r8
        L_0x0091:
            if (r2 == 0) goto L_0x00a7
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r0 = 2131834877(0x7f1137fd, float:1.9302877E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r2
            java.lang.String r0 = r8.getString(r0, r1)
            java.lang.String r8 = "getContext().getString(R…tone_finder_resource, it)"
            gy3.C87412m.m108593f(r0, r8)
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p484cx.C57996o.m10(com.tencent.mm.protocal.protobuf.FinderObject):java.lang.String");
    }

    /* renamed from: mh */
    public C58455v mo82796mh(AppCompatActivity appCompatActivity) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C54913i0.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…ectReportUIC::class.java)");
        return (C58455v) a;
    }
}
