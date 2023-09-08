package gz0;

import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import dz0.C20483c;
import hz0.C21034b;
import java.util.ArrayList;
import java.util.List;
import te3.C49029co;
import wz0.C22945n;

/* renamed from: gz0.g */
public class C20871g {

    /* renamed from: a */
    public MMActivity f58969a;

    /* renamed from: b */
    public C20483c f58970b;

    /* renamed from: c */
    public int f58971c = 3;

    /* renamed from: d */
    public List<C21034b> f58972d = new ArrayList();

    /* renamed from: e */
    public C21034b f58973e;

    /* renamed from: f */
    public ArrayList<C49029co> f58974f;

    public C20871g(MMActivity mMActivity) {
        this.f58969a = mMActivity;
    }

    /* renamed from: a */
    public final void mo32576a() {
        ArrayList<C49029co> arrayList;
        ArrayList<C49029co> arrayList2;
        if (this.f58970b.mo23264L0().f64154x >= 1 && this.f58974f == null) {
            C21034b bVar = new C21034b();
            bVar.f59501t = 1;
            if (!TextUtils.isEmpty(this.f58970b.mo23264L0().f64134Y)) {
                bVar.f64746d = this.f58970b.mo23264L0().f64134Y;
            } else {
                bVar.f64746d = mo32578c(C0966R.string.f360214aw1);
            }
            bVar.f64747e = "";
            bVar.f64748f = "";
            bVar.f64749g = "card://jump_shop_list";
            ((ArrayList) this.f58972d).add(bVar);
        } else if (this.f58970b.mo23264L0().f64154x >= 1 && (arrayList = this.f58974f) != null && arrayList.size() >= 1) {
            C21034b bVar2 = new C21034b();
            bVar2.f59501t = 1;
            C49029co coVar = this.f58974f.get(0);
            if (!TextUtils.isEmpty(this.f58970b.mo23264L0().f64134Y)) {
                bVar2.f64746d = this.f58970b.mo23264L0().f64134Y;
            } else if (this.f58970b.mo23291o()) {
                bVar2.f64746d = mo32578c(C0966R.string.f360214aw1);
            } else if (coVar.f131855n >= 5000.0f) {
                bVar2.f64746d = mo32578c(C0966R.string.f360214aw1);
            } else if (this.f58970b.mo23264L0().f64154x == 1 || this.f58974f.size() == 1) {
                Log.m105924i("MicroMsg.CardDetailDataMgr", "shop_count is 1 or mShopList size is 1");
                return;
            } else {
                bVar2.f64746d = mo32578c(C0966R.string.aw8);
            }
            if (!this.f58970b.mo23291o() || coVar.f131855n >= 2000.0f) {
                bVar2.f64747e = "";
            } else if (this.f58970b.mo23264L0().f64154x > 1 || ((arrayList2 = this.f58974f) != null && arrayList2.size() > 1)) {
                MMActivity mMActivity = this.f58969a;
                bVar2.f64747e = mMActivity.getString(C0966R.string.azr, new Object[]{C22945n.m26991D(mMActivity, coVar.f131855n)});
            } else {
                bVar2.f64747e = C22945n.m26991D(this.f58969a, coVar.f131855n);
            }
            bVar2.f64748f = "";
            bVar2.f64749g = "card://jump_shop_list";
            ((ArrayList) this.f58972d).add(bVar2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r2 = r5.f58971c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hz0.C21034b mo32577b() {
        /*
            r5 = this;
            hz0.b r0 = new hz0.b
            r0.<init>()
            r1 = 1
            r0.f59501t = r1
            int r2 = r5.f58971c
            boolean r2 = wz0.C22945n.m27021u(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0054
            int r2 = r5.f58971c
            boolean r2 = wz0.C22945n.m27023w(r2)
            if (r2 != 0) goto L_0x0054
            int r2 = r5.f58971c
            r4 = 23
            if (r2 != r4) goto L_0x0020
            goto L_0x0054
        L_0x0020:
            r4 = 6
            if (r2 != r4) goto L_0x0086
            dz0.c r2 = r5.f58970b
            boolean r2 = r2.mo23261F()
            if (r2 == 0) goto L_0x0086
            dz0.c r2 = r5.f58970b
            te3.ko r2 = r2.mo23264L0()
            te3.wp1 r2 = r2.f64117P
            if (r2 == 0) goto L_0x0086
            dz0.c r2 = r5.f58970b
            te3.ko r2 = r2.mo23264L0()
            te3.wp1 r2 = r2.f64117P
            java.lang.String r2 = r2.f186150d
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0086
            dz0.c r2 = r5.f58970b
            te3.ko r2 = r2.mo23264L0()
            java.lang.String r2 = r2.f64139g
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0086
            goto L_0x0084
        L_0x0054:
            dz0.c r2 = r5.f58970b
            boolean r2 = r2.mo23295v0()
            if (r2 == 0) goto L_0x0086
            dz0.c r2 = r5.f58970b
            te3.ko r2 = r2.mo23264L0()
            te3.wp1 r2 = r2.f64117P
            if (r2 == 0) goto L_0x0086
            dz0.c r2 = r5.f58970b
            te3.ko r2 = r2.mo23264L0()
            te3.wp1 r2 = r2.f64117P
            java.lang.String r2 = r2.f186150d
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0086
            dz0.c r2 = r5.f58970b
            te3.ko r2 = r2.mo23264L0()
            java.lang.String r2 = r2.f64139g
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0086
        L_0x0084:
            r2 = 1
            goto L_0x0087
        L_0x0086:
            r2 = 0
        L_0x0087:
            r0.f59503v = r2
            if (r2 != 0) goto L_0x00a5
            dz0.c r2 = r5.f58970b
            te3.ko r2 = r2.mo23264L0()
            java.lang.String r2 = r2.f64110H
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x009a
            goto L_0x00a5
        L_0x009a:
            dz0.c r1 = r5.f58970b
            te3.ko r1 = r1.mo23264L0()
            java.lang.String r1 = r1.f64110H
            r0.f64746d = r1
            goto L_0x00e3
        L_0x00a5:
            dz0.c r2 = r5.f58970b
            te3.ko r2 = r2.mo23264L0()
            java.lang.String r2 = r2.f64139g
            boolean r2 = eb0.C45628s0.m50740E(r2)
            if (r2 == 0) goto L_0x00bf
            r1 = 2131823142(0x7f110a26, float:1.9279075E38)
            java.lang.String r1 = r5.mo32578c(r1)
            r0.f64746d = r1
            r0.f59503v = r3
            goto L_0x00e3
        L_0x00bf:
            r2 = 2131823141(0x7f110a25, float:1.9279073E38)
            java.lang.String r2 = r5.mo32578c(r2)
            r0.f64746d = r2
            dz0.c r2 = r5.f58970b
            te3.ko r2 = r2.mo23264L0()
            te3.wp1 r2 = r2.f64117P
            if (r2 == 0) goto L_0x00e1
            dz0.c r2 = r5.f58970b
            te3.ko r2 = r2.mo23264L0()
            te3.wp1 r2 = r2.f64117P
            int r2 = r2.f186151e
            if (r2 != r1) goto L_0x00e1
            r0.f59504w = r1
            goto L_0x00e3
        L_0x00e1:
            r0.f59504w = r3
        L_0x00e3:
            dz0.c r1 = r5.f58970b
            te3.ko r1 = r1.mo23264L0()
            java.lang.String r1 = r1.f64112J
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00fb
            dz0.c r1 = r5.f58970b
            te3.ko r1 = r1.mo23264L0()
            java.lang.String r1 = r1.f64112J
            r0.f64747e = r1
        L_0x00fb:
            java.lang.String r1 = ""
            r0.f64748f = r1
            java.lang.String r1 = "card://jump_service"
            r0.f64749g = r1
            r5.f58973e = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gz0.C20871g.mo32577b():hz0.b");
    }

    /* renamed from: c */
    public final String mo32578c(int i) {
        return this.f58969a.getString(i);
    }

    /* renamed from: d */
    public String mo32579d() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f58970b.mo23264L0().f64156y)) {
            sb.append(this.f58970b.mo23264L0().f64156y);
        } else if (this.f58970b.mo23291o()) {
            sb.append(mo32578c(C0966R.string.azp));
        } else if (this.f58970b.mo23284h()) {
            sb.append(mo32578c(C0966R.string.awo));
        } else if (this.f58970b.mo23271R1()) {
            sb.append(mo32578c(C0966R.string.aw6));
        } else if (this.f58970b.mo23289m0()) {
            sb.append(mo32578c(C0966R.string.awz));
        } else if (this.f58970b.mo23285h2()) {
            sb.append(mo32578c(C0966R.string.ayu));
        }
        return sb.toString();
    }
}
