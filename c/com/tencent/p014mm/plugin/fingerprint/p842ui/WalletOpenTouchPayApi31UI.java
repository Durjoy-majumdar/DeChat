package com.tencent.p014mm.plugin.fingerprint.p842ui;

import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import kotlin.Metadata;
import nj3.C88989a;
import ob0.C117747y;
import p623nr.C47294g;
import p623nr.C76955f;
import pv2.C77290d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import v53.C78342e0;
import wt1.C78664e0;
import wt1.C78670h0;
import wt1.C78697n0;
import wt1.C78709x;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/fingerprint/ui/WalletOpenTouchPayApi31UI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C88989a(7)
/* renamed from: com.tencent.mm.plugin.fingerprint.ui.WalletOpenTouchPayApi31UI */
public final class WalletOpenTouchPayApi31UI extends WalletBaseUI {

    /* renamed from: d */
    public final C13601g f198213d = C36568h.m40985a(new C68980a(this));

    /* renamed from: com.tencent.mm.plugin.fingerprint.ui.WalletOpenTouchPayApi31UI$a */
    public static final class C68980a extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ WalletOpenTouchPayApi31UI f198214d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68980a(WalletOpenTouchPayApi31UI walletOpenTouchPayApi31UI) {
            super(0);
            this.f198214d = walletOpenTouchPayApi31UI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f198214d.getIntent().getIntExtra("key_enter_scene", 0));
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3 = i;
        int i4 = i2;
        C117747y yVar2 = yVar;
        if (((Number) ((C36570n) this.f198213d).getValue()).intValue() == 1) {
            C78709x xVar = (C78709x) component(C78709x.class);
            xVar.getClass();
            String string = Util.isNullOrNil(str) ? xVar.getString(C0966R.string.eud) : str;
            if (yVar2 instanceof C76955f) {
                if (i3 == 0 && i4 == 0) {
                    Log.m105924i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "get challenge success");
                    if (Util.isNullOrNil(((C76955f) yVar2).mo73581w0())) {
                        xVar.mo108647c3(new C78709x.C78719b.C78721b(xVar.getString(C0966R.string.eud)));
                        return false;
                    }
                    MMHandlerThread.postToMainThread(new C78664e0(xVar, yVar2));
                    return false;
                }
                Log.m105920e("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: failed get challenge");
                C77290d.m93109g(7, i3, i4, "get challenge failed");
                xVar.mo108647c3(new C78709x.C78719b.C78721b(string));
                return false;
            } else if (yVar2 instanceof C47294g) {
                if (i4 == 0 && i3 == 0) {
                    Log.m105924i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: open success");
                    C77290d.m93110h();
                    C77290d.m93109g(0, 0, 0, "OK");
                    xVar.mo108648d3(C78709x.C78710a.C78711a.f230421a);
                    return false;
                }
                Log.m105924i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "hy: open");
                C77290d.m93109g(8, i3, i4, "open fp pay failed");
                xVar.mo108647c3(new C78709x.C78719b.C78721b(""));
                return false;
            } else if (!(yVar2 instanceof C78342e0)) {
                return false;
            } else {
                xVar.mo108648d3(C78709x.C78710a.C78715e.f230426a);
                return false;
            }
        } else {
            C78670h0 h0Var = (C78670h0) component(C78670h0.class);
            h0Var.getClass();
            String string2 = Util.isNullOrNil(str) ? h0Var.getString(C0966R.string.eud) : str;
            if (yVar2 instanceof C76955f) {
                if (i3 == 0 && i4 == 0) {
                    Log.m105924i("MicroMsg.WalletOpenTouchPayUIC", "get challenge success");
                    if (Util.isNullOrNil(((C76955f) yVar2).mo73581w0())) {
                        h0Var.mo108628c3(new C78670h0.C78680b.C78682b(h0Var.getString(C0966R.string.eud)));
                        return false;
                    }
                    MMHandlerThread.postToMainThread(new C78697n0(h0Var, yVar2));
                    return false;
                }
                Log.m105920e("MicroMsg.WalletOpenTouchPayUIC", "hy: failed get challenge");
                C77290d.m93109g(7, i3, i4, "get challenge failed");
                h0Var.mo108628c3(new C78670h0.C78680b.C78682b(string2));
                return false;
            } else if (yVar2 instanceof C47294g) {
                if (i4 == 0 && i3 == 0) {
                    Log.m105924i("MicroMsg.WalletOpenTouchPayUIC", "hy: open success");
                    C77290d.m93110h();
                    C77290d.m93109g(0, 0, 0, "OK");
                    h0Var.mo108629d3(C78670h0.C78671a.C78672a.f230374a);
                    return false;
                }
                Log.m105924i("MicroMsg.WalletOpenTouchPayUIC", "hy: open");
                C77290d.m93109g(8, i3, i4, "open fp pay failed");
                h0Var.mo108628c3(new C78670h0.C78680b.C78682b(""));
                return false;
            } else if (!(yVar2 instanceof C78342e0)) {
                return false;
            } else {
                h0Var.mo108629d3(C78670h0.C78671a.C78676e.f230379a);
                return false;
            }
        }
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        if (((Number) ((C36570n) this.f198213d).getValue()).intValue() == 1) {
            hashSet.add(C78709x.class);
        } else {
            hashSet.add(C78670h0.class);
        }
    }
}
