package ts1;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ky2.C10432i;
import o40.C61926c;
import rs1.C13371q;
import rx3.C13598b0;
import rx3.C13604l;
import vp1.C65834e;

/* renamed from: ts1.g */
public final class C14083g extends UIComponent {

    /* renamed from: d */
    public boolean f39492d;

    /* renamed from: ts1.g$a */
    public static final class C14084a implements C10432i.C10433a {

        /* renamed from: a */
        public final /* synthetic */ C14083g f39493a;

        /* renamed from: ts1.g$a$a */
        public static final class C14085a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ boolean f39494d;

            /* renamed from: e */
            public final /* synthetic */ C14083g f39495e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C14085a(boolean z, C14083g gVar) {
                super(0);
                this.f39494d = z;
                this.f39495e = gVar;
            }

            public Object invoke() {
                if (!this.f39494d) {
                    this.f39495e.getActivity().finish();
                    this.f39495e.getActivity().overridePendingTransition(0, C0966R.C0968anim.f2506eu);
                }
                return C13598b0.f38549a;
            }
        }

        public C14084a(C14083g gVar) {
            this.f39493a = gVar;
        }

        public final void onResult(int i, String str, boolean z) {
            C61926c.m72668M(new C14085a(z, this.f39493a));
            this.f39493a.f39492d = false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14083g(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final boolean mo13498c3(int i, long j) {
        C13604l lVar;
        FinderObject feedObject;
        Class cls = C10432i.class;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = true;
        if (!((C10432i) C86312j.m106911c(cls)).mo10750e() || i == 17 || i == 18 || i == 20 || i == 155 || i == 170) {
            return true;
        }
        String str = "finder_feedId_" + C61926c.m72691p(j);
        if (!(((C10432i) C86312j.m106911c(cls)).mo10740Mn() == 1)) {
            boolean JD = ((C10432i) C86312j.m106911c(cls)).mo10738JD(4, str);
            lVar = new C13604l(Boolean.valueOf(JD), "青少年-不可访问(临时授权：" + JD + ')');
        } else {
            FinderItem e = C65834e.f189316a.mo89871e(j);
            int i2 = (e == null || (feedObject = e.getFeedObject()) == null) ? -1 : feedObject.permissionFlag;
            if ((8388608 & i2) <= 0) {
                z = false;
            }
            if (z || i2 == -1) {
                lVar = i2 == -1 ? new C13604l(Boolean.TRUE, "本地无feed缓存，先放过") : new C13604l(Boolean.TRUE, "符合规则（青少年内容 && 在安全池内）");
            } else {
                boolean JD2 = ((C10432i) C86312j.m106911c(cls)).mo10738JD(4, str);
                lVar = new C13604l(Boolean.valueOf(JD2), "内容不在安全池内(临时授权：" + JD2 + ')');
            }
        }
        boolean booleanValue = ((Boolean) lVar.f38555d).booleanValue();
        Log.m105924i("MicroMsg.FinderTeenModeTempAuthMgr", "cost=" + (System.currentTimeMillis() - currentTimeMillis) + "ms reason=" + ((String) lVar.f38556e));
        return booleanValue;
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [com.tencent.mm.message.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13499d3(long r16, java.lang.String r18) {
        /*
            r15 = this;
            r0 = r15
            java.lang.String r1 = "authContent"
            r2 = r18
            gy3.C87412m.m108594g(r2, r1)
            boolean r1 = r0.f39492d
            if (r1 == 0) goto L_0x000d
            return
        L_0x000d:
            r1 = 1
            r0.f39492d = r1
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.processXml(r18)
            r4 = 0
            com.tencent.mm.message.l$b r3 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r3, r4)
            if (r3 == 0) goto L_0x0024
            java.lang.Class<ht1.f> r4 = ht1.C60166f.class
            com.tencent.mm.message.g r3 = r3.mo93555w(r4)
            r4 = r3
            ht1.f r4 = (ht1.C60166f) r4
        L_0x0024:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "<fromusr>"
            r3.append(r5)
            java.lang.String r5 = eb0.C75592q0.m90789s()
            r3.append(r5)
            java.lang.String r5 = "</fromusr>"
            r3.append(r5)
            java.lang.String r5 = "<type>"
            r3.append(r5)
            r5 = 49
            r3.append(r5)
            java.lang.String r5 = "</type>"
            r3.append(r5)
            java.lang.String r5 = "<content>"
            r3.append(r5)
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.Util.escapeStringForXml(r18)
            r3.append(r2)
            java.lang.String r2 = "</content>"
            r3.append(r2)
            java.lang.String r12 = r3.toString()
            java.lang.String r2 = "sb.toString()"
            gy3.C87412m.m108593f(r12, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "finder_feedId_"
            r2.append(r3)
            java.lang.String r3 = o40.C61926c.m72691p(r16)
            r2.append(r3)
            java.lang.String r9 = r2.toString()
            java.lang.Class<ky2.i> r2 = ky2.C10432i.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            r5 = r2
            ky2.i r5 = (ky2.C10432i) r5
            androidx.appcompat.app.AppCompatActivity r6 = r15.getActivity()
            r7 = 10013(0x271d, float:1.4031E-41)
            r8 = 4
            android.content.res.Resources r2 = r15.getResources()
            r3 = 2131829992(0x7f1124e8, float:1.9292969E38)
            java.lang.String r10 = r2.getString(r3)
            android.content.res.Resources r2 = r15.getResources()
            r3 = 2131829990(0x7f1124e6, float:1.9292965E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r11 = 0
            if (r4 == 0) goto L_0x00a8
            te3.rk1 r4 = r4.f171710b
            if (r4 == 0) goto L_0x00a8
            java.lang.String r4 = r4.f185187h
            if (r4 != 0) goto L_0x00aa
        L_0x00a8:
            java.lang.String r4 = ""
        L_0x00aa:
            r1[r11] = r4
            java.lang.String r11 = r2.getString(r3, r1)
            r13 = 1
            ts1.g$a r14 = new ts1.g$a
            r14.<init>(r15)
            r5.Wq0(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ts1.C14083g.mo13499d3(long, java.lang.String):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("MicroMsg.FinderTeenModeTempAuthMgr", "requestCode " + i + ", resultCode " + i2);
        if (i == 10013 && i2 == 0 && !getActivity().isFinishing() && !getActivity().isDestroyed()) {
            C13371q qVar = (C13371q) C39818r.f106831a.mo62444c(getActivity()).mo62449e(C13371q.class);
            if (qVar != null) {
                qVar.f37887g = true;
            }
            getActivity().finish();
            getActivity().overridePendingTransition(0, C0966R.C0968anim.f2506eu);
        }
    }
}
