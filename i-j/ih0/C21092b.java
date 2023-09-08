package ih0;

import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.pointers.PString;
import com.tencent.p014mm.protocal.protobuf.FinderTipsShowEntranceExtInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C75592q0;
import gt1.C20838b;
import ht1.C60200t1;
import ky2.C10432i;
import lh0.C34262g;
import o40.C61926c;
import o40.C61937h;
import org.json.JSONException;
import org.json.JSONObject;
import p749xh.C66277w3;
import te3.C64586nn1;
import zs0.C91932a;

/* renamed from: ih0.b */
public class C21092b {

    /* renamed from: a */
    public static C21092b f59646a;

    /* renamed from: i */
    public static C21092b m23349i() {
        if (f59646a == null) {
            f59646a = new C21092b();
        }
        return f59646a;
    }

    /* renamed from: a */
    public int mo32848a() {
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        MultiProcessMMKV b = vx02.f92371i.mo33601b();
        if (b == null) {
            return 0;
        }
        return b.getInt("finder_deep_read_count", 0);
    }

    /* renamed from: b */
    public int mo32849b() {
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        MultiProcessMMKV b = vx02.f92371i.mo33601b();
        if (b == null) {
            return 0;
        }
        return b.getInt("finder_drop_reddot_count", 0);
    }

    /* renamed from: c */
    public C66277w3 mo32850c() {
        return ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77227G5("FinderLiveEntrance");
    }

    /* renamed from: d */
    public C64586nn1 mo32851d(C66277w3 w3Var) {
        if (w3Var != null) {
            return ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76748EK(w3Var, "FinderLiveEntrance");
        }
        return null;
    }

    /* renamed from: e */
    public boolean mo32852e(C64586nn1 nn12, PInt pInt) {
        try {
            pInt.value = m23349i().mo32862p(nn12).optInt("live_sub_recall_type", 0);
            return true;
        } catch (Exception | JSONException unused) {
            return false;
        }
    }

    /* renamed from: f */
    public C66277w3 mo32853f() {
        return ((C60200t1) C86312j.m106911c(C60200t1.class)).Nt0().mo77227G5("FinderEntrance");
    }

    /* renamed from: g */
    public C64586nn1 mo32854g(C66277w3 w3Var) {
        if (w3Var != null) {
            return ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76748EK(w3Var, "FinderEntrance");
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo32855h(C64586nn1 nn12, PInt pInt, PString pString) {
        try {
            JSONObject p = m23349i().mo32862p(nn12);
            pInt.value = p.optInt("push_type", 0);
            pString.value = p.optString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "");
            return true;
        } catch (Exception | JSONException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public long mo32856j() {
        return ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76847gA();
    }

    /* renamed from: k */
    public long mo32857k() {
        return ((C60200t1) C86312j.m106911c(C60200t1.class)).Gj0();
    }

    /* renamed from: l */
    public long mo32858l() {
        C34262g vx02 = C34262g.vx0();
        vx02.requireAccountInitialized();
        return vx02.f92371i.mo33600a("rece_finder_reddot_ms", 0);
    }

    /* renamed from: m */
    public String mo32859m(String str) {
        C64586nn1 EK;
        Class cls = C60200t1.class;
        try {
            C55718s0 G5 = ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77227G5(str);
            if (G5 == null || (EK = ((C60200t1) C86312j.m106911c(cls)).mo76748EK(G5, str)) == null || EK.f184512q == null) {
                return "";
            }
            FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = G5.field_tipsShowEntranceExtInfo;
            if (finderTipsShowEntranceExtInfo == null) {
                finderTipsShowEntranceExtInfo = new FinderTipsShowEntranceExtInfo();
            }
            JSONObject h = C61937h.m72709h(finderTipsShowEntranceExtInfo);
            h.put("object_id", C61926c.m72691p(finderTipsShowEntranceExtInfo.object_id));
            return String.format("{\"tipsid\":\"%s\";\"ctrltype\":%d;\"showtype\":%d;\"expose_count\":%d;\"first_expose_time\":%d;\"rece_time\":%d;\"redDotShowInfoExt\":%s}", new Object[]{G5.field_tipsId, Integer.valueOf(G5.field_ctrType), Integer.valueOf(EK.f184502d), Integer.valueOf(EK.f184512q.f186604d), Long.valueOf(EK.f184512q.f186606f), Long.valueOf(G5.field_time), h.toString().replace(",", ";")});
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: n */
    public boolean mo32860n() {
        Class cls = C10432i.class;
        boolean sF = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF();
        boolean z = !((C75592q0.m90781k() & 34359738368L) != 0);
        boolean z2 = ((C10432i) C86312j.m106911c(cls)).mo10750e() && ((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 2;
        Log.m105925i("MicroMsg.AiFinderData", "[isShowFinderEntrance] show:%s open:%s, isTeenModeAndNothing:%s", Boolean.valueOf(sF), Boolean.valueOf(z), Boolean.valueOf(z2));
        return sF && z && !z2;
    }

    /* renamed from: o */
    public boolean mo32861o() {
        boolean e = ((C10432i) C86312j.m106911c(C10432i.class)).mo10750e();
        boolean z = !((C75592q0.m90781k() & 9007199254740992L) != 0);
        boolean ag = ((C20838b) C86312j.m106911c(C20838b.class)).mo32540ag();
        Log.m105925i("MicroMsg.AiFinderData", "[isShowLiveEntrance] openLiveFriends:%s enableFinderLiveEntry:%s, isTeenMode:%s", Boolean.valueOf(ag), Boolean.valueOf(z), Boolean.valueOf(e));
        return z && ag && !e;
    }

    /* renamed from: p */
    public JSONObject mo32862p(C64586nn1 nn12) {
        if (nn12.f184509n == 1) {
            FinderTipsShowEntranceExtInfo finderTipsShowEntranceExtInfo = new FinderTipsShowEntranceExtInfo();
            finderTipsShowEntranceExtInfo.parseFrom(nn12.f184510o.mo123703f());
            String str = finderTipsShowEntranceExtInfo.report_ext_info;
            if (!Util.isNullOrNil(str)) {
                return new JSONObject(new String(C91932a.m115444a(str, 0), "UTF-8"));
            }
        }
        return null;
    }

    /* renamed from: q */
    public final void mo32863q(int[] iArr, PString pString, PString pString2) {
        PInt pInt = new PInt();
        PInt pInt2 = new PInt();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        try {
            for (int bD : iArr) {
                pInt2.value = 0;
                pInt.value = 0;
                C34262g vx02 = C34262g.vx0();
                vx02.requireAccountInitialized();
                vx02.f92367e.mo59531bD(bD, pInt, pInt2);
                stringBuffer.append(pInt.value);
                stringBuffer.append("#");
                stringBuffer2.append(pInt2.value);
                stringBuffer2.append("#");
            }
        } catch (Exception unused) {
        }
        pString.value = stringBuffer.toString();
        pString2.value = stringBuffer2.toString();
    }
}
