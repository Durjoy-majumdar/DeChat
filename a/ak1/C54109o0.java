package ak1;

import ak1.C54101n0;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLivePlayErrorStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import er1.C58739j4;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import o40.C61926c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: ak1.o0 */
public final class C54109o0 {

    /* renamed from: a */
    public static final C54109o0 f151877a = new C54109o0();

    /* renamed from: b */
    public static final C13601g f151878b = C36568h.m40985a(C54111b.f151882d);

    /* renamed from: c */
    public static final C13601g f151879c = C36568h.m40985a(C54112c.f151883d);

    /* renamed from: d */
    public static final C13601g f151880d = C36568h.m40985a(C54110a.f151881d);

    /* renamed from: ak1.o0$a */
    public static final class C54110a extends C87413o implements C32224a<C54101n0.C54103b<Long, Integer>> {

        /* renamed from: d */
        public static final C54110a f151881d = new C54110a();

        public C54110a() {
            super(0);
        }

        public Object invoke() {
            return new C54101n0.C54103b(1);
        }
    }

    /* renamed from: ak1.o0$b */
    public static final class C54111b extends C87413o implements C32224a<C54101n0.C54103b<Long, Integer>> {

        /* renamed from: d */
        public static final C54111b f151882d = new C54111b();

        public C54111b() {
            super(0);
        }

        public Object invoke() {
            return new C54101n0.C54103b(1);
        }
    }

    /* renamed from: ak1.o0$c */
    public static final class C54112c extends C87413o implements C32224a<C54101n0.C54103b<Long, Integer>> {

        /* renamed from: d */
        public static final C54112c f151883d = new C54112c();

        public C54112c() {
            super(0);
        }

        public Object invoke() {
            return new C54101n0.C54103b(2);
        }
    }

    /* renamed from: a */
    public final void mo74840a(long j, int i) {
        Integer num = 0;
        if (i == 1) {
            C13601g gVar = f151878b;
            HashMap hashMap = (HashMap) ((C36570n) gVar).getValue();
            Long valueOf = Long.valueOf(j);
            Integer num2 = (Integer) ((HashMap) ((C36570n) gVar).getValue()).get(Long.valueOf(j));
            if (num2 != null) {
                num = num2;
            }
            hashMap.put(valueOf, Integer.valueOf(num.intValue() + 1));
        } else if (i == 2) {
            C13601g gVar2 = f151879c;
            HashMap hashMap2 = (HashMap) ((C36570n) gVar2).getValue();
            Long valueOf2 = Long.valueOf(j);
            Integer num3 = (Integer) ((HashMap) ((C36570n) gVar2).getValue()).get(Long.valueOf(j));
            if (num3 != null) {
                num = num3;
            }
            hashMap2.put(valueOf2, Integer.valueOf(num.intValue() + 1));
        } else if (i == 3) {
            C13601g gVar3 = f151880d;
            HashMap hashMap3 = (HashMap) ((C36570n) gVar3).getValue();
            Long valueOf3 = Long.valueOf(j);
            Integer num4 = (Integer) ((HashMap) ((C36570n) gVar3).getValue()).get(Long.valueOf(j));
            if (num4 != null) {
                num = num4;
            }
            hashMap3.put(valueOf3, Integer.valueOf(num.intValue() + 1));
        }
        if (C58739j4.f168176a.mo83692U()) {
            Log.m105924i("LiveVisitorUnknowHostReporter", "recordUnknowHostErrMsg liveId:" + j + ",source:" + i);
        }
    }

    /* renamed from: b */
    public final void mo74841b(boolean z, long j, String str, int i) {
        String str2;
        String str3;
        C87412m.m108594g(str, "nickname");
        Integer num = i != 1 ? i != 2 ? i != 3 ? 0 : (Integer) ((HashMap) ((C36570n) f151880d).getValue()).remove(Long.valueOf(j)) : (Integer) ((HashMap) ((C36570n) f151879c).getValue()).remove(Long.valueOf(j)) : (Integer) ((HashMap) ((C36570n) f151878b).getValue()).remove(Long.valueOf(j));
        if (num != null && num.intValue() > 0) {
            int c = C54101n0.f151856a.mo74796c(j, i);
            if (c == 1 || c == 2) {
                if (z) {
                    str2 = "fixUnknowHost_stage" + c + '_' + i;
                } else {
                    str2 = "fixUnknowHostFail_stage" + c + '_' + i;
                }
                if (z) {
                    str3 = num.toString();
                } else {
                    str3 = num + ";netType:" + NetStatusUtil.getNetType(MMApplicationContext.getContext());
                }
                FinderLivePlayErrorStruct finderLivePlayErrorStruct = new FinderLivePlayErrorStruct();
                finderLivePlayErrorStruct.f155585i = 4;
                finderLivePlayErrorStruct.f155580d = finderLivePlayErrorStruct.mo86045b(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str2, true);
                finderLivePlayErrorStruct.f155581e = 0;
                finderLivePlayErrorStruct.f155582f = finderLivePlayErrorStruct.mo86045b("errMsg", str3, true);
                finderLivePlayErrorStruct.f155583g = finderLivePlayErrorStruct.mo86045b("liveId", C61926c.m72691p(j), true);
                finderLivePlayErrorStruct.f155584h = finderLivePlayErrorStruct.mo86045b("nickname", str, true);
                finderLivePlayErrorStruct.mo86054n();
            }
        }
    }
}
