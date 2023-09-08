package p186kr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.C0123n0;
import androidx.lifecycle.C39630m0;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOperationUI;
import com.tencent.p014mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import hn1.C8614b;
import j20.C117292a;
import k20.C9556a;
import ln1.C21445b;
import p147ea.C7606d;
import tm1.C14045a;

@C86522b
/* renamed from: kr.f */
public final class C10401f extends C86301e implements C7606d, C0123n0 {

    /* renamed from: d */
    public final C39630m0 f31626d = new C39630m0();

    /* renamed from: Dd */
    public boolean mo8737Dd(int i) {
        return i / 100000 == 94;
    }

    /* renamed from: Ej */
    public int mo8738Ej(int i, int i2) {
        return (i * 100000) + C14045a.f39395a.mo13453a(i, i2);
    }

    public int K80(int i) {
        return mo8738Ej(i, 0);
    }

    /* renamed from: Yi */
    public void mo8740Yi(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        Intent intent2 = !(context instanceof Activity) ? intent : null;
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderLiveOperationUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLiveOperationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLiveOperationUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* renamed from: aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8741aa(android.content.Context r14, android.content.Intent r15) {
        /*
            r13 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.Class<ht1.t3> r0 = ht1.C60204t3.class
            mr.q r1 = p204mr.C61570q.SQUARE
            r2 = 0
            java.lang.Class<mr.i> r3 = p204mr.C61567i.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            mr.i r3 = (p204mr.C61567i) r3
            java.lang.String r4 = ""
            r3.mo86500Tw(r1, r4, r2)
            ln1.b r1 = ln1.C21445b.f60694a
            r3 = 1
            r4 = 0
            r1.mo33620i(r3, r4)
            if (r15 == 0) goto L_0x0029
            java.lang.String r1 = "KEY_ENTER_LIVE_PARAM_INTENT_DATA"
            android.os.Parcelable r1 = r15.getParcelableExtra(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            goto L_0x002a
        L_0x0029:
            r1 = r2
        L_0x002a:
            if (r1 != 0) goto L_0x008b
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r1 = r1.Nt0()
            java.lang.String r5 = "FinderLiveEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r1 = r1.mo77227G5(r5)
            if (r1 == 0) goto L_0x0051
            te3.nn1 r5 = r1.mo77308o2(r5)
            if (r5 == 0) goto L_0x0051
            te3.xi1 r5 = r1.field_ctrInfo
            int r5 = r5.f144670e
            r6 = 16
            if (r5 != r6) goto L_0x0051
            te3.yi1 r1 = r1.f158585F
            goto L_0x0052
        L_0x0051:
            r1 = r2
        L_0x0052:
            if (r1 == 0) goto L_0x005a
            int r5 = r1.f186559t
            if (r5 != r3) goto L_0x005a
            r5 = 1
            goto L_0x005b
        L_0x005a:
            r5 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x0067
            if (r1 == 0) goto L_0x0062
            int r1 = r1.f186545G
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            if (r1 != r3) goto L_0x0067
            r1 = 1
            goto L_0x0068
        L_0x0067:
            r1 = 0
        L_0x0068:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "checkRequestRefreshNewEntrance isNeedDisableRedPreload: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "FinderNearByActivityRouter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            if (r1 != 0) goto L_0x008b
            java.lang.Class<ps3.b> r1 = ps3.C12005b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ps3.b r1 = (ps3.C12005b) r1
            r1.mo11145ue(r3)
        L_0x008b:
            if (r15 != 0) goto L_0x0092
            android.content.Intent r15 = new android.content.Intent
            r15.<init>()
        L_0x0092:
            boolean r1 = r14 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0097
            r2 = r15
        L_0x0097:
            if (r2 == 0) goto L_0x009e
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r3)
        L_0x009e:
            di3.d r2 = di3.C86312j.m106911c(r0)
            ht1.t3 r2 = (ht1.C60204t3) r2
            boolean r2 = r2.Kv0(r14)
            if (r2 != 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.t3 r0 = (ht1.C60204t3) r0
            r1 = r14
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r0.iu0(r1)
            if (r0 == 0) goto L_0x00bc
            goto L_0x00c2
        L_0x00bc:
            java.lang.Class<com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI> r0 = com.tencent.p014mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI.class
            r15.setClass(r14, r0)
            goto L_0x00c7
        L_0x00c2:
            java.lang.Class<com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceWithAffinityUI> r0 = com.tencent.p014mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceWithAffinityUI.class
            r15.setClass(r14, r0)
        L_0x00c7:
            k20.a r0 = new k20.a
            r0.<init>()
            r0.mo10233c(r15)
            java.lang.Object[] r6 = r0.mo10232b()
            java.lang.String r7 = "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter"
            java.lang.String r8 = "enterLiveEntranceUI"
            java.lang.String r9 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r10 = "Undefined"
            java.lang.String r11 = "startActivity"
            java.lang.String r12 = "(Landroid/content/Intent;)V"
            r5 = r14
            j20.C117292a.m165358d(r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r15 = r0.mo10231a(r4)
            android.content.Intent r15 = (android.content.Intent) r15
            r14.startActivity(r15)
            java.lang.String r1 = "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter"
            java.lang.String r2 = "enterLiveEntranceUI"
            java.lang.String r3 = "(Landroid/content/Context;Landroid/content/Intent;)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r14
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p186kr.C10401f.mo8741aa(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: gH */
    public void mo8742gH(Context context, Intent intent) {
        C87412m.m108594g(context, "context");
        if (intent == null) {
            intent = new Intent();
        }
        C8614b bVar = C8614b.f27717a;
        bVar.mo9486k(intent);
        C21445b bVar2 = C21445b.f60694a;
        Intent intent2 = null;
        bVar2.mo33620i(true, false);
        if (!bVar2.mo33612a()) {
            bVar.mo9487l(intent, 88890, 0, "推荐");
        }
        if (!(context instanceof Activity)) {
            intent2 = intent;
        }
        if (intent2 != null) {
            intent2.addFlags(268435456);
        }
        intent.setClass(context, FinderLiveFindPageUI.class);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLiveFindPageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterFinderLiveFindPageUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public C39630m0 getViewModelStore() {
        return this.f31626d;
    }

    /* renamed from: rq */
    public int mo8743rq() {
        return C14045a.f39395a.mo13453a(0, 0);
    }
}
