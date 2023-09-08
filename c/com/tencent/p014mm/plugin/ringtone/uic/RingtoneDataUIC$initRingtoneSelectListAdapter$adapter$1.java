package com.tencent.p014mm.plugin.ringtone.uic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39623j;
import bl3.C39818r;
import ck2.C54882d;
import ck2.C54891f0;
import ck2.C54913i0;
import com.tencent.p014mm.plugin.ringtone.widget.RingtoneHalfBottomDialog;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C24565l;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import p145dx.C58455v;
import pj2.C62323d;
import pj2.C62324e;
import pj2.C62327i;
import pj2.C62329k;
import pj2.C62331m;
import pj2.C62338s;
import rj2.C63449b;
import rx3.C13598b0;
import ve3.C65680f;
import ve3.C65682g;
import wj2.C66132f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/ringtone/uic/RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-ringtone_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1 */
public final class RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1 implements C9500j {
    public final /* synthetic */ RingtoneDataUIC this$0;

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1$a */
    public /* synthetic */ class C57288a extends C24565l implements C32227p<Integer, C62324e, C13598b0> {
        public C57288a(Object obj) {
            super(2, obj, RingtoneDataUIC.class, "onClickAuthor", "onClickAuthor(ILcom/tencent/mm/plugin/ringtone/data/RingtoneConvertData;)V", 0);
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            C62324e eVar = (C62324e) obj2;
            C87412m.m108594g(eVar, "p1");
            ((RingtoneDataUIC) this.receiver).mo80833g3(intValue, eVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1$b */
    public /* synthetic */ class C57289b extends C24565l implements C32227p<Integer, C62324e, C13598b0> {
        public C57289b(Object obj) {
            super(2, obj, RingtoneDataUIC.class, "onClickUse", "onClickUse(ILcom/tencent/mm/plugin/ringtone/data/RingtoneConvertData;)V", 0);
        }

        public Object invoke(Object obj, Object obj2) {
            C65680f fVar;
            C66132f a;
            int intValue = ((Number) obj).intValue();
            C62324e eVar = (C62324e) obj2;
            C87412m.m108594g(eVar, "p1");
            RingtoneDataUIC ringtoneDataUIC = (RingtoneDataUIC) this.receiver;
            ringtoneDataUIC.getClass();
            Class cls = C54913i0.class;
            C65682g gVar = eVar.f177154d.f189022f;
            if (!(gVar == null || (fVar = gVar.f188994d) == null || (a = C63449b.m74791a(fVar.f188983d)) == null)) {
                C39818r rVar = C39818r.f106831a;
                int i = ((C54913i0) rVar.mo62444c(ringtoneDataUIC.getActivity()).mo75002a(cls)).f153915f;
                WxRecyclerAdapter<C62323d> wxRecyclerAdapter = ringtoneDataUIC.f164076i;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyItemChanged(intValue, Boolean.FALSE);
                }
                AppCompatActivity activity = ringtoneDataUIC.getActivity();
                C39623j lifecycle = ringtoneDataUIC.getActivity().getLifecycle();
                C87412m.m108593f(lifecycle, "activity.lifecycle");
                int i2 = ringtoneDataUIC.f164072e;
                RingtoneHalfBottomDialog.m66041b(activity, lifecycle, (i2 == 6 || i2 == 9 || i2 == 10) ? "" : ringtoneDataUIC.f164073f, a, 7, i2, i, String.valueOf(((C54891f0) rVar.mo62444c(ringtoneDataUIC.getActivity()).mo75002a(C54891f0.class)).mo75830c3().f181230f), ringtoneDataUIC.f164074g > 1, false, (C32226l) null, new C54882d(ringtoneDataUIC, intValue), 1536, (Object) null);
                C39622i0 a2 = rVar.mo62444c(ringtoneDataUIC.getActivity()).mo75002a(cls);
                C87412m.m108593f(a2, "UICProvider.of(activity)…ectReportUIC::class.java)");
                C58455v.C58456a.m67861a((C58455v) a2, 9, ringtoneDataUIC.f164080p, ringtoneDataUIC.f164081q, 0, 8, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1$c */
    public /* synthetic */ class C57290c extends C24565l implements C32228q<Integer, Boolean, C62324e, C13598b0> {
        public C57290c(Object obj) {
            super(3, obj, RingtoneDataUIC.class, "onPlayStateChange", "onPlayStateChange(IZLcom/tencent/mm/plugin/ringtone/data/RingtoneConvertData;)V", 0);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            ((RingtoneDataUIC) this.receiver).mo80834i3(((Number) obj).intValue(), ((Boolean) obj2).booleanValue(), (C62324e) obj3);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1$d */
    public /* synthetic */ class C57291d extends C24565l implements C32227p<Integer, C62324e, C13598b0> {
        public C57291d(Object obj) {
            super(2, obj, RingtoneDataUIC.class, "onClickAvatar", "onClickAvatar(ILcom/tencent/mm/plugin/ringtone/data/RingtoneConvertData;)V", 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
            r2 = r2.getData();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
            /*
                r13 = this;
                java.lang.Number r14 = (java.lang.Number) r14
                int r14 = r14.intValue()
                pj2.e r15 = (pj2.C62324e) r15
                java.lang.String r0 = "p1"
                gy3.C87412m.m108594g(r15, r0)
                java.lang.Object r0 = r13.receiver
                com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC r0 = (com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC) r0
                r0.getClass()
                java.lang.Class<ck2.d0> r1 = ck2.C54883d0.class
                int r2 = r0.f164080p
                r3 = 0
                if (r14 == r2) goto L_0x0044
                if (r2 < 0) goto L_0x0044
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r2 = r0.f164076i
                if (r2 == 0) goto L_0x0031
                java.util.List r2 = r2.getData()
                if (r2 == 0) goto L_0x0031
                int r4 = r0.f164080p
                java.lang.Object r2 = sx3.C110818d0.m150917O(r2, r4)
                pj2.d r2 = (pj2.C62323d) r2
                goto L_0x0032
            L_0x0031:
                r2 = r3
            L_0x0032:
                if (r2 != 0) goto L_0x0035
                goto L_0x0039
            L_0x0035:
                r4 = 0
                r2.mo87404h(r4)
            L_0x0039:
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r2 = r0.f164076i
                if (r2 == 0) goto L_0x0044
                int r4 = r0.f164080p
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                r2.notifyItemChanged(r4, r5)
            L_0x0044:
                boolean r2 = r15.f177155e
                r2 = r2 ^ 1
                r15.f177155e = r2
                if (r2 == 0) goto L_0x0078
                long r4 = r15.getItemId()
                wj2.f r7 = rj2.C63449b.m74791a(r4)
                if (r7 != 0) goto L_0x0057
                goto L_0x00a2
            L_0x0057:
                long r8 = r15.getItemId()
                r10 = 1
                bl3.r r2 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r4 = r0.getActivity()
                bl3.r$a r2 = r2.mo62444c(r4)
                androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
                r6 = r1
                ck2.d0 r6 = (ck2.C54883d0) r6
                boolean r1 = r7.mo90179j()
                r11 = r1 ^ 1
                r12 = 1
                r6.mo75824c3(r7, r8, r10, r11, r12)
                goto L_0x008b
            L_0x0078:
                bl3.r r2 = bl3.C39818r.f106831a
                androidx.appcompat.app.AppCompatActivity r4 = r0.getActivity()
                bl3.r$a r2 = r2.mo62444c(r4)
                androidx.lifecycle.i0 r1 = r2.mo75002a(r1)
                ck2.d0 r1 = (ck2.C54883d0) r1
                r1.mo75823T2()
            L_0x008b:
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter<pj2.d> r1 = r0.f164076i
                if (r1 == 0) goto L_0x0094
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                r1.notifyItemChanged(r14, r2)
            L_0x0094:
                boolean r1 = r15.f177155e
                if (r1 == 0) goto L_0x0099
                goto L_0x009a
            L_0x0099:
                r14 = -1
            L_0x009a:
                r0.f164080p = r14
                if (r1 == 0) goto L_0x009f
                goto L_0x00a0
            L_0x009f:
                r15 = r3
            L_0x00a0:
                r0.f164081q = r15
            L_0x00a2:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1.C57291d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.ringtone.uic.RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1$e */
    public /* synthetic */ class C57292e extends C24565l implements C32227p<Integer, C62324e, C13598b0> {
        public C57292e(Object obj) {
            super(2, obj, RingtoneDataUIC.class, "onClickAuthor", "onClickAuthor(ILcom/tencent/mm/plugin/ringtone/data/RingtoneConvertData;)V", 0);
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            C62324e eVar = (C62324e) obj2;
            C87412m.m108594g(eVar, "p1");
            ((RingtoneDataUIC) this.receiver).mo80833g3(intValue, eVar);
            return C13598b0.f38549a;
        }
    }

    public RingtoneDataUIC$initRingtoneSelectListAdapter$adapter$1(RingtoneDataUIC ringtoneDataUIC) {
        this.this$0 = ringtoneDataUIC;
    }

    public C60896i<?> getItemConvert(int i) {
        Log.m105924i("MicroMsg.RingtoneDataUIC", "getItemConvert, type:" + i);
        int i2 = ((C54913i0) C39818r.f106831a.mo62444c(this.this$0.getActivity()).mo75002a(C54913i0.class)).f153915f;
        return i != -2 ? i != -1 ? this.this$0.mo80829c3() ? new C62338s(i2, new C57288a(this.this$0), new C57289b(this.this$0), new C57290c(this.this$0)) : new C62327i(i2, new C57291d(this.this$0), new C57292e(this.this$0)) : new C62329k() : new C62331m();
    }
}
