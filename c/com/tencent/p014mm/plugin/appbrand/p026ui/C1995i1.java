package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.protocal.protobuf.RelievedBuySubInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import js0.C9515s;
import lb0.C88394b;
import sx3.C64186f0;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.i1 */
public final class C1995i1 extends RecyclerView.C16613e<RecyclerView.C16631z> {

    /* renamed from: d */
    public final Context f11917d;

    /* renamed from: e */
    public final LayoutInflater f11918e;

    /* renamed from: f */
    public List<? extends RelievedBuySubInfo> f11919f;

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.i1$a */
    public static final class C1996a implements C88394b.C88411m {

        /* renamed from: d */
        public final /* synthetic */ String f11920d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.C16631z f11921e;

        public C1996a(String str, RecyclerView.C16631z zVar) {
            this.f11920d = str;
            this.f11921e = zVar;
        }

        /* renamed from: b */
        public void mo1907b() {
            Log.m105918d("MicroMsg.AppBrand.AppBrandProfileRelievedBuyHalfScreenComponent", "onLoadFailed, iconUrl: " + this.f11920d);
        }

        /* renamed from: d */
        public void mo1908d() {
            Log.m105918d("MicroMsg.AppBrand.AppBrandProfileRelievedBuyHalfScreenComponent", "beforeLoadBitmap, iconUrl: " + this.f11920d);
        }

        public String key() {
            return C9515s.m9209a(this);
        }

        public void onBitmapLoaded(Bitmap bitmap) {
            Log.m105918d("MicroMsg.AppBrand.AppBrandProfileRelievedBuyHalfScreenComponent", "onBitmapLoaded, iconUrl: " + this.f11920d);
            if (bitmap == null) {
                Log.m105928w("MicroMsg.AppBrand.AppBrandProfileRelievedBuyHalfScreenComponent", "onBitmapLoaded, bitmap is null");
            } else if (!C87412m.m108589b(this.f11920d, ((C1997j1) this.f11921e).f11924z.getTag())) {
                Log.m105924i("MicroMsg.AppBrand.AppBrandProfileRelievedBuyHalfScreenComponent", "onBitmapLoaded, imageView already reused");
            } else {
                ((C1997j1) this.f11921e).f11924z.setImageBitmap(bitmap);
            }
        }
    }

    public C1995i1(Context context, LayoutInflater layoutInflater, int i, C8480h hVar) {
        if ((i & 2) != 0) {
            layoutInflater = LayoutInflater.from(context);
            C87412m.m108593f(layoutInflater, "from(context)");
        }
        C87412m.m108594g(context, "context");
        C87412m.m108594g(layoutInflater, "inflater");
        this.f11917d = context;
        this.f11918e = layoutInflater;
        this.f11919f = C64186f0.f181907d;
    }

    public int getItemCount() {
        return this.f11919f.size() + 2;
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 1;
        }
        return i == this.f11919f.size() + 1 ? 2 : 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        C87412m.m108594g(zVar, "holder");
        if (zVar instanceof C1997j1) {
            RelievedBuySubInfo relievedBuySubInfo = (RelievedBuySubInfo) this.f11919f.get(i - 1);
            String str = relievedBuySubInfo.icon;
            C1997j1 j1Var = (C1997j1) zVar;
            j1Var.f11924z.setTag(str);
            String str2 = C88394b.f255384g;
            C88394b.C88418q.f255427a.mo122796o(new C1996a(str, zVar), relievedBuySubInfo.icon, (C88394b.C88408j) null);
            j1Var.f11922A.setText(relievedBuySubInfo.title);
            j1Var.f11923B.setText(relievedBuySubInfo.desc);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 1) {
            return new C1994h1(this.f11917d);
        }
        if (i == 2) {
            return new C1993g1(this.f11917d);
        }
        View inflate = this.f11918e.inflate(C0966R.C0971layout.f6442ez, viewGroup, false);
        C87412m.m108593f(inflate, "inflater.inflate(R.layou…reen_item, parent, false)");
        return new C1997j1(inflate);
    }
}
