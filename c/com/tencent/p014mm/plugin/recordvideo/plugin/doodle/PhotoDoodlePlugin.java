package com.tencent.p014mm.plugin.recordvideo.plugin.doodle;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import gy3.C87412m;
import java.util.ArrayList;
import kg3.C76577a;
import kotlin.Metadata;
import lh2.C109344g0;
import nh2.C109741a;
import nh2.C109747c;
import nh2.C109748d;
import qh2.C101198e;
import sx3.C64197v;
import vg2.C78414c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002=>B\u0019\u0012\u0006\u00108\u001a\u000207\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016R*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0004X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020\u00038\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u00103\u001a\u00020\u00038\u0004XD¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-R\u001a\u00106\u001a\u00020\u00038\u0004XD¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-¨\u0006?"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin;", "Landroid/widget/RelativeLayout;", "Llh2/g0;", "", "getLayout", "Lqh2/e;", "status", "Lrx3/b0;", "setStatus", "visibility", "setVisibility", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/recordvideo/plugin/doodle/PhotoDoodlePlugin$a;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "getResourceArray", "()Ljava/util/ArrayList;", "resourceArray", "e", "Lqh2/e;", "getMStatus", "()Lqh2/e;", "setMStatus", "(Lqh2/e;)V", "mStatus", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "getUnDoImageView", "()Landroid/widget/ImageView;", "setUnDoImageView", "(Landroid/widget/ImageView;)V", "unDoImageView", "Landroid/widget/GridView;", "g", "Landroid/widget/GridView;", "getColorList", "()Landroid/widget/GridView;", "setColorList", "(Landroid/widget/GridView;)V", "colorList", "h", "I", "getSelectType", "()I", "setSelectType", "(I)V", "selectType", "i", "getImageSizeDP", "imageSizeDP", "j", "getPaddingDp", "paddingDp", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin */
public class PhotoDoodlePlugin extends RelativeLayout implements C109344g0 {

    /* renamed from: d */
    public final ArrayList<C105942a> f315279d;

    /* renamed from: e */
    public C101198e f315280e;

    /* renamed from: f */
    public ImageView f315281f;

    /* renamed from: g */
    public GridView f315282g;

    /* renamed from: h */
    public int f315283h = 2;

    /* renamed from: i */
    public final int f315284i = 34;

    /* renamed from: j */
    public final int f315285j = 6;

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin$a */
    public static final class C105942a {

        /* renamed from: a */
        public Bitmap f315286a;

        /* renamed from: b */
        public int f315287b;

        /* renamed from: c */
        public int f315288c;
    }

    /* renamed from: com.tencent.mm.plugin.recordvideo.plugin.doodle.PhotoDoodlePlugin$b */
    public final class C105943b extends BaseAdapter {

        /* renamed from: d */
        public ArrayList<C105942a> f315289d;

        /* renamed from: e */
        public final /* synthetic */ PhotoDoodlePlugin f315290e;

        public C105943b(PhotoDoodlePlugin photoDoodlePlugin, ArrayList<C105942a> arrayList) {
            C87412m.m108594g(arrayList, "resourceArray");
            this.f315290e = photoDoodlePlugin;
            this.f315289d = arrayList;
        }

        public int getCount() {
            return this.f315289d.size();
        }

        public Object getItem(int i) {
            C105942a aVar = this.f315289d.get(i);
            C87412m.m108593f(aVar, "resourceArray[position]");
            return aVar;
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C87412m.m108591d(viewGroup);
            Context context = viewGroup.getContext();
            C87412m.m108593f(context, "parent!!.context");
            Context context2 = null;
            C109741a aVar = new C109741a(context, (AttributeSet) null, false);
            C105942a aVar2 = (C105942a) getItem(i);
            Bitmap bitmap = aVar2.f315286a;
            if (bitmap == null) {
                aVar.setDrawColor(aVar2.f315287b);
                C78414c.f229758a.mo108365b(aVar, aVar2.f315287b);
            } else {
                C87412m.m108591d(bitmap);
                aVar.setBitmap(bitmap);
                C78414c.f229758a.mo108365b(aVar, aVar2.f315288c);
            }
            aVar.setType(aVar2.f315288c);
            aVar.setBgPadding(this.f315290e.getPaddingDp());
            GridView colorList = this.f315290e.getColorList();
            if (colorList != null) {
                context2 = colorList.getContext();
            }
            int b = C76577a.m92151b(context2, this.f315290e.getImageSizeDP());
            aVar.setLayoutParams(new AbsListView.LayoutParams(b, b));
            if (aVar.getType() == this.f315290e.getSelectType()) {
                aVar.setHasSelected(true);
            } else {
                aVar.setHasSelected(false);
            }
            return aVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhotoDoodlePlugin(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        ArrayList<C105942a> arrayList = new ArrayList<>();
        this.f315279d = arrayList;
        LayoutInflater.from(getContext()).inflate(getLayout(), this, true);
        ImageView imageView = (ImageView) findViewById(C0966R.C0970id.if9);
        this.f315281f = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(C74933u4.m89768e(getContext(), C0966R.raw.icons_filled_previous, -1));
        }
        ImageView imageView2 = this.f315281f;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C109747c(this));
        }
        this.f315282g = (GridView) findViewById(C0966R.C0970id.bio);
        mo151180a(BitmapFactory.decodeResource(getContext().getResources(), C0966R.C0969drawable.c3w), BitmapFactory.decodeResource(getContext().getResources(), C0966R.C0969drawable.c3t));
        GridView gridView = this.f315282g;
        if (gridView != null) {
            gridView.setAdapter(new C105943b(this, arrayList));
        }
        GridView gridView2 = this.f315282g;
        if (gridView2 != null) {
            gridView2.setOnItemClickListener(new C109748d(this));
        }
    }

    /* renamed from: a */
    public final void mo151180a(Bitmap bitmap, Bitmap bitmap2) {
        this.f315279d.clear();
        if (bitmap != null) {
            ArrayList<C105942a> arrayList = this.f315279d;
            C105942a aVar = new C105942a();
            aVar.f315286a = bitmap;
            aVar.f315288c = 99;
            arrayList.add(aVar);
        }
        if (bitmap2 != null) {
            ArrayList<C105942a> arrayList2 = this.f315279d;
            C105942a aVar2 = new C105942a();
            aVar2.f315286a = bitmap2;
            aVar2.f315288c = 100;
            arrayList2.add(aVar2);
        }
        ArrayList<C105942a> arrayList3 = this.f315279d;
        C105942a aVar3 = new C105942a();
        aVar3.f315287b = -1;
        aVar3.f315288c = 0;
        arrayList3.add(aVar3);
        ArrayList<C105942a> arrayList4 = this.f315279d;
        C105942a aVar4 = new C105942a();
        aVar4.f315287b = -16777216;
        aVar4.f315288c = 1;
        arrayList4.add(aVar4);
        ArrayList<C105942a> arrayList5 = this.f315279d;
        C105942a aVar5 = new C105942a();
        aVar5.f315287b = -707825;
        aVar5.f315288c = 2;
        arrayList5.add(aVar5);
        ArrayList<C105942a> arrayList6 = this.f315279d;
        C105942a aVar6 = new C105942a();
        aVar6.f315287b = -17592;
        aVar6.f315288c = 3;
        arrayList6.add(aVar6);
        ArrayList<C105942a> arrayList7 = this.f315279d;
        C105942a aVar7 = new C105942a();
        aVar7.f315287b = -16535286;
        aVar7.f315288c = 4;
        arrayList7.add(aVar7);
        ArrayList<C105942a> arrayList8 = this.f315279d;
        C105942a aVar8 = new C105942a();
        aVar8.f315287b = -15172610;
        aVar8.f315288c = 5;
        arrayList8.add(aVar8);
        ArrayList<C105942a> arrayList9 = this.f315279d;
        C105942a aVar9 = new C105942a();
        aVar9.f315287b = -7054596;
        aVar9.f315288c = 6;
        arrayList9.add(aVar9);
    }

    /* renamed from: b */
    public final void mo151181b(int i) {
        if (i == 99) {
            C101198e eVar = this.f315280e;
            if (eVar != null) {
                C101198e.C62622a.m73576a(eVar, C101198e.C101199b.EDIT_PHOTO_DOODLE_MSC, (Bundle) null, 2, (Object) null);
            }
        } else if (i != 100) {
            Bundle bundle = new Bundle();
            bundle.putInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT", i);
            C101198e eVar2 = this.f315280e;
            if (eVar2 != null) {
                eVar2.mo14585p(C101198e.C101199b.EDIT_PHOTO_DOODLE_PENCIL, bundle);
            }
        } else {
            C101198e eVar3 = this.f315280e;
            if (eVar3 != null) {
                C101198e.C62622a.m73576a(eVar3, C101198e.C101199b.EDIT_PHOTO_DOODLE_BRUSH, (Bundle) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: e */
    public boolean mo78564e() {
        if (getVisibility() != 0) {
            return false;
        }
        setVisibility(4);
        return true;
    }

    public final GridView getColorList() {
        return this.f315282g;
    }

    public final int getImageSizeDP() {
        return this.f315284i;
    }

    public final int getLayout() {
        return C0966R.C0971layout.bmv;
    }

    public final C101198e getMStatus() {
        return this.f315280e;
    }

    public final int getPaddingDp() {
        return this.f315285j;
    }

    public final ArrayList<C105942a> getResourceArray() {
        return this.f315279d;
    }

    public final int getSelectType() {
        return this.f315283h;
    }

    public final ImageView getUnDoImageView() {
        return this.f315281f;
    }

    public String name() {
        return getClass().getName();
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

    public final void setColorList(GridView gridView) {
        this.f315282g = gridView;
    }

    public final void setMStatus(C101198e eVar) {
        this.f315280e = eVar;
    }

    public final void setSelectType(int i) {
        this.f315283h = i;
    }

    public final void setStatus(C101198e eVar) {
        C87412m.m108594g(eVar, "status");
        this.f315280e = eVar;
    }

    public final void setUnDoImageView(ImageView imageView) {
        this.f315281f = imageView;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            int i2 = 0;
            for (T next : this.f315279d) {
                int i3 = i2 + 1;
                View view = null;
                if (i2 >= 0) {
                    C105942a aVar = (C105942a) next;
                    GridView gridView = this.f315282g;
                    if ((gridView != null ? gridView.getChildAt(i2) : null) != null) {
                        GridView gridView2 = this.f315282g;
                        View childAt = gridView2 != null ? gridView2.getChildAt(i2) : null;
                        C87412m.m108592e(childAt, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                        if (((C109741a) childAt).getType() != this.f315283h) {
                            GridView gridView3 = this.f315282g;
                            if (gridView3 != null) {
                                view = gridView3.getChildAt(i2);
                            }
                            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                            ((C109741a) view).setHasSelected(false);
                        } else {
                            GridView gridView4 = this.f315282g;
                            if (gridView4 != null) {
                                view = gridView4.getChildAt(i2);
                            }
                            C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.plugin.doodle.ClickBigImageView");
                            ((C109741a) view).setHasSelected(true);
                        }
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            mo151181b(this.f315283h);
        }
        GridView gridView5 = this.f315282g;
        if (gridView5 != null) {
            gridView5.setVisibility(i);
        }
        ImageView imageView = this.f315281f;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    /* renamed from: v */
    public void mo78575v(RecordConfigProvider recordConfigProvider) {
        C87412m.m108594g(recordConfigProvider, "configProvider");
    }
}
