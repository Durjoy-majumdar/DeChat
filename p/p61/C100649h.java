package p61;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.FocusMeteringAction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.EmoticonStoreActionStruct;
import com.tencent.p014mm.plugin.emoji.model.C93101b;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.banner.EmojiStoreV3BannerLayoutManager;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.banner.EmojiStoreV3BannerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import o61.C100295b;
import p61.C100652i;
import q61.C101037a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C101754a80;
import te3.C52077y70;

/* renamed from: p61.h */
public final class C100649h extends C100657j<C100639a> {

    /* renamed from: B */
    public final Context f294857B;

    /* renamed from: C */
    public final String f294858C = "MicroMsg.EmojiStoreV3BannerHolder";

    /* renamed from: D */
    public final EmojiStoreV3BannerView f294859D;

    /* renamed from: E */
    public final C13601g f294860E;

    /* renamed from: F */
    public boolean f294861F;

    /* renamed from: G */
    public final C100641b f294862G;

    /* renamed from: p61.h$a */
    public static final class C100650a extends C87413o implements C32224a<C100295b> {

        /* renamed from: d */
        public final /* synthetic */ C100649h f294863d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100650a(C100649h hVar) {
            super(0);
            this.f294863d = hVar;
        }

        public Object invoke() {
            Context context = this.f294863d.f294859D.getContext();
            C87412m.m108593f(context, "context");
            return new C100295b(context, new LinkedList());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100649h(Context context, View view, C100640a0 a0Var) {
        super(view, a0Var);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(view, "itemView");
        this.f294857B = context;
        View findViewById = view.findViewById(C0966R.C0970id.lyh);
        C87412m.m108593f(findViewById, "itemView.findViewById(R.…moji_store_header_banner)");
        this.f294859D = (EmojiStoreV3BannerView) findViewById;
        this.f294860E = C36568h.m40985a(new C100650a(this));
        this.f294861F = true;
        this.f294862G = new C100641b();
    }

    /* renamed from: y */
    public void mo140091y(C100684y yVar, List<Object> list) {
        C93101b bVar;
        LinearLayoutManager linearLayoutManager;
        int E;
        C100684y yVar2 = yVar;
        List<Object> list2 = list;
        C87412m.m108594g(yVar2, "item");
        C87412m.m108594g(list2, "payloads");
        this.f294874A = yVar2;
        C100639a aVar = null;
        int i = -1;
        if (list.isEmpty()) {
            if (yVar2 instanceof C100639a) {
                aVar = (C100639a) yVar2;
            }
            if (aVar != null) {
                List<? extends C52077y70> list3 = aVar.f294833a;
                List<? extends C101754a80> list4 = aVar.f294834b;
                int dimension = (int) this.f294857B.getResources().getDimension(C0966R.dimen.f4302za);
                EmojiStoreV3BannerView.C93268a aVar2 = r8;
                EmojiStoreV3BannerView.C93268a aVar3 = new EmojiStoreV3BannerView.C93268a(false, false, false, 0, 0, 0, 0, 127, (C8480h) null);
                aVar2.f269063c = true;
                aVar2.f269062b = true;
                aVar2.f269066f = dimension;
                aVar2.f269061a = true;
                aVar2.f269067g = dimension;
                aVar2.f269064d = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
                this.f44854d.setBackgroundResource(C0966R.color.BW_93);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) this.f294857B.getResources().getDimension(C0966R.dimen.f4301z_));
                layoutParams.setMargins(0, (int) this.f294857B.getResources().getDimension(C0966R.dimen.f4304zc), 0, 0);
                this.f294859D.setLayoutParams(layoutParams);
                if (this.f294861F) {
                    this.f294859D.mo127904b(aVar2, mo140092z());
                    this.f294859D.setSizeResolver(this.f294862G);
                }
                mo140092z().mo139551G4(mo140092z().mo139550F4(list3, list4));
                this.f294861F = false;
                mo140092z().f293810i = true;
                mo140092z().f293809h = aVar.f294835c + 10000;
                this.f294859D.mo127903a(this.f294862G.f294934c);
                return;
            }
            return;
        }
        Object obj = list2.get(list.size() - 1);
        if (obj instanceof C100652i.C100654b) {
            Log.m105918d(this.f294858C, "onBind: StartAutoSlide");
            Log.m105918d(this.f294858C, "startPlayBanner");
            this.f294859D.mo127905c();
        } else if (obj instanceof C100652i.C100655c) {
            Log.m105918d(this.f294858C, "onBind: StopAutoSlide");
            Log.m105918d(this.f294858C, "stopPlayBanner");
            EmojiStoreV3BannerView.C93269b bVar2 = this.f294859D.f269055h;
            if (bVar2 != null) {
                bVar2.removeCallbacksAndMessages((Object) null);
            }
        } else if (obj instanceof C100652i.C100653a) {
            Log.m105918d(this.f294858C, "onBind: ReportExpose18662");
            C100295b z = mo140092z();
            RecyclerView.LayoutManager currentBannerLayoutManager = this.f294859D.getCurrentBannerLayoutManager();
            int i2 = this.f294862G.f294934c + 1;
            if (currentBannerLayoutManager == null || !z.f293810i) {
                Log.m105924i(z.f293807f, "reportExpose18662 failed, recyclerview layoutManager null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (currentBannerLayoutManager instanceof EmojiStoreV3BannerLayoutManager) {
                i = ((EmojiStoreV3BannerLayoutManager) currentBannerLayoutManager).mo23530s();
                for (int i3 = 0; i3 < i2; i3++) {
                    arrayList.add(Integer.valueOf((i + i3) % z.getItemCount()));
                }
            } else if ((currentBannerLayoutManager instanceof LinearLayoutManager) && (i = linearLayoutManager.mo16957C()) <= (E = (linearLayoutManager = (LinearLayoutManager) currentBannerLayoutManager).mo16959E())) {
                int i4 = i;
                while (true) {
                    arrayList.add(Integer.valueOf(i4));
                    if (i4 == E) {
                        break;
                    }
                    i4++;
                }
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int intValue = ((Number) arrayList.get(i5)).intValue();
                    if (intValue < z.getItemCount() && intValue >= 0 && (bVar = z.f293806e.get(intValue)) != null) {
                        if (intValue != i) {
                            sb.append("#");
                            sb4.append("#");
                            sb5.append("#");
                        }
                        sb.append(intValue);
                        sb4.append(C101037a.m132403a(bVar));
                        C101754a80 a802 = bVar.f268227a;
                        sb5.append(a802 != null ? a802.f297839e : null);
                    }
                }
                String str = z.f293807f;
                Log.m105918d(str, "reportExpose18662 index:" + sb);
                int i6 = z.f293809h;
                String sb6 = sb.toString();
                C87412m.m108593f(sb6, "indexString.toString()");
                String sb7 = sb4.toString();
                C87412m.m108593f(sb7, "pidString.toString()");
                String sb8 = sb5.toString();
                C87412m.m108593f(sb8, "infoString.toString()");
                EmoticonStoreActionStruct emoticonStoreActionStruct = new EmoticonStoreActionStruct();
                emoticonStoreActionStruct.f265474j = (long) i6;
                emoticonStoreActionStruct.f265470f = 1;
                emoticonStoreActionStruct.f265469e = 1;
                emoticonStoreActionStruct.f265468d = C101037a.f295825a;
                emoticonStoreActionStruct.mo126613s(sb6);
                emoticonStoreActionStruct.mo126618x(sb7);
                emoticonStoreActionStruct.mo126614t(sb8);
                emoticonStoreActionStruct.mo86054n();
            }
        }
    }

    /* renamed from: z */
    public final C100295b mo140092z() {
        return (C100295b) ((C36570n) this.f294860E).getValue();
    }
}
