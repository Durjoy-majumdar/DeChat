package cs0;

import a14.C53895h;
import a14.C53934p0;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54218t;
import androidx.recyclerview.widget.RecyclerView;
import as0.C39635c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.appbrand.p026ui.privacy.revoke.AppBrandUserInfoRevokePage;
import com.tencent.p014mm.sdk.platformtools.Log;
import cs0.C45168h0;
import cs0.C45174j;
import fy3.C32224a;
import gy3.C87412m;
import hi3.C87515a;
import kg3.C76577a;
import lb0.C88393a;
import lb0.C88394b;
import lb0.C88431k;
import nj3.C76879j;
import nj3.C76912y0;
import rx3.C13603j;
import te3.v75;
import uo3.C78253a;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: cs0.m */
public final class C45181m extends RecyclerView.C16613e<C45168h0> {

    /* renamed from: d */
    public final AppBrandUserInfoRevokePage f122487d;

    /* renamed from: e */
    public C45179k f122488e;

    /* renamed from: f */
    public final C45185d f122489f;

    /* renamed from: g */
    public Boolean f122490g;

    /* renamed from: h */
    public boolean f122491h;

    /* renamed from: i */
    public Dialog f122492i;

    /* renamed from: cs0.m$a */
    public static final class C45182a<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C45181m f122493d;

        public C45182a(C45181m mVar) {
            this.f122493d = mVar;
        }

        public void onChanged(Object obj) {
            v75 v75 = (v75) obj;
            Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#usageInfoObservable");
            if (!C45152a0.f122426a.mo70660e(v75)) {
                Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#usageInfoObservable, rawUsageInfo is null or invalid");
                return;
            }
            C45181m mVar = this.f122493d;
            C87412m.m108593f(v75, "rawUsageInfo");
            mVar.f122488e = new C45179k(v75);
            this.f122493d.notifyDataSetChanged();
        }
    }

    /* renamed from: cs0.m$b */
    public static final class C45183b<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C45181m f122494d;

        public C45183b(C45181m mVar) {
            this.f122494d = mVar;
        }

        public void onChanged(Object obj) {
            C30911z zVar = (C30911z) obj;
            Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#pageModeObservable, pageMode: " + zVar);
            if (zVar == null) {
                Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#pageModeObservable, pageMode is null");
            } else {
                this.f122494d.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: cs0.m$c */
    public static final class C45184c<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ C45181m f122495d;

        public C45184c(C45181m mVar) {
            this.f122495d = mVar;
        }

        public void onChanged(Object obj) {
            C45155b0 b0Var = (C45155b0) obj;
            Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#revokeStateObservable, revokeState: " + b0Var);
            if (b0Var == null) {
                Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "onChanged#revokeStateObservable, revokeState is null");
                return;
            }
            int ordinal = b0Var.ordinal();
            if (ordinal == 0) {
                C45181m mVar = this.f122495d;
                mVar.getClass();
                Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "showRevokingDialog");
                Dialog dialog = mVar.f122492i;
                if (dialog != null) {
                    dialog.dismiss();
                }
                mVar.f122492i = null;
                mVar.f122492i = C76879j.m92723Q(C39635c.m42240d(mVar.f122487d), (String) null, (String) null, true, false, (DialogInterface.OnCancelListener) null);
            } else if (ordinal == 1) {
                C45181m mVar2 = this.f122495d;
                mVar2.getClass();
                Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "showRevokeSuccessToast");
                Dialog dialog2 = mVar2.f122492i;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                mVar2.f122492i = null;
                C76912y0.m92769h(C39635c.m42240d(mVar2.f122487d), mVar2.f122487d.getString(C0966R.string.a9f), C0966R.raw.icons_filled_done);
            } else if (ordinal == 2) {
                C45181m mVar3 = this.f122495d;
                mVar3.getClass();
                Log.m105924i("MicroMsg.AppBrandUserInfoRevokePage", "showRevokeFailureToast");
                Dialog dialog3 = mVar3.f122492i;
                if (dialog3 != null) {
                    dialog3.dismiss();
                }
                mVar3.f122492i = null;
                C76912y0.m92769h(C39635c.m42240d(mVar3.f122487d), mVar3.f122487d.getString(C0966R.string.a9d), C0966R.raw.icons_filled_error);
            }
        }
    }

    /* renamed from: cs0.m$d */
    public static final class C45185d {

        /* renamed from: a */
        public boolean f122496a;

        /* renamed from: b */
        public final /* synthetic */ C45180l f122497b;

        public C45185d(C45180l lVar) {
            this.f122497b = lVar;
        }
    }

    public C45181m(AppBrandUserInfoRevokePage appBrandUserInfoRevokePage, C45180l lVar) {
        C87412m.m108594g(appBrandUserInfoRevokePage, "host");
        C87412m.m108594g(lVar, "titleHeightMeasureListener");
        this.f122487d = appBrandUserInfoRevokePage;
        this.f122489f = new C45185d(lVar);
        appBrandUserInfoRevokePage.mo63404K().f122461f.observe(appBrandUserInfoRevokePage.getViewLifecycleOwner(), new C45182a(this));
        appBrandUserInfoRevokePage.mo63404K().f122463h.observe(appBrandUserInfoRevokePage.getViewLifecycleOwner(), new C45183b(this));
        appBrandUserInfoRevokePage.mo63404K().f122465j.observe(appBrandUserInfoRevokePage.getViewLifecycleOwner(), new C45184c(this));
    }

    /* renamed from: F4 */
    public static final void m50001F4(C45181m mVar, MenuItem menuItem, C32224a aVar) {
        mVar.getClass();
        boolean z = false;
        if (menuItem != null && menuItem.getGroupId() == 0) {
            z = true;
        }
        if (!z || menuItem.getItemId() != 0) {
            Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onRevokeMenuClick, not revoke menu");
        } else {
            aVar.invoke();
        }
    }

    public int getItemCount() {
        C45179k kVar = this.f122488e;
        if (kVar != null) {
            return kVar.f122485a;
        }
        return 0;
    }

    public int getItemViewType(int i) {
        try {
            C45179k kVar = this.f122488e;
            if (kVar == null) {
                Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "getItemViewType, curUsageInfo is null");
                return super.getItemViewType(i);
            }
            C45174j jVar = kVar.f122486b.get(i);
            C87412m.m108593f(jVar, "flattenList[index]");
            C45174j jVar2 = jVar;
            if (jVar2 instanceof C45174j.C45175a) {
                return 0;
            }
            if (jVar2 instanceof C45174j.C45178d) {
                return 1;
            }
            if (jVar2 instanceof C45174j.C45177c) {
                return 2;
            }
            if (jVar2 instanceof C45174j.C45176b) {
                return 3;
            }
            throw new C13603j();
        } catch (Exception e) {
            Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "getItemViewType, position: " + i + " fail since " + e);
            return super.getItemViewType(i);
        }
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2;
        C45168h0 h0Var = (C45168h0) zVar;
        C87412m.m108594g(h0Var, "holder");
        try {
            C45179k kVar = this.f122488e;
            if (kVar == null) {
                Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, curUsageInfo is null");
                return;
            }
            C45174j jVar = kVar.f122486b.get(i);
            C87412m.m108593f(jVar, "flattenList[index]");
            C45174j jVar2 = jVar;
            if (h0Var instanceof C45168h0.C45169a) {
                if (!(jVar2 instanceof C45174j.C45175a)) {
                    Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, flattenedItem is not header");
                    return;
                }
                C45168h0.C45169a aVar = (C45168h0.C45169a) h0Var;
                ImageView imageView = aVar.f122471A;
                if (imageView != null) {
                    String str = C88394b.f255384g;
                    C88394b.C88418q.f255427a.mo122786b(imageView, ((C45174j.C45175a) jVar2).f122481a.f143917f, C88393a.m110230a(), C88431k.f255437d);
                }
                TextView textView = aVar.f122472B;
                if (textView != null) {
                    textView.setText(((C45174j.C45175a) jVar2).f122481a.f143916e);
                    textView.post(new C45192s(h0Var));
                }
                TextView textView2 = aVar.f122473C;
                if (textView2 != null) {
                    textView2.post(new C45193t(this, h0Var));
                }
            } else if (h0Var instanceof C45168h0.C45172d) {
                if (!(jVar2 instanceof C45174j.C45178d)) {
                    Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, flattenedItem is not UserInfo");
                    return;
                }
                C30911z value = this.f122487d.mo63404K().f122463h.getValue();
                if (value == null) {
                    Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, pageMode is null");
                    return;
                }
                C45198y yVar = new C45198y(this, jVar2);
                C45168h0.C45172d dVar = (C45168h0.C45172d) h0Var;
                TextView textView3 = dVar.f122477A;
                if (textView3 != null) {
                    textView3.setText(((C45174j.C45178d) jVar2).f122484a.f122469c.f141805e);
                }
                TextView textView4 = dVar.f122478B;
                if (textView4 != null) {
                    textView4.setVisibility(7 == ((C45174j.C45178d) jVar2).f122484a.f122469c.f141806f ? 0 : 8);
                }
                int ordinal = value.ordinal();
                if (ordinal == 0) {
                    WeImageView weImageView = dVar.f122479z;
                    if (weImageView != null) {
                        weImageView.setPadding(0, 0, 0, 0);
                        C53895h.m60466d(C54218t.m60906a(this.f122487d), (C66212f) null, (C53934p0) null, new C45195u(jVar2, h0Var, (C15601d<? super C45195u>) null), 3, (Object) null);
                        weImageView.setImportantForAccessibility(2);
                        weImageView.setOnClickListener((View.OnClickListener) null);
                    }
                    View view = h0Var.f44854d;
                    C87412m.m108593f(view, "holder.itemView");
                    C45188p pVar = new C45188p(view, view.getContext());
                    pVar.mo108275j(view, new C45186n(this), new C45187o(this, yVar));
                    view.setTag(pVar);
                } else if (ordinal == 1) {
                    WeImageView weImageView2 = dVar.f122479z;
                    if (weImageView2 != null) {
                        int f = C76577a.m92155f(C39635c.m42240d(this.f122487d), C0966R.dimen.f3701bu);
                        weImageView2.setPadding(f, f, f, f);
                        weImageView2.setImageDrawable(C87515a.m108835e(this.f122487d.getResources(), C0966R.raw.app_brand_star_delete, 3.0f / this.f122487d.getResources().getDisplayMetrics().density));
                        weImageView2.setImportantForAccessibility(1);
                        weImageView2.setContentDescription(this.f122487d.getString(C0966R.string.a9e));
                        weImageView2.setOnClickListener(new C7127v(yVar));
                    }
                    View view2 = h0Var.f44854d;
                    C87412m.m108593f(view2, "holder.itemView");
                    if (view2.getTag() instanceof C78253a) {
                        view2.setOnTouchListener((View.OnTouchListener) null);
                        view2.setOnLongClickListener((View.OnLongClickListener) null);
                        view2.setLongClickable(false);
                    }
                }
            } else if (h0Var instanceof C45168h0.C45171c) {
                if (!(jVar2 instanceof C45174j.C45177c)) {
                    Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, flattenedItem is not PluginTitle");
                    return;
                }
                TextView textView5 = ((C45168h0.C45171c) h0Var).f122476z;
                if (textView5 != null) {
                    textView5.setText(this.f122487d.getString(C0966R.string.a9b, ((C45174j.C45177c) jVar2).f122483a));
                }
            } else if (h0Var instanceof C45168h0.C45170b) {
                C30911z value2 = this.f122487d.mo63404K().f122463h.getValue();
                if (value2 == null) {
                    Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, pageMode is null");
                    return;
                }
                C45168h0.C45170b bVar = (C45168h0.C45170b) h0Var;
                Button button = bVar.f122475z;
                if (button != null) {
                    int ordinal2 = value2.ordinal();
                    if (ordinal2 == 0) {
                        i2 = C0966R.string.a9_;
                    } else if (ordinal2 == 1) {
                        i2 = C0966R.string.a9a;
                    } else {
                        throw new C13603j();
                    }
                    button.setText(i2);
                }
                Button button2 = bVar.f122475z;
                if (button2 != null) {
                    button2.setOnClickListener(new C45196w(this));
                }
                Boolean bool = this.f122490g;
                if (!this.f122491h && bool != null) {
                    if (bool.booleanValue()) {
                        h0Var.f44854d.post(new C45197x(h0Var, this));
                    } else {
                        Button button3 = bVar.f122475z;
                        if (button3 != null) {
                            button3.setVisibility(0);
                        }
                    }
                    this.f122491h = true;
                }
            }
        } catch (Exception unused) {
            Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, position: " + i + ", flattenedItem is null");
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 0) {
            return new C45168h0.C45169a(viewGroup);
        }
        if (i == 1) {
            return new C45168h0.C45172d(viewGroup);
        }
        if (i == 2) {
            return new C45168h0.C45171c(viewGroup);
        }
        if (i == 3) {
            return new C45168h0.C45170b(viewGroup);
        }
        Log.m105928w("MicroMsg.AppBrandUserInfoRevokePage", "onCreateViewHolder, viewType: " + i + ", are you kidding me?");
        return new C45168h0.C45172d(viewGroup);
    }
}
