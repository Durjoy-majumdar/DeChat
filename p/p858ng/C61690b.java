package p858ng;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.modelcdntran.C55377a0;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;

/* renamed from: ng.b */
public final class C61690b implements C55377a0 {

    /* renamed from: a */
    public final /* synthetic */ C61691c f175386a;

    /* renamed from: b */
    public final /* synthetic */ C61727v f175387b;

    public C61690b(C61691c cVar, C61727v vVar) {
        this.f175386a = cVar;
        this.f175387b = vVar;
    }

    /* renamed from: a */
    public void mo76632a(C92798v vVar) {
        AppCompatActivity activity = this.f175386a.getActivity();
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(activity).mo75002a(C61691c.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…lleryDataUIC::class.java)");
        ((C61691c) a).mo86622c3().dispatch(new C61725t(this.f175387b.f175436a));
    }

    /* renamed from: b */
    public void mo86620b(C92798v vVar) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0028, code lost:
        r4 = r7.f267134e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86621c(com.tencent.p014mm.modelcdntran.C92798v r7) {
        /*
            r6 = this;
            ng.c r0 = r6.f175386a
            androidx.appcompat.app.AppCompatActivity r0 = r0.getActivity()
            java.lang.String r1 = "activity"
            gy3.C87412m.m108594g(r0, r1)
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r0 = r1.mo62444c(r0)
            java.lang.Class<ng.c> r1 = p858ng.C61691c.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            java.lang.String r1 = "UICProvider.of(activity)…lleryDataUIC::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            ng.c r0 = (p858ng.C61691c) r0
            com.tencent.mm.sdk.statecenter.UIStateCenter r0 = r0.mo86622c3()
            ng.y r1 = new ng.y
            r2 = 0
            if (r7 == 0) goto L_0x002f
            gi.c r4 = r7.f267134e
            if (r4 == 0) goto L_0x002f
            long r4 = r4.field_finishedLength
            goto L_0x0030
        L_0x002f:
            r4 = r2
        L_0x0030:
            if (r7 == 0) goto L_0x0038
            gi.c r7 = r7.f267134e
            if (r7 == 0) goto L_0x0038
            long r2 = r7.field_toltalLength
        L_0x0038:
            r1.<init>(r4, r2)
            r0.dispatch(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p858ng.C61690b.mo86621c(com.tencent.mm.modelcdntran.v):void");
    }
}
