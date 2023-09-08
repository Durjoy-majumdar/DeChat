package d60;

import af0.C16459c;
import af0.C16463e;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c50.C54655b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import java.util.ArrayList;
import ky3.C88334c;
import p50.C62197e;
import y50.C66524m;

/* renamed from: d60.m0 */
public final class C58187m0 extends C58121a {

    /* renamed from: f */
    public final C58124b f166642f;

    /* renamed from: g */
    public final String f166643g = "MicroMsg.LiveLikeConfettiPlugin";

    /* renamed from: h */
    public final FrameLayout f166644h;

    /* renamed from: i */
    public final ArrayList<Bitmap> f166645i;

    /* renamed from: d60.m0$a */
    public /* synthetic */ class C58188a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f166646a;

        static {
            int[] iArr = new int[C58124b.C58125b.values().length];
            C58124b.C58125b bVar = C58124b.C58125b.UNKNOWN;
            iArr[32] = 1;
            f166646a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58187m0(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f166642f = bVar;
        this.f166644h = (FrameLayout) viewGroup.findViewById(C0966R.C0970id.fuw);
        this.f166645i = new ArrayList<>();
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        if (C58188a.f166646a[bVar.ordinal()] == 1) {
            int i = 100;
            int i2 = bundle != null ? bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_X") : 100;
            if (bundle != null) {
                i = bundle.getInt("PARAM_LIVE_LIKE_CONFETTI_Y");
            }
            String str = this.f166643g;
            Log.m105918d(str, "emitLikeConfetti containerMiddleX=" + i2 + " containerMiddleY=" + i);
            C16463e eVar = new C16463e(i2, i);
            ArrayList<Bitmap> arrayList = this.f166645i;
            Bitmap bitmap = arrayList.get(C88334c.f255322d.mo122723h(0, arrayList.size()));
            C87412m.m108593f(bitmap, "confettiBitmaps[Random.n…0, confettiBitmaps.size)]");
            C16459c cVar = new C16459c(this.f166287d.getContext(), new C58190n0(bitmap), eVar, this.f166644h);
            cVar.f43940l = 0.001f;
            cVar.f43941m = 999.99994f;
            cVar.mo14940f(0.0f, 0.0f);
            cVar.mo14941g(-360.0f, 50.0f);
            cVar.f43925D = 1000;
            cVar.f43938j = 1;
            cVar.mo14936b();
            if (this.f166642f.getLiveRole() == 0) {
                Log.m105924i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorClickLike");
                C115669n.INSTANCE.mo175913w(1381, 7, 1);
            }
        }
    }

    /* renamed from: x0 */
    public final void mo82949x0(LiveConfig liveConfig) {
        C87412m.m108594g(liveConfig, "config");
        boolean z = false;
        if (C54655b.f153178f1 != null) {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpv);
            int i = C66524m.C66525a.f191366a;
            int i2 = C66524m.C66525a.f191366a;
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeResource, i2, i2, true);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpw), i2, i2, true);
            Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpx), i2, i2, true);
            Bitmap createScaledBitmap4 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpy), i2, i2, true);
            Bitmap createScaledBitmap5 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpz), i2, i2, true);
            Bitmap createScaledBitmap6 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.f357237bq0), i2, i2, true);
            this.f166645i.add(createScaledBitmap);
            this.f166645i.add(createScaledBitmap2);
            this.f166645i.add(createScaledBitmap3);
            this.f166645i.add(createScaledBitmap4);
            this.f166645i.add(createScaledBitmap5);
            this.f166645i.add(createScaledBitmap6);
            return;
        }
        if (C62197e.f176819i1 != null) {
            z = true;
        }
        if (z) {
            Bitmap decodeResource2 = BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpv);
            int i3 = C66524m.C66525a.f191366a;
            int i4 = C66524m.C66525a.f191366a;
            Bitmap createScaledBitmap7 = Bitmap.createScaledBitmap(decodeResource2, i4, i4, true);
            Bitmap createScaledBitmap8 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpw), i4, i4, true);
            Bitmap createScaledBitmap9 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpx), i4, i4, true);
            Bitmap createScaledBitmap10 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpy), i4, i4, true);
            Bitmap createScaledBitmap11 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.bpz), i4, i4, true);
            Bitmap createScaledBitmap12 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(this.f166287d.getContext().getResources(), C0966R.C0969drawable.f357237bq0), i4, i4, true);
            this.f166645i.add(createScaledBitmap7);
            this.f166645i.add(createScaledBitmap8);
            this.f166645i.add(createScaledBitmap9);
            this.f166645i.add(createScaledBitmap10);
            this.f166645i.add(createScaledBitmap11);
            this.f166645i.add(createScaledBitmap12);
        }
    }
}
