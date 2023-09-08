package com.tencent.p014mm.plugin.subapp.jdbiz;

import android.content.Context;
import android.os.Looper;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.pluginsdk.platformtools.C96796d;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import eb0.C97625j3;
import ei3.C86522b;
import f40.C86709a0;
import java.util.HashMap;
import java.util.Map;
import lc3.C10485b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.subapp.jdbiz.h */
public class C96463h extends C86301e implements C96796d.C96797a {

    /* renamed from: d */
    public C96461f f282234d = null;

    /* renamed from: e */
    public Map<String, Integer> f282235e = new HashMap();

    public C96463h() {
        Log.m105924i("MicroMsg.SubCoreJdIP6", "new SubCoreJDBiz this: " + hashCode() + " stack: " + Util.getStack());
    }

    public static void Fx0(C96461f fVar) {
        C86709a0.m107523b().mo121108c();
        C96463h yx02 = yx0();
        if (yx02.f282234d == null) {
            yx02.f282234d = C96461f.m123739a();
        }
        Log.m105925i("MicroMsg.SubCoreJdIP6", "updatejdMsgContent old: %s new: %s", Util.nullAs(yx02.f282234d.f282233s, ""), Util.nullAs(fVar.f282233s, ""));
        if (!fVar.mo134435c(yx02.f282234d)) {
            Log.m105924i("MicroMsg.SubCoreJdIP6", "fo zu baoyou! the activityid is same");
            return;
        }
        if (!Util.isNullOrNil(fVar.f282221g) || fVar.f282220f) {
            C97625j3.m125812b().mo105906u().mo119676J(327939, "1");
        }
        if (fVar.f282219e) {
            C97625j3.m125812b().mo105906u().mo119676J(327938, "1");
        } else {
            C97625j3.m125812b().mo105906u().mo119676J(327938, "");
        }
        yx02.f282234d = fVar;
        C97625j3.m125812b().mo105906u().mo119676J(327942, fVar.f282233s);
        new MMHandler(Looper.getMainLooper()).post(new C96462g(yx02));
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_JD_ENTRANCE_RESET_EXPOSURE_FLAG_BOOLEAN_SYNC, Boolean.TRUE);
    }

    public static String xx0(String str, int i) {
        if (-1 != str.indexOf(35)) {
            return str;
        }
        if (-1 == str.indexOf(63)) {
            return str + "?wc_scene=" + i;
        }
        return str + "&wc_scene=" + i;
    }

    public static C96463h yx0() {
        return (C96463h) C86312j.m106911c(C96463h.class);
    }

    public String Ax0() {
        Class cls = C10485b.class;
        return LocaleUtil.isSimplifiedChineseAppLang() ? ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("JDEntranceConfigName") : LocaleUtil.isTraditionalChineseAppLang() ? ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("JDEntranceConfigNameHKTW") : ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("JDEntranceConfigNameEN");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String Bx0() {
        /*
            r12 = this;
            com.tencent.mm.plugin.subapp.jdbiz.f r0 = r12.Dx0()
            boolean r1 = r12.Ex0()
            r2 = 0
            r3 = 1
            java.lang.String r4 = ""
            if (r1 == 0) goto L_0x003e
            boolean r1 = r0.mo134436d()
            if (r1 != 0) goto L_0x0038
            java.lang.String r1 = r0.f282215a
            java.lang.String r5 = "3"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = r0.f282229o
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = r0.f282229o
            r1[r2] = r4
            java.lang.String r4 = "MicroMsg.SubCoreJdIP6"
            java.lang.String r5 = "jumpUrl update %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r4, r5, r1)
            java.lang.String r4 = r0.f282229o
            r1 = 6
            goto L_0x003f
        L_0x0038:
            boolean r1 = r0.f282220f
            if (r1 == 0) goto L_0x003e
            r1 = 2
            goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            java.lang.String r5 = r0.f282215a
            java.lang.String r6 = "2"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x007a
            java.lang.String r5 = r0.f282229o
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x007a
            long r5 = r0.f282223i
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x0060
            r5 = 1
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            if (r5 == 0) goto L_0x007a
            long r5 = r0.f282224j
            r7 = 0
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0075
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 / r9
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0075
            r2 = 1
        L_0x0075:
            if (r2 != 0) goto L_0x007a
            java.lang.String r4 = r0.f282229o
            r1 = 3
        L_0x007a:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r0 != 0) goto L_0x0085
            java.lang.String r0 = xx0(r4, r1)
            return r0
        L_0x0085:
            java.lang.String r0 = r12.zx0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.subapp.jdbiz.C96463h.Bx0():java.lang.String");
    }

    public C96460e Cx0() {
        C96460e eVar = new C96460e();
        C96461f Dx0 = Dx0();
        if (Ex0() && !Dx0.mo134436d() && "3".equals(Dx0.f282215a)) {
            Log.m105925i("MicroMsg.SubCoreJdIP6", "bizType %s, jumpWeapp update user:%s path:%s version:%d", Dx0.f282215a, Dx0.f282230p, Dx0.f282231q, Integer.valueOf(Dx0.f282232r));
            eVar.f282212a = Dx0.f282230p;
            eVar.f282213b = Dx0.f282231q;
            eVar.f282214c = Dx0.f282232r;
        }
        if ("2".equals(Dx0.f282215a)) {
            if (Dx0.f282223i < System.currentTimeMillis() / 1000) {
                long j = Dx0.f282224j;
                if (!(j != 0 && j < System.currentTimeMillis() / 1000)) {
                    Log.m105925i("MicroMsg.SubCoreJdIP6", "bizType %s, jumpWeapp update user:%s path:%s version:%d", Dx0.f282215a, Dx0.f282230p, Dx0.f282231q, Integer.valueOf(Dx0.f282232r));
                    eVar.f282212a = Dx0.f282230p;
                    eVar.f282213b = Dx0.f282231q;
                    eVar.f282214c = Dx0.f282232r;
                }
            }
        }
        if (!Util.isNullOrNil(eVar.f282212a)) {
            return eVar;
        }
        Class cls = C10485b.class;
        C96460e eVar2 = new C96460e();
        eVar2.f282212a = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("JDEntranceConfigJumpWeAppUsername");
        eVar2.f282213b = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("JDEntranceConfigJumpWeAppPath");
        eVar2.f282214c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("JDEntranceConfigJumpWeAppVersion", 0);
        return eVar2;
    }

    public C96461f Dx0() {
        if (this.f282234d == null) {
            this.f282234d = C96461f.m123739a();
        }
        return this.f282234d;
    }

    public boolean Ex0() {
        return "1".equals((String) C97625j3.m125812b().mo105906u().mo119684e(327939, ""));
    }

    /* renamed from: UX */
    public boolean mo134444UX() {
        return !Util.isNullOrNil(Ax0()) && (!Util.isNullOrNil(zx0()) || !Util.isNullOrNil(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("JDEntranceConfigJumpWeAppUsername")));
    }

    public void onAccountReleased(Context context) {
        ((HashMap) this.f282235e).clear();
    }

    public void vx0() {
        C97625j3.m125812b().mo105906u().mo119676J(327939, "");
    }

    public void wx0() {
        C97625j3.m125812b().mo105906u().mo119676J(327938, "");
    }

    public String zx0() {
        return ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("JDEntranceConfigJumpUrl");
    }
}
