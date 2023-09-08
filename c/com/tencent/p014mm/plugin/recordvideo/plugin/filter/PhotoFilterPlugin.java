package com.tencent.p014mm.plugin.recordvideo.plugin.filter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.Metadata;
import lh2.C109344g0;
import qh2.C101198e;
import rx3.C13598b0;
import z10.C112558a;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001GB\u0019\u0012\u0006\u0010B\u001a\u00020A\u0012\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\bE\u0010FJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0006XD¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00102\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R.\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u000204038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010@\u001a\u0002048\u0006XD¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006H"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin;", "Landroid/widget/RelativeLayout;", "Llh2/g0;", "Lqh2/e;", "status", "Lrx3/b0;", "setStatus", "Landroid/graphics/Bitmap;", "bitmap", "setPreImage", "", "visibility", "setVisibility", "", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "", "Lcom/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$b;", "f", "Ljava/util/List;", "getItemViews", "()Ljava/util/List;", "itemViews", "Landroid/view/ViewGroup;", "g", "Landroid/view/ViewGroup;", "getSeekBarLayout", "()Landroid/view/ViewGroup;", "seekBarLayout", "Landroid/widget/SeekBar;", "h", "Landroid/widget/SeekBar;", "getSeekBar", "()Landroid/widget/SeekBar;", "seekBar", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "getProgressDescTv", "()Landroid/widget/TextView;", "progressDescTv", "j", "I", "getLastSelectedIndex", "()I", "setLastSelectedIndex", "(I)V", "lastSelectedIndex", "", "", "n", "Ljava/util/Map;", "getWeightMap", "()Ljava/util/Map;", "setWeightMap", "(Ljava/util/Map;)V", "weightMap", "o", "F", "getDefaultWeight", "()F", "defaultWeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "b", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin */
public final class PhotoFilterPlugin extends RelativeLayout implements C109344g0 {

    /* renamed from: d */
    public final String f315291d = "MicroMsg.PhotoFilterPlugin";

    /* renamed from: e */
    public C101198e f315292e;

    /* renamed from: f */
    public final List<C105945b> f315293f = new ArrayList();

    /* renamed from: g */
    public final ViewGroup f315294g;

    /* renamed from: h */
    public final SeekBar f315295h;

    /* renamed from: i */
    public final TextView f315296i;

    /* renamed from: j */
    public int f315297j;

    /* renamed from: n */
    public Map<Integer, Float> f315298n = new LinkedHashMap();

    /* renamed from: o */
    public final float f315299o = 0.8f;

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin$a */
    public static final class C105944a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: d */
        public final /* synthetic */ PhotoFilterPlugin f315300d;

        public C105944a(PhotoFilterPlugin photoFilterPlugin) {
            this.f315300d = photoFilterPlugin;
        }

        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            String tag = this.f315300d.getTAG();
            Log.m105918d(tag, "onProgressChanged " + i);
            TextView progressDescTv = this.f315300d.getProgressDescTv();
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('%');
            progressDescTv.setText(sb.toString());
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            PhotoFilterPlugin photoFilterPlugin = this.f315300d;
            int lastSelectedIndex = photoFilterPlugin.getLastSelectedIndex();
            C87412m.m108591d(seekBar);
            PhotoFilterPlugin.m142478a(photoFilterPlugin, lastSelectedIndex, ((float) seekBar.getProgress()) / 100.0f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin$b */
    public static final class C105945b {

        /* renamed from: a */
        public final View f315301a;

        /* renamed from: b */
        public final int f315302b;

        /* renamed from: c */
        public final C32226l<Integer, C13598b0> f315303c;

        /* renamed from: d */
        public final ImageView f315304d;

        /* renamed from: e */
        public final View f315305e;

        /* renamed from: f */
        public boolean f315306f;

        /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin$b$a */
        public static final class C105946a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C105945b f315307d;

            public C105946a(C105945b bVar) {
                this.f315307d = bVar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                this.f315307d.mo151214a();
                C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C105945b(View view, int i, String str, C32226l<? super Integer, C13598b0> lVar) {
            C87412m.m108594g(view, "effectLayout");
            C87412m.m108594g(str, "effectName");
            C87412m.m108594g(lVar, "onSelect");
            this.f315301a = view;
            this.f315302b = i;
            this.f315303c = lVar;
            View findViewById = view.findViewById(C0966R.C0970id.hvx);
            C87412m.m108593f(findViewById, "effectLayout.findViewById(R.id.photo_effect_iv)");
            this.f315304d = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.hvz);
            C87412m.m108593f(findViewById2, "effectLayout.findViewById(R.id.photo_effect_mask)");
            this.f315305e = findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.f358923hw0);
            C87412m.m108593f(findViewById3, "effectLayout.findViewByI….id.photo_effect_name_tv)");
            view.setOnClickListener(new C105946a(this));
            ((TextView) findViewById3).setText(str);
        }

        /* renamed from: a */
        public final void mo151214a() {
            View view = this.f315305e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "selected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "selected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f315303c.invoke(Integer.valueOf(this.f315302b));
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin$c */
    public static final class C105947c extends C87413o implements C32226l<Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ PhotoFilterPlugin f315308d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105947c(PhotoFilterPlugin photoFilterPlugin) {
            super(1);
            this.f315308d = photoFilterPlugin;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            String tag = this.f315308d.getTAG();
            Log.m105924i(tag, "onSelect " + intValue);
            if (intValue == 0) {
                this.f315308d.getSeekBarLayout().setVisibility(4);
            } else {
                this.f315308d.getSeekBarLayout().setVisibility(0);
            }
            Float valueOf = this.f315308d.getWeightMap().containsKey(Integer.valueOf(intValue)) ? this.f315308d.getWeightMap().get(Integer.valueOf(intValue)) : Float.valueOf(this.f315308d.getDefaultWeight());
            SeekBar seekBar = this.f315308d.getSeekBar();
            C87412m.m108591d(valueOf);
            seekBar.setProgress((int) (valueOf.floatValue() * ((float) 100)));
            PhotoFilterPlugin.m142478a(this.f315308d, intValue, valueOf.floatValue());
            for (C105945b bVar : this.f315308d.getItemViews()) {
                if (bVar.f315302b != intValue) {
                    View view = bVar.f315305e;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "unselected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/recordvideo/plugin/filter/PhotoFilterPlugin$ViewHolder", "unselected", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin$d */
    public static final class C105948d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ PhotoFilterPlugin f315309d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f315310e;

        /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.filter.PhotoFilterPlugin$d$a */
        public static final class C105949a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C105945b f315311d;

            /* renamed from: e */
            public final /* synthetic */ Bitmap f315312e;

            public C105949a(C105945b bVar, Bitmap bitmap) {
                this.f315311d = bVar;
                this.f315312e = bitmap;
            }

            public final void run() {
                C105945b bVar = this.f315311d;
                Bitmap bitmap = this.f315312e;
                bVar.getClass();
                C87412m.m108594g(bitmap, "bitmap");
                bVar.f315304d.setImageBitmap(bitmap);
                bVar.f315306f = true;
            }
        }

        public C105948d(PhotoFilterPlugin photoFilterPlugin, Bitmap bitmap) {
            this.f315309d = photoFilterPlugin;
            this.f315310e = bitmap;
        }

        public final void run() {
            List<C105945b> itemViews = this.f315309d.getItemViews();
            Bitmap bitmap = this.f315310e;
            PhotoFilterPlugin photoFilterPlugin = this.f315309d;
            for (C105945b bVar : itemViews) {
                if (!bVar.f315306f) {
                    C112558a aVar = C112558a.f336997a;
                    aVar.mo164290d(bitmap);
                    int f = C76577a.m92155f(photoFilterPlugin.getContext(), C0966R.dimen.f3761db);
                    int f2 = C76577a.m92155f(photoFilterPlugin.getContext(), C0966R.dimen.f3761db);
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        f = (int) ((((float) bitmap.getWidth()) / ((float) bitmap.getHeight())) * ((float) f2));
                    } else if (bitmap.getWidth() < bitmap.getHeight()) {
                        f2 = (int) ((((float) bitmap.getHeight()) / ((float) bitmap.getWidth())) * ((float) f));
                    }
                    int i = f2;
                    Bitmap bitmap2 = bitmap;
                    photoFilterPlugin.post(new C105949a(bVar, aVar.mo164288b(bitmap2, bVar.f315302b, f, i, photoFilterPlugin.getDefaultWeight())));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhotoFilterPlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        LayoutInflater.from(context).inflate(C0966R.C0971layout.bmy, this, true);
        View findViewById = findViewById(C0966R.C0970id.j8v);
        C87412m.m108593f(findViewById, "findViewById(R.id.seekbar_layout)");
        this.f315294g = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.f358028d31);
        C87412m.m108593f(findViewById2, "findViewById(R.id.filter_seek_bar)");
        SeekBar seekBar = (SeekBar) findViewById2;
        this.f315295h = seekBar;
        View findViewById3 = findViewById(C0966R.C0970id.f358029d32);
        C87412m.m108593f(findViewById3, "findViewById(R.id.filter_seek_bar_desc)");
        this.f315296i = (TextView) findViewById3;
        C105947c cVar = new C105947c(this);
        seekBar.setOnSeekBarChangeListener(new C105944a(this));
        LinearLayout linearLayout = (LinearLayout) findViewById(C0966R.C0970id.hvy);
        C112558a aVar = C112558a.f336997a;
        for (C112558a.C112559a aVar2 : C112558a.f336998b) {
            View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.bmx, linearLayout, false);
            linearLayout.addView(inflate);
            List<C105945b> list = this.f315293f;
            C87412m.m108593f(inflate, "itemView");
            list.add(new C105945b(inflate, aVar2.f337001a, aVar2.f337002b, cVar));
        }
    }

    /* renamed from: a */
    public static final void m142478a(PhotoFilterPlugin photoFilterPlugin, int i, float f) {
        String str = photoFilterPlugin.f315291d;
        Log.m105924i(str, "postFuncType " + i + ", " + f);
        photoFilterPlugin.f315297j = i;
        photoFilterPlugin.f315298n.put(Integer.valueOf(i), Float.valueOf(f));
        Bundle bundle = new Bundle();
        bundle.putInt("EDIT_FILTER_INDEX_INT", i);
        bundle.putFloat("EDIT_FILTER_COLOR_WEIGHT_FLOAT", f);
        C101198e eVar = photoFilterPlugin.f315292e;
        if (eVar != null) {
            eVar.mo14585p(C101198e.C101199b.EDIT_PHOTO_FILTER_ENTER, bundle);
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (getVisibility() != 0) {
            return false;
        }
        setVisibility(8);
        return true;
    }

    public final float getDefaultWeight() {
        return this.f315299o;
    }

    public final List<C105945b> getItemViews() {
        return this.f315293f;
    }

    public final int getLastSelectedIndex() {
        return this.f315297j;
    }

    public final TextView getProgressDescTv() {
        return this.f315296i;
    }

    public final SeekBar getSeekBar() {
        return this.f315295h;
    }

    public final ViewGroup getSeekBarLayout() {
        return this.f315294g;
    }

    public final String getTAG() {
        return this.f315291d;
    }

    public final Map<Integer, Float> getWeightMap() {
        return this.f315298n;
    }

    public String name() {
        return PhotoFilterPlugin.class.getName();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttach() {
    }

    public void onDetach() {
    }

    public void onPause() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C109344g0.C61280a.m71860a(this, i, strArr, iArr);
    }

    public void onResume() {
    }

    public void release() {
    }

    public void reset() {
    }

    public final void setLastSelectedIndex(int i) {
        this.f315297j = i;
    }

    public final void setPreImage(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        ((C119157j) C119157j.f356862d).mo183875f(new C105948d(this, bitmap));
    }

    public final void setStatus(C101198e eVar) {
        C87412m.m108594g(eVar, "status");
        this.f315292e = eVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            ((C105945b) ((ArrayList) this.f315293f).get(this.f315297j)).mo151214a();
        }
    }

    public final void setWeightMap(Map<Integer, Float> map) {
        C87412m.m108594g(map, "<set-?>");
        this.f315298n = map;
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
