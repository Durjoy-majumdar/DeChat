package com.tencent.p014mm.wallet_core.model;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75226r;
import f21.C45741c;
import java.lang.ref.WeakReference;
import junit.framework.Assert;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p910lj.C76701a;

/* renamed from: com.tencent.mm.wallet_core.model.f0 */
public abstract class C75113f0 extends C117747y implements C1311n {

    /* renamed from: q */
    public static final String f221033q = MMApplicationContext.getResources().getString(C0966R.string.l_3);

    /* renamed from: d */
    public int f221034d = 0;

    /* renamed from: e */
    public int f221035e = 0;

    /* renamed from: f */
    public int f221036f = 0;

    /* renamed from: g */
    public String f221037g;

    /* renamed from: h */
    public String f221038h;

    /* renamed from: i */
    public boolean f221039i = true;

    /* renamed from: j */
    public boolean f221040j = false;

    /* renamed from: n */
    public C47350c f221041n;

    /* renamed from: o */
    public C11385n f221042o;

    /* renamed from: p */
    public WeakReference<MMActivity> f221043p;

    /* renamed from: com.tencent.mm.wallet_core.model.f0$a */
    public interface C75114a<T extends C117747y> {
        /* renamed from: a */
        void mo66496a(int i, int i2, String str, T t);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f221042o = nVar;
        Assert.assertNotNull("rr can't be null!", this.f221041n);
        C75226r.m90205e(this.f221041n.getType());
        return dispatch(gVar, this.f221041n, this);
    }

    /* renamed from: j1 */
    public abstract void mo66607j1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr);

    /* renamed from: k1 */
    public abstract void mo66608k1(C114799u uVar);

    /* renamed from: l1 */
    public C75113f0 mo104820l1(C75114a aVar) {
        if (this.f221040j) {
            aVar.mo66496a(this.f221034d, this.f221035e, this.f221037g, this);
        }
        return this;
    }

    /* renamed from: m1 */
    public void mo104821m1(MMActivity mMActivity) {
        this.f221043p = new WeakReference<>(mMActivity);
    }

    /* renamed from: n1 */
    public boolean mo73087n1() {
        return true;
    }

    /* renamed from: o1 */
    public boolean mo104822o1() {
        return true;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        MMActivity mMActivity;
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        if (i4 == 0 && i5 == 0) {
            this.f221039i = false;
        }
        if (!this.f221039i) {
            C114799u uVar2 = uVar;
            mo66608k1(uVar);
            if (this.f221036f != 0) {
                this.f221040j = true;
            }
        } else {
            C114799u uVar3 = uVar;
        }
        this.f221034d = i5;
        this.f221035e = i4;
        this.f221037g = str2;
        Log.m105925i("MicroMsg.NetSceneNewPayBase", "errType: %s, errCode: %s, errMsg: %s, retCode: %s, retMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(this.f221036f), this.f221038h);
        mo66607j1(i, i2, i3, str, uVar, bArr);
        uVar.getType();
        WeakReference<MMActivity> weakReference = this.f221043p;
        if (weakReference != null && (mMActivity = weakReference.get()) != null) {
            if (this.f221039i) {
                Log.m105928w("MicroMsg.NetSceneNewPayBase", "show net error alert");
                C76879j.m92713G(mMActivity, f221033q, (String) null, false, new C75107d0(this, mMActivity));
            } else if (this.f221040j && !Util.isNullOrNil(this.f221038h)) {
                if (mo73088p1()) {
                    Log.m105928w("MicroMsg.NetSceneNewPayBase", "show resp error toast");
                    C76701a.makeText((Context) mMActivity, (CharSequence) this.f221038h, 1).show();
                } else if (mo104822o1()) {
                    Log.m105928w("MicroMsg.NetSceneNewPayBase", "show resp error alert");
                    C76879j.m92711E(mMActivity, this.f221038h, (String) null, mMActivity.getResources().getString(C0966R.string.kzm), false, new C75111e0(this, mMActivity));
                }
            }
        }
    }

    /* renamed from: p1 */
    public boolean mo73088p1() {
        return this instanceof C45741c;
    }

    /* renamed from: q1 */
    public C75113f0 mo104823q1(C75114a aVar) {
        if (!this.f221039i && !this.f221040j) {
            aVar.mo66496a(this.f221034d, this.f221035e, this.f221037g, this);
        }
        return this;
    }
}
