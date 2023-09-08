package lu2;

import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import ft2.C97979c;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.LinkedList;
import lu2.C61403b;
import os2.C62173n;
import p565ir.C60606n;
import sx3.C110818d0;
import t91.C64208c;
import te3.C101789j00;
import te3.C51713vn0;
import te3.C64273c21;
import te3.C64337e61;
import te3.C64623p81;

/* renamed from: lu2.d */
public final class C61408d implements C60606n.C60609c {

    /* renamed from: a */
    public final /* synthetic */ C61403b.C61404a f174646a;

    /* renamed from: b */
    public final /* synthetic */ C61403b f174647b;

    /* renamed from: c */
    public final /* synthetic */ C8479f0<C64623p81> f174648c;

    /* renamed from: d */
    public final /* synthetic */ long f174649d;

    /* renamed from: e */
    public final /* synthetic */ TimeLineObject f174650e;

    /* renamed from: f */
    public final /* synthetic */ SnsInfo f174651f;

    /* renamed from: g */
    public final /* synthetic */ C8478d0 f174652g;

    public C61408d(C61403b.C61404a aVar, C61403b bVar, C8479f0<C64623p81> f0Var, long j, TimeLineObject timeLineObject, SnsInfo snsInfo, C8478d0 d0Var) {
        this.f174646a = aVar;
        this.f174647b = bVar;
        this.f174648c = f0Var;
        this.f174649d = j;
        this.f174650e = timeLineObject;
        this.f174651f = snsInfo;
        this.f174652g = d0Var;
    }

    public void onLiveStatusCallback(long j, int i, Object obj) {
        int i2;
        LinkedList<Integer> linkedList;
        Integer num;
        long j2 = j;
        int i3 = i;
        Object obj2 = obj;
        Class cls = C60606n.class;
        SnsMethodCalculate.markStartTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$checkLiveStatus$statusCallBack$1");
        if (this.f174646a.mo86351j() != j2) {
            Log.m105924i(C61403b.m72079C(this.f174647b), "#checkLiveStatus.onLiveStatusCallback not match, return");
            SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$checkLiveStatus$statusCallBack$1");
            return;
        }
        T t = this.f174648c.f27484d;
        ((C64623p81) t).f184791t = i3;
        C64623p81 p812 = (C64623p81) t;
        boolean z = obj2 instanceof C51713vn0;
        C51713vn0 vn02 = z ? (C51713vn0) obj2 : null;
        p812.f184761E = vn02 != null ? vn02.f143572d : null;
        C64273c21 c212 = ((C64623p81) t).f184761E;
        C64337e61 e612 = c212 != null ? c212.f182363I : null;
        String C = C61403b.m72079C(this.f174647b);
        StringBuilder sb = new StringBuilder();
        sb.append("[checkLiveStatus] thisLiveId:");
        sb.append(this.f174649d);
        sb.append(",liveID:");
        sb.append(j2);
        sb.append(",desc:");
        sb.append(((C64623p81) this.f174648c.f27484d).f184782h);
        sb.append(",share liveStatus:");
        sb.append(((C64623p81) this.f174648c.f27484d).f184791t);
        sb.append(", callback liveStatus:");
        sb.append(i3);
        sb.append(",purchaseInfo:[");
        sb.append(e612 != null ? Boolean.valueOf(e612.f182921e) : null);
        sb.append(',');
        sb.append(e612 != null ? Integer.valueOf(e612.f182920d) : null);
        sb.append(']');
        Log.m105924i(C, sb.toString());
        String Dk = ((C60606n) C86312j.m106911c(cls)).mo84996Dk(this.f174646a.mo86351j());
        if (!(Dk.length() > 0)) {
            Dk = null;
        }
        if (Dk != null) {
            C101789j00 j002 = this.f174650e.ContentObj;
            C64623p81 p813 = j002 != null ? j002.f298435s : null;
            if (p813 != null) {
                p813.f184783i = Dk;
            }
        }
        C61403b bVar = this.f174647b;
        C61403b.C61404a aVar = this.f174646a;
        TimeLineObject timeLineObject = this.f174650e;
        T t2 = this.f174648c.f27484d;
        String str = "onLiveStatusCallback";
        C87412m.m108593f(t2, "shareObject");
        String str2 = "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$checkLiveStatus$statusCallBack$1";
        bVar.mo86343F(aVar, timeLineObject, (C64623p81) t2, i, ((C64623p81) this.f174648c.f27484d).f184761E, z ? (C51713vn0) obj2 : null);
        SnsInfo snsInfo = this.f174651f;
        int i4 = 2;
        if (snsInfo != null) {
            C8478d0 d0Var = this.f174652g;
            C8479f0<C64623p81> f0Var = this.f174648c;
            TimeLineObject timeLineObject2 = this.f174650e;
            if (d0Var.f27483d == 1 && i3 == 2) {
                ((C64623p81) f0Var.f27484d).f184791t = i3;
                snsInfo.setTimeLine(timeLineObject2);
                C62173n nVar = C62173n.f176771a;
                SnsMethodCalculate.markStartTimeMs("save", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver");
                nVar.mo87230a().sendMessage(nVar.mo87230a().obtainMessage(1, snsInfo));
                SnsMethodCalculate.markEndTimeMs("save", "com.tencent.mm.plugin.sns.storage.FinderSnsLiveStatusSyncSaver");
            }
        }
        String str3 = "";
        if (z) {
            C51713vn0 vn03 = (C51713vn0) obj2;
            C64273c21 c213 = vn03.f143572d;
            if (c213 == null || (linkedList = c213.f182368N) == null || (num = (Integer) C110818d0.m150917O(linkedList, 0)) == null) {
                i2 = 0;
            } else {
                C61403b bVar2 = this.f174647b;
                int intValue = num.intValue();
                String C2 = C61403b.m72079C(bVar2);
                Log.m105924i(C2, "#checkLiveStatus.onLiveStatusCallback actType=" + intValue);
                i2 = ((C60606n) C86312j.m106911c(cls)).mo85091uI(intValue);
            }
            String str4 = vn03.f143575g;
            if (str4 != null) {
                str3 = str4;
            }
        } else {
            i2 = 0;
        }
        if (i2 == 0 || i3 == 2) {
            ImageView c = this.f174646a.mo86344c();
            if (c != null) {
                c.setVisibility(8);
            }
        } else if (((C60606n) C86312j.m106911c(cls)).J10()) {
            ImageView c2 = this.f174646a.mo86344c();
            if (c2 != null) {
                c2.setImageResource(i2);
            }
            ImageView c3 = this.f174646a.mo86344c();
            if (c3 != null) {
                c3.setVisibility(0);
            }
        }
        if ((str3.length() == 0) || i3 == 2 || !((C60606n) C86312j.m106911c(cls)).J10()) {
            TextView k = this.f174646a.mo86352k();
            if (k != null) {
                k.setVisibility(8);
            }
        } else {
            TextView k2 = this.f174646a.mo86352k();
            if (k2 != null) {
                k2.setText(str3);
            }
            TextView k3 = this.f174646a.mo86352k();
            if (k3 != null) {
                k3.setVisibility(0);
            }
        }
        C61403b bVar3 = this.f174647b;
        T t3 = this.f174648c.f27484d;
        C87412m.m108593f(t3, "shareObject");
        if (bVar3.mo86342E((C64623p81) t3, ((C64623p81) this.f174648c.f27484d).f184761E) || this.f174647b.mo86341D(((C64623p81) this.f174648c.f27484d).f184779e, this.f174646a.mo86349h(), j2)) {
            C64208c.f181951a.mo89031f(String.valueOf(j));
        } else {
            if (i3 == 1) {
                i4 = 1;
            }
            C97979c.m126547n(C64208c.f181951a.mo89026a(String.valueOf(j)), i4);
        }
        SnsMethodCalculate.markEndTimeMs(str, str2);
    }
}
