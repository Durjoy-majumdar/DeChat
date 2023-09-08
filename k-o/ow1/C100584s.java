package ow1;

import android.content.Intent;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.gallery.model.C93951d;
import com.tencent.p014mm.plugin.gallery.model.C93958f;
import com.tencent.p014mm.plugin.gallery.model.C93974o;
import com.tencent.p014mm.plugin.gallery.model.GalleryItem$MediaItem;
import com.tencent.p014mm.plugin.gallery.p473ui.C94070m;
import com.tencent.p014mm.plugin.gallery.p473ui.ImagePreviewUI;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import hd0.C98429r0;
import java.util.ArrayList;
import qw1.C101316l;

/* renamed from: ow1.s */
public class C100584s implements C93951d.C93956e {

    /* renamed from: a */
    public final /* synthetic */ Intent f294717a;

    /* renamed from: b */
    public final /* synthetic */ String f294718b;

    /* renamed from: c */
    public final /* synthetic */ ImagePreviewUI f294719c;

    /* renamed from: ow1.s$a */
    public class C100585a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f294720d;

        public C100585a(String str) {
            this.f294720d = str;
        }

        public void run() {
            ImagePreviewUI imagePreviewUI;
            int i;
            ImagePreviewUI imagePreviewUI2 = C100584s.this.f294719c;
            imagePreviewUI2.f271409e.mo129065m(imagePreviewUI2.f271413g);
            C94070m mVar = (C94070m) C100584s.this.f294719c.f271411f.getAdapter();
            ArrayList<String> arrayList = C100584s.this.f294719c.f271413g;
            mVar.f271612h.clear();
            mVar.f271612h.addAll(arrayList);
            mVar.notifyDataSetChanged();
            ArrayList<String> stringArrayListExtra = C100584s.this.f294717a.getStringArrayListExtra("preview_select_image_list");
            C100584s.this.f294719c.f271416i.clear();
            if (stringArrayListExtra != null) {
                C100584s.this.f294719c.f271416i.addAll(stringArrayListExtra);
            }
            ImagePreviewUI imagePreviewUI3 = C100584s.this.f294719c;
            imagePreviewUI3.updateOptionMenuText(0, imagePreviewUI3.mo128989N7());
            ImagePreviewUI imagePreviewUI4 = C100584s.this.f294719c;
            imagePreviewUI4.f271426u.setText(imagePreviewUI4.getContext().getString(C0966R.string.f5p));
            int i2 = 8;
            if (!C98429r0.m127830u() || (!((i = imagePreviewUI.f271378J) == 3 || i == 16) || !(imagePreviewUI = C100584s.this.f294719c).f271420p)) {
                C100584s.this.f294719c.f271427v.setVisibility(8);
            } else {
                String L7 = imagePreviewUI.mo128987L7();
                TextView textView = C100584s.this.f294719c.f271427v;
                if (!Util.isNullOrNil(L7)) {
                    i2 = 0;
                }
                textView.setVisibility(i2);
                ImagePreviewUI imagePreviewUI5 = C100584s.this.f294719c;
                imagePreviewUI5.f271427v.setText(imagePreviewUI5.getString(C0966R.string.luu, new Object[]{L7}));
            }
            if (!C100584s.this.f294719c.f271416i.contains(C101316l.m132907f(this.f294720d))) {
                C100584s.this.f294719c.f271370B.performClick();
                return;
            }
            String stringExtra = C100584s.this.f294719c.getIntent().getStringExtra("GalleryUI_ToUser");
            ImagePreviewUI imagePreviewUI6 = C100584s.this.f294719c;
            GalleryItem$MediaItem k = imagePreviewUI6.f271409e.mo129063k(imagePreviewUI6.f271418n.intValue());
            if (k != null) {
                ImagePreviewUI imagePreviewUI7 = C100584s.this.f294719c;
                C101316l.m132911j(imagePreviewUI7, k.f162751h, k.f162747d, stringExtra, imagePreviewUI7.f271377I || !imagePreviewUI7.f271420p, 0, true);
            }
        }
    }

    public C100584s(ImagePreviewUI imagePreviewUI, Intent intent, String str) {
        this.f294719c = imagePreviewUI;
        this.f294717a = intent;
        this.f294718b = str;
    }

    /* renamed from: a */
    public String mo128887a() {
        return C101316l.m132905d(this.f294718b, (C93974o.C93980f) null, -1);
    }

    /* renamed from: b */
    public void mo128888b(String str) {
        new MMHandler(this.f294719c.getMainLooper()).post(new C100585a(str));
        C93958f.m118747g().mo128878f(this);
    }

    public String toString() {
        return "fileKey:" + this.f294718b + " this: " + super.toString();
    }
}
