package ow1;

import android.content.res.Resources;
import android.widget.ImageButton;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.C94061h;
import com.tencent.p014mm.plugin.gallery.p473ui.C94070m;
import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: ow1.t */
public class C100586t implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public final /* synthetic */ ImagePreviewUI f294722d;

    public C100586t(ImagePreviewUI imagePreviewUI) {
        this.f294722d = imagePreviewUI;
    }

    public void onPageScrollStateChanged(int i) {
        C94061h hVar = this.f294722d.f271409e;
        if (hVar != null) {
            C100577n nVar = hVar.f271588w;
            nVar.f294680f = i;
            if (i == 0) {
                int size = nVar.f294679e.size();
                int[] iArr = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr[i2] = nVar.f294679e.keyAt(i2);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    int i4 = iArr[i3];
                    nVar.mo140041a(i4, nVar.f294679e.get(i4));
                }
            }
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        int i2;
        Resources resources;
        C93958f.m118749i().f271162h.put(Integer.valueOf(i), Boolean.TRUE);
        String j = this.f294722d.f271409e.mo129062j(i);
        ImagePreviewUI imagePreviewUI = this.f294722d;
        if (j == null) {
            imagePreviewUI.getClass();
        } else {
            C94070m mVar = (C94070m) imagePreviewUI.f271411f.getAdapter();
            if (!imagePreviewUI.f271419o) {
                Log.m105925i("MicroMsg.ImagePreviewUI", "[notifyRecycleViewWhenPageSelected] :%s %s", Integer.valueOf(i), imagePreviewUI.f271418n);
                mVar.f271620s = i;
                mVar.f271619r = i;
                mVar.notifyItemChanged(imagePreviewUI.f271418n.intValue(), new Object());
                mVar.notifyItemChanged(i, new Object());
                imagePreviewUI.f271411f.postDelayed(new C100588v(imagePreviewUI, i), 66);
            } else {
                int indexOf = imagePreviewUI.f271416i.contains(j) ? imagePreviewUI.f271416i.indexOf(j) : -1;
                Log.m105925i("MicroMsg.ImagePreviewUI", "[notifyRecycleViewWhenPageSelected] :%s indexInBar:%s %s", Integer.valueOf(i), Integer.valueOf(indexOf), Boolean.valueOf(imagePreviewUI.f271419o));
                mVar.f271620s = indexOf;
                mVar.f271619r = i;
                mVar.notifyDataSetChanged();
                if (indexOf != -1) {
                    imagePreviewUI.f271411f.postDelayed(new C100589w(imagePreviewUI, indexOf), 66);
                }
            }
        }
        boolean contains = this.f294722d.f271416i.contains(j);
        this.f294722d.f271418n = Integer.valueOf(i);
        ImagePreviewUI imagePreviewUI2 = this.f294722d;
        imagePreviewUI2.f271370B.setImageResource(contains ? imagePreviewUI2.mo128986K7() : C0966R.raw.radio_off);
        ImagePreviewUI imagePreviewUI3 = this.f294722d;
        ImageButton imageButton = imagePreviewUI3.f271370B;
        if (contains) {
            resources = imagePreviewUI3.getResources();
            i2 = C0966R.string.f4n;
        } else {
            resources = imagePreviewUI3.getResources();
            i2 = C0966R.string.f4p;
        }
        imageButton.setContentDescription(resources.getString(i2));
        ImagePreviewUI imagePreviewUI4 = this.f294722d;
        if (imagePreviewUI4.f271420p) {
            imagePreviewUI4.f271425t.setImageResource(C0966R.raw.radio_on);
            ImagePreviewUI imagePreviewUI5 = this.f294722d;
            imagePreviewUI5.f271425t.setContentDescription(imagePreviewUI5.getResources().getString(C0966R.string.f4o));
        } else {
            imagePreviewUI4.f271425t.setImageResource(C0966R.raw.radio_off);
            ImagePreviewUI imagePreviewUI6 = this.f294722d;
            imagePreviewUI6.f271425t.setContentDescription(imagePreviewUI6.getResources().getString(C0966R.string.f4q));
        }
        ImagePreviewUI imagePreviewUI7 = this.f294722d;
        if (imagePreviewUI7.f271424s) {
            imagePreviewUI7.f271425t.setImageResource(C0966R.raw.radio_default_on);
        }
        ImagePreviewUI imagePreviewUI8 = this.f294722d;
        imagePreviewUI8.f271425t.setEnabled(!imagePreviewUI8.f271424s);
        ImagePreviewUI imagePreviewUI9 = this.f294722d;
        imagePreviewUI9.f271426u.setEnabled(!imagePreviewUI9.f271424s);
        ImagePreviewUI imagePreviewUI10 = this.f294722d;
        imagePreviewUI10.setMMTitle((i + 1) + "/" + this.f294722d.f271409e.getCount());
        C100581p pVar = this.f294722d.f271409e.f271587v;
        int i3 = pVar.f294691a;
        if (i3 == -1) {
            int i4 = 0;
            while (true) {
                if (i4 != 0) {
                    int i5 = i + i4;
                    int i6 = i + 3;
                    if (i5 > i6 && i - i4 < Math.max(i - 3, 0)) {
                        break;
                    }
                    if (i5 <= i6) {
                        pVar.mo140045a(i5);
                    }
                    int i7 = i - i4;
                    if (i7 >= Math.max(i - 3, 0)) {
                        pVar.mo140045a(i7);
                    }
                } else {
                    pVar.mo140045a(i);
                }
                i4++;
            }
        } else if (i3 > i) {
            pVar.mo140045a(Math.max(i - 3, 0));
        } else if (i3 < i) {
            pVar.mo140045a(i + 3);
        }
        pVar.f294691a = i;
        Log.m105918d("MicroMsg.ImagePreviewUI", "onItemSelected, pos = " + i);
        GalleryItem$MediaItem e = C93958f.m118745e(j);
        if (this.f294722d.f271373E.getVisibility() == 0 || this.f294722d.f271374F.getVisibility() == 0) {
            this.f294722d.mo128999X7(j, e);
            this.f294722d.mo128983H7(false);
            this.f294722d.mo129007f8(e);
        }
        this.f294722d.mo128995T7(e);
        this.f294722d.f271409e.mo129067o();
    }
}
