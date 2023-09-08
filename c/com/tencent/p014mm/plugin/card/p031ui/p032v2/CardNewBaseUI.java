package com.tencent.p014mm.plugin.card.p031ui.p032v2;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import bh3.C113177k;
import cc0.C92411b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.card.p031ui.p033v3.VipCardListUI;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.CouponAndGiftCardListV4UI;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import di3.C86312j;
import gy3.C87412m;
import kotlin.Metadata;
import nj3.C76879j;
import p447aw.C103918d;
import p702ts.C78085c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/card/ui/v2/CardNewBaseUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-card_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI */
public abstract class CardNewBaseUI extends MMActivity {

    /* renamed from: d */
    public float f52073d = -85.0f;

    /* renamed from: e */
    public float f52074e = -1000.0f;

    /* renamed from: f */
    public boolean f52075f;

    /* renamed from: g */
    public C92411b.C92412a f52076g = new C18636b(this);

    /* renamed from: h */
    public final Runnable f52077h = new C18638d(this);

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI$a */
    public static final class C18635a implements C113177k.C113181e {

        /* renamed from: a */
        public final /* synthetic */ CardNewBaseUI f52078a;

        public C18635a(CardNewBaseUI cardNewBaseUI) {
            this.f52078a = cardNewBaseUI;
        }

        public final void onOp(Boolean bool) {
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            if (bool.booleanValue()) {
                this.f52078a.mo23459J7();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI$b */
    public static final class C18636b implements C92411b.C92412a {

        /* renamed from: d */
        public final /* synthetic */ CardNewBaseUI f52079d;

        public C18636b(CardNewBaseUI cardNewBaseUI) {
            this.f52079d = cardNewBaseUI;
        }

        public final boolean onGetLocation(boolean z, float f, float f2, int i, double d, double d2, double d3) {
            if (z) {
                CardNewBaseUI cardNewBaseUI = this.f52079d;
                cardNewBaseUI.f52073d = f2;
                cardNewBaseUI.f52074e = f;
                cardNewBaseUI.mo23460K7();
            }
            this.f52079d.mo23418H7(0, z);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI$c */
    public static final class C18637c implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ CardNewBaseUI f52080d;

        public C18637c(CardNewBaseUI cardNewBaseUI) {
            this.f52080d = cardNewBaseUI;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125785lI(this.f52080d.getContext(), 564);
        }
    }

    /* renamed from: com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI$d */
    public static final class C18638d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ CardNewBaseUI f52081d;

        public C18638d(CardNewBaseUI cardNewBaseUI) {
            this.f52081d = cardNewBaseUI;
        }

        public final void run() {
            Log.m105924i("MicroMsg.CardNewBaseUI", "remove location in task");
            CardNewBaseUI.m19403I7(this.f52081d, -3, false, 2, (Object) null);
        }
    }

    /* renamed from: I7 */
    public static /* synthetic */ void m19403I7(CardNewBaseUI cardNewBaseUI, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            cardNewBaseUI.mo23418H7(i, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onFinishLocationThings");
    }

    /* renamed from: H7 */
    public abstract void mo23418H7(int i, boolean z);

    /* renamed from: J7 */
    public final void mo23459J7() {
        Log.m105925i("MicroMsg.CardNewBaseUI", "request location: %s", Boolean.valueOf(this.f52075f));
        if (this.f52075f) {
            ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126407a(this.f52076g, false);
            C5139t.m5183e(22, 10);
            MMHandlerThread.postToMainThreadDelayed(this.f52077h, 4000);
        }
    }

    /* renamed from: K7 */
    public final void mo23460K7() {
        Log.m105924i("MicroMsg.CardNewBaseUI", "stop location");
        ((C78085c) C86312j.m106911c(C78085c.class)).mo108056ms().mo126408b(this.f52076g);
        MMHandlerThread.removeRunnable(this.f52077h);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.CardNewBaseUI", "requestCode: %s, resultCode: %s", Integer.valueOf(i), Integer.valueOf(i2));
        if (i == 563) {
            mo23459J7();
        } else if (i != 564) {
            super.onActivityResult(i, i2, intent);
        } else {
            this.f52075f = ((C103918d) C86312j.m106911c(C103918d.class)).Un0(getContext(), "android.permission.ACCESS_FINE_LOCATION", false);
        }
    }

    public void onCreate(Bundle bundle) {
        Class cls = C103918d.class;
        super.onCreate(bundle);
        if ((getContext() instanceof CouponAndGiftCardListV4UI) || (getContext() instanceof CardTicketListUI) || (getContext() instanceof HistoryCardListUI) || (getContext() instanceof CardInvalidTicketListUI)) {
            this.f52075f = false;
            return;
        }
        String str = null;
        if (!((C103918d) C86312j.m106911c(cls)).Fh0(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 69, true)) {
            m19403I7(this, -2, false, 2, (Object) null);
            return;
        }
        C103918d dVar = (C103918d) C86312j.m106911c(cls);
        String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        if (getContext() instanceof VipCardListUI) {
            str = getString(C0966R.string.b2b);
        }
        boolean Uu0 = dVar.Uu0(this, strArr, 69, (String) null, str);
        this.f52075f = Uu0;
        if (Uu0 && !((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.LOCAION, C113177k.C113178a.CARD, new C18635a(this))) {
            mo23459J7();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        MMHandlerThread.removeRunnable(this.f52077h);
        mo23460K7();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        if (i == 69) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                this.f52075f = false;
                C76879j.m92709C(this, getString(C0966R.string.ayo), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.bj_), false, new C18637c(this), (DialogInterface.OnClickListener) null);
                m19403I7(this, -2, false, 2, (Object) null);
                return;
            }
            this.f52075f = true;
            mo23459J7();
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
